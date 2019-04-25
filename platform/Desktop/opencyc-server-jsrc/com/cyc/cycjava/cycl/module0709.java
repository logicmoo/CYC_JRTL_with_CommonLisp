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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        final SubLObject var1 = Sequences.position_if((SubLObject)$ic1$, $g5539$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0038.f2666(module0038.f2623($g5539$.getGlobalValue(), var1, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f43060() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return $g5540$.getDynamicValue(var2);
    }
    
    public static SubLObject f43061(final SubLObject var3, final SubLObject var4, final SubLObject var5) {
        assert NIL != module0210.f13572(var3) : var3;
        assert NIL != module0038.f2614(var4) : var4;
        final SubLObject var6 = module0259.f16822(var3, var5, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0256.f16525(var3, var5, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var9 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var10 = var4;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            SubLObject var10_12 = f43062(var11);
            SubLObject var12 = (SubLObject)NIL;
            var12 = var10_12.first();
            while (NIL != var10_12) {
                if (NIL != module0212.f13762(var12)) {
                    final SubLObject var13 = module0259.f16822(var12, var5, (SubLObject)UNPROVIDED);
                    final SubLObject var14 = module0256.f16525(var12, var5, (SubLObject)UNPROVIDED);
                    final SubLObject var15 = (NIL != module0257.f16693(var6, var13, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0257.f16693(var7, var14, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? var9 : var8;
                    final SubLObject var16 = module0303.f20271(var6, var13, var7, var14, var5);
                    final SubLObject var17 = (SubLObject)$ic5$;
                    final SubLObject var18 = Numbers.truncate(Numbers.divide(Numbers.multiply(var16, var17), (SubLObject)$ic6$), (SubLObject)UNPROVIDED);
                    module0067.f4886(var15, var12, var18);
                }
                var10_12 = var10_12.rest();
                var12 = var10_12.first();
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        return Values.values(module0084.f5795(var8, Symbols.symbol_function((SubLObject)$ic7$)), module0084.f5795(var9, Symbols.symbol_function((SubLObject)$ic7$)));
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43071(final SubLObject var20) {
        final SubLObject var21 = module0595.f36374($ic8$, var20, (SubLObject)UNPROVIDED);
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = var21;
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            SubLObject var10_24 = module0233.f15373(var24);
            SubLObject var25 = (SubLObject)NIL;
            var25 = var10_24.first();
            while (NIL != var10_24) {
                final SubLObject var26 = var25;
                if (NIL == conses_high.member(var26, var22, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
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
        return module0220.f14581($ic9$, var13, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43073(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        final SubLObject var16 = module0147.$g2094$.currentBinding(var14);
        final SubLObject var17 = module0147.$g2095$.currentBinding(var14);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var14);
            module0147.$g2095$.bind($ic12$, var14);
            SubLObject var18 = (SubLObject)NIL;
            final SubLObject var19 = $ic9$;
            if (NIL != module0158.f10010(var13, (SubLObject)ONE_INTEGER, var19)) {
                final SubLObject var20 = module0158.f10011(var13, (SubLObject)ONE_INTEGER, var19);
                SubLObject var21 = (SubLObject)NIL;
                final SubLObject var22 = (SubLObject)NIL;
                while (NIL == var21) {
                    final SubLObject var23 = module0052.f3695(var20, var22);
                    final SubLObject var24 = (SubLObject)makeBoolean(!var22.eql(var23));
                    if (NIL != var24) {
                        SubLObject var25 = (SubLObject)NIL;
                        try {
                            var25 = module0158.f10316(var23, (SubLObject)$ic13$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var32_37 = (SubLObject)NIL;
                            final SubLObject var33_38 = (SubLObject)NIL;
                            while (NIL == var32_37) {
                                final SubLObject var26 = module0052.f3695(var25, var33_38);
                                final SubLObject var35_40 = (SubLObject)makeBoolean(!var33_38.eql(var26));
                                if (NIL != var35_40) {
                                    var18 = module0178.f11331(var26, (SubLObject)TWO_INTEGER);
                                    if (NIL != module0259.f16854(var18, $ic14$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var15 = (SubLObject)T;
                                    }
                                }
                                var32_37 = (SubLObject)makeBoolean(NIL == var35_40);
                            }
                        }
                        finally {
                            final SubLObject var28_41 = Threads.$is_thread_performing_cleanupP$.currentBinding(var14);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var14);
                                if (NIL != var25) {
                                    module0158.f10319(var25);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var28_41, var14);
                            }
                        }
                    }
                    var21 = (SubLObject)makeBoolean(NIL == var24);
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
        SubLObject var16 = (SubLObject)NIL;
        if (NIL == var15) {
            return f43073(var13);
        }
        var16 = module0034.f1857(var15, (SubLObject)$ic10$, (SubLObject)UNPROVIDED);
        if (NIL == var16) {
            var16 = module0034.f1807(module0034.f1842(var15), (SubLObject)$ic10$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var15, (SubLObject)$ic10$, var16);
        }
        SubLObject var17 = module0034.f1814(var16, var13, (SubLObject)$ic15$);
        if (var17 == $ic15$) {
            var17 = Values.arg2(var14.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43073(var13)));
            module0034.f1816(var16, var13, var17, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var17);
    }
    
    public static SubLObject f43075(final SubLObject var20) {
        final SubLObject var21 = module0220.f14565(var20, $ic9$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = module0220.f14565(var20, $ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            var22 = ConsesLow.append(var22, module0220.f14565(var24, $ic9$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
            var23 = var23.rest();
            var24 = var23.first();
        }
        return ConsesLow.append(var22, var21);
    }
    
    public static SubLObject f43076(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = f43077(var20);
        SubLObject var23 = (SubLObject)ZERO_INTEGER;
        final SubLObject var25;
        final SubLObject var24 = var25 = module0034.f1888();
        final SubLObject var26 = module0034.$g879$.currentBinding(var21);
        try {
            module0034.$g879$.bind(var25, var21);
            SubLObject var27 = (SubLObject)NIL;
            if (NIL != var25 && NIL == module0034.f1842(var25)) {
                var27 = module0034.f1869(var25);
                final SubLObject var28 = Threads.current_process();
                if (NIL == var27) {
                    module0034.f1873(var25, var28);
                }
                else if (!var27.eql(var28)) {
                    Errors.error((SubLObject)$ic17$);
                }
            }
            try {
                SubLObject var29 = var22;
                SubLObject var30 = (SubLObject)NIL;
                var30 = var29.first();
                while (NIL != var29) {
                    if (NIL != f43078(var30)) {
                        var23 = Numbers.add(var23, (SubLObject)ONE_INTEGER);
                    }
                    var29 = var29.rest();
                    var30 = var29.first();
                }
            }
            finally {
                final SubLObject var28_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var21);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                    if (NIL != var25 && NIL == var27) {
                        module0034.f1873(var25, (SubLObject)NIL);
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
        return module0048.f3313(var23, Sequences.length(var22), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43079(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var21);
            module0147.$g2095$.bind($ic12$, var21);
            SubLObject var25 = f43077(var20);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                final SubLObject var27 = f43080(var26, $ic18$, (SubLObject)UNPROVIDED);
                if (NIL == module0004.f105(var27)) {
                    Errors.sublisp_break((SubLObject)$ic19$, new SubLObject[] { var26 });
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
        return (SubLObject)((NIL != var22) ? module0048.f3384(var22) : NIL);
    }
    
    public static SubLObject f43081(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var21);
            module0147.$g2095$.bind($ic12$, var21);
            SubLObject var25 = f43063(var20);
            SubLObject var26 = (SubLObject)NIL;
            var26 = var25.first();
            while (NIL != var25) {
                final SubLObject var27 = f43080(var26, $ic18$, (SubLObject)UNPROVIDED);
                if (NIL == module0004.f105(var27)) {
                    Errors.sublisp_break((SubLObject)$ic19$, new SubLObject[] { var26 });
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
        return (SubLObject)((NIL != var22) ? module0048.f3384(var22) : NIL);
    }
    
    public static SubLObject f43077(final SubLObject var20) {
        return module0035.remove_if_not((SubLObject)$ic20$, f43075(var20), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43078(final SubLObject var54) {
        return (SubLObject)makeBoolean(NIL != f43082(var54) || NIL != f43083(var54));
    }
    
    public static SubLObject f43082(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        SubLObject var56 = (SubLObject)NIL;
        final SubLObject var57 = module0147.$g2094$.currentBinding(var55);
        final SubLObject var58 = module0147.$g2095$.currentBinding(var55);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var55);
            module0147.$g2095$.bind($ic12$, var55);
            if (NIL == var56) {
                SubLObject var59 = var54;
                final SubLObject var60 = (SubLObject)$ic23$;
                final SubLObject var61 = module0056.f4145(var60);
                final SubLObject var28_62 = module0139.$g1635$.currentBinding(var55);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var55);
                    final SubLObject var62 = (SubLObject)NIL;
                    final SubLObject var28_63 = module0141.$g1714$.currentBinding(var55);
                    final SubLObject var29_65 = module0141.$g1715$.currentBinding(var55);
                    try {
                        module0141.$g1714$.bind((NIL != var62) ? var62 : module0141.f9283(), var55);
                        module0141.$g1715$.bind((SubLObject)((NIL != var62) ? $ic24$ : module0141.$g1715$.getDynamicValue(var55)), var55);
                        if (NIL != var62 && NIL != module0136.f8864() && NIL == module0141.f9279(var62)) {
                            final SubLObject var63 = module0136.$g1591$.getDynamicValue(var55);
                            if (var63.eql((SubLObject)$ic25$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic26$, var62, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)$ic28$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic29$, (SubLObject)$ic26$, var62, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)$ic30$)) {
                                Errors.warn((SubLObject)$ic26$, var62, (SubLObject)$ic27$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic31$, module0136.$g1591$.getDynamicValue(var55));
                                Errors.cerror((SubLObject)$ic29$, (SubLObject)$ic26$, var62, (SubLObject)$ic27$);
                            }
                        }
                        final SubLObject var28_64 = module0141.$g1670$.currentBinding(var55);
                        final SubLObject var29_66 = module0141.$g1671$.currentBinding(var55);
                        final SubLObject var64 = module0141.$g1672$.currentBinding(var55);
                        final SubLObject var65 = module0141.$g1674$.currentBinding(var55);
                        final SubLObject var66 = module0137.$g1605$.currentBinding(var55);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic32$), var55);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic32$)), var55);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic32$)), var55);
                            module0141.$g1674$.bind((SubLObject)NIL, var55);
                            module0137.$g1605$.bind(module0137.f8955($ic32$), var55);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var54, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_65 = module0141.$g1677$.currentBinding(var55);
                                final SubLObject var29_67 = module0138.$g1619$.currentBinding(var55);
                                final SubLObject var69_74 = module0141.$g1674$.currentBinding(var55);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var55);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic32$)), var55);
                                    module0141.$g1674$.bind((SubLObject)NIL, var55);
                                    module0249.f16055(var59, (SubLObject)UNPROVIDED);
                                    while (NIL != var59 && NIL == var56) {
                                        final SubLObject var67 = var59;
                                        if (!var67.eql($ic18$) && NIL == module0205.f13145((SubLObject)$ic10$, var67, (SubLObject)T, (SubLObject)UNPROVIDED)) {
                                            var56 = (SubLObject)T;
                                        }
                                        final SubLObject var68 = module0200.f12443(module0137.f8955($ic32$));
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
                                        for (var69 = (SubLObject)NIL, var69 = var68; NIL == var56 && NIL != var69; var69 = var69.rest()) {
                                            var70 = var69.first();
                                            var28_66 = module0137.$g1605$.currentBinding(var55);
                                            var29_68 = module0141.$g1674$.currentBinding(var55);
                                            try {
                                                module0137.$g1605$.bind(var70, var55);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var55)) : module0141.$g1674$.getDynamicValue(var55)), var55);
                                                var71 = module0228.f15229(var59);
                                                if (NIL != module0138.f8992(var71)) {
                                                    var72 = module0242.f15664(var71, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var72) {
                                                        var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var73) {
                                                            for (var74 = module0066.f4838(module0067.f4891(var73)); NIL == var56 && NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                var55.resetMultipleValues();
                                                                var75 = module0066.f4839(var74);
                                                                var76 = var55.secondMultipleValue();
                                                                var55.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var75)) {
                                                                    var28_67 = module0138.$g1623$.currentBinding(var55);
                                                                    try {
                                                                        module0138.$g1623$.bind(var75, var55);
                                                                        for (var84_88 = module0066.f4838(module0067.f4891(var76)); NIL == var56 && NIL == module0066.f4841(var84_88); var84_88 = module0066.f4840(var84_88)) {
                                                                            var55.resetMultipleValues();
                                                                            var77 = module0066.f4839(var84_88);
                                                                            var78 = var55.secondMultipleValue();
                                                                            var55.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var77)) {
                                                                                var28_68 = module0138.$g1624$.currentBinding(var55);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var77, var55);
                                                                                    var79 = var78;
                                                                                    if (NIL != module0077.f5302(var79)) {
                                                                                        var80 = module0077.f5333(var79);
                                                                                        for (var81 = module0032.f1741(var80), var82 = (SubLObject)NIL, var82 = module0032.f1742(var81, var80); NIL == var56 && NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                            var83 = module0032.f1745(var81, var82);
                                                                                            if (NIL != module0032.f1746(var82, var83) && NIL == module0249.f16059(var83, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var83, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var83, var61);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var79.isList()) {
                                                                                        if (NIL == var56) {
                                                                                            var84 = var79;
                                                                                            var85 = (SubLObject)NIL;
                                                                                            var85 = var84.first();
                                                                                            while (NIL == var56 && NIL != var84) {
                                                                                                if (NIL == module0249.f16059(var85, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var85, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var85, var61);
                                                                                                }
                                                                                                var84 = var84.rest();
                                                                                                var85 = var84.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic33$, var79);
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
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var71, (SubLObject)UNPROVIDED)) {
                                                    var86 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var77_99 = (SubLObject)NIL, var77_99 = var86; NIL == var56 && NIL != var77_99; var77_99 = var77_99.rest()) {
                                                        var87 = var77_99.first();
                                                        var28_69 = module0138.$g1625$.currentBinding(var55);
                                                        try {
                                                            module0138.$g1625$.bind(var87, var55);
                                                            var88 = (var89 = Functions.funcall(var87, var71));
                                                            if (NIL != module0077.f5302(var89)) {
                                                                var90 = module0077.f5333(var89);
                                                                for (var91 = module0032.f1741(var90), var92 = (SubLObject)NIL, var92 = module0032.f1742(var91, var90); NIL == var56 && NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                    var93 = module0032.f1745(var91, var92);
                                                                    if (NIL != module0032.f1746(var92, var93) && NIL == module0249.f16059(var93, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var93, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var93, var61);
                                                                    }
                                                                }
                                                            }
                                                            else if (var89.isList()) {
                                                                if (NIL == var56) {
                                                                    var94 = var89;
                                                                    var95 = (SubLObject)NIL;
                                                                    var95 = var94.first();
                                                                    while (NIL == var56 && NIL != var94) {
                                                                        if (NIL == module0249.f16059(var95, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var95, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var95, var61);
                                                                        }
                                                                        var94 = var94.rest();
                                                                        var95 = var94.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic33$, var89);
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
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic35$, var54, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        SubLObject var56 = (SubLObject)NIL;
        final SubLObject var57 = module0147.$g2094$.currentBinding(var55);
        final SubLObject var58 = module0147.$g2095$.currentBinding(var55);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var55);
            module0147.$g2095$.bind($ic12$, var55);
            if (NIL == var56) {
                SubLObject var59 = var54;
                final SubLObject var60 = (SubLObject)$ic23$;
                final SubLObject var61 = module0056.f4145(var60);
                final SubLObject var28_102 = module0139.$g1635$.currentBinding(var55);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var55);
                    final SubLObject var62 = (SubLObject)NIL;
                    final SubLObject var28_103 = module0141.$g1714$.currentBinding(var55);
                    final SubLObject var29_104 = module0141.$g1715$.currentBinding(var55);
                    try {
                        module0141.$g1714$.bind((NIL != var62) ? var62 : module0141.f9283(), var55);
                        module0141.$g1715$.bind((SubLObject)((NIL != var62) ? $ic24$ : module0141.$g1715$.getDynamicValue(var55)), var55);
                        if (NIL != var62 && NIL != module0136.f8864() && NIL == module0141.f9279(var62)) {
                            final SubLObject var63 = module0136.$g1591$.getDynamicValue(var55);
                            if (var63.eql((SubLObject)$ic25$)) {
                                module0136.f8870((SubLObject)ONE_INTEGER, (SubLObject)$ic26$, var62, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)$ic28$)) {
                                module0136.f8871((SubLObject)ONE_INTEGER, (SubLObject)$ic29$, (SubLObject)$ic26$, var62, (SubLObject)$ic27$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            else if (var63.eql((SubLObject)$ic30$)) {
                                Errors.warn((SubLObject)$ic26$, var62, (SubLObject)$ic27$);
                            }
                            else {
                                Errors.warn((SubLObject)$ic31$, module0136.$g1591$.getDynamicValue(var55));
                                Errors.cerror((SubLObject)$ic29$, (SubLObject)$ic26$, var62, (SubLObject)$ic27$);
                            }
                        }
                        final SubLObject var28_104 = module0141.$g1670$.currentBinding(var55);
                        final SubLObject var29_105 = module0141.$g1671$.currentBinding(var55);
                        final SubLObject var64 = module0141.$g1672$.currentBinding(var55);
                        final SubLObject var65 = module0141.$g1674$.currentBinding(var55);
                        final SubLObject var66 = module0137.$g1605$.currentBinding(var55);
                        try {
                            module0141.$g1670$.bind(module0137.f8955($ic32$), var55);
                            module0141.$g1671$.bind(module0244.f15739(module0137.f8955($ic32$)), var55);
                            module0141.$g1672$.bind(module0244.f15746(module0137.f8955($ic32$)), var55);
                            module0141.$g1674$.bind((SubLObject)NIL, var55);
                            module0137.$g1605$.bind(module0137.f8955($ic32$), var55);
                            if (NIL != module0136.f8865() || NIL != module0244.f15795(var54, module0137.f8955((SubLObject)UNPROVIDED))) {
                                final SubLObject var28_105 = module0141.$g1677$.currentBinding(var55);
                                final SubLObject var29_106 = module0138.$g1619$.currentBinding(var55);
                                final SubLObject var69_109 = module0141.$g1674$.currentBinding(var55);
                                try {
                                    module0141.$g1677$.bind(module0141.f9208(), var55);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9208(), module0137.f8955($ic32$)), var55);
                                    module0141.$g1674$.bind((SubLObject)NIL, var55);
                                    module0249.f16055(var59, (SubLObject)UNPROVIDED);
                                    while (NIL != var59 && NIL == var56) {
                                        final SubLObject var67 = var59;
                                        if (!var67.eql($ic18$) && NIL == module0205.f13145((SubLObject)$ic10$, var67, (SubLObject)T, (SubLObject)UNPROVIDED)) {
                                            var56 = (SubLObject)T;
                                        }
                                        final SubLObject var68 = module0200.f12443(module0137.f8955($ic32$));
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
                                        for (var69 = (SubLObject)NIL, var69 = var68; NIL == var56 && NIL != var69; var69 = var69.rest()) {
                                            var70 = var69.first();
                                            var28_106 = module0137.$g1605$.currentBinding(var55);
                                            var29_107 = module0141.$g1674$.currentBinding(var55);
                                            try {
                                                module0137.$g1605$.bind(var70, var55);
                                                module0141.$g1674$.bind((SubLObject)((NIL != module0141.f9205((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? makeBoolean(NIL == module0141.$g1674$.getDynamicValue(var55)) : module0141.$g1674$.getDynamicValue(var55)), var55);
                                                var71 = module0228.f15229(var59);
                                                if (NIL != module0138.f8992(var71)) {
                                                    var72 = module0242.f15664(var71, module0137.f8955((SubLObject)UNPROVIDED));
                                                    if (NIL != var72) {
                                                        var73 = module0245.f15834(var72, module0138.f8979(), module0137.f8955((SubLObject)UNPROVIDED));
                                                        if (NIL != var73) {
                                                            for (var74 = module0066.f4838(module0067.f4891(var73)); NIL == var56 && NIL == module0066.f4841(var74); var74 = module0066.f4840(var74)) {
                                                                var55.resetMultipleValues();
                                                                var75 = module0066.f4839(var74);
                                                                var76 = var55.secondMultipleValue();
                                                                var55.resetMultipleValues();
                                                                if (NIL != module0147.f9507(var75)) {
                                                                    var28_107 = module0138.$g1623$.currentBinding(var55);
                                                                    try {
                                                                        module0138.$g1623$.bind(var75, var55);
                                                                        for (var84_113 = module0066.f4838(module0067.f4891(var76)); NIL == var56 && NIL == module0066.f4841(var84_113); var84_113 = module0066.f4840(var84_113)) {
                                                                            var55.resetMultipleValues();
                                                                            var77 = module0066.f4839(var84_113);
                                                                            var78 = var55.secondMultipleValue();
                                                                            var55.resetMultipleValues();
                                                                            if (NIL != module0141.f9289(var77)) {
                                                                                var28_108 = module0138.$g1624$.currentBinding(var55);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var77, var55);
                                                                                    var79 = var78;
                                                                                    if (NIL != module0077.f5302(var79)) {
                                                                                        var80 = module0077.f5333(var79);
                                                                                        for (var81 = module0032.f1741(var80), var82 = (SubLObject)NIL, var82 = module0032.f1742(var81, var80); NIL == var56 && NIL == module0032.f1744(var81, var82); var82 = module0032.f1743(var82)) {
                                                                                            var83 = module0032.f1745(var81, var82);
                                                                                            if (NIL != module0032.f1746(var82, var83) && NIL == module0249.f16059(var83, (SubLObject)UNPROVIDED)) {
                                                                                                module0249.f16055(var83, (SubLObject)UNPROVIDED);
                                                                                                module0056.f4149(var83, var61);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var79.isList()) {
                                                                                        if (NIL == var56) {
                                                                                            var84 = var79;
                                                                                            var85 = (SubLObject)NIL;
                                                                                            var85 = var84.first();
                                                                                            while (NIL == var56 && NIL != var84) {
                                                                                                if (NIL == module0249.f16059(var85, (SubLObject)UNPROVIDED)) {
                                                                                                    module0249.f16055(var85, (SubLObject)UNPROVIDED);
                                                                                                    module0056.f4149(var85, var61);
                                                                                                }
                                                                                                var84 = var84.rest();
                                                                                                var85 = var84.first();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)$ic33$, var79);
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
                                                        module0136.f8870((SubLObject)FIVE_INTEGER, (SubLObject)$ic34$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                    }
                                                }
                                                else if (NIL != module0155.f9785(var71, (SubLObject)UNPROVIDED)) {
                                                    var86 = ((NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var55), module0137.f8955((SubLObject)UNPROVIDED)));
                                                    for (var77_115 = (SubLObject)NIL, var77_115 = var86; NIL == var56 && NIL != var77_115; var77_115 = var77_115.rest()) {
                                                        var87 = var77_115.first();
                                                        var28_109 = module0138.$g1625$.currentBinding(var55);
                                                        try {
                                                            module0138.$g1625$.bind(var87, var55);
                                                            var88 = (var89 = Functions.funcall(var87, var71));
                                                            if (NIL != module0077.f5302(var89)) {
                                                                var90 = module0077.f5333(var89);
                                                                for (var91 = module0032.f1741(var90), var92 = (SubLObject)NIL, var92 = module0032.f1742(var91, var90); NIL == var56 && NIL == module0032.f1744(var91, var92); var92 = module0032.f1743(var92)) {
                                                                    var93 = module0032.f1745(var91, var92);
                                                                    if (NIL != module0032.f1746(var92, var93) && NIL == module0249.f16059(var93, (SubLObject)UNPROVIDED)) {
                                                                        module0249.f16055(var93, (SubLObject)UNPROVIDED);
                                                                        module0056.f4149(var93, var61);
                                                                    }
                                                                }
                                                            }
                                                            else if (var89.isList()) {
                                                                if (NIL == var56) {
                                                                    var94 = var89;
                                                                    var95 = (SubLObject)NIL;
                                                                    var95 = var94.first();
                                                                    while (NIL == var56 && NIL != var94) {
                                                                        if (NIL == module0249.f16059(var95, (SubLObject)UNPROVIDED)) {
                                                                            module0249.f16055(var95, (SubLObject)UNPROVIDED);
                                                                            module0056.f4149(var95, var61);
                                                                        }
                                                                        var94 = var94.rest();
                                                                        var95 = var94.first();
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)$ic33$, var89);
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
                                module0136.f8872((SubLObject)TWO_INTEGER, (SubLObject)$ic35$, var54, module0244.f15748(module0137.f8955((SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        return $g5541$.getGlobalValue();
    }
    
    public static SubLObject f43085(final SubLObject var117) {
        return module0543.f33631(var117, f43084(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43086(final SubLObject var118, final SubLObject var119) {
        return f43085((SubLObject)ConsesLow.list($ic37$, var118, var119));
    }
    
    public static SubLObject f43087(final SubLObject var3, final SubLObject var120) {
        if (NIL != module0269.f17713(var3, (SubLObject)UNPROVIDED) && NIL != module0269.f17713(var120, (SubLObject)UNPROVIDED)) {
            return f43086(var3, var120);
        }
        return f43085((SubLObject)ConsesLow.list($ic38$, var3, var120));
    }
    
    public static SubLObject f43088(final SubLObject var118, final SubLObject var119) {
        return f43085((SubLObject)ConsesLow.list($ic32$, var119, var118));
    }
    
    public static SubLObject f43089(final SubLObject var118, final SubLObject var119) {
        return f43085((SubLObject)ConsesLow.list($ic32$, var118, var119));
    }
    
    public static SubLObject f43090(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        final SubLObject var23 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var24 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var21);
            module0147.$g2095$.bind($ic12$, var21);
            final SubLObject var26;
            final SubLObject var25 = var26 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var28_122 = module0034.$g879$.currentBinding(var21);
            try {
                module0034.$g879$.bind(var26, var21);
                SubLObject var27 = (SubLObject)NIL;
                if (NIL != var26 && NIL == module0034.f1842(var26)) {
                    var27 = module0034.f1869(var26);
                    final SubLObject var28 = Threads.current_process();
                    if (NIL == var27) {
                        module0034.f1873(var26, var28);
                    }
                    else if (!var27.eql(var28)) {
                        Errors.error((SubLObject)$ic17$);
                    }
                }
                try {
                    if (NIL == var22) {
                        SubLObject var29 = Sort.sort(f43063(var20), (SubLObject)$ic7$, (SubLObject)$ic39$);
                        SubLObject var30 = (SubLObject)NIL;
                        var30 = var29.first();
                        while (NIL == var22 && NIL != var29) {
                            if (NIL == f43082(var30)) {
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var21);
                        if (NIL != var26 && NIL == var27) {
                            module0034.f1873(var26, (SubLObject)NIL);
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
        return module0256.f16558(var124, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43092(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0034.$g879$.getDynamicValue(var125);
        SubLObject var127 = (SubLObject)NIL;
        if (NIL == var126) {
            return f43091(var124);
        }
        var127 = module0034.f1857(var126, (SubLObject)$ic39$, (SubLObject)UNPROVIDED);
        if (NIL == var127) {
            var127 = module0034.f1807(module0034.f1842(var126), (SubLObject)$ic39$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var126, (SubLObject)$ic39$, var127);
        }
        SubLObject var128 = module0034.f1814(var127, var124, (SubLObject)$ic15$);
        if (var128 == $ic15$) {
            var128 = Values.arg2(var125.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43091(var124)));
            module0034.f1816(var127, var124, var128, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var128);
    }
    
    public static SubLObject f43080(final SubLObject var125, final SubLObject var126, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = module0147.f9552((SubLObject)UNPROVIDED);
        }
        final SubLObject var128 = f43093(var125, var126, var127);
        return (SubLObject)((NIL != var128) ? Sequences.length(var128) : NIL);
    }
    
    public static SubLObject f43093(final SubLObject var125, final SubLObject var126, SubLObject var127) {
        if (var127 == UNPROVIDED) {
            var127 = module0147.f9552((SubLObject)UNPROVIDED);
        }
        final SubLThread var128 = SubLProcess.currentSubLThread();
        assert NIL != module0269.f17713(var125, (SubLObject)UNPROVIDED) : var125;
        assert NIL != module0269.f17713(var126, (SubLObject)UNPROVIDED) : var126;
        SubLObject var129 = (SubLObject)NIL;
        if (NIL != module0147.f9491(var127, (SubLObject)$ic11$)) {
            final SubLObject var130 = module0147.$g2094$.currentBinding(var128);
            final SubLObject var131 = module0147.$g2095$.currentBinding(var128);
            try {
                module0147.$g2094$.bind((SubLObject)$ic11$, var128);
                module0147.$g2095$.bind($ic12$, var128);
                if (var126.eql($ic18$) || NIL != module0256.f16576(var125, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var28_130 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)NIL;
                        if (NIL != var133 && NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)NIL);
                        }
                        finally {
                            final SubLObject var28_131 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var128);
                                if (NIL != var133 && NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)NIL);
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
        else if (NIL != module0147.f9491(var127, (SubLObject)$ic41$)) {
            final SubLObject var130 = module0147.$g2094$.currentBinding(var128);
            final SubLObject var131 = module0147.$g2095$.currentBinding(var128);
            try {
                module0147.$g2094$.bind((SubLObject)$ic41$, var128);
                module0147.$g2095$.bind($ic42$, var128);
                if (var126.eql($ic18$) || NIL != module0256.f16576(var125, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var28_132 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)NIL;
                        if (NIL != var133 && NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)NIL);
                        }
                        finally {
                            final SubLObject var28_133 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var128);
                                if (NIL != var133 && NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)NIL);
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
        else if (NIL != module0161.f10488(var127)) {
            final SubLObject var130 = module0147.$g2094$.currentBinding(var128);
            final SubLObject var131 = module0147.$g2096$.currentBinding(var128);
            try {
                module0147.$g2094$.bind((SubLObject)$ic43$, var128);
                module0147.$g2096$.bind(module0161.f10522(var127), var128);
                if (var126.eql($ic18$) || NIL != module0256.f16576(var125, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var28_134 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)NIL;
                        if (NIL != var133 && NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)NIL);
                        }
                        finally {
                            final SubLObject var28_135 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var128);
                                if (NIL != var133 && NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)NIL);
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
                module0147.$g2094$.bind((SubLObject)$ic44$, var128);
                module0147.$g2095$.bind(var127, var128);
                if (var126.eql($ic18$) || NIL != module0256.f16576(var125, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    final SubLObject var133;
                    final SubLObject var132 = var133 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    final SubLObject var28_136 = module0034.$g879$.currentBinding(var128);
                    try {
                        module0034.$g879$.bind(var133, var128);
                        SubLObject var134 = (SubLObject)NIL;
                        if (NIL != var133 && NIL == module0034.f1842(var133)) {
                            var134 = module0034.f1869(var133);
                            final SubLObject var135 = Threads.current_process();
                            if (NIL == var134) {
                                module0034.f1873(var133, var135);
                            }
                            else if (!var134.eql(var135)) {
                                Errors.error((SubLObject)$ic17$);
                            }
                        }
                        try {
                            var129 = f43094(var125, var126, (SubLObject)NIL);
                        }
                        finally {
                            final SubLObject var28_137 = Threads.$is_thread_performing_cleanupP$.currentBinding(var128);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var128);
                                if (NIL != var133 && NIL == var134) {
                                    module0034.f1873(var133, (SubLObject)NIL);
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
        SubLObject var139 = (SubLObject)NIL;
        if (var126.eql($ic18$) || NIL != module0256.f16576(var125, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var140 = f43096(var125);
            if (NIL != module0035.f2012(conses_high.set_difference(var140, var138, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED))) {
                var140 = module0256.f16529(conses_high.set_difference(module0256.f16531(var125, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.cons(var125, var140), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            SubLObject var141 = var140;
            SubLObject var142 = (SubLObject)NIL;
            var142 = var141.first();
            while (NIL != var141) {
                if (NIL == Sequences.find(var142, var138, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    if (var142.equal(var126)) {
                        if (NIL == var139) {
                            var139 = (SubLObject)ConsesLow.list(var125, var126);
                        }
                    }
                    else {
                        final SubLObject var143 = f43094(var142, var126, (SubLObject)ConsesLow.cons(var125, var138));
                        if (NIL != var143 && NIL == module0035.f2007(var139, var143)) {
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
        SubLObject var141 = (SubLObject)NIL;
        if (NIL == var140) {
            return f43095(var125, var126, var138);
        }
        var141 = module0034.f1857(var140, (SubLObject)$ic45$, (SubLObject)UNPROVIDED);
        if (NIL == var141) {
            var141 = module0034.f1807(module0034.f1842(var140), (SubLObject)$ic45$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var140, (SubLObject)$ic45$, var141);
        }
        final SubLObject var142 = module0034.f1781(var125, var126, var138);
        final SubLObject var143 = module0034.f1814(var141, var142, (SubLObject)UNPROVIDED);
        if (var143 != $ic15$) {
            SubLObject var144 = var143;
            SubLObject var145 = (SubLObject)NIL;
            var145 = var144.first();
            while (NIL != var144) {
                SubLObject var146 = var145.first();
                final SubLObject var147 = conses_high.second(var145);
                if (var125.equal(var146.first())) {
                    var146 = var146.rest();
                    if (var126.equal(var146.first())) {
                        var146 = var146.rest();
                        if (NIL != var146 && NIL == var146.rest() && var138.equal(var146.first())) {
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
        return module0256.f16525(var124, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43096(final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        final SubLObject var126 = module0034.$g879$.getDynamicValue(var125);
        SubLObject var127 = (SubLObject)NIL;
        if (NIL == var126) {
            return f43097(var124);
        }
        var127 = module0034.f1857(var126, (SubLObject)$ic46$, (SubLObject)UNPROVIDED);
        if (NIL == var127) {
            var127 = module0034.f1807(module0034.f1842(var126), (SubLObject)$ic46$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var126, (SubLObject)$ic46$, var127);
        }
        SubLObject var128 = module0034.f1814(var127, var124, (SubLObject)$ic15$);
        if (var128 == $ic15$) {
            var128 = Values.arg2(var125.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43097(var124)));
            module0034.f1816(var127, var124, var128, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var128);
    }
    
    public static SubLObject f43098(final SubLObject var149, SubLObject var150, SubLObject var151) {
        if (var150 == UNPROVIDED) {
            var150 = (SubLObject)$ic47$;
        }
        if (var151 == UNPROVIDED) {
            var151 = (SubLObject)TWO_INTEGER;
        }
        return f43099(var149, var150, var151, (SubLObject)NIL);
    }
    
    public static SubLObject f43099(final SubLObject var149, final SubLObject var150, final SubLObject var151, final SubLObject var129) {
        final SubLThread var152 = SubLProcess.currentSubLThread();
        SubLObject var153 = (SubLObject)NIL;
        if (NIL == var151 || var151.isPositive()) {
            final SubLObject var154 = module0147.$g2094$.currentBinding(var152);
            final SubLObject var155 = module0147.$g2095$.currentBinding(var152);
            try {
                module0147.$g2094$.bind((SubLObject)$ic11$, var152);
                module0147.$g2095$.bind($ic12$, var152);
                SubLObject var156 = (var150 == $ic47$) ? module0256.f16525(var149, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : module0256.f16541(var149, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var157 = (SubLObject)NIL;
                var157 = var156.first();
                while (NIL != var156) {
                    if (NIL == Sequences.find(var157, var129, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        var153 = (SubLObject)ConsesLow.cons(f43099(var157, var150, (SubLObject)((NIL != var151) ? module0048.f_1_(var151) : NIL), (SubLObject)ConsesLow.cons(var149, var129)), var153);
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
        SubLObject var23 = (SubLObject)NIL;
        final SubLObject var24 = module0147.$g2094$.currentBinding(var21);
        final SubLObject var25 = module0147.$g2095$.currentBinding(var21);
        try {
            module0147.$g2094$.bind((SubLObject)$ic11$, var21);
            module0147.$g2095$.bind($ic12$, var21);
            var23 = module0256.f16538(var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
        SubLObject var156 = (SubLObject)NIL;
        final SubLObject var157 = constants_high_oc.f10737(var155);
        if (NIL != var157) {
            var156 = (SubLObject)ConsesLow.cons(var157, var156);
        }
        SubLObject var158 = module0731.f44783(var155, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var159 = (SubLObject)NIL;
        var159 = var158.first();
        while (NIL != var158) {
            final SubLObject var160 = var159;
            if (NIL == conses_high.member(var160, var156, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var156 = (SubLObject)ConsesLow.cons(var160, var156);
            }
            var158 = var158.rest();
            var159 = var158.first();
        }
        final SubLObject var161 = module0038.f2785(var155);
        if (!var161.equal(var155)) {
            SubLObject var162 = module0038.f2849(var161);
            SubLObject var163 = (SubLObject)NIL;
            var163 = var162.first();
            while (NIL != var162) {
                SubLObject var10_161 = module0731.f44783(var163, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var164 = (SubLObject)NIL;
                var164 = var10_161.first();
                while (NIL != var10_161) {
                    final SubLObject var165 = var164;
                    if (NIL == conses_high.member(var165, var156, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var156 = (SubLObject)ConsesLow.cons(var165, var156);
                    }
                    var10_161 = var10_161.rest();
                    var164 = var10_161.first();
                }
                var162 = var162.rest();
                var163 = var162.first();
            }
        }
        if (NIL != Characters.lower_case_p(module0038.f2636(var155)) && NIL == module0728.f44502(var155)) {
            final SubLObject var166 = module0777.f50077(var155);
            if (!var166.equal(var155)) {
                SubLObject var162 = f43062(var166);
                SubLObject var167 = (SubLObject)NIL;
                var167 = var162.first();
                while (NIL != var162) {
                    final SubLObject var168 = var167;
                    if (NIL == conses_high.member(var168, var156, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var156 = (SubLObject)ConsesLow.cons(var168, var156);
                    }
                    var162 = var162.rest();
                    var167 = var162.first();
                }
            }
        }
        if (NIL != module0038.f2673(var155, (SubLObject)$ic48$, (SubLObject)UNPROVIDED)) {
            final SubLObject var169 = module0038.f2623(var155, (SubLObject)ZERO_INTEGER, Numbers.subtract(Sequences.length(var155), (SubLObject)TWO_INTEGER));
            SubLObject var162 = f43062(var169);
            SubLObject var167 = (SubLObject)NIL;
            var167 = var162.first();
            while (NIL != var162) {
                final SubLObject var168 = var167;
                if (NIL == conses_high.member(var168, var156, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
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
        final SubLObject var158 = (SubLObject)((NIL != Characters.upper_case_p(module0038.f2636(var155))) ? $ic49$ : $ic50$);
        SubLObject var159 = (SubLObject)NIL;
        SubLObject var160 = (SubLObject)NIL;
        SubLObject var161 = var156;
        SubLObject var162 = (SubLObject)NIL;
        var162 = var161.first();
        while (NIL != var161) {
            final SubLObject var163 = module0147.$g2094$.currentBinding(var157);
            final SubLObject var164 = module0147.$g2095$.currentBinding(var157);
            try {
                module0147.$g2094$.bind((SubLObject)$ic11$, var157);
                module0147.$g2095$.bind($ic12$, var157);
                final SubLObject var165 = var158;
                if (var165.eql((SubLObject)$ic49$)) {
                    if (NIL != module0269.f17713(var162, (SubLObject)UNPROVIDED)) {
                        var159 = (SubLObject)ConsesLow.cons(var162, var159);
                    }
                    else {
                        var160 = (SubLObject)ConsesLow.cons(var162, var160);
                    }
                }
                else if (var165.eql((SubLObject)$ic50$)) {
                    if (NIL != module0269.f17718(var162, (SubLObject)UNPROVIDED)) {
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
        return Sequences.remove_duplicates(Sequences.cconcatenate($g5545$.getGlobalValue(), new SubLObject[] { $g5544$.getGlobalValue(), $g5543$.getGlobalValue(), $g5542$.getGlobalValue() }), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43103() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.make_list(Sequences.length($g5546$.getDynamicValue(var2)), (SubLObject)NIL);
    }
    
    public static SubLObject f43104(final SubLObject var167, final SubLObject var164) {
        final SubLThread var168 = SubLProcess.currentSubLThread();
        if (NIL != module0107.f7629($g5548$.getDynamicValue(var168))) {
            final SubLObject var169 = f43105(var164);
            final SubLObject var170 = f43106(var167, var164);
            final SubLObject var171 = f43107(var170, var164, var169);
            SubLObject var172 = var169;
            if (NIL != var171) {
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
        if (NIL != f43110(var172)) {
            f43111(var171, var172);
        }
        else {
            f43112(var171, var172);
        }
        return var172;
    }
    
    public static SubLObject f43113(final SubLObject var173, final SubLObject var164) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        assert NIL != module0107.f7629($g5548$.getDynamicValue(var174)) : $g5548$.getDynamicValue(var174);
        final SubLObject var175 = f43114(var164);
        final SubLObject var176 = ConsesLow.nth(var175, $g5548$.getDynamicValue(var174));
        return f43107(var173, var164, var176);
    }
    
    public static SubLObject f43107(final SubLObject var173, final SubLObject var164, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        final SubLObject var177 = $g5547$.currentBinding(var176);
        try {
            $g5547$.bind(var164, var176);
            return Sequences.find(var173, var175, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            $g5547$.rebind(var177, var176);
        }
    }
    
    public static SubLObject f43106(final SubLObject var176, SubLObject var164) {
        if (var164 == UNPROVIDED) {
            var164 = $g5547$.getDynamicValue();
        }
        final SubLObject var177 = var164;
        if (var177.eql((SubLObject)$ic59$)) {
            final SubLObject var178 = f43115(var176);
            return (NIL != var178) ? var178 : f43116(var176, (SubLObject)UNPROVIDED);
        }
        final SubLObject var178 = f43117(var176);
        return (NIL != var178) ? var178 : f43118(var176, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43105(final SubLObject var164) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        assert NIL != module0107.f7629($g5548$.getDynamicValue(var165)) : $g5548$.getDynamicValue(var165);
        final SubLObject var166 = f43114(var164);
        return ConsesLow.nth(var166, $g5548$.getDynamicValue(var165));
    }
    
    public static SubLObject f43109(final SubLObject var164, final SubLObject var175) {
        final SubLThread var176 = SubLProcess.currentSubLThread();
        assert NIL != module0107.f7629($g5548$.getDynamicValue(var176)) : $g5548$.getDynamicValue(var176);
        final SubLObject var177 = f43114(var164);
        return ConsesLow.set_nth(var177, $g5548$.getDynamicValue(var176), var175);
    }
    
    public static SubLObject f43114(final SubLObject var164) {
        final SubLThread var165 = SubLProcess.currentSubLThread();
        final SubLObject var166 = Sequences.position(var164, $g5546$.getDynamicValue(var165), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var165) && NIL == module0004.f106(var166)) {
            Errors.error((SubLObject)$ic60$, var164, $g5546$.getDynamicValue(var165));
        }
        return var166;
    }
    
    public static SubLObject f43119(final SubLObject var177, final SubLObject var178, SubLObject var179, SubLObject var180, SubLObject var181, SubLObject var182, SubLObject var183, SubLObject var184) {
        if (var179 == UNPROVIDED) {
            var179 = var177;
        }
        if (var180 == UNPROVIDED) {
            var180 = (SubLObject)NIL;
        }
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)NIL;
        }
        if (var182 == UNPROVIDED) {
            var182 = module0111.$g1405$.getDynamicValue();
        }
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        if (var184 == UNPROVIDED) {
            var184 = (SubLObject)NIL;
        }
        return f43120(module0035.f2333((SubLObject)$ic62$, (SubLObject)ConsesLow.list(var177, var178, var179, var180, var181, var182, var183, var184)));
    }
    
    public static SubLObject f43120(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        SubLObject var187 = conses_high.getf(var185, (SubLObject)$ic63$, (SubLObject)UNPROVIDED);
        final SubLObject var188 = conses_high.getf(var185, (SubLObject)$ic64$, (SubLObject)UNPROVIDED);
        final SubLObject var189 = conses_high.getf(var185, (SubLObject)$ic65$, (SubLObject)UNPROVIDED);
        final SubLObject var190 = conses_high.getf(var185, (SubLObject)$ic66$, (SubLObject)UNPROVIDED);
        SubLObject var191 = conses_high.getf(var185, (SubLObject)$ic67$, (SubLObject)UNPROVIDED);
        SubLObject var192 = conses_high.getf(var185, (SubLObject)$ic68$, (SubLObject)UNPROVIDED);
        SubLObject var193 = conses_high.getf(var185, (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
        final SubLObject var194 = conses_high.getf(var185, (SubLObject)$ic70$, (SubLObject)UNPROVIDED);
        final SubLObject var195 = conses_high.getf(var185, (SubLObject)$ic71$, (SubLObject)UNPROVIDED);
        final SubLObject var196 = conses_high.getf(var185, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
        var187 = module0038.f2711(var187, (SubLObject)Characters.CHAR_hash);
        var187 = module0038.f2711(var187, (SubLObject)Characters.CHAR_slash);
        if (NIL == var192) {
            var192 = f43121(var187, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var193) {
            var193 = f43122(var192, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0038.f2611(var191)) {
            var191 = var187;
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var186) && NIL == module0589.f35907(var191, (SubLObject)UNPROVIDED) && NIL == module0075.f5218(var191)) {
            Errors.error((SubLObject)$ic73$);
        }
        final SubLObject var197 = module0111.$g1405$.currentBinding(var186);
        try {
            module0111.$g1405$.bind((SubLObject)NIL, var186);
            module0574.f35153(var194);
            module0543.f33621();
        }
        finally {
            module0111.$g1405$.rebind(var197, var186);
        }
        if (NIL != var187 && !areAssertionsDisabledFor(me) && NIL == module0589.f35907(var187, (SubLObject)UNPROVIDED)) {
            throw new AssertionError(var187);
        }
        final SubLObject var198 = (SubLObject)((NIL != module0075.f5218(var191)) ? $ic75$ : $ic76$);
        final SubLObject var199 = var198.eql((SubLObject)$ic75$) ? var191 : module0699.f42601(var191, (SubLObject)UNPROVIDED);
        SubLObject var200 = (SubLObject)NIL;
        final SubLObject var201 = f43123(var192, var189, var190, var193, var194, var187, var188, var195, var196);
        final SubLObject var202 = $g5550$.currentBinding(var186);
        final SubLObject var203 = $g5549$.currentBinding(var186);
        try {
            $g5550$.bind(var201, var186);
            $g5549$.bind(f43124(), var186);
            var200 = f43125(var201);
            f43126(var201);
            try {
                f43127(var191, var199, var187, var201);
            }
            finally {
                final SubLObject var28_192 = Threads.$is_thread_performing_cleanupP$.currentBinding(var186);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var186);
                    f43128();
                    f43129((SubLObject)UNPROVIDED);
                    f43130((SubLObject)UNPROVIDED);
                    f43131(var200, var201);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var28_192, var186);
                }
            }
        }
        finally {
            $g5549$.rebind(var203, var186);
            $g5550$.rebind(var202, var186);
        }
        if (var198.eql((SubLObject)$ic76$)) {
            Filesys.delete_file(var199);
        }
        f43132();
        return var200;
    }
    
    public static SubLObject f43069() {
        final SubLObject var193 = $g5551$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43133(final SubLObject var189) {
        return module0034.f1829($g5551$.getGlobalValue(), (SubLObject)ConsesLow.list(var189), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43134(final SubLObject var189) {
        SubLObject var190 = (SubLObject)NIL;
        SubLObject var191 = (SubLObject)NIL;
        try {
            var191 = compatibility.open_text(var189, (SubLObject)$ic78$);
            if (!var191.isStream()) {
                Errors.error((SubLObject)$ic79$, var189);
            }
            final SubLObject var192 = var191;
            var190 = Sequences.delete_if((SubLObject)$ic80$, module0590.f35984(var192, (SubLObject)T, (SubLObject)T, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            final SubLObject var193 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var191.isStream()) {
                    streams_high.close(var191, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var193);
            }
        }
        return var190;
    }
    
    public static SubLObject f43135(final SubLObject var189) {
        SubLObject var190 = $g5551$.getGlobalValue();
        if (NIL == var190) {
            var190 = module0034.f1934((SubLObject)$ic77$, (SubLObject)$ic81$, (SubLObject)$ic82$, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var191 = module0034.f1814(var190, var189, (SubLObject)$ic15$);
        if (var191 == $ic15$) {
            var191 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43134(var189)));
            module0034.f1816(var190, var189, var191, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var191);
    }
    
    public static SubLObject f43127(final SubLObject var179, final SubLObject var189, final SubLObject var177, final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)T, (SubLObject)$ic83$, var177, var179);
        final SubLObject var194;
        final SubLObject var193 = var194 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var195 = module0034.$g879$.currentBinding(var192);
        try {
            module0034.$g879$.bind(var194, var192);
            SubLObject var196 = (SubLObject)NIL;
            if (NIL != var194 && NIL == module0034.f1842(var194)) {
                var196 = module0034.f1869(var194);
                final SubLObject var197 = Threads.current_process();
                if (NIL == var196) {
                    module0034.f1873(var194, var197);
                }
                else if (!var196.eql(var197)) {
                    Errors.error((SubLObject)$ic17$);
                }
            }
            try {
                final SubLObject var28_199 = $g5548$.currentBinding(var192);
                try {
                    $g5548$.bind(f43103(), var192);
                    final SubLObject var198 = f43135(var189);
                    f43136(var198.first(), var191);
                    final SubLObject var199 = f43137(var191);
                    f43138(var199, var198, var191);
                    final SubLObject var200 = f43139(var199, var198, var191);
                    f43140(var198, (SubLObject)ConsesLow.cons(var177, var200), var191);
                    f43141(var198, var191);
                    f43142(var198, var191);
                    SubLObject var201 = f43105((SubLObject)$ic84$);
                    SubLObject var202 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic85$, Sequences.length(var201));
                    f43143(var201, var191, var202);
                    f43144(var198, var191);
                    f43145(f43105((SubLObject)$ic59$), var191);
                    f43146(var198, var191);
                    var201 = f43105((SubLObject)$ic86$);
                    var202 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic87$, Sequences.length(var201));
                    f43143(var201, var191, var202);
                }
                finally {
                    $g5548$.rebind(var28_199, var192);
                }
            }
            finally {
                final SubLObject var28_200 = Threads.$is_thread_performing_cleanupP$.currentBinding(var192);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var192);
                    if (NIL != var194 && NIL == var196) {
                        module0034.f1873(var194, (SubLObject)NIL);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43136(final SubLObject var204, final SubLObject var191) {
        SubLObject var205 = $g5552$.getGlobalValue();
        if (NIL != module0590.f36071(var204, (SubLObject)$ic89$)) {
            var205 = module0590.f36089(var204, (SubLObject)$ic90$, var205);
        }
        f43147(var205, var191);
        return var205;
    }
    
    public static SubLObject f43125(final SubLObject var191) {
        final SubLObject var192 = f43148(Sequences.cconcatenate((SubLObject)$ic91$, f43149(var191)), (SubLObject)$ic92$, $ic93$, (SubLObject)$ic94$, (SubLObject)$ic94$, (SubLObject)$ic95$, var191);
        f43150(var192, var191);
        f43151(var192, var191);
        f43152(var192, var191);
        f43153(var192, var191);
        return var192;
    }
    
    public static SubLObject f43149(final SubLObject var191) {
        final SubLObject var192 = f43137(var191);
        return (NIL != constant_handles_oc.f8449(var192)) ? constants_high_oc.f10743(var192) : f43154(var191);
    }
    
    public static SubLObject f43150(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = module0612.f37527();
        return f43155((SubLObject)ConsesLow.list($ic96$, var190, var192), $ic93$, var191);
    }
    
    public static SubLObject f43151(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = f43137(var191);
        return (SubLObject)((NIL != var192) ? f43155((SubLObject)ConsesLow.list($ic97$, var190, var192), $ic93$, var191) : NIL);
    }
    
    public static SubLObject f43152(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = f43156(var191);
        return (SubLObject)((NIL != var192) ? f43155((SubLObject)ConsesLow.list($ic98$, var190, var192), $ic93$, var191) : NIL);
    }
    
    public static SubLObject f43131(final SubLObject var190, final SubLObject var191) {
        final SubLObject var192 = module0612.f37527();
        return f43155((SubLObject)ConsesLow.list($ic99$, var190, var192), $ic93$, var191);
    }
    
    public static SubLObject f43138(final SubLObject var180, SubLObject var194, final SubLObject var191) {
        SubLObject var195 = (SubLObject)NIL;
        while (NIL == var195 && NIL == module0035.f2012(var194)) {
            final SubLObject var196 = var194.first();
            if (NIL != module0590.f36071(var196, module0708.f43012((SubLObject)$ic100$))) {
                if (NIL == module0590.f36072(var196)) {
                    f43157(var180, var194, var191);
                }
                var195 = (SubLObject)T;
            }
            else if (NIL == module0590.f36082(var196)) {
                var194 = module0590.f36061(var194, (SubLObject)UNPROVIDED);
            }
            else if (NIL != module0590.f36071(var196, module0699.f42535((SubLObject)$ic101$))) {
                f43158(var196, var191);
                var194 = module0590.f36061(var194, (SubLObject)UNPROVIDED);
            }
            else {
                var194 = module0590.f36068(var194);
            }
        }
        return var180;
    }
    
    public static SubLObject f43158(final SubLObject var204, final SubLObject var191) {
        final SubLObject var205 = f43159(var204);
        if (NIL != var205) {
            f43160(var205, var191);
        }
        return var205;
    }
    
    public static SubLObject f43159(final SubLObject var204) {
        SubLObject var205 = (SubLObject)NIL;
        SubLObject var207;
        final SubLObject var206 = var207 = module0590.f36044(var204);
        SubLObject var208 = (SubLObject)NIL;
        SubLObject var209 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)$ic102$);
        var208 = var207.first();
        var207 = (var209 = var207.rest());
        SubLObject var210;
        SubLObject var211;
        SubLObject var216_217;
        SubLObject var214_215;
        SubLObject var212;
        SubLObject var213;
        for (var210 = (SubLObject)NIL, var210 = var209; NIL == var205 && NIL != var210; var210 = var210.rest()) {
            var211 = var210.first();
            var214_215 = (var216_217 = var211);
            var212 = (SubLObject)NIL;
            var213 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var216_217, var214_215, (SubLObject)$ic103$);
            var212 = var216_217.first();
            var216_217 = (var213 = var216_217.rest());
            if (var212.equal(f43161((SubLObject)$ic104$))) {
                if (NIL != module0589.f35907(var213, (SubLObject)UNPROVIDED)) {
                    var205 = var213;
                }
                else {
                    Errors.warn((SubLObject)$ic105$, var213);
                }
            }
        }
        return var205;
    }
    
    public static SubLObject f43162() {
        final SubLObject var193 = $g5553$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43163(final SubLObject var191) {
        return module0034.f1829($g5553$.getGlobalValue(), (SubLObject)ConsesLow.list(var191), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43164(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        SubLObject var193 = (SubLObject)NIL;
        final SubLObject var194 = module0111.$g1405$.currentBinding(var192);
        try {
            module0111.$g1405$.bind((SubLObject)NIL, var192);
            module0574.f35153(f43156(var191));
            var193 = f43165(f43137(var191));
        }
        finally {
            module0111.$g1405$.rebind(var194, var192);
        }
        return var193;
    }
    
    public static SubLObject f43166(final SubLObject var191) {
        SubLObject var192 = $g5553$.getGlobalValue();
        if (NIL == var192) {
            var192 = module0034.f1934((SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var193 = module0034.f1814(var192, var191, (SubLObject)$ic15$);
        if (var193 == $ic15$) {
            var193 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43164(var191)));
            module0034.f1816(var192, var191, var193, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var193);
    }
    
    public static SubLObject f43165(final SubLObject var180) {
        return module0285.f18993((SubLObject)ConsesLow.list($ic108$, var180), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43157(final SubLObject var180, final SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && NIL == module0590.f36071(var194.first(), module0708.f43012((SubLObject)$ic100$))) {
            Errors.error((SubLObject)$ic109$, var194.first());
        }
        SubLObject var196 = var194.rest();
        final SubLObject var197 = f43166(var191);
        SubLObject var198 = (SubLObject)NIL;
        while (NIL == var198) {
            if (NIL != module0035.f2012(var196)) {
                Errors.error((SubLObject)$ic110$, module0035.f2124((SubLObject)$ic111$, var194));
            }
            SubLObject var199;
            for (var199 = var196.first(); NIL == module0590.f36082(var199); var199 = var196.first()) {
                var196 = module0590.f36061(var196, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0590.f36071(var199, module0699.f42555((SubLObject)$ic112$))) {
                final SubLObject var200 = conses_high.second(var196);
                if (NIL != module0590.f36082(var200)) {
                    Errors.warn((SubLObject)$ic113$, var200);
                }
                else {
                    f43155((SubLObject)ConsesLow.list($ic114$, var180, var200), var197, var191);
                }
            }
            else if (NIL != module0590.f36071(var199, module0699.f42555((SubLObject)$ic115$))) {
                final SubLObject var201 = module0590.f36089(var199, f43161((SubLObject)$ic116$), (SubLObject)NIL);
                final SubLObject var202 = (NIL != var201) ? module0642.f39117(var201) : $ic117$;
                final SubLObject var203 = conses_high.second(var196);
                if (NIL != module0590.f36082(var203)) {
                    Errors.warn((SubLObject)$ic118$, var203);
                }
                else {
                    f43167(var180, (SubLObject)ConsesLow.cons(var203, var202), var191);
                }
            }
            else if (NIL != module0590.f36071(var199, module0708.f43012((SubLObject)$ic119$))) {
                final SubLObject var204 = conses_high.second(var196);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && NIL == module0590.f36071(var204, module0708.f43012((SubLObject)$ic100$))) {
                    Errors.error((SubLObject)$ic109$, var204);
                }
                final SubLObject var205 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic120$), (SubLObject)UNPROVIDED);
                final SubLObject var206 = (NIL != module0589.f35907(var205, (SubLObject)UNPROVIDED)) ? var205 : f43168(var205);
                final SubLObject var207 = f43121(var206, var191, (SubLObject)UNPROVIDED);
                f43155((SubLObject)ConsesLow.list($ic121$, var180, var207), $ic36$, var191);
            }
            else if (NIL == module0590.f36071(var199, module0708.f43012((SubLObject)$ic122$))) {
                if (NIL == module0590.f36071(var199, module0708.f43012((SubLObject)$ic123$))) {
                    if (NIL != module0590.f36070(module0708.f43012((SubLObject)$ic100$), var199)) {
                        var198 = (SubLObject)T;
                    }
                    else {
                        Errors.warn((SubLObject)$ic124$, var199);
                    }
                }
            }
            var196 = module0590.f36068(var196);
        }
        return var180;
    }
    
    public static SubLObject f43169(final SubLObject var229, final SubLObject var230) {
        f43170(var229, var230, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43171(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47094_native.class) ? T : NIL);
    }
    
    public static SubLObject f43172(final SubLObject var229) {
        assert NIL != f43171(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43173(final SubLObject var229) {
        assert NIL != f43171(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43174(final SubLObject var229) {
        assert NIL != f43171(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43175(final SubLObject var229) {
        assert NIL != f43171(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43176(final SubLObject var229) {
        assert NIL != f43171(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43177(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43171(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43178(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43171(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43179(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43171(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43180(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43171(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43181(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43171(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43182(SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = (SubLObject)NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47094_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)NIL, var235 = var233; NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)$ic144$)) {
                f43177(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic145$)) {
                f43178(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic146$)) {
                f43179(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic147$)) {
                f43180(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic148$)) {
                f43181(var234, var237);
            }
            else {
                Errors.error((SubLObject)$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43183(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)$ic150$, (SubLObject)$ic151$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic144$, f43172(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic145$, f43173(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic146$, f43174(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic147$, f43175(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic148$, f43176(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic153$, (SubLObject)$ic151$, (SubLObject)FIVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43184(final SubLObject var238, final SubLObject var239) {
        return f43183(var238, var239);
    }
    
    public static SubLObject f43170(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        PrintLow.format(var230, (SubLObject)$ic155$, f43116(var240, (SubLObject)UNPROVIDED));
        return var240;
    }
    
    public static SubLObject f43185(final SubLObject var241) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        final SubLObject var243 = (SubLObject)((NIL != var241 && NIL != module0107.f7629($g5548$.getDynamicValue(var242))) ? f43113(var241, (SubLObject)$ic59$) : NIL);
        return (NIL != var243) ? var243 : f43186(var241, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43186(final SubLObject var241, SubLObject var173, SubLObject var222, SubLObject var243, SubLObject var244) {
        if (var173 == UNPROVIDED) {
            var173 = (SubLObject)NIL;
        }
        if (var222 == UNPROVIDED) {
            var222 = (SubLObject)NIL;
        }
        if (var243 == UNPROVIDED) {
            var243 = (SubLObject)NIL;
        }
        if (var244 == UNPROVIDED) {
            var244 = (SubLObject)NIL;
        }
        final SubLObject var245 = f43182((SubLObject)UNPROVIDED);
        if (NIL != var173) {
            f43187(var245, var173);
        }
        f43188(var245, var222);
        f43189(var245, var243);
        f43190(var245, var244);
        f43181(var245, (SubLObject)NIL);
        if (NIL != var241) {
            f43191(var245, (SubLObject)$ic156$, var241);
        }
        return var245;
    }
    
    public static SubLObject f43115(final SubLObject var242) {
        assert NIL != f43171(var242) : var242;
        return f43172(var242);
    }
    
    public static SubLObject f43192(final SubLObject var242) {
        assert NIL != f43171(var242) : var242;
        return f43173(var242);
    }
    
    public static SubLObject f43193(final SubLObject var242) {
        assert NIL != f43171(var242) : var242;
        return f43174(var242);
    }
    
    public static SubLObject f43194(final SubLObject var242) {
        assert NIL != f43171(var242) : var242;
        return f43175(var242);
    }
    
    public static SubLObject f43195(final SubLObject var242) {
        assert NIL != f43171(var242) : var242;
        return f43176(var242);
    }
    
    public static SubLObject f43196(final SubLObject var242, final SubLObject var245, SubLObject var246) {
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)NIL;
        }
        return conses_high.getf(f43176(var242), var245, var246);
    }
    
    public static SubLObject f43116(final SubLObject var242, SubLObject var246) {
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)NIL;
        }
        return f43196(var242, (SubLObject)$ic156$, var246);
    }
    
    public static SubLObject f43187(final SubLObject var242, final SubLObject var11) {
        assert NIL != f43171(var242) : var242;
        assert NIL != Types.stringp(var11) : var11;
        f43177(var242, var11);
        return f43172(var242);
    }
    
    public static SubLObject f43188(final SubLObject var242, final SubLObject var222) {
        assert NIL != f43171(var242) : var242;
        if (NIL != var222 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var222)) {
            throw new AssertionError(var222);
        }
        f43178(var242, var222);
        return f43173(var242);
    }
    
    public static SubLObject f43189(final SubLObject var242, final SubLObject var243) {
        assert NIL != f43171(var242) : var242;
        assert NIL != module0035.f2015(var243) : var243;
        f43179(var242, var243);
        return f43174(var242);
    }
    
    public static SubLObject f43190(final SubLObject var242, final SubLObject var244) {
        assert NIL != f43171(var242) : var242;
        if (NIL != var244 && !areAssertionsDisabledFor(me) && NIL == f43197(var244)) {
            throw new AssertionError(var244);
        }
        f43180(var242, var244);
        return f43175(var242);
    }
    
    public static SubLObject f43112(final SubLObject var171, final SubLObject var172) {
        f43187(var172, f43115(var171));
        f43188(var172, f43192(var171));
        f43189(var172, conses_high.union(f43193(var171), f43193(var172), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f43190(var172, f43194(var171));
        SubLObject var173;
        SubLObject var174;
        SubLObject var175;
        SubLObject var176;
        SubLObject var177;
        for (var173 = (SubLObject)NIL, var173 = f43195(var171); NIL != var173; var173 = conses_high.cddr(var173)) {
            var174 = var173.first();
            var175 = conses_high.cadr(var173);
            var176 = f43196(var172, var174, (SubLObject)UNPROVIDED);
            var177 = ((NIL != f43198(var174)) ? conses_high.union(var175, var176, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) : var175);
            f43191(var172, var174, var177);
        }
        return var172;
    }
    
    public static SubLObject f43197(final SubLObject var240) {
        return (SubLObject)makeBoolean(NIL != f43199(var240) || NIL != f43200(var240) || NIL != f43201(var240) || NIL != module0590.f36048(var240) || NIL != f43202(var240) || NIL != f43203(var240) || NIL != module0062.f4492(var240, (SubLObject)$ic160$) || NIL != f43204(var240) || NIL != module0205.f13145((SubLObject)$ic161$, var240, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0206.f13444(var240));
    }
    
    public static SubLObject f43204(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)$ic162$);
    }
    
    public static SubLObject f43203(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)$ic163$);
    }
    
    public static SubLObject f43199(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)$ic164$);
    }
    
    public static SubLObject f43205(final SubLObject var252) {
        return var252.rest();
    }
    
    public static SubLObject f43200(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)$ic165$);
    }
    
    public static SubLObject f43206(final SubLObject var253) {
        final SubLObject var254 = var253.rest();
        return var254;
    }
    
    public static SubLObject f43201(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)$ic166$);
    }
    
    public static SubLObject f43207(final SubLObject var254) {
        assert NIL != f43201(var254) : var254;
        return var254.rest();
    }
    
    public static SubLObject f43191(final SubLObject var242, final SubLObject var245, final SubLObject var25) {
        f43181(var242, conses_high.putf(f43176(var242), var245, var25));
        return f43176(var242);
    }
    
    public static SubLObject f43208(final SubLObject var242, final SubLObject var245, final SubLObject var25) {
        final SubLObject var246 = conses_high.getf(f43176(var242), var245, (SubLObject)NIL);
        final SubLObject var247 = (SubLObject)((NIL != Sequences.find(var25, var246, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? var246 : ConsesLow.cons(var25, var246));
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
        f43212(var229, var230, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43213(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47096_native.class) ? T : NIL);
    }
    
    public static SubLObject f43214(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43215(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43216(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43217(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43218(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43219(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField7();
    }
    
    public static SubLObject f43220(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField8();
    }
    
    public static SubLObject f43221(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField9();
    }
    
    public static SubLObject f43222(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField10();
    }
    
    public static SubLObject f43223(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField11();
    }
    
    public static SubLObject f43224(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField12();
    }
    
    public static SubLObject f43225(final SubLObject var229) {
        assert NIL != f43213(var229) : var229;
        return var229.getField13();
    }
    
    public static SubLObject f43226(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43227(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43228(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43229(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43230(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43231(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField7(var232);
    }
    
    public static SubLObject f43232(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField8(var232);
    }
    
    public static SubLObject f43233(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField9(var232);
    }
    
    public static SubLObject f43234(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField10(var232);
    }
    
    public static SubLObject f43235(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField11(var232);
    }
    
    public static SubLObject f43236(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField12(var232);
    }
    
    public static SubLObject f43237(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43213(var229) : var229;
        return var229.setField13(var232);
    }
    
    public static SubLObject f43238(SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = (SubLObject)NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47096_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)NIL, var235 = var233; NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)$ic68$)) {
                f43226(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic202$)) {
                f43227(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic65$)) {
                f43228(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic66$)) {
                f43229(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic203$)) {
                f43230(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic64$)) {
                f43231(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic70$)) {
                f43232(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic69$)) {
                f43233(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic71$)) {
                f43234(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic72$)) {
                f43235(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic204$)) {
                f43236(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic205$)) {
                f43237(var234, var237);
            }
            else {
                Errors.error((SubLObject)$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43239(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)$ic150$, (SubLObject)$ic206$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic68$, f43214(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic202$, f43215(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic65$, f43216(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic66$, f43217(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic203$, f43218(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic64$, f43219(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic70$, f43220(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic69$, f43221(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic71$, f43222(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic72$, f43223(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic204$, f43224(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic205$, f43225(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic153$, (SubLObject)$ic206$, (SubLObject)TWELVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43240(final SubLObject var238, final SubLObject var239) {
        return f43239(var238, var239);
    }
    
    public static SubLObject f43212(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        final SubLObject var241 = f43214(var240);
        PrintLow.format(var230, (SubLObject)$ic208$, (NIL != var241) ? var241 : f43216(var240));
        return var240;
    }
    
    public static SubLObject f43123(final SubLObject var180, final SubLObject var178, final SubLObject var187, final SubLObject var181, final SubLObject var182, final SubLObject var177, final SubLObject var186, SubLObject var183, SubLObject var184) {
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        if (var184 == UNPROVIDED) {
            var184 = (SubLObject)NIL;
        }
        assert NIL != module0206.f13444(var180) : var180;
        assert NIL != Types.stringp(var178) : var178;
        assert NIL != Types.stringp(var187) : var187;
        assert NIL != Types.stringp(var186) : var186;
        assert NIL != module0226.f14809(var182) : var182;
        assert NIL != module0206.f13444(var181) : var181;
        final SubLObject var188 = f43238((SubLObject)UNPROVIDED);
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
        final SubLObject var184 = module0202.f12768($ic211$, $ic212$, var183);
        return module0285.f18993(module0202.f12768($ic213$, var184, var182), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43137(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43214(var258);
    }
    
    public static SubLObject f43242(final SubLObject var261, final SubLObject var191) {
        return module0035.f2294(f43215(var191), var261, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43243(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43216(var258);
    }
    
    public static SubLObject f43244(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43217(var258);
    }
    
    public static SubLObject f43154(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43218(var258);
    }
    
    public static SubLObject f43245(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43219(var258);
    }
    
    public static SubLObject f43156(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43220(var258);
    }
    
    public static SubLObject f43246(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43221(var258);
    }
    
    public static SubLObject f43247(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43222(var258);
    }
    
    public static SubLObject f43248(final SubLObject var258) {
        assert NIL != f43213(var258) : var258;
        return f43223(var258);
    }
    
    public static SubLObject f43249(final SubLObject var191) {
        assert NIL != f43213(var191) : var191;
        return f43224(var191);
    }
    
    public static SubLObject f43250(final SubLObject var191) {
        assert NIL != f43213(var191) : var191;
        return f43225(var191);
    }
    
    public static SubLObject f43251(final SubLObject var261, final SubLObject var177, final SubLObject var191) {
        final SubLObject var262 = f43215(var191);
        final SubLObject var263 = f43242(var261, var191);
        if (NIL == var263) {
            f43227(var191, module0035.f2063(var262, var261, var177, (SubLObject)UNPROVIDED));
        }
        else if (!var263.equal(var177)) {
            Errors.error((SubLObject)$ic214$, var261, var177, var263);
        }
        return f43215(var191);
    }
    
    public static SubLObject f43160(final SubLObject var208, final SubLObject var191) {
        assert NIL != f43213(var191) : var191;
        f43230(var191, var208);
        return var208;
    }
    
    public static SubLObject f43153(final SubLObject var13, final SubLObject var191) {
        assert NIL != f43213(var191) : var191;
        assert NIL != module0173.f10955(var13) : var13;
        f43236(var191, var13);
        return var13;
    }
    
    public static SubLObject f43147(final SubLObject var205, final SubLObject var191) {
        assert NIL != f43213(var191) : var191;
        assert NIL != Types.stringp(var205) : var205;
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
        SubLObject var264 = (SubLObject)NIL;
        SubLObject var265 = (SubLObject)NIL;
        try {
            var265 = module0361.f24136((SubLObject)NIL);
            SubLObject var266 = var194;
            SubLObject var267 = (SubLObject)NIL;
            var267 = var266.first();
            while (NIL != var266) {
                if (NIL != module0590.f36071(var267, module0708.f43012((SubLObject)$ic122$))) {
                    final SubLObject var268 = module0038.f2621(module0590.f36089(var267, module0699.f42535((SubLObject)$ic217$), (SubLObject)UNPROVIDED), (SubLObject)$ic218$, (SubLObject)UNPROVIDED);
                    if (NIL != module0589.f35907(var268, (SubLObject)UNPROVIDED)) {
                        final SubLObject var269 = f43121(var268, var191, var265);
                        f43155((SubLObject)ConsesLow.list($ic16$, var263, var269), $ic36$, var191);
                        var264 = (SubLObject)ConsesLow.cons(var268, var264);
                    }
                    else {
                        f43254(Sequences.cconcatenate((SubLObject)$ic219$, new SubLObject[] { module0006.f205(var268), $ic220$ }), (SubLObject)UNPROVIDED);
                    }
                }
                var266 = var266.rest();
                var267 = var266.first();
            }
        }
        finally {
            final SubLObject var270 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                module0361.f24005(var265);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var270);
            }
        }
        return var264;
    }
    
    public static SubLObject f43140(final SubLObject var194, final SubLObject var200, final SubLObject var191) {
        SubLObject var201 = (SubLObject)NIL;
        SubLObject var202 = var194;
        SubLObject var203 = (SubLObject)NIL;
        var203 = var202.first();
        while (NIL != var202) {
            if (NIL != module0590.f36082(var203)) {
                final SubLObject var204 = f43255(var203, var200, var191);
                var201 = ConsesLow.append(var201, var204);
            }
            var202 = var202.rest();
            var203 = var202.first();
        }
        if (NIL != var201) {
            SubLObject var205 = (SubLObject)NIL;
            if (NIL == var205) {
                SubLObject var206 = var194;
                SubLObject var207 = (SubLObject)NIL;
                var207 = var206.first();
                while (NIL == var205 && NIL != var206) {
                    if (NIL != module0590.f36082(var207)) {
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
                        for (var208 = (SubLObject)NIL, var208 = var201; NIL == var205 && NIL != var208; var208 = var208.rest()) {
                            var209 = var208.first();
                            var210 = (var211 = var209);
                            var212 = (SubLObject)NIL;
                            var213 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var211, var210, (SubLObject)$ic221$);
                            var212 = var211.first();
                            var211 = (var213 = var211.rest());
                            if (NIL != module0038.f2668(var212, var207, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                var272_273 = (var274_275 = module0590.f36044(var207));
                                var214 = (SubLObject)NIL;
                                var215 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var274_275, var272_273, (SubLObject)$ic102$);
                                var214 = var274_275.first();
                                var274_275 = (var215 = var274_275.rest());
                                if (NIL != module0590.f36048(var214) && var212.equal(module0590.f36047(var214))) {
                                    var205 = var213;
                                }
                                for (var77_276 = (SubLObject)NIL, var77_276 = var215; NIL == var205 && NIL != var77_276; var77_276 = var77_276.rest()) {
                                    var213_277 = var77_276.first();
                                    var278_279 = (var280_281 = var213_277);
                                    var216 = (SubLObject)NIL;
                                    var217 = (SubLObject)NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(var280_281, var278_279, (SubLObject)$ic222$);
                                    var216 = var280_281.first();
                                    var280_281 = (var217 = var280_281.rest());
                                    if (NIL != module0590.f36048(var216) && var212.equal(module0590.f36047(var216))) {
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
            if (NIL != var205) {
                Errors.error((SubLObject)$ic223$, var205);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f43255(final SubLObject var204, final SubLObject var200, final SubLObject var191) {
        SubLObject var205 = (SubLObject)NIL;
        SubLObject var207;
        final SubLObject var206 = var207 = module0590.f36044(var204);
        SubLObject var208 = (SubLObject)NIL;
        SubLObject var209 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)$ic102$);
        var208 = var207.first();
        var207 = var207.rest();
        SubLObject var210;
        var209 = (var210 = var207);
        SubLObject var211 = (SubLObject)NIL;
        var211 = var210.first();
        while (NIL != var210) {
            SubLObject var288_289;
            final SubLObject var286_287 = var288_289 = var211;
            SubLObject var212 = (SubLObject)NIL;
            SubLObject var213 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var288_289, var286_287, (SubLObject)$ic103$);
            var212 = var288_289.first();
            var288_289 = (var213 = var288_289.rest());
            if (NIL != module0590.f36048(var212) && $ic224$.equal(module0590.f36047(var212))) {
                final SubLObject var214 = f43256(var212, var213, var200, var191);
                if (NIL != var214) {
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
        return (NIL != f43257(var201)) ? f43258(var201, var25) : f43259(var25, var200);
    }
    
    public static SubLObject f43257(final SubLObject var261) {
        return module0035.f2302($g5556$.getGlobalValue(), var261, Symbols.symbol_function((SubLObject)EQUAL));
    }
    
    public static SubLObject f43258(final SubLObject var261, final SubLObject var25) {
        return (SubLObject)((NIL != module0004.f104(var25, module0035.f2294($g5556$.getGlobalValue(), var261, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)NIL), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) ? NIL : ConsesLow.cons(var25, Sequences.cconcatenate(module0006.f205(var261), new SubLObject[] { $ic226$, module0006.f205(var25), $ic227$, module0006.$g11$.getGlobalValue(), $ic228$, module0006.f205(module0035.f2294($g5556$.getGlobalValue(), var261, (SubLObject)NIL, (SubLObject)UNPROVIDED)) })));
    }
    
    public static SubLObject f43259(final SubLObject var25, final SubLObject var200) {
        SubLObject var201 = (SubLObject)NIL;
        if (NIL == var201) {
            SubLObject var202 = var200;
            SubLObject var203 = (SubLObject)NIL;
            var203 = var202.first();
            while (NIL == var201 && NIL != var202) {
                if (var25.equal(var203) || (NIL != module0038.f2684(var25, var203) && NIL != module0035.f1995(var25, module0048.f_1X(Sequences.length(var203)), (SubLObject)UNPROVIDED) && Characters.CHAR_hash.eql(module0038.f2637(var25)))) {
                    var201 = (SubLObject)T;
                }
                var202 = var202.rest();
                var203 = var202.first();
            }
        }
        return (SubLObject)((NIL != var201) ? NIL : ConsesLow.cons(var25, Sequences.cconcatenate((SubLObject)$ic229$, module0006.f205(var25))));
    }
    
    public static SubLObject f43260() {
        final SubLObject var193 = $g5557$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43261(final SubLObject var177, SubLObject var191, SubLObject var292) {
        if (var191 == UNPROVIDED) {
            var191 = (SubLObject)NIL;
        }
        if (var292 == UNPROVIDED) {
            var292 = (SubLObject)NIL;
        }
        return module0034.f1829($g5557$.getGlobalValue(), (SubLObject)ConsesLow.list(var177, var191, var292), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43262(final SubLObject var177, final SubLObject var191, final SubLObject var292) {
        final SubLThread var293 = SubLProcess.currentSubLThread();
        assert NIL != module0589.f35907(var177, (SubLObject)UNPROVIDED) : var177;
        if (NIL != var191 && !areAssertionsDisabledFor(me) && NIL == f43213(var191)) {
            throw new AssertionError(var191);
        }
        SubLObject var294 = (SubLObject)((NIL != var191 && var177.equal(f43154(var191))) ? f43137(var191) : NIL);
        if (NIL == var294) {
            var294 = module0434.f30576((SubLObject)$ic231$, (SubLObject)ConsesLow.list($ic232$, (SubLObject)$ic233$, (SubLObject)ConsesLow.list($ic234$, (SubLObject)$ic231$, var177)), $ic42$, (SubLObject)ConsesLow.listS((SubLObject)$ic235$, (SubLObject)$ic236$, (SubLObject)$ic237$, var292, (SubLObject)$ic238$)).first();
            if (NIL == var294) {
                if (NIL != module0708.$g5533$.getDynamicValue(var293)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic240$, $ic241$ }), var177);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var294 = module0285.f18993((SubLObject)ConsesLow.list($ic242$, var177), (SubLObject)UNPROVIDED);
            }
        }
        return var294;
    }
    
    public static SubLObject f43121(final SubLObject var177, SubLObject var191, SubLObject var292) {
        if (var191 == UNPROVIDED) {
            var191 = (SubLObject)NIL;
        }
        if (var292 == UNPROVIDED) {
            var292 = (SubLObject)NIL;
        }
        SubLObject var293 = $g5557$.getGlobalValue();
        if (NIL == var293) {
            var293 = module0034.f1934((SubLObject)$ic230$, (SubLObject)$ic243$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var294 = module0034.f1781(var177, var191, var292);
        final SubLObject var295 = module0034.f1814(var293, var294, (SubLObject)UNPROVIDED);
        if (var295 != $ic15$) {
            SubLObject var296 = var295;
            SubLObject var297 = (SubLObject)NIL;
            var297 = var296.first();
            while (NIL != var296) {
                SubLObject var298 = var297.first();
                final SubLObject var299 = conses_high.second(var297);
                if (var177.equal(var298.first())) {
                    var298 = var298.rest();
                    if (var191.equal(var298.first())) {
                        var298 = var298.rest();
                        if (NIL != var298 && NIL == var298.rest() && var292.equal(var298.first())) {
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
        if (var292 == UNPROVIDED) {
            var292 = (SubLObject)NIL;
        }
        assert NIL != module0206.f13444(var180) : var180;
        SubLObject var293 = module0434.f30578((SubLObject)$ic244$, (SubLObject)ConsesLow.listS($ic245$, var180, (SubLObject)$ic246$), $ic36$, (SubLObject)ConsesLow.listS((SubLObject)$ic235$, (SubLObject)$ic236$, (SubLObject)$ic237$, var292, (SubLObject)$ic238$)).first();
        if (NIL == var293) {
            var293 = module0285.f18875((SubLObject)ConsesLow.list($ic247$, var180), (SubLObject)UNPROVIDED);
        }
        return var293;
    }
    
    public static SubLObject f43144(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        final SubLObject var302 = $g5547$.currentBinding(var299);
        try {
            $g5547$.bind((SubLObject)$ic59$, var299);
            SubLObject var303 = (SubLObject)NIL;
            while (NIL != var301) {
                var299.resetMultipleValues();
                final SubLObject var304 = f43263(var301, var303, var191, var300);
                final SubLObject var305 = var299.secondMultipleValue();
                final SubLObject var306 = var299.thirdMultipleValue();
                var299.resetMultipleValues();
                if (!var303.eql(var304)) {
                    var303 = var304;
                }
                if (NIL != var306) {
                    f43104(var304, (SubLObject)$ic59$);
                    var303 = (SubLObject)NIL;
                }
                if (NIL != module0004.f105(var305)) {
                    var300 = module0590.f36061(var300, var305);
                }
                else if (var305.isString()) {
                    var300 = module0590.f36061(module0590.f36062(var300, var305, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                }
                else if (var305.eql((SubLObject)$ic248$)) {
                    var300 = module0590.f36068(var300);
                }
                else {
                    final SubLObject var307 = f43264(var300);
                    var300 = (SubLObject)((NIL != var307) ? module0590.f36061(var300, var307) : NIL);
                }
                var301 = (SubLObject)((NIL != module0035.f2013(var300)) ? var300.first() : NIL);
            }
            if (NIL != var303) {
                if (NIL != f43194(var303)) {
                    f43104(var303, (SubLObject)$ic59$);
                }
                else if (NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)$ic249$, var303, var301);
                }
            }
        }
        finally {
            $g5547$.rebind(var302, var299);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43067() {
        final SubLObject var193 = $g5558$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43265() {
        return module0034.f1829($g5558$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43266() {
        return (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)$ic251$), module0708.f43012((SubLObject)$ic252$), module0708.f43012((SubLObject)$ic253$), module0708.f43012((SubLObject)$ic254$), module0708.f43012((SubLObject)$ic255$), module0708.f43012((SubLObject)$ic256$));
    }
    
    public static SubLObject f43267() {
        SubLObject var197 = $g5558$.getGlobalValue();
        if (NIL == var197) {
            var197 = module0034.f1934((SubLObject)$ic250$, (SubLObject)$ic257$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var198 = module0034.f1810(var197, (SubLObject)UNPROVIDED);
        if (var198 == $ic15$) {
            var198 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43266()));
            module0034.f1812(var197, var198, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var198);
    }
    
    public static SubLObject f43268(final SubLObject var204) {
        return module0004.f104(module0590.f36041(var204), f43267(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43263(final SubLObject var299, final SubLObject var242, final SubLObject var191, final SubLObject var194) {
        final SubLThread var300 = SubLProcess.currentSubLThread();
        SubLObject var301 = var242;
        SubLObject var302 = (SubLObject)NIL;
        SubLObject var303 = (SubLObject)NIL;
        if (NIL != module0590.f36056(var299, (SubLObject)$ic258$)) {
            final SubLObject var304 = module0590.f36058(var194, (SubLObject)$ic259$, (SubLObject)UNPROVIDED);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var300) && !var304.isInteger()) {
                Errors.error((SubLObject)$ic260$, module0035.f2124((SubLObject)TEN_INTEGER, var194));
            }
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic261$, $ic241$ }), module0035.f2124(module0048.f_1X(var304), var194));
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var302 = module0048.f_1X(var304);
        }
        else if (NIL == module0590.f36042(var299) && NIL != f43268(var299)) {
            SubLObject var305 = (SubLObject)NIL;
            SubLObject var306 = (SubLObject)NIL;
            if (NIL == module0035.f2012(module0590.f36044(var299).rest())) {
                var300.resetMultipleValues();
                final SubLObject var305_306 = f43269(var299, var191);
                final SubLObject var307_308 = var300.secondMultipleValue();
                var300.resetMultipleValues();
                var305 = var305_306;
                var306 = var307_308;
            }
            var301 = f43185(var305);
            if (NIL != var306) {
                f43187(var301, var306);
            }
            final SubLObject var307 = module0590.f36041(var299);
            f43208(var301, (SubLObject)$ic262$, var307);
            if (NIL != module0590.f36072(var299)) {
                var303 = (SubLObject)T;
            }
            var302 = (SubLObject)$ic263$;
        }
        else if (NIL != f43270(var299)) {
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL == var242) {
            var302 = f43271(var299);
        }
        else if (NIL != module0038.f2828(var299)) {
            var302 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42535((SubLObject)$ic264$))) {
            f43208(var301, (SubLObject)$ic262$, f43272(var299, var191));
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42555((SubLObject)$ic115$))) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var300) && NIL != module0590.f36072(var299)) {
                Errors.error((SubLObject)$ic265$, var299);
            }
            final SubLObject var308 = module0590.f36089(var299, f43161((SubLObject)$ic116$), (SubLObject)NIL);
            final SubLObject var309 = (NIL != var308) ? module0642.f39117(var308) : $ic117$;
            final SubLObject var310 = conses_high.second(var194);
            if (NIL != var308 && NIL == var309 && NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic266$, var308);
            }
            f43208(var301, (SubLObject)$ic267$, (SubLObject)ConsesLow.cons(var310, var309));
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42555((SubLObject)$ic112$))) {
            f43188(var301, conses_high.second(var194));
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42555((SubLObject)$ic268$)) && NIL != module0590.f36040(var299)) {
            final SubLObject var311 = f43273(var194, var191);
            f43189(var301, var311);
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42555((SubLObject)$ic268$))) {
            final SubLObject var312 = f43274(var299, var191);
            if (NIL != var312) {
                f43189(var301, (SubLObject)ConsesLow.list(var312));
            }
            else if (NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic269$, module0035.f2124((SubLObject)FOUR_INTEGER, var194));
            }
            var302 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36071(var299, module0708.f43012((SubLObject)$ic270$))) {
            final SubLObject var313 = module0038.f2673(var299, (SubLObject)$ic271$, (SubLObject)UNPROVIDED);
            final SubLObject var314 = (NIL != var313) ? var299 : f43275(var194);
            final SubLObject var315 = f43269(var314, var191);
            if (var315.equal(f43196(var301, (SubLObject)$ic156$, (SubLObject)UNPROVIDED))) {
                if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic272$, $ic241$ }), var315);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43191(var301, (SubLObject)$ic273$, (SubLObject)T);
            }
            else if (NIL != var315) {
                f43191(var301, (SubLObject)$ic274$, var315);
            }
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42555((SubLObject)$ic275$))) {
            final SubLObject var313 = module0590.f36072(var299);
            final SubLObject var316 = (NIL != var313) ? var299 : f43275(var194);
            final SubLObject var317 = f43269(var316, var191);
            if (NIL != var317) {
                if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic276$, $ic241$ }), var317, var242);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43191(var301, (SubLObject)$ic277$, var317);
            }
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0708.f43012((SubLObject)$ic278$))) {
            final SubLObject var313 = module0590.f36072(var299);
            final SubLObject var318 = (NIL != var313) ? var299 : f43275(var194);
            final SubLObject var319 = f43269(var318, var191);
            if (NIL != var319) {
                if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic279$, $ic241$ }), var319, var242);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43208(var301, (SubLObject)$ic280$, var319);
            }
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42555((SubLObject)$ic281$)) && NIL != module0590.f36040(var299)) {
            var300.resetMultipleValues();
            final SubLObject var320 = f43276(var194, var191);
            final SubLObject var321 = var300.secondMultipleValue();
            var300.resetMultipleValues();
            f43190(var301, var320);
            var302 = var321;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42555((SubLObject)$ic281$))) {
            final SubLObject var320 = f43274(var299, var191);
            if (NIL == var320 && NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic282$, module0035.f2124((SubLObject)FOUR_INTEGER, var194));
            }
            f43190(var301, var320);
            var302 = (SubLObject)$ic263$;
        }
        else if (NIL != f43268(var299) && NIL != module0590.f36042(var299)) {
            var303 = (SubLObject)T;
            var302 = (SubLObject)$ic263$;
        }
        else if (NIL != f43277(var299, (SubLObject)$ic283$, var191)) {
            final SubLObject var322 = conses_high.second(var194);
            final SubLObject var323 = f43278(var322, (SubLObject)$ic284$);
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic285$, $ic241$ }), var323, var301);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43191(var301, (SubLObject)$ic286$, var323);
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != f43277(var299, (SubLObject)$ic287$, var191)) {
            final SubLObject var322 = conses_high.second(var194);
            final SubLObject var324 = f43278(var322, (SubLObject)$ic284$);
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic288$, $ic241$ }), var324, var301);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43191(var301, (SubLObject)$ic289$, var324);
            var302 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36031(var299) && NIL == module0590.f36042(var299)) {
            final SubLObject var325 = module0590.f36041(var299);
            final SubLObject var326 = (SubLObject)((NIL != module0590.f36072(var299)) ? f43272(var299, var191) : NIL);
            SubLObject var327 = (SubLObject)NIL;
            if (NIL != var326) {
                var327 = f43279(var326, $ic18$, var191);
            }
            else {
                final SubLObject var328 = f43168(module0590.f36089(var299, module0699.f42535((SubLObject)$ic290$), (SubLObject)UNPROVIDED));
                final SubLObject var329 = conses_high.second(var194);
                var327 = f43278(var329, var328);
            }
            if (NIL != var327) {
                if (NIL != f43277(var299, (SubLObject)$ic291$, var191)) {
                    if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic292$, $ic241$ }), var301, var327);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    f43208(var301, (SubLObject)$ic262$, var327);
                }
                else {
                    if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic293$, $ic241$ }), var325, var327);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    f43208(var301, (SubLObject)$ic294$, (SubLObject)ConsesLow.list(var325, var327));
                }
            }
            var302 = (SubLObject)$ic248$;
        }
        else {
            if (NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic295$, var299);
            }
            var302 = (SubLObject)$ic263$;
        }
        return Values.values(var301, var302, var303);
    }
    
    public static SubLObject f43277(final SubLObject var299, final SubLObject var11, final SubLObject var191) {
        return (SubLObject)makeBoolean(NIL != module0590.f36071(var299, var11) && f43154(var191).isString() && NIL != module0038.f2668((SubLObject)$ic296$, f43154(var191), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f43168(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = Sequences.position((SubLObject)Characters.CHAR_hash, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var28 = (NIL != var27) ? var27 : module0035.f2029((SubLObject)Characters.CHAR_slash, var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var28) {
            return var25;
        }
        if (var28.eql((SubLObject)ZERO_INTEGER)) {
            return module0038.f2623(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        }
        final SubLObject var29 = module0038.f2623(var25, module0048.f_1X(var28), (SubLObject)UNPROVIDED);
        final SubLObject var30 = module0038.f2623(var25, (SubLObject)ZERO_INTEGER, var28);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var26) && NIL == module0589.f35907(var30, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic297$, var25);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic298$, var30, var29);
    }
    
    public static SubLObject f43280(final SubLObject var327, final SubLObject var314) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        return module0084.f5765($g5559$.getDynamicValue(var328), var314, var327, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43281(final SubLObject var314) {
        final SubLThread var315 = SubLProcess.currentSubLThread();
        return module0067.f4885($g5559$.getDynamicValue(var315), var314, (SubLObject)NIL);
    }
    
    public static SubLObject f43145(final SubLObject var328, final SubLObject var191) {
        final SubLThread var329 = SubLProcess.currentSubLThread();
        SubLObject var330 = (SubLObject)NIL;
        f43282();
        if (NIL != module0035.f2013(var328)) {
            final SubLObject var331 = $g5559$.currentBinding(var329);
            try {
                $g5559$.bind(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var329);
                final SubLObject var332 = Sequences.length(var328);
                final SubLObject var333 = Numbers.divide((SubLObject)ONE_INTEGER, var332);
                SubLObject var334 = (SubLObject)ZERO_INTEGER;
                final SubLObject var335 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic299$, var332);
                module0012.$g82$.setDynamicValue(var335, var329);
                module0012.$g73$.setDynamicValue(Time.get_universal_time(), var329);
                module0012.$g83$.setDynamicValue(Sequences.length(var328), var329);
                module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var329);
                final SubLObject var28_334 = module0012.$g75$.currentBinding(var329);
                final SubLObject var336 = module0012.$g76$.currentBinding(var329);
                final SubLObject var337 = module0012.$g77$.currentBinding(var329);
                final SubLObject var338 = module0012.$g78$.currentBinding(var329);
                try {
                    module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var329);
                    module0012.$g76$.bind((SubLObject)NIL, var329);
                    module0012.$g77$.bind((SubLObject)T, var329);
                    module0012.$g78$.bind(Time.get_universal_time(), var329);
                    module0012.f478(module0012.$g82$.getDynamicValue(var329));
                    SubLObject var339 = var328;
                    SubLObject var340 = (SubLObject)NIL;
                    var340 = var339.first();
                    while (NIL != var339) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var329), module0012.$g83$.getDynamicValue(var329));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var329), (SubLObject)ONE_INTEGER), var329);
                        var329.resetMultipleValues();
                        final SubLObject var341 = f43283(var340, var191);
                        final SubLObject var342 = var329.secondMultipleValue();
                        var329.resetMultipleValues();
                        module0708.f43038(var341, f43249(var191), f43156(var191));
                        if (NIL != var342) {
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
                $g5559$.rebind(var331, var329);
            }
        }
        f43285();
        return var330;
    }
    
    public static SubLObject f43273(final SubLObject var298, final SubLObject var191) {
        SubLObject var299 = (SubLObject)NIL;
        SubLObject var300 = var298;
        while (NIL != var300) {
            final SubLObject var301 = var300.first();
            if (NIL != module0038.f2828(var301)) {
                var300 = module0590.f36061(var300, (SubLObject)UNPROVIDED);
            }
            else {
                if (NIL != module0590.f36071(var301, module0699.f42555((SubLObject)$ic268$)) && NIL != module0590.f36042(var301)) {
                    return var299;
                }
                if (NIL != f43270(var301)) {
                    final SubLObject var302 = f43286(var300, var191);
                    var299 = (SubLObject)ConsesLow.cons(var302, var299);
                    var300 = module0590.f36068(var300);
                }
                else {
                    var300 = module0590.f36061(var300, (SubLObject)UNPROVIDED);
                }
            }
        }
        return var299;
    }
    
    public static SubLObject f43276(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = (SubLObject)NIL;
        SubLObject var301 = f43264(var298);
        final SubLObject var302 = module0590.f36061(var298, var301);
        if (NIL != f43270(var302.first())) {
            var300 = f43286(var302, var191);
        }
        else if (NIL != module0590.f36071(var302.first(), module0708.f43012((SubLObject)$ic300$)) && NIL != module0590.f36040(var302.first()) && NIL != module0590.f36071(conses_high.second(var302), module0708.f43012((SubLObject)$ic301$))) {
            var300 = f43287(var302.rest(), var191);
        }
        else {
            Errors.warn((SubLObject)$ic302$, module0035.f2124((SubLObject)TEN_INTEGER, var302));
        }
        final SubLObject var303 = module0590.f36068(var302);
        final SubLObject var304 = module0590.f36062(var303, (SubLObject)$ic303$, (SubLObject)UNPROVIDED);
        final SubLObject var305 = f43264(var304);
        final SubLObject var306 = ConsesLow.nth(var305, var304);
        var301 = Sequences.position(var306, var298, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic304$, $ic241$ }), var300);
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        return Values.values(var300, var301);
    }
    
    public static SubLObject f43068() {
        final SubLObject var193 = $g5560$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43288() {
        return module0034.f1829($g5560$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43289() {
        return (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)$ic306$), module0708.f43012((SubLObject)$ic307$), module0699.f42555((SubLObject)$ic306$));
    }
    
    public static SubLObject f43290() {
        SubLObject var197 = $g5560$.getGlobalValue();
        if (NIL == var197) {
            var197 = module0034.f1934((SubLObject)$ic305$, (SubLObject)$ic308$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var198 = module0034.f1810(var197, (SubLObject)UNPROVIDED);
        if (var198 == $ic15$) {
            var198 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43289()));
            module0034.f1812(var197, var198, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var198);
    }
    
    public static SubLObject f43270(final SubLObject var204) {
        return module0004.f104(module0590.f36041(var204), f43290(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43286(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        assert NIL != f43270(var298.first()) : var298.first();
        if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic310$, $ic241$ }), module0035.f2124((SubLObject)FOUR_INTEGER, var298));
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        final SubLObject var300 = module0590.f36089(var298.first(), module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
        SubLObject var301 = (SubLObject)NIL;
        if (NIL != conses_high.member($g5547$.getDynamicValue(var299), (SubLObject)$ic312$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED) && f43274(var298.first(), var191).isString()) {
            final SubLObject var302 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f43291(var298, var191));
            assert NIL != f43110(var302) : var302;
            var301 = f43292(var302, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
        }
        else {
            SubLObject var303 = var298;
            SubLObject var304 = (SubLObject)NIL;
            SubLObject var305 = (SubLObject)NIL;
            SubLObject var306 = (SubLObject)NIL;
            SubLObject var307 = (SubLObject)NIL;
            while (NIL != var303 && NIL == var307) {
                final SubLObject var308 = var303.first();
                if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic314$, $ic241$ }), var308);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                if (var308.eql(var304)) {
                    Errors.sublisp_break((SubLObject)$ic315$, new SubLObject[] { var308 });
                }
                else if ((NIL != f43270(var308) || NIL != module0590.f36071(var308, module0699.f42535((SubLObject)$ic316$))) && NIL != module0590.f36072(var308)) {
                    var305 = (SubLObject)ConsesLow.cons(f43274(var308, var191), var305);
                    if (NIL != var306) {
                        var303 = module0590.f36061(var303, (SubLObject)UNPROVIDED);
                    }
                    else {
                        var307 = (SubLObject)T;
                    }
                }
                else if (NIL != f43270(var308) && NIL != module0590.f36042(var308)) {
                    if (NIL == var306) {
                        var307 = (SubLObject)T;
                    }
                }
                else if (NIL != module0590.f36040(var308) && NIL != module0590.f36071(var308, module0708.f43012((SubLObject)$ic317$))) {
                    if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic318$, $ic241$ }), var308);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    final SubLObject var309 = f43293(var303, var191);
                    var305 = (SubLObject)ConsesLow.cons(var309, var305);
                    if (NIL != var306) {
                        var303 = module0590.f36068(var303);
                    }
                    else {
                        var307 = (SubLObject)T;
                    }
                }
                else if (NIL != module0590.f36040(var308) && NIL != f43270(var308)) {
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
                else if (NIL != module0590.f36070(module0708.f43012((SubLObject)$ic319$), var308)) {
                    var303 = module0590.f36061(var303, (SubLObject)UNPROVIDED);
                    var306 = (SubLObject)NIL;
                }
                else {
                    Errors.sublisp_break((SubLObject)$ic320$, new SubLObject[] { var308 });
                }
                var304 = var308;
            }
            var301 = f43295(var305);
        }
        if (NIL != var300) {
            f43296(var300, var301);
        }
        return var301;
    }
    
    public static SubLObject f43294(final SubLObject var194, final SubLObject var191, SubLObject var346) {
        final SubLThread var347 = SubLProcess.currentSubLThread();
        final SubLObject var348 = f43264(var194);
        final SubLObject var349 = ConsesLow.nth(var348, var194);
        SubLObject var350 = (SubLObject)NIL;
        SubLObject var351 = (SubLObject)NIL;
        SubLObject var352 = (SubLObject)NIL;
        if (NIL != module0590.f36071(var349, module0708.f43012((SubLObject)$ic319$)) && NIL != module0590.f36072(var349) && NIL != module0590.f36089(var349, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED)) {
            final SubLObject var353 = module0590.f36089(var349, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
            var350 = (SubLObject)ConsesLow.list((SubLObject)$ic321$, var353);
            var351 = module0590.f36061(var194, module0048.f_1X(var348));
            var346 = (SubLObject)NIL;
            var352 = (SubLObject)T;
        }
        else if (NIL != module0590.f36071(var349, module0708.f43012((SubLObject)$ic319$)) && NIL == module0590.f36072(var349)) {
            var351 = module0590.f36061(var194, module0048.f_1X(var348));
            var346 = (SubLObject)T;
        }
        else if (NIL != module0590.f36071(var349, module0708.f43012((SubLObject)$ic301$))) {
            final SubLObject var354 = f43287(module0590.f36061(var194, var348), var191);
            var350 = (SubLObject)ConsesLow.cons(var354, var350);
            if (NIL != var346) {
                var351 = module0590.f36068(var194);
            }
            else {
                var352 = (SubLObject)T;
            }
        }
        else {
            final SubLObject var355 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f43291(var194, var191));
            if (NIL != var355 && NIL != module0708.$g5533$.getDynamicValue(var347)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic322$, $ic241$ }), var355, var350);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            final SubLObject var356 = f43292(var355, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
            if (var356.isString() || NIL != f43202(var356)) {
                var350 = (SubLObject)ConsesLow.cons(var356, var350);
            }
            else if (NIL != f43292(var355, (SubLObject)$ic323$, (SubLObject)UNPROVIDED)) {
                var350 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic324$, f43292(var355, (SubLObject)$ic323$, (SubLObject)UNPROVIDED)), var350);
            }
            else if (NIL != f43292(var355, (SubLObject)$ic325$, (SubLObject)UNPROVIDED)) {
                var350 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)$ic325$, f43292(var355, (SubLObject)$ic325$, (SubLObject)UNPROVIDED)), var350);
            }
            else {
                Errors.sublisp_break((SubLObject)$ic326$, new SubLObject[] { var355 });
            }
            var351 = module0590.f36068(var194);
            if (NIL == var346) {
                var352 = (SubLObject)T;
            }
        }
        return Values.values(var351, var350, var352, var346);
    }
    
    public static SubLObject f43287(final SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && NIL == module0590.f36071(var196, module0708.f43012((SubLObject)$ic301$))) {
            Errors.error((SubLObject)$ic327$, module0035.f2124((SubLObject)TEN_INTEGER, var194));
        }
        final SubLObject var197 = module0590.f36061(var194, Sequences.position(var196, var194, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var198 = f43264(var197);
        final SubLObject var199 = module0590.f36061(var197, var198);
        SubLObject var200 = (SubLObject)NIL;
        if (NIL != conses_high.member(module0590.f36041(var199.first()), (SubLObject)ConsesLow.list(module0699.f42535((SubLObject)$ic328$), module0699.f42535((SubLObject)$ic329$)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            var200 = f43297(var199, var191);
        }
        else {
            for (SubLObject var201 = var199, var202 = var201.first(); NIL == module0590.f36070(module0708.f43012((SubLObject)$ic301$), var202); var202 = var201.first()) {
                SubLObject var203 = (SubLObject)NIL;
                if (NIL != module0590.f36040(var202)) {
                    final SubLObject var204 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f43298(var201, var191));
                    assert NIL != f43110(var204) : var204;
                    var203 = f43292(var204, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
                }
                else {
                    var203 = f43299(var202, var191);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var195) && !var203.isString() && NIL == f43202(var203)) {
                    Errors.error((SubLObject)$ic330$, var202);
                }
                var200 = (SubLObject)ConsesLow.cons(var203, var200);
                var201 = module0590.f36068(var201);
            }
            var200 = Sequences.nreverse(var200);
        }
        if (NIL != module0708.$g5533$.getDynamicValue(var195)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic331$, $ic241$ }), var200);
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        return (SubLObject)ConsesLow.cons((SubLObject)$ic332$, var200);
    }
    
    public static SubLObject f43300(final SubLObject var240) {
        SubLObject var241 = (SubLObject)NIL;
        if (NIL != module0035.f2014(var240)) {
            SubLObject var242 = (SubLObject)NIL;
            if (NIL == var242) {
                SubLObject var243 = var240;
                SubLObject var244 = (SubLObject)NIL;
                var244 = var243.first();
                while (NIL == var242 && NIL != var243) {
                    if (!var244.isString() && NIL == module0035.f2192((SubLObject)$ic157$, var244)) {
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
        SubLObject var300 = (SubLObject)NIL;
        SubLObject var301 = (SubLObject)NIL;
        SubLObject var302 = (SubLObject)NIL;
        SubLObject var303 = (SubLObject)NIL;
        while (NIL != var299 && (NIL == var301 || NIL == var302)) {
            var299 = module0590.f36061(var299, f43302(var299));
            if (NIL != var299) {
                final SubLObject var304 = var299.first();
                if (NIL != module0590.f36071(var304, module0699.f42535((SubLObject)$ic328$)) && module0590.f36089(var304, module0699.f42535((SubLObject)$ic217$), (SubLObject)UNPROVIDED).equal((SubLObject)$ic333$)) {
                    var302 = (SubLObject)T;
                    var299 = module0590.f36068(var299);
                }
                else if (NIL != module0590.f36071(var304, module0699.f42535((SubLObject)$ic328$)) && module0590.f36089(var304, module0699.f42535((SubLObject)$ic334$), (SubLObject)UNPROVIDED).equal((SubLObject)$ic335$) && NIL == module0590.f36072(var304)) {
                    SubLObject var305 = var299.rest();
                    SubLObject var306 = var305.first();
                    SubLObject var307 = (SubLObject)NIL;
                    while (NIL == module0590.f36070(module0699.f42535((SubLObject)$ic328$), var306)) {
                        final SubLObject var308 = f43303(var305, var191);
                        var307 = (SubLObject)ConsesLow.cons(var308, var307);
                        var305 = module0590.f36068(var305);
                        var306 = var305.first();
                    }
                    var303 = Sequences.nreverse(var307);
                    var302 = (SubLObject)T;
                    var299 = var305;
                }
                else if (NIL != module0590.f36071(var304, module0699.f42535((SubLObject)$ic328$)) && NIL != module0590.f36072(var304) && NIL != module0038.f2611(module0590.f36089(var304, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED))) {
                    final SubLObject var309 = module0590.f36089(var304, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
                    var303 = f43304((SubLObject)ConsesLow.list((SubLObject)$ic321$, var309));
                    var302 = (SubLObject)T;
                    var299 = module0590.f36061(var299, (SubLObject)UNPROVIDED);
                }
                else if (NIL != module0590.f36071(var304, module0699.f42535((SubLObject)$ic328$))) {
                    var303 = f43301(var299.rest(), var191);
                    var302 = (SubLObject)T;
                    var299 = module0590.f36068(var299);
                }
                else if (NIL != module0590.f36071(var304, module0699.f42535((SubLObject)$ic329$))) {
                    var300 = f43303(var299, var191);
                    var301 = (SubLObject)T;
                    var299 = module0590.f36068(var299);
                }
                else {
                    Errors.sublisp_break((SubLObject)$ic336$, new SubLObject[] { var304 });
                }
            }
        }
        final SubLObject var310 = (SubLObject)ConsesLow.cons(var300, var303);
        return var310;
    }
    
    public static SubLObject f43303(SubLObject var194, final SubLObject var191) {
        SubLObject var196;
        final SubLObject var195 = var196 = var194.first();
        if (NIL != module0590.f36072(var195)) {
            var196 = var195;
        }
        else {
            if (NIL != module0590.f36071(var195, module0699.f42535((SubLObject)$ic329$)) || NIL != module0590.f36071(var195, module0699.f42535((SubLObject)$ic328$))) {
                final SubLObject var197 = f43264(var194);
                var194 = (SubLObject)((NIL != var197) ? module0590.f36061(var194, var197) : NIL);
                var196 = var194.first();
            }
            var196 = module0590.f36067(var194);
            PrintLow.format((SubLObject)T, (SubLObject)$ic337$, var196);
        }
        return var196;
    }
    
    public static SubLObject f43295(final SubLObject var366) {
        assert NIL != module0035.f2015(var366) : var366;
        SubLObject var367 = var366;
        SubLObject var368 = (SubLObject)NIL;
        var368 = var367.first();
        while (NIL != var367) {
            assert NIL != f43197(var368) : var368;
            var367 = var367.rest();
            var368 = var367.first();
        }
        return (SubLObject)((NIL != module0035.f2012(var366)) ? NIL : ((NIL != module0035.f1997(var366)) ? module0035.f2113(var366) : ConsesLow.cons((SubLObject)$ic338$, var366)));
    }
    
    public static SubLObject f43302(final SubLObject var194) {
        return module0590.f36060(var194, (SubLObject)$ic80$);
    }
    
    public static SubLObject f43264(final SubLObject var194) {
        final SubLObject var195 = f43302(var194.rest());
        return (SubLObject)((NIL != var195) ? module0048.f_1X(var195) : NIL);
    }
    
    public static SubLObject f43275(final SubLObject var194) {
        return module0035.find_if_not((SubLObject)$ic80$, var194.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43269(final SubLObject var204, final SubLObject var191) {
        final SubLObject var205 = f43305(var191);
        final SubLObject var206 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic120$), (SubLObject)UNPROVIDED);
        final SubLObject var207 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic217$), (SubLObject)UNPROVIDED);
        final SubLObject var208 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic339$), (SubLObject)UNPROVIDED);
        SubLObject var209 = (SubLObject)NIL;
        SubLObject var210 = (SubLObject)NIL;
        if (NIL != var206) {
            var209 = f43168(var206);
        }
        else if (NIL != var207) {
            var209 = f43168(var207);
        }
        else if (NIL != var208) {
            var209 = f43168(var208);
        }
        var210 = f43306(var209, var205);
        return Values.values(var209, var210);
    }
    
    public static SubLObject f43306(final SubLObject var241, final SubLObject var370) {
        final SubLObject var371 = f43307(var241);
        SubLObject var372 = module0038.f2842((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_period, Sequences.cconcatenate(var370, module0038.f2812(var371)));
        if (NIL != Characters.upper_case_p(module0038.f2636(var372))) {
            var372 = module0038.f2815(var372);
        }
        return var372;
    }
    
    public static SubLObject f43307(final SubLObject var241) {
        final SubLObject var242 = (NIL != f43202(var241)) ? conses_high.third(var241) : var241;
        return var242;
    }
    
    public static SubLObject f43308(final SubLObject var375, final SubLObject var191) {
        SubLObject var376 = (SubLObject)NIL;
        SubLObject var377 = var375;
        SubLObject var378 = (SubLObject)NIL;
        var378 = var377.first();
        while (NIL != var377) {
            if (NIL != f43199(var378)) {
                var376 = (SubLObject)ConsesLow.cons(f43308(f43205(var378), var191), var376);
            }
            else if (NIL == var378) {
                if (NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)$ic340$, var375);
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
        return module0434.f30576((SubLObject)$ic342$, (SubLObject)$ic343$, $ic36$, (SubLObject)$ic344$);
    }
    
    public static SubLObject f43312() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL == var3) {
            return f43311();
        }
        var4 = module0034.f1857(var3, (SubLObject)$ic341$, (SubLObject)UNPROVIDED);
        if (NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)$ic341$, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var3, (SubLObject)$ic341$, var4);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)UNPROVIDED);
        if (var5 == $ic15$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43311()));
            module0034.f1812(var4, var5, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f43309(final SubLObject var378, SubLObject var191) {
        if (var191 == UNPROVIDED) {
            var191 = $g5550$.getDynamicValue();
        }
        final SubLThread var379 = SubLProcess.currentSubLThread();
        if (NIL != f43203(var378)) {
            return f43313(var378, var191, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0205.f13145((SubLObject)$ic345$, var378, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0205.f13145((SubLObject)$ic346$, var378, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var378;
        }
        if (NIL != module0062.f4492(var378, (SubLObject)$ic347$) && NIL != module0035.f2302(f43312(), conses_high.third(var378), Symbols.symbol_function((SubLObject)EQUAL))) {
            return module0035.f2294(f43312(), conses_high.third(var378), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        SubLObject var380 = (SubLObject)NIL;
        if (var378.isString() && NIL == module0590.f36048(var378)) {
            final SubLObject var381 = f43113(var378, (SubLObject)$ic84$);
            final SubLObject var382 = (SubLObject)((NIL != var381) ? f43292(var381, (SubLObject)$ic286$, (SubLObject)NIL) : NIL);
            final SubLObject var383 = (SubLObject)((NIL != var381) ? f43292(var381, (SubLObject)$ic289$, (SubLObject)NIL) : NIL);
            if (NIL != Guids.guid_string_p(var382)) {
                var380 = constants_high_oc.f10747(var382);
                if (NIL != module0708.$g5533$.getDynamicValue(var379)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic348$, $ic241$ }), var380);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
            }
            else if (NIL != module0213.f13915(var383)) {
                var380 = module0213.f13917(var383);
                if (NIL != module0708.$g5533$.getDynamicValue(var379)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic349$, $ic241$ }), var380);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
            }
        }
        if (NIL == var380) {
            final SubLObject var384 = $ic350$;
            var380 = f43279(var378, var384, var191);
        }
        return var380;
    }
    
    public static SubLObject f43314(final SubLObject var380, final SubLObject var191) {
        final SubLThread var381 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var380) : var380;
        assert NIL != f43213(var191) : var191;
        SubLObject var382 = f43242(var380, var191);
        if (NIL == var382) {
            final SubLObject var383 = (SubLObject)$ic351$;
            final SubLObject var384 = (SubLObject)ConsesLow.list($ic352$, var380, var383);
            final SubLObject var385 = module0434.f30578(var383, var384, $ic36$, (SubLObject)$ic353$);
            SubLObject var386 = (SubLObject)((NIL != var385) ? var385.first() : NIL);
            var381.resetMultipleValues();
            final SubLObject var387 = module0337.f22630(var386, (SubLObject)$ic354$);
            final SubLObject var388 = var381.secondMultipleValue();
            var381.resetMultipleValues();
            if (NIL != var387) {
                final SubLObject var389 = var386 = module0035.f2294(var388, (SubLObject)$ic355$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var386.isString()) {
                var386 = (var382 = module0038.f2621(var386, (SubLObject)$ic218$, (SubLObject)UNPROVIDED));
            }
        }
        return var382;
    }
    
    public static SubLObject f43315(final SubLObject var241, final SubLObject var164, final SubLObject var191) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        if (NIL != module0590.f36048(var241)) {
            final SubLObject var243 = module0590.f36047(var241);
            final SubLObject var244 = module0590.f36049(var241);
            SubLObject var245 = f43314(var243, var191);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var242) && NIL == module0589.f35907(var245, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic357$, var243);
            }
            if (module0038.f2637(var245).eql((SubLObject)Characters.CHAR_hash)) {
                var245 = module0038.f2666(var245, (SubLObject)UNPROVIDED);
            }
            return f43316((SubLObject)ConsesLow.list((SubLObject)$ic298$, var245, var244), var164, var191);
        }
        if (NIL != f43199(var241)) {
            SubLObject var246 = (SubLObject)NIL;
            SubLObject var247 = f43205(var241);
            SubLObject var248 = (SubLObject)NIL;
            var248 = var247.first();
            while (NIL != var247) {
                final SubLObject var249 = f43316(var248, var164, var191);
                assert NIL != module0269.f17710(var249) : var249;
                var246 = (SubLObject)ConsesLow.cons(var249, var246);
                var247 = var247.rest();
                var248 = var247.first();
            }
            return f43310(var246, var191);
        }
        if (NIL != f43202(var241)) {
            return f43317(var241, var164, var191);
        }
        if (NIL != f43204(var241)) {
            return f43304(var241);
        }
        if (!var241.isString() && NIL == f43202(var241)) {
            if (NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic358$, var164, var241);
            }
            return (SubLObject)NIL;
        }
        if (NIL != Sequences.find_if((SubLObject)$ic359$, var241, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic360$, var241);
        }
        if (NIL != module0590.f36048(var241)) {
            Errors.warn((SubLObject)$ic361$, var241);
        }
        final SubLObject var250 = f43137(var191);
        final SubLObject var251 = f43318(var241, var164, var250, var191, (SubLObject)UNPROVIDED);
        return var251;
    }
    
    public static SubLObject f43316(final SubLObject var241, final SubLObject var164, final SubLObject var191) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        final SubLObject var243 = module0034.$g879$.getDynamicValue(var242);
        SubLObject var244 = (SubLObject)NIL;
        if (NIL == var243) {
            return f43315(var241, var164, var191);
        }
        var244 = module0034.f1857(var243, (SubLObject)$ic356$, (SubLObject)UNPROVIDED);
        if (NIL == var244) {
            var244 = module0034.f1807(module0034.f1842(var243), (SubLObject)$ic356$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var243, (SubLObject)$ic356$, var244);
        }
        final SubLObject var245 = module0034.f1781(var241, var164, var191);
        final SubLObject var246 = module0034.f1814(var244, var245, (SubLObject)UNPROVIDED);
        if (var246 != $ic15$) {
            SubLObject var247 = var246;
            SubLObject var248 = (SubLObject)NIL;
            var248 = var247.first();
            while (NIL != var247) {
                SubLObject var249 = var248.first();
                final SubLObject var250 = conses_high.second(var248);
                if (var241.equal(var249.first())) {
                    var249 = var249.rest();
                    if (var164.equal(var249.first())) {
                        var249 = var249.rest();
                        if (NIL != var249 && NIL == var249.rest() && var191.equal(var249.first())) {
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
        return f43318(var11, $ic362$, var180, var191, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43320(final SubLObject var241, final SubLObject var164, final SubLObject var180, final SubLObject var191, SubLObject var387) {
        if (var387 == UNPROVIDED) {
            var387 = $g5561$.getDynamicValue();
        }
        SubLObject var388 = f43321(var241, var164, var191, var180);
        if (NIL == var388) {
            var388 = ((NIL != var387 || !var180.equal(f43137(var191))) ? f43322(var241, var164, var180, var191) : f43323(var241, var164, var180, var191));
        }
        return var388;
    }
    
    public static SubLObject f43318(final SubLObject var241, final SubLObject var164, final SubLObject var180, final SubLObject var191, SubLObject var387) {
        if (var387 == UNPROVIDED) {
            var387 = $g5561$.getDynamicValue();
        }
        final SubLThread var388 = SubLProcess.currentSubLThread();
        final SubLObject var389 = module0034.$g879$.getDynamicValue(var388);
        SubLObject var390 = (SubLObject)NIL;
        if (NIL == var389) {
            return f43320(var241, var164, var180, var191, var387);
        }
        var390 = module0034.f1857(var389, (SubLObject)$ic363$, (SubLObject)UNPROVIDED);
        if (NIL == var390) {
            var390 = module0034.f1807(module0034.f1842(var389), (SubLObject)$ic363$, (SubLObject)FIVE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var389, (SubLObject)$ic363$, var390);
        }
        final SubLObject var391 = module0034.f1779(var241, var164, var180, var191, var387);
        final SubLObject var392 = module0034.f1814(var390, var391, (SubLObject)UNPROVIDED);
        if (var392 != $ic15$) {
            SubLObject var393 = var392;
            SubLObject var394 = (SubLObject)NIL;
            var394 = var393.first();
            while (NIL != var393) {
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
                                if (NIL != var395 && NIL == var395.rest() && var387.equal(var395.first())) {
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
        final SubLObject var245 = module0256.f16576(var164, $ic364$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var246 = var241;
        final SubLObject var247 = (NIL != module0038.f2611(var243) && NIL != var245) ? module0038.f2815(var243) : module0038.f2812(var243);
        SubLObject var248 = (SubLObject)NIL;
        if (NIL != var245) {
            var246 = f43307(var241);
            if (NIL != module0038.f2608(var247)) {
                var246 = module0038.f2815(var246);
            }
        }
        final SubLObject var249 = module0111.$g1405$.currentBinding(var242);
        try {
            module0111.$g1405$.bind((SubLObject)NIL, var242);
            module0574.f35153(f43156(var191));
            var248 = f43324(var246, (SubLObject)ConsesLow.list(var164), $ic93$, var247, var244, (SubLObject)makeBoolean(NIL == var245));
        }
        finally {
            module0111.$g1405$.rebind(var249, var242);
        }
        f43155((SubLObject)ConsesLow.list($ic365$, var248, f43122(var180, (SubLObject)UNPROVIDED)), $ic366$, var191);
        f43325(var248, var180, var241, var191);
        if (NIL != f43249(var191)) {
            module0708.f43038(var248, f43249(var191), f43156(var191));
        }
        return var248;
    }
    
    public static SubLObject f43325(final SubLObject var13, final SubLObject var180, final SubLObject var392, final SubLObject var191) {
        return f43155(f43326(var13, var180, var392, var191), f43166(var191), var191);
    }
    
    public static SubLObject f43326(final SubLObject var13, final SubLObject var180, final SubLObject var392, final SubLObject var191) {
        assert NIL != Types.stringp(var392) : var392;
        final SubLObject var393 = f43247(var191);
        final SubLObject var394 = (NIL != var393) ? f43327(var392, var180, var191) : var392;
        final SubLObject var395 = (NIL != var393) ? f43137(var191) : var180;
        return module0202.f12769($ic9$, var13, var395, var394);
    }
    
    public static SubLObject f43327(final SubLObject var392, final SubLObject var180, final SubLObject var191) {
        final SubLObject var393 = f43328(var180, var191);
        SubLObject var394 = (SubLObject)((var393.isString() && NIL != f43248(var191)) ? f43329(var393, var191) : NIL);
        if (NIL == var393) {
            var394 = (SubLObject)$ic94$;
        }
        else if (NIL == var394) {
            var394 = Sequences.cconcatenate(var393, (SubLObject)$ic218$);
        }
        else if (!Characters.CHAR_colon.eql(module0038.f2637(var394))) {
            var394 = Sequences.cconcatenate(var394, (SubLObject)$ic367$);
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
        final SubLObject var182 = module0337.f22630(var180, (SubLObject)$ic368$);
        final SubLObject var183 = var181.secondMultipleValue();
        var181.resetMultipleValues();
        if (NIL != var182) {
            final SubLObject var184 = module0035.f2294(var183, (SubLObject)$ic369$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return f43331(var184);
        }
        final SubLObject var185 = (SubLObject)ConsesLow.listS($ic370$, var180, (SubLObject)$ic371$);
        final SubLObject var186 = $ic36$;
        final SubLObject var187 = module0434.f30578((SubLObject)$ic351$, var185, var186, (SubLObject)$ic372$);
        SubLObject var188 = (SubLObject)NIL;
        if (NIL != module0035.f2013(var187)) {
            var188 = f43331(var187.first());
        }
        return var188;
    }
    
    public static SubLObject f43331(final SubLObject var177) {
        if (var177.isString()) {
            return var177;
        }
        if (NIL != module0206.f13453(var177) && module0205.f13277(var177, (SubLObject)UNPROVIDED).isString() && ONE_INTEGER.eql(module0205.f13360(var177, (SubLObject)UNPROVIDED))) {
            return module0205.f13277(var177, (SubLObject)UNPROVIDED);
        }
        return print_high.princ_to_string(var177);
    }
    
    public static SubLObject f43332(final SubLObject var177, final SubLObject var191) {
        assert NIL != Types.stringp(var177) : var177;
        return f43333(var177, f43137(var191), (SubLObject)NIL);
    }
    
    public static SubLObject f43329(final SubLObject var177, final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var193 = module0034.$g879$.getDynamicValue(var192);
        SubLObject var194 = (SubLObject)NIL;
        if (NIL == var193) {
            return f43332(var177, var191);
        }
        var194 = module0034.f1857(var193, (SubLObject)$ic373$, (SubLObject)UNPROVIDED);
        if (NIL == var194) {
            var194 = module0034.f1807(module0034.f1842(var193), (SubLObject)$ic373$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var193, (SubLObject)$ic373$, var194);
        }
        final SubLObject var195 = module0034.f1782(var177, var191);
        final SubLObject var196 = module0034.f1814(var194, var195, (SubLObject)UNPROVIDED);
        if (var196 != $ic15$) {
            SubLObject var197 = var196;
            SubLObject var198 = (SubLObject)NIL;
            var198 = var197.first();
            while (NIL != var197) {
                SubLObject var199 = var198.first();
                final SubLObject var200 = conses_high.second(var198);
                if (var177.equal(var199.first())) {
                    var199 = var199.rest();
                    if (NIL != var199 && NIL == var199.rest() && var191.equal(var199.first())) {
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
        module0574.f35219((SubLObject)$ic374$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0574.f35219((SubLObject)$ic375$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0574.f35219((SubLObject)$ic376$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0574.f35219((SubLObject)$ic377$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0574.f35219((SubLObject)$ic378$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0574.f35219((SubLObject)$ic379$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0574.f35219((SubLObject)$ic380$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43333(final SubLObject var177, final SubLObject var180, final SubLObject var396) {
        final SubLObject var397 = (SubLObject)$ic381$;
        SubLObject var398 = (SubLObject)NIL;
        SubLObject var399 = (SubLObject)ConsesLow.list($ic382$, (SubLObject)ConsesLow.list($ic383$, var180, var397, var177), (SubLObject)ConsesLow.list($ic383$, var180, var397, (SubLObject)ConsesLow.list($ic384$, var177)));
        SubLObject var400 = module0434.f30578(var397, var399, $ic36$, (SubLObject)$ic385$);
        if (NIL != var400) {
            var398 = var400.first();
        }
        if (NIL == var398) {
            var399 = (SubLObject)ConsesLow.list($ic382$, (SubLObject)ConsesLow.list($ic352$, var397, var177), (SubLObject)ConsesLow.list($ic352$, var397, (SubLObject)ConsesLow.list($ic384$, var177)));
            var400 = module0434.f30578(var397, var399, $ic36$, (SubLObject)$ic385$);
            if (NIL != var400) {
                var398 = var400.first();
            }
        }
        if (NIL == var398 && NIL == var396) {
            var398 = (module0038.f2637(var177).eql((SubLObject)Characters.CHAR_hash) ? f43333(module0038.f2666(var177, (SubLObject)UNPROVIDED), var180, (SubLObject)T) : f43333(Sequences.cconcatenate(var177, (SubLObject)$ic218$), var180, (SubLObject)T));
        }
        return var398;
    }
    
    public static SubLObject f43310(final SubLObject var156, final SubLObject var191) {
        assert NIL != module0035.f2015(var156) : var156;
        SubLObject var192 = var156;
        SubLObject var193 = (SubLObject)NIL;
        var193 = var192.first();
        while (NIL != var192) {
            assert NIL != f43335(var193) : var193;
            var192 = var192.rest();
            var193 = var192.first();
        }
        return (NIL != module0035.f1997(var156)) ? module0035.f2113(var156) : f43336((SubLObject)ConsesLow.list($ic387$, module0202.f12683($ic388$, var156, (SubLObject)UNPROVIDED)), var191);
    }
    
    public static SubLObject f43335(final SubLObject var240) {
        return (SubLObject)makeBoolean(NIL != module0206.f13450(var240) || (NIL != module0035.f2014(var240) && NIL != module0205.f13145((SubLObject)$ic161$, var240, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f43337(final SubLObject var156, final SubLObject var191) {
        assert NIL != module0035.f2015(var156) : var156;
        SubLObject var192 = var156;
        SubLObject var193 = (SubLObject)NIL;
        var193 = var192.first();
        while (NIL != var192) {
            assert NIL != f43335(var193) : var193;
            var192 = var192.rest();
            var193 = var192.first();
        }
        return (NIL != module0035.f1997(var156)) ? module0035.f2113(var156) : ((NIL != module0035.f1998(var156)) ? f43336(reader.bq_cons($ic389$, var156), var191) : f43336((SubLObject)ConsesLow.list($ic390$, module0202.f12683($ic388$, var156, (SubLObject)UNPROVIDED)), var191));
    }
    
    public static SubLObject f43338(final SubLObject var156, final SubLObject var191) {
        assert NIL != module0035.f2015(var156) : var156;
        SubLObject var192 = var156;
        SubLObject var193 = (SubLObject)NIL;
        var193 = var192.first();
        while (NIL != var192) {
            assert NIL != f43335(var193) : var193;
            var192 = var192.rest();
            var193 = var192.first();
        }
        return f43336((SubLObject)((NIL != module0035.f1997(var156)) ? ConsesLow.list($ic391$, module0035.f2113(var156)) : reader.bq_cons($ic392$, var156)), var191);
    }
    
    public static SubLObject f43305(final SubLObject var191) {
        return module0038.f2815(f43216(var191));
    }
    
    public static SubLObject f43283(final SubLObject var242, final SubLObject var191) {
        final SubLThread var243 = SubLProcess.currentSubLThread();
        final SubLObject var244 = f43172(var242);
        final SubLObject var245 = f43196(var242, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
        final SubLObject var246 = f43244(var191);
        SubLObject var247 = f43339(var242, var191);
        final SubLObject var248 = $ic93$;
        SubLObject var249 = (SubLObject)NIL;
        SubLObject var250 = (SubLObject)NIL;
        final SubLObject var251 = $ic394$;
        if (NIL == conses_high.member(var251, var247, (SubLObject)$ic395$, Symbols.symbol_function((SubLObject)IDENTITY))) {
            var247 = (SubLObject)ConsesLow.cons(var251, var247);
        }
        if (NIL == conses_high.member(var245, $g5563$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) || !f43154(var191).isString() || NIL == module0038.f2668((SubLObject)$ic296$, f43154(var191), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var250 = f43340(var245, var191);
            if (NIL == var250) {
                final SubLObject var252 = f43196(var242, (SubLObject)$ic286$, (SubLObject)NIL);
                if (NIL != Guids.guid_string_p(var252)) {
                    var250 = constants_high_oc.f10747(var252);
                }
            }
            if (NIL == var250) {
                final SubLObject var253 = f43196(var242, (SubLObject)$ic289$, (SubLObject)NIL);
                if (NIL != module0213.f13915(var253)) {
                    var250 = module0213.f13917(var253);
                }
            }
            if (NIL != var250) {
                if (NIL != module0708.$g5533$.getDynamicValue(var243)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic396$, $ic241$ }), var250);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                SubLObject var254 = var247;
                SubLObject var255 = (SubLObject)NIL;
                var255 = var254.first();
                while (NIL != var254) {
                    f43341((SubLObject)ConsesLow.list($ic397$, var250, var255), var248, var191);
                    var254 = var254.rest();
                    var255 = var254.first();
                }
            }
            if (NIL == var250) {
                if (NIL != module0708.$g5533$.getDynamicValue(var243)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic398$, $ic241$ }), var242);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var250 = f43148(var244, var247, var248, (SubLObject)$ic94$, var246, (SubLObject)NIL, var191);
            }
            if (NIL == var250) {
                if (NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)$ic399$, var244);
                }
            }
            else {
                var249 = f43342(var250, var242, var191);
            }
        }
        return Values.values(var250, var249);
    }
    
    public static SubLObject f43339(final SubLObject var242, final SubLObject var191) {
        SubLObject var243 = (SubLObject)NIL;
        SubLObject var244 = f43196(var242, (SubLObject)$ic262$, (SubLObject)NIL);
        SubLObject var245 = (SubLObject)NIL;
        var245 = var244.first();
        while (NIL != var244) {
            final SubLObject var246 = f43309(var245, var191);
            var243 = (SubLObject)ConsesLow.cons(var246, var243);
            var244 = var244.rest();
            var245 = var244.first();
        }
        if (T.eql(f43196(var242, (SubLObject)$ic273$, (SubLObject)NIL))) {
            var243 = (SubLObject)ConsesLow.cons($ic400$, var243);
        }
        return Sequences.delete_duplicates(var243, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43343(final SubLObject var343, final SubLObject var191) {
        SubLObject var344 = (SubLObject)NIL;
        SubLObject var345 = f43292(var343, (SubLObject)$ic262$, (SubLObject)NIL);
        SubLObject var346 = (SubLObject)NIL;
        var346 = var345.first();
        while (NIL != var345) {
            final SubLObject var347 = f43309(var346, var191);
            var344 = (SubLObject)ConsesLow.cons(var347, var344);
            var345 = var345.rest();
            var346 = var345.first();
        }
        return Sequences.delete_duplicates(var344, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43342(final SubLObject var327, final SubLObject var242, final SubLObject var191) {
        final SubLThread var328 = SubLProcess.currentSubLThread();
        final SubLObject var329 = f43194(var242);
        SubLObject var330 = f43196(var242, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
        SubLObject var331 = f43214(var191);
        final SubLObject var332 = f43166(var191);
        SubLObject var333 = (SubLObject)NIL;
        f43341((SubLObject)ConsesLow.list($ic365$, var327, f43221(var191)), $ic366$, var191);
        if (NIL != f43202(var330)) {
            SubLObject var335;
            final SubLObject var334 = var335 = var330.rest();
            SubLObject var336 = (SubLObject)NIL;
            SubLObject var337 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic401$);
            var336 = var335.first();
            var335 = var335.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var335, var334, (SubLObject)$ic401$);
            var337 = var335.first();
            var335 = var335.rest();
            if (NIL == var335) {
                var331 = f43121(var336, var191, (SubLObject)UNPROVIDED);
                var330 = var337;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var334, (SubLObject)$ic401$);
            }
        }
        f43325(var327, var331, var330, var191);
        if (NIL != f43193(var242)) {
            final SubLObject var338 = f43308(f43193(var242), var191);
            f43341((SubLObject)ConsesLow.list($ic402$, var327, var338), var332, var191);
        }
        else {
            f43341((SubLObject)ConsesLow.listS($ic402$, var327, (SubLObject)$ic403$), var332, var191);
            var333 = (SubLObject)T;
        }
        final SubLObject var339 = f43344(var329, var191);
        if (NIL != var339) {
            f43341((SubLObject)ConsesLow.list($ic404$, var327, var339), var332, var191);
        }
        else {
            f43341((SubLObject)ConsesLow.listS($ic404$, var327, (SubLObject)$ic403$), var332, var191);
            var333 = (SubLObject)T;
        }
        if (NIL != f43192(var242)) {
            f43341((SubLObject)ConsesLow.list($ic114$, var327, f43192(var242)), var332, var191);
        }
        SubLObject var340 = f43196(var242, (SubLObject)$ic267$, (SubLObject)NIL);
        SubLObject var341 = (SubLObject)NIL;
        var341 = var340.first();
        while (NIL != var340) {
            f43167(var327, var341, var191);
            var340 = var340.rest();
            var341 = var340.first();
        }
        final SubLObject var342 = f43196(var242, (SubLObject)$ic277$, (SubLObject)NIL);
        final SubLObject var343 = (SubLObject)((NIL != var342) ? f43340(var342, var191) : NIL);
        if (NIL != var343) {
            if (NIL != module0708.$g5533$.getDynamicValue(var328)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic405$, $ic241$ }), var343, var327);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43341((SubLObject)ConsesLow.list($ic406$, var327, var343), var332, var191);
        }
        else if (NIL != var342) {
            f43280(var327, var342);
        }
        var340 = f43281(var330);
        SubLObject var344 = (SubLObject)NIL;
        var344 = var340.first();
        while (NIL != var340) {
            if (NIL != module0708.$g5533$.getDynamicValue(var328)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic407$, $ic241$ }), var344, var327);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43341((SubLObject)ConsesLow.list($ic406$, var344, var327), var332, var191);
            var340 = var340.rest();
            var344 = var340.first();
        }
        if (!$ic408$.eql(module0205.f13276(var327))) {
            SubLObject var345 = f43196(var242, (SubLObject)$ic274$, (SubLObject)NIL);
            if (NIL != var345) {
                if (NIL != f43202(var345)) {
                    SubLObject var347;
                    final SubLObject var346 = var347 = var345.rest();
                    SubLObject var348 = (SubLObject)NIL;
                    SubLObject var349 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var347, var346, (SubLObject)$ic401$);
                    var348 = var347.first();
                    var347 = var347.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var347, var346, (SubLObject)$ic401$);
                    var349 = var347.first();
                    var347 = var347.rest();
                    if (NIL == var347) {
                        var331 = f43121(var348, var191, (SubLObject)UNPROVIDED);
                        var345 = var349;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var346, (SubLObject)$ic401$);
                    }
                }
                if (NIL != module0708.$g5533$.getDynamicValue(var328)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic409$, $ic241$ }), var345, var327);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                final SubLObject var350 = (SubLObject)ConsesLow.list($ic408$, var327);
                final SubLObject var351 = module0172.f10921(var350);
                f43325(var350, var331, var345, var191);
                if (NIL == var351) {
                    f43341((SubLObject)ConsesLow.list($ic365$, var350, f43221(var191)), $ic366$, var191);
                }
            }
        }
        var340 = f43196(var242, (SubLObject)$ic280$, (SubLObject)NIL);
        SubLObject var352 = (SubLObject)NIL;
        var352 = var340.first();
        while (NIL != var340) {
            if (NIL != module0708.$g5533$.getDynamicValue(var328)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic410$, $ic241$ }), var352, var327);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            final SubLObject var353 = f43316(var352, $ic394$, var191);
            final SubLObject var354 = module0035.sublisp_boolean(var353);
            if (NIL == var354) {
                Errors.warn((SubLObject)$ic411$, var352);
            }
            f43341((SubLObject)ConsesLow.list($ic412$, var327, var353), var332, var191);
            var340 = var340.rest();
            var352 = var340.first();
        }
        var340 = f43196(var242, (SubLObject)$ic294$, (SubLObject)UNPROVIDED);
        SubLObject var355 = (SubLObject)NIL;
        var355 = var340.first();
        while (NIL != var340) {
            SubLObject var357;
            final SubLObject var356 = var357 = var355;
            SubLObject var358 = (SubLObject)NIL;
            SubLObject var359 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var357, var356, (SubLObject)$ic413$);
            var358 = var357.first();
            var357 = var357.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var357, var356, (SubLObject)$ic413$);
            var359 = var357.first();
            var357 = var357.rest();
            if (NIL == var357) {
                final SubLObject var360 = f43316(var358, $ic394$, var191);
                final SubLObject var361 = module0202.f12768(var360, var327, var359);
                if (NIL != module0708.$g5533$.getDynamicValue(var328)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic414$, $ic241$ }), var361);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43341(var361, var332, var191);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var356, (SubLObject)$ic413$);
            }
            var340 = var340.rest();
            var355 = var340.first();
        }
        return var333;
    }
    
    public static SubLObject f43340(final SubLObject var398, final SubLObject var191) {
        final SubLObject var399 = f43214(var191);
        return f43321(var398, $ic364$, var191, var399);
    }
    
    public static SubLObject f43345(final SubLObject var423, final SubLObject var191) {
        final SubLObject var424 = f43214(var191);
        return f43321(var423, $ic415$, var191, var424);
    }
    
    public static SubLObject f43346(final SubLObject var424, final SubLObject var180, final SubLObject var13) {
        return module0067.f4886($g5564$.getGlobalValue(), (SubLObject)ConsesLow.list(var424, var180), var13);
    }
    
    public static SubLObject f43066() {
        return module0067.f4881($g5564$.getGlobalValue());
    }
    
    public static SubLObject f43347(final SubLObject var424, final SubLObject var180) {
        final SubLObject var425 = (SubLObject)ConsesLow.list(var424, var180);
        SubLObject var426 = module0067.f4885($g5564$.getGlobalValue(), var425, (SubLObject)NIL);
        if (NIL != module0205.f13145((SubLObject)$ic416$, var426, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0067.f4887($g5564$.getGlobalValue(), (SubLObject)ConsesLow.list(var424, var180));
            var426 = (SubLObject)NIL;
        }
        return var426;
    }
    
    public static SubLObject f43321(final SubLObject var424, final SubLObject var164, final SubLObject var191, SubLObject var180) {
        if (var180 == UNPROVIDED) {
            var180 = f43214(var191);
        }
        final SubLThread var425 = SubLProcess.currentSubLThread();
        SubLObject var426 = (SubLObject)NIL;
        if (var424.isString() || NIL != f43202(var424)) {
            var426 = f43347(var424, var180);
            if (NIL == var426) {
                SubLObject var427 = var424;
                SubLObject var428 = var180;
                if (NIL != f43202(var424)) {
                    SubLObject var430;
                    final SubLObject var429 = var430 = var424.rest();
                    SubLObject var431 = (SubLObject)NIL;
                    SubLObject var432 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var430, var429, (SubLObject)$ic401$);
                    var431 = var430.first();
                    var430 = var430.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var430, var429, (SubLObject)$ic401$);
                    var432 = var430.first();
                    var430 = var430.rest();
                    if (NIL == var430) {
                        var428 = f43121(var431, var191, (SubLObject)UNPROVIDED);
                        var427 = var432;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var429, (SubLObject)$ic401$);
                    }
                }
                var426 = module0434.f30576((SubLObject)$ic417$, (SubLObject)ConsesLow.list($ic9$, (SubLObject)$ic417$, var428, var427), $ic42$, (SubLObject)$ic238$).first();
                if (NIL == var426) {
                    final SubLObject var433 = f43326((SubLObject)$ic417$, var428, var427, var191);
                    var426 = module0434.f30576((SubLObject)$ic417$, var433, $ic42$, (SubLObject)$ic238$).first();
                }
                if (NIL != var426) {
                    f43346(var424, var180, var426);
                }
                else if (NIL != module0708.$g5533$.getDynamicValue(var425)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic418$, $ic241$ }), var424);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
            }
        }
        return var426;
    }
    
    public static SubLObject f43344(final SubLObject var244, final SubLObject var191) {
        SubLObject var245 = (SubLObject)NIL;
        if (NIL == var244) {
            return (SubLObject)NIL;
        }
        if (NIL != f43199(var244)) {
            SubLObject var246 = (SubLObject)NIL;
            SubLObject var247 = f43205(var244);
            SubLObject var248 = (SubLObject)NIL;
            var248 = var247.first();
            while (NIL != var247) {
                var246 = (SubLObject)ConsesLow.cons(f43344(var248, var191), var246);
                var247 = var247.rest();
                var248 = var247.first();
            }
            var245 = f43310(var246, var191);
        }
        else if (NIL != f43200(var244)) {
            SubLObject var246 = (SubLObject)NIL;
            SubLObject var247 = f43206(var244);
            SubLObject var248 = (SubLObject)NIL;
            var248 = var247.first();
            while (NIL != var247) {
                final SubLObject var250;
                final SubLObject var249 = var250 = f43344(var248, var191);
                if (NIL != var250) {
                    var246 = (SubLObject)ConsesLow.cons(var250, var246);
                }
                var247 = var247.rest();
                var248 = var247.first();
            }
            if (NIL != module0035.f2013(var246)) {
                var245 = f43337(var246, var191);
            }
        }
        else if (NIL != f43201(var244)) {
            SubLObject var246 = (SubLObject)NIL;
            SubLObject var247 = f43207(var244);
            SubLObject var248 = (SubLObject)NIL;
            var248 = var247.first();
            while (NIL != var247) {
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
        if (var433 == UNPROVIDED) {
            var433 = $g5549$.getDynamicValue();
        }
        return f43348($g5568$.getGlobalValue(), var433, (SubLObject)NIL);
    }
    
    public static SubLObject f43124() {
        final SubLObject var433 = (SubLObject)ConsesLow.list((SubLObject)NIL, module0055.f4017(), f43060());
        f43348($g5567$.getGlobalValue(), var433, (SubLObject)NIL);
        $g5565$.setGlobalValue((SubLObject)ConsesLow.cons(var433, $g5565$.getGlobalValue()));
        f43128();
        return var433;
    }
    
    public static SubLObject f43349(final SubLObject var433) {
        return var433.first();
    }
    
    public static SubLObject f43350(final SubLObject var433, final SubLObject var25) {
        ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var433, module0035.sublisp_boolean(var25));
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
        if (NIL == Threads.valid_process_p($g5566$.getGlobalValue())) {
            f43354();
        }
        return $g5566$.getGlobalValue();
    }
    
    public static SubLObject f43354() {
        $g5566$.setGlobalValue(f43355());
        return $g5566$.getGlobalValue();
    }
    
    public static SubLObject f43356(final SubLObject var167, SubLObject var433) {
        if (var433 == UNPROVIDED) {
            var433 = $g5549$.getDynamicValue();
        }
        final SubLObject var434 = f43352(var433);
        if (NIL == module0055.f4028(var167, var434, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            f43348(var167, var433, (SubLObject)T);
        }
        return var167;
    }
    
    public static SubLObject f43357(final SubLObject var167, final SubLObject var433) {
        return f43348(var167, var433, (SubLObject)NIL);
    }
    
    public static SubLObject f43348(final SubLObject var167, final SubLObject var433, final SubLObject var435) {
        final SubLObject var436 = f43352(var433);
        module0055.f4021(var167, var436);
        if (NIL != var435) {
            f43350(var433, (SubLObject)T);
        }
        return var167;
    }
    
    public static SubLObject f43358() {
        if (NIL == module0067.f4852($g5569$.getGlobalValue())) {
            $g5569$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        }
        return $g5569$.getGlobalValue();
    }
    
    public static SubLObject f43296(final SubLObject var342, final SubLObject var25) {
        final SubLThread var343 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var343) && var25.equal((SubLObject)ConsesLow.list((SubLObject)$ic321$, var342))) {
            Errors.error((SubLObject)$ic422$, var342, var25);
        }
        return module0067.f4886(f43358(), var342, var25);
    }
    
    public static SubLObject f43359(final SubLObject var342) {
        return module0067.f4885(f43358(), var342, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43148(final SubLObject var11, final SubLObject var399, final SubLObject var400, final SubLObject var380, final SubLObject var389, final SubLObject var436, final SubLObject var191) {
        final SubLThread var437 = SubLProcess.currentSubLThread();
        SubLObject var438 = (SubLObject)NIL;
        final SubLObject var439 = module0111.$g1405$.currentBinding(var437);
        try {
            module0111.$g1405$.bind((SubLObject)NIL, var437);
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
        SubLObject var438 = (SubLObject)NIL;
        SubLObject var439 = (SubLObject)NIL;
        SubLObject var440 = (SubLObject)NIL;
        final SubLObject var441 = module0147.f9540(var400);
        final SubLObject var442 = module0147.$g2095$.currentBinding(var437);
        final SubLObject var443 = module0147.$g2094$.currentBinding(var437);
        final SubLObject var444 = module0147.$g2096$.currentBinding(var437);
        try {
            module0147.$g2095$.bind(module0147.f9545(var441), var437);
            module0147.$g2094$.bind(module0147.f9546(var441), var437);
            module0147.$g2096$.bind(module0147.f9549(var441), var437);
            SubLObject var445 = var399;
            SubLObject var446 = (SubLObject)NIL;
            var446 = var445.first();
            while (NIL != var445) {
                final SubLObject var447 = (NIL != f43361(var446)) ? f43362(var446) : var446;
                if (var447.eql((SubLObject)$ic423$)) {
                    var439 = (SubLObject)ConsesLow.cons(var446, var439);
                }
                else if (NIL == module0269.f17713(var447, (SubLObject)UNPROVIDED)) {
                    var439 = (SubLObject)ConsesLow.cons(var447, var439);
                }
                else {
                    final SubLObject var448 = var447;
                    if (NIL == conses_high.member(var448, var438, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
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
        assert NIL != constant_handles_oc.f8449(var440) : var440;
        SubLObject var449 = var439;
        SubLObject var450 = (SubLObject)NIL;
        var450 = var449.first();
        while (NIL != var449) {
            if (NIL != module0708.$g5533$.getDynamicValue(var437)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic424$, $ic241$ }), new SubLObject[] { var440, var450, var450 });
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43341((SubLObject)ConsesLow.list($ic397$, var440, var450), var400, (SubLObject)UNPROVIDED);
            var449 = var449.rest();
            var450 = var449.first();
        }
        return var440;
    }
    
    public static SubLObject f43324(SubLObject var11, final SubLObject var399, final SubLObject var400, final SubLObject var380, final SubLObject var389, final SubLObject var442) {
        SubLObject var443 = (SubLObject)NIL;
        SubLObject var444 = (SubLObject)NIL;
        if (NIL != module0038.f2611(var389)) {
            var11 = Sequences.cconcatenate(var11, var389);
        }
        if (NIL == var443) {
            var443 = f43363(var11, var399, var400, var380, var442);
        }
        if (NIL == var444) {
            SubLObject var445 = (SubLObject)$ic425$;
            SubLObject var446 = (SubLObject)NIL;
            var446 = var445.first();
            while (NIL == var444 && NIL != var445) {
                if (NIL != Sequences.find(var446, var399, (SubLObject)$ic395$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    f43364(module0202.f12768($ic397$, var443, var446), $ic93$);
                    var444 = (SubLObject)T;
                }
                var445 = var445.rest();
                var446 = var445.first();
            }
        }
        if (NIL == var444) {
            f43364(module0202.f12768($ic397$, var443, $ic18$), $ic93$);
        }
        return var443;
    }
    
    public static SubLObject f43363(final SubLObject var11, final SubLObject var438, final SubLObject var400, final SubLObject var380, final SubLObject var442) {
        final SubLObject var443 = module0035.remove_if_not((SubLObject)$ic426$, (NIL != module0038.f2611(var380)) ? Sequences.cconcatenate(var380, new SubLObject[] { $ic427$, var11 }) : var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var444 = module0543.f33623((NIL != var442) ? module0038.f2812(var443) : module0038.f2815(var443), (SubLObject)UNPROVIDED);
        SubLObject var445 = var438;
        SubLObject var446 = (SubLObject)NIL;
        var446 = var445.first();
        while (NIL != var445) {
            f43364(module0202.f12768($ic397$, var444, var446), var400);
            var445 = var445.rest();
            var446 = var445.first();
        }
        return var444;
    }
    
    public static SubLObject f43341(final SubLObject var447, final SubLObject var5, SubLObject var191) {
        if (var191 == UNPROVIDED) {
            var191 = $g5550$.getDynamicValue();
        }
        assert NIL != f43213(var191) : var191;
        if (NIL != module0205.f13145((SubLObject)$ic161$, var447, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL == module0274.f18064(var447, var5, (SubLObject)UNPROVIDED)) {
            final SubLObject var448 = (SubLObject)ConsesLow.list((SubLObject)$ic428$, var447, var5, var191);
            f43356(var448, (SubLObject)UNPROVIDED);
        }
        else {
            f43155(var447, var5, var191);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f43355() {
        final SubLObject var449 = module0059.f4352((SubLObject)$ic429$, (SubLObject)$ic430$);
        return var449;
    }
    
    public static SubLObject f43365(final SubLObject var433) {
        return Types.sublisp_null(module0055.f4029((SubLObject)$ic431$, f43352(var433), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f43130(SubLObject var433) {
        if (var433 == UNPROVIDED) {
            var433 = $g5549$.getDynamicValue();
        }
        final SubLThread var434 = SubLProcess.currentSubLThread();
        final SubLObject var435 = module0055.f4016(f43352(var433));
        final SubLObject var436 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic432$, var435);
        f43282();
        if (var435.isPositive()) {
            final SubLObject var437 = module0012.$g75$.currentBinding(var434);
            final SubLObject var438 = module0012.$g76$.currentBinding(var434);
            final SubLObject var439 = module0012.$g77$.currentBinding(var434);
            final SubLObject var440 = module0012.$g78$.currentBinding(var434);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var434);
                module0012.$g76$.bind((SubLObject)NIL, var434);
                module0012.$g77$.bind((SubLObject)T, var434);
                module0012.$g78$.bind(Time.get_universal_time(), var434);
                module0012.f478(var436);
                while (NIL == f43365(var433)) {
                    final SubLObject var441 = Numbers.subtract(var435, module0055.f4016(f43352(var433)));
                    final SubLObject var442 = Numbers.divide(var441, var435);
                    module0012.note_percent_progress(var441, var435);
                    f43284(var442);
                    Threads.sleep((SubLObject)$ic433$);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43366() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        while (NIL == module0035.f2012($g5565$.getGlobalValue())) {
            SubLObject var3 = conses_high.copy_list($g5565$.getGlobalValue());
            SubLObject var4 = (SubLObject)NIL;
            var4 = var3.first();
            while (NIL != var3) {
                final SubLObject var5 = f43352(var4);
                final SubLObject var6 = $g5540$.currentBinding(var2);
                try {
                    $g5540$.bind(f43353(var4), var2);
                    final SubLObject var7 = module0055.f4023(var5);
                    final SubLObject var8 = module0055.f4028($g5568$.getGlobalValue(), var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var9 = (SubLObject)NIL;
                    if (var7.eql($g5568$.getGlobalValue())) {
                        if (NIL != f43365(var4)) {
                            module0055.f4018(var5);
                            $g5565$.setGlobalValue(Sequences.remove(var4, $g5565$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        }
                    }
                    else if (var7.eql($g5567$.getGlobalValue())) {
                        if (NIL != f43351(var4)) {
                            if (NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic434$, $ic241$ }), module0055.f4016(var5));
                                streams_high.force_output((SubLObject)UNPROVIDED);
                            }
                            streams_high.force_output((SubLObject)UNPROVIDED);
                            f43350(var4, (SubLObject)NIL);
                        }
                        else if (NIL != f43365(var4)) {
                            if (NIL != module0035.f1997($g5565$.getGlobalValue())) {
                                if (NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic435$, $ic241$ }));
                                    streams_high.force_output((SubLObject)UNPROVIDED);
                                }
                                Threads.sleep((SubLObject)FIVE_INTEGER);
                            }
                        }
                        else if (NIL != var8) {
                            final SubLObject var10 = module0035.remove_if_not((SubLObject)$ic431$, module0055.f4020(var5), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            Errors.warn((SubLObject)$ic436$, Sequences.length(var10), var10);
                            SubLObject var10_455 = var10;
                            SubLObject var167_456 = (SubLObject)NIL;
                            var167_456 = var10_455.first();
                            while (NIL != var10_455) {
                                f43254(var167_456, (SubLObject)UNPROVIDED);
                                var10_455 = var10_455.rest();
                                var167_456 = var10_455.first();
                            }
                            module0055.f4018(var5);
                            $g5565$.setGlobalValue(Sequences.remove(var4, $g5565$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                        }
                        else {
                            if (NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic437$, $ic241$ }));
                                streams_high.force_output((SubLObject)UNPROVIDED);
                            }
                            Threads.sleep((SubLObject)FIVE_INTEGER);
                        }
                    }
                    else if (NIL != module0062.f4492(var7, (SubLObject)$ic438$)) {
                        final SubLObject var28_457 = $g5562$.currentBinding(var2);
                        try {
                            $g5562$.bind(var8, var2);
                            var9 = f43367(var7);
                        }
                        finally {
                            $g5562$.rebind(var28_457, var2);
                        }
                    }
                    if (NIL != var9) {
                        if (NIL == f43351(var4)) {
                            if (NIL != module0708.$g5533$.getDynamicValue(var2)) {
                                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic439$, $ic241$ }), var7);
                                streams_high.force_output((SubLObject)UNPROVIDED);
                            }
                            streams_high.force_output((SubLObject)UNPROVIDED);
                            f43350(var4, (SubLObject)T);
                        }
                    }
                    else {
                        f43357(var7, var4);
                    }
                }
                finally {
                    $g5540$.rebind(var6, var2);
                }
                var3 = var3.rest();
                var4 = var3.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43254(final SubLObject var167, SubLObject var230) {
        if (var230 == UNPROVIDED) {
            var230 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var231 = SubLProcess.currentSubLThread();
        final SubLObject var232 = f43368(var167);
        if (NIL != $g5540$.getDynamicValue(var231)) {
            f43369(var167, var232);
        }
        else {
            print_high.princ(var232, var230);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43368(final SubLObject var167) {
        SubLObject var168 = (SubLObject)NIL;
        SubLObject var169 = (SubLObject)NIL;
        try {
            var169 = streams_high.make_private_string_output_stream();
            if (NIL != module0062.f4492(var167, (SubLObject)$ic438$)) {
                SubLObject var171;
                final SubLObject var170 = var171 = var167.rest();
                SubLObject var172 = (SubLObject)NIL;
                SubLObject var173 = (SubLObject)NIL;
                SubLObject var174 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)$ic440$);
                var172 = var171.first();
                var171 = var171.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)$ic440$);
                var173 = var171.first();
                var171 = var171.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)$ic440$);
                var174 = var171.first();
                var171 = var171.rest();
                if (NIL == var171) {
                    SubLObject var175 = module0205.f13183(var172, (SubLObject)$ic161$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var176 = (SubLObject)NIL;
                    var176 = var175.first();
                    while (NIL != var175) {
                        if ($ic423$.eql(f43362(var176))) {
                            PrintLow.format(var169, (SubLObject)$ic441$, var176);
                        }
                        var175 = var175.rest();
                        var176 = var175.first();
                    }
                    final SubLObject var177 = module0205.f13147(var172, (SubLObject)$ic161$, (SubLObject)$ic442$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == module0205.f13220((SubLObject)$ic423$, var177, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        final SubLObject var178 = module0274.f18198(var177, var173, (SubLObject)UNPROVIDED);
                        if (NIL != var178) {
                            print_high.print(var178, var169);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var170, (SubLObject)$ic440$);
                }
            }
            else {
                PrintLow.format(var169, (SubLObject)$ic443$, var167);
            }
            var168 = streams_high.get_output_stream_string(var169);
        }
        finally {
            final SubLObject var179 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var169, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var179);
            }
        }
        return var168;
    }
    
    public static SubLObject f43367(final SubLObject var167) {
        SubLObject var168 = (SubLObject)NIL;
        SubLObject var170;
        final SubLObject var169 = var170 = var167.rest();
        SubLObject var171 = (SubLObject)NIL;
        SubLObject var172 = (SubLObject)NIL;
        SubLObject var173 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var170, var169, (SubLObject)$ic440$);
        var171 = var170.first();
        var170 = var170.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var170, var169, (SubLObject)$ic440$);
        var172 = var170.first();
        var170 = var170.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var170, var169, (SubLObject)$ic440$);
        var173 = var170.first();
        var170 = var170.rest();
        if (NIL == var170) {
            SubLObject var174 = Types.sublisp_null(module0205.f13145((SubLObject)$ic161$, var171, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL == var174) {
                var171 = module0205.f13147(var171, (SubLObject)$ic161$, (SubLObject)$ic442$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var174 = Types.sublisp_null(module0205.f13220((SubLObject)$ic423$, var171, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            if (NIL != var174) {
                var168 = f43155(var171, var172, var173);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var169, (SubLObject)$ic440$);
        }
        return var168;
    }
    
    public static SubLObject f43323(final SubLObject var241, final SubLObject var164, final SubLObject var180, final SubLObject var191) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic444$, (SubLObject)$ic445$, var241, var164, var180, var191);
    }
    
    public static SubLObject f43370(final SubLObject var342, SubLObject var164) {
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        final SubLThread var343 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var343) && NIL == module0084.f5808(f43358(), var342)) {
            Errors.error((SubLObject)$ic446$, var342);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic444$, (SubLObject)$ic321$, var342, var164);
    }
    
    public static SubLObject f43361(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)$ic447$);
    }
    
    public static SubLObject f43362(final SubLObject var461) {
        final SubLThread var462 = SubLProcess.currentSubLThread();
        SubLObject var463 = (SubLObject)$ic423$;
        final SubLObject var464 = conses_high.second(var461);
        if (var464.eql((SubLObject)$ic321$)) {
            final SubLObject var465 = module0067.f4885(f43358(), conses_high.third(var461), (SubLObject)UNPROVIDED);
            if (NIL != constant_handles_oc.f8463(var465, (SubLObject)UNPROVIDED)) {
                var463 = var465;
            }
        }
        else if (var464.eql((SubLObject)$ic445$)) {
            SubLObject var467;
            final SubLObject var466 = var467 = Sequences.subseq(var461, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
            SubLObject var468 = (SubLObject)NIL;
            SubLObject var469 = (SubLObject)NIL;
            SubLObject var470 = (SubLObject)NIL;
            SubLObject var471 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)$ic448$);
            var468 = var467.first();
            var467 = var467.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)$ic448$);
            var469 = var467.first();
            var467 = var467.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)$ic448$);
            var470 = var467.first();
            var467 = var467.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var467, var466, (SubLObject)$ic448$);
            var471 = var467.first();
            var467 = var467.rest();
            if (NIL == var467) {
                if (NIL != f43200(var468)) {
                    var463 = f43371(var468, var469, var471, (SubLObject)T);
                }
                else if (NIL != f43199(var468)) {
                    var463 = f43372(var468, var469, var471, (SubLObject)T);
                }
                else {
                    final SubLObject var472 = (NIL != $g5562$.getDynamicValue(var462)) ? f43318(var468, var469, var470, var471, (SubLObject)T) : f43321(var468, var469, var471, var470);
                    if (NIL != var472) {
                        var463 = var472;
                        f43373(var461, var463);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var466, (SubLObject)$ic448$);
            }
        }
        return var463;
    }
    
    public static SubLObject f43070() {
        final SubLObject var193 = $g5570$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43374(final SubLObject var461, final SubLObject var13) {
        return module0034.f1829($g5570$.getGlobalValue(), (SubLObject)ConsesLow.list(var461, var13), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43375(final SubLObject var461, final SubLObject var13) {
        final SubLThread var462 = SubLProcess.currentSubLThread();
        if (NIL != module0708.$g5533$.getDynamicValue(var462)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic450$, $ic241$ }), var461, var13);
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43373(final SubLObject var461, final SubLObject var13) {
        SubLObject var462 = $g5570$.getGlobalValue();
        if (NIL == var462) {
            var462 = module0034.f1934((SubLObject)$ic449$, (SubLObject)$ic451$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var463 = module0034.f1782(var461, var13);
        final SubLObject var464 = module0034.f1814(var462, var463, (SubLObject)UNPROVIDED);
        if (var464 != $ic15$) {
            SubLObject var465 = var464;
            SubLObject var466 = (SubLObject)NIL;
            var466 = var465.first();
            while (NIL != var465) {
                SubLObject var467 = var466.first();
                final SubLObject var468 = conses_high.second(var466);
                if (var461.equal(var467.first())) {
                    var467 = var467.rest();
                    if (NIL != var467 && NIL == var467.rest() && var13.equal(var467.first())) {
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
        if (f43250(var191).equalp((SubLObject)$ic88$) && NIL != module0205.f13145((SubLObject)$ic453$, var470, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var472 = module0205.f13147(var470, (SubLObject)$ic453$, (SubLObject)$ic454$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0205.f13145((SubLObject)$ic453$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var470 = var472;
            }
        }
        SubLObject var473 = (SubLObject)NIL;
        if (NIL != module0288.f19313(var470, var5)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var471)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic455$, $ic241$ }), var470, var5);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var473 = (SubLObject)T;
        }
        else {
            final SubLObject var474 = module0111.$g1405$.currentBinding(var471);
            try {
                module0111.$g1405$.bind((SubLObject)NIL, var471);
                module0574.f35153(f43220(var191));
                var471.resetMultipleValues();
                final SubLObject var475 = f43364(var470, var5);
                final SubLObject var476 = var471.secondMultipleValue();
                var471.resetMultipleValues();
                if (NIL != var475) {
                    var473 = (SubLObject)T;
                }
                else if (NIL != module0708.$g5533$.getDynamicValue(var471)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic456$, $ic241$ }), var476);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
            }
            finally {
                module0111.$g1405$.rebind(var474, var471);
            }
        }
        if (NIL != var473) {
            module0708.f43030(var470, var5, f43249(var191));
        }
        return var473;
    }
    
    public static SubLObject f43155(final SubLObject var470, final SubLObject var5, final SubLObject var191) {
        final SubLThread var471 = SubLProcess.currentSubLThread();
        final SubLObject var472 = module0034.$g879$.getDynamicValue(var471);
        SubLObject var473 = (SubLObject)NIL;
        if (NIL == var472) {
            return f43376(var470, var5, var191);
        }
        var473 = module0034.f1857(var472, (SubLObject)$ic452$, (SubLObject)UNPROVIDED);
        if (NIL == var473) {
            var473 = module0034.f1807(module0034.f1842(var472), (SubLObject)$ic452$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var472, (SubLObject)$ic452$, var473);
        }
        final SubLObject var474 = module0034.f1781(var470, var5, var191);
        final SubLObject var475 = module0034.f1814(var473, var474, (SubLObject)UNPROVIDED);
        if (var475 != $ic15$) {
            SubLObject var476 = var475;
            SubLObject var477 = (SubLObject)NIL;
            var477 = var476.first();
            while (NIL != var476) {
                SubLObject var478 = var477.first();
                final SubLObject var479 = conses_high.second(var477);
                if (var470.equal(var478.first())) {
                    var478 = var478.rest();
                    if (var5.equal(var478.first())) {
                        var478 = var478.rest();
                        if (NIL != var478 && NIL == var478.rest() && var191.equal(var478.first())) {
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
        return Values.values(module0540.f33517(var470, var5, (SubLObject)UNPROVIDED), (SubLObject)NIL);
    }
    
    public static SubLObject f43143(final SubLObject var474, final SubLObject var191, SubLObject var475) {
        if (var475 == UNPROVIDED) {
            var475 = (SubLObject)$ic457$;
        }
        final SubLThread var476 = SubLProcess.currentSubLThread();
        f43282();
        if (NIL != module0035.f2013(var474)) {
            final SubLObject var477 = Sequences.length(var474);
            final SubLObject var478 = Numbers.divide((SubLObject)ONE_INTEGER, var477);
            SubLObject var479 = (SubLObject)ZERO_INTEGER;
            module0012.$g82$.setDynamicValue(var475, var476);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var476);
            module0012.$g83$.setDynamicValue(Sequences.length(var474), var476);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var476);
            final SubLObject var480 = module0012.$g75$.currentBinding(var476);
            final SubLObject var481 = module0012.$g76$.currentBinding(var476);
            final SubLObject var482 = module0012.$g77$.currentBinding(var476);
            final SubLObject var483 = module0012.$g78$.currentBinding(var476);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var476);
                module0012.$g76$.bind((SubLObject)NIL, var476);
                module0012.$g77$.bind((SubLObject)T, var476);
                module0012.$g78$.bind(Time.get_universal_time(), var476);
                module0012.f478(module0012.$g82$.getDynamicValue(var476));
                SubLObject var484 = var474;
                SubLObject var485 = (SubLObject)NIL;
                var485 = var484.first();
                while (NIL != var484) {
                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var476), module0012.$g83$.getDynamicValue(var476));
                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var476), (SubLObject)ONE_INTEGER), var476);
                    if (NIL == f43377(var485, var191)) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43377(final SubLObject var343, final SubLObject var191) {
        if (NIL == f43117(var343) && NIL != f43292(var343, (SubLObject)$ic321$, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43378(final SubLObject var343, final SubLObject var191) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = f43117(var343);
        final SubLObject var346 = f43292(var343, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
        SubLObject var347 = f43343(var343, var191);
        SubLObject var348 = (SubLObject)((NIL != var346) ? f43321(var346, var347.first(), var191, (SubLObject)UNPROVIDED) : NIL);
        final SubLObject var349 = f43166(var191);
        final SubLObject var350 = f43244(var191);
        if (NIL == module0173.f10955(var348)) {
            var348 = f43379(var343, var191);
        }
        if (NIL == module0173.f10955(var348) && NIL == var345) {
            if (NIL == $g5571$.getDynamicValue(var344)) {
                return (SubLObject)NIL;
            }
            final SubLObject var351 = Sequences.find_if((SubLObject)$ic345$, var347, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var352 = (NIL != var351) ? var351 : $ic18$;
            var345 = Sequences.cconcatenate((SubLObject)$ic458$, constants_high_oc.f10743(var352));
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic459$, $ic241$ }), var345);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
        }
        SubLObject var353 = f43292(var343, (SubLObject)$ic262$, (SubLObject)NIL);
        SubLObject var354 = (SubLObject)NIL;
        var354 = var353.first();
        while (NIL != var353) {
            final SubLObject var355 = f43309(var354, var191);
            var347 = (SubLObject)ConsesLow.cons(var355, var347);
            var353 = var353.rest();
            var354 = var353.first();
        }
        if (NIL != module0173.f10955(var348)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic460$, $ic241$ }), var348);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var353 = var347;
            var354 = (SubLObject)NIL;
            var354 = var353.first();
            while (NIL != var353) {
                f43341((SubLObject)ConsesLow.list($ic397$, var348, var354), var349, var191);
                var353 = var353.rest();
                var354 = var353.first();
            }
        }
        if (NIL == module0173.f10955(var348)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic461$, $ic241$ }), var343);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var348 = f43148(var345, var347, var349, (SubLObject)$ic94$, var350, (SubLObject)$ic95$, var191);
        }
        if (NIL == var348) {
            if (NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic462$, var345);
            }
        }
        else {
            f43380(var348, var349, var343, var191);
            module0708.f43038(var348, f43249(var191), f43156(var191));
        }
        return var348;
    }
    
    public static SubLObject f43379(final SubLObject var343, final SubLObject var191) {
        SubLObject var344 = (SubLObject)NIL;
        final SubLObject var345 = f43292(var343, (SubLObject)$ic286$, (SubLObject)NIL);
        final SubLObject var346 = f43292(var343, (SubLObject)$ic289$, (SubLObject)NIL);
        if (NIL != Guids.guid_string_p(var345)) {
            var344 = constants_high_oc.f10747(var345);
        }
        else if (NIL != module0213.f13915(var346)) {
            var344 = module0213.f13917(var346);
        }
        else if (NIL != module0213.f13913(var346)) {
            var344 = module0213.f13921(var346);
        }
        if (NIL == var344) {
            SubLObject var347;
            SubLObject var348;
            for (var347 = f43292(var343, (SubLObject)$ic463$, (SubLObject)NIL), var348 = (SubLObject)NIL, var348 = var347.first(); NIL == var344 && NIL != var347; var344 = f43309(var348, var191), var347 = var347.rest(), var348 = var347.first()) {}
        }
        if (NIL == var344) {
            final SubLObject var349 = f43292(var343, (SubLObject)$ic464$, (SubLObject)NIL);
            if (NIL != var349) {
                SubLObject var350 = (SubLObject)NIL;
                SubLObject var351 = var349;
                SubLObject var352 = (SubLObject)NIL;
                var352 = var351.first();
                while (NIL != var351) {
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
        SubLObject var402 = f43292(var343, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
        SubLObject var403 = f43137(var191);
        f43341((SubLObject)ConsesLow.list($ic365$, var13, f43246(var191)), $ic366$, var191);
        if (NIL != f43202(var402)) {
            SubLObject var405;
            final SubLObject var404 = var405 = var402.rest();
            SubLObject var406 = (SubLObject)NIL;
            SubLObject var407 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var405, var404, (SubLObject)$ic401$);
            var406 = var405.first();
            var405 = var405.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var405, var404, (SubLObject)$ic401$);
            var407 = var405.first();
            var405 = var405.rest();
            if (NIL == var405) {
                var403 = f43121(var406, var191, (SubLObject)UNPROVIDED);
                var402 = var407;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var404, (SubLObject)$ic401$);
            }
        }
        if (var402.isString()) {
            f43325(var13, var403, var402, var191);
        }
        if (NIL != f43381(var343)) {
            f43341((SubLObject)ConsesLow.list($ic114$, var13, f43381(var343)), var400, var191);
        }
        SubLObject var408 = f43382(var343);
        if (NIL != module0035.f2012(var408)) {
            var408 = (SubLObject)ConsesLow.cons(module0708.f43012((SubLObject)$ic465$), var408);
            module0708.f43038($ic466$, f43249(var191), f43156(var191));
        }
        SubLObject var409 = var408;
        SubLObject var410 = (SubLObject)NIL;
        var410 = var409.first();
        while (NIL != var409) {
            if (NIL != f43204(var410)) {
                var410 = f43304(var410);
            }
            if (var410.isString() || NIL != f43199(var410) || NIL != f43202(var410)) {
                final SubLObject var411 = f43309(var410, var191);
                if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic467$, $ic241$ }), var411, var13);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list($ic468$, var13, var411), var400, var191);
            }
            else if (NIL != f43203(var410)) {
                f43383(var13, var410, var400, var191);
            }
            else if (NIL != module0062.f4492(var410, (SubLObject)$ic469$)) {
                final SubLObject var412 = conses_high.second(var410);
                final SubLObject var413 = f43309(var412, var191);
                if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic470$, $ic241$ }), var413, var13);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list($ic471$, var413, var13), var400, var191);
            }
            else {
                Errors.warn((SubLObject)$ic472$, var410);
            }
            var409 = var409.rest();
            var410 = var409.first();
        }
        SubLObject var414 = f43384(var343);
        SubLObject var415 = (SubLObject)NIL;
        var415 = var414.first();
        while (NIL != var414) {
            if (var415.isString() || NIL != f43199(var415) || NIL != f43202(var415)) {
                final SubLObject var416 = (SubLObject)((NIL != var415) ? f43309(var415, var191) : NIL);
                if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic473$, $ic241$ }), var416, var13);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list($ic471$, var13, var416), var400, var191);
            }
            else {
                Errors.warn((SubLObject)$ic474$, var415);
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
        for (var417 = (SubLObject)NIL, var417 = f43385(var343); NIL != var417; var417 = conses_high.cddr(var417)) {
            var418 = var417.first();
            var419 = conses_high.cadr(var417);
            var420 = var418;
            if (!var420.eql((SubLObject)$ic156$) && !var420.eql((SubLObject)$ic262$) && !var420.eql((SubLObject)$ic286$)) {
                if (!var420.eql((SubLObject)$ic289$)) {
                    if (var420.eql((SubLObject)$ic267$)) {
                        var421 = var419;
                        var422 = (SubLObject)NIL;
                        var422 = var421.first();
                        while (NIL != var421) {
                            f43167(var13, var422, var191);
                            var421 = var421.rest();
                            var422 = var421.first();
                        }
                    }
                    else if (var420.eql((SubLObject)$ic463$)) {
                        var421 = var419;
                        var423 = (SubLObject)NIL;
                        var423 = var421.first();
                        while (NIL != var421) {
                            f43386(var13, var423, var400, var191);
                            var421 = var421.rest();
                            var423 = var421.first();
                        }
                    }
                    else if (var420.eql((SubLObject)$ic324$)) {
                        var241_486 = var419;
                        var424 = f43309(var241_486, var191);
                        if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic470$, $ic241$ }), var424, var13);
                            streams_high.force_output((SubLObject)UNPROVIDED);
                        }
                        f43341((SubLObject)ConsesLow.list($ic471$, var424, var13), var400, var191);
                    }
                    else if (var420.eql((SubLObject)$ic464$)) {
                        var425 = (SubLObject)NIL;
                        var426 = var419;
                        var427 = (SubLObject)NIL;
                        var427 = var426.first();
                        while (NIL != var426) {
                            var428 = f43309(var427, var191);
                            var425 = (SubLObject)ConsesLow.cons(var428, var425);
                            var426 = var426.rest();
                            var427 = var426.first();
                        }
                        if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic475$, $ic241$ }), var13, var425);
                            streams_high.force_output((SubLObject)UNPROVIDED);
                        }
                        f43341((SubLObject)ConsesLow.list($ic476$, var13, reader.bq_cons($ic388$, var425)), var400, var191);
                    }
                    else if (var420.eql((SubLObject)$ic325$)) {
                        var425 = (SubLObject)NIL;
                        var426 = var419;
                        var427 = (SubLObject)NIL;
                        var427 = var426.first();
                        while (NIL != var426) {
                            var428 = f43309(var427, var191);
                            var425 = (SubLObject)ConsesLow.cons(var428, var425);
                            var426 = var426.rest();
                            var427 = var426.first();
                        }
                        if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic477$, $ic241$ }), var13, var425);
                            streams_high.force_output((SubLObject)UNPROVIDED);
                        }
                        f43341((SubLObject)ConsesLow.list($ic478$, var13, reader.bq_cons($ic388$, var425)), var400, var191);
                    }
                    else if (var420.eql((SubLObject)$ic479$)) {
                        var429 = f43207(var419);
                        if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic480$, $ic241$ }), var13, var429);
                            streams_high.force_output((SubLObject)UNPROVIDED);
                        }
                        var426 = var429;
                        var427 = (SubLObject)NIL;
                        var427 = var426.first();
                        while (NIL != var426) {
                            var430 = f43316(var427, var13, var191);
                            f43341((SubLObject)ConsesLow.list($ic397$, var430, var13), var400, var191);
                            var426 = var426.rest();
                            var427 = var426.first();
                        }
                        f43341((SubLObject)ConsesLow.list($ic481$, var13), var400, var191);
                    }
                    else if (var420.eql((SubLObject)$ic294$)) {
                        var421 = var419;
                        var431 = (SubLObject)NIL;
                        var431 = var421.first();
                        while (NIL != var421) {
                            var432 = (var433 = var431);
                            var434 = (SubLObject)NIL;
                            var25_490 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var433, var432, (SubLObject)$ic413$);
                            var434 = var433.first();
                            var433 = var433.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var433, var432, (SubLObject)$ic413$);
                            var25_490 = var433.first();
                            var433 = var433.rest();
                            if (NIL == var433) {
                                var435 = f43316(var434, $ic394$, var191);
                                var436 = module0202.f12768(var435, var13, var25_490);
                                if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic414$, $ic241$ }), var436);
                                    streams_high.force_output((SubLObject)UNPROVIDED);
                                }
                                f43341(var436, var400, var191);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var432, (SubLObject)$ic413$);
                            }
                            var421 = var421.rest();
                            var431 = var421.first();
                        }
                    }
                    else if (NIL != module0708.f43006()) {
                        Errors.warn((SubLObject)$ic482$, var418, var419);
                    }
                }
            }
        }
        return var13;
    }
    
    public static SubLObject f43167(final SubLObject var13, final SubLObject var25, final SubLObject var191) {
        SubLObject var192 = (SubLObject)NIL;
        SubLObject var193 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)$ic483$);
        var192 = var25.first();
        final SubLObject var194 = var193 = var25.rest();
        final SubLObject var195 = (SubLObject)((NIL != var193) ? module0434.f30578((SubLObject)$ic484$, (SubLObject)ConsesLow.listS($ic485$, var193, (SubLObject)$ic486$), $ic42$, (SubLObject)$ic487$).first() : NIL);
        final SubLObject var196 = (NIL != var195) ? var195 : $ic488$;
        final SubLObject var197 = module0038.f2744(var192, Symbols.symbol_function((SubLObject)$ic359$));
        f43341((SubLObject)ConsesLow.list($ic489$, var13, var197), var196, var191);
        return var192;
    }
    
    public static SubLObject f43386(final SubLObject var124, final SubLObject var241, final SubLObject var400, final SubLObject var191) {
        final SubLThread var401 = SubLProcess.currentSubLThread();
        final SubLObject var402 = f43309(var241, var191);
        if (!var402.equal(var124)) {
            if (NIL != var402) {
                if (NIL != module0708.$g5533$.getDynamicValue(var401)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic490$, $ic241$ }), var402, var124);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                f43341((SubLObject)ConsesLow.list($ic491$, var402, var124), var400, var191);
            }
            else if (NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic492$, var241, var124);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43383(final SubLObject var124, final SubLObject var347, final SubLObject var400, final SubLObject var191) {
        final SubLObject var401 = f43387(var124, var347, var191);
        if (NIL != var401) {
            f43341(var401, var400, var191);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43387(final SubLObject var124, final SubLObject var347, final SubLObject var191) {
        final SubLThread var348 = SubLProcess.currentSubLThread();
        SubLObject var350;
        final SubLObject var349 = var350 = var347.rest();
        SubLObject var351 = (SubLObject)NIL;
        SubLObject var352 = (SubLObject)NIL;
        SubLObject var353 = (SubLObject)NIL;
        SubLObject var354 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var351 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var352 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var353 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var354 = var350.first();
        var350 = var350.rest();
        if (NIL == var350) {
            final SubLObject var355 = f43316(var351, $ic394$, var191);
            final SubLObject var356 = (NIL != module0173.f10955(var354)) ? var354 : f43316(var354, $ic350$, var191);
            final SubLObject var357 = f43279(var353, $ic18$, var191);
            SubLObject var358 = (SubLObject)NIL;
            if (NIL != f43202(var353) && NIL != module0708.$g5533$.getDynamicValue(var348)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic494$, $ic241$ }), var353, var357);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            if (NIL != f43204(var357) && NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic495$, var357);
            }
            if (NIL == var357) {
                Errors.warn((SubLObject)$ic496$, var352, var353);
            }
            else if (var352.equal(module0708.f43012((SubLObject)$ic497$))) {
                var358 = (SubLObject)ConsesLow.list($ic498$, var355, var124, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)$ic499$))) {
                var358 = (SubLObject)ConsesLow.list($ic500$, var355, var124, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)$ic501$))) {
                var358 = (SubLObject)ConsesLow.list($ic502$, var355, var124, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)$ic503$)) && var353.eql((SubLObject)ONE_INTEGER) && var356.eql($ic18$)) {
                var358 = (SubLObject)ConsesLow.list($ic504$, var124, var355);
            }
            else if (var352.equal(module0708.f43012((SubLObject)$ic505$))) {
                var358 = (SubLObject)ConsesLow.list($ic506$, var355, var124, var356, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)$ic503$))) {
                var358 = (SubLObject)ConsesLow.list($ic507$, var355, var124, var356, var357);
            }
            else if (var352.equal(module0708.f43012((SubLObject)$ic508$))) {
                var358 = (SubLObject)ConsesLow.list($ic509$, var355, var124, var356, var357);
            }
            else {
                Errors.warn((SubLObject)$ic496$, var352, var353);
            }
            return var358;
        }
        cdestructuring_bind.cdestructuring_bind_error(var349, (SubLObject)$ic493$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43388(final SubLObject var347, final SubLObject var191, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = $ic18$;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        SubLObject var350;
        final SubLObject var349 = var350 = var347.rest();
        SubLObject var351 = (SubLObject)NIL;
        SubLObject var352 = (SubLObject)NIL;
        SubLObject var353 = (SubLObject)NIL;
        SubLObject var354 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var351 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var352 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var353 = var350.first();
        var350 = var350.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var350, var349, (SubLObject)$ic493$);
        var354 = var350.first();
        var350 = var350.rest();
        if (NIL == var350) {
            final SubLObject var355 = f43316(var351, $ic394$, var191);
            final SubLObject var356 = (NIL != module0173.f10955(var354)) ? var354 : f43316(var354, $ic350$, var191);
            final SubLObject var357 = f43279(var353, $ic18$, var191);
            SubLObject var358 = (SubLObject)NIL;
            if (NIL != f43202(var353) && NIL != module0708.$g5533$.getDynamicValue(var348)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic494$, $ic241$ }), var353, var357);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            final SubLObject var359 = module0035.f2294($g5572$.getGlobalValue(), var352, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            if (NIL != var359) {
                var358 = module0205.f13252(var355, (SubLObject)$ic516$, module0205.f13252(var356, (SubLObject)$ic84$, module0205.f13252(var357, (SubLObject)$ic517$, module0205.f13252(var75, (SubLObject)$ic518$, var359, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                Errors.sublisp_break((SubLObject)$ic519$, new SubLObject[] { var352, var353 });
            }
            return var358;
        }
        cdestructuring_bind.cdestructuring_bind_error(var349, (SubLObject)$ic493$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43389(final SubLObject var347, final SubLObject var191, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = $ic18$;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        final SubLObject var349 = f43388(var347, var191, var75);
        if (NIL != module0708.$g5533$.getDynamicValue(var348)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic521$, $ic241$ }), var349, var347);
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        return f43336(var349, var191);
    }
    
    public static SubLObject f43313(final SubLObject var347, final SubLObject var191, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = $ic18$;
        }
        final SubLThread var348 = SubLProcess.currentSubLThread();
        final SubLObject var349 = module0034.$g879$.getDynamicValue(var348);
        SubLObject var350 = (SubLObject)NIL;
        if (NIL == var349) {
            return f43389(var347, var191, var75);
        }
        var350 = module0034.f1857(var349, (SubLObject)$ic520$, (SubLObject)UNPROVIDED);
        if (NIL == var350) {
            var350 = module0034.f1807(module0034.f1842(var349), (SubLObject)$ic520$, (SubLObject)THREE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var349, (SubLObject)$ic520$, var350);
        }
        final SubLObject var351 = module0034.f1781(var347, var191, var75);
        final SubLObject var352 = module0034.f1814(var350, var351, (SubLObject)UNPROVIDED);
        if (var352 != $ic15$) {
            SubLObject var353 = var352;
            SubLObject var354 = (SubLObject)NIL;
            var354 = var353.first();
            while (NIL != var353) {
                SubLObject var355 = var354.first();
                final SubLObject var356 = conses_high.second(var354);
                if (var347.equal(var355.first())) {
                    var355 = var355.rest();
                    if (var191.equal(var355.first())) {
                        var355 = var355.rest();
                        if (NIL != var355 && NIL == var355.rest() && var75.equal(var355.first())) {
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
        final SubLObject var504 = f43122(f43137(var191), (SubLObject)UNPROVIDED);
        f43341((SubLObject)ConsesLow.list($ic365$, var502, var504), $ic366$, var191);
        if (NIL != module0708.$g5533$.getDynamicValue(var503)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic522$, $ic241$ }), (SubLObject)ConsesLow.list($ic365$, var502, var504));
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        module0708.f43038(var502, f43249(var191), f43156(var191));
        return (SubLObject)((NIL != var502) ? module0285.f18875(var502, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f43304(final SubLObject var378) {
        assert NIL != f43204(var378) : var378;
        final SubLObject var379 = f43359(conses_high.second(var378));
        return (NIL != var379) ? var379 : var378;
    }
    
    public static SubLObject f43279(final SubLObject var378, final SubLObject var164, final SubLObject var191) {
        final SubLThread var379 = SubLProcess.currentSubLThread();
        SubLObject var380 = (SubLObject)NIL;
        final SubLObject var381 = $g5573$.currentBinding(var379);
        try {
            $g5573$.bind(module0048.f_1X($g5573$.getDynamicValue(var379)), var379);
            if ($g5573$.getDynamicValue(var379).numG((SubLObject)TEN_INTEGER)) {
                Errors.warn((SubLObject)$ic524$, var378);
            }
            if (NIL != f43204(var378)) {
                var380 = f43390(var378, var164, var191);
            }
            else if (NIL != f43199(var378)) {
                var380 = f43372(var378, var164, var191, (SubLObject)UNPROVIDED);
            }
            else if (NIL != f43200(var378)) {
                var380 = f43371(var378, var164, var191, (SubLObject)UNPROVIDED);
            }
            else if (NIL != f43203(var378)) {
                var380 = f43313(var378, var191, (SubLObject)UNPROVIDED);
            }
            else if (NIL != f43201(var378)) {
                SubLObject var382 = (SubLObject)NIL;
                SubLObject var383 = f43207(var378);
                SubLObject var384 = (SubLObject)NIL;
                var384 = var383.first();
                while (NIL != var383) {
                    var382 = (SubLObject)ConsesLow.cons(f43279(var384, $ic18$, var191), var382);
                    var383 = var383.rest();
                    var384 = var383.first();
                }
                var380 = f43338(var382, var191);
            }
            else if (NIL != module0062.f4492(var378, (SubLObject)$ic525$)) {
                final SubLObject var385 = f43279(conses_high.second(var378), var164, var191);
                if (NIL != var385) {
                    var380 = (SubLObject)ConsesLow.list($ic526$, $ic18$, var385);
                }
            }
            else if (var378.isString()) {
                var380 = f43316(var378, var164, var191);
            }
            else if (NIL != f43202(var378)) {
                var380 = f43316(var378, var164, var191);
            }
            else if (NIL != module0206.f13444(var378) && (NIL == module0202.f12590(var378) || NIL != module0205.f13145((SubLObject)$ic527$, var378, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                var380 = var378;
            }
            else if (NIL != module0205.f13145((SubLObject)$ic161$, var378, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var380 = var378;
            }
        }
        finally {
            $g5573$.rebind(var381, var379);
        }
        if (NIL == var380) {
            Errors.sublisp_break((SubLObject)$ic528$, new SubLObject[] { var164, var378 });
        }
        return var380;
    }
    
    public static SubLObject f43372(final SubLObject var378, final SubLObject var164, final SubLObject var191, SubLObject var506) {
        if (var506 == UNPROVIDED) {
            var506 = (SubLObject)NIL;
        }
        final SubLObject var507 = f43205(var378);
        SubLObject var508 = (SubLObject)NIL;
        if (NIL == var506 && NIL != f43204(var507)) {
            var508 = f43323(var378, var164, (SubLObject)NIL, var191);
        }
        else if (NIL != f43204(var507)) {
            var508 = f43310(f43391(var507, var164, var191), var191);
        }
        else {
            SubLObject var509 = (SubLObject)NIL;
            SubLObject var510 = var507;
            SubLObject var511 = (SubLObject)NIL;
            var511 = var510.first();
            while (NIL != var510) {
                var509 = (SubLObject)ConsesLow.cons(f43279(var511, var164, var191), var509);
                var510 = var510.rest();
                var511 = var510.first();
            }
            var508 = f43310(var509, var191);
        }
        return var508;
    }
    
    public static SubLObject f43371(final SubLObject var378, final SubLObject var164, final SubLObject var191, SubLObject var506) {
        if (var506 == UNPROVIDED) {
            var506 = (SubLObject)NIL;
        }
        final SubLObject var507 = f43206(var378);
        SubLObject var508 = (SubLObject)NIL;
        if (NIL == var506 && NIL != f43204(var507)) {
            var508 = f43323(var378, var164, (SubLObject)NIL, var191);
        }
        else if (NIL != f43204(var507)) {
            var508 = f43337(f43391(var507, var164, var191), var191);
        }
        else {
            SubLObject var509 = (SubLObject)NIL;
            SubLObject var510 = Sequences.remove_if((SubLObject)$ic529$, var507, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var511 = (SubLObject)NIL;
            var511 = var510.first();
            while (NIL != var510) {
                var509 = (SubLObject)ConsesLow.cons(f43279(var511, var164, var191), var509);
                var510 = var510.rest();
                var511 = var510.first();
            }
            final SubLObject var512 = (NIL != module0035.f2013(var509)) ? var509.first() : $ic18$;
            SubLObject var513 = module0035.remove_if_not((SubLObject)$ic529$, var507, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var514 = (SubLObject)NIL;
            var514 = var513.first();
            while (NIL != var513) {
                var509 = (SubLObject)ConsesLow.cons(f43313(var514, var191, var512), var509);
                var513 = var513.rest();
                var514 = var513.first();
            }
            var508 = f43337(var509, var191);
        }
        return var508;
    }
    
    public static SubLObject f43391(final SubLObject var507, final SubLObject var164, final SubLObject var191) {
        assert NIL != f43204(var507) : var507;
        final SubLObject var508 = f43359(conses_high.second(var507));
        SubLObject var509 = (SubLObject)NIL;
        if (NIL != var508) {
            if (NIL != f43300(var508)) {
                SubLObject var511;
                final SubLObject var510 = var511 = var508;
                SubLObject var512 = (SubLObject)NIL;
                var512 = var511.first();
                while (NIL != var511) {
                    final SubLObject var513 = var512.isString() ? f43274(var512, var191) : f43293(var512, var191);
                    var509 = (SubLObject)ConsesLow.cons(f43279(var513, var164, var191), var509);
                    var511 = var511.rest();
                    var512 = var511.first();
                }
                var509 = Sequences.nreverse(var509);
            }
            else if (NIL != module0035.f2192((SubLObject)$ic159$, var508)) {
                SubLObject var514 = var508;
                SubLObject var515 = (SubLObject)NIL;
                var515 = var514.first();
                while (NIL != var514) {
                    var509 = (SubLObject)ConsesLow.cons(f43279(var515, var164, var191), var509);
                    var514 = var514.rest();
                    var515 = var514.first();
                }
                var509 = Sequences.nreverse(var509);
            }
        }
        if (NIL != var509) {
            f43296(conses_high.second(var507), var509);
        }
        return var509;
    }
    
    public static SubLObject f43390(final SubLObject var507, final SubLObject var164, final SubLObject var191) {
        assert NIL != f43204(var507) : var507;
        SubLObject var508 = f43359(conses_high.second(var507));
        SubLObject var509 = var507;
        if (NIL != module0205.f13145((SubLObject)$ic161$, var508, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic530$, var508);
            final SubLObject var510 = module0205.f13147(module0202.f12702(var508), (SubLObject)$ic161$, (SubLObject)$ic442$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0205.f13220((SubLObject)$ic423$, var510, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var508 = var510;
            }
            PrintLow.format((SubLObject)T, (SubLObject)$ic531$, var508);
        }
        if (NIL != var508) {
            if (NIL != module0206.f13444(var508) && NIL != module0205.f13145((SubLObject)$ic345$, var508, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0205.f13145((SubLObject)$ic346$, var508, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var509 = var508;
            }
            else if (NIL != f43197(var508)) {
                final SubLObject var511 = f43279(var508, var164, var191);
                if (NIL != var511) {
                    PrintLow.format((SubLObject)T, (SubLObject)$ic450$, var507, var511);
                    var509 = var511;
                    f43296(conses_high.second(var507), var509);
                }
            }
            else {
                Errors.warn((SubLObject)$ic532$, var508);
            }
        }
        return var509;
    }
    
    public static SubLObject f43392(final SubLObject var229, final SubLObject var230) {
        f43393(var229, var230, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43110(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47098_native.class) ? T : NIL);
    }
    
    public static SubLObject f43394(final SubLObject var229) {
        assert NIL != f43110(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43395(final SubLObject var229) {
        assert NIL != f43110(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43396(final SubLObject var229) {
        assert NIL != f43110(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43397(final SubLObject var229) {
        assert NIL != f43110(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43398(final SubLObject var229) {
        assert NIL != f43110(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43399(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43110(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43400(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43110(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43401(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43110(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43402(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43110(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43403(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43110(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43404(SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = (SubLObject)NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47098_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)NIL, var235 = var233; NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)$ic144$)) {
                f43399(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic145$)) {
                f43400(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic551$)) {
                f43401(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic552$)) {
                f43402(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic148$)) {
                f43403(var234, var237);
            }
            else {
                Errors.error((SubLObject)$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43405(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)$ic150$, (SubLObject)$ic553$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic144$, f43394(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic145$, f43395(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic551$, f43396(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic552$, f43397(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic148$, f43398(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic153$, (SubLObject)$ic553$, (SubLObject)FIVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43406(final SubLObject var238, final SubLObject var239) {
        return f43405(var238, var239);
    }
    
    public static SubLObject f43393(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        PrintLow.format(var230, (SubLObject)$ic555$, f43394(var240));
        return var240;
    }
    
    public static SubLObject f43407(final SubLObject var173) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        SubLObject var175 = (SubLObject)NIL;
        if (NIL != var173 && NIL != module0107.f7629($g5548$.getDynamicValue(var174)) && NIL == var175) {
            SubLObject var176;
            SubLObject var177;
            for (var176 = (SubLObject)$ic556$, var177 = (SubLObject)NIL, var177 = var176.first(); NIL == var175 && NIL != var176; var175 = f43113(var173, var177), var176 = var176.rest(), var177 = var176.first()) {}
        }
        return (NIL != var175) ? var175 : f43408(var173, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43408(SubLObject var173, SubLObject var222) {
        if (var173 == UNPROVIDED) {
            var173 = (SubLObject)NIL;
        }
        if (var222 == UNPROVIDED) {
            var222 = (SubLObject)NIL;
        }
        final SubLObject var223 = f43404((SubLObject)UNPROVIDED);
        if (NIL != var173) {
            f43409(var223, var173);
        }
        f43410(var223, var222);
        f43403(var223, (SubLObject)NIL);
        return var223;
    }
    
    public static SubLObject f43117(final SubLObject var343) {
        assert NIL != f43110(var343) : var343;
        return f43394(var343);
    }
    
    public static SubLObject f43381(final SubLObject var343) {
        assert NIL != f43110(var343) : var343;
        return f43395(var343);
    }
    
    public static SubLObject f43382(final SubLObject var343) {
        assert NIL != f43110(var343) : var343;
        return f43396(var343);
    }
    
    public static SubLObject f43384(final SubLObject var343) {
        assert NIL != f43110(var343) : var343;
        return f43397(var343);
    }
    
    public static SubLObject f43385(final SubLObject var343) {
        assert NIL != f43110(var343) : var343;
        return f43398(var343);
    }
    
    public static SubLObject f43292(final SubLObject var343, final SubLObject var245, SubLObject var246) {
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)NIL;
        }
        return conses_high.getf(f43398(var343), var245, var246);
    }
    
    public static SubLObject f43118(final SubLObject var343, SubLObject var246) {
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)NIL;
        }
        return f43292(var343, (SubLObject)$ic156$, var246);
    }
    
    public static SubLObject f43409(final SubLObject var343, final SubLObject var11) {
        assert NIL != f43110(var343) : var343;
        assert NIL != Types.stringp(var11) : var11;
        f43399(var343, var11);
        return f43394(var343);
    }
    
    public static SubLObject f43410(final SubLObject var343, final SubLObject var222) {
        assert NIL != f43110(var343) : var343;
        if (NIL != var222 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var222)) {
            throw new AssertionError(var222);
        }
        f43400(var343, var222);
        return f43395(var343);
    }
    
    public static SubLObject f43411(final SubLObject var343, final SubLObject var514) {
        assert NIL != f43110(var343) : var343;
        assert NIL != f43197(var514) : var514;
        if (NIL == conses_high.member(var514, f43396(var343), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            f43401(var343, (SubLObject)ConsesLow.cons(var514, f43396(var343)));
        }
        return f43396(var343);
    }
    
    public static SubLObject f43412(final SubLObject var343, final SubLObject var483) {
        assert NIL != f43110(var343) : var343;
        assert NIL != f43197(var483) : var483;
        if (NIL == conses_high.member(var483, f43397(var343), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            f43402(var343, (SubLObject)ConsesLow.cons(var483, f43397(var343)));
        }
        return f43397(var343);
    }
    
    public static SubLObject f43413(final SubLObject var343, final SubLObject var245, final SubLObject var25) {
        f43403(var343, conses_high.putf(f43398(var343), var245, var25));
        return f43398(var343);
    }
    
    public static SubLObject f43414(final SubLObject var343, final SubLObject var245, final SubLObject var25) {
        assert NIL != f43110(var343) : var343;
        final SubLObject var344 = conses_high.getf(f43398(var343), var245, (SubLObject)NIL);
        final SubLObject var345 = (SubLObject)((NIL != Sequences.find(var25, var344, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? var344 : ConsesLow.cons(var25, var344));
        f43413(var343, var245, var345);
        return f43398(var343);
    }
    
    public static SubLObject f43198(final SubLObject var245) {
        if (var245.eql((SubLObject)$ic262$) || var245.eql((SubLObject)$ic267$) || var245.eql((SubLObject)$ic463$) || var245.eql((SubLObject)$ic294$) || var245.eql((SubLObject)$ic464$) || var245.eql((SubLObject)$ic325$)) {
            return (SubLObject)T;
        }
        if (var245.eql((SubLObject)$ic321$) || var245.eql((SubLObject)$ic156$) || var245.eql((SubLObject)$ic323$) || var245.eql((SubLObject)$ic479$) || var245.eql((SubLObject)$ic286$) || var245.eql((SubLObject)$ic289$)) {
            return (SubLObject)NIL;
        }
        if (var245.eql((SubLObject)$ic277$) || var245.eql((SubLObject)$ic274$)) {
            return (SubLObject)NIL;
        }
        Errors.sublisp_break((SubLObject)$ic557$, new SubLObject[] { var245 });
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43111(final SubLObject var171, final SubLObject var172) {
        final SubLObject var173 = f43117(var171);
        if (var173.isString()) {
            f43409(var172, var173);
        }
        f43410(var172, f43381(var171));
        SubLObject var174 = f43382(var171);
        SubLObject var175 = (SubLObject)NIL;
        var175 = var174.first();
        while (NIL != var174) {
            f43411(var172, var175);
            var174 = var174.rest();
            var175 = var174.first();
        }
        var174 = f43384(var171);
        SubLObject var176 = (SubLObject)NIL;
        var176 = var174.first();
        while (NIL != var174) {
            f43412(var172, var176);
            var174 = var174.rest();
            var176 = var174.first();
        }
        SubLObject var177;
        SubLObject var178;
        SubLObject var179;
        SubLObject var180;
        SubLObject var181;
        for (var177 = (SubLObject)NIL, var177 = f43385(var171); NIL != var177; var177 = conses_high.cddr(var177)) {
            var178 = var177.first();
            var179 = conses_high.cadr(var177);
            var180 = f43292(var172, var178, (SubLObject)UNPROVIDED);
            var181 = ((NIL != f43198(var178)) ? conses_high.union(var179, var180, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) : var179);
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
        final SubLObject var300 = $g5547$.currentBinding(var299);
        try {
            $g5547$.bind((SubLObject)$ic559$, var299);
            SubLObject var302;
            for (SubLObject var301 = var298; NIL != var301; var302 = (var301 = f43417(var301, var191))) {}
        }
        finally {
            $g5547$.rebind(var300, var299);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43417(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        SubLObject var302 = (SubLObject)NIL;
        while (NIL == var302 && NIL == module0035.f2012(var300)) {
            if (NIL != module0590.f36071(var301, module0699.f42535((SubLObject)$ic316$))) {
                if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic560$, $ic241$ }), var301);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                final SubLObject var303 = module0590.f36089(var301, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
                if (NIL != var303 && NIL != module0590.f36071(conses_high.second(var300), module0699.f42535((SubLObject)$ic329$))) {
                    final SubLObject var304 = f43297(var300.rest(), var191);
                    f43296(var303, var304);
                    var302 = (SubLObject)T;
                }
                else if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic561$, $ic241$ }));
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var300 = module0590.f36068(var300);
            }
            else if (NIL != module0590.f36071(var301, module0708.f43012((SubLObject)$ic317$))) {
                if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic562$, $ic241$ }), var301);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                final SubLObject var303 = module0590.f36089(var301, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
                if (NIL != var303) {
                    f43418(var300, var191);
                    var302 = (SubLObject)T;
                }
                else if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic563$, $ic241$ }));
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var300 = module0590.f36068(var300);
            }
            else if (NIL != module0590.f36071(var301, module0699.f42535((SubLObject)$ic101$)) && NIL != module0590.f36040(var301)) {
                var300 = module0590.f36061(var300, f43264(var300));
            }
            else if (NIL != f43270(var301) && NIL != module0590.f36089(var301, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED)) {
                PrintLow.format((SubLObject)T, (SubLObject)$ic564$, var301);
                f43286(var300, var191);
                var300 = module0590.f36068(var300);
            }
            else if (NIL != module0590.f36040(var301)) {
                var300 = module0590.f36068(var300);
            }
            else {
                final SubLObject var305 = f43264(var300);
                var300 = (SubLObject)((NIL != var305) ? module0590.f36061(var300, var305) : NIL);
            }
            var301 = (SubLObject)((NIL != module0035.f2013(var300)) ? var300.first() : NIL);
        }
        return var300;
    }
    
    public static SubLObject f43142(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        final SubLObject var300 = $g5547$.currentBinding(var299);
        try {
            $g5547$.bind((SubLObject)$ic84$, var299);
            SubLObject var302;
            for (SubLObject var301 = var298; NIL != var301; var302 = (var301 = f43291(var301, var191))) {}
        }
        finally {
            $g5547$.rebind(var300, var299);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43291(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        SubLObject var302 = (SubLObject)NIL;
        SubLObject var303 = (SubLObject)NIL;
        while (NIL == var303 && NIL == module0035.f2012(var300)) {
            var299.resetMultipleValues();
            final SubLObject var304 = f43419(var301, var302, var191, var300);
            final SubLObject var305 = var299.secondMultipleValue();
            final SubLObject var306 = var299.thirdMultipleValue();
            var299.resetMultipleValues();
            if (!var302.eql(var304)) {
                var302 = var304;
            }
            if (NIL != var306) {
                if (NIL == var302) {
                    if (NIL != module0708.f43006()) {
                        Errors.warn((SubLObject)$ic565$);
                    }
                }
                else if (NIL != module0035.f2012(f43382(var302)) && NIL != module0035.f2012(f43292(var302, (SubLObject)$ic325$, (SubLObject)UNPROVIDED)) && NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic566$, $ic241$ }), var302);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                if (NIL != var302 && NIL != module0708.$g5533$.getDynamicValue(var299)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic567$, $ic241$ }), new SubLObject[] { var302, f43382(var302), f43384(var302), f43292(var302, (SubLObject)$ic262$, (SubLObject)UNPROVIDED) });
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                if (NIL != var302) {
                    f43104(var302, (SubLObject)$ic84$);
                }
                var303 = (SubLObject)T;
            }
            if (NIL != module0004.f105(var305)) {
                var300 = module0590.f36061(var300, var305);
            }
            else if (var305.isString()) {
                var300 = module0590.f36061(module0590.f36062(var300, var305, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            }
            else if (var305.eql((SubLObject)$ic248$)) {
                var300 = module0590.f36068(var300);
            }
            else {
                final SubLObject var307 = f43264(var300);
                var300 = (SubLObject)((NIL != var307) ? module0590.f36061(var300, var307) : NIL);
            }
            var301 = (SubLObject)((NIL != module0035.f2013(var300)) ? var300.first() : NIL);
        }
        return Values.values(var300, var302);
    }
    
    public static SubLObject f43419(final SubLObject var299, final SubLObject var343, final SubLObject var191, final SubLObject var194) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = var343;
        SubLObject var346 = (SubLObject)NIL;
        SubLObject var347 = (SubLObject)NIL;
        if (NIL != module0590.f36056(var299, (SubLObject)$ic258$)) {
            final SubLObject var348 = module0590.f36058(var194, (SubLObject)$ic259$, (SubLObject)UNPROVIDED);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var344) && !var348.isInteger()) {
                Errors.error((SubLObject)$ic260$, module0035.f2124((SubLObject)TEN_INTEGER, var194));
            }
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic568$, $ic241$ }), module0035.f2124(module0048.f_1X(var348), var194));
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var346 = module0048.f_1X(var348);
        }
        else if (NIL != f43270(var299) && NIL != module0590.f36042(var299)) {
            var347 = (SubLObject)T;
            var346 = (SubLObject)$ic263$;
        }
        else if (NIL != f43270(var299)) {
            SubLObject var349 = (SubLObject)NIL;
            SubLObject var350 = (SubLObject)NIL;
            if (NIL == module0035.f2012(module0590.f36044(var299).rest())) {
                var344.resetMultipleValues();
                final SubLObject var518_519 = f43272(var299, var191);
                final SubLObject var520_521 = var344.secondMultipleValue();
                var344.resetMultipleValues();
                var349 = var518_519;
                var350 = var520_521;
            }
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic569$, $ic241$ }), var349);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var345 = f43407(var350);
            final SubLObject var351 = module0590.f36041(var299);
            f43414(var345, (SubLObject)$ic262$, var351);
            final SubLObject var352 = module0590.f36089(var299, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
            if (NIL != var352) {
                f43413(var345, (SubLObject)$ic321$, var352);
            }
            if (NIL != var350) {
                f43409(var345, var350);
            }
            if (NIL != var349) {
                f43413(var345, (SubLObject)$ic156$, var349);
            }
            if (NIL != module0590.f36072(var299)) {
                var347 = (SubLObject)T;
            }
            var346 = (SubLObject)$ic263$;
        }
        else if (NIL != f43268(var299)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic570$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var346 = (SubLObject)$ic248$;
        }
        else if (NIL == var343) {
            var346 = f43271(var299);
        }
        else {
            var346 = f43420(var345, var194, var191);
        }
        return Values.values(var345, var346, var347);
    }
    
    public static SubLObject f43146(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        final SubLObject var300 = $g5547$.currentBinding(var299);
        try {
            $g5547$.bind((SubLObject)$ic86$, var299);
            for (SubLObject var301 = var298; NIL != var301; var301 = f43298(var301, var191)) {}
        }
        finally {
            $g5547$.rebind(var300, var299);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43298(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        SubLObject var300 = var298;
        SubLObject var301 = var300.first();
        SubLObject var302 = (SubLObject)NIL;
        SubLObject var303 = (SubLObject)NIL;
        while (NIL == var303 && NIL == module0035.f2012(var300)) {
            var299.resetMultipleValues();
            final SubLObject var304 = f43421(var301, var302, var191, var300);
            final SubLObject var305 = var299.secondMultipleValue();
            final SubLObject var306 = var299.thirdMultipleValue();
            var299.resetMultipleValues();
            if (!var302.eql(var304)) {
                var302 = var304;
            }
            if (NIL != var306) {
                if (NIL == var302 && NIL != module0708.f43006()) {
                    Errors.warn((SubLObject)$ic571$);
                }
                if (NIL != var302) {
                    f43104(var302, (SubLObject)$ic86$);
                    if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic572$, $ic241$ }), var302);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                }
                var303 = (SubLObject)T;
            }
            if (NIL != module0004.f105(var305)) {
                var300 = module0590.f36061(var300, var305);
            }
            else if (var305.isString()) {
                var300 = module0590.f36061(module0590.f36062(var300, var305, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            }
            else if (var305.eql((SubLObject)$ic248$)) {
                var300 = module0590.f36068(var300);
            }
            else {
                final SubLObject var307 = f43264(var300);
                var300 = (SubLObject)((NIL != var307) ? module0590.f36061(var300, var307) : NIL);
            }
            var301 = (SubLObject)((NIL != module0035.f2013(var300)) ? var300.first() : NIL);
        }
        return Values.values(var300, var302);
    }
    
    public static SubLObject f43421(final SubLObject var299, final SubLObject var343, final SubLObject var191, final SubLObject var194) {
        final SubLThread var344 = SubLProcess.currentSubLThread();
        SubLObject var345 = var343;
        SubLObject var346 = (SubLObject)NIL;
        final SubLObject var347 = f43422(var299, var191);
        SubLObject var348 = (SubLObject)NIL;
        if (NIL != module0590.f36035(var299)) {
            final SubLObject var349 = module0590.f36058(var194, (SubLObject)$ic259$, (SubLObject)UNPROVIDED);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var344) && !var349.isInteger()) {
                Errors.error((SubLObject)$ic260$, module0035.f2124((SubLObject)TEN_INTEGER, var194));
            }
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic568$, $ic241$ }), module0035.f2124(module0048.f_1X(var349), var194));
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var346 = module0048.f_1X(var349);
        }
        else if (NIL != var347 && NIL != module0590.f36042(var299)) {
            var348 = (SubLObject)T;
            var346 = (SubLObject)$ic263$;
        }
        else if (NIL == var343 && NIL != var347) {
            SubLObject var350 = (SubLObject)NIL;
            SubLObject var351 = (SubLObject)NIL;
            if (NIL == module0035.f2012(module0590.f36044(var299).rest())) {
                var344.resetMultipleValues();
                final SubLObject var523_524 = f43272(var299, var191);
                final SubLObject var525_526 = var344.secondMultipleValue();
                var344.resetMultipleValues();
                var350 = var523_524;
                var351 = var525_526;
            }
            var345 = f43407(var351);
            if (NIL == module0590.f36071(var299, module0699.f42535((SubLObject)$ic316$))) {
                final SubLObject var352 = module0590.f36041(var299);
                f43414(var345, (SubLObject)$ic262$, var352);
            }
            if (NIL != var351) {
                f43409(var345, var351);
            }
            if (NIL != var350) {
                f43413(var345, (SubLObject)$ic156$, var350);
            }
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic573$, $ic241$ }), var345, module0590.f36041(var299));
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            if (NIL != module0590.f36072(var299)) {
                var348 = (SubLObject)T;
            }
            var346 = (SubLObject)$ic263$;
        }
        else if (NIL != f43268(var299)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic570$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var346 = (SubLObject)$ic248$;
        }
        else if (NIL != f43270(var299)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic570$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var346 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42535((SubLObject)$ic316$))) {
            final SubLObject var353 = module0590.f36089(var299, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
            if (NIL != var353 && NIL != module0590.f36071(conses_high.second(var194), module0699.f42535((SubLObject)$ic329$))) {
                final SubLObject var354 = f43297(var194.rest(), var191);
                f43296(var353, var354);
            }
            else if (NIL != module0708.$g5533$.getDynamicValue(var344)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic561$, $ic241$ }));
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var346 = (SubLObject)$ic248$;
        }
        else if (NIL == var343) {
            var346 = f43271(var299);
        }
        else {
            var346 = f43420(var345, var194, var191);
        }
        return Values.values(var345, var346, var348);
    }
    
    public static SubLObject f43422(final SubLObject var204, final SubLObject var191) {
        final SubLObject var205 = (SubLObject)makeBoolean(NIL != module0590.f36031(var204) && NIL == f43423(var204, var191));
        return var205;
    }
    
    public static SubLObject f43423(final SubLObject var204, final SubLObject var191) {
        if (NIL != f43270(var204)) {
            return (SubLObject)T;
        }
        if (NIL != module0590.f36071(var204, (SubLObject)$ic89$)) {
            return (SubLObject)T;
        }
        if (NIL != module0590.f36033(var204)) {
            return (SubLObject)T;
        }
        if (NIL != conses_high.member(module0590.f36041(var204), $g5563$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) && f43154(var191).isString() && NIL != module0038.f2668((SubLObject)$ic296$, f43154(var191), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0590.f36071(var204, module0699.f42535((SubLObject)$ic316$)) && NIL != module0590.f36089(var204, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        if (NIL != module0590.f36048(module0590.f36041(var204)) && NIL != f43257(module0590.f36047(module0590.f36041(var204)))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43271(final SubLObject var299) {
        final SubLThread var300 = SubLProcess.currentSubLThread();
        SubLObject var301 = (SubLObject)NIL;
        if (NIL != module0590.f36071(var299, module0708.f43012((SubLObject)$ic100$))) {
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic570$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var301 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0708.f43012((SubLObject)$ic574$))) {
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic570$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var301 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var299, module0699.f42535((SubLObject)$ic101$))) {
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic575$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var301 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36032(var299) || NIL != module0590.f36033(var299)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic575$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var301 = (SubLObject)$ic263$;
        }
        else if (NIL == module0590.f36031(var299)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic575$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var301 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36031(var299) && NIL == module0590.f36048(module0590.f36041(var299))) {
            if (NIL != Characters.lower_case_p(module0038.f2636(module0590.f36041(var299))) && NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic576$, var299);
            }
            var301 = (SubLObject)$ic248$;
        }
        else {
            if (NIL != module0708.$g5533$.getDynamicValue(var300)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic575$, $ic241$ }), var299);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var301 = (SubLObject)$ic248$;
        }
        return var301;
    }
    
    public static SubLObject f43420(final SubLObject var516, SubLObject var194, final SubLObject var191) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        SubLObject var518 = (SubLObject)$ic263$;
        final SubLObject var519 = var194.first();
        if (NIL != module0038.f2828(var519)) {
            var518 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36071(var519, module0699.f42555((SubLObject)$ic115$))) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var517) && NIL != module0590.f36072(var519)) {
                Errors.error((SubLObject)$ic265$, var519);
            }
            final SubLObject var520 = module0590.f36089(var519, f43161((SubLObject)$ic116$), (SubLObject)NIL);
            final SubLObject var521 = (NIL != var520) ? module0642.f39117(var520) : $ic117$;
            final SubLObject var522 = conses_high.second(var194);
            if (NIL != var520 && NIL == var521 && NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic266$, var520);
            }
            f43414(var516, (SubLObject)$ic267$, (SubLObject)ConsesLow.cons(var522, var521));
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0699.f42535((SubLObject)$ic264$))) {
            f43414(var516, (SubLObject)$ic262$, f43272(var519, var191));
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0699.f42555((SubLObject)$ic112$))) {
            f43410(var516, f43275(var194));
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0699.f42555((SubLObject)$ic577$)) && NIL != module0590.f36040(var519)) {
            final SubLObject var523 = f43293(var194.rest(), var191);
            if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic578$, $ic241$ }), var523);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43411(var516, var523);
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0699.f42555((SubLObject)$ic577$))) {
            f43411(var516, f43274(var519, var191));
            var518 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic579$)) && NIL != module0590.f36040(var519)) {
            f43412(var516, f43293(var194.rest(), var191));
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic579$))) {
            f43412(var516, f43168(module0590.f36089(var519, module0699.f42535((SubLObject)$ic217$), (SubLObject)UNPROVIDED)));
            var518 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36040(var519) && NIL != conses_high.member(module0590.f36041(var519), (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)$ic580$), (SubLObject)$ic581$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            final SubLObject var524 = f43293(var194.rest(), var191);
            f43414(var516, (SubLObject)$ic463$, var524);
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != conses_high.member(module0590.f36041(var519), (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)$ic580$), (SubLObject)$ic581$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            final SubLObject var524 = f43168(module0590.f36089(var519, module0699.f42535((SubLObject)$ic217$), (SubLObject)UNPROVIDED));
            f43414(var516, (SubLObject)$ic463$, var524);
            var518 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic582$)) && NIL != module0590.f36040(var519)) {
            f43413(var516, (SubLObject)$ic323$, f43293(var194.rest(), var191));
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic582$))) {
            final SubLObject var525 = f43168(module0590.f36089(var519, module0699.f42535((SubLObject)$ic217$), (SubLObject)UNPROVIDED));
            f43413(var516, (SubLObject)$ic323$, var525);
            var518 = (SubLObject)$ic263$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic583$)) && NIL == module0590.f36072(var519)) {
            SubLObject var526 = (SubLObject)NIL;
            SubLObject var527;
            SubLObject var528;
            for (var194 = var194.rest(); NIL == module0590.f36070(module0708.f43012((SubLObject)$ic583$), var194.first()); var194 = module0590.f36068(var194)) {
                var527 = (SubLObject)NIL;
                var528 = var194.first();
                if (NIL != f43270(var528) || NIL != module0590.f36071(var528, module0708.f43012((SubLObject)$ic317$))) {
                    var527 = f43293(var194, var191);
                }
                else if (NIL != module0590.f36071(var528, module0699.f42535((SubLObject)$ic316$))) {
                    var527 = f43299(var528, var191);
                }
                if (NIL != var527) {
                    if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic584$, $ic241$ }), var527);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var526 = (SubLObject)ConsesLow.cons(var527, var526);
                }
            }
            if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic585$, $ic241$ }), var526);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43413(var516, (SubLObject)$ic325$, var526);
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic583$)) && NIL != module0590.f36089(var519, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED)) {
            final SubLObject var529 = module0590.f36089(var519, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
            final SubLObject var530 = (SubLObject)ConsesLow.list((SubLObject)$ic321$, var529);
            if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic585$, $ic241$ }), var530);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43413(var516, (SubLObject)$ic325$, var530);
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic319$)) && NIL == module0590.f36072(var519)) {
            SubLObject var526 = (SubLObject)NIL;
            SubLObject var527;
            SubLObject var528;
            for (var194 = var194.rest(); NIL == module0590.f36070(module0708.f43012((SubLObject)$ic319$), var194.first()); var194 = module0590.f36068(var194)) {
                var527 = (SubLObject)NIL;
                var528 = var194.first();
                if (NIL != f43270(var528) || NIL != module0590.f36071(var528, module0708.f43012((SubLObject)$ic317$))) {
                    var527 = f43293(var194, var191);
                }
                else if (NIL != module0590.f36071(var528, module0699.f42535((SubLObject)$ic316$))) {
                    var527 = f43299(var528, var191);
                }
                if (NIL != var527) {
                    if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic586$, $ic241$ }), var527);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var526 = (SubLObject)ConsesLow.cons(var527, var526);
                }
            }
            if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic587$, $ic241$ }), var526);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43413(var516, (SubLObject)$ic464$, var526);
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36071(var519, module0708.f43012((SubLObject)$ic301$))) {
            final SubLObject var531 = f43287(var194, var191);
            f43413(var516, (SubLObject)$ic479$, var531);
            if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic588$, $ic241$ }), var531);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != f43277(var519, (SubLObject)$ic283$, var191)) {
            f43424(var516, var194);
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != f43277(var519, (SubLObject)$ic287$, var191)) {
            f43425(var516, var194);
            var518 = (SubLObject)$ic248$;
        }
        else if (NIL != module0590.f36031(var519)) {
            f43426(var516, var519, var194, var191);
            var518 = (SubLObject)$ic248$;
        }
        else {
            if (NIL != module0708.f43006()) {
                Errors.warn((SubLObject)$ic295$, var519);
            }
            var518 = (SubLObject)$ic263$;
        }
        return var518;
    }
    
    public static SubLObject f43424(final SubLObject var516, final SubLObject var194) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        final SubLObject var518 = conses_high.second(var194);
        final SubLObject var519 = f43278(var518, (SubLObject)$ic284$);
        if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic285$, $ic241$ }), var519, var516);
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        f43413(var516, (SubLObject)$ic286$, var519);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43425(final SubLObject var516, final SubLObject var194) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        final SubLObject var518 = conses_high.second(var194);
        final SubLObject var519 = f43278(var518, (SubLObject)$ic284$);
        if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic288$, $ic241$ }), var519, var516);
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        f43413(var516, (SubLObject)$ic289$, var519);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43426(final SubLObject var516, final SubLObject var299, final SubLObject var194, final SubLObject var191) {
        final SubLThread var517 = SubLProcess.currentSubLThread();
        final SubLObject var518 = module0590.f36041(var299);
        final SubLObject var519 = (SubLObject)((NIL != module0590.f36072(var299)) ? f43272(var299, var191) : NIL);
        SubLObject var520 = (SubLObject)NIL;
        if (NIL != var519) {
            var520 = f43316(var519, $ic18$, var191);
        }
        else if (NIL != module0590.f36042(conses_high.second(var194))) {
            var520 = (SubLObject)$ic94$;
        }
        else if (NIL != module0590.f36031(conses_high.second(var194))) {
            final SubLObject var521 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f43298(var194.rest(), var191));
            assert NIL != f43110(var521) : var521;
            var520 = f43292(var521, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var522 = f43168(module0590.f36089(var299, module0699.f42535((SubLObject)$ic290$), (SubLObject)UNPROVIDED));
            final SubLObject var523 = conses_high.second(var194);
            var520 = f43278(var523, var522);
        }
        if (NIL == var520) {
            Errors.warn((SubLObject)$ic589$, var299, conses_high.second(var194));
        }
        else if (NIL != f43277(var299, (SubLObject)$ic291$, var191)) {
            if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic292$, $ic241$ }), var516, var520);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43414(var516, (SubLObject)$ic262$, var520);
        }
        else {
            if (NIL != module0708.$g5533$.getDynamicValue(var517)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic293$, $ic241$ }), var518, var520);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            f43414(var516, (SubLObject)$ic294$, (SubLObject)ConsesLow.list(var518, var520));
        }
        return (SubLObject)NIL;
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
        final SubLObject var207 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic120$), (SubLObject)UNPROVIDED);
        final SubLObject var208 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic339$), (SubLObject)UNPROVIDED);
        final SubLObject var209 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
        final SubLObject var210 = module0590.f36089(var204, module0699.f42535((SubLObject)$ic217$), (SubLObject)UNPROVIDED);
        SubLObject var211 = (SubLObject)NIL;
        SubLObject var212 = (SubLObject)NIL;
        if (NIL != var207) {
            if (NIL != module0590.f36071(var204, module0699.f42535((SubLObject)$ic316$)) && (NIL != module0038.f2728(var207) || NIL != f43359(var207))) {
                var211 = (SubLObject)ConsesLow.list((SubLObject)$ic321$, var207);
            }
            else {
                var211 = f43168(var207);
            }
        }
        else if (NIL != var208) {
            var211 = f43168(var208);
        }
        else if (NIL != var209) {
            var211 = (SubLObject)ConsesLow.list((SubLObject)$ic321$, var209);
        }
        else if (NIL != var210) {
            var211 = f43168(var210);
        }
        else if (NIL != module0708.$g5533$.getDynamicValue(var205)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic590$, $ic241$ }), var204);
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        if (NIL != var211 && NIL == f43204(var211)) {
            var212 = f43428(var211, var206);
        }
        return Values.values(var211, var212);
    }
    
    public static SubLObject f43299(final SubLObject var204, final SubLObject var191) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), f43272(var204, var191));
    }
    
    public static SubLObject f43428(final SubLObject var241, final SubLObject var529) {
        final SubLObject var530 = (NIL != f43202(var241)) ? conses_high.third(var241) : var241;
        SubLObject var531 = module0038.f2842((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_period, Sequences.cconcatenate(var529, module0038.f2812(var530)));
        if (NIL != Characters.lower_case_p(module0038.f2636(var531))) {
            var531 = module0038.f2812(var531);
        }
        return var531;
    }
    
    public static SubLObject f43202(final SubLObject var240) {
        return module0062.f4492(var240, (SubLObject)$ic591$);
    }
    
    public static SubLObject f43317(final SubLObject var241, final SubLObject var164, final SubLObject var191) {
        final SubLThread var242 = SubLProcess.currentSubLThread();
        if (NIL != module0708.$g5533$.getDynamicValue(var242)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic592$, $ic241$ }));
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        SubLObject var244;
        final SubLObject var243 = var244 = var241.rest();
        SubLObject var245 = (SubLObject)NIL;
        SubLObject var246 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var244, var243, (SubLObject)$ic401$);
        var245 = var244.first();
        var244 = var244.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var244, var243, (SubLObject)$ic401$);
        var246 = var244.first();
        var244 = var244.rest();
        if (NIL == var244) {
            final SubLObject var247 = f43121(var245, var191, (SubLObject)UNPROVIDED);
            final SubLObject var248 = f43318(var246, var164, var247, var191, (SubLObject)UNPROVIDED);
            if (NIL != module0708.$g5533$.getDynamicValue(var242)) {
                PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic593$, $ic241$ }), var248);
                streams_high.force_output((SubLObject)UNPROVIDED);
            }
            return var248;
        }
        cdestructuring_bind.cdestructuring_bind_error(var243, (SubLObject)$ic401$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43293(final SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        if (NIL != module0708.$g5533$.getDynamicValue(var195)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic594$, $ic241$ }), module0035.f2124((SubLObject)FOUR_INTEGER, var194));
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        if (NIL != f43270(var196)) {
            return f43286(var194, var191);
        }
        if (NIL != module0590.f36071(var196, module0708.f43012((SubLObject)$ic317$))) {
            var195.resetMultipleValues();
            final SubLObject var197 = f43418(var194, var191);
            final SubLObject var198 = var195.secondMultipleValue();
            final SubLObject var199 = var195.thirdMultipleValue();
            final SubLObject var200 = var195.fourthMultipleValue();
            var195.resetMultipleValues();
            return (SubLObject)ConsesLow.list((SubLObject)$ic595$, var197, var198, var199, var200);
        }
        if (NIL != module0590.f36072(var196)) {
            return f43299(var196, var191);
        }
        Errors.warn((SubLObject)$ic596$, var196);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43418(final SubLObject var298, final SubLObject var191) {
        final SubLThread var299 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var299) && NIL == module0590.f36071(var298.first(), module0708.f43012((SubLObject)$ic317$))) {
            Errors.error((SubLObject)$ic597$, module0035.f2124((SubLObject)TEN_INTEGER, var298));
        }
        final SubLObject var300 = module0590.f36089(var298.first(), module0699.f42535((SubLObject)$ic311$), (SubLObject)UNPROVIDED);
        SubLObject var301 = var298;
        SubLObject var302 = (SubLObject)$ic598$;
        SubLObject var303 = (SubLObject)NIL;
        SubLObject var304 = $ic18$;
        SubLObject var305 = (SubLObject)NIL;
        SubLObject var306 = (SubLObject)NIL;
        SubLObject var307 = (SubLObject)NIL;
        while (NIL != var301 && var302 != $ic599$) {
            SubLObject var308 = (SubLObject)NIL;
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
            if (NIL != module0004.f105(var308)) {
                var301 = module0590.f36061(var301, var308);
            }
            else if (var308.isString()) {
                var301 = module0590.f36061(module0590.f36062(var301, var308, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            }
            else if (var308.eql((SubLObject)$ic248$)) {
                var301 = module0590.f36068(var301);
            }
            else {
                if (var302 == $ic599$) {
                    continue;
                }
                final SubLObject var309 = f43264(var301);
                var301 = (SubLObject)((NIL != var309) ? module0590.f36061(var301, var309) : NIL);
            }
        }
        if (NIL != module0708.$g5533$.getDynamicValue(var299)) {
            PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic600$, $ic241$ }), new SubLObject[] { var303, var305, var307, var304 });
            streams_high.force_output((SubLObject)UNPROVIDED);
        }
        if (NIL != module0038.f2611(var300)) {
            f43296(var300, (SubLObject)ConsesLow.list((SubLObject)$ic595$, var303, var305, var307, var304));
        }
        return Values.values(var303, var305, var307, var304);
    }
    
    public static SubLObject f43429(SubLObject var533, SubLObject var248, SubLObject var54, SubLObject var164, SubLObject var323, SubLObject var25, final SubLObject var194, final SubLObject var191) {
        final SubLThread var534 = SubLProcess.currentSubLThread();
        final SubLObject var535 = var194.first();
        SubLObject var536 = (SubLObject)NIL;
        if (NIL != module0590.f36071(var535, module0708.f43012((SubLObject)$ic317$)) && NIL != module0590.f36042(var535)) {
            var533 = (SubLObject)$ic599$;
        }
        else if (NIL == module0590.f36071(var535, module0708.f43012((SubLObject)$ic317$)) || NIL == module0590.f36040(var535) || NIL != var248 || NIL != var164 || NIL != var25) {
            if (NIL != module0590.f36071(var535, module0708.f43012((SubLObject)$ic601$)) && NIL != module0590.f36040(var535)) {
                if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic602$, $ic241$ }));
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var533 = (SubLObject)$ic603$;
            }
            else if (NIL != module0590.f36071(var535, module0708.f43020((SubLObject)$ic604$)) && NIL != module0590.f36040(var535)) {
                if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic605$, $ic241$ }));
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var533 = (SubLObject)$ic606$;
            }
            else if (NIL != module0590.f36071(var535, module0708.f43012((SubLObject)$ic601$)) && NIL != module0590.f36072(var535)) {
                var248 = f43272(var535, var191);
                if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic607$, $ic241$ }), var248);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var533 = (SubLObject)((NIL != var25) ? $ic599$ : $ic608$);
            }
            else if (NIL != module0590.f36071(var535, module0708.f43020((SubLObject)$ic604$)) && NIL != module0590.f36072(var535)) {
                var54 = f43272(var535, var191);
                if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic609$, $ic241$ }), var54);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var533 = (SubLObject)((NIL != var25) ? $ic599$ : $ic610$);
            }
            else if (NIL != module0590.f36071(var535, module0708.f43012((SubLObject)$ic601$)) && NIL != module0590.f36042(var535)) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && var533 != $ic603$) {
                    Errors.error((SubLObject)$ic611$);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && NIL == var248) {
                    Errors.error((SubLObject)$ic612$);
                }
                if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic607$, $ic241$ }), var248);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var533 = (SubLObject)((NIL != var25) ? $ic599$ : $ic608$);
            }
            else if (NIL != module0590.f36071(var535, module0708.f43020((SubLObject)$ic604$)) && NIL != module0590.f36042(var535)) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && var533 != $ic606$) {
                    Errors.error((SubLObject)$ic613$);
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && NIL == var54) {
                    Errors.error((SubLObject)$ic614$);
                }
                if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic609$, $ic241$ }), var54);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var533 = (SubLObject)((NIL != var25) ? $ic599$ : $ic610$);
            }
            else if (var533 == $ic603$) {
                var248 = f43430(var194, var191);
                var536 = (SubLObject)$ic248$;
            }
            else if (var533 == $ic606$) {
                var54 = f43431(var194, var191);
                var536 = (SubLObject)$ic248$;
            }
            else if (NIL != conses_high.member(module0590.f36041(var535), (SubLObject)ConsesLow.list(module0708.f43012((SubLObject)$ic497$), module0708.f43012((SubLObject)$ic499$), module0708.f43012((SubLObject)$ic501$), module0708.f43012((SubLObject)$ic505$), module0708.f43012((SubLObject)$ic503$), module0708.f43012((SubLObject)$ic508$)), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                var164 = module0590.f36041(var535);
                var323 = f43168(module0590.f36089(var535, module0699.f42535((SubLObject)$ic290$), (SubLObject)UNPROVIDED));
                if (NIL != f43202(var323)) {
                    var323 = conses_high.third(var323);
                }
                if (NIL != var323 && NIL != module0708.$g5533$.getDynamicValue(var534)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic615$, $ic241$ }), var323, var535);
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var533 = (SubLObject)$ic616$;
                if (NIL != module0590.f36072(var535)) {
                    final SubLObject var537 = f43272(var535, var191);
                    var25 = f43279(var537, $ic350$, var191);
                    if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic617$, $ic241$ }), var25, var535);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var533 = (SubLObject)((NIL != var248) ? $ic599$ : $ic618$);
                }
            }
            else if (var533 == $ic616$ && NIL != f43270(var535)) {
                final SubLObject var537 = f43286(var194, var191);
                final SubLObject var538 = f43168(module0590.f36041(var535));
                final SubLObject var539 = $g5561$.currentBinding(var534);
                try {
                    $g5561$.bind((SubLObject)T, var534);
                    final SubLObject var164_549 = f43279(var538, $ic350$, var191);
                    final SubLObject var540 = f43279(var537, var164_549, var191);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var534) && NIL == var540) {
                        Errors.error((SubLObject)$ic619$);
                    }
                    var25 = var540;
                    if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic620$, $ic241$ }), var25);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var533 = (SubLObject)$ic618$;
                }
                finally {
                    $g5561$.rebind(var539, var534);
                }
            }
            else if (var533 == $ic616$ && NIL == module0590.f36031(var535)) {
                var25 = f43278(var535, var323);
                if (NIL != var25) {
                    if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic620$, $ic241$ }), var25);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var533 = (SubLObject)$ic618$;
                }
            }
            else if (var533 == $ic616$ && (NIL != module0590.f36040(var535) || NIL != module0590.f36072(var535))) {
                final SubLObject var541 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), f43298(var194, var191));
                assert NIL != f43110(var541) : var541;
                var25 = f43292(var541, (SubLObject)$ic156$, (SubLObject)UNPROVIDED);
                if (NIL != var25) {
                    if (NIL != module0708.$g5533$.getDynamicValue(var534)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic620$, $ic241$ }), var25);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                    var533 = (SubLObject)((NIL != var248) ? $ic599$ : $ic618$);
                }
            }
        }
        return Values.values(var533, var248, var54, var164, var323, var25, var536);
    }
    
    public static SubLObject f43430(SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        final SubLObject var197 = f43274(var196, var191);
        final SubLObject var198 = $g5547$.currentBinding(var195);
        try {
            $g5547$.bind((SubLObject)$ic59$, var195);
            SubLObject var199 = (SubLObject)NIL;
            SubLObject var200 = var196;
            SubLObject var201 = (SubLObject)NIL;
            while (NIL == var201) {
                if (NIL != module0708.$g5533$.getDynamicValue(var195)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic621$, $ic241$ }), module0035.f2124((SubLObject)FOUR_INTEGER, var194));
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var195.resetMultipleValues();
                final SubLObject var202 = f43263(var200, var199, var191, var194);
                final SubLObject var203 = var195.secondMultipleValue();
                final SubLObject var204 = var195.thirdMultipleValue();
                var195.resetMultipleValues();
                var199 = var202;
                if (NIL != var204) {
                    f43104(var202, (SubLObject)$ic59$);
                    var201 = (SubLObject)T;
                    if (NIL != module0708.$g5533$.getDynamicValue(var195)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic622$, $ic241$ }), var202);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                }
                if (NIL != module0004.f105(var203)) {
                    var194 = module0590.f36061(var194, var203);
                }
                else if (var203.isString()) {
                    var194 = module0590.f36061(module0590.f36062(var194, var203, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                }
                else if (var203.eql((SubLObject)$ic248$)) {
                    var194 = module0590.f36068(var194);
                }
                else {
                    final SubLObject var205 = f43264(var194);
                    var194 = (SubLObject)((NIL != var205) ? module0590.f36061(var194, var205) : NIL);
                }
                var200 = var194.first();
            }
        }
        finally {
            $g5547$.rebind(var198, var195);
        }
        return var197;
    }
    
    public static SubLObject f43431(SubLObject var194, final SubLObject var191) {
        final SubLThread var195 = SubLProcess.currentSubLThread();
        final SubLObject var196 = var194.first();
        final SubLObject var197 = f43274(var196, var191);
        final SubLObject var198 = $g5547$.currentBinding(var195);
        try {
            $g5547$.bind((SubLObject)$ic84$, var195);
            SubLObject var199 = (SubLObject)NIL;
            SubLObject var200 = var196;
            SubLObject var201 = (SubLObject)NIL;
            while (NIL == var201) {
                if (NIL != module0708.$g5533$.getDynamicValue(var195)) {
                    PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic623$, $ic241$ }), module0035.f2124((SubLObject)FOUR_INTEGER, var194));
                    streams_high.force_output((SubLObject)UNPROVIDED);
                }
                var195.resetMultipleValues();
                final SubLObject var202 = f43419(var200, var199, var191, var194);
                final SubLObject var203 = var195.secondMultipleValue();
                final SubLObject var204 = var195.thirdMultipleValue();
                var195.resetMultipleValues();
                var199 = var202;
                if (NIL != var204) {
                    f43104(var202, (SubLObject)$ic84$);
                    var201 = (SubLObject)T;
                    if (NIL != module0708.$g5533$.getDynamicValue(var195)) {
                        PrintLow.format((SubLObject)T, Sequences.cconcatenate((SubLObject)$ic239$, new SubLObject[] { $ic622$, $ic241$ }), var202);
                        streams_high.force_output((SubLObject)UNPROVIDED);
                    }
                }
                if (NIL != module0004.f105(var203)) {
                    var194 = module0590.f36061(var194, var203);
                }
                else if (var203.isString()) {
                    var194 = module0590.f36061(module0590.f36062(var194, var203, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
                }
                else if (var203.eql((SubLObject)$ic248$)) {
                    var194 = module0590.f36068(var194);
                }
                else {
                    final SubLObject var205 = f43264(var194);
                    var194 = (SubLObject)((NIL != var205) ? module0590.f36061(var194, var205) : NIL);
                }
                var200 = var194.first();
            }
        }
        finally {
            $g5547$.rebind(var198, var195);
        }
        return var197;
    }
    
    public static SubLObject f43278(final SubLObject var204, final SubLObject var323) {
        final SubLObject var324 = (NIL != f43202(var323)) ? conses_high.third(var323) : var323;
        final SubLObject var325 = module0038.f2735(var204);
        SubLObject var326 = (SubLObject)NIL;
        if (NIL != Guids.guid_string_p(var325)) {
            return var325;
        }
        if (NIL != conses_high.member(var324, $g5575$.getGlobalValue(), (SubLObject)EQUALP, (SubLObject)UNPROVIDED) || NIL == var324) {
            final SubLObject var327 = (SubLObject)NIL;
            final SubLObject var328 = (SubLObject)(var327.isNumber() ? NIL : reader.read_from_string_ignoring_errors(var325, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            final SubLObject var329 = (SubLObject)(var327.isNumber() ? var327 : (var328.isNumber() ? var328 : NIL));
            if (NIL != var324 && NIL == var329) {
                Errors.warn((SubLObject)$ic625$, var204, var324);
            }
            var326 = ((NIL != var329) ? var329 : var204);
        }
        else {
            if (var324.equalp((SubLObject)$ic284$)) {
                return var204;
            }
            if (var324.equalp((SubLObject)$ic626$)) {
                if (NIL != module0004.f104(var325, (SubLObject)$ic627$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                    var326 = $ic628$;
                }
                else if (NIL != module0004.f104(var325, (SubLObject)$ic629$, Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED)) {
                    var326 = $ic630$;
                }
                else {
                    Errors.warn((SubLObject)$ic631$, var204);
                }
            }
            else if (var324.equalp((SubLObject)$ic632$)) {
                final SubLObject var330 = module0612.f37548(var325, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var331 = Sequences.length(var330);
                if (var331.eql((SubLObject)ONE_INTEGER)) {
                    var326 = module0035.f2113(var330);
                }
                else if (var331.eql((SubLObject)ZERO_INTEGER)) {
                    Errors.warn((SubLObject)$ic633$, var204);
                }
                else {
                    final SubLObject var332 = module0035.f2109($ic634$, var330, Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic635$);
                    if (NIL != module0035.f1997(var332)) {
                        var326 = module0035.f2113(var332);
                    }
                    else {
                        Errors.warn((SubLObject)$ic636$, var204, var330);
                    }
                }
            }
            else {
                Errors.warn((SubLObject)$ic637$, var204, var324);
            }
        }
        return var326;
    }
    
    public static SubLObject f43432() {
        final SubLObject var193 = $g5576$.getGlobalValue();
        if (NIL != var193) {
            module0034.f1818(var193);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43433(final SubLObject var326) {
        return module0034.f1829($g5576$.getGlobalValue(), (SubLObject)ConsesLow.list(var326), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43434(final SubLObject var326) {
        return Sequences.cconcatenate((SubLObject)$ic639$, var326);
    }
    
    public static SubLObject f43161(final SubLObject var326) {
        SubLObject var327 = $g5576$.getGlobalValue();
        if (NIL == var327) {
            var327 = module0034.f1934((SubLObject)$ic638$, (SubLObject)$ic640$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var328 = module0034.f1814(var327, var326, (SubLObject)$ic15$);
        if (var328 == $ic15$) {
            var328 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f43434(var326)));
            module0034.f1816(var327, var326, var328, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var328);
    }
    
    public static SubLObject f43435(final SubLObject var229, final SubLObject var230) {
        f43436(var229, var230, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43437(final SubLObject var229) {
        return (SubLObject)((var229.getClass() == $sX47100_native.class) ? T : NIL);
    }
    
    public static SubLObject f43438(final SubLObject var229) {
        assert NIL != f43437(var229) : var229;
        return var229.getField2();
    }
    
    public static SubLObject f43439(final SubLObject var229) {
        assert NIL != f43437(var229) : var229;
        return var229.getField3();
    }
    
    public static SubLObject f43440(final SubLObject var229) {
        assert NIL != f43437(var229) : var229;
        return var229.getField4();
    }
    
    public static SubLObject f43441(final SubLObject var229) {
        assert NIL != f43437(var229) : var229;
        return var229.getField5();
    }
    
    public static SubLObject f43442(final SubLObject var229) {
        assert NIL != f43437(var229) : var229;
        return var229.getField6();
    }
    
    public static SubLObject f43443(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43437(var229) : var229;
        return var229.setField2(var232);
    }
    
    public static SubLObject f43444(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43437(var229) : var229;
        return var229.setField3(var232);
    }
    
    public static SubLObject f43445(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43437(var229) : var229;
        return var229.setField4(var232);
    }
    
    public static SubLObject f43446(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43437(var229) : var229;
        return var229.setField5(var232);
    }
    
    public static SubLObject f43447(final SubLObject var229, final SubLObject var232) {
        assert NIL != f43437(var229) : var229;
        return var229.setField6(var232);
    }
    
    public static SubLObject f43448(SubLObject var233) {
        if (var233 == UNPROVIDED) {
            var233 = (SubLObject)NIL;
        }
        final SubLObject var234 = (SubLObject)new $sX47100_native();
        SubLObject var235;
        SubLObject var236;
        SubLObject var237;
        SubLObject var238;
        for (var235 = (SubLObject)NIL, var235 = var233; NIL != var235; var235 = conses_high.cddr(var235)) {
            var236 = var235.first();
            var237 = conses_high.cadr(var235);
            var238 = var236;
            if (var238.eql((SubLObject)$ic660$)) {
                f43443(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic661$)) {
                f43444(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic662$)) {
                f43445(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic663$)) {
                f43446(var234, var237);
            }
            else if (var238.eql((SubLObject)$ic664$)) {
                f43447(var234, var237);
            }
            else {
                Errors.error((SubLObject)$ic149$, var236);
            }
        }
        return var234;
    }
    
    public static SubLObject f43449(final SubLObject var238, final SubLObject var239) {
        Functions.funcall(var239, var238, (SubLObject)$ic150$, (SubLObject)$ic665$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic660$, f43438(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic661$, f43439(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic662$, f43440(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic663$, f43441(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic152$, (SubLObject)$ic664$, f43442(var238));
        Functions.funcall(var239, var238, (SubLObject)$ic153$, (SubLObject)$ic665$, (SubLObject)FIVE_INTEGER);
        return var238;
    }
    
    public static SubLObject f43450(final SubLObject var238, final SubLObject var239) {
        return f43449(var238, var239);
    }
    
    public static SubLObject f43436(final SubLObject var240, final SubLObject var230, final SubLObject var57) {
        PrintLow.format(var230, (SubLObject)$ic667$, f43438(var240));
        return var240;
    }
    
    public static SubLObject f43451() {
        final SubLObject var560 = f43448((SubLObject)UNPROVIDED);
        final SubLObject var561 = module0065.f4746(f43452());
        f43443(var560, var561);
        module0065.f4753(f43452(), var561, var560);
        return var560;
    }
    
    public static SubLObject f43453(final SubLObject var560) {
        assert NIL != f43437(var560) : var560;
        return f43438(var560);
    }
    
    public static SubLObject f43454(final SubLObject var560) {
        assert NIL != f43437(var560) : var560;
        return f43439(var560);
    }
    
    public static SubLObject f43455(final SubLObject var560) {
        assert NIL != f43437(var560) : var560;
        return f43440(var560);
    }
    
    public static SubLObject f43456(final SubLObject var560) {
        assert NIL != f43437(var560) : var560;
        return f43441(var560);
    }
    
    public static SubLObject f43457(final SubLObject var560) {
        assert NIL != f43437(var560) : var560;
        return f43442(var560);
    }
    
    public static SubLObject f43458(final SubLObject var240) {
        return f43459(var240);
    }
    
    public static SubLObject f43459(final SubLObject var560) {
        return Sxhash.sxhash(f43438(var560));
    }
    
    public static SubLObject f43460(final SubLObject var177, final SubLObject var178, SubLObject var179, SubLObject var180, SubLObject var183, SubLObject var184, SubLObject var181, SubLObject var182) {
        if (var179 == UNPROVIDED) {
            var179 = var177;
        }
        if (var180 == UNPROVIDED) {
            var180 = (SubLObject)NIL;
        }
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        if (var184 == UNPROVIDED) {
            var184 = (SubLObject)NIL;
        }
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)NIL;
        }
        if (var182 == UNPROVIDED) {
            var182 = module0111.$g1405$.getDynamicValue();
        }
        return f43461(module0035.f2333((SubLObject)$ic670$, (SubLObject)ConsesLow.list(var177, var178, var179, var180, var183, var184, var181, var182)));
    }
    
    public static SubLObject f43461(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        SubLObject var187 = conses_high.getf(var185, (SubLObject)$ic63$, (SubLObject)UNPROVIDED);
        final SubLObject var188 = conses_high.getf(var185, (SubLObject)$ic64$, (SubLObject)UNPROVIDED);
        final SubLObject var189 = conses_high.getf(var185, (SubLObject)$ic65$, (SubLObject)UNPROVIDED);
        final SubLObject var190 = conses_high.getf(var185, (SubLObject)$ic66$, (SubLObject)UNPROVIDED);
        SubLObject var191 = conses_high.getf(var185, (SubLObject)$ic67$, (SubLObject)UNPROVIDED);
        SubLObject var192 = conses_high.getf(var185, (SubLObject)$ic68$, (SubLObject)UNPROVIDED);
        final SubLObject var193 = conses_high.getf(var185, (SubLObject)$ic71$, (SubLObject)UNPROVIDED);
        final SubLObject var194 = conses_high.getf(var185, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
        SubLObject var195 = conses_high.getf(var185, (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
        SubLObject var196 = conses_high.getf(var185, (SubLObject)$ic70$, (SubLObject)UNPROVIDED);
        if (NIL == var196) {
            var196 = module0111.$g1405$.getDynamicValue(var186);
        }
        var187 = module0038.f2711(var187, (SubLObject)Characters.CHAR_hash);
        if (NIL == var192) {
            var192 = f43121(var187, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var195) {
            var195 = f43122(var192, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0038.f2611(var191)) {
            var191 = var187;
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var186) && NIL == module0589.f35907(var191, (SubLObject)UNPROVIDED) && NIL == module0075.f5218(var191)) {
            Errors.error((SubLObject)$ic73$);
        }
        final SubLObject var197 = module0111.$g1405$.currentBinding(var186);
        try {
            module0111.$g1405$.bind((SubLObject)NIL, var186);
            module0574.f35153(var196);
            module0543.f33621();
        }
        finally {
            module0111.$g1405$.rebind(var197, var186);
        }
        assert NIL != module0589.f35907(var187, (SubLObject)UNPROVIDED) : var187;
        final SubLObject var198 = f43451();
        module0059.f4332((SubLObject)$ic671$, (SubLObject)$ic672$, (SubLObject)ConsesLow.list(module0035.f2333((SubLObject)$ic673$, (SubLObject)ConsesLow.list(new SubLObject[] { var198, var187, var189, var190, var188, var191, var192, var195, var196, var193, var194 }))));
        return f43453(var198);
    }
    
    public static SubLObject f43462(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        final SubLObject var564 = (SubLObject)((NIL != var563) ? f43456(var563) : NIL);
        return (SubLObject)((NIL != var564) ? f43137(var564) : NIL);
    }
    
    public static SubLObject f43464(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        return (SubLObject)((NIL != var563) ? conses_high.copy_list(f43454(var563)) : NIL);
    }
    
    public static SubLObject f43465(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        return (SubLObject)((NIL != var563) ? conses_high.copy_list(f43455(var563)) : NIL);
    }
    
    public static SubLObject f43466(final SubLObject var562) {
        final SubLObject var563 = f43463(var562);
        return Equality.eql(f43454(var563).first(), (SubLObject)$ic599$);
    }
    
    public static SubLObject f43467(final SubLObject var562) {
        return module0035.sublisp_boolean(f43463(var562));
    }
    
    public static SubLObject f43452() {
        if (NIL == module0065.f4719($g5578$.getGlobalValue())) {
            $g5578$.setGlobalValue(module0065.f4745((SubLObject)$ic111$, (SubLObject)ZERO_INTEGER));
        }
        return $g5578$.getGlobalValue();
    }
    
    public static SubLObject f43463(final SubLObject var561) {
        return module0065.f4750(f43452(), var561, (SubLObject)NIL);
    }
    
    public static SubLObject f43126(final SubLObject var191) {
        final SubLThread var192 = SubLProcess.currentSubLThread();
        if (NIL != $g5540$.getDynamicValue(var192)) {
            f43446($g5540$.getDynamicValue(var192), var191);
        }
        return var191;
    }
    
    public static SubLObject f43284(final SubLObject var332) {
        final SubLThread var333 = SubLProcess.currentSubLThread();
        if (NIL != $g5540$.getDynamicValue(var333)) {
            final SubLObject var334 = f43454($g5540$.getDynamicValue(var333)).first();
            final SubLObject var335 = var334.first();
            ConsesLow.set_nth((SubLObject)ONE_INTEGER, var334, var332);
            ConsesLow.set_nth((SubLObject)TWO_INTEGER, var334, module0004.f102(var335, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43282() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != $g5540$.getDynamicValue(var2)) {
            f43444($g5540$.getDynamicValue(var2), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Time.get_universal_time(), (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), f43439($g5540$.getDynamicValue(var2))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43285() {
        f43284((SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43132() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (NIL != $g5540$.getDynamicValue(var2)) {
            f43444($g5540$.getDynamicValue(var2), (SubLObject)ConsesLow.cons((SubLObject)$ic599$, f43439($g5540$.getDynamicValue(var2))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43369(final SubLObject var167, final SubLObject var202) {
        final SubLThread var203 = SubLProcess.currentSubLThread();
        if (NIL != $g5540$.getDynamicValue(var203)) {
            f43445($g5540$.getDynamicValue(var203), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var167, var202), f43440($g5540$.getDynamicValue(var203))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43468(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        final SubLObject var187 = conses_high.getf(var185, (SubLObject)$ic675$, (SubLObject)UNPROVIDED);
        f43447(var187, Threads.current_process());
        final SubLObject var188 = $g5540$.currentBinding(var186);
        final SubLObject var189 = module0012.$silent_progressP$.currentBinding(var186);
        try {
            $g5540$.bind(var187, var186);
            module0012.$silent_progressP$.bind((SubLObject)T, var186);
            f43120(var185);
        }
        finally {
            module0012.$silent_progressP$.rebind(var189, var186);
            $g5540$.rebind(var188, var186);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43470() {
        $g5539$ = SubLFiles.deflexical("S#47505", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g5539$.getGlobalValue() : NIL));
        $g5540$ = SubLFiles.defparameter("S#47506", (SubLObject)NIL);
        $g5541$ = SubLFiles.deflexical("S#47507", $ic36$);
        $g5542$ = SubLFiles.deflexical("S#47508", (SubLObject)$ic51$);
        $g5543$ = SubLFiles.deflexical("S#47509", (SubLObject)$ic52$);
        $g5544$ = SubLFiles.deflexical("S#47510", (SubLObject)$ic53$);
        $g5545$ = SubLFiles.deflexical("S#47511", (SubLObject)$ic54$);
        $g5546$ = SubLFiles.defparameter("S#47512", (SubLObject)$ic55$);
        $g5547$ = SubLFiles.defparameter("S#47513", (SubLObject)NIL);
        $g5548$ = SubLFiles.defparameter("S#47514", module0107.f7627());
        $g5549$ = SubLFiles.defparameter("S#47515", (SubLObject)NIL);
        $g5550$ = SubLFiles.defparameter("S#47516", (SubLObject)NIL);
        $g5551$ = SubLFiles.deflexical("S#47517", (SubLObject)NIL);
        $g5552$ = SubLFiles.deflexical("S#47518", (SubLObject)$ic88$);
        $g5553$ = SubLFiles.deflexical("S#47519", (SubLObject)NIL);
        $g5554$ = SubLFiles.defconstant("S#47520", (SubLObject)$ic125$);
        $g5555$ = SubLFiles.defconstant("S#47521", (SubLObject)$ic169$);
        $g5556$ = SubLFiles.deflexical("S#47522", (SubLObject)$ic225$);
        $g5557$ = SubLFiles.deflexical("S#47523", (SubLObject)NIL);
        $g5558$ = SubLFiles.deflexical("S#47524", (SubLObject)NIL);
        $g5559$ = SubLFiles.defparameter("S#47525", module0107.f7627());
        $g5560$ = SubLFiles.deflexical("S#47526", (SubLObject)NIL);
        $g5561$ = SubLFiles.defparameter("S#47527", (SubLObject)NIL);
        $g5562$ = SubLFiles.defparameter("S#47528", (SubLObject)NIL);
        $g5563$ = SubLFiles.deflexical("S#47529", (SubLObject)$ic393$);
        $g5564$ = SubLFiles.deflexical("S#47530", module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g5565$ = SubLFiles.deflexical("S#47531", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic419$)) ? $g5565$.getGlobalValue() : NIL));
        $g5566$ = SubLFiles.deflexical("S#47532", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic420$)) ? $g5566$.getGlobalValue() : NIL));
        $g5567$ = SubLFiles.deflexical("S#47533", (SubLObject)Characters.CHAR_vertical);
        $g5568$ = SubLFiles.deflexical("S#47534", (SubLObject)Characters.CHAR_exclamation);
        $g5569$ = SubLFiles.deflexical("S#47535", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic421$)) ? $g5569$.getGlobalValue() : NIL));
        $g5570$ = SubLFiles.deflexical("S#47536", (SubLObject)NIL);
        $g5571$ = SubLFiles.defparameter("S#47537", (SubLObject)NIL);
        $g5572$ = SubLFiles.deflexical("S#47538", (SubLObject)ConsesLow.list(reader.bq_cons(module0708.f43012((SubLObject)$ic497$), (SubLObject)$ic510$), reader.bq_cons(module0708.f43012((SubLObject)$ic499$), (SubLObject)$ic511$), reader.bq_cons(module0708.f43012((SubLObject)$ic501$), (SubLObject)$ic512$), reader.bq_cons(module0708.f43012((SubLObject)$ic505$), (SubLObject)$ic513$), reader.bq_cons(module0708.f43012((SubLObject)$ic508$), (SubLObject)$ic514$), reader.bq_cons(module0708.f43012((SubLObject)$ic503$), (SubLObject)$ic515$)));
        $g5573$ = SubLFiles.defparameter("S#47539", (SubLObject)ZERO_INTEGER);
        $g5574$ = SubLFiles.defconstant("S#47540", (SubLObject)$ic533$);
        $g5575$ = SubLFiles.deflexical("S#47541", (SubLObject)$ic624$);
        $g5576$ = SubLFiles.deflexical("S#47542", (SubLObject)NIL);
        $g5577$ = SubLFiles.defconstant("S#47543", (SubLObject)$ic641$);
        $g5578$ = SubLFiles.deflexical("S#47544", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic674$)) ? $g5578$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43471() {
        module0003.f57((SubLObject)$ic0$);
        $g5539$.setGlobalValue((SubLObject)$ic2$);
        module0034.f1895((SubLObject)$ic10$);
        module0034.f1895((SubLObject)$ic39$);
        module0034.f1895((SubLObject)$ic45$);
        module0034.f1895((SubLObject)$ic46$);
        module0002.f38((SubLObject)$ic61$);
        module0034.f1909((SubLObject)$ic77$);
        module0034.f1909((SubLObject)$ic106$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5554$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic132$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic133$);
        Structures.def_csetf((SubLObject)$ic134$, (SubLObject)$ic135$);
        Structures.def_csetf((SubLObject)$ic136$, (SubLObject)$ic137$);
        Structures.def_csetf((SubLObject)$ic138$, (SubLObject)$ic139$);
        Structures.def_csetf((SubLObject)$ic140$, (SubLObject)$ic141$);
        Structures.def_csetf((SubLObject)$ic142$, (SubLObject)$ic143$);
        Equality.identity((SubLObject)$ic125$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5554$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic154$));
        module0012.f419((SubLObject)$ic131$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5554$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic168$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5555$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic176$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic177$);
        Structures.def_csetf((SubLObject)$ic178$, (SubLObject)$ic179$);
        Structures.def_csetf((SubLObject)$ic180$, (SubLObject)$ic181$);
        Structures.def_csetf((SubLObject)$ic182$, (SubLObject)$ic183$);
        Structures.def_csetf((SubLObject)$ic184$, (SubLObject)$ic185$);
        Structures.def_csetf((SubLObject)$ic186$, (SubLObject)$ic187$);
        Structures.def_csetf((SubLObject)$ic188$, (SubLObject)$ic189$);
        Structures.def_csetf((SubLObject)$ic190$, (SubLObject)$ic191$);
        Structures.def_csetf((SubLObject)$ic192$, (SubLObject)$ic193$);
        Structures.def_csetf((SubLObject)$ic194$, (SubLObject)$ic195$);
        Structures.def_csetf((SubLObject)$ic196$, (SubLObject)$ic197$);
        Structures.def_csetf((SubLObject)$ic198$, (SubLObject)$ic199$);
        Structures.def_csetf((SubLObject)$ic200$, (SubLObject)$ic201$);
        Equality.identity((SubLObject)$ic169$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5555$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic207$));
        module0012.f419((SubLObject)$ic175$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5555$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic216$));
        module0034.f1909((SubLObject)$ic230$);
        module0034.f1909((SubLObject)$ic250$);
        module0034.f1909((SubLObject)$ic305$);
        module0034.f1895((SubLObject)$ic341$);
        module0034.f1895((SubLObject)$ic356$);
        module0034.f1895((SubLObject)$ic363$);
        module0034.f1895((SubLObject)$ic373$);
        module0003.f57((SubLObject)$ic419$);
        module0003.f57((SubLObject)$ic420$);
        module0003.f57((SubLObject)$ic421$);
        module0034.f1909((SubLObject)$ic449$);
        module0034.f1895((SubLObject)$ic452$);
        module0034.f1895((SubLObject)$ic520$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5574$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic539$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic540$);
        Structures.def_csetf((SubLObject)$ic541$, (SubLObject)$ic542$);
        Structures.def_csetf((SubLObject)$ic543$, (SubLObject)$ic544$);
        Structures.def_csetf((SubLObject)$ic545$, (SubLObject)$ic546$);
        Structures.def_csetf((SubLObject)$ic547$, (SubLObject)$ic548$);
        Structures.def_csetf((SubLObject)$ic549$, (SubLObject)$ic550$);
        Equality.identity((SubLObject)$ic533$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5574$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic554$));
        module0012.f419((SubLObject)$ic538$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5574$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic558$));
        module0034.f1909((SubLObject)$ic638$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5577$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic648$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic649$);
        Structures.def_csetf((SubLObject)$ic650$, (SubLObject)$ic651$);
        Structures.def_csetf((SubLObject)$ic652$, (SubLObject)$ic653$);
        Structures.def_csetf((SubLObject)$ic654$, (SubLObject)$ic655$);
        Structures.def_csetf((SubLObject)$ic656$, (SubLObject)$ic657$);
        Structures.def_csetf((SubLObject)$ic658$, (SubLObject)$ic659$);
        Equality.identity((SubLObject)$ic641$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5577$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic666$));
        module0012.f419((SubLObject)$ic647$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5577$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic668$));
        module0002.f38((SubLObject)$ic669$);
        module0003.f57((SubLObject)$ic674$);
        return (SubLObject)NIL;
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
        $g5539$ = null;
        $g5540$ = null;
        $g5541$ = null;
        $g5542$ = null;
        $g5543$ = null;
        $g5544$ = null;
        $g5545$ = null;
        $g5546$ = null;
        $g5547$ = null;
        $g5548$ = null;
        $g5549$ = null;
        $g5550$ = null;
        $g5551$ = null;
        $g5552$ = null;
        $g5553$ = null;
        $g5554$ = null;
        $g5555$ = null;
        $g5556$ = null;
        $g5557$ = null;
        $g5558$ = null;
        $g5559$ = null;
        $g5560$ = null;
        $g5561$ = null;
        $g5562$ = null;
        $g5563$ = null;
        $g5564$ = null;
        $g5565$ = null;
        $g5566$ = null;
        $g5567$ = null;
        $g5568$ = null;
        $g5569$ = null;
        $g5570$ = null;
        $g5571$ = null;
        $g5572$ = null;
        $g5573$ = null;
        $g5574$ = null;
        $g5575$ = null;
        $g5576$ = null;
        $g5577$ = null;
        $g5578$ = null;
        $ic0$ = makeSymbol("S#47505", "CYC");
        $ic1$ = makeSymbol("DIGIT-CHAR-P");
        $ic2$ = makeString("$Revision: 138034 $");
        $ic3$ = makeSymbol("HL-TERM-P");
        $ic4$ = makeSymbol("S#3298", "CYC");
        $ic5$ = makeInteger(255);
        $ic6$ = makeInteger(100);
        $ic7$ = makeSymbol(">");
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("OWLOntologyQuery-GetRootClasses"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("synonymousExternalConcept"));
        $ic10$ = makeSymbol("S#47110", "CYC");
        $ic11$ = makeSymbol("S#12274", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic13$ = makeKeyword("GAF");
        $ic14$ = constant_handles_oc.f8479((SubLObject)makeString("owl:Ontology"));
        $ic15$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("owl:imports"));
        $ic17$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic19$ = makeString("Can't find path from ~S to #$Thing.");
        $ic20$ = makeSymbol("COLLECTION-P");
        $ic21$ = makeKeyword("BREADTH");
        $ic22$ = makeKeyword("QUEUE");
        $ic23$ = makeKeyword("STACK");
        $ic24$ = makeSymbol("S#11450", "CYC");
        $ic25$ = makeKeyword("ERROR");
        $ic26$ = makeString("~A is not a ~A");
        $ic27$ = makeSymbol("S#11592", "CYC");
        $ic28$ = makeKeyword("CERROR");
        $ic29$ = makeString("continue anyway");
        $ic30$ = makeKeyword("WARN");
        $ic31$ = makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic32$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic33$ = makeString("~A is neither SET-P nor LISTP.");
        $ic34$ = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic35$ = makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("OWLMappingMt"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("coExtensional"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic39$ = makeSymbol("S#47127", "CYC");
        $ic40$ = makeSymbol("S#17581", "CYC");
        $ic41$ = makeSymbol("S#12275", "CYC");
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic43$ = makeSymbol("S#12280", "CYC");
        $ic44$ = makeSymbol("S#12278", "CYC");
        $ic45$ = makeSymbol("S#47131", "CYC");
        $ic46$ = makeSymbol("S#47133", "CYC");
        $ic47$ = makeKeyword("UP");
        $ic48$ = makeString("Of");
        $ic49$ = makeKeyword("COLLECTION");
        $ic50$ = makeKeyword("PREDICATE");
        $ic51$ = ConsesLow.list(new SubLObject[] { makeString("UnknownOrganization"), makeString("FinancialOrganization"), makeString("GovernmentalOrganization"), makeString("EducationResearchOrganization"), makeString("MilitaryOrganization"), makeString("Organization"), makeString("NGO"), makeString("PoliticalOrganization"), makeString("ReligiousOrganization"), makeString("ResidentialBuilding"), makeString("EmbassyBuilding"), makeString("MinistryBuilding"), makeString("ShoppingMall"), makeString("Road"), makeString("Bridge"), makeString("Hospital"), makeString("TrainingCamp"), makeString("Park"), makeString("ReligousFacility"), makeString("Stadium"), makeString("OfficeBuilding"), makeString("IndustrialFacility"), makeString("EducationalInstitution"), makeString("CivicStructure"), makeString("Airport"), makeString("Hideout"), makeString("Kidnapping"), makeString("Arrest"), makeString("HostageTaking"), makeString("Uncovering"), makeString("Sneaking"), makeString("FailedTerrorPlot"), makeString("Assasination"), makeString("Execution"), makeString("ConflictEvent"), makeString("TerroristAttack"), makeString("Killing"), makeString("CoupAttempt"), makeString("Bombing"), makeString("CitizenPeopleGroup"), makeString("CivilianPeopleGroup"), makeString("Agent"), makeString("Event"), makeString("MinistryOfCulture"), makeString("Ministry"), makeString("Location"), makeString("Insurgent"), makeString("Citizen"), makeString("CivilianPerson"), makeString("HighSchool"), makeString("University"), makeString("Funeral"), makeString("Wedding"), makeString("CivilianEvent"), makeString("UnknownPeopleGroup"), makeString("PeopleGroup"), makeString("MilitaryEvent"), makeString("GovernmentalEvent"), makeString("SocioReligousEvent"), makeString("BookOrManifesto"), makeString("Bank"), makeString("Company"), makeString("CapitalCity"), makeString("City"), makeString("GeneralElection"), makeString("repeatingEvent"), makeString("Election"), makeString("Synagogue"), makeString("Mosque"), makeString("Church"), makeString("Temple"), makeString("departureLocation"), makeString("GeopoliticalLocation"), makeString("destination"), makeString("UnknownPerson"), makeString("GovernmentalPerson"), makeString("Person"), makeString("affiliatedWith"), makeString("PowerPlant"), makeString("NavalFacility"), makeString("NuclearFacility"), makeString("SuicideBombing"), makeString("Anniversary"), makeString("Group"), makeString("numberOfGrupMembers"), makeString("PoliticalParty"), makeString("TerroristOrganization"), makeString("State"), makeString("Country"), makeString("Province"), makeString("InsurgentPeopleGroup"), makeString("GovernmentalPeopleGroup"), makeString("Embassy"), makeString("MilitaryPerson"), makeString("War"), makeString("MilitaryPeopleGroup"), makeString("hasSpokesman"), makeString("isSpokesmanFor"), makeString("hasMember"), makeString("ideologistFor"), makeString("hasIdeologist"), makeString("husbandOf"), makeString("spouseOf"), makeString("wifeOf"), makeString("hasSubevent"), makeString("cityInCountry"), makeString("hasCity"), makeString("presentAt"), makeString("hasAttendant"), makeString("hasFollower"), makeString("followerOf"), makeString("chiefOf"), makeString("hasChief"), makeString("leaderOf"), makeString("memberOf"), makeString("hasDirector"), makeString("directorOf"), makeString("provinceInCountry"), makeString("hasProvince"), makeString("acquiredNationality"), makeString("victimOf"), makeString("hasVictim"), makeString("isPressSecretaryFor"), makeString("hasPressSecretary"), makeString("cousinOf"), makeString("familyRelativeOf"), makeString("subEventOf"), makeString("hasActor"), makeString("isActorOf"), makeString("hasChairman"), makeString("hasLeader"), makeString("isChairmanOf"), makeString("organizerOf"), makeString("organizedBy"), makeString("capitalCityInCountry"), makeString("hasCapitalCity"), makeString("childOf"), makeString("parentOf"), makeString("hasMilitant"), makeString("militantOf"), makeString("countryInState"), makeString("stateInCountry"), makeString("isPrimeMiniterOf"), makeString("hasPrimeMinister"), makeString("contactedBy"), makeString("contacts"), makeString("placeOfBirth"), makeString("residesIn"), makeString("killedAt"), makeString("hasPeopleKilled"), makeString("financedBy"), makeString("financierOf"), makeString("hasWounded"), makeString("woundedAt"), makeString("hasState"), makeString("isTargetOf"), makeString("hasTarget"), makeString("founderOf"), makeString("foundedBy"), makeString("arrestedAt"), makeString("hasPeopleArrested"), makeString("hasAuthor"), makeString("authorOf"), makeString("hasLocation"), makeString("locatedIn"), makeString("funderOf"), makeString("fundedBy"), makeString("isEventLocation"), makeString("locationOfEvent"), makeString("bornNationality"), makeString("employeeOf"), makeString("hasEmployee"), makeString("hasSuborganization"), makeString("subOrganizationOf"), makeString("happensAtPlace"), makeString("hasPart"), makeString("isPartOf"), makeString("contents"), makeString("startDateOfDuty"), makeString("occurenceTimeOfDate"), makeString("wikipediaEnrty"), makeString("currentOrganizationStatus"), makeString("langitude"), makeString("internationalOrganization"), makeString("eventTitles"), makeString("name"), makeString("damage"), makeString("endDateDuty"), makeString("numberHostages"), makeString("numberKilled"), makeString("publicName"), makeString("dateBirth"), makeString("currentPersonStatus"), makeString("dateArrested"), makeString("biography"), makeString("dateOfQuote"), makeString("lastName"), makeString("newsArticleId"), makeString("associatedKeywords"), makeString("filename"), makeString("startDate"), makeString("eventDate"), makeString("acronym"), makeString("firstName"), makeString("numberArrested"), makeString("recurrence"), makeString("currentlyInCharge"), makeString("homepage"), makeString("numberInjured"), makeString("picture"), makeString("endDate"), makeString("otherGivenNames"), makeString("associatedAlerts"), makeString("associatedNewsArticles"), makeString("size"), makeString("purpose"), makeString("dateDeath"), makeString("newsResource"), makeString("zipCode"), makeString("occurrenceDate"), makeString("associatedTitles"), makeString("foundationDate"), makeString("religion"), makeString("duration"), makeString("description"), makeString("email"), makeString("clusterId"), makeString("idEMM"), makeString("address"), makeString("maritalStatus"), makeString("occupation"), makeString("latitude"), makeString("title"), makeString("language"), makeString("colleagueOf"), makeString("siblingOf"), makeString("housemateOf"), makeString("friendOf"), makeString("gender"), makeString("areasOfOperation") });
        $ic52$ = ConsesLow.list(new SubLObject[] { makeString("Bridge"), makeString("Citizen"), makeString("Airport"), makeString("Arrest"), makeString("ReligousFacility"), makeString("Bombing"), makeString("Election"), makeString("Sneaking"), makeString("BookOrManifesto"), makeString("Hideout"), makeString("Hospital"), makeString("HostageTaking"), makeString("Wedding"), makeString("GovernmentalPerson"), makeString("Park"), makeString("OfficeBuilding"), makeString("TrainingCamp"), makeString("NGO"), makeString("Church"), makeString("NavalFacility"), makeString("GovernmentalEvent"), makeString("Killing"), makeString("CivilianPeopleGroup"), makeString("NuclearFacility"), makeString("Company"), makeString("MinistryBuilding"), makeString("CivilianEvent"), makeString("University"), makeString("CoupAttempt"), makeString("Uncovering"), makeString("PeopleGroup"), makeString("TerroristOrganization"), makeString("PoliticalOrganization"), makeString("EmbassyBuilding"), makeString("MilitaryOrganization"), makeString("ReligiousOrganization"), makeString("Stadium"), makeString("EducationalInstitution"), makeString("EducationResearchOrganization"), makeString("Temple"), makeString("IndustrialFacility"), makeString("Country"), makeString("Province"), makeString("Mosque"), makeString("Execution"), makeString("Road"), makeString("FailedTerrorPlot"), makeString("SocioReligousEvent"), makeString("Assasination"), makeString("TerroristAttack"), makeString("GovernmentalOrganization"), makeString("ShoppingMall"), makeString("Ministry"), makeString("CivilianPerson"), makeString("CivicStructure"), makeString("FinancialOrganization"), makeString("hasCity"), makeString("wifeOf"), makeString("hasIdeologist"), makeString("departureLocation"), makeString("memberOf"), makeString("hasAttendant"), makeString("stateInCountry"), makeString("hasPeopleKilled"), makeString("hasLeader"), makeString("hasTarget"), makeString("destination"), makeString("City"), makeString("GeopoliticalLocation"), makeString("militantOf"), makeString("hasVictim"), makeString("hasProvince"), makeString("foundedBy"), makeString("locationOfEvent"), makeString("hasPressSecretary"), makeString("followerOf"), makeString("directorOf"), makeString("woundedAt"), makeString("isSpokesmanFor"), makeString("organizedBy"), makeString("hasCapitalCity"), makeString("hasPeopleArrested"), makeString("spouseOf"), makeString("isChairmanOf"), makeString("leaderOf"), makeString("contacts"), makeString("hasMember"), makeString("financierOf"), makeString("hasState"), makeString("hasEmployee"), makeString("authorOf"), makeString("hasPrimeMinister"), makeString("affiliatedWith"), makeString("hasChief"), makeString("isActorOf"), makeString("parentOf"), makeString("fundedBy"), makeString("CapitalCity"), makeString("ConflictEvent"), makeString("MilitaryEvent"), makeString("Agent"), makeString("Event"), makeString("repeatingEvent"), makeString("numberOfGrupMembers"), makeString("eventDate"), makeString("Location"), makeString("Organization"), makeString("Person"), makeString("subOrganizationOf"), makeString("isPartOf"), makeString("locatedIn"), makeString("familyRelativeOf") });
        $ic53$ = ConsesLow.list(new SubLObject[] { makeString("Insurgent"), makeString("Funeral"), makeString("CivilianPeopleGroup"), makeString("PowerPlant"), makeString("NavalFacility"), makeString("Bank"), makeString("HighSchool"), makeString("PoliticalParty"), makeString("Church"), makeString("Synagogue"), makeString("Temple"), makeString("CivilianEvent"), makeString("GovernmentalEvent"), makeString("MilitaryEvent"), makeString("Bombing"), makeString("CoupAttempt"), makeString("Execution"), makeString("Uncovering"), makeString("Arrest"), makeString("FailedTerrorPlot"), makeString("Killing"), makeString("Assasination"), makeString("HostageTaking"), makeString("Kidnapping"), makeString("TrainingCamp"), makeString("IndustrialFacility"), makeString("Park"), makeString("MinistryBuilding"), makeString("ResidentialBuilding"), makeString("Stadium"), makeString("Hideout"), makeString("OfficeBuilding"), makeString("Airport"), makeString("EducationalInstitution"), makeString("EmbassyBuilding"), makeString("ReligousFacility"), makeString("Bridge"), makeString("Road"), makeString("Hospital"), makeString("Embassy"), makeString("GovernmentalPeopleGroup"), makeString("GovernmentalPerson"), makeString("UnknownPerson"), makeString("GeopoliticalLocation"), makeString("ReligiousOrganization"), makeString("UnknownOrganization"), makeString("MilitaryOrganization"), makeString("NGO"), makeString("GovernmentalOrganization"), makeString("PoliticalOrganization"), makeString("EducationResearchOrganization"), makeString("cousinOf"), makeString("husbandOf"), makeString("ideologistFor"), makeString("cityInCountry"), makeString("presentAt"), makeString("killedAt"), makeString("isTargetOf"), makeString("Sneaking"), makeString("hasMilitant"), makeString("TerroristOrganization"), makeString("victimOf"), makeString("Province"), makeString("provinceInCountry"), makeString("founderOf"), makeString("isEventLocation"), makeString("isPressSecretaryFor"), makeString("hasFollower"), makeString("hasDirector"), makeString("hasWounded"), makeString("hasSpokesman"), makeString("organizerOf"), makeString("CapitalCity"), makeString("hasCity"), makeString("capitalCityInCountry"), makeString("arrestedAt"), makeString("spouseOf"), makeString("hasChairman"), makeString("contactedBy"), makeString("memberOf"), makeString("financedBy"), makeString("State"), makeString("Country"), makeString("stateInCountry"), makeString("hasMember"), makeString("employeeOf"), makeString("BookOrManifesto"), makeString("hasAuthor"), makeString("isPrimeMiniterOf"), makeString("hasLeader"), makeString("chiefOf"), makeString("hasActor"), makeString("childOf"), makeString("funderOf"), makeString("damage"), makeString("ConflictEvent"), makeString("name"), makeString("Group"), makeString("Event"), makeString("Agent"), makeString("colleagueOf"), makeString("hasSuborganization"), makeString("siblingOf"), makeString("City"), makeString("hasPart"), makeString("CivicStructure"), makeString("hasLocation"), makeString("housemateOf"), makeString("familyRelativeOf"), makeString("friendOf"), makeString("Person"), makeString("Location"), makeString("affiliatedWith"), makeString("Organization") });
        $ic54$ = ConsesLow.list((SubLObject)makeString("Collection"));
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("PROPERTY"), (SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("INSTANCE"), (SubLObject)makeKeyword("BNODE"));
        $ic56$ = makeSymbol("S#361", "CYC");
        $ic57$ = makeSymbol("S#5859", "CYC");
        $ic58$ = makeSymbol("S#47146", "CYC");
        $ic59$ = makeKeyword("PROPERTY");
        $ic60$ = makeString("~S is not a valid definition type. Must be one of ~S");
        $ic61$ = makeSymbol("IMPORT-OWL-ONTOLOGY");
        $ic62$ = ConsesLow.list((SubLObject)makeKeyword("URI"), (SubLObject)makeKeyword("CONSTANT-PREFIX"), (SubLObject)makeKeyword("SOURCE"), (SubLObject)makeKeyword("ONTOLOGY"), (SubLObject)makeKeyword("QUOTED-ISA"), (SubLObject)makeKeyword("CYCLIST"), (SubLObject)makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)makeKeyword("ABBREVIATE-PREFIXES?"));
        $ic63$ = makeKeyword("URI");
        $ic64$ = makeKeyword("URI-PREFIX");
        $ic65$ = makeKeyword("CONSTANT-PREFIX");
        $ic66$ = makeKeyword("CONSTANT-SUFFIX");
        $ic67$ = makeKeyword("SOURCE");
        $ic68$ = makeKeyword("ONTOLOGY");
        $ic69$ = makeKeyword("QUOTED-ISA");
        $ic70$ = makeKeyword("CYCLIST");
        $ic71$ = makeKeyword("PREFIX-EXTERNAL-NAMES?");
        $ic72$ = makeKeyword("ABBREVIATE-PREFIXES?");
        $ic73$ = makeString("Can only import OWL ontologies from valid files or URLs.");
        $ic74$ = makeSymbol("S#39641", "CYC");
        $ic75$ = makeKeyword("FILE");
        $ic76$ = makeKeyword("URL");
        $ic77$ = makeSymbol("S#47154", "CYC");
        $ic78$ = makeKeyword("INPUT");
        $ic79$ = makeString("Unable to open ~S");
        $ic80$ = makeSymbol("S#4151", "CYC");
        $ic81$ = makeSymbol("S#47517", "CYC");
        $ic82$ = makeInteger(48);
        $ic83$ = makeString("~&Importing ~S from ~S...~%");
        $ic84$ = makeKeyword("CLASS");
        $ic85$ = makeString("Processing ~D class definition~:P...");
        $ic86$ = makeKeyword("INSTANCE");
        $ic87$ = makeString("Processing ~D instance definition~:P...");
        $ic88$ = makeString("utf-8");
        $ic89$ = makeString("?xml");
        $ic90$ = makeString("encoding");
        $ic91$ = makeString("OWLImport-");
        $ic92$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ImportingAnOWLFileIntoAKnowledgeBase")));
        $ic93$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic94$ = makeString("");
        $ic95$ = makeKeyword("UPCASE");
        $ic96$ = constant_handles_oc.f8479((SubLObject)makeString("startingDate"));
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("infoTransferred"));
        $ic98$ = constant_handles_oc.f8479((SubLObject)makeString("doneBy"));
        $ic99$ = constant_handles_oc.f8479((SubLObject)makeString("endingDate"));
        $ic100$ = makeString("Ontology");
        $ic101$ = makeString("RDF");
        $ic102$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#39890", "CYC"), (SubLObject)makeSymbol("S#1762", "CYC"));
        $ic103$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#39891", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic104$ = makeString("base");
        $ic105$ = makeString("Can't recognize alleged base URI ~S as a URI.");
        $ic106$ = makeSymbol("S#47169", "CYC");
        $ic107$ = makeSymbol("S#47519", "CYC");
        $ic108$ = constant_handles_oc.f8479((SubLObject)makeString("ContextOfPCWFn"));
        $ic109$ = makeString("Expected ontology token, got ~S");
        $ic110$ = makeString("Couldn't find closing Ontology tag.~% ~S");
        $ic111$ = makeInteger(32);
        $ic112$ = makeString("comment");
        $ic113$ = makeString("Expecting comment, got ~S");
        $ic114$ = constant_handles_oc.f8479((SubLObject)makeString("rdfs:comment"));
        $ic115$ = makeString("label");
        $ic116$ = makeString("lang");
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("EnglishLanguage"));
        $ic118$ = makeString("Expecting label, got ~S");
        $ic119$ = makeString("priorVersion");
        $ic120$ = makeString("about");
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("owl:priorVersion"));
        $ic122$ = makeString("imports");
        $ic123$ = makeString("versionInfo");
        $ic124$ = makeString("Don't know how to handle ontology info from ~S");
        $ic125$ = makeSymbol("S#47094", "CYC");
        $ic126$ = makeSymbol("S#47095", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)makeSymbol("S#47545", "CYC"), (SubLObject)makeSymbol("COMMENT"), (SubLObject)makeSymbol("S#13148", "CYC"), (SubLObject)makeSymbol("S#47546", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic128$ = ConsesLow.list((SubLObject)makeKeyword("CYC-NAME"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("DOMAINS"), (SubLObject)makeKeyword("RANGE"), (SubLObject)makeKeyword("PLIST"));
        $ic129$ = ConsesLow.list((SubLObject)makeSymbol("S#47173", "CYC"), (SubLObject)makeSymbol("S#47174", "CYC"), (SubLObject)makeSymbol("S#47175", "CYC"), (SubLObject)makeSymbol("S#47176", "CYC"), (SubLObject)makeSymbol("S#47177", "CYC"));
        $ic130$ = ConsesLow.list((SubLObject)makeSymbol("S#47178", "CYC"), (SubLObject)makeSymbol("S#47179", "CYC"), (SubLObject)makeSymbol("S#47180", "CYC"), (SubLObject)makeSymbol("S#47181", "CYC"), (SubLObject)makeSymbol("S#47182", "CYC"));
        $ic131$ = makeSymbol("S#47186", "CYC");
        $ic132$ = makeSymbol("S#47172", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#47095", "CYC"));
        $ic134$ = makeSymbol("S#47173", "CYC");
        $ic135$ = makeSymbol("S#47178", "CYC");
        $ic136$ = makeSymbol("S#47174", "CYC");
        $ic137$ = makeSymbol("S#47179", "CYC");
        $ic138$ = makeSymbol("S#47175", "CYC");
        $ic139$ = makeSymbol("S#47180", "CYC");
        $ic140$ = makeSymbol("S#47176", "CYC");
        $ic141$ = makeSymbol("S#47181", "CYC");
        $ic142$ = makeSymbol("S#47177", "CYC");
        $ic143$ = makeSymbol("S#47182", "CYC");
        $ic144$ = makeKeyword("CYC-NAME");
        $ic145$ = makeKeyword("COMMENT");
        $ic146$ = makeKeyword("DOMAINS");
        $ic147$ = makeKeyword("RANGE");
        $ic148$ = makeKeyword("PLIST");
        $ic149$ = makeString("Invalid slot ~S for construction function");
        $ic150$ = makeKeyword("BEGIN");
        $ic151$ = makeSymbol("S#47183", "CYC");
        $ic152$ = makeKeyword("SLOT");
        $ic153$ = makeKeyword("END");
        $ic154$ = makeSymbol("S#47185", "CYC");
        $ic155$ = makeString("<OWL-PRED-INFO ~A>");
        $ic156$ = makeKeyword("EXTERNAL-NAME");
        $ic157$ = makeSymbol("STRINGP");
        $ic158$ = makeSymbol("S#747", "CYC");
        $ic159$ = makeSymbol("S#47201", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)makeKeyword("COMPLEMENT-OF"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("S#47201", "CYC")));
        $ic161$ = makeSymbol("S#47374", "CYC");
        $ic162$ = ConsesLow.list((SubLObject)makeKeyword("NODE-ID"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("STRINGP")));
        $ic163$ = ConsesLow.list((SubLObject)makeKeyword("RESTRICTION"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic164$ = (SubLList)ConsesLow.cons((SubLObject)makeKeyword("UNION"), (SubLObject)makeKeyword("ANYTHING"));
        $ic165$ = (SubLList)ConsesLow.cons((SubLObject)makeKeyword("INTERSECTION-OF"), (SubLObject)makeKeyword("ANYTHING"));
        $ic166$ = (SubLList)ConsesLow.cons((SubLObject)makeKeyword("ONE-OF"), (SubLObject)makeKeyword("ANYTHING"));
        $ic167$ = makeSymbol("S#47208", "CYC");
        $ic168$ = makeSymbol("S#47212", "CYC");
        $ic169$ = makeSymbol("S#47096", "CYC");
        $ic170$ = makeSymbol("S#47097", "CYC");
        $ic171$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#47547", "CYC"), makeSymbol("S#47548", "CYC"), makeSymbol("S#47549", "CYC"), makeSymbol("S#47550", "CYC"), makeSymbol("S#46900", "CYC"), makeSymbol("S#47551", "CYC"), makeSymbol("S#710", "CYC"), makeSymbol("S#19620", "CYC"), makeSymbol("S#47552", "CYC"), makeSymbol("S#47553", "CYC"), makeSymbol("S#47554", "CYC"), makeSymbol("S#4664", "CYC") });
        $ic172$ = ConsesLow.list(new SubLObject[] { makeKeyword("ONTOLOGY"), makeKeyword("NAMESPACE-MAP"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("CONSTANT-SUFFIX"), makeKeyword("BASE-URI"), makeKeyword("URI-PREFIX"), makeKeyword("CYCLIST"), makeKeyword("QUOTED-ISA"), makeKeyword("PREFIX-EXTERNAL-NAMES?"), makeKeyword("ABBREVIATE-PREFIXES?"), makeKeyword("IMPORT-TERM"), makeKeyword("ENCODING") });
        $ic173$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#47215", "CYC"), makeSymbol("S#47216", "CYC"), makeSymbol("S#47217", "CYC"), makeSymbol("S#47218", "CYC"), makeSymbol("S#47219", "CYC"), makeSymbol("S#47220", "CYC"), makeSymbol("S#47221", "CYC"), makeSymbol("S#47222", "CYC"), makeSymbol("S#47223", "CYC"), makeSymbol("S#47224", "CYC"), makeSymbol("S#47225", "CYC"), makeSymbol("S#47226", "CYC") });
        $ic174$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#47227", "CYC"), makeSymbol("S#47228", "CYC"), makeSymbol("S#47229", "CYC"), makeSymbol("S#47230", "CYC"), makeSymbol("S#47231", "CYC"), makeSymbol("S#47232", "CYC"), makeSymbol("S#47233", "CYC"), makeSymbol("S#47234", "CYC"), makeSymbol("S#47235", "CYC"), makeSymbol("S#47236", "CYC"), makeSymbol("S#47237", "CYC"), makeSymbol("S#47238", "CYC") });
        $ic175$ = makeSymbol("S#47242", "CYC");
        $ic176$ = makeSymbol("S#47214", "CYC");
        $ic177$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#47097", "CYC"));
        $ic178$ = makeSymbol("S#47215", "CYC");
        $ic179$ = makeSymbol("S#47227", "CYC");
        $ic180$ = makeSymbol("S#47216", "CYC");
        $ic181$ = makeSymbol("S#47228", "CYC");
        $ic182$ = makeSymbol("S#47217", "CYC");
        $ic183$ = makeSymbol("S#47229", "CYC");
        $ic184$ = makeSymbol("S#47218", "CYC");
        $ic185$ = makeSymbol("S#47230", "CYC");
        $ic186$ = makeSymbol("S#47219", "CYC");
        $ic187$ = makeSymbol("S#47231", "CYC");
        $ic188$ = makeSymbol("S#47220", "CYC");
        $ic189$ = makeSymbol("S#47232", "CYC");
        $ic190$ = makeSymbol("S#47221", "CYC");
        $ic191$ = makeSymbol("S#47233", "CYC");
        $ic192$ = makeSymbol("S#47222", "CYC");
        $ic193$ = makeSymbol("S#47234", "CYC");
        $ic194$ = makeSymbol("S#47223", "CYC");
        $ic195$ = makeSymbol("S#47235", "CYC");
        $ic196$ = makeSymbol("S#47224", "CYC");
        $ic197$ = makeSymbol("S#47236", "CYC");
        $ic198$ = makeSymbol("S#47225", "CYC");
        $ic199$ = makeSymbol("S#47237", "CYC");
        $ic200$ = makeSymbol("S#47226", "CYC");
        $ic201$ = makeSymbol("S#47238", "CYC");
        $ic202$ = makeKeyword("NAMESPACE-MAP");
        $ic203$ = makeKeyword("BASE-URI");
        $ic204$ = makeKeyword("IMPORT-TERM");
        $ic205$ = makeKeyword("ENCODING");
        $ic206$ = makeSymbol("S#47239", "CYC");
        $ic207$ = makeSymbol("S#47241", "CYC");
        $ic208$ = makeString("<OWL-IMPORT-PARAMETERS ~S>");
        $ic209$ = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic210$ = makeSymbol("S#17609", "CYC");
        $ic211$ = constant_handles_oc.f8479((SubLObject)makeString("SoftwareVersionFn"));
        $ic212$ = constant_handles_oc.f8479((SubLObject)makeString("OWLImporter-Cyc"));
        $ic213$ = constant_handles_oc.f8479((SubLObject)makeString("UserOfProgramFn"));
        $ic214$ = makeString("Multiple uris for ~S:~% ~S~% ~S");
        $ic215$ = makeSymbol("FORT-P");
        $ic216$ = makeSymbol("S#47261", "CYC");
        $ic217$ = makeString("resource");
        $ic218$ = makeString("#");
        $ic219$ = makeString("interpretation of ");
        $ic220$ = makeString(" as a URI for an imported ontology.");
        $ic221$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#47091", "CYC"), (SubLObject)makeSymbol("S#47555", "CYC"));
        $ic222$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#39891", "CYC"), (SubLObject)makeUninternedSymbol("US#1069245"));
        $ic223$ = makeString("Namespace problem: ~A");
        $ic224$ = makeString("xmlns");
        $ic225$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("rdf"), (SubLObject)makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), (SubLObject)ConsesLow.list((SubLObject)makeString("owl"), (SubLObject)makeString("http://www.w3.org/2002/07/owl#")), (SubLObject)ConsesLow.list((SubLObject)makeString("xsd"), (SubLObject)makeString("http://www.w3.org/2001/XMLSchema#")), (SubLObject)ConsesLow.list((SubLObject)makeString("rdfs"), (SubLObject)makeString("http://www.w3.org/2000/01/rdf-schema#")), (SubLObject)ConsesLow.list((SubLObject)makeString("dc"), (SubLObject)makeString("http://purl.org/dc/elements/1.1/")));
        $ic226$ = makeString(" is bound to ");
        $ic227$ = makeString(".");
        $ic228$ = makeString(" Must be one of ");
        $ic229$ = makeString("No import statement for ");
        $ic230$ = makeSymbol("S#47273", "CYC");
        $ic231$ = makeSymbol("?ONTOLOGY");
        $ic232$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic233$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?ONTOLOGY"), constant_handles_oc.f8479((SubLObject)makeString("owl:Ontology")));
        $ic234$ = constant_handles_oc.f8479((SubLObject)makeString("salientURI"));
        $ic235$ = makeKeyword("INFERENCE-MODE");
        $ic236$ = makeKeyword("MINIMAL");
        $ic237$ = makeKeyword("PROBLEM-STORE");
        $ic238$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic239$ = makeString("~&");
        $ic240$ = makeString("Couldn't find ontology for ~S. Creating a new one.");
        $ic241$ = makeString("~%");
        $ic242$ = constant_handles_oc.f8479((SubLObject)makeString("OWLOntologyFn"));
        $ic243$ = makeSymbol("S#47523", "CYC");
        $ic244$ = makeSymbol("?TERM-TYPE");
        $ic245$ = constant_handles_oc.f8479((SubLObject)makeString("termTypeForOntology"));
        $ic246$ = ConsesLow.list((SubLObject)makeSymbol("?TERM-TYPE"));
        $ic247$ = constant_handles_oc.f8479((SubLObject)makeString("TermFromOntologyFn"));
        $ic248$ = makeKeyword("CLOSE");
        $ic249$ = makeString("There is no range for ~S~%Name token: ~S");
        $ic250$ = makeSymbol("S#47279", "CYC");
        $ic251$ = makeString("DatatypeProperty");
        $ic252$ = makeString("AnnotationProperty");
        $ic253$ = makeString("ObjectProperty");
        $ic254$ = makeString("FunctionalProperty");
        $ic255$ = makeString("SymmetricProperty");
        $ic256$ = makeString("TransitiveProperty");
        $ic257$ = makeSymbol("S#47524", "CYC");
        $ic258$ = makeString("<!--");
        $ic259$ = makeString("-->");
        $ic260$ = makeString("Couldn't find end of HTML comment: ~S");
        $ic261$ = makeString("Skipping comment: ~S");
        $ic262$ = makeKeyword("ISAS");
        $ic263$ = makeKeyword("NEXT-NON-WHITESPACE-TOKEN");
        $ic264$ = makeString("type");
        $ic265$ = makeString("Can't interpret empty label token ~S");
        $ic266$ = makeString("Can't decode language abbreviation ~S");
        $ic267$ = makeKeyword("LABEL");
        $ic268$ = makeString("domain");
        $ic269$ = makeString("Couldn't identify domain from ~S");
        $ic270$ = makeString("inverseOf");
        $ic271$ = makeString("/>");
        $ic272$ = makeString("~S is its own inverse, so it's symmetric.");
        $ic273$ = makeKeyword("SYMMETRIC?");
        $ic274$ = makeKeyword("INVERSE");
        $ic275$ = makeString("subPropertyOf");
        $ic276$ = makeString("Noting genl property ~S of ~S");
        $ic277$ = makeKeyword("GENL-PROPERTY");
        $ic278$ = makeString("equivalentProperty");
        $ic279$ = makeString("Noting equivalent property ~S of ~S");
        $ic280$ = makeKeyword("EQUIVALENT-PROPERTIES");
        $ic281$ = makeString("range");
        $ic282$ = makeString("Couldn't identify range from ~S");
        $ic283$ = makeString("guid");
        $ic284$ = makeString("string");
        $ic285$ = makeString("~&Noting Cyc guid for ~S~S~%");
        $ic286$ = makeKeyword("GUID");
        $ic287$ = makeString("externalID");
        $ic288$ = makeString("~&Noting Cyc externalID for ~S~S~%");
        $ic289$ = makeKeyword("EXTERNALID");
        $ic290$ = makeString("datatype");
        $ic291$ = makeString("isa");
        $ic292$ = makeString("~&Noting (isa ~S ~S)~%");
        $ic293$ = makeString("~&Noting ~S ~S~%");
        $ic294$ = makeKeyword("MY-PRED-VALUES");
        $ic295$ = makeString("Ignoring unrecognized token: ~S");
        $ic296$ = makeString("cyc.com");
        $ic297$ = makeString("Don't know how to interpret attribute value ~S");
        $ic298$ = makeKeyword("NONLOCAL");
        $ic299$ = makeString("Processing ~D property definition~:P...");
        $ic300$ = makeString("DataRange");
        $ic301$ = makeString("oneOf");
        $ic302$ = makeString("Can't read range starting with ~S");
        $ic303$ = makeString("</rdfs:range>");
        $ic304$ = makeString("Finished range ~S.");
        $ic305$ = makeSymbol("S#47292", "CYC");
        $ic306$ = makeString("Class");
        $ic307$ = makeString("DeprecatedClass");
        $ic308$ = makeSymbol("S#47526", "CYC");
        $ic309$ = makeSymbol("S#47293", "CYC");
        $ic310$ = makeString("Reading OWL class starting with~% ~S");
        $ic311$ = makeString("nodeID");
        $ic312$ = ConsesLow.list((SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("BNODE"));
        $ic313$ = makeSymbol("S#47099", "CYC");
        $ic314$ = makeString("Starting token: ~S");
        $ic315$ = makeString("No progress reading OWL class: Stuck on ~A.");
        $ic316$ = makeString("Description");
        $ic317$ = makeString("Restriction");
        $ic318$ = makeString("Reading restriction starting with ~S");
        $ic319$ = makeString("unionOf");
        $ic320$ = makeString("Don't know what to do with this token while reading OWL class:~% ~S~%");
        $ic321$ = makeKeyword("NODE-ID");
        $ic322$ = makeString("Found class: ~S~% Components: ~S");
        $ic323$ = makeKeyword("COMPLEMENT-CLASS");
        $ic324$ = makeKeyword("COMPLEMENT-OF");
        $ic325$ = makeKeyword("INTERSECTION-OF");
        $ic326$ = makeString("Don't know what this class is named:~% ~S");
        $ic327$ = makeString("Can't read an enumeration that isn't a oneOf range:~% ~S");
        $ic328$ = makeString("rest");
        $ic329$ = makeString("first");
        $ic330$ = makeString("Couldn't get name from ~S");
        $ic331$ = makeString("Read enumeration: ~S");
        $ic332$ = makeKeyword("ONE-OF");
        $ic333$ = makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil");
        $ic334$ = makeString("parseType");
        $ic335$ = makeString("Collection");
        $ic336$ = makeString("Found non-first, non-rest token in OWL list:~% ~S");
        $ic337$ = makeString("~&Next item: ~S~%");
        $ic338$ = makeKeyword("UNION");
        $ic339$ = makeString("ID");
        $ic340$ = makeString("Got null arg-isa name in ~S");
        $ic341$ = makeSymbol("S#47310", "CYC");
        $ic342$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("?LOCAL-NAME"), (SubLObject)makeSymbol("?COLL"));
        $ic343$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("owlURI")), (SubLObject)makeSymbol("?TERM"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("URLFn")), (SubLObject)makeSymbol("?URI"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("concatenateStrings")), (SubLObject)makeSymbol("?URI"), (SubLObject)makeString("http://www.w3.org/2000/10/XMLSchema#"), (SubLObject)makeSymbol("?LOCAL-NAME")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("owlDataTypeSemanticCorrelation")), (SubLObject)makeSymbol("?TERM"), (SubLObject)makeSymbol("?COLL")));
        $ic344$ = ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"));
        $ic345$ = makeSymbol("CONSTANT-P");
        $ic346$ = makeSymbol("KEYWORDP");
        $ic347$ = ConsesLow.list((SubLObject)makeKeyword("NONLOCAL"), (SubLObject)makeString("http://www.w3.org/2001/XMLSchema"), (SubLObject)makeKeyword("ANYTHING"));
        $ic348$ = makeString("~&Found term by guid: ~S");
        $ic349$ = makeString("~&Found term by externalID: ~S");
        $ic350$ = constant_handles_oc.f8479((SubLObject)makeString("owl:Class"));
        $ic351$ = makeSymbol("?URI");
        $ic352$ = constant_handles_oc.f8479((SubLObject)makeString("standardPrefixForURI"));
        $ic353$ = ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("EL"), (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic354$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("URIFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#47556", "CYC")));
        $ic355$ = makeSymbol("S#47556", "CYC");
        $ic356$ = makeSymbol("S#47314", "CYC");
        $ic357$ = makeString("Couldn't find URI for namespace ~S");
        $ic358$ = makeString("Can't find or create term of type ~S from ~S");
        $ic359$ = makeSymbol("S#4076", "CYC");
        $ic360$ = makeString("external-name appears to contain a control character: ~S");
        $ic361$ = makeString("external-name appears to contain prefix: ~S");
        $ic362$ = constant_handles_oc.f8479((SubLObject)makeString("OWLClass"));
        $ic363$ = makeSymbol("S#47317", "CYC");
        $ic364$ = constant_handles_oc.f8479((SubLObject)makeString("Predicate"));
        $ic365$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic366$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic367$ = makeString(":");
        $ic368$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("OWLOntologyFn")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#750", "CYC")));
        $ic369$ = makeSymbol("S#750", "CYC");
        $ic370$ = constant_handles_oc.f8479((SubLObject)makeString("owlDefiningOntologyURI"));
        $ic371$ = ConsesLow.list((SubLObject)makeSymbol("?URI"));
        $ic372$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"));
        $ic373$ = makeSymbol("S#47326", "CYC");
        $ic374$ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-62-sent.ts");
        $ic375$ = makeString("/cyc/top/transcripts/0953/vela-20080414111900-21395-local-2-sent.ts");
        $ic376$ = makeString("/cyc/top/transcripts/0953/vela-20080416102200-16797-local-0-sent.ts");
        $ic377$ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-64-sent.ts");
        $ic378$ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-68-sent.ts");
        $ic379$ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-69-sent.ts");
        $ic380$ = makeString("/cyc/top/transcripts/0953/jonny2-20080324150858-709-local-94-sent.ts");
        $ic381$ = makeKeyword("X");
        $ic382$ = constant_handles_oc.f8479((SubLObject)makeString("or"));
        $ic383$ = constant_handles_oc.f8479((SubLObject)makeString("nameSpacePrefixForSKS"));
        $ic384$ = constant_handles_oc.f8479((SubLObject)makeString("URIFn"));
        $ic385$ = ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic386$ = makeSymbol("S#47330", "CYC");
        $ic387$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionUnionFn"));
        $ic388$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic389$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersection2Fn"));
        $ic390$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersectionFn"));
        $ic391$ = constant_handles_oc.f8479((SubLObject)makeString("SingletonCollectionFn"));
        $ic392$ = constant_handles_oc.f8479((SubLObject)makeString("TheCollection"));
        $ic393$ = ConsesLow.list((SubLObject)makeString("externalID"), (SubLObject)makeString("guid"), (SubLObject)makeString("nonAtomicFormula"), (SubLObject)makeString("literalValue"), (SubLObject)makeString("isa"));
        $ic394$ = constant_handles_oc.f8479((SubLObject)makeString("OWLProperty"));
        $ic395$ = makeSymbol("SPEC?");
        $ic396$ = makeString("Potentially adding assertions to existing predicate ~S");
        $ic397$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic398$ = makeString("~&Creating predicate from ~S~%");
        $ic399$ = makeString("Failed to find or create a predicate with name: ~S~%");
        $ic400$ = constant_handles_oc.f8479((SubLObject)makeString("owl:SymmetricProperty"));
        $ic401$ = ConsesLow.list((SubLObject)makeSymbol("S#47557", "CYC"), (SubLObject)makeSymbol("S#29", "CYC"));
        $ic402$ = constant_handles_oc.f8479((SubLObject)makeString("rdfs:domain"));
        $ic403$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic404$ = constant_handles_oc.f8479((SubLObject)makeString("rdfs:range"));
        $ic405$ = makeString("Asserting genl property ~S of ~S");
        $ic406$ = constant_handles_oc.f8479((SubLObject)makeString("rdfs:subPropertyOf"));
        $ic407$ = makeString("Asserting spec property ~S of ~S");
        $ic408$ = constant_handles_oc.f8479((SubLObject)makeString("InverseBinaryPredicateFn"));
        $ic409$ = makeString("Asserting inverse ~S of ~S");
        $ic410$ = makeString("Asserting equivalent-property ~S of ~S");
        $ic411$ = makeString("Couldn't find equivalent property ~S");
        $ic412$ = constant_handles_oc.f8479((SubLObject)makeString("owl:equivalentProperty"));
        $ic413$ = ConsesLow.list((SubLObject)makeSymbol("S#47558", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic414$ = makeString("~&Asserting ~S~%");
        $ic415$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic416$ = makeSymbol("S#13755", "CYC");
        $ic417$ = makeSymbol("?TERM");
        $ic418$ = makeString("Couldn't find ~S");
        $ic419$ = makeSymbol("S#47531", "CYC");
        $ic420$ = makeSymbol("S#47532", "CYC");
        $ic421$ = makeSymbol("S#47535", "CYC");
        $ic422$ = makeString("Circular node id reference: ~S -> ~S");
        $ic423$ = makeKeyword("UNRESOLVED");
        $ic424$ = makeString("Postponing (isa ~S ~S) because ~S is not (yet) known to be a collection.");
        $ic425$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Collection")), constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate")), constant_handles_oc.f8479((SubLObject)makeString("Predicate")));
        $ic426$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic427$ = makeString("-");
        $ic428$ = makeKeyword("ASSERT");
        $ic429$ = makeString("OWL OE Daemon");
        $ic430$ = makeSymbol("S#47368", "CYC");
        $ic431$ = makeSymbol("CONSP");
        $ic432$ = makeString("Waiting for ~D enqueued operation~:P to be processed...");
        $ic433$ = (SubLFloat)makeDouble(0.5);
        $ic434$ = makeString("~&Finished pass through queue. Size (including markers) is now ~D. Going around again...~%");
        $ic435$ = makeString("~&OE queue is empty. Zzz.~%");
        $ic436$ = makeString("Unable to perform ~D operation~:P:~% ~S~%");
        $ic437$ = makeString("~&Can't do anything with queue now. Awaiting further operations. Zzz.~%");
        $ic438$ = (SubLList)ConsesLow.cons((SubLObject)makeKeyword("ASSERT"), (SubLObject)makeKeyword("ANYTHING"));
        $ic439$ = makeString("~&Noting OE performed: ~S~%");
        $ic440$ = ConsesLow.list((SubLObject)makeSymbol("S#47559", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#47560", "CYC"));
        $ic441$ = makeString("~&Failed to resolve ~S~%");
        $ic442$ = makeSymbol("S#47375", "CYC");
        $ic443$ = makeString("Problem performing ~S");
        $ic444$ = makeKeyword("OWL-QUASI-TERM");
        $ic445$ = makeKeyword("FIND");
        $ic446$ = makeString("~S is not an OWL node ID.");
        $ic447$ = (SubLList)ConsesLow.cons((SubLObject)makeKeyword("OWL-QUASI-TERM"), (SubLObject)makeKeyword("ANYTHING"));
        $ic448$ = ConsesLow.list((SubLObject)makeSymbol("S#47561", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#47547", "CYC"), (SubLObject)makeSymbol("S#47560", "CYC"));
        $ic449$ = makeSymbol("S#47379", "CYC");
        $ic450$ = makeString("~&Resolved ~S~% to ~S~%");
        $ic451$ = makeSymbol("S#47536", "CYC");
        $ic452$ = makeSymbol("S#47381", "CYC");
        $ic453$ = makeSymbol("S#3946", "CYC");
        $ic454$ = makeSymbol("S#16383", "CYC");
        $ic455$ = makeString("Already know ~S~% in ~S");
        $ic456$ = makeString("Failed to assert ~S~%");
        $ic457$ = makeString("Processing term definitions...");
        $ic458$ = makeString("Anonymous-");
        $ic459$ = makeString("~&Creating ~S...~%");
        $ic460$ = makeString("Potentially adding assertions to existing term ~S");
        $ic461$ = makeString("~&Defining term from ~S~%");
        $ic462$ = makeString("Failed to find or create a term with name: ~S~%");
        $ic463$ = makeKeyword("EQUIVALENT-CLASSES");
        $ic464$ = makeKeyword("UNION-OF");
        $ic465$ = makeString("Thing");
        $ic466$ = constant_handles_oc.f8479((SubLObject)makeString("owl:Thing"));
        $ic467$ = makeString("Asserting genl class ~S of ~S");
        $ic468$ = constant_handles_oc.f8479((SubLObject)makeString("rdfs:subClassOf"));
        $ic469$ = ConsesLow.list((SubLObject)makeKeyword("COMPLEMENT-OF"), (SubLObject)makeKeyword("ANYTHING"));
        $ic470$ = makeString("Asserting disjoint class ~S of ~S");
        $ic471$ = constant_handles_oc.f8479((SubLObject)makeString("owl:disjointWith"));
        $ic472$ = makeString("Don't know how to handle superclass ~S");
        $ic473$ = makeString("Asserting disjoint: ~S and ~S");
        $ic474$ = makeString("Don't know how to handle disjoint class ~S");
        $ic475$ = makeString("Asserting union ~S of ~S");
        $ic476$ = constant_handles_oc.f8479((SubLObject)makeString("collectionUnion"));
        $ic477$ = makeString("Asserting intersection ~S of ~S");
        $ic478$ = constant_handles_oc.f8479((SubLObject)makeString("collectionIntersection"));
        $ic479$ = makeKeyword("ENUMERATED-INSTANCES");
        $ic480$ = makeString("Asserting enumeration ~S of ~S");
        $ic481$ = constant_handles_oc.f8479((SubLObject)makeString("completelyAssertedCollection"));
        $ic482$ = makeString("Can't handle ~S (value: ~S)");
        $ic483$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#1572", "CYC"), (SubLObject)makeSymbol("S#887", "CYC"));
        $ic484$ = makeSymbol("?LEXICON");
        $ic485$ = constant_handles_oc.f8479((SubLObject)makeString("languageHasRootLexicon"));
        $ic486$ = ConsesLow.list((SubLObject)makeSymbol("?LEXICON"));
        $ic487$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"));
        $ic488$ = constant_handles_oc.f8479((SubLObject)makeString("GeneralEnglishMt"));
        $ic489$ = constant_handles_oc.f8479((SubLObject)makeString("rdfs:label"));
        $ic490$ = makeString("Asserting equivalent class ~S of ~S");
        $ic491$ = constant_handles_oc.f8479((SubLObject)makeString("owl:equivalentClass"));
        $ic492$ = makeString("Failed to assert equivalent class ~S of ~S");
        $ic493$ = ConsesLow.list((SubLObject)makeSymbol("S#137", "CYC"), (SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("CLASS"));
        $ic494$ = makeString("Resolved nonlocal reference ~S~% to ~S");
        $ic495$ = makeString("Node ID as restriction target: ~S");
        $ic496$ = makeString("Can't handle ~S restrictions with value ~S.");
        $ic497$ = makeString("allValuesFrom");
        $ic498$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllOnly"));
        $ic499$ = makeString("someValuesFrom");
        $ic500$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExists"));
        $ic501$ = makeString("hasValue");
        $ic502$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic503$ = makeString("minCardinality");
        $ic504$ = constant_handles_oc.f8479((SubLObject)makeString("requiredArg1Pred"));
        $ic505$ = makeString("cardinality");
        $ic506$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount"));
        $ic507$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin"));
        $ic508$ = makeString("maxCardinality");
        $ic509$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMax"));
        $ic510$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceOnly")), (SubLObject)makeKeyword("PRED"), (SubLObject)makeSymbol("?X"), (SubLObject)makeKeyword("TARGET"))));
        $ic511$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists")), (SubLObject)makeKeyword("PRED"), (SubLObject)makeSymbol("?X"), (SubLObject)makeKeyword("TARGET"))));
        $ic512$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("PRED"), (SubLObject)makeSymbol("?X"), (SubLObject)makeKeyword("TARGET"))));
        $ic513$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount")), (SubLObject)makeKeyword("PRED"), (SubLObject)makeSymbol("?X"), (SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("TARGET"))));
        $ic514$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMax")), (SubLObject)makeKeyword("PRED"), (SubLObject)makeSymbol("?X"), (SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("TARGET"))));
        $ic515$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn")), (SubLObject)makeKeyword("GENL"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMin")), (SubLObject)makeKeyword("PRED"), (SubLObject)makeSymbol("?X"), (SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("TARGET"))));
        $ic516$ = makeKeyword("PRED");
        $ic517$ = makeKeyword("TARGET");
        $ic518$ = makeKeyword("GENL");
        $ic519$ = makeString("Can't create collection from ~S restrictions with value ~S.");
        $ic520$ = makeSymbol("S#47394", "CYC");
        $ic521$ = makeString("Created ~S from ~S");
        $ic522$ = makeString("~&Asserting ~S");
        $ic523$ = makeSymbol("S#47202", "CYC");
        $ic524$ = makeString("Nested calls resolving ~S");
        $ic525$ = ConsesLow.list((SubLObject)makeKeyword("COMPLEMENT-OF"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#47201", "CYC")));
        $ic526$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionDifferenceFn"));
        $ic527$ = makeSymbol("VALID-CONSTANT?");
        $ic528$ = makeString("Can't find or create ~S term from ~S");
        $ic529$ = makeSymbol("S#47203", "CYC");
        $ic530$ = makeString("~&Trying to resolve ~S~%");
        $ic531$ = makeString("~&Result: ~S~%");
        $ic532$ = makeString("Trying to create term from ~S");
        $ic533$ = makeSymbol("S#47098", "CYC");
        $ic534$ = ConsesLow.list((SubLObject)makeSymbol("S#47545", "CYC"), (SubLObject)makeSymbol("COMMENT"), (SubLObject)makeSymbol("S#47562", "CYC"), (SubLObject)makeSymbol("S#47563", "CYC"), (SubLObject)makeSymbol("S#138", "CYC"));
        $ic535$ = ConsesLow.list((SubLObject)makeKeyword("CYC-NAME"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("SUPERCLASSES"), (SubLObject)makeKeyword("DISJOINT-CLASSES"), (SubLObject)makeKeyword("PLIST"));
        $ic536$ = ConsesLow.list((SubLObject)makeSymbol("S#47403", "CYC"), (SubLObject)makeSymbol("S#47404", "CYC"), (SubLObject)makeSymbol("S#47405", "CYC"), (SubLObject)makeSymbol("S#47406", "CYC"), (SubLObject)makeSymbol("S#47407", "CYC"));
        $ic537$ = ConsesLow.list((SubLObject)makeSymbol("S#47408", "CYC"), (SubLObject)makeSymbol("S#47409", "CYC"), (SubLObject)makeSymbol("S#47410", "CYC"), (SubLObject)makeSymbol("S#47411", "CYC"), (SubLObject)makeSymbol("S#47412", "CYC"));
        $ic538$ = makeSymbol("S#47416", "CYC");
        $ic539$ = makeSymbol("S#47402", "CYC");
        $ic540$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#47099", "CYC"));
        $ic541$ = makeSymbol("S#47403", "CYC");
        $ic542$ = makeSymbol("S#47408", "CYC");
        $ic543$ = makeSymbol("S#47404", "CYC");
        $ic544$ = makeSymbol("S#47409", "CYC");
        $ic545$ = makeSymbol("S#47405", "CYC");
        $ic546$ = makeSymbol("S#47410", "CYC");
        $ic547$ = makeSymbol("S#47406", "CYC");
        $ic548$ = makeSymbol("S#47411", "CYC");
        $ic549$ = makeSymbol("S#47407", "CYC");
        $ic550$ = makeSymbol("S#47412", "CYC");
        $ic551$ = makeKeyword("SUPERCLASSES");
        $ic552$ = makeKeyword("DISJOINT-CLASSES");
        $ic553$ = makeSymbol("S#47413", "CYC");
        $ic554$ = makeSymbol("S#47415", "CYC");
        $ic555$ = makeString("<OWL-TERM-INFO ~A>");
        $ic556$ = ConsesLow.list((SubLObject)makeKeyword("CLASS"), (SubLObject)makeKeyword("INSTANCE"));
        $ic557$ = makeString("Don't know about ~S");
        $ic558$ = makeSymbol("S#47434", "CYC");
        $ic559$ = makeKeyword("BNODE");
        $ic560$ = makeString("~&Reading Description: ~S~%");
        $ic561$ = makeString("Skipping rdf:Description element.");
        $ic562$ = makeString("~&Reading Restriction: ~S~%");
        $ic563$ = makeString("Skipping owl:Restriction element.");
        $ic564$ = makeString("Reading top-level named class ~S");
        $ic565$ = makeString("Failed or declined to read a class.");
        $ic566$ = makeString("There are no superclasses for ~S");
        $ic567$ = makeString("Finished ~S.~% Superclasses: ~S.~% Disjoint classes: ~S.~% Isas: ~S.");
        $ic568$ = makeString("Skipping HTML comment: ~S");
        $ic569$ = makeString("Reading definition of ~S");
        $ic570$ = makeString("Skipping ~S to close tag");
        $ic571$ = makeString("Failed or declined to read an instance.");
        $ic572$ = makeString("Finished ~S.");
        $ic573$ = makeString("~&Defining ~S as an instance of ~S~%");
        $ic574$ = makeString("AllDifferent");
        $ic575$ = makeString("Skipping ~S");
        $ic576$ = makeString("Skipping locally-defined ~S to close tag");
        $ic577$ = makeString("subClassOf");
        $ic578$ = makeString("Read superclass: ~S");
        $ic579$ = makeString("disjointWith");
        $ic580$ = makeString("equivalentClass");
        $ic581$ = makeString("owlEquivalentClass");
        $ic582$ = makeString("complementOf");
        $ic583$ = makeString("intersectionOf");
        $ic584$ = makeString("Read one intersection element: ~S");
        $ic585$ = makeString("Intersection: ~S");
        $ic586$ = makeString("Read one union element: ~S");
        $ic587$ = makeString("Union: ~S");
        $ic588$ = makeString("Read enumerated instances: ~S");
        $ic589$ = makeString("Couldn't determine value from ~S~% ~S");
        $ic590$ = makeString("Apparently anonymous instance: ~S");
        $ic591$ = ConsesLow.list((SubLObject)makeKeyword("NONLOCAL"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("S#39641", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEST"), (SubLObject)makeSymbol("STRINGP")));
        $ic592$ = makeString("Finding or creating nonlocal term...");
        $ic593$ = makeString("Result: ~S");
        $ic594$ = makeString("Reading OWL class or restriction starting with~% ~S");
        $ic595$ = makeKeyword("RESTRICTION");
        $ic596$ = makeString("Can't read class starting with ~S");
        $ic597$ = makeString("~S~% is not the start of an OWL restriction declaration.");
        $ic598$ = makeKeyword("INITIAL");
        $ic599$ = makeKeyword("DONE");
        $ic600$ = makeString("Read restriction: ~S ~S ~S ~S");
        $ic601$ = makeString("onProperty");
        $ic602$ = makeString("Reading restriction property...");
        $ic603$ = makeKeyword("READING-PROPERTY");
        $ic604$ = makeString("onClass");
        $ic605$ = makeString("Reading restriction class...");
        $ic606$ = makeKeyword("READING-CLASS");
        $ic607$ = makeString("Read restriction property ~S");
        $ic608$ = makeKeyword("READ-PROPERTY");
        $ic609$ = makeString("Read restriction class ~S");
        $ic610$ = makeKeyword("READ-CLASS");
        $ic611$ = makeString("Got onProperty close tag when we weren't reading a property.");
        $ic612$ = makeString("Failed to read property.");
        $ic613$ = makeString("Got onClass close tag when we weren't reading a class.");
        $ic614$ = makeString("Failed to read class.");
        $ic615$ = makeString("Read datatype ~S from ~S");
        $ic616$ = makeKeyword("READ-TYPE");
        $ic617$ = makeString("Read value ~S from ~S");
        $ic618$ = makeKeyword("READ-VALUE");
        $ic619$ = makeString("Failed to read restriction value.");
        $ic620$ = makeString("Read restriction value ~S");
        $ic621$ = makeString("~&Reading OWL property starting with ~S~%");
        $ic622$ = makeString("~&Done with ~S~%");
        $ic623$ = makeString("~&Reading OWL class starting with ~S~%");
        $ic624$ = ConsesLow.list(new SubLObject[] { makeString("double"), makeString("integer"), makeString("int"), makeString("unsignedInt"), makeString("nonNegativeInteger"), makeString("nonPositiveInteger"), makeString("positiveInteger"), makeString("negativeInteger"), makeString("decimal"), makeString("long"), makeString("unsignedLong"), makeString("short"), makeString("unsignedShort"), makeString("float") });
        $ic625$ = makeString("Can't parse ~S as a ~A");
        $ic626$ = makeString("boolean");
        $ic627$ = ConsesLow.list((SubLObject)makeString("true"), (SubLObject)makeString("1"));
        $ic628$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic629$ = ConsesLow.list((SubLObject)makeString("false"), (SubLObject)makeString("0"));
        $ic630$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic631$ = makeString("Couldn't read boolean value from ~S");
        $ic632$ = makeString("date");
        $ic633$ = makeString("Couldn't parse date from ~S");
        $ic634$ = constant_handles_oc.f8479((SubLObject)makeString("DayFn"));
        $ic635$ = makeSymbol("NAT-FUNCTOR");
        $ic636$ = makeString("Got multiple dates from ~S:~% ~S");
        $ic637$ = makeString("Don't know how to parse value from ~S with datatype ~S");
        $ic638$ = makeSymbol("S#46917", "CYC");
        $ic639$ = makeString("xml:");
        $ic640$ = makeSymbol("S#47542", "CYC");
        $ic641$ = makeSymbol("S#47100", "CYC");
        $ic642$ = makeSymbol("S#47101", "CYC");
        $ic643$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#479", "CYC"), (SubLObject)makeSymbol("S#47564", "CYC"), (SubLObject)makeSymbol("S#47560", "CYC"), (SubLObject)makeSymbol("S#5845", "CYC"));
        $ic644$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("PROGRESS"), (SubLObject)makeKeyword("ERROR-INFO"), (SubLObject)makeKeyword("IMPORT-PARAMETERS"), (SubLObject)makeKeyword("THREAD"));
        $ic645$ = ConsesLow.list((SubLObject)makeSymbol("S#47468", "CYC"), (SubLObject)makeSymbol("S#47469", "CYC"), (SubLObject)makeSymbol("S#47470", "CYC"), (SubLObject)makeSymbol("S#47471", "CYC"), (SubLObject)makeSymbol("S#47472", "CYC"));
        $ic646$ = ConsesLow.list((SubLObject)makeSymbol("S#47473", "CYC"), (SubLObject)makeSymbol("S#47474", "CYC"), (SubLObject)makeSymbol("S#47475", "CYC"), (SubLObject)makeSymbol("S#47476", "CYC"), (SubLObject)makeSymbol("S#47477", "CYC"));
        $ic647$ = makeSymbol("S#47481", "CYC");
        $ic648$ = makeSymbol("S#47467", "CYC");
        $ic649$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#47101", "CYC"));
        $ic650$ = makeSymbol("S#47468", "CYC");
        $ic651$ = makeSymbol("S#47473", "CYC");
        $ic652$ = makeSymbol("S#47469", "CYC");
        $ic653$ = makeSymbol("S#47474", "CYC");
        $ic654$ = makeSymbol("S#47470", "CYC");
        $ic655$ = makeSymbol("S#47475", "CYC");
        $ic656$ = makeSymbol("S#47471", "CYC");
        $ic657$ = makeSymbol("S#47476", "CYC");
        $ic658$ = makeSymbol("S#47472", "CYC");
        $ic659$ = makeSymbol("S#47477", "CYC");
        $ic660$ = makeKeyword("ID");
        $ic661$ = makeKeyword("PROGRESS");
        $ic662$ = makeKeyword("ERROR-INFO");
        $ic663$ = makeKeyword("IMPORT-PARAMETERS");
        $ic664$ = makeKeyword("THREAD");
        $ic665$ = makeSymbol("S#47478", "CYC");
        $ic666$ = makeSymbol("S#47480", "CYC");
        $ic667$ = makeString("<OWL-IMPORTER ~D>");
        $ic668$ = makeSymbol("S#47488", "CYC");
        $ic669$ = makeSymbol("IMPORT-OWL-ONTOLOGY-WITH-IMPORTER");
        $ic670$ = ConsesLow.list((SubLObject)makeKeyword("URI"), (SubLObject)makeKeyword("CONSTANT-PREFIX"), (SubLObject)makeKeyword("SOURCE"), (SubLObject)makeKeyword("ONTOLOGY"), (SubLObject)makeKeyword("PREFIX-EXTERNAL-NAMES?"), (SubLObject)makeKeyword("ABBREVIATE-PREFIXES?"), (SubLObject)makeKeyword("QUOTED-ISA"), (SubLObject)makeKeyword("CYCLIST"));
        $ic671$ = makeString("OWL Importer");
        $ic672$ = makeSymbol("S#47504", "CYC");
        $ic673$ = ConsesLow.list(new SubLObject[] { makeKeyword("IMPORTER"), makeKeyword("URI"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("CONSTANT-SUFFIX"), makeKeyword("URI-PREFIX"), makeKeyword("SOURCE"), makeKeyword("ONTOLOGY"), makeKeyword("QUOTED-ISA"), makeKeyword("CYCLIST"), makeKeyword("PREFIX-EXTERNAL-NAMES?"), makeKeyword("ABBREVIATE-PREFIXES?") });
        $ic674$ = makeSymbol("S#47544", "CYC");
        $ic675$ = makeKeyword("IMPORTER");
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
            structDecl = Structures.makeStructDeclNative((Class)$sX47094_native.class, $ic125$, $ic126$, $ic127$, $ic128$, new String[] { "$cyc_name", "$comment", "$domains", "$range", "$plist" }, $ic129$, $ic130$, $ic131$);
        }
    }
    
    public static final class $f43171$UnaryFunction extends UnaryFunction
    {
        public $f43171$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47095"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return f43171(var231);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX47096_native.class, $ic169$, $ic170$, $ic171$, $ic172$, new String[] { "$ontology", "$namespace_map", "$constant_prefix", "$constant_suffix", "$base_uri", "$uri_prefix", "$cyclist", "$quoted_isa", "$prefix_external_namesP", "$abbreviate_prefixesP", "$import_term", "$encoding" }, $ic173$, $ic174$, $ic175$);
        }
    }
    
    public static final class $f43213$UnaryFunction extends UnaryFunction
    {
        public $f43213$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47097"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return f43213(var231);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX47098_native.class, $ic533$, $ic313$, $ic534$, $ic535$, new String[] { "$cyc_name", "$comment", "$superclasses", "$disjoint_classes", "$plist" }, $ic536$, $ic537$, $ic538$);
        }
    }
    
    public static final class $f43110$UnaryFunction extends UnaryFunction
    {
        public $f43110$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47099"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return f43110(var231);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX47100_native.class, $ic641$, $ic642$, $ic643$, $ic644$, new String[] { "$id", "$progress", "$error_info", "$import_parameters", "$thread" }, $ic645$, $ic646$, $ic647$);
        }
    }
    
    public static final class $f43437$UnaryFunction extends UnaryFunction
    {
        public $f43437$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47101"));
        }
        
        public SubLObject processItem(final SubLObject var231) {
            return f43437(var231);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4557 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/