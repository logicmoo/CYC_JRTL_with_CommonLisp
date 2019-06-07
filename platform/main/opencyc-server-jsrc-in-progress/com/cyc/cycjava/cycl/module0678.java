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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return PrintLow.format((SubLObject)NIL, (SubLObject)$ic0$, module0110.$g127$.getDynamicValue(var1));
    }
    
    public static SubLObject f41403(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic4$);
            return (SubLObject)NIL;
        }
        module0574.f35206();
        module0660.f40193();
        final SubLObject var4 = (SubLObject)$ic5$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_6 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_7 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_8 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_8, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var7 = module0642.f39104((SubLObject)$ic17$, var2);
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var8 = module0642.f39042((SubLObject)$ic18$);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var8) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(var8));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_9 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39019(var7);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_9, var3);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)THREE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var9 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var9) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var9);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_10 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var10 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic20$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39073((SubLObject)$ic21$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != module0575.f35244()) {
                            if (NIL != module0573.f35083()) {
                                module0573.f35107();
                            }
                            if (NIL != module0575.f35283()) {
                                module0642.f39019((SubLObject)$ic23$);
                                module0642.f39019((SubLObject)$ic24$);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                f41404();
                            }
                            else {
                                f41405();
                            }
                        }
                        else {
                            f41406();
                        }
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f41407();
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var11, var3);
                        module0015.$g541$.rebind(var10, var3);
                        module0015.$g533$.rebind(var4_10, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_7, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_6, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41405() {
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic26$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != module0574.f35120()) {
            module0642.f39072((SubLObject)$ic27$, (SubLObject)$ic28$, module0574.f35194(), (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic29$);
        }
        else {
            f41408();
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39072((SubLObject)$ic27$, (SubLObject)$ic30$, module0574.f35195(), (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)TWO_INTEGER);
        module0642.f39019((SubLObject)$ic31$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39072((SubLObject)$ic27$, (SubLObject)$ic32$, module0574.f35196(), (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)TWO_INTEGER);
        module0642.f39019((SubLObject)$ic33$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic34$);
        module0642.f39032((SubLObject)TWO_INTEGER);
        f41409((SubLObject)$ic35$, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41408() {
        module0642.f39019((SubLObject)$ic36$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic37$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41404() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39019((SubLObject)$ic38$);
        final SubLObject var2 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0575.f35277());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019((SubLObject)$ic41$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        module0642.f39019((SubLObject)$ic42$);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            if (NIL != module0574.f35120()) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_17 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_18 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var1);
                        module0642.f39072((SubLObject)$ic30$, (SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_18, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_19 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var1);
                        module0642.f39019((SubLObject)$ic44$);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            else {
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_20 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_20, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_21 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    f41408();
                }
                finally {
                    module0015.$g533$.rebind(var4_21, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_22 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_23 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39072((SubLObject)$ic30$, (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_23, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_24 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic46$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g217$.getGlobalValue());
        module0642.f39019((SubLObject)$ic47$);
        module0642.f39020(module0015.$g218$.getGlobalValue());
        module0642.f39019((SubLObject)$ic48$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41406() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic49$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        final SubLObject var2 = (SubLObject)$ic18$;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var2) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39042(var2));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0575.f35243());
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic50$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41407() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic51$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_25 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic52$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_26 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39072((SubLObject)$ic54$, (SubLObject)$ic55$, (SubLObject)makeBoolean(NIL == module0574.f35197()), (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_26, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_27 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic57$);
                }
                finally {
                    module0015.$g533$.rebind(var4_27, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_28 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_29 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic52$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_30 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39072((SubLObject)$ic54$, (SubLObject)$ic58$, module0574.f35197(), (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var4_30, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_31 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic59$);
                }
                finally {
                    module0015.$g533$.rebind(var4_31, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_32 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_33 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_34 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_34, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_35 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39068((SubLObject)$ic60$, (SubLObject)T, module0173.f10955(module0574.f35225()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0642.f39019((SubLObject)$ic61$);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    f41409((SubLObject)$ic62$, (SubLObject)$ic63$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var2, var1);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        f41410();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41409(final SubLObject var36, SubLObject var37) {
        if (var37 == UNPROVIDED) {
            var37 = (SubLObject)NIL;
        }
        module0656.f39982(var36, module0259.f16848($g5333$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)((NIL != var37) ? module0574.f35225() : NIL), (SubLObject)ONE_INTEGER, Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)T, (SubLObject)$ic32$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41411() {
        return $g5334$.getGlobalValue();
    }
    
    public static SubLObject f41412(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)$ic27$, var2);
        final SubLObject var4 = module0642.f39104((SubLObject)$ic30$, var2);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic54$, var2);
        final SubLObject var6 = module0642.f39104((SubLObject)$ic67$, var2);
        final SubLObject var7 = module0656.f39983((SubLObject)$ic35$, var2);
        final SubLObject var8 = module0642.f39104((SubLObject)$ic60$, var2);
        if (NIL != var4) {
            if (var4.equal((SubLObject)$ic43$)) {
                if (NIL != f41411()) {
                    f41413(var2);
                }
                else {
                    module0574.f35203();
                }
            }
            else if (var4.equal((SubLObject)$ic45$)) {
                module0574.f35202();
            }
        }
        if (NIL == module0656.f39984(var7)) {
            module0574.f35229(var7);
        }
        if (NIL != var3 && !var3.equal(module0574.f35186((SubLObject)UNPROVIDED))) {
            module0574.f35183(var3);
        }
        if (NIL != var5 && !var5.equal(module0574.f35184((SubLObject)UNPROVIDED))) {
            module0574.f35185(var5);
        }
        if (NIL != module0574.f35197()) {
            if (NIL != var8) {
                module0574.f35226(module0656.f39983((SubLObject)$ic62$, var2));
            }
        }
        else {
            module0574.f35227();
        }
        f41403((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41414() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic69$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39019((SubLObject)$ic70$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41413(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39104((SubLObject)$ic30$, var2);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic78$, var2);
        final SubLObject var6 = Equality.equalp(module0642.f39104((SubLObject)$ic30$, var2), (SubLObject)$ic79$);
        final SubLObject var7 = (SubLObject)$ic80$;
        var3.resetMultipleValues();
        final SubLObject var8 = f41415(var5, module0572.f35035(), var7, var6);
        final SubLObject var9 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        final SubLObject var10 = (SubLObject)$ic81$;
        final SubLObject var11 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var12 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var12) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var12);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var10) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var10);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_49 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_50 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_51 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_51, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var10);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var13 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var13) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var13);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_52 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var14 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var15 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic82$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39069((SubLObject)$ic30$, var4, (SubLObject)UNPROVIDED);
                        module0642.f39069((SubLObject)$ic78$, var5, (SubLObject)UNPROVIDED);
                        final SubLObject var53_54 = (SubLObject)NIL;
                        module0642.f39020(module0015.$g381$.getGlobalValue());
                        module0642.f39020(module0015.$g383$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0655.f39768();
                        module0642.f39019((SubLObject)$ic40$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var53_54) {
                            module0642.f39020(module0015.$g387$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var53_54);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic83$);
                        module0655.f39768();
                        module0642.f39019((SubLObject)$ic40$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic84$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic86$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic87$, (SubLObject)$ic74$);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic88$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_53 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019(module0075.f5226(module0572.f35035()));
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_53, var3);
                        }
                        module0642.f39020(module0015.$g382$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic89$);
                        module0656.f39870((SubLObject)$ic76$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic90$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39075((SubLObject)$ic91$, $g5335$.getGlobalValue(), (SubLObject)$ic92$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic93$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39075((SubLObject)$ic94$, f41416(), (SubLObject)$ic92$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic95$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g336$.getGlobalValue());
                        module0642.f39020(module0015.$g338$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic17$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g340$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic96$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g339$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TWENTY_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g350$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic97$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_54 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39019(var8);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_54, var3);
                        }
                        module0642.f39020(module0015.$g337$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        if (var4.equal((SubLObject)$ic43$)) {
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g316$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic98$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic99$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            if (NIL == var9) {
                                module0642.f39019((SubLObject)$ic100$);
                                module0642.f39074((SubLObject)$ic101$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_50, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_49, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var11, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41416() {
        return Sequences.cconcatenate((SubLObject)$ic102$, new SubLObject[] { module0006.f203(module0574.f35164()), $ic103$ });
    }
    
    public static SubLObject f41415(SubLObject var57, SubLObject var58, SubLObject var46, SubLObject var59) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        if (var58 == UNPROVIDED) {
            var58 = module0572.f35035();
        }
        if (var46 == UNPROVIDED) {
            var46 = (SubLObject)$ic80$;
        }
        if (var59 == UNPROVIDED) {
            var59 = (SubLObject)NIL;
        }
        final SubLThread var60 = SubLProcess.currentSubLThread();
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        final SubLObject var63 = (SubLObject)$ic104$;
        final SubLObject var64 = module0012.$silent_progressP$.currentBinding(var60);
        try {
            module0012.$silent_progressP$.bind((SubLObject)T, var60);
            final SubLObject var65 = module0572.f35063(var58);
            SubLObject var67;
            final SubLObject var66 = var67 = var65;
            SubLObject var68 = (SubLObject)NIL;
            SubLObject var69 = (SubLObject)NIL;
            SubLObject var70 = (SubLObject)NIL;
            SubLObject var71 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)$ic105$);
            var68 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)$ic105$);
            var69 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)$ic105$);
            var70 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var66, (SubLObject)$ic105$);
            var71 = var67.first();
            var67 = var67.rest();
            if (NIL == var67) {
                var62 = (SubLObject)makeBoolean(NIL != var71 || NIL != var70 || NIL != var69);
                SubLObject var72 = (SubLObject)NIL;
                try {
                    var72 = streams_high.make_private_string_output_stream();
                    PrintLow.format(var72, (SubLObject)$ic106$, (SubLObject)((NIL != var59) ? $ic107$ : $ic108$));
                    PrintLow.format(var72, (SubLObject)$ic109$, module0574.f35164());
                    PrintLow.format(var72, (SubLObject)$ic110$);
                    if (NIL != module0038.f2653(var57)) {
                        PrintLow.format(var72, (SubLObject)$ic111$, var57);
                    }
                    PrintLow.format(var72, (SubLObject)$ic112$, module0572.f35037(module0075.f5226(var58), var46));
                    PrintLow.format(var72, (SubLObject)$ic113$, var68);
                    if (NIL != var71) {
                        PrintLow.format(var72, (SubLObject)$ic114$);
                        SubLObject var73 = (SubLObject)NIL;
                        SubLObject var74 = (SubLObject)NIL;
                        SubLObject var75 = (SubLObject)NIL;
                        SubLObject var76 = (SubLObject)NIL;
                        var74 = var71;
                        var75 = var74.first();
                        for (var76 = (SubLObject)ZERO_INTEGER; NIL == var73 && NIL != var74; var74 = var74.rest(), var75 = var74.first(), var76 = Numbers.add((SubLObject)ONE_INTEGER, var76)) {
                            SubLObject var76_77;
                            final SubLObject var74_75 = var76_77 = var75;
                            SubLObject var77 = (SubLObject)NIL;
                            SubLObject var78 = (SubLObject)NIL;
                            SubLObject var79 = (SubLObject)NIL;
                            SubLObject var80 = (SubLObject)NIL;
                            SubLObject var81 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)$ic115$);
                            var77 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)$ic115$);
                            var78 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)$ic115$);
                            var79 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)$ic115$);
                            var80 = var76_77.first();
                            var76_77 = var76_77.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var76_77, var74_75, (SubLObject)$ic115$);
                            var81 = var76_77.first();
                            var76_77 = var76_77.rest();
                            if (NIL == var76_77) {
                                PrintLow.format(var72, (SubLObject)$ic116$, var79);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var74_75, (SubLObject)$ic115$);
                            }
                            if (var76.numG(var63)) {
                                var73 = (SubLObject)T;
                                PrintLow.format(var72, (SubLObject)$ic117$, Numbers.subtract(Sequences.length(var71), var76));
                            }
                        }
                    }
                    if (NIL != var70) {
                        PrintLow.format(var72, (SubLObject)$ic118$);
                        SubLObject var73 = (SubLObject)NIL;
                        SubLObject var74 = (SubLObject)NIL;
                        SubLObject var75 = (SubLObject)NIL;
                        SubLObject var76 = (SubLObject)NIL;
                        var74 = var70;
                        var75 = var74.first();
                        for (var76 = (SubLObject)ZERO_INTEGER; NIL == var73 && NIL != var74; var74 = var74.rest(), var75 = var74.first(), var76 = Numbers.add((SubLObject)ONE_INTEGER, var76)) {
                            SubLObject var85_86;
                            final SubLObject var83_84 = var85_86 = var75;
                            SubLObject var77 = (SubLObject)NIL;
                            SubLObject var78 = (SubLObject)NIL;
                            SubLObject var82 = (SubLObject)NIL;
                            SubLObject var83 = (SubLObject)NIL;
                            SubLObject var84 = (SubLObject)NIL;
                            SubLObject var85 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic119$);
                            var77 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic119$);
                            var78 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic119$);
                            var82 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic119$);
                            var83 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic119$);
                            var84 = var85_86.first();
                            var85_86 = var85_86.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var85_86, var83_84, (SubLObject)$ic119$);
                            var85 = var85_86.first();
                            var85_86 = var85_86.rest();
                            if (NIL == var85_86) {
                                PrintLow.format(var72, (SubLObject)$ic120$, var82, var83);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var83_84, (SubLObject)$ic119$);
                            }
                            if (var76.numG(var63)) {
                                var73 = (SubLObject)T;
                                PrintLow.format(var72, (SubLObject)$ic117$, Numbers.subtract(Sequences.length(var70), var76));
                            }
                        }
                    }
                    var69 = Sequences.nreverse(var69);
                    if (NIL != var69) {
                        PrintLow.format(var72, (SubLObject)$ic121$);
                        SubLObject var86 = var69;
                        SubLObject var87 = (SubLObject)NIL;
                        var87 = var86.first();
                        while (NIL != var86) {
                            SubLObject var92_93;
                            final SubLObject var90_91 = var92_93 = var87;
                            SubLObject var88 = (SubLObject)NIL;
                            SubLObject var89 = (SubLObject)NIL;
                            SubLObject var90 = (SubLObject)NIL;
                            SubLObject var91 = (SubLObject)NIL;
                            SubLObject var92 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)$ic115$);
                            var88 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)$ic115$);
                            var89 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)$ic115$);
                            var90 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)$ic115$);
                            var91 = var92_93.first();
                            var92_93 = var92_93.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var92_93, var90_91, (SubLObject)$ic115$);
                            var92 = var92_93.first();
                            var92_93 = var92_93.rest();
                            if (NIL == var92_93) {
                                PrintLow.format(var72, (SubLObject)$ic116$, var90);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var90_91, (SubLObject)$ic115$);
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var60);
                        streams_high.close(var72, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var4_94, var60);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var66, (SubLObject)$ic105$);
            }
        }
        finally {
            module0012.$silent_progressP$.rebind(var64, var60);
        }
        return Values.values(var61, var62);
    }
    
    public static SubLObject f41417(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)$ic94$, var2);
        final SubLObject var4 = module0642.f39111((SubLObject)$ic17$, var2, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic30$, var2);
        final SubLObject var6 = module0642.f39104((SubLObject)$ic98$, var2);
        final SubLObject var7 = (SubLObject)((NIL != var6) ? module0642.f39104((SubLObject)$ic91$, var2) : NIL);
        final SubLObject var8 = module0226.f15165(module0574.f35152());
        SubLObject var9 = (SubLObject)NIL;
        var9 = f41418(module0572.f35035(), var5, var4, var3, var8, var7);
        f41403(var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41418(final SubLObject var100, final SubLObject var101, SubLObject var9, final SubLObject var102, SubLObject var103, SubLObject var104) {
        if (var103 == UNPROVIDED) {
            var103 = module0226.f15165(module0574.f35152());
        }
        if (var104 == UNPROVIDED) {
            var104 = $g5335$.getGlobalValue();
        }
        final SubLThread var105 = SubLProcess.currentSubLThread();
        SubLObject var106 = (SubLObject)NIL;
        SubLObject var107 = (SubLObject)NIL;
        SubLObject var108 = (SubLObject)NIL;
        SubLObject var109 = Sequences.cconcatenate((SubLObject)$ic123$, new SubLObject[] { module0006.f205(var103), $ic124$, module0006.f205(var104), $ic125$ });
        if (NIL != module0038.f2653(var104) && NIL != module0038.f2653(var103)) {
            var107 = f41419(var100);
            var9 = Sequences.cconcatenate(var9, var107);
            var105.resetMultipleValues();
            final SubLObject var109_110 = module0046.f3173(var103, var104, var9, var102, $g5336$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var111_112 = var105.secondMultipleValue();
            var105.resetMultipleValues();
            var108 = var109_110;
            var109 = var111_112;
        }
        if (var101.equal((SubLObject)$ic43$)) {
            module0574.f35203();
        }
        if (NIL == var108) {
            final SubLObject var110 = (SubLObject)(var101.equal((SubLObject)$ic43$) ? $ic126$ : $ic127$);
            final SubLObject var9_114 = (NIL == var104) ? Sequences.cconcatenate((SubLObject)$ic128$, new SubLObject[] { var110, $ic129$ }) : Sequences.cconcatenate((SubLObject)$ic128$, new SubLObject[] { var110, $ic130$, var109 });
            var106 = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic17$, var9_114));
        }
        return var106;
    }
    
    public static SubLObject f41419(SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = module0572.f35035();
        }
        SubLObject var59 = (SubLObject)NIL;
        final SubLObject var60 = (SubLObject)$ic131$;
        SubLObject var61 = (SubLObject)NIL;
        try {
            var61 = streams_high.make_private_string_output_stream();
            PrintLow.format(var61, (SubLObject)$ic132$);
            PrintLow.format(var61, (SubLObject)$ic133$);
            SubLObject var62 = (SubLObject)NIL;
            final SubLObject var63 = module0572.f35077(var58);
            SubLObject var64 = (SubLObject)NIL;
            SubLObject var65 = (SubLObject)NIL;
            SubLObject var66 = (SubLObject)NIL;
            var64 = var63;
            var65 = var64.first();
            for (var66 = (SubLObject)ZERO_INTEGER; NIL == var62 && NIL != var64; var64 = var64.rest(), var65 = var64.first(), var66 = Numbers.add((SubLObject)ONE_INTEGER, var66)) {
                PrintLow.format(var61, (SubLObject)$ic116$, var65);
                if (var66.numG(var60)) {
                    var62 = (SubLObject)T;
                    PrintLow.format(var61, (SubLObject)$ic134$, Numbers.subtract(Sequences.length(var63), var66));
                }
            }
            var59 = streams_high.get_output_stream_string(var61);
        }
        finally {
            final SubLObject var67 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var61, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var67);
            }
        }
        return var59;
    }
    
    public static SubLObject f41420(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        final SubLObject var120 = module0018.f971();
        final SubLObject var121 = module0048.f_1X(var120);
        if (NIL == var118) {
            var118 = Sequences.cconcatenate((SubLObject)$ic135$, new SubLObject[] { module0006.f205(var121), $ic136$ });
        }
        final SubLObject var122 = module0656.f39832((SubLObject)$ic137$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic138$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var122) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var122);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var123 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var123, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41421(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic143$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0018.f971();
        final SubLObject var5 = module0048.f_1X(var4);
        final SubLObject var7;
        final SubLObject var6 = var7 = Sequences.cconcatenate((SubLObject)$ic144$, module0006.f203(var5));
        final SubLObject var8 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var9 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var9) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var7) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var7);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_122 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_123 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_124 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_124, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var7);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var10 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var10);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_125 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic145$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic141$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var13 = (SubLObject)$ic18$;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var13) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(var13));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_126 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g207$.getGlobalValue());
                            module0642.f39021((SubLObject)$ic146$);
                            module0642.f39020(module0015.$g208$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var4_126, var3);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic147$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic148$, var5);
                        module0642.f39032((SubLObject)FOUR_INTEGER);
                        module0642.f39074((SubLObject)$ic59$, (SubLObject)$ic58$, (SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic57$, (SubLObject)$ic55$, (SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var3);
                        module0015.$g541$.rebind(var11, var3);
                        module0015.$g533$.rebind(var4_125, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_123, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_122, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var8, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41422(final SubLObject var2) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic143$);
            return (SubLObject)NIL;
        }
        final SubLObject var3 = module0642.f39104((SubLObject)$ic58$, var2);
        if (NIL == var3) {
            return f41403((SubLObject)UNPROVIDED);
        }
        final SubLObject var4 = module0018.f971();
        final SubLObject var5 = module0048.f_1X(var4);
        module0574.f35211(var4, var5);
        return f41403((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41423() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        if (NIL != module0018.$g678$.getGlobalValue()) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic152$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            final SubLObject var2 = module0015.$g537$.currentBinding(var1);
            try {
                module0015.$g537$.bind((SubLObject)T, var1);
                module0642.f39034(module0018.$g678$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g537$.rebind(var2, var1);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
            SubLObject var3 = module0018.$g679$.getGlobalValue();
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                if (!var4.eql(module0018.$g679$.getGlobalValue().first())) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                if (NIL != assertion_handles_oc.f11035(var4)) {
                    module0656.f39916(var4, (SubLObject)T, (SubLObject)UNPROVIDED);
                }
                else {
                    module0656.f39804(var4, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41424(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic155$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = (SubLObject)$ic156$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_129 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_130 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_131 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_131, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_132 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic157$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic153$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic158$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic159$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        if (NIL != module0593.f36267()) {
                            module0642.f39019((SubLObject)$ic160$);
                        }
                        else {
                            module0642.f39019((SubLObject)$ic161$);
                        }
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic162$);
                        if (NIL != module0018.$g677$.getGlobalValue() && (NIL != module0593.f36267() || $ic163$ == module0593.f36290())) {
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            final SubLObject var10 = module0593.f36286();
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            if (module0593.f36286().equalp((SubLObject)$ic164$)) {
                                module0642.f39019((SubLObject)$ic165$);
                            }
                            else {
                                module0642.f39019((SubLObject)$ic166$);
                            }
                            module0642.f39019((SubLObject)$ic167$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            if (var10.equalp((SubLObject)$ic164$)) {
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0642.f39074((SubLObject)$ic168$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0656.f39804(f41425(module0593.f36270()), (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        }
                        if (NIL == module0593.f36267() && $ic163$ == module0593.f36290()) {
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
                    if (NIL == module0575.f35244()) {
                        f41428();
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_130, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_129, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41429() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic170$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39019((SubLObject)$ic171$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41430(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        if (NIL == module0593.f36267()) {
            return module0656.f39789((SubLObject)$ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0593.f36283();
        module0593.f36282((SubLObject)THREE_INTEGER);
        f41424((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41426() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic19$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        final SubLObject var4 = module0015.$g541$.currentBinding(var1);
        final SubLObject var5 = module0015.$g539$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0015.$g541$.bind((SubLObject)T, var1);
            module0015.$g539$.bind(module0015.f797(), var1);
            module0642.f39069((SubLObject)$ic176$, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic177$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != module0593.f36267()) {
                module0642.f39074((SubLObject)$ic178$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0642.f39074((SubLObject)$ic179$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic180$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            PrintLow.format(module0015.$g131$.getDynamicValue(var1), (SubLObject)$ic181$, f41402(), $g5337$.getDynamicValue(var1));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_134 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39019((SubLObject)$ic182$);
            }
            finally {
                module0015.$g533$.rebind(var4_134, var1);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
            module0642.f39019((SubLObject)$ic162$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0015.f799(module0015.$g539$.getDynamicValue(var1));
        }
        finally {
            module0015.$g539$.rebind(var5, var1);
            module0015.$g541$.rebind(var4, var1);
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41431(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0593.f36267();
        module0642.f39020((SubLObject)$ic6$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
        final SubLObject var5 = module0014.f672((SubLObject)$ic7$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var5) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var5);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic183$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0660.f40193();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var6 = module0015.$g132$.getDynamicValue(var3);
        final SubLObject var7 = module0015.$g535$.currentBinding(var3);
        try {
            module0015.$g535$.bind((SubLObject)T, var3);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var6) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var6));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_137 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_138 = module0015.$g533$.currentBinding(var3);
                final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0015.$g541$.bind((SubLObject)T, var3);
                    module0015.$g539$.bind(module0015.f797(), var3);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic183$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    if (NIL != var4) {
                        module0642.f39019((SubLObject)$ic184$);
                    }
                    else {
                        module0642.f39019((SubLObject)$ic185$);
                    }
                    module0642.f39011();
                    if (NIL != var4) {
                        module0593.f36279((SubLObject)TWO_INTEGER);
                    }
                    else {
                        module0593.f36268((SubLObject)TWO_INTEGER);
                    }
                    if (NIL != var4) {
                        module0593.f36282((SubLObject)THREE_INTEGER);
                    }
                    else {
                        module0593.f36280((SubLObject)THREE_INTEGER);
                    }
                    module0642.f39026((SubLObject)UNPROVIDED);
                    final SubLObject var10 = module0593.f36267();
                    if (!var4.equalp(var10)) {
                        module0642.f39019((SubLObject)$ic186$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        if (NIL != var10) {
                            module0642.f39019((SubLObject)$ic160$);
                        }
                        else {
                            module0642.f39019((SubLObject)$ic161$);
                        }
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0642.f39019((SubLObject)$ic187$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        if (NIL != var10) {
                            module0642.f39019((SubLObject)$ic160$);
                        }
                        else {
                            module0642.f39019((SubLObject)$ic161$);
                        }
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic188$);
                    }
                    module0656.f39794((SubLObject)$ic189$);
                    module0015.f799(module0015.$g539$.getDynamicValue(var3));
                }
                finally {
                    module0015.$g539$.rebind(var9, var3);
                    module0015.$g541$.rebind(var8, var3);
                    module0015.$g533$.rebind(var4_138, var3);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_137, var3);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var7, var3);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41427() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0593.f36290();
        final SubLObject var3 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g282$.getGlobalValue());
        module0642.f39020(module0015.$g284$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0110.$g570$.getDynamicValue(var1));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g285$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic19$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            module0642.f39020(module0015.$g286$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        final SubLObject var5 = module0015.$g541$.currentBinding(var1);
        final SubLObject var6 = module0015.$g539$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0015.$g541$.bind((SubLObject)T, var1);
            module0015.$g539$.bind(module0015.f797(), var1);
            module0642.f39069((SubLObject)$ic191$, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic192$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)SEVEN_INTEGER);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            final SubLObject var7 = var2;
            if (var7.eql((SubLObject)$ic193$)) {
                module0642.f39019((SubLObject)$ic194$);
            }
            else if (var7.eql((SubLObject)$ic163$)) {
                module0642.f39019((SubLObject)$ic195$);
            }
            else if (var7.eql((SubLObject)$ic196$)) {
                module0642.f39019((SubLObject)$ic197$);
            }
            else if (var7.eql((SubLObject)$ic198$)) {
                module0642.f39019(PrintLow.format((SubLObject)NIL, (SubLObject)$ic199$));
                module0642.f39067();
                module0642.f39032((SubLObject)SEVEN_INTEGER);
                module0656.f39837((SubLObject)$ic200$, module0075.f5225(module0593.f36294()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0656.f39789((SubLObject)$ic201$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic202$);
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic203$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39019((SubLObject)$ic204$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39072((SubLObject)$ic205$, (SubLObject)$ic206$, Equality.eq(var2, (SubLObject)$ic193$), (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic207$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39072((SubLObject)$ic205$, (SubLObject)$ic208$, Equality.eq(var2, (SubLObject)$ic163$), (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic209$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39072((SubLObject)$ic205$, (SubLObject)$ic210$, Equality.eq(var2, (SubLObject)$ic198$), (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39019((SubLObject)$ic211$);
            module0642.f39032((SubLObject)EIGHT_INTEGER);
            module0642.f39139((SubLObject)$ic212$, module0593.f36294(), (SubLObject)$ic213$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39073((SubLObject)$ic214$);
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0642.f39074((SubLObject)$ic203$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0015.f799(module0015.$g539$.getDynamicValue(var1));
        }
        finally {
            module0015.$g539$.rebind(var6, var1);
            module0015.$g541$.rebind(var5, var1);
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g283$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41432(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)$ic205$, var2);
        final SubLObject var4 = module0642.f39104((SubLObject)$ic212$, var2);
        final SubLObject var5 = reader.read_from_string_ignoring_errors(var3, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0593.f36291(var5);
        if (NIL != module0593.f36292()) {
            module0593.f36293(var4);
        }
        f41424((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41428() {
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic38$);
        module0642.f39020(module0015.$g224$.getGlobalValue());
        module0642.f39019(module0575.f35243());
        module0642.f39020(module0015.$g225$.getGlobalValue());
        module0642.f39019((SubLObject)$ic216$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0656.f39837((SubLObject)$ic217$, (SubLObject)$ic218$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0656.f39837((SubLObject)$ic219$, (SubLObject)$ic220$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0656.f39837((SubLObject)$ic221$, (SubLObject)$ic222$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41433(SubLObject var145) {
        if (var145 == UNPROVIDED) {
            var145 = (SubLObject)NIL;
        }
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic223$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var147) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var148 = module0015.$g533$.currentBinding(var146);
        try {
            module0015.$g533$.bind((SubLObject)T, var146);
            PrintLow.format(module0015.$g131$.getDynamicValue(var146), (SubLObject)$ic224$, var145);
        }
        finally {
            module0015.$g533$.rebind(var148, var146);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41434(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file(module0593.f36294())) {
            module0642.f39020(module0075.f5215(module0593.f36294()));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var3), (SubLObject)$ic226$, module0593.f36294());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41435(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic228$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41436() {
        module0656.f39837((SubLObject)$ic229$, (SubLObject)$ic231$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41437(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic236$);
            return (SubLObject)NIL;
        }
        module0642.f39020((SubLObject)$ic6$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
        final SubLObject var4 = module0014.f672((SubLObject)$ic7$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var4) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var4);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic237$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0660.f40193();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var5 = module0015.$g132$.getDynamicValue(var3);
        final SubLObject var6 = module0015.$g535$.currentBinding(var3);
        try {
            module0015.$g535$.bind((SubLObject)T, var3);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var5) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var5));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_147 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_148 = module0015.$g533$.currentBinding(var3);
                final SubLObject var7 = module0015.$g541$.currentBinding(var3);
                final SubLObject var8 = module0015.$g539$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0015.$g541$.bind((SubLObject)T, var3);
                    module0015.$g539$.bind(module0015.f797(), var3);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic237$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0656.f39870((SubLObject)$ic234$, (SubLObject)$ic137$, (SubLObject)$ic238$);
                    module0642.f39026((SubLObject)TWO_INTEGER);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_147, var3);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var6, var3);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41438() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39046(module0015.$g348$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_149 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_150 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic240$);
                }
                finally {
                    module0015.$g533$.rebind(var4_150, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_151 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39032((SubLObject)THREE_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var4_151, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_152 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(Environment.get_network_name(Environment.get_machine_name((SubLObject)$ic241$)));
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_153 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_154 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic242$);
                }
                finally {
                    module0015.$g533$.rebind(var4_154, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_155 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_155, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_156 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(Environment.lisp_implementation_type());
                    module0642.f39019((SubLObject)$ic100$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_157 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_158 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic243$);
                }
                finally {
                    module0015.$g533$.rebind(var4_158, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_159 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_159, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_160 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_161 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_162 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic244$);
                }
                finally {
                    module0015.$g533$.rebind(var4_162, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_163 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_163, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_164 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3 = Environment.get_process_id((SubLObject)UNPROVIDED);
            if (NIL != var3) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_165 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_166 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var1);
                        module0642.f39019((SubLObject)$ic245$);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_166, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_167 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var1);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_167, var1);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_168 = module0015.$g533$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var1);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            final SubLObject var4 = module0051.f3552(module0011.f355());
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_169 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_170 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic246$);
                }
                finally {
                    module0015.$g533$.rebind(var4_170, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_171 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_171, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_172 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019(var4);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    PrintLow.format(module0015.$g131$.getDynamicValue(var1), (SubLObject)$ic247$, module0051.f3574(module0011.f356(), (SubLObject)ZERO_INTEGER));
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_173 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_174 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic248$);
                }
                finally {
                    module0015.$g533$.rebind(var4_174, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_175 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_175, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_176 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_177 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_178 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic249$);
                }
                finally {
                    module0015.$g533$.rebind(var4_178, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_179 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                }
                finally {
                    module0015.$g533$.rebind(var4_179, var1);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_180 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var2, var1);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)T;
    }
    
    public static SubLObject f41440() {
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic250$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic251$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(Numbers.add(module0574.f35163(), module0575.f35252()));
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic252$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35252());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic253$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35165());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic254$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(Numbers.subtract(module0574.f35165(), module0574.f35150()));
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic255$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35150());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic256$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35243());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic257$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35257());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic258$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0575.f35277());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (module0574.f35142().numG((SubLObject)ZERO_INTEGER) || module0575.f35267().numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic259$);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0575.f35267());
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41439() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic260$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic261$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        final SubLObject var2 = module0572.f35062((SubLObject)UNPROVIDED);
        if (NIL != module0573.f35083()) {
            module0642.f39019((SubLObject)$ic262$);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic263$);
            module0642.f39019(var2);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        else {
            if (module0572.f35020().isString()) {
                module0656.f39837((SubLObject)$ic264$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0642.f39019((SubLObject)$ic265$);
            }
            if (module0572.f35020().isString()) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic266$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39019(module0075.f5249(module0572.f35020()));
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                if (NIL != module0110.$g1375$.getDynamicValue(var1)) {
                    module0642.f39019((SubLObject)$ic263$);
                }
                else {
                    module0642.f39019((SubLObject)$ic267$);
                }
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39019(var2);
            }
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic268$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (NIL != module0574.f35200()) {
            module0656.f39837((SubLObject)$ic269$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39019((SubLObject)$ic265$);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != module0574.f35200()) {
            module0642.f39028((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic263$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39019(module0575.f35277());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41441() {
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic270$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39019((SubLObject)$ic271$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35165());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic272$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35144());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic273$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(module0574.f35146());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (module0574.f35142().numG((SubLObject)ZERO_INTEGER)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic274$);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019(module0574.f35142());
            module0642.f39020(module0015.$g235$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41442() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = Eval.eval(conses_high.second(conses_high.assoc((SubLObject)$ic275$, module0655.$g5076$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)$ic276$), (SubLObject)UNPROVIDED)));
        final SubLObject var3 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic277$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        f41443(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41444() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = Eval.eval(conses_high.second(conses_high.assoc((SubLObject)$ic279$, module0655.$g5076$.getDynamicValue(var1), Symbols.symbol_function((SubLObject)$ic276$), (SubLObject)UNPROVIDED)));
        final SubLObject var3 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic40$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var3);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39019(var2);
        }
        finally {
            module0015.$g533$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        f41443(var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41445(final SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        final SubLObject var147 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var146), (SubLObject)$ic281$, var145);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var147) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var147);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var148 = module0015.$g533$.currentBinding(var146);
        try {
            module0015.$g533$.bind((SubLObject)T, var146);
            module0642.f39019(module0075.f5226(var145));
        }
        finally {
            module0015.$g533$.rebind(var148, var146);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        f41443(var145);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41443(final SubLObject var184) {
        final SubLThread var185 = SubLProcess.currentSubLThread();
        if (var184.isString()) {
            module0642.f39032((SubLObject)UNPROVIDED);
            final SubLObject var186 = module0656.f39832((SubLObject)$ic39$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)$ic284$);
            module0642.f39019(Sequences.cconcatenate((SubLObject)$ic285$, var184));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var186) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var186);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var187 = module0015.$g533$.currentBinding(var185);
            try {
                module0015.$g533$.bind((SubLObject)T, var185);
                module0642.f39019((SubLObject)$ic286$);
            }
            finally {
                module0015.$g533$.rebind(var187, var185);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41446(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = var2.first();
        if (NIL != conses_high.assoc(var4, module0655.$g5076$.getDynamicValue(var3), (SubLObject)$ic287$, (SubLObject)UNPROVIDED)) {
            var4 = Eval.eval(conses_high.second(conses_high.assoc(var4, module0655.$g5076$.getDynamicValue(var3), Symbols.symbol_function((SubLObject)$ic276$), (SubLObject)UNPROVIDED)));
        }
        f41447(var4);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41447(final SubLObject var145) {
        SubLObject var146 = (SubLObject)ZERO_INTEGER;
        SubLObject var147 = (SubLObject)NIL;
        if (var145.isString() && NIL != Filesys.probe_file(var145)) {
            SubLObject var148 = (SubLObject)NIL;
            try {
                var148 = compatibility.open_text(var145, (SubLObject)$ic289$);
                if (!var148.isStream()) {
                    Errors.error((SubLObject)$ic290$, var145);
                }
                SubLObject var149;
                SubLObject var150;
                for (var149 = var148, var150 = (SubLObject)NIL, var150 = reader.read_ignoring_errors(var149, (SubLObject)NIL, (SubLObject)NIL); NIL != var150; var150 = reader.read_ignoring_errors(var149, (SubLObject)NIL, (SubLObject)NIL)) {
                    var147 = (SubLObject)ConsesLow.cons(var150, var147);
                    var146 = Numbers.add(var146, (SubLObject)ONE_INTEGER);
                }
            }
            finally {
                final SubLObject var151 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (var148.isStream()) {
                        streams_high.close(var148, (SubLObject)UNPROVIDED);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var151);
                }
            }
            var147 = Sequences.nreverse(var147);
        }
        f41448(var145, var146, var147);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41448(final SubLObject var80, final SubLObject var185, final SubLObject var186) {
        final SubLThread var187 = SubLProcess.currentSubLThread();
        final SubLObject var188 = (SubLObject)$ic293$;
        final SubLObject var189 = module0015.$g538$.currentBinding(var187);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var187))) ? module0015.$g538$.getDynamicValue(var187) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var187);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var187), module0655.$g5142$.getDynamicValue(var187));
            final SubLObject var190 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var190) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var190);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var188) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var188);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_190 = module0015.$g535$.currentBinding(var187);
            try {
                module0015.$g535$.bind((SubLObject)T, var187);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var187)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var187)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_191 = module0015.$g533$.currentBinding(var187);
                try {
                    module0015.$g533$.bind((SubLObject)T, var187);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_192 = module0015.$g533$.currentBinding(var187);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var187);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_192, var187);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var188) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var188);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var187));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_193 = module0015.$g533$.currentBinding(var187);
                    final SubLObject var191 = module0015.$g541$.currentBinding(var187);
                    final SubLObject var192 = module0015.$g539$.currentBinding(var187);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var187);
                        module0015.$g541$.bind((SubLObject)T, var187);
                        module0015.$g539$.bind(module0015.f797(), var187);
                        module0656.f39870((SubLObject)$ic291$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic294$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0656.f39837((SubLObject)$ic282$, var80, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic295$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(var185);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        if (var80.isString()) {
                            if (NIL != Filesys.probe_file(var80) && var185.numG((SubLObject)ZERO_INTEGER)) {
                                module0015.f741();
                                module0642.f39020(module0015.$g203$.getGlobalValue());
                                final SubLObject var4_194 = module0015.$g537$.currentBinding(var187);
                                try {
                                    module0015.$g537$.bind((SubLObject)T, var187);
                                    SubLObject var193 = var186;
                                    SubLObject var194 = (SubLObject)NIL;
                                    var194 = var193.first();
                                    while (NIL != var193) {
                                        module0656.f39804(f41425(var194), (SubLObject)ZERO_INTEGER, (SubLObject)T);
                                        module0642.f39028((SubLObject)TWO_INTEGER);
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
                                module0642.f39019((SubLObject)$ic296$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019(var80);
                            }
                        }
                        else {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var187), (SubLObject)$ic297$, var80);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var187));
                    }
                    finally {
                        module0015.$g539$.rebind(var192, var187);
                        module0015.$g541$.rebind(var191, var187);
                        module0015.$g533$.rebind(var4_193, var187);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_191, var187);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_190, var187);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var189, var187);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41425(SubLObject var195) {
        var195 = module0571.f34996(var195);
        var195 = module0290.f19534(var195);
        var195 = module0290.f19535(var195);
        return var195;
    }
    
    public static SubLObject f41449(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0538.f33465();
        final SubLObject var5 = (SubLObject)$ic300$;
        final SubLObject var6 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var7 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var7) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var7);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var5) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var5);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_197 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_198 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_199 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_199, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var5) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var5);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var8 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var8) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var8);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_200 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var10 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic301$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic298$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic302$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        SubLObject var11 = f41450();
                        var11 = module0213.f13926(var11, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)THREE_INTEGER);
                        module0642.f39072((SubLObject)$ic303$, (SubLObject)NIL, Types.sublisp_null(var4), (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic304$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        SubLObject var12 = var11;
                        SubLObject var13 = (SubLObject)NIL;
                        var13 = var12.first();
                        while (NIL != var12) {
                            module0642.f39032((SubLObject)THREE_INTEGER);
                            module0642.f39072((SubLObject)$ic303$, var13, Equality.eq(var4, var13), (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0656.f39804(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            var12 = var12.rest();
                            var13 = var12.first();
                        }
                        module0642.f39073((SubLObject)$ic305$);
                        module0642.f39074((SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var10, var3);
                        module0015.$g541$.rebind(var9, var3);
                        module0015.$g533$.rebind(var4_200, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_198, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_197, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var6, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41450() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0147.f9540($ic307$);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        final SubLObject var5 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var6 = module0147.$g2096$.currentBinding(var1);
        try {
            module0147.$g2095$.bind(module0147.f9545(var3), var1);
            module0147.$g2094$.bind(module0147.f9546(var3), var1);
            module0147.$g2096$.bind(module0147.f9549(var3), var1);
            var2 = conses_high.intersection(module0259.f16848($ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0259.f16848($ic308$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var6, var1);
            module0147.$g2094$.rebind(var5, var1);
            module0147.$g2095$.rebind(var4, var1);
        }
        return var2;
    }
    
    public static SubLObject f41451(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)$ic303$, var2);
        if (var3.equal((SubLObject)$ic309$)) {
            module0538.f33466((SubLObject)NIL);
        }
        else {
            module0538.f33466(module0656.f39943(var3, (SubLObject)UNPROVIDED));
        }
        module0677.f41287();
        module0656.f39793((SubLObject)$ic310$, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41452(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL == var118) {
            var118 = (SubLObject)$ic312$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic313$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41453(final SubLObject var205, final SubLObject var206) {
        module0574.f35157(var205, var206, $ic316$);
        return f41454();
    }
    
    public static SubLObject f41455(final SubLObject var205) {
        module0574.f35153(var205);
        return f41454();
    }
    
    public static SubLObject f41454() {
        final SubLObject var205 = module0574.f35152();
        if (NIL == module0574.f35155()) {
            final SubLObject var206 = f41456(var205);
            module0538.f33466(var206.first());
            module0677.f41380();
        }
        return var205;
    }
    
    public static SubLObject f41456(final SubLObject var207) {
        final SubLThread var208 = SubLProcess.currentSubLThread();
        SubLObject var209 = (SubLObject)NIL;
        final SubLObject var210 = module0018.$g701$.currentBinding(var208);
        try {
            module0018.$g701$.bind((SubLObject)NIL, var208);
            var209 = module0434.f30576((SubLObject)$ic317$, (SubLObject)ConsesLow.listS($ic318$, var207, (SubLObject)$ic319$), $ic307$, (SubLObject)$ic320$);
        }
        finally {
            module0018.$g701$.rebind(var210, var208);
        }
        return var209;
    }
    
    public static SubLObject f41457(final SubLObject var196) {
        $g5201$.setDynamicValue(var196);
        return var196;
    }
    
    public static SubLObject f41458(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39110((SubLObject)$ic323$, var2, (SubLObject)UNPROVIDED);
        final SubLObject var5 = Types.stringp(var4);
        final SubLObject var6 = (SubLObject)$ic324$;
        final SubLObject var7 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var8 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var8) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var8);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var6) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var6);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            final SubLObject var9 = module0014.f657((SubLObject)$ic10$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g479$.getGlobalValue());
            module0642.f39020(module0015.$g482$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g483$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic11$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_212 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_212, var3);
            }
            module0642.f39020(module0015.$g480$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_213 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_214 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_215 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_215, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var6) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var6);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var10 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var10);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_216 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic325$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic321$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != $g5201$.getDynamicValue(var3)) {
                            module0642.f39019((SubLObject)$ic326$);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019($g5201$.getDynamicValue(var3));
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                        }
                        module0642.f39019((SubLObject)$ic327$);
                        module0642.f39020(module0015.$g207$.getGlobalValue());
                        module0656.f39804(module0574.f35152(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g208$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic162$);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic328$);
                        module0656.f39837((SubLObject)$ic329$, (SubLObject)$ic330$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic331$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic332$);
                        module0642.f39020(module0015.$g224$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic22$);
                        module0642.f39020(module0015.$g225$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic333$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        if (NIL != module0574.f35156()) {
                            module0642.f39156((SubLObject)$ic323$, (SubLObject)$ic334$, (SubLObject)$ic335$, (SubLObject)$ic336$, var4, var5);
                        }
                        else {
                            f41459((SubLObject)$ic323$);
                        }
                        final SubLObject var13 = module0538.f33465();
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0656.f39837((SubLObject)$ic314$, (SubLObject)$ic312$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic337$);
                        if (NIL != var13) {
                            module0656.f39804(var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else {
                            module0642.f39019((SubLObject)$ic304$);
                        }
                        module0642.f39026((SubLObject)THREE_INTEGER);
                        module0642.f39019((SubLObject)$ic338$);
                        module0642.f39019(Environment.get_network_name((SubLObject)$ic241$));
                        module0642.f39019((SubLObject)$ic339$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        final SubLObject var14 = module0723.f44310();
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)FIVE_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_217 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_218 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_219 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39020(module0015.$g242$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic340$);
                                    module0642.f39020(module0015.$g243$.getGlobalValue());
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_219, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_220 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g234$.getGlobalValue());
                                    module0642.f39020(module0015.$g242$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic341$);
                                    module0642.f39020(module0015.$g243$.getGlobalValue());
                                    module0642.f39020(module0015.$g235$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_220, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                SubLObject var15 = var14;
                                SubLObject var16 = (SubLObject)NIL;
                                var16 = var15.first();
                                while (NIL != var15) {
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_221 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var3);
                                        SubLObject var18;
                                        final SubLObject var17 = var18 = var16;
                                        SubLObject var19 = (SubLObject)NIL;
                                        SubLObject var20 = (SubLObject)NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic342$);
                                        var19 = var18.first();
                                        var18 = var18.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic342$);
                                        var20 = var18.first();
                                        var18 = var18.rest();
                                        if (NIL == var18) {
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var4_222 = module0015.$g533$.currentBinding(var3);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var3);
                                                module0656.f39804(var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_222, var3);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                            if (NIL != module0589.f35878(var19)) {
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var4_223 = module0015.$g533$.currentBinding(var3);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var3);
                                                    module0642.f39019(module0589.f35876(var19));
                                                    module0642.f39032((SubLObject)UNPROVIDED);
                                                    module0642.f39019((SubLObject)$ic343$);
                                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                                    module0642.f39019(var19);
                                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                                    module0642.f39032((SubLObject)UNPROVIDED);
                                                    module0656.f39837((SubLObject)$ic344$, var19, (SubLObject)$ic345$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    module0642.f39019((SubLObject)$ic346$);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var4_223, var3);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            else {
                                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var4_224 = module0015.$g533$.currentBinding(var3);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var3);
                                                    module0642.f39019(var19);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var4_224, var3);
                                                }
                                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                            }
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var4_225 = module0015.$g533$.currentBinding(var3);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var3);
                                                if (var19.equal(module0723.f44261())) {
                                                    module0642.f39020(module0015.$g459$.getGlobalValue());
                                                    module0642.f39032((SubLObject)UNPROVIDED);
                                                    module0642.f39020(module0015.$g207$.getGlobalValue());
                                                    module0642.f39027((SubLObject)$ic347$, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(module0015.$g208$.getGlobalValue());
                                                    module0642.f39019((SubLObject)$ic348$);
                                                    module0642.f39020(module0015.$g460$.getGlobalValue());
                                                }
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var4_225, var3);
                                            }
                                            module0642.f39020(module0015.$g361$.getGlobalValue());
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic342$);
                                        }
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var4_221, var3);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                    var15 = var15.rest();
                                    var16 = var15.first();
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var4_218, var3);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_217, var3);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        if (NIL == module0035.f1993(module0723.f44310(), (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0656.f39837((SubLObject)$ic349$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var3);
                        module0015.$g541$.rebind(var11, var3);
                        module0015.$g533$.rebind(var4_216, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_214, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_213, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var7, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41460(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var3 = module0642.f39104((SubLObject)$ic351$, var2);
        final SubLObject var4 = (SubLObject)((NIL != module0723.f44302(var3)) ? $ic352$ : $ic353$);
        module0589.f35875(var3);
        f41458((SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f41461(final SubLObject var232, SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var233 = SubLProcess.currentSubLThread();
        if (NIL == var118) {
            var118 = var232;
        }
        final SubLObject var234 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var233), (SubLObject)$ic355$, (SubLObject)$ic356$, var232);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var234) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var234);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var235 = module0015.$g533$.currentBinding(var233);
        try {
            module0015.$g533$.bind((SubLObject)T, var233);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var235, var233);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41459(final SubLObject var234) {
        module0666.f40467(var234, (SubLObject)$ic358$, $ic359$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39075(var234, (SubLObject)NIL, (SubLObject)$ic360$);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39073((SubLObject)$ic361$);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39074((SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41462() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic362$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39019((SubLObject)$ic363$);
        }
        finally {
            module0015.$g533$.rebind(var3, var1);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41463(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)$ic365$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_235 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_236 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_237 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_237, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g185$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic366$);
                    module0642.f39020(module0015.$g186$.getGlobalValue());
                    final SubLObject var7 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_238 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic367$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_239 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            f41464();
                            SubLObject var10 = (SubLObject)ZERO_INTEGER;
                            SubLObject var11 = Sequences.remove_duplicates(module0723.f44310(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic372$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            SubLObject var12 = (SubLObject)NIL;
                            var12 = var11.first();
                            while (NIL != var11) {
                                SubLObject var14;
                                final SubLObject var13 = var14 = var12;
                                SubLObject var15 = (SubLObject)NIL;
                                SubLObject var16 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic368$);
                                var15 = var14.first();
                                var14 = var14.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic368$);
                                var16 = var14.first();
                                var14 = var14.rest();
                                if (NIL == var14) {
                                    if (!var16.eql(module0574.f35152()) && !var16.eql($ic369$)) {
                                        module0642.f39020(module0015.$g364$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var4_240 = module0015.$g533$.currentBinding(var3);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var3);
                                            module0642.f39020(module0015.$g360$.getGlobalValue());
                                            module0642.f39020(module0015.$g370$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0642.f39049((SubLObject)$ic370$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g373$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var4_241 = module0015.$g533$.currentBinding(var3);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var3);
                                                if (var10.isZero()) {
                                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                                    module0642.f39019((SubLObject)$ic371$);
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
                                        module0642.f39029((SubLObject)UNPROVIDED);
                                        var10 = Numbers.add(var10, (SubLObject)ONE_INTEGER);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic368$);
                                }
                                var11 = var11.rest();
                                var12 = var11.first();
                            }
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_242 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic370$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_243 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic373$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_244 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic370$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_245 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic374$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_245, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)THREE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_246 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g346$.getGlobalValue());
                                    module0642.f39020(module0015.$g352$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)ZERO_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_247 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var3);
                                        module0642.f39075((SubLObject)$ic375$, (SubLObject)$ic74$, (SubLObject)$ic376$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_248 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic370$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_249 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic377$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_249, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)THREE_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_250 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g336$.getGlobalValue());
                                    module0642.f39020(module0015.$g338$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic17$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g340$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)$ic376$);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g339$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020((SubLObject)FIVE_INTEGER);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_251 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var3);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_239, var3);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39074((SubLObject)$ic378$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_238, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_236, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_235, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41465(final SubLObject var205) {
        final SubLThread var206 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var207 = module0015.$g533$.currentBinding(var206);
        try {
            module0015.$g533$.bind((SubLObject)T, var206);
            module0656.f39804(var205, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var207, var206);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var207 = module0015.$g533$.currentBinding(var206);
        try {
            module0015.$g533$.bind((SubLObject)T, var206);
            module0642.f39019(f41466(var205));
        }
        finally {
            module0015.$g533$.rebind(var207, var206);
        }
        module0642.f39020(module0015.$g361$.getGlobalValue());
        module0642.f39020(module0015.$g360$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var207 = module0015.$g533$.currentBinding(var206);
        try {
            module0015.$g533$.bind((SubLObject)T, var206);
            final SubLObject var208 = f41467(var205);
            module0642.f39068(var208, (SubLObject)$ic380$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var2 = module0015.$g533$.currentBinding(var1);
        try {
            module0015.$g533$.bind((SubLObject)T, var1);
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_257 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
            }
            finally {
                module0015.$g533$.rebind(var4_257, var1);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_258 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)$ic340$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_258, var1);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_259 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)$ic381$);
                module0642.f39020(module0015.$g210$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var4_259, var1);
            }
            module0642.f39020(module0015.$g361$.getGlobalValue());
            module0642.f39020(module0015.$g360$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_260 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g209$.getGlobalValue());
                module0642.f39019((SubLObject)$ic382$);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41468() {
        final SubLObject var261 = $g5338$.getGlobalValue();
        if (NIL != var261) {
            module0034.f1818(var261);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41469(final SubLObject var205) {
        return module0034.f1829($g5338$.getGlobalValue(), (SubLObject)ConsesLow.list(var205), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41470(final SubLObject var205) {
        return Sequences.cconcatenate((SubLObject)$ic384$, module0597.f36628(var205));
    }
    
    public static SubLObject f41467(final SubLObject var205) {
        SubLObject var206 = $g5338$.getGlobalValue();
        if (NIL == var206) {
            var206 = module0034.f1934((SubLObject)$ic383$, (SubLObject)$ic385$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var207 = module0034.f1814(var206, var205, (SubLObject)$ic386$);
        if (var207 == $ic386$) {
            var207 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f41470(var205)));
            module0034.f1816(var206, var205, var207, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var207);
    }
    
    public static SubLObject f41466(final SubLObject var205) {
        SubLObject var206 = (SubLObject)NIL;
        var206 = module0434.f30579((SubLObject)$ic387$, (SubLObject)ConsesLow.listS($ic388$, var205, (SubLObject)$ic389$), $ic390$, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var206) {
            return (SubLObject)$ic241$;
        }
        return var206.first();
    }
    
    public static SubLObject f41471(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39104((SubLObject)$ic17$, var2);
        final SubLObject var5 = module0642.f39104((SubLObject)$ic375$, var2);
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = (SubLObject)$ic391$;
        final SubLObject var8 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var9 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var9) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var9);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var7) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var7);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_266 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_267 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_268 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_268, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var7);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g185$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic392$);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_269 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_270 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic52$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_271 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic393$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_271, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_272 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0015.f741();
                                module0642.f39020(module0015.$g203$.getGlobalValue());
                                final SubLObject var4_273 = module0015.$g537$.currentBinding(var3);
                                try {
                                    module0015.$g537$.bind((SubLObject)T, var3);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_274 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic52$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_275 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic394$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var4_275, var3);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic56$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_276 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0015.f741();
                                module0642.f39020(module0015.$g203$.getGlobalValue());
                                final SubLObject var4_277 = module0015.$g537$.currentBinding(var3);
                                try {
                                    module0015.$g537$.bind((SubLObject)T, var3);
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_269, var3);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0642.f39020(module0015.$g186$.getGlobalValue());
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g209$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic395$);
                    module0642.f39020(module0015.$g210$.getGlobalValue());
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g264$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_278 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        SubLObject var10 = module0723.f44310();
                        SubLObject var11 = (SubLObject)NIL;
                        var11 = var10.first();
                        while (NIL != var10) {
                            SubLObject var13;
                            final SubLObject var12 = var13 = var11;
                            SubLObject var14 = (SubLObject)NIL;
                            SubLObject var15 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic396$);
                            var14 = var13.first();
                            var13 = var13.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var13, var12, (SubLObject)$ic396$);
                            var15 = var13.first();
                            var13 = var13.rest();
                            if (NIL == var13) {
                                final SubLObject var16 = f41467(var15);
                                if (NIL != module0642.f39104(var16, var2)) {
                                    module0642.f39020(module0015.$g275$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_279 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var3);
                                        module0642.f39019((SubLObject)$ic397$);
                                        module0656.f39804(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                                cdestructuring_bind.cdestructuring_bind_error(var12, (SubLObject)$ic396$);
                            }
                            var10 = var10.rest();
                            var11 = var10.first();
                        }
                        final SubLObject var17 = f41466(module0574.f35152());
                        SubLObject var18 = var6;
                        SubLObject var19 = (SubLObject)NIL;
                        var19 = var18.first();
                        while (NIL != var18) {
                            final SubLObject var20 = f41466(var19);
                            var3.resetMultipleValues();
                            final SubLObject var21 = module0046.f3173(var17, var20, var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var22 = var3.secondMultipleValue();
                            var3.resetMultipleValues();
                            if (NIL != var21) {
                                module0642.f39020(module0015.$g275$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_280 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic398$);
                                    module0656.f39804(var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_280, var3);
                                }
                                module0642.f39020(module0015.$g276$.getGlobalValue());
                            }
                            else {
                                module0642.f39020(module0015.$g275$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_281 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    final SubLObject var23 = module0015.$g500$.getGlobalValue();
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    if (NIL != var23) {
                                        module0642.f39020(module0015.$g222$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39042(var23));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_282 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var3);
                                        module0642.f39019((SubLObject)$ic399$);
                                        module0656.f39804(var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        module0642.f39019((SubLObject)$ic337$);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_267, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_266, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var8, var3);
        }
        return var2;
    }
    
    public static SubLObject f41472(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL == var118) {
            var118 = (SubLObject)$ic401$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic402$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41473(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0038.f2735(module0642.f39110((SubLObject)$ic323$, var2, (SubLObject)$ic74$));
        final SubLObject var5 = module0642.f39110((SubLObject)$ic334$, var2, (SubLObject)$ic74$);
        final SubLObject var6 = f41474(var4, var5);
        if (var6 == $ic352$) {
            if (NIL == f41475(var2)) {
                f41476();
            }
            return (SubLObject)NIL;
        }
        if (NIL != module0574.f35156()) {
            f41458(var2);
            return (SubLObject)NIL;
        }
        final SubLObject var7 = module0660.f40150(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0035.remove_if_not((SubLObject)$ic405$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0035.f1997(var8)) {
            f41455(var8.first());
            if (NIL == f41475(var2)) {
                f41476();
            }
            return (SubLObject)NIL;
        }
        final SubLObject var9 = (Sequences.length(var4).numG((SubLObject)ZERO_INTEGER) && (NIL != Sequences.find((SubLObject)Characters.CHAR_space, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != Characters.lower_case_p(Strings.sublisp_char(var4, (SubLObject)ZERO_INTEGER)))) ? module0667.f40586(var4) : var4;
        final SubLObject var10 = module0538.f33337(var9);
        if (var9.isString() && NIL != module0126.f8389(var9)) {
            final SubLObject var11 = module0147.$g2094$.currentBinding(var3);
            final SubLObject var12 = module0147.$g2095$.currentBinding(var3);
            try {
                module0147.$g2094$.bind((SubLObject)$ic406$, var3);
                module0147.$g2095$.bind($ic307$, var3);
                if (NIL != var10 && NIL != module0226.f14810(var10)) {
                    f41455(var10);
                    if (NIL == f41475(var2)) {
                        f41476();
                    }
                }
                else if (NIL != var10 && NIL == module0226.f14810(var10)) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41474(final SubLObject var290, SubLObject var291) {
        if (var291 == UNPROVIDED) {
            var291 = (SubLObject)NIL;
        }
        if (NIL != module0574.f35156()) {
            f41453(var290, var291);
        }
        else {
            f41455(var290);
        }
        if (NIL == module0574.f35155()) {
            return (SubLObject)$ic352$;
        }
        return (SubLObject)$ic353$;
    }
    
    public static SubLObject f41475(final SubLObject var2) {
        final SubLObject var3 = module0642.f39104((SubLObject)$ic408$, var2);
        final SubLObject var4 = Sequences.position((SubLObject)$ic408$, var2, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)$ic409$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var3) {
            final SubLObject var5 = reader.read_from_string_ignoring_errors(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0015.f874(var5)) {
                Functions.funcall(var5, conses_high.nthcdr(module0048.f_1X(var4), var2));
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41479(final SubLObject var300) {
        if (NIL != module0035.f2014(var300)) {
            return var300.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41477(final SubLObject var296) {
        final SubLThread var297 = SubLProcess.currentSubLThread();
        final SubLObject var298 = (SubLObject)$ic410$;
        final SubLObject var299 = module0015.$g538$.currentBinding(var297);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var297))) ? module0015.$g538$.getDynamicValue(var297) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var297);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var297), module0655.$g5142$.getDynamicValue(var297));
            final SubLObject var300 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var300) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var300);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var298) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var298);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_301 = module0015.$g535$.currentBinding(var297);
            try {
                module0015.$g535$.bind((SubLObject)T, var297);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var297)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var297)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_302 = module0015.$g533$.currentBinding(var297);
                try {
                    module0015.$g533$.bind((SubLObject)T, var297);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_303 = module0015.$g533$.currentBinding(var297);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var297);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_303, var297);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var298) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var298);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var297));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_304 = module0015.$g533$.currentBinding(var297);
                    final SubLObject var301 = module0015.$g541$.currentBinding(var297);
                    final SubLObject var302 = module0015.$g539$.currentBinding(var297);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var297);
                        module0015.$g541$.bind((SubLObject)T, var297);
                        module0015.$g539$.bind(module0015.f797(), var297);
                        module0656.f39790((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic411$);
                        module0656.f39804(var296, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic412$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic413$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0015.f799(module0015.$g539$.getDynamicValue(var297));
                    }
                    finally {
                        module0015.$g539$.rebind(var302, var297);
                        module0015.$g541$.rebind(var301, var297);
                        module0015.$g533$.rebind(var4_304, var297);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_302, var297);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_301, var297);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var299, var297);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41476() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        module0658.f40050(module0574.f35152());
        module0642.f39020((SubLObject)$ic6$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var1), module0655.$g5142$.getDynamicValue(var1));
        final SubLObject var2 = module0014.f672((SubLObject)$ic7$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic8$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var2);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic9$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019((SubLObject)$ic414$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0677.f41287();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g132$.getDynamicValue(var1);
        final SubLObject var4 = module0015.$g535$.currentBinding(var1);
        try {
            module0015.$g535$.bind((SubLObject)T, var1);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            if (NIL != var3) {
                module0642.f39020(module0015.$g135$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var3));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_305 = module0015.$g533$.currentBinding(var1);
            try {
                module0015.$g533$.bind((SubLObject)T, var1);
                module0642.f39020(module0015.$g189$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic414$);
                module0642.f39020(module0015.$g190$.getGlobalValue());
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic415$);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39019(f41480(module0574.f35152()));
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39019((SubLObject)$ic416$);
                module0642.f39026((SubLObject)TWO_INTEGER);
                final SubLObject var5 = module0538.f33465();
                if (NIL != var5) {
                    module0642.f39019((SubLObject)$ic417$);
                    module0656.f39804(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic162$);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    final SubLObject var6 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var1));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_306 = module0015.$g533$.currentBinding(var1);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var1);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var1);
                        module0015.$g541$.bind((SubLObject)T, var1);
                        module0015.$g539$.bind(module0015.f797(), var1);
                        module0642.f39069((SubLObject)$ic313$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic418$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0642.f39019((SubLObject)$ic419$);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    final SubLObject var6 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var1));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var6) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var6);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_307 = module0015.$g533$.currentBinding(var1);
                    final SubLObject var7 = module0015.$g541$.currentBinding(var1);
                    final SubLObject var8 = module0015.$g539$.currentBinding(var1);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var1);
                        module0015.$g541$.bind((SubLObject)T, var1);
                        module0015.$g539$.bind(module0015.f797(), var1);
                        module0642.f39069((SubLObject)$ic313$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic420$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var1));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_308 = module0015.$g533$.currentBinding(var1);
                final SubLObject var9 = module0015.$g541$.currentBinding(var1);
                final SubLObject var10 = module0015.$g539$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0015.$g541$.bind((SubLObject)T, var1);
                    module0015.$g539$.bind(module0015.f797(), var1);
                    module0656.f39794((SubLObject)$ic421$);
                    module0015.f799(module0015.$g539$.getDynamicValue(var1));
                }
                finally {
                    module0015.$g539$.rebind(var10, var1);
                    module0015.$g541$.rebind(var9, var1);
                    module0015.$g533$.rebind(var4_308, var1);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var4_305, var1);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var4, var1);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41480(SubLObject var205) {
        if (var205 == UNPROVIDED) {
            var205 = module0574.f35152();
        }
        final SubLThread var206 = SubLProcess.currentSubLThread();
        SubLObject var207 = (SubLObject)NIL;
        if (NIL != module0131.f8548()) {
            final SubLObject var208 = module0579.$g4287$.currentBinding(var206);
            final SubLObject var209 = module0579.$g4260$.currentBinding(var206);
            try {
                module0579.$g4287$.bind((SubLObject)ONE_INTEGER, var206);
                module0579.$g4260$.bind(module0677.f41312(), var206);
                final SubLObject var210 = module0434.f30578((SubLObject)$ic423$, (SubLObject)ConsesLow.listS($ic424$, var205, (SubLObject)$ic425$), $ic426$, (SubLObject)UNPROVIDED);
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
                for (var211 = (SubLObject)NIL, var212 = (SubLObject)NIL, var212 = $g5339$.getGlobalValue(); NIL == var211 && NIL != var212; var212 = var212.rest()) {
                    var213 = var212.first();
                    var214 = (var215 = var213);
                    var216 = (SubLObject)NIL;
                    var217 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var215, var214, (SubLObject)$ic427$);
                    var216 = var215.first();
                    var215 = (var217 = var215.rest());
                    if (NIL != module0004.f104(var216, var210, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var218 = (var216.eql($ic428$) ? $ic429$ : $ic430$);
                        var206.resetMultipleValues();
                        var219 = module0770.f49067(var205, (SubLObject)$ic431$, (SubLObject)ConsesLow.list(var218), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        var220 = var206.secondMultipleValue();
                        var206.resetMultipleValues();
                        if (NIL != var219 && NIL != module0260.f17089(var220, var218, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var207 = Sequences.cconcatenate(var217, new SubLObject[] { $ic100$, var219 });
                        }
                        var211 = (SubLObject)T;
                    }
                }
                if (NIL == var207) {
                    var206.resetMultipleValues();
                    final SubLObject var221 = module0770.f49067(var205, (SubLObject)$ic431$, (SubLObject)$ic432$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var222 = var206.secondMultipleValue();
                    var206.resetMultipleValues();
                    if (NIL != var221 && NIL != module0260.f17089(var222, $ic429$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var207 = var221;
                    }
                }
            }
            finally {
                module0579.$g4260$.rebind(var209, var206);
                module0579.$g4287$.rebind(var208, var206);
            }
        }
        if (NIL == var207) {
            var207 = module0656.f39956(var205);
        }
        return var207;
    }
    
    public static SubLObject f41478(final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        final SubLObject var82 = (SubLObject)$ic433$;
        final SubLObject var83 = module0015.$g538$.currentBinding(var81);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var81))) ? module0015.$g538$.getDynamicValue(var81) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var81);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var81), module0655.$g5142$.getDynamicValue(var81));
            final SubLObject var84 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var84) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var84);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var82) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var82);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_322 = module0015.$g535$.currentBinding(var81);
            try {
                module0015.$g535$.bind((SubLObject)T, var81);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var81)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var81)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_323 = module0015.$g533$.currentBinding(var81);
                try {
                    module0015.$g533$.bind((SubLObject)T, var81);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_324 = module0015.$g533$.currentBinding(var81);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var81);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_324, var81);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var82) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var82);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var85 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var81));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var85) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var85);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_325 = module0015.$g533$.currentBinding(var81);
                    final SubLObject var86 = module0015.$g541$.currentBinding(var81);
                    final SubLObject var87 = module0015.$g539$.currentBinding(var81);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var81);
                        module0015.$g541$.bind((SubLObject)T, var81);
                        module0015.$g539$.bind(module0015.f797(), var81);
                        module0642.f39069((SubLObject)$ic434$, var80, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic435$);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019(var80);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic436$);
                        module0656.f39804($ic359$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic162$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        if (NIL == module0543.f33698()) {
                            module0642.f39019((SubLObject)$ic437$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0656.f39790((SubLObject)$ic137$, (SubLObject)$ic57$);
                            module0642.f39074((SubLObject)$ic438$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var81));
                    }
                    finally {
                        module0015.$g539$.rebind(var87, var81);
                        module0015.$g541$.rebind(var86, var81);
                        module0015.$g533$.rebind(var4_325, var81);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_323, var81);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_322, var81);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var83, var81);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41481(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic439$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = var2.first();
        if (NIL != var4) {
            final SubLObject var5 = module0111.$g1406$.currentBinding(var3);
            try {
                module0111.$g1406$.bind((SubLObject)NIL, var3);
                final SubLObject var6 = module0543.f33618(var4);
                module0543.f33628((SubLObject)ConsesLow.listS($ic440$, var6, (SubLObject)$ic441$), $ic390$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0226.f14810(var6)) {
                    f41455(var6);
                    f41476();
                }
            }
            finally {
                module0111.$g1406$.rebind(var5, var3);
            }
        }
        else {
            module0656.f39789((SubLObject)$ic442$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41482(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)$ic445$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_326 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_327 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_328 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_328, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39019((SubLObject)$ic446$);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39019((SubLObject)$ic328$);
                    module0656.f39837((SubLObject)$ic447$, (SubLObject)$ic330$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic448$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_327, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_326, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        module0642.f39011();
        module0723.f44302(module0723.f44261());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41483(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL == var118) {
            var118 = (SubLObject)$ic450$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)$ic53$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic451$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41484(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0642.f39104((SubLObject)$ic453$, var2);
        final SubLObject var5 = module0642.f39110((SubLObject)$ic454$, var2, module0597.f36628(module0574.f35152()));
        final SubLObject var6 = (SubLObject)$ic455$;
        final SubLObject var7 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var8 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var8) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var8);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var6) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var6);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            final SubLObject var9 = module0014.f657((SubLObject)$ic10$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g479$.getGlobalValue());
            module0642.f39020(module0015.$g482$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g483$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic11$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var4_330 = module0015.$g533$.currentBinding(var3);
            try {
                module0015.$g533$.bind((SubLObject)T, var3);
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var4_330, var3);
            }
            module0642.f39020(module0015.$g480$.getGlobalValue());
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_331 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_332 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_333 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_333, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var6) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var6);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    if (var4.isString()) {
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g351$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic370$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g358$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic456$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_334 = module0015.$g533$.currentBinding(var3);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var3);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_335 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_336 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    if (NIL != module0015.$g495$.getGlobalValue()) {
                                        module0642.f39020(module0015.$g222$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var4_337 = module0015.$g533$.currentBinding(var3);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var3);
                                        module0642.f39020(module0015.$g209$.getGlobalValue());
                                        module0642.f39019((SubLObject)$ic457$);
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
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_338 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39019((SubLObject)$ic458$);
                                    module0642.f39019(var5);
                                    module0642.f39019((SubLObject)$ic162$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_339 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic53$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_340 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic459$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                }
                                finally {
                                    module0015.$g533$.rebind(var4_340, var3);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var4_341 = module0015.$g533$.currentBinding(var3);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var3);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_334, var3);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                    }
                    module0642.f39019((SubLObject)$ic460$);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic461$);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    final SubLObject var10 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var10) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var10);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_342 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic462$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39156((SubLObject)$ic454$, (SubLObject)$ic334$, (SubLObject)$ic335$, (SubLObject)$ic463$, var5, (SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var3);
                        module0015.$g541$.rebind(var11, var3);
                        module0015.$g533$.rebind(var4_342, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_332, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_331, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var7, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41485(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL == var118) {
            var118 = (SubLObject)$ic465$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic466$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41486(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0038.f2735(module0642.f39110((SubLObject)$ic454$, var2, (SubLObject)$ic74$));
        final SubLObject var5 = module0642.f39110((SubLObject)$ic334$, var2, (SubLObject)$ic74$);
        if (NIL != module0038.f2608(var4) || NIL != module0038.f2608(var5)) {
            return f41484(f41487(var2, (SubLObject)$ic472$));
        }
        final SubLObject var6 = module0660.f40150(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0035.remove_if_not((SubLObject)$ic405$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var7) {
            return f41484(f41487(var2, (SubLObject)$ic473$));
        }
        if (NIL == module0035.f1997(var7)) {
            return f41484(f41487(var2, Sequences.cconcatenate((SubLObject)$ic474$, module0006.f203(var7))));
        }
        final SubLObject var8 = var7.first();
        var3.resetMultipleValues();
        final SubLObject var9 = module0574.f35160(var8, var5, $ic316$);
        final SubLObject var10 = var3.secondMultipleValue();
        var3.resetMultipleValues();
        if (NIL != var9) {
            return module0669.f40790((SubLObject)$ic475$);
        }
        return f41484(f41487(var2, var10));
    }
    
    public static SubLObject f41487(final SubLObject var2, final SubLObject var9) {
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic453$, var9), var2);
    }
    
    public static SubLObject f41488(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var2;
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (var8.isList()) {
                if ($ic479$.equal(var8.first())) {
                    var5 = (SubLObject)T;
                }
                if ($ic480$.equal(var8.first())) {
                    var4 = module0038.f2735(conses_high.second(var8));
                }
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        if (NIL != var4) {
            if (var4.equal((SubLObject)$ic74$)) {
                var6 = (SubLObject)$ic481$;
            }
            else if (NIL == Filesys.probe_file(var4)) {
                var6 = module0075.f5219(var4);
            }
        }
        if (NIL != var4 && NIL == var6) {
            if (NIL != var5) {
                var4 = Sequences.cconcatenate((SubLObject)$ic285$, var4);
            }
            f41489((SubLObject)ConsesLow.list(var4));
        }
        final SubLObject var9 = (SubLObject)$ic482$;
        final SubLObject var10 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var11 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var11) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var11);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var9) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var9);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_347 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_348 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_349 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_349, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var9) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var9);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var12 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var12) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var12);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_350 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var13 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var14 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic483$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic477$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0656.f39837((SubLObject)$ic484$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic485$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic486$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_351 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var15 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var16 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic487$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic488$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic489$);
                        module0642.f39067();
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        final SubLObject var17 = (NIL != var4) ? var4 : module0075.f5226(module0572.f35035());
                        module0642.f39139((SubLObject)$ic480$, var17, (SubLObject)$ic92$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        if (NIL != var6) {
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            final SubLObject var18 = (SubLObject)$ic18$;
                            module0642.f39020(module0015.$g219$.getGlobalValue());
                            if (NIL != var18) {
                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39042(var18));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var4_352 = module0015.$g533$.currentBinding(var3);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var3);
                                module0642.f39020(module0015.$g209$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic490$);
                                module0642.f39020(module0015.$g210$.getGlobalValue());
                                module0642.f39019(var6);
                            }
                            finally {
                                module0015.$g533$.rebind(var4_352, var3);
                            }
                            module0642.f39020(module0015.$g220$.getGlobalValue());
                        }
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39074((SubLObject)$ic491$, (SubLObject)$ic479$, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)FOUR_INTEGER);
                        module0642.f39074((SubLObject)$ic492$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var16, var3);
                        module0015.$g541$.rebind(var15, var3);
                        module0015.$g533$.rebind(var4_351, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_348, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_347, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var10, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41489(final SubLObject var2) {
        final SubLObject var3 = module0038.f2684(var2.first(), (SubLObject)$ic285$);
        final SubLObject var4 = var2.first();
        if (NIL != var3) {
            f41490(module0038.f2667(var4, (SubLObject)$ic285$));
        }
        else {
            f41491(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41491(final SubLObject var100) {
        f41447(var100);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41490(final SubLObject var355) {
        final SubLThread var356 = SubLProcess.currentSubLThread();
        final SubLObject var357 = module0572.f35063(var355);
        final SubLObject var358 = (SubLObject)$ic495$;
        final SubLObject var359 = module0015.$g538$.currentBinding(var356);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var356))) ? module0015.$g538$.getDynamicValue(var356) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var356);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var356), module0655.$g5142$.getDynamicValue(var356));
            final SubLObject var360 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var360) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var360);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var358) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var358);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_356 = module0015.$g535$.currentBinding(var356);
            try {
                module0015.$g535$.bind((SubLObject)T, var356);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var356)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var356)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_357 = module0015.$g533$.currentBinding(var356);
                try {
                    module0015.$g533$.bind((SubLObject)T, var356);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_358 = module0015.$g533$.currentBinding(var356);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var356);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_358, var356);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var358) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var358);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var356));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_359 = module0015.$g533$.currentBinding(var356);
                    final SubLObject var361 = module0015.$g541$.currentBinding(var356);
                    final SubLObject var362 = module0015.$g539$.currentBinding(var356);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var356);
                        module0015.$g541$.bind((SubLObject)T, var356);
                        module0015.$g539$.bind(module0015.f797(), var356);
                        module0656.f39790((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic496$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        final SubLObject var363 = module0656.f39832((SubLObject)$ic39$);
                        module0642.f39020(module0015.$g381$.getGlobalValue());
                        module0642.f39020(module0015.$g383$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0655.f39768();
                        module0642.f39019(Sequences.cconcatenate((SubLObject)$ic284$, var355));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var363) {
                            module0642.f39020(module0015.$g387$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var363);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var4_360 = module0015.$g533$.currentBinding(var356);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var356);
                            module0642.f39019(var355);
                        }
                        finally {
                            module0015.$g533$.rebind(var4_360, var356);
                        }
                        module0642.f39020(module0015.$g382$.getGlobalValue());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic295$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(var357.first());
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic497$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(conses_high.list_length(conses_high.second(var357)));
                        module0642.f39026((SubLObject)UNPROVIDED);
                        SubLObject var364 = conses_high.second(var357);
                        SubLObject var365 = (SubLObject)NIL;
                        var365 = var364.first();
                        while (NIL != var364) {
                            final SubLObject var366 = constants_high_oc.f10737(conses_high.third(var365));
                            if (NIL != var366) {
                                module0656.f39804(var366, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else {
                                module0642.f39019(conses_high.third(var365));
                            }
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39028((SubLObject)UNPROVIDED);
                            var364 = var364.rest();
                            var365 = var364.first();
                        }
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic498$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(conses_high.list_length(conses_high.third(var357)));
                        module0642.f39026((SubLObject)UNPROVIDED);
                        var364 = conses_high.third(var357);
                        SubLObject var367 = (SubLObject)NIL;
                        var367 = var364.first();
                        while (NIL != var364) {
                            module0642.f39019(conses_high.third(var367));
                            module0642.f39019((SubLObject)$ic499$);
                            final SubLObject var366 = constants_high_oc.f10737(conses_high.fourth(var367));
                            if (NIL != var366) {
                                module0656.f39804(var366, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else {
                                module0642.f39019(conses_high.fourth(var367));
                            }
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39028((SubLObject)UNPROVIDED);
                            var364 = var364.rest();
                            var367 = var364.first();
                        }
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic500$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39019(conses_high.list_length(conses_high.fourth(var357)));
                        module0642.f39026((SubLObject)UNPROVIDED);
                        var364 = conses_high.fourth(var357);
                        SubLObject var368 = (SubLObject)NIL;
                        var368 = var364.first();
                        while (NIL != var364) {
                            module0642.f39019(conses_high.third(var368));
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39028((SubLObject)UNPROVIDED);
                            var364 = var364.rest();
                            var368 = var364.first();
                        }
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0015.f799(module0015.$g539$.getDynamicValue(var356));
                    }
                    finally {
                        module0015.$g539$.rebind(var362, var356);
                        module0015.$g541$.rebind(var361, var356);
                        module0015.$g533$.rebind(var4_359, var356);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_357, var356);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_356, var356);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var359, var356);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41492() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0572.f35044();
        if (NIL == var2) {
            module0642.f39019((SubLObject)$ic501$);
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic502$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)TWO_INTEGER);
            SubLObject var3 = Sequences.reverse(module0572.f35044());
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                SubLObject var5 = module0656.f39832((SubLObject)$ic39$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0655.f39768();
                module0642.f39019(Sequences.cconcatenate((SubLObject)$ic503$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var5) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                SubLObject var6 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019((SubLObject)$ic491$);
                }
                finally {
                    module0015.$g533$.rebind(var6, var1);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39032((SubLObject)FIVE_INTEGER);
                var5 = module0656.f39832((SubLObject)$ic39$);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g383$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0655.f39768();
                module0642.f39019(Sequences.cconcatenate((SubLObject)$ic284$, var4));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var5) {
                    module0642.f39020(module0015.$g387$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var5);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                var6 = module0015.$g533$.currentBinding(var1);
                try {
                    module0015.$g533$.bind((SubLObject)T, var1);
                    module0642.f39019(var4);
                }
                finally {
                    module0015.$g533$.rebind(var6, var1);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41493(SubLObject var118) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL == var118) {
            var118 = (SubLObject)$ic505$;
        }
        final SubLObject var120 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic487$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var120) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var120);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var121 = module0015.$g533$.currentBinding(var119);
        try {
            module0015.$g533$.bind((SubLObject)T, var119);
            module0642.f39019(var118);
        }
        finally {
            module0015.$g533$.rebind(var121, var119);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41494(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)$ic513$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_365 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_366 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_367 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_367, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_368 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic514$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic511$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        final SubLObject var10 = module0575.f35243();
                        if (var10.numE((SubLObject)ZERO_INTEGER)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic515$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic38$);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic516$);
                            if (var10.numG((SubLObject)ONE_INTEGER)) {
                                module0642.f39019((SubLObject)$ic517$);
                            }
                            module0642.f39019((SubLObject)$ic518$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic519$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39032((SubLObject)THREE_INTEGER);
                            module0642.f39074((SubLObject)$ic520$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic521$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            SubLObject var12;
                            final SubLObject var11 = var12 = module0575.f35249();
                            SubLObject var13 = (SubLObject)NIL;
                            var13 = var12.first();
                            while (NIL != var12) {
                                var13 = f41425(var13);
                                module0656.f39804(var13, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                                module0642.f39026((SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_366, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_365, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41495(SubLObject var146) {
        if (var146 == UNPROVIDED) {
            var146 = (SubLObject)NIL;
        }
        final SubLThread var147 = SubLProcess.currentSubLThread();
        if (NIL == var146) {
            var146 = (SubLObject)$ic523$;
        }
        final SubLObject var148 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic524$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41496(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)$ic520$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_372 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_373 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_374 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_374, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_375 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic528$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic526$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        final SubLObject var10 = module0575.f35243();
                        if (var10.numE((SubLObject)ZERO_INTEGER)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic515$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic529$);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic530$);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic531$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic532$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0656.f39790((SubLObject)$ic137$, (SubLObject)$ic57$);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39074((SubLObject)$ic533$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_375, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_373, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_372, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41497(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = (SubLObject)$ic520$;
        final SubLObject var5 = module0015.$g538$.currentBinding(var3);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var3))) ? module0015.$g538$.getDynamicValue(var3) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var3);
            module0642.f39020((SubLObject)$ic6$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var3), module0655.$g5142$.getDynamicValue(var3));
            final SubLObject var6 = module0014.f672((SubLObject)$ic7$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic8$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var6) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var6);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic9$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var4) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var4);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var4_376 = module0015.$g535$.currentBinding(var3);
            try {
                module0015.$g535$.bind((SubLObject)T, var3);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var3)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var3)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic12$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var4_377 = module0015.$g533$.currentBinding(var3);
                try {
                    module0015.$g533$.bind((SubLObject)T, var3);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic13$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_378 = module0015.$g533$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic14$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic15$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic16$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var4_378, var3);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var4) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var4);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var7 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var3));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic19$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var7) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var7);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var4_379 = module0015.$g533$.currentBinding(var3);
                    final SubLObject var8 = module0015.$g541$.currentBinding(var3);
                    final SubLObject var9 = module0015.$g539$.currentBinding(var3);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var3);
                        module0015.$g541$.bind((SubLObject)T, var3);
                        module0015.$g539$.bind(module0015.f797(), var3);
                        module0642.f39069((SubLObject)$ic537$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39870((SubLObject)$ic535$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        final SubLObject var10 = module0575.f35243();
                        if (var10.numE((SubLObject)ZERO_INTEGER)) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic538$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            while (NIL == module0593.f36267()) {
                                module0593.f36268((SubLObject)TWO_INTEGER);
                            }
                            module0656.f39793((SubLObject)$ic539$, (SubLObject)T);
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic529$);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic530$);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic540$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g224$.getGlobalValue());
                            module0642.f39019(var10);
                            module0642.f39020(module0015.$g225$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic532$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0656.f39790((SubLObject)$ic137$, (SubLObject)$ic57$);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39074((SubLObject)$ic541$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var3));
                    }
                    finally {
                        module0015.$g539$.rebind(var9, var3);
                        module0015.$g541$.rebind(var8, var3);
                        module0015.$g533$.rebind(var4_379, var3);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var4_377, var3);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var4_376, var3);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var5, var3);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41498(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic543$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41499(final SubLObject var146) {
        final SubLThread var147 = SubLProcess.currentSubLThread();
        final SubLObject var148 = module0656.f39832((SubLObject)$ic39$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic514$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var148) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var148);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var149 = module0015.$g533$.currentBinding(var147);
        try {
            module0015.$g533$.bind((SubLObject)T, var147);
            module0642.f39019(var146);
        }
        finally {
            module0015.$g533$.rebind(var149, var147);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41500(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        module0575.f35245();
        while (NIL == module0593.f36267()) {
            module0593.f36268((SubLObject)TWO_INTEGER);
        }
        module0656.f39793((SubLObject)$ic539$, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41501(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        module0575.f35245();
        module0656.f39793((SubLObject)$ic547$, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41410() {
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41503() {
        $g5332$ = SubLFiles.defparameter("S#45480", (SubLObject)$ic1$);
        $g5333$ = SubLFiles.deflexical("S#45481", (NIL != Symbols.boundp((SubLObject)$ic64$)) ? $g5333$.getGlobalValue() : $ic65$);
        $g5334$ = SubLFiles.deflexical("S#45482", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic66$)) ? $g5334$.getGlobalValue() : NIL));
        $g5335$ = SubLFiles.deflexical("S#45483", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic73$)) ? $g5335$.getGlobalValue() : $ic74$));
        $g5336$ = SubLFiles.deflexical("S#45484", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic75$)) ? $g5336$.getGlobalValue() : $ic74$));
        $g5337$ = SubLFiles.defparameter("S#45485", (SubLObject)$ic151$);
        $g5201$ = SubLFiles.defparameter("S#45486", (SubLObject)NIL);
        $g5338$ = SubLFiles.deflexical("S#45487", (SubLObject)NIL);
        $g5339$ = SubLFiles.deflexical("S#45488", (SubLObject)$ic422$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41504() {
        Hashtables.sethash((SubLObject)$ic2$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic3$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic25$);
        module0003.f57((SubLObject)$ic64$);
        module0003.f57((SubLObject)$ic66$);
        module0015.f873((SubLObject)$ic68$);
        module0656.f39840((SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)ZERO_INTEGER);
        module0003.f57((SubLObject)$ic73$);
        module0003.f57((SubLObject)$ic75$);
        Hashtables.sethash((SubLObject)$ic76$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic77$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic122$);
        module0656.f39840((SubLObject)$ic139$, (SubLObject)$ic140$, (SubLObject)ONE_INTEGER);
        Hashtables.sethash((SubLObject)$ic141$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic142$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic149$);
        module0015.f873((SubLObject)$ic150$);
        Hashtables.sethash((SubLObject)$ic153$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic154$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic169$);
        module0656.f39840((SubLObject)$ic172$, (SubLObject)$ic173$, (SubLObject)ZERO_INTEGER);
        module0015.f873((SubLObject)$ic175$);
        module0015.f873((SubLObject)$ic190$);
        module0015.f873((SubLObject)$ic215$);
        module0656.f39840((SubLObject)$ic200$, (SubLObject)$ic225$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic227$);
        module0656.f39840((SubLObject)$ic229$, (SubLObject)$ic230$, (SubLObject)ONE_INTEGER);
        module0656.f39840((SubLObject)$ic232$, (SubLObject)$ic233$, (SubLObject)ZERO_INTEGER);
        Hashtables.sethash((SubLObject)$ic234$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic235$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic239$);
        module0656.f39840((SubLObject)$ic264$, (SubLObject)$ic278$, (SubLObject)ZERO_INTEGER);
        module0656.f39840((SubLObject)$ic269$, (SubLObject)$ic280$, (SubLObject)ZERO_INTEGER);
        module0656.f39840((SubLObject)$ic282$, (SubLObject)$ic283$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic288$);
        Hashtables.sethash((SubLObject)$ic291$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic292$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic298$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic299$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic306$);
        module0015.f873((SubLObject)$ic311$);
        module0656.f39840((SubLObject)$ic314$, (SubLObject)$ic315$, (SubLObject)ONE_INTEGER);
        Hashtables.sethash((SubLObject)$ic321$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic322$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic350$);
        module0015.f873((SubLObject)$ic354$);
        module0656.f39840((SubLObject)$ic344$, (SubLObject)$ic357$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic349$, (SubLObject)$ic364$, (SubLObject)ZERO_INTEGER);
        module0015.f873((SubLObject)$ic379$);
        module0034.f1909((SubLObject)$ic383$);
        module0015.f873((SubLObject)$ic400$);
        module0656.f39840((SubLObject)$ic403$, (SubLObject)$ic404$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic407$);
        module0015.f873((SubLObject)$ic443$);
        Hashtables.sethash((SubLObject)$ic10$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic444$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic449$);
        module0656.f39840((SubLObject)$ic329$, (SubLObject)$ic452$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic464$);
        module0656.f39840((SubLObject)$ic467$, (SubLObject)$ic468$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic467$, (SubLObject)$ic469$, (SubLObject)$ic470$, (SubLObject)$ic471$);
        module0015.f873((SubLObject)$ic476$);
        Hashtables.sethash((SubLObject)$ic477$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic478$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic493$);
        module0015.f873((SubLObject)$ic494$);
        module0656.f39840((SubLObject)$ic484$, (SubLObject)$ic504$, (SubLObject)ZERO_INTEGER);
        module0656.f39840((SubLObject)$ic506$, (SubLObject)$ic507$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic506$, (SubLObject)$ic508$, (SubLObject)$ic509$, (SubLObject)$ic510$);
        Hashtables.sethash((SubLObject)$ic511$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic512$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic522$);
        module0656.f39840((SubLObject)$ic217$, (SubLObject)$ic525$, (SubLObject)ONE_INTEGER);
        Hashtables.sethash((SubLObject)$ic526$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic527$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic534$);
        Hashtables.sethash((SubLObject)$ic535$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic536$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic542$);
        module0656.f39840((SubLObject)$ic221$, (SubLObject)$ic544$, (SubLObject)ONE_INTEGER);
        module0656.f39840((SubLObject)$ic219$, (SubLObject)$ic545$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic546$);
        module0015.f873((SubLObject)$ic548$);
        return (SubLObject)NIL;
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
        $g5332$ = null;
        $g5333$ = null;
        $g5334$ = null;
        $g5335$ = null;
        $g5336$ = null;
        $g5337$ = null;
        $g5201$ = null;
        $g5338$ = null;
        $g5339$ = null;
        $ic0$ = makeString("~Aref/system.html");
        $ic1$ = makeString("com-modes");
        $ic2$ = makeKeyword("CB-MODE");
        $ic3$ = makeString("cb-mode.html");
        $ic4$ = makeString("Cyc communication status changing facilities");
        $ic5$ = makeString("Communication Status Area");
        $ic6$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic7$ = makeKeyword("CB-CYC");
        $ic8$ = makeString("stylesheet");
        $ic9$ = makeString("text/css");
        $ic10$ = makeKeyword("SHA1");
        $ic11$ = makeString("text/javascript");
        $ic12$ = makeString("yui-skin-sam");
        $ic13$ = makeString("reloadFrameButton");
        $ic14$ = makeString("button");
        $ic15$ = makeString("reload");
        $ic16$ = makeString("Refresh Frames");
        $ic17$ = makeString("message");
        $ic18$ = makeKeyword("RED");
        $ic19$ = makeString("post");
        $ic20$ = makeString("cb-mode-handler");
        $ic21$ = makeString("Current Value");
        $ic22$ = makeString("Submit");
        $ic23$ = makeString("You can not change your transmitting status until you empty ");
        $ic24$ = makeString("your local transcript by either sending or clearing it");
        $ic25$ = makeSymbol("CB-MODE");
        $ic26$ = makeString("What Do You Want To Do With Processed Operations?");
        $ic27$ = makeString("transmit-mode");
        $ic28$ = makeString("transmit");
        $ic29$ = makeString("Send Immediately To Everybody");
        $ic30$ = makeString("store");
        $ic31$ = makeString("Store For Later");
        $ic32$ = makeString("none");
        $ic33$ = makeString("Do Not Record");
        $ic34$ = makeString("Send KB Check Point for: ");
        $ic35$ = makeString("kb_checkpoint_to_send");
        $ic36$ = makeString("Currently, you are not allowed to send operations, most likely because you are not in the current KB.");
        $ic37$ = makeString("Try receiving operations if you wish to send.");
        $ic38$ = makeString("You have ");
        $ic39$ = makeKeyword("MAIN");
        $ic40$ = makeString("cb-system-ready-transcript-file&write");
        $ic41$ = makeString(" operations");
        $ic42$ = makeString(" stored.");
        $ic43$ = makeString("send");
        $ic44$ = makeString("Send Stored Operations Now");
        $ic45$ = makeString("clear");
        $ic46$ = makeString("Clear Stored Operations");
        $ic47$ = makeString("Note:");
        $ic48$ = makeString(" All of the above options will start a new local transcript");
        $ic49$ = makeString("You still have ");
        $ic50$ = makeString(" unprocessed operations on your local queue.  You can not change your transmitting status until the queue has been processed.");
        $ic51$ = makeString("Do You Want To Receive Operations From Others?");
        $ic52$ = makeKeyword("RIGHT");
        $ic53$ = makeKeyword("TOP");
        $ic54$ = makeString("receive-mode");
        $ic55$ = makeString("no");
        $ic56$ = makeKeyword("LEFT");
        $ic57$ = makeString("No");
        $ic58$ = makeString("yes");
        $ic59$ = makeString("Yes");
        $ic60$ = makeString("kb_checkpoint?");
        $ic61$ = makeString("Receive only up to KB Check Point :");
        $ic62$ = makeString("kb_checkpoint");
        $ic63$ = makeKeyword("USE-CURRENT-CHECK-POINT");
        $ic64$ = makeSymbol("S#45481", "CYC");
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("Cyc-BasedProject"));
        $ic66$ = makeSymbol("S#45482", "CYC");
        $ic67$ = makeString("filters?");
        $ic68$ = makeSymbol("CB-MODE-HANDLER");
        $ic69$ = makeString("cb-mode");
        $ic70$ = makeString("Comm:");
        $ic71$ = makeKeyword("MODE");
        $ic72$ = makeSymbol("S#45419", "CYC");
        $ic73$ = makeSymbol("S#45483", "CYC");
        $ic74$ = makeString("");
        $ic75$ = makeSymbol("S#45484", "CYC");
        $ic76$ = makeKeyword("DISPLAY-OE-PATCH-MESSAGE");
        $ic77$ = makeString("display-oe-patch-message.html");
        $ic78$ = makeString("notes");
        $ic79$ = makeString("builder");
        $ic80$ = makeString("SENT");
        $ic81$ = makeString("OE Patch Message");
        $ic82$ = makeString("cb-handle-oe-patch-message");
        $ic83$ = makeString("window.open('");
        $ic84$ = makeString("',");
        $ic85$ = makeString("'~A'");
        $ic86$ = makeString("null");
        $ic87$ = makeString(",'~A'); ");
        $ic88$ = makeString("return false;");
        $ic89$ = makeString("Enter a short description to go in the subject of the email message, and a longer description in the \"Patch Message\" if warranted.  To not send a message at all, remove all email addresses from the \"To\" line.   ");
        $ic90$ = makeString("To: ");
        $ic91$ = makeString("to");
        $ic92$ = makeInteger(80);
        $ic93$ = makeString("Short Description: ");
        $ic94$ = makeString("subj");
        $ic95$ = makeString("Patch Message: ");
        $ic96$ = makeInteger(100);
        $ic97$ = makeString("virtual");
        $ic98$ = makeString("send-message?");
        $ic99$ = makeString("Transmit and Send Patch Message");
        $ic100$ = makeString(" ");
        $ic101$ = makeString("Transmit without Patch Message");
        $ic102$ = makeString("OE Patch (kb=");
        $ic103$ = makeString("): ");
        $ic104$ = makeInteger(1000);
        $ic105$ = ConsesLow.list((SubLObject)makeSymbol("S#45489", "CYC"), (SubLObject)makeSymbol("S#38468", "CYC"), (SubLObject)makeSymbol("S#38469", "CYC"), (SubLObject)makeSymbol("S#38470", "CYC"));
        $ic106$ = makeString("~A");
        $ic107$ = makeString("Submitted");
        $ic108$ = makeString("Transmitted");
        $ic109$ = makeString(" from KB: ~A~%~%");
        $ic110$ = makeString("Patch Description:~%~%");
        $ic111$ = makeString("~S~%");
        $ic112$ = makeString("~%Transcript: ~A~%");
        $ic113$ = makeString("Total Operations: ~A~%");
        $ic114$ = makeString("~%Killed Constants: ~%");
        $ic115$ = ConsesLow.list((SubLObject)makeSymbol("S#38471", "CYC"), (SubLObject)makeSymbol("S#10596", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#13925", "CYC"), (SubLObject)makeSymbol("WHEN"));
        $ic116$ = makeString("~A~%");
        $ic117$ = makeString("[and ~A more]~%");
        $ic118$ = makeString("~%Renames: ~%");
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#38471", "CYC"), (SubLObject)makeSymbol("S#10596", "CYC"), (SubLObject)makeSymbol("S#38472", "CYC"), (SubLObject)makeSymbol("S#13498", "CYC"), (SubLObject)makeSymbol("S#13925", "CYC"), (SubLObject)makeSymbol("WHEN"));
        $ic120$ = makeString("~A -> ~A~%");
        $ic121$ = makeString("~%New Constants: ~%");
        $ic122$ = makeSymbol("CB-HANDLE-OE-PATCH-MESSAGE");
        $ic123$ = makeString("Mail not sent due to invalid from (");
        $ic124$ = makeString(") or to (");
        $ic125$ = makeString(") address");
        $ic126$ = makeString("sent");
        $ic127$ = makeString("submitted");
        $ic128$ = makeString("Transcript ");
        $ic129$ = makeString(", but no mail sent.");
        $ic130$ = makeString(", but mail message encountered error: ");
        $ic131$ = makeInteger(5000);
        $ic132$ = makeString("~%---------------------~%");
        $ic133$ = makeString("Transcript as KE Text ~%");
        $ic134$ = makeString(";;[and ~A more operations]~%");
        $ic135$ = makeString("[Roll to KB ");
        $ic136$ = makeString("]");
        $ic137$ = makeKeyword("SELF");
        $ic138$ = makeString("cb-roll-current-kb");
        $ic139$ = makeKeyword("ROLL-CURRENT-KB");
        $ic140$ = makeSymbol("S#45425", "CYC");
        $ic141$ = makeKeyword("CB-REMOTE-FILTERS");
        $ic142$ = makeString("cb-remote-filters.html");
        $ic143$ = makeString("Rolling the KB");
        $ic144$ = makeString("Roll to KB ");
        $ic145$ = makeString("cb-handle-roll-current-kb");
        $ic146$ = makeString("WARNING:");
        $ic147$ = makeString("Rolling the KB is will filter every operation until the start of the next KB.");
        $ic148$ = makeString("Do you still want to roll to KB ~S ?");
        $ic149$ = makeSymbol("CB-ROLL-CURRENT-KB");
        $ic150$ = makeSymbol("CB-HANDLE-ROLL-CURRENT-KB");
        $ic151$ = makeString("cyc-agenda");
        $ic152$ = makeString("Agenda halted due to:");
        $ic153$ = makeKeyword("CB-AGENDA");
        $ic154$ = makeString("cb-agenda.html");
        $ic155$ = makeString("The Cyc Agenda Control Facilities");
        $ic156$ = makeString("Agenda Process Control");
        $ic157$ = makeString("cb-abort-agenda");
        $ic158$ = makeString("Here you control the turning on and off of your Cyc Agenda.");
        $ic159$ = makeString("Currently, your Agenda is ");
        $ic160$ = makeString("running");
        $ic161$ = makeString("halted");
        $ic162$ = makeString(".");
        $ic163$ = makeKeyword("HALT");
        $ic164$ = makeString("Run");
        $ic165$ = makeString("Current");
        $ic166$ = makeString("Last");
        $ic167$ = makeString(" Agenda operation:");
        $ic168$ = makeString("Abort Operation");
        $ic169$ = makeSymbol("CB-AGENDA");
        $ic170$ = makeString("cb-agenda");
        $ic171$ = makeString("Agenda:");
        $ic172$ = makeKeyword("AGENDA");
        $ic173$ = makeSymbol("S#45427", "CYC");
        $ic174$ = makeString("The agenda is no longer running.");
        $ic175$ = makeSymbol("CB-ABORT-AGENDA");
        $ic176$ = makeString("cb-toggle-agenda-status");
        $ic177$ = makeString("Click the button to change your Agenda status:");
        $ic178$ = makeString("Halt Agenda");
        $ic179$ = makeString("Start Agenda");
        $ic180$ = makeString("--For detailed help on the Cyc agenda, read the ");
        $ic181$ = makeString("~A#~A");
        $ic182$ = makeString("Cyc Agenda Documentation");
        $ic183$ = makeString("Agenda Process Changed");
        $ic184$ = makeString("Halting the Agenda ...");
        $ic185$ = makeString("Starting the Agenda ...");
        $ic186$ = makeString("Your Cyc Agenda is now ");
        $ic187$ = makeString("Your Cyc Agenda is still ");
        $ic188$ = makeString("When it finishes its current operation, its state will change as you requested.");
        $ic189$ = makeString("Agenda");
        $ic190$ = makeSymbol("CB-TOGGLE-AGENDA-STATUS");
        $ic191$ = makeString("cb-agenda-error-mode-handler");
        $ic192$ = makeString("Currently, when Cyc encounters an error with local operations within the Agenda it:");
        $ic193$ = makeKeyword("IGNORE");
        $ic194$ = makeString("Continues, ignoring the error.");
        $ic195$ = makeString("Halts the Agenda and displays the reasons.");
        $ic196$ = makeKeyword("DEBUG");
        $ic197$ = makeString("Enters the debugger.");
        $ic198$ = makeKeyword("LOG");
        $ic199$ = makeString("Logs the error and continues.");
        $ic200$ = makeKeyword("AGENDA-ERROR-FILE");
        $ic201$ = makeString("Illegal state in cb-agenda-error-mode-display.");
        $ic202$ = makeString("Choose the new error handling mode below and select [");
        $ic203$ = makeString("Submit New Mode");
        $ic204$ = makeString("] to initiate the change:");
        $ic205$ = makeString("agenda-error-state");
        $ic206$ = makeString(":ignore");
        $ic207$ = makeString("Ignore and Continue");
        $ic208$ = makeString(":halt");
        $ic209$ = makeString("Halt and Display Reason");
        $ic210$ = makeString(":log");
        $ic211$ = makeString("Log Errors to File");
        $ic212$ = makeString("pathname");
        $ic213$ = makeInteger(60);
        $ic214$ = makeString("Current Mode");
        $ic215$ = makeSymbol("CB-AGENDA-ERROR-MODE-HANDLER");
        $ic216$ = makeString(" operations waiting in your local queue.");
        $ic217$ = makeKeyword("SHOW-LOCAL-OPS");
        $ic218$ = makeString("Look at the operations in the local queue.");
        $ic219$ = makeKeyword("DELETE-LOCAL-OPS");
        $ic220$ = makeString("Delete the local queue.");
        $ic221$ = makeKeyword("DELETE-LOCAL-AND-RESTART");
        $ic222$ = makeString("Delete the local queue and restart agenda.");
        $ic223$ = makeString("cb-agenda-error-file-viewer");
        $ic224$ = makeString("Agenda Error File: ~A");
        $ic225$ = makeSymbol("S#45431", "CYC");
        $ic226$ = makeString("Agenda log file empty: ~S");
        $ic227$ = makeSymbol("CB-AGENDA-ERROR-FILE-VIEWER");
        $ic228$ = makeString("cb-system");
        $ic229$ = makeKeyword("SYSTEM1");
        $ic230$ = makeSymbol("S#45432", "CYC");
        $ic231$ = makeString("System:");
        $ic232$ = makeKeyword("SYSTEM");
        $ic233$ = makeSymbol("S#45433", "CYC");
        $ic234$ = makeKeyword("CB-SYSTEM");
        $ic235$ = makeString("cb-system.html");
        $ic236$ = makeString("Cyc System Area");
        $ic237$ = makeString("System Area");
        $ic238$ = makeString("Here are your system settings:");
        $ic239$ = makeSymbol("CB-SYSTEM");
        $ic240$ = makeString("Machine name: ");
        $ic241$ = makeString("unknown");
        $ic242$ = makeString("SubL implementation: ");
        $ic243$ = makeString("Base TCP port: ");
        $ic244$ = makeString("Image name: ");
        $ic245$ = makeString("Image Process ID: ");
        $ic246$ = makeString("Image start time:");
        $ic247$ = makeString(" (up ~A)");
        $ic248$ = makeString("CycL revision level: ");
        $ic249$ = makeString("Current KB: ");
        $ic250$ = makeString("Queue Information: ");
        $ic251$ = makeString("Master Transcript Operations Read:  ");
        $ic252$ = makeString("Master Transcript Operations Read but Unprocessed:  ");
        $ic253$ = makeString("Master Transcript Operations Processed:  ");
        $ic254$ = makeString("Master Transcript Operations Processed but Filtered:  ");
        $ic255$ = makeString("Master Transcript Operations Processed and Evaluated:  ");
        $ic256$ = makeString("Unprocessed Local Queue Operations:  ");
        $ic257$ = makeString("Local Queue Operations Processed But Unrecorded:  ");
        $ic258$ = makeString("Current Local Transcript Operations Processed And Recorded:  ");
        $ic259$ = makeString("Unprocessed auxiliary queue operations:  ");
        $ic260$ = makeString("Transcript Information:");
        $ic261$ = makeString("Master Transcript:  ");
        $ic262$ = makeString("Maintained By Transcript Server");
        $ic263$ = makeString("Operations:  ");
        $ic264$ = makeKeyword("READ-TRANS");
        $ic265$ = makeString("None");
        $ic266$ = makeString("Characters:  ");
        $ic267$ = makeString("Estimated Ops:  ");
        $ic268$ = makeString("Local Transcript:  ");
        $ic269$ = makeKeyword("WRITE-TRANS");
        $ic270$ = makeString("Historical Information:");
        $ic271$ = makeString("Remote Operations Processed: ");
        $ic272$ = makeString("Local Operations Recorded:  ");
        $ic273$ = makeString("Local Operations Sent To Master Transcript:  ");
        $ic274$ = makeString("Auxiliary Queue Operations Processed:  ");
        $ic275$ = makeString("read");
        $ic276$ = makeSymbol("STRING-EQUAL");
        $ic277$ = makeString("cb-system-ready-transcript-file&read");
        $ic278$ = makeSymbol("S#45438", "CYC");
        $ic279$ = makeString("write");
        $ic280$ = makeSymbol("S#45439", "CYC");
        $ic281$ = makeString("cb-system-ready-transcript-file&~A");
        $ic282$ = makeKeyword("VIEW-TRANSCRIPT");
        $ic283$ = makeSymbol("S#45440", "CYC");
        $ic284$ = makeString("cb-transcript-viewer-handler&");
        $ic285$ = makeString("stats:");
        $ic286$ = makeString("[Stats]");
        $ic287$ = makeSymbol("STRING=");
        $ic288$ = makeSymbol("CB-SYSTEM-READY-TRANSCRIPT-FILE");
        $ic289$ = makeKeyword("INPUT");
        $ic290$ = makeString("Unable to open ~S");
        $ic291$ = makeKeyword("CB-SYSTEM-SHOW-SPECIFIC-TRANSCRIPT-FILE");
        $ic292$ = makeString("cb-system-show-specific-transcript-file.html");
        $ic293$ = makeString("File Contents: Transcript File");
        $ic294$ = makeString("File: ");
        $ic295$ = makeString("Operations: ");
        $ic296$ = makeString("No operations have been saved yet in");
        $ic297$ = makeString("~s is not a pathname string.");
        $ic298$ = makeKeyword("CB-CHOOSE-PROJECT");
        $ic299$ = makeString("cb-choose-project.html");
        $ic300$ = makeString("Choose KE Project");
        $ic301$ = makeString("cb-choose-project-handler");
        $ic302$ = makeString("Choose your project from the options below.");
        $ic303$ = makeString("project");
        $ic304$ = makeString("No Project Selected");
        $ic305$ = makeString("Reset");
        $ic306$ = makeSymbol("CB-CHOOSE-PROJECT");
        $ic307$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic308$ = constant_handles_oc.f8479((SubLObject)makeString("OngoingStatus"));
        $ic309$ = makeString("nil");
        $ic310$ = makeString("Project has been changed.");
        $ic311$ = makeSymbol("CB-CHOOSE-PROJECT-HANDLER");
        $ic312$ = makeString("Current Project");
        $ic313$ = makeString("cb-choose-project");
        $ic314$ = makeKeyword("CHOOSE-PROJECT");
        $ic315$ = makeSymbol("S#45446", "CYC");
        $ic316$ = constant_handles_oc.f8479((SubLObject)makeString("CycBrowser"));
        $ic317$ = makeSymbol("?PROJECT");
        $ic318$ = constant_handles_oc.f8479((SubLObject)makeString("cyclistPrimaryProject"));
        $ic319$ = ConsesLow.list((SubLObject)makeSymbol("?PROJECT"));
        $ic320$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic321$ = makeKeyword("CB-LOGIN");
        $ic322$ = makeString("cb-login.html");
        $ic323$ = makeString("new_login_name");
        $ic324$ = makeString("Login Area");
        $ic325$ = makeString("cb-login-handler");
        $ic326$ = makeString("This image has been designated: ");
        $ic327$ = makeString("You are currently logged in as ");
        $ic328$ = makeString("Click ");
        $ic329$ = makeKeyword("LOGOUT");
        $ic330$ = makeString("here");
        $ic331$ = makeString(" to logout now.");
        $ic332$ = makeString("Type in your new login name below and press the [");
        $ic333$ = makeString("] button:");
        $ic334$ = makeString("new_login_hashed_password");
        $ic335$ = makeString("Cyclist");
        $ic336$ = makeString("Password");
        $ic337$ = makeString(" : ");
        $ic338$ = makeString("The following are currently logged in to ");
        $ic339$ = makeString(":");
        $ic340$ = makeString("User");
        $ic341$ = makeString("Local Machine");
        $ic342$ = ConsesLow.list((SubLObject)makeSymbol("S#9603", "CYC"), (SubLObject)makeSymbol("S#45490", "CYC"));
        $ic343$ = makeString("(Session id: ");
        $ic344$ = makeKeyword("FORCE-LOGOUT");
        $ic345$ = makeString("[Force Logout]");
        $ic346$ = makeString(")");
        $ic347$ = makeKeyword("LARR");
        $ic348$ = makeString(" you");
        $ic349$ = makeKeyword("NOTIFY-ALL-USERS");
        $ic350$ = makeSymbol("CB-LOGIN");
        $ic351$ = makeString("sessionId");
        $ic352$ = makeKeyword("SUCCESS");
        $ic353$ = makeKeyword("FAILURE");
        $ic354$ = makeSymbol("CB-FORCE-LOGOUT");
        $ic355$ = makeString("~a&sessionId=~a");
        $ic356$ = makeString("cb-force-logout");
        $ic357$ = makeSymbol("S#45451", "CYC");
        $ic358$ = makeString("Complete");
        $ic359$ = constant_handles_oc.f8479((SubLObject)makeString("HumanCyclist"));
        $ic360$ = makeInteger(27);
        $ic361$ = makeString("Clear");
        $ic362$ = makeString("cb-notify-all-users");
        $ic363$ = makeString("Send Email to all Users");
        $ic364$ = makeSymbol("S#45453", "CYC");
        $ic365$ = makeString("Mail all users");
        $ic366$ = makeString("Please enter the message you wish to send to the following users.");
        $ic367$ = makeString("cb-send-email-to-selected-users");
        $ic368$ = ConsesLow.list((SubLObject)makeSymbol("S#9603", "CYC"), (SubLObject)makeSymbol("S#9126", "CYC"));
        $ic369$ = constant_handles_oc.f8479((SubLObject)makeString("Guest"));
        $ic370$ = makeKeyword("CENTER");
        $ic371$ = makeString("To:");
        $ic372$ = makeSymbol("SECOND");
        $ic373$ = makeString("From: ");
        $ic374$ = makeString("Subject: ");
        $ic375$ = makeString("subject");
        $ic376$ = makeInteger(72);
        $ic377$ = makeString("Message: ");
        $ic378$ = makeString("Send Email");
        $ic379$ = makeSymbol("CB-NOTIFY-ALL-USERS");
        $ic380$ = makeString("exclude");
        $ic381$ = makeString("Email Address");
        $ic382$ = makeString("Exclude?");
        $ic383$ = makeSymbol("S#45459", "CYC");
        $ic384$ = makeString("exclude_");
        $ic385$ = makeSymbol("S#45487", "CYC");
        $ic386$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic387$ = makeKeyword("ADDRESS");
        $ic388$ = constant_handles_oc.f8479((SubLObject)makeString("preferredEMailAddressText"));
        $ic389$ = ConsesLow.list((SubLObject)makeKeyword("ADDRESS"));
        $ic390$ = constant_handles_oc.f8479((SubLObject)makeString("CyclistsMt"));
        $ic391$ = makeString("Sending Message");
        $ic392$ = makeString("Sending message with following content:");
        $ic393$ = makeString("Subject");
        $ic394$ = makeString("Message:");
        $ic395$ = makeString("Sending Log");
        $ic396$ = ConsesLow.list((SubLObject)makeSymbol("S#688", "CYC"), (SubLObject)makeSymbol("S#9126", "CYC"));
        $ic397$ = makeString("Excluding user ");
        $ic398$ = makeString("Sent message to ");
        $ic399$ = makeString("Error on sending message to ");
        $ic400$ = makeSymbol("CB-SEND-EMAIL-TO-SELECTED-USERS");
        $ic401$ = makeString("Login:");
        $ic402$ = makeString("cb-login");
        $ic403$ = makeKeyword("LOGIN");
        $ic404$ = makeSymbol("S#45461", "CYC");
        $ic405$ = makeSymbol("S#17610", "CYC");
        $ic406$ = makeSymbol("S#12274", "CYC");
        $ic407$ = makeSymbol("CB-LOGIN-HANDLER");
        $ic408$ = makeString("redirect-handler");
        $ic409$ = makeSymbol("S#45464", "CYC");
        $ic410$ = makeString("Known Constant");
        $ic411$ = makeString("The name you typed in, ");
        $ic412$ = makeString(" is already used in the Knowledge Base as a Cyc constant.");
        $ic413$ = makeString("Please go back and try a different login name.");
        $ic414$ = makeString("Successful Login");
        $ic415$ = makeString("Welcome, ");
        $ic416$ = makeString("!");
        $ic417$ = makeString("Your project has been set to ");
        $ic418$ = makeString("Change Project");
        $ic419$ = makeString("Your project is currently not set.");
        $ic420$ = makeString("Choose Project");
        $ic421$ = makeString("Login");
        $ic422$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Dr")), (SubLObject)makeString("Dr.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Reverend-Title")), (SubLObject)makeString("Rev.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Prof")), (SubLObject)makeString("Prof.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("President-Title")), (SubLObject)makeString("President")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Sir")), (SubLObject)makeString("Sir")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Major-Title")), (SubLObject)makeString("Maj.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("Lieutenant-Title")), (SubLObject)makeString("Lt.")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("LieutenantColonel-Title")), (SubLObject)makeString("Ltc.")));
        $ic423$ = makeSymbol("?TITLE");
        $ic424$ = constant_handles_oc.f8479((SubLObject)makeString("titleOfPerson"));
        $ic425$ = ConsesLow.list((SubLObject)makeSymbol("?TITLE"));
        $ic426$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic427$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#45491", "CYC"), (SubLObject)makeSymbol("S#45492", "CYC"));
        $ic428$ = constant_handles_oc.f8479((SubLObject)makeString("Sir"));
        $ic429$ = constant_handles_oc.f8479((SubLObject)makeString("givenNames"));
        $ic430$ = constant_handles_oc.f8479((SubLObject)makeString("familyName"));
        $ic431$ = makeKeyword("NONE");
        $ic432$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("givenNames")));
        $ic433$ = makeString("Unknown Cyclist");
        $ic434$ = makeString("cb-create-new-cyclist");
        $ic435$ = makeString("The name ");
        $ic436$ = makeString(" is not the name of a known ");
        $ic437$ = makeString("Do you want to create a new Cyc constant with this name?  You will be able to use this constant as you would any other in the Knowledge Base as well as login with this new name.");
        $ic438$ = makeString("Yes, Create Cyclist");
        $ic439$ = makeString("creating new cyclists");
        $ic440$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic441$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("HumanCyclist")));
        $ic442$ = makeString("Unable to create a new cyclist (why?");
        $ic443$ = makeSymbol("CB-CREATE-NEW-CYCLIST");
        $ic444$ = makeString("sha1.js");
        $ic445$ = makeString("Logout");
        $ic446$ = makeString("You have now logged out from this Cyc image.  Goodbye!");
        $ic447$ = makeKeyword("START");
        $ic448$ = makeString(" to reconnect to Cyc.");
        $ic449$ = makeSymbol("CB-LOGOUT");
        $ic450$ = makeString("[Logout]");
        $ic451$ = makeString("cb-logout");
        $ic452$ = makeSymbol("S#45469", "CYC");
        $ic453$ = makeString("problem");
        $ic454$ = makeString("user_login");
        $ic455$ = makeString("Specify Cyc Browser Password");
        $ic456$ = makeString("80%");
        $ic457$ = makeString("Error!");
        $ic458$ = makeString("Could not set password for ");
        $ic459$ = makeString("Reason:");
        $ic460$ = makeString("Please specify a new password for a cyclist.");
        $ic461$ = makeString("(Note: Only you can reset your own password.)");
        $ic462$ = makeString("cb-set-password-handler");
        $ic463$ = makeString("New Password");
        $ic464$ = makeSymbol("CB-SET-PASSWORD");
        $ic465$ = makeString("[Set Password]");
        $ic466$ = makeString("cb-set-password");
        $ic467$ = makeKeyword("SET-PASSWORD");
        $ic468$ = makeSymbol("S#45470", "CYC");
        $ic469$ = makeString("Set Password");
        $ic470$ = makeString("Passwd");
        $ic471$ = makeString("Set passwords for Cyclist Authentication");
        $ic472$ = makeString("Please fill in all fields.");
        $ic473$ = makeString("No known cyclist by this name.");
        $ic474$ = makeString("The name could mean any of following cyclists: ");
        $ic475$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("encryptedPasswordForUser")));
        $ic476$ = makeSymbol("CB-SET-PASSWORD-HANDLER");
        $ic477$ = makeKeyword("CB-TRANSCRIPT-VIEWER");
        $ic478$ = makeString("cb-transcript-viewer.html");
        $ic479$ = makeString("show-stats");
        $ic480$ = makeString("transcript_filename");
        $ic481$ = makeString("Please type in a filename.");
        $ic482$ = makeString("Transcript Viewing Area");
        $ic483$ = makeString("cb-transcript-viewer-handler");
        $ic484$ = makeKeyword("ALL-LOCAL-TRANS");
        $ic485$ = makeString("cg?cb-transcript-viewer");
        $ic486$ = makeKeyword("GET");
        $ic487$ = makeString("cb-transcript-viewer");
        $ic488$ = makeString("View other transcript:");
        $ic489$ = makeString("Please type in the full path to the transcript: (e.g. /cyc/top/transcripts/[kb#]/[transcript_name])");
        $ic490$ = makeString("ERROR: ");
        $ic491$ = makeString("Stats");
        $ic492$ = makeString("View Transcript");
        $ic493$ = makeSymbol("CB-TRANSCRIPT-VIEWER");
        $ic494$ = makeSymbol("CB-TRANSCRIPT-VIEWER-HANDLER");
        $ic495$ = makeString("Transcript Statistics");
        $ic496$ = makeString("Transcript: ");
        $ic497$ = makeString("Constants Created: ");
        $ic498$ = makeString("Constants Renamed: ");
        $ic499$ = makeString("=>");
        $ic500$ = makeString("Constants Killed: ");
        $ic501$ = makeString("No transcripts for this image!");
        $ic502$ = makeString("Local transcripts for this image:");
        $ic503$ = makeString("cb-transcript-viewer-handler&stats:");
        $ic504$ = makeSymbol("S#45474", "CYC");
        $ic505$ = makeString("Viewer");
        $ic506$ = makeKeyword("VIEWER");
        $ic507$ = makeSymbol("S#45475", "CYC");
        $ic508$ = makeString("Transcript Viewer");
        $ic509$ = makeString("View");
        $ic510$ = makeString("View Local Transcripts");
        $ic511$ = makeKeyword("CB-SHOW-LOCAL-OPS");
        $ic512$ = makeString("cb-show-local-ops.html");
        $ic513$ = makeString("Local Operations");
        $ic514$ = makeString("cb-confirm-clear-local-queue");
        $ic515$ = makeString("You have nothing in your local queue.");
        $ic516$ = makeString(" item");
        $ic517$ = makeString("s");
        $ic518$ = makeString(" in your local queue.");
        $ic519$ = makeString("Click this button to erase the local queue:");
        $ic520$ = makeString("Clear Local Queue");
        $ic521$ = makeString("Here are the queued local operations:");
        $ic522$ = makeSymbol("CB-SHOW-LOCAL-OPS");
        $ic523$ = makeString("Local:");
        $ic524$ = makeString("cb-show-local-ops");
        $ic525$ = makeSymbol("S#45476", "CYC");
        $ic526$ = makeKeyword("CB-CONFIRM-CLEAR-LOCAL-QUEUE");
        $ic527$ = makeString("cb-confirm-clear-local-queue.html");
        $ic528$ = makeString("cb-clear-local-queue");
        $ic529$ = makeString("Are you ");
        $ic530$ = makeString("SURE");
        $ic531$ = makeString(" you want to clear your local queue?");
        $ic532$ = makeString(" operations will be lost!");
        $ic533$ = makeString("Yes, Clear Local Queue");
        $ic534$ = makeSymbol("CB-CONFIRM-CLEAR-LOCAL-QUEUE");
        $ic535$ = makeKeyword("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");
        $ic536$ = makeString("cb-confirm-clear-local-and-restart.html");
        $ic537$ = makeString("cb-clear-local-and-restart");
        $ic538$ = makeString("You have nothing in your local queue. Restarting agenda...");
        $ic539$ = makeString("Local Queue Cleared, Agenda Restarted");
        $ic540$ = makeString(" you want to clear your local queue before restarting the agenda?");
        $ic541$ = makeString("Yes, Clear Local Queue and Restart");
        $ic542$ = makeSymbol("CB-CONFIRM-CLEAR-LOCAL-AND-RESTART");
        $ic543$ = makeString("cb-confirm-clear-local-and-restart");
        $ic544$ = makeSymbol("S#45477", "CYC");
        $ic545$ = makeSymbol("S#45478", "CYC");
        $ic546$ = makeSymbol("CB-CLEAR-LOCAL-AND-RESTART");
        $ic547$ = makeString("Local Queue Cleared");
        $ic548$ = makeSymbol("CB-CLEAR-LOCAL-QUEUE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4911 ms
	
	Decompiled with Procyon 0.5.32.
*/