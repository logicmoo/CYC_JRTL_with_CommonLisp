package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0424 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0424";
    public static final String myFingerPrint = "142380e1e8ce0cc7552fc2a770fd12ddaf508816a7a9e859083ece8f25cbe96f";
    private static SubLSymbol $g3441$;
    private static SubLSymbol $g3442$;
    private static SubLSymbol $g3443$;
    private static SubLSymbol $g3444$;
    private static SubLSymbol $g3445$;
    private static SubLSymbol $g3446$;
    private static SubLSymbol $g3447$;
    private static SubLSymbol $g3448$;
    private static SubLSymbol $g3449$;
    public static SubLSymbol $g3450$;
    public static SubLSymbol $g3451$;
    public static SubLSymbol $g3452$;
    private static SubLSymbol $g3454$;
    public static SubLSymbol $g3162$;
    private static SubLSymbol $g3455$;
    private static SubLSymbol $g3456$;
    private static SubLSymbol $g3458$;
    private static SubLSymbol $g3459$;
    private static SubLSymbol $g3460$;
    public static SubLSymbol $g3461$;
    public static SubLSymbol $g3462$;
    public static SubLSymbol $g3463$;
    public static SubLSymbol $g3457$;
    private static SubLSymbol $g3464$;
    private static SubLSymbol $g3465$;
    private static SubLSymbol $g3466$;
    public static SubLSymbol $g3467$;
    public static SubLSymbol $g3453$;
    public static SubLSymbol $g3468$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLInteger $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
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
    private static final SubLSymbol $ic39$;
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
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLList $ic53$;
    private static final SubLList $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLList $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLInteger $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLFloat $ic62$;
    private static final SubLFloat $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLInteger $ic66$;
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
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLString $ic104$;
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
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLString $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLObject $ic132$;
    private static final SubLObject $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLObject $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLObject $ic139$;
    private static final SubLString $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLList $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLString $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLObject $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLObject $ic170$;
    private static final SubLObject $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLList $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLString $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLString $ic183$;
    private static final SubLList $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLList $ic190$;
    private static final SubLList $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLList $ic196$;
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
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLList $ic215$;
    private static final SubLSymbol $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLList $ic222$;
    private static final SubLList $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLInteger $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLString $ic245$;
    private static final SubLString $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLList $ic254$;
    private static final SubLList $ic255$;
    private static final SubLList $ic256$;
    private static final SubLList $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLList $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLString $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLString $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLList $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLList $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLList $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLSymbol $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLSymbol $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLSymbol $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLSymbol $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLString $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLList $ic327$;
    private static final SubLList $ic328$;
    private static final SubLList $ic329$;
    private static final SubLList $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLList $ic332$;
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
    private static final SubLString $ic354$;
    private static final SubLSymbol $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLSymbol $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLList $ic359$;
    private static final SubLList $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLSymbol $ic365$;
    private static final SubLList $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLList $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLList $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLSymbol $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLSymbol $ic375$;
    private static final SubLSymbol $ic376$;
    private static final SubLSymbol $ic377$;
    private static final SubLList $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLList $ic380$;
    private static final SubLSymbol $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLList $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLSymbol $ic386$;
    private static final SubLSymbol $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLString $ic389$;
    private static final SubLString $ic390$;
    private static final SubLString $ic391$;
    private static final SubLString $ic392$;
    private static final SubLString $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLString $ic396$;
    private static final SubLSymbol $ic397$;
    private static final SubLString $ic398$;
    private static final SubLSymbol $ic399$;
    private static final SubLString $ic400$;
    private static final SubLObject $ic401$;
    private static final SubLObject $ic402$;
    private static final SubLString $ic403$;
    private static final SubLList $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLString $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLSymbol $ic408$;
    private static final SubLString $ic409$;
    private static final SubLSymbol $ic410$;
    private static final SubLSymbol $ic411$;
    private static final SubLSymbol $ic412$;
    private static final SubLSymbol $ic413$;
    private static final SubLSymbol $ic414$;
    private static final SubLList $ic415$;
    private static final SubLList $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLSymbol $ic419$;
    private static final SubLSymbol $ic420$;
    private static final SubLList $ic421$;
    private static final SubLList $ic422$;
    private static final SubLSymbol $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLSymbol $ic425$;
    private static final SubLSymbol $ic426$;
    private static final SubLSymbol $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLSymbol $ic429$;
    private static final SubLString $ic430$;
    private static final SubLString $ic431$;
    private static final SubLString $ic432$;
    private static final SubLString $ic433$;
    private static final SubLString $ic434$;
    private static final SubLSymbol $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLString $ic438$;
    private static final SubLString $ic439$;
    private static final SubLString $ic440$;
    private static final SubLSymbol $ic441$;
    private static final SubLList $ic442$;
    private static final SubLList $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLSymbol $ic445$;
    private static final SubLString $ic446$;
    private static final SubLSymbol $ic447$;
    private static final SubLSymbol $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLSymbol $ic450$;
    private static final SubLSymbol $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLSymbol $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLSymbol $ic455$;
    private static final SubLSymbol $ic456$;
    private static final SubLSymbol $ic457$;
    private static final SubLSymbol $ic458$;
    private static final SubLSymbol $ic459$;
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
    private static final SubLSymbol $ic473$;
    private static final SubLString $ic474$;
    private static final SubLSymbol $ic475$;
    private static final SubLSymbol $ic476$;
    private static final SubLSymbol $ic477$;
    private static final SubLSymbol $ic478$;
    private static final SubLSymbol $ic479$;
    private static final SubLSymbol $ic480$;
    private static final SubLList $ic481$;
    private static final SubLString $ic482$;
    private static final SubLSymbol $ic483$;
    private static final SubLString $ic484$;
    private static final SubLString $ic485$;
    private static final SubLString $ic486$;
    private static final SubLString $ic487$;
    private static final SubLString $ic488$;
    private static final SubLString $ic489$;
    private static final SubLList $ic490$;
    private static final SubLString $ic491$;
    private static final SubLSymbol $ic492$;
    private static final SubLString $ic493$;
    private static final SubLSymbol $ic494$;
    private static final SubLString $ic495$;
    private static final SubLString $ic496$;
    private static final SubLString $ic497$;
    private static final SubLString $ic498$;
    private static final SubLString $ic499$;
    private static final SubLString $ic500$;
    private static final SubLString $ic501$;
    private static final SubLString $ic502$;
    private static final SubLSymbol $ic503$;
    private static final SubLList $ic504$;
    private static final SubLInteger $ic505$;
    private static final SubLString $ic506$;
    private static final SubLString $ic507$;
    private static final SubLSymbol $ic508$;
    private static final SubLString $ic509$;
    private static final SubLSymbol $ic510$;
    private static final SubLSymbol $ic511$;
    private static final SubLString $ic512$;
    private static final SubLString $ic513$;
    private static final SubLString $ic514$;
    private static final SubLObject $ic515$;
    private static final SubLSymbol $ic516$;
    private static final SubLList $ic517$;
    private static final SubLString $ic518$;
    private static final SubLString $ic519$;
    private static final SubLSymbol $ic520$;
    private static final SubLSymbol $ic521$;
    private static final SubLString $ic522$;
    private static final SubLSymbol $ic523$;
    private static final SubLString $ic524$;
    private static final SubLString $ic525$;
    private static final SubLList $ic526$;
    private static final SubLInteger $ic527$;
    private static final SubLString $ic528$;
    
    
    public static SubLObject f29620(final SubLObject var1) {
        return Equality.eq((SubLObject)$ic0$, var1);
    }
    
    public static SubLObject f29621(final SubLObject var1) {
        return Equality.eq((SubLObject)$ic1$, var1);
    }
    
    public static SubLObject f29622(final SubLObject var1) {
        return Equality.eq((SubLObject)$ic2$, var1);
    }
    
    public static SubLObject f29623() {
        return $g3446$.getGlobalValue();
    }
    
    public static SubLObject f29624() {
        if (!$g3447$.getGlobalValue().isVector()) {
            $g3447$.setGlobalValue(Functions.apply((SubLObject)$ic8$, f29623()));
        }
        return $g3447$.getGlobalValue();
    }
    
    public static SubLObject f29625(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic11$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic11$);
        var7 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var8;
            var5 = (var8 = var6);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic13$, (SubLObject)ConsesLow.list((SubLObject)$ic14$, var7))), ConsesLow.append(var8, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic11$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29626(final SubLObject var1) {
        return module0035.f2327(var1);
    }
    
    public static SubLObject f29627(final SubLObject var9) {
        return f29628(var9, (SubLObject)ConsesLow.list((SubLObject)$ic15$));
    }
    
    public static SubLObject f29628(final SubLObject var9, final SubLObject var10) {
        SubLObject var11 = conses_high.copy_list(var9);
        SubLObject var12 = var10;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            var11 = conses_high.remf(var11, var13);
            var12 = var12.rest();
            var13 = var12.first();
        }
        return var11;
    }
    
    public static SubLObject f29629(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29630(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic15$, (SubLObject)$ic17$);
    }
    
    public static SubLObject f29631(final SubLObject var9, final SubLObject var14, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        return conses_high.getf(var9, var14, var15);
    }
    
    public static SubLObject f29632(final SubLObject var9) {
        return module0004.f105(f29633(var9));
    }
    
    public static SubLObject f29634(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL == f29632(var9));
    }
    
    public static SubLObject f29633(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic18$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29635(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic19$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29636(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic20$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29637(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29638(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic22$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29639(final SubLObject var9) {
        return f29640(var9, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29641(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic24$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29642(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic25$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29643(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic26$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29644(final SubLObject var9) {
        return conses_high.getf(var9, (SubLObject)$ic27$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29645(final SubLObject var9, final SubLObject var16) {
        final SubLObject var17 = f29629(var9);
        return module0423.f29578(var17, var16);
    }
    
    public static SubLObject f29640(final SubLObject var9, final SubLObject var13, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if ($ic20$ == var13) {
            final SubLObject var16 = f29631(var9, var13, (SubLObject)UNPROVIDED);
            return (NIL != var16) ? var16 : f29631(var9, (SubLObject)$ic19$, var15);
        }
        if (NIL != module0360.f23809(var13) || $ic28$ == var13 || $ic16$ == var13 || $ic29$ == var13) {
            return f29631(var9, var13, var15);
        }
        if (NIL != module0360.f23781(var13)) {
            return f29645(var9, var13);
        }
        if (var13 == $ic30$) {
            return module0035.f2410(f29640(var9, (SubLObject)$ic19$, var15), f29640(var9, (SubLObject)$ic22$, var15));
        }
        if (var13 == $ic31$) {
            return module0035.f2410(f29640(var9, (SubLObject)$ic19$, var15), f29640(var9, (SubLObject)$ic21$, var15));
        }
        if (var13 == $ic32$) {
            return module0035.f2410(f29640(var9, (SubLObject)$ic20$, var15), f29640(var9, (SubLObject)$ic19$, var15));
        }
        if (var13 == $ic23$) {
            return module0035.f2413(f29640(var9, (SubLObject)$ic32$, var15), f29640(var9, (SubLObject)$ic21$, var15));
        }
        if (var13 == $ic24$) {
            return module0035.f2413(f29640(var9, (SubLObject)$ic32$, var15), f29640(var9, (SubLObject)$ic22$, var15));
        }
        if (var13 == $ic33$) {
            return module0035.f2411(f29635(var9), f29633(var9));
        }
        if (var13 == $ic34$) {
            return module0035.f2411(f29640(var9, (SubLObject)$ic20$, var15), f29633(var9));
        }
        if (var13 == $ic35$) {
            final SubLObject var17 = f29640(var9, (SubLObject)$ic23$, (SubLObject)NIL);
            if (var17.isNumber()) {
                return var17;
            }
            return f29640(var9, (SubLObject)$ic20$, var15);
        }
        else if (var13 == $ic36$) {
            final SubLObject var18 = f29640(var9, (SubLObject)$ic26$, (SubLObject)NIL);
            if (var18.isNumber()) {
                return var18;
            }
            return f29640(var9, (SubLObject)$ic25$, var15);
        }
        else {
            if (var13 == $ic37$) {
                final SubLObject var19 = f29640(var9, (SubLObject)$ic38$, (SubLObject)NIL);
                final SubLObject var20 = f29646(f29640(var9, (SubLObject)$ic19$, (SubLObject)UNPROVIDED));
                final SubLObject var21 = module0048.f3455(var19, var20);
                return var21;
            }
            if (var13 == $ic39$) {
                final SubLObject var19 = f29640(var9, (SubLObject)$ic38$, (SubLObject)NIL);
                final SubLObject var22 = f29640(var9, (SubLObject)$ic40$, (SubLObject)NIL);
                return f29647(var19, var22);
            }
            if (var13 == $ic41$) {
                final SubLObject var23 = f29640(var9, (SubLObject)$ic42$, (SubLObject)NIL);
                final SubLObject var24 = f29640(var9, (SubLObject)$ic43$, (SubLObject)NIL);
                final SubLObject var25 = f29640(var9, (SubLObject)$ic44$, (SubLObject)NIL);
                final SubLObject var26 = module0035.f2411(var25, var24);
                return module0035.f2412(var26, var23);
            }
            if (var13 == $ic45$) {
                final SubLObject var27 = f29640(var9, (SubLObject)$ic41$, (SubLObject)NIL);
                return module0035.f2412((SubLObject)((NIL != module0091.f6320((SubLObject)$ic46$)) ? Symbols.symbol_value((SubLObject)$ic46$) : NIL), var27);
            }
            if (var13 == $ic47$) {
                final SubLObject var28 = f29640(var9, (SubLObject)$ic48$, (SubLObject)UNPROVIDED);
                final SubLObject var29 = module0048.f3385((SubLObject)(var28.isList() ? var28 : NIL));
                return var29;
            }
            if (var13.isCons() && $ic49$ == var13.first()) {
                if (NIL != module0035.f1998(var13)) {
                    SubLObject var30 = (SubLObject)NIL;
                    SubLObject var31 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)$ic50$);
                    var30 = var13.first();
                    SubLObject var32 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var32, var13, (SubLObject)$ic50$);
                    var31 = var32.first();
                    var32 = var32.rest();
                    if (NIL == var32) {
                        final SubLObject var33 = f29629(var9);
                        return Functions.funcall(var31, var33);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic50$);
                }
                else {
                    SubLObject var30 = (SubLObject)NIL;
                    SubLObject var31 = (SubLObject)NIL;
                    SubLObject var34 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)$ic51$);
                    var30 = var13.first();
                    SubLObject var35 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var35, var13, (SubLObject)$ic51$);
                    var31 = var35.first();
                    var35 = var35.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var35, var13, (SubLObject)$ic51$);
                    var34 = var35.first();
                    var35 = var35.rest();
                    if (NIL == var35) {
                        final SubLObject var36 = f29629(var9);
                        return Functions.funcall(var31, var36, var34);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic51$);
                }
            }
            else {
                if (!var13.isCons() || $ic52$ != var13.first()) {
                    return Errors.error((SubLObject)$ic55$, var13);
                }
                if (NIL != module0035.f1998(var13)) {
                    SubLObject var37 = (SubLObject)NIL;
                    SubLObject var31 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)$ic53$);
                    var37 = var13.first();
                    SubLObject var38 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var38, var13, (SubLObject)$ic53$);
                    var31 = var38.first();
                    var38 = var38.rest();
                    if (NIL == var38) {
                        return Functions.funcall(var31, var9);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic53$);
                }
                else {
                    SubLObject var37 = (SubLObject)NIL;
                    SubLObject var31 = (SubLObject)NIL;
                    SubLObject var34 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var13, var13, (SubLObject)$ic54$);
                    var37 = var13.first();
                    SubLObject var39 = var13.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var39, var13, (SubLObject)$ic54$);
                    var31 = var39.first();
                    var39 = var39.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var39, var13, (SubLObject)$ic54$);
                    var34 = var39.first();
                    var39 = var39.rest();
                    if (NIL == var39) {
                        return Functions.funcall(var31, var9, var34);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic54$);
                }
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f29648(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var45) && NIL == $g3451$.getDynamicValue(var45)) {
            Errors.error((SubLObject)$ic56$);
        }
        return Numbers.divide(var44, $g3451$.getDynamicValue(var45));
    }
    
    public static SubLObject f29646(final SubLObject var46) {
        final SubLThread var47 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var47) && NIL == $g3451$.getDynamicValue(var47)) {
            Errors.error((SubLObject)$ic57$);
        }
        return Numbers.multiply(var46, $g3451$.getDynamicValue(var47));
    }
    
    public static SubLObject f29649(final SubLObject var9) {
        return f29631(var9, (SubLObject)$ic28$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29650(final SubLObject var9) {
        final SubLObject var10 = f29649(var9);
        return module0004.f104(var10, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29651(final SubLObject var9) {
        final SubLObject var10 = f29649(var9);
        return Equality.eq((SubLObject)$ic59$, var10);
    }
    
    public static SubLObject f29652(final SubLObject var9) {
        return module0035.f2405(f29635(var9), (SubLObject)$ic60$);
    }
    
    public static SubLObject f29653(final SubLObject var9) {
        return module0035.f2405(f29635(var9), (SubLObject)$ic61$);
    }
    
    public static SubLObject f29654(final SubLObject var9) {
        return module0035.f2405(f29635(var9), (SubLObject)TEN_INTEGER);
    }
    
    public static SubLObject f29655(final SubLObject var9) {
        return module0035.f2405(f29635(var9), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f29656(final SubLObject var9) {
        return module0035.f2405(f29635(var9), (SubLObject)$ic62$);
    }
    
    public static SubLObject f29657(final SubLObject var9) {
        return module0035.f2405(f29635(var9), (SubLObject)$ic63$);
    }
    
    public static SubLObject f29658(final SubLObject var9) {
        return module0035.f2406(f29635(var9), (SubLObject)$ic60$);
    }
    
    public static SubLObject f29659(final SubLObject var9) {
        return module0035.f2406(f29635(var9), (SubLObject)$ic61$);
    }
    
    public static SubLObject f29660(final SubLObject var9) {
        return module0035.f2406(f29635(var9), (SubLObject)TEN_INTEGER);
    }
    
    public static SubLObject f29661(final SubLObject var9) {
        return module0035.f2406(f29635(var9), (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f29662(final SubLObject var9) {
        return module0035.f2406(f29635(var9), (SubLObject)$ic62$);
    }
    
    public static SubLObject f29663(final SubLObject var9) {
        return module0035.f2406(f29635(var9), (SubLObject)$ic63$);
    }
    
    public static SubLObject f29664(final SubLObject var9) {
        return module0035.f2406(f29633(var9), (SubLObject)$ic60$);
    }
    
    public static SubLObject f29665(final SubLObject var9) {
        return module0035.f2422(f29640(var9, (SubLObject)$ic64$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29666(final SubLObject var9) {
        final SubLObject var10 = f29629(var9);
        final SubLObject var11 = module0423.f29562(var10).first();
        return module0202.f12589(var11, $ic65$);
    }
    
    public static SubLObject f29647(final SubLObject var21, SubLObject var24) {
        final SubLThread var25 = SubLProcess.currentSubLThread();
        var24 = module0035.f2391(conses_high.copy_list(var24), (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0067.f4880(Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var27 = (SubLObject)$ic66$;
        SubLObject var28 = (SubLObject)MINUS_ONE_INTEGER;
        SubLObject var29 = (SubLObject)MINUS_ONE_INTEGER;
        SubLObject var30 = (SubLObject)MINUS_ONE_INTEGER;
        SubLObject var31 = var21;
        SubLObject var32 = var24;
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            while (NIL != var30 && var33.numG(var30)) {
                var27 = Numbers.add(var27, (SubLObject)ONE_INTEGER);
                var29 = Numbers.add(var29, (SubLObject)ONE_INTEGER);
                var28 = var30;
                var30 = var31.first();
                var31 = var31.rest();
            }
            final SubLObject var34 = Numbers.subtract(var33, var28);
            module0084.f5762(var26, var27, var34);
            var32 = var32.rest();
            var33 = var32.first();
        }
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36;
        for (var36 = module0066.f4838(module0067.f4891(var26)); NIL == module0066.f4841(var36); var36 = module0066.f4840(var36)) {
            var25.resetMultipleValues();
            final SubLObject var37 = module0066.f4839(var36);
            final SubLObject var38 = var25.secondMultipleValue();
            var25.resetMultipleValues();
            var35 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var37, Sequences.nreverse(var38)), var35);
        }
        module0066.f4842(var36);
        return module0035.f2391(var35, Symbols.symbol_function((SubLObject)$ic67$));
    }
    
    public static SubLObject f29667(final SubLObject var1) {
        return module0035.f2327(var1);
    }
    
    public static SubLObject f29668(final SubLObject var61, final SubLObject var62, final SubLObject var9) {
        return (SubLObject)ConsesLow.list((SubLObject)$ic68$, var61, (SubLObject)$ic69$, var62, (SubLObject)$ic70$, var9);
    }
    
    public static SubLObject f29669(final SubLObject var63) {
        return conses_high.getf(var63, (SubLObject)$ic68$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29670(final SubLObject var63) {
        return conses_high.getf(var63, (SubLObject)$ic70$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29671(final SubLObject var63) {
        return conses_high.getf(var63, (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29672(final SubLObject var63) {
        return f29633(f29670(var63));
    }
    
    public static SubLObject f29673(final SubLObject var1) {
        return module0035.f2327(var1);
    }
    
    public static SubLObject f29674(final SubLObject var64, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic71$, Environment.get_network_name((SubLObject)UNPROVIDED), $ic72$, Time.get_universal_time(), $ic73$, module0107.f7624(), $ic74$, time_high.$internal_time_units_per_second$.getGlobalValue(), $ic75$, module0011.f353(), $ic76$, var65, $ic77$, var64 });
    }
    
    public static SubLObject f29675(final SubLObject var66, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (NIL == var66) {
            return (SubLObject)NIL;
        }
        final SubLObject var67 = var66.first();
        final SubLObject var68 = Mapping.mapcan(Symbols.symbol_function((SubLObject)$ic78$), var66, EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject var69 = var67;
        var69 = conses_high.putf(var69, (SubLObject)$ic77$, var68);
        if (NIL != var65) {
            var69 = conses_high.putf(var69, (SubLObject)$ic76$, var65);
        }
        return var69;
    }
    
    public static SubLObject f29676(final SubLObject var7) {
        return f29677(var7, (SubLObject)ConsesLow.list((SubLObject)$ic15$));
    }
    
    public static SubLObject f29677(final SubLObject var7, final SubLObject var10) {
        SubLObject var11 = conses_high.copy_list(var7);
        final SubLObject var12 = f29678(var7);
        SubLObject var13 = (SubLObject)NIL;
        SubLObject var14 = var12;
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            final SubLObject var16 = f29628(var15, var10);
            var13 = (SubLObject)ConsesLow.cons(var16, var13);
            var14 = var14.rest();
            var15 = var14.first();
        }
        var11 = conses_high.putf(var11, (SubLObject)$ic77$, var13);
        return var11;
    }
    
    public static SubLObject f29679(final SubLObject var72) {
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = var72;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var78_79 = (SubLObject)NIL;
        while (NIL != var75) {
            cdestructuring_bind.destructuring_bind_must_consp(var75, var72, (SubLObject)$ic79$);
            var78_79 = var75.first();
            var75 = var75.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var75, var72, (SubLObject)$ic79$);
            if (NIL == conses_high.member(var78_79, (SubLObject)$ic80$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var76 = (SubLObject)T;
            }
            if (var78_79 == $ic81$) {
                var74 = var75.first();
            }
            var75 = var75.rest();
        }
        if (NIL != var76 && NIL == var74) {
            cdestructuring_bind.cdestructuring_bind_error(var72, (SubLObject)$ic79$);
        }
        final SubLObject var77 = cdestructuring_bind.property_list_member((SubLObject)$ic71$, var72);
        final SubLObject var78 = (SubLObject)((NIL != var77) ? conses_high.cadr(var77) : NIL);
        final SubLObject var79 = cdestructuring_bind.property_list_member((SubLObject)$ic72$, var72);
        final SubLObject var80 = (SubLObject)((NIL != var79) ? conses_high.cadr(var79) : NIL);
        final SubLObject var81 = cdestructuring_bind.property_list_member((SubLObject)$ic73$, var72);
        final SubLObject var82 = (SubLObject)((NIL != var81) ? conses_high.cadr(var81) : NIL);
        final SubLObject var83 = cdestructuring_bind.property_list_member((SubLObject)$ic74$, var72);
        final SubLObject var84 = (SubLObject)((NIL != var83) ? conses_high.cadr(var83) : NIL);
        final SubLObject var85 = cdestructuring_bind.property_list_member((SubLObject)$ic75$, var72);
        final SubLObject var86 = (SubLObject)((NIL != var85) ? conses_high.cadr(var85) : NIL);
        final SubLObject var87 = cdestructuring_bind.property_list_member((SubLObject)$ic76$, var72);
        final SubLObject var88 = (SubLObject)((NIL != var87) ? conses_high.cadr(var87) : NIL);
        final SubLObject var89 = cdestructuring_bind.property_list_member((SubLObject)$ic82$, var72);
        SubLObject var91;
        final SubLObject var90 = var91 = (SubLObject)((NIL != var89) ? conses_high.cadr(var89) : NIL);
        SubLObject var92 = (SubLObject)NIL;
        var92 = var91.first();
        while (NIL != var91) {
            final SubLObject var93 = f29670(var92);
            var73 = (SubLObject)ConsesLow.cons(var93, var73);
            var91 = var91.rest();
            var92 = var91.first();
        }
        var73 = Sequences.nreverse(var73);
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic71$, var78, $ic72$, var80, $ic73$, var82, $ic74$, var84, $ic75$, var86, $ic76$, var88, $ic77$, var73 });
    }
    
    public static SubLObject f29680(final SubLObject var7, final SubLObject var13, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        return conses_high.getf(var7, var13, var15);
    }
    
    public static SubLObject f29681(final SubLObject var7) {
        return f29680(var7, (SubLObject)$ic76$, (SubLObject)NIL);
    }
    
    public static SubLObject f29678(final SubLObject var7) {
        return f29680(var7, (SubLObject)$ic77$, (SubLObject)NIL);
    }
    
    public static SubLObject f29682(final SubLObject var7) {
        return f29680(var7, (SubLObject)$ic75$, (SubLObject)NIL);
    }
    
    public static SubLObject f29683(final SubLObject var7) {
        return f29680(var7, (SubLObject)$ic74$, (SubLObject)NIL);
    }
    
    public static SubLObject f29684(SubLObject var7, final SubLObject var13, final SubLObject var93) {
        final SubLObject var94 = f29678(var7);
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = var94;
        SubLObject var97 = (SubLObject)NIL;
        var97 = var96.first();
        while (NIL != var96) {
            var95 = (SubLObject)ConsesLow.cons(conses_high.putf(conses_high.copy_list(var97), var13, var93), var95);
            var96 = var96.rest();
            var97 = var96.first();
        }
        var95 = Sequences.nreverse(var95);
        var7 = conses_high.putf(conses_high.copy_list(var7), (SubLObject)$ic77$, var95);
        return var7;
    }
    
    public static SubLObject f29685(final SubLObject var7, final SubLObject var16) {
        final SubLObject var17 = f29678(var7);
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = var17;
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            final SubLObject var21 = f29645(var20, var16);
            var18 = (SubLObject)ConsesLow.cons(var21, var18);
            var19 = var19.rest();
            var20 = var19.first();
        }
        return Sequences.nreverse(var18);
    }
    
    public static SubLObject f29686(final SubLObject var7, final SubLObject var14, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLObject var16 = f29678(var7);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = var16;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            final SubLObject var20 = f29631(var19, var14, var15);
            var17 = (SubLObject)ConsesLow.cons(var20, var17);
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f29687(final SubLObject var7, final SubLObject var13, SubLObject var15) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLObject var16 = f29678(var7);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = var16;
        SubLObject var19 = (SubLObject)NIL;
        var19 = var18.first();
        while (NIL != var18) {
            final SubLObject var20 = f29640(var19, var13, var15);
            var17 = (SubLObject)ConsesLow.cons(var20, var17);
            var18 = var18.rest();
            var19 = var18.first();
        }
        return Sequences.nreverse(var17);
    }
    
    public static SubLObject f29688(final SubLObject var7) {
        return f29687(var7, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29689(final SubLObject var7) {
        return Sequences.length(f29678(var7));
    }
    
    public static SubLObject f29690(final SubLObject var7) {
        return Sequences.delete_if((SubLObject)$ic83$, f29688(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29691(final SubLObject var7) {
        return module0035.delete_if_not((SubLObject)$ic84$, Sequences.delete_if((SubLObject)$ic83$, f29688(var7), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29692(final SubLObject var7) {
        final SubLObject var8 = f29690(var7);
        return f29693(var7, var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29694(final SubLObject var7) {
        final SubLObject var8 = f29691(var7);
        return f29693(var7, var8, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29695(final SubLObject var7) {
        final SubLObject var8 = f29696(var7);
        final SubLObject var9 = f29686(var8, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
        final SubLObject var10 = Sort.sort(var9, Symbols.symbol_function((SubLObject)$ic85$), (SubLObject)UNPROVIDED);
        return var10;
    }
    
    public static SubLObject f29697(final SubLObject var7, final SubLObject var103, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)$ic19$;
        }
        final SubLObject var104 = f29698(var14);
        final SubLObject var105 = f29699(var14);
        final SubLObject var106 = Sort.sort(conses_high.copy_list(f29678(var7)), (SubLObject)$ic86$, f29700(var14));
        final SubLObject var107 = f29701(var7, (SubLObject)UNPROVIDED);
        final SubLObject var108 = conses_high.getf(var107, var104, (SubLObject)UNPROVIDED);
        final SubLObject var109 = Sequences.length(var106);
        SubLObject var110 = (SubLObject)ZERO_INTEGER;
        SubLObject var111 = var108;
        while (var111.numLE(Numbers.multiply(var103, var108)) && var110.numL(var109)) {
            var110 = Numbers.add(var110, (SubLObject)ONE_INTEGER);
            final SubLObject var112 = module0035.f2519(var106, var110);
            final SubLObject var113 = f29702(var112, (SubLObject)ConsesLow.list(var14));
            var111 = conses_high.getf(var113, var105, (SubLObject)UNPROVIDED);
            PrintLow.format((SubLObject)T, (SubLObject)$ic87$, Numbers.add((SubLObject)ONE_INTEGER, Numbers.multiply((SubLObject)TWO_INTEGER, var110)), var111);
        }
        final SubLObject var114 = module0035.f2519(var106, Numbers.subtract(var110, (SubLObject)ONE_INTEGER));
        final SubLObject var115 = Mapping.mapcar((SubLObject)$ic88$, var114);
        return var115;
    }
    
    public static SubLObject f29698(final SubLObject var14) {
        if (var14.eql((SubLObject)$ic19$)) {
            return (SubLObject)$ic89$;
        }
        if (var14.eql((SubLObject)$ic21$)) {
            return (SubLObject)$ic90$;
        }
        if (var14.eql((SubLObject)$ic22$)) {
            return (SubLObject)$ic91$;
        }
        Errors.error((SubLObject)$ic92$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29699(final SubLObject var14) {
        if (var14.eql((SubLObject)$ic19$)) {
            return (SubLObject)$ic93$;
        }
        if (var14.eql((SubLObject)$ic21$)) {
            return (SubLObject)$ic94$;
        }
        if (var14.eql((SubLObject)$ic22$)) {
            return (SubLObject)$ic95$;
        }
        Errors.error((SubLObject)$ic96$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29700(final SubLObject var14) {
        if (var14.eql((SubLObject)$ic19$)) {
            return (SubLObject)$ic97$;
        }
        if (var14.eql((SubLObject)$ic21$)) {
            return (SubLObject)$ic98$;
        }
        if (var14.eql((SubLObject)$ic22$)) {
            return (SubLObject)$ic99$;
        }
        if (var14.eql((SubLObject)$ic20$)) {
            return (SubLObject)$ic100$;
        }
        if (var14.eql((SubLObject)$ic23$)) {
            return (SubLObject)$ic101$;
        }
        if (var14.eql((SubLObject)$ic24$)) {
            return (SubLObject)$ic102$;
        }
        if (var14.eql((SubLObject)$ic18$)) {
            return (SubLObject)$ic103$;
        }
        Errors.error((SubLObject)$ic104$, var14);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29703(final SubLObject var1) {
        return module0035.f2327(var1);
    }
    
    public static SubLObject f29704(final SubLObject var92, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { $ic71$, Environment.get_network_name((SubLObject)UNPROVIDED), $ic72$, Time.get_universal_time(), $ic73$, module0107.f7624(), $ic74$, time_high.$internal_time_units_per_second$.getGlobalValue(), $ic75$, module0011.f353(), $ic76$, var65, $ic82$, var92 });
    }
    
    public static SubLObject f29705(final SubLObject var116, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (NIL == var116) {
            return (SubLObject)NIL;
        }
        final SubLObject var117 = var116.first();
        final SubLObject var118 = Mapping.mapcan(Symbols.symbol_function((SubLObject)$ic105$), var116, EMPTY_SUBL_OBJECT_ARRAY);
        SubLObject var119 = var117;
        var119 = conses_high.putf(var119, (SubLObject)$ic82$, var118);
        if (NIL != var65) {
            var119 = conses_high.putf(var119, (SubLObject)$ic76$, var65);
        }
        return var119;
    }
    
    public static SubLObject f29706(final SubLObject var72) {
        return conses_high.getf(var72, (SubLObject)$ic76$, (SubLObject)NIL);
    }
    
    public static SubLObject f29707(final SubLObject var72) {
        return conses_high.getf(var72, (SubLObject)$ic74$, (SubLObject)NIL);
    }
    
    public static SubLObject f29708(final SubLObject var72) {
        return conses_high.getf(var72, (SubLObject)$ic82$, (SubLObject)NIL);
    }
    
    public static SubLObject f29709(final SubLObject var72) {
        return Mapping.mapcar((SubLObject)$ic106$, f29708(var72));
    }
    
    public static SubLObject f29710(final SubLObject var72) {
        return Sequences.delete_if((SubLObject)$ic83$, f29709(var72), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29711(final SubLObject var72) {
        final SubLObject var73 = f29710(var72);
        return f29712(var72, var73, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29713(final SubLObject var121, SubLObject var122, SubLObject var123, SubLObject var124, SubLObject var125) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)NIL;
        }
        if (var123 == UNPROVIDED) {
            var123 = (SubLObject)$ic10$;
        }
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        final SubLThread var126 = SubLProcess.currentSubLThread();
        assert NIL != module0423.f29532(var121) : var121;
        final SubLObject var127 = var122;
        assert NIL != module0035.f2015(var127) : var127;
        SubLObject var128 = var127;
        SubLObject var129 = (SubLObject)NIL;
        var129 = var128.first();
        while (NIL != var128) {
            assert NIL != module0360.f23809(var129) : var129;
            var128 = var128.rest();
            var129 = var128.first();
        }
        if (NIL != var123 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var123)) {
            throw new AssertionError(var123);
        }
        final SubLObject var130 = var124;
        assert NIL != module0035.f2327(var130) : var130;
        SubLObject var131;
        SubLObject var132;
        SubLObject var133;
        for (var131 = (SubLObject)NIL, var131 = var130; NIL != var131; var131 = conses_high.cddr(var131)) {
            var132 = var131.first();
            var133 = conses_high.cadr(var131);
            assert NIL != module0360.f23781(var132) : var132;
        }
        module0427.f30302();
        SubLObject var134 = (SubLObject)NIL;
        SubLObject var135 = (SubLObject)NIL;
        SubLObject var136 = (SubLObject)NIL;
        SubLObject var137 = (SubLObject)NIL;
        SubLObject var138 = (SubLObject)NIL;
        SubLObject var139 = (SubLObject)NIL;
        SubLObject var140 = (SubLObject)NIL;
        SubLObject var141 = (SubLObject)NIL;
        SubLObject var142 = (SubLObject)NIL;
        SubLObject var143 = (SubLObject)NIL;
        var124 = conses_high.copy_list(var124);
        if (NIL != module0018.$g739$.getDynamicValue(var126)) {
            var124 = conses_high.putf(var124, (SubLObject)$ic113$, (SubLObject)NIL);
        }
        if (NIL != var122) {
            var124 = conses_high.putf(var124, (SubLObject)$ic114$, var122);
        }
        if (NIL != f29714($g3442$.getDynamicValue(var126))) {
            var143 = f29715(var121, $g3442$.getDynamicValue(var126));
            f29716($g3442$.getDynamicValue(var126), var143);
            var124 = conses_high.putf(var124, (SubLObject)$ic115$, (SubLObject)T);
        }
        if (NIL != $g3453$.getDynamicValue(var126)) {
            var126.resetMultipleValues();
            final SubLObject var144 = module0423.f29604(var121);
            final SubLObject var145 = var126.secondMultipleValue();
            final SubLObject var146 = var126.thirdMultipleValue();
            var126.resetMultipleValues();
            module0006.f218($g3453$.getDynamicValue(var126), (SubLObject)$ic116$, inference_datastructures_inference_oc.f25595(var144, var145, var146), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var147 = $g3443$.currentBinding(var126);
        try {
            $g3443$.bind(var143, var126);
            final SubLObject var148 = module0311.$g2802$.getDynamicValue(var126);
            final SubLObject var149 = (SubLObject)((NIL != var148) ? NIL : Functions.funcall((SubLObject)makeSymbol("S#23749", "CYC")));
            final SubLObject var141_144 = module0311.$g2802$.currentBinding(var126);
            try {
                module0311.$g2802$.bind((SubLObject)T, var126);
                try {
                    var137 = (SubLObject)T;
                    SubLObject var150;
                    SubLObject var151;
                    SubLObject var141_145;
                    SubLObject var148_149;
                    SubLObject var150_151;
                    SubLObject var152_153;
                    SubLObject var154_155;
                    SubLObject var156_157;
                    SubLObject var158_159;
                    SubLObject var162_163;
                    SubLObject var164_165;
                    SubLObject var166_167;
                    SubLObject var168_169;
                    SubLObject var170_171;
                    SubLObject var172_173;
                    for (var150 = (SubLObject)NIL, var150 = (SubLObject)ZERO_INTEGER; var150.numL($g3452$.getDynamicValue(var126)); var150 = Numbers.add(var150, (SubLObject)ONE_INTEGER)) {
                        f29717($g3443$.getDynamicValue(var126), (SubLObject)$ic117$);
                        var151 = Time.get_internal_real_time();
                        if (NIL == module0018.$g629$.getDynamicValue(var126)) {
                            try {
                                var126.throwStack.push(module0003.$g3$.getGlobalValue());
                                var141_145 = Errors.$error_handler$.currentBinding(var126);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)$ic118$, var126);
                                    try {
                                        if (var150.eql((SubLObject)ZERO_INTEGER)) {
                                            var126.resetMultipleValues();
                                            var148_149 = f29718(var121, (SubLObject)NIL, var123, var124);
                                            var150_151 = var126.secondMultipleValue();
                                            var152_153 = var126.thirdMultipleValue();
                                            var154_155 = var126.fourthMultipleValue();
                                            var156_157 = var126.fifthMultipleValue();
                                            var158_159 = var126.sixthMultipleValue();
                                            var126.resetMultipleValues();
                                            var136 = var148_149;
                                            var137 = var150_151;
                                            var138 = var152_153;
                                            var139 = var154_155;
                                            var140 = var156_157;
                                            var141 = var158_159;
                                        }
                                        else {
                                            f29718(var121, (SubLObject)T, var123, var124);
                                        }
                                    }
                                    catch (Throwable var152) {
                                        Errors.handleThrowable(var152, (SubLObject)NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(var141_145, var126);
                                }
                            }
                            catch (Throwable var153) {
                                var135 = Errors.handleThrowable(var153, module0003.$g3$.getGlobalValue());
                            }
                            finally {
                                var126.throwStack.pop();
                            }
                        }
                        else if (var150.eql((SubLObject)ZERO_INTEGER)) {
                            var126.resetMultipleValues();
                            var162_163 = f29718(var121, (SubLObject)NIL, var123, var124);
                            var164_165 = var126.secondMultipleValue();
                            var166_167 = var126.thirdMultipleValue();
                            var168_169 = var126.fourthMultipleValue();
                            var170_171 = var126.fifthMultipleValue();
                            var172_173 = var126.sixthMultipleValue();
                            var126.resetMultipleValues();
                            var136 = var162_163;
                            var137 = var164_165;
                            var138 = var166_167;
                            var139 = var168_169;
                            var140 = var170_171;
                            var141 = var172_173;
                        }
                        else {
                            f29718(var121, (SubLObject)T, var123, var124);
                        }
                        var134 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var151), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    if (NIL != var137) {
                        f29717($g3443$.getDynamicValue(var126), (SubLObject)$ic119$);
                    }
                    else {
                        f29717($g3443$.getDynamicValue(var126), (SubLObject)$ic120$);
                    }
                    if (NIL == var135) {
                        try {
                            var126.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var141_146 = Errors.$error_handler$.currentBinding(var126);
                            try {
                                Errors.$error_handler$.bind((SubLObject)$ic118$, var126);
                                try {
                                    if (NIL != var138) {
                                        Errors.warn((SubLObject)$ic121$, var121);
                                        var140 = (SubLObject)$ic122$;
                                        f29717($g3443$.getDynamicValue(var126), (SubLObject)$ic123$);
                                        if (NIL != inference_datastructures_inference_oc.f25417(var136)) {
                                            var139 = module0409.f28524(var136, inference_datastructures_inference_oc.f25657(var136));
                                            var141 = inference_datastructures_inference_oc.f25804(var136);
                                        }
                                    }
                                    if (NIL == var137) {
                                        if (!Sequences.length(var122).numE(Sequences.length(var141))) {
                                            if (NIL == var141) {
                                                Errors.error((SubLObject)$ic124$, var121);
                                            }
                                            else {
                                                Errors.error((SubLObject)$ic125$, var121);
                                            }
                                        }
                                        var142 = module0035.f2333(var122, var141);
                                    }
                                    if (NIL != var138) {
                                        if (NIL != module0004.f104((SubLObject)$ic19$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                            var142 = conses_high.putf(var142, (SubLObject)$ic19$, var123);
                                        }
                                        if (NIL != module0004.f104((SubLObject)$ic20$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                            var142 = conses_high.putf(var142, (SubLObject)$ic20$, var123);
                                        }
                                    }
                                }
                                catch (Throwable var154) {
                                    Errors.handleThrowable(var154, (SubLObject)NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var141_146, var126);
                            }
                        }
                        catch (Throwable var155) {
                            var135 = Errors.handleThrowable(var155, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var126.throwStack.pop();
                        }
                    }
                    if (NIL != var135) {
                        f29717($g3443$.getDynamicValue(var126), (SubLObject)$ic2$);
                        var140 = module0360.f23875(PrintLow.format((SubLObject)NIL, (SubLObject)$ic126$, var121, var135));
                    }
                    if (NIL != var137) {
                        var142 = ConsesLow.nconc(new SubLObject[] { (NIL != module0004.f104((SubLObject)$ic19$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)$ic19$, var134) : NIL, (NIL != module0004.f104((SubLObject)$ic20$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)$ic20$, var134) : NIL, (NIL != module0004.f104((SubLObject)$ic18$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? (($ic59$ == var140) ? ConsesLow.list((SubLObject)$ic18$, (SubLObject)ONE_INTEGER) : ConsesLow.list((SubLObject)$ic18$, (SubLObject)ZERO_INTEGER)) : NIL, ($ic59$ == var140) ? ConsesLow.nconc((SubLObject)((NIL != module0004.f104((SubLObject)$ic21$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)$ic21$, var134) : NIL), (SubLObject)((NIL != module0004.f104((SubLObject)$ic22$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) ? ConsesLow.list((SubLObject)$ic22$, var134) : NIL)) : NIL });
                    }
                    if (NIL != module0360.f23871(var140)) {
                        Errors.warn((SubLObject)$ic127$, var121, module0360.f23876(var140));
                    }
                    if (NIL != module0360.f23866(var140) && $ic128$ != var140) {
                        Errors.warn((SubLObject)$ic129$, var140, var121);
                    }
                    if (NIL == f29714($g3442$.getDynamicValue(var126)) && NIL != module0018.$g738$.getDynamicValue(var126) && NIL != inference_datastructures_inference_oc.f25417(var136)) {
                        inference_datastructures_inference_oc.f25476(var136);
                    }
                }
                finally {
                    final SubLObject var141_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(var126);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var126);
                        if (NIL == var148) {
                            Functions.funcall((SubLObject)makeSymbol("S#23750", "CYC"), var149);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var141_147, var126);
                    }
                }
            }
            finally {
                module0311.$g2802$.rebind(var141_144, var126);
            }
        }
        finally {
            $g3443$.rebind(var147, var126);
        }
        final SubLObject var156 = (SubLObject)ConsesLow.listS((SubLObject)$ic16$, var121, ConsesLow.append((SubLObject)((NIL != var124) ? ConsesLow.list((SubLObject)$ic130$, var124) : NIL), (SubLObject)((NIL != var125) ? ConsesLow.list((SubLObject)$ic15$, var139) : NIL), (SubLObject)ConsesLow.listS((SubLObject)$ic28$, var140, ConsesLow.append(var142, (SubLObject)NIL))));
        if (NIL != f29719(var143)) {
            f29720(var143, var156);
        }
        return var156;
    }
    
    public static SubLObject f29718(final SubLObject var121, final SubLObject var176, final SubLObject var123, final SubLObject var124) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        var177.resetMultipleValues();
        final SubLObject var178 = f29721(var121, var123, var124);
        final SubLObject var179 = var177.secondMultipleValue();
        final SubLObject var180 = var177.thirdMultipleValue();
        final SubLObject var181 = var177.fourthMultipleValue();
        final SubLObject var182 = var177.fifthMultipleValue();
        final SubLObject var183 = var177.sixthMultipleValue();
        var177.resetMultipleValues();
        if (NIL != var176) {
            inference_datastructures_inference_oc.f25476(var178);
        }
        return Values.values(var178, var179, var180, var181, var182, var183);
    }
    
    public static SubLObject f29721(final SubLObject var121, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        SubLObject var126 = (SubLObject)NIL;
        SubLObject var127 = (SubLObject)NIL;
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = (SubLObject)NIL;
        SubLObject var130 = (SubLObject)NIL;
        SubLObject var131 = (SubLObject)NIL;
        final SubLObject var132 = (SubLObject)NIL;
        f29722(var121);
        SubLObject var133 = (SubLObject)NIL;
        try {
            var133 = module0408.f28498(var123);
            var125.resetMultipleValues();
            final SubLObject var185_186 = (NIL != var132) ? module0423.f29609(var121, var124) : module0423.f29608(var121, var124);
            final SubLObject var187_188 = var125.secondMultipleValue();
            final SubLObject var189_190 = var125.thirdMultipleValue();
            final SubLObject var191_192 = var125.fourthMultipleValue();
            var125.resetMultipleValues();
            var129 = var185_186;
            var130 = var187_188;
            var126 = var189_190;
            var131 = var191_192;
        }
        finally {
            final SubLObject var134 = Threads.$is_thread_performing_cleanupP$.currentBinding(var125);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var125);
                module0408.f28499(var133);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var134, var125);
            }
        }
        var127 = module0360.f23866(var130);
        var128 = Equality.eq((SubLObject)$ic131$, var130);
        return Values.values(var126, var127, var128, var129, var130, var131);
    }
    
    public static SubLObject f29722(final SubLObject var121) {
        if (NIL == module0035.f2201(Functions.funcall((SubLObject)makeSymbol("S#32757", "CYC")), f29723(var121), (SubLObject)UNPROVIDED)) {
            Functions.funcall((SubLObject)makeSymbol("S#32758", "CYC"));
            Functions.funcall((SubLObject)makeSymbol("S#32759", "CYC"));
            return Functions.funcall((SubLObject)makeSymbol("S#32760", "CYC"), f29723(var121));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29723(final SubLObject var121) {
        return (SubLObject)((NIL != module0212.f13762(var121)) ? module0220.f14565(var121, $ic132$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
    }
    
    public static SubLObject f29724(final SubLObject var193) {
        final SubLObject var194 = module0633.f38713(var193, (SubLObject)UNPROVIDED);
        return (SubLObject)((NIL != var194) ? f29723(var194) : NIL);
    }
    
    public static SubLObject f29725(final SubLObject var193) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var193) && (NIL != module0220.f14547(var193, $ic133$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14547(var193, $ic134$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0220.f14547(var193, $ic135$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f29726(final SubLObject var193, SubLObject var194, SubLObject var123, SubLObject var124, SubLObject var125, SubLObject var195) {
        if (var194 == UNPROVIDED) {
            var194 = (SubLObject)NIL;
        }
        if (var123 == UNPROVIDED) {
            var123 = $g3450$.getDynamicValue();
        }
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        if (var195 == UNPROVIDED) {
            var195 = (SubLObject)NIL;
        }
        final SubLThread var196 = SubLProcess.currentSubLThread();
        assert NIL != module0633.f38716(var193, (SubLObject)UNPROVIDED) : var193;
        final SubLObject var197 = var194;
        assert NIL != module0035.f2015(var197) : var197;
        SubLObject var198 = var197;
        SubLObject var199 = (SubLObject)NIL;
        var199 = var198.first();
        while (NIL != var198) {
            assert NIL != module0360.f23809(var199) : var199;
            var198 = var198.rest();
            var199 = var198.first();
        }
        if (NIL != var123 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var123)) {
            throw new AssertionError(var123);
        }
        final SubLObject var200 = var124;
        assert NIL != module0035.f2327(var200) : var200;
        SubLObject var201;
        SubLObject var202;
        SubLObject var203;
        for (var201 = (SubLObject)NIL, var201 = var200; NIL != var201; var201 = conses_high.cddr(var201)) {
            var202 = var201.first();
            var203 = conses_high.cadr(var201);
            assert NIL != module0360.f23781(var202) : var202;
        }
        SubLObject var204 = (SubLObject)NIL;
        SubLObject var205 = (SubLObject)NIL;
        SubLObject var206 = (SubLObject)NIL;
        final SubLObject var207 = f29725(var193);
        final SubLObject var208 = (SubLObject)NIL;
        if (NIL != var207) {
            var195 = (SubLObject)T;
        }
        if (NIL != var195) {
            var206 = f29727(var193, $g3441$.getDynamicValue(var196));
            if (NIL != module0059.f4266() && NIL == module0635.f38788(module0059.f4266())) {
                module0635.f38794(f29728(var206), (SubLObject)UNPROVIDED);
            }
            if (NIL != f29729($g3441$.getDynamicValue(var196))) {
                f29730($g3441$.getDynamicValue(var196), var206);
            }
        }
        final SubLObject var209 = $g3442$.currentBinding(var196);
        try {
            $g3442$.bind(var206, var196);
            final SubLObject var210 = module0633.f38713(var193, (SubLObject)UNPROVIDED);
            final SubLObject var211 = f29731(module0633.f38724(var193, (SubLObject)UNPROVIDED));
            final SubLObject var212 = conses_high.union(var211, var194, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            final SubLObject var213 = module0423.f29582(var193);
            try {
                SubLObject var214 = conses_high.copy_list(var124);
                if (NIL == var213) {
                    var214 = conses_high.putf(var214, (SubLObject)$ic137$, (SubLObject)$ic138$);
                }
                var205 = f29713(var210, var212, var123, var214, (SubLObject)T);
                final SubLObject var215 = f29630(var205);
                if (NIL != var213) {
                    var204 = f29732(var193, var215, (SubLObject)NIL);
                }
                else {
                    final SubLObject var216 = var215.first();
                    final SubLObject var217 = conses_high.second(var215);
                    var204 = f29732(var193, var216, var217);
                }
            }
            finally {
                final SubLObject var141_206 = Threads.$is_thread_performing_cleanupP$.currentBinding(var196);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var196);
                    if (NIL != var205 && NIL == var125) {
                        var205 = f29627(var205);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var141_206, var196);
                }
            }
        }
        finally {
            $g3442$.rebind(var209, var196);
        }
        if (NIL != var208) {
            var204 = (SubLObject)$ic2$;
        }
        final SubLObject var218 = f29668(var193, var204, var205);
        if (NIL != f29714(var206)) {
            f29733(var206, var218);
        }
        return var218;
    }
    
    public static SubLObject f29731(final SubLObject var208) {
        SubLObject var209 = (SubLObject)NIL;
        SubLObject var210 = var208;
        SubLObject var211 = (SubLObject)NIL;
        var211 = var210.first();
        while (NIL != var210) {
            final SubLObject var212 = f29734(var211);
            if (NIL != var212) {
                var209 = (SubLObject)ConsesLow.cons(var212, var209);
            }
            else if (!var211.eql($ic139$)) {
                Errors.warn((SubLObject)$ic140$, var211);
            }
            var210 = var210.rest();
            var211 = var210.first();
        }
        return Sequences.nreverse(var209);
    }
    
    public static SubLObject f29734(final SubLObject var209) {
        return module0035.f2294($g3454$.getGlobalValue(), var209, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29732(final SubLObject var193, final SubLObject var211, final SubLObject var205) {
        final SubLThread var212 = SubLProcess.currentSubLThread();
        if (NIL != module0426.f30110(var193)) {
            return f29735(var193, var211);
        }
        if (NIL != module0423.f29582(var193)) {
            if (NIL == f29736(var211, (SubLObject)ConsesLow.list(Functions.funcall((SubLObject)makeSymbol("S#32766", "CYC"), var193)))) {
                return (SubLObject)$ic1$;
            }
        }
        else {
            final SubLObject var213 = module0633.f38743(var211, var205);
            if (NIL == f29737(var211, module0633.f38730(var193, (SubLObject)UNPROVIDED)) || NIL == f29738(var211, module0633.f38731(var193, (SubLObject)UNPROVIDED)) || NIL == f29739(var211, module0633.f38732(var193, (SubLObject)UNPROVIDED))) {
                return (SubLObject)$ic1$;
            }
            if (NIL == module0633.f38729(var193, (SubLObject)UNPROVIDED) && (NIL == f29740(var213, module0633.f38725(var193, (SubLObject)UNPROVIDED), var205) || NIL == f29741(var213, module0633.f38727(var193, (SubLObject)UNPROVIDED), var205) || NIL == f29742(var213, module0633.f38728(var193, (SubLObject)UNPROVIDED), var205))) {
                return (SubLObject)$ic1$;
            }
            if (NIL != f29725(var193)) {
                final SubLObject var214 = f29743($g3442$.getDynamicValue(var212));
                final SubLObject var215 = f29744(var214);
                final SubLObject var216 = inference_datastructures_inference_oc.f25484(var215);
                final SubLObject var217 = inference_datastructures_inference_oc.f25483(var215);
                final SubLObject var218 = inference_datastructures_inference_oc.f25485(var215);
                final SubLObject var219 = inference_datastructures_inference_oc.f25421(var215);
                if (NIL == f29745(var193, var219, var218, var216, var217, var205, var211) || NIL == f29746(var193, var219, var218, var216, var217, var205) || NIL == f29747(var193, var219, var218, var216, var217, var205)) {
                    return (SubLObject)$ic1$;
                }
            }
        }
        return (SubLObject)$ic0$;
    }
    
    public static SubLObject f29735(final SubLObject var193, final SubLObject var211) {
        if (NIL != module0426.f30167(var193, var211, (SubLObject)UNPROVIDED)) {
            return (SubLObject)$ic0$;
        }
        return (SubLObject)$ic1$;
    }
    
    public static SubLObject f29745(final SubLObject var193, final SubLObject var215, final SubLObject var214, final SubLObject var139, final SubLObject var140, final SubLObject var205, final SubLObject var211) {
        SubLObject var216 = module0220.f14565(var193, $ic133$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var217 = (SubLObject)NIL;
        var217 = var216.first();
        while (NIL != var216) {
            final SubLObject var218 = f29748(var217, var215, var214, var139, var140, var205);
            final SubLObject var219 = var218.first();
            if (NIL == module0035.f2210(var211, var219)) {
                return (SubLObject)NIL;
            }
            var216 = var216.rest();
            var217 = var216.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29746(final SubLObject var193, final SubLObject var215, final SubLObject var214, final SubLObject var139, final SubLObject var140, final SubLObject var205) {
        SubLObject var216 = module0220.f14565(var193, $ic134$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var217 = (SubLObject)NIL;
        var217 = var216.first();
        while (NIL != var216) {
            final SubLObject var218 = f29748(var217, var215, var214, var139, var140, var205);
            final SubLObject var219 = var218.first();
            if (NIL == var219) {
                return (SubLObject)NIL;
            }
            var216 = var216.rest();
            var217 = var216.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29747(final SubLObject var193, final SubLObject var215, final SubLObject var214, final SubLObject var139, final SubLObject var140, final SubLObject var205) {
        SubLObject var216 = module0220.f14565(var193, $ic135$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var217 = (SubLObject)NIL;
        var217 = var216.first();
        while (NIL != var216) {
            final SubLObject var218 = f29748(var217, var215, var214, var139, var140, var205);
            final SubLObject var219 = var218.first();
            if (NIL != var219) {
                return (SubLObject)NIL;
            }
            var216 = var216.rest();
            var217 = var216.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29748(final SubLObject var216, final SubLObject var215, final SubLObject var214, final SubLObject var139, SubLObject var140, final SubLObject var205) {
        final SubLObject var217 = module0233.f15362(var205, module0285.f18933(var216, (SubLObject)UNPROVIDED));
        final SubLObject var218 = module0276.f18287((SubLObject)ConsesLow.list(var217, var214), (SubLObject)UNPROVIDED);
        var140 = module0035.f2341(var140, (SubLObject)ConsesLow.listS((SubLObject)$ic142$, var215, (SubLObject)$ic143$));
        return module0409.f28506(var218, var139, var140);
    }
    
    public static SubLObject f29740(final SubLObject var212, final SubLObject var221, final SubLObject var205) {
        if (NIL == var221) {
            return Values.values((SubLObject)T, (SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var222 = module0233.f15406(var221);
        final SubLObject var223 = module0633.f38743(var222, var205);
        final SubLObject var224 = module0035.f2220(var223, var212, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var225 = module0035.f2220(var212, var223, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var226 = (SubLObject)makeBoolean(NIL == var224 && NIL == var225);
        return Values.values(var226, var224, var225);
    }
    
    public static SubLObject f29741(final SubLObject var212, final SubLObject var227, final SubLObject var205) {
        if (NIL == var227) {
            return Values.values((SubLObject)T, (SubLObject)NIL);
        }
        final SubLObject var228 = module0233.f15406(module0202.f12791(var227, (SubLObject)UNPROVIDED));
        final SubLObject var229 = module0633.f38743(var228, var205);
        final SubLObject var230 = module0035.f2220(var229, var212, Symbols.symbol_function((SubLObject)EQUAL));
        final SubLObject var231 = Types.sublisp_null(var230);
        return Values.values(var231, var230);
    }
    
    public static SubLObject f29742(final SubLObject var212, final SubLObject var230, final SubLObject var205) {
        if (NIL == var230) {
            return Values.values((SubLObject)T, (SubLObject)NIL);
        }
        final SubLObject var231 = module0233.f15406(module0202.f12791(var230, (SubLObject)UNPROVIDED));
        final SubLObject var232 = module0633.f38743(var231, var205);
        final SubLObject var233 = module0076.f5290(var232, var212, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var234 = Types.sublisp_null(var233);
        return Values.values(var234, var233);
    }
    
    public static SubLObject f29737(final SubLObject var211, final SubLObject var234) {
        if (NIL == var234) {
            return (SubLObject)T;
        }
        final SubLObject var235 = Numbers.numE(var234, Sequences.length(var211));
        final SubLObject var236 = Sequences.length(var211);
        return Values.values(var235, var234, var236);
    }
    
    public static SubLObject f29738(final SubLObject var211, final SubLObject var237) {
        if (NIL == var237) {
            return (SubLObject)T;
        }
        final SubLObject var238 = Numbers.numLE(var237, Sequences.length(var211));
        final SubLObject var239 = Sequences.length(var211);
        return Values.values(var238, var237, var239);
    }
    
    public static SubLObject f29739(final SubLObject var211, final SubLObject var238) {
        if (NIL == var238) {
            return (SubLObject)T;
        }
        final SubLObject var239 = Numbers.numGE(var238, Sequences.length(var211));
        final SubLObject var240 = Sequences.length(var211);
        return Values.values(var239, var238, var240);
    }
    
    public static SubLObject f29736(final SubLObject var239, final SubLObject var240) {
        return module0331.f22370(var239, var240, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29749(final SubLObject var193, final SubLObject var211, final SubLObject var205) {
        if (f29732(var193, var211, var205) != $ic1$) {
            return (SubLObject)NIL;
        }
        if (NIL != module0423.f29582(var193)) {
            return f29750(var193, var211);
        }
        final SubLObject var212 = f29751(var193, var211);
        final SubLObject var213 = f29752(var193, var211, var205);
        return module0035.remove_if_not(Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ConsesLow.list(var212, var213), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29750(final SubLObject var193, final SubLObject var211) {
        return Sequences.cconcatenate((SubLObject)$ic144$, new SubLObject[] { module0006.f203(var211), $ic145$, module0006.f203(Functions.funcall((SubLObject)makeSymbol("S#32766", "CYC"), var193)) });
    }
    
    public static SubLObject f29751(final SubLObject var193, final SubLObject var211) {
        final SubLThread var212 = SubLProcess.currentSubLThread();
        var212.resetMultipleValues();
        SubLObject var213 = f29737(var211, module0633.f38730(var193, (SubLObject)UNPROVIDED));
        SubLObject var214 = var212.secondMultipleValue();
        SubLObject var215 = var212.thirdMultipleValue();
        var212.resetMultipleValues();
        if (NIL == var213) {
            return Sequences.cconcatenate((SubLObject)$ic146$, new SubLObject[] { module0006.f203(var214), $ic147$, module0006.f203(var215), $ic148$ });
        }
        var212.resetMultipleValues();
        var213 = f29738(var211, module0633.f38731(var193, (SubLObject)UNPROVIDED));
        var214 = var212.secondMultipleValue();
        var215 = var212.thirdMultipleValue();
        var212.resetMultipleValues();
        if (NIL == var213) {
            return Sequences.cconcatenate((SubLObject)$ic149$, new SubLObject[] { module0006.f203(var214), $ic147$, module0006.f203(var215), $ic148$ });
        }
        var212.resetMultipleValues();
        var213 = f29739(var211, module0633.f38732(var193, (SubLObject)UNPROVIDED));
        var214 = var212.secondMultipleValue();
        var215 = var212.thirdMultipleValue();
        var212.resetMultipleValues();
        if (NIL == var213) {
            return Sequences.cconcatenate((SubLObject)$ic150$, new SubLObject[] { module0006.f203(var214), $ic147$, module0006.f203(var215), $ic148$ });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29752(final SubLObject var193, final SubLObject var211, final SubLObject var205) {
        final SubLThread var212 = SubLProcess.currentSubLThread();
        SubLObject var213 = (SubLObject)$ic151$;
        final SubLObject var214 = module0633.f38743(var211, var205);
        var212.resetMultipleValues();
        SubLObject var215 = f29740(var214, module0633.f38725(var193, (SubLObject)UNPROVIDED), var205);
        SubLObject var216 = var212.secondMultipleValue();
        final SubLObject var217 = var212.thirdMultipleValue();
        var212.resetMultipleValues();
        if (NIL == var215) {
            if (NIL != var216) {
                var213 = Sequences.cconcatenate(var213, new SubLObject[] { $ic152$, f29753(var216) });
                if (NIL != var217) {
                    var213 = Sequences.cconcatenate(module0006.f203(var213), module0006.$g11$.getGlobalValue());
                }
            }
            if (NIL != var217) {
                var213 = Sequences.cconcatenate(var213, new SubLObject[] { $ic153$, f29753(var217) });
            }
        }
        if (NIL != module0038.f2611(var213)) {
            return var213;
        }
        var212.resetMultipleValues();
        var215 = f29741(var214, module0633.f38727(var193, (SubLObject)UNPROVIDED), var205);
        var216 = var212.secondMultipleValue();
        var212.resetMultipleValues();
        if (NIL == var215) {
            var213 = Sequences.cconcatenate(var213, new SubLObject[] { $ic152$, f29753(var216) });
        }
        if (NIL != module0038.f2611(var213)) {
            return var213;
        }
        var212.resetMultipleValues();
        var215 = f29742(var214, module0633.f38728(var193, (SubLObject)UNPROVIDED), var205);
        final SubLObject var218 = var212.secondMultipleValue();
        var212.resetMultipleValues();
        if (NIL == var215) {
            var213 = Sequences.cconcatenate(var213, new SubLObject[] { $ic153$, f29753(var218) });
        }
        if (NIL != module0038.f2611(var213)) {
            return var213;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29753(final SubLObject var243) {
        SubLObject var244 = (SubLObject)$ic151$;
        SubLObject var245 = var243;
        SubLObject var246 = (SubLObject)NIL;
        var246 = var245.first();
        while (NIL != var245) {
            var244 = Sequences.cconcatenate(var244, Sequences.cconcatenate(module0006.$g11$.getGlobalValue(), new SubLObject[] { $ic154$, module0006.f203(var246) }));
            var245 = var245.rest();
            var246 = var245.first();
        }
        return var244;
    }
    
    public static SubLObject f29754(final SubLObject var245, SubLObject var122, SubLObject var123, SubLObject var124, SubLObject var246, SubLObject var65, SubLObject var247, SubLObject var248, SubLObject var249, SubLObject var250, SubLObject var251, SubLObject var252, SubLObject var253) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)NIL;
        }
        if (var123 == UNPROVIDED) {
            var123 = $g3162$.getGlobalValue();
        }
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)T;
        }
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var247 == UNPROVIDED) {
            var247 = (SubLObject)NIL;
        }
        if (var248 == UNPROVIDED) {
            var248 = (SubLObject)ZERO_INTEGER;
        }
        if (var249 == UNPROVIDED) {
            var249 = (SubLObject)NIL;
        }
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)NIL;
        }
        if (var251 == UNPROVIDED) {
            var251 = (SubLObject)$ic155$;
        }
        if (var252 == UNPROVIDED) {
            var252 = (SubLObject)NIL;
        }
        if (var253 == UNPROVIDED) {
            var253 = (SubLObject)NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (NIL != var253 && !areAssertionsDisabledFor(me) && NIL == module0075.f5193(var253)) {
            throw new AssertionError(var253);
        }
        final SubLObject var255 = f29755(var245, var250, var252);
        final SubLObject var256 = (SubLObject)((NIL != var249) ? Numbers.add(var248, var249) : NIL);
        SubLObject var257 = (SubLObject)ZERO_INTEGER;
        SubLObject var258 = (SubLObject)NIL;
        SubLObject var259 = (SubLObject)NIL;
        SubLObject var260 = (SubLObject)NIL;
        try {
            var254.throwStack.push($ic157$);
            final SubLObject var261 = (SubLObject)$ic157$;
            SubLObject var262 = (SubLObject)NIL;
            final SubLObject var263 = Errors.$restarts$.currentBinding(var254);
            try {
                Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var261, (SubLObject)$ic158$), Errors.$restarts$.getDynamicValue(var254)), var254);
                try {
                    var254.throwStack.push(var261);
                    final SubLObject var264 = Functions.funcall((SubLObject)makeSymbol("S#23749", "CYC"));
                    final SubLObject var141_262 = module0311.$g2802$.currentBinding(var254);
                    try {
                        module0311.$g2802$.bind((SubLObject)T, var254);
                        try {
                            if (NIL != var247) {
                                var259 = f29756(var247, var251);
                            }
                            if (NIL != var259 && $ic155$ == var251) {
                                f29757(var259, var65);
                            }
                            final SubLObject var265 = var255;
                            module0012.$g82$.setDynamicValue((SubLObject)$ic159$, var254);
                            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var254);
                            module0012.$g83$.setDynamicValue(Sequences.length(var265), var254);
                            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var254);
                            final SubLObject var141_263 = module0012.$g75$.currentBinding(var254);
                            final SubLObject var266 = module0012.$g76$.currentBinding(var254);
                            final SubLObject var267 = module0012.$g77$.currentBinding(var254);
                            final SubLObject var268 = module0012.$g78$.currentBinding(var254);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var254);
                                module0012.$g76$.bind((SubLObject)NIL, var254);
                                module0012.$g77$.bind((SubLObject)T, var254);
                                module0012.$g78$.bind(Time.get_universal_time(), var254);
                                module0012.f478(module0012.$g82$.getDynamicValue(var254));
                                SubLObject var269 = var265;
                                SubLObject var270 = (SubLObject)NIL;
                                var270 = var269.first();
                                while (NIL != var269) {
                                    module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var254), module0012.$g83$.getDynamicValue(var254));
                                    module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var254), (SubLObject)ONE_INTEGER), var254);
                                    if (var248.isPositive()) {
                                        var248 = Numbers.subtract(var248, (SubLObject)ONE_INTEGER);
                                    }
                                    else if (NIL != module0423.f29593(var270)) {
                                        if (NIL == module0012.$silent_progressP$.getDynamicValue(var254)) {
                                            module0006.f218((SubLObject)T, (SubLObject)$ic160$, var270, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        if (NIL != $g3453$.getDynamicValue(var254)) {
                                            module0006.f218($g3453$.getDynamicValue(var254), (SubLObject)$ic161$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0006.f218($g3453$.getDynamicValue(var254), (SubLObject)$ic162$, var270, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        }
                                        final SubLObject var271 = f29713(var270, var122, var123, var124, var246);
                                        var258 = (SubLObject)ConsesLow.cons(var271, var258);
                                        if (var259.isStream()) {
                                            f29758(var271, var259);
                                        }
                                        module0075.f5253(var253);
                                    }
                                    else {
                                        Errors.warn((SubLObject)$ic163$, var270);
                                    }
                                    var257 = Numbers.add(var257, (SubLObject)ONE_INTEGER);
                                    if (NIL != var256 && var257.numGE(var256)) {
                                        f29759();
                                    }
                                    var269 = var269.rest();
                                    var270 = var269.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var268, var254);
                                module0012.$g77$.rebind(var267, var254);
                                module0012.$g76$.rebind(var266, var254);
                                module0012.$g75$.rebind(var141_263, var254);
                            }
                            if (var259.isStream()) {
                                streams_high.close(var259, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            final SubLObject var141_264 = Threads.$is_thread_performing_cleanupP$.currentBinding(var254);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var254);
                                Functions.funcall((SubLObject)makeSymbol("S#23750", "CYC"), var264);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var141_264, var254);
                            }
                        }
                    }
                    finally {
                        module0311.$g2802$.rebind(var141_262, var254);
                    }
                }
                catch (Throwable var272) {
                    var262 = Errors.handleThrowable(var272, var261);
                }
                finally {
                    var254.throwStack.pop();
                }
            }
            finally {
                Errors.$restarts$.rebind(var263, var254);
            }
        }
        catch (Throwable var273) {
            var260 = Errors.handleThrowable(var273, (SubLObject)$ic157$);
        }
        finally {
            var254.throwStack.pop();
        }
        var258 = Sequences.nreverse(var258);
        final SubLObject var274 = f29674(var258, var65);
        return Values.values(var274, var257);
    }
    
    public static SubLObject f29759() {
        return Dynamic.sublisp_throw((SubLObject)$ic157$, (SubLObject)NIL);
    }
    
    public static SubLObject f29755(final SubLObject var245, SubLObject var250, SubLObject var252) {
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)NIL;
        }
        if (var252 == UNPROVIDED) {
            var252 = (SubLObject)NIL;
        }
        if (NIL != module0035.f2192((SubLObject)$ic164$, var245)) {
            return ConsesLow.append(var245, var252);
        }
        SubLObject var253 = f29760(var245, $ic165$);
        if (NIL != var250) {
            var253 = module0035.f2097(var253);
        }
        else {
            var253 = f29761(var253);
        }
        return ConsesLow.append(var253, var252);
    }
    
    public static SubLObject f29761(final SubLObject var254) {
        return f29762(var254, (SubLObject)$ic166$);
    }
    
    public static SubLObject f29763(final SubLObject var271) {
        return f29762(var271, (SubLObject)$ic167$);
    }
    
    public static SubLObject f29762(final SubLObject var272, final SubLObject var273) {
        final SubLThread var274 = SubLProcess.currentSubLThread();
        SubLObject var275 = module0213.f13926(var272, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var277;
        final SubLObject var276 = var277 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var278 = module0034.$g879$.currentBinding(var274);
        try {
            module0034.$g879$.bind(var277, var274);
            SubLObject var279 = (SubLObject)NIL;
            if (NIL != var277 && NIL == module0034.f1842(var277)) {
                var279 = module0034.f1869(var277);
                final SubLObject var280 = Threads.current_process();
                if (NIL == var279) {
                    module0034.f1873(var277, var280);
                }
                else if (!var279.eql(var280)) {
                    Errors.error((SubLObject)$ic168$);
                }
            }
            try {
                var275 = module0213.f13926(var275, (SubLObject)NIL, (SubLObject)T, (SubLObject)T, (SubLObject)T, var273, (SubLObject)UNPROVIDED);
            }
            finally {
                final SubLObject var141_278 = Threads.$is_thread_performing_cleanupP$.currentBinding(var274);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var274);
                    if (NIL != var277 && NIL == var279) {
                        module0034.f1873(var277, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var141_278, var274);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var278, var274);
        }
        return var275;
    }
    
    public static SubLObject f29764(final SubLObject var121) {
        return module0213.f13926(f29723(var121), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29765(final SubLObject var121) {
        final SubLThread var122 = SubLProcess.currentSubLThread();
        final SubLObject var123 = module0034.$g879$.getDynamicValue(var122);
        SubLObject var124 = (SubLObject)NIL;
        if (NIL == var123) {
            return f29764(var121);
        }
        var124 = module0034.f1857(var123, (SubLObject)$ic166$, (SubLObject)UNPROVIDED);
        if (NIL == var124) {
            var124 = module0034.f1807(module0034.f1842(var123), (SubLObject)$ic166$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var123, (SubLObject)$ic166$, var124);
        }
        SubLObject var125 = module0034.f1814(var124, var121, (SubLObject)$ic169$);
        if (var125 == $ic169$) {
            var125 = Values.arg2(var122.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f29764(var121)));
            module0034.f1816(var124, var121, var125, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var125);
    }
    
    public static SubLObject f29766(final SubLObject var193) {
        return module0213.f13926(f29724(var193), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29767(final SubLObject var193) {
        final SubLThread var194 = SubLProcess.currentSubLThread();
        final SubLObject var195 = module0034.$g879$.getDynamicValue(var194);
        SubLObject var196 = (SubLObject)NIL;
        if (NIL == var195) {
            return f29766(var193);
        }
        var196 = module0034.f1857(var195, (SubLObject)$ic167$, (SubLObject)UNPROVIDED);
        if (NIL == var196) {
            var196 = module0034.f1807(module0034.f1842(var195), (SubLObject)$ic167$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var195, (SubLObject)$ic167$, var196);
        }
        SubLObject var197 = module0034.f1814(var196, var193, (SubLObject)$ic169$);
        if (var197 == $ic169$) {
            var197 = Values.arg2(var194.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f29766(var193)));
            module0034.f1816(var196, var193, var197, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var197);
    }
    
    public static SubLObject f29760(final SubLObject var282, final SubLObject var139) {
        final SubLObject var283 = module0269.f17713(var282, (SubLObject)UNPROVIDED);
        final SubLObject var284 = (NIL != var283) ? $ic170$ : $ic171$;
        return module0434.f30578((SubLObject)$ic172$, (SubLObject)ConsesLow.list(var284, (SubLObject)$ic172$, var282), var139, (SubLObject)$ic173$);
    }
    
    public static SubLObject f29768(final SubLObject var285) {
        final SubLObject var286 = conses_high.subst(var285, (SubLObject)$ic175$, $g3455$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0434.f30578((SubLObject)$ic176$, var286, $ic165$, (SubLObject)$ic177$).first();
    }
    
    public static SubLObject f29769(final SubLObject var245, final SubLObject var286, SubLObject var287) {
        if (var287 == UNPROVIDED) {
            var287 = (SubLObject)NIL;
        }
        final SubLThread var288 = SubLProcess.currentSubLThread();
        final SubLObject var290;
        final SubLObject var289 = var290 = var287;
        final SubLObject var291 = cdestructuring_bind.property_list_member((SubLObject)$ic178$, var290);
        final SubLObject var292 = (SubLObject)((NIL != var291) ? conses_high.cadr(var291) : $ic179$);
        final SubLObject var293 = f29755(var245, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var294 = var292;
        final SubLObject var295 = var293;
        SubLObject var296 = (SubLObject)ZERO_INTEGER;
        final SubLObject var297 = Sequences.length(var295);
        final SubLObject var298 = module0012.$g75$.currentBinding(var288);
        final SubLObject var299 = module0012.$g76$.currentBinding(var288);
        final SubLObject var300 = module0012.$g77$.currentBinding(var288);
        final SubLObject var301 = module0012.$g78$.currentBinding(var288);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var288);
            module0012.$g76$.bind((SubLObject)NIL, var288);
            module0012.$g77$.bind((SubLObject)T, var288);
            module0012.$g78$.bind(Time.get_universal_time(), var288);
            module0012.f478(var294);
            SubLObject var302 = var295;
            SubLObject var303 = (SubLObject)NIL;
            var303 = var302.first();
            while (NIL != var302) {
                module0012.note_percent_progress(var296, var297);
                var296 = Numbers.add(var296, (SubLObject)ONE_INTEGER);
                SubLObject var304 = (SubLObject)NIL;
                try {
                    var288.throwStack.push($ic180$);
                    final SubLObject var305 = (SubLObject)$ic180$;
                    SubLObject var306 = (SubLObject)NIL;
                    final SubLObject var141_299 = Errors.$restarts$.currentBinding(var288);
                    try {
                        Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var305, (SubLObject)$ic181$, var303), Errors.$restarts$.getDynamicValue(var288)), var288);
                        try {
                            var288.throwStack.push(var305);
                            f29770(var303, var286, var287);
                        }
                        catch (Throwable var307) {
                            var306 = Errors.handleThrowable(var307, var305);
                        }
                        finally {
                            var288.throwStack.pop();
                        }
                    }
                    finally {
                        Errors.$restarts$.rebind(var141_299, var288);
                    }
                }
                catch (Throwable var308) {
                    var304 = Errors.handleThrowable(var308, (SubLObject)$ic180$);
                }
                finally {
                    var288.throwStack.pop();
                }
                var302 = var302.rest();
                var303 = var302.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var301, var288);
            module0012.$g77$.rebind(var300, var288);
            module0012.$g76$.rebind(var299, var288);
            module0012.$g75$.rebind(var298, var288);
        }
        return Sequences.length(var293);
    }
    
    public static SubLObject f29770(final SubLObject var296, final SubLObject var286, final SubLObject var287) {
        final SubLThread var297 = SubLProcess.currentSubLThread();
        final SubLObject var298 = cdestructuring_bind.property_list_member((SubLObject)$ic182$, var287);
        final SubLObject var299 = (SubLObject)((NIL != var298) ? conses_high.cadr(var298) : NIL);
        final SubLObject var300 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var287);
        final SubLObject var301 = (SubLObject)((NIL != var300) ? conses_high.cadr(var300) : NIL);
        final SubLObject var302 = cdestructuring_bind.property_list_member((SubLObject)$ic130$, var287);
        final SubLObject var303 = (SubLObject)((NIL != var302) ? conses_high.cadr(var302) : NIL);
        module0361.f24004();
        module0569.f34904((SubLObject)NIL);
        SubLObject var304 = (SubLObject)NIL;
        try {
            var297.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var305 = Errors.$error_handler$.currentBinding(var297);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic118$, var297);
                try {
                    f29771(var296, var301, var303);
                }
                catch (Throwable var306) {
                    Errors.handleThrowable(var306, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var305, var297);
            }
        }
        catch (Throwable var307) {
            var304 = Errors.handleThrowable(var307, module0003.$g3$.getGlobalValue());
        }
        finally {
            var297.throwStack.pop();
        }
        if (var304.isString()) {
            Errors.warn((SubLObject)$ic183$, var304);
        }
        final SubLObject var308 = inference_datastructures_inference_oc.f25470();
        return f29772(var286, var296, var308, var299);
    }
    
    public static SubLObject f29771(final SubLObject var296, final SubLObject var123, SubLObject var124) {
        final SubLThread var297 = SubLProcess.currentSubLThread();
        final SubLObject var298 = (SubLObject)$ic184$;
        var124 = module0035.f2341(var298, var124);
        final SubLObject var299 = module0018.$g738$.currentBinding(var297);
        try {
            module0018.$g738$.bind((SubLObject)NIL, var297);
            f29713(var296, (SubLObject)NIL, var123, var124, (SubLObject)NIL);
        }
        finally {
            module0018.$g738$.rebind(var299, var297);
        }
        return Sequences.length(inference_datastructures_inference_oc.f25470());
    }
    
    public static SubLObject f29772(final SubLObject var286, final SubLObject var296, final SubLObject var307, final SubLObject var303) {
        return Functions.funcall(var286, var296, var307, var303);
    }
    
    public static SubLObject f29773(final SubLObject var309, SubLObject var194, SubLObject var123, SubLObject var124, SubLObject var246, SubLObject var65, SubLObject var247, SubLObject var195, SubLObject var248, SubLObject var249, SubLObject var250, SubLObject var251, SubLObject var310, SubLObject var253) {
        if (var194 == UNPROVIDED) {
            var194 = (SubLObject)NIL;
        }
        if (var123 == UNPROVIDED) {
            var123 = $g3450$.getDynamicValue();
        }
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        if (var246 == UNPROVIDED) {
            var246 = (SubLObject)NIL;
        }
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var247 == UNPROVIDED) {
            var247 = (SubLObject)NIL;
        }
        if (var195 == UNPROVIDED) {
            var195 = (SubLObject)NIL;
        }
        if (var248 == UNPROVIDED) {
            var248 = (SubLObject)ZERO_INTEGER;
        }
        if (var249 == UNPROVIDED) {
            var249 = (SubLObject)NIL;
        }
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)NIL;
        }
        if (var251 == UNPROVIDED) {
            var251 = (SubLObject)$ic155$;
        }
        if (var310 == UNPROVIDED) {
            var310 = (SubLObject)NIL;
        }
        if (var253 == UNPROVIDED) {
            var253 = (SubLObject)NIL;
        }
        final SubLThread var311 = SubLProcess.currentSubLThread();
        final SubLObject var312 = f29774(var309, var250, var310);
        final SubLObject var313 = (SubLObject)((NIL != var249) ? Numbers.add(var248, var249) : NIL);
        SubLObject var314 = (SubLObject)ZERO_INTEGER;
        SubLObject var315 = (SubLObject)NIL;
        SubLObject var316 = (SubLObject)NIL;
        SubLObject var317 = (SubLObject)NIL;
        if (NIL != var195) {
            var317 = f29775(var309);
            module0635.f38794(f29776(var317), (SubLObject)UNPROVIDED);
        }
        final SubLObject var318 = $g3441$.currentBinding(var311);
        try {
            $g3441$.bind(var317, var311);
            SubLObject var319 = (SubLObject)NIL;
            try {
                var311.throwStack.push($ic185$);
                final SubLObject var320 = (SubLObject)$ic185$;
                SubLObject var321 = (SubLObject)NIL;
                final SubLObject var141_316 = Errors.$restarts$.currentBinding(var311);
                try {
                    Errors.$restarts$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var320, (SubLObject)$ic186$), Errors.$restarts$.getDynamicValue(var311)), var311);
                    try {
                        var311.throwStack.push(var320);
                        final SubLObject var322 = Functions.funcall((SubLObject)makeSymbol("S#23749", "CYC"));
                        final SubLObject var141_317 = module0311.$g2802$.currentBinding(var311);
                        try {
                            module0311.$g2802$.bind((SubLObject)T, var311);
                            try {
                                try {
                                    if (NIL != var247) {
                                        var316 = f29777(var247, var251);
                                    }
                                    if (NIL != var316 && $ic155$ == var251) {
                                        f29778(var316, var65);
                                    }
                                    final SubLObject var323 = var312;
                                    module0012.$g82$.setDynamicValue((SubLObject)$ic187$, var311);
                                    module0012.$g73$.setDynamicValue(Time.get_universal_time(), var311);
                                    module0012.$g83$.setDynamicValue(Sequences.length(var323), var311);
                                    module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var311);
                                    final SubLObject var141_318 = module0012.$g75$.currentBinding(var311);
                                    final SubLObject var324 = module0012.$g76$.currentBinding(var311);
                                    final SubLObject var325 = module0012.$g77$.currentBinding(var311);
                                    final SubLObject var326 = module0012.$g78$.currentBinding(var311);
                                    try {
                                        module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var311);
                                        module0012.$g76$.bind((SubLObject)NIL, var311);
                                        module0012.$g77$.bind((SubLObject)T, var311);
                                        module0012.$g78$.bind(Time.get_universal_time(), var311);
                                        module0012.f478(module0012.$g82$.getDynamicValue(var311));
                                        SubLObject var327 = var323;
                                        SubLObject var328 = (SubLObject)NIL;
                                        var328 = var327.first();
                                        while (NIL != var327) {
                                            module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var311), module0012.$g83$.getDynamicValue(var311));
                                            module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var311), (SubLObject)ONE_INTEGER), var311);
                                            if (var248.isPositive()) {
                                                var248 = Numbers.subtract(var248, (SubLObject)ONE_INTEGER);
                                            }
                                            else if (NIL != module0633.f38734(var328)) {
                                                if (NIL == module0012.$silent_progressP$.getDynamicValue(var311)) {
                                                    module0006.f218((SubLObject)T, (SubLObject)$ic188$, var328, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                                }
                                                final SubLObject var329 = f29726(var328, var194, var123, var124, var246, var195);
                                                var315 = (SubLObject)ConsesLow.cons(var329, var315);
                                                if (var316.isStream()) {
                                                    f29779(var329, var316);
                                                }
                                                module0075.f5253(var253);
                                            }
                                            else {
                                                Errors.warn((SubLObject)$ic189$, var328);
                                            }
                                            var314 = Numbers.add(var314, (SubLObject)ONE_INTEGER);
                                            if (NIL != var313 && var314.numGE(var313)) {
                                                f29780();
                                            }
                                            var327 = var327.rest();
                                            var328 = var327.first();
                                        }
                                        module0012.f479();
                                    }
                                    finally {
                                        module0012.$g78$.rebind(var326, var311);
                                        module0012.$g77$.rebind(var325, var311);
                                        module0012.$g76$.rebind(var324, var311);
                                        module0012.$g75$.rebind(var141_318, var311);
                                    }
                                }
                                finally {
                                    final SubLObject var141_319 = Threads.$is_thread_performing_cleanupP$.currentBinding(var311);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var311);
                                        if (var316.isStream()) {
                                            streams_high.close(var316, (SubLObject)UNPROVIDED);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var141_319, var311);
                                    }
                                }
                            }
                            finally {
                                final SubLObject var141_320 = Threads.$is_thread_performing_cleanupP$.currentBinding(var311);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var311);
                                    Functions.funcall((SubLObject)makeSymbol("S#23750", "CYC"), var322);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var141_320, var311);
                                }
                            }
                        }
                        finally {
                            module0311.$g2802$.rebind(var141_317, var311);
                        }
                    }
                    catch (Throwable var330) {
                        var321 = Errors.handleThrowable(var330, var320);
                    }
                    finally {
                        var311.throwStack.pop();
                    }
                }
                finally {
                    Errors.$restarts$.rebind(var141_316, var311);
                }
            }
            catch (Throwable var331) {
                var319 = Errors.handleThrowable(var331, (SubLObject)$ic185$);
            }
            finally {
                var311.throwStack.pop();
            }
        }
        finally {
            $g3441$.rebind(var318, var311);
        }
        var315 = Sequences.nreverse(var315);
        final SubLObject var332 = f29704(var315, var65);
        if (NIL != f29729(var317)) {
            f29781(var317, var332);
        }
        return Values.values(var332, var314);
    }
    
    public static SubLObject f29780() {
        return Dynamic.sublisp_throw((SubLObject)$ic185$, (SubLObject)NIL);
    }
    
    public static SubLObject f29774(final SubLObject var309, SubLObject var250, SubLObject var310) {
        if (var250 == UNPROVIDED) {
            var250 = (SubLObject)NIL;
        }
        if (var310 == UNPROVIDED) {
            var310 = (SubLObject)NIL;
        }
        if (NIL != module0035.f2192((SubLObject)$ic164$, var309)) {
            return ConsesLow.append(var309, var310);
        }
        SubLObject var311 = f29760(var309, $ic165$);
        if (NIL != var250) {
            var311 = module0035.f2097(var311);
        }
        else {
            var311 = f29763(var311);
        }
        return ConsesLow.append(var311, var310);
    }
    
    public static SubLObject f29782(final SubLObject var2, final SubLObject var3) {
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var326_327 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)$ic190$);
            var326_327 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)$ic190$);
            if (NIL == conses_high.member(var326_327, (SubLObject)$ic191$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var326_327 == $ic81$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic190$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic192$, var5);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic193$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic194$, var5);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic195$, var5);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic76$, var5);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic130$, var5);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic114$, var5);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : $ic196$);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var5);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : $ic197$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic198$, var5);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic199$, var5);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : T);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic200$, var5);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : NIL);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic201$, var5);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : ZERO_INTEGER);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic202$, var5);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic203$, var5);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : $ic204$);
        return (SubLObject)ConsesLow.list((SubLObject)$ic205$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic206$, $ic192$, var10, $ic193$, var12, $ic194$, var14, $ic195$, var16, $ic76$, var18, $ic130$, var20, $ic114$, var22, $ic123$, var24, $ic198$, var26, $ic199$, var28, $ic200$, var30, $ic201$, var32, $ic202$, var34, $ic203$, var36 }));
    }
    
    public static SubLObject f29783() {
        return $g3456$.getGlobalValue();
    }
    
    public static SubLObject f29784(final SubLObject var347) {
        final SubLThread var348 = SubLProcess.currentSubLThread();
        final SubLObject var349 = cdestructuring_bind.property_list_member((SubLObject)$ic192$, var347);
        SubLObject var350 = (SubLObject)((NIL != var349) ? conses_high.cadr(var349) : NIL);
        final SubLObject var351 = cdestructuring_bind.property_list_member((SubLObject)$ic193$, var347);
        SubLObject var352 = (SubLObject)((NIL != var351) ? conses_high.cadr(var351) : NIL);
        final SubLObject var353 = cdestructuring_bind.property_list_member((SubLObject)$ic194$, var347);
        final SubLObject var354 = (SubLObject)((NIL != var353) ? conses_high.cadr(var353) : NIL);
        final SubLObject var355 = cdestructuring_bind.property_list_member((SubLObject)$ic195$, var347);
        final SubLObject var356 = (SubLObject)((NIL != var355) ? conses_high.cadr(var355) : NIL);
        final SubLObject var357 = cdestructuring_bind.property_list_member((SubLObject)$ic76$, var347);
        final SubLObject var358 = (SubLObject)((NIL != var357) ? conses_high.cadr(var357) : NIL);
        final SubLObject var359 = cdestructuring_bind.property_list_member((SubLObject)$ic130$, var347);
        final SubLObject var360 = (SubLObject)((NIL != var359) ? conses_high.cadr(var359) : NIL);
        final SubLObject var361 = cdestructuring_bind.property_list_member((SubLObject)$ic114$, var347);
        final SubLObject var362 = (NIL != var361) ? conses_high.cadr(var361) : module0360.f23811();
        final SubLObject var363 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var347);
        final SubLObject var364 = (NIL != var363) ? conses_high.cadr(var363) : $g3162$.getGlobalValue();
        final SubLObject var365 = cdestructuring_bind.property_list_member((SubLObject)$ic200$, var347);
        final SubLObject var366 = (SubLObject)((NIL != var365) ? conses_high.cadr(var365) : NIL);
        final SubLObject var367 = cdestructuring_bind.property_list_member((SubLObject)$ic201$, var347);
        final SubLObject var368 = (SubLObject)((NIL != var367) ? conses_high.cadr(var367) : ZERO_INTEGER);
        final SubLObject var369 = cdestructuring_bind.property_list_member((SubLObject)$ic202$, var347);
        final SubLObject var370 = (SubLObject)((NIL != var369) ? conses_high.cadr(var369) : NIL);
        final SubLObject var371 = cdestructuring_bind.property_list_member((SubLObject)$ic198$, var347);
        final SubLObject var372 = (SubLObject)((NIL != var371) ? conses_high.cadr(var371) : T);
        final SubLObject var373 = cdestructuring_bind.property_list_member((SubLObject)$ic199$, var347);
        final SubLObject var374 = (SubLObject)((NIL != var373) ? conses_high.cadr(var373) : T);
        final SubLObject var375 = cdestructuring_bind.property_list_member((SubLObject)$ic203$, var347);
        final SubLObject var376 = (SubLObject)((NIL != var375) ? conses_high.cadr(var375) : $ic204$);
        assert NIL != f29785(var376) : var376;
        SubLObject var377 = (SubLObject)NIL;
        SubLObject var378 = (SubLObject)NIL;
        SubLObject var379 = (SubLObject)NIL;
        SubLObject var380 = (SubLObject)$ic155$;
        final SubLObject var381 = var352;
        final SubLObject var382 = (SubLObject)makeBoolean(NIL == module0075.f5218(var381));
        if (NIL != var352) {
            var348.resetMultipleValues();
            final SubLObject var367_368 = f29786(var350, var352, var376);
            final SubLObject var369_370 = var348.secondMultipleValue();
            final SubLObject var371_372 = var348.thirdMultipleValue();
            final SubLObject var373_374 = var348.fourthMultipleValue();
            var348.resetMultipleValues();
            var350 = var367_368;
            var352 = var369_370;
            var380 = var371_372;
            var379 = var373_374;
        }
        if (NIL == module0012.$silent_progressP$.getDynamicValue(var348)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic210$, module0051.f3552((SubLObject)UNPROVIDED));
        }
        final SubLObject var383 = Time.get_internal_real_time();
        var377 = f29754(var350, var362, var364, var360, var374, var358, (SubLObject)((NIL != var372) ? var352 : NIL), var368, var370, var366, var380, var379, var356);
        var378 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var383), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL == module0012.$silent_progressP$.getDynamicValue(var348)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic211$, module0051.f3552((SubLObject)UNPROVIDED));
            PrintLow.format((SubLObject)T, (SubLObject)$ic212$, module0051.f3602(Numbers.truncate(var378, (SubLObject)UNPROVIDED)));
        }
        if (NIL == var372 && NIL != var352) {
            f29787(var377, var352);
        }
        $g3456$.setGlobalValue(var377);
        if (NIL != var354) {
            final SubLObject var384 = (NIL != var382) ? var377 : f29788(var381);
            f29789(var354, var384, var362);
        }
        return var378;
    }
    
    public static SubLObject f29789(final SubLObject var332, final SubLObject var7, final SubLObject var122) {
        final SubLObject var333 = f29701(var7, var122);
        SubLObject var334 = (SubLObject)NIL;
        try {
            var334 = compatibility.open_text(var332, (SubLObject)$ic155$);
            if (!var334.isStream()) {
                Errors.error((SubLObject)$ic213$, var332);
            }
            final SubLObject var335 = var334;
            module0035.f2365(var333, var335);
        }
        finally {
            final SubLObject var336 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var334.isStream()) {
                    streams_high.close(var334, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var336);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29790(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = f29678(var7);
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            if (NIL != f29791(var10)) {
                var8 = (SubLObject)ConsesLow.cons(f29629(var10), var8);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f29792(final SubLObject var7) {
        return f29793(f29678(var7));
    }
    
    public static SubLObject f29793(final SubLObject var64) {
        return Sequences.count_if((SubLObject)$ic214$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29791(final SubLObject var9) {
        final SubLObject var10 = f29649(var9);
        return module0360.f23871(var10);
    }
    
    public static SubLObject f29785(final SubLObject var1) {
        return module0035.f2169(var1, (SubLObject)$ic215$);
    }
    
    public static SubLObject f29794(final SubLObject var245, final SubLObject var330) {
        final SubLObject var331 = f29795(var330);
        final SubLObject var332 = f29689(var331);
        final SubLObject var333 = Sequences.length(f29755(var245, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var334 = Numbers.subtract(var333, var332);
        final SubLObject var335 = f29792(var331);
        return Values.values(var334, var335);
    }
    
    public static SubLObject f29786(final SubLObject var245, final SubLObject var330, SubLObject var346) {
        assert NIL != f29785(var346) : var346;
        if (NIL == Filesys.probe_file(var330)) {
            var346 = (SubLObject)$ic204$;
        }
        final SubLObject var347 = var346;
        if (var347.eql((SubLObject)$ic204$)) {
            return Values.values(var245, var330, (SubLObject)$ic155$, (SubLObject)NIL);
        }
        if (var347.eql((SubLObject)$ic216$)) {
            final SubLObject var348 = f29796(var245, var330);
            final SubLObject var349 = var348.first();
            final SubLObject var350 = var348.rest();
            return Values.values(module0202.f12791(var350, (SubLObject)UNPROVIDED), var330, (SubLObject)$ic217$, (SubLObject)ConsesLow.list(var349));
        }
        if (var347.eql((SubLObject)$ic218$)) {
            final SubLObject var351 = f29788(var330);
            final SubLObject var352 = f29790(var351);
            final SubLObject var353 = f29797(var330);
            final SubLObject var354 = f29798(var353);
            return Values.values(module0202.f12791(var352, (SubLObject)UNPROVIDED), var354, (SubLObject)$ic155$, (SubLObject)NIL);
        }
        if (!var347.eql((SubLObject)$ic219$)) {
            return Errors.error((SubLObject)$ic220$, var346);
        }
        final SubLObject var348 = f29796(var245, var330);
        if (NIL != var348) {
            return f29786(var245, var330, (SubLObject)$ic216$);
        }
        return f29786(var245, var330, (SubLObject)$ic218$);
    }
    
    public static SubLObject f29796(final SubLObject var245, final SubLObject var330) {
        final SubLObject var331 = f29795(var330);
        final SubLObject var332 = f29688(var331);
        final SubLObject var333 = f29755(var245, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0213.f13926(module0035.remove_if_not((SubLObject)$ic84$, module0035.f2220(var333, var332, Symbols.symbol_function((SubLObject)EQUAL)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29798(final SubLObject var387) {
        SubLObject var388 = (SubLObject)ONE_INTEGER;
        SubLObject var389 = (SubLObject)NIL;
        while (NIL == var389) {
            final SubLObject var390 = f29799(var387, var388);
            if (NIL != Filesys.probe_file(var390)) {
                var388 = Numbers.add(var388, (SubLObject)ONE_INTEGER);
            }
            else {
                var389 = var390;
            }
        }
        return var389;
    }
    
    public static SubLObject f29799(final SubLObject var387, final SubLObject var145) {
        final SubLObject var388 = module0038.f2638(var145);
        final SubLObject var389 = Sequences.cconcatenate(var387, new SubLObject[] { $ic221$, var388, $g3457$.getGlobalValue() });
        return var389;
    }
    
    public static SubLObject f29788(final SubLObject var330) {
        SubLObject var331 = f29795(var330);
        final SubLObject var332 = f29797(var330);
        SubLObject var333 = (SubLObject)ONE_INTEGER;
        SubLObject var334 = (SubLObject)NIL;
        while (NIL == var334) {
            final SubLObject var335 = f29799(var332, var333);
            if (NIL != Filesys.probe_file(var335)) {
                final SubLObject var336 = f29795(var335);
                var331 = f29800(var331, var336);
                var333 = Numbers.add(var333, (SubLObject)ONE_INTEGER);
            }
            else {
                var334 = (SubLObject)T;
            }
        }
        return var331;
    }
    
    public static SubLObject f29800(final SubLObject var7, final SubLObject var394) {
        final SubLObject var395 = conses_high.copy_list(f29678(var7));
        SubLObject var396;
        SubLObject var397;
        SubLObject var398;
        SubLObject var399;
        for (var396 = (SubLObject)NIL, var396 = var395; !var396.isAtom(); var396 = var396.rest()) {
            var397 = var396.first();
            if (NIL != f29791(var397)) {
                var398 = f29629(var397);
                var399 = f29801(var394, var398);
                if (NIL != var399) {
                    ConsesLow.rplaca(var396, var399);
                }
            }
        }
        SubLObject var400 = conses_high.copy_list(var7);
        var400 = conses_high.putf(var400, (SubLObject)$ic77$, var395);
        return var400;
    }
    
    public static SubLObject f29802(final SubLObject var2, final SubLObject var3) {
        final SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = var5;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var402_403 = (SubLObject)NIL;
        while (NIL != var7) {
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)$ic222$);
            var402_403 = var7.first();
            var7 = var7.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var7, var4, (SubLObject)$ic222$);
            if (NIL == conses_high.member(var402_403, (SubLObject)$ic223$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var8 = (SubLObject)T;
            }
            if (var402_403 == $ic81$) {
                var6 = var7.first();
            }
            var7 = var7.rest();
        }
        if (NIL != var8 && NIL == var6) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic222$);
        }
        final SubLObject var9 = cdestructuring_bind.property_list_member((SubLObject)$ic224$, var5);
        final SubLObject var10 = (SubLObject)((NIL != var9) ? conses_high.cadr(var9) : NIL);
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic193$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic194$, var5);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15 = cdestructuring_bind.property_list_member((SubLObject)$ic195$, var5);
        final SubLObject var16 = (SubLObject)((NIL != var15) ? conses_high.cadr(var15) : NIL);
        final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic76$, var5);
        final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
        final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic130$, var5);
        final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic225$, var5);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : $ic196$);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var5);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : $ic226$);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic198$, var5);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic199$, var5);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : T);
        final SubLObject var29 = cdestructuring_bind.property_list_member((SubLObject)$ic203$, var5);
        final SubLObject var30 = (SubLObject)((NIL != var29) ? conses_high.cadr(var29) : $ic204$);
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic227$, var5);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : NIL);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic200$, var5);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35 = cdestructuring_bind.property_list_member((SubLObject)$ic201$, var5);
        final SubLObject var36 = (SubLObject)((NIL != var35) ? conses_high.cadr(var35) : ZERO_INTEGER);
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic202$, var5);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic228$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic206$, $ic224$, var10, $ic193$, var12, $ic194$, var14, $ic195$, var16, $ic76$, var18, $ic130$, var20, $ic225$, var22, $ic123$, var24, $ic198$, var26, $ic199$, var28, $ic203$, var30, $ic227$, var32, $ic200$, var34, $ic201$, var36, $ic202$, var38 }));
    }
    
    public static SubLObject f29803(final SubLObject var347) {
        final SubLThread var348 = SubLProcess.currentSubLThread();
        final SubLObject var349 = cdestructuring_bind.property_list_member((SubLObject)$ic224$, var347);
        SubLObject var350 = (SubLObject)((NIL != var349) ? conses_high.cadr(var349) : NIL);
        final SubLObject var351 = cdestructuring_bind.property_list_member((SubLObject)$ic193$, var347);
        SubLObject var352 = (SubLObject)((NIL != var351) ? conses_high.cadr(var351) : NIL);
        final SubLObject var353 = cdestructuring_bind.property_list_member((SubLObject)$ic194$, var347);
        final SubLObject var354 = (SubLObject)((NIL != var353) ? conses_high.cadr(var353) : NIL);
        final SubLObject var355 = cdestructuring_bind.property_list_member((SubLObject)$ic195$, var347);
        final SubLObject var356 = (SubLObject)((NIL != var355) ? conses_high.cadr(var355) : NIL);
        final SubLObject var357 = cdestructuring_bind.property_list_member((SubLObject)$ic76$, var347);
        final SubLObject var358 = (SubLObject)((NIL != var357) ? conses_high.cadr(var357) : NIL);
        final SubLObject var359 = cdestructuring_bind.property_list_member((SubLObject)$ic130$, var347);
        final SubLObject var360 = (SubLObject)((NIL != var359) ? conses_high.cadr(var359) : NIL);
        final SubLObject var361 = cdestructuring_bind.property_list_member((SubLObject)$ic225$, var347);
        final SubLObject var362 = (NIL != var361) ? conses_high.cadr(var361) : module0360.f23813();
        final SubLObject var363 = cdestructuring_bind.property_list_member((SubLObject)$ic123$, var347);
        final SubLObject var364 = (NIL != var363) ? conses_high.cadr(var363) : $g3450$.getDynamicValue(var348);
        final SubLObject var365 = cdestructuring_bind.property_list_member((SubLObject)$ic200$, var347);
        final SubLObject var366 = (SubLObject)((NIL != var365) ? conses_high.cadr(var365) : NIL);
        final SubLObject var367 = cdestructuring_bind.property_list_member((SubLObject)$ic201$, var347);
        final SubLObject var368 = (SubLObject)((NIL != var367) ? conses_high.cadr(var367) : ZERO_INTEGER);
        final SubLObject var369 = cdestructuring_bind.property_list_member((SubLObject)$ic202$, var347);
        final SubLObject var370 = (SubLObject)((NIL != var369) ? conses_high.cadr(var369) : NIL);
        final SubLObject var371 = cdestructuring_bind.property_list_member((SubLObject)$ic198$, var347);
        final SubLObject var372 = (SubLObject)((NIL != var371) ? conses_high.cadr(var371) : T);
        final SubLObject var373 = cdestructuring_bind.property_list_member((SubLObject)$ic199$, var347);
        final SubLObject var374 = (SubLObject)((NIL != var373) ? conses_high.cadr(var373) : T);
        final SubLObject var375 = cdestructuring_bind.property_list_member((SubLObject)$ic203$, var347);
        final SubLObject var376 = (SubLObject)((NIL != var375) ? conses_high.cadr(var375) : $ic204$);
        final SubLObject var377 = cdestructuring_bind.property_list_member((SubLObject)$ic227$, var347);
        final SubLObject var378 = (SubLObject)((NIL != var377) ? conses_high.cadr(var377) : NIL);
        assert NIL != f29785(var376) : var376;
        SubLObject var379 = (SubLObject)NIL;
        SubLObject var380 = (SubLObject)NIL;
        SubLObject var381 = (SubLObject)NIL;
        SubLObject var382 = (SubLObject)$ic155$;
        final SubLObject var383 = var352;
        final SubLObject var384 = (SubLObject)makeBoolean(NIL == module0075.f5218(var383));
        if (NIL != var352) {
            var348.resetMultipleValues();
            final SubLObject var438_439 = f29804(var350, var352, var376);
            final SubLObject var440_441 = var348.secondMultipleValue();
            final SubLObject var442_443 = var348.thirdMultipleValue();
            final SubLObject var444_445 = var348.fourthMultipleValue();
            var348.resetMultipleValues();
            var350 = var438_439;
            var352 = var440_441;
            var382 = var442_443;
            var381 = var444_445;
        }
        if (NIL == module0012.$silent_progressP$.getDynamicValue(var348)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic210$, module0051.f3552((SubLObject)UNPROVIDED));
        }
        final SubLObject var385 = Time.get_internal_real_time();
        var379 = f29773(var350, var362, var364, var360, var374, var358, (SubLObject)((NIL != var372) ? var352 : NIL), var378, var368, var370, var366, var382, var381, var356);
        var380 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var385), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL == module0012.$silent_progressP$.getDynamicValue(var348)) {
            PrintLow.format((SubLObject)T, (SubLObject)$ic211$, module0051.f3552((SubLObject)UNPROVIDED));
            PrintLow.format((SubLObject)T, (SubLObject)$ic212$, module0051.f3602(Numbers.truncate(var380, (SubLObject)UNPROVIDED)));
        }
        if (NIL == var372 && NIL != var352) {
            f29805(var379, var352);
        }
        $g3458$.setGlobalValue(var379);
        if (NIL != var354) {
            final SubLObject var386 = (NIL != var384) ? var379 : f29806(var383);
            f29807(var354, var386, var362, var350);
        }
        return var380;
    }
    
    public static SubLObject f29807(final SubLObject var332, final SubLObject var72, final SubLObject var122, final SubLObject var309) {
        final SubLObject var333 = f29808(var72, var122);
        final SubLObject var334 = (SubLObject)makeBoolean(NIL != module0035.f2370((SubLObject)$ic231$, f29708(var72), (SubLObject)$ic106$) || NIL == module0035.f2369((SubLObject)$ic231$, f29708(var72), (SubLObject)$ic106$));
        final SubLObject var335 = (SubLObject)((NIL != var334) ? NIL : f29809(var72, (SubLObject)$ic232$, (SubLObject)$ic231$, (SubLObject)$ic106$));
        final SubLObject var336 = (SubLObject)((NIL != var334) ? NIL : f29808(var335, var122));
        final SubLObject var337 = f29709(f29810(var72));
        final SubLObject var338 = (SubLObject)((NIL != var334) ? NIL : f29709(f29810(var335)));
        final SubLObject var339 = f29774(var309, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var340 = module0035.f2220(var339, f29709(var72), (SubLObject)UNPROVIDED);
        SubLObject var341 = (SubLObject)NIL;
        try {
            var341 = compatibility.open_text(var332, (SubLObject)$ic155$);
            if (!var341.isStream()) {
                Errors.error((SubLObject)$ic213$, var332);
            }
            final SubLObject var342 = var341;
            PrintLow.format(var342, (SubLObject)$ic233$);
            module0035.f2365(var333, var342);
            if (NIL == var334) {
                PrintLow.format(var342, (SubLObject)$ic234$);
                module0035.f2365(var336, var342);
            }
            if (NIL != module0035.f1994(var337, (SubLObject)$ic235$, (SubLObject)UNPROVIDED)) {
                PrintLow.format(var342, (SubLObject)$ic236$);
                module0006.f215(var337, var342);
            }
            if (NIL == var334 && NIL != module0035.f1994(var338, (SubLObject)$ic235$, (SubLObject)UNPROVIDED)) {
                PrintLow.format(var342, (SubLObject)$ic237$, Sequences.length(var338));
                module0006.f215(var338, var342);
            }
            if (NIL != var340) {
                PrintLow.format(var342, (SubLObject)$ic238$);
                SubLObject var343 = var340;
                SubLObject var344 = (SubLObject)NIL;
                var344 = var343.first();
                while (NIL != var343) {
                    final SubLObject var345 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ONE_INTEGER), module0633.f38736(var344));
                    if (NIL != module0038.f2611(var345)) {
                        PrintLow.format(var342, (SubLObject)$ic239$, var345);
                    }
                    else {
                        PrintLow.format(var342, (SubLObject)$ic240$, var344);
                    }
                    var343 = var343.rest();
                    var344 = var343.first();
                }
            }
            streams_high.terpri(var342);
        }
        finally {
            final SubLObject var346 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (var341.isStream()) {
                    streams_high.close(var341, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var346);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29811(final SubLObject var72) {
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = f29708(var72);
        SubLObject var75 = (SubLObject)NIL;
        var75 = var74.first();
        while (NIL != var74) {
            if (NIL != f29812(var75)) {
                var73 = (SubLObject)ConsesLow.cons(f29669(var75), var73);
            }
            var74 = var74.rest();
            var75 = var74.first();
        }
        return Sequences.nreverse(var73);
    }
    
    public static SubLObject f29813(final SubLObject var72) {
        return f29814(f29708(var72));
    }
    
    public static SubLObject f29814(final SubLObject var92) {
        return Sequences.count_if((SubLObject)$ic241$, var92, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29812(final SubLObject var63) {
        final SubLObject var64 = f29649(f29670(var63));
        return module0360.f23871(var64);
    }
    
    public static SubLObject f29804(final SubLObject var309, final SubLObject var330, SubLObject var346) {
        assert NIL != f29785(var346) : var346;
        if (NIL == Filesys.probe_file(var330)) {
            var346 = (SubLObject)$ic204$;
        }
        final SubLObject var347 = var346;
        if (var347.eql((SubLObject)$ic204$)) {
            return Values.values(var309, var330, (SubLObject)$ic155$, (SubLObject)NIL);
        }
        if (var347.eql((SubLObject)$ic216$)) {
            final SubLObject var348 = f29815(var309, var330);
            final SubLObject var349 = var348.first();
            final SubLObject var350 = var348.rest();
            return Values.values(module0202.f12791(var350, (SubLObject)UNPROVIDED), var330, (SubLObject)$ic217$, (SubLObject)ConsesLow.list(var349));
        }
        if (var347.eql((SubLObject)$ic218$)) {
            final SubLObject var351 = f29806(var330);
            final SubLObject var352 = f29811(var351);
            final SubLObject var353 = f29816(var330);
            final SubLObject var354 = f29817(var353);
            return Values.values(module0202.f12791(var352, (SubLObject)UNPROVIDED), var354, (SubLObject)$ic155$, (SubLObject)NIL);
        }
        if (!var347.eql((SubLObject)$ic219$)) {
            return Errors.error((SubLObject)$ic220$, var346);
        }
        final SubLObject var348 = f29815(var309, var330);
        if (NIL != var348) {
            return f29804(var309, var330, (SubLObject)$ic216$);
        }
        return f29804(var309, var330, (SubLObject)$ic218$);
    }
    
    public static SubLObject f29815(final SubLObject var309, final SubLObject var330) {
        final SubLObject var331 = f29818(var330);
        final SubLObject var332 = f29709(var331);
        final SubLObject var333 = f29774(var309, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0213.f13926(module0035.remove_if_not((SubLObject)$ic242$, module0035.f2220(var333, var332, Symbols.symbol_function((SubLObject)EQUAL)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29817(final SubLObject var387) {
        return f29798(var387);
    }
    
    public static SubLObject f29819(final SubLObject var387, final SubLObject var145) {
        return f29799(var387, var145);
    }
    
    public static SubLObject f29806(final SubLObject var330) {
        SubLObject var331 = f29818(var330);
        final SubLObject var332 = f29816(var330);
        SubLObject var333 = (SubLObject)ONE_INTEGER;
        SubLObject var334 = (SubLObject)NIL;
        while (NIL == var334) {
            final SubLObject var335 = f29819(var332, var333);
            if (NIL != Filesys.probe_file(var335)) {
                final SubLObject var336 = f29818(var335);
                var331 = f29820(var331, var336);
                var333 = Numbers.add(var333, (SubLObject)ONE_INTEGER);
            }
            else {
                var334 = (SubLObject)T;
            }
        }
        return var331;
    }
    
    public static SubLObject f29820(final SubLObject var72, final SubLObject var462) {
        final SubLObject var463 = conses_high.copy_list(f29708(var72));
        SubLObject var464;
        SubLObject var465;
        SubLObject var466;
        SubLObject var467;
        for (var464 = (SubLObject)NIL, var464 = var463; !var464.isAtom(); var464 = var464.rest()) {
            var465 = var464.first();
            if (NIL != f29812(var465)) {
                var466 = f29669(var465);
                var467 = f29821(var462, var466);
                if (NIL != var467) {
                    ConsesLow.rplaca(var464, var467);
                }
            }
        }
        SubLObject var468 = conses_high.copy_list(var72);
        var468 = conses_high.putf(var468, (SubLObject)$ic82$, var463);
        return var468;
    }
    
    public static SubLObject f29822() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return f29719($g3443$.getDynamicValue(var45));
    }
    
    public static SubLObject f29823() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(f29824($g3443$.getDynamicValue(var45)));
    }
    
    public static SubLObject f29825(final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        return f29826($g3443$.getDynamicValue(var135), var134);
    }
    
    public static SubLObject f29827(final SubLObject var134) {
        if (NIL != f29822() && NIL == f29823()) {
            return f29825(var134);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29828(final SubLObject var465) {
        return f29829(var465);
    }
    
    public static SubLObject f29830(final SubLObject var466) {
        final SubLObject var467 = reader.parse_integer(var466, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var468 = f29828(var467);
        return var468;
    }
    
    public static SubLObject f29831(final SubLObject var465) {
        return f29829(var465);
    }
    
    public static SubLObject f29832(final SubLObject var466) {
        final SubLObject var467 = reader.parse_integer(var466, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var468 = f29828(var467);
        return var468;
    }
    
    public static SubLObject f29833(final SubLObject var465) {
        return f29829(var465);
    }
    
    public static SubLObject f29834(final SubLObject var466) {
        final SubLObject var467 = reader.parse_integer(var466, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var468 = f29828(var467);
        return var468;
    }
    
    public static SubLObject f29835() {
        return module0057.f4175($g3459$.getGlobalValue());
    }
    
    public static SubLObject f29836(final SubLObject var465, final SubLObject var1) {
        return module0067.f4886($g3460$.getGlobalValue(), var465, var1);
    }
    
    public static SubLObject f29837(final SubLObject var465) {
        return module0067.f4887($g3460$.getGlobalValue(), var465);
    }
    
    public static SubLObject f29829(final SubLObject var465) {
        return module0067.f4884($g3460$.getGlobalValue(), var465, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29838(final SubLObject var467) {
        if (NIL != f29719(var467)) {
            return f29839(var467);
        }
        if (NIL != f29714(var467)) {
            return f29840(var467);
        }
        if (NIL != f29729(var467)) {
            return f29841(var467);
        }
        Errors.error((SubLObject)$ic245$, var467);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29842(final SubLObject var467) {
        if (NIL != f29714(var467)) {
            return f29843(var467);
        }
        if (NIL != f29729(var467)) {
            return f29844(var467);
        }
        Errors.error((SubLObject)$ic246$, var467);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29845(final SubLObject var467) {
        return (SubLObject)$ic247$;
    }
    
    public static SubLObject f29846(final SubLObject var467) {
        if (NIL != f29719(var467)) {
            return f29847(var467);
        }
        if (NIL != f29714(var467)) {
            return f29848(var467);
        }
        if (NIL != f29729(var467)) {
            return f29849(var467);
        }
        Errors.error((SubLObject)$ic245$, var467);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29850(final SubLObject var467) {
        if (NIL != f29719(var467)) {
            return f29744(var467);
        }
        if (NIL != f29714(var467)) {
            return f29851(var467);
        }
        Errors.error((SubLObject)$ic248$, var467);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29852(final SubLObject var467) {
        if (NIL != f29714(var467)) {
            return f29853(var467);
        }
        if (NIL != f29729(var467)) {
            return f29854(var467);
        }
        Errors.error((SubLObject)$ic249$, var467);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29855(final SubLObject var467) {
        if (NIL != f29714(var467)) {
            return f29856(var467);
        }
        if (NIL != f29729(var467)) {
            return f29857(var467);
        }
        Errors.error((SubLObject)$ic250$, var467);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29858(final SubLObject var467, final SubLObject var468) {
        assert NIL != Types.keywordp(var468) : var468;
        if (NIL != f29719(var467)) {
            return f29859(var467, var468);
        }
        if (NIL != f29714(var467)) {
            return f29860(var467, var468);
        }
        if (NIL != f29729(var467)) {
            return f29861(var467, var468);
        }
        Errors.error((SubLObject)$ic246$, var467);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29862(final SubLObject var467) {
        if (NIL != f29719(var467)) {
            return f29863(var467);
        }
        if (NIL != f29714(var467)) {
            return f29864(var467);
        }
        if (NIL != f29729(var467)) {
            f29865(var467);
        }
        else {
            Errors.error((SubLObject)$ic246$, var467);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29866(final SubLObject var469, final SubLObject var470) {
        compatibility.default_struct_print_function(var469, var470, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29719(final SubLObject var469) {
        return (SubLObject)((var469.getClass() == $sX32779_native.class) ? T : NIL);
    }
    
    public static SubLObject f29867(final SubLObject var469) {
        assert NIL != f29719(var469) : var469;
        return var469.getField2();
    }
    
    public static SubLObject f29868(final SubLObject var469) {
        assert NIL != f29719(var469) : var469;
        return var469.getField3();
    }
    
    public static SubLObject f29869(final SubLObject var469) {
        assert NIL != f29719(var469) : var469;
        return var469.getField4();
    }
    
    public static SubLObject f29824(final SubLObject var469) {
        assert NIL != f29719(var469) : var469;
        return var469.getField5();
    }
    
    public static SubLObject f29870(final SubLObject var469) {
        assert NIL != f29719(var469) : var469;
        return var469.getField6();
    }
    
    public static SubLObject f29871(final SubLObject var469) {
        assert NIL != f29719(var469) : var469;
        return var469.getField7();
    }
    
    public static SubLObject f29872(final SubLObject var469) {
        assert NIL != f29719(var469) : var469;
        return var469.getField8();
    }
    
    public static SubLObject f29873(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29719(var469) : var469;
        return var469.setField2(var471);
    }
    
    public static SubLObject f29874(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29719(var469) : var469;
        return var469.setField3(var471);
    }
    
    public static SubLObject f29875(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29719(var469) : var469;
        return var469.setField4(var471);
    }
    
    public static SubLObject f29876(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29719(var469) : var469;
        return var469.setField5(var471);
    }
    
    public static SubLObject f29877(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29719(var469) : var469;
        return var469.setField6(var471);
    }
    
    public static SubLObject f29878(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29719(var469) : var469;
        return var469.setField7(var471);
    }
    
    public static SubLObject f29879(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29719(var469) : var469;
        return var469.setField8(var471);
    }
    
    public static SubLObject f29880(SubLObject var472) {
        if (var472 == UNPROVIDED) {
            var472 = (SubLObject)NIL;
        }
        final SubLObject var473 = (SubLObject)new $sX32779_native();
        SubLObject var474;
        SubLObject var475;
        SubLObject var476;
        SubLObject var477;
        for (var474 = (SubLObject)NIL, var474 = var472; NIL != var474; var474 = conses_high.cddr(var474)) {
            var475 = var474.first();
            var476 = conses_high.cadr(var474);
            var477 = var475;
            if (var477.eql((SubLObject)$ic275$)) {
                f29873(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic276$)) {
                f29874(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic277$)) {
                f29875(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic278$)) {
                f29876(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic15$)) {
                f29877(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic279$)) {
                f29878(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic280$)) {
                f29879(var473, var476);
            }
            else {
                Errors.error((SubLObject)$ic281$, var475);
            }
        }
        return var473;
    }
    
    public static SubLObject f29881(final SubLObject var477, final SubLObject var478) {
        Functions.funcall(var478, var477, (SubLObject)$ic282$, (SubLObject)$ic283$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic275$, f29867(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic276$, f29868(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic277$, f29869(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic278$, f29824(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic15$, f29870(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic279$, f29871(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic280$, f29872(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic285$, (SubLObject)$ic283$, (SubLObject)SEVEN_INTEGER);
        return var477;
    }
    
    public static SubLObject f29882(final SubLObject var477, final SubLObject var478) {
        return f29881(var477, var478);
    }
    
    public static SubLObject f29715(final SubLObject var121, final SubLObject var479) {
        assert NIL != module0423.f29532(var121) : var121;
        if (NIL != var479 && !areAssertionsDisabledFor(me) && NIL == f29714(var479)) {
            throw new AssertionError(var479);
        }
        final SubLObject var480 = f29880((SubLObject)UNPROVIDED);
        final SubLObject var481 = f29835();
        f29836(var481, var480);
        f29873(var480, var481);
        f29875(var480, var121);
        f29874(var480, Locks.make_lock((SubLObject)$ic288$));
        f29878(var480, var479);
        f29879(var480, (SubLObject)$ic289$);
        return var480;
    }
    
    public static SubLObject f29863(final SubLObject var213) {
        assert NIL != f29719(var213) : var213;
        f29837(f29867(var213));
        f29873(var213, (SubLObject)NIL);
        if (NIL != inference_datastructures_inference_oc.f25417(f29824(var213))) {
            inference_datastructures_inference_oc.f25476(f29824(var213));
        }
        f29875(var213, (SubLObject)NIL);
        f29874(var213, (SubLObject)NIL);
        f29877(var213, (SubLObject)NIL);
        f29879(var213, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29839(final SubLObject var213) {
        return f29869(var213);
    }
    
    public static SubLObject f29883(final SubLObject var213) {
        return f29868(var213);
    }
    
    public static SubLObject f29744(final SubLObject var213) {
        return f29824(var213);
    }
    
    public static SubLObject f29884(final SubLObject var213) {
        return f29870(var213);
    }
    
    public static SubLObject f29885(final SubLObject var213) {
        return f29871(var213);
    }
    
    public static SubLObject f29847(final SubLObject var213) {
        return f29872(var213);
    }
    
    public static SubLObject f29826(final SubLObject var213, final SubLObject var134) {
        assert NIL != inference_datastructures_inference_oc.f25275(var134) : var134;
        assert NIL != f29719(var213) : var213;
        final SubLObject var214 = f29868(var213);
        SubLObject var215 = (SubLObject)NIL;
        try {
            var215 = Locks.seize_lock(var214);
            f29876(var213, var134);
        }
        finally {
            if (NIL != var215) {
                Locks.release_lock(var214);
            }
        }
        return var213;
    }
    
    public static SubLObject f29720(final SubLObject var213, final SubLObject var9) {
        assert NIL != f29719(var213) : var213;
        assert NIL != f29626(var9) : var9;
        final SubLObject var214 = f29868(var213);
        SubLObject var215 = (SubLObject)NIL;
        try {
            var215 = Locks.seize_lock(var214);
            f29877(var213, var9);
        }
        finally {
            if (NIL != var215) {
                Locks.release_lock(var214);
            }
        }
        return var213;
    }
    
    public static SubLObject f29859(final SubLObject var213, final SubLObject var468) {
        assert NIL != f29719(var213) : var213;
        assert NIL != Types.keywordp(var468) : var468;
        final SubLObject var469 = f29868(var213);
        SubLObject var470 = (SubLObject)NIL;
        try {
            var470 = Locks.seize_lock(var469);
            f29879(var213, var468);
        }
        finally {
            if (NIL != var470) {
                Locks.release_lock(var469);
            }
        }
        return var213;
    }
    
    public static SubLObject f29717(final SubLObject var213, final SubLObject var468) {
        if (NIL != f29719(var213)) {
            return f29859(var213, var468);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29886(final SubLObject var469, final SubLObject var470) {
        compatibility.default_struct_print_function(var469, var470, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29714(final SubLObject var469) {
        return (SubLObject)((var469.getClass() == $sX32781_native.class) ? T : NIL);
    }
    
    public static SubLObject f29728(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField2();
    }
    
    public static SubLObject f29887(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField3();
    }
    
    public static SubLObject f29888(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField4();
    }
    
    public static SubLObject f29889(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField5();
    }
    
    public static SubLObject f29890(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField6();
    }
    
    public static SubLObject f29891(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField7();
    }
    
    public static SubLObject f29892(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField8();
    }
    
    public static SubLObject f29893(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField9();
    }
    
    public static SubLObject f29894(final SubLObject var469) {
        assert NIL != f29714(var469) : var469;
        return var469.getField10();
    }
    
    public static SubLObject f29895(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField2(var471);
    }
    
    public static SubLObject f29896(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField3(var471);
    }
    
    public static SubLObject f29897(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField4(var471);
    }
    
    public static SubLObject f29898(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField5(var471);
    }
    
    public static SubLObject f29899(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField6(var471);
    }
    
    public static SubLObject f29900(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField7(var471);
    }
    
    public static SubLObject f29901(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField8(var471);
    }
    
    public static SubLObject f29902(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField9(var471);
    }
    
    public static SubLObject f29903(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29714(var469) : var469;
        return var469.setField10(var471);
    }
    
    public static SubLObject f29904(SubLObject var472) {
        if (var472 == UNPROVIDED) {
            var472 = (SubLObject)NIL;
        }
        final SubLObject var473 = (SubLObject)new $sX32781_native();
        SubLObject var474;
        SubLObject var475;
        SubLObject var476;
        SubLObject var477;
        for (var474 = (SubLObject)NIL, var474 = var472; NIL != var474; var474 = conses_high.cddr(var474)) {
            var475 = var474.first();
            var476 = conses_high.cadr(var474);
            var477 = var475;
            if (var477.eql((SubLObject)$ic275$)) {
                f29895(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic276$)) {
                f29896(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic317$)) {
                f29897(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic15$)) {
                f29898(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic318$)) {
                f29899(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic319$)) {
                f29900(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic280$)) {
                f29901(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic320$)) {
                f29902(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic285$)) {
                f29903(var473, var476);
            }
            else {
                Errors.error((SubLObject)$ic281$, var475);
            }
        }
        return var473;
    }
    
    public static SubLObject f29905(final SubLObject var477, final SubLObject var478) {
        Functions.funcall(var478, var477, (SubLObject)$ic282$, (SubLObject)$ic321$, (SubLObject)NINE_INTEGER);
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic275$, f29728(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic276$, f29887(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic317$, f29888(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic15$, f29889(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic318$, f29890(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic319$, f29891(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic280$, f29892(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic320$, f29893(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic285$, f29894(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic285$, (SubLObject)$ic321$, (SubLObject)NINE_INTEGER);
        return var477;
    }
    
    public static SubLObject f29906(final SubLObject var477, final SubLObject var478) {
        return f29905(var477, var478);
    }
    
    public static SubLObject f29727(final SubLObject var193, SubLObject var489) {
        if (var489 == UNPROVIDED) {
            var489 = (SubLObject)NIL;
        }
        assert NIL != module0633.f38716(var193, (SubLObject)UNPROVIDED) : var193;
        if (NIL != var489 && !areAssertionsDisabledFor(me) && NIL == f29729(var489)) {
            throw new AssertionError(var489);
        }
        final SubLObject var490 = f29904((SubLObject)UNPROVIDED);
        final SubLObject var491 = f29835();
        f29836(var491, var490);
        f29895(var490, var491);
        f29897(var490, var193);
        f29896(var490, Locks.make_lock((SubLObject)$ic324$));
        f29899(var490, (SubLObject)NIL);
        f29900(var490, var489);
        f29901(var490, (SubLObject)$ic289$);
        f29902(var490, (SubLObject)NIL);
        f29903(var490, (SubLObject)NIL);
        return var490;
    }
    
    public static SubLObject f29864(final SubLObject var490) {
        assert NIL != f29714(var490) : var490;
        f29837(f29728(var490));
        f29895(var490, (SubLObject)NIL);
        if (NIL != f29729(f29891(var490))) {
            f29907(f29891(var490), var490);
        }
        if (NIL != f29890(var490)) {
            f29863(f29890(var490));
        }
        f29897(var490, (SubLObject)NIL);
        f29896(var490, (SubLObject)NIL);
        f29898(var490, (SubLObject)NIL);
        f29901(var490, (SubLObject)NIL);
        f29902(var490, (SubLObject)NIL);
        f29903(var490, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29840(final SubLObject var490) {
        return f29888(var490);
    }
    
    public static SubLObject f29908(final SubLObject var490) {
        return f29887(var490);
    }
    
    public static SubLObject f29909(final SubLObject var490) {
        return f29889(var490);
    }
    
    public static SubLObject f29743(final SubLObject var490) {
        return f29890(var490);
    }
    
    public static SubLObject f29910(final SubLObject var490) {
        return f29891(var490);
    }
    
    public static SubLObject f29851(final SubLObject var490) {
        final SubLObject var491 = f29743(var490);
        if (NIL != f29719(var491)) {
            return f29824(var491);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29843(final SubLObject var490) {
        return f29671(f29909(var490));
    }
    
    public static SubLObject f29911(final SubLObject var490) {
        final SubLObject var491 = f29909(var490);
        final SubLObject var492 = f29670(var491);
        final SubLObject var493 = f29630(var492);
        final SubLObject var494 = var493.first();
        final SubLObject var495 = conses_high.second(var493);
        final SubLObject var496 = f29840(var490);
        return f29749(var496, var494, var495);
    }
    
    public static SubLObject f29912(final SubLObject var490, final SubLObject var14) {
        final SubLObject var491 = f29909(var490);
        final SubLObject var492 = f29670(var491);
        return f29631(var492, var14, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29848(final SubLObject var490) {
        assert NIL != f29714(var490) : var490;
        final SubLObject var491 = f29743(var490);
        if (NIL != f29719(var491)) {
            return f29847(var491);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29853(final SubLObject var490) {
        return f29893(var490);
    }
    
    public static SubLObject f29856(final SubLObject var490) {
        return f29894(var490);
    }
    
    public static SubLObject f29733(final SubLObject var490, final SubLObject var63) {
        assert NIL != f29714(var490) : var490;
        assert NIL != f29667(var63) : var63;
        final SubLObject var491 = f29887(var490);
        SubLObject var492 = (SubLObject)NIL;
        try {
            var492 = Locks.seize_lock(var491);
            f29898(var490, var63);
        }
        finally {
            if (NIL != var492) {
                Locks.release_lock(var491);
            }
        }
        return var490;
    }
    
    public static SubLObject f29716(final SubLObject var490, final SubLObject var213) {
        assert NIL != f29714(var490) : var490;
        assert NIL != f29719(var213) : var213;
        final SubLObject var491 = f29887(var490);
        SubLObject var492 = (SubLObject)NIL;
        try {
            var492 = Locks.seize_lock(var491);
            f29899(var490, var213);
        }
        finally {
            if (NIL != var492) {
                Locks.release_lock(var491);
            }
        }
        return var490;
    }
    
    public static SubLObject f29913(final SubLObject var490, final SubLObject var496) {
        assert NIL != f29714(var490) : var490;
        assert NIL != f29729(var496) : var496;
        final SubLObject var497 = f29887(var490);
        SubLObject var498 = (SubLObject)NIL;
        try {
            var498 = Locks.seize_lock(var497);
            f29900(var490, var496);
        }
        finally {
            if (NIL != var498) {
                Locks.release_lock(var497);
            }
        }
        return var490;
    }
    
    public static SubLObject f29860(final SubLObject var490, final SubLObject var468) {
        assert NIL != f29714(var490) : var490;
        assert NIL != Types.keywordp(var468) : var468;
        final SubLObject var491 = f29887(var490);
        SubLObject var492 = (SubLObject)NIL;
        try {
            var492 = Locks.seize_lock(var491);
            f29901(var490, var468);
        }
        finally {
            if (NIL != var492) {
                Locks.release_lock(var491);
            }
        }
        return var490;
    }
    
    public static SubLObject f29914(final SubLObject var490, SubLObject var364) {
        if (var364 == UNPROVIDED) {
            var364 = (SubLObject)NIL;
        }
        if (NIL == var364) {
            var364 = Time.get_universal_time();
        }
        assert NIL != f29714(var490) : var490;
        final SubLObject var491 = f29887(var490);
        SubLObject var492 = (SubLObject)NIL;
        try {
            var492 = Locks.seize_lock(var491);
            f29902(var490, var364);
        }
        finally {
            if (NIL != var492) {
                Locks.release_lock(var491);
            }
        }
        return var490;
    }
    
    public static SubLObject f29915(final SubLObject var490, SubLObject var364) {
        if (var364 == UNPROVIDED) {
            var364 = (SubLObject)NIL;
        }
        if (NIL == var364) {
            var364 = Time.get_universal_time();
        }
        assert NIL != f29714(var490) : var490;
        final SubLObject var491 = f29887(var490);
        SubLObject var492 = (SubLObject)NIL;
        try {
            var492 = Locks.seize_lock(var491);
            f29903(var490, var364);
        }
        finally {
            if (NIL != var492) {
                Locks.release_lock(var491);
            }
        }
        return var490;
    }
    
    public static SubLObject f29916(final SubLObject var469, final SubLObject var470) {
        compatibility.default_struct_print_function(var469, var470, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29729(final SubLObject var469) {
        return (SubLObject)((var469.getClass() == $sX32783_native.class) ? T : NIL);
    }
    
    public static SubLObject f29776(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField2();
    }
    
    public static SubLObject f29917(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField3();
    }
    
    public static SubLObject f29918(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField4();
    }
    
    public static SubLObject f29919(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField5();
    }
    
    public static SubLObject f29920(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField6();
    }
    
    public static SubLObject f29921(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField7();
    }
    
    public static SubLObject f29922(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField8();
    }
    
    public static SubLObject f29923(final SubLObject var469) {
        assert NIL != f29729(var469) : var469;
        return var469.getField9();
    }
    
    public static SubLObject f29924(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField2(var471);
    }
    
    public static SubLObject f29925(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField3(var471);
    }
    
    public static SubLObject f29926(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField4(var471);
    }
    
    public static SubLObject f29927(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField5(var471);
    }
    
    public static SubLObject f29928(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField6(var471);
    }
    
    public static SubLObject f29929(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField7(var471);
    }
    
    public static SubLObject f29930(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField8(var471);
    }
    
    public static SubLObject f29931(final SubLObject var469, final SubLObject var471) {
        assert NIL != f29729(var469) : var469;
        return var469.setField9(var471);
    }
    
    public static SubLObject f29932(SubLObject var472) {
        if (var472 == UNPROVIDED) {
            var472 = (SubLObject)NIL;
        }
        final SubLObject var473 = (SubLObject)new $sX32783_native();
        SubLObject var474;
        SubLObject var475;
        SubLObject var476;
        SubLObject var477;
        for (var474 = (SubLObject)NIL, var474 = var472; NIL != var474; var474 = conses_high.cddr(var474)) {
            var475 = var474.first();
            var476 = conses_high.cadr(var474);
            var477 = var475;
            if (var477.eql((SubLObject)$ic275$)) {
                f29924(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic276$)) {
                f29925(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic349$)) {
                f29926(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic15$)) {
                f29927(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic350$)) {
                f29928(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic280$)) {
                f29929(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic320$)) {
                f29930(var473, var476);
            }
            else if (var477.eql((SubLObject)$ic285$)) {
                f29931(var473, var476);
            }
            else {
                Errors.error((SubLObject)$ic281$, var475);
            }
        }
        return var473;
    }
    
    public static SubLObject f29933(final SubLObject var477, final SubLObject var478) {
        Functions.funcall(var478, var477, (SubLObject)$ic282$, (SubLObject)$ic351$, (SubLObject)EIGHT_INTEGER);
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic275$, f29776(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic276$, f29917(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic349$, f29918(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic15$, f29919(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic350$, f29920(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic280$, f29921(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic320$, f29922(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic284$, (SubLObject)$ic285$, f29923(var477));
        Functions.funcall(var478, var477, (SubLObject)$ic285$, (SubLObject)$ic351$, (SubLObject)EIGHT_INTEGER);
        return var477;
    }
    
    public static SubLObject f29934(final SubLObject var477, final SubLObject var478) {
        return f29933(var477, var478);
    }
    
    public static SubLObject f29775(final SubLObject var508) {
        assert NIL != module0633.f38718(var508, (SubLObject)UNPROVIDED) : var508;
        final SubLObject var509 = f29932((SubLObject)UNPROVIDED);
        final SubLObject var510 = f29835();
        f29836(var510, var509);
        f29924(var509, var510);
        f29926(var509, var508);
        f29925(var509, Locks.make_lock((SubLObject)$ic354$));
        f29927(var509, (SubLObject)NIL);
        f29928(var509, (SubLObject)NIL);
        f29929(var509, (SubLObject)$ic289$);
        f29930(var509, (SubLObject)NIL);
        f29931(var509, (SubLObject)NIL);
        return var509;
    }
    
    public static SubLObject f29865(final SubLObject var496) {
        assert NIL != f29729(var496) : var496;
        f29837(f29776(var496));
        f29924(var496, (SubLObject)NIL);
        SubLObject var497 = f29920(var496);
        SubLObject var498 = (SubLObject)NIL;
        var498 = var497.first();
        while (NIL != var497) {
            f29864(var498);
            var497 = var497.rest();
            var498 = var497.first();
        }
        f29926(var496, (SubLObject)NIL);
        f29925(var496, (SubLObject)NIL);
        f29927(var496, (SubLObject)NIL);
        f29929(var496, (SubLObject)NIL);
        f29930(var496, (SubLObject)NIL);
        f29931(var496, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29841(final SubLObject var496) {
        return f29918(var496);
    }
    
    public static SubLObject f29935(final SubLObject var496) {
        return f29917(var496);
    }
    
    public static SubLObject f29936(final SubLObject var496) {
        return f29919(var496);
    }
    
    public static SubLObject f29937(final SubLObject var496) {
        return f29920(var496);
    }
    
    public static SubLObject f29844(final SubLObject var496) {
        final SubLObject var497 = f29708(f29936(var496));
        final SubLObject var498 = Sequences.find_if(Symbols.symbol_function((SubLObject)$ic355$), var497, Symbols.symbol_function((SubLObject)$ic356$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var499 = Sequences.find_if(Symbols.symbol_function((SubLObject)$ic357$), var497, Symbols.symbol_function((SubLObject)$ic356$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var498) {
            return (SubLObject)$ic2$;
        }
        if (NIL != var499) {
            return (SubLObject)$ic1$;
        }
        return (SubLObject)$ic0$;
    }
    
    public static SubLObject f29849(final SubLObject var496) {
        return f29921(var496);
    }
    
    public static SubLObject f29854(final SubLObject var496) {
        return f29922(var496);
    }
    
    public static SubLObject f29857(final SubLObject var496) {
        return f29923(var496);
    }
    
    public static SubLObject f29781(final SubLObject var496, final SubLObject var72) {
        assert NIL != f29729(var496) : var496;
        assert NIL != f29703(var72) : var72;
        final SubLObject var497 = f29917(var496);
        SubLObject var498 = (SubLObject)NIL;
        try {
            var498 = Locks.seize_lock(var497);
            f29927(var496, var72);
        }
        finally {
            if (NIL != var498) {
                Locks.release_lock(var497);
            }
        }
        return var496;
    }
    
    public static SubLObject f29730(final SubLObject var496, final SubLObject var490) {
        assert NIL != f29729(var496) : var496;
        assert NIL != f29714(var490) : var490;
        final SubLObject var497 = f29917(var496);
        SubLObject var498 = (SubLObject)NIL;
        try {
            var498 = Locks.seize_lock(var497);
            final SubLObject var499 = f29920(var496);
            f29928(var496, module0035.f2083(var490, var499));
        }
        finally {
            if (NIL != var498) {
                Locks.release_lock(var497);
            }
        }
        return var496;
    }
    
    public static SubLObject f29907(final SubLObject var496, final SubLObject var490) {
        assert NIL != f29729(var496) : var496;
        assert NIL != f29714(var490) : var490;
        final SubLObject var497 = f29917(var496);
        SubLObject var498 = (SubLObject)NIL;
        try {
            var498 = Locks.seize_lock(var497);
            final SubLObject var499 = f29920(var496);
            f29928(var496, Sequences.remove(var490, var499, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var498) {
                Locks.release_lock(var497);
            }
        }
        return var496;
    }
    
    public static SubLObject f29861(final SubLObject var496, final SubLObject var468) {
        assert NIL != f29729(var496) : var496;
        assert NIL != Types.keywordp(var468) : var468;
        final SubLObject var497 = f29917(var496);
        SubLObject var498 = (SubLObject)NIL;
        try {
            var498 = Locks.seize_lock(var497);
            f29929(var496, var468);
        }
        finally {
            if (NIL != var498) {
                Locks.release_lock(var497);
            }
        }
        return var496;
    }
    
    public static SubLObject f29938(final SubLObject var496, SubLObject var364) {
        if (var364 == UNPROVIDED) {
            var364 = (SubLObject)NIL;
        }
        assert NIL != f29729(var496) : var496;
        if (NIL == var364) {
            var364 = Time.get_universal_time();
        }
        final SubLObject var497 = f29917(var496);
        SubLObject var498 = (SubLObject)NIL;
        try {
            var498 = Locks.seize_lock(var497);
            f29930(var496, var364);
        }
        finally {
            if (NIL != var498) {
                Locks.release_lock(var497);
            }
        }
        return var496;
    }
    
    public static SubLObject f29939(final SubLObject var496, SubLObject var364) {
        if (var364 == UNPROVIDED) {
            var364 = (SubLObject)NIL;
        }
        assert NIL != f29729(var496) : var496;
        if (NIL == var364) {
            var364 = Time.get_universal_time();
        }
        final SubLObject var497 = f29917(var496);
        SubLObject var498 = (SubLObject)NIL;
        try {
            var498 = Locks.seize_lock(var497);
            f29931(var496, var364);
        }
        finally {
            if (NIL != var498) {
                Locks.release_lock(var497);
            }
        }
        return var496;
    }
    
    public static SubLObject f29787(final SubLObject var7, final SubLObject var330) {
        final SubLThread var331 = SubLProcess.currentSubLThread();
        SubLObject var332 = (SubLObject)NIL;
        try {
            final SubLObject var333 = stream_macros.$stream_requires_locking$.currentBinding(var331);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var331);
                var332 = compatibility.open_binary(var330, (SubLObject)$ic155$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var333, var331);
            }
            if (!var332.isStream()) {
                Errors.error((SubLObject)$ic213$, var330);
            }
            final SubLObject var470_526 = var332;
            final SubLObject var334 = module0021.$g777$.currentBinding(var331);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var331);
                module0021.f1151(f29624());
                module0021.f1040(var7, var470_526);
            }
            finally {
                module0021.$g777$.rebind(var334, var331);
            }
        }
        finally {
            final SubLObject var335 = Threads.$is_thread_performing_cleanupP$.currentBinding(var331);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var331);
                if (var332.isStream()) {
                    streams_high.close(var332, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var335, var331);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29805(final SubLObject var72, final SubLObject var330) {
        final SubLThread var331 = SubLProcess.currentSubLThread();
        SubLObject var332 = (SubLObject)NIL;
        try {
            final SubLObject var333 = stream_macros.$stream_requires_locking$.currentBinding(var331);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var331);
                var332 = compatibility.open_binary(var330, (SubLObject)$ic155$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var333, var331);
            }
            if (!var332.isStream()) {
                Errors.error((SubLObject)$ic213$, var330);
            }
            final SubLObject var470_528 = var332;
            final SubLObject var334 = module0021.$g777$.currentBinding(var331);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var331);
                module0021.f1151($g3449$.getGlobalValue());
                module0021.f1040(var72, var470_528);
            }
            finally {
                module0021.$g777$.rebind(var334, var331);
            }
        }
        finally {
            final SubLObject var335 = Threads.$is_thread_performing_cleanupP$.currentBinding(var331);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var331);
                if (var332.isStream()) {
                    streams_high.close(var332, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var335, var331);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29940(SubLObject var7, final SubLObject var330) {
        var7 = f29676(var7);
        return f29787(var7, var330);
    }
    
    public static SubLObject f29756(final SubLObject var330, SubLObject var251) {
        if (var251 == UNPROVIDED) {
            var251 = (SubLObject)$ic155$;
        }
        final SubLThread var331 = SubLProcess.currentSubLThread();
        SubLObject var332 = (SubLObject)NIL;
        final SubLObject var333 = stream_macros.$stream_requires_locking$.currentBinding(var331);
        try {
            stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var331);
            var332 = compatibility.open_binary(var330, var251);
        }
        finally {
            stream_macros.$stream_requires_locking$.rebind(var333, var331);
        }
        return var332;
    }
    
    public static SubLObject f29777(final SubLObject var330, SubLObject var251) {
        if (var251 == UNPROVIDED) {
            var251 = (SubLObject)$ic155$;
        }
        return f29756(var330, var251);
    }
    
    public static SubLObject f29757(final SubLObject var470, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var471 = SubLProcess.currentSubLThread();
        final SubLObject var472 = f29674((SubLObject)NIL, var65);
        final SubLObject var473 = module0021.$g777$.currentBinding(var471);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var471);
            module0021.f1151(f29624());
            module0021.f1040(var472, var470);
        }
        finally {
            module0021.$g777$.rebind(var473, var471);
        }
        streams_high.force_output(var470);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29778(final SubLObject var470, SubLObject var65) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        final SubLThread var471 = SubLProcess.currentSubLThread();
        final SubLObject var472 = f29704((SubLObject)NIL, var65);
        final SubLObject var473 = module0021.$g777$.currentBinding(var471);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var471);
            module0021.f1151($g3449$.getGlobalValue());
            module0021.f1040(var472, var470);
        }
        finally {
            module0021.$g777$.rebind(var473, var471);
        }
        streams_high.force_output(var470);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29758(final SubLObject var9, final SubLObject var470) {
        final SubLThread var471 = SubLProcess.currentSubLThread();
        final SubLObject var472 = module0021.$g777$.currentBinding(var471);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var471);
            module0021.f1151(f29624());
            module0021.f1040(var9, var470);
        }
        finally {
            module0021.$g777$.rebind(var472, var471);
        }
        streams_high.force_output(var470);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29779(final SubLObject var63, final SubLObject var470) {
        final SubLThread var471 = SubLProcess.currentSubLThread();
        final SubLObject var472 = module0021.$g777$.currentBinding(var471);
        try {
            module0021.$g777$.bind((SubLObject)NIL, var471);
            module0021.f1151($g3449$.getGlobalValue());
            module0021.f1040(var63, var470);
        }
        finally {
            module0021.$g777$.rebind(var472, var471);
        }
        streams_high.force_output(var470);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29941(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic359$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic359$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic359$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic359$);
        var9 = var5.first();
        var5 = var5.rest();
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var11 = var5;
        SubLObject var12 = (SubLObject)NIL;
        SubLObject var536_537 = (SubLObject)NIL;
        while (NIL != var11) {
            cdestructuring_bind.destructuring_bind_must_consp(var11, var4, (SubLObject)$ic359$);
            var536_537 = var11.first();
            var11 = var11.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var11, var4, (SubLObject)$ic359$);
            if (NIL == conses_high.member(var536_537, (SubLObject)$ic360$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var12 = (SubLObject)T;
            }
            if (var536_537 == $ic81$) {
                var10 = var11.first();
            }
            var11 = var11.rest();
        }
        if (NIL != var12 && NIL == var10) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic359$);
        }
        final SubLObject var13 = cdestructuring_bind.property_list_member((SubLObject)$ic361$, var5);
        final SubLObject var14 = (SubLObject)((NIL != var13) ? conses_high.cadr(var13) : NIL);
        final SubLObject var15;
        var5 = (var15 = var6);
        final SubLObject var16 = (SubLObject)$ic362$;
        final SubLObject var17 = (SubLObject)$ic363$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic364$, (SubLObject)ConsesLow.listS((SubLObject)$ic365$, var9, (SubLObject)$ic366$), (SubLObject)ConsesLow.list((SubLObject)$ic367$, (SubLObject)ConsesLow.listS(var16, var9, (SubLObject)$ic368$), (SubLObject)ConsesLow.list((SubLObject)$ic369$, (SubLObject)$ic370$, (SubLObject)ConsesLow.list((SubLObject)$ic371$, (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var7, (SubLObject)ConsesLow.list((SubLObject)$ic372$, var16))), (SubLObject)ConsesLow.listS((SubLObject)$ic373$, (SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic78$, var7), var14), ConsesLow.append(var15, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var17, var14)), (SubLObject)ConsesLow.list((SubLObject)$ic374$, (SubLObject)ConsesLow.list((SubLObject)$ic375$, var17), (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic376$, var16))), (SubLObject)ConsesLow.list((SubLObject)$ic377$, (SubLObject)ConsesLow.listS((SubLObject)EQ, var8, (SubLObject)$ic378$), (SubLObject)ConsesLow.listS((SubLObject)$ic379$, var17, (SubLObject)$ic380$)), (SubLObject)ConsesLow.listS((SubLObject)$ic381$, var17, (SubLObject)ConsesLow.list((SubLObject)$ic379$, var8, (SubLObject)ConsesLow.list((SubLObject)$ic382$, var8)), ConsesLow.append(var15, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic379$, var17, var14))))))))))));
    }
    
    public static SubLObject f29942(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic383$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic383$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic383$);
        var8 = var5.first();
        var5 = var5.rest();
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var5;
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var547_548 = (SubLObject)NIL;
        while (NIL != var10) {
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic383$);
            var547_548 = var10.first();
            var10 = var10.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var10, var4, (SubLObject)$ic383$);
            if (NIL == conses_high.member(var547_548, (SubLObject)$ic360$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var11 = (SubLObject)T;
            }
            if (var547_548 == $ic81$) {
                var9 = var10.first();
            }
            var10 = var10.rest();
        }
        if (NIL != var11 && NIL == var9) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic383$);
        }
        final SubLObject var12 = cdestructuring_bind.property_list_member((SubLObject)$ic361$, var5);
        final SubLObject var13 = (SubLObject)((NIL != var12) ? conses_high.cadr(var12) : NIL);
        final SubLObject var14;
        var5 = (var14 = var6);
        final SubLObject var15 = (SubLObject)$ic384$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic6$, (SubLObject)ConsesLow.list(var15, var7, var8, (SubLObject)$ic361$, var13), (SubLObject)ConsesLow.list((SubLObject)$ic385$, var15), ConsesLow.append(var14, (SubLObject)NIL));
    }
    
    public static SubLObject f29795(final SubLObject var330) {
        final SubLThread var331 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var330) : var330;
        SubLObject var332 = (SubLObject)NIL;
        SubLObject var333 = (SubLObject)NIL;
        SubLObject var334 = (SubLObject)NIL;
        try {
            final SubLObject var335 = stream_macros.$stream_requires_locking$.currentBinding(var331);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var331);
                var334 = compatibility.open_binary(var330, (SubLObject)$ic387$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var335, var331);
            }
            if (!var334.isStream()) {
                Errors.error((SubLObject)$ic213$, var330);
            }
            final SubLObject var470_552 = var334;
            final SubLObject var336 = module0021.$g777$.currentBinding(var331);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var331);
                module0021.f1151(f29624());
                final SubLObject var141_553 = module0021.$g789$.currentBinding(var331);
                try {
                    module0021.$g789$.bind(module0021.f1184(), var331);
                    var332 = f29943(var470_552);
                    SubLObject var337 = (SubLObject)NIL;
                    while (NIL == var337) {
                        final SubLObject var338 = f29944(var470_552);
                        var337 = Equality.eq(var338, (SubLObject)$ic388$);
                        if (NIL == var337) {
                            var333 = (SubLObject)ConsesLow.cons(var338, var333);
                        }
                    }
                }
                finally {
                    module0021.$g789$.rebind(var141_553, var331);
                }
            }
            finally {
                module0021.$g777$.rebind(var336, var331);
            }
        }
        finally {
            final SubLObject var339 = Threads.$is_thread_performing_cleanupP$.currentBinding(var331);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var331);
                if (var334.isStream()) {
                    streams_high.close(var334, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var339, var331);
            }
        }
        var333 = Sequences.nreverse(var333);
        var332 = f29945(var332, var333);
        var332 = f29946(var332);
        return var332;
    }
    
    public static SubLObject f29943(final SubLObject var470) {
        return module0021.f1060(var470, (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29944(final SubLObject var470) {
        return module0021.f1060(var470, (SubLObject)NIL, (SubLObject)$ic388$);
    }
    
    public static SubLObject f29945(SubLObject var7, final SubLObject var550) {
        if (NIL != var550) {
            SubLObject var551 = f29678(var7);
            var551 = ConsesLow.nconc(var551, var550);
            var7 = conses_high.putf(var7, (SubLObject)$ic77$, var551);
        }
        return var7;
    }
    
    public static SubLObject f29818(final SubLObject var330) {
        final SubLThread var331 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var330) : var330;
        SubLObject var332 = (SubLObject)NIL;
        SubLObject var333 = (SubLObject)NIL;
        SubLObject var334 = (SubLObject)NIL;
        try {
            final SubLObject var335 = stream_macros.$stream_requires_locking$.currentBinding(var331);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var331);
                var334 = compatibility.open_binary(var330, (SubLObject)$ic387$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var335, var331);
            }
            if (!var334.isStream()) {
                Errors.error((SubLObject)$ic213$, var330);
            }
            final SubLObject var470_556 = var334;
            final SubLObject var336 = module0021.$g777$.currentBinding(var331);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var331);
                module0021.f1151($g3449$.getGlobalValue());
                final SubLObject var141_557 = module0021.$g789$.currentBinding(var331);
                try {
                    module0021.$g789$.bind(module0021.f1184(), var331);
                    var332 = module0021.f1060(var470_556, (SubLObject)T, (SubLObject)UNPROVIDED);
                    SubLObject var337 = (SubLObject)NIL;
                    while (NIL == var337) {
                        final SubLObject var338 = module0021.f1060(var470_556, (SubLObject)NIL, (SubLObject)$ic388$);
                        var337 = Equality.eq(var338, (SubLObject)$ic388$);
                        if (NIL == var337) {
                            var333 = (SubLObject)ConsesLow.cons(var338, var333);
                        }
                    }
                }
                finally {
                    module0021.$g789$.rebind(var141_557, var331);
                }
            }
            finally {
                module0021.$g777$.rebind(var336, var331);
            }
        }
        finally {
            final SubLObject var339 = Threads.$is_thread_performing_cleanupP$.currentBinding(var331);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var331);
                if (var334.isStream()) {
                    streams_high.close(var334, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var339, var331);
            }
        }
        var333 = Sequences.nreverse(var333);
        var332 = f29947(var332, var333);
        var332 = f29948(var332);
        return var332;
    }
    
    public static SubLObject f29947(SubLObject var72, final SubLObject var554) {
        if (NIL != var554) {
            SubLObject var555 = f29708(var72);
            var555 = ConsesLow.nconc(var555, var554);
            var72 = conses_high.putf(var72, (SubLObject)$ic82$, var555);
        }
        return var72;
    }
    
    public static SubLObject f29946(final SubLObject var7) {
        SubLObject var8 = f29678(var7);
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            f29949(var9);
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f29948(final SubLObject var72) {
        SubLObject var73 = f29708(var72);
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            final SubLObject var75 = f29670(var74);
            f29949(var75);
            var73 = var73.rest();
            var74 = var73.first();
        }
        return var72;
    }
    
    public static SubLObject f29949(SubLObject var9) {
        final SubLObject var10 = f29638(var9);
        if (NIL != var10 && !var10.isNumber()) {
            Errors.warn((SubLObject)$ic389$, var10);
            var9 = conses_high.putf(var9, (SubLObject)$ic22$, (SubLObject)NIL);
        }
        return var9;
    }
    
    public static SubLObject f29950(final SubLObject var330, SubLObject var559) {
        if (var559 == UNPROVIDED) {
            var559 = (SubLObject)$ic391$;
        }
        final SubLObject var560 = f29797(var330);
        final SubLObject var561 = f29795(var330);
        final SubLObject var562 = Sequences.cconcatenate(var560, new SubLObject[] { var559, $g3457$.getGlobalValue() });
        assert NIL != module0075.f5193(var562) : var562;
        return f29940(var561, var562);
    }
    
    public static SubLObject f29797(final SubLObject var330) {
        final SubLThread var331 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var331) && NIL == module0038.f2673(var330, $g3457$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic392$, $g3457$.getGlobalValue(), var330);
        }
        return module0038.f2677(var330, Sequences.length($g3457$.getGlobalValue()));
    }
    
    public static SubLObject f29816(final SubLObject var330) {
        return f29797(var330);
    }
    
    public static SubLObject f29951(final SubLObject var7, final SubLObject var65, final SubLObject var13, final SubLObject var93, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = Symbols.symbol_function((SubLObject)EQUAL);
        }
        final SubLObject var94 = f29678(var7);
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = var94;
        SubLObject var97 = (SubLObject)NIL;
        var97 = var96.first();
        while (NIL != var96) {
            if (NIL != Functions.funcall(var61, var93, f29640(var97, var13, (SubLObject)UNPROVIDED))) {
                var95 = (SubLObject)ConsesLow.cons(var97, var95);
            }
            var96 = var96.rest();
            var97 = var96.first();
        }
        var95 = Sequences.nreverse(var95);
        SubLObject var98 = conses_high.copy_list(var7);
        var98 = conses_high.putf(var98, (SubLObject)$ic77$, var95);
        if (NIL != var65) {
            var98 = conses_high.putf(var98, (SubLObject)$ic76$, var65);
        }
        return var98;
    }
    
    public static SubLObject f29952(final SubLObject var7, final SubLObject var65, final SubLObject var61, SubLObject var273) {
        if (var273 == UNPROVIDED) {
            var273 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLObject var274 = f29678(var7);
        SubLObject var275 = (SubLObject)NIL;
        SubLObject var276 = var274;
        SubLObject var277 = (SubLObject)NIL;
        var277 = var276.first();
        while (NIL != var276) {
            if (NIL != Functions.funcall(var61, Functions.funcall(var273, var277))) {
                var275 = (SubLObject)ConsesLow.cons(var277, var275);
            }
            var276 = var276.rest();
            var277 = var276.first();
        }
        var275 = Sequences.nreverse(var275);
        SubLObject var278 = conses_high.copy_list(var7);
        var278 = conses_high.putf(var278, (SubLObject)$ic77$, var275);
        if (NIL != var65) {
            var278 = conses_high.putf(var278, (SubLObject)$ic76$, var65);
        }
        return var278;
    }
    
    public static SubLObject f29809(final SubLObject var72, final SubLObject var65, final SubLObject var61, SubLObject var273) {
        if (var273 == UNPROVIDED) {
            var273 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLObject var274 = f29708(var72);
        SubLObject var275 = (SubLObject)NIL;
        SubLObject var276 = var274;
        SubLObject var277 = (SubLObject)NIL;
        var277 = var276.first();
        while (NIL != var276) {
            if (NIL != Functions.funcall(var61, Functions.funcall(var273, var277))) {
                var275 = (SubLObject)ConsesLow.cons(var277, var275);
            }
            var276 = var276.rest();
            var277 = var276.first();
        }
        var275 = Sequences.nreverse(var275);
        SubLObject var278 = conses_high.copy_list(var72);
        var278 = conses_high.putf(var278, (SubLObject)$ic82$, var275);
        if (NIL != var65) {
            var278 = conses_high.putf(var278, (SubLObject)$ic76$, var65);
        }
        return var278;
    }
    
    public static SubLObject f29696(final SubLObject var7) {
        final SubLObject var8 = f29681(var7);
        final SubLObject var9 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic393$, var8);
        return f29952(var7, var9, Symbols.symbol_function((SubLObject)$ic394$), Symbols.symbol_function((SubLObject)$ic103$));
    }
    
    public static SubLObject f29953(final SubLObject var72) {
        final SubLObject var73 = f29706(var72);
        final SubLObject var74 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic393$, var73);
        return f29809(var72, var74, Symbols.symbol_function((SubLObject)$ic394$), Symbols.symbol_function((SubLObject)$ic395$));
    }
    
    public static SubLObject f29954(final SubLObject var72) {
        final SubLObject var73 = f29706(var72);
        final SubLObject var74 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic396$, var73);
        return f29809(var72, var74, (SubLObject)$ic397$, (SubLObject)$ic356$);
    }
    
    public static SubLObject f29955(final SubLObject var7) {
        final SubLObject var8 = f29681(var7);
        final SubLObject var9 = Sequences.cconcatenate((SubLObject)$ic398$, new SubLObject[] { module0006.$g11$.getGlobalValue(), module0006.f203(var8) });
        return f29951(var7, var9, (SubLObject)$ic18$, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29956(final SubLObject var72) {
        final SubLObject var73 = f29706(var72);
        final SubLObject var74 = Sequences.cconcatenate((SubLObject)$ic398$, new SubLObject[] { module0006.$g11$.getGlobalValue(), module0006.f203(var73) });
        return f29809(var72, var74, Symbols.symbol_function((SubLObject)$ic399$), Symbols.symbol_function((SubLObject)$ic395$));
    }
    
    public static SubLObject f29810(final SubLObject var72) {
        final SubLObject var73 = f29706(var72);
        final SubLObject var74 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic400$, var73);
        return f29809(var72, var74, (SubLObject)$ic357$, (SubLObject)$ic356$);
    }
    
    public static SubLObject f29957(final SubLObject var72) {
        return f29712(var72, f29811(var72), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29958(final SubLObject var72) {
        return f29959(var72, $ic401$);
    }
    
    public static SubLObject f29960(final SubLObject var72) {
        return f29959(var72, $ic402$);
    }
    
    public static SubLObject f29959(final SubLObject var72, final SubLObject var566) {
        final SubLObject var567 = f29708(var72);
        SubLObject var568 = (SubLObject)NIL;
        SubLObject var569 = var567;
        SubLObject var570 = (SubLObject)NIL;
        var570 = var569.first();
        while (NIL != var569) {
            if (NIL != module0259.f16891(f29669(var570), var566)) {
                var568 = (SubLObject)ConsesLow.cons(var570, var568);
            }
            var569 = var569.rest();
            var570 = var569.first();
        }
        var568 = Sequences.nreverse(var568);
        SubLObject var571 = conses_high.copy_list(var72);
        final SubLObject var572 = f29706(var72);
        final SubLObject var573 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic403$, var566, var572);
        var571 = conses_high.putf(var571, (SubLObject)$ic82$, var568);
        var571 = conses_high.putf(var571, (SubLObject)$ic76$, var573);
        return var571;
    }
    
    public static SubLObject f29961(final SubLObject var72) {
        return f29709(f29810(var72));
    }
    
    public static SubLObject f29962(final SubLObject var72) {
        return f29709(f29954(var72));
    }
    
    public static SubLObject f29963(final SubLObject var72) {
        return f29709(f29953(var72));
    }
    
    public static SubLObject f29964(final SubLObject var72) {
        return f29709(f29956(var72));
    }
    
    public static SubLObject f29965(final SubLObject var459, final SubLObject var464) {
        return module0035.f2220(f29961(var464), f29961(var459), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29966(final SubLObject var569, final SubLObject var570, final SubLObject var13, SubLObject var61, SubLObject var273) {
        if (var61 == UNPROVIDED) {
            var61 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var273 == UNPROVIDED) {
            var273 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        final SubLThread var571 = SubLProcess.currentSubLThread();
        final SubLObject var572 = f29678(var569);
        final SubLObject var573 = f29678(var570);
        final SubLObject var574 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), Sequences.length(var572));
        SubLObject var575 = (SubLObject)NIL;
        SubLObject var576 = var572;
        SubLObject var577 = (SubLObject)NIL;
        var577 = var576.first();
        while (NIL != var576) {
            final SubLObject var578 = f29629(var577);
            final SubLObject var579 = f29640(var577, var13, (SubLObject)UNPROVIDED);
            final SubLObject var580 = Functions.funcall(var273, var579);
            module0067.f4886(var574, var578, var580);
            var576 = var576.rest();
            var577 = var576.first();
        }
        var576 = var573;
        SubLObject var581 = (SubLObject)NIL;
        var581 = var576.first();
        while (NIL != var576) {
            final SubLObject var578 = f29629(var581);
            final SubLObject var582 = f29640(var581, var13, (SubLObject)UNPROVIDED);
            final SubLObject var583 = Functions.funcall(var273, var582);
            var571.resetMultipleValues();
            final SubLObject var584 = module0067.f4884(var574, var578, (SubLObject)UNPROVIDED);
            final SubLObject var585 = var571.secondMultipleValue();
            var571.resetMultipleValues();
            if (NIL != var585 && NIL != Functions.funcall(var61, var584, var583)) {
                var575 = (SubLObject)ConsesLow.cons(var578, var575);
            }
            var576 = var576.rest();
            var581 = var576.first();
        }
        return Sequences.nreverse(var575);
    }
    
    public static SubLObject f29967(final SubLObject var66) {
        SubLObject var67 = var66.first();
        SubLObject var68 = var66.rest();
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            var67 = f29968(var67, var69);
            var68 = var68.rest();
            var69 = var68.first();
        }
        return f29688(var67);
    }
    
    public static SubLObject f29969(final SubLObject var66) {
        SubLObject var67 = var66.first();
        SubLObject var68 = var66.rest();
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            var67 = f29970(var67, var69);
            var68 = var68.rest();
            var69 = var68.first();
        }
        return f29688(var67);
    }
    
    public static SubLObject f29971(final SubLObject var7, SubLObject var583) {
        if (var583 == UNPROVIDED) {
            var583 = (SubLObject)ONE_INTEGER;
        }
        SubLObject var584 = (SubLObject)NIL;
        SubLObject var585 = f29678(var7);
        SubLObject var586 = (SubLObject)NIL;
        var586 = var585.first();
        while (NIL != var585) {
            if (NIL != module0035.f2405(f29635(var586), var583)) {
                var584 = (SubLObject)ConsesLow.cons(f29629(var586), var584);
            }
            var585 = var585.rest();
            var586 = var585.first();
        }
        return Sequences.nreverse(var584);
    }
    
    public static SubLObject f29972(final SubLObject var116) {
        SubLObject var117 = f29954(var116.first());
        SubLObject var118 = var116.rest();
        SubLObject var119 = (SubLObject)NIL;
        var119 = var118.first();
        while (NIL != var118) {
            var117 = f29973(var117, var119);
            var118 = var118.rest();
            var119 = var118.first();
        }
        return f29709(var117);
    }
    
    public static SubLObject f29974(final SubLObject var116) {
        SubLObject var117 = f29810(var116.first());
        SubLObject var118 = var116.rest();
        SubLObject var119 = (SubLObject)NIL;
        var119 = var118.first();
        while (NIL != var118) {
            var117 = f29975(var117, var119);
            var118 = var118.rest();
            var119 = var118.first();
        }
        return f29709(var117);
    }
    
    public static SubLObject f29968(final SubLObject var569, final SubLObject var570) {
        final SubLObject var571 = f29696(var569);
        final SubLObject var572 = f29696(var570);
        final SubLObject var573 = f29687(var571, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        final SubLObject var574 = f29687(var572, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        final SubLObject var575 = module0076.f5290(var573, var574, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var576 = f29693(var571, var575, (SubLObject)UNPROVIDED);
        final SubLObject var577 = f29693(var572, var575, (SubLObject)UNPROVIDED);
        final SubLObject var578 = f29693(var571, var575, (SubLObject)T);
        final SubLObject var579 = f29693(var572, var575, (SubLObject)T);
        return Values.values(var576, var577, var578, var579);
    }
    
    public static SubLObject f29970(final SubLObject var569, final SubLObject var570) {
        final SubLObject var571 = f29955(var569);
        final SubLObject var572 = f29955(var570);
        final SubLObject var573 = f29687(var571, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        final SubLObject var574 = f29687(var572, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        final SubLObject var575 = module0076.f5290(var573, var574, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var576 = f29693(var571, var575, (SubLObject)UNPROVIDED);
        final SubLObject var577 = f29693(var572, var575, (SubLObject)UNPROVIDED);
        final SubLObject var578 = f29693(var571, var575, (SubLObject)T);
        final SubLObject var579 = f29693(var572, var575, (SubLObject)T);
        return Values.values(var576, var577, var578, var579);
    }
    
    public static SubLObject f29976(final SubLObject var66) {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = var66;
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            var67 = (SubLObject)ConsesLow.cons(f29688(var69), var67);
            var68 = var68.rest();
            var69 = var68.first();
        }
        return module0035.f2228(var67, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29977(final SubLObject var66) {
        SubLObject var67 = (SubLObject)NIL;
        final SubLObject var68 = f29976(var66);
        SubLObject var69 = var66;
        SubLObject var70 = (SubLObject)NIL;
        var70 = var69.first();
        while (NIL != var69) {
            final SubLObject var71 = f29693(var70, var68, (SubLObject)UNPROVIDED);
            var67 = (SubLObject)ConsesLow.cons(var71, var67);
            var69 = var69.rest();
            var70 = var69.first();
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f29978(final SubLObject var569, final SubLObject var570) {
        SubLObject var572;
        final SubLObject var571 = var572 = f29977((SubLObject)ConsesLow.list(var569, var570));
        SubLObject var573 = (SubLObject)NIL;
        SubLObject var574 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var572, var571, (SubLObject)$ic404$);
        var573 = var572.first();
        var572 = var572.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var572, var571, (SubLObject)$ic404$);
        var574 = var572.first();
        var572 = var572.rest();
        if (NIL == var572) {
            return Values.values(var573, var574);
        }
        cdestructuring_bind.cdestructuring_bind_error(var571, (SubLObject)$ic404$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29979(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        final SubLObject var118 = f29980(var116);
        SubLObject var119 = var116;
        SubLObject var120 = (SubLObject)NIL;
        var120 = var119.first();
        while (NIL != var119) {
            final SubLObject var121 = f29712(var120, var118, (SubLObject)UNPROVIDED);
            var117 = (SubLObject)ConsesLow.cons(var121, var117);
            var119 = var119.rest();
            var120 = var119.first();
        }
        return Sequences.nreverse(var117);
    }
    
    public static SubLObject f29973(final SubLObject var607, final SubLObject var608) {
        final SubLObject var609 = f29954(var607);
        final SubLObject var610 = f29954(var608);
        final SubLObject var611 = f29710(var609);
        final SubLObject var612 = f29710(var610);
        final SubLObject var613 = module0076.f5290(var611, var612, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var614 = f29712(var609, var613, (SubLObject)UNPROVIDED);
        final SubLObject var615 = f29712(var610, var613, (SubLObject)UNPROVIDED);
        final SubLObject var616 = f29712(var609, var613, (SubLObject)T);
        final SubLObject var617 = f29712(var610, var613, (SubLObject)T);
        return Values.values(var614, var615, var616, var617);
    }
    
    public static SubLObject f29975(final SubLObject var607, final SubLObject var608) {
        final SubLObject var609 = f29810(var607);
        final SubLObject var610 = f29810(var608);
        final SubLObject var611 = f29709(var609);
        final SubLObject var612 = f29709(var610);
        final SubLObject var613 = module0076.f5290(var611, var612, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var614 = f29712(var609, var613, (SubLObject)UNPROVIDED);
        final SubLObject var615 = f29712(var610, var613, (SubLObject)UNPROVIDED);
        final SubLObject var616 = f29712(var609, var613, (SubLObject)T);
        final SubLObject var617 = f29712(var610, var613, (SubLObject)T);
        return Values.values(var614, var615, var616, var617);
    }
    
    public static SubLObject f29981(final SubLObject var569, final SubLObject var570) {
        final SubLObject var571 = f29966(var569, var570, (SubLObject)$ic18$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f29982(var569, var570, var571);
    }
    
    public static SubLObject f29983(final SubLObject var569, final SubLObject var570) {
        final SubLObject var571 = f29966(var569, var570, (SubLObject)$ic18$, Symbols.symbol_function((SubLObject)$ic405$), (SubLObject)UNPROVIDED);
        return f29982(var569, var570, var571);
    }
    
    public static SubLObject f29982(final SubLObject var569, final SubLObject var570, final SubLObject var378) {
        final SubLObject var571 = f29693(var569, var378, (SubLObject)UNPROVIDED);
        final SubLObject var572 = f29693(var570, var378, (SubLObject)UNPROVIDED);
        final SubLObject var573 = f29693(var569, var378, (SubLObject)T);
        final SubLObject var574 = f29693(var570, var378, (SubLObject)T);
        return Values.values(var571, var572, var573, var574);
    }
    
    public static SubLObject f29984(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return module0077.f5320(var17, $g3464$.getDynamicValue(var18));
    }
    
    public static SubLObject f29985(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == module0077.f5320(var17, $g3464$.getDynamicValue(var18)));
    }
    
    public static SubLObject f29693(final SubLObject var7, final SubLObject var378, SubLObject var621) {
        if (var621 == UNPROVIDED) {
            var621 = (SubLObject)NIL;
        }
        final SubLThread var622 = SubLProcess.currentSubLThread();
        final SubLObject var623 = (SubLObject)$ic406$;
        SubLObject var624 = (SubLObject)NIL;
        final SubLObject var625 = $g3464$.currentBinding(var622);
        try {
            $g3464$.bind(module0078.f5367(var378, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var622);
            var624 = f29952(var7, var623, (SubLObject)((NIL != var621) ? $ic407$ : $ic408$), (SubLObject)$ic88$);
        }
        finally {
            $g3464$.rebind(var625, var622);
        }
        return var624;
    }
    
    public static SubLObject f29986(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        return module0077.f5320(var61, $g3465$.getDynamicValue(var62));
    }
    
    public static SubLObject f29987(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL == module0077.f5320(var61, $g3465$.getDynamicValue(var62)));
    }
    
    public static SubLObject f29712(final SubLObject var72, final SubLObject var455, SubLObject var621) {
        if (var621 == UNPROVIDED) {
            var621 = (SubLObject)NIL;
        }
        final SubLThread var622 = SubLProcess.currentSubLThread();
        final SubLObject var623 = (SubLObject)$ic409$;
        SubLObject var624 = (SubLObject)NIL;
        final SubLObject var625 = $g3465$.currentBinding(var622);
        try {
            $g3465$.bind(module0078.f5367(var455, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED), var622);
            var624 = f29809(var72, var623, (SubLObject)((NIL != var621) ? $ic410$ : $ic411$), (SubLObject)$ic106$);
        }
        finally {
            $g3465$.rebind(var625, var622);
        }
        return var624;
    }
    
    public static SubLObject f29988(final SubLObject var7, final SubLObject var566, SubLObject var621) {
        if (var621 == UNPROVIDED) {
            var621 = (SubLObject)NIL;
        }
        final SubLObject var622 = f29688(var7);
        final SubLObject var623 = f29989(var566, var622, module0632.f38705());
        return f29693(var7, var623, var621);
    }
    
    public static SubLObject f29990(final SubLObject var72, final SubLObject var566, SubLObject var621) {
        if (var621 == UNPROVIDED) {
            var621 = (SubLObject)NIL;
        }
        final SubLObject var622 = f29709(var72);
        final SubLObject var623 = f29989(var566, var622, module0632.f38705());
        return f29712(var72, var623, var621);
    }
    
    public static SubLObject f29991() {
        final SubLObject var624 = $g3466$.getGlobalValue();
        if (NIL != var624) {
            module0034.f1818(var624);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29992(final SubLObject var625, final SubLObject var272, final SubLObject var139) {
        return module0034.f1829($g3466$.getGlobalValue(), (SubLObject)ConsesLow.list(var625, var272, var139), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29993(final SubLObject var625, final SubLObject var272, final SubLObject var139) {
        return module0259.f16841(var625, var272, var139, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29989(final SubLObject var625, final SubLObject var272, final SubLObject var139) {
        SubLObject var626 = $g3466$.getGlobalValue();
        if (NIL == var626) {
            var626 = module0034.f1934((SubLObject)$ic412$, (SubLObject)$ic413$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)THREE_INTEGER, (SubLObject)ZERO_INTEGER);
            module0034.f1940((SubLObject)$ic414$);
        }
        final SubLObject var627 = module0034.f1781(var625, var272, var139);
        final SubLObject var628 = module0034.f1814(var626, var627, (SubLObject)UNPROVIDED);
        if (var628 != $ic169$) {
            SubLObject var629 = var628;
            SubLObject var630 = (SubLObject)NIL;
            var630 = var629.first();
            while (NIL != var629) {
                SubLObject var631 = var630.first();
                final SubLObject var632 = conses_high.second(var630);
                if (var625.equal(var631.first())) {
                    var631 = var631.rest();
                    if (var272.equal(var631.first())) {
                        var631 = var631.rest();
                        if (NIL != var631 && NIL == var631.rest() && var139.equal(var631.first())) {
                            return module0034.f1959(var632);
                        }
                    }
                }
                var629 = var629.rest();
                var630 = var629.first();
            }
        }
        final SubLObject var633 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f29993(var625, var272, var139)));
        module0034.f1836(var626, var627, var628, var633, (SubLObject)ConsesLow.list(var625, var272, var139));
        return module0034.f1959(var633);
    }
    
    public static SubLObject f29994(final SubLObject var66) {
        if (NIL != module0035.f1997(var66)) {
            return f29690(var66.first());
        }
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var66, var66, (SubLObject)$ic415$);
        var67 = var66.first();
        final SubLObject var69 = var68 = var66.rest();
        final SubLObject var70 = module0078.f5367(f29690(var67), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var71 = var68;
        SubLObject var72 = (SubLObject)NIL;
        var72 = var71.first();
        while (NIL != var71) {
            final SubLObject var73 = module0078.f5367(f29690(var72), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            SubLObject var74 = (SubLObject)NIL;
            final SubLObject var75 = module0077.f5333(var70);
            SubLObject var76;
            SubLObject var77;
            SubLObject var78;
            for (var76 = module0032.f1741(var75), var77 = (SubLObject)NIL, var77 = module0032.f1742(var76, var75); NIL == module0032.f1744(var76, var77); var77 = module0032.f1743(var77)) {
                var78 = module0032.f1745(var76, var77);
                if (NIL != module0032.f1746(var77, var78) && NIL == module0077.f5320(var78, var73)) {
                    var74 = (SubLObject)ConsesLow.cons(var78, var74);
                }
            }
            SubLObject var12_644 = var74;
            SubLObject var79 = (SubLObject)NIL;
            var79 = var12_644.first();
            while (NIL != var12_644) {
                module0077.f5327(var79, var70);
                var12_644 = var12_644.rest();
                var79 = var12_644.first();
            }
            var71 = var71.rest();
            var72 = var71.first();
        }
        return module0077.f5312(var70);
    }
    
    public static SubLObject f29980(final SubLObject var116) {
        if (NIL != module0035.f1997(var116)) {
            return f29710(var116.first());
        }
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic416$);
        var117 = var116.first();
        final SubLObject var119 = var118 = var116.rest();
        final SubLObject var120 = module0078.f5367(f29710(var117), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
        SubLObject var121 = var118;
        SubLObject var122 = (SubLObject)NIL;
        var122 = var121.first();
        while (NIL != var121) {
            final SubLObject var123 = module0078.f5367(f29710(var122), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
            SubLObject var124 = (SubLObject)NIL;
            final SubLObject var125 = module0077.f5333(var120);
            SubLObject var126;
            SubLObject var127;
            SubLObject var128;
            for (var126 = module0032.f1741(var125), var127 = (SubLObject)NIL, var127 = module0032.f1742(var126, var125); NIL == module0032.f1744(var126, var127); var127 = module0032.f1743(var127)) {
                var128 = module0032.f1745(var126, var127);
                if (NIL != module0032.f1746(var127, var128) && NIL == module0077.f5320(var128, var123)) {
                    var124 = (SubLObject)ConsesLow.cons(var128, var124);
                }
            }
            SubLObject var12_649 = var124;
            SubLObject var129 = (SubLObject)NIL;
            var129 = var12_649.first();
            while (NIL != var12_649) {
                module0077.f5327(var129, var120);
                var12_649 = var12_649.rest();
                var129 = var12_649.first();
            }
            var121 = var121.rest();
            var122 = var121.first();
        }
        return module0077.f5312(var120);
    }
    
    public static SubLObject f29995(final SubLObject var116) {
        final SubLObject var117 = Mapping.mapcar((SubLObject)$ic417$, var116);
        return f29980(var117);
    }
    
    public static SubLObject f29996(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        final SubLObject var118 = Mapping.mapcar((SubLObject)$ic417$, var116);
        final SubLObject var119 = f29980(var118);
        SubLObject var120 = var118;
        SubLObject var121 = (SubLObject)NIL;
        var121 = var120.first();
        while (NIL != var120) {
            final SubLObject var122 = f29712(var121, var119, (SubLObject)UNPROVIDED);
            var117 = (SubLObject)ConsesLow.cons(var122, var117);
            var120 = var120.rest();
            var121 = var120.first();
        }
        return Sequences.nreverse(var117);
    }
    
    public static SubLObject f29997(final SubLObject var569, final SubLObject var570) {
        final SubLObject var571 = f29688(f29696(var569));
        final SubLObject var572 = f29688(f29955(var570));
        final SubLObject var573 = module0076.f5290(var571, var572, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var573;
    }
    
    public static SubLObject f29998(final SubLObject var569, final SubLObject var570) {
        return f29688(f29983(var569, var570));
    }
    
    public static SubLObject f29999(final SubLObject var569, final SubLObject var570, SubLObject var103, SubLObject var14) {
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)TEN_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)$ic20$;
        }
        SubLObject var571 = (SubLObject)NIL;
        SubLObject var572 = (SubLObject)NIL;
        SubLObject var575_657 = (SubLObject)NIL;
        SubLObject var573 = (SubLObject)NIL;
        SubLObject var578_659 = (SubLObject)NIL;
        var572 = f29678(var569);
        var575_657 = var572.first();
        var573 = f29678(var570);
        var578_659 = var573.first();
        while (NIL != var573 || NIL != var572) {
            if (!f29629(var575_657).equal(f29629(var578_659))) {
                return f30000(var569, var570, var103, var14);
            }
            final SubLObject var574 = f29640(var575_657, var14, (SubLObject)UNPROVIDED);
            final SubLObject var575 = f29640(var578_659, var14, (SubLObject)UNPROVIDED);
            if (NIL != module0048.f3293(var574) && NIL != module0048.f3293(var575)) {
                final SubLObject var576 = Numbers.subtract(var575, var574);
                var571 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var578_659, var575, var574, var576), var571);
            }
            var572 = var572.rest();
            var575_657 = var572.first();
            var573 = var573.rest();
            var578_659 = var573.first();
        }
        return module0035.f2124(var103, Sort.sort(var571, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic419$)));
    }
    
    public static SubLObject f30000(final SubLObject var569, final SubLObject var570, SubLObject var103, SubLObject var14) {
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)TEN_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)$ic20$;
        }
        SubLObject var571 = (SubLObject)NIL;
        SubLObject var572 = f29678(var569);
        SubLObject var573 = (SubLObject)NIL;
        var573 = var572.first();
        while (NIL != var572) {
            final SubLObject var574 = f29801(var570, f29629(var573));
            final SubLObject var575 = f29640(var573, var14, (SubLObject)UNPROVIDED);
            final SubLObject var576 = f29640(var574, var14, (SubLObject)UNPROVIDED);
            if (NIL != module0048.f3293(var575) && NIL != module0048.f3293(var576)) {
                final SubLObject var577 = Numbers.subtract(var576, var575);
                var571 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var574, var576, var575, var577), var571);
            }
            var572 = var572.rest();
            var573 = var572.first();
        }
        return module0035.f2124(var103, Sort.sort(var571, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic419$)));
    }
    
    public static SubLObject f30001(final SubLObject var7, SubLObject var103, SubLObject var14) {
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)TEN_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)$ic20$;
        }
        SubLObject var104 = (SubLObject)NIL;
        SubLObject var105 = f29678(var7);
        SubLObject var106 = (SubLObject)NIL;
        var106 = var105.first();
        while (NIL != var105) {
            final SubLObject var107 = f29640(var106, var14, (SubLObject)UNPROVIDED);
            if (var107.isNumber()) {
                var104 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var106, var107), var104);
            }
            var105 = var105.rest();
            var106 = var105.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic67$), module0035.f2124(var103, Sort.sort(var104, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic420$))));
    }
    
    public static SubLObject f30002(final SubLObject var72, SubLObject var103, SubLObject var14) {
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)TEN_INTEGER;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)$ic20$;
        }
        SubLObject var104 = (SubLObject)NIL;
        SubLObject var105 = f29708(var72);
        SubLObject var106 = (SubLObject)NIL;
        var106 = var105.first();
        while (NIL != var105) {
            final SubLObject var107 = f29670(var106);
            final SubLObject var108 = f29640(var107, var14, (SubLObject)UNPROVIDED);
            if (var108.isNumber()) {
                var104 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var106, var108), var104);
            }
            var105 = var105.rest();
            var106 = var105.first();
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic67$), module0035.f2124(var103, Sort.sort(var104, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic420$))));
    }
    
    public static SubLObject f30003(final SubLObject var569, final SubLObject var570) {
        SubLObject var571 = (SubLObject)NIL;
        SubLObject var572 = f29678(var569);
        SubLObject var573 = (SubLObject)NIL;
        var573 = var572.first();
        while (NIL != var572) {
            final SubLObject var574 = f29629(var573);
            final SubLObject var575 = f29801(var570, var574);
            final SubLObject var576 = f30004(var573, var575);
            if (NIL != var576) {
                var571 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)$ic16$, var574, var576), var571);
            }
            var572 = var572.rest();
            var573 = var572.first();
        }
        var571 = Sequences.nreverse(var571);
        return var571;
    }
    
    public static SubLObject f30005(final SubLObject var569, final SubLObject var570) {
        SubLObject var571 = (SubLObject)NIL;
        SubLObject var572 = (SubLObject)NIL;
        SubLObject var573 = (SubLObject)NIL;
        SubLObject var574 = (SubLObject)NIL;
        SubLObject var575 = (SubLObject)NIL;
        SubLObject var576 = f30003(var569, var570);
        SubLObject var577 = (SubLObject)NIL;
        var577 = var576.first();
        while (NIL != var576) {
            final SubLObject var579;
            final SubLObject var578 = var579 = var577;
            SubLObject var580 = (SubLObject)NIL;
            SubLObject var581 = var579;
            SubLObject var582 = (SubLObject)NIL;
            SubLObject var675_676 = (SubLObject)NIL;
            while (NIL != var581) {
                cdestructuring_bind.destructuring_bind_must_consp(var581, var578, (SubLObject)$ic421$);
                var675_676 = var581.first();
                var581 = var581.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var581, var578, (SubLObject)$ic421$);
                if (NIL == conses_high.member(var675_676, (SubLObject)$ic422$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var582 = (SubLObject)T;
                }
                if (var675_676 == $ic81$) {
                    var580 = var581.first();
                }
                var581 = var581.rest();
            }
            if (NIL != var582 && NIL == var580) {
                cdestructuring_bind.cdestructuring_bind_error(var578, (SubLObject)$ic421$);
            }
            final SubLObject var583 = cdestructuring_bind.property_list_member((SubLObject)$ic16$, var579);
            final SubLObject var584 = (SubLObject)((NIL != var583) ? conses_high.cadr(var583) : NIL);
            final SubLObject var585 = cdestructuring_bind.property_list_member((SubLObject)$ic423$, var579);
            final SubLObject var586 = (SubLObject)((NIL != var585) ? conses_high.cadr(var585) : NIL);
            final SubLObject var587 = cdestructuring_bind.property_list_member((SubLObject)$ic424$, var579);
            final SubLObject var588 = (SubLObject)((NIL != var587) ? conses_high.cadr(var587) : NIL);
            final SubLObject var589 = Sequences.length(var588);
            final SubLObject var590 = Sequences.length(var586);
            if (var589.numE(var590)) {
                var573 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var584, var589), var573);
            }
            else if (var590.isZero()) {
                var575 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var584, var589), var575);
            }
            else if (var589.isZero()) {
                var571 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var584, var590), var571);
            }
            else if (var589.numG(var590)) {
                var574 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var584, Numbers.subtract(var589, var590)), var574);
            }
            else if (var589.numL(var590)) {
                var572 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var584, Numbers.subtract(var590, var589)), var572);
            }
            var576 = var576.rest();
            var577 = var576.first();
        }
        return ConsesLow.nconc(new SubLObject[] { (NIL != var571) ? ConsesLow.list((SubLObject)$ic425$, Sort.sort(var571, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic420$))) : NIL, (NIL != var572) ? ConsesLow.list((SubLObject)$ic426$, Sort.sort(var572, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic420$))) : NIL, (NIL != var573) ? ConsesLow.list((SubLObject)$ic427$, Sort.sort(var573, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic420$))) : NIL, (NIL != var574) ? ConsesLow.list((SubLObject)$ic428$, Sort.sort(var574, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic420$))) : NIL, (NIL != var575) ? ConsesLow.list((SubLObject)$ic429$, Sort.sort(var575, Symbols.symbol_function((SubLObject)$ic418$), Symbols.symbol_function((SubLObject)$ic420$))) : NIL });
    }
    
    public static SubLObject f30006(final SubLObject var7, final SubLObject var14) {
        return Sort.sort(conses_high.copy_list(f29678(var7)), (SubLObject)$ic86$, f29700(var14));
    }
    
    public static SubLObject f29801(final SubLObject var7, final SubLObject var17) {
        SubLObject var19;
        final SubLObject var18 = var19 = f29678(var7);
        SubLObject var20 = (SubLObject)NIL;
        var20 = var19.first();
        while (NIL != var19) {
            if (NIL != f30007(var17, f29629(var20))) {
                return var20;
            }
            var19 = var19.rest();
            var20 = var19.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30008(final SubLObject var64, final SubLObject var17) {
        SubLObject var65 = var64;
        SubLObject var66 = (SubLObject)NIL;
        var66 = var65.first();
        while (NIL != var65) {
            if (NIL != f30007(var17, f29629(var66))) {
                return var66;
            }
            var65 = var65.rest();
            var66 = var65.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30009(final SubLObject var66, final SubLObject var17) {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = var66;
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            final SubLObject var70 = f29801(var69, var17);
            var67 = (SubLObject)ConsesLow.cons(var70, var67);
            var68 = var68.rest();
            var69 = var68.first();
        }
        return Sequences.nreverse(var67);
    }
    
    public static SubLObject f30007(final SubLObject var684, final SubLObject var685) {
        return Equality.equalp(var684, var685);
    }
    
    public static SubLObject f30004(final SubLObject var575, final SubLObject var578) {
        final SubLThread var579 = SubLProcess.currentSubLThread();
        final SubLObject var580 = f29629(var575);
        final SubLObject var581 = f29629(var578);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var579) && NIL == f30007(var580, var581)) {
            Errors.error((SubLObject)$ic430$, var580, var581);
        }
        final SubLObject var582 = f29630(var575);
        final SubLObject var583 = f29630(var578);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var579) && $ic17$ == var582) {
            Errors.error((SubLObject)$ic431$, var580);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var579) && $ic17$ == var583) {
            Errors.error((SubLObject)$ic431$, var581);
        }
        var579.resetMultipleValues();
        final SubLObject var584 = module0233.f15366(var582, var583);
        final SubLObject var585 = var579.secondMultipleValue();
        var579.resetMultipleValues();
        if (NIL == var585 && NIL == var584) {
            return (SubLObject)NIL;
        }
        if (NIL == var585) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic424$, var584);
        }
        if (NIL == var584) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic423$, var585);
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic423$, var585, (SubLObject)$ic424$, var584);
    }
    
    public static SubLObject f30010(final SubLObject var569, final SubLObject var570, final SubLObject var13, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)$ic86$;
        }
        final SubLThread var571 = SubLProcess.currentSubLThread();
        SubLObject var572 = (SubLObject)NIL;
        SubLObject var573 = (SubLObject)ZERO_INTEGER;
        SubLObject var574 = (SubLObject)ZERO_INTEGER;
        final SubLObject var575 = f29687(var569, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        final SubLObject var576 = f29687(var569, (SubLObject)$ic16$, (SubLObject)UNPROVIDED);
        final SubLObject var577 = f29687(var569, var13, (SubLObject)UNPROVIDED);
        final SubLObject var578 = f29687(var570, var13, (SubLObject)UNPROVIDED);
        SubLObject var579 = (SubLObject)ZERO_INTEGER;
        SubLObject var580 = (SubLObject)NIL;
        SubLObject var684_695 = (SubLObject)NIL;
        SubLObject var581 = (SubLObject)NIL;
        SubLObject var685_697 = (SubLObject)NIL;
        SubLObject var582 = (SubLObject)NIL;
        SubLObject var576_699 = (SubLObject)NIL;
        SubLObject var583 = (SubLObject)NIL;
        SubLObject var579_701 = (SubLObject)NIL;
        var580 = var575;
        var684_695 = var580.first();
        var581 = var576;
        var685_697 = var581.first();
        var582 = var577;
        var576_699 = var582.first();
        var583 = var578;
        var579_701 = var583.first();
        while (NIL != var583 || NIL != var582 || NIL != var581 || NIL != var580) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var571) && !var684_695.eql(var685_697)) {
                Errors.error((SubLObject)$ic432$);
            }
            if (NIL != Functions.funcall(var61, var576_699, var579_701)) {
                var572 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var684_695, var576_699, var579_701, (SubLObject)ONE_INTEGER), var572);
                var573 = Numbers.add(var573, (SubLObject)ONE_INTEGER);
            }
            else {
                var572 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var684_695, var576_699, var579_701, (SubLObject)TWO_INTEGER), var572);
                var574 = Numbers.add(var574, (SubLObject)ONE_INTEGER);
            }
            var579 = Numbers.add(var579, (SubLObject)ONE_INTEGER);
            var580 = var580.rest();
            var684_695 = var580.first();
            var581 = var581.rest();
            var685_697 = var581.first();
            var582 = var582.rest();
            var576_699 = var582.first();
            var583 = var583.rest();
            var579_701 = var583.first();
        }
        return Values.values(Sequences.nreverse(var572), var573, var574);
    }
    
    public static SubLObject f30011(final SubLObject var569, final SubLObject var570, SubLObject var273, SubLObject var702, SubLObject var703) {
        if (var273 == UNPROVIDED) {
            var273 = (SubLObject)$ic97$;
        }
        if (var702 == UNPROVIDED) {
            var702 = Symbols.symbol_function((SubLObject)$ic86$);
        }
        if (var703 == UNPROVIDED) {
            var703 = (SubLObject)NIL;
        }
        final SubLObject var704 = f29997(var569, var570);
        return f30012(var569, var570, var704, var273, var702, var703);
    }
    
    public static SubLObject f30013(final SubLObject var569, final SubLObject var570, SubLObject var273, SubLObject var702, SubLObject var703) {
        if (var273 == UNPROVIDED) {
            var273 = (SubLObject)$ic103$;
        }
        if (var702 == UNPROVIDED) {
            var702 = Symbols.symbol_function((SubLObject)$ic86$);
        }
        if (var703 == UNPROVIDED) {
            var703 = (SubLObject)NIL;
        }
        final SubLObject var704 = f29998(var569, var570);
        return f30012(var569, var570, var704, var273, var702, var703);
    }
    
    public static SubLObject f30012(final SubLObject var569, final SubLObject var570, final SubLObject var378, final SubLObject var273, final SubLObject var702, final SubLObject var703) {
        final SubLObject var704 = f29678(f29693(var569, var378, (SubLObject)UNPROVIDED));
        SubLObject var706;
        final SubLObject var705 = var706 = Sort.sort(var704, var702, var273);
        SubLObject var707 = (SubLObject)NIL;
        var707 = var706.first();
        while (NIL != var706) {
            final SubLObject var708 = f29629(var707);
            final SubLObject var709 = Functions.funcall(var273, var707);
            final SubLObject var710 = f29801(var570, var708);
            final SubLObject var711 = Functions.funcall(var273, var710);
            if (NIL != var703) {
                final SubLObject var712 = Functions.funcall(var703, var707);
                final SubLObject var713 = Functions.funcall(var703, var710);
                PrintLow.format((SubLObject)T, (SubLObject)$ic433$, new SubLObject[] { var709, var712, var711, var713, var708 });
            }
            else {
                PrintLow.format((SubLObject)T, (SubLObject)$ic434$, new SubLObject[] { var709, var711, var708 });
            }
            var706 = var706.rest();
            var707 = var706.first();
        }
        return var705;
    }
    
    public static SubLObject f30014(final SubLObject var569, final SubLObject var570) {
        final SubLObject var571 = f30015(var569);
        final SubLObject var572 = f30015(var570);
        final SubLObject var573 = Sequences.length(f29967((SubLObject)ConsesLow.list(var569, var570)));
        final SubLObject var574 = Numbers.subtract(var571, var573);
        final SubLObject var575 = Numbers.subtract(var572, var573);
        return Values.values(var574, var573, var575);
    }
    
    public static SubLObject f30016(final SubLObject var607, final SubLObject var608) {
        if (NIL != module0426.f30173(var607) && NIL != module0426.f30173(var608)) {
            return module0426.f30190(var607, var608);
        }
        SubLObject var609 = (SubLObject)NIL;
        SubLObject var610 = f29708(var607);
        SubLObject var611 = (SubLObject)NIL;
        var611 = var610.first();
        while (NIL != var610) {
            final SubLObject var612 = f29669(var611);
            final SubLObject var613 = f29821(var608, var612);
            if (NIL != var613) {
                final SubLObject var614 = f30017(var611, var613);
                if (NIL != var614) {
                    var609 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic68$, var612, (SubLObject)$ic435$, var614), var609);
                }
            }
            var610 = var610.rest();
            var611 = var610.first();
        }
        var609 = Sequences.nreverse(var609);
        return var609;
    }
    
    public static SubLObject f30018(final SubLObject var607, final SubLObject var608) {
        SubLObject var609 = (SubLObject)ZERO_INTEGER;
        SubLObject var610 = (SubLObject)ZERO_INTEGER;
        SubLObject var611 = f30016(var607, var608);
        SubLObject var612 = (SubLObject)NIL;
        var612 = var611.first();
        while (NIL != var611) {
            final SubLObject var614;
            final SubLObject var613 = var614 = var612;
            final SubLObject var615 = cdestructuring_bind.property_list_member((SubLObject)$ic435$, var614);
            final SubLObject var617;
            final SubLObject var616 = var617 = (SubLObject)((NIL != var615) ? conses_high.cadr(var615) : NIL);
            if (var617.eql((SubLObject)$ic436$)) {
                var609 = Numbers.add(var609, (SubLObject)ONE_INTEGER);
            }
            else if (var617.eql((SubLObject)$ic437$)) {
                var610 = Numbers.add(var610, (SubLObject)ONE_INTEGER);
            }
            else {
                Errors.error((SubLObject)$ic438$, var616);
            }
            var611 = var611.rest();
            var612 = var611.first();
        }
        return ConsesLow.nconc((SubLObject)((NIL != var609) ? ConsesLow.list((SubLObject)$ic436$, var609) : NIL), (SubLObject)((NIL != var610) ? ConsesLow.list((SubLObject)$ic437$, var610) : NIL));
    }
    
    public static SubLObject f29821(final SubLObject var72, final SubLObject var61) {
        SubLObject var74;
        final SubLObject var73 = var74 = f29708(var72);
        SubLObject var75 = (SubLObject)NIL;
        var75 = var74.first();
        while (NIL != var74) {
            if (NIL != f30019(var61, f29669(var75))) {
                return var75;
            }
            var74 = var74.rest();
            var75 = var74.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30019(final SubLObject var720, final SubLObject var721) {
        return Equality.equalp(var720, var721);
    }
    
    public static SubLObject f30017(final SubLObject var712, final SubLObject var713) {
        final SubLThread var714 = SubLProcess.currentSubLThread();
        final SubLObject var715 = f29669(var712);
        final SubLObject var716 = f29669(var713);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var714) && NIL == f30019(var715, var716)) {
            Errors.error((SubLObject)$ic439$, var715, var716);
        }
        final SubLObject var717 = f29671(var712);
        final SubLObject var718 = f29671(var713);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var714) && NIL == var717) {
            Errors.error((SubLObject)$ic440$, var715);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var714) && NIL == var718) {
            Errors.error((SubLObject)$ic440$, var716);
        }
        if (var717.eql(var718)) {
            return (SubLObject)NIL;
        }
        if ($ic0$ == var717) {
            return (SubLObject)$ic437$;
        }
        return (SubLObject)$ic436$;
    }
    
    public static SubLObject f30020(final SubLObject var569, final SubLObject var570, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = module0360.f23813();
        }
        final SubLObject var571 = f29701(var569, var122);
        final SubLObject var572 = f29701(var570, var122);
        return f30021(var571, var572);
    }
    
    public static SubLObject f30022(final SubLObject var607, final SubLObject var608, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = module0360.f23813();
        }
        final SubLObject var609 = f29808(var607, var122);
        final SubLObject var610 = f29808(var608, var122);
        return f30021(var609, var610);
    }
    
    public static SubLObject f30021(final SubLObject var724, final SubLObject var725) {
        SubLObject var726 = (SubLObject)NIL;
        SubLObject var727;
        SubLObject var728;
        SubLObject var729;
        SubLObject var730;
        SubLObject var731;
        SubLObject var732;
        SubLObject var733;
        for (var727 = (SubLObject)NIL, var727 = var725; NIL != var727; var727 = conses_high.cddr(var727)) {
            var728 = var727.first();
            var729 = conses_high.cadr(var727);
            var730 = conses_high.getf(var724, var728, (SubLObject)$ic441$);
            if ($ic441$ != var730) {
                var731 = module0035.f2410(var729, var730);
                var732 = (SubLObject)((NIL == var730 || var730.isZero() || NIL == var729) ? $ic441$ : module0048.f3302(Numbers.multiply((SubLObject)$ic61$, Numbers.divide(var731, var730)), (SubLObject)FOUR_INTEGER));
                var733 = (SubLObject)ConsesLow.list((SubLObject)((NIL != var730) ? f30023(var730, (SubLObject)FOUR_INTEGER) : NIL), (SubLObject)((NIL != var729) ? f30023(var729, (SubLObject)FOUR_INTEGER) : NIL), (SubLObject)((NIL != var731) ? f30023(var731, (SubLObject)FOUR_INTEGER) : NIL), var732);
                if (NIL == module0035.f2169((SubLObject)$ic441$, var733)) {
                    var726 = conses_high.putf(var726, var728, var733);
                }
            }
        }
        return var726;
    }
    
    public static SubLObject f30023(final SubLObject var730, final SubLObject var731) {
        if (var730.isInteger()) {
            return var730;
        }
        return module0048.f3302(var730, var731);
    }
    
    public static SubLObject f30024(final SubLObject var106) {
        if (NIL != var106) {
            SubLObject var107 = (SubLObject)NIL;
            SubLObject var108;
            SubLObject var109;
            SubLObject var110;
            SubLObject var111;
            SubLObject var112;
            SubLObject var113;
            SubLObject var114;
            SubLObject var115;
            for (var108 = (SubLObject)NIL, var108 = var106; NIL != var108; var108 = conses_high.cddr(var108)) {
                var109 = var108.first();
                var110 = conses_high.cadr(var108);
                var111 = var110.first();
                var112 = conses_high.second(var110);
                var113 = conses_high.getf($g3467$.getGlobalValue(), var109, (SubLObject)UNPROVIDED);
                if (NIL != module0004.f104(var113, (SubLObject)$ic443$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var114 = (SubLObject)(($ic444$ == var113) ? NIL : (($ic445$ == var113) ? ((NIL == var111 || var111.isZero()) ? $ic441$ : module0048.f3302(Numbers.divide(var112, var111), (SubLObject)FOUR_INTEGER)) : ((NIL == var112 || var112.isZero()) ? $ic441$ : module0048.f3302(Numbers.divide(var111, var112), (SubLObject)FOUR_INTEGER))));
                    var115 = (SubLObject)(($ic444$ == var113) ? ConsesLow.list(var111, var112) : ConsesLow.list(var111, var112, var114));
                    var107 = conses_high.putf(var107, var109, var115);
                }
            }
            module0035.f2365(var107, (SubLObject)UNPROVIDED);
            return var107;
        }
        PrintLow.format((SubLObject)T, (SubLObject)$ic446$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29701(final SubLObject var7, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = module0360.f23813();
        }
        final SubLObject var123 = f29678(var7);
        return f29702(var123, var122);
    }
    
    public static SubLObject f29808(final SubLObject var72, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = module0360.f23813();
        }
        final SubLObject var123 = f29708(var72);
        return f30025(var123, var122);
    }
    
    public static SubLObject f29702(final SubLObject var64, final SubLObject var122) {
        SubLObject var123 = (SubLObject)NIL;
        final SubLObject var124 = Sequences.length(var64);
        final SubLObject var125 = (SubLObject)ConsesLow.list((SubLObject)$ic447$, var124);
        var123 = module0035.f2341(var123, var125);
        SubLObject var126 = var122;
        SubLObject var127 = (SubLObject)NIL;
        var127 = var126.first();
        while (NIL != var126) {
            final SubLObject var128 = var127;
            if (var128.eql((SubLObject)$ic18$)) {
                SubLObject var129 = (SubLObject)NIL;
                SubLObject var12_742 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_742.first();
                while (NIL != var12_742) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic18$, (SubLObject)ZERO_INTEGER);
                    if (NIL != var131) {
                        var129 = (SubLObject)ConsesLow.cons(var131, var129);
                    }
                    var12_742 = var12_742.rest();
                    var130 = var12_742.first();
                }
                final SubLObject var132 = Sequences.length(var129);
                final SubLObject var133 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic394$), var129, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var134 = Numbers.subtract(var132, var133);
                final SubLObject var135 = f29793(var64);
                final SubLObject var136 = f30026(var64);
                final SubLObject var137 = module0048.f3385(var129);
                final SubLObject var138 = (SubLObject)((NIL != var129) ? module0048.f3384(var129) : NIL);
                final SubLObject var139 = (SubLObject)((NIL != var129) ? module0048.f3387(var129, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var140 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic448$, var133, $ic449$, var134, $ic450$, var135, $ic451$, var136, $ic452$, var137, $ic453$, var138, $ic454$, var139 });
                var123 = module0035.f2341(var123, var140);
            }
            else if (var128.eql((SubLObject)$ic19$)) {
                SubLObject var141 = (SubLObject)NIL;
                SubLObject var12_743 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_743.first();
                while (NIL != var12_743) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic19$, (SubLObject)ZERO_INTEGER);
                    if (NIL != var131) {
                        var141 = (SubLObject)ConsesLow.cons(var131, var141);
                    }
                    var12_743 = var12_743.rest();
                    var130 = var12_743.first();
                }
                final SubLObject var142 = module0048.f3385(var141);
                final SubLObject var143 = (SubLObject)((NIL != var141) ? module0048.f3384(var141) : NIL);
                final SubLObject var144 = (SubLObject)((NIL != var141) ? module0048.f3387(var141, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var145 = (SubLObject)((NIL != var141) ? module0048.f3401(var141) : NIL);
                final SubLObject var146 = (SubLObject)ConsesLow.list((SubLObject)$ic455$, var142, (SubLObject)$ic93$, var143, (SubLObject)$ic89$, var144, (SubLObject)$ic456$, var145);
                var123 = module0035.f2341(var123, var146);
            }
            else if (var128.eql((SubLObject)$ic20$)) {
                SubLObject var141 = (SubLObject)NIL;
                SubLObject var12_744 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_744.first();
                while (NIL != var12_744) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic20$, (SubLObject)ZERO_INTEGER);
                    if (NIL != var131) {
                        var141 = (SubLObject)ConsesLow.cons(var131, var141);
                    }
                    var12_744 = var12_744.rest();
                    var130 = var12_744.first();
                }
                final SubLObject var142 = module0048.f3385(var141);
                final SubLObject var143 = (SubLObject)((NIL != var141) ? module0048.f3384(var141) : NIL);
                final SubLObject var144 = (SubLObject)((NIL != var141) ? module0048.f3387(var141, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var145 = (SubLObject)((NIL != var141) ? module0048.f3401(var141) : NIL);
                final SubLObject var146 = (SubLObject)ConsesLow.list((SubLObject)$ic457$, var142, (SubLObject)$ic458$, var143, (SubLObject)$ic459$, var144, (SubLObject)$ic460$, var145);
                var123 = module0035.f2341(var123, var146);
            }
            else if (var128.eql((SubLObject)$ic21$)) {
                SubLObject var147 = (SubLObject)NIL;
                SubLObject var12_745 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_745.first();
                while (NIL != var12_745) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic21$, (SubLObject)UNPROVIDED);
                    if (NIL != var131) {
                        var147 = (SubLObject)ConsesLow.cons(var131, var147);
                    }
                    var12_745 = var12_745.rest();
                    var130 = var12_745.first();
                }
                final SubLObject var148 = module0048.f3385(var147);
                final SubLObject var149 = (SubLObject)((NIL != var147) ? module0048.f3384(var147) : NIL);
                final SubLObject var150 = (SubLObject)((NIL != var147) ? module0048.f3387(var147, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var151 = (SubLObject)((NIL != var147) ? module0048.f3401(var147) : NIL);
                final SubLObject var146 = (SubLObject)ConsesLow.list((SubLObject)$ic461$, var148, (SubLObject)$ic94$, var149, (SubLObject)$ic90$, var150, (SubLObject)$ic462$, var151);
                var123 = module0035.f2341(var123, var146);
            }
            else if (var128.eql((SubLObject)$ic23$)) {
                SubLObject var147 = (SubLObject)NIL;
                SubLObject var12_746 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_746.first();
                while (NIL != var12_746) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic23$, (SubLObject)UNPROVIDED);
                    if (NIL != var131) {
                        var147 = (SubLObject)ConsesLow.cons(var131, var147);
                    }
                    var12_746 = var12_746.rest();
                    var130 = var12_746.first();
                }
                final SubLObject var148 = module0048.f3385(var147);
                final SubLObject var149 = (SubLObject)((NIL != var147) ? module0048.f3384(var147) : NIL);
                final SubLObject var150 = (SubLObject)((NIL != var147) ? module0048.f3387(var147, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var151 = (SubLObject)((NIL != var147) ? module0048.f3401(var147) : NIL);
                final SubLObject var146 = (SubLObject)ConsesLow.list((SubLObject)$ic463$, var148, (SubLObject)$ic464$, var149, (SubLObject)$ic465$, var150, (SubLObject)$ic466$, var151);
                var123 = module0035.f2341(var123, var146);
            }
            else if (var128.eql((SubLObject)$ic35$)) {
                SubLObject var152 = (SubLObject)NIL;
                SubLObject var12_747 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_747.first();
                while (NIL != var12_747) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
                    if (NIL != var131) {
                        var152 = (SubLObject)ConsesLow.cons(var131, var152);
                    }
                    var12_747 = var12_747.rest();
                    var130 = var12_747.first();
                }
                final SubLObject var153 = module0048.f3385(var152);
                final SubLObject var154 = (SubLObject)((NIL != var152) ? module0048.f3384(var152) : NIL);
                final SubLObject var155 = (SubLObject)((NIL != var152) ? module0048.f3387(var152, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var156 = (SubLObject)((NIL != var152) ? module0048.f3401(var152) : NIL);
                final SubLObject var146 = (SubLObject)ConsesLow.list((SubLObject)$ic467$, var153, (SubLObject)$ic468$, var154, (SubLObject)$ic469$, var155, (SubLObject)$ic470$, var156);
                var123 = module0035.f2341(var123, var146);
            }
            else if (var128.eql((SubLObject)$ic22$)) {
                SubLObject var157 = (SubLObject)NIL;
                SubLObject var12_748 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_748.first();
                while (NIL != var12_748) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic22$, (SubLObject)UNPROVIDED);
                    if (NIL != var131) {
                        var157 = (SubLObject)ConsesLow.cons(var131, var157);
                    }
                    var12_748 = var12_748.rest();
                    var130 = var12_748.first();
                }
                final SubLObject var158 = module0048.f3385(var157);
                final SubLObject var159 = (SubLObject)((NIL != var157) ? module0048.f3384(var157) : NIL);
                final SubLObject var160 = (SubLObject)((NIL != var157) ? module0048.f3387(var157, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var161 = (SubLObject)((NIL != var157) ? module0048.f3401(var157) : NIL);
                final SubLObject var146 = (SubLObject)ConsesLow.list((SubLObject)$ic471$, var158, (SubLObject)$ic95$, var159, (SubLObject)$ic91$, var160, (SubLObject)$ic472$, var161);
                var123 = module0035.f2341(var123, var146);
            }
            else if (var128.eql((SubLObject)$ic34$)) {
                SubLObject var162 = (SubLObject)NIL;
                SubLObject var12_749 = var64;
                SubLObject var130 = (SubLObject)NIL;
                var130 = var12_749.first();
                while (NIL != var12_749) {
                    final SubLObject var131 = f29640(var130, (SubLObject)$ic34$, (SubLObject)UNPROVIDED);
                    if (NIL != var131) {
                        var162 = (SubLObject)ConsesLow.cons(var131, var162);
                    }
                    var12_749 = var12_749.rest();
                    var130 = var12_749.first();
                }
                final SubLObject var163 = (SubLObject)((NIL != var162) ? module0048.f3387(var162, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
                final SubLObject var164 = (SubLObject)ConsesLow.list((SubLObject)$ic473$, var163);
                var123 = module0035.f2341(var123, var164);
            }
            else {
                Errors.warn((SubLObject)$ic474$, var127);
            }
            var126 = var126.rest();
            var127 = var126.first();
        }
        if (NIL != module0004.f104((SubLObject)$ic19$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0004.f104((SubLObject)$ic18$, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var165 = (SubLObject)NIL;
            SubLObject var166 = var64;
            SubLObject var167 = (SubLObject)NIL;
            var167 = var166.first();
            while (NIL != var166) {
                final SubLObject var168 = conses_high.getf(var167, (SubLObject)$ic19$, (SubLObject)ZERO_INTEGER);
                final SubLObject var169 = conses_high.getf(var167, (SubLObject)$ic18$, (SubLObject)ZERO_INTEGER);
                if (NIL != module0004.f105(var169)) {
                    final SubLObject var131;
                    final SubLObject var170 = var131 = Numbers.divide(var168, var169);
                    if (NIL != var131) {
                        var165 = (SubLObject)ConsesLow.cons(var131, var165);
                    }
                }
                var166 = var166.rest();
                var167 = var166.first();
            }
            final SubLObject var171 = (SubLObject)((NIL != var165) ? module0048.f3387(var165, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var172 = (SubLObject)ConsesLow.list((SubLObject)$ic475$, var171);
            var123 = module0035.f2341(var123, var172);
        }
        return var123;
    }
    
    public static SubLObject f30015(final SubLObject var7) {
        final SubLObject var8 = f29678(var7);
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = var8;
        SubLObject var11 = (SubLObject)NIL;
        var11 = var10.first();
        while (NIL != var10) {
            final SubLObject var12 = conses_high.getf(var11, (SubLObject)$ic18$, (SubLObject)ZERO_INTEGER);
            if (NIL != var12) {
                var9 = (SubLObject)ConsesLow.cons(var12, var9);
            }
            var10 = var10.rest();
            var11 = var10.first();
        }
        final SubLObject var13 = Sequences.count_if(Symbols.symbol_function((SubLObject)$ic394$), var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var13;
    }
    
    public static SubLObject f30027(final SubLObject var330) {
        final SubLThread var331 = SubLProcess.currentSubLThread();
        SubLObject var332 = (SubLObject)NIL;
        assert NIL != Types.stringp(var330) : var330;
        SubLObject var333 = (SubLObject)NIL;
        try {
            final SubLObject var334 = stream_macros.$stream_requires_locking$.currentBinding(var331);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var331);
                var333 = compatibility.open_binary(var330, (SubLObject)$ic387$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var334, var331);
            }
            if (!var333.isStream()) {
                Errors.error((SubLObject)$ic213$, var330);
            }
            final SubLObject var785_786 = var333;
            final SubLObject var335 = module0021.$g777$.currentBinding(var331);
            try {
                module0021.$g777$.bind((SubLObject)NIL, var331);
                module0021.f1151(f29624());
                final SubLObject var141_787 = module0021.$g789$.currentBinding(var331);
                try {
                    module0021.$g789$.bind(module0021.f1184(), var331);
                    final SubLObject var336 = f29943(var785_786);
                    SubLObject var337 = f29678(var336);
                    SubLObject var338 = (SubLObject)NIL;
                    var338 = var337.first();
                    while (NIL != var337) {
                        var332 = f29629(var338);
                        var337 = var337.rest();
                        var338 = var337.first();
                    }
                    for (SubLObject var339 = (SubLObject)NIL; NIL == var339; var339 = (SubLObject)NIL) {
                        var338 = f29944(var785_786);
                        if (var338 == $ic388$) {
                            var339 = (SubLObject)T;
                        }
                        if (NIL == var339) {
                            var338 = f29949(var338);
                            var332 = f29629(var338);
                        }
                    }
                }
                finally {
                    module0021.$g789$.rebind(var141_787, var331);
                }
            }
            finally {
                module0021.$g777$.rebind(var335, var331);
            }
        }
        finally {
            final SubLObject var340 = Threads.$is_thread_performing_cleanupP$.currentBinding(var331);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var331);
                if (var333.isStream()) {
                    streams_high.close(var333, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var340, var331);
            }
        }
        return var332;
    }
    
    public static SubLObject f30028(final SubLObject var330, final SubLObject var790) {
        final SubLObject var791 = f30027(var330);
        return f30029(var791, var790);
    }
    
    public static SubLObject f30030(final SubLObject var7, final SubLObject var790) {
        final SubLObject var791 = module0035.f2114(f29688(var7));
        return f30029(var791, var790);
    }
    
    public static SubLObject f30029(final SubLObject var791, final SubLObject var790) {
        final SubLObject var792 = Sequences.position(var791, var790, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var793 = module0048.f_1X(var792);
        final SubLObject var794 = ConsesLow.nth(var793, var790);
        return Values.values(var794, var793);
    }
    
    public static SubLObject f30025(final SubLObject var92, final SubLObject var122) {
        final SubLObject var123 = Sequences.length(var92);
        final SubLObject var124 = Sequences.count((SubLObject)$ic0$, var92, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic356$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var125 = Sequences.count((SubLObject)$ic1$, var92, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic356$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var126 = (SubLObject)ConsesLow.list((SubLObject)$ic447$, var123, (SubLObject)$ic476$, var124, (SubLObject)$ic477$, var125);
        if (var123.isPositive()) {
            final SubLObject var127 = module0048.f3314(var124, var123, (SubLObject)UNPROVIDED);
            final SubLObject var128 = module0048.f3314(var125, var123, (SubLObject)UNPROVIDED);
            var126 = ConsesLow.append(var126, (SubLObject)ConsesLow.list((SubLObject)$ic478$, var127, (SubLObject)$ic479$, var128));
        }
        final SubLObject var129 = Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic480$), var92);
        final SubLObject var130 = conses_high.remf(f29702(var129, var122), (SubLObject)$ic447$);
        return module0035.f2341(var126, var130);
    }
    
    public static SubLObject f30031(final SubLObject var72, final SubLObject var801) {
        final SubLObject var802 = module0035.f2114(f29709(var72));
        final SubLObject var803 = Sequences.position(var802, var801, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var804 = module0048.f_1X(var803);
        final SubLObject var805 = ConsesLow.nth(var804, var801);
        return Values.values(var805, var804);
    }
    
    public static SubLObject f30032(final SubLObject var804, final SubLObject var805, SubLObject var806, SubLObject var807, SubLObject var122, SubLObject var808, SubLObject var470) {
        if (var806 == UNPROVIDED) {
            var806 = (SubLObject)$ic151$;
        }
        if (var807 == UNPROVIDED) {
            var807 = (SubLObject)$ic481$;
        }
        if (var122 == UNPROVIDED) {
            var122 = module0429.f30373();
        }
        if (var808 == UNPROVIDED) {
            var808 = (SubLObject)$ic482$;
        }
        if (var470 == UNPROVIDED) {
            var470 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var809 = SubLProcess.currentSubLThread();
        assert NIL != module0091.f6320(var804) : var804;
        assert NIL != module0091.f6320(var805) : var805;
        final SubLObject var810 = Symbols.symbol_value(var804);
        final SubLObject var811 = Symbols.symbol_name(var804);
        final SubLObject var812 = Symbols.symbol_value(var805);
        final SubLObject var813 = Symbols.symbol_name(var805);
        var809.resetMultipleValues();
        final SubLObject var814 = f29968(var810, var812);
        final SubLObject var815 = var809.secondMultipleValue();
        var809.resetMultipleValues();
        PrintLow.format(var470, (SubLObject)$ic484$);
        var809.resetMultipleValues();
        final SubLObject var816 = f30014(var810, var812);
        final SubLObject var817 = var809.secondMultipleValue();
        final SubLObject var818 = var809.thirdMultipleValue();
        var809.resetMultipleValues();
        PrintLow.format((SubLObject)T, (SubLObject)$ic485$, new SubLObject[] { var816, var817, var818 });
        PrintLow.format(var470, (SubLObject)$ic486$);
        f30024(f30020(var810, var812, var122));
        PrintLow.format(var470, (SubLObject)$ic487$);
        f30024(f30020(var814, var815, var122));
        PrintLow.format(var470, (SubLObject)$ic488$);
        f30024(f30020(f29696(var810), f29696(var812), var122));
        PrintLow.format(var470, (SubLObject)$ic489$);
        f30024(f30020(f29955(var810), f29955(var812), var122));
        SubLObject var819 = var807;
        SubLObject var820 = (SubLObject)NIL;
        var820 = var819.first();
        while (NIL != var819) {
            SubLObject var12_818 = (SubLObject)$ic490$;
            SubLObject var821 = (SubLObject)NIL;
            var821 = var12_818.first();
            while (NIL != var12_818) {
                module0429.f30391(var810, var812, var811, var813, var820, var821, var806, var808);
                var12_818 = var12_818.rest();
                var821 = var12_818.first();
            }
            SubLObject var12_819 = (SubLObject)$ic490$;
            var821 = (SubLObject)NIL;
            var821 = var12_819.first();
            while (NIL != var12_819) {
                module0429.f30391(var814, var815, var811, var813, var820, var821, Sequences.cconcatenate((SubLObject)$ic491$, var806), var808);
                var12_819 = var12_819.rest();
                var821 = var12_819.first();
            }
            var819 = var819.rest();
            var820 = var819.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30033(final SubLObject var7) {
        return f29693(var7, f30034(var7), (SubLObject)T);
    }
    
    public static SubLObject f30034(final SubLObject var7) {
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = f29678(var7);
        SubLObject var10 = (SubLObject)NIL;
        var10 = var9.first();
        while (NIL != var9) {
            if (NIL != f30035(var10)) {
                var8 = (SubLObject)ConsesLow.cons(f29629(var10), var8);
            }
            var9 = var9.rest();
            var10 = var9.first();
        }
        return Sequences.nreverse(var8);
    }
    
    public static SubLObject f30036(final SubLObject var7) {
        return f30026(f29678(var7));
    }
    
    public static SubLObject f30026(final SubLObject var64) {
        return Sequences.count_if((SubLObject)$ic492$, var64, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30035(final SubLObject var9) {
        final SubLObject var10 = f29649(var9);
        if (NIL != module0360.f23871(var10) && NIL != module0038.f2668((SubLObject)$ic493$, module0360.f23876(var10), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30037(final SubLObject var72, SubLObject var470) {
        if (var470 == UNPROVIDED) {
            var470 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread var471 = SubLProcess.currentSubLThread();
        final SubLObject var472 = f29708(var72);
        final SubLObject var473 = Sequences.length(var472);
        final SubLObject var474 = Sequences.count((SubLObject)$ic0$, var472, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic356$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var475 = Sequences.count((SubLObject)$ic1$, var472, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic356$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var476 = reader.$read_default_float_format$.currentBinding(var471);
        try {
            reader.$read_default_float_format$.bind((SubLObject)$ic494$, var471);
            PrintLow.format(var470, (SubLObject)$ic495$, var473);
            PrintLow.format(var470, (SubLObject)$ic496$, var474, module0048.f3302(Numbers.multiply((SubLObject)$ic61$, Numbers.divide(var474, var473)), (SubLObject)THREE_INTEGER));
            PrintLow.format(var470, (SubLObject)$ic497$, var475, module0048.f3302(Numbers.multiply((SubLObject)$ic61$, Numbers.divide(var475, var473)), (SubLObject)THREE_INTEGER));
            final SubLObject var477 = f29808(var72, (SubLObject)UNPROVIDED);
            PrintLow.format(var470, (SubLObject)$ic498$);
            module0035.f2365(var477, var470);
            SubLObject var478 = var472;
            SubLObject var479 = (SubLObject)NIL;
            var479 = var478.first();
            while (NIL != var478) {
                final SubLObject var480 = f29669(var479);
                final SubLObject var481 = f29671(var479);
                final SubLObject var482 = f29670(var479);
                final SubLObject var483 = f29640(var482, (SubLObject)$ic28$, (SubLObject)UNPROVIDED);
                PrintLow.format(var470, (SubLObject)$ic499$, var480);
                PrintLow.format(var470, (SubLObject)$ic500$, var481);
                PrintLow.format(var470, (SubLObject)$ic501$, var483);
                SubLObject var484;
                SubLObject var485;
                SubLObject var486;
                for (var484 = (SubLObject)NIL, var484 = var482; NIL != var484; var484 = conses_high.cddr(var484)) {
                    var485 = var484.first();
                    var486 = conses_high.cadr(var484);
                    if (NIL != module0360.f23809(var485) && NIL != var486) {
                        PrintLow.format(var470, (SubLObject)$ic502$, var485, var486);
                    }
                }
                var478 = var478.rest();
                var479 = var478.first();
            }
        }
        finally {
            reader.$read_default_float_format$.rebind(var476, var471);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30038(final SubLObject var7) {
        return module0035.f2517(module0035.f2515(Mapping.mapcar((SubLObject)$ic503$, f29678(var7)), Symbols.symbol_function((SubLObject)$ic85$), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f30039(final SubLObject var823) {
        if (ZERO_INTEGER.eql(conses_high.getf(var823, (SubLObject)$ic447$, (SubLObject)UNPROVIDED))) {
            return (SubLObject)$ic504$;
        }
        return var823;
    }
    
    public static SubLObject f30040(final SubLObject var17) {
        SubLObject var18;
        for (var18 = module0279.f18578(module0423.f29563(var17), module0423.f29569(var17)); NIL != module0202.f12606(var18); var18 = module0205.f13204(var18, (SubLObject)UNPROVIDED)) {
            if (NIL != module0202.f12606(var18)) {}
        }
        if (NIL == module0202.f12595(var18)) {
            return (SubLObject)ONE_INTEGER;
        }
        return module0202.f12725(var18, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f30041(final SubLObject var17) {
        SubLObject var18;
        for (var18 = module0279.f18578(module0423.f29563(var17), module0423.f29569(var17)); NIL != module0202.f12606(var18); var18 = module0205.f13204(var18, (SubLObject)UNPROVIDED)) {
            if (NIL != module0202.f12606(var18)) {}
        }
        return module0206.f13487(var18);
    }
    
    public static SubLObject f30042() {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return $g3453$.getDynamicValue(var45);
    }
    
    public static SubLObject f30043(final SubLObject var330, final SubLObject var824, final SubLObject var825) {
        f30044(var330, var824, var825, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f30045(var330, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30046(final SubLObject var330, final SubLObject var824, final SubLObject var825) {
        module0004.f78(Sequences.cconcatenate((SubLObject)$ic506$, new SubLObject[] { module0006.f205(var330), $ic507$ }), (SubLObject)$ic508$, (SubLObject)ConsesLow.list(var330, var824, var825));
        module0006.f218((SubLObject)T, (SubLObject)$ic509$, var330, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30044(final SubLObject var330, final SubLObject var824, final SubLObject var825, SubLObject var124, SubLObject var248, SubLObject var249) {
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        if (var248 == UNPROVIDED) {
            var248 = (SubLObject)ZERO_INTEGER;
        }
        if (var249 == UNPROVIDED) {
            var249 = (SubLObject)NIL;
        }
        final SubLThread var826 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var330) : var330;
        assert NIL != Types.stringp(var824) : var824;
        assert NIL != module0173.f10955(var825) : var825;
        if (NIL != var124 && !areAssertionsDisabledFor(me) && NIL == Types.listp(var124)) {
            throw new AssertionError(var124);
        }
        SubLObject var827 = (SubLObject)NIL;
        SubLObject var828 = (SubLObject)NIL;
        try {
            var828 = streams_high.make_private_string_output_stream();
            if (var824.isString()) {
                PrintLow.format(var828, (SubLObject)$ic512$, var824);
            }
            if (NIL != var124) {
                PrintLow.format(var828, (SubLObject)$ic513$, var124);
            }
            PrintLow.format(var828, (SubLObject)$ic514$, module0011.f351(), module0574.f35164());
            var827 = streams_high.get_output_stream_string(var828);
        }
        finally {
            final SubLObject var829 = Threads.$is_thread_performing_cleanupP$.currentBinding(var826);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var826);
                streams_high.close(var828, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var829, var826);
            }
        }
        return f29784((SubLObject)ConsesLow.list(new SubLObject[] { $ic192$, reader.bq_cons($ic515$, ConsesLow.append(Mapping.mapcar((SubLObject)$ic516$, module0259.f16847(var825)), (SubLObject)NIL)), $ic193$, var330, $ic194$, NIL, $ic195$, NIL, $ic76$, var827, $ic130$, var124, $ic114$, $ic517$, $ic123$, $g3468$.getDynamicValue(var826), $ic198$, T, $ic199$, T, $ic200$, NIL, $ic201$, var248, $ic202$, var249, $ic203$, $ic219$ }));
    }
    
    public static SubLObject f30045(final SubLObject var330, SubLObject var470) {
        if (var470 == UNPROVIDED) {
            var470 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var471 = f29795(var330);
        final SubLObject var472 = f29681(var471);
        SubLObject var473 = (SubLObject)ZERO_INTEGER;
        SubLObject var474 = (SubLObject)ZERO_INTEGER;
        SubLObject var475 = (SubLObject)ZERO_INTEGER;
        SubLObject var476 = (SubLObject)ZERO_INTEGER;
        SubLObject var477 = (SubLObject)ZERO_INTEGER;
        SubLObject var478 = (SubLObject)ZERO_INTEGER;
        PrintLow.format(var470, var472);
        PrintLow.format(var470, (SubLObject)$ic518$);
        PrintLow.format(var470, (SubLObject)$ic519$);
        SubLObject var479 = f29678(var471);
        SubLObject var480 = (SubLObject)NIL;
        var480 = var479.first();
        while (NIL != var479) {
            final SubLObject var481 = f29629(var480);
            final SubLObject var482 = f29649(var480);
            final SubLObject var483 = (SubLObject)((NIL != module0167.f10824(var481, (SubLObject)UNPROVIDED)) ? module0205.f13277(var481, (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var484 = f29631(var480, (SubLObject)$ic18$, (SubLObject)ZERO_INTEGER);
            final SubLObject var485 = f29631(var480, (SubLObject)$ic520$, (SubLObject)ZERO_INTEGER);
            final SubLObject var486 = (SubLObject)(var485.isCons() ? Sequences.length(var485) : NIL);
            final SubLObject var487 = (SubLObject)(var485.isCons() ? var485.first() : NIL);
            final SubLObject var488 = f29631(var480, (SubLObject)$ic21$, (SubLObject)ZERO_INTEGER);
            final SubLObject var489 = f29631(var480, (SubLObject)$ic521$, (SubLObject)ZERO_INTEGER);
            final SubLObject var490 = f29631(var480, (SubLObject)$ic19$, (SubLObject)ZERO_INTEGER);
            if (NIL != module0048.f3293(var484)) {
                var473 = Numbers.add(var473, var484);
            }
            if (NIL != module0048.f3293(var488)) {
                var474 = Numbers.add(var474, var488);
            }
            if (NIL != module0048.f3293(var487)) {
                var475 = Numbers.add(var475, var487);
            }
            if (NIL != module0048.f3293(var486)) {
                var476 = Numbers.add(var476, var486);
            }
            if (NIL != module0048.f3293(var489)) {
                var477 = Numbers.add(var477, var489);
            }
            if (NIL != module0048.f3293(var490)) {
                var478 = Numbers.add(var478, var490);
            }
            PrintLow.format(var470, (SubLObject)$ic522$, new SubLObject[] { var484, var487, var488, var486, var489, (NIL != module0048.f3293(var489)) ? Numbers.subtract(var490, var489) : var490, var490, (NIL != module0048.f3293(var489)) ? module0048.f3314(var489, var490, (SubLObject)THREE_INTEGER) : ZERO_INTEGER, var483, (var482 == $ic523$) ? $ic151$ : PrintLow.format((SubLObject)NIL, (SubLObject)$ic524$, var482) });
            var479 = var479.rest();
            var480 = var479.first();
        }
        PrintLow.format(var470, (SubLObject)$ic519$);
        PrintLow.format(var470, (SubLObject)$ic525$, new SubLObject[] { var473, var475, var474, var476, var477, (NIL != module0048.f3293(var477)) ? Numbers.subtract(var478, var477) : var478, var478, (NIL != module0048.f3293(var477)) ? module0048.f3314(var477, var478, (SubLObject)THREE_INTEGER) : ZERO_INTEGER });
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30047(final SubLObject var330, final SubLObject var839, SubLObject var470) {
        if (var470 == UNPROVIDED) {
            var470 = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject var840 = f29795(var330);
        final SubLObject var841 = f29681(var840);
        final SubLObject var842 = module0035.f2114(module0038.f2738(module0038.f2621(var330, (SubLObject)$ic390$, (SubLObject)UNPROVIDED), (SubLObject)$ic526$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var843 = module0038.f2629((SubLObject)$ic527$, Strings.string_trim((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_asterisk, module0038.f2818()), module0038.f2738(var841, (SubLObject)ConsesLow.list(module0038.$g917$.getGlobalValue()), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first()));
        SubLObject var844 = f29678(var840);
        SubLObject var845 = (SubLObject)NIL;
        var845 = var844.first();
        while (NIL != var844) {
            final SubLObject var846 = f29629(var845);
            final SubLObject var847 = (SubLObject)((NIL != module0167.f10824(var846, (SubLObject)UNPROVIDED)) ? module0205.f13277(var846, (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var848 = f29631(var845, (SubLObject)$ic18$, (SubLObject)ZERO_INTEGER);
            final SubLObject var849 = f29631(var845, (SubLObject)$ic520$, (SubLObject)ZERO_INTEGER);
            final SubLObject var850 = (SubLObject)(var849.isCons() ? Sequences.length(var849) : NIL);
            final SubLObject var851 = (SubLObject)(var849.isCons() ? var849.first() : NIL);
            final SubLObject var852 = f29631(var845, (SubLObject)$ic21$, (SubLObject)ZERO_INTEGER);
            final SubLObject var853 = f29631(var845, (SubLObject)$ic521$, (SubLObject)ZERO_INTEGER);
            final SubLObject var854 = f29631(var845, (SubLObject)$ic19$, (SubLObject)ZERO_INTEGER);
            if (var839.equal(var847)) {
                PrintLow.format(var470, (SubLObject)$ic528$, new SubLObject[] { var842, var848, var851, var852, var850, var853, (NIL != module0048.f3293(var853)) ? Numbers.subtract(var854, var853) : var854, var854, (NIL != module0048.f3293(var853)) ? module0048.f3314(var853, var854, (SubLObject)THREE_INTEGER) : ZERO_INTEGER, var843 });
                streams_high.force_output((SubLObject)T);
            }
            var844 = var844.rest();
            var845 = var844.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30048() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29620", "S#32792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29621", "S#32793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29622", "S#32794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29623", "S#32795", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29624", "S#32796", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0424", "f29625", "S#32797");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29626", "S#32798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29627", "S#32799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29628", "S#32800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29629", "S#28956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29630", "S#32801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29631", "S#32802", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29632", "S#32803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29634", "S#32804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29633", "S#32805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29635", "S#32806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29636", "S#32807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29637", "S#32808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29638", "S#32809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29639", "S#32810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29641", "S#32811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29642", "S#32812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29643", "S#32813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29644", "S#32814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29645", "S#32815", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29640", "S#28957", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29648", "S#32816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29646", "S#32817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29649", "S#32818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29650", "S#32819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29651", "S#32820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29652", "S#32821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29653", "S#32822", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29654", "S#32823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29655", "S#32824", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29656", "S#32825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29657", "S#32826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29658", "S#32827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29659", "S#32828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29660", "S#32829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29661", "S#32830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29662", "S#32831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29663", "S#32832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29664", "S#32833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29665", "S#32834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29666", "S#32835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29647", "S#32836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29667", "S#32837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29668", "S#32838", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29669", "S#32839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29670", "S#32840", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29671", "S#32841", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29672", "S#32842", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29673", "S#32843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29674", "S#32844", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29675", "S#32845", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29676", "S#32846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29677", "S#32847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29679", "S#32848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29680", "S#32849", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29681", "S#32850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29678", "S#28955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29682", "S#32851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29683", "S#32852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29684", "S#32853", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29685", "S#32854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29686", "S#32855", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29687", "S#32856", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29688", "S#32857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29689", "S#32858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29690", "S#32859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29691", "S#32860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29692", "S#32861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29694", "S#32862", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29695", "S#32863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29697", "S#32864", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29698", "S#32865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29699", "S#32866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29700", "S#32867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29703", "S#32868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29704", "S#32869", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29705", "S#32870", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29706", "S#32871", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29707", "S#32872", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29708", "S#32873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29709", "S#32874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29710", "S#32875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29711", "S#32876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29713", "S#32877", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29718", "S#32878", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29721", "S#32879", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29722", "S#32880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29723", "S#32881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29724", "S#32882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29725", "S#32883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29726", "S#32884", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29731", "S#32885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29734", "S#32886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29732", "S#32887", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29735", "S#32888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29745", "S#32889", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29746", "S#32890", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29747", "S#32891", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29748", "S#32892", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29740", "S#32893", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29741", "S#32894", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29742", "S#32895", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29737", "S#32896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29738", "S#32897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29739", "S#32898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29736", "S#32899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29749", "S#32900", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29750", "S#32901", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29751", "S#32902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29752", "S#32903", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29753", "S#32904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29754", "S#32905", 1, 12, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29759", "S#32906", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29755", "S#32907", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29761", "S#32908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29763", "S#32909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29762", "S#32910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29764", "S#32911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29765", "S#32912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29766", "S#32913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29767", "S#32914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29760", "S#28958", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29768", "S#32915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29769", "S#31696", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29770", "S#32916", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29771", "S#32917", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29772", "S#32918", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29773", "S#32919", 1, 13, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29780", "S#32920", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29774", "S#32921", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0424", "f29782", "S#32922");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29783", "S#32923", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29784", "S#32924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29789", "S#32925", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29790", "S#32926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29792", "S#32927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29793", "S#32928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29791", "S#32929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29785", "S#32930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29794", "S#32931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29786", "S#32932", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29796", "S#32933", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29798", "S#32934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29799", "S#32935", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29788", "S#32936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29800", "S#32937", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0424", "f29802", "S#32938");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29803", "S#32939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29807", "S#32940", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29811", "S#32941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29813", "S#32942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29814", "S#32943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29812", "S#32944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29804", "S#32945", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29815", "S#32946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29817", "S#32947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29819", "S#32948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29806", "S#32949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29820", "S#32950", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29822", "S#32951", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29823", "S#32952", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29825", "S#32953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29827", "S#31619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29828", "S#32954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29830", "S#32955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29831", "S#32956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29832", "S#32957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29833", "S#32958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29834", "S#32959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29835", "S#32960", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29836", "S#32961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29837", "S#32962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29829", "S#32963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29838", "S#32964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29842", "S#32965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29845", "S#32966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29846", "S#32967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29850", "S#32968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29852", "S#32969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29855", "S#32970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29858", "S#32971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29862", "S#32972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29866", "S#32973", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29719", "S#32780", 1, 0, false);
        new $f29719$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29867", "S#32974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29868", "S#32975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29869", "S#32976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29824", "S#32977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29870", "S#32978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29871", "S#32979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29872", "S#32980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29873", "S#32981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29874", "S#32982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29875", "S#32983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29876", "S#32984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29877", "S#32985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29878", "S#32986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29879", "S#32987", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29880", "S#32988", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29881", "S#32989", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29882", "S#32990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29715", "S#32991", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29863", "S#32992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29839", "S#32993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29883", "S#32994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29744", "S#32995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29884", "S#32996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29885", "S#32997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29847", "S#32998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29826", "S#32999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29720", "S#33000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29859", "S#33001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29717", "S#33002", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29886", "S#33003", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29714", "S#32782", 1, 0, false);
        new $f29714$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29728", "S#33004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29887", "S#33005", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29888", "S#33006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29889", "S#33007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29890", "S#33008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29891", "S#33009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29892", "S#33010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29893", "S#33011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29894", "S#33012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29895", "S#33013", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29896", "S#33014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29897", "S#33015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29898", "S#33016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29899", "S#33017", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29900", "S#33018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29901", "S#33019", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29902", "S#33020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29903", "S#33021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29904", "S#33022", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29905", "S#33023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29906", "S#33024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29727", "S#33025", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29864", "S#33026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29840", "S#33027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29908", "S#33028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29909", "S#33029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29743", "S#33030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29910", "S#33031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29851", "S#33032", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29843", "S#33033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29911", "S#33034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29912", "S#33035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29848", "S#33036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29853", "S#33037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29856", "S#33038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29733", "S#33039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29716", "S#33040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29913", "S#33041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29860", "S#33042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29914", "S#33043", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29915", "S#33044", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29916", "S#33045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29729", "S#32784", 1, 0, false);
        new $f29729$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29776", "S#33046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29917", "S#33047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29918", "S#33048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29919", "S#33049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29920", "S#33050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29921", "S#33051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29922", "S#33052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29923", "S#33053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29924", "S#33054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29925", "S#33055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29926", "S#33056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29927", "S#33057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29928", "S#33058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29929", "S#33059", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29930", "S#33060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29931", "S#33061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29932", "S#33062", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29933", "S#33063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29934", "S#33064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29775", "S#33065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29865", "S#33066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29841", "S#33067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29935", "S#33068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29936", "S#33069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29937", "S#33070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29844", "S#33071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29849", "S#33072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29854", "S#33073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29857", "S#33074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29781", "S#33075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29730", "S#33076", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29907", "S#33077", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29861", "S#33078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29938", "S#33079", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29939", "S#33080", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29787", "S#33081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29805", "S#33082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29940", "S#33083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29756", "S#33084", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29777", "S#33085", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29757", "S#33086", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29778", "S#33087", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29758", "S#33088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29779", "S#33089", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0424", "f29941", "S#33090");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0424", "f29942", "S#33091");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29795", "S#28954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29943", "S#33092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29944", "S#33093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29945", "S#33094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29818", "S#33095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29947", "S#33096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29946", "S#33097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29948", "S#33098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29949", "S#33099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29950", "S#33100", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29797", "S#33101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29816", "S#33102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29951", "S#33103", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29952", "S#33104", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29809", "S#33105", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29696", "S#28953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29953", "S#33106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29954", "S#33107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29955", "S#33108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29956", "S#33109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29810", "S#33110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29957", "S#33111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29958", "S#33112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29960", "S#33113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29959", "S#33114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29961", "S#33115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29962", "S#33116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29963", "S#33117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29964", "S#33118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29965", "S#33119", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29966", "S#33120", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29967", "S#33121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29969", "S#33122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29971", "S#33123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29972", "S#33124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29974", "S#33125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29968", "S#33126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29970", "S#33127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29976", "S#33128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29977", "S#33129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29978", "S#33130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29979", "S#33131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29973", "S#33132", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29975", "S#33133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29981", "S#33134", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29983", "S#33135", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29982", "S#33136", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29984", "S#33137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29985", "S#33138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29693", "S#33139", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29986", "S#33140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29987", "S#33141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29712", "S#33142", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29988", "S#33143", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29990", "S#33144", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29991", "S#32787", 0, 0, false);
        new $f29991$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29992", "S#33145", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29993", "S#33146", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29989", "S#33147", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29994", "S#33148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29980", "S#33149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29995", "S#33150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29996", "S#33151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29997", "S#33152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29998", "S#33153", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29999", "S#33154", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30000", "S#33155", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30001", "S#33156", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30002", "S#33157", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30003", "S#33158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30005", "S#33159", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30006", "S#33160", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29801", "S#33161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30008", "S#33162", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30009", "S#33163", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30007", "S#33164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30004", "S#33165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30010", "S#33166", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30011", "S#33167", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30013", "S#33168", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30012", "S#33169", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30014", "S#33170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30016", "S#33171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30018", "S#33172", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29821", "S#33173", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30019", "S#33174", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30017", "S#33175", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30020", "S#33176", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30022", "S#33177", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30021", "S#33178", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30023", "S#33179", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30024", "S#33180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29701", "S#33181", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29808", "S#33182", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f29702", "S#33183", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30015", "S#33184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30027", "S#33185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30028", "S#33186", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30030", "S#33187", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30029", "S#33188", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30025", "S#33189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30031", "S#33190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30032", "S#33191", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30033", "S#33192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30034", "S#33193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30036", "S#33194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30026", "S#33195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30035", "S#33196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30037", "S#33197", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30038", "S#33198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30039", "S#33199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30040", "S#33200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30041", "S#32655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30042", "S#33201", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30043", "S#33202", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30046", "S#33203", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30044", "S#33204", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30045", "S#33205", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0424", "f30047", "S#33206", 2, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30049() {
        $g3441$ = SubLFiles.defparameter("S#33207", (SubLObject)NIL);
        $g3442$ = SubLFiles.defparameter("S#33208", (SubLObject)NIL);
        $g3443$ = SubLFiles.defparameter("S#33209", (SubLObject)NIL);
        $g3444$ = SubLFiles.deflexical("S#33210", (SubLObject)$ic3$);
        $g3445$ = SubLFiles.deflexical("S#33211", ConsesLow.append($g3444$.getGlobalValue(), (SubLObject)$ic4$));
        $g3446$ = SubLFiles.deflexical("S#33212", ConsesLow.append($g3444$.getGlobalValue(), $g3445$.getGlobalValue()));
        $g3447$ = SubLFiles.deflexical("S#33213", (SubLObject)NIL);
        $g3448$ = SubLFiles.deflexical("S#33214", ConsesLow.append($g3444$.getGlobalValue(), (SubLObject)$ic9$));
        $g3449$ = SubLFiles.deflexical("S#33215", ConsesLow.append($g3444$.getGlobalValue(), (SubLObject)$ic9$, $g3445$.getGlobalValue()));
        $g3450$ = SubLFiles.defparameter("S#33216", (SubLObject)$ic10$);
        $g3451$ = SubLFiles.defparameter("S#33217", (SubLObject)NIL);
        $g3452$ = SubLFiles.defparameter("S#33218", (SubLObject)ONE_INTEGER);
        $g3454$ = SubLFiles.deflexical("S#33219", (SubLObject)$ic141$);
        $g3162$ = SubLFiles.deflexical("S#33220", (SubLObject)$ic10$);
        $g3455$ = SubLFiles.deflexical("S#33221", (SubLObject)$ic174$);
        $g3456$ = SubLFiles.deflexical("S#33222", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic207$)) ? $g3456$.getGlobalValue() : NIL));
        $g3458$ = SubLFiles.deflexical("S#33223", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic229$)) ? $g3458$.getGlobalValue() : NIL));
        $g3459$ = SubLFiles.deflexical("S#33224", (NIL != Symbols.boundp((SubLObject)$ic243$)) ? $g3459$.getGlobalValue() : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g3460$ = SubLFiles.deflexical("S#33225", (NIL != Symbols.boundp((SubLObject)$ic244$)) ? $g3460$.getGlobalValue() : module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g3461$ = SubLFiles.defconstant("S#33226", (SubLObject)$ic252$);
        $g3462$ = SubLFiles.defconstant("S#33227", (SubLObject)$ic292$);
        $g3463$ = SubLFiles.defconstant("S#33228", (SubLObject)$ic326$);
        $g3457$ = SubLFiles.deflexical("S#33229", (SubLObject)$ic390$);
        $g3464$ = SubLFiles.defparameter("S#33230", (SubLObject)NIL);
        $g3465$ = SubLFiles.defparameter("S#33231", (SubLObject)NIL);
        $g3466$ = SubLFiles.deflexical("S#33232", (SubLObject)NIL);
        $g3467$ = SubLFiles.deflexical("S#33233", (SubLObject)$ic442$);
        $g3453$ = SubLFiles.defparameter("S#33234", (SubLObject)NIL);
        $g3468$ = SubLFiles.defparameter("S#33235", (SubLObject)$ic505$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f30050() {
        module0002.f50((SubLObject)$ic5$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic7$, (SubLObject)$ic6$);
        module0034.f1895((SubLObject)$ic166$);
        module0034.f1895((SubLObject)$ic167$);
        module0003.f57((SubLObject)$ic207$);
        module0002.f50((SubLObject)$ic205$, (SubLObject)$ic208$);
        module0003.f57((SubLObject)$ic229$);
        module0002.f50((SubLObject)$ic228$, (SubLObject)$ic230$);
        module0003.f57((SubLObject)$ic243$);
        module0003.f57((SubLObject)$ic244$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3461$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic259$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic260$);
        Structures.def_csetf((SubLObject)$ic261$, (SubLObject)$ic262$);
        Structures.def_csetf((SubLObject)$ic263$, (SubLObject)$ic264$);
        Structures.def_csetf((SubLObject)$ic265$, (SubLObject)$ic266$);
        Structures.def_csetf((SubLObject)$ic267$, (SubLObject)$ic268$);
        Structures.def_csetf((SubLObject)$ic269$, (SubLObject)$ic270$);
        Structures.def_csetf((SubLObject)$ic271$, (SubLObject)$ic272$);
        Structures.def_csetf((SubLObject)$ic273$, (SubLObject)$ic274$);
        Equality.identity((SubLObject)$ic252$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3461$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic286$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3462$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic297$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic298$);
        Structures.def_csetf((SubLObject)$ic299$, (SubLObject)$ic300$);
        Structures.def_csetf((SubLObject)$ic301$, (SubLObject)$ic302$);
        Structures.def_csetf((SubLObject)$ic303$, (SubLObject)$ic304$);
        Structures.def_csetf((SubLObject)$ic305$, (SubLObject)$ic306$);
        Structures.def_csetf((SubLObject)$ic307$, (SubLObject)$ic308$);
        Structures.def_csetf((SubLObject)$ic309$, (SubLObject)$ic310$);
        Structures.def_csetf((SubLObject)$ic311$, (SubLObject)$ic312$);
        Structures.def_csetf((SubLObject)$ic313$, (SubLObject)$ic314$);
        Structures.def_csetf((SubLObject)$ic315$, (SubLObject)$ic316$);
        Equality.identity((SubLObject)$ic292$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3462$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic322$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3463$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic331$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic332$);
        Structures.def_csetf((SubLObject)$ic333$, (SubLObject)$ic334$);
        Structures.def_csetf((SubLObject)$ic335$, (SubLObject)$ic336$);
        Structures.def_csetf((SubLObject)$ic337$, (SubLObject)$ic338$);
        Structures.def_csetf((SubLObject)$ic339$, (SubLObject)$ic340$);
        Structures.def_csetf((SubLObject)$ic341$, (SubLObject)$ic342$);
        Structures.def_csetf((SubLObject)$ic343$, (SubLObject)$ic344$);
        Structures.def_csetf((SubLObject)$ic345$, (SubLObject)$ic346$);
        Structures.def_csetf((SubLObject)$ic347$, (SubLObject)$ic348$);
        Equality.identity((SubLObject)$ic326$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3463$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic352$));
        module0002.f50((SubLObject)$ic372$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic376$, (SubLObject)$ic6$);
        module0002.f50((SubLObject)$ic382$, (SubLObject)$ic6$);
        module0034.f1909((SubLObject)$ic412$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f30048();
    }
    
    public void initializeVariables() {
        f30049();
    }
    
    public void runTopLevelForms() {
        f30050();
    }
    
    static {
        me = (SubLFile)new module0424();
        $g3441$ = null;
        $g3442$ = null;
        $g3443$ = null;
        $g3444$ = null;
        $g3445$ = null;
        $g3446$ = null;
        $g3447$ = null;
        $g3448$ = null;
        $g3449$ = null;
        $g3450$ = null;
        $g3451$ = null;
        $g3452$ = null;
        $g3454$ = null;
        $g3162$ = null;
        $g3455$ = null;
        $g3456$ = null;
        $g3458$ = null;
        $g3459$ = null;
        $g3460$ = null;
        $g3461$ = null;
        $g3462$ = null;
        $g3463$ = null;
        $g3457$ = null;
        $g3464$ = null;
        $g3465$ = null;
        $g3466$ = null;
        $g3467$ = null;
        $g3453$ = null;
        $g3468$ = null;
        $ic0$ = makeKeyword("SUCCESS");
        $ic1$ = makeKeyword("FAILURE");
        $ic2$ = makeKeyword("ERROR");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("ANSWER-COUNT-AT-60-SECONDS"), makeKeyword("PROBLEM-STORE-PROBLEM-COUNT"), makeKeyword("PROBLEM-STORE-PROOF-COUNT"), makeKeyword("ERROR"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("ANSWER-COUNT-AT-30-SECONDS"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("TOTAL-TIME"), makeKeyword("TIME-TO-LAST-ANSWER"), makeKeyword("TIME-TO-FIRST-ANSWER"), makeKeyword("ANSWER-COUNT"), makeKeyword("EXHAUST-TOTAL"), makeKeyword("HALT-REASON"), makeKeyword("QUERY"), makeKeyword("QUERY-RUN") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("TIME-PER-ANSWER"), makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER"), makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY"), makeKeyword("PROBLEM-COUNT"), makeKeyword("PROOF-COUNT"), makeKeyword("LINK-COUNT"), makeKeyword("CONTENT-LINK-COUNT"), makeKeyword("REMOVAL-LINK-COUNT"), makeKeyword("REWRITE-LINK-COUNT"), makeKeyword("TRANSFORMATION-LINK-COUNT"), makeKeyword("STRUCTURAL-LINK-COUNT"), makeKeyword("JOIN-ORDERED-LINK-COUNT"), makeKeyword("JOIN-LINK-COUNT"), makeKeyword("SPLIT-LINK-COUNT"), makeKeyword("RESTRICTION-LINK-COUNT"), makeKeyword("RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeKeyword("UNION-LINK-COUNT"), makeKeyword("GOOD-PROBLEM-COUNT"), makeKeyword("NEUTRAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-PROBLEM-COUNT"), makeKeyword("SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("JOIN-PROBLEM-COUNT"), makeKeyword("SPLIT-PROBLEM-COUNT"), makeKeyword("DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-PROBLEM-COUNT"), makeKeyword("EXAMINED-PROBLEM-COUNT"), makeKeyword("POSSIBLE-PROBLEM-COUNT"), makeKeyword("PENDING-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-GOOD-PROBLEM-COUNT"), makeKeyword("EXAMINED-GOOD-PROBLEM-COUNT"), makeKeyword("POSSIBLE-GOOD-PROBLEM-COUNT"), makeKeyword("PENDING-GOOD-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-NEUTRAL-PROBLEM-COUNT"), makeKeyword("EXAMINED-NEUTRAL-PROBLEM-COUNT"), makeKeyword("POSSIBLE-NEUTRAL-PROBLEM-COUNT"), makeKeyword("PENDING-NEUTRAL-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-NO-GOOD-PROBLEM-COUNT"), makeKeyword("EXAMINED-NO-GOOD-PROBLEM-COUNT"), makeKeyword("POSSIBLE-NO-GOOD-PROBLEM-COUNT"), makeKeyword("PENDING-NO-GOOD-PROBLEM-COUNT"), makeKeyword("GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("GOOD-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("GOOD-JOIN-PROBLEM-COUNT"), makeKeyword("GOOD-SPLIT-PROBLEM-COUNT"), makeKeyword("GOOD-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NEUTRAL-JOIN-PROBLEM-COUNT"), makeKeyword("NEUTRAL-SPLIT-PROBLEM-COUNT"), makeKeyword("NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("NO-GOOD-JOIN-PROBLEM-COUNT"), makeKeyword("NO-GOOD-SPLIT-PROBLEM-COUNT"), makeKeyword("NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-JOIN-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-SPLIT-PROBLEM-COUNT"), makeKeyword("UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("EXAMINED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("EXAMINED-JOIN-PROBLEM-COUNT"), makeKeyword("EXAMINED-SPLIT-PROBLEM-COUNT"), makeKeyword("EXAMINED-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("POSSIBLE-JOIN-PROBLEM-COUNT"), makeKeyword("POSSIBLE-SPLIT-PROBLEM-COUNT"), makeKeyword("POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT"), makeKeyword("FINISHED-SINGLE-LITERAL-PROBLEM-COUNT"), makeKeyword("FINISHED-CONJUNCTIVE-PROBLEM-COUNT"), makeKeyword("FINISHED-JOIN-PROBLEM-COUNT"), makeKeyword("FINISHED-SPLIT-PROBLEM-COUNT"), makeKeyword("FINISHED-DISJUNCTIVE-PROBLEM-COUNT") });
        $ic5$ = makeSymbol("S#32795", "CYC");
        $ic6$ = makeSymbol("S#33090", "CYC");
        $ic7$ = makeSymbol("S#32796", "CYC");
        $ic8$ = makeSymbol("VECTOR");
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("SUCCESS"), (SubLObject)makeKeyword("FAILURE"), (SubLObject)makeKeyword("STATUS"), (SubLObject)makeKeyword("TEST"));
        $ic10$ = makeInteger(600);
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33236", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic12$ = makeSymbol("CLET");
        $ic13$ = makeSymbol("S#33217", "CYC");
        $ic14$ = makeSymbol("S#32852", "CYC");
        $ic15$ = makeKeyword("RESULT");
        $ic16$ = makeKeyword("QUERY");
        $ic17$ = makeKeyword("MISSING");
        $ic18$ = makeKeyword("ANSWER-COUNT");
        $ic19$ = makeKeyword("TOTAL-TIME");
        $ic20$ = makeKeyword("COMPLETE-TOTAL-TIME");
        $ic21$ = makeKeyword("TIME-TO-FIRST-ANSWER");
        $ic22$ = makeKeyword("TIME-TO-LAST-ANSWER");
        $ic23$ = makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER");
        $ic24$ = makeKeyword("COMPLETE-TIME-TO-LAST-ANSWER");
        $ic25$ = makeKeyword("TOTAL-STEPS");
        $ic26$ = makeKeyword("STEPS-TO-FIRST-ANSWER");
        $ic27$ = makeKeyword("STEPS-TO-LAST-ANSWER");
        $ic28$ = makeKeyword("HALT-REASON");
        $ic29$ = makeKeyword("ORIGIN");
        $ic30$ = makeKeyword("WASTED-TIME-AFTER-LAST-ANSWER");
        $ic31$ = makeKeyword("LATENCY-IMPROVEMENT-FROM-ITERATIVITY");
        $ic32$ = makeKeyword("SETUP-TIME");
        $ic33$ = makeKeyword("TIME-PER-ANSWER");
        $ic34$ = makeKeyword("COMPLETE-TIME-PER-ANSWER");
        $ic35$ = makeKeyword("ANSWERABILITY-TIME");
        $ic36$ = makeKeyword("ANSWERABILITY-STEPS");
        $ic37$ = makeKeyword("NEW-ROOT-RELATIVE-TOTAL-TIMES");
        $ic38$ = makeKeyword("NEW-ROOT-TIMES");
        $ic39$ = makeKeyword("NEW-ROOT-RELATIVE-ANSWER-TIMES");
        $ic40$ = makeKeyword("ANSWER-TIMES");
        $ic41$ = makeKeyword("ESTIMATED-EXHAUSTIVE-PROBLEM-COUNT");
        $ic42$ = makeKeyword("ESTIMATED-EXHAUSTIVE-NEW-ROOT-COUNT");
        $ic43$ = makeKeyword("NEW-ROOT-COUNT");
        $ic44$ = makeKeyword("PROBLEM-COUNT");
        $ic45$ = makeKeyword("ESTIMATED-EXHAUSTIVE-BYTE-COUNT");
        $ic46$ = makeSymbol("S#33237", "CYC");
        $ic47$ = makeKeyword("TOTAL-NEW-ROOT-INITIAL-REMOVAL-FANOUT");
        $ic48$ = makeKeyword("NEW-ROOT-INITIAL-REMOVAL-FANOUTS");
        $ic49$ = makeKeyword("QUERY-FUNCALL");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("S#33238", "CYC"), (SubLObject)makeSymbol("S#168", "CYC"));
        $ic51$ = ConsesLow.list((SubLObject)makeSymbol("S#33238", "CYC"), (SubLObject)makeSymbol("S#168", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"));
        $ic52$ = makeKeyword("QUERY-RUN-FUNCALL");
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#33239", "CYC"), (SubLObject)makeSymbol("S#168", "CYC"));
        $ic54$ = ConsesLow.list((SubLObject)makeSymbol("S#33239", "CYC"), (SubLObject)makeSymbol("S#168", "CYC"), (SubLObject)makeSymbol("S#750", "CYC"));
        $ic55$ = makeString("unrecognized KBQ property spec ~s");
        $ic56$ = makeString("Use the 'with-kbq-query-set-run macro to provide the scaling factor from internal real time to seconds.");
        $ic57$ = makeString("Use the 'with-kbq-query-set-run' macro to provide the scaling factor from internal real time to seconds.");
        $ic58$ = ConsesLow.list((SubLObject)makeKeyword("MAX-TIME"), (SubLObject)makeKeyword("OUTLIER-TIMEOUT"));
        $ic59$ = makeKeyword("TAUTOLOGY");
        $ic60$ = makeInteger(1000);
        $ic61$ = makeInteger(100);
        $ic62$ = (SubLFloat)makeDouble(0.1);
        $ic63$ = (SubLFloat)makeDouble(0.01);
        $ic64$ = makeKeyword("INFERENCE-PROOF-SPEC");
        $ic65$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceTruth"));
        $ic66$ = makeInteger(-2);
        $ic67$ = makeSymbol("FIRST");
        $ic68$ = makeKeyword("TEST");
        $ic69$ = makeKeyword("STATUS");
        $ic70$ = makeKeyword("QUERY-RUN");
        $ic71$ = makeKeyword("MACHINE");
        $ic72$ = makeKeyword("DATE");
        $ic73$ = makeKeyword("BOGOMIPS");
        $ic74$ = makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND");
        $ic75$ = makeKeyword("PATCH-LEVEL");
        $ic76$ = makeKeyword("COMMENT");
        $ic77$ = makeKeyword("QUERY-RUNS");
        $ic78$ = makeSymbol("S#28955", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#688", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC"), (SubLObject)makeSymbol("S#33240", "CYC"), (SubLObject)makeSymbol("INTERNAL-TIME-UNITS-PER-SECOND"), (SubLObject)makeSymbol("S#33241", "CYC"), (SubLObject)makeSymbol("COMMENT"), (SubLObject)makeSymbol("S#33242", "CYC"));
        $ic80$ = ConsesLow.list((SubLObject)makeKeyword("MACHINE"), (SubLObject)makeKeyword("DATE"), (SubLObject)makeKeyword("BOGOMIPS"), (SubLObject)makeKeyword("INTERNAL-TIME-UNITS-PER-SECOND"), (SubLObject)makeKeyword("PATCH-LEVEL"), (SubLObject)makeKeyword("COMMENT"), (SubLObject)makeKeyword("TEST-RUNS"));
        $ic81$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic82$ = makeKeyword("TEST-RUNS");
        $ic83$ = makeSymbol("S#13755", "CYC");
        $ic84$ = makeSymbol("S#32717", "CYC");
        $ic85$ = makeSymbol("<");
        $ic86$ = makeSymbol("S#3700", "CYC");
        $ic87$ = makeString("~s -> ~s~%");
        $ic88$ = makeSymbol("S#28956", "CYC");
        $ic89$ = makeKeyword("MEDIAN-TOTAL-TIME");
        $ic90$ = makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER");
        $ic91$ = makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER");
        $ic92$ = makeString("what's the median for ~s");
        $ic93$ = makeKeyword("MEAN-TOTAL-TIME");
        $ic94$ = makeKeyword("MEAN-TIME-TO-FIRST-ANSWER");
        $ic95$ = makeKeyword("MEAN-TIME-TO-LAST-ANSWER");
        $ic96$ = makeString("what's the mean for ~s");
        $ic97$ = makeSymbol("S#32806", "CYC");
        $ic98$ = makeSymbol("S#32808", "CYC");
        $ic99$ = makeSymbol("S#32809", "CYC");
        $ic100$ = makeSymbol("S#32807", "CYC");
        $ic101$ = makeSymbol("S#32810", "CYC");
        $ic102$ = makeSymbol("S#32811", "CYC");
        $ic103$ = makeSymbol("S#32805", "CYC");
        $ic104$ = makeString("unknown metric ~s");
        $ic105$ = makeSymbol("S#32873", "CYC");
        $ic106$ = makeSymbol("S#32839", "CYC");
        $ic107$ = makeSymbol("S#32663", "CYC");
        $ic108$ = makeSymbol("S#747", "CYC");
        $ic109$ = makeSymbol("S#26498", "CYC");
        $ic110$ = makeSymbol("NUMBERP");
        $ic111$ = makeSymbol("S#748", "CYC");
        $ic112$ = makeSymbol("QUERY-PROPERTY-P");
        $ic113$ = makeKeyword("CONTINUABLE?");
        $ic114$ = makeKeyword("METRICS");
        $ic115$ = makeKeyword("BROWSABLE?");
        $ic116$ = makeString("~%~A~%~%");
        $ic117$ = makeKeyword("RUNNING");
        $ic118$ = makeSymbol("S#38", "CYC");
        $ic119$ = makeKeyword("NEVER-RUN");
        $ic120$ = makeKeyword("FINISHED");
        $ic121$ = makeString("Outlier :~%~S");
        $ic122$ = makeKeyword("OUTLIER-ABORT");
        $ic123$ = makeKeyword("OUTLIER-TIMEOUT");
        $ic124$ = makeString("Unable to compute any metrics for ~A");
        $ic125$ = makeString("Unable to compute all desired metrics for ~A");
        $ic126$ = makeString("KBQ harness error for ~A : ~A");
        $ic127$ = makeString("Error :~%~S~%~A");
        $ic128$ = makeKeyword("NOT-A-QUERY");
        $ic129$ = makeString("Avoided (due to ~S) :~%~S");
        $ic130$ = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
        $ic131$ = makeKeyword("ABORT");
        $ic132$ = constant_handles_oc.f8479((SubLObject)makeString("sksiModulesNeeded"));
        $ic133$ = constant_handles_oc.f8479((SubLObject)makeString("testFollowupTestFormula-All"));
        $ic134$ = constant_handles_oc.f8479((SubLObject)makeString("testFollowupTestFormula-Some"));
        $ic135$ = constant_handles_oc.f8479((SubLObject)makeString("testFollowupTestFormula-None"));
        $ic136$ = makeSymbol("S#32762", "CYC");
        $ic137$ = makeKeyword("RETURN");
        $ic138$ = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $ic139$ = constant_handles_oc.f8479((SubLObject)makeString("TestMetric-HaltReason"));
        $ic140$ = makeString("Unsupported metric ~S");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-TotalTime")), (SubLObject)makeKeyword("TOTAL-TIME")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-TimeToFirstAnswer")), (SubLObject)makeKeyword("TIME-TO-FIRST-ANSWER")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-TimeToLastAnswer")), (SubLObject)makeKeyword("TIME-TO-LAST-ANSWER")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-AnswerCount")), (SubLObject)makeKeyword("ANSWER-COUNT")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-AnswerCountAt30Seconds")), (SubLObject)makeKeyword("ANSWER-COUNT-AT-30-SECONDS")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-AnswerCountAt60Seconds")), (SubLObject)makeKeyword("ANSWER-COUNT-AT-60-SECONDS")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-ProblemStoreProofCount")), (SubLObject)makeKeyword("PROOF-COUNT")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("TestMetric-ProblemStoreProblemCount")), (SubLObject)makeKeyword("PROBLEM-COUNT")));
        $ic142$ = makeKeyword("PROBLEM-STORE");
        $ic143$ = ConsesLow.list((SubLObject)makeKeyword("CONDITIONAL-SENTENCE?"), (SubLObject)NIL);
        $ic144$ = makeString("Expected ");
        $ic145$ = makeString(", but got ");
        $ic146$ = makeString("Expected exactly ");
        $ic147$ = makeString(" binding sets, but got ");
        $ic148$ = makeString(".");
        $ic149$ = makeString("Expected at least ");
        $ic150$ = makeString("Expected no more than ");
        $ic151$ = makeString("");
        $ic152$ = makeString("These expected bindings were missing: ");
        $ic153$ = makeString("These unwanted bindings were returned: ");
        $ic154$ = makeString("    ");
        $ic155$ = makeKeyword("OUTPUT");
        $ic156$ = makeSymbol("S#6802", "CYC");
        $ic157$ = makeKeyword("ABORT-KBQ-RUN-QUERY-SET");
        $ic158$ = makeString("Abort KBQ run query set");
        $ic159$ = makeString("KBQ running query set");
        $ic160$ = makeString("~&Running ~s");
        $ic161$ = makeString("~&~%;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;~%");
        $ic162$ = makeString("~&;; ~A~%~%");
        $ic163$ = makeString("Unrunnable query : ~S");
        $ic164$ = makeSymbol("S#32652", "CYC");
        $ic165$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic166$ = makeSymbol("S#32912", "CYC");
        $ic167$ = makeSymbol("S#32914", "CYC");
        $ic168$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic169$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic170$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic171$ = constant_handles_oc.f8479((SubLObject)makeString("elementOf"));
        $ic172$ = makeSymbol("?OBJ");
        $ic173$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeKeyword("PRODUCTIVITY-LIMIT"), (SubLObject)makeKeyword("POSITIVE-INFINITY"));
        $ic174$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("evaluate")), (SubLObject)makeKeyword("SET"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("SetExtentFn")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), (SubLObject)makeSymbol("?QUERY"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("thereExists")), (SubLObject)makeSymbol("?TEST"), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("knownSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?TEST"), (SubLObject)makeKeyword("TEST-COLLECTION"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("testQuerySpecification")), (SubLObject)makeSymbol("?TEST"), (SubLObject)makeSymbol("?QUERY"))))))));
        $ic175$ = makeKeyword("TEST-COLLECTION");
        $ic176$ = makeKeyword("SET");
        $ic177$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL"));
        $ic178$ = makeKeyword("PROGRESS-MESSAGE");
        $ic179$ = makeString("Processing KB Queries");
        $ic180$ = makeKeyword("SKIP-KBQ");
        $ic181$ = makeString("Skip KBQ ~S");
        $ic182$ = makeKeyword("ADDITIONAL-ARGS");
        $ic183$ = makeString("~A");
        $ic184$ = ConsesLow.list((SubLObject)makeKeyword("CONTINUABLE?"), (SubLObject)NIL, (SubLObject)makeKeyword("BROWSABLE?"), (SubLObject)T);
        $ic185$ = makeKeyword("ABORT-KCT-RUN-TEST-SET");
        $ic186$ = makeString("Abort KCT run test set");
        $ic187$ = makeString("KCT running test set");
        $ic188$ = makeString("~&Running ~s~%");
        $ic189$ = makeString("Unrunnable test : ~S");
        $ic190$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#33243", "CYC"), makeSymbol("S#885", "CYC"), makeSymbol("S#33244", "CYC"), makeSymbol("S#33245", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#33246", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#7998", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#26501", "CYC")))), ConsesLow.list((SubLObject)makeSymbol("S#33247", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#33220", "CYC"))), makeSymbol("S#33248", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#33249", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#33250", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#1545", "CYC"), (SubLObject)ZERO_INTEGER), makeSymbol("COUNT"), ConsesLow.list((SubLObject)makeSymbol("S#33251", "CYC"), (SubLObject)makeKeyword("OVERWRITE")) });
        $ic191$ = ConsesLow.list(new SubLObject[] { makeKeyword("QUERY-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("KEEPALIVE-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("RANDOMIZE"), makeKeyword("SKIP"), makeKeyword("COUNT"), makeKeyword("IF-FILE-EXISTS") });
        $ic192$ = makeKeyword("QUERY-SPEC-SET");
        $ic193$ = makeKeyword("FILENAME");
        $ic194$ = makeKeyword("ANALYSIS-FILENAME");
        $ic195$ = makeKeyword("KEEPALIVE-FILENAME");
        $ic196$ = ConsesLow.list((SubLObject)makeSymbol("S#26501", "CYC"));
        $ic197$ = makeSymbol("S#33220", "CYC");
        $ic198$ = makeKeyword("INCREMENTAL");
        $ic199$ = makeKeyword("INCLUDE-RESULTS");
        $ic200$ = makeKeyword("RANDOMIZE");
        $ic201$ = makeKeyword("SKIP");
        $ic202$ = makeKeyword("COUNT");
        $ic203$ = makeKeyword("IF-FILE-EXISTS");
        $ic204$ = makeKeyword("OVERWRITE");
        $ic205$ = makeSymbol("S#32924", "CYC");
        $ic206$ = makeSymbol("LIST");
        $ic207$ = makeSymbol("S#33222", "CYC");
        $ic208$ = makeSymbol("S#32922", "CYC");
        $ic209$ = makeSymbol("S#32930", "CYC");
        $ic210$ = makeString("~%run starting at ~A");
        $ic211$ = makeString("~%run ended at ~A");
        $ic212$ = makeString("~%elapsed time : ~A");
        $ic213$ = makeString("Unable to open ~S");
        $ic214$ = makeSymbol("S#32929", "CYC");
        $ic215$ = ConsesLow.list((SubLObject)makeKeyword("OVERWRITE"), (SubLObject)makeKeyword("AUGMENT"), (SubLObject)makeKeyword("RERUN-ERRORS"), (SubLObject)makeKeyword("AUGMENT-OR-RERUN-ERRORS"));
        $ic216$ = makeKeyword("AUGMENT");
        $ic217$ = makeKeyword("APPEND");
        $ic218$ = makeKeyword("RERUN-ERRORS");
        $ic219$ = makeKeyword("AUGMENT-OR-RERUN-ERRORS");
        $ic220$ = makeString("unexpected if-file-exists ~s");
        $ic221$ = makeString("-rerun-errors-");
        $ic222$ = ConsesLow.list(new SubLObject[] { makeSymbol("&KEY"), makeSymbol("S#33252", "CYC"), makeSymbol("S#885", "CYC"), makeSymbol("S#33244", "CYC"), makeSymbol("S#33245", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#33246", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#33253", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#26501", "CYC")))), ConsesLow.list((SubLObject)makeSymbol("S#33247", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#33216", "CYC"))), makeSymbol("S#33248", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#33249", "CYC"), (SubLObject)T), ConsesLow.list((SubLObject)makeSymbol("S#33251", "CYC"), (SubLObject)makeKeyword("OVERWRITE")), ConsesLow.list((SubLObject)makeSymbol("S#33254", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#33250", "CYC"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeSymbol("S#1545", "CYC"), (SubLObject)ZERO_INTEGER), makeSymbol("COUNT") });
        $ic223$ = ConsesLow.list(new SubLObject[] { makeKeyword("TEST-SPEC-SET"), makeKeyword("FILENAME"), makeKeyword("ANALYSIS-FILENAME"), makeKeyword("KEEPALIVE-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("OVERRIDING-METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("INCREMENTAL"), makeKeyword("INCLUDE-RESULTS"), makeKeyword("IF-FILE-EXISTS"), makeKeyword("EXPOSE-RUNSTATE"), makeKeyword("RANDOMIZE"), makeKeyword("SKIP"), makeKeyword("COUNT") });
        $ic224$ = makeKeyword("TEST-SPEC-SET");
        $ic225$ = makeKeyword("OVERRIDING-METRICS");
        $ic226$ = makeSymbol("S#33216", "CYC");
        $ic227$ = makeKeyword("EXPOSE-RUNSTATE");
        $ic228$ = makeSymbol("S#32939", "CYC");
        $ic229$ = makeSymbol("S#33223", "CYC");
        $ic230$ = makeSymbol("S#32938", "CYC");
        $ic231$ = makeSymbol("S#33255", "CYC");
        $ic232$ = makeString("Filtered to #$KBContentRegressionTests");
        $ic233$ = makeString("All tests:~%");
        $ic234$ = makeString("~%Just the regression tests:~%");
        $ic235$ = makeInteger(212);
        $ic236$ = makeString("~%Failing tests:");
        $ic237$ = makeString("~%~%Failing regression tests (~a):");
        $ic238$ = makeString("~%~%Unrunnable tests:");
        $ic239$ = makeString("~a");
        $ic240$ = makeString("~%~a is unrunnable for an unknown reason.");
        $ic241$ = makeSymbol("S#32944", "CYC");
        $ic242$ = makeSymbol("S#32777", "CYC");
        $ic243$ = makeSymbol("S#33224", "CYC");
        $ic244$ = makeSymbol("S#33225", "CYC");
        $ic245$ = makeString("Unknown runstate type: ~A");
        $ic246$ = makeString("Runstate has no status: ~A");
        $ic247$ = makeString("Explanations aren't yet implemented.");
        $ic248$ = makeString("No inference defined for this runstate: ~A");
        $ic249$ = makeString("No start defined for this runstate: ~A");
        $ic250$ = makeString("No end defined for this runstate: ~A");
        $ic251$ = makeSymbol("KEYWORDP");
        $ic252$ = makeSymbol("S#32779", "CYC");
        $ic253$ = makeSymbol("S#32780", "CYC");
        $ic254$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#33256", "CYC"), (SubLObject)makeSymbol("S#25426", "CYC"), (SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeSymbol("S#33257", "CYC"), (SubLObject)makeSymbol("S#33258", "CYC"));
        $ic255$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("QUERY-SPEC"), (SubLObject)makeKeyword("INFERENCE"), (SubLObject)makeKeyword("RESULT"), (SubLObject)makeKeyword("TEST-RUNSTATE"), (SubLObject)makeKeyword("RUN-STATUS"));
        $ic256$ = ConsesLow.list((SubLObject)makeSymbol("S#32974", "CYC"), (SubLObject)makeSymbol("S#32975", "CYC"), (SubLObject)makeSymbol("S#32976", "CYC"), (SubLObject)makeSymbol("S#32977", "CYC"), (SubLObject)makeSymbol("S#32978", "CYC"), (SubLObject)makeSymbol("S#32979", "CYC"), (SubLObject)makeSymbol("S#32980", "CYC"));
        $ic257$ = ConsesLow.list((SubLObject)makeSymbol("S#32981", "CYC"), (SubLObject)makeSymbol("S#32982", "CYC"), (SubLObject)makeSymbol("S#32983", "CYC"), (SubLObject)makeSymbol("S#32984", "CYC"), (SubLObject)makeSymbol("S#32985", "CYC"), (SubLObject)makeSymbol("S#32986", "CYC"), (SubLObject)makeSymbol("S#32987", "CYC"));
        $ic258$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic259$ = makeSymbol("S#32973", "CYC");
        $ic260$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#32780", "CYC"));
        $ic261$ = makeSymbol("S#32974", "CYC");
        $ic262$ = makeSymbol("S#32981", "CYC");
        $ic263$ = makeSymbol("S#32975", "CYC");
        $ic264$ = makeSymbol("S#32982", "CYC");
        $ic265$ = makeSymbol("S#32976", "CYC");
        $ic266$ = makeSymbol("S#32983", "CYC");
        $ic267$ = makeSymbol("S#32977", "CYC");
        $ic268$ = makeSymbol("S#32984", "CYC");
        $ic269$ = makeSymbol("S#32978", "CYC");
        $ic270$ = makeSymbol("S#32985", "CYC");
        $ic271$ = makeSymbol("S#32979", "CYC");
        $ic272$ = makeSymbol("S#32986", "CYC");
        $ic273$ = makeSymbol("S#32980", "CYC");
        $ic274$ = makeSymbol("S#32987", "CYC");
        $ic275$ = makeKeyword("ID");
        $ic276$ = makeKeyword("LOCK");
        $ic277$ = makeKeyword("QUERY-SPEC");
        $ic278$ = makeKeyword("INFERENCE");
        $ic279$ = makeKeyword("TEST-RUNSTATE");
        $ic280$ = makeKeyword("RUN-STATUS");
        $ic281$ = makeString("Invalid slot ~S for construction function");
        $ic282$ = makeKeyword("BEGIN");
        $ic283$ = makeSymbol("S#32988", "CYC");
        $ic284$ = makeKeyword("SLOT");
        $ic285$ = makeKeyword("END");
        $ic286$ = makeSymbol("S#32990", "CYC");
        $ic287$ = makeSymbol("S#32782", "CYC");
        $ic288$ = makeString("KBQ Runstate Lock");
        $ic289$ = makeKeyword("NONE");
        $ic290$ = makeSymbol("INFERENCE-P");
        $ic291$ = makeSymbol("S#32798", "CYC");
        $ic292$ = makeSymbol("S#32781", "CYC");
        $ic293$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#1519", "CYC"), makeSymbol("S#672", "CYC"), makeSymbol("S#33259", "CYC"), makeSymbol("S#3267", "CYC"), makeSymbol("S#33260", "CYC"), makeSymbol("S#33261", "CYC"), makeSymbol("S#33258", "CYC"), makeSymbol("S#124", "CYC"), makeSymbol("S#125", "CYC") });
        $ic294$ = ConsesLow.list(new SubLObject[] { makeKeyword("ID"), makeKeyword("LOCK"), makeKeyword("TEST-SPEC"), makeKeyword("RESULT"), makeKeyword("QUERY-RUNSTATE"), makeKeyword("TEST-SET-RUNSTATE"), makeKeyword("RUN-STATUS"), makeKeyword("START"), makeKeyword("END") });
        $ic295$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#33004", "CYC"), makeSymbol("S#33005", "CYC"), makeSymbol("S#33006", "CYC"), makeSymbol("S#33007", "CYC"), makeSymbol("S#33008", "CYC"), makeSymbol("S#33009", "CYC"), makeSymbol("S#33010", "CYC"), makeSymbol("S#33011", "CYC"), makeSymbol("S#33012", "CYC") });
        $ic296$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#33013", "CYC"), makeSymbol("S#33014", "CYC"), makeSymbol("S#33015", "CYC"), makeSymbol("S#33016", "CYC"), makeSymbol("S#33017", "CYC"), makeSymbol("S#33018", "CYC"), makeSymbol("S#33019", "CYC"), makeSymbol("S#33020", "CYC"), makeSymbol("S#33021", "CYC") });
        $ic297$ = makeSymbol("S#33003", "CYC");
        $ic298$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#32782", "CYC"));
        $ic299$ = makeSymbol("S#33004", "CYC");
        $ic300$ = makeSymbol("S#33013", "CYC");
        $ic301$ = makeSymbol("S#33005", "CYC");
        $ic302$ = makeSymbol("S#33014", "CYC");
        $ic303$ = makeSymbol("S#33006", "CYC");
        $ic304$ = makeSymbol("S#33015", "CYC");
        $ic305$ = makeSymbol("S#33007", "CYC");
        $ic306$ = makeSymbol("S#33016", "CYC");
        $ic307$ = makeSymbol("S#33008", "CYC");
        $ic308$ = makeSymbol("S#33017", "CYC");
        $ic309$ = makeSymbol("S#33009", "CYC");
        $ic310$ = makeSymbol("S#33018", "CYC");
        $ic311$ = makeSymbol("S#33010", "CYC");
        $ic312$ = makeSymbol("S#33019", "CYC");
        $ic313$ = makeSymbol("S#33011", "CYC");
        $ic314$ = makeSymbol("S#33020", "CYC");
        $ic315$ = makeSymbol("S#33012", "CYC");
        $ic316$ = makeSymbol("S#33021", "CYC");
        $ic317$ = makeKeyword("TEST-SPEC");
        $ic318$ = makeKeyword("QUERY-RUNSTATE");
        $ic319$ = makeKeyword("TEST-SET-RUNSTATE");
        $ic320$ = makeKeyword("START");
        $ic321$ = makeSymbol("S#33022", "CYC");
        $ic322$ = makeSymbol("S#33024", "CYC");
        $ic323$ = makeSymbol("S#32784", "CYC");
        $ic324$ = makeString("KCT Runstate Lock");
        $ic325$ = makeSymbol("S#32837", "CYC");
        $ic326$ = makeSymbol("S#32783", "CYC");
        $ic327$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#672", "CYC"), (SubLObject)makeSymbol("S#33262", "CYC"), (SubLObject)makeSymbol("S#3267", "CYC"), (SubLObject)makeSymbol("S#33263", "CYC"), (SubLObject)makeSymbol("S#33258", "CYC"), (SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic328$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("LOCK"), (SubLObject)makeKeyword("TEST-SET"), (SubLObject)makeKeyword("RESULT"), (SubLObject)makeKeyword("TEST-RUNSTATES"), (SubLObject)makeKeyword("RUN-STATUS"), (SubLObject)makeKeyword("START"), (SubLObject)makeKeyword("END"));
        $ic329$ = ConsesLow.list((SubLObject)makeSymbol("S#33046", "CYC"), (SubLObject)makeSymbol("S#33047", "CYC"), (SubLObject)makeSymbol("S#33048", "CYC"), (SubLObject)makeSymbol("S#33049", "CYC"), (SubLObject)makeSymbol("S#33050", "CYC"), (SubLObject)makeSymbol("S#33051", "CYC"), (SubLObject)makeSymbol("S#33052", "CYC"), (SubLObject)makeSymbol("S#33053", "CYC"));
        $ic330$ = ConsesLow.list((SubLObject)makeSymbol("S#33054", "CYC"), (SubLObject)makeSymbol("S#33055", "CYC"), (SubLObject)makeSymbol("S#33056", "CYC"), (SubLObject)makeSymbol("S#33057", "CYC"), (SubLObject)makeSymbol("S#33058", "CYC"), (SubLObject)makeSymbol("S#33059", "CYC"), (SubLObject)makeSymbol("S#33060", "CYC"), (SubLObject)makeSymbol("S#33061", "CYC"));
        $ic331$ = makeSymbol("S#33045", "CYC");
        $ic332$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#32784", "CYC"));
        $ic333$ = makeSymbol("S#33046", "CYC");
        $ic334$ = makeSymbol("S#33054", "CYC");
        $ic335$ = makeSymbol("S#33047", "CYC");
        $ic336$ = makeSymbol("S#33055", "CYC");
        $ic337$ = makeSymbol("S#33048", "CYC");
        $ic338$ = makeSymbol("S#33056", "CYC");
        $ic339$ = makeSymbol("S#33049", "CYC");
        $ic340$ = makeSymbol("S#33057", "CYC");
        $ic341$ = makeSymbol("S#33050", "CYC");
        $ic342$ = makeSymbol("S#33058", "CYC");
        $ic343$ = makeSymbol("S#33051", "CYC");
        $ic344$ = makeSymbol("S#33059", "CYC");
        $ic345$ = makeSymbol("S#33052", "CYC");
        $ic346$ = makeSymbol("S#33060", "CYC");
        $ic347$ = makeSymbol("S#33053", "CYC");
        $ic348$ = makeSymbol("S#33061", "CYC");
        $ic349$ = makeKeyword("TEST-SET");
        $ic350$ = makeKeyword("TEST-RUNSTATES");
        $ic351$ = makeSymbol("S#33062", "CYC");
        $ic352$ = makeSymbol("S#33064", "CYC");
        $ic353$ = makeSymbol("S#32785", "CYC");
        $ic354$ = makeString("KCT Set Runstate Lock");
        $ic355$ = makeSymbol("S#32794", "CYC");
        $ic356$ = makeSymbol("S#32841", "CYC");
        $ic357$ = makeSymbol("S#32793", "CYC");
        $ic358$ = makeSymbol("S#32868", "CYC");
        $ic359$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33236", "CYC"), (SubLObject)makeSymbol("S#33264", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic360$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic361$ = makeKeyword("DONE");
        $ic362$ = makeUninternedSymbol("US#541F852");
        $ic363$ = makeUninternedSymbol("US#50BA606");
        $ic364$ = makeSymbol("PROGN");
        $ic365$ = makeSymbol("CHECK-TYPE");
        $ic366$ = ConsesLow.list((SubLObject)makeSymbol("STRINGP"));
        $ic367$ = makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $ic368$ = ConsesLow.list((SubLObject)makeKeyword("INPUT"));
        $ic369$ = makeSymbol("S#2154", "CYC");
        $ic370$ = ConsesLow.list((SubLObject)makeSymbol("S#32796", "CYC"));
        $ic371$ = makeSymbol("S#2183", "CYC");
        $ic372$ = makeSymbol("S#33092", "CYC");
        $ic373$ = makeSymbol("CSOME");
        $ic374$ = makeSymbol("WHILE");
        $ic375$ = makeSymbol("CNOT");
        $ic376$ = makeSymbol("S#33093", "CYC");
        $ic377$ = makeSymbol("PWHEN");
        $ic378$ = ConsesLow.list((SubLObject)makeKeyword("EOF"));
        $ic379$ = makeSymbol("CSETQ");
        $ic380$ = ConsesLow.list((SubLObject)T);
        $ic381$ = makeSymbol("PUNLESS");
        $ic382$ = makeSymbol("S#33099", "CYC");
        $ic383$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#33264", "CYC"), (SubLObject)makeSymbol("S#885", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic384$ = makeUninternedSymbol("US#491D2E0");
        $ic385$ = makeSymbol("IGNORE");
        $ic386$ = makeSymbol("STRINGP");
        $ic387$ = makeKeyword("INPUT");
        $ic388$ = makeKeyword("EOF");
        $ic389$ = makeString("dwimming ~s to NIL");
        $ic390$ = makeString(".cfasl");
        $ic391$ = makeString("-no-results");
        $ic392$ = makeString("Expected a ~a file, got ~s");
        $ic393$ = makeString("answerable sub-run of :~%~A");
        $ic394$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic395$ = makeSymbol("S#32842", "CYC");
        $ic396$ = makeString("succeeding sub-run of :~%~A");
        $ic397$ = makeSymbol("S#32792", "CYC");
        $ic398$ = makeString("unanswerable sub-run of :");
        $ic399$ = makeSymbol("ZEROP");
        $ic400$ = makeString("failing sub-run of :~%~A");
        $ic401$ = constant_handles_oc.f8479((SubLObject)makeString("CommonSenseTest"));
        $ic402$ = constant_handles_oc.f8479((SubLObject)makeString("KBContentRegressionTest"));
        $ic403$ = makeString("~s sub-run of :~%~A");
        $ic404$ = ConsesLow.list((SubLObject)makeSymbol("S#33265", "CYC"), (SubLObject)makeSymbol("S#33266", "CYC"));
        $ic405$ = makeSymbol("S#3302", "CYC");
        $ic406$ = makeString("filtered to queries");
        $ic407$ = makeSymbol("S#33138", "CYC");
        $ic408$ = makeSymbol("S#33137", "CYC");
        $ic409$ = makeString("filtered to tests");
        $ic410$ = makeSymbol("S#33141", "CYC");
        $ic411$ = makeSymbol("S#33140", "CYC");
        $ic412$ = makeSymbol("S#33147", "CYC");
        $ic413$ = makeSymbol("S#33232", "CYC");
        $ic414$ = makeSymbol("S#32787", "CYC");
        $ic415$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#33267", "CYC"), (SubLObject)makeSymbol("S#33268", "CYC"));
        $ic416$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#33269", "CYC"), (SubLObject)makeSymbol("S#33270", "CYC"));
        $ic417$ = makeSymbol("S#33107", "CYC");
        $ic418$ = makeSymbol(">");
        $ic419$ = makeSymbol("FOURTH");
        $ic420$ = makeSymbol("SECOND");
        $ic421$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#9148", "CYC"), (SubLObject)makeSymbol("S#33271", "CYC"), (SubLObject)makeSymbol("S#33272", "CYC"));
        $ic422$ = ConsesLow.list((SubLObject)makeKeyword("QUERY"), (SubLObject)makeKeyword("MISSING-FROM-1"), (SubLObject)makeKeyword("MISSING-FROM-2"));
        $ic423$ = makeKeyword("MISSING-FROM-1");
        $ic424$ = makeKeyword("MISSING-FROM-2");
        $ic425$ = makeKeyword("ANSWERABLE-2");
        $ic426$ = makeKeyword("MORE-ANSWERS-2");
        $ic427$ = makeKeyword("DIFFERENT-ANSWERS");
        $ic428$ = makeKeyword("MORE-ANSWERS-1");
        $ic429$ = makeKeyword("ANSWERABLE-1");
        $ic430$ = makeString("~S and ~S are different queries");
        $ic431$ = makeString("~S has no result");
        $ic432$ = makeString("query set runs contained different queries");
        $ic433$ = makeString("~s ~s ~s ~s ~s~%");
        $ic434$ = makeString("~s ~s ~s~%");
        $ic435$ = makeKeyword("CHANGE");
        $ic436$ = makeKeyword("BECAME-SUCCESS");
        $ic437$ = makeKeyword("BECAME-FAILURE");
        $ic438$ = makeString("unexpected change ~S");
        $ic439$ = makeString("~S and ~S are different tests");
        $ic440$ = makeString("~S has no status");
        $ic441$ = makeKeyword("UNDEFINED");
        $ic442$ = ConsesLow.list(new SubLObject[] { makeKeyword("TOTAL"), makeKeyword("INCREASE"), makeKeyword("TOTAL-SUCCESS"), makeKeyword("INCREASE"), makeKeyword("TOTAL-FAILURE"), makeKeyword("DECREASE"), makeKeyword("TOTAL-ERROR"), makeKeyword("DECREASE"), makeKeyword("TOTAL-LUMPY"), makeKeyword("DECREASE"), makeKeyword("TOTAL-ANSWERABLE"), makeKeyword("INCREASE"), makeKeyword("TOTAL-UNANSWERABLE"), makeKeyword("DECREASE"), makeKeyword("SUM-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEAN-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEDIAN-ANSWER-COUNT"), makeKeyword("INCREASE"), makeKeyword("MEAN-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-TIME-TO-FIRST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("MEAN-TIME-TO-LAST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-TO-LAST-ANSWER"), makeKeyword("DECREASE"), makeKeyword("STDEV-TIME-TO-LAST-ANSWER"), makeKeyword("NEITHER"), makeKeyword("SUM-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("STDEV-ANSWERABILITY-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-ANSWERABILITY-TIME"), makeKeyword("DECREASE"), makeKeyword("SUM-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("STDEV-TOTAL-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("SUM-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEAN-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("STDEV-COMPLETE-TOTAL-TIME"), makeKeyword("NEITHER"), makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-TIME-PER-ANSWER"), makeKeyword("DECREASE"), makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER"), makeKeyword("DECREASE") });
        $ic443$ = ConsesLow.list((SubLObject)makeKeyword("INCREASE"), (SubLObject)makeKeyword("DECREASE"), (SubLObject)makeKeyword("NEITHER"));
        $ic444$ = makeKeyword("NEITHER");
        $ic445$ = makeKeyword("INCREASE");
        $ic446$ = makeString("empty~%");
        $ic447$ = makeKeyword("TOTAL");
        $ic448$ = makeKeyword("TOTAL-ANSWERABLE");
        $ic449$ = makeKeyword("TOTAL-UNANSWERABLE");
        $ic450$ = makeKeyword("TOTAL-ERROR");
        $ic451$ = makeKeyword("TOTAL-LUMPY");
        $ic452$ = makeKeyword("SUM-ANSWER-COUNT");
        $ic453$ = makeKeyword("MEAN-ANSWER-COUNT");
        $ic454$ = makeKeyword("MEDIAN-ANSWER-COUNT");
        $ic455$ = makeKeyword("SUM-TOTAL-TIME");
        $ic456$ = makeKeyword("STDEV-TOTAL-TIME");
        $ic457$ = makeKeyword("SUM-COMPLETE-TOTAL-TIME");
        $ic458$ = makeKeyword("MEAN-COMPLETE-TOTAL-TIME");
        $ic459$ = makeKeyword("MEDIAN-COMPLETE-TOTAL-TIME");
        $ic460$ = makeKeyword("STDEV-COMPLETE-TOTAL-TIME");
        $ic461$ = makeKeyword("SUM-TIME-TO-FIRST-ANSWER");
        $ic462$ = makeKeyword("STDEV-TIME-TO-FIRST-ANSWER");
        $ic463$ = makeKeyword("SUM-COMPLETE-TIME-TO-FIRST-ANSWER");
        $ic464$ = makeKeyword("MEAN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $ic465$ = makeKeyword("MEDIAN-COMPLETE-TIME-TO-FIRST-ANSWER");
        $ic466$ = makeKeyword("STDEV-COMPLETE-TIME-TO-FIRST-ANSWER");
        $ic467$ = makeKeyword("SUM-ANSWERABILITY-TIME");
        $ic468$ = makeKeyword("MEAN-ANSWERABILITY-TIME");
        $ic469$ = makeKeyword("MEDIAN-ANSWERABILITY-TIME");
        $ic470$ = makeKeyword("STDEV-ANSWERABILITY-TIME");
        $ic471$ = makeKeyword("SUM-TIME-TO-LAST-ANSWER");
        $ic472$ = makeKeyword("STDEV-TIME-TO-LAST-ANSWER");
        $ic473$ = makeKeyword("MEDIAN-COMPLETE-TIME-PER-ANSWER");
        $ic474$ = makeString("ignoring metric ~S");
        $ic475$ = makeKeyword("MEDIAN-TIME-PER-ANSWER");
        $ic476$ = makeKeyword("TOTAL-SUCCESS");
        $ic477$ = makeKeyword("TOTAL-FAILURE");
        $ic478$ = makeKeyword("PERCENT-SUCCESS");
        $ic479$ = makeKeyword("PERCENT-FAILURE");
        $ic480$ = makeSymbol("S#32840", "CYC");
        $ic481$ = ConsesLow.list((SubLObject)makeKeyword("COMPLETE-TIME-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("COMPLETE-TOTAL-TIME"), (SubLObject)makeKeyword("ANSWERABILITY-TIME"), (SubLObject)makeKeyword("ANSWER-COUNT"));
        $ic482$ = makeString(":0");
        $ic483$ = makeSymbol("S#8004", "CYC");
        $ic484$ = makeString("~%~%Answerability analysis: ~%");
        $ic485$ = makeString("Total:           ~s ~s ~s~%");
        $ic486$ = makeString("~%~%Basic analysis: ~%");
        $ic487$ = makeString("~%~%Mutually Answerable: ~%");
        $ic488$ = makeString("~%~%Answerable: ~%");
        $ic489$ = makeString("~%~%Unanswerable: ~%");
        $ic490$ = ConsesLow.list((SubLObject)makeKeyword("BOTH"), (SubLObject)makeKeyword("BASELINE"));
        $ic491$ = makeString("Mutually Answerable ");
        $ic492$ = makeSymbol("S#33196", "CYC");
        $ic493$ = makeString("Unable to compute any metrics");
        $ic494$ = makeSymbol("DOUBLE-FLOAT");
        $ic495$ = makeString("~%;; Total Tests : ~4D");
        $ic496$ = makeString("~%;;  Successes  : ~4D (~S %)");
        $ic497$ = makeString("~%;;  Failures   : ~4D (~S %)");
        $ic498$ = makeString("~%~%;; Test Set Metrics~%");
        $ic499$ = makeString("~%~%Test : ~S");
        $ic500$ = makeString("~%Status : ~S");
        $ic501$ = makeString("~%Halt Reason : ~S");
        $ic502$ = makeString("~%~S ~S");
        $ic503$ = makeSymbol("S#32818", "CYC");
        $ic504$ = ConsesLow.list((SubLObject)makeKeyword("TOTAL"), (SubLObject)ZERO_INTEGER);
        $ic505$ = makeInteger(3600);
        $ic506$ = makeString("Running kbq benchmark (kbq-benchmark-report ");
        $ic507$ = makeString(")");
        $ic508$ = makeSymbol("S#33204", "CYC");
        $ic509$ = makeString("kbq benchmark (kbq-benchmark-report ~S) in background");
        $ic510$ = makeSymbol("FORT-P");
        $ic511$ = makeSymbol("LISTP");
        $ic512$ = makeString("~&*** ~A ***~%");
        $ic513$ = makeString("*** overriding-query-properties: ~A ***~%");
        $ic514$ = makeString("Tests run in System ~A KB ~A~%");
        $ic515$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic516$ = makeSymbol("S#32761", "CYC");
        $ic517$ = ConsesLow.list((SubLObject)makeKeyword("ANSWER-COUNT"), (SubLObject)makeKeyword("TIME-TO-FIRST-ANSWER"), (SubLObject)makeKeyword("SKSI-QUERY-TOTAL-TIME"), (SubLObject)makeKeyword("SKSI-QUERY-START-TIMES"), (SubLObject)makeKeyword("TOTAL-TIME"));
        $ic518$ = makeString(" #ANS  TTFS    TTFA #SQ    SKSI +  CYC =  TOTAL   (%SQ)  TEST~%");
        $ic519$ = makeString("---------------------------------------------------------------------~%");
        $ic520$ = makeKeyword("SKSI-QUERY-START-TIMES");
        $ic521$ = makeKeyword("SKSI-QUERY-TOTAL-TIME");
        $ic522$ = makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~A~A~%");
        $ic523$ = makeKeyword("EXHAUST-TOTAL");
        $ic524$ = makeString(" (~A)");
        $ic525$ = makeString("~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%)~%");
        $ic526$ = ConsesLow.list((SubLObject)makeString("/"));
        $ic527$ = makeInteger(60);
        $ic528$ = makeString("~15A: ~5D ~5,1F ~7,1F~4D ~7,1F ~7,1F ~7,1F (~4,1F%) ~30A~%");
    }
    
    public static final class $sX32779_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $query_spec;
        public SubLObject $inference;
        public SubLObject $result;
        public SubLObject $test_runstate;
        public SubLObject $run_status;
        public static final SubLStructDeclNative structDecl;
        
        public $sX32779_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$query_spec = (SubLObject)CommonSymbols.NIL;
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$test_runstate = (SubLObject)CommonSymbols.NIL;
            this.$run_status = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$lock;
        }
        
        public SubLObject getField4() {
            return this.$query_spec;
        }
        
        public SubLObject getField5() {
            return this.$inference;
        }
        
        public SubLObject getField6() {
            return this.$result;
        }
        
        public SubLObject getField7() {
            return this.$test_runstate;
        }
        
        public SubLObject getField8() {
            return this.$run_status;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$query_spec = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$inference = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$result = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$test_runstate = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$run_status = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX32779_native.class, $ic252$, $ic253$, $ic254$, $ic255$, new String[] { "$id", "$lock", "$query_spec", "$inference", "$result", "$test_runstate", "$run_status" }, $ic256$, $ic257$, $ic258$);
        }
    }
    
    public static final class $f29719$UnaryFunction extends UnaryFunction
    {
        public $f29719$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#32780"));
        }
        
        public SubLObject processItem(final SubLObject var38) {
            return f29719(var38);
        }
    }
    
    public static final class $sX32781_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $test_spec;
        public SubLObject $result;
        public SubLObject $query_runstate;
        public SubLObject $test_set_runstate;
        public SubLObject $run_status;
        public SubLObject $start;
        public SubLObject $end;
        public static final SubLStructDeclNative structDecl;
        
        public $sX32781_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$test_spec = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$query_runstate = (SubLObject)CommonSymbols.NIL;
            this.$test_set_runstate = (SubLObject)CommonSymbols.NIL;
            this.$run_status = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$lock;
        }
        
        public SubLObject getField4() {
            return this.$test_spec;
        }
        
        public SubLObject getField5() {
            return this.$result;
        }
        
        public SubLObject getField6() {
            return this.$query_runstate;
        }
        
        public SubLObject getField7() {
            return this.$test_set_runstate;
        }
        
        public SubLObject getField8() {
            return this.$run_status;
        }
        
        public SubLObject getField9() {
            return this.$start;
        }
        
        public SubLObject getField10() {
            return this.$end;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$test_spec = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$result = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$query_runstate = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$test_set_runstate = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$run_status = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$start = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$end = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX32781_native.class, $ic292$, $ic287$, $ic293$, $ic294$, new String[] { "$id", "$lock", "$test_spec", "$result", "$query_runstate", "$test_set_runstate", "$run_status", "$start", "$end" }, $ic295$, $ic296$, $ic258$);
        }
    }
    
    public static final class $f29714$UnaryFunction extends UnaryFunction
    {
        public $f29714$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#32782"));
        }
        
        public SubLObject processItem(final SubLObject var38) {
            return f29714(var38);
        }
    }
    
    public static final class $sX32783_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $lock;
        public SubLObject $test_set;
        public SubLObject $result;
        public SubLObject $test_runstates;
        public SubLObject $run_status;
        public SubLObject $start;
        public SubLObject $end;
        public static final SubLStructDeclNative structDecl;
        
        public $sX32783_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$test_set = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$test_runstates = (SubLObject)CommonSymbols.NIL;
            this.$run_status = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$end = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$lock;
        }
        
        public SubLObject getField4() {
            return this.$test_set;
        }
        
        public SubLObject getField5() {
            return this.$result;
        }
        
        public SubLObject getField6() {
            return this.$test_runstates;
        }
        
        public SubLObject getField7() {
            return this.$run_status;
        }
        
        public SubLObject getField8() {
            return this.$start;
        }
        
        public SubLObject getField9() {
            return this.$end;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$test_set = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$result = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$test_runstates = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$run_status = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$start = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$end = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX32783_native.class, $ic326$, $ic323$, $ic327$, $ic328$, new String[] { "$id", "$lock", "$test_set", "$result", "$test_runstates", "$run_status", "$start", "$end" }, $ic329$, $ic330$, $ic258$);
        }
    }
    
    public static final class $f29729$UnaryFunction extends UnaryFunction
    {
        public $f29729$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#32784"));
        }
        
        public SubLObject processItem(final SubLObject var38) {
            return f29729(var38);
        }
    }
    
    public static final class $f29991$ZeroArityFunction extends ZeroArityFunction
    {
        public $f29991$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#32787"));
        }
        
        public SubLObject processItem() {
            return f29991();
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 4133 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/