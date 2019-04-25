package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0677 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0677";
    public static final String myFingerPrint = "6c63042b26e4e9c703800064a487b4379a2fb2604305ad1ccfa3e6f737e6a917";
    public static SubLSymbol $g5312$;
    private static SubLSymbol $g5313$;
    private static SubLSymbol $g5314$;
    private static SubLSymbol $g5316$;
    private static SubLSymbol $g5317$;
    private static SubLSymbol $g5318$;
    public static SubLSymbol $g5319$;
    public static SubLSymbol $g5320$;
    public static SubLSymbol $g5321$;
    public static SubLSymbol $g5322$;
    public static SubLSymbol $g5323$;
    public static SubLSymbol $g5324$;
    public static SubLSymbol $g5326$;
    public static SubLSymbol $g5327$;
    public static SubLSymbol $g5328$;
    public static SubLSymbol $g5329$;
    public static SubLSymbol $g5330$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLList $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLList $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLList $ic109$;
    private static final SubLList $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLList $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLList $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLList $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLString $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLObject $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLList $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLObject $ic237$;
    private static final SubLString $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLString $ic244$;
    private static final SubLString $ic245$;
    private static final SubLString $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLList $ic259$;
    private static final SubLString $ic260$;
    private static final SubLString $ic261$;
    private static final SubLString $ic262$;
    private static final SubLString $ic263$;
    private static final SubLString $ic264$;
    private static final SubLString $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLString $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLString $ic276$;
    private static final SubLString $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLString $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLString $ic288$;
    private static final SubLString $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLString $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLString $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLString $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLString $ic311$;
    private static final SubLString $ic312$;
    private static final SubLString $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLString $ic315$;
    private static final SubLString $ic316$;
    private static final SubLList $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLString $ic324$;
    private static final SubLString $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLString $ic327$;
    private static final SubLString $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLString $ic330$;
    private static final SubLString $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLString $ic336$;
    private static final SubLString $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLString $ic344$;
    private static final SubLString $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLString $ic348$;
    private static final SubLInteger $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLInteger $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLInteger $ic359$;
    private static final SubLString $ic360$;
    private static final SubLString $ic361$;
    private static final SubLString $ic362$;
    private static final SubLString $ic363$;
    private static final SubLString $ic364$;
    private static final SubLString $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLString $ic368$;
    private static final SubLString $ic369$;
    private static final SubLString $ic370$;
    private static final SubLString $ic371$;
    private static final SubLString $ic372$;
    private static final SubLString $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLSymbol $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLSymbol $ic380$;
    private static final SubLString $ic381$;
    private static final SubLString $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLString $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLString $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLString $ic390$;
    private static final SubLString $ic391$;
    private static final SubLString $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLString $ic394$;
    private static final SubLString $ic395$;
    private static final SubLString $ic396$;
    private static final SubLString $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLString $ic400$;
    private static final SubLSymbol $ic401$;
    private static final SubLSymbol $ic402$;
    private static final SubLInteger $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLString $ic405$;
    private static final SubLString $ic406$;
    private static final SubLString $ic407$;
    private static final SubLString $ic408$;
    private static final SubLString $ic409$;
    private static final SubLString $ic410$;
    private static final SubLString $ic411$;
    private static final SubLString $ic412$;
    private static final SubLString $ic413$;
    private static final SubLSymbol $ic414$;
    private static final SubLString $ic415$;
    private static final SubLString $ic416$;
    private static final SubLString $ic417$;
    private static final SubLString $ic418$;
    private static final SubLString $ic419$;
    private static final SubLSymbol $ic420$;
    private static final SubLString $ic421$;
    private static final SubLString $ic422$;
    private static final SubLString $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLSymbol $ic425$;
    private static final SubLString $ic426$;
    private static final SubLString $ic427$;
    private static final SubLString $ic428$;
    private static final SubLString $ic429$;
    private static final SubLString $ic430$;
    private static final SubLString $ic431$;
    private static final SubLSymbol $ic432$;
    private static final SubLString $ic433$;
    private static final SubLString $ic434$;
    private static final SubLString $ic435$;
    private static final SubLString $ic436$;
    private static final SubLString $ic437$;
    private static final SubLString $ic438$;
    private static final SubLString $ic439$;
    private static final SubLString $ic440$;
    private static final SubLString $ic441$;
    private static final SubLString $ic442$;
    private static final SubLString $ic443$;
    private static final SubLString $ic444$;
    private static final SubLString $ic445$;
    private static final SubLString $ic446$;
    private static final SubLString $ic447$;
    private static final SubLString $ic448$;
    private static final SubLString $ic449$;
    private static final SubLString $ic450$;
    private static final SubLString $ic451$;
    private static final SubLString $ic452$;
    private static final SubLString $ic453$;
    private static final SubLInteger $ic454$;
    private static final SubLString $ic455$;
    private static final SubLString $ic456$;
    private static final SubLObject $ic457$;
    private static final SubLString $ic458$;
    private static final SubLSymbol $ic459$;
    private static final SubLSymbol $ic460$;
    private static final SubLString $ic461$;
    private static final SubLString $ic462$;
    private static final SubLString $ic463$;
    private static final SubLString $ic464$;
    private static final SubLString $ic465$;
    private static final SubLString $ic466$;
    private static final SubLString $ic467$;
    private static final SubLString $ic468$;
    private static final SubLString $ic469$;
    private static final SubLString $ic470$;
    private static final SubLString $ic471$;
    private static final SubLString $ic472$;
    private static final SubLSymbol $ic473$;
    private static final SubLSymbol $ic474$;
    private static final SubLSymbol $ic475$;
    private static final SubLSymbol $ic476$;
    private static final SubLSymbol $ic477$;
    private static final SubLSymbol $ic478$;
    private static final SubLObject $ic479$;
    private static final SubLSymbol $ic480$;
    private static final SubLObject $ic481$;
    private static final SubLObject $ic482$;
    private static final SubLObject $ic483$;
    private static final SubLObject $ic484$;
    private static final SubLObject $ic485$;
    private static final SubLList $ic486$;
    private static final SubLObject $ic487$;
    private static final SubLList $ic488$;
    private static final SubLSymbol $ic489$;
    private static final SubLString $ic490$;
    private static final SubLSymbol $ic491$;
    private static final SubLString $ic492$;
    private static final SubLString $ic493$;
    private static final SubLSymbol $ic494$;
    private static final SubLString $ic495$;
    private static final SubLString $ic496$;
    private static final SubLString $ic497$;
    private static final SubLSymbol $ic498$;
    private static final SubLSymbol $ic499$;
    private static final SubLString $ic500$;
    private static final SubLSymbol $ic501$;
    private static final SubLString $ic502$;
    private static final SubLString $ic503$;
    private static final SubLString $ic504$;
    private static final SubLString $ic505$;
    private static final SubLString $ic506$;
    private static final SubLString $ic507$;
    private static final SubLString $ic508$;
    private static final SubLString $ic509$;
    private static final SubLSymbol $ic510$;
    private static final SubLSymbol $ic511$;
    private static final SubLString $ic512$;
    private static final SubLString $ic513$;
    private static final SubLString $ic514$;
    private static final SubLString $ic515$;
    private static final SubLString $ic516$;
    private static final SubLString $ic517$;
    private static final SubLString $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLObject $ic520$;
    private static final SubLString $ic521$;
    private static final SubLString $ic522$;
    private static final SubLSymbol $ic523$;
    private static final SubLString $ic524$;
    private static final SubLString $ic525$;
    private static final SubLSymbol $ic526$;
    private static final SubLSymbol $ic527$;
    private static final SubLString $ic528$;
    private static final SubLString $ic529$;
    private static final SubLSymbol $ic530$;
    private static final SubLString $ic531$;
    private static final SubLString $ic532$;
    private static final SubLString $ic533$;
    private static final SubLSymbol $ic534$;
    private static final SubLString $ic535$;
    private static final SubLString $ic536$;
    private static final SubLString $ic537$;
    private static final SubLString $ic538$;
    private static final SubLSymbol $ic539$;
    private static final SubLSymbol $ic540$;
    private static final SubLString $ic541$;
    private static final SubLString $ic542$;
    private static final SubLSymbol $ic543$;
    private static final SubLString $ic544$;
    private static final SubLString $ic545$;
    private static final SubLString $ic546$;
    private static final SubLSymbol $ic547$;
    private static final SubLString $ic548$;
    private static final SubLString $ic549$;
    private static final SubLString $ic550$;
    private static final SubLString $ic551$;
    private static final SubLInteger $ic552$;
    private static final SubLString $ic553$;
    private static final SubLString $ic554$;
    
    public static SubLObject f41282(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)module0677.$ic2$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var3) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_6 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_7 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_8 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_8, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0677.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    if (module0677.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_9 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0677.$ic15$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                        module0656.f39870((SubLObject)module0677.$ic0$, (SubLObject)module0677.$ic16$, (SubLObject)module0677.$ic17$);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        SubLObject var9 = conses_high.set_difference(module0656.f39816(), module0656.f39817(), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        f41283(var9);
                        var9 = module0656.f39817();
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic18$);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        f41283(var9);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_9, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_7, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_6, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41283(SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        var13 = Sort.sort(var13, Symbols.symbol_function((SubLObject)module0677.$ic20$), Symbols.symbol_function((SubLObject)module0677.$ic21$));
        final SubLObject var15 = Sequences.length(var13);
        SubLObject var16 = var13;
        SubLObject var17 = (SubLObject)module0677.NIL;
        SubLObject var18 = (SubLObject)module0677.NIL;
        if (var15.numGE(module0677.$g5312$.getDynamicValue(var14))) {
            final SubLObject var19 = Numbers.integerDivide(Numbers.add(var15, (SubLObject)module0677.THREE_INTEGER), (SubLObject)module0677.THREE_INTEGER);
            var17 = Sequences.subseq(var13, var19, Numbers.multiply(var19, (SubLObject)module0677.TWO_INTEGER));
            var18 = Sequences.subseq(var13, Numbers.multiply(var19, (SubLObject)module0677.TWO_INTEGER), (SubLObject)module0677.UNPROVIDED);
            var16 = Sequences.subseq(var13, (SubLObject)module0677.ZERO_INTEGER, var19);
        }
        if (module0677.NIL != var17) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39046(module0015.$g348$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var20 = module0015.$g533$.currentBinding(var14);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var14);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_19 = module0015.$g533$.currentBinding(var14);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var14);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_20 = module0015.$g533$.currentBinding(var14);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var14);
                        f41284(var16);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_20, var14);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_21 = module0015.$g533$.currentBinding(var14);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var14);
                        module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_21, var14);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_22 = module0015.$g533$.currentBinding(var14);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var14);
                        f41284(var17);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_22, var14);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_23 = module0015.$g533$.currentBinding(var14);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var14);
                        module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_23, var14);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_24 = module0015.$g533$.currentBinding(var14);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var14);
                        f41284(var18);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_24, var14);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_19, var14);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var20, var14);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        else {
            f41284(var16);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41284(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var15 = module0015.$g533$.currentBinding(var14);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var14);
            SubLObject var16 = var13;
            SubLObject var17 = (SubLObject)module0677.NIL;
            var17 = var16.first();
            while (module0677.NIL != var16) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_27 = module0015.$g533$.currentBinding(var14);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var14);
                    SubLObject var19;
                    final SubLObject var18 = var19 = var17;
                    SubLObject var20 = (SubLObject)module0677.NIL;
                    SubLObject var21 = (SubLObject)module0677.NIL;
                    SubLObject var22 = (SubLObject)module0677.NIL;
                    SubLObject var23 = (SubLObject)module0677.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0677.$ic23$);
                    var20 = var19.first();
                    var19 = var19.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0677.$ic23$);
                    var21 = var19.first();
                    var19 = var19.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0677.$ic23$);
                    var22 = var19.first();
                    var19 = var19.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var19, var18, (SubLObject)module0677.$ic23$);
                    var23 = var19.first();
                    var19 = var19.rest();
                    final SubLObject var24 = (SubLObject)(var19.isCons() ? var19.first() : module0677.NIL);
                    cdestructuring_bind.destructuring_bind_must_listp(var19, var18, (SubLObject)module0677.$ic23$);
                    var19 = var19.rest();
                    if (module0677.NIL == var19) {
                        if (module0656.f39838(var20).isFunctionSpec()) {
                            final SubLObject var25 = conses_high.member(var20, module0655.$g5108$.getDynamicValue(var14), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                            final SubLObject var4_28 = module0015.$g533$.currentBinding(var14);
                            try {
                                module0015.$g533$.bind((SubLObject)module0677.T, var14);
                                module0642.f39020(module0015.$g149$.getGlobalValue());
                                if (module0677.NIL != var23) {
                                    module0642.f39020(module0015.$g159$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                                    module0642.f39020(var23);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                                final SubLObject var4_29 = module0015.$g533$.currentBinding(var14);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0677.T, var14);
                                    module0656.f39837(var20, var21, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_29, var14);
                                }
                                module0642.f39020(module0015.$g150$.getGlobalValue());
                                module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_28, var14);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)module0677.$ic23$);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_27, var14);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                var16 = var16.rest();
                var17 = var16.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var15, var14);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41285(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0656.f39815();
        SubLObject var4 = (SubLObject)module0677.NIL;
        SubLObject var5 = (SubLObject)module0677.NIL;
        SubLObject var6 = var1.rest();
        SubLObject var7 = (SubLObject)module0677.NIL;
        var7 = var6.first();
        while (module0677.NIL != var6) {
            final SubLObject var8 = var7.first();
            final SubLObject var9 = reader.read_from_string_ignoring_errors(var8, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != Sequences.find(var9, var3, Symbols.symbol_function((SubLObject)module0677.EQL), Symbols.symbol_function((SubLObject)module0677.$ic24$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED)) {
                var5 = (SubLObject)ConsesLow.cons(var9, var5);
            }
            else if (var8.equal((SubLObject)module0677.$ic25$)) {
                var4 = (SubLObject)module0677.T;
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        var5 = Sequences.nreverse(var5);
        module0655.$g5108$.setDynamicValue(var5, var2);
        if (module0677.NIL != var4) {
            f41286();
        }
        module0642.f39020((SubLObject)module0677.$ic3$);
        module0642.f39029((SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
        final SubLObject var10 = module0014.f672((SubLObject)module0677.$ic4$);
        module0642.f39029((SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.$ic5$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var10) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.$ic6$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39029((SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic26$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        f41287();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0677.UNPROVIDED);
        final SubLObject var11 = module0015.$g132$.getDynamicValue(var2);
        final SubLObject var12 = module0015.$g535$.currentBinding(var2);
        try {
            module0015.$g535$.bind((SubLObject)module0677.T, var2);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0677.NIL != var11) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39042(var11));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_43 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0677.$ic27$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0656.f39794((SubLObject)module0677.$ic28$);
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_43, var2);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var12, var2);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0677.UNPROVIDED);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41288(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic28$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var45), (SubLObject)module0677.$ic31$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41287() {
        return module0644.f39183(module0656.f39832((SubLObject)module0677.$ic34$));
    }
    
    public static SubLObject f41289(final SubLObject var46, final SubLObject var47) {
        return module0067.f4886(module0677.$g5313$.getGlobalValue(), var46, var47);
    }
    
    public static SubLObject f41290(final SubLObject var46) {
        return conses_high.getf(module0067.f4884(module0677.$g5313$.getGlobalValue(), var46, (SubLObject)module0677.UNPROVIDED), (SubLObject)module0677.$ic35$, (SubLObject)module0677.UNPROVIDED);
    }
    
    public static SubLObject f41291(final SubLObject var46) {
        return conses_high.getf(module0067.f4884(module0677.$g5313$.getGlobalValue(), var46, (SubLObject)module0677.UNPROVIDED), (SubLObject)module0677.$ic36$, (SubLObject)module0677.UNPROVIDED);
    }
    
    public static SubLObject f41292(final SubLObject var46) {
        final SubLObject var47 = conses_high.getf(module0067.f4884(module0677.$g5313$.getGlobalValue(), var46, (SubLObject)module0677.UNPROVIDED), (SubLObject)module0677.$ic37$, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != Symbols.fboundp(var47)) {
            return Functions.funcall(var47);
        }
        return module0035.sublisp_boolean(Symbols.symbol_value(var46));
    }
    
    public static SubLObject f41293(final SubLObject var46, final SubLObject var49) {
        final SubLObject var50 = conses_high.getf(module0067.f4884(module0677.$g5313$.getGlobalValue(), var46, (SubLObject)module0677.UNPROVIDED), (SubLObject)module0677.$ic38$, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != Symbols.fboundp(var50)) {
            return Functions.funcall(var50, var49);
        }
        return module0035.sublisp_boolean(var49);
    }
    
    public static SubLObject f41294(final SubLObject var51, final SubLObject var52) {
        SubLObject var54;
        final SubLObject var53 = var54 = var51.rest();
        SubLObject var55 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic39$);
        var55 = var54.first();
        var54 = var54.rest();
        if (module0677.NIL == var54) {
            final SubLObject var56 = (SubLObject)module0677.$ic40$;
            final SubLObject var57 = (SubLObject)module0677.$ic41$;
            return (SubLObject)ConsesLow.list((SubLObject)module0677.$ic42$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var56, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic43$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic44$, var55))), (SubLObject)ConsesLow.list(var57, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic45$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic44$, var55)))), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic46$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic47$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic48$, var56), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic49$, var57)), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic50$, (SubLObject)ConsesLow.list(var56, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic51$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic44$, var55))), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic52$, var57))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.$ic39$);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41295() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0655.$g5113$.getDynamicValue(var2);
    }
    
    public static SubLObject f41296(final SubLObject var49) {
        return (SubLObject)((module0677.NIL != module0035.sublisp_boolean(var49)) ? module0677.$ic75$ : module0677.NIL);
    }
    
    public static SubLObject f41297(final SubLObject var51, final SubLObject var52) {
        final SubLObject var53 = var51.rest();
        if (module0677.NIL != var53) {
            cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.NIL);
        }
        return (SubLObject)module0677.$ic110$;
    }
    
    public static SubLObject f41298(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)module0677.$ic113$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var3) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_58 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_59 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_60 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_60, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    if (module0677.NIL != module0644.$g5018$.getDynamicValue(var2)) {
                        module0644.f39197();
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0677.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    if (module0677.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_61 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0677.$ic114$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                        module0656.f39870((SubLObject)module0677.$ic111$, (SubLObject)module0677.$ic16$, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39073((SubLObject)module0677.$ic115$);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic116$, (SubLObject)module0677.$ic117$, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic118$, (SubLObject)module0677.$ic119$, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic120$, (SubLObject)module0677.$ic121$, (SubLObject)module0677.UNPROVIDED);
                        f41299();
                        f41300();
                        f41301();
                        f41302();
                        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39073((SubLObject)module0677.$ic115$);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic116$, (SubLObject)module0677.$ic117$, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic118$, (SubLObject)module0677.$ic119$, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic120$, (SubLObject)module0677.$ic121$, (SubLObject)module0677.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_61, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_59, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_58, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41303(final SubLObject var51, final SubLObject var52) {
        SubLObject var54;
        final SubLObject var53 = var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic123$);
        final SubLObject var55 = var54.rest();
        var54 = var54.first();
        SubLObject var56 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic123$);
        var56 = var54.first();
        var54 = var54.rest();
        if (module0677.NIL == var54) {
            final SubLObject var57;
            var54 = (var57 = var55);
            return (SubLObject)ConsesLow.list((SubLObject)module0677.$ic124$, (SubLObject)module0677.$ic125$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic126$, (SubLObject)module0677.$ic127$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic128$, var56)), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic129$, (SubLObject)module0677.$ic130$, reader.bq_cons((SubLObject)module0677.$ic131$, ConsesLow.append(var57, (SubLObject)module0677.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.$ic123$);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41304(final SubLObject var51, final SubLObject var52) {
        final SubLObject var53 = var51.rest();
        final SubLObject var55;
        final SubLObject var54 = var55 = var53;
        return (SubLObject)ConsesLow.list((SubLObject)module0677.$ic124$, (SubLObject)module0677.$ic132$, (SubLObject)ConsesLow.listS((SubLObject)module0677.$ic133$, (SubLObject)module0677.$ic134$, ConsesLow.append(var55, (SubLObject)module0677.NIL)));
    }
    
    public static SubLObject f41305(final SubLObject var51, final SubLObject var52) {
        SubLObject var54;
        final SubLObject var53 = var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic123$);
        final SubLObject var55 = var54.rest();
        var54 = var54.first();
        SubLObject var56 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic123$);
        var56 = var54.first();
        var54 = var54.rest();
        if (module0677.NIL == var54) {
            final SubLObject var57;
            var54 = (var57 = var55);
            return (SubLObject)ConsesLow.listS((SubLObject)module0677.$ic124$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic126$, (SubLObject)module0677.$ic135$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic136$, (SubLObject)module0677.$ic137$, var56)), ConsesLow.append(var57, (SubLObject)module0677.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.$ic123$);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41306(final SubLObject var51, final SubLObject var52) {
        SubLObject var54;
        final SubLObject var53 = var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic139$);
        final SubLObject var55 = var54.rest();
        var54 = var54.first();
        SubLObject var56 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic139$);
        var56 = var54.first();
        var54 = var54.rest();
        if (module0677.NIL == var54) {
            final SubLObject var57;
            var54 = (var57 = var55);
            return (SubLObject)ConsesLow.listS((SubLObject)module0677.$ic124$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic140$, var56), (SubLObject)module0677.$ic141$, (SubLObject)module0677.$ic142$, ConsesLow.append(var57, (SubLObject)module0677.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.$ic139$);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41307(final SubLObject var51, final SubLObject var52) {
        SubLObject var54;
        final SubLObject var53 = var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic145$);
        final SubLObject var55 = var54.rest();
        var54 = var54.first();
        SubLObject var56 = (SubLObject)module0677.NIL;
        SubLObject var57 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic145$);
        var56 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic145$);
        var57 = var54.first();
        var54 = var54.rest();
        if (module0677.NIL == var54) {
            final SubLObject var58;
            var54 = (var58 = var55);
            return (SubLObject)ConsesLow.listS((SubLObject)module0677.$ic124$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic146$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic48$, var57), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic147$, var56, var57), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic140$, var56)), (SubLObject)module0677.$ic141$, (SubLObject)module0677.$ic142$, ConsesLow.append(var58, (SubLObject)module0677.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.$ic145$);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41308(final SubLObject var51, final SubLObject var52) {
        SubLObject var54;
        final SubLObject var53 = var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic148$);
        final SubLObject var55 = var54.rest();
        var54 = var54.first();
        SubLObject var56 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic148$);
        var56 = var54.first();
        var54 = var54.rest();
        SubLObject var57 = (SubLObject)module0677.NIL;
        SubLObject var58 = var54;
        SubLObject var59 = (SubLObject)module0677.NIL;
        SubLObject var85_86 = (SubLObject)module0677.NIL;
        while (module0677.NIL != var58) {
            cdestructuring_bind.destructuring_bind_must_consp(var58, var53, (SubLObject)module0677.$ic148$);
            var85_86 = var58.first();
            var58 = var58.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var58, var53, (SubLObject)module0677.$ic148$);
            if (module0677.NIL == conses_high.member(var85_86, (SubLObject)module0677.$ic149$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED)) {
                var59 = (SubLObject)module0677.T;
            }
            if (var85_86 == module0677.$ic150$) {
                var57 = var58.first();
            }
            var58 = var58.rest();
        }
        if (module0677.NIL != var59 && module0677.NIL == var57) {
            cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.$ic148$);
        }
        final SubLObject var60 = cdestructuring_bind.property_list_member((SubLObject)module0677.$ic151$, var54);
        final SubLObject var61 = (SubLObject)((module0677.NIL != var60) ? conses_high.cadr(var60) : module0677.NIL);
        final SubLObject var62;
        var54 = (var62 = var55);
        if (module0677.NIL != var61) {
            return (SubLObject)ConsesLow.listS((SubLObject)module0677.$ic143$, (SubLObject)ConsesLow.list(var56, var61), ConsesLow.append(var62, (SubLObject)module0677.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)module0677.$ic138$, (SubLObject)ConsesLow.list(var56), ConsesLow.append(var62, (SubLObject)module0677.NIL));
    }
    
    public static SubLObject f41309(final SubLObject var51, final SubLObject var52) {
        SubLObject var54;
        final SubLObject var53 = var54 = var51.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic152$);
        final SubLObject var55 = var54.rest();
        var54 = var54.first();
        SubLObject var56 = (SubLObject)module0677.NIL;
        SubLObject var57 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic152$);
        var56 = var54.first();
        var54 = var54.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)module0677.$ic152$);
        var57 = var54.first();
        var54 = var54.rest();
        if (module0677.NIL == var54) {
            final SubLObject var58;
            var54 = (var58 = var55);
            return (SubLObject)ConsesLow.listS((SubLObject)module0677.$ic124$, (SubLObject)ConsesLow.list((SubLObject)module0677.$ic153$, var56, (SubLObject)module0677.T, var57), (SubLObject)module0677.$ic154$, ConsesLow.append(var58, (SubLObject)module0677.$ic155$));
        }
        cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)module0677.$ic152$);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41310(final SubLObject var92, final SubLObject var30, final SubLObject var93, SubLObject var94, SubLObject var78) {
        if (var94 == module0677.UNPROVIDED) {
            var94 = (SubLObject)module0677.NIL;
        }
        if (var78 == module0677.UNPROVIDED) {
            var78 = (SubLObject)module0677.NIL;
        }
        final SubLThread var95 = SubLProcess.currentSubLThread();
        if (var78.isString()) {
            module0683.f41674(var92, var78, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        else {
            module0642.f39021(var92);
        }
        module0642.f39021((SubLObject)module0677.$ic156$);
        module0642.f39026((SubLObject)module0677.UNPROVIDED);
        module0642.f39075(var30, var93, module0655.$g5135$.getDynamicValue(var95));
        module0666.f40467(var30, (SubLObject)module0677.$ic157$, var94, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0644.f39184(var30, (SubLObject)module0677.$ic158$);
        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41299() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39019((SubLObject)module0677.$ic159$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_95 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_96 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_96, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_97 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    SubLObject var4 = f41290((SubLObject)module0677.$ic161$);
                    SubLObject var5 = f41291((SubLObject)module0677.$ic161$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic161$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic55$);
                    var5 = f41291((SubLObject)module0677.$ic55$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic55$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic53$);
                    var5 = f41291((SubLObject)module0677.$ic53$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic53$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic57$);
                    var5 = f41291((SubLObject)module0677.$ic57$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic57$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic61$);
                    var5 = f41291((SubLObject)module0677.$ic61$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic61$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic63$);
                    var5 = f41291((SubLObject)module0677.$ic63$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic63$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic65$);
                    var5 = f41291((SubLObject)module0677.$ic65$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic65$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic59$);
                    var5 = f41291((SubLObject)module0677.$ic59$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic59$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic67$);
                    var5 = f41291((SubLObject)module0677.$ic67$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic67$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic76$);
                    var5 = f41291((SubLObject)module0677.$ic76$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic76$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic69$);
                    var5 = f41291((SubLObject)module0677.$ic69$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic69$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_97, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_98 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_98, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_99 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39021((SubLObject)module0677.$ic162$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic163$, (SubLObject)module0677.$ic164$, Equality.eq((SubLObject)module0677.$ic165$, module0018.$g707$.getDynamicValue(var2)), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic166$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic163$, (SubLObject)module0677.$ic167$, Equality.eq((SubLObject)module0677.$ic168$, module0018.$g707$.getDynamicValue(var2)), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic169$);
                    module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39021((SubLObject)module0677.$ic170$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic171$);
                    module0642.f39075((SubLObject)module0677.$ic172$, module0655.$g5091$.getDynamicValue(var2), (SubLObject)module0677.THREE_INTEGER);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic173$);
                }
                finally {
                    module0015.$g533$.rebind(var4_99, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_95, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41300() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39019((SubLObject)module0677.$ic174$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_102 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_103 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_103, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_104 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39021((SubLObject)module0677.$ic175$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic176$, (SubLObject)module0677.$ic177$, Equality.eq(module0660.$g5208$.getDynamicValue(var2), (SubLObject)module0677.$ic178$), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic179$);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39072((SubLObject)module0677.$ic176$, (SubLObject)module0677.$ic180$, Equality.eq(module0660.$g5208$.getDynamicValue(var2), (SubLObject)module0677.$ic181$), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic182$);
                    module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39021((SubLObject)module0677.$ic183$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0644.f39188((SubLObject)module0677.$ic184$, (SubLObject)module0677.$ic185$, (SubLObject)module0677.$ic186$, Equality.eq(module0655.$g5079$.getDynamicValue(var2), (SubLObject)module0677.$ic187$));
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic188$);
                    module0642.f39075((SubLObject)module0677.$ic185$, module0655.$g5080$.getDynamicValue(var2), (SubLObject)module0677.THREE_INTEGER);
                    module0642.f39019((SubLObject)module0677.$ic189$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0644.f39187((SubLObject)module0677.$ic184$, (SubLObject)module0677.$ic185$, (SubLObject)module0677.$ic190$, Equality.eq(module0655.$g5079$.getDynamicValue(var2), (SubLObject)module0677.$ic191$));
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic192$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0644.f39187((SubLObject)module0677.$ic184$, (SubLObject)module0677.$ic185$, (SubLObject)module0677.$ic193$, Equality.eq(module0655.$g5079$.getDynamicValue(var2), (SubLObject)module0677.$ic194$));
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic195$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0644.f39187((SubLObject)module0677.$ic184$, (SubLObject)module0677.$ic185$, (SubLObject)module0677.$ic196$, Equality.eq(module0655.$g5079$.getDynamicValue(var2), (SubLObject)module0677.$ic197$));
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic198$);
                    module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39021((SubLObject)module0677.$ic199$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic200$, (SubLObject)module0677.$ic201$, Equality.eq(module0655.$g5081$.getDynamicValue(var2), (SubLObject)module0677.$ic202$), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic203$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic200$, (SubLObject)module0677.$ic204$, Equality.eq(module0655.$g5081$.getDynamicValue(var2), (SubLObject)module0677.$ic205$), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic206$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic200$, (SubLObject)module0677.$ic207$, Equality.eq(module0655.$g5081$.getDynamicValue(var2), (SubLObject)module0677.$ic208$), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic209$);
                    module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39021((SubLObject)module0677.$ic210$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    SubLObject var4 = f41290((SubLObject)module0677.$ic102$);
                    SubLObject var5 = f41291((SubLObject)module0677.$ic102$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic102$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39021((SubLObject)module0677.$ic211$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    var4 = f41290((SubLObject)module0677.$ic104$);
                    var5 = f41291((SubLObject)module0677.$ic104$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic104$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic106$);
                    var5 = f41291((SubLObject)module0677.$ic106$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic106$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic108$);
                    var5 = f41291((SubLObject)module0677.$ic108$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic108$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_104, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_105 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_105, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_106 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0677.$ic137$, (SubLObject)module0677.$ic212$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    SubLObject var4 = f41290((SubLObject)module0677.$ic78$);
                    SubLObject var5 = f41291((SubLObject)module0677.$ic78$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic78$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic80$);
                    var5 = f41291((SubLObject)module0677.$ic80$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic80$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic84$);
                    var5 = f41291((SubLObject)module0677.$ic84$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic84$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0677.$ic137$, (SubLObject)module0677.$ic213$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    var4 = f41290((SubLObject)module0677.$ic86$);
                    var5 = f41291((SubLObject)module0677.$ic86$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic86$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                    var4 = f41290((SubLObject)module0677.$ic88$);
                    var5 = f41291((SubLObject)module0677.$ic88$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic88$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_106, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_102, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41301() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39019((SubLObject)module0677.$ic214$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_107 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_108 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_108, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_109 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0677.$ic137$, (SubLObject)module0677.$ic215$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic216$);
                    module0642.f39075((SubLObject)module0677.$ic217$, module0655.$g5082$.getDynamicValue(var2), (SubLObject)module0677.THREE_INTEGER);
                    module0642.f39019((SubLObject)module0677.$ic218$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic216$);
                    module0642.f39075((SubLObject)module0677.$ic219$, module0655.$g5084$.getDynamicValue(var2), (SubLObject)module0677.THREE_INTEGER);
                    module0642.f39019((SubLObject)module0677.$ic220$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic216$);
                    module0642.f39075((SubLObject)module0677.$ic221$, module0655.$g5086$.getDynamicValue(var2), (SubLObject)module0677.THREE_INTEGER);
                    module0642.f39019((SubLObject)module0677.$ic189$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic216$);
                    module0642.f39075((SubLObject)module0677.$ic222$, module0655.$g5088$.getDynamicValue(var2), (SubLObject)module0677.THREE_INTEGER);
                    module0642.f39019((SubLObject)module0677.$ic223$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4 = f41290((SubLObject)module0677.$ic90$);
                    final SubLObject var5 = f41291((SubLObject)module0677.$ic90$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic90$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_109, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_110 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_110, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_111 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0677.$ic137$, (SubLObject)module0677.$ic224$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    f41310((SubLObject)module0677.$ic225$, (SubLObject)module0677.$ic226$, module0655.$g5114$.getDynamicValue(var2), module0677.$ic227$, (SubLObject)module0677.$ic228$);
                }
                finally {
                    module0015.$g533$.rebind(var4_111, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_107, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41311() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39019((SubLObject)module0677.$ic229$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_112 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_113 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_113, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_114 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0677.$ic137$, (SubLObject)module0677.$ic230$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    if (module0677.$ic231$.isString()) {
                        module0683.f41674((SubLObject)module0677.$ic232$, (SubLObject)module0677.$ic231$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    }
                    else {
                        module0642.f39021((SubLObject)module0677.$ic232$);
                    }
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0657.f39992(f41312(), (SubLObject)module0677.$ic233$);
                    final SubLObject var4 = f41290((SubLObject)module0677.$ic92$);
                    final SubLObject var5 = f41291((SubLObject)module0677.$ic92$);
                    if (var4.isString() && var5.isList()) {
                        module0642.f39068(var4, (SubLObject)module0677.T, f41292((SubLObject)module0677.$ic92$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        Eval.eval(var5);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    }
                }
                finally {
                    module0015.$g533$.rebind(var4_114, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_115 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_115, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_116 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0677.$ic137$, (SubLObject)module0677.$ic234$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.FOUR_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    f41310((SubLObject)module0677.$ic235$, (SubLObject)module0677.$ic236$, module0777.$g5315$.getDynamicValue(var2), module0677.$ic237$, (SubLObject)module0677.$ic238$);
                    f41310((SubLObject)module0677.$ic239$, (SubLObject)module0677.$ic240$, module0584.$g4441$.getDynamicValue(var2), module0677.$ic227$, (SubLObject)module0677.$ic241$);
                    f41310((SubLObject)module0677.$ic242$, (SubLObject)module0677.$ic243$, module0584.$g4442$.getDynamicValue(var2), module0677.$ic227$, (SubLObject)module0677.$ic244$);
                    f41310((SubLObject)module0677.$ic245$, (SubLObject)module0677.$ic246$, module0584.$g4443$.getDynamicValue(var2), module0677.$ic227$, (SubLObject)module0677.$ic247$);
                    f41310((SubLObject)module0677.$ic248$, (SubLObject)module0677.$ic249$, module0584.$g4444$.getDynamicValue(var2), module0677.$ic227$, (SubLObject)module0677.$ic250$);
                }
                finally {
                    module0015.$g533$.rebind(var4_116, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_112, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41312() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (module0677.NIL != module0018.$g710$.getDynamicValue(var2)) ? module0018.$g710$.getDynamicValue(var2) : module0579.f35490();
    }
    
    public static SubLObject f41302() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39019((SubLObject)module0677.$ic251$);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0677.THREE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39020((SubLObject)module0677.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var2);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_117 = module0015.$g533$.currentBinding(var2);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_118 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_118, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_119 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39021((SubLObject)module0677.$ic252$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    SubLObject var4 = (SubLObject)module0677.NIL;
                    if (module0677.NIL == module0048.f3328(module0655.$g5093$.getDynamicValue(var2))) {
                        var4 = (SubLObject)module0677.T;
                    }
                    else {
                        var4 = (SubLObject)module0677.NIL;
                    }
                    module0644.f39188((SubLObject)module0677.$ic253$, (SubLObject)module0677.$ic254$, (SubLObject)module0677.ZERO_INTEGER, var4);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic255$);
                    if (module0677.NIL != module0048.f3294(module0655.$g5093$.getDynamicValue(var2)) && module0677.NIL == module0048.f3328(module0655.$g5093$.getDynamicValue(var2))) {
                        module0642.f39075((SubLObject)module0677.$ic254$, module0655.$g5093$.getDynamicValue(var2), (SubLObject)module0677.THREE_INTEGER);
                    }
                    else {
                        module0642.f39075((SubLObject)module0677.$ic254$, module0655.$g5092$.getGlobalValue(), (SubLObject)module0677.THREE_INTEGER);
                    }
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic256$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic253$, (SubLObject)module0677.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeBoolean(module0677.NIL == var4), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic257$);
                    module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39021((SubLObject)module0677.$ic258$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0657.f39992(module0683.f41741(), (SubLObject)module0677.$ic259$);
                }
                finally {
                    module0015.$g533$.rebind(var4_119, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_120 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_120, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic160$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0677.$ic22$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_121 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39021((SubLObject)module0677.$ic260$);
                    module0642.f39021((SubLObject)module0677.$ic156$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic261$, (SubLObject)module0677.$ic262$, module0655.$g5094$.getDynamicValue(var2), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic263$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39072((SubLObject)module0677.$ic261$, (SubLObject)module0677.$ic264$, (SubLObject)SubLObjectFactory.makeBoolean(module0677.NIL == module0655.$g5094$.getDynamicValue(var2)), (SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic265$);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_121, var2);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_117, var2);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41313(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0067.f4902(module0677.$g5313$.getGlobalValue());
        SubLObject var4 = (SubLObject)module0677.NIL;
        var4 = var3.first();
        while (module0677.NIL != var3) {
            final SubLObject var5 = f41290(var4);
            if (var5.isString()) {
                final SubLObject var6 = f41293(var4, module0642.f39104(var5, var1));
                f41314(var4, var6);
            }
            var3 = var3.rest();
            var4 = var3.first();
        }
        module0152.$g2105$.setDynamicValue((SubLObject)((module0677.NIL != module0677.$g5314$.getDynamicValue(var2)) ? module0677.$ic266$ : module0677.$ic267$), var2);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41314(final SubLObject var46, final SubLObject var123) {
        Symbols.set(var46, var123);
        return Symbols.symbol_value(var46);
    }
    
    public static SubLObject f41315(final SubLObject var1) {
        if (module0677.NIL != module0642.f39104((SubLObject)module0677.$ic121$, var1)) {
            return f41316(var1);
        }
        final SubLObject var2 = module0656.f39943(module0642.f39104((SubLObject)module0677.$ic226$, var1), (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != module0173.f10955(var2)) {
            module0655.$g5114$.setDynamicValue(var2);
        }
        f41317(var1);
        SubLObject var3 = module0642.f39104((SubLObject)module0677.$ic163$, var1);
        if (module0677.NIL != var3) {
            var3 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        if (module0677.NIL == module0018.f985(var3)) {
            var3 = (SubLObject)module0677.$ic165$;
        }
        module0018.$g707$.setDynamicValue(var3);
        SubLObject var4 = module0642.f39104((SubLObject)module0677.$ic172$, var1);
        if (module0677.NIL != var4) {
            var4 = reader.read_from_string_ignoring_errors(var4, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        if (module0677.NIL == var4 || (var4.isInteger() && var4.isPositive())) {
            module0655.$g5091$.setDynamicValue(var4);
        }
        f41318(var1);
        f41319(var1);
        f41320(var1);
        f41321(var1);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41318(final SubLObject var1) {
        SubLObject var2 = module0642.f39104((SubLObject)module0677.$ic217$, var1);
        if (module0677.NIL != var2) {
            var2 = reader.read_from_string_ignoring_errors(var2, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        if (module0677.NIL == var2 || (var2.isInteger() && var2.isPositive())) {
            module0655.$g5082$.setDynamicValue(var2);
        }
        var2 = module0642.f39104((SubLObject)module0677.$ic219$, var1);
        if (module0677.NIL != var2) {
            var2 = reader.read_from_string_ignoring_errors(var2, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        if (module0677.NIL == var2 || (var2.isInteger() && var2.isPositive())) {
            module0655.$g5084$.setDynamicValue(var2);
        }
        var2 = module0642.f39104((SubLObject)module0677.$ic221$, var1);
        if (module0677.NIL != var2) {
            var2 = reader.read_from_string_ignoring_errors(var2, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        if (module0677.NIL == var2 || (var2.isInteger() && var2.isPositive())) {
            module0655.$g5086$.setDynamicValue(var2);
        }
        var2 = module0642.f39104((SubLObject)module0677.$ic222$, var1);
        if (module0677.NIL != var2) {
            var2 = reader.read_from_string_ignoring_errors(var2, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        if (module0677.NIL == var2 || (var2.isInteger() && var2.isPositive())) {
            module0655.$g5088$.setDynamicValue(var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41319(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0677.$ic176$, var1);
        module0660.$g5208$.setDynamicValue(reader.read_from_string_ignoring_errors(var2, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        SubLObject var3 = module0642.f39104((SubLObject)module0677.$ic184$, var1);
        if (module0677.NIL != var3) {
            var3 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            if (var3 == module0677.$ic187$) {
                final SubLObject var4 = module0642.f39104((SubLObject)module0677.$ic185$, var1);
                if (module0677.NIL != var4) {
                    final SubLObject var5 = reader.read_from_string_ignoring_errors(var4, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    if (var5.isInteger()) {
                        module0655.$g5080$.setDynamicValue(var5);
                    }
                    else {
                        module0655.$g5080$.setDynamicValue((SubLObject)module0677.NIL);
                    }
                }
                else {
                    module0655.$g5080$.setDynamicValue((SubLObject)module0677.NIL);
                }
            }
            module0655.$g5079$.setDynamicValue(var3);
        }
        final SubLObject var6 = module0642.f39104((SubLObject)module0677.$ic200$, var1);
        module0655.$g5081$.setDynamicValue(reader.read_from_string_ignoring_errors(var6, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        module0655.$g5128$.setDynamicValue((SubLObject)module0677.NIL);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41317(final SubLObject var1) {
        final SubLObject var2 = module0656.f39943(module0642.f39104((SubLObject)module0677.$ic240$, var1), (SubLObject)module0677.UNPROVIDED);
        final SubLObject var3 = module0656.f39943(module0642.f39104((SubLObject)module0677.$ic236$, var1), (SubLObject)module0677.UNPROVIDED);
        final SubLObject var4 = module0656.f39943(module0642.f39104((SubLObject)module0677.$ic243$, var1), (SubLObject)module0677.UNPROVIDED);
        final SubLObject var5 = module0656.f39943(module0642.f39104((SubLObject)module0677.$ic246$, var1), (SubLObject)module0677.UNPROVIDED);
        final SubLObject var6 = module0656.f39943(module0642.f39104((SubLObject)module0677.$ic249$, var1), (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != module0173.f10955(var2)) {
            module0584.$g4441$.setDynamicValue(var2);
        }
        if (module0677.NIL != module0173.f10955(var4)) {
            module0584.$g4442$.setDynamicValue(var4);
        }
        if (module0677.NIL == var3 || module0677.NIL != module0173.f10955(var3)) {
            module0777.$g5315$.setDynamicValue(var3);
        }
        if (module0677.NIL != module0173.f10955(var5)) {
            module0584.$g4443$.setDynamicValue(var5);
        }
        if (module0677.NIL != module0173.f10955(var6)) {
            module0584.$g4444$.setDynamicValue(var6);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41322(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = module0657.f40003(var1, module0018.$g710$.getDynamicValue(var2), (SubLObject)module0677.$ic233$);
        final SubLObject var4 = var2.secondMultipleValue();
        final SubLObject var5 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (module0677.NIL != var4) {
            return module0656.f39789((SubLObject)module0677.$ic269$, var5, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        f41323(var3);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41323(final SubLObject var138) {
        module0018.$g710$.setDynamicValue(var138);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41320(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = module0642.f39104((SubLObject)module0677.$ic253$, var1);
        if (module0677.NIL != var3) {
            var3 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        if (var3.eql((SubLObject)module0677.ZERO_INTEGER)) {
            var3 = module0642.f39104((SubLObject)module0677.$ic254$, var1);
            var3 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        else if (var3.eql((SubLObject)module0677.ONE_INTEGER)) {
            var3 = (SubLObject)module0677.$ic270$;
        }
        if (module0677.NIL != module0048.f3331(var3)) {
            module0655.$g5093$.setDynamicValue(var3, var2);
        }
        module0683.f41714();
        var2.resetMultipleValues();
        final SubLObject var4 = module0657.f40003(var1, module0683.f41741(), (SubLObject)module0677.$ic259$);
        final SubLObject var5 = var2.secondMultipleValue();
        final SubLObject var6 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (module0677.NIL != var5) {
            return module0656.f39789((SubLObject)module0677.$ic271$, var6, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        module0683.f41742(var4);
        final SubLObject var7 = module0642.f39104((SubLObject)module0677.$ic261$, var1);
        final SubLObject var8 = module0035.sublisp_boolean(reader.read_from_string_ignoring_errors(var7, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        module0655.$g5094$.setDynamicValue(var8, var2);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41321(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0644.$g5018$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)module0677.NIL;
        f41313(var1);
        if (module0677.NIL == module0655.$g5096$.getDynamicValue(var2) && module0677.NIL == module0655.$g5097$.getDynamicValue(var2) && module0677.NIL == module0655.$g5101$.getDynamicValue(var2)) {
            module0655.$g5097$.setDynamicValue((SubLObject)module0677.T, var2);
        }
        if (module0677.NIL != module0642.f39104((SubLObject)module0677.$ic119$, var1)) {
            var4 = f41286();
        }
        final SubLObject var5 = (SubLObject)module0677.NIL;
        final SubLObject var6 = module0644.$g5018$.currentBinding(var2);
        try {
            module0644.$g5018$.bind(var3, var2);
            f41324(var5, var4);
        }
        finally {
            module0644.$g5018$.rebind(var6, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41325(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic272$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic273$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41324(SubLObject var148, SubLObject var146) {
        if (var148 == module0677.UNPROVIDED) {
            var148 = (SubLObject)module0677.NIL;
        }
        if (var146 == module0677.UNPROVIDED) {
            var146 = (SubLObject)module0677.NIL;
        }
        final SubLThread var149 = SubLProcess.currentSubLThread();
        final SubLObject var150 = f41326(var146);
        if (module0677.NIL != var148) {
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var150);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var151 = module0015.$g132$.getDynamicValue(var149);
            final SubLObject var152 = module0015.$g535$.currentBinding(var149);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var149);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != var151) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(var151));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_150 = module0015.$g533$.currentBinding(var149);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var149);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39019(var150);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic278$);
                    module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                    module0642.f39019((SubLObject)module0677.$ic279$);
                    module0656.f39837((SubLObject)module0677.$ic280$, (SubLObject)module0677.$ic281$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39019((SubLObject)module0677.$ic282$);
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_150, var149);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var152, var149);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        else {
            module0656.f39793(var150, (SubLObject)module0677.NIL);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41326(final SubLObject var146) {
        SubLObject var147 = (SubLObject)module0677.NIL;
        SubLObject var148 = (SubLObject)module0677.NIL;
        try {
            var148 = streams_high.make_private_string_output_stream();
            print_high.princ((SubLObject)module0677.$ic283$, var148);
            if (module0677.NIL != var146) {
                print_high.princ((SubLObject)module0677.$ic284$, var148);
            }
            print_high.princ((SubLObject)module0677.$ic285$, var148);
            var147 = streams_high.get_output_stream_string(var148);
        }
        finally {
            final SubLObject var149 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0677.T);
                streams_high.close(var148, (SubLObject)module0677.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var149);
            }
        }
        return var147;
    }
    
    public static SubLObject f41327(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        return f41328();
    }
    
    public static SubLObject f41328() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)module0677.$ic289$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var3) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_152 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_153 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_154 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_154, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_155 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var6 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)module0677.$ic287$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0656.f39837((SubLObject)module0677.$ic290$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        if ((module0677.NIL != f41329() || module0677.NIL != f41330()) && module0677.$ic165$ == module0018.$g707$.getDynamicValue(var2)) {
                            module0642.f39032((SubLObject)module0677.UNPROVIDED);
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            if (module0677.NIL != module0655.$g5090$.getDynamicValue(var2)) {
                                module0656.f39837((SubLObject)module0677.$ic291$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                            }
                            else {
                                module0656.f39837((SubLObject)module0677.$ic292$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                            }
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                        }
                        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        f41331();
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var7, var2);
                        module0015.$g541$.rebind(var6, var2);
                        module0015.$g533$.rebind(var4_155, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_153, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_152, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41331() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic293$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        SubLObject var3 = f41332();
        if (module0677.NIL != var3) {
            module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
            module0656.f39837((SubLObject)module0677.$ic294$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            SubLObject var4 = var3;
            SubLObject var5 = (SubLObject)module0677.NIL;
            var5 = var4.first();
            while (module0677.NIL != var4) {
                if (!var5.eql(var3.first())) {
                    module0642.f39019((SubLObject)module0677.$ic295$);
                }
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39915(var5, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        else {
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            module0642.f39019((SubLObject)module0677.$ic296$);
        }
        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic297$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        var3 = f41333();
        if (module0677.NIL != var3) {
            module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
            module0656.f39837((SubLObject)module0677.$ic298$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            SubLObject var4 = var3;
            SubLObject var5 = (SubLObject)module0677.NIL;
            var5 = var4.first();
            while (module0677.NIL != var4) {
                if (!var5.eql(var3.first())) {
                    module0642.f39019((SubLObject)module0677.$ic295$);
                }
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39915(var5, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        else {
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            module0642.f39019((SubLObject)module0677.$ic296$);
        }
        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic299$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        f41334();
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic300$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        var3 = f41330();
        if (module0677.NIL != var3) {
            module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
            module0656.f39837((SubLObject)module0677.$ic301$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            SubLObject var4 = var3;
            SubLObject var5 = (SubLObject)module0677.NIL;
            var5 = var4.first();
            while (module0677.NIL != var4) {
                if (module0677.NIL != module0202.f12883(var5, (SubLObject)module0677.UNPROVIDED)) {
                    final SubLObject var6 = module0205.f13203(var5, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var7 = module0205.f13204(var5, (SubLObject)module0677.UNPROVIDED);
                    module0672.f41050(var7, var6, module0655.$g5095$.getDynamicValue(var2), (SubLObject)module0677.T, (SubLObject)module0677.NIL);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
        }
        else {
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            module0642.f39019((SubLObject)module0677.$ic296$);
            module0642.f39026((SubLObject)module0677.TWO_INTEGER);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41334() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = f41329();
        if (module0677.NIL != var3) {
            module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
            module0656.f39837((SubLObject)module0677.$ic302$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4 = (module0677.NIL != module0669.f40692((SubLObject)module0677.$ic303$)) ? Symbols.symbol_function((SubLObject)module0677.$ic304$) : Symbols.symbol_function((SubLObject)module0677.$ic306$);
            final SubLObject var5 = module0655.$g5129$.currentBinding(var2);
            final SubLObject var6 = module0655.$g5130$.currentBinding(var2);
            final SubLObject var7 = module0656.$g5172$.currentBinding(var2);
            final SubLObject var8 = module0580.$g4361$.currentBinding(var2);
            try {
                module0655.$g5129$.bind((SubLObject)module0677.NIL, var2);
                module0655.$g5130$.bind((SubLObject)module0677.NIL, var2);
                module0656.$g5172$.bind((SubLObject)module0677.NIL, var2);
                module0580.$g4361$.bind((SubLObject)module0677.NIL, var2);
                var2.resetMultipleValues();
                final SubLObject var4_162 = module0580.$g4362$.currentBinding(var2);
                try {
                    module0580.$g4362$.bind(module0580.f35560(), var2);
                    final SubLObject var9 = var2.secondMultipleValue();
                    var2.resetMultipleValues();
                    try {
                        var2.resetMultipleValues();
                        final SubLObject var4_163 = module0580.$g4358$.currentBinding(var2);
                        try {
                            module0580.$g4358$.bind(module0580.f35544(), var2);
                            final SubLObject var10 = var2.secondMultipleValue();
                            var2.resetMultipleValues();
                            final SubLObject var4_164 = module0580.$g4359$.currentBinding(var2);
                            try {
                                module0580.$g4359$.bind(module0580.f35545(), var2);
                                final SubLObject var11 = module0580.$g4358$.getDynamicValue(var2);
                                final SubLObject var4_165 = module0034.$g879$.currentBinding(var2);
                                try {
                                    module0034.$g879$.bind(var11, var2);
                                    SubLObject var12 = (SubLObject)module0677.NIL;
                                    if (module0677.NIL != var11 && module0677.NIL == module0034.f1842(var11)) {
                                        var12 = module0034.f1869(var11);
                                        final SubLObject var13 = Threads.current_process();
                                        if (module0677.NIL == var12) {
                                            module0034.f1873(var11, var13);
                                        }
                                        else if (!var12.eql(var13)) {
                                            Errors.error((SubLObject)module0677.$ic308$);
                                        }
                                    }
                                    try {
                                        final SubLObject var4_166 = module0579.$g4260$.currentBinding(var2);
                                        final SubLObject var11_172 = module0579.$g4259$.currentBinding(var2);
                                        try {
                                            module0579.$g4260$.bind(f41312(), var2);
                                            module0579.$g4259$.bind((SubLObject)module0677.$ic309$, var2);
                                            SubLObject var14 = var3;
                                            SubLObject var15 = (SubLObject)module0677.NIL;
                                            var15 = var14.first();
                                            while (module0677.NIL != var14) {
                                                if (module0677.NIL != module0178.f11361(var15, (SubLObject)module0677.UNPROVIDED)) {
                                                    Functions.funcall(var4, var15);
                                                }
                                                else if (module0677.NIL != assertion_handles_oc.f11035(var15)) {
                                                    f41335(var15);
                                                }
                                                else {
                                                    final SubLObject var16 = module0161.f10555(module0205.f13203(var15, (SubLObject)module0677.UNPROVIDED), (SubLObject)module0677.UNPROVIDED);
                                                    final SubLObject var17 = module0205.f13204(var15, (SubLObject)module0677.UNPROVIDED);
                                                    final SubLObject var18 = module0288.f19342(var17, var16);
                                                    if (module0677.NIL != module0035.f2013(var18)) {
                                                        SubLObject var25_174 = var18;
                                                        SubLObject var19 = (SubLObject)module0677.NIL;
                                                        var19 = var25_174.first();
                                                        while (module0677.NIL != var25_174) {
                                                            Functions.funcall(var4, var19);
                                                            f41336(var19);
                                                            var25_174 = var25_174.rest();
                                                            var19 = var25_174.first();
                                                        }
                                                        f41335(var15);
                                                    }
                                                    else {
                                                        module0672.f41050(var17, var16, module0655.$g5095$.getDynamicValue(var2), (SubLObject)module0677.T, (SubLObject)module0677.NIL);
                                                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                                                    }
                                                }
                                                var14 = var14.rest();
                                                var15 = var14.first();
                                            }
                                        }
                                        finally {
                                            module0579.$g4259$.rebind(var11_172, var2);
                                            module0579.$g4260$.rebind(var4_166, var2);
                                        }
                                    }
                                    finally {
                                        final SubLObject var4_167 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0677.T, var2);
                                            if (module0677.NIL != var11 && module0677.NIL == var12) {
                                                module0034.f1873(var11, (SubLObject)module0677.NIL);
                                            }
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var4_167, var2);
                                        }
                                    }
                                }
                                finally {
                                    module0034.$g879$.rebind(var4_165, var2);
                                }
                            }
                            finally {
                                module0580.$g4359$.rebind(var4_164, var2);
                            }
                            if (var10 == module0677.$ic310$ && module0677.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var2))) {
                                module0034.f1891(module0580.$g4358$.getDynamicValue(var2));
                            }
                        }
                        finally {
                            module0580.$g4358$.rebind(var4_163, var2);
                        }
                    }
                    finally {
                        final SubLObject var4_168 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0677.T, var2);
                            if (module0677.NIL == var9) {
                                module0580.f35554(module0580.$g4362$.getDynamicValue(var2));
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var4_168, var2);
                        }
                    }
                }
                finally {
                    module0580.$g4362$.rebind(var4_162, var2);
                }
            }
            finally {
                module0580.$g4361$.rebind(var8, var2);
                module0656.$g5172$.rebind(var7, var2);
                module0655.$g5130$.rebind(var6, var2);
                module0655.$g5129$.rebind(var5, var2);
            }
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
        }
        else {
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            module0642.f39019((SubLObject)module0677.$ic296$);
            module0642.f39026((SubLObject)module0677.TWO_INTEGER);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41337(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic312$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic313$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            if (module0677.NIL != module0014.f695((SubLObject)module0677.$ic303$)) {
                final SubLObject var48 = module0014.f697((SubLObject)module0677.$ic303$);
                final SubLObject var49 = (SubLObject)module0677.$ic22$;
                final SubLObject var50 = module0014.f694((SubLObject)module0677.$ic303$);
                final SubLObject var51 = (SubLObject)module0677.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var48);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                if (module0677.NIL != var50) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(var50);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                if (module0677.NIL != var49) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var49));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                if (module0677.NIL != var51) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(var51);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_182 = module0015.$g533$.currentBinding(var45);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var45);
                }
                finally {
                    module0015.$g533$.rebind(var4_182, var45);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39067();
            }
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41338(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        SubLObject var3;
        final SubLObject var2 = var3 = var1;
        SubLObject var4 = (SubLObject)module0677.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var3, var2, (SubLObject)module0677.$ic317$);
        var4 = var3.first();
        var3 = var3.rest();
        if (module0677.NIL == var3) {
            final SubLObject var5 = Symbols.make_keyword(var4);
            if (var5.eql((SubLObject)module0677.$ic318$)) {
                f41339();
            }
            else if (var5.eql((SubLObject)module0677.$ic319$)) {
                f41340();
            }
            else if (var5.eql((SubLObject)module0677.$ic320$)) {
                f41341();
            }
            else if (var5.eql((SubLObject)module0677.$ic321$)) {
                f41342();
            }
            else if (var5.eql((SubLObject)module0677.$ic322$)) {
                f41339();
                f41340();
                f41341();
                f41342();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var2, (SubLObject)module0677.$ic317$);
        }
        return f41328();
    }
    
    public static SubLObject f41343(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic324$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic325$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41344(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic327$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic328$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41345(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic330$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic331$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41346(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic333$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic334$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41347(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic336$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic337$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41348(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0655.$g5090$.currentBinding(var2);
        try {
            module0655.$g5090$.bind((SubLObject)module0677.T, var2);
            f41328();
        }
        finally {
            module0655.$g5090$.rebind(var3, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41349(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic340$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic341$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41350(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0655.$g5090$.currentBinding(var2);
        try {
            module0655.$g5090$.bind((SubLObject)module0677.NIL, var2);
            f41328();
        }
        finally {
            module0655.$g5090$.rebind(var3, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41351(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic344$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic345$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41352(final SubLObject var187) {
        assert module0677.NIL != module0173.f10955(var187) : var187;
        if (module0677.NIL != module0167.f10813(var187)) {
            f41353(var187);
        }
        else if (module0677.NIL != constant_handles_oc.f8449(var187)) {
            f41354(var187);
        }
        f41355(var187);
        f41356(var187);
        f41357(var187);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41358(final SubLObject var188) {
        if (module0677.NIL != assertion_handles_oc.f11035(var188)) {
            f41336(var188);
        }
        else if (module0677.NIL != constant_handles_oc.f8449(var188)) {
            f41359(var188);
        }
        else if (module0677.NIL != module0206.f13453(var188)) {
            f41360(var188);
        }
        else {
            Errors.error((SubLObject)module0677.$ic348$, var188);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41332() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0655.$g5083$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0677.$ic350$), module0655.$g5083$.getDynamicValue(var2), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
        module0655.$g5083$.setDynamicValue(module0035.f2124(module0677.$g5316$.getGlobalValue(), module0655.$g5083$.getDynamicValue(var2)), var2);
        return conses_high.copy_list(module0655.$g5083$.getDynamicValue(var2));
    }
    
    public static SubLObject f41361() {
        return f41332().first();
    }
    
    public static SubLObject f41359(final SubLObject var189) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        if (module0655.$g5083$.getDynamicValue(var190).first().eql(var189)) {
            return var189;
        }
        if (module0677.NIL != module0004.f104(var189, module0655.$g5083$.getDynamicValue(var190), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED)) {
            module0655.$g5083$.setDynamicValue(Sequences.delete(var189, module0655.$g5083$.getDynamicValue(var190), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var190);
        }
        module0655.$g5083$.setDynamicValue((SubLObject)ConsesLow.cons(var189, module0655.$g5083$.getDynamicValue(var190)), var190);
        if (module0655.$g5082$.getDynamicValue(var190).isInteger() && module0655.$g5082$.getDynamicValue(var190).numG((SubLObject)module0677.ZERO_INTEGER)) {
            final SubLObject var191 = conses_high.nthcdr(Numbers.subtract(module0655.$g5082$.getDynamicValue(var190), (SubLObject)module0677.ONE_INTEGER), module0655.$g5083$.getDynamicValue(var190));
            if (module0677.NIL != var191) {
                ConsesLow.rplacd(var191, (SubLObject)module0677.NIL);
            }
        }
        return var189;
    }
    
    public static SubLObject f41354(final SubLObject var189) {
        final SubLThread var190 = SubLProcess.currentSubLThread();
        module0655.$g5083$.setDynamicValue(Sequences.delete(var189, module0655.$g5083$.getDynamicValue(var190), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var190);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41339() {
        module0655.$g5083$.setDynamicValue((SubLObject)module0677.NIL);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41362(final SubLObject var191) {
        if (module0677.NIL != module0167.f10824(var191, (SubLObject)module0677.UNPROVIDED)) {
            return (SubLObject)module0677.T;
        }
        return module0210.f13595(var191, (SubLObject)module0677.UNPROVIDED);
    }
    
    public static SubLObject f41333() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0655.$g5085$.setDynamicValue(module0035.delete_if_not((SubLObject)module0677.$ic352$, module0655.$g5085$.getDynamicValue(var2), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
        module0655.$g5085$.setDynamicValue(module0035.f2124(module0677.$g5317$.getGlobalValue(), module0655.$g5085$.getDynamicValue(var2)), var2);
        return conses_high.copy_list(module0655.$g5085$.getDynamicValue(var2));
    }
    
    public static SubLObject f41363() {
        return f41333().first();
    }
    
    public static SubLObject f41360(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        if (module0655.$g5085$.getDynamicValue(var192).first().equal(var191)) {
            return var191;
        }
        if (module0677.NIL != module0004.f104(var191, module0655.$g5085$.getDynamicValue(var192), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED)) {
            module0655.$g5085$.setDynamicValue(Sequences.delete(var191, module0655.$g5085$.getDynamicValue(var192), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var192);
        }
        module0655.$g5085$.setDynamicValue((SubLObject)ConsesLow.cons(var191, module0655.$g5085$.getDynamicValue(var192)), var192);
        if (module0655.$g5084$.getDynamicValue(var192).isInteger() && module0655.$g5084$.getDynamicValue(var192).numG((SubLObject)module0677.ZERO_INTEGER)) {
            final SubLObject var193 = conses_high.nthcdr(Numbers.subtract(module0655.$g5084$.getDynamicValue(var192), (SubLObject)module0677.ONE_INTEGER), module0655.$g5085$.getDynamicValue(var192));
            if (module0677.NIL != var193) {
                ConsesLow.rplacd(var193, (SubLObject)module0677.NIL);
            }
        }
        return var191;
    }
    
    public static SubLObject f41353(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        module0655.$g5085$.setDynamicValue(Sequences.delete(var191, module0655.$g5085$.getDynamicValue(var192), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var192);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41355(final SubLObject var187) {
        module0655.$g5085$.setDynamicValue(Sequences.delete(var187, f41333(), Symbols.symbol_function((SubLObject)module0677.$ic353$), Symbols.symbol_function((SubLObject)module0677.$ic354$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41340() {
        module0655.$g5085$.setDynamicValue((SubLObject)module0677.NIL);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41364(final SubLObject var157) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0677.NIL != module0178.f11361(var157, (SubLObject)module0677.UNPROVIDED) || module0677.NIL != module0202.f12883(var157, (SubLObject)module0677.UNPROVIDED));
    }
    
    public static SubLObject f41329() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0655.$g5087$.setDynamicValue(module0035.f2124(module0677.$g5318$.getGlobalValue(), module0655.$g5087$.getDynamicValue(var2)), var2);
        return conses_high.copy_list(module0655.$g5087$.getDynamicValue(var2));
    }
    
    public static SubLObject f41365() {
        return f41329().first();
    }
    
    public static SubLObject f41336(final SubLObject var192) {
        final SubLThread var193 = SubLProcess.currentSubLThread();
        if (module0677.NIL == f41364(var192)) {
            return (SubLObject)module0677.NIL;
        }
        if (module0655.$g5087$.getDynamicValue(var193).first().eql(var192)) {
            return var192;
        }
        if (module0677.NIL != module0004.f104(var192, module0655.$g5087$.getDynamicValue(var193), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED)) {
            module0655.$g5087$.setDynamicValue(Sequences.delete(var192, module0655.$g5087$.getDynamicValue(var193), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var193);
        }
        if (module0677.NIL != assertion_handles_oc.f11035(var192)) {
            final SubLObject var194 = module0202.f12782(module0178.f11287(var192), module0205.f13144(module0178.f11303(var192)));
            if (module0677.NIL != module0004.f104(var194, module0655.$g5087$.getDynamicValue(var193), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED)) {
                module0655.$g5087$.setDynamicValue(Sequences.delete(var194, module0655.$g5087$.getDynamicValue(var193), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var193);
            }
        }
        module0655.$g5087$.setDynamicValue((SubLObject)ConsesLow.cons(var192, module0655.$g5087$.getDynamicValue(var193)), var193);
        if (module0655.$g5086$.getDynamicValue(var193).isInteger() && module0655.$g5086$.getDynamicValue(var193).numG((SubLObject)module0677.ZERO_INTEGER)) {
            final SubLObject var195 = conses_high.nthcdr(Numbers.subtract(module0655.$g5086$.getDynamicValue(var193), (SubLObject)module0677.ONE_INTEGER), module0655.$g5087$.getDynamicValue(var193));
            if (module0677.NIL != var195) {
                ConsesLow.rplacd(var195, (SubLObject)module0677.NIL);
            }
        }
        return var192;
    }
    
    public static SubLObject f41366(final SubLObject var159, final SubLObject var158) {
        return (module0677.NIL != module0202.f12883(var159, (SubLObject)module0677.UNPROVIDED)) ? f41336(var159) : f41336(module0202.f12782(module0161.f10555(var158, (SubLObject)module0677.UNPROVIDED), var159));
    }
    
    public static SubLObject f41335(final SubLObject var192) {
        final SubLThread var193 = SubLProcess.currentSubLThread();
        module0655.$g5087$.setDynamicValue(Sequences.delete(var192, module0655.$g5087$.getDynamicValue(var193), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var193);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41356(final SubLObject var187) {
        module0655.$g5087$.setDynamicValue(Sequences.delete(var187, f41329(), Symbols.symbol_function((SubLObject)module0677.$ic355$), Symbols.symbol_function((SubLObject)module0677.$ic356$), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41341() {
        module0655.$g5087$.setDynamicValue((SubLObject)module0677.NIL);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41367(final SubLObject var194) {
        return module0205.f13189(var194, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
    }
    
    public static SubLObject f41330() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0655.$g5089$.setDynamicValue(module0035.delete_if_not((SubLObject)module0677.$ic357$, module0655.$g5089$.getDynamicValue(var2), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
        return conses_high.copy_list(module0655.$g5089$.getDynamicValue(var2));
    }
    
    public static SubLObject f41368() {
        return f41330().first();
    }
    
    public static SubLObject f41369(final SubLObject var159) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        if (module0655.$g5089$.getDynamicValue(var160).first().equal(var159)) {
            return var159;
        }
        if (module0677.NIL != module0004.f104(var159, module0655.$g5089$.getDynamicValue(var160), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED)) {
            module0655.$g5089$.setDynamicValue(Sequences.delete(var159, module0655.$g5089$.getDynamicValue(var160), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var160);
        }
        module0655.$g5089$.setDynamicValue((SubLObject)ConsesLow.cons(var159, module0655.$g5089$.getDynamicValue(var160)), var160);
        if (module0655.$g5088$.getDynamicValue(var160).isInteger() && module0655.$g5088$.getDynamicValue(var160).numG((SubLObject)module0677.ZERO_INTEGER)) {
            final SubLObject var161 = conses_high.nthcdr(Numbers.subtract(module0655.$g5088$.getDynamicValue(var160), (SubLObject)module0677.ONE_INTEGER), module0655.$g5089$.getDynamicValue(var160));
            if (module0677.NIL != var161) {
                ConsesLow.rplacd(var161, (SubLObject)module0677.NIL);
            }
        }
        return var159;
    }
    
    public static SubLObject f41370(final SubLObject var159, final SubLObject var158) {
        return (module0677.NIL != module0202.f12883(var159, (SubLObject)module0677.UNPROVIDED)) ? f41369(var159) : f41369(module0202.f12782(var158, var159));
    }
    
    public static SubLObject f41371(final SubLObject var159) {
        final SubLThread var160 = SubLProcess.currentSubLThread();
        module0655.$g5089$.setDynamicValue(Sequences.delete(var159, module0655.$g5089$.getDynamicValue(var160), (SubLObject)module0677.EQUAL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var160);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41357(final SubLObject var187) {
        module0655.$g5089$.setDynamicValue(Sequences.delete(var187, f41330(), (SubLObject)module0677.$ic355$, (SubLObject)module0677.$ic358$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41342() {
        module0655.$g5089$.setDynamicValue((SubLObject)module0677.NIL);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41372(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0677.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0677.$ic360$);
        }
        else {
            SubLObject var3 = (SubLObject)module0677.NIL;
            SubLObject var4 = (SubLObject)module0677.NIL;
            if (module0677.NIL != var1) {
                var3 = module0642.f39104((SubLObject)module0677.$ic361$, var1);
            }
            final SubLObject var5 = (SubLObject)module0677.$ic362$;
            final SubLObject var6 = module0015.$g538$.currentBinding(var2);
            try {
                module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
                module0642.f39020((SubLObject)module0677.$ic3$);
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
                final SubLObject var7 = module0014.f672((SubLObject)module0677.$ic4$);
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic5$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                if (module0677.NIL != var7) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(var7);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic6$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                module0016.f941();
                if (module0677.NIL != var5) {
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var5);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_197 = module0015.$g535$.currentBinding(var2);
                try {
                    module0015.$g535$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic9$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_198 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic10$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        final SubLObject var4_199 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0677.T, var2);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39020((SubLObject)module0677.$ic11$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39020((SubLObject)module0677.$ic12$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39019((SubLObject)module0677.$ic13$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_199, var2);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0677.NIL != var5) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39019(var5);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        }
                        final SubLObject var8 = module0656.f39832((SubLObject)module0677.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        if (module0677.NIL != var8) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                            module0642.f39020(var8);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        final SubLObject var4_200 = module0015.$g533$.currentBinding(var2);
                        final SubLObject var9 = module0015.$g541$.currentBinding(var2);
                        final SubLObject var10 = module0015.$g539$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0677.T, var2);
                            module0015.$g541$.bind((SubLObject)module0677.T, var2);
                            module0015.$g539$.bind(module0015.f797(), var2);
                            module0642.f39069((SubLObject)module0677.$ic363$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                            final SubLObject var11 = module0642.f39104((SubLObject)module0677.$ic364$, var1);
                            final SubLObject var12 = module0642.f39104((SubLObject)module0677.$ic365$, var1);
                            if (module0677.NIL != var1) {
                                if (module0677.NIL != var12) {
                                    var4 = var12;
                                }
                                else {
                                    var4 = f41373(var3, var11);
                                    module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                                }
                            }
                            if (module0677.NIL != var4 && Sequences.length(var4).numE((SubLObject)module0677.ZERO_INTEGER)) {
                                var4 = (SubLObject)module0677.NIL;
                            }
                            f41374(var4);
                            module0015.f799(module0015.$g539$.getDynamicValue(var2));
                        }
                        finally {
                            module0015.$g539$.rebind(var10, var2);
                            module0015.$g541$.rebind(var9, var2);
                            module0015.$g533$.rebind(var4_200, var2);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0677.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var4_198, var2);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var4_197, var2);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var6, var2);
            }
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41374(final SubLObject var196) {
        final SubLThread var197 = SubLProcess.currentSubLThread();
        module0656.f39870((SubLObject)module0677.$ic367$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39074((SubLObject)module0677.$ic369$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic370$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
        if (module0677.NIL != var196) {
            module0642.f39073((SubLObject)module0677.$ic371$);
            module0642.f39032((SubLObject)module0677.UNPROVIDED);
        }
        module0644.f39184((SubLObject)module0677.$ic361$, (SubLObject)module0677.$ic158$);
        module0642.f39032((SubLObject)module0677.UNPROVIDED);
        module0666.f40467((SubLObject)module0677.$ic361$, (SubLObject)module0677.$ic157$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39032((SubLObject)module0677.UNPROVIDED);
        module0666.f40470((SubLObject)module0677.$ic361$, (SubLObject)module0677.$ic372$);
        module0642.f39020(module0015.$g460$.getGlobalValue());
        module0642.f39026((SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != module0655.$g5102$.getDynamicValue(var197)) {
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic361$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != module0677.$g5319$.getDynamicValue(var197)) {
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0677.$g5319$.getDynamicValue(var197));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            if (module0677.NIL != module0677.$g5320$.getDynamicValue(var197)) {
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0677.$g5320$.getDynamicValue(var197));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g350$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic373$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var198 = module0015.$g533$.currentBinding(var197);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var197);
                if (module0677.NIL != var196) {
                    module0642.f39019(var196);
                }
            }
            finally {
                module0015.$g533$.rebind(var198, var197);
            }
            module0642.f39020(module0015.$g337$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g336$.getGlobalValue());
            module0642.f39020(module0015.$g338$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic361$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != module0677.$g5319$.getDynamicValue(var197)) {
                module0642.f39020(module0015.$g340$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0677.$g5319$.getDynamicValue(var197));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            if (module0677.NIL != module0677.$g5320$.getDynamicValue(var197)) {
                module0642.f39020(module0015.$g339$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0677.$g5320$.getDynamicValue(var197));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var198 = module0015.$g533$.currentBinding(var197);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var197);
                if (module0677.NIL != var196) {
                    module0642.f39019(var196);
                }
            }
            finally {
                module0015.$g533$.rebind(var198, var197);
            }
            module0642.f39020(module0015.$g337$.getGlobalValue());
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41373(final SubLObject var195, final SubLObject var201) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        if (Sequences.length(var195).numE((SubLObject)module0677.ZERO_INTEGER)) {
            return (SubLObject)module0677.NIL;
        }
        var202.resetMultipleValues();
        final SubLObject var203 = reader.read_from_string_ignoring_errors(var195, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var204 = var202.secondMultipleValue();
        var202.resetMultipleValues();
        if (var204 == module0677.$ic374$) {
            final SubLObject var205 = (SubLObject)module0677.$ic375$;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0677.NIL != var205) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39042(var205));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            SubLObject var206 = module0015.$g533$.currentBinding(var202);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var202);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0677.$ic376$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var206, var202);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            var206 = module0015.$g537$.currentBinding(var202);
            try {
                module0015.$g537$.bind((SubLObject)module0677.T, var202);
                module0642.f39019(var195);
            }
            finally {
                module0015.$g537$.rebind(var206, var202);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
            return var195;
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic377$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        final SubLObject var207 = module0015.$g537$.currentBinding(var202);
        try {
            module0015.$g537$.bind((SubLObject)module0677.T, var202);
            module0642.f39013(var195, (SubLObject)module0677.ZERO_INTEGER, var204);
        }
        finally {
            module0015.$g537$.rebind(var207, var202);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0677.$ic378$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        SubLObject var208 = (SubLObject)module0677.NIL;
        SubLObject var209 = (SubLObject)module0677.NIL;
        module0015.f741();
        module0642.f39020(module0015.$g203$.getGlobalValue());
        final SubLObject var210 = module0015.$g537$.currentBinding(var202);
        try {
            module0015.$g537$.bind((SubLObject)module0677.T, var202);
            try {
                var202.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var4_208 = Errors.$error_handler$.currentBinding(var202);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0677.$ic379$, var202);
                    try {
                        final SubLObject var4_209 = StreamsLow.$standard_output$.currentBinding(var202);
                        final SubLObject var211 = StreamsLow.$error_output$.currentBinding(var202);
                        try {
                            StreamsLow.$standard_output$.bind(module0015.$g131$.getDynamicValue(var202), var202);
                            StreamsLow.$error_output$.bind(module0015.$g131$.getDynamicValue(var202), var202);
                            var208 = module0112.f7688((SubLObject)ConsesLow.list((SubLObject)module0677.$ic380$, var203));
                        }
                        finally {
                            StreamsLow.$error_output$.rebind(var211, var202);
                            StreamsLow.$standard_output$.rebind(var4_209, var202);
                        }
                    }
                    catch (Throwable var212) {
                        Errors.handleThrowable(var212, (SubLObject)module0677.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var4_208, var202);
                }
            }
            catch (Throwable var213) {
                var209 = Errors.handleThrowable(var213, module0003.$g3$.getGlobalValue());
            }
            finally {
                var202.throwStack.pop();
            }
            if (module0677.NIL != var209) {
                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                final SubLObject var214 = (SubLObject)module0677.$ic375$;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (module0677.NIL != var214) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(var214));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_210 = module0015.$g533$.currentBinding(var202);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var202);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0677.$ic381$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_210, var202);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                module0642.f39019(var209);
                module0642.f39026((SubLObject)module0677.TWO_INTEGER);
            }
        }
        finally {
            module0015.$g537$.rebind(var210, var202);
        }
        module0642.f39020(module0015.$g204$.getGlobalValue());
        if (module0677.NIL != var209) {
            return var195;
        }
        SubLObject var215 = var208;
        SubLObject var216 = (SubLObject)module0677.NIL;
        var216 = var215.first();
        while (module0677.NIL != var215) {
            module0656.f39804(var216, (SubLObject)module0677.ZERO_INTEGER, (SubLObject)module0677.T);
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            var215 = var215.rest();
            var216 = var215.first();
        }
        return module0038.f2623(var195, var204, (SubLObject)module0677.NIL);
    }
    
    public static SubLObject f41375(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic382$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic363$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41376(final SubLObject var214) {
        SubLObject var215 = (SubLObject)module0677.NIL;
        SubLObject var218_219;
        SubLObject var216;
        SubLObject var217;
        SubLObject var219;
        SubLObject var218;
        for (var216 = (var218_219 = Sequences.length(var214)), var217 = (SubLObject)module0677.NIL, var217 = (SubLObject)module0677.ZERO_INTEGER; !var217.numGE(var218_219); var217 = module0048.f_1X(var217)) {
            var218 = (var219 = Strings.sublisp_char(var214, var217));
            if (var219.eql((SubLObject)Characters.CHAR_lparen)) {
                var215 = (SubLObject)ConsesLow.cons(var217, var215);
            }
            else if (var219.eql((SubLObject)Characters.CHAR_rparen)) {
                var215 = var215.rest();
            }
        }
        SubLObject var220 = var215;
        SubLObject var221 = (SubLObject)module0677.NIL;
        var221 = var220.first();
        while (module0677.NIL != var220) {
            final SubLObject var222 = reader.read_from_string_ignoring_errors(var214, (SubLObject)module0677.NIL, (SubLObject)module0677.NIL, Numbers.add(var221, (SubLObject)module0677.ONE_INTEGER), (SubLObject)module0677.UNPROVIDED);
            if (var222.isSymbol() && module0677.NIL != Symbols.fboundp(var222)) {
                return var222;
            }
            var220 = var220.rest();
            var221 = var220.first();
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41377(final SubLObject var1) {
        module0642.f39019((SubLObject)module0677.$ic386$);
        if (module0677.NIL != var1) {
            SubLObject var2 = var1;
            SubLObject var3 = (SubLObject)module0677.NIL;
            var3 = var2.first();
            while (module0677.NIL != var2) {
                if (!var3.eql(var1.first())) {
                    module0642.f39019((SubLObject)module0677.$ic387$);
                }
                f41378(var3);
                var2 = var2.rest();
                var3 = var2.first();
            }
        }
        module0642.f39019((SubLObject)module0677.$ic388$);
        return var1;
    }
    
    public static SubLObject f41378(final SubLObject var188) {
        if (module0677.NIL == var188) {
            module0642.f39019((SubLObject)module0677.$ic264$);
        }
        else if (var188.isKeyword()) {
            module0642.f39024(var188);
        }
        else if (var188.isSymbol()) {
            module0642.f39019(Strings.string_downcase(Symbols.symbol_name(var188), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        }
        else if (var188.isAtom()) {
            module0642.f39024(var188);
        }
        else if (Sequences.length(var188).numE((SubLObject)module0677.TWO_INTEGER) && var188.first() == module0677.$ic389$ && conses_high.second(var188).isSymbol() && module0677.NIL != Symbols.fboundp(conses_high.second(var188))) {
            module0642.f39019((SubLObject)module0677.$ic390$);
            f41378(conses_high.second(var188));
        }
        else if (Sequences.length(var188).numE((SubLObject)module0677.TWO_INTEGER) && var188.first() == module0677.$ic44$) {
            module0642.f39019((SubLObject)module0677.$ic391$);
            f41378(conses_high.second(var188));
        }
        else {
            module0642.f39019((SubLObject)module0677.$ic386$);
            SubLObject var189 = (SubLObject)module0677.NIL;
            SubLObject var190 = (SubLObject)module0677.NIL;
            var189 = var188;
            var190 = var189.first();
            while (var189.rest().isCons()) {
                if (!var189.eql(var188)) {
                    module0642.f39032((SubLObject)module0677.ONE_INTEGER);
                }
                f41378(var190);
                var189 = var189.rest();
                var190 = var189.first();
            }
            if (!var189.eql(var188)) {
                module0642.f39032((SubLObject)module0677.ONE_INTEGER);
            }
            f41378(var190);
            if (module0677.NIL != var189.rest()) {
                module0642.f39019((SubLObject)module0677.$ic392$);
                f41378(var189.rest());
            }
            module0642.f39019((SubLObject)module0677.$ic388$);
        }
        return var188;
    }
    
    public static SubLObject f41286() {
        SubLObject var146 = (SubLObject)module0677.NIL;
        if (module0677.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0677.$ic397$);
        }
        else {
            final SubLObject var147 = f41379(module0574.f35152());
            var146 = module0723.f44318(var147, module0012.$g54$.getGlobalValue());
            if (module0677.NIL != var146) {
                module0677.$g5321$.setDynamicValue(var147);
            }
        }
        return var146;
    }
    
    public static SubLObject f41316(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLObject var2 = f41380();
        if (module0677.NIL != var2) {
            module0656.f39793((SubLObject)module0677.$ic399$, (SubLObject)module0677.T);
        }
        else {
            module0656.f39792((SubLObject)module0677.$ic400$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41380() {
        final SubLObject var225 = f41379((SubLObject)module0677.UNPROVIDED);
        SubLObject var226 = (SubLObject)module0677.NIL;
        f41381();
        if (module0677.NIL != Filesys.probe_file(var225)) {
            module0723.f44319(var225);
            var226 = (SubLObject)module0677.T;
        }
        else if (module0677.NIL != f41382()) {
            module0723.f44319(f41383());
            var226 = (SubLObject)module0677.T;
        }
        return var226;
    }
    
    public static SubLObject f41379(SubLObject var228) {
        if (var228 == module0677.UNPROVIDED) {
            var228 = module0574.f35152();
        }
        final SubLThread var229 = SubLProcess.currentSubLThread();
        final SubLObject var230 = (SubLObject)((module0677.NIL != constant_handles_oc.f8449(var228)) ? constants_high_oc.f10743(var228) : ((var228 == module0677.$ic402$) ? module0677.$ic398$ : module0213.f13918(var228)));
        return Strings.string_downcase(Filesys.construct_filename(module0677.$g5323$.getDynamicValue(var229), var230, module0677.$g5322$.getDynamicValue(var229), (SubLObject)module0677.T), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
    }
    
    public static SubLObject f41381() {
        module0683.$g5325$.setDynamicValue((SubLObject)module0677.NIL);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41382() {
        return module0035.sublisp_boolean(Filesys.probe_file(f41383()));
    }
    
    public static SubLObject f41383() {
        return f41379((SubLObject)module0677.$ic402$);
    }
    
    public static SubLObject f41384(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0677.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0677.$ic406$);
            return (SubLObject)module0677.NIL;
        }
        final SubLObject var3 = (SubLObject)module0677.$ic407$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var3) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_230 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_231 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_232 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_232, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0677.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    if (module0677.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_233 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0677.$ic408$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                        module0656.f39870((SubLObject)module0677.$ic404$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39026((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic409$);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic410$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic411$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39075((SubLObject)module0677.$ic412$, (SubLObject)module0677.NIL, module0677.$g5326$.getDynamicValue(var2));
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39073((SubLObject)module0677.$ic158$);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39074((SubLObject)module0677.$ic413$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_233, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_231, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_230, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41385(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0677.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0677.$ic406$);
            return (SubLObject)module0677.NIL;
        }
        if (module0677.NIL == var1) {
            module0656.f39789((SubLObject)module0677.$ic415$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            return (SubLObject)module0677.NIL;
        }
        final SubLObject var3 = (SubLObject)module0677.$ic416$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var3) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_234 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_235 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_236 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_236, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0677.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    if (module0677.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_237 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0677.$ic408$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                        module0656.f39870((SubLObject)module0677.$ic404$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        SubLObject var9 = module0642.f39104((SubLObject)module0677.$ic412$, var1);
                        SubLObject var10 = module0642.f39104((SubLObject)module0677.$ic417$, var1);
                        var9 = module0038.f2735(var9);
                        if (module0677.NIL == var10) {
                            var10 = (SubLObject)module0677.ZERO_INTEGER;
                        }
                        if (var10.isString()) {
                            var10 = reader.read_from_string_ignoring_errors(var10, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        }
                        if (var9.isString()) {
                            if (module0677.NIL != Filesys.probe_file(var9)) {
                                var2.resetMultipleValues();
                                final SubLObject var11 = module0545.f33749(var9, var10);
                                final SubLObject var12 = var2.secondMultipleValue();
                                final SubLObject var13 = var2.thirdMultipleValue();
                                var2.resetMultipleValues();
                                module0642.f39019((SubLObject)module0677.$ic418$);
                                module0642.f39019(var9);
                                module0642.f39019((SubLObject)module0677.$ic419$);
                                module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                                if (var11.equalp((SubLObject)module0677.$ic420$)) {
                                    module0642.f39032((SubLObject)module0677.FOUR_INTEGER);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0677.$ic421$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                else {
                                    f41386(var9, var11, var12, var13);
                                }
                            }
                            else {
                                module0656.f39789((SubLObject)module0677.$ic422$, var9, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                            }
                        }
                        else {
                            module0656.f39789((SubLObject)module0677.$ic423$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_237, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_235, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_234, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41386(final SubLObject var238, final SubLObject var240, final SubLObject var241, final SubLObject var222) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        if (var240.equalp((SubLObject)module0677.$ic425$)) {
            module0656.f39789((SubLObject)module0677.$ic422$, var238, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        }
        else {
            final SubLObject var243 = module0656.f39832((SubLObject)module0677.NIL);
            module0642.f39020(module0015.$g282$.getGlobalValue());
            module0642.f39020(module0015.$g284$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0110.$g570$.getDynamicValue(var242));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g285$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic14$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var243) {
                module0642.f39020(module0015.$g286$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var243);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var244 = module0015.$g533$.currentBinding(var242);
            final SubLObject var245 = module0015.$g541$.currentBinding(var242);
            final SubLObject var246 = module0015.$g539$.currentBinding(var242);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var242);
                module0015.$g541$.bind((SubLObject)module0677.T, var242);
                module0015.$g539$.bind(module0015.f797(), var242);
                module0642.f39069((SubLObject)module0677.$ic408$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0677.$ic426$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019(var241);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0677.$ic427$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                module0642.f39019(var240);
                module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0677.$ic428$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                module0642.f39019((SubLObject)module0677.$ic429$);
                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                module0642.f39075((SubLObject)module0677.$ic417$, var241, module0677.$g5327$.getDynamicValue(var242));
                module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0677.$ic430$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                module0642.f39019((SubLObject)module0677.$ic431$);
                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                module0642.f39075((SubLObject)module0677.$ic412$, var238, module0677.$g5326$.getDynamicValue(var242));
                module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                module0642.f39073((SubLObject)module0677.$ic371$);
                module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                module0642.f39074((SubLObject)module0677.$ic413$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                module0015.f799(module0015.$g539$.getDynamicValue(var242));
            }
            finally {
                module0015.$g539$.rebind(var246, var242);
                module0015.$g541$.rebind(var245, var242);
                module0015.$g533$.rebind(var244, var242);
            }
            module0642.f39020(module0015.$g283$.getGlobalValue());
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41387(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0677.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0677.$ic434$);
            return (SubLObject)module0677.NIL;
        }
        final SubLObject var3 = (SubLObject)module0677.$ic435$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var3) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_242 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_243 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_244 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_244, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0677.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    if (module0677.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_245 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0677.$ic436$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                        module0656.f39870((SubLObject)module0677.$ic432$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39073((SubLObject)module0677.$ic371$);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic116$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic437$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39072((SubLObject)module0677.$ic438$, module0677.$g5329$.getGlobalValue(), (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic439$);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39072((SubLObject)module0677.$ic438$, module0677.$g5330$.getGlobalValue(), (SubLObject)module0677.NIL, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic440$);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        var2.resetMultipleValues();
                        final SubLObject var9 = module0051.f3613(module0051.f3557((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
                        final SubLObject var10 = var2.secondMultipleValue();
                        final SubLObject var11 = var2.thirdMultipleValue();
                        var2.resetMultipleValues();
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic441$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic442$);
                        module0642.f39075((SubLObject)module0677.$ic443$, var10, (SubLObject)module0677.TWO_INTEGER);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic444$);
                        module0642.f39075((SubLObject)module0677.$ic445$, var9, (SubLObject)module0677.TWO_INTEGER);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic446$);
                        module0642.f39075((SubLObject)module0677.$ic447$, var11, (SubLObject)module0677.FOUR_INTEGER);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic448$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic442$);
                        module0642.f39075((SubLObject)module0677.$ic449$, var10, (SubLObject)module0677.TWO_INTEGER);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic444$);
                        module0642.f39075((SubLObject)module0677.$ic450$, var9, (SubLObject)module0677.TWO_INTEGER);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0677.$ic446$);
                        module0642.f39075((SubLObject)module0677.$ic451$, var11, (SubLObject)module0677.FOUR_INTEGER);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic452$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0666.f40467((SubLObject)module0677.$ic453$, (SubLObject)module0677.$ic157$, module0677.$ic237$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39075((SubLObject)module0677.$ic453$, module0574.f35152(), (SubLObject)module0677.$ic454$);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0644.f39184((SubLObject)module0677.$ic453$, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic455$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0666.f40467((SubLObject)module0677.$ic456$, (SubLObject)module0677.$ic157$, module0677.$ic457$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0642.f39075((SubLObject)module0677.$ic456$, (SubLObject)module0677.$ic458$, (SubLObject)module0677.$ic454$);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0644.f39184((SubLObject)module0677.$ic456$, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_245, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_243, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_242, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41388(final SubLObject var1) {
        if (module0677.NIL != module0642.f39104((SubLObject)module0677.$ic438$, var1)) {
            return (SubLObject)module0677.T;
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41389(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0677.NIL == f41388(var1)) {
            module0656.f39789((SubLObject)module0677.$ic462$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            return (SubLObject)module0677.NIL;
        }
        final SubLObject var3 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0677.$ic438$, var1), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        SubLObject var4 = module0038.f2735(module0642.f39104((SubLObject)module0677.$ic453$, var1));
        SubLObject var5 = module0038.f2735(module0642.f39104((SubLObject)module0677.$ic456$, var1));
        final SubLObject var6 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0677.$ic445$, var1), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var7 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0677.$ic443$, var1), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var8 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0677.$ic447$, var1), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var9 = module0051.f3604(var6, var7, var8);
        final SubLObject var10 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0677.$ic450$, var1), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var11 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0677.$ic449$, var1), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var12 = reader.read_from_string_ignoring_errors(module0642.f39104((SubLObject)module0677.$ic451$, var1), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var13 = module0051.f3604(var10, var11, var12);
        if (module0677.$ic458$.equalp(var4)) {
            var4 = (SubLObject)module0677.NIL;
        }
        else {
            var4 = module0656.f39943(var4, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL == module0173.f10955(var4)) {
                module0656.f39789((SubLObject)module0677.$ic463$, var4, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                return (SubLObject)module0677.NIL;
            }
        }
        if (module0677.$ic458$.equalp(var5)) {
            var5 = (SubLObject)module0677.NIL;
        }
        else {
            var5 = module0656.f39943(var5, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL == module0173.f10955(var5)) {
                module0656.f39789((SubLObject)module0677.$ic464$, var5, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                return (SubLObject)module0677.NIL;
            }
        }
        final SubLObject var14 = (SubLObject)module0677.$ic465$;
        final SubLObject var15 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var16 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var16) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var16);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var14) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var14);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_259 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_260 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_261 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_261, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var14) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var14);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_262 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var17 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var18 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)module0677.$ic460$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic466$);
                        if (var3.equalp(module0677.$g5329$.getGlobalValue())) {
                            module0642.f39019((SubLObject)module0677.$ic467$);
                        }
                        else {
                            module0642.f39019((SubLObject)module0677.$ic468$);
                        }
                        module0642.f39019((SubLObject)module0677.$ic469$);
                        module0656.f39800(var9);
                        module0642.f39019((SubLObject)module0677.$ic470$);
                        module0656.f39800(var13);
                        if (module0677.NIL != var4) {
                            module0642.f39019((SubLObject)module0677.$ic471$);
                            module0656.f39915(var4, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        }
                        if (module0677.NIL != var5) {
                            module0642.f39019((SubLObject)module0677.$ic472$);
                            module0656.f39915(var5, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)module0677.$ic156$);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        final SubLObject var19 = (SubLObject)(var3.equalp(module0677.$g5329$.getGlobalValue()) ? ((module0677.NIL != var5) ? ConsesLow.list((SubLObject)module0677.$ic473$, var5, var9, var13, var4) : ConsesLow.list((SubLObject)module0677.$ic474$, var9, var13, var4)) : ((module0677.NIL != var5) ? ConsesLow.list((SubLObject)module0677.$ic475$, var5, var9, var13, var4) : ConsesLow.list((SubLObject)module0677.$ic476$, var9, var13, var4)));
                        final SubLObject var20 = (SubLObject)(var3.equalp(module0677.$g5329$.getGlobalValue()) ? module0677.$ic477$ : module0677.$ic478$);
                        final SubLObject var21 = (SubLObject)ConsesLow.list(module0677.$ic479$, (SubLObject)module0677.$ic480$, (SubLObject)ConsesLow.list(module0677.$ic481$, (SubLObject)ConsesLow.list(module0677.$ic482$, (SubLObject)module0677.$ic480$, (SubLObject)ConsesLow.list(module0677.$ic483$, (SubLObject)ConsesLow.list(module0677.$ic484$, var19))), (SubLObject)ConsesLow.listS(module0677.$ic485$, var20, (SubLObject)module0677.$ic486$)));
                        var2.resetMultipleValues();
                        final SubLObject var22 = module0409.f28506(var21, module0677.$ic487$, (SubLObject)module0677.$ic488$);
                        final SubLObject var23 = var2.secondMultipleValue();
                        final SubLObject var24 = var2.thirdMultipleValue();
                        var2.resetMultipleValues();
                        if (var23 != module0677.$ic489$) {
                            Errors.warn((SubLObject)module0677.$ic490$, var23);
                        }
                        SubLObject var25 = (SubLObject)module0677.NIL;
                        SubLObject var26 = var22;
                        SubLObject var27 = (SubLObject)module0677.NIL;
                        var27 = var26.first();
                        while (module0677.NIL != var26) {
                            final SubLObject var28 = module0035.f2113(var27);
                            final SubLObject var29 = module0233.f15370(var28);
                            var25 = (SubLObject)ConsesLow.cons(var29, var25);
                            var26 = var26.rest();
                            var27 = var26.first();
                        }
                        var25 = Sequences.nreverse(var25);
                        f41390(var3, var25, var24);
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var18, var2);
                        module0015.$g541$.rebind(var17, var2);
                        module0015.$g533$.rebind(var4_262, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_260, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_259, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var15, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41390(final SubLObject var249, final SubLObject var268, final SubLObject var267) {
        final SubLThread var269 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var268) {
            module0642.f39032((SubLObject)module0677.THREE_INTEGER);
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)module0677.$ic492$);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0642.f39026((SubLObject)module0677.TWO_INTEGER);
            return (SubLObject)module0677.NIL;
        }
        SubLObject var270 = (SubLObject)module0677.NIL;
        SubLObject var271 = (SubLObject)module0677.NIL;
        SubLObject var272 = (SubLObject)module0677.NIL;
        final SubLObject var273 = Equality.equalp(var249, module0677.$g5329$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var269), (SubLObject)module0677.$ic493$, Sequences.length(var268), (SubLObject)((module0677.NIL != var273) ? module0677.$ic467$ : module0677.$ic468$));
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0656.f39837((SubLObject)module0677.$ic494$, var267, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
        module0642.f39026((SubLObject)module0677.UNPROVIDED);
        SubLObject var274 = var268;
        SubLObject var275 = (SubLObject)module0677.NIL;
        var275 = var274.first();
        while (module0677.NIL != var274) {
            if (module0677.NIL != var273) {
                if (!var270.equalp(module0617.f37871(var275, (SubLObject)module0677.UNPROVIDED))) {
                    var270 = module0617.f37871(var275, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0656.f39915(var270, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    var271 = (SubLObject)module0677.NIL;
                }
                if (!var271.equalp(module0617.f37872(var275, (SubLObject)module0677.UNPROVIDED))) {
                    var271 = module0617.f37872(var275, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                    module0656.f39800(var271);
                }
                if (!var272.equalp(module0226.f15075(var275, (SubLObject)module0677.UNPROVIDED))) {
                    var272 = module0226.f15075(var275, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0656.f39915(var272, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                }
            }
            else {
                if (!var270.equalp(module0178.f11295(var275))) {
                    var270 = module0178.f11295(var275);
                    module0642.f39051((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0656.f39915(var270, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    var271 = (SubLObject)module0677.NIL;
                }
                if (!var271.equalp(module0178.f11296(var275))) {
                    var271 = module0178.f11296(var275);
                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                    module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                    module0656.f39800(var271);
                }
            }
            module0642.f39026((SubLObject)module0677.UNPROVIDED);
            module0642.f39032((SubLObject)module0677.SIX_INTEGER);
            module0656.f39804(var275, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != assertion_handles_oc.f11035(var275)) {
                module0642.f39019((SubLObject)module0677.$ic495$);
                module0656.f39915(module0178.f11287(var275), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
            }
            var274 = var274.rest();
            var275 = var274.first();
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41391(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic496$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic497$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41392(SubLObject var1) {
        if (var1 == module0677.UNPROVIDED) {
            var1 = (SubLObject)module0677.NIL;
        }
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = (SubLObject)module0677.$ic503$;
        final SubLObject var4 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var5 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var5) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var5);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var3) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var3);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_277 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_278 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_279 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_279, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var3) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    final SubLObject var6 = module0656.f39832((SubLObject)module0677.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic14$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    if (module0677.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_280 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0642.f39069((SubLObject)module0677.$ic504$, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                        module0656.f39870((SubLObject)module0677.$ic501$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39074((SubLObject)module0677.$ic505$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.THREE_INTEGER);
                        module0642.f39073((SubLObject)module0677.$ic158$);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic506$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0666.f40467((SubLObject)module0677.$ic507$, (SubLObject)module0677.$ic157$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0666.f40470((SubLObject)module0677.$ic507$, (SubLObject)module0677.$ic372$);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic507$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic359$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        final SubLObject var4_281 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_281, var2);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic508$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0666.f40467((SubLObject)module0677.$ic509$, (SubLObject)module0677.$ic157$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39032((SubLObject)module0677.UNPROVIDED);
                        module0666.f40470((SubLObject)module0677.$ic509$, (SubLObject)module0677.$ic372$);
                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic509$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic359$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.TEN_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        final SubLObject var4_282 = module0015.$g533$.currentBinding(var2);
                        try {
                            module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_282, var2);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var2);
                        module0015.$g541$.rebind(var7, var2);
                        module0015.$g533$.rebind(var4_280, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_278, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_277, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var4, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41393(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0677.NIL;
        SubLObject var4 = (SubLObject)module0677.NIL;
        final SubLObject var5 = module0642.f39104((SubLObject)module0677.$ic507$, var1);
        SubLObject var6 = (SubLObject)module0677.ZERO_INTEGER;
        while (var6.numL(Sequences.length(var5))) {
            var2.resetMultipleValues();
            SubLObject var7 = reader.read_from_string_ignoring_errors(var5, (SubLObject)module0677.NIL, (SubLObject)module0677.$ic511$, var6, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var8 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (var7 == module0677.$ic511$) {
                var6 = Sequences.length(var5);
            }
            else {
                if (var8 == module0677.$ic374$) {
                    return module0656.f39789((SubLObject)module0677.$ic512$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                }
                if (var7.isSymbol()) {
                    var7 = module0126.f8393(Symbols.symbol_name(var7), (SubLObject)module0677.NIL, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED).first();
                }
                if (module0677.NIL != constant_handles_oc.f8449(var7)) {
                    final SubLObject var9 = var7;
                    if (module0677.NIL == conses_high.member(var9, var3, Symbols.symbol_function((SubLObject)module0677.EQL), Symbols.symbol_function((SubLObject)module0677.IDENTITY))) {
                        var3 = (SubLObject)ConsesLow.cons(var9, var3);
                    }
                }
                if (var8.isInteger()) {
                    var6 = var8;
                }
                else {
                    var6 = Sequences.length(var5);
                }
            }
        }
        final SubLObject var10 = module0642.f39104((SubLObject)module0677.$ic509$, var1);
        var6 = (SubLObject)module0677.ZERO_INTEGER;
        while (var6.numL(Sequences.length(var10))) {
            var2.resetMultipleValues();
            SubLObject var7 = reader.read_from_string_ignoring_errors(var10, (SubLObject)module0677.NIL, (SubLObject)module0677.$ic511$, var6, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var8 = var2.secondMultipleValue();
            var2.resetMultipleValues();
            if (var7 == module0677.$ic511$) {
                var6 = Sequences.length(var10);
            }
            else {
                if (var8 == module0677.$ic374$) {
                    return module0656.f39789((SubLObject)module0677.$ic513$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                }
                if (var7.isSymbol()) {
                    var7 = module0126.f8393(Symbols.symbol_name(var7), (SubLObject)module0677.NIL, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED).first();
                }
                if (module0677.NIL != constant_handles_oc.f8449(var7)) {
                    final SubLObject var9 = var7;
                    if (module0677.NIL == conses_high.member(var9, var4, Symbols.symbol_function((SubLObject)module0677.EQL), Symbols.symbol_function((SubLObject)module0677.IDENTITY))) {
                        var4 = (SubLObject)ConsesLow.cons(var9, var4);
                    }
                }
                if (var8.isInteger()) {
                    var6 = var8;
                }
                else {
                    var6 = Sequences.length(var10);
                }
            }
        }
        var3 = Sequences.nreverse(var3);
        final SubLObject var11 = (SubLObject)module0677.$ic514$;
        final SubLObject var12 = module0015.$g538$.currentBinding(var2);
        try {
            module0015.$g538$.bind((module0677.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var2))) ? module0015.$g538$.getDynamicValue(var2) : module0057.f4173((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED), var2);
            module0642.f39020((SubLObject)module0677.$ic3$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var2), module0655.$g5142$.getDynamicValue(var2));
            final SubLObject var13 = module0014.f672((SubLObject)module0677.$ic4$);
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic5$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var13) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var13);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020((SubLObject)module0677.$ic6$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            module0016.f941();
            if (module0677.NIL != var11) {
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var11);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_291 = module0015.$g535$.currentBinding(var2);
            try {
                module0015.$g535$.bind((SubLObject)module0677.T, var2);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0677.NIL != module0015.$g132$.getDynamicValue(var2)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var2)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020((SubLObject)module0677.$ic9$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_292 = module0015.$g533$.currentBinding(var2);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var2);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020((SubLObject)module0677.$ic10$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_293 = module0015.$g533$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic11$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020((SubLObject)module0677.$ic12$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019((SubLObject)module0677.$ic13$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_293, var2);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0677.NIL != var11) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39019(var11);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var2));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                    final SubLObject var4_294 = module0015.$g533$.currentBinding(var2);
                    final SubLObject var14 = module0015.$g541$.currentBinding(var2);
                    final SubLObject var15 = module0015.$g539$.currentBinding(var2);
                    try {
                        module0015.$g533$.bind((SubLObject)module0677.T, var2);
                        module0015.$g541$.bind((SubLObject)module0677.T, var2);
                        module0015.$g539$.bind(module0015.f797(), var2);
                        module0656.f39870((SubLObject)module0677.$ic501$, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                        module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0677.$ic515$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        if (module0677.NIL == var3) {
                            module0642.f39026((SubLObject)module0677.UNPROVIDED);
                            module0642.f39019((SubLObject)module0677.$ic296$);
                            module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0677.$ic516$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            SubLObject var16 = var3;
                            SubLObject var17 = (SubLObject)module0677.NIL;
                            var17 = var16.first();
                            while (module0677.NIL != var16) {
                                module0642.f39026((SubLObject)module0677.UNPROVIDED);
                                module0656.f39915(var17, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                                var16 = var16.rest();
                                var17 = var16.first();
                            }
                            module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                            if (module0677.NIL != var4) {
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)module0677.$ic517$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                var16 = var4;
                                SubLObject var18 = (SubLObject)module0677.NIL;
                                var18 = var16.first();
                                while (module0677.NIL != var16) {
                                    module0642.f39026((SubLObject)module0677.UNPROVIDED);
                                    module0656.f39915(var18, (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED);
                                    var16 = var16.rest();
                                    var18 = var16.first();
                                }
                                module0642.f39026((SubLObject)module0677.TWO_INTEGER);
                            }
                            if (module0677.NIL != module0035.f1997(var3)) {
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)module0677.$ic518$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                            }
                            else {
                                SubLObject var19 = (SubLObject)module0677.NIL;
                                final SubLObject var4_295 = module0147.$g2094$.currentBinding(var2);
                                final SubLObject var11_297 = module0147.$g2095$.currentBinding(var2);
                                try {
                                    module0147.$g2094$.bind((SubLObject)module0677.$ic519$, var2);
                                    module0147.$g2095$.bind(module0677.$ic520$, var2);
                                    var19 = module0218.f14449(var3, (SubLObject)module0677.T);
                                    if (module0677.NIL != var4) {
                                        SubLObject var20 = (SubLObject)module0677.NIL;
                                        SubLObject var21 = var19;
                                        SubLObject var22 = (SubLObject)module0677.NIL;
                                        var22 = var21.first();
                                        while (module0677.NIL != var21) {
                                            SubLObject var23 = (SubLObject)module0677.NIL;
                                            if (module0677.NIL == var23) {
                                                SubLObject var24 = var4;
                                                SubLObject var25 = (SubLObject)module0677.NIL;
                                                var25 = var24.first();
                                                while (module0677.NIL == var23 && module0677.NIL != var24) {
                                                    if (module0677.NIL != module0035.f2428(var25, module0289.f19396(var22), (SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED)) {
                                                        var23 = (SubLObject)module0677.T;
                                                    }
                                                    var24 = var24.rest();
                                                    var25 = var24.first();
                                                }
                                            }
                                            if (module0677.NIL == var23) {
                                                var20 = (SubLObject)ConsesLow.cons(var22, var20);
                                            }
                                            var21 = var21.rest();
                                            var22 = var21.first();
                                        }
                                        var19 = var20;
                                    }
                                }
                                finally {
                                    module0147.$g2095$.rebind(var11_297, var2);
                                    module0147.$g2094$.rebind(var4_295, var2);
                                }
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)module0677.$ic521$);
                                module0642.f39019(Sequences.length(var19));
                                module0642.f39019((SubLObject)module0677.$ic522$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                if (module0677.NIL != var19) {
                                    SubLObject var26 = var19;
                                    SubLObject var27 = (SubLObject)module0677.NIL;
                                    var27 = var26.first();
                                    while (module0677.NIL != var26) {
                                        module0642.f39026((SubLObject)module0677.UNPROVIDED);
                                        module0656.f39916(var27, (SubLObject)module0677.T, (SubLObject)module0677.UNPROVIDED);
                                        var26 = var26.rest();
                                        var27 = var26.first();
                                    }
                                }
                            }
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var2));
                    }
                    finally {
                        module0015.$g539$.rebind(var15, var2);
                        module0015.$g541$.rebind(var14, var2);
                        module0015.$g533$.rebind(var4_294, var2);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0677.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_292, var2);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0677.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_291, var2);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0677.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var12, var2);
        }
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41394(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic524$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic525$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41395(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic532$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic533$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            if (module0677.NIL != module0014.f695((SubLObject)module0677.$ic530$)) {
                final SubLObject var48 = module0014.f697((SubLObject)module0677.$ic530$);
                final SubLObject var49 = (SubLObject)module0677.$ic22$;
                final SubLObject var50 = module0014.f694((SubLObject)module0677.$ic530$);
                final SubLObject var51 = (SubLObject)module0677.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var48);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                if (module0677.NIL != var50) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(var50);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                if (module0677.NIL != var49) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var49));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                if (module0677.NIL != var51) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                    module0642.f39020(var51);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
                final SubLObject var4_301 = module0015.$g533$.currentBinding(var45);
                try {
                    module0015.$g533$.bind((SubLObject)module0677.T, var45);
                }
                finally {
                    module0015.$g533$.rebind(var4_301, var45);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39067();
            }
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41396(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic537$;
        }
        final SubLObject var46 = module0656.f39832((SubLObject)module0677.$ic30$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0677.$ic538$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var46) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var46);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var47 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var47, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41397(SubLObject var44) {
        if (var44 == module0677.UNPROVIDED) {
            var44 = (SubLObject)module0677.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0677.NIL == var44) {
            var44 = (SubLObject)module0677.$ic546$;
        }
        final SubLObject var46 = (SubLObject)((module0677.NIL != module0655.$g5109$.getDynamicValue(var45)) ? module0677.$ic543$ : module0677.$ic30$);
        final SubLObject var47 = module0656.f39832(var46);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        module0642.f39019(module0656.f39811());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        if (module0677.NIL != var47) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var47);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
        final SubLObject var48 = module0015.$g533$.currentBinding(var45);
        try {
            module0015.$g533$.bind((SubLObject)module0677.T, var45);
            final SubLObject var49 = module0014.f697((SubLObject)module0677.$ic543$);
            final SubLObject var50 = (SubLObject)module0677.$ic22$;
            final SubLObject var51 = module0014.f694((SubLObject)module0677.$ic543$);
            final SubLObject var52 = (SubLObject)module0677.ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            module0642.f39020(var49);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            if (module0677.NIL != var51) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var51);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            if (module0677.NIL != var50) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(module0642.f39049(var50));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            if (module0677.NIL != var52) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
                module0642.f39020(var52);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0677.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0677.UNPROVIDED);
            final SubLObject var4_304 = module0015.$g533$.currentBinding(var45);
            try {
                module0015.$g533$.bind((SubLObject)module0677.T, var45);
            }
            finally {
                module0015.$g533$.rebind(var4_304, var45);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
            module0642.f39067();
            module0642.f39019(var44);
        }
        finally {
            module0015.$g533$.rebind(var48, var45);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41398(final SubLObject var305, final SubLObject var306, SubLObject var307) {
        if (var307 == module0677.UNPROVIDED) {
            var307 = (SubLObject)module0677.$ic549$;
        }
        return Sequences.cconcatenate((SubLObject)module0677.$ic550$, new SubLObject[] { var305, module0677.$ic551$, print_high.princ_to_string(Numbers.add((SubLObject)module0677.$ic552$, var306)), module0724.$g4467$.getGlobalValue(), module0677.$ic553$, Sequences.cconcatenate((SubLObject)module0677.$ic554$, module0006.f203(var306)), module0724.$g5331$.getGlobalValue(), var307 });
    }
    
    public static SubLObject f41399() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41282", "CB-TOOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41283", "S#45298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41284", "S#45299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41285", "CB-TOOLS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41288", "S#45300", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41287", "S#45301", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41289", "S#45302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41290", "S#45303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41291", "S#45304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41292", "S#45305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41293", "S#45306", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41294", "S#45307");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41295", "S#44720", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41296", "S#45308", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41297", "S#45309");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41298", "CB-OPTIONS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41303", "S#45310");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41304", "S#45311");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41305", "S#45312");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41306", "S#45313");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41307", "S#45314");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41308", "S#45315");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0677", "f41309", "S#45316");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41310", "S#45317", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41299", "S#45318", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41300", "S#45319", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41301", "S#45320", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41311", "S#45321", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41312", "S#43760", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41302", "S#45322", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41313", "S#45323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41314", "S#45324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41315", "CB-OPTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41318", "S#45325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41319", "S#45326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41317", "S#45327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41322", "S#45328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41323", "S#45329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41320", "S#45330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41321", "S#45331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41325", "S#45332", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41324", "S#45333", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41326", "S#45334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41327", "CB-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41328", "S#44187", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41331", "S#43761", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41334", "S#45335", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41337", "S#45336", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41338", "CB-CLEAR-HISTORY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41343", "S#45337", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41344", "S#45338", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41345", "S#45339", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41346", "S#45340", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41347", "S#45341", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41348", "CB-HISTORY-EL-FORMULAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41349", "S#45342", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41350", "CB-HISTORY-HL-FORMULAS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41351", "S#45343", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41352", "S#45150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41358", "S#45148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41332", "S#44564", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41361", "S#45344", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41359", "S#44189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41354", "S#45345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41339", "S#45346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41362", "S#45347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41333", "S#45348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41363", "S#45349", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41360", "S#44188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41353", "S#45350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41355", "S#45351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41340", "S#45352", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41364", "S#45353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41329", "S#45354", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41365", "S#45355", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41336", "S#45063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41366", "S#45180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41335", "S#45179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41356", "S#45356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41341", "S#45357", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41367", "S#45358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41330", "S#45359", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41368", "S#45360", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41369", "S#45120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41370", "S#45361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41371", "S#45119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41357", "S#45362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41342", "S#45363", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41372", "CB-HANDLE-INTERACTOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41374", "S#45364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41373", "S#45365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41375", "S#45366", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41376", "S#45367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41377", "S#45368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41378", "S#45369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41286", "S#45370", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41316", "CB-LOAD-USER-PREFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41380", "S#45371", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41379", "S#45372", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41381", "S#45373", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41382", "S#45374", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41383", "S#45375", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41384", "CB-LOAD-API", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41385", "CB-LOAD-API-HANDLER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41386", "S#45376", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41387", "CB-SHOW-WHEN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41388", "S#45377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41389", "CB-SHOW-WHEN-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41390", "S#45378", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41391", "S#45379", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41392", "CB-INDEX-OVERLAP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41393", "CB-HANDLE-INDEX-OVERLAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41394", "S#45380", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41395", "S#45381", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41396", "S#45382", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41397", "S#45383", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0677", "f41398", "S#45384", 2, 1, false);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41400() {
        module0677.$g5312$ = SubLFiles.defparameter("S#45385", (SubLObject)module0677.TEN_INTEGER);
        module0677.$g5313$ = SubLFiles.deflexical("S#45386", module0067.f4880((SubLObject)module0677.UNPROVIDED, (SubLObject)module0677.UNPROVIDED));
        module0677.$g5314$ = SubLFiles.defparameter("S#45387", (SubLObject)module0677.NIL);
        module0677.$g5316$ = SubLFiles.deflexical("S#45388", (SubLObject)module0677.$ic349$);
        module0677.$g5317$ = SubLFiles.deflexical("S#45389", (SubLObject)module0677.$ic351$);
        module0677.$g5318$ = SubLFiles.deflexical("S#45390", (SubLObject)module0677.TEN_INTEGER);
        module0677.$g5319$ = SubLFiles.defparameter("S#45391", (SubLObject)module0677.$ic359$);
        module0677.$g5320$ = SubLFiles.defparameter("S#45392", (SubLObject)module0677.$ic351$);
        module0677.$g5321$ = SubLFiles.defparameter("S#45393", (SubLObject)module0677.NIL);
        module0677.$g5322$ = SubLFiles.defparameter("S#45394", (SubLObject)module0677.$ic394$);
        module0677.$g5323$ = SubLFiles.defparameter("S#45395", (SubLObject)ConsesLow.list((SubLObject)module0677.$ic395$, (SubLObject)module0677.$ic396$));
        module0677.$g5324$ = SubLFiles.defparameter("S#45396", (SubLObject)module0677.$ic398$);
        module0677.$g5326$ = SubLFiles.defparameter("S#45397", (SubLObject)module0677.$ic403$);
        module0677.$g5327$ = SubLFiles.defparameter("S#45398", (SubLObject)module0677.SEVEN_INTEGER);
        module0677.$g5328$ = SubLFiles.defparameter("S#45399", (SubLObject)module0677.NIL);
        module0677.$g5329$ = SubLFiles.defconstant("S#45400", (SubLObject)module0677.ONE_INTEGER);
        module0677.$g5330$ = SubLFiles.defconstant("S#45401", (SubLObject)module0677.TWO_INTEGER);
        return (SubLObject)module0677.NIL;
    }
    
    public static SubLObject f41401() {
        Hashtables.sethash((SubLObject)module0677.$ic0$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic1$, (SubLObject)module0677.NIL));
        module0015.f873((SubLObject)module0677.$ic19$);
        module0015.f873((SubLObject)module0677.$ic29$);
        module0656.f39840((SubLObject)module0677.$ic32$, (SubLObject)module0677.$ic33$, (SubLObject)module0677.ONE_INTEGER);
        f41289((SubLObject)module0677.$ic53$, (SubLObject)module0677.$ic54$);
        f41289((SubLObject)module0677.$ic55$, (SubLObject)module0677.$ic56$);
        f41289((SubLObject)module0677.$ic57$, (SubLObject)module0677.$ic58$);
        f41289((SubLObject)module0677.$ic59$, (SubLObject)module0677.$ic60$);
        f41289((SubLObject)module0677.$ic61$, (SubLObject)module0677.$ic62$);
        f41289((SubLObject)module0677.$ic63$, (SubLObject)module0677.$ic64$);
        f41289((SubLObject)module0677.$ic65$, (SubLObject)module0677.$ic66$);
        f41289((SubLObject)module0677.$ic67$, (SubLObject)module0677.$ic68$);
        f41289((SubLObject)module0677.$ic69$, (SubLObject)module0677.$ic70$);
        f41289((SubLObject)module0677.$ic71$, (SubLObject)module0677.$ic72$);
        f41289((SubLObject)module0677.$ic73$, (SubLObject)module0677.$ic74$);
        f41289((SubLObject)module0677.$ic76$, (SubLObject)module0677.$ic77$);
        f41289((SubLObject)module0677.$ic78$, (SubLObject)module0677.$ic79$);
        f41289((SubLObject)module0677.$ic80$, (SubLObject)module0677.$ic81$);
        f41289((SubLObject)module0677.$ic82$, (SubLObject)module0677.$ic83$);
        f41289((SubLObject)module0677.$ic84$, (SubLObject)module0677.$ic85$);
        f41289((SubLObject)module0677.$ic86$, (SubLObject)module0677.$ic87$);
        f41289((SubLObject)module0677.$ic88$, (SubLObject)module0677.$ic89$);
        f41289((SubLObject)module0677.$ic90$, (SubLObject)module0677.$ic91$);
        f41289((SubLObject)module0677.$ic92$, (SubLObject)module0677.$ic93$);
        f41289((SubLObject)module0677.$ic94$, (SubLObject)module0677.$ic95$);
        f41289((SubLObject)module0677.$ic96$, (SubLObject)module0677.$ic97$);
        f41289((SubLObject)module0677.$ic98$, (SubLObject)module0677.$ic99$);
        f41289((SubLObject)module0677.$ic100$, (SubLObject)module0677.$ic101$);
        f41289((SubLObject)module0677.$ic102$, (SubLObject)module0677.$ic103$);
        f41289((SubLObject)module0677.$ic104$, (SubLObject)module0677.$ic105$);
        f41289((SubLObject)module0677.$ic106$, (SubLObject)module0677.$ic107$);
        f41289((SubLObject)module0677.$ic108$, (SubLObject)module0677.$ic109$);
        Hashtables.sethash((SubLObject)module0677.$ic111$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic112$, (SubLObject)module0677.NIL));
        module0015.f873((SubLObject)module0677.$ic122$);
        module0002.f50((SubLObject)module0677.$ic138$, (SubLObject)module0677.$ic138$);
        module0002.f50((SubLObject)module0677.$ic143$, (SubLObject)module0677.$ic144$);
        module0015.f873((SubLObject)module0677.$ic268$);
        module0656.f39840((SubLObject)module0677.$ic274$, (SubLObject)module0677.$ic275$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic274$, (SubLObject)module0677.$ic272$, (SubLObject)module0677.$ic276$, (SubLObject)module0677.$ic277$);
        module0015.f873((SubLObject)module0677.$ic286$);
        Hashtables.sethash((SubLObject)module0677.$ic287$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic288$, (SubLObject)module0677.NIL));
        Hashtables.sethash((SubLObject)module0677.$ic303$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic311$, (SubLObject)module0677.NIL));
        module0656.f39840((SubLObject)module0677.$ic303$, (SubLObject)module0677.$ic314$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic303$, (SubLObject)module0677.$ic312$, (SubLObject)module0677.$ic315$, (SubLObject)module0677.$ic316$);
        module0015.f873((SubLObject)module0677.$ic323$);
        module0656.f39840((SubLObject)module0677.$ic290$, (SubLObject)module0677.$ic326$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39840((SubLObject)module0677.$ic294$, (SubLObject)module0677.$ic329$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39840((SubLObject)module0677.$ic298$, (SubLObject)module0677.$ic332$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39840((SubLObject)module0677.$ic302$, (SubLObject)module0677.$ic335$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39840((SubLObject)module0677.$ic301$, (SubLObject)module0677.$ic338$, (SubLObject)module0677.ONE_INTEGER);
        module0015.f873((SubLObject)module0677.$ic339$);
        module0656.f39840((SubLObject)module0677.$ic292$, (SubLObject)module0677.$ic342$, (SubLObject)module0677.ONE_INTEGER);
        module0015.f873((SubLObject)module0677.$ic343$);
        module0656.f39840((SubLObject)module0677.$ic291$, (SubLObject)module0677.$ic346$, (SubLObject)module0677.ONE_INTEGER);
        module0015.f873((SubLObject)module0677.$ic366$);
        Hashtables.sethash((SubLObject)module0677.$ic367$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic368$, (SubLObject)module0677.NIL));
        module0656.f39840((SubLObject)module0677.$ic383$, (SubLObject)module0677.$ic384$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic383$, (SubLObject)module0677.$ic382$, (SubLObject)module0677.$ic385$, (SubLObject)module0677.$ic362$);
        module0012.f441((SubLObject)module0677.$ic393$);
        module0015.f873((SubLObject)module0677.$ic401$);
        Hashtables.sethash((SubLObject)module0677.$ic404$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic405$, (SubLObject)module0677.NIL));
        module0015.f873((SubLObject)module0677.$ic414$);
        module0015.f873((SubLObject)module0677.$ic424$);
        Hashtables.sethash((SubLObject)module0677.$ic432$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic433$, (SubLObject)module0677.NIL));
        module0015.f873((SubLObject)module0677.$ic459$);
        Hashtables.sethash((SubLObject)module0677.$ic460$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic461$, (SubLObject)module0677.NIL));
        module0015.f873((SubLObject)module0677.$ic491$);
        module0656.f39840((SubLObject)module0677.$ic498$, (SubLObject)module0677.$ic499$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic498$, (SubLObject)module0677.$ic496$, (SubLObject)module0677.$ic496$, (SubLObject)module0677.$ic500$);
        Hashtables.sethash((SubLObject)module0677.$ic501$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic502$, (SubLObject)module0677.NIL));
        module0015.f873((SubLObject)module0677.$ic510$);
        module0015.f873((SubLObject)module0677.$ic523$);
        module0656.f39840((SubLObject)module0677.$ic526$, (SubLObject)module0677.$ic527$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic526$, (SubLObject)module0677.$ic524$, (SubLObject)module0677.$ic528$, (SubLObject)module0677.$ic529$);
        Hashtables.sethash((SubLObject)module0677.$ic530$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic531$, (SubLObject)module0677.NIL));
        module0656.f39840((SubLObject)module0677.$ic530$, (SubLObject)module0677.$ic534$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic530$, (SubLObject)module0677.$ic535$, (SubLObject)module0677.$ic536$, (SubLObject)module0677.$ic535$);
        module0656.f39840((SubLObject)module0677.$ic539$, (SubLObject)module0677.$ic540$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic539$, (SubLObject)module0677.$ic537$, (SubLObject)module0677.$ic541$, (SubLObject)module0677.$ic542$);
        Hashtables.sethash((SubLObject)module0677.$ic543$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0677.$ic544$, (SubLObject)module0677.$ic545$));
        module0656.f39840((SubLObject)module0677.$ic543$, (SubLObject)module0677.$ic547$, (SubLObject)module0677.ONE_INTEGER);
        module0656.f39819((SubLObject)module0677.$ic543$, (SubLObject)module0677.$ic192$, (SubLObject)module0677.$ic546$, (SubLObject)module0677.$ic548$);
        return (SubLObject)module0677.NIL;
    }
    
    public void declareFunctions() {
        f41399();
    }
    
    public void initializeVariables() {
        f41400();
    }
    
    public void runTopLevelForms() {
        f41401();
    }
    
    static {
        me = (SubLFile)new module0677();
        module0677.$g5312$ = null;
        module0677.$g5313$ = null;
        module0677.$g5314$ = null;
        module0677.$g5316$ = null;
        module0677.$g5317$ = null;
        module0677.$g5318$ = null;
        module0677.$g5319$ = null;
        module0677.$g5320$ = null;
        module0677.$g5321$ = null;
        module0677.$g5322$ = null;
        module0677.$g5323$ = null;
        module0677.$g5324$ = null;
        module0677.$g5326$ = null;
        module0677.$g5327$ = null;
        module0677.$g5328$ = null;
        module0677.$g5329$ = null;
        module0677.$g5330$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("CB-TOOLS");
        $ic1$ = SubLObjectFactory.makeString("cb-tools.html");
        $ic2$ = SubLObjectFactory.makeString("Browser Tools");
        $ic3$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic4$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic5$ = SubLObjectFactory.makeString("stylesheet");
        $ic6$ = SubLObjectFactory.makeString("text/css");
        $ic7$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic8$ = SubLObjectFactory.makeString("text/javascript");
        $ic9$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic10$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic11$ = SubLObjectFactory.makeString("button");
        $ic12$ = SubLObjectFactory.makeString("reload");
        $ic13$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic14$ = SubLObjectFactory.makeString("post");
        $ic15$ = SubLObjectFactory.makeString("cb-tools-handler");
        $ic16$ = SubLObjectFactory.makeKeyword("SELF");
        $ic17$ = SubLObjectFactory.makeString("Choose a tool.");
        $ic18$ = SubLObjectFactory.makeString("Deprecated Tools");
        $ic19$ = SubLObjectFactory.makeSymbol("CB-TOOLS");
        $ic20$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic21$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic22$ = SubLObjectFactory.makeKeyword("TOP");
        $ic23$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15027", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#669", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45403", "CYC"));
        $ic24$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic25$ = SubLObjectFactory.makeString("save");
        $ic26$ = SubLObjectFactory.makeString("Toolbar Modified");
        $ic27$ = SubLObjectFactory.makeString("Browser Toolbar Modified");
        $ic28$ = SubLObjectFactory.makeString("Tools");
        $ic29$ = SubLObjectFactory.makeSymbol("CB-TOOLS-HANDLER");
        $ic30$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic31$ = SubLObjectFactory.makeString("cb-tools");
        $ic32$ = SubLObjectFactory.makeKeyword("TOOLS");
        $ic33$ = SubLObjectFactory.makeSymbol("S#45300", "CYC");
        $ic34$ = SubLObjectFactory.makeKeyword("TOOLBAR");
        $ic35$ = SubLObjectFactory.makeKeyword("FIELD-NAME");
        $ic36$ = SubLObjectFactory.makeKeyword("LEGEND-FORM");
        $ic37$ = SubLObjectFactory.makeKeyword("CHECK-FN");
        $ic38$ = SubLObjectFactory.makeKeyword("NEW-VALUE-FN");
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#673", "CYC"));
        $ic40$ = SubLObjectFactory.makeUninternedSymbol("US#2E444F6");
        $ic41$ = SubLObjectFactory.makeUninternedSymbol("US#63C0DE9");
        $ic42$ = SubLObjectFactory.makeSymbol("CLET");
        $ic43$ = SubLObjectFactory.makeSymbol("S#45303", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic45$ = SubLObjectFactory.makeSymbol("S#45304", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic47$ = SubLObjectFactory.makeSymbol("CAND");
        $ic48$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic49$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic50$ = SubLObjectFactory.makeSymbol("S#45316", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#45305", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("EVAL");
        $ic53$ = SubLObjectFactory.makeSymbol("S#43697", "CYC");
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("wrap-assertions"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Wrap Assertions (tries to tidy up assertion displays)")));
        $ic55$ = SubLObjectFactory.makeSymbol("S#44453", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("unicode-as-strings"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Display Unicode NAUTs as strings (instead of as NAUTs)")));
        $ic57$ = SubLObjectFactory.makeSymbol("S#43704", "CYC");
        $ic58$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("wrap-interactor"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Wrap Interactor and Ask input boxes")));
        $ic59$ = SubLObjectFactory.makeSymbol("S#43707", "CYC");
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-cyclify-button"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show Cyclify Button in Assertion and Query tools")));
        $ic61$ = SubLObjectFactory.makeSymbol("S#43711", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("doc-separate"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show documentation in separate window")));
        $ic63$ = SubLObjectFactory.makeSymbol("S#43712", "CYC");
        $ic64$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("more-marker-text"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show assertion ball tooltips")));
        $ic65$ = SubLObjectFactory.makeSymbol("S#1600", "CYC");
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-enhanced-tables"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show alternating shades of grey backgrounds in tables")));
        $ic67$ = SubLObjectFactory.makeSymbol("S#43714", "CYC");
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cyc-browser-fast"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Sacrifice some functionality for speed")));
        $ic69$ = SubLObjectFactory.makeSymbol("S#44262", "CYC");
        $ic70$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("search-autocomplete-enabled"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Allow autocomplete in the search box")));
        $ic71$ = SubLObjectFactory.makeSymbol("S#42867", "CYC");
        $ic72$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("use-frames"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Use frames (recommended)")));
        $ic73$ = SubLObjectFactory.makeSymbol("S#42961", "CYC");
        $ic74$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("use-javascript"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Use JavaScript (recommended)")), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#45404", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NEW-VALUE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("S#45308", "CYC"));
        $ic75$ = SubLObjectFactory.makeKeyword("JAVASCRIPT");
        $ic76$ = SubLObjectFactory.makeSymbol("S#42988", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("use-hoverover"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Use overLIB hoverover boxes (slow)")));
        $ic78$ = SubLObjectFactory.makeSymbol("S#43698", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-el-formula"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show EL formula (slow)")));
        $ic80$ = SubLObjectFactory.makeSymbol("S#43699", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-hl-formula"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show HL formula (fast)")));
        $ic82$ = SubLObjectFactory.makeSymbol("S#43703", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("show-english"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show English translation (slow)")));
        $ic84$ = SubLObjectFactory.makeSymbol("S#43702", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("access-diagnostics"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Always perform access diagnostics (slow)")));
        $ic86$ = SubLObjectFactory.makeSymbol("S#43700", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("preserve-meta-assertions"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Always preserve meta assertions by default")));
        $ic88$ = SubLObjectFactory.makeSymbol("S#43701", "CYC");
        $ic89$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("change-all-meta-assertions-mt"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Change Mt of all meta assertions (if all have same Mt as assertion), during change Mt of assertion, by default")));
        $ic90$ = SubLObjectFactory.makeSymbol("S#43692", "CYC");
        $ic91$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("history-show-el-formulas"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show EL assertion formulas")));
        $ic92$ = SubLObjectFactory.makeSymbol("S#1933", "CYC");
        $ic93$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cyc-cyclist-dialog"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Assume Cyc is addressing the current cyclist")));
        $ic94$ = SubLObjectFactory.makeSymbol("S#1935", "CYC");
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("fet-edit-buttons"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show buttons for editing with FET")));
        $ic96$ = SubLObjectFactory.makeSymbol("S#1936", "CYC");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("fet-create-instance-buttons"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show buttons for creating instances with FET (semi-experimental)")));
        $ic98$ = SubLObjectFactory.makeSymbol("S#1937", "CYC");
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("fet-create-spec-buttons"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show buttons for creating specs with FET (experimental)")));
        $ic100$ = SubLObjectFactory.makeSymbol("S#45405", "CYC");
        $ic101$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("followup-widget"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Show the Followup Widget (experimental)")));
        $ic102$ = SubLObjectFactory.makeSymbol("S#1938", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-literal-query-results-one-per-line"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Display literal query results one per line")));
        $ic104$ = SubLObjectFactory.makeSymbol("S#1939", "CYC");
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-skolem-applicable-relations"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Display skolem functions")));
        $ic106$ = SubLObjectFactory.makeSymbol("S#1940", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-applicable-relations-one-per-line"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Display applicable relations one per line")));
        $ic108$ = SubLObjectFactory.makeSymbol("S#1941", "CYC");
        $ic109$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeString("cb-paraphrase-applicable-relations"), (SubLObject)SubLObjectFactory.makeKeyword("LEGEND-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1531", "CYC"), (SubLObject)SubLObjectFactory.makeString("Display paraphrases (slow)")));
        $ic110$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42790", "CYC"), (SubLObject)SubLObjectFactory.makeString("Reset Form")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1516", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42791", "CYC"), (SubLObject)SubLObjectFactory.makeString("Submit"), (SubLObject)SubLObjectFactory.makeString("update")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1516", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42791", "CYC"), (SubLObject)SubLObjectFactory.makeString("Submit & Save"), (SubLObject)SubLObjectFactory.makeString("update_and_save")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1516", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42791", "CYC"), (SubLObject)SubLObjectFactory.makeString("Load Saved"), (SubLObject)SubLObjectFactory.makeString("load_saved")));
        $ic111$ = SubLObjectFactory.makeKeyword("CB-OPTIONS");
        $ic112$ = SubLObjectFactory.makeString("cb-options.html");
        $ic113$ = SubLObjectFactory.makeString("Browser Options");
        $ic114$ = SubLObjectFactory.makeString("cb-options-handler");
        $ic115$ = SubLObjectFactory.makeString("Reset Form");
        $ic116$ = SubLObjectFactory.makeString("Submit");
        $ic117$ = SubLObjectFactory.makeString("update");
        $ic118$ = SubLObjectFactory.makeString("Submit & Save");
        $ic119$ = SubLObjectFactory.makeString("update_and_save");
        $ic120$ = SubLObjectFactory.makeString("Load Saved");
        $ic121$ = SubLObjectFactory.makeString("load_saved");
        $ic122$ = SubLObjectFactory.makeSymbol("CB-OPTIONS");
        $ic123$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic124$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic125$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42783", "CYC"));
        $ic126$ = SubLObjectFactory.makeSymbol("S#947", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)module0677.THREE_INTEGER);
        $ic128$ = SubLObjectFactory.makeSymbol("S#1531", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#1021", "CYC");
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOFLOW"), (SubLObject)module0677.T, (SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)module0677.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLPADDING"), (SubLObject)module0677.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLSPACING"), (SubLObject)module0677.ZERO_INTEGER);
        $ic131$ = SubLObjectFactory.makeSymbol("S#1028", "CYC");
        $ic132$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1024", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1516", "CYC"), (SubLObject)module0677.FOUR_INTEGER));
        $ic133$ = SubLObjectFactory.makeSymbol("S#1023", "CYC");
        $ic134$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("LEFT"), (SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("TOP"));
        $ic135$ = ConsesLow.list((SubLObject)module0677.FOUR_INTEGER);
        $ic136$ = SubLObjectFactory.makeSymbol("S#919", "CYC");
        $ic137$ = SubLObjectFactory.makeString("~A :");
        $ic138$ = SubLObjectFactory.makeSymbol("S#45313", "CYC");
        $ic139$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1523", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic140$ = SubLObjectFactory.makeSymbol("S#26337", "CYC");
        $ic141$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26337", "CYC"), (SubLObject)SubLObjectFactory.makeString(" :"));
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1594", "CYC"));
        $ic143$ = SubLObjectFactory.makeSymbol("S#45314", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#45315", "CYC");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1523", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45406", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic146$ = SubLObjectFactory.makeSymbol("PIF");
        $ic147$ = SubLObjectFactory.makeSymbol("S#45292", "CYC");
        $ic148$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1523", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#45406", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic149$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOVEROVER"));
        $ic150$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic151$ = SubLObjectFactory.makeKeyword("HOVEROVER");
        $ic152$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1567", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#45407", "CYC"));
        $ic153$ = SubLObjectFactory.makeSymbol("S#42786", "CYC");
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1516", "CYC"), (SubLObject)module0677.TWO_INTEGER);
        $ic155$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1594", "CYC")));
        $ic156$ = SubLObjectFactory.makeString(" :");
        $ic157$ = SubLObjectFactory.makeString("Complete");
        $ic158$ = SubLObjectFactory.makeString("Clear");
        $ic159$ = SubLObjectFactory.makeString("General Options");
        $ic160$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic161$ = SubLObjectFactory.makeSymbol("S#13411", "CYC");
        $ic162$ = SubLObjectFactory.makeString("Primary Presentation Language");
        $ic163$ = SubLObjectFactory.makeString("presentation-language");
        $ic164$ = SubLObjectFactory.makeString(":cycl");
        $ic165$ = SubLObjectFactory.makeKeyword("CYCL");
        $ic166$ = SubLObjectFactory.makeString("CycL (default)");
        $ic167$ = SubLObjectFactory.makeString(":nl");
        $ic168$ = SubLObjectFactory.makeKeyword("NL");
        $ic169$ = SubLObjectFactory.makeString("Natural Language (slow)");
        $ic170$ = SubLObjectFactory.makeString("Status Frame Update");
        $ic171$ = SubLObjectFactory.makeString("Update every ");
        $ic172$ = SubLObjectFactory.makeString("status-interval");
        $ic173$ = SubLObjectFactory.makeString("seconds (or empty to disable)");
        $ic174$ = SubLObjectFactory.makeString("Term Display Options");
        $ic175$ = SubLObjectFactory.makeString("Default Index View");
        $ic176$ = SubLObjectFactory.makeString("index-view");
        $ic177$ = SubLObjectFactory.makeString(":inferred");
        $ic178$ = SubLObjectFactory.makeKeyword("INFERRED");
        $ic179$ = SubLObjectFactory.makeString("Inferred");
        $ic180$ = SubLObjectFactory.makeString(":legacy");
        $ic181$ = SubLObjectFactory.makeKeyword("LEGACY");
        $ic182$ = SubLObjectFactory.makeString("Legacy");
        $ic183$ = SubLObjectFactory.makeString("Default Content");
        $ic184$ = SubLObjectFactory.makeString("content");
        $ic185$ = SubLObjectFactory.makeString("upper-bound");
        $ic186$ = SubLObjectFactory.makeString(":maximal");
        $ic187$ = SubLObjectFactory.makeKeyword("MAXIMAL");
        $ic188$ = SubLObjectFactory.makeString("As much as possible up to ");
        $ic189$ = SubLObjectFactory.makeString(" assertions");
        $ic190$ = SubLObjectFactory.makeString(":documentation");
        $ic191$ = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $ic192$ = SubLObjectFactory.makeString("Documentation");
        $ic193$ = SubLObjectFactory.makeString(":definitional");
        $ic194$ = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $ic195$ = SubLObjectFactory.makeString("Definitional Information");
        $ic196$ = SubLObjectFactory.makeString(":lexical");
        $ic197$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic198$ = SubLObjectFactory.makeString("Lexical Information");
        $ic199$ = SubLObjectFactory.makeString("Assertion Formulas");
        $ic200$ = SubLObjectFactory.makeString("formulas-display");
        $ic201$ = SubLObjectFactory.makeString(":hl-formulas");
        $ic202$ = SubLObjectFactory.makeKeyword("HL-FORMULAS");
        $ic203$ = SubLObjectFactory.makeString("HL formulas (fast)");
        $ic204$ = SubLObjectFactory.makeString(":el-formulas");
        $ic205$ = SubLObjectFactory.makeKeyword("EL-FORMULAS");
        $ic206$ = SubLObjectFactory.makeString("EL formulas (slow)");
        $ic207$ = SubLObjectFactory.makeString(":el-formulas-except-when-browsing-skolems");
        $ic208$ = SubLObjectFactory.makeKeyword("EL-FORMULAS-EXCEPT-WHEN-BROWSING-SKOLEMS");
        $ic209$ = SubLObjectFactory.makeString("EL formulas except when browsing skolems (slow)");
        $ic210$ = SubLObjectFactory.makeString("Literal Queries");
        $ic211$ = SubLObjectFactory.makeString("Applicable Relations");
        $ic212$ = SubLObjectFactory.makeString("Assertion Display Options");
        $ic213$ = SubLObjectFactory.makeString("Assertion Editing Options");
        $ic214$ = SubLObjectFactory.makeString("History and Browser Tool Options");
        $ic215$ = SubLObjectFactory.makeString("History Display Options");
        $ic216$ = SubLObjectFactory.makeString("Display no more than ");
        $ic217$ = SubLObjectFactory.makeString("constant-history-max");
        $ic218$ = SubLObjectFactory.makeString(" constants");
        $ic219$ = SubLObjectFactory.makeString("nat-history-max");
        $ic220$ = SubLObjectFactory.makeString(" NARTs");
        $ic221$ = SubLObjectFactory.makeString("assertion-history-max");
        $ic222$ = SubLObjectFactory.makeString("sentence-history-max");
        $ic223$ = SubLObjectFactory.makeString(" sentences");
        $ic224$ = SubLObjectFactory.makeString("Browser Tool Options");
        $ic225$ = SubLObjectFactory.makeString("Default Mt");
        $ic226$ = SubLObjectFactory.makeString("default-mt");
        $ic227$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic228$ = SubLObjectFactory.makeString("What microtheory should be used as a default in forms?");
        $ic229$ = SubLObjectFactory.makeString("NL Options");
        $ic230$ = SubLObjectFactory.makeString("NL Generation");
        $ic231$ = SubLObjectFactory.makeString("Which mt should be used for generating NL in the Cyc Browser?");
        $ic232$ = SubLObjectFactory.makeString("Default NL Generation Mt");
        $ic233$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("pph-mt"));
        $ic234$ = SubLObjectFactory.makeString("Lexification");
        $ic235$ = SubLObjectFactory.makeString("Reviewer");
        $ic236$ = SubLObjectFactory.makeString("lex-reviewer");
        $ic237$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Cyclist"));
        $ic238$ = SubLObjectFactory.makeString("Which Cyclist is to reviewer your lexical assertions? (Blank for none.)");
        $ic239$ = SubLObjectFactory.makeString("Default Microtheory");
        $ic240$ = SubLObjectFactory.makeString("lex-mt");
        $ic241$ = SubLObjectFactory.makeString("What microtheory should your lexical-semantic assertions go in?");
        $ic242$ = SubLObjectFactory.makeString("Default Syntactic Microtheory");
        $ic243$ = SubLObjectFactory.makeString("lex-syntactic-mt");
        $ic244$ = SubLObjectFactory.makeString("What microtheory should your syntactic assertions (e.g. #$singular) go in?");
        $ic245$ = SubLObjectFactory.makeString("Default Paraphrase Microtheory");
        $ic246$ = SubLObjectFactory.makeString("lex-pph-mt");
        $ic247$ = SubLObjectFactory.makeString("What microtheory should your paraphrase assertions go in?");
        $ic248$ = SubLObjectFactory.makeString("Default Parse Template Microtheory");
        $ic249$ = SubLObjectFactory.makeString("lex-parse-template-mt");
        $ic250$ = SubLObjectFactory.makeString("What microtheory should your parse template assertions go in?");
        $ic251$ = SubLObjectFactory.makeString("Query Tool");
        $ic252$ = SubLObjectFactory.makeString("Automatically Destroying Inferences");
        $ic253$ = SubLObjectFactory.makeString("destroy-inferences");
        $ic254$ = SubLObjectFactory.makeString("entry-destroy-inferences");
        $ic255$ = SubLObjectFactory.makeString("Keep only last ");
        $ic256$ = SubLObjectFactory.makeString("inferences (at most, defaults to 10 if empty)");
        $ic257$ = SubLObjectFactory.makeString("Keep all");
        $ic258$ = SubLObjectFactory.makeString("Default Query Mt");
        $ic259$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("default-query-mt"));
        $ic260$ = SubLObjectFactory.makeString("Closed Queries");
        $ic261$ = SubLObjectFactory.makeString("perform-argumentation-for-closed-query");
        $ic262$ = SubLObjectFactory.makeString("t");
        $ic263$ = SubLObjectFactory.makeString("Gather and weigh both pro and con arguments");
        $ic264$ = SubLObjectFactory.makeString("nil");
        $ic265$ = SubLObjectFactory.makeString("Attempt to prove only pro arguments");
        $ic266$ = SubLObjectFactory.makeKeyword("STRICT");
        $ic267$ = SubLObjectFactory.makeKeyword("ASSERTIVE");
        $ic268$ = SubLObjectFactory.makeSymbol("CB-OPTIONS-HANDLER");
        $ic269$ = SubLObjectFactory.makeString("Default NL Generation Mt: The input, ~A, was not understood.");
        $ic270$ = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $ic271$ = SubLObjectFactory.makeString("Default Query Mt: The input, ~A, was not understood.");
        $ic272$ = SubLObjectFactory.makeString("Preferences");
        $ic273$ = SubLObjectFactory.makeString("cb-options");
        $ic274$ = SubLObjectFactory.makeKeyword("OPTIONS");
        $ic275$ = SubLObjectFactory.makeSymbol("S#45332", "CYC");
        $ic276$ = SubLObjectFactory.makeString("Prefs");
        $ic277$ = SubLObjectFactory.makeString("Browser Preferences");
        $ic278$ = SubLObjectFactory.makeString("Your new settings require you to restart your browser.");
        $ic279$ = SubLObjectFactory.makeString("Click ");
        $ic280$ = SubLObjectFactory.makeKeyword("START");
        $ic281$ = SubLObjectFactory.makeString("here");
        $ic282$ = SubLObjectFactory.makeString(" now to do so.");
        $ic283$ = SubLObjectFactory.makeString("KB Browser Options have been modified");
        $ic284$ = SubLObjectFactory.makeString(" and saved");
        $ic285$ = SubLObjectFactory.makeString(".");
        $ic286$ = SubLObjectFactory.makeSymbol("CB-HISTORY");
        $ic287$ = SubLObjectFactory.makeKeyword("CB-HISTORY");
        $ic288$ = SubLObjectFactory.makeString("cb-history.html");
        $ic289$ = SubLObjectFactory.makeString("Recent History");
        $ic290$ = SubLObjectFactory.makeKeyword("CLEAR-HISTORY");
        $ic291$ = SubLObjectFactory.makeKeyword("HISTORY-HL-FORMULAS");
        $ic292$ = SubLObjectFactory.makeKeyword("HISTORY-EL-FORMULAS");
        $ic293$ = SubLObjectFactory.makeString("Recent Constants :");
        $ic294$ = SubLObjectFactory.makeKeyword("CLEAR-CONSTANT-HISTORY");
        $ic295$ = SubLObjectFactory.makeString(", ");
        $ic296$ = SubLObjectFactory.makeString("None");
        $ic297$ = SubLObjectFactory.makeString("Recent NATs :");
        $ic298$ = SubLObjectFactory.makeKeyword("CLEAR-NAT-HISTORY");
        $ic299$ = SubLObjectFactory.makeString("Recent Assertions :");
        $ic300$ = SubLObjectFactory.makeString("Recent Sentences :");
        $ic301$ = SubLObjectFactory.makeKeyword("CLEAR-SENTENCE-HISTORY");
        $ic302$ = SubLObjectFactory.makeKeyword("CLEAR-ASSERTION-HISTORY");
        $ic303$ = SubLObjectFactory.makeKeyword("HISTORY");
        $ic304$ = SubLObjectFactory.makeSymbol("S#43751", "CYC");
        $ic305$ = SubLObjectFactory.makeSymbol("S#43752", "CYC");
        $ic306$ = SubLObjectFactory.makeSymbol("S#43753", "CYC");
        $ic307$ = SubLObjectFactory.makeSymbol("S#43754", "CYC");
        $ic308$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic309$ = SubLObjectFactory.makeKeyword("HTML");
        $ic310$ = SubLObjectFactory.makeKeyword("NEW");
        $ic311$ = SubLObjectFactory.makeString("history-tool.gif");
        $ic312$ = SubLObjectFactory.makeString("History");
        $ic313$ = SubLObjectFactory.makeString("cb-history");
        $ic314$ = SubLObjectFactory.makeSymbol("S#45336", "CYC");
        $ic315$ = SubLObjectFactory.makeString("Hist");
        $ic316$ = SubLObjectFactory.makeString("Recent Browser History");
        $ic317$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45408", "CYC"));
        $ic318$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic319$ = SubLObjectFactory.makeKeyword("NAT");
        $ic320$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic321$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic322$ = SubLObjectFactory.makeKeyword("ALL");
        $ic323$ = SubLObjectFactory.makeSymbol("CB-CLEAR-HISTORY");
        $ic324$ = SubLObjectFactory.makeString("[Clear History]");
        $ic325$ = SubLObjectFactory.makeString("cb-clear-history&ALL");
        $ic326$ = SubLObjectFactory.makeSymbol("S#45337", "CYC");
        $ic327$ = SubLObjectFactory.makeString("[Clear Constant History]");
        $ic328$ = SubLObjectFactory.makeString("cb-clear-history&CONSTANT");
        $ic329$ = SubLObjectFactory.makeSymbol("S#45338", "CYC");
        $ic330$ = SubLObjectFactory.makeString("[Clear NAT History]");
        $ic331$ = SubLObjectFactory.makeString("cb-clear-history&NAT");
        $ic332$ = SubLObjectFactory.makeSymbol("S#45339", "CYC");
        $ic333$ = SubLObjectFactory.makeString("[Clear Assertion History]");
        $ic334$ = SubLObjectFactory.makeString("cb-clear-history&ASSERTION");
        $ic335$ = SubLObjectFactory.makeSymbol("S#45340", "CYC");
        $ic336$ = SubLObjectFactory.makeString("[Clear Sentence History]");
        $ic337$ = SubLObjectFactory.makeString("cb-clear-history&SENTENCE");
        $ic338$ = SubLObjectFactory.makeSymbol("S#45341", "CYC");
        $ic339$ = SubLObjectFactory.makeSymbol("CB-HISTORY-EL-FORMULAS");
        $ic340$ = SubLObjectFactory.makeString("[EL Formulas]");
        $ic341$ = SubLObjectFactory.makeString("cb-history-el-formulas");
        $ic342$ = SubLObjectFactory.makeSymbol("S#45342", "CYC");
        $ic343$ = SubLObjectFactory.makeSymbol("CB-HISTORY-HL-FORMULAS");
        $ic344$ = SubLObjectFactory.makeString("[HL Formulas]");
        $ic345$ = SubLObjectFactory.makeString("cb-history-hl-formulas");
        $ic346$ = SubLObjectFactory.makeSymbol("S#45343", "CYC");
        $ic347$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic348$ = SubLObjectFactory.makeString("Unable to add ~S to history");
        $ic349$ = SubLObjectFactory.makeInteger(50);
        $ic350$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic351$ = SubLObjectFactory.makeInteger(25);
        $ic352$ = SubLObjectFactory.makeSymbol("S#45347", "CYC");
        $ic353$ = SubLObjectFactory.makeSymbol("TREE-FIND");
        $ic354$ = SubLObjectFactory.makeSymbol("TERM-OF-UNIT");
        $ic355$ = SubLObjectFactory.makeSymbol("FIND");
        $ic356$ = SubLObjectFactory.makeSymbol("S#45358", "CYC");
        $ic357$ = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $ic358$ = SubLObjectFactory.makeSymbol("S#14098", "CYC");
        $ic359$ = SubLObjectFactory.makeInteger(80);
        $ic360$ = SubLObjectFactory.makeString("the SubLisp Interactor");
        $ic361$ = SubLObjectFactory.makeString("interactor");
        $ic362$ = SubLObjectFactory.makeString("SubL Interactor");
        $ic363$ = SubLObjectFactory.makeString("cb-handle-interactor");
        $ic364$ = SubLObjectFactory.makeString("document");
        $ic365$ = SubLObjectFactory.makeString("input-string");
        $ic366$ = SubLObjectFactory.makeSymbol("CB-HANDLE-INTERACTOR");
        $ic367$ = SubLObjectFactory.makeKeyword("CB-HANDLE-INTERACTOR");
        $ic368$ = SubLObjectFactory.makeString("cb-handle-interactor.html");
        $ic369$ = SubLObjectFactory.makeString("Eval");
        $ic370$ = SubLObjectFactory.makeString("Enter A Form :");
        $ic371$ = SubLObjectFactory.makeString("Reset");
        $ic372$ = SubLObjectFactory.makeString("Cyclify");
        $ic373$ = SubLObjectFactory.makeString("virtual");
        $ic374$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic375$ = SubLObjectFactory.makeKeyword("RED");
        $ic376$ = SubLObjectFactory.makeString("Malformed expression : ");
        $ic377$ = SubLObjectFactory.makeString("Last Form Evaluated : ");
        $ic378$ = SubLObjectFactory.makeString("Results : ");
        $ic379$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic380$ = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $ic381$ = SubLObjectFactory.makeString("ERROR : ");
        $ic382$ = SubLObjectFactory.makeString("Interactor");
        $ic383$ = SubLObjectFactory.makeKeyword("INTERACTOR");
        $ic384$ = SubLObjectFactory.makeSymbol("S#45366", "CYC");
        $ic385$ = SubLObjectFactory.makeString("SubL");
        $ic386$ = SubLObjectFactory.makeString("(");
        $ic387$ = SubLObjectFactory.makeString(" ");
        $ic388$ = SubLObjectFactory.makeString(")");
        $ic389$ = SubLObjectFactory.makeSymbol("FUNCTION");
        $ic390$ = SubLObjectFactory.makeString("#'");
        $ic391$ = SubLObjectFactory.makeString("'");
        $ic392$ = SubLObjectFactory.makeString(" . ");
        $ic393$ = SubLObjectFactory.makeSymbol("S#45393", "CYC");
        $ic394$ = SubLObjectFactory.makeString("pref");
        $ic395$ = SubLObjectFactory.makeString("preferences");
        $ic396$ = SubLObjectFactory.makeString("users");
        $ic397$ = SubLObjectFactory.makeString("Save Interface");
        $ic398$ = SubLObjectFactory.makeString("default");
        $ic399$ = SubLObjectFactory.makeString("Interface Settings Loaded Successfully.");
        $ic400$ = SubLObjectFactory.makeString("No Interface Settings File To Load.");
        $ic401$ = SubLObjectFactory.makeSymbol("CB-LOAD-USER-PREFERENCES");
        $ic402$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic403$ = SubLObjectFactory.makeInteger(70);
        $ic404$ = SubLObjectFactory.makeKeyword("CB-LOAD-API");
        $ic405$ = SubLObjectFactory.makeString("cb-load-api.html");
        $ic406$ = SubLObjectFactory.makeString("the KE Load Page");
        $ic407$ = SubLObjectFactory.makeString("Load API Expressions Page");
        $ic408$ = SubLObjectFactory.makeString("cb-load-api-handler");
        $ic409$ = SubLObjectFactory.makeString("Please type in the name of the file to load and evaluate in the space below and hit the ");
        $ic410$ = SubLObjectFactory.makeString("[Load File] ");
        $ic411$ = SubLObjectFactory.makeString("button.");
        $ic412$ = SubLObjectFactory.makeString("load-api-file-name");
        $ic413$ = SubLObjectFactory.makeString("Load File");
        $ic414$ = SubLObjectFactory.makeSymbol("CB-LOAD-API");
        $ic415$ = SubLObjectFactory.makeString("cb-load-api-handler called with no arguments");
        $ic416$ = SubLObjectFactory.makeString("Load API Expressions Results");
        $ic417$ = SubLObjectFactory.makeString("load-api-file-skip");
        $ic418$ = SubLObjectFactory.makeString("The file '");
        $ic419$ = SubLObjectFactory.makeString("' was loaded.  Here are the results:");
        $ic420$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic421$ = SubLObjectFactory.makeString("Successfully and completely loaded!");
        $ic422$ = SubLObjectFactory.makeString("File ~s does not exist!");
        $ic423$ = SubLObjectFactory.makeString("KE filename was not a string.");
        $ic424$ = SubLObjectFactory.makeSymbol("CB-LOAD-API-HANDLER");
        $ic425$ = SubLObjectFactory.makeKeyword("FILE-NOT-FOUND");
        $ic426$ = SubLObjectFactory.makeString("An error occurred after processing ");
        $ic427$ = SubLObjectFactory.makeString(" forms.");
        $ic428$ = SubLObjectFactory.makeString("Form Number");
        $ic429$ = SubLObjectFactory.makeString("You may continue processing this file.  Enter the number of the form to start (so you may skip the already processed forms or forms that have errors in them).");
        $ic430$ = SubLObjectFactory.makeString("KE File Name");
        $ic431$ = SubLObjectFactory.makeString("You may also specify a new file to load.  If you change this file, make sure to change the number of forms to skip (above) to 0 to start processing the new form from the beginning.");
        $ic432$ = SubLObjectFactory.makeKeyword("CB-SHOW-WHEN");
        $ic433$ = SubLObjectFactory.makeString("cb-show-when.html");
        $ic434$ = SubLObjectFactory.makeString("the Display by Date");
        $ic435$ = SubLObjectFactory.makeString("Display by Date");
        $ic436$ = SubLObjectFactory.makeString("cb-show-when-handler");
        $ic437$ = SubLObjectFactory.makeString("What kind of data do you want to display?");
        $ic438$ = SubLObjectFactory.makeString("cb-show-type");
        $ic439$ = SubLObjectFactory.makeString("Constants");
        $ic440$ = SubLObjectFactory.makeString("Assertions");
        $ic441$ = SubLObjectFactory.makeString("Enter in the start date:");
        $ic442$ = SubLObjectFactory.makeString("Month");
        $ic443$ = SubLObjectFactory.makeString("cb-show-start-month");
        $ic444$ = SubLObjectFactory.makeString("Day");
        $ic445$ = SubLObjectFactory.makeString("cb-show-start-day");
        $ic446$ = SubLObjectFactory.makeString("Year");
        $ic447$ = SubLObjectFactory.makeString("cb-show-start-year");
        $ic448$ = SubLObjectFactory.makeString("Enter in the ending date:");
        $ic449$ = SubLObjectFactory.makeString("cb-show-end-month");
        $ic450$ = SubLObjectFactory.makeString("cb-show-end-day");
        $ic451$ = SubLObjectFactory.makeString("cb-show-end-year");
        $ic452$ = SubLObjectFactory.makeString("Enter the cyclist to examine (blank indicates to examine ALL cyclists):");
        $ic453$ = SubLObjectFactory.makeString("cb-show-cyclist");
        $ic454$ = SubLObjectFactory.makeInteger(24);
        $ic455$ = SubLObjectFactory.makeString("Enter the project to examine (blank indicates to examine ALL projects):");
        $ic456$ = SubLObjectFactory.makeString("cb-show-project");
        $ic457$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Cyc-BasedProject"));
        $ic458$ = SubLObjectFactory.makeString("");
        $ic459$ = SubLObjectFactory.makeSymbol("CB-SHOW-WHEN");
        $ic460$ = SubLObjectFactory.makeKeyword("CB-SHOW-WHEN-HANDLER");
        $ic461$ = SubLObjectFactory.makeString("cb-show-when-handler.html");
        $ic462$ = SubLObjectFactory.makeString("Please specify either a Constant or an Assertion search.");
        $ic463$ = SubLObjectFactory.makeString("Unknown cyclist: ~S");
        $ic464$ = SubLObjectFactory.makeString("Unknown project: ~S");
        $ic465$ = SubLObjectFactory.makeString("Date Search Results");
        $ic466$ = SubLObjectFactory.makeString("Listing ");
        $ic467$ = SubLObjectFactory.makeString("constants");
        $ic468$ = SubLObjectFactory.makeString("assertions");
        $ic469$ = SubLObjectFactory.makeString(" created from ");
        $ic470$ = SubLObjectFactory.makeString(" to ");
        $ic471$ = SubLObjectFactory.makeString(" by ");
        $ic472$ = SubLObjectFactory.makeString(" for ");
        $ic473$ = SubLObjectFactory.makeSymbol("S#40536", "CYC");
        $ic474$ = SubLObjectFactory.makeSymbol("S#16777", "CYC");
        $ic475$ = SubLObjectFactory.makeSymbol("S#40537", "CYC");
        $ic476$ = SubLObjectFactory.makeSymbol("S#16780", "CYC");
        $ic477$ = SubLObjectFactory.makeSymbol("?CONSTANT");
        $ic478$ = SubLObjectFactory.makeSymbol("?ASSERTION");
        $ic479$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic480$ = SubLObjectFactory.makeSymbol("?TERM-LIST");
        $ic481$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic482$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic483$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EvaluateSubLFn"));
        $ic484$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubLQuoteFn"));
        $ic485$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("memberOfList"));
        $ic486$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM-LIST")));
        $ic487$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic488$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BROWSABLE?"), (SubLObject)module0677.T, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $ic489$ = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $ic490$ = SubLObjectFactory.makeString("Expected When Tool inference halt reason to be :EXHAUST-TOTAL, but it was ~s");
        $ic491$ = SubLObjectFactory.makeSymbol("CB-SHOW-WHEN-HANDLER");
        $ic492$ = SubLObjectFactory.makeString("None for the given time period.");
        $ic493$ = SubLObjectFactory.makeString("~a ~a.~%");
        $ic494$ = SubLObjectFactory.makeKeyword("SAVE-INFERENCE-ANSWERS");
        $ic495$ = SubLObjectFactory.makeString(" in ");
        $ic496$ = SubLObjectFactory.makeString("When");
        $ic497$ = SubLObjectFactory.makeString("cb-show-when");
        $ic498$ = SubLObjectFactory.makeKeyword("SHOW-WHEN");
        $ic499$ = SubLObjectFactory.makeSymbol("S#45379", "CYC");
        $ic500$ = SubLObjectFactory.makeString("Display assertions/constants by date");
        $ic501$ = SubLObjectFactory.makeKeyword("CB-INDEX-OVERLAP");
        $ic502$ = SubLObjectFactory.makeString("cb-index-overlap.html");
        $ic503$ = SubLObjectFactory.makeString("Index Overlap");
        $ic504$ = SubLObjectFactory.makeString("cb-handle-index-overlap");
        $ic505$ = SubLObjectFactory.makeString("Search");
        $ic506$ = SubLObjectFactory.makeString("Enter required terms separated by whitespace : ");
        $ic507$ = SubLObjectFactory.makeString("terms");
        $ic508$ = SubLObjectFactory.makeString("Enter terms to exclude separated by whitespace : ");
        $ic509$ = SubLObjectFactory.makeString("exclude-terms");
        $ic510$ = SubLObjectFactory.makeSymbol("CB-INDEX-OVERLAP");
        $ic511$ = SubLObjectFactory.makeKeyword("EOF");
        $ic512$ = SubLObjectFactory.makeString("Error reading terms.  Check for typos.");
        $ic513$ = SubLObjectFactory.makeString("Error reading terms to exclude.  Check for typos.");
        $ic514$ = SubLObjectFactory.makeString("Index Overlap Results");
        $ic515$ = SubLObjectFactory.makeString("Search Terms: ");
        $ic516$ = SubLObjectFactory.makeString("Please enter some valid search terms.");
        $ic517$ = SubLObjectFactory.makeString("Excluded Terms: ");
        $ic518$ = SubLObjectFactory.makeString("Please enter more than 1 search term.");
        $ic519$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic520$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic521$ = SubLObjectFactory.makeString("Index Overlap: (");
        $ic522$ = SubLObjectFactory.makeString(" assertions found)");
        $ic523$ = SubLObjectFactory.makeSymbol("CB-HANDLE-INDEX-OVERLAP");
        $ic524$ = SubLObjectFactory.makeString("Overlap");
        $ic525$ = SubLObjectFactory.makeString("cb-index-overlap");
        $ic526$ = SubLObjectFactory.makeKeyword("INDEX-OVERLAP");
        $ic527$ = SubLObjectFactory.makeSymbol("S#45380", "CYC");
        $ic528$ = SubLObjectFactory.makeString("Ovlp");
        $ic529$ = SubLObjectFactory.makeString("Term Index Overlap");
        $ic530$ = SubLObjectFactory.makeKeyword("COMPOSE");
        $ic531$ = SubLObjectFactory.makeString("compose-tool.gif");
        $ic532$ = SubLObjectFactory.makeString("Compose");
        $ic533$ = SubLObjectFactory.makeString("ke-compose");
        $ic534$ = SubLObjectFactory.makeSymbol("S#45381", "CYC");
        $ic535$ = SubLObjectFactory.makeString("Compose KE Text");
        $ic536$ = SubLObjectFactory.makeString("Comp");
        $ic537$ = SubLObjectFactory.makeString("Navigator");
        $ic538$ = SubLObjectFactory.makeString("cyc-navigator");
        $ic539$ = SubLObjectFactory.makeKeyword("NAVIGATOR");
        $ic540$ = SubLObjectFactory.makeSymbol("S#45382", "CYC");
        $ic541$ = SubLObjectFactory.makeString("Nav");
        $ic542$ = SubLObjectFactory.makeString("Cyc Navigator");
        $ic543$ = SubLObjectFactory.makeKeyword("DOC");
        $ic544$ = SubLObjectFactory.makeString("doc-tool.gif");
        $ic545$ = SubLObjectFactory.makeString("[Doc]");
        $ic546$ = SubLObjectFactory.makeString("Doc");
        $ic547$ = SubLObjectFactory.makeSymbol("S#45383", "CYC");
        $ic548$ = SubLObjectFactory.makeString("Cyc Documentation");
        $ic549$ = SubLObjectFactory.makeString("cb-start");
        $ic550$ = SubLObjectFactory.makeString("http://");
        $ic551$ = SubLObjectFactory.makeString(":");
        $ic552$ = SubLObjectFactory.makeInteger(3602);
        $ic553$ = SubLObjectFactory.makeString("/cyccgi");
        $ic554$ = SubLObjectFactory.makeString("/localhost");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0677.class
	Total time: 3312 ms
	
	Decompiled with Procyon 0.5.32.
*/