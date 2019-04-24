package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0642 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0642";
    public static final String myFingerPrint = "e1bd165566f13955a837de46747500aade90ec188b9c0e484d05358334a656dd";
    public static SubLSymbol $g4966$;
    public static SubLSymbol $g4967$;
    public static SubLSymbol $g4968$;
    private static SubLSymbol $g4969$;
    private static SubLSymbol $g4970$;
    public static SubLSymbol $g4971$;
    private static SubLSymbol $g4972$;
    public static SubLSymbol $g4973$;
    public static SubLSymbol $g4974$;
    public static SubLSymbol $g4975$;
    public static SubLSymbol $g4976$;
    private static SubLSymbol $g4977$;
    private static SubLSymbol $g4978$;
    private static SubLSymbol $g4979$;
    public static SubLSymbol $g4980$;
    private static SubLSymbol $g4981$;
    private static SubLSymbol $g4982$;
    private static SubLSymbol $g4983$;
    private static SubLSymbol $g4984$;
    private static SubLSymbol $g4985$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLList $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLList $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLList $ic105$;
    private static final SubLList $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLInteger $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLList $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLInteger $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLList $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLList $ic163$;
    private static final SubLList $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLString $ic178$;
    private static final SubLObject $ic179$;
    private static final SubLString $ic180$;
    private static final SubLObject $ic181$;
    private static final SubLString $ic182$;
    private static final SubLObject $ic183$;
    private static final SubLString $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLObject $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLString $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLString $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLString $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLString $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLString $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLString $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLString $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLString $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLString $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLString $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLString $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLString $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLString $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLString $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLString $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLString $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLString $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLString $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLString $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLString $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLString $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLString $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLString $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLString $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLString $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLString $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLString $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLString $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLString $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLString $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLString $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLString $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLString $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLString $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLString $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLString $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLString $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLString $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLString $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLString $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLString $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLString $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLString $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLString $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLString $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLString $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLString $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLString $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLString $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLString $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLString $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLString $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLString $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLString $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLString $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLString $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLString $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLString $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLString $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLString $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLString $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLString $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLString $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLString $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLString $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLString $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLString $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLString $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLString $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLString $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLString $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLString $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLString $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLString $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLString $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLString $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLString $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLString $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLString $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLString $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLString $ic375$;
    private static final SubLSymbol $ic376$;
    private static final SubLString $ic377$;
    private static final SubLSymbol $ic378$;
    private static final SubLString $ic379$;
    private static final SubLSymbol $ic380$;
    private static final SubLString $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLString $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLString $ic385$;
    private static final SubLSymbol $ic386$;
    private static final SubLString $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLString $ic389$;
    private static final SubLSymbol $ic390$;
    private static final SubLString $ic391$;
    private static final SubLSymbol $ic392$;
    private static final SubLString $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLString $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLString $ic397$;
    private static final SubLSymbol $ic398$;
    private static final SubLString $ic399$;
    private static final SubLSymbol $ic400$;
    private static final SubLString $ic401$;
    private static final SubLSymbol $ic402$;
    private static final SubLString $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLString $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLString $ic407$;
    private static final SubLSymbol $ic408$;
    private static final SubLString $ic409$;
    private static final SubLSymbol $ic410$;
    private static final SubLString $ic411$;
    private static final SubLSymbol $ic412$;
    private static final SubLString $ic413$;
    private static final SubLSymbol $ic414$;
    private static final SubLString $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLString $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLString $ic419$;
    private static final SubLSymbol $ic420$;
    private static final SubLString $ic421$;
    private static final SubLSymbol $ic422$;
    private static final SubLString $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLString $ic425$;
    private static final SubLSymbol $ic426$;
    private static final SubLString $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLString $ic429$;
    private static final SubLSymbol $ic430$;
    private static final SubLString $ic431$;
    private static final SubLSymbol $ic432$;
    private static final SubLString $ic433$;
    private static final SubLSymbol $ic434$;
    private static final SubLString $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLString $ic437$;
    private static final SubLSymbol $ic438$;
    private static final SubLString $ic439$;
    private static final SubLSymbol $ic440$;
    private static final SubLString $ic441$;
    private static final SubLSymbol $ic442$;
    private static final SubLString $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLString $ic445$;
    private static final SubLSymbol $ic446$;
    private static final SubLString $ic447$;
    private static final SubLSymbol $ic448$;
    private static final SubLString $ic449$;
    private static final SubLSymbol $ic450$;
    private static final SubLString $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLString $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLString $ic455$;
    private static final SubLSymbol $ic456$;
    private static final SubLString $ic457$;
    private static final SubLSymbol $ic458$;
    private static final SubLString $ic459$;
    private static final SubLSymbol $ic460$;
    private static final SubLString $ic461$;
    private static final SubLSymbol $ic462$;
    private static final SubLString $ic463$;
    private static final SubLSymbol $ic464$;
    private static final SubLString $ic465$;
    private static final SubLSymbol $ic466$;
    private static final SubLString $ic467$;
    private static final SubLSymbol $ic468$;
    private static final SubLString $ic469$;
    private static final SubLSymbol $ic470$;
    private static final SubLString $ic471$;
    private static final SubLSymbol $ic472$;
    private static final SubLString $ic473$;
    private static final SubLSymbol $ic474$;
    private static final SubLString $ic475$;
    private static final SubLSymbol $ic476$;
    private static final SubLString $ic477$;
    private static final SubLSymbol $ic478$;
    private static final SubLString $ic479$;
    private static final SubLSymbol $ic480$;
    private static final SubLString $ic481$;
    private static final SubLSymbol $ic482$;
    private static final SubLString $ic483$;
    private static final SubLSymbol $ic484$;
    private static final SubLString $ic485$;
    private static final SubLSymbol $ic486$;
    private static final SubLString $ic487$;
    private static final SubLSymbol $ic488$;
    private static final SubLString $ic489$;
    private static final SubLSymbol $ic490$;
    private static final SubLString $ic491$;
    private static final SubLSymbol $ic492$;
    private static final SubLString $ic493$;
    private static final SubLSymbol $ic494$;
    private static final SubLString $ic495$;
    private static final SubLSymbol $ic496$;
    private static final SubLString $ic497$;
    private static final SubLSymbol $ic498$;
    private static final SubLString $ic499$;
    private static final SubLSymbol $ic500$;
    private static final SubLString $ic501$;
    private static final SubLSymbol $ic502$;
    private static final SubLString $ic503$;
    private static final SubLSymbol $ic504$;
    private static final SubLString $ic505$;
    private static final SubLSymbol $ic506$;
    private static final SubLString $ic507$;
    private static final SubLSymbol $ic508$;
    private static final SubLSymbol $ic509$;
    private static final SubLString $ic510$;
    private static final SubLSymbol $ic511$;
    private static final SubLString $ic512$;
    private static final SubLSymbol $ic513$;
    private static final SubLString $ic514$;
    private static final SubLSymbol $ic515$;
    private static final SubLString $ic516$;
    private static final SubLSymbol $ic517$;
    private static final SubLString $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLString $ic520$;
    private static final SubLSymbol $ic521$;
    private static final SubLString $ic522$;
    private static final SubLSymbol $ic523$;
    private static final SubLString $ic524$;
    private static final SubLSymbol $ic525$;
    private static final SubLString $ic526$;
    private static final SubLSymbol $ic527$;
    private static final SubLString $ic528$;
    private static final SubLSymbol $ic529$;
    private static final SubLString $ic530$;
    private static final SubLSymbol $ic531$;
    private static final SubLString $ic532$;
    private static final SubLSymbol $ic533$;
    private static final SubLString $ic534$;
    private static final SubLSymbol $ic535$;
    private static final SubLString $ic536$;
    private static final SubLSymbol $ic537$;
    private static final SubLString $ic538$;
    private static final SubLSymbol $ic539$;
    private static final SubLString $ic540$;
    private static final SubLSymbol $ic541$;
    private static final SubLSymbol $ic542$;
    private static final SubLSymbol $ic543$;
    private static final SubLString $ic544$;
    private static final SubLSymbol $ic545$;
    private static final SubLString $ic546$;
    private static final SubLSymbol $ic547$;
    private static final SubLString $ic548$;
    private static final SubLSymbol $ic549$;
    private static final SubLString $ic550$;
    private static final SubLSymbol $ic551$;
    private static final SubLString $ic552$;
    private static final SubLSymbol $ic553$;
    private static final SubLString $ic554$;
    private static final SubLSymbol $ic555$;
    private static final SubLString $ic556$;
    private static final SubLSymbol $ic557$;
    private static final SubLString $ic558$;
    private static final SubLSymbol $ic559$;
    private static final SubLString $ic560$;
    private static final SubLSymbol $ic561$;
    private static final SubLString $ic562$;
    private static final SubLSymbol $ic563$;
    private static final SubLString $ic564$;
    private static final SubLSymbol $ic565$;
    private static final SubLString $ic566$;
    private static final SubLSymbol $ic567$;
    private static final SubLString $ic568$;
    private static final SubLSymbol $ic569$;
    private static final SubLString $ic570$;
    private static final SubLSymbol $ic571$;
    private static final SubLString $ic572$;
    private static final SubLSymbol $ic573$;
    private static final SubLString $ic574$;
    private static final SubLSymbol $ic575$;
    private static final SubLString $ic576$;
    private static final SubLSymbol $ic577$;
    private static final SubLString $ic578$;
    private static final SubLSymbol $ic579$;
    private static final SubLString $ic580$;
    private static final SubLSymbol $ic581$;
    private static final SubLString $ic582$;
    private static final SubLSymbol $ic583$;
    private static final SubLString $ic584$;
    private static final SubLSymbol $ic585$;
    private static final SubLString $ic586$;
    private static final SubLSymbol $ic587$;
    private static final SubLString $ic588$;
    private static final SubLSymbol $ic589$;
    private static final SubLString $ic590$;
    private static final SubLSymbol $ic591$;
    private static final SubLString $ic592$;
    private static final SubLSymbol $ic593$;
    private static final SubLString $ic594$;
    private static final SubLSymbol $ic595$;
    private static final SubLString $ic596$;
    private static final SubLSymbol $ic597$;
    private static final SubLString $ic598$;
    private static final SubLSymbol $ic599$;
    private static final SubLString $ic600$;
    private static final SubLSymbol $ic601$;
    private static final SubLString $ic602$;
    private static final SubLSymbol $ic603$;
    private static final SubLString $ic604$;
    private static final SubLSymbol $ic605$;
    private static final SubLString $ic606$;
    private static final SubLSymbol $ic607$;
    private static final SubLString $ic608$;
    private static final SubLSymbol $ic609$;
    private static final SubLString $ic610$;
    private static final SubLSymbol $ic611$;
    private static final SubLString $ic612$;
    private static final SubLSymbol $ic613$;
    private static final SubLString $ic614$;
    private static final SubLSymbol $ic615$;
    private static final SubLString $ic616$;
    private static final SubLSymbol $ic617$;
    private static final SubLString $ic618$;
    private static final SubLSymbol $ic619$;
    private static final SubLString $ic620$;
    private static final SubLSymbol $ic621$;
    private static final SubLString $ic622$;
    private static final SubLSymbol $ic623$;
    private static final SubLString $ic624$;
    private static final SubLSymbol $ic625$;
    private static final SubLString $ic626$;
    private static final SubLSymbol $ic627$;
    private static final SubLString $ic628$;
    private static final SubLSymbol $ic629$;
    private static final SubLString $ic630$;
    private static final SubLSymbol $ic631$;
    private static final SubLString $ic632$;
    private static final SubLSymbol $ic633$;
    private static final SubLString $ic634$;
    private static final SubLSymbol $ic635$;
    private static final SubLString $ic636$;
    private static final SubLSymbol $ic637$;
    private static final SubLString $ic638$;
    private static final SubLSymbol $ic639$;
    private static final SubLString $ic640$;
    private static final SubLSymbol $ic641$;
    private static final SubLString $ic642$;
    private static final SubLSymbol $ic643$;
    private static final SubLString $ic644$;
    private static final SubLSymbol $ic645$;
    private static final SubLString $ic646$;
    private static final SubLSymbol $ic647$;
    private static final SubLString $ic648$;
    private static final SubLSymbol $ic649$;
    private static final SubLString $ic650$;
    private static final SubLSymbol $ic651$;
    private static final SubLString $ic652$;
    private static final SubLSymbol $ic653$;
    private static final SubLString $ic654$;
    private static final SubLSymbol $ic655$;
    private static final SubLString $ic656$;
    private static final SubLSymbol $ic657$;
    private static final SubLString $ic658$;
    private static final SubLSymbol $ic659$;
    private static final SubLString $ic660$;
    private static final SubLString $ic661$;
    private static final SubLString $ic662$;
    private static final SubLString $ic663$;
    private static final SubLSymbol $ic664$;
    private static final SubLString $ic665$;
    private static final SubLSymbol $ic666$;
    private static final SubLList $ic667$;
    private static final SubLSymbol $ic668$;
    private static final SubLString $ic669$;
    private static final SubLSymbol $ic670$;
    private static final SubLSymbol $ic671$;
    private static final SubLString $ic672$;
    private static final SubLString $ic673$;
    private static final SubLString $ic674$;
    private static final SubLString $ic675$;
    private static final SubLString $ic676$;
    private static final SubLString $ic677$;
    private static final SubLList $ic678$;
    private static final SubLList $ic679$;
    private static final SubLSymbol $ic680$;
    private static final SubLSymbol $ic681$;
    private static final SubLString $ic682$;
    private static final SubLInteger $ic683$;
    private static final SubLSymbol $ic684$;
    private static final SubLString $ic685$;
    private static final SubLString $ic686$;
    private static final SubLString $ic687$;
    private static final SubLString $ic688$;
    private static final SubLString $ic689$;
    private static final SubLString $ic690$;
    private static final SubLString $ic691$;
    private static final SubLList $ic692$;
    private static final SubLSymbol $ic693$;
    private static final SubLSymbol $ic694$;
    private static final SubLSymbol $ic695$;
    private static final SubLSymbol $ic696$;
    private static final SubLSymbol $ic697$;
    private static final SubLSymbol $ic698$;
    private static final SubLList $ic699$;
    private static final SubLSymbol $ic700$;
    private static final SubLList $ic701$;
    private static final SubLString $ic702$;
    private static final SubLString $ic703$;
    private static final SubLString $ic704$;
    private static final SubLSymbol $ic705$;
    private static final SubLList $ic706$;
    private static final SubLString $ic707$;
    private static final SubLString $ic708$;
    private static final SubLInteger $ic709$;
    private static final SubLSymbol $ic710$;
    private static final SubLSymbol $ic711$;
    private static final SubLSymbol $ic712$;
    private static final SubLSymbol $ic713$;
    private static final SubLSymbol $ic714$;
    private static final SubLSymbol $ic715$;
    private static final SubLSymbol $ic716$;
    private static final SubLSymbol $ic717$;
    private static final SubLInteger $ic718$;
    private static final SubLInteger $ic719$;
    private static final SubLSymbol $ic720$;
    private static final SubLSymbol $ic721$;
    private static final SubLSymbol $ic722$;
    private static final SubLString $ic723$;
    private static final SubLString $ic724$;
    private static final SubLString $ic725$;
    private static final SubLString $ic726$;
    private static final SubLString $ic727$;
    private static final SubLString $ic728$;
    private static final SubLString $ic729$;
    private static final SubLString $ic730$;
    private static final SubLString $ic731$;
    private static final SubLString $ic732$;
    private static final SubLInteger $ic733$;
    private static final SubLSymbol $ic734$;
    private static final SubLString $ic735$;
    
    public static SubLObject f39011() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        streams_high.force_output(module0015.$g131$.getDynamicValue(var1));
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39012(final SubLObject var2, SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5;
        for (var5 = (SubLObject)module0642.NIL, var5 = (SubLObject)module0642.ZERO_INTEGER; var5.numL(var3); var5 = Numbers.add(var5, (SubLObject)module0642.ONE_INTEGER)) {
            streams_high.write_char(var2, module0015.$g131$.getDynamicValue(var4));
        }
        return var2;
    }
    
    public static SubLObject f39013(final SubLObject var5, SubLObject var6, SubLObject var7) {
        if (var6 == module0642.UNPROVIDED) {
            var6 = (SubLObject)module0642.ZERO_INTEGER;
        }
        if (var7 == module0642.UNPROVIDED) {
            var7 = (SubLObject)module0642.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0642.NIL == var7) {
            var7 = Sequences.length(var5);
        }
        if (var6.numL(var7)) {
            if ((module0642.NIL != module0015.$g533$.getDynamicValue(var8) && module0642.NIL != Sequences.find_if((SubLObject)module0642.$ic1$, var5, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) || module0642.NIL != Sequences.find_if((SubLObject)module0642.$ic2$, var5, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
                SubLObject var10_11;
                SubLObject var9;
                SubLObject var10;
                SubLObject var11;
                SubLObject var12;
                for (var9 = (var10_11 = ((module0642.NIL != var7) ? var7 : Sequences.length(var5))), var10 = (SubLObject)module0642.NIL, var10 = var6; !var10.numGE(var10_11); var10 = module0048.f_1X(var10)) {
                    var11 = Strings.sublisp_char(var5, var10);
                    var12 = f39014(var11, module0015.$g533$.getDynamicValue(var8));
                    if (module0642.NIL != var12) {
                        streams_high.write_string(var12, module0015.$g131$.getDynamicValue(var8), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                    }
                    else {
                        streams_high.write_char(var11, module0015.$g131$.getDynamicValue(var8));
                    }
                }
            }
            else {
                streams_high.write_string(var5, module0015.$g131$.getDynamicValue(var8), var6, var7);
            }
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39015(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0035.f2294(module0015.$g530$.getDynamicValue(var15), var14, Symbols.symbol_function((SubLObject)module0642.EQ), (SubLObject)module0642.NIL));
    }
    
    public static SubLObject f39014(final SubLObject var2, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0642.NIL != module0039.f3010(var2)) {
            return f39016(var2);
        }
        if (module0642.NIL != var15) {
            return module0035.f2294(module0015.$g530$.getDynamicValue(var16), var2, Symbols.symbol_function((SubLObject)module0642.EQ), (SubLObject)module0642.NIL);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39016(final SubLObject var2) {
        assert module0642.NIL != module0039.f3010(var2) : var2;
        final SubLObject var3 = Characters.char_code(var2);
        return Sequences.cconcatenate((SubLObject)module0642.$ic3$, new SubLObject[] { module0006.f203(module0048.f3425(var3)), module0642.$ic4$ });
    }
    
    public static SubLObject f39017(final SubLObject var5, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        assert module0642.NIL != Types.stringp(var5) : var5;
        SubLObject var17 = (SubLObject)module0642.NIL;
        final SubLObject var18 = module0015.$g533$.currentBinding(var16);
        try {
            module0015.$g533$.bind(var15, var16);
            SubLObject var19 = (SubLObject)module0642.NIL;
            try {
                var19 = streams_high.make_private_string_output_stream();
                final SubLObject var18_20 = module0015.$g131$.currentBinding(var16);
                try {
                    module0015.$g131$.bind(var19, var16);
                    f39013(var5, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                }
                finally {
                    module0015.$g131$.rebind(var18_20, var16);
                }
                var17 = streams_high.get_output_stream_string(var19);
            }
            finally {
                final SubLObject var18_21 = Threads.$is_thread_performing_cleanupP$.currentBinding(var16);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0642.T, var16);
                    streams_high.close(var19, (SubLObject)module0642.UNPROVIDED);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var18_21, var16);
                }
            }
        }
        finally {
            module0015.$g533$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f39018(final SubLObject var22) {
        return module0039.f3054(f39017(var22, (SubLObject)module0642.T));
    }
    
    public static SubLObject f39019(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0642.NIL != module0015.$g533$.getDynamicValue(var15)) {
            if (var14.isString()) {
                f39013(var14, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
            }
            else if (module0642.NIL != module0167.f10813(var14)) {
                f39019(module0006.f202(var14));
            }
            else if (module0642.NIL != module0128.f8449(var14)) {
                f39020(module0166.f10743(var14));
            }
            else if (var14.isChar()) {
                f39012(var14, (SubLObject)module0642.UNPROVIDED);
            }
            else if (var14.isNumber()) {
                print_high.princ(var14, module0015.$g131$.getDynamicValue(var15));
            }
            else if (var14.isKeyword()) {
                f39013(Symbols.symbol_name(var14), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
            }
            else if (var14.isSymbol()) {
                f39013(Symbols.symbol_name(var14), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
            }
            else {
                f39019(module0006.f202(var14));
            }
        }
        else {
            print_high.princ(var14, module0015.$g131$.getDynamicValue(var15));
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39021(final SubLObject var14) {
        f39020(module0015.$g234$.getGlobalValue());
        f39019(var14);
        f39020(module0015.$g235$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39022(final SubLObject var14, final SubLObject var23) {
        if (module0642.NIL != var23) {
            f39021(var14);
        }
        else {
            f39019(var14);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39023(final SubLObject var14) {
        f39020(module0015.$g459$.getGlobalValue());
        f39019(var14);
        f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39024(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0642.NIL != module0015.$g533$.getDynamicValue(var15)) {
            if (var14.isString()) {
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var16 = module0015.$g530$.currentBinding(var15);
                try {
                    module0015.$g530$.bind(module0015.$g531$.getGlobalValue(), var15);
                    f39019(var14);
                }
                finally {
                    module0015.$g530$.rebind(var16, var15);
                }
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            }
            else if (var14.isKeyword()) {
                f39012((SubLObject)Characters.CHAR_colon, (SubLObject)module0642.UNPROVIDED);
                f39019(var14);
            }
            else if (var14.isNumber()) {
                print_high.prin1(var14, module0015.$g131$.getDynamicValue(var15));
            }
            else {
                f39019(PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic6$, var14));
            }
        }
        else {
            print_high.prin1(var14, module0015.$g131$.getDynamicValue(var15));
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39025(final SubLObject var5) {
        assert module0642.NIL != Types.stringp(var5) : var5;
        if (module0642.NIL == Sequences.find((SubLObject)Characters.CHAR_newline, var5, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED) && module0642.NIL == Sequences.find((SubLObject)Characters.CHAR_space, var5, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
            f39019(var5);
        }
        else {
            SubLObject var10_24;
            SubLObject var6;
            SubLObject var7;
            SubLObject var9;
            SubLObject var8;
            for (var6 = (var10_24 = Sequences.length(var5)), var7 = (SubLObject)module0642.NIL, var7 = (SubLObject)module0642.ZERO_INTEGER; !var7.numGE(var10_24); var7 = module0048.f_1X(var7)) {
                var8 = (var9 = Strings.sublisp_char(var5, var7));
                if (var9.eql((SubLObject)Characters.CHAR_newline)) {
                    f39026((SubLObject)module0642.UNPROVIDED);
                }
                else if (var9.eql((SubLObject)Characters.CHAR_space)) {
                    f39027((SubLObject)module0642.$ic7$, (SubLObject)module0642.UNPROVIDED);
                }
                else {
                    f39012(var8, (SubLObject)module0642.UNPROVIDED);
                }
            }
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39028(SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5;
        for (var5 = (SubLObject)module0642.NIL, var5 = (SubLObject)module0642.ZERO_INTEGER; var5.numL(var3); var5 = Numbers.add(var5, (SubLObject)module0642.ONE_INTEGER)) {
            streams_high.terpri(module0015.$g131$.getDynamicValue(var4));
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39029(SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (module0642.NIL == module0015.$g537$.getDynamicValue(var4)) {
            f39028(var3);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39030(SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        return f39012((SubLObject)Characters.CHAR_tab, var3);
    }
    
    public static SubLObject f39031(SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        f39032(var3);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39032(SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        if (var3.numG((SubLObject)module0642.ZERO_INTEGER)) {
            if (module0642.NIL != module0015.$g537$.getDynamicValue(var4)) {
                return f39012((SubLObject)Characters.CHAR_space, var3);
            }
            SubLObject var5;
            SubLObject var6;
            for (var5 = Numbers.subtract(var3, (SubLObject)module0642.ONE_INTEGER), var6 = (SubLObject)module0642.NIL, var6 = (SubLObject)module0642.ZERO_INTEGER; var6.numL(var5); var6 = Numbers.add(var6, (SubLObject)module0642.ONE_INTEGER)) {
                f39027((SubLObject)module0642.$ic7$, (SubLObject)module0642.TWO_INTEGER);
            }
            f39012((SubLObject)Characters.CHAR_space, (SubLObject)module0642.UNPROVIDED);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39020(final SubLObject var28) {
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (var28.isString()) {
            streams_high.write_string(var28, module0015.$g131$.getDynamicValue(var29), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
        }
        else {
            print_high.princ(var28, module0015.$g131$.getDynamicValue(var29));
        }
        return var28;
    }
    
    public static SubLObject f39033(final SubLObject var5) {
        f39019((SubLObject)Characters.CHAR_quotation);
        f39034(var5, (SubLObject)module0642.UNPROVIDED);
        f39019((SubLObject)Characters.CHAR_quotation);
        return var5;
    }
    
    public static SubLObject f39034(final SubLObject var5, SubLObject var29) {
        if (var29 == module0642.UNPROVIDED) {
            var29 = (SubLObject)module0642.$ic8$;
        }
        return f39035(var5, var29, (SubLObject)module0642.NIL);
    }
    
    public static SubLObject f39035(final SubLObject var5, SubLObject var29, SubLObject var30) {
        if (var29 == module0642.UNPROVIDED) {
            var29 = (SubLObject)module0642.$ic8$;
        }
        if (var30 == module0642.UNPROVIDED) {
            var30 = (SubLObject)module0642.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = Sequences.length(var5);
        SubLObject var33 = (SubLObject)module0642.ZERO_INTEGER;
        SubLObject var34 = (SubLObject)module0642.NIL;
        SubLObject var35 = (SubLObject)module0642.NIL;
        if (module0642.NIL != module0642.$g4968$.getDynamicValue(var31) && var32.numG(module0642.$g4968$.getDynamicValue(var31))) {
            final SubLObject var36 = module0038.f2623(var5, (SubLObject)module0642.ZERO_INTEGER, module0642.$g4968$.getDynamicValue(var31));
            final SubLObject var37 = Sequences.cconcatenate(module0006.f203(var36), new SubLObject[] { module0642.$ic11$, module0006.f203(var32), module0642.$ic12$ });
            final SubLObject var38 = module0642.$g4968$.currentBinding(var31);
            try {
                module0642.$g4968$.bind((SubLObject)module0642.NIL, var31);
                f39035(var37, var29, var30);
            }
            finally {
                module0642.$g4968$.rebind(var38, var31);
            }
            return var37;
        }
        SubLObject var39 = (SubLObject)module0642.NIL;
        SubLObject var40 = (SubLObject)module0642.NIL;
        SubLObject var41 = (SubLObject)module0642.NIL;
        SubLObject var42 = (SubLObject)module0642.NIL;
        SubLObject var43 = (SubLObject)module0642.NIL;
        SubLObject var44 = (SubLObject)module0642.NIL;
        var39 = Sequences.position((SubLObject)Characters.CHAR_hash, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
        var40 = Sequences.position((SubLObject)Characters.CHAR_colon, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
        var41 = Sequences.position((SubLObject)Characters.CHAR_less, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
        var42 = Sequences.position_if((SubLObject)module0642.$ic13$, var5, Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
        var43 = (SubLObject)module0642.ZERO_INTEGER;
        var44 = (SubLObject)module0642.ZERO_INTEGER;
        while (module0642.NIL != var40 || module0642.NIL != var39 || module0642.NIL != var41 || module0642.NIL != var42) {
            var34 = Functions.apply(Symbols.symbol_function((SubLObject)module0642.$ic14$), Sequences.remove_if(Symbols.symbol_function((SubLObject)module0642.$ic15$), (SubLObject)ConsesLow.list(var39, var40, var41, var42), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED));
            if (var40.eql(var34)) {
                var43 = module0589.f35910(var5, var32, var40);
                if (module0642.NIL != var43) {
                    var44 = module0589.f35914(var5, var32, var43);
                }
                if (module0642.NIL != var43 && module0642.NIL != var44) {
                    f39013(var5, var33, var43);
                    f39036(Sequences.subseq(var5, var43, var44));
                    var33 = var44;
                }
                else {
                    f39013(var5, var33, Numbers.add((SubLObject)module0642.ONE_INTEGER, var40));
                    var33 = Numbers.add((SubLObject)module0642.ONE_INTEGER, var40);
                }
                var40 = Sequences.position((SubLObject)Characters.CHAR_colon, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
                var39 = Sequences.position((SubLObject)Characters.CHAR_hash, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
                var42 = Sequences.position_if((SubLObject)module0642.$ic13$, var5, Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
            }
            else if (var39.eql(var34)) {
                f39013(var5, var33, var39);
                final SubLObject var45 = Numbers.add(var39, (SubLObject)module0642.ONE_INTEGER);
                if (var45.numE(var32) || !Strings.sublisp_char(var5, var45).eql(module0129.f8494())) {
                    f39019((SubLObject)Characters.CHAR_hash);
                    var33 = var45;
                }
                else {
                    var33 = f39037(var5, var32, var45, var29, var30);
                }
                var39 = Sequences.position((SubLObject)Characters.CHAR_hash, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
                var40 = Sequences.position((SubLObject)Characters.CHAR_colon, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
                var42 = Sequences.position_if((SubLObject)module0642.$ic13$, var5, Symbols.symbol_function((SubLObject)module0642.IDENTITY), var33, (SubLObject)module0642.UNPROVIDED);
            }
            else if (var42.eql(var34)) {
                f39013(var5, var33, var42);
                var33 = var42;
                final SubLObject var46 = module0035.position_if_not((SubLObject)module0642.$ic13$, var5, Symbols.symbol_function((SubLObject)module0642.IDENTITY), var42, (SubLObject)module0642.UNPROVIDED);
                if (module0642.NIL != var35 && module0642.NIL != var46 && var46.numG(var42) && module0642.NIL == Characters.alpha_char_p(Strings.sublisp_char(var5, var46))) {
                    final SubLObject var47 = Sequences.subseq(var5, var42, var46);
                    if (module0642.NIL != module0201.f12554(var47)) {
                        f39019(var47);
                    }
                    else if (module0642.NIL != module0038.f2643(var47)) {
                        f39019(var47);
                    }
                    else {
                        f39020(module0015.$g209$.getGlobalValue());
                        f39019(var47);
                        f39020(module0015.$g210$.getGlobalValue());
                    }
                    var33 = var46;
                }
                if (module0642.NIL != var46) {
                    var42 = Sequences.position_if((SubLObject)module0642.$ic13$, var5, Symbols.symbol_function((SubLObject)module0642.IDENTITY), var46, (SubLObject)module0642.UNPROVIDED);
                }
                else {
                    var42 = (SubLObject)module0642.NIL;
                }
            }
            else if (var41.eql(var34)) {
                f39013(var5, var33, var41);
                var33 = var41;
                final SubLObject var48 = Sequences.position((SubLObject)Characters.CHAR_greater, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var41, (SubLObject)module0642.UNPROVIDED);
                if (module0642.NIL != var48) {
                    final SubLObject var49 = (SubLObject)((module0642.NIL != Characters.charE((SubLObject)Characters.CHAR_slash, Strings.sublisp_char(var5, Numbers.add(var41, (SubLObject)module0642.ONE_INTEGER)))) ? module0642.TWO_INTEGER : module0642.ONE_INTEGER);
                    SubLObject var50 = Sequences.subseq(var5, Numbers.add(var41, var49), var48);
                    if (module0642.NIL != module0004.f104(Strings.string_downcase(module0038.f2735(var50), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED), module0642.$g4967$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0642.$ic16$), (SubLObject)module0642.UNPROVIDED)) {
                        if (module0642.NIL != Strings.stringE(var50, (SubLObject)module0642.$ic17$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
                            var50 = (SubLObject)module0642.$ic18$;
                        }
                        f39020((SubLObject)module0642.$ic19$);
                        if (module0642.TWO_INTEGER.eql(var49)) {
                            f39019((SubLObject)module0642.$ic20$);
                        }
                        f39020(var50);
                        f39020((SubLObject)module0642.$ic21$);
                        if (module0642.NIL != Strings.stringE(var50, (SubLObject)module0642.$ic22$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED) || module0642.NIL != Strings.stringE(var50, (SubLObject)module0642.$ic23$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
                            if (module0642.TWO_INTEGER.eql(var49)) {
                                var35 = (SubLObject)module0642.NIL;
                            }
                            else {
                                var35 = (SubLObject)module0642.T;
                            }
                        }
                        var33 = Numbers.add(var48, (SubLObject)module0642.ONE_INTEGER);
                    }
                }
                var41 = Sequences.position((SubLObject)Characters.CHAR_less, var5, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.IDENTITY), Numbers.add(var41, (SubLObject)module0642.ONE_INTEGER), (SubLObject)module0642.UNPROVIDED);
            }
            var39 = var39;
            var40 = var40;
            var41 = var41;
            var42 = var42;
            var43 = var43;
            var44 = var44;
        }
        f39013(var5, var33, (SubLObject)module0642.NIL);
        return var5;
    }
    
    public static SubLObject f39038(final SubLObject var5, SubLObject var29, SubLObject var30) {
        if (var29 == module0642.UNPROVIDED) {
            var29 = (SubLObject)module0642.$ic24$;
        }
        if (var30 == module0642.UNPROVIDED) {
            var30 = (SubLObject)module0642.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0642.NIL;
        SubLObject var33 = (SubLObject)module0642.NIL;
        try {
            var33 = streams_high.make_private_string_output_stream();
            final SubLObject var34 = module0015.$g131$.currentBinding(var31);
            try {
                module0015.$g131$.bind(var33, var31);
                f39035(var5, var29, var30);
            }
            finally {
                module0015.$g131$.rebind(var34, var31);
            }
            var32 = streams_high.get_output_stream_string(var33);
        }
        finally {
            final SubLObject var35 = Threads.$is_thread_performing_cleanupP$.currentBinding(var31);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0642.T, var31);
                streams_high.close(var33, (SubLObject)module0642.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var35, var31);
            }
        }
        return var32;
    }
    
    public static SubLObject f39039(final SubLObject var5) {
        return f39038(var5, (SubLObject)module0642.$ic25$, (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39040(final SubLObject var50, SubLObject var51, SubLObject var52) {
        if (var51 == module0642.UNPROVIDED) {
            var51 = (SubLObject)module0642.NIL;
        }
        if (var52 == module0642.UNPROVIDED) {
            var52 = (SubLObject)module0642.NIL;
        }
        final SubLObject var53 = reader.read_from_string_ignoring_errors(var50, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != Strings.stringE(PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic34$, var53), var50, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
            module0656.f39804(var53, var51, var52);
        }
        else {
            module0656.f39804(var50, var51, var52);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39036(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        if (!var5.isString()) {
            return (SubLObject)module0642.NIL;
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var6), (SubLObject)module0642.$ic35$, var5, var5);
        return var5;
    }
    
    public static SubLObject f39037(final SubLObject var5, final SubLObject var31, final SubLObject var43, SubLObject var29, SubLObject var30) {
        if (var29 == module0642.UNPROVIDED) {
            var29 = (SubLObject)module0642.$ic8$;
        }
        if (var30 == module0642.UNPROVIDED) {
            var30 = (SubLObject)module0642.NIL;
        }
        final SubLObject var44 = Numbers.add(var43, (SubLObject)module0642.ONE_INTEGER);
        SubLObject var45 = module0035.position_if_not(Symbols.symbol_function((SubLObject)module0642.$ic37$), var5, Symbols.symbol_function((SubLObject)module0642.IDENTITY), var44, (SubLObject)module0642.UNPROVIDED);
        SubLObject var46 = (SubLObject)module0642.NIL;
        SubLObject var47 = (SubLObject)module0642.NIL;
        if (module0642.NIL == var45) {
            var45 = var31;
        }
        var46 = Numbers.subtract(var45, (SubLObject)module0642.ONE_INTEGER);
        var47 = module0126.f8394(var5, var44, var45);
        if (module0642.NIL == var47 && module0642.NIL == var30 && module0642.NIL == var47) {
            SubLObject var48 = module0642.$g4969$.getGlobalValue();
            SubLObject var49 = (SubLObject)module0642.NIL;
            var49 = var48.first();
            while (module0642.NIL == var47 && module0642.NIL != var48) {
                SubLObject var50;
                SubLObject var51;
                SubLObject var52;
                SubLObject var53;
                SubLObject var54;
                for (var50 = (SubLObject)module0642.NIL, var51 = (SubLObject)module0642.NIL, var52 = (SubLObject)module0642.NIL, var51 = Numbers.subtract(Sequences.length(var49), (SubLObject)module0642.ONE_INTEGER), var52 = (SubLObject)module0642.ZERO_INTEGER; !var51.numL((SubLObject)module0642.ZERO_INTEGER) && module0642.NIL == var47 && module0642.NIL == var50; var51 = Numbers.subtract(var51, (SubLObject)module0642.ONE_INTEGER), var52 = Numbers.add(var52, (SubLObject)module0642.ONE_INTEGER)) {
                    var53 = Strings.sublisp_char(var49, var51);
                    var54 = Numbers.subtract(var46, var52);
                    if (var54.numG(var44) && module0642.NIL != Characters.char_equal(var53, Strings.sublisp_char(var5, var54))) {
                        var47 = module0126.f8394(var5, var44, var54);
                        if (module0642.NIL != var47) {
                            var45 = var54;
                        }
                    }
                    else {
                        var50 = (SubLObject)module0642.T;
                    }
                }
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        if (module0642.NIL != var47) {
            if (module0642.$ic8$ == var29) {
                module0656.f39804(var47, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
            }
            else {
                Functions.funcall(var29, var47);
            }
        }
        else {
            f39041(var5, Numbers.subtract(var43, (SubLObject)module0642.ONE_INTEGER), var45);
        }
        return var45;
    }
    
    public static SubLObject f39041(final SubLObject var5, SubLObject var6, SubLObject var7) {
        if (var6 == module0642.UNPROVIDED) {
            var6 = (SubLObject)module0642.ZERO_INTEGER;
        }
        if (var7 == module0642.UNPROVIDED) {
            var7 = (SubLObject)module0642.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0642.NIL != module0642.$g4970$.getDynamicValue(var8)) {
            final SubLObject var9 = module0642.$g4970$.getDynamicValue(var8);
            f39020(module0015.$g219$.getGlobalValue());
            if (module0642.NIL != var9) {
                f39020(module0015.$g222$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(f39042(var9));
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            }
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var10 = module0015.$g533$.currentBinding(var8);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var8);
                f39013(var5, var6, var7);
            }
            finally {
                module0015.$g533$.rebind(var10, var8);
            }
            f39020(module0015.$g220$.getGlobalValue());
        }
        else {
            f39013(var5, var6, var7);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39043(final SubLObject var5, SubLObject var30) {
        if (var30 == module0642.UNPROVIDED) {
            var30 = (SubLObject)module0642.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0642.$g4970$.currentBinding(var31);
        try {
            module0642.$g4970$.bind((SubLObject)module0642.$ic38$, var31);
            f39035(var5, (SubLObject)module0642.$ic8$, var30);
        }
        finally {
            module0642.$g4970$.rebind(var32, var31);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39044(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (var14.isString()) {
            SubLObject var16;
            SubLObject var17;
            for (var16 = Sequences.length(var14), var17 = (SubLObject)module0642.NIL, var17 = (SubLObject)module0642.ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)module0642.ONE_INTEGER)) {
                f39045(Strings.sublisp_char(var14, var17));
            }
        }
        else if (var14.isSymbol()) {
            f39044(Symbols.symbol_name(var14));
        }
        else if (var14.isInteger()) {
            f39020(var14);
        }
        else if (module0642.NIL != module0167.f10813(var14)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var15), (SubLObject)module0642.$ic34$, var14);
        }
        else if (module0642.NIL != module0128.f8449(var14)) {
            f39044(module0166.f10743(var14));
        }
        else if (var14.isChar()) {
            f39045(var14);
        }
        else if (var14.isCons()) {
            f39044((SubLObject)module0642.$ic39$);
            SubLObject var18 = (SubLObject)module0642.NIL;
            SubLObject var19 = (SubLObject)module0642.NIL;
            var18 = var14;
            var19 = var18.first();
            while (var18.rest().isCons()) {
                if (!var18.eql(var14)) {
                    f39044((SubLObject)module0642.$ic40$);
                }
                f39044(var19);
                var18 = var18.rest();
                var19 = var18.first();
            }
            if (!var18.eql(var14)) {
                f39044((SubLObject)module0642.$ic40$);
            }
            f39044(var18.first());
            if (module0642.NIL != var18.rest()) {
                f39044((SubLObject)module0642.$ic41$);
                f39044(var18.rest());
            }
            f39044((SubLObject)module0642.$ic42$);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var15), (SubLObject)module0642.$ic34$, var14);
        }
        return var14;
    }
    
    public static SubLObject f39045(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0642.NIL != Characters.alpha_char_p(var2) || module0642.NIL != Characters.digit_char_p(var2, (SubLObject)module0642.UNPROVIDED) || module0642.NIL != Sequences.find(var2, (SubLObject)module0642.$ic43$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
            f39012(var2, (SubLObject)module0642.UNPROVIDED);
        }
        else if (var2.eql((SubLObject)Characters.CHAR_space) && module0642.NIL != module0642.$g4971$.getDynamicValue(var3)) {
            f39012((SubLObject)Characters.CHAR_plus, (SubLObject)module0642.UNPROVIDED);
        }
        else {
            final SubLObject var4 = Characters.char_code(var2);
            PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0642.$ic44$, module0038.f2792(Numbers.integerDivide(var4, (SubLObject)module0642.SIXTEEN_INTEGER)), module0038.f2792(Numbers.mod(var4, (SubLObject)module0642.SIXTEEN_INTEGER)));
        }
        return var2;
    }
    
    public static SubLObject f39046(final SubLObject var68) {
        f39020(Sequences.cconcatenate(module0006.f203(var68), new SubLObject[] { module0642.$ic45$, module0006.f205(var68) }));
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39047(final SubLObject var68, final SubLObject var69) {
        f39020(var68);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(var69);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39042(SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        if (var70.isString()) {
            return var70;
        }
        var70 = conses_high.assoc(var70, module0015.$g525$.getDynamicValue(var71), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED).rest();
        if (var70.isString()) {
            return var70;
        }
        return (SubLObject)module0642.$ic46$;
    }
    
    public static SubLObject f39048(final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        final SubLObject var72 = f39042(var70);
        f39019(module0642.$g4972$.getDynamicValue(var71));
        f39019(var72);
        f39019((SubLObject)module0642.$ic4$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39049(SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        if (var72.isString()) {
            return var72;
        }
        var72 = conses_high.assoc(var72, module0642.$g4973$.getDynamicValue(var73), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED).rest();
        if (var72.isString()) {
            return var72;
        }
        return (SubLObject)module0642.$ic46$;
    }
    
    public static SubLObject f39050() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        f39051((SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g149$.getGlobalValue());
        f39020(module0015.$g158$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic52$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var1);
            f39020(module0015.$g224$.getGlobalValue());
            f39052();
            f39020(module0015.$g225$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var2, var1);
        }
        f39020(module0015.$g150$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39052() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        PrintLow.format(module0015.$g131$.getDynamicValue(var1), (SubLObject)module0642.$ic53$, module0051.f3610());
        f39020(module0015.$g381$.getGlobalValue());
        f39020(module0015.$g383$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0642.$g4974$.getDynamicValue(var1));
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var1);
            f39019(module0642.$g4975$.getDynamicValue(var1));
        }
        finally {
            module0015.$g533$.rebind(var2, var1);
        }
        f39020(module0015.$g382$.getGlobalValue());
        f39019((SubLObject)module0642.$ic54$);
        f39019(module0642.$g4976$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39053(final SubLObject var73) {
        assert module0642.NIL != Types.stringp(var73) : var73;
        f39020(module0015.$g378$.getGlobalValue());
        f39019(var73);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39054(final SubLObject var74) {
        assert module0642.NIL != Types.stringp(var74) : var74;
        f39020(module0015.$g379$.getGlobalValue());
        f39019(var74);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39055(final SubLObject var75) {
        if (var75.isInteger()) {
            f39029((SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g166$.getGlobalValue());
            f39020(module0015.$g167$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.$ic69$);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            if (module0642.NIL != var75) {
                f39020(module0015.$g168$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(var75);
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            }
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39056() {
        f39029((SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g166$.getGlobalValue());
        f39020(module0015.$g167$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic70$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g168$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic71$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39057(SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var75 == module0642.UNPROVIDED) {
            var75 = (SubLObject)module0642.ZERO_INTEGER;
        }
        if (var76 == module0642.UNPROVIDED) {
            var76 = (SubLObject)module0642.ZERO_INTEGER;
        }
        if (var77 == module0642.UNPROVIDED) {
            var77 = (SubLObject)module0642.ZERO_INTEGER;
        }
        final SubLObject var78 = module0051.f3551(var75, var76, var77);
        final SubLObject var79 = module0589.f35948(var78);
        f39029((SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g166$.getGlobalValue());
        f39020(module0015.$g167$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic72$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var79) {
            f39020(module0015.$g168$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var79);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39058(SubLObject var78) {
        if (var78 == module0642.UNPROVIDED) {
            var78 = Time.get_universal_time();
        }
        final SubLObject var79 = module0589.f35948(var78);
        f39029((SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g166$.getGlobalValue());
        f39020(module0015.$g167$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic73$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var79) {
            f39020(module0015.$g168$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var79);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39059() {
        f39029((SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g166$.getGlobalValue());
        f39020(module0015.$g167$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic74$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g168$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic75$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39060(final SubLObject var80, final SubLObject var81) {
        SubLObject var83;
        final SubLObject var82 = var83 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0642.$ic76$);
        final SubLObject var84 = var83.rest();
        var83 = var83.first();
        SubLObject var85 = (SubLObject)module0642.NIL;
        SubLObject var86 = var83;
        SubLObject var87 = (SubLObject)module0642.NIL;
        SubLObject var88_89 = (SubLObject)module0642.NIL;
        while (module0642.NIL != var86) {
            cdestructuring_bind.destructuring_bind_must_consp(var86, var82, (SubLObject)module0642.$ic76$);
            var88_89 = var86.first();
            var86 = var86.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var86, var82, (SubLObject)module0642.$ic76$);
            if (module0642.NIL == conses_high.member(var88_89, (SubLObject)module0642.$ic77$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
                var87 = (SubLObject)module0642.T;
            }
            if (var88_89 == module0642.$ic78$) {
                var85 = var86.first();
            }
            var86 = var86.rest();
        }
        if (module0642.NIL != var87 && module0642.NIL == var85) {
            cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)module0642.$ic76$);
        }
        final SubLObject var88 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic79$, var83);
        final SubLObject var89 = (SubLObject)((module0642.NIL != var88) ? conses_high.cadr(var88) : module0642.ZERO_INTEGER);
        final SubLObject var90 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic80$, var83);
        final SubLObject var91 = (SubLObject)((module0642.NIL != var90) ? conses_high.cadr(var90) : module0642.ZERO_INTEGER);
        final SubLObject var92 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic81$, var83);
        final SubLObject var93 = (SubLObject)((module0642.NIL != var92) ? conses_high.cadr(var92) : module0642.ZERO_INTEGER);
        var83 = var84;
        if (module0642.NIL == var83) {
            module0002.f37((SubLObject)module0642.$ic82$, (SubLObject)module0642.$ic83$);
            return (SubLObject)ConsesLow.list((SubLObject)module0642.$ic84$, var93, var91, var89);
        }
        cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)module0642.$ic76$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39061(final SubLObject var80, final SubLObject var81) {
        SubLObject var83;
        final SubLObject var82 = var83 = var80.rest();
        final SubLObject var84 = var83.isCons() ? var83.first() : Time.get_universal_time();
        cdestructuring_bind.destructuring_bind_must_listp(var83, var82, (SubLObject)module0642.$ic85$);
        var83 = var83.rest();
        if (module0642.NIL == var83) {
            module0002.f37((SubLObject)module0642.$ic86$, (SubLObject)module0642.$ic87$);
            return (SubLObject)ConsesLow.list((SubLObject)module0642.$ic88$, var84);
        }
        cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)module0642.$ic85$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39062(final SubLObject var80, final SubLObject var81) {
        final SubLObject var82 = var80.rest();
        if (module0642.NIL != var82) {
            cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)module0642.NIL);
        }
        module0002.f37((SubLObject)module0642.$ic89$, (SubLObject)module0642.$ic90$);
        return (SubLObject)module0642.$ic90$;
    }
    
    public static SubLObject f39063() {
        return f39064((SubLObject)module0642.NIL, (SubLObject)module0642.NIL);
    }
    
    public static SubLObject f39064(SubLObject var100, SubLObject var101) {
        if (var100 == module0642.UNPROVIDED) {
            var100 = (SubLObject)module0642.NIL;
        }
        if (var101 == module0642.UNPROVIDED) {
            var101 = (SubLObject)module0642.NIL;
        }
        final SubLObject var102 = f39065(var100, var101);
        f39029((SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g166$.getGlobalValue());
        f39020(module0015.$g170$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic91$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var102) {
            f39020(module0015.$g168$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var102);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39065(final SubLObject var100, final SubLObject var101) {
        if (module0642.NIL == var100 && module0642.NIL == var101) {
            return (SubLObject)module0642.$ic92$;
        }
        if (module0642.NIL != var100 && module0642.NIL != var101) {
            return (SubLObject)module0642.$ic93$;
        }
        if (module0642.NIL == var100 && module0642.NIL != var101) {
            return (SubLObject)module0642.$ic94$;
        }
        if (module0642.NIL != var100 && module0642.NIL == var101) {
            return (SubLObject)module0642.$ic95$;
        }
        Errors.error((SubLObject)module0642.$ic96$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39051(SubLObject var103, SubLObject var104) {
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var104 == module0642.UNPROVIDED) {
            var104 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g191$.getGlobalValue());
        if (module0642.NIL != var103) {
            f39020(module0015.$g192$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var104) {
            f39020(module0015.$g193$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var104);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39066(SubLObject var105) {
        if (var105 == module0642.UNPROVIDED) {
            var105 = (SubLObject)module0642.NIL;
        }
        final SubLThread var106 = SubLProcess.currentSubLThread();
        if (module0642.NIL != var105) {
            f39020(module0015.$g198$.getGlobalValue());
            f39020(module0015.$g197$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var105);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g196$.getGlobalValue());
        }
        else {
            f39020(module0015.$g194$.getGlobalValue());
        }
        if (module0642.NIL == module0015.$g537$.getDynamicValue(var106)) {
            f39028((SubLObject)module0642.UNPROVIDED);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39067() {
        return f39066((SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39026(SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5;
        for (var5 = (SubLObject)module0642.NIL, var5 = (SubLObject)module0642.ZERO_INTEGER; var5.numL(var3); var5 = Numbers.add(var5, (SubLObject)module0642.ONE_INTEGER)) {
            if (module0642.NIL != module0015.$g537$.getDynamicValue(var4)) {
                f39028((SubLObject)module0642.UNPROVIDED);
            }
            else {
                f39067();
            }
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39068(final SubLObject var106, SubLObject var69, SubLObject var107, SubLObject var108, SubLObject var109, SubLObject var110) {
        if (var69 == module0642.UNPROVIDED) {
            var69 = (SubLObject)module0642.NIL;
        }
        if (var107 == module0642.UNPROVIDED) {
            var107 = (SubLObject)module0642.NIL;
        }
        if (var108 == module0642.UNPROVIDED) {
            var108 = (SubLObject)module0642.NIL;
        }
        if (var109 == module0642.UNPROVIDED) {
            var109 = (SubLObject)module0642.NIL;
        }
        if (var110 == module0642.UNPROVIDED) {
            var110 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g309$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var69) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var69);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var107) {
            f39046(module0015.$g296$.getGlobalValue());
        }
        if (module0642.NIL != var110) {
            f39046(module0015.$g298$.getGlobalValue());
        }
        if (module0642.NIL != var108) {
            f39032((SubLObject)module0642.ONE_INTEGER);
            f39020(var108);
        }
        if (module0642.NIL != var109) {
            f39020(module0015.$g323$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var109);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39069(final SubLObject var106, final SubLObject var69, SubLObject var111) {
        if (var111 == module0642.UNPROVIDED) {
            var111 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g311$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var111) {
            f39020(module0015.$g157$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var111);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var69) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var69);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39070(final SubLObject var106, final SubLObject var112, SubLObject var72, SubLObject var113) {
        if (var72 == module0642.UNPROVIDED) {
            var72 = (SubLObject)module0642.NIL;
        }
        if (var113 == module0642.UNPROVIDED) {
            var113 = (SubLObject)module0642.ZERO_INTEGER;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g312$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var112) {
            f39020(module0015.$g304$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var112);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var72) {
            f39020(module0015.$g300$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(f39049(var72));
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var113) {
            f39020(module0015.$g301$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var113);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39071(final SubLObject var106, SubLObject var114, SubLObject var103) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var114.equalp((SubLObject)module0642.$ic46$)) {
            var114 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g313$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var114) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var114);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var103) {
            f39020(module0015.$g303$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39072(final SubLObject var106, SubLObject var69, SubLObject var107, SubLObject var111) {
        if (var69 == module0642.UNPROVIDED) {
            var69 = (SubLObject)module0642.NIL;
        }
        if (var107 == module0642.UNPROVIDED) {
            var107 = (SubLObject)module0642.NIL;
        }
        if (var111 == module0642.UNPROVIDED) {
            var111 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g314$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var111) {
            f39020(module0015.$g157$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var111);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var69) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var69);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var107) {
            f39046(module0015.$g296$.getGlobalValue());
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39073(SubLObject var115) {
        if (var115 == module0642.UNPROVIDED) {
            var115 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g315$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g307$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39019((SubLObject)module0642.$ic97$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39074(SubLObject var115, SubLObject var106, SubLObject var108) {
        if (var115 == module0642.UNPROVIDED) {
            var115 = (SubLObject)module0642.NIL;
        }
        if (var106 == module0642.UNPROVIDED) {
            var106 = (SubLObject)module0642.NIL;
        }
        if (var108 == module0642.UNPROVIDED) {
            var108 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g316$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var115) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var115);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var108) {
            f39032((SubLObject)module0642.ONE_INTEGER);
            f39020(var108);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39075(final SubLObject var106, SubLObject var114, SubLObject var103) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var114.equalp((SubLObject)module0642.$ic46$)) {
            var114 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g317$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var114) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var114);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var103) {
            f39020(module0015.$g303$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39076(final SubLObject var106, final SubLObject var108, SubLObject var114, SubLObject var103) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var114.equalp((SubLObject)module0642.$ic46$)) {
            var114 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g317$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var114) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var114);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var103) {
            f39020(module0015.$g303$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var108) {
            f39032((SubLObject)module0642.ONE_INTEGER);
            f39020(var108);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39077(final SubLObject var106, SubLObject var114, SubLObject var103) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var114.equalp((SubLObject)module0642.$ic46$)) {
            var114 = (SubLObject)module0642.NIL;
        }
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g317$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var106) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var114) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var114);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39046(module0015.$g298$.getGlobalValue());
        if (module0642.NIL != var103) {
            f39020(module0015.$g303$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39078(final SubLObject var114, final SubLObject var103, final SubLObject var116, SubLObject var117, SubLObject var118, SubLObject var119, SubLObject var120) {
        if (var117 == module0642.UNPROVIDED) {
            var117 = (SubLObject)module0642.NIL;
        }
        if (var118 == module0642.UNPROVIDED) {
            var118 = (SubLObject)module0642.NIL;
        }
        if (var119 == module0642.UNPROVIDED) {
            var119 = (SubLObject)module0642.NIL;
        }
        if (var120 == module0642.UNPROVIDED) {
            var120 = (SubLObject)module0642.NIL;
        }
        final SubLObject var121 = PrintLow.format((SubLObject)module0642.NIL, var116, new SubLObject[] { var117, var118, var119, var120 });
        return f39075(var121, var114, var103);
    }
    
    public static SubLObject f39079(final SubLObject var106, SubLObject var114, SubLObject var103, SubLObject var121, SubLObject var122) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var121 == module0642.UNPROVIDED) {
            var121 = (SubLObject)module0642.NIL;
        }
        if (var122 == module0642.UNPROVIDED) {
            var122 = (SubLObject)module0642.$ic46$;
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        if (module0642.NIL != module0015.f794((SubLObject)module0642.UNPROVIDED)) {
            final SubLObject var124 = module0015.f793((SubLObject)module0642.UNPROVIDED);
            final SubLObject var125 = Sequences.cconcatenate((SubLObject)module0642.$ic98$, module0006.f203(var124));
            final SubLObject var126 = Sequences.cconcatenate((SubLObject)module0642.$ic99$, module0006.f203(var124));
            final SubLObject var127 = Sequences.cconcatenate((SubLObject)module0642.$ic100$, module0006.f203(var124));
            final SubLObject var128 = Sequences.cconcatenate((SubLObject)module0642.$ic101$, module0006.f203(var122));
            f39020(module0015.$g149$.getGlobalValue());
            if (module0642.NIL != var125) {
                f39020(module0015.$g157$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(var125);
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            }
            f39020(module0015.$g158$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.$ic102$);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var129 = module0015.$g533$.currentBinding(var123);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var123);
                f39020(module0015.$g295$.getGlobalValue());
                f39020(module0015.$g305$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(module0015.$g317$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(module0015.$g306$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(var128);
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                if (module0642.NIL != var126) {
                    f39020(module0015.$g157$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var126);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                if (module0642.NIL != var106) {
                    f39020(module0015.$g302$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var106);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                if (module0642.NIL != var114) {
                    f39020(module0015.$g307$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39019(var114);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                if (module0642.NIL != var103) {
                    f39020(module0015.$g303$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var103);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39020(module0015.$g158$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020((SubLObject)module0642.$ic103$);
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                f39020(module0015.$g144$.getGlobalValue());
                if (module0642.NIL != var127) {
                    f39020(module0015.$g157$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var127);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39020(module0015.$g158$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020((SubLObject)module0642.$ic104$);
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_128 = module0015.$g533$.currentBinding(var123);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var123);
                }
                finally {
                    module0015.$g533$.rebind(var18_128, var123);
                }
                f39020(module0015.$g145$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var129, var123);
            }
            f39020(module0015.$g150$.getGlobalValue());
            module0666.f40486(var126, var127, (SubLObject)module0642.TWENTY_INTEGER, (SubLObject)module0642.THREE_INTEGER, (SubLObject)module0642.NIL, var121);
        }
        else {
            f39075(var106, var114, var103);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39080(final SubLObject var129, SubLObject var72) {
        if (var72 == module0642.UNPROVIDED) {
            var72 = (SubLObject)module0642.NIL;
        }
        SubLObject var130 = (SubLObject)module0642.NIL;
        SubLObject var131 = (SubLObject)module0642.NIL;
        SubLObject var132 = (SubLObject)module0642.NIL;
        SubLObject var133 = (SubLObject)module0642.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var129, var129, (SubLObject)module0642.$ic105$);
        var130 = var129.first();
        SubLObject var134 = var129.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var134, var129, (SubLObject)module0642.$ic105$);
        var131 = var134.first();
        var134 = var134.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var134, var129, (SubLObject)module0642.$ic105$);
        var132 = var134.first();
        var134 = var134.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var134, var129, (SubLObject)module0642.$ic105$);
        var133 = var134.first();
        var134 = var134.rest();
        if (module0642.NIL == var134) {
            return f39070(var131, var130, var72, (SubLObject)module0642.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(var129, (SubLObject)module0642.$ic105$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39081(final SubLObject var129, final SubLObject var134) {
        SubLObject var135 = (SubLObject)module0642.NIL;
        SubLObject var136 = (SubLObject)module0642.NIL;
        SubLObject var137 = (SubLObject)module0642.NIL;
        SubLObject var138 = (SubLObject)module0642.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var129, var129, (SubLObject)module0642.$ic106$);
        var135 = var129.first();
        SubLObject var139 = var129.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var139, var129, (SubLObject)module0642.$ic106$);
        var136 = var139.first();
        var139 = var139.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var139, var129, (SubLObject)module0642.$ic106$);
        var137 = var139.first();
        var139 = var139.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var139, var129, (SubLObject)module0642.$ic106$);
        var138 = var139.first();
        var139 = var139.rest();
        if (module0642.NIL == var139) {
            SubLObject var140 = f39082(var136, (SubLObject)module0642.$ic107$, var134);
            SubLObject var141 = f39082(var136, (SubLObject)module0642.$ic108$, var134);
            if (var140.isString() && var141.isString()) {
                var140 = reader.read_from_string_ignoring_errors(var140, (SubLObject)module0642.NIL, (SubLObject)module0642.NIL, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                var141 = reader.read_from_string_ignoring_errors(var141, (SubLObject)module0642.NIL, (SubLObject)module0642.NIL, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                if (var140.isInteger() && var141.isInteger()) {
                    SubLObject var142 = var138;
                    SubLObject var143 = (SubLObject)module0642.NIL;
                    var143 = var142.first();
                    while (module0642.NIL != var142) {
                        SubLObject var144_145;
                        final SubLObject var142_143 = var144_145 = var143;
                        SubLObject var144 = (SubLObject)module0642.NIL;
                        SubLObject var145 = (SubLObject)module0642.NIL;
                        SubLObject var146 = (SubLObject)module0642.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0642.$ic109$);
                        var144 = var144_145.first();
                        var144_145 = var144_145.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0642.$ic109$);
                        var145 = var144_145.first();
                        var144_145 = var144_145.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var144_145, var142_143, (SubLObject)module0642.$ic109$);
                        var146 = var144_145.first();
                        var144_145 = var144_145.rest();
                        if (module0642.NIL == var144_145) {
                            if ((module0642.NIL == var144 || (var140.numGE(var144.first()) && var140.numLE(conses_high.second(var144)))) && (module0642.NIL == var145 || (var141.numGE(var145.first()) && var141.numLE(conses_high.second(var145))))) {
                                return var146;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var142_143, (SubLObject)module0642.$ic109$);
                        }
                        var142 = var142.rest();
                        var143 = var142.first();
                    }
                }
            }
            return var137;
        }
        cdestructuring_bind.cdestructuring_bind_error(var129, (SubLObject)module0642.$ic106$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39082(final SubLObject var106, final SubLObject var148, final SubLObject var134) {
        final SubLObject var149 = Sequences.length(var106);
        final SubLObject var150 = Sequences.length(var148);
        SubLObject var151;
        SubLObject var152;
        SubLObject var154;
        SubLObject var153;
        SubLObject var155;
        SubLObject var156;
        SubLObject var157;
        for (var151 = (SubLObject)module0642.NIL, var151 = var134; module0642.NIL != var151; var151 = var151.rest()) {
            var152 = var151.first();
            if (var152.isCons()) {
                var153 = (var154 = var152);
                var155 = (SubLObject)module0642.NIL;
                var156 = (SubLObject)module0642.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0642.$ic110$);
                var155 = var154.first();
                var154 = var154.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var154, var153, (SubLObject)module0642.$ic110$);
                var156 = var154.first();
                var154 = var154.rest();
                if (module0642.NIL == var154) {
                    var157 = Sequences.length(var155);
                    if (var157.numE(Numbers.add(Sequences.length(var106), Sequences.length(var148))) && module0642.NIL != Strings.string_equal(var106, var155, (SubLObject)module0642.ZERO_INTEGER, var149, (SubLObject)module0642.ZERO_INTEGER, var149) && module0642.NIL != Strings.string_equal(var148, var155, (SubLObject)module0642.ZERO_INTEGER, var150, var149, var157)) {
                        return var156;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var153, (SubLObject)module0642.$ic110$);
                }
            }
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39083(final SubLObject var157) {
        final SubLThread var158 = SubLProcess.currentSubLThread();
        f39020(module0015.$g364$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var159 = module0015.$g533$.currentBinding(var158);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var158);
            SubLObject var160;
            SubLObject var18_158;
            SubLObject var18_159;
            for (var160 = (SubLObject)module0642.NIL, var160 = (SubLObject)module0642.ZERO_INTEGER; var160.numL(module0015.$g542$.getDynamicValue(var158)); var160 = Numbers.add(var160, (SubLObject)module0642.ONE_INTEGER)) {
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                var18_158 = module0015.$g533$.currentBinding(var158);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var158);
                    module0015.f741();
                    f39020(module0015.$g203$.getGlobalValue());
                    var18_159 = module0015.$g537$.currentBinding(var158);
                    try {
                        module0015.$g537$.bind((SubLObject)module0642.T, var158);
                        f39032(var157);
                    }
                    finally {
                        module0015.$g537$.rebind(var18_159, var158);
                    }
                    f39020(module0015.$g204$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var18_158, var158);
                }
                f39020(module0015.$g361$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var159, var158);
        }
        f39020(module0015.$g365$.getGlobalValue());
        f39029((SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39084(final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        if (var160.numG((SubLObject)module0642.ZERO_INTEGER)) {
            f39020(module0015.$g360$.getGlobalValue());
            if (module0642.NIL != var160) {
                f39020(module0015.$g371$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(var160);
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            }
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var162 = module0015.$g533$.currentBinding(var161);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var161);
            }
            finally {
                module0015.$g533$.rebind(var162, var161);
            }
            f39020(module0015.$g361$.getGlobalValue());
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39085(final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        f39020(module0015.$g381$.getGlobalValue());
        if (module0642.NIL != var106) {
            f39020(module0015.$g384$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var106);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var108 = module0015.$g533$.currentBinding(var107);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var107);
        }
        finally {
            module0015.$g533$.rebind(var108, var107);
        }
        f39020(module0015.$g382$.getGlobalValue());
        return var106;
    }
    
    public static SubLObject f39086(final SubLObject var103) {
        if (module0642.NIL != var103) {
            f39020(module0015.$g400$.getGlobalValue());
            f39020(module0015.$g401$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39087() {
        f39020(module0015.$g487$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39088(final SubLObject var161) {
        module0656.f39837((SubLObject)module0642.$ic111$, var161, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39089(final SubLObject var162, SubLObject var51, SubLObject var52) {
        if (var51 == module0642.UNPROVIDED) {
            var51 = (SubLObject)module0642.ZERO_INTEGER;
        }
        if (var52 == module0642.UNPROVIDED) {
            var52 = (SubLObject)module0642.NIL;
        }
        final SubLObject var163 = module0210.f13594(var162);
        final SubLObject var164 = (SubLObject)((module0642.NIL != var163) ? module0172.f10921(var162) : module0642.NIL);
        if (module0642.NIL != var163 && module0642.NIL != var164) {
            module0656.f39804(var164, var51, var52);
        }
        else {
            module0656.f39804(var162, var51, var52);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39090(final SubLObject var106, SubLObject var165, SubLObject var72, SubLObject var113) {
        if (var165 == module0642.UNPROVIDED) {
            var165 = var106;
        }
        if (var72 == module0642.UNPROVIDED) {
            var72 = (SubLObject)module0642.NIL;
        }
        if (var113 == module0642.UNPROVIDED) {
            var113 = (SubLObject)module0642.ZERO_INTEGER;
        }
        final SubLThread var166 = SubLProcess.currentSubLThread();
        f39020(module0015.$g431$.getGlobalValue());
        f39020(module0015.$g440$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0110.$g124$.getDynamicValue(var166));
        f39020(var106);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var165) {
            f39020(module0015.$g437$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var165);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var72) {
            f39020(module0015.$g438$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(f39049(var72));
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var113) {
            f39020(module0015.$g439$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var113);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var167 = module0015.$g533$.currentBinding(var166);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var166);
        }
        finally {
            module0015.$g533$.rebind(var167, var166);
        }
        f39020(module0015.$g432$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39091(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        f39020(module0015.$g364$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var168 = module0015.$g533$.currentBinding(var167);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var167);
            SubLObject var169 = var166;
            SubLObject var170 = (SubLObject)module0642.NIL;
            var170 = var169.first();
            while (module0642.NIL != var169) {
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_167 = module0015.$g533$.currentBinding(var167);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var167);
                    f39019(var170);
                }
                finally {
                    module0015.$g533$.rebind(var18_167, var167);
                }
                f39020(module0015.$g361$.getGlobalValue());
                var169 = var169.rest();
                var170 = var169.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var168, var167);
        }
        f39020(module0015.$g365$.getGlobalValue());
        f39029((SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39092(final SubLObject var166) {
        final SubLThread var167 = SubLProcess.currentSubLThread();
        f39020(module0015.$g364$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var168 = module0015.$g533$.currentBinding(var167);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var167);
            SubLObject var169 = var166;
            SubLObject var170 = (SubLObject)module0642.NIL;
            var170 = var169.first();
            while (module0642.NIL != var169) {
                f39020(module0015.$g362$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_168 = module0015.$g533$.currentBinding(var167);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var167);
                    f39019(var170);
                }
                finally {
                    module0015.$g533$.rebind(var18_168, var167);
                }
                f39020(module0015.$g363$.getGlobalValue());
                var169 = var169.rest();
                var170 = var169.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var168, var167);
        }
        f39020(module0015.$g365$.getGlobalValue());
        f39029((SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39093(final SubLObject var169, final SubLObject var170, SubLObject var171, SubLObject var172, SubLObject var173) {
        if (var171 == module0642.UNPROVIDED) {
            var171 = (SubLObject)module0642.$ic112$;
        }
        if (var172 == module0642.UNPROVIDED) {
            var172 = module0015.$g501$.getGlobalValue();
        }
        if (var173 == module0642.UNPROVIDED) {
            var173 = module0015.$g495$.getGlobalValue();
        }
        final SubLThread var174 = SubLProcess.currentSubLThread();
        assert module0642.NIL != Types.integerp(var169) : var169;
        assert module0642.NIL != Types.integerp(var170) : var170;
        assert module0642.NIL != Types.integerp(var171) : var171;
        final SubLObject var175 = Numbers.truncate(Numbers.multiply(var169, var171), var170);
        final SubLObject var176 = Numbers.subtract(var171, var175);
        f39020(module0015.$g346$.getGlobalValue());
        f39020(module0015.$g352$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.ONE_INTEGER);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g353$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.ZERO_INTEGER);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g354$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.ZERO_INTEGER);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var177 = module0015.$g533$.currentBinding(var174);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var174);
            if (!module0642.ZERO_INTEGER.numE(var175)) {
                f39020(module0015.$g360$.getGlobalValue());
                if (module0642.NIL != var172) {
                    f39020(module0015.$g374$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var172);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_176 = module0015.$g533$.currentBinding(var174);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var174);
                    SubLObject var178;
                    for (var178 = (SubLObject)module0642.NIL, var178 = (SubLObject)module0642.ZERO_INTEGER; var178.numL(var175); var178 = Numbers.add(var178, (SubLObject)module0642.ONE_INTEGER)) {
                        f39027((SubLObject)module0642.$ic7$, (SubLObject)module0642.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var18_176, var174);
                }
                f39020(module0015.$g361$.getGlobalValue());
            }
            if (!module0642.ZERO_INTEGER.numE(var176)) {
                f39020(module0015.$g360$.getGlobalValue());
                if (module0642.NIL != var173) {
                    f39020(module0015.$g374$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var173);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_177 = module0015.$g533$.currentBinding(var174);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var174);
                    SubLObject var178;
                    for (var178 = (SubLObject)module0642.NIL, var178 = (SubLObject)module0642.ZERO_INTEGER; var178.numL(var176); var178 = Numbers.add(var178, (SubLObject)module0642.ONE_INTEGER)) {
                        f39027((SubLObject)module0642.$ic7$, (SubLObject)module0642.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var18_177, var174);
                }
                f39020(module0015.$g361$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var177, var174);
        }
        f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39094(final SubLObject var80, final SubLObject var81) {
        final SubLObject var83;
        final SubLObject var82 = var83 = var80.rest();
        SubLObject var84 = (SubLObject)module0642.NIL;
        SubLObject var85 = var83;
        SubLObject var86 = (SubLObject)module0642.NIL;
        SubLObject var183_184 = (SubLObject)module0642.NIL;
        while (module0642.NIL != var85) {
            cdestructuring_bind.destructuring_bind_must_consp(var85, var82, (SubLObject)module0642.$ic114$);
            var183_184 = var85.first();
            var85 = var85.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var85, var82, (SubLObject)module0642.$ic114$);
            if (module0642.NIL == conses_high.member(var183_184, (SubLObject)module0642.$ic115$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
                var86 = (SubLObject)module0642.T;
            }
            if (var183_184 == module0642.$ic78$) {
                var84 = var85.first();
            }
            var85 = var85.rest();
        }
        if (module0642.NIL != var86 && module0642.NIL == var84) {
            cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)module0642.$ic114$);
        }
        final SubLObject var87 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic116$, var83);
        final SubLObject var88 = (SubLObject)((module0642.NIL != var87) ? conses_high.cadr(var87) : module0642.NIL);
        final SubLObject var89 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic117$, var83);
        final SubLObject var90 = (SubLObject)((module0642.NIL != var89) ? conses_high.cadr(var89) : module0642.NIL);
        final SubLObject var91 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic118$, var83);
        final SubLObject var92 = (SubLObject)((module0642.NIL != var91) ? conses_high.cadr(var91) : module0642.NIL);
        final SubLObject var93 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic119$, var83);
        final SubLObject var94 = (SubLObject)((module0642.NIL != var93) ? conses_high.cadr(var93) : module0642.TWO_INTEGER);
        final SubLObject var95 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic120$, var83);
        final SubLObject var96 = (SubLObject)((module0642.NIL != var95) ? conses_high.cadr(var95) : module0642.$ic121$);
        final SubLObject var97 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic122$, var83);
        final SubLObject var98 = (SubLObject)((module0642.NIL != var97) ? conses_high.cadr(var97) : module0642.$ic123$);
        final SubLObject var99 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic124$, var83);
        final SubLObject var100 = (SubLObject)((module0642.NIL != var99) ? conses_high.cadr(var99) : module0642.ZERO_INTEGER);
        final SubLObject var101 = (SubLObject)module0642.$ic125$;
        final SubLObject var102 = (SubLObject)module0642.$ic126$;
        return (SubLObject)ConsesLow.list((SubLObject)module0642.$ic127$, ConsesLow.append((SubLObject)((module0642.NIL != var92) ? ConsesLow.list((SubLObject)module0642.$ic118$, var92) : module0642.NIL), (SubLObject)((module0642.NIL != var100) ? ConsesLow.list((SubLObject)module0642.$ic124$, var100) : module0642.NIL), (SubLObject)module0642.$ic128$), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic129$, (SubLObject)ConsesLow.list(var101, var102), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic130$, var88, var90, var92), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic131$, ConsesLow.append((SubLObject)((module0642.NIL != var94) ? ConsesLow.list((SubLObject)module0642.$ic119$, var94) : module0642.NIL), (SubLObject)module0642.NIL), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic132$, (SubLObject)ConsesLow.list((SubLObject)module0642.$ic118$, var101, (SubLObject)module0642.$ic133$, var96)), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic132$, (SubLObject)ConsesLow.list((SubLObject)module0642.$ic118$, var102, (SubLObject)module0642.$ic133$, var98)))));
    }
    
    public static SubLObject f39095(final SubLObject var169, final SubLObject var170, final SubLObject var104) {
        assert module0642.NIL != Types.numberp(var169) : var169;
        assert module0642.NIL != Types.numberp(var170) : var170;
        if (var169.numG(var170)) {
            return f39095(var170, var170, var104);
        }
        if (var169.numL((SubLObject)module0642.ZERO_INTEGER)) {
            return f39095((SubLObject)module0642.ZERO_INTEGER, var170, var104);
        }
        if (var170.numLE((SubLObject)module0642.ZERO_INTEGER)) {
            return f39095(var169, (SubLObject)module0642.ONE_INTEGER, var104);
        }
        if (var104.isInteger() && var104.isPositive()) {
            SubLObject var171 = Numbers.truncate(Numbers.divide(Numbers.multiply(var169, var104), var170), (SubLObject)module0642.UNPROVIDED);
            if (var169.isPositive()) {
                var171 = Numbers.max(var171, (SubLObject)module0642.ONE_INTEGER);
            }
            final SubLObject var172 = Numbers.subtract(var104, var171);
            return Values.values(var171, var172);
        }
        return f39095(var169, var170, (SubLObject)module0642.$ic136$);
    }
    
    public static SubLObject f39096(SubLObject var197, SubLObject var169, SubLObject var170, SubLObject var198, SubLObject var199) {
        if (var197 == module0642.UNPROVIDED) {
            var197 = (SubLObject)module0642.NIL;
        }
        if (var169 == module0642.UNPROVIDED) {
            var169 = (SubLObject)module0642.NIL;
        }
        if (var170 == module0642.UNPROVIDED) {
            var170 = (SubLObject)module0642.NIL;
        }
        if (var198 == module0642.UNPROVIDED) {
            var198 = (SubLObject)module0642.NIL;
        }
        if (var199 == module0642.UNPROVIDED) {
            var199 = (SubLObject)module0642.NIL;
        }
        final SubLThread var200 = SubLProcess.currentSubLThread();
        if (module0642.NIL != var197) {
            f39026((SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g234$.getGlobalValue());
            f39019(var197);
            f39020(module0015.$g235$.getGlobalValue());
            f39026((SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var198 || module0642.NIL != var169) {
            f39026((SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g346$.getGlobalValue());
            f39020(module0015.$g352$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g353$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g354$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var201 = module0015.$g533$.currentBinding(var200);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var200);
                if (module0642.NIL != var198) {
                    f39020(module0015.$g364$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_200 = module0015.$g533$.currentBinding(var200);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var200);
                        f39020(module0015.$g360$.getGlobalValue());
                        f39020(module0015.$g370$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic137$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(module0015.$g373$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic138$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_201 = module0015.$g533$.currentBinding(var200);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var200);
                            if (module0642.NIL != var199) {
                                f39019((SubLObject)module0642.$ic139$);
                            }
                            else {
                                f39019((SubLObject)module0642.$ic140$);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var18_201, var200);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                        f39020(module0015.$g360$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_202 = module0015.$g533$.currentBinding(var200);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var200);
                            f39032((SubLObject)module0642.TWO_INTEGER);
                        }
                        finally {
                            module0015.$g533$.rebind(var18_202, var200);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                        f39020(module0015.$g360$.getGlobalValue());
                        f39020(module0015.$g370$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic141$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(module0015.$g373$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic138$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_203 = module0015.$g533$.currentBinding(var200);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var200);
                            f39019(module0051.f3602(var198));
                        }
                        finally {
                            module0015.$g533$.rebind(var18_203, var200);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var18_200, var200);
                    }
                    f39020(module0015.$g365$.getGlobalValue());
                    f39029((SubLObject)module0642.UNPROVIDED);
                }
                if (module0642.NIL != var169) {
                    f39020(module0015.$g364$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_204 = module0015.$g533$.currentBinding(var200);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var200);
                        f39020(module0015.$g360$.getGlobalValue());
                        f39020(module0015.$g370$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic137$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(module0015.$g373$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic138$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_205 = module0015.$g533$.currentBinding(var200);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var200);
                            f39019((SubLObject)module0642.$ic142$);
                        }
                        finally {
                            module0015.$g533$.rebind(var18_205, var200);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                        f39020(module0015.$g360$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_206 = module0015.$g533$.currentBinding(var200);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var200);
                            f39032((SubLObject)module0642.TWO_INTEGER);
                        }
                        finally {
                            module0015.$g533$.rebind(var18_206, var200);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                        f39020(module0015.$g360$.getGlobalValue());
                        f39020(module0015.$g370$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic141$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(module0015.$g373$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic138$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_207 = module0015.$g533$.currentBinding(var200);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var200);
                            f39019(var169);
                            if (module0642.NIL != var170) {
                                f39019((SubLObject)module0642.$ic143$);
                                f39019(var170);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var18_207, var200);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var18_204, var200);
                    }
                    f39020(module0015.$g365$.getGlobalValue());
                    f39029((SubLObject)module0642.UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var201, var200);
            }
            f39020(module0015.$g347$.getGlobalValue());
        }
        if (module0642.NIL != var169 && module0642.NIL != var170) {
            f39020(module0015.$g346$.getGlobalValue());
            f39020(module0015.$g352$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g353$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g354$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var201 = module0015.$g533$.currentBinding(var200);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var200);
                f39020(module0015.$g364$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_208 = module0015.$g533$.currentBinding(var200);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var200);
                    f39020(module0015.$g360$.getGlobalValue());
                    f39020(module0015.$g370$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(f39049((SubLObject)module0642.$ic137$));
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(module0015.$g373$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(f39049((SubLObject)module0642.$ic144$));
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_209 = module0015.$g533$.currentBinding(var200);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var200);
                        final SubLObject var202 = module0048.f3313(var169, var170, (SubLObject)module0642.UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var200), (SubLObject)module0642.$ic145$, var202);
                        f39032((SubLObject)module0642.TWO_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var18_209, var200);
                    }
                    f39020(module0015.$g361$.getGlobalValue());
                    f39020(module0015.$g360$.getGlobalValue());
                    f39020(module0015.$g370$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(f39049((SubLObject)module0642.$ic141$));
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(module0015.$g373$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(f39049((SubLObject)module0642.$ic144$));
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_210 = module0015.$g533$.currentBinding(var200);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var200);
                        f39093(var169, var170, (SubLObject)module0642.$ic112$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var18_210, var200);
                    }
                    f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var18_208, var200);
                }
                f39020(module0015.$g365$.getGlobalValue());
                f39029((SubLObject)module0642.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var201, var200);
            }
            f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39097(final SubLObject var212, SubLObject var213, SubLObject var214, SubLObject var215, SubLObject var216) {
        if (var213 == module0642.UNPROVIDED) {
            var213 = (SubLObject)module0642.TWO_INTEGER;
        }
        if (var214 == module0642.UNPROVIDED) {
            var214 = (SubLObject)module0642.NIL;
        }
        if (var215 == module0642.UNPROVIDED) {
            var215 = module0015.$g509$.getGlobalValue();
        }
        if (var216 == module0642.UNPROVIDED) {
            var216 = module0015.$g505$.getGlobalValue();
        }
        final SubLThread var217 = SubLProcess.currentSubLThread();
        if (module0642.NIL == var212) {
            f39020(module0015.$g234$.getGlobalValue());
            f39019((SubLObject)module0642.$ic146$);
            f39020(module0015.$g235$.getGlobalValue());
            return (SubLObject)module0642.NIL;
        }
        SubLObject var218 = (SubLObject)module0642.NIL;
        SubLObject var219 = (SubLObject)module0642.NIL;
        SubLObject var220 = (SubLObject)module0642.ONE_INTEGER;
        var220 = Numbers.divide((SubLObject)module0642.$ic112$, Numbers.max((SubLObject)module0642.ONE_INTEGER, Functions.apply(Symbols.symbol_function((SubLObject)module0642.$ic147$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0642.$ic148$), var212))));
        SubLObject var221 = var212;
        SubLObject var222 = (SubLObject)module0642.NIL;
        var222 = var221.first();
        while (module0642.NIL != var221) {
            var219 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var222.first(), Numbers.round(Numbers.multiply(conses_high.second(var222), var220), (SubLObject)module0642.UNPROVIDED), conses_high.second(var222)), var219);
            var221 = var221.rest();
            var222 = var221.first();
        }
        final SubLObject var223 = Sequences.nreverse(var219);
        f39020(module0015.$g346$.getGlobalValue());
        if (module0642.NIL != var213) {
            f39020(module0015.$g352$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var213);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39020(module0015.$g353$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.FOUR_INTEGER);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g354$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.FOUR_INTEGER);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g358$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic149$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var224 = module0015.$g533$.currentBinding(var217);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var217);
            f39020(module0015.$g364$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var18_222 = module0015.$g533$.currentBinding(var217);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var217);
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_223 = module0015.$g533$.currentBinding(var217);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var217);
                    f39020(module0015.$g346$.getGlobalValue());
                    f39020(module0015.$g352$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020((SubLObject)module0642.ZERO_INTEGER);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(module0015.$g353$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020((SubLObject)module0642.ZERO_INTEGER);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(module0015.$g354$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020((SubLObject)module0642.ZERO_INTEGER);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(module0015.$g358$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020((SubLObject)module0642.$ic149$);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_224 = module0015.$g533$.currentBinding(var217);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var217);
                        SubLObject var225 = var223;
                        SubLObject var226 = (SubLObject)module0642.NIL;
                        var226 = var225.first();
                        while (module0642.NIL != var225) {
                            final SubLObject var227 = var226.first();
                            final SubLObject var228 = conses_high.second(var226);
                            final SubLObject var229 = conses_high.third(var226);
                            f39020(module0015.$g364$.getGlobalValue());
                            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                            final SubLObject var18_225 = module0015.$g533$.currentBinding(var217);
                            try {
                                module0015.$g533$.bind((SubLObject)module0642.T, var217);
                                final SubLObject var230 = (SubLObject)(var228.isZero() ? module0642.$ic150$ : PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic151$, var228));
                                final SubLObject var231 = (module0642.NIL != var218) ? var215 : var216;
                                f39098(var227);
                                f39099(var230, var229, var231, var214);
                                var218 = (SubLObject)SubLObjectFactory.makeBoolean(module0642.NIL == var218);
                            }
                            finally {
                                module0015.$g533$.rebind(var18_225, var217);
                            }
                            f39020(module0015.$g365$.getGlobalValue());
                            f39029((SubLObject)module0642.UNPROVIDED);
                            var225 = var225.rest();
                            var226 = var225.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var18_224, var217);
                    }
                    f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var18_223, var217);
                }
                f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var18_222, var217);
            }
            f39020(module0015.$g365$.getGlobalValue());
            f39029((SubLObject)module0642.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var224, var217);
        }
        f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39098(final SubLObject var231) {
        final SubLThread var232 = SubLProcess.currentSubLThread();
        f39020(module0015.$g360$.getGlobalValue());
        f39046(module0015.$g369$.getGlobalValue());
        f39020(module0015.$g370$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(f39049((SubLObject)module0642.$ic137$));
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g375$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic152$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var233 = module0015.$g533$.currentBinding(var232);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var232);
            f39019(var231);
            f39032((SubLObject)module0642.TWO_INTEGER);
        }
        finally {
            module0015.$g533$.rebind(var233, var232);
        }
        f39020(module0015.$g361$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39099(final SubLObject var229, final SubLObject var232, final SubLObject var233, final SubLObject var234) {
        final SubLThread var235 = SubLProcess.currentSubLThread();
        f39020(module0015.$g360$.getGlobalValue());
        f39020(module0015.$g375$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic153$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var236 = module0015.$g533$.currentBinding(var235);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var235);
            f39020(module0015.$g346$.getGlobalValue());
            f39020(module0015.$g352$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g353$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g354$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g358$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.$ic149$);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var18_235 = module0015.$g533$.currentBinding(var235);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var235);
                f39020(module0015.$g364$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_236 = module0015.$g533$.currentBinding(var235);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var235);
                    f39020(module0015.$g360$.getGlobalValue());
                    if (module0642.NIL != var233) {
                        f39020(module0015.$g374$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(var233);
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    }
                    if (module0642.NIL != var229) {
                        f39020(module0015.$g375$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(var229);
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    }
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_237 = module0015.$g533$.currentBinding(var235);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var235);
                        final SubLObject var237 = (SubLObject)module0642.TWO_INTEGER;
                        f39020(module0015.$g219$.getGlobalValue());
                        if (module0642.NIL != var237) {
                            f39020(module0015.$g221$.getGlobalValue());
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                            f39020(var237);
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        }
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_238 = module0015.$g533$.currentBinding(var235);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var235);
                            PrintLow.format(module0015.$g131$.getDynamicValue(var235), (SubLObject)module0642.$ic154$, var232);
                        }
                        finally {
                            module0015.$g533$.rebind(var18_238, var235);
                        }
                        f39020(module0015.$g220$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var18_237, var235);
                    }
                    f39020(module0015.$g361$.getGlobalValue());
                    f39020(module0015.$g360$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_239 = module0015.$g533$.currentBinding(var235);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var235);
                        if (module0642.NIL != var234) {
                            final SubLObject var237 = (SubLObject)module0642.TWO_INTEGER;
                            f39020(module0015.$g219$.getGlobalValue());
                            if (module0642.NIL != var237) {
                                f39020(module0015.$g221$.getGlobalValue());
                                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                                f39020(var237);
                                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                            }
                            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                            final SubLObject var18_240 = module0015.$g533$.currentBinding(var235);
                            try {
                                module0015.$g533$.bind((SubLObject)module0642.T, var235);
                                f39027((SubLObject)module0642.$ic7$, (SubLObject)module0642.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var18_240, var235);
                            }
                            f39020(module0015.$g220$.getGlobalValue());
                        }
                        else {
                            f39027((SubLObject)module0642.$ic7$, (SubLObject)module0642.UNPROVIDED);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var18_239, var235);
                    }
                    f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var18_236, var235);
                }
                f39020(module0015.$g365$.getGlobalValue());
                f39029((SubLObject)module0642.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var18_235, var235);
            }
            f39020(module0015.$g347$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var236, var235);
        }
        f39020(module0015.$g361$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39100(final SubLObject var242, SubLObject var243) {
        if (var243 == module0642.UNPROVIDED) {
            var243 = (SubLObject)module0642.NIL;
        }
        assert module0642.NIL != Types.symbolp(var242) : var242;
        SubLObject var244 = Symbols.get(var242, (SubLObject)module0642.$ic156$, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var245 = Symbols.get(var242, (SubLObject)module0642.$ic157$, (SubLObject)module0642.UNPROVIDED);
        SubLObject var246 = Symbols.get(var242, (SubLObject)module0642.$ic158$, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != Symbols.boundp(var242)) {
            if (module0642.NIL == var244) {
                var244 = Symbols.symbol_name(var242);
            }
            if (module0642.NIL == var246) {
                var246 = (SubLObject)module0642.$ic159$;
            }
            f39020(module0015.$g209$.getGlobalValue());
            f39019(var244);
            f39020(module0015.$g210$.getGlobalValue());
            if (module0642.NIL != var243) {
                f39026((SubLObject)module0642.UNPROVIDED);
                f39034(var245, (SubLObject)module0642.UNPROVIDED);
            }
            final SubLObject var247 = f39101(var242);
            final SubLObject var248 = f39102(var242);
            final SubLObject var249 = Sequences.find((SubLObject)module0642.$ic160$, var246, Symbols.symbol_function((SubLObject)module0642.EQL), Symbols.symbol_function((SubLObject)module0642.$ic161$), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var250 = Eval.eval(var242);
            final SubLObject var251 = Sequences.length(var246);
            SubLObject var252 = (SubLObject)module0642.ZERO_INTEGER;
            SubLObject var253 = var246;
            SubLObject var254 = (SubLObject)module0642.NIL;
            var254 = var253.first();
            while (module0642.NIL != var253) {
                f39026((SubLObject)module0642.UNPROVIDED);
                SubLObject var256;
                final SubLObject var255 = var256 = var254;
                SubLObject var257 = (SubLObject)module0642.NIL;
                SubLObject var256_257 = (SubLObject)module0642.NIL;
                SubLObject var258 = (SubLObject)module0642.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var256, var255, (SubLObject)module0642.$ic162$);
                var257 = var256.first();
                var256 = var256.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var256, var255, (SubLObject)module0642.$ic162$);
                var256_257 = var256.first();
                var256 = var256.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var256, var255, (SubLObject)module0642.$ic162$);
                var258 = var256.first();
                var256 = var256.rest();
                if (module0642.NIL == var256) {
                    SubLObject var259 = (SubLObject)module0642.NIL;
                    SubLObject var260 = (SubLObject)module0642.NIL;
                    if (var251.numE((SubLObject)module0642.ONE_INTEGER)) {
                        var259 = (SubLObject)module0642.T;
                    }
                    else if (var257 == module0642.$ic160$) {
                        var259 = Functions.funcall(var256_257, var250);
                    }
                    else {
                        var259 = Equality.equal(var250, var256_257);
                    }
                    if (module0642.NIL != var259 && var257 == module0642.$ic160$) {
                        var260 = print_high.princ_to_string(var250);
                    }
                    if (var251.numE((SubLObject)module0642.ONE_INTEGER)) {
                        f39069(var248, var252, (SubLObject)module0642.UNPROVIDED);
                    }
                    else {
                        if (module0642.NIL != var249) {
                            if (var257 == module0642.$ic160$) {
                                module0644.f39188(var248, var247, var252, var259);
                            }
                            else {
                                module0644.f39187(var248, var247, var252, var259);
                            }
                        }
                        else {
                            f39072(var248, var252, var259, (SubLObject)module0642.UNPROVIDED);
                        }
                        f39032((SubLObject)module0642.UNPROVIDED);
                    }
                    if (var257 == module0642.$ic160$) {
                        SubLObject var261 = module0015.f868(var242);
                        if (module0642.NIL == var261) {
                            var261 = (SubLObject)module0642.$ic163$;
                        }
                        SubLObject var264_265;
                        final SubLObject var262_263 = var264_265 = var261;
                        SubLObject var255_266 = (SubLObject)module0642.NIL;
                        SubLObject var262 = (SubLObject)module0642.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var264_265, var262_263, (SubLObject)module0642.$ic164$);
                        var255_266 = var264_265.first();
                        var264_265 = var264_265.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var264_265, var262_263, (SubLObject)module0642.$ic164$);
                        var262 = var264_265.first();
                        var264_265 = var264_265.rest();
                        if (module0642.NIL == var264_265) {
                            final SubLObject var263 = var255_266;
                            if (var263.eql((SubLObject)module0642.$ic165$)) {
                                f39075(var247, var260, var262);
                            }
                            else {
                                f39075(var247, var260, (SubLObject)module0642.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var262_263, (SubLObject)module0642.$ic164$);
                        }
                        f39032((SubLObject)module0642.UNPROVIDED);
                    }
                    f39019(var258);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var255, (SubLObject)module0642.$ic162$);
                }
                var252 = Numbers.add(var252, (SubLObject)module0642.ONE_INTEGER);
                var253 = var253.rest();
                var254 = var253.first();
            }
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39103(final SubLObject var242, final SubLObject var134) {
        assert module0642.NIL != Types.symbolp(var242) : var242;
        final SubLObject var243 = Symbols.get(var242, (SubLObject)module0642.$ic156$, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var244 = Symbols.get(var242, (SubLObject)module0642.$ic158$, (SubLObject)module0642.UNPROVIDED);
        SubLObject var245 = (SubLObject)module0642.NIL;
        SubLObject var246 = (SubLObject)module0642.NIL;
        if (module0642.NIL != var243 && module0642.NIL != var244 && module0642.NIL != Symbols.boundp(var242)) {
            final SubLObject var247 = f39102(var242);
            final SubLObject var248 = f39104(var247, var134);
            if (module0642.NIL != var248) {
                final SubLObject var249 = ConsesLow.nth(reader.read_from_string_ignoring_errors(var248, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED), var244);
                SubLObject var251;
                final SubLObject var250 = var251 = var249;
                SubLObject var252 = (SubLObject)module0642.NIL;
                SubLObject var256_272 = (SubLObject)module0642.NIL;
                SubLObject var253 = (SubLObject)module0642.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var251, var250, (SubLObject)module0642.$ic162$);
                var252 = var251.first();
                var251 = var251.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var251, var250, (SubLObject)module0642.$ic162$);
                var256_272 = var251.first();
                var251 = var251.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var251, var250, (SubLObject)module0642.$ic162$);
                var253 = var251.first();
                var251 = var251.rest();
                if (module0642.NIL == var251) {
                    if (var252 == module0642.$ic160$) {
                        final SubLObject var254 = f39101(var242);
                        final SubLObject var255 = f39104(var254, var134);
                        if (module0642.NIL != var255) {
                            if (module0642.NIL != Functions.funcall(var256_272, var255)) {
                                var245 = var255;
                            }
                            else {
                                final SubLObject var256 = reader.read_from_string_ignoring_errors(var255, (SubLObject)module0642.NIL, (SubLObject)module0642.NIL, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                                if (module0642.NIL != Functions.funcall(var256_272, var256)) {
                                    var245 = var256;
                                }
                                else {
                                    var246 = PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic166$, var243);
                                }
                            }
                        }
                        else {
                            var246 = PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic167$, var243);
                        }
                    }
                    else {
                        var245 = var256_272;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var250, (SubLObject)module0642.$ic162$);
                }
            }
            else {
                var246 = PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic168$, var243);
            }
        }
        else {
            var246 = PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic169$, var242);
        }
        return Values.values(var245, var246);
    }
    
    public static SubLObject f39105(final SubLObject var242, final SubLObject var134) {
        final SubLThread var243 = SubLProcess.currentSubLThread();
        var243.resetMultipleValues();
        final SubLObject var244 = f39103(var242, var134);
        final SubLObject var245 = var243.secondMultipleValue();
        var243.resetMultipleValues();
        if (module0642.NIL != var245) {
            module0656.f39789(var245, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
            return (SubLObject)module0642.NIL;
        }
        Eval.eval((SubLObject)ConsesLow.list((SubLObject)module0642.$ic170$, var242, (SubLObject)ConsesLow.list((SubLObject)module0642.$ic171$, var244)));
        return (SubLObject)module0642.T;
    }
    
    public static SubLObject f39101(final SubLObject var242) {
        final SubLObject var243 = Symbols.symbol_name(var242);
        return PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic172$, var243);
    }
    
    public static SubLObject f39102(final SubLObject var242) {
        final SubLObject var243 = Symbols.symbol_name(var242);
        return PrintLow.format((SubLObject)module0642.NIL, (SubLObject)module0642.$ic173$, var243);
    }
    
    public static SubLObject f39106(final SubLObject var106, final SubLObject var275, final SubLObject var276, SubLObject var277) {
        if (var277 == module0642.UNPROVIDED) {
            var277 = (SubLObject)module0642.NIL;
        }
        final SubLThread var278 = SubLProcess.currentSubLThread();
        f39020(module0015.$g318$.getGlobalValue());
        f39020(module0015.$g320$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(var106);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var279 = module0015.$g533$.currentBinding(var278);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var278);
            SubLObject var280 = (SubLObject)module0642.NIL;
            SubLObject var279_280 = (SubLObject)module0642.NIL;
            SubLObject var281 = (SubLObject)module0642.NIL;
            SubLObject var282_283 = (SubLObject)module0642.NIL;
            var280 = var276;
            var279_280 = var280.first();
            var281 = var277;
            var282_283 = var281.first();
            while (module0642.NIL != var281 || module0642.NIL != var280) {
                final SubLObject var282 = Equality.equal(var279_280, var275);
                f39020(module0015.$g324$.getGlobalValue());
                if (module0642.NIL != var282) {
                    f39046(module0015.$g327$.getGlobalValue());
                }
                if (module0642.NIL != var282_283) {
                    f39020(module0015.$g326$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var282_283);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_285 = module0015.$g533$.currentBinding(var278);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var278);
                    f39019(var279_280);
                }
                finally {
                    module0015.$g533$.rebind(var18_285, var278);
                }
                f39020(module0015.$g325$.getGlobalValue());
                var280 = var280.rest();
                var279_280 = var280.first();
                var281 = var281.rest();
                var282_283 = var281.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var279, var278);
        }
        f39020(module0015.$g319$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39107(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var14.isCons() && var14.first().equalp(module0642.$g4977$.getDynamicValue(var15)));
    }
    
    public static SubLObject f39108(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var14.isCons() && conses_high.second(var14).equalp(module0642.$g4977$.getDynamicValue(var15)));
    }
    
    public static SubLObject f39104(final SubLObject var286, final SubLObject var134) {
        final SubLThread var287 = SubLProcess.currentSubLThread();
        assert module0642.NIL != Types.stringp(var286) : var286;
        assert module0642.NIL != Types.listp(var134) : var134;
        SubLObject var288 = (SubLObject)module0642.NIL;
        final SubLObject var289 = module0642.$g4977$.currentBinding(var287);
        try {
            module0642.$g4977$.bind(var286, var287);
            var288 = Sequences.find_if(Symbols.symbol_function((SubLObject)module0642.$ic175$), var134, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
        }
        finally {
            module0642.$g4977$.rebind(var289, var287);
        }
        return conses_high.second(var288);
    }
    
    public static SubLObject f39109(final SubLObject var286, final SubLObject var134) {
        final SubLThread var287 = SubLProcess.currentSubLThread();
        assert module0642.NIL != Types.stringp(var286) : var286;
        assert module0642.NIL != Types.listp(var134) : var134;
        SubLObject var288 = (SubLObject)module0642.NIL;
        final SubLObject var289 = module0642.$g4977$.currentBinding(var287);
        try {
            module0642.$g4977$.bind(var286, var287);
            SubLObject var290 = var134;
            SubLObject var291 = (SubLObject)module0642.NIL;
            var291 = var290.first();
            while (module0642.NIL != var290) {
                if (module0642.NIL != f39107(var291)) {
                    var288 = (SubLObject)ConsesLow.cons(conses_high.second(var291), var288);
                }
                var290 = var290.rest();
                var291 = var290.first();
            }
        }
        finally {
            module0642.$g4977$.rebind(var289, var287);
        }
        return Sequences.nreverse(var288);
    }
    
    public static SubLObject f39110(final SubLObject var286, final SubLObject var288, SubLObject var114) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        SubLObject var289 = f39104(var286, var288);
        if (module0642.NIL == var289) {
            var289 = var114;
        }
        return var289;
    }
    
    public static SubLObject f39111(final SubLObject var286, final SubLObject var288, SubLObject var114) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.$ic46$;
        }
        return f39110(var286, var288, var114);
    }
    
    public static SubLObject f39112(final SubLObject var286, final SubLObject var288, SubLObject var114) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        return module0035.sublisp_boolean(f39110(var286, var288, var114));
    }
    
    public static SubLObject f39113(final SubLObject var286, final SubLObject var288, SubLObject var114) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        return f39114(var286, var288, var114, (SubLObject)module0642.NIL);
    }
    
    public static SubLObject f39115(final SubLObject var286, final SubLObject var288, SubLObject var114) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        return f39114(var286, var288, var114, (SubLObject)module0642.T);
    }
    
    public static SubLObject f39114(final SubLObject var286, final SubLObject var288, final SubLObject var114, final SubLObject var290) {
        final SubLThread var291 = SubLProcess.currentSubLThread();
        final SubLObject var292 = reader.$read_eval$.currentBinding(var291);
        try {
            reader.$read_eval$.bind((SubLObject)module0642.NIL, var291);
            final SubLObject var293 = f39104(var286, var288);
            final SubLObject var294 = (module0642.NIL != var293 && module0642.NIL != var290) ? module0038.f2933(var293) : var293;
            final SubLObject var295 = (module0642.NIL != var293) ? reader.read_from_string_ignoring_errors(var294, (SubLObject)module0642.NIL, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED) : var114;
            return var295;
        }
        finally {
            reader.$read_eval$.rebind(var292, var291);
        }
    }
    
    public static SubLObject f39116(final SubLObject var293, final SubLObject var288, SubLObject var114) {
        if (var114 == module0642.UNPROVIDED) {
            var114 = (SubLObject)module0642.NIL;
        }
        final SubLThread var294 = SubLProcess.currentSubLThread();
        assert module0642.NIL != Types.stringp(var293) : var293;
        assert module0642.NIL != Types.listp(var288) : var288;
        SubLObject var295 = (SubLObject)module0642.NIL;
        final SubLObject var296 = module0642.$g4977$.currentBinding(var294);
        try {
            module0642.$g4977$.bind(var293, var294);
            var295 = Sequences.find_if(Symbols.symbol_function((SubLObject)module0642.$ic177$), var288, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
        }
        finally {
            module0642.$g4977$.rebind(var296, var294);
        }
        return var295.first();
    }
    
    public static SubLObject f39117(final SubLObject var294) {
        SubLObject var295 = (SubLObject)module0642.NIL;
        if (var294.equalp((SubLObject)module0642.$ic178$)) {
            var295 = module0642.$ic179$;
        }
        else if (var294.equalp((SubLObject)module0642.$ic180$)) {
            var295 = module0642.$ic181$;
        }
        else if (var294.equalp((SubLObject)module0642.$ic182$)) {
            var295 = module0642.$ic183$;
        }
        else if (var294.equalp((SubLObject)module0642.$ic184$)) {
            var295 = module0642.$ic185$;
        }
        else {
            var295 = module0220.f14556(var294, module0642.$ic186$, (SubLObject)module0642.TWO_INTEGER, (SubLObject)module0642.ONE_INTEGER, (SubLObject)module0642.UNPROVIDED);
        }
        return var295;
    }
    
    public static SubLObject f39027(final SubLObject var296, SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        assert module0642.NIL != Types.symbolp(var296) : var296;
        final SubLObject var297 = f39118(var296);
        if (var297.isString()) {
            SubLObject var298;
            for (var298 = (SubLObject)module0642.NIL, var298 = (SubLObject)module0642.ZERO_INTEGER; var298.numL(var3); var298 = Numbers.add(var298, (SubLObject)module0642.ONE_INTEGER)) {
                f39020(var297);
            }
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39118(final SubLObject var296) {
        return Symbols.get(var296, (SubLObject)module0642.$ic187$, (SubLObject)module0642.NIL);
    }
    
    public static SubLObject f39119(final SubLObject var296, final SubLObject var297) {
        assert module0642.NIL != Types.symbolp(var296) : var296;
        assert module0642.NIL != Types.stringp(var297) : var297;
        Symbols.put(var296, (SubLObject)module0642.$ic187$, var297);
        return var296;
    }
    
    public static SubLObject f39120(final SubLObject var298, SubLObject var3) {
        if (var3 == module0642.UNPROVIDED) {
            var3 = (SubLObject)module0642.ONE_INTEGER;
        }
        assert module0642.NIL != module0038.f2794(var298) : var298;
        SubLObject var299;
        for (var299 = (SubLObject)module0642.NIL, var299 = (SubLObject)module0642.ZERO_INTEGER; var299.numL(var3); var299 = Numbers.add(var299, (SubLObject)module0642.ONE_INTEGER)) {
            f39020(Sequences.cconcatenate((SubLObject)module0642.$ic660$, new SubLObject[] { var298, module0642.$ic4$ }));
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39121(final SubLObject var286, final SubLObject var299, SubLObject var300, SubLObject var103, SubLObject var301, SubLObject var108) {
        if (var300 == module0642.UNPROVIDED) {
            var300 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var301 == module0642.UNPROVIDED) {
            var301 = (SubLObject)module0642.NIL;
        }
        if (var108 == module0642.UNPROVIDED) {
            var108 = (SubLObject)module0642.NIL;
        }
        final SubLThread var302 = SubLProcess.currentSubLThread();
        f39020(module0015.$g318$.getGlobalValue());
        f39020(module0015.$g320$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(var286);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var103) {
            f39020(module0015.$g321$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39032((SubLObject)module0642.ONE_INTEGER);
        f39020(var108);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var303 = module0015.$g533$.currentBinding(var302);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var302);
            SubLObject var304 = (SubLObject)module0642.NIL;
            SubLObject var305 = (SubLObject)module0642.NIL;
            SubLObject var306 = (SubLObject)module0642.NIL;
            var304 = var299;
            var305 = var304.first();
            for (var306 = (SubLObject)module0642.ZERO_INTEGER; module0642.NIL != var304; var304 = var304.rest(), var305 = var304.first(), var306 = Numbers.add((SubLObject)module0642.ONE_INTEGER, var306)) {
                final SubLObject var307 = Equality.eql(var306, var301);
                final SubLObject var308 = (SubLObject)((module0642.NIL != module0035.f2002(var300, var306, (SubLObject)module0642.UNPROVIDED)) ? Sequences.elt(var300, var306) : module0642.NIL);
                f39020(module0015.$g324$.getGlobalValue());
                if (module0642.NIL != var307) {
                    f39046(module0015.$g327$.getGlobalValue());
                }
                if (module0642.NIL != var308) {
                    f39020(module0015.$g326$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var308);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_304 = module0015.$g533$.currentBinding(var302);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var302);
                    f39019(var305);
                }
                finally {
                    module0015.$g533$.rebind(var18_304, var302);
                }
                f39020(module0015.$g325$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var303, var302);
        }
        f39020(module0015.$g319$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39122(final SubLObject var305, final SubLObject var299, SubLObject var300, SubLObject var301, SubLObject var306) {
        if (var300 == module0642.UNPROVIDED) {
            var300 = (SubLObject)module0642.NIL;
        }
        if (var301 == module0642.UNPROVIDED) {
            var301 = (SubLObject)module0642.NIL;
        }
        if (var306 == module0642.UNPROVIDED) {
            var306 = (SubLObject)module0642.NIL;
        }
        SubLObject var307 = (SubLObject)module0642.NIL;
        SubLObject var308 = (SubLObject)module0642.NIL;
        SubLObject var309 = (SubLObject)module0642.NIL;
        var307 = var299;
        var308 = var307.first();
        for (var309 = (SubLObject)module0642.ZERO_INTEGER; module0642.NIL != var307; var307 = var307.rest(), var308 = var307.first(), var309 = Numbers.add((SubLObject)module0642.ONE_INTEGER, var309)) {
            final SubLObject var310 = Equality.eql(var309, var301);
            final SubLObject var311 = Sequences.elt(var300, var309);
            final SubLObject var312 = (module0642.NIL != var311) ? var311 : var308;
            if (module0642.NIL != module0038.f2653(var308)) {
                f39072(var305, var312, var310, (SubLObject)module0642.UNPROVIDED);
                f39032((SubLObject)module0642.UNPROVIDED);
                f39019(var308);
            }
            if (module0642.NIL != var306) {
                f39032((SubLObject)module0642.UNPROVIDED);
            }
            else {
                f39026((SubLObject)module0642.UNPROVIDED);
            }
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39123(final SubLObject var286, final SubLObject var299, SubLObject var300, SubLObject var103, SubLObject var309) {
        if (var300 == module0642.UNPROVIDED) {
            var300 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var309 == module0642.UNPROVIDED) {
            var309 = (SubLObject)module0642.NIL;
        }
        final SubLThread var310 = SubLProcess.currentSubLThread();
        f39020(module0015.$g318$.getGlobalValue());
        f39020(module0015.$g320$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020(var286);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39046(module0015.$g322$.getGlobalValue());
        if (module0642.NIL != var103) {
            f39020(module0015.$g321$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var311 = module0015.$g533$.currentBinding(var310);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var310);
            SubLObject var312 = (SubLObject)module0642.NIL;
            SubLObject var313 = (SubLObject)module0642.NIL;
            SubLObject var314 = (SubLObject)module0642.NIL;
            var312 = var299;
            var313 = var312.first();
            for (var314 = (SubLObject)module0642.ZERO_INTEGER; module0642.NIL != var312; var312 = var312.rest(), var313 = var312.first(), var314 = Numbers.add((SubLObject)module0642.ONE_INTEGER, var314)) {
                final SubLObject var315 = conses_high.member(var314, var309, Symbols.symbol_function((SubLObject)module0642.EQL), (SubLObject)module0642.UNPROVIDED);
                final SubLObject var316 = Sequences.elt(var300, var314);
                f39020(module0015.$g324$.getGlobalValue());
                if (module0642.NIL != var315) {
                    f39046(module0015.$g327$.getGlobalValue());
                }
                if (module0642.NIL != var316) {
                    f39020(module0015.$g326$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var316);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_310 = module0015.$g533$.currentBinding(var310);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var310);
                    f39019(var313);
                }
                finally {
                    module0015.$g533$.rebind(var18_310, var310);
                }
                f39020(module0015.$g325$.getGlobalValue());
            }
        }
        finally {
            module0015.$g533$.rebind(var311, var310);
        }
        f39020(module0015.$g319$.getGlobalValue());
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39124(final SubLObject var286, final SubLObject var299, SubLObject var300, SubLObject var103, SubLObject var301, SubLObject var108) {
        if (var300 == module0642.UNPROVIDED) {
            var300 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var301 == module0642.UNPROVIDED) {
            var301 = (SubLObject)module0642.NIL;
        }
        if (var108 == module0642.UNPROVIDED) {
            var108 = (SubLObject)module0642.NIL;
        }
        return f39121(var286, var299, var300, var103, var301, var108);
    }
    
    public static SubLObject f39125(final SubLObject var286, final SubLObject var299, SubLObject var311) {
        if (var311 == module0642.UNPROVIDED) {
            var311 = (SubLObject)module0642.NIL;
        }
        return f39121(var286, var299, (SubLObject)module0642.NIL, (SubLObject)module0642.ONE_INTEGER, Sequences.position(var311, var299, Symbols.symbol_function((SubLObject)module0642.EQUAL), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED), (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39126(final SubLObject var286, final SubLObject var299, SubLObject var300, SubLObject var103, SubLObject var301) {
        if (var300 == module0642.UNPROVIDED) {
            var300 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var301 == module0642.UNPROVIDED) {
            var301 = (SubLObject)module0642.NIL;
        }
        return f39121(var286, var299, var300, var103, var301, (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39127(final SubLObject var286, final SubLObject var299, SubLObject var300, SubLObject var103, SubLObject var309) {
        if (var300 == module0642.UNPROVIDED) {
            var300 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var309 == module0642.UNPROVIDED) {
            var309 = (SubLObject)module0642.NIL;
        }
        return f39123(var286, var299, var300, var103, var309);
    }
    
    public static SubLObject f39128(final SubLObject var286, final SubLObject var299, SubLObject var300, SubLObject var103, SubLObject var301) {
        if (var300 == module0642.UNPROVIDED) {
            var300 = (SubLObject)module0642.NIL;
        }
        if (var103 == module0642.UNPROVIDED) {
            var103 = (SubLObject)module0642.NIL;
        }
        if (var301 == module0642.UNPROVIDED) {
            var301 = (SubLObject)module0642.NIL;
        }
        return f39124(var286, var299, var300, var103, var301, (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39129(final SubLObject var286, final SubLObject var299, SubLObject var311) {
        if (var311 == module0642.UNPROVIDED) {
            var311 = (SubLObject)module0642.NIL;
        }
        return f39125(var286, var299, var311);
    }
    
    public static SubLObject f39130(final SubLObject var312) {
        return f39131(var312);
    }
    
    public static SubLObject f39132(final SubLObject var313, final SubLObject var134) {
        final SubLThread var314 = SubLProcess.currentSubLThread();
        SubLObject var315 = (SubLObject)module0642.NIL;
        final SubLObject var316 = module0015.$g539$.currentBinding(var314);
        try {
            module0015.$g539$.bind(module0015.f800(var134), var314);
            final SubLObject var317 = f39130(var313);
            var315 = f39104(var317, var134);
        }
        finally {
            module0015.$g539$.rebind(var316, var314);
        }
        return var315;
    }
    
    public static SubLObject f39131(final SubLObject var312) {
        final SubLThread var313 = SubLProcess.currentSubLThread();
        if (module0015.$g539$.getDynamicValue(var313).isInteger()) {
            return Sequences.cconcatenate(var312, new SubLObject[] { module0642.$ic661$, print_high.princ_to_string(module0015.$g539$.getDynamicValue(var313)) });
        }
        return var312;
    }
    
    public static SubLObject f39133(final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        f39020((SubLObject)module0642.$ic662$);
        f39029((SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g155$.getGlobalValue());
        f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        f39029((SubLObject)module0642.UNPROVIDED);
        f39020(module0015.$g173$.getGlobalValue());
        f39019((SubLObject)module0642.$ic663$);
        f39020(module0015.$g174$.getGlobalValue());
        f39020(module0015.$g154$.getGlobalValue());
        f39029((SubLObject)module0642.UNPROVIDED);
        final SubLObject var136 = module0015.$g132$.getDynamicValue(var135);
        final SubLObject var137 = module0015.$g535$.currentBinding(var135);
        try {
            module0015.$g535$.bind((SubLObject)module0642.T, var135);
            f39020(module0015.$g133$.getGlobalValue());
            if (module0642.NIL != var136) {
                f39020(module0015.$g135$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(f39042(var136));
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            }
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var18_316 = module0015.$g533$.currentBinding(var135);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var135);
                f39020(module0015.$g189$.getGlobalValue());
                f39020((SubLObject)module0642.TWO_INTEGER);
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                f39019((SubLObject)module0642.$ic663$);
                f39020(module0015.$g190$.getGlobalValue());
                f39020((SubLObject)module0642.TWO_INTEGER);
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                f39020(module0015.$g282$.getGlobalValue());
                f39020(module0015.$g284$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39020(module0110.$g570$.getDynamicValue(var135));
                f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_317 = module0015.$g533$.currentBinding(var135);
                final SubLObject var138 = module0015.$g541$.currentBinding(var135);
                final SubLObject var139 = module0015.$g539$.currentBinding(var135);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var135);
                    module0015.$g541$.bind((SubLObject)module0642.T, var135);
                    module0015.$g539$.bind(module0015.f797(), var135);
                    module0656.f39790((SubLObject)module0642.$ic664$, (SubLObject)module0642.$ic665$);
                    module0015.f741();
                    f39020(module0015.$g203$.getGlobalValue());
                    final SubLObject var18_318 = module0015.$g537$.currentBinding(var135);
                    try {
                        module0015.$g537$.bind((SubLObject)module0642.T, var135);
                        SubLObject var140 = var134;
                        SubLObject var141 = (SubLObject)module0642.NIL;
                        var141 = var140.first();
                        while (module0642.NIL != var140) {
                            f39024(var141);
                            f39028((SubLObject)module0642.UNPROVIDED);
                            var140 = var140.rest();
                            var141 = var140.first();
                        }
                    }
                    finally {
                        module0015.$g537$.rebind(var18_318, var135);
                    }
                    f39020(module0015.$g204$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var135));
                }
                finally {
                    module0015.$g539$.rebind(var139, var135);
                    module0015.$g541$.rebind(var138, var135);
                    module0015.$g533$.rebind(var18_317, var135);
                }
                f39020(module0015.$g283$.getGlobalValue());
                f39029((SubLObject)module0642.UNPROVIDED);
                f39050();
            }
            finally {
                module0015.$g533$.rebind(var18_316, var135);
            }
            f39020(module0015.$g134$.getGlobalValue());
            f39029((SubLObject)module0642.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var137, var135);
        }
        f39020(module0015.$g156$.getGlobalValue());
        f39029((SubLObject)module0642.UNPROVIDED);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39134(final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        SubLObject var136 = (SubLObject)module0642.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var134, var134, (SubLObject)module0642.$ic667$);
        var136 = var134.first();
        final SubLObject var137 = var134.rest();
        if (module0642.NIL == var137) {
            SubLObject var138 = (SubLObject)module0642.NIL;
            try {
                final SubLObject var139 = stream_macros.$stream_requires_locking$.currentBinding(var135);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)module0642.NIL, var135);
                    var138 = compatibility.open_text(var136, (SubLObject)module0642.$ic668$);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(var139, var135);
                }
                if (!var138.isStream()) {
                    Errors.error((SubLObject)module0642.$ic669$, var136);
                }
                SubLObject var140;
                SubLObject var141;
                for (var140 = var138, var141 = (SubLObject)module0642.NIL, var141 = streams_high.read_char(var140, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED); module0642.$ic670$ != var141; var141 = streams_high.read_char(var140, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED)) {
                    f39012(var141, (SubLObject)module0642.UNPROVIDED);
                }
            }
            finally {
                final SubLObject var142 = Threads.$is_thread_performing_cleanupP$.currentBinding(var135);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0642.T, var135);
                    if (var138.isStream()) {
                        streams_high.close(var138, (SubLObject)module0642.UNPROVIDED);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var142, var135);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var134, (SubLObject)module0642.$ic667$);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39135(final SubLObject var5, SubLObject var325) {
        if (var325 == module0642.UNPROVIDED) {
            var325 = (SubLObject)module0642.$ic40$;
        }
        final SubLObject var326 = (SubLObject)module0642.$ic19$;
        final SubLObject var327 = (SubLObject)module0642.$ic21$;
        final SubLObject var328 = (SubLObject)module0642.$ic672$;
        final SubLObject var329 = (SubLObject)module0642.$ic673$;
        final SubLObject var330 = (SubLObject)module0642.$ic674$;
        final SubLObject var331 = (SubLObject)module0642.$ic675$;
        final SubLObject var332 = (SubLObject)module0642.$ic676$;
        final SubLObject var333 = module0038.f2659((SubLObject)module0642.$ic675$, (SubLObject)module0642.$ic675$, var5, Symbols.symbol_function((SubLObject)module0642.EQUALP));
        final SubLObject var334 = module0038.f2659((SubLObject)module0642.$ic677$, (SubLObject)module0642.$ic677$, var333, Symbols.symbol_function((SubLObject)module0642.EQUALP));
        final SubLObject var335 = module0038.f2738(var334, (SubLObject)ConsesLow.list(var329, var330, var331, var332, var326, var327, var328), (SubLObject)module0642.NIL, (SubLObject)module0642.T, (SubLObject)module0642.T, (SubLObject)module0642.$ic678$, (SubLObject)module0642.UNPROVIDED);
        SubLObject var336 = (SubLObject)module0642.NIL;
        SubLObject var337 = (SubLObject)module0642.NIL;
        SubLObject var338 = (SubLObject)module0642.NIL;
        SubLObject var339 = (SubLObject)module0642.NIL;
        SubLObject var340 = (SubLObject)module0642.NIL;
        SubLObject var341 = (SubLObject)module0642.NIL;
        try {
            var341 = streams_high.make_private_string_output_stream();
            SubLObject var342 = var335;
            SubLObject var343 = (SubLObject)module0642.NIL;
            var343 = var342.first();
            while (module0642.NIL != var342) {
                if (module0642.NIL != var337) {
                    if (var343.equalp(var330)) {
                        var337 = (SubLObject)module0642.NIL;
                    }
                }
                else if (module0642.NIL != var338) {
                    if (var343.equalp(var329)) {
                        var337 = (SubLObject)module0642.T;
                    }
                    else if (var343.equalp(var332)) {
                        var338 = (SubLObject)module0642.NIL;
                    }
                }
                else if (module0642.NIL != var336) {
                    if (module0642.NIL != var339) {
                        if (var343.equalp(var328)) {
                            var339 = (SubLObject)module0642.NIL;
                        }
                    }
                    else if (var343.equalp(var329)) {
                        var337 = (SubLObject)module0642.T;
                    }
                    else if (var343.equalp(var328)) {
                        var339 = (SubLObject)module0642.T;
                    }
                    else if (var343.equalp(var327)) {
                        var336 = (SubLObject)module0642.NIL;
                    }
                }
                else if (var343.equalp(var329)) {
                    var337 = (SubLObject)module0642.T;
                }
                else if (var343.equalp(var331)) {
                    var338 = (SubLObject)module0642.T;
                    if (module0642.NIL == module0038.f2608(var325)) {
                        print_high.princ(var325, var341);
                    }
                }
                else if (var343.equalp(var326)) {
                    var336 = (SubLObject)module0642.T;
                    if (module0642.NIL == module0038.f2608(var325)) {
                        print_high.princ(var325, var341);
                    }
                }
                else if (module0642.NIL == module0038.f2608(var343)) {
                    print_high.princ(var343, var341);
                }
                var342 = var342.rest();
                var343 = var342.first();
            }
            var340 = streams_high.get_output_stream_string(var341);
        }
        finally {
            final SubLObject var344 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0642.T);
                streams_high.close(var341, (SubLObject)module0642.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var344);
            }
        }
        return var340;
    }
    
    public static SubLObject f39136(final SubLObject var342) {
        return f39135(var342, (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39137(SubLObject var343) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = (SubLObject)module0642.NIL;
        SubLObject var346 = (SubLObject)module0642.NIL;
        try {
            var344.throwStack.push(module0642.$ic680$);
            final SubLObject var347 = Errors.$error_handler$.currentBinding(var344);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0642.$ic681$), var344);
                try {
                    if (module0642.NIL == module0038.f2684(Strings.string_downcase(var343, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED), (SubLObject)module0642.$ic682$) && module0642.NIL == module0589.f35909(var343)) {
                        var343 = Sequences.cconcatenate((SubLObject)module0642.$ic682$, var343);
                    }
                    var344.resetMultipleValues();
                    SubLObject var348 = module0589.f35940(var343);
                    SubLObject var349 = var344.secondMultipleValue();
                    SubLObject var350 = var344.thirdMultipleValue();
                    final SubLObject var351 = var344.fourthMultipleValue();
                    var344.resetMultipleValues();
                    if (module0642.NIL == var348) {
                        var348 = var343;
                    }
                    if (module0642.NIL == var350) {
                        var350 = (SubLObject)module0642.$ic20$;
                    }
                    if (!var349.isInteger()) {
                        var349 = (SubLObject)module0642.$ic683$;
                    }
                    SubLObject var352 = (SubLObject)module0642.NIL;
                    try {
                        var352 = streams_high.make_private_string_output_stream();
                        SubLObject var353 = (SubLObject)module0642.NIL;
                        try {
                            var353 = streams_high.make_private_string_input_stream(module0589.f35974((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var351)), var350, var348, var349, (SubLObject)module0642.$ic684$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED), (SubLObject)module0642.ZERO_INTEGER, (SubLObject)module0642.NIL);
                            SubLObject var354 = module0590.f35984(var353, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                            while (module0642.NIL != var354) {
                                final SubLObject var355 = var354.first();
                                if (module0642.NIL != module0590.f36056(var355, (SubLObject)module0642.$ic675$)) {
                                    var354 = module0590.f36061(module0590.f36062(var354, (SubLObject)module0642.$ic676$, (SubLObject)module0642.UNPROVIDED), (SubLObject)module0642.UNPROVIDED);
                                }
                                else if (module0642.NIL != module0590.f36056(var355, (SubLObject)module0642.$ic685$)) {
                                    var354 = module0590.f36061(module0590.f36062(var354, (SubLObject)module0642.$ic686$, (SubLObject)module0642.UNPROVIDED), (SubLObject)module0642.UNPROVIDED);
                                }
                                else if (module0642.NIL != module0590.f36056(var355, (SubLObject)module0642.$ic687$)) {
                                    print_high.princ((SubLObject)module0642.$ic40$, var352);
                                    var354 = module0590.f36061(var354, (SubLObject)module0642.UNPROVIDED);
                                }
                                else if (module0642.NIL != module0590.f36056(var355, (SubLObject)module0642.$ic19$)) {
                                    var354 = module0590.f36061(var354, (SubLObject)module0642.UNPROVIDED);
                                }
                                else {
                                    PrintLow.format(var352, (SubLObject)module0642.$ic34$, var355);
                                    var354 = module0590.f36061(var354, (SubLObject)module0642.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            final SubLObject var18_352 = Threads.$is_thread_performing_cleanupP$.currentBinding(var344);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0642.T, var344);
                                streams_high.close(var353, (SubLObject)module0642.UNPROVIDED);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var18_352, var344);
                            }
                        }
                        var345 = streams_high.get_output_stream_string(var352);
                    }
                    finally {
                        final SubLObject var18_353 = Threads.$is_thread_performing_cleanupP$.currentBinding(var344);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0642.T, var344);
                            streams_high.close(var352, (SubLObject)module0642.UNPROVIDED);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var18_353, var344);
                        }
                    }
                }
                catch (Throwable var356) {
                    Errors.handleThrowable(var356, (SubLObject)module0642.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var347, var344);
            }
        }
        catch (Throwable var357) {
            var346 = Errors.handleThrowable(var357, (SubLObject)module0642.$ic680$);
        }
        finally {
            var344.throwStack.pop();
        }
        if (var345.isString()) {
            return module0038.f2664(var345, module0642.$g4978$.getGlobalValue(), (SubLObject)module0642.UNPROVIDED);
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39138(final SubLObject var106) {
        return Sequences.cconcatenate(module0642.$g4979$.getGlobalValue(), var106);
    }
    
    public static SubLObject f39139(final SubLObject var106, final SubLObject var356, final SubLObject var103) {
        final SubLObject var357 = f39138(var106);
        final SubLObject var358 = Sequences.cconcatenate((SubLObject)module0642.$ic689$, new SubLObject[] { var106, module0642.$ic690$ });
        f39020(module0015.$g295$.getGlobalValue());
        f39020(module0015.$g305$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.$ic691$);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        if (module0642.NIL != var357) {
            f39020(module0015.$g157$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var357);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var357) {
            f39020(module0015.$g302$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var357);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var356) {
            f39020(module0015.$g307$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39019(var356);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var103) {
            f39020(module0015.$g303$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var103);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var358) {
            f39020(module0015.$g323$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var358);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        if (module0642.NIL != var358) {
            f39020(module0015.$g161$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(var358);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        }
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        f39069(var106, (SubLObject)module0642.$ic46$, (SubLObject)module0642.NIL);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39140(final SubLObject var80, final SubLObject var81) {
        SubLObject var83;
        final SubLObject var82 = var83 = var80.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0642.$ic692$);
        final SubLObject var84 = var83.rest();
        var83 = var83.first();
        SubLObject var85 = (SubLObject)module0642.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var83, var82, (SubLObject)module0642.$ic692$);
        var85 = var83.first();
        var83 = var83.rest();
        final SubLObject var86 = (SubLObject)(var83.isCons() ? var83.first() : module0642.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var83, var82, (SubLObject)module0642.$ic692$);
        var83 = var83.rest();
        if (module0642.NIL == var83) {
            final SubLObject var87;
            var83 = (var87 = var84);
            final SubLObject var88 = (SubLObject)module0642.$ic693$;
            return (SubLObject)ConsesLow.list((SubLObject)module0642.$ic694$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var88, (SubLObject)ConsesLow.list((SubLObject)module0642.$ic695$, var86))), (SubLObject)ConsesLow.listS((SubLObject)module0642.$ic696$, (SubLObject)ConsesLow.listS((SubLObject)module0642.$ic697$, (SubLObject)module0642.$ic698$, var88, (SubLObject)module0642.$ic699$), (SubLObject)ConsesLow.listS((SubLObject)module0642.$ic700$, var85, (SubLObject)module0642.$ic701$), ConsesLow.append(var87, (SubLObject)module0642.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var82, (SubLObject)module0642.$ic692$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39141(final SubLObject var134) {
        return module0035.sublisp_boolean(f39104(module0642.$g4980$.getGlobalValue(), var134));
    }
    
    public static SubLObject f39142(final SubLObject var5) {
        SubLObject var6 = (SubLObject)module0642.NIL;
        SubLObject var7 = (SubLObject)module0642.NIL;
        try {
            var7 = streams_high.make_private_string_input_stream(var5, (SubLObject)module0642.ZERO_INTEGER, (SubLObject)module0642.NIL);
            final SubLObject var8 = streams_high.read_line(var7, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED);
            SubLObject var9 = (SubLObject)module0642.NIL;
            while (module0642.NIL == var9) {
                final SubLObject var10 = streams_high.read_line(var7, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var11 = streams_high.read_line(var7, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED);
                SubLObject var12 = (SubLObject)module0642.NIL;
                SubLObject var13 = (SubLObject)module0642.NIL;
                if (module0642.$ic670$ == var10) {
                    var9 = (SubLObject)module0642.T;
                }
                else {
                    var12 = f39143(var10);
                    if (module0642.NIL != Sequences.search((SubLObject)module0642.$ic703$, var11, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
                        var13 = f39144(var7, var8);
                    }
                    else {
                        var13 = streams_high.read_line(var7, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED);
                        f39145(var7, var8);
                    }
                    var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var12, Sequences.delete((SubLObject)Characters.CHAR_return, var13, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)), var6);
                }
            }
        }
        finally {
            final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0642.T);
                streams_high.close(var7, (SubLObject)module0642.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
            }
        }
        var6 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0642.$g4980$.getGlobalValue(), (SubLObject)module0642.$ic704$), var6);
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f39145(final SubLObject var340, final SubLObject var366) {
        return Strings.string_equal(var366, streams_high.read_line(var340, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39143(final SubLObject var371) {
        final SubLObject var372 = Sequences.position((SubLObject)Characters.CHAR_quotation, var371, Symbols.symbol_function((SubLObject)module0642.$ic705$), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var373 = Numbers.add((SubLObject)module0642.ONE_INTEGER, var372);
        final SubLObject var374 = Sequences.position((SubLObject)Characters.CHAR_quotation, var371, Symbols.symbol_function((SubLObject)module0642.$ic705$), Symbols.symbol_function((SubLObject)module0642.IDENTITY), var373, (SubLObject)module0642.UNPROVIDED);
        return module0038.f2623(var371, var373, var374);
    }
    
    public static SubLObject f39144(final SubLObject var324, final SubLObject var366) {
        streams_high.read_line(var324, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED);
        SubLObject var367 = streams_high.read_line(var324, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic670$, (SubLObject)module0642.UNPROVIDED);
        SubLObject var368 = (SubLObject)module0642.$ic46$;
        while (module0642.NIL == Strings.string_equal(var366, var367, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED)) {
            var368 = Sequences.cconcatenate(var368, new SubLObject[] { var367, module0642.$g4981$.getGlobalValue() });
            var367 = streams_high.read_line(var324, (SubLObject)module0642.NIL, var366, (SubLObject)module0642.UNPROVIDED);
        }
        return Sequences.delete((SubLObject)Characters.CHAR_return, var368, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39146(final SubLObject var377) {
        SubLObject var378 = (SubLObject)module0642.NIL;
        SubLObject var379 = (SubLObject)module0642.NIL;
        try {
            var379 = streams_high.make_private_string_output_stream();
            SubLObject var380 = (SubLObject)module0642.NIL;
            SubLObject var381 = (SubLObject)module0642.NIL;
            SubLObject var382 = (SubLObject)module0642.NIL;
            var380 = var377;
            var381 = var380.first();
            for (var382 = (SubLObject)module0642.ZERO_INTEGER; module0642.NIL != var380; var380 = var380.rest(), var381 = var380.first(), var382 = Numbers.add((SubLObject)module0642.ONE_INTEGER, var382)) {
                SubLObject var384;
                final SubLObject var383 = var384 = var381;
                SubLObject var385 = (SubLObject)module0642.NIL;
                SubLObject var386 = (SubLObject)module0642.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var384, var383, (SubLObject)module0642.$ic706$);
                var385 = var384.first();
                var384 = var384.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var384, var383, (SubLObject)module0642.$ic706$);
                var386 = var384.first();
                var384 = var384.rest();
                if (module0642.NIL == var384) {
                    if (var382.isPositive()) {
                        streams_high.write_char((SubLObject)Characters.CHAR_ampersand, var379);
                    }
                    streams_high.write_string(var385, var379, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                    streams_high.write_char((SubLObject)Characters.CHAR_equal, var379);
                    final SubLObject var387 = var386;
                    SubLObject var10_381;
                    SubLObject var388;
                    SubLObject var389;
                    SubLObject var390;
                    for (var388 = (var10_381 = Sequences.length(var387)), var389 = (SubLObject)module0642.NIL, var389 = (SubLObject)module0642.ZERO_INTEGER; !var389.numGE(var10_381); var389 = module0048.f_1X(var389)) {
                        var390 = Strings.sublisp_char(var387, var389);
                        if (module0642.NIL != Characters.charE((SubLObject)Characters.CHAR_space, var390)) {
                            streams_high.write_char((SubLObject)Characters.CHAR_plus, var379);
                        }
                        else if (module0642.NIL != Characters.alphanumericp(var390)) {
                            streams_high.write_char(var390, var379);
                        }
                        else {
                            PrintLow.format(var379, (SubLObject)module0642.$ic707$, Characters.char_code(var390));
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var383, (SubLObject)module0642.$ic706$);
                }
            }
            var378 = streams_high.get_output_stream_string(var379);
        }
        finally {
            final SubLObject var391 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0642.T);
                streams_high.close(var379, (SubLObject)module0642.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var391);
            }
        }
        return var378;
    }
    
    public static SubLObject f39147(final SubLObject var382) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0642.NIL != module0035.f2002(var382, module0642.$g4983$.getGlobalValue(), (SubLObject)module0642.UNPROVIDED) && module0642.NIL != Strings.string_equal(var382, module0642.$g4982$.getGlobalValue(), (SubLObject)module0642.ZERO_INTEGER, module0642.$g4983$.getGlobalValue(), (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED));
    }
    
    public static SubLObject f39148(final SubLObject var383, SubLObject var104, SubLObject var189, SubLObject var384, SubLObject var385) {
        if (var104 == module0642.UNPROVIDED) {
            var104 = (SubLObject)module0642.$ic709$;
        }
        if (var189 == module0642.UNPROVIDED) {
            var189 = var104;
        }
        if (var384 == module0642.UNPROVIDED) {
            var384 = (SubLObject)module0642.$ic710$;
        }
        if (var385 == module0642.UNPROVIDED) {
            var385 = (SubLObject)module0642.NIL;
        }
        f39149(var383, var104, var189, var384, var385);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39150(final SubLObject var383) {
        if (var383.first().isList()) {
            SubLObject var384 = (SubLObject)module0642.ZERO_INTEGER;
            SubLObject var385 = var383;
            SubLObject var386 = (SubLObject)module0642.NIL;
            var386 = var385.first();
            while (module0642.NIL != var385) {
                var384 = Numbers.add(var384, f39150(var386));
                var385 = var385.rest();
                var386 = var385.first();
            }
            return var384;
        }
        return conses_high.getf(var383, (SubLObject)module0642.$ic711$, (SubLObject)module0642.UNPROVIDED);
    }
    
    public static SubLObject f39151(final SubLObject var383, final SubLObject var387) {
        if (var383.first().isList()) {
            SubLObject var388 = (SubLObject)module0642.ZERO_INTEGER;
            SubLObject var389 = var383;
            SubLObject var390 = (SubLObject)module0642.NIL;
            var390 = var389.first();
            while (module0642.NIL != var389) {
                var388 = Numbers.add(var388, f39151(var390, var387));
                var389 = var389.rest();
                var390 = var389.first();
            }
            return var388;
        }
        if (var387.equal(conses_high.getf(var383, (SubLObject)module0642.$ic712$, (SubLObject)module0642.UNPROVIDED))) {
            return conses_high.getf(var383, (SubLObject)module0642.$ic711$, (SubLObject)module0642.UNPROVIDED);
        }
        return (SubLObject)module0642.ZERO_INTEGER;
    }
    
    public static SubLObject f39152(final SubLObject var388, final SubLObject var389, final SubLObject var390, final SubLObject var391, final SubLObject var392) {
        assert module0642.NIL != Types.function_spec_p(var389) : var389;
        assert module0642.NIL != Types.function_spec_p(var390) : var390;
        assert module0642.NIL != Types.function_spec_p(var391) : var391;
        assert module0642.NIL != Types.function_spec_p(var392) : var392;
        return f39153(var388, var389, var390, var391, var392, module0077.f5313(Symbols.symbol_function((SubLObject)module0642.EQUAL), (SubLObject)module0642.UNPROVIDED));
    }
    
    public static SubLObject f39149(final SubLObject var383, final SubLObject var104, final SubLObject var189, final SubLObject var384, final SubLObject var385) {
        final SubLThread var386 = SubLProcess.currentSubLThread();
        if (!var383.first().isList()) {
            final SubLObject var387 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic711$, var383);
            final SubLObject var388 = (SubLObject)((module0642.NIL != var387) ? conses_high.cadr(var387) : module0642.NIL);
            final SubLObject var389 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic714$, var383);
            final SubLObject var390 = (SubLObject)((module0642.NIL != var389) ? conses_high.cadr(var389) : module0642.NIL);
            final SubLObject var391 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic715$, var383);
            final SubLObject var392 = (SubLObject)((module0642.NIL != var391) ? conses_high.cadr(var391) : module0642.NIL);
            final SubLObject var393 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic712$, var383);
            final SubLObject var394 = (SubLObject)((module0642.NIL != var393) ? conses_high.cadr(var393) : module0642.NIL);
            final SubLObject var395 = f39154(var392, var394, var385);
            final SubLObject var396 = conses_high.getf(var385, (SubLObject)module0642.$ic716$, (SubLObject)module0642.$ic717$);
            f39020(module0015.$g346$.getGlobalValue());
            f39020(module0015.$g352$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ONE_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g353$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g354$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var397 = module0015.$g533$.currentBinding(var386);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var386);
                f39020(module0015.$g364$.getGlobalValue());
                if (module0642.NIL != var189) {
                    f39020(module0015.$g367$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var189);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_400 = module0015.$g533$.currentBinding(var386);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var386);
                    f39020(module0015.$g360$.getGlobalValue());
                    f39020(module0015.$g370$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(f39049((SubLObject)module0642.$ic144$));
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(module0015.$g373$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(f39049((SubLObject)module0642.$ic144$));
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    if (module0642.NIL != var395) {
                        f39020(module0015.$g374$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(var395);
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    }
                    if (module0642.NIL != var104) {
                        f39020(module0015.$g375$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(var104);
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    }
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_401 = module0015.$g533$.currentBinding(var386);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var386);
                        final SubLObject var398 = var396;
                        f39020(module0015.$g219$.getGlobalValue());
                        if (module0642.NIL != var398) {
                            f39020(module0015.$g222$.getGlobalValue());
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                            f39020(f39042(var398));
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        }
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_402 = module0015.$g533$.currentBinding(var386);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var386);
                            if (Numbers.multiply(var104, var189).numG((SubLObject)module0642.$ic718$)) {
                                if (Numbers.multiply(var104, var189).numG((SubLObject)module0642.$ic719$)) {
                                    f39019(var390);
                                    f39026((SubLObject)module0642.UNPROVIDED);
                                }
                                f39019(var388);
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var18_402, var386);
                        }
                        f39020(module0015.$g220$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var18_401, var386);
                    }
                    f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var18_400, var386);
                }
                f39020(module0015.$g365$.getGlobalValue());
                f39029((SubLObject)module0642.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var397, var386);
            }
            f39020(module0015.$g347$.getGlobalValue());
        }
        else if (var384 == module0642.$ic710$) {
            f39020(module0015.$g346$.getGlobalValue());
            f39020(module0015.$g352$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g353$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g354$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var399 = module0015.$g533$.currentBinding(var386);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var386);
                final SubLObject var400 = f39150(var383);
                SubLObject var401 = var383;
                SubLObject var402 = (SubLObject)module0642.NIL;
                var402 = var401.first();
                while (module0642.NIL != var401) {
                    final SubLObject var403 = f39150(var402);
                    final SubLObject var404 = Numbers.ceiling(Numbers.multiply(var189, Numbers.divide(var403, var400)), (SubLObject)module0642.UNPROVIDED);
                    f39020(module0015.$g364$.getGlobalValue());
                    if (module0642.NIL != var404) {
                        f39020(module0015.$g367$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(var404);
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    }
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                    final SubLObject var18_403 = module0015.$g533$.currentBinding(var386);
                    try {
                        module0015.$g533$.bind((SubLObject)module0642.T, var386);
                        f39020(module0015.$g360$.getGlobalValue());
                        f39020(module0015.$g370$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic144$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(module0015.$g373$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic144$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        if (module0642.NIL != var104) {
                            f39020(module0015.$g375$.getGlobalValue());
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                            f39020(var104);
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        }
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_404 = module0015.$g533$.currentBinding(var386);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var386);
                            f39149(var402, var104, var404, (SubLObject)module0642.$ic720$, var385);
                        }
                        finally {
                            module0015.$g533$.rebind(var18_404, var386);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var18_403, var386);
                    }
                    f39020(module0015.$g365$.getGlobalValue());
                    f39029((SubLObject)module0642.UNPROVIDED);
                    var401 = var401.rest();
                    var402 = var401.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var399, var386);
            }
            f39020(module0015.$g347$.getGlobalValue());
        }
        else if (var384 == module0642.$ic720$) {
            f39020(module0015.$g346$.getGlobalValue());
            f39020(module0015.$g352$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g353$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g354$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39020((SubLObject)module0642.ZERO_INTEGER);
            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var399 = module0015.$g533$.currentBinding(var386);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var386);
                final SubLObject var400 = f39150(var383);
                f39020(module0015.$g364$.getGlobalValue());
                if (module0642.NIL != var189) {
                    f39020(module0015.$g367$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020(var189);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                }
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_405 = module0015.$g533$.currentBinding(var386);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var386);
                    SubLObject var405 = var383;
                    SubLObject var406 = (SubLObject)module0642.NIL;
                    var406 = var405.first();
                    while (module0642.NIL != var405) {
                        final SubLObject var407 = f39150(var406);
                        final SubLObject var408 = Numbers.ceiling(Numbers.multiply(var104, Numbers.divide(var407, var400)), (SubLObject)module0642.UNPROVIDED);
                        f39020(module0015.$g360$.getGlobalValue());
                        f39020(module0015.$g370$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic144$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(module0015.$g373$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(f39049((SubLObject)module0642.$ic144$));
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        if (module0642.NIL != var408) {
                            f39020(module0015.$g375$.getGlobalValue());
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                            f39020(var408);
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        }
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_406 = module0015.$g533$.currentBinding(var386);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var386);
                            f39149(var406, var408, var189, (SubLObject)module0642.$ic710$, var385);
                        }
                        finally {
                            module0015.$g533$.rebind(var18_406, var386);
                        }
                        f39020(module0015.$g361$.getGlobalValue());
                        var405 = var405.rest();
                        var406 = var405.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var18_405, var386);
                }
                f39020(module0015.$g365$.getGlobalValue());
                f39029((SubLObject)module0642.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var399, var386);
            }
            f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39154(SubLObject var70, final SubLObject var387, final SubLObject var385) {
        if (module0642.NIL == var70) {
            final SubLObject var388 = cdestructuring_bind.property_list_member((SubLObject)module0642.$ic721$, var385);
            final SubLObject var389 = (SubLObject)((module0642.NIL != var388) ? conses_high.cadr(var388) : module0642.NIL);
            if (module0642.NIL != var389) {
                var70 = module0035.f2294(var389, var387, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
            }
        }
        return var70;
    }
    
    public static SubLObject f39153(final SubLObject var388, final SubLObject var389, final SubLObject var390, final SubLObject var391, final SubLObject var392, final SubLObject var415) {
        final SubLThread var416 = SubLProcess.currentSubLThread();
        final SubLObject var417 = f39155(var388, var390, var391, var392);
        final SubLObject var418 = Functions.funcall(var389, var388);
        SubLObject var419 = (SubLObject)module0642.NIL;
        if (module0642.NIL == module0077.f5320(var388, var415)) {
            if (module0642.NIL != var418) {
                SubLObject var420 = (SubLObject)module0642.NIL;
                if (!module0642.$g4984$.getDynamicValue(var416).numGE(module0642.$g4985$.getGlobalValue())) {
                    final SubLObject var421 = module0642.$g4984$.currentBinding(var416);
                    try {
                        module0642.$g4984$.bind(module0048.f_1X(module0642.$g4984$.getDynamicValue(var416)), var416);
                        SubLObject var422 = var418;
                        SubLObject var423 = (SubLObject)module0642.NIL;
                        var423 = var422.first();
                        while (module0642.NIL != var422) {
                            if (module0642.NIL == module0077.f5320(var423, var415)) {
                                final SubLObject var424 = f39153(var423, var389, var390, var391, var392, var415);
                                if (module0642.NIL != module0048.f3293(f39150(var424))) {
                                    var420 = (SubLObject)ConsesLow.cons(var424, var420);
                                }
                                module0077.f5326(var423, var415);
                            }
                            var422 = var422.rest();
                            var423 = var422.first();
                        }
                    }
                    finally {
                        module0642.$g4984$.rebind(var421, var416);
                    }
                }
                if (module0642.NIL != module0048.f3293(f39150(var417))) {
                    var420 = (SubLObject)ConsesLow.cons(var417, var420);
                }
                return Sequences.nreverse(var420);
            }
            var419 = var417;
        }
        module0077.f5326(var388, var415);
        return var419;
    }
    
    public static SubLObject f39155(final SubLObject var388, final SubLObject var390, final SubLObject var391, final SubLObject var392) {
        final SubLObject var393 = Functions.funcall(var390, var388);
        final SubLObject var394 = Functions.funcall(var391, var388);
        final SubLObject var395 = Functions.funcall(var392, var388);
        SubLObject var396 = (SubLObject)module0642.NIL;
        if (module0642.NIL != module0048.f3293(var393)) {
            var396 = conses_high.putf(var396, (SubLObject)module0642.$ic711$, var393);
        }
        if (module0642.NIL != var394) {
            var396 = conses_high.putf(var396, (SubLObject)module0642.$ic714$, var394);
        }
        if (module0642.NIL != var395) {
            var396 = conses_high.putf(var396, (SubLObject)module0642.$ic712$, var395);
        }
        return var396;
    }
    
    public static SubLObject f39156(SubLObject var421, SubLObject var422, SubLObject var423, SubLObject var424, SubLObject var425, SubLObject var426) {
        if (var421 == module0642.UNPROVIDED) {
            var421 = (SubLObject)module0642.$ic724$;
        }
        if (var422 == module0642.UNPROVIDED) {
            var422 = (SubLObject)module0642.$ic725$;
        }
        if (var423 == module0642.UNPROVIDED) {
            var423 = (SubLObject)module0642.$ic726$;
        }
        if (var424 == module0642.UNPROVIDED) {
            var424 = (SubLObject)module0642.$ic727$;
        }
        if (var425 == module0642.UNPROVIDED) {
            var425 = (SubLObject)module0642.NIL;
        }
        if (var426 == module0642.UNPROVIDED) {
            var426 = (SubLObject)module0642.NIL;
        }
        final SubLThread var427 = SubLProcess.currentSubLThread();
        final SubLObject var428 = Sequences.cconcatenate((SubLObject)module0642.$ic728$, var421);
        final SubLObject var429 = Sequences.cconcatenate((SubLObject)module0642.$ic729$, new SubLObject[] { module0006.f203(var421), module0642.$ic730$, module0006.f203(var428), module0642.$ic731$, module0006.f203(var422), module0642.$ic732$ });
        f39020(module0015.$g346$.getGlobalValue());
        f39020(module0015.$g352$.getGlobalValue());
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39020((SubLObject)module0642.ZERO_INTEGER);
        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
        final SubLObject var430 = module0015.$g533$.currentBinding(var427);
        try {
            module0015.$g533$.bind((SubLObject)module0642.T, var427);
            f39020(module0015.$g364$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var18_429 = module0015.$g533$.currentBinding(var427);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var427);
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_430 = module0015.$g533$.currentBinding(var427);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var427);
                    f39019(var423);
                }
                finally {
                    module0015.$g533$.rebind(var18_430, var427);
                }
                f39020(module0015.$g361$.getGlobalValue());
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_431 = module0015.$g533$.currentBinding(var427);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var427);
                    f39075(var421, var425, (SubLObject)module0642.$ic733$);
                }
                finally {
                    module0015.$g533$.rebind(var18_431, var427);
                }
                f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var18_429, var427);
            }
            f39020(module0015.$g365$.getGlobalValue());
            f39029((SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g364$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var18_432 = module0015.$g533$.currentBinding(var427);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var427);
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_433 = module0015.$g533$.currentBinding(var427);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var427);
                    if (module0642.NIL != var426) {
                        f39020(module0015.$g219$.getGlobalValue());
                        if (module0642.NIL != module0015.$g495$.getGlobalValue()) {
                            f39020(module0015.$g222$.getGlobalValue());
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                            f39020(f39042(module0015.$g495$.getGlobalValue()));
                            f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        }
                        f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                        final SubLObject var18_434 = module0015.$g533$.currentBinding(var427);
                        try {
                            module0015.$g533$.bind((SubLObject)module0642.T, var427);
                            f39019(var424);
                        }
                        finally {
                            module0015.$g533$.rebind(var18_434, var427);
                        }
                        f39020(module0015.$g220$.getGlobalValue());
                    }
                    else {
                        f39019(var424);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var18_433, var427);
                }
                f39020(module0015.$g361$.getGlobalValue());
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_435 = module0015.$g533$.currentBinding(var427);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var427);
                    f39020(module0015.$g295$.getGlobalValue());
                    f39020(module0015.$g305$.getGlobalValue());
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    f39020((SubLObject)module0642.$ic734$);
                    f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    if (module0642.NIL != var428) {
                        f39020(module0015.$g157$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(var428);
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    }
                    if (module0642.NIL != var429) {
                        f39020(module0015.$g163$.getGlobalValue());
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                        f39020(var429);
                        f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0642.UNPROVIDED);
                    }
                    f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var18_435, var427);
                }
                f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var18_432, var427);
            }
            f39020(module0015.$g365$.getGlobalValue());
            f39029((SubLObject)module0642.UNPROVIDED);
            f39020(module0015.$g364$.getGlobalValue());
            f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
            final SubLObject var18_436 = module0015.$g533$.currentBinding(var427);
            try {
                module0015.$g533$.bind((SubLObject)module0642.T, var427);
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_437 = module0015.$g533$.currentBinding(var427);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var427);
                    f39073((SubLObject)module0642.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var18_437, var427);
                }
                f39020(module0015.$g361$.getGlobalValue());
                f39020(module0015.$g360$.getGlobalValue());
                f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0642.UNPROVIDED);
                final SubLObject var18_438 = module0015.$g533$.currentBinding(var427);
                try {
                    module0015.$g533$.bind((SubLObject)module0642.T, var427);
                    f39074((SubLObject)module0642.$ic735$, (SubLObject)module0642.UNPROVIDED, (SubLObject)module0642.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var18_438, var427);
                }
                f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var18_436, var427);
            }
            f39020(module0015.$g365$.getGlobalValue());
            f39029((SubLObject)module0642.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var430, var427);
        }
        f39020(module0015.$g347$.getGlobalValue());
        f39069(var422, (SubLObject)module0642.NIL, (SubLObject)module0642.$ic683$);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39157() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39011", "S#33679", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39012", "S#908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39013", "S#33677", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39015", "S#42751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39014", "S#42752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39016", "S#42753", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39017", "S#42754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39018", "S#39917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39019", "S#1531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39021", "S#26337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39022", "S#42755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39023", "S#42756", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39024", "S#1552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39025", "S#42757", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39028", "S#1648", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39029", "S#906", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39030", "S#42758", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39031", "S#33678", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39032", "S#1516", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39020", "S#907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39033", "S#42759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39034", "S#42760", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39035", "S#42761", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39038", "S#42762", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39039", "S#42763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39040", "S#42764", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39036", "S#42765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39037", "S#42766", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39041", "S#42767", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39043", "S#42768", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39044", "S#42769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39045", "S#42770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39046", "S#1539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39047", "S#42771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39042", "S#1515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39048", "S#1536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39049", "S#1551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39050", "S#1517", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39052", "S#42772", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39053", "S#1613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39054", "S#1614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39055", "S#42773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39056", "S#905", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39057", "S#42774", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39058", "S#42775", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39059", "S#42776", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0642", "f39060", "S#42777");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0642", "f39061", "S#42778");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0642", "f39062", "S#42779");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39063", "S#42780", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39064", "S#42781", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39065", "S#42782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39051", "S#42783", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39066", "S#42784", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39067", "S#42785", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39026", "S#1594", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39068", "S#42786", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39069", "S#912", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39070", "S#42787", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39071", "S#42788", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39072", "S#42789", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39073", "S#42790", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39074", "S#42791", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39075", "S#42792", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39076", "S#42793", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39077", "S#42794", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39078", "S#42795", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39079", "S#42796", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39080", "S#42797", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39081", "S#42798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39082", "S#42799", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39083", "S#1590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39084", "S#1592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39085", "S#42800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39086", "S#42801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39087", "S#42802", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39088", "S#42803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39089", "S#42804", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39090", "S#42805", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39091", "S#42806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39092", "S#42807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39093", "S#42808", 2, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0642", "f39094", "S#42809");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39095", "S#42810", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39096", "S#42811", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39097", "S#42812", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39098", "S#42813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39099", "S#42814", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39100", "S#42815", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39103", "S#42816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39105", "S#42817", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39101", "S#42818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39102", "S#42819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39106", "S#42820", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39107", "S#42821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39108", "S#42822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39104", "S#913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39109", "S#42823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39110", "S#42824", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39111", "S#42825", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39112", "S#42826", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39113", "S#42827", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39115", "S#42828", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39114", "S#42829", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39116", "S#42830", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39117", "S#42831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39027", "S#1649", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39118", "S#42832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39119", "S#42833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39120", "S#42834", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39121", "S#42835", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39122", "S#42836", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39123", "S#42837", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39124", "S#42838", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39125", "S#42839", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39126", "S#42840", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39127", "S#42841", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39128", "S#42842", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39129", "S#42843", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39130", "S#42844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39132", "S#42845", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39131", "S#42846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39133", "HTML-ECHO-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39134", "HTML-ECHO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39135", "S#39909", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39136", "S#1636", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39137", "S#42847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39138", "S#42848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39139", "S#42849", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0642", "f39140", "S#42850");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39141", "S#42851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39142", "S#42852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39145", "S#42853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39143", "S#42854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39144", "S#42855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39146", "S#42856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39147", "S#42857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39148", "S#42858", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39150", "S#42859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39151", "S#42860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39152", "S#42861", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39149", "S#42862", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39154", "S#42863", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39153", "S#42864", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39155", "S#42865", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0642", "f39156", "S#42866", 0, 6, false);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39158() {
        module0642.$g4966$ = SubLFiles.defparameter("S#42867", (SubLObject)module0642.T);
        module0642.$g4967$ = SubLFiles.deflexical("S#42868", (SubLObject)module0642.$ic9$);
        module0642.$g4968$ = SubLFiles.defparameter("S#42869", (SubLObject)module0642.$ic10$);
        module0642.$g4969$ = SubLFiles.deflexical("S#42870", (SubLObject)module0642.$ic36$);
        module0642.$g4970$ = SubLFiles.defparameter("S#42871", (SubLObject)module0642.NIL);
        module0642.$g4971$ = SubLFiles.defparameter("S#42872", (SubLObject)module0642.T);
        module0642.$g4972$ = SubLFiles.defparameter("S#42873", (SubLObject)module0642.$ic47$);
        module0642.$g4973$ = SubLFiles.defparameter("S#42874", (SubLObject)module0642.$ic48$);
        module0642.$g4974$ = SubLFiles.defparameter("S#42875", (SubLObject)module0642.$ic49$);
        module0642.$g4975$ = SubLFiles.defparameter("S#42876", (SubLObject)module0642.$ic50$);
        module0642.$g4976$ = SubLFiles.deflexical("S#42877", (SubLObject)((module0642.NIL != Symbols.boundp((SubLObject)module0642.$ic51$)) ? module0642.$g4976$.getGlobalValue() : module0642.$ic46$));
        module0642.$g4977$ = SubLFiles.defparameter("S#42878", (SubLObject)module0642.NIL);
        module0642.$g4978$ = SubLFiles.deflexical("S#42879", (SubLObject)module0642.$ic679$);
        module0642.$g4979$ = SubLFiles.deflexical("S#42880", (SubLObject)module0642.$ic688$);
        module0642.$g4980$ = SubLFiles.deflexical("S#42881", (SubLObject)module0642.$ic702$);
        module0642.$g4981$ = SubLFiles.defconstant("S#42882", Strings.make_string((SubLObject)module0642.ONE_INTEGER, (SubLObject)Characters.CHAR_newline));
        module0642.$g4982$ = SubLFiles.deflexical("S#42883", (SubLObject)module0642.$ic708$);
        module0642.$g4983$ = SubLFiles.deflexical("S#42884", Sequences.length(module0642.$g4982$.getGlobalValue()));
        module0642.$g4984$ = SubLFiles.defparameter("S#42885", (SubLObject)module0642.ZERO_INTEGER);
        module0642.$g4985$ = SubLFiles.deflexical("S#42886", (SubLObject)module0642.TEN_INTEGER);
        return (SubLObject)module0642.NIL;
    }
    
    public static SubLObject f39159() {
        module0012.f441((SubLObject)module0642.$ic0$);
        module0012.f444((SubLObject)module0642.$ic0$);
        module0027.f1449((SubLObject)module0642.$ic26$, (SubLObject)ConsesLow.list(new SubLObject[] { module0642.$ic27$, module0642.NIL, module0642.$ic28$, module0642.NIL, module0642.$ic29$, module0642.NIL, module0642.$ic30$, module0642.$ic31$, module0642.$ic32$, module0642.T }), (SubLObject)module0642.$ic33$);
        module0003.f57((SubLObject)module0642.$ic51$);
        Hashtables.sethash((SubLObject)module0642.$ic55$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic56$, (SubLObject)module0642.NIL));
        Hashtables.sethash((SubLObject)module0642.$ic57$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic58$, (SubLObject)module0642.NIL));
        Hashtables.sethash((SubLObject)module0642.$ic59$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic60$, (SubLObject)module0642.NIL));
        Hashtables.sethash((SubLObject)module0642.$ic61$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic62$, (SubLObject)module0642.NIL));
        Hashtables.sethash((SubLObject)module0642.$ic63$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic64$, (SubLObject)module0642.NIL));
        Hashtables.sethash((SubLObject)module0642.$ic65$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic66$, (SubLObject)module0642.NIL));
        Hashtables.sethash((SubLObject)module0642.$ic67$, module0014.$g121$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic68$, (SubLObject)module0642.NIL));
        module0002.f50((SubLObject)module0642.$ic130$, (SubLObject)module0642.$ic134$);
        f39119((SubLObject)module0642.$ic188$, (SubLObject)module0642.$ic189$);
        f39119((SubLObject)module0642.$ic190$, (SubLObject)module0642.$ic191$);
        f39119((SubLObject)module0642.$ic192$, (SubLObject)module0642.$ic193$);
        f39119((SubLObject)module0642.$ic194$, (SubLObject)module0642.$ic195$);
        f39119((SubLObject)module0642.$ic196$, (SubLObject)module0642.$ic197$);
        f39119((SubLObject)module0642.$ic198$, (SubLObject)module0642.$ic199$);
        f39119((SubLObject)module0642.$ic7$, (SubLObject)module0642.$ic200$);
        f39119((SubLObject)module0642.$ic201$, (SubLObject)module0642.$ic202$);
        f39119((SubLObject)module0642.$ic203$, (SubLObject)module0642.$ic204$);
        f39119((SubLObject)module0642.$ic205$, (SubLObject)module0642.$ic206$);
        f39119((SubLObject)module0642.$ic207$, (SubLObject)module0642.$ic208$);
        f39119((SubLObject)module0642.$ic209$, (SubLObject)module0642.$ic210$);
        f39119((SubLObject)module0642.$ic211$, f39118((SubLObject)module0642.$ic209$));
        f39119((SubLObject)module0642.$ic212$, (SubLObject)module0642.$ic213$);
        f39119((SubLObject)module0642.$ic214$, (SubLObject)module0642.$ic215$);
        f39119((SubLObject)module0642.$ic216$, (SubLObject)module0642.$ic217$);
        f39119((SubLObject)module0642.$ic218$, (SubLObject)module0642.$ic219$);
        f39119((SubLObject)module0642.$ic220$, (SubLObject)module0642.$ic221$);
        f39119((SubLObject)module0642.$ic222$, (SubLObject)module0642.$ic223$);
        f39119((SubLObject)module0642.$ic224$, (SubLObject)module0642.$ic225$);
        f39119((SubLObject)module0642.$ic226$, (SubLObject)module0642.$ic227$);
        f39119((SubLObject)module0642.$ic228$, (SubLObject)module0642.$ic229$);
        f39119((SubLObject)module0642.$ic230$, (SubLObject)module0642.$ic231$);
        f39119((SubLObject)module0642.$ic232$, (SubLObject)module0642.$ic233$);
        f39119((SubLObject)module0642.$ic234$, (SubLObject)module0642.$ic235$);
        f39119((SubLObject)module0642.$ic236$, (SubLObject)module0642.$ic237$);
        f39119((SubLObject)module0642.$ic198$, (SubLObject)module0642.$ic199$);
        f39119((SubLObject)module0642.$ic238$, (SubLObject)module0642.$ic239$);
        f39119((SubLObject)module0642.$ic240$, (SubLObject)module0642.$ic241$);
        f39119((SubLObject)module0642.$ic242$, (SubLObject)module0642.$ic243$);
        f39119((SubLObject)module0642.$ic244$, (SubLObject)module0642.$ic245$);
        f39119((SubLObject)module0642.$ic196$, (SubLObject)module0642.$ic197$);
        f39119((SubLObject)module0642.$ic246$, (SubLObject)module0642.$ic247$);
        f39119((SubLObject)module0642.$ic248$, (SubLObject)module0642.$ic249$);
        f39119((SubLObject)module0642.$ic250$, (SubLObject)module0642.$ic251$);
        f39119((SubLObject)module0642.$ic252$, (SubLObject)module0642.$ic253$);
        f39119((SubLObject)module0642.$ic254$, (SubLObject)module0642.$ic255$);
        f39119((SubLObject)module0642.$ic256$, (SubLObject)module0642.$ic257$);
        f39119((SubLObject)module0642.$ic258$, (SubLObject)module0642.$ic259$);
        f39119((SubLObject)module0642.$ic260$, (SubLObject)module0642.$ic261$);
        f39119((SubLObject)module0642.$ic262$, (SubLObject)module0642.$ic263$);
        f39119((SubLObject)module0642.$ic264$, (SubLObject)module0642.$ic265$);
        f39119((SubLObject)module0642.$ic266$, (SubLObject)module0642.$ic267$);
        f39119((SubLObject)module0642.$ic268$, (SubLObject)module0642.$ic269$);
        f39119((SubLObject)module0642.$ic270$, (SubLObject)module0642.$ic271$);
        f39119((SubLObject)module0642.$ic272$, (SubLObject)module0642.$ic273$);
        f39119((SubLObject)module0642.$ic274$, (SubLObject)module0642.$ic275$);
        f39119((SubLObject)module0642.$ic276$, (SubLObject)module0642.$ic277$);
        f39119((SubLObject)module0642.$ic278$, (SubLObject)module0642.$ic279$);
        f39119((SubLObject)module0642.$ic280$, (SubLObject)module0642.$ic281$);
        f39119((SubLObject)module0642.$ic282$, (SubLObject)module0642.$ic283$);
        f39119((SubLObject)module0642.$ic284$, (SubLObject)module0642.$ic285$);
        f39119((SubLObject)module0642.$ic286$, (SubLObject)module0642.$ic287$);
        f39119((SubLObject)module0642.$ic288$, (SubLObject)module0642.$ic289$);
        f39119((SubLObject)module0642.$ic290$, (SubLObject)module0642.$ic291$);
        f39119((SubLObject)module0642.$ic292$, (SubLObject)module0642.$ic293$);
        f39119((SubLObject)module0642.$ic294$, (SubLObject)module0642.$ic295$);
        f39119((SubLObject)module0642.$ic296$, (SubLObject)module0642.$ic297$);
        f39119((SubLObject)module0642.$ic298$, (SubLObject)module0642.$ic299$);
        f39119((SubLObject)module0642.$ic300$, (SubLObject)module0642.$ic301$);
        f39119((SubLObject)module0642.$ic302$, (SubLObject)module0642.$ic303$);
        f39119((SubLObject)module0642.$ic304$, (SubLObject)module0642.$ic305$);
        f39119((SubLObject)module0642.$ic306$, (SubLObject)module0642.$ic307$);
        f39119((SubLObject)module0642.$ic308$, (SubLObject)module0642.$ic309$);
        f39119((SubLObject)module0642.$ic310$, (SubLObject)module0642.$ic311$);
        f39119((SubLObject)module0642.$ic312$, (SubLObject)module0642.$ic313$);
        f39119((SubLObject)module0642.$ic314$, (SubLObject)module0642.$ic315$);
        f39119((SubLObject)module0642.$ic316$, (SubLObject)module0642.$ic317$);
        f39119((SubLObject)module0642.$ic318$, (SubLObject)module0642.$ic319$);
        f39119((SubLObject)module0642.$ic320$, (SubLObject)module0642.$ic321$);
        f39119((SubLObject)module0642.$ic322$, (SubLObject)module0642.$ic323$);
        f39119((SubLObject)module0642.$ic324$, (SubLObject)module0642.$ic325$);
        f39119((SubLObject)module0642.$ic326$, (SubLObject)module0642.$ic327$);
        f39119((SubLObject)module0642.$ic328$, (SubLObject)module0642.$ic329$);
        f39119((SubLObject)module0642.$ic330$, (SubLObject)module0642.$ic331$);
        f39119((SubLObject)module0642.$ic332$, (SubLObject)module0642.$ic333$);
        f39119((SubLObject)module0642.$ic334$, (SubLObject)module0642.$ic335$);
        f39119((SubLObject)module0642.$ic336$, (SubLObject)module0642.$ic337$);
        f39119((SubLObject)module0642.$ic338$, (SubLObject)module0642.$ic339$);
        f39119((SubLObject)module0642.$ic340$, (SubLObject)module0642.$ic341$);
        f39119((SubLObject)module0642.$ic342$, (SubLObject)module0642.$ic343$);
        f39119((SubLObject)module0642.$ic344$, (SubLObject)module0642.$ic345$);
        f39119((SubLObject)module0642.$ic346$, (SubLObject)module0642.$ic347$);
        f39119((SubLObject)module0642.$ic348$, (SubLObject)module0642.$ic349$);
        f39119((SubLObject)module0642.$ic350$, (SubLObject)module0642.$ic351$);
        f39119((SubLObject)module0642.$ic352$, (SubLObject)module0642.$ic353$);
        f39119((SubLObject)module0642.$ic354$, (SubLObject)module0642.$ic355$);
        f39119((SubLObject)module0642.$ic356$, (SubLObject)module0642.$ic357$);
        f39119((SubLObject)module0642.$ic358$, (SubLObject)module0642.$ic359$);
        f39119((SubLObject)module0642.$ic360$, (SubLObject)module0642.$ic361$);
        f39119((SubLObject)module0642.$ic362$, (SubLObject)module0642.$ic363$);
        f39119((SubLObject)module0642.$ic364$, (SubLObject)module0642.$ic365$);
        f39119((SubLObject)module0642.$ic366$, (SubLObject)module0642.$ic367$);
        f39119((SubLObject)module0642.$ic368$, (SubLObject)module0642.$ic369$);
        f39119((SubLObject)module0642.$ic370$, (SubLObject)module0642.$ic371$);
        f39119((SubLObject)module0642.$ic372$, (SubLObject)module0642.$ic373$);
        f39119((SubLObject)module0642.$ic374$, (SubLObject)module0642.$ic375$);
        f39119((SubLObject)module0642.$ic376$, (SubLObject)module0642.$ic377$);
        f39119((SubLObject)module0642.$ic378$, (SubLObject)module0642.$ic379$);
        f39119((SubLObject)module0642.$ic380$, (SubLObject)module0642.$ic381$);
        f39119((SubLObject)module0642.$ic382$, (SubLObject)module0642.$ic383$);
        f39119((SubLObject)module0642.$ic384$, (SubLObject)module0642.$ic385$);
        f39119((SubLObject)module0642.$ic386$, (SubLObject)module0642.$ic387$);
        f39119((SubLObject)module0642.$ic388$, (SubLObject)module0642.$ic389$);
        f39119((SubLObject)module0642.$ic390$, (SubLObject)module0642.$ic391$);
        f39119((SubLObject)module0642.$ic392$, (SubLObject)module0642.$ic393$);
        f39119((SubLObject)module0642.$ic394$, (SubLObject)module0642.$ic395$);
        f39119((SubLObject)module0642.$ic396$, (SubLObject)module0642.$ic397$);
        f39119((SubLObject)module0642.$ic398$, (SubLObject)module0642.$ic399$);
        f39119((SubLObject)module0642.$ic400$, (SubLObject)module0642.$ic401$);
        f39119((SubLObject)module0642.$ic402$, (SubLObject)module0642.$ic403$);
        f39119((SubLObject)module0642.$ic404$, (SubLObject)module0642.$ic405$);
        f39119((SubLObject)module0642.$ic406$, (SubLObject)module0642.$ic407$);
        f39119((SubLObject)module0642.$ic408$, (SubLObject)module0642.$ic409$);
        f39119((SubLObject)module0642.$ic410$, (SubLObject)module0642.$ic411$);
        f39119((SubLObject)module0642.$ic412$, (SubLObject)module0642.$ic413$);
        f39119((SubLObject)module0642.$ic414$, (SubLObject)module0642.$ic415$);
        f39119((SubLObject)module0642.$ic416$, (SubLObject)module0642.$ic417$);
        f39119((SubLObject)module0642.$ic418$, (SubLObject)module0642.$ic419$);
        f39119((SubLObject)module0642.$ic420$, (SubLObject)module0642.$ic421$);
        f39119((SubLObject)module0642.$ic422$, (SubLObject)module0642.$ic423$);
        f39119((SubLObject)module0642.$ic424$, (SubLObject)module0642.$ic425$);
        f39119((SubLObject)module0642.$ic426$, (SubLObject)module0642.$ic427$);
        f39119((SubLObject)module0642.$ic428$, (SubLObject)module0642.$ic429$);
        f39119((SubLObject)module0642.$ic430$, (SubLObject)module0642.$ic431$);
        f39119((SubLObject)module0642.$ic432$, (SubLObject)module0642.$ic433$);
        f39119((SubLObject)module0642.$ic434$, (SubLObject)module0642.$ic435$);
        f39119((SubLObject)module0642.$ic436$, (SubLObject)module0642.$ic437$);
        f39119((SubLObject)module0642.$ic438$, (SubLObject)module0642.$ic439$);
        f39119((SubLObject)module0642.$ic440$, (SubLObject)module0642.$ic441$);
        f39119((SubLObject)module0642.$ic442$, (SubLObject)module0642.$ic443$);
        f39119((SubLObject)module0642.$ic444$, (SubLObject)module0642.$ic445$);
        f39119((SubLObject)module0642.$ic446$, (SubLObject)module0642.$ic447$);
        f39119((SubLObject)module0642.$ic448$, (SubLObject)module0642.$ic449$);
        f39119((SubLObject)module0642.$ic450$, (SubLObject)module0642.$ic451$);
        f39119((SubLObject)module0642.$ic452$, (SubLObject)module0642.$ic453$);
        f39119((SubLObject)module0642.$ic454$, (SubLObject)module0642.$ic455$);
        f39119((SubLObject)module0642.$ic456$, (SubLObject)module0642.$ic457$);
        f39119((SubLObject)module0642.$ic458$, (SubLObject)module0642.$ic459$);
        f39119((SubLObject)module0642.$ic460$, (SubLObject)module0642.$ic461$);
        f39119((SubLObject)module0642.$ic462$, (SubLObject)module0642.$ic463$);
        f39119((SubLObject)module0642.$ic464$, (SubLObject)module0642.$ic465$);
        f39119((SubLObject)module0642.$ic466$, (SubLObject)module0642.$ic467$);
        f39119((SubLObject)module0642.$ic468$, (SubLObject)module0642.$ic469$);
        f39119((SubLObject)module0642.$ic470$, (SubLObject)module0642.$ic471$);
        f39119((SubLObject)module0642.$ic472$, (SubLObject)module0642.$ic473$);
        f39119((SubLObject)module0642.$ic474$, (SubLObject)module0642.$ic475$);
        f39119((SubLObject)module0642.$ic476$, (SubLObject)module0642.$ic477$);
        f39119((SubLObject)module0642.$ic478$, (SubLObject)module0642.$ic479$);
        f39119((SubLObject)module0642.$ic480$, (SubLObject)module0642.$ic481$);
        f39119((SubLObject)module0642.$ic482$, (SubLObject)module0642.$ic483$);
        f39119((SubLObject)module0642.$ic484$, (SubLObject)module0642.$ic485$);
        f39119((SubLObject)module0642.$ic486$, (SubLObject)module0642.$ic487$);
        f39119((SubLObject)module0642.$ic488$, (SubLObject)module0642.$ic489$);
        f39119((SubLObject)module0642.$ic490$, (SubLObject)module0642.$ic491$);
        f39119((SubLObject)module0642.$ic492$, (SubLObject)module0642.$ic493$);
        f39119((SubLObject)module0642.$ic494$, (SubLObject)module0642.$ic495$);
        f39119((SubLObject)module0642.$ic496$, (SubLObject)module0642.$ic497$);
        f39119((SubLObject)module0642.$ic498$, (SubLObject)module0642.$ic499$);
        f39119((SubLObject)module0642.$ic500$, (SubLObject)module0642.$ic501$);
        f39119((SubLObject)module0642.$ic502$, (SubLObject)module0642.$ic503$);
        f39119((SubLObject)module0642.$ic504$, (SubLObject)module0642.$ic505$);
        f39119((SubLObject)module0642.$ic506$, (SubLObject)module0642.$ic507$);
        f39119((SubLObject)module0642.$ic508$, (SubLObject)module0642.$ic473$);
        f39119((SubLObject)module0642.$ic509$, (SubLObject)module0642.$ic510$);
        f39119((SubLObject)module0642.$ic511$, (SubLObject)module0642.$ic512$);
        f39119((SubLObject)module0642.$ic513$, (SubLObject)module0642.$ic514$);
        f39119((SubLObject)module0642.$ic515$, (SubLObject)module0642.$ic516$);
        f39119((SubLObject)module0642.$ic517$, (SubLObject)module0642.$ic518$);
        f39119((SubLObject)module0642.$ic519$, (SubLObject)module0642.$ic520$);
        f39119((SubLObject)module0642.$ic521$, (SubLObject)module0642.$ic522$);
        f39119((SubLObject)module0642.$ic523$, (SubLObject)module0642.$ic524$);
        f39119((SubLObject)module0642.$ic525$, (SubLObject)module0642.$ic526$);
        f39119((SubLObject)module0642.$ic527$, (SubLObject)module0642.$ic528$);
        f39119((SubLObject)module0642.$ic529$, (SubLObject)module0642.$ic530$);
        f39119((SubLObject)module0642.$ic531$, (SubLObject)module0642.$ic532$);
        f39119((SubLObject)module0642.$ic533$, (SubLObject)module0642.$ic534$);
        f39119((SubLObject)module0642.$ic535$, (SubLObject)module0642.$ic536$);
        f39119((SubLObject)module0642.$ic537$, (SubLObject)module0642.$ic538$);
        f39119((SubLObject)module0642.$ic539$, (SubLObject)module0642.$ic540$);
        f39119((SubLObject)module0642.$ic541$, (SubLObject)module0642.$ic536$);
        f39119((SubLObject)module0642.$ic542$, (SubLObject)module0642.$ic538$);
        f39119((SubLObject)module0642.$ic543$, (SubLObject)module0642.$ic544$);
        f39119((SubLObject)module0642.$ic545$, (SubLObject)module0642.$ic546$);
        f39119((SubLObject)module0642.$ic547$, (SubLObject)module0642.$ic548$);
        f39119((SubLObject)module0642.$ic549$, (SubLObject)module0642.$ic550$);
        f39119((SubLObject)module0642.$ic551$, (SubLObject)module0642.$ic552$);
        f39119((SubLObject)module0642.$ic553$, (SubLObject)module0642.$ic554$);
        f39119((SubLObject)module0642.$ic555$, (SubLObject)module0642.$ic556$);
        f39119((SubLObject)module0642.$ic557$, (SubLObject)module0642.$ic558$);
        f39119((SubLObject)module0642.$ic559$, (SubLObject)module0642.$ic560$);
        f39119((SubLObject)module0642.$ic561$, (SubLObject)module0642.$ic562$);
        f39119((SubLObject)module0642.$ic563$, (SubLObject)module0642.$ic564$);
        f39119((SubLObject)module0642.$ic565$, (SubLObject)module0642.$ic566$);
        f39119((SubLObject)module0642.$ic567$, (SubLObject)module0642.$ic568$);
        f39119((SubLObject)module0642.$ic569$, (SubLObject)module0642.$ic570$);
        f39119((SubLObject)module0642.$ic571$, (SubLObject)module0642.$ic572$);
        f39119((SubLObject)module0642.$ic573$, (SubLObject)module0642.$ic574$);
        f39119((SubLObject)module0642.$ic575$, (SubLObject)module0642.$ic576$);
        f39119((SubLObject)module0642.$ic577$, (SubLObject)module0642.$ic578$);
        f39119((SubLObject)module0642.$ic579$, (SubLObject)module0642.$ic580$);
        f39119((SubLObject)module0642.$ic581$, (SubLObject)module0642.$ic582$);
        f39119((SubLObject)module0642.$ic583$, (SubLObject)module0642.$ic584$);
        f39119((SubLObject)module0642.$ic585$, (SubLObject)module0642.$ic586$);
        f39119((SubLObject)module0642.$ic587$, (SubLObject)module0642.$ic588$);
        f39119((SubLObject)module0642.$ic589$, (SubLObject)module0642.$ic590$);
        f39119((SubLObject)module0642.$ic591$, (SubLObject)module0642.$ic592$);
        f39119((SubLObject)module0642.$ic593$, (SubLObject)module0642.$ic594$);
        f39119((SubLObject)module0642.$ic595$, (SubLObject)module0642.$ic596$);
        f39119((SubLObject)module0642.$ic597$, (SubLObject)module0642.$ic598$);
        f39119((SubLObject)module0642.$ic599$, (SubLObject)module0642.$ic600$);
        f39119((SubLObject)module0642.$ic601$, (SubLObject)module0642.$ic602$);
        f39119((SubLObject)module0642.$ic603$, (SubLObject)module0642.$ic604$);
        f39119((SubLObject)module0642.$ic605$, (SubLObject)module0642.$ic606$);
        f39119((SubLObject)module0642.$ic607$, (SubLObject)module0642.$ic608$);
        f39119((SubLObject)module0642.$ic609$, (SubLObject)module0642.$ic610$);
        f39119((SubLObject)module0642.$ic611$, (SubLObject)module0642.$ic612$);
        f39119((SubLObject)module0642.$ic613$, (SubLObject)module0642.$ic614$);
        f39119((SubLObject)module0642.$ic615$, (SubLObject)module0642.$ic616$);
        f39119((SubLObject)module0642.$ic617$, (SubLObject)module0642.$ic618$);
        f39119((SubLObject)module0642.$ic619$, (SubLObject)module0642.$ic620$);
        f39119((SubLObject)module0642.$ic621$, (SubLObject)module0642.$ic622$);
        f39119((SubLObject)module0642.$ic623$, (SubLObject)module0642.$ic624$);
        f39119((SubLObject)module0642.$ic625$, (SubLObject)module0642.$ic626$);
        f39119((SubLObject)module0642.$ic627$, (SubLObject)module0642.$ic628$);
        f39119((SubLObject)module0642.$ic629$, (SubLObject)module0642.$ic630$);
        f39119((SubLObject)module0642.$ic631$, (SubLObject)module0642.$ic632$);
        f39119((SubLObject)module0642.$ic633$, (SubLObject)module0642.$ic634$);
        f39119((SubLObject)module0642.$ic635$, (SubLObject)module0642.$ic636$);
        f39119((SubLObject)module0642.$ic637$, (SubLObject)module0642.$ic638$);
        f39119((SubLObject)module0642.$ic639$, (SubLObject)module0642.$ic640$);
        f39119((SubLObject)module0642.$ic641$, (SubLObject)module0642.$ic642$);
        f39119((SubLObject)module0642.$ic643$, (SubLObject)module0642.$ic644$);
        f39119((SubLObject)module0642.$ic645$, (SubLObject)module0642.$ic646$);
        f39119((SubLObject)module0642.$ic647$, (SubLObject)module0642.$ic648$);
        f39119((SubLObject)module0642.$ic649$, (SubLObject)module0642.$ic650$);
        f39119((SubLObject)module0642.$ic651$, (SubLObject)module0642.$ic652$);
        f39119((SubLObject)module0642.$ic653$, (SubLObject)module0642.$ic654$);
        f39119((SubLObject)module0642.$ic655$, (SubLObject)module0642.$ic656$);
        f39119((SubLObject)module0642.$ic657$, (SubLObject)module0642.$ic658$);
        module0015.f873((SubLObject)module0642.$ic666$);
        module0015.f873((SubLObject)module0642.$ic671$);
        Hashtables.sethash((SubLObject)module0642.$ic722$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0642.$ic723$, (SubLObject)module0642.NIL));
        return (SubLObject)module0642.NIL;
    }
    
    public void declareFunctions() {
        f39157();
    }
    
    public void initializeVariables() {
        f39158();
    }
    
    public void runTopLevelForms() {
        f39159();
    }
    
    static {
        me = (SubLFile)new module0642();
        module0642.$g4966$ = null;
        module0642.$g4967$ = null;
        module0642.$g4968$ = null;
        module0642.$g4969$ = null;
        module0642.$g4970$ = null;
        module0642.$g4971$ = null;
        module0642.$g4972$ = null;
        module0642.$g4973$ = null;
        module0642.$g4974$ = null;
        module0642.$g4975$ = null;
        module0642.$g4976$ = null;
        module0642.$g4977$ = null;
        module0642.$g4978$ = null;
        module0642.$g4979$ = null;
        module0642.$g4980$ = null;
        module0642.$g4981$ = null;
        module0642.$g4982$ = null;
        module0642.$g4983$ = null;
        module0642.$g4984$ = null;
        module0642.$g4985$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#42867", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#42751", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#3950", "CYC");
        $ic3$ = SubLObjectFactory.makeString("&#x");
        $ic4$ = SubLObjectFactory.makeString(";");
        $ic5$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic6$ = SubLObjectFactory.makeString("~S");
        $ic7$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic8$ = SubLObjectFactory.makeSymbol("S#24599", "CYC");
        $ic9$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("i"), SubLObjectFactory.makeString("b"), SubLObjectFactory.makeString("sub"), SubLObjectFactory.makeString("sup"), SubLObjectFactory.makeString("pre"), SubLObjectFactory.makeString("code"), SubLObjectFactory.makeString("blockquote"), SubLObjectFactory.makeString("p"), SubLObjectFactory.makeString("br") });
        $ic10$ = SubLObjectFactory.makeInteger(4096);
        $ic11$ = SubLObjectFactory.makeString(" ... <i>(");
        $ic12$ = SubLObjectFactory.makeString(" characters total)</i>");
        $ic13$ = SubLObjectFactory.makeSymbol("S#15440", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("MIN");
        $ic15$ = SubLObjectFactory.makeSymbol("NULL");
        $ic16$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic17$ = SubLObjectFactory.makeString("sub");
        $ic18$ = SubLObjectFactory.makeString("small");
        $ic19$ = SubLObjectFactory.makeString("<");
        $ic20$ = SubLObjectFactory.makeString("/");
        $ic21$ = SubLObjectFactory.makeString(">");
        $ic22$ = SubLObjectFactory.makeString("code");
        $ic23$ = SubLObjectFactory.makeString("pre");
        $ic24$ = SubLObjectFactory.makeSymbol("S#42887", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#42888", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#42763", "CYC");
        $ic27$ = SubLObjectFactory.makeKeyword("TEST");
        $ic28$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic29$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic30$ = SubLObjectFactory.makeKeyword("KB");
        $ic31$ = SubLObjectFactory.makeKeyword("FULL");
        $ic32$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic33$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$rdfs:label is")), (SubLObject)SubLObjectFactory.makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$rdfs:label is #$owl:NONSENSE http://www.w3.org/2000/01/rdf-schema#label")), (SubLObject)SubLObjectFactory.makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is <font color=\"#ff0000\">#$owl:NONSENSE</font> <a href= \"http://www.w3.org/2000/01/rdf-schema#label\">http://www.w3.org/2000/01/rdf-schema#label</a>")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This is a <code>META-VARIABLE</code>.")), (SubLObject)SubLObjectFactory.makeString("This is a <code><b>META-VARIABLE</b></code>.")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<code>(#$isa #$Emu THING)</code>.")), (SubLObject)SubLObjectFactory.makeString("<code>(<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViBBJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">isa</a> <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a> <b>THING</b>)</code>.")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Bert is an #$Emu.")), (SubLObject)SubLObjectFactory.makeString("Bert is an <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>.")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Please link to http://www.cyc.com.")), (SubLObject)SubLObjectFactory.makeString("Please link to <a href= \"http://www.cyc.com\">http://www.cyc.com</a>.")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$Emus are kind and gentle creatures.")), (SubLObject)SubLObjectFactory.makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>s are kind and gentle creatures.")));
        $ic34$ = SubLObjectFactory.makeString("~A");
        $ic35$ = SubLObjectFactory.makeString("<a href= ~S>~A</a>");
        $ic36$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("es"), (SubLObject)SubLObjectFactory.makeString("es:"));
        $ic37$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic38$ = SubLObjectFactory.makeKeyword("RED");
        $ic39$ = SubLObjectFactory.makeString("(");
        $ic40$ = SubLObjectFactory.makeString(" ");
        $ic41$ = SubLObjectFactory.makeString(" . ");
        $ic42$ = SubLObjectFactory.makeString(")");
        $ic43$ = SubLObjectFactory.makeString("-_.");
        $ic44$ = SubLObjectFactory.makeString("%~C~C");
        $ic45$ = SubLObjectFactory.makeString("=");
        $ic46$ = SubLObjectFactory.makeString("");
        $ic47$ = SubLObjectFactory.makeString("background-color:");
        $ic48$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TOP"), (SubLObject)SubLObjectFactory.makeString("top")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MIDDLE"), (SubLObject)SubLObjectFactory.makeString("middle")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BOTTOM"), (SubLObject)SubLObjectFactory.makeString("bottom")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LEFT"), (SubLObject)SubLObjectFactory.makeString("left")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CENTER"), (SubLObject)SubLObjectFactory.makeString("center")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RIGHT"), (SubLObject)SubLObjectFactory.makeString("right")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TEXTTOP"), (SubLObject)SubLObjectFactory.makeString("top")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ABSMIDDLE"), (SubLObject)SubLObjectFactory.makeString("middle")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BASELINE"), (SubLObject)SubLObjectFactory.makeString("bottom")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ABSBOTTOM"), (SubLObject)SubLObjectFactory.makeString("bottom")) });
        $ic49$ = SubLObjectFactory.makeString("http://www.cyc.com");
        $ic50$ = SubLObjectFactory.makeString("Cycorp");
        $ic51$ = SubLObjectFactory.makeSymbol("S#42877", "CYC");
        $ic52$ = SubLObjectFactory.makeString("copyright");
        $ic53$ = SubLObjectFactory.makeString("Copyright &copy; 1995 - ~A ");
        $ic54$ = SubLObjectFactory.makeString(".  All rights reserved.  ");
        $ic55$ = SubLObjectFactory.makeKeyword("CYC-LOGO-SMALL-VIOLET-FULL-URL");
        $ic56$ = SubLObjectFactory.makeString("cyc-logo-violet-16.gif");
        $ic57$ = SubLObjectFactory.makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");
        $ic58$ = SubLObjectFactory.makeString("cyc-logo-violet-60.gif");
        $ic59$ = SubLObjectFactory.makeKeyword("CYCORP-SYMBOL-TINY");
        $ic60$ = SubLObjectFactory.makeString("cyc-logo-tiny.gif");
        $ic61$ = SubLObjectFactory.makeKeyword("CYCORP-SYMBOL-SMALL");
        $ic62$ = SubLObjectFactory.makeString("cyc-logo-sm.gif");
        $ic63$ = SubLObjectFactory.makeKeyword("CYCORP-SYMBOL-MEDIUM");
        $ic64$ = SubLObjectFactory.makeString("cyc-logo-10-t.gif");
        $ic65$ = SubLObjectFactory.makeKeyword("CYCORP-LOGO-MEDIUM");
        $ic66$ = SubLObjectFactory.makeString("cyc-logo-25-t.gif");
        $ic67$ = SubLObjectFactory.makeKeyword("CYCORP-LOGO-BIG");
        $ic68$ = SubLObjectFactory.makeString("cyc-logo-50-t.gif");
        $ic69$ = SubLObjectFactory.makeString("Refresh");
        $ic70$ = SubLObjectFactory.makeString("Content-type");
        $ic71$ = SubLObjectFactory.makeString("text/html; charset=UTF-8");
        $ic72$ = SubLObjectFactory.makeString("Expires");
        $ic73$ = SubLObjectFactory.makeString("Last-Modified");
        $ic74$ = SubLObjectFactory.makeString("Cache-Control");
        $ic75$ = SubLObjectFactory.makeString("no-cache");
        $ic76$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42889", "CYC"), (SubLObject)module0642.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42890", "CYC"), (SubLObject)module0642.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42891", "CYC"), (SubLObject)module0642.ZERO_INTEGER)));
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HH"), (SubLObject)SubLObjectFactory.makeKeyword("MM"), (SubLObject)SubLObjectFactory.makeKeyword("SS"));
        $ic78$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic79$ = SubLObjectFactory.makeKeyword("HH");
        $ic80$ = SubLObjectFactory.makeKeyword("MM");
        $ic81$ = SubLObjectFactory.makeKeyword("SS");
        $ic82$ = SubLObjectFactory.makeSymbol("S#42777", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42774", "CYC"));
        $ic84$ = SubLObjectFactory.makeSymbol("S#42774", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42892", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME"))));
        $ic86$ = SubLObjectFactory.makeSymbol("S#42778", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42775", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#42775", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#42779", "CYC");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42776", "CYC"));
        $ic91$ = SubLObjectFactory.makeString("ROBOTS");
        $ic92$ = SubLObjectFactory.makeString("NOINDEX, NOFOLLOW");
        $ic93$ = SubLObjectFactory.makeString("INDEX, FOLLOW");
        $ic94$ = SubLObjectFactory.makeString("NOINDEX, FOLLOW");
        $ic95$ = SubLObjectFactory.makeString("INDEX, NOFOLLOW");
        $ic96$ = SubLObjectFactory.makeString("Invalid HTML meta select robot instruction.");
        $ic97$ = SubLObjectFactory.makeString("Reset All Fields");
        $ic98$ = SubLObjectFactory.makeString("autocomplete-");
        $ic99$ = SubLObjectFactory.makeString("input-");
        $ic100$ = SubLObjectFactory.makeString("autocomplete-results-");
        $ic101$ = SubLObjectFactory.makeString("position:static; width:auto ");
        $ic102$ = SubLObjectFactory.makeString("yui-ac");
        $ic103$ = SubLObjectFactory.makeString("yui-ac-input");
        $ic104$ = SubLObjectFactory.makeString("yui-ac-container");
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1543", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"));
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1543", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9672", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42893", "CYC"));
        $ic107$ = SubLObjectFactory.makeString(".x");
        $ic108$ = SubLObjectFactory.makeString(".y");
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42894", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42895", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42896", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic111$ = SubLObjectFactory.makeKeyword("LEXICON");
        $ic112$ = SubLObjectFactory.makeInteger(100);
        $ic113$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic114$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#42897", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#896", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#895", "CYC"), (SubLObject)module0642.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42898", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1459", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42899", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1453", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1560", "CYC"), (SubLObject)module0642.ZERO_INTEGER));
        $ic115$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOFAR"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-COLOR"), (SubLObject)SubLObjectFactory.makeKeyword("REMAINING-COLOR"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER"));
        $ic116$ = SubLObjectFactory.makeKeyword("SOFAR");
        $ic117$ = SubLObjectFactory.makeKeyword("TOTAL");
        $ic118$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic119$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic120$ = SubLObjectFactory.makeKeyword("PROGRESS-COLOR");
        $ic121$ = SubLObjectFactory.makeSymbol("S#1459", "CYC");
        $ic122$ = SubLObjectFactory.makeKeyword("REMAINING-COLOR");
        $ic123$ = SubLObjectFactory.makeSymbol("S#1453", "CYC");
        $ic124$ = SubLObjectFactory.makeKeyword("BORDER");
        $ic125$ = SubLObjectFactory.makeUninternedSymbol("US#122DCC6");
        $ic126$ = SubLObjectFactory.makeUninternedSymbol("US#1221CC6");
        $ic127$ = SubLObjectFactory.makeSymbol("S#1021", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CELLSPACING"), (SubLObject)module0642.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLPADDING"), (SubLObject)module0642.ZERO_INTEGER);
        $ic129$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic130$ = SubLObjectFactory.makeSymbol("S#42810", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#1027", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#1023", "CYC");
        $ic133$ = SubLObjectFactory.makeKeyword("BGCOLOR");
        $ic134$ = SubLObjectFactory.makeSymbol("S#42809", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic136$ = SubLObjectFactory.makeInteger(1000);
        $ic137$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic138$ = SubLObjectFactory.makeKeyword("TOP");
        $ic139$ = SubLObjectFactory.makeString("Run Time :");
        $ic140$ = SubLObjectFactory.makeString("Elapsed Time :");
        $ic141$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic142$ = SubLObjectFactory.makeString("Current Total :");
        $ic143$ = SubLObjectFactory.makeString(" of ");
        $ic144$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic145$ = SubLObjectFactory.makeString("~D%");
        $ic146$ = SubLObjectFactory.makeString("[No data to graph]");
        $ic147$ = SubLObjectFactory.makeSymbol("MAX");
        $ic148$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic149$ = SubLObjectFactory.makeString("100%");
        $ic150$ = SubLObjectFactory.makeString("1%");
        $ic151$ = SubLObjectFactory.makeString("~A%");
        $ic152$ = SubLObjectFactory.makeString("5%");
        $ic153$ = SubLObjectFactory.makeString("95%");
        $ic154$ = SubLObjectFactory.makeString("~:D");
        $ic155$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic156$ = SubLObjectFactory.makeKeyword("FANCY-NAME");
        $ic157$ = SubLObjectFactory.makeKeyword("DESCRIPTION");
        $ic158$ = SubLObjectFactory.makeKeyword("SETTINGS-SPEC");
        $ic159$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeString("Value")));
        $ic160$ = SubLObjectFactory.makeKeyword("ENTRY");
        $ic161$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic162$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#724", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42900", "CYC"));
        $ic163$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0642.NIL);
        $ic164$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"));
        $ic165$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic166$ = SubLObjectFactory.makeString("The value entered for '~A' was not valid.");
        $ic167$ = SubLObjectFactory.makeString("No value was entered for '~A'.");
        $ic168$ = SubLObjectFactory.makeString("No choice was made for '~A'.");
        $ic169$ = SubLObjectFactory.makeString("~S is not a declared control parameter");
        $ic170$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic171$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic172$ = SubLObjectFactory.makeString("entry-~A");
        $ic173$ = SubLObjectFactory.makeString("radio-~A");
        $ic174$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic175$ = SubLObjectFactory.makeSymbol("S#42821", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("S#42822", "CYC");
        $ic178$ = SubLObjectFactory.makeString("en");
        $ic179$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $ic180$ = SubLObjectFactory.makeString("en-gb");
        $ic181$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BritishEnglishDialect"));
        $ic182$ = SubLObjectFactory.makeString("fr");
        $ic183$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("FrenchLanguage"));
        $ic184$ = SubLObjectFactory.makeString("de");
        $ic185$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GermanLanguage"));
        $ic186$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("languageCodeDigraph"));
        $ic187$ = SubLObjectFactory.makeKeyword("HTML-GLYPH");
        $ic188$ = SubLObjectFactory.makeKeyword("LT");
        $ic189$ = SubLObjectFactory.makeString("&lt;");
        $ic190$ = SubLObjectFactory.makeKeyword("GT");
        $ic191$ = SubLObjectFactory.makeString("&gt;");
        $ic192$ = SubLObjectFactory.makeKeyword("AMP");
        $ic193$ = SubLObjectFactory.makeString("&amp;");
        $ic194$ = SubLObjectFactory.makeKeyword("QUOT");
        $ic195$ = SubLObjectFactory.makeString("&quot;");
        $ic196$ = SubLObjectFactory.makeKeyword("REG");
        $ic197$ = SubLObjectFactory.makeString("&reg;");
        $ic198$ = SubLObjectFactory.makeKeyword("COPY");
        $ic199$ = SubLObjectFactory.makeString("&copy;");
        $ic200$ = SubLObjectFactory.makeString("&nbsp;");
        $ic201$ = SubLObjectFactory.makeKeyword("EMSP");
        $ic202$ = SubLObjectFactory.makeString("&emsp;");
        $ic203$ = SubLObjectFactory.makeKeyword("ENSP");
        $ic204$ = SubLObjectFactory.makeString("&ensp;");
        $ic205$ = SubLObjectFactory.makeKeyword("SPACE");
        $ic206$ = SubLObjectFactory.makeString("&#X0020;");
        $ic207$ = SubLObjectFactory.makeKeyword("EM-SPACE");
        $ic208$ = SubLObjectFactory.makeString("&#X2003;");
        $ic209$ = SubLObjectFactory.makeKeyword("EN-SPACE");
        $ic210$ = SubLObjectFactory.makeString("&#X2002;");
        $ic211$ = SubLObjectFactory.makeKeyword("TWO-PER-EM-SPACE");
        $ic212$ = SubLObjectFactory.makeKeyword("THREE-PER-EM-SPACE");
        $ic213$ = SubLObjectFactory.makeString("&#X2004;");
        $ic214$ = SubLObjectFactory.makeKeyword("FOUR-PER-EM-SPACE");
        $ic215$ = SubLObjectFactory.makeString("&#X2005;");
        $ic216$ = SubLObjectFactory.makeKeyword("SIX-PER-EM-SPACE");
        $ic217$ = SubLObjectFactory.makeString("&#X2006;");
        $ic218$ = SubLObjectFactory.makeKeyword("THIN-SPACE");
        $ic219$ = SubLObjectFactory.makeString("&#X2009;");
        $ic220$ = SubLObjectFactory.makeKeyword("HAIR-SPACE");
        $ic221$ = SubLObjectFactory.makeString("&#X200A;");
        $ic222$ = SubLObjectFactory.makeKeyword("IEXCL");
        $ic223$ = SubLObjectFactory.makeString("&iexcl;");
        $ic224$ = SubLObjectFactory.makeKeyword("CENT");
        $ic225$ = SubLObjectFactory.makeString("&cent;");
        $ic226$ = SubLObjectFactory.makeKeyword("POUND");
        $ic227$ = SubLObjectFactory.makeString("&pound;");
        $ic228$ = SubLObjectFactory.makeKeyword("CURREN");
        $ic229$ = SubLObjectFactory.makeString("&curren;");
        $ic230$ = SubLObjectFactory.makeKeyword("YEN");
        $ic231$ = SubLObjectFactory.makeString("&yen;");
        $ic232$ = SubLObjectFactory.makeKeyword("BRVBAR");
        $ic233$ = SubLObjectFactory.makeString("&brvba;");
        $ic234$ = SubLObjectFactory.makeKeyword("SECT");
        $ic235$ = SubLObjectFactory.makeString("&sect;");
        $ic236$ = SubLObjectFactory.makeKeyword("UML");
        $ic237$ = SubLObjectFactory.makeString("&uml;");
        $ic238$ = SubLObjectFactory.makeKeyword("ORDF");
        $ic239$ = SubLObjectFactory.makeString("&ordf;");
        $ic240$ = SubLObjectFactory.makeKeyword("LAQUO");
        $ic241$ = SubLObjectFactory.makeString("&laquo;");
        $ic242$ = SubLObjectFactory.makeKeyword("NOT");
        $ic243$ = SubLObjectFactory.makeString("&not;");
        $ic244$ = SubLObjectFactory.makeKeyword("SHY");
        $ic245$ = SubLObjectFactory.makeString("&shy;");
        $ic246$ = SubLObjectFactory.makeKeyword("MACR");
        $ic247$ = SubLObjectFactory.makeString("&macr;");
        $ic248$ = SubLObjectFactory.makeKeyword("DEG");
        $ic249$ = SubLObjectFactory.makeString("&deg;");
        $ic250$ = SubLObjectFactory.makeKeyword("PLUSMN");
        $ic251$ = SubLObjectFactory.makeString("&plusmn;");
        $ic252$ = SubLObjectFactory.makeKeyword("SUP2");
        $ic253$ = SubLObjectFactory.makeString("&sup2;");
        $ic254$ = SubLObjectFactory.makeKeyword("SUP3");
        $ic255$ = SubLObjectFactory.makeString("&sup3;");
        $ic256$ = SubLObjectFactory.makeKeyword("ACUTE");
        $ic257$ = SubLObjectFactory.makeString("&acute;");
        $ic258$ = SubLObjectFactory.makeKeyword("MICRO");
        $ic259$ = SubLObjectFactory.makeString("&micro;");
        $ic260$ = SubLObjectFactory.makeKeyword("PARA");
        $ic261$ = SubLObjectFactory.makeString("&para;");
        $ic262$ = SubLObjectFactory.makeKeyword("MIDDOT");
        $ic263$ = SubLObjectFactory.makeString("&middoy;");
        $ic264$ = SubLObjectFactory.makeKeyword("CEDIL");
        $ic265$ = SubLObjectFactory.makeString("&cedil;");
        $ic266$ = SubLObjectFactory.makeKeyword("SUP1");
        $ic267$ = SubLObjectFactory.makeString("&sup1;");
        $ic268$ = SubLObjectFactory.makeKeyword("ORDM");
        $ic269$ = SubLObjectFactory.makeString("&ordm;");
        $ic270$ = SubLObjectFactory.makeKeyword("RAQUO");
        $ic271$ = SubLObjectFactory.makeString("&raquo;");
        $ic272$ = SubLObjectFactory.makeKeyword("FRAC14");
        $ic273$ = SubLObjectFactory.makeString("&frac14;");
        $ic274$ = SubLObjectFactory.makeKeyword("FRAC12");
        $ic275$ = SubLObjectFactory.makeString("&frac12;");
        $ic276$ = SubLObjectFactory.makeKeyword("FRAC34");
        $ic277$ = SubLObjectFactory.makeString("&frac34;");
        $ic278$ = SubLObjectFactory.makeKeyword("IQUEST");
        $ic279$ = SubLObjectFactory.makeString("&iquest;");
        $ic280$ = SubLObjectFactory.makeKeyword("AGRAVE-CAP");
        $ic281$ = SubLObjectFactory.makeString("&Agrave;");
        $ic282$ = SubLObjectFactory.makeKeyword("AACUTE-CAP");
        $ic283$ = SubLObjectFactory.makeString("&Aacute;");
        $ic284$ = SubLObjectFactory.makeKeyword("ACIRC-CAP");
        $ic285$ = SubLObjectFactory.makeString("&Acirc;");
        $ic286$ = SubLObjectFactory.makeKeyword("ATILDE-CAP");
        $ic287$ = SubLObjectFactory.makeString("&Atilde;");
        $ic288$ = SubLObjectFactory.makeKeyword("AUML-CAP");
        $ic289$ = SubLObjectFactory.makeString("&Auml;");
        $ic290$ = SubLObjectFactory.makeKeyword("ARING-CAP");
        $ic291$ = SubLObjectFactory.makeString("&Aring;");
        $ic292$ = SubLObjectFactory.makeKeyword("AELIG-CAP");
        $ic293$ = SubLObjectFactory.makeString("&AElig;");
        $ic294$ = SubLObjectFactory.makeKeyword("CCEDIL-CAP");
        $ic295$ = SubLObjectFactory.makeString("&Ccedil;");
        $ic296$ = SubLObjectFactory.makeKeyword("EGRAVE-CAP");
        $ic297$ = SubLObjectFactory.makeString("&Egrave;");
        $ic298$ = SubLObjectFactory.makeKeyword("EACUTE-CAP");
        $ic299$ = SubLObjectFactory.makeString("&Eacute;");
        $ic300$ = SubLObjectFactory.makeKeyword("ECIRC-CAP");
        $ic301$ = SubLObjectFactory.makeString("&Ecirc;");
        $ic302$ = SubLObjectFactory.makeKeyword("EUML-CAP");
        $ic303$ = SubLObjectFactory.makeString("&Euml;");
        $ic304$ = SubLObjectFactory.makeKeyword("IGRAVE-CAP");
        $ic305$ = SubLObjectFactory.makeString("&Igrave;");
        $ic306$ = SubLObjectFactory.makeKeyword("IACUTE-CAP");
        $ic307$ = SubLObjectFactory.makeString("&Iacute;");
        $ic308$ = SubLObjectFactory.makeKeyword("ICIRC-CAP");
        $ic309$ = SubLObjectFactory.makeString("&Icirc;");
        $ic310$ = SubLObjectFactory.makeKeyword("IUML-CAP");
        $ic311$ = SubLObjectFactory.makeString("&Iuml;");
        $ic312$ = SubLObjectFactory.makeKeyword("ETH-CAP");
        $ic313$ = SubLObjectFactory.makeString("&ETH;");
        $ic314$ = SubLObjectFactory.makeKeyword("NTILDE-CAP");
        $ic315$ = SubLObjectFactory.makeString("&Ntilde;");
        $ic316$ = SubLObjectFactory.makeKeyword("OGRAVE-CAP");
        $ic317$ = SubLObjectFactory.makeString("&Ograve;");
        $ic318$ = SubLObjectFactory.makeKeyword("OACUTE-CAP");
        $ic319$ = SubLObjectFactory.makeString("&Oacute;");
        $ic320$ = SubLObjectFactory.makeKeyword("OCIRC-CAP");
        $ic321$ = SubLObjectFactory.makeString("&Ocirc;");
        $ic322$ = SubLObjectFactory.makeKeyword("OTILDE-CAP");
        $ic323$ = SubLObjectFactory.makeString("&Otilde;");
        $ic324$ = SubLObjectFactory.makeKeyword("OUML-CAP");
        $ic325$ = SubLObjectFactory.makeString("&Ouml;");
        $ic326$ = SubLObjectFactory.makeKeyword("TIMES");
        $ic327$ = SubLObjectFactory.makeString("&times;");
        $ic328$ = SubLObjectFactory.makeKeyword("OSLASH-CAP");
        $ic329$ = SubLObjectFactory.makeString("&Oslash;");
        $ic330$ = SubLObjectFactory.makeKeyword("UGRAVE-CAP");
        $ic331$ = SubLObjectFactory.makeString("&Ugrave;");
        $ic332$ = SubLObjectFactory.makeKeyword("UACUTE-CAP");
        $ic333$ = SubLObjectFactory.makeString("&Uacute;");
        $ic334$ = SubLObjectFactory.makeKeyword("UCIRC-CAP");
        $ic335$ = SubLObjectFactory.makeString("&Ucirc;");
        $ic336$ = SubLObjectFactory.makeKeyword("UUML-CAP");
        $ic337$ = SubLObjectFactory.makeString("&Uuml;");
        $ic338$ = SubLObjectFactory.makeKeyword("YACUTE-CAP");
        $ic339$ = SubLObjectFactory.makeString("&Yacute;");
        $ic340$ = SubLObjectFactory.makeKeyword("THORN-CAP");
        $ic341$ = SubLObjectFactory.makeString("&THORN;");
        $ic342$ = SubLObjectFactory.makeKeyword("SZLIG");
        $ic343$ = SubLObjectFactory.makeString("&szlig;");
        $ic344$ = SubLObjectFactory.makeKeyword("AGRAVE");
        $ic345$ = SubLObjectFactory.makeString("&agrave;");
        $ic346$ = SubLObjectFactory.makeKeyword("AACUTE");
        $ic347$ = SubLObjectFactory.makeString("&aacute;");
        $ic348$ = SubLObjectFactory.makeKeyword("ACIRC");
        $ic349$ = SubLObjectFactory.makeString("&acirc;");
        $ic350$ = SubLObjectFactory.makeKeyword("ATILDE");
        $ic351$ = SubLObjectFactory.makeString("&atilde;");
        $ic352$ = SubLObjectFactory.makeKeyword("AUML");
        $ic353$ = SubLObjectFactory.makeString("&auml;");
        $ic354$ = SubLObjectFactory.makeKeyword("ARING");
        $ic355$ = SubLObjectFactory.makeString("&aring;");
        $ic356$ = SubLObjectFactory.makeKeyword("AELIG");
        $ic357$ = SubLObjectFactory.makeString("&aelig;");
        $ic358$ = SubLObjectFactory.makeKeyword("CCEDIL");
        $ic359$ = SubLObjectFactory.makeString("&ccedil;");
        $ic360$ = SubLObjectFactory.makeKeyword("EGRAVE");
        $ic361$ = SubLObjectFactory.makeString("&egrave;");
        $ic362$ = SubLObjectFactory.makeKeyword("EACUTE");
        $ic363$ = SubLObjectFactory.makeString("&eacute;");
        $ic364$ = SubLObjectFactory.makeKeyword("ECIRC");
        $ic365$ = SubLObjectFactory.makeString("&ecirc;");
        $ic366$ = SubLObjectFactory.makeKeyword("EUML");
        $ic367$ = SubLObjectFactory.makeString("&euml;");
        $ic368$ = SubLObjectFactory.makeKeyword("IGRAVE");
        $ic369$ = SubLObjectFactory.makeString("&igrave;");
        $ic370$ = SubLObjectFactory.makeKeyword("IACUTE");
        $ic371$ = SubLObjectFactory.makeString("&iacute;");
        $ic372$ = SubLObjectFactory.makeKeyword("ICIRC");
        $ic373$ = SubLObjectFactory.makeString("&icirc;");
        $ic374$ = SubLObjectFactory.makeKeyword("IUML");
        $ic375$ = SubLObjectFactory.makeString("&iuml;");
        $ic376$ = SubLObjectFactory.makeKeyword("ETH");
        $ic377$ = SubLObjectFactory.makeString("&eth;");
        $ic378$ = SubLObjectFactory.makeKeyword("NTILDE");
        $ic379$ = SubLObjectFactory.makeString("&ntilde;");
        $ic380$ = SubLObjectFactory.makeKeyword("OGRAVE");
        $ic381$ = SubLObjectFactory.makeString("&ograve;");
        $ic382$ = SubLObjectFactory.makeKeyword("OACUTE");
        $ic383$ = SubLObjectFactory.makeString("&oacute;");
        $ic384$ = SubLObjectFactory.makeKeyword("OCIRC");
        $ic385$ = SubLObjectFactory.makeString("&ocirc;");
        $ic386$ = SubLObjectFactory.makeKeyword("OTILDE");
        $ic387$ = SubLObjectFactory.makeString("&otilde;");
        $ic388$ = SubLObjectFactory.makeKeyword("OUML");
        $ic389$ = SubLObjectFactory.makeString("&ouml;");
        $ic390$ = SubLObjectFactory.makeKeyword("DIVIDE");
        $ic391$ = SubLObjectFactory.makeString("&divide;");
        $ic392$ = SubLObjectFactory.makeKeyword("OSLASH");
        $ic393$ = SubLObjectFactory.makeString("&oslash;");
        $ic394$ = SubLObjectFactory.makeKeyword("UGRAVE");
        $ic395$ = SubLObjectFactory.makeString("&ugrave;");
        $ic396$ = SubLObjectFactory.makeKeyword("UACUTE");
        $ic397$ = SubLObjectFactory.makeString("&uacute;");
        $ic398$ = SubLObjectFactory.makeKeyword("UCIRC");
        $ic399$ = SubLObjectFactory.makeString("&ucirc;");
        $ic400$ = SubLObjectFactory.makeKeyword("UUML");
        $ic401$ = SubLObjectFactory.makeString("&uuml;");
        $ic402$ = SubLObjectFactory.makeKeyword("YACUTE");
        $ic403$ = SubLObjectFactory.makeString("&yacute;");
        $ic404$ = SubLObjectFactory.makeKeyword("THORN");
        $ic405$ = SubLObjectFactory.makeString("&thorn;");
        $ic406$ = SubLObjectFactory.makeKeyword("YUML");
        $ic407$ = SubLObjectFactory.makeString("&yuml;");
        $ic408$ = SubLObjectFactory.makeKeyword("FNOF");
        $ic409$ = SubLObjectFactory.makeString("&fnof;");
        $ic410$ = SubLObjectFactory.makeKeyword("ALPHA-CAP");
        $ic411$ = SubLObjectFactory.makeString("&Alpha;");
        $ic412$ = SubLObjectFactory.makeKeyword("BETA-CAP");
        $ic413$ = SubLObjectFactory.makeString("&Beta;");
        $ic414$ = SubLObjectFactory.makeKeyword("GAMMA-CAP");
        $ic415$ = SubLObjectFactory.makeString("&Gamma;");
        $ic416$ = SubLObjectFactory.makeKeyword("DELTA-CAP");
        $ic417$ = SubLObjectFactory.makeString("&Delta;");
        $ic418$ = SubLObjectFactory.makeKeyword("EPSILON-CAP");
        $ic419$ = SubLObjectFactory.makeString("&Epsilon;");
        $ic420$ = SubLObjectFactory.makeKeyword("ZETA-CAP");
        $ic421$ = SubLObjectFactory.makeString("&Zeta;");
        $ic422$ = SubLObjectFactory.makeKeyword("ETA-CAP");
        $ic423$ = SubLObjectFactory.makeString("&Eta;");
        $ic424$ = SubLObjectFactory.makeKeyword("THETA-CAP");
        $ic425$ = SubLObjectFactory.makeString("&Theta;");
        $ic426$ = SubLObjectFactory.makeKeyword("IOTA-CAP");
        $ic427$ = SubLObjectFactory.makeString("&Iota;");
        $ic428$ = SubLObjectFactory.makeKeyword("KAPPA-CAP");
        $ic429$ = SubLObjectFactory.makeString("&Kappa;");
        $ic430$ = SubLObjectFactory.makeKeyword("LAMBDA-CAP");
        $ic431$ = SubLObjectFactory.makeString("&Lambda;");
        $ic432$ = SubLObjectFactory.makeKeyword("MU-CAP");
        $ic433$ = SubLObjectFactory.makeString("&Mu;");
        $ic434$ = SubLObjectFactory.makeKeyword("NU-CAP");
        $ic435$ = SubLObjectFactory.makeString("&Nu;");
        $ic436$ = SubLObjectFactory.makeKeyword("XI-CAP");
        $ic437$ = SubLObjectFactory.makeString("&Xi;");
        $ic438$ = SubLObjectFactory.makeKeyword("OMICRON-CAP");
        $ic439$ = SubLObjectFactory.makeString("&Omicron;");
        $ic440$ = SubLObjectFactory.makeKeyword("PI-CAP");
        $ic441$ = SubLObjectFactory.makeString("&Pi;");
        $ic442$ = SubLObjectFactory.makeKeyword("RHO-CAP");
        $ic443$ = SubLObjectFactory.makeString("&Rho;");
        $ic444$ = SubLObjectFactory.makeKeyword("SIGMA-CAP");
        $ic445$ = SubLObjectFactory.makeString("&Sigma;");
        $ic446$ = SubLObjectFactory.makeKeyword("TAU-CAP");
        $ic447$ = SubLObjectFactory.makeString("&Tau;");
        $ic448$ = SubLObjectFactory.makeKeyword("UPSILON-CAP");
        $ic449$ = SubLObjectFactory.makeString("&Upsilon;");
        $ic450$ = SubLObjectFactory.makeKeyword("PHI-CAP");
        $ic451$ = SubLObjectFactory.makeString("&Phi;");
        $ic452$ = SubLObjectFactory.makeKeyword("CHI-CAP");
        $ic453$ = SubLObjectFactory.makeString("&Chi;");
        $ic454$ = SubLObjectFactory.makeKeyword("PSI-CAP");
        $ic455$ = SubLObjectFactory.makeString("&Psi;");
        $ic456$ = SubLObjectFactory.makeKeyword("OMEGA-CAP");
        $ic457$ = SubLObjectFactory.makeString("&Omega;");
        $ic458$ = SubLObjectFactory.makeKeyword("ALPHA");
        $ic459$ = SubLObjectFactory.makeString("&alpha;");
        $ic460$ = SubLObjectFactory.makeKeyword("BETA");
        $ic461$ = SubLObjectFactory.makeString("&beta;");
        $ic462$ = SubLObjectFactory.makeKeyword("GAMMA");
        $ic463$ = SubLObjectFactory.makeString("&gamma;");
        $ic464$ = SubLObjectFactory.makeKeyword("DELTA");
        $ic465$ = SubLObjectFactory.makeString("&delta;");
        $ic466$ = SubLObjectFactory.makeKeyword("EPSILON");
        $ic467$ = SubLObjectFactory.makeString("&epsilon;");
        $ic468$ = SubLObjectFactory.makeKeyword("ZETA");
        $ic469$ = SubLObjectFactory.makeString("&zeta;");
        $ic470$ = SubLObjectFactory.makeKeyword("ETA");
        $ic471$ = SubLObjectFactory.makeString("&eta;");
        $ic472$ = SubLObjectFactory.makeKeyword("THETA");
        $ic473$ = SubLObjectFactory.makeString("&theta;");
        $ic474$ = SubLObjectFactory.makeKeyword("IOTA");
        $ic475$ = SubLObjectFactory.makeString("&iota;");
        $ic476$ = SubLObjectFactory.makeKeyword("KAPPA");
        $ic477$ = SubLObjectFactory.makeString("&kappa;");
        $ic478$ = SubLObjectFactory.makeKeyword("LAMBDA");
        $ic479$ = SubLObjectFactory.makeString("&lambda;");
        $ic480$ = SubLObjectFactory.makeKeyword("MU");
        $ic481$ = SubLObjectFactory.makeString("&mu;");
        $ic482$ = SubLObjectFactory.makeKeyword("NU");
        $ic483$ = SubLObjectFactory.makeString("&nu;");
        $ic484$ = SubLObjectFactory.makeKeyword("XI");
        $ic485$ = SubLObjectFactory.makeString("&xi;");
        $ic486$ = SubLObjectFactory.makeKeyword("OMICRON");
        $ic487$ = SubLObjectFactory.makeString("&omicron;");
        $ic488$ = SubLObjectFactory.makeKeyword("PI");
        $ic489$ = SubLObjectFactory.makeString("&pi;");
        $ic490$ = SubLObjectFactory.makeKeyword("RHO");
        $ic491$ = SubLObjectFactory.makeString("&rho;");
        $ic492$ = SubLObjectFactory.makeKeyword("SIGMAF");
        $ic493$ = SubLObjectFactory.makeString("&sigmaf;");
        $ic494$ = SubLObjectFactory.makeKeyword("SIGMA");
        $ic495$ = SubLObjectFactory.makeString("&sigma;");
        $ic496$ = SubLObjectFactory.makeKeyword("TAU");
        $ic497$ = SubLObjectFactory.makeString("&tau;");
        $ic498$ = SubLObjectFactory.makeKeyword("UPSILON");
        $ic499$ = SubLObjectFactory.makeString("&upsilon;");
        $ic500$ = SubLObjectFactory.makeKeyword("PHI");
        $ic501$ = SubLObjectFactory.makeString("&phi;");
        $ic502$ = SubLObjectFactory.makeKeyword("CHI");
        $ic503$ = SubLObjectFactory.makeString("&chi;");
        $ic504$ = SubLObjectFactory.makeKeyword("PSI");
        $ic505$ = SubLObjectFactory.makeString("&psi;");
        $ic506$ = SubLObjectFactory.makeKeyword("OMEGA");
        $ic507$ = SubLObjectFactory.makeString("&omega;");
        $ic508$ = SubLObjectFactory.makeKeyword("THETASYM");
        $ic509$ = SubLObjectFactory.makeKeyword("UPSIH");
        $ic510$ = SubLObjectFactory.makeString("&upsih;");
        $ic511$ = SubLObjectFactory.makeKeyword("PIV");
        $ic512$ = SubLObjectFactory.makeString("&piv;");
        $ic513$ = SubLObjectFactory.makeKeyword("BULL");
        $ic514$ = SubLObjectFactory.makeString("&bull;");
        $ic515$ = SubLObjectFactory.makeKeyword("HELLIP");
        $ic516$ = SubLObjectFactory.makeString("&hellip;");
        $ic517$ = SubLObjectFactory.makeKeyword("PRIME");
        $ic518$ = SubLObjectFactory.makeString("&prime;");
        $ic519$ = SubLObjectFactory.makeKeyword("PRIME-DBL");
        $ic520$ = SubLObjectFactory.makeString("&Prime;");
        $ic521$ = SubLObjectFactory.makeKeyword("OLINE");
        $ic522$ = SubLObjectFactory.makeString("&oline;");
        $ic523$ = SubLObjectFactory.makeKeyword("FRASL");
        $ic524$ = SubLObjectFactory.makeString("&frasl;");
        $ic525$ = SubLObjectFactory.makeKeyword("WEIERP");
        $ic526$ = SubLObjectFactory.makeString("&weierp;");
        $ic527$ = SubLObjectFactory.makeKeyword("IMAGE");
        $ic528$ = SubLObjectFactory.makeString("&image;");
        $ic529$ = SubLObjectFactory.makeKeyword("REAL");
        $ic530$ = SubLObjectFactory.makeString("&real;");
        $ic531$ = SubLObjectFactory.makeKeyword("TRADE");
        $ic532$ = SubLObjectFactory.makeString("&trade;");
        $ic533$ = SubLObjectFactory.makeKeyword("ALEFSYM");
        $ic534$ = SubLObjectFactory.makeString("&alefsym;");
        $ic535$ = SubLObjectFactory.makeKeyword("UPWARDS-ARROW");
        $ic536$ = SubLObjectFactory.makeString("&uarr;");
        $ic537$ = SubLObjectFactory.makeKeyword("RIGHTWARDS-ARROW");
        $ic538$ = SubLObjectFactory.makeString("&rarr;");
        $ic539$ = SubLObjectFactory.makeKeyword("LARR");
        $ic540$ = SubLObjectFactory.makeString("&larr;");
        $ic541$ = SubLObjectFactory.makeKeyword("UARR");
        $ic542$ = SubLObjectFactory.makeKeyword("RARR");
        $ic543$ = SubLObjectFactory.makeKeyword("DARR");
        $ic544$ = SubLObjectFactory.makeString("&darr;");
        $ic545$ = SubLObjectFactory.makeKeyword("HARR");
        $ic546$ = SubLObjectFactory.makeString("&harr;");
        $ic547$ = SubLObjectFactory.makeKeyword("CRARR");
        $ic548$ = SubLObjectFactory.makeString("&crarr;");
        $ic549$ = SubLObjectFactory.makeKeyword("LARR-DBL");
        $ic550$ = SubLObjectFactory.makeString("&lArr;");
        $ic551$ = SubLObjectFactory.makeKeyword("UARR-DBL");
        $ic552$ = SubLObjectFactory.makeString("&uArr;");
        $ic553$ = SubLObjectFactory.makeKeyword("RARR-DBL");
        $ic554$ = SubLObjectFactory.makeString("&rArr;");
        $ic555$ = SubLObjectFactory.makeKeyword("DARR-DBL");
        $ic556$ = SubLObjectFactory.makeString("&dArr;");
        $ic557$ = SubLObjectFactory.makeKeyword("HARR-DBL");
        $ic558$ = SubLObjectFactory.makeString("&hArr;");
        $ic559$ = SubLObjectFactory.makeKeyword("FORALL");
        $ic560$ = SubLObjectFactory.makeString("&forall;");
        $ic561$ = SubLObjectFactory.makeKeyword("PART");
        $ic562$ = SubLObjectFactory.makeString("&part;");
        $ic563$ = SubLObjectFactory.makeKeyword("EXIST");
        $ic564$ = SubLObjectFactory.makeString("&exist;");
        $ic565$ = SubLObjectFactory.makeKeyword("EMPTY");
        $ic566$ = SubLObjectFactory.makeString("&empty;");
        $ic567$ = SubLObjectFactory.makeKeyword("NABLA");
        $ic568$ = SubLObjectFactory.makeString("&nabla;");
        $ic569$ = SubLObjectFactory.makeKeyword("ISIN");
        $ic570$ = SubLObjectFactory.makeString("&isin;");
        $ic571$ = SubLObjectFactory.makeKeyword("NOTIN");
        $ic572$ = SubLObjectFactory.makeString("&notin;");
        $ic573$ = SubLObjectFactory.makeKeyword("NI");
        $ic574$ = SubLObjectFactory.makeString("&ni;");
        $ic575$ = SubLObjectFactory.makeKeyword("PROD");
        $ic576$ = SubLObjectFactory.makeString("&prod;");
        $ic577$ = SubLObjectFactory.makeKeyword("SUM");
        $ic578$ = SubLObjectFactory.makeString("&sum;");
        $ic579$ = SubLObjectFactory.makeKeyword("MINUS");
        $ic580$ = SubLObjectFactory.makeString("&minus;");
        $ic581$ = SubLObjectFactory.makeKeyword("LOWAST");
        $ic582$ = SubLObjectFactory.makeString("&lowast;");
        $ic583$ = SubLObjectFactory.makeKeyword("RADIC");
        $ic584$ = SubLObjectFactory.makeString("&radic;");
        $ic585$ = SubLObjectFactory.makeKeyword("PROP");
        $ic586$ = SubLObjectFactory.makeString("&prop;");
        $ic587$ = SubLObjectFactory.makeKeyword("INFIN");
        $ic588$ = SubLObjectFactory.makeString("&infin;");
        $ic589$ = SubLObjectFactory.makeKeyword("ANG");
        $ic590$ = SubLObjectFactory.makeString("&ang;");
        $ic591$ = SubLObjectFactory.makeKeyword("AND");
        $ic592$ = SubLObjectFactory.makeString("&and;");
        $ic593$ = SubLObjectFactory.makeKeyword("OR");
        $ic594$ = SubLObjectFactory.makeString("&or;");
        $ic595$ = SubLObjectFactory.makeKeyword("CAP");
        $ic596$ = SubLObjectFactory.makeString("&cap;");
        $ic597$ = SubLObjectFactory.makeKeyword("CUP");
        $ic598$ = SubLObjectFactory.makeString("&cup;");
        $ic599$ = SubLObjectFactory.makeKeyword("INT");
        $ic600$ = SubLObjectFactory.makeString("&int;");
        $ic601$ = SubLObjectFactory.makeKeyword("THERE4");
        $ic602$ = SubLObjectFactory.makeString("&there4;");
        $ic603$ = SubLObjectFactory.makeKeyword("SIM");
        $ic604$ = SubLObjectFactory.makeString("&sim;");
        $ic605$ = SubLObjectFactory.makeKeyword("CONG");
        $ic606$ = SubLObjectFactory.makeString("&cong;");
        $ic607$ = SubLObjectFactory.makeKeyword("ASYMP");
        $ic608$ = SubLObjectFactory.makeString("&asymp;");
        $ic609$ = SubLObjectFactory.makeKeyword("NE");
        $ic610$ = SubLObjectFactory.makeString("&ne;");
        $ic611$ = SubLObjectFactory.makeKeyword("EQUIV");
        $ic612$ = SubLObjectFactory.makeString("&equiv;");
        $ic613$ = SubLObjectFactory.makeKeyword("LE");
        $ic614$ = SubLObjectFactory.makeString("&le;");
        $ic615$ = SubLObjectFactory.makeKeyword("GE");
        $ic616$ = SubLObjectFactory.makeString("&ge;");
        $ic617$ = SubLObjectFactory.makeKeyword("SUB");
        $ic618$ = SubLObjectFactory.makeString("&sub;");
        $ic619$ = SubLObjectFactory.makeKeyword("SUP");
        $ic620$ = SubLObjectFactory.makeString("&sup;");
        $ic621$ = SubLObjectFactory.makeKeyword("NSUB");
        $ic622$ = SubLObjectFactory.makeString("&nsub;");
        $ic623$ = SubLObjectFactory.makeKeyword("SUBE");
        $ic624$ = SubLObjectFactory.makeString("&sube;");
        $ic625$ = SubLObjectFactory.makeKeyword("SUPE");
        $ic626$ = SubLObjectFactory.makeString("&supe;");
        $ic627$ = SubLObjectFactory.makeKeyword("OPLUS");
        $ic628$ = SubLObjectFactory.makeString("&oplus;");
        $ic629$ = SubLObjectFactory.makeKeyword("OTIMES");
        $ic630$ = SubLObjectFactory.makeString("&otimes;");
        $ic631$ = SubLObjectFactory.makeKeyword("PERP");
        $ic632$ = SubLObjectFactory.makeString("&perp;");
        $ic633$ = SubLObjectFactory.makeKeyword("SDOT");
        $ic634$ = SubLObjectFactory.makeString("&sdot;");
        $ic635$ = SubLObjectFactory.makeKeyword("LCEIL");
        $ic636$ = SubLObjectFactory.makeString("&lceil;");
        $ic637$ = SubLObjectFactory.makeKeyword("RCEIL");
        $ic638$ = SubLObjectFactory.makeString("&rceil;");
        $ic639$ = SubLObjectFactory.makeKeyword("LFLOOR");
        $ic640$ = SubLObjectFactory.makeString("&lfloor;");
        $ic641$ = SubLObjectFactory.makeKeyword("RFLOOR");
        $ic642$ = SubLObjectFactory.makeString("&rfloor;");
        $ic643$ = SubLObjectFactory.makeKeyword("LANG");
        $ic644$ = SubLObjectFactory.makeString("&lang;");
        $ic645$ = SubLObjectFactory.makeKeyword("RANG");
        $ic646$ = SubLObjectFactory.makeString("&rang;");
        $ic647$ = SubLObjectFactory.makeKeyword("LOZ");
        $ic648$ = SubLObjectFactory.makeString("&loz;");
        $ic649$ = SubLObjectFactory.makeKeyword("SPADES");
        $ic650$ = SubLObjectFactory.makeString("&spades;");
        $ic651$ = SubLObjectFactory.makeKeyword("CLUBS");
        $ic652$ = SubLObjectFactory.makeString("&clubs;");
        $ic653$ = SubLObjectFactory.makeKeyword("HEARTS");
        $ic654$ = SubLObjectFactory.makeString("&hearts;");
        $ic655$ = SubLObjectFactory.makeKeyword("DIAMS");
        $ic656$ = SubLObjectFactory.makeString("&diams;");
        $ic657$ = SubLObjectFactory.makeKeyword("FROWNY-FACE");
        $ic658$ = SubLObjectFactory.makeString("&#9785;");
        $ic659$ = SubLObjectFactory.makeSymbol("S#3891", "CYC");
        $ic660$ = SubLObjectFactory.makeString("&#");
        $ic661$ = SubLObjectFactory.makeString("_");
        $ic662$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic663$ = SubLObjectFactory.makeString("Echo of ARGS");
        $ic664$ = SubLObjectFactory.makeKeyword("SELF");
        $ic665$ = SubLObjectFactory.makeString("Back");
        $ic666$ = SubLObjectFactory.makeSymbol("HTML-ECHO-ARGS");
        $ic667$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#885", "CYC"));
        $ic668$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic669$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic670$ = SubLObjectFactory.makeKeyword("EOF");
        $ic671$ = SubLObjectFactory.makeSymbol("HTML-ECHO-FILE");
        $ic672$ = SubLObjectFactory.makeString("\"");
        $ic673$ = SubLObjectFactory.makeString("<!--");
        $ic674$ = SubLObjectFactory.makeString("-->");
        $ic675$ = SubLObjectFactory.makeString("<script");
        $ic676$ = SubLObjectFactory.makeString("</script>");
        $ic677$ = SubLObjectFactory.makeString("</script");
        $ic678$ = ConsesLow.list((SubLObject)Characters.CHAR_backslash);
        $ic679$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&quot;"), (SubLObject)SubLObjectFactory.makeString("\"")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&amp;"), (SubLObject)SubLObjectFactory.makeString("&")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&nbsp;"), (SubLObject)SubLObjectFactory.makeString(" ")));
        $ic680$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic681$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic682$ = SubLObjectFactory.makeString("http://");
        $ic683$ = SubLObjectFactory.makeInteger(80);
        $ic684$ = SubLObjectFactory.makeKeyword("GET");
        $ic685$ = SubLObjectFactory.makeString("<style");
        $ic686$ = SubLObjectFactory.makeString("</style>");
        $ic687$ = SubLObjectFactory.makeString("<p>");
        $ic688$ = SubLObjectFactory.makeString("_file_input_");
        $ic689$ = SubLObjectFactory.makeString("this.form.");
        $ic690$ = SubLObjectFactory.makeString(".value = this.value;");
        $ic691$ = SubLObjectFactory.makeString("TEXT");
        $ic692$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1630", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#1553", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic693$ = SubLObjectFactory.makeUninternedSymbol("US#49250BD");
        $ic694$ = SubLObjectFactory.makeSymbol("CLET");
        $ic695$ = SubLObjectFactory.makeSymbol("S#42901", "CYC");
        $ic696$ = SubLObjectFactory.makeSymbol("S#1011", "CYC");
        $ic697$ = SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*");
        $ic698$ = SubLObjectFactory.makeSymbol("S#1248", "CYC");
        $ic699$ = ConsesLow.list((SubLObject)module0642.NIL, (SubLObject)module0642.NIL, (SubLObject)module0642.NIL, (SubLObject)SubLObjectFactory.makeString("multipart/form-data"));
        $ic700$ = SubLObjectFactory.makeSymbol("S#912", "CYC");
        $ic701$ = ConsesLow.list((SubLObject)module0642.T);
        $ic702$ = SubLObjectFactory.makeString(" multipart/formdata");
        $ic703$ = SubLObjectFactory.makeString("application/octet-stream");
        $ic704$ = SubLObjectFactory.makeString("T");
        $ic705$ = SubLObjectFactory.makeSymbol("CHAR=");
        $ic706$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic707$ = SubLObjectFactory.makeString("%~2,'0X");
        $ic708$ = SubLObjectFactory.makeString("--------------------");
        $ic709$ = SubLObjectFactory.makeInteger(200);
        $ic710$ = SubLObjectFactory.makeKeyword("VERTICAL");
        $ic711$ = SubLObjectFactory.makeKeyword("SIZE");
        $ic712$ = SubLObjectFactory.makeKeyword("CLASS");
        $ic713$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic714$ = SubLObjectFactory.makeKeyword("NAME");
        $ic715$ = SubLObjectFactory.makeKeyword("COLOR");
        $ic716$ = SubLObjectFactory.makeKeyword("FONT-COLOR");
        $ic717$ = SubLObjectFactory.makeKeyword("BLACK");
        $ic718$ = SubLObjectFactory.makeInteger(400);
        $ic719$ = SubLObjectFactory.makeInteger(4000);
        $ic720$ = SubLObjectFactory.makeKeyword("HORIZONTAL");
        $ic721$ = SubLObjectFactory.makeKeyword("CLASS-COLORMAP");
        $ic722$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic723$ = SubLObjectFactory.makeString("sha1.js");
        $ic724$ = SubLObjectFactory.makeString("new_login_id");
        $ic725$ = SubLObjectFactory.makeString("hashed_password");
        $ic726$ = SubLObjectFactory.makeString("User ID");
        $ic727$ = SubLObjectFactory.makeString("Password");
        $ic728$ = SubLObjectFactory.makeString("unhashed_password_");
        $ic729$ = SubLObjectFactory.makeString("var oldB64Pad = b64pad; b64pad = '='; var theInput=(this.form.");
        $ic730$ = SubLObjectFactory.makeString(".value+this.form.");
        $ic731$ = SubLObjectFactory.makeString(".value); this.form.");
        $ic732$ = SubLObjectFactory.makeString(".value=b64_sha1(theInput); b64pad = oldB64Pad");
        $ic733$ = SubLObjectFactory.makeInteger(30);
        $ic734$ = SubLObjectFactory.makeKeyword("PASSWORD");
        $ic735$ = SubLObjectFactory.makeString("Submit");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0642.class
	Total time: 2749 ms
	
	Decompiled with Procyon 0.5.32.
*/