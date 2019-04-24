package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0369 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0369";
    public static final String myFingerPrint = "0eab5568c164af943e23c1b13dbdd30684d8da66cc2c0b08a45641914e94e594";
    private static SubLSymbol $g3148$;
    public static SubLSymbol $g3149$;
    private static SubLSymbol $g3150$;
    public static SubLSymbol $g3151$;
    public static SubLSymbol $g3152$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLInteger $ic11$;
    private static final SubLInteger $ic12$;
    private static final SubLInteger $ic13$;
    private static final SubLInteger $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLInteger $ic17$;
    private static final SubLInteger $ic18$;
    private static final SubLInteger $ic19$;
    private static final SubLInteger $ic20$;
    private static final SubLInteger $ic21$;
    private static final SubLInteger $ic22$;
    private static final SubLInteger $ic23$;
    private static final SubLInteger $ic24$;
    private static final SubLInteger $ic25$;
    private static final SubLInteger $ic26$;
    private static final SubLInteger $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLInteger $ic29$;
    private static final SubLInteger $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLInteger $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLInteger $ic34$;
    private static final SubLInteger $ic35$;
    private static final SubLInteger $ic36$;
    private static final SubLInteger $ic37$;
    private static final SubLInteger $ic38$;
    private static final SubLInteger $ic39$;
    private static final SubLInteger $ic40$;
    private static final SubLInteger $ic41$;
    private static final SubLInteger $ic42$;
    private static final SubLInteger $ic43$;
    private static final SubLInteger $ic44$;
    private static final SubLInteger $ic45$;
    private static final SubLInteger $ic46$;
    private static final SubLInteger $ic47$;
    private static final SubLInteger $ic48$;
    private static final SubLInteger $ic49$;
    private static final SubLInteger $ic50$;
    private static final SubLInteger $ic51$;
    private static final SubLInteger $ic52$;
    private static final SubLInteger $ic53$;
    private static final SubLInteger $ic54$;
    private static final SubLInteger $ic55$;
    private static final SubLInteger $ic56$;
    private static final SubLInteger $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
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
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLSymbol $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLSymbol $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLSymbol $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLSymbol $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLString $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLList $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLList $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLList $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLList $ic300$;
    private static final SubLList $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLList $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLList $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLList $ic320$;
    private static final SubLList $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLList $ic327$;
    private static final SubLList $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLList $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLSymbol $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLSymbol $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLSymbol $ic342$;
    private static final SubLSymbol $ic343$;
    private static final SubLSymbol $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLSymbol $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLString $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLSymbol $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLSymbol $ic375$;
    private static final SubLList $ic376$;
    private static final SubLSymbol $ic377$;
    private static final SubLSymbol $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLSymbol $ic380$;
    private static final SubLSymbol $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLList $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLList $ic386$;
    private static final SubLSymbol $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLString $ic389$;
    private static final SubLString $ic390$;
    private static final SubLString $ic391$;
    private static final SubLString $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLString $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLString $ic396$;
    private static final SubLString $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLString $ic400$;
    private static final SubLSymbol $ic401$;
    private static final SubLSymbol $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLSymbol $ic408$;
    private static final SubLSymbol $ic409$;
    private static final SubLSymbol $ic410$;
    private static final SubLString $ic411$;
    private static final SubLSymbol $ic412$;
    private static final SubLSymbol $ic413$;
    private static final SubLSymbol $ic414$;
    private static final SubLSymbol $ic415$;
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
    private static final SubLString $ic426$;
    private static final SubLString $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLSymbol $ic429$;
    private static final SubLSymbol $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLList $ic432$;
    private static final SubLList $ic433$;
    private static final SubLList $ic434$;
    private static final SubLList $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLList $ic438$;
    private static final SubLSymbol $ic439$;
    private static final SubLSymbol $ic440$;
    private static final SubLSymbol $ic441$;
    private static final SubLSymbol $ic442$;
    private static final SubLSymbol $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLSymbol $ic445$;
    private static final SubLSymbol $ic446$;
    private static final SubLSymbol $ic447$;
    private static final SubLSymbol $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLSymbol $ic450$;
    private static final SubLSymbol $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLSymbol $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLSymbol $ic455$;
    private static final SubLString $ic456$;
    private static final SubLString $ic457$;
    private static final SubLSymbol $ic458$;
    private static final SubLSymbol $ic459$;
    private static final SubLList $ic460$;
    private static final SubLSymbol $ic461$;
    private static final SubLSymbol $ic462$;
    private static final SubLList $ic463$;
    private static final SubLSymbol $ic464$;
    private static final SubLSymbol $ic465$;
    private static final SubLSymbol $ic466$;
    private static final SubLSymbol $ic467$;
    private static final SubLSymbol $ic468$;
    private static final SubLString $ic469$;
    private static final SubLSymbol $ic470$;
    private static final SubLSymbol $ic471$;
    private static final SubLList $ic472$;
    private static final SubLList $ic473$;
    private static final SubLList $ic474$;
    private static final SubLList $ic475$;
    private static final SubLSymbol $ic476$;
    private static final SubLSymbol $ic477$;
    private static final SubLList $ic478$;
    private static final SubLSymbol $ic479$;
    private static final SubLSymbol $ic480$;
    private static final SubLSymbol $ic481$;
    private static final SubLSymbol $ic482$;
    private static final SubLSymbol $ic483$;
    private static final SubLSymbol $ic484$;
    private static final SubLSymbol $ic485$;
    private static final SubLSymbol $ic486$;
    private static final SubLSymbol $ic487$;
    private static final SubLSymbol $ic488$;
    private static final SubLSymbol $ic489$;
    private static final SubLSymbol $ic490$;
    private static final SubLSymbol $ic491$;
    private static final SubLSymbol $ic492$;
    private static final SubLString $ic493$;
    private static final SubLSymbol $ic494$;
    private static final SubLSymbol $ic495$;
    private static final SubLString $ic496$;
    private static final SubLSymbol $ic497$;
    private static final SubLSymbol $ic498$;
    private static final SubLList $ic499$;
    private static final SubLSymbol $ic500$;
    private static final SubLList $ic501$;
    private static final SubLSymbol $ic502$;
    private static final SubLSymbol $ic503$;
    private static final SubLSymbol $ic504$;
    private static final SubLSymbol $ic505$;
    private static final SubLSymbol $ic506$;
    private static final SubLSymbol $ic507$;
    private static final SubLList $ic508$;
    private static final SubLList $ic509$;
    private static final SubLSymbol $ic510$;
    private static final SubLSymbol $ic511$;
    private static final SubLSymbol $ic512$;
    private static final SubLSymbol $ic513$;
    private static final SubLSymbol $ic514$;
    private static final SubLSymbol $ic515$;
    private static final SubLSymbol $ic516$;
    private static final SubLSymbol $ic517$;
    private static final SubLSymbol $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLSymbol $ic520$;
    private static final SubLSymbol $ic521$;
    private static final SubLSymbol $ic522$;
    private static final SubLSymbol $ic523$;
    private static final SubLSymbol $ic524$;
    private static final SubLSymbol $ic525$;
    private static final SubLSymbol $ic526$;
    private static final SubLSymbol $ic527$;
    private static final SubLSymbol $ic528$;
    private static final SubLSymbol $ic529$;
    private static final SubLSymbol $ic530$;
    private static final SubLString $ic531$;
    private static final SubLSymbol $ic532$;
    private static final SubLSymbol $ic533$;
    private static final SubLSymbol $ic534$;
    private static final SubLList $ic535$;
    private static final SubLSymbol $ic536$;
    private static final SubLSymbol $ic537$;
    private static final SubLSymbol $ic538$;
    private static final SubLString $ic539$;
    private static final SubLSymbol $ic540$;
    private static final SubLSymbol $ic541$;
    private static final SubLSymbol $ic542$;
    private static final SubLSymbol $ic543$;
    private static final SubLSymbol $ic544$;
    private static final SubLSymbol $ic545$;
    private static final SubLSymbol $ic546$;
    private static final SubLList $ic547$;
    private static final SubLList $ic548$;
    private static final SubLList $ic549$;
    private static final SubLSymbol $ic550$;
    private static final SubLSymbol $ic551$;
    private static final SubLSymbol $ic552$;
    private static final SubLSymbol $ic553$;
    private static final SubLList $ic554$;
    private static final SubLSymbol $ic555$;
    private static final SubLSymbol $ic556$;
    private static final SubLSymbol $ic557$;
    private static final SubLSymbol $ic558$;
    private static final SubLSymbol $ic559$;
    private static final SubLSymbol $ic560$;
    private static final SubLSymbol $ic561$;
    private static final SubLSymbol $ic562$;
    private static final SubLSymbol $ic563$;
    private static final SubLSymbol $ic564$;
    private static final SubLList $ic565$;
    private static final SubLList $ic566$;
    private static final SubLSymbol $ic567$;
    private static final SubLSymbol $ic568$;
    private static final SubLSymbol $ic569$;
    private static final SubLSymbol $ic570$;
    private static final SubLSymbol $ic571$;
    private static final SubLSymbol $ic572$;
    private static final SubLSymbol $ic573$;
    private static final SubLSymbol $ic574$;
    private static final SubLSymbol $ic575$;
    private static final SubLSymbol $ic576$;
    private static final SubLSymbol $ic577$;
    private static final SubLSymbol $ic578$;
    private static final SubLSymbol $ic579$;
    private static final SubLSymbol $ic580$;
    private static final SubLSymbol $ic581$;
    private static final SubLSymbol $ic582$;
    private static final SubLSymbol $ic583$;
    
    
    public static SubLObject f25272(final SubLObject var1) {
        return module0004.f104(var1, module0369.$g3148$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.EQ), (SubLObject)module0369.UNPROVIDED);
    }
    
    public static SubLObject f25273(final SubLObject var2, final SubLObject var3) {
        f25274(var2, var3, (SubLObject)module0369.ZERO_INTEGER);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25275(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX25426_native.class) ? module0369.T : module0369.NIL);
    }
    
    public static SubLObject f25276(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f25277(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f25278(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f25279(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f25280(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField6();
    }
    
    public static SubLObject f25281(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField7();
    }
    
    public static SubLObject f25282(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField8();
    }
    
    public static SubLObject f25283(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField9();
    }
    
    public static SubLObject f25284(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField10();
    }
    
    public static SubLObject f25285(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField11();
    }
    
    public static SubLObject f25286(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField12();
    }
    
    public static SubLObject f25287(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField13();
    }
    
    public static SubLObject f25288(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField14();
    }
    
    public static SubLObject f25289(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField15();
    }
    
    public static SubLObject f25290(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField16();
    }
    
    public static SubLObject f25291(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField17();
    }
    
    public static SubLObject f25292(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField18();
    }
    
    public static SubLObject f25293(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField19();
    }
    
    public static SubLObject f25294(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.getField20();
    }
    
    public static SubLObject f25295(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$status;
    }
    
    public static SubLObject f25296(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$suspend_status;
    }
    
    public static SubLObject f25297(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$root_link;
    }
    
    public static SubLObject f25298(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$relevant_problems;
    }
    
    public static SubLObject f25299(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$strategy_set;
    }
    
    public static SubLObject f25300(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$control_process;
    }
    
    public static SubLObject f25301(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$interrupting_processes;
    }
    
    public static SubLObject f25302(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_transformation_depth_reached;
    }
    
    public static SubLObject f25303(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$disjunction_free_el_vars_policy;
    }
    
    public static SubLObject f25304(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$result_uniqueness_criterion;
    }
    
    public static SubLObject f25305(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_hl_predicate_transformationP;
    }
    
    public static SubLObject f25306(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_unbound_predicate_transformationP;
    }
    
    public static SubLObject f25307(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_evaluatable_predicate_transformationP;
    }
    
    public static SubLObject f25308(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_indeterminate_resultsP;
    }
    
    public static SubLObject f25309(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allowed_rules;
    }
    
    public static SubLObject f25310(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$forbidden_rules;
    }
    
    public static SubLObject f25311(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allowed_modules;
    }
    
    public static SubLObject f25312(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_abnormality_checkingP;
    }
    
    public static SubLObject f25313(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$transitive_closure_mode;
    }
    
    public static SubLObject f25314(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$problem_store_privateP;
    }
    
    public static SubLObject f25315(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$continuableP;
    }
    
    public static SubLObject f25316(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$browsableP;
    }
    
    public static SubLObject f25317(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$return_type;
    }
    
    public static SubLObject f25318(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$answer_language;
    }
    
    public static SubLObject f25319(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$cache_resultsP;
    }
    
    public static SubLObject f25320(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$blockingP;
    }
    
    public static SubLObject f25321(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_number;
    }
    
    public static SubLObject f25322(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_time;
    }
    
    public static SubLObject f25323(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_step;
    }
    
    public static SubLObject f25324(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$mode;
    }
    
    public static SubLObject f25325(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$forward_max_time;
    }
    
    public static SubLObject f25326(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_proof_depth;
    }
    
    public static SubLObject f25327(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_transformation_depth;
    }
    
    public static SubLObject f25328(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$min_rule_utility;
    }
    
    public static SubLObject f25329(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$probably_approximately_done;
    }
    
    public static SubLObject f25330(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$metrics_template;
    }
    
    public static SubLObject f25331(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$start_universal_time;
    }
    
    public static SubLObject f25332(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$start_internal_real_time;
    }
    
    public static SubLObject f25333(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$end_internal_real_time;
    }
    
    public static SubLObject f25334(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$pad_internal_real_time;
    }
    
    public static SubLObject f25335(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$cumulative_time;
    }
    
    public static SubLObject f25336(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$step_count;
    }
    
    public static SubLObject f25337(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$cumulative_step_count;
    }
    
    public static SubLObject f25338(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$events;
    }
    
    public static SubLObject f25339(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$halt_conditions;
    }
    
    public static SubLObject f25340(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$accumulators;
    }
    
    public static SubLObject f25341(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$proof_watermark;
    }
    
    public static SubLObject f25342(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$problem_working_time_data;
    }
    
    public static SubLObject f25343(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$type;
    }
    
    public static SubLObject f25344(final SubLObject var2) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$data;
    }
    
    public static SubLObject f25345(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f25346(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f25347(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f25348(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f25349(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField6(var5);
    }
    
    public static SubLObject f25350(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField7(var5);
    }
    
    public static SubLObject f25351(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField8(var5);
    }
    
    public static SubLObject f25352(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField9(var5);
    }
    
    public static SubLObject f25353(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField10(var5);
    }
    
    public static SubLObject f25354(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField11(var5);
    }
    
    public static SubLObject f25355(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField12(var5);
    }
    
    public static SubLObject f25356(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField13(var5);
    }
    
    public static SubLObject f25357(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField14(var5);
    }
    
    public static SubLObject f25358(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField15(var5);
    }
    
    public static SubLObject f25359(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField16(var5);
    }
    
    public static SubLObject f25360(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField17(var5);
    }
    
    public static SubLObject f25361(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField18(var5);
    }
    
    public static SubLObject f25362(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField19(var5);
    }
    
    public static SubLObject f25363(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return var2.setField20(var5);
    }
    
    public static SubLObject f25364(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$status = var5;
    }
    
    public static SubLObject f25365(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$suspend_status = var5;
    }
    
    public static SubLObject f25366(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$root_link = var5;
    }
    
    public static SubLObject f25367(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$relevant_problems = var5;
    }
    
    public static SubLObject f25368(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$strategy_set = var5;
    }
    
    public static SubLObject f25369(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$control_process = var5;
    }
    
    public static SubLObject f25370(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$interrupting_processes = var5;
    }
    
    public static SubLObject f25371(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_transformation_depth_reached = var5;
    }
    
    public static SubLObject f25372(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$disjunction_free_el_vars_policy = var5;
    }
    
    public static SubLObject f25373(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$result_uniqueness_criterion = var5;
    }
    
    public static SubLObject f25374(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_hl_predicate_transformationP = var5;
    }
    
    public static SubLObject f25375(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_unbound_predicate_transformationP = var5;
    }
    
    public static SubLObject f25376(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_evaluatable_predicate_transformationP = var5;
    }
    
    public static SubLObject f25377(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_indeterminate_resultsP = var5;
    }
    
    public static SubLObject f25378(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allowed_rules = var5;
    }
    
    public static SubLObject f25379(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$forbidden_rules = var5;
    }
    
    public static SubLObject f25380(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allowed_modules = var5;
    }
    
    public static SubLObject f25381(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$allow_abnormality_checkingP = var5;
    }
    
    public static SubLObject f25382(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$transitive_closure_mode = var5;
    }
    
    public static SubLObject f25383(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$problem_store_privateP = var5;
    }
    
    public static SubLObject f25384(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$continuableP = var5;
    }
    
    public static SubLObject f25385(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$browsableP = var5;
    }
    
    public static SubLObject f25386(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$return_type = var5;
    }
    
    public static SubLObject f25387(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$answer_language = var5;
    }
    
    public static SubLObject f25388(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$cache_resultsP = var5;
    }
    
    public static SubLObject f25389(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$blockingP = var5;
    }
    
    public static SubLObject f25390(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_number = var5;
    }
    
    public static SubLObject f25391(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_time = var5;
    }
    
    public static SubLObject f25392(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_step = var5;
    }
    
    public static SubLObject f25393(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$mode = var5;
    }
    
    public static SubLObject f25394(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$forward_max_time = var5;
    }
    
    public static SubLObject f25395(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_proof_depth = var5;
    }
    
    public static SubLObject f25396(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$max_transformation_depth = var5;
    }
    
    public static SubLObject f25397(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$min_rule_utility = var5;
    }
    
    public static SubLObject f25398(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$probably_approximately_done = var5;
    }
    
    public static SubLObject f25399(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$metrics_template = var5;
    }
    
    public static SubLObject f25400(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$start_universal_time = var5;
    }
    
    public static SubLObject f25401(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$start_internal_real_time = var5;
    }
    
    public static SubLObject f25402(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$end_internal_real_time = var5;
    }
    
    public static SubLObject f25403(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$pad_internal_real_time = var5;
    }
    
    public static SubLObject f25404(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$cumulative_time = var5;
    }
    
    public static SubLObject f25405(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$step_count = var5;
    }
    
    public static SubLObject f25406(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$cumulative_step_count = var5;
    }
    
    public static SubLObject f25407(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$events = var5;
    }
    
    public static SubLObject f25408(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$halt_conditions = var5;
    }
    
    public static SubLObject f25409(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$accumulators = var5;
    }
    
    public static SubLObject f25410(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$proof_watermark = var5;
    }
    
    public static SubLObject f25411(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$problem_working_time_data = var5;
    }
    
    public static SubLObject f25412(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$type = var5;
    }
    
    public static SubLObject f25413(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25275(var2) : var2;
        return (($sX25426_native)var2).$data = var5;
    }
    
    public static SubLObject f25414(SubLObject var6) {
        if (var6 == module0369.UNPROVIDED) {
            var6 = (SubLObject)module0369.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX25426_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0369.NIL, var8 = var6; module0369.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0369.$ic198$)) {
                f25345(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic199$)) {
                f25346(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic200$)) {
                f25347(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic201$)) {
                f25348(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic202$)) {
                f25349(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic203$)) {
                f25350(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic204$)) {
                f25351(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic205$)) {
                f25352(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic206$)) {
                f25353(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic207$)) {
                f25354(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic208$)) {
                f25355(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic209$)) {
                f25356(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic210$)) {
                f25357(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic211$)) {
                f25358(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic212$)) {
                f25359(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic213$)) {
                f25360(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic214$)) {
                f25361(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic215$)) {
                f25362(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic216$)) {
                f25363(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic217$)) {
                f25364(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic218$)) {
                f25365(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic219$)) {
                f25366(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic220$)) {
                f25367(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic221$)) {
                f25368(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic222$)) {
                f25369(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic223$)) {
                f25370(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic224$)) {
                f25371(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic225$)) {
                f25372(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic226$)) {
                f25373(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic227$)) {
                f25374(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic228$)) {
                f25375(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic229$)) {
                f25376(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic230$)) {
                f25377(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic231$)) {
                f25378(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic232$)) {
                f25379(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic233$)) {
                f25380(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic234$)) {
                f25381(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic235$)) {
                f25382(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic236$)) {
                f25383(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic237$)) {
                f25384(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic238$)) {
                f25385(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic239$)) {
                f25386(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic240$)) {
                f25387(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic241$)) {
                f25388(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic242$)) {
                f25389(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic243$)) {
                f25390(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic244$)) {
                f25391(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic245$)) {
                f25392(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic246$)) {
                f25393(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic247$)) {
                f25394(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic248$)) {
                f25395(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic249$)) {
                f25396(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic250$)) {
                f25397(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic251$)) {
                f25398(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic252$)) {
                f25399(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic253$)) {
                f25400(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic254$)) {
                f25401(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic255$)) {
                f25402(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic256$)) {
                f25403(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic257$)) {
                f25404(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic258$)) {
                f25405(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic259$)) {
                f25406(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic260$)) {
                f25407(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic261$)) {
                f25408(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic262$)) {
                f25409(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic263$)) {
                f25410(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic264$)) {
                f25411(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic265$)) {
                f25412(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic266$)) {
                f25413(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0369.$ic267$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f25415(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic268$, (SubLObject)module0369.$ic269$, (SubLObject)module0369.$ic56$);
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic198$, f25276(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic199$, f25277(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic200$, f25278(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic201$, f25279(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic202$, f25280(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic203$, f25281(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic204$, f25282(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic205$, f25283(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic206$, f25284(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic207$, f25285(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic208$, f25286(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic209$, f25287(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic210$, f25288(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic211$, f25289(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic212$, f25290(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic213$, f25291(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic214$, f25292(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic215$, f25293(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic216$, f25294(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic217$, f25295(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic218$, f25296(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic219$, f25297(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic220$, f25298(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic221$, f25299(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic222$, f25300(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic223$, f25301(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic224$, f25302(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic225$, f25303(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic226$, f25304(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic227$, f25305(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic228$, f25306(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic229$, f25307(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic230$, f25308(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic231$, f25309(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic232$, f25310(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic233$, f25311(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic234$, f25312(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic235$, f25313(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic236$, f25314(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic237$, f25315(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic238$, f25316(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic239$, f25317(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic240$, f25318(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic241$, f25319(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic242$, f25320(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic243$, f25321(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic244$, f25322(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic245$, f25323(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic246$, f25324(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic247$, f25325(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic248$, f25326(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic249$, f25327(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic250$, f25328(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic251$, f25329(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic252$, f25330(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic253$, f25331(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic254$, f25332(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic255$, f25333(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic256$, f25334(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic257$, f25335(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic258$, f25336(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic259$, f25337(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic260$, f25338(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic261$, f25339(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic262$, f25340(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic263$, f25341(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic264$, f25342(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic265$, f25343(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic266$, f25344(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic271$, (SubLObject)module0369.$ic269$, (SubLObject)module0369.$ic56$);
        return var12;
    }
    
    public static SubLObject f25416(final SubLObject var12, final SubLObject var13) {
        return f25415(var12, var13);
    }
    
    public static SubLObject f25417(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.NIL == f25418(var1));
    }
    
    public static SubLObject f25419(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.NIL != f25418(var1));
    }
    
    public static SubLObject f25418(final SubLObject var14) {
        return Equality.eq((SubLObject)module0369.$ic273$, f25420(var14));
    }
    
    public static SubLObject f25274(final SubLObject var1, final SubLObject var3, final SubLObject var15) {
        if (module0369.NIL != f25418(var1)) {
            PrintLow.format(var3, (SubLObject)module0369.$ic274$, f25276(var1));
        }
        else {
            PrintLow.format(var3, (SubLObject)module0369.$ic275$, new SubLObject[] { module0361.f23996(f25421(var1)), f25422(var1), f25420(var1), f25423(var1), f25424(var1) });
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25425(final SubLObject var1) {
        return f25276(var1);
    }
    
    public static SubLObject f25426(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic277$ == f25420(var1));
    }
    
    public static SubLObject f25427(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic278$ == f25420(var1));
    }
    
    public static SubLObject f25428(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic279$ == f25420(var1));
    }
    
    public static SubLObject f25429(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic280$ == f25420(var1));
    }
    
    public static SubLObject f25430(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic281$ == f25420(var1));
    }
    
    public static SubLObject f25431(final SubLObject var1) {
        if (module0369.NIL != f25275(var1)) {
            final SubLObject var2 = f25420(var1);
            if (module0369.NIL != module0360.f23870(var2)) {
                if (module0369.$ic281$ != var2) {
                    return (SubLObject)module0369.T;
                }
                if (module0369.NIL != f25432(var1)) {
                    final SubLObject var3 = f25433(var1);
                    return module0360.f23874(var3);
                }
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25434(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25430(var1) && module0369.NIL != module0360.f23868(f25433(var1)));
    }
    
    public static SubLObject f25435(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic282$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic282$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic282$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic283$, (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic284$, var24)), ConsesLow.append(var25, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic282$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25436(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic285$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic285$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic285$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic286$, (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic287$, var24)), ConsesLow.append(var25, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic285$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25437(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic288$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic288$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic288$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            final SubLObject var26 = (SubLObject)module0369.$ic289$;
            final SubLObject var27 = (SubLObject)module0369.$ic290$;
            final SubLObject var28 = (SubLObject)module0369.$ic291$;
            final SubLObject var29 = (SubLObject)module0369.$ic292$;
            return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var29, var24), (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic294$, var24)), (SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic295$, var24))), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic296$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, var26, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic297$, var28))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0369.$ic298$, var28, var27)), (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic299$, var29, var28))), ConsesLow.append(var25, (SubLObject)module0369.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic288$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25438(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic300$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic300$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic300$);
        var24 = var21.first();
        var21 = var21.rest();
        SubLObject var25 = (SubLObject)module0369.NIL;
        SubLObject var26 = var21;
        SubLObject var27 = (SubLObject)module0369.NIL;
        SubLObject var43_44 = (SubLObject)module0369.NIL;
        while (module0369.NIL != var26) {
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)module0369.$ic300$);
            var43_44 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)module0369.$ic300$);
            if (module0369.NIL == conses_high.member(var43_44, (SubLObject)module0369.$ic301$, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED)) {
                var27 = (SubLObject)module0369.T;
            }
            if (var43_44 == module0369.$ic302$) {
                var25 = var26.first();
            }
            var26 = var26.rest();
        }
        if (module0369.NIL != var27 && module0369.NIL == var25) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic300$);
        }
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0369.$ic303$, var21);
        final SubLObject var29 = (SubLObject)((module0369.NIL != var28) ? conses_high.cadr(var28) : module0369.NIL);
        final SubLObject var30;
        var21 = (var30 = var22);
        final SubLObject var31 = (SubLObject)module0369.$ic304$;
        return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic305$, (SubLObject)ConsesLow.list(var31, var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic306$, var24), (SubLObject)module0369.$ic303$, var29), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic307$, var31), ConsesLow.append(var30, (SubLObject)module0369.NIL));
    }
    
    public static SubLObject f25439(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic308$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        SubLObject var25 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic308$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic308$);
        var24 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic308$);
        var25 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var26;
            var21 = (var26 = var22);
            final SubLObject var27 = (SubLObject)module0369.$ic309$;
            final SubLObject var28 = (SubLObject)module0369.$ic310$;
            final SubLObject var29 = (SubLObject)module0369.$ic311$;
            final SubLObject var30 = (SubLObject)module0369.$ic312$;
            return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var30, var24), (SubLObject)ConsesLow.list(var27, var25), (SubLObject)ConsesLow.list(var28, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic295$, var24))), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic296$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var29, var27, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic297$, var29))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0369.$ic298$, var29, var28)), (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic299$, var30, var29))), ConsesLow.append(var26, (SubLObject)module0369.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic313$, var25, var28));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic308$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25440(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic285$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic285$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic285$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            final SubLObject var26 = (SubLObject)module0369.$ic314$;
            return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic315$, (SubLObject)ConsesLow.list(var26, var24), (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic316$, (SubLObject)ConsesLow.list(var23, var26), ConsesLow.append(var25, (SubLObject)module0369.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic285$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25441(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic317$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic317$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic317$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic318$, (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic319$, var24)), ConsesLow.append(var25, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic317$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25442(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic320$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic320$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic320$);
        var24 = var21.first();
        var21 = var21.rest();
        SubLObject var25 = (SubLObject)module0369.NIL;
        SubLObject var26 = var21;
        SubLObject var27 = (SubLObject)module0369.NIL;
        SubLObject var66_67 = (SubLObject)module0369.NIL;
        while (module0369.NIL != var26) {
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)module0369.$ic320$);
            var66_67 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)module0369.$ic320$);
            if (module0369.NIL == conses_high.member(var66_67, (SubLObject)module0369.$ic321$, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED)) {
                var27 = (SubLObject)module0369.T;
            }
            if (var66_67 == module0369.$ic302$) {
                var25 = var26.first();
            }
            var26 = var26.rest();
        }
        if (module0369.NIL != var27 && module0369.NIL == var25) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic320$);
        }
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0369.$ic322$, var21);
        final SubLObject var29 = (SubLObject)((module0369.NIL != var28) ? conses_high.cadr(var28) : module0369.NIL);
        final SubLObject var30;
        var21 = (var30 = var22);
        final SubLObject var31 = (SubLObject)module0369.$ic323$;
        return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic324$, var24))), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic325$, var31, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic326$, (SubLObject)ConsesLow.list(var23, var31, (SubLObject)module0369.$ic322$, var29), ConsesLow.append(var30, (SubLObject)module0369.NIL))));
    }
    
    public static SubLObject f25443(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic327$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic327$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic327$);
        var24 = var21.first();
        var21 = var21.rest();
        SubLObject var25 = (SubLObject)module0369.NIL;
        SubLObject var26 = var21;
        SubLObject var27 = (SubLObject)module0369.NIL;
        SubLObject var78_79 = (SubLObject)module0369.NIL;
        while (module0369.NIL != var26) {
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)module0369.$ic327$);
            var78_79 = var26.first();
            var26 = var26.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var26, var20, (SubLObject)module0369.$ic327$);
            if (module0369.NIL == conses_high.member(var78_79, (SubLObject)module0369.$ic328$, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED)) {
                var27 = (SubLObject)module0369.T;
            }
            if (var78_79 == module0369.$ic302$) {
                var25 = var26.first();
            }
            var26 = var26.rest();
        }
        if (module0369.NIL != var27 && module0369.NIL == var25) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic327$);
        }
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0369.$ic329$, var21);
        final SubLObject var29 = (SubLObject)((module0369.NIL != var28) ? conses_high.cadr(var28) : module0369.NIL);
        final SubLObject var30;
        var21 = (var30 = var22);
        return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic283$, (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic330$, var24), (SubLObject)module0369.$ic329$, var29), ConsesLow.append(var30, (SubLObject)module0369.NIL));
    }
    
    public static SubLObject f25444(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic331$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic331$);
        var23 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var24;
            var21 = (var24 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic332$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0369.$ic333$, var23)), ConsesLow.append(var24, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic331$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25445(final SubLObject var85) {
        assert module0369.NIL != module0361.f24009(var85) : var85;
        final SubLObject var86 = f25414((SubLObject)module0369.UNPROVIDED);
        final SubLObject var87 = module0361.f24356(var85);
        module0413.f28810();
        f25345(var86, var87);
        f25346(var86, var85);
        f25347(var86, (SubLObject)module0369.NIL);
        f25359(var86, (SubLObject)module0369.NIL);
        f25360(var86, module0065.f4745((SubLObject)module0369.TEN_INTEGER, (SubLObject)module0369.ZERO_INTEGER));
        f25361(var86, module0067.f4880(Symbols.symbol_function((SubLObject)module0369.EQUAL), (SubLObject)module0369.UNPROVIDED));
        f25363(var86, module0055.f4017());
        f25446(var86);
        f25447(var86, (SubLObject)module0369.$ic277$);
        f25367(var86, module0077.f5313(Symbols.symbol_function((SubLObject)module0369.EQ), (SubLObject)module0369.UNPROVIDED));
        f25368(var86, module0077.f5313(Symbols.symbol_function((SubLObject)module0369.EQ), (SubLObject)module0369.UNPROVIDED));
        f25448(var86);
        f25370(var86, module0055.f4017());
        f25371(var86, (SubLObject)module0369.ZERO_INTEGER);
        f25449(var86, module0360.$g3097$.getGlobalValue());
        f25450(var86, module0360.$g3101$.getGlobalValue());
        f25451(var86, (SubLObject)module0369.NIL);
        f25452(var86, module0360.$g3112$.getGlobalValue());
        f25453(var86, module0360.$g3111$.getGlobalValue());
        f25454(var86, module0360.$g3032$.getGlobalValue());
        f25455(var86, module0360.$g3033$.getGlobalValue());
        f25456(var86, module0360.$g3034$.getGlobalValue());
        f25457(var86, module0360.$g3035$.getGlobalValue());
        f25458(var86, module0360.$g3036$.getGlobalValue());
        f25459(var86, (SubLObject)module0369.ZERO_INTEGER);
        f25460(var86, (SubLObject)module0369.ZERO_INTEGER);
        f25461(var86, (SubLObject)module0369.ZERO_INTEGER);
        f25462(var86, module0360.$g3037$.getGlobalValue());
        f25463(var86, module0360.$g3038$.getGlobalValue());
        f25464(var86, module0360.$g3039$.getGlobalValue());
        f25465(var86, module0360.$g3040$.getGlobalValue());
        f25466(var86, module0360.$g3042$.getGlobalValue());
        f25409(var86, module0067.f4880(Symbols.symbol_function((SubLObject)module0369.EQ), (SubLObject)module0369.UNPROVIDED));
        f25410(var86, (SubLObject)module0369.ZERO_INTEGER);
        f25467(var86);
        module0361.f24361(var85, var86);
        return var86;
    }
    
    public static SubLObject f25468(final SubLObject var85) {
        final SubLObject var86 = f25445(var85);
        f25447(var86, (SubLObject)module0369.$ic335$);
        return var86;
    }
    
    public static SubLObject f25469() {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        SubLObject var89;
        final SubLObject var88 = var89 = f25470();
        SubLObject var90 = (SubLObject)module0369.NIL;
        var90 = var89.first();
        while (module0369.NIL != var89) {
            SubLObject var91 = (SubLObject)module0369.NIL;
            try {
                var87.throwStack.push(module0369.$ic336$);
                final SubLObject var92 = Errors.$error_handler$.currentBinding(var87);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0369.$ic337$), var87);
                    try {
                        f25471(var90);
                    }
                    catch (Throwable var93) {
                        Errors.handleThrowable(var93, (SubLObject)module0369.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var92, var87);
                }
            }
            catch (Throwable var94) {
                var91 = Errors.handleThrowable(var94, (SubLObject)module0369.$ic336$);
            }
            finally {
                var87.throwStack.pop();
            }
            var89 = var89.rest();
            var90 = var89.first();
        }
        return Sequences.length(var88);
    }
    
    public static SubLObject f25471(final SubLObject var14) {
        if (module0369.NIL != f25417(var14)) {
            try {
                module0408.f28442(var14);
            }
            finally {
                final SubLObject var15 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0369.T);
                    f25472(var14);
                    final SubLObject var16 = module0077.f5333(f25473(var14));
                    SubLObject var17;
                    SubLObject var18;
                    SubLObject var19;
                    for (var17 = module0032.f1741(var16), var18 = (SubLObject)module0369.NIL, var18 = module0032.f1742(var17, var16); module0369.NIL == module0032.f1744(var17, var18); var18 = module0032.f1743(var18)) {
                        var19 = module0032.f1745(var17, var18);
                        if (module0369.NIL != module0032.f1746(var18, var19)) {
                            module0367.f25047(var19);
                        }
                    }
                    final SubLObject var20 = f25474(var14);
                    module0364.f24731(var20);
                    final SubLObject var21 = f25421(var14);
                    module0361.f24362(var21, var14);
                    f25475(var14);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var15);
                }
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25476(final SubLObject var14) {
        if (module0369.NIL != f25275(var14)) {
            final SubLObject var15 = f25421(var14);
            f25471(var14);
            module0361.f24005(var15);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25477(final SubLObject var14) {
        if (module0369.NIL != f25417(var14)) {
            module0408.f28442(var14);
            f25472(var14);
            return f25475(var14);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25475(final SubLObject var36) {
        module0368.f25265(f25278(var36));
        f25346(var36, (SubLObject)module0369.$ic338$);
        f25347(var36, (SubLObject)module0369.$ic338$);
        f25348(var36, (SubLObject)module0369.$ic338$);
        f25349(var36, (SubLObject)module0369.$ic338$);
        f25350(var36, (SubLObject)module0369.$ic338$);
        f25351(var36, (SubLObject)module0369.$ic338$);
        f25352(var36, (SubLObject)module0369.$ic338$);
        f25353(var36, (SubLObject)module0369.$ic338$);
        f25354(var36, (SubLObject)module0369.$ic338$);
        f25355(var36, (SubLObject)module0369.$ic338$);
        f25356(var36, (SubLObject)module0369.$ic338$);
        f25357(var36, (SubLObject)module0369.$ic338$);
        f25358(var36, (SubLObject)module0369.$ic338$);
        f25359(var36, (SubLObject)module0369.$ic338$);
        module0065.f4762(f25291(var36));
        f25360(var36, (SubLObject)module0369.$ic338$);
        module0067.f4881(f25292(var36));
        f25361(var36, (SubLObject)module0369.$ic338$);
        f25362(var36, (SubLObject)module0369.$ic338$);
        module0055.f4018(f25294(var36));
        f25363(var36, (SubLObject)module0369.$ic338$);
        f25365(var36, (SubLObject)module0369.$ic338$);
        f25366(var36, (SubLObject)module0369.$ic338$);
        f25478(var36);
        f25367(var36, (SubLObject)module0369.$ic338$);
        f25479(var36);
        f25368(var36, (SubLObject)module0369.$ic338$);
        f25448(var36);
        f25369(var36, (SubLObject)module0369.$ic338$);
        module0055.f4018(f25301(var36));
        f25370(var36, (SubLObject)module0369.$ic338$);
        f25371(var36, (SubLObject)module0369.$ic338$);
        f25467(var36);
        f25389(var36, (SubLObject)module0369.$ic338$);
        f25372(var36, (SubLObject)module0369.$ic338$);
        f25373(var36, (SubLObject)module0369.$ic338$);
        f25374(var36, (SubLObject)module0369.$ic338$);
        f25375(var36, (SubLObject)module0369.$ic338$);
        f25376(var36, (SubLObject)module0369.$ic338$);
        f25377(var36, (SubLObject)module0369.$ic338$);
        f25378(var36, (SubLObject)module0369.$ic338$);
        f25379(var36, (SubLObject)module0369.$ic338$);
        f25380(var36, (SubLObject)module0369.$ic338$);
        f25381(var36, (SubLObject)module0369.$ic338$);
        f25382(var36, (SubLObject)module0369.$ic338$);
        f25383(var36, (SubLObject)module0369.$ic338$);
        f25384(var36, (SubLObject)module0369.$ic338$);
        f25385(var36, (SubLObject)module0369.$ic338$);
        f25386(var36, (SubLObject)module0369.$ic338$);
        f25387(var36, (SubLObject)module0369.$ic338$);
        f25388(var36, (SubLObject)module0369.$ic338$);
        f25390(var36, (SubLObject)module0369.$ic338$);
        f25391(var36, (SubLObject)module0369.$ic338$);
        f25392(var36, (SubLObject)module0369.$ic338$);
        f25393(var36, (SubLObject)module0369.$ic338$);
        f25394(var36, (SubLObject)module0369.$ic338$);
        f25395(var36, (SubLObject)module0369.$ic338$);
        f25396(var36, (SubLObject)module0369.$ic338$);
        f25397(var36, (SubLObject)module0369.$ic338$);
        f25398(var36, (SubLObject)module0369.$ic338$);
        f25399(var36, (SubLObject)module0369.$ic338$);
        f25400(var36, (SubLObject)module0369.$ic338$);
        f25401(var36, (SubLObject)module0369.$ic338$);
        f25402(var36, (SubLObject)module0369.$ic338$);
        f25403(var36, (SubLObject)module0369.$ic338$);
        f25404(var36, (SubLObject)module0369.$ic338$);
        f25405(var36, (SubLObject)module0369.$ic338$);
        f25406(var36, (SubLObject)module0369.$ic338$);
        f25407(var36, (SubLObject)module0369.$ic338$);
        f25408(var36, (SubLObject)module0369.$ic338$);
        f25409(var36, (SubLObject)module0369.$ic338$);
        f25410(var36, (SubLObject)module0369.$ic338$);
        SubLObject var37 = f25480(var36);
        if (!var37.isLock()) {
            var37 = (SubLObject)module0369.NIL;
        }
        if (module0369.NIL != var37) {
            final SubLObject var101_102 = var37;
            SubLObject var38 = (SubLObject)module0369.NIL;
            try {
                var38 = Locks.seize_lock(var101_102);
                f25411(var36, (SubLObject)module0369.$ic338$);
            }
            finally {
                if (module0369.NIL != var38) {
                    Locks.release_lock(var101_102);
                }
            }
        }
        else {
            f25411(var36, (SubLObject)module0369.$ic338$);
        }
        f25412(var36, (SubLObject)module0369.$ic338$);
        f25413(var36, (SubLObject)module0369.$ic338$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25472(final SubLObject var14) {
        f25447(var14, (SubLObject)module0369.$ic273$);
        return var14;
    }
    
    public static SubLObject f25422(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25276(var14);
    }
    
    public static SubLObject f25421(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25277(var14);
    }
    
    public static SubLObject f25481(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25278(var14);
    }
    
    public static SubLObject f25424(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25279(var14);
    }
    
    public static SubLObject f25423(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25280(var14);
    }
    
    public static SubLObject f25482(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25281(var14);
    }
    
    public static SubLObject f25483(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25282(var14);
    }
    
    public static SubLObject f25484(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25283(var14);
    }
    
    public static SubLObject f25485(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25284(var14);
    }
    
    public static SubLObject f25486(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25285(var14);
    }
    
    public static SubLObject f25487(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25286(var14);
    }
    
    public static SubLObject f25488(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25287(var14);
    }
    
    public static SubLObject f25489(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25288(var14);
    }
    
    public static SubLObject f25490(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25289(var14);
    }
    
    public static SubLObject f25491(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25290(var14);
    }
    
    public static SubLObject f25492(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25291(var14);
    }
    
    public static SubLObject f25493(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25292(var14);
    }
    
    public static SubLObject f25494(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25293(var14);
    }
    
    public static SubLObject f25495(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25294(var14);
    }
    
    public static SubLObject f25420(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25295(var14);
    }
    
    public static SubLObject f25433(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25296(var14);
    }
    
    public static SubLObject f25474(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25297(var14);
    }
    
    public static SubLObject f25496(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25298(var14);
    }
    
    public static SubLObject f25473(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25299(var14);
    }
    
    public static SubLObject f25497(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25300(var14);
    }
    
    public static SubLObject f25498(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25301(var14);
    }
    
    public static SubLObject f25499(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25302(var14);
    }
    
    public static SubLObject f25500(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25318(var14);
    }
    
    public static SubLObject f25501(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25319(var14);
    }
    
    public static SubLObject f25502(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25320(var14);
    }
    
    public static SubLObject f25503(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25303(var14);
    }
    
    public static SubLObject f25504(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25304(var14);
    }
    
    public static SubLObject f25505(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25305(var14);
    }
    
    public static SubLObject f25506(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25306(var14);
    }
    
    public static SubLObject f25507(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25307(var14);
    }
    
    public static SubLObject f25508(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25308(var14);
    }
    
    public static SubLObject f25509(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25309(var14);
    }
    
    public static SubLObject f25510(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25310(var14);
    }
    
    public static SubLObject f25511(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25311(var14);
    }
    
    public static SubLObject f25512(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25312(var14);
    }
    
    public static SubLObject f25513(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25313(var14);
    }
    
    public static SubLObject f25514(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25314(var14);
    }
    
    public static SubLObject f25432(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25315(var14);
    }
    
    public static SubLObject f25515(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25316(var14);
    }
    
    public static SubLObject f25516(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25317(var14);
    }
    
    public static SubLObject f25517(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25322(var14);
    }
    
    public static SubLObject f25518(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25323(var14);
    }
    
    public static SubLObject f25519(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25324(var14);
    }
    
    public static SubLObject f25520(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25325(var14);
    }
    
    public static SubLObject f25521(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25321(var14);
    }
    
    public static SubLObject f25522(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25326(var14);
    }
    
    public static SubLObject f25523(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25327(var14);
    }
    
    public static SubLObject f25524(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25328(var14);
    }
    
    public static SubLObject f25525(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25329(var14);
    }
    
    public static SubLObject f25526(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25330(var14);
    }
    
    public static SubLObject f25527(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25331(var14);
    }
    
    public static SubLObject f25528(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25332(var14);
    }
    
    public static SubLObject f25529(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25333(var14);
    }
    
    public static SubLObject f25530(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25334(var14);
    }
    
    public static SubLObject f25531(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25335(var14);
    }
    
    public static SubLObject f25532(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25336(var14);
    }
    
    public static SubLObject f25533(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25337(var14);
    }
    
    public static SubLObject f25534(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25342(var14);
    }
    
    public static SubLObject f25535(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25338(var14);
    }
    
    public static SubLObject f25536(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25340(var14);
    }
    
    public static SubLObject f25537(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25341(var14);
    }
    
    public static SubLObject f25538(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25343(var14);
    }
    
    public static SubLObject f25539(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return f25344(var14);
    }
    
    public static SubLObject f25540(final SubLObject var14, final SubLObject var104) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var104 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0368.f25251(var104)) {
            throw new AssertionError(var104);
        }
        f25347(var14, var104);
        return var14;
    }
    
    public static SubLObject f25541(final SubLObject var14, final SubLObject var105) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var105 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0161.f10479(var105)) {
            throw new AssertionError(var105);
        }
        f25348(var14, var105);
        return var14;
    }
    
    public static SubLObject f25542(final SubLObject var14, final SubLObject var106) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var106 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0202.f12663(var106)) {
            throw new AssertionError(var106);
        }
        f25349(var14, var106);
        return var14;
    }
    
    public static SubLObject f25543(final SubLObject var14, final SubLObject var106) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var106 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0202.f12663(var106)) {
            throw new AssertionError(var106);
        }
        f25350(var14, var106);
        return var14;
    }
    
    public static SubLObject f25544(final SubLObject var14, final SubLObject var107) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var107 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0360.f23784(var107)) {
            throw new AssertionError(var107);
        }
        f25351(var14, var107);
        return var14;
    }
    
    public static SubLObject f25545(final SubLObject var14, final SubLObject var105) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var105 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0161.f10481(var105)) {
            throw new AssertionError(var105);
        }
        f25352(var14, var105);
        return var14;
    }
    
    public static SubLObject f25546(final SubLObject var14, final SubLObject var106) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var106 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0202.f12663(var106)) {
            throw new AssertionError(var106);
        }
        f25353(var14, var106);
        return var14;
    }
    
    public static SubLObject f25547(final SubLObject var14, final SubLObject var108) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0233.f15350(var108) : var108;
        f25354(var14, var108);
        return var14;
    }
    
    public static SubLObject f25548(final SubLObject var14, final SubLObject var109) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0362.f24446(var109) : var109;
        f25355(var14, var109);
        return var14;
    }
    
    public static SubLObject f25549(final SubLObject var14, final SubLObject var110) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0362.f24447(var110) : var110;
        f25356(var14, var110);
        return var14;
    }
    
    public static SubLObject f25550(final SubLObject var14, final SubLObject var111) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0362.f24448(var111) : var111;
        f25357(var14, var111);
        return var14;
    }
    
    public static SubLObject f25551(final SubLObject var14, final SubLObject var112) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.listp(var112) : var112;
        f25358(var14, var112);
        return var14;
    }
    
    public static SubLObject f25552(final SubLObject var14, final SubLObject var113) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var113 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0233.f15350(var113)) {
            throw new AssertionError(var113);
        }
        f25359(var14, var113);
        return var14;
    }
    
    public static SubLObject f25447(final SubLObject var14, final SubLObject var16) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23869(var16) : var16;
        f25364(var14, var16);
        if (module0369.NIL == module0360.f23873(var16)) {
            f25365(var14, (SubLObject)module0369.NIL);
        }
        f25553(var14);
        return var14;
    }
    
    public static SubLObject f25554(final SubLObject var14, final SubLObject var17) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23865(var17) : var17;
        f25365(var14, var17);
        return var14;
    }
    
    public static SubLObject f25555(final SubLObject var14, final SubLObject var99) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0374.f26529(var99) : var99;
        f25366(var14, var99);
        return var14;
    }
    
    public static SubLObject f25556(final SubLObject var14, final SubLObject var114) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var114 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == Types.processp(var114)) {
            throw new AssertionError(var114);
        }
        f25369(var14, var114);
        return var14;
    }
    
    public static SubLObject f25557(final SubLObject var14, final SubLObject var15) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0004.f106(var15) : var15;
        f25371(var14, var15);
        return var14;
    }
    
    public static SubLObject f25450(final SubLObject var14, final SubLObject var115) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23968(var115) : var115;
        f25372(var14, var115);
        return var14;
    }
    
    public static SubLObject f25558(final SubLObject var14, final SubLObject var116) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23966(var116) : var116;
        f25373(var14, var116);
        return var14;
    }
    
    public static SubLObject f25559(final SubLObject var14, final SubLObject var117) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.booleanp(var117) : var117;
        f25374(var14, var117);
        return var14;
    }
    
    public static SubLObject f25560(final SubLObject var14, final SubLObject var117) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.booleanp(var117) : var117;
        f25375(var14, var117);
        return var14;
    }
    
    public static SubLObject f25561(final SubLObject var14, final SubLObject var117) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.booleanp(var117) : var117;
        f25376(var14, var117);
        return var14;
    }
    
    public static SubLObject f25562(final SubLObject var14, final SubLObject var117) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.booleanp(var117) : var117;
        f25377(var14, var117);
        return var14;
    }
    
    public static SubLObject f25563(final SubLObject var14, final SubLObject var118) {
        assert module0369.NIL != f25275(var14) : var14;
        f25378(var14, var118);
        return var14;
    }
    
    public static SubLObject f25564(final SubLObject var14, final SubLObject var119) {
        assert module0369.NIL != f25275(var14) : var14;
        f25379(var14, var119);
        return var14;
    }
    
    public static SubLObject f25565(final SubLObject var14, final SubLObject var120) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0340.f22779(var120) : var120;
        f25380(var14, var120);
        return var14;
    }
    
    public static SubLObject f25566(final SubLObject var14, final SubLObject var117) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.booleanp(var117) : var117;
        f25381(var14, var117);
        return var14;
    }
    
    public static SubLObject f25567(final SubLObject var14, final SubLObject var121) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23970(var121) : var121;
        f25382(var14, var121);
        return var14;
    }
    
    public static SubLObject f25568(final SubLObject var14, final SubLObject var122) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.booleanp(var122) : var122;
        f25383(var14, var122);
        return var14;
    }
    
    public static SubLObject f25452(final SubLObject var14, final SubLObject var123) {
        assert module0369.NIL != Types.booleanp(var123) : var123;
        f25384(var14, var123);
        return var14;
    }
    
    public static SubLObject f25453(final SubLObject var14, final SubLObject var124) {
        assert module0369.NIL != Types.booleanp(var124) : var124;
        f25385(var14, var124);
        return var14;
    }
    
    public static SubLObject f25569(final SubLObject var14, final SubLObject var125) {
        assert module0369.NIL != module0360.f23963(var125) : var125;
        f25386(var14, var125);
        return var14;
    }
    
    public static SubLObject f25449(final SubLObject var14, final SubLObject var126) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23964(var126) : var126;
        f25387(var14, var126);
        return var14;
    }
    
    public static SubLObject f25451(final SubLObject var14, final SubLObject var127) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.booleanp(var127) : var127;
        f25388(var14, var127);
        return var14;
    }
    
    public static SubLObject f25570(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        f25389(var14, (SubLObject)module0369.T);
        return var14;
    }
    
    public static SubLObject f25467(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        f25389(var14, (SubLObject)module0369.NIL);
        return var14;
    }
    
    public static SubLObject f25454(final SubLObject var14, final SubLObject var128) {
        if (module0369.NIL != var128 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0004.f106(var128)) {
            throw new AssertionError(var128);
        }
        f25390(var14, var128);
        return var14;
    }
    
    public static SubLObject f25455(final SubLObject var14, final SubLObject var129) {
        if (module0369.NIL != var129 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0048.f3294(var129)) {
            throw new AssertionError(var129);
        }
        f25391(var14, var129);
        return var14;
    }
    
    public static SubLObject f25456(final SubLObject var14, final SubLObject var130) {
        if (module0369.NIL != var130 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0004.f106(var130)) {
            throw new AssertionError(var130);
        }
        f25392(var14, var130);
        return var14;
    }
    
    public static SubLObject f25457(final SubLObject var14, final SubLObject var131) {
        assert module0369.NIL != module0360.f23905(var131) : var131;
        f25393(var14, var131);
        return var14;
    }
    
    public static SubLObject f25458(final SubLObject var14, final SubLObject var132) {
        if (module0369.NIL != var132 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0048.f3294(var132)) {
            throw new AssertionError(var132);
        }
        final SubLObject var133 = f25517(var14);
        if (var133.isInteger() && var132.isInteger() && var133.numL(var132)) {
            Errors.error((SubLObject)module0369.$ic365$, var132, var133);
        }
        f25394(var14, var132);
        return var14;
    }
    
    public static SubLObject f25462(final SubLObject var14, final SubLObject var133) {
        if (module0369.NIL != var133 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0004.f106(var133)) {
            throw new AssertionError(var133);
        }
        f25395(var14, var133);
        return var14;
    }
    
    public static SubLObject f25463(final SubLObject var14, final SubLObject var134) {
        if (module0369.NIL != var134 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0004.f106(var134)) {
            throw new AssertionError(var134);
        }
        f25396(var14, var134);
        return var14;
    }
    
    public static SubLObject f25464(final SubLObject var14, final SubLObject var135) {
        assert module0369.NIL != module0414.f28915(var135) : var135;
        f25397(var14, var135);
        return var14;
    }
    
    public static SubLObject f25465(final SubLObject var14, final SubLObject var136) {
        assert module0369.NIL != module0048.f3442(var136) : var136;
        f25398(var14, var136);
        return var14;
    }
    
    public static SubLObject f25466(final SubLObject var14, final SubLObject var137) {
        assert module0369.NIL != module0035.f2015(var137) : var137;
        SubLObject var138 = var137;
        SubLObject var139 = (SubLObject)module0369.NIL;
        var139 = var138.first();
        while (module0369.NIL != var138) {
            assert module0369.NIL != module0360.f23809(var139) : var139;
            var138 = var138.rest();
            var139 = var138.first();
        }
        f25399(var14, var137);
        return var14;
    }
    
    public static SubLObject f25571(final SubLObject var14, final SubLObject var140) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0051.f3549(var140) : var140;
        f25400(var14, var140);
        return var14;
    }
    
    public static SubLObject f25572(final SubLObject var14, final SubLObject var141) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0004.f106(var141) : var141;
        f25401(var14, var141);
        return var14;
    }
    
    public static SubLObject f25573(final SubLObject var14, final SubLObject var142) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var142 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0004.f106(var142)) {
            throw new AssertionError(var142);
        }
        f25402(var14, var142);
        return var14;
    }
    
    public static SubLObject f25574(final SubLObject var14, final SubLObject var143) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != var143 && !module0369.areAssertionsDisabledFor(me) && module0369.NIL == module0048.f3355(var143)) {
            throw new AssertionError(var143);
        }
        f25403(var14, var143);
        return var14;
    }
    
    public static SubLObject f25459(final SubLObject var14, final SubLObject var144) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.numberp(var144) : var144;
        f25404(var14, var144);
        return var14;
    }
    
    public static SubLObject f25460(final SubLObject var14, final SubLObject var145) {
        assert module0369.NIL != module0004.f106(var145) : var145;
        f25405(var14, var145);
        return var14;
    }
    
    public static SubLObject f25575(final SubLObject var14) {
        f25405(var14, Numbers.add(f25336(var14), (SubLObject)module0369.ONE_INTEGER));
        return var14;
    }
    
    public static SubLObject f25461(final SubLObject var14, final SubLObject var146) {
        assert module0369.NIL != module0004.f106(var146) : var146;
        f25406(var14, var146);
        return var14;
    }
    
    public static SubLObject f25576(final SubLObject var14) {
        f25406(var14, Numbers.add(f25337(var14), (SubLObject)module0369.ONE_INTEGER));
        return var14;
    }
    
    public static SubLObject f25577(final SubLObject var14, final SubLObject var147) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.listp(var147) : var147;
        f25411(var14, var147);
        return var14;
    }
    
    public static SubLObject f25578(final SubLObject var14, final SubLObject var148) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0035.f2015(var148) : var148;
        SubLObject var149 = var148;
        SubLObject var150 = (SubLObject)module0369.NIL;
        var150 = var149.first();
        while (module0369.NIL != var149) {
            assert module0369.NIL != module0360.f23974(var150) : var150;
            var149 = var149.rest();
            var150 = var149.first();
        }
        f25407(var14, var148);
        return var14;
    }
    
    public static SubLObject f25579(final SubLObject var14, final SubLObject var149) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0035.f2015(var149) : var149;
        SubLObject var150 = var149;
        SubLObject var151 = (SubLObject)module0369.NIL;
        var151 = var150.first();
        while (module0369.NIL != var150) {
            assert module0369.NIL != module0360.f23976(var151) : var151;
            var150 = var150.rest();
            var151 = var150.first();
        }
        f25408(var14, var149);
        return var14;
    }
    
    public static SubLObject f25580(final SubLObject var14, final SubLObject var150) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != f25272(var150) : var150;
        f25412(var14, var150);
        return var14;
    }
    
    public static SubLObject f25581(final SubLObject var14, final SubLObject var147) {
        assert module0369.NIL != f25275(var14) : var14;
        f25413(var14, var147);
        return var14;
    }
    
    public static SubLObject f25582(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return (SubLObject)ConsesLow.list(f25583(var14), f25422(var14));
    }
    
    public static SubLObject f25584(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic376$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        SubLObject var25 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic376$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic376$);
        var24 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic376$);
        var25 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var26;
            var21 = (var26 = var22);
            final SubLObject var27 = (SubLObject)module0369.$ic377$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, var25), (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic378$, var27)), (SubLObject)ConsesLow.list(var24, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic379$, var27))), ConsesLow.append(var26, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic376$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25583(final SubLObject var14) {
        return module0361.f23996(f25421(var14));
    }
    
    public static SubLObject f25470() {
        SubLObject var88 = (SubLObject)module0369.NIL;
        final SubLObject var89 = module0361.f24002();
        if (module0369.NIL == module0065.f4772(var89, (SubLObject)module0369.$ic380$)) {
            final SubLObject var158_159 = var89;
            if (module0369.NIL == module0065.f4775(var158_159, (SubLObject)module0369.$ic380$)) {
                final SubLObject var90 = module0065.f4740(var158_159);
                final SubLObject var91 = (SubLObject)module0369.NIL;
                SubLObject var92;
                SubLObject var93;
                SubLObject var94;
                SubLObject var95;
                SubLObject var157_165;
                SubLObject var158_160;
                SubLObject var160_167;
                SubLObject var161_168;
                SubLObject var162_169;
                SubLObject var163_170;
                SubLObject var171_172;
                SubLObject var96;
                SubLObject var173_174;
                SubLObject var97;
                SubLObject var171_173;
                SubLObject var98;
                Iterator var99;
                Map.Entry var100;
                for (var92 = Sequences.length(var90), var93 = (SubLObject)module0369.NIL, var93 = (SubLObject)module0369.ZERO_INTEGER; var93.numL(var92); var93 = Numbers.add(var93, (SubLObject)module0369.ONE_INTEGER)) {
                    var94 = ((module0369.NIL != var91) ? Numbers.subtract(var92, var93, (SubLObject)module0369.ONE_INTEGER) : var93);
                    var95 = Vectors.aref(var90, var94);
                    if (module0369.NIL == module0065.f4749(var95) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                        if (module0369.NIL != module0065.f4749(var95)) {
                            var95 = (SubLObject)module0369.$ic380$;
                        }
                        var157_165 = module0361.f24123(var95);
                        if (module0369.NIL == module0065.f4772(var157_165, (SubLObject)module0369.$ic380$)) {
                            var158_160 = var157_165;
                            if (module0369.NIL == module0065.f4775(var158_160, (SubLObject)module0369.$ic380$)) {
                                var160_167 = module0065.f4740(var158_160);
                                var161_168 = (SubLObject)module0369.NIL;
                                for (var162_169 = Sequences.length(var160_167), var163_170 = (SubLObject)module0369.NIL, var163_170 = (SubLObject)module0369.ZERO_INTEGER; var163_170.numL(var162_169); var163_170 = Numbers.add(var163_170, (SubLObject)module0369.ONE_INTEGER)) {
                                    var171_172 = ((module0369.NIL != var161_168) ? Numbers.subtract(var162_169, var163_170, (SubLObject)module0369.ONE_INTEGER) : var163_170);
                                    var96 = Vectors.aref(var160_167, var171_172);
                                    if (module0369.NIL == module0065.f4749(var96) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                                        if (module0369.NIL != module0065.f4749(var96)) {
                                            var96 = (SubLObject)module0369.$ic380$;
                                        }
                                        var88 = (SubLObject)ConsesLow.cons(var96, var88);
                                    }
                                }
                            }
                            var173_174 = var157_165;
                            if (module0369.NIL == module0065.f4777(var173_174)) {
                                var97 = module0065.f4738(var173_174);
                                var171_173 = (SubLObject)module0369.NIL;
                                var98 = (SubLObject)module0369.NIL;
                                var99 = Hashtables.getEntrySetIterator(var97);
                                try {
                                    while (Hashtables.iteratorHasNext(var99)) {
                                        var100 = Hashtables.iteratorNextEntry(var99);
                                        var171_173 = Hashtables.getEntryKey(var100);
                                        var98 = Hashtables.getEntryValue(var100);
                                        var88 = (SubLObject)ConsesLow.cons(var98, var88);
                                    }
                                }
                                finally {
                                    Hashtables.releaseEntrySetIterator(var99);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var173_175 = var89;
            if (module0369.NIL == module0065.f4777(var173_175)) {
                final SubLObject var101 = module0065.f4738(var173_175);
                SubLObject var102 = (SubLObject)module0369.NIL;
                SubLObject var103 = (SubLObject)module0369.NIL;
                final Iterator var104 = Hashtables.getEntrySetIterator(var101);
                try {
                    while (Hashtables.iteratorHasNext(var104)) {
                        final Map.Entry var105 = Hashtables.iteratorNextEntry(var104);
                        var102 = Hashtables.getEntryKey(var105);
                        var103 = Hashtables.getEntryValue(var105);
                        final SubLObject var157_166 = module0361.f24123(var103);
                        if (module0369.NIL == module0065.f4772(var157_166, (SubLObject)module0369.$ic380$)) {
                            final SubLObject var158_161 = var157_166;
                            if (module0369.NIL == module0065.f4775(var158_161, (SubLObject)module0369.$ic380$)) {
                                final SubLObject var106 = module0065.f4740(var158_161);
                                final SubLObject var107 = (SubLObject)module0369.NIL;
                                SubLObject var108;
                                SubLObject var109;
                                SubLObject var171_174;
                                SubLObject var110;
                                for (var108 = Sequences.length(var106), var109 = (SubLObject)module0369.NIL, var109 = (SubLObject)module0369.ZERO_INTEGER; var109.numL(var108); var109 = Numbers.add(var109, (SubLObject)module0369.ONE_INTEGER)) {
                                    var171_174 = ((module0369.NIL != var107) ? Numbers.subtract(var108, var109, (SubLObject)module0369.ONE_INTEGER) : var109);
                                    var110 = Vectors.aref(var106, var171_174);
                                    if (module0369.NIL == module0065.f4749(var110) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                                        if (module0369.NIL != module0065.f4749(var110)) {
                                            var110 = (SubLObject)module0369.$ic380$;
                                        }
                                        var88 = (SubLObject)ConsesLow.cons(var110, var88);
                                    }
                                }
                            }
                            final SubLObject var173_176 = var157_166;
                            if (module0369.NIL != module0065.f4777(var173_176)) {
                                continue;
                            }
                            final SubLObject var175_184 = module0065.f4738(var173_176);
                            SubLObject var171_175 = (SubLObject)module0369.NIL;
                            SubLObject var111 = (SubLObject)module0369.NIL;
                            final Iterator var177_186 = Hashtables.getEntrySetIterator(var175_184);
                            try {
                                while (Hashtables.iteratorHasNext(var177_186)) {
                                    final Map.Entry var178_187 = Hashtables.iteratorNextEntry(var177_186);
                                    var171_175 = Hashtables.getEntryKey(var178_187);
                                    var111 = Hashtables.getEntryValue(var178_187);
                                    var88 = (SubLObject)ConsesLow.cons(var111, var88);
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var177_186);
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var104);
                }
            }
        }
        return Sequences.nreverse(var88);
    }
    
    public static SubLObject f25585() {
        return module0035.delete_if_not((SubLObject)module0369.$ic381$, f25470(), (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED);
    }
    
    public static SubLObject f25586(final SubLObject var14) {
        return module0077.f5312(f25473(var14));
    }
    
    public static SubLObject f25587(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        final SubLObject var15 = f25487(var14);
        SubLObject var16 = (SubLObject)module0369.NIL;
        SubLObject var17 = var15;
        SubLObject var18 = (SubLObject)module0369.NIL;
        var18 = var17.first();
        while (module0369.NIL != var17) {
            SubLObject var19 = (SubLObject)module0369.$ic382$;
            SubLObject var20 = (SubLObject)module0369.ZERO_INTEGER;
            SubLObject var89_192 = module0232.f15306(var18);
            SubLObject var21 = (SubLObject)module0369.NIL;
            var21 = var89_192.first();
            while (module0369.NIL != var89_192) {
                SubLObject var23;
                final SubLObject var22 = var23 = var21;
                SubLObject var24 = (SubLObject)module0369.NIL;
                SubLObject var25 = (SubLObject)module0369.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0369.$ic383$);
                var24 = var23.first();
                var23 = var23.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)module0369.$ic383$);
                var25 = var23.first();
                var23 = var23.rest();
                if (module0369.NIL == var23) {
                    final SubLObject var26 = var24;
                    if (module0369.NIL == conses_high.member(var26, var16, (SubLObject)module0369.$ic384$, Symbols.symbol_function((SubLObject)module0369.IDENTITY))) {
                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)module0369.$ic383$);
                }
                var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER);
                var89_192 = var89_192.rest();
                var21 = var89_192.first();
            }
            var19 = (SubLObject)module0369.$ic385$;
            var20 = (SubLObject)module0369.ZERO_INTEGER;
            SubLObject var89_193 = module0232.f15308(var18);
            var21 = (SubLObject)module0369.NIL;
            var21 = var89_193.first();
            while (module0369.NIL != var89_193) {
                SubLObject var28;
                final SubLObject var27 = var28 = var21;
                SubLObject var24 = (SubLObject)module0369.NIL;
                SubLObject var25 = (SubLObject)module0369.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0369.$ic383$);
                var24 = var28.first();
                var28 = var28.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0369.$ic383$);
                var25 = var28.first();
                var28 = var28.rest();
                if (module0369.NIL == var28) {
                    final SubLObject var26 = var24;
                    if (module0369.NIL == conses_high.member(var26, var16, (SubLObject)module0369.$ic384$, Symbols.symbol_function((SubLObject)module0369.IDENTITY))) {
                        var16 = (SubLObject)ConsesLow.cons(var26, var16);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0369.$ic383$);
                }
                var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER);
                var89_193 = var89_193.rest();
                var21 = var89_193.first();
            }
            var17 = var17.rest();
            var18 = var17.first();
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f25588(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        final SubLObject var15 = f25487(var14);
        SubLObject var16;
        SubLObject var17;
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        SubLObject var21;
        SubLObject var22;
        SubLObject var24;
        SubLObject var23;
        SubLObject var25;
        SubLObject var26;
        SubLObject var28;
        SubLObject var27;
        for (var16 = (SubLObject)module0369.NIL, var17 = (SubLObject)module0369.NIL, var17 = var15; module0369.NIL == var16 && module0369.NIL != var17; var17 = var17.rest()) {
            var18 = var17.first();
            var19 = (SubLObject)module0369.$ic382$;
            var20 = (SubLObject)module0369.ZERO_INTEGER;
            var21 = module0232.f15306(var18);
            var22 = (SubLObject)module0369.NIL;
            var22 = var21.first();
            while (module0369.NIL != var21) {
                var23 = (var24 = var22);
                var25 = (SubLObject)module0369.NIL;
                var26 = (SubLObject)module0369.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0369.$ic386$);
                var25 = var24.first();
                var24 = var24.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var24, var23, (SubLObject)module0369.$ic386$);
                var26 = var24.first();
                var24 = var24.rest();
                if (module0369.NIL == var24) {
                    var16 = var25;
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var23, (SubLObject)module0369.$ic386$);
                }
                var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER);
                var21 = var21.rest();
                var22 = var21.first();
            }
            var19 = (SubLObject)module0369.$ic385$;
            var20 = (SubLObject)module0369.ZERO_INTEGER;
            var21 = module0232.f15308(var18);
            var22 = (SubLObject)module0369.NIL;
            var22 = var21.first();
            while (module0369.NIL != var21) {
                var27 = (var28 = var22);
                var25 = (SubLObject)module0369.NIL;
                var26 = (SubLObject)module0369.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0369.$ic386$);
                var25 = var28.first();
                var28 = var28.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)module0369.$ic386$);
                var26 = var28.first();
                var28 = var28.rest();
                if (module0369.NIL == var28) {
                    var16 = var25;
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)module0369.$ic386$);
                }
                var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER);
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        return var16;
    }
    
    public static SubLObject f25589(final SubLObject var14) {
        return Types.sublisp_null(f25490(var14));
    }
    
    public static SubLObject f25590(final SubLObject var14) {
        final SubLObject var15 = f25486(var14);
        final SubLObject var16 = f25490(var14);
        return module0233.f15376(var15, var16);
    }
    
    public static SubLObject f25591(final SubLObject var14, final SubLObject var208, SubLObject var209) {
        if (var209 == module0369.UNPROVIDED) {
            var209 = (SubLObject)module0369.NIL;
        }
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23781(var208) : var208;
        return conses_high.getf(f25282(var14), var208, var209);
    }
    
    public static SubLObject f25592(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        SubLObject var15 = f25423(var14);
        if (module0369.NIL == var15) {
            var15 = module0205.f13144(module0370.f25912(f25487(var14), (SubLObject)module0369.UNPROVIDED));
        }
        return Values.values(var15, f25424(var14), module0360.f23987(var14));
    }
    
    public static SubLObject f25593(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        final SubLObject var16 = f25592(var14);
        final SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic388$, module0035.f2241(var16), ConsesLow.append((SubLObject)((module0369.NIL != var17 || module0369.NIL != var18) ? ConsesLow.list(module0035.f2241(var17)) : module0369.NIL), (SubLObject)((module0369.NIL != var18) ? ConsesLow.list(module0035.f2241(var18)) : module0369.NIL), (SubLObject)module0369.NIL));
    }
    
    public static SubLObject f25594(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        var15.resetMultipleValues();
        SubLObject var16 = f25592(var14);
        SubLObject var17 = var15.secondMultipleValue();
        final SubLObject var18 = var15.thirdMultipleValue();
        var15.resetMultipleValues();
        var16 = module0205.f13144(var16);
        var17 = module0205.f13144(var17);
        return f25595(var16, var17, var18);
    }
    
    public static SubLObject f25595(final SubLObject var210, final SubLObject var105, final SubLObject var107) {
        final SubLThread var211 = SubLProcess.currentSubLThread();
        SubLObject var212 = (SubLObject)module0369.NIL;
        SubLObject var213 = (SubLObject)module0369.NIL;
        try {
            var213 = streams_high.make_private_string_output_stream();
            final SubLObject var214 = module0194.f12113(var210, (SubLObject)module0369.ONE_INTEGER);
            Strings.set_char(var214, (SubLObject)module0369.TWO_INTEGER, (SubLObject)Characters.CHAR_quote);
            PrintLow.format(var213, (SubLObject)module0369.$ic389$, var214);
            if (module0369.NIL != var105 || module0369.NIL != var107) {
                final SubLObject var215 = module0194.f12113(var105, (SubLObject)module0369.ONE_INTEGER);
                if (var105.isAtom()) {
                    PrintLow.format(var213, (SubLObject)module0369.$ic390$, var215);
                }
                else {
                    Strings.set_char(var215, (SubLObject)module0369.TWO_INTEGER, (SubLObject)Characters.CHAR_quote);
                    PrintLow.format(var213, (SubLObject)module0369.$ic391$, var215);
                }
            }
            if (module0369.NIL != var107) {
                PrintLow.format(var213, (SubLObject)module0369.$ic392$);
                final SubLObject var216 = print_high.$print_case$.currentBinding(var211);
                try {
                    print_high.$print_case$.bind((SubLObject)module0369.$ic393$, var211);
                    SubLObject var217;
                    SubLObject var218;
                    SubLObject var219;
                    SubLObject var220;
                    SubLObject var221;
                    for (var217 = (SubLObject)module0369.NIL, var217 = var107; module0369.NIL != var217; var217 = conses_high.cddr(var217)) {
                        var218 = var217.first();
                        var219 = conses_high.cadr(var217);
                        if (var218 == module0369.$ic199$) {
                            PrintLow.format(var213, (SubLObject)module0369.$ic394$, var218, module0361.f23996(var219));
                        }
                        else if (var218 == module0369.$ic231$ && var219 != module0369.$ic395$) {
                            PrintLow.format(var213, (SubLObject)module0369.$ic396$, var218);
                            var220 = var219;
                            var221 = (SubLObject)module0369.NIL;
                            var221 = var220.first();
                            while (module0369.NIL != var220) {
                                PrintLow.format(var213, (SubLObject)module0369.$ic397$, module0213.f13920(var221));
                                var220 = var220.rest();
                                var221 = var220.first();
                            }
                            PrintLow.format(var213, (SubLObject)module0369.$ic398$);
                        }
                        else if (module0369.NIL != module0035.f2239(var219)) {
                            PrintLow.format(var213, (SubLObject)module0369.$ic399$, var218, var219);
                        }
                        else {
                            PrintLow.format(var213, (SubLObject)module0369.$ic399$, var218, module0035.f2241(var219));
                        }
                    }
                }
                finally {
                    print_high.$print_case$.rebind(var216, var211);
                }
                PrintLow.format(var213, (SubLObject)module0369.$ic400$);
            }
            PrintLow.format(var213, (SubLObject)module0369.$ic400$);
            var212 = streams_high.get_output_stream_string(var213);
        }
        finally {
            final SubLObject var222 = Threads.$is_thread_performing_cleanupP$.currentBinding(var211);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0369.T, var211);
                streams_high.close(var213, (SubLObject)module0369.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var222, var211);
            }
        }
        return var212;
    }
    
    public static SubLObject f25596(final SubLObject var14) {
        final SubLObject var15 = f25474(var14);
        if (module0369.NIL != var15) {
            return module0374.f26535(var15);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25597(final SubLObject var14) {
        final SubLObject var15 = f25596(var14);
        if (module0369.NIL != var15) {
            return module0364.f24736(var15);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25598(final SubLObject var14) {
        return Equality.eq((SubLObject)module0369.$ic401$, f25504(var14));
    }
    
    public static SubLObject f25599(final SubLObject var14) {
        return Equality.eq((SubLObject)module0369.$ic402$, f25504(var14));
    }
    
    public static SubLObject f25600(final SubLObject var14) {
        return module0361.f24173(f25421(var14));
    }
    
    public static SubLObject f25601(final SubLObject var14) {
        return module0035.sublisp_boolean(f25526(var14));
    }
    
    public static SubLObject f25602(final SubLObject var14, final SubLObject var217) {
        return module0035.f2169(var217, f25526(var14));
    }
    
    public static SubLObject f25603(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25514(var14) && module0369.NIL == f25432(var14));
    }
    
    public static SubLObject f25604(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL == f25517(var14) && module0369.NIL == f25518(var14) && module0369.NIL == f25521(var14) && (module0369.NIL == f25605(var14) || module0369.NIL == module0367.f25089(f25606(var14)) || module0369.NIL == f25589(var14)));
    }
    
    public static SubLObject f25607(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.$ic395$ == f25509(var14) && module0369.$ic403$ == f25510(var14));
    }
    
    public static SubLObject f25608(final SubLObject var14, final SubLObject var218) {
        if (module0369.NIL != f25607(var14)) {
            return (SubLObject)module0369.T;
        }
        if (module0369.$ic403$ == f25510(var14)) {
            return module0077.f5320(var218, f25509(var14));
        }
        if (module0369.$ic395$ == f25509(var14)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL == module0077.f5320(var218, f25510(var14)));
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25609(final SubLObject var14, final SubLObject var219) {
        if (module0369.NIL != f25607(var14)) {
            return var219;
        }
        final SubLObject var220 = f25610(var14);
        final SubLObject var221 = f25611(var14);
        SubLObject var222 = (SubLObject)module0369.NIL;
        if (module0369.$ic403$ == var221) {
            var222 = module0076.f5290(var219, var220, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED);
        }
        else if (module0369.$ic395$ == var220) {
            var222 = module0035.f2220(var219, var221, (SubLObject)module0369.UNPROVIDED);
        }
        else {
            var222 = module0076.f5290(var219, var220, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED);
            var222 = module0035.f2220(var222, var221, (SubLObject)module0369.UNPROVIDED);
        }
        return var222;
    }
    
    public static SubLObject f25612(final SubLObject var14) {
        return Equality.eq((SubLObject)module0369.$ic395$, f25511(var14));
    }
    
    public static SubLObject f25613(final SubLObject var14, final SubLObject var223) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25612(var14) || module0369.NIL != module0340.f22788(var223, f25511(var14)));
    }
    
    public static SubLObject f25614(final SubLObject var14) {
        return module0360.f23979(f25483(var14));
    }
    
    public static SubLObject f25615(final SubLObject var14) {
        final SubLObject var15 = f25492(var14);
        return Numbers.plusp(module0065.f4733(var15));
    }
    
    public static SubLObject f25616(final SubLObject var14, final SubLObject var35) {
        assert module0369.NIL != module0004.f106(var35) : var35;
        final SubLObject var36 = f25492(var14);
        return module0065.f4750(var36, var35, (SubLObject)module0369.UNPROVIDED);
    }
    
    public static SubLObject f25617(final SubLObject var225, final SubLObject var226, final SubLObject var227) {
        final SubLObject var228 = module0361.f24195(var225, var226);
        if (module0369.NIL != var228) {
            final SubLObject var229 = f25616(var228, var227);
            return var229;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25618(final SubLObject var14) {
        return f25619(var14, (SubLObject)module0369.ZERO_INTEGER);
    }
    
    public static SubLObject f25620(final SubLObject var14) {
        final SubLObject var15 = f25621(var14);
        SubLObject var16 = (SubLObject)module0369.NIL;
        if (module0369.NIL == var16) {
            SubLObject var17;
            SubLObject var18;
            for (var17 = (SubLObject)module0369.MINUS_ONE_INTEGER, var18 = (SubLObject)module0369.NIL, var18 = module0048.f_1_(var15); module0369.NIL == var16 && !var18.numLE(var17); var16 = f25616(var14, var18), var18 = Numbers.add(var18, (SubLObject)module0369.MINUS_ONE_INTEGER)) {}
        }
        return var16;
    }
    
    public static SubLObject f25619(final SubLObject var14, final SubLObject var230) {
        final SubLObject var231 = f25621(var14);
        SubLObject var232 = (SubLObject)module0369.NIL;
        if (module0369.NIL == var232) {
            SubLObject var233;
            SubLObject var234;
            for (var233 = var231, var234 = (SubLObject)module0369.NIL, var234 = var230; module0369.NIL == var232 && !var234.numGE(var233); var232 = f25616(var14, var234), var234 = module0048.f_1X(var234)) {}
        }
        return var232;
    }
    
    public static SubLObject f25622(final SubLObject var14) {
        final SubLObject var15 = f25618(var14);
        if (module0369.NIL != var15) {
            return f25623(var15, (SubLObject)module0369.NIL);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25624(final SubLObject var14) {
        final SubLObject var15 = f25618(var14);
        if (module0369.NIL != var15) {
            return f25625(var15);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25626(final SubLObject var14) {
        final SubLObject var15 = f25620(var14);
        if (module0369.NIL != var15) {
            return f25623(var15, (SubLObject)module0369.NIL);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25627(final SubLObject var14) {
        final SubLObject var15 = f25620(var14);
        if (module0369.NIL != var15) {
            return f25625(var15);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25628(final SubLObject var14) {
        final SubLObject var15 = f25620(var14);
        return (SubLObject)((module0369.NIL != var15) ? f25629(var15) : module0369.NIL);
    }
    
    public static SubLObject f25630(final SubLObject var14, final SubLObject var233) {
        final SubLObject var234 = module0051.f3570(var233);
        SubLObject var235 = (SubLObject)module0369.ZERO_INTEGER;
        final SubLObject var236 = f25492(var14);
        if (module0369.NIL == module0065.f4772(var236, (SubLObject)module0369.$ic380$)) {
            final SubLObject var158_236 = var236;
            if (module0369.NIL == module0065.f4775(var158_236, (SubLObject)module0369.$ic380$)) {
                final SubLObject var237 = module0065.f4740(var158_236);
                final SubLObject var238 = (SubLObject)module0369.NIL;
                SubLObject var239;
                SubLObject var240;
                SubLObject var241;
                SubLObject var242;
                for (var239 = Sequences.length(var237), var240 = (SubLObject)module0369.NIL, var240 = (SubLObject)module0369.ZERO_INTEGER; var240.numL(var239); var240 = Numbers.add(var240, (SubLObject)module0369.ONE_INTEGER)) {
                    var241 = ((module0369.NIL != var238) ? Numbers.subtract(var239, var240, (SubLObject)module0369.ONE_INTEGER) : var240);
                    var242 = Vectors.aref(var237, var241);
                    if (module0369.NIL == module0065.f4749(var242) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                        if (module0369.NIL != module0065.f4749(var242)) {
                            var242 = (SubLObject)module0369.$ic380$;
                        }
                        if (f25631(var242).numLE(var234)) {
                            var235 = Numbers.add(var235, (SubLObject)module0369.ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var173_238 = var236;
            if (module0369.NIL == module0065.f4777(var173_238)) {
                final SubLObject var243 = module0065.f4738(var173_238);
                SubLObject var244 = (SubLObject)module0369.NIL;
                SubLObject var245 = (SubLObject)module0369.NIL;
                final Iterator var246 = Hashtables.getEntrySetIterator(var243);
                try {
                    while (Hashtables.iteratorHasNext(var246)) {
                        final Map.Entry var247 = Hashtables.iteratorNextEntry(var246);
                        var244 = Hashtables.getEntryKey(var247);
                        var245 = Hashtables.getEntryValue(var247);
                        if (f25631(var245).numLE(var234)) {
                            var235 = Numbers.add(var235, (SubLObject)module0369.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var246);
                }
            }
        }
        return var235;
    }
    
    public static SubLObject f25632(final SubLObject var14) {
        return f25630(var14, (SubLObject)module0369.$ic17$);
    }
    
    public static SubLObject f25633(final SubLObject var14) {
        return f25630(var14, (SubLObject)module0369.$ic47$);
    }
    
    public static SubLObject f25634(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0369.NIL;
        final SubLObject var16 = f25492(var14);
        if (module0369.NIL == module0065.f4772(var16, (SubLObject)module0369.$ic380$)) {
            final SubLObject var158_240 = var16;
            if (module0369.NIL == module0065.f4775(var158_240, (SubLObject)module0369.$ic380$)) {
                final SubLObject var17 = module0065.f4740(var158_240);
                final SubLObject var18 = (SubLObject)module0369.NIL;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                for (var19 = Sequences.length(var17), var20 = (SubLObject)module0369.NIL, var20 = (SubLObject)module0369.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER)) {
                    var21 = ((module0369.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0369.ONE_INTEGER) : var20);
                    var22 = Vectors.aref(var17, var21);
                    if (module0369.NIL == module0065.f4749(var22) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                        if (module0369.NIL != module0065.f4749(var22)) {
                            var22 = (SubLObject)module0369.$ic380$;
                        }
                        var15 = (SubLObject)ConsesLow.cons(f25631(var22), var15);
                    }
                }
            }
            final SubLObject var241_242 = var16;
            if (module0369.NIL == module0065.f4777(var241_242) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                final SubLObject var23 = module0065.f4738(var241_242);
                SubLObject var24 = module0065.f4739(var241_242);
                final SubLObject var25 = module0065.f4734(var241_242);
                final SubLObject var26 = (SubLObject)((module0369.NIL != module0065.f4773((SubLObject)module0369.$ic380$)) ? module0369.NIL : module0369.$ic380$);
                while (var24.numL(var25)) {
                    final SubLObject var27 = Hashtables.gethash_without_values(var24, var23, var26);
                    if (module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$) || module0369.NIL == module0065.f4749(var27)) {
                        var15 = (SubLObject)ConsesLow.cons(f25631(var27), var15);
                    }
                    var24 = Numbers.add(var24, (SubLObject)module0369.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f25635(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0369.NIL;
        final SubLObject var16 = f25492(var14);
        if (module0369.NIL == module0065.f4772(var16, (SubLObject)module0369.$ic380$)) {
            final SubLObject var158_246 = var16;
            if (module0369.NIL == module0065.f4775(var158_246, (SubLObject)module0369.$ic380$)) {
                final SubLObject var17 = module0065.f4740(var158_246);
                final SubLObject var18 = (SubLObject)module0369.NIL;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                for (var19 = Sequences.length(var17), var20 = (SubLObject)module0369.NIL, var20 = (SubLObject)module0369.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER)) {
                    var21 = ((module0369.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0369.ONE_INTEGER) : var20);
                    var22 = Vectors.aref(var17, var21);
                    if (module0369.NIL == module0065.f4749(var22) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                        if (module0369.NIL != module0065.f4749(var22)) {
                            var22 = (SubLObject)module0369.$ic380$;
                        }
                        var15 = (SubLObject)ConsesLow.cons(f25625(var22), var15);
                    }
                }
            }
            final SubLObject var241_247 = var16;
            if (module0369.NIL == module0065.f4777(var241_247) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                final SubLObject var23 = module0065.f4738(var241_247);
                SubLObject var24 = module0065.f4739(var241_247);
                final SubLObject var25 = module0065.f4734(var241_247);
                final SubLObject var26 = (SubLObject)((module0369.NIL != module0065.f4773((SubLObject)module0369.$ic380$)) ? module0369.NIL : module0369.$ic380$);
                while (var24.numL(var25)) {
                    final SubLObject var27 = Hashtables.gethash_without_values(var24, var23, var26);
                    if (module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$) || module0369.NIL == module0065.f4749(var27)) {
                        var15 = (SubLObject)ConsesLow.cons(f25625(var27), var15);
                    }
                    var24 = Numbers.add(var24, (SubLObject)module0369.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f25636(final SubLObject var14) {
        if (module0369.NIL != f25605(var14)) {
            final SubLObject var15 = f25606(var14);
            if (module0369.NIL != module0391.f27795(var15)) {
                return module0391.f27869(var15);
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25637(final SubLObject var14) {
        final SubLObject var15 = f25529(var14);
        if (module0369.NIL != var15) {
            final SubLObject var16 = f25528(var14);
            final SubLObject var17 = module0051.f3571(var16, var15);
            final SubLObject var18 = module0051.f3572(var17);
            final SubLObject var19 = f25527(var14);
            final SubLObject var20 = module0051.f3550(var18, var19);
            return var20;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25638(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        return module0035.sublisp_boolean(f25534(var14));
    }
    
    public static SubLObject f25639(final SubLObject var14, final SubLObject var254) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23976(var254) : var254;
        return module0035.f2169(var254, f25339(var14));
    }
    
    public static SubLObject f25640(final SubLObject var14, final SubLObject var255, final SubLObject var256) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23977(var255) : var255;
        assert module0369.NIL != module0083.f5676(var256) : var256;
        final SubLObject var257 = f25536(var14);
        module0067.f4886(var257, var255, var256);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25641(final SubLObject var14, final SubLObject var255) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23977(var255) : var255;
        final SubLObject var256 = f25536(var14);
        SubLObject var257 = module0067.f4885(var256, var255, (SubLObject)module0369.UNPROVIDED);
        if (module0369.NIL == var257) {
            var257 = module0360.f23978(var255);
            module0067.f4886(var256, var255, var257);
        }
        return var257;
    }
    
    public static SubLObject f25642(final SubLObject var14, final SubLObject var255) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23977(var255) : var255;
        return module0083.f5700(f25641(var14, var255), (SubLObject)module0369.UNPROVIDED);
    }
    
    public static SubLObject f25643(final SubLObject var14, final SubLObject var255, final SubLObject var258) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23977(var255) : var255;
        return module0083.f5698(f25641(var14, var255), var258);
    }
    
    public static SubLObject f25644(final SubLObject var14, final SubLObject var259) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0004.f106(var259) : var259;
        f25410(var14, var259);
        return var14;
    }
    
    public static SubLObject f25645(final SubLObject var14) {
        final SubLObject var15 = f25525(var14);
        final SubLObject var16 = f25646(var15);
        if (module0369.NIL != module0048.f3328(var16)) {
            return module0048.f3326();
        }
        final SubLObject var17 = Numbers.subtract(var16, f25531(var14));
        final SubLObject var18 = f25528(var14);
        final SubLObject var19 = module0051.f3569(var17, var18);
        return var19;
    }
    
    public static SubLObject f25647(final SubLObject var264) {
        final SubLObject var265 = module0107.f7626(module0354.$g2995$.getGlobalValue(), module0354.$g2994$.getGlobalValue());
        module0369.$g3150$.setGlobalValue(var265);
        return Sequences.length(module0369.$g3150$.getGlobalValue());
    }
    
    public static SubLObject f25648() {
        return Types.consp(module0369.$g3150$.getGlobalValue());
    }
    
    public static SubLObject f25646(final SubLObject var136) {
        if (module0369.NIL != module0035.f2414((SubLObject)module0369.ONE_INTEGER, var136) || module0369.NIL == f25648()) {
            return (SubLObject)module0369.$ic408$;
        }
        return module0048.f3390(module0369.$g3150$.getGlobalValue(), var136);
    }
    
    public static SubLObject f25649(final SubLObject var266) {
        if (module0369.NIL == f25648()) {
            return (SubLObject)module0369.NIL;
        }
        final SubLObject var267 = conses_high.member(var266, module0369.$g3150$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic409$), (SubLObject)module0369.UNPROVIDED);
        SubLObject var268 = (SubLObject)module0369.NIL;
        SubLObject var269 = (SubLObject)module0369.NIL;
        SubLObject var270 = (SubLObject)module0369.NIL;
        if (module0369.NIL == var267) {
            return (SubLObject)module0369.NIL;
        }
        var269 = Sequences.length(module0369.$g3150$.getGlobalValue());
        var270 = Numbers.subtract(var269, Sequences.length(var267));
        var268 = Numbers.divide(var270, var269);
        return var268;
    }
    
    public static SubLObject f25650(final SubLObject var14, final SubLObject var15) {
        final SubLObject var16 = f25499(var14);
        if (var15.numG(var16)) {
            return f25651(var14, var15);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25651(final SubLObject var14, final SubLObject var15) {
        f25557(var14, var15);
        f25652(var14, var15);
        if (module0369.NIL != f25639(var14, (SubLObject)module0369.$ic410$) && module0369.NIL != module0004.f105(f25653(var14))) {
            f25554(var14, (SubLObject)module0369.$ic410$);
            return (SubLObject)module0369.$ic410$;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25654(final SubLObject var14, final SubLObject var271) {
        assert module0369.NIL != module0233.f15350(var271) : var271;
        final SubLObject var272 = f25493(var14);
        return module0067.f4884(var272, var271, (SubLObject)module0369.UNPROVIDED);
    }
    
    public static SubLObject f25655(final SubLObject var14) {
        final SubLObject var15 = f25492(var14);
        return module0065.f4746(var15);
    }
    
    public static SubLObject f25656(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0369.NIL;
        final SubLObject var16 = f25492(var14);
        if (module0369.NIL == module0065.f4772(var16, (SubLObject)module0369.$ic380$)) {
            final SubLObject var158_273 = var16;
            if (module0369.NIL == module0065.f4775(var158_273, (SubLObject)module0369.$ic380$)) {
                final SubLObject var17 = module0065.f4740(var158_273);
                final SubLObject var18 = (SubLObject)module0369.NIL;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                for (var19 = Sequences.length(var17), var20 = (SubLObject)module0369.NIL, var20 = (SubLObject)module0369.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER)) {
                    var21 = ((module0369.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0369.ONE_INTEGER) : var20);
                    var22 = Vectors.aref(var17, var21);
                    if (module0369.NIL == module0065.f4749(var22) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                        if (module0369.NIL != module0065.f4749(var22)) {
                            var22 = (SubLObject)module0369.$ic380$;
                        }
                        var15 = (SubLObject)ConsesLow.cons(var22, var15);
                    }
                }
            }
            final SubLObject var173_274 = var16;
            if (module0369.NIL == module0065.f4777(var173_274)) {
                final SubLObject var23 = module0065.f4738(var173_274);
                SubLObject var24 = (SubLObject)module0369.NIL;
                SubLObject var25 = (SubLObject)module0369.NIL;
                final Iterator var26 = Hashtables.getEntrySetIterator(var23);
                try {
                    while (Hashtables.iteratorHasNext(var26)) {
                        final Map.Entry var27 = Hashtables.iteratorNextEntry(var26);
                        var24 = Hashtables.getEntryKey(var27);
                        var25 = Hashtables.getEntryValue(var27);
                        var15 = (SubLObject)ConsesLow.cons(var25, var15);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var26);
                }
            }
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f25657(final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        SubLObject var16 = (SubLObject)module0369.NIL;
        final SubLObject var17 = f25494(var14);
        SubLObject var18;
        SubLObject var19;
        SubLObject var20;
        for (var18 = f25621(var14), var19 = (SubLObject)module0369.NIL, var19 = var17; !var19.numGE(var18); var19 = module0048.f_1X(var19)) {
            var20 = f25616(var14, var19);
            if (module0369.NIL == Errors.$ignore_mustsP$.getDynamicValue(var15) && module0369.NIL == var20) {
                Errors.error((SubLObject)module0369.$ic411$, var14);
            }
            var16 = (SubLObject)ConsesLow.cons(var20, var16);
        }
        return Sequences.nreverse(var16);
    }
    
    public static SubLObject f25610(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        final SubLObject var15 = f25309(var14);
        return (module0369.NIL != module0077.f5302(var15)) ? module0077.f5312(var15) : var15;
    }
    
    public static SubLObject f25658(final SubLObject var14) {
        final SubLObject var15 = f25309(var14);
        return (SubLObject)((module0369.NIL != module0077.f5302(var15)) ? module0077.f5311(var15) : module0369.$ic408$);
    }
    
    public static SubLObject f25611(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        final SubLObject var15 = f25310(var14);
        return (module0369.NIL != module0077.f5302(var15)) ? module0077.f5312(var15) : var15;
    }
    
    public static SubLObject f25659(final SubLObject var14) {
        final SubLObject var15 = f25310(var14);
        return (SubLObject)((module0369.NIL != module0077.f5302(var15)) ? module0077.f5311(var15) : module0369.ZERO_INTEGER);
    }
    
    public static SubLObject f25660(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL == module0055.f4019(f25498(var14)));
    }
    
    public static SubLObject f25661(final SubLObject var14) {
        return module0055.f4019(f25498(var14));
    }
    
    public static SubLObject f25662(final SubLObject var14) {
        return f25661(var14);
    }
    
    public static SubLObject f25653(final SubLObject var14) {
        return module0065.f4733(f25492(var14));
    }
    
    public static SubLObject f25663(final SubLObject var14) {
        return Numbers.subtract(f25653(var14), f25494(var14));
    }
    
    public static SubLObject f25664(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && f25653(var1).isPositive());
    }
    
    public static SubLObject f25665(final SubLObject var14) {
        return module0055.f4016(f25495(var14));
    }
    
    public static SubLObject f25666(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != f25598(var14)) {
            return f25665(var14);
        }
        return f25663(var14);
    }
    
    public static SubLObject f25667(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var14) && module0369.NIL != module0361.f24174(f25421(var14)));
    }
    
    public static SubLObject f25668(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var14) && module0369.NIL == f25667(var14));
    }
    
    public static SubLObject f25669(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var14) && module0369.NIL != module0361.f24171(f25421(var14)));
    }
    
    public static SubLObject f25670(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        if (module0369.NIL != f25615(var14)) {
            return (SubLObject)module0369.$ic412$;
        }
        if (module0369.NIL != module0373.f26327(f25597(var14), (SubLObject)module0369.$ic413$)) {
            return (SubLObject)module0369.$ic414$;
        }
        return (SubLObject)module0369.$ic415$;
    }
    
    public static SubLObject f25671(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic412$ == f25670(var1));
    }
    
    public static SubLObject f25672(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic415$ == f25670(var1));
    }
    
    public static SubLObject f25673(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic414$ == f25670(var1));
    }
    
    public static SubLObject f25674(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.NIL != f25589(var1));
    }
    
    public static SubLObject f25675(final SubLObject var14, final SubLObject var279) {
        assert module0369.NIL != module0360.f23817(var279) : var279;
        final SubLObject var280 = module0360.f23969(var279);
        f25450(var14, var280);
        final SubLObject var281 = module0360.f23967(var279);
        f25558(var14, var281);
        final SubLObject var282 = module0360.f23823(var279);
        f25559(var14, var282);
        final SubLObject var283 = module0360.f23824(var279);
        f25560(var14, var283);
        final SubLObject var284 = module0360.f23825(var279);
        f25561(var14, var284);
        final SubLObject var285 = module0360.f23826(var279);
        f25562(var14, var285);
        final SubLObject var286 = module0360.f23827(var279);
        assert module0369.NIL != module0411.f28567(var286) : var286;
        if (module0369.$ic395$ == var286) {
            f25563(var14, (SubLObject)module0369.$ic395$);
        }
        else {
            f25563(var14, module0078.f5367(var286, Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED));
        }
        final SubLObject var287 = module0360.f23828(var279);
        assert module0369.NIL != module0411.f28568(var287) : var287;
        if (module0369.$ic403$ == var287) {
            f25564(var14, (SubLObject)module0369.$ic403$);
        }
        else {
            f25564(var14, module0078.f5367(var287, Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED));
        }
        final SubLObject var288 = module0360.f23829(var279);
        f25565(var14, var288);
        final SubLObject var289 = module0360.f23830(var279);
        f25566(var14, var289);
        final SubLObject var290 = module0360.f23971(var279);
        f25567(var14, var290);
        final SubLObject var291 = module0360.f23972(var279);
        if (module0369.NIL != var291) {
            f25676(var14);
        }
        final SubLObject var292 = module0360.f23973(var279);
        f25578(var14, var292);
        final SubLObject var293 = module0360.f23975(var279);
        f25579(var14, var293);
        return var14;
    }
    
    public static SubLObject f25677(final SubLObject var14, final SubLObject var288) {
        assert module0369.NIL != module0360.f23804(var288) : var288;
        SubLObject var289 = f25282(var14);
        final SubLObject var290 = module0360.f23837(var289);
        final SubLObject var291 = module0360.f23837(var288);
        final SubLObject var292 = (SubLObject)SubLObjectFactory.makeBoolean(!var290.eql(var291));
        if (module0369.NIL != var292) {
            var289 = module0360.f23793(module0408.f28406(var289));
            var289 = conses_high.putf(var289, (SubLObject)module0369.$ic420$, var291);
            var289 = module0408.f28407(var289);
        }
        SubLObject var293;
        SubLObject var294;
        SubLObject var295;
        for (var293 = (SubLObject)module0369.NIL, var293 = var288; module0369.NIL != var293; var293 = conses_high.cddr(var293)) {
            var294 = var293.first();
            var295 = conses_high.cadr(var293);
            var289 = conses_high.putf(var289, var294, var295);
        }
        f25544(var14, var289);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25678(final SubLObject var14, final SubLObject var293) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0363.f24478(var293) : var293;
        module0077.f5326(var293, f25298(var14));
        return var14;
    }
    
    public static SubLObject f25679(final SubLObject var14, final SubLObject var293) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0363.f24478(var293) : var293;
        module0077.f5327(var293, f25298(var14));
        return var14;
    }
    
    public static SubLObject f25478(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        module0077.f5328(f25298(var14));
        return var14;
    }
    
    public static SubLObject f25680(final SubLObject var14, final SubLObject var98) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0367.f24997(var98) : var98;
        module0077.f5326(var98, f25299(var14));
        return var14;
    }
    
    public static SubLObject f25681(final SubLObject var14, final SubLObject var98) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0367.f24997(var98) : var98;
        module0077.f5327(var98, f25299(var14));
        return var14;
    }
    
    public static SubLObject f25479(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        module0077.f5328(f25299(var14));
        return var14;
    }
    
    public static SubLObject f25682(final SubLObject var14) {
        final SubLObject var15 = f25621(var14);
        f25362(var14, var15);
        return var14;
    }
    
    public static SubLObject f25621(final SubLObject var14) {
        final SubLObject var15 = f25492(var14);
        return module0065.f4734(var15);
    }
    
    public static SubLObject f25683(final SubLObject var14, final SubLObject var54) {
        assert module0369.NIL != f25684(var54) : var54;
        final SubLObject var55 = f25629(var54);
        final SubLObject var56 = f25492(var14);
        module0065.f4756(var56, var55, var54, (SubLObject)module0369.NIL);
        return var14;
    }
    
    public static SubLObject f25685(final SubLObject var14, final SubLObject var54) {
        assert module0369.NIL != f25684(var54) : var54;
        final SubLObject var55 = f25629(var54);
        final SubLObject var56 = f25492(var14);
        module0065.f4761(var56, var55);
        return var14;
    }
    
    public static SubLObject f25686(final SubLObject var14, final SubLObject var54) {
        assert module0369.NIL != f25684(var54) : var54;
        final SubLObject var55 = f25687(var54);
        final SubLObject var56 = f25493(var14);
        module0067.f4886(var56, var55, var54);
        return var14;
    }
    
    public static SubLObject f25688(final SubLObject var14, final SubLObject var54) {
        assert module0369.NIL != f25684(var54) : var54;
        final SubLObject var55 = f25687(var54);
        final SubLObject var56 = f25493(var14);
        module0067.f4887(var56, var55);
        return var14;
    }
    
    public static SubLObject f25689(final SubLObject var14) {
        module0055.f4018(f25495(var14));
        return var14;
    }
    
    public static SubLObject f25690(final SubLObject var14, final SubLObject var295) {
        assert module0369.NIL != f25691(var295) : var295;
        module0055.f4021(var295, f25495(var14));
        return var14;
    }
    
    public static SubLObject f25692(final SubLObject var14, final SubLObject var295) {
        assert module0369.NIL != f25691(var295) : var295;
        module0055.f4026(var295, f25495(var14), (SubLObject)module0369.UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f25448(final SubLObject var14) {
        return f25556(var14, (SubLObject)module0369.NIL);
    }
    
    public static SubLObject f25693(final SubLObject var14) {
        return f25556(var14, Threads.current_process());
    }
    
    public static SubLObject f25694(final SubLObject var14, final SubLObject var114) {
        assert module0369.NIL != Types.processp(var114) : var114;
        module0055.f4021(var114, f25498(var14));
        return var14;
    }
    
    public static SubLObject f25695(final SubLObject var14, final SubLObject var296) {
        SubLObject var297 = f25531(var14);
        var297 = Numbers.add(var297, var296);
        f25459(var14, var297);
        return var14;
    }
    
    public static SubLObject f25696(final SubLObject var14, final SubLObject var297) {
        final SubLThread var298 = SubLProcess.currentSubLThread();
        final SubLObject var299 = f25490(var14);
        if (module0369.NIL == Errors.$ignore_mustsP$.getDynamicValue(var298) && module0369.NIL == conses_high.subsetp(var299, var297, Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED)) {
            Errors.error((SubLObject)module0369.$ic425$, conses_high.set_difference(var299, var297, Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED));
        }
        if (module0369.NIL == Errors.$ignore_mustsP$.getDynamicValue(var298) && module0369.NIL == conses_high.subsetp(var297, var299, Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED)) {
            Errors.error((SubLObject)module0369.$ic426$, conses_high.set_difference(var297, var299, Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED));
        }
        if (module0369.NIL == Errors.$ignore_mustsP$.getDynamicValue(var298) && !Sequences.length(var299).numE(Sequences.length(var297))) {
            Errors.error((SubLObject)module0369.$ic427$, var297);
        }
        f25551(var14, var297);
        return var14;
    }
    
    public static SubLObject f25697(final SubLObject var14, final SubLObject var299) {
        final SubLObject var300 = f25486(var14);
        final SubLObject var301 = module0233.f15362(var300, var299);
        return f25696(var14, var301);
    }
    
    public static SubLObject f25446(final SubLObject var14) {
        f25682(var14);
        f25689(var14);
        return var14;
    }
    
    public static SubLObject f25698(final SubLObject var14, final SubLObject var54) {
        assert module0369.NIL != f25684(var54) : var54;
        f25683(var14, var54);
        f25686(var14, var54);
        return var14;
    }
    
    public static SubLObject f25699(final SubLObject var14, final SubLObject var54) {
        assert module0369.NIL != f25684(var54) : var54;
        f25685(var14, var54);
        f25688(var14, var54);
        return var14;
    }
    
    public static SubLObject f25700(final SubLObject var14) {
        final SubLObject var15 = Time.get_internal_real_time();
        final SubLObject var16 = Time.get_universal_time();
        f25572(var14, var15);
        f25571(var14, var16);
        final SubLObject var17 = f25517(var14);
        final SubLObject var18 = (SubLObject)((module0369.NIL != var17) ? module0051.f3569(var17, var15) : module0369.NIL);
        f25573(var14, var18);
        final SubLObject var19 = f25645(var14);
        f25574(var14, var19);
        return var14;
    }
    
    public static SubLObject f25701(final SubLObject var14) {
        final SubLObject var15 = f25702(var14, (SubLObject)module0369.NIL);
        f25695(var14, var15);
        return var14;
    }
    
    public static SubLObject f25703(final SubLObject var14) {
        final SubLObject var15 = f25528(var14);
        final SubLObject var16 = module0051.f3571(var15, (SubLObject)module0369.UNPROVIDED);
        return var16;
    }
    
    public static SubLObject f25704(final SubLObject var14) {
        final SubLObject var15 = f25527(var14);
        final SubLObject var16 = module0004.f102(var15, (SubLObject)module0369.UNPROVIDED);
        return var16;
    }
    
    public static SubLObject f25702(final SubLObject var14, SubLObject var304) {
        if (var304 == module0369.UNPROVIDED) {
            var304 = (SubLObject)module0369.T;
        }
        SubLObject var305 = (SubLObject)module0369.ZERO_INTEGER;
        if (module0369.NIL != f25429(var14)) {
            if (module0369.NIL != var304) {
                var305 = f25704(var14);
            }
            else {
                final SubLObject var306 = f25703(var14);
                var305 = module0051.f3572(var306);
            }
        }
        return var305;
    }
    
    public static SubLObject f25705(final SubLObject var14, SubLObject var304) {
        if (var304 == module0369.UNPROVIDED) {
            var304 = (SubLObject)module0369.T;
        }
        assert module0369.NIL != f25275(var14) : var14;
        final SubLObject var305 = f25529(var14);
        if (module0369.NIL != f25429(var14) && var305.isInteger()) {
            final SubLObject var306 = Time.get_internal_real_time();
            final SubLObject var307 = module0051.f3571(var306, var305);
            SubLObject var308 = module0051.f3572(var307);
            if (module0369.NIL != var304) {
                var308 = Numbers.truncate(var308, (SubLObject)module0369.UNPROVIDED);
            }
            return var308;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25706(final SubLObject var14, SubLObject var304) {
        if (var304 == module0369.UNPROVIDED) {
            var304 = (SubLObject)module0369.T;
        }
        final SubLObject var305 = f25531(var14);
        final SubLObject var306 = f25702(var14, (SubLObject)module0369.NIL);
        SubLObject var307 = Numbers.add(var305, var306);
        if (module0369.NIL != var304) {
            var307 = Numbers.truncate(var307, (SubLObject)module0369.UNPROVIDED);
        }
        return var307;
    }
    
    public static SubLObject f25707(final SubLObject var14) {
        f25694(var14, Threads.current_process());
        return var14;
    }
    
    public static SubLObject f25708(final SubLObject var14) {
        SubLObject var15 = (SubLObject)module0369.NIL;
        if (module0369.NIL != f25417(var14)) {
            for (SubLObject var16 = f25498(var14), var17 = module0055.f4019(var16); module0369.NIL == var17; var17 = module0055.f4019(var16)) {
                final SubLObject var18 = module0055.f4023(var16);
                Threads.process_unblock(var18);
                var15 = (SubLObject)module0369.T;
            }
        }
        return var15;
    }
    
    public static SubLObject f25605(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25275(var1) && module0369.$ic428$ == f25538(var1));
    }
    
    public static SubLObject f25709(final SubLObject var85) {
        assert module0369.NIL != module0361.f24009(var85) : var85;
        final SubLObject var86 = f25445(var85);
        f25580(var86, (SubLObject)module0369.$ic428$);
        return var86;
    }
    
    public static SubLObject f25606(final SubLObject var14) {
        assert module0369.NIL != f25605(var14) : var14;
        return f25539(var14);
    }
    
    public static SubLObject f25710(final SubLObject var14, final SubLObject var98) {
        assert module0369.NIL != f25605(var14) : var14;
        assert module0369.NIL != module0367.f24997(var98) : var98;
        f25413(var14, var98);
        return var14;
    }
    
    public static SubLObject f25711(final SubLObject var85, final SubLObject var313) {
        assert module0369.NIL != module0361.f24009(var85) : var85;
        assert module0369.NIL != module0367.f25040(var313) : var313;
        final SubLObject var314 = f25709(var85);
        final SubLObject var315 = module0367.f25039(var313, var314);
        f25710(var314, var315);
        module0387.f27474();
        return var314;
    }
    
    public static SubLObject f25712(final SubLObject var313) {
        final SubLObject var314 = module0361.f24136((SubLObject)module0369.UNPROVIDED);
        return f25711(var314, var313);
    }
    
    public static SubLObject f25713(final SubLObject var2, final SubLObject var3) {
        f25714(var2, var3, (SubLObject)module0369.ZERO_INTEGER);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25684(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX28211_native.class) ? module0369.T : module0369.NIL);
    }
    
    public static SubLObject f25715(final SubLObject var2) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f25716(final SubLObject var2) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f25717(final SubLObject var2) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f25718(final SubLObject var2) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f25719(final SubLObject var2) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.getField6();
    }
    
    public static SubLObject f25720(final SubLObject var2) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.getField7();
    }
    
    public static SubLObject f25721(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f25722(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f25723(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f25724(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f25725(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.setField6(var5);
    }
    
    public static SubLObject f25726(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25684(var2) : var2;
        return var2.setField7(var5);
    }
    
    public static SubLObject f25727(SubLObject var6) {
        if (var6 == module0369.UNPROVIDED) {
            var6 = (SubLObject)module0369.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX28211_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0369.NIL, var8 = var6; module0369.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0369.$ic198$)) {
                f25721(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic451$)) {
                f25722(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic402$)) {
                f25723(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic452$)) {
                f25724(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic453$)) {
                f25725(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic258$)) {
                f25726(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0369.$ic267$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f25728(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic268$, (SubLObject)module0369.$ic454$, (SubLObject)module0369.SIX_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic198$, f25715(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic451$, f25716(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic402$, f25717(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic452$, f25718(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic453$, f25719(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic258$, f25720(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic271$, (SubLObject)module0369.$ic454$, (SubLObject)module0369.SIX_INTEGER);
        return var12;
    }
    
    public static SubLObject f25729(final SubLObject var12, final SubLObject var13) {
        return f25728(var12, var13);
    }
    
    public static SubLObject f25730(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25684(var1) && module0369.NIL == f25731(var1));
    }
    
    public static SubLObject f25731(final SubLObject var318) {
        return Equality.eq((SubLObject)module0369.$ic338$, f25687(var318));
    }
    
    public static SubLObject f25714(final SubLObject var1, final SubLObject var3, final SubLObject var15) {
        if (module0369.NIL != f25731(var1)) {
            PrintLow.format(var3, (SubLObject)module0369.$ic456$, f25715(var1));
        }
        else {
            final SubLObject var16 = f25732(var1);
            final SubLObject var17 = f25422(var16);
            final SubLObject var18 = f25421(var16);
            final SubLObject var19 = (SubLObject)((module0369.NIL != module0361.f24009(var18)) ? module0361.f23996(var18) : module0369.NIL);
            PrintLow.format(var3, (SubLObject)module0369.$ic457$, new SubLObject[] { f25629(var1), var19, var17, f25687(var1) });
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25733(final SubLObject var1) {
        return f25715(var1);
    }
    
    public static SubLObject f25734(final SubLObject var14, final SubLObject var271) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0233.f15349(var271) : var271;
        final SubLObject var272 = f25727((SubLObject)module0369.UNPROVIDED);
        final SubLObject var273 = f25655(var14);
        if (var273.isZero()) {
            module0413.f28812();
        }
        f25721(var272, var273);
        f25722(var272, var14);
        f25735(var272, var271);
        f25724(var272, (SubLObject)module0369.NIL);
        f25736(var272);
        final SubLObject var274 = f25533(var14);
        f25737(var272, var274);
        f25698(var14, var272);
        f25738(var14, var272);
        return var272;
    }
    
    public static SubLObject f25739(final SubLObject var14, final SubLObject var271) {
        assert module0369.NIL != f25275(var14) : var14;
        SubLObject var272 = f25654(var14, var271);
        SubLObject var273 = (SubLObject)module0369.NIL;
        if (module0369.NIL == var272) {
            var272 = f25734(var14, var271);
            var273 = (SubLObject)module0369.T;
        }
        return Values.values(var272, var273);
    }
    
    public static SubLObject f25740(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic460$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic460$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic460$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic461$, (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic462$, var24)), ConsesLow.append(var25, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic460$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25741(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic463$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        SubLObject var25 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic463$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic463$);
        var24 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic463$);
        var25 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var26;
            var21 = (var26 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic464$, (SubLObject)ConsesLow.list(var23, var24, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic462$, var25)), ConsesLow.append(var26, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic463$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25742(final SubLObject var54) {
        if (module0369.NIL != f25730(var54)) {
            f25743(var54);
            SubLObject var55 = f25744(var54);
            SubLObject var56 = (SubLObject)module0369.NIL;
            var56 = var55.first();
            while (module0369.NIL != var55) {
                f25745(var56);
                var55 = var55.rest();
                var56 = var55.first();
            }
            final SubLObject var57 = f25732(var54);
            f25699(var57, var54);
            return f25746(var54);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25746(final SubLObject var54) {
        f25724(var54, (SubLObject)module0369.$ic338$);
        f25722(var54, (SubLObject)module0369.$ic338$);
        return var54;
    }
    
    public static SubLObject f25743(final SubLObject var54) {
        f25723(var54, (SubLObject)module0369.$ic338$);
        return var54;
    }
    
    public static SubLObject f25629(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        return f25715(var318);
    }
    
    public static SubLObject f25732(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        return f25716(var318);
    }
    
    public static SubLObject f25687(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        return f25717(var318);
    }
    
    public static SubLObject f25744(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        return f25718(var318);
    }
    
    public static SubLObject f25631(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        return f25719(var318);
    }
    
    public static SubLObject f25625(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        return f25720(var318);
    }
    
    public static SubLObject f25735(final SubLObject var318, final SubLObject var271) {
        assert module0369.NIL != module0233.f15349(var271) : var271;
        f25723(var318, var271);
        return var318;
    }
    
    public static SubLObject f25747(final SubLObject var318, final SubLObject var330) {
        f25725(var318, var330);
        return var318;
    }
    
    public static SubLObject f25737(final SubLObject var318, final SubLObject var145) {
        f25726(var318, var145);
        return var318;
    }
    
    public static SubLObject f25748(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        return f25421(f25732(var318));
    }
    
    public static SubLObject f25749(final SubLObject var318) {
        return f25590(f25732(var318));
    }
    
    public static SubLObject f25623(final SubLObject var318, SubLObject var304) {
        if (var304 == module0369.UNPROVIDED) {
            var304 = (SubLObject)module0369.T;
        }
        assert module0369.NIL != f25684(var318) : var318;
        final SubLObject var319 = f25631(var318);
        SubLObject var320 = module0051.f3572(var319);
        if (module0369.NIL != var304) {
            var320 = Numbers.truncate(var320, (SubLObject)module0369.UNPROVIDED);
        }
        return var320;
    }
    
    public static SubLObject f25750(final SubLObject var318) {
        final SubLObject var319 = f25732(var318);
        final SubLObject var320 = f25527(var319);
        final SubLObject var321 = f25623(var318, (SubLObject)module0369.T);
        return module0051.f3550(var321, var320);
    }
    
    public static SubLObject f25751(final SubLObject var318, final SubLObject var332) {
        final SubLObject var333 = f25744(var318);
        return Sequences.find(var332, var333, (SubLObject)module0369.$ic465$, (SubLObject)module0369.$ic466$, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED);
    }
    
    public static SubLObject f25752(final SubLObject var54) {
        final SubLObject var55 = f25732(var54);
        final SubLObject var57;
        final SubLObject var56 = var57 = f25500(var55);
        if (var57.eql((SubLObject)module0369.$ic467$)) {
            return f25687(var54);
        }
        if (var57.eql((SubLObject)module0369.$ic468$)) {
            return module0409.f28535(var54);
        }
        Errors.error((SubLObject)module0369.$ic469$, var56);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25753(final SubLObject var334, final SubLObject var335) {
        assert module0369.NIL != f25684(var334) : var334;
        assert module0369.NIL != f25684(var335) : var335;
        return Equality.equal(f25687(var334), f25687(var335));
    }
    
    public static SubLObject f25754(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        final SubLObject var319 = f25732(var318);
        final SubLObject var320 = f25629(var318);
        final SubLObject var321 = f25494(var319);
        return Numbers.numGE(var320, var321);
    }
    
    public static SubLObject f25755(final SubLObject var334, final SubLObject var335) {
        return Numbers.numL(f25629(var334), f25629(var335));
    }
    
    public static SubLObject f25756(final SubLObject var318) {
        assert module0369.NIL != f25684(var318) : var318;
        final SubLObject var319 = f25732(var318);
        final SubLObject var320 = f25423(var319);
        final SubLObject var321 = f25752(var318);
        final SubLObject var322 = module0233.f15362(var321, var320);
        return var322;
    }
    
    public static SubLObject f25757(final SubLObject var318) {
        return Sequences.length(f25744(var318));
    }
    
    public static SubLObject f25758(final SubLObject var318, final SubLObject var329) {
        assert module0369.NIL != f25691(var329) : var329;
        f25724(var318, (SubLObject)ConsesLow.cons(var329, f25718(var318)));
        return var318;
    }
    
    public static SubLObject f25759(final SubLObject var318, final SubLObject var329) {
        assert module0369.NIL != f25691(var329) : var329;
        f25724(var318, Sequences.delete(var329, f25718(var318), (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED));
        return var318;
    }
    
    public static SubLObject f25736(final SubLObject var318) {
        final SubLObject var319 = f25732(var318);
        final SubLObject var320 = f25528(var319);
        final SubLObject var321 = module0051.f3571(var320, (SubLObject)module0369.UNPROVIDED);
        f25747(var318, var321);
        return var318;
    }
    
    public static SubLObject f25760(final SubLObject var2, final SubLObject var3) {
        f25761(var2, var3, (SubLObject)module0369.ZERO_INTEGER);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25691(final SubLObject var2) {
        return (SubLObject)((var2.getClass() == $sX28214_native.class) ? module0369.T : module0369.NIL);
    }
    
    public static SubLObject f25762(final SubLObject var2) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.getField2();
    }
    
    public static SubLObject f25763(final SubLObject var2) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.getField3();
    }
    
    public static SubLObject f25764(final SubLObject var2) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.getField4();
    }
    
    public static SubLObject f25765(final SubLObject var2) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.getField5();
    }
    
    public static SubLObject f25766(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.setField2(var5);
    }
    
    public static SubLObject f25767(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.setField3(var5);
    }
    
    public static SubLObject f25768(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.setField4(var5);
    }
    
    public static SubLObject f25769(final SubLObject var2, final SubLObject var5) {
        assert module0369.NIL != f25691(var2) : var2;
        return var2.setField5(var5);
    }
    
    public static SubLObject f25770(SubLObject var6) {
        if (var6 == module0369.UNPROVIDED) {
            var6 = (SubLObject)module0369.NIL;
        }
        final SubLObject var7 = (SubLObject)new $sX28214_native();
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var8 = (SubLObject)module0369.NIL, var8 = var6; module0369.NIL != var8; var8 = conses_high.cddr(var8)) {
            var9 = var8.first();
            var10 = conses_high.cadr(var8);
            var11 = var9;
            if (var11.eql((SubLObject)module0369.$ic487$)) {
                f25766(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic488$)) {
                f25767(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic489$)) {
                f25768(var7, var10);
            }
            else if (var11.eql((SubLObject)module0369.$ic490$)) {
                f25769(var7, var10);
            }
            else {
                Errors.error((SubLObject)module0369.$ic267$, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f25771(final SubLObject var12, final SubLObject var13) {
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic268$, (SubLObject)module0369.$ic491$, (SubLObject)module0369.FOUR_INTEGER);
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic487$, f25762(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic488$, f25763(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic489$, f25764(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic270$, (SubLObject)module0369.$ic490$, f25765(var12));
        Functions.funcall(var13, var12, (SubLObject)module0369.$ic271$, (SubLObject)module0369.$ic491$, (SubLObject)module0369.FOUR_INTEGER);
        return var12;
    }
    
    public static SubLObject f25772(final SubLObject var12, final SubLObject var13) {
        return f25771(var12, var13);
    }
    
    public static SubLObject f25773(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != f25691(var1) && module0369.NIL == f25774(var1));
    }
    
    public static SubLObject f25774(final SubLObject var343) {
        return Equality.eq((SubLObject)module0369.$ic338$, f25775(var343));
    }
    
    public static SubLObject f25761(final SubLObject var1, final SubLObject var3, final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0369.NIL != f25774(var1)) {
            if (module0369.NIL != print_high.$print_readably$.getDynamicValue(var16)) {
                print_high.print_not_readable(var1, var3);
            }
            else {
                streams_high.write_string((SubLObject)module0369.$ic493$, var3, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED);
                PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { module0369.$ic494$, var3 });
                streams_high.write_char((SubLObject)Characters.CHAR_space, var3);
                PrintLow.write(Equality.pointer(var1), new SubLObject[] { module0369.$ic494$, var3, module0369.$ic495$, module0369.SIXTEEN_INTEGER });
                streams_high.write_char((SubLObject)Characters.CHAR_greater, var3);
            }
        }
        else {
            PrintLow.format(var3, (SubLObject)module0369.$ic496$, f25775(var1));
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25776(final SubLObject var1) {
        return Numbers.logxor(Sxhash.sxhash(f25762(var1)), Sxhash.sxhash(f25763(var1)));
    }
    
    public static SubLObject f25777(final SubLObject var1) {
        if (module0369.NIL != module0035.f2015(var1)) {
            SubLObject var2 = var1;
            SubLObject var3 = (SubLObject)module0369.NIL;
            var3 = var2.first();
            while (module0369.NIL != var2) {
                if (module0369.NIL == f25691(var3)) {
                    return (SubLObject)module0369.NIL;
                }
                var2 = var2.rest();
                var3 = var2.first();
            }
            return (SubLObject)module0369.T;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25778(final SubLObject var54, final SubLObject var349, final SubLObject var350) {
        assert module0369.NIL != f25684(var54) : var54;
        assert module0369.NIL != module0191.f11993(var349) : var349;
        final SubLObject var351 = f25770((SubLObject)module0369.UNPROVIDED);
        f25766(var351, var54);
        f25767(var351, var349);
        f25768(var351, var350);
        f25758(var54, var351);
        return var351;
    }
    
    public static SubLObject f25779(final SubLObject var14, final SubLObject var271, final SubLObject var349, final SubLObject var350) {
        assert module0369.NIL != f25275(var14) : var14;
        final SubLObject var351 = f25739(var14, var271);
        SubLObject var352 = f25751(var351, var349);
        SubLObject var353 = (SubLObject)module0369.NIL;
        if (module0369.NIL == var352) {
            var352 = f25778(var351, var349, var350);
            f25690(var14, var352);
            var353 = (SubLObject)module0369.T;
        }
        return Values.values(var352, var353);
    }
    
    public static SubLObject f25745(final SubLObject var329) {
        if (module0369.NIL != f25773(var329)) {
            f25780(var329);
            final SubLObject var330 = f25781(var329);
            f25692(var330, var329);
            final SubLObject var331 = f25782(var329);
            f25759(var331, var329);
            return f25783(var329);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25783(final SubLObject var329) {
        f25766(var329, (SubLObject)module0369.$ic338$);
        return var329;
    }
    
    public static SubLObject f25780(final SubLObject var329) {
        f25767(var329, (SubLObject)module0369.$ic338$);
        f25768(var329, (SubLObject)module0369.$ic338$);
        return var329;
    }
    
    public static SubLObject f25782(final SubLObject var329) {
        assert module0369.NIL != f25691(var329) : var329;
        return f25762(var329);
    }
    
    public static SubLObject f25775(final SubLObject var329) {
        assert module0369.NIL != f25691(var329) : var329;
        return f25763(var329);
    }
    
    public static SubLObject f25784(final SubLObject var329) {
        assert module0369.NIL != f25691(var329) : var329;
        return f25764(var329);
    }
    
    public static SubLObject f25785(final SubLObject var329) {
        assert module0369.NIL != f25691(var329) : var329;
        return f25765(var329);
    }
    
    public static SubLObject f25786(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic499$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic499$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic499$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            return (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic461$, (SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic500$, var24)), ConsesLow.append(var25, (SubLObject)module0369.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic499$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25787(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic501$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic501$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic501$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            final SubLObject var26 = (SubLObject)module0369.$ic502$;
            final SubLObject var27 = (SubLObject)module0369.$ic503$;
            final SubLObject var28 = (SubLObject)module0369.$ic504$;
            return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var28, var24)), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic505$, (SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic506$, var28)), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic315$, (SubLObject)ConsesLow.list(var27, var26), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic316$, (SubLObject)ConsesLow.list(var23, var27), (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic325$, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic507$, var28, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic500$, var23), (SubLObject)module0369.$ic508$), ConsesLow.append(var25, (SubLObject)module0369.NIL))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic501$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25788(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic509$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic509$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic509$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            final SubLObject var26 = (SubLObject)module0369.$ic510$;
            final SubLObject var27 = (SubLObject)module0369.$ic511$;
            final SubLObject var28 = (SubLObject)module0369.$ic512$;
            return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic315$, (SubLObject)ConsesLow.list(var26, var24), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic316$, (SubLObject)ConsesLow.list(var27, var26), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic513$, (SubLObject)ConsesLow.list(var28, var27), (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic514$, (SubLObject)ConsesLow.list(var23, var28), ConsesLow.append(var25, (SubLObject)module0369.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic509$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25789(final SubLObject var54) {
        final SubLObject var55 = f25744(var54);
        SubLObject var56 = (SubLObject)module0369.NIL;
        var56 = var55.first();
        if (module0369.NIL != var55) {
            return var56;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25790(final SubLObject var329) {
        final SubLObject var330 = f25785(var329);
        SubLObject var331 = (SubLObject)module0369.NIL;
        var331 = var330.first();
        if (module0369.NIL != var330) {
            return var331;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25791(final SubLObject var14) {
        final SubLObject var15 = f25618(var14);
        if (module0369.NIL != var15) {
            final SubLObject var16 = f25789(var15);
            if (module0369.NIL != var16) {
                final SubLObject var17 = f25790(var16);
                return var17;
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25781(final SubLObject var329) {
        return f25732(f25782(var329));
    }
    
    public static SubLObject f25792(final SubLObject var329) {
        return f25421(f25732(f25782(var329)));
    }
    
    public static SubLObject f25793(final SubLObject var329) {
        final SubLObject var330 = f25775(var329);
        final SubLObject var331 = Sort.sort(module0035.remove_if_not(Symbols.symbol_function((SubLObject)module0369.$ic515$), var330, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED), Symbols.symbol_function((SubLObject)module0369.$ic409$), Symbols.symbol_function((SubLObject)module0369.$ic516$));
        return var331;
    }
    
    public static SubLObject f25794(final SubLObject var329, final SubLObject var359) {
        assert module0369.NIL != module0366.f24916(var359) : var359;
        f25769(var329, (SubLObject)ConsesLow.cons(var359, f25765(var329)));
        return var329;
    }
    
    public static SubLObject f25795(final SubLObject var54, final SubLObject var349, final SubLObject var350, final SubLObject var359) {
        final SubLObject var360 = f25778(var54, var349, var350);
        f25794(var360, var359);
        return var360;
    }
    
    public static SubLObject f25796(final SubLObject var329, final SubLObject var364) {
        final SubLObject var365 = f25775(var329);
        final SubLObject var366 = module0346.f23311(var365, var364);
        return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic488$, var365, (SubLObject)module0369.$ic518$, var366);
    }
    
    public static SubLObject f25797(final SubLObject var329) {
        return f25796(var329, (SubLObject)module0369.$ic519$);
    }
    
    public static SubLObject f25798(final SubLObject var329) {
        return f25796(var329, (SubLObject)module0369.$ic520$);
    }
    
    public static SubLObject f25799(final SubLObject var359) {
        final SubLObject var360 = module0363.f24530(module0366.f24956(var359));
        SubLObject var361;
        SubLObject var362;
        SubLObject var363;
        SubLObject var364;
        SubLObject var365;
        SubLObject var158_369;
        SubLObject var366;
        SubLObject var367;
        SubLObject var368;
        SubLObject var369;
        SubLObject var370;
        SubLObject var371;
        SubLObject var372;
        SubLObject var373;
        SubLObject var173_371;
        SubLObject var374;
        SubLObject var375;
        SubLObject var376;
        Iterator var377;
        Map.Entry var378;
        SubLObject var379;
        SubLObject var380;
        for (var361 = module0032.f1741(var360), var362 = (SubLObject)module0369.NIL, var362 = module0032.f1742(var361, var360); module0369.NIL == module0032.f1744(var361, var362); var362 = module0032.f1743(var362)) {
            var363 = module0032.f1745(var361, var362);
            if (module0369.NIL != module0032.f1746(var362, var363)) {
                var364 = module0364.f24724(var363);
                if (module0369.NIL != var364) {
                    var365 = f25492(var364);
                    if (module0369.NIL == module0065.f4772(var365, (SubLObject)module0369.$ic380$)) {
                        var158_369 = var365;
                        if (module0369.NIL == module0065.f4775(var158_369, (SubLObject)module0369.$ic380$)) {
                            var366 = module0065.f4740(var158_369);
                            var367 = (SubLObject)module0369.NIL;
                            for (var368 = Sequences.length(var366), var369 = (SubLObject)module0369.NIL, var369 = (SubLObject)module0369.ZERO_INTEGER; var369.numL(var368); var369 = Numbers.add(var369, (SubLObject)module0369.ONE_INTEGER)) {
                                var370 = ((module0369.NIL != var367) ? Numbers.subtract(var368, var369, (SubLObject)module0369.ONE_INTEGER) : var369);
                                var371 = Vectors.aref(var366, var370);
                                if (module0369.NIL == module0065.f4749(var371) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                                    if (module0369.NIL != module0065.f4749(var371)) {
                                        var371 = (SubLObject)module0369.$ic380$;
                                    }
                                    var372 = f25744(var371);
                                    var373 = (SubLObject)module0369.NIL;
                                    var373 = var372.first();
                                    while (module0369.NIL != var372) {
                                        if (module0369.NIL != module0004.f104(var359, f25785(var373), Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED)) {
                                            f25745(var373);
                                        }
                                        var372 = var372.rest();
                                        var373 = var372.first();
                                    }
                                }
                            }
                        }
                        var173_371 = var365;
                        if (module0369.NIL == module0065.f4777(var173_371)) {
                            var374 = module0065.f4738(var173_371);
                            var375 = (SubLObject)module0369.NIL;
                            var376 = (SubLObject)module0369.NIL;
                            var377 = Hashtables.getEntrySetIterator(var374);
                            try {
                                while (Hashtables.iteratorHasNext(var377)) {
                                    var378 = Hashtables.iteratorNextEntry(var377);
                                    var375 = Hashtables.getEntryKey(var378);
                                    var376 = Hashtables.getEntryValue(var378);
                                    var379 = f25744(var376);
                                    var380 = (SubLObject)module0369.NIL;
                                    var380 = var379.first();
                                    while (module0369.NIL != var379) {
                                        if (module0369.NIL != module0004.f104(var359, f25785(var380), Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED)) {
                                            f25745(var380);
                                        }
                                        var379 = var379.rest();
                                        var380 = var379.first();
                                    }
                                }
                            }
                            finally {
                                Hashtables.releaseEntrySetIterator(var377);
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25800(final SubLObject var14) {
        final SubLObject var15 = f25531(var14);
        final SubLObject var16 = f25653(var14);
        SubLObject var17 = (SubLObject)module0369.NIL;
        if (var15.isNumber() && module0369.NIL != module0004.f105(var16)) {
            var17 = Numbers.divide(var15, var16);
        }
        return var17;
    }
    
    public static SubLObject f25801(final SubLObject var14) {
        final SubLObject var15 = f25533(var14);
        final SubLObject var16 = f25653(var14);
        SubLObject var17 = (SubLObject)module0369.NIL;
        if (var15.isNumber() && module0369.NIL != module0004.f105(var16)) {
            var17 = Numbers.divide(var15, var16);
        }
        return var17;
    }
    
    public static SubLObject f25802(final SubLObject var14) {
        final SubLObject var15 = f25531(var14);
        final SubLObject var16 = f25626(var14);
        final SubLObject var17 = module0035.f2410(var15, var16);
        return var17;
    }
    
    public static SubLObject f25803(final SubLObject var14) {
        final SubLObject var15 = f25531(var14);
        final SubLObject var16 = f25622(var14);
        final SubLObject var17 = module0035.f2410(var15, var16);
        return var17;
    }
    
    public static SubLObject f25804(final SubLObject var14) {
        final SubLObject var15 = f25526(var14);
        final SubLObject var16 = module0035.f2399(var15, Symbols.symbol_function((SubLObject)module0369.$ic521$), (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED);
        SubLObject var17 = conses_high.copy_tree(var15);
        final SubLObject var18 = f25805(var14, var16);
        var17 = conses_high.nsublis(var18, var17, Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED);
        return var17;
    }
    
    public static SubLObject f25806(final SubLObject var14, final SubLObject var382) {
        SubLObject var383 = f25805(var14, var382);
        var383 = Sort.sort(var383, Symbols.symbol_function((SubLObject)module0369.$ic522$), Symbols.symbol_function((SubLObject)module0369.$ic523$));
        return module0035.f2338(var383);
    }
    
    public static SubLObject f25805(final SubLObject var14, final SubLObject var382) {
        final SubLObject var383 = f25421(var14);
        SubLObject var384 = (SubLObject)module0369.NIL;
        SubLObject var385 = (SubLObject)module0369.NIL;
        SubLObject var386 = var382;
        SubLObject var387 = (SubLObject)module0369.NIL;
        var387 = var386.first();
        while (module0369.NIL != var386) {
            final SubLObject var388 = module0413.f28744(var387);
            if (module0369.NIL != var388) {
                final SubLObject var389 = module0413.f28741(var388, var14, var383);
                var384 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var387, var389), var384);
            }
            else {
                final SubLObject var390 = var387;
                if (!var390.eql((SubLObject)module0369.$ic524$)) {
                    if (!var390.eql((SubLObject)module0369.$ic525$)) {
                        if (var390.eql((SubLObject)module0369.$ic526$)) {
                            final SubLObject var391 = module0427.f30304();
                            var384 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0369.$ic526$, var391), var384);
                        }
                        else if (var390.eql((SubLObject)module0369.$ic527$)) {
                            if (module0369.NIL == var385) {
                                var385 = module0412.f28693(var14);
                            }
                            var384 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0369.$ic527$, var385), var384);
                        }
                        else if (var390.eql((SubLObject)module0369.$ic528$)) {
                            if (module0369.NIL == var385) {
                                var385 = module0412.f28693(var14);
                            }
                            if (module0369.NIL != var385) {
                                var384 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0369.$ic528$, module0412.f28698(var385)), var384);
                            }
                        }
                        else if (var390.eql((SubLObject)module0369.$ic529$)) {
                            final SubLObject var392 = module0412.f28696(var14);
                            final SubLObject var393 = module0412.f28695(var392);
                            var384 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0369.$ic529$, var393), var384);
                        }
                        else if (var390.eql((SubLObject)module0369.$ic530$)) {
                            var384 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0369.$ic530$, (SubLObject)ConsesLow.list(module0361.f23996(var383), f25422(var14))), var384);
                        }
                        else {
                            Errors.sublisp_break((SubLObject)module0369.$ic531$, new SubLObject[] { var387 });
                        }
                    }
                }
            }
            var386 = var386.rest();
            var387 = var386.first();
        }
        return var384;
    }
    
    public static SubLObject f25807(final SubLObject var14) {
        assert module0369.NIL != f25275(var14) : var14;
        SubLObject var15 = module0032.f1726((SubLObject)module0369.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0369.EQL));
        final SubLObject var16 = f25492(var14);
        if (module0369.NIL == module0065.f4772(var16, (SubLObject)module0369.$ic380$)) {
            final SubLObject var158_391 = var16;
            if (module0369.NIL == module0065.f4775(var158_391, (SubLObject)module0369.$ic380$)) {
                final SubLObject var17 = module0065.f4740(var158_391);
                final SubLObject var18 = (SubLObject)module0369.NIL;
                SubLObject var19;
                SubLObject var20;
                SubLObject var21;
                SubLObject var22;
                SubLObject var23;
                SubLObject var24;
                SubLObject var89_392;
                SubLObject var25;
                for (var19 = Sequences.length(var17), var20 = (SubLObject)module0369.NIL, var20 = (SubLObject)module0369.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER)) {
                    var21 = ((module0369.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0369.ONE_INTEGER) : var20);
                    var22 = Vectors.aref(var17, var21);
                    if (module0369.NIL == module0065.f4749(var22) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                        if (module0369.NIL != module0065.f4749(var22)) {
                            var22 = (SubLObject)module0369.$ic380$;
                        }
                        var23 = f25744(var22);
                        var24 = (SubLObject)module0369.NIL;
                        var24 = var23.first();
                        while (module0369.NIL != var23) {
                            var89_392 = f25775(var24);
                            var25 = (SubLObject)module0369.NIL;
                            var25 = var89_392.first();
                            while (module0369.NIL != var89_392) {
                                if (module0369.NIL != module0178.f11290(var25)) {
                                    var15 = module0032.f1736(var25, var15, Symbols.symbol_function((SubLObject)module0369.EQL));
                                }
                                var89_392 = var89_392.rest();
                                var25 = var89_392.first();
                            }
                            var23 = var23.rest();
                            var24 = var23.first();
                        }
                    }
                }
            }
            final SubLObject var173_393 = var16;
            if (module0369.NIL == module0065.f4777(var173_393)) {
                final SubLObject var26 = module0065.f4738(var173_393);
                SubLObject var27 = (SubLObject)module0369.NIL;
                SubLObject var28 = (SubLObject)module0369.NIL;
                final Iterator var29 = Hashtables.getEntrySetIterator(var26);
                try {
                    while (Hashtables.iteratorHasNext(var29)) {
                        final Map.Entry var30 = Hashtables.iteratorNextEntry(var29);
                        var27 = Hashtables.getEntryKey(var30);
                        var28 = Hashtables.getEntryValue(var30);
                        SubLObject var31 = f25744(var28);
                        SubLObject var32 = (SubLObject)module0369.NIL;
                        var32 = var31.first();
                        while (module0369.NIL != var31) {
                            SubLObject var89_393 = f25775(var32);
                            SubLObject var33 = (SubLObject)module0369.NIL;
                            var33 = var89_393.first();
                            while (module0369.NIL != var89_393) {
                                if (module0369.NIL != module0178.f11290(var33)) {
                                    var15 = module0032.f1736(var33, var15, Symbols.symbol_function((SubLObject)module0369.EQL));
                                }
                                var89_393 = var89_393.rest();
                                var33 = var89_393.first();
                            }
                            var31 = var31.rest();
                            var32 = var31.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var29);
                }
            }
        }
        return module0032.f1753(var15);
    }
    
    public static SubLObject f25808(final SubLObject var14) {
        if (module0369.NIL != f25615(var14)) {
            final SubLObject var15 = module0077.f5313(Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED);
            final SubLObject var16 = f25492(var14);
            if (module0369.NIL == module0065.f4772(var16, (SubLObject)module0369.$ic380$)) {
                final SubLObject var158_396 = var16;
                if (module0369.NIL == module0065.f4775(var158_396, (SubLObject)module0369.$ic380$)) {
                    final SubLObject var17 = module0065.f4740(var158_396);
                    final SubLObject var18 = (SubLObject)module0369.NIL;
                    SubLObject var19;
                    SubLObject var20;
                    SubLObject var21;
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var89_397;
                    SubLObject var25;
                    for (var19 = Sequences.length(var17), var20 = (SubLObject)module0369.NIL, var20 = (SubLObject)module0369.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER)) {
                        var21 = ((module0369.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0369.ONE_INTEGER) : var20);
                        var22 = Vectors.aref(var17, var21);
                        if (module0369.NIL == module0065.f4749(var22) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                            if (module0369.NIL != module0065.f4749(var22)) {
                                var22 = (SubLObject)module0369.$ic380$;
                            }
                            var23 = f25744(var22);
                            var24 = (SubLObject)module0369.NIL;
                            var24 = var23.first();
                            while (module0369.NIL != var23) {
                                var89_397 = f25785(var24);
                                var25 = (SubLObject)module0369.NIL;
                                var25 = var89_397.first();
                                while (module0369.NIL != var89_397) {
                                    module0077.f5326(var25, var15);
                                    var89_397 = var89_397.rest();
                                    var25 = var89_397.first();
                                }
                                var23 = var23.rest();
                                var24 = var23.first();
                            }
                        }
                    }
                }
                final SubLObject var173_398 = var16;
                if (module0369.NIL == module0065.f4777(var173_398)) {
                    final SubLObject var26 = module0065.f4738(var173_398);
                    SubLObject var27 = (SubLObject)module0369.NIL;
                    SubLObject var28 = (SubLObject)module0369.NIL;
                    final Iterator var29 = Hashtables.getEntrySetIterator(var26);
                    try {
                        while (Hashtables.iteratorHasNext(var29)) {
                            final Map.Entry var30 = Hashtables.iteratorNextEntry(var29);
                            var27 = Hashtables.getEntryKey(var30);
                            var28 = Hashtables.getEntryValue(var30);
                            SubLObject var31 = f25744(var28);
                            SubLObject var32 = (SubLObject)module0369.NIL;
                            var32 = var31.first();
                            while (module0369.NIL != var31) {
                                SubLObject var89_398 = f25785(var32);
                                SubLObject var33 = (SubLObject)module0369.NIL;
                                var33 = var89_398.first();
                                while (module0369.NIL != var89_398) {
                                    module0077.f5326(var33, var15);
                                    var89_398 = var89_398.rest();
                                    var33 = var89_398.first();
                                }
                                var31 = var31.rest();
                                var32 = var31.first();
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var29);
                    }
                }
            }
            return Sort.sort(module0077.f5312(var15), Symbols.symbol_function((SubLObject)module0369.$ic409$), Symbols.symbol_function((SubLObject)module0369.$ic532$));
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25809(final SubLObject var14) {
        if (module0369.NIL != f25615(var14)) {
            SubLObject var15 = module0032.f1726((SubLObject)module0369.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0369.EQL));
            final SubLObject var16 = f25492(var14);
            if (module0369.NIL == module0065.f4772(var16, (SubLObject)module0369.$ic380$)) {
                final SubLObject var158_401 = var16;
                if (module0369.NIL == module0065.f4775(var158_401, (SubLObject)module0369.$ic380$)) {
                    final SubLObject var17 = module0065.f4740(var158_401);
                    final SubLObject var18 = (SubLObject)module0369.NIL;
                    SubLObject var19;
                    SubLObject var20;
                    SubLObject var21;
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var89_402;
                    SubLObject var25;
                    SubLObject var89_403;
                    SubLObject var26;
                    for (var19 = Sequences.length(var17), var20 = (SubLObject)module0369.NIL, var20 = (SubLObject)module0369.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER)) {
                        var21 = ((module0369.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0369.ONE_INTEGER) : var20);
                        var22 = Vectors.aref(var17, var21);
                        if (module0369.NIL == module0065.f4749(var22) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                            if (module0369.NIL != module0065.f4749(var22)) {
                                var22 = (SubLObject)module0369.$ic380$;
                            }
                            var23 = f25744(var22);
                            var24 = (SubLObject)module0369.NIL;
                            var24 = var23.first();
                            while (module0369.NIL != var23) {
                                var89_402 = f25785(var24);
                                var25 = (SubLObject)module0369.NIL;
                                var25 = var89_402.first();
                                while (module0369.NIL != var89_402) {
                                    var89_403 = module0366.f24977(var25);
                                    var26 = (SubLObject)module0369.NIL;
                                    var26 = var89_403.first();
                                    while (module0369.NIL != var89_403) {
                                        var15 = module0032.f1736(var26, var15, Symbols.symbol_function((SubLObject)module0369.EQL));
                                        var89_403 = var89_403.rest();
                                        var26 = var89_403.first();
                                    }
                                    var89_402 = var89_402.rest();
                                    var25 = var89_402.first();
                                }
                                var23 = var23.rest();
                                var24 = var23.first();
                            }
                        }
                    }
                }
                final SubLObject var173_405 = var16;
                if (module0369.NIL == module0065.f4777(var173_405)) {
                    final SubLObject var27 = module0065.f4738(var173_405);
                    SubLObject var28 = (SubLObject)module0369.NIL;
                    SubLObject var29 = (SubLObject)module0369.NIL;
                    final Iterator var30 = Hashtables.getEntrySetIterator(var27);
                    try {
                        while (Hashtables.iteratorHasNext(var30)) {
                            final Map.Entry var31 = Hashtables.iteratorNextEntry(var30);
                            var28 = Hashtables.getEntryKey(var31);
                            var29 = Hashtables.getEntryValue(var31);
                            SubLObject var32 = f25744(var29);
                            SubLObject var33 = (SubLObject)module0369.NIL;
                            var33 = var32.first();
                            while (module0369.NIL != var32) {
                                SubLObject var89_404 = f25785(var33);
                                SubLObject var34 = (SubLObject)module0369.NIL;
                                var34 = var89_404.first();
                                while (module0369.NIL != var89_404) {
                                    SubLObject var89_405 = module0366.f24977(var34);
                                    SubLObject var35 = (SubLObject)module0369.NIL;
                                    var35 = var89_405.first();
                                    while (module0369.NIL != var89_405) {
                                        var15 = module0032.f1736(var35, var15, Symbols.symbol_function((SubLObject)module0369.EQL));
                                        var89_405 = var89_405.rest();
                                        var35 = var89_405.first();
                                    }
                                    var89_404 = var89_404.rest();
                                    var34 = var89_404.first();
                                }
                                var32 = var32.rest();
                                var33 = var32.first();
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var30);
                    }
                }
            }
            return Sort.sort(module0032.f1753(var15), Symbols.symbol_function((SubLObject)module0369.$ic409$), Symbols.symbol_function((SubLObject)module0369.$ic532$));
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25810(final SubLObject var295) {
        SubLObject var296 = module0032.f1726((SubLObject)module0369.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0369.EQL));
        SubLObject var297 = f25785(var295);
        SubLObject var298 = (SubLObject)module0369.NIL;
        var298 = var297.first();
        while (module0369.NIL != var297) {
            SubLObject var89_408 = module0366.f24977(var298);
            SubLObject var299 = (SubLObject)module0369.NIL;
            var299 = var89_408.first();
            while (module0369.NIL != var89_408) {
                var296 = module0032.f1736(var299, var296, Symbols.symbol_function((SubLObject)module0369.EQL));
                var89_408 = var89_408.rest();
                var299 = var89_408.first();
            }
            var297 = var297.rest();
            var298 = var297.first();
        }
        return Sort.sort(module0032.f1753(var296), Symbols.symbol_function((SubLObject)module0369.$ic409$), Symbols.symbol_function((SubLObject)module0369.$ic532$));
    }
    
    public static SubLObject f25811(final SubLObject var14) {
        if (module0369.NIL != f25615(var14)) {
            SubLObject var15 = module0032.f1726((SubLObject)module0369.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0369.EQUAL));
            final SubLObject var16 = f25492(var14);
            if (module0369.NIL == module0065.f4772(var16, (SubLObject)module0369.$ic380$)) {
                final SubLObject var158_409 = var16;
                if (module0369.NIL == module0065.f4775(var158_409, (SubLObject)module0369.$ic380$)) {
                    final SubLObject var17 = module0065.f4740(var158_409);
                    final SubLObject var18 = (SubLObject)module0369.NIL;
                    SubLObject var19;
                    SubLObject var20;
                    SubLObject var21;
                    SubLObject var22;
                    SubLObject var23;
                    SubLObject var24;
                    SubLObject var89_410;
                    SubLObject var25;
                    for (var19 = Sequences.length(var17), var20 = (SubLObject)module0369.NIL, var20 = (SubLObject)module0369.ZERO_INTEGER; var20.numL(var19); var20 = Numbers.add(var20, (SubLObject)module0369.ONE_INTEGER)) {
                        var21 = ((module0369.NIL != var18) ? Numbers.subtract(var19, var20, (SubLObject)module0369.ONE_INTEGER) : var20);
                        var22 = Vectors.aref(var17, var21);
                        if (module0369.NIL == module0065.f4749(var22) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                            if (module0369.NIL != module0065.f4749(var22)) {
                                var22 = (SubLObject)module0369.$ic380$;
                            }
                            var23 = f25744(var22);
                            var24 = (SubLObject)module0369.NIL;
                            var24 = var23.first();
                            while (module0369.NIL != var23) {
                                var89_410 = f25775(var24);
                                var25 = (SubLObject)module0369.NIL;
                                var25 = var89_410.first();
                                while (module0369.NIL != var89_410) {
                                    var15 = module0032.f1736(var25, var15, Symbols.symbol_function((SubLObject)module0369.EQUAL));
                                    var89_410 = var89_410.rest();
                                    var25 = var89_410.first();
                                }
                                var23 = var23.rest();
                                var24 = var23.first();
                            }
                        }
                    }
                }
                final SubLObject var173_412 = var16;
                if (module0369.NIL == module0065.f4777(var173_412)) {
                    final SubLObject var26 = module0065.f4738(var173_412);
                    SubLObject var27 = (SubLObject)module0369.NIL;
                    SubLObject var28 = (SubLObject)module0369.NIL;
                    final Iterator var29 = Hashtables.getEntrySetIterator(var26);
                    try {
                        while (Hashtables.iteratorHasNext(var29)) {
                            final Map.Entry var30 = Hashtables.iteratorNextEntry(var29);
                            var27 = Hashtables.getEntryKey(var30);
                            var28 = Hashtables.getEntryValue(var30);
                            SubLObject var31 = f25744(var28);
                            SubLObject var32 = (SubLObject)module0369.NIL;
                            var32 = var31.first();
                            while (module0369.NIL != var31) {
                                SubLObject var89_411 = f25775(var32);
                                SubLObject var33 = (SubLObject)module0369.NIL;
                                var33 = var89_411.first();
                                while (module0369.NIL != var89_411) {
                                    var15 = module0032.f1736(var33, var15, Symbols.symbol_function((SubLObject)module0369.EQUAL));
                                    var89_411 = var89_411.rest();
                                    var33 = var89_411.first();
                                }
                                var31 = var31.rest();
                                var32 = var31.first();
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var29);
                    }
                }
            }
            return module0191.f11964(module0032.f1753(var15));
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25812(final SubLObject var14) {
        final SubLObject var15 = f25809(var14);
        if (module0369.NIL != var15) {
            final SubLObject var16 = module0067.f4880(Symbols.symbol_function((SubLObject)module0369.EQL), (SubLObject)module0369.UNPROVIDED);
            SubLObject var17 = var15;
            SubLObject var18 = (SubLObject)module0369.NIL;
            var18 = var17.first();
            while (module0369.NIL != var17) {
                SubLObject var19 = (SubLObject)module0369.NIL;
                if (module0369.NIL != module0373.f26177(var18)) {
                    final SubLObject var20 = module0373.f26181(var18);
                    var19 = module0340.f22825(var20);
                }
                else if (module0369.NIL != module0373.f26169(var18)) {
                    var19 = module0373.f26174(var18);
                }
                if (module0369.NIL != var19) {
                    module0084.f5775(var16, var19, (SubLObject)module0369.UNPROVIDED);
                }
                var17 = var17.rest();
                var18 = var17.first();
            }
            return Sort.sort(module0084.f5780(var16), Symbols.symbol_function((SubLObject)module0369.$ic533$), Symbols.symbol_function((SubLObject)module0369.$ic534$));
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25813(final SubLObject var293) {
        return module0035.sublisp_boolean(f25814(var293));
    }
    
    public static SubLObject f25814(final SubLObject var293) {
        final SubLObject var294 = module0363.f24507(var293);
        final SubLObject var295 = module0361.f24123(var294);
        if (module0369.NIL == module0065.f4772(var295, (SubLObject)module0369.$ic380$)) {
            final SubLObject var158_418 = var295;
            if (module0369.NIL == module0065.f4775(var158_418, (SubLObject)module0369.$ic380$)) {
                final SubLObject var296 = module0065.f4740(var158_418);
                final SubLObject var297 = (SubLObject)module0369.NIL;
                SubLObject var298;
                SubLObject var299;
                SubLObject var300;
                SubLObject var301;
                SubLObject var302;
                SubLObject var303;
                SubLObject var304;
                SubLObject var305;
                SubLObject var306;
                for (var298 = Sequences.length(var296), var299 = (SubLObject)module0369.NIL, var299 = (SubLObject)module0369.ZERO_INTEGER; var299.numL(var298); var299 = Numbers.add(var299, (SubLObject)module0369.ONE_INTEGER)) {
                    var300 = ((module0369.NIL != var297) ? Numbers.subtract(var298, var299, (SubLObject)module0369.ONE_INTEGER) : var299);
                    var301 = Vectors.aref(var296, var300);
                    if (module0369.NIL == module0065.f4749(var301) || module0369.NIL == module0065.f4773((SubLObject)module0369.$ic380$)) {
                        if (module0369.NIL != module0065.f4749(var301)) {
                            var301 = (SubLObject)module0369.$ic380$;
                        }
                        if (module0369.NIL != module0363.f24547(var293, var301)) {
                            var302 = var301;
                            var303 = module0077.f5333(f25473(var302));
                            for (var304 = module0032.f1741(var303), var305 = (SubLObject)module0369.NIL, var305 = module0032.f1742(var304, var303); module0369.NIL == module0032.f1744(var304, var305); var305 = module0032.f1743(var305)) {
                                var306 = module0032.f1745(var304, var305);
                                if (module0369.NIL != module0032.f1746(var305, var306)) {
                                    return var306;
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var173_420 = var295;
            if (module0369.NIL == module0065.f4777(var173_420)) {
                final SubLObject var307 = module0065.f4738(var173_420);
                SubLObject var308 = (SubLObject)module0369.NIL;
                SubLObject var309 = (SubLObject)module0369.NIL;
                final Iterator var310 = Hashtables.getEntrySetIterator(var307);
                try {
                    while (Hashtables.iteratorHasNext(var310)) {
                        final Map.Entry var311 = Hashtables.iteratorNextEntry(var310);
                        var308 = Hashtables.getEntryKey(var311);
                        var309 = Hashtables.getEntryValue(var311);
                        if (module0369.NIL != module0363.f24547(var293, var309)) {
                            final SubLObject var312 = var309;
                            final SubLObject var313 = module0077.f5333(f25473(var312));
                            SubLObject var314;
                            SubLObject var315;
                            SubLObject var316;
                            for (var314 = module0032.f1741(var313), var315 = (SubLObject)module0369.NIL, var315 = module0032.f1742(var314, var313); module0369.NIL == module0032.f1744(var314, var315); var315 = module0032.f1743(var315)) {
                                var316 = module0032.f1745(var314, var315);
                                if (module0369.NIL != module0032.f1746(var315, var316)) {
                                    return var316;
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var310);
                }
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25815(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0369.NIL != module0363.f24478(var1) || module0369.NIL != f25275(var1));
    }
    
    public static SubLObject f25816(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic535$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = (SubLObject)module0369.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic535$);
        var23 = var21.first();
        var21 = var21.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic535$);
        var24 = var21.first();
        var21 = var21.rest();
        if (module0369.NIL == var21) {
            final SubLObject var25;
            var21 = (var25 = var22);
            final SubLObject var26 = (SubLObject)module0369.$ic536$;
            return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, var24)), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic537$, (SubLObject)ConsesLow.list(var26), (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic538$, var26))), ConsesLow.append(var25, (SubLObject)module0369.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic535$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25480(final SubLObject var14) {
        final SubLObject var15 = f25534(var14);
        return var15.first();
    }
    
    public static SubLObject f25817(final SubLObject var14) {
        final SubLObject var15 = f25534(var14);
        return conses_high.second(var15);
    }
    
    public static SubLObject f25676(final SubLObject var14) {
        final SubLObject var15 = Locks.make_lock((SubLObject)module0369.$ic539$);
        final SubLObject var16 = Hashtables.make_hash_table((SubLObject)module0369.$ic11$, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED);
        final SubLObject var17 = (SubLObject)ConsesLow.list(var15, var16);
        f25577(var14, var17);
        return var17;
    }
    
    public static SubLObject f25818(final SubLObject var14, final SubLObject var426) {
        SubLObject var427 = (SubLObject)module0369.NIL;
        if (module0369.NIL != f25638(var14)) {
            final SubLObject var428 = module0365.f24850(var426);
            final SubLObject var429 = Time.get_internal_real_time();
            final SubLObject var430 = f25480(var14);
            SubLObject var431 = (SubLObject)module0369.NIL;
            try {
                var431 = Locks.seize_lock(var430);
                final SubLObject var432 = f25817(var14);
                final SubLObject var433 = Hashtables.gethash_without_values(var428, var432, (SubLObject)module0369.UNPROVIDED);
                if (module0369.NIL == var433) {
                    Hashtables.sethash(var428, var432, var429);
                    var427 = (SubLObject)module0369.T;
                }
            }
            finally {
                if (module0369.NIL != var431) {
                    Locks.release_lock(var430);
                }
            }
        }
        return var427;
    }
    
    public static SubLObject f25819(final SubLObject var14, final SubLObject var293) {
        SubLObject var294 = (SubLObject)module0369.NIL;
        if (module0369.NIL != f25638(var14)) {
            final SubLObject var295 = f25480(var14);
            SubLObject var296 = (SubLObject)module0369.NIL;
            try {
                var296 = Locks.seize_lock(var295);
                final SubLObject var297 = f25817(var14);
                Hashtables.remhash(var293, var297);
                var294 = (SubLObject)module0369.T;
            }
            finally {
                if (module0369.NIL != var296) {
                    Locks.release_lock(var295);
                }
            }
        }
        return var294;
    }
    
    public static SubLObject f25820(final SubLObject var14, final SubLObject var433) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0360.f23974(var433) : var433;
        return module0035.f2169(var433, f25535(var14));
    }
    
    public static SubLObject f25738(final SubLObject var14, final SubLObject var434) {
        if (module0369.NIL != f25820(var14, (SubLObject)module0369.$ic540$)) {
            return f25821(var14, var434);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25821(final SubLObject var14, final SubLObject var434) {
        final SubLObject var435 = module0361.f23996(f25421(var14));
        final SubLObject var436 = f25422(var14);
        final SubLObject var437 = f25629(var434);
        return module0356.f23613(var435, var436, var437);
    }
    
    public static SubLObject f25553(final SubLObject var14) {
        if (module0369.NIL != f25820(var14, (SubLObject)module0369.$ic541$)) {
            return f25822(var14, f25420(var14));
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25822(final SubLObject var14, final SubLObject var436) {
        final SubLObject var437 = module0361.f23996(f25421(var14));
        final SubLObject var438 = f25422(var14);
        return module0356.f23619(var437, var438, var436);
    }
    
    public static SubLObject f25652(final SubLObject var14, final SubLObject var437) {
        if (module0369.NIL != f25820(var14, (SubLObject)module0369.$ic542$)) {
            return f25823(var14, var437);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25823(final SubLObject var14, final SubLObject var437) {
        final SubLObject var438 = module0361.f23996(f25421(var14));
        final SubLObject var439 = f25422(var14);
        return module0356.f23623(var438, var439, var437);
    }
    
    public static SubLObject f25824(final SubLObject var18, final SubLObject var19) {
        final SubLObject var20 = var18.rest();
        final SubLObject var22;
        final SubLObject var21 = var22 = var20;
        final SubLObject var23 = (SubLObject)module0369.$ic543$;
        final SubLObject var24 = (SubLObject)module0369.$ic544$;
        final SubLObject var25 = (SubLObject)module0369.$ic545$;
        final SubLObject var26 = (SubLObject)module0369.$ic546$;
        return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list(reader.bq_cons(var23, (SubLObject)module0369.$ic547$), reader.bq_cons(var24, (SubLObject)module0369.$ic548$), reader.bq_cons(var25, (SubLObject)module0369.$ic549$), var26), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic550$, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic551$, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic552$, var24, var25), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic313$, var26, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic553$, var24, (SubLObject)module0369.$ic554$)), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic555$, var23, var26), ConsesLow.append(var22, (SubLObject)module0369.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic556$, var24, var25), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic557$, var23, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic558$, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic553$, var24, (SubLObject)module0369.$ic554$), var26))));
    }
    
    public static SubLObject f25825(final SubLObject var14, final SubLObject var426) {
        if (module0369.NIL != var14 && module0369.NIL != var426) {
            final SubLObject var427 = f25702(var14, (SubLObject)module0369.NIL);
            final SubLObject var428 = (SubLObject)ConsesLow.list((SubLObject)module0369.$ic560$, var427);
            return f25826(var14, var426, (SubLObject)module0369.$ic561$, var428);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25827(final SubLObject var14, final SubLObject var426) {
        if (module0369.NIL != var14 && module0369.NIL != var426) {
            final SubLObject var427 = f25702(var14, (SubLObject)module0369.NIL);
            final SubLObject var428 = (SubLObject)ConsesLow.list((SubLObject)module0369.$ic562$, var427);
            return f25826(var14, var426, (SubLObject)module0369.$ic271$, var428);
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25828(final SubLObject var88, final SubLObject var233) {
        if (module0369.NIL != var88 && module0369.NIL != var233) {
            SubLObject var234 = var88;
            SubLObject var235 = (SubLObject)module0369.NIL;
            var235 = var234.first();
            while (module0369.NIL != var234) {
                if (module0369.NIL != f25602(var235, (SubLObject)module0369.$ic563$)) {
                    return f25829(var235, var233);
                }
                var234 = var234.rest();
                var235 = var234.first();
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25830(final SubLObject var88, final SubLObject var233) {
        if (module0369.NIL != var88 && module0369.NIL != var233) {
            SubLObject var234 = var88;
            SubLObject var235 = (SubLObject)module0369.NIL;
            var235 = var234.first();
            while (module0369.NIL != var234) {
                if (module0369.NIL != f25602(var235, (SubLObject)module0369.$ic564$)) {
                    return f25831(var235, var233);
                }
                var234 = var234.rest();
                var235 = var234.first();
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25826(final SubLObject var14, final SubLObject var426, final SubLObject var16, SubLObject var442) {
        if (var442 == module0369.UNPROVIDED) {
            var442 = (SubLObject)module0369.NIL;
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25832(final SubLObject var18, final SubLObject var19) {
        SubLObject var21;
        final SubLObject var20 = var21 = var18.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0369.$ic565$);
        final SubLObject var22 = var21.rest();
        var21 = var21.first();
        SubLObject var23 = (SubLObject)module0369.NIL;
        SubLObject var24 = var21;
        SubLObject var25 = (SubLObject)module0369.NIL;
        SubLObject var449_450 = (SubLObject)module0369.NIL;
        while (module0369.NIL != var24) {
            cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)module0369.$ic565$);
            var449_450 = var24.first();
            var24 = var24.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)module0369.$ic565$);
            if (module0369.NIL == conses_high.member(var449_450, (SubLObject)module0369.$ic566$, (SubLObject)module0369.UNPROVIDED, (SubLObject)module0369.UNPROVIDED)) {
                var25 = (SubLObject)module0369.T;
            }
            if (var449_450 == module0369.$ic302$) {
                var23 = var24.first();
            }
            var24 = var24.rest();
        }
        if (module0369.NIL != var25 && module0369.NIL == var23) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)module0369.$ic565$);
        }
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0369.$ic567$, var21);
        final SubLObject var27 = (SubLObject)((module0369.NIL != var26) ? conses_high.cadr(var26) : module0369.NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0369.$ic568$, var21);
        final SubLObject var29 = (SubLObject)((module0369.NIL != var28) ? conses_high.cadr(var28) : module0369.NIL);
        final SubLObject var30;
        var21 = (var30 = var22);
        final SubLObject var31 = (SubLObject)module0369.$ic569$;
        final SubLObject var32 = (SubLObject)module0369.$ic570$;
        final SubLObject var33 = (SubLObject)module0369.$ic571$;
        final SubLObject var34 = (SubLObject)module0369.$ic572$;
        final SubLObject var35 = (SubLObject)module0369.$ic573$;
        return (SubLObject)ConsesLow.list((SubLObject)module0369.$ic293$, (SubLObject)ConsesLow.list(reader.bq_cons(var31, (SubLObject)module0369.$ic547$), (SubLObject)ConsesLow.list(var32, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic574$, var31)), var33, var34, var35), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic550$, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic551$, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic313$, var33, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic575$, var32, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic576$, var32, (SubLObject)module0369.$ic554$))), ConsesLow.append(var30, (SubLObject)module0369.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic313$, var34, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic575$, var32, (SubLObject)ConsesLow.listS((SubLObject)module0369.$ic576$, var32, (SubLObject)module0369.$ic554$))), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic313$, var35, (SubLObject)ConsesLow.list((SubLObject)module0369.$ic577$, var29)), (SubLObject)ConsesLow.list((SubLObject)module0369.$ic578$, var31, var33, var34, var35)));
    }
    
    public static SubLObject f25833(final SubLObject var88, final SubLObject var303, final SubLObject var305, final SubLObject var235) {
        if (module0369.NIL != var88 && module0369.NIL != var303 && module0369.NIL != var305 && module0369.NIL != var235) {
            SubLObject var306 = var88;
            SubLObject var307 = (SubLObject)module0369.NIL;
            var307 = var306.first();
            while (module0369.NIL != var306) {
                if (module0369.NIL != f25602(var307, (SubLObject)module0369.$ic580$)) {
                    final SubLObject var308 = (SubLObject)ConsesLow.list(var303, var305, var235);
                    return f25834(var307, var308);
                }
                var306 = var306.rest();
                var307 = var306.first();
            }
        }
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25829(final SubLObject var14, final SubLObject var233) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0048.f3294(var233) : var233;
        return f25643(var14, (SubLObject)module0369.$ic581$, var233);
    }
    
    public static SubLObject f25831(final SubLObject var14, final SubLObject var233) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != module0048.f3294(var233) : var233;
        return f25643(var14, (SubLObject)module0369.$ic582$, var233);
    }
    
    public static SubLObject f25834(final SubLObject var14, final SubLObject var455) {
        assert module0369.NIL != f25275(var14) : var14;
        assert module0369.NIL != Types.listp(var455) : var455;
        assert module0369.NIL != module0035.f2015(var455) : var455;
        SubLObject var456 = var455;
        SubLObject var457 = (SubLObject)module0369.NIL;
        var457 = var456.first();
        while (module0369.NIL != var456) {
            assert module0369.NIL != module0048.f3294(var457) : var457;
            var456 = var456.rest();
            var457 = var456.first();
        }
        return f25643(var14, (SubLObject)module0369.$ic583$, var455);
    }
    
    public static SubLObject f25835() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25272", "S#28224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25273", "S#28225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25275", "INFERENCE-P", 1, 0, false);
        new $f25275$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25276", "S#28226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25277", "S#28227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25278", "S#28228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25279", "S#28229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25280", "S#28230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25281", "S#28231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25282", "S#28232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25283", "S#28233", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25284", "S#28234", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25285", "S#28235", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25286", "S#28236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25287", "S#28237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25288", "S#28238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25289", "S#28239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25290", "S#28240", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25291", "S#28241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25292", "S#28242", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25293", "S#28243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25294", "S#28244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25295", "S#28245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25296", "S#28246", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25297", "S#28247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25298", "S#28248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25299", "S#28249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25300", "S#28250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25301", "S#28251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25302", "S#28252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25303", "S#28253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25304", "S#28254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25305", "S#28255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25306", "S#28256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25307", "S#28257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25308", "S#28258", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25309", "S#28259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25310", "S#28260", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25311", "S#28261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25312", "S#28262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25313", "S#28263", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25314", "S#28264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25315", "S#28265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25316", "S#28266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25317", "S#28267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25318", "S#28268", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25319", "S#28269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25320", "S#28270", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25321", "S#28271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25322", "S#28272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25323", "S#28273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25324", "S#28274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25325", "S#28275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25326", "S#28276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25327", "S#28277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25328", "S#28278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25329", "S#28279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25330", "S#28280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25331", "S#28281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25332", "S#28282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25333", "S#28283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25334", "S#28284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25335", "S#28285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25336", "S#28286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25337", "S#28287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25338", "S#28288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25339", "S#28289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25340", "S#28290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25341", "S#28291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25342", "S#28292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25343", "S#28293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25344", "S#28294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25345", "S#28295", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25346", "S#28296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25347", "S#28297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25348", "S#28298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25349", "S#28299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25350", "S#28300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25351", "S#28301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25352", "S#28302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25353", "S#28303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25354", "S#28304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25355", "S#28305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25356", "S#28306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25357", "S#28307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25358", "S#28308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25359", "S#28309", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25360", "S#28310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25361", "S#28311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25362", "S#28312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25363", "S#28313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25364", "S#28314", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25365", "S#28315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25366", "S#28316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25367", "S#28317", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25368", "S#28318", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25369", "S#28319", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25370", "S#28320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25371", "S#28321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25372", "S#28322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25373", "S#28323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25374", "S#28324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25375", "S#28325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25376", "S#28326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25377", "S#28327", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25378", "S#28328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25379", "S#28329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25380", "S#28330", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25381", "S#28331", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25382", "S#28332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25383", "S#28333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25384", "S#28334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25385", "S#28335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25386", "S#28336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25387", "S#28337", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25388", "S#28338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25389", "S#28339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25390", "S#28340", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25391", "S#28341", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25392", "S#28342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25393", "S#28343", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25394", "S#28344", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25395", "S#28345", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25396", "S#28346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25397", "S#28347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25398", "S#28348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25399", "S#28349", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25400", "S#28350", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25401", "S#28351", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25402", "S#28352", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25403", "S#28353", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25404", "S#28354", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25405", "S#28355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25406", "S#28356", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25407", "S#28357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25408", "S#28358", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25409", "S#28359", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25410", "S#28360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25411", "S#28361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25412", "S#28362", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25413", "S#28363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25414", "S#28364", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25415", "S#28365", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25416", "S#28366", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25417", "S#27365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25419", "S#28367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25418", "S#28368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25274", "S#28369", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25425", "S#28197", 1, 0, false);
        new $f25425$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25426", "S#28370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25427", "S#28371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25428", "S#28372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25429", "S#28373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25430", "S#28374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25431", "S#28375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25434", "S#28376", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25435", "S#28377");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25436", "S#28378");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25437", "S#28379");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25438", "S#28380");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25439", "S#28381");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25440", "S#28382");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25441", "S#28383");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25442", "S#28384");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25443", "S#28385");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25444", "S#28386");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25445", "S#28387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25468", "S#28388", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25469", "S#28389", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25471", "DESTROY-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25476", "S#25401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25477", "S#26785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25475", "S#28390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25472", "S#28391", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25422", "INFERENCE-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25421", "INFERENCE-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25481", "S#28392", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25424", "S#28393", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25423", "INFERENCE-INPUT-EL-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25482", "S#28394", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25483", "S#26486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25484", "S#28395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25485", "S#28396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25486", "S#28397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25487", "S#28398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25488", "S#28399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25489", "S#28400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25490", "S#28401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25491", "S#28402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25492", "S#28403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25493", "S#28404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25494", "S#28405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25495", "S#28406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25420", "S#28407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25433", "S#28408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25474", "S#27901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25496", "S#27366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25473", "S#27288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25497", "S#28409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25498", "S#28410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25499", "S#28411", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25500", "S#28412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25501", "S#28413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25502", "S#28414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25503", "S#28415", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25504", "S#27906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25505", "S#28416", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25506", "S#28417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25507", "S#28418", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25508", "S#28419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25509", "S#28420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25510", "S#28421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25511", "S#28422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25512", "S#28423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25513", "S#28424", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25514", "S#26791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25432", "S#27905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25515", "S#28425", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25516", "S#28426", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25517", "S#28427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25518", "S#28428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25519", "S#28429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25520", "S#28430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25521", "S#28431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25522", "S#28432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25523", "S#28433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25524", "S#28434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25525", "S#28435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25526", "S#28436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25527", "S#28437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25528", "S#28438", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25529", "S#28439", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25530", "S#28440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25531", "S#28441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25532", "S#28442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25533", "S#28443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25534", "S#28444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25535", "S#28445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25536", "S#28446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25537", "S#28447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25538", "S#28448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25539", "S#28449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25540", "S#28450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25541", "S#28451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25542", "S#28452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25543", "S#28453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25544", "S#28454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25545", "S#28455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25546", "S#28456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25547", "S#28457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25548", "S#28458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25549", "S#28459", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25550", "S#28460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25551", "S#28461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25552", "S#28462", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25447", "S#28463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25554", "S#28464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25555", "S#28465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25556", "S#28466", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25557", "S#28467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25450", "S#28468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25558", "S#28469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25559", "S#28470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25560", "S#28471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25561", "S#28472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25562", "S#28473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25563", "S#28474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25564", "S#28475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25565", "S#28476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25566", "S#28477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25567", "S#28478", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25568", "S#28479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25452", "S#28480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25453", "S#28481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25569", "S#28482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25449", "S#28483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25451", "S#28484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25570", "S#28485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25467", "S#28486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25454", "S#28487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25455", "S#28488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25456", "S#28489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25457", "S#28490", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25458", "S#28491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25462", "S#28492", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25463", "S#28493", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25464", "S#28494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25465", "S#28495", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25466", "S#28496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25571", "S#28497", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25572", "S#28498", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25573", "S#28499", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25574", "S#28500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25459", "S#28501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25460", "S#28502", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25575", "S#28503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25461", "S#28504", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25576", "S#28505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25577", "S#28506", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25578", "S#28507", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25579", "S#28508", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25580", "S#28509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25581", "S#28510", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25582", "S#28511", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25584", "S#28512");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25583", "S#28513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25470", "S#28514", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25585", "S#28515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25586", "S#28516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25587", "INFERENCE-HL-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25588", "S#28517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25589", "S#28518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25590", "S#28519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25591", "S#28520", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25592", "S#28521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25593", "S#28522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25594", "S#28523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25595", "S#28524", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25596", "S#28525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25597", "INFERENCE-ROOT-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25598", "S#28526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25599", "S#28527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25600", "S#28528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25601", "S#28529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25602", "S#28530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25603", "S#28531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25604", "S#28532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25607", "S#28533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25608", "S#28534", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25609", "S#28535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25612", "S#28536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25613", "S#28537", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25614", "S#28538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25615", "S#27904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25616", "FIND-INFERENCE-ANSWER-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25617", "FIND-INFERENCE-ANSWER-BY-IDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25618", "S#28539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25620", "S#28540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25619", "S#28541", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25622", "S#28542", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25624", "S#28543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25626", "S#28544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25627", "S#28545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25628", "S#28546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25630", "S#28547", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25632", "S#28548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25633", "S#28549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25634", "S#28550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25635", "S#28551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25636", "S#28552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25637", "S#28553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25638", "S#28554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25639", "S#28555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25640", "S#28556", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25641", "S#28557", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25642", "S#28558", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25643", "S#28559", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25644", "S#28560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25645", "S#28561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25647", "S#9535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25648", "PAD-TABLE-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25646", "S#28562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25649", "S#28563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25650", "S#27390", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25651", "S#28564", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25654", "S#28565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25655", "S#28566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25656", "INFERENCE-ALL-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25657", "S#28567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25610", "S#28568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25658", "S#28569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25611", "S#28570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25659", "S#28571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25660", "S#28572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25661", "S#28573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25662", "S#28574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25653", "S#28575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25663", "S#28576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25664", "S#28577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25665", "S#28578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25666", "S#28579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25667", "S#28580", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25668", "S#28581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25669", "S#28582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25670", "S#28583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25671", "S#28584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25672", "S#28585", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25673", "S#28586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25674", "S#28587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25675", "S#28588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25677", "S#28589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25678", "S#28590", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25679", "S#28591", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25478", "S#28592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25680", "S#27898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25681", "S#27899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25479", "S#28593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25682", "S#28594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25621", "S#28595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25683", "S#28596", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25685", "S#28597", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25686", "S#28598", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25688", "S#28599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25689", "S#28600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25690", "S#28601", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25692", "S#28602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25448", "S#28603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25693", "S#28604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25694", "S#28605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25695", "S#28606", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25696", "S#28607", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25697", "S#28608", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25446", "S#28609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25698", "S#28610", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25699", "S#28611", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25700", "S#28612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25701", "S#28613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25703", "S#28614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25704", "S#28615", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25702", "S#28616", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25705", "S#28617", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25706", "S#28618", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25707", "S#28619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25708", "S#28620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25605", "S#28621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25709", "S#28622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25606", "SIMPLEST-INFERENCE-STRATEGY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25710", "S#28623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25711", "S#28624", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25712", "S#28625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25713", "S#28626", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25684", "INFERENCE-ANSWER-P", 1, 0, false);
        new $f25684$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25715", "S#28627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25716", "S#28628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25717", "S#28629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25718", "S#28630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25719", "S#28631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25720", "S#28632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25721", "S#28633", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25722", "S#28634", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25723", "S#28635", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25724", "S#28636", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25725", "S#28637", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25726", "S#28638", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25727", "S#28639", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25728", "S#28640", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25729", "S#28641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25730", "S#28642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25731", "S#28643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25714", "S#28644", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25733", "S#28645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25734", "S#28646", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25739", "S#28647", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25740", "S#28648");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25741", "S#28649");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25742", "S#28650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25746", "S#28651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25743", "S#28652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25629", "S#28653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25732", "S#28654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25687", "S#28655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25744", "INFERENCE-ANSWER-JUSTIFICATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25631", "S#28656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25625", "S#28657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25735", "S#28658", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25747", "S#28659", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25737", "S#28660", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25748", "S#28661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25749", "S#28662", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25623", "S#28663", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25750", "S#28664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25751", "S#28665", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25752", "S#28666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25753", "INFERENCE-ANSWER-BINDINGS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25754", "S#28667", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25755", "S#28668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25756", "INFERENCE-ANSWER-EL-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25757", "S#28669", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25758", "S#28670", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25759", "S#28671", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25736", "S#28672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25760", "S#28673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25691", "S#28215", 1, 0, false);
        new $f25691$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25762", "S#28674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25763", "S#28675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25764", "S#28676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25765", "S#28677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25766", "S#28678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25767", "S#28679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25768", "S#28680", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25769", "S#28681", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25770", "S#28682", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25771", "S#28683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25772", "S#28684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25773", "S#28685", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25774", "S#28686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25761", "S#28687", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25776", "S#28688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25777", "S#28689", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25778", "S#28690", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25779", "S#28691", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25745", "S#28692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25783", "S#28693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25780", "S#28694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25782", "S#28695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25775", "INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS", 1, 0, false);
        new $f25775$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25784", "S#28696", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25785", "INFERENCE-ANSWER-JUSTIFICATION-PROOFS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25786", "S#28697");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25787", "S#28698");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25788", "S#28699");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25789", "S#28700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25790", "S#28701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25791", "S#28702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25781", "S#28703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25792", "S#28704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25793", "S#28705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25794", "S#28706", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25795", "S#28707", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25796", "S#28708", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25797", "S#28709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25798", "S#28710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25799", "S#27814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25800", "S#28711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25801", "S#28712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25802", "S#28713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25803", "S#28714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25804", "S#28715", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25806", "S#28716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25805", "S#28717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25807", "S#28718", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25808", "S#28719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25809", "S#28720", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25810", "S#28721", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25811", "S#28722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25812", "S#28723", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25813", "S#28724", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25814", "S#28725", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25815", "S#28726", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25816", "S#28727");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25480", "S#28728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25817", "S#28729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25676", "S#28730", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25818", "S#28731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25819", "S#28732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25820", "S#28733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25738", "S#28734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25821", "S#28735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25553", "S#28736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25822", "S#28737", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25652", "S#28738", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25823", "S#28739", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25824", "S#28740");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25825", "S#28741", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25827", "S#28742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25828", "S#28743", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25830", "S#28744", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25826", "S#28745", 3, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0369", "f25832", "S#28746");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25833", "S#28747", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25829", "S#28748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25831", "S#28749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0369", "f25834", "S#28750", 2, 0, false);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25836() {
        module0369.$g3148$ = SubLFiles.deflexical("S#28751", (SubLObject)module0369.$ic0$);
        module0369.$g3149$ = SubLFiles.defconstant("S#28752", (SubLObject)module0369.$ic1$);
        module0369.$g3150$ = SubLFiles.deflexical("S#28753", (SubLObject)((module0369.NIL != Symbols.boundp((SubLObject)module0369.$ic406$)) ? module0369.$g3150$.getGlobalValue() : module0369.$ic407$));
        module0369.$g3151$ = SubLFiles.defconstant("S#28754", (SubLObject)module0369.$ic431$);
        module0369.$g3152$ = SubLFiles.defconstant("S#28755", (SubLObject)module0369.$ic471$);
        return (SubLObject)module0369.NIL;
    }
    
    public static SubLObject f25837() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0369.$g3149$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic58$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0369.$ic59$);
        Structures.def_csetf((SubLObject)module0369.$ic60$, (SubLObject)module0369.$ic61$);
        Structures.def_csetf((SubLObject)module0369.$ic62$, (SubLObject)module0369.$ic63$);
        Structures.def_csetf((SubLObject)module0369.$ic64$, (SubLObject)module0369.$ic65$);
        Structures.def_csetf((SubLObject)module0369.$ic66$, (SubLObject)module0369.$ic67$);
        Structures.def_csetf((SubLObject)module0369.$ic68$, (SubLObject)module0369.$ic69$);
        Structures.def_csetf((SubLObject)module0369.$ic70$, (SubLObject)module0369.$ic71$);
        Structures.def_csetf((SubLObject)module0369.$ic72$, (SubLObject)module0369.$ic73$);
        Structures.def_csetf((SubLObject)module0369.$ic74$, (SubLObject)module0369.$ic75$);
        Structures.def_csetf((SubLObject)module0369.$ic76$, (SubLObject)module0369.$ic77$);
        Structures.def_csetf((SubLObject)module0369.$ic78$, (SubLObject)module0369.$ic79$);
        Structures.def_csetf((SubLObject)module0369.$ic80$, (SubLObject)module0369.$ic81$);
        Structures.def_csetf((SubLObject)module0369.$ic82$, (SubLObject)module0369.$ic83$);
        Structures.def_csetf((SubLObject)module0369.$ic84$, (SubLObject)module0369.$ic85$);
        Structures.def_csetf((SubLObject)module0369.$ic86$, (SubLObject)module0369.$ic87$);
        Structures.def_csetf((SubLObject)module0369.$ic88$, (SubLObject)module0369.$ic89$);
        Structures.def_csetf((SubLObject)module0369.$ic90$, (SubLObject)module0369.$ic91$);
        Structures.def_csetf((SubLObject)module0369.$ic92$, (SubLObject)module0369.$ic93$);
        Structures.def_csetf((SubLObject)module0369.$ic94$, (SubLObject)module0369.$ic95$);
        Structures.def_csetf((SubLObject)module0369.$ic96$, (SubLObject)module0369.$ic97$);
        Structures.def_csetf((SubLObject)module0369.$ic98$, (SubLObject)module0369.$ic99$);
        Structures.def_csetf((SubLObject)module0369.$ic100$, (SubLObject)module0369.$ic101$);
        Structures.def_csetf((SubLObject)module0369.$ic102$, (SubLObject)module0369.$ic103$);
        Structures.def_csetf((SubLObject)module0369.$ic104$, (SubLObject)module0369.$ic105$);
        Structures.def_csetf((SubLObject)module0369.$ic106$, (SubLObject)module0369.$ic107$);
        Structures.def_csetf((SubLObject)module0369.$ic108$, (SubLObject)module0369.$ic109$);
        Structures.def_csetf((SubLObject)module0369.$ic110$, (SubLObject)module0369.$ic111$);
        Structures.def_csetf((SubLObject)module0369.$ic112$, (SubLObject)module0369.$ic113$);
        Structures.def_csetf((SubLObject)module0369.$ic114$, (SubLObject)module0369.$ic115$);
        Structures.def_csetf((SubLObject)module0369.$ic116$, (SubLObject)module0369.$ic117$);
        Structures.def_csetf((SubLObject)module0369.$ic118$, (SubLObject)module0369.$ic119$);
        Structures.def_csetf((SubLObject)module0369.$ic120$, (SubLObject)module0369.$ic121$);
        Structures.def_csetf((SubLObject)module0369.$ic122$, (SubLObject)module0369.$ic123$);
        Structures.def_csetf((SubLObject)module0369.$ic124$, (SubLObject)module0369.$ic125$);
        Structures.def_csetf((SubLObject)module0369.$ic126$, (SubLObject)module0369.$ic127$);
        Structures.def_csetf((SubLObject)module0369.$ic128$, (SubLObject)module0369.$ic129$);
        Structures.def_csetf((SubLObject)module0369.$ic130$, (SubLObject)module0369.$ic131$);
        Structures.def_csetf((SubLObject)module0369.$ic132$, (SubLObject)module0369.$ic133$);
        Structures.def_csetf((SubLObject)module0369.$ic134$, (SubLObject)module0369.$ic135$);
        Structures.def_csetf((SubLObject)module0369.$ic136$, (SubLObject)module0369.$ic137$);
        Structures.def_csetf((SubLObject)module0369.$ic138$, (SubLObject)module0369.$ic139$);
        Structures.def_csetf((SubLObject)module0369.$ic140$, (SubLObject)module0369.$ic141$);
        Structures.def_csetf((SubLObject)module0369.$ic142$, (SubLObject)module0369.$ic143$);
        Structures.def_csetf((SubLObject)module0369.$ic144$, (SubLObject)module0369.$ic145$);
        Structures.def_csetf((SubLObject)module0369.$ic146$, (SubLObject)module0369.$ic147$);
        Structures.def_csetf((SubLObject)module0369.$ic148$, (SubLObject)module0369.$ic149$);
        Structures.def_csetf((SubLObject)module0369.$ic150$, (SubLObject)module0369.$ic151$);
        Structures.def_csetf((SubLObject)module0369.$ic152$, (SubLObject)module0369.$ic153$);
        Structures.def_csetf((SubLObject)module0369.$ic154$, (SubLObject)module0369.$ic155$);
        Structures.def_csetf((SubLObject)module0369.$ic156$, (SubLObject)module0369.$ic157$);
        Structures.def_csetf((SubLObject)module0369.$ic158$, (SubLObject)module0369.$ic159$);
        Structures.def_csetf((SubLObject)module0369.$ic160$, (SubLObject)module0369.$ic161$);
        Structures.def_csetf((SubLObject)module0369.$ic162$, (SubLObject)module0369.$ic163$);
        Structures.def_csetf((SubLObject)module0369.$ic164$, (SubLObject)module0369.$ic165$);
        Structures.def_csetf((SubLObject)module0369.$ic166$, (SubLObject)module0369.$ic167$);
        Structures.def_csetf((SubLObject)module0369.$ic168$, (SubLObject)module0369.$ic169$);
        Structures.def_csetf((SubLObject)module0369.$ic170$, (SubLObject)module0369.$ic171$);
        Structures.def_csetf((SubLObject)module0369.$ic172$, (SubLObject)module0369.$ic173$);
        Structures.def_csetf((SubLObject)module0369.$ic174$, (SubLObject)module0369.$ic175$);
        Structures.def_csetf((SubLObject)module0369.$ic176$, (SubLObject)module0369.$ic177$);
        Structures.def_csetf((SubLObject)module0369.$ic178$, (SubLObject)module0369.$ic179$);
        Structures.def_csetf((SubLObject)module0369.$ic180$, (SubLObject)module0369.$ic181$);
        Structures.def_csetf((SubLObject)module0369.$ic182$, (SubLObject)module0369.$ic183$);
        Structures.def_csetf((SubLObject)module0369.$ic184$, (SubLObject)module0369.$ic185$);
        Structures.def_csetf((SubLObject)module0369.$ic186$, (SubLObject)module0369.$ic187$);
        Structures.def_csetf((SubLObject)module0369.$ic188$, (SubLObject)module0369.$ic189$);
        Structures.def_csetf((SubLObject)module0369.$ic190$, (SubLObject)module0369.$ic191$);
        Structures.def_csetf((SubLObject)module0369.$ic192$, (SubLObject)module0369.$ic193$);
        Structures.def_csetf((SubLObject)module0369.$ic194$, (SubLObject)module0369.$ic195$);
        Structures.def_csetf((SubLObject)module0369.$ic196$, (SubLObject)module0369.$ic197$);
        Equality.identity((SubLObject)module0369.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0369.$g3149$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic272$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0369.$g3149$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic276$));
        module0002.f50((SubLObject)module0369.$ic306$, (SubLObject)module0369.$ic315$);
        module0002.f50((SubLObject)module0369.$ic294$, (SubLObject)module0369.$ic339$);
        module0002.f50((SubLObject)module0369.$ic287$, (SubLObject)module0369.$ic340$);
        module0003.f57((SubLObject)module0369.$ic406$);
        module0002.f50((SubLObject)module0369.$ic295$, (SubLObject)module0369.$ic339$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0369.$g3151$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic437$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0369.$ic438$);
        Structures.def_csetf((SubLObject)module0369.$ic439$, (SubLObject)module0369.$ic440$);
        Structures.def_csetf((SubLObject)module0369.$ic441$, (SubLObject)module0369.$ic442$);
        Structures.def_csetf((SubLObject)module0369.$ic443$, (SubLObject)module0369.$ic444$);
        Structures.def_csetf((SubLObject)module0369.$ic445$, (SubLObject)module0369.$ic446$);
        Structures.def_csetf((SubLObject)module0369.$ic447$, (SubLObject)module0369.$ic448$);
        Structures.def_csetf((SubLObject)module0369.$ic449$, (SubLObject)module0369.$ic450$);
        Equality.identity((SubLObject)module0369.$ic431$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0369.$g3151$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic455$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0369.$g3151$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic458$));
        module0002.f50((SubLObject)module0369.$ic462$, (SubLObject)module0369.$ic316$);
        module0002.f38((SubLObject)module0369.$ic470$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0369.$g3152$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic477$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0369.$ic478$);
        Structures.def_csetf((SubLObject)module0369.$ic479$, (SubLObject)module0369.$ic480$);
        Structures.def_csetf((SubLObject)module0369.$ic481$, (SubLObject)module0369.$ic482$);
        Structures.def_csetf((SubLObject)module0369.$ic483$, (SubLObject)module0369.$ic484$);
        Structures.def_csetf((SubLObject)module0369.$ic485$, (SubLObject)module0369.$ic486$);
        Equality.identity((SubLObject)module0369.$ic471$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0369.$g3152$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic492$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0369.$g3152$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0369.$ic497$));
        module0002.f50((SubLObject)module0369.$ic333$, (SubLObject)module0369.$ic537$);
        module0002.f50((SubLObject)module0369.$ic552$, (SubLObject)module0369.$ic559$);
        module0002.f50((SubLObject)module0369.$ic556$, (SubLObject)module0369.$ic559$);
        module0002.f50((SubLObject)module0369.$ic557$, (SubLObject)module0369.$ic559$);
        module0002.f50((SubLObject)module0369.$ic555$, (SubLObject)module0369.$ic559$);
        module0002.f50((SubLObject)module0369.$ic578$, (SubLObject)module0369.$ic579$);
        return (SubLObject)module0369.NIL;
    }
    
    public void declareFunctions() {
        f25835();
    }
    
    public void initializeVariables() {
        f25836();
    }
    
    public void runTopLevelForms() {
        f25837();
    }
    
    static {
        me = (SubLFile)new module0369();
        module0369.$g3148$ = null;
        module0369.$g3149$ = null;
        module0369.$g3150$ = null;
        module0369.$g3151$ = null;
        module0369.$g3152$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIMPLEST"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#25426", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#10593", "CYC"), SubLObjectFactory.makeSymbol("PROBLEM-STORE"), SubLObjectFactory.makeSymbol("S#28173", "CYC"), SubLObjectFactory.makeSymbol("S#28756", "CYC"), SubLObjectFactory.makeSymbol("S#28757", "CYC"), SubLObjectFactory.makeSymbol("S#28758", "CYC"), SubLObjectFactory.makeSymbol("S#28759", "CYC"), SubLObjectFactory.makeSymbol("S#11445", "CYC"), SubLObjectFactory.makeSymbol("S#28760", "CYC"), SubLObjectFactory.makeSymbol("S#28761", "CYC"), SubLObjectFactory.makeSymbol("S#28762", "CYC"), SubLObjectFactory.makeSymbol("S#28763", "CYC"), SubLObjectFactory.makeSymbol("S#28764", "CYC"), SubLObjectFactory.makeSymbol("S#28765", "CYC"), SubLObjectFactory.makeSymbol("S#28766", "CYC"), SubLObjectFactory.makeSymbol("S#28767", "CYC"), SubLObjectFactory.makeSymbol("S#28768", "CYC"), SubLObjectFactory.makeSymbol("S#28769", "CYC"), SubLObjectFactory.makeSymbol("S#28770", "CYC"), SubLObjectFactory.makeSymbol("S#5846", "CYC"), SubLObjectFactory.makeSymbol("S#28771", "CYC"), SubLObjectFactory.makeSymbol("S#28772", "CYC"), SubLObjectFactory.makeSymbol("S#28773", "CYC"), SubLObjectFactory.makeSymbol("S#28774", "CYC"), SubLObjectFactory.makeSymbol("S#28775", "CYC"), SubLObjectFactory.makeSymbol("S#28776", "CYC"), SubLObjectFactory.makeSymbol("S#28777", "CYC"), SubLObjectFactory.makeSymbol("S#28778", "CYC"), SubLObjectFactory.makeSymbol("S#28158", "CYC"), SubLObjectFactory.makeSymbol("S#28779", "CYC"), SubLObjectFactory.makeSymbol("S#28780", "CYC"), SubLObjectFactory.makeSymbol("S#28781", "CYC"), SubLObjectFactory.makeSymbol("S#28782", "CYC"), SubLObjectFactory.makeSymbol("S#28783", "CYC"), SubLObjectFactory.makeSymbol("S#28784", "CYC"), SubLObjectFactory.makeSymbol("S#28785", "CYC"), SubLObjectFactory.makeSymbol("S#28786", "CYC"), SubLObjectFactory.makeSymbol("S#28787", "CYC"), SubLObjectFactory.makeSymbol("S#27007", "CYC"), SubLObjectFactory.makeSymbol("S#28788", "CYC"), SubLObjectFactory.makeSymbol("S#9388", "CYC"), SubLObjectFactory.makeSymbol("S#28789", "CYC"), SubLObjectFactory.makeSymbol("S#28790", "CYC"), SubLObjectFactory.makeSymbol("S#28791", "CYC"), SubLObjectFactory.makeSymbol("S#28792", "CYC"), SubLObjectFactory.makeSymbol("S#23736", "CYC"), SubLObjectFactory.makeSymbol("S#28793", "CYC"), SubLObjectFactory.makeSymbol("S#28794", "CYC"), SubLObjectFactory.makeSymbol("S#4785", "CYC"), SubLObjectFactory.makeSymbol("S#28795", "CYC"), SubLObjectFactory.makeSymbol("S#28796", "CYC"), SubLObjectFactory.makeSymbol("S#28797", "CYC"), SubLObjectFactory.makeSymbol("S#28798", "CYC"), SubLObjectFactory.makeSymbol("S#28799", "CYC"), SubLObjectFactory.makeSymbol("S#28800", "CYC"), SubLObjectFactory.makeSymbol("S#28801", "CYC"), SubLObjectFactory.makeSymbol("S#28802", "CYC"), SubLObjectFactory.makeSymbol("S#28803", "CYC"), SubLObjectFactory.makeSymbol("S#28804", "CYC"), SubLObjectFactory.makeSymbol("S#28805", "CYC"), SubLObjectFactory.makeSymbol("S#28168", "CYC"), SubLObjectFactory.makeSymbol("S#28806", "CYC"), SubLObjectFactory.makeSymbol("S#28807", "CYC"), SubLObjectFactory.makeSymbol("S#28808", "CYC"), SubLObjectFactory.makeSymbol("S#4877", "CYC"), SubLObjectFactory.makeSymbol("S#28809", "CYC"), SubLObjectFactory.makeSymbol("S#28810", "CYC"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#1625", "CYC") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUID"), SubLObjectFactory.makeKeyword("PROBLEM-STORE"), SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE"), SubLObjectFactory.makeKeyword("INPUT-MT"), SubLObjectFactory.makeKeyword("INPUT-EL-QUERY"), SubLObjectFactory.makeKeyword("INPUT-NON-EXPLANATORY-EL-QUERY"), SubLObjectFactory.makeKeyword("INPUT-QUERY-PROPERTIES"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("EL-QUERY"), SubLObjectFactory.makeKeyword("EL-BINDINGS"), SubLObjectFactory.makeKeyword("HL-QUERY"), SubLObjectFactory.makeKeyword("EXPLANATORY-SUBQUERY"), SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SUBQUERY"), SubLObjectFactory.makeKeyword("FREE-HL-VARS"), SubLObjectFactory.makeKeyword("HYPOTHETICAL-BINDINGS"), SubLObjectFactory.makeKeyword("ANSWER-ID-INDEX"), SubLObjectFactory.makeKeyword("ANSWER-BINDINGS-INDEX"), SubLObjectFactory.makeKeyword("NEW-ANSWER-ID-START"), SubLObjectFactory.makeKeyword("NEW-ANSWER-JUSTIFICATIONS"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("SUSPEND-STATUS"), SubLObjectFactory.makeKeyword("ROOT-LINK"), SubLObjectFactory.makeKeyword("RELEVANT-PROBLEMS"), SubLObjectFactory.makeKeyword("STRATEGY-SET"), SubLObjectFactory.makeKeyword("CONTROL-PROCESS"), SubLObjectFactory.makeKeyword("INTERRUPTING-PROCESSES"), SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED"), SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS-CRITERION"), SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), SubLObjectFactory.makeKeyword("ALLOWED-RULES"), SubLObjectFactory.makeKeyword("FORBIDDEN-RULES"), SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("PROBLEM-STORE-PRIVATE?"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), SubLObjectFactory.makeKeyword("BROWSABLE?"), SubLObjectFactory.makeKeyword("RETURN-TYPE"), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("CACHE-RESULTS?"), SubLObjectFactory.makeKeyword("BLOCKING?"), SubLObjectFactory.makeKeyword("MAX-NUMBER"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeKeyword("MAX-STEP"), SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME"), SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY"), SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeKeyword("METRICS-TEMPLATE"), SubLObjectFactory.makeKeyword("START-UNIVERSAL-TIME"), SubLObjectFactory.makeKeyword("START-INTERNAL-REAL-TIME"), SubLObjectFactory.makeKeyword("END-INTERNAL-REAL-TIME"), SubLObjectFactory.makeKeyword("PAD-INTERNAL-REAL-TIME"), SubLObjectFactory.makeKeyword("CUMULATIVE-TIME"), SubLObjectFactory.makeKeyword("STEP-COUNT"), SubLObjectFactory.makeKeyword("CUMULATIVE-STEP-COUNT"), SubLObjectFactory.makeKeyword("EVENTS"), SubLObjectFactory.makeKeyword("HALT-CONDITIONS"), SubLObjectFactory.makeKeyword("ACCUMULATORS"), SubLObjectFactory.makeKeyword("PROOF-WATERMARK"), SubLObjectFactory.makeKeyword("PROBLEM-WORKING-TIME-DATA"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("DATA") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#28226", "CYC"), SubLObjectFactory.makeSymbol("S#28227", "CYC"), SubLObjectFactory.makeSymbol("S#28228", "CYC"), SubLObjectFactory.makeSymbol("S#28229", "CYC"), SubLObjectFactory.makeSymbol("S#28230", "CYC"), SubLObjectFactory.makeSymbol("S#28231", "CYC"), SubLObjectFactory.makeSymbol("S#28232", "CYC"), SubLObjectFactory.makeSymbol("S#28233", "CYC"), SubLObjectFactory.makeSymbol("S#28234", "CYC"), SubLObjectFactory.makeSymbol("S#28235", "CYC"), SubLObjectFactory.makeSymbol("S#28236", "CYC"), SubLObjectFactory.makeSymbol("S#28237", "CYC"), SubLObjectFactory.makeSymbol("S#28238", "CYC"), SubLObjectFactory.makeSymbol("S#28239", "CYC"), SubLObjectFactory.makeSymbol("S#28240", "CYC"), SubLObjectFactory.makeSymbol("S#28241", "CYC"), SubLObjectFactory.makeSymbol("S#28242", "CYC"), SubLObjectFactory.makeSymbol("S#28243", "CYC"), SubLObjectFactory.makeSymbol("S#28244", "CYC"), SubLObjectFactory.makeSymbol("S#28245", "CYC"), SubLObjectFactory.makeSymbol("S#28246", "CYC"), SubLObjectFactory.makeSymbol("S#28247", "CYC"), SubLObjectFactory.makeSymbol("S#28248", "CYC"), SubLObjectFactory.makeSymbol("S#28249", "CYC"), SubLObjectFactory.makeSymbol("S#28250", "CYC"), SubLObjectFactory.makeSymbol("S#28251", "CYC"), SubLObjectFactory.makeSymbol("S#28252", "CYC"), SubLObjectFactory.makeSymbol("S#28253", "CYC"), SubLObjectFactory.makeSymbol("S#28254", "CYC"), SubLObjectFactory.makeSymbol("S#28255", "CYC"), SubLObjectFactory.makeSymbol("S#28256", "CYC"), SubLObjectFactory.makeSymbol("S#28257", "CYC"), SubLObjectFactory.makeSymbol("S#28258", "CYC"), SubLObjectFactory.makeSymbol("S#28259", "CYC"), SubLObjectFactory.makeSymbol("S#28260", "CYC"), SubLObjectFactory.makeSymbol("S#28261", "CYC"), SubLObjectFactory.makeSymbol("S#28262", "CYC"), SubLObjectFactory.makeSymbol("S#28263", "CYC"), SubLObjectFactory.makeSymbol("S#28264", "CYC"), SubLObjectFactory.makeSymbol("S#28265", "CYC"), SubLObjectFactory.makeSymbol("S#28266", "CYC"), SubLObjectFactory.makeSymbol("S#28267", "CYC"), SubLObjectFactory.makeSymbol("S#28268", "CYC"), SubLObjectFactory.makeSymbol("S#28269", "CYC"), SubLObjectFactory.makeSymbol("S#28270", "CYC"), SubLObjectFactory.makeSymbol("S#28271", "CYC"), SubLObjectFactory.makeSymbol("S#28272", "CYC"), SubLObjectFactory.makeSymbol("S#28273", "CYC"), SubLObjectFactory.makeSymbol("S#28274", "CYC"), SubLObjectFactory.makeSymbol("S#28275", "CYC"), SubLObjectFactory.makeSymbol("S#28276", "CYC"), SubLObjectFactory.makeSymbol("S#28277", "CYC"), SubLObjectFactory.makeSymbol("S#28278", "CYC"), SubLObjectFactory.makeSymbol("S#28279", "CYC"), SubLObjectFactory.makeSymbol("S#28280", "CYC"), SubLObjectFactory.makeSymbol("S#28281", "CYC"), SubLObjectFactory.makeSymbol("S#28282", "CYC"), SubLObjectFactory.makeSymbol("S#28283", "CYC"), SubLObjectFactory.makeSymbol("S#28284", "CYC"), SubLObjectFactory.makeSymbol("S#28285", "CYC"), SubLObjectFactory.makeSymbol("S#28286", "CYC"), SubLObjectFactory.makeSymbol("S#28287", "CYC"), SubLObjectFactory.makeSymbol("S#28288", "CYC"), SubLObjectFactory.makeSymbol("S#28289", "CYC"), SubLObjectFactory.makeSymbol("S#28290", "CYC"), SubLObjectFactory.makeSymbol("S#28291", "CYC"), SubLObjectFactory.makeSymbol("S#28292", "CYC"), SubLObjectFactory.makeSymbol("S#28293", "CYC"), SubLObjectFactory.makeSymbol("S#28294", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#28295", "CYC"), SubLObjectFactory.makeSymbol("S#28296", "CYC"), SubLObjectFactory.makeSymbol("S#28297", "CYC"), SubLObjectFactory.makeSymbol("S#28298", "CYC"), SubLObjectFactory.makeSymbol("S#28299", "CYC"), SubLObjectFactory.makeSymbol("S#28300", "CYC"), SubLObjectFactory.makeSymbol("S#28301", "CYC"), SubLObjectFactory.makeSymbol("S#28302", "CYC"), SubLObjectFactory.makeSymbol("S#28303", "CYC"), SubLObjectFactory.makeSymbol("S#28304", "CYC"), SubLObjectFactory.makeSymbol("S#28305", "CYC"), SubLObjectFactory.makeSymbol("S#28306", "CYC"), SubLObjectFactory.makeSymbol("S#28307", "CYC"), SubLObjectFactory.makeSymbol("S#28308", "CYC"), SubLObjectFactory.makeSymbol("S#28309", "CYC"), SubLObjectFactory.makeSymbol("S#28310", "CYC"), SubLObjectFactory.makeSymbol("S#28311", "CYC"), SubLObjectFactory.makeSymbol("S#28312", "CYC"), SubLObjectFactory.makeSymbol("S#28313", "CYC"), SubLObjectFactory.makeSymbol("S#28314", "CYC"), SubLObjectFactory.makeSymbol("S#28315", "CYC"), SubLObjectFactory.makeSymbol("S#28316", "CYC"), SubLObjectFactory.makeSymbol("S#28317", "CYC"), SubLObjectFactory.makeSymbol("S#28318", "CYC"), SubLObjectFactory.makeSymbol("S#28319", "CYC"), SubLObjectFactory.makeSymbol("S#28320", "CYC"), SubLObjectFactory.makeSymbol("S#28321", "CYC"), SubLObjectFactory.makeSymbol("S#28322", "CYC"), SubLObjectFactory.makeSymbol("S#28323", "CYC"), SubLObjectFactory.makeSymbol("S#28324", "CYC"), SubLObjectFactory.makeSymbol("S#28325", "CYC"), SubLObjectFactory.makeSymbol("S#28326", "CYC"), SubLObjectFactory.makeSymbol("S#28327", "CYC"), SubLObjectFactory.makeSymbol("S#28328", "CYC"), SubLObjectFactory.makeSymbol("S#28329", "CYC"), SubLObjectFactory.makeSymbol("S#28330", "CYC"), SubLObjectFactory.makeSymbol("S#28331", "CYC"), SubLObjectFactory.makeSymbol("S#28332", "CYC"), SubLObjectFactory.makeSymbol("S#28333", "CYC"), SubLObjectFactory.makeSymbol("S#28334", "CYC"), SubLObjectFactory.makeSymbol("S#28335", "CYC"), SubLObjectFactory.makeSymbol("S#28336", "CYC"), SubLObjectFactory.makeSymbol("S#28337", "CYC"), SubLObjectFactory.makeSymbol("S#28338", "CYC"), SubLObjectFactory.makeSymbol("S#28339", "CYC"), SubLObjectFactory.makeSymbol("S#28340", "CYC"), SubLObjectFactory.makeSymbol("S#28341", "CYC"), SubLObjectFactory.makeSymbol("S#28342", "CYC"), SubLObjectFactory.makeSymbol("S#28343", "CYC"), SubLObjectFactory.makeSymbol("S#28344", "CYC"), SubLObjectFactory.makeSymbol("S#28345", "CYC"), SubLObjectFactory.makeSymbol("S#28346", "CYC"), SubLObjectFactory.makeSymbol("S#28347", "CYC"), SubLObjectFactory.makeSymbol("S#28348", "CYC"), SubLObjectFactory.makeSymbol("S#28349", "CYC"), SubLObjectFactory.makeSymbol("S#28350", "CYC"), SubLObjectFactory.makeSymbol("S#28351", "CYC"), SubLObjectFactory.makeSymbol("S#28352", "CYC"), SubLObjectFactory.makeSymbol("S#28353", "CYC"), SubLObjectFactory.makeSymbol("S#28354", "CYC"), SubLObjectFactory.makeSymbol("S#28355", "CYC"), SubLObjectFactory.makeSymbol("S#28356", "CYC"), SubLObjectFactory.makeSymbol("S#28357", "CYC"), SubLObjectFactory.makeSymbol("S#28358", "CYC"), SubLObjectFactory.makeSymbol("S#28359", "CYC"), SubLObjectFactory.makeSymbol("S#28360", "CYC"), SubLObjectFactory.makeSymbol("S#28361", "CYC"), SubLObjectFactory.makeSymbol("S#28362", "CYC"), SubLObjectFactory.makeSymbol("S#28363", "CYC") });
        $ic7$ = SubLObjectFactory.makeSymbol("S#28369", "CYC");
        $ic8$ = SubLObjectFactory.makeInteger(21);
        $ic9$ = SubLObjectFactory.makeInteger(22);
        $ic10$ = SubLObjectFactory.makeInteger(23);
        $ic11$ = SubLObjectFactory.makeInteger(24);
        $ic12$ = SubLObjectFactory.makeInteger(25);
        $ic13$ = SubLObjectFactory.makeInteger(26);
        $ic14$ = SubLObjectFactory.makeInteger(27);
        $ic15$ = SubLObjectFactory.makeInteger(28);
        $ic16$ = SubLObjectFactory.makeInteger(29);
        $ic17$ = SubLObjectFactory.makeInteger(30);
        $ic18$ = SubLObjectFactory.makeInteger(31);
        $ic19$ = SubLObjectFactory.makeInteger(32);
        $ic20$ = SubLObjectFactory.makeInteger(33);
        $ic21$ = SubLObjectFactory.makeInteger(34);
        $ic22$ = SubLObjectFactory.makeInteger(35);
        $ic23$ = SubLObjectFactory.makeInteger(36);
        $ic24$ = SubLObjectFactory.makeInteger(37);
        $ic25$ = SubLObjectFactory.makeInteger(38);
        $ic26$ = SubLObjectFactory.makeInteger(39);
        $ic27$ = SubLObjectFactory.makeInteger(40);
        $ic28$ = SubLObjectFactory.makeInteger(41);
        $ic29$ = SubLObjectFactory.makeInteger(42);
        $ic30$ = SubLObjectFactory.makeInteger(43);
        $ic31$ = SubLObjectFactory.makeInteger(44);
        $ic32$ = SubLObjectFactory.makeInteger(45);
        $ic33$ = SubLObjectFactory.makeInteger(46);
        $ic34$ = SubLObjectFactory.makeInteger(47);
        $ic35$ = SubLObjectFactory.makeInteger(48);
        $ic36$ = SubLObjectFactory.makeInteger(49);
        $ic37$ = SubLObjectFactory.makeInteger(50);
        $ic38$ = SubLObjectFactory.makeInteger(51);
        $ic39$ = SubLObjectFactory.makeInteger(52);
        $ic40$ = SubLObjectFactory.makeInteger(53);
        $ic41$ = SubLObjectFactory.makeInteger(54);
        $ic42$ = SubLObjectFactory.makeInteger(55);
        $ic43$ = SubLObjectFactory.makeInteger(56);
        $ic44$ = SubLObjectFactory.makeInteger(57);
        $ic45$ = SubLObjectFactory.makeInteger(58);
        $ic46$ = SubLObjectFactory.makeInteger(59);
        $ic47$ = SubLObjectFactory.makeInteger(60);
        $ic48$ = SubLObjectFactory.makeInteger(61);
        $ic49$ = SubLObjectFactory.makeInteger(62);
        $ic50$ = SubLObjectFactory.makeInteger(63);
        $ic51$ = SubLObjectFactory.makeInteger(64);
        $ic52$ = SubLObjectFactory.makeInteger(65);
        $ic53$ = SubLObjectFactory.makeInteger(66);
        $ic54$ = SubLObjectFactory.makeInteger(67);
        $ic55$ = SubLObjectFactory.makeInteger(68);
        $ic56$ = SubLObjectFactory.makeInteger(69);
        $ic57$ = SubLObjectFactory.makeInteger(70);
        $ic58$ = SubLObjectFactory.makeSymbol("S#28225", "CYC");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-P"));
        $ic60$ = SubLObjectFactory.makeSymbol("S#28226", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#28295", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#28227", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#28296", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#28228", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#28297", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#28229", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#28298", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#28230", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#28299", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#28231", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#28300", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#28232", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#28301", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#28233", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#28302", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#28234", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#28303", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#28235", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#28304", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#28236", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#28305", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#28237", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#28306", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#28238", "CYC");
        $ic85$ = SubLObjectFactory.makeSymbol("S#28307", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#28239", "CYC");
        $ic87$ = SubLObjectFactory.makeSymbol("S#28308", "CYC");
        $ic88$ = SubLObjectFactory.makeSymbol("S#28240", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#28309", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#28241", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#28310", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#28242", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#28311", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#28243", "CYC");
        $ic95$ = SubLObjectFactory.makeSymbol("S#28312", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#28244", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#28313", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#28245", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#28314", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("S#28246", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("S#28315", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#28247", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#28316", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#28248", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#28317", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#28249", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#28318", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#28250", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#28319", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#28251", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#28320", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#28252", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#28321", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#28253", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#28322", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#28254", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#28323", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#28255", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#28324", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#28256", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#28325", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#28257", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#28326", "CYC");
        $ic124$ = SubLObjectFactory.makeSymbol("S#28258", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#28327", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#28259", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#28328", "CYC");
        $ic128$ = SubLObjectFactory.makeSymbol("S#28260", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#28329", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#28261", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#28330", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#28262", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#28331", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#28263", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#28332", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#28264", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#28333", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#28265", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#28334", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#28266", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#28335", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#28267", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("S#28336", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#28268", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#28337", "CYC");
        $ic146$ = SubLObjectFactory.makeSymbol("S#28269", "CYC");
        $ic147$ = SubLObjectFactory.makeSymbol("S#28338", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#28270", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#28339", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#28271", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("S#28340", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#28272", "CYC");
        $ic153$ = SubLObjectFactory.makeSymbol("S#28341", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("S#28273", "CYC");
        $ic155$ = SubLObjectFactory.makeSymbol("S#28342", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("S#28274", "CYC");
        $ic157$ = SubLObjectFactory.makeSymbol("S#28343", "CYC");
        $ic158$ = SubLObjectFactory.makeSymbol("S#28275", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#28344", "CYC");
        $ic160$ = SubLObjectFactory.makeSymbol("S#28276", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#28345", "CYC");
        $ic162$ = SubLObjectFactory.makeSymbol("S#28277", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#28346", "CYC");
        $ic164$ = SubLObjectFactory.makeSymbol("S#28278", "CYC");
        $ic165$ = SubLObjectFactory.makeSymbol("S#28347", "CYC");
        $ic166$ = SubLObjectFactory.makeSymbol("S#28279", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#28348", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#28280", "CYC");
        $ic169$ = SubLObjectFactory.makeSymbol("S#28349", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("S#28281", "CYC");
        $ic171$ = SubLObjectFactory.makeSymbol("S#28350", "CYC");
        $ic172$ = SubLObjectFactory.makeSymbol("S#28282", "CYC");
        $ic173$ = SubLObjectFactory.makeSymbol("S#28351", "CYC");
        $ic174$ = SubLObjectFactory.makeSymbol("S#28283", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#28352", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol("S#28284", "CYC");
        $ic177$ = SubLObjectFactory.makeSymbol("S#28353", "CYC");
        $ic178$ = SubLObjectFactory.makeSymbol("S#28285", "CYC");
        $ic179$ = SubLObjectFactory.makeSymbol("S#28354", "CYC");
        $ic180$ = SubLObjectFactory.makeSymbol("S#28286", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("S#28355", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#28287", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#28356", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#28288", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#28357", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#28289", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#28358", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#28290", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#28359", "CYC");
        $ic190$ = SubLObjectFactory.makeSymbol("S#28291", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("S#28360", "CYC");
        $ic192$ = SubLObjectFactory.makeSymbol("S#28292", "CYC");
        $ic193$ = SubLObjectFactory.makeSymbol("S#28361", "CYC");
        $ic194$ = SubLObjectFactory.makeSymbol("S#28293", "CYC");
        $ic195$ = SubLObjectFactory.makeSymbol("S#28362", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#28294", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("S#28363", "CYC");
        $ic198$ = SubLObjectFactory.makeKeyword("SUID");
        $ic199$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic200$ = SubLObjectFactory.makeKeyword("FORWARD-PROPAGATE");
        $ic201$ = SubLObjectFactory.makeKeyword("INPUT-MT");
        $ic202$ = SubLObjectFactory.makeKeyword("INPUT-EL-QUERY");
        $ic203$ = SubLObjectFactory.makeKeyword("INPUT-NON-EXPLANATORY-EL-QUERY");
        $ic204$ = SubLObjectFactory.makeKeyword("INPUT-QUERY-PROPERTIES");
        $ic205$ = SubLObjectFactory.makeKeyword("MT");
        $ic206$ = SubLObjectFactory.makeKeyword("EL-QUERY");
        $ic207$ = SubLObjectFactory.makeKeyword("EL-BINDINGS");
        $ic208$ = SubLObjectFactory.makeKeyword("HL-QUERY");
        $ic209$ = SubLObjectFactory.makeKeyword("EXPLANATORY-SUBQUERY");
        $ic210$ = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SUBQUERY");
        $ic211$ = SubLObjectFactory.makeKeyword("FREE-HL-VARS");
        $ic212$ = SubLObjectFactory.makeKeyword("HYPOTHETICAL-BINDINGS");
        $ic213$ = SubLObjectFactory.makeKeyword("ANSWER-ID-INDEX");
        $ic214$ = SubLObjectFactory.makeKeyword("ANSWER-BINDINGS-INDEX");
        $ic215$ = SubLObjectFactory.makeKeyword("NEW-ANSWER-ID-START");
        $ic216$ = SubLObjectFactory.makeKeyword("NEW-ANSWER-JUSTIFICATIONS");
        $ic217$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic218$ = SubLObjectFactory.makeKeyword("SUSPEND-STATUS");
        $ic219$ = SubLObjectFactory.makeKeyword("ROOT-LINK");
        $ic220$ = SubLObjectFactory.makeKeyword("RELEVANT-PROBLEMS");
        $ic221$ = SubLObjectFactory.makeKeyword("STRATEGY-SET");
        $ic222$ = SubLObjectFactory.makeKeyword("CONTROL-PROCESS");
        $ic223$ = SubLObjectFactory.makeKeyword("INTERRUPTING-PROCESSES");
        $ic224$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH-REACHED");
        $ic225$ = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic226$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS-CRITERION");
        $ic227$ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic228$ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic229$ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic230$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic231$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic232$ = SubLObjectFactory.makeKeyword("FORBIDDEN-RULES");
        $ic233$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic234$ = SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic235$ = SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $ic236$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-PRIVATE?");
        $ic237$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic238$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic239$ = SubLObjectFactory.makeKeyword("RETURN-TYPE");
        $ic240$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic241$ = SubLObjectFactory.makeKeyword("CACHE-RESULTS?");
        $ic242$ = SubLObjectFactory.makeKeyword("BLOCKING?");
        $ic243$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic244$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic245$ = SubLObjectFactory.makeKeyword("MAX-STEP");
        $ic246$ = SubLObjectFactory.makeKeyword("MODE");
        $ic247$ = SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME");
        $ic248$ = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $ic249$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic250$ = SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY");
        $ic251$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic252$ = SubLObjectFactory.makeKeyword("METRICS-TEMPLATE");
        $ic253$ = SubLObjectFactory.makeKeyword("START-UNIVERSAL-TIME");
        $ic254$ = SubLObjectFactory.makeKeyword("START-INTERNAL-REAL-TIME");
        $ic255$ = SubLObjectFactory.makeKeyword("END-INTERNAL-REAL-TIME");
        $ic256$ = SubLObjectFactory.makeKeyword("PAD-INTERNAL-REAL-TIME");
        $ic257$ = SubLObjectFactory.makeKeyword("CUMULATIVE-TIME");
        $ic258$ = SubLObjectFactory.makeKeyword("STEP-COUNT");
        $ic259$ = SubLObjectFactory.makeKeyword("CUMULATIVE-STEP-COUNT");
        $ic260$ = SubLObjectFactory.makeKeyword("EVENTS");
        $ic261$ = SubLObjectFactory.makeKeyword("HALT-CONDITIONS");
        $ic262$ = SubLObjectFactory.makeKeyword("ACCUMULATORS");
        $ic263$ = SubLObjectFactory.makeKeyword("PROOF-WATERMARK");
        $ic264$ = SubLObjectFactory.makeKeyword("PROBLEM-WORKING-TIME-DATA");
        $ic265$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic266$ = SubLObjectFactory.makeKeyword("DATA");
        $ic267$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic268$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic269$ = SubLObjectFactory.makeSymbol("S#28364", "CYC");
        $ic270$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic271$ = SubLObjectFactory.makeKeyword("END");
        $ic272$ = SubLObjectFactory.makeSymbol("S#28366", "CYC");
        $ic273$ = SubLObjectFactory.makeKeyword("DEAD");
        $ic274$ = SubLObjectFactory.makeString("<Invalid INFERENCE ~s>");
        $ic275$ = SubLObjectFactory.makeString("<INFERENCE ~a.~a:~a:~a in ~a>");
        $ic276$ = SubLObjectFactory.makeSymbol("S#28197", "CYC");
        $ic277$ = SubLObjectFactory.makeKeyword("NEW");
        $ic278$ = SubLObjectFactory.makeKeyword("PREPARED");
        $ic279$ = SubLObjectFactory.makeKeyword("READY");
        $ic280$ = SubLObjectFactory.makeKeyword("RUNNING");
        $ic281$ = SubLObjectFactory.makeKeyword("SUSPENDED");
        $ic282$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27287", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic283$ = SubLObjectFactory.makeSymbol("S#708", "CYC");
        $ic284$ = SubLObjectFactory.makeSymbol("S#27366", "CYC");
        $ic285$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic286$ = SubLObjectFactory.makeSymbol("S#5514", "CYC");
        $ic287$ = SubLObjectFactory.makeSymbol("S#28406", "CYC");
        $ic288$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28812", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic289$ = SubLObjectFactory.makeUninternedSymbol("US#271F284");
        $ic290$ = SubLObjectFactory.makeUninternedSymbol("US#12B0C1F");
        $ic291$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic292$ = SubLObjectFactory.makeUninternedSymbol("US#53A4892");
        $ic293$ = SubLObjectFactory.makeSymbol("CLET");
        $ic294$ = SubLObjectFactory.makeSymbol("S#28405", "CYC");
        $ic295$ = SubLObjectFactory.makeSymbol("S#28595", "CYC");
        $ic296$ = SubLObjectFactory.makeSymbol("CDO");
        $ic297$ = SubLObjectFactory.makeSymbol("1+");
        $ic298$ = SubLObjectFactory.makeSymbol(">=");
        $ic299$ = SubLObjectFactory.makeSymbol("FIND-INFERENCE-ANSWER-BY-ID");
        $ic300$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28812", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#6384", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic301$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORDERED"));
        $ic302$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic303$ = SubLObjectFactory.makeKeyword("ORDERED");
        $ic304$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic305$ = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $ic306$ = SubLObjectFactory.makeSymbol("S#28403", "CYC");
        $ic307$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic308$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28812", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28813", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic309$ = SubLObjectFactory.makeUninternedSymbol("US#271F284");
        $ic310$ = SubLObjectFactory.makeUninternedSymbol("US#12B0C1F");
        $ic311$ = SubLObjectFactory.makeUninternedSymbol("US#1124883");
        $ic312$ = SubLObjectFactory.makeUninternedSymbol("US#53A4892");
        $ic313$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic314$ = SubLObjectFactory.makeUninternedSymbol("US#72EAA40");
        $ic315$ = SubLObjectFactory.makeSymbol("S#28380", "CYC");
        $ic316$ = SubLObjectFactory.makeSymbol("S#28648", "CYC");
        $ic317$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28814", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic318$ = SubLObjectFactory.makeSymbol("S#5516", "CYC");
        $ic319$ = SubLObjectFactory.makeSymbol("S#28410", "CYC");
        $ic320$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25415", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#25416", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic321$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF-STATUS"));
        $ic322$ = SubLObjectFactory.makeKeyword("PROOF-STATUS");
        $ic323$ = SubLObjectFactory.makeUninternedSymbol("US#E1A413");
        $ic324$ = SubLObjectFactory.makeSymbol("INFERENCE-ROOT-PROBLEM");
        $ic325$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic326$ = SubLObjectFactory.makeSymbol("S#27445", "CYC");
        $ic327$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16577", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic328$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic329$ = SubLObjectFactory.makeKeyword("DONE");
        $ic330$ = SubLObjectFactory.makeSymbol("S#28420", "CYC");
        $ic331$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic332$ = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $ic333$ = SubLObjectFactory.makeSymbol("S#28728", "CYC");
        $ic334$ = SubLObjectFactory.makeSymbol("S#26782", "CYC");
        $ic335$ = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $ic336$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic337$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic338$ = SubLObjectFactory.makeKeyword("FREE");
        $ic339$ = SubLObjectFactory.makeSymbol("S#28379", "CYC");
        $ic340$ = SubLObjectFactory.makeSymbol("S#28378", "CYC");
        $ic341$ = SubLObjectFactory.makeSymbol("S#28174", "CYC");
        $ic342$ = SubLObjectFactory.makeSymbol("S#12264", "CYC");
        $ic343$ = SubLObjectFactory.makeSymbol("S#15591", "CYC");
        $ic344$ = SubLObjectFactory.makeSymbol("S#26487", "CYC");
        $ic345$ = SubLObjectFactory.makeSymbol("S#12263", "CYC");
        $ic346$ = SubLObjectFactory.makeSymbol("S#18088", "CYC");
        $ic347$ = SubLObjectFactory.makeSymbol("S#27306", "CYC");
        $ic348$ = SubLObjectFactory.makeSymbol("S#27307", "CYC");
        $ic349$ = SubLObjectFactory.makeSymbol("S#27308", "CYC");
        $ic350$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic351$ = SubLObjectFactory.makeSymbol("S#26560", "CYC");
        $ic352$ = SubLObjectFactory.makeSymbol("S#26563", "CYC");
        $ic353$ = SubLObjectFactory.makeSymbol("S#27371", "CYC");
        $ic354$ = SubLObjectFactory.makeSymbol("PROCESSP");
        $ic355$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic356$ = SubLObjectFactory.makeSymbol("S#26659", "CYC");
        $ic357$ = SubLObjectFactory.makeSymbol("S#26657", "CYC");
        $ic358$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic359$ = SubLObjectFactory.makeSymbol("S#25440", "CYC");
        $ic360$ = SubLObjectFactory.makeSymbol("S#26661", "CYC");
        $ic361$ = SubLObjectFactory.makeSymbol("S#26653", "CYC");
        $ic362$ = SubLObjectFactory.makeSymbol("S#26655", "CYC");
        $ic363$ = SubLObjectFactory.makeSymbol("S#65", "CYC");
        $ic364$ = SubLObjectFactory.makeSymbol("S#26597", "CYC");
        $ic365$ = SubLObjectFactory.makeString("Forward max time ~s cannot be greater than max time ~s");
        $ic366$ = SubLObjectFactory.makeSymbol("S#28200", "CYC");
        $ic367$ = SubLObjectFactory.makeSymbol("S#4829", "CYC");
        $ic368$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic369$ = SubLObjectFactory.makeSymbol("S#26498", "CYC");
        $ic370$ = SubLObjectFactory.makeSymbol("S#4951", "CYC");
        $ic371$ = SubLObjectFactory.makeSymbol("S#4748", "CYC");
        $ic372$ = SubLObjectFactory.makeSymbol("NUMBERP");
        $ic373$ = SubLObjectFactory.makeSymbol("S#26665", "CYC");
        $ic374$ = SubLObjectFactory.makeSymbol("S#26667", "CYC");
        $ic375$ = SubLObjectFactory.makeSymbol("S#28224", "CYC");
        $ic376$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28815", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic377$ = SubLObjectFactory.makeUninternedSymbol("US#54717E7");
        $ic378$ = SubLObjectFactory.makeSymbol("S#28513", "CYC");
        $ic379$ = SubLObjectFactory.makeSymbol("INFERENCE-SUID");
        $ic380$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic381$ = SubLObjectFactory.makeSymbol("S#28577", "CYC");
        $ic382$ = SubLObjectFactory.makeKeyword("NEG");
        $ic383$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic384$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic385$ = SubLObjectFactory.makeKeyword("POS");
        $ic386$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28817", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13100", "CYC"));
        $ic387$ = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $ic388$ = SubLObjectFactory.makeSymbol("NEW-CYC-QUERY");
        $ic389$ = SubLObjectFactory.makeString("(new-cyc-query~A");
        $ic390$ = SubLObjectFactory.makeString("~%  ~A");
        $ic391$ = SubLObjectFactory.makeString("~A");
        $ic392$ = SubLObjectFactory.makeString("~%  (list~%    ");
        $ic393$ = SubLObjectFactory.makeKeyword("DOWNCASE");
        $ic394$ = SubLObjectFactory.makeString("~S (find-problem-store-by-id ~S)~%    ");
        $ic395$ = SubLObjectFactory.makeKeyword("ALL");
        $ic396$ = SubLObjectFactory.makeString("~S (list");
        $ic397$ = SubLObjectFactory.makeString("~&      (find-object-by-hl-external-id-string ~S)");
        $ic398$ = SubLObjectFactory.makeString(")~%    ");
        $ic399$ = SubLObjectFactory.makeString("~S ~S~%    ");
        $ic400$ = SubLObjectFactory.makeString(")");
        $ic401$ = SubLObjectFactory.makeKeyword("PROOF");
        $ic402$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic403$ = SubLObjectFactory.makeKeyword("NONE");
        $ic404$ = SubLObjectFactory.makeSymbol("S#26668", "CYC");
        $ic405$ = SubLObjectFactory.makeSymbol("S#7310", "CYC");
        $ic406$ = SubLObjectFactory.makeSymbol("S#28753", "CYC");
        $ic407$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic408$ = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $ic409$ = SubLObjectFactory.makeSymbol("<");
        $ic410$ = SubLObjectFactory.makeKeyword("LOOK-NO-DEEPER-FOR-ADDITIONAL-ANSWERS");
        $ic411$ = SubLObjectFactory.makeString("got a null answer for ~s");
        $ic412$ = SubLObjectFactory.makeKeyword("GOOD");
        $ic413$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic414$ = SubLObjectFactory.makeKeyword("NO-GOOD");
        $ic415$ = SubLObjectFactory.makeKeyword("NEUTRAL");
        $ic416$ = SubLObjectFactory.makeSymbol("S#26505", "CYC");
        $ic417$ = SubLObjectFactory.makeSymbol("S#28206", "CYC");
        $ic418$ = SubLObjectFactory.makeSymbol("S#28207", "CYC");
        $ic419$ = SubLObjectFactory.makeSymbol("S#26495", "CYC");
        $ic420$ = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $ic421$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic422$ = SubLObjectFactory.makeSymbol("S#27896", "CYC");
        $ic423$ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-P");
        $ic424$ = SubLObjectFactory.makeSymbol("S#28215", "CYC");
        $ic425$ = SubLObjectFactory.makeString("variables ~S were removed");
        $ic426$ = SubLObjectFactory.makeString("variables ~S were added");
        $ic427$ = SubLObjectFactory.makeString("variables ~S contain duplications");
        $ic428$ = SubLObjectFactory.makeKeyword("SIMPLEST");
        $ic429$ = SubLObjectFactory.makeSymbol("S#28621", "CYC");
        $ic430$ = SubLObjectFactory.makeSymbol("S#28028", "CYC");
        $ic431$ = SubLObjectFactory.makeSymbol("S#28211", "CYC");
        $ic432$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10593", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#713", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28818", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28819", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28168", "CYC"));
        $ic433$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUID"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("JUSTIFICATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("ELAPSED-CREATION-TIME"), (SubLObject)SubLObjectFactory.makeKeyword("STEP-COUNT"));
        $ic434$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28627", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28628", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28629", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28630", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28631", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28632", "CYC"));
        $ic435$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28633", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28634", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28635", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28636", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28637", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28638", "CYC"));
        $ic436$ = SubLObjectFactory.makeSymbol("S#28644", "CYC");
        $ic437$ = SubLObjectFactory.makeSymbol("S#28626", "CYC");
        $ic438$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-P"));
        $ic439$ = SubLObjectFactory.makeSymbol("S#28627", "CYC");
        $ic440$ = SubLObjectFactory.makeSymbol("S#28633", "CYC");
        $ic441$ = SubLObjectFactory.makeSymbol("S#28628", "CYC");
        $ic442$ = SubLObjectFactory.makeSymbol("S#28634", "CYC");
        $ic443$ = SubLObjectFactory.makeSymbol("S#28629", "CYC");
        $ic444$ = SubLObjectFactory.makeSymbol("S#28635", "CYC");
        $ic445$ = SubLObjectFactory.makeSymbol("S#28630", "CYC");
        $ic446$ = SubLObjectFactory.makeSymbol("S#28636", "CYC");
        $ic447$ = SubLObjectFactory.makeSymbol("S#28631", "CYC");
        $ic448$ = SubLObjectFactory.makeSymbol("S#28637", "CYC");
        $ic449$ = SubLObjectFactory.makeSymbol("S#28632", "CYC");
        $ic450$ = SubLObjectFactory.makeSymbol("S#28638", "CYC");
        $ic451$ = SubLObjectFactory.makeKeyword("INFERENCE");
        $ic452$ = SubLObjectFactory.makeKeyword("JUSTIFICATIONS");
        $ic453$ = SubLObjectFactory.makeKeyword("ELAPSED-CREATION-TIME");
        $ic454$ = SubLObjectFactory.makeSymbol("S#28639", "CYC");
        $ic455$ = SubLObjectFactory.makeSymbol("S#28641", "CYC");
        $ic456$ = SubLObjectFactory.makeString("<Invalid INFERENCE-ANSWER ~s>");
        $ic457$ = SubLObjectFactory.makeString("<INFERENCE-ANSWER ~a for INFERENCE ~a.~a:~a>");
        $ic458$ = SubLObjectFactory.makeSymbol("S#28645", "CYC");
        $ic459$ = SubLObjectFactory.makeSymbol("S#18087", "CYC");
        $ic460$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28211", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic461$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic462$ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS");
        $ic463$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15216", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28211", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic464$ = SubLObjectFactory.makeSymbol("S#1601", "CYC");
        $ic465$ = SubLObjectFactory.makeSymbol("S#14713", "CYC");
        $ic466$ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS");
        $ic467$ = SubLObjectFactory.makeKeyword("HL");
        $ic468$ = SubLObjectFactory.makeKeyword("EL");
        $ic469$ = SubLObjectFactory.makeString("~S was not an inference-answer-language-p");
        $ic470$ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-EL-SENTENCE");
        $ic471$ = SubLObjectFactory.makeSymbol("S#28214", "CYC");
        $ic472$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#3281", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14510", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28820", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27711", "CYC"));
        $ic473$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("PRAGMA-SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("PROOFS"));
        $ic474$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28674", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28677", "CYC"));
        $ic475$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28678", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28679", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28680", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28681", "CYC"));
        $ic476$ = SubLObjectFactory.makeSymbol("S#28687", "CYC");
        $ic477$ = SubLObjectFactory.makeSymbol("S#28673", "CYC");
        $ic478$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#28215", "CYC"));
        $ic479$ = SubLObjectFactory.makeSymbol("S#28674", "CYC");
        $ic480$ = SubLObjectFactory.makeSymbol("S#28678", "CYC");
        $ic481$ = SubLObjectFactory.makeSymbol("S#28675", "CYC");
        $ic482$ = SubLObjectFactory.makeSymbol("S#28679", "CYC");
        $ic483$ = SubLObjectFactory.makeSymbol("S#28676", "CYC");
        $ic484$ = SubLObjectFactory.makeSymbol("S#28680", "CYC");
        $ic485$ = SubLObjectFactory.makeSymbol("S#28677", "CYC");
        $ic486$ = SubLObjectFactory.makeSymbol("S#28681", "CYC");
        $ic487$ = SubLObjectFactory.makeKeyword("ANSWER");
        $ic488$ = SubLObjectFactory.makeKeyword("SUPPORTS");
        $ic489$ = SubLObjectFactory.makeKeyword("PRAGMA-SUPPORTS");
        $ic490$ = SubLObjectFactory.makeKeyword("PROOFS");
        $ic491$ = SubLObjectFactory.makeSymbol("S#28682", "CYC");
        $ic492$ = SubLObjectFactory.makeSymbol("S#28684", "CYC");
        $ic493$ = SubLObjectFactory.makeString("#<");
        $ic494$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic495$ = SubLObjectFactory.makeKeyword("BASE");
        $ic496$ = SubLObjectFactory.makeString("<INF-ANS-JUST:~s>");
        $ic497$ = SubLObjectFactory.makeSymbol("S#28688", "CYC");
        $ic498$ = SubLObjectFactory.makeSymbol("S#14254", "CYC");
        $ic499$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25415", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#14271", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic500$ = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS");
        $ic501$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28821", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27811", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic502$ = SubLObjectFactory.makeUninternedSymbol("US#4EB23BD");
        $ic503$ = SubLObjectFactory.makeUninternedSymbol("US#72EAA40");
        $ic504$ = SubLObjectFactory.makeUninternedSymbol("US#589E10F");
        $ic505$ = SubLObjectFactory.makeSymbol("S#27443", "CYC");
        $ic506$ = SubLObjectFactory.makeSymbol("S#27862", "CYC");
        $ic507$ = SubLObjectFactory.makeSymbol("MEMBER?");
        $ic508$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)module0369.EQL));
        $ic509$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27894", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic510$ = SubLObjectFactory.makeUninternedSymbol("US#72EAA40");
        $ic511$ = SubLObjectFactory.makeUninternedSymbol("US#1F4A64E");
        $ic512$ = SubLObjectFactory.makeUninternedSymbol("US#74AA3DF");
        $ic513$ = SubLObjectFactory.makeSymbol("S#28697", "CYC");
        $ic514$ = SubLObjectFactory.makeSymbol("S#27845", "CYC");
        $ic515$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic516$ = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $ic517$ = SubLObjectFactory.makeSymbol("S#26816", "CYC");
        $ic518$ = SubLObjectFactory.makeKeyword("TV");
        $ic519$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic520$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic521$ = SubLObjectFactory.makeSymbol("S#26480", "CYC");
        $ic522$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic523$ = SubLObjectFactory.makeSymbol("CAR");
        $ic524$ = SubLObjectFactory.makeKeyword("NEW-ROOT-TIMES");
        $ic525$ = SubLObjectFactory.makeKeyword("NEW-ROOT-COUNT");
        $ic526$ = SubLObjectFactory.makeKeyword("PROBLEM-CREATION-TIMES");
        $ic527$ = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-QUERY-PROPERTIES");
        $ic528$ = SubLObjectFactory.makeKeyword("INFERENCE-STRONGEST-QUERY-PROPERTIES");
        $ic529$ = SubLObjectFactory.makeKeyword("INFERENCE-MOST-EFFICIENT-QUERY-PROPERTIES");
        $ic530$ = SubLObjectFactory.makeKeyword("INFERENCE-IDS");
        $ic531$ = SubLObjectFactory.makeString("time to implement metric ~S");
        $ic532$ = SubLObjectFactory.makeSymbol("PROOF-SUID");
        $ic533$ = SubLObjectFactory.makeSymbol(">");
        $ic534$ = SubLObjectFactory.makeSymbol("CDR");
        $ic535$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28822", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic536$ = SubLObjectFactory.makeUninternedSymbol("US#54717E7");
        $ic537$ = SubLObjectFactory.makeSymbol("S#28386", "CYC");
        $ic538$ = SubLObjectFactory.makeSymbol("S#28729", "CYC");
        $ic539$ = SubLObjectFactory.makeString("Inference problem working time lock");
        $ic540$ = SubLObjectFactory.makeKeyword("NEW-ANSWER");
        $ic541$ = SubLObjectFactory.makeKeyword("STATUS-CHANGE");
        $ic542$ = SubLObjectFactory.makeKeyword("NEW-TRANSFORMATION-DEPTH-REACHED");
        $ic543$ = SubLObjectFactory.makeUninternedSymbol("US#2F07B76");
        $ic544$ = SubLObjectFactory.makeUninternedSymbol("US#54717E7");
        $ic545$ = SubLObjectFactory.makeUninternedSymbol("US#6B70E19");
        $ic546$ = SubLObjectFactory.makeUninternedSymbol("US#1D0E4E1");
        $ic547$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25385", "CYC")));
        $ic548$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-CONTROLLING-INFERENCE")));
        $ic549$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28823", "CYC")));
        $ic550$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic551$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic552$ = SubLObjectFactory.makeSymbol("S#28741", "CYC");
        $ic553$ = SubLObjectFactory.makeSymbol("S#28616", "CYC");
        $ic554$ = ConsesLow.list((SubLObject)module0369.NIL);
        $ic555$ = SubLObjectFactory.makeSymbol("S#28744", "CYC");
        $ic556$ = SubLObjectFactory.makeSymbol("S#28742", "CYC");
        $ic557$ = SubLObjectFactory.makeSymbol("S#28743", "CYC");
        $ic558$ = SubLObjectFactory.makeSymbol("-");
        $ic559$ = SubLObjectFactory.makeSymbol("S#28740", "CYC");
        $ic560$ = SubLObjectFactory.makeKeyword("START-TIME");
        $ic561$ = SubLObjectFactory.makeKeyword("START");
        $ic562$ = SubLObjectFactory.makeKeyword("END-TIME");
        $ic563$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-TOTAL-TIME");
        $ic564$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-START-TIMES");
        $ic565$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#28824", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28825", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic566$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPARQL"), (SubLObject)SubLObjectFactory.makeKeyword("RESULT-SET"));
        $ic567$ = SubLObjectFactory.makeKeyword("SPARQL");
        $ic568$ = SubLObjectFactory.makeKeyword("RESULT-SET");
        $ic569$ = SubLObjectFactory.makeUninternedSymbol("US#4EA6FBD");
        $ic570$ = SubLObjectFactory.makeUninternedSymbol("US#4EB23BD");
        $ic571$ = SubLObjectFactory.makeUninternedSymbol("US#352B2C1");
        $ic572$ = SubLObjectFactory.makeUninternedSymbol("US#13A2892");
        $ic573$ = SubLObjectFactory.makeUninternedSymbol("US#33E32D8");
        $ic574$ = SubLObjectFactory.makeSymbol("S#3425", "CYC");
        $ic575$ = SubLObjectFactory.makeSymbol("FWHEN");
        $ic576$ = SubLObjectFactory.makeSymbol("S#28618", "CYC");
        $ic577$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic578$ = SubLObjectFactory.makeSymbol("S#28747", "CYC");
        $ic579$ = SubLObjectFactory.makeSymbol("S#28746", "CYC");
        $ic580$ = SubLObjectFactory.makeKeyword("SPARQL-QUERY-PROFILE");
        $ic581$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-TOTAL-TIME-ACC");
        $ic582$ = SubLObjectFactory.makeKeyword("SKSI-QUERY-START-TIMES-ACC");
        $ic583$ = SubLObjectFactory.makeKeyword("SPARQL-QUERY-PROFILE-ACC");
    }
    
    public static final class $sX25426_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $problem_store;
        public SubLObject $forward_propagate;
        public SubLObject $input_mt;
        public SubLObject $input_el_query;
        public SubLObject $input_non_explanatory_el_query;
        public SubLObject $input_query_properties;
        public SubLObject $mt;
        public SubLObject $el_query;
        public SubLObject $el_bindings;
        public SubLObject $hl_query;
        public SubLObject $explanatory_subquery;
        public SubLObject $non_explanatory_subquery;
        public SubLObject $free_hl_vars;
        public SubLObject $hypothetical_bindings;
        public SubLObject $answer_id_index;
        public SubLObject $answer_bindings_index;
        public SubLObject $new_answer_id_start;
        public SubLObject $new_answer_justifications;
        public SubLObject $status;
        public SubLObject $suspend_status;
        public SubLObject $root_link;
        public SubLObject $relevant_problems;
        public SubLObject $strategy_set;
        public SubLObject $control_process;
        public SubLObject $interrupting_processes;
        public SubLObject $max_transformation_depth_reached;
        public SubLObject $disjunction_free_el_vars_policy;
        public SubLObject $result_uniqueness_criterion;
        public SubLObject $allow_hl_predicate_transformationP;
        public SubLObject $allow_unbound_predicate_transformationP;
        public SubLObject $allow_evaluatable_predicate_transformationP;
        public SubLObject $allow_indeterminate_resultsP;
        public SubLObject $allowed_rules;
        public SubLObject $forbidden_rules;
        public SubLObject $allowed_modules;
        public SubLObject $allow_abnormality_checkingP;
        public SubLObject $transitive_closure_mode;
        public SubLObject $problem_store_privateP;
        public SubLObject $continuableP;
        public SubLObject $browsableP;
        public SubLObject $return_type;
        public SubLObject $answer_language;
        public SubLObject $cache_resultsP;
        public SubLObject $blockingP;
        public SubLObject $max_number;
        public SubLObject $max_time;
        public SubLObject $max_step;
        public SubLObject $mode;
        public SubLObject $forward_max_time;
        public SubLObject $max_proof_depth;
        public SubLObject $max_transformation_depth;
        public SubLObject $min_rule_utility;
        public SubLObject $probably_approximately_done;
        public SubLObject $metrics_template;
        public SubLObject $start_universal_time;
        public SubLObject $start_internal_real_time;
        public SubLObject $end_internal_real_time;
        public SubLObject $pad_internal_real_time;
        public SubLObject $cumulative_time;
        public SubLObject $step_count;
        public SubLObject $cumulative_step_count;
        public SubLObject $events;
        public SubLObject $halt_conditions;
        public SubLObject $accumulators;
        public SubLObject $proof_watermark;
        public SubLObject $problem_working_time_data;
        public SubLObject $type;
        public SubLObject $data;
        private static final SubLStructDeclNative structDecl;
        
        public $sX25426_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$problem_store = (SubLObject)CommonSymbols.NIL;
            this.$forward_propagate = (SubLObject)CommonSymbols.NIL;
            this.$input_mt = (SubLObject)CommonSymbols.NIL;
            this.$input_el_query = (SubLObject)CommonSymbols.NIL;
            this.$input_non_explanatory_el_query = (SubLObject)CommonSymbols.NIL;
            this.$input_query_properties = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$el_query = (SubLObject)CommonSymbols.NIL;
            this.$el_bindings = (SubLObject)CommonSymbols.NIL;
            this.$hl_query = (SubLObject)CommonSymbols.NIL;
            this.$explanatory_subquery = (SubLObject)CommonSymbols.NIL;
            this.$non_explanatory_subquery = (SubLObject)CommonSymbols.NIL;
            this.$free_hl_vars = (SubLObject)CommonSymbols.NIL;
            this.$hypothetical_bindings = (SubLObject)CommonSymbols.NIL;
            this.$answer_id_index = (SubLObject)CommonSymbols.NIL;
            this.$answer_bindings_index = (SubLObject)CommonSymbols.NIL;
            this.$new_answer_id_start = (SubLObject)CommonSymbols.NIL;
            this.$new_answer_justifications = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$suspend_status = (SubLObject)CommonSymbols.NIL;
            this.$root_link = (SubLObject)CommonSymbols.NIL;
            this.$relevant_problems = (SubLObject)CommonSymbols.NIL;
            this.$strategy_set = (SubLObject)CommonSymbols.NIL;
            this.$control_process = (SubLObject)CommonSymbols.NIL;
            this.$interrupting_processes = (SubLObject)CommonSymbols.NIL;
            this.$max_transformation_depth_reached = (SubLObject)CommonSymbols.NIL;
            this.$disjunction_free_el_vars_policy = (SubLObject)CommonSymbols.NIL;
            this.$result_uniqueness_criterion = (SubLObject)CommonSymbols.NIL;
            this.$allow_hl_predicate_transformationP = (SubLObject)CommonSymbols.NIL;
            this.$allow_unbound_predicate_transformationP = (SubLObject)CommonSymbols.NIL;
            this.$allow_evaluatable_predicate_transformationP = (SubLObject)CommonSymbols.NIL;
            this.$allow_indeterminate_resultsP = (SubLObject)CommonSymbols.NIL;
            this.$allowed_rules = (SubLObject)CommonSymbols.NIL;
            this.$forbidden_rules = (SubLObject)CommonSymbols.NIL;
            this.$allowed_modules = (SubLObject)CommonSymbols.NIL;
            this.$allow_abnormality_checkingP = (SubLObject)CommonSymbols.NIL;
            this.$transitive_closure_mode = (SubLObject)CommonSymbols.NIL;
            this.$problem_store_privateP = (SubLObject)CommonSymbols.NIL;
            this.$continuableP = (SubLObject)CommonSymbols.NIL;
            this.$browsableP = (SubLObject)CommonSymbols.NIL;
            this.$return_type = (SubLObject)CommonSymbols.NIL;
            this.$answer_language = (SubLObject)CommonSymbols.NIL;
            this.$cache_resultsP = (SubLObject)CommonSymbols.NIL;
            this.$blockingP = (SubLObject)CommonSymbols.NIL;
            this.$max_number = (SubLObject)CommonSymbols.NIL;
            this.$max_time = (SubLObject)CommonSymbols.NIL;
            this.$max_step = (SubLObject)CommonSymbols.NIL;
            this.$mode = (SubLObject)CommonSymbols.NIL;
            this.$forward_max_time = (SubLObject)CommonSymbols.NIL;
            this.$max_proof_depth = (SubLObject)CommonSymbols.NIL;
            this.$max_transformation_depth = (SubLObject)CommonSymbols.NIL;
            this.$min_rule_utility = (SubLObject)CommonSymbols.NIL;
            this.$probably_approximately_done = (SubLObject)CommonSymbols.NIL;
            this.$metrics_template = (SubLObject)CommonSymbols.NIL;
            this.$start_universal_time = (SubLObject)CommonSymbols.NIL;
            this.$start_internal_real_time = (SubLObject)CommonSymbols.NIL;
            this.$end_internal_real_time = (SubLObject)CommonSymbols.NIL;
            this.$pad_internal_real_time = (SubLObject)CommonSymbols.NIL;
            this.$cumulative_time = (SubLObject)CommonSymbols.NIL;
            this.$step_count = (SubLObject)CommonSymbols.NIL;
            this.$cumulative_step_count = (SubLObject)CommonSymbols.NIL;
            this.$events = (SubLObject)CommonSymbols.NIL;
            this.$halt_conditions = (SubLObject)CommonSymbols.NIL;
            this.$accumulators = (SubLObject)CommonSymbols.NIL;
            this.$proof_watermark = (SubLObject)CommonSymbols.NIL;
            this.$problem_working_time_data = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX25426_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$problem_store;
        }
        
        public SubLObject getField4() {
            return this.$forward_propagate;
        }
        
        public SubLObject getField5() {
            return this.$input_mt;
        }
        
        public SubLObject getField6() {
            return this.$input_el_query;
        }
        
        public SubLObject getField7() {
            return this.$input_non_explanatory_el_query;
        }
        
        public SubLObject getField8() {
            return this.$input_query_properties;
        }
        
        public SubLObject getField9() {
            return this.$mt;
        }
        
        public SubLObject getField10() {
            return this.$el_query;
        }
        
        public SubLObject getField11() {
            return this.$el_bindings;
        }
        
        public SubLObject getField12() {
            return this.$hl_query;
        }
        
        public SubLObject getField13() {
            return this.$explanatory_subquery;
        }
        
        public SubLObject getField14() {
            return this.$non_explanatory_subquery;
        }
        
        public SubLObject getField15() {
            return this.$free_hl_vars;
        }
        
        public SubLObject getField16() {
            return this.$hypothetical_bindings;
        }
        
        public SubLObject getField17() {
            return this.$answer_id_index;
        }
        
        public SubLObject getField18() {
            return this.$answer_bindings_index;
        }
        
        public SubLObject getField19() {
            return this.$new_answer_id_start;
        }
        
        public SubLObject getField20() {
            return this.$new_answer_justifications;
        }
        
        public SubLObject getField21() {
            return this.$status;
        }
        
        public SubLObject getField22() {
            return this.$suspend_status;
        }
        
        public SubLObject getField23() {
            return this.$root_link;
        }
        
        public SubLObject getField24() {
            return this.$relevant_problems;
        }
        
        public SubLObject getField25() {
            return this.$strategy_set;
        }
        
        public SubLObject getField26() {
            return this.$control_process;
        }
        
        public SubLObject getField27() {
            return this.$interrupting_processes;
        }
        
        public SubLObject getField28() {
            return this.$max_transformation_depth_reached;
        }
        
        public SubLObject getField29() {
            return this.$disjunction_free_el_vars_policy;
        }
        
        public SubLObject getField30() {
            return this.$result_uniqueness_criterion;
        }
        
        public SubLObject getField31() {
            return this.$allow_hl_predicate_transformationP;
        }
        
        public SubLObject getField32() {
            return this.$allow_unbound_predicate_transformationP;
        }
        
        public SubLObject getField33() {
            return this.$allow_evaluatable_predicate_transformationP;
        }
        
        public SubLObject getField34() {
            return this.$allow_indeterminate_resultsP;
        }
        
        public SubLObject getField35() {
            return this.$allowed_rules;
        }
        
        public SubLObject getField36() {
            return this.$forbidden_rules;
        }
        
        public SubLObject getField37() {
            return this.$allowed_modules;
        }
        
        public SubLObject getField38() {
            return this.$allow_abnormality_checkingP;
        }
        
        public SubLObject getField39() {
            return this.$transitive_closure_mode;
        }
        
        public SubLObject getField40() {
            return this.$problem_store_privateP;
        }
        
        public SubLObject getField41() {
            return this.$continuableP;
        }
        
        public SubLObject getField42() {
            return this.$browsableP;
        }
        
        public SubLObject getField43() {
            return this.$return_type;
        }
        
        public SubLObject getField44() {
            return this.$answer_language;
        }
        
        public SubLObject getField45() {
            return this.$cache_resultsP;
        }
        
        public SubLObject getField46() {
            return this.$blockingP;
        }
        
        public SubLObject getField47() {
            return this.$max_number;
        }
        
        public SubLObject getField48() {
            return this.$max_time;
        }
        
        public SubLObject getField49() {
            return this.$max_step;
        }
        
        public SubLObject getField50() {
            return this.$mode;
        }
        
        public SubLObject getField51() {
            return this.$forward_max_time;
        }
        
        public SubLObject getField52() {
            return this.$max_proof_depth;
        }
        
        public SubLObject getField53() {
            return this.$max_transformation_depth;
        }
        
        public SubLObject getField54() {
            return this.$min_rule_utility;
        }
        
        public SubLObject getField55() {
            return this.$probably_approximately_done;
        }
        
        public SubLObject getField56() {
            return this.$metrics_template;
        }
        
        public SubLObject getField57() {
            return this.$start_universal_time;
        }
        
        public SubLObject getField58() {
            return this.$start_internal_real_time;
        }
        
        public SubLObject getField59() {
            return this.$end_internal_real_time;
        }
        
        public SubLObject getField60() {
            return this.$pad_internal_real_time;
        }
        
        public SubLObject getField61() {
            return this.$cumulative_time;
        }
        
        public SubLObject getField62() {
            return this.$step_count;
        }
        
        public SubLObject getField63() {
            return this.$cumulative_step_count;
        }
        
        public SubLObject getField64() {
            return this.$events;
        }
        
        public SubLObject getField65() {
            return this.$halt_conditions;
        }
        
        public SubLObject getField66() {
            return this.$accumulators;
        }
        
        public SubLObject getField67() {
            return this.$proof_watermark;
        }
        
        public SubLObject getField68() {
            return this.$problem_working_time_data;
        }
        
        public SubLObject getField69() {
            return this.$type;
        }
        
        public SubLObject getField70() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$problem_store = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$forward_propagate = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$input_mt = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$input_el_query = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$input_non_explanatory_el_query = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$input_query_properties = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$el_query = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$el_bindings = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$hl_query = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$explanatory_subquery = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$non_explanatory_subquery = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$free_hl_vars = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$hypothetical_bindings = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$answer_id_index = value;
        }
        
        public SubLObject setField18(final SubLObject value) {
            return this.$answer_bindings_index = value;
        }
        
        public SubLObject setField19(final SubLObject value) {
            return this.$new_answer_id_start = value;
        }
        
        public SubLObject setField20(final SubLObject value) {
            return this.$new_answer_justifications = value;
        }
        
        public SubLObject setField21(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField22(final SubLObject value) {
            return this.$suspend_status = value;
        }
        
        public SubLObject setField23(final SubLObject value) {
            return this.$root_link = value;
        }
        
        public SubLObject setField24(final SubLObject value) {
            return this.$relevant_problems = value;
        }
        
        public SubLObject setField25(final SubLObject value) {
            return this.$strategy_set = value;
        }
        
        public SubLObject setField26(final SubLObject value) {
            return this.$control_process = value;
        }
        
        public SubLObject setField27(final SubLObject value) {
            return this.$interrupting_processes = value;
        }
        
        public SubLObject setField28(final SubLObject value) {
            return this.$max_transformation_depth_reached = value;
        }
        
        public SubLObject setField29(final SubLObject value) {
            return this.$disjunction_free_el_vars_policy = value;
        }
        
        public SubLObject setField30(final SubLObject value) {
            return this.$result_uniqueness_criterion = value;
        }
        
        public SubLObject setField31(final SubLObject value) {
            return this.$allow_hl_predicate_transformationP = value;
        }
        
        public SubLObject setField32(final SubLObject value) {
            return this.$allow_unbound_predicate_transformationP = value;
        }
        
        public SubLObject setField33(final SubLObject value) {
            return this.$allow_evaluatable_predicate_transformationP = value;
        }
        
        public SubLObject setField34(final SubLObject value) {
            return this.$allow_indeterminate_resultsP = value;
        }
        
        public SubLObject setField35(final SubLObject value) {
            return this.$allowed_rules = value;
        }
        
        public SubLObject setField36(final SubLObject value) {
            return this.$forbidden_rules = value;
        }
        
        public SubLObject setField37(final SubLObject value) {
            return this.$allowed_modules = value;
        }
        
        public SubLObject setField38(final SubLObject value) {
            return this.$allow_abnormality_checkingP = value;
        }
        
        public SubLObject setField39(final SubLObject value) {
            return this.$transitive_closure_mode = value;
        }
        
        public SubLObject setField40(final SubLObject value) {
            return this.$problem_store_privateP = value;
        }
        
        public SubLObject setField41(final SubLObject value) {
            return this.$continuableP = value;
        }
        
        public SubLObject setField42(final SubLObject value) {
            return this.$browsableP = value;
        }
        
        public SubLObject setField43(final SubLObject value) {
            return this.$return_type = value;
        }
        
        public SubLObject setField44(final SubLObject value) {
            return this.$answer_language = value;
        }
        
        public SubLObject setField45(final SubLObject value) {
            return this.$cache_resultsP = value;
        }
        
        public SubLObject setField46(final SubLObject value) {
            return this.$blockingP = value;
        }
        
        public SubLObject setField47(final SubLObject value) {
            return this.$max_number = value;
        }
        
        public SubLObject setField48(final SubLObject value) {
            return this.$max_time = value;
        }
        
        public SubLObject setField49(final SubLObject value) {
            return this.$max_step = value;
        }
        
        public SubLObject setField50(final SubLObject value) {
            return this.$mode = value;
        }
        
        public SubLObject setField51(final SubLObject value) {
            return this.$forward_max_time = value;
        }
        
        public SubLObject setField52(final SubLObject value) {
            return this.$max_proof_depth = value;
        }
        
        public SubLObject setField53(final SubLObject value) {
            return this.$max_transformation_depth = value;
        }
        
        public SubLObject setField54(final SubLObject value) {
            return this.$min_rule_utility = value;
        }
        
        public SubLObject setField55(final SubLObject value) {
            return this.$probably_approximately_done = value;
        }
        
        public SubLObject setField56(final SubLObject value) {
            return this.$metrics_template = value;
        }
        
        public SubLObject setField57(final SubLObject value) {
            return this.$start_universal_time = value;
        }
        
        public SubLObject setField58(final SubLObject value) {
            return this.$start_internal_real_time = value;
        }
        
        public SubLObject setField59(final SubLObject value) {
            return this.$end_internal_real_time = value;
        }
        
        public SubLObject setField60(final SubLObject value) {
            return this.$pad_internal_real_time = value;
        }
        
        public SubLObject setField61(final SubLObject value) {
            return this.$cumulative_time = value;
        }
        
        public SubLObject setField62(final SubLObject value) {
            return this.$step_count = value;
        }
        
        public SubLObject setField63(final SubLObject value) {
            return this.$cumulative_step_count = value;
        }
        
        public SubLObject setField64(final SubLObject value) {
            return this.$events = value;
        }
        
        public SubLObject setField65(final SubLObject value) {
            return this.$halt_conditions = value;
        }
        
        public SubLObject setField66(final SubLObject value) {
            return this.$accumulators = value;
        }
        
        public SubLObject setField67(final SubLObject value) {
            return this.$proof_watermark = value;
        }
        
        public SubLObject setField68(final SubLObject value) {
            return this.$problem_working_time_data = value;
        }
        
        public SubLObject setField69(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField70(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX25426_native.class, module0369.$ic1$, module0369.$ic2$, module0369.$ic3$, module0369.$ic4$, new String[] { "$suid", "$problem_store", "$forward_propagate", "$input_mt", "$input_el_query", "$input_non_explanatory_el_query", "$input_query_properties", "$mt", "$el_query", "$el_bindings", "$hl_query", "$explanatory_subquery", "$non_explanatory_subquery", "$free_hl_vars", "$hypothetical_bindings", "$answer_id_index", "$answer_bindings_index", "$new_answer_id_start", "$new_answer_justifications", "$status", "$suspend_status", "$root_link", "$relevant_problems", "$strategy_set", "$control_process", "$interrupting_processes", "$max_transformation_depth_reached", "$disjunction_free_el_vars_policy", "$result_uniqueness_criterion", "$allow_hl_predicate_transformationP", "$allow_unbound_predicate_transformationP", "$allow_evaluatable_predicate_transformationP", "$allow_indeterminate_resultsP", "$allowed_rules", "$forbidden_rules", "$allowed_modules", "$allow_abnormality_checkingP", "$transitive_closure_mode", "$problem_store_privateP", "$continuableP", "$browsableP", "$return_type", "$answer_language", "$cache_resultsP", "$blockingP", "$max_number", "$max_time", "$max_step", "$mode", "$forward_max_time", "$max_proof_depth", "$max_transformation_depth", "$min_rule_utility", "$probably_approximately_done", "$metrics_template", "$start_universal_time", "$start_internal_real_time", "$end_internal_real_time", "$pad_internal_real_time", "$cumulative_time", "$step_count", "$cumulative_step_count", "$events", "$halt_conditions", "$accumulators", "$proof_watermark", "$problem_working_time_data", "$type", "$data" }, module0369.$ic5$, module0369.$ic6$, module0369.$ic7$);
        }
    }
    
    public static final class $f25275$UnaryFunction extends UnaryFunction
    {
        public $f25275$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-P"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0369.f25275(var4);
        }
    }
    
    public static final class $f25425$UnaryFunction extends UnaryFunction
    {
        public $f25425$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28197"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0369.f25425(var4);
        }
    }
    
    public static final class $sX28211_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $inference;
        public SubLObject $bindings;
        public SubLObject $justifications;
        public SubLObject $elapsed_creation_time;
        public SubLObject $step_count;
        private static final SubLStructDeclNative structDecl;
        
        public $sX28211_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$justifications = (SubLObject)CommonSymbols.NIL;
            this.$elapsed_creation_time = (SubLObject)CommonSymbols.NIL;
            this.$step_count = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX28211_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$inference;
        }
        
        public SubLObject getField4() {
            return this.$bindings;
        }
        
        public SubLObject getField5() {
            return this.$justifications;
        }
        
        public SubLObject getField6() {
            return this.$elapsed_creation_time;
        }
        
        public SubLObject getField7() {
            return this.$step_count;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$inference = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$justifications = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$elapsed_creation_time = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$step_count = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX28211_native.class, module0369.$ic431$, module0369.$ic423$, module0369.$ic432$, module0369.$ic433$, new String[] { "$suid", "$inference", "$bindings", "$justifications", "$elapsed_creation_time", "$step_count" }, module0369.$ic434$, module0369.$ic435$, module0369.$ic436$);
        }
    }
    
    public static final class $f25684$UnaryFunction extends UnaryFunction
    {
        public $f25684$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-ANSWER-P"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0369.f25684(var4);
        }
    }
    
    public static final class $sX28214_native extends SubLStructNative
    {
        public SubLObject $answer;
        public SubLObject $supports;
        public SubLObject $pragma_supports;
        public SubLObject $proofs;
        private static final SubLStructDeclNative structDecl;
        
        public $sX28214_native() {
            this.$answer = (SubLObject)CommonSymbols.NIL;
            this.$supports = (SubLObject)CommonSymbols.NIL;
            this.$pragma_supports = (SubLObject)CommonSymbols.NIL;
            this.$proofs = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX28214_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$answer;
        }
        
        public SubLObject getField3() {
            return this.$supports;
        }
        
        public SubLObject getField4() {
            return this.$pragma_supports;
        }
        
        public SubLObject getField5() {
            return this.$proofs;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$answer = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$supports = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$pragma_supports = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$proofs = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX28214_native.class, module0369.$ic471$, module0369.$ic424$, module0369.$ic472$, module0369.$ic473$, new String[] { "$answer", "$supports", "$pragma_supports", "$proofs" }, module0369.$ic474$, module0369.$ic475$, module0369.$ic476$);
        }
    }
    
    public static final class $f25691$UnaryFunction extends UnaryFunction
    {
        public $f25691$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#28215"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0369.f25691(var4);
        }
    }
    
    public static final class $f25775$UnaryFunction extends UnaryFunction
    {
        public $f25775$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-ANSWER-JUSTIFICATION-SUPPORTS"));
        }
        
        public SubLObject processItem(final SubLObject var4) {
            return module0369.f25775(var4);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0369.class
	Total time: 3161 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/