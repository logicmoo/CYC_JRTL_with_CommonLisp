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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0709 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0709";
    public static final String myFingerPrint = "034c38d42e75098dad56f7572f6dad42fdd70d40ede0a1b71e36033932a91607";
    private static SubLSymbol $g5539$;
    private static SubLSymbol $g5540$;
    private static SubLSymbol $g5541$;
    private static SubLSymbol $g5542$;
    private static SubLSymbol $g5543$;
    private static SubLSymbol $g5544$;
    private static SubLSymbol $g5545$;
    private static SubLSymbol $g5546$;
    private static SubLSymbol $g5547$;
    private static SubLSymbol $g5548$;
    private static SubLSymbol $g5549$;
    private static SubLSymbol $g5550$;
    private static SubLSymbol $g5551$;
    private static SubLSymbol $g5552$;
    private static SubLSymbol $g5553$;
    public static SubLSymbol $g5554$;
    public static SubLSymbol $g5555$;
    private static SubLSymbol $g5556$;
    private static SubLSymbol $g5557$;
    private static SubLSymbol $g5558$;
    private static SubLSymbol $g5559$;
    private static SubLSymbol $g5560$;
    private static SubLSymbol $g5561$;
    private static SubLSymbol $g5562$;
    private static SubLSymbol $g5563$;
    private static SubLSymbol $g5564$;
    private static SubLSymbol $g5565$;
    private static SubLSymbol $g5566$;
    private static SubLSymbol $g5567$;
    private static SubLSymbol $g5568$;
    private static SubLSymbol $g5569$;
    private static SubLSymbol $g5570$;
    private static SubLSymbol $g5571$;
    private static SubLSymbol $g5572$;
    private static SubLSymbol $g5573$;
    public static SubLSymbol $g5574$;
    private static SubLSymbol $g5575$;
    private static SubLSymbol $g5576$;
    public static SubLSymbol $g5577$;
    private static SubLSymbol $g5578$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLInteger $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLString $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
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
    private static final SubLString $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLInteger $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLList $ic92$;
    private static final SubLObject $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLObject $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLObject $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLObject $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLInteger $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLObject $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLList $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
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
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLList $ic162$;
    private static final SubLList $ic163$;
    private static final SubLList $ic164$;
    private static final SubLList $ic165$;
    private static final SubLList $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLList $ic171$;
    private static final SubLList $ic172$;
    private static final SubLList $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLList $ic177$;
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
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLObject $ic211$;
    private static final SubLObject $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLString $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLString $ic217$;
    private static final SubLString $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLList $ic221$;
    private static final SubLList $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLList $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLObject $ic232$;
    private static final SubLList $ic233$;
    private static final SubLObject $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLList $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLObject $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLObject $ic245$;
    private static final SubLList $ic246$;
    private static final SubLObject $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLString $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLString $ic260$;
    private static final SubLString $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLString $ic264$;
    private static final SubLString $ic265$;
    private static final SubLString $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLString $ic268$;
    private static final SubLString $ic269$;
    private static final SubLString $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLString $ic275$;
    private static final SubLString $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLString $ic282$;
    private static final SubLString $ic283$;
    private static final SubLString $ic284$;
    private static final SubLString $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLString $ic287$;
    private static final SubLString $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLString $ic290$;
    private static final SubLString $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLSymbol $ic294$;
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
    private static final SubLSymbol $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLString $ic310$;
    private static final SubLString $ic311$;
    private static final SubLList $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLString $ic314$;
    private static final SubLString $ic315$;
    private static final SubLString $ic316$;
    private static final SubLString $ic317$;
    private static final SubLString $ic318$;
    private static final SubLString $ic319$;
    private static final SubLString $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLString $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLString $ic328$;
    private static final SubLString $ic329$;
    private static final SubLString $ic330$;
    private static final SubLString $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLString $ic333$;
    private static final SubLString $ic334$;
    private static final SubLString $ic335$;
    private static final SubLString $ic336$;
    private static final SubLString $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLList $ic342$;
    private static final SubLList $ic343$;
    private static final SubLList $ic344$;
    private static final SubLSymbol $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLList $ic347$;
    private static final SubLString $ic348$;
    private static final SubLString $ic349$;
    private static final SubLObject $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLObject $ic352$;
    private static final SubLList $ic353$;
    private static final SubLList $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLString $ic357$;
    private static final SubLString $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLString $ic360$;
    private static final SubLString $ic361$;
    private static final SubLObject $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLObject $ic364$;
    private static final SubLObject $ic365$;
    private static final SubLObject $ic366$;
    private static final SubLString $ic367$;
    private static final SubLList $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLObject $ic370$;
    private static final SubLList $ic371$;
    private static final SubLList $ic372$;
    private static final SubLSymbol $ic373$;
    private static final SubLString $ic374$;
    private static final SubLString $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLString $ic378$;
    private static final SubLString $ic379$;
    private static final SubLString $ic380$;
    private static final SubLSymbol $ic381$;
    private static final SubLObject $ic382$;
    private static final SubLObject $ic383$;
    private static final SubLObject $ic384$;
    private static final SubLList $ic385$;
    private static final SubLSymbol $ic386$;
    private static final SubLObject $ic387$;
    private static final SubLObject $ic388$;
    private static final SubLObject $ic389$;
    private static final SubLObject $ic390$;
    private static final SubLObject $ic391$;
    private static final SubLObject $ic392$;
    private static final SubLList $ic393$;
    private static final SubLObject $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLString $ic396$;
    private static final SubLObject $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLObject $ic400$;
    private static final SubLList $ic401$;
    private static final SubLObject $ic402$;
    private static final SubLList $ic403$;
    private static final SubLObject $ic404$;
    private static final SubLString $ic405$;
    private static final SubLObject $ic406$;
    private static final SubLString $ic407$;
    private static final SubLObject $ic408$;
    private static final SubLString $ic409$;
    private static final SubLString $ic410$;
    private static final SubLString $ic411$;
    private static final SubLObject $ic412$;
    private static final SubLList $ic413$;
    private static final SubLString $ic414$;
    private static final SubLObject $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLString $ic418$;
    private static final SubLSymbol $ic419$;
    private static final SubLSymbol $ic420$;
    private static final SubLSymbol $ic421$;
    private static final SubLString $ic422$;
    private static final SubLSymbol $ic423$;
    private static final SubLString $ic424$;
    private static final SubLList $ic425$;
    private static final SubLSymbol $ic426$;
    private static final SubLString $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLString $ic429$;
    private static final SubLSymbol $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLString $ic432$;
    private static final SubLFloat $ic433$;
    private static final SubLString $ic434$;
    private static final SubLString $ic435$;
    private static final SubLString $ic436$;
    private static final SubLString $ic437$;
    private static final SubLList $ic438$;
    private static final SubLString $ic439$;
    private static final SubLList $ic440$;
    private static final SubLString $ic441$;
    private static final SubLSymbol $ic442$;
    private static final SubLString $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLSymbol $ic445$;
    private static final SubLString $ic446$;
    private static final SubLList $ic447$;
    private static final SubLList $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLString $ic450$;
    private static final SubLSymbol $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLSymbol $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLString $ic455$;
    private static final SubLString $ic456$;
    private static final SubLString $ic457$;
    private static final SubLString $ic458$;
    private static final SubLString $ic459$;
    private static final SubLString $ic460$;
    private static final SubLString $ic461$;
    private static final SubLString $ic462$;
    private static final SubLSymbol $ic463$;
    private static final SubLSymbol $ic464$;
    private static final SubLString $ic465$;
    private static final SubLObject $ic466$;
    private static final SubLString $ic467$;
    private static final SubLObject $ic468$;
    private static final SubLList $ic469$;
    private static final SubLString $ic470$;
    private static final SubLObject $ic471$;
    private static final SubLString $ic472$;
    private static final SubLString $ic473$;
    private static final SubLString $ic474$;
    private static final SubLString $ic475$;
    private static final SubLObject $ic476$;
    private static final SubLString $ic477$;
    private static final SubLObject $ic478$;
    private static final SubLSymbol $ic479$;
    private static final SubLString $ic480$;
    private static final SubLObject $ic481$;
    private static final SubLString $ic482$;
    private static final SubLList $ic483$;
    private static final SubLSymbol $ic484$;
    private static final SubLObject $ic485$;
    private static final SubLList $ic486$;
    private static final SubLList $ic487$;
    private static final SubLObject $ic488$;
    private static final SubLObject $ic489$;
    private static final SubLString $ic490$;
    private static final SubLObject $ic491$;
    private static final SubLString $ic492$;
    private static final SubLList $ic493$;
    private static final SubLString $ic494$;
    private static final SubLString $ic495$;
    private static final SubLString $ic496$;
    private static final SubLString $ic497$;
    private static final SubLObject $ic498$;
    private static final SubLString $ic499$;
    private static final SubLObject $ic500$;
    private static final SubLString $ic501$;
    private static final SubLObject $ic502$;
    private static final SubLString $ic503$;
    private static final SubLObject $ic504$;
    private static final SubLString $ic505$;
    private static final SubLObject $ic506$;
    private static final SubLObject $ic507$;
    private static final SubLString $ic508$;
    private static final SubLObject $ic509$;
    private static final SubLList $ic510$;
    private static final SubLList $ic511$;
    private static final SubLList $ic512$;
    private static final SubLList $ic513$;
    private static final SubLList $ic514$;
    private static final SubLList $ic515$;
    private static final SubLSymbol $ic516$;
    private static final SubLSymbol $ic517$;
    private static final SubLSymbol $ic518$;
    private static final SubLString $ic519$;
    private static final SubLSymbol $ic520$;
    private static final SubLString $ic521$;
    private static final SubLString $ic522$;
    private static final SubLSymbol $ic523$;
    private static final SubLString $ic524$;
    private static final SubLList $ic525$;
    private static final SubLObject $ic526$;
    private static final SubLSymbol $ic527$;
    private static final SubLString $ic528$;
    private static final SubLSymbol $ic529$;
    private static final SubLString $ic530$;
    private static final SubLString $ic531$;
    private static final SubLString $ic532$;
    private static final SubLSymbol $ic533$;
    private static final SubLList $ic534$;
    private static final SubLList $ic535$;
    private static final SubLList $ic536$;
    private static final SubLList $ic537$;
    private static final SubLSymbol $ic538$;
    private static final SubLSymbol $ic539$;
    private static final SubLList $ic540$;
    private static final SubLSymbol $ic541$;
    private static final SubLSymbol $ic542$;
    private static final SubLSymbol $ic543$;
    private static final SubLSymbol $ic544$;
    private static final SubLSymbol $ic545$;
    private static final SubLSymbol $ic546$;
    private static final SubLSymbol $ic547$;
    private static final SubLSymbol $ic548$;
    private static final SubLSymbol $ic549$;
    private static final SubLSymbol $ic550$;
    private static final SubLSymbol $ic551$;
    private static final SubLSymbol $ic552$;
    private static final SubLSymbol $ic553$;
    private static final SubLSymbol $ic554$;
    private static final SubLString $ic555$;
    private static final SubLList $ic556$;
    private static final SubLString $ic557$;
    private static final SubLSymbol $ic558$;
    private static final SubLSymbol $ic559$;
    private static final SubLString $ic560$;
    private static final SubLString $ic561$;
    private static final SubLString $ic562$;
    private static final SubLString $ic563$;
    private static final SubLString $ic564$;
    private static final SubLString $ic565$;
    private static final SubLString $ic566$;
    private static final SubLString $ic567$;
    private static final SubLString $ic568$;
    private static final SubLString $ic569$;
    private static final SubLString $ic570$;
    private static final SubLString $ic571$;
    private static final SubLString $ic572$;
    private static final SubLString $ic573$;
    private static final SubLString $ic574$;
    private static final SubLString $ic575$;
    private static final SubLString $ic576$;
    private static final SubLString $ic577$;
    private static final SubLString $ic578$;
    private static final SubLString $ic579$;
    private static final SubLString $ic580$;
    private static final SubLString $ic581$;
    private static final SubLString $ic582$;
    private static final SubLString $ic583$;
    private static final SubLString $ic584$;
    private static final SubLString $ic585$;
    private static final SubLString $ic586$;
    private static final SubLString $ic587$;
    private static final SubLString $ic588$;
    private static final SubLString $ic589$;
    private static final SubLString $ic590$;
    private static final SubLList $ic591$;
    private static final SubLString $ic592$;
    private static final SubLString $ic593$;
    private static final SubLString $ic594$;
    private static final SubLSymbol $ic595$;
    private static final SubLString $ic596$;
    private static final SubLString $ic597$;
    private static final SubLSymbol $ic598$;
    private static final SubLSymbol $ic599$;
    private static final SubLString $ic600$;
    private static final SubLString $ic601$;
    private static final SubLString $ic602$;
    private static final SubLSymbol $ic603$;
    private static final SubLString $ic604$;
    private static final SubLString $ic605$;
    private static final SubLSymbol $ic606$;
    private static final SubLString $ic607$;
    private static final SubLSymbol $ic608$;
    private static final SubLString $ic609$;
    private static final SubLSymbol $ic610$;
    private static final SubLString $ic611$;
    private static final SubLString $ic612$;
    private static final SubLString $ic613$;
    private static final SubLString $ic614$;
    private static final SubLString $ic615$;
    private static final SubLSymbol $ic616$;
    private static final SubLString $ic617$;
    private static final SubLSymbol $ic618$;
    private static final SubLString $ic619$;
    private static final SubLString $ic620$;
    private static final SubLString $ic621$;
    private static final SubLString $ic622$;
    private static final SubLString $ic623$;
    private static final SubLList $ic624$;
    private static final SubLString $ic625$;
    private static final SubLString $ic626$;
    private static final SubLList $ic627$;
    private static final SubLObject $ic628$;
    private static final SubLList $ic629$;
    private static final SubLObject $ic630$;
    private static final SubLString $ic631$;
    private static final SubLString $ic632$;
    private static final SubLString $ic633$;
    private static final SubLObject $ic634$;
    private static final SubLSymbol $ic635$;
    private static final SubLString $ic636$;
    private static final SubLString $ic637$;
    private static final SubLSymbol $ic638$;
    private static final SubLString $ic639$;
    private static final SubLSymbol $ic640$;
    private static final SubLSymbol $ic641$;
    private static final SubLSymbol $ic642$;
    private static final SubLList $ic643$;
    private static final SubLList $ic644$;
    private static final SubLList $ic645$;
    private static final SubLList $ic646$;
    private static final SubLSymbol $ic647$;
    private static final SubLSymbol $ic648$;
    private static final SubLList $ic649$;
    private static final SubLSymbol $ic650$;
    private static final SubLSymbol $ic651$;
    private static final SubLSymbol $ic652$;
    private static final SubLSymbol $ic653$;
    private static final SubLSymbol $ic654$;
    private static final SubLSymbol $ic655$;
    private static final SubLSymbol $ic656$;
    private static final SubLSymbol $ic657$;
    private static final SubLSymbol $ic658$;
    private static final SubLSymbol $ic659$;
    private static final SubLSymbol $ic660$;
    private static final SubLSymbol $ic661$;
    private static final SubLSymbol $ic662$;
    private static final SubLSymbol $ic663$;
    private static final SubLSymbol $ic664$;
    private static final SubLSymbol $ic665$;
    private static final SubLSymbol $ic666$;
    private static final SubLString $ic667$;
    private static final SubLSymbol $ic668$;
    private static final SubLSymbol $ic669$;
    private static final SubLList $ic670$;
    private static final SubLString $ic671$;
    private static final SubLSymbol $ic672$;
    private static final SubLList $ic673$;
    private static final SubLSymbol $ic674$;
    private static final SubLSymbol $ic675$;
    
    
    public static SubLObject f43059() {
        final SubLObject var1 = Sequences.position_if((SubLObject)module0709.$ic1$, module0709.$g5539$.getGlobalValue(), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        return module0038.f2666(module0038.f2623(module0709.$g5539$.getGlobalValue(), var1, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.TWO_INTEGER);
    }
    
    public static SubLObject f43060() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0709.$g5540$.getDynamicValue(var2);
    }
    
    public static SubLObject f43061(final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        assert module0709.NIL != module0210.f13572(var3) : var3;
        assert module0709.NIL != module0038.f2614(var4) : var4;
        final SubLObject var6 = module0259.f16822(var3, var5, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var7 = module0256.f16525(var3, var5, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var8 = module0067.f4880(Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED);
        final SubLObject var9 = module0067.f4880(Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED);
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)module0709.NIL;
        var11 = var10.first();
        while (module0709.NIL != var10) {
            SubLObject var10_12 = f43062(var11);
            SubLObject var12 = (SubLObject)module0709.NIL;
            var12 = var10_12.first();
            while (module0709.NIL != var10_12) {
                if (module0709.NIL != module0212.f13762(var12)) {
                    final SubLObject var13 = module0259.f16822(var12, var5, (SubLObject)module0709.UNPROVIDED);
                    final SubLObject var14 = module0256.f16525(var12, var5, (SubLObject)module0709.UNPROVIDED);
                    final SubLObject var15 = (module0709.NIL != module0257.f16693(var6, var13, var5, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED) || module0709.NIL != module0257.f16693(var7, var14, var5, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) ? var9 : var8;
                    final SubLObject var16 = module0303.f20271(var6, var13, var7, var14, var5);
                    final SubLObject var17 = (SubLObject)module0709.$ic5$;
                    final SubLObject var18 = Numbers.truncate(Numbers.divide(Numbers.multiply(var16, var17), (SubLObject)module0709.$ic6$), (SubLObject)module0709.UNPROVIDED);
                    module0067.f4886(var15, var12, var18);
                }
                var10_12 = var10_12.rest();
                var12 = var10_12.first();
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return Values.values(module0084.f5795(var8, Symbols.symbol_function((SubLObject)module0709.$ic7$)), module0084.f5795(var9, Symbols.symbol_function((SubLObject)module0709.$ic7$)));
    }
    
    public static SubLObject f43063(final SubLObject var20) {
        return f43064(var20);
    }
    
    public static SubLObject f43065() {
        f43066();
        f43067();
        f43068();
        f43069();
        f43070();
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43071(final SubLObject var20) {
        final SubLObject var21 = module0595.f36374(module0709.$ic8$, var20, (SubLObject)module0709.UNPROVIDED);
        SubLObject var22 = (SubLObject)module0709.NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)module0709.NIL;
        var24 = var23.first();
        while (module0709.NIL != var23) {
            SubLObject var10_24 = module0233.f15373(var24);
            SubLObject var25 = (SubLObject)module0709.NIL;
            var25 = var10_24.first();
            while (module0709.NIL != var10_24) {
                final SubLObject var26 = var25;
                if (module0709.NIL == conses_high.member(var26, var22, Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
                    var22 = (SubLObject)ConsesLow.cons(var26, var22);
                }
                var10_24 = var10_24.rest();
                var25 = var10_24.first();
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return var22;
    }
    
    public static SubLObject f43072(final SubLObject var13, final SubLObject var20) {
        return module0220.f14581(module0709.$ic9$, var13, var20, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43073(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)module0709.NIL;
        final SubLObject var16 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var17 = module0147.$g2095$.currentBinding(var14);
        try {
            module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var14);
            module0147.$g2095$.bind(module0709.$ic12$, var14);
            SubLObject var18 = (SubLObject)module0709.NIL;
            final SubLObject var19 = module0709.$ic9$;
            if (module0709.NIL != module0158.f10010(var13, (SubLObject)module0709.ONE_INTEGER, var19)) {
                final SubLObject var20 = module0158.f10011(var13, (SubLObject)module0709.ONE_INTEGER, var19);
                SubLObject var21 = (SubLObject)module0709.NIL;
                final SubLObject var22 = (SubLObject)module0709.NIL;
                while (module0709.NIL == var21) {
                    final SubLObject var23 = module0052.f3695(var20, var22);
                    final SubLObject var24 = (SubLObject)SubLObjectFactory.makeBoolean(!var22.eql(var23));
                    if (module0709.NIL != var24) {
                        SubLObject var25 = (SubLObject)module0709.NIL;
                        try {
                            var25 = module0158.f10316(var23, (SubLObject)module0709.$ic13$, (SubLObject)module0709.NIL, (SubLObject)module0709.NIL);
                            SubLObject var32_37 = (SubLObject)module0709.NIL;
                            final SubLObject var33_38 = (SubLObject)module0709.NIL;
                            while (module0709.NIL == var32_37) {
                                final SubLObject var26 = module0052.f3695(var25, var33_38);
                                final SubLObject var35_40 = (SubLObject)SubLObjectFactory.makeBoolean(!var33_38.eql(var26));
                                if (module0709.NIL != var35_40) {
                                    var18 = module0178.f11331(var26, (SubLObject)module0709.TWO_INTEGER);
                                    if (module0709.NIL != module0259.f16854(var18, module0709.$ic14$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                                        var15 = (SubLObject)module0709.T;
                                    }
                                }
                                var32_37 = (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL == var35_40);
                            }
                        }
                        finally {
                            final SubLObject var28_41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var14);
                                if (module0709.NIL != var25) {
                                    module0158.f10319(var25);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_41, var14);
                            }
                        }
                    }
                    var21 = (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL == var24);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var17, var14);
            module0147.$g2094$.rebind(var16, var14);
        }
        return var15;
    }
    
    public static SubLObject f43074(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = module0034.$g879$.getDynamicValue(var14);
        SubLObject var16 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var15) {
            return f43073(var13);
        }
        var16 = module0034.f1857(var15, (SubLObject)module0709.$ic10$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)module0709.$ic10$, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQ, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var15, (SubLObject)module0709.$ic10$, var16);
        }
        SubLObject var17 = module0034.f1814(var16, var13, (SubLObject)module0709.$ic15$);
        if (var17 == module0709.$ic15$) {
            var17 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43073(var13)));
            module0034.f1816(var16, var13, var17, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var17);
    }
    
    public static SubLObject f43075(final SubLObject var20) {
        final SubLObject var21 = module0220.f14565(var20, module0709.$ic9$, (SubLObject)module0709.TWO_INTEGER, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.UNPROVIDED);
        SubLObject var22 = (SubLObject)module0709.NIL;
        SubLObject var23 = module0220.f14565(var20, module0709.$ic16$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        SubLObject var24 = (SubLObject)module0709.NIL;
        var24 = var23.first();
        while (module0709.NIL != var23) {
            var22 = ConsesLow.append(var22, module0220.f14565(var24, module0709.$ic9$, (SubLObject)module0709.TWO_INTEGER, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.UNPROVIDED));
            var23 = var23.rest();
            var24 = var23.first();
        }
        return ConsesLow.append(var22, var21);
    }
    
    public static SubLObject f43076(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = f43077(var20);
        SubLObject var23 = (SubLObject)module0709.ZERO_INTEGER;
        final SubLObject var25;
        final SubLObject var24 = var25 = module0034.f1888();
        final SubLObject var26 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var25, var21);
            SubLObject var27 = (SubLObject)module0709.NIL;
            if (module0709.NIL != var25 && module0709.NIL == module0034.f1842(var25)) {
                var27 = module0034.f1869(var25);
                final SubLObject var28 = Threads.current_process();
                if (module0709.NIL == var27) {
                    module0034.f1873(var25, var28);
                }
                else if (!var27.eql(var28)) {
                    Errors.error((SubLObject)module0709.$ic17$);
                }
            }
            try {
                SubLObject var29 = var22;
                SubLObject var30 = (SubLObject)module0709.NIL;
                var30 = var29.first();
                while (module0709.NIL != var29) {
                    if (module0709.NIL != f43078(var30)) {
                        var23 = Numbers.add(var23, (SubLObject)module0709.ONE_INTEGER);
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
            }
            finally {
                final SubLObject var28_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var21);
                    if (module0709.NIL != var25 && module0709.NIL == var27) {
                        module0034.f1873(var25, (SubLObject)module0709.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var28_55, var21);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var26, var21);
        }
        return module0048.f3313(var23, Sequences.length(var22), (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43079(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0709.NIL;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var21);
            module0147.$g2095$.bind(module0709.$ic12$, var21);
            SubLObject var25 = f43077(var20);
            SubLObject var26 = (SubLObject)module0709.NIL;
            var26 = var25.first();
            while (module0709.NIL != var25) {
                final SubLObject var27 = f43080(var26, module0709.$ic18$, (SubLObject)module0709.UNPROVIDED);
                if (module0709.NIL == module0004.f105(var27)) {
                    Errors.sublisp_break((SubLObject)module0709.$ic19$, new SubLObject[] { var26 });
                }
                var22 = (SubLObject)ConsesLow.cons(var27, var22);
                var25 = var25.rest();
                var26 = var25.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var24, var21);
            module0147.$g2094$.rebind(var23, var21);
        }
        return (SubLObject)((module0709.NIL != var22) ? module0048.f3384(var22) : module0709.NIL);
    }
    
    public static SubLObject f43081(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0709.NIL;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var21);
            module0147.$g2095$.bind(module0709.$ic12$, var21);
            SubLObject var25 = f43063(var20);
            SubLObject var26 = (SubLObject)module0709.NIL;
            var26 = var25.first();
            while (module0709.NIL != var25) {
                final SubLObject var27 = f43080(var26, module0709.$ic18$, (SubLObject)module0709.UNPROVIDED);
                if (module0709.NIL == module0004.f105(var27)) {
                    Errors.sublisp_break((SubLObject)module0709.$ic19$, new SubLObject[] { var26 });
                }
                var22 = (SubLObject)ConsesLow.cons(var27, var22);
                var25 = var25.rest();
                var26 = var25.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var24, var21);
            module0147.$g2094$.rebind(var23, var21);
        }
        return (SubLObject)((module0709.NIL != var22) ? module0048.f3384(var22) : module0709.NIL);
    }
    
    public static SubLObject f43077(final SubLObject var20) {
        return module0035.remove_if_not((SubLObject)module0709.$ic20$, f43075(var20), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43078(final SubLObject var54) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL != f43082(var54) || module0709.NIL != f43083(var54));
    }
    
    public static SubLObject f43082(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0709.NIL;
        final SubLObject var57 = module0147.$g2094$.currentBinding(var55);
        final SubLObject var58 = module0147.$g2095$.currentBinding(var55);
        try {
            module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var55);
            module0147.$g2095$.bind(module0709.$ic12$, var55);
            if (module0709.NIL == var56) {
                SubLObject var59 = var54;
                final SubLObject var60 = (SubLObject)module0709.$ic23$;
                final SubLObject var61 = module0056.f4145(var60);
                final SubLObject var28_62 = module0139.$g1635$.currentBinding(var55);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var55);
                    final SubLObject var62 = (SubLObject)module0709.NIL;
                    final SubLObject var28_63 = module0141.$g1714$.currentBinding(var55);
                    final SubLObject var29_65 = module0141.$g1715$.currentBinding(var55);
                    try {
                        module0141.$g1714$.bind((module0709.NIL != var62) ? var62 : module0141.f9283(), var55);
                        module0141.$g1715$.bind((SubLObject)((module0709.NIL != var62) ? module0709.$ic24$ : module0141.$g1715$.getDynamicValue(var55)), var55);
                        if (module0709.NIL != var62 && module0709.NIL != module0136.f8864() && module0709.NIL == module0141.f9279(var62)) {
                            final SubLObject var63 = module0136.$g1591$.getDynamicValue(var55);
                            if (var63.eql((SubLObject)module0709.$ic25$)) {
                                module0136.f8870((SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)module0709.$ic28$)) {
                                module0136.f8871((SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.$ic29$, (SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)module0709.$ic30$)) {
                                Errors.warn((SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$);
                            }
                            else {
                                Errors.warn((SubLObject)module0709.$ic31$, module0136.$g1591$.getDynamicValue(var55));
                                Errors.cerror((SubLObject)module0709.$ic29$, (SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$);
                            }
                        }
                        final SubLObject var28_64 = module0141.$g1670$.currentBinding(var55);
                        final SubLObject var29_66 = module0141.$g1671$.currentBinding(var55);
                        final SubLObject var64 = module0141.$g1672$.currentBinding(var55);
                        final SubLObject var65 = module0141.$g1674$.currentBinding(var55);
                        final SubLObject var66 = module0137.$g1605$.currentBinding(var55);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0709.$ic32$), var55);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0709.$ic32$)), var55);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0709.$ic32$)), var55);
                            module0141.$g1674$.bind((SubLObject)module0709.NIL, var55);
                            module0137.$g1605$.bind(module0137.f8955(module0709.$ic32$), var55);
                            if (module0709.NIL != module0136.f8865() || module0709.NIL != module0244.f15795(var54, module0137.f8955((SubLObject)module0709.UNPROVIDED))) {
                                final SubLObject var28_65 = module0141.$g1677$.currentBinding(var55);
                                final SubLObject var29_67 = module0138.$g1619$.currentBinding(var55);
                                final SubLObject var69_74 = module0141.$g1674$.currentBinding(var55);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var55);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0709.$ic32$)), var55);
                                    module0141.$g1674$.bind((SubLObject)module0709.NIL, var55);
                                    module0249.f16055(var59, (SubLObject)module0709.UNPROVIDED);
                                    while (module0709.NIL != var59 && module0709.NIL == var56) {
                                        final SubLObject var67 = var59;
                                        if (!var67.eql(module0709.$ic18$) && module0709.NIL == module0205.f13145((SubLObject)module0709.$ic10$, var67, (SubLObject)module0709.T, (SubLObject)module0709.UNPROVIDED)) {
                                            var56 = (SubLObject)module0709.T;
                                        }
                                        final SubLObject var68 = module0200.f12443(module0137.f8955(module0709.$ic32$));
                                        SubLObject var69;
                                        SubLObject var70;
                                        SubLObject var28_66;
                                        SubLObject var29_68;
                                        SubLObject var71;
                                        SubLObject var72;
                                        SubLObject var73;
                                        SubLObject var74;
                                        SubLObject var75;
                                        SubLObject var76;
                                        SubLObject var28_67;
                                        SubLObject var84_88;
                                        SubLObject var77;
                                        SubLObject var78;
                                        SubLObject var28_68;
                                        SubLObject var79;
                                        SubLObject var80;
                                        SubLObject var81;
                                        SubLObject var82;
                                        SubLObject var83;
                                        SubLObject var84;
                                        SubLObject var85;
                                        SubLObject var86;
                                        SubLObject var77_99;
                                        SubLObject var87;
                                        SubLObject var28_69;
                                        SubLObject var89;
                                        SubLObject var88;
                                        SubLObject var90;
                                        SubLObject var91;
                                        SubLObject var92;
                                        SubLObject var93;
                                        SubLObject var94;
                                        SubLObject var95;
                                        for (var69 = (SubLObject)module0709.NIL, var69 = var68; module0709.NIL == var56 && module0709.NIL != var69; var69 = var69.rest()) {
                                            var70 = var69.first();
                                            var28_66 = module0137.$g1605$.currentBinding(var55);
                                            var29_68 = module0141.$g1674$.currentBinding(var55);
                                            try {
                                                module0137.$g1605$.bind(var70, var55);
                                                module0141.$g1674$.bind((SubLObject)((module0709.NIL != module0141.f9205((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0709.NIL == module0141.$g1674$.getDynamicValue(var55)) : module0141.$g1674$.getDynamicValue(var55)), var55);
                                                var71 = module0228.f15229(var59);
                                                if (module0709.NIL != module0138.f8992(var71)) {
                                                    var72 = module0242.f15664(var71, module0137.f8955((SubLObject)module0709.UNPROVIDED));
                                                    if (module0709.NIL != var72) {
                                                        var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)module0709.UNPROVIDED));
                                                        if (module0709.NIL != var73) {
                                                            for (var74 = module0066.f4838(module0067.f4891(var73)); module0709.NIL == var56 && module0709.NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                var55.resetMultipleValues();
                                                                var75 = module0066.f4839(var74);
                                                                var76 = var55.secondMultipleValue();
                                                                var55.resetMultipleValues();
                                                                if (module0709.NIL != module0147.f9507(var75)) {
                                                                    var28_67 = module0138.$g1623$.currentBinding(var55);
                                                                    try {
                                                                        module0138.$g1623$.bind(var75, var55);
                                                                        for (var84_88 = module0066.f4838(module0067.f4891(var76)); module0709.NIL == var56 && module0709.NIL == module0066.f4841(var84_88); var84_88 = module0066.f4840(var84_88)) {
                                                                            var55.resetMultipleValues();
                                                                            var77 = module0066.f4839(var84_88);
                                                                            var78 = var55.secondMultipleValue();
                                                                            var55.resetMultipleValues();
                                                                            if (module0709.NIL != module0141.f9289(var77)) {
                                                                                var28_68 = module0138.$g1624$.currentBinding(var55);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var77, var55);
                                                                                    var79 = var78;
                                                                                    if (module0709.NIL != module0077.f5302(var79)) {
                                                                                        var80 = module0077.f5333(var79);
                                                                                        for (var81 = module0032.f1741(var80), var82 = (SubLObject)module0709.NIL, var82 = module0032.f1742(var81, var80); module0709.NIL == var56 && module0709.NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                            var83 = module0032.f1745(var81, var82);
                                                                                            if (module0709.NIL != module0032.f1746(var82, var83) && module0709.NIL == module0249.f16059(var83, (SubLObject)module0709.UNPROVIDED)) {
                                                                                                module0249.f16055(var83, (SubLObject)module0709.UNPROVIDED);
                                                                                                module0056.f4149(var83, var61);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var79.isList()) {
                                                                                        if (module0709.NIL == var56) {
                                                                                            var84 = var79;
                                                                                            var85 = (SubLObject)module0709.NIL;
                                                                                            var85 = var84.first();
                                                                                            while (module0709.NIL == var56 && module0709.NIL != var84) {
                                                                                                if (module0709.NIL == module0249.f16059(var85, (SubLObject)module0709.UNPROVIDED)) {
                                                                                                    module0249.f16055(var85, (SubLObject)module0709.UNPROVIDED);
                                                                                                    module0056.f4149(var85, var61);
                                                                                                }
                                                                                                var84 = var84.rest();
                                                                                                var85 = var84.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0709.$ic33$, var79);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_68, var55);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var84_88);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_67, var55);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var74);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0709.FIVE_INTEGER, (SubLObject)module0709.$ic34$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0709.NIL != module0155.f9785(var71, (SubLObject)module0709.UNPROVIDED)) {
                                                    var86 = ((module0709.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)module0709.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)module0709.UNPROVIDED)));
                                                    for (var77_99 = (SubLObject)module0709.NIL, var77_99 = var86; module0709.NIL == var56 && module0709.NIL != var77_99; var77_99 = var77_99.rest()) {
                                                        var87 = var77_99.first();
                                                        var28_69 = module0138.$g1625$.currentBinding(var55);
                                                        try {
                                                            module0138.$g1625$.bind(var87, var55);
                                                            var88 = (var89 = Functions.funcall(var87, var71));
                                                            if (module0709.NIL != module0077.f5302(var89)) {
                                                                var90 = module0077.f5333(var89);
                                                                for (var91 = module0032.f1741(var90), var92 = (SubLObject)module0709.NIL, var92 = module0032.f1742(var91, var90); module0709.NIL == var56 && module0709.NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                    var93 = module0032.f1745(var91, var92);
                                                                    if (module0709.NIL != module0032.f1746(var92, var93) && module0709.NIL == module0249.f16059(var93, (SubLObject)module0709.UNPROVIDED)) {
                                                                        module0249.f16055(var93, (SubLObject)module0709.UNPROVIDED);
                                                                        module0056.f4149(var93, var61);
                                                                    }
                                                                }
                                                            }
                                                            else if (var89.isList()) {
                                                                if (module0709.NIL == var56) {
                                                                    var94 = var89;
                                                                    var95 = (SubLObject)module0709.NIL;
                                                                    var95 = var94.first();
                                                                    while (module0709.NIL == var56 && module0709.NIL != var94) {
                                                                        if (module0709.NIL == module0249.f16059(var95, (SubLObject)module0709.UNPROVIDED)) {
                                                                            module0249.f16055(var95, (SubLObject)module0709.UNPROVIDED);
                                                                            module0056.f4149(var95, var61);
                                                                        }
                                                                        var94 = var94.rest();
                                                                        var95 = var94.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0709.$ic33$, var89);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var28_69, var55);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var29_68, var55);
                                                module0137.$g1605$.rebind(var28_66, var55);
                                            }
                                        }
                                        var59 = module0056.f4150(var61);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var69_74, var55);
                                    module0138.$g1619$.rebind(var29_67, var55);
                                    module0141.$g1677$.rebind(var28_65, var55);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0709.TWO_INTEGER, (SubLObject)module0709.$ic35$, var54, module0244.f15748(module0137.f8955((SubLObject)module0709.UNPROVIDED)), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var66, var55);
                            module0141.$g1674$.rebind(var65, var55);
                            module0141.$g1672$.rebind(var64, var55);
                            module0141.$g1671$.rebind(var29_66, var55);
                            module0141.$g1670$.rebind(var28_64, var55);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_65, var55);
                        module0141.$g1714$.rebind(var28_63, var55);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var55));
                }
                finally {
                    module0139.$g1635$.rebind(var28_62, var55);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var58, var55);
            module0147.$g2094$.rebind(var57, var55);
        }
        return var56;
    }
    
    public static SubLObject f43083(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)module0709.NIL;
        final SubLObject var57 = module0147.$g2094$.currentBinding(var55);
        final SubLObject var58 = module0147.$g2095$.currentBinding(var55);
        try {
            module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var55);
            module0147.$g2095$.bind(module0709.$ic12$, var55);
            if (module0709.NIL == var56) {
                SubLObject var59 = var54;
                final SubLObject var60 = (SubLObject)module0709.$ic23$;
                final SubLObject var61 = module0056.f4145(var60);
                final SubLObject var28_102 = module0139.$g1635$.currentBinding(var55);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var55);
                    final SubLObject var62 = (SubLObject)module0709.NIL;
                    final SubLObject var28_103 = module0141.$g1714$.currentBinding(var55);
                    final SubLObject var29_104 = module0141.$g1715$.currentBinding(var55);
                    try {
                        module0141.$g1714$.bind((module0709.NIL != var62) ? var62 : module0141.f9283(), var55);
                        module0141.$g1715$.bind((SubLObject)((module0709.NIL != var62) ? module0709.$ic24$ : module0141.$g1715$.getDynamicValue(var55)), var55);
                        if (module0709.NIL != var62 && module0709.NIL != module0136.f8864() && module0709.NIL == module0141.f9279(var62)) {
                            final SubLObject var63 = module0136.$g1591$.getDynamicValue(var55);
                            if (var63.eql((SubLObject)module0709.$ic25$)) {
                                module0136.f8870((SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)module0709.$ic28$)) {
                                module0136.f8871((SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.$ic29$, (SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)module0709.$ic30$)) {
                                Errors.warn((SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$);
                            }
                            else {
                                Errors.warn((SubLObject)module0709.$ic31$, module0136.$g1591$.getDynamicValue(var55));
                                Errors.cerror((SubLObject)module0709.$ic29$, (SubLObject)module0709.$ic26$, var62, (SubLObject)module0709.$ic27$);
                            }
                        }
                        final SubLObject var28_104 = module0141.$g1670$.currentBinding(var55);
                        final SubLObject var29_105 = module0141.$g1671$.currentBinding(var55);
                        final SubLObject var64 = module0141.$g1672$.currentBinding(var55);
                        final SubLObject var65 = module0141.$g1674$.currentBinding(var55);
                        final SubLObject var66 = module0137.$g1605$.currentBinding(var55);
                        try {
                            module0141.$g1670$.bind(module0137.f8955(module0709.$ic32$), var55);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0709.$ic32$)), var55);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0709.$ic32$)), var55);
                            module0141.$g1674$.bind((SubLObject)module0709.NIL, var55);
                            module0137.$g1605$.bind(module0137.f8955(module0709.$ic32$), var55);
                            if (module0709.NIL != module0136.f8865() || module0709.NIL != module0244.f15795(var54, module0137.f8955((SubLObject)module0709.UNPROVIDED))) {
                                final SubLObject var28_105 = module0141.$g1677$.currentBinding(var55);
                                final SubLObject var29_106 = module0138.$g1619$.currentBinding(var55);
                                final SubLObject var69_109 = module0141.$g1674$.currentBinding(var55);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var55);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955(module0709.$ic32$)), var55);
                                    module0141.$g1674$.bind((SubLObject)module0709.NIL, var55);
                                    module0249.f16055(var59, (SubLObject)module0709.UNPROVIDED);
                                    while (module0709.NIL != var59 && module0709.NIL == var56) {
                                        final SubLObject var67 = var59;
                                        if (!var67.eql(module0709.$ic18$) && module0709.NIL == module0205.f13145((SubLObject)module0709.$ic10$, var67, (SubLObject)module0709.T, (SubLObject)module0709.UNPROVIDED)) {
                                            var56 = (SubLObject)module0709.T;
                                        }
                                        final SubLObject var68 = module0200.f12443(module0137.f8955(module0709.$ic32$));
                                        SubLObject var69;
                                        SubLObject var70;
                                        SubLObject var28_106;
                                        SubLObject var29_107;
                                        SubLObject var71;
                                        SubLObject var72;
                                        SubLObject var73;
                                        SubLObject var74;
                                        SubLObject var75;
                                        SubLObject var76;
                                        SubLObject var28_107;
                                        SubLObject var84_113;
                                        SubLObject var77;
                                        SubLObject var78;
                                        SubLObject var28_108;
                                        SubLObject var79;
                                        SubLObject var80;
                                        SubLObject var81;
                                        SubLObject var82;
                                        SubLObject var83;
                                        SubLObject var84;
                                        SubLObject var85;
                                        SubLObject var86;
                                        SubLObject var77_115;
                                        SubLObject var87;
                                        SubLObject var28_109;
                                        SubLObject var89;
                                        SubLObject var88;
                                        SubLObject var90;
                                        SubLObject var91;
                                        SubLObject var92;
                                        SubLObject var93;
                                        SubLObject var94;
                                        SubLObject var95;
                                        for (var69 = (SubLObject)module0709.NIL, var69 = var68; module0709.NIL == var56 && module0709.NIL != var69; var69 = var69.rest()) {
                                            var70 = var69.first();
                                            var28_106 = module0137.$g1605$.currentBinding(var55);
                                            var29_107 = module0141.$g1674$.currentBinding(var55);
                                            try {
                                                module0137.$g1605$.bind(var70, var55);
                                                module0141.$g1674$.bind((SubLObject)((module0709.NIL != module0141.f9205((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0709.NIL == module0141.$g1674$.getDynamicValue(var55)) : module0141.$g1674$.getDynamicValue(var55)), var55);
                                                var71 = module0228.f15229(var59);
                                                if (module0709.NIL != module0138.f8992(var71)) {
                                                    var72 = module0242.f15664(var71, module0137.f8955((SubLObject)module0709.UNPROVIDED));
                                                    if (module0709.NIL != var72) {
                                                        var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)module0709.UNPROVIDED));
                                                        if (module0709.NIL != var73) {
                                                            for (var74 = module0066.f4838(module0067.f4891(var73)); module0709.NIL == var56 && module0709.NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                var55.resetMultipleValues();
                                                                var75 = module0066.f4839(var74);
                                                                var76 = var55.secondMultipleValue();
                                                                var55.resetMultipleValues();
                                                                if (module0709.NIL != module0147.f9507(var75)) {
                                                                    var28_107 = module0138.$g1623$.currentBinding(var55);
                                                                    try {
                                                                        module0138.$g1623$.bind(var75, var55);
                                                                        for (var84_113 = module0066.f4838(module0067.f4891(var76)); module0709.NIL == var56 && module0709.NIL == module0066.f4841(var84_113); var84_113 = module0066.f4840(var84_113)) {
                                                                            var55.resetMultipleValues();
                                                                            var77 = module0066.f4839(var84_113);
                                                                            var78 = var55.secondMultipleValue();
                                                                            var55.resetMultipleValues();
                                                                            if (module0709.NIL != module0141.f9289(var77)) {
                                                                                var28_108 = module0138.$g1624$.currentBinding(var55);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var77, var55);
                                                                                    var79 = var78;
                                                                                    if (module0709.NIL != module0077.f5302(var79)) {
                                                                                        var80 = module0077.f5333(var79);
                                                                                        for (var81 = module0032.f1741(var80), var82 = (SubLObject)module0709.NIL, var82 = module0032.f1742(var81, var80); module0709.NIL == var56 && module0709.NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                            var83 = module0032.f1745(var81, var82);
                                                                                            if (module0709.NIL != module0032.f1746(var82, var83) && module0709.NIL == module0249.f16059(var83, (SubLObject)module0709.UNPROVIDED)) {
                                                                                                module0249.f16055(var83, (SubLObject)module0709.UNPROVIDED);
                                                                                                module0056.f4149(var83, var61);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var79.isList()) {
                                                                                        if (module0709.NIL == var56) {
                                                                                            var84 = var79;
                                                                                            var85 = (SubLObject)module0709.NIL;
                                                                                            var85 = var84.first();
                                                                                            while (module0709.NIL == var56 && module0709.NIL != var84) {
                                                                                                if (module0709.NIL == module0249.f16059(var85, (SubLObject)module0709.UNPROVIDED)) {
                                                                                                    module0249.f16055(var85, (SubLObject)module0709.UNPROVIDED);
                                                                                                    module0056.f4149(var85, var61);
                                                                                                }
                                                                                                var84 = var84.rest();
                                                                                                var85 = var84.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0709.$ic33$, var79);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var28_108, var55);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var84_113);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var28_107, var55);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var74);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0709.FIVE_INTEGER, (SubLObject)module0709.$ic34$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0709.NIL != module0155.f9785(var71, (SubLObject)module0709.UNPROVIDED)) {
                                                    var86 = ((module0709.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)module0709.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)module0709.UNPROVIDED)));
                                                    for (var77_115 = (SubLObject)module0709.NIL, var77_115 = var86; module0709.NIL == var56 && module0709.NIL != var77_115; var77_115 = var77_115.rest()) {
                                                        var87 = var77_115.first();
                                                        var28_109 = module0138.$g1625$.currentBinding(var55);
                                                        try {
                                                            module0138.$g1625$.bind(var87, var55);
                                                            var88 = (var89 = Functions.funcall(var87, var71));
                                                            if (module0709.NIL != module0077.f5302(var89)) {
                                                                var90 = module0077.f5333(var89);
                                                                for (var91 = module0032.f1741(var90), var92 = (SubLObject)module0709.NIL, var92 = module0032.f1742(var91, var90); module0709.NIL == var56 && module0709.NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                    var93 = module0032.f1745(var91, var92);
                                                                    if (module0709.NIL != module0032.f1746(var92, var93) && module0709.NIL == module0249.f16059(var93, (SubLObject)module0709.UNPROVIDED)) {
                                                                        module0249.f16055(var93, (SubLObject)module0709.UNPROVIDED);
                                                                        module0056.f4149(var93, var61);
                                                                    }
                                                                }
                                                            }
                                                            else if (var89.isList()) {
                                                                if (module0709.NIL == var56) {
                                                                    var94 = var89;
                                                                    var95 = (SubLObject)module0709.NIL;
                                                                    var95 = var94.first();
                                                                    while (module0709.NIL == var56 && module0709.NIL != var94) {
                                                                        if (module0709.NIL == module0249.f16059(var95, (SubLObject)module0709.UNPROVIDED)) {
                                                                            module0249.f16055(var95, (SubLObject)module0709.UNPROVIDED);
                                                                            module0056.f4149(var95, var61);
                                                                        }
                                                                        var94 = var94.rest();
                                                                        var95 = var94.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0709.$ic33$, var89);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var28_109, var55);
                                                        }
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var29_107, var55);
                                                module0137.$g1605$.rebind(var28_106, var55);
                                            }
                                        }
                                        var59 = module0056.f4150(var61);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var69_109, var55);
                                    module0138.$g1619$.rebind(var29_106, var55);
                                    module0141.$g1677$.rebind(var28_105, var55);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0709.TWO_INTEGER, (SubLObject)module0709.$ic35$, var54, module0244.f15748(module0137.f8955((SubLObject)module0709.UNPROVIDED)), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var66, var55);
                            module0141.$g1674$.rebind(var65, var55);
                            module0141.$g1672$.rebind(var64, var55);
                            module0141.$g1671$.rebind(var29_105, var55);
                            module0141.$g1670$.rebind(var28_104, var55);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var29_104, var55);
                        module0141.$g1714$.rebind(var28_103, var55);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var55));
                }
                finally {
                    module0139.$g1635$.rebind(var28_102, var55);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var58, var55);
            module0147.$g2094$.rebind(var57, var55);
        }
        return var56;
    }
    
    public static SubLObject f43084() {
        return module0709.$g5541$.getGlobalValue();
    }
    
    public static SubLObject f43085(final SubLObject var117) {
        return module0543.f33631(var117, f43084(), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43086(final SubLObject var118, final SubLObject var119) {
        return f43085((SubLObject)ConsesLow.list(module0709.$ic37$, var118, var119));
    }
    
    public static SubLObject f43087(final SubLObject var3, final SubLObject var120) {
        if (module0709.NIL != module0269.f17713(var3, (SubLObject)module0709.UNPROVIDED) && module0709.NIL != module0269.f17713(var120, (SubLObject)module0709.UNPROVIDED)) {
            return f43086(var3, var120);
        }
        return f43085((SubLObject)ConsesLow.list(module0709.$ic38$, var3, var120));
    }
    
    public static SubLObject f43088(final SubLObject var118, final SubLObject var119) {
        return f43085((SubLObject)ConsesLow.list(module0709.$ic32$, var119, var118));
    }
    
    public static SubLObject f43089(final SubLObject var118, final SubLObject var119) {
        return f43085((SubLObject)ConsesLow.list(module0709.$ic32$, var118, var119));
    }
    
    public static SubLObject f43090(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)module0709.NIL;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var21);
            module0147.$g2095$.bind(module0709.$ic12$, var21);
            final SubLObject var26;
            final SubLObject var25 = var26 = module0034.f1854((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            final SubLObject var28_122 = module0034.$g879$.currentBinding(var21);
            try {
                module0034.$g879$.bind(var26, var21);
                SubLObject var27 = (SubLObject)module0709.NIL;
                if (module0709.NIL != var26 && module0709.NIL == module0034.f1842(var26)) {
                    var27 = module0034.f1869(var26);
                    final SubLObject var28 = Threads.current_process();
                    if (module0709.NIL == var27) {
                        module0034.f1873(var26, var28);
                    }
                    else if (!var27.eql(var28)) {
                        Errors.error((SubLObject)module0709.$ic17$);
                    }
                }
                try {
                    if (module0709.NIL == var22) {
                        SubLObject var29 = Sort.sort(f43063(var20), (SubLObject)module0709.$ic7$, (SubLObject)module0709.$ic39$);
                        SubLObject var30 = (SubLObject)module0709.NIL;
                        var30 = var29.first();
                        while (module0709.NIL == var22 && module0709.NIL != var29) {
                            if (module0709.NIL == f43082(var30)) {
                                var22 = var30;
                            }
                            var29 = var29.rest();
                            var30 = var29.first();
                        }
                    }
                }
                finally {
                    final SubLObject var28_123 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var21);
                        if (module0709.NIL != var26 && module0709.NIL == var27) {
                            module0034.f1873(var26, (SubLObject)module0709.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var28_123, var21);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var28_122, var21);
            }
        }
        finally {
            module0147.$g2095$.rebind(var24, var21);
            module0147.$g2094$.rebind(var23, var21);
        }
        return var22;
    }
    
    public static SubLObject f43091(final SubLObject var124) {
        return module0256.f16558(var124, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43092(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0034.$g879$.getDynamicValue(var125);
        SubLObject var127 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var126) {
            return f43091(var124);
        }
        var127 = module0034.f1857(var126, (SubLObject)module0709.$ic39$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var127) {
            var127 = module0034.f1807(module0034.f1842(var126), (SubLObject)module0709.$ic39$, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var126, (SubLObject)module0709.$ic39$, var127);
        }
        SubLObject var128 = module0034.f1814(var127, var124, (SubLObject)module0709.$ic15$);
        if (var128 == module0709.$ic15$) {
            var128 = Values.arg2(var125.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43091(var124)));
            module0034.f1816(var127, var124, var128, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var128);
    }
    
    public static SubLObject f43080(final SubLObject var125, final SubLObject var126, SubLObject var127) {
        if (var127 == module0709.UNPROVIDED) {
            var127 = module0147.f9552((SubLObject)module0709.UNPROVIDED);
        }
        final SubLObject var128 = f43093(var125, var126, var127);
        return (SubLObject)((module0709.NIL != var128) ? Sequences.length(var128) : module0709.NIL);
    }
    
    public static SubLObject f43093(final SubLObject var125, final SubLObject var126, SubLObject var127) {
        if (var127 == module0709.UNPROVIDED) {
            var127 = module0147.f9552((SubLObject)module0709.UNPROVIDED);
        }
        final SubLThread var128 = SubLProcess.currentSubLThread();
        assert module0709.NIL != module0269.f17713(var125, (SubLObject)module0709.UNPROVIDED) : var125;
        assert module0709.NIL != module0269.f17713(var126, (SubLObject)module0709.UNPROVIDED) : var126;
        SubLObject var129 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0147.f9491(var127, (SubLObject)module0709.$ic11$)) {
            final SubLObject var130 = module0147.$g2094$.currentBinding(var128);
            final SubLObject var131 = module0147.$g2095$.currentBinding(var128);
            try {
                module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var128);
                module0147.$g2095$.bind(module0709.$ic12$, var128);
                if (var126.eql(module0709.$ic18$) || module0709.NIL != module0256.f16576(var125, var126, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                    final SubLObject var28_130 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)module0709.NIL;
                        if (module0709.NIL != var133 && module0709.NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (module0709.NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)module0709.$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)module0709.NIL);
                        }
                        finally {
                            final SubLObject var28_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var128);
                                if (module0709.NIL != var133 && module0709.NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)module0709.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_131, var128);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var28_130, var128);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var131, var128);
                module0147.$g2094$.rebind(var130, var128);
            }
        }
        else if (module0709.NIL != module0147.f9491(var127, (SubLObject)module0709.$ic41$)) {
            final SubLObject var130 = module0147.$g2094$.currentBinding(var128);
            final SubLObject var131 = module0147.$g2095$.currentBinding(var128);
            try {
                module0147.$g2094$.bind((SubLObject)module0709.$ic41$, var128);
                module0147.$g2095$.bind(module0709.$ic42$, var128);
                if (var126.eql(module0709.$ic18$) || module0709.NIL != module0256.f16576(var125, var126, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                    final SubLObject var28_132 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)module0709.NIL;
                        if (module0709.NIL != var133 && module0709.NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (module0709.NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)module0709.$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)module0709.NIL);
                        }
                        finally {
                            final SubLObject var28_133 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var128);
                                if (module0709.NIL != var133 && module0709.NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)module0709.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_133, var128);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var28_132, var128);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var131, var128);
                module0147.$g2094$.rebind(var130, var128);
            }
        }
        else if (module0709.NIL != module0161.f10488(var127)) {
            final SubLObject var130 = module0147.$g2094$.currentBinding(var128);
            final SubLObject var131 = module0147.$g2096$.currentBinding(var128);
            try {
                module0147.$g2094$.bind((SubLObject)module0709.$ic43$, var128);
                module0147.$g2096$.bind(module0161.f10522(var127), var128);
                if (var126.eql(module0709.$ic18$) || module0709.NIL != module0256.f16576(var125, var126, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                    final SubLObject var28_134 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)module0709.NIL;
                        if (module0709.NIL != var133 && module0709.NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (module0709.NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)module0709.$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)module0709.NIL);
                        }
                        finally {
                            final SubLObject var28_135 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var128);
                                if (module0709.NIL != var133 && module0709.NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)module0709.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_135, var128);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var28_134, var128);
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var131, var128);
                module0147.$g2094$.rebind(var130, var128);
            }
        }
        else {
            final SubLObject var130 = module0147.$g2094$.currentBinding(var128);
            final SubLObject var131 = module0147.$g2095$.currentBinding(var128);
            try {
                module0147.$g2094$.bind((SubLObject)module0709.$ic44$, var128);
                module0147.$g2095$.bind(var127, var128);
                if (var126.eql(module0709.$ic18$) || module0709.NIL != module0256.f16576(var125, var126, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                    final SubLObject var28_136 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)module0709.NIL;
                        if (module0709.NIL != var133 && module0709.NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (module0709.NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)module0709.$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)module0709.NIL);
                        }
                        finally {
                            final SubLObject var28_137 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var128);
                                if (module0709.NIL != var133 && module0709.NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)module0709.NIL);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_137, var128);
                            }
                        }
                    }
                    finally {
                        module0034.$g879$.rebind(var28_136, var128);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var131, var128);
                module0147.$g2094$.rebind(var130, var128);
            }
        }
        return var129;
    }
    
    public static SubLObject f43095(final SubLObject var125, final SubLObject var126, final SubLObject var138) {
        SubLObject var139 = (SubLObject)module0709.NIL;
        if (var126.eql(module0709.$ic18$) || module0709.NIL != module0256.f16576(var125, var126, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            SubLObject var140 = f43096(var125);
            if (module0709.NIL != module0035.f2012(conses_high.set_difference(var140, var138, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED))) {
                var140 = module0256.f16529(conses_high.set_difference(module0256.f16531(var125, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED), (SubLObject)ConsesLow.cons(var125, var140), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            }
            SubLObject var141 = var140;
            SubLObject var142 = (SubLObject)module0709.NIL;
            var142 = var141.first();
            while (module0709.NIL != var141) {
                if (module0709.NIL == Sequences.find(var142, var138, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                    if (var142.equal(var126)) {
                        if (module0709.NIL == var139) {
                            var139 = (SubLObject)ConsesLow.list(var125, var126);
                        }
                    }
                    else {
                        final SubLObject var143 = f43094(var142, var126, (SubLObject)ConsesLow.cons(var125, var138));
                        if (module0709.NIL != var143 && module0709.NIL == module0035.f2007(var139, var143)) {
                            var139 = (SubLObject)ConsesLow.cons(var125, var143);
                        }
                    }
                }
                var141 = var141.rest();
                var142 = var141.first();
            }
        }
        return var139;
    }
    
    public static SubLObject f43094(final SubLObject var125, final SubLObject var126, final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        final SubLObject var140 = module0034.$g879$.getDynamicValue(var139);
        SubLObject var141 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var140) {
            return f43095(var125, var126, var138);
        }
        var141 = module0034.f1857(var140, (SubLObject)module0709.$ic45$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var141) {
            var141 = module0034.f1807(module0034.f1842(var140), (SubLObject)module0709.$ic45$, (SubLObject)module0709.THREE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var140, (SubLObject)module0709.$ic45$, var141);
        }
        final SubLObject var142 = module0034.f1781(var125, var126, var138);
        final SubLObject var143 = module0034.f1814(var141, var142, (SubLObject)module0709.UNPROVIDED);
        if (var143 != module0709.$ic15$) {
            SubLObject var144 = var143;
            SubLObject var145 = (SubLObject)module0709.NIL;
            var145 = var144.first();
            while (module0709.NIL != var144) {
                SubLObject var146 = var145.first();
                final SubLObject var147 = conses_high.second(var145);
                if (var125.equal(var146.first())) {
                    var146 = var146.rest();
                    if (var126.equal(var146.first())) {
                        var146 = var146.rest();
                        if (module0709.NIL != var146 && module0709.NIL == var146.rest() && var138.equal(var146.first())) {
                            return module0034.f1959(var147);
                        }
                    }
                }
                var144 = var144.rest();
                var145 = var144.first();
            }
        }
        final SubLObject var148 = Values.arg2(var139.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43095(var125, var126, var138)));
        module0034.f1836(var141, var142, var143, var148, (SubLObject)ConsesLow.list(var125, var126, var138));
        return module0034.f1959(var148);
    }
    
    public static SubLObject f43097(final SubLObject var124) {
        return module0256.f16525(var124, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43096(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0034.$g879$.getDynamicValue(var125);
        SubLObject var127 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var126) {
            return f43097(var124);
        }
        var127 = module0034.f1857(var126, (SubLObject)module0709.$ic46$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var127) {
            var127 = module0034.f1807(module0034.f1842(var126), (SubLObject)module0709.$ic46$, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQ, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var126, (SubLObject)module0709.$ic46$, var127);
        }
        SubLObject var128 = module0034.f1814(var127, var124, (SubLObject)module0709.$ic15$);
        if (var128 == module0709.$ic15$) {
            var128 = Values.arg2(var125.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43097(var124)));
            module0034.f1816(var127, var124, var128, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var128);
    }
    
    public static SubLObject f43098(final SubLObject var149, SubLObject var150, SubLObject var151) {
        if (var150 == module0709.UNPROVIDED) {
            var150 = (SubLObject)module0709.$ic47$;
        }
        if (var151 == module0709.UNPROVIDED) {
            var151 = (SubLObject)module0709.TWO_INTEGER;
        }
        return f43099(var149, var150, var151, (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43099(final SubLObject var149, final SubLObject var150, final SubLObject var151, final SubLObject var129) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        SubLObject var153 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var151 || var151.isPositive()) {
            final SubLObject var154 = module0147.$g2094$.currentBinding(var152);
            final SubLObject var155 = module0147.$g2095$.currentBinding(var152);
            try {
                module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var152);
                module0147.$g2095$.bind(module0709.$ic12$, var152);
                SubLObject var156 = (var150 == module0709.$ic47$) ? module0256.f16525(var149, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED) : module0256.f16541(var149, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                SubLObject var157 = (SubLObject)module0709.NIL;
                var157 = var156.first();
                while (module0709.NIL != var156) {
                    if (module0709.NIL == Sequences.find(var157, var129, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                        var153 = (SubLObject)ConsesLow.cons(f43099(var157, var150, (SubLObject)((module0709.NIL != var151) ? module0048.f_1_(var151) : module0709.NIL), (SubLObject)ConsesLow.cons(var149, var129)), var153);
                    }
                    var156 = var156.rest();
                    var157 = var156.first();
                }
            }
            finally {
                module0147.$g2095$.rebind(var155, var152);
                module0147.$g2094$.rebind(var154, var152);
            }
        }
        return (SubLObject)ConsesLow.cons(var149, var153);
    }
    
    public static SubLObject f43064(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = f43077(var20);
        SubLObject var23 = (SubLObject)module0709.NIL;
        final SubLObject var24 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var25 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var21);
            module0147.$g2095$.bind(module0709.$ic12$, var21);
            var23 = module0256.f16538(var22, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var25, var21);
            module0147.$g2094$.rebind(var24, var21);
        }
        return var23;
    }
    
    public static SubLObject f43100(final SubLObject var155) {
        final SubLObject var156 = f43062(var155);
        return f43101(var156, var155);
    }
    
    public static SubLObject f43062(final SubLObject var155) {
        SubLObject var156 = (SubLObject)module0709.NIL;
        final SubLObject var157 = module0166.f10737(var155);
        if (module0709.NIL != var157) {
            var156 = (SubLObject)ConsesLow.cons(var157, var156);
        }
        SubLObject var158 = module0731.f44783(var155, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        SubLObject var159 = (SubLObject)module0709.NIL;
        var159 = var158.first();
        while (module0709.NIL != var158) {
            final SubLObject var160 = var159;
            if (module0709.NIL == conses_high.member(var160, var156, Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
                var156 = (SubLObject)ConsesLow.cons(var160, var156);
            }
            var158 = var158.rest();
            var159 = var158.first();
        }
        final SubLObject var161 = module0038.f2785(var155);
        if (!var161.equal(var155)) {
            SubLObject var162 = module0038.f2849(var161);
            SubLObject var163 = (SubLObject)module0709.NIL;
            var163 = var162.first();
            while (module0709.NIL != var162) {
                SubLObject var10_161 = module0731.f44783(var163, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                SubLObject var164 = (SubLObject)module0709.NIL;
                var164 = var10_161.first();
                while (module0709.NIL != var10_161) {
                    final SubLObject var165 = var164;
                    if (module0709.NIL == conses_high.member(var165, var156, Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
                        var156 = (SubLObject)ConsesLow.cons(var165, var156);
                    }
                    var10_161 = var10_161.rest();
                    var164 = var10_161.first();
                }
                var162 = var162.rest();
                var163 = var162.first();
            }
        }
        if (module0709.NIL != Characters.lower_case_p(module0038.f2636(var155)) && module0709.NIL == module0728.f44502(var155)) {
            final SubLObject var166 = module0777.f50077(var155);
            if (!var166.equal(var155)) {
                SubLObject var162 = f43062(var166);
                SubLObject var167 = (SubLObject)module0709.NIL;
                var167 = var162.first();
                while (module0709.NIL != var162) {
                    final SubLObject var168 = var167;
                    if (module0709.NIL == conses_high.member(var168, var156, Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
                        var156 = (SubLObject)ConsesLow.cons(var168, var156);
                    }
                    var162 = var162.rest();
                    var167 = var162.first();
                }
            }
        }
        if (module0709.NIL != module0038.f2673(var155, (SubLObject)module0709.$ic48$, (SubLObject)module0709.UNPROVIDED)) {
            final SubLObject var169 = module0038.f2623(var155, (SubLObject)module0709.ZERO_INTEGER, Numbers.subtract(Sequences.length(var155), (SubLObject)module0709.TWO_INTEGER));
            SubLObject var162 = f43062(var169);
            SubLObject var167 = (SubLObject)module0709.NIL;
            var167 = var162.first();
            while (module0709.NIL != var162) {
                final SubLObject var168 = var167;
                if (module0709.NIL == conses_high.member(var168, var156, Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
                    var156 = (SubLObject)ConsesLow.cons(var168, var156);
                }
                var162 = var162.rest();
                var167 = var162.first();
            }
        }
        return var156;
    }
    
    public static SubLObject f43101(final SubLObject var156, final SubLObject var155) {
        final SubLThread var157 = SubLProcess.currentSubLThread();
        final SubLObject var158 = (SubLObject)((module0709.NIL != Characters.upper_case_p(module0038.f2636(var155))) ? module0709.$ic49$ : module0709.$ic50$);
        SubLObject var159 = (SubLObject)module0709.NIL;
        SubLObject var160 = (SubLObject)module0709.NIL;
        SubLObject var161 = var156;
        SubLObject var162 = (SubLObject)module0709.NIL;
        var162 = var161.first();
        while (module0709.NIL != var161) {
            final SubLObject var163 = module0147.$g2094$.currentBinding(var157);
            final SubLObject var164 = module0147.$g2095$.currentBinding(var157);
            try {
                module0147.$g2094$.bind((SubLObject)module0709.$ic11$, var157);
                module0147.$g2095$.bind(module0709.$ic12$, var157);
                final SubLObject var165 = var158;
                if (var165.eql((SubLObject)module0709.$ic49$)) {
                    if (module0709.NIL != module0269.f17713(var162, (SubLObject)module0709.UNPROVIDED)) {
                        var159 = (SubLObject)ConsesLow.cons(var162, var159);
                    }
                    else {
                        var160 = (SubLObject)ConsesLow.cons(var162, var160);
                    }
                }
                else if (var165.eql((SubLObject)module0709.$ic50$)) {
                    if (module0709.NIL != module0269.f17718(var162, (SubLObject)module0709.UNPROVIDED)) {
                        var159 = (SubLObject)ConsesLow.cons(var162, var159);
                    }
                    else {
                        var160 = (SubLObject)ConsesLow.cons(var162, var160);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var164, var157);
                module0147.$g2094$.rebind(var163, var157);
            }
            var161 = var161.rest();
            var162 = var161.first();
        }
        return (SubLObject)ConsesLow.list(var159, var160);
    }
    
    public static SubLObject f43102() {
        return Sequences.remove_duplicates(Sequences.cconcatenate(module0709.$g5545$.getGlobalValue(), new SubLObject[] { module0709.$g5544$.getGlobalValue(), module0709.$g5543$.getGlobalValue(), module0709.$g5542$.getGlobalValue() }), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43103() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.make_list(Sequences.length(module0709.$g5546$.getDynamicValue(var2)), (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43104(final SubLObject var167, final SubLObject var164) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0107.f7629(module0709.$g5548$.getDynamicValue(var168))) {
            final SubLObject var169 = f43105(var164);
            final SubLObject var170 = f43106(var167, var164);
            final SubLObject var171 = f43107(var170, var164, var169);
            SubLObject var172 = var169;
            if (module0709.NIL != var171) {
                f43108(var167, var171);
            }
            else {
                var172 = module0035.f2084(var167, var169);
            }
            f43109(var164, var172);
        }
        return var167;
    }
    
    public static SubLObject f43108(final SubLObject var171, final SubLObject var172) {
        if (module0709.NIL != f43110(var172)) {
            f43111(var171, var172);
        }
        else {
            f43112(var171, var172);
        }
        return var172;
    }
    
    public static SubLObject f43113(final SubLObject var173, final SubLObject var164) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        assert module0709.NIL != module0107.f7629(module0709.$g5548$.getDynamicValue(var174)) : module0709.$g5548$.getDynamicValue(var174);
        final SubLObject var175 = f43114(var164);
        final SubLObject var176 = ConsesLow.nth(var175, module0709.$g5548$.getDynamicValue(var174));
        return f43107(var173, var164, var176);
    }
    
    public static SubLObject f43107(final SubLObject var173, final SubLObject var164, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        final SubLObject var177 = module0709.$g5547$.currentBinding(var176);
        try {
            module0709.$g5547$.bind(var164, var176);
            return Sequences.find(var173, var175, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.$ic58$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        }
        finally {
            module0709.$g5547$.rebind(var177, var176);
        }
    }
    
    public static SubLObject f43106(final SubLObject var176, SubLObject var164) {
        if (var164 == module0709.UNPROVIDED) {
            var164 = module0709.$g5547$.getDynamicValue();
        }
        final SubLObject var177 = var164;
        if (var177.eql((SubLObject)module0709.$ic59$)) {
            final SubLObject var178 = f43115(var176);
            return (module0709.NIL != var178) ? var178 : f43116(var176, (SubLObject)module0709.UNPROVIDED);
        }
        final SubLObject var178 = f43117(var176);
        return (module0709.NIL != var178) ? var178 : f43118(var176, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43105(final SubLObject var164) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        assert module0709.NIL != module0107.f7629(module0709.$g5548$.getDynamicValue(var165)) : module0709.$g5548$.getDynamicValue(var165);
        final SubLObject var166 = f43114(var164);
        return ConsesLow.nth(var166, module0709.$g5548$.getDynamicValue(var165));
    }
    
    public static SubLObject f43109(final SubLObject var164, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        assert module0709.NIL != module0107.f7629(module0709.$g5548$.getDynamicValue(var176)) : module0709.$g5548$.getDynamicValue(var176);
        final SubLObject var177 = f43114(var164);
        return ConsesLow.set_nth(var177, module0709.$g5548$.getDynamicValue(var176), var175);
    }
    
    public static SubLObject f43114(final SubLObject var164) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        final SubLObject var166 = Sequences.position(var164, module0709.$g5546$.getDynamicValue(var165), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var165) && module0709.NIL == module0004.f106(var166)) {
            Errors.error((SubLObject)module0709.$ic60$, var164, module0709.$g5546$.getDynamicValue(var165));
        }
        return var166;
    }
    
    public static SubLObject f43119(final SubLObject var177, final SubLObject var178, SubLObject var179, SubLObject var180, SubLObject var181, SubLObject var182, SubLObject var183, SubLObject var184) {
        if (var179 == module0709.UNPROVIDED) {
            var179 = var177;
        }
        if (var180 == module0709.UNPROVIDED) {
            var180 = (SubLObject)module0709.NIL;
        }
        if (var181 == module0709.UNPROVIDED) {
            var181 = (SubLObject)module0709.NIL;
        }
        if (var182 == module0709.UNPROVIDED) {
            var182 = module0111.$g1405$.getDynamicValue();
        }
        if (var183 == module0709.UNPROVIDED) {
            var183 = (SubLObject)module0709.NIL;
        }
        if (var184 == module0709.UNPROVIDED) {
            var184 = (SubLObject)module0709.NIL;
        }
        return f43120(module0035.f2333((SubLObject)module0709.$ic62$, (SubLObject)ConsesLow.list(var177, var178, var179, var180, var181, var182, var183, var184)));
    }
    
    public static SubLObject f43120(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        SubLObject var187 = conses_high.getf(var185, (SubLObject)module0709.$ic63$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var188 = conses_high.getf(var185, (SubLObject)module0709.$ic64$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var189 = conses_high.getf(var185, (SubLObject)module0709.$ic65$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var190 = conses_high.getf(var185, (SubLObject)module0709.$ic66$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var191 = conses_high.getf(var185, (SubLObject)module0709.$ic67$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var192 = conses_high.getf(var185, (SubLObject)module0709.$ic68$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var193 = conses_high.getf(var185, (SubLObject)module0709.$ic69$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var194 = conses_high.getf(var185, (SubLObject)module0709.$ic70$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var195 = conses_high.getf(var185, (SubLObject)module0709.$ic71$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var196 = conses_high.getf(var185, (SubLObject)module0709.$ic72$, (SubLObject)module0709.UNPROVIDED);
        var187 = module0038.f2711(var187, (SubLObject)Characters.CHAR_hash);
        var187 = module0038.f2711(var187, (SubLObject)Characters.CHAR_slash);
        if (module0709.NIL == var192) {
            var192 = f43121(var187, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL == var193) {
            var193 = f43122(var192, (SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL == module0038.f2611(var191)) {
            var191 = var187;
        }
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var186) && module0709.NIL == module0589.f35907(var191, (SubLObject)module0709.UNPROVIDED) && module0709.NIL == module0075.f5218(var191)) {
            Errors.error((SubLObject)module0709.$ic73$);
        }
        final SubLObject var197 = module0111.$g1405$.currentBinding(var186);
        try {
            module0111.$g1405$.bind((SubLObject)module0709.NIL, var186);
            module0574.f35153(var194);
            module0543.f33621();
        }
        finally {
            module0111.$g1405$.rebind(var197, var186);
        }
        if (module0709.NIL != var187 && !module0709.areAssertionsDisabledFor(me) && module0709.NIL == module0589.f35907(var187, (SubLObject)module0709.UNPROVIDED)) {
            throw new AssertionError(var187);
        }
        final SubLObject var198 = (SubLObject)((module0709.NIL != module0075.f5218(var191)) ? module0709.$ic75$ : module0709.$ic76$);
        final SubLObject var199 = var198.eql((SubLObject)module0709.$ic75$) ? var191 : module0699.f42601(var191, (SubLObject)module0709.UNPROVIDED);
        SubLObject var200 = (SubLObject)module0709.NIL;
        final SubLObject var201 = f43123(var192, var189, var190, var193, var194, var187, var188, var195, var196);
        final SubLObject var202 = module0709.$g5550$.currentBinding(var186);
        final SubLObject var203 = module0709.$g5549$.currentBinding(var186);
        try {
            module0709.$g5550$.bind(var201, var186);
            module0709.$g5549$.bind(f43124(), var186);
            var200 = f43125(var201);
            f43126(var201);
            try {
                f43127(var191, var199, var187, var201);
            }
            finally {
                final SubLObject var28_192 = Threads.$is_thread_performing_cleanupP$.currentBinding(var186);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var186);
                    f43128();
                    f43129((SubLObject)module0709.UNPROVIDED);
                    f43130((SubLObject)module0709.UNPROVIDED);
                    f43131(var200, var201);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var28_192, var186);
                }
            }
        }
        finally {
            module0709.$g5549$.rebind(var203, var186);
            module0709.$g5550$.rebind(var202, var186);
        }
        if (var198.eql((SubLObject)module0709.$ic76$)) {
            Filesys.delete_file(var199);
        }
        f43132();
        return var200;
    }
    
    public static SubLObject f43069() {
        final SubLObject var193 = module0709.$g5551$.getGlobalValue();
        if (module0709.NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43133(final SubLObject var189) {
        return module0034.f1829(module0709.$g5551$.getGlobalValue(), (SubLObject)ConsesLow.list(var189), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43134(final SubLObject var189) {
        SubLObject var190 = (SubLObject)module0709.NIL;
        SubLObject var191 = (SubLObject)module0709.NIL;
        try {
            var191 = compatibility.open_text(var189, (SubLObject)module0709.$ic78$);
            if (!var191.isStream()) {
                Errors.error((SubLObject)module0709.$ic79$, var189);
            }
            final SubLObject var192 = var191;
            var190 = Sequences.delete_if((SubLObject)module0709.$ic80$, module0590.f35984(var192, (SubLObject)module0709.T, (SubLObject)module0709.T, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        }
        finally {
            final SubLObject var193 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0709.T);
                if (var191.isStream()) {
                    streams_high.close(var191, (SubLObject)module0709.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var193);
            }
        }
        return var190;
    }
    
    public static SubLObject f43135(final SubLObject var189) {
        SubLObject var190 = module0709.$g5551$.getGlobalValue();
        if (module0709.NIL == var190) {
            var190 = module0034.f1934((SubLObject)module0709.$ic77$, (SubLObject)module0709.$ic81$, (SubLObject)module0709.$ic82$, (SubLObject)module0709.EQUAL, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.ZERO_INTEGER);
        }
        SubLObject var191 = module0034.f1814(var190, var189, (SubLObject)module0709.$ic15$);
        if (var191 == module0709.$ic15$) {
            var191 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43134(var189)));
            module0034.f1816(var190, var189, var191, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var191);
    }
    
    public static SubLObject f43127(final SubLObject var179, final SubLObject var189, final SubLObject var177, final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)module0709.T, (SubLObject)module0709.$ic83$, var177, var179);
        final SubLObject var194;
        final SubLObject var193 = var194 = module0034.f1854((SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var195 = module0034.$g879$.currentBinding(var192);
        try {
            module0034.$g879$.bind(var194, var192);
            SubLObject var196 = (SubLObject)module0709.NIL;
            if (module0709.NIL != var194 && module0709.NIL == module0034.f1842(var194)) {
                var196 = module0034.f1869(var194);
                final SubLObject var197 = Threads.current_process();
                if (module0709.NIL == var196) {
                    module0034.f1873(var194, var197);
                }
                else if (!var196.eql(var197)) {
                    Errors.error((SubLObject)module0709.$ic17$);
                }
            }
            try {
                final SubLObject var28_199 = module0709.$g5548$.currentBinding(var192);
                try {
                    module0709.$g5548$.bind(f43103(), var192);
                    final SubLObject var198 = f43135(var189);
                    f43136(var198.first(), var191);
                    final SubLObject var199 = f43137(var191);
                    f43138(var199, var198, var191);
                    final SubLObject var200 = f43139(var199, var198, var191);
                    f43140(var198, (SubLObject)ConsesLow.cons(var177, var200), var191);
                    f43141(var198, var191);
                    f43142(var198, var191);
                    SubLObject var201 = f43105((SubLObject)module0709.$ic84$);
                    SubLObject var202 = PrintLow.format((SubLObject)module0709.NIL, (SubLObject)module0709.$ic85$, Sequences.length(var201));
                    f43143(var201, var191, var202);
                    f43144(var198, var191);
                    f43145(f43105((SubLObject)module0709.$ic59$), var191);
                    f43146(var198, var191);
                    var201 = f43105((SubLObject)module0709.$ic86$);
                    var202 = PrintLow.format((SubLObject)module0709.NIL, (SubLObject)module0709.$ic87$, Sequences.length(var201));
                    f43143(var201, var191, var202);
                }
                finally {
                    module0709.$g5548$.rebind(var28_199, var192);
                }
            }
            finally {
                final SubLObject var28_200 = Threads.$is_thread_performing_cleanupP$.currentBinding(var192);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0709.T, var192);
                    if (module0709.NIL != var194 && module0709.NIL == var196) {
                        module0034.f1873(var194, (SubLObject)module0709.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var28_200, var192);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var195, var192);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43136(final SubLObject var204, final SubLObject var191) {
        SubLObject var205 = module0709.$g5552$.getGlobalValue();
        if (module0709.NIL != module0590.f36071(var204, (SubLObject)module0709.$ic89$)) {
            var205 = module0590.f36089(var204, (SubLObject)module0709.$ic90$, var205);
        }
        f43147(var205, var191);
        return var205;
    }
    
    public static SubLObject f43125(final SubLObject var191) {
        final SubLObject var192 = f43148(Sequences.cconcatenate((SubLObject)module0709.$ic91$, f43149(var191)), (SubLObject)module0709.$ic92$, module0709.$ic93$, (SubLObject)module0709.$ic94$, (SubLObject)module0709.$ic94$, (SubLObject)module0709.$ic95$, var191);
        f43150(var192, var191);
        f43151(var192, var191);
        f43152(var192, var191);
        f43153(var192, var191);
        return var192;
    }
    
    public static SubLObject f43149(final SubLObject var191) {
        final SubLObject var192 = f43137(var191);
        return (module0709.NIL != module0128.f8449(var192)) ? module0166.f10743(var192) : f43154(var191);
    }
    
    public static SubLObject f43150(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = module0612.f37527();
        return f43155((SubLObject)ConsesLow.list(module0709.$ic96$, var190, var192), module0709.$ic93$, var191);
    }
    
    public static SubLObject f43151(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = f43137(var191);
        return (SubLObject)((module0709.NIL != var192) ? f43155((SubLObject)ConsesLow.list(module0709.$ic97$, var190, var192), module0709.$ic93$, var191) : module0709.NIL);
    }
    
    public static SubLObject f43152(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = f43156(var191);
        return (SubLObject)((module0709.NIL != var192) ? f43155((SubLObject)ConsesLow.list(module0709.$ic98$, var190, var192), module0709.$ic93$, var191) : module0709.NIL);
    }
    
    public static SubLObject f43131(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = module0612.f37527();
        return f43155((SubLObject)ConsesLow.list(module0709.$ic99$, var190, var192), module0709.$ic93$, var191);
    }
    
    public static SubLObject f43138(final SubLObject var180, SubLObject var194, final SubLObject var191) {
        SubLObject var195 = (SubLObject)module0709.NIL;
        while (module0709.NIL == var195 && module0709.NIL == module0035.f2012(var194)) {
            final SubLObject var196 = var194.first();
            if (module0709.NIL != module0590.f36071(var196, module0708.f43012((SubLObject)module0709.$ic100$))) {
                if (module0709.NIL == module0590.f36072(var196)) {
                    f43157(var180, var194, var191);
                }
                var195 = (SubLObject)module0709.T;
            }
            else if (module0709.NIL == module0590.f36082(var196)) {
                var194 = module0590.f36061(var194, (SubLObject)module0709.UNPROVIDED);
            }
            else if (module0709.NIL != module0590.f36071(var196, module0699.f42535((SubLObject)module0709.$ic101$))) {
                f43158(var196, var191);
                var194 = module0590.f36061(var194, (SubLObject)module0709.UNPROVIDED);
            }
            else {
                var194 = module0590.f36068(var194);
            }
        }
        return var180;
    }
    
    public static SubLObject f43158(final SubLObject var204, final SubLObject var191) {
        final SubLObject var205 = f43159(var204);
        if (module0709.NIL != var205) {
            f43160(var205, var191);
        }
        return var205;
    }
    
    public static SubLObject f43159(final SubLObject var204) {
        SubLObject var205 = (SubLObject)module0709.NIL;
        SubLObject var207;
        final SubLObject var206 = var207 = module0590.f36044(var204);
        SubLObject var208 = (SubLObject)module0709.NIL;
        SubLObject var209 = (SubLObject)module0709.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0709.$ic102$);
        var208 = var207.first();
        var207 = (var209 = var207.rest());
        SubLObject var210;
        SubLObject var211;
        SubLObject var216_217;
        SubLObject var214_215;
        SubLObject var212;
        SubLObject var213;
        for (var210 = (SubLObject)module0709.NIL, var210 = var209; module0709.NIL == var205 && module0709.NIL != var210; var210 = var210.rest()) {
            var211 = var210.first();
            var214_215 = (var216_217 = var211);
            var212 = (SubLObject)module0709.NIL;
            var213 = (SubLObject)module0709.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var216_217, var214_215, (SubLObject)module0709.$ic103$);
            var212 = var216_217.first();
            var216_217 = (var213 = var216_217.rest());
            if (var212.equal(f43161((SubLObject)module0709.$ic104$))) {
                if (module0709.NIL != module0589.f35907(var213, (SubLObject)module0709.UNPROVIDED)) {
                    var205 = var213;
                }
                else {
                    Errors.warn((SubLObject)module0709.$ic105$, var213);
                }
            }
        }
        return var205;
    }
    
    public static SubLObject f43162() {
        final SubLObject var193 = module0709.$g5553$.getGlobalValue();
        if (module0709.NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43163(final SubLObject var191) {
        return module0034.f1829(module0709.$g5553$.getGlobalValue(), (SubLObject)ConsesLow.list(var191), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43164(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        SubLObject var193 = (SubLObject)module0709.NIL;
        final SubLObject var194 = module0111.$g1405$.currentBinding(var192);
        try {
            module0111.$g1405$.bind((SubLObject)module0709.NIL, var192);
            module0574.f35153(f43156(var191));
            var193 = f43165(f43137(var191));
        }
        finally {
            module0111.$g1405$.rebind(var194, var192);
        }
        return var193;
    }
    
    public static SubLObject f43166(final SubLObject var191) {
        SubLObject var192 = module0709.$g5553$.getGlobalValue();
        if (module0709.NIL == var192) {
            var192 = module0034.f1934((SubLObject)module0709.$ic106$, (SubLObject)module0709.$ic107$, (SubLObject)module0709.NIL, (SubLObject)module0709.EQL, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.ZERO_INTEGER);
        }
        SubLObject var193 = module0034.f1814(var192, var191, (SubLObject)module0709.$ic15$);
        if (var193 == module0709.$ic15$) {
            var193 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43164(var191)));
            module0034.f1816(var192, var191, var193, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var193);
    }
    
    public static SubLObject f43165(final SubLObject var180) {
        return module0285.f18993((SubLObject)ConsesLow.list(module0709.$ic108$, var180), (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43157(final SubLObject var180, final SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && module0709.NIL == module0590.f36071(var194.first(), module0708.f43012((SubLObject)module0709.$ic100$))) {
            Errors.error((SubLObject)module0709.$ic109$, var194.first());
        }
        SubLObject var196 = var194.rest();
        final SubLObject var197 = f43166(var191);
        SubLObject var198 = (SubLObject)module0709.NIL;
        while (module0709.NIL == var198) {
            if (module0709.NIL != module0035.f2012(var196)) {
                Errors.error((SubLObject)module0709.$ic110$, module0035.f2124((SubLObject)module0709.$ic111$, var194));
            }
            SubLObject var199;
            for (var199 = var196.first(); module0709.NIL == module0590.f36082(var199); var199 = var196.first()) {
                var196 = module0590.f36061(var196, (SubLObject)module0709.UNPROVIDED);
            }
            if (module0709.NIL != module0590.f36071(var199, module0699.f42555((SubLObject)module0709.$ic112$))) {
                final SubLObject var200 = conses_high.second(var196);
                if (module0709.NIL != module0590.f36082(var200)) {
                    Errors.warn((SubLObject)module0709.$ic113$, var200);
                }
                else {
                    f43155((SubLObject)ConsesLow.list(module0709.$ic114$, var180, var200), var197, var191);
                }
            }
            else if (module0709.NIL != module0590.f36071(var199, module0699.f42555((SubLObject)module0709.$ic115$))) {
                final SubLObject var201 = module0590.f36089(var199, f43161((SubLObject)module0709.$ic116$), (SubLObject)module0709.NIL);
                final SubLObject var202 = (module0709.NIL != var201) ? module0642.f39117(var201) : module0709.$ic117$;
                final SubLObject var203 = conses_high.second(var196);
                if (module0709.NIL != module0590.f36082(var203)) {
                    Errors.warn((SubLObject)module0709.$ic118$, var203);
                }
                else {
                    f43167(var180, (SubLObject)ConsesLow.cons(var203, var202), var191);
                }
            }
            else if (module0709.NIL != module0590.f36071(var199, module0708.f43012((SubLObject)module0709.$ic119$))) {
                final SubLObject var204 = conses_high.second(var196);
                if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && module0709.NIL == module0590.f36071(var204, module0708.f43012((SubLObject)module0709.$ic100$))) {
                    Errors.error((SubLObject)module0709.$ic109$, var204);
                }
                final SubLObject var205 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic120$), (SubLObject)module0709.UNPROVIDED);
                final SubLObject var206 = (module0709.NIL != module0589.f35907(var205, (SubLObject)module0709.UNPROVIDED)) ? var205 : f43168(var205);
                final SubLObject var207 = f43121(var206, var191, (SubLObject)module0709.UNPROVIDED);
                f43155((SubLObject)ConsesLow.list(module0709.$ic121$, var180, var207), module0709.$ic36$, var191);
            }
            else if (module0709.NIL == module0590.f36071(var199, module0708.f43012((SubLObject)module0709.$ic122$))) {
                if (module0709.NIL == module0590.f36071(var199, module0708.f43012((SubLObject)module0709.$ic123$))) {
                    if (module0709.NIL != module0590.f36070(module0708.f43012((SubLObject)module0709.$ic100$), var199)) {
                        var198 = (SubLObject)module0709.T;
                    }
                    else {
                        Errors.warn((SubLObject)module0709.$ic124$, var199);
                    }
                }
            }
            var196 = module0590.f36068(var196);
        }
        return var180;
    }
    
    public static SubLObject f43169(final SubLObject var229, final SubLObject var230) {
        f43170(var229, var230, (SubLObject)module0709.ZERO_INTEGER);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43171(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47094_native.class) ? module0709.T : module0709.NIL);
    }
    
    public static SubLObject f43172(final SubLObject var229) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43173(final SubLObject var229) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43174(final SubLObject var229) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43175(final SubLObject var229) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43176(final SubLObject var229) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43177(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43178(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43179(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43180(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43181(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43171(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43182(SubLObject var233) {
        if (var233 == module0709.UNPROVIDED) {
            var233 = (SubLObject)module0709.NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47094_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)module0709.NIL, var235 = var233; module0709.NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)module0709.$ic144$)) {
                f43177(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic145$)) {
                f43178(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic146$)) {
                f43179(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic147$)) {
                f43180(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic148$)) {
                f43181(var234, var237);
            }
            else {
                Errors.error((SubLObject)module0709.$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43183(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic150$, (SubLObject)module0709.$ic151$, (SubLObject)module0709.FIVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic144$, f43172(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic145$, f43173(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic146$, f43174(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic147$, f43175(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic148$, f43176(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic153$, (SubLObject)module0709.$ic151$, (SubLObject)module0709.FIVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43184(final SubLObject var238, final SubLObject var239) {
        return f43183(var238, var239);
    }
    
    public static SubLObject f43170(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        PrintLow.format(var230, (SubLObject)module0709.$ic155$, f43116(var240, (SubLObject)module0709.UNPROVIDED));
        return var240;
    }
    
    public static SubLObject f43185(final SubLObject var241) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        final SubLObject var243 = (SubLObject)((module0709.NIL != var241 && module0709.NIL != module0107.f7629(module0709.$g5548$.getDynamicValue(var242))) ? f43113(var241, (SubLObject)module0709.$ic59$) : module0709.NIL);
        return (module0709.NIL != var243) ? var243 : f43186(var241, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43186(final SubLObject var241, SubLObject var173, SubLObject var222, SubLObject var243, SubLObject var244) {
        if (var173 == module0709.UNPROVIDED) {
            var173 = (SubLObject)module0709.NIL;
        }
        if (var222 == module0709.UNPROVIDED) {
            var222 = (SubLObject)module0709.NIL;
        }
        if (var243 == module0709.UNPROVIDED) {
            var243 = (SubLObject)module0709.NIL;
        }
        if (var244 == module0709.UNPROVIDED) {
            var244 = (SubLObject)module0709.NIL;
        }
        final SubLObject var245 = f43182((SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL != var173) {
            f43187(var245, var173);
        }
        f43188(var245, var222);
        f43189(var245, var243);
        f43190(var245, var244);
        f43181(var245, (SubLObject)module0709.NIL);
        if (module0709.NIL != var241) {
            f43191(var245, (SubLObject)module0709.$ic156$, var241);
        }
        return var245;
    }
    
    public static SubLObject f43115(final SubLObject var242) {
        assert module0709.NIL != f43171(var242) : var242;
        return f43172(var242);
    }
    
    public static SubLObject f43192(final SubLObject var242) {
        assert module0709.NIL != f43171(var242) : var242;
        return f43173(var242);
    }
    
    public static SubLObject f43193(final SubLObject var242) {
        assert module0709.NIL != f43171(var242) : var242;
        return f43174(var242);
    }
    
    public static SubLObject f43194(final SubLObject var242) {
        assert module0709.NIL != f43171(var242) : var242;
        return f43175(var242);
    }
    
    public static SubLObject f43195(final SubLObject var242) {
        assert module0709.NIL != f43171(var242) : var242;
        return f43176(var242);
    }
    
    public static SubLObject f43196(final SubLObject var242, final SubLObject var245, SubLObject var246) {
        if (var246 == module0709.UNPROVIDED) {
            var246 = (SubLObject)module0709.NIL;
        }
        return conses_high.getf(f43176(var242), var245, var246);
    }
    
    public static SubLObject f43116(final SubLObject var242, SubLObject var246) {
        if (var246 == module0709.UNPROVIDED) {
            var246 = (SubLObject)module0709.NIL;
        }
        return f43196(var242, (SubLObject)module0709.$ic156$, var246);
    }
    
    public static SubLObject f43187(final SubLObject var242, final SubLObject var11) {
        assert module0709.NIL != f43171(var242) : var242;
        assert module0709.NIL != Types.stringp(var11) : var11;
        f43177(var242, var11);
        return f43172(var242);
    }
    
    public static SubLObject f43188(final SubLObject var242, final SubLObject var222) {
        assert module0709.NIL != f43171(var242) : var242;
        if (module0709.NIL != var222 && !module0709.areAssertionsDisabledFor(me) && module0709.NIL == Types.stringp(var222)) {
            throw new AssertionError(var222);
        }
        f43178(var242, var222);
        return f43173(var242);
    }
    
    public static SubLObject f43189(final SubLObject var242, final SubLObject var243) {
        assert module0709.NIL != f43171(var242) : var242;
        assert module0709.NIL != module0035.f2015(var243) : var243;
        f43179(var242, var243);
        return f43174(var242);
    }
    
    public static SubLObject f43190(final SubLObject var242, final SubLObject var244) {
        assert module0709.NIL != f43171(var242) : var242;
        if (module0709.NIL != var244 && !module0709.areAssertionsDisabledFor(me) && module0709.NIL == f43197(var244)) {
            throw new AssertionError(var244);
        }
        f43180(var242, var244);
        return f43175(var242);
    }
    
    public static SubLObject f43112(final SubLObject var171, final SubLObject var172) {
        f43187(var172, f43115(var171));
        f43188(var172, f43192(var171));
        f43189(var172, conses_high.union(f43193(var171), f43193(var172), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED));
        f43190(var172, f43194(var171));
        SubLObject var173;
        SubLObject var174;
        SubLObject var175;
        SubLObject var176;
        SubLObject var177;
        for (var173 = (SubLObject)module0709.NIL, var173 = f43195(var171); module0709.NIL != var173; var173 = conses_high.cddr(var173)) {
            var174 = var173.first();
            var175 = conses_high.cadr(var173);
            var176 = f43196(var172, var174, (SubLObject)module0709.UNPROVIDED);
            var177 = ((module0709.NIL != f43198(var174)) ? conses_high.union(var175, var176, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED) : var175);
            f43191(var172, var174, var177);
        }
        return var172;
    }
    
    public static SubLObject f43197(final SubLObject var240) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL != f43199(var240) || module0709.NIL != f43200(var240) || module0709.NIL != f43201(var240) || module0709.NIL != module0590.f36048(var240) || module0709.NIL != f43202(var240) || module0709.NIL != f43203(var240) || module0709.NIL != module0062.f4492(var240, (SubLObject)module0709.$ic160$) || module0709.NIL != f43204(var240) || module0709.NIL != module0205.f13145((SubLObject)module0709.$ic161$, var240, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED) || module0709.NIL != module0206.f13444(var240));
    }
    
    public static SubLObject f43204(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)module0709.$ic162$);
    }
    
    public static SubLObject f43203(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)module0709.$ic163$);
    }
    
    public static SubLObject f43199(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)module0709.$ic164$);
    }
    
    public static SubLObject f43205(final SubLObject var252) {
        return var252.rest();
    }
    
    public static SubLObject f43200(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)module0709.$ic165$);
    }
    
    public static SubLObject f43206(final SubLObject var253) {
        final SubLObject var254 = var253.rest();
        return var254;
    }
    
    public static SubLObject f43201(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)module0709.$ic166$);
    }
    
    public static SubLObject f43207(final SubLObject var254) {
        assert module0709.NIL != f43201(var254) : var254;
        return var254.rest();
    }
    
    public static SubLObject f43191(final SubLObject var242, final SubLObject var245, final SubLObject var25) {
        f43181(var242, conses_high.putf(f43176(var242), var245, var25));
        return f43176(var242);
    }
    
    public static SubLObject f43208(final SubLObject var242, final SubLObject var245, final SubLObject var25) {
        final SubLObject var246 = conses_high.getf(f43176(var242), var245, (SubLObject)module0709.NIL);
        final SubLObject var247 = (SubLObject)((module0709.NIL != Sequences.find(var25, var246, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) ? var246 : ConsesLow.cons(var25, var246));
        f43191(var242, var245, var247);
        return f43176(var242);
    }
    
    public static SubLObject f43209(final SubLObject var240) {
        return f43210(var240);
    }
    
    public static SubLObject f43210(final SubLObject var242) {
        return Sxhash.sxhash(f43172(var242));
    }
    
    public static SubLObject f43211(final SubLObject var229, final SubLObject var230) {
        f43212(var229, var230, (SubLObject)module0709.ZERO_INTEGER);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43213(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47096_native.class) ? module0709.T : module0709.NIL);
    }
    
    public static SubLObject f43214(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43215(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43216(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43217(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43218(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43219(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField7();
    }
    
    public static SubLObject f43220(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField8();
    }
    
    public static SubLObject f43221(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField9();
    }
    
    public static SubLObject f43222(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField10();
    }
    
    public static SubLObject f43223(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField11();
    }
    
    public static SubLObject f43224(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField12();
    }
    
    public static SubLObject f43225(final SubLObject var229) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.getField13();
    }
    
    public static SubLObject f43226(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43227(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43228(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43229(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43230(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43231(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField7(var232);
    }
    
    public static SubLObject f43232(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField8(var232);
    }
    
    public static SubLObject f43233(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField9(var232);
    }
    
    public static SubLObject f43234(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField10(var232);
    }
    
    public static SubLObject f43235(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField11(var232);
    }
    
    public static SubLObject f43236(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField12(var232);
    }
    
    public static SubLObject f43237(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43213(var229) : var229;
        return var229.setField13(var232);
    }
    
    public static SubLObject f43238(SubLObject var233) {
        if (var233 == module0709.UNPROVIDED) {
            var233 = (SubLObject)module0709.NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47096_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)module0709.NIL, var235 = var233; module0709.NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)module0709.$ic68$)) {
                f43226(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic202$)) {
                f43227(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic65$)) {
                f43228(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic66$)) {
                f43229(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic203$)) {
                f43230(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic64$)) {
                f43231(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic70$)) {
                f43232(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic69$)) {
                f43233(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic71$)) {
                f43234(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic72$)) {
                f43235(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic204$)) {
                f43236(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic205$)) {
                f43237(var234, var237);
            }
            else {
                Errors.error((SubLObject)module0709.$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43239(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic150$, (SubLObject)module0709.$ic206$, (SubLObject)module0709.TWELVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic68$, f43214(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic202$, f43215(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic65$, f43216(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic66$, f43217(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic203$, f43218(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic64$, f43219(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic70$, f43220(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic69$, f43221(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic71$, f43222(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic72$, f43223(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic204$, f43224(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic205$, f43225(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic153$, (SubLObject)module0709.$ic206$, (SubLObject)module0709.TWELVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43240(final SubLObject var238, final SubLObject var239) {
        return f43239(var238, var239);
    }
    
    public static SubLObject f43212(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        final SubLObject var241 = f43214(var240);
        PrintLow.format(var230, (SubLObject)module0709.$ic208$, (module0709.NIL != var241) ? var241 : f43216(var240));
        return var240;
    }
    
    public static SubLObject f43123(final SubLObject var180, final SubLObject var178, final SubLObject var187, final SubLObject var181, final SubLObject var182, final SubLObject var177, final SubLObject var186, SubLObject var183, SubLObject var184) {
        if (var183 == module0709.UNPROVIDED) {
            var183 = (SubLObject)module0709.NIL;
        }
        if (var184 == module0709.UNPROVIDED) {
            var184 = (SubLObject)module0709.NIL;
        }
        assert module0709.NIL != module0206.f13444(var180) : var180;
        assert module0709.NIL != Types.stringp(var178) : var178;
        assert module0709.NIL != Types.stringp(var187) : var187;
        assert module0709.NIL != Types.stringp(var186) : var186;
        assert module0709.NIL != module0226.f14809(var182) : var182;
        assert module0709.NIL != module0206.f13444(var181) : var181;
        final SubLObject var188 = f43238((SubLObject)module0709.UNPROVIDED);
        f43226(var188, var180);
        f43228(var188, var178);
        f43229(var188, var187);
        f43232(var188, f43241(var182));
        f43233(var188, var181);
        f43230(var188, var177);
        f43231(var188, var186);
        f43234(var188, var183);
        f43235(var188, var184);
        return var188;
    }
    
    public static SubLObject f43241(final SubLObject var182) {
        final SubLObject var183 = f43059();
        final SubLObject var184 = module0202.f12768(module0709.$ic211$, module0709.$ic212$, var183);
        return module0285.f18993(module0202.f12768(module0709.$ic213$, var184, var182), (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43137(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43214(var258);
    }
    
    public static SubLObject f43242(final SubLObject var261, final SubLObject var191) {
        return module0035.f2294(f43215(var191), var261, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43243(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43216(var258);
    }
    
    public static SubLObject f43244(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43217(var258);
    }
    
    public static SubLObject f43154(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43218(var258);
    }
    
    public static SubLObject f43245(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43219(var258);
    }
    
    public static SubLObject f43156(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43220(var258);
    }
    
    public static SubLObject f43246(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43221(var258);
    }
    
    public static SubLObject f43247(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43222(var258);
    }
    
    public static SubLObject f43248(final SubLObject var258) {
        assert module0709.NIL != f43213(var258) : var258;
        return f43223(var258);
    }
    
    public static SubLObject f43249(final SubLObject var191) {
        assert module0709.NIL != f43213(var191) : var191;
        return f43224(var191);
    }
    
    public static SubLObject f43250(final SubLObject var191) {
        assert module0709.NIL != f43213(var191) : var191;
        return f43225(var191);
    }
    
    public static SubLObject f43251(final SubLObject var261, final SubLObject var177, final SubLObject var191) {
        final SubLObject var262 = f43215(var191);
        final SubLObject var263 = f43242(var261, var191);
        if (module0709.NIL == var263) {
            f43227(var191, module0035.f2063(var262, var261, var177, (SubLObject)module0709.UNPROVIDED));
        }
        else if (!var263.equal(var177)) {
            Errors.error((SubLObject)module0709.$ic214$, var261, var177, var263);
        }
        return f43215(var191);
    }
    
    public static SubLObject f43160(final SubLObject var208, final SubLObject var191) {
        assert module0709.NIL != f43213(var191) : var191;
        f43230(var191, var208);
        return var208;
    }
    
    public static SubLObject f43153(final SubLObject var13, final SubLObject var191) {
        assert module0709.NIL != f43213(var191) : var191;
        assert module0709.NIL != module0173.f10955(var13) : var13;
        f43236(var191, var13);
        return var13;
    }
    
    public static SubLObject f43147(final SubLObject var205, final SubLObject var191) {
        assert module0709.NIL != f43213(var191) : var191;
        assert module0709.NIL != Types.stringp(var205) : var205;
        f43237(var191, var205);
        return var205;
    }
    
    public static SubLObject f43252(final SubLObject var240) {
        return f43253(var240);
    }
    
    public static SubLObject f43253(final SubLObject var258) {
        return Sxhash.sxhash(f43214(var258));
    }
    
    public static SubLObject f43139(final SubLObject var263, final SubLObject var194, final SubLObject var191) {
        SubLObject var264 = (SubLObject)module0709.NIL;
        SubLObject var265 = (SubLObject)module0709.NIL;
        try {
            var265 = module0361.f24136((SubLObject)module0709.NIL);
            SubLObject var266 = var194;
            SubLObject var267 = (SubLObject)module0709.NIL;
            var267 = var266.first();
            while (module0709.NIL != var266) {
                if (module0709.NIL != module0590.f36071(var267, module0708.f43012((SubLObject)module0709.$ic122$))) {
                    final SubLObject var268 = module0038.f2621(module0590.f36089(var267, module0699.f42535((SubLObject)module0709.$ic217$), (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.$ic218$, (SubLObject)module0709.UNPROVIDED);
                    if (module0709.NIL != module0589.f35907(var268, (SubLObject)module0709.UNPROVIDED)) {
                        final SubLObject var269 = f43121(var268, var191, var265);
                        f43155((SubLObject)ConsesLow.list(module0709.$ic16$, var263, var269), module0709.$ic36$, var191);
                        var264 = (SubLObject)ConsesLow.cons(var268, var264);
                    }
                    else {
                        f43254(Sequences.cconcatenate((SubLObject)module0709.$ic219$, new SubLObject[] { module0006.f205(var268), module0709.$ic220$ }), (SubLObject)module0709.UNPROVIDED);
                    }
                }
                var266 = var266.rest();
                var267 = var266.first();
            }
        }
        finally {
            final SubLObject var270 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0709.T);
                module0361.f24005(var265);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var270);
            }
        }
        return var264;
    }
    
    public static SubLObject f43140(final SubLObject var194, final SubLObject var200, final SubLObject var191) {
        SubLObject var201 = (SubLObject)module0709.NIL;
        SubLObject var202 = var194;
        SubLObject var203 = (SubLObject)module0709.NIL;
        var203 = var202.first();
        while (module0709.NIL != var202) {
            if (module0709.NIL != module0590.f36082(var203)) {
                final SubLObject var204 = f43255(var203, var200, var191);
                var201 = ConsesLow.append(var201, var204);
            }
            var202 = var202.rest();
            var203 = var202.first();
        }
        if (module0709.NIL != var201) {
            SubLObject var205 = (SubLObject)module0709.NIL;
            if (module0709.NIL == var205) {
                SubLObject var206 = var194;
                SubLObject var207 = (SubLObject)module0709.NIL;
                var207 = var206.first();
                while (module0709.NIL == var205 && module0709.NIL != var206) {
                    if (module0709.NIL != module0590.f36082(var207)) {
                        SubLObject var208;
                        SubLObject var209;
                        SubLObject var211;
                        SubLObject var210;
                        SubLObject var212;
                        SubLObject var213;
                        SubLObject var274_275;
                        SubLObject var272_273;
                        SubLObject var214;
                        SubLObject var215;
                        SubLObject var77_276;
                        SubLObject var213_277;
                        SubLObject var280_281;
                        SubLObject var278_279;
                        SubLObject var216;
                        SubLObject var217;
                        for (var208 = (SubLObject)module0709.NIL, var208 = var201; module0709.NIL == var205 && module0709.NIL != var208; var208 = var208.rest()) {
                            var209 = var208.first();
                            var210 = (var211 = var209);
                            var212 = (SubLObject)module0709.NIL;
                            var213 = (SubLObject)module0709.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var211, var210, (SubLObject)module0709.$ic221$);
                            var212 = var211.first();
                            var211 = (var213 = var211.rest());
                            if (module0709.NIL != module0038.f2668(var212, var207, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                                var272_273 = (var274_275 = module0590.f36044(var207));
                                var214 = (SubLObject)module0709.NIL;
                                var215 = (SubLObject)module0709.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var274_275, var272_273, (SubLObject)module0709.$ic102$);
                                var214 = var274_275.first();
                                var274_275 = (var215 = var274_275.rest());
                                if (module0709.NIL != module0590.f36048(var214) && var212.equal(module0590.f36047(var214))) {
                                    var205 = var213;
                                }
                                for (var77_276 = (SubLObject)module0709.NIL, var77_276 = var215; module0709.NIL == var205 && module0709.NIL != var77_276; var77_276 = var77_276.rest()) {
                                    var213_277 = var77_276.first();
                                    var278_279 = (var280_281 = var213_277);
                                    var216 = (SubLObject)module0709.NIL;
                                    var217 = (SubLObject)module0709.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var280_281, var278_279, (SubLObject)module0709.$ic222$);
                                    var216 = var280_281.first();
                                    var280_281 = (var217 = var280_281.rest());
                                    if (module0709.NIL != module0590.f36048(var216) && var212.equal(module0590.f36047(var216))) {
                                        var205 = var213;
                                    }
                                }
                            }
                        }
                    }
                    var206 = var206.rest();
                    var207 = var206.first();
                }
            }
            if (module0709.NIL != var205) {
                Errors.error((SubLObject)module0709.$ic223$, var205);
            }
        }
        return (SubLObject)module0709.T;
    }
    
    public static SubLObject f43255(final SubLObject var204, final SubLObject var200, final SubLObject var191) {
        SubLObject var205 = (SubLObject)module0709.NIL;
        SubLObject var207;
        final SubLObject var206 = var207 = module0590.f36044(var204);
        SubLObject var208 = (SubLObject)module0709.NIL;
        SubLObject var209 = (SubLObject)module0709.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0709.$ic102$);
        var208 = var207.first();
        var207 = var207.rest();
        SubLObject var210;
        var209 = (var210 = var207);
        SubLObject var211 = (SubLObject)module0709.NIL;
        var211 = var210.first();
        while (module0709.NIL != var210) {
            SubLObject var288_289;
            final SubLObject var286_287 = var288_289 = var211;
            SubLObject var212 = (SubLObject)module0709.NIL;
            SubLObject var213 = (SubLObject)module0709.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var288_289, var286_287, (SubLObject)module0709.$ic103$);
            var212 = var288_289.first();
            var288_289 = (var213 = var288_289.rest());
            if (module0709.NIL != module0590.f36048(var212) && module0709.$ic224$.equal(module0590.f36047(var212))) {
                final SubLObject var214 = f43256(var212, var213, var200, var191);
                if (module0709.NIL != var214) {
                    var205 = (SubLObject)ConsesLow.cons(var214, var205);
                }
            }
            var210 = var210.rest();
            var211 = var210.first();
        }
        return var205;
    }
    
    public static SubLObject f43256(final SubLObject var11, final SubLObject var25, final SubLObject var200, final SubLObject var191) {
        final SubLObject var201 = module0590.f36049(var11);
        f43251(var201, var25, var191);
        return (module0709.NIL != f43257(var201)) ? f43258(var201, var25) : f43259(var25, var200);
    }
    
    public static SubLObject f43257(final SubLObject var261) {
        return module0035.f2302(module0709.$g5556$.getGlobalValue(), var261, Symbols.symbol_function((SubLObject)module0709.EQUAL));
    }
    
    public static SubLObject f43258(final SubLObject var261, final SubLObject var25) {
        return (SubLObject)((module0709.NIL != module0004.f104(var25, module0035.f2294(module0709.$g5556$.getGlobalValue(), var261, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.NIL), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED)) ? module0709.NIL : ConsesLow.cons(var25, Sequences.cconcatenate(module0006.f205(var261), new SubLObject[] { module0709.$ic226$, module0006.f205(var25), module0709.$ic227$, module0006.$g11$.getGlobalValue(), module0709.$ic228$, module0006.f205(module0035.f2294(module0709.$g5556$.getGlobalValue(), var261, (SubLObject)module0709.NIL, (SubLObject)module0709.UNPROVIDED)) })));
    }
    
    public static SubLObject f43259(final SubLObject var25, final SubLObject var200) {
        SubLObject var201 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var201) {
            SubLObject var202 = var200;
            SubLObject var203 = (SubLObject)module0709.NIL;
            var203 = var202.first();
            while (module0709.NIL == var201 && module0709.NIL != var202) {
                if (var25.equal(var203) || (module0709.NIL != module0038.f2684(var25, var203) && module0709.NIL != module0035.f1995(var25, module0048.f_1X(Sequences.length(var203)), (SubLObject)module0709.UNPROVIDED) && Characters.CHAR_hash.eql(module0038.f2637(var25)))) {
                    var201 = (SubLObject)module0709.T;
                }
                var202 = var202.rest();
                var203 = var202.first();
            }
        }
        return (SubLObject)((module0709.NIL != var201) ? module0709.NIL : ConsesLow.cons(var25, Sequences.cconcatenate((SubLObject)module0709.$ic229$, module0006.f205(var25))));
    }
    
    public static SubLObject f43260() {
        final SubLObject var193 = module0709.$g5557$.getGlobalValue();
        if (module0709.NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43261(final SubLObject var177, SubLObject var191, SubLObject var292) {
        if (var191 == module0709.UNPROVIDED) {
            var191 = (SubLObject)module0709.NIL;
        }
        if (var292 == module0709.UNPROVIDED) {
            var292 = (SubLObject)module0709.NIL;
        }
        return module0034.f1829(module0709.$g5557$.getGlobalValue(), (SubLObject)ConsesLow.list(var177, var191, var292), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43262(final SubLObject var177, final SubLObject var191, final SubLObject var292) {
        final SubLThread var293 = SubLProcess.currentSubLThread();
        assert module0709.NIL != module0589.f35907(var177, (SubLObject)module0709.UNPROVIDED) : var177;
        if (module0709.NIL != var191 && !module0709.areAssertionsDisabledFor(me) && module0709.NIL == f43213(var191)) {
            throw new AssertionError(var191);
        }
        SubLObject var294 = (SubLObject)((module0709.NIL != var191 && var177.equal(f43154(var191))) ? f43137(var191) : module0709.NIL);
        if (module0709.NIL == var294) {
            var294 = module0434.f30576((SubLObject)module0709.$ic231$, (SubLObject)ConsesLow.list(module0709.$ic232$, (SubLObject)module0709.$ic233$, (SubLObject)ConsesLow.list(module0709.$ic234$, (SubLObject)module0709.$ic231$, var177)), module0709.$ic42$, (SubLObject)ConsesLow.listS((SubLObject)module0709.$ic235$, (SubLObject)module0709.$ic236$, (SubLObject)module0709.$ic237$, var292, (SubLObject)module0709.$ic238$)).first();
            if (module0709.NIL == var294) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var293)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic240$, module0709.$ic241$ }), var177);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var294 = module0285.f18993((SubLObject)ConsesLow.list(module0709.$ic242$, var177), (SubLObject)module0709.UNPROVIDED);
            }
        }
        return var294;
    }
    
    public static SubLObject f43121(final SubLObject var177, SubLObject var191, SubLObject var292) {
        if (var191 == module0709.UNPROVIDED) {
            var191 = (SubLObject)module0709.NIL;
        }
        if (var292 == module0709.UNPROVIDED) {
            var292 = (SubLObject)module0709.NIL;
        }
        SubLObject var293 = module0709.$g5557$.getGlobalValue();
        if (module0709.NIL == var293) {
            var293 = module0034.f1934((SubLObject)module0709.$ic230$, (SubLObject)module0709.$ic243$, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.THREE_INTEGER, (SubLObject)module0709.ZERO_INTEGER);
        }
        final SubLObject var294 = module0034.f1781(var177, var191, var292);
        final SubLObject var295 = module0034.f1814(var293, var294, (SubLObject)module0709.UNPROVIDED);
        if (var295 != module0709.$ic15$) {
            SubLObject var296 = var295;
            SubLObject var297 = (SubLObject)module0709.NIL;
            var297 = var296.first();
            while (module0709.NIL != var296) {
                SubLObject var298 = var297.first();
                final SubLObject var299 = conses_high.second(var297);
                if (var177.equal(var298.first())) {
                    var298 = var298.rest();
                    if (var191.equal(var298.first())) {
                        var298 = var298.rest();
                        if (module0709.NIL != var298 && module0709.NIL == var298.rest() && var292.equal(var298.first())) {
                            return module0034.f1959(var299);
                        }
                    }
                }
                var296 = var296.rest();
                var297 = var296.first();
            }
        }
        final SubLObject var300 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43262(var177, var191, var292)));
        module0034.f1836(var293, var294, var295, var300, (SubLObject)ConsesLow.list(var177, var191, var292));
        return module0034.f1959(var300);
    }
    
    public static SubLObject f43122(final SubLObject var180, SubLObject var292) {
        if (var292 == module0709.UNPROVIDED) {
            var292 = (SubLObject)module0709.NIL;
        }
        assert module0709.NIL != module0206.f13444(var180) : var180;
        SubLObject var293 = module0434.f30578((SubLObject)module0709.$ic244$, (SubLObject)ConsesLow.listS(module0709.$ic245$, var180, (SubLObject)module0709.$ic246$), module0709.$ic36$, (SubLObject)ConsesLow.listS((SubLObject)module0709.$ic235$, (SubLObject)module0709.$ic236$, (SubLObject)module0709.$ic237$, var292, (SubLObject)module0709.$ic238$)).first();
        if (module0709.NIL == var293) {
            var293 = module0285.f18875((SubLObject)ConsesLow.list(module0709.$ic247$, var180), (SubLObject)module0709.UNPROVIDED);
        }
        return var293;
    }
    
    public static SubLObject f43144(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        final SubLObject var302 = module0709.$g5547$.currentBinding(var299);
        try {
            module0709.$g5547$.bind((SubLObject)module0709.$ic59$, var299);
            SubLObject var303 = (SubLObject)module0709.NIL;
            while (module0709.NIL != var301) {
                var299.resetMultipleValues();
                final SubLObject var304 = f43263(var301, var303, var191, var300);
                final SubLObject var305 = var299.secondMultipleValue();
                final SubLObject var306 = var299.thirdMultipleValue();
                var299.resetMultipleValues();
                if (!var303.eql(var304)) {
                    var303 = var304;
                }
                if (module0709.NIL != var306) {
                    f43104(var304, (SubLObject)module0709.$ic59$);
                    var303 = (SubLObject)module0709.NIL;
                }
                if (module0709.NIL != module0004.f105(var305)) {
                    var300 = module0590.f36061(var300, var305);
                }
                else if (var305.isString()) {
                    var300 = module0590.f36061(module0590.f36062(var300, var305, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED);
                }
                else if (var305.eql((SubLObject)module0709.$ic248$)) {
                    var300 = module0590.f36068(var300);
                }
                else {
                    final SubLObject var307 = f43264(var300);
                    var300 = (SubLObject)((module0709.NIL != var307) ? module0590.f36061(var300, var307) : module0709.NIL);
                }
                var301 = (SubLObject)((module0709.NIL != module0035.f2013(var300)) ? var300.first() : module0709.NIL);
            }
            if (module0709.NIL != var303) {
                if (module0709.NIL != f43194(var303)) {
                    f43104(var303, (SubLObject)module0709.$ic59$);
                }
                else if (module0709.NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)module0709.$ic249$, var303, var301);
                }
            }
        }
        finally {
            module0709.$g5547$.rebind(var302, var299);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43067() {
        final SubLObject var193 = module0709.$g5558$.getGlobalValue();
        if (module0709.NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43265() {
        return module0034.f1829(module0709.$g5558$.getGlobalValue(), (SubLObject)ConsesLow.list(module0709.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43266() {
        return (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)module0709.$ic251$), module0708.f43012((SubLObject)module0709.$ic252$), module0708.f43012((SubLObject)module0709.$ic253$), module0708.f43012((SubLObject)module0709.$ic254$), module0708.f43012((SubLObject)module0709.$ic255$), module0708.f43012((SubLObject)module0709.$ic256$));
    }
    
    public static SubLObject f43267() {
        SubLObject var197 = module0709.$g5558$.getGlobalValue();
        if (module0709.NIL == var197) {
            var197 = module0034.f1934((SubLObject)module0709.$ic250$, (SubLObject)module0709.$ic257$, (SubLObject)module0709.NIL, (SubLObject)module0709.EQL, (SubLObject)module0709.ZERO_INTEGER, (SubLObject)module0709.ZERO_INTEGER);
        }
        SubLObject var198 = module0034.f1810(var197, (SubLObject)module0709.UNPROVIDED);
        if (var198 == module0709.$ic15$) {
            var198 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43266()));
            module0034.f1812(var197, var198, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var198);
    }
    
    public static SubLObject f43268(final SubLObject var204) {
        return module0004.f104(module0590.f36041(var204), f43267(), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43263(final SubLObject var299, final SubLObject var242, final SubLObject var191, final SubLObject var194) {
        final SubLThread var300 = SubLProcess.currentSubLThread();
        SubLObject var301 = var242;
        SubLObject var302 = (SubLObject)module0709.NIL;
        SubLObject var303 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0590.f36056(var299, (SubLObject)module0709.$ic258$)) {
            final SubLObject var304 = module0590.f36058(var194, (SubLObject)module0709.$ic259$, (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var300) && !var304.isInteger()) {
                Errors.error((SubLObject)module0709.$ic260$, module0035.f2124((SubLObject)module0709.TEN_INTEGER, var194));
            }
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic261$, module0709.$ic241$ }), module0035.f2124(module0048.f_1X(var304), var194));
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var302 = module0048.f_1X(var304);
        }
        else if (module0709.NIL == module0590.f36042(var299) && module0709.NIL != f43268(var299)) {
            SubLObject var305 = (SubLObject)module0709.NIL;
            SubLObject var306 = (SubLObject)module0709.NIL;
            if (module0709.NIL == module0035.f2012(module0590.f36044(var299).rest())) {
                var300.resetMultipleValues();
                final SubLObject var305_306 = f43269(var299, var191);
                final SubLObject var307_308 = var300.secondMultipleValue();
                var300.resetMultipleValues();
                var305 = var305_306;
                var306 = var307_308;
            }
            var301 = f43185(var305);
            if (module0709.NIL != var306) {
                f43187(var301, var306);
            }
            final SubLObject var307 = module0590.f36041(var299);
            f43208(var301, (SubLObject)module0709.$ic262$, var307);
            if (module0709.NIL != module0590.f36072(var299)) {
                var303 = (SubLObject)module0709.T;
            }
            var302 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != f43270(var299)) {
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL == var242) {
            var302 = f43271(var299);
        }
        else if (module0709.NIL != module0038.f2828(var299)) {
            var302 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42535((SubLObject)module0709.$ic264$))) {
            f43208(var301, (SubLObject)module0709.$ic262$, f43272(var299, var191));
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42555((SubLObject)module0709.$ic115$))) {
            if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var300) && module0709.NIL != module0590.f36072(var299)) {
                Errors.error((SubLObject)module0709.$ic265$, var299);
            }
            final SubLObject var308 = module0590.f36089(var299, f43161((SubLObject)module0709.$ic116$), (SubLObject)module0709.NIL);
            final SubLObject var309 = (module0709.NIL != var308) ? module0642.f39117(var308) : module0709.$ic117$;
            final SubLObject var310 = conses_high.second(var194);
            if (module0709.NIL != var308 && module0709.NIL == var309 && module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic266$, var308);
            }
            f43208(var301, (SubLObject)module0709.$ic267$, (SubLObject)ConsesLow.cons(var310, var309));
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42555((SubLObject)module0709.$ic112$))) {
            f43188(var301, conses_high.second(var194));
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42555((SubLObject)module0709.$ic268$)) && module0709.NIL != module0590.f36040(var299)) {
            final SubLObject var311 = f43273(var194, var191);
            f43189(var301, var311);
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42555((SubLObject)module0709.$ic268$))) {
            final SubLObject var312 = f43274(var299, var191);
            if (module0709.NIL != var312) {
                f43189(var301, (SubLObject)ConsesLow.list(var312));
            }
            else if (module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic269$, module0035.f2124((SubLObject)module0709.FOUR_INTEGER, var194));
            }
            var302 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0708.f43012((SubLObject)module0709.$ic270$))) {
            final SubLObject var313 = module0038.f2673(var299, (SubLObject)module0709.$ic271$, (SubLObject)module0709.UNPROVIDED);
            final SubLObject var314 = (module0709.NIL != var313) ? var299 : f43275(var194);
            final SubLObject var315 = f43269(var314, var191);
            if (var315.equal(f43196(var301, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED))) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic272$, module0709.$ic241$ }), var315);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43191(var301, (SubLObject)module0709.$ic273$, (SubLObject)module0709.T);
            }
            else if (module0709.NIL != var315) {
                f43191(var301, (SubLObject)module0709.$ic274$, var315);
            }
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42555((SubLObject)module0709.$ic275$))) {
            final SubLObject var313 = module0590.f36072(var299);
            final SubLObject var316 = (module0709.NIL != var313) ? var299 : f43275(var194);
            final SubLObject var317 = f43269(var316, var191);
            if (module0709.NIL != var317) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic276$, module0709.$ic241$ }), var317, var242);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43191(var301, (SubLObject)module0709.$ic277$, var317);
            }
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0708.f43012((SubLObject)module0709.$ic278$))) {
            final SubLObject var313 = module0590.f36072(var299);
            final SubLObject var318 = (module0709.NIL != var313) ? var299 : f43275(var194);
            final SubLObject var319 = f43269(var318, var191);
            if (module0709.NIL != var319) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic279$, module0709.$ic241$ }), var319, var242);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43208(var301, (SubLObject)module0709.$ic280$, var319);
            }
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42555((SubLObject)module0709.$ic281$)) && module0709.NIL != module0590.f36040(var299)) {
            var300.resetMultipleValues();
            final SubLObject var320 = f43276(var194, var191);
            final SubLObject var321 = var300.secondMultipleValue();
            var300.resetMultipleValues();
            f43190(var301, var320);
            var302 = var321;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42555((SubLObject)module0709.$ic281$))) {
            final SubLObject var320 = f43274(var299, var191);
            if (module0709.NIL == var320 && module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic282$, module0035.f2124((SubLObject)module0709.FOUR_INTEGER, var194));
            }
            f43190(var301, var320);
            var302 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != f43268(var299) && module0709.NIL != module0590.f36042(var299)) {
            var303 = (SubLObject)module0709.T;
            var302 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != f43277(var299, (SubLObject)module0709.$ic283$, var191)) {
            final SubLObject var322 = conses_high.second(var194);
            final SubLObject var323 = f43278(var322, (SubLObject)module0709.$ic284$);
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic285$, module0709.$ic241$ }), var323, var301);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43191(var301, (SubLObject)module0709.$ic286$, var323);
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != f43277(var299, (SubLObject)module0709.$ic287$, var191)) {
            final SubLObject var322 = conses_high.second(var194);
            final SubLObject var324 = f43278(var322, (SubLObject)module0709.$ic284$);
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic288$, module0709.$ic241$ }), var324, var301);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43191(var301, (SubLObject)module0709.$ic289$, var324);
            var302 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36031(var299) && module0709.NIL == module0590.f36042(var299)) {
            final SubLObject var325 = module0590.f36041(var299);
            final SubLObject var326 = (SubLObject)((module0709.NIL != module0590.f36072(var299)) ? f43272(var299, var191) : module0709.NIL);
            SubLObject var327 = (SubLObject)module0709.NIL;
            if (module0709.NIL != var326) {
                var327 = f43279(var326, module0709.$ic18$, var191);
            }
            else {
                final SubLObject var328 = f43168(module0590.f36089(var299, module0699.f42535((SubLObject)module0709.$ic290$), (SubLObject)module0709.UNPROVIDED));
                final SubLObject var329 = conses_high.second(var194);
                var327 = f43278(var329, var328);
            }
            if (module0709.NIL != var327) {
                if (module0709.NIL != f43277(var299, (SubLObject)module0709.$ic291$, var191)) {
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic292$, module0709.$ic241$ }), var301, var327);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    f43208(var301, (SubLObject)module0709.$ic262$, var327);
                }
                else {
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic293$, module0709.$ic241$ }), var325, var327);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    f43208(var301, (SubLObject)module0709.$ic294$, (SubLObject)ConsesLow.list(var325, var327));
                }
            }
            var302 = (SubLObject)module0709.$ic248$;
        }
        else {
            if (module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic295$, var299);
            }
            var302 = (SubLObject)module0709.$ic263$;
        }
        return Values.values(var301, var302, var303);
    }
    
    public static SubLObject f43277(final SubLObject var299, final SubLObject var11, final SubLObject var191) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL != module0590.f36071(var299, var11) && f43154(var191).isString() && module0709.NIL != module0038.f2668((SubLObject)module0709.$ic296$, f43154(var191), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED));
    }
    
    public static SubLObject f43168(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = Sequences.position((SubLObject)Characters.CHAR_hash, var25, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var28 = (module0709.NIL != var27) ? var27 : module0035.f2029((SubLObject)Characters.CHAR_slash, var25, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var28) {
            return var25;
        }
        if (var28.eql((SubLObject)module0709.ZERO_INTEGER)) {
            return module0038.f2623(var25, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.UNPROVIDED);
        }
        final SubLObject var29 = module0038.f2623(var25, module0048.f_1X(var28), (SubLObject)module0709.UNPROVIDED);
        final SubLObject var30 = module0038.f2623(var25, (SubLObject)module0709.ZERO_INTEGER, var28);
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && module0709.NIL == module0589.f35907(var30, (SubLObject)module0709.UNPROVIDED)) {
            Errors.error((SubLObject)module0709.$ic297$, var25);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0709.$ic298$, var30, var29);
    }
    
    public static SubLObject f43280(final SubLObject var327, final SubLObject var314) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        return module0084.f5765(module0709.$g5559$.getDynamicValue(var328), var314, var327, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43281(final SubLObject var314) {
        final SubLThread var315 = SubLProcess.currentSubLThread();
        return module0067.f4885(module0709.$g5559$.getDynamicValue(var315), var314, (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43145(final SubLObject var328, final SubLObject var191) {
        final SubLThread var329 = SubLProcess.currentSubLThread();
        SubLObject var330 = (SubLObject)module0709.NIL;
        f43282();
        if (module0709.NIL != module0035.f2013(var328)) {
            final SubLObject var331 = module0709.$g5559$.currentBinding(var329);
            try {
                module0709.$g5559$.bind(module0067.f4880(Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED), var329);
                final SubLObject var332 = Sequences.length(var328);
                final SubLObject var333 = Numbers.divide((SubLObject)module0709.ONE_INTEGER, var332);
                SubLObject var334 = (SubLObject)module0709.ZERO_INTEGER;
                final SubLObject var335 = PrintLow.format((SubLObject)module0709.NIL, (SubLObject)module0709.$ic299$, var332);
                module0012.$g82$.setDynamicValue(var335, var329);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var329);
                module0012.$g83$.setDynamicValue(Sequences.length(var328), var329);
                module0012.$g84$.setDynamicValue((SubLObject)module0709.ZERO_INTEGER, var329);
                final SubLObject var28_334 = module0012.$g75$.currentBinding(var329);
                final SubLObject var336 = module0012.$g76$.currentBinding(var329);
                final SubLObject var337 = module0012.$g77$.currentBinding(var329);
                final SubLObject var338 = module0012.$g78$.currentBinding(var329);
                try {
                    module0012.$g75$.bind((SubLObject)module0709.ZERO_INTEGER, var329);
                    module0012.$g76$.bind((SubLObject)module0709.NIL, var329);
                    module0012.$g77$.bind((SubLObject)module0709.T, var329);
                    module0012.$g78$.bind(Time.get_universal_time(), var329);
                    module0012.f478(module0012.$g82$.getDynamicValue(var329));
                    SubLObject var339 = var328;
                    SubLObject var340 = (SubLObject)module0709.NIL;
                    var340 = var339.first();
                    while (module0709.NIL != var339) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var329), module0012.$g83$.getDynamicValue(var329));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var329), (SubLObject)module0709.ONE_INTEGER), var329);
                        var329.resetMultipleValues();
                        final SubLObject var341 = f43283(var340, var191);
                        final SubLObject var342 = var329.secondMultipleValue();
                        var329.resetMultipleValues();
                        module0708.f43038(var341, f43249(var191), f43156(var191));
                        if (module0709.NIL != var342) {
                            var330 = (SubLObject)ConsesLow.cons(var341, var330);
                        }
                        var334 = Numbers.add(var334, var333);
                        f43284(var334);
                        var339 = var339.rest();
                        var340 = var339.first();
                    }
                    module0012.f479();
                }
                finally {
                    module0012.$g78$.rebind(var338, var329);
                    module0012.$g77$.rebind(var337, var329);
                    module0012.$g76$.rebind(var336, var329);
                    module0012.$g75$.rebind(var28_334, var329);
                }
            }
            finally {
                module0709.$g5559$.rebind(var331, var329);
            }
        }
        f43285();
        return var330;
    }
    
    public static SubLObject f43273(final SubLObject var298, final SubLObject var191) {
        SubLObject var299 = (SubLObject)module0709.NIL;
        SubLObject var300 = var298;
        while (module0709.NIL != var300) {
            final SubLObject var301 = var300.first();
            if (module0709.NIL != module0038.f2828(var301)) {
                var300 = module0590.f36061(var300, (SubLObject)module0709.UNPROVIDED);
            }
            else {
                if (module0709.NIL != module0590.f36071(var301, module0699.f42555((SubLObject)module0709.$ic268$)) && module0709.NIL != module0590.f36042(var301)) {
                    return var299;
                }
                if (module0709.NIL != f43270(var301)) {
                    final SubLObject var302 = f43286(var300, var191);
                    var299 = (SubLObject)ConsesLow.cons(var302, var299);
                    var300 = module0590.f36068(var300);
                }
                else {
                    var300 = module0590.f36061(var300, (SubLObject)module0709.UNPROVIDED);
                }
            }
        }
        return var299;
    }
    
    public static SubLObject f43276(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = (SubLObject)module0709.NIL;
        SubLObject var301 = f43264(var298);
        final SubLObject var302 = module0590.f36061(var298, var301);
        if (module0709.NIL != f43270(var302.first())) {
            var300 = f43286(var302, var191);
        }
        else if (module0709.NIL != module0590.f36071(var302.first(), module0708.f43012((SubLObject)module0709.$ic300$)) && module0709.NIL != module0590.f36040(var302.first()) && module0709.NIL != module0590.f36071(conses_high.second(var302), module0708.f43012((SubLObject)module0709.$ic301$))) {
            var300 = f43287(var302.rest(), var191);
        }
        else {
            Errors.warn((SubLObject)module0709.$ic302$, module0035.f2124((SubLObject)module0709.TEN_INTEGER, var302));
        }
        final SubLObject var303 = module0590.f36068(var302);
        final SubLObject var304 = module0590.f36062(var303, (SubLObject)module0709.$ic303$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var305 = f43264(var304);
        final SubLObject var306 = ConsesLow.nth(var305, var304);
        var301 = Sequences.position(var306, var298, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic304$, module0709.$ic241$ }), var300);
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        return Values.values(var300, var301);
    }
    
    public static SubLObject f43068() {
        final SubLObject var193 = module0709.$g5560$.getGlobalValue();
        if (module0709.NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43288() {
        return module0034.f1829(module0709.$g5560$.getGlobalValue(), (SubLObject)ConsesLow.list(module0709.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43289() {
        return (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)module0709.$ic306$), module0708.f43012((SubLObject)module0709.$ic307$), module0699.f42555((SubLObject)module0709.$ic306$));
    }
    
    public static SubLObject f43290() {
        SubLObject var197 = module0709.$g5560$.getGlobalValue();
        if (module0709.NIL == var197) {
            var197 = module0034.f1934((SubLObject)module0709.$ic305$, (SubLObject)module0709.$ic308$, (SubLObject)module0709.NIL, (SubLObject)module0709.EQL, (SubLObject)module0709.ZERO_INTEGER, (SubLObject)module0709.ZERO_INTEGER);
        }
        SubLObject var198 = module0034.f1810(var197, (SubLObject)module0709.UNPROVIDED);
        if (var198 == module0709.$ic15$) {
            var198 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43289()));
            module0034.f1812(var197, var198, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var198);
    }
    
    public static SubLObject f43270(final SubLObject var204) {
        return module0004.f104(module0590.f36041(var204), f43290(), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43286(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        assert module0709.NIL != f43270(var298.first()) : var298.first();
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic310$, module0709.$ic241$ }), module0035.f2124((SubLObject)module0709.FOUR_INTEGER, var298));
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        final SubLObject var300 = module0590.f36089(var298.first(), module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
        SubLObject var301 = (SubLObject)module0709.NIL;
        if (module0709.NIL != conses_high.member(module0709.$g5547$.getDynamicValue(var299), (SubLObject)module0709.$ic312$, Symbols.symbol_function((SubLObject)module0709.EQL), (SubLObject)module0709.UNPROVIDED) && f43274(var298.first(), var191).isString()) {
            final SubLObject var302 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0709.ONE_INTEGER), f43291(var298, var191));
            assert module0709.NIL != f43110(var302) : var302;
            var301 = f43292(var302, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
        }
        else {
            SubLObject var303 = var298;
            SubLObject var304 = (SubLObject)module0709.NIL;
            SubLObject var305 = (SubLObject)module0709.NIL;
            SubLObject var306 = (SubLObject)module0709.NIL;
            SubLObject var307 = (SubLObject)module0709.NIL;
            while (module0709.NIL != var303 && module0709.NIL == var307) {
                final SubLObject var308 = var303.first();
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic314$, module0709.$ic241$ }), var308);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                if (var308.eql(var304)) {
                    Errors.sublisp_break((SubLObject)module0709.$ic315$, new SubLObject[] { var308 });
                }
                else if ((module0709.NIL != f43270(var308) || module0709.NIL != module0590.f36071(var308, module0699.f42535((SubLObject)module0709.$ic316$))) && module0709.NIL != module0590.f36072(var308)) {
                    var305 = (SubLObject)ConsesLow.cons(f43274(var308, var191), var305);
                    if (module0709.NIL != var306) {
                        var303 = module0590.f36061(var303, (SubLObject)module0709.UNPROVIDED);
                    }
                    else {
                        var307 = (SubLObject)module0709.T;
                    }
                }
                else if (module0709.NIL != f43270(var308) && module0709.NIL != module0590.f36042(var308)) {
                    if (module0709.NIL == var306) {
                        var307 = (SubLObject)module0709.T;
                    }
                }
                else if (module0709.NIL != module0590.f36040(var308) && module0709.NIL != module0590.f36071(var308, module0708.f43012((SubLObject)module0709.$ic317$))) {
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic318$, module0709.$ic241$ }), var308);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    final SubLObject var309 = f43293(var303, var191);
                    var305 = (SubLObject)ConsesLow.cons(var309, var305);
                    if (module0709.NIL != var306) {
                        var303 = module0590.f36068(var303);
                    }
                    else {
                        var307 = (SubLObject)module0709.T;
                    }
                }
                else if (module0709.NIL != module0590.f36040(var308) && module0709.NIL != f43270(var308)) {
                    var299.resetMultipleValues();
                    final SubLObject var310 = f43294(var303, var191, var306);
                    final SubLObject var311 = var299.secondMultipleValue();
                    final SubLObject var312 = var299.thirdMultipleValue();
                    final SubLObject var313 = var299.fourthMultipleValue();
                    var299.resetMultipleValues();
                    var303 = var310;
                    var305 = ConsesLow.append(var305, var311);
                    var307 = var312;
                    var306 = var313;
                }
                else if (module0709.NIL != module0590.f36070(module0708.f43012((SubLObject)module0709.$ic319$), var308)) {
                    var303 = module0590.f36061(var303, (SubLObject)module0709.UNPROVIDED);
                    var306 = (SubLObject)module0709.NIL;
                }
                else {
                    Errors.sublisp_break((SubLObject)module0709.$ic320$, new SubLObject[] { var308 });
                }
                var304 = var308;
            }
            var301 = f43295(var305);
        }
        if (module0709.NIL != var300) {
            f43296(var300, var301);
        }
        return var301;
    }
    
    public static SubLObject f43294(final SubLObject var194, final SubLObject var191, SubLObject var346) {
        final SubLThread var347 = SubLProcess.currentSubLThread();
        final SubLObject var348 = f43264(var194);
        final SubLObject var349 = ConsesLow.nth(var348, var194);
        SubLObject var350 = (SubLObject)module0709.NIL;
        SubLObject var351 = (SubLObject)module0709.NIL;
        SubLObject var352 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0590.f36071(var349, module0708.f43012((SubLObject)module0709.$ic319$)) && module0709.NIL != module0590.f36072(var349) && module0709.NIL != module0590.f36089(var349, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED)) {
            final SubLObject var353 = module0590.f36089(var349, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
            var350 = (SubLObject)ConsesLow.list((SubLObject)module0709.$ic321$, var353);
            var351 = module0590.f36061(var194, module0048.f_1X(var348));
            var346 = (SubLObject)module0709.NIL;
            var352 = (SubLObject)module0709.T;
        }
        else if (module0709.NIL != module0590.f36071(var349, module0708.f43012((SubLObject)module0709.$ic319$)) && module0709.NIL == module0590.f36072(var349)) {
            var351 = module0590.f36061(var194, module0048.f_1X(var348));
            var346 = (SubLObject)module0709.T;
        }
        else if (module0709.NIL != module0590.f36071(var349, module0708.f43012((SubLObject)module0709.$ic301$))) {
            final SubLObject var354 = f43287(module0590.f36061(var194, var348), var191);
            var350 = (SubLObject)ConsesLow.cons(var354, var350);
            if (module0709.NIL != var346) {
                var351 = module0590.f36068(var194);
            }
            else {
                var352 = (SubLObject)module0709.T;
            }
        }
        else {
            final SubLObject var355 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0709.ONE_INTEGER), f43291(var194, var191));
            if (module0709.NIL != var355 && module0709.NIL != module0708.$g5533$.getDynamicValue(var347)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic322$, module0709.$ic241$ }), var355, var350);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            final SubLObject var356 = f43292(var355, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
            if (var356.isString() || module0709.NIL != f43202(var356)) {
                var350 = (SubLObject)ConsesLow.cons(var356, var350);
            }
            else if (module0709.NIL != f43292(var355, (SubLObject)module0709.$ic323$, (SubLObject)module0709.UNPROVIDED)) {
                var350 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0709.$ic324$, f43292(var355, (SubLObject)module0709.$ic323$, (SubLObject)module0709.UNPROVIDED)), var350);
            }
            else if (module0709.NIL != f43292(var355, (SubLObject)module0709.$ic325$, (SubLObject)module0709.UNPROVIDED)) {
                var350 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)module0709.$ic325$, f43292(var355, (SubLObject)module0709.$ic325$, (SubLObject)module0709.UNPROVIDED)), var350);
            }
            else {
                Errors.sublisp_break((SubLObject)module0709.$ic326$, new SubLObject[] { var355 });
            }
            var351 = module0590.f36068(var194);
            if (module0709.NIL == var346) {
                var352 = (SubLObject)module0709.T;
            }
        }
        return Values.values(var351, var350, var352, var346);
    }
    
    public static SubLObject f43287(final SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && module0709.NIL == module0590.f36071(var196, module0708.f43012((SubLObject)module0709.$ic301$))) {
            Errors.error((SubLObject)module0709.$ic327$, module0035.f2124((SubLObject)module0709.TEN_INTEGER, var194));
        }
        final SubLObject var197 = module0590.f36061(var194, Sequences.position(var196, var194, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED));
        final SubLObject var198 = f43264(var197);
        final SubLObject var199 = module0590.f36061(var197, var198);
        SubLObject var200 = (SubLObject)module0709.NIL;
        if (module0709.NIL != conses_high.member(module0590.f36041(var199.first()), (SubLObject)ConsesLow.list(module0699.f42535((SubLObject)module0709.$ic328$), module0699.f42535((SubLObject)module0709.$ic329$)), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED)) {
            var200 = f43297(var199, var191);
        }
        else {
            for (SubLObject var201 = var199, var202 = var201.first(); module0709.NIL == module0590.f36070(module0708.f43012((SubLObject)module0709.$ic301$), var202); var202 = var201.first()) {
                SubLObject var203 = (SubLObject)module0709.NIL;
                if (module0709.NIL != module0590.f36040(var202)) {
                    final SubLObject var204 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0709.ONE_INTEGER), f43298(var201, var191));
                    assert module0709.NIL != f43110(var204) : var204;
                    var203 = f43292(var204, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
                }
                else {
                    var203 = f43299(var202, var191);
                }
                if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && !var203.isString() && module0709.NIL == f43202(var203)) {
                    Errors.error((SubLObject)module0709.$ic330$, var202);
                }
                var200 = (SubLObject)ConsesLow.cons(var203, var200);
                var201 = module0590.f36068(var201);
            }
            var200 = Sequences.nreverse(var200);
        }
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var195)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic331$, module0709.$ic241$ }), var200);
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.cons((SubLObject)module0709.$ic332$, var200);
    }
    
    public static SubLObject f43300(final SubLObject var240) {
        SubLObject var241 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0035.f2014(var240)) {
            SubLObject var242 = (SubLObject)module0709.NIL;
            if (module0709.NIL == var242) {
                SubLObject var243 = var240;
                SubLObject var244 = (SubLObject)module0709.NIL;
                var244 = var243.first();
                while (module0709.NIL == var242 && module0709.NIL != var243) {
                    if (!var244.isString() && module0709.NIL == module0035.f2192((SubLObject)module0709.$ic157$, var244)) {
                        var242 = var244;
                    }
                    var243 = var243.rest();
                    var244 = var243.first();
                }
            }
            var241 = Types.sublisp_null(var242);
        }
        return var241;
    }
    
    public static SubLObject f43297(final SubLObject var194, final SubLObject var191) {
        return f43301(var194, var191);
    }
    
    public static SubLObject f43301(final SubLObject var298, final SubLObject var191) {
        SubLObject var299 = var298;
        SubLObject var300 = (SubLObject)module0709.NIL;
        SubLObject var301 = (SubLObject)module0709.NIL;
        SubLObject var302 = (SubLObject)module0709.NIL;
        SubLObject var303 = (SubLObject)module0709.NIL;
        while (module0709.NIL != var299 && (module0709.NIL == var301 || module0709.NIL == var302)) {
            var299 = module0590.f36061(var299, f43302(var299));
            if (module0709.NIL != var299) {
                final SubLObject var304 = var299.first();
                if (module0709.NIL != module0590.f36071(var304, module0699.f42535((SubLObject)module0709.$ic328$)) && module0590.f36089(var304, module0699.f42535((SubLObject)module0709.$ic217$), (SubLObject)module0709.UNPROVIDED).equal((SubLObject)module0709.$ic333$)) {
                    var302 = (SubLObject)module0709.T;
                    var299 = module0590.f36068(var299);
                }
                else if (module0709.NIL != module0590.f36071(var304, module0699.f42535((SubLObject)module0709.$ic328$)) && module0590.f36089(var304, module0699.f42535((SubLObject)module0709.$ic334$), (SubLObject)module0709.UNPROVIDED).equal((SubLObject)module0709.$ic335$) && module0709.NIL == module0590.f36072(var304)) {
                    SubLObject var305 = var299.rest();
                    SubLObject var306 = var305.first();
                    SubLObject var307 = (SubLObject)module0709.NIL;
                    while (module0709.NIL == module0590.f36070(module0699.f42535((SubLObject)module0709.$ic328$), var306)) {
                        final SubLObject var308 = f43303(var305, var191);
                        var307 = (SubLObject)ConsesLow.cons(var308, var307);
                        var305 = module0590.f36068(var305);
                        var306 = var305.first();
                    }
                    var303 = Sequences.nreverse(var307);
                    var302 = (SubLObject)module0709.T;
                    var299 = var305;
                }
                else if (module0709.NIL != module0590.f36071(var304, module0699.f42535((SubLObject)module0709.$ic328$)) && module0709.NIL != module0590.f36072(var304) && module0709.NIL != module0038.f2611(module0590.f36089(var304, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED))) {
                    final SubLObject var309 = module0590.f36089(var304, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
                    var303 = f43304((SubLObject)ConsesLow.list((SubLObject)module0709.$ic321$, var309));
                    var302 = (SubLObject)module0709.T;
                    var299 = module0590.f36061(var299, (SubLObject)module0709.UNPROVIDED);
                }
                else if (module0709.NIL != module0590.f36071(var304, module0699.f42535((SubLObject)module0709.$ic328$))) {
                    var303 = f43301(var299.rest(), var191);
                    var302 = (SubLObject)module0709.T;
                    var299 = module0590.f36068(var299);
                }
                else if (module0709.NIL != module0590.f36071(var304, module0699.f42535((SubLObject)module0709.$ic329$))) {
                    var300 = f43303(var299, var191);
                    var301 = (SubLObject)module0709.T;
                    var299 = module0590.f36068(var299);
                }
                else {
                    Errors.sublisp_break((SubLObject)module0709.$ic336$, new SubLObject[] { var304 });
                }
            }
        }
        final SubLObject var310 = (SubLObject)ConsesLow.cons(var300, var303);
        return var310;
    }
    
    public static SubLObject f43303(SubLObject var194, final SubLObject var191) {
        SubLObject var196;
        final SubLObject var195 = var196 = var194.first();
        if (module0709.NIL != module0590.f36072(var195)) {
            var196 = var195;
        }
        else {
            if (module0709.NIL != module0590.f36071(var195, module0699.f42535((SubLObject)module0709.$ic329$)) || module0709.NIL != module0590.f36071(var195, module0699.f42535((SubLObject)module0709.$ic328$))) {
                final SubLObject var197 = f43264(var194);
                var194 = (SubLObject)((module0709.NIL != var197) ? module0590.f36061(var194, var197) : module0709.NIL);
                var196 = var194.first();
            }
            var196 = module0590.f36067(var194);
            PrintLow.format((SubLObject)module0709.T, (SubLObject)module0709.$ic337$, var196);
        }
        return var196;
    }
    
    public static SubLObject f43295(final SubLObject var366) {
        assert module0709.NIL != module0035.f2015(var366) : var366;
        SubLObject var367 = var366;
        SubLObject var368 = (SubLObject)module0709.NIL;
        var368 = var367.first();
        while (module0709.NIL != var367) {
            assert module0709.NIL != f43197(var368) : var368;
            var367 = var367.rest();
            var368 = var367.first();
        }
        return (SubLObject)((module0709.NIL != module0035.f2012(var366)) ? module0709.NIL : ((module0709.NIL != module0035.f1997(var366)) ? module0035.f2113(var366) : ConsesLow.cons((SubLObject)module0709.$ic338$, var366)));
    }
    
    public static SubLObject f43302(final SubLObject var194) {
        return module0590.f36060(var194, (SubLObject)module0709.$ic80$);
    }
    
    public static SubLObject f43264(final SubLObject var194) {
        final SubLObject var195 = f43302(var194.rest());
        return (SubLObject)((module0709.NIL != var195) ? module0048.f_1X(var195) : module0709.NIL);
    }
    
    public static SubLObject f43275(final SubLObject var194) {
        return module0035.find_if_not((SubLObject)module0709.$ic80$, var194.rest(), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43269(final SubLObject var204, final SubLObject var191) {
        final SubLObject var205 = f43305(var191);
        final SubLObject var206 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic120$), (SubLObject)module0709.UNPROVIDED);
        final SubLObject var207 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic217$), (SubLObject)module0709.UNPROVIDED);
        final SubLObject var208 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic339$), (SubLObject)module0709.UNPROVIDED);
        SubLObject var209 = (SubLObject)module0709.NIL;
        SubLObject var210 = (SubLObject)module0709.NIL;
        if (module0709.NIL != var206) {
            var209 = f43168(var206);
        }
        else if (module0709.NIL != var207) {
            var209 = f43168(var207);
        }
        else if (module0709.NIL != var208) {
            var209 = f43168(var208);
        }
        var210 = f43306(var209, var205);
        return Values.values(var209, var210);
    }
    
    public static SubLObject f43306(final SubLObject var241, final SubLObject var370) {
        final SubLObject var371 = f43307(var241);
        SubLObject var372 = module0038.f2842((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_period, Sequences.cconcatenate(var370, module0038.f2812(var371)));
        if (module0709.NIL != Characters.upper_case_p(module0038.f2636(var372))) {
            var372 = module0038.f2815(var372);
        }
        return var372;
    }
    
    public static SubLObject f43307(final SubLObject var241) {
        final SubLObject var242 = (module0709.NIL != f43202(var241)) ? conses_high.third(var241) : var241;
        return var242;
    }
    
    public static SubLObject f43308(final SubLObject var375, final SubLObject var191) {
        SubLObject var376 = (SubLObject)module0709.NIL;
        SubLObject var377 = var375;
        SubLObject var378 = (SubLObject)module0709.NIL;
        var378 = var377.first();
        while (module0709.NIL != var377) {
            if (module0709.NIL != f43199(var378)) {
                var376 = (SubLObject)ConsesLow.cons(f43308(f43205(var378), var191), var376);
            }
            else if (module0709.NIL == var378) {
                if (module0709.NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)module0709.$ic340$, var375);
                }
            }
            else {
                var376 = (SubLObject)ConsesLow.cons(f43309(var378, var191), var376);
            }
            var377 = var377.rest();
            var378 = var377.first();
        }
        return f43310(var376, var191);
    }
    
    public static SubLObject f43311() {
        return module0434.f30576((SubLObject)module0709.$ic342$, (SubLObject)module0709.$ic343$, module0709.$ic36$, (SubLObject)module0709.$ic344$);
    }
    
    public static SubLObject f43312() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var3) {
            return f43311();
        }
        var4 = module0034.f1857(var3, (SubLObject)module0709.$ic341$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)module0709.$ic341$, (SubLObject)module0709.ZERO_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var3, (SubLObject)module0709.$ic341$, var4);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)module0709.UNPROVIDED);
        if (var5 == module0709.$ic15$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43311()));
            module0034.f1812(var4, var5, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43309(final SubLObject var378, SubLObject var191) {
        if (var191 == module0709.UNPROVIDED) {
            var191 = module0709.$g5550$.getDynamicValue();
        }
        final SubLThread var379 = SubLProcess.currentSubLThread();
        if (module0709.NIL != f43203(var378)) {
            return f43313(var378, var191, (SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL != module0205.f13145((SubLObject)module0709.$ic345$, var378, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED) && module0709.NIL == module0205.f13145((SubLObject)module0709.$ic346$, var378, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            return var378;
        }
        if (module0709.NIL != module0062.f4492(var378, (SubLObject)module0709.$ic347$) && module0709.NIL != module0035.f2302(f43312(), conses_high.third(var378), Symbols.symbol_function((SubLObject)module0709.EQUAL))) {
            return module0035.f2294(f43312(), conses_high.third(var378), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED);
        }
        SubLObject var380 = (SubLObject)module0709.NIL;
        if (var378.isString() && module0709.NIL == module0590.f36048(var378)) {
            final SubLObject var381 = f43113(var378, (SubLObject)module0709.$ic84$);
            final SubLObject var382 = (SubLObject)((module0709.NIL != var381) ? f43292(var381, (SubLObject)module0709.$ic286$, (SubLObject)module0709.NIL) : module0709.NIL);
            final SubLObject var383 = (SubLObject)((module0709.NIL != var381) ? f43292(var381, (SubLObject)module0709.$ic289$, (SubLObject)module0709.NIL) : module0709.NIL);
            if (module0709.NIL != Guids.guid_string_p(var382)) {
                var380 = module0166.f10747(var382);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var379)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic348$, module0709.$ic241$ }), var380);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
            }
            else if (module0709.NIL != module0213.f13915(var383)) {
                var380 = module0213.f13917(var383);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var379)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic349$, module0709.$ic241$ }), var380);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
            }
        }
        if (module0709.NIL == var380) {
            final SubLObject var384 = module0709.$ic350$;
            var380 = f43279(var378, var384, var191);
        }
        return var380;
    }
    
    public static SubLObject f43314(final SubLObject var380, final SubLObject var191) {
        final SubLThread var381 = SubLProcess.currentSubLThread();
        assert module0709.NIL != Types.stringp(var380) : var380;
        assert module0709.NIL != f43213(var191) : var191;
        SubLObject var382 = f43242(var380, var191);
        if (module0709.NIL == var382) {
            final SubLObject var383 = (SubLObject)module0709.$ic351$;
            final SubLObject var384 = (SubLObject)ConsesLow.list(module0709.$ic352$, var380, var383);
            final SubLObject var385 = module0434.f30578(var383, var384, module0709.$ic36$, (SubLObject)module0709.$ic353$);
            SubLObject var386 = (SubLObject)((module0709.NIL != var385) ? var385.first() : module0709.NIL);
            var381.resetMultipleValues();
            final SubLObject var387 = module0337.f22630(var386, (SubLObject)module0709.$ic354$);
            final SubLObject var388 = var381.secondMultipleValue();
            var381.resetMultipleValues();
            if (module0709.NIL != var387) {
                final SubLObject var389 = var386 = module0035.f2294(var388, (SubLObject)module0709.$ic355$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            }
            if (var386.isString()) {
                var386 = (var382 = module0038.f2621(var386, (SubLObject)module0709.$ic218$, (SubLObject)module0709.UNPROVIDED));
            }
        }
        return var382;
    }
    
    public static SubLObject f43315(final SubLObject var241, final SubLObject var164, final SubLObject var191) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0590.f36048(var241)) {
            final SubLObject var243 = module0590.f36047(var241);
            final SubLObject var244 = module0590.f36049(var241);
            SubLObject var245 = f43314(var243, var191);
            if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var242) && module0709.NIL == module0589.f35907(var245, (SubLObject)module0709.UNPROVIDED)) {
                Errors.error((SubLObject)module0709.$ic357$, var243);
            }
            if (module0038.f2637(var245).eql((SubLObject)Characters.CHAR_hash)) {
                var245 = module0038.f2666(var245, (SubLObject)module0709.UNPROVIDED);
            }
            return f43316((SubLObject)ConsesLow.list((SubLObject)module0709.$ic298$, var245, var244), var164, var191);
        }
        if (module0709.NIL != f43199(var241)) {
            SubLObject var246 = (SubLObject)module0709.NIL;
            SubLObject var247 = f43205(var241);
            SubLObject var248 = (SubLObject)module0709.NIL;
            var248 = var247.first();
            while (module0709.NIL != var247) {
                final SubLObject var249 = f43316(var248, var164, var191);
                assert module0709.NIL != module0269.f17710(var249) : var249;
                var246 = (SubLObject)ConsesLow.cons(var249, var246);
                var247 = var247.rest();
                var248 = var247.first();
            }
            return f43310(var246, var191);
        }
        if (module0709.NIL != f43202(var241)) {
            return f43317(var241, var164, var191);
        }
        if (module0709.NIL != f43204(var241)) {
            return f43304(var241);
        }
        if (!var241.isString() && module0709.NIL == f43202(var241)) {
            if (module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic358$, var164, var241);
            }
            return (SubLObject)module0709.NIL;
        }
        if (module0709.NIL != Sequences.find_if((SubLObject)module0709.$ic359$, var241, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            Errors.warn((SubLObject)module0709.$ic360$, var241);
        }
        if (module0709.NIL != module0590.f36048(var241)) {
            Errors.warn((SubLObject)module0709.$ic361$, var241);
        }
        final SubLObject var250 = f43137(var191);
        final SubLObject var251 = f43318(var241, var164, var250, var191, (SubLObject)module0709.UNPROVIDED);
        return var251;
    }
    
    public static SubLObject f43316(final SubLObject var241, final SubLObject var164, final SubLObject var191) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        final SubLObject var243 = module0034.$g879$.getDynamicValue(var242);
        SubLObject var244 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var243) {
            return f43315(var241, var164, var191);
        }
        var244 = module0034.f1857(var243, (SubLObject)module0709.$ic356$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var244) {
            var244 = module0034.f1807(module0034.f1842(var243), (SubLObject)module0709.$ic356$, (SubLObject)module0709.THREE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var243, (SubLObject)module0709.$ic356$, var244);
        }
        final SubLObject var245 = module0034.f1781(var241, var164, var191);
        final SubLObject var246 = module0034.f1814(var244, var245, (SubLObject)module0709.UNPROVIDED);
        if (var246 != module0709.$ic15$) {
            SubLObject var247 = var246;
            SubLObject var248 = (SubLObject)module0709.NIL;
            var248 = var247.first();
            while (module0709.NIL != var247) {
                SubLObject var249 = var248.first();
                final SubLObject var250 = conses_high.second(var248);
                if (var241.equal(var249.first())) {
                    var249 = var249.rest();
                    if (var164.equal(var249.first())) {
                        var249 = var249.rest();
                        if (module0709.NIL != var249 && module0709.NIL == var249.rest() && var191.equal(var249.first())) {
                            return module0034.f1959(var250);
                        }
                    }
                }
                var247 = var247.rest();
                var248 = var247.first();
            }
        }
        final SubLObject var251 = Values.arg2(var242.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43315(var241, var164, var191)));
        module0034.f1836(var244, var245, var246, var251, (SubLObject)ConsesLow.list(var241, var164, var191));
        return module0034.f1959(var251);
    }
    
    public static SubLObject f43319(final SubLObject var11, final SubLObject var180, final SubLObject var191) {
        return f43318(var11, module0709.$ic362$, var180, var191, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43320(final SubLObject var241, final SubLObject var164, final SubLObject var180, final SubLObject var191, SubLObject var387) {
        if (var387 == module0709.UNPROVIDED) {
            var387 = module0709.$g5561$.getDynamicValue();
        }
        SubLObject var388 = f43321(var241, var164, var191, var180);
        if (module0709.NIL == var388) {
            var388 = ((module0709.NIL != var387 || !var180.equal(f43137(var191))) ? f43322(var241, var164, var180, var191) : f43323(var241, var164, var180, var191));
        }
        return var388;
    }
    
    public static SubLObject f43318(final SubLObject var241, final SubLObject var164, final SubLObject var180, final SubLObject var191, SubLObject var387) {
        if (var387 == module0709.UNPROVIDED) {
            var387 = module0709.$g5561$.getDynamicValue();
        }
        final SubLThread var388 = SubLProcess.currentSubLThread();
        final SubLObject var389 = module0034.$g879$.getDynamicValue(var388);
        SubLObject var390 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var389) {
            return f43320(var241, var164, var180, var191, var387);
        }
        var390 = module0034.f1857(var389, (SubLObject)module0709.$ic363$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var390) {
            var390 = module0034.f1807(module0034.f1842(var389), (SubLObject)module0709.$ic363$, (SubLObject)module0709.FIVE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var389, (SubLObject)module0709.$ic363$, var390);
        }
        final SubLObject var391 = module0034.f1779(var241, var164, var180, var191, var387);
        final SubLObject var392 = module0034.f1814(var390, var391, (SubLObject)module0709.UNPROVIDED);
        if (var392 != module0709.$ic15$) {
            SubLObject var393 = var392;
            SubLObject var394 = (SubLObject)module0709.NIL;
            var394 = var393.first();
            while (module0709.NIL != var393) {
                SubLObject var395 = var394.first();
                final SubLObject var396 = conses_high.second(var394);
                if (var241.equal(var395.first())) {
                    var395 = var395.rest();
                    if (var164.equal(var395.first())) {
                        var395 = var395.rest();
                        if (var180.equal(var395.first())) {
                            var395 = var395.rest();
                            if (var191.equal(var395.first())) {
                                var395 = var395.rest();
                                if (module0709.NIL != var395 && module0709.NIL == var395.rest() && var387.equal(var395.first())) {
                                    return module0034.f1959(var396);
                                }
                            }
                        }
                    }
                }
                var393 = var393.rest();
                var394 = var393.first();
            }
        }
        final SubLObject var397 = Values.arg2(var388.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43320(var241, var164, var180, var191, var387)));
        module0034.f1836(var390, var391, var392, var397, (SubLObject)ConsesLow.list(var241, var164, var180, var191, var387));
        return module0034.f1959(var397);
    }
    
    public static SubLObject f43322(final SubLObject var241, final SubLObject var164, final SubLObject var180, final SubLObject var191) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        final SubLObject var243 = f43243(var191);
        final SubLObject var244 = f43244(var191);
        final SubLObject var245 = module0256.f16576(var164, module0709.$ic364$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        SubLObject var246 = var241;
        final SubLObject var247 = (module0709.NIL != module0038.f2611(var243) && module0709.NIL != var245) ? module0038.f2815(var243) : module0038.f2812(var243);
        SubLObject var248 = (SubLObject)module0709.NIL;
        if (module0709.NIL != var245) {
            var246 = f43307(var241);
            if (module0709.NIL != module0038.f2608(var247)) {
                var246 = module0038.f2815(var246);
            }
        }
        final SubLObject var249 = module0111.$g1405$.currentBinding(var242);
        try {
            module0111.$g1405$.bind((SubLObject)module0709.NIL, var242);
            module0574.f35153(f43156(var191));
            var248 = f43324(var246, (SubLObject)ConsesLow.list(var164), module0709.$ic93$, var247, var244, (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL == var245));
        }
        finally {
            module0111.$g1405$.rebind(var249, var242);
        }
        f43155((SubLObject)ConsesLow.list(module0709.$ic365$, var248, f43122(var180, (SubLObject)module0709.UNPROVIDED)), module0709.$ic366$, var191);
        f43325(var248, var180, var241, var191);
        if (module0709.NIL != f43249(var191)) {
            module0708.f43038(var248, f43249(var191), f43156(var191));
        }
        return var248;
    }
    
    public static SubLObject f43325(final SubLObject var13, final SubLObject var180, final SubLObject var392, final SubLObject var191) {
        return f43155(f43326(var13, var180, var392, var191), f43166(var191), var191);
    }
    
    public static SubLObject f43326(final SubLObject var13, final SubLObject var180, final SubLObject var392, final SubLObject var191) {
        assert module0709.NIL != Types.stringp(var392) : var392;
        final SubLObject var393 = f43247(var191);
        final SubLObject var394 = (module0709.NIL != var393) ? f43327(var392, var180, var191) : var392;
        final SubLObject var395 = (module0709.NIL != var393) ? f43137(var191) : var180;
        return module0202.f12769(module0709.$ic9$, var13, var395, var394);
    }
    
    public static SubLObject f43327(final SubLObject var392, final SubLObject var180, final SubLObject var191) {
        final SubLObject var393 = f43328(var180, var191);
        SubLObject var394 = (SubLObject)((var393.isString() && module0709.NIL != f43248(var191)) ? f43329(var393, var191) : module0709.NIL);
        if (module0709.NIL == var393) {
            var394 = (SubLObject)module0709.$ic94$;
        }
        else if (module0709.NIL == var394) {
            var394 = Sequences.cconcatenate(var393, (SubLObject)module0709.$ic218$);
        }
        else if (!Characters.CHAR_colon.eql(module0038.f2637(var394))) {
            var394 = Sequences.cconcatenate(var394, (SubLObject)module0709.$ic367$);
        }
        return Sequences.cconcatenate(var394, var392);
    }
    
    public static SubLObject f43328(final SubLObject var180, final SubLObject var191) {
        final SubLObject var192 = module0205.f13144(var180);
        return var192.equal(module0205.f13144(f43137(var191))) ? f43154(var191) : f43330(var192);
    }
    
    public static SubLObject f43330(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        var181.resetMultipleValues();
        final SubLObject var182 = module0337.f22630(var180, (SubLObject)module0709.$ic368$);
        final SubLObject var183 = var181.secondMultipleValue();
        var181.resetMultipleValues();
        if (module0709.NIL != var182) {
            final SubLObject var184 = module0035.f2294(var183, (SubLObject)module0709.$ic369$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            return f43331(var184);
        }
        final SubLObject var185 = (SubLObject)ConsesLow.listS(module0709.$ic370$, var180, (SubLObject)module0709.$ic371$);
        final SubLObject var186 = module0709.$ic36$;
        final SubLObject var187 = module0434.f30578((SubLObject)module0709.$ic351$, var185, var186, (SubLObject)module0709.$ic372$);
        SubLObject var188 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0035.f2013(var187)) {
            var188 = f43331(var187.first());
        }
        return var188;
    }
    
    public static SubLObject f43331(final SubLObject var177) {
        if (var177.isString()) {
            return var177;
        }
        if (module0709.NIL != module0206.f13453(var177) && module0205.f13277(var177, (SubLObject)module0709.UNPROVIDED).isString() && module0709.ONE_INTEGER.eql(module0205.f13360(var177, (SubLObject)module0709.UNPROVIDED))) {
            return module0205.f13277(var177, (SubLObject)module0709.UNPROVIDED);
        }
        return print_high.princ_to_string(var177);
    }
    
    public static SubLObject f43332(final SubLObject var177, final SubLObject var191) {
        assert module0709.NIL != Types.stringp(var177) : var177;
        return f43333(var177, f43137(var191), (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43329(final SubLObject var177, final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var193 = module0034.$g879$.getDynamicValue(var192);
        SubLObject var194 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var193) {
            return f43332(var177, var191);
        }
        var194 = module0034.f1857(var193, (SubLObject)module0709.$ic373$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var194) {
            var194 = module0034.f1807(module0034.f1842(var193), (SubLObject)module0709.$ic373$, (SubLObject)module0709.TWO_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var193, (SubLObject)module0709.$ic373$, var194);
        }
        final SubLObject var195 = module0034.f1782(var177, var191);
        final SubLObject var196 = module0034.f1814(var194, var195, (SubLObject)module0709.UNPROVIDED);
        if (var196 != module0709.$ic15$) {
            SubLObject var197 = var196;
            SubLObject var198 = (SubLObject)module0709.NIL;
            var198 = var197.first();
            while (module0709.NIL != var197) {
                SubLObject var199 = var198.first();
                final SubLObject var200 = conses_high.second(var198);
                if (var177.equal(var199.first())) {
                    var199 = var199.rest();
                    if (module0709.NIL != var199 && module0709.NIL == var199.rest() && var191.equal(var199.first())) {
                        return module0034.f1959(var200);
                    }
                }
                var197 = var197.rest();
                var198 = var197.first();
            }
        }
        final SubLObject var201 = Values.arg2(var192.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43332(var177, var191)));
        module0034.f1836(var194, var195, var196, var201, (SubLObject)ConsesLow.list(var177, var191));
        return module0034.f1959(var201);
    }
    
    public static SubLObject f43334() {
        module0574.f35219((SubLObject)module0709.$ic374$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        module0574.f35219((SubLObject)module0709.$ic375$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        module0574.f35219((SubLObject)module0709.$ic376$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        module0574.f35219((SubLObject)module0709.$ic377$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        module0574.f35219((SubLObject)module0709.$ic378$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        module0574.f35219((SubLObject)module0709.$ic379$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        module0574.f35219((SubLObject)module0709.$ic380$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43333(final SubLObject var177, final SubLObject var180, final SubLObject var396) {
        final SubLObject var397 = (SubLObject)module0709.$ic381$;
        SubLObject var398 = (SubLObject)module0709.NIL;
        SubLObject var399 = (SubLObject)ConsesLow.list(module0709.$ic382$, (SubLObject)ConsesLow.list(module0709.$ic383$, var180, var397, var177), (SubLObject)ConsesLow.list(module0709.$ic383$, var180, var397, (SubLObject)ConsesLow.list(module0709.$ic384$, var177)));
        SubLObject var400 = module0434.f30578(var397, var399, module0709.$ic36$, (SubLObject)module0709.$ic385$);
        if (module0709.NIL != var400) {
            var398 = var400.first();
        }
        if (module0709.NIL == var398) {
            var399 = (SubLObject)ConsesLow.list(module0709.$ic382$, (SubLObject)ConsesLow.list(module0709.$ic352$, var397, var177), (SubLObject)ConsesLow.list(module0709.$ic352$, var397, (SubLObject)ConsesLow.list(module0709.$ic384$, var177)));
            var400 = module0434.f30578(var397, var399, module0709.$ic36$, (SubLObject)module0709.$ic385$);
            if (module0709.NIL != var400) {
                var398 = var400.first();
            }
        }
        if (module0709.NIL == var398 && module0709.NIL == var396) {
            var398 = (module0038.f2637(var177).eql((SubLObject)Characters.CHAR_hash) ? f43333(module0038.f2666(var177, (SubLObject)module0709.UNPROVIDED), var180, (SubLObject)module0709.T) : f43333(Sequences.cconcatenate(var177, (SubLObject)module0709.$ic218$), var180, (SubLObject)module0709.T));
        }
        return var398;
    }
    
    public static SubLObject f43310(final SubLObject var156, final SubLObject var191) {
        assert module0709.NIL != module0035.f2015(var156) : var156;
        SubLObject var192 = var156;
        SubLObject var193 = (SubLObject)module0709.NIL;
        var193 = var192.first();
        while (module0709.NIL != var192) {
            assert module0709.NIL != f43335(var193) : var193;
            var192 = var192.rest();
            var193 = var192.first();
        }
        return (module0709.NIL != module0035.f1997(var156)) ? module0035.f2113(var156) : f43336((SubLObject)ConsesLow.list(module0709.$ic387$, module0202.f12683(module0709.$ic388$, var156, (SubLObject)module0709.UNPROVIDED)), var191);
    }
    
    public static SubLObject f43335(final SubLObject var240) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL != module0206.f13450(var240) || (module0709.NIL != module0035.f2014(var240) && module0709.NIL != module0205.f13145((SubLObject)module0709.$ic161$, var240, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)));
    }
    
    public static SubLObject f43337(final SubLObject var156, final SubLObject var191) {
        assert module0709.NIL != module0035.f2015(var156) : var156;
        SubLObject var192 = var156;
        SubLObject var193 = (SubLObject)module0709.NIL;
        var193 = var192.first();
        while (module0709.NIL != var192) {
            assert module0709.NIL != f43335(var193) : var193;
            var192 = var192.rest();
            var193 = var192.first();
        }
        return (module0709.NIL != module0035.f1997(var156)) ? module0035.f2113(var156) : ((module0709.NIL != module0035.f1998(var156)) ? f43336(reader.bq_cons(module0709.$ic389$, var156), var191) : f43336((SubLObject)ConsesLow.list(module0709.$ic390$, module0202.f12683(module0709.$ic388$, var156, (SubLObject)module0709.UNPROVIDED)), var191));
    }
    
    public static SubLObject f43338(final SubLObject var156, final SubLObject var191) {
        assert module0709.NIL != module0035.f2015(var156) : var156;
        SubLObject var192 = var156;
        SubLObject var193 = (SubLObject)module0709.NIL;
        var193 = var192.first();
        while (module0709.NIL != var192) {
            assert module0709.NIL != f43335(var193) : var193;
            var192 = var192.rest();
            var193 = var192.first();
        }
        return f43336((SubLObject)((module0709.NIL != module0035.f1997(var156)) ? ConsesLow.list(module0709.$ic391$, module0035.f2113(var156)) : reader.bq_cons(module0709.$ic392$, var156)), var191);
    }
    
    public static SubLObject f43305(final SubLObject var191) {
        return module0038.f2815(f43216(var191));
    }
    
    public static SubLObject f43283(final SubLObject var242, final SubLObject var191) {
        final SubLThread var243 = SubLProcess.currentSubLThread();
        final SubLObject var244 = f43172(var242);
        final SubLObject var245 = f43196(var242, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var246 = f43244(var191);
        SubLObject var247 = f43339(var242, var191);
        final SubLObject var248 = module0709.$ic93$;
        SubLObject var249 = (SubLObject)module0709.NIL;
        SubLObject var250 = (SubLObject)module0709.NIL;
        final SubLObject var251 = module0709.$ic394$;
        if (module0709.NIL == conses_high.member(var251, var247, (SubLObject)module0709.$ic395$, Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
            var247 = (SubLObject)ConsesLow.cons(var251, var247);
        }
        if (module0709.NIL == conses_high.member(var245, module0709.$g5563$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED) || !f43154(var191).isString() || module0709.NIL == module0038.f2668((SubLObject)module0709.$ic296$, f43154(var191), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            var250 = f43340(var245, var191);
            if (module0709.NIL == var250) {
                final SubLObject var252 = f43196(var242, (SubLObject)module0709.$ic286$, (SubLObject)module0709.NIL);
                if (module0709.NIL != Guids.guid_string_p(var252)) {
                    var250 = module0166.f10747(var252);
                }
            }
            if (module0709.NIL == var250) {
                final SubLObject var253 = f43196(var242, (SubLObject)module0709.$ic289$, (SubLObject)module0709.NIL);
                if (module0709.NIL != module0213.f13915(var253)) {
                    var250 = module0213.f13917(var253);
                }
            }
            if (module0709.NIL != var250) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var243)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic396$, module0709.$ic241$ }), var250);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                SubLObject var254 = var247;
                SubLObject var255 = (SubLObject)module0709.NIL;
                var255 = var254.first();
                while (module0709.NIL != var254) {
                    f43341((SubLObject)ConsesLow.list(module0709.$ic397$, var250, var255), var248, var191);
                    var254 = var254.rest();
                    var255 = var254.first();
                }
            }
            if (module0709.NIL == var250) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var243)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic398$, module0709.$ic241$ }), var242);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var250 = f43148(var244, var247, var248, (SubLObject)module0709.$ic94$, var246, (SubLObject)module0709.NIL, var191);
            }
            if (module0709.NIL == var250) {
                if (module0709.NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)module0709.$ic399$, var244);
                }
            }
            else {
                var249 = f43342(var250, var242, var191);
            }
        }
        return Values.values(var250, var249);
    }
    
    public static SubLObject f43339(final SubLObject var242, final SubLObject var191) {
        SubLObject var243 = (SubLObject)module0709.NIL;
        SubLObject var244 = f43196(var242, (SubLObject)module0709.$ic262$, (SubLObject)module0709.NIL);
        SubLObject var245 = (SubLObject)module0709.NIL;
        var245 = var244.first();
        while (module0709.NIL != var244) {
            final SubLObject var246 = f43309(var245, var191);
            var243 = (SubLObject)ConsesLow.cons(var246, var243);
            var244 = var244.rest();
            var245 = var244.first();
        }
        if (module0709.T.eql(f43196(var242, (SubLObject)module0709.$ic273$, (SubLObject)module0709.NIL))) {
            var243 = (SubLObject)ConsesLow.cons(module0709.$ic400$, var243);
        }
        return Sequences.delete_duplicates(var243, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43343(final SubLObject var343, final SubLObject var191) {
        SubLObject var344 = (SubLObject)module0709.NIL;
        SubLObject var345 = f43292(var343, (SubLObject)module0709.$ic262$, (SubLObject)module0709.NIL);
        SubLObject var346 = (SubLObject)module0709.NIL;
        var346 = var345.first();
        while (module0709.NIL != var345) {
            final SubLObject var347 = f43309(var346, var191);
            var344 = (SubLObject)ConsesLow.cons(var347, var344);
            var345 = var345.rest();
            var346 = var345.first();
        }
        return Sequences.delete_duplicates(var344, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43342(final SubLObject var327, final SubLObject var242, final SubLObject var191) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        final SubLObject var329 = f43194(var242);
        SubLObject var330 = f43196(var242, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var331 = f43214(var191);
        final SubLObject var332 = f43166(var191);
        SubLObject var333 = (SubLObject)module0709.NIL;
        f43341((SubLObject)ConsesLow.list(module0709.$ic365$, var327, f43221(var191)), module0709.$ic366$, var191);
        if (module0709.NIL != f43202(var330)) {
            SubLObject var335;
            final SubLObject var334 = var335 = var330.rest();
            SubLObject var336 = (SubLObject)module0709.NIL;
            SubLObject var337 = (SubLObject)module0709.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)module0709.$ic401$);
            var336 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)module0709.$ic401$);
            var337 = var335.first();
            var335 = var335.rest();
            if (module0709.NIL == var335) {
                var331 = f43121(var336, var191, (SubLObject)module0709.UNPROVIDED);
                var330 = var337;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var334, (SubLObject)module0709.$ic401$);
            }
        }
        f43325(var327, var331, var330, var191);
        if (module0709.NIL != f43193(var242)) {
            final SubLObject var338 = f43308(f43193(var242), var191);
            f43341((SubLObject)ConsesLow.list(module0709.$ic402$, var327, var338), var332, var191);
        }
        else {
            f43341((SubLObject)ConsesLow.listS(module0709.$ic402$, var327, (SubLObject)module0709.$ic403$), var332, var191);
            var333 = (SubLObject)module0709.T;
        }
        final SubLObject var339 = f43344(var329, var191);
        if (module0709.NIL != var339) {
            f43341((SubLObject)ConsesLow.list(module0709.$ic404$, var327, var339), var332, var191);
        }
        else {
            f43341((SubLObject)ConsesLow.listS(module0709.$ic404$, var327, (SubLObject)module0709.$ic403$), var332, var191);
            var333 = (SubLObject)module0709.T;
        }
        if (module0709.NIL != f43192(var242)) {
            f43341((SubLObject)ConsesLow.list(module0709.$ic114$, var327, f43192(var242)), var332, var191);
        }
        SubLObject var340 = f43196(var242, (SubLObject)module0709.$ic267$, (SubLObject)module0709.NIL);
        SubLObject var341 = (SubLObject)module0709.NIL;
        var341 = var340.first();
        while (module0709.NIL != var340) {
            f43167(var327, var341, var191);
            var340 = var340.rest();
            var341 = var340.first();
        }
        final SubLObject var342 = f43196(var242, (SubLObject)module0709.$ic277$, (SubLObject)module0709.NIL);
        final SubLObject var343 = (SubLObject)((module0709.NIL != var342) ? f43340(var342, var191) : module0709.NIL);
        if (module0709.NIL != var343) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var328)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic405$, module0709.$ic241$ }), var343, var327);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43341((SubLObject)ConsesLow.list(module0709.$ic406$, var327, var343), var332, var191);
        }
        else if (module0709.NIL != var342) {
            f43280(var327, var342);
        }
        var340 = f43281(var330);
        SubLObject var344 = (SubLObject)module0709.NIL;
        var344 = var340.first();
        while (module0709.NIL != var340) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var328)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic407$, module0709.$ic241$ }), var344, var327);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43341((SubLObject)ConsesLow.list(module0709.$ic406$, var344, var327), var332, var191);
            var340 = var340.rest();
            var344 = var340.first();
        }
        if (!module0709.$ic408$.eql(module0205.f13276(var327))) {
            SubLObject var345 = f43196(var242, (SubLObject)module0709.$ic274$, (SubLObject)module0709.NIL);
            if (module0709.NIL != var345) {
                if (module0709.NIL != f43202(var345)) {
                    SubLObject var347;
                    final SubLObject var346 = var347 = var345.rest();
                    SubLObject var348 = (SubLObject)module0709.NIL;
                    SubLObject var349 = (SubLObject)module0709.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var347, var346, (SubLObject)module0709.$ic401$);
                    var348 = var347.first();
                    var347 = var347.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var347, var346, (SubLObject)module0709.$ic401$);
                    var349 = var347.first();
                    var347 = var347.rest();
                    if (module0709.NIL == var347) {
                        var331 = f43121(var348, var191, (SubLObject)module0709.UNPROVIDED);
                        var345 = var349;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var346, (SubLObject)module0709.$ic401$);
                    }
                }
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var328)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic409$, module0709.$ic241$ }), var345, var327);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                final SubLObject var350 = (SubLObject)ConsesLow.list(module0709.$ic408$, var327);
                final SubLObject var351 = module0172.f10921(var350);
                f43325(var350, var331, var345, var191);
                if (module0709.NIL == var351) {
                    f43341((SubLObject)ConsesLow.list(module0709.$ic365$, var350, f43221(var191)), module0709.$ic366$, var191);
                }
            }
        }
        var340 = f43196(var242, (SubLObject)module0709.$ic280$, (SubLObject)module0709.NIL);
        SubLObject var352 = (SubLObject)module0709.NIL;
        var352 = var340.first();
        while (module0709.NIL != var340) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var328)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic410$, module0709.$ic241$ }), var352, var327);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            final SubLObject var353 = f43316(var352, module0709.$ic394$, var191);
            final SubLObject var354 = module0035.sublisp_boolean(var353);
            if (module0709.NIL == var354) {
                Errors.warn((SubLObject)module0709.$ic411$, var352);
            }
            f43341((SubLObject)ConsesLow.list(module0709.$ic412$, var327, var353), var332, var191);
            var340 = var340.rest();
            var352 = var340.first();
        }
        var340 = f43196(var242, (SubLObject)module0709.$ic294$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var355 = (SubLObject)module0709.NIL;
        var355 = var340.first();
        while (module0709.NIL != var340) {
            SubLObject var357;
            final SubLObject var356 = var357 = var355;
            SubLObject var358 = (SubLObject)module0709.NIL;
            SubLObject var359 = (SubLObject)module0709.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var357, var356, (SubLObject)module0709.$ic413$);
            var358 = var357.first();
            var357 = var357.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var357, var356, (SubLObject)module0709.$ic413$);
            var359 = var357.first();
            var357 = var357.rest();
            if (module0709.NIL == var357) {
                final SubLObject var360 = f43316(var358, module0709.$ic394$, var191);
                final SubLObject var361 = module0202.f12768(var360, var327, var359);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var328)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic414$, module0709.$ic241$ }), var361);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43341(var361, var332, var191);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var356, (SubLObject)module0709.$ic413$);
            }
            var340 = var340.rest();
            var355 = var340.first();
        }
        return var333;
    }
    
    public static SubLObject f43340(final SubLObject var398, final SubLObject var191) {
        final SubLObject var399 = f43214(var191);
        return f43321(var398, module0709.$ic364$, var191, var399);
    }
    
    public static SubLObject f43345(final SubLObject var423, final SubLObject var191) {
        final SubLObject var424 = f43214(var191);
        return f43321(var423, module0709.$ic415$, var191, var424);
    }
    
    public static SubLObject f43346(final SubLObject var424, final SubLObject var180, final SubLObject var13) {
        return module0067.f4886(module0709.$g5564$.getGlobalValue(), (SubLObject)ConsesLow.list(var424, var180), var13);
    }
    
    public static SubLObject f43066() {
        return module0067.f4881(module0709.$g5564$.getGlobalValue());
    }
    
    public static SubLObject f43347(final SubLObject var424, final SubLObject var180) {
        final SubLObject var425 = (SubLObject)ConsesLow.list(var424, var180);
        SubLObject var426 = module0067.f4885(module0709.$g5564$.getGlobalValue(), var425, (SubLObject)module0709.NIL);
        if (module0709.NIL != module0205.f13145((SubLObject)module0709.$ic416$, var426, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            module0067.f4887(module0709.$g5564$.getGlobalValue(), (SubLObject)ConsesLow.list(var424, var180));
            var426 = (SubLObject)module0709.NIL;
        }
        return var426;
    }
    
    public static SubLObject f43321(final SubLObject var424, final SubLObject var164, final SubLObject var191, SubLObject var180) {
        if (var180 == module0709.UNPROVIDED) {
            var180 = f43214(var191);
        }
        final SubLThread var425 = SubLProcess.currentSubLThread();
        SubLObject var426 = (SubLObject)module0709.NIL;
        if (var424.isString() || module0709.NIL != f43202(var424)) {
            var426 = f43347(var424, var180);
            if (module0709.NIL == var426) {
                SubLObject var427 = var424;
                SubLObject var428 = var180;
                if (module0709.NIL != f43202(var424)) {
                    SubLObject var430;
                    final SubLObject var429 = var430 = var424.rest();
                    SubLObject var431 = (SubLObject)module0709.NIL;
                    SubLObject var432 = (SubLObject)module0709.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var430, var429, (SubLObject)module0709.$ic401$);
                    var431 = var430.first();
                    var430 = var430.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var430, var429, (SubLObject)module0709.$ic401$);
                    var432 = var430.first();
                    var430 = var430.rest();
                    if (module0709.NIL == var430) {
                        var428 = f43121(var431, var191, (SubLObject)module0709.UNPROVIDED);
                        var427 = var432;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var429, (SubLObject)module0709.$ic401$);
                    }
                }
                var426 = module0434.f30576((SubLObject)module0709.$ic417$, (SubLObject)ConsesLow.list(module0709.$ic9$, (SubLObject)module0709.$ic417$, var428, var427), module0709.$ic42$, (SubLObject)module0709.$ic238$).first();
                if (module0709.NIL == var426) {
                    final SubLObject var433 = f43326((SubLObject)module0709.$ic417$, var428, var427, var191);
                    var426 = module0434.f30576((SubLObject)module0709.$ic417$, var433, module0709.$ic42$, (SubLObject)module0709.$ic238$).first();
                }
                if (module0709.NIL != var426) {
                    f43346(var424, var180, var426);
                }
                else if (module0709.NIL != module0708.$g5533$.getDynamicValue(var425)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic418$, module0709.$ic241$ }), var424);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
            }
        }
        return var426;
    }
    
    public static SubLObject f43344(final SubLObject var244, final SubLObject var191) {
        SubLObject var245 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var244) {
            return (SubLObject)module0709.NIL;
        }
        if (module0709.NIL != f43199(var244)) {
            SubLObject var246 = (SubLObject)module0709.NIL;
            SubLObject var247 = f43205(var244);
            SubLObject var248 = (SubLObject)module0709.NIL;
            var248 = var247.first();
            while (module0709.NIL != var247) {
                var246 = (SubLObject)ConsesLow.cons(f43344(var248, var191), var246);
                var247 = var247.rest();
                var248 = var247.first();
            }
            var245 = f43310(var246, var191);
        }
        else if (module0709.NIL != f43200(var244)) {
            SubLObject var246 = (SubLObject)module0709.NIL;
            SubLObject var247 = f43206(var244);
            SubLObject var248 = (SubLObject)module0709.NIL;
            var248 = var247.first();
            while (module0709.NIL != var247) {
                final SubLObject var250;
                final SubLObject var249 = var250 = f43344(var248, var191);
                if (module0709.NIL != var250) {
                    var246 = (SubLObject)ConsesLow.cons(var250, var246);
                }
                var247 = var247.rest();
                var248 = var247.first();
            }
            if (module0709.NIL != module0035.f2013(var246)) {
                var245 = f43337(var246, var191);
            }
        }
        else if (module0709.NIL != f43201(var244)) {
            SubLObject var246 = (SubLObject)module0709.NIL;
            SubLObject var247 = f43207(var244);
            SubLObject var248 = (SubLObject)module0709.NIL;
            var248 = var247.first();
            while (module0709.NIL != var247) {
                var246 = (SubLObject)ConsesLow.cons(var248, var246);
                var247 = var247.rest();
                var248 = var247.first();
            }
            var245 = f43338(var246, var191);
        }
        else if (var244.isString()) {
            final SubLObject var251 = f43168(var244);
            var245 = f43308((SubLObject)ConsesLow.list(var251), var191);
        }
        else {
            var245 = f43309(var244, var191);
        }
        return var245;
    }
    
    public static SubLObject f43129(SubLObject var433) {
        if (var433 == module0709.UNPROVIDED) {
            var433 = module0709.$g5549$.getDynamicValue();
        }
        return f43348(module0709.$g5568$.getGlobalValue(), var433, (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43124() {
        final SubLObject var433 = (SubLObject)ConsesLow.list((SubLObject)module0709.NIL, module0055.f4017(), f43060());
        f43348(module0709.$g5567$.getGlobalValue(), var433, (SubLObject)module0709.NIL);
        module0709.$g5565$.setGlobalValue((SubLObject)ConsesLow.cons(var433, module0709.$g5565$.getGlobalValue()));
        f43128();
        return var433;
    }
    
    public static SubLObject f43349(final SubLObject var433) {
        return var433.first();
    }
    
    public static SubLObject f43350(final SubLObject var433, final SubLObject var25) {
        ConsesLow.set_nth((SubLObject)module0709.ZERO_INTEGER, var433, module0035.sublisp_boolean(var25));
        return var433;
    }
    
    public static SubLObject f43351(final SubLObject var433) {
        return f43349(var433);
    }
    
    public static SubLObject f43352(final SubLObject var433) {
        return conses_high.second(var433);
    }
    
    public static SubLObject f43353(final SubLObject var433) {
        return conses_high.third(var433);
    }
    
    public static SubLObject f43128() {
        if (module0709.NIL == Threads.valid_process_p(module0709.$g5566$.getGlobalValue())) {
            f43354();
        }
        return module0709.$g5566$.getGlobalValue();
    }
    
    public static SubLObject f43354() {
        module0709.$g5566$.setGlobalValue(f43355());
        return module0709.$g5566$.getGlobalValue();
    }
    
    public static SubLObject f43356(final SubLObject var167, SubLObject var433) {
        if (var433 == module0709.UNPROVIDED) {
            var433 = module0709.$g5549$.getDynamicValue();
        }
        final SubLObject var434 = f43352(var433);
        if (module0709.NIL == module0055.f4028(var167, var434, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED)) {
            f43348(var167, var433, (SubLObject)module0709.T);
        }
        return var167;
    }
    
    public static SubLObject f43357(final SubLObject var167, final SubLObject var433) {
        return f43348(var167, var433, (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43348(final SubLObject var167, final SubLObject var433, final SubLObject var435) {
        final SubLObject var436 = f43352(var433);
        module0055.f4021(var167, var436);
        if (module0709.NIL != var435) {
            f43350(var433, (SubLObject)module0709.T);
        }
        return var167;
    }
    
    public static SubLObject f43358() {
        if (module0709.NIL == module0067.f4852(module0709.$g5569$.getGlobalValue())) {
            module0709.$g5569$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED));
        }
        return module0709.$g5569$.getGlobalValue();
    }
    
    public static SubLObject f43296(final SubLObject var342, final SubLObject var25) {
        final SubLThread var343 = SubLProcess.currentSubLThread();
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var343) && var25.equal((SubLObject)ConsesLow.list((SubLObject)module0709.$ic321$, var342))) {
            Errors.error((SubLObject)module0709.$ic422$, var342, var25);
        }
        return module0067.f4886(f43358(), var342, var25);
    }
    
    public static SubLObject f43359(final SubLObject var342) {
        return module0067.f4885(f43358(), var342, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43148(final SubLObject var11, final SubLObject var399, final SubLObject var400, final SubLObject var380, final SubLObject var389, final SubLObject var436, final SubLObject var191) {
        final SubLThread var437 = SubLProcess.currentSubLThread();
        SubLObject var438 = (SubLObject)module0709.NIL;
        final SubLObject var439 = module0111.$g1405$.currentBinding(var437);
        try {
            module0111.$g1405$.bind((SubLObject)module0709.NIL, var437);
            module0574.f35153(f43220(var191));
            var438 = f43360(var11, var399, var400, var380, var389, var436);
        }
        finally {
            module0111.$g1405$.rebind(var439, var437);
        }
        return var438;
    }
    
    public static SubLObject f43360(final SubLObject var11, final SubLObject var399, final SubLObject var400, final SubLObject var380, final SubLObject var389, final SubLObject var436) {
        final SubLThread var437 = SubLProcess.currentSubLThread();
        SubLObject var438 = (SubLObject)module0709.NIL;
        SubLObject var439 = (SubLObject)module0709.NIL;
        SubLObject var440 = (SubLObject)module0709.NIL;
        final SubLObject var441 = module0147.f9540(var400);
        final SubLObject var442 = module0147.$g2095$.currentBinding(var437);
        final SubLObject var443 = module0147.$g2094$.currentBinding(var437);
        final SubLObject var444 = module0147.$g2096$.currentBinding(var437);
        try {
            module0147.$g2095$.bind(module0147.f9545(var441), var437);
            module0147.$g2094$.bind(module0147.f9546(var441), var437);
            module0147.$g2096$.bind(module0147.f9549(var441), var437);
            SubLObject var445 = var399;
            SubLObject var446 = (SubLObject)module0709.NIL;
            var446 = var445.first();
            while (module0709.NIL != var445) {
                final SubLObject var447 = (module0709.NIL != f43361(var446)) ? f43362(var446) : var446;
                if (var447.eql((SubLObject)module0709.$ic423$)) {
                    var439 = (SubLObject)ConsesLow.cons(var446, var439);
                }
                else if (module0709.NIL == module0269.f17713(var447, (SubLObject)module0709.UNPROVIDED)) {
                    var439 = (SubLObject)ConsesLow.cons(var447, var439);
                }
                else {
                    final SubLObject var448 = var447;
                    if (module0709.NIL == conses_high.member(var448, var438, Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
                        var438 = (SubLObject)ConsesLow.cons(var448, var438);
                    }
                }
                var445 = var445.rest();
                var446 = var445.first();
            }
        }
        finally {
            module0147.$g2096$.rebind(var444, var437);
            module0147.$g2094$.rebind(var443, var437);
            module0147.$g2095$.rebind(var442, var437);
        }
        var440 = f43324(var11, var438, var400, var380, var389, var436);
        assert module0709.NIL != module0128.f8449(var440) : var440;
        SubLObject var449 = var439;
        SubLObject var450 = (SubLObject)module0709.NIL;
        var450 = var449.first();
        while (module0709.NIL != var449) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var437)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic424$, module0709.$ic241$ }), new SubLObject[] { var440, var450, var450 });
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43341((SubLObject)ConsesLow.list(module0709.$ic397$, var440, var450), var400, (SubLObject)module0709.UNPROVIDED);
            var449 = var449.rest();
            var450 = var449.first();
        }
        return var440;
    }
    
    public static SubLObject f43324(SubLObject var11, final SubLObject var399, final SubLObject var400, final SubLObject var380, final SubLObject var389, final SubLObject var442) {
        SubLObject var443 = (SubLObject)module0709.NIL;
        SubLObject var444 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0038.f2611(var389)) {
            var11 = Sequences.cconcatenate(var11, var389);
        }
        if (module0709.NIL == var443) {
            var443 = f43363(var11, var399, var400, var380, var442);
        }
        if (module0709.NIL == var444) {
            SubLObject var445 = (SubLObject)module0709.$ic425$;
            SubLObject var446 = (SubLObject)module0709.NIL;
            var446 = var445.first();
            while (module0709.NIL == var444 && module0709.NIL != var445) {
                if (module0709.NIL != Sequences.find(var446, var399, (SubLObject)module0709.$ic395$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                    f43364(module0202.f12768(module0709.$ic397$, var443, var446), module0709.$ic93$);
                    var444 = (SubLObject)module0709.T;
                }
                var445 = var445.rest();
                var446 = var445.first();
            }
        }
        if (module0709.NIL == var444) {
            f43364(module0202.f12768(module0709.$ic397$, var443, module0709.$ic18$), module0709.$ic93$);
        }
        return var443;
    }
    
    public static SubLObject f43363(final SubLObject var11, final SubLObject var438, final SubLObject var400, final SubLObject var380, final SubLObject var442) {
        final SubLObject var443 = module0035.remove_if_not((SubLObject)module0709.$ic426$, (module0709.NIL != module0038.f2611(var380)) ? Sequences.cconcatenate(var380, new SubLObject[] { module0709.$ic427$, var11 }) : var11, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var444 = module0543.f33623((module0709.NIL != var442) ? module0038.f2812(var443) : module0038.f2815(var443), (SubLObject)module0709.UNPROVIDED);
        SubLObject var445 = var438;
        SubLObject var446 = (SubLObject)module0709.NIL;
        var446 = var445.first();
        while (module0709.NIL != var445) {
            f43364(module0202.f12768(module0709.$ic397$, var444, var446), var400);
            var445 = var445.rest();
            var446 = var445.first();
        }
        return var444;
    }
    
    public static SubLObject f43341(final SubLObject var447, final SubLObject var5, SubLObject var191) {
        if (var191 == module0709.UNPROVIDED) {
            var191 = module0709.$g5550$.getDynamicValue();
        }
        assert module0709.NIL != f43213(var191) : var191;
        if (module0709.NIL != module0205.f13145((SubLObject)module0709.$ic161$, var447, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED) || module0709.NIL == module0274.f18064(var447, var5, (SubLObject)module0709.UNPROVIDED)) {
            final SubLObject var448 = (SubLObject)ConsesLow.list((SubLObject)module0709.$ic428$, var447, var5, var191);
            f43356(var448, (SubLObject)module0709.UNPROVIDED);
        }
        else {
            f43155(var447, var5, var191);
        }
        return (SubLObject)module0709.T;
    }
    
    public static SubLObject f43355() {
        final SubLObject var449 = module0059.f4352((SubLObject)module0709.$ic429$, (SubLObject)module0709.$ic430$);
        return var449;
    }
    
    public static SubLObject f43365(final SubLObject var433) {
        return Types.sublisp_null(module0055.f4029((SubLObject)module0709.$ic431$, f43352(var433), (SubLObject)module0709.UNPROVIDED));
    }
    
    public static SubLObject f43130(SubLObject var433) {
        if (var433 == module0709.UNPROVIDED) {
            var433 = module0709.$g5549$.getDynamicValue();
        }
        final SubLThread var434 = SubLProcess.currentSubLThread();
        final SubLObject var435 = module0055.f4016(f43352(var433));
        final SubLObject var436 = PrintLow.format((SubLObject)module0709.NIL, (SubLObject)module0709.$ic432$, var435);
        f43282();
        if (var435.isPositive()) {
            final SubLObject var437 = module0012.$g75$.currentBinding(var434);
            final SubLObject var438 = module0012.$g76$.currentBinding(var434);
            final SubLObject var439 = module0012.$g77$.currentBinding(var434);
            final SubLObject var440 = module0012.$g78$.currentBinding(var434);
            try {
                module0012.$g75$.bind((SubLObject)module0709.ZERO_INTEGER, var434);
                module0012.$g76$.bind((SubLObject)module0709.NIL, var434);
                module0012.$g77$.bind((SubLObject)module0709.T, var434);
                module0012.$g78$.bind(Time.get_universal_time(), var434);
                module0012.f478(var436);
                while (module0709.NIL == f43365(var433)) {
                    final SubLObject var441 = Numbers.subtract(var435, module0055.f4016(f43352(var433)));
                    final SubLObject var442 = Numbers.divide(var441, var435);
                    module0012.note_percent_progress(var441, var435);
                    f43284(var442);
                    Threads.sleep((SubLObject)module0709.$ic433$);
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var440, var434);
                module0012.$g77$.rebind(var439, var434);
                module0012.$g76$.rebind(var438, var434);
                module0012.$g75$.rebind(var437, var434);
            }
        }
        f43285();
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43366() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        while (module0709.NIL == module0035.f2012(module0709.$g5565$.getGlobalValue())) {
            SubLObject var3 = conses_high.copy_list(module0709.$g5565$.getGlobalValue());
            SubLObject var4 = (SubLObject)module0709.NIL;
            var4 = var3.first();
            while (module0709.NIL != var3) {
                final SubLObject var5 = f43352(var4);
                final SubLObject var6 = module0709.$g5540$.currentBinding(var2);
                try {
                    module0709.$g5540$.bind(f43353(var4), var2);
                    final SubLObject var7 = module0055.f4023(var5);
                    final SubLObject var8 = module0055.f4028(module0709.$g5568$.getGlobalValue(), var5, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                    SubLObject var9 = (SubLObject)module0709.NIL;
                    if (var7.eql(module0709.$g5568$.getGlobalValue())) {
                        if (module0709.NIL != f43365(var4)) {
                            module0055.f4018(var5);
                            module0709.$g5565$.setGlobalValue(Sequences.remove(var4, module0709.$g5565$.getGlobalValue(), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED));
                        }
                    }
                    else if (var7.eql(module0709.$g5567$.getGlobalValue())) {
                        if (module0709.NIL != f43351(var4)) {
                            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic434$, module0709.$ic241$ }), module0055.f4016(var5));
                                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                            }
                            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                            f43350(var4, (SubLObject)module0709.NIL);
                        }
                        else if (module0709.NIL != f43365(var4)) {
                            if (module0709.NIL != module0035.f1997(module0709.$g5565$.getGlobalValue())) {
                                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic435$, module0709.$ic241$ }));
                                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                                }
                                Threads.sleep((SubLObject)module0709.FIVE_INTEGER);
                            }
                        }
                        else if (module0709.NIL != var8) {
                            final SubLObject var10 = module0035.remove_if_not((SubLObject)module0709.$ic431$, module0055.f4020(var5), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                            Errors.warn((SubLObject)module0709.$ic436$, Sequences.length(var10), var10);
                            SubLObject var10_455 = var10;
                            SubLObject var167_456 = (SubLObject)module0709.NIL;
                            var167_456 = var10_455.first();
                            while (module0709.NIL != var10_455) {
                                f43254(var167_456, (SubLObject)module0709.UNPROVIDED);
                                var10_455 = var10_455.rest();
                                var167_456 = var10_455.first();
                            }
                            module0055.f4018(var5);
                            module0709.$g5565$.setGlobalValue(Sequences.remove(var4, module0709.$g5565$.getGlobalValue(), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED));
                        }
                        else {
                            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic437$, module0709.$ic241$ }));
                                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                            }
                            Threads.sleep((SubLObject)module0709.FIVE_INTEGER);
                        }
                    }
                    else if (module0709.NIL != module0062.f4492(var7, (SubLObject)module0709.$ic438$)) {
                        final SubLObject var28_457 = module0709.$g5562$.currentBinding(var2);
                        try {
                            module0709.$g5562$.bind(var8, var2);
                            var9 = f43367(var7);
                        }
                        finally {
                            module0709.$g5562$.rebind(var28_457, var2);
                        }
                    }
                    if (module0709.NIL != var9) {
                        if (module0709.NIL == f43351(var4)) {
                            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic439$, module0709.$ic241$ }), var7);
                                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                            }
                            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                            f43350(var4, (SubLObject)module0709.T);
                        }
                    }
                    else {
                        f43357(var7, var4);
                    }
                }
                finally {
                    module0709.$g5540$.rebind(var6, var2);
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43254(final SubLObject var167, SubLObject var230) {
        if (var230 == module0709.UNPROVIDED) {
            var230 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var231 = SubLProcess.currentSubLThread();
        final SubLObject var232 = f43368(var167);
        if (module0709.NIL != module0709.$g5540$.getDynamicValue(var231)) {
            f43369(var167, var232);
        }
        else {
            print_high.princ(var232, var230);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43368(final SubLObject var167) {
        SubLObject var168 = (SubLObject)module0709.NIL;
        SubLObject var169 = (SubLObject)module0709.NIL;
        try {
            var169 = streams_high.make_private_string_output_stream();
            if (module0709.NIL != module0062.f4492(var167, (SubLObject)module0709.$ic438$)) {
                SubLObject var171;
                final SubLObject var170 = var171 = var167.rest();
                SubLObject var172 = (SubLObject)module0709.NIL;
                SubLObject var173 = (SubLObject)module0709.NIL;
                SubLObject var174 = (SubLObject)module0709.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0709.$ic440$);
                var172 = var171.first();
                var171 = var171.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0709.$ic440$);
                var173 = var171.first();
                var171 = var171.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)module0709.$ic440$);
                var174 = var171.first();
                var171 = var171.rest();
                if (module0709.NIL == var171) {
                    SubLObject var175 = module0205.f13183(var172, (SubLObject)module0709.$ic161$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                    SubLObject var176 = (SubLObject)module0709.NIL;
                    var176 = var175.first();
                    while (module0709.NIL != var175) {
                        if (module0709.$ic423$.eql(f43362(var176))) {
                            PrintLow.format(var169, (SubLObject)module0709.$ic441$, var176);
                        }
                        var175 = var175.rest();
                        var176 = var175.first();
                    }
                    final SubLObject var177 = module0205.f13147(var172, (SubLObject)module0709.$ic161$, (SubLObject)module0709.$ic442$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                    if (module0709.NIL == module0205.f13220((SubLObject)module0709.$ic423$, var177, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                        final SubLObject var178 = module0274.f18198(var177, var173, (SubLObject)module0709.UNPROVIDED);
                        if (module0709.NIL != var178) {
                            print_high.print(var178, var169);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var170, (SubLObject)module0709.$ic440$);
                }
            }
            else {
                PrintLow.format(var169, (SubLObject)module0709.$ic443$, var167);
            }
            var168 = streams_high.get_output_stream_string(var169);
        }
        finally {
            final SubLObject var179 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0709.T);
                streams_high.close(var169, (SubLObject)module0709.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var179);
            }
        }
        return var168;
    }
    
    public static SubLObject f43367(final SubLObject var167) {
        SubLObject var168 = (SubLObject)module0709.NIL;
        SubLObject var170;
        final SubLObject var169 = var170 = var167.rest();
        SubLObject var171 = (SubLObject)module0709.NIL;
        SubLObject var172 = (SubLObject)module0709.NIL;
        SubLObject var173 = (SubLObject)module0709.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var170, var169, (SubLObject)module0709.$ic440$);
        var171 = var170.first();
        var170 = var170.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var170, var169, (SubLObject)module0709.$ic440$);
        var172 = var170.first();
        var170 = var170.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var170, var169, (SubLObject)module0709.$ic440$);
        var173 = var170.first();
        var170 = var170.rest();
        if (module0709.NIL == var170) {
            SubLObject var174 = Types.sublisp_null(module0205.f13145((SubLObject)module0709.$ic161$, var171, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED));
            if (module0709.NIL == var174) {
                var171 = module0205.f13147(var171, (SubLObject)module0709.$ic161$, (SubLObject)module0709.$ic442$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                var174 = Types.sublisp_null(module0205.f13220((SubLObject)module0709.$ic423$, var171, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED));
            }
            if (module0709.NIL != var174) {
                var168 = f43155(var171, var172, var173);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var169, (SubLObject)module0709.$ic440$);
        }
        return var168;
    }
    
    public static SubLObject f43323(final SubLObject var241, final SubLObject var164, final SubLObject var180, final SubLObject var191) {
        return (SubLObject)ConsesLow.list((SubLObject)module0709.$ic444$, (SubLObject)module0709.$ic445$, var241, var164, var180, var191);
    }
    
    public static SubLObject f43370(final SubLObject var342, SubLObject var164) {
        if (var164 == module0709.UNPROVIDED) {
            var164 = (SubLObject)module0709.NIL;
        }
        final SubLThread var343 = SubLProcess.currentSubLThread();
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var343) && module0709.NIL == module0084.f5808(f43358(), var342)) {
            Errors.error((SubLObject)module0709.$ic446$, var342);
        }
        return (SubLObject)ConsesLow.list((SubLObject)module0709.$ic444$, (SubLObject)module0709.$ic321$, var342, var164);
    }
    
    public static SubLObject f43361(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)module0709.$ic447$);
    }
    
    public static SubLObject f43362(final SubLObject var461) {
        final SubLThread var462 = SubLProcess.currentSubLThread();
        SubLObject var463 = (SubLObject)module0709.$ic423$;
        final SubLObject var464 = conses_high.second(var461);
        if (var464.eql((SubLObject)module0709.$ic321$)) {
            final SubLObject var465 = module0067.f4885(f43358(), conses_high.third(var461), (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL != module0128.f8463(var465, (SubLObject)module0709.UNPROVIDED)) {
                var463 = var465;
            }
        }
        else if (var464.eql((SubLObject)module0709.$ic445$)) {
            SubLObject var467;
            final SubLObject var466 = var467 = Sequences.subseq(var461, (SubLObject)module0709.TWO_INTEGER, (SubLObject)module0709.UNPROVIDED);
            SubLObject var468 = (SubLObject)module0709.NIL;
            SubLObject var469 = (SubLObject)module0709.NIL;
            SubLObject var470 = (SubLObject)module0709.NIL;
            SubLObject var471 = (SubLObject)module0709.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)module0709.$ic448$);
            var468 = var467.first();
            var467 = var467.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)module0709.$ic448$);
            var469 = var467.first();
            var467 = var467.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)module0709.$ic448$);
            var470 = var467.first();
            var467 = var467.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)module0709.$ic448$);
            var471 = var467.first();
            var467 = var467.rest();
            if (module0709.NIL == var467) {
                if (module0709.NIL != f43200(var468)) {
                    var463 = f43371(var468, var469, var471, (SubLObject)module0709.T);
                }
                else if (module0709.NIL != f43199(var468)) {
                    var463 = f43372(var468, var469, var471, (SubLObject)module0709.T);
                }
                else {
                    final SubLObject var472 = (module0709.NIL != module0709.$g5562$.getDynamicValue(var462)) ? f43318(var468, var469, var470, var471, (SubLObject)module0709.T) : f43321(var468, var469, var471, var470);
                    if (module0709.NIL != var472) {
                        var463 = var472;
                        f43373(var461, var463);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var466, (SubLObject)module0709.$ic448$);
            }
        }
        return var463;
    }
    
    public static SubLObject f43070() {
        final SubLObject var193 = module0709.$g5570$.getGlobalValue();
        if (module0709.NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43374(final SubLObject var461, final SubLObject var13) {
        return module0034.f1829(module0709.$g5570$.getGlobalValue(), (SubLObject)ConsesLow.list(var461, var13), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43375(final SubLObject var461, final SubLObject var13) {
        final SubLThread var462 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var462)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic450$, module0709.$ic241$ }), var461, var13);
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43373(final SubLObject var461, final SubLObject var13) {
        SubLObject var462 = module0709.$g5570$.getGlobalValue();
        if (module0709.NIL == var462) {
            var462 = module0034.f1934((SubLObject)module0709.$ic449$, (SubLObject)module0709.$ic451$, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.TWO_INTEGER, (SubLObject)module0709.ZERO_INTEGER);
        }
        final SubLObject var463 = module0034.f1782(var461, var13);
        final SubLObject var464 = module0034.f1814(var462, var463, (SubLObject)module0709.UNPROVIDED);
        if (var464 != module0709.$ic15$) {
            SubLObject var465 = var464;
            SubLObject var466 = (SubLObject)module0709.NIL;
            var466 = var465.first();
            while (module0709.NIL != var465) {
                SubLObject var467 = var466.first();
                final SubLObject var468 = conses_high.second(var466);
                if (var461.equal(var467.first())) {
                    var467 = var467.rest();
                    if (module0709.NIL != var467 && module0709.NIL == var467.rest() && var13.equal(var467.first())) {
                        return module0034.f1959(var468);
                    }
                }
                var465 = var465.rest();
                var466 = var465.first();
            }
        }
        final SubLObject var469 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43375(var461, var13)));
        module0034.f1836(var462, var463, var464, var469, (SubLObject)ConsesLow.list(var461, var13));
        return module0034.f1959(var469);
    }
    
    public static SubLObject f43376(SubLObject var470, final SubLObject var5, final SubLObject var191) {
        final SubLThread var471 = SubLProcess.currentSubLThread();
        if (f43250(var191).equalp((SubLObject)module0709.$ic88$) && module0709.NIL != module0205.f13145((SubLObject)module0709.$ic453$, var470, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            final SubLObject var472 = module0205.f13147(var470, (SubLObject)module0709.$ic453$, (SubLObject)module0709.$ic454$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL == module0205.f13145((SubLObject)module0709.$ic453$, var472, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                var470 = var472;
            }
        }
        SubLObject var473 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0288.f19313(var470, var5)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var471)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic455$, module0709.$ic241$ }), var470, var5);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var473 = (SubLObject)module0709.T;
        }
        else {
            final SubLObject var474 = module0111.$g1405$.currentBinding(var471);
            try {
                module0111.$g1405$.bind((SubLObject)module0709.NIL, var471);
                module0574.f35153(f43220(var191));
                var471.resetMultipleValues();
                final SubLObject var475 = f43364(var470, var5);
                final SubLObject var476 = var471.secondMultipleValue();
                var471.resetMultipleValues();
                if (module0709.NIL != var475) {
                    var473 = (SubLObject)module0709.T;
                }
                else if (module0709.NIL != module0708.$g5533$.getDynamicValue(var471)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic456$, module0709.$ic241$ }), var476);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
            }
            finally {
                module0111.$g1405$.rebind(var474, var471);
            }
        }
        if (module0709.NIL != var473) {
            module0708.f43030(var470, var5, f43249(var191));
        }
        return var473;
    }
    
    public static SubLObject f43155(final SubLObject var470, final SubLObject var5, final SubLObject var191) {
        final SubLThread var471 = SubLProcess.currentSubLThread();
        final SubLObject var472 = module0034.$g879$.getDynamicValue(var471);
        SubLObject var473 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var472) {
            return f43376(var470, var5, var191);
        }
        var473 = module0034.f1857(var472, (SubLObject)module0709.$ic452$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var473) {
            var473 = module0034.f1807(module0034.f1842(var472), (SubLObject)module0709.$ic452$, (SubLObject)module0709.THREE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var472, (SubLObject)module0709.$ic452$, var473);
        }
        final SubLObject var474 = module0034.f1781(var470, var5, var191);
        final SubLObject var475 = module0034.f1814(var473, var474, (SubLObject)module0709.UNPROVIDED);
        if (var475 != module0709.$ic15$) {
            SubLObject var476 = var475;
            SubLObject var477 = (SubLObject)module0709.NIL;
            var477 = var476.first();
            while (module0709.NIL != var476) {
                SubLObject var478 = var477.first();
                final SubLObject var479 = conses_high.second(var477);
                if (var470.equal(var478.first())) {
                    var478 = var478.rest();
                    if (var5.equal(var478.first())) {
                        var478 = var478.rest();
                        if (module0709.NIL != var478 && module0709.NIL == var478.rest() && var191.equal(var478.first())) {
                            return module0034.f1959(var479);
                        }
                    }
                }
                var476 = var476.rest();
                var477 = var476.first();
            }
        }
        final SubLObject var480 = Values.arg2(var471.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43376(var470, var5, var191)));
        module0034.f1836(var473, var474, var475, var480, (SubLObject)ConsesLow.list(var470, var5, var191));
        return module0034.f1959(var480);
    }
    
    public static SubLObject f43364(final SubLObject var470, final SubLObject var5) {
        return Values.values(module0540.f33517(var470, var5, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43143(final SubLObject var474, final SubLObject var191, SubLObject var475) {
        if (var475 == module0709.UNPROVIDED) {
            var475 = (SubLObject)module0709.$ic457$;
        }
        final SubLThread var476 = SubLProcess.currentSubLThread();
        f43282();
        if (module0709.NIL != module0035.f2013(var474)) {
            final SubLObject var477 = Sequences.length(var474);
            final SubLObject var478 = Numbers.divide((SubLObject)module0709.ONE_INTEGER, var477);
            SubLObject var479 = (SubLObject)module0709.ZERO_INTEGER;
            module0012.$g82$.setDynamicValue(var475, var476);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var476);
            module0012.$g83$.setDynamicValue(Sequences.length(var474), var476);
            module0012.$g84$.setDynamicValue((SubLObject)module0709.ZERO_INTEGER, var476);
            final SubLObject var480 = module0012.$g75$.currentBinding(var476);
            final SubLObject var481 = module0012.$g76$.currentBinding(var476);
            final SubLObject var482 = module0012.$g77$.currentBinding(var476);
            final SubLObject var483 = module0012.$g78$.currentBinding(var476);
            try {
                module0012.$g75$.bind((SubLObject)module0709.ZERO_INTEGER, var476);
                module0012.$g76$.bind((SubLObject)module0709.NIL, var476);
                module0012.$g77$.bind((SubLObject)module0709.T, var476);
                module0012.$g78$.bind(Time.get_universal_time(), var476);
                module0012.f478(module0012.$g82$.getDynamicValue(var476));
                SubLObject var484 = var474;
                SubLObject var485 = (SubLObject)module0709.NIL;
                var485 = var484.first();
                while (module0709.NIL != var484) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var476), module0012.$g83$.getDynamicValue(var476));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var476), (SubLObject)module0709.ONE_INTEGER), var476);
                    if (module0709.NIL == f43377(var485, var191)) {
                        f43378(var485, var191);
                    }
                    var479 = Numbers.add(var479, var478);
                    f43284(var479);
                    var484 = var484.rest();
                    var485 = var484.first();
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var483, var476);
                module0012.$g77$.rebind(var482, var476);
                module0012.$g76$.rebind(var481, var476);
                module0012.$g75$.rebind(var480, var476);
            }
        }
        f43285();
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43377(final SubLObject var343, final SubLObject var191) {
        if (module0709.NIL == f43117(var343) && module0709.NIL != f43292(var343, (SubLObject)module0709.$ic321$, (SubLObject)module0709.UNPROVIDED)) {
            return (SubLObject)module0709.T;
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43378(final SubLObject var343, final SubLObject var191) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = f43117(var343);
        final SubLObject var346 = f43292(var343, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var347 = f43343(var343, var191);
        SubLObject var348 = (SubLObject)((module0709.NIL != var346) ? f43321(var346, var347.first(), var191, (SubLObject)module0709.UNPROVIDED) : module0709.NIL);
        final SubLObject var349 = f43166(var191);
        final SubLObject var350 = f43244(var191);
        if (module0709.NIL == module0173.f10955(var348)) {
            var348 = f43379(var343, var191);
        }
        if (module0709.NIL == module0173.f10955(var348) && module0709.NIL == var345) {
            if (module0709.NIL == module0709.$g5571$.getDynamicValue(var344)) {
                return (SubLObject)module0709.NIL;
            }
            final SubLObject var351 = Sequences.find_if((SubLObject)module0709.$ic345$, var347, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            final SubLObject var352 = (module0709.NIL != var351) ? var351 : module0709.$ic18$;
            var345 = Sequences.cconcatenate((SubLObject)module0709.$ic458$, module0166.f10743(var352));
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic459$, module0709.$ic241$ }), var345);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
        }
        SubLObject var353 = f43292(var343, (SubLObject)module0709.$ic262$, (SubLObject)module0709.NIL);
        SubLObject var354 = (SubLObject)module0709.NIL;
        var354 = var353.first();
        while (module0709.NIL != var353) {
            final SubLObject var355 = f43309(var354, var191);
            var347 = (SubLObject)ConsesLow.cons(var355, var347);
            var353 = var353.rest();
            var354 = var353.first();
        }
        if (module0709.NIL != module0173.f10955(var348)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic460$, module0709.$ic241$ }), var348);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var353 = var347;
            var354 = (SubLObject)module0709.NIL;
            var354 = var353.first();
            while (module0709.NIL != var353) {
                f43341((SubLObject)ConsesLow.list(module0709.$ic397$, var348, var354), var349, var191);
                var353 = var353.rest();
                var354 = var353.first();
            }
        }
        if (module0709.NIL == module0173.f10955(var348)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic461$, module0709.$ic241$ }), var343);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var348 = f43148(var345, var347, var349, (SubLObject)module0709.$ic94$, var350, (SubLObject)module0709.$ic95$, var191);
        }
        if (module0709.NIL == var348) {
            if (module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic462$, var345);
            }
        }
        else {
            f43380(var348, var349, var343, var191);
            module0708.f43038(var348, f43249(var191), f43156(var191));
        }
        return var348;
    }
    
    public static SubLObject f43379(final SubLObject var343, final SubLObject var191) {
        SubLObject var344 = (SubLObject)module0709.NIL;
        final SubLObject var345 = f43292(var343, (SubLObject)module0709.$ic286$, (SubLObject)module0709.NIL);
        final SubLObject var346 = f43292(var343, (SubLObject)module0709.$ic289$, (SubLObject)module0709.NIL);
        if (module0709.NIL != Guids.guid_string_p(var345)) {
            var344 = module0166.f10747(var345);
        }
        else if (module0709.NIL != module0213.f13915(var346)) {
            var344 = module0213.f13917(var346);
        }
        else if (module0709.NIL != module0213.f13913(var346)) {
            var344 = module0213.f13921(var346);
        }
        if (module0709.NIL == var344) {
            SubLObject var347;
            SubLObject var348;
            for (var347 = f43292(var343, (SubLObject)module0709.$ic463$, (SubLObject)module0709.NIL), var348 = (SubLObject)module0709.NIL, var348 = var347.first(); module0709.NIL == var344 && module0709.NIL != var347; var344 = f43309(var348, var191), var347 = var347.rest(), var348 = var347.first()) {}
        }
        if (module0709.NIL == var344) {
            final SubLObject var349 = f43292(var343, (SubLObject)module0709.$ic464$, (SubLObject)module0709.NIL);
            if (module0709.NIL != var349) {
                SubLObject var350 = (SubLObject)module0709.NIL;
                SubLObject var351 = var349;
                SubLObject var352 = (SubLObject)module0709.NIL;
                var352 = var351.first();
                while (module0709.NIL != var351) {
                    final SubLObject var353 = f43309(var352, var191);
                    var350 = (SubLObject)ConsesLow.cons(var353, var350);
                    var351 = var351.rest();
                    var352 = var351.first();
                }
                var344 = f43310(var350, var191);
            }
        }
        return var344;
    }
    
    public static SubLObject f43380(final SubLObject var13, final SubLObject var400, final SubLObject var343, final SubLObject var191) {
        final SubLThread var401 = SubLProcess.currentSubLThread();
        SubLObject var402 = f43292(var343, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var403 = f43137(var191);
        f43341((SubLObject)ConsesLow.list(module0709.$ic365$, var13, f43246(var191)), module0709.$ic366$, var191);
        if (module0709.NIL != f43202(var402)) {
            SubLObject var405;
            final SubLObject var404 = var405 = var402.rest();
            SubLObject var406 = (SubLObject)module0709.NIL;
            SubLObject var407 = (SubLObject)module0709.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var405, var404, (SubLObject)module0709.$ic401$);
            var406 = var405.first();
            var405 = var405.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var405, var404, (SubLObject)module0709.$ic401$);
            var407 = var405.first();
            var405 = var405.rest();
            if (module0709.NIL == var405) {
                var403 = f43121(var406, var191, (SubLObject)module0709.UNPROVIDED);
                var402 = var407;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var404, (SubLObject)module0709.$ic401$);
            }
        }
        if (var402.isString()) {
            f43325(var13, var403, var402, var191);
        }
        if (module0709.NIL != f43381(var343)) {
            f43341((SubLObject)ConsesLow.list(module0709.$ic114$, var13, f43381(var343)), var400, var191);
        }
        SubLObject var408 = f43382(var343);
        if (module0709.NIL != module0035.f2012(var408)) {
            var408 = (SubLObject)ConsesLow.cons(module0708.f43012((SubLObject)module0709.$ic465$), var408);
            module0708.f43038(module0709.$ic466$, f43249(var191), f43156(var191));
        }
        SubLObject var409 = var408;
        SubLObject var410 = (SubLObject)module0709.NIL;
        var410 = var409.first();
        while (module0709.NIL != var409) {
            if (module0709.NIL != f43204(var410)) {
                var410 = f43304(var410);
            }
            if (var410.isString() || module0709.NIL != f43199(var410) || module0709.NIL != f43202(var410)) {
                final SubLObject var411 = f43309(var410, var191);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic467$, module0709.$ic241$ }), var411, var13);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list(module0709.$ic468$, var13, var411), var400, var191);
            }
            else if (module0709.NIL != f43203(var410)) {
                f43383(var13, var410, var400, var191);
            }
            else if (module0709.NIL != module0062.f4492(var410, (SubLObject)module0709.$ic469$)) {
                final SubLObject var412 = conses_high.second(var410);
                final SubLObject var413 = f43309(var412, var191);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic470$, module0709.$ic241$ }), var413, var13);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list(module0709.$ic471$, var413, var13), var400, var191);
            }
            else {
                Errors.warn((SubLObject)module0709.$ic472$, var410);
            }
            var409 = var409.rest();
            var410 = var409.first();
        }
        SubLObject var414 = f43384(var343);
        SubLObject var415 = (SubLObject)module0709.NIL;
        var415 = var414.first();
        while (module0709.NIL != var414) {
            if (var415.isString() || module0709.NIL != f43199(var415) || module0709.NIL != f43202(var415)) {
                final SubLObject var416 = (SubLObject)((module0709.NIL != var415) ? f43309(var415, var191) : module0709.NIL);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic473$, module0709.$ic241$ }), var416, var13);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list(module0709.$ic471$, var13, var416), var400, var191);
            }
            else {
                Errors.warn((SubLObject)module0709.$ic474$, var415);
            }
            var414 = var414.rest();
            var415 = var414.first();
        }
        SubLObject var417;
        SubLObject var418;
        SubLObject var419;
        SubLObject var420;
        SubLObject var421;
        SubLObject var422;
        SubLObject var423;
        SubLObject var241_486;
        SubLObject var424;
        SubLObject var425;
        SubLObject var426;
        SubLObject var427;
        SubLObject var428;
        SubLObject var429;
        SubLObject var430;
        SubLObject var431;
        SubLObject var433;
        SubLObject var432;
        SubLObject var434;
        SubLObject var25_490;
        SubLObject var435;
        SubLObject var436;
        for (var417 = (SubLObject)module0709.NIL, var417 = f43385(var343); module0709.NIL != var417; var417 = conses_high.cddr(var417)) {
            var418 = var417.first();
            var419 = conses_high.cadr(var417);
            var420 = var418;
            if (!var420.eql((SubLObject)module0709.$ic156$) && !var420.eql((SubLObject)module0709.$ic262$) && !var420.eql((SubLObject)module0709.$ic286$)) {
                if (!var420.eql((SubLObject)module0709.$ic289$)) {
                    if (var420.eql((SubLObject)module0709.$ic267$)) {
                        var421 = var419;
                        var422 = (SubLObject)module0709.NIL;
                        var422 = var421.first();
                        while (module0709.NIL != var421) {
                            f43167(var13, var422, var191);
                            var421 = var421.rest();
                            var422 = var421.first();
                        }
                    }
                    else if (var420.eql((SubLObject)module0709.$ic463$)) {
                        var421 = var419;
                        var423 = (SubLObject)module0709.NIL;
                        var423 = var421.first();
                        while (module0709.NIL != var421) {
                            f43386(var13, var423, var400, var191);
                            var421 = var421.rest();
                            var423 = var421.first();
                        }
                    }
                    else if (var420.eql((SubLObject)module0709.$ic324$)) {
                        var241_486 = var419;
                        var424 = f43309(var241_486, var191);
                        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic470$, module0709.$ic241$ }), var424, var13);
                            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                        }
                        f43341((SubLObject)ConsesLow.list(module0709.$ic471$, var424, var13), var400, var191);
                    }
                    else if (var420.eql((SubLObject)module0709.$ic464$)) {
                        var425 = (SubLObject)module0709.NIL;
                        var426 = var419;
                        var427 = (SubLObject)module0709.NIL;
                        var427 = var426.first();
                        while (module0709.NIL != var426) {
                            var428 = f43309(var427, var191);
                            var425 = (SubLObject)ConsesLow.cons(var428, var425);
                            var426 = var426.rest();
                            var427 = var426.first();
                        }
                        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic475$, module0709.$ic241$ }), var13, var425);
                            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                        }
                        f43341((SubLObject)ConsesLow.list(module0709.$ic476$, var13, reader.bq_cons(module0709.$ic388$, var425)), var400, var191);
                    }
                    else if (var420.eql((SubLObject)module0709.$ic325$)) {
                        var425 = (SubLObject)module0709.NIL;
                        var426 = var419;
                        var427 = (SubLObject)module0709.NIL;
                        var427 = var426.first();
                        while (module0709.NIL != var426) {
                            var428 = f43309(var427, var191);
                            var425 = (SubLObject)ConsesLow.cons(var428, var425);
                            var426 = var426.rest();
                            var427 = var426.first();
                        }
                        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic477$, module0709.$ic241$ }), var13, var425);
                            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                        }
                        f43341((SubLObject)ConsesLow.list(module0709.$ic478$, var13, reader.bq_cons(module0709.$ic388$, var425)), var400, var191);
                    }
                    else if (var420.eql((SubLObject)module0709.$ic479$)) {
                        var429 = f43207(var419);
                        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic480$, module0709.$ic241$ }), var13, var429);
                            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                        }
                        var426 = var429;
                        var427 = (SubLObject)module0709.NIL;
                        var427 = var426.first();
                        while (module0709.NIL != var426) {
                            var430 = f43316(var427, var13, var191);
                            f43341((SubLObject)ConsesLow.list(module0709.$ic397$, var430, var13), var400, var191);
                            var426 = var426.rest();
                            var427 = var426.first();
                        }
                        f43341((SubLObject)ConsesLow.list(module0709.$ic481$, var13), var400, var191);
                    }
                    else if (var420.eql((SubLObject)module0709.$ic294$)) {
                        var421 = var419;
                        var431 = (SubLObject)module0709.NIL;
                        var431 = var421.first();
                        while (module0709.NIL != var421) {
                            var432 = (var433 = var431);
                            var434 = (SubLObject)module0709.NIL;
                            var25_490 = (SubLObject)module0709.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var433, var432, (SubLObject)module0709.$ic413$);
                            var434 = var433.first();
                            var433 = var433.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var433, var432, (SubLObject)module0709.$ic413$);
                            var25_490 = var433.first();
                            var433 = var433.rest();
                            if (module0709.NIL == var433) {
                                var435 = f43316(var434, module0709.$ic394$, var191);
                                var436 = module0202.f12768(var435, var13, var25_490);
                                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic414$, module0709.$ic241$ }), var436);
                                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                                }
                                f43341(var436, var400, var191);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var432, (SubLObject)module0709.$ic413$);
                            }
                            var421 = var421.rest();
                            var431 = var421.first();
                        }
                    }
                    else if (module0709.NIL != module0708.f43006()) {
                        Errors.warn((SubLObject)module0709.$ic482$, var418, var419);
                    }
                }
            }
        }
        return var13;
    }
    
    public static SubLObject f43167(final SubLObject var13, final SubLObject var25, final SubLObject var191) {
        SubLObject var192 = (SubLObject)module0709.NIL;
        SubLObject var193 = (SubLObject)module0709.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)module0709.$ic483$);
        var192 = var25.first();
        final SubLObject var194 = var193 = var25.rest();
        final SubLObject var195 = (SubLObject)((module0709.NIL != var193) ? module0434.f30578((SubLObject)module0709.$ic484$, (SubLObject)ConsesLow.listS(module0709.$ic485$, var193, (SubLObject)module0709.$ic486$), module0709.$ic42$, (SubLObject)module0709.$ic487$).first() : module0709.NIL);
        final SubLObject var196 = (module0709.NIL != var195) ? var195 : module0709.$ic488$;
        final SubLObject var197 = module0038.f2744(var192, Symbols.symbol_function((SubLObject)module0709.$ic359$));
        f43341((SubLObject)ConsesLow.list(module0709.$ic489$, var13, var197), var196, var191);
        return var192;
    }
    
    public static SubLObject f43386(final SubLObject var124, final SubLObject var241, final SubLObject var400, final SubLObject var191) {
        final SubLThread var401 = SubLProcess.currentSubLThread();
        final SubLObject var402 = f43309(var241, var191);
        if (!var402.equal(var124)) {
            if (module0709.NIL != var402) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic490$, module0709.$ic241$ }), var402, var124);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list(module0709.$ic491$, var402, var124), var400, var191);
            }
            else if (module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic492$, var241, var124);
            }
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43383(final SubLObject var124, final SubLObject var347, final SubLObject var400, final SubLObject var191) {
        final SubLObject var401 = f43387(var124, var347, var191);
        if (module0709.NIL != var401) {
            f43341(var401, var400, var191);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43387(final SubLObject var124, final SubLObject var347, final SubLObject var191) {
        final SubLThread var348 = SubLProcess.currentSubLThread();
        SubLObject var350;
        final SubLObject var349 = var350 = var347.rest();
        SubLObject var351 = (SubLObject)module0709.NIL;
        SubLObject var352 = (SubLObject)module0709.NIL;
        SubLObject var353 = (SubLObject)module0709.NIL;
        SubLObject var354 = (SubLObject)module0709.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var351 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var352 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var353 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var354 = var350.first();
        var350 = var350.rest();
        if (module0709.NIL == var350) {
            final SubLObject var355 = f43316(var351, module0709.$ic394$, var191);
            final SubLObject var356 = (module0709.NIL != module0173.f10955(var354)) ? var354 : f43316(var354, module0709.$ic350$, var191);
            final SubLObject var357 = f43279(var353, module0709.$ic18$, var191);
            SubLObject var358 = (SubLObject)module0709.NIL;
            if (module0709.NIL != f43202(var353) && module0709.NIL != module0708.$g5533$.getDynamicValue(var348)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic494$, module0709.$ic241$ }), var353, var357);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            if (module0709.NIL != f43204(var357) && module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic495$, var357);
            }
            if (module0709.NIL == var357) {
                Errors.warn((SubLObject)module0709.$ic496$, var352, var353);
            }
            else if (var352.equal(module0708.f43012((SubLObject)module0709.$ic497$))) {
                var358 = (SubLObject)ConsesLow.list(module0709.$ic498$, var355, var124, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)module0709.$ic499$))) {
                var358 = (SubLObject)ConsesLow.list(module0709.$ic500$, var355, var124, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)module0709.$ic501$))) {
                var358 = (SubLObject)ConsesLow.list(module0709.$ic502$, var355, var124, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)module0709.$ic503$)) && var353.eql((SubLObject)module0709.ONE_INTEGER) && var356.eql(module0709.$ic18$)) {
                var358 = (SubLObject)ConsesLow.list(module0709.$ic504$, var124, var355);
            }
            else if (var352.equal(module0708.f43012((SubLObject)module0709.$ic505$))) {
                var358 = (SubLObject)ConsesLow.list(module0709.$ic506$, var355, var124, var356, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)module0709.$ic503$))) {
                var358 = (SubLObject)ConsesLow.list(module0709.$ic507$, var355, var124, var356, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)module0709.$ic508$))) {
                var358 = (SubLObject)ConsesLow.list(module0709.$ic509$, var355, var124, var356, var357);
            }
            else {
                Errors.warn((SubLObject)module0709.$ic496$, var352, var353);
            }
            return var358;
        }
        cdestructuring_bind.cdestructuring_bind_error(var349, (SubLObject)module0709.$ic493$);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43388(final SubLObject var347, final SubLObject var191, SubLObject var75) {
        if (var75 == module0709.UNPROVIDED) {
            var75 = module0709.$ic18$;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        SubLObject var350;
        final SubLObject var349 = var350 = var347.rest();
        SubLObject var351 = (SubLObject)module0709.NIL;
        SubLObject var352 = (SubLObject)module0709.NIL;
        SubLObject var353 = (SubLObject)module0709.NIL;
        SubLObject var354 = (SubLObject)module0709.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var351 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var352 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var353 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)module0709.$ic493$);
        var354 = var350.first();
        var350 = var350.rest();
        if (module0709.NIL == var350) {
            final SubLObject var355 = f43316(var351, module0709.$ic394$, var191);
            final SubLObject var356 = (module0709.NIL != module0173.f10955(var354)) ? var354 : f43316(var354, module0709.$ic350$, var191);
            final SubLObject var357 = f43279(var353, module0709.$ic18$, var191);
            SubLObject var358 = (SubLObject)module0709.NIL;
            if (module0709.NIL != f43202(var353) && module0709.NIL != module0708.$g5533$.getDynamicValue(var348)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic494$, module0709.$ic241$ }), var353, var357);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            final SubLObject var359 = module0035.f2294(module0709.$g5572$.getGlobalValue(), var352, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL != var359) {
                var358 = module0205.f13252(var355, (SubLObject)module0709.$ic516$, module0205.f13252(var356, (SubLObject)module0709.$ic84$, module0205.f13252(var357, (SubLObject)module0709.$ic517$, module0205.f13252(var75, (SubLObject)module0709.$ic518$, var359, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            }
            else {
                Errors.sublisp_break((SubLObject)module0709.$ic519$, new SubLObject[] { var352, var353 });
            }
            return var358;
        }
        cdestructuring_bind.cdestructuring_bind_error(var349, (SubLObject)module0709.$ic493$);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43389(final SubLObject var347, final SubLObject var191, SubLObject var75) {
        if (var75 == module0709.UNPROVIDED) {
            var75 = module0709.$ic18$;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        final SubLObject var349 = f43388(var347, var191, var75);
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var348)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic521$, module0709.$ic241$ }), var349, var347);
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        return f43336(var349, var191);
    }
    
    public static SubLObject f43313(final SubLObject var347, final SubLObject var191, SubLObject var75) {
        if (var75 == module0709.UNPROVIDED) {
            var75 = module0709.$ic18$;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        final SubLObject var349 = module0034.$g879$.getDynamicValue(var348);
        SubLObject var350 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var349) {
            return f43389(var347, var191, var75);
        }
        var350 = module0034.f1857(var349, (SubLObject)module0709.$ic520$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var350) {
            var350 = module0034.f1807(module0034.f1842(var349), (SubLObject)module0709.$ic520$, (SubLObject)module0709.THREE_INTEGER, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.UNPROVIDED);
            module0034.f1860(var349, (SubLObject)module0709.$ic520$, var350);
        }
        final SubLObject var351 = module0034.f1781(var347, var191, var75);
        final SubLObject var352 = module0034.f1814(var350, var351, (SubLObject)module0709.UNPROVIDED);
        if (var352 != module0709.$ic15$) {
            SubLObject var353 = var352;
            SubLObject var354 = (SubLObject)module0709.NIL;
            var354 = var353.first();
            while (module0709.NIL != var353) {
                SubLObject var355 = var354.first();
                final SubLObject var356 = conses_high.second(var354);
                if (var347.equal(var355.first())) {
                    var355 = var355.rest();
                    if (var191.equal(var355.first())) {
                        var355 = var355.rest();
                        if (module0709.NIL != var355 && module0709.NIL == var355.rest() && var75.equal(var355.first())) {
                            return module0034.f1959(var356);
                        }
                    }
                }
                var353 = var353.rest();
                var354 = var353.first();
            }
        }
        final SubLObject var357 = Values.arg2(var348.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43389(var347, var191, var75)));
        module0034.f1836(var350, var351, var352, var357, (SubLObject)ConsesLow.list(var347, var191, var75));
        return module0034.f1959(var357);
    }
    
    public static SubLObject f43336(final SubLObject var502, final SubLObject var191) {
        final SubLThread var503 = SubLProcess.currentSubLThread();
        final SubLObject var504 = f43122(f43137(var191), (SubLObject)module0709.UNPROVIDED);
        f43341((SubLObject)ConsesLow.list(module0709.$ic365$, var502, var504), module0709.$ic366$, var191);
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var503)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic522$, module0709.$ic241$ }), (SubLObject)ConsesLow.list(module0709.$ic365$, var502, var504));
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        module0708.f43038(var502, f43249(var191), f43156(var191));
        return (SubLObject)((module0709.NIL != var502) ? module0285.f18875(var502, (SubLObject)module0709.UNPROVIDED) : module0709.NIL);
    }
    
    public static SubLObject f43304(final SubLObject var378) {
        assert module0709.NIL != f43204(var378) : var378;
        final SubLObject var379 = f43359(conses_high.second(var378));
        return (module0709.NIL != var379) ? var379 : var378;
    }
    
    public static SubLObject f43279(final SubLObject var378, final SubLObject var164, final SubLObject var191) {
        final SubLThread var379 = SubLProcess.currentSubLThread();
        SubLObject var380 = (SubLObject)module0709.NIL;
        final SubLObject var381 = module0709.$g5573$.currentBinding(var379);
        try {
            module0709.$g5573$.bind(module0048.f_1X(module0709.$g5573$.getDynamicValue(var379)), var379);
            if (module0709.$g5573$.getDynamicValue(var379).numG((SubLObject)module0709.TEN_INTEGER)) {
                Errors.warn((SubLObject)module0709.$ic524$, var378);
            }
            if (module0709.NIL != f43204(var378)) {
                var380 = f43390(var378, var164, var191);
            }
            else if (module0709.NIL != f43199(var378)) {
                var380 = f43372(var378, var164, var191, (SubLObject)module0709.UNPROVIDED);
            }
            else if (module0709.NIL != f43200(var378)) {
                var380 = f43371(var378, var164, var191, (SubLObject)module0709.UNPROVIDED);
            }
            else if (module0709.NIL != f43203(var378)) {
                var380 = f43313(var378, var191, (SubLObject)module0709.UNPROVIDED);
            }
            else if (module0709.NIL != f43201(var378)) {
                SubLObject var382 = (SubLObject)module0709.NIL;
                SubLObject var383 = f43207(var378);
                SubLObject var384 = (SubLObject)module0709.NIL;
                var384 = var383.first();
                while (module0709.NIL != var383) {
                    var382 = (SubLObject)ConsesLow.cons(f43279(var384, module0709.$ic18$, var191), var382);
                    var383 = var383.rest();
                    var384 = var383.first();
                }
                var380 = f43338(var382, var191);
            }
            else if (module0709.NIL != module0062.f4492(var378, (SubLObject)module0709.$ic525$)) {
                final SubLObject var385 = f43279(conses_high.second(var378), var164, var191);
                if (module0709.NIL != var385) {
                    var380 = (SubLObject)ConsesLow.list(module0709.$ic526$, module0709.$ic18$, var385);
                }
            }
            else if (var378.isString()) {
                var380 = f43316(var378, var164, var191);
            }
            else if (module0709.NIL != f43202(var378)) {
                var380 = f43316(var378, var164, var191);
            }
            else if (module0709.NIL != module0206.f13444(var378) && (module0709.NIL == module0202.f12590(var378) || module0709.NIL != module0205.f13145((SubLObject)module0709.$ic527$, var378, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED))) {
                var380 = var378;
            }
            else if (module0709.NIL != module0205.f13145((SubLObject)module0709.$ic161$, var378, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                var380 = var378;
            }
        }
        finally {
            module0709.$g5573$.rebind(var381, var379);
        }
        if (module0709.NIL == var380) {
            Errors.sublisp_break((SubLObject)module0709.$ic528$, new SubLObject[] { var164, var378 });
        }
        return var380;
    }
    
    public static SubLObject f43372(final SubLObject var378, final SubLObject var164, final SubLObject var191, SubLObject var506) {
        if (var506 == module0709.UNPROVIDED) {
            var506 = (SubLObject)module0709.NIL;
        }
        final SubLObject var507 = f43205(var378);
        SubLObject var508 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var506 && module0709.NIL != f43204(var507)) {
            var508 = f43323(var378, var164, (SubLObject)module0709.NIL, var191);
        }
        else if (module0709.NIL != f43204(var507)) {
            var508 = f43310(f43391(var507, var164, var191), var191);
        }
        else {
            SubLObject var509 = (SubLObject)module0709.NIL;
            SubLObject var510 = var507;
            SubLObject var511 = (SubLObject)module0709.NIL;
            var511 = var510.first();
            while (module0709.NIL != var510) {
                var509 = (SubLObject)ConsesLow.cons(f43279(var511, var164, var191), var509);
                var510 = var510.rest();
                var511 = var510.first();
            }
            var508 = f43310(var509, var191);
        }
        return var508;
    }
    
    public static SubLObject f43371(final SubLObject var378, final SubLObject var164, final SubLObject var191, SubLObject var506) {
        if (var506 == module0709.UNPROVIDED) {
            var506 = (SubLObject)module0709.NIL;
        }
        final SubLObject var507 = f43206(var378);
        SubLObject var508 = (SubLObject)module0709.NIL;
        if (module0709.NIL == var506 && module0709.NIL != f43204(var507)) {
            var508 = f43323(var378, var164, (SubLObject)module0709.NIL, var191);
        }
        else if (module0709.NIL != f43204(var507)) {
            var508 = f43337(f43391(var507, var164, var191), var191);
        }
        else {
            SubLObject var509 = (SubLObject)module0709.NIL;
            SubLObject var510 = Sequences.remove_if((SubLObject)module0709.$ic529$, var507, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            SubLObject var511 = (SubLObject)module0709.NIL;
            var511 = var510.first();
            while (module0709.NIL != var510) {
                var509 = (SubLObject)ConsesLow.cons(f43279(var511, var164, var191), var509);
                var510 = var510.rest();
                var511 = var510.first();
            }
            final SubLObject var512 = (module0709.NIL != module0035.f2013(var509)) ? var509.first() : module0709.$ic18$;
            SubLObject var513 = module0035.remove_if_not((SubLObject)module0709.$ic529$, var507, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            SubLObject var514 = (SubLObject)module0709.NIL;
            var514 = var513.first();
            while (module0709.NIL != var513) {
                var509 = (SubLObject)ConsesLow.cons(f43313(var514, var191, var512), var509);
                var513 = var513.rest();
                var514 = var513.first();
            }
            var508 = f43337(var509, var191);
        }
        return var508;
    }
    
    public static SubLObject f43391(final SubLObject var507, final SubLObject var164, final SubLObject var191) {
        assert module0709.NIL != f43204(var507) : var507;
        final SubLObject var508 = f43359(conses_high.second(var507));
        SubLObject var509 = (SubLObject)module0709.NIL;
        if (module0709.NIL != var508) {
            if (module0709.NIL != f43300(var508)) {
                SubLObject var511;
                final SubLObject var510 = var511 = var508;
                SubLObject var512 = (SubLObject)module0709.NIL;
                var512 = var511.first();
                while (module0709.NIL != var511) {
                    final SubLObject var513 = var512.isString() ? f43274(var512, var191) : f43293(var512, var191);
                    var509 = (SubLObject)ConsesLow.cons(f43279(var513, var164, var191), var509);
                    var511 = var511.rest();
                    var512 = var511.first();
                }
                var509 = Sequences.nreverse(var509);
            }
            else if (module0709.NIL != module0035.f2192((SubLObject)module0709.$ic159$, var508)) {
                SubLObject var514 = var508;
                SubLObject var515 = (SubLObject)module0709.NIL;
                var515 = var514.first();
                while (module0709.NIL != var514) {
                    var509 = (SubLObject)ConsesLow.cons(f43279(var515, var164, var191), var509);
                    var514 = var514.rest();
                    var515 = var514.first();
                }
                var509 = Sequences.nreverse(var509);
            }
        }
        if (module0709.NIL != var509) {
            f43296(conses_high.second(var507), var509);
        }
        return var509;
    }
    
    public static SubLObject f43390(final SubLObject var507, final SubLObject var164, final SubLObject var191) {
        assert module0709.NIL != f43204(var507) : var507;
        SubLObject var508 = f43359(conses_high.second(var507));
        SubLObject var509 = var507;
        if (module0709.NIL != module0205.f13145((SubLObject)module0709.$ic161$, var508, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            PrintLow.format((SubLObject)module0709.T, (SubLObject)module0709.$ic530$, var508);
            final SubLObject var510 = module0205.f13147(module0202.f12702(var508), (SubLObject)module0709.$ic161$, (SubLObject)module0709.$ic442$, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL == module0205.f13220((SubLObject)module0709.$ic423$, var510, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                var508 = var510;
            }
            PrintLow.format((SubLObject)module0709.T, (SubLObject)module0709.$ic531$, var508);
        }
        if (module0709.NIL != var508) {
            if (module0709.NIL != module0206.f13444(var508) && module0709.NIL != module0205.f13145((SubLObject)module0709.$ic345$, var508, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED) && module0709.NIL == module0205.f13145((SubLObject)module0709.$ic346$, var508, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
                var509 = var508;
            }
            else if (module0709.NIL != f43197(var508)) {
                final SubLObject var511 = f43279(var508, var164, var191);
                if (module0709.NIL != var511) {
                    PrintLow.format((SubLObject)module0709.T, (SubLObject)module0709.$ic450$, var507, var511);
                    var509 = var511;
                    f43296(conses_high.second(var507), var509);
                }
            }
            else {
                Errors.warn((SubLObject)module0709.$ic532$, var508);
            }
        }
        return var509;
    }
    
    public static SubLObject f43392(final SubLObject var229, final SubLObject var230) {
        f43393(var229, var230, (SubLObject)module0709.ZERO_INTEGER);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43110(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47098_native.class) ? module0709.T : module0709.NIL);
    }
    
    public static SubLObject f43394(final SubLObject var229) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43395(final SubLObject var229) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43396(final SubLObject var229) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43397(final SubLObject var229) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43398(final SubLObject var229) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43399(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43400(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43401(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43402(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43403(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43110(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43404(SubLObject var233) {
        if (var233 == module0709.UNPROVIDED) {
            var233 = (SubLObject)module0709.NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47098_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)module0709.NIL, var235 = var233; module0709.NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)module0709.$ic144$)) {
                f43399(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic145$)) {
                f43400(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic551$)) {
                f43401(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic552$)) {
                f43402(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic148$)) {
                f43403(var234, var237);
            }
            else {
                Errors.error((SubLObject)module0709.$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43405(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic150$, (SubLObject)module0709.$ic553$, (SubLObject)module0709.FIVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic144$, f43394(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic145$, f43395(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic551$, f43396(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic552$, f43397(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic148$, f43398(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic153$, (SubLObject)module0709.$ic553$, (SubLObject)module0709.FIVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43406(final SubLObject var238, final SubLObject var239) {
        return f43405(var238, var239);
    }
    
    public static SubLObject f43393(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        PrintLow.format(var230, (SubLObject)module0709.$ic555$, f43394(var240));
        return var240;
    }
    
    public static SubLObject f43407(final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        SubLObject var175 = (SubLObject)module0709.NIL;
        if (module0709.NIL != var173 && module0709.NIL != module0107.f7629(module0709.$g5548$.getDynamicValue(var174)) && module0709.NIL == var175) {
            SubLObject var176;
            SubLObject var177;
            for (var176 = (SubLObject)module0709.$ic556$, var177 = (SubLObject)module0709.NIL, var177 = var176.first(); module0709.NIL == var175 && module0709.NIL != var176; var175 = f43113(var173, var177), var176 = var176.rest(), var177 = var176.first()) {}
        }
        return (module0709.NIL != var175) ? var175 : f43408(var173, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43408(SubLObject var173, SubLObject var222) {
        if (var173 == module0709.UNPROVIDED) {
            var173 = (SubLObject)module0709.NIL;
        }
        if (var222 == module0709.UNPROVIDED) {
            var222 = (SubLObject)module0709.NIL;
        }
        final SubLObject var223 = f43404((SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL != var173) {
            f43409(var223, var173);
        }
        f43410(var223, var222);
        f43403(var223, (SubLObject)module0709.NIL);
        return var223;
    }
    
    public static SubLObject f43117(final SubLObject var343) {
        assert module0709.NIL != f43110(var343) : var343;
        return f43394(var343);
    }
    
    public static SubLObject f43381(final SubLObject var343) {
        assert module0709.NIL != f43110(var343) : var343;
        return f43395(var343);
    }
    
    public static SubLObject f43382(final SubLObject var343) {
        assert module0709.NIL != f43110(var343) : var343;
        return f43396(var343);
    }
    
    public static SubLObject f43384(final SubLObject var343) {
        assert module0709.NIL != f43110(var343) : var343;
        return f43397(var343);
    }
    
    public static SubLObject f43385(final SubLObject var343) {
        assert module0709.NIL != f43110(var343) : var343;
        return f43398(var343);
    }
    
    public static SubLObject f43292(final SubLObject var343, final SubLObject var245, SubLObject var246) {
        if (var246 == module0709.UNPROVIDED) {
            var246 = (SubLObject)module0709.NIL;
        }
        return conses_high.getf(f43398(var343), var245, var246);
    }
    
    public static SubLObject f43118(final SubLObject var343, SubLObject var246) {
        if (var246 == module0709.UNPROVIDED) {
            var246 = (SubLObject)module0709.NIL;
        }
        return f43292(var343, (SubLObject)module0709.$ic156$, var246);
    }
    
    public static SubLObject f43409(final SubLObject var343, final SubLObject var11) {
        assert module0709.NIL != f43110(var343) : var343;
        assert module0709.NIL != Types.stringp(var11) : var11;
        f43399(var343, var11);
        return f43394(var343);
    }
    
    public static SubLObject f43410(final SubLObject var343, final SubLObject var222) {
        assert module0709.NIL != f43110(var343) : var343;
        if (module0709.NIL != var222 && !module0709.areAssertionsDisabledFor(me) && module0709.NIL == Types.stringp(var222)) {
            throw new AssertionError(var222);
        }
        f43400(var343, var222);
        return f43395(var343);
    }
    
    public static SubLObject f43411(final SubLObject var343, final SubLObject var514) {
        assert module0709.NIL != f43110(var343) : var343;
        assert module0709.NIL != f43197(var514) : var514;
        if (module0709.NIL == conses_high.member(var514, f43396(var343), Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
            f43401(var343, (SubLObject)ConsesLow.cons(var514, f43396(var343)));
        }
        return f43396(var343);
    }
    
    public static SubLObject f43412(final SubLObject var343, final SubLObject var483) {
        assert module0709.NIL != f43110(var343) : var343;
        assert module0709.NIL != f43197(var483) : var483;
        if (module0709.NIL == conses_high.member(var483, f43397(var343), Symbols.symbol_function((SubLObject)module0709.EQUAL), Symbols.symbol_function((SubLObject)module0709.IDENTITY))) {
            f43402(var343, (SubLObject)ConsesLow.cons(var483, f43397(var343)));
        }
        return f43397(var343);
    }
    
    public static SubLObject f43413(final SubLObject var343, final SubLObject var245, final SubLObject var25) {
        f43403(var343, conses_high.putf(f43398(var343), var245, var25));
        return f43398(var343);
    }
    
    public static SubLObject f43414(final SubLObject var343, final SubLObject var245, final SubLObject var25) {
        assert module0709.NIL != f43110(var343) : var343;
        final SubLObject var344 = conses_high.getf(f43398(var343), var245, (SubLObject)module0709.NIL);
        final SubLObject var345 = (SubLObject)((module0709.NIL != Sequences.find(var25, var344, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) ? var344 : ConsesLow.cons(var25, var344));
        f43413(var343, var245, var345);
        return f43398(var343);
    }
    
    public static SubLObject f43198(final SubLObject var245) {
        if (var245.eql((SubLObject)module0709.$ic262$) || var245.eql((SubLObject)module0709.$ic267$) || var245.eql((SubLObject)module0709.$ic463$) || var245.eql((SubLObject)module0709.$ic294$) || var245.eql((SubLObject)module0709.$ic464$) || var245.eql((SubLObject)module0709.$ic325$)) {
            return (SubLObject)module0709.T;
        }
        if (var245.eql((SubLObject)module0709.$ic321$) || var245.eql((SubLObject)module0709.$ic156$) || var245.eql((SubLObject)module0709.$ic323$) || var245.eql((SubLObject)module0709.$ic479$) || var245.eql((SubLObject)module0709.$ic286$) || var245.eql((SubLObject)module0709.$ic289$)) {
            return (SubLObject)module0709.NIL;
        }
        if (var245.eql((SubLObject)module0709.$ic277$) || var245.eql((SubLObject)module0709.$ic274$)) {
            return (SubLObject)module0709.NIL;
        }
        Errors.sublisp_break((SubLObject)module0709.$ic557$, new SubLObject[] { var245 });
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43111(final SubLObject var171, final SubLObject var172) {
        final SubLObject var173 = f43117(var171);
        if (var173.isString()) {
            f43409(var172, var173);
        }
        f43410(var172, f43381(var171));
        SubLObject var174 = f43382(var171);
        SubLObject var175 = (SubLObject)module0709.NIL;
        var175 = var174.first();
        while (module0709.NIL != var174) {
            f43411(var172, var175);
            var174 = var174.rest();
            var175 = var174.first();
        }
        var174 = f43384(var171);
        SubLObject var176 = (SubLObject)module0709.NIL;
        var176 = var174.first();
        while (module0709.NIL != var174) {
            f43412(var172, var176);
            var174 = var174.rest();
            var176 = var174.first();
        }
        SubLObject var177;
        SubLObject var178;
        SubLObject var179;
        SubLObject var180;
        SubLObject var181;
        for (var177 = (SubLObject)module0709.NIL, var177 = f43385(var171); module0709.NIL != var177; var177 = conses_high.cddr(var177)) {
            var178 = var177.first();
            var179 = conses_high.cadr(var177);
            var180 = f43292(var172, var178, (SubLObject)module0709.UNPROVIDED);
            var181 = ((module0709.NIL != f43198(var178)) ? conses_high.union(var179, var180, Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED) : var179);
            f43413(var172, var178, var181);
        }
        return var172;
    }
    
    public static SubLObject f43415(final SubLObject var240) {
        return f43416(var240);
    }
    
    public static SubLObject f43416(final SubLObject var343) {
        return Sxhash.sxhash(f43394(var343));
    }
    
    public static SubLObject f43141(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        final SubLObject var300 = module0709.$g5547$.currentBinding(var299);
        try {
            module0709.$g5547$.bind((SubLObject)module0709.$ic559$, var299);
            SubLObject var302;
            for (SubLObject var301 = var298; module0709.NIL != var301; var302 = (var301 = f43417(var301, var191))) {}
        }
        finally {
            module0709.$g5547$.rebind(var300, var299);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43417(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        SubLObject var302 = (SubLObject)module0709.NIL;
        while (module0709.NIL == var302 && module0709.NIL == module0035.f2012(var300)) {
            if (module0709.NIL != module0590.f36071(var301, module0699.f42535((SubLObject)module0709.$ic316$))) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic560$, module0709.$ic241$ }), var301);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                final SubLObject var303 = module0590.f36089(var301, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
                if (module0709.NIL != var303 && module0709.NIL != module0590.f36071(conses_high.second(var300), module0699.f42535((SubLObject)module0709.$ic329$))) {
                    final SubLObject var304 = f43297(var300.rest(), var191);
                    f43296(var303, var304);
                    var302 = (SubLObject)module0709.T;
                }
                else if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic561$, module0709.$ic241$ }));
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var300 = module0590.f36068(var300);
            }
            else if (module0709.NIL != module0590.f36071(var301, module0708.f43012((SubLObject)module0709.$ic317$))) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic562$, module0709.$ic241$ }), var301);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                final SubLObject var303 = module0590.f36089(var301, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
                if (module0709.NIL != var303) {
                    f43418(var300, var191);
                    var302 = (SubLObject)module0709.T;
                }
                else if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic563$, module0709.$ic241$ }));
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var300 = module0590.f36068(var300);
            }
            else if (module0709.NIL != module0590.f36071(var301, module0699.f42535((SubLObject)module0709.$ic101$)) && module0709.NIL != module0590.f36040(var301)) {
                var300 = module0590.f36061(var300, f43264(var300));
            }
            else if (module0709.NIL != f43270(var301) && module0709.NIL != module0590.f36089(var301, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED)) {
                PrintLow.format((SubLObject)module0709.T, (SubLObject)module0709.$ic564$, var301);
                f43286(var300, var191);
                var300 = module0590.f36068(var300);
            }
            else if (module0709.NIL != module0590.f36040(var301)) {
                var300 = module0590.f36068(var300);
            }
            else {
                final SubLObject var305 = f43264(var300);
                var300 = (SubLObject)((module0709.NIL != var305) ? module0590.f36061(var300, var305) : module0709.NIL);
            }
            var301 = (SubLObject)((module0709.NIL != module0035.f2013(var300)) ? var300.first() : module0709.NIL);
        }
        return var300;
    }
    
    public static SubLObject f43142(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        final SubLObject var300 = module0709.$g5547$.currentBinding(var299);
        try {
            module0709.$g5547$.bind((SubLObject)module0709.$ic84$, var299);
            SubLObject var302;
            for (SubLObject var301 = var298; module0709.NIL != var301; var302 = (var301 = f43291(var301, var191))) {}
        }
        finally {
            module0709.$g5547$.rebind(var300, var299);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43291(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        SubLObject var302 = (SubLObject)module0709.NIL;
        SubLObject var303 = (SubLObject)module0709.NIL;
        while (module0709.NIL == var303 && module0709.NIL == module0035.f2012(var300)) {
            var299.resetMultipleValues();
            final SubLObject var304 = f43419(var301, var302, var191, var300);
            final SubLObject var305 = var299.secondMultipleValue();
            final SubLObject var306 = var299.thirdMultipleValue();
            var299.resetMultipleValues();
            if (!var302.eql(var304)) {
                var302 = var304;
            }
            if (module0709.NIL != var306) {
                if (module0709.NIL == var302) {
                    if (module0709.NIL != module0708.f43006()) {
                        Errors.warn((SubLObject)module0709.$ic565$);
                    }
                }
                else if (module0709.NIL != module0035.f2012(f43382(var302)) && module0709.NIL != module0035.f2012(f43292(var302, (SubLObject)module0709.$ic325$, (SubLObject)module0709.UNPROVIDED)) && module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic566$, module0709.$ic241$ }), var302);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                if (module0709.NIL != var302 && module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic567$, module0709.$ic241$ }), new SubLObject[] { var302, f43382(var302), f43384(var302), f43292(var302, (SubLObject)module0709.$ic262$, (SubLObject)module0709.UNPROVIDED) });
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                if (module0709.NIL != var302) {
                    f43104(var302, (SubLObject)module0709.$ic84$);
                }
                var303 = (SubLObject)module0709.T;
            }
            if (module0709.NIL != module0004.f105(var305)) {
                var300 = module0590.f36061(var300, var305);
            }
            else if (var305.isString()) {
                var300 = module0590.f36061(module0590.f36062(var300, var305, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED);
            }
            else if (var305.eql((SubLObject)module0709.$ic248$)) {
                var300 = module0590.f36068(var300);
            }
            else {
                final SubLObject var307 = f43264(var300);
                var300 = (SubLObject)((module0709.NIL != var307) ? module0590.f36061(var300, var307) : module0709.NIL);
            }
            var301 = (SubLObject)((module0709.NIL != module0035.f2013(var300)) ? var300.first() : module0709.NIL);
        }
        return Values.values(var300, var302);
    }
    
    public static SubLObject f43419(final SubLObject var299, final SubLObject var343, final SubLObject var191, final SubLObject var194) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = var343;
        SubLObject var346 = (SubLObject)module0709.NIL;
        SubLObject var347 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0590.f36056(var299, (SubLObject)module0709.$ic258$)) {
            final SubLObject var348 = module0590.f36058(var194, (SubLObject)module0709.$ic259$, (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var344) && !var348.isInteger()) {
                Errors.error((SubLObject)module0709.$ic260$, module0035.f2124((SubLObject)module0709.TEN_INTEGER, var194));
            }
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic568$, module0709.$ic241$ }), module0035.f2124(module0048.f_1X(var348), var194));
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var346 = module0048.f_1X(var348);
        }
        else if (module0709.NIL != f43270(var299) && module0709.NIL != module0590.f36042(var299)) {
            var347 = (SubLObject)module0709.T;
            var346 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != f43270(var299)) {
            SubLObject var349 = (SubLObject)module0709.NIL;
            SubLObject var350 = (SubLObject)module0709.NIL;
            if (module0709.NIL == module0035.f2012(module0590.f36044(var299).rest())) {
                var344.resetMultipleValues();
                final SubLObject var518_519 = f43272(var299, var191);
                final SubLObject var520_521 = var344.secondMultipleValue();
                var344.resetMultipleValues();
                var349 = var518_519;
                var350 = var520_521;
            }
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic569$, module0709.$ic241$ }), var349);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var345 = f43407(var350);
            final SubLObject var351 = module0590.f36041(var299);
            f43414(var345, (SubLObject)module0709.$ic262$, var351);
            final SubLObject var352 = module0590.f36089(var299, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL != var352) {
                f43413(var345, (SubLObject)module0709.$ic321$, var352);
            }
            if (module0709.NIL != var350) {
                f43409(var345, var350);
            }
            if (module0709.NIL != var349) {
                f43413(var345, (SubLObject)module0709.$ic156$, var349);
            }
            if (module0709.NIL != module0590.f36072(var299)) {
                var347 = (SubLObject)module0709.T;
            }
            var346 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != f43268(var299)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic570$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var346 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL == var343) {
            var346 = f43271(var299);
        }
        else {
            var346 = f43420(var345, var194, var191);
        }
        return Values.values(var345, var346, var347);
    }
    
    public static SubLObject f43146(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        final SubLObject var300 = module0709.$g5547$.currentBinding(var299);
        try {
            module0709.$g5547$.bind((SubLObject)module0709.$ic86$, var299);
            for (SubLObject var301 = var298; module0709.NIL != var301; var301 = f43298(var301, var191)) {}
        }
        finally {
            module0709.$g5547$.rebind(var300, var299);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43298(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        SubLObject var302 = (SubLObject)module0709.NIL;
        SubLObject var303 = (SubLObject)module0709.NIL;
        while (module0709.NIL == var303 && module0709.NIL == module0035.f2012(var300)) {
            var299.resetMultipleValues();
            final SubLObject var304 = f43421(var301, var302, var191, var300);
            final SubLObject var305 = var299.secondMultipleValue();
            final SubLObject var306 = var299.thirdMultipleValue();
            var299.resetMultipleValues();
            if (!var302.eql(var304)) {
                var302 = var304;
            }
            if (module0709.NIL != var306) {
                if (module0709.NIL == var302 && module0709.NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)module0709.$ic571$);
                }
                if (module0709.NIL != var302) {
                    f43104(var302, (SubLObject)module0709.$ic86$);
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic572$, module0709.$ic241$ }), var302);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                }
                var303 = (SubLObject)module0709.T;
            }
            if (module0709.NIL != module0004.f105(var305)) {
                var300 = module0590.f36061(var300, var305);
            }
            else if (var305.isString()) {
                var300 = module0590.f36061(module0590.f36062(var300, var305, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED);
            }
            else if (var305.eql((SubLObject)module0709.$ic248$)) {
                var300 = module0590.f36068(var300);
            }
            else {
                final SubLObject var307 = f43264(var300);
                var300 = (SubLObject)((module0709.NIL != var307) ? module0590.f36061(var300, var307) : module0709.NIL);
            }
            var301 = (SubLObject)((module0709.NIL != module0035.f2013(var300)) ? var300.first() : module0709.NIL);
        }
        return Values.values(var300, var302);
    }
    
    public static SubLObject f43421(final SubLObject var299, final SubLObject var343, final SubLObject var191, final SubLObject var194) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = var343;
        SubLObject var346 = (SubLObject)module0709.NIL;
        final SubLObject var347 = f43422(var299, var191);
        SubLObject var348 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0590.f36035(var299)) {
            final SubLObject var349 = module0590.f36058(var194, (SubLObject)module0709.$ic259$, (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var344) && !var349.isInteger()) {
                Errors.error((SubLObject)module0709.$ic260$, module0035.f2124((SubLObject)module0709.TEN_INTEGER, var194));
            }
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic568$, module0709.$ic241$ }), module0035.f2124(module0048.f_1X(var349), var194));
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var346 = module0048.f_1X(var349);
        }
        else if (module0709.NIL != var347 && module0709.NIL != module0590.f36042(var299)) {
            var348 = (SubLObject)module0709.T;
            var346 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL == var343 && module0709.NIL != var347) {
            SubLObject var350 = (SubLObject)module0709.NIL;
            SubLObject var351 = (SubLObject)module0709.NIL;
            if (module0709.NIL == module0035.f2012(module0590.f36044(var299).rest())) {
                var344.resetMultipleValues();
                final SubLObject var523_524 = f43272(var299, var191);
                final SubLObject var525_526 = var344.secondMultipleValue();
                var344.resetMultipleValues();
                var350 = var523_524;
                var351 = var525_526;
            }
            var345 = f43407(var351);
            if (module0709.NIL == module0590.f36071(var299, module0699.f42535((SubLObject)module0709.$ic316$))) {
                final SubLObject var352 = module0590.f36041(var299);
                f43414(var345, (SubLObject)module0709.$ic262$, var352);
            }
            if (module0709.NIL != var351) {
                f43409(var345, var351);
            }
            if (module0709.NIL != var350) {
                f43413(var345, (SubLObject)module0709.$ic156$, var350);
            }
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic573$, module0709.$ic241$ }), var345, module0590.f36041(var299));
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            if (module0709.NIL != module0590.f36072(var299)) {
                var348 = (SubLObject)module0709.T;
            }
            var346 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != f43268(var299)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic570$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var346 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != f43270(var299)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic570$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var346 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42535((SubLObject)module0709.$ic316$))) {
            final SubLObject var353 = module0590.f36089(var299, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL != var353 && module0709.NIL != module0590.f36071(conses_high.second(var194), module0699.f42535((SubLObject)module0709.$ic329$))) {
                final SubLObject var354 = f43297(var194.rest(), var191);
                f43296(var353, var354);
            }
            else if (module0709.NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic561$, module0709.$ic241$ }));
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var346 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL == var343) {
            var346 = f43271(var299);
        }
        else {
            var346 = f43420(var345, var194, var191);
        }
        return Values.values(var345, var346, var348);
    }
    
    public static SubLObject f43422(final SubLObject var204, final SubLObject var191) {
        final SubLObject var205 = (SubLObject)SubLObjectFactory.makeBoolean(module0709.NIL != module0590.f36031(var204) && module0709.NIL == f43423(var204, var191));
        return var205;
    }
    
    public static SubLObject f43423(final SubLObject var204, final SubLObject var191) {
        if (module0709.NIL != f43270(var204)) {
            return (SubLObject)module0709.T;
        }
        if (module0709.NIL != module0590.f36071(var204, (SubLObject)module0709.$ic89$)) {
            return (SubLObject)module0709.T;
        }
        if (module0709.NIL != module0590.f36033(var204)) {
            return (SubLObject)module0709.T;
        }
        if (module0709.NIL != conses_high.member(module0590.f36041(var204), module0709.$g5563$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED) && f43154(var191).isString() && module0709.NIL != module0038.f2668((SubLObject)module0709.$ic296$, f43154(var191), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED)) {
            return (SubLObject)module0709.T;
        }
        if (module0709.NIL != module0590.f36071(var204, module0699.f42535((SubLObject)module0709.$ic316$)) && module0709.NIL != module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED)) {
            return (SubLObject)module0709.T;
        }
        if (module0709.NIL != module0590.f36048(module0590.f36041(var204)) && module0709.NIL != f43257(module0590.f36047(module0590.f36041(var204)))) {
            return (SubLObject)module0709.T;
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43271(final SubLObject var299) {
        final SubLThread var300 = SubLProcess.currentSubLThread();
        SubLObject var301 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0590.f36071(var299, module0708.f43012((SubLObject)module0709.$ic100$))) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic570$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var301 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0708.f43012((SubLObject)module0709.$ic574$))) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic570$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var301 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var299, module0699.f42535((SubLObject)module0709.$ic101$))) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic575$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var301 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36032(var299) || module0709.NIL != module0590.f36033(var299)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic575$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var301 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL == module0590.f36031(var299)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic575$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var301 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36031(var299) && module0709.NIL == module0590.f36048(module0590.f36041(var299))) {
            if (module0709.NIL != Characters.lower_case_p(module0038.f2636(module0590.f36041(var299))) && module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic576$, var299);
            }
            var301 = (SubLObject)module0709.$ic248$;
        }
        else {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic575$, module0709.$ic241$ }), var299);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var301 = (SubLObject)module0709.$ic248$;
        }
        return var301;
    }
    
    public static SubLObject f43420(final SubLObject var516, SubLObject var194, final SubLObject var191) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        SubLObject var518 = (SubLObject)module0709.$ic263$;
        final SubLObject var519 = var194.first();
        if (module0709.NIL != module0038.f2828(var519)) {
            var518 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0699.f42555((SubLObject)module0709.$ic115$))) {
            if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var517) && module0709.NIL != module0590.f36072(var519)) {
                Errors.error((SubLObject)module0709.$ic265$, var519);
            }
            final SubLObject var520 = module0590.f36089(var519, f43161((SubLObject)module0709.$ic116$), (SubLObject)module0709.NIL);
            final SubLObject var521 = (module0709.NIL != var520) ? module0642.f39117(var520) : module0709.$ic117$;
            final SubLObject var522 = conses_high.second(var194);
            if (module0709.NIL != var520 && module0709.NIL == var521 && module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic266$, var520);
            }
            f43414(var516, (SubLObject)module0709.$ic267$, (SubLObject)ConsesLow.cons(var522, var521));
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0699.f42535((SubLObject)module0709.$ic264$))) {
            f43414(var516, (SubLObject)module0709.$ic262$, f43272(var519, var191));
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0699.f42555((SubLObject)module0709.$ic112$))) {
            f43410(var516, f43275(var194));
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0699.f42555((SubLObject)module0709.$ic577$)) && module0709.NIL != module0590.f36040(var519)) {
            final SubLObject var523 = f43293(var194.rest(), var191);
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic578$, module0709.$ic241$ }), var523);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43411(var516, var523);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0699.f42555((SubLObject)module0709.$ic577$))) {
            f43411(var516, f43274(var519, var191));
            var518 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic579$)) && module0709.NIL != module0590.f36040(var519)) {
            f43412(var516, f43293(var194.rest(), var191));
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic579$))) {
            f43412(var516, f43168(module0590.f36089(var519, module0699.f42535((SubLObject)module0709.$ic217$), (SubLObject)module0709.UNPROVIDED)));
            var518 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36040(var519) && module0709.NIL != conses_high.member(module0590.f36041(var519), (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)module0709.$ic580$), (SubLObject)module0709.$ic581$), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED)) {
            final SubLObject var524 = f43293(var194.rest(), var191);
            f43414(var516, (SubLObject)module0709.$ic463$, var524);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != conses_high.member(module0590.f36041(var519), (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)module0709.$ic580$), (SubLObject)module0709.$ic581$), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED)) {
            final SubLObject var524 = f43168(module0590.f36089(var519, module0699.f42535((SubLObject)module0709.$ic217$), (SubLObject)module0709.UNPROVIDED));
            f43414(var516, (SubLObject)module0709.$ic463$, var524);
            var518 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic582$)) && module0709.NIL != module0590.f36040(var519)) {
            f43413(var516, (SubLObject)module0709.$ic323$, f43293(var194.rest(), var191));
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic582$))) {
            final SubLObject var525 = f43168(module0590.f36089(var519, module0699.f42535((SubLObject)module0709.$ic217$), (SubLObject)module0709.UNPROVIDED));
            f43413(var516, (SubLObject)module0709.$ic323$, var525);
            var518 = (SubLObject)module0709.$ic263$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic583$)) && module0709.NIL == module0590.f36072(var519)) {
            SubLObject var526 = (SubLObject)module0709.NIL;
            SubLObject var527;
            SubLObject var528;
            for (var194 = var194.rest(); module0709.NIL == module0590.f36070(module0708.f43012((SubLObject)module0709.$ic583$), var194.first()); var194 = module0590.f36068(var194)) {
                var527 = (SubLObject)module0709.NIL;
                var528 = var194.first();
                if (module0709.NIL != f43270(var528) || module0709.NIL != module0590.f36071(var528, module0708.f43012((SubLObject)module0709.$ic317$))) {
                    var527 = f43293(var194, var191);
                }
                else if (module0709.NIL != module0590.f36071(var528, module0699.f42535((SubLObject)module0709.$ic316$))) {
                    var527 = f43299(var528, var191);
                }
                if (module0709.NIL != var527) {
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic584$, module0709.$ic241$ }), var527);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    var526 = (SubLObject)ConsesLow.cons(var527, var526);
                }
            }
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic585$, module0709.$ic241$ }), var526);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43413(var516, (SubLObject)module0709.$ic325$, var526);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic583$)) && module0709.NIL != module0590.f36089(var519, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED)) {
            final SubLObject var529 = module0590.f36089(var519, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
            final SubLObject var530 = (SubLObject)ConsesLow.list((SubLObject)module0709.$ic321$, var529);
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic585$, module0709.$ic241$ }), var530);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43413(var516, (SubLObject)module0709.$ic325$, var530);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic319$)) && module0709.NIL == module0590.f36072(var519)) {
            SubLObject var526 = (SubLObject)module0709.NIL;
            SubLObject var527;
            SubLObject var528;
            for (var194 = var194.rest(); module0709.NIL == module0590.f36070(module0708.f43012((SubLObject)module0709.$ic319$), var194.first()); var194 = module0590.f36068(var194)) {
                var527 = (SubLObject)module0709.NIL;
                var528 = var194.first();
                if (module0709.NIL != f43270(var528) || module0709.NIL != module0590.f36071(var528, module0708.f43012((SubLObject)module0709.$ic317$))) {
                    var527 = f43293(var194, var191);
                }
                else if (module0709.NIL != module0590.f36071(var528, module0699.f42535((SubLObject)module0709.$ic316$))) {
                    var527 = f43299(var528, var191);
                }
                if (module0709.NIL != var527) {
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic586$, module0709.$ic241$ }), var527);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    var526 = (SubLObject)ConsesLow.cons(var527, var526);
                }
            }
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic587$, module0709.$ic241$ }), var526);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43413(var516, (SubLObject)module0709.$ic464$, var526);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36071(var519, module0708.f43012((SubLObject)module0709.$ic301$))) {
            final SubLObject var531 = f43287(var194, var191);
            f43413(var516, (SubLObject)module0709.$ic479$, var531);
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic588$, module0709.$ic241$ }), var531);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != f43277(var519, (SubLObject)module0709.$ic283$, var191)) {
            f43424(var516, var194);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != f43277(var519, (SubLObject)module0709.$ic287$, var191)) {
            f43425(var516, var194);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else if (module0709.NIL != module0590.f36031(var519)) {
            f43426(var516, var519, var194, var191);
            var518 = (SubLObject)module0709.$ic248$;
        }
        else {
            if (module0709.NIL != module0708.f43006()) {
                Errors.warn((SubLObject)module0709.$ic295$, var519);
            }
            var518 = (SubLObject)module0709.$ic263$;
        }
        return var518;
    }
    
    public static SubLObject f43424(final SubLObject var516, final SubLObject var194) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        final SubLObject var518 = conses_high.second(var194);
        final SubLObject var519 = f43278(var518, (SubLObject)module0709.$ic284$);
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic285$, module0709.$ic241$ }), var519, var516);
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        f43413(var516, (SubLObject)module0709.$ic286$, var519);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43425(final SubLObject var516, final SubLObject var194) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        final SubLObject var518 = conses_high.second(var194);
        final SubLObject var519 = f43278(var518, (SubLObject)module0709.$ic284$);
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic288$, module0709.$ic241$ }), var519, var516);
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        f43413(var516, (SubLObject)module0709.$ic289$, var519);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43426(final SubLObject var516, final SubLObject var299, final SubLObject var194, final SubLObject var191) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        final SubLObject var518 = module0590.f36041(var299);
        final SubLObject var519 = (SubLObject)((module0709.NIL != module0590.f36072(var299)) ? f43272(var299, var191) : module0709.NIL);
        SubLObject var520 = (SubLObject)module0709.NIL;
        if (module0709.NIL != var519) {
            var520 = f43316(var519, module0709.$ic18$, var191);
        }
        else if (module0709.NIL != module0590.f36042(conses_high.second(var194))) {
            var520 = (SubLObject)module0709.$ic94$;
        }
        else if (module0709.NIL != module0590.f36031(conses_high.second(var194))) {
            final SubLObject var521 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0709.ONE_INTEGER), f43298(var194.rest(), var191));
            assert module0709.NIL != f43110(var521) : var521;
            var520 = f43292(var521, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
        }
        else {
            final SubLObject var522 = f43168(module0590.f36089(var299, module0699.f42535((SubLObject)module0709.$ic290$), (SubLObject)module0709.UNPROVIDED));
            final SubLObject var523 = conses_high.second(var194);
            var520 = f43278(var523, var522);
        }
        if (module0709.NIL == var520) {
            Errors.warn((SubLObject)module0709.$ic589$, var299, conses_high.second(var194));
        }
        else if (module0709.NIL != f43277(var299, (SubLObject)module0709.$ic291$, var191)) {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic292$, module0709.$ic241$ }), var516, var520);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43414(var516, (SubLObject)module0709.$ic262$, var520);
        }
        else {
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic293$, module0709.$ic241$ }), var518, var520);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            f43414(var516, (SubLObject)module0709.$ic294$, (SubLObject)ConsesLow.list(var518, var520));
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43274(final SubLObject var204, final SubLObject var191) {
        return f43272(var204, var191);
    }
    
    public static SubLObject f43427(final SubLObject var191) {
        return module0038.f2812(f43243(var191));
    }
    
    public static SubLObject f43272(final SubLObject var204, final SubLObject var191) {
        final SubLThread var205 = SubLProcess.currentSubLThread();
        final SubLObject var206 = f43427(var191);
        final SubLObject var207 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic120$), (SubLObject)module0709.UNPROVIDED);
        final SubLObject var208 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic339$), (SubLObject)module0709.UNPROVIDED);
        final SubLObject var209 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
        final SubLObject var210 = module0590.f36089(var204, module0699.f42535((SubLObject)module0709.$ic217$), (SubLObject)module0709.UNPROVIDED);
        SubLObject var211 = (SubLObject)module0709.NIL;
        SubLObject var212 = (SubLObject)module0709.NIL;
        if (module0709.NIL != var207) {
            if (module0709.NIL != module0590.f36071(var204, module0699.f42535((SubLObject)module0709.$ic316$)) && (module0709.NIL != module0038.f2728(var207) || module0709.NIL != f43359(var207))) {
                var211 = (SubLObject)ConsesLow.list((SubLObject)module0709.$ic321$, var207);
            }
            else {
                var211 = f43168(var207);
            }
        }
        else if (module0709.NIL != var208) {
            var211 = f43168(var208);
        }
        else if (module0709.NIL != var209) {
            var211 = (SubLObject)ConsesLow.list((SubLObject)module0709.$ic321$, var209);
        }
        else if (module0709.NIL != var210) {
            var211 = f43168(var210);
        }
        else if (module0709.NIL != module0708.$g5533$.getDynamicValue(var205)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic590$, module0709.$ic241$ }), var204);
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL != var211 && module0709.NIL == f43204(var211)) {
            var212 = f43428(var211, var206);
        }
        return Values.values(var211, var212);
    }
    
    public static SubLObject f43299(final SubLObject var204, final SubLObject var191) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0709.ZERO_INTEGER), f43272(var204, var191));
    }
    
    public static SubLObject f43428(final SubLObject var241, final SubLObject var529) {
        final SubLObject var530 = (module0709.NIL != f43202(var241)) ? conses_high.third(var241) : var241;
        SubLObject var531 = module0038.f2842((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_period, Sequences.cconcatenate(var529, module0038.f2812(var530)));
        if (module0709.NIL != Characters.lower_case_p(module0038.f2636(var531))) {
            var531 = module0038.f2812(var531);
        }
        return var531;
    }
    
    public static SubLObject f43202(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)module0709.$ic591$);
    }
    
    public static SubLObject f43317(final SubLObject var241, final SubLObject var164, final SubLObject var191) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var242)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic592$, module0709.$ic241$ }));
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        SubLObject var244;
        final SubLObject var243 = var244 = var241.rest();
        SubLObject var245 = (SubLObject)module0709.NIL;
        SubLObject var246 = (SubLObject)module0709.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var244, var243, (SubLObject)module0709.$ic401$);
        var245 = var244.first();
        var244 = var244.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var244, var243, (SubLObject)module0709.$ic401$);
        var246 = var244.first();
        var244 = var244.rest();
        if (module0709.NIL == var244) {
            final SubLObject var247 = f43121(var245, var191, (SubLObject)module0709.UNPROVIDED);
            final SubLObject var248 = f43318(var246, var164, var247, var191, (SubLObject)module0709.UNPROVIDED);
            if (module0709.NIL != module0708.$g5533$.getDynamicValue(var242)) {
                PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic593$, module0709.$ic241$ }), var248);
                streams_high.force_output((SubLObject)module0709.UNPROVIDED);
            }
            return var248;
        }
        cdestructuring_bind.cdestructuring_bind_error(var243, (SubLObject)module0709.$ic401$);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43293(final SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var195)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic594$, module0709.$ic241$ }), module0035.f2124((SubLObject)module0709.FOUR_INTEGER, var194));
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL != f43270(var196)) {
            return f43286(var194, var191);
        }
        if (module0709.NIL != module0590.f36071(var196, module0708.f43012((SubLObject)module0709.$ic317$))) {
            var195.resetMultipleValues();
            final SubLObject var197 = f43418(var194, var191);
            final SubLObject var198 = var195.secondMultipleValue();
            final SubLObject var199 = var195.thirdMultipleValue();
            final SubLObject var200 = var195.fourthMultipleValue();
            var195.resetMultipleValues();
            return (SubLObject)ConsesLow.list((SubLObject)module0709.$ic595$, var197, var198, var199, var200);
        }
        if (module0709.NIL != module0590.f36072(var196)) {
            return f43299(var196, var191);
        }
        Errors.warn((SubLObject)module0709.$ic596$, var196);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43418(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var299) && module0709.NIL == module0590.f36071(var298.first(), module0708.f43012((SubLObject)module0709.$ic317$))) {
            Errors.error((SubLObject)module0709.$ic597$, module0035.f2124((SubLObject)module0709.TEN_INTEGER, var298));
        }
        final SubLObject var300 = module0590.f36089(var298.first(), module0699.f42535((SubLObject)module0709.$ic311$), (SubLObject)module0709.UNPROVIDED);
        SubLObject var301 = var298;
        SubLObject var302 = (SubLObject)module0709.$ic598$;
        SubLObject var303 = (SubLObject)module0709.NIL;
        SubLObject var304 = module0709.$ic18$;
        SubLObject var305 = (SubLObject)module0709.NIL;
        SubLObject var306 = (SubLObject)module0709.NIL;
        SubLObject var307 = (SubLObject)module0709.NIL;
        while (module0709.NIL != var301 && var302 != module0709.$ic599$) {
            SubLObject var308 = (SubLObject)module0709.NIL;
            var299.resetMultipleValues();
            final SubLObject var534_535 = f43429(var302, var303, var304, var305, var306, var307, var301, var191);
            final SubLObject var536_537 = var299.secondMultipleValue();
            final SubLObject var538_539 = var299.thirdMultipleValue();
            final SubLObject var540_541 = var299.fourthMultipleValue();
            final SubLObject var542_543 = var299.fifthMultipleValue();
            final SubLObject var544_545 = var299.sixthMultipleValue();
            final SubLObject var546_547 = var299.seventhMultipleValue();
            var299.resetMultipleValues();
            var302 = var534_535;
            var303 = var536_537;
            var304 = var538_539;
            var305 = var540_541;
            var306 = var542_543;
            var307 = var544_545;
            var308 = var546_547;
            if (module0709.NIL != module0004.f105(var308)) {
                var301 = module0590.f36061(var301, var308);
            }
            else if (var308.isString()) {
                var301 = module0590.f36061(module0590.f36062(var301, var308, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED);
            }
            else if (var308.eql((SubLObject)module0709.$ic248$)) {
                var301 = module0590.f36068(var301);
            }
            else {
                if (var302 == module0709.$ic599$) {
                    continue;
                }
                final SubLObject var309 = f43264(var301);
                var301 = (SubLObject)((module0709.NIL != var309) ? module0590.f36061(var301, var309) : module0709.NIL);
            }
        }
        if (module0709.NIL != module0708.$g5533$.getDynamicValue(var299)) {
            PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic600$, module0709.$ic241$ }), new SubLObject[] { var303, var305, var307, var304 });
            streams_high.force_output((SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL != module0038.f2611(var300)) {
            f43296(var300, (SubLObject)ConsesLow.list((SubLObject)module0709.$ic595$, var303, var305, var307, var304));
        }
        return Values.values(var303, var305, var307, var304);
    }
    
    public static SubLObject f43429(SubLObject var533, SubLObject var248, SubLObject var54, SubLObject var164, SubLObject var323, SubLObject var25, final SubLObject var194, final SubLObject var191) {
        final SubLThread var534 = SubLProcess.currentSubLThread();
        final SubLObject var535 = var194.first();
        SubLObject var536 = (SubLObject)module0709.NIL;
        if (module0709.NIL != module0590.f36071(var535, module0708.f43012((SubLObject)module0709.$ic317$)) && module0709.NIL != module0590.f36042(var535)) {
            var533 = (SubLObject)module0709.$ic599$;
        }
        else if (module0709.NIL == module0590.f36071(var535, module0708.f43012((SubLObject)module0709.$ic317$)) || module0709.NIL == module0590.f36040(var535) || module0709.NIL != var248 || module0709.NIL != var164 || module0709.NIL != var25) {
            if (module0709.NIL != module0590.f36071(var535, module0708.f43012((SubLObject)module0709.$ic601$)) && module0709.NIL != module0590.f36040(var535)) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic602$, module0709.$ic241$ }));
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var533 = (SubLObject)module0709.$ic603$;
            }
            else if (module0709.NIL != module0590.f36071(var535, module0708.f43020((SubLObject)module0709.$ic604$)) && module0709.NIL != module0590.f36040(var535)) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic605$, module0709.$ic241$ }));
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var533 = (SubLObject)module0709.$ic606$;
            }
            else if (module0709.NIL != module0590.f36071(var535, module0708.f43012((SubLObject)module0709.$ic601$)) && module0709.NIL != module0590.f36072(var535)) {
                var248 = f43272(var535, var191);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic607$, module0709.$ic241$ }), var248);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var533 = (SubLObject)((module0709.NIL != var25) ? module0709.$ic599$ : module0709.$ic608$);
            }
            else if (module0709.NIL != module0590.f36071(var535, module0708.f43020((SubLObject)module0709.$ic604$)) && module0709.NIL != module0590.f36072(var535)) {
                var54 = f43272(var535, var191);
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic609$, module0709.$ic241$ }), var54);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var533 = (SubLObject)((module0709.NIL != var25) ? module0709.$ic599$ : module0709.$ic610$);
            }
            else if (module0709.NIL != module0590.f36071(var535, module0708.f43012((SubLObject)module0709.$ic601$)) && module0709.NIL != module0590.f36042(var535)) {
                if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && var533 != module0709.$ic603$) {
                    Errors.error((SubLObject)module0709.$ic611$);
                }
                if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && module0709.NIL == var248) {
                    Errors.error((SubLObject)module0709.$ic612$);
                }
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic607$, module0709.$ic241$ }), var248);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var533 = (SubLObject)((module0709.NIL != var25) ? module0709.$ic599$ : module0709.$ic608$);
            }
            else if (module0709.NIL != module0590.f36071(var535, module0708.f43020((SubLObject)module0709.$ic604$)) && module0709.NIL != module0590.f36042(var535)) {
                if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && var533 != module0709.$ic606$) {
                    Errors.error((SubLObject)module0709.$ic613$);
                }
                if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && module0709.NIL == var54) {
                    Errors.error((SubLObject)module0709.$ic614$);
                }
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic609$, module0709.$ic241$ }), var54);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var533 = (SubLObject)((module0709.NIL != var25) ? module0709.$ic599$ : module0709.$ic610$);
            }
            else if (var533 == module0709.$ic603$) {
                var248 = f43430(var194, var191);
                var536 = (SubLObject)module0709.$ic248$;
            }
            else if (var533 == module0709.$ic606$) {
                var54 = f43431(var194, var191);
                var536 = (SubLObject)module0709.$ic248$;
            }
            else if (module0709.NIL != conses_high.member(module0590.f36041(var535), (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)module0709.$ic497$), module0708.f43012((SubLObject)module0709.$ic499$), module0708.f43012((SubLObject)module0709.$ic501$), module0708.f43012((SubLObject)module0709.$ic505$), module0708.f43012((SubLObject)module0709.$ic503$), module0708.f43012((SubLObject)module0709.$ic508$)), Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED)) {
                var164 = module0590.f36041(var535);
                var323 = f43168(module0590.f36089(var535, module0699.f42535((SubLObject)module0709.$ic290$), (SubLObject)module0709.UNPROVIDED));
                if (module0709.NIL != f43202(var323)) {
                    var323 = conses_high.third(var323);
                }
                if (module0709.NIL != var323 && module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic615$, module0709.$ic241$ }), var323, var535);
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var533 = (SubLObject)module0709.$ic616$;
                if (module0709.NIL != module0590.f36072(var535)) {
                    final SubLObject var537 = f43272(var535, var191);
                    var25 = f43279(var537, module0709.$ic350$, var191);
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic617$, module0709.$ic241$ }), var25, var535);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    var533 = (SubLObject)((module0709.NIL != var248) ? module0709.$ic599$ : module0709.$ic618$);
                }
            }
            else if (var533 == module0709.$ic616$ && module0709.NIL != f43270(var535)) {
                final SubLObject var537 = f43286(var194, var191);
                final SubLObject var538 = f43168(module0590.f36041(var535));
                final SubLObject var539 = module0709.$g5561$.currentBinding(var534);
                try {
                    module0709.$g5561$.bind((SubLObject)module0709.T, var534);
                    final SubLObject var164_549 = f43279(var538, module0709.$ic350$, var191);
                    final SubLObject var540 = f43279(var537, var164_549, var191);
                    if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && module0709.NIL == var540) {
                        Errors.error((SubLObject)module0709.$ic619$);
                    }
                    var25 = var540;
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic620$, module0709.$ic241$ }), var25);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    var533 = (SubLObject)module0709.$ic618$;
                }
                finally {
                    module0709.$g5561$.rebind(var539, var534);
                }
            }
            else if (var533 == module0709.$ic616$ && module0709.NIL == module0590.f36031(var535)) {
                var25 = f43278(var535, var323);
                if (module0709.NIL != var25) {
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic620$, module0709.$ic241$ }), var25);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    var533 = (SubLObject)module0709.$ic618$;
                }
            }
            else if (var533 == module0709.$ic616$ && (module0709.NIL != module0590.f36040(var535) || module0709.NIL != module0590.f36072(var535))) {
                final SubLObject var541 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0709.ONE_INTEGER), f43298(var194, var191));
                assert module0709.NIL != f43110(var541) : var541;
                var25 = f43292(var541, (SubLObject)module0709.$ic156$, (SubLObject)module0709.UNPROVIDED);
                if (module0709.NIL != var25) {
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic620$, module0709.$ic241$ }), var25);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                    var533 = (SubLObject)((module0709.NIL != var248) ? module0709.$ic599$ : module0709.$ic618$);
                }
            }
        }
        return Values.values(var533, var248, var54, var164, var323, var25, var536);
    }
    
    public static SubLObject f43430(SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        final SubLObject var197 = f43274(var196, var191);
        final SubLObject var198 = module0709.$g5547$.currentBinding(var195);
        try {
            module0709.$g5547$.bind((SubLObject)module0709.$ic59$, var195);
            SubLObject var199 = (SubLObject)module0709.NIL;
            SubLObject var200 = var196;
            SubLObject var201 = (SubLObject)module0709.NIL;
            while (module0709.NIL == var201) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var195)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic621$, module0709.$ic241$ }), module0035.f2124((SubLObject)module0709.FOUR_INTEGER, var194));
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var195.resetMultipleValues();
                final SubLObject var202 = f43263(var200, var199, var191, var194);
                final SubLObject var203 = var195.secondMultipleValue();
                final SubLObject var204 = var195.thirdMultipleValue();
                var195.resetMultipleValues();
                var199 = var202;
                if (module0709.NIL != var204) {
                    f43104(var202, (SubLObject)module0709.$ic59$);
                    var201 = (SubLObject)module0709.T;
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var195)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic622$, module0709.$ic241$ }), var202);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                }
                if (module0709.NIL != module0004.f105(var203)) {
                    var194 = module0590.f36061(var194, var203);
                }
                else if (var203.isString()) {
                    var194 = module0590.f36061(module0590.f36062(var194, var203, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED);
                }
                else if (var203.eql((SubLObject)module0709.$ic248$)) {
                    var194 = module0590.f36068(var194);
                }
                else {
                    final SubLObject var205 = f43264(var194);
                    var194 = (SubLObject)((module0709.NIL != var205) ? module0590.f36061(var194, var205) : module0709.NIL);
                }
                var200 = var194.first();
            }
        }
        finally {
            module0709.$g5547$.rebind(var198, var195);
        }
        return var197;
    }
    
    public static SubLObject f43431(SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        final SubLObject var197 = f43274(var196, var191);
        final SubLObject var198 = module0709.$g5547$.currentBinding(var195);
        try {
            module0709.$g5547$.bind((SubLObject)module0709.$ic84$, var195);
            SubLObject var199 = (SubLObject)module0709.NIL;
            SubLObject var200 = var196;
            SubLObject var201 = (SubLObject)module0709.NIL;
            while (module0709.NIL == var201) {
                if (module0709.NIL != module0708.$g5533$.getDynamicValue(var195)) {
                    PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic623$, module0709.$ic241$ }), module0035.f2124((SubLObject)module0709.FOUR_INTEGER, var194));
                    streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                }
                var195.resetMultipleValues();
                final SubLObject var202 = f43419(var200, var199, var191, var194);
                final SubLObject var203 = var195.secondMultipleValue();
                final SubLObject var204 = var195.thirdMultipleValue();
                var195.resetMultipleValues();
                var199 = var202;
                if (module0709.NIL != var204) {
                    f43104(var202, (SubLObject)module0709.$ic84$);
                    var201 = (SubLObject)module0709.T;
                    if (module0709.NIL != module0708.$g5533$.getDynamicValue(var195)) {
                        PrintLow.format((SubLObject)module0709.T, Sequences.cconcatenate((SubLObject)module0709.$ic239$, new SubLObject[] { module0709.$ic622$, module0709.$ic241$ }), var202);
                        streams_high.force_output((SubLObject)module0709.UNPROVIDED);
                    }
                }
                if (module0709.NIL != module0004.f105(var203)) {
                    var194 = module0590.f36061(var194, var203);
                }
                else if (var203.isString()) {
                    var194 = module0590.f36061(module0590.f36062(var194, var203, (SubLObject)module0709.UNPROVIDED), (SubLObject)module0709.UNPROVIDED);
                }
                else if (var203.eql((SubLObject)module0709.$ic248$)) {
                    var194 = module0590.f36068(var194);
                }
                else {
                    final SubLObject var205 = f43264(var194);
                    var194 = (SubLObject)((module0709.NIL != var205) ? module0590.f36061(var194, var205) : module0709.NIL);
                }
                var200 = var194.first();
            }
        }
        finally {
            module0709.$g5547$.rebind(var198, var195);
        }
        return var197;
    }
    
    public static SubLObject f43278(final SubLObject var204, final SubLObject var323) {
        final SubLObject var324 = (module0709.NIL != f43202(var323)) ? conses_high.third(var323) : var323;
        final SubLObject var325 = module0038.f2735(var204);
        SubLObject var326 = (SubLObject)module0709.NIL;
        if (module0709.NIL != Guids.guid_string_p(var325)) {
            return var325;
        }
        if (module0709.NIL != conses_high.member(var324, module0709.$g5575$.getGlobalValue(), (SubLObject)module0709.EQUALP, (SubLObject)module0709.UNPROVIDED) || module0709.NIL == var324) {
            final SubLObject var327 = (SubLObject)module0709.NIL;
            final SubLObject var328 = (SubLObject)(var327.isNumber() ? module0709.NIL : reader.read_from_string_ignoring_errors(var325, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED));
            final SubLObject var329 = (SubLObject)(var327.isNumber() ? var327 : (var328.isNumber() ? var328 : module0709.NIL));
            if (module0709.NIL != var324 && module0709.NIL == var329) {
                Errors.warn((SubLObject)module0709.$ic625$, var204, var324);
            }
            var326 = ((module0709.NIL != var329) ? var329 : var204);
        }
        else {
            if (var324.equalp((SubLObject)module0709.$ic284$)) {
                return var204;
            }
            if (var324.equalp((SubLObject)module0709.$ic626$)) {
                if (module0709.NIL != module0004.f104(var325, (SubLObject)module0709.$ic627$, Symbols.symbol_function((SubLObject)module0709.EQUALP), (SubLObject)module0709.UNPROVIDED)) {
                    var326 = module0709.$ic628$;
                }
                else if (module0709.NIL != module0004.f104(var325, (SubLObject)module0709.$ic629$, Symbols.symbol_function((SubLObject)module0709.EQUALP), (SubLObject)module0709.UNPROVIDED)) {
                    var326 = module0709.$ic630$;
                }
                else {
                    Errors.warn((SubLObject)module0709.$ic631$, var204);
                }
            }
            else if (var324.equalp((SubLObject)module0709.$ic632$)) {
                final SubLObject var330 = module0612.f37548(var325, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
                final SubLObject var331 = Sequences.length(var330);
                if (var331.eql((SubLObject)module0709.ONE_INTEGER)) {
                    var326 = module0035.f2113(var330);
                }
                else if (var331.eql((SubLObject)module0709.ZERO_INTEGER)) {
                    Errors.warn((SubLObject)module0709.$ic633$, var204);
                }
                else {
                    final SubLObject var332 = module0035.f2109(module0709.$ic634$, var330, Symbols.symbol_function((SubLObject)module0709.EQL), (SubLObject)module0709.$ic635$);
                    if (module0709.NIL != module0035.f1997(var332)) {
                        var326 = module0035.f2113(var332);
                    }
                    else {
                        Errors.warn((SubLObject)module0709.$ic636$, var204, var330);
                    }
                }
            }
            else {
                Errors.warn((SubLObject)module0709.$ic637$, var204, var324);
            }
        }
        return var326;
    }
    
    public static SubLObject f43432() {
        final SubLObject var193 = module0709.$g5576$.getGlobalValue();
        if (module0709.NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43433(final SubLObject var326) {
        return module0034.f1829(module0709.$g5576$.getGlobalValue(), (SubLObject)ConsesLow.list(var326), (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
    }
    
    public static SubLObject f43434(final SubLObject var326) {
        return Sequences.cconcatenate((SubLObject)module0709.$ic639$, var326);
    }
    
    public static SubLObject f43161(final SubLObject var326) {
        SubLObject var327 = module0709.$g5576$.getGlobalValue();
        if (module0709.NIL == var327) {
            var327 = module0034.f1934((SubLObject)module0709.$ic638$, (SubLObject)module0709.$ic640$, (SubLObject)module0709.NIL, (SubLObject)module0709.EQUAL, (SubLObject)module0709.ONE_INTEGER, (SubLObject)module0709.ZERO_INTEGER);
        }
        SubLObject var328 = module0034.f1814(var327, var326, (SubLObject)module0709.$ic15$);
        if (var328 == module0709.$ic15$) {
            var328 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43434(var326)));
            module0034.f1816(var327, var326, var328, (SubLObject)module0709.UNPROVIDED);
        }
        return module0034.f1959(var328);
    }
    
    public static SubLObject f43435(final SubLObject var229, final SubLObject var230) {
        f43436(var229, var230, (SubLObject)module0709.ZERO_INTEGER);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43437(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47100_native.class) ? module0709.T : module0709.NIL);
    }
    
    public static SubLObject f43438(final SubLObject var229) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43439(final SubLObject var229) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43440(final SubLObject var229) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43441(final SubLObject var229) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43442(final SubLObject var229) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43443(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43444(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43445(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43446(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43447(final SubLObject var229, final SubLObject var232) {
        assert module0709.NIL != f43437(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43448(SubLObject var233) {
        if (var233 == module0709.UNPROVIDED) {
            var233 = (SubLObject)module0709.NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47100_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)module0709.NIL, var235 = var233; module0709.NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)module0709.$ic660$)) {
                f43443(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic661$)) {
                f43444(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic662$)) {
                f43445(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic663$)) {
                f43446(var234, var237);
            }
            else if (var238.eql((SubLObject)module0709.$ic664$)) {
                f43447(var234, var237);
            }
            else {
                Errors.error((SubLObject)module0709.$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43449(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic150$, (SubLObject)module0709.$ic665$, (SubLObject)module0709.FIVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic660$, f43438(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic661$, f43439(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic662$, f43440(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic663$, f43441(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic152$, (SubLObject)module0709.$ic664$, f43442(var238));
        Functions.funcall(var239, var238, (SubLObject)module0709.$ic153$, (SubLObject)module0709.$ic665$, (SubLObject)module0709.FIVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43450(final SubLObject var238, final SubLObject var239) {
        return f43449(var238, var239);
    }
    
    public static SubLObject f43436(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        PrintLow.format(var230, (SubLObject)module0709.$ic667$, f43438(var240));
        return var240;
    }
    
    public static SubLObject f43451() {
        final SubLObject var560 = f43448((SubLObject)module0709.UNPROVIDED);
        final SubLObject var561 = module0065.f4746(f43452());
        f43443(var560, var561);
        module0065.f4753(f43452(), var561, var560);
        return var560;
    }
    
    public static SubLObject f43453(final SubLObject var560) {
        assert module0709.NIL != f43437(var560) : var560;
        return f43438(var560);
    }
    
    public static SubLObject f43454(final SubLObject var560) {
        assert module0709.NIL != f43437(var560) : var560;
        return f43439(var560);
    }
    
    public static SubLObject f43455(final SubLObject var560) {
        assert module0709.NIL != f43437(var560) : var560;
        return f43440(var560);
    }
    
    public static SubLObject f43456(final SubLObject var560) {
        assert module0709.NIL != f43437(var560) : var560;
        return f43441(var560);
    }
    
    public static SubLObject f43457(final SubLObject var560) {
        assert module0709.NIL != f43437(var560) : var560;
        return f43442(var560);
    }
    
    public static SubLObject f43458(final SubLObject var240) {
        return f43459(var240);
    }
    
    public static SubLObject f43459(final SubLObject var560) {
        return Sxhash.sxhash(f43438(var560));
    }
    
    public static SubLObject f43460(final SubLObject var177, final SubLObject var178, SubLObject var179, SubLObject var180, SubLObject var183, SubLObject var184, SubLObject var181, SubLObject var182) {
        if (var179 == module0709.UNPROVIDED) {
            var179 = var177;
        }
        if (var180 == module0709.UNPROVIDED) {
            var180 = (SubLObject)module0709.NIL;
        }
        if (var183 == module0709.UNPROVIDED) {
            var183 = (SubLObject)module0709.NIL;
        }
        if (var184 == module0709.UNPROVIDED) {
            var184 = (SubLObject)module0709.NIL;
        }
        if (var181 == module0709.UNPROVIDED) {
            var181 = (SubLObject)module0709.NIL;
        }
        if (var182 == module0709.UNPROVIDED) {
            var182 = module0111.$g1405$.getDynamicValue();
        }
        return f43461(module0035.f2333((SubLObject)module0709.$ic670$, (SubLObject)ConsesLow.list(var177, var178, var179, var180, var183, var184, var181, var182)));
    }
    
    public static SubLObject f43461(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        SubLObject var187 = conses_high.getf(var185, (SubLObject)module0709.$ic63$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var188 = conses_high.getf(var185, (SubLObject)module0709.$ic64$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var189 = conses_high.getf(var185, (SubLObject)module0709.$ic65$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var190 = conses_high.getf(var185, (SubLObject)module0709.$ic66$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var191 = conses_high.getf(var185, (SubLObject)module0709.$ic67$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var192 = conses_high.getf(var185, (SubLObject)module0709.$ic68$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var193 = conses_high.getf(var185, (SubLObject)module0709.$ic71$, (SubLObject)module0709.UNPROVIDED);
        final SubLObject var194 = conses_high.getf(var185, (SubLObject)module0709.$ic72$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var195 = conses_high.getf(var185, (SubLObject)module0709.$ic69$, (SubLObject)module0709.UNPROVIDED);
        SubLObject var196 = conses_high.getf(var185, (SubLObject)module0709.$ic70$, (SubLObject)module0709.UNPROVIDED);
        if (module0709.NIL == var196) {
            var196 = module0111.$g1405$.getDynamicValue(var186);
        }
        var187 = module0038.f2711(var187, (SubLObject)Characters.CHAR_hash);
        if (module0709.NIL == var192) {
            var192 = f43121(var187, (SubLObject)module0709.UNPROVIDED, (SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL == var195) {
            var195 = f43122(var192, (SubLObject)module0709.UNPROVIDED);
        }
        if (module0709.NIL == module0038.f2611(var191)) {
            var191 = var187;
        }
        if (module0709.NIL == Errors.$ignore_mustsP$.getDynamicValue(var186) && module0709.NIL == module0589.f35907(var191, (SubLObject)module0709.UNPROVIDED) && module0709.NIL == module0075.f5218(var191)) {
            Errors.error((SubLObject)module0709.$ic73$);
        }
        final SubLObject var197 = module0111.$g1405$.currentBinding(var186);
        try {
            module0111.$g1405$.bind((SubLObject)module0709.NIL, var186);
            module0574.f35153(var196);
            module0543.f33621();
        }
        finally {
            module0111.$g1405$.rebind(var197, var186);
        }
        assert module0709.NIL != module0589.f35907(var187, (SubLObject)module0709.UNPROVIDED) : var187;
        final SubLObject var198 = f43451();
        module0059.f4332((SubLObject)module0709.$ic671$, (SubLObject)module0709.$ic672$, (SubLObject)ConsesLow.list(module0035.f2333((SubLObject)module0709.$ic673$, (SubLObject)ConsesLow.list(new SubLObject[] { var198, var187, var189, var190, var188, var191, var192, var195, var196, var193, var194 }))));
        return f43453(var198);
    }
    
    public static SubLObject f43462(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        final SubLObject var564 = (SubLObject)((module0709.NIL != var563) ? f43456(var563) : module0709.NIL);
        return (SubLObject)((module0709.NIL != var564) ? f43137(var564) : module0709.NIL);
    }
    
    public static SubLObject f43464(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        return (SubLObject)((module0709.NIL != var563) ? conses_high.copy_list(f43454(var563)) : module0709.NIL);
    }
    
    public static SubLObject f43465(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        return (SubLObject)((module0709.NIL != var563) ? conses_high.copy_list(f43455(var563)) : module0709.NIL);
    }
    
    public static SubLObject f43466(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        return Equality.eql(f43454(var563).first(), (SubLObject)module0709.$ic599$);
    }
    
    public static SubLObject f43467(final SubLObject var562) {
        return module0035.sublisp_boolean(f43463(var562));
    }
    
    public static SubLObject f43452() {
        if (module0709.NIL == module0065.f4719(module0709.$g5578$.getGlobalValue())) {
            module0709.$g5578$.setGlobalValue(module0065.f4745((SubLObject)module0709.$ic111$, (SubLObject)module0709.ZERO_INTEGER));
        }
        return module0709.$g5578$.getGlobalValue();
    }
    
    public static SubLObject f43463(final SubLObject var561) {
        return module0065.f4750(f43452(), var561, (SubLObject)module0709.NIL);
    }
    
    public static SubLObject f43126(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0709.$g5540$.getDynamicValue(var192)) {
            f43446(module0709.$g5540$.getDynamicValue(var192), var191);
        }
        return var191;
    }
    
    public static SubLObject f43284(final SubLObject var332) {
        final SubLThread var333 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0709.$g5540$.getDynamicValue(var333)) {
            final SubLObject var334 = f43454(module0709.$g5540$.getDynamicValue(var333)).first();
            final SubLObject var335 = var334.first();
            ConsesLow.set_nth((SubLObject)module0709.ONE_INTEGER, var334, var332);
            ConsesLow.set_nth((SubLObject)module0709.TWO_INTEGER, var334, module0004.f102(var335, (SubLObject)module0709.UNPROVIDED));
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43282() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0709.$g5540$.getDynamicValue(var2)) {
            f43444(module0709.$g5540$.getDynamicValue(var2), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Time.get_universal_time(), (SubLObject)module0709.ZERO_INTEGER, (SubLObject)module0709.ZERO_INTEGER), f43439(module0709.$g5540$.getDynamicValue(var2))));
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43285() {
        f43284((SubLObject)module0709.ONE_INTEGER);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43132() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0709.$g5540$.getDynamicValue(var2)) {
            f43444(module0709.$g5540$.getDynamicValue(var2), (SubLObject)ConsesLow.cons((SubLObject)module0709.$ic599$, f43439(module0709.$g5540$.getDynamicValue(var2))));
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43369(final SubLObject var167, final SubLObject var202) {
        final SubLThread var203 = SubLProcess.currentSubLThread();
        if (module0709.NIL != module0709.$g5540$.getDynamicValue(var203)) {
            f43445(module0709.$g5540$.getDynamicValue(var203), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var167, var202), f43440(module0709.$g5540$.getDynamicValue(var203))));
        }
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43468(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        final SubLObject var187 = conses_high.getf(var185, (SubLObject)module0709.$ic675$, (SubLObject)module0709.UNPROVIDED);
        f43447(var187, Threads.current_process());
        final SubLObject var188 = module0709.$g5540$.currentBinding(var186);
        final SubLObject var189 = module0012.$silent_progressP$.currentBinding(var186);
        try {
            module0709.$g5540$.bind(var187, var186);
            module0012.$silent_progressP$.bind((SubLObject)module0709.T, var186);
            f43120(var185);
        }
        finally {
            module0012.$silent_progressP$.rebind(var189, var186);
            module0709.$g5540$.rebind(var188, var186);
        }
        return var187;
    }
    
    public static SubLObject f43469() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43059", "S#47102", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43060", "S#47103", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43061", "S#47104", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43063", "S#47105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43065", "S#47106", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43071", "S#47107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43072", "S#47108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43073", "S#47109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43074", "S#47110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43075", "S#47111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43076", "S#47112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43079", "S#47113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43081", "S#47114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43077", "S#47115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43078", "S#47116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43082", "S#47117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43083", "S#47118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43084", "S#47119", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43085", "S#47120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43086", "S#47121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43087", "S#47122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43088", "S#47123", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43089", "S#47124", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43090", "S#47125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43091", "S#47126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43092", "S#47127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43080", "S#47128", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43093", "S#47129", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43095", "S#47130", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43094", "S#47131", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43097", "S#47132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43096", "S#47133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43098", "S#47134", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43099", "S#47135", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43064", "S#47136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43100", "S#47137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43062", "S#47138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43101", "S#47139", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43102", "S#47140", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43103", "S#47141", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43104", "S#47142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43108", "S#47143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43113", "S#47144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43107", "S#47145", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43106", "S#47146", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43105", "S#47147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43109", "S#47148", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43114", "S#47149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43119", "IMPORT-OWL-ONTOLOGY", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43120", "S#47150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43069", "S#47151", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43133", "S#47152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43134", "S#47153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43135", "S#47154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43127", "S#47155", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43136", "S#47156", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43125", "S#47157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43149", "S#47158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43150", "S#47159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43151", "S#47160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43152", "S#47161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43131", "S#47162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43138", "S#47163", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43158", "S#47164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43159", "S#47165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43162", "S#47166", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43163", "S#47167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43164", "S#47168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43166", "S#47169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43165", "S#47170", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43157", "S#47171", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43169", "S#47172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43171", "S#47095", 1, 0, false);
        new $f43171$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43172", "S#47173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43173", "S#47174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43174", "S#47175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43175", "S#47176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43176", "S#47177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43177", "S#47178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43178", "S#47179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43179", "S#47180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43180", "S#47181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43181", "S#47182", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43182", "S#47183", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43183", "S#47184", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43184", "S#47185", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43170", "S#47186", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43185", "S#47187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43186", "S#47188", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43115", "S#47189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43192", "S#47190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43193", "S#47191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43194", "S#47192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43195", "S#47193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43196", "S#47194", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43116", "S#47195", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43187", "S#47196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43188", "S#47197", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43189", "S#47198", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43190", "S#47199", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43112", "S#47200", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43197", "S#47201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43204", "S#47202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43203", "S#47203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43199", "S#47204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43205", "S#47205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43200", "S#47206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43206", "S#47207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43201", "S#47208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43207", "S#47209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43191", "S#47210", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43208", "S#47211", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43209", "S#47212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43210", "S#47213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43211", "S#47214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43213", "S#47097", 1, 0, false);
        new $f43213$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43214", "S#47215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43215", "S#47216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43216", "S#47217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43217", "S#47218", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43218", "S#47219", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43219", "S#47220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43220", "S#47221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43221", "S#47222", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43222", "S#47223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43223", "S#47224", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43224", "S#47225", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43225", "S#47226", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43226", "S#47227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43227", "S#47228", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43228", "S#47229", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43229", "S#47230", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43230", "S#47231", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43231", "S#47232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43232", "S#47233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43233", "S#47234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43234", "S#47235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43235", "S#47236", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43236", "S#47237", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43237", "S#47238", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43238", "S#47239", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43239", "S#47240", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43240", "S#47241", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43212", "S#47242", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43123", "S#47243", 7, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43241", "S#47244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43137", "S#47245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43242", "S#47246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43243", "S#47247", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43244", "S#47248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43154", "S#47249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43245", "S#47250", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43156", "S#47251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43246", "S#47252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43247", "S#47253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43248", "S#47254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43249", "S#47255", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43250", "S#47256", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43251", "S#47257", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43160", "S#47258", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43153", "S#47259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43147", "S#47260", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43252", "S#47261", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43253", "S#47262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43139", "S#47263", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43140", "S#47264", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43255", "S#47265", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43256", "S#47266", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43257", "S#47267", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43258", "S#47268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43259", "S#47269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43260", "S#47270", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43261", "S#47271", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43262", "S#47272", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43121", "S#47273", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43122", "S#47274", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43144", "S#47275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43067", "S#47276", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43265", "S#47277", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43266", "S#47278", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43267", "S#47279", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43268", "S#47280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43263", "S#47281", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43277", "S#47282", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43168", "S#47283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43280", "S#47284", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43281", "S#47285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43145", "S#47286", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43273", "S#47287", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43276", "S#47288", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43068", "S#47289", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43288", "S#47290", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43289", "S#47291", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43290", "S#47292", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43270", "S#47293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43286", "S#47294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43294", "S#47295", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43287", "S#47296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43300", "S#47297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43297", "S#47298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43301", "S#47299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43303", "S#47300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43295", "S#47301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43302", "S#47302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43264", "S#47303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43275", "S#47304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43269", "S#47305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43306", "S#47306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43307", "S#47307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43308", "S#47308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43311", "S#47309", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43312", "S#47310", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43309", "S#47311", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43314", "S#47312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43315", "S#47313", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43316", "S#47314", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43319", "S#47315", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43320", "S#47316", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43318", "S#47317", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43322", "S#47318", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43325", "S#47319", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43326", "S#47320", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43327", "S#47321", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43328", "S#47322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43330", "S#47323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43331", "S#47324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43332", "S#47325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43329", "S#47326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43334", "S#47327", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43333", "S#47328", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43310", "S#47329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43335", "S#47330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43337", "S#47331", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43338", "S#47332", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43305", "S#47333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43283", "S#47334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43339", "S#47335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43343", "S#47336", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43342", "S#47337", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43340", "S#47338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43345", "S#47339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43346", "S#47340", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43066", "S#47341", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43347", "S#47342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43321", "S#47343", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43344", "S#47344", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43129", "S#47345", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43124", "S#47346", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43349", "S#47347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43350", "S#47348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43351", "S#47349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43352", "S#47350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43353", "S#47351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43128", "S#47352", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43354", "S#47353", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43356", "S#47354", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43357", "S#47355", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43348", "S#47356", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43358", "S#47357", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43296", "S#47358", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43359", "S#47359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43148", "S#47360", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43360", "S#47361", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43324", "S#47362", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43363", "S#47363", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43341", "S#47364", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43355", "S#47365", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43365", "S#47366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43130", "S#47367", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43366", "S#47368", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43254", "S#47369", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43368", "S#47370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43367", "S#47371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43323", "S#47372", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43370", "S#47373", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43361", "S#47374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43362", "S#47375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43070", "S#47376", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43374", "S#47377", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43375", "S#47378", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43373", "S#47379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43376", "S#47380", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43155", "S#47381", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43364", "S#47382", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43143", "S#47383", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43377", "S#47384", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43378", "S#47385", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43379", "S#47386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43380", "S#47387", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43167", "S#47388", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43386", "S#47389", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43383", "S#47390", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43387", "S#47391", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43388", "S#47392", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43389", "S#47393", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43313", "S#47394", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43336", "S#47395", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43304", "S#47396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43279", "S#47397", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43372", "S#47398", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43371", "S#47399", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43391", "S#47400", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43390", "S#47401", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43392", "S#47402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43110", "S#47099", 1, 0, false);
        new $f43110$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43394", "S#47403", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43395", "S#47404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43396", "S#47405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43397", "S#47406", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43398", "S#47407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43399", "S#47408", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43400", "S#47409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43401", "S#47410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43402", "S#47411", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43403", "S#47412", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43404", "S#47413", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43405", "S#47414", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43406", "S#47415", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43393", "S#47416", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43407", "S#47417", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43408", "S#47418", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43117", "S#47419", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43381", "S#47420", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43382", "S#47421", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43384", "S#47422", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43385", "S#47423", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43292", "S#47424", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43118", "S#47425", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43409", "S#47426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43410", "S#47427", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43411", "S#47428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43412", "S#47429", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43413", "S#47430", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43414", "S#47431", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43198", "S#47432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43111", "S#47433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43415", "S#47434", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43416", "S#47435", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43141", "S#47436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43417", "S#47437", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43142", "S#47438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43291", "S#47439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43419", "S#47440", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43146", "S#47441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43298", "S#47442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43421", "S#47443", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43422", "S#47444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43423", "S#47445", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43271", "S#47446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43420", "S#47447", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43424", "S#47448", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43425", "S#47449", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43426", "S#47450", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43274", "S#47451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43427", "S#47452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43272", "S#47453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43299", "S#47454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43428", "S#47455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43202", "S#47456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43317", "S#47457", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43293", "S#47458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43418", "S#47459", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43429", "S#47460", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43430", "S#47461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43431", "S#47462", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43278", "S#47463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43432", "S#47464", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43433", "S#47465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43434", "S#47466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43161", "S#46917", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43435", "S#47467", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43437", "S#47101", 1, 0, false);
        new $f43437$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43438", "S#47468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43439", "S#47469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43440", "S#47470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43441", "S#47471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43442", "S#47472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43443", "S#47473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43444", "S#47474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43445", "S#47475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43446", "S#47476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43447", "S#47477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43448", "S#47478", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43449", "S#47479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43450", "S#47480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43436", "S#47481", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43451", "S#47482", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43453", "S#47483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43454", "S#47484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43455", "S#47485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43456", "S#47486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43457", "S#47487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43458", "S#47488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43459", "S#47489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43460", "IMPORT-OWL-ONTOLOGY-WITH-IMPORTER", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43461", "S#47490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43462", "S#47491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43464", "S#47492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43465", "S#47493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43466", "S#47494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43467", "S#47495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43452", "S#47496", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43463", "S#47497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43126", "S#47498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43284", "S#47499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43282", "S#47500", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43285", "S#47501", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43132", "S#47502", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43369", "S#47503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0709", "f43468", "S#47504", 1, 0, false);
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43470() {
        module0709.$g5539$ = SubLFiles.deflexical("S#47505", (SubLObject)((module0709.NIL != Symbols.boundp((SubLObject)module0709.$ic0$)) ? module0709.$g5539$.getGlobalValue() : module0709.NIL));
        module0709.$g5540$ = SubLFiles.defparameter("S#47506", (SubLObject)module0709.NIL);
        module0709.$g5541$ = SubLFiles.deflexical("S#47507", module0709.$ic36$);
        module0709.$g5542$ = SubLFiles.deflexical("S#47508", (SubLObject)module0709.$ic51$);
        module0709.$g5543$ = SubLFiles.deflexical("S#47509", (SubLObject)module0709.$ic52$);
        module0709.$g5544$ = SubLFiles.deflexical("S#47510", (SubLObject)module0709.$ic53$);
        module0709.$g5545$ = SubLFiles.deflexical("S#47511", (SubLObject)module0709.$ic54$);
        module0709.$g5546$ = SubLFiles.defparameter("S#47512", (SubLObject)module0709.$ic55$);
        module0709.$g5547$ = SubLFiles.defparameter("S#47513", (SubLObject)module0709.NIL);
        module0709.$g5548$ = SubLFiles.defparameter("S#47514", module0107.f7627());
        module0709.$g5549$ = SubLFiles.defparameter("S#47515", (SubLObject)module0709.NIL);
        module0709.$g5550$ = SubLFiles.defparameter("S#47516", (SubLObject)module0709.NIL);
        module0709.$g5551$ = SubLFiles.deflexical("S#47517", (SubLObject)module0709.NIL);
        module0709.$g5552$ = SubLFiles.deflexical("S#47518", (SubLObject)module0709.$ic88$);
        module0709.$g5553$ = SubLFiles.deflexical("S#47519", (SubLObject)module0709.NIL);
        module0709.$g5554$ = SubLFiles.defconstant("S#47520", (SubLObject)module0709.$ic125$);
        module0709.$g5555$ = SubLFiles.defconstant("S#47521", (SubLObject)module0709.$ic169$);
        module0709.$g5556$ = SubLFiles.deflexical("S#47522", (SubLObject)module0709.$ic225$);
        module0709.$g5557$ = SubLFiles.deflexical("S#47523", (SubLObject)module0709.NIL);
        module0709.$g5558$ = SubLFiles.deflexical("S#47524", (SubLObject)module0709.NIL);
        module0709.$g5559$ = SubLFiles.defparameter("S#47525", module0107.f7627());
        module0709.$g5560$ = SubLFiles.deflexical("S#47526", (SubLObject)module0709.NIL);
        module0709.$g5561$ = SubLFiles.defparameter("S#47527", (SubLObject)module0709.NIL);
        module0709.$g5562$ = SubLFiles.defparameter("S#47528", (SubLObject)module0709.NIL);
        module0709.$g5563$ = SubLFiles.deflexical("S#47529", (SubLObject)module0709.$ic393$);
        module0709.$g5564$ = SubLFiles.deflexical("S#47530", module0067.f4880(Symbols.symbol_function((SubLObject)module0709.EQUAL), (SubLObject)module0709.UNPROVIDED));
        module0709.$g5565$ = SubLFiles.deflexical("S#47531", (SubLObject)((module0709.NIL != Symbols.boundp((SubLObject)module0709.$ic419$)) ? module0709.$g5565$.getGlobalValue() : module0709.NIL));
        module0709.$g5566$ = SubLFiles.deflexical("S#47532", (SubLObject)((module0709.NIL != Symbols.boundp((SubLObject)module0709.$ic420$)) ? module0709.$g5566$.getGlobalValue() : module0709.NIL));
        module0709.$g5567$ = SubLFiles.deflexical("S#47533", (SubLObject)Characters.CHAR_vertical);
        module0709.$g5568$ = SubLFiles.deflexical("S#47534", (SubLObject)Characters.CHAR_exclamation);
        module0709.$g5569$ = SubLFiles.deflexical("S#47535", (SubLObject)((module0709.NIL != Symbols.boundp((SubLObject)module0709.$ic421$)) ? module0709.$g5569$.getGlobalValue() : module0709.NIL));
        module0709.$g5570$ = SubLFiles.deflexical("S#47536", (SubLObject)module0709.NIL);
        module0709.$g5571$ = SubLFiles.defparameter("S#47537", (SubLObject)module0709.NIL);
        module0709.$g5572$ = SubLFiles.deflexical("S#47538", (SubLObject)ConsesLow.list(reader.bq_cons(module0708.f43012((SubLObject)module0709.$ic497$), (SubLObject)module0709.$ic510$), reader.bq_cons(module0708.f43012((SubLObject)module0709.$ic499$), (SubLObject)module0709.$ic511$), reader.bq_cons(module0708.f43012((SubLObject)module0709.$ic501$), (SubLObject)module0709.$ic512$), reader.bq_cons(module0708.f43012((SubLObject)module0709.$ic505$), (SubLObject)module0709.$ic513$), reader.bq_cons(module0708.f43012((SubLObject)module0709.$ic508$), (SubLObject)module0709.$ic514$), reader.bq_cons(module0708.f43012((SubLObject)module0709.$ic503$), (SubLObject)module0709.$ic515$)));
        module0709.$g5573$ = SubLFiles.defparameter("S#47539", (SubLObject)module0709.ZERO_INTEGER);
        module0709.$g5574$ = SubLFiles.defconstant("S#47540", (SubLObject)module0709.$ic533$);
        module0709.$g5575$ = SubLFiles.deflexical("S#47541", (SubLObject)module0709.$ic624$);
        module0709.$g5576$ = SubLFiles.deflexical("S#47542", (SubLObject)module0709.NIL);
        module0709.$g5577$ = SubLFiles.defconstant("S#47543", (SubLObject)module0709.$ic641$);
        module0709.$g5578$ = SubLFiles.deflexical("S#47544", (SubLObject)((module0709.NIL != Symbols.boundp((SubLObject)module0709.$ic674$)) ? module0709.$g5578$.getGlobalValue() : module0709.NIL));
        return (SubLObject)module0709.NIL;
    }
    
    public static SubLObject f43471() {
        module0003.f57((SubLObject)module0709.$ic0$);
        module0709.$g5539$.setGlobalValue((SubLObject)module0709.$ic2$);
        module0034.f1895((SubLObject)module0709.$ic10$);
        module0034.f1895((SubLObject)module0709.$ic39$);
        module0034.f1895((SubLObject)module0709.$ic45$);
        module0034.f1895((SubLObject)module0709.$ic46$);
        module0002.f38((SubLObject)module0709.$ic61$);
        module0034.f1909((SubLObject)module0709.$ic77$);
        module0034.f1909((SubLObject)module0709.$ic106$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0709.$g5554$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic132$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0709.$ic133$);
        Structures.def_csetf((SubLObject)module0709.$ic134$, (SubLObject)module0709.$ic135$);
        Structures.def_csetf((SubLObject)module0709.$ic136$, (SubLObject)module0709.$ic137$);
        Structures.def_csetf((SubLObject)module0709.$ic138$, (SubLObject)module0709.$ic139$);
        Structures.def_csetf((SubLObject)module0709.$ic140$, (SubLObject)module0709.$ic141$);
        Structures.def_csetf((SubLObject)module0709.$ic142$, (SubLObject)module0709.$ic143$);
        Equality.identity((SubLObject)module0709.$ic125$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0709.$g5554$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic154$));
        module0012.f419((SubLObject)module0709.$ic131$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0709.$g5554$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic168$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0709.$g5555$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic176$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0709.$ic177$);
        Structures.def_csetf((SubLObject)module0709.$ic178$, (SubLObject)module0709.$ic179$);
        Structures.def_csetf((SubLObject)module0709.$ic180$, (SubLObject)module0709.$ic181$);
        Structures.def_csetf((SubLObject)module0709.$ic182$, (SubLObject)module0709.$ic183$);
        Structures.def_csetf((SubLObject)module0709.$ic184$, (SubLObject)module0709.$ic185$);
        Structures.def_csetf((SubLObject)module0709.$ic186$, (SubLObject)module0709.$ic187$);
        Structures.def_csetf((SubLObject)module0709.$ic188$, (SubLObject)module0709.$ic189$);
        Structures.def_csetf((SubLObject)module0709.$ic190$, (SubLObject)module0709.$ic191$);
        Structures.def_csetf((SubLObject)module0709.$ic192$, (SubLObject)module0709.$ic193$);
        Structures.def_csetf((SubLObject)module0709.$ic194$, (SubLObject)module0709.$ic195$);
        Structures.def_csetf((SubLObject)module0709.$ic196$, (SubLObject)module0709.$ic197$);
        Structures.def_csetf((SubLObject)module0709.$ic198$, (SubLObject)module0709.$ic199$);
        Structures.def_csetf((SubLObject)module0709.$ic200$, (SubLObject)module0709.$ic201$);
        Equality.identity((SubLObject)module0709.$ic169$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0709.$g5555$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic207$));
        module0012.f419((SubLObject)module0709.$ic175$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0709.$g5555$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic216$));
        module0034.f1909((SubLObject)module0709.$ic230$);
        module0034.f1909((SubLObject)module0709.$ic250$);
        module0034.f1909((SubLObject)module0709.$ic305$);
        module0034.f1895((SubLObject)module0709.$ic341$);
        module0034.f1895((SubLObject)module0709.$ic356$);
        module0034.f1895((SubLObject)module0709.$ic363$);
        module0034.f1895((SubLObject)module0709.$ic373$);
        module0003.f57((SubLObject)module0709.$ic419$);
        module0003.f57((SubLObject)module0709.$ic420$);
        module0003.f57((SubLObject)module0709.$ic421$);
        module0034.f1909((SubLObject)module0709.$ic449$);
        module0034.f1895((SubLObject)module0709.$ic452$);
        module0034.f1895((SubLObject)module0709.$ic520$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0709.$g5574$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic539$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0709.$ic540$);
        Structures.def_csetf((SubLObject)module0709.$ic541$, (SubLObject)module0709.$ic542$);
        Structures.def_csetf((SubLObject)module0709.$ic543$, (SubLObject)module0709.$ic544$);
        Structures.def_csetf((SubLObject)module0709.$ic545$, (SubLObject)module0709.$ic546$);
        Structures.def_csetf((SubLObject)module0709.$ic547$, (SubLObject)module0709.$ic548$);
        Structures.def_csetf((SubLObject)module0709.$ic549$, (SubLObject)module0709.$ic550$);
        Equality.identity((SubLObject)module0709.$ic533$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0709.$g5574$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic554$));
        module0012.f419((SubLObject)module0709.$ic538$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0709.$g5574$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic558$));
        module0034.f1909((SubLObject)module0709.$ic638$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0709.$g5577$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic648$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0709.$ic649$);
        Structures.def_csetf((SubLObject)module0709.$ic650$, (SubLObject)module0709.$ic651$);
        Structures.def_csetf((SubLObject)module0709.$ic652$, (SubLObject)module0709.$ic653$);
        Structures.def_csetf((SubLObject)module0709.$ic654$, (SubLObject)module0709.$ic655$);
        Structures.def_csetf((SubLObject)module0709.$ic656$, (SubLObject)module0709.$ic657$);
        Structures.def_csetf((SubLObject)module0709.$ic658$, (SubLObject)module0709.$ic659$);
        Equality.identity((SubLObject)module0709.$ic641$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0709.$g5577$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic666$));
        module0012.f419((SubLObject)module0709.$ic647$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0709.$g5577$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0709.$ic668$));
        module0002.f38((SubLObject)module0709.$ic669$);
        module0003.f57((SubLObject)module0709.$ic674$);
        return (SubLObject)module0709.NIL;
    }
    
    public void declareFunctions() {
        f43469();
    }
    
    public void initializeVariables() {
        f43470();
    }
    
    public void runTopLevelForms() {
        f43471();
    }
    
    static {
        me = (SubLFile)new module0709();
        module0709.$g5539$ = null;
        module0709.$g5540$ = null;
        module0709.$g5541$ = null;
        module0709.$g5542$ = null;
        module0709.$g5543$ = null;
        module0709.$g5544$ = null;
        module0709.$g5545$ = null;
        module0709.$g5546$ = null;
        module0709.$g5547$ = null;
        module0709.$g5548$ = null;
        module0709.$g5549$ = null;
        module0709.$g5550$ = null;
        module0709.$g5551$ = null;
        module0709.$g5552$ = null;
        module0709.$g5553$ = null;
        module0709.$g5554$ = null;
        module0709.$g5555$ = null;
        module0709.$g5556$ = null;
        module0709.$g5557$ = null;
        module0709.$g5558$ = null;
        module0709.$g5559$ = null;
        module0709.$g5560$ = null;
        module0709.$g5561$ = null;
        module0709.$g5562$ = null;
        module0709.$g5563$ = null;
        module0709.$g5564$ = null;
        module0709.$g5565$ = null;
        module0709.$g5566$ = null;
        module0709.$g5567$ = null;
        module0709.$g5568$ = null;
        module0709.$g5569$ = null;
        module0709.$g5570$ = null;
        module0709.$g5571$ = null;
        module0709.$g5572$ = null;
        module0709.$g5573$ = null;
        module0709.$g5574$ = null;
        module0709.$g5575$ = null;
        module0709.$g5576$ = null;
        module0709.$g5577$ = null;
        module0709.$g5578$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#47505", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $ic2$ = SubLObjectFactory.makeString("$Revision: 138034 $");
        $ic3$ = SubLObjectFactory.makeSymbol("HL-TERM-P");
        $ic4$ = SubLObjectFactory.makeSymbol("S#3298", "CYC");
        $ic5$ = SubLObjectFactory.makeInteger(255);
        $ic6$ = SubLObjectFactory.makeInteger(100);
        $ic7$ = SubLObjectFactory.makeSymbol(">");
        $ic8$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLOntologyQuery-GetRootClasses"));
        $ic9$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#47110", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic12$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic13$ = SubLObjectFactory.makeKeyword("GAF");
        $ic14$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:Ontology"));
        $ic15$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic16$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:imports"));
        $ic17$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic18$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic19$ = SubLObjectFactory.makeString("Can't find path from ~S to #$Thing.");
        $ic20$ = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $ic21$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic22$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic23$ = SubLObjectFactory.makeKeyword("STACK");
        $ic24$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic25$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic26$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic27$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic29$ = SubLObjectFactory.makeString("continue anyway");
        $ic30$ = SubLObjectFactory.makeKeyword("WARN");
        $ic31$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic32$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic33$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic34$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic35$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLMappingMt"));
        $ic37$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("coExtensional"));
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic39$ = SubLObjectFactory.makeSymbol("S#47127", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#17581", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic43$ = SubLObjectFactory.makeSymbol("S#12280", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#12278", "CYC");
        $ic45$ = SubLObjectFactory.makeSymbol("S#47131", "CYC");
        $ic46$ = SubLObjectFactory.makeSymbol("S#47133", "CYC");
        $ic47$ = SubLObjectFactory.makeKeyword("UP");
        $ic48$ = SubLObjectFactory.makeString("Of");
        $ic49$ = SubLObjectFactory.makeKeyword("COLLECTION");
        $ic50$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic51$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("UnknownOrganization"), SubLObjectFactory.makeString("FinancialOrganization"), SubLObjectFactory.makeString("GovernmentalOrganization"), SubLObjectFactory.makeString("EducationResearchOrganization"), SubLObjectFactory.makeString("MilitaryOrganization"), SubLObjectFactory.makeString("Organization"), SubLObjectFactory.makeString("NGO"), SubLObjectFactory.makeString("PoliticalOrganization"), SubLObjectFactory.makeString("ReligiousOrganization"), SubLObjectFactory.makeString("ResidentialBuilding"), SubLObjectFactory.makeString("EmbassyBuilding"), SubLObjectFactory.makeString("MinistryBuilding"), SubLObjectFactory.makeString("ShoppingMall"), SubLObjectFactory.makeString("Road"), SubLObjectFactory.makeString("Bridge"), SubLObjectFactory.makeString("Hospital"), SubLObjectFactory.makeString("TrainingCamp"), SubLObjectFactory.makeString("Park"), SubLObjectFactory.makeString("ReligousFacility"), SubLObjectFactory.makeString("Stadium"), SubLObjectFactory.makeString("OfficeBuilding"), SubLObjectFactory.makeString("IndustrialFacility"), SubLObjectFactory.makeString("EducationalInstitution"), SubLObjectFactory.makeString("CivicStructure"), SubLObjectFactory.makeString("Airport"), SubLObjectFactory.makeString("Hideout"), SubLObjectFactory.makeString("Kidnapping"), SubLObjectFactory.makeString("Arrest"), SubLObjectFactory.makeString("HostageTaking"), SubLObjectFactory.makeString("Uncovering"), SubLObjectFactory.makeString("Sneaking"), SubLObjectFactory.makeString("FailedTerrorPlot"), SubLObjectFactory.makeString("Assasination"), SubLObjectFactory.makeString("Execution"), SubLObjectFactory.makeString("ConflictEvent"), SubLObjectFactory.makeString("TerroristAttack"), SubLObjectFactory.makeString("Killing"), SubLObjectFactory.makeString("CoupAttempt"), SubLObjectFactory.makeString("Bombing"), SubLObjectFactory.makeString("CitizenPeopleGroup"), SubLObjectFactory.makeString("CivilianPeopleGroup"), SubLObjectFactory.makeString("Agent"), SubLObjectFactory.makeString("Event"), SubLObjectFactory.makeString("MinistryOfCulture"), SubLObjectFactory.makeString("Ministry"), SubLObjectFactory.makeString("Location"), SubLObjectFactory.makeString("Insurgent"), SubLObjectFactory.makeString("Citizen"), SubLObjectFactory.makeString("CivilianPerson"), SubLObjectFactory.makeString("HighSchool"), SubLObjectFactory.makeString("University"), SubLObjectFactory.makeString("Funeral"), SubLObjectFactory.makeString("Wedding"), SubLObjectFactory.makeString("CivilianEvent"), SubLObjectFactory.makeString("UnknownPeopleGroup"), SubLObjectFactory.makeString("PeopleGroup"), SubLObjectFactory.makeString("MilitaryEvent"), SubLObjectFactory.makeString("GovernmentalEvent"), SubLObjectFactory.makeString("SocioReligousEvent"), SubLObjectFactory.makeString("BookOrManifesto"), SubLObjectFactory.makeString("Bank"), SubLObjectFactory.makeString("Company"), SubLObjectFactory.makeString("CapitalCity"), SubLObjectFactory.makeString("City"), SubLObjectFactory.makeString("GeneralElection"), SubLObjectFactory.makeString("repeatingEvent"), SubLObjectFactory.makeString("Election"), SubLObjectFactory.makeString("Synagogue"), SubLObjectFactory.makeString("Mosque"), SubLObjectFactory.makeString("Church"), SubLObjectFactory.makeString("Temple"), SubLObjectFactory.makeString("departureLocation"), SubLObjectFactory.makeString("GeopoliticalLocation"), SubLObjectFactory.makeString("destination"), SubLObjectFactory.makeString("UnknownPerson"), SubLObjectFactory.makeString("GovernmentalPerson"), SubLObjectFactory.makeString("Person"), SubLObjectFactory.makeString("affiliatedWith"), SubLObjectFactory.makeString("PowerPlant"), SubLObjectFactory.makeString("NavalFacility"), SubLObjectFactory.makeString("NuclearFacility"), SubLObjectFactory.makeString("SuicideBombing"), SubLObjectFactory.makeString("Anniversary"), SubLObjectFactory.makeString("Group"), SubLObjectFactory.makeString("numberOfGrupMembers"), SubLObjectFactory.makeString("PoliticalParty"), SubLObjectFactory.makeString("TerroristOrganization"), SubLObjectFactory.makeString("State"), SubLObjectFactory.makeString("Country"), SubLObjectFactory.makeString("Province"), SubLObjectFactory.makeString("InsurgentPeopleGroup"), SubLObjectFactory.makeString("GovernmentalPeopleGroup"), SubLObjectFactory.makeString("Embassy"), SubLObjectFactory.makeString("MilitaryPerson"), SubLObjectFactory.makeString("War"), SubLObjectFactory.makeString("MilitaryPeopleGroup"), SubLObjectFactory.makeString("hasSpokesman"), SubLObjectFactory.makeString("isSpokesmanFor"), SubLObjectFactory.makeString("hasMember"), SubLObjectFactory.makeString("ideologistFor"), SubLObjectFactory.makeString("hasIdeologist"), SubLObjectFactory.makeString("husbandOf"), SubLObjectFactory.makeString("spouseOf"), SubLObjectFactory.makeString("wifeOf"), SubLObjectFactory.makeString("hasSubevent"), SubLObjectFactory.makeString("cityInCountry"), SubLObjectFactory.makeString("hasCity"), SubLObjectFactory.makeString("presentAt"), SubLObjectFactory.makeString("hasAttendant"), SubLObjectFactory.makeString("hasFollower"), SubLObjectFactory.makeString("followerOf"), SubLObjectFactory.makeString("chiefOf"), SubLObjectFactory.makeString("hasChief"), SubLObjectFactory.makeString("leaderOf"), SubLObjectFactory.makeString("memberOf"), SubLObjectFactory.makeString("hasDirector"), SubLObjectFactory.makeString("directorOf"), SubLObjectFactory.makeString("provinceInCountry"), SubLObjectFactory.makeString("hasProvince"), SubLObjectFactory.makeString("acquiredNationality"), SubLObjectFactory.makeString("victimOf"), SubLObjectFactory.makeString("hasVictim"), SubLObjectFactory.makeString("isPressSecretaryFor"), SubLObjectFactory.makeString("hasPressSecretary"), SubLObjectFactory.makeString("cousinOf"), SubLObjectFactory.makeString("familyRelativeOf"), SubLObjectFactory.makeString("subEventOf"), SubLObjectFactory.makeString("hasActor"), SubLObjectFactory.makeString("isActorOf"), SubLObjectFactory.makeString("hasChairman"), SubLObjectFactory.makeString("hasLeader"), SubLObjectFactory.makeString("isChairmanOf"), SubLObjectFactory.makeString("organizerOf"), SubLObjectFactory.makeString("organizedBy"), SubLObjectFactory.makeString("capitalCityInCountry"), SubLObjectFactory.makeString("hasCapitalCity"), SubLObjectFactory.makeString("childOf"), SubLObjectFactory.makeString("parentOf"), SubLObjectFactory.makeString("hasMilitant"), SubLObjectFactory.makeString("militantOf"), SubLObjectFactory.makeString("countryInState"), SubLObjectFactory.makeString("stateInCountry"), SubLObjectFactory.makeString("isPrimeMiniterOf"), SubLObjectFactory.makeString("hasPrimeMinister"), SubLObjectFactory.makeString("contactedBy"), SubLObjectFactory.makeString("contacts"), SubLObjectFactory.makeString("placeOfBirth"), SubLObjectFactory.makeString("residesIn"), SubLObjectFactory.makeString("killedAt"), SubLObjectFactory.makeString("hasPeopleKilled"), SubLObjectFactory.makeString("financedBy"), SubLObjectFactory.makeString("financierOf"), SubLObjectFactory.makeString("hasWounded"), SubLObjectFactory.makeString("woundedAt"), SubLObjectFactory.makeString("hasState"), SubLObjectFactory.makeString("isTargetOf"), SubLObjectFactory.makeString("hasTarget"), SubLObjectFactory.makeString("founderOf"), SubLObjectFactory.makeString("foundedBy"), SubLObjectFactory.makeString("arrestedAt"), SubLObjectFactory.makeString("hasPeopleArrested"), SubLObjectFactory.makeString("hasAuthor"), SubLObjectFactory.makeString("authorOf"), SubLObjectFactory.makeString("hasLocation"), SubLObjectFactory.makeString("locatedIn"), SubLObjectFactory.makeString("funderOf"), SubLObjectFactory.makeString("fundedBy"), SubLObjectFactory.makeString("isEventLocation"), SubLObjectFactory.makeString("locationOfEvent"), SubLObjectFactory.makeString("bornNationality"), SubLObjectFactory.makeString("employeeOf"), SubLObjectFactory.makeString("hasEmployee"), SubLObjectFactory.makeString("hasSuborganization"), SubLObjectFactory.makeString("subOrganizationOf"), SubLObjectFactory.makeString("happensAtPlace"), SubLObjectFactory.makeString("hasPart"), SubLObjectFactory.makeString("isPartOf"), SubLObjectFactory.makeString("contents"), SubLObjectFactory.makeString("startDateOfDuty"), SubLObjectFactory.makeString("occurenceTimeOfDate"), SubLObjectFactory.makeString("wikipediaEnrty"), SubLObjectFactory.makeString("currentOrganizationStatus"), SubLObjectFactory.makeString("langitude"), SubLObjectFactory.makeString("internationalOrganization"), SubLObjectFactory.makeString("eventTitles"), SubLObjectFactory.makeString("name"), SubLObjectFactory.makeString("damage"), SubLObjectFactory.makeString("endDateDuty"), SubLObjectFactory.makeString("numberHostages"), SubLObjectFactory.makeString("numberKilled"), SubLObjectFactory.makeString("publicName"), SubLObjectFactory.makeString("dateBirth"), SubLObjectFactory.makeString("currentPersonStatus"), SubLObjectFactory.makeString("dateArrested"), SubLObjectFactory.makeString("biography"), SubLObjectFactory.makeString("dateOfQuote"), SubLObjectFactory.makeString("lastName"), SubLObjectFactory.makeString("newsArticleId"), SubLObjectFactory.makeString("associatedKeywords"), SubLObjectFactory.makeString("filename"), SubLObjectFactory.makeString("startDate"), SubLObjectFactory.makeString("eventDate"), SubLObjectFactory.makeString("acronym"), SubLObjectFactory.makeString("firstName"), SubLObjectFactory.makeString("numberArrested"), SubLObjectFactory.makeString("recurrence"), SubLObjectFactory.makeString("currentlyInCharge"), SubLObjectFactory.makeString("homepage"), SubLObjectFactory.makeString("numberInjured"), SubLObjectFactory.makeString("picture"), SubLObjectFactory.makeString("endDate"), SubLObjectFactory.makeString("otherGivenNames"), SubLObjectFactory.makeString("associatedAlerts"), SubLObjectFactory.makeString("associatedNewsArticles"), SubLObjectFactory.makeString("size"), SubLObjectFactory.makeString("purpose"), SubLObjectFactory.makeString("dateDeath"), SubLObjectFactory.makeString("newsResource"), SubLObjectFactory.makeString("zipCode"), SubLObjectFactory.makeString("occurrenceDate"), SubLObjectFactory.makeString("associatedTitles"), SubLObjectFactory.makeString("foundationDate"), SubLObjectFactory.makeString("religion"), SubLObjectFactory.makeString("duration"), SubLObjectFactory.makeString("description"), SubLObjectFactory.makeString("email"), SubLObjectFactory.makeString("clusterId"), SubLObjectFactory.makeString("idEMM"), SubLObjectFactory.makeString("address"), SubLObjectFactory.makeString("maritalStatus"), SubLObjectFactory.makeString("occupation"), SubLObjectFactory.makeString("latitude"), SubLObjectFactory.makeString("title"), SubLObjectFactory.makeString("language"), SubLObjectFactory.makeString("colleagueOf"), SubLObjectFactory.makeString("siblingOf"), SubLObjectFactory.makeString("housemateOf"), SubLObjectFactory.makeString("friendOf"), SubLObjectFactory.makeString("gender"), SubLObjectFactory.makeString("areasOfOperation") });
        $ic52$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Bridge"), SubLObjectFactory.makeString("Citizen"), SubLObjectFactory.makeString("Airport"), SubLObjectFactory.makeString("Arrest"), SubLObjectFactory.makeString("ReligousFacility"), SubLObjectFactory.makeString("Bombing"), SubLObjectFactory.makeString("Election"), SubLObjectFactory.makeString("Sneaking"), SubLObjectFactory.makeString("BookOrManifesto"), SubLObjectFactory.makeString("Hideout"), SubLObjectFactory.makeString("Hospital"), SubLObjectFactory.makeString("HostageTaking"), SubLObjectFactory.makeString("Wedding"), SubLObjectFactory.makeString("GovernmentalPerson"), SubLObjectFactory.makeString("Park"), SubLObjectFactory.makeString("OfficeBuilding"), SubLObjectFactory.makeString("TrainingCamp"), SubLObjectFactory.makeString("NGO"), SubLObjectFactory.makeString("Church"), SubLObjectFactory.makeString("NavalFacility"), SubLObjectFactory.makeString("GovernmentalEvent"), SubLObjectFactory.makeString("Killing"), SubLObjectFactory.makeString("CivilianPeopleGroup"), SubLObjectFactory.makeString("NuclearFacility"), SubLObjectFactory.makeString("Company"), SubLObjectFactory.makeString("MinistryBuilding"), SubLObjectFactory.makeString("CivilianEvent"), SubLObjectFactory.makeString("University"), SubLObjectFactory.makeString("CoupAttempt"), SubLObjectFactory.makeString("Uncovering"), SubLObjectFactory.makeString("PeopleGroup"), SubLObjectFactory.makeString("TerroristOrganization"), SubLObjectFactory.makeString("PoliticalOrganization"), SubLObjectFactory.makeString("EmbassyBuilding"), SubLObjectFactory.makeString("MilitaryOrganization"), SubLObjectFactory.makeString("ReligiousOrganization"), SubLObjectFactory.makeString("Stadium"), SubLObjectFactory.makeString("EducationalInstitution"), SubLObjectFactory.makeString("EducationResearchOrganization"), SubLObjectFactory.makeString("Temple"), SubLObjectFactory.makeString("IndustrialFacility"), SubLObjectFactory.makeString("Country"), SubLObjectFactory.makeString("Province"), SubLObjectFactory.makeString("Mosque"), SubLObjectFactory.makeString("Execution"), SubLObjectFactory.makeString("Road"), SubLObjectFactory.makeString("FailedTerrorPlot"), SubLObjectFactory.makeString("SocioReligousEvent"), SubLObjectFactory.makeString("Assasination"), SubLObjectFactory.makeString("TerroristAttack"), SubLObjectFactory.makeString("GovernmentalOrganization"), SubLObjectFactory.makeString("ShoppingMall"), SubLObjectFactory.makeString("Ministry"), SubLObjectFactory.makeString("CivilianPerson"), SubLObjectFactory.makeString("CivicStructure"), SubLObjectFactory.makeString("FinancialOrganization"), SubLObjectFactory.makeString("hasCity"), SubLObjectFactory.makeString("wifeOf"), SubLObjectFactory.makeString("hasIdeologist"), SubLObjectFactory.makeString("departureLocation"), SubLObjectFactory.makeString("memberOf"), SubLObjectFactory.makeString("hasAttendant"), SubLObjectFactory.makeString("stateInCountry"), SubLObjectFactory.makeString("hasPeopleKilled"), SubLObjectFactory.makeString("hasLeader"), SubLObjectFactory.makeString("hasTarget"), SubLObjectFactory.makeString("destination"), SubLObjectFactory.makeString("City"), SubLObjectFactory.makeString("GeopoliticalLocation"), SubLObjectFactory.makeString("militantOf"), SubLObjectFactory.makeString("hasVictim"), SubLObjectFactory.makeString("hasProvince"), SubLObjectFactory.makeString("foundedBy"), SubLObjectFactory.makeString("locationOfEvent"), SubLObjectFactory.makeString("hasPressSecretary"), SubLObjectFactory.makeString("followerOf"), SubLObjectFactory.makeString("directorOf"), SubLObjectFactory.makeString("woundedAt"), SubLObjectFactory.makeString("isSpokesmanFor"), SubLObjectFactory.makeString("organizedBy"), SubLObjectFactory.makeString("hasCapitalCity"), SubLObjectFactory.makeString("hasPeopleArrested"), SubLObjectFactory.makeString("spouseOf"), SubLObjectFactory.makeString("isChairmanOf"), SubLObjectFactory.makeString("leaderOf"), SubLObjectFactory.makeString("contacts"), SubLObjectFactory.makeString("hasMember"), SubLObjectFactory.makeString("financierOf"), SubLObjectFactory.makeString("hasState"), SubLObjectFactory.makeString("hasEmployee"), SubLObjectFactory.makeString("authorOf"), SubLObjectFactory.makeString("hasPrimeMinister"), SubLObjectFactory.makeString("affiliatedWith"), SubLObjectFactory.makeString("hasChief"), SubLObjectFactory.makeString("isActorOf"), SubLObjectFactory.makeString("parentOf"), SubLObjectFactory.makeString("fundedBy"), SubLObjectFactory.makeString("CapitalCity"), SubLObjectFactory.makeString("ConflictEvent"), SubLObjectFactory.makeString("MilitaryEvent"), SubLObjectFactory.makeString("Agent"), SubLObjectFactory.makeString("Event"), SubLObjectFactory.makeString("repeatingEvent"), SubLObjectFactory.makeString("numberOfGrupMembers"), SubLObjectFactory.makeString("eventDate"), SubLObjectFactory.makeString("Location"), SubLObjectFactory.makeString("Organization"), SubLObjectFactory.makeString("Person"), SubLObjectFactory.makeString("subOrganizationOf"), SubLObjectFactory.makeString("isPartOf"), SubLObjectFactory.makeString("locatedIn"), SubLObjectFactory.makeString("familyRelativeOf") });
        $ic53$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("Insurgent"), SubLObjectFactory.makeString("Funeral"), SubLObjectFactory.makeString("CivilianPeopleGroup"), SubLObjectFactory.makeString("PowerPlant"), SubLObjectFactory.makeString("NavalFacility"), SubLObjectFactory.makeString("Bank"), SubLObjectFactory.makeString("HighSchool"), SubLObjectFactory.makeString("PoliticalParty"), SubLObjectFactory.makeString("Church"), SubLObjectFactory.makeString("Synagogue"), SubLObjectFactory.makeString("Temple"), SubLObjectFactory.makeString("CivilianEvent"), SubLObjectFactory.makeString("GovernmentalEvent"), SubLObjectFactory.makeString("MilitaryEvent"), SubLObjectFactory.makeString("Bombing"), SubLObjectFactory.makeString("CoupAttempt"), SubLObjectFactory.makeString("Execution"), SubLObjectFactory.makeString("Uncovering"), SubLObjectFactory.makeString("Arrest"), SubLObjectFactory.makeString("FailedTerrorPlot"), SubLObjectFactory.makeString("Killing"), SubLObjectFactory.makeString("Assasination"), SubLObjectFactory.makeString("HostageTaking"), SubLObjectFactory.makeString("Kidnapping"), SubLObjectFactory.makeString("TrainingCamp"), SubLObjectFactory.makeString("IndustrialFacility"), SubLObjectFactory.makeString("Park"), SubLObjectFactory.makeString("MinistryBuilding"), SubLObjectFactory.makeString("ResidentialBuilding"), SubLObjectFactory.makeString("Stadium"), SubLObjectFactory.makeString("Hideout"), SubLObjectFactory.makeString("OfficeBuilding"), SubLObjectFactory.makeString("Airport"), SubLObjectFactory.makeString("EducationalInstitution"), SubLObjectFactory.makeString("EmbassyBuilding"), SubLObjectFactory.makeString("ReligousFacility"), SubLObjectFactory.makeString("Bridge"), SubLObjectFactory.makeString("Road"), SubLObjectFactory.makeString("Hospital"), SubLObjectFactory.makeString("Embassy"), SubLObjectFactory.makeString("GovernmentalPeopleGroup"), SubLObjectFactory.makeString("GovernmentalPerson"), SubLObjectFactory.makeString("UnknownPerson"), SubLObjectFactory.makeString("GeopoliticalLocation"), SubLObjectFactory.makeString("ReligiousOrganization"), SubLObjectFactory.makeString("UnknownOrganization"), SubLObjectFactory.makeString("MilitaryOrganization"), SubLObjectFactory.makeString("NGO"), SubLObjectFactory.makeString("GovernmentalOrganization"), SubLObjectFactory.makeString("PoliticalOrganization"), SubLObjectFactory.makeString("EducationResearchOrganization"), SubLObjectFactory.makeString("cousinOf"), SubLObjectFactory.makeString("husbandOf"), SubLObjectFactory.makeString("ideologistFor"), SubLObjectFactory.makeString("cityInCountry"), SubLObjectFactory.makeString("presentAt"), SubLObjectFactory.makeString("killedAt"), SubLObjectFactory.makeString("isTargetOf"), SubLObjectFactory.makeString("Sneaking"), SubLObjectFactory.makeString("hasMilitant"), SubLObjectFactory.makeString("TerroristOrganization"), SubLObjectFactory.makeString("victimOf"), SubLObjectFactory.makeString("Province"), SubLObjectFactory.makeString("provinceInCountry"), SubLObjectFactory.makeString("founderOf"), SubLObjectFactory.makeString("isEventLocation"), SubLObjectFactory.makeString("isPressSecretaryFor"), SubLObjectFactory.makeString("hasFollower"), SubLObjectFactory.makeString("hasDirector"), SubLObjectFactory.makeString("hasWounded"), SubLObjectFactory.makeString("hasSpokesman"), SubLObjectFactory.makeString("organizerOf"), SubLObjectFactory.makeString("CapitalCity"), SubLObjectFactory.makeString("hasCity"), SubLObjectFactory.makeString("capitalCityInCountry"), SubLObjectFactory.makeString("arrestedAt"), SubLObjectFactory.makeString("spouseOf"), SubLObjectFactory.makeString("hasChairman"), SubLObjectFactory.makeString("contactedBy"), SubLObjectFactory.makeString("memberOf"), SubLObjectFactory.makeString("financedBy"), SubLObjectFactory.makeString("State"), SubLObjectFactory.makeString("Country"), SubLObjectFactory.makeString("stateInCountry"), SubLObjectFactory.makeString("hasMember"), SubLObjectFactory.makeString("employeeOf"), SubLObjectFactory.makeString("BookOrManifesto"), SubLObjectFactory.makeString("hasAuthor"), SubLObjectFactory.makeString("isPrimeMiniterOf"), SubLObjectFactory.makeString("hasLeader"), SubLObjectFactory.makeString("chiefOf"), SubLObjectFactory.makeString("hasActor"), SubLObjectFactory.makeString("childOf"), SubLObjectFactory.makeString("funderOf"), SubLObjectFactory.makeString("damage"), SubLObjectFactory.makeString("ConflictEvent"), SubLObjectFactory.makeString("name"), SubLObjectFactory.makeString("Group"), SubLObjectFactory.makeString("Event"), SubLObjectFactory.makeString("Agent"), SubLObjectFactory.makeString("colleagueOf"), SubLObjectFactory.makeString("hasSuborganization"), SubLObjectFactory.makeString("siblingOf"), SubLObjectFactory.makeString("City"), SubLObjectFactory.makeString("hasPart"), SubLObjectFactory.makeString("CivicStructure"), SubLObjectFactory.makeString("hasLocation"), SubLObjectFactory.makeString("housemateOf"), SubLObjectFactory.makeString("familyRelativeOf"), SubLObjectFactory.makeString("friendOf"), SubLObjectFactory.makeString("Person"), SubLObjectFactory.makeString("Location"), SubLObjectFactory.makeString("affiliatedWith"), SubLObjectFactory.makeString("Organization") });
        $ic54$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPERTY"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("BNODE"));
        $ic56$ = SubLObjectFactory.makeSymbol("S#361", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#47146", "CYC");
        $ic59$ = SubLObjectFactory.makeKeyword("PROPERTY");
        $ic60$ = SubLObjectFactory.makeString("~S is not a valid definition type. Must be one of ~S");
        $ic61$ = SubLObjectFactory.makeSymbol("IMPORT-OWL-ONTOLOGY");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("ONTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("CYCLIST"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"));
        $ic63$ = SubLObjectFactory.makeKeyword("URI");
        $ic64$ = SubLObjectFactory.makeKeyword("URI-PREFIX");
        $ic65$ = SubLObjectFactory.makeKeyword("CONSTANT-PREFIX");
        $ic66$ = SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX");
        $ic67$ = SubLObjectFactory.makeKeyword("SOURCE");
        $ic68$ = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $ic69$ = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $ic70$ = SubLObjectFactory.makeKeyword("CYCLIST");
        $ic71$ = SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?");
        $ic72$ = SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?");
        $ic73$ = SubLObjectFactory.makeString("Can only import OWL ontologies from valid files or URLs.");
        $ic74$ = SubLObjectFactory.makeSymbol("S#39641", "CYC");
        $ic75$ = SubLObjectFactory.makeKeyword("FILE");
        $ic76$ = SubLObjectFactory.makeKeyword("URL");
        $ic77$ = SubLObjectFactory.makeSymbol("S#47154", "CYC");
        $ic78$ = SubLObjectFactory.makeKeyword("INPUT");
        $ic79$ = SubLObjectFactory.makeString("Unable to open ~S");
        $ic80$ = SubLObjectFactory.makeSymbol("S#4151", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#47517", "CYC");
        $ic82$ = SubLObjectFactory.makeInteger(48);
        $ic83$ = SubLObjectFactory.makeString("~&Importing ~S from ~S...~%");
        $ic84$ = SubLObjectFactory.makeKeyword("CLASS");
        $ic85$ = SubLObjectFactory.makeString("Processing ~D class definition~:P...");
        $ic86$ = SubLObjectFactory.makeKeyword("INSTANCE");
        $ic87$ = SubLObjectFactory.makeString("Processing ~D instance definition~:P...");
        $ic88$ = SubLObjectFactory.makeString("utf-8");
        $ic89$ = SubLObjectFactory.makeString("?xml");
        $ic90$ = SubLObjectFactory.makeString("encoding");
        $ic91$ = SubLObjectFactory.makeString("OWLImport-");
        $ic92$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ImportingAnOWLFileIntoAKnowledgeBase")));
        $ic93$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic94$ = SubLObjectFactory.makeString("");
        $ic95$ = SubLObjectFactory.makeKeyword("UPCASE");
        $ic96$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("startingDate"));
        $ic97$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("infoTransferred"));
        $ic98$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("doneBy"));
        $ic99$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("endingDate"));
        $ic100$ = SubLObjectFactory.makeString("Ontology");
        $ic101$ = SubLObjectFactory.makeString("RDF");
        $ic102$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39890", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1762", "CYC"));
        $ic103$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39891", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic104$ = SubLObjectFactory.makeString("base");
        $ic105$ = SubLObjectFactory.makeString("Can't recognize alleged base URI ~S as a URI.");
        $ic106$ = SubLObjectFactory.makeSymbol("S#47169", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#47519", "CYC");
        $ic108$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ContextOfPCWFn"));
        $ic109$ = SubLObjectFactory.makeString("Expected ontology token, got ~S");
        $ic110$ = SubLObjectFactory.makeString("Couldn't find closing Ontology tag.~% ~S");
        $ic111$ = SubLObjectFactory.makeInteger(32);
        $ic112$ = SubLObjectFactory.makeString("comment");
        $ic113$ = SubLObjectFactory.makeString("Expecting comment, got ~S");
        $ic114$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:comment"));
        $ic115$ = SubLObjectFactory.makeString("label");
        $ic116$ = SubLObjectFactory.makeString("lang");
        $ic117$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $ic118$ = SubLObjectFactory.makeString("Expecting label, got ~S");
        $ic119$ = SubLObjectFactory.makeString("priorVersion");
        $ic120$ = SubLObjectFactory.makeString("about");
        $ic121$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:priorVersion"));
        $ic122$ = SubLObjectFactory.makeString("imports");
        $ic123$ = SubLObjectFactory.makeString("versionInfo");
        $ic124$ = SubLObjectFactory.makeString("Don't know how to handle ontology info from ~S");
        $ic125$ = SubLObjectFactory.makeSymbol("S#47094", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#47095", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47545", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("S#13148", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47546", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("DOMAINS"), (SubLObject)SubLObjectFactory.makeKeyword("RANGE"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47173", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47174", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47175", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47176", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47177", "CYC"));
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47178", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47179", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47180", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47181", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47182", "CYC"));
        $ic131$ = SubLObjectFactory.makeSymbol("S#47186", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#47172", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#47095", "CYC"));
        $ic134$ = SubLObjectFactory.makeSymbol("S#47173", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#47178", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#47174", "CYC");
        $ic137$ = SubLObjectFactory.makeSymbol("S#47179", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#47175", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#47180", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#47176", "CYC");
        $ic141$ = SubLObjectFactory.makeSymbol("S#47181", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("S#47177", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("S#47182", "CYC");
        $ic144$ = SubLObjectFactory.makeKeyword("CYC-NAME");
        $ic145$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic146$ = SubLObjectFactory.makeKeyword("DOMAINS");
        $ic147$ = SubLObjectFactory.makeKeyword("RANGE");
        $ic148$ = SubLObjectFactory.makeKeyword("PLIST");
        $ic149$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic150$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic151$ = SubLObjectFactory.makeSymbol("S#47183", "CYC");
        $ic152$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic153$ = SubLObjectFactory.makeKeyword("END");
        $ic154$ = SubLObjectFactory.makeSymbol("S#47185", "CYC");
        $ic155$ = SubLObjectFactory.makeString("<OWL-PRED-INFO ~A>");
        $ic156$ = SubLObjectFactory.makeKeyword("EXTERNAL-NAME");
        $ic157$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic158$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic159$ = SubLObjectFactory.makeSymbol("S#47201", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT-OF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47201", "CYC")));
        $ic161$ = SubLObjectFactory.makeSymbol("S#47374", "CYC");
        $ic162$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $ic163$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESTRICTION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic164$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNION"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic165$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("INTERSECTION-OF"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic166$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ONE-OF"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic167$ = SubLObjectFactory.makeSymbol("S#47208", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#47212", "CYC");
        $ic169$ = SubLObjectFactory.makeSymbol("S#47096", "CYC");
        $ic170$ = SubLObjectFactory.makeSymbol("S#47097", "CYC");
        $ic171$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#47547", "CYC"), SubLObjectFactory.makeSymbol("S#47548", "CYC"), SubLObjectFactory.makeSymbol("S#47549", "CYC"), SubLObjectFactory.makeSymbol("S#47550", "CYC"), SubLObjectFactory.makeSymbol("S#46900", "CYC"), SubLObjectFactory.makeSymbol("S#47551", "CYC"), SubLObjectFactory.makeSymbol("S#710", "CYC"), SubLObjectFactory.makeSymbol("S#19620", "CYC"), SubLObjectFactory.makeSymbol("S#47552", "CYC"), SubLObjectFactory.makeSymbol("S#47553", "CYC"), SubLObjectFactory.makeSymbol("S#47554", "CYC"), SubLObjectFactory.makeSymbol("S#4664", "CYC") });
        $ic172$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ONTOLOGY"), SubLObjectFactory.makeKeyword("NAMESPACE-MAP"), SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX"), SubLObjectFactory.makeKeyword("BASE-URI"), SubLObjectFactory.makeKeyword("URI-PREFIX"), SubLObjectFactory.makeKeyword("CYCLIST"), SubLObjectFactory.makeKeyword("QUOTED-ISA"), SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"), SubLObjectFactory.makeKeyword("IMPORT-TERM"), SubLObjectFactory.makeKeyword("ENCODING") });
        $ic173$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#47215", "CYC"), SubLObjectFactory.makeSymbol("S#47216", "CYC"), SubLObjectFactory.makeSymbol("S#47217", "CYC"), SubLObjectFactory.makeSymbol("S#47218", "CYC"), SubLObjectFactory.makeSymbol("S#47219", "CYC"), SubLObjectFactory.makeSymbol("S#47220", "CYC"), SubLObjectFactory.makeSymbol("S#47221", "CYC"), SubLObjectFactory.makeSymbol("S#47222", "CYC"), SubLObjectFactory.makeSymbol("S#47223", "CYC"), SubLObjectFactory.makeSymbol("S#47224", "CYC"), SubLObjectFactory.makeSymbol("S#47225", "CYC"), SubLObjectFactory.makeSymbol("S#47226", "CYC") });
        $ic174$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#47227", "CYC"), SubLObjectFactory.makeSymbol("S#47228", "CYC"), SubLObjectFactory.makeSymbol("S#47229", "CYC"), SubLObjectFactory.makeSymbol("S#47230", "CYC"), SubLObjectFactory.makeSymbol("S#47231", "CYC"), SubLObjectFactory.makeSymbol("S#47232", "CYC"), SubLObjectFactory.makeSymbol("S#47233", "CYC"), SubLObjectFactory.makeSymbol("S#47234", "CYC"), SubLObjectFactory.makeSymbol("S#47235", "CYC"), SubLObjectFactory.makeSymbol("S#47236", "CYC"), SubLObjectFactory.makeSymbol("S#47237", "CYC"), SubLObjectFactory.makeSymbol("S#47238", "CYC") });
        $ic175$ = SubLObjectFactory.makeSymbol("S#47242", "CYC");
        $ic176$ = SubLObjectFactory.makeSymbol("S#47214", "CYC");
        $ic177$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#47097", "CYC"));
        $ic178$ = SubLObjectFactory.makeSymbol("S#47215", "CYC");
        $ic179$ = SubLObjectFactory.makeSymbol("S#47227", "CYC");
        $ic180$ = SubLObjectFactory.makeSymbol("S#47216", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("S#47228", "CYC");
        $ic182$ = SubLObjectFactory.makeSymbol("S#47217", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#47229", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#47218", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#47230", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#47219", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#47231", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#47220", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#47232", "CYC");
        $ic190$ = SubLObjectFactory.makeSymbol("S#47221", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("S#47233", "CYC");
        $ic192$ = SubLObjectFactory.makeSymbol("S#47222", "CYC");
        $ic193$ = SubLObjectFactory.makeSymbol("S#47234", "CYC");
        $ic194$ = SubLObjectFactory.makeSymbol("S#47223", "CYC");
        $ic195$ = SubLObjectFactory.makeSymbol("S#47235", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#47224", "CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("S#47236", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#47225", "CYC");
        $ic199$ = SubLObjectFactory.makeSymbol("S#47237", "CYC");
        $ic200$ = SubLObjectFactory.makeSymbol("S#47226", "CYC");
        $ic201$ = SubLObjectFactory.makeSymbol("S#47238", "CYC");
        $ic202$ = SubLObjectFactory.makeKeyword("NAMESPACE-MAP");
        $ic203$ = SubLObjectFactory.makeKeyword("BASE-URI");
        $ic204$ = SubLObjectFactory.makeKeyword("IMPORT-TERM");
        $ic205$ = SubLObjectFactory.makeKeyword("ENCODING");
        $ic206$ = SubLObjectFactory.makeSymbol("S#47239", "CYC");
        $ic207$ = SubLObjectFactory.makeSymbol("S#47241", "CYC");
        $ic208$ = SubLObjectFactory.makeString("<OWL-IMPORT-PARAMETERS ~S>");
        $ic209$ = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic210$ = SubLObjectFactory.makeSymbol("S#17609", "CYC");
        $ic211$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SoftwareVersionFn"));
        $ic212$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLImporter-Cyc"));
        $ic213$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("UserOfProgramFn"));
        $ic214$ = SubLObjectFactory.makeString("Multiple uris for ~S:~% ~S~% ~S");
        $ic215$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic216$ = SubLObjectFactory.makeSymbol("S#47261", "CYC");
        $ic217$ = SubLObjectFactory.makeString("resource");
        $ic218$ = SubLObjectFactory.makeString("#");
        $ic219$ = SubLObjectFactory.makeString("interpretation of ");
        $ic220$ = SubLObjectFactory.makeString(" as a URI for an imported ontology.");
        $ic221$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#47091", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47555", "CYC"));
        $ic222$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39891", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1069245"));
        $ic223$ = SubLObjectFactory.makeString("Namespace problem: ~A");
        $ic224$ = SubLObjectFactory.makeString("xmlns");
        $ic225$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdf"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("owl"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2002/07/owl#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("xsd"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("rdfs"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/01/rdf-schema#")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dc"), (SubLObject)SubLObjectFactory.makeString("http://purl.org/dc/elements/1.1/")));
        $ic226$ = SubLObjectFactory.makeString(" is bound to ");
        $ic227$ = SubLObjectFactory.makeString(".");
        $ic228$ = SubLObjectFactory.makeString(" Must be one of ");
        $ic229$ = SubLObjectFactory.makeString("No import statement for ");
        $ic230$ = SubLObjectFactory.makeSymbol("S#47273", "CYC");
        $ic231$ = SubLObjectFactory.makeSymbol("?ONTOLOGY");
        $ic232$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic233$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ONTOLOGY"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:Ontology")));
        $ic234$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("salientURI"));
        $ic235$ = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $ic236$ = SubLObjectFactory.makeKeyword("MINIMAL");
        $ic237$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic238$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0709.ONE_INTEGER);
        $ic239$ = SubLObjectFactory.makeString("~&");
        $ic240$ = SubLObjectFactory.makeString("Couldn't find ontology for ~S. Creating a new one.");
        $ic241$ = SubLObjectFactory.makeString("~%");
        $ic242$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLOntologyFn"));
        $ic243$ = SubLObjectFactory.makeSymbol("S#47523", "CYC");
        $ic244$ = SubLObjectFactory.makeSymbol("?TERM-TYPE");
        $ic245$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termTypeForOntology"));
        $ic246$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?TERM-TYPE"));
        $ic247$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TermFromOntologyFn"));
        $ic248$ = SubLObjectFactory.makeKeyword("CLOSE");
        $ic249$ = SubLObjectFactory.makeString("There is no range for ~S~%Name token: ~S");
        $ic250$ = SubLObjectFactory.makeSymbol("S#47279", "CYC");
        $ic251$ = SubLObjectFactory.makeString("DatatypeProperty");
        $ic252$ = SubLObjectFactory.makeString("AnnotationProperty");
        $ic253$ = SubLObjectFactory.makeString("ObjectProperty");
        $ic254$ = SubLObjectFactory.makeString("FunctionalProperty");
        $ic255$ = SubLObjectFactory.makeString("SymmetricProperty");
        $ic256$ = SubLObjectFactory.makeString("TransitiveProperty");
        $ic257$ = SubLObjectFactory.makeSymbol("S#47524", "CYC");
        $ic258$ = SubLObjectFactory.makeString("<!--");
        $ic259$ = SubLObjectFactory.makeString("-->");
        $ic260$ = SubLObjectFactory.makeString("Couldn't find end of HTML comment: ~S");
        $ic261$ = SubLObjectFactory.makeString("Skipping comment: ~S");
        $ic262$ = SubLObjectFactory.makeKeyword("ISAS");
        $ic263$ = SubLObjectFactory.makeKeyword("NEXT-NON-WHITESPACE-TOKEN");
        $ic264$ = SubLObjectFactory.makeString("type");
        $ic265$ = SubLObjectFactory.makeString("Can't interpret empty label token ~S");
        $ic266$ = SubLObjectFactory.makeString("Can't decode language abbreviation ~S");
        $ic267$ = SubLObjectFactory.makeKeyword("LABEL");
        $ic268$ = SubLObjectFactory.makeString("domain");
        $ic269$ = SubLObjectFactory.makeString("Couldn't identify domain from ~S");
        $ic270$ = SubLObjectFactory.makeString("inverseOf");
        $ic271$ = SubLObjectFactory.makeString("/>");
        $ic272$ = SubLObjectFactory.makeString("~S is its own inverse, so it's symmetric.");
        $ic273$ = SubLObjectFactory.makeKeyword("SYMMETRIC?");
        $ic274$ = SubLObjectFactory.makeKeyword("INVERSE");
        $ic275$ = SubLObjectFactory.makeString("subPropertyOf");
        $ic276$ = SubLObjectFactory.makeString("Noting genl property ~S of ~S");
        $ic277$ = SubLObjectFactory.makeKeyword("GENL-PROPERTY");
        $ic278$ = SubLObjectFactory.makeString("equivalentProperty");
        $ic279$ = SubLObjectFactory.makeString("Noting equivalent property ~S of ~S");
        $ic280$ = SubLObjectFactory.makeKeyword("EQUIVALENT-PROPERTIES");
        $ic281$ = SubLObjectFactory.makeString("range");
        $ic282$ = SubLObjectFactory.makeString("Couldn't identify range from ~S");
        $ic283$ = SubLObjectFactory.makeString("guid");
        $ic284$ = SubLObjectFactory.makeString("string");
        $ic285$ = SubLObjectFactory.makeString("~&Noting Cyc guid for ~S~S~%");
        $ic286$ = SubLObjectFactory.makeKeyword("GUID");
        $ic287$ = SubLObjectFactory.makeString("externalID");
        $ic288$ = SubLObjectFactory.makeString("~&Noting Cyc externalID for ~S~S~%");
        $ic289$ = SubLObjectFactory.makeKeyword("EXTERNALID");
        $ic290$ = SubLObjectFactory.makeString("datatype");
        $ic291$ = SubLObjectFactory.makeString("isa");
        $ic292$ = SubLObjectFactory.makeString("~&Noting (isa ~S ~S)~%");
        $ic293$ = SubLObjectFactory.makeString("~&Noting ~S ~S~%");
        $ic294$ = SubLObjectFactory.makeKeyword("MY-PRED-VALUES");
        $ic295$ = SubLObjectFactory.makeString("Ignoring unrecognized token: ~S");
        $ic296$ = SubLObjectFactory.makeString("cyc.com");
        $ic297$ = SubLObjectFactory.makeString("Don't know how to interpret attribute value ~S");
        $ic298$ = SubLObjectFactory.makeKeyword("NONLOCAL");
        $ic299$ = SubLObjectFactory.makeString("Processing ~D property definition~:P...");
        $ic300$ = SubLObjectFactory.makeString("DataRange");
        $ic301$ = SubLObjectFactory.makeString("oneOf");
        $ic302$ = SubLObjectFactory.makeString("Can't read range starting with ~S");
        $ic303$ = SubLObjectFactory.makeString("</rdfs:range>");
        $ic304$ = SubLObjectFactory.makeString("Finished range ~S.");
        $ic305$ = SubLObjectFactory.makeSymbol("S#47292", "CYC");
        $ic306$ = SubLObjectFactory.makeString("Class");
        $ic307$ = SubLObjectFactory.makeString("DeprecatedClass");
        $ic308$ = SubLObjectFactory.makeSymbol("S#47526", "CYC");
        $ic309$ = SubLObjectFactory.makeSymbol("S#47293", "CYC");
        $ic310$ = SubLObjectFactory.makeString("Reading OWL class starting with~% ~S");
        $ic311$ = SubLObjectFactory.makeString("nodeID");
        $ic312$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("BNODE"));
        $ic313$ = SubLObjectFactory.makeSymbol("S#47099", "CYC");
        $ic314$ = SubLObjectFactory.makeString("Starting token: ~S");
        $ic315$ = SubLObjectFactory.makeString("No progress reading OWL class: Stuck on ~A.");
        $ic316$ = SubLObjectFactory.makeString("Description");
        $ic317$ = SubLObjectFactory.makeString("Restriction");
        $ic318$ = SubLObjectFactory.makeString("Reading restriction starting with ~S");
        $ic319$ = SubLObjectFactory.makeString("unionOf");
        $ic320$ = SubLObjectFactory.makeString("Don't know what to do with this token while reading OWL class:~% ~S~%");
        $ic321$ = SubLObjectFactory.makeKeyword("NODE-ID");
        $ic322$ = SubLObjectFactory.makeString("Found class: ~S~% Components: ~S");
        $ic323$ = SubLObjectFactory.makeKeyword("COMPLEMENT-CLASS");
        $ic324$ = SubLObjectFactory.makeKeyword("COMPLEMENT-OF");
        $ic325$ = SubLObjectFactory.makeKeyword("INTERSECTION-OF");
        $ic326$ = SubLObjectFactory.makeString("Don't know what this class is named:~% ~S");
        $ic327$ = SubLObjectFactory.makeString("Can't read an enumeration that isn't a oneOf range:~% ~S");
        $ic328$ = SubLObjectFactory.makeString("rest");
        $ic329$ = SubLObjectFactory.makeString("first");
        $ic330$ = SubLObjectFactory.makeString("Couldn't get name from ~S");
        $ic331$ = SubLObjectFactory.makeString("Read enumeration: ~S");
        $ic332$ = SubLObjectFactory.makeKeyword("ONE-OF");
        $ic333$ = SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil");
        $ic334$ = SubLObjectFactory.makeString("parseType");
        $ic335$ = SubLObjectFactory.makeString("Collection");
        $ic336$ = SubLObjectFactory.makeString("Found non-first, non-rest token in OWL list:~% ~S");
        $ic337$ = SubLObjectFactory.makeString("~&Next item: ~S~%");
        $ic338$ = SubLObjectFactory.makeKeyword("UNION");
        $ic339$ = SubLObjectFactory.makeString("ID");
        $ic340$ = SubLObjectFactory.makeString("Got null arg-isa name in ~S");
        $ic341$ = SubLObjectFactory.makeSymbol("S#47310", "CYC");
        $ic342$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?LOCAL-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL"));
        $ic343$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("owlURI")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("URLFn")), (SubLObject)SubLObjectFactory.makeSymbol("?URI"))), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("concatenateStrings")), (SubLObject)SubLObjectFactory.makeSymbol("?URI"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/XMLSchema#"), (SubLObject)SubLObjectFactory.makeSymbol("?LOCAL-NAME")), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("owlDataTypeSemanticCorrelation")), (SubLObject)SubLObjectFactory.makeSymbol("?TERM"), (SubLObject)SubLObjectFactory.makeSymbol("?COLL")));
        $ic344$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $ic345$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic346$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic347$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONLOCAL"), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic348$ = SubLObjectFactory.makeString("~&Found term by guid: ~S");
        $ic349$ = SubLObjectFactory.makeString("~&Found term by externalID: ~S");
        $ic350$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:Class"));
        $ic351$ = SubLObjectFactory.makeSymbol("?URI");
        $ic352$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("standardPrefixForURI"));
        $ic353$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("EL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0709.ONE_INTEGER);
        $ic354$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#47556", "CYC")));
        $ic355$ = SubLObjectFactory.makeSymbol("S#47556", "CYC");
        $ic356$ = SubLObjectFactory.makeSymbol("S#47314", "CYC");
        $ic357$ = SubLObjectFactory.makeString("Couldn't find URI for namespace ~S");
        $ic358$ = SubLObjectFactory.makeString("Can't find or create term of type ~S from ~S");
        $ic359$ = SubLObjectFactory.makeSymbol("S#4076", "CYC");
        $ic360$ = SubLObjectFactory.makeString("external-name appears to contain a control character: ~S");
        $ic361$ = SubLObjectFactory.makeString("external-name appears to contain prefix: ~S");
        $ic362$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLClass"));
        $ic363$ = SubLObjectFactory.makeSymbol("S#47317", "CYC");
        $ic364$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $ic365$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic366$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic367$ = SubLObjectFactory.makeString(":");
        $ic368$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLOntologyFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("S#750", "CYC")));
        $ic369$ = SubLObjectFactory.makeSymbol("S#750", "CYC");
        $ic370$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owlDefiningOntologyURI"));
        $ic371$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?URI"));
        $ic372$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0709.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $ic373$ = SubLObjectFactory.makeSymbol("S#47326", "CYC");
        $ic374$ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-62-sent.ts");
        $ic375$ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/vela-20080414111900-21395-local-2-sent.ts");
        $ic376$ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/vela-20080416102200-16797-local-0-sent.ts");
        $ic377$ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-64-sent.ts");
        $ic378$ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-68-sent.ts");
        $ic379$ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-69-sent.ts");
        $ic380$ = SubLObjectFactory.makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-94-sent.ts");
        $ic381$ = SubLObjectFactory.makeKeyword("X");
        $ic382$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("or"));
        $ic383$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameSpacePrefixForSKS"));
        $ic384$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("URIFn"));
        $ic385$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0709.ONE_INTEGER);
        $ic386$ = SubLObjectFactory.makeSymbol("S#47330", "CYC");
        $ic387$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn"));
        $ic388$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic389$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $ic390$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $ic391$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("SingletonCollectionFn"));
        $ic392$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheCollection"));
        $ic393$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("externalID"), (SubLObject)SubLObjectFactory.makeString("guid"), (SubLObject)SubLObjectFactory.makeString("nonAtomicFormula"), (SubLObject)SubLObjectFactory.makeString("literalValue"), (SubLObject)SubLObjectFactory.makeString("isa"));
        $ic394$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("OWLProperty"));
        $ic395$ = SubLObjectFactory.makeSymbol("SPEC?");
        $ic396$ = SubLObjectFactory.makeString("Potentially adding assertions to existing predicate ~S");
        $ic397$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic398$ = SubLObjectFactory.makeString("~&Creating predicate from ~S~%");
        $ic399$ = SubLObjectFactory.makeString("Failed to find or create a predicate with name: ~S~%");
        $ic400$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:SymmetricProperty"));
        $ic401$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47557", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic402$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:domain"));
        $ic403$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Thing")));
        $ic404$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:range"));
        $ic405$ = SubLObjectFactory.makeString("Asserting genl property ~S of ~S");
        $ic406$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:subPropertyOf"));
        $ic407$ = SubLObjectFactory.makeString("Asserting spec property ~S of ~S");
        $ic408$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InverseBinaryPredicateFn"));
        $ic409$ = SubLObjectFactory.makeString("Asserting inverse ~S of ~S");
        $ic410$ = SubLObjectFactory.makeString("Asserting equivalent-property ~S of ~S");
        $ic411$ = SubLObjectFactory.makeString("Couldn't find equivalent property ~S");
        $ic412$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:equivalentProperty"));
        $ic413$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47558", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic414$ = SubLObjectFactory.makeString("~&Asserting ~S~%");
        $ic415$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic416$ = SubLObjectFactory.makeSymbol("S#13755", "CYC");
        $ic417$ = SubLObjectFactory.makeSymbol("?TERM");
        $ic418$ = SubLObjectFactory.makeString("Couldn't find ~S");
        $ic419$ = SubLObjectFactory.makeSymbol("S#47531", "CYC");
        $ic420$ = SubLObjectFactory.makeSymbol("S#47532", "CYC");
        $ic421$ = SubLObjectFactory.makeSymbol("S#47535", "CYC");
        $ic422$ = SubLObjectFactory.makeString("Circular node id reference: ~S -> ~S");
        $ic423$ = SubLObjectFactory.makeKeyword("UNRESOLVED");
        $ic424$ = SubLObjectFactory.makeString("Postponing (isa ~S ~S) because ~S is not (yet) known to be a collection.");
        $ic425$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("Collection")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Predicate")));
        $ic426$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic427$ = SubLObjectFactory.makeString("-");
        $ic428$ = SubLObjectFactory.makeKeyword("ASSERT");
        $ic429$ = SubLObjectFactory.makeString("OWL OE Daemon");
        $ic430$ = SubLObjectFactory.makeSymbol("S#47368", "CYC");
        $ic431$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic432$ = SubLObjectFactory.makeString("Waiting for ~D enqueued operation~:P to be processed...");
        $ic433$ = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $ic434$ = SubLObjectFactory.makeString("~&Finished pass through queue. Size (including markers) is now ~D. Going around again...~%");
        $ic435$ = SubLObjectFactory.makeString("~&OE queue is empty. Zzz.~%");
        $ic436$ = SubLObjectFactory.makeString("Unable to perform ~D operation~:P:~% ~S~%");
        $ic437$ = SubLObjectFactory.makeString("~&Can't do anything with queue now. Awaiting further operations. Zzz.~%");
        $ic438$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ASSERT"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic439$ = SubLObjectFactory.makeString("~&Noting OE performed: ~S~%");
        $ic440$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47559", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47560", "CYC"));
        $ic441$ = SubLObjectFactory.makeString("~&Failed to resolve ~S~%");
        $ic442$ = SubLObjectFactory.makeSymbol("S#47375", "CYC");
        $ic443$ = SubLObjectFactory.makeString("Problem performing ~S");
        $ic444$ = SubLObjectFactory.makeKeyword("OWL-QUASI-TERM");
        $ic445$ = SubLObjectFactory.makeKeyword("FIND");
        $ic446$ = SubLObjectFactory.makeString("~S is not an OWL node ID.");
        $ic447$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("OWL-QUASI-TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic448$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47561", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#47547", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47560", "CYC"));
        $ic449$ = SubLObjectFactory.makeSymbol("S#47379", "CYC");
        $ic450$ = SubLObjectFactory.makeString("~&Resolved ~S~% to ~S~%");
        $ic451$ = SubLObjectFactory.makeSymbol("S#47536", "CYC");
        $ic452$ = SubLObjectFactory.makeSymbol("S#47381", "CYC");
        $ic453$ = SubLObjectFactory.makeSymbol("S#3946", "CYC");
        $ic454$ = SubLObjectFactory.makeSymbol("S#16383", "CYC");
        $ic455$ = SubLObjectFactory.makeString("Already know ~S~% in ~S");
        $ic456$ = SubLObjectFactory.makeString("Failed to assert ~S~%");
        $ic457$ = SubLObjectFactory.makeString("Processing term definitions...");
        $ic458$ = SubLObjectFactory.makeString("Anonymous-");
        $ic459$ = SubLObjectFactory.makeString("~&Creating ~S...~%");
        $ic460$ = SubLObjectFactory.makeString("Potentially adding assertions to existing term ~S");
        $ic461$ = SubLObjectFactory.makeString("~&Defining term from ~S~%");
        $ic462$ = SubLObjectFactory.makeString("Failed to find or create a term with name: ~S~%");
        $ic463$ = SubLObjectFactory.makeKeyword("EQUIVALENT-CLASSES");
        $ic464$ = SubLObjectFactory.makeKeyword("UNION-OF");
        $ic465$ = SubLObjectFactory.makeString("Thing");
        $ic466$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:Thing"));
        $ic467$ = SubLObjectFactory.makeString("Asserting genl class ~S of ~S");
        $ic468$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:subClassOf"));
        $ic469$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT-OF"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic470$ = SubLObjectFactory.makeString("Asserting disjoint class ~S of ~S");
        $ic471$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:disjointWith"));
        $ic472$ = SubLObjectFactory.makeString("Don't know how to handle superclass ~S");
        $ic473$ = SubLObjectFactory.makeString("Asserting disjoint: ~S and ~S");
        $ic474$ = SubLObjectFactory.makeString("Don't know how to handle disjoint class ~S");
        $ic475$ = SubLObjectFactory.makeString("Asserting union ~S of ~S");
        $ic476$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionUnion"));
        $ic477$ = SubLObjectFactory.makeString("Asserting intersection ~S of ~S");
        $ic478$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("collectionIntersection"));
        $ic479$ = SubLObjectFactory.makeKeyword("ENUMERATED-INSTANCES");
        $ic480$ = SubLObjectFactory.makeString("Asserting enumeration ~S of ~S");
        $ic481$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("completelyAssertedCollection"));
        $ic482$ = SubLObjectFactory.makeString("Can't handle ~S (value: ~S)");
        $ic483$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#1572", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#887", "CYC"));
        $ic484$ = SubLObjectFactory.makeSymbol("?LEXICON");
        $ic485$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("languageHasRootLexicon"));
        $ic486$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LEXICON"));
        $ic487$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0709.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $ic488$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt"));
        $ic489$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("rdfs:label"));
        $ic490$ = SubLObjectFactory.makeString("Asserting equivalent class ~S of ~S");
        $ic491$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("owl:equivalentClass"));
        $ic492$ = SubLObjectFactory.makeString("Failed to assert equivalent class ~S of ~S");
        $ic493$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $ic494$ = SubLObjectFactory.makeString("Resolved nonlocal reference ~S~% to ~S");
        $ic495$ = SubLObjectFactory.makeString("Node ID as restriction target: ~S");
        $ic496$ = SubLObjectFactory.makeString("Can't handle ~S restrictions with value ~S.");
        $ic497$ = SubLObjectFactory.makeString("allValuesFrom");
        $ic498$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllOnly"));
        $ic499$ = SubLObjectFactory.makeString("someValuesFrom");
        $ic500$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $ic501$ = SubLObjectFactory.makeString("hasValue");
        $ic502$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $ic503$ = SubLObjectFactory.makeString("minCardinality");
        $ic504$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred"));
        $ic505$ = SubLObjectFactory.makeString("cardinality");
        $ic506$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount"));
        $ic507$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMin"));
        $ic508$ = SubLObjectFactory.makeString("maxCardinality");
        $ic509$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMax"));
        $ic510$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceOnly")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $ic511$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExists")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $ic512$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $ic513$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $ic514$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMax")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $ic515$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMin")), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"))));
        $ic516$ = SubLObjectFactory.makeKeyword("PRED");
        $ic517$ = SubLObjectFactory.makeKeyword("TARGET");
        $ic518$ = SubLObjectFactory.makeKeyword("GENL");
        $ic519$ = SubLObjectFactory.makeString("Can't create collection from ~S restrictions with value ~S.");
        $ic520$ = SubLObjectFactory.makeSymbol("S#47394", "CYC");
        $ic521$ = SubLObjectFactory.makeString("Created ~S from ~S");
        $ic522$ = SubLObjectFactory.makeString("~&Asserting ~S");
        $ic523$ = SubLObjectFactory.makeSymbol("S#47202", "CYC");
        $ic524$ = SubLObjectFactory.makeString("Nested calls resolving ~S");
        $ic525$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLEMENT-OF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#47201", "CYC")));
        $ic526$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn"));
        $ic527$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic528$ = SubLObjectFactory.makeString("Can't find or create ~S term from ~S");
        $ic529$ = SubLObjectFactory.makeSymbol("S#47203", "CYC");
        $ic530$ = SubLObjectFactory.makeString("~&Trying to resolve ~S~%");
        $ic531$ = SubLObjectFactory.makeString("~&Result: ~S~%");
        $ic532$ = SubLObjectFactory.makeString("Trying to create term from ~S");
        $ic533$ = SubLObjectFactory.makeSymbol("S#47098", "CYC");
        $ic534$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47545", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("S#47562", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47563", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#138", "CYC"));
        $ic535$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYC-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COMMENT"), (SubLObject)SubLObjectFactory.makeKeyword("SUPERCLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("DISJOINT-CLASSES"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $ic536$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47403", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47404", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47405", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47406", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47407", "CYC"));
        $ic537$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47408", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47409", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47410", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47411", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47412", "CYC"));
        $ic538$ = SubLObjectFactory.makeSymbol("S#47416", "CYC");
        $ic539$ = SubLObjectFactory.makeSymbol("S#47402", "CYC");
        $ic540$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#47099", "CYC"));
        $ic541$ = SubLObjectFactory.makeSymbol("S#47403", "CYC");
        $ic542$ = SubLObjectFactory.makeSymbol("S#47408", "CYC");
        $ic543$ = SubLObjectFactory.makeSymbol("S#47404", "CYC");
        $ic544$ = SubLObjectFactory.makeSymbol("S#47409", "CYC");
        $ic545$ = SubLObjectFactory.makeSymbol("S#47405", "CYC");
        $ic546$ = SubLObjectFactory.makeSymbol("S#47410", "CYC");
        $ic547$ = SubLObjectFactory.makeSymbol("S#47406", "CYC");
        $ic548$ = SubLObjectFactory.makeSymbol("S#47411", "CYC");
        $ic549$ = SubLObjectFactory.makeSymbol("S#47407", "CYC");
        $ic550$ = SubLObjectFactory.makeSymbol("S#47412", "CYC");
        $ic551$ = SubLObjectFactory.makeKeyword("SUPERCLASSES");
        $ic552$ = SubLObjectFactory.makeKeyword("DISJOINT-CLASSES");
        $ic553$ = SubLObjectFactory.makeSymbol("S#47413", "CYC");
        $ic554$ = SubLObjectFactory.makeSymbol("S#47415", "CYC");
        $ic555$ = SubLObjectFactory.makeString("<OWL-TERM-INFO ~A>");
        $ic556$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"));
        $ic557$ = SubLObjectFactory.makeString("Don't know about ~S");
        $ic558$ = SubLObjectFactory.makeSymbol("S#47434", "CYC");
        $ic559$ = SubLObjectFactory.makeKeyword("BNODE");
        $ic560$ = SubLObjectFactory.makeString("~&Reading Description: ~S~%");
        $ic561$ = SubLObjectFactory.makeString("Skipping rdf:Description element.");
        $ic562$ = SubLObjectFactory.makeString("~&Reading Restriction: ~S~%");
        $ic563$ = SubLObjectFactory.makeString("Skipping owl:Restriction element.");
        $ic564$ = SubLObjectFactory.makeString("Reading top-level named class ~S");
        $ic565$ = SubLObjectFactory.makeString("Failed or declined to read a class.");
        $ic566$ = SubLObjectFactory.makeString("There are no superclasses for ~S");
        $ic567$ = SubLObjectFactory.makeString("Finished ~S.~% Superclasses: ~S.~% Disjoint classes: ~S.~% Isas: ~S.");
        $ic568$ = SubLObjectFactory.makeString("Skipping HTML comment: ~S");
        $ic569$ = SubLObjectFactory.makeString("Reading definition of ~S");
        $ic570$ = SubLObjectFactory.makeString("Skipping ~S to close tag");
        $ic571$ = SubLObjectFactory.makeString("Failed or declined to read an instance.");
        $ic572$ = SubLObjectFactory.makeString("Finished ~S.");
        $ic573$ = SubLObjectFactory.makeString("~&Defining ~S as an instance of ~S~%");
        $ic574$ = SubLObjectFactory.makeString("AllDifferent");
        $ic575$ = SubLObjectFactory.makeString("Skipping ~S");
        $ic576$ = SubLObjectFactory.makeString("Skipping locally-defined ~S to close tag");
        $ic577$ = SubLObjectFactory.makeString("subClassOf");
        $ic578$ = SubLObjectFactory.makeString("Read superclass: ~S");
        $ic579$ = SubLObjectFactory.makeString("disjointWith");
        $ic580$ = SubLObjectFactory.makeString("equivalentClass");
        $ic581$ = SubLObjectFactory.makeString("owlEquivalentClass");
        $ic582$ = SubLObjectFactory.makeString("complementOf");
        $ic583$ = SubLObjectFactory.makeString("intersectionOf");
        $ic584$ = SubLObjectFactory.makeString("Read one intersection element: ~S");
        $ic585$ = SubLObjectFactory.makeString("Intersection: ~S");
        $ic586$ = SubLObjectFactory.makeString("Read one union element: ~S");
        $ic587$ = SubLObjectFactory.makeString("Union: ~S");
        $ic588$ = SubLObjectFactory.makeString("Read enumerated instances: ~S");
        $ic589$ = SubLObjectFactory.makeString("Couldn't determine value from ~S~% ~S");
        $ic590$ = SubLObjectFactory.makeString("Apparently anonymous instance: ~S");
        $ic591$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONLOCAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("S#39641", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $ic592$ = SubLObjectFactory.makeString("Finding or creating nonlocal term...");
        $ic593$ = SubLObjectFactory.makeString("Result: ~S");
        $ic594$ = SubLObjectFactory.makeString("Reading OWL class or restriction starting with~% ~S");
        $ic595$ = SubLObjectFactory.makeKeyword("RESTRICTION");
        $ic596$ = SubLObjectFactory.makeString("Can't read class starting with ~S");
        $ic597$ = SubLObjectFactory.makeString("~S~% is not the start of an OWL restriction declaration.");
        $ic598$ = SubLObjectFactory.makeKeyword("INITIAL");
        $ic599$ = SubLObjectFactory.makeKeyword("DONE");
        $ic600$ = SubLObjectFactory.makeString("Read restriction: ~S ~S ~S ~S");
        $ic601$ = SubLObjectFactory.makeString("onProperty");
        $ic602$ = SubLObjectFactory.makeString("Reading restriction property...");
        $ic603$ = SubLObjectFactory.makeKeyword("READING-PROPERTY");
        $ic604$ = SubLObjectFactory.makeString("onClass");
        $ic605$ = SubLObjectFactory.makeString("Reading restriction class...");
        $ic606$ = SubLObjectFactory.makeKeyword("READING-CLASS");
        $ic607$ = SubLObjectFactory.makeString("Read restriction property ~S");
        $ic608$ = SubLObjectFactory.makeKeyword("READ-PROPERTY");
        $ic609$ = SubLObjectFactory.makeString("Read restriction class ~S");
        $ic610$ = SubLObjectFactory.makeKeyword("READ-CLASS");
        $ic611$ = SubLObjectFactory.makeString("Got onProperty close tag when we weren't reading a property.");
        $ic612$ = SubLObjectFactory.makeString("Failed to read property.");
        $ic613$ = SubLObjectFactory.makeString("Got onClass close tag when we weren't reading a class.");
        $ic614$ = SubLObjectFactory.makeString("Failed to read class.");
        $ic615$ = SubLObjectFactory.makeString("Read datatype ~S from ~S");
        $ic616$ = SubLObjectFactory.makeKeyword("READ-TYPE");
        $ic617$ = SubLObjectFactory.makeString("Read value ~S from ~S");
        $ic618$ = SubLObjectFactory.makeKeyword("READ-VALUE");
        $ic619$ = SubLObjectFactory.makeString("Failed to read restriction value.");
        $ic620$ = SubLObjectFactory.makeString("Read restriction value ~S");
        $ic621$ = SubLObjectFactory.makeString("~&Reading OWL property starting with ~S~%");
        $ic622$ = SubLObjectFactory.makeString("~&Done with ~S~%");
        $ic623$ = SubLObjectFactory.makeString("~&Reading OWL class starting with ~S~%");
        $ic624$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("double"), SubLObjectFactory.makeString("integer"), SubLObjectFactory.makeString("int"), SubLObjectFactory.makeString("unsignedInt"), SubLObjectFactory.makeString("nonNegativeInteger"), SubLObjectFactory.makeString("nonPositiveInteger"), SubLObjectFactory.makeString("positiveInteger"), SubLObjectFactory.makeString("negativeInteger"), SubLObjectFactory.makeString("decimal"), SubLObjectFactory.makeString("long"), SubLObjectFactory.makeString("unsignedLong"), SubLObjectFactory.makeString("short"), SubLObjectFactory.makeString("unsignedShort"), SubLObjectFactory.makeString("float") });
        $ic625$ = SubLObjectFactory.makeString("Can't parse ~S as a ~A");
        $ic626$ = SubLObjectFactory.makeString("boolean");
        $ic627$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("true"), (SubLObject)SubLObjectFactory.makeString("1"));
        $ic628$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("True"));
        $ic629$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("false"), (SubLObject)SubLObjectFactory.makeString("0"));
        $ic630$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic631$ = SubLObjectFactory.makeString("Couldn't read boolean value from ~S");
        $ic632$ = SubLObjectFactory.makeString("date");
        $ic633$ = SubLObjectFactory.makeString("Couldn't parse date from ~S");
        $ic634$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DayFn"));
        $ic635$ = SubLObjectFactory.makeSymbol("NAT-FUNCTOR");
        $ic636$ = SubLObjectFactory.makeString("Got multiple dates from ~S:~% ~S");
        $ic637$ = SubLObjectFactory.makeString("Don't know how to parse value from ~S with datatype ~S");
        $ic638$ = SubLObjectFactory.makeSymbol("S#46917", "CYC");
        $ic639$ = SubLObjectFactory.makeString("xml:");
        $ic640$ = SubLObjectFactory.makeSymbol("S#47542", "CYC");
        $ic641$ = SubLObjectFactory.makeSymbol("S#47100", "CYC");
        $ic642$ = SubLObjectFactory.makeSymbol("S#47101", "CYC");
        $ic643$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#479", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47564", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47560", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5845", "CYC"));
        $ic644$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS"), (SubLObject)SubLObjectFactory.makeKeyword("ERROR-INFO"), (SubLObject)SubLObjectFactory.makeKeyword("IMPORT-PARAMETERS"), (SubLObject)SubLObjectFactory.makeKeyword("THREAD"));
        $ic645$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47468", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47469", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47470", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47471", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47472", "CYC"));
        $ic646$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#47473", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47474", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47475", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47476", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#47477", "CYC"));
        $ic647$ = SubLObjectFactory.makeSymbol("S#47481", "CYC");
        $ic648$ = SubLObjectFactory.makeSymbol("S#47467", "CYC");
        $ic649$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#47101", "CYC"));
        $ic650$ = SubLObjectFactory.makeSymbol("S#47468", "CYC");
        $ic651$ = SubLObjectFactory.makeSymbol("S#47473", "CYC");
        $ic652$ = SubLObjectFactory.makeSymbol("S#47469", "CYC");
        $ic653$ = SubLObjectFactory.makeSymbol("S#47474", "CYC");
        $ic654$ = SubLObjectFactory.makeSymbol("S#47470", "CYC");
        $ic655$ = SubLObjectFactory.makeSymbol("S#47475", "CYC");
        $ic656$ = SubLObjectFactory.makeSymbol("S#47471", "CYC");
        $ic657$ = SubLObjectFactory.makeSymbol("S#47476", "CYC");
        $ic658$ = SubLObjectFactory.makeSymbol("S#47472", "CYC");
        $ic659$ = SubLObjectFactory.makeSymbol("S#47477", "CYC");
        $ic660$ = SubLObjectFactory.makeKeyword("ID");
        $ic661$ = SubLObjectFactory.makeKeyword("PROGRESS");
        $ic662$ = SubLObjectFactory.makeKeyword("ERROR-INFO");
        $ic663$ = SubLObjectFactory.makeKeyword("IMPORT-PARAMETERS");
        $ic664$ = SubLObjectFactory.makeKeyword("THREAD");
        $ic665$ = SubLObjectFactory.makeSymbol("S#47478", "CYC");
        $ic666$ = SubLObjectFactory.makeSymbol("S#47480", "CYC");
        $ic667$ = SubLObjectFactory.makeString("<OWL-IMPORTER ~D>");
        $ic668$ = SubLObjectFactory.makeSymbol("S#47488", "CYC");
        $ic669$ = SubLObjectFactory.makeSymbol("IMPORT-OWL-ONTOLOGY-WITH-IMPORTER");
        $ic670$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), (SubLObject)SubLObjectFactory.makeKeyword("SOURCE"), (SubLObject)SubLObjectFactory.makeKeyword("ONTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?"), (SubLObject)SubLObjectFactory.makeKeyword("QUOTED-ISA"), (SubLObject)SubLObjectFactory.makeKeyword("CYCLIST"));
        $ic671$ = SubLObjectFactory.makeString("OWL Importer");
        $ic672$ = SubLObjectFactory.makeSymbol("S#47504", "CYC");
        $ic673$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("IMPORTER"), SubLObjectFactory.makeKeyword("URI"), SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX"), SubLObjectFactory.makeKeyword("URI-PREFIX"), SubLObjectFactory.makeKeyword("SOURCE"), SubLObjectFactory.makeKeyword("ONTOLOGY"), SubLObjectFactory.makeKeyword("QUOTED-ISA"), SubLObjectFactory.makeKeyword("CYCLIST"), SubLObjectFactory.makeKeyword("PREFIX-EXTERNAL-NAMES?"), SubLObjectFactory.makeKeyword("ABBREVIATE-PREFIXES?") });
        $ic674$ = SubLObjectFactory.makeSymbol("S#47544", "CYC");
        $ic675$ = SubLObjectFactory.makeKeyword("IMPORTER");
    }
    
    public static final class $sX47094_native extends SubLStructNative
    {
        public SubLObject $cyc_name;
        public SubLObject $comment;
        public SubLObject $domains;
        public SubLObject $range;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $sX47094_native() {
            this.$cyc_name = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$domains = (SubLObject)CommonSymbols.NIL;
            this.$range = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX47094_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cyc_name;
        }
        
        public SubLObject getField3() {
            return this.$comment;
        }
        
        public SubLObject getField4() {
            return this.$domains;
        }
        
        public SubLObject getField5() {
            return this.$range;
        }
        
        public SubLObject getField6() {
            return this.$plist;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cyc_name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$domains = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$range = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX47094_native.class, module0709.$ic125$, module0709.$ic126$, module0709.$ic127$, module0709.$ic128$, new String[] { "$cyc_name", "$comment", "$domains", "$range", "$plist" }, module0709.$ic129$, module0709.$ic130$, module0709.$ic131$);
        }
    }
    
    public static final class $f43171$UnaryFunction extends UnaryFunction
    {
        public $f43171$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47095"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return module0709.f43171(var231);
        }
    }
    
    public static final class $sX47096_native extends SubLStructNative
    {
        public SubLObject $ontology;
        public SubLObject $namespace_map;
        public SubLObject $constant_prefix;
        public SubLObject $constant_suffix;
        public SubLObject $base_uri;
        public SubLObject $uri_prefix;
        public SubLObject $cyclist;
        public SubLObject $quoted_isa;
        public SubLObject $prefix_external_namesP;
        public SubLObject $abbreviate_prefixesP;
        public SubLObject $import_term;
        public SubLObject $encoding;
        private static final SubLStructDeclNative structDecl;
        
        public $sX47096_native() {
            this.$ontology = (SubLObject)CommonSymbols.NIL;
            this.$namespace_map = (SubLObject)CommonSymbols.NIL;
            this.$constant_prefix = (SubLObject)CommonSymbols.NIL;
            this.$constant_suffix = (SubLObject)CommonSymbols.NIL;
            this.$base_uri = (SubLObject)CommonSymbols.NIL;
            this.$uri_prefix = (SubLObject)CommonSymbols.NIL;
            this.$cyclist = (SubLObject)CommonSymbols.NIL;
            this.$quoted_isa = (SubLObject)CommonSymbols.NIL;
            this.$prefix_external_namesP = (SubLObject)CommonSymbols.NIL;
            this.$abbreviate_prefixesP = (SubLObject)CommonSymbols.NIL;
            this.$import_term = (SubLObject)CommonSymbols.NIL;
            this.$encoding = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX47096_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$ontology;
        }
        
        public SubLObject getField3() {
            return this.$namespace_map;
        }
        
        public SubLObject getField4() {
            return this.$constant_prefix;
        }
        
        public SubLObject getField5() {
            return this.$constant_suffix;
        }
        
        public SubLObject getField6() {
            return this.$base_uri;
        }
        
        public SubLObject getField7() {
            return this.$uri_prefix;
        }
        
        public SubLObject getField8() {
            return this.$cyclist;
        }
        
        public SubLObject getField9() {
            return this.$quoted_isa;
        }
        
        public SubLObject getField10() {
            return this.$prefix_external_namesP;
        }
        
        public SubLObject getField11() {
            return this.$abbreviate_prefixesP;
        }
        
        public SubLObject getField12() {
            return this.$import_term;
        }
        
        public SubLObject getField13() {
            return this.$encoding;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$ontology = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$namespace_map = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$constant_prefix = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$constant_suffix = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$base_uri = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$uri_prefix = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$cyclist = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$quoted_isa = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$prefix_external_namesP = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$abbreviate_prefixesP = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$import_term = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$encoding = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX47096_native.class, module0709.$ic169$, module0709.$ic170$, module0709.$ic171$, module0709.$ic172$, new String[] { "$ontology", "$namespace_map", "$constant_prefix", "$constant_suffix", "$base_uri", "$uri_prefix", "$cyclist", "$quoted_isa", "$prefix_external_namesP", "$abbreviate_prefixesP", "$import_term", "$encoding" }, module0709.$ic173$, module0709.$ic174$, module0709.$ic175$);
        }
    }
    
    public static final class $f43213$UnaryFunction extends UnaryFunction
    {
        public $f43213$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47097"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return module0709.f43213(var231);
        }
    }
    
    public static final class $sX47098_native extends SubLStructNative
    {
        public SubLObject $cyc_name;
        public SubLObject $comment;
        public SubLObject $superclasses;
        public SubLObject $disjoint_classes;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $sX47098_native() {
            this.$cyc_name = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$superclasses = (SubLObject)CommonSymbols.NIL;
            this.$disjoint_classes = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX47098_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cyc_name;
        }
        
        public SubLObject getField3() {
            return this.$comment;
        }
        
        public SubLObject getField4() {
            return this.$superclasses;
        }
        
        public SubLObject getField5() {
            return this.$disjoint_classes;
        }
        
        public SubLObject getField6() {
            return this.$plist;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cyc_name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$superclasses = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$disjoint_classes = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX47098_native.class, module0709.$ic533$, module0709.$ic313$, module0709.$ic534$, module0709.$ic535$, new String[] { "$cyc_name", "$comment", "$superclasses", "$disjoint_classes", "$plist" }, module0709.$ic536$, module0709.$ic537$, module0709.$ic538$);
        }
    }
    
    public static final class $f43110$UnaryFunction extends UnaryFunction
    {
        public $f43110$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47099"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return module0709.f43110(var231);
        }
    }
    
    public static final class $sX47100_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $progress;
        public SubLObject $error_info;
        public SubLObject $import_parameters;
        public SubLObject $thread;
        private static final SubLStructDeclNative structDecl;
        
        public $sX47100_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$progress = (SubLObject)CommonSymbols.NIL;
            this.$error_info = (SubLObject)CommonSymbols.NIL;
            this.$import_parameters = (SubLObject)CommonSymbols.NIL;
            this.$thread = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX47100_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$progress;
        }
        
        public SubLObject getField4() {
            return this.$error_info;
        }
        
        public SubLObject getField5() {
            return this.$import_parameters;
        }
        
        public SubLObject getField6() {
            return this.$thread;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$progress = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$error_info = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$import_parameters = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$thread = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX47100_native.class, module0709.$ic641$, module0709.$ic642$, module0709.$ic643$, module0709.$ic644$, new String[] { "$id", "$progress", "$error_info", "$import_parameters", "$thread" }, module0709.$ic645$, module0709.$ic646$, module0709.$ic647$);
        }
    }
    
    public static final class $f43437$UnaryFunction extends UnaryFunction
    {
        public $f43437$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47101"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return module0709.f43437(var231);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0709.class
	Total time: 4557 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/