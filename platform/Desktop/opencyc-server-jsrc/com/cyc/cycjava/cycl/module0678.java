package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0678 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0678";
    public static final String myFingerPrint = "d6163fee67e7f4bae5c230813feb764cef3e71e741b7ceef4d5039e2ab303812";
    public static SubLSymbol $g5332$;
    private static SubLSymbol $g5333$;
    public static SubLSymbol $g5334$;
    public static SubLSymbol $g5335$;
    public static SubLSymbol $g5336$;
    public static SubLSymbol $g5337$;
    public static SubLSymbol $g5201$;
    private static SubLSymbol $g5338$;
    private static SubLSymbol $g5339$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLInteger $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLInteger $ic104$;
    private static final SubLList $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLList $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLList $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLInteger $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLString $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLString $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLInteger $ic213$;
    private static final SubLString $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLString $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLString $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLString $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLSymbol $ic239$;
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
    private static final SubLString $ic259$;
    private static final SubLString $ic260$;
    private static final SubLString $ic261$;
    private static final SubLString $ic262$;
    private static final SubLString $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLString $ic265$;
    private static final SubLString $ic266$;
    private static final SubLString $ic267$;
    private static final SubLString $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLString $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLString $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLString $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLString $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLString $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLString $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    private static final SubLString $ic303$;
    private static final SubLString $ic304$;
    private static final SubLString $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLObject $ic307$;
    private static final SubLObject $ic308$;
    private static final SubLString $ic309$;
    private static final SubLString $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLString $ic312$;
    private static final SubLString $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLObject $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLObject $ic318$;
    private static final SubLList $ic319$;
    private static final SubLList $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLString $ic322$;
    private static final SubLString $ic323$;
    private static final SubLString $ic324$;
    private static final SubLString $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLString $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLString $ic330$;
    private static final SubLString $ic331$;
    private static final SubLString $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLString $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLList $ic342$;
    private static final SubLString $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLString $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLString $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLString $ic355$;
    private static final SubLString $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLString $ic358$;
    private static final SubLObject $ic359$;
    private static final SubLInteger $ic360$;
    private static final SubLString $ic361$;
    private static final SubLString $ic362$;
    private static final SubLString $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLString $ic365$;
    private static final SubLString $ic366$;
    private static final SubLString $ic367$;
    private static final SubLList $ic368$;
    private static final SubLObject $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLString $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLString $ic373$;
    private static final SubLString $ic374$;
    private static final SubLString $ic375$;
    private static final SubLInteger $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLString $ic380$;
    private static final SubLString $ic381$;
    private static final SubLString $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLString $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLSymbol $ic386$;
    private static final SubLSymbol $ic387$;
    private static final SubLObject $ic388$;
    private static final SubLList $ic389$;
    private static final SubLObject $ic390$;
    private static final SubLString $ic391$;
    private static final SubLString $ic392$;
    private static final SubLString $ic393$;
    private static final SubLString $ic394$;
    private static final SubLString $ic395$;
    private static final SubLList $ic396$;
    private static final SubLString $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLSymbol $ic400$;
    private static final SubLString $ic401$;
    private static final SubLString $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLString $ic408$;
    private static final SubLSymbol $ic409$;
    private static final SubLString $ic410$;
    private static final SubLString $ic411$;
    private static final SubLString $ic412$;
    private static final SubLString $ic413$;
    private static final SubLString $ic414$;
    private static final SubLString $ic415$;
    private static final SubLString $ic416$;
    private static final SubLString $ic417$;
    private static final SubLString $ic418$;
    private static final SubLString $ic419$;
    private static final SubLString $ic420$;
    private static final SubLString $ic421$;
    private static final SubLList $ic422$;
    private static final SubLSymbol $ic423$;
    private static final SubLObject $ic424$;
    private static final SubLList $ic425$;
    private static final SubLObject $ic426$;
    private static final SubLList $ic427$;
    private static final SubLObject $ic428$;
    private static final SubLObject $ic429$;
    private static final SubLObject $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLList $ic432$;
    private static final SubLString $ic433$;
    private static final SubLString $ic434$;
    private static final SubLString $ic435$;
    private static final SubLString $ic436$;
    private static final SubLString $ic437$;
    private static final SubLString $ic438$;
    private static final SubLString $ic439$;
    private static final SubLObject $ic440$;
    private static final SubLList $ic441$;
    private static final SubLString $ic442$;
    private static final SubLSymbol $ic443$;
    private static final SubLString $ic444$;
    private static final SubLString $ic445$;
    private static final SubLString $ic446$;
    private static final SubLSymbol $ic447$;
    private static final SubLString $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLString $ic450$;
    private static final SubLString $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLString $ic453$;
    private static final SubLString $ic454$;
    private static final SubLString $ic455$;
    private static final SubLString $ic456$;
    private static final SubLString $ic457$;
    private static final SubLString $ic458$;
    private static final SubLString $ic459$;
    private static final SubLString $ic460$;
    private static final SubLString $ic461$;
    private static final SubLString $ic462$;
    private static final SubLString $ic463$;
    private static final SubLSymbol $ic464$;
    private static final SubLString $ic465$;
    private static final SubLString $ic466$;
    private static final SubLSymbol $ic467$;
    private static final SubLSymbol $ic468$;
    private static final SubLString $ic469$;
    private static final SubLString $ic470$;
    private static final SubLString $ic471$;
    private static final SubLString $ic472$;
    private static final SubLString $ic473$;
    private static final SubLString $ic474$;
    private static final SubLList $ic475$;
    private static final SubLSymbol $ic476$;
    private static final SubLSymbol $ic477$;
    private static final SubLString $ic478$;
    private static final SubLString $ic479$;
    private static final SubLString $ic480$;
    private static final SubLString $ic481$;
    private static final SubLString $ic482$;
    private static final SubLString $ic483$;
    private static final SubLSymbol $ic484$;
    private static final SubLString $ic485$;
    private static final SubLSymbol $ic486$;
    private static final SubLString $ic487$;
    private static final SubLString $ic488$;
    private static final SubLString $ic489$;
    private static final SubLString $ic490$;
    private static final SubLString $ic491$;
    private static final SubLString $ic492$;
    private static final SubLSymbol $ic493$;
    private static final SubLSymbol $ic494$;
    private static final SubLString $ic495$;
    private static final SubLString $ic496$;
    private static final SubLString $ic497$;
    private static final SubLString $ic498$;
    private static final SubLString $ic499$;
    private static final SubLString $ic500$;
    private static final SubLString $ic501$;
    private static final SubLString $ic502$;
    private static final SubLString $ic503$;
    private static final SubLSymbol $ic504$;
    private static final SubLString $ic505$;
    private static final SubLSymbol $ic506$;
    private static final SubLSymbol $ic507$;
    private static final SubLString $ic508$;
    private static final SubLString $ic509$;
    private static final SubLString $ic510$;
    private static final SubLSymbol $ic511$;
    private static final SubLString $ic512$;
    private static final SubLString $ic513$;
    private static final SubLString $ic514$;
    private static final SubLString $ic515$;
    private static final SubLString $ic516$;
    private static final SubLString $ic517$;
    private static final SubLString $ic518$;
    private static final SubLString $ic519$;
    private static final SubLString $ic520$;
    private static final SubLString $ic521$;
    private static final SubLSymbol $ic522$;
    private static final SubLString $ic523$;
    private static final SubLString $ic524$;
    private static final SubLSymbol $ic525$;
    private static final SubLSymbol $ic526$;
    private static final SubLString $ic527$;
    private static final SubLString $ic528$;
    private static final SubLString $ic529$;
    private static final SubLString $ic530$;
    private static final SubLString $ic531$;
    private static final SubLString $ic532$;
    private static final SubLString $ic533$;
    private static final SubLSymbol $ic534$;
    private static final SubLSymbol $ic535$;
    private static final SubLString $ic536$;
    private static final SubLString $ic537$;
    private static final SubLString $ic538$;
    private static final SubLString $ic539$;
    private static final SubLString $ic540$;
    private static final SubLString $ic541$;
    private static final SubLSymbol $ic542$;
    private static final SubLString $ic543$;
    private static final SubLSymbol $ic544$;
    private static final SubLSymbol $ic545$;
    private static final SubLSymbol $ic546$;
    private static final SubLString $ic547$;
    private static final SubLSymbol $ic548$;
    
    public static SubLObject f41402() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return PrintLow.format((SubLObject)module0678.NIL, (SubLObject)module0678.$ic0$, module0110.$g127$.getDynamicValue(var1));
    }
    
    public static SubLObject f41403(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0678.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0678.$ic4$);
            return (SubLObject)module0678.NIL;
        }
        module0574.f35206();
        module0660.f40193();
        final SubLObject var4 = (SubLObject)module0678.$ic5$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var4) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_6 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_7 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_8 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_8, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var7 = module0642.f39104((SubLObject)module0678.$ic17$, var2);
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var8 = module0642.f39042((SubLObject)module0678.$ic18$);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0678.NIL != var8) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39042(var8));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_9 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39019(var7);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_9, var3);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var9 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var9) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var9);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_10 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var10 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic20$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic2$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39073((SubLObject)module0678.$ic21$);
                        module0642.f39032((SubLObject)module0678.UNPROVIDED);
                        module0642.f39074((SubLObject)module0678.$ic22$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        if (module0678.NIL != module0575.f35244()) {
                            if (module0678.NIL != module0573.f35083()) {
                                module0573.f35107();
                            }
                            if (module0678.NIL != module0575.f35283()) {
                                module0642.f39019((SubLObject)module0678.$ic23$);
                                module0642.f39019((SubLObject)module0678.$ic24$);
                                module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                                f41404();
                            }
                            else {
                                f41405();
                            }
                        }
                        else {
                            f41406();
                        }
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        f41407();
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var11, var3);
                        module0015.$g541$.rebind(var10, var3);
                        module0015.$g533$.rebind(var4_10, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_7, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_6, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41405() {
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic26$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != module0574.f35120()) {
            module0642.f39072((SubLObject)module0678.$ic27$, (SubLObject)module0678.$ic28$, module0574.f35194(), (SubLObject)module0678.UNPROVIDED);
            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
            module0642.f39019((SubLObject)module0678.$ic29$);
        }
        else {
            f41408();
        }
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39072((SubLObject)module0678.$ic27$, (SubLObject)module0678.$ic30$, module0574.f35195(), (SubLObject)module0678.UNPROVIDED);
        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
        module0642.f39019((SubLObject)module0678.$ic31$);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39072((SubLObject)module0678.$ic27$, (SubLObject)module0678.$ic32$, module0574.f35196(), (SubLObject)module0678.UNPROVIDED);
        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
        module0642.f39019((SubLObject)module0678.$ic33$);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic34$);
        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
        f41409((SubLObject)module0678.$ic35$, (SubLObject)module0678.UNPROVIDED);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41408() {
        module0642.f39019((SubLObject)module0678.$ic36$);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic37$);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41404() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39019((SubLObject)module0678.$ic38$);
        final SubLObject var2 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0575.f35277());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic41$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic42$);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            if (module0678.NIL != module0574.f35120()) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_17 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_18 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var1);
                        module0642.f39072((SubLObject)module0678.$ic30$, (SubLObject)module0678.$ic43$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_18, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_19 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var1);
                        module0642.f39019((SubLObject)module0678.$ic44$);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_19, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_17, var1);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            else {
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_20 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_20, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_21 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    f41408();
                }
                finally {
                    module0015.$g533$.rebind(var4_21, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_22 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_23 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39072((SubLObject)module0678.$ic30$, (SubLObject)module0678.$ic45$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_23, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_24 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic46$);
                }
                finally {
                    module0015.$g533$.rebind(var4_24, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_22, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g217$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic47$);
        module0642.f39020(module0015.$g218$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic48$);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41406() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic49$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        final SubLObject var2 = (SubLObject)module0678.$ic18$;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0678.NIL != var2) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0642.f39042(var2));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0575.f35243());
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic50$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41407() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic51$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_25 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic52$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_26 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39072((SubLObject)module0678.$ic54$, (SubLObject)module0678.$ic55$, (SubLObject)SubLObjectFactory.makeBoolean(module0678.NIL == module0574.f35197()), (SubLObject)module0678.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_26, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic56$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_27 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic57$);
                }
                finally {
                    module0015.$g533$.rebind(var4_27, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_28 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_28, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_25, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_29 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic52$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_30 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39072((SubLObject)module0678.$ic54$, (SubLObject)module0678.$ic58$, module0574.f35197(), (SubLObject)module0678.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_30, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic56$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_31 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic59$);
                }
                finally {
                    module0015.$g533$.rebind(var4_31, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_32 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_32, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_29, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_33 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_34 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_34, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_35 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39068((SubLObject)module0678.$ic60$, (SubLObject)module0678.T, module0173.f10955(module0574.f35225()), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39019((SubLObject)module0678.$ic61$);
                    module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                    f41409((SubLObject)module0678.$ic62$, (SubLObject)module0678.$ic63$);
                }
                finally {
                    module0015.$g533$.rebind(var4_35, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_33, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var2, var1);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        f41410();
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41409(final SubLObject var36, SubLObject var37) {
        if (var37 == module0678.UNPROVIDED) {
            var37 = (SubLObject)module0678.NIL;
        }
        module0656.f39982(var36, module0259.f16848(module0678.$g5333$.getGlobalValue(), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), (SubLObject)((module0678.NIL != var37) ? module0574.f35225() : module0678.NIL), (SubLObject)module0678.ONE_INTEGER, Symbols.symbol_function((SubLObject)module0678.IDENTITY), (SubLObject)module0678.T, (SubLObject)module0678.$ic32$);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41411() {
        return module0678.$g5334$.getGlobalValue();
    }
    
    public static SubLObject f41412(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)module0678.$ic27$, var2);
        final SubLObject var4 = module0642.f39104((SubLObject)module0678.$ic30$, var2);
        final SubLObject var5 = module0642.f39104((SubLObject)module0678.$ic54$, var2);
        final SubLObject var6 = module0642.f39104((SubLObject)module0678.$ic67$, var2);
        final SubLObject var7 = module0656.f39983((SubLObject)module0678.$ic35$, var2);
        final SubLObject var8 = module0642.f39104((SubLObject)module0678.$ic60$, var2);
        if (module0678.NIL != var4) {
            if (var4.equal((SubLObject)module0678.$ic43$)) {
                if (module0678.NIL != f41411()) {
                    f41413(var2);
                }
                else {
                    module0574.f35203();
                }
            }
            else if (var4.equal((SubLObject)module0678.$ic45$)) {
                module0574.f35202();
            }
        }
        if (module0678.NIL == module0656.f39984(var7)) {
            module0574.f35229(var7);
        }
        if (module0678.NIL != var3 && !var3.equal(module0574.f35186((SubLObject)module0678.UNPROVIDED))) {
            module0574.f35183(var3);
        }
        if (module0678.NIL != var5 && !var5.equal(module0574.f35184((SubLObject)module0678.UNPROVIDED))) {
            module0574.f35185(var5);
        }
        if (module0678.NIL != module0574.f35197()) {
            if (module0678.NIL != var8) {
                module0574.f35226(module0656.f39983((SubLObject)module0678.$ic62$, var2));
            }
        }
        else {
            module0574.f35227();
        }
        f41403((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41414() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic69$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39019((SubLObject)module0678.$ic70$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41413(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39104((SubLObject)module0678.$ic30$, var2);
        final SubLObject var5 = module0642.f39104((SubLObject)module0678.$ic78$, var2);
        final SubLObject var6 = Equality.equalp(module0642.f39104((SubLObject)module0678.$ic30$, var2), (SubLObject)module0678.$ic79$);
        final SubLObject var7 = (SubLObject)module0678.$ic80$;
        var3.resetMultipleValues();
        final SubLObject var8 = f41415(var5, module0572.f35035(), var7, var6);
        final SubLObject var9 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var10 = (SubLObject)module0678.$ic81$;
        final SubLObject var11 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var12 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var10) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var10);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_49 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_50 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_51 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_51, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var10) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var10);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var13 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var13) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var13);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_52 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var14 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var15 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic82$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39069((SubLObject)module0678.$ic30$, var4, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39069((SubLObject)module0678.$ic78$, var5, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var53_54 = (SubLObject)module0678.NIL;
                        module0642.f39020(module0015.$g381$.getGlobalValue());
                        module0642.f39020(module0015.$g383$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0655.f39768();
                        module0642.f39019((SubLObject)module0678.$ic40$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        if (module0678.NIL != var53_54) {
                            module0642.f39020(module0015.$g387$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(var53_54);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic83$);
                        module0655.f39768();
                        module0642.f39019((SubLObject)module0678.$ic40$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic84$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic86$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic87$, (SubLObject)module0678.$ic74$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic88$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_53 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019(module0075.f5226(module0572.f35035()));
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_53, var3);
                        }
                        module0642.f39020(module0015.$g382$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic89$);
                        module0656.f39870((SubLObject)module0678.$ic76$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic90$);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39075((SubLObject)module0678.$ic91$, module0678.$g5335$.getGlobalValue(), (SubLObject)module0678.$ic92$);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic93$);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39075((SubLObject)module0678.$ic94$, f41416(), (SubLObject)module0678.$ic92$);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic95$);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic17$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic96$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.TWENTY_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g350$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic97$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_54 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39019(var8);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_54, var3);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        if (var4.equal((SubLObject)module0678.$ic43$)) {
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g316$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020((SubLObject)module0678.$ic98$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39019((SubLObject)module0678.$ic99$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            if (module0678.NIL == var9) {
                                module0642.f39019((SubLObject)module0678.$ic100$);
                                module0642.f39074((SubLObject)module0678.$ic101$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            }
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var15, var3);
                        module0015.$g541$.rebind(var14, var3);
                        module0015.$g533$.rebind(var4_52, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_50, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_49, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var11, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41416() {
        return Sequences.cconcatenate((SubLObject)module0678.$ic102$, new SubLObject[] { module0006.f203(module0574.f35164()), module0678.$ic103$ });
    }
    
    public static SubLObject f41415(SubLObject var57, SubLObject var58, SubLObject var46, SubLObject var59) {
        if (var57 == module0678.UNPROVIDED) {
            var57 = (SubLObject)module0678.NIL;
        }
        if (var58 == module0678.UNPROVIDED) {
            var58 = module0572.f35035();
        }
        if (var46 == module0678.UNPROVIDED) {
            var46 = (SubLObject)module0678.$ic80$;
        }
        if (var59 == module0678.UNPROVIDED) {
            var59 = (SubLObject)module0678.NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        SubLObject var61 = (SubLObject)module0678.NIL;
        SubLObject var62 = (SubLObject)module0678.NIL;
        final SubLObject var63 = (SubLObject)module0678.$ic104$;
        final SubLObject var64 = module0012.$silent_progressP$.currentBinding(var60);
        try {
            module0012.$silent_progressP$.bind((SubLObject)module0678.T, var60);
            final SubLObject var65 = module0572.f35063(var58);
            SubLObject var67;
            final SubLObject var66 = var67 = var65;
            SubLObject var68 = (SubLObject)module0678.NIL;
            SubLObject var69 = (SubLObject)module0678.NIL;
            SubLObject var70 = (SubLObject)module0678.NIL;
            SubLObject var71 = (SubLObject)module0678.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0678.$ic105$);
            var68 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0678.$ic105$);
            var69 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0678.$ic105$);
            var70 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)module0678.$ic105$);
            var71 = var67.first();
            var67 = var67.rest();
            if (module0678.NIL == var67) {
                var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0678.NIL != var71 || module0678.NIL != var70 || module0678.NIL != var69);
                SubLObject var72 = (SubLObject)module0678.NIL;
                try {
                    var72 = streams_high.make_private_string_output_stream();
                    PrintLow.format(var72, (SubLObject)module0678.$ic106$, (SubLObject)((module0678.NIL != var59) ? module0678.$ic107$ : module0678.$ic108$));
                    PrintLow.format(var72, (SubLObject)module0678.$ic109$, module0574.f35164());
                    PrintLow.format(var72, (SubLObject)module0678.$ic110$);
                    if (module0678.NIL != module0038.f2653(var57)) {
                        PrintLow.format(var72, (SubLObject)module0678.$ic111$, var57);
                    }
                    PrintLow.format(var72, (SubLObject)module0678.$ic112$, module0572.f35037(module0075.f5226(var58), var46));
                    PrintLow.format(var72, (SubLObject)module0678.$ic113$, var68);
                    if (module0678.NIL != var71) {
                        PrintLow.format(var72, (SubLObject)module0678.$ic114$);
                        SubLObject var73 = (SubLObject)module0678.NIL;
                        SubLObject var74 = (SubLObject)module0678.NIL;
                        SubLObject var75 = (SubLObject)module0678.NIL;
                        SubLObject var76 = (SubLObject)module0678.NIL;
                        var74 = var71;
                        var75 = var74.first();
                        for (var76 = (SubLObject)module0678.ZERO_INTEGER; module0678.NIL == var73 && module0678.NIL != var74; var74 = var74.rest(), var75 = var74.first(), var76 = Numbers.add((SubLObject)module0678.ONE_INTEGER, var76)) {
                            SubLObject var76_77;
                            final SubLObject var74_75 = var76_77 = var75;
                            SubLObject var77 = (SubLObject)module0678.NIL;
                            SubLObject var78 = (SubLObject)module0678.NIL;
                            SubLObject var79 = (SubLObject)module0678.NIL;
                            SubLObject var80 = (SubLObject)module0678.NIL;
                            SubLObject var81 = (SubLObject)module0678.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)module0678.$ic115$);
                            var77 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)module0678.$ic115$);
                            var78 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)module0678.$ic115$);
                            var79 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)module0678.$ic115$);
                            var80 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)module0678.$ic115$);
                            var81 = var76_77.first();
                            var76_77 = var76_77.rest();
                            if (module0678.NIL == var76_77) {
                                PrintLow.format(var72, (SubLObject)module0678.$ic116$, var79);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var74_75, (SubLObject)module0678.$ic115$);
                            }
                            if (var76.numG(var63)) {
                                var73 = (SubLObject)module0678.T;
                                PrintLow.format(var72, (SubLObject)module0678.$ic117$, Numbers.subtract(Sequences.length(var71), var76));
                            }
                        }
                    }
                    if (module0678.NIL != var70) {
                        PrintLow.format(var72, (SubLObject)module0678.$ic118$);
                        SubLObject var73 = (SubLObject)module0678.NIL;
                        SubLObject var74 = (SubLObject)module0678.NIL;
                        SubLObject var75 = (SubLObject)module0678.NIL;
                        SubLObject var76 = (SubLObject)module0678.NIL;
                        var74 = var70;
                        var75 = var74.first();
                        for (var76 = (SubLObject)module0678.ZERO_INTEGER; module0678.NIL == var73 && module0678.NIL != var74; var74 = var74.rest(), var75 = var74.first(), var76 = Numbers.add((SubLObject)module0678.ONE_INTEGER, var76)) {
                            SubLObject var85_86;
                            final SubLObject var83_84 = var85_86 = var75;
                            SubLObject var77 = (SubLObject)module0678.NIL;
                            SubLObject var78 = (SubLObject)module0678.NIL;
                            SubLObject var82 = (SubLObject)module0678.NIL;
                            SubLObject var83 = (SubLObject)module0678.NIL;
                            SubLObject var84 = (SubLObject)module0678.NIL;
                            SubLObject var85 = (SubLObject)module0678.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0678.$ic119$);
                            var77 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0678.$ic119$);
                            var78 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0678.$ic119$);
                            var82 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0678.$ic119$);
                            var83 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0678.$ic119$);
                            var84 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)module0678.$ic119$);
                            var85 = var85_86.first();
                            var85_86 = var85_86.rest();
                            if (module0678.NIL == var85_86) {
                                PrintLow.format(var72, (SubLObject)module0678.$ic120$, var82, var83);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var83_84, (SubLObject)module0678.$ic119$);
                            }
                            if (var76.numG(var63)) {
                                var73 = (SubLObject)module0678.T;
                                PrintLow.format(var72, (SubLObject)module0678.$ic117$, Numbers.subtract(Sequences.length(var70), var76));
                            }
                        }
                    }
                    var69 = Sequences.nreverse(var69);
                    if (module0678.NIL != var69) {
                        PrintLow.format(var72, (SubLObject)module0678.$ic121$);
                        SubLObject var86 = var69;
                        SubLObject var87 = (SubLObject)module0678.NIL;
                        var87 = var86.first();
                        while (module0678.NIL != var86) {
                            SubLObject var92_93;
                            final SubLObject var90_91 = var92_93 = var87;
                            SubLObject var88 = (SubLObject)module0678.NIL;
                            SubLObject var89 = (SubLObject)module0678.NIL;
                            SubLObject var90 = (SubLObject)module0678.NIL;
                            SubLObject var91 = (SubLObject)module0678.NIL;
                            SubLObject var92 = (SubLObject)module0678.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)module0678.$ic115$);
                            var88 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)module0678.$ic115$);
                            var89 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)module0678.$ic115$);
                            var90 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)module0678.$ic115$);
                            var91 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)module0678.$ic115$);
                            var92 = var92_93.first();
                            var92_93 = var92_93.rest();
                            if (module0678.NIL == var92_93) {
                                PrintLow.format(var72, (SubLObject)module0678.$ic116$, var90);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var90_91, (SubLObject)module0678.$ic115$);
                            }
                            var86 = var86.rest();
                            var87 = var86.first();
                        }
                    }
                    var61 = streams_high.get_output_stream_string(var72);
                }
                finally {
                    final SubLObject var4_94 = Threads.$is_thread_performing_cleanupP$.currentBinding(var60);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0678.T, var60);
                        streams_high.close(var72, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_94, var60);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)module0678.$ic105$);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var64, var60);
        }
        return Values.values(var61, var62);
    }
    
    public static SubLObject f41417(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)module0678.$ic94$, var2);
        final SubLObject var4 = module0642.f39111((SubLObject)module0678.$ic17$, var2, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var5 = module0642.f39104((SubLObject)module0678.$ic30$, var2);
        final SubLObject var6 = module0642.f39104((SubLObject)module0678.$ic98$, var2);
        final SubLObject var7 = (SubLObject)((module0678.NIL != var6) ? module0642.f39104((SubLObject)module0678.$ic91$, var2) : module0678.NIL);
        final SubLObject var8 = module0226.f15165(module0574.f35152());
        SubLObject var9 = (SubLObject)module0678.NIL;
        var9 = f41418(module0572.f35035(), var5, var4, var3, var8, var7);
        f41403(var9);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41418(final SubLObject var100, final SubLObject var101, SubLObject var9, final SubLObject var102, SubLObject var103, SubLObject var104) {
        if (var103 == module0678.UNPROVIDED) {
            var103 = module0226.f15165(module0574.f35152());
        }
        if (var104 == module0678.UNPROVIDED) {
            var104 = module0678.$g5335$.getGlobalValue();
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var106 = (SubLObject)module0678.NIL;
        SubLObject var107 = (SubLObject)module0678.NIL;
        SubLObject var108 = (SubLObject)module0678.NIL;
        SubLObject var109 = Sequences.cconcatenate((SubLObject)module0678.$ic123$, new SubLObject[] { module0006.f205(var103), module0678.$ic124$, module0006.f205(var104), module0678.$ic125$ });
        if (module0678.NIL != module0038.f2653(var104) && module0678.NIL != module0038.f2653(var103)) {
            var107 = f41419(var100);
            var9 = Sequences.cconcatenate(var9, var107);
            var105.resetMultipleValues();
            final SubLObject var109_110 = module0046.f3173(var103, var104, var9, var102, module0678.$g5336$.getGlobalValue(), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var111_112 = var105.secondMultipleValue();
            var105.resetMultipleValues();
            var108 = var109_110;
            var109 = var111_112;
        }
        if (var101.equal((SubLObject)module0678.$ic43$)) {
            module0574.f35203();
        }
        if (module0678.NIL == var108) {
            final SubLObject var110 = (SubLObject)(var101.equal((SubLObject)module0678.$ic43$) ? module0678.$ic126$ : module0678.$ic127$);
            final SubLObject var9_114 = (module0678.NIL == var104) ? Sequences.cconcatenate((SubLObject)module0678.$ic128$, new SubLObject[] { var110, module0678.$ic129$ }) : Sequences.cconcatenate((SubLObject)module0678.$ic128$, new SubLObject[] { var110, module0678.$ic130$, var109 });
            var106 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0678.$ic17$, var9_114));
        }
        return var106;
    }
    
    public static SubLObject f41419(SubLObject var58) {
        if (var58 == module0678.UNPROVIDED) {
            var58 = module0572.f35035();
        }
        SubLObject var59 = (SubLObject)module0678.NIL;
        final SubLObject var60 = (SubLObject)module0678.$ic131$;
        SubLObject var61 = (SubLObject)module0678.NIL;
        try {
            var61 = streams_high.make_private_string_output_stream();
            PrintLow.format(var61, (SubLObject)module0678.$ic132$);
            PrintLow.format(var61, (SubLObject)module0678.$ic133$);
            SubLObject var62 = (SubLObject)module0678.NIL;
            final SubLObject var63 = module0572.f35077(var58);
            SubLObject var64 = (SubLObject)module0678.NIL;
            SubLObject var65 = (SubLObject)module0678.NIL;
            SubLObject var66 = (SubLObject)module0678.NIL;
            var64 = var63;
            var65 = var64.first();
            for (var66 = (SubLObject)module0678.ZERO_INTEGER; module0678.NIL == var62 && module0678.NIL != var64; var64 = var64.rest(), var65 = var64.first(), var66 = Numbers.add((SubLObject)module0678.ONE_INTEGER, var66)) {
                PrintLow.format(var61, (SubLObject)module0678.$ic116$, var65);
                if (var66.numG(var60)) {
                    var62 = (SubLObject)module0678.T;
                    PrintLow.format(var61, (SubLObject)module0678.$ic134$, Numbers.subtract(Sequences.length(var63), var66));
                }
            }
            var59 = streams_high.get_output_stream_string(var61);
        }
        finally {
            final SubLObject var67 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0678.T);
                streams_high.close(var61, (SubLObject)module0678.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var67);
            }
        }
        return var59;
    }
    
    public static SubLObject f41420(SubLObject var118) {
        if (var118 == module0678.UNPROVIDED) {
            var118 = (SubLObject)module0678.NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        final SubLObject var120 = module0018.f971();
        final SubLObject var121 = module0048.f_1X(var120);
        if (module0678.NIL == var118) {
            var118 = Sequences.cconcatenate((SubLObject)module0678.$ic135$, new SubLObject[] { module0006.f205(var121), module0678.$ic136$ });
        }
        final SubLObject var122 = module0656.f39832((SubLObject)module0678.$ic137$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic138$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var122) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var122);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var123 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var123, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41421(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0678.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0678.$ic143$);
            return (SubLObject)module0678.NIL;
        }
        final SubLObject var4 = module0018.f971();
        final SubLObject var5 = module0048.f_1X(var4);
        final SubLObject var7;
        final SubLObject var6 = var7 = Sequences.cconcatenate((SubLObject)module0678.$ic144$, module0006.f203(var5));
        final SubLObject var8 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var9 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var9) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var7) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var7);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_122 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_123 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_124 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_124, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var7);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var10 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var10) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var10);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_125 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic145$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic141$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var13 = (SubLObject)module0678.$ic18$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0678.NIL != var13) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39042(var13));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_126 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39020(module0015.$g207$.getGlobalValue());
                            module0642.f39021((SubLObject)module0678.$ic146$);
                            module0642.f39020(module0015.$g208$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_126, var3);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic147$);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic148$, var5);
                        module0642.f39032((SubLObject)module0678.FOUR_INTEGER);
                        module0642.f39074((SubLObject)module0678.$ic59$, (SubLObject)module0678.$ic58$, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39074((SubLObject)module0678.$ic57$, (SubLObject)module0678.$ic55$, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var3);
                        module0015.$g541$.rebind(var11, var3);
                        module0015.$g533$.rebind(var4_125, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_123, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_122, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var8, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41422(final SubLObject var2) {
        if (module0678.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0678.$ic143$);
            return (SubLObject)module0678.NIL;
        }
        final SubLObject var3 = module0642.f39104((SubLObject)module0678.$ic58$, var2);
        if (module0678.NIL == var3) {
            return f41403((SubLObject)module0678.UNPROVIDED);
        }
        final SubLObject var4 = module0018.f971();
        final SubLObject var5 = module0048.f_1X(var4);
        module0574.f35211(var4, var5);
        return f41403((SubLObject)module0678.UNPROVIDED);
    }
    
    public static SubLObject f41423() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (module0678.NIL != module0018.$g678$.getGlobalValue()) {
            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic152$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            final SubLObject var2 = module0015.$g537$.currentBinding(var1);
            try {
                module0015.$g537$.bind((SubLObject)module0678.T, var1);
                module0642.f39034(module0018.$g678$.getGlobalValue(), (SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g537$.rebind(var2, var1);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
            SubLObject var3 = module0018.$g679$.getGlobalValue();
            SubLObject var4 = (SubLObject)module0678.NIL;
            var4 = var3.first();
            while (module0678.NIL != var3) {
                if (!var4.eql(module0018.$g679$.getGlobalValue().first())) {
                    module0642.f39026((SubLObject)module0678.UNPROVIDED);
                }
                if (module0678.NIL != assertion_handles_oc.f11035(var4)) {
                    module0656.f39916(var4, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                }
                else {
                    module0656.f39804(var4, (SubLObject)module0678.ZERO_INTEGER, (SubLObject)module0678.T);
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41424(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0678.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0678.$ic155$);
            return (SubLObject)module0678.NIL;
        }
        final SubLObject var4 = (SubLObject)module0678.$ic156$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var4) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_129 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_130 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_131 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_131, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_132 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic157$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic153$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic158$);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic159$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        if (module0678.NIL != module0593.f36267()) {
                            module0642.f39019((SubLObject)module0678.$ic160$);
                        }
                        else {
                            module0642.f39019((SubLObject)module0678.$ic161$);
                        }
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic162$);
                        if (module0678.NIL != module0018.$g677$.getGlobalValue() && (module0678.NIL != module0593.f36267() || module0678.$ic163$ == module0593.f36290())) {
                            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                            final SubLObject var10 = module0593.f36286();
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            if (module0593.f36286().equalp((SubLObject)module0678.$ic164$)) {
                                module0642.f39019((SubLObject)module0678.$ic165$);
                            }
                            else {
                                module0642.f39019((SubLObject)module0678.$ic166$);
                            }
                            module0642.f39019((SubLObject)module0678.$ic167$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            if (var10.equalp((SubLObject)module0678.$ic164$)) {
                                module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                                module0642.f39074((SubLObject)module0678.$ic168$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            }
                            module0642.f39026((SubLObject)module0678.UNPROVIDED);
                            module0656.f39804(f41425(module0593.f36270()), (SubLObject)module0678.ZERO_INTEGER, (SubLObject)module0678.T);
                        }
                        if (module0678.NIL == module0593.f36267() && module0678.$ic163$ == module0593.f36290()) {
                            f41423();
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_132, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    f41426();
                    f41427();
                    if (module0678.NIL == module0575.f35244()) {
                        f41428();
                    }
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_130, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_129, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41429() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic170$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39019((SubLObject)module0678.$ic171$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41430(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        if (module0678.NIL == module0593.f36267()) {
            return module0656.f39789((SubLObject)module0678.$ic174$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        }
        module0593.f36283();
        module0593.f36282((SubLObject)module0678.THREE_INTEGER);
        f41424((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41426() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)module0678.NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic19$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var2) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        final SubLObject var4 = module0015.$g541$.currentBinding(var1);
        final SubLObject var5 = module0015.$g539$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0015.$g541$.bind((SubLObject)module0678.T, var1);
            module0015.$g539$.bind(module0015.f797(), var1);
            module0642.f39069((SubLObject)module0678.$ic176$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
            module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic177$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != module0593.f36267()) {
                module0642.f39074((SubLObject)module0678.$ic178$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            }
            else {
                module0642.f39074((SubLObject)module0678.$ic179$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic180$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var1), (SubLObject)module0678.$ic181$, f41402(), module0678.$g5337$.getDynamicValue(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_134 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39019((SubLObject)module0678.$ic182$);
            }
            finally {
                module0015.$g533$.rebind(var4_134, var1);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic162$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0015.f799(module0015.$g539$.getDynamicValue(var1));
        }
        finally {
            module0015.$g539$.rebind(var5, var1);
            module0015.$g541$.rebind(var4, var1);
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41431(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0593.f36267();
        module0642.f39020((SubLObject)module0678.$ic6$);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
        final SubLObject var5 = module0014.f672((SubLObject)module0678.$ic7$);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var5) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var5);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic183$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0660.f40193();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        final SubLObject var6 = module0015.$g132$.getDynamicValue(var3);
        final SubLObject var7 = module0015.$g535$.currentBinding(var3);
        try {
            module0015.$g535$.bind((SubLObject)module0678.T, var3);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39042(var6));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_137 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_138 = module0015.$g533$.currentBinding(var3);
                final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0015.$g541$.bind((SubLObject)module0678.T, var3);
                    module0015.$g539$.bind(module0015.f797(), var3);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39019((SubLObject)module0678.$ic183$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var4) {
                        module0642.f39019((SubLObject)module0678.$ic184$);
                    }
                    else {
                        module0642.f39019((SubLObject)module0678.$ic185$);
                    }
                    module0642.f39011();
                    if (module0678.NIL != var4) {
                        module0593.f36279((SubLObject)module0678.TWO_INTEGER);
                    }
                    else {
                        module0593.f36268((SubLObject)module0678.TWO_INTEGER);
                    }
                    if (module0678.NIL != var4) {
                        module0593.f36282((SubLObject)module0678.THREE_INTEGER);
                    }
                    else {
                        module0593.f36280((SubLObject)module0678.THREE_INTEGER);
                    }
                    module0642.f39026((SubLObject)module0678.UNPROVIDED);
                    final SubLObject var10 = module0593.f36267();
                    if (!var4.equalp(var10)) {
                        module0642.f39019((SubLObject)module0678.$ic186$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        if (module0678.NIL != var10) {
                            module0642.f39019((SubLObject)module0678.$ic160$);
                        }
                        else {
                            module0642.f39019((SubLObject)module0678.$ic161$);
                        }
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0642.f39019((SubLObject)module0678.$ic187$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        if (module0678.NIL != var10) {
                            module0642.f39019((SubLObject)module0678.$ic160$);
                        }
                        else {
                            module0642.f39019((SubLObject)module0678.$ic161$);
                        }
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic188$);
                    }
                    module0656.f39794((SubLObject)module0678.$ic189$);
                    module0015.f799(module0015.$g539$.getDynamicValue(var3));
                }
                finally {
                    module0015.$g539$.rebind(var9, var3);
                    module0015.$g541$.rebind(var8, var3);
                    module0015.$g533$.rebind(var4_138, var3);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_137, var3);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var7, var3);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41427() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0593.f36290();
        final SubLObject var3 = module0656.f39832((SubLObject)module0678.NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic19$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var3) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        final SubLObject var5 = module0015.$g541$.currentBinding(var1);
        final SubLObject var6 = module0015.$g539$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0015.$g541$.bind((SubLObject)module0678.T, var1);
            module0015.$g539$.bind(module0015.f797(), var1);
            module0642.f39069((SubLObject)module0678.$ic191$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
            module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            module0642.f39019((SubLObject)module0678.$ic192$);
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39032((SubLObject)module0678.SEVEN_INTEGER);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            final SubLObject var7 = var2;
            if (var7.eql((SubLObject)module0678.$ic193$)) {
                module0642.f39019((SubLObject)module0678.$ic194$);
            }
            else if (var7.eql((SubLObject)module0678.$ic163$)) {
                module0642.f39019((SubLObject)module0678.$ic195$);
            }
            else if (var7.eql((SubLObject)module0678.$ic196$)) {
                module0642.f39019((SubLObject)module0678.$ic197$);
            }
            else if (var7.eql((SubLObject)module0678.$ic198$)) {
                module0642.f39019(PrintLow.format((SubLObject)module0678.NIL, (SubLObject)module0678.$ic199$));
                module0642.f39067();
                module0642.f39032((SubLObject)module0678.SEVEN_INTEGER);
                module0656.f39837((SubLObject)module0678.$ic200$, module0075.f5225(module0593.f36294()), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            }
            else {
                module0656.f39789((SubLObject)module0678.$ic201$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
            module0642.f39019((SubLObject)module0678.$ic202$);
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic203$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic204$);
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39072((SubLObject)module0678.$ic205$, (SubLObject)module0678.$ic206$, Equality.eq(var2, (SubLObject)module0678.$ic193$), (SubLObject)module0678.UNPROVIDED);
            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
            module0642.f39019((SubLObject)module0678.$ic207$);
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39072((SubLObject)module0678.$ic205$, (SubLObject)module0678.$ic208$, Equality.eq(var2, (SubLObject)module0678.$ic163$), (SubLObject)module0678.UNPROVIDED);
            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
            module0642.f39019((SubLObject)module0678.$ic209$);
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39072((SubLObject)module0678.$ic205$, (SubLObject)module0678.$ic210$, Equality.eq(var2, (SubLObject)module0678.$ic198$), (SubLObject)module0678.UNPROVIDED);
            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
            module0642.f39019((SubLObject)module0678.$ic211$);
            module0642.f39032((SubLObject)module0678.EIGHT_INTEGER);
            module0642.f39139((SubLObject)module0678.$ic212$, module0593.f36294(), (SubLObject)module0678.$ic213$);
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39073((SubLObject)module0678.$ic214$);
            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
            module0642.f39074((SubLObject)module0678.$ic203$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
            module0015.f799(module0015.$g539$.getDynamicValue(var1));
        }
        finally {
            module0015.$g539$.rebind(var6, var1);
            module0015.$g541$.rebind(var5, var1);
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41432(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)module0678.$ic205$, var2);
        final SubLObject var4 = module0642.f39104((SubLObject)module0678.$ic212$, var2);
        final SubLObject var5 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0678.NIL, (SubLObject)module0678.NIL, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0593.f36291(var5);
        if (module0678.NIL != module0593.f36292()) {
            module0593.f36293(var4);
        }
        f41424((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41428() {
        module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic38$);
        module0642.f39020(module0015.$g224$.getGlobalValue());
        module0642.f39019(module0575.f35243());
        module0642.f39020(module0015.$g225$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic216$);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39032((SubLObject)module0678.FOUR_INTEGER);
        module0656.f39837((SubLObject)module0678.$ic217$, (SubLObject)module0678.$ic218$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39032((SubLObject)module0678.FOUR_INTEGER);
        module0656.f39837((SubLObject)module0678.$ic219$, (SubLObject)module0678.$ic220$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39032((SubLObject)module0678.FOUR_INTEGER);
        module0656.f39837((SubLObject)module0678.$ic221$, (SubLObject)module0678.$ic222$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41433(SubLObject var145) {
        if (var145 == module0678.UNPROVIDED) {
            var145 = (SubLObject)module0678.NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic223$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var147) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var148 = module0015.$g533$.currentBinding(var146);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var146);
            PrintLow.format(module0015.$g131$.getDynamicValue(var146), (SubLObject)module0678.$ic224$, var145);
        }
        finally {
            module0015.$g533$.rebind(var148, var146);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41434(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0678.NIL != Filesys.probe_file(module0593.f36294())) {
            module0642.f39020(module0075.f5215(module0593.f36294()));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)module0678.$ic226$, module0593.f36294());
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41435(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic228$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41436() {
        module0656.f39837((SubLObject)module0678.$ic229$, (SubLObject)module0678.$ic231$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41437(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0678.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0678.$ic236$);
            return (SubLObject)module0678.NIL;
        }
        module0642.f39020((SubLObject)module0678.$ic6$);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
        final SubLObject var4 = module0014.f672((SubLObject)module0678.$ic7$);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var4) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic237$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0660.f40193();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        final SubLObject var5 = module0015.$g132$.getDynamicValue(var3);
        final SubLObject var6 = module0015.$g535$.currentBinding(var3);
        try {
            module0015.$g535$.bind((SubLObject)module0678.T, var3);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0678.NIL != var5) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39042(var5));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_147 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_148 = module0015.$g533$.currentBinding(var3);
                final SubLObject var7 = module0015.$g541$.currentBinding(var3);
                final SubLObject var8 = module0015.$g539$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0015.$g541$.bind((SubLObject)module0678.T, var3);
                    module0015.$g539$.bind(module0015.f797(), var3);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39019((SubLObject)module0678.$ic237$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    module0656.f39870((SubLObject)module0678.$ic234$, (SubLObject)module0678.$ic137$, (SubLObject)module0678.$ic238$);
                    module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                    f41438();
                    f41439();
                    f41440();
                    f41441();
                    module0015.f799(module0015.$g539$.getDynamicValue(var3));
                }
                finally {
                    module0015.$g539$.rebind(var8, var3);
                    module0015.$g541$.rebind(var7, var3);
                    module0015.$g533$.rebind(var4_148, var3);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_147, var3);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41438() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_149 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_150 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic240$);
                }
                finally {
                    module0015.$g533$.rebind(var4_150, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_151 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39032((SubLObject)module0678.THREE_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_151, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_152 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(Environment.get_network_name(Environment.get_machine_name((SubLObject)module0678.$ic241$)));
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_152, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_149, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_153 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_154 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic242$);
                }
                finally {
                    module0015.$g533$.rebind(var4_154, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_155 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_155, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_156 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(Environment.lisp_implementation_type());
                    module0642.f39019((SubLObject)module0678.$ic100$);
                    module0642.f39019(Environment.lisp_implementation_version());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_156, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_153, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_157 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_158 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic243$);
                }
                finally {
                    module0015.$g533$.rebind(var4_158, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_159 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_159, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_160 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(module0110.$g1378$.getDynamicValue(var1));
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_160, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_157, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_161 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_162 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic244$);
                }
                finally {
                    module0015.$g533$.rebind(var4_162, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_163 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_163, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_164 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(module0018.f967());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_164, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_161, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var3 = Environment.get_process_id((SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var3) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_165 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_166 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var1);
                        module0642.f39019((SubLObject)module0678.$ic245$);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_166, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_167 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_167, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_168 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var1);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019(var3);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var4_168, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_165, var1);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            final SubLObject var4 = module0051.f3552(module0011.f355());
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_169 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_170 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic246$);
                }
                finally {
                    module0015.$g533$.rebind(var4_170, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_171 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_171, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_172 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(var4);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    PrintLow.format(module0015.$g131$.getDynamicValue(var1), (SubLObject)module0678.$ic247$, module0051.f3574(module0011.f356(), (SubLObject)module0678.ZERO_INTEGER));
                }
                finally {
                    module0015.$g533$.rebind(var4_172, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_169, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_173 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_174 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic248$);
                }
                finally {
                    module0015.$g533$.rebind(var4_174, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_175 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_175, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_176 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(module0011.f351());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_176, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_173, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_177 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_178 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic249$);
                }
                finally {
                    module0015.$g533$.rebind(var4_178, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_179 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_179, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_180 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(module0574.f35164());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var4_180, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_177, var1);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var2, var1);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0678.T;
    }
    
    public static SubLObject f41440() {
        module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic250$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic251$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(Numbers.add(module0574.f35163(), module0575.f35252()));
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic252$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35252());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic253$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35165());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic254$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(Numbers.subtract(module0574.f35165(), module0574.f35150()));
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic255$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35150());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic256$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35243());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic257$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35257());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic258$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35277());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (module0574.f35142().numG((SubLObject)module0678.ZERO_INTEGER) || module0575.f35267().numG((SubLObject)module0678.ZERO_INTEGER)) {
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39019((SubLObject)module0678.$ic259$);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0575.f35267());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41439() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic260$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic261$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        final SubLObject var2 = module0572.f35062((SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != module0573.f35083()) {
            module0642.f39019((SubLObject)module0678.$ic262$);
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic263$);
            module0642.f39019(var2);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
        }
        else {
            if (module0572.f35020().isString()) {
                module0656.f39837((SubLObject)module0678.$ic264$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            }
            else {
                module0642.f39019((SubLObject)module0678.$ic265$);
            }
            if (module0572.f35020().isString()) {
                module0642.f39026((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)module0678.$ic266$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39019(module0075.f5249(module0572.f35020()));
                module0642.f39026((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                if (module0678.NIL != module0110.$g1375$.getDynamicValue(var1)) {
                    module0642.f39019((SubLObject)module0678.$ic263$);
                }
                else {
                    module0642.f39019((SubLObject)module0678.$ic267$);
                }
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39019(var2);
            }
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic268$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (module0678.NIL != module0574.f35200()) {
            module0656.f39837((SubLObject)module0678.$ic269$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        }
        else {
            module0642.f39019((SubLObject)module0678.$ic265$);
        }
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != module0574.f35200()) {
            module0642.f39028((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic263$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019(module0575.f35277());
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41441() {
        module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic270$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
        module0642.f39019((SubLObject)module0678.$ic271$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35165());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic272$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35144());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0678.UNPROVIDED);
        module0642.f39019((SubLObject)module0678.$ic273$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35146());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (module0574.f35142().numG((SubLObject)module0678.ZERO_INTEGER)) {
            module0642.f39026((SubLObject)module0678.UNPROVIDED);
            module0642.f39019((SubLObject)module0678.$ic274$);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0574.f35142());
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41442() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = Eval.eval(conses_high.second(conses_high.assoc((SubLObject)module0678.$ic275$, module0655.$g5076$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)module0678.$ic276$), (SubLObject)module0678.UNPROVIDED)));
        final SubLObject var3 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic277$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var3) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        f41443(var2);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41444() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = Eval.eval(conses_high.second(conses_high.assoc((SubLObject)module0678.$ic279$, module0655.$g5076$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)module0678.$ic276$), (SubLObject)module0678.UNPROVIDED)));
        final SubLObject var3 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var3) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        f41443(var2);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41445(final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var146), (SubLObject)module0678.$ic281$, var145);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var147) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var148 = module0015.$g533$.currentBinding(var146);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var146);
            module0642.f39019(module0075.f5226(var145));
        }
        finally {
            module0015.$g533$.rebind(var148, var146);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        f41443(var145);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41443(final SubLObject var184) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        if (var184.isString()) {
            module0642.f39032((SubLObject)module0678.UNPROVIDED);
            final SubLObject var186 = module0656.f39832((SubLObject)module0678.$ic39$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)module0678.$ic284$);
            module0642.f39019(Sequences.cconcatenate((SubLObject)module0678.$ic285$, var184));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var186) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var186);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var187 = module0015.$g533$.currentBinding(var185);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var185);
                module0642.f39019((SubLObject)module0678.$ic286$);
            }
            finally {
                module0015.$g533$.rebind(var187, var185);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41446(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = var2.first();
        if (module0678.NIL != conses_high.assoc(var4, module0655.$g5076$.getDynamicValue(var3), (SubLObject)module0678.$ic287$, (SubLObject)module0678.UNPROVIDED)) {
            var4 = Eval.eval(conses_high.second(conses_high.assoc(var4, module0655.$g5076$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)module0678.$ic276$), (SubLObject)module0678.UNPROVIDED)));
        }
        f41447(var4);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41447(final SubLObject var145) {
        SubLObject var146 = (SubLObject)module0678.ZERO_INTEGER;
        SubLObject var147 = (SubLObject)module0678.NIL;
        if (var145.isString() && module0678.NIL != Filesys.probe_file(var145)) {
            SubLObject var148 = (SubLObject)module0678.NIL;
            try {
                var148 = compatibility.open_text(var145, (SubLObject)module0678.$ic289$);
                if (!var148.isStream()) {
                    Errors.error((SubLObject)module0678.$ic290$, var145);
                }
                SubLObject var149;
                SubLObject var150;
                for (var149 = var148, var150 = (SubLObject)module0678.NIL, var150 = reader.read_ignoring_errors(var149, (SubLObject)module0678.NIL, (SubLObject)module0678.NIL); module0678.NIL != var150; var150 = reader.read_ignoring_errors(var149, (SubLObject)module0678.NIL, (SubLObject)module0678.NIL)) {
                    var147 = (SubLObject)ConsesLow.cons(var150, var147);
                    var146 = Numbers.add(var146, (SubLObject)module0678.ONE_INTEGER);
                }
            }
            finally {
                final SubLObject var151 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0678.T);
                    if (var148.isStream()) {
                        streams_high.close(var148, (SubLObject)module0678.UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var151);
                }
            }
            var147 = Sequences.nreverse(var147);
        }
        f41448(var145, var146, var147);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41448(final SubLObject var80, final SubLObject var185, final SubLObject var186) {
        final SubLThread var187 = SubLProcess.currentSubLThread();
        final SubLObject var188 = (SubLObject)module0678.$ic293$;
        final SubLObject var189 = module0015.$g538$.currentBinding(var187);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var187))) ? module0015.$g538$.getDynamicValue(var187) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var187);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var187), module0655.$g5142$.getDynamicValue(var187));
            final SubLObject var190 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var190) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var190);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var188) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var188);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_190 = module0015.$g535$.currentBinding(var187);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var187);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var187)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var187)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_191 = module0015.$g533$.currentBinding(var187);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var187);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_192 = module0015.$g533$.currentBinding(var187);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var187);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_192, var187);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var188) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var188);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var187));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_193 = module0015.$g533$.currentBinding(var187);
                    final SubLObject var191 = module0015.$g541$.currentBinding(var187);
                    final SubLObject var192 = module0015.$g539$.currentBinding(var187);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var187);
                        module0015.$g541$.bind((SubLObject)module0678.T, var187);
                        module0015.$g539$.bind(module0015.f797(), var187);
                        module0656.f39870((SubLObject)module0678.$ic291$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic294$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0656.f39837((SubLObject)module0678.$ic282$, var80, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic295$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(var185);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        if (var80.isString()) {
                            if (module0678.NIL != Filesys.probe_file(var80) && var185.numG((SubLObject)module0678.ZERO_INTEGER)) {
                                module0015.f741();
                                module0642.f39020(module0015.$g203$.getGlobalValue());
                                final SubLObject var4_194 = module0015.$g537$.currentBinding(var187);
                                try {
                                    module0015.$g537$.bind((SubLObject)module0678.T, var187);
                                    SubLObject var193 = var186;
                                    SubLObject var194 = (SubLObject)module0678.NIL;
                                    var194 = var193.first();
                                    while (module0678.NIL != var193) {
                                        module0656.f39804(f41425(var194), (SubLObject)module0678.ZERO_INTEGER, (SubLObject)module0678.T);
                                        module0642.f39028((SubLObject)module0678.TWO_INTEGER);
                                        var193 = var193.rest();
                                        var194 = var193.first();
                                    }
                                }
                                finally {
                                    module0015.$g537$.rebind(var4_194, var187);
                                }
                                module0642.f39020(module0015.$g204$.getGlobalValue());
                            }
                            else {
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)module0678.$ic296$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)module0678.UNPROVIDED);
                                module0642.f39019(var80);
                            }
                        }
                        else {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var187), (SubLObject)module0678.$ic297$, var80);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var187));
                    }
                    finally {
                        module0015.$g539$.rebind(var192, var187);
                        module0015.$g541$.rebind(var191, var187);
                        module0015.$g533$.rebind(var4_193, var187);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_191, var187);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_190, var187);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var189, var187);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41425(SubLObject var195) {
        var195 = module0571.f34996(var195);
        var195 = module0290.f19534(var195);
        var195 = module0290.f19535(var195);
        return var195;
    }
    
    public static SubLObject f41449(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0538.f33465();
        final SubLObject var5 = (SubLObject)module0678.$ic300$;
        final SubLObject var6 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var7 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var7) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var7);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var5) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var5);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_197 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_198 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_199 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_199, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var5) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var5);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var8 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var8) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var8);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_200 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var10 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic301$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic298$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic302$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        SubLObject var11 = f41450();
                        var11 = module0213.f13926(var11, (SubLObject)module0678.NIL, (SubLObject)module0678.NIL, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39032((SubLObject)module0678.THREE_INTEGER);
                        module0642.f39072((SubLObject)module0678.$ic303$, (SubLObject)module0678.NIL, Types.sublisp_null(var4), (SubLObject)module0678.UNPROVIDED);
                        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic304$);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        SubLObject var12 = var11;
                        SubLObject var13 = (SubLObject)module0678.NIL;
                        var13 = var12.first();
                        while (module0678.NIL != var12) {
                            module0642.f39032((SubLObject)module0678.THREE_INTEGER);
                            module0642.f39072((SubLObject)module0678.$ic303$, var13, Equality.eq(var4, var13), (SubLObject)module0678.UNPROVIDED);
                            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                            module0656.f39804(var13, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39026((SubLObject)module0678.UNPROVIDED);
                            var12 = var12.rest();
                            var13 = var12.first();
                        }
                        module0642.f39073((SubLObject)module0678.$ic305$);
                        module0642.f39074((SubLObject)module0678.$ic22$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var10, var3);
                        module0015.$g541$.rebind(var9, var3);
                        module0015.$g533$.rebind(var4_200, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_198, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_197, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var6, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41450() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)module0678.NIL;
        final SubLObject var3 = module0147.f9540(module0678.$ic307$);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2096$.currentBinding(var1);
        try {
            module0147.$g2095$.bind(module0147.f9545(var3), var1);
            module0147.$g2094$.bind(module0147.f9546(var3), var1);
            module0147.$g2096$.bind(module0147.f9549(var3), var1);
            var2 = conses_high.intersection(module0259.f16848(module0678.$ic65$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), module0259.f16848(module0678.$ic308$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
            module0147.$g2095$.rebind(var4, var1);
        }
        return var2;
    }
    
    public static SubLObject f41451(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)module0678.$ic303$, var2);
        if (var3.equal((SubLObject)module0678.$ic309$)) {
            module0538.f33466((SubLObject)module0678.NIL);
        }
        else {
            module0538.f33466(module0656.f39943(var3, (SubLObject)module0678.UNPROVIDED));
        }
        module0677.f41287();
        module0656.f39793((SubLObject)module0678.$ic310$, (SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41452(SubLObject var118) {
        if (var118 == module0678.UNPROVIDED) {
            var118 = (SubLObject)module0678.NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (module0678.NIL == var118) {
            var118 = (SubLObject)module0678.$ic312$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic313$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41453(final SubLObject var205, final SubLObject var206) {
        module0574.f35157(var205, var206, module0678.$ic316$);
        return f41454();
    }
    
    public static SubLObject f41455(final SubLObject var205) {
        module0574.f35153(var205);
        return f41454();
    }
    
    public static SubLObject f41454() {
        final SubLObject var205 = module0574.f35152();
        if (module0678.NIL == module0574.f35155()) {
            final SubLObject var206 = f41456(var205);
            module0538.f33466(var206.first());
            module0677.f41380();
        }
        return var205;
    }
    
    public static SubLObject f41456(final SubLObject var207) {
        final SubLThread var208 = SubLProcess.currentSubLThread();
        SubLObject var209 = (SubLObject)module0678.NIL;
        final SubLObject var210 = module0018.$g701$.currentBinding(var208);
        try {
            module0018.$g701$.bind((SubLObject)module0678.NIL, var208);
            var209 = module0434.f30576((SubLObject)module0678.$ic317$, (SubLObject)ConsesLow.listS(module0678.$ic318$, var207, (SubLObject)module0678.$ic319$), module0678.$ic307$, (SubLObject)module0678.$ic320$);
        }
        finally {
            module0018.$g701$.rebind(var210, var208);
        }
        return var209;
    }
    
    public static SubLObject f41457(final SubLObject var196) {
        module0678.$g5201$.setDynamicValue(var196);
        return var196;
    }
    
    public static SubLObject f41458(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39110((SubLObject)module0678.$ic323$, var2, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var5 = Types.stringp(var4);
        final SubLObject var6 = (SubLObject)module0678.$ic324$;
        final SubLObject var7 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var8 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var8) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var8);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var6) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var6);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            final SubLObject var9 = module0014.f657((SubLObject)module0678.$ic10$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g479$.getGlobalValue());
            module0642.f39020(module0015.$g482$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g483$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic11$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_212 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_212, var3);
            }
            module0642.f39020(module0015.$g480$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_213 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_214 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_215 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_215, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var6) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var6);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var10 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var10) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var10);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_216 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic325$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic321$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        if (module0678.NIL != module0678.$g5201$.getDynamicValue(var3)) {
                            module0642.f39019((SubLObject)module0678.$ic326$);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019(module0678.$g5201$.getDynamicValue(var3));
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        }
                        module0642.f39019((SubLObject)module0678.$ic327$);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0656.f39804(module0574.f35152(), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic162$);
                        module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic328$);
                        module0656.f39837((SubLObject)module0678.$ic329$, (SubLObject)module0678.$ic330$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic331$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic332$);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic22$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic333$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        if (module0678.NIL != module0574.f35156()) {
                            module0642.f39156((SubLObject)module0678.$ic323$, (SubLObject)module0678.$ic334$, (SubLObject)module0678.$ic335$, (SubLObject)module0678.$ic336$, var4, var5);
                        }
                        else {
                            f41459((SubLObject)module0678.$ic323$);
                        }
                        final SubLObject var13 = module0538.f33465();
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0656.f39837((SubLObject)module0678.$ic314$, (SubLObject)module0678.$ic312$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic337$);
                        if (module0678.NIL != var13) {
                            module0656.f39804(var13, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        }
                        else {
                            module0642.f39019((SubLObject)module0678.$ic304$);
                        }
                        module0642.f39026((SubLObject)module0678.THREE_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic338$);
                        module0642.f39019(Environment.get_network_name((SubLObject)module0678.$ic241$));
                        module0642.f39019((SubLObject)module0678.$ic339$);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        final SubLObject var14 = module0723.f44310();
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.FIVE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_217 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_218 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_219 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39020(module0015.$g242$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0678.$ic340$);
                                    module0642.f39020(module0015.$g243$.getGlobalValue());
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_219, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_220 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39020(module0015.$g242$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0678.$ic341$);
                                    module0642.f39020(module0015.$g243$.getGlobalValue());
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_220, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                SubLObject var15 = var14;
                                SubLObject var16 = (SubLObject)module0678.NIL;
                                var16 = var15.first();
                                while (module0678.NIL != var15) {
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                    final SubLObject var4_221 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                        SubLObject var18;
                                        final SubLObject var17 = var18 = var16;
                                        SubLObject var19 = (SubLObject)module0678.NIL;
                                        SubLObject var20 = (SubLObject)module0678.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0678.$ic342$);
                                        var19 = var18.first();
                                        var18 = var18.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)module0678.$ic342$);
                                        var20 = var18.first();
                                        var18 = var18.rest();
                                        if (module0678.NIL == var18) {
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                            final SubLObject var4_222 = module0015.$g533$.currentBinding(var3);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                                module0656.f39804(var20, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_222, var3);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                            if (module0678.NIL != module0589.f35878(var19)) {
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                                final SubLObject var4_223 = module0015.$g533$.currentBinding(var3);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                                    module0642.f39019(module0589.f35876(var19));
                                                    module0642.f39032((SubLObject)module0678.UNPROVIDED);
                                                    module0642.f39019((SubLObject)module0678.$ic343$);
                                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                                    module0642.f39019(var19);
                                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                                    module0642.f39032((SubLObject)module0678.UNPROVIDED);
                                                    module0656.f39837((SubLObject)module0678.$ic344$, var19, (SubLObject)module0678.$ic345$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                                                    module0642.f39019((SubLObject)module0678.$ic346$);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var4_223, var3);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            else {
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                                final SubLObject var4_224 = module0015.$g533$.currentBinding(var3);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                                    module0642.f39019(var19);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var4_224, var3);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                            final SubLObject var4_225 = module0015.$g533$.currentBinding(var3);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                                if (var19.equal(module0723.f44261())) {
                                                    module0642.f39020(module0015.$g459$.getGlobalValue());
                                                    module0642.f39032((SubLObject)module0678.UNPROVIDED);
                                                    module0642.f39020(module0015.$g207$.getGlobalValue());
                                                    module0642.f39027((SubLObject)module0678.$ic347$, (SubLObject)module0678.UNPROVIDED);
                                                    module0642.f39020(module0015.$g208$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0678.$ic348$);
                                                    module0642.f39020(module0015.$g460$.getGlobalValue());
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_225, var3);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0678.$ic342$);
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_221, var3);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                                    var15 = var15.rest();
                                    var16 = var15.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var4_218, var3);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0678.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_217, var3);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        if (module0678.NIL == module0035.f1993(module0723.f44310(), (SubLObject)module0678.TWO_INTEGER, (SubLObject)module0678.UNPROVIDED)) {
                            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                            module0656.f39837((SubLObject)module0678.$ic349$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var3);
                        module0015.$g541$.rebind(var11, var3);
                        module0015.$g533$.rebind(var4_216, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_214, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_213, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var7, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41460(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLObject var3 = module0642.f39104((SubLObject)module0678.$ic351$, var2);
        final SubLObject var4 = (SubLObject)((module0678.NIL != module0723.f44302(var3)) ? module0678.$ic352$ : module0678.$ic353$);
        module0589.f35875(var3);
        f41458((SubLObject)module0678.UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f41461(final SubLObject var232, SubLObject var118) {
        if (var118 == module0678.UNPROVIDED) {
            var118 = (SubLObject)module0678.NIL;
        }
        final SubLThread var233 = SubLProcess.currentSubLThread();
        if (module0678.NIL == var118) {
            var118 = var232;
        }
        final SubLObject var234 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var233), (SubLObject)module0678.$ic355$, (SubLObject)module0678.$ic356$, var232);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var234) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var234);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var235 = module0015.$g533$.currentBinding(var233);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var233);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var235, var233);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41459(final SubLObject var234) {
        module0666.f40467(var234, (SubLObject)module0678.$ic358$, module0678.$ic359$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        module0642.f39032((SubLObject)module0678.UNPROVIDED);
        module0642.f39075(var234, (SubLObject)module0678.NIL, (SubLObject)module0678.$ic360$);
        module0642.f39032((SubLObject)module0678.UNPROVIDED);
        module0642.f39073((SubLObject)module0678.$ic361$);
        module0642.f39032((SubLObject)module0678.UNPROVIDED);
        module0642.f39074((SubLObject)module0678.$ic22$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41462() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic362$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39019((SubLObject)module0678.$ic363$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41463(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0678.$ic365$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var4) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_235 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_236 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_237 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_237, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g185$.getGlobalValue());
                    module0642.f39019((SubLObject)module0678.$ic366$);
                    module0642.f39020(module0015.$g186$.getGlobalValue());
                    final SubLObject var7 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_238 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic367$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_239 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            f41464();
                            SubLObject var10 = (SubLObject)module0678.ZERO_INTEGER;
                            SubLObject var11 = Sequences.remove_duplicates(module0723.f44310(), Symbols.symbol_function((SubLObject)module0678.EQL), Symbols.symbol_function((SubLObject)module0678.$ic372$), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            SubLObject var12 = (SubLObject)module0678.NIL;
                            var12 = var11.first();
                            while (module0678.NIL != var11) {
                                SubLObject var14;
                                final SubLObject var13 = var14 = var12;
                                SubLObject var15 = (SubLObject)module0678.NIL;
                                SubLObject var16 = (SubLObject)module0678.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0678.$ic368$);
                                var15 = var14.first();
                                var14 = var14.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)module0678.$ic368$);
                                var16 = var14.first();
                                var14 = var14.rest();
                                if (module0678.NIL == var14) {
                                    if (!var16.eql(module0574.f35152()) && !var16.eql(module0678.$ic369$)) {
                                        module0642.f39020(module0015.$g364$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                        final SubLObject var4_240 = module0015.$g533$.currentBinding(var3);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39020(module0015.$g370$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic370$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                            module0642.f39020(module0015.$g373$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                            final SubLObject var4_241 = module0015.$g533$.currentBinding(var3);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                                if (var10.isZero()) {
                                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                                    module0642.f39019((SubLObject)module0678.$ic371$);
                                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_241, var3);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                            f41465(var16);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var4_240, var3);
                                        }
                                        module0642.f39020(module0015.$g365$.getGlobalValue());
                                        module0642.f39029((SubLObject)module0678.UNPROVIDED);
                                        var10 = Numbers.add(var10, (SubLObject)module0678.ONE_INTEGER);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)module0678.$ic368$);
                                }
                                var11 = var11.rest();
                                var12 = var11.first();
                            }
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_242 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic370$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_243 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0678.$ic373$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_243, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                f41465(module0574.f35152());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_242, var3);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_244 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic370$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_245 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0678.$ic374$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_245, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020((SubLObject)module0678.THREE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic56$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_246 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g346$.getGlobalValue());
                                    module0642.f39020(module0015.$g352$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                    final SubLObject var4_247 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                        module0642.f39075((SubLObject)module0678.$ic375$, (SubLObject)module0678.$ic74$, (SubLObject)module0678.$ic376$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_247, var3);
                                    }
                                    module0642.f39020(module0015.$g347$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_246, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_244, var3);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_248 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic370$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_249 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0678.$ic377$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_249, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020((SubLObject)module0678.THREE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic56$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_250 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g336$.getGlobalValue());
                                    module0642.f39020(module0015.$g338$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0678.$ic17$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39020(module0015.$g340$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0678.$ic376$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39020(module0015.$g339$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39020((SubLObject)module0678.FIVE_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                    final SubLObject var4_251 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_251, var3);
                                    }
                                    module0642.f39020(module0015.$g337$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_250, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_248, var3);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0678.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_239, var3);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39074((SubLObject)module0678.$ic378$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_238, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_236, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_235, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41465(final SubLObject var205) {
        final SubLThread var206 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        SubLObject var207 = module0015.$g533$.currentBinding(var206);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var206);
            module0656.f39804(var205, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var207, var206);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        var207 = module0015.$g533$.currentBinding(var206);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var206);
            module0642.f39019(f41466(var205));
        }
        finally {
            module0015.$g533$.rebind(var207, var206);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        var207 = module0015.$g533$.currentBinding(var206);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var206);
            final SubLObject var208 = f41467(var205);
            module0642.f39068(var208, (SubLObject)module0678.$ic380$, (SubLObject)module0678.NIL, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var207, var206);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        return var205;
    }
    
    public static SubLObject f41464() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g364$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var1);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_257 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
            }
            finally {
                module0015.$g533$.rebind(var4_257, var1);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_258 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0678.$ic340$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_258, var1);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_259 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0678.$ic381$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_259, var1);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_260 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)module0678.$ic382$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_260, var1);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var2, var1);
        }
        module0642.f39020(module0015.$g365$.getGlobalValue());
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41468() {
        final SubLObject var261 = module0678.$g5338$.getGlobalValue();
        if (module0678.NIL != var261) {
            module0034.f1818(var261);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41469(final SubLObject var205) {
        return module0034.f1829(module0678.$g5338$.getGlobalValue(), (SubLObject)ConsesLow.list(var205), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
    }
    
    public static SubLObject f41470(final SubLObject var205) {
        return Sequences.cconcatenate((SubLObject)module0678.$ic384$, module0597.f36628(var205));
    }
    
    public static SubLObject f41467(final SubLObject var205) {
        SubLObject var206 = module0678.$g5338$.getGlobalValue();
        if (module0678.NIL == var206) {
            var206 = module0034.f1934((SubLObject)module0678.$ic383$, (SubLObject)module0678.$ic385$, (SubLObject)module0678.NIL, (SubLObject)module0678.EQ, (SubLObject)module0678.ONE_INTEGER, (SubLObject)module0678.ZERO_INTEGER);
        }
        SubLObject var207 = module0034.f1814(var206, var205, (SubLObject)module0678.$ic386$);
        if (var207 == module0678.$ic386$) {
            var207 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f41470(var205)));
            module0034.f1816(var206, var205, var207, (SubLObject)module0678.UNPROVIDED);
        }
        return module0034.f1959(var207);
    }
    
    public static SubLObject f41466(final SubLObject var205) {
        SubLObject var206 = (SubLObject)module0678.NIL;
        var206 = module0434.f30579((SubLObject)module0678.$ic387$, (SubLObject)ConsesLow.listS(module0678.$ic388$, var205, (SubLObject)module0678.$ic389$), module0678.$ic390$, (SubLObject)module0678.ZERO_INTEGER, (SubLObject)module0678.ONE_INTEGER, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL == var206) {
            return (SubLObject)module0678.$ic241$;
        }
        return var206.first();
    }
    
    public static SubLObject f41471(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39104((SubLObject)module0678.$ic17$, var2);
        final SubLObject var5 = module0642.f39104((SubLObject)module0678.$ic375$, var2);
        SubLObject var6 = (SubLObject)module0678.NIL;
        final SubLObject var7 = (SubLObject)module0678.$ic391$;
        final SubLObject var8 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var9 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var9) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var7) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var7);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_266 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_267 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_268 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_268, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var7);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39020(module0015.$g185$.getGlobalValue());
                    module0642.f39019((SubLObject)module0678.$ic392$);
                    module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_269 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_270 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic52$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_271 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0678.$ic393$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_271, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic56$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_272 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0015.f741();
                                module0642.f39020(module0015.$g203$.getGlobalValue());
                                final SubLObject var4_273 = module0015.$g537$.currentBinding(var3);
                                try {
                                    module0015.$g537$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39019(var5);
                                }
                                finally {
                                    module0015.$g537$.rebind(var4_273, var3);
                                }
                                module0642.f39020(module0015.$g204$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_272, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_270, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_274 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic52$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_275 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0678.$ic394$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_275, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic56$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_276 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0015.f741();
                                module0642.f39020(module0015.$g203$.getGlobalValue());
                                final SubLObject var4_277 = module0015.$g537$.currentBinding(var3);
                                try {
                                    module0015.$g537$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39019(var4);
                                }
                                finally {
                                    module0015.$g537$.rebind(var4_277, var3);
                                }
                                module0642.f39020(module0015.$g204$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_276, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_274, var3);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_269, var3);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39020(module0015.$g186$.getGlobalValue());
                    module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)module0678.$ic395$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39020(module0015.$g264$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_278 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        SubLObject var10 = module0723.f44310();
                        SubLObject var11 = (SubLObject)module0678.NIL;
                        var11 = var10.first();
                        while (module0678.NIL != var10) {
                            SubLObject var13;
                            final SubLObject var12 = var13 = var11;
                            SubLObject var14 = (SubLObject)module0678.NIL;
                            SubLObject var15 = (SubLObject)module0678.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0678.$ic396$);
                            var14 = var13.first();
                            var13 = var13.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)module0678.$ic396$);
                            var15 = var13.first();
                            var13 = var13.rest();
                            if (module0678.NIL == var13) {
                                final SubLObject var16 = f41467(var15);
                                if (module0678.NIL != module0642.f39104(var16, var2)) {
                                    module0642.f39020(module0015.$g275$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                    final SubLObject var4_279 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                        module0642.f39019((SubLObject)module0678.$ic397$);
                                        module0656.f39804(var15, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_279, var3);
                                    }
                                    module0642.f39020(module0015.$g276$.getGlobalValue());
                                }
                                else {
                                    var6 = (SubLObject)ConsesLow.cons(var15, var6);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)module0678.$ic396$);
                            }
                            var10 = var10.rest();
                            var11 = var10.first();
                        }
                        final SubLObject var17 = f41466(module0574.f35152());
                        SubLObject var18 = var6;
                        SubLObject var19 = (SubLObject)module0678.NIL;
                        var19 = var18.first();
                        while (module0678.NIL != var18) {
                            final SubLObject var20 = f41466(var19);
                            var3.resetMultipleValues();
                            final SubLObject var21 = module0046.f3173(var17, var20, var4, var5, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var22 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            if (module0678.NIL != var21) {
                                module0642.f39020(module0015.$g275$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_280 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39019((SubLObject)module0678.$ic398$);
                                    module0656.f39804(var19, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_280, var3);
                                }
                                module0642.f39020(module0015.$g276$.getGlobalValue());
                            }
                            else {
                                module0642.f39020(module0015.$g275$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_281 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    final SubLObject var23 = module0015.$g500$.getGlobalValue();
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    if (module0678.NIL != var23) {
                                        module0642.f39020(module0015.$g222$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                        module0642.f39020(module0642.f39042(var23));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                    final SubLObject var4_282 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                        module0642.f39019((SubLObject)module0678.$ic399$);
                                        module0656.f39804(var19, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                                        module0642.f39019((SubLObject)module0678.$ic337$);
                                        module0642.f39019(var22);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_282, var3);
                                    }
                                    module0642.f39020(module0015.$g220$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_281, var3);
                                }
                                module0642.f39020(module0015.$g276$.getGlobalValue());
                            }
                            var18 = var18.rest();
                            var19 = var18.first();
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var4_278, var3);
                    }
                    module0642.f39020(module0015.$g265$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_267, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_266, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var8, var3);
        }
        return var2;
    }
    
    public static SubLObject f41472(SubLObject var118) {
        if (var118 == module0678.UNPROVIDED) {
            var118 = (SubLObject)module0678.NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (module0678.NIL == var118) {
            var118 = (SubLObject)module0678.$ic401$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic402$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41473(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0038.f2735(module0642.f39110((SubLObject)module0678.$ic323$, var2, (SubLObject)module0678.$ic74$));
        final SubLObject var5 = module0642.f39110((SubLObject)module0678.$ic334$, var2, (SubLObject)module0678.$ic74$);
        final SubLObject var6 = f41474(var4, var5);
        if (var6 == module0678.$ic352$) {
            if (module0678.NIL == f41475(var2)) {
                f41476();
            }
            return (SubLObject)module0678.NIL;
        }
        if (module0678.NIL != module0574.f35156()) {
            f41458(var2);
            return (SubLObject)module0678.NIL;
        }
        final SubLObject var7 = module0660.f40150(var4, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var8 = module0035.remove_if_not((SubLObject)module0678.$ic405$, var7, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != module0035.f1997(var8)) {
            f41455(var8.first());
            if (module0678.NIL == f41475(var2)) {
                f41476();
            }
            return (SubLObject)module0678.NIL;
        }
        final SubLObject var9 = (Sequences.length(var4).numG((SubLObject)module0678.ZERO_INTEGER) && (module0678.NIL != Sequences.find((SubLObject)Characters.CHAR_space, var4, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED) || module0678.NIL != Characters.lower_case_p(Strings.sublisp_char(var4, (SubLObject)module0678.ZERO_INTEGER)))) ? module0667.f40586(var4) : var4;
        final SubLObject var10 = module0538.f33337(var9);
        if (var9.isString() && module0678.NIL != module0126.f8389(var9)) {
            final SubLObject var11 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var12 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)module0678.$ic406$, var3);
                module0147.$g2095$.bind(module0678.$ic307$, var3);
                if (module0678.NIL != var10 && module0678.NIL != module0226.f14810(var10)) {
                    f41455(var10);
                    if (module0678.NIL == f41475(var2)) {
                        f41476();
                    }
                }
                else if (module0678.NIL != var10 && module0678.NIL == module0226.f14810(var10)) {
                    f41477(var10);
                }
                else {
                    f41478(var9);
                }
            }
            finally {
                module0147.$g2095$.rebind(var12, var3);
                module0147.$g2094$.rebind(var11, var3);
            }
        }
        else {
            f41458(var2);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41474(final SubLObject var290, SubLObject var291) {
        if (var291 == module0678.UNPROVIDED) {
            var291 = (SubLObject)module0678.NIL;
        }
        if (module0678.NIL != module0574.f35156()) {
            f41453(var290, var291);
        }
        else {
            f41455(var290);
        }
        if (module0678.NIL == module0574.f35155()) {
            return (SubLObject)module0678.$ic352$;
        }
        return (SubLObject)module0678.$ic353$;
    }
    
    public static SubLObject f41475(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)module0678.$ic408$, var2);
        final SubLObject var4 = Sequences.position((SubLObject)module0678.$ic408$, var2, Symbols.symbol_function((SubLObject)module0678.EQUALP), (SubLObject)module0678.$ic409$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var3) {
            final SubLObject var5 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != module0015.f874(var5)) {
                Functions.funcall(var5, conses_high.nthcdr(module0048.f_1X(var4), var2));
                return (SubLObject)module0678.T;
            }
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41479(final SubLObject var300) {
        if (module0678.NIL != module0035.f2014(var300)) {
            return var300.first();
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41477(final SubLObject var296) {
        final SubLThread var297 = SubLProcess.currentSubLThread();
        final SubLObject var298 = (SubLObject)module0678.$ic410$;
        final SubLObject var299 = module0015.$g538$.currentBinding(var297);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var297))) ? module0015.$g538$.getDynamicValue(var297) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var297);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var297), module0655.$g5142$.getDynamicValue(var297));
            final SubLObject var300 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var300) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var300);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var298) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var298);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_301 = module0015.$g535$.currentBinding(var297);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var297);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var297)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var297)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_302 = module0015.$g533$.currentBinding(var297);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var297);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_303 = module0015.$g533$.currentBinding(var297);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var297);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_303, var297);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var298) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var298);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var297));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_304 = module0015.$g533$.currentBinding(var297);
                    final SubLObject var301 = module0015.$g541$.currentBinding(var297);
                    final SubLObject var302 = module0015.$g539$.currentBinding(var297);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var297);
                        module0015.$g541$.bind((SubLObject)module0678.T, var297);
                        module0015.$g539$.bind(module0015.f797(), var297);
                        module0656.f39790((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic411$);
                        module0656.f39804(var296, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic412$);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic413$);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0015.f799(module0015.$g539$.getDynamicValue(var297));
                    }
                    finally {
                        module0015.$g539$.rebind(var302, var297);
                        module0015.$g541$.rebind(var301, var297);
                        module0015.$g533$.rebind(var4_304, var297);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_302, var297);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_301, var297);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var299, var297);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41476() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0658.f40050(module0574.f35152());
        module0642.f39020((SubLObject)module0678.$ic6$);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var1), module0655.$g5142$.getDynamicValue(var1));
        final SubLObject var2 = module0014.f672((SubLObject)module0678.$ic7$);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var2) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39020((SubLObject)module0678.$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)module0678.$ic414$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0677.f41287();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        final SubLObject var3 = module0015.$g132$.getDynamicValue(var1);
        final SubLObject var4 = module0015.$g535$.currentBinding(var1);
        try {
            module0015.$g535$.bind((SubLObject)module0678.T, var1);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (module0678.NIL != var3) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0642.f39042(var3));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_305 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var1);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                module0642.f39019((SubLObject)module0678.$ic414$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                module0642.f39019((SubLObject)module0678.$ic415$);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39019(f41480(module0574.f35152()));
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39019((SubLObject)module0678.$ic416$);
                module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                final SubLObject var5 = module0538.f33465();
                if (module0678.NIL != var5) {
                    module0642.f39019((SubLObject)module0678.$ic417$);
                    module0656.f39804(var5, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39019((SubLObject)module0678.$ic162$);
                    module0642.f39026((SubLObject)module0678.UNPROVIDED);
                    final SubLObject var6 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var1));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_306 = module0015.$g533$.currentBinding(var1);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var1);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var1);
                        module0015.$g541$.bind((SubLObject)module0678.T, var1);
                        module0015.$g539$.bind(module0015.f797(), var1);
                        module0642.f39069((SubLObject)module0678.$ic313$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39074((SubLObject)module0678.$ic418$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var1));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var1);
                        module0015.$g541$.rebind(var7, var1);
                        module0015.$g533$.rebind(var4_306, var1);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                }
                else {
                    module0642.f39019((SubLObject)module0678.$ic419$);
                    module0642.f39026((SubLObject)module0678.UNPROVIDED);
                    final SubLObject var6 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var1));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_307 = module0015.$g533$.currentBinding(var1);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var1);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var1);
                        module0015.$g541$.bind((SubLObject)module0678.T, var1);
                        module0015.$g539$.bind(module0015.f797(), var1);
                        module0642.f39069((SubLObject)module0678.$ic313$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39074((SubLObject)module0678.$ic420$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var1));
                    }
                    finally {
                        module0015.$g539$.rebind(var8, var1);
                        module0015.$g541$.rebind(var7, var1);
                        module0015.$g533$.rebind(var4_307, var1);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                }
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var1));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_308 = module0015.$g533$.currentBinding(var1);
                final SubLObject var9 = module0015.$g541$.currentBinding(var1);
                final SubLObject var10 = module0015.$g539$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0015.$g541$.bind((SubLObject)module0678.T, var1);
                    module0015.$g539$.bind(module0015.f797(), var1);
                    module0656.f39794((SubLObject)module0678.$ic421$);
                    module0015.f799(module0015.$g539$.getDynamicValue(var1));
                }
                finally {
                    module0015.$g539$.rebind(var10, var1);
                    module0015.$g541$.rebind(var9, var1);
                    module0015.$g533$.rebind(var4_308, var1);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_305, var1);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0678.UNPROVIDED);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41480(SubLObject var205) {
        if (var205 == module0678.UNPROVIDED) {
            var205 = module0574.f35152();
        }
        final SubLThread var206 = SubLProcess.currentSubLThread();
        SubLObject var207 = (SubLObject)module0678.NIL;
        if (module0678.NIL != module0131.f8548()) {
            final SubLObject var208 = module0579.$g4287$.currentBinding(var206);
            final SubLObject var209 = module0579.$g4260$.currentBinding(var206);
            try {
                module0579.$g4287$.bind((SubLObject)module0678.ONE_INTEGER, var206);
                module0579.$g4260$.bind(module0677.f41312(), var206);
                final SubLObject var210 = module0434.f30578((SubLObject)module0678.$ic423$, (SubLObject)ConsesLow.listS(module0678.$ic424$, var205, (SubLObject)module0678.$ic425$), module0678.$ic426$, (SubLObject)module0678.UNPROVIDED);
                SubLObject var211;
                SubLObject var212;
                SubLObject var213;
                SubLObject var215;
                SubLObject var214;
                SubLObject var216;
                SubLObject var217;
                SubLObject var218;
                SubLObject var219;
                SubLObject var220;
                for (var211 = (SubLObject)module0678.NIL, var212 = (SubLObject)module0678.NIL, var212 = module0678.$g5339$.getGlobalValue(); module0678.NIL == var211 && module0678.NIL != var212; var212 = var212.rest()) {
                    var213 = var212.first();
                    var214 = (var215 = var213);
                    var216 = (SubLObject)module0678.NIL;
                    var217 = (SubLObject)module0678.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var215, var214, (SubLObject)module0678.$ic427$);
                    var216 = var215.first();
                    var215 = (var217 = var215.rest());
                    if (module0678.NIL != module0004.f104(var216, var210, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED)) {
                        var218 = (var216.eql(module0678.$ic428$) ? module0678.$ic429$ : module0678.$ic430$);
                        var206.resetMultipleValues();
                        var219 = module0770.f49067(var205, (SubLObject)module0678.$ic431$, (SubLObject)ConsesLow.list(var218), (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        var220 = var206.secondMultipleValue();
                        var206.resetMultipleValues();
                        if (module0678.NIL != var219 && module0678.NIL != module0260.f17089(var220, var218, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED)) {
                            var207 = Sequences.cconcatenate(var217, new SubLObject[] { module0678.$ic100$, var219 });
                        }
                        var211 = (SubLObject)module0678.T;
                    }
                }
                if (module0678.NIL == var207) {
                    var206.resetMultipleValues();
                    final SubLObject var221 = module0770.f49067(var205, (SubLObject)module0678.$ic431$, (SubLObject)module0678.$ic432$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var222 = var206.secondMultipleValue();
                    var206.resetMultipleValues();
                    if (module0678.NIL != var221 && module0678.NIL != module0260.f17089(var222, module0678.$ic429$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED)) {
                        var207 = var221;
                    }
                }
            }
            finally {
                module0579.$g4260$.rebind(var209, var206);
                module0579.$g4287$.rebind(var208, var206);
            }
        }
        if (module0678.NIL == var207) {
            var207 = module0656.f39956(var205);
        }
        return var207;
    }
    
    public static SubLObject f41478(final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        final SubLObject var82 = (SubLObject)module0678.$ic433$;
        final SubLObject var83 = module0015.$g538$.currentBinding(var81);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var81))) ? module0015.$g538$.getDynamicValue(var81) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var81);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var81), module0655.$g5142$.getDynamicValue(var81));
            final SubLObject var84 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var84) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var84);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var82) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var82);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_322 = module0015.$g535$.currentBinding(var81);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var81);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var81)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var81)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_323 = module0015.$g533$.currentBinding(var81);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var81);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_324 = module0015.$g533$.currentBinding(var81);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var81);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_324, var81);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var82) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var82);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var85 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var81));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var85) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var85);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_325 = module0015.$g533$.currentBinding(var81);
                    final SubLObject var86 = module0015.$g541$.currentBinding(var81);
                    final SubLObject var87 = module0015.$g539$.currentBinding(var81);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var81);
                        module0015.$g541$.bind((SubLObject)module0678.T, var81);
                        module0015.$g539$.bind(module0015.f797(), var81);
                        module0642.f39069((SubLObject)module0678.$ic434$, var80, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic435$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019(var80);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic436$);
                        module0656.f39804(module0678.$ic359$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic162$);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        if (module0678.NIL == module0543.f33698()) {
                            module0642.f39019((SubLObject)module0678.$ic437$);
                            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                            module0656.f39790((SubLObject)module0678.$ic137$, (SubLObject)module0678.$ic57$);
                            module0642.f39074((SubLObject)module0678.$ic438$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var81));
                    }
                    finally {
                        module0015.$g539$.rebind(var87, var81);
                        module0015.$g541$.rebind(var86, var81);
                        module0015.$g533$.rebind(var4_325, var81);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_323, var81);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_322, var81);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var83, var81);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41481(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0678.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0678.$ic439$);
            return (SubLObject)module0678.NIL;
        }
        final SubLObject var4 = var2.first();
        if (module0678.NIL != var4) {
            final SubLObject var5 = module0111.$g1406$.currentBinding(var3);
            try {
                module0111.$g1406$.bind((SubLObject)module0678.NIL, var3);
                final SubLObject var6 = module0543.f33618(var4);
                module0543.f33628((SubLObject)ConsesLow.listS(module0678.$ic440$, var6, (SubLObject)module0678.$ic441$), module0678.$ic390$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                if (module0678.NIL != module0226.f14810(var6)) {
                    f41455(var6);
                    f41476();
                }
            }
            finally {
                module0111.$g1406$.rebind(var5, var3);
            }
        }
        else {
            module0656.f39789((SubLObject)module0678.$ic442$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41482(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0678.$ic445$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var4) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_326 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_327 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_328 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_328, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39019((SubLObject)module0678.$ic446$);
                    module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                    module0642.f39019((SubLObject)module0678.$ic328$);
                    module0656.f39837((SubLObject)module0678.$ic447$, (SubLObject)module0678.$ic330$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39019((SubLObject)module0678.$ic448$);
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_327, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_326, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        module0642.f39011();
        module0723.f44302(module0723.f44261());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41483(SubLObject var118) {
        if (var118 == module0678.UNPROVIDED) {
            var118 = (SubLObject)module0678.NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (module0678.NIL == var118) {
            var118 = (SubLObject)module0678.$ic450$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)module0678.$ic53$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic451$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41484(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39104((SubLObject)module0678.$ic453$, var2);
        final SubLObject var5 = module0642.f39110((SubLObject)module0678.$ic454$, var2, module0597.f36628(module0574.f35152()));
        final SubLObject var6 = (SubLObject)module0678.$ic455$;
        final SubLObject var7 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var8 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var8) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var8);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var6) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var6);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            final SubLObject var9 = module0014.f657((SubLObject)module0678.$ic10$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g479$.getGlobalValue());
            module0642.f39020(module0015.$g482$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g483$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic11$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_330 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_330, var3);
            }
            module0642.f39020(module0015.$g480$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_331 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_332 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_333 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_333, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var6) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var6);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    if (var4.isString()) {
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g351$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0678.$ic370$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g358$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic456$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_334 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var3);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_335 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_336 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    if (module0678.NIL != module0015.$g495$.getGlobalValue()) {
                                        module0642.f39020(module0015.$g222$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                        module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                    final SubLObject var4_337 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                        module0642.f39020(module0015.$g209$.getGlobalValue());
                                        module0642.f39019((SubLObject)module0678.$ic457$);
                                        module0642.f39020(module0015.$g210$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_337, var3);
                                    }
                                    module0642.f39020(module0015.$g220$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_336, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_338 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39019((SubLObject)module0678.$ic458$);
                                    module0642.f39019(var5);
                                    module0642.f39019((SubLObject)module0678.$ic162$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_338, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_335, var3);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_339 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0678.$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_340 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0678.$ic459$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_340, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                                final SubLObject var4_341 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                    module0642.f39019(var4);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_341, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_339, var3);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0678.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_334, var3);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39019((SubLObject)module0678.$ic460$);
                    module0642.f39026((SubLObject)module0678.UNPROVIDED);
                    module0642.f39019((SubLObject)module0678.$ic461$);
                    module0642.f39026((SubLObject)module0678.UNPROVIDED);
                    final SubLObject var10 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var10) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var10);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_342 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic462$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39156((SubLObject)module0678.$ic454$, (SubLObject)module0678.$ic334$, (SubLObject)module0678.$ic335$, (SubLObject)module0678.$ic463$, var5, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var3);
                        module0015.$g541$.rebind(var11, var3);
                        module0015.$g533$.rebind(var4_342, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_332, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_331, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var7, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41485(SubLObject var118) {
        if (var118 == module0678.UNPROVIDED) {
            var118 = (SubLObject)module0678.NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (module0678.NIL == var118) {
            var118 = (SubLObject)module0678.$ic465$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic466$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41486(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0038.f2735(module0642.f39110((SubLObject)module0678.$ic454$, var2, (SubLObject)module0678.$ic74$));
        final SubLObject var5 = module0642.f39110((SubLObject)module0678.$ic334$, var2, (SubLObject)module0678.$ic74$);
        if (module0678.NIL != module0038.f2608(var4) || module0678.NIL != module0038.f2608(var5)) {
            return f41484(f41487(var2, (SubLObject)module0678.$ic472$));
        }
        final SubLObject var6 = module0660.f40150(var4, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var7 = module0035.remove_if_not((SubLObject)module0678.$ic405$, var6, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL == var7) {
            return f41484(f41487(var2, (SubLObject)module0678.$ic473$));
        }
        if (module0678.NIL == module0035.f1997(var7)) {
            return f41484(f41487(var2, Sequences.cconcatenate((SubLObject)module0678.$ic474$, module0006.f203(var7))));
        }
        final SubLObject var8 = var7.first();
        var3.resetMultipleValues();
        final SubLObject var9 = module0574.f35160(var8, var5, module0678.$ic316$);
        final SubLObject var10 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (module0678.NIL != var9) {
            return module0669.f40790((SubLObject)module0678.$ic475$);
        }
        return f41484(f41487(var2, var10));
    }
    
    public static SubLObject f41487(final SubLObject var2, final SubLObject var9) {
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0678.$ic453$, var9), var2);
    }
    
    public static SubLObject f41488(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0678.NIL;
        SubLObject var5 = (SubLObject)module0678.NIL;
        SubLObject var6 = (SubLObject)module0678.NIL;
        SubLObject var7 = var2;
        SubLObject var8 = (SubLObject)module0678.NIL;
        var8 = var7.first();
        while (module0678.NIL != var7) {
            if (var8.isList()) {
                if (module0678.$ic479$.equal(var8.first())) {
                    var5 = (SubLObject)module0678.T;
                }
                if (module0678.$ic480$.equal(var8.first())) {
                    var4 = module0038.f2735(conses_high.second(var8));
                }
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        if (module0678.NIL != var4) {
            if (var4.equal((SubLObject)module0678.$ic74$)) {
                var6 = (SubLObject)module0678.$ic481$;
            }
            else if (module0678.NIL == Filesys.probe_file(var4)) {
                var6 = module0075.f5219(var4);
            }
        }
        if (module0678.NIL != var4 && module0678.NIL == var6) {
            if (module0678.NIL != var5) {
                var4 = Sequences.cconcatenate((SubLObject)module0678.$ic285$, var4);
            }
            f41489((SubLObject)ConsesLow.list(var4));
        }
        final SubLObject var9 = (SubLObject)module0678.$ic482$;
        final SubLObject var10 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var11 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var11) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var9) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var9);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_347 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_348 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_349 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_349, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var9) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var9);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var12 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var12) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var12);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_350 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var13 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var14 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic483$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic477$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0656.f39837((SubLObject)module0678.$ic484$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var14, var3);
                        module0015.$g541$.rebind(var13, var3);
                        module0015.$g533$.rebind(var4_350, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic485$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic486$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_351 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var15 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var16 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic487$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic488$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0678.$ic489$);
                        module0642.f39067();
                        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                        final SubLObject var17 = (module0678.NIL != var4) ? var4 : module0075.f5226(module0572.f35035());
                        module0642.f39139((SubLObject)module0678.$ic480$, var17, (SubLObject)module0678.$ic92$);
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        if (module0678.NIL != var6) {
                            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                            final SubLObject var18 = (SubLObject)module0678.$ic18$;
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            if (module0678.NIL != var18) {
                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                                module0642.f39020(module0642.f39042(var18));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                            final SubLObject var4_352 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)module0678.T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)module0678.$ic490$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                                module0642.f39019(var6);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_352, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                        }
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39074((SubLObject)module0678.$ic491$, (SubLObject)module0678.$ic479$, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39032((SubLObject)module0678.FOUR_INTEGER);
                        module0642.f39074((SubLObject)module0678.$ic492$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var16, var3);
                        module0015.$g541$.rebind(var15, var3);
                        module0015.$g533$.rebind(var4_351, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_348, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_347, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var10, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41489(final SubLObject var2) {
        final SubLObject var3 = module0038.f2684(var2.first(), (SubLObject)module0678.$ic285$);
        final SubLObject var4 = var2.first();
        if (module0678.NIL != var3) {
            f41490(module0038.f2667(var4, (SubLObject)module0678.$ic285$));
        }
        else {
            f41491(var4);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41491(final SubLObject var100) {
        f41447(var100);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41490(final SubLObject var355) {
        final SubLThread var356 = SubLProcess.currentSubLThread();
        final SubLObject var357 = module0572.f35063(var355);
        final SubLObject var358 = (SubLObject)module0678.$ic495$;
        final SubLObject var359 = module0015.$g538$.currentBinding(var356);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var356))) ? module0015.$g538$.getDynamicValue(var356) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var356);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var356), module0655.$g5142$.getDynamicValue(var356));
            final SubLObject var360 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var360) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var360);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var358) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var358);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_356 = module0015.$g535$.currentBinding(var356);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var356);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var356)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var356)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_357 = module0015.$g533$.currentBinding(var356);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var356);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_358 = module0015.$g533$.currentBinding(var356);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var356);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_358, var356);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var358) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var358);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var356));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_359 = module0015.$g533$.currentBinding(var356);
                    final SubLObject var361 = module0015.$g541$.currentBinding(var356);
                    final SubLObject var362 = module0015.$g539$.currentBinding(var356);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var356);
                        module0015.$g541$.bind((SubLObject)module0678.T, var356);
                        module0015.$g539$.bind(module0015.f797(), var356);
                        module0656.f39790((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic496$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        final SubLObject var363 = module0656.f39832((SubLObject)module0678.$ic39$);
                        module0642.f39020(module0015.$g381$.getGlobalValue());
                        module0642.f39020(module0015.$g383$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0655.f39768();
                        module0642.f39019(Sequences.cconcatenate((SubLObject)module0678.$ic284$, var355));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        if (module0678.NIL != var363) {
                            module0642.f39020(module0015.$g387$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(var363);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        final SubLObject var4_360 = module0015.$g533$.currentBinding(var356);
                        try {
                            module0015.$g533$.bind((SubLObject)module0678.T, var356);
                            module0642.f39019(var355);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_360, var356);
                        }
                        module0642.f39020(module0015.$g382$.getGlobalValue());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic295$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(var357.first());
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic497$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(conses_high.list_length(conses_high.second(var357)));
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        SubLObject var364 = conses_high.second(var357);
                        SubLObject var365 = (SubLObject)module0678.NIL;
                        var365 = var364.first();
                        while (module0678.NIL != var364) {
                            final SubLObject var366 = constants_high_oc.f10737(conses_high.third(var365));
                            if (module0678.NIL != var366) {
                                module0656.f39804(var366, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            }
                            else {
                                module0642.f39019(conses_high.third(var365));
                            }
                            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                            module0642.f39028((SubLObject)module0678.UNPROVIDED);
                            var364 = var364.rest();
                            var365 = var364.first();
                        }
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic498$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(conses_high.list_length(conses_high.third(var357)));
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        var364 = conses_high.third(var357);
                        SubLObject var367 = (SubLObject)module0678.NIL;
                        var367 = var364.first();
                        while (module0678.NIL != var364) {
                            module0642.f39019(conses_high.third(var367));
                            module0642.f39019((SubLObject)module0678.$ic499$);
                            final SubLObject var366 = constants_high_oc.f10737(conses_high.fourth(var367));
                            if (module0678.NIL != var366) {
                                module0656.f39804(var366, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            }
                            else {
                                module0642.f39019(conses_high.fourth(var367));
                            }
                            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                            module0642.f39028((SubLObject)module0678.UNPROVIDED);
                            var364 = var364.rest();
                            var367 = var364.first();
                        }
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0678.$ic500$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(conses_high.list_length(conses_high.fourth(var357)));
                        module0642.f39026((SubLObject)module0678.UNPROVIDED);
                        var364 = conses_high.fourth(var357);
                        SubLObject var368 = (SubLObject)module0678.NIL;
                        var368 = var364.first();
                        while (module0678.NIL != var364) {
                            module0642.f39019(conses_high.third(var368));
                            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                            module0642.f39028((SubLObject)module0678.UNPROVIDED);
                            var364 = var364.rest();
                            var368 = var364.first();
                        }
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        module0015.f799(module0015.$g539$.getDynamicValue(var356));
                    }
                    finally {
                        module0015.$g539$.rebind(var362, var356);
                        module0015.$g541$.rebind(var361, var356);
                        module0015.$g533$.rebind(var4_359, var356);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_357, var356);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_356, var356);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var359, var356);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41492() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0572.f35044();
        if (module0678.NIL == var2) {
            module0642.f39019((SubLObject)module0678.$ic501$);
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0678.$ic502$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
            SubLObject var3 = Sequences.reverse(module0572.f35044());
            SubLObject var4 = (SubLObject)module0678.NIL;
            var4 = var3.first();
            while (module0678.NIL != var3) {
                SubLObject var5 = module0656.f39832((SubLObject)module0678.$ic39$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0655.f39768();
                module0642.f39019(Sequences.cconcatenate((SubLObject)module0678.$ic503$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                if (module0678.NIL != var5) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                SubLObject var6 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019((SubLObject)module0678.$ic491$);
                }
                finally {
                    module0015.$g533$.rebind(var6, var1);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39032((SubLObject)module0678.FIVE_INTEGER);
                var5 = module0656.f39832((SubLObject)module0678.$ic39$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0655.f39768();
                module0642.f39019(Sequences.cconcatenate((SubLObject)module0678.$ic284$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                if (module0678.NIL != var5) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                var6 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var1);
                    module0642.f39019(var4);
                }
                finally {
                    module0015.$g533$.rebind(var6, var1);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41493(SubLObject var118) {
        if (var118 == module0678.UNPROVIDED) {
            var118 = (SubLObject)module0678.NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (module0678.NIL == var118) {
            var118 = (SubLObject)module0678.$ic505$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic487$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41494(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0678.$ic513$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var4) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_365 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_366 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_367 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_367, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_368 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic514$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic511$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        final SubLObject var10 = module0575.f35243();
                        if (var10.numE((SubLObject)module0678.ZERO_INTEGER)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic515$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic38$);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic516$);
                            if (var10.numG((SubLObject)module0678.ONE_INTEGER)) {
                                module0642.f39019((SubLObject)module0678.$ic517$);
                            }
                            module0642.f39019((SubLObject)module0678.$ic518$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic519$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39032((SubLObject)module0678.THREE_INTEGER);
                            module0642.f39074((SubLObject)module0678.$ic520$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39026((SubLObject)module0678.UNPROVIDED);
                            module0642.f39051((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic521$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                            SubLObject var12;
                            final SubLObject var11 = var12 = module0575.f35249();
                            SubLObject var13 = (SubLObject)module0678.NIL;
                            var13 = var12.first();
                            while (module0678.NIL != var12) {
                                var13 = f41425(var13);
                                module0656.f39804(var13, (SubLObject)module0678.ZERO_INTEGER, (SubLObject)module0678.T);
                                module0642.f39026((SubLObject)module0678.UNPROVIDED);
                                var12 = var12.rest();
                                var13 = var12.first();
                            }
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_368, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_366, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_365, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41495(SubLObject var146) {
        if (var146 == module0678.UNPROVIDED) {
            var146 = (SubLObject)module0678.NIL;
        }
        final SubLThread var147 = SubLProcess.currentSubLThread();
        if (module0678.NIL == var146) {
            var146 = (SubLObject)module0678.$ic523$;
        }
        final SubLObject var148 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic524$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41496(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0678.$ic520$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var4) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_372 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_373 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_374 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_374, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_375 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic528$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic526$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        final SubLObject var10 = module0575.f35243();
                        if (var10.numE((SubLObject)module0678.ZERO_INTEGER)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic515$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic529$);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic530$);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic531$);
                            module0642.f39026((SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic532$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0678.UNPROVIDED);
                            module0656.f39790((SubLObject)module0678.$ic137$, (SubLObject)module0678.$ic57$);
                            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                            module0642.f39074((SubLObject)module0678.$ic533$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_375, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_373, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_372, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41497(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)module0678.$ic520$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((module0678.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED), var3);
            module0642.f39020((SubLObject)module0678.$ic6$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)module0678.$ic7$);
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            if (module0678.NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020((SubLObject)module0678.$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
            module0016.f941();
            if (module0678.NIL != var4) {
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
            final SubLObject var4_376 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)module0678.T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0678.NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39020((SubLObject)module0678.$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                final SubLObject var4_377 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)module0678.T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_378 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020((SubLObject)module0678.$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019((SubLObject)module0678.$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_378, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0678.NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0678.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)module0678.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    module0642.f39020((SubLObject)module0678.$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    if (module0678.NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
                    final SubLObject var4_379 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)module0678.T, var3);
                        module0015.$g541$.bind((SubLObject)module0678.T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)module0678.$ic537$, (SubLObject)module0678.T, (SubLObject)module0678.UNPROVIDED);
                        module0656.f39870((SubLObject)module0678.$ic535$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        module0642.f39026((SubLObject)module0678.TWO_INTEGER);
                        final SubLObject var10 = module0575.f35243();
                        if (var10.numE((SubLObject)module0678.ZERO_INTEGER)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic538$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            while (module0678.NIL == module0593.f36267()) {
                                module0593.f36268((SubLObject)module0678.TWO_INTEGER);
                            }
                            module0656.f39793((SubLObject)module0678.$ic539$, (SubLObject)module0678.T);
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic529$);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic530$);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic540$);
                            module0642.f39026((SubLObject)module0678.UNPROVIDED);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)module0678.$ic532$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0678.UNPROVIDED);
                            module0656.f39790((SubLObject)module0678.$ic137$, (SubLObject)module0678.$ic57$);
                            module0642.f39032((SubLObject)module0678.TWO_INTEGER);
                            module0642.f39074((SubLObject)module0678.$ic541$, (SubLObject)module0678.UNPROVIDED, (SubLObject)module0678.UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_379, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0678.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_377, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0678.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_376, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0678.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41498(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic543$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41499(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0656.f39832((SubLObject)module0678.$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0678.$ic514$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        if (module0678.NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0678.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0678.UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)module0678.T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41500(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        module0575.f35245();
        while (module0678.NIL == module0593.f36267()) {
            module0593.f36268((SubLObject)module0678.TWO_INTEGER);
        }
        module0656.f39793((SubLObject)module0678.$ic539$, (SubLObject)module0678.T);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41501(SubLObject var2) {
        if (var2 == module0678.UNPROVIDED) {
            var2 = (SubLObject)module0678.NIL;
        }
        module0575.f35245();
        module0656.f39793((SubLObject)module0678.$ic547$, (SubLObject)module0678.T);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41410() {
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41502() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41402", "S#45411", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41403", "CB-MODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41405", "S#45412", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41408", "S#45413", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41404", "S#45414", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41406", "S#45415", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41407", "S#45416", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41409", "S#45417", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41411", "S#45418", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41412", "CB-MODE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41414", "S#45419", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41413", "S#45420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41416", "S#45421", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41415", "S#45422", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41417", "CB-HANDLE-OE-PATCH-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41418", "S#45423", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41419", "S#45424", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41420", "S#45425", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41421", "CB-ROLL-CURRENT-KB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41422", "CB-HANDLE-ROLL-CURRENT-KB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41423", "S#45426", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41424", "CB-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41429", "S#45427", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41430", "CB-ABORT-AGENDA", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41426", "S#45428", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41431", "CB-TOGGLE-AGENDA-STATUS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41427", "S#45429", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41432", "CB-AGENDA-ERROR-MODE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41428", "S#45430", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41433", "S#45431", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41434", "CB-AGENDA-ERROR-FILE-VIEWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41435", "S#45432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41436", "S#45433", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41437", "CB-SYSTEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41438", "S#45434", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41440", "S#45435", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41439", "S#45436", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41441", "S#45437", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41442", "S#45438", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41444", "S#45439", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41445", "S#45440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41443", "S#45441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41446", "CB-SYSTEM-READY-TRANSCRIPT-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41447", "S#45442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41448", "S#45443", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41425", "S#45444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41449", "CB-CHOOSE-PROJECT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41450", "S#45445", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41451", "CB-CHOOSE-PROJECT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41452", "S#45446", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41453", "S#45447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41455", "S#45448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41454", "S#45449", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41456", "S#45450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41457", "S#41779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41458", "CB-LOGIN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41460", "CB-FORCE-LOGOUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41461", "S#45451", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41459", "S#45452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41462", "S#45453", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41463", "CB-NOTIFY-ALL-USERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41465", "S#45454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41464", "S#45455", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41468", "S#45456", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41469", "S#45457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41470", "S#45458", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41467", "S#45459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41466", "S#45460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41471", "CB-SEND-EMAIL-TO-SELECTED-USERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41472", "S#45461", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41473", "CB-LOGIN-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41474", "S#45462", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41475", "S#45463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41479", "S#45464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41477", "S#45465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41476", "S#45466", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41480", "S#45467", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41478", "S#45468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41481", "CB-CREATE-NEW-CYCLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41482", "CB-LOGOUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41483", "S#45469", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41484", "CB-SET-PASSWORD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41485", "S#45470", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41486", "CB-SET-PASSWORD-HANDLER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41487", "S#45471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41488", "CB-TRANSCRIPT-VIEWER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41489", "CB-TRANSCRIPT-VIEWER-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41491", "S#45472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41490", "S#45473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41492", "S#45474", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41493", "S#45475", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41494", "CB-SHOW-LOCAL-OPS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41495", "S#45476", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41496", "CB-CONFIRM-CLEAR-LOCAL-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41497", "CB-CONFIRM-CLEAR-LOCAL-AND-RESTART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41498", "S#45477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41499", "S#45478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41500", "CB-CLEAR-LOCAL-AND-RESTART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41501", "CB-CLEAR-LOCAL-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0678", "f41410", "S#45479", 0, 0, false);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41503() {
        module0678.$g5332$ = SubLFiles.defparameter("S#45480", (SubLObject)module0678.$ic1$);
        module0678.$g5333$ = SubLFiles.deflexical("S#45481", (module0678.NIL != Symbols.boundp((SubLObject)module0678.$ic64$)) ? module0678.$g5333$.getGlobalValue() : module0678.$ic65$);
        module0678.$g5334$ = SubLFiles.deflexical("S#45482", (SubLObject)((module0678.NIL != Symbols.boundp((SubLObject)module0678.$ic66$)) ? module0678.$g5334$.getGlobalValue() : module0678.NIL));
        module0678.$g5335$ = SubLFiles.deflexical("S#45483", (SubLObject)((module0678.NIL != Symbols.boundp((SubLObject)module0678.$ic73$)) ? module0678.$g5335$.getGlobalValue() : module0678.$ic74$));
        module0678.$g5336$ = SubLFiles.deflexical("S#45484", (SubLObject)((module0678.NIL != Symbols.boundp((SubLObject)module0678.$ic75$)) ? module0678.$g5336$.getGlobalValue() : module0678.$ic74$));
        module0678.$g5337$ = SubLFiles.defparameter("S#45485", (SubLObject)module0678.$ic151$);
        module0678.$g5201$ = SubLFiles.defparameter("S#45486", (SubLObject)module0678.NIL);
        module0678.$g5338$ = SubLFiles.deflexical("S#45487", (SubLObject)module0678.NIL);
        module0678.$g5339$ = SubLFiles.deflexical("S#45488", (SubLObject)module0678.$ic422$);
        return (SubLObject)module0678.NIL;
    }
    
    public static SubLObject f41504() {
        Hashtables.sethash((SubLObject)module0678.$ic2$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic3$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic25$);
        module0003.f57((SubLObject)module0678.$ic64$);
        module0003.f57((SubLObject)module0678.$ic66$);
        module0015.f873((SubLObject)module0678.$ic68$);
        module0656.f39840((SubLObject)module0678.$ic71$, (SubLObject)module0678.$ic72$, (SubLObject)module0678.ZERO_INTEGER);
        module0003.f57((SubLObject)module0678.$ic73$);
        module0003.f57((SubLObject)module0678.$ic75$);
        Hashtables.sethash((SubLObject)module0678.$ic76$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic77$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic122$);
        module0656.f39840((SubLObject)module0678.$ic139$, (SubLObject)module0678.$ic140$, (SubLObject)module0678.ONE_INTEGER);
        Hashtables.sethash((SubLObject)module0678.$ic141$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic142$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic149$);
        module0015.f873((SubLObject)module0678.$ic150$);
        Hashtables.sethash((SubLObject)module0678.$ic153$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic154$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic169$);
        module0656.f39840((SubLObject)module0678.$ic172$, (SubLObject)module0678.$ic173$, (SubLObject)module0678.ZERO_INTEGER);
        module0015.f873((SubLObject)module0678.$ic175$);
        module0015.f873((SubLObject)module0678.$ic190$);
        module0015.f873((SubLObject)module0678.$ic215$);
        module0656.f39840((SubLObject)module0678.$ic200$, (SubLObject)module0678.$ic225$, (SubLObject)module0678.ONE_INTEGER);
        module0015.f873((SubLObject)module0678.$ic227$);
        module0656.f39840((SubLObject)module0678.$ic229$, (SubLObject)module0678.$ic230$, (SubLObject)module0678.ONE_INTEGER);
        module0656.f39840((SubLObject)module0678.$ic232$, (SubLObject)module0678.$ic233$, (SubLObject)module0678.ZERO_INTEGER);
        Hashtables.sethash((SubLObject)module0678.$ic234$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic235$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic239$);
        module0656.f39840((SubLObject)module0678.$ic264$, (SubLObject)module0678.$ic278$, (SubLObject)module0678.ZERO_INTEGER);
        module0656.f39840((SubLObject)module0678.$ic269$, (SubLObject)module0678.$ic280$, (SubLObject)module0678.ZERO_INTEGER);
        module0656.f39840((SubLObject)module0678.$ic282$, (SubLObject)module0678.$ic283$, (SubLObject)module0678.ONE_INTEGER);
        module0015.f873((SubLObject)module0678.$ic288$);
        Hashtables.sethash((SubLObject)module0678.$ic291$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic292$, (SubLObject)module0678.NIL));
        Hashtables.sethash((SubLObject)module0678.$ic298$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic299$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic306$);
        module0015.f873((SubLObject)module0678.$ic311$);
        module0656.f39840((SubLObject)module0678.$ic314$, (SubLObject)module0678.$ic315$, (SubLObject)module0678.ONE_INTEGER);
        Hashtables.sethash((SubLObject)module0678.$ic321$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic322$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic350$);
        module0015.f873((SubLObject)module0678.$ic354$);
        module0656.f39840((SubLObject)module0678.$ic344$, (SubLObject)module0678.$ic357$, (SubLObject)module0678.TWO_INTEGER);
        module0656.f39840((SubLObject)module0678.$ic349$, (SubLObject)module0678.$ic364$, (SubLObject)module0678.ZERO_INTEGER);
        module0015.f873((SubLObject)module0678.$ic379$);
        module0034.f1909((SubLObject)module0678.$ic383$);
        module0015.f873((SubLObject)module0678.$ic400$);
        module0656.f39840((SubLObject)module0678.$ic403$, (SubLObject)module0678.$ic404$, (SubLObject)module0678.ONE_INTEGER);
        module0015.f873((SubLObject)module0678.$ic407$);
        module0015.f873((SubLObject)module0678.$ic443$);
        Hashtables.sethash((SubLObject)module0678.$ic10$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic444$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic449$);
        module0656.f39840((SubLObject)module0678.$ic329$, (SubLObject)module0678.$ic452$, (SubLObject)module0678.ONE_INTEGER);
        module0015.f873((SubLObject)module0678.$ic464$);
        module0656.f39840((SubLObject)module0678.$ic467$, (SubLObject)module0678.$ic468$, (SubLObject)module0678.ONE_INTEGER);
        module0656.f39819((SubLObject)module0678.$ic467$, (SubLObject)module0678.$ic469$, (SubLObject)module0678.$ic470$, (SubLObject)module0678.$ic471$);
        module0015.f873((SubLObject)module0678.$ic476$);
        Hashtables.sethash((SubLObject)module0678.$ic477$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic478$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic493$);
        module0015.f873((SubLObject)module0678.$ic494$);
        module0656.f39840((SubLObject)module0678.$ic484$, (SubLObject)module0678.$ic504$, (SubLObject)module0678.ZERO_INTEGER);
        module0656.f39840((SubLObject)module0678.$ic506$, (SubLObject)module0678.$ic507$, (SubLObject)module0678.ONE_INTEGER);
        module0656.f39819((SubLObject)module0678.$ic506$, (SubLObject)module0678.$ic508$, (SubLObject)module0678.$ic509$, (SubLObject)module0678.$ic510$);
        Hashtables.sethash((SubLObject)module0678.$ic511$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic512$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic522$);
        module0656.f39840((SubLObject)module0678.$ic217$, (SubLObject)module0678.$ic525$, (SubLObject)module0678.ONE_INTEGER);
        Hashtables.sethash((SubLObject)module0678.$ic526$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic527$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic534$);
        Hashtables.sethash((SubLObject)module0678.$ic535$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0678.$ic536$, (SubLObject)module0678.NIL));
        module0015.f873((SubLObject)module0678.$ic542$);
        module0656.f39840((SubLObject)module0678.$ic221$, (SubLObject)module0678.$ic544$, (SubLObject)module0678.ONE_INTEGER);
        module0656.f39840((SubLObject)module0678.$ic219$, (SubLObject)module0678.$ic545$, (SubLObject)module0678.ONE_INTEGER);
        module0015.f873((SubLObject)module0678.$ic546$);
        module0015.f873((SubLObject)module0678.$ic548$);
        return (SubLObject)module0678.NIL;
    }
    
    public void declareFunctions() {
        f41502();
    }
    
    public void initializeVariables() {
        f41503();
    }
    
    public void runTopLevelForms() {
        f41504();
    }
    
    static {
        me = (SubLFile)new module0678();
        module0678.$g5332$ = null;
        module0678.$g5333$ = null;
        module0678.$g5334$ = null;
        module0678.$g5335$ = null;
        module0678.$g5336$ = null;
        module0678.$g5337$ = null;
        module0678.$g5201$ = null;
        module0678.$g5338$ = null;
        module0678.$g5339$ = null;
        $ic0$ = SubLObjectFactory.makeString("~Aref/system.html");
        $ic1$ = SubLObjectFactory.makeString("com-modes");
        $ic2$ = SubLObjectFactory.makeKeyword("CB-MODE");
        $ic3$ = SubLObjectFactory.makeString("cb-mode.html");
        $ic4$ = SubLObjectFactory.makeString("Cyc communication status changing facilities");
        $ic5$ = SubLObjectFactory.makeString("Communication Status Area");
        $ic6$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic7$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic8$ = SubLObjectFactory.makeString("stylesheet");
        $ic9$ = SubLObjectFactory.makeString("text/css");
        $ic10$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic11$ = SubLObjectFactory.makeString("text/javascript");
        $ic12$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic13$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic14$ = SubLObjectFactory.makeString("button");
        $ic15$ = SubLObjectFactory.makeString("reload");
        $ic16$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic17$ = SubLObjectFactory.makeString("message");
        $ic18$ = SubLObjectFactory.makeKeyword("RED");
        $ic19$ = SubLObjectFactory.makeString("post");
        $ic20$ = SubLObjectFactory.makeString("cb-mode-handler");
        $ic21$ = SubLObjectFactory.makeString("Current Value");
        $ic22$ = SubLObjectFactory.makeString("Submit");
        $ic23$ = SubLObjectFactory.makeString("You can not change your transmitting status until you empty ");
        $ic24$ = SubLObjectFactory.makeString("your local transcript by either sending or clearing it");
        $ic25$ = SubLObjectFactory.makeSymbol("CB-MODE");
        $ic26$ = SubLObjectFactory.makeString("What Do You Want To Do With Processed Operations?");
        $ic27$ = SubLObjectFactory.makeString("transmit-mode");
        $ic28$ = SubLObjectFactory.makeString("transmit");
        $ic29$ = SubLObjectFactory.makeString("Send Immediately To Everybody");
        $ic30$ = SubLObjectFactory.makeString("store");
        $ic31$ = SubLObjectFactory.makeString("Store For Later");
        $ic32$ = SubLObjectFactory.makeString("none");
        $ic33$ = SubLObjectFactory.makeString("Do Not Record");
        $ic34$ = SubLObjectFactory.makeString("Send KB Check Point for: ");
        $ic35$ = SubLObjectFactory.makeString("kb_checkpoint_to_send");
        $ic36$ = SubLObjectFactory.makeString("Currently, you are not allowed to send operations, most likely because you are not in the current KB.");
        $ic37$ = SubLObjectFactory.makeString("Try receiving operations if you wish to send.");
        $ic38$ = SubLObjectFactory.makeString("You have ");
        $ic39$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic40$ = SubLObjectFactory.makeString("cb-system-ready-transcript-file&write");
        $ic41$ = SubLObjectFactory.makeString(" operations");
        $ic42$ = SubLObjectFactory.makeString(" stored.");
        $ic43$ = SubLObjectFactory.makeString("send");
        $ic44$ = SubLObjectFactory.makeString("Send Stored Operations Now");
        $ic45$ = SubLObjectFactory.makeString("clear");
        $ic46$ = SubLObjectFactory.makeString("Clear Stored Operations");
        $ic47$ = SubLObjectFactory.makeString("Note:");
        $ic48$ = SubLObjectFactory.makeString(" All of the above options will start a new local transcript");
        $ic49$ = SubLObjectFactory.makeString("You still have ");
        $ic50$ = SubLObjectFactory.makeString(" unprocessed operations on your local queue.  You can not change your transmitting status until the queue has been processed.");
        $ic51$ = SubLObjectFactory.makeString("Do You Want To Receive Operations From Others?");
        $ic52$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic53$ = SubLObjectFactory.makeKeyword("TOP");
        $ic54$ = SubLObjectFactory.makeString("receive-mode");
        $ic55$ = SubLObjectFactory.makeString("no");
        $ic56$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic57$ = SubLObjectFactory.makeString("No");
        $ic58$ = SubLObjectFactory.makeString("yes");
        $ic59$ = SubLObjectFactory.makeString("Yes");
        $ic60$ = SubLObjectFactory.makeString("kb_checkpoint?");
        $ic61$ = SubLObjectFactory.makeString("Receive only up to KB Check Point :");
        $ic62$ = SubLObjectFactory.makeString("kb_checkpoint");
        $ic63$ = SubLObjectFactory.makeKeyword("USE-CURRENT-CHECK-POINT");
        $ic64$ = SubLObjectFactory.makeSymbol("S#45481", "CYC");
        $ic65$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Cyc-BasedProject"));
        $ic66$ = SubLObjectFactory.makeSymbol("S#45482", "CYC");
        $ic67$ = SubLObjectFactory.makeString("filters?");
        $ic68$ = SubLObjectFactory.makeSymbol("CB-MODE-HANDLER");
        $ic69$ = SubLObjectFactory.makeString("cb-mode");
        $ic70$ = SubLObjectFactory.makeString("Comm:");
        $ic71$ = SubLObjectFactory.makeKeyword("MODE");
        $ic72$ = SubLObjectFactory.makeSymbol("S#45419", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#45483", "CYC");
        $ic74$ = SubLObjectFactory.makeString("");
        $ic75$ = SubLObjectFactory.makeSymbol("S#45484", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("DISPLAY-OE-PATCH-MESSAGE");
        $ic77$ = SubLObjectFactory.makeString("display-oe-patch-message.html");
        $ic78$ = SubLObjectFactory.makeString("notes");
        $ic79$ = SubLObjectFactory.makeString("builder");
        $ic80$ = SubLObjectFactory.makeString("SENT");
        $ic81$ = SubLObjectFactory.makeString("OE Patch Message");
        $ic82$ = SubLObjectFactory.makeString("cb-handle-oe-patch-message");
        $ic83$ = SubLObjectFactory.makeString("window.open('");
        $ic84$ = SubLObjectFactory.makeString("',");
        $ic85$ = SubLObjectFactory.makeString("'~A'");
        $ic86$ = SubLObjectFactory.makeString("null");
        $ic87$ = SubLObjectFactory.makeString(",'~A'); ");
        $ic88$ = SubLObjectFactory.makeString("return false;");
        $ic89$ = SubLObjectFactory.makeString("Enter a short description to go in the subject of the email message, and a longer description in the \"Patch Message\" if warranted.  To not send a message at all, remove all email addresses from the \"To\" line.   ");
        $ic90$ = SubLObjectFactory.makeString("To: ");
        $ic91$ = SubLObjectFactory.makeString("to");
        $ic92$ = SubLObjectFactory.makeInteger(80);
        $ic93$ = SubLObjectFactory.makeString("Short Description: ");
        $ic94$ = SubLObjectFactory.makeString("subj");
        $ic95$ = SubLObjectFactory.makeString("Patch Message: ");
        $ic96$ = SubLObjectFactory.makeInteger(100);
        $ic97$ = SubLObjectFactory.makeString("virtual");
        $ic98$ = SubLObjectFactory.makeString("send-message?");
        $ic99$ = SubLObjectFactory.makeString("Transmit and Send Patch Message");
        $ic100$ = SubLObjectFactory.makeString(" ");
        $ic101$ = SubLObjectFactory.makeString("Transmit without Patch Message");
        $ic102$ = SubLObjectFactory.makeString("OE Patch (kb=");
        $ic103$ = SubLObjectFactory.makeString("): ");
        $ic104$ = SubLObjectFactory.makeInteger(1000);
        $ic105$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45489", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38468", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38469", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38470", "CYC"));
        $ic106$ = SubLObjectFactory.makeString("~A");
        $ic107$ = SubLObjectFactory.makeString("Submitted");
        $ic108$ = SubLObjectFactory.makeString("Transmitted");
        $ic109$ = SubLObjectFactory.makeString(" from KB: ~A~%~%");
        $ic110$ = SubLObjectFactory.makeString("Patch Description:~%~%");
        $ic111$ = SubLObjectFactory.makeString("~S~%");
        $ic112$ = SubLObjectFactory.makeString("~%Transcript: ~A~%");
        $ic113$ = SubLObjectFactory.makeString("Total Operations: ~A~%");
        $ic114$ = SubLObjectFactory.makeString("~%Killed Constants: ~%");
        $ic115$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38471", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13925", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"));
        $ic116$ = SubLObjectFactory.makeString("~A~%");
        $ic117$ = SubLObjectFactory.makeString("[and ~A more]~%");
        $ic118$ = SubLObjectFactory.makeString("~%Renames: ~%");
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38471", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#38472", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13498", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13925", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("WHEN"));
        $ic120$ = SubLObjectFactory.makeString("~A -> ~A~%");
        $ic121$ = SubLObjectFactory.makeString("~%New Constants: ~%");
        $ic122$ = SubLObjectFactory.makeSymbol("CB-HANDLE-OE-PATCH-MESSAGE");
        $ic123$ = SubLObjectFactory.makeString("Mail not sent due to invalid from (");
        $ic124$ = SubLObjectFactory.makeString(") or to (");
        $ic125$ = SubLObjectFactory.makeString(") address");
        $ic126$ = SubLObjectFactory.makeString("sent");
        $ic127$ = SubLObjectFactory.makeString("submitted");
        $ic128$ = SubLObjectFactory.makeString("Transcript ");
        $ic129$ = SubLObjectFactory.makeString(", but no mail sent.");
        $ic130$ = SubLObjectFactory.makeString(", but mail message encountered error: ");
        $ic131$ = SubLObjectFactory.makeInteger(5000);
        $ic132$ = SubLObjectFactory.makeString("~%---------------------~%");
        $ic133$ = SubLObjectFactory.makeString("Transcript as KE Text ~%");
        $ic134$ = SubLObjectFactory.makeString(";;[and ~A more operations]~%");
        $ic135$ = SubLObjectFactory.makeString("[Roll to KB ");
        $ic136$ = SubLObjectFactory.makeString("]");
        $ic137$ = SubLObjectFactory.makeKeyword("SELF");
        $ic138$ = SubLObjectFactory.makeString("cb-roll-current-kb");
        $ic139$ = SubLObjectFactory.makeKeyword("ROLL-CURRENT-KB");
        $ic140$ = SubLObjectFactory.makeSymbol("S#45425", "CYC");
        $ic141$ = SubLObjectFactory.makeKeyword("CB-REMOTE-FILTERS");
        $ic142$ = SubLObjectFactory.makeString("cb-remote-filters.html");
        $ic143$ = SubLObjectFactory.makeString("Rolling the KB");
        $ic144$ = SubLObjectFactory.makeString("Roll to KB ");
        $ic145$ = SubLObjectFactory.makeString("cb-handle-roll-current-kb");
        $ic146$ = SubLObjectFactory.makeString("WARNING:");
        $ic147$ = SubLObjectFactory.makeString("Rolling the KB is will filter every operation until the start of the next KB.");
        $ic148$ = SubLObjectFactory.makeString("Do you still want to roll to KB ~S ?");
        $ic149$ = SubLObjectFactory.makeSymbol("CB-ROLL-CURRENT-KB");
        $ic150$ = SubLObjectFactory.makeSymbol("CB-HANDLE-ROLL-CURRENT-KB");
        $ic151$ = SubLObjectFactory.makeString("cyc-agenda");
        $ic152$ = SubLObjectFactory.makeString("Agenda halted due to:");
        $ic153$ = SubLObjectFactory.makeKeyword("CB-AGENDA");
        $ic154$ = SubLObjectFactory.makeString("cb-agenda.html");
        $ic155$ = SubLObjectFactory.makeString("The Cyc Agenda Control Facilities");
        $ic156$ = SubLObjectFactory.makeString("Agenda Process Control");
        $ic157$ = SubLObjectFactory.makeString("cb-abort-agenda");
        $ic158$ = SubLObjectFactory.makeString("Here you control the turning on and off of your Cyc Agenda.");
        $ic159$ = SubLObjectFactory.makeString("Currently, your Agenda is ");
        $ic160$ = SubLObjectFactory.makeString("running");
        $ic161$ = SubLObjectFactory.makeString("halted");
        $ic162$ = SubLObjectFactory.makeString(".");
        $ic163$ = SubLObjectFactory.makeKeyword("HALT");
        $ic164$ = SubLObjectFactory.makeString("Run");
        $ic165$ = SubLObjectFactory.makeString("Current");
        $ic166$ = SubLObjectFactory.makeString("Last");
        $ic167$ = SubLObjectFactory.makeString(" Agenda operation:");
        $ic168$ = SubLObjectFactory.makeString("Abort Operation");
        $ic169$ = SubLObjectFactory.makeSymbol("CB-AGENDA");
        $ic170$ = SubLObjectFactory.makeString("cb-agenda");
        $ic171$ = SubLObjectFactory.makeString("Agenda:");
        $ic172$ = SubLObjectFactory.makeKeyword("AGENDA");
        $ic173$ = SubLObjectFactory.makeSymbol("S#45427", "CYC");
        $ic174$ = SubLObjectFactory.makeString("The agenda is no longer running.");
        $ic175$ = SubLObjectFactory.makeSymbol("CB-ABORT-AGENDA");
        $ic176$ = SubLObjectFactory.makeString("cb-toggle-agenda-status");
        $ic177$ = SubLObjectFactory.makeString("Click the button to change your Agenda status:");
        $ic178$ = SubLObjectFactory.makeString("Halt Agenda");
        $ic179$ = SubLObjectFactory.makeString("Start Agenda");
        $ic180$ = SubLObjectFactory.makeString("--For detailed help on the Cyc agenda, read the ");
        $ic181$ = SubLObjectFactory.makeString("~A#~A");
        $ic182$ = SubLObjectFactory.makeString("Cyc Agenda Documentation");
        $ic183$ = SubLObjectFactory.makeString("Agenda Process Changed");
        $ic184$ = SubLObjectFactory.makeString("Halting the Agenda ...");
        $ic185$ = SubLObjectFactory.makeString("Starting the Agenda ...");
        $ic186$ = SubLObjectFactory.makeString("Your Cyc Agenda is now ");
        $ic187$ = SubLObjectFactory.makeString("Your Cyc Agenda is still ");
        $ic188$ = SubLObjectFactory.makeString("When it finishes its current operation, its state will change as you requested.");
        $ic189$ = SubLObjectFactory.makeString("Agenda");
        $ic190$ = SubLObjectFactory.makeSymbol("CB-TOGGLE-AGENDA-STATUS");
        $ic191$ = SubLObjectFactory.makeString("cb-agenda-error-mode-handler");
        $ic192$ = SubLObjectFactory.makeString("Currently, when Cyc encounters an error with local operations within the Agenda it:");
        $ic193$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic194$ = SubLObjectFactory.makeString("Continues, ignoring the error.");
        $ic195$ = SubLObjectFactory.makeString("Halts the Agenda and displays the reasons.");
        $ic196$ = SubLObjectFactory.makeKeyword("DEBUG");
        $ic197$ = SubLObjectFactory.makeString("Enters the debugger.");
        $ic198$ = SubLObjectFactory.makeKeyword("LOG");
        $ic199$ = SubLObjectFactory.makeString("Logs the error and continues.");
        $ic200$ = SubLObjectFactory.makeKeyword("AGENDA-ERROR-FILE");
        $ic201$ = SubLObjectFactory.makeString("Illegal state in cb-agenda-error-mode-display.");
        $ic202$ = SubLObjectFactory.makeString("Choose the new error handling mode below and select [");
        $ic203$ = SubLObjectFactory.makeString("Submit New Mode");
        $ic204$ = SubLObjectFactory.makeString("] to initiate the change:");
        $ic205$ = SubLObjectFactory.makeString("agenda-error-state");
        $ic206$ = SubLObjectFactory.makeString(":ignore");
        $ic207$ = SubLObjectFactory.makeString("Ignore and Continue");
        $ic208$ = SubLObjectFactory.makeString(":halt");
        $ic209$ = SubLObjectFactory.makeString("Halt and Display Reason");
        $ic210$ = SubLObjectFactory.makeString(":log");
        $ic211$ = SubLObjectFactory.makeString("Log Errors to File");
        $ic212$ = SubLObjectFactory.makeString("pathname");
        $ic213$ = SubLObjectFactory.makeInteger(60);
        $ic214$ = SubLObjectFactory.makeString("Current Mode");
        $ic215$ = SubLObjectFactory.makeSymbol("CB-AGENDA-ERROR-MODE-HANDLER");
        $ic216$ = SubLObjectFactory.makeString(" operations waiting in your local queue.");
        $ic217$ = SubLObjectFactory.makeKeyword("SHOW-LOCAL-OPS");
        $ic218$ = SubLObjectFactory.makeString("Look at the operations in the local queue.");
        $ic219$ = SubLObjectFactory.makeKeyword("DELETE-LOCAL-OPS");
        $ic220$ = SubLObjectFactory.makeString("Delete the local queue.");
        $ic221$ = SubLObjectFactory.makeKeyword("DELETE-LOCAL-AND-RESTART");
        $ic222$ = SubLObjectFactory.makeString("Delete the local queue and restart agenda.");
        $ic223$ = SubLObjectFactory.makeString("cb-agenda-error-file-viewer");
        $ic224$ = SubLObjectFactory.makeString("Agenda Error File: ~A");
        $ic225$ = SubLObjectFactory.makeSymbol("S#45431", "CYC");
        $ic226$ = SubLObjectFactory.makeString("Agenda log file empty: ~S");
        $ic227$ = SubLObjectFactory.makeSymbol("CB-AGENDA-ERROR-FILE-VIEWER");
        $ic228$ = SubLObjectFactory.makeString("cb-system");
        $ic229$ = SubLObjectFactory.makeKeyword("SYSTEM1");
        $ic230$ = SubLObjectFactory.makeSymbol("S#45432", "CYC");
        $ic231$ = SubLObjectFactory.makeString("System:");
        $ic232$ = SubLObjectFactory.makeKeyword("SYSTEM");
        $ic233$ = SubLObjectFactory.makeSymbol("S#45433", "CYC");
        $ic234$ = SubLObjectFactory.makeKeyword("CB-SYSTEM");
        $ic235$ = SubLObjectFactory.makeString("cb-system.html");
        $ic236$ = SubLObjectFactory.makeString("Cyc System Area");
        $ic237$ = SubLObjectFactory.makeString("System Area");
        $ic238$ = SubLObjectFactory.makeString("Here are your system settings:");
        $ic239$ = SubLObjectFactory.makeSymbol("CB-SYSTEM");
        $ic240$ = SubLObjectFactory.makeString("Machine name: ");
        $ic241$ = SubLObjectFactory.makeString("unknown");
        $ic242$ = SubLObjectFactory.makeString("SubL implementation: ");
        $ic243$ = SubLObjectFactory.makeString("Base TCP port: ");
        $ic244$ = SubLObjectFactory.makeString("Image name: ");
        $ic245$ = SubLObjectFactory.makeString("Image Process ID: ");
        $ic246$ = SubLObjectFactory.makeString("Image start time:");
        $ic247$ = SubLObjectFactory.makeString(" (up ~A)");
        $ic248$ = SubLObjectFactory.makeString("CycL revision level: ");
        $ic249$ = SubLObjectFactory.makeString("Current KB: ");
        $ic250$ = SubLObjectFactory.makeString("Queue Information: ");
        $ic251$ = SubLObjectFactory.makeString("Master Transcript Operations Read:  ");
        $ic252$ = SubLObjectFactory.makeString("Master Transcript Operations Read but Unprocessed:  ");
        $ic253$ = SubLObjectFactory.makeString("Master Transcript Operations Processed:  ");
        $ic254$ = SubLObjectFactory.makeString("Master Transcript Operations Processed but Filtered:  ");
        $ic255$ = SubLObjectFactory.makeString("Master Transcript Operations Processed and Evaluated:  ");
        $ic256$ = SubLObjectFactory.makeString("Unprocessed Local Queue Operations:  ");
        $ic257$ = SubLObjectFactory.makeString("Local Queue Operations Processed But Unrecorded:  ");
        $ic258$ = SubLObjectFactory.makeString("Current Local Transcript Operations Processed And Recorded:  ");
        $ic259$ = SubLObjectFactory.makeString("Unprocessed auxiliary queue operations:  ");
        $ic260$ = SubLObjectFactory.makeString("Transcript Information:");
        $ic261$ = SubLObjectFactory.makeString("Master Transcript:  ");
        $ic262$ = SubLObjectFactory.makeString("Maintained By Transcript Server");
        $ic263$ = SubLObjectFactory.makeString("Operations:  ");
        $ic264$ = SubLObjectFactory.makeKeyword("READ-TRANS");
        $ic265$ = SubLObjectFactory.makeString("None");
        $ic266$ = SubLObjectFactory.makeString("Characters:  ");
        $ic267$ = SubLObjectFactory.makeString("Estimated Ops:  ");
        $ic268$ = SubLObjectFactory.makeString("Local Transcript:  ");
        $ic269$ = SubLObjectFactory.makeKeyword("WRITE-TRANS");
        $ic270$ = SubLObjectFactory.makeString("Historical Information:");
        $ic271$ = SubLObjectFactory.makeString("Remote Operations Processed: ");
        $ic272$ = SubLObjectFactory.makeString("Local Operations Recorded:  ");
        $ic273$ = SubLObjectFactory.makeString("Local Operations Sent To Master Transcript:  ");
        $ic274$ = SubLObjectFactory.makeString("Auxiliary Queue Operations Processed:  ");
        $ic275$ = SubLObjectFactory.makeString("read");
        $ic276$ = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $ic277$ = SubLObjectFactory.makeString("cb-system-ready-transcript-file&read");
        $ic278$ = SubLObjectFactory.makeSymbol("S#45438", "CYC");
        $ic279$ = SubLObjectFactory.makeString("write");
        $ic280$ = SubLObjectFactory.makeSymbol("S#45439", "CYC");
        $ic281$ = SubLObjectFactory.makeString("cb-system-ready-transcript-file&~A");
        $ic282$ = SubLObjectFactory.makeKeyword("VIEW-TRANSCRIPT");
        $ic283$ = SubLObjectFactory.makeSymbol("S#45440", "CYC");
        $ic284$ = SubLObjectFactory.makeString("cb-transcript-viewer-handler&");
        $ic285$ = SubLObjectFactory.makeString("stats:");
        $ic286$ = SubLObjectFactory.makeString("[Stats]");
        $ic287$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic288$ = SubLObjectFactory.makeSymbol("CB-SYSTEM-READY-TRANSCRIPT-FILE");
        $ic289$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic290$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic291$ = SubLObjectFactory.makeKeyword("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE");
        $ic292$ = SubLObjectFactory.makeString("cb-system-show-specific-transcript-file.html");
        $ic293$ = SubLObjectFactory.makeString("File Contents: Transcript File");
        $ic294$ = SubLObjectFactory.makeString("File: ");
        $ic295$ = SubLObjectFactory.makeString("Operations: ");
        $ic296$ = SubLObjectFactory.makeString("No operations have been saved yet in");
        $ic297$ = SubLObjectFactory.makeString("~s is not a pathname string.");
        $ic298$ = SubLObjectFactory.makeKeyword("CB-CHOOSE-PROJECT");
        $ic299$ = SubLObjectFactory.makeString("cb-choose-project.html");
        $ic300$ = SubLObjectFactory.makeString("Choose KE Project");
        $ic301$ = SubLObjectFactory.makeString("cb-choose-project-handler");
        $ic302$ = SubLObjectFactory.makeString("Choose your project from the options below.");
        $ic303$ = SubLObjectFactory.makeString("project");
        $ic304$ = SubLObjectFactory.makeString("No Project Selected");
        $ic305$ = SubLObjectFactory.makeString("Reset");
        $ic306$ = SubLObjectFactory.makeSymbol("CB-CHOOSE-PROJECT");
        $ic307$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic308$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OngoingStatus"));
        $ic309$ = SubLObjectFactory.makeString("nil");
        $ic310$ = SubLObjectFactory.makeString("Project has been changed.");
        $ic311$ = SubLObjectFactory.makeSymbol("CB-CHOOSE-PROJECT-HANDLER");
        $ic312$ = SubLObjectFactory.makeString("Current Project");
        $ic313$ = SubLObjectFactory.makeString("cb-choose-project");
        $ic314$ = SubLObjectFactory.makeKeyword("CHOOSE-PROJECT");
        $ic315$ = SubLObjectFactory.makeSymbol("S#45446", "CYC");
        $ic316$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CycBrowser"));
        $ic317$ = SubLObjectFactory.makeSymbol("?PROJECT");
        $ic318$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("cyclistPrimaryProject"));
        $ic319$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PROJECT"));
        $ic320$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0678.ONE_INTEGER);
        $ic321$ = SubLObjectFactory.makeKeyword("CB-LOGIN");
        $ic322$ = SubLObjectFactory.makeString("cb-login.html");
        $ic323$ = SubLObjectFactory.makeString("new_login_name");
        $ic324$ = SubLObjectFactory.makeString("Login Area");
        $ic325$ = SubLObjectFactory.makeString("cb-login-handler");
        $ic326$ = SubLObjectFactory.makeString("This image has been designated: ");
        $ic327$ = SubLObjectFactory.makeString("You are currently logged in as ");
        $ic328$ = SubLObjectFactory.makeString("Click ");
        $ic329$ = SubLObjectFactory.makeKeyword("LOGOUT");
        $ic330$ = SubLObjectFactory.makeString("here");
        $ic331$ = SubLObjectFactory.makeString(" to logout now.");
        $ic332$ = SubLObjectFactory.makeString("Type in your new login name below and press the [");
        $ic333$ = SubLObjectFactory.makeString("] button:");
        $ic334$ = SubLObjectFactory.makeString("new_login_hashed_password");
        $ic335$ = SubLObjectFactory.makeString("Cyclist");
        $ic336$ = SubLObjectFactory.makeString("Password");
        $ic337$ = SubLObjectFactory.makeString(" : ");
        $ic338$ = SubLObjectFactory.makeString("The following are currently logged in to ");
        $ic339$ = SubLObjectFactory.makeString(":");
        $ic340$ = SubLObjectFactory.makeString("User");
        $ic341$ = SubLObjectFactory.makeString("Local Machine");
        $ic342$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9603", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45490", "CYC"));
        $ic343$ = SubLObjectFactory.makeString("(Session id: ");
        $ic344$ = SubLObjectFactory.makeKeyword("FORCE-LOGOUT");
        $ic345$ = SubLObjectFactory.makeString("[Force Logout]");
        $ic346$ = SubLObjectFactory.makeString(")");
        $ic347$ = SubLObjectFactory.makeKeyword("LARR");
        $ic348$ = SubLObjectFactory.makeString(" you");
        $ic349$ = SubLObjectFactory.makeKeyword("NOTIFY-ALL-USERS");
        $ic350$ = SubLObjectFactory.makeSymbol("CB-LOGIN");
        $ic351$ = SubLObjectFactory.makeString("sessionId");
        $ic352$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic353$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic354$ = SubLObjectFactory.makeSymbol("CB-FORCE-LOGOUT");
        $ic355$ = SubLObjectFactory.makeString("~a&sessionId=~a");
        $ic356$ = SubLObjectFactory.makeString("cb-force-logout");
        $ic357$ = SubLObjectFactory.makeSymbol("S#45451", "CYC");
        $ic358$ = SubLObjectFactory.makeString("Complete");
        $ic359$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HumanCyclist"));
        $ic360$ = SubLObjectFactory.makeInteger(27);
        $ic361$ = SubLObjectFactory.makeString("Clear");
        $ic362$ = SubLObjectFactory.makeString("cb-notify-all-users");
        $ic363$ = SubLObjectFactory.makeString("Send Email to all Users");
        $ic364$ = SubLObjectFactory.makeSymbol("S#45453", "CYC");
        $ic365$ = SubLObjectFactory.makeString("Mail all users");
        $ic366$ = SubLObjectFactory.makeString("Please enter the message you wish to send to the following users.");
        $ic367$ = SubLObjectFactory.makeString("cb-send-email-to-selected-users");
        $ic368$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9603", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9126", "CYC"));
        $ic369$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Guest"));
        $ic370$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic371$ = SubLObjectFactory.makeString("To:");
        $ic372$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic373$ = SubLObjectFactory.makeString("From: ");
        $ic374$ = SubLObjectFactory.makeString("Subject: ");
        $ic375$ = SubLObjectFactory.makeString("subject");
        $ic376$ = SubLObjectFactory.makeInteger(72);
        $ic377$ = SubLObjectFactory.makeString("Message: ");
        $ic378$ = SubLObjectFactory.makeString("Send Email");
        $ic379$ = SubLObjectFactory.makeSymbol("CB-NOTIFY-ALL-USERS");
        $ic380$ = SubLObjectFactory.makeString("exclude");
        $ic381$ = SubLObjectFactory.makeString("Email Address");
        $ic382$ = SubLObjectFactory.makeString("Exclude?");
        $ic383$ = SubLObjectFactory.makeSymbol("S#45459", "CYC");
        $ic384$ = SubLObjectFactory.makeString("exclude_");
        $ic385$ = SubLObjectFactory.makeSymbol("S#45487", "CYC");
        $ic386$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic387$ = SubLObjectFactory.makeKeyword("ADDRESS");
        $ic388$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("preferredEMailAddressText"));
        $ic389$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADDRESS"));
        $ic390$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $ic391$ = SubLObjectFactory.makeString("Sending Message");
        $ic392$ = SubLObjectFactory.makeString("Sending message with following content:");
        $ic393$ = SubLObjectFactory.makeString("Subject");
        $ic394$ = SubLObjectFactory.makeString("Message:");
        $ic395$ = SubLObjectFactory.makeString("Sending Log");
        $ic396$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#688", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9126", "CYC"));
        $ic397$ = SubLObjectFactory.makeString("Excluding user ");
        $ic398$ = SubLObjectFactory.makeString("Sent message to ");
        $ic399$ = SubLObjectFactory.makeString("Error on sending message to ");
        $ic400$ = SubLObjectFactory.makeSymbol("CB-SEND-EMAIL-TO-SELECTED-USERS");
        $ic401$ = SubLObjectFactory.makeString("Login:");
        $ic402$ = SubLObjectFactory.makeString("cb-login");
        $ic403$ = SubLObjectFactory.makeKeyword("LOGIN");
        $ic404$ = SubLObjectFactory.makeSymbol("S#45461", "CYC");
        $ic405$ = SubLObjectFactory.makeSymbol("S#17610", "CYC");
        $ic406$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic407$ = SubLObjectFactory.makeSymbol("CB-LOGIN-HANDLER");
        $ic408$ = SubLObjectFactory.makeString("redirect-handler");
        $ic409$ = SubLObjectFactory.makeSymbol("S#45464", "CYC");
        $ic410$ = SubLObjectFactory.makeString("Known Constant");
        $ic411$ = SubLObjectFactory.makeString("The name you typed in, ");
        $ic412$ = SubLObjectFactory.makeString(" is already used in the Knowledge Base as a Cyc constant.");
        $ic413$ = SubLObjectFactory.makeString("Please go back and try a different login name.");
        $ic414$ = SubLObjectFactory.makeString("Successful Login");
        $ic415$ = SubLObjectFactory.makeString("Welcome, ");
        $ic416$ = SubLObjectFactory.makeString("!");
        $ic417$ = SubLObjectFactory.makeString("Your project has been set to ");
        $ic418$ = SubLObjectFactory.makeString("Change Project");
        $ic419$ = SubLObjectFactory.makeString("Your project is currently not set.");
        $ic420$ = SubLObjectFactory.makeString("Choose Project");
        $ic421$ = SubLObjectFactory.makeString("Login");
        $ic422$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Dr")), (SubLObject)SubLObjectFactory.makeString("Dr.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Reverend-Title")), (SubLObject)SubLObjectFactory.makeString("Rev.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Prof")), (SubLObject)SubLObjectFactory.makeString("Prof.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("President-Title")), (SubLObject)SubLObjectFactory.makeString("President")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Sir")), (SubLObject)SubLObjectFactory.makeString("Sir")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Major-Title")), (SubLObject)SubLObjectFactory.makeString("Maj.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Lieutenant-Title")), (SubLObject)SubLObjectFactory.makeString("Lt.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LieutenantColonel-Title")), (SubLObject)SubLObjectFactory.makeString("Ltc.")));
        $ic423$ = SubLObjectFactory.makeSymbol("?TITLE");
        $ic424$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("titleOfPerson"));
        $ic425$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TITLE"));
        $ic426$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic427$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#45491", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45492", "CYC"));
        $ic428$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Sir"));
        $ic429$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("givenNames"));
        $ic430$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("familyName"));
        $ic431$ = SubLObjectFactory.makeKeyword("NONE");
        $ic432$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("givenNames")));
        $ic433$ = SubLObjectFactory.makeString("Unknown Cyclist");
        $ic434$ = SubLObjectFactory.makeString("cb-create-new-cyclist");
        $ic435$ = SubLObjectFactory.makeString("The name ");
        $ic436$ = SubLObjectFactory.makeString(" is not the name of a known ");
        $ic437$ = SubLObjectFactory.makeString("Do you want to create a new Cyc constant with this name?  You will be able to use this constant as you would any other in the Knowledge Base as well as login with this new name.");
        $ic438$ = SubLObjectFactory.makeString("Yes, Create Cyclist");
        $ic439$ = SubLObjectFactory.makeString("creating new cyclists");
        $ic440$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic441$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HumanCyclist")));
        $ic442$ = SubLObjectFactory.makeString("Unable to create a new cyclist (why?");
        $ic443$ = SubLObjectFactory.makeSymbol("CB-CREATE-NEW-CYCLIST");
        $ic444$ = SubLObjectFactory.makeString("sha1.js");
        $ic445$ = SubLObjectFactory.makeString("Logout");
        $ic446$ = SubLObjectFactory.makeString("You have now logged out from this Cyc image.  Goodbye!");
        $ic447$ = SubLObjectFactory.makeKeyword("START");
        $ic448$ = SubLObjectFactory.makeString(" to reconnect to Cyc.");
        $ic449$ = SubLObjectFactory.makeSymbol("CB-LOGOUT");
        $ic450$ = SubLObjectFactory.makeString("[Logout]");
        $ic451$ = SubLObjectFactory.makeString("cb-logout");
        $ic452$ = SubLObjectFactory.makeSymbol("S#45469", "CYC");
        $ic453$ = SubLObjectFactory.makeString("problem");
        $ic454$ = SubLObjectFactory.makeString("user_login");
        $ic455$ = SubLObjectFactory.makeString("Specify Cyc Browser Password");
        $ic456$ = SubLObjectFactory.makeString("80%");
        $ic457$ = SubLObjectFactory.makeString("Error!");
        $ic458$ = SubLObjectFactory.makeString("Could not set password for ");
        $ic459$ = SubLObjectFactory.makeString("Reason:");
        $ic460$ = SubLObjectFactory.makeString("Please specify a new password for a cyclist.");
        $ic461$ = SubLObjectFactory.makeString("(Note: Only you can reset your own password.)");
        $ic462$ = SubLObjectFactory.makeString("cb-set-password-handler");
        $ic463$ = SubLObjectFactory.makeString("New Password");
        $ic464$ = SubLObjectFactory.makeSymbol("CB-SET-PASSWORD");
        $ic465$ = SubLObjectFactory.makeString("[Set Password]");
        $ic466$ = SubLObjectFactory.makeString("cb-set-password");
        $ic467$ = SubLObjectFactory.makeKeyword("SET-PASSWORD");
        $ic468$ = SubLObjectFactory.makeSymbol("S#45470", "CYC");
        $ic469$ = SubLObjectFactory.makeString("Set Password");
        $ic470$ = SubLObjectFactory.makeString("Passwd");
        $ic471$ = SubLObjectFactory.makeString("Set passwords for Cyclist Authentication");
        $ic472$ = SubLObjectFactory.makeString("Please fill in all fields.");
        $ic473$ = SubLObjectFactory.makeString("No known cyclist by this name.");
        $ic474$ = SubLObjectFactory.makeString("The name could mean any of following cyclists: ");
        $ic475$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("encryptedPasswordForUser")));
        $ic476$ = SubLObjectFactory.makeSymbol("CB-SET-PASSWORD-HANDLER");
        $ic477$ = SubLObjectFactory.makeKeyword("CB-TRANSCRIPT-VIEWER");
        $ic478$ = SubLObjectFactory.makeString("cb-transcript-viewer.html");
        $ic479$ = SubLObjectFactory.makeString("show-stats");
        $ic480$ = SubLObjectFactory.makeString("transcript_filename");
        $ic481$ = SubLObjectFactory.makeString("Please type in a filename.");
        $ic482$ = SubLObjectFactory.makeString("Transcript Viewing Area");
        $ic483$ = SubLObjectFactory.makeString("cb-transcript-viewer-handler");
        $ic484$ = SubLObjectFactory.makeKeyword("ALL-LOCAL-TRANS");
        $ic485$ = SubLObjectFactory.makeString("cg?cb-transcript-viewer");
        $ic486$ = SubLObjectFactory.makeKeyword("GET");
        $ic487$ = SubLObjectFactory.makeString("cb-transcript-viewer");
        $ic488$ = SubLObjectFactory.makeString("View other transcript:");
        $ic489$ = SubLObjectFactory.makeString("Please type in the full path to the transcript: (e.g. /cyc/top/transcripts/[kb#]/[transcript_name])");
        $ic490$ = SubLObjectFactory.makeString("ERROR: ");
        $ic491$ = SubLObjectFactory.makeString("Stats");
        $ic492$ = SubLObjectFactory.makeString("View Transcript");
        $ic493$ = SubLObjectFactory.makeSymbol("CB-TRANSCRIPT-VIEWER");
        $ic494$ = SubLObjectFactory.makeSymbol("CB-TRANSCRIPT-VIEWER-HANDLER");
        $ic495$ = SubLObjectFactory.makeString("Transcript Statistics");
        $ic496$ = SubLObjectFactory.makeString("Transcript: ");
        $ic497$ = SubLObjectFactory.makeString("Constants Created: ");
        $ic498$ = SubLObjectFactory.makeString("Constants Renamed: ");
        $ic499$ = SubLObjectFactory.makeString("=>");
        $ic500$ = SubLObjectFactory.makeString("Constants Killed: ");
        $ic501$ = SubLObjectFactory.makeString("No transcripts for this image!");
        $ic502$ = SubLObjectFactory.makeString("Local transcripts for this image:");
        $ic503$ = SubLObjectFactory.makeString("cb-transcript-viewer-handler&stats:");
        $ic504$ = SubLObjectFactory.makeSymbol("S#45474", "CYC");
        $ic505$ = SubLObjectFactory.makeString("Viewer");
        $ic506$ = SubLObjectFactory.makeKeyword("VIEWER");
        $ic507$ = SubLObjectFactory.makeSymbol("S#45475", "CYC");
        $ic508$ = SubLObjectFactory.makeString("Transcript Viewer");
        $ic509$ = SubLObjectFactory.makeString("View");
        $ic510$ = SubLObjectFactory.makeString("View Local Transcripts");
        $ic511$ = SubLObjectFactory.makeKeyword("CB-SHOW-LOCAL-OPS");
        $ic512$ = SubLObjectFactory.makeString("cb-show-local-ops.html");
        $ic513$ = SubLObjectFactory.makeString("Local Operations");
        $ic514$ = SubLObjectFactory.makeString("cb-confirm-clear-local-queue");
        $ic515$ = SubLObjectFactory.makeString("You have nothing in your local queue.");
        $ic516$ = SubLObjectFactory.makeString(" item");
        $ic517$ = SubLObjectFactory.makeString("s");
        $ic518$ = SubLObjectFactory.makeString(" in your local queue.");
        $ic519$ = SubLObjectFactory.makeString("Click this button to erase the local queue:");
        $ic520$ = SubLObjectFactory.makeString("Clear Local Queue");
        $ic521$ = SubLObjectFactory.makeString("Here are the queued local operations:");
        $ic522$ = SubLObjectFactory.makeSymbol("CB-SHOW-LOCAL-OPS");
        $ic523$ = SubLObjectFactory.makeString("Local:");
        $ic524$ = SubLObjectFactory.makeString("cb-show-local-ops");
        $ic525$ = SubLObjectFactory.makeSymbol("S#45476", "CYC");
        $ic526$ = SubLObjectFactory.makeKeyword("CB-CONFIRM-CLEAR-LOCAL-QUEUE");
        $ic527$ = SubLObjectFactory.makeString("cb-confirm-clear-local-queue.html");
        $ic528$ = SubLObjectFactory.makeString("cb-clear-local-queue");
        $ic529$ = SubLObjectFactory.makeString("Are you ");
        $ic530$ = SubLObjectFactory.makeString("SURE");
        $ic531$ = SubLObjectFactory.makeString(" you want to clear your local queue?");
        $ic532$ = SubLObjectFactory.makeString(" operations will be lost!");
        $ic533$ = SubLObjectFactory.makeString("Yes, Clear Local Queue");
        $ic534$ = SubLObjectFactory.makeSymbol("CB-CONFIRM-CLEAR-LOCAL-QUEUE");
        $ic535$ = SubLObjectFactory.makeKeyword("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");
        $ic536$ = SubLObjectFactory.makeString("cb-confirm-clear-local-and-restart.html");
        $ic537$ = SubLObjectFactory.makeString("cb-clear-local-and-restart");
        $ic538$ = SubLObjectFactory.makeString("You have nothing in your local queue. Restarting agenda...");
        $ic539$ = SubLObjectFactory.makeString("Local Queue Cleared, Agenda Restarted");
        $ic540$ = SubLObjectFactory.makeString(" you want to clear your local queue before restarting the agenda?");
        $ic541$ = SubLObjectFactory.makeString("Yes, Clear Local Queue and Restart");
        $ic542$ = SubLObjectFactory.makeSymbol("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");
        $ic543$ = SubLObjectFactory.makeString("cb-confirm-clear-local-and-restart");
        $ic544$ = SubLObjectFactory.makeSymbol("S#45477", "CYC");
        $ic545$ = SubLObjectFactory.makeSymbol("S#45478", "CYC");
        $ic546$ = SubLObjectFactory.makeSymbol("CB-CLEAR-LOCAL-AND-RESTART");
        $ic547$ = SubLObjectFactory.makeString("Local Queue Cleared");
        $ic548$ = SubLObjectFactory.makeSymbol("CB-CLEAR-LOCAL-QUEUE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0678.class
	Total time: 4911 ms
	
	Decompiled with Procyon 0.5.32.
*/