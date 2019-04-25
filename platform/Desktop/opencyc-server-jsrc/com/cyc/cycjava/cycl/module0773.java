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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0773 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0773";
    public static final String myFingerPrint = "870cefb4989441c21dd503211af0da26561ff4bc8af969c0bf96f5a51a6e43ce";
    private static SubLSymbol $g6169$;
    private static SubLSymbol $g6170$;
    private static SubLSymbol $g6171$;
    private static SubLSymbol $g6172$;
    private static SubLSymbol $g6173$;
    private static SubLSymbol $g6174$;
    public static SubLSymbol $g6175$;
    public static SubLSymbol $g6176$;
    public static SubLSymbol $g6177$;
    private static SubLSymbol $g6178$;
    private static SubLSymbol $g6179$;
    private static SubLSymbol $g6180$;
    private static SubLSymbol $g6181$;
    private static SubLSymbol $g6182$;
    private static SubLSymbol $g6183$;
    private static SubLSymbol $g6184$;
    private static SubLSymbol $g6185$;
    private static SubLSymbol $g6186$;
    private static SubLSymbol $g6187$;
    public static SubLSymbol $g6188$;
    public static SubLSymbol $g6189$;
    private static SubLSymbol $g6190$;
    private static SubLSymbol $g6191$;
    public static SubLSymbol $g6192$;
    public static SubLSymbol $g6193$;
    private static SubLSymbol $g6194$;
    private static SubLSymbol $g6195$;
    private static SubLSymbol $g6196$;
    public static SubLSymbol $g6197$;
    private static SubLSymbol $g6198$;
    private static SubLSymbol $g6199$;
    private static SubLSymbol $g6200$;
    public static SubLSymbol $g6201$;
    public static SubLSymbol $g6202$;
    private static SubLSymbol $g6203$;
    public static SubLSymbol $g6204$;
    private static SubLSymbol $g6205$;
    private static SubLSymbol $g6206$;
    private static SubLSymbol $g6207$;
    public static SubLSymbol $g6208$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLInteger $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
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
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLList $ic58$;
    private static final SubLList $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
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
    private static final SubLString $ic86$;
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
    private static final SubLString $ic100$;
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
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLList $ic125$;
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
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLList $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLObject $ic178$;
    private static final SubLList $ic179$;
    private static final SubLList $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLObject $ic183$;
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
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLList $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLString $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLList $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLList $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLObject $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLString $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLString $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLString $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLString $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLString $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLString $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLSymbol $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLString $ic244$;
    private static final SubLString $ic245$;
    private static final SubLString $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLList $ic253$;
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
    private static final SubLString $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLList $ic266$;
    private static final SubLObject $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLObject $ic269$;
    private static final SubLObject $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLObject $ic272$;
    private static final SubLList $ic273$;
    private static final SubLObject $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLList $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLList $ic278$;
    private static final SubLList $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLList $ic281$;
    private static final SubLObject $ic282$;
    private static final SubLList $ic283$;
    private static final SubLList $ic284$;
    private static final SubLObject $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLList $ic287$;
    private static final SubLList $ic288$;
    private static final SubLString $ic289$;
    private static final SubLList $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLObject $ic292$;
    private static final SubLList $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLObject $ic296$;
    private static final SubLObject $ic297$;
    private static final SubLSymbol $ic298$;
    private static final SubLSymbol $ic299$;
    private static final SubLSymbol $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLObject $ic303$;
    private static final SubLList $ic304$;
    private static final SubLList $ic305$;
    private static final SubLString $ic306$;
    private static final SubLString $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLObject $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLObject $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLString $ic321$;
    private static final SubLString $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLString $ic326$;
    private static final SubLString $ic327$;
    private static final SubLString $ic328$;
    private static final SubLSymbol $ic329$;
    private static final SubLString $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLString $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLString $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLString $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLList $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLString $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLSymbol $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLSymbol $ic350$;
    private static final SubLSymbol $ic351$;
    private static final SubLString $ic352$;
    private static final SubLSymbol $ic353$;
    private static final SubLString $ic354$;
    private static final SubLString $ic355$;
    private static final SubLSymbol $ic356$;
    private static final SubLString $ic357$;
    private static final SubLSymbol $ic358$;
    private static final SubLSymbol $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLString $ic364$;
    private static final SubLString $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLString $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLString $ic370$;
    private static final SubLString $ic371$;
    private static final SubLString $ic372$;
    private static final SubLObject $ic373$;
    private static final SubLString $ic374$;
    private static final SubLString $ic375$;
    private static final SubLString $ic376$;
    private static final SubLString $ic377$;
    private static final SubLObject $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLList $ic380$;
    private static final SubLString $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLList $ic383$;
    private static final SubLList $ic384$;
    private static final SubLString $ic385$;
    private static final SubLString $ic386$;
    private static final SubLString $ic387$;
    private static final SubLList $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLSymbol $ic390$;
    private static final SubLSymbol $ic391$;
    private static final SubLList $ic392$;
    private static final SubLObject $ic393$;
    private static final SubLList $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLSymbol $ic397$;
    private static final SubLList $ic398$;
    private static final SubLSymbol $ic399$;
    private static final SubLObject $ic400$;
    private static final SubLList $ic401$;
    private static final SubLObject $ic402$;
    private static final SubLObject $ic403$;
    private static final SubLList $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLList $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLSymbol $ic408$;
    private static final SubLList $ic409$;
    private static final SubLList $ic410$;
    private static final SubLList $ic411$;
    private static final SubLSymbol $ic412$;
    private static final SubLSymbol $ic413$;
    private static final SubLList $ic414$;
    private static final SubLSymbol $ic415$;
    private static final SubLList $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLObject $ic419$;
    private static final SubLSymbol $ic420$;
    private static final SubLString $ic421$;
    private static final SubLString $ic422$;
    private static final SubLString $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLString $ic425$;
    private static final SubLString $ic426$;
    private static final SubLString $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLSymbol $ic429$;
    private static final SubLString $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLList $ic432$;
    private static final SubLList $ic433$;
    private static final SubLString $ic434$;
    private static final SubLString $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLSymbol $ic438$;
    private static final SubLSymbol $ic439$;
    private static final SubLSymbol $ic440$;
    private static final SubLSymbol $ic441$;
    private static final SubLSymbol $ic442$;
    private static final SubLString $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLString $ic445$;
    private static final SubLSymbol $ic446$;
    private static final SubLString $ic447$;
    private static final SubLString $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLString $ic450$;
    private static final SubLString $ic451$;
    private static final SubLString $ic452$;
    private static final SubLSymbol $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLSymbol $ic455$;
    private static final SubLString $ic456$;
    private static final SubLString $ic457$;
    private static final SubLString $ic458$;
    private static final SubLString $ic459$;
    private static final SubLString $ic460$;
    private static final SubLString $ic461$;
    private static final SubLString $ic462$;
    private static final SubLString $ic463$;
    private static final SubLString $ic464$;
    private static final SubLSymbol $ic465$;
    private static final SubLSymbol $ic466$;
    private static final SubLObject $ic467$;
    private static final SubLObject $ic468$;
    private static final SubLObject $ic469$;
    private static final SubLSymbol $ic470$;
    private static final SubLSymbol $ic471$;
    private static final SubLSymbol $ic472$;
    private static final SubLSymbol $ic473$;
    private static final SubLList $ic474$;
    private static final SubLObject $ic475$;
    private static final SubLList $ic476$;
    private static final SubLList $ic477$;
    private static final SubLString $ic478$;
    private static final SubLString $ic479$;
    private static final SubLString $ic480$;
    private static final SubLString $ic481$;
    private static final SubLString $ic482$;
    private static final SubLString $ic483$;
    private static final SubLSymbol $ic484$;
    private static final SubLSymbol $ic485$;
    private static final SubLObject $ic486$;
    private static final SubLObject $ic487$;
    private static final SubLObject $ic488$;
    private static final SubLObject $ic489$;
    private static final SubLList $ic490$;
    private static final SubLString $ic491$;
    private static final SubLString $ic492$;
    private static final SubLList $ic493$;
    private static final SubLString $ic494$;
    private static final SubLList $ic495$;
    private static final SubLSymbol $ic496$;
    private static final SubLSymbol $ic497$;
    private static final SubLString $ic498$;
    private static final SubLSymbol $ic499$;
    private static final SubLObject $ic500$;
    private static final SubLObject $ic501$;
    private static final SubLList $ic502$;
    private static final SubLSymbol $ic503$;
    private static final SubLSymbol $ic504$;
    private static final SubLSymbol $ic505$;
    private static final SubLList $ic506$;
    private static final SubLObject $ic507$;
    private static final SubLList $ic508$;
    private static final SubLSymbol $ic509$;
    private static final SubLObject $ic510$;
    private static final SubLList $ic511$;
    private static final SubLList $ic512$;
    private static final SubLSymbol $ic513$;
    private static final SubLObject $ic514$;
    private static final SubLList $ic515$;
    private static final SubLSymbol $ic516$;
    private static final SubLObject $ic517$;
    private static final SubLList $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLObject $ic520$;
    private static final SubLList $ic521$;
    private static final SubLSymbol $ic522$;
    private static final SubLObject $ic523$;
    private static final SubLList $ic524$;
    private static final SubLString $ic525$;
    private static final SubLString $ic526$;
    private static final SubLString $ic527$;
    private static final SubLSymbol $ic528$;
    private static final SubLSymbol $ic529$;
    private static final SubLString $ic530$;
    private static final SubLString $ic531$;
    private static final SubLSymbol $ic532$;
    private static final SubLSymbol $ic533$;
    private static final SubLSymbol $ic534$;
    private static final SubLSymbol $ic535$;
    private static final SubLInteger $ic536$;
    private static final SubLObject $ic537$;
    private static final SubLObject $ic538$;
    private static final SubLObject $ic539$;
    private static final SubLObject $ic540$;
    private static final SubLObject $ic541$;
    private static final SubLString $ic542$;
    private static final SubLSymbol $ic543$;
    private static final SubLSymbol $ic544$;
    private static final SubLList $ic545$;
    private static final SubLSymbol $ic546$;
    private static final SubLList $ic547$;
    private static final SubLSymbol $ic548$;
    private static final SubLObject $ic549$;
    
    
    public static SubLObject f49257() {
        return module0015.$g489$.getGlobalValue();
    }
    
    public static SubLObject f49258() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (NIL != $g6187$.getDynamicValue(var1)) ? $g6187$.getDynamicValue(var1) : $ic10$;
    }
    
    public static SubLObject f49259(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f49260(var2);
        final SubLObject var5 = f49261(var2);
        if (var4.equal($g6175$.getDynamicValue(var3))) {
            return (SubLObject)makeBoolean(NIL == f49262(var5));
        }
        if (var4.equal($g6177$.getDynamicValue(var3))) {
            return (SubLObject)makeBoolean(NIL == f49263(var5));
        }
        if (var4.equal($g6176$.getDynamicValue(var3))) {
            return (SubLObject)makeBoolean(NIL == f49264(var5));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49265(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        var6 = module0035.f2063(var6, (SubLObject)$ic12$, f49266(var4), (SubLObject)UNPROVIDED);
        var6 = module0035.f2063(var6, (SubLObject)$ic13$, f49267(var4), (SubLObject)UNPROVIDED);
        var6 = module0035.f2063(var6, (SubLObject)$ic14$, module0579.$g4260$.getDynamicValue(var5), (SubLObject)UNPROVIDED);
        var6 = module0035.f2063(var6, (SubLObject)$ic15$, $g6188$.getDynamicValue(var5), (SubLObject)UNPROVIDED);
        return var6;
    }
    
    public static SubLObject f49268(final SubLObject var6, final SubLObject var7) {
        f49269(var6, var7, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49270(final SubLObject var6) {
        return (SubLObject)((var6.getClass() == $sX53712_native.class) ? T : NIL);
    }
    
    public static SubLObject f49271(final SubLObject var6) {
        assert NIL != f49270(var6) : var6;
        return var6.getField2();
    }
    
    public static SubLObject f49272(final SubLObject var6) {
        assert NIL != f49270(var6) : var6;
        return var6.getField3();
    }
    
    public static SubLObject f49273(final SubLObject var6) {
        assert NIL != f49270(var6) : var6;
        return var6.getField4();
    }
    
    public static SubLObject f49274(final SubLObject var6) {
        assert NIL != f49270(var6) : var6;
        return var6.getField5();
    }
    
    public static SubLObject f49275(final SubLObject var6) {
        assert NIL != f49270(var6) : var6;
        return var6.getField6();
    }
    
    public static SubLObject f49276(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49270(var6) : var6;
        return var6.setField2(var9);
    }
    
    public static SubLObject f49277(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49270(var6) : var6;
        return var6.setField3(var9);
    }
    
    public static SubLObject f49278(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49270(var6) : var6;
        return var6.setField4(var9);
    }
    
    public static SubLObject f49279(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49270(var6) : var6;
        return var6.setField5(var9);
    }
    
    public static SubLObject f49280(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49270(var6) : var6;
        return var6.setField6(var9);
    }
    
    public static SubLObject f49281(SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = (SubLObject)new $sX53712_native();
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var12 = (SubLObject)NIL, var12 = var10; NIL != var12; var12 = conses_high.cddr(var12)) {
            var13 = var12.first();
            var14 = conses_high.cadr(var12);
            var15 = var13;
            if (var15.eql((SubLObject)$ic35$)) {
                f49276(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic12$)) {
                f49277(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic13$)) {
                f49278(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic36$)) {
                f49279(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic37$)) {
                f49280(var11, var14);
            }
            else {
                Errors.error((SubLObject)$ic38$, var13);
            }
        }
        return var11;
    }
    
    public static SubLObject f49282(final SubLObject var16, final SubLObject var17) {
        Functions.funcall(var17, var16, (SubLObject)$ic39$, (SubLObject)$ic40$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic35$, f49271(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic12$, f49272(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic13$, f49273(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic36$, f49274(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic37$, f49275(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic42$, (SubLObject)$ic40$, (SubLObject)FIVE_INTEGER);
        return var16;
    }
    
    public static SubLObject f49283(final SubLObject var16, final SubLObject var17) {
        return f49282(var16, var17);
    }
    
    public static SubLObject f49284(final SubLObject var18) {
        return (SubLObject)makeBoolean(NIL != f49270(var18) && f49271(var18).isInteger());
    }
    
    public static SubLObject f49269(final SubLObject var4, final SubLObject var7, final SubLObject var19) {
        assert NIL != f49270(var4) : var4;
        streams_high.write_string((SubLObject)$ic44$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f49271(var4), var7);
        streams_high.write_string((SubLObject)$ic45$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f49272(var4), var7);
        streams_high.write_string((SubLObject)$ic46$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49285() {
        return $g6190$.getGlobalValue();
    }
    
    public static SubLObject f49286() {
        final SubLObject var20 = f49285();
        return module0065.f4746(var20);
    }
    
    public static SubLObject f49287(final SubLObject var21) {
        assert NIL != Types.integerp(var21) : var21;
        return module0065.f4750(f49285(), var21, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49288(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic49$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic49$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic49$);
        var28 = var25.first();
        var25 = var25.rest();
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = var25;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var30_31 = (SubLObject)NIL;
        while (NIL != var30) {
            cdestructuring_bind.destructuring_bind_must_consp(var30, var24, (SubLObject)$ic49$);
            var30_31 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var24, (SubLObject)$ic49$);
            if (NIL == conses_high.member(var30_31, (SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var31 = (SubLObject)T;
            }
            if (var30_31 == $ic51$) {
                var29 = var30.first();
            }
            var30 = var30.rest();
        }
        if (NIL != var31 && NIL == var29) {
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic49$);
        }
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic52$, var25);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : $ic53$);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var25);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        final SubLObject var36;
        var25 = (var36 = var26);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic55$, (SubLObject)ConsesLow.list(var33, var27, (SubLObject)ConsesLow.list((SubLObject)$ic56$, var28), (SubLObject)$ic54$, var35), (SubLObject)ConsesLow.list((SubLObject)$ic57$, var33), ConsesLow.append(var36, (SubLObject)NIL));
    }
    
    public static SubLObject f49289(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic58$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic58$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic58$);
        var28 = var25.first();
        var25 = var25.rest();
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = var25;
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var44_45 = (SubLObject)NIL;
        while (NIL != var30) {
            cdestructuring_bind.destructuring_bind_must_consp(var30, var24, (SubLObject)$ic58$);
            var44_45 = var30.first();
            var30 = var30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var30, var24, (SubLObject)$ic58$);
            if (NIL == conses_high.member(var44_45, (SubLObject)$ic59$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var31 = (SubLObject)T;
            }
            if (var44_45 == $ic51$) {
                var29 = var30.first();
            }
            var30 = var30.rest();
        }
        if (NIL != var31 && NIL == var29) {
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic58$);
        }
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var25);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        final SubLObject var34;
        var25 = (var34 = var26);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic60$, (SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var28), var33), ConsesLow.append(var34, (SubLObject)NIL));
    }
    
    public static SubLObject f49290() {
        final SubLObject var47 = f49286();
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        for (var48 = (SubLObject)MINUS_ONE_INTEGER, var49 = (SubLObject)NIL, var49 = var47; !var49.numLE(var48); var49 = Numbers.add(var49, (SubLObject)MINUS_ONE_INTEGER)) {
            var50 = f49287(var49);
            if (NIL != var50) {
                return var50;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49291(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic62$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic62$);
        var27 = var25.first();
        var25 = var25.rest();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = var25;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var57_58 = (SubLObject)NIL;
        while (NIL != var29) {
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)$ic62$);
            var57_58 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var24, (SubLObject)$ic62$);
            if (NIL == conses_high.member(var57_58, (SubLObject)$ic63$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var30 = (SubLObject)T;
            }
            if (var57_58 == $ic51$) {
                var28 = var29.first();
            }
            var29 = var29.rest();
        }
        if (NIL != var30 && NIL == var28) {
            cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic62$);
        }
        final SubLObject var31 = cdestructuring_bind.property_list_member((SubLObject)$ic35$, var25);
        final SubLObject var32 = (SubLObject)((NIL != var31) ? conses_high.cadr(var31) : $ic64$);
        final SubLObject var33 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var25);
        final SubLObject var34 = (SubLObject)((NIL != var33) ? conses_high.cadr(var33) : NIL);
        final SubLObject var35;
        var25 = (var35 = var26);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic55$, (SubLObject)ConsesLow.list(var32, var27, (SubLObject)$ic65$, (SubLObject)$ic54$, var34), (SubLObject)ConsesLow.list((SubLObject)$ic57$, var32), ConsesLow.append(var35, (SubLObject)NIL));
    }
    
    public static SubLObject f49292(SubLObject var62, SubLObject var63) {
        if (var62 == UNPROVIDED) {
            var62 = (SubLObject)NIL;
        }
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)NIL;
        }
        if (NIL != var62 && !areAssertionsDisabledFor(me) && NIL == module0366.f24916(var62)) {
            throw new AssertionError(var62);
        }
        final SubLObject var64 = f49286();
        final SubLObject var65 = f49281((SubLObject)ConsesLow.list(new SubLObject[] { $ic35$, var64, $ic12$, var62, $ic13$, var63, $ic36$, module0065.f4745((SubLObject)ZERO_INTEGER, $g6191$.getGlobalValue()), $ic37$, NIL }));
        f49293(var65);
        module0065.f4753(f49285(), var64, var65);
        f49294(var65, (SubLObject)UNPROVIDED);
        return var65;
    }
    
    public static SubLObject f49295(final SubLObject var4) {
        assert NIL != f49270(var4) : var4;
        if (NIL != f49284(var4)) {
            final SubLObject var5 = f49296(var4);
            try {
                f49297(var4);
                final SubLObject var6 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    module0065.f4761(f49285(), var5);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var6);
                }
            }
            finally {
                final SubLObject var7 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    module0065.f4761(f49285(), var5);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var7);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49298() {
        SubLObject var65 = (SubLObject)NIL;
        final SubLObject var67;
        final SubLObject var66 = var67 = module0065.f4743(f49285());
        SubLObject var68 = (SubLObject)NIL;
        try {
            var68 = Locks.seize_lock(var67);
            final SubLObject var69 = f49285();
            if (NIL == module0065.f4772(var69, (SubLObject)$ic67$)) {
                final SubLObject var70_71 = var69;
                if (NIL == module0065.f4775(var70_71, (SubLObject)$ic67$)) {
                    final SubLObject var70 = module0065.f4740(var70_71);
                    final SubLObject var71 = (SubLObject)NIL;
                    SubLObject var72;
                    SubLObject var73;
                    SubLObject var74;
                    SubLObject var75;
                    for (var72 = Sequences.length(var70), var73 = (SubLObject)NIL, var73 = (SubLObject)ZERO_INTEGER; var73.numL(var72); var73 = Numbers.add(var73, (SubLObject)ONE_INTEGER)) {
                        var74 = ((NIL != var71) ? Numbers.subtract(var72, var73, (SubLObject)ONE_INTEGER) : var73);
                        var75 = Vectors.aref(var70, var74);
                        if (NIL == module0065.f4749(var75) || NIL == module0065.f4773((SubLObject)$ic67$)) {
                            if (NIL != module0065.f4749(var75)) {
                                var75 = (SubLObject)$ic67$;
                            }
                            var65 = (SubLObject)ConsesLow.cons(var75, var65);
                        }
                    }
                }
                final SubLObject var76_77 = var69;
                if (NIL == module0065.f4777(var76_77)) {
                    final SubLObject var76 = module0065.f4738(var76_77);
                    SubLObject var77 = (SubLObject)NIL;
                    SubLObject var78 = (SubLObject)NIL;
                    final Iterator var79 = Hashtables.getEntrySetIterator(var76);
                    try {
                        while (Hashtables.iteratorHasNext(var79)) {
                            final Map.Entry var80 = Hashtables.iteratorNextEntry(var79);
                            var77 = Hashtables.getEntryKey(var80);
                            var78 = Hashtables.getEntryValue(var80);
                            var65 = (SubLObject)ConsesLow.cons(var78, var65);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var79);
                    }
                }
            }
            SubLObject var81 = var65;
            SubLObject var82 = (SubLObject)NIL;
            var82 = var81.first();
            while (NIL != var81) {
                f49295(var82);
                var81 = var81.rest();
                var82 = var81.first();
            }
            module0065.f4762(f49285());
        }
        finally {
            if (NIL != var68) {
                Locks.release_lock(var67);
            }
        }
        return Sequences.length(var65);
    }
    
    public static SubLObject f49297(final SubLObject var4) {
        final SubLObject var5 = f49299(var4);
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var8;
        final SubLObject var7 = var8 = module0065.f4743(var5);
        SubLObject var9 = (SubLObject)NIL;
        try {
            var9 = Locks.seize_lock(var8);
            final SubLObject var10 = var5;
            if (NIL == module0065.f4772(var10, (SubLObject)$ic67$)) {
                final SubLObject var70_85 = var10;
                if (NIL == module0065.f4775(var70_85, (SubLObject)$ic67$)) {
                    final SubLObject var11 = module0065.f4740(var70_85);
                    final SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    SubLObject var16;
                    for (var13 = Sequences.length(var11), var14 = (SubLObject)NIL, var14 = (SubLObject)ZERO_INTEGER; var14.numL(var13); var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER)) {
                        var15 = ((NIL != var12) ? Numbers.subtract(var13, var14, (SubLObject)ONE_INTEGER) : var14);
                        var16 = Vectors.aref(var11, var15);
                        if (NIL == module0065.f4749(var16) || NIL == module0065.f4773((SubLObject)$ic67$)) {
                            if (NIL != module0065.f4749(var16)) {
                                var16 = (SubLObject)$ic67$;
                            }
                            var6 = (SubLObject)ConsesLow.cons(var16, var6);
                        }
                    }
                }
                final SubLObject var76_86 = var10;
                if (NIL == module0065.f4777(var76_86)) {
                    final SubLObject var17 = module0065.f4738(var76_86);
                    SubLObject var18 = (SubLObject)NIL;
                    SubLObject var19 = (SubLObject)NIL;
                    final Iterator var20 = Hashtables.getEntrySetIterator(var17);
                    try {
                        while (Hashtables.iteratorHasNext(var20)) {
                            final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                            var18 = Hashtables.getEntryKey(var21);
                            var19 = Hashtables.getEntryValue(var21);
                            var6 = (SubLObject)ConsesLow.cons(var19, var6);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var20);
                    }
                }
            }
            SubLObject var22 = var6;
            SubLObject var23 = (SubLObject)NIL;
            var23 = var22.first();
            while (NIL != var22) {
                f49300(var23);
                var22 = var22.rest();
                var23 = var22.first();
            }
            module0065.f4762(var5);
        }
        finally {
            if (NIL != var9) {
                Locks.release_lock(var8);
            }
        }
        f49279(var4, (SubLObject)$ic68$);
        f49276(var4, (SubLObject)$ic68$);
        f49277(var4, (SubLObject)$ic68$);
        f49278(var4, (SubLObject)$ic68$);
        f49301(var4);
        f49280(var4, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49302(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic69$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic69$);
        var27 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var28;
            var25 = (var28 = var26);
            final SubLObject var29 = (SubLObject)$ic70$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var29, (SubLObject)ConsesLow.list((SubLObject)$ic72$, var27))), (SubLObject)ConsesLow.listS((SubLObject)$ic73$, (SubLObject)ConsesLow.list(var29), ConsesLow.append(var28, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic69$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49303(final SubLObject var4) {
        SubLObject var5 = module0034.f1881();
        if (NIL == module0034.f1839(var5)) {
            var5 = f49304(var4);
        }
        return var5;
    }
    
    public static SubLObject f49304(final SubLObject var4) {
        SubLObject var5 = f49305(var4);
        if (NIL == module0034.f1839(var5)) {
            var5 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f49306(var4, var5);
        }
        return var5;
    }
    
    public static SubLObject f49305(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49306(final SubLObject var4, final SubLObject var91) {
        return f49308(var4, (SubLObject)$ic75$, var91);
    }
    
    public static SubLObject f49309(final SubLObject var21) {
        assert NIL != Types.integerp(var21) : var21;
        final SubLObject var22 = f49287(var21);
        if (NIL != f49270(var22)) {
            f49301(var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49301(final SubLObject var4) {
        final SubLObject var5 = f49305(var4);
        if (NIL != module0034.f1839(var5)) {
            module0034.f1891(var5);
        }
        return var4;
    }
    
    public static SubLObject f49296(final SubLObject var4) {
        assert NIL != f49270(var4) : var4;
        return f49271(var4);
    }
    
    public static SubLObject f49299(final SubLObject var4) {
        assert NIL != f49270(var4) : var4;
        return f49274(var4);
    }
    
    public static SubLObject f49266(final SubLObject var4) {
        assert NIL != f49270(var4) : var4;
        return f49272(var4);
    }
    
    public static SubLObject f49267(final SubLObject var4) {
        assert NIL != f49270(var4) : var4;
        return f49273(var4);
    }
    
    public static SubLObject f49310(final SubLObject var4) {
        assert NIL != f49270(var4) : var4;
        return Sort.sort(module0065.f4796(f49274(var4)), (SubLObject)$ic77$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49311(final SubLObject var4) {
        assert NIL != f49270(var4) : var4;
        return f49307(var4, (SubLObject)$ic78$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49312(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49313(final SubLObject var4, final SubLObject var92) {
        final SubLObject var93 = f49307(var4, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
        if (NIL == module0004.f104(module0775.f49708(var92), var93, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic80$))) {
            f49308(var4, (SubLObject)$ic79$, module0035.f2083(var92, var93));
        }
        return var4;
    }
    
    public static SubLObject f49314(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic81$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49315(final SubLObject var4, final SubLObject var94) {
        return f49308(var4, (SubLObject)$ic81$, var94);
    }
    
    public static SubLObject f49316(final SubLObject var4, final SubLObject var95) {
        if (NIL == f49317(var95)) {
            return (SubLObject)NIL;
        }
        final SubLObject var96 = f49314(var4);
        final SubLObject var97 = (SubLObject)((NIL != module0067.f4852(var96)) ? module0067.f4884(var96, var95, (SubLObject)NIL) : NIL);
        final SubLObject var98 = (SubLObject)((NIL != module0769.f49038(var97)) ? module0769.f49034(var97) : NIL);
        return var98;
    }
    
    public static SubLObject f49318(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic82$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49319(final SubLObject var4, final SubLObject var98) {
        assert NIL != module0057.f4158(var98) : var98;
        return f49308(var4, (SubLObject)$ic82$, var98);
    }
    
    public static SubLObject f49320(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic84$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49321(final SubLObject var4, final SubLObject var99, SubLObject var100) {
        if (var100 == UNPROVIDED) {
            var100 = (SubLObject)$ic85$;
        }
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (NIL != $g6192$.getDynamicValue(var101)) {
            Errors.sublisp_break((SubLObject)$ic86$, new SubLObject[] { var99, var100 });
        }
        SubLObject var102 = f49320(var4);
        if (NIL == var102) {
            var102 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f49308(var4, (SubLObject)$ic84$, var102);
        }
        return module0084.f5765(var102, var100, var99, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49322(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return f49307(var4, (SubLObject)$ic87$, module0579.$g4283$.getDynamicValue(var5));
    }
    
    public static SubLObject f49323(final SubLObject var4, final SubLObject var102) {
        assert NIL != module0206.f13444(var102) : var102;
        return f49308(var4, (SubLObject)$ic87$, var102);
    }
    
    public static SubLObject f49263(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic89$, (SubLObject)T);
    }
    
    public static SubLObject f49324(final SubLObject var4, final SubLObject var103) {
        assert NIL != Types.booleanp(var103) : var103;
        return f49308(var4, (SubLObject)$ic89$, var103);
    }
    
    public static SubLObject f49325(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic91$, (SubLObject)T);
    }
    
    public static SubLObject f49326(final SubLObject var4, final SubLObject var104) {
        assert NIL != Types.booleanp(var104) : var104;
        return f49308(var4, (SubLObject)$ic91$, var104);
    }
    
    public static SubLObject f49262(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic92$, (SubLObject)T);
    }
    
    public static SubLObject f49327(final SubLObject var4, final SubLObject var105) {
        assert NIL != Types.booleanp(var105) : var105;
        return f49308(var4, (SubLObject)$ic92$, var105);
    }
    
    public static SubLObject f49264(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic93$, (SubLObject)T);
    }
    
    public static SubLObject f49328(final SubLObject var4, final SubLObject var106) {
        assert NIL != Types.booleanp(var106) : var106;
        return f49308(var4, (SubLObject)$ic93$, var106);
    }
    
    public static SubLObject f49329(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic94$, (SubLObject)NIL);
    }
    
    public static SubLObject f49330(final SubLObject var4, final SubLObject var107) {
        assert NIL != Types.booleanp(var107) : var107;
        return f49308(var4, (SubLObject)$ic94$, var107);
    }
    
    public static SubLObject f49331(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic95$, (SubLObject)T);
    }
    
    public static SubLObject f49332(final SubLObject var4, final SubLObject var108) {
        assert NIL != Types.booleanp(var108) : var108;
        return f49308(var4, (SubLObject)$ic95$, var108);
    }
    
    public static SubLObject f49333(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic96$, (SubLObject)T);
    }
    
    public static SubLObject f49334(final SubLObject var4) {
        final SubLObject var5 = f49333(var4);
        return module0035.sublisp_boolean(var5);
    }
    
    public static SubLObject f49335(final SubLObject var110) {
        return (SubLObject)makeBoolean(NIL != Types.booleanp(var110) || var110.eql((SubLObject)$ic97$));
    }
    
    public static SubLObject f49336(final SubLObject var4, final SubLObject var111) {
        assert NIL != f49335(var111) : var111;
        return f49308(var4, (SubLObject)$ic96$, var111);
    }
    
    public static SubLObject f49337(final SubLObject var2) {
        final SubLObject var3 = f49261(var2);
        final SubLObject var4 = f49333(var3);
        return (SubLObject)makeBoolean(NIL != module0035.sublisp_boolean(var4) && (!var4.eql((SubLObject)$ic97$) || NIL != f49338(var2, f49339(var3))));
    }
    
    public static SubLObject f49340(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic99$, (SubLObject)NIL);
    }
    
    public static SubLObject f49341(final SubLObject var4, final SubLObject var112) {
        assert NIL != Types.booleanp(var112) : var112;
        return f49308(var4, (SubLObject)$ic99$, var112);
    }
    
    public static SubLObject f49342(final SubLObject var4) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49343(final SubLObject var4, final SubLObject var113) {
        assert NIL != Types.booleanp(var113) : var113;
        if (NIL != var113) {
            Errors.error((SubLObject)$ic100$);
            return (SubLObject)NIL;
        }
        return var4;
    }
    
    public static SubLObject f49344(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic101$, (SubLObject)NIL);
    }
    
    public static SubLObject f49345(final SubLObject var4, final SubLObject var114) {
        assert NIL != Types.booleanp(var114) : var114;
        return f49308(var4, (SubLObject)$ic101$, var114);
    }
    
    public static SubLObject f49346(final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != f49344(var4) || NIL != f49307(var4, (SubLObject)$ic102$, (SubLObject)NIL));
    }
    
    public static SubLObject f49347(final SubLObject var4, final SubLObject var115) {
        assert NIL != Types.booleanp(var115) : var115;
        return f49308(var4, (SubLObject)$ic102$, var115);
    }
    
    public static SubLObject f49348(final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != f49344(var4) || NIL != f49307(var4, (SubLObject)$ic103$, (SubLObject)NIL));
    }
    
    public static SubLObject f49349(final SubLObject var4, final SubLObject var116) {
        assert NIL != Types.booleanp(var116) : var116;
        return f49308(var4, (SubLObject)$ic103$, var116);
    }
    
    public static SubLObject f49350(final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != f49344(var4) || NIL != f49307(var4, (SubLObject)$ic104$, (SubLObject)NIL));
    }
    
    public static SubLObject f49351(final SubLObject var4, final SubLObject var117) {
        assert NIL != Types.booleanp(var117) : var117;
        return f49308(var4, (SubLObject)$ic104$, var117);
    }
    
    public static SubLObject f49352(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic105$, (SubLObject)T);
    }
    
    public static SubLObject f49353(final SubLObject var21, final SubLObject var118) {
        f49354(f49287(var21), var118);
        return (SubLObject)T;
    }
    
    public static SubLObject f49354(final SubLObject var4, final SubLObject var118) {
        assert NIL != Types.booleanp(var118) : var118;
        return f49308(var4, (SubLObject)$ic105$, var118);
    }
    
    public static SubLObject f49355(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic107$, f49352(var4));
    }
    
    public static SubLObject f49356(final SubLObject var4, final SubLObject var119) {
        assert NIL != Types.booleanp(var119) : var119;
        return f49308(var4, (SubLObject)$ic107$, var119);
    }
    
    public static SubLObject f49357(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        return f49307(var4, (SubLObject)$ic108$, module0579.$g4260$.getDynamicValue(var5));
    }
    
    public static SubLObject f49358(final SubLObject var21, final SubLObject var120) {
        f49359(f49287(var21), var120);
        return (SubLObject)T;
    }
    
    public static SubLObject f49359(final SubLObject var4, final SubLObject var120) {
        assert NIL != module0161.f10499(var120) : var120;
        return f49308(var4, (SubLObject)$ic108$, var120);
    }
    
    public static SubLObject f49360(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL != f49361(var4, (SubLObject)$ic111$)) {
            return f49307(var4, (SubLObject)$ic111$, (SubLObject)UNPROVIDED);
        }
        final SubLObject var6 = f49267(var4);
        final SubLObject var7 = (SubLObject)((NIL != inference_datastructures_inference_oc.f25684(var6)) ? inference_datastructures_inference_oc.f25732(var6) : NIL);
        final SubLObject var8 = (SubLObject)((NIL != inference_datastructures_inference_oc.f25275(var7)) ? module0775.f49670(var7) : NIL);
        return (NIL != var8) ? module0767.f48872(var8, (SubLObject)UNPROVIDED) : module0579.$g4262$.getDynamicValue(var5);
    }
    
    public static SubLObject f49362(final SubLObject var4, final SubLObject var124) {
        assert NIL != module0161.f10499(var124) : var124;
        return f49308(var4, (SubLObject)$ic111$, var124);
    }
    
    public static SubLObject f49363(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic112$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49294(final SubLObject var4, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = Time.get_universal_time();
        }
        assert NIL != module0051.f3549(var125) : var125;
        return f49308(var4, (SubLObject)$ic112$, var125);
    }
    
    public static SubLObject f49364(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic114$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49365(final SubLObject var4, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = Time.get_universal_time();
        }
        assert NIL != module0051.f3549(var125) : var125;
        return f49308(var4, (SubLObject)$ic114$, var125);
    }
    
    public static SubLObject f49366(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic115$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49367(final SubLObject var4, SubLObject var125) {
        if (var125 == UNPROVIDED) {
            var125 = Time.get_universal_time();
        }
        assert NIL != module0051.f3549(var125) : var125;
        return f49308(var4, (SubLObject)$ic115$, var125);
    }
    
    public static SubLObject f49361(final SubLObject var4, final SubLObject var126) {
        return module0035.f2346(f49275(var4), var126);
    }
    
    public static SubLObject f49308(final SubLObject var4, final SubLObject var126, final SubLObject var127) {
        assert NIL != f49270(var4) : var4;
        assert NIL != Types.keywordp(var126) : var126;
        final SubLObject var128 = f49275(var4);
        final SubLObject var129 = conses_high.putf(var128, var126, var127);
        f49280(var4, var129);
        return var129;
    }
    
    public static SubLObject f49307(final SubLObject var4, final SubLObject var126, SubLObject var129) {
        if (var129 == UNPROVIDED) {
            var129 = (SubLObject)NIL;
        }
        assert NIL != f49270(var4) : var4;
        assert NIL != Types.keywordp(var126) : var126;
        return conses_high.getf(f49275(var4), var126, var129);
    }
    
    public static SubLObject f49368(final SubLObject var4, final SubLObject var126) {
        assert NIL != f49270(var4) : var4;
        assert NIL != Types.keywordp(var126) : var126;
        return conses_high.remf(f49275(var4), var126);
    }
    
    public static SubLObject f49369(final SubLObject var6, final SubLObject var7) {
        f49370(var6, var7, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49371(final SubLObject var6) {
        return (SubLObject)((var6.getClass() == $sX53716_native.class) ? T : NIL);
    }
    
    public static SubLObject f49372(final SubLObject var6) {
        assert NIL != f49371(var6) : var6;
        return var6.getField2();
    }
    
    public static SubLObject f49373(final SubLObject var6) {
        assert NIL != f49371(var6) : var6;
        return var6.getField3();
    }
    
    public static SubLObject f49374(final SubLObject var6) {
        assert NIL != f49371(var6) : var6;
        return var6.getField4();
    }
    
    public static SubLObject f49375(final SubLObject var6) {
        assert NIL != f49371(var6) : var6;
        return var6.getField5();
    }
    
    public static SubLObject f49376(final SubLObject var6) {
        assert NIL != f49371(var6) : var6;
        return var6.getField6();
    }
    
    public static SubLObject f49377(final SubLObject var6) {
        assert NIL != f49371(var6) : var6;
        return var6.getField7();
    }
    
    public static SubLObject f49378(final SubLObject var6) {
        assert NIL != f49371(var6) : var6;
        return var6.getField8();
    }
    
    public static SubLObject f49379(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49371(var6) : var6;
        return var6.setField2(var9);
    }
    
    public static SubLObject f49380(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49371(var6) : var6;
        return var6.setField3(var9);
    }
    
    public static SubLObject f49381(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49371(var6) : var6;
        return var6.setField4(var9);
    }
    
    public static SubLObject f49382(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49371(var6) : var6;
        return var6.setField5(var9);
    }
    
    public static SubLObject f49383(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49371(var6) : var6;
        return var6.setField6(var9);
    }
    
    public static SubLObject f49384(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49371(var6) : var6;
        return var6.setField7(var9);
    }
    
    public static SubLObject f49385(final SubLObject var6, final SubLObject var9) {
        assert NIL != f49371(var6) : var6;
        return var6.setField8(var9);
    }
    
    public static SubLObject f49386(SubLObject var10) {
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        final SubLObject var11 = (SubLObject)new $sX53716_native();
        SubLObject var12;
        SubLObject var13;
        SubLObject var14;
        SubLObject var15;
        for (var12 = (SubLObject)NIL, var12 = var10; NIL != var12; var12 = conses_high.cddr(var12)) {
            var13 = var12.first();
            var14 = conses_high.cadr(var12);
            var15 = var13;
            if (var15.eql((SubLObject)$ic35$)) {
                f49379(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic140$)) {
                f49380(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic141$)) {
                f49381(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic142$)) {
                f49382(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic143$)) {
                f49383(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic144$)) {
                f49384(var11, var14);
            }
            else if (var15.eql((SubLObject)$ic37$)) {
                f49385(var11, var14);
            }
            else {
                Errors.error((SubLObject)$ic38$, var13);
            }
        }
        return var11;
    }
    
    public static SubLObject f49387(final SubLObject var16, final SubLObject var17) {
        Functions.funcall(var17, var16, (SubLObject)$ic39$, (SubLObject)$ic145$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic35$, f49372(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic140$, f49373(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic141$, f49374(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic142$, f49375(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic143$, f49376(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic144$, f49377(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic41$, (SubLObject)$ic37$, f49378(var16));
        Functions.funcall(var17, var16, (SubLObject)$ic42$, (SubLObject)$ic145$, (SubLObject)SEVEN_INTEGER);
        return var16;
    }
    
    public static SubLObject f49388(final SubLObject var16, final SubLObject var17) {
        return f49387(var16, var17);
    }
    
    public static SubLObject f49389(final SubLObject var18) {
        return (SubLObject)makeBoolean(NIL != f49371(var18) && f49372(var18).isInteger());
    }
    
    public static SubLObject f49370(final SubLObject var133, final SubLObject var7, final SubLObject var19) {
        assert NIL != f49371(var133) : var133;
        streams_high.write_string((SubLObject)$ic147$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        PrintLow.format(var7, (SubLObject)$ic148$, f49271(f49377(var133)), f49372(var133));
        streams_high.write_string((SubLObject)$ic149$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        print_high.prin1(f49374(var133), var7);
        streams_high.write_string((SubLObject)$ic46$, var7, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49390(final SubLObject var4) {
        final SubLObject var5 = f49299(var4);
        return module0065.f4746(var5);
    }
    
    public static SubLObject f49300(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        if (NIL != f49389(var133)) {
            final SubLObject var134 = f49391(var133);
            final SubLObject var135 = f49261(var133);
            final SubLObject var136 = f49299(var135);
            try {
                f49392(var133);
            }
            finally {
                final SubLObject var137 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    module0065.f4761(var136, var134);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var137);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49392(final SubLObject var133) {
        f49379(var133, (SubLObject)$ic68$);
        f49384(var133, (SubLObject)$ic68$);
        f49380(var133, (SubLObject)$ic68$);
        f49381(var133, (SubLObject)$ic68$);
        f49382(var133, (SubLObject)$ic68$);
        f49383(var133, (SubLObject)$ic68$);
        f49385(var133, (SubLObject)$ic68$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49293(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != f49284(var4) : var4;
        final SubLObject var6 = f49390(var4);
        final SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = f49386((SubLObject)ConsesLow.list(new SubLObject[] { $ic35$, var6, $ic140$, var7, $ic144$, var4, $ic142$, $ic151$, $ic141$, $ic152$ }));
        final SubLObject var9 = f49299(var4);
        f49393(var8);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && !var6.eql($g6191$.getGlobalValue())) {
            Errors.error((SubLObject)$ic153$, var4, var6, $g6191$.getGlobalValue());
        }
        module0065.f4753(var9, var6, var8);
        return var8;
    }
    
    public static SubLObject f49394(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f49395(var4, $g6191$.getGlobalValue());
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && NIL == f49371(var6)) {
            Errors.error((SubLObject)$ic154$, var4);
        }
        return var6;
    }
    
    public static SubLObject f49396(final SubLObject var4, final SubLObject var3) {
        assert NIL != f49284(var4) : var4;
        assert NIL != Types.stringp(var3) : var3;
        final SubLObject var5 = f49397(var4, var3, (SubLObject)NIL, (SubLObject)$ic156$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        return var5;
    }
    
    public static SubLObject f49397(final SubLObject var4, final SubLObject var3, SubLObject var138, final SubLObject var139, final SubLObject var18, SubLObject var140) {
        if (var140 == UNPROVIDED) {
            var140 = (SubLObject)NIL;
        }
        final SubLThread var141 = SubLProcess.currentSubLThread();
        assert NIL != f49284(var4) : var4;
        assert NIL != Types.stringp(var3) : var3;
        if (NIL == var138) {
            var138 = f49394(var4);
        }
        assert NIL != f49371(var138) : var138;
        assert NIL != Types.symbolp(var139) : var139;
        assert NIL != module0035.f2327(var140) : var140;
        if (NIL == $g6194$.getDynamicValue(var141)) {
            final SubLObject var142 = f49398(var4, var3, var138, var139, var18, var140);
            if (var142.numG($g6195$.getDynamicValue(var141))) {
                Errors.error((SubLObject)$ic159$, var18, var142, var4);
            }
        }
        final SubLObject var143 = f49390(var4);
        final SubLObject var144 = (SubLObject)((NIL != f49371(var138)) ? f49372(var138) : NIL);
        final SubLObject var145 = f49386((SubLObject)ConsesLow.list(new SubLObject[] { $ic35$, var143, $ic140$, var144, $ic141$, var3, $ic142$, var139, $ic143$, var18, $ic144$, var4, $ic37$, var140 }));
        final SubLObject var146 = f49299(var4);
        if (NIL != f49371(var138)) {
            final SubLObject var147 = module0035.f2083(var145, f49399(var138));
            f49400(var138, var147);
        }
        module0065.f4753(var146, var143, var145);
        return var145;
    }
    
    public static SubLObject f49401(final SubLObject var4, final SubLObject var133) {
        final SubLObject var134 = f49299(var4);
        final SubLObject var135 = f49391(var133);
        module0065.f4753(var134, var135, var133);
        f49384(var133, var4);
        return var133;
    }
    
    public static SubLObject f49402(final SubLObject var4, final SubLObject var133) {
        final SubLObject var134 = f49299(var4);
        final SubLObject var135 = f49391(var133);
        final SubLObject var136 = f49403(var133);
        final SubLObject var137 = f49395(var4, var136);
        SubLObject var138 = f49399(var137);
        var138 = Sequences.delete(var133, var138, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        f49400(var137, var138);
        module0065.f4761(var134, var135);
        f49384(var133, var4);
        return var133;
    }
    
    public static SubLObject f49398(final SubLObject var4, final SubLObject var3, final SubLObject var138, final SubLObject var139, final SubLObject var18, final SubLObject var140) {
        final SubLObject var141 = f49389(var138);
        SubLObject var142 = (SubLObject)ZERO_INTEGER;
        final SubLObject var143 = f49299(var4);
        if (NIL == module0065.f4772(var143, (SubLObject)$ic67$)) {
            final SubLObject var70_148 = var143;
            if (NIL == module0065.f4775(var70_148, (SubLObject)$ic67$)) {
                final SubLObject var144 = module0065.f4740(var70_148);
                final SubLObject var145 = (SubLObject)NIL;
                SubLObject var146;
                SubLObject var147;
                SubLObject var148;
                SubLObject var149;
                SubLObject var150;
                for (var146 = Sequences.length(var144), var147 = (SubLObject)NIL, var147 = (SubLObject)ZERO_INTEGER; var147.numL(var146); var147 = Numbers.add(var147, (SubLObject)ONE_INTEGER)) {
                    var148 = ((NIL != var145) ? Numbers.subtract(var146, var147, (SubLObject)ONE_INTEGER) : var147);
                    var149 = Vectors.aref(var144, var148);
                    if (NIL == module0065.f4749(var149) || NIL == module0065.f4773((SubLObject)$ic67$)) {
                        if (NIL != module0065.f4749(var149)) {
                            var149 = (SubLObject)$ic67$;
                        }
                        var150 = f49403(var149);
                        if (var3.equal(f49260(var149)) && NIL != ((NIL != var141) ? Equality.eq(f49391(var138), var150) : Types.sublisp_null(var150)) && var139.eql(f49404(var149)) && var18.equal(f49405(var149))) {
                            var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
            }
            final SubLObject var76_150 = var143;
            if (NIL == module0065.f4777(var76_150)) {
                final SubLObject var151 = module0065.f4738(var76_150);
                SubLObject var152 = (SubLObject)NIL;
                SubLObject var153 = (SubLObject)NIL;
                final Iterator var154 = Hashtables.getEntrySetIterator(var151);
                try {
                    while (Hashtables.iteratorHasNext(var154)) {
                        final Map.Entry var155 = Hashtables.iteratorNextEntry(var154);
                        var152 = Hashtables.getEntryKey(var155);
                        var153 = Hashtables.getEntryValue(var155);
                        final SubLObject var156 = f49403(var153);
                        if (var3.equal(f49260(var153)) && NIL != ((NIL != var141) ? Equality.eq(f49391(var138), var156) : Types.sublisp_null(var156)) && var139.eql(f49404(var153)) && var18.equal(f49405(var153))) {
                            var142 = Numbers.add(var142, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var154);
                }
            }
        }
        return var142;
    }
    
    public static SubLObject f49406(final SubLObject var4, final SubLObject var18, final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        final SubLObject var140 = f49389(var138);
        SubLObject var141 = (SubLObject)NIL;
        final SubLObject var142 = f49299(var4);
        if (NIL == module0065.f4772(var142, (SubLObject)$ic67$)) {
            final SubLObject var70_152 = var142;
            if (NIL == module0065.f4775(var70_152, (SubLObject)$ic67$)) {
                final SubLObject var143 = module0065.f4740(var70_152);
                final SubLObject var144 = (SubLObject)NIL;
                final SubLObject var145 = Sequences.length(var143);
                SubLObject var147;
                final SubLObject var146 = var147 = (SubLObject)((NIL != var144) ? ConsesLow.list(Numbers.subtract(var145, (SubLObject)ONE_INTEGER), (SubLObject)MINUS_ONE_INTEGER, (SubLObject)MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)ZERO_INTEGER, var145, (SubLObject)ONE_INTEGER));
                SubLObject var148 = (SubLObject)NIL;
                SubLObject var149 = (SubLObject)NIL;
                SubLObject var150 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var147, var146, (SubLObject)$ic160$);
                var148 = var147.first();
                var147 = var147.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var147, var146, (SubLObject)$ic160$);
                var149 = var147.first();
                var147 = var147.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var147, var146, (SubLObject)$ic160$);
                var150 = var147.first();
                var147 = var147.rest();
                if (NIL == var147) {
                    if (NIL == var141) {
                        SubLObject var151;
                        SubLObject var152;
                        SubLObject var153;
                        SubLObject var154;
                        for (var151 = var149, var152 = (SubLObject)NIL, var152 = var148; NIL == var141 && NIL == module0005.f124(var152, var150, var151); var152 = Numbers.add(var152, var150)) {
                            var153 = Vectors.aref(var143, var152);
                            if (NIL == module0065.f4749(var153) || NIL == module0065.f4773((SubLObject)$ic67$)) {
                                if (NIL != module0065.f4749(var153)) {
                                    var153 = (SubLObject)$ic67$;
                                }
                                var154 = f49403(var153);
                                if (NIL != ((NIL != var140) ? Equality.eq(f49391(var138), var154) : Types.sublisp_null(var154)) && var18.equal(f49405(var153))) {
                                    var141 = (SubLObject)T;
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var146, (SubLObject)$ic160$);
                }
            }
            final SubLObject var76_158 = var142;
            if (NIL == module0065.f4777(var76_158) && NIL == var141) {
                SubLObject var155 = (SubLObject)NIL;
                try {
                    var139.throwStack.push($ic161$);
                    final SubLObject var156 = module0065.f4738(var76_158);
                    SubLObject var157 = (SubLObject)NIL;
                    SubLObject var158 = (SubLObject)NIL;
                    final Iterator var159 = Hashtables.getEntrySetIterator(var156);
                    try {
                        while (Hashtables.iteratorHasNext(var159)) {
                            final Map.Entry var160 = Hashtables.iteratorNextEntry(var159);
                            var157 = Hashtables.getEntryKey(var160);
                            var158 = Hashtables.getEntryValue(var160);
                            module0005.f153(var141);
                            final SubLObject var161 = f49403(var158);
                            if (NIL != ((NIL != var140) ? Equality.eq(f49391(var138), var161) : Types.sublisp_null(var161)) && var18.equal(f49405(var158))) {
                                var141 = (SubLObject)T;
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var159);
                    }
                }
                catch (Throwable var162) {
                    var155 = Errors.handleThrowable(var162, (SubLObject)$ic161$);
                }
                finally {
                    var139.throwStack.pop();
                }
            }
        }
        return var141;
    }
    
    public static SubLObject f49395(final SubLObject var4, final SubLObject var161) {
        assert NIL != f49284(var4) : var4;
        assert NIL != Types.integerp(var161) : var161;
        final SubLObject var162 = f49299(var4);
        return module0065.f4750(var162, var161, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49407(final SubLObject var21, final SubLObject var161) {
        assert NIL != Types.integerp(var21) : var21;
        assert NIL != Types.integerp(var161) : var161;
        final SubLObject var162 = f49287(var21);
        return (SubLObject)((NIL != f49284(var162)) ? f49395(var162, var161) : NIL);
    }
    
    public static SubLObject f49391(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return f49372(var133);
    }
    
    public static SubLObject f49403(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return f49373(var133);
    }
    
    public static SubLObject f49408(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        SubLObject var134 = (SubLObject)ConsesLow.list(f49391(var133));
        final SubLObject var135 = f49261(var133);
        SubLObject var136 = f49403(var133);
        SubLObject var137 = (SubLObject)((NIL != var136) ? f49395(var135, var136) : NIL);
        SubLObject var138 = (SubLObject)NIL;
        while (NIL != var136) {
            var134 = (SubLObject)ConsesLow.cons(var136, var134);
            var136 = f49403(var137);
            var137 = (SubLObject)((NIL != var136) ? f49395(var135, var136) : NIL);
        }
        SubLObject var139 = (SubLObject)NIL;
        try {
            var139 = streams_high.make_private_string_output_stream();
            while (NIL == module0035.f2012(var134)) {
                print_high.princ(var134.first(), var139);
                var134 = var134.rest();
                if (NIL == module0035.f2012(var134)) {
                    print_high.princ((SubLObject)$ic162$, var139);
                }
            }
            var138 = streams_high.get_output_stream_string(var139);
        }
        finally {
            final SubLObject var140 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var139, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var140);
            }
        }
        return var138;
    }
    
    public static SubLObject f49261(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return f49377(var133);
    }
    
    public static SubLObject f49338(final SubLObject var165, final SubLObject var166) {
        final SubLObject var167 = f49403(var165);
        final SubLObject var168 = (SubLObject)((NIL != var167) ? f49395(f49261(var165), var167) : NIL);
        return (SubLObject)makeBoolean(NIL != var168 && (var168.eql(var166) || NIL != f49338(var168, var166)));
    }
    
    public static SubLObject f49260(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return f49374(var133);
    }
    
    public static SubLObject f49409(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return f49410(var133, (SubLObject)$ic0$);
    }
    
    public static SubLObject f49410(final SubLObject var133, final SubLObject var3) {
        assert NIL != f49371(var133) : var133;
        assert NIL != Types.stringp(var3) : var3;
        f49381(var133, var3);
        return var3;
    }
    
    public static SubLObject f49404(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return f49375(var133);
    }
    
    public static SubLObject f49411(final SubLObject var133, final SubLObject var167) {
        assert NIL != f49371(var133) : var133;
        assert NIL != Types.symbolp(var167) : var167;
        f49382(var133, var167);
        return var167;
    }
    
    public static SubLObject f49405(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return f49376(var133);
    }
    
    public static SubLObject f49412(final SubLObject var133, final SubLObject var126, final SubLObject var127) {
        assert NIL != f49371(var133) : var133;
        assert NIL != Types.keywordp(var126) : var126;
        f49385(var133, conses_high.putf(f49378(var133), var126, var127));
        return var133;
    }
    
    public static SubLObject f49413(final SubLObject var133, final SubLObject var126, SubLObject var129) {
        if (var129 == UNPROVIDED) {
            var129 = (SubLObject)NIL;
        }
        assert NIL != f49371(var133) : var133;
        assert NIL != Types.keywordp(var126) : var126;
        return conses_high.getf(f49378(var133), var126, var129);
    }
    
    public static SubLObject f49414(final SubLObject var133, final SubLObject var126) {
        assert NIL != f49371(var133) : var133;
        assert NIL != Types.keywordp(var126) : var126;
        return conses_high.remf(f49378(var133), var126);
    }
    
    public static SubLObject f49415(final SubLObject var168, final SubLObject var169) {
        assert NIL != f49371(var168) : var168;
        assert NIL != f49371(var169) : var169;
        final SubLObject var170 = f49391(var168);
        final SubLObject var171 = f49391(var169);
        if (var170.numL(var171)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49416(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic163$);
        var26 = var25.first();
        final SubLObject var27;
        var25 = (var27 = var25.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic164$, (SubLObject)$ic165$, (SubLObject)ConsesLow.listS((SubLObject)$ic166$, var26, var27));
    }
    
    public static SubLObject f49399(final SubLObject var133) {
        return f49413(var133, (SubLObject)$ic167$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49400(final SubLObject var133, SubLObject var176) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        final SubLObject var178 = var176;
        assert NIL != module0035.f2015(var178) : var178;
        SubLObject var179 = var178;
        SubLObject var180 = (SubLObject)NIL;
        var180 = var179.first();
        while (NIL != var179) {
            assert NIL != f49371(var180) : var180;
            var179 = var179.rest();
            var180 = var179.first();
        }
        var176 = Sort.sort(var176, (SubLObject)$ic77$, (SubLObject)UNPROVIDED);
        SubLObject var181 = conses_high.copy_list(var176);
        if (NIL == $g6196$.getDynamicValue(var177)) {
            final SubLObject var182 = f49417(f49261(var133));
            if (NIL != var182 && NIL != f49338(var133, var182)) {
                var176 = Sort.stable_sort(var176, (SubLObject)$ic169$, (SubLObject)UNPROVIDED);
            }
            if (!var181.equal(var176)) {
                if (NIL != $g6197$.getDynamicValue(var177)) {
                    Errors.warn((SubLObject)$ic170$, var181, var176);
                }
                var181 = conses_high.copy_list(var176);
            }
        }
        var176 = f49418(var176);
        if (!var181.equal(var176) && NIL != $g6197$.getDynamicValue(var177)) {
            Errors.warn((SubLObject)$ic171$, var181, var176);
        }
        return f49412(var133, (SubLObject)$ic167$, var176);
    }
    
    public static SubLObject f49419(final SubLObject var181, final SubLObject var182) {
        return Numbers.numL(f49420(var181), f49420(var182));
    }
    
    public static SubLObject f49421(final SubLObject var2) {
        final SubLObject var3 = f49405(f49422(f49261(var2)));
        final SubLObject var4 = f49405(var2);
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        if (NIL != assertion_handles_oc.f11035(var4) && NIL != module0178.f11290(var4)) {
            return (SubLObject)MINUS_ONE_INTEGER;
        }
        SubLObject var7;
        final SubLObject var6 = var7 = module0205.f13207(var3, (SubLObject)$ic173$);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (NIL != module0205.f13220(var8, var4, (SubLObject)T, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return var5;
    }
    
    public static SubLObject f49420(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0034.$g879$.getDynamicValue(var3);
        SubLObject var5 = (SubLObject)NIL;
        if (NIL == var4) {
            return f49421(var2);
        }
        var5 = module0034.f1857(var4, (SubLObject)$ic172$, (SubLObject)UNPROVIDED);
        if (NIL == var5) {
            var5 = module0034.f1807(module0034.f1842(var4), (SubLObject)$ic172$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var4, (SubLObject)$ic172$, var5);
        }
        SubLObject var6 = module0034.f1814(var5, var2, (SubLObject)$ic174$);
        if (var6 == $ic174$) {
            var6 = Values.arg2(var3.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49421(var2)));
            module0034.f1816(var5, var2, var6, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var6);
    }
    
    public static SubLObject f49418(final SubLObject var82) {
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = (SubLObject)NIL;
        SubLObject var85 = var82;
        SubLObject var86 = (SubLObject)NIL;
        var86 = var85.first();
        while (NIL != var85) {
            var83 = f49423(var86, var83);
            var85 = var85.rest();
            var86 = var85.first();
        }
        var85 = var83;
        SubLObject var87 = (SubLObject)NIL;
        var87 = var85.first();
        while (NIL != var85) {
            if (NIL != module0035.f2002(var87, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                SubLObject var81_194 = var87;
                SubLObject var88 = (SubLObject)NIL;
                var88 = var81_194.first();
                while (NIL != var81_194) {
                    final SubLObject var89 = var88;
                    if (NIL == conses_high.member(var89, var84, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var84 = (SubLObject)ConsesLow.cons(var89, var84);
                    }
                    var81_194 = var81_194.rest();
                    var88 = var81_194.first();
                }
            }
            var85 = var85.rest();
            var87 = var85.first();
        }
        if (NIL != module0035.f2012(var84)) {
            return var82;
        }
        var85 = var82;
        var86 = (SubLObject)NIL;
        var86 = var85.first();
        while (NIL != var85) {
            final SubLObject var90 = var86;
            if (NIL == conses_high.member(var90, var84, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var84 = (SubLObject)ConsesLow.cons(var90, var84);
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        return Sequences.nreverse(var84);
    }
    
    public static SubLObject f49423(final SubLObject var2, final SubLObject var191) {
        final SubLObject var192 = f49424(var2);
        final SubLObject var193 = f49425(var2);
        if (NIL == var192 || NIL == var193) {
            return var191;
        }
        SubLObject var194 = (SubLObject)NIL;
        SubLObject var195 = (SubLObject)NIL;
        SubLObject var196 = (SubLObject)NIL;
        var194 = var191;
        var195 = var194.first();
        for (var196 = (SubLObject)ZERO_INTEGER; NIL != var194; var194 = var194.rest(), var195 = var194.first(), var196 = Numbers.add((SubLObject)ONE_INTEGER, var196)) {
            if (var193.equal(f49424(var195.first()))) {
                final SubLObject var197 = (SubLObject)ConsesLow.cons(var2, var195);
                return module0035.f2151(var196, var197, var191);
            }
            if (var192.equal(f49425(module0035.f2114(var195)))) {
                final SubLObject var197 = module0035.f2083(var2, var195);
                return module0035.f2151(var196, var197, var191);
            }
        }
        return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var2), var191);
    }
    
    public static SubLObject f49424(final SubLObject var2) {
        final SubLObject var3 = f49413(var2, (SubLObject)$ic175$, module0107.f7627());
        if (NIL != module0107.f7629(var3)) {
            return var3;
        }
        return f49426(var2);
    }
    
    public static SubLObject f49426(final SubLObject var2) {
        final SubLObject var3 = f49405(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != module0191.f11950(var3) || NIL != module0206.f13426(var3)) {
            final SubLObject var5 = f49427(var3);
            final SubLObject var6 = module0205.f13132(var5);
            final SubLObject var7 = f49428(var6);
            var4 = (SubLObject)((NIL != var7) ? module0205.f13134(var5, var7, (SubLObject)UNPROVIDED) : NIL);
        }
        f49412(var2, (SubLObject)$ic175$, var4);
        return var4;
    }
    
    public static SubLObject f49429(final SubLObject var201) {
        return module0434.f30578((SubLObject)$ic177$, (SubLObject)ConsesLow.listS($ic178$, var201, (SubLObject)$ic179$), $ic10$, (SubLObject)$ic180$).first();
    }
    
    public static SubLObject f49428(final SubLObject var201) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        final SubLObject var203 = module0034.$g879$.getDynamicValue(var202);
        SubLObject var204 = (SubLObject)NIL;
        if (NIL == var203) {
            return f49429(var201);
        }
        var204 = module0034.f1857(var203, (SubLObject)$ic176$, (SubLObject)UNPROVIDED);
        if (NIL == var204) {
            var204 = module0034.f1807(module0034.f1842(var203), (SubLObject)$ic176$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var203, (SubLObject)$ic176$, var204);
        }
        SubLObject var205 = module0034.f1814(var204, var201, (SubLObject)$ic174$);
        if (var205 == $ic174$) {
            var205 = Values.arg2(var202.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49429(var201)));
            module0034.f1816(var204, var201, var205, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var205);
    }
    
    public static SubLObject f49425(final SubLObject var2) {
        final SubLObject var3 = f49413(var2, (SubLObject)$ic181$, module0107.f7627());
        if (NIL != module0107.f7629(var3)) {
            return var3;
        }
        return f49430(var2);
    }
    
    public static SubLObject f49430(final SubLObject var2) {
        final SubLObject var3 = f49405(var2);
        SubLObject var4 = (SubLObject)NIL;
        if (NIL != module0191.f11950(var3) || NIL != module0206.f13426(var3)) {
            final SubLObject var5 = f49427(var3);
            final SubLObject var6 = module0205.f13132(var5);
            final SubLObject var7 = f49431(var6);
            var4 = (SubLObject)((NIL != var7) ? module0205.f13134(var5, var7, (SubLObject)UNPROVIDED) : NIL);
        }
        f49412(var2, (SubLObject)$ic181$, var4);
        return var4;
    }
    
    public static SubLObject f49432(final SubLObject var201) {
        return module0434.f30578((SubLObject)$ic177$, (SubLObject)ConsesLow.listS($ic183$, var201, (SubLObject)$ic179$), $ic10$, (SubLObject)$ic180$).first();
    }
    
    public static SubLObject f49431(final SubLObject var201) {
        final SubLThread var202 = SubLProcess.currentSubLThread();
        final SubLObject var203 = module0034.$g879$.getDynamicValue(var202);
        SubLObject var204 = (SubLObject)NIL;
        if (NIL == var203) {
            return f49432(var201);
        }
        var204 = module0034.f1857(var203, (SubLObject)$ic182$, (SubLObject)UNPROVIDED);
        if (NIL == var204) {
            var204 = module0034.f1807(module0034.f1842(var203), (SubLObject)$ic182$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var203, (SubLObject)$ic182$, var204);
        }
        SubLObject var205 = module0034.f1814(var204, var201, (SubLObject)$ic174$);
        if (var205 == $ic174$) {
            var205 = Values.arg2(var202.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49432(var201)));
            module0034.f1816(var204, var201, var205, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var205);
    }
    
    public static SubLObject f49433(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return Types.sublisp_null(f49403(var133));
    }
    
    public static SubLObject f49434(final SubLObject var133) {
        return f49413(var133, (SubLObject)$ic184$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49393(final SubLObject var133) {
        assert NIL != f49389(var133) : var133;
        return f49412(var133, (SubLObject)$ic184$, (SubLObject)T);
    }
    
    public static SubLObject f49435(final SubLObject var133) {
        return f49413(var133, (SubLObject)$ic186$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49436(final SubLObject var133, final SubLObject var95, final SubLObject var204) {
        assert NIL != module0206.f13450(var95) : var95;
        final SubLObject var205 = f49413(var133, (SubLObject)$ic186$, (SubLObject)UNPROVIDED);
        if (NIL == module0004.f104(var95, var205, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            f49412(var133, (SubLObject)$ic186$, (SubLObject)ConsesLow.cons(var95, var205));
        }
        return var133;
    }
    
    public static SubLObject f49437(final SubLObject var133) {
        final SubLObject var134 = f49404(var133);
        final SubLObject var135 = f49405(var133);
        SubLObject var136 = (SubLObject)NIL;
        if (NIL != f49371(var133)) {
            if (var134 == $ic188$) {
                var136 = var135;
            }
            else if (var134 == $ic189$) {
                var136 = var135;
            }
            else if (var134 == $ic190$) {
                var136 = var135;
            }
            else if (var134 == $ic191$) {
                var136 = module0775.f49759(var135, (SubLObject)UNPROVIDED);
            }
            else if (var134 == $ic192$) {
                var136 = module0775.f49759(var135, (SubLObject)UNPROVIDED);
            }
        }
        return var136;
    }
    
    public static SubLObject f49438(final SubLObject var21, final SubLObject var161, SubLObject var118, SubLObject var119, SubLObject var120) {
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)T;
        }
        if (var119 == UNPROVIDED) {
            var119 = var118;
        }
        if (var120 == UNPROVIDED) {
            var120 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var162 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var21) : var21;
        assert NIL != Types.integerp(var161) : var161;
        final SubLObject var163 = f49407(var21, var161);
        SubLObject var164 = (SubLObject)NIL;
        SubLObject var165 = (SubLObject)NIL;
        if (NIL != f49371(var163)) {
            final SubLObject var166 = f49261(var163);
            final SubLObject var167 = module0579.$g4283$.currentBinding(var162);
            final SubLObject var168 = module0579.$g4298$.currentBinding(var162);
            try {
                module0579.$g4283$.bind(f49322(var166), var162);
                module0579.$g4298$.bind((SubLObject)$ic194$, var162);
                f49354(var166, var118);
                f49356(var166, var119);
                f49359(var166, var120);
                var164 = f49437(var163);
                final SubLObject var170;
                final SubLObject var169 = var170 = f49303(var166);
                final SubLObject var64_210 = module0034.$g879$.currentBinding(var162);
                try {
                    module0034.$g879$.bind(var170, var162);
                    SubLObject var171 = (SubLObject)NIL;
                    if (NIL != var170 && NIL == module0034.f1842(var170)) {
                        var171 = module0034.f1869(var170);
                        final SubLObject var172 = Threads.current_process();
                        if (NIL == var171) {
                            module0034.f1873(var170, var172);
                        }
                        else if (!var171.eql(var172)) {
                            Errors.error((SubLObject)$ic195$);
                        }
                    }
                    try {
                        var165 = f49439(var163);
                    }
                    finally {
                        final SubLObject var64_211 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                            if (NIL != var170 && NIL == var171) {
                                module0034.f1873(var170, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var64_211, var162);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var64_210, var162);
                }
            }
            finally {
                module0579.$g4298$.rebind(var168, var162);
                module0579.$g4283$.rebind(var167, var162);
            }
        }
        else {
            Errors.error((SubLObject)$ic196$, var21, var161);
        }
        return (SubLObject)ConsesLow.list(var165, var164);
    }
    
    public static SubLObject f49440(final SubLObject var21, final SubLObject var161) {
        final SubLThread var162 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var21) : var21;
        assert NIL != Types.integerp(var161) : var161;
        final SubLObject var163 = f49407(var21, var161);
        SubLObject var164 = (SubLObject)NIL;
        SubLObject var165 = (SubLObject)NIL;
        if (NIL != f49371(var163)) {
            final SubLObject var166 = f49261(var163);
            final SubLObject var167 = module0579.$g4283$.currentBinding(var162);
            final SubLObject var168 = module0579.$g4298$.currentBinding(var162);
            try {
                module0579.$g4283$.bind(f49322(var166), var162);
                module0579.$g4298$.bind((SubLObject)$ic194$, var162);
                var164 = f49437(var163);
                final SubLObject var170;
                final SubLObject var169 = var170 = f49303(var166);
                final SubLObject var64_214 = module0034.$g879$.currentBinding(var162);
                try {
                    module0034.$g879$.bind(var170, var162);
                    SubLObject var171 = (SubLObject)NIL;
                    if (NIL != var170 && NIL == module0034.f1842(var170)) {
                        var171 = module0034.f1869(var170);
                        final SubLObject var172 = Threads.current_process();
                        if (NIL == var171) {
                            module0034.f1873(var170, var172);
                        }
                        else if (!var171.eql(var172)) {
                            Errors.error((SubLObject)$ic195$);
                        }
                    }
                    try {
                        var165 = f49439(var163);
                    }
                    finally {
                        final SubLObject var64_215 = Threads.$is_thread_performing_cleanupP$.currentBinding(var162);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var162);
                            if (NIL != var170 && NIL == var171) {
                                module0034.f1873(var170, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var64_215, var162);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var64_214, var162);
                }
            }
            finally {
                module0579.$g4298$.rebind(var168, var162);
                module0579.$g4283$.rebind(var167, var162);
            }
        }
        else {
            Errors.error((SubLObject)$ic196$, var21, var161);
        }
        return (SubLObject)ConsesLow.list(var165, var164);
    }
    
    public static SubLObject f49439(final SubLObject var133) {
        final SubLObject var134 = f49307(f49261(var133), (SubLObject)$ic198$, (SubLObject)$ic199$);
        return Functions.funcall(var134, var133);
    }
    
    public static SubLObject f49441(final SubLObject var133) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var136;
        final SubLObject var135 = var136 = f49303(f49261(var133));
        final SubLObject var137 = module0034.$g879$.currentBinding(var134);
        try {
            module0034.$g879$.bind(var136, var134);
            SubLObject var138 = (SubLObject)NIL;
            if (NIL != var136 && NIL == module0034.f1842(var136)) {
                var138 = module0034.f1869(var136);
                final SubLObject var139 = Threads.current_process();
                if (NIL == var138) {
                    module0034.f1873(var136, var139);
                }
                else if (!var138.eql(var139)) {
                    Errors.error((SubLObject)$ic195$);
                }
            }
            try {
                final SubLObject var140 = f49261(var133);
                final SubLObject var141 = f49352(var140);
                final SubLObject var142 = f49355(var140);
                final SubLObject var143 = f49357(var140);
                final SubLObject var144 = f49337(var133);
                return f49442(var133, var141, var142, var143, var144);
            }
            finally {
                final SubLObject var64_217 = Threads.$is_thread_performing_cleanupP$.currentBinding(var134);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var134);
                    if (NIL != var136 && NIL == var138) {
                        module0034.f1873(var136, (SubLObject)NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var64_217, var134);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var137, var134);
        }
    }
    
    public static SubLObject f49443(final SubLObject var133, final SubLObject var118, final SubLObject var119, final SubLObject var120, final SubLObject var111) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        assert NIL != f49371(var133) : var133;
        final SubLObject var135 = f49404(var133);
        final SubLObject var136 = f49405(var133);
        final SubLObject var137 = f49261(var133);
        SubLObject var138 = (SubLObject)NIL;
        final SubLObject var139 = module0579.$g4296$.currentBinding(var134);
        final SubLObject var140 = module0579.$g4260$.currentBinding(var134);
        try {
            module0579.$g4296$.bind(f49267(var137), var134);
            module0579.$g4260$.bind(var120, var134);
            var138 = f49444(var133, var136, var135, var118);
            if (NIL != var111) {
                final SubLObject var141 = f49435(var133);
                SubLObject var142 = (SubLObject)NIL;
                SubLObject var143 = var141;
                SubLObject var144 = (SubLObject)NIL;
                var144 = var143.first();
                while (NIL != var143) {
                    if (NIL != f49317(var144)) {
                        final SubLObject var145 = f49316(var137, var144);
                        if (NIL != module0004.f105(var145)) {
                            var142 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var145, var144), var142);
                        }
                    }
                    var143 = var143.rest();
                    var144 = var143.first();
                }
                var138 = Sequences.cconcatenate(var138, module0769.f49023(var142));
            }
        }
        finally {
            module0579.$g4260$.rebind(var140, var134);
            module0579.$g4296$.rebind(var139, var134);
        }
        return var138;
    }
    
    public static SubLObject f49442(final SubLObject var133, final SubLObject var118, final SubLObject var119, final SubLObject var120, final SubLObject var111) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = module0034.$g879$.getDynamicValue(var134);
        SubLObject var136 = (SubLObject)NIL;
        if (NIL == var135) {
            return f49443(var133, var118, var119, var120, var111);
        }
        var136 = module0034.f1857(var135, (SubLObject)$ic201$, (SubLObject)UNPROVIDED);
        if (NIL == var136) {
            var136 = module0034.f1807(module0034.f1842(var135), (SubLObject)$ic201$, (SubLObject)FIVE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var135, (SubLObject)$ic201$, var136);
        }
        final SubLObject var137 = module0034.f1779(var133, var118, var119, var120, var111);
        final SubLObject var138 = module0034.f1814(var136, var137, (SubLObject)UNPROVIDED);
        if (var138 != $ic174$) {
            SubLObject var139 = var138;
            SubLObject var140 = (SubLObject)NIL;
            var140 = var139.first();
            while (NIL != var139) {
                SubLObject var141 = var140.first();
                final SubLObject var142 = conses_high.second(var140);
                if (var133.equal(var141.first())) {
                    var141 = var141.rest();
                    if (var118.equal(var141.first())) {
                        var141 = var141.rest();
                        if (var119.equal(var141.first())) {
                            var141 = var141.rest();
                            if (var120.equal(var141.first())) {
                                var141 = var141.rest();
                                if (NIL != var141 && NIL == var141.rest() && var111.equal(var141.first())) {
                                    return module0034.f1959(var142);
                                }
                            }
                        }
                    }
                }
                var139 = var139.rest();
                var140 = var139.first();
            }
        }
        final SubLObject var143 = Values.arg2(var134.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49443(var133, var118, var119, var120, var111)));
        module0034.f1836(var136, var137, var138, var143, (SubLObject)ConsesLow.list(var133, var118, var119, var120, var111));
        return module0034.f1959(var143);
    }
    
    public static SubLObject f49445(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic202$);
        final SubLObject var26 = var25.rest();
        var25 = var25.first();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic202$);
        var27 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic202$);
        var28 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            final SubLObject var29;
            var25 = (var29 = var26);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic203$, (SubLObject)ConsesLow.list((SubLObject)EQL, var27, var28), ConsesLow.append(var29, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic204$, (SubLObject)ConsesLow.list((SubLObject)$ic205$, var27), ConsesLow.append(var29, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var24, (SubLObject)$ic202$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49444(final SubLObject var133, final SubLObject var18, final SubLObject var139, final SubLObject var118) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        SubLObject var141 = (SubLObject)NIL;
        final SubLObject var142 = module0579.$g4309$.currentBinding(var140);
        try {
            module0579.$g4309$.bind((SubLObject)NIL, var140);
            final SubLObject var143 = f49261(var133);
            final SubLObject var144 = f49267(var143);
            final SubLObject var64_234 = module0579.$g4262$.currentBinding(var140);
            final SubLObject var145 = module0579.$g4260$.currentBinding(var140);
            final SubLObject var146 = module0579.$g4283$.currentBinding(var140);
            final SubLObject var147 = module0579.$g4258$.currentBinding(var140);
            try {
                module0579.$g4262$.bind(f49360(var143), var140);
                module0579.$g4260$.bind(f49357(var143), var140);
                module0579.$g4283$.bind(f49322(var143), var140);
                module0579.$g4258$.bind((SubLObject)NIL, var140);
                final SubLObject var148 = f49446(var18, var139, var133);
                final SubLObject var149 = module0762.f48153((SubLObject)$ic206$, (SubLObject)NIL);
                module0762.f48155((SubLObject)$ic206$, var149);
                try {
                    final SubLObject var238_239 = module0762.f48153((SubLObject)$ic207$, (SubLObject)NIL);
                    module0762.f48155((SubLObject)$ic207$, var238_239);
                    try {
                        final SubLObject var64_235 = module0579.$g4296$.currentBinding(var140);
                        final SubLObject var207_241 = module0579.$g4278$.currentBinding(var140);
                        final SubLObject var235_242 = module0579.$g4273$.currentBinding(var140);
                        final SubLObject var236_243 = module0579.$g4238$.currentBinding(var140);
                        final SubLObject var150 = module0579.$g4350$.currentBinding(var140);
                        final SubLObject var151 = module0579.$g4351$.currentBinding(var140);
                        final SubLObject var152 = module0579.$g4352$.currentBinding(var140);
                        final SubLObject var153 = module0579.$g4355$.currentBinding(var140);
                        final SubLObject var154 = module0579.$g4353$.currentBinding(var140);
                        try {
                            module0579.$g4296$.bind(var144, var140);
                            module0579.$g4278$.bind(inference_datastructures_inference_oc.f25491(inference_datastructures_inference_oc.f25732(var144)), var140);
                            module0579.$g4273$.bind((SubLObject)T, var140);
                            module0579.$g4238$.bind((SubLObject)T, var140);
                            module0579.$g4350$.bind((SubLObject)NIL, var140);
                            module0579.$g4351$.bind(module0775.f49671(), var140);
                            module0579.$g4352$.bind(module0775.f49672(), var140);
                            module0579.$g4355$.bind((SubLObject)ZERO_INTEGER, var140);
                            module0579.$g4353$.bind((SubLObject)NIL, var140);
                            var140.resetMultipleValues();
                            final SubLObject var155 = module0580.f35615();
                            final SubLObject var156 = var140.secondMultipleValue();
                            var140.resetMultipleValues();
                            final SubLObject var64_236 = module0579.$g4298$.currentBinding(var140);
                            final SubLObject var207_242 = module0579.$g4301$.currentBinding(var140);
                            try {
                                module0579.$g4298$.bind((NIL != var155) ? var155 : module0579.$g4298$.getDynamicValue(var140), var140);
                                module0579.$g4301$.bind((NIL != var156) ? var156 : module0579.$g4301$.getDynamicValue(var140), var140);
                                SubLObject var157 = (SubLObject)NIL;
                                try {
                                    var157 = streams_high.make_private_string_output_stream();
                                    final SubLObject var64_237 = module0015.$g131$.currentBinding(var140);
                                    try {
                                        module0015.$g131$.bind(var157, var140);
                                        if (var148.eql(f49257())) {
                                            final SubLObject var158 = f49413(var133, (SubLObject)$ic208$, (SubLObject)UNPROVIDED);
                                            if (NIL != var158) {
                                                PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic209$, var158);
                                            }
                                            f49447(var143, var139, var18, var118);
                                        }
                                        else {
                                            module0642.f39020(module0015.$g219$.getGlobalValue());
                                            if (NIL != var148) {
                                                module0642.f39020(module0015.$g222$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020(module0642.f39042(var148));
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            }
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var64_238 = module0015.$g533$.currentBinding(var140);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var140);
                                                final SubLObject var159 = f49413(var133, (SubLObject)$ic208$, (SubLObject)UNPROVIDED);
                                                if (NIL != var159) {
                                                    PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic209$, var159);
                                                }
                                                f49447(var143, var139, var18, var118);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var64_238, var140);
                                            }
                                            module0642.f39020(module0015.$g220$.getGlobalValue());
                                        }
                                    }
                                    finally {
                                        module0015.$g131$.rebind(var64_237, var140);
                                    }
                                    var141 = streams_high.get_output_stream_string(var157);
                                }
                                finally {
                                    final SubLObject var64_239 = Threads.$is_thread_performing_cleanupP$.currentBinding(var140);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var140);
                                        streams_high.close(var157, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var64_239, var140);
                                    }
                                }
                            }
                            finally {
                                module0579.$g4301$.rebind(var207_242, var140);
                                module0579.$g4298$.rebind(var64_236, var140);
                            }
                        }
                        finally {
                            module0579.$g4353$.rebind(var154, var140);
                            module0579.$g4355$.rebind(var153, var140);
                            module0579.$g4352$.rebind(var152, var140);
                            module0579.$g4351$.rebind(var151, var140);
                            module0579.$g4350$.rebind(var150, var140);
                            module0579.$g4238$.rebind(var236_243, var140);
                            module0579.$g4273$.rebind(var235_242, var140);
                            module0579.$g4278$.rebind(var207_241, var140);
                            module0579.$g4296$.rebind(var64_235, var140);
                        }
                    }
                    finally {
                        final SubLObject var64_240 = Threads.$is_thread_performing_cleanupP$.currentBinding(var140);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var140);
                            module0762.f48154((SubLObject)$ic207$, var238_239);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var64_240, var140);
                        }
                    }
                }
                finally {
                    final SubLObject var64_241 = Threads.$is_thread_performing_cleanupP$.currentBinding(var140);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var140);
                        module0762.f48154((SubLObject)$ic206$, var149);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var64_241, var140);
                    }
                }
            }
            finally {
                module0579.$g4258$.rebind(var147, var140);
                module0579.$g4283$.rebind(var146, var140);
                module0579.$g4260$.rebind(var145, var140);
                module0579.$g4262$.rebind(var64_234, var140);
            }
        }
        finally {
            module0579.$g4309$.rebind(var142, var140);
        }
        return var141;
    }
    
    public static SubLObject f49448(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = (SubLObject)NIL;
        SubLObject var102 = (SubLObject)NIL;
        try {
            var102 = streams_high.make_private_string_output_stream();
            final SubLObject var103 = module0015.$g131$.currentBinding(var100);
            final SubLObject var104 = module0579.$g4345$.currentBinding(var100);
            final SubLObject var105 = module0579.$g4346$.currentBinding(var100);
            final SubLObject var106 = module0579.$g4357$.currentBinding(var100);
            try {
                module0015.$g131$.bind(var102, var100);
                module0579.$g4345$.bind((SubLObject)NIL, var100);
                module0579.$g4346$.bind((SubLObject)NIL, var100);
                module0579.$g4357$.bind($g6180$.getDynamicValue(var100), var100);
                module0775.f49784(var99, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0579.$g4357$.rebind(var106, var100);
                module0579.$g4346$.rebind(var105, var100);
                module0579.$g4345$.rebind(var104, var100);
                module0015.$g131$.rebind(var103, var100);
            }
            var101 = streams_high.get_output_stream_string(var102);
        }
        finally {
            final SubLObject var107 = Threads.$is_thread_performing_cleanupP$.currentBinding(var100);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var100);
                streams_high.close(var102, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var107, var100);
            }
        }
        return var101;
    }
    
    public static SubLObject f49449(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = module0034.$g879$.getDynamicValue(var100);
        SubLObject var102 = (SubLObject)NIL;
        if (NIL == var101) {
            return f49448(var99);
        }
        var102 = module0034.f1857(var101, (SubLObject)$ic210$, (SubLObject)UNPROVIDED);
        if (NIL == var102) {
            var102 = module0034.f1807(module0034.f1842(var101), (SubLObject)$ic210$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var101, (SubLObject)$ic210$, var102);
        }
        SubLObject var103 = module0034.f1814(var102, var99, (SubLObject)$ic174$);
        if (var103 == $ic174$) {
            var103 = Values.arg2(var100.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49448(var99)));
            module0034.f1816(var102, var99, var103, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var103);
    }
    
    public static SubLObject f49447(final SubLObject var4, final SubLObject var139, final SubLObject var18, final SubLObject var118) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        if (var139.eql((SubLObject)$ic192$) || var139.eql((SubLObject)$ic191$) || var139.eql((SubLObject)$ic211$) || var139.eql((SubLObject)$ic212$)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic213$, f49449(var18));
        }
        else if (var139.eql((SubLObject)$ic189$)) {
            module0775.f49684(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var139.eql((SubLObject)$ic188$)) {
            module0775.f49884(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var139.eql((SubLObject)$ic214$)) {
            f49450(var18, $g6188$.getDynamicValue(var140), var118);
        }
        else if (var139.eql((SubLObject)$ic215$)) {
            SubLObject var141 = (SubLObject)NIL;
            SubLObject var142 = (SubLObject)NIL;
            SubLObject var143 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var18, (SubLObject)$ic216$);
            var141 = var18.first();
            SubLObject var144 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var144, var18, (SubLObject)$ic216$);
            var142 = var144.first();
            var144 = var144.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var144, var18, (SubLObject)$ic216$);
            var143 = var144.first();
            var144 = var144.rest();
            if (NIL == var144) {
                f49451(var4, var141, var142, var143);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic216$);
            }
        }
        else if (var139.eql((SubLObject)$ic217$)) {
            SubLObject var145 = (SubLObject)NIL;
            SubLObject var146 = (SubLObject)NIL;
            SubLObject var147 = (SubLObject)NIL;
            SubLObject var148 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var18, (SubLObject)$ic218$);
            var145 = var18.first();
            SubLObject var149 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var149, var18, (SubLObject)$ic218$);
            var146 = var149.first();
            var149 = var149.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var149, var18, (SubLObject)$ic218$);
            var147 = var149.first();
            var149 = var149.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var149, var18, (SubLObject)$ic218$);
            var148 = var149.first();
            var149 = var149.rest();
            if (NIL == var149) {
                f49452(var4, var145, var146, var147, var148);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic218$);
            }
        }
        else if (var139.eql((SubLObject)$ic190$)) {
            module0775.f49885(var18);
        }
        else if (var139.eql((SubLObject)$ic219$)) {
            f49453(var4, var18);
        }
        else if (var139.eql((SubLObject)$ic220$)) {
            final SubLObject var150 = module0220.f14556(var18, $ic221$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var150) {
                module0642.f39019(var150);
            }
            else {
                f49447(var4, (SubLObject)$ic192$, var18, var118);
            }
        }
        else if (var139.eql((SubLObject)$ic222$)) {
            module0642.f39019((SubLObject)$ic223$);
        }
        else if (var139.eql((SubLObject)$ic224$)) {
            module0642.f39019($g6179$.getGlobalValue());
        }
        else if (var139.eql((SubLObject)$ic225$)) {
            module0642.f39019((SubLObject)$ic226$);
        }
        else if (var139.eql((SubLObject)$ic227$)) {
            module0642.f39019((SubLObject)$ic228$);
        }
        else if (var139.eql((SubLObject)$ic229$)) {
            module0642.f39019((SubLObject)$ic230$);
        }
        else if (var139.eql((SubLObject)$ic231$)) {
            module0642.f39019((SubLObject)$ic232$);
        }
        else if (var139.eql((SubLObject)$ic233$)) {
            module0642.f39019((SubLObject)$ic234$);
        }
        else if (var139.eql((SubLObject)$ic235$)) {
            module0642.f39019((SubLObject)$ic236$);
        }
        else if (var139.eql((SubLObject)$ic237$)) {
            f49454(var18, var4);
        }
        else if (var139.eql((SubLObject)$ic151$) || var139.eql((SubLObject)$ic156$) || var139.eql((SubLObject)$ic238$) || var139.eql((SubLObject)$ic239$)) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic0$);
        }
        else if (var139.eql((SubLObject)$ic240$) || var139.eql((SubLObject)$ic241$) || var139.eql((SubLObject)$ic242$)) {
            f49447(var4, f49404(var18), f49405(var18), var118);
        }
        else if (var139.eql((SubLObject)$ic243$)) {
            SubLObject var151 = var18;
            module0642.f39019((SubLObject)$ic244$);
            if (NIL != module0035.f1997(var151)) {
                module0642.f39019(f49413(module0035.f2113(var151), (SubLObject)$ic208$, (SubLObject)UNPROVIDED));
            }
            else if (NIL != module0035.f1998(var151)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic245$, f49413(var151.first(), (SubLObject)$ic208$, (SubLObject)UNPROVIDED), f49413(conses_high.second(var151), (SubLObject)$ic208$, (SubLObject)UNPROVIDED));
            }
            else {
                while (NIL == module0035.f2012(var151)) {
                    final SubLObject var152 = var151.first();
                    var151 = var151.rest();
                    final SubLObject var153 = module0035.f2012(var151);
                    if (NIL != var153) {
                        module0642.f39019((SubLObject)$ic246$);
                    }
                    module0642.f39019(f49413(var152, (SubLObject)$ic208$, (SubLObject)UNPROVIDED));
                    if (NIL == var153) {
                        module0642.f39019((SubLObject)$ic247$);
                    }
                }
            }
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic248$, var139);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49455(final SubLObject var4, final SubLObject var139, final SubLObject var18, final SubLObject var118) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        if (var139 == $ic192$ || var139 == $ic191$ || var139 == $ic211$ || var139 == $ic212$) {
            final SubLObject var141 = module0579.$g4345$.currentBinding(var140);
            final SubLObject var142 = module0579.$g4346$.currentBinding(var140);
            final SubLObject var143 = module0579.$g4357$.currentBinding(var140);
            try {
                module0579.$g4345$.bind((SubLObject)NIL, var140);
                module0579.$g4346$.bind((SubLObject)NIL, var140);
                module0579.$g4357$.bind($g6180$.getDynamicValue(var140), var140);
                module0775.f49784(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0579.$g4357$.rebind(var143, var140);
                module0579.$g4346$.rebind(var142, var140);
                module0579.$g4345$.rebind(var141, var140);
            }
        }
        else if (var139 == $ic189$) {
            module0775.f49684(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var139 == $ic188$) {
            module0775.f49884(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var139 == $ic214$) {
            f49450(var18, $g6188$.getDynamicValue(var140), var118);
        }
        else if (var139 == $ic215$) {
            SubLObject var144 = (SubLObject)NIL;
            SubLObject var145 = (SubLObject)NIL;
            SubLObject var146 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var18, (SubLObject)$ic216$);
            var144 = var18.first();
            SubLObject var147 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var147, var18, (SubLObject)$ic216$);
            var145 = var147.first();
            var147 = var147.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var147, var18, (SubLObject)$ic216$);
            var146 = var147.first();
            var147 = var147.rest();
            if (NIL == var147) {
                f49451(var4, var144, var145, var146);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic216$);
            }
        }
        else if (var139 == $ic217$) {
            SubLObject var148 = (SubLObject)NIL;
            SubLObject var149 = (SubLObject)NIL;
            SubLObject var150 = (SubLObject)NIL;
            SubLObject var151 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var18, (SubLObject)$ic218$);
            var148 = var18.first();
            SubLObject var152 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var152, var18, (SubLObject)$ic218$);
            var149 = var152.first();
            var152 = var152.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var152, var18, (SubLObject)$ic218$);
            var150 = var152.first();
            var152 = var152.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var152, var18, (SubLObject)$ic218$);
            var151 = var152.first();
            var152 = var152.rest();
            if (NIL == var152) {
                f49452(var4, var148, var149, var150, var151);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var18, (SubLObject)$ic218$);
            }
        }
        else if (var139 == $ic190$) {
            module0775.f49885(var18);
        }
        else if (var139 == $ic219$) {
            f49453(var4, var18);
        }
        else if (var139 == $ic222$) {
            module0642.f39019((SubLObject)$ic223$);
        }
        else if (var139 == $ic224$) {
            module0642.f39019($g6179$.getGlobalValue());
        }
        else if (var139 == $ic225$) {
            module0642.f39019((SubLObject)$ic226$);
        }
        else if (var139 == $ic227$) {
            module0642.f39019((SubLObject)$ic228$);
        }
        else if (var139 == $ic229$) {
            module0642.f39019((SubLObject)$ic230$);
        }
        else if (var139 == $ic231$) {
            module0642.f39019((SubLObject)$ic232$);
        }
        else if (var139 == $ic233$) {
            module0642.f39019((SubLObject)$ic234$);
        }
        else if (var139 == $ic235$) {
            module0642.f39019((SubLObject)$ic236$);
        }
        else if (var139 == $ic237$) {
            f49454(var18, var4);
        }
        else if (NIL == var139) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic0$);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var140), (SubLObject)$ic248$, var139);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49446(final SubLObject var18, final SubLObject var139, final SubLObject var133) {
        if (var139 == $ic227$) {
            return $g6183$.getGlobalValue();
        }
        if (var139 == $ic229$) {
            return $g6184$.getGlobalValue();
        }
        if (NIL != f49456(var133)) {
            return $g6183$.getGlobalValue();
        }
        if (NIL != f49457(var133)) {
            return $g6184$.getGlobalValue();
        }
        if (NIL != f49458(var133)) {
            return $g6182$.getGlobalValue();
        }
        if (NIL != f49459(var133)) {
            return $g6183$.getGlobalValue();
        }
        if (NIL != f49460(var133)) {
            return $g6184$.getGlobalValue();
        }
        if (NIL != module0537.f33305(var18)) {
            return $g6182$.getGlobalValue();
        }
        return f49257();
    }
    
    public static SubLObject f49461(final SubLObject var133, final SubLObject var99) {
        f49412(var133, (SubLObject)$ic249$, var99);
        final SubLObject var134 = f49261(var133);
        final SubLObject var135 = f49403(var133);
        final SubLObject var136 = (SubLObject)(var135.isInteger() ? f49395(var134, var135) : NIL);
        if (NIL != var136) {
            f49461(var136, var99);
        }
        return var133;
    }
    
    public static SubLObject f49462(final SubLObject var133, final SubLObject var99) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        $g6198$.setDynamicValue((SubLObject)ConsesLow.cons(f49391(var133), $g6198$.getDynamicValue(var134)), var134);
        if (f49404(var133) == $ic225$) {
            f49411(var133, (SubLObject)$ic227$);
        }
        else if (NIL != module0537.f33305(f49405(var133))) {
            f49411(var133, (SubLObject)$ic211$);
        }
        else if (NIL != f49458(var133)) {
            f49414(var133, (SubLObject)$ic249$);
            f49412(var133, (SubLObject)$ic250$, var99);
        }
        final SubLObject var135 = f49261(var133);
        final SubLObject var136 = f49403(var133);
        final SubLObject var137 = (SubLObject)(var136.isInteger() ? f49395(var135, var136) : NIL);
        if (NIL != var137) {
            f49462(var137, var99);
        }
        return var133;
    }
    
    public static SubLObject f49463(final SubLObject var133, final SubLObject var99) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        $g6198$.setDynamicValue((SubLObject)ConsesLow.cons(f49391(var133), $g6198$.getDynamicValue(var134)), var134);
        if (f49404(var133) == $ic225$) {
            f49411(var133, (SubLObject)$ic229$);
        }
        else if (NIL != module0537.f33305(f49405(var133))) {
            f49411(var133, (SubLObject)$ic212$);
        }
        else if (NIL != f49458(var133)) {
            f49414(var133, (SubLObject)$ic249$);
            f49412(var133, (SubLObject)$ic251$, var99);
        }
        final SubLObject var135 = f49261(var133);
        final SubLObject var136 = f49403(var133);
        final SubLObject var137 = (SubLObject)(var136.isInteger() ? f49395(var135, var136) : NIL);
        if (NIL != var137) {
            f49463(var137, var99);
        }
        return var133;
    }
    
    public static SubLObject f49458(final SubLObject var133) {
        return module0035.sublisp_boolean(f49413(var133, (SubLObject)$ic249$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49459(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return module0035.sublisp_boolean(f49413(var133, (SubLObject)$ic250$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49460(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return module0035.sublisp_boolean(f49413(var133, (SubLObject)$ic251$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49456(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return Equality.eq(f49404(var133), (SubLObject)$ic211$);
    }
    
    public static SubLObject f49457(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        return Equality.eq(f49404(var133), (SubLObject)$ic212$);
    }
    
    public static SubLObject f49450(final SubLObject var96, SubLObject var167, SubLObject var118) {
        if (var167 == UNPROVIDED) {
            var167 = $g6188$.getDynamicValue();
        }
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)T;
        }
        final SubLThread var168 = SubLProcess.currentSubLThread();
        assert NIL != module0769.f49038(var96) : var96;
        final SubLObject var169 = module0015.$g533$.currentBinding(var168);
        try {
            module0015.$g533$.bind((SubLObject)NIL, var168);
            module0642.f39019(module0769.f49030(var96, var167, var118));
        }
        finally {
            module0015.$g533$.rebind(var169, var168);
        }
        return var96;
    }
    
    public static SubLObject f49453(final SubLObject var4, final SubLObject var276) {
        final SubLThread var277 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var278 = module0015.$g533$.currentBinding(var277);
        try {
            module0015.$g533$.bind((SubLObject)T, var277);
            SubLObject var279 = module0751.f46805(conses_high.copy_list(var276));
            SubLObject var280 = (SubLObject)NIL;
            var280 = var279.first();
            while (NIL != var279) {
                SubLObject var282;
                final SubLObject var281 = var282 = var280;
                SubLObject var283 = (SubLObject)NIL;
                SubLObject var284 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var282, var281, (SubLObject)$ic253$);
                var283 = var282.first();
                var282 = (var284 = var282.rest());
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var64_281 = module0015.$g533$.currentBinding(var277);
                try {
                    module0015.$g533$.bind((SubLObject)T, var277);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var64_282 = module0015.$g533$.currentBinding(var277);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var277);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        final SubLObject var64_283 = module0579.$g4276$.currentBinding(var277);
                        try {
                            module0579.$g4276$.bind((SubLObject)NIL, var277);
                            module0775.f49884(var283, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0579.$g4276$.rebind(var64_283, var277);
                        }
                        module0642.f39019((SubLObject)$ic254$);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var64_282, var277);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var64_284 = module0015.$g533$.currentBinding(var277);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var277);
                        final SubLObject var285 = f49464(var4, var284);
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != var285) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(var285));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var64_285 = module0015.$g533$.currentBinding(var277);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var277);
                            module0775.f49884(var284, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var64_285, var277);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var64_284, var277);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var64_281, var277);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                var279 = var279.rest();
                var280 = var279.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var278, var277);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return var276;
    }
    
    public static SubLObject f49454(final SubLObject var286, final SubLObject var4) {
        final SubLObject var287 = (SubLObject)((NIL != f49346(var4)) ? NIL : module0178.f11295(var286));
        final SubLObject var288 = (SubLObject)((NIL != f49350(var4)) ? NIL : module0178.f11296(var286));
        final SubLObject var289 = (SubLObject)NIL;
        final SubLObject var290 = (SubLObject)((NIL != var289) ? module0178.f11298(var286) : NIL);
        final SubLObject var291 = (SubLObject)NIL;
        final SubLObject var292 = (SubLObject)((NIL != var291) ? module0178.f11297(var286) : NIL);
        final SubLObject var293 = (SubLObject)makeBoolean(NIL == f49348(var4));
        final SubLObject var294 = (SubLObject)((NIL != var287 && NIL != var293) ? f49465(var287, var288) : NIL);
        if (NIL != f49466(var4, var286)) {
            module0642.f39019((SubLObject)$ic255$);
        }
        else if (NIL != var287 || NIL != var288 || NIL != var292) {
            module0642.f39019((SubLObject)$ic256$);
            if (NIL != var287) {
                if (NIL != f49346(var4)) {
                    if (NIL != var294) {
                        module0642.f39019((SubLObject)$ic257$);
                    }
                }
                else {
                    module0642.f39019((SubLObject)$ic258$);
                    module0775.f49884(var287, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            if (NIL != var294) {
                module0642.f39019((SubLObject)$ic259$);
                module0775.f49884(var294, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var288) {
                module0642.f39019((SubLObject)$ic260$);
                module0656.f39800(var288);
                if (NIL != var290) {
                    module0642.f39019((SubLObject)$ic261$);
                    module0656.f39801(var290);
                }
            }
            if (NIL != var292) {
                module0642.f39019((SubLObject)$ic262$);
                module0775.f49884(var292, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            module0642.f39019((SubLObject)$ic263$);
        }
        module0642.f39019((SubLObject)$ic264$);
        return var286;
    }
    
    public static SubLObject f49466(final SubLObject var4, final SubLObject var286) {
        if (NIL != module0259.f16854(module0161.f10557(module0161.f10550(var286)), $ic265$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var287 = f49405(f49422(var4));
            final SubLObject var288 = module0289.f19396(var286);
            final SubLObject var289 = inference_datastructures_inference_oc.f25491(inference_datastructures_inference_oc.f25732(f49267(var4)));
            if (NIL != module0202.f12938(var288) && NIL != module0202.f12597(var287)) {
                final SubLObject var290 = module0205.f13203(var287, (SubLObject)UNPROVIDED);
                SubLObject var291 = (SubLObject)((NIL != module0202.f12595(var290)) ? module0205.f13207(var290, (SubLObject)UNPROVIDED) : ConsesLow.list(var290));
                SubLObject var292 = (SubLObject)NIL;
                var292 = var291.first();
                while (NIL != var291) {
                    if (module0233.f15362(var289, var292).equal(var288)) {
                        return (SubLObject)T;
                    }
                    var291 = var291.rest();
                    var292 = var291.first();
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49465(final SubLObject var287, SubLObject var288) {
        if (var288 == UNPROVIDED) {
            var288 = (SubLObject)NIL;
        }
        final SubLThread var289 = SubLProcess.currentSubLThread();
        if (NIL == module0051.f3603(var288)) {
            var288 = module0538.f33467();
        }
        SubLObject var290 = (SubLObject)NIL;
        final SubLObject var291 = module0612.f37426(module0051.f3612(var288, (SubLObject)UNPROVIDED));
        if (NIL != $g6199$.getDynamicValue(var289)) {
            if (NIL == var290) {
                SubLObject var292 = f49467(var287);
                SubLObject var293 = (SubLObject)NIL;
                var293 = var292.first();
                while (NIL == var290 && NIL != var292) {
                    SubLObject var295;
                    final SubLObject var294 = var295 = var293;
                    SubLObject var296 = (SubLObject)NIL;
                    SubLObject var297 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var295, var294, (SubLObject)$ic266$);
                    var296 = var295.first();
                    var295 = var295.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var295, var294, (SubLObject)$ic266$);
                    var297 = var295.first();
                    var295 = var295.rest();
                    if (NIL == var295) {
                        if (NIL != module0161.f10503(var297)) {
                            var290 = var296;
                        }
                        else if (NIL != module0161.f10499(var297)) {
                            var289.resetMultipleValues();
                            final SubLObject var298 = module0161.f10583(var297);
                            final SubLObject var299 = var289.secondMultipleValue();
                            var289.resetMultipleValues();
                            if (NIL != module0267.f17561(var291, var298, $ic267$, var299)) {
                                var290 = var296;
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var294, (SubLObject)$ic266$);
                    }
                    var292 = var292.rest();
                    var293 = var292.first();
                }
            }
        }
        else {
            var290 = module0434.f30578((SubLObject)$ic268$, (SubLObject)ConsesLow.list($ic269$, (SubLObject)ConsesLow.list($ic270$, (SubLObject)$ic271$, (SubLObject)ConsesLow.list($ic272$, (SubLObject)$ic268$, var287)), (SubLObject)$ic273$, (SubLObject)ConsesLow.list($ic274$, (SubLObject)$ic275$, var291)), $ic10$, (SubLObject)$ic276$).first();
        }
        return var290;
    }
    
    public static SubLObject f49468() {
        final SubLObject var308 = $g6200$.getGlobalValue();
        if (NIL != var308) {
            module0034.f1818(var308);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49469(final SubLObject var287) {
        return module0034.f1829($g6200$.getGlobalValue(), (SubLObject)ConsesLow.list(var287), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49470(final SubLObject var287) {
        return module0434.f30576((SubLObject)$ic278$, (SubLObject)ConsesLow.list($ic270$, (SubLObject)$ic271$, (SubLObject)ConsesLow.list($ic272$, (SubLObject)$ic268$, var287)), $ic10$, (SubLObject)$ic279$);
    }
    
    public static SubLObject f49467(final SubLObject var287) {
        SubLObject var288 = $g6200$.getGlobalValue();
        if (NIL == var288) {
            var288 = module0034.f1934((SubLObject)$ic277$, (SubLObject)$ic280$, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var289 = module0034.f1814(var288, var287, (SubLObject)$ic174$);
        if (var289 == $ic174$) {
            var289 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49470(var287)));
            module0034.f1816(var288, var287, var289, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var289);
    }
    
    public static SubLObject f49451(final SubLObject var4, final SubLObject var200, final SubLObject var262, final SubLObject var263) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        final SubLObject var265 = module0751.f46855((SubLObject)$ic281$, (SubLObject)ConsesLow.list($ic269$, (SubLObject)ConsesLow.listS($ic282$, var200, (SubLObject)$ic283$), (SubLObject)$ic284$, (SubLObject)ConsesLow.listS($ic285$, (SubLObject)$ic286$, var200, (SubLObject)$ic287$)), var263, (SubLObject)UNPROVIDED);
        SubLObject var266 = (SubLObject)NIL;
        final SubLObject var267 = $g6185$.getDynamicValue(var264);
        if (NIL == var266) {
            SubLObject var268 = var265;
            SubLObject var269 = (SubLObject)NIL;
            var269 = var268.first();
            while (NIL == var266 && NIL != var268) {
                SubLObject var271;
                final SubLObject var270 = var271 = var269;
                SubLObject var272 = (SubLObject)NIL;
                SubLObject var273 = (SubLObject)NIL;
                SubLObject var274 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var271, var270, (SubLObject)$ic288$);
                var272 = var271.first();
                var271 = var271.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var271, var270, (SubLObject)$ic288$);
                var273 = var271.first();
                var271 = var271.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var271, var270, (SubLObject)$ic288$);
                var274 = var271.first();
                var271 = var271.rest();
                if (NIL == var271) {
                    final SubLObject var275 = module0751.f46648(var274, (SubLObject)UNPROVIDED);
                    final SubLObject var276 = var272.numL(var267) ? var272 : var267;
                    final SubLObject var277 = Sequences.length(var275);
                    final SubLObject var278 = Numbers.max((SubLObject)ZERO_INTEGER, Numbers.subtract(var272, var267));
                    final SubLObject var279 = Numbers.subtract(Numbers.add(var272, var273), var278);
                    final SubLObject var280 = Numbers.min(var277, Numbers.add(var272, var273, var267));
                    final SubLObject var281 = module0038.f2623(var275, var278, var280);
                    SubLObject var282 = (SubLObject)ZERO_INTEGER;
                    final SubLObject var283 = module0015.$g490$.getGlobalValue();
                    final SubLObject var284 = f49471(var4, var262, var281, var263, var267);
                    module0642.f39020(module0015.$g240$.getGlobalValue());
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var283) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(var283));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    SubLObject var285 = module0015.$g533$.currentBinding(var264);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var264);
                        if (var272.isPositive()) {
                            module0642.f39019((SubLObject)$ic289$);
                        }
                        module0642.f39019(module0038.f2623(var281, (SubLObject)ZERO_INTEGER, var276));
                        var282 = var267;
                    }
                    finally {
                        module0015.$g533$.rebind(var285, var264);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    SubLObject var286 = var284;
                    SubLObject var287 = (SubLObject)NIL;
                    var287 = var286.first();
                    while (NIL != var286) {
                        SubLObject var332_333;
                        final SubLObject var330_331 = var332_333 = var287;
                        SubLObject var288 = (SubLObject)NIL;
                        SubLObject var289 = (SubLObject)NIL;
                        SubLObject var290 = (SubLObject)NIL;
                        SubLObject var291 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var332_333, var330_331, (SubLObject)$ic290$);
                        var288 = var332_333.first();
                        var332_333 = var332_333.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var332_333, var330_331, (SubLObject)$ic290$);
                        var289 = var332_333.first();
                        var332_333 = var332_333.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var332_333, var330_331, (SubLObject)$ic290$);
                        var290 = var332_333.first();
                        var332_333 = var332_333.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var332_333, var330_331, (SubLObject)$ic290$);
                        var291 = var332_333.first();
                        var332_333 = var332_333.rest();
                        if (NIL == var332_333) {
                            module0642.f39019(module0038.f2623(var281, var282, var289));
                            if (var289.isPositive() && NIL != Characters.alpha_char_p(Strings.sublisp_char(var281, module0048.f_1_(var289)))) {
                                module0642.f39019(var288);
                            }
                            else {
                                module0642.f39020(module0015.$g217$.getGlobalValue());
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var291) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(var291));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var292 = module0015.$g533$.currentBinding(var264);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var264);
                                    module0642.f39021(var288);
                                }
                                finally {
                                    module0015.$g533$.rebind(var292, var264);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39020(module0015.$g218$.getGlobalValue());
                            }
                            var282 = var290;
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var330_331, (SubLObject)$ic290$);
                        }
                        var286 = var286.rest();
                        var287 = var286.first();
                    }
                    module0642.f39019(module0038.f2623(var281, var282, var279));
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var283) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(var283));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    var285 = module0015.$g533$.currentBinding(var264);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var264);
                        module0642.f39019(module0038.f2623(var281, var279, (SubLObject)UNPROVIDED));
                        if (var280.numL(var277)) {
                            module0642.f39019((SubLObject)$ic289$);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var285, var264);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39020(module0015.$g241$.getGlobalValue());
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var270, (SubLObject)$ic288$);
                }
                var266 = (SubLObject)T;
                var268 = var268.rest();
                var269 = var268.first();
            }
        }
        return var200;
    }
    
    public static SubLObject f49452(final SubLObject var4, final SubLObject var266, final SubLObject var267, final SubLObject var262, final SubLObject var263) {
        final SubLThread var268 = SubLProcess.currentSubLThread();
        final SubLObject var269 = f49472(var267, var263);
        final SubLObject var270 = module0751.f46781((SubLObject)$ic291$, (SubLObject)ConsesLow.listS($ic292$, var266, (SubLObject)$ic293$), var263, (SubLObject)UNPROVIDED).first();
        SubLObject var271 = (SubLObject)makeBoolean(!var270.isString());
        final SubLObject var272 = $g6186$.getDynamicValue(var268);
        if (NIL == var271) {
            SubLObject var273 = var269;
            SubLObject var274 = (SubLObject)NIL;
            var274 = var273.first();
            while (NIL == var271 && NIL != var273) {
                SubLObject var276;
                final SubLObject var275 = var276 = var274;
                SubLObject var277 = (SubLObject)NIL;
                SubLObject var278 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var276, var275, (SubLObject)$ic294$);
                var277 = var276.first();
                var276 = var276.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var276, var275, (SubLObject)$ic294$);
                var278 = var276.first();
                var276 = var276.rest();
                if (NIL == var276) {
                    final SubLObject var279 = module0751.f46648(var270, (SubLObject)UNPROVIDED);
                    final SubLObject var280 = var277.numL(var272) ? var277 : var272;
                    final SubLObject var281 = Sequences.length(var279);
                    final SubLObject var282 = Numbers.max((SubLObject)ZERO_INTEGER, Numbers.subtract(var277, var272));
                    final SubLObject var283 = Numbers.subtract(Numbers.add(var277, var278), var282);
                    final SubLObject var284 = Numbers.min(var281, Numbers.add(var277, var278, var272));
                    final SubLObject var285 = module0038.f2623(var279, var282, var284);
                    SubLObject var286 = (SubLObject)ZERO_INTEGER;
                    final SubLObject var287 = module0015.$g490$.getGlobalValue();
                    final SubLObject var288 = f49471(var4, var262, var285, var263, var272);
                    module0642.f39020(module0015.$g240$.getGlobalValue());
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var287) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(var287));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    SubLObject var289 = module0015.$g533$.currentBinding(var268);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var268);
                        if (var277.isPositive()) {
                            module0642.f39019((SubLObject)$ic289$);
                        }
                        module0642.f39019(module0038.f2623(var285, (SubLObject)ZERO_INTEGER, var280));
                        var286 = var272;
                    }
                    finally {
                        module0015.$g533$.rebind(var289, var268);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    SubLObject var290 = var288;
                    SubLObject var291 = (SubLObject)NIL;
                    var291 = var290.first();
                    while (NIL != var290) {
                        SubLObject var342_343;
                        final SubLObject var340_341 = var342_343 = var291;
                        SubLObject var292 = (SubLObject)NIL;
                        SubLObject var293 = (SubLObject)NIL;
                        SubLObject var294 = (SubLObject)NIL;
                        SubLObject var295 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var342_343, var340_341, (SubLObject)$ic290$);
                        var292 = var342_343.first();
                        var342_343 = var342_343.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var342_343, var340_341, (SubLObject)$ic290$);
                        var293 = var342_343.first();
                        var342_343 = var342_343.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var342_343, var340_341, (SubLObject)$ic290$);
                        var294 = var342_343.first();
                        var342_343 = var342_343.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var342_343, var340_341, (SubLObject)$ic290$);
                        var295 = var342_343.first();
                        var342_343 = var342_343.rest();
                        if (NIL == var342_343) {
                            module0642.f39019(module0038.f2623(var285, var286, var293));
                            if (var293.isPositive() && NIL != Characters.alpha_char_p(Strings.sublisp_char(var285, module0048.f_1_(var293)))) {
                                module0642.f39019(var292);
                            }
                            else {
                                module0642.f39020(module0015.$g217$.getGlobalValue());
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var295) {
                                    module0642.f39020(module0015.$g222$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39042(var295));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var296 = module0015.$g533$.currentBinding(var268);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var268);
                                    module0642.f39021(var292);
                                }
                                finally {
                                    module0015.$g533$.rebind(var296, var268);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                module0642.f39020(module0015.$g218$.getGlobalValue());
                            }
                            var286 = var294;
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var340_341, (SubLObject)$ic290$);
                        }
                        var290 = var290.rest();
                        var291 = var290.first();
                    }
                    module0642.f39019(module0038.f2623(var285, var286, var283));
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var287) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(var287));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    var289 = module0015.$g533$.currentBinding(var268);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var268);
                        module0642.f39019(module0038.f2623(var285, var283, (SubLObject)UNPROVIDED));
                        if (var284.numL(var281)) {
                            module0642.f39019((SubLObject)$ic289$);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var289, var268);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39020(module0015.$g241$.getGlobalValue());
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var275, (SubLObject)$ic294$);
                }
                var271 = (SubLObject)T;
                var273 = var273.rest();
                var274 = var273.first();
            }
        }
        return var267;
    }
    
    public static SubLObject f49472(final SubLObject var267, final SubLObject var263) {
        return module0751.f46855((SubLObject)$ic295$, (SubLObject)ConsesLow.list($ic269$, (SubLObject)ConsesLow.listS($ic296$, var267, (SubLObject)$ic287$), (SubLObject)ConsesLow.listS($ic297$, var267, (SubLObject)$ic283$)), var263, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49464(final SubLObject var4, final SubLObject var187) {
        SubLObject var188 = f49307(var4, (SubLObject)$ic298$, (SubLObject)UNPROVIDED);
        if (NIL == module0067.f4852(var188)) {
            var188 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)TEN_INTEGER);
            f49308(var4, (SubLObject)$ic298$, var188);
        }
        SubLObject var189 = module0067.f4884(var188, var187, (SubLObject)$ic299$);
        if (!var189.isString()) {
            var189 = f49473(module0067.f4861(var188));
            module0067.f4886(var188, var187, var189);
        }
        return var189;
    }
    
    public static SubLObject f49473(final SubLObject var345) {
        return ConsesLow.nth(Numbers.mod(var345, Sequences.length($g6181$.getGlobalValue())), $g6181$.getGlobalValue());
    }
    
    public static SubLObject f49471(final SubLObject var4, final SubLObject var262, final SubLObject var326, final SubLObject var263, SubLObject var313) {
        if (var313 == UNPROVIDED) {
            var313 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var327 = (SubLObject)NIL;
        SubLObject var328 = (SubLObject)NIL;
        SubLObject var329 = (SubLObject)NIL;
        SubLObject var330 = (SubLObject)NIL;
        var328 = var262;
        var329 = var328.first();
        for (var330 = (SubLObject)ZERO_INTEGER; NIL != var328; var328 = var328.rest(), var329 = var328.first(), var330 = Numbers.add((SubLObject)ONE_INTEGER, var330)) {
            final SubLObject var331 = f49464(var4, var329);
            var327 = ConsesLow.append(var327, f49474(var329, var331, var326, var263, var313));
        }
        var327 = f49475(var327);
        return Sort.sort(var327, Symbols.symbol_function((SubLObject)$ic300$), Symbols.symbol_function((SubLObject)$ic301$));
    }
    
    public static SubLObject f49474(final SubLObject var187, final SubLObject var232, final SubLObject var326, final SubLObject var263, SubLObject var313) {
        if (var313 == UNPROVIDED) {
            var313 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var327 = (SubLObject)NIL;
        SubLObject var329;
        final SubLObject var328 = var329 = module0751.f46781((SubLObject)$ic302$, (SubLObject)ConsesLow.listS($ic303$, var187, (SubLObject)$ic304$), var263, (SubLObject)$ic305$);
        SubLObject var330 = (SubLObject)NIL;
        var330 = var329.first();
        while (NIL != var329) {
            var327 = ConsesLow.append(var327, f49476(var330, var232, var326, var313));
            var329 = var329.rest();
            var330 = var329.first();
        }
        return var327;
    }
    
    public static SubLObject f49476(SubLObject var334, final SubLObject var232, final SubLObject var326, SubLObject var313) {
        if (var313 == UNPROVIDED) {
            var313 = (SubLObject)ZERO_INTEGER;
        }
        SubLObject var335 = (SubLObject)NIL;
        var334 = f49477(var334);
        final SubLObject var336 = Sequences.length(var334);
        SubLObject var337 = module0038.f2689(var334, var326, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var338 = (SubLObject)NIL;
        var338 = var337.first();
        while (NIL != var337) {
            if (!var338.numL(var313) && !var338.numG(Numbers.subtract(Sequences.length(var326), Sequences.length(var334), var313))) {
                var335 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var334, var338, Numbers.add(var338, var336), var232), var335);
            }
            var337 = var337.rest();
            var338 = var337.first();
        }
        return var335;
    }
    
    public static SubLObject f49477(final SubLObject var334) {
        return module0038.f2669(var334, (SubLObject)$ic306$, (SubLObject)$ic307$);
    }
    
    public static SubLObject f49475(final SubLObject var311) {
        return module0035.f2462(var311, (SubLObject)$ic308$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49478(final SubLObject var349, final SubLObject var350) {
        return (SubLObject)makeBoolean(conses_high.second(var349).numLE(conses_high.second(var350)) && conses_high.third(var349).numGE(conses_high.third(var350)));
    }
    
    public static SubLObject f49479(final SubLObject var21, final SubLObject var161, SubLObject var351) {
        if (var351 == UNPROVIDED) {
            var351 = (SubLObject)NIL;
        }
        assert NIL != Types.integerp(var21) : var21;
        assert NIL != Types.integerp(var161) : var161;
        assert NIL != Types.booleanp(var351) : var351;
        final SubLObject var352 = f49407(var21, var161);
        if (NIL != f49371(var352)) {
            final SubLObject var353 = f49405(var352);
            if (NIL != module0537.f33305(var353)) {
                SubLObject var354 = module0191.f11967(var353);
                if (NIL != var351) {
                    var354 = (SubLObject)ConsesLow.list($ic310$, var354);
                }
                return var354;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49480(final SubLObject var21, final SubLObject var161, final SubLObject var95, SubLObject var351) {
        if (var351 == UNPROVIDED) {
            var351 = (SubLObject)NIL;
        }
        final SubLObject var352 = f49407(var21, var161);
        final SubLObject var353 = f49407(var21, (SubLObject)ZERO_INTEGER);
        return f49481(var21, var352, var353, var95, var351);
    }
    
    public static SubLObject f49481(final SubLObject var21, final SubLObject var133, final SubLObject var352, final SubLObject var95, final SubLObject var351) {
        SubLObject var353 = (SubLObject)NIL;
        SubLObject var354 = f49399(var352);
        SubLObject var355 = (SubLObject)NIL;
        var355 = var354.first();
        while (NIL != var354) {
            SubLObject var81_355 = f49481(var21, var133, var355, var95, var351);
            SubLObject var356 = (SubLObject)NIL;
            var356 = var81_355.first();
            while (NIL != var81_355) {
                final SubLObject var357 = var356;
                if (NIL == conses_high.member(var357, var353, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var353 = (SubLObject)ConsesLow.cons(var357, var353);
                }
                var81_355 = var81_355.rest();
                var356 = var81_355.first();
            }
            var354 = var354.rest();
            var355 = var354.first();
        }
        if (f49405(var352).eql(f49405(var133))) {
            var354 = f49482(var21, f49391(var352), var95, var351);
            SubLObject var358 = (SubLObject)NIL;
            var358 = var354.first();
            while (NIL != var354) {
                final SubLObject var359 = var358;
                if (NIL == conses_high.member(var359, var353, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var353 = (SubLObject)ConsesLow.cons(var359, var353);
                }
                var354 = var354.rest();
                var358 = var354.first();
            }
        }
        return var353;
    }
    
    public static SubLObject f49482(final SubLObject var21, final SubLObject var161, final SubLObject var95, SubLObject var351) {
        if (var351 == UNPROVIDED) {
            var351 = (SubLObject)NIL;
        }
        final SubLThread var352 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var21) : var21;
        assert NIL != Types.integerp(var161) : var161;
        assert NIL != Types.booleanp(var351) : var351;
        final SubLObject var353 = f49407(var21, var161);
        if (NIL != f49371(var353)) {
            final SubLObject var354 = f49405(var353);
            SubLObject var355 = (SubLObject)NIL;
            if (NIL != module0537.f33305(var354)) {
                SubLObject var356 = module0191.f11967(var354);
                final SubLObject var357 = module0285.f18875((SubLObject)ConsesLow.list($ic312$, var95), (SubLObject)UNPROVIDED);
                if (NIL != var351) {
                    var356 = (SubLObject)ConsesLow.list($ic310$, var356);
                }
                final SubLObject var358 = module0543.f33655(var356, var357, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var358) {
                    return (SubLObject)NIL;
                }
                final SubLObject var359 = $g6198$.currentBinding(var352);
                try {
                    $g6198$.bind((SubLObject)NIL, var352);
                    if (NIL != var351) {
                        f49463(var353, var354);
                    }
                    else {
                        f49462(var353, var354);
                    }
                    var355 = $g6198$.getDynamicValue(var352);
                }
                finally {
                    $g6198$.rebind(var359, var352);
                }
                return var355;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49483(final SubLObject var21, final SubLObject var161) {
        assert NIL != Types.integerp(var21) : var21;
        assert NIL != Types.integerp(var161) : var161;
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49484(final SubLObject var21, final SubLObject var161) {
        final SubLObject var162 = f49407(var21, var161);
        if (NIL == f49371(var162)) {
            return (SubLObject)NIL;
        }
        final SubLObject var163 = f49405(var162);
        if (NIL != module0191.f11950(var163)) {
            return module0191.f11967(var163);
        }
        if (NIL != module0206.f13425(var163)) {
            return var163;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49485(final SubLObject var358, final SubLObject var359, final SubLObject var360) {
        final SubLThread var361 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var358) : var358;
        assert NIL != Types.integerp(var359) : var359;
        assert NIL != Types.integerp(var360) : var360;
        SubLObject var362 = (SubLObject)ZERO_INTEGER;
        SubLObject var363 = (SubLObject)NIL;
        try {
            var361.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var364 = Errors.$error_handler$.currentBinding(var361);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic316$, var361);
                try {
                    final SubLObject var365 = module0361.f24195(var358, var359);
                    final SubLObject var366 = module0775.f49670(var365);
                    final SubLObject var367 = inference_datastructures_inference_oc.f25617(var358, var359, var360);
                    final SubLObject var368 = module0775.f49679(var367);
                    SubLObject var370;
                    final SubLObject var369 = var370 = f49486(var368);
                    SubLObject var371 = (SubLObject)NIL;
                    var371 = var370.first();
                    while (NIL != var370) {
                        final SubLObject var372 = f49487(var371, var367, var366);
                        final SubLObject var373 = f49488(var372);
                        var362 = Numbers.add(var362, (SubLObject)ONE_INTEGER);
                        module0623.f38420(var373);
                        var370 = var370.rest();
                        var371 = var370.first();
                    }
                }
                catch (Throwable var374) {
                    Errors.handleThrowable(var374, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var364, var361);
            }
        }
        catch (Throwable var375) {
            var363 = Errors.handleThrowable(var375, module0003.$g3$.getGlobalValue());
        }
        finally {
            var361.throwStack.pop();
        }
        if (NIL != var363) {
            return var363;
        }
        return var362;
    }
    
    public static SubLObject f49486(final SubLObject var363) {
        if (NIL != Sequences.find_if((SubLObject)$ic317$, var363, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return Sort.sort(var363, (SubLObject)$ic300$, (SubLObject)$ic318$);
        }
        return Sort.sort(var363, (SubLObject)$ic300$, (SubLObject)$ic319$);
    }
    
    public static SubLObject f49489(final SubLObject var358, final SubLObject var359, final SubLObject var360) {
        final SubLThread var361 = SubLProcess.currentSubLThread();
        assert NIL != Types.integerp(var358) : var358;
        assert NIL != Types.integerp(var359) : var359;
        assert NIL != Types.integerp(var360) : var360;
        final SubLObject var362 = module0361.f24195(var358, var359);
        final SubLObject var363 = module0775.f49670(var362);
        final SubLObject var364 = inference_datastructures_inference_oc.f25617(var358, var359, var360);
        final SubLObject var365 = Sort.sort(module0775.f49679(var364), (SubLObject)$ic300$, (SubLObject)$ic319$);
        SubLObject var366 = (SubLObject)NIL;
        PrintLow.format((SubLObject)T, (SubLObject)$ic321$, var364);
        PrintLow.format((SubLObject)T, (SubLObject)$ic322$, var365);
        SubLObject var367 = var365;
        SubLObject var368 = (SubLObject)NIL;
        var368 = var367.first();
        while (NIL != var367) {
            final SubLObject var369 = f49487(var368, var364, var363);
            f49323(var369, module0579.$g4283$.getDynamicValue(var361));
            var366 = (SubLObject)ConsesLow.cons(f49488(var369), var366);
            var367 = var367.rest();
            var368 = var367.first();
        }
        return Sequences.nreverse(var366);
    }
    
    public static SubLObject f49490(final SubLObject var200, final SubLObject var263, SubLObject var368, SubLObject var369, SubLObject var118, SubLObject var119) {
        if (var368 == UNPROVIDED) {
            var368 = (SubLObject)NIL;
        }
        if (var369 == UNPROVIDED) {
            var369 = (SubLObject)T;
        }
        if (var118 == UNPROVIDED) {
            var118 = (SubLObject)T;
        }
        if (var119 == UNPROVIDED) {
            var119 = (SubLObject)T;
        }
        final SubLThread var370 = SubLProcess.currentSubLThread();
        final SubLObject var371 = module0409.f28515(var200, var263, module0360.f23793(var368));
        SubLObject var372 = (SubLObject)NIL;
        module0409.f28521(var371, conses_high.putf(module0360.f23805(var368), (SubLObject)$ic324$, (SubLObject)ONE_INTEGER));
        if (NIL != inference_datastructures_inference_oc.f25615(var371)) {
            final SubLObject var373 = inference_datastructures_inference_oc.f25492(var371);
            if (NIL == module0065.f4772(var373, (SubLObject)$ic67$)) {
                final SubLObject var70_371 = var373;
                if (NIL == module0065.f4775(var70_371, (SubLObject)$ic67$)) {
                    final SubLObject var374 = module0065.f4740(var70_371);
                    final SubLObject var375 = (SubLObject)NIL;
                    SubLObject var376;
                    SubLObject var377;
                    SubLObject var378;
                    SubLObject var379;
                    SubLObject var380;
                    SubLObject var381;
                    SubLObject var382;
                    SubLObject var383;
                    SubLObject var384;
                    SubLObject var385;
                    for (var376 = Sequences.length(var374), var377 = (SubLObject)NIL, var377 = (SubLObject)ZERO_INTEGER; var377.numL(var376); var377 = Numbers.add(var377, (SubLObject)ONE_INTEGER)) {
                        var378 = ((NIL != var375) ? Numbers.subtract(var376, var377, (SubLObject)ONE_INTEGER) : var377);
                        var379 = Vectors.aref(var374, var378);
                        if (NIL == module0065.f4749(var379) || NIL == module0065.f4773((SubLObject)$ic67$)) {
                            if (NIL != module0065.f4749(var379)) {
                                var379 = (SubLObject)$ic67$;
                            }
                            if (NIL == var372 && NIL == var372) {
                                var380 = Sort.sort(module0775.f49679(var379), Symbols.symbol_function((SubLObject)$ic300$), (SubLObject)$ic319$);
                                var381 = (SubLObject)NIL;
                                var381 = var380.first();
                                while (NIL == var372 && NIL != var380) {
                                    var382 = f49292(var381, var379);
                                    f49341(var382, var369);
                                    f49354(var382, var118);
                                    f49356(var382, var119);
                                    f49491(var382, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    var383 = (SubLObject)NIL;
                                    try {
                                        var383 = streams_high.make_private_string_output_stream();
                                        var384 = module0587.$g4457$.currentBinding(var370);
                                        try {
                                            module0587.$g4457$.bind(var383, var370);
                                            f49492(var382);
                                        }
                                        finally {
                                            module0587.$g4457$.rebind(var384, var370);
                                        }
                                        var372 = streams_high.get_output_stream_string(var383);
                                    }
                                    finally {
                                        var385 = Threads.$is_thread_performing_cleanupP$.currentBinding(var370);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var370);
                                            streams_high.close(var383, (SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var385, var370);
                                        }
                                    }
                                    var380 = var380.rest();
                                    var381 = var380.first();
                                }
                            }
                        }
                    }
                }
                final SubLObject var76_374 = var373;
                if (NIL == module0065.f4777(var76_374)) {
                    final SubLObject var386 = module0065.f4738(var76_374);
                    SubLObject var387 = (SubLObject)NIL;
                    SubLObject var388 = (SubLObject)NIL;
                    final Iterator var389 = Hashtables.getEntrySetIterator(var386);
                    try {
                        while (Hashtables.iteratorHasNext(var389)) {
                            final Map.Entry var390 = Hashtables.iteratorNextEntry(var389);
                            var387 = Hashtables.getEntryKey(var390);
                            var388 = Hashtables.getEntryValue(var390);
                            if (NIL == var372 && NIL == var372) {
                                SubLObject var391 = Sort.sort(module0775.f49679(var388), Symbols.symbol_function((SubLObject)$ic300$), (SubLObject)$ic319$);
                                SubLObject var392 = (SubLObject)NIL;
                                var392 = var391.first();
                                while (NIL == var372 && NIL != var391) {
                                    final SubLObject var393 = f49292(var392, var388);
                                    f49341(var393, var369);
                                    f49354(var393, var118);
                                    f49356(var393, var119);
                                    f49491(var393, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    SubLObject var394 = (SubLObject)NIL;
                                    try {
                                        var394 = streams_high.make_private_string_output_stream();
                                        final SubLObject var395 = module0587.$g4457$.currentBinding(var370);
                                        try {
                                            module0587.$g4457$.bind(var394, var370);
                                            f49492(var393);
                                        }
                                        finally {
                                            module0587.$g4457$.rebind(var395, var370);
                                        }
                                        var372 = streams_high.get_output_stream_string(var394);
                                    }
                                    finally {
                                        final SubLObject var396 = Threads.$is_thread_performing_cleanupP$.currentBinding(var370);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var370);
                                            streams_high.close(var394, (SubLObject)UNPROVIDED);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var396, var370);
                                        }
                                    }
                                    var391 = var391.rest();
                                    var392 = var391.first();
                                }
                            }
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(var389);
                    }
                }
            }
        }
        inference_datastructures_inference_oc.f25471(var371);
        return var372;
    }
    
    public static SubLObject f49493(final SubLObject var21) {
        final SubLThread var22 = SubLProcess.currentSubLThread();
        final SubLObject var23 = f49287(var21);
        SubLObject var24 = (SubLObject)NIL;
        if (NIL == var23) {
            Errors.error((SubLObject)$ic326$, var21);
        }
        SubLObject var25 = (SubLObject)NIL;
        try {
            var25 = streams_high.make_private_string_output_stream();
            final SubLObject var26 = module0587.$g4457$.currentBinding(var22);
            try {
                module0587.$g4457$.bind(var25, var22);
                f49492(var23);
            }
            finally {
                module0587.$g4457$.rebind(var26, var22);
            }
            var24 = streams_high.get_output_stream_string(var25);
        }
        finally {
            final SubLObject var27 = Threads.$is_thread_performing_cleanupP$.currentBinding(var22);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var22);
                streams_high.close(var25, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var27, var22);
            }
        }
        return var24;
    }
    
    public static SubLObject f49492(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f49296(var4);
        try {
            final SubLObject var7 = module0601.$g4652$.currentBinding(var5);
            final SubLObject var8 = module0601.$g4654$.currentBinding(var5);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var5), module0601.$g4652$.getDynamicValue(var5)), var5);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var5), var5);
                module0601.f36758((SubLObject)$ic327$, (SubLObject)ConsesLow.list((SubLObject)$ic328$, var6), (SubLObject)NIL, (SubLObject)NIL);
                f49494(f49394(var4));
            }
            finally {
                module0601.$g4654$.rebind(var8, var5);
                module0601.$g4652$.rebind(var7, var5);
            }
        }
        finally {
            final SubLObject var9 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var5);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic327$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var9, var5);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49495(final SubLObject var4) {
        f49496(var4, (SubLObject)$ic329$, (SubLObject)$ic330$);
        return var4;
    }
    
    public static SubLObject f49497(final SubLObject var4) {
        f49496(var4, (SubLObject)$ic331$, (SubLObject)$ic332$);
        return var4;
    }
    
    public static SubLObject f49498(final SubLObject var4) {
        f49496(var4, (SubLObject)$ic333$, (SubLObject)$ic334$);
        return var4;
    }
    
    public static SubLObject f49499(final SubLObject var4) {
        f49496(var4, (SubLObject)$ic335$, (SubLObject)$ic336$);
        return var4;
    }
    
    public static SubLObject f49496(final SubLObject var4, final SubLObject var375, final SubLObject var376) {
        final SubLThread var377 = SubLProcess.currentSubLThread();
        final SubLObject var378 = f49296(var4);
        final SubLObject var379 = f49307(var4, var375, (SubLObject)UNPROVIDED);
        try {
            final SubLObject var380 = module0601.$g4652$.currentBinding(var377);
            final SubLObject var381 = module0601.$g4654$.currentBinding(var377);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var377), module0601.$g4652$.getDynamicValue(var377)), var377);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var377), var377);
                module0601.f36758(var376, (SubLObject)ConsesLow.list((SubLObject)$ic337$, var378), (SubLObject)NIL, (SubLObject)NIL);
                if (NIL != var379) {
                    final SubLObject var382 = f49399(var379);
                    if (NIL != module0035.f2013(var382)) {
                        SubLObject var383 = var382;
                        SubLObject var384 = (SubLObject)NIL;
                        var384 = var383.first();
                        while (NIL != var383) {
                            f49494(var384);
                            var383 = var383.rest();
                            var384 = var383.first();
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var381, var377);
                module0601.$g4652$.rebind(var380, var377);
            }
        }
        finally {
            final SubLObject var385 = Threads.$is_thread_performing_cleanupP$.currentBinding(var377);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var377);
                module0601.f36746();
                module0601.f36760(var376);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var385, var377);
            }
        }
        return var4;
    }
    
    public static SubLObject f49494(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f49391(var2);
        final SubLObject var5 = f49261(var2);
        final SubLObject var6 = f49296(var5);
        final SubLObject var7 = f49500(var2);
        try {
            final SubLObject var8 = module0601.$g4652$.currentBinding(var3);
            final SubLObject var9 = module0601.$g4654$.currentBinding(var3);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var3), module0601.$g4652$.getDynamicValue(var3)), var3);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var3), var3);
                module0601.f36758((SubLObject)$ic338$, var7, (SubLObject)NIL, (SubLObject)NIL);
                if (!var2.eql(f49394(var5))) {
                    SubLObject var11;
                    final SubLObject var10 = var11 = f49440(var6, var4);
                    SubLObject var12 = (SubLObject)NIL;
                    SubLObject var13 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic339$);
                    var12 = var11.first();
                    var11 = var11.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var11, var10, (SubLObject)$ic339$);
                    var13 = var11.first();
                    var11 = var11.rest();
                    if (NIL == var11) {
                        module0797.f50959(var12, (SubLObject)UNPROVIDED);
                        if (NIL != f49331(var5)) {
                            final SubLObject var14 = (SubLObject)$ic340$;
                            module0601.f36758(var14, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0601.f36754(print_high.princ_to_string(var13));
                            module0601.f36760(var14);
                        }
                        if (NIL != f49340(var5)) {
                            f49501(var13);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var10, (SubLObject)$ic339$);
                    }
                }
                final SubLObject var15 = f49399(var2);
                if (NIL != module0035.f2013(var15)) {
                    try {
                        final SubLObject var64_381 = module0601.$g4652$.currentBinding(var3);
                        final SubLObject var207_382 = module0601.$g4654$.currentBinding(var3);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var3), module0601.$g4652$.getDynamicValue(var3)), var3);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var3), var3);
                            module0601.f36758((SubLObject)$ic341$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var16 = var15;
                            SubLObject var17 = (SubLObject)NIL;
                            var17 = var16.first();
                            while (NIL != var16) {
                                f49494(var17);
                                var16 = var16.rest();
                                var17 = var16.first();
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var207_382, var3);
                            module0601.$g4652$.rebind(var64_381, var3);
                        }
                    }
                    finally {
                        final SubLObject var64_382 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic341$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var64_382, var3);
                        }
                    }
                }
            }
            finally {
                module0601.$g4654$.rebind(var9, var3);
                module0601.$g4652$.rebind(var8, var3);
            }
        }
        finally {
            final SubLObject var18 = Threads.$is_thread_performing_cleanupP$.currentBinding(var3);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var3);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic338$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var18, var3);
            }
        }
        return var2;
    }
    
    public static SubLObject f49502(final SubLObject var127) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49500(final SubLObject var2) {
        final SubLObject var3 = f49391(var2);
        final SubLObject var4 = f49434(var2);
        final SubLObject var5 = f49260(var2);
        final SubLObject var6 = module0537.f33305(f49405(var2));
        final SubLObject var7 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic328$, print_high.princ_to_string(var3), $ic342$, module0601.f36814(var4), $ic343$, var5, $ic344$, Strings.string_downcase(print_high.princ_to_string(f49404(var2)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), $ic345$, module0601.f36814(var6) });
        return var7;
    }
    
    public static SubLObject f49501(final SubLObject var205) {
        final SubLThread var206 = SubLProcess.currentSubLThread();
        try {
            final SubLObject var207 = module0601.$g4652$.currentBinding(var206);
            final SubLObject var208 = module0601.$g4654$.currentBinding(var206);
            try {
                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var206), module0601.$g4652$.getDynamicValue(var206)), var206);
                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var206), var206);
                module0601.f36758((SubLObject)$ic346$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                if (NIL != module0206.f13444(var205)) {
                    module0797.f50965(var205);
                }
                else if (NIL != module0206.f13425(var205)) {
                    module0797.f50960(var205);
                }
                else if (NIL != var205) {
                    cycml_generator_oc.f51056(var205);
                }
            }
            finally {
                module0601.$g4654$.rebind(var208, var206);
                module0601.$g4652$.rebind(var207, var206);
            }
        }
        finally {
            final SubLObject var209 = Threads.$is_thread_performing_cleanupP$.currentBinding(var206);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var206);
                module0601.f36746();
                module0601.f36760((SubLObject)$ic346$);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var209, var206);
            }
        }
        return var205;
    }
    
    public static SubLObject f49488(final SubLObject var4) {
        assert NIL != f49284(var4) : var4;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = f49310(var4);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            var5 = (SubLObject)ConsesLow.cons(f49503(var7), var5);
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)ConsesLow.list((SubLObject)$ic35$, f49296(var4), (SubLObject)$ic347$, Sequences.nreverse(var5));
    }
    
    public static SubLObject f49503(final SubLObject var133) {
        assert NIL != f49371(var133) : var133;
        final SubLObject var134 = f49391(var133);
        final SubLObject var135 = f49403(var133);
        final SubLObject var136 = (SubLObject)((NIL != f49434(var133)) ? $ic348$ : $ic349$);
        final SubLObject var137 = f49260(var133);
        final SubLObject var138 = (SubLObject)((NIL != module0537.f33305(f49405(var133))) ? $ic348$ : $ic349$);
        SubLObject var139 = (SubLObject)NIL;
        var139 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic35$, var134, $ic140$, var135, $ic184$, var136, $ic141$, var137, $ic350$, var138 });
        return var139;
    }
    
    public static SubLObject f49504() {
        return f49292((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49505(final SubLObject var4, final SubLObject var62) {
        assert NIL != f49270(var4) : var4;
        assert NIL != module0366.f24916(var62) : var62;
        f49277(var4, var62);
        return var4;
    }
    
    public static SubLObject f49506(final SubLObject var4, final SubLObject var121) {
        assert NIL != f49270(var4) : var4;
        assert NIL != inference_datastructures_inference_oc.f25684(var121) : var121;
        f49278(var4, var121);
        return var4;
    }
    
    public static SubLObject f49487(final SubLObject var62, final SubLObject var121, SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = module0775.f49670(inference_datastructures_inference_oc.f25732(var121));
        }
        assert NIL != module0366.f24916(var62) : var62;
        assert NIL != inference_datastructures_inference_oc.f25684(var121) : var121;
        final SubLObject var264 = f49292(var62, var121);
        f49491(var264, var263, (SubLObject)UNPROVIDED);
        return var264;
    }
    
    public static SubLObject f49491(final SubLObject var4, SubLObject var263, SubLObject var388) {
        if (var263 == UNPROVIDED) {
            var263 = module0775.f49670(inference_datastructures_inference_oc.f25732(f49267(var4)));
        }
        if (var388 == UNPROVIDED) {
            var388 = (SubLObject)$ic352$;
        }
        final SubLThread var389 = SubLProcess.currentSubLThread();
        assert NIL != f49270(var4) : var4;
        assert NIL != module0161.f10481(var263) : var263;
        assert NIL != Types.stringp(var388) : var388;
        final SubLObject var390 = module0579.$g4262$.currentBinding(var389);
        final SubLObject var391 = module0579.$g4260$.currentBinding(var389);
        final SubLObject var392 = module0579.$g4283$.currentBinding(var389);
        try {
            module0579.$g4262$.bind(f49360(var4), var389);
            module0579.$g4260$.bind(f49357(var4), var389);
            module0579.$g4283$.bind(f49322(var4), var389);
            final SubLObject var394;
            final SubLObject var393 = var394 = f49303(var4);
            final SubLObject var64_389 = module0034.$g879$.currentBinding(var389);
            try {
                module0034.$g879$.bind(var394, var389);
                SubLObject var395 = (SubLObject)NIL;
                if (NIL != var394 && NIL == module0034.f1842(var394)) {
                    var395 = module0034.f1869(var394);
                    final SubLObject var396 = Threads.current_process();
                    if (NIL == var395) {
                        module0034.f1873(var394, var396);
                    }
                    else if (!var395.eql(var396)) {
                        Errors.error((SubLObject)$ic195$);
                    }
                }
                try {
                    f49323(var4, module0579.$g4283$.getDynamicValue(var389));
                }
                finally {
                    final SubLObject var64_390 = Threads.$is_thread_performing_cleanupP$.currentBinding(var389);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var389);
                        f49507(var4, var263);
                        if (NIL != f49263(var4)) {
                            f49508(var4);
                        }
                        if (NIL != f49325(var4)) {
                            f49509(var4);
                        }
                        f49510(var4, var263, var388);
                        f49511(var4);
                        if (NIL != f49263(var4)) {
                            f49512(var4, var263);
                        }
                        f49513(var4, var263);
                        f49514(var4);
                        f49515(var4);
                        if (NIL != var394 && NIL == var395) {
                            module0034.f1873(var394, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var64_390, var389);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var64_389, var389);
            }
        }
        finally {
            module0579.$g4283$.rebind(var392, var389);
            module0579.$g4260$.rebind(var391, var389);
            module0579.$g4262$.rebind(var390, var389);
        }
        f49365(var4, (SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f49516() {
        return (SubLObject)$ic354$;
    }
    
    public static SubLObject f49507(final SubLObject var4, final SubLObject var263) {
        final SubLObject var264 = f49267(var4);
        final SubLObject var265 = inference_datastructures_inference_oc.f25732(var264);
        final SubLObject var266 = inference_datastructures_inference_oc.f25423(var265);
        final SubLObject var267 = (NIL != module0202.f12883(var266, (SubLObject)UNPROVIDED)) ? module0205.f13204(var266, (SubLObject)UNPROVIDED) : var266;
        final SubLObject var268 = inference_datastructures_inference_oc.f25687(var264);
        final SubLObject var269 = f49397(var4, (SubLObject)$ic355$, (SubLObject)NIL, (SubLObject)$ic190$, var267, (SubLObject)UNPROVIDED);
        f49393(var269);
        f49308(var4, (SubLObject)$ic356$, var269);
        final SubLObject var270 = (SubLObject)$ic357$;
        SubLObject var271 = (SubLObject)NIL;
        if (NIL == var268) {
            final SubLObject var272 = f49516();
            var271 = f49397(var4, var270, var269, (SubLObject)$ic188$, var272, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0035.f1997(var268)) {
            final SubLObject var273 = var268.first();
            final SubLObject var274 = module0233.f15370(var273);
            var271 = f49397(var4, var270, var269, (SubLObject)$ic188$, var274, (SubLObject)UNPROVIDED);
        }
        else if (NIL != module0202.f12925(var267)) {
            final SubLObject var275 = f49266(var4);
            final SubLObject var276 = module0775.f49673(var275, var263);
            final SubLObject var277 = (SubLObject)((NIL != assertion_handles_oc.f11035(var276)) ? $ic192$ : $ic189$);
            var271 = f49397(var4, var270, var269, var277, var276, (SubLObject)UNPROVIDED);
        }
        else {
            var271 = f49397(var4, var270, var269, (SubLObject)$ic219$, var268, (SubLObject)UNPROVIDED);
        }
        f49393(var271);
        return var4;
    }
    
    public static SubLObject f49508(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f49396(var4, $g6177$.getDynamicValue(var5));
        f49308(var4, (SubLObject)$ic329$, var6);
        return var6;
    }
    
    public static SubLObject f49509(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f49396(var4, $g6178$.getDynamicValue(var5));
        f49308(var4, (SubLObject)$ic358$, var6);
        return var6;
    }
    
    public static SubLObject f49514(final SubLObject var4) {
        final SubLObject var5 = f49339(var4);
        if (NIL != var5 && NIL == f49399(var5)) {
            f49402(var4, var5);
            f49368(var4, (SubLObject)$ic329$);
        }
        return var4;
    }
    
    public static SubLObject f49339(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic329$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49517(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic358$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49422(final SubLObject var4) {
        return f49307(var4, (SubLObject)$ic356$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49518(final SubLObject var4) {
        final SubLObject var5 = f49339(var4);
        return (SubLObject)((NIL != f49371(var5)) ? f49399(var5) : NIL);
    }
    
    public static SubLObject f49512(final SubLObject var4, final SubLObject var263) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        if (NIL != module0579.$g4347$.getDynamicValue(var264)) {
            final SubLObject var265 = f49519(var4);
            final SubLObject var266 = (SubLObject)ONE_INTEGER;
            if (NIL != module0035.f2000(var265, var266, (SubLObject)UNPROVIDED)) {
                final SubLObject var267 = f49339(var4);
                SubLObject var268 = f49520(var4, var263, var265);
                SubLObject var269 = (SubLObject)NIL;
                var269 = var268.first();
                while (NIL != var268) {
                    f49521(var4, var267, var269, var263);
                    var268 = var268.rest();
                    var269 = var268.first();
                }
                f49393(var267);
            }
        }
        return var4;
    }
    
    public static SubLObject f49519(final SubLObject var4) {
        final SubLObject var5 = f49522(var4);
        final SubLObject var6 = module0035.f2462(var5, (SubLObject)$ic359$, (SubLObject)UNPROVIDED);
        final SubLObject var7 = Sequences.remove_if((SubLObject)$ic360$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (NIL != var7) ? var7 : var6;
    }
    
    public static SubLObject f49523(final SubLObject var403) {
        return module0205.f13145((SubLObject)$ic361$, f49427(var403), (SubLObject)T, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49522(final SubLObject var4) {
        final SubLObject var5 = f49417(var4);
        SubLObject var6 = (SubLObject)NIL;
        if (NIL != var5) {
            SubLObject var7 = f49399(var5);
            SubLObject var8 = (SubLObject)NIL;
            var8 = var7.first();
            while (NIL != var7) {
                var6 = ConsesLow.append(var6, f49524(var8));
                var7 = var7.rest();
                var8 = var7.first();
            }
        }
        return Sequences.delete_duplicates(var6, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic362$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49417(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f49394(var4);
        SubLObject var7 = f49399(var6);
        SubLObject var8 = (SubLObject)NIL;
        var8 = var7.first();
        while (NIL != var7) {
            if (f49260(var8).equal($g6175$.getDynamicValue(var5))) {
                return var8;
            }
            var7 = var7.rest();
            var8 = var7.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49524(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = f49405(var2);
        final SubLObject var6 = (SubLObject)makeBoolean(NIL == f49525(var5) || NIL != f49526(var5, var2));
        if (NIL != f49527(var2)) {
            var4 = f49528(var5, var4, var2);
        }
        else if (NIL != Sequences.find_if((SubLObject)$ic363$, f49399(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == var6 && NIL == f49529(var5, f49261(var2))) {
            if (NIL != $g6197$.getDynamicValue(var3)) {
                Errors.warn((SubLObject)$ic364$, var5);
            }
            var4 = f49528(var5, var4, var2);
        }
        else if (NIL != f49530(var5) && NIL == f49529(var5, f49261(var2)) && NIL == f49523(var5)) {
            if (NIL != $g6197$.getDynamicValue(var3)) {
                Errors.warn((SubLObject)$ic365$, var5);
            }
            if (NIL == var6) {
                var4 = f49528(var5, var4, var2);
            }
        }
        else if (NIL != module0191.f11950(var5) && $ic366$.eql(module0191.f11965(var5)) && NIL == f49529(var5, f49261(var2))) {
            if (NIL != $g6197$.getDynamicValue(var3)) {
                Errors.warn((SubLObject)$ic367$, var5);
            }
            if (NIL == var6) {
                var4 = f49528(var5, var4, var2);
            }
        }
        else {
            final SubLObject var7 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var8 = f49399(var2);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL != var8) {
                module0067.f4886(var7, var9, f49524(var9));
                var8 = var8.rest();
                var9 = var8.first();
            }
            final SubLObject var10 = (SubLObject)((NIL != module0067.f4882(var7)) ? NIL : Sequences.remove_duplicates(Functions.apply((SubLObject)$ic368$, module0067.f4903(var7)), Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)$ic369$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL != module0035.f2013(var10) && (NIL == module0035.f1997(var10) || !module0035.f2113(var10).equal(var5))) {
                if (NIL != $g6197$.getDynamicValue(var3)) {
                    Errors.warn((SubLObject)$ic370$, f49391(var2), f49427(var5), Mapping.mapcar((SubLObject)$ic369$, var10));
                }
                SubLObject var11;
                for (var11 = module0066.f4838(module0067.f4891(var7)); NIL == module0066.f4841(var11); var11 = module0066.f4840(var11)) {
                    var3.resetMultipleValues();
                    final SubLObject var12 = module0066.f4839(var11);
                    final SubLObject var13 = var3.secondMultipleValue();
                    var3.resetMultipleValues();
                    SubLObject var14 = var13;
                    SubLObject var15 = (SubLObject)NIL;
                    var15 = var14.first();
                    while (NIL != var14) {
                        var4 = f49528(var15, var4, var12);
                        var14 = var14.rest();
                        var15 = var14.first();
                    }
                }
                module0066.f4842(var11);
            }
            else if (NIL != var6) {
                if (NIL != $g6197$.getDynamicValue(var3)) {
                    Errors.warn((SubLObject)$ic371$, var5);
                }
            }
            else {
                if (NIL != module0035.f2012(var10) && NIL != $g6197$.getDynamicValue(var3)) {
                    Errors.warn((SubLObject)$ic372$, var5);
                }
                var4 = f49531(var5, var4);
            }
        }
        return var4;
    }
    
    public static SubLObject f49526(final SubLObject var399, final SubLObject var2) {
        final SubLThread var400 = SubLProcess.currentSubLThread();
        final SubLObject var401 = f49261(var2);
        final SubLObject var402 = module0751.f46998(module0202.f12769($ic373$, module0775.f49747(), module0775.f49799(), module0775.f49670(inference_datastructures_inference_oc.f25732(f49267(var401)))));
        if (NIL != f49334(var401) && (NIL != f49435(var2) || (NIL != assertion_handles_oc.f11035(var399) && NIL != module0775.f49864(var399)))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0191.f11950(var399) && NIL != module0775.f49798(var399, var402)) {
            if (NIL != $g6197$.getDynamicValue(var400)) {
                Errors.warn((SubLObject)$ic374$, var399);
            }
            return (SubLObject)T;
        }
        if (NIL != f49529(var399, f49261(var2))) {
            if (NIL != $g6197$.getDynamicValue(var400)) {
                Errors.warn((SubLObject)$ic375$, var399);
            }
            return (SubLObject)T;
        }
        if (NIL != assertion_handles_oc.f11035(var399) && NIL != module0178.f11375(var399) && NIL != f49523(var399)) {
            if (NIL != $g6197$.getDynamicValue(var400)) {
                Errors.warn((SubLObject)$ic376$, var399);
            }
            return (SubLObject)T;
        }
        if (NIL != module0207.f13509(var399) && NIL != module0775.f49719(var399, var402)) {
            return (SubLObject)T;
        }
        if (NIL != f49527(var2)) {
            return f49532(var2);
        }
        if (NIL == module0794.f50813(module0172.f10922(f49427(var399)), (SubLObject)NIL)) {
            if (NIL != $g6197$.getDynamicValue(var400)) {
                Errors.warn((SubLObject)$ic377$, var399);
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49532(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL != f49527(var2)) {
            final SubLObject var4 = f49405(var2);
            if (NIL != module0775.f49798(var4, (SubLObject)UNPROVIDED) || NIL == module0220.f14548(var4, $ic378$, module0579.$g4260$.getDynamicValue(var3), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49533(final SubLObject var399, final SubLObject var4) {
        final SubLThread var400 = SubLProcess.currentSubLThread();
        final SubLObject var401 = inference_datastructures_inference_oc.f25732(f49267(var4));
        final SubLObject var402 = module0775.f49673(f49266(var4), module0775.f49670(var401));
        final SubLObject var403 = f49427(var399);
        SubLObject var404 = (SubLObject)NIL;
        SubLObject var405 = (SubLObject)((NIL != module0202.f12595(var402)) ? module0205.f13207(var402, (SubLObject)UNPROVIDED) : ConsesLow.list(var402));
        SubLObject var406 = (SubLObject)NIL;
        var406 = var405.first();
        while (NIL != var405) {
            final SubLObject var407 = f49427(var406);
            if (var403.equal(var407)) {
                var404 = (SubLObject)ConsesLow.cons(var407, var404);
            }
            var405 = var405.rest();
            var406 = var405.first();
        }
        if (NIL != var404) {
            final SubLObject var408 = inference_datastructures_inference_oc.f25487(var401);
            SubLObject var409 = var404;
            SubLObject var410 = (SubLObject)NIL;
            var410 = var409.first();
            while (NIL != var409) {
                SubLObject var81_418 = var408;
                SubLObject var411 = (SubLObject)NIL;
                var411 = var81_418.first();
                while (NIL != var81_418) {
                    SubLObject var81_419 = module0232.f15308(var411);
                    SubLObject var412 = (SubLObject)NIL;
                    var412 = var81_419.first();
                    while (NIL != var81_419) {
                        SubLObject var414;
                        final SubLObject var413 = var414 = var412;
                        SubLObject var415 = (SubLObject)NIL;
                        SubLObject var416 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var414, var413, (SubLObject)$ic380$);
                        var415 = var414.first();
                        var414 = var414.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var414, var413, (SubLObject)$ic380$);
                        var416 = var414.first();
                        var414 = var414.rest();
                        if (NIL == var414) {
                            final SubLObject var417 = module0235.f15475(var410, var416, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            SubLObject var418 = Types.sublisp_null(var417);
                            if (NIL == var418) {
                                SubLObject var419 = var417;
                                SubLObject var420 = (SubLObject)NIL;
                                var420 = var419.first();
                                while (NIL == var418 && NIL != var419) {
                                    final SubLObject var421 = module0233.f15355(var420);
                                    if (NIL != module0206.f13500(var421) && NIL == module0004.f104(var421, inference_datastructures_inference_oc.f25490(var401), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                        var418 = (SubLObject)T;
                                    }
                                    var419 = var419.rest();
                                    var420 = var419.first();
                                }
                            }
                            if (NIL == var418) {
                                if (NIL != $g6197$.getDynamicValue(var400)) {
                                    Errors.warn((SubLObject)$ic381$, var399, var410);
                                }
                                return (SubLObject)T;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var413, (SubLObject)$ic380$);
                        }
                        var81_419 = var81_419.rest();
                        var412 = var81_419.first();
                    }
                    var81_418 = var81_418.rest();
                    var411 = var81_418.first();
                }
                var409 = var409.rest();
                var410 = var409.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49529(final SubLObject var399, final SubLObject var4) {
        final SubLThread var400 = SubLProcess.currentSubLThread();
        final SubLObject var401 = module0034.$g879$.getDynamicValue(var400);
        SubLObject var402 = (SubLObject)NIL;
        if (NIL == var401) {
            return f49533(var399, var4);
        }
        var402 = module0034.f1857(var401, (SubLObject)$ic379$, (SubLObject)UNPROVIDED);
        if (NIL == var402) {
            var402 = module0034.f1807(module0034.f1842(var401), (SubLObject)$ic379$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var401, (SubLObject)$ic379$, var402);
        }
        final SubLObject var403 = module0034.f1782(var399, var4);
        final SubLObject var404 = module0034.f1814(var402, var403, (SubLObject)UNPROVIDED);
        if (var404 != $ic174$) {
            SubLObject var405 = var404;
            SubLObject var406 = (SubLObject)NIL;
            var406 = var405.first();
            while (NIL != var405) {
                SubLObject var407 = var406.first();
                final SubLObject var408 = conses_high.second(var406);
                if (var399.equal(var407.first())) {
                    var407 = var407.rest();
                    if (NIL != var407 && NIL == var407.rest() && var4.equal(var407.first())) {
                        return module0034.f1959(var408);
                    }
                }
                var405 = var405.rest();
                var406 = var405.first();
            }
        }
        final SubLObject var409 = Values.arg2(var400.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49533(var399, var4)));
        module0034.f1836(var402, var403, var404, var409, (SubLObject)ConsesLow.list(var399, var4));
        return module0034.f1959(var409);
    }
    
    public static SubLObject f49528(final SubLObject var399, SubLObject var404, final SubLObject var2) {
        if (NIL != f49525(var399)) {
            if (NIL == f49526(var399, var2)) {
                var404 = f49531(var399, var404);
            }
        }
        return var404;
    }
    
    public static SubLObject f49531(final SubLObject var399, SubLObject var404) {
        if (NIL != module0202.f12595(var399)) {
            final SubLObject var405 = module0205.f13207(var399, (SubLObject)UNPROVIDED);
            if (var405.isVector()) {
                final SubLObject var406 = var405;
                final SubLObject var407 = (SubLObject)NIL;
                SubLObject var408;
                SubLObject var409;
                SubLObject var410;
                SubLObject var411;
                SubLObject var428_429;
                for (var408 = Sequences.length(var406), var409 = (SubLObject)NIL, var409 = (SubLObject)ZERO_INTEGER; var409.numL(var408); var409 = Numbers.add(var409, (SubLObject)ONE_INTEGER)) {
                    var410 = ((NIL != var407) ? Numbers.subtract(var408, var409, (SubLObject)ONE_INTEGER) : var409);
                    var428_429 = (var411 = Vectors.aref(var406, var410));
                    if (NIL == conses_high.member(var411, var404, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var404 = (SubLObject)ConsesLow.cons(var411, var404);
                    }
                }
            }
            else {
                SubLObject var412 = var405;
                SubLObject var428_430 = (SubLObject)NIL;
                var428_430 = var412.first();
                while (NIL != var412) {
                    final SubLObject var413 = var428_430;
                    if (NIL == conses_high.member(var413, var404, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var404 = (SubLObject)ConsesLow.cons(var413, var404);
                    }
                    var412 = var412.rest();
                    var428_430 = var412.first();
                }
            }
        }
        else if (NIL == conses_high.member(var399, var404, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            var404 = (SubLObject)ConsesLow.cons(var399, var404);
        }
        return var404;
    }
    
    public static SubLObject f49534(final SubLObject var2, SubLObject var431) {
        if (var431 == UNPROVIDED) {
            var431 = (SubLObject)T;
        }
        final SubLObject var432 = (SubLObject)((NIL != var2) ? f49405(var2) : NIL);
        if (NIL != module0191.f11950(var432) && $ic382$.eql(module0191.f11965(var432))) {
            return (SubLObject)T;
        }
        if (NIL != var431) {
            final SubLObject var433 = f49395(f49261(var2), f49403(var2));
            return f49534(var433, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49525(final SubLObject var18) {
        if (NIL == module0191.f11950(var18) && NIL == module0206.f13425(var18)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f49535(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        if (NIL == var3) {
            SubLObject var4 = f49399(var2);
            SubLObject var5 = (SubLObject)NIL;
            var5 = var4.first();
            while (NIL == var3 && NIL != var4) {
                if (NIL != conses_high.member(f49404(var5), (SubLObject)$ic383$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var3 = (SubLObject)T;
                }
                var4 = var4.rest();
                var5 = var4.first();
            }
        }
        return var3;
    }
    
    public static SubLObject f49527(final SubLObject var2) {
        return (SubLObject)makeBoolean(NIL != conses_high.member(f49404(var2), (SubLObject)$ic384$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) && NIL != module0178.f11290(f49405(var2)));
    }
    
    public static SubLObject f49520(final SubLObject var4, final SubLObject var263, final SubLObject var433) {
        final SubLThread var434 = SubLProcess.currentSubLThread();
        SubLObject var435 = (SubLObject)NIL;
        SubLObject var436 = conses_high.copy_list(var433);
        final SubLObject var437 = module0775.f49673(f49266(var4), var263);
        SubLObject var438 = (SubLObject)((NIL != var437) ? var437 : NIL);
        while (NIL == module0035.f2012(var436)) {
            if (NIL == var438) {
                var438 = var436.first();
                var436 = var436.rest();
                var435 = (SubLObject)ConsesLow.cons(var438, var435);
            }
            SubLObject var440;
            final SubLObject var439 = var440 = module0205.f13180(f49536(var438), (SubLObject)$ic173$);
            SubLObject var441 = (SubLObject)NIL;
            var441 = var440.first();
            while (NIL != var440) {
                SubLObject var443;
                for (SubLObject var442 = (SubLObject)T; NIL != var442; var442 = (SubLObject)makeBoolean(NIL != module0035.sublisp_boolean(var443) && NIL == module0035.f2012(var436))) {
                    var443 = (SubLObject)NIL;
                    SubLObject var444 = (SubLObject)NIL;
                    SubLObject var445 = (SubLObject)NIL;
                    SubLObject var446 = (SubLObject)NIL;
                    SubLObject var447 = (SubLObject)NIL;
                    var445 = var436;
                    var446 = var445.first();
                    for (var447 = (SubLObject)ZERO_INTEGER; NIL == var443 && NIL != var445; var445 = var445.rest(), var446 = var445.first(), var447 = Numbers.add((SubLObject)ONE_INTEGER, var447)) {
                        if (NIL != module0004.f104(var441, module0205.f13180(f49536(var446), (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                            var443 = var446;
                            var444 = var447;
                        }
                    }
                    if (NIL != var443) {
                        var435 = (SubLObject)ConsesLow.cons(var443, var435);
                        var436 = module0035.f2045(var444, var436);
                    }
                }
                var440 = var440.rest();
                var441 = var440.first();
            }
            var438 = (SubLObject)NIL;
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var434) && NIL == module0035.f2004(var435, var433)) {
            Errors.error((SubLObject)$ic385$, Sequences.length(var435), var433, var435);
        }
        return Sequences.nreverse(var435);
    }
    
    public static SubLObject f49536(final SubLObject var399) {
        if (NIL != module0206.f13425(var399)) {
            return module0205.f13144(var399);
        }
        if (NIL != module0191.f11950(var399)) {
            return module0205.f13144(module0191.f11967(var399));
        }
        Errors.error((SubLObject)$ic386$, var399);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49537(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f49394(var4);
        SubLObject var7 = (SubLObject)NIL;
        if (NIL == var7) {
            SubLObject var8 = f49399(var6);
            SubLObject var9 = (SubLObject)NIL;
            var9 = var8.first();
            while (NIL == var7 && NIL != var8) {
                final SubLObject var10 = f49260(var9);
                var7 = Equality.equal(var10, $g6177$.getDynamicValue(var5));
                var8 = var8.rest();
                var9 = var8.first();
            }
        }
        return var7;
    }
    
    public static SubLObject f49521(final SubLObject var4, final SubLObject var396, final SubLObject var444, final SubLObject var123) {
        final SubLThread var445 = SubLProcess.currentSubLThread();
        final SubLObject var446 = f49397(var4, (SubLObject)$ic0$, var396, (SubLObject)((NIL != module0191.f11950(var444)) ? ((NIL != assertion_handles_oc.f11035(var444)) ? $ic192$ : $ic191$) : $ic189$), var444, (SubLObject)UNPROVIDED);
        SubLObject var447 = f49307(var4, (SubLObject)$ic78$, (SubLObject)UNPROVIDED);
        f49393(var446);
        var447 = (SubLObject)ConsesLow.cons(var444, var447);
        f49308(var4, (SubLObject)$ic78$, var447);
        if (NIL == module0004.f104(var444, f49307(var4, (SubLObject)$ic78$, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            Errors.sublisp_break((SubLObject)$ic387$, new SubLObject[] { var444, var4 });
        }
        if (NIL != assertion_handles_oc.f11035(var444)) {
            var445.resetMultipleValues();
            final SubLObject var448 = module0775.f49821(var444);
            SubLObject var449 = var445.secondMultipleValue();
            final SubLObject var450 = var445.thirdMultipleValue();
            var445.resetMultipleValues();
            SubLObject var451 = module0775.f49876(var444, var123);
            SubLObject var452 = (SubLObject)NIL;
            var452 = var451.first();
            while (NIL != var451) {
                final SubLObject var453 = var452;
                if (NIL == conses_high.member(var453, var449, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var449 = (SubLObject)ConsesLow.cons(var453, var449);
                }
                var451 = var451.rest();
                var452 = var451.first();
            }
            var451 = var449;
            SubLObject var454 = (SubLObject)NIL;
            var454 = var451.first();
            while (NIL != var451) {
                f49538(var4, var446, var454, var450);
                var451 = var451.rest();
                var454 = var451.first();
            }
        }
        else if (NIL != f49539(var444)) {
            final SubLObject var455 = f49540(var444);
            if (NIL != var455) {
                f49538(var4, var446, var455, (SubLObject)UNPROVIDED);
            }
        }
        return var446;
    }
    
    public static SubLObject f49541(final SubLObject var449, final SubLObject var450) {
        final SubLThread var451 = SubLProcess.currentSubLThread();
        final SubLObject var452 = f49427(var449);
        final SubLObject var453 = f49427(var450);
        SubLObject var454 = (SubLObject)NIL;
        if (var452.equal(var453)) {
            return (SubLObject)T;
        }
        if (NIL != Functions.funcall((SubLObject)makeSymbol("S#53731", "CYC"), module0172.f10922(var452), module0172.f10922(var453))) {
            var454 = (SubLObject)T;
        }
        var451.resetMultipleValues();
        SubLObject var455 = module0337.f22630(var452, (SubLObject)$ic388$);
        SubLObject var456 = var451.secondMultipleValue();
        var451.resetMultipleValues();
        if (NIL != var455) {
            final SubLObject var457 = module0035.f2294(var456, (SubLObject)$ic389$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var458 = module0035.f2294(var456, (SubLObject)$ic390$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var459 = module0035.f2294(var456, (SubLObject)$ic391$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var457.isNumber() && var457.numG((SubLObject)ONE_INTEGER) && NIL != module0337.f22630(var453, (SubLObject)ConsesLow.list((SubLObject)$ic392$, var459, (SubLObject)ConsesLow.list($ic393$, var458)))) {
                var454 = (SubLObject)T;
            }
        }
        var451.resetMultipleValues();
        var455 = module0337.f22630(var452, (SubLObject)$ic394$);
        var456 = var451.secondMultipleValue();
        var451.resetMultipleValues();
        if (NIL != var455) {
            final SubLObject var460 = module0035.f2294(var456, (SubLObject)$ic395$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var461 = module0035.f2294(var456, (SubLObject)$ic396$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var462 = module0035.f2294(var456, (SubLObject)$ic397$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var451.resetMultipleValues();
            final SubLObject var454_462 = module0337.f22630(var453, (SubLObject)ConsesLow.list((SubLObject)$ic398$, var461, var460));
            final SubLObject var455_463 = var451.secondMultipleValue();
            var451.resetMultipleValues();
            if (NIL != var454_462) {
                final SubLObject var463 = module0035.f2294(var455_463, (SubLObject)$ic399$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL == var454) {
                    SubLObject var464 = module0220.f14565(var463, $ic403$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var465 = (SubLObject)NIL;
                    var465 = var464.first();
                    while (NIL == var454 && NIL != var464) {
                        if (NIL != module0337.f22630(var465, (SubLObject)ConsesLow.list($ic400$, (SubLObject)$ic401$, (SubLObject)ConsesLow.listS($ic402$, var462, (SubLObject)$ic401$)))) {
                            var454 = (SubLObject)T;
                        }
                        var464 = var464.rest();
                        var465 = var464.first();
                    }
                }
            }
        }
        var451.resetMultipleValues();
        var455 = module0337.f22630(var452, (SubLObject)$ic404$);
        var456 = var451.secondMultipleValue();
        var451.resetMultipleValues();
        if (NIL != var455) {
            final SubLObject var466 = module0035.f2294(var456, (SubLObject)$ic405$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var467 = module0035.f2294(var456, (SubLObject)$ic395$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var468 = module0035.f2294(var456, (SubLObject)$ic396$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var469 = module0035.f2294(var456, (SubLObject)$ic397$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var466.isNumber() && var466.isPositive() && NIL != module0337.f22630(var453, (SubLObject)ConsesLow.list($ic402$, var469, var468, var467))) {
                var454 = (SubLObject)T;
            }
        }
        var451.resetMultipleValues();
        var455 = module0337.f22630(var452, (SubLObject)$ic406$);
        var456 = var451.secondMultipleValue();
        var451.resetMultipleValues();
        if (NIL != var455) {
            final SubLObject var470 = module0035.f2294(var456, (SubLObject)$ic407$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var471 = module0035.f2294(var456, (SubLObject)$ic408$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0337.f22630(var453, (SubLObject)ConsesLow.list((SubLObject)$ic409$, var471, module0035.f2114(module0202.f12751(var470))))) {
                var454 = (SubLObject)T;
            }
            var451.resetMultipleValues();
            final SubLObject var454_463 = module0337.f22630(var453, (SubLObject)ConsesLow.listS((SubLObject)$ic410$, var471, (SubLObject)$ic411$));
            final SubLObject var455_464 = var451.secondMultipleValue();
            var451.resetMultipleValues();
            if (NIL != var454_463) {
                final SubLObject var472 = module0035.f2294(var455_464, (SubLObject)$ic412$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var473 = module0035.f2294(var455_464, (SubLObject)$ic413$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var474 = Sequences.position(var473, var470, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var475 = Sequences.position(var472, var470, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var454 = (SubLObject)makeBoolean(NIL != var474 && NIL != var475 && var474.numG(var475));
            }
        }
        if (NIL != module0337.f22630(var453, (SubLObject)ConsesLow.list((SubLObject)$ic414$, (SubLObject)$ic415$, var452))) {
            var454 = (SubLObject)T;
        }
        var451.resetMultipleValues();
        var455 = module0337.f22630(var452, (SubLObject)$ic416$);
        var456 = var451.secondMultipleValue();
        var451.resetMultipleValues();
        if (NIL != var455) {
            final SubLObject var476 = module0035.f2294(var456, (SubLObject)$ic417$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var477 = module0035.f2294(var456, (SubLObject)$ic418$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != module0337.f22630(var453, (SubLObject)ConsesLow.list($ic419$, (SubLObject)$ic420$, var477, var476))) {
                var454 = (SubLObject)T;
            }
        }
        if (NIL != var454 && NIL != $g6197$.getDynamicValue(var451)) {
            Errors.warn((SubLObject)$ic421$, var449, var450);
        }
        return var454;
    }
    
    public static SubLObject f49542(final SubLObject var449, final SubLObject var450) {
        final SubLThread var451 = SubLProcess.currentSubLThread();
        final SubLObject var452 = module0034.$g879$.getDynamicValue(var451);
        SubLObject var453 = (SubLObject)NIL;
        if (NIL == var452) {
            return f49541(var449, var450);
        }
        var453 = module0034.f1857(var452, (SubLObject)$ic359$, (SubLObject)UNPROVIDED);
        if (NIL == var453) {
            var453 = module0034.f1807(module0034.f1842(var452), (SubLObject)$ic359$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var452, (SubLObject)$ic359$, var453);
        }
        final SubLObject var454 = module0034.f1782(var449, var450);
        final SubLObject var455 = module0034.f1814(var453, var454, (SubLObject)UNPROVIDED);
        if (var455 != $ic174$) {
            SubLObject var456 = var455;
            SubLObject var457 = (SubLObject)NIL;
            var457 = var456.first();
            while (NIL != var456) {
                SubLObject var458 = var457.first();
                final SubLObject var459 = conses_high.second(var457);
                if (var449.equal(var458.first())) {
                    var458 = var458.rest();
                    if (NIL != var458 && NIL == var458.rest() && var450.equal(var458.first())) {
                        return module0034.f1959(var459);
                    }
                }
                var456 = var456.rest();
                var457 = var456.first();
            }
        }
        final SubLObject var460 = Values.arg2(var451.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49541(var449, var450)));
        module0034.f1836(var453, var454, var455, var460, (SubLObject)ConsesLow.list(var449, var450));
        return module0034.f1959(var460);
    }
    
    public static SubLObject f49543(final SubLObject var403) {
        if (NIL != module0191.f11950(var403)) {
            return module0191.f11970(var403);
        }
        if (NIL != module0206.f13425(var403)) {
            return module0205.f13144(var403);
        }
        Errors.error((SubLObject)$ic422$, var403);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49427(final SubLObject var403) {
        final SubLThread var404 = SubLProcess.currentSubLThread();
        final SubLObject var405 = module0034.$g879$.getDynamicValue(var404);
        SubLObject var406 = (SubLObject)NIL;
        if (NIL == var405) {
            return f49543(var403);
        }
        var406 = module0034.f1857(var405, (SubLObject)$ic369$, (SubLObject)UNPROVIDED);
        if (NIL == var406) {
            var406 = module0034.f1807(module0034.f1842(var405), (SubLObject)$ic369$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var405, (SubLObject)$ic369$, var406);
        }
        SubLObject var407 = module0034.f1814(var406, var403, (SubLObject)$ic174$);
        if (var407 == $ic174$) {
            var407 = Values.arg2(var404.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49543(var403)));
            module0034.f1816(var406, var403, var407, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var407);
    }
    
    public static SubLObject f49544(final SubLObject var4, final SubLObject var476, final SubLObject var477, final SubLObject var123) {
        final SubLObject var478 = f49397(var4, (SubLObject)$ic0$, var476, (SubLObject)$ic220$, var477, (SubLObject)UNPROVIDED);
        SubLObject var479 = f49307(var4, (SubLObject)$ic335$, (SubLObject)UNPROVIDED);
        var479 = (SubLObject)ConsesLow.cons(var477, var479);
        f49308(var4, (SubLObject)$ic335$, var479);
        return var478;
    }
    
    public static SubLObject f49510(final SubLObject var4, final SubLObject var263, final SubLObject var388) {
        final SubLThread var389 = SubLProcess.currentSubLThread();
        if (NIL != f49262(var4) || NIL != f49263(var4) || NIL != f49264(var4)) {
            final SubLObject var390 = f49266(var4);
            final SubLObject var391 = f49267(var4);
            final SubLObject var392 = f49396(var4, $g6175$.getDynamicValue(var389));
            final SubLObject var393 = module0579.$g4344$.currentBinding(var389);
            try {
                module0579.$g4344$.bind(module0373.f26231(var390), var389);
                final SubLObject var394 = f49545(var391);
                f49308(var4, (SubLObject)$ic331$, var392);
                f49546(var390, var391, var263, var388, var4, var392, var394);
                f49393(var392);
                if (NIL == module0035.sublisp_boolean(f49399(var392))) {
                    if (NIL != f49537(var4)) {
                        f49402(var4, var392);
                    }
                    else {
                        f49397(var4, (SubLObject)$ic423$, var392, (SubLObject)$ic239$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                    }
                }
            }
            finally {
                module0579.$g4344$.rebind(var393, var389);
            }
        }
        return var4;
    }
    
    public static SubLObject f49511(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (NIL != f49264(var4)) {
            final SubLObject var6 = f49307(var4, (SubLObject)$ic331$, (SubLObject)UNPROVIDED);
            final SubLObject var7 = f49396(var4, $g6176$.getDynamicValue(var5));
            f49547(var7, var6, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f49393(var7);
            if (NIL != module0035.f2002(f49399(var7), (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                f49308(var4, (SubLObject)$ic424$, var7);
            }
            else {
                f49402(var4, var7);
            }
        }
        return var4;
    }
    
    public static SubLObject f49547(final SubLObject var482, final SubLObject var483, final SubLObject var4, SubLObject var19, SubLObject var98, SubLObject var484) {
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)ZERO_INTEGER;
        }
        if (var98 == UNPROVIDED) {
            var98 = module0057.f4173((SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var484 == UNPROVIDED) {
            var484 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLThread var485 = SubLProcess.currentSubLThread();
        SubLObject var486 = f49399(var483);
        SubLObject var487 = (SubLObject)NIL;
        var487 = var486.first();
        while (NIL != var486) {
            if (NIL != f49527(var487)) {
                f49548(var4, (SubLObject)$ic425$, var482, (SubLObject)$ic241$, var487, var98, var484);
            }
            else if (var19.numGE($g6203$.getDynamicValue(var485))) {
                if (NIL != $g6197$.getDynamicValue(var485)) {
                    Errors.warn((SubLObject)$ic426$, $g6203$.getDynamicValue(var485), f49405(var487));
                }
                f49548(var4, (SubLObject)$ic0$, var482, (SubLObject)$ic240$, var487, var98, var484);
            }
            else if (NIL != f49549(var487)) {
                f49547(var482, var487, var4, module0048.f_1X(var19), var98, var484);
                final SubLObject var488 = f49548(var4, (SubLObject)$ic427$, var482, (SubLObject)$ic242$, var487, var98, var484);
                SubLObject var489 = (SubLObject)NIL;
                if (NIL == Sequences.find((SubLObject)$ic243$, f49399(var488), Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic428$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    SubLObject var81_486 = f49399(var487);
                    SubLObject var490 = (SubLObject)NIL;
                    var490 = var81_486.first();
                    while (NIL != var81_486) {
                        var489 = (SubLObject)ConsesLow.cons(module0067.f4884(var484, var490, (SubLObject)UNPROVIDED), var489);
                        var81_486 = var81_486.rest();
                        var490 = var81_486.first();
                    }
                    f49397(var4, (SubLObject)$ic0$, var488, (SubLObject)$ic243$, Sort.sort(var489, Symbols.symbol_function((SubLObject)$ic300$), (SubLObject)$ic429$), (SubLObject)UNPROVIDED);
                }
            }
            else {
                f49548(var4, (SubLObject)$ic0$, var482, (SubLObject)$ic240$, var487, var98, var484);
            }
            var486 = var486.rest();
            var487 = var486.first();
        }
        return var482;
    }
    
    public static SubLObject f49549(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = f49405(var2);
        if (NIL != f49530(var4)) {
            if (NIL != $g6197$.getDynamicValue(var3)) {
                Errors.warn((SubLObject)$ic430$, var4);
            }
            return (SubLObject)NIL;
        }
        if (NIL != Sequences.find_if((SubLObject)$ic431$, f49399(var2), (SubLObject)$ic428$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49530(final SubLObject var110) {
        return (SubLObject)makeBoolean(NIL != module0191.f11950(var110) && NIL != conses_high.member(module0191.f11965(var110), (SubLObject)$ic432$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0202.f12592(module0191.f11967(var110)) && NIL == conses_high.member(module0191.f11978(var110), (SubLObject)$ic433$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49550(final SubLObject var110) {
        final SubLThread var111 = SubLProcess.currentSubLThread();
        if (var110.eql((SubLObject)$ic191$) || var110.eql((SubLObject)$ic192$) || var110.eql((SubLObject)$ic189$)) {
            return (SubLObject)T;
        }
        if (var110.eql((SubLObject)$ic237$) || var110.eql((SubLObject)$ic222$) || var110.eql((SubLObject)$ic224$) || var110.eql((SubLObject)$ic231$)) {
            return (SubLObject)NIL;
        }
        if (NIL != $g6197$.getDynamicValue(var111)) {
            Errors.warn((SubLObject)$ic434$, var110);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49548(final SubLObject var4, final SubLObject var3, final SubLObject var163, final SubLObject var139, final SubLObject var488, final SubLObject var98, final SubLObject var484) {
        final SubLThread var489 = SubLProcess.currentSubLThread();
        SubLObject var490 = (SubLObject)NIL;
        final SubLObject var491 = f49405(var488);
        SubLObject var492;
        for (var492 = module0066.f4838(module0067.f4891(var484)); NIL == var490 && NIL == module0066.f4841(var492); var492 = module0066.f4840(var492)) {
            var489.resetMultipleValues();
            final SubLObject var493 = module0066.f4839(var492);
            final SubLObject var494 = var489.secondMultipleValue();
            var489.resetMultipleValues();
            if (f49405(var493).eql(var491)) {
                if (NIL != $g6197$.getDynamicValue(var489)) {
                    Errors.warn((SubLObject)$ic435$, var491);
                }
                var490 = var494;
            }
        }
        module0066.f4842(var492);
        if (NIL == var490) {
            var490 = f49397(var4, var3, var163, var139, var488, (SubLObject)ConsesLow.list((SubLObject)$ic208$, module0057.f4175(var98)));
        }
        module0067.f4886(var484, var488, var490);
        return var490;
    }
    
    public static SubLObject f49513(final SubLObject var4, final SubLObject var263) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        if (NIL != f49325(var4)) {
            SubLObject var265 = module0035.remove_if_not((SubLObject)$ic436$, f49519(var4), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var266 = (SubLObject)ONE_INTEGER;
            final SubLObject var267 = module0147.f9540(var263);
            final SubLObject var268 = module0147.$g2095$.currentBinding(var264);
            final SubLObject var269 = module0147.$g2094$.currentBinding(var264);
            final SubLObject var270 = module0147.$g2096$.currentBinding(var264);
            try {
                module0147.$g2095$.bind(module0147.f9545(var267), var264);
                module0147.$g2094$.bind(module0147.f9546(var267), var264);
                module0147.$g2096$.bind(module0147.f9549(var267), var264);
                var265 = module0035.remove_if_not((SubLObject)$ic437$, var265, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var270, var264);
                module0147.$g2094$.rebind(var269, var264);
                module0147.$g2095$.rebind(var268, var264);
            }
            final SubLObject var271 = f49517(var4);
            if (NIL != module0035.f2000(var265, var266, (SubLObject)UNPROVIDED)) {
                SubLObject var272 = var265;
                SubLObject var273 = (SubLObject)NIL;
                var273 = var272.first();
                while (NIL != var272) {
                    f49544(var4, var271, var273, var263);
                    var272 = var272.rest();
                    var273 = var272.first();
                }
            }
            else {
                f49402(var4, var271);
            }
        }
        return var4;
    }
    
    public static SubLObject f49551(final SubLObject var412) {
        return (SubLObject)makeBoolean(NIL != module0178.f11290(var412) && NIL != module0220.f14548(var412, $ic221$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49515(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f49314(var4);
        if (NIL != module0067.f4852(var6) && NIL == module0067.f4882(var6)) {
            final SubLObject var7 = f49396(var4, $g6172$.getDynamicValue(var5));
            SubLObject var8 = (SubLObject)NIL;
            f49308(var4, (SubLObject)$ic333$, var7);
            f49393(var7);
            SubLObject var9;
            for (var9 = module0066.f4838(module0067.f4891(var6)); NIL == module0066.f4841(var9); var9 = module0066.f4840(var9)) {
                var5.resetMultipleValues();
                final SubLObject var10 = module0066.f4839(var9);
                final SubLObject var11 = var5.secondMultipleValue();
                var5.resetMultipleValues();
                var8 = (SubLObject)ConsesLow.cons(var11, var8);
            }
            module0066.f4842(var9);
            SubLObject var12;
            var8 = (var12 = Sort.sort(var8, Symbols.symbol_function((SubLObject)$ic300$), (SubLObject)$ic438$));
            SubLObject var13 = (SubLObject)NIL;
            var13 = var12.first();
            while (NIL != var12) {
                f49397(var4, (SubLObject)$ic0$, var7, (SubLObject)$ic214$, var13, (SubLObject)UNPROVIDED);
                var12 = var12.rest();
                var13 = var12.first();
            }
        }
        return var4;
    }
    
    public static SubLObject f49552(final SubLObject var62, final SubLObject var263) {
        if (NIL != module0378.f26897(var62)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0775.f49719(module0775.f49673(var62, var263), var263)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49553(final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        SubLObject var101 = $g6204$.getDynamicValue(var100);
        SubLObject var102 = (SubLObject)NIL;
        var102 = var101.first();
        while (NIL != var101) {
            if (NIL != f49554(var99, var102)) {
                return (SubLObject)T;
            }
            var101 = var101.rest();
            var102 = var101.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49554(final SubLObject var99, final SubLObject var421) {
        final SubLObject var422 = conses_high.subst_if((SubLObject)$ic420$, (SubLObject)$ic439$, var421, (SubLObject)UNPROVIDED);
        if (NIL != module0173.f10955(var422.first()) && NIL != module0269.f17716(var422.first())) {
            ConsesLow.rplaca(var422, (SubLObject)ConsesLow.list((SubLObject)$ic440$, (SubLObject)$ic441$, var422.first()));
        }
        if (NIL != module0337.f22630(module0191.f11967(var99), var422)) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49555(final SubLObject var62, final SubLObject var4) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        SubLObject var64 = (SubLObject)NIL;
        final SubLObject var65 = module0579.$g4283$.currentBinding(var63);
        try {
            module0579.$g4283$.bind(f49322(var4), var63);
            SubLObject var66 = module0366.f24966(var62);
            SubLObject var67 = (SubLObject)NIL;
            var67 = var66.first();
            while (NIL != var66) {
                final SubLObject var68 = (SubLObject)((NIL != module0178.f11290(var67)) ? module0775.f49752(var67, (SubLObject)UNPROVIDED) : NIL);
                if (var68.isVector()) {
                    final SubLObject var69 = var68;
                    final SubLObject var70 = (SubLObject)NIL;
                    SubLObject var71;
                    SubLObject var72;
                    SubLObject var73;
                    SubLObject var74;
                    for (var71 = Sequences.length(var69), var72 = (SubLObject)NIL, var72 = (SubLObject)ZERO_INTEGER; var72.numL(var71); var72 = Numbers.add(var72, (SubLObject)ONE_INTEGER)) {
                        var73 = ((NIL != var70) ? Numbers.subtract(var71, var72, (SubLObject)ONE_INTEGER) : var72);
                        var74 = Vectors.aref(var69, var73);
                        var64 = (SubLObject)ConsesLow.cons(var74, var64);
                    }
                }
                else {
                    SubLObject var81_499 = var68;
                    SubLObject var75 = (SubLObject)NIL;
                    var75 = var81_499.first();
                    while (NIL != var81_499) {
                        var64 = (SubLObject)ConsesLow.cons(var75, var64);
                        var81_499 = var81_499.rest();
                        var75 = var81_499.first();
                    }
                }
                var66 = var66.rest();
                var67 = var66.first();
            }
            return var64;
        }
        finally {
            module0579.$g4283$.rebind(var65, var63);
        }
    }
    
    public static SubLObject f49556(final SubLObject var395) {
        module0084.f5775($g6205$.getGlobalValue(), var395, (SubLObject)UNPROVIDED);
        return module0067.f4885($g6205$.getGlobalValue(), var395, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49546(final SubLObject var62, final SubLObject var121, final SubLObject var263, final SubLObject var388, final SubLObject var4, SubLObject var138, SubLObject var481) {
        if (var138 == UNPROVIDED) {
            var138 = (SubLObject)NIL;
        }
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)NIL;
        }
        final SubLThread var482 = SubLProcess.currentSubLThread();
        assert NIL != f49284(var4) : var4;
        if (NIL != var138 && !areAssertionsDisabledFor(me) && NIL == f49371(var138)) {
            throw new AssertionError(var138);
        }
        final SubLObject var483 = module0775.f49673(var62, var263);
        final SubLObject var484 = (SubLObject)NIL;
        final SubLObject var485 = $g6204$.currentBinding(var482);
        try {
            $g6204$.bind(Sequences.cconcatenate($g6204$.getDynamicValue(var482), f49555(var62, var4)), var482);
            f49556(var483);
            if (NIL != var484) {
                Errors.sublisp_break((SubLObject)$ic443$, new SubLObject[] { var62, var483 });
            }
            if (NIL == module0775.f49840(var483, (SubLObject)UNPROVIDED)) {
                SubLObject var486 = module0205.f13183(var483, (SubLObject)$ic444$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var487 = (SubLObject)NIL;
                var487 = var486.first();
                while (NIL != var486) {
                    final SubLObject var488 = var487;
                    if (NIL == conses_high.member(var488, var481, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var481 = (SubLObject)ConsesLow.cons(var488, var481);
                    }
                    var486 = var486.rest();
                    var487 = var486.first();
                }
            }
            if (NIL != f49557(var62)) {
                if (NIL != var484) {
                    Errors.sublisp_break((SubLObject)$ic445$, new SubLObject[] { var483 });
                }
            }
            else if (NIL != f49552(var62, var263)) {
                f49321(var4, var483, (SubLObject)$ic446$);
                if (NIL != var484) {
                    Errors.sublisp_break((SubLObject)$ic447$, EMPTY_SUBL_OBJECT_ARRAY);
                }
            }
            else if (NIL != f49406(var4, var483, var138)) {
                if (NIL != var484) {
                    Errors.sublisp_break((SubLObject)$ic448$, EMPTY_SUBL_OBJECT_ARRAY);
                }
            }
            else if (NIL != var138 && NIL != f49558(var62, var263)) {
                SubLObject var490;
                final SubLObject var489 = var490 = module0775.f49691(module0775.f49735(var62, (SubLObject)NIL, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                SubLObject var491 = (SubLObject)NIL;
                var491 = var490.first();
                while (NIL != var490) {
                    f49559(var4, var491, var138, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    var490 = var490.rest();
                    var491 = var490.first();
                }
                f49560(var4, var62);
            }
            else if (NIL != f49561(var62)) {
                f49562(var4, var62, var138, var263);
            }
            else if (NIL != f49563(var62, var263)) {
                f49564(var4, var62, var138, var263);
            }
            else if (NIL != module0373.f26173(var62)) {
                SubLObject var492 = (SubLObject)NIL;
                SubLObject var493 = (SubLObject)NIL;
                SubLObject var494 = (SubLObject)NIL;
                var492 = module0775.f49690(var62);
                var493 = var492.first();
                for (var494 = (SubLObject)ZERO_INTEGER; NIL != var492; var492 = var492.rest(), var493 = var492.first(), var494 = Numbers.add((SubLObject)ONE_INTEGER, var494)) {
                    f49546(var493, var121, var263, var388, var4, var138, var481);
                }
            }
            else if (NIL == f49565(var4, var62)) {
                if (NIL != module0378.f26897(var62)) {
                    f49566(var4, var62, var138, var263, var121, var388, var481);
                }
                else if (NIL != module0775.f49726(var483, var481, (SubLObject)UNPROVIDED)) {
                    f49321(var4, var483, (SubLObject)$ic449$);
                }
                else if (NIL != module0775.f49728(var62)) {
                    final SubLObject var495 = module0775.f49691(module0366.f24966(var62)).first();
                    if (NIL != var484) {
                        PrintLow.format((SubLObject)T, (SubLObject)$ic450$, var495);
                    }
                    if (NIL != module0775.f49755(var495, var481, (SubLObject)UNPROVIDED)) {
                        f49321(var4, var495, (SubLObject)$ic449$);
                    }
                    else {
                        f49559(var4, var495, var138, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                else {
                    f49567(var62, var121, var4, var138, var263, var388, var484, var481);
                }
            }
        }
        finally {
            $g6204$.rebind(var485, var482);
        }
        return (NIL != var138) ? f49399(var138) : f49394(var4);
    }
    
    public static SubLObject f49567(final SubLObject var62, final SubLObject var121, final SubLObject var4, final SubLObject var138, final SubLObject var263, final SubLObject var388, SubLObject var500, SubLObject var481) {
        if (var500 == UNPROVIDED) {
            var500 = (SubLObject)NIL;
        }
        if (var481 == UNPROVIDED) {
            var481 = (SubLObject)NIL;
        }
        final SubLThread var501 = SubLProcess.currentSubLThread();
        if (NIL != var500 && NIL != $g6197$.getDynamicValue(var501)) {
            Errors.warn((SubLObject)$ic451$, var62);
        }
        final SubLObject var502 = module0775.f49673(var62, var263);
        final SubLObject var503 = (SubLObject)((NIL != assertion_handles_oc.f11035(var502)) ? $ic192$ : $ic189$);
        final SubLObject var504 = module0775.f49691(module0775.f49735(var62, (SubLObject)NIL, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        final SubLObject var505 = module0775.f49690(var62);
        final SubLObject var506 = (NIL != var504 || NIL != var505) ? $g6170$.getDynamicValue(var501) : $g6171$.getDynamicValue(var501);
        final SubLObject var507 = (NIL != f49406(var4, var502, var138)) ? var138 : f49397(var4, var506, var138, var503, var502, (SubLObject)UNPROVIDED);
        if (NIL != var500 && NIL != $g6197$.getDynamicValue(var501)) {
            Errors.warn((SubLObject)$ic452$, var507);
        }
        SubLObject var508 = var504;
        SubLObject var509 = (SubLObject)NIL;
        var509 = var508.first();
        while (NIL != var508) {
            f49559(var4, var509, var507, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var508 = var508.rest();
            var509 = var508.first();
        }
        SubLObject var510 = (SubLObject)NIL;
        SubLObject var511 = (SubLObject)NIL;
        SubLObject var512 = (SubLObject)NIL;
        var510 = var505;
        var511 = var510.first();
        for (var512 = (SubLObject)ZERO_INTEGER; NIL != var510; var510 = var510.rest(), var511 = var510.first(), var512 = Numbers.add((SubLObject)ONE_INTEGER, var512)) {
            final SubLObject var513 = Sequences.cconcatenate(var388, print_high.princ_to_string(var512));
            f49546(var511, var121, var263, var513, var4, var507, var481);
        }
        return var62;
    }
    
    public static SubLObject f49560(final SubLObject var4, final SubLObject var62) {
        SubLObject var63 = f49307(var4, (SubLObject)$ic453$, (SubLObject)UNPROVIDED);
        if (NIL == module0077.f5302(var63)) {
            var63 = module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            f49308(var4, (SubLObject)$ic453$, var63);
        }
        module0077.f5326(var62, var63);
        return var63;
    }
    
    public static SubLObject f49565(final SubLObject var4, final SubLObject var62) {
        final SubLObject var63 = f49307(var4, (SubLObject)$ic453$, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL != module0077.f5302(var63) && NIL != module0077.f5320(var62, var63));
    }
    
    public static SubLObject f49557(final SubLObject var62) {
        return module0004.f104(var62, f49568(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49568() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g6206$.getDynamicValue(var1);
    }
    
    public static SubLObject f49569(final SubLObject var508) {
        final SubLThread var509 = SubLProcess.currentSubLThread();
        if (NIL == conses_high.member(var508, $g6206$.getDynamicValue(var509), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g6206$.setDynamicValue((SubLObject)ConsesLow.cons(var508, $g6206$.getDynamicValue(var509)), var509);
        }
        return var508;
    }
    
    public static SubLObject f49566(final SubLObject var4, final SubLObject var509, final SubLObject var138, final SubLObject var263, final SubLObject var121, final SubLObject var388, final SubLObject var481) {
        final SubLThread var510 = SubLProcess.currentSubLThread();
        final SubLObject var511 = f49570(var509, var263);
        final SubLObject var512 = module0378.f26898(var509);
        final SubLObject var513 = $g6170$.getDynamicValue(var510);
        final SubLObject var514 = (SubLObject)$ic189$;
        final SubLObject var515 = $g6206$.currentBinding(var510);
        try {
            $g6206$.bind((SubLObject)NIL, var510);
            final SubLObject var516 = module0775.f49726(var511, var481, var263);
            final SubLObject var517 = (SubLObject)((NIL != var516 || NIL != f49406(var4, var511, var138)) ? NIL : f49397(var4, var513, var138, var514, var511, (SubLObject)UNPROVIDED));
            if (NIL != var516) {
                f49321(var4, var511, (SubLObject)$ic449$);
            }
            if (NIL != var517) {
                f49412(var517, (SubLObject)$ic12$, var509);
                if (NIL != module0775.f49755(var512, (SubLObject)NIL, (SubLObject)UNPROVIDED)) {
                    f49321(var4, var512, (SubLObject)$ic449$);
                }
                else {
                    f49559(var4, var512, var517, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var510.resetMultipleValues();
                final SubLObject var518 = f49571(var509, var263);
                final SubLObject var519 = var510.secondMultipleValue();
                final SubLObject var520 = var510.thirdMultipleValue();
                var510.resetMultipleValues();
                final SubLObject var521 = var520;
                final SubLObject var522 = module0035.f2399(var521, (SubLObject)$ic454$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var523 = var518;
                SubLObject var524 = (SubLObject)NIL;
                var524 = var523.first();
                while (NIL != var523) {
                    if (NIL != f49558(var524, var263)) {
                        SubLObject var81_517;
                        final SubLObject var525 = var81_517 = module0775.f49691(module0775.f49735(var524, (SubLObject)NIL, var263, var522, (SubLObject)UNPROVIDED));
                        SubLObject var526 = (SubLObject)NIL;
                        var526 = var81_517.first();
                        while (NIL != var81_517) {
                            if (NIL != module0004.f104(module0191.f11967(var526), var521, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                                f49559(var4, var526, var517, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            }
                            var81_517 = var81_517.rest();
                            var526 = var81_517.first();
                        }
                        f49560(var4, var524);
                    }
                    else {
                        f49572(var524, var121, var263, var388, var4, var517, var481);
                    }
                    if (NIL == module0004.f104(var524, var519, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        f49569(var524);
                    }
                    var523 = var523.rest();
                    var524 = var523.first();
                }
            }
            final SubLObject var527 = module0378.f26893(var509);
            final SubLObject var528 = f49573(var527, var138, var263);
            if (NIL != f49371(var528)) {
                f49546(var527, var121, var263, var388, var4, var528, var481);
            }
            return var517;
        }
        finally {
            $g6206$.rebind(var515, var510);
        }
    }
    
    public static SubLObject f49573(final SubLObject var502, final SubLObject var138, final SubLObject var263) {
        final SubLObject var503 = f49261(var138);
        SubLObject var504 = f49307(var503, (SubLObject)$ic455$, (SubLObject)UNPROVIDED);
        if (NIL == var504) {
            var504 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            f49308(var503, (SubLObject)$ic455$, var504);
        }
        final SubLObject var505 = (SubLObject)ConsesLow.list(var502, var138);
        if (NIL != module0084.f5808(var504, var505)) {
            return (SubLObject)NIL;
        }
        final SubLObject var506 = f49574(var502, var138, var263);
        module0067.f4886(var504, var505, var506);
        return var506;
    }
    
    public static SubLObject f49574(final SubLObject var502, SubLObject var138, final SubLObject var263) {
        if (NIL != module0378.f26897(var502)) {
            final SubLObject var503 = f49570(var502, var263);
            SubLObject var504 = f49413(var138, (SubLObject)$ic12$, (SubLObject)UNPROVIDED);
            final SubLObject var505 = f49261(var138);
            SubLObject var506 = (SubLObject)NIL;
            while (NIL == var506 && NIL != module0378.f26897(var504)) {
                final SubLObject var507 = f49575(var504);
                if (NIL != module0202.f12595(var507) && NIL != module0004.f104(var503, module0205.f13207(var507, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    final SubLObject var508 = f49403(var138);
                    if (var508.isInteger()) {
                        var138 = f49395(var505, var508);
                        var504 = f49413(var138, (SubLObject)$ic12$, (SubLObject)UNPROVIDED);
                    }
                    else {
                        var506 = (SubLObject)T;
                    }
                }
                else {
                    var506 = (SubLObject)T;
                }
            }
        }
        return var138;
    }
    
    public static SubLObject f49572(final SubLObject var502, final SubLObject var121, final SubLObject var263, final SubLObject var388, final SubLObject var4, final SubLObject var138, final SubLObject var481) {
        return f49546(var502, var121, var263, var388, var4, var138, var481);
    }
    
    public static SubLObject f49558(final SubLObject var62, final SubLObject var263) {
        return (SubLObject)makeBoolean(NIL != module0376.f26656(var62) && NIL != module0202.f12595(module0775.f49673(var62, var263)));
    }
    
    public static SubLObject f49570(final SubLObject var509, final SubLObject var263) {
        final SubLObject var510 = module0366.f24937(var509);
        final SubLObject var511 = module0378.f26872(var510);
        final SubLObject var512 = module0381.f27031(var511);
        final SubLObject var513 = module0364.f24737(var512);
        final SubLObject var514 = module0364.f24736(var512);
        final SubLObject var515 = module0363.f24551(var514);
        final SubLObject var516 = module0366.f24934(var509);
        final SubLObject var517 = module0233.f15362(var513, var515);
        final SubLObject var518 = module0233.f15362(var516, module0205.f13204(var517, (SubLObject)UNPROVIDED));
        return var518;
    }
    
    public static SubLObject f49575(final SubLObject var509) {
        final SubLObject var510 = module0366.f24937(var509);
        final SubLObject var511 = module0378.f26872(var510);
        final SubLObject var512 = module0381.f27047(var511);
        final SubLObject var513 = module0364.f24737(var512);
        final SubLObject var514 = module0364.f24736(var512);
        final SubLObject var515 = module0363.f24551(var514);
        final SubLObject var516 = module0366.f24934(var509);
        final SubLObject var517 = module0233.f15362(var513, var515);
        final SubLObject var518 = module0233.f15362(var516, module0205.f13204(var517, (SubLObject)UNPROVIDED));
        return var518;
    }
    
    public static SubLObject f49576(final SubLObject var509, final SubLObject var263) {
        final SubLObject var510 = module0775.f49673(module0378.f26893(var509), var263);
        return module0205.f13207(var510, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49571(final SubLObject var509, final SubLObject var263) {
        final SubLThread var510 = SubLProcess.currentSubLThread();
        final SubLObject var511 = module0775.f49673(var509, var263);
        final SubLObject var512 = module0205.f13207(var511, (SubLObject)UNPROVIDED);
        final SubLObject var513 = f49576(var509, var263);
        SubLObject var514 = conses_high.copy_list(var513);
        SubLObject var515 = (SubLObject)NIL;
        SubLObject var516 = (SubLObject)NIL;
        SubLObject var517 = (SubLObject)NIL;
        final SubLObject var518 = module0055.f4017();
        SubLObject var519 = var512;
        SubLObject var520 = (SubLObject)NIL;
        var520 = var519.first();
        while (NIL != var519) {
            SubLObject var521 = Sequences.position(var520, var514, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var521) {
                var514 = module0035.f2045(var521, var514);
                var521 = Sequences.position(var520, var514, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var519 = var519.rest();
            var520 = var519.first();
        }
        if (NIL != $g6197$.getDynamicValue(var510)) {
            Errors.warn((SubLObject)$ic456$, var512);
        }
        if (NIL != $g6197$.getDynamicValue(var510)) {
            Errors.warn((SubLObject)$ic457$, var513);
        }
        if (NIL != $g6197$.getDynamicValue(var510)) {
            Errors.warn((SubLObject)$ic458$, var514);
        }
        module0055.f4021(module0378.f26893(var509), var518);
        while (NIL == module0055.f4019(var518) && NIL == module0035.f2012(var514)) {
            final SubLObject var522 = module0055.f4023(var518);
            SubLObject var523 = (SubLObject)NIL;
            if (NIL == module0373.f26173(var522)) {
                if (NIL != module0378.f26897(var522)) {
                    var523 = f49570(var522, var263);
                    if (NIL != $g6197$.getDynamicValue(var510)) {
                        Errors.warn((SubLObject)$ic459$, var523);
                    }
                    module0055.f4021(module0378.f26893(var522), var518);
                }
                else {
                    var523 = module0205.f13204(module0373.f26254(var522), (SubLObject)UNPROVIDED);
                }
            }
            if (NIL != var523 && NIL != $g6197$.getDynamicValue(var510)) {
                Errors.warn((SubLObject)$ic460$, var523);
            }
            if (NIL != module0004.f104(var523, var514, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                if (NIL != $g6197$.getDynamicValue(var510)) {
                    Errors.warn((SubLObject)$ic461$, var523);
                }
                if (NIL != module0378.f26897(var522)) {
                    var516 = module0035.f2083(var522, var516);
                }
                else {
                    var516 = (SubLObject)ConsesLow.cons(var522, var516);
                }
                if (NIL != module0004.f104(var523, var512, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
                    if (NIL != $g6197$.getDynamicValue(var510)) {
                        Errors.warn((SubLObject)$ic462$, var522);
                    }
                    var517 = (SubLObject)ConsesLow.cons(var522, var517);
                }
                var514 = Sequences.remove(var523, var514, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var515 = (SubLObject)ConsesLow.cons(var523, var515);
            }
            else if ($ic269$.eql(module0205.f13136(var523)) && NIL != module0035.f2013(conses_high.intersection(module0205.f13207(var523, (SubLObject)UNPROVIDED), var514, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED))) {
                if (NIL != $g6197$.getDynamicValue(var510)) {
                    Errors.warn((SubLObject)$ic461$, var523);
                }
                if (NIL != module0378.f26897(var522)) {
                    var516 = module0035.f2083(var522, var516);
                }
                else {
                    var516 = (SubLObject)ConsesLow.cons(var522, var516);
                }
                if (NIL != module0035.f2013(conses_high.intersection(module0205.f13207(var523, (SubLObject)UNPROVIDED), var512, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED))) {
                    if (NIL != $g6197$.getDynamicValue(var510)) {
                        Errors.warn((SubLObject)$ic463$, var522);
                    }
                    var517 = (SubLObject)ConsesLow.cons(var522, var517);
                }
                final SubLObject var524 = conses_high.intersection(var514, module0205.f13207(var523, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                if (var524.isVector()) {
                    final SubLObject var525 = var524;
                    final SubLObject var526 = (SubLObject)NIL;
                    SubLObject var527;
                    SubLObject var528;
                    SubLObject var529;
                    SubLObject var530;
                    for (var527 = Sequences.length(var525), var528 = (SubLObject)NIL, var528 = (SubLObject)ZERO_INTEGER; var528.numL(var527); var528 = Numbers.add(var528, (SubLObject)ONE_INTEGER)) {
                        var529 = ((NIL != var526) ? Numbers.subtract(var527, var528, (SubLObject)ONE_INTEGER) : var528);
                        var530 = Vectors.aref(var525, var529);
                        var515 = (SubLObject)ConsesLow.cons(var530, var515);
                    }
                }
                else {
                    SubLObject var531 = var524;
                    SubLObject var532 = (SubLObject)NIL;
                    var532 = var531.first();
                    while (NIL != var531) {
                        var515 = (SubLObject)ConsesLow.cons(var532, var515);
                        var531 = var531.rest();
                        var532 = var531.first();
                    }
                }
                var514 = conses_high.set_difference(var514, module0205.f13207(var523, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            }
            else {
                SubLObject var533 = module0366.f24938(var522);
                SubLObject var534 = (SubLObject)NIL;
                var534 = var533.first();
                while (NIL != var533) {
                    module0055.f4021(var534, var518);
                    var533 = var533.rest();
                    var534 = var533.first();
                }
            }
        }
        if (NIL == module0035.f2012(var514) && NIL != $g6197$.getDynamicValue(var510)) {
            Errors.warn((SubLObject)$ic464$, var509, var514);
        }
        return Values.values(var516, var517, var515);
    }
    
    public static SubLObject f49577(final SubLObject var121) {
        return module0035.f2319(inference_datastructures_inference_oc.f25687(var121));
    }
    
    public static SubLObject f49545(final SubLObject var121) {
        return (SubLObject)ConsesLow.cons(inference_datastructures_inference_oc.f25485(inference_datastructures_inference_oc.f25732(var121)), f49577(var121));
    }
    
    public static SubLObject f49563(final SubLObject var62, final SubLObject var263) {
        return (SubLObject)makeBoolean(NIL != f49578() && NIL != module0035.f2013(f49579(var62, var263)));
    }
    
    public static SubLObject f49580() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var3 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic466$, var1);
            module0147.$g2095$.bind($ic467$, var1);
            return (SubLObject)makeBoolean(module0217.f14247($ic468$, (SubLObject)UNPROVIDED).isPositive() || module0217.f14247($ic469$, (SubLObject)UNPROVIDED).isPositive());
        }
        finally {
            module0147.$g2095$.rebind(var3, var1);
            module0147.$g2094$.rebind(var2, var1);
        }
    }
    
    public static SubLObject f49578() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        final SubLObject var2 = module0034.$g879$.getDynamicValue(var1);
        SubLObject var3 = (SubLObject)NIL;
        if (NIL == var2) {
            return f49580();
        }
        var3 = module0034.f1857(var2, (SubLObject)$ic465$, (SubLObject)UNPROVIDED);
        if (NIL == var3) {
            var3 = module0034.f1807(module0034.f1842(var2), (SubLObject)$ic465$, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)EQL, (SubLObject)UNPROVIDED);
            module0034.f1860(var2, (SubLObject)$ic465$, var3);
        }
        SubLObject var4 = module0034.f1810(var3, (SubLObject)UNPROVIDED);
        if (var4 == $ic174$) {
            var4 = Values.arg2(var1.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49580()));
            module0034.f1812(var3, var4, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var4);
    }
    
    public static SubLObject f49581(final SubLObject var62, final SubLObject var263) {
        final SubLObject var264 = module0775.f49705(var62, var263);
        final SubLObject var265 = module0205.f13183(var264, (SubLObject)$ic471$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var266 = (SubLObject)((NIL != var265) ? f49582(var264, var263) : NIL);
        return Values.values(var266, Sequences.nreverse(var265));
    }
    
    public static SubLObject f49579(final SubLObject var62, final SubLObject var263) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        final SubLObject var265 = module0034.$g879$.getDynamicValue(var264);
        SubLObject var266 = (SubLObject)NIL;
        if (NIL == var265) {
            return f49581(var62, var263);
        }
        var266 = module0034.f1857(var265, (SubLObject)$ic470$, (SubLObject)UNPROVIDED);
        if (NIL == var266) {
            var266 = module0034.f1807(module0034.f1842(var265), (SubLObject)$ic470$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var265, (SubLObject)$ic470$, var266);
        }
        final SubLObject var267 = module0034.f1782(var62, var263);
        final SubLObject var268 = module0034.f1814(var266, var267, (SubLObject)UNPROVIDED);
        if (var268 != $ic174$) {
            SubLObject var269 = var268;
            SubLObject var270 = (SubLObject)NIL;
            var270 = var269.first();
            while (NIL != var269) {
                SubLObject var271 = var270.first();
                final SubLObject var272 = conses_high.second(var270);
                if (var62.equal(var271.first())) {
                    var271 = var271.rest();
                    if (NIL != var271 && NIL == var271.rest() && var263.equal(var271.first())) {
                        return module0034.f1959(var272);
                    }
                }
                var269 = var269.rest();
                var270 = var269.first();
            }
        }
        final SubLObject var273 = Values.arg2(var264.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49581(var62, var263)));
        module0034.f1836(var266, var267, var268, var273, (SubLObject)ConsesLow.list(var62, var263));
        return module0034.f1959(var273);
    }
    
    public static SubLObject f49582(final SubLObject var200, final SubLObject var263) {
        return module0751.f46781((SubLObject)$ic472$, (SubLObject)ConsesLow.list($ic468$, (SubLObject)$ic472$, var200), var263, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49583(final SubLObject var543, final SubLObject var263) {
        return module0751.f46781((SubLObject)$ic473$, (SubLObject)ConsesLow.list($ic269$, (SubLObject)$ic474$, (SubLObject)ConsesLow.listS($ic475$, var543, (SubLObject)$ic476$)), var263, (SubLObject)$ic477$);
    }
    
    public static SubLObject f49564(final SubLObject var4, final SubLObject var62, final SubLObject var144, final SubLObject var263) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        var264.resetMultipleValues();
        final SubLObject var265 = f49579(var62, var263);
        final SubLObject var266 = var264.secondMultipleValue();
        var264.resetMultipleValues();
        SubLObject var267 = (SubLObject)NIL;
        SubLObject var268 = var265;
        SubLObject var269 = (SubLObject)NIL;
        var269 = var268.first();
        while (NIL != var268) {
            SubLObject var81_545 = f49583(var269, var263);
            SubLObject var270 = (SubLObject)NIL;
            var270 = var81_545.first();
            while (NIL != var81_545) {
                final SubLObject var271 = f49584(var269, var263);
                if (NIL != var271) {
                    final SubLObject var272 = f49397(var4, (SubLObject)$ic478$, var144, (SubLObject)$ic217$, (SubLObject)ConsesLow.list(var271, var270, var266, var263), (SubLObject)UNPROVIDED);
                    final SubLObject var273 = f49585(var263);
                    var267 = (SubLObject)T;
                    final SubLObject var274 = f49586(var271, var263);
                    final SubLObject var275 = f49587(var271, var263);
                    final SubLObject var276 = f49588(var271, var263);
                    final SubLObject var277 = f49589(var271, var263);
                    if (NIL != var275) {
                        f49397(var4, (SubLObject)$ic479$, var272, (SubLObject)$ic188$, var275, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var276) {
                        f49397(var4, (SubLObject)$ic480$, var272, (SubLObject)$ic188$, var276, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var277) {
                        f49397(var4, (SubLObject)$ic481$, var272, (SubLObject)$ic188$, var277, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var274) {
                        f49397(var4, (SubLObject)$ic482$, var272, (SubLObject)$ic188$, var274, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var273) {
                        f49538(var4, var272, var273, (SubLObject)UNPROVIDED);
                    }
                }
                var81_545 = var81_545.rest();
                var270 = var81_545.first();
            }
            var268 = var268.rest();
            var269 = var268.first();
        }
        if (NIL == var267) {
            f49397(var4, (SubLObject)$ic483$, var144, (SubLObject)$ic238$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            f49393(var144);
        }
        return var4;
    }
    
    public static SubLObject f49561(final SubLObject var62) {
        return module0035.sublisp_boolean(f49590(var62));
    }
    
    public static SubLObject f49591(final SubLObject var62) {
        final SubLObject var63 = module0340.f22786((SubLObject)$ic485$);
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        if (NIL != module0340.f22789(var63) && NIL == var66) {
            SubLObject var67 = module0775.f49690(var62);
            SubLObject var68 = (SubLObject)NIL;
            var68 = var67.first();
            while (NIL == var66 && NIL != var67) {
                if (NIL == module0373.f26177(var68) || !var63.eql(module0373.f26181(var68))) {
                    var66 = (SubLObject)T;
                }
                if (NIL == var66) {
                    SubLObject var300_552 = module0366.f24966(var68);
                    SubLObject var69 = (SubLObject)NIL;
                    var69 = var300_552.first();
                    while (NIL == var66 && NIL != var300_552) {
                        final SubLObject var70 = module0191.f11968(var69);
                        if (!var70.eql($ic486$)) {
                            if (var70.eql($ic487$) || var70.eql($ic488$) || var70.eql($ic489$)) {
                                SubLObject var72;
                                final SubLObject var71 = var72 = module0205.f13385(module0191.f11967(var69), (SubLObject)UNPROVIDED);
                                SubLObject var73 = (SubLObject)NIL;
                                SubLObject var74 = (SubLObject)NIL;
                                SubLObject var75 = (SubLObject)NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)$ic490$);
                                var73 = var72.first();
                                var72 = var72.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)$ic490$);
                                var74 = var72.first();
                                var72 = var72.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var72, var71, (SubLObject)$ic490$);
                                var75 = var72.first();
                                var72 = var72.rest();
                                final SubLObject var76 = (SubLObject)(var72.isCons() ? var72.first() : NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(var72, var71, (SubLObject)$ic490$);
                                var72 = var72.rest();
                                if (NIL == var72) {
                                    if (NIL == var65 || var65.equal(var73)) {
                                        var65 = var73;
                                    }
                                    else {
                                        var66 = (SubLObject)T;
                                    }
                                    final SubLObject var77 = var74;
                                    if (NIL == conses_high.member(var77, var64, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                        var64 = (SubLObject)ConsesLow.cons(var77, var64);
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var71, (SubLObject)$ic490$);
                                }
                            }
                        }
                        var300_552 = var300_552.rest();
                        var69 = var300_552.first();
                    }
                }
                var67 = var67.rest();
                var68 = var67.first();
            }
        }
        if (NIL != var66) {
            var65 = (SubLObject)NIL;
            var64 = (SubLObject)NIL;
        }
        return Values.values(var65, Sequences.nreverse(var64));
    }
    
    public static SubLObject f49590(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = module0034.$g879$.getDynamicValue(var63);
        SubLObject var65 = (SubLObject)NIL;
        if (NIL == var64) {
            return f49591(var62);
        }
        var65 = module0034.f1857(var64, (SubLObject)$ic484$, (SubLObject)UNPROVIDED);
        if (NIL == var65) {
            var65 = module0034.f1807(module0034.f1842(var64), (SubLObject)$ic484$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var64, (SubLObject)$ic484$, var65);
        }
        SubLObject var66 = module0034.f1814(var65, var62, (SubLObject)$ic174$);
        if (var66 == $ic174$) {
            var66 = Values.arg2(var63.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49591(var62)));
            module0034.f1816(var65, var62, var66, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var66);
    }
    
    public static SubLObject f49562(final SubLObject var4, final SubLObject var62, final SubLObject var144, final SubLObject var263) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        var264.resetMultipleValues();
        final SubLObject var265 = f49590(var62);
        final SubLObject var266 = var264.secondMultipleValue();
        var264.resetMultipleValues();
        f49592(var4, var144, var265, var266, var263);
        return var4;
    }
    
    public static SubLObject f49592(final SubLObject var4, final SubLObject var144, final SubLObject var543, final SubLObject var262, final SubLObject var263) {
        SubLObject var544 = (SubLObject)NIL;
        SubLObject var545 = f49593(var543, var263);
        SubLObject var546 = (SubLObject)NIL;
        var546 = var545.first();
        while (NIL != var545) {
            if (NIL != var546) {
                final SubLObject var547 = f49397(var4, (SubLObject)$ic478$, var144, (SubLObject)$ic215$, (SubLObject)ConsesLow.list(var546, var262, var263), (SubLObject)UNPROVIDED);
                final SubLObject var548 = f49584(var543, var263);
                final SubLObject var549 = f49585(var263);
                var544 = (SubLObject)T;
                if (NIL != var548) {
                    final SubLObject var550 = f49586(var548, var263);
                    final SubLObject var551 = f49587(var548, var263);
                    final SubLObject var552 = f49588(var548, var263);
                    final SubLObject var553 = f49589(var548, var263);
                    if (NIL != var551) {
                        f49397(var4, (SubLObject)$ic479$, var547, (SubLObject)$ic188$, var551, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var552) {
                        f49397(var4, (SubLObject)$ic480$, var547, (SubLObject)$ic188$, var552, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var553) {
                        f49397(var4, (SubLObject)$ic481$, var547, (SubLObject)$ic188$, var553, (SubLObject)UNPROVIDED);
                    }
                    if (NIL != var550) {
                        f49397(var4, (SubLObject)$ic482$, var547, (SubLObject)$ic188$, var550, (SubLObject)UNPROVIDED);
                    }
                }
                f49538(var4, var547, var549, (SubLObject)UNPROVIDED);
            }
            var545 = var545.rest();
            var546 = var545.first();
        }
        if (NIL == var544) {
            f49397(var4, (SubLObject)$ic483$, var144, (SubLObject)$ic238$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            f49393(var144);
        }
        return var4;
    }
    
    public static SubLObject f49559(final SubLObject var4, final SubLObject var99, final SubLObject var138, final SubLObject var123, SubLObject var560, SubLObject var561) {
        if (var560 == UNPROVIDED) {
            var560 = (SubLObject)ZERO_INTEGER;
        }
        if (var561 == UNPROVIDED) {
            var561 = module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        }
        final SubLThread var562 = SubLProcess.currentSubLThread();
        assert NIL != f49284(var4) : var4;
        assert NIL != module0191.f11950(var99) : var99;
        if (NIL != var138 && !areAssertionsDisabledFor(me) && NIL == f49371(var138)) {
            throw new AssertionError(var138);
        }
        final SubLObject var563 = $g6196$.currentBinding(var562);
        try {
            $g6196$.bind((SubLObject)T, var562);
            final SubLObject var564 = (SubLObject)makeBoolean(NIL == module0077.f5326(var99, var561));
            SubLObject var565 = (SubLObject)NIL;
            if (NIL == f49406(var4, var99, var138)) {
                if (NIL == f49553(var99)) {
                    if (NIL != assertion_handles_oc.f11035(var99) && NIL == module0178.f11376(var99)) {
                        var565 = f49397(var4, $g6169$.getDynamicValue(var562), var138, (SubLObject)$ic192$, var99, (SubLObject)UNPROVIDED);
                        f49594(var4, var99, var565, var123);
                    }
                    else if (NIL != assertion_handles_oc.f11035(var99) && NIL != var564) {
                        var565 = f49397(var4, $g6169$.getDynamicValue(var562), var138, (SubLObject)$ic192$, var99, (SubLObject)UNPROVIDED);
                        f49595(var4, var99, var565, var123);
                    }
                    else if (NIL != module0191.f11950(var99) && NIL != var564) {
                        var565 = f49397(var4, (SubLObject)$ic0$, var138, (SubLObject)$ic191$, var99, (SubLObject)UNPROVIDED);
                        f49595(var4, var99, var565, var123);
                    }
                    else if (NIL != module0191.f11950(var99)) {
                        final SubLObject var566 = module0775.f49754(module0775.f49691(module0775.f49816(var99, var4, var123)));
                        final SubLObject var567 = (NIL != var566) ? $g6170$.getDynamicValue(var562) : $g6171$.getDynamicValue(var562);
                        final SubLObject var568 = (SubLObject)((NIL != assertion_handles_oc.f11035(var99)) ? $ic192$ : $ic191$);
                        var565 = f49397(var4, var567, var138, var568, var99, (SubLObject)UNPROVIDED);
                        SubLObject var569 = (SubLObject)NIL;
                        if (NIL != var566) {
                            SubLObject var570 = var566;
                            SubLObject var571 = (SubLObject)NIL;
                            var571 = var570.first();
                            while (NIL != var570) {
                                f49559(var4, var571, var565, var123, module0048.f_1X(var560), var561);
                                var570 = var570.rest();
                                var571 = var570.first();
                            }
                            var569 = (SubLObject)T;
                        }
                        if (NIL != f49539(var99)) {
                            f49596(var4, var99, var565);
                            var569 = (SubLObject)T;
                        }
                        if (NIL == var569) {
                            if (NIL != module0537.f33305(var99)) {
                                f49397(var4, (SubLObject)$ic0$, var565, (SubLObject)$ic225$, var99, (SubLObject)UNPROVIDED);
                                f49461(var565, var99);
                            }
                            else if (NIL == f49344(var4)) {
                                f49397(var4, (SubLObject)$ic0$, var565, (SubLObject)$ic222$, var99, (SubLObject)UNPROVIDED);
                            }
                        }
                    }
                    else if (NIL != $g6197$.getDynamicValue(var562)) {
                        Errors.warn((SubLObject)$ic491$, var99);
                    }
                }
            }
            f49597(var4, var99, var560, var564);
            if (NIL != module0004.f104(var99, f49307(var4, (SubLObject)$ic78$, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) && NIL == f49399(var565)) {
                if (NIL != $g6197$.getDynamicValue(var562)) {
                    Errors.warn((SubLObject)$ic492$, var99);
                }
                f49402(var4, var565);
            }
            return var565;
        }
        finally {
            $g6196$.rebind(var563, var562);
        }
    }
    
    public static SubLObject f49597(final SubLObject var4, final SubLObject var99, final SubLObject var560, final SubLObject var562) {
        if (NIL != f49598(var4, var99, var560, var562)) {
            if (NIL != module0202.f12689(module0191.f11967(var99), (SubLObject)UNPROVIDED) && NIL != module0202.f12925(module0191.f11967(var99))) {
                f49313(var4, var99);
            }
            else if (NIL != f49325(var4) && NIL != module0178.f11290(var99)) {
                f49313(var4, var99);
            }
        }
        return var99;
    }
    
    public static SubLObject f49598(final SubLObject var4, final SubLObject var99, final SubLObject var560, final SubLObject var562) {
        final SubLThread var563 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean((NIL != module0579.$g4347$.getDynamicValue(var563) || NIL != f49325(var4)) && (NIL == f49599(var560) || (NIL != f49325(var4) && NIL != module0178.f11290(var99)) || (NIL != assertion_handles_oc.f11035(var99) && NIL != module0775.f49864(var99)) || NIL != module0537.f33305(var99)) && (NIL != module0537.f33305(var99) || (NIL != module0191.f11950(var99) && NIL != conses_high.member(module0191.f11965(var99), (SubLObject)$ic493$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || (NIL != assertion_handles_oc.f11035(var99) && (NIL != module0178.f11375(var99) || NIL != var562 || NIL != f49600(var99, var4, var560, var562)))));
    }
    
    public static SubLObject f49600(final SubLObject var286, final SubLObject var4, final SubLObject var560, final SubLObject var562) {
        final SubLThread var563 = SubLProcess.currentSubLThread();
        final SubLObject var564 = module0579.$g4348$.currentBinding(var563);
        try {
            module0579.$g4348$.bind((SubLObject)TEN_INTEGER, var563);
            if (NIL != f49599(var560)) {
                if (NIL != $g6197$.getDynamicValue(var563)) {
                    Errors.warn((SubLObject)$ic494$, var286);
                }
                return (SubLObject)NIL;
            }
        }
        finally {
            module0579.$g4348$.rebind(var564, var563);
        }
        final SubLObject var565 = module0775.f49691(module0775.f49824(var286));
        SubLObject var566 = (SubLObject)NIL;
        if (NIL == var566) {
            SubLObject var567 = var565;
            SubLObject var568 = (SubLObject)NIL;
            var568 = var567.first();
            while (NIL == var566 && NIL != var567) {
                if (NIL != f49598(var4, var568, module0048.f_1X(var560), var562)) {
                    var566 = var568;
                }
                var567 = var567.rest();
                var568 = var567.first();
            }
        }
        return Types.sublisp_null(var566);
    }
    
    public static SubLObject f49599(final SubLObject var560) {
        final SubLThread var561 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(module0579.$g4348$.getDynamicValue(var561).isInteger() && var560.numG(module0579.$g4348$.getDynamicValue(var561)));
    }
    
    public static SubLObject f49539(final SubLObject var18) {
        return (SubLObject)makeBoolean(NIL != module0191.f11950(var18) && NIL != module0004.f104(module0191.f11965(var18), (SubLObject)$ic495$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49596(final SubLObject var4, final SubLObject var99, final SubLObject var563) {
        final SubLObject var564 = f49540(var99);
        if (NIL != module0206.f13444(var564)) {
            f49538(var4, var563, var564, (SubLObject)UNPROVIDED);
            f49601(var4, var99, var563, var564);
        }
        return var564;
    }
    
    public static SubLObject f49540(final SubLObject var569) {
        final SubLObject var570 = module0191.f11965(var569);
        if (var570.eql((SubLObject)$ic496$)) {
            return module0775.f49873(var569).first();
        }
        if (var570.eql((SubLObject)$ic497$)) {
            final SubLObject var571 = constants_high_oc.f10737((SubLObject)$ic498$);
            if (NIL != constant_handles_oc.f8463(var571, (SubLObject)UNPROVIDED)) {
                return var571;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49585(final SubLObject var263) {
        return module0434.f30579((SubLObject)$ic499$, (SubLObject)ConsesLow.list($ic500$, (SubLObject)$ic499$, var263), $ic10$, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f49601(final SubLObject var4, final SubLObject var99, final SubLObject var563, final SubLObject var448) {
        final SubLThread var564 = SubLProcess.currentSubLThread();
        if (var448.eql($ic501$)) {
            var564.resetMultipleValues();
            final SubLObject var565 = module0337.f22630(module0191.f11967(var99), (SubLObject)$ic502$);
            final SubLObject var566 = var564.secondMultipleValue();
            var564.resetMultipleValues();
            if (NIL != var565) {
                final SubLObject var567 = module0035.f2293(var566, (SubLObject)$ic503$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var568 = module0035.f2293(var566, (SubLObject)$ic504$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var569 = module0191.f11976(var99);
                f49592(var4, var563, var567, (SubLObject)ConsesLow.list(var568), var569);
            }
        }
        return var4;
    }
    
    public static SubLObject f49593(final SubLObject var543, final SubLObject var263) {
        return module0751.f46781((SubLObject)$ic505$, (SubLObject)ConsesLow.list($ic269$, (SubLObject)$ic506$, (SubLObject)ConsesLow.listS($ic507$, var543, (SubLObject)$ic508$)), var263, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49602(final SubLObject var543, final SubLObject var263) {
        SubLObject var544 = module0751.f46781((SubLObject)$ic286$, (SubLObject)ConsesLow.listS($ic507$, var543, (SubLObject)$ic512$), var263, (SubLObject)UNPROVIDED);
        SubLObject var545 = (SubLObject)NIL;
        var545 = var544.first();
        while (NIL != var544) {
            if (NIL != module0751.f46847((SubLObject)ConsesLow.listS($ic510$, var545, (SubLObject)$ic511$), var263)) {
                return var545;
            }
            var544 = var544.rest();
            var545 = var544.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49584(final SubLObject var543, final SubLObject var263) {
        final SubLThread var544 = SubLProcess.currentSubLThread();
        final SubLObject var545 = module0034.$g879$.getDynamicValue(var544);
        SubLObject var546 = (SubLObject)NIL;
        if (NIL == var545) {
            return f49602(var543, var263);
        }
        var546 = module0034.f1857(var545, (SubLObject)$ic509$, (SubLObject)UNPROVIDED);
        if (NIL == var546) {
            var546 = module0034.f1807(module0034.f1842(var545), (SubLObject)$ic509$, (SubLObject)TWO_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var545, (SubLObject)$ic509$, var546);
        }
        final SubLObject var547 = module0034.f1782(var543, var263);
        final SubLObject var548 = module0034.f1814(var546, var547, (SubLObject)UNPROVIDED);
        if (var548 != $ic174$) {
            SubLObject var549 = var548;
            SubLObject var550 = (SubLObject)NIL;
            var550 = var549.first();
            while (NIL != var549) {
                SubLObject var551 = var550.first();
                final SubLObject var552 = conses_high.second(var550);
                if (var543.equal(var551.first())) {
                    var551 = var551.rest();
                    if (NIL != var551 && NIL == var551.rest() && var263.equal(var551.first())) {
                        return module0034.f1959(var552);
                    }
                }
                var549 = var549.rest();
                var550 = var549.first();
            }
        }
        final SubLObject var553 = Values.arg2(var544.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49602(var543, var263)));
        module0034.f1836(var546, var547, var548, var553, (SubLObject)ConsesLow.list(var543, var263));
        return module0034.f1959(var553);
    }
    
    public static SubLObject f49586(final SubLObject var266, final SubLObject var263) {
        return module0751.f46781((SubLObject)$ic513$, (SubLObject)ConsesLow.list($ic514$, (SubLObject)$ic513$, var266), (SubLObject)$ic515$, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f49588(final SubLObject var266, final SubLObject var263) {
        return module0751.f46781((SubLObject)$ic516$, (SubLObject)ConsesLow.listS($ic517$, var266, (SubLObject)$ic518$), (SubLObject)$ic515$, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f49589(final SubLObject var266, final SubLObject var263) {
        return module0751.f46781((SubLObject)$ic519$, (SubLObject)ConsesLow.listS($ic520$, var266, (SubLObject)$ic521$), (SubLObject)$ic515$, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f49587(final SubLObject var266, final SubLObject var263) {
        return module0751.f46781((SubLObject)$ic522$, (SubLObject)ConsesLow.listS($ic523$, var266, (SubLObject)$ic524$), (SubLObject)$ic515$, (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f49538(final SubLObject var4, final SubLObject var2, final SubLObject var95, SubLObject var204) {
        if (var204 == UNPROVIDED) {
            var204 = (SubLObject)NIL;
        }
        if (NIL != f49337(var2) && NIL != f49317(var95)) {
            f49436(var2, var95, var204);
            f49603(var4, var95, var204);
        }
        return var2;
    }
    
    public static SubLObject f49317(final SubLObject var18) {
        return (SubLObject)makeBoolean(NIL != var18 && NIL != module0206.f13450(var18));
    }
    
    public static SubLObject f49603(final SubLObject var4, final SubLObject var95, SubLObject var204) {
        if (var204 == UNPROVIDED) {
            var204 = (SubLObject)NIL;
        }
        if (NIL != f49317(var95)) {
            SubLObject var205 = f49316(var4, var95);
            if (NIL == module0004.f105(var205)) {
                SubLObject var206 = f49314(var4);
                SubLObject var207 = f49318(var4);
                if (NIL == module0067.f4852(var206)) {
                    var206 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                    var207 = module0057.f4173((SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f49315(var4, var206);
                    f49319(var4, var207);
                }
                var205 = module0057.f4175(var207);
                final SubLObject var208 = module0769.f49039(var95, var205, var204);
                module0067.f4886(var206, var95, var208);
            }
        }
        return var95;
    }
    
    public static SubLObject f49594(final SubLObject var4, final SubLObject var286, final SubLObject var571, final SubLObject var123) {
        final SubLThread var572 = SubLProcess.currentSubLThread();
        var572.resetMultipleValues();
        final SubLObject var573 = module0775.f49821(var286);
        SubLObject var574 = var572.secondMultipleValue();
        final SubLObject var575 = var572.thirdMultipleValue();
        var572.resetMultipleValues();
        SubLObject var576 = module0775.f49876(var286, var123);
        SubLObject var577 = (SubLObject)NIL;
        var577 = var576.first();
        while (NIL != var576) {
            final SubLObject var578 = var577;
            if (NIL == conses_high.member(var578, var574, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var574 = (SubLObject)ConsesLow.cons(var578, var574);
            }
            var576 = var576.rest();
            var577 = var576.first();
        }
        final SubLObject var579 = f49466(var4, var286);
        if (NIL != var574) {
            SubLObject var580 = var574;
            SubLObject var581 = (SubLObject)NIL;
            var581 = var580.first();
            while (NIL != var580) {
                f49538(var4, var571, var581, var575);
                var580 = var580.rest();
                var581 = var580.first();
            }
        }
        else if (NIL != var579 && NIL == f49344(var4)) {
            f49397(var4, (SubLObject)$ic525$, var571, (SubLObject)$ic231$, var573, (SubLObject)UNPROVIDED);
        }
        if (NIL == var579 && NIL != module0178.f11375(var286) && NIL == f49344(var4)) {
            f49397(var4, $g6173$.getDynamicValue(var572), var571, (SubLObject)$ic237$, var286, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0178.f11290(var286) && NIL != module0377.f26812(var286, $ic10$)) {
            f49397(var4, (SubLObject)$ic526$, var571, (SubLObject)$ic235$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        }
        return var4;
    }
    
    public static SubLObject f49595(final SubLObject var4, final SubLObject var99, final SubLObject var144, final SubLObject var123) {
        return f49397(var4, (SubLObject)$ic0$, var144, (SubLObject)$ic224$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49604(final SubLObject var4, final SubLObject var62, final SubLObject var263, final SubLObject var138) {
        final SubLObject var264 = f49391(var138);
        return f49397(var4, (SubLObject)$ic527$, var264, (SubLObject)$ic528$, module0775.f49705(var62, var263), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49605(final SubLObject var574, final SubLObject var575) {
        final SubLObject var576 = module0366.f24967(var574);
        final SubLObject var577 = module0366.f24967(var575);
        return (SubLObject)makeBoolean(NIL != module0035.f2004(var576, var577) && NIL != module0035.f2014(var576) && NIL == conses_high.set_difference(var576, var577, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49606(final SubLObject var62) {
        return f49607(var62);
    }
    
    public static SubLObject f49608(final SubLObject var62) {
        if (NIL == module0366.f24938(var62)) {
            return (SubLObject)ONE_INTEGER;
        }
        return module0048.f_1X(module0048.f3381(Mapping.mapcar((SubLObject)$ic529$, module0366.f24938(var62)), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f49607(final SubLObject var62) {
        final SubLThread var63 = SubLProcess.currentSubLThread();
        final SubLObject var64 = module0034.$g879$.getDynamicValue(var63);
        SubLObject var65 = (SubLObject)NIL;
        if (NIL == var64) {
            return f49608(var62);
        }
        var65 = module0034.f1857(var64, (SubLObject)$ic529$, (SubLObject)UNPROVIDED);
        if (NIL == var65) {
            var65 = module0034.f1807(module0034.f1842(var64), (SubLObject)$ic529$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var64, (SubLObject)$ic529$, var65);
        }
        SubLObject var66 = module0034.f1814(var65, var62, (SubLObject)$ic174$);
        if (var66 == $ic174$) {
            var66 = Values.arg2(var63.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49608(var62)));
            module0034.f1816(var65, var62, var66, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var66);
    }
    
    public static SubLObject f49609(final SubLObject var62, final SubLObject var263) {
        final SubLObject var264 = module0373.f26241(var62);
        final SubLObject var265 = module0370.f25912(var264, var263);
        return var265;
    }
    
    public static SubLObject f49610(final SubLObject var95, SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = f49258();
        }
        final SubLThread var264 = SubLProcess.currentSubLThread();
        var264.resetMultipleValues();
        SubLObject var265 = f49611(var95, var263);
        SubLObject var266 = var264.secondMultipleValue();
        SubLObject var267 = var264.thirdMultipleValue();
        var264.resetMultipleValues();
        if (var265.isString()) {
            final SubLObject var268 = f49612();
            var265 = (SubLObject)(var268.isString() ? Sequences.cconcatenate(var268, var265) : NIL);
            if (NIL != module0038.f2684(var265, module0724.f44348((SubLObject)UNPROVIDED))) {
                final SubLObject var269 = Sequences.cconcatenate((SubLObject)$ic530$, module0038.f2674(var265, module0724.f44348((SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED));
                if (NIL == module0075.f5218(module0075.f5176(module0110.$g120$.getDynamicValue(var264), var269, (SubLObject)UNPROVIDED))) {
                    if (NIL != $g6197$.getDynamicValue(var264)) {
                        Errors.warn((SubLObject)$ic531$, var269, var95);
                    }
                    var265 = (SubLObject)NIL;
                    var266 = (SubLObject)NIL;
                    var267 = (SubLObject)NIL;
                }
            }
        }
        return Values.values(var265, var266, var267);
    }
    
    public static SubLObject f49613(final SubLObject var584, final SubLObject var286) {
        f49614();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49615(final SubLObject var584, final SubLObject var286) {
        f49614();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49614() {
        final SubLObject var308 = $g6207$.getGlobalValue();
        if (NIL != var308) {
            module0034.f1818(var308);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49616(final SubLObject var95, SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = f49258();
        }
        return module0034.f1829($g6207$.getGlobalValue(), (SubLObject)ConsesLow.list(var95, var263), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f49617(final SubLObject var95, final SubLObject var263) {
        final SubLThread var264 = SubLProcess.currentSubLThread();
        var264.resetMultipleValues();
        SubLObject var265 = f49618(var95, var263);
        final SubLObject var266 = var264.secondMultipleValue();
        var264.resetMultipleValues();
        SubLObject var267 = (SubLObject)NIL;
        if (!var265.isString()) {
            var264.resetMultipleValues();
            final SubLObject var585_586 = f49619(var95, var263);
            final SubLObject var587_588 = var264.secondMultipleValue();
            var264.resetMultipleValues();
            var265 = var585_586;
            var267 = var587_588;
        }
        return Values.values(var265, var266, var267);
    }
    
    public static SubLObject f49611(final SubLObject var95, SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = f49258();
        }
        SubLObject var264 = $g6207$.getGlobalValue();
        if (NIL == var264) {
            var264 = module0034.f1934((SubLObject)$ic534$, (SubLObject)$ic535$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)$ic536$);
        }
        final SubLObject var265 = module0034.f1782(var95, var263);
        final SubLObject var266 = module0034.f1814(var264, var265, (SubLObject)UNPROVIDED);
        if (var266 != $ic174$) {
            SubLObject var267 = var266;
            SubLObject var268 = (SubLObject)NIL;
            var268 = var267.first();
            while (NIL != var267) {
                SubLObject var269 = var268.first();
                final SubLObject var270 = conses_high.second(var268);
                if (var95.equal(var269.first())) {
                    var269 = var269.rest();
                    if (NIL != var269 && NIL == var269.rest() && var263.equal(var269.first())) {
                        return module0034.f1959(var270);
                    }
                }
                var267 = var267.rest();
                var268 = var267.first();
            }
        }
        final SubLObject var271 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f49617(var95, var263)));
        module0034.f1836(var264, var265, var266, var271, (SubLObject)ConsesLow.list(var95, var263));
        return module0034.f1959(var271);
    }
    
    public static SubLObject f49618(final SubLObject var95, SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = f49258();
        }
        final SubLThread var264 = SubLProcess.currentSubLThread();
        SubLObject var265 = (SubLObject)NIL;
        SubLObject var266 = (SubLObject)NIL;
        if (NIL != module0212.f13762(var95)) {
            final SubLObject var267 = module0147.f9540(var263);
            final SubLObject var268 = module0147.$g2095$.currentBinding(var264);
            final SubLObject var269 = module0147.$g2094$.currentBinding(var264);
            final SubLObject var270 = module0147.$g2096$.currentBinding(var264);
            try {
                module0147.$g2095$.bind(module0147.f9545(var267), var264);
                module0147.$g2094$.bind(module0147.f9546(var267), var264);
                module0147.$g2096$.bind(module0147.f9549(var267), var264);
                final SubLObject var271 = module0220.f14562(var95, $ic537$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var272;
                SubLObject var273;
                for (var272 = (SubLObject)NIL, var272 = var271; NIL == var265 && NIL != var272; var272 = var272.rest()) {
                    var273 = (var266 = var272.first());
                    if (NIL != module0212.f13762(var273)) {
                        var265 = module0220.f14553(var273, $ic538$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                if (NIL == var265) {
                    final SubLObject var274 = module0220.f14562(var95, $ic539$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                    SubLObject var275;
                    for (var272 = (SubLObject)NIL, var272 = var274; NIL == var265 && NIL != var272; var272 = var272.rest()) {
                        var275 = (var266 = var272.first());
                        if (NIL != module0212.f13762(var275)) {
                            var265 = module0220.f14553(var275, $ic538$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    if (NIL == var265) {
                        SubLObject var276;
                        SubLObject var594_599;
                        SubLObject var277;
                        for (var272 = (SubLObject)NIL, var272 = var274; NIL == var265 && NIL != var272; var272 = var272.rest()) {
                            var275 = var272.first();
                            if (NIL != module0212.f13762(var275)) {
                                var276 = module0220.f14562(var275, $ic540$, (SubLObject)THREE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
                                for (var594_599 = (SubLObject)NIL, var594_599 = var276; NIL == var265 && NIL != var594_599; var594_599 = var594_599.rest()) {
                                    var277 = (var266 = var594_599.first());
                                    if (NIL != module0212.f13762(var277)) {
                                        var265 = module0220.f14553(var277, $ic538$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == var265) {
                    final SubLObject var278 = module0220.f14562(var95, $ic541$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    SubLObject var279;
                    for (var272 = (SubLObject)NIL, var272 = var278; NIL == var265 && NIL != var272; var272 = var272.rest()) {
                        var279 = (var266 = var272.first());
                        if (NIL != module0212.f13762(var279)) {
                            var265 = module0220.f14553(var279, $ic538$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var270, var264);
                module0147.$g2094$.rebind(var269, var264);
                module0147.$g2095$.rebind(var268, var264);
            }
        }
        return Values.values(var265, var266);
    }
    
    public static SubLObject f49619(final SubLObject var95, SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = f49258();
        }
        final SubLThread var264 = SubLProcess.currentSubLThread();
        final SubLObject var265 = constants_high_oc.f10737((SubLObject)$ic542$);
        if (NIL == var265) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var266 = (SubLObject)NIL;
        SubLObject var267 = (SubLObject)NIL;
        final SubLObject var268 = module0147.f9540(var263);
        final SubLObject var269 = module0147.$g2095$.currentBinding(var264);
        final SubLObject var270 = module0147.$g2094$.currentBinding(var264);
        final SubLObject var271 = module0147.$g2096$.currentBinding(var264);
        try {
            module0147.$g2095$.bind(module0147.f9545(var268), var264);
            module0147.$g2094$.bind(module0147.f9546(var268), var264);
            module0147.$g2096$.bind(module0147.f9549(var268), var264);
            final SubLObject var272 = var265;
            if (NIL != module0158.f10038(var272)) {
                final SubLObject var273 = (SubLObject)NIL;
                final SubLObject var64_605 = module0012.$g73$.currentBinding(var264);
                final SubLObject var207_606 = module0012.$g65$.currentBinding(var264);
                final SubLObject var235_607 = module0012.$g67$.currentBinding(var264);
                final SubLObject var274 = module0012.$g68$.currentBinding(var264);
                final SubLObject var275 = module0012.$g66$.currentBinding(var264);
                final SubLObject var276 = module0012.$g69$.currentBinding(var264);
                final SubLObject var277 = module0012.$g70$.currentBinding(var264);
                final SubLObject var278 = module0012.$silent_progressP$.currentBinding(var264);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var264);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var264), var264);
                    module0012.$g67$.bind((SubLObject)ONE_INTEGER, var264);
                    module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var264);
                    module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var264);
                    module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var264);
                    module0012.$g70$.bind((SubLObject)T, var264);
                    module0012.$silent_progressP$.bind((SubLObject)((NIL != var273) ? module0012.$silent_progressP$.getDynamicValue(var264) : T), var264);
                    module0012.f474(var273);
                    final SubLObject var279 = module0158.f10039(var272);
                    SubLObject var280 = (SubLObject)NIL;
                    final SubLObject var281 = (SubLObject)NIL;
                    while (NIL == var280) {
                        final SubLObject var282 = module0052.f3695(var279, var281);
                        final SubLObject var283 = (SubLObject)makeBoolean(!var281.eql(var282));
                        if (NIL != var283) {
                            module0012.f476();
                            SubLObject var284 = (SubLObject)NIL;
                            try {
                                var284 = module0158.f10316(var282, (SubLObject)$ic543$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var609_614 = (SubLObject)NIL;
                                final SubLObject var610_615 = (SubLObject)NIL;
                                while (NIL == var609_614) {
                                    final SubLObject var285 = module0052.f3695(var284, var610_615);
                                    final SubLObject var612_617 = (SubLObject)makeBoolean(!var610_615.eql(var285));
                                    if (NIL != var612_617) {
                                        final SubLObject var286 = module0178.f11334(var285);
                                        if (NIL != module0259.f16854(var95, var286, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && (NIL == var267 || NIL != f49620(var286, var267, (SubLObject)UNPROVIDED))) {
                                            var267 = var286;
                                            var266 = module0178.f11335(var285);
                                        }
                                    }
                                    var609_614 = (SubLObject)makeBoolean(NIL == var612_617);
                                }
                            }
                            finally {
                                final SubLObject var64_606 = Threads.$is_thread_performing_cleanupP$.currentBinding(var264);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var264);
                                    if (NIL != var284) {
                                        module0158.f10319(var284);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var64_606, var264);
                                }
                            }
                        }
                        var280 = (SubLObject)makeBoolean(NIL == var283);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var278, var264);
                    module0012.$g70$.rebind(var277, var264);
                    module0012.$g69$.rebind(var276, var264);
                    module0012.$g66$.rebind(var275, var264);
                    module0012.$g68$.rebind(var274, var264);
                    module0012.$g67$.rebind(var235_607, var264);
                    module0012.$g65$.rebind(var207_606, var264);
                    module0012.$g73$.rebind(var64_605, var264);
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var271, var264);
            module0147.$g2094$.rebind(var270, var264);
            module0147.$g2095$.rebind(var269, var264);
        }
        if (!var266.isString()) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL);
        }
        final SubLObject var287 = f49621(var95, var267, var263);
        return Values.values(var266, var287);
    }
    
    public static SubLObject f49620(final SubLObject var621, final SubLObject var622, SubLObject var263) {
        if (var263 == UNPROVIDED) {
            var263 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != module0256.f16576(var621, var622, var263, (SubLObject)UNPROVIDED) || (NIL == module0256.f16576(var622, var621, var263, (SubLObject)UNPROVIDED) && NIL != module0549.f33911(var622, var621)));
    }
    
    public static SubLObject f49621(final SubLObject var623, final SubLObject var624, final SubLObject var263) {
        final SubLThread var625 = SubLProcess.currentSubLThread();
        SubLObject var626 = (SubLObject)NIL;
        final SubLObject var627 = module0147.$g2094$.currentBinding(var625);
        final SubLObject var628 = module0147.$g2095$.currentBinding(var625);
        try {
            module0147.$g2094$.bind((SubLObject)$ic544$, var625);
            module0147.$g2095$.bind(var263, var625);
            final SubLObject var629 = module0259.f16822(var623, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var630 = module0256.f16572(var624, var629, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var626 = module0256.f16635(var630, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var628, var625);
            module0147.$g2094$.rebind(var627, var625);
        }
        return var626;
    }
    
    public static SubLObject f49622(final SubLObject var22, final SubLObject var23) {
        SubLObject var25;
        final SubLObject var24 = var25 = var22.rest();
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var24, (SubLObject)$ic545$);
        var26 = var25.first();
        final SubLObject var27;
        var25 = (var27 = var25.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic71$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic546$, var26)), (SubLObject)$ic547$, ConsesLow.append(var27, (SubLObject)NIL));
    }
    
    public static SubLObject f49612() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (NIL != $g6208$.getDynamicValue(var1)) ? $g6208$.getDynamicValue(var1) : f49623();
    }
    
    public static SubLObject f49623() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        SubLObject var2 = (SubLObject)NIL;
        final SubLObject var3 = module0147.$g2094$.currentBinding(var1);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var1);
        try {
            module0147.$g2094$.bind((SubLObject)$ic544$, var1);
            module0147.$g2095$.bind(f49258(), var1);
            var2 = module0220.f14567($ic549$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var4, var1);
            module0147.$g2094$.rebind(var3, var1);
        }
        if (NIL != module0035.f2012(var2)) {
            return (SubLObject)NIL;
        }
        final SubLObject var5 = var2.first();
        return module0724.f44350(var5, (SubLObject)T);
    }
    
    public static SubLObject f49624() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49257", "S#53743", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49258", "S#53744", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49259", "S#53745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49265", "S#53746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49268", "S#53747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49270", "S#53713", 1, 0, false);
        new $f49270$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49271", "S#53748", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49272", "S#53749", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49273", "S#53750", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49274", "S#53751", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49275", "S#53752", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49276", "S#53753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49277", "S#53754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49278", "S#53755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49279", "S#53756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49280", "S#53757", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49281", "S#53758", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49282", "S#53759", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49283", "S#53760", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49284", "S#53761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49269", "S#53762", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49285", "S#53763", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49286", "S#53764", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49287", "S#53765", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0773", "f49288", "S#53766");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0773", "f49289", "S#53767");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49290", "S#53768", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0773", "f49291", "S#53769");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49292", "S#53770", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49295", "S#53771", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49298", "S#53772", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49297", "S#53773", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0773", "f49302", "S#53774");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49303", "S#53775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49304", "S#53776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49305", "S#53777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49306", "S#53778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49309", "CLEAR-PROOF-VIEW-MEMOIZATION-STATE-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49301", "S#53779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49296", "S#53780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49299", "S#53781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49266", "S#53782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49267", "S#53783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49310", "S#53784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49311", "S#46275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49312", "S#53785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49313", "S#53786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49314", "S#53787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49315", "S#53788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49316", "S#53789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49318", "S#53790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49319", "S#53791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49320", "S#53792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49321", "S#53793", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49322", "S#53794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49323", "S#53795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49263", "S#53796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49324", "S#53797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49325", "S#53798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49326", "S#53799", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49262", "S#53800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49327", "S#53801", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49264", "S#53802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49328", "S#53803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49329", "S#53804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49330", "S#53805", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49331", "S#53806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49332", "S#53807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49333", "S#53808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49334", "S#53809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49335", "S#53810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49336", "S#53811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49337", "S#53812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49340", "S#53813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49341", "S#53814", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49342", "S#53815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49343", "S#53816", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49344", "S#53817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49345", "S#53818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49346", "S#53819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49347", "S#53820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49348", "S#53821", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49349", "S#53822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49350", "S#53823", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49351", "S#53824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49352", "S#53825", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49353", "SET-PROOF-VIEW-ALLOW-EXTERNAL-LINKS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49354", "S#53826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49355", "S#53827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49356", "S#53828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49357", "S#53829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49358", "SET-PROOF-VIEW-LANGUAGE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49359", "S#53830", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49360", "S#53831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49362", "S#53832", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49363", "S#53833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49294", "S#53834", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49364", "S#53835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49365", "S#53836", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49366", "S#53837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49367", "S#53838", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49361", "S#53839", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49308", "S#53840", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49307", "S#53841", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49368", "S#53842", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49369", "S#53843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49371", "S#53717", 1, 0, false);
        new $f49371$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49372", "S#53844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49373", "S#53845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49374", "S#53846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49375", "S#53847", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49376", "S#53848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49377", "S#53849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49378", "S#53850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49379", "S#53851", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49380", "S#53852", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49381", "S#53853", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49382", "S#53854", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49383", "S#53855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49384", "S#53856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49385", "S#53857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49386", "S#53858", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49387", "S#53859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49388", "S#53860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49389", "S#53861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49370", "S#53862", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49390", "S#53863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49300", "S#53864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49392", "S#53865", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49293", "S#53866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49394", "S#53867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49396", "S#53868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49397", "S#53869", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49401", "S#53870", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49402", "S#53871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49398", "S#53872", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49406", "S#53873", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49395", "S#53874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49407", "S#53875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49391", "S#53876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49403", "S#53877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49408", "S#53878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49261", "S#53879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49338", "S#53880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49260", "S#53881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49409", "S#53882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49410", "S#53883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49404", "S#53884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49411", "S#53885", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49405", "S#53886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49412", "S#53887", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49413", "S#53888", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49414", "S#53889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49415", "S#53890", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0773", "f49416", "S#53891");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49399", "S#53892", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49400", "S#53893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49419", "S#53894", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49421", "S#53895", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49420", "S#53896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49418", "S#53897", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49423", "S#53898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49424", "S#53899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49426", "S#53900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49429", "S#53901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49428", "S#53902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49425", "S#53903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49430", "S#53904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49432", "S#53905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49431", "S#53906", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49433", "S#53907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49434", "S#53908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49393", "S#53909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49435", "S#53910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49436", "S#53911", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49437", "S#53912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49438", "GENERATE-HTML-FROM-PROOF-VIEW-ENTRY-IDS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49440", "PROOF-VIEW-ENTRY-HTML", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49439", "S#53913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49441", "S#53914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49443", "S#53915", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49442", "S#53916", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0773", "f49445", "S#53917");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49444", "S#53918", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49448", "S#53919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49449", "S#53920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49447", "S#53921", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49455", "S#53922", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49446", "S#53923", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49461", "S#53924", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49462", "S#53925", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49463", "S#53926", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49458", "S#53927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49459", "S#53928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49460", "S#53929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49456", "S#53930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49457", "S#53931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49450", "S#53932", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49453", "S#53933", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49454", "S#53934", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49466", "S#53935", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49465", "S#53936", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49468", "S#53937", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49469", "S#53938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49470", "S#53939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49467", "S#53940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49451", "S#53941", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49452", "S#53942", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49472", "S#53943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49464", "S#53944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49473", "S#53945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49471", "S#53946", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49474", "S#53947", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49476", "S#53948", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49477", "S#53949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49475", "S#53950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49478", "S#53951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49479", "GET-ABDUCED-SUPPORT-SENTENCE-FOR-PROOF-VIEW", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49480", "ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49481", "S#53952", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49482", "S#53953", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49483", "GET-QUERY-URL-FOR-PROOF-VIEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49484", "GET-SENTENCE-FOR-PROOF-VIEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49485", "CONSTRUCT-PROOF-VIEWS-JAVA-ITERATIVELY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49486", "S#53954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49489", "CONSTRUCT-PROOF-VIEWS-JAVA-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49490", "CONSTRUCT-XML-PROOF-VIEW-FOR-SENTENCE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49493", "PROOF-VIEW-XML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49492", "S#53955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49495", "S#53956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49497", "S#53957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49498", "S#53958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49499", "S#53959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49496", "S#53960", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49494", "S#53961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49502", "S#53962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49500", "S#53963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49501", "S#53964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49488", "S#53965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49503", "S#53966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49504", "S#53967", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49505", "S#53968", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49506", "S#53969", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49487", "S#35179", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49491", "S#53970", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49516", "S#53971", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49507", "S#53972", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49508", "S#53973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49509", "S#53974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49514", "S#53975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49339", "S#53976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49517", "S#53977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49422", "S#53978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49518", "S#53979", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49512", "S#53980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49519", "S#35180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49523", "S#53981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49522", "S#53982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49417", "S#53983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49524", "S#53984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49526", "S#53985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49532", "S#53986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49533", "S#53987", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49529", "S#53988", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49528", "S#53989", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49531", "S#53990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49534", "S#53991", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49525", "S#53992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49535", "S#53993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49527", "S#53994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49520", "S#53995", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49536", "S#53996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49537", "S#53997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49521", "S#53998", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49541", "S#53999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49542", "S#54000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49543", "S#54001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49427", "S#35237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49544", "S#54002", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49510", "S#54003", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49511", "S#54004", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49547", "S#54005", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49549", "S#54006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49530", "S#54007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49550", "S#54008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49548", "S#54009", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49513", "S#54010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49551", "S#54011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49515", "S#54012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49552", "S#54013", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49553", "S#54014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49554", "S#54015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49555", "S#54016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49556", "S#54017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49546", "S#54018", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49567", "S#54019", 6, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49560", "S#54020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49565", "S#54021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49557", "S#54022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49568", "S#54023", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49569", "S#54024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49566", "S#54025", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49573", "S#54026", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49574", "S#54027", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49572", "S#54028", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49558", "S#54029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49570", "S#54030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49575", "S#54031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49576", "S#54032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49571", "S#54033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49577", "S#54034", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49545", "S#54035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49563", "S#54036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49580", "S#54037", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49578", "S#54038", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49581", "S#54039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49579", "S#54040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49582", "S#54041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49583", "S#54042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49564", "S#54043", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49561", "S#54044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49591", "S#54045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49590", "S#54046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49562", "S#54047", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49592", "S#54048", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49559", "S#54049", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49597", "S#54050", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49598", "S#54051", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49600", "S#54052", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49599", "S#54053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49539", "S#54054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49596", "S#54055", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49540", "S#54056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49585", "S#54057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49601", "S#54058", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49593", "S#54059", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49602", "S#54060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49584", "S#54061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49586", "S#54062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49588", "S#54063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49589", "S#54064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49587", "S#54065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49538", "S#54066", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49317", "S#54067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49603", "S#54068", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49594", "S#54069", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49595", "S#54070", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49604", "S#54071", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49605", "S#54072", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49606", "S#54073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49608", "S#54074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49607", "S#31814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49609", "S#54075", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49610", "S#53487", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49613", "ADD-TINY-ICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49615", "REMOVE-TINY-ICON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49614", "S#54076", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49616", "S#54077", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49617", "S#54078", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49611", "S#54079", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49618", "S#54080", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49619", "S#54081", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49620", "S#54082", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49621", "S#54083", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0773", "f49622", "S#54084");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49612", "GET-TKB-IMAGE-ROOT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0773", "f49623", "S#54085", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49625() {
        $g6169$ = SubLFiles.defparameter("S#54086", (SubLObject)$ic0$);
        $g6170$ = SubLFiles.defparameter("S#54087", (SubLObject)$ic0$);
        $g6171$ = SubLFiles.defparameter("S#54088", (SubLObject)$ic0$);
        $g6172$ = SubLFiles.defparameter("S#54089", (SubLObject)$ic1$);
        $g6173$ = SubLFiles.defparameter("S#54090", (SubLObject)$ic0$);
        $g6174$ = SubLFiles.defparameter("S#54091", (SubLObject)$ic2$);
        $g6175$ = SubLFiles.defparameter("S#54092", (SubLObject)$ic3$);
        $g6176$ = SubLFiles.defparameter("S#54093", (SubLObject)$ic4$);
        $g6177$ = SubLFiles.defparameter("S#54094", (SubLObject)$ic5$);
        $g6178$ = SubLFiles.defparameter("S#54095", (SubLObject)$ic6$);
        $g6179$ = SubLFiles.deflexical("S#54096", (SubLObject)$ic7$);
        $g6180$ = SubLFiles.defparameter("S#54097", (SubLObject)NIL);
        $g6181$ = SubLFiles.deflexical("S#54098", (SubLObject)ConsesLow.list(module0015.$g520$.getGlobalValue(), module0015.$g502$.getGlobalValue(), module0015.$g507$.getGlobalValue(), module0015.$g514$.getGlobalValue(), module0015.$g511$.getGlobalValue(), module0015.$g496$.getGlobalValue()));
        $g6182$ = SubLFiles.deflexical("S#54099", module0015.$g506$.getGlobalValue());
        $g6183$ = SubLFiles.deflexical("S#54100", module0015.$g489$.getGlobalValue());
        $g6184$ = SubLFiles.deflexical("S#54101", module0015.$g495$.getGlobalValue());
        $g6185$ = SubLFiles.defparameter("S#54102", (SubLObject)$ic8$);
        $g6186$ = SubLFiles.defparameter("S#54103", (SubLObject)$ic9$);
        $g6187$ = SubLFiles.defparameter("S#54104", (SubLObject)NIL);
        $g6188$ = SubLFiles.defparameter("S#54105", (SubLObject)$ic11$);
        $g6189$ = SubLFiles.defconstant("S#54106", (SubLObject)$ic16$);
        $g6190$ = SubLFiles.deflexical("S#54107", (NIL != Symbols.boundp((SubLObject)$ic47$)) ? $g6190$.getGlobalValue() : module0065.f4745((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g6191$ = SubLFiles.defconstant("S#54108", (SubLObject)ZERO_INTEGER);
        $g6192$ = SubLFiles.defparameter("S#54109", (SubLObject)NIL);
        $g6193$ = SubLFiles.defconstant("S#54110", (SubLObject)$ic117$);
        $g6194$ = SubLFiles.defparameter("S#54111", (SubLObject)NIL);
        $g6195$ = SubLFiles.defparameter("S#54112", (SubLObject)FIVE_INTEGER);
        $g6196$ = SubLFiles.defparameter("S#54113", (SubLObject)NIL);
        $g6197$ = SubLFiles.defvar("S#54114", (SubLObject)NIL);
        $g6198$ = SubLFiles.defparameter("S#54115", (SubLObject)NIL);
        $g6199$ = SubLFiles.defparameter("S#54116", (SubLObject)T);
        $g6200$ = SubLFiles.deflexical("S#54117", (SubLObject)NIL);
        $g6201$ = SubLFiles.defparameter("S#54118", (SubLObject)T);
        $g6202$ = SubLFiles.defparameter("S#54119", (SubLObject)NIL);
        $g6203$ = SubLFiles.defparameter("S#54120", (SubLObject)THREE_INTEGER);
        $g6204$ = SubLFiles.defparameter("S#54121", (SubLObject)NIL);
        $g6205$ = SubLFiles.deflexical("S#54122", (NIL != Symbols.boundp((SubLObject)$ic442$)) ? $g6205$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g6206$ = SubLFiles.defparameter("S#54123", (SubLObject)NIL);
        $g6207$ = SubLFiles.deflexical("S#54124", (SubLObject)NIL);
        $g6208$ = SubLFiles.defparameter("S#54125", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f49626() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g6189$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic23$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Equality.identity((SubLObject)$ic16$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g6189$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic43$));
        module0003.f57((SubLObject)$ic47$);
        module0002.f50((SubLObject)$ic72$, (SubLObject)$ic74$);
        module0002.f38((SubLObject)$ic76$);
        module0002.f38((SubLObject)$ic106$);
        module0002.f38((SubLObject)$ic109$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g6193$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic124$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic125$);
        Structures.def_csetf((SubLObject)$ic126$, (SubLObject)$ic127$);
        Structures.def_csetf((SubLObject)$ic128$, (SubLObject)$ic129$);
        Structures.def_csetf((SubLObject)$ic130$, (SubLObject)$ic131$);
        Structures.def_csetf((SubLObject)$ic132$, (SubLObject)$ic133$);
        Structures.def_csetf((SubLObject)$ic134$, (SubLObject)$ic135$);
        Structures.def_csetf((SubLObject)$ic136$, (SubLObject)$ic137$);
        Structures.def_csetf((SubLObject)$ic138$, (SubLObject)$ic139$);
        Equality.identity((SubLObject)$ic117$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g6193$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic146$));
        module0034.f1895((SubLObject)$ic172$);
        module0034.f1895((SubLObject)$ic176$);
        module0034.f1895((SubLObject)$ic182$);
        module0002.f38((SubLObject)$ic193$);
        module0002.f38((SubLObject)$ic197$);
        module0034.f1895((SubLObject)$ic201$);
        module0034.f1895((SubLObject)$ic210$);
        module0034.f1909((SubLObject)$ic277$);
        module0002.f38((SubLObject)$ic309$);
        module0002.f38((SubLObject)$ic311$);
        module0002.f38((SubLObject)$ic313$);
        module0002.f38((SubLObject)$ic314$);
        module0002.f38((SubLObject)$ic315$);
        module0002.f38((SubLObject)$ic320$);
        module0002.f38((SubLObject)$ic323$);
        module0002.f38((SubLObject)$ic325$);
        module0034.f1895((SubLObject)$ic379$);
        module0034.f1895((SubLObject)$ic359$);
        module0034.f1895((SubLObject)$ic369$);
        module0003.f57((SubLObject)$ic442$);
        module0034.f1895((SubLObject)$ic465$);
        module0034.f1895((SubLObject)$ic470$);
        module0034.f1895((SubLObject)$ic484$);
        module0034.f1895((SubLObject)$ic509$);
        module0034.f1895((SubLObject)$ic529$);
        module0012.f416((SubLObject)$ic532$);
        module0012.f416((SubLObject)$ic533$);
        module0034.f1909((SubLObject)$ic534$);
        module0002.f38((SubLObject)$ic548$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f49624();
    }
    
    public void initializeVariables() {
        f49625();
    }
    
    public void runTopLevelForms() {
        f49626();
    }
    
    static {
        me = (SubLFile)new module0773();
        $g6169$ = null;
        $g6170$ = null;
        $g6171$ = null;
        $g6172$ = null;
        $g6173$ = null;
        $g6174$ = null;
        $g6175$ = null;
        $g6176$ = null;
        $g6177$ = null;
        $g6178$ = null;
        $g6179$ = null;
        $g6180$ = null;
        $g6181$ = null;
        $g6182$ = null;
        $g6183$ = null;
        $g6184$ = null;
        $g6185$ = null;
        $g6186$ = null;
        $g6187$ = null;
        $g6188$ = null;
        $g6189$ = null;
        $g6190$ = null;
        $g6191$ = null;
        $g6192$ = null;
        $g6193$ = null;
        $g6194$ = null;
        $g6195$ = null;
        $g6196$ = null;
        $g6197$ = null;
        $g6198$ = null;
        $g6199$ = null;
        $g6200$ = null;
        $g6201$ = null;
        $g6202$ = null;
        $g6203$ = null;
        $g6204$ = null;
        $g6205$ = null;
        $g6206$ = null;
        $g6207$ = null;
        $g6208$ = null;
        $ic0$ = makeString("");
        $ic1$ = makeString("External Sources:");
        $ic2$ = makeString("Source:");
        $ic3$ = makeString("Detailed Justification:");
        $ic4$ = makeString("Linear Justification:");
        $ic5$ = makeString("Because:");
        $ic6$ = makeString("Key Rules:");
        $ic7$ = makeString("Justified above.");
        $ic8$ = makeInteger(200);
        $ic9$ = makeInteger(150);
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic11$ = makeKeyword("SUPERSCRIPTS");
        $ic12$ = makeKeyword("PROOF");
        $ic13$ = makeKeyword("ANSWER");
        $ic14$ = makeSymbol("*PPH-LANGUAGE-MT*");
        $ic15$ = makeSymbol("S#54105", "CYC");
        $ic16$ = makeSymbol("S#53712", "CYC");
        $ic17$ = makeSymbol("S#53713", "CYC");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#27811", "CYC"), (SubLObject)makeSymbol("S#3281", "CYC"), (SubLObject)makeSymbol("S#6282", "CYC"), (SubLObject)makeSymbol("S#5852", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("PROOF"), (SubLObject)makeKeyword("ANSWER"), (SubLObject)makeKeyword("ID-INDEX"), (SubLObject)makeKeyword("PROPERTIES"));
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#53748", "CYC"), (SubLObject)makeSymbol("S#53749", "CYC"), (SubLObject)makeSymbol("S#53750", "CYC"), (SubLObject)makeSymbol("S#53751", "CYC"), (SubLObject)makeSymbol("S#53752", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#53753", "CYC"), (SubLObject)makeSymbol("S#53754", "CYC"), (SubLObject)makeSymbol("S#53755", "CYC"), (SubLObject)makeSymbol("S#53756", "CYC"), (SubLObject)makeSymbol("S#53757", "CYC"));
        $ic22$ = makeSymbol("S#53762", "CYC");
        $ic23$ = makeSymbol("S#53747", "CYC");
        $ic24$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#53713", "CYC"));
        $ic25$ = makeSymbol("S#53748", "CYC");
        $ic26$ = makeSymbol("S#53753", "CYC");
        $ic27$ = makeSymbol("S#53749", "CYC");
        $ic28$ = makeSymbol("S#53754", "CYC");
        $ic29$ = makeSymbol("S#53750", "CYC");
        $ic30$ = makeSymbol("S#53755", "CYC");
        $ic31$ = makeSymbol("S#53751", "CYC");
        $ic32$ = makeSymbol("S#53756", "CYC");
        $ic33$ = makeSymbol("S#53752", "CYC");
        $ic34$ = makeSymbol("S#53757", "CYC");
        $ic35$ = makeKeyword("ID");
        $ic36$ = makeKeyword("ID-INDEX");
        $ic37$ = makeKeyword("PROPERTIES");
        $ic38$ = makeString("Invalid slot ~S for construction function");
        $ic39$ = makeKeyword("BEGIN");
        $ic40$ = makeSymbol("S#53758", "CYC");
        $ic41$ = makeKeyword("SLOT");
        $ic42$ = makeKeyword("END");
        $ic43$ = makeSymbol("S#53760", "CYC");
        $ic44$ = makeString("#<PROOF-VIEW ");
        $ic45$ = makeString(" proof=");
        $ic46$ = makeString(">");
        $ic47$ = makeSymbol("S#54107", "CYC");
        $ic48$ = makeSymbol("INTEGERP");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#8600", "CYC"), (SubLObject)makeSymbol("S#53712", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#54126", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#54126", "CYC"))), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic50$ = ConsesLow.list((SubLObject)makeKeyword("ENTRY-ID"), (SubLObject)makeKeyword("DONE"));
        $ic51$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic52$ = makeKeyword("ENTRY-ID");
        $ic53$ = makeSymbol("S#54126", "CYC");
        $ic54$ = makeKeyword("DONE");
        $ic55$ = makeSymbol("DO-ID-INDEX");
        $ic56$ = makeSymbol("S#53781", "CYC");
        $ic57$ = makeSymbol("IGNORE");
        $ic58$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#54127", "CYC"), (SubLObject)makeSymbol("S#8600", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic59$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic60$ = makeSymbol("CSOME");
        $ic61$ = makeSymbol("S#53892", "CYC");
        $ic62$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#53712", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("S#1519", "CYC"))), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic63$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("DONE"));
        $ic64$ = makeSymbol("S#1519", "CYC");
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("S#53763", "CYC"));
        $ic66$ = makeSymbol("S#26816", "CYC");
        $ic67$ = makeKeyword("SKIP");
        $ic68$ = makeKeyword("FREE");
        $ic69$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#53712", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic70$ = makeUninternedSymbol("US#352BA47");
        $ic71$ = makeSymbol("CLET");
        $ic72$ = makeSymbol("S#53775", "CYC");
        $ic73$ = makeSymbol("S#3165", "CYC");
        $ic74$ = makeSymbol("S#53774", "CYC");
        $ic75$ = makeKeyword("MEMOIZATION-STATE");
        $ic76$ = makeSymbol("CLEAR-PROOF-VIEW-MEMOIZATION-STATE-BY-ID");
        $ic77$ = makeSymbol("S#53890", "CYC");
        $ic78$ = makeKeyword("FACTS-USED");
        $ic79$ = makeKeyword("USED-SUPPORTS");
        $ic80$ = makeSymbol("S#53714", "CYC");
        $ic81$ = makeKeyword("SOURCE-INDEX");
        $ic82$ = makeKeyword("SOURCE-ISG");
        $ic83$ = makeSymbol("S#910", "CYC");
        $ic84$ = makeKeyword("FILTERED-ITEMS");
        $ic85$ = makeKeyword("UNKNOWN");
        $ic86$ = makeString("filtering ~S~% (reason: ~S)");
        $ic87$ = makeKeyword("ADDRESSEE");
        $ic88$ = makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $ic89$ = makeKeyword("INCLUDE-SUMMARY-SECTION?");
        $ic90$ = makeSymbol("BOOLEANP");
        $ic91$ = makeKeyword("INCLUDE-RULES-SECTION?");
        $ic92$ = makeKeyword("INCLUDE-JUSTIFICATION-SECTION?");
        $ic93$ = makeKeyword("INCLUDE-LINEAR-SECTION?");
        $ic94$ = makeKeyword("ENABLE-DEBUG?");
        $ic95$ = makeKeyword("INCLUDE-CYCL-IN-XML?");
        $ic96$ = makeKeyword("INCLUDE-SOURCES?");
        $ic97$ = makeKeyword("SUMMARY-ONLY");
        $ic98$ = makeSymbol("S#53810", "CYC");
        $ic99$ = makeKeyword("INCLUDE-CYCML-IN-XML?");
        $ic100$ = makeString("SILK not supported in non Cyc-HALO builds.");
        $ic101$ = makeKeyword("SUPPRESS-ASSERTION-BOOKKEEPING?");
        $ic102$ = makeKeyword("SUPPRESS-ASSERTION-CYCLISTS?");
        $ic103$ = makeKeyword("SUPPRESS-ASSERTION-CYCLIST-EMPLOYERS?");
        $ic104$ = makeKeyword("SUPPRESS-ASSERTION-DATES?");
        $ic105$ = makeKeyword("ALLOW-EXTERNAL-LINKS?");
        $ic106$ = makeSymbol("SET-PROOF-VIEW-ALLOW-EXTERNAL-LINKS?");
        $ic107$ = makeKeyword("ALLOW-INTERNAL-LINKS?");
        $ic108$ = makeKeyword("LANGUAGE-MT");
        $ic109$ = makeSymbol("SET-PROOF-VIEW-LANGUAGE-MT");
        $ic110$ = makeSymbol("S#13265", "CYC");
        $ic111$ = makeKeyword("DOMAIN-MT");
        $ic112$ = makeKeyword("CREATION-UNIVERSAL-TIME");
        $ic113$ = makeSymbol("S#4951", "CYC");
        $ic114$ = makeKeyword("POPULATED-UNIVERSAL-TIME");
        $ic115$ = makeKeyword("DISPLAYED-UNIVERSAL-TIME");
        $ic116$ = makeSymbol("KEYWORDP");
        $ic117$ = makeSymbol("S#53716", "CYC");
        $ic118$ = makeSymbol("S#53717", "CYC");
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"), (SubLObject)makeSymbol("S#54128", "CYC"), (SubLObject)makeSymbol("S#1572", "CYC"), (SubLObject)makeSymbol("S#39318", "CYC"), (SubLObject)makeSymbol("OBJECT", "CYC"), (SubLObject)makeSymbol("S#53712", "CYC"), (SubLObject)makeSymbol("S#5852", "CYC"));
        $ic120$ = ConsesLow.list((SubLObject)makeKeyword("ID"), (SubLObject)makeKeyword("PARENT-ID"), (SubLObject)makeKeyword("LABEL"), (SubLObject)makeKeyword("OBJECT-TYPE"), (SubLObject)makeKeyword("OBJECT"), (SubLObject)makeKeyword("PROOF-VIEW"), (SubLObject)makeKeyword("PROPERTIES"));
        $ic121$ = ConsesLow.list((SubLObject)makeSymbol("S#53844", "CYC"), (SubLObject)makeSymbol("S#53845", "CYC"), (SubLObject)makeSymbol("S#53846", "CYC"), (SubLObject)makeSymbol("S#53847", "CYC"), (SubLObject)makeSymbol("S#53848", "CYC"), (SubLObject)makeSymbol("S#53849", "CYC"), (SubLObject)makeSymbol("S#53850", "CYC"));
        $ic122$ = ConsesLow.list((SubLObject)makeSymbol("S#53851", "CYC"), (SubLObject)makeSymbol("S#53852", "CYC"), (SubLObject)makeSymbol("S#53853", "CYC"), (SubLObject)makeSymbol("S#53854", "CYC"), (SubLObject)makeSymbol("S#53855", "CYC"), (SubLObject)makeSymbol("S#53856", "CYC"), (SubLObject)makeSymbol("S#53857", "CYC"));
        $ic123$ = makeSymbol("S#53862", "CYC");
        $ic124$ = makeSymbol("S#53843", "CYC");
        $ic125$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#53717", "CYC"));
        $ic126$ = makeSymbol("S#53844", "CYC");
        $ic127$ = makeSymbol("S#53851", "CYC");
        $ic128$ = makeSymbol("S#53845", "CYC");
        $ic129$ = makeSymbol("S#53852", "CYC");
        $ic130$ = makeSymbol("S#53846", "CYC");
        $ic131$ = makeSymbol("S#53853", "CYC");
        $ic132$ = makeSymbol("S#53847", "CYC");
        $ic133$ = makeSymbol("S#53854", "CYC");
        $ic134$ = makeSymbol("S#53848", "CYC");
        $ic135$ = makeSymbol("S#53855", "CYC");
        $ic136$ = makeSymbol("S#53849", "CYC");
        $ic137$ = makeSymbol("S#53856", "CYC");
        $ic138$ = makeSymbol("S#53850", "CYC");
        $ic139$ = makeSymbol("S#53857", "CYC");
        $ic140$ = makeKeyword("PARENT-ID");
        $ic141$ = makeKeyword("LABEL");
        $ic142$ = makeKeyword("OBJECT-TYPE");
        $ic143$ = makeKeyword("OBJECT");
        $ic144$ = makeKeyword("PROOF-VIEW");
        $ic145$ = makeSymbol("S#53858", "CYC");
        $ic146$ = makeSymbol("S#53860", "CYC");
        $ic147$ = makeString("#<PROOF-VIEW-ENTRY ");
        $ic148$ = makeString("~D.~D");
        $ic149$ = makeString(" label=");
        $ic150$ = makeSymbol("S#53761", "CYC");
        $ic151$ = makeKeyword("ROOT");
        $ic152$ = makeString("Root");
        $ic153$ = makeString("Initial ID in ~S is ~S; should be 0.");
        $ic154$ = makeString("~S has no root entry.~%");
        $ic155$ = makeSymbol("STRINGP");
        $ic156$ = makeKeyword("SECTION-ROOT");
        $ic157$ = makeSymbol("SYMBOLP");
        $ic158$ = makeSymbol("S#748", "CYC");
        $ic159$ = makeString("~S already exists (~S time~:P) in ~S");
        $ic160$ = ConsesLow.list((SubLObject)makeUninternedSymbol("US#352B2C1"), (SubLObject)makeUninternedSymbol("US#13A2892"), (SubLObject)makeUninternedSymbol("US#1160044"));
        $ic161$ = makeKeyword("DO-HASH-TABLE");
        $ic162$ = makeString("-");
        $ic163$ = ConsesLow.list((SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#105", "CYC"));
        $ic164$ = makeSymbol("PWHEN");
        $ic165$ = makeSymbol("S#54114", "CYC");
        $ic166$ = makeSymbol("WARN");
        $ic167$ = makeKeyword("CHILDREN");
        $ic168$ = makeSymbol("S#747", "CYC");
        $ic169$ = makeSymbol("S#53894", "CYC");
        $ic170$ = makeString("Sort by specificity changed order~% from ~S~%   to ~S~%");
        $ic171$ = makeString("Sort by causality changed order~% from ~S~%   to ~S~%");
        $ic172$ = makeSymbol("S#53896", "CYC");
        $ic173$ = makeKeyword("IGNORE");
        $ic174$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic175$ = makeKeyword("CAUSE");
        $ic176$ = makeSymbol("S#53902", "CYC");
        $ic177$ = makeSymbol("?ARG");
        $ic178$ = constant_handles_oc.f8479((SubLObject)makeString("causeArg"));
        $ic179$ = ConsesLow.list((SubLObject)makeSymbol("?ARG"));
        $ic180$ = ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic181$ = makeKeyword("EFFECT");
        $ic182$ = makeSymbol("S#53906", "CYC");
        $ic183$ = constant_handles_oc.f8479((SubLObject)makeString("effectArg"));
        $ic184$ = makeKeyword("EXPAND-INITIALLY?");
        $ic185$ = makeSymbol("S#53861", "CYC");
        $ic186$ = makeKeyword("SOURCES");
        $ic187$ = makeSymbol("CYCL-TERM-P");
        $ic188$ = makeSymbol("S#16374", "CYC");
        $ic189$ = makeSymbol("S#15496", "CYC");
        $ic190$ = makeKeyword("QUERY-SENTENCE");
        $ic191$ = makeSymbol("SUPPORT-P");
        $ic192$ = makeSymbol("ASSERTION-P");
        $ic193$ = makeSymbol("GENERATE-HTML-FROM-PROOF-VIEW-ENTRY-IDS");
        $ic194$ = makeKeyword("NONE");
        $ic195$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic196$ = makeString("can't find proof-view-entry for ids (~A ~A)");
        $ic197$ = makeSymbol("PROOF-VIEW-ENTRY-HTML");
        $ic198$ = makeKeyword("ENTRY-PARAPHRASE-FN");
        $ic199$ = makeSymbol("S#53914", "CYC");
        $ic200$ = makeSymbol("S#5859", "CYC");
        $ic201$ = makeSymbol("S#53916", "CYC");
        $ic202$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1518", "CYC"), (SubLObject)makeSymbol("S#9672", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic203$ = makeSymbol("PIF");
        $ic204$ = makeSymbol("S#963", "CYC");
        $ic205$ = makeKeyword("COLOR");
        $ic206$ = makeSymbol("S#54129", "CYC");
        $ic207$ = makeSymbol("S#54130", "CYC");
        $ic208$ = makeKeyword("LINEAR-ID");
        $ic209$ = makeString("~A. ");
        $ic210$ = makeSymbol("S#53920", "CYC");
        $ic211$ = makeKeyword("PROOF-VIEW-ENTRY-CONFIRMED");
        $ic212$ = makeKeyword("PROOF-VIEW-ENTRY-DENIED");
        $ic213$ = makeString("~A");
        $ic214$ = makeKeyword("SOURCE-CITATION");
        $ic215$ = makeKeyword("EXTERNAL-SENTENCE");
        $ic216$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#13098", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic217$ = makeKeyword("ENTITY-MENTION");
        $ic218$ = ConsesLow.list((SubLObject)makeSymbol("S#50252", "CYC"), (SubLObject)makeSymbol("S#54131", "CYC"), (SubLObject)makeSymbol("S#13098", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"));
        $ic219$ = makeKeyword("BINDINGS");
        $ic220$ = makeKeyword("RULE-USED");
        $ic221$ = constant_handles_oc.f8479((SubLObject)makeString("keyRuleEnglishSummary"));
        $ic222$ = makeKeyword("UNSUPPORTED-SUPPORT");
        $ic223$ = makeString("Fact computed by Cyc.");
        $ic224$ = makeKeyword("CIRCULAR-SUPPORT");
        $ic225$ = makeKeyword("ABDUCED-SUPPORT");
        $ic226$ = makeString("Cyc thinks this might be true but can't prove it.");
        $ic227$ = makeKeyword("ABDUCED-SUPPORT-CONFIRMED");
        $ic228$ = makeString("Confirmed, but not provable from previous knowledge.");
        $ic229$ = makeKeyword("ABDUCED-SUPPORT-DENIED");
        $ic230$ = makeString("Denied, and not provable from previous knowledge.");
        $ic231$ = makeKeyword("GIVEN");
        $ic232$ = makeString("Given in the question.");
        $ic233$ = makeKeyword("EXCEPTION");
        $ic234$ = makeString("This rule has exceptions, but none that apply in this case.");
        $ic235$ = makeKeyword("PRAGMATICS");
        $ic236$ = makeString("This rule has further conditions on its application, but all are met in this case.");
        $ic237$ = makeKeyword("ASSERTION-BOOKKEEPING");
        $ic238$ = makeKeyword("NO-SOURCE-DOCUMENT");
        $ic239$ = makeKeyword("EMPTY-JUSTIFICATION");
        $ic240$ = makeKeyword("PREMISE");
        $ic241$ = makeKeyword("RULE");
        $ic242$ = makeKeyword("CONCLUSION");
        $ic243$ = makeKeyword("FROM");
        $ic244$ = makeString("From ");
        $ic245$ = makeString("~A and ~A");
        $ic246$ = makeString("and ");
        $ic247$ = makeString(", ");
        $ic248$ = makeString("no output method for ~S");
        $ic249$ = makeKeyword("HAS-ABDUCED-SUPPORT?");
        $ic250$ = makeKeyword("HAS-ABDUCED-SUPPORT-CONFIRMED?");
        $ic251$ = makeKeyword("HAS-ABDUCED-SUPPORT-DENIED?");
        $ic252$ = makeSymbol("S#53512", "CYC");
        $ic253$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic254$ = makeString(": ");
        $ic255$ = makeString("Given in the query");
        $ic256$ = makeString("Entered");
        $ic257$ = makeString(" by an employee ");
        $ic258$ = makeString(" by ");
        $ic259$ = makeString(" of ");
        $ic260$ = makeString(" on ");
        $ic261$ = makeString(" at ");
        $ic262$ = makeString(" for ");
        $ic263$ = makeString("Fact asserted in Cyc Knowledge Base");
        $ic264$ = makeString(".");
        $ic265$ = constant_handles_oc.f8479((SubLObject)makeString("HypotheticalContext"));
        $ic266$ = ConsesLow.list((SubLObject)makeSymbol("S#54132", "CYC"), (SubLObject)makeSymbol("S#36121", "CYC"));
        $ic267$ = constant_handles_oc.f8479((SubLObject)makeString("Null-TimeParameter"));
        $ic268$ = makeSymbol("?EMPLOYER");
        $ic269$ = constant_handles_oc.f8479((SubLObject)makeString("and"));
        $ic270$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic271$ = makeSymbol("?MT");
        $ic272$ = constant_handles_oc.f8479((SubLObject)makeString("employees"));
        $ic273$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mtTimeIndex")), (SubLObject)makeSymbol("?MT"), (SubLObject)makeSymbol("?TIME"));
        $ic274$ = constant_handles_oc.f8479((SubLObject)makeString("temporallySubsumes"));
        $ic275$ = makeSymbol("?TIME");
        $ic276$ = ConsesLow.list((SubLObject)makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)NIL, (SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic277$ = makeSymbol("S#53940", "CYC");
        $ic278$ = ConsesLow.list((SubLObject)makeSymbol("?EMPLOYER"), (SubLObject)makeSymbol("?MT"));
        $ic279$ = ConsesLow.list((SubLObject)makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)NIL);
        $ic280$ = makeSymbol("S#54117", "CYC");
        $ic281$ = ConsesLow.list((SubLObject)makeSymbol("?OFFSET"), (SubLObject)makeSymbol("?LENGTH"), (SubLObject)makeSymbol("?TEXT"));
        $ic282$ = constant_handles_oc.f8479((SubLObject)makeString("lengthOfList"));
        $ic283$ = ConsesLow.list((SubLObject)makeSymbol("?LENGTH"));
        $ic284$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("textOfWork")), (SubLObject)makeSymbol("?DOCUMENT"), (SubLObject)makeSymbol("?TEXT"));
        $ic285$ = constant_handles_oc.f8479((SubLObject)makeString("startOffset"));
        $ic286$ = makeSymbol("?DOCUMENT");
        $ic287$ = ConsesLow.list((SubLObject)makeSymbol("?OFFSET"));
        $ic288$ = ConsesLow.list((SubLObject)makeSymbol("S#35177", "CYC"), (SubLObject)makeSymbol("LENGTH"), (SubLObject)makeSymbol("S#43646", "CYC"));
        $ic289$ = makeString("...");
        $ic290$ = ConsesLow.list((SubLObject)makeSymbol("S#54133", "CYC"), (SubLObject)makeSymbol("S#54134", "CYC"), (SubLObject)makeSymbol("S#54135", "CYC"), (SubLObject)makeSymbol("S#1518", "CYC"));
        $ic291$ = makeSymbol("?TEXT");
        $ic292$ = constant_handles_oc.f8479((SubLObject)makeString("textOfWork"));
        $ic293$ = ConsesLow.list((SubLObject)makeSymbol("?TEXT"));
        $ic294$ = ConsesLow.list((SubLObject)makeSymbol("S#35177", "CYC"), (SubLObject)makeSymbol("LENGTH"));
        $ic295$ = ConsesLow.list((SubLObject)makeSymbol("?OFFSET"), (SubLObject)makeSymbol("?LENGTH"));
        $ic296$ = constant_handles_oc.f8479((SubLObject)makeString("startOffsetForMention"));
        $ic297$ = constant_handles_oc.f8479((SubLObject)makeString("stringLengthForMention"));
        $ic298$ = makeKeyword("EXTERNAL-TERMS");
        $ic299$ = makeKeyword("NOT-FOUND");
        $ic300$ = makeSymbol("<");
        $ic301$ = makeSymbol("SECOND");
        $ic302$ = makeSymbol("?STRING");
        $ic303$ = constant_handles_oc.f8479((SubLObject)makeString("termStrings"));
        $ic304$ = ConsesLow.list((SubLObject)makeSymbol("?STRING"));
        $ic305$ = ConsesLow.list((SubLObject)makeKeyword("REWRITE-ALLOWED?"), (SubLObject)T);
        $ic306$ = makeString(" ,");
        $ic307$ = makeString(",");
        $ic308$ = makeSymbol("S#53951", "CYC");
        $ic309$ = makeSymbol("GET-ABDUCED-SUPPORT-SENTENCE-FOR-PROOF-VIEW");
        $ic310$ = constant_handles_oc.f8479((SubLObject)makeString("not"));
        $ic311$ = makeSymbol("ASSERT-ABDUCTION-SUPPORT-FOR-PROOF-VIEW");
        $ic312$ = constant_handles_oc.f8479((SubLObject)makeString("ContextOfPCWFn"));
        $ic313$ = makeSymbol("GET-QUERY-URL-FOR-PROOF-VIEW");
        $ic314$ = makeSymbol("GET-SENTENCE-FOR-PROOF-VIEW");
        $ic315$ = makeSymbol("CONSTRUCT-PROOF-VIEWS-JAVA-ITERATIVELY");
        $ic316$ = makeSymbol("S#38", "CYC");
        $ic317$ = makeSymbol("S#36758", "CYC");
        $ic318$ = makeSymbol("S#36759", "CYC");
        $ic319$ = makeSymbol("S#54073", "CYC");
        $ic320$ = makeSymbol("CONSTRUCT-PROOF-VIEWS-JAVA-LIST");
        $ic321$ = makeString("inference-answer: ~A~%");
        $ic322$ = makeString("proofs: ~A~%");
        $ic323$ = makeSymbol("CONSTRUCT-XML-PROOF-VIEW-FOR-SENTENCE");
        $ic324$ = makeKeyword("MAX-NUMBER");
        $ic325$ = makeSymbol("PROOF-VIEW-XML");
        $ic326$ = makeString("~s Does not identify existing proof-view");
        $ic327$ = makeString("proof-view");
        $ic328$ = makeString("id");
        $ic329$ = makeKeyword("SUMMARY-ROOT");
        $ic330$ = makeString("proof-view-summary");
        $ic331$ = makeKeyword("JUSTIFICATION-ROOT");
        $ic332$ = makeString("proof-view-details");
        $ic333$ = makeKeyword("SOURCES-ROOT");
        $ic334$ = makeString("proof-view-sources");
        $ic335$ = makeKeyword("RULES-USED");
        $ic336$ = makeString("proof-view-rules");
        $ic337$ = makeString("proof-view-id");
        $ic338$ = makeString("proof-view-entry");
        $ic339$ = ConsesLow.list((SubLObject)makeSymbol("S#54136", "CYC"), (SubLObject)makeSymbol("S#42702", "CYC"));
        $ic340$ = makeString("cycl");
        $ic341$ = makeString("sub-entries");
        $ic342$ = makeString("expand-initially");
        $ic343$ = makeString("label");
        $ic344$ = makeString("object-type");
        $ic345$ = makeString("abduced-support");
        $ic346$ = makeString("content");
        $ic347$ = makeKeyword("ENTRIES");
        $ic348$ = makeKeyword("TRUE");
        $ic349$ = makeKeyword("FALSE");
        $ic350$ = makeKeyword("ABDUCED-SUPPORT?");
        $ic351$ = makeSymbol("INFERENCE-ANSWER-P");
        $ic352$ = makeString("proof");
        $ic353$ = makeSymbol("S#12263", "CYC");
        $ic354$ = makeString("Yes.");
        $ic355$ = makeString("Query:");
        $ic356$ = makeKeyword("QUERY-ROOT");
        $ic357$ = makeString("Answer:");
        $ic358$ = makeKeyword("USED-RULES-ROOT");
        $ic359$ = makeSymbol("S#54000", "CYC");
        $ic360$ = makeSymbol("S#53981", "CYC");
        $ic361$ = makeSymbol("S#17907", "CYC");
        $ic362$ = makeSymbol("S#53996", "CYC");
        $ic363$ = makeSymbol("S#53986", "CYC");
        $ic364$ = makeString("Using rule conclusion: ~S");
        $ic365$ = makeString("Not descending into transitive support ~S");
        $ic366$ = makeKeyword("EVAL");
        $ic367$ = makeString("Not descending into eval support ~S");
        $ic368$ = makeSymbol("CCONCATENATE");
        $ic369$ = makeSymbol("S#35237", "CYC");
        $ic370$ = makeString("Expanding entry ~D ~S~% ~S");
        $ic371$ = makeString("Filtering ~S, despite no child facts.");
        $ic372$ = makeString("No child facts for ~S");
        $ic373$ = constant_handles_oc.f8479((SubLObject)makeString("MtUnionFn"));
        $ic374$ = makeString("Trivial support: ~S");
        $ic375$ = makeString("Trivial support for answer: ~S");
        $ic376$ = makeString("Assertion on hypothetical: ~S");
        $ic377$ = makeString("Non-THCL: ~S");
        $ic378$ = constant_handles_oc.f8479((SubLObject)makeString("englishGloss"));
        $ic379$ = makeSymbol("S#53988", "CYC");
        $ic380$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#13100", "CYC"));
        $ic381$ = makeString("~S~% trivially implies answer conjunct ~S");
        $ic382$ = makeKeyword("TVA");
        $ic383$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION-P"), (SubLObject)makeSymbol("SUPPORT-P"), (SubLObject)makeSymbol("S#15496", "CYC"), (SubLObject)makeKeyword("EXTERNAL-SENTENCE"));
        $ic384$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION-P"), (SubLObject)makeSymbol("SUPPORT-P"));
        $ic385$ = makeString("Got ~S items from ~S~% Got ~S");
        $ic386$ = makeString("Can't find a sentence from ~S");
        $ic387$ = makeString("Failed to store ~S on ~S");
        $ic388$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("typeChangesQuantityByFactor"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#10058", "CYC")), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#52297", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#41058", "CYC")));
        $ic389$ = makeSymbol("S#41058", "CYC");
        $ic390$ = makeSymbol("S#52297", "CYC");
        $ic391$ = makeSymbol("S#10058", "CYC");
        $ic392$ = ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("subEventTypes")));
        $ic393$ = constant_handles_oc.f8479((SubLObject)makeString("IncreaseOnSlotFn"));
        $ic394$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllExists")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25109", "CYC")));
        $ic395$ = makeSymbol("S#25109", "CYC");
        $ic396$ = makeSymbol("S#25108", "CYC");
        $ic397$ = makeSymbol("S#24413", "CYC");
        $ic398$ = ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic399$ = makeSymbol("S#155", "CYC");
        $ic400$ = constant_handles_oc.f8479((SubLObject)makeString("Kappa"));
        $ic401$ = ConsesLow.list((SubLObject)makeKeyword("ANYTHING"), (SubLObject)makeKeyword("ANYTHING"));
        $ic402$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExists"));
        $ic403$ = constant_handles_oc.f8479((SubLObject)makeString("coGenlPreds"));
        $ic404$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#24413", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25108", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#25109", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("MIN")));
        $ic405$ = makeSymbol("MIN");
        $ic406$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("coveringOfEventType"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#54137", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#54138", "CYC")));
        $ic407$ = makeSymbol("S#54138", "CYC");
        $ic408$ = makeSymbol("S#54137", "CYC");
        $ic409$ = ConsesLow.list((SubLObject)makeKeyword("SPEC-PRED"), constant_handles_oc.f8479((SubLObject)makeString("lastProperSubEventTypes")));
        $ic410$ = ConsesLow.list((SubLObject)makeKeyword("SPEC-PRED"), constant_handles_oc.f8479((SubLObject)makeString("startsAfterEndOfInSituationType")));
        $ic411$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SUB1")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("SUB2")));
        $ic412$ = makeSymbol("SUB2");
        $ic413$ = makeSymbol("SUB1");
        $ic414$ = ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("partTypesFactsForType")), constant_handles_oc.f8479((SubLObject)makeString("resultTypesFactsForType")));
        $ic415$ = makeKeyword("FULLY-BOUND");
        $ic416$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("GENL-PRED"), constant_handles_oc.f8479((SubLObject)makeString("firstProperSubSituationTypes"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12578", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#54139", "CYC")));
        $ic417$ = makeSymbol("S#54139", "CYC");
        $ic418$ = makeSymbol("S#12578", "CYC");
        $ic419$ = constant_handles_oc.f8479((SubLObject)makeString("startTogetherInSituationType"));
        $ic420$ = makeKeyword("ANYTHING");
        $ic421$ = makeString("~S~% trivially implies ~S");
        $ic422$ = makeString("Don't know how to get sentence of ~S");
        $ic423$ = makeString("Nothing interesting available.");
        $ic424$ = makeKeyword("LINEAR-ROOT");
        $ic425$ = makeString("Rule: ");
        $ic426$ = makeString("Reached linear depth cutoff of ~D.~% Pruning supports for~% ~S");
        $ic427$ = makeString("Therefore:");
        $ic428$ = makeSymbol("S#53884", "CYC");
        $ic429$ = makeSymbol("S#53876", "CYC");
        $ic430$ = makeString("Pruning supports for ~S");
        $ic431$ = makeSymbol("S#54008", "CYC");
        $ic432$ = ConsesLow.list((SubLObject)makeKeyword("ISA"), (SubLObject)makeKeyword("GENLS"), (SubLObject)makeKeyword("DISJOINTWITH"), (SubLObject)makeKeyword("TRANSITIVITY"), (SubLObject)makeKeyword("TVA"), (SubLObject)makeKeyword("GENLPREDS"));
        $ic433$ = ConsesLow.list((SubLObject)makeKeyword("UNKNOWN"), (SubLObject)makeKeyword("FALSE"));
        $ic434$ = makeString("Unrecognized linear section object type: ~S");
        $ic435$ = makeString("Reusing linear entry for ~S");
        $ic436$ = makeSymbol("S#12732", "CYC");
        $ic437$ = makeSymbol("S#54011", "CYC");
        $ic438$ = makeSymbol("S#53514", "CYC");
        $ic439$ = makeSymbol("S#12629", "CYC");
        $ic440$ = makeKeyword("TEST");
        $ic441$ = makeSymbol("GENL-PREDICATE?");
        $ic442$ = makeSymbol("S#54122", "CYC");
        $ic443$ = makeString("Adding ~S:~% ~S");
        $ic444$ = makeSymbol("S#16405", "CYC");
        $ic445$ = makeString("Relocated: ~S");
        $ic446$ = makeKeyword("TRIVIAL");
        $ic447$ = makeString("Trivial");
        $ic448$ = makeString("Has entry already.");
        $ic449$ = makeKeyword("IRRELEVANT");
        $ic450$ = makeString("Proof has isomorphic support: ~A");
        $ic451$ = makeString("Constructing default proof view for ~S");
        $ic452$ = makeString("Adding sub-entries under ~S");
        $ic453$ = makeKeyword("ALREADY-HANDLED-PROOFS");
        $ic454$ = makeSymbol("FORT-P");
        $ic455$ = makeKeyword("RESIDUAL-PROOF-ATTACHMENT-POINTS");
        $ic456$ = makeString("Proved conjuncts:~% ~S");
        $ic457$ = makeString("Proved transformed conjuncts:~% ~S");
        $ic458$ = makeString("Remaining conjuncts:~% ~S");
        $ic459$ = makeString("Current subproof conclusion: ~S");
        $ic460$ = makeString("Checking ~S");
        $ic461$ = makeString("Found subproof of ~S");
        $ic462$ = makeString("Found double-duty residiual transformation proof:~% ~S");
        $ic463$ = makeString("Found double-duty conjunctive removal proof:~% ~S");
        $ic464$ = makeString("Couldn't find subproof of~% ~S~% for ~S");
        $ic465$ = makeSymbol("S#54038", "CYC");
        $ic466$ = makeSymbol("S#12274", "CYC");
        $ic467$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic468$ = constant_handles_oc.f8479((SubLObject)makeString("hypothesizedFormula"));
        $ic469$ = constant_handles_oc.f8479((SubLObject)makeString("hypothesizedFormulaStrengthenedTo"));
        $ic470$ = makeSymbol("S#54040", "CYC");
        $ic471$ = makeSymbol("SKSI-SUPPORTED-EXTERNAL-TERM?");
        $ic472$ = makeSymbol("?HYPOTHESIS");
        $ic473$ = makeSymbol("?ENTITY-MENTION");
        $ic474$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("mentionForMentionHypothesis")), (SubLObject)makeSymbol("?ENTITY-MENTION-HYPOTHESIS"), (SubLObject)makeSymbol("?ENTITY-MENTION"));
        $ic475$ = constant_handles_oc.f8479((SubLObject)makeString("dependsOnEMHyp"));
        $ic476$ = ConsesLow.list((SubLObject)makeSymbol("?ENTITY-MENTION-HYPOTHESIS"));
        $ic477$ = ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)ONE_INTEGER);
        $ic478$ = makeString("Source Text:");
        $ic479$ = makeString("Title:");
        $ic480$ = makeString("Date:");
        $ic481$ = makeString("Author:");
        $ic482$ = makeString("Publisher:");
        $ic483$ = makeString("Couldn't find source document.");
        $ic484$ = makeSymbol("S#54046", "CYC");
        $ic485$ = makeKeyword("REMOVAL-SAFFRON-CONJUNCTION-069");
        $ic486$ = constant_handles_oc.f8479((SubLObject)makeString("substring"));
        $ic487$ = constant_handles_oc.f8479((SubLObject)makeString("situationConstituentWithTypeAndDesc"));
        $ic488$ = constant_handles_oc.f8479((SubLObject)makeString("situationConstituentWithType"));
        $ic489$ = constant_handles_oc.f8479((SubLObject)makeString("situationConstituentWithDesc"));
        $ic490$ = ConsesLow.list((SubLObject)makeSymbol("S#54140", "CYC"), (SubLObject)makeSymbol("S#47811", "CYC"), (SubLObject)makeSymbol("S#751", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#6053", "CYC"));
        $ic491$ = makeString("unknown support type for ~A");
        $ic492$ = makeString("Already shown: ~S");
        $ic493$ = ConsesLow.list((SubLObject)makeKeyword("GENLS"));
        $ic494$ = makeString("Not proof-view worthy: ~S");
        $ic495$ = ConsesLow.list((SubLObject)makeKeyword("SKSI"), (SubLObject)makeKeyword("GIS"));
        $ic496$ = makeKeyword("SKSI");
        $ic497$ = makeKeyword("GIS");
        $ic498$ = makeString("Cycorp-ArcMap-GIS-KS");
        $ic499$ = makeSymbol("?KS");
        $ic500$ = constant_handles_oc.f8479((SubLObject)makeString("contentMt"));
        $ic501$ = constant_handles_oc.f8479((SubLObject)makeString("Saffron-KS"));
        $ic502$ = ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)makeString("situationConstituentWithTypeAndDesc")), constant_handles_oc.f8479((SubLObject)makeString("situationConstituentWithType")), constant_handles_oc.f8479((SubLObject)makeString("situationConstituentWithDesc"))), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#54141", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("BIND"), (SubLObject)makeSymbol("S#12141", "CYC")), (SubLObject)makeKeyword("ANYTHING"));
        $ic503$ = makeSymbol("S#54141", "CYC");
        $ic504$ = makeSymbol("S#12141", "CYC");
        $ic505$ = makeSymbol("?SENTENCE");
        $ic506$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?SENTENCE"), constant_handles_oc.f8479((SubLObject)makeString("NLSentence")));
        $ic507$ = constant_handles_oc.f8479((SubLObject)makeString("sourceOfTerm"));
        $ic508$ = ConsesLow.list((SubLObject)makeSymbol("?SENTENCE"));
        $ic509$ = makeSymbol("S#54061", "CYC");
        $ic510$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic511$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("TextualPCW")));
        $ic512$ = ConsesLow.list((SubLObject)makeSymbol("?DOCUMENT"));
        $ic513$ = makeSymbol("?PUBLISHER");
        $ic514$ = constant_handles_oc.f8479((SubLObject)makeString("publisherOfWork"));
        $ic515$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("ContentMtFn")), constant_handles_oc.f8479((SubLObject)makeString("BBN-KS")));
        $ic516$ = makeSymbol("?DATE");
        $ic517$ = constant_handles_oc.f8479((SubLObject)makeString("dateOfPublication-CW"));
        $ic518$ = ConsesLow.list((SubLObject)makeSymbol("?DATE"));
        $ic519$ = makeSymbol("?AUTHOR");
        $ic520$ = constant_handles_oc.f8479((SubLObject)makeString("authorOfLiteraryWork-CW"));
        $ic521$ = ConsesLow.list((SubLObject)makeSymbol("?AUTHOR"));
        $ic522$ = makeSymbol("?TITLE");
        $ic523$ = constant_handles_oc.f8479((SubLObject)makeString("titleOfWork"));
        $ic524$ = ConsesLow.list((SubLObject)makeSymbol("?TITLE"));
        $ic525$ = makeString("Given:");
        $ic526$ = makeString("Pragmatics:");
        $ic527$ = makeString("Trivially: ");
        $ic528$ = makeSymbol("S#12753", "CYC");
        $ic529$ = makeSymbol("S#31814", "CYC");
        $ic530$ = makeString("/");
        $ic531$ = makeString("Can't find icon image file ~S for ~S");
        $ic532$ = makeSymbol("ADD-TINY-ICON");
        $ic533$ = makeSymbol("REMOVE-TINY-ICON");
        $ic534$ = makeSymbol("S#54079", "CYC");
        $ic535$ = makeSymbol("S#54124", "CYC");
        $ic536$ = makeInteger(500);
        $ic537$ = constant_handles_oc.f8479((SubLObject)makeString("issuerOfCW"));
        $ic538$ = constant_handles_oc.f8479((SubLObject)makeString("tinyIconTermImagePathname"));
        $ic539$ = constant_handles_oc.f8479((SubLObject)makeString("subWorks"));
        $ic540$ = constant_handles_oc.f8479((SubLObject)makeString("editionOfPeriodicalByDate"));
        $ic541$ = constant_handles_oc.f8479((SubLObject)makeString("publisher"));
        $ic542$ = makeString("defaultTinyIconTermImagePathnameForType");
        $ic543$ = makeKeyword("GAF");
        $ic544$ = makeSymbol("S#12278", "CYC");
        $ic545$ = ConsesLow.list((SubLObject)makeSymbol("S#54142", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic546$ = makeSymbol("S#54125", "CYC");
        $ic547$ = ConsesLow.list((SubLObject)makeSymbol("S#156", "CYC"), (SubLObject)makeSymbol("S#54125", "CYC"), (SubLObject)makeSymbol("STRINGP"));
        $ic548$ = makeSymbol("GET-TKB-IMAGE-ROOT");
        $ic549$ = constant_handles_oc.f8479((SubLObject)makeString("salientTermsImageRoot"));
    }
    
    public static final class $sX53712_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $proof;
        public SubLObject $answer;
        public SubLObject $id_index;
        public SubLObject $properties;
        private static final SubLStructDeclNative structDecl;
        
        public $sX53712_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$proof = (SubLObject)CommonSymbols.NIL;
            this.$answer = (SubLObject)CommonSymbols.NIL;
            this.$id_index = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX53712_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$proof;
        }
        
        public SubLObject getField4() {
            return this.$answer;
        }
        
        public SubLObject getField5() {
            return this.$id_index;
        }
        
        public SubLObject getField6() {
            return this.$properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$proof = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$answer = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$id_index = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX53712_native.class, $ic16$, $ic17$, $ic18$, $ic19$, new String[] { "$id", "$proof", "$answer", "$id_index", "$properties" }, $ic20$, $ic21$, $ic22$);
        }
    }
    
    public static final class $f49270$UnaryFunction extends UnaryFunction
    {
        public $f49270$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#53713"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f49270(var8);
        }
    }
    
    public static final class $sX53716_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $parent_id;
        public SubLObject $label;
        public SubLObject $object_type;
        public SubLObject $object;
        public SubLObject $proof_view;
        public SubLObject $properties;
        private static final SubLStructDeclNative structDecl;
        
        public $sX53716_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$parent_id = (SubLObject)CommonSymbols.NIL;
            this.$label = (SubLObject)CommonSymbols.NIL;
            this.$object_type = (SubLObject)CommonSymbols.NIL;
            this.$object = (SubLObject)CommonSymbols.NIL;
            this.$proof_view = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX53716_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$parent_id;
        }
        
        public SubLObject getField4() {
            return this.$label;
        }
        
        public SubLObject getField5() {
            return this.$object_type;
        }
        
        public SubLObject getField6() {
            return this.$object;
        }
        
        public SubLObject getField7() {
            return this.$proof_view;
        }
        
        public SubLObject getField8() {
            return this.$properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$parent_id = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$label = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$object_type = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$object = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$proof_view = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX53716_native.class, $ic117$, $ic118$, $ic119$, $ic120$, new String[] { "$id", "$parent_id", "$label", "$object_type", "$object", "$proof_view", "$properties" }, $ic121$, $ic122$, $ic123$);
        }
    }
    
    public static final class $f49371$UnaryFunction extends UnaryFunction
    {
        public $f49371$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#53717"));
        }
        
        public SubLObject processItem(final SubLObject var8) {
            return f49371(var8);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 3205 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/