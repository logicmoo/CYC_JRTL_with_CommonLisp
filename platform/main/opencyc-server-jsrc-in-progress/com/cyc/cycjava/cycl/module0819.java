package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0819 extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.module0819";
  public static final String myFingerPrint = "90a422b77d11493926daf6655cddf6fd4ffbf00c0d1500bd74b93ecc872547a0";
  public static SubLSymbol $g6493$;
  public static SubLSymbol $g6494$;
  public static SubLSymbol $g6495$;
  public static SubLSymbol $g6496$;
  private static SubLSymbol $g6497$;
  private static SubLSymbol $g6498$;
  private static SubLSymbol $g6499$;
  private static SubLSymbol $g6500$;
  private static SubLSymbol $g6501$;
  private static SubLSymbol $g6502$;
  private static SubLSymbol $g6503$;
  private static SubLSymbol $g6504$;
  private static SubLSymbol $g6505$;
  private static SubLSymbol $g6506$;
  private static SubLSymbol $g6507$;
  private static SubLSymbol $g6508$;
  private static SubLSymbol $g6509$;
  private static SubLSymbol $g6510$;
  private static SubLSymbol $g6511$;
  private static SubLSymbol $g6512$;
  private static SubLSymbol $g6513$;
  private static SubLSymbol $g6514$;
  private static SubLSymbol $g6515$;
  private static SubLSymbol $g6516$;
  private static SubLSymbol $g6517$;
  private static SubLSymbol $g6518$;
  private static SubLSymbol $g6519$;
  private static SubLSymbol $g6520$;
  private static SubLSymbol $g6521$;
  private static SubLSymbol $g6522$;
  private static SubLSymbol $g6523$;
  private static final SubLList $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLList $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLList $ic6$;
  private static final SubLString $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLSymbol $ic9$;
  private static final SubLList $ic10$;
  private static final SubLSymbol $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLList $ic13$;
  private static final SubLList $ic14$;
  private static final SubLList $ic15$;
  private static final SubLSymbol $ic16$;
  private static final SubLString $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLSymbol $ic19$;
  private static final SubLSymbol $ic20$;
  private static final SubLSymbol $ic21$;
  private static final SubLString $ic22$;
  private static final SubLString $ic23$;
  private static final SubLString $ic24$;
  private static final SubLString $ic25$;
  private static final SubLString $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLString $ic28$;
  private static final SubLString $ic29$;
  private static final SubLString $ic30$;
  private static final SubLString $ic31$;
  private static final SubLString $ic32$;
  private static final SubLString $ic33$;
  private static final SubLSymbol $ic34$;
  private static final SubLSymbol $ic35$;
  private static final SubLInteger $ic36$;
  private static final SubLSymbol $ic37$;
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
  private static final SubLSymbol $ic51$;
  private static final SubLString $ic52$;
  private static final SubLList $ic53$;
  private static final SubLString $ic54$;
  private static final SubLString $ic55$;
  private static final SubLString $ic56$;
  private static final SubLString $ic57$;
  private static final SubLString $ic58$;
  private static final SubLString $ic59$;
  private static final SubLString $ic60$;
  private static final SubLString $ic61$;
  private static final SubLString $ic62$;
  private static final SubLString $ic63$;
  private static final SubLList $ic64$;
  private static final SubLString $ic65$;
  private static final SubLList $ic66$;
  private static final SubLString $ic67$;
  private static final SubLList $ic68$;
  private static final SubLString $ic69$;
  private static final SubLString $ic70$;
  private static final SubLString $ic71$;
  private static final SubLSymbol $ic72$;
  private static final SubLString $ic73$;
  private static final SubLList $ic74$;
  private static final SubLString $ic75$;
  private static final SubLString $ic76$;
  private static final SubLSymbol $ic77$;
  private static final SubLString $ic78$;
  private static final SubLString $ic79$;
  private static final SubLString $ic80$;
  private static final SubLString $ic81$;
  private static final SubLString $ic82$;
  private static final SubLSymbol $ic83$;
  private static final SubLList $ic84$;
  private static final SubLString $ic85$;
  private static final SubLSymbol $ic86$;
  private static final SubLString $ic87$;
  private static final SubLString $ic88$;
  private static final SubLString $ic89$;
  private static final SubLString $ic90$;
  private static final SubLString $ic91$;
  private static final SubLList $ic92$;
  private static final SubLSymbol $ic93$;
  private static final SubLString $ic94$;
  private static final SubLString $ic95$;
  private static final SubLString $ic96$;
  private static final SubLSymbol $ic97$;
  private static final SubLSymbol $ic98$;
  private static final SubLList $ic99$;
  private static final SubLSymbol $ic100$;
  private static final SubLString $ic101$;
  private static final SubLString $ic102$;
  private static final SubLString $ic103$;
  private static final SubLString $ic104$;
  private static final SubLString $ic105$;
  private static final SubLString $ic106$;
  private static final SubLString $ic107$;
  private static final SubLList $ic108$;
  private static final SubLSymbol $ic109$;
  private static final SubLString $ic110$;
  private static final SubLSymbol $ic111$;
  private static final SubLSymbol $ic112$;
  private static final SubLSymbol $ic113$;
  private static final SubLSymbol $ic114$;
  private static final SubLSymbol $ic115$;
  private static final SubLString $ic116$;
  private static final SubLList $ic117$;
  private static final SubLSymbol $ic118$;
  private static final SubLString $ic119$;
  private static final SubLString $ic120$;
  private static final SubLString $ic121$;
  private static final SubLList $ic122$;
  private static final SubLString $ic123$;
  private static final SubLSymbol $ic124$;
  private static final SubLList $ic125$;
  private static final SubLSymbol $ic126$;
  private static final SubLString $ic127$;
  private static final SubLSymbol $ic128$;
  private static final SubLSymbol $ic129$;
  private static final SubLString $ic130$;
  private static final SubLString $ic131$;
  private static final SubLString $ic132$;
  private static final SubLList $ic133$;
  private static final SubLString $ic134$;
  private static final SubLSymbol $ic135$;
  private static final SubLList $ic136$;
  private static final SubLSymbol $ic137$;
  private static final SubLString $ic138$;
  private static final SubLString $ic139$;
  private static final SubLList $ic140$;
  private static final SubLSymbol $ic141$;
  private static final SubLSymbol $ic142$;
  private static final SubLString $ic143$;
  private static final SubLString $ic144$;
  private static final SubLString $ic145$;
  private static final SubLList $ic146$;
  private static final SubLString $ic147$;
  private static final SubLList $ic148$;
  private static final SubLSymbol $ic149$;
  private static final SubLSymbol $ic150$;
  private static final SubLSymbol $ic151$;
  private static final SubLList $ic152$;
  private static final SubLSymbol $ic153$;
  private static final SubLSymbol $ic154$;
  private static final SubLSymbol $ic155$;
  private static final SubLSymbol $ic156$;
  private static final SubLString $ic157$;
  private static final SubLString $ic158$;
  private static final SubLString $ic159$;
  private static final SubLString $ic160$;
  private static final SubLSymbol $ic161$;
  private static final SubLList $ic162$;
  private static final SubLSymbol $ic163$;
  private static final SubLSymbol $ic164$;
  private static final SubLString $ic165$;
  private static final SubLString $ic166$;
  private static final SubLSymbol $ic167$;
  private static final SubLSymbol $ic168$;
  private static final SubLList $ic169$;
  private static final SubLSymbol $ic170$;
  private static final SubLSymbol $ic171$;
  private static final SubLList $ic172$;
  private static final SubLSymbol $ic173$;
  private static final SubLSymbol $ic174$;
  private static final SubLSymbol $ic175$;
  private static final SubLList $ic176$;
  private static final SubLSymbol $ic177$;
  private static final SubLSymbol $ic178$;
  private static final SubLSymbol $ic179$;
  private static final SubLList $ic180$;
  private static final SubLSymbol $ic181$;
  private static final SubLList $ic182$;
  private static final SubLSymbol $ic183$;
  private static final SubLSymbol $ic184$;
  private static final SubLSymbol $ic185$;
  private static final SubLSymbol $ic186$;
  private static final SubLSymbol $ic187$;
  private static final SubLString $ic188$;
  private static final SubLSymbol $ic189$;
  private static final SubLList $ic190$;
  private static final SubLSymbol $ic191$;
  private static final SubLSymbol $ic192$;
  private static final SubLSymbol $ic193$;
  private static final SubLList $ic194$;
  private static final SubLSymbol $ic195$;
  private static final SubLSymbol $ic196$;
  private static final SubLList $ic197$;
  private static final SubLSymbol $ic198$;
  private static final SubLSymbol $ic199$;
  private static final SubLSymbol $ic200$;
  private static final SubLString $ic201$;
  private static final SubLString $ic202$;
  private static final SubLSymbol $ic203$;
  private static final SubLSymbol $ic204$;
  private static final SubLList $ic205$;
  private static final SubLSymbol $ic206$;
  private static final SubLList $ic207$;
  private static final SubLList $ic208$;
  private static final SubLList $ic209$;
  private static final SubLList $ic210$;
  private static final SubLSymbol $ic211$;
  private static final SubLString $ic212$;
  private static final SubLSymbol $ic213$;
  private static final SubLList $ic214$;
  private static final SubLString $ic215$;
  private static final SubLString $ic216$;
  private static final SubLString $ic217$;
  private static final SubLList $ic218$;
  private static final SubLList $ic219$;
  private static final SubLString $ic220$;
  private static final SubLSymbol $ic221$;
  private static final SubLString $ic222$;
  private static final SubLList $ic223$;
  private static final SubLSymbol $ic224$;
  private static final SubLString $ic225$;
  private static final SubLString $ic226$;
  private static final SubLSymbol $ic227$;
  private static final SubLString $ic228$;
  private static final SubLString $ic229$;
  private static final SubLString $ic230$;
  private static final SubLString $ic231$;
  private static final SubLString $ic232$;
  private static final SubLString $ic233$;
  private static final SubLSymbol $ic234$;
  private static final SubLSymbol $ic235$;
  private static final SubLSymbol $ic236$;
  private static final SubLList $ic237$;
  private static final SubLSymbol $ic238$;
  private static final SubLSymbol $ic239$;
  private static final SubLSymbol $ic240$;
  private static final SubLString $ic241$;
  private static final SubLString $ic242$;
  private static final SubLString $ic243$;
  private static final SubLString $ic244$;
  private static final SubLString $ic245$;
  private static final SubLString $ic246$;
  private static final SubLString $ic247$;
  private static final SubLString $ic248$;
  private static final SubLSymbol $ic249$;
  private static final SubLString $ic250$;
  private static final SubLString $ic251$;
  private static final SubLSymbol $ic252$;
  private static final SubLSymbol $ic253$;
  private static final SubLSymbol $ic254$;
  private static final SubLSymbol $ic255$;
  private static final SubLSymbol $ic256$;
  private static final SubLSymbol $ic257$;
  private static final SubLSymbol $ic258$;
  private static final SubLSymbol $ic259$;
  private static final SubLSymbol $ic260$;
  private static final SubLList $ic261$;
  private static final SubLString $ic262$;
  private static final SubLSymbol $ic263$;
  private static final SubLList $ic264$;
  private static final SubLSymbol $ic265$;
  private static final SubLSymbol $ic266$;
  private static final SubLList $ic267$;
  private static final SubLSymbol $ic268$;
  private static final SubLInteger $ic269$;
  private static final SubLString $ic270$;
  private static final SubLList $ic271$;
  private static final SubLSymbol $ic272$;
  private static final SubLSymbol $ic273$;
  private static final SubLList $ic274$;
  private static final SubLList $ic275$;
  private static final SubLList $ic276$;
  private static final SubLList $ic277$;
  private static final SubLSymbol $ic278$;
  private static final SubLString $ic279$;
  private static final SubLSymbol $ic280$;
  private static final SubLSymbol $ic281$;
  private static final SubLList $ic282$;
  private static final SubLString $ic283$;
  private static final SubLString $ic284$;
  private static final SubLList $ic285$;
  private static final SubLSymbol $ic286$;
  private static final SubLList $ic287$;
  private static final SubLList $ic288$;
  private static final SubLList $ic289$;
  private static final SubLString $ic290$;
  private static final SubLString $ic291$;
  private static final SubLList $ic292$;
  private static final SubLString $ic293$;
  private static final SubLString $ic294$;
  private static final SubLList $ic295$;
  private static final SubLSymbol $ic296$;
  private static final SubLString $ic297$;
  private static final SubLString $ic298$;
  private static final SubLList $ic299$;
  private static final SubLList $ic300$;
  private static final SubLList $ic301$;
  private static final SubLSymbol $ic302$;
  private static final SubLString $ic303$;
  private static final SubLString $ic304$;
  private static final SubLString $ic305$;
  private static final SubLString $ic306$;
  private static final SubLList $ic307$;
  private static final SubLString $ic308$;
  private static final SubLList $ic309$;
  private static final SubLSymbol $ic310$;
  private static final SubLString $ic311$;
  private static final SubLList $ic312$;
  private static final SubLSymbol $ic313$;
  private static final SubLSymbol $ic314$;
  private static final SubLSymbol $ic315$;
  private static final SubLSymbol $ic316$;
  private static final SubLList $ic317$;
  private static final SubLSymbol $ic318$;
  private static final SubLSymbol $ic319$;
  private static final SubLSymbol $ic320$;
  private static final SubLList $ic321$;
  private static final SubLSymbol $ic322$;
  private static final SubLString $ic323$;
  private static final SubLList $ic324$;
  private static final SubLSymbol $ic325$;
  private static final SubLString $ic326$;
  private static final SubLList $ic327$;
  private static final SubLString $ic328$;
  private static final SubLList $ic329$;
  private static final SubLList $ic330$;
  private static final SubLInteger $ic331$;
  private static final SubLString $ic332$;
  private static final SubLString $ic333$;
  private static final SubLString $ic334$;
  private static final SubLString $ic335$;
  private static final SubLInteger $ic336$;
  private static final SubLString $ic337$;
  private static final SubLString $ic338$;
  private static final SubLString $ic339$;
  private static final SubLString $ic340$;
  private static final SubLString $ic341$;
  private static final SubLString $ic342$;
  private static final SubLString $ic343$;
  private static final SubLList $ic344$;
  private static final SubLString $ic345$;
  private static final SubLList $ic346$;
  private static final SubLList $ic347$;
  private static final SubLString $ic348$;
  private static final SubLList $ic349$;
  private static final SubLString $ic350$;
  private static final SubLString $ic351$;
  private static final SubLString $ic352$;
  private static final SubLString $ic353$;
  private static final SubLString $ic354$;
  private static final SubLInteger $ic355$;
  private static final SubLString $ic356$;
  private static final SubLString $ic357$;
  private static final SubLList $ic358$;
  private static final SubLSymbol $ic359$;
  private static final SubLSymbol $ic360$;
  private static final SubLSymbol $ic361$;
  private static final SubLSymbol $ic362$;
  private static final SubLSymbol $ic363$;
  private static final SubLSymbol $ic364$;
  private static final SubLSymbol $ic365$;
  private static final SubLString $ic366$;
  private static final SubLInteger $ic367$;
  private static final SubLList $ic368$;
  private static final SubLList $ic369$;
  private static final SubLSymbol $ic370$;
  private static final SubLSymbol $ic371$;
  private static final SubLList $ic372$;
  private static final SubLSymbol $ic373$;
  private static final SubLSymbol $ic374$;
  private static final SubLSymbol $ic375$;
  private static final SubLString $ic376$;
  private static final SubLSymbol $ic377$;
  private static final SubLString $ic378$;
  private static final SubLSymbol $ic379$;
  private static final SubLString $ic380$;
  private static final SubLSymbol $ic381$;
  private static final SubLSymbol $ic382$;
  private static final SubLString $ic383$;
  private static final SubLString $ic384$;
  private static final SubLSymbol $ic385$;
  private static final SubLString $ic386$;
  private static final SubLString $ic387$;
  private static final SubLSymbol $ic388$;
  private static final SubLList $ic389$;
  private static final SubLSymbol $ic390$;
  private static final SubLSymbol $ic391$;
  private static final SubLSymbol $ic392$;
  private static final SubLSymbol $ic393$;
  private static final SubLList $ic394$;
  private static final SubLString $ic395$;
  private static final SubLList $ic396$;
  private static final SubLSymbol $ic397$;
  private static final SubLString $ic398$;
  private static final SubLString $ic399$;
  private static final SubLList $ic400$;
  private static final SubLSymbol $ic401$;
  private static final SubLString $ic402$;
  private static final SubLString $ic403$;
  private static final SubLString $ic404$;
  private static final SubLString $ic405$;
  private static final SubLString $ic406$;
  private static final SubLList $ic407$;
  private static final SubLSymbol $ic408$;
  private static final SubLString $ic409$;
  private static final SubLList $ic410$;
  private static final SubLList $ic411$;
  private static final SubLList $ic412$;
  private static final SubLSymbol $ic413$;
  private static final SubLSymbol $ic414$;
  private static final SubLList $ic415$;
  private static final SubLList $ic416$;
  private static final SubLSymbol $ic417$;
  private static final SubLList $ic418$;
  private static final SubLSymbol $ic419$;
  private static final SubLList $ic420$;
  private static final SubLSymbol $ic421$;
  private static final SubLList $ic422$;
  private static final SubLSymbol $ic423$;
  private static final SubLString $ic424$;
  private static final SubLString $ic425$;
  private static final SubLString $ic426$;
  private static final SubLString $ic427$;
  private static final SubLList $ic428$;
  private static final SubLString $ic429$;
  private static final SubLList $ic430$;
  private static final SubLList $ic431$;
  private static final SubLString $ic432$;
  private static final SubLList $ic433$;
  private static final SubLString $ic434$;
  private static final SubLList $ic435$;
  private static final SubLString $ic436$;
  private static final SubLList $ic437$;
  private static final SubLString $ic438$;
  private static final SubLList $ic439$;
  private static final SubLList $ic440$;
  private static final SubLList $ic441$;
  private static final SubLSymbol $ic442$;
  private static final SubLList $ic443$;
  private static final SubLList $ic444$;
  private static final SubLList $ic445$;
  private static final SubLSymbol $ic446$;
  private static final SubLString $ic447$;
  private static final SubLList $ic448$;
  private static final SubLSymbol $ic449$;
  private static final SubLString $ic450$;
  private static final SubLList $ic451$;
  private static final SubLSymbol $ic452$;
  private static final SubLList $ic453$;
  private static final SubLList $ic454$;
  private static final SubLString $ic455$;
  private static final SubLString $ic456$;
  private static final SubLList $ic457$;
  private static final SubLList $ic458$;
  private static final SubLSymbol $ic459$;
  private static final SubLList $ic460$;
  private static final SubLList $ic461$;
  private static final SubLList $ic462$;
  private static final SubLList $ic463$;
  private static final SubLList $ic464$;
  private static final SubLList $ic465$;
  private static final SubLList $ic466$;
  private static final SubLList $ic467$;
  private static final SubLList $ic468$;
  private static final SubLList $ic469$;
  private static final SubLList $ic470$;
  private static final SubLList $ic471$;
  private static final SubLList $ic472$;
  private static final SubLList $ic473$;
  private static final SubLList $ic474$;
  private static final SubLList $ic475$;
  private static final SubLList $ic476$;
  private static final SubLString $ic477$;
  private static final SubLList $ic478$;
  private static final SubLString $ic479$;
  private static final SubLList $ic480$;
  private static final SubLSymbol $ic481$;
  private static final SubLSymbol $ic482$;
  private static final SubLList $ic483$;
  private static final SubLString $ic484$;
  private static final SubLSymbol $ic485$;
  private static final SubLList $ic486$;
  private static final SubLSymbol $ic487$;
  private static final SubLString $ic488$;
  private static final SubLList $ic489$;
  private static final SubLString $ic490$;
  private static final SubLString $ic491$;
  private static final SubLList $ic492$;
  private static final SubLString $ic493$;
  private static final SubLList $ic494$;
  private static final SubLString $ic495$;
  private static final SubLSymbol $ic496$;
  private static final SubLString $ic497$;
  private static final SubLSymbol $ic498$;
  private static final SubLSymbol $ic499$;
  private static final SubLString $ic500$;
  private static final SubLSymbol $ic501$;
  private static final SubLString $ic502$;
  private static final SubLList $ic503$;
  private static final SubLString $ic504$;
  private static final SubLSymbol $ic505$;
  private static final SubLString $ic506$;
  private static final SubLSymbol $ic507$;
  private static final SubLString $ic508$;
  private static final SubLList $ic509$;
  private static final SubLString $ic510$;
  private static final SubLString $ic511$;
  private static final SubLSymbol $ic512$;
  private static final SubLString $ic513$;
  private static final SubLString $ic514$;
  private static final SubLString $ic515$;
  private static final SubLString $ic516$;
  private static final SubLString $ic517$;
  private static final SubLString $ic518$;
  private static final SubLString $ic519$;
  private static final SubLString $ic520$;
  private static final SubLString $ic521$;
  private static final SubLString $ic522$;
  private static final SubLString $ic523$;
  private static final SubLString $ic524$;
  private static final SubLList $ic525$;
  private static final SubLSymbol $ic526$;
  private static final SubLSymbol $ic527$;
  private static final SubLString $ic528$;
  private static final SubLString $ic529$;
  private static final SubLString $ic530$;
  private static final SubLList $ic531$;
  private static final SubLSymbol $ic532$;
  private static final SubLList $ic533$;
  private static final SubLSymbol $ic534$;
  private static final SubLSymbol $ic535$;
  private static final SubLList $ic536$;
  private static final SubLSymbol $ic537$;
  private static final SubLString $ic538$;
  private static final SubLList $ic539$;
  private static final SubLSymbol $ic540$;
  private static final SubLString $ic541$;
  private static final SubLList $ic542$;
  private static final SubLSymbol $ic543$;
  private static final SubLString $ic544$;
  private static final SubLList $ic545$;
  private static final SubLSymbol $ic546$;
  private static final SubLString $ic547$;

  public static SubLObject f52421()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return (SubLObject) makeBoolean( $ic1$ != $g6494$.getDynamicValue( var1 ) );
  }

  public static SubLObject f52422(final SubLObject var2, final SubLObject var3)
  {
    SubLObject var5;
    final SubLObject var4 = var5 = var2.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic2$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic2$ );
    var7 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var8;
      var5 = ( var8 = var6 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic4$, (SubLObject) ConsesLow.listS( (SubLObject) $ic5$, var7,
          (SubLObject) $ic6$ ), (SubLObject) $ic7$, var7, (SubLObject) $ic6$ ), (SubLObject) ConsesLow.listS( (SubLObject) $ic8$, (SubLObject) ConsesLow.list(
              (SubLObject) ConsesLow.list( (SubLObject) $ic9$, var7 ) ), ConsesLow.append( var8, (SubLObject) NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic2$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52423(final SubLObject var2, final SubLObject var3)
  {
    SubLObject var5;
    final SubLObject var4 = var5 = var2.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic10$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic10$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic10$ );
    var8 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var9;
      var5 = ( var9 = var6 );
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic8$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic11$, (SubLObject) ConsesLow.listS(
          (SubLObject) $ic12$, var7, var8, (SubLObject) $ic13$ ) ) ), ConsesLow.append( var9, (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic10$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52424()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return module0035.sublisp_boolean( $g6495$.getDynamicValue( var1 ) );
  }

  public static SubLObject f52425()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return $g6495$.getDynamicValue( var1 );
  }

  public static SubLObject f52426(final SubLObject var14)
  {
    SubLObject var15 = $g6496$.getGlobalValue();
    SubLObject var16 = (SubLObject) NIL;
    var16 = var15.first();
    while ( NIL != var15)
    {
      SubLObject var18;
      final SubLObject var17 = var18 = var16;
      SubLObject var19 = (SubLObject) NIL;
      SubLObject var20 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var18, var17, (SubLObject) $ic15$ );
      var19 = var18.first();
      var18 = var18.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var18, var17, (SubLObject) $ic15$ );
      var20 = var18.first();
      var18 = var18.rest();
      if( NIL == var18 )
      {
        final SubLObject var21 = var19;
        if( var21.eql( (SubLObject) $ic16$ ) )
        {
          final SubLObject var22 = Symbols.symbol_name( var14 );
          if( NIL != module0038.f2673( var22, var20, (SubLObject) UNPROVIDED ) )
          {
            return (SubLObject) T;
          }
        }
        else
        {
          Errors.error( (SubLObject) $ic17$, var19 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var17, (SubLObject) $ic15$ );
      }
      var15 = var15.rest();
      var16 = var15.first();
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52427(final SubLObject var14)
  {
    final SubLThread var15 = SubLProcess.currentSubLThread();
    if( NIL != f52421() && !var14.isMacroOperator() )
    {
      final SubLObject var16 = Symbols.get( var14, (SubLObject) $ic18$, (SubLObject) UNPROVIDED );
      if( $ic19$ == var16 && NIL == f52426( var14 ) )
      {
        if( $ic20$ == $g6494$.getDynamicValue( var15 ) )
        {
          return (SubLObject) T;
        }
        if( NIL != module0012.f390( var14 ) )
        {
          return (SubLObject) T;
        }
        if( $ic21$ == $g6494$.getDynamicValue( var15 ) )
        {
          return module0002.f40( var14 );
        }
        return (SubLObject) NIL;
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52428(final SubLObject var24)
  {
    PrintLow.format( var24, (SubLObject) $ic22$ );
    PrintLow.format( var24, (SubLObject) $ic23$ );
    return streams_high.terpri( var24 );
  }

  public static SubLObject f52429(final SubLObject var24, final SubLObject var25)
  {
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    PrintLow.format( var24, (SubLObject) $ic24$ );
    return var24;
  }

  public static SubLObject f52431(final SubLObject var24, final SubLObject var25, final SubLObject var22, final SubLObject var26)
  {
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic25$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    if( NIL != var26 )
    {
      streams_high.write_string( (SubLObject) $ic26$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      SubLObject var27 = Sequences.length( var26 );
      if( NIL != module0004.f104( (SubLObject) $ic27$, var26, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var27 = Numbers.subtract( var27, (SubLObject) ONE_INTEGER );
      }
      SubLObject var28;
      for( var28 = (SubLObject) NIL, var28 = (SubLObject) ZERO_INTEGER; var28.numL( var27 ); var28 = Numbers.add( var28, (SubLObject) ONE_INTEGER ) )
      {
        streams_high.write_string( (SubLObject) $ic28$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
    }
    streams_high.write_string( (SubLObject) $ic29$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( print_high.prin1_to_string( Symbols.symbol_name( var22 ) ), var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var29 = var26;
    SubLObject var30 = (SubLObject) NIL;
    var30 = var29.first();
    while ( NIL != var29)
    {
      if( $ic27$ != var30 )
      {
        streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( module0816.f52316( var30 ), var24, (SubLObject) UNPROVIDED );
      }
      var29 = var29.rest();
      var30 = var29.first();
    }
    streams_high.write_string( (SubLObject) $ic31$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return var24;
  }

  public static SubLObject f52433(final SubLObject var24, final SubLObject var25, final SubLObject var30)
  {
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic32$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( print_high.prin1_to_string( Symbols.symbol_name( f52425() ) ), var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( var30, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( (SubLObject) $ic33$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return var24;
  }

  public static SubLObject f52434(final SubLObject var24)
  {
    if( NIL != f52421() )
    {
      return f52428( var24 );
    }
    return var24;
  }

  public static SubLObject f52435(final SubLObject var24, final SubLObject var25)
  {
    if( NIL != f52421() )
    {
      f52429( var24, var25 );
    }
    return var24;
  }

  public static SubLObject f52436(final SubLObject var31, final SubLObject var32, SubLObject var33)
  {
    if( var33 == UNPROVIDED )
    {
      var33 = (SubLObject) NIL;
    }
    final SubLThread var34 = SubLProcess.currentSubLThread();
    assert NIL != module0812.f51933( var31 ) : var31;
    assert NIL != Types.stringp( var32 ) : var32;
    if( NIL != var33 && !areAssertionsDisabledFor( me ) && NIL == Types.stringp( var33 ) )
    {
      throw new AssertionError( var33 );
    }
    SubLObject var35 = (SubLObject) NIL;
    module0075.ensure_directories_exist( var32 );
    final SubLObject var36 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var34 );
    final SubLObject var37 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var34 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic36$, var34 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var34 ), var34 );
      SubLObject var38 = (SubLObject) NIL;
      try
      {
        final SubLObject var35_39 = stream_macros.$stream_requires_locking$.currentBinding( var34 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var34 );
          var38 = compatibility.open_text( var32, (SubLObject) $ic37$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var35_39, var34 );
        }
        if( !var38.isStream() )
        {
          Errors.error( (SubLObject) $ic38$, var32 );
        }
        final SubLObject var24_40 = var38;
        var35 = f52437( var31, var24_40, var33 );
      }
      finally
      {
        final SubLObject var35_40 = Threads.$is_thread_performing_cleanupP$.currentBinding( var34 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var34 );
          if( var38.isStream() )
          {
            streams_high.close( var38, (SubLObject) UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var35_40, var34 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var37, var34 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var36, var34 );
    }
    return var35;
  }

  public static SubLObject f52437(final SubLObject var31, SubLObject var24, SubLObject var33)
  {
    if( var24 == UNPROVIDED )
    {
      var24 = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( var33 == UNPROVIDED )
    {
      var33 = (SubLObject) NIL;
    }
    final SubLThread var34 = SubLProcess.currentSubLThread();
    assert NIL != module0812.f51933( var31 ) : var31;
    final SubLObject var35 = reader.$read_default_float_format$.currentBinding( var34 );
    final SubLObject var36 = module0816.$g6470$.currentBinding( var34 );
    final SubLObject var37 = $g6499$.currentBinding( var34 );
    final SubLObject var38 = $g6498$.currentBinding( var34 );
    final SubLObject var39 = module0812.$g6445$.currentBinding( var34 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) $ic39$, var34 );
      module0816.$g6470$.bind( (SubLObject) ZERO_INTEGER, var34 );
      $g6499$.bind( (SubLObject) NIL, var34 );
      $g6498$.bind( (SubLObject) NIL, var34 );
      module0812.$g6445$.bind( var31, var34 );
      final SubLObject var41;
      final SubLObject var40 = var41 = module0034.f1854( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      final SubLObject var35_47 = module0034.$g879$.currentBinding( var34 );
      try
      {
        module0034.$g879$.bind( var41, var34 );
        SubLObject var42 = (SubLObject) NIL;
        if( NIL != var41 && NIL == module0034.f1842( var41 ) )
        {
          var42 = module0034.f1869( var41 );
          final SubLObject var43 = Threads.current_process();
          if( NIL == var42 )
          {
            module0034.f1873( var41, var43 );
          }
          else if( !var42.eql( var43 ) )
          {
            Errors.error( (SubLObject) $ic40$ );
          }
        }
        try
        {
          f52438( var31, var24 );
        }
        finally
        {
          final SubLObject var35_48 = Threads.$is_thread_performing_cleanupP$.currentBinding( var34 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var34 );
            f52439( var31, var24, (SubLObject) ZERO_INTEGER, var33 );
            if( NIL != var41 && NIL == var42 )
            {
              module0034.f1873( var41, (SubLObject) NIL );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var35_48, var34 );
          }
        }
      }
      finally
      {
        module0034.$g879$.rebind( var35_47, var34 );
      }
    }
    finally
    {
      module0812.$g6445$.rebind( var39, var34 );
      $g6498$.rebind( var38, var34 );
      $g6499$.rebind( var37, var34 );
      module0816.$g6470$.rebind( var36, var34 );
      reader.$read_default_float_format$.rebind( var35, var34 );
    }
    return var31;
  }

  public static SubLObject f52438(final SubLObject var31, final SubLObject var24)
  {
    f52440( var24 );
    f52441( var31, var24 );
    f52442( var31, var24 );
    f52443( var31, var24 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52440(final SubLObject var24)
  {
    PrintLow.format( var24, (SubLObject) $ic41$ );
    PrintLow.format( var24, (SubLObject) $ic42$, module0816.f52237() );
    PrintLow.format( var24, (SubLObject) $ic43$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52441(final SubLObject var31, final SubLObject var24)
  {
    final SubLObject var32 = module0812.f51970( var31 );
    final SubLObject var33 = f52444( var32 );
    PrintLow.format( var24, (SubLObject) $ic44$, var33 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52444(final SubLObject var51)
  {
    final SubLObject var52 = f52445();
    final SubLObject var53 = f52446( var51 );
    return Sequences.cconcatenate( module0006.f203( var52 ), module0006.f203( var53 ) );
  }

  public static SubLObject f52445()
  {
    final SubLObject var55 = f52447();
    if( var55.equal( (SubLObject) $ic45$ ) )
    {
      return (SubLObject) $ic46$;
    }
    if( $ic47$.equal( var55 ) )
    {
      return (SubLObject) $ic48$;
    }
    return Errors.error( (SubLObject) $ic49$ );
  }

  public static SubLObject f52446(final SubLObject var51)
  {
    final SubLObject var52 = f52448( var51 );
    SubLObject var53 = (SubLObject) NIL;
    SubLObject var54 = var52;
    SubLObject var55 = (SubLObject) NIL;
    var55 = var54.first();
    while ( NIL != var54)
    {
      final SubLObject var56 = f52449( var55 );
      var53 = (SubLObject) ConsesLow.cons( (SubLObject) $ic50$, var53 );
      var53 = (SubLObject) ConsesLow.cons( var56, var53 );
      var54 = var54.rest();
      var55 = var54.first();
    }
    return Functions.apply( Symbols.symbol_function( (SubLObject) $ic51$ ), Sequences.nreverse( var53 ) );
  }

  public static SubLObject f52449(final SubLObject var58)
  {
    SubLObject var59 = f52450( var58 );
    if( NIL != module0818.f52382( var59 ) )
    {
      var59 = Sequences.cconcatenate( (SubLObject) $ic52$, module0006.f203( var59 ) );
    }
    return var59;
  }

  public static SubLObject f52450(final SubLObject var22)
  {
    return Sequences.nsubstitute( (SubLObject) Characters.CHAR_underbar, (SubLObject) Characters.CHAR_hyphen, Strings.string_downcase( var22, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ),
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52451(final SubLObject var22)
  {
    return Sequences.nsubstitute( (SubLObject) Characters.CHAR_hyphen, (SubLObject) Characters.CHAR_underbar, Strings.string_upcase( var22, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ),
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52448(final SubLObject var51)
  {
    assert NIL != Types.stringp( var51 ) : var51;
    final SubLObject var52 = f52452();
    final SubLObject var53 = module0038.f2752( module0813.f52084( module0813.f52032(), var51 ), (SubLObject) $ic53$ );
    final SubLObject var54 = Sequences.position( var52, var53, Symbols.symbol_function( (SubLObject) EQUAL ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
        (SubLObject) UNPROVIDED );
    final SubLObject var55 = conses_high.nthcdr( var54, var53 );
    final SubLObject var56 = conses_high.butlast( var55, (SubLObject) ONE_INTEGER );
    return var56;
  }

  public static SubLObject f52452()
  {
    return f52450( f52447() );
  }

  public static SubLObject f52447()
  {
    final SubLObject var65 = module0813.f52032();
    if( NIL != var65 )
    {
      return module0813.f52071( var65 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52442(final SubLObject var31, final SubLObject var24)
  {
    streams_high.terpri( var24 );
    PrintLow.format( var24, (SubLObject) $ic54$ );
    PrintLow.format( var24, (SubLObject) $ic55$ );
    PrintLow.format( var24, (SubLObject) $ic56$ );
    f52434( var24 );
    PrintLow.format( var24, (SubLObject) $ic57$ );
    PrintLow.format( var24, (SubLObject) $ic58$ );
    PrintLow.format( var24, (SubLObject) $ic59$ );
    PrintLow.format( var24, (SubLObject) $ic60$ );
    PrintLow.format( var24, (SubLObject) $ic61$ );
    PrintLow.format( var24, (SubLObject) $ic62$ );
    SubLObject var32 = (SubLObject) $ic64$;
    SubLObject var33 = (SubLObject) NIL;
    var33 = var32.first();
    while ( NIL != var32)
    {
      PrintLow.format( var24, (SubLObject) $ic63$, var33 );
      var32 = var32.rest();
      var33 = var32.first();
    }
    var32 = (SubLObject) $ic66$;
    var33 = (SubLObject) NIL;
    var33 = var32.first();
    while ( NIL != var32)
    {
      PrintLow.format( var24, (SubLObject) $ic65$, var33 );
      var32 = var32.rest();
      var33 = var32.first();
    }
    var32 = (SubLObject) $ic68$;
    var33 = (SubLObject) NIL;
    var33 = var32.first();
    while ( NIL != var32)
    {
      PrintLow.format( var24, (SubLObject) $ic67$, var33 );
      var32 = var32.rest();
      var33 = var32.first();
    }
    if( !$ic45$.equal( f52447() ) )
    {
      final SubLObject var34 = module0812.f51970( var31 );
      SubLObject var35 = module0809.f51607( var34 );
      final SubLObject var36 = (SubLObject) $ic69$;
      if( NIL == conses_high.member( var36, var35, Symbols.symbol_function( (SubLObject) EQUAL ), Symbols.symbol_function( (SubLObject) IDENTITY ) ) )
      {
        var35 = (SubLObject) ConsesLow.cons( var36, var35 );
      }
      if( NIL != var35 )
      {
        var35 = module0809.f51694( var35 );
        PrintLow.format( var24, (SubLObject) $ic70$ );
        SubLObject var37 = var35;
        SubLObject var38 = (SubLObject) NIL;
        var38 = var37.first();
        while ( NIL != var37)
        {
          if( !var38.equal( var34 ) )
          {
            final SubLObject var39 = f52453( var38 );
            PrintLow.format( var24, (SubLObject) $ic71$, var39 );
          }
          var37 = var37.rest();
          var38 = var37.first();
        }
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52453(final SubLObject var51)
  {
    final SubLObject var52 = f52444( var51 );
    final SubLObject var53 = f52454( var51 );
    return Sequences.cconcatenate( module0006.f203( var52 ), new SubLObject[] { $ic50$, module0006.f203( var53 )
    } );
  }

  public static SubLObject f52443(final SubLObject var31, final SubLObject var24)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    PrintLow.format( var24, (SubLObject) $ic73$ );
    PrintLow.format( var24, (SubLObject) $ic42$, module0816.f52237() );
    if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic74$ ) )
    {
      final SubLObject var33 = module0812.f51970( var31 );
      PrintLow.format( var24, (SubLObject) $ic75$, var33 );
    }
    if( !$ic45$.equal( f52447() ) )
    {
      if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic74$ ) )
      {
        final SubLObject var34 = module0812.f51971( var31 );
        PrintLow.format( var24, (SubLObject) $ic76$, var34 );
      }
      if( NIL == $g6500$.getGlobalValue() && !$ic77$.equal( module0813.f52035() ) )
      {
        var32.resetMultipleValues();
        final SubLObject var35 = Time.get_decoded_time();
        final SubLObject var36 = var32.secondMultipleValue();
        final SubLObject var37 = var32.thirdMultipleValue();
        final SubLObject var38 = var32.fourthMultipleValue();
        final SubLObject var39 = var32.fifthMultipleValue();
        final SubLObject var40 = var32.sixthMultipleValue();
        var32.resetMultipleValues();
        PrintLow.format( var24, (SubLObject) $ic78$, new SubLObject[] { var40, var39, var38, var37, var36, var35
        } );
      }
    }
    PrintLow.format( var24, (SubLObject) $ic43$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52455()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return $g6501$.getDynamicValue( var1 );
  }

  public static SubLObject f52439(final SubLObject var31, final SubLObject var24, final SubLObject var25, SubLObject var33)
  {
    if( var33 == UNPROVIDED )
    {
      var33 = (SubLObject) NIL;
    }
    final SubLThread var34 = SubLProcess.currentSubLThread();
    final SubLObject var35 = module0812.f51970( var31 );
    final SubLObject var36 = f52454( var35 );
    final SubLObject var37 = f52453( var35 );
    streams_high.terpri( var24 );
    streams_high.write_string( (SubLObject) $ic79$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( var36, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( (SubLObject) $ic80$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( (SubLObject) $ic81$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    final SubLObject var38 = $g6501$.currentBinding( var34 );
    try
    {
      $g6501$.bind( var36, var34 );
      f52456( var36, var37, var24, module0048.f_1X( var25 ), var33 );
      f52457( var31, var24, module0048.f_1X( var25 ) );
      f52458( var31, var24, module0048.f_1X( var25 ) );
      streams_high.terpri( var24 );
      streams_high.terpri( var24 );
    }
    finally
    {
      $g6501$.rebind( var38, var34 );
    }
    streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    return var31;
  }

  public static SubLObject f52459(final SubLObject var51)
  {
    if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic84$ ) )
    {
      final SubLObject var52 = module0813.f52032();
      final SubLObject var53 = module0813.f52095( var52, var51 );
      return PrintLow.format( (SubLObject) NIL, (SubLObject) $ic85$, var53 );
    }
    return f52460( var51 );
  }

  public static SubLObject f52454(final SubLObject var51)
  {
    final SubLThread var52 = SubLProcess.currentSubLThread();
    final SubLObject var53 = module0034.$g879$.getDynamicValue( var52 );
    SubLObject var54 = (SubLObject) NIL;
    if( NIL == var53 )
    {
      return f52459( var51 );
    }
    var54 = module0034.f1857( var53, (SubLObject) $ic83$, (SubLObject) UNPROVIDED );
    if( NIL == var54 )
    {
      var54 = module0034.f1807( module0034.f1842( var53 ), (SubLObject) $ic83$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQUAL,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var53, (SubLObject) $ic83$, var54 );
    }
    SubLObject var55 = module0034.f1814( var54, var51, (SubLObject) $ic86$ );
    if( var55 == $ic86$ )
    {
      var55 = Values.arg2( var52.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52459( var51 ) ) );
      module0034.f1816( var54, var51, var55, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var55 );
  }

  public static SubLObject f52461(final SubLObject var55)
  {
    return f52460( var55 );
  }

  public static SubLObject f52460(final SubLObject var85)
  {
    return Sequences.nsubstitute( (SubLObject) Characters.CHAR_underbar, (SubLObject) Characters.CHAR_hyphen, Strings.string_downcase( var85, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ),
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52456(final SubLObject var71, final SubLObject var80, final SubLObject var24, final SubLObject var25, SubLObject var33)
  {
    if( var33 == UNPROVIDED )
    {
      var33 = (SubLObject) NIL;
    }
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic87$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    PrintLow.format( var24, (SubLObject) $ic88$, var71 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    PrintLow.format( var24, (SubLObject) $ic89$, var71 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    PrintLow.format( var24, (SubLObject) $ic90$, var80 );
    f52435( var24, var25 );
    if( NIL != var33 )
    {
      streams_high.terpri( var24 );
      f52430( var24, var25 );
      PrintLow.format( var24, (SubLObject) $ic91$, var33 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52462(final SubLObject var2, final SubLObject var3)
  {
    final SubLObject var4 = var2.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic8$, (SubLObject) $ic92$, ConsesLow.append( var6, (SubLObject) NIL ) );
  }

  public static SubLObject f52463(final SubLObject var88)
  {
    final SubLThread var89 = SubLProcess.currentSubLThread();
    $g6502$.setDynamicValue( (SubLObject) ConsesLow.cons( var88, $g6502$.getDynamicValue( var89 ) ), var89 );
    return var88;
  }

  public static SubLObject f52464(final SubLObject var13)
  {
    final SubLThread var14 = SubLProcess.currentSubLThread();
    return module0004.f104( var13, $g6502$.getDynamicValue( var14 ), Symbols.symbol_function( (SubLObject) EQ ), Symbols.symbol_function( (SubLObject) $ic93$ ) );
  }

  public static SubLObject f52465()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return Sequences.reverse( $g6502$.getDynamicValue( var1 ) );
  }

  public static SubLObject f52457(final SubLObject var31, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    final SubLObject var33 = module0812.f51972( var31 );
    var32.resetMultipleValues();
    final SubLObject var34 = f52466( var33 );
    final SubLObject var35 = var32.secondMultipleValue();
    var32.resetMultipleValues();
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic94$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var36 = var34;
    SubLObject var37 = (SubLObject) NIL;
    var37 = var36.first();
    while ( NIL != var36)
    {
      streams_high.terpri( var24 );
      f52467( var37, var24, var25 );
      var36 = var36.rest();
      var37 = var36.first();
    }
    if( NIL != var35 )
    {
      final SubLObject var38 = $g6497$.currentBinding( var32 );
      try
      {
        $g6497$.bind( (SubLObject) T, var32 );
        streams_high.terpri( var24 );
        streams_high.terpri( var24 );
        f52430( var24, var25 );
        streams_high.write_string( (SubLObject) $ic95$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        final SubLObject var35_93 = $g6502$.currentBinding( var32 );
        try
        {
          $g6502$.bind( (SubLObject) NIL, var32 );
          streams_high.terpri( var24 );
          SubLObject var39 = var35;
          SubLObject var40 = (SubLObject) NIL;
          var40 = var39.first();
          while ( NIL != var39)
          {
            f52467( var40, var24, var25 );
            var39 = var39.rest();
            var40 = var39.first();
          }
          final SubLObject var41 = f52465();
          if( NIL != var41 )
          {
            streams_high.terpri( var24 );
            streams_high.terpri( var24 );
            f52430( var24, var25 );
            streams_high.write_string( (SubLObject) $ic96$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            SubLObject var42 = var41;
            SubLObject var43 = (SubLObject) NIL;
            var43 = var42.first();
            while ( NIL != var42)
            {
              streams_high.terpri( var24 );
              f52467( var43, var24, var25 );
              var42 = var42.rest();
              var43 = var42.first();
            }
          }
        }
        finally
        {
          $g6502$.rebind( var35_93, var32 );
        }
      }
      finally
      {
        $g6497$.rebind( var38, var32 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52466(final SubLObject var89)
  {
    final SubLThread var90 = SubLProcess.currentSubLThread();
    SubLObject var91 = (SubLObject) NIL;
    SubLObject var92 = (SubLObject) NIL;
    SubLObject var93 = var89;
    SubLObject var94 = (SubLObject) NIL;
    var94 = var93.first();
    while ( NIL != var93)
    {
      if( NIL != module0035.f2501( var94, (SubLObject) $ic97$ ) && NIL != module0035.f2434( (SubLObject) $ic98$, var94 ) )
      {
        SubLObject var96;
        final SubLObject var95 = var96 = var94;
        SubLObject var97 = (SubLObject) NIL;
        SubLObject var98 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var96, var95, (SubLObject) $ic99$ );
        var97 = var96.first();
        var96 = var96.rest();
        cdestructuring_bind.destructuring_bind_must_consp( var96, var95, (SubLObject) $ic99$ );
        var98 = var96.first();
        SubLObject var99;
        var96 = ( var99 = var96.rest() );
        module0035.f2502( var97, (SubLObject) $ic97$ );
        var90.resetMultipleValues();
        final SubLObject var101_102 = module0035.f2092( var99, Symbols.symbol_function( (SubLObject) $ic100$ ) );
        final SubLObject var103_104 = var90.secondMultipleValue();
        var90.resetMultipleValues();
        var92 = var101_102;
        var99 = var103_104;
        var91 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.listS( var97, var98, ConsesLow.append( var99, (SubLObject) NIL ) ), var91 );
      }
      else
      {
        var91 = (SubLObject) ConsesLow.cons( var94, var91 );
      }
      var93 = var93.rest();
      var94 = var93.first();
    }
    return Values.values( Sequences.nreverse( var91 ), var92 );
  }

  public static SubLObject f52468(final SubLObject var105)
  {
    return module0035.f2501( var105, (SubLObject) $ic98$ );
  }

  public static SubLObject f52458(final SubLObject var31, final SubLObject var24, final SubLObject var25)
  {
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic101$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    final SubLObject var32 = module0812.f52022( var31 );
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic102$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52467( (SubLObject) ConsesLow.list( var32 ), var24, module0048.f_1X( var25 ) );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    final SubLObject var33 = module0812.f52023( var31 );
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic103$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52467( (SubLObject) ConsesLow.list( var33 ), var24, module0048.f_1X( var25 ) );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    final SubLObject var34 = module0812.f52024( var31 );
    streams_high.terpri( var24 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic104$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52467( (SubLObject) ConsesLow.list( var34 ), var24, module0048.f_1X( var25 ) );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52467(final SubLObject var109, final SubLObject var24, SubLObject var25)
  {
    if( var25 == UNPROVIDED )
    {
      var25 = (SubLObject) ZERO_INTEGER;
    }
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    if( NIL != f52432( var109, var24, var25 ) )
    {
      streams_high.write_string( (SubLObject) $ic105$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52432(SubLObject var110, final SubLObject var24, SubLObject var25)
  {
    if( var25 == UNPROVIDED )
    {
      var25 = (SubLObject) ZERO_INTEGER;
    }
    var110 = f52469( var110 );
    if( var110.isAtom() )
    {
      return f52470( var110, var24, var25 );
    }
    final SubLObject var111 = var110.first();
    final SubLObject var112 = f52471( var111 );
    if( NIL != var112 )
    {
      return f52472( var112, var110, var24, var25 );
    }
    return f52473( var110, var24, var25 );
  }

  public static SubLObject f52474(final SubLObject var110, final SubLObject var24, SubLObject var25)
  {
    if( var25 == UNPROVIDED )
    {
      var25 = (SubLObject) ZERO_INTEGER;
    }
    final SubLThread var111 = SubLProcess.currentSubLThread();
    final SubLObject var112 = reader.$read_default_float_format$.currentBinding( var111 );
    final SubLObject var113 = module0816.$g6470$.currentBinding( var111 );
    final SubLObject var114 = $g6499$.currentBinding( var111 );
    final SubLObject var115 = $g6498$.currentBinding( var111 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) $ic39$, var111 );
      module0816.$g6470$.bind( (SubLObject) ZERO_INTEGER, var111 );
      $g6499$.bind( (SubLObject) NIL, var111 );
      $g6498$.bind( (SubLObject) NIL, var111 );
      final SubLObject var117;
      final SubLObject var116 = var117 = module0034.f1854( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      final SubLObject var35_112 = module0034.$g879$.currentBinding( var111 );
      try
      {
        module0034.$g879$.bind( var117, var111 );
        SubLObject var118 = (SubLObject) NIL;
        if( NIL != var117 && NIL == module0034.f1842( var117 ) )
        {
          var118 = module0034.f1869( var117 );
          final SubLObject var119 = Threads.current_process();
          if( NIL == var118 )
          {
            module0034.f1873( var117, var119 );
          }
          else if( !var118.eql( var119 ) )
          {
            Errors.error( (SubLObject) $ic40$ );
          }
        }
        try
        {
          f52432( var110, var24, var25 );
        }
        finally
        {
          final SubLObject var35_113 = Threads.$is_thread_performing_cleanupP$.currentBinding( var111 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var111 );
            if( NIL != var117 && NIL == var118 )
            {
              module0034.f1873( var117, (SubLObject) NIL );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var35_113, var111 );
          }
        }
      }
      finally
      {
        module0034.$g879$.rebind( var35_112, var111 );
      }
    }
    finally
    {
      $g6498$.rebind( var115, var111 );
      $g6499$.rebind( var114, var111 );
      module0816.$g6470$.rebind( var113, var111 );
      reader.$read_default_float_format$.rebind( var112, var111 );
    }
    return var110;
  }

  public static SubLObject f52430(final SubLObject var24, final SubLObject var25)
  {
    SubLObject var26;
    for( var26 = (SubLObject) NIL, var26 = (SubLObject) ZERO_INTEGER; var26.numL( var25 ); var26 = Numbers.add( var26, (SubLObject) ONE_INTEGER ) )
    {
      streams_high.write_string( (SubLObject) $ic106$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52470(final SubLObject var114, final SubLObject var24, final SubLObject var25)
  {
    if( var114.isSymbol() )
    {
      f52475( var114, var24 );
    }
    else
    {
      if( NIL == f52476( var114 ) )
      {
        return Errors.error( (SubLObject) $ic107$, var114 );
      }
      f52477( var114, var24 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52476(final SubLObject var105)
  {
    return module0816.f52255( var105 );
  }

  public static SubLObject f52477(final SubLObject var114, final SubLObject var24)
  {
    return module0816.f52256( var114, var24 );
  }

  public static SubLObject f52478(final SubLObject var115, final SubLObject var24, SubLObject var25)
  {
    if( var25 == UNPROVIDED )
    {
      var25 = (SubLObject) NIL;
    }
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var115, var115, (SubLObject) $ic108$ );
    var116 = var115.first();
    SubLObject var118 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var118, var115, (SubLObject) $ic108$ );
    var117 = var118.first();
    var118 = var118.rest();
    if( NIL != var118 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var115, (SubLObject) $ic108$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var116, (SubLObject) $ic109$ );
    final SubLObject var119 = module0818.f52407( var117 );
    if( NIL == var119 )
    {
      return Errors.error( (SubLObject) $ic110$, var117 );
    }
    return streams_high.write_string( var119, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52475(final SubLObject var120, final SubLObject var24)
  {
    final SubLObject var122;
    final SubLObject var121 = var122 = f52479( var120 );
    if( var122.eql( (SubLObject) $ic111$ ) || var122.eql( (SubLObject) $ic112$ ) || var122.eql( (SubLObject) $ic113$ ) )
    {
      final SubLObject var123 = module0818.f52413( var120 );
      if( !var123.equal( f52455() ) && $ic114$ != var123 )
      {
        streams_high.write_string( var123, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        streams_high.write_string( (SubLObject) $ic50$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      f52480( var120, var24 );
    }
    else
    {
      if( !var122.eql( (SubLObject) $ic115$ ) )
      {
        return Errors.error( (SubLObject) $ic116$, var121, var120 );
      }
      final SubLObject var124 = f52481( var120 );
      streams_high.write_string( var124, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52480(final SubLObject var120, final SubLObject var24)
  {
    final SubLObject var121 = module0818.f52414( var120 );
    streams_high.write_string( var121, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return var120;
  }

  public static SubLObject f52479(final SubLObject var120)
  {
    final SubLObject var121 = module0818.f52408( var120 );
    if( NIL != var121 )
    {
      return var121;
    }
    return module0811.f51798( var120 );
  }

  public static SubLObject f52482(final SubLObject var2, final SubLObject var3)
  {
    final SubLObject var4 = var2.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic8$, (SubLObject) $ic117$, ConsesLow.append( var6, (SubLObject) NIL ) );
  }

  public static SubLObject f52483(final SubLObject var120)
  {
    final SubLThread var121 = SubLProcess.currentSubLThread();
    final SubLObject var122 = f52484( var120 );
    $g6498$.setDynamicValue( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.cons( var120, var122 ), $g6498$.getDynamicValue( var121 ) ), var121 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52481(final SubLObject var120)
  {
    final SubLThread var121 = SubLProcess.currentSubLThread();
    SubLObject var122 = module0035.f2294( $g6498$.getDynamicValue( var121 ), var120, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) $ic118$ );
    if( var122 == $ic118$ && NIL == module0812.f51930() )
    {
      var122 = f52484( var120 );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var121 ) && !var122.isString() )
    {
      Errors.error( (SubLObject) $ic119$, var120 );
    }
    return var122;
  }

  public static SubLObject f52484(final SubLObject var120)
  {
    final SubLThread var121 = SubLProcess.currentSubLThread();
    SubLObject var122 = f52485( var120 );
    if( NIL != module0818.f52382( var122 ) )
    {
      var122 = Sequences.cconcatenate( (SubLObject) $ic120$, module0006.f203( var122 ) );
    }
    else if( NIL != Characters.digit_char_p( Strings.sublisp_char( var122, (SubLObject) ZERO_INTEGER ), (SubLObject) UNPROVIDED ) )
    {
      var122 = Sequences.cconcatenate( (SubLObject) $ic120$, module0006.f203( var122 ) );
    }
    else if( NIL != module0809.f51522( f52451( var122 ) ) )
    {
      var122 = Sequences.cconcatenate( (SubLObject) $ic120$, module0006.f203( var122 ) );
    }
    final SubLObject var123 = f52486( var120 );
    if( var123.numG( (SubLObject) ZERO_INTEGER ) )
    {
      module0816.$g6470$.setDynamicValue( Numbers.add( module0816.$g6470$.getDynamicValue( var121 ), (SubLObject) ONE_INTEGER ), var121 );
      var122 = Sequences.cconcatenate( module0006.f203( var122 ), new SubLObject[] { $ic121$, module0006.f203( module0816.$g6470$.getDynamicValue( var121 ) )
      } );
    }
    return var122;
  }

  public static SubLObject f52486(final SubLObject var127)
  {
    final SubLThread var128 = SubLProcess.currentSubLThread();
    final SubLObject var129 = Symbols.symbol_name( var127 );
    SubLObject var130 = (SubLObject) ZERO_INTEGER;
    SubLObject var131 = $g6498$.getDynamicValue( var128 );
    SubLObject var132 = (SubLObject) NIL;
    var132 = var131.first();
    while ( NIL != var131)
    {
      SubLObject var134;
      final SubLObject var133 = var134 = var132;
      SubLObject var135 = (SubLObject) NIL;
      SubLObject var136 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var134, var133, (SubLObject) $ic122$ );
      var135 = var134.first();
      var134 = ( var136 = var134.rest() );
      if( var129.equalp( Symbols.symbol_name( var135 ) ) )
      {
        var130 = Numbers.add( var130, (SubLObject) ONE_INTEGER );
      }
      var131 = var131.rest();
      var132 = var131.first();
    }
    return var130;
  }

  public static SubLObject f52485(final SubLObject var127)
  {
    if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic84$ ) )
    {
      final SubLObject var128 = f52487( var127 );
      return Sequences.cconcatenate( (SubLObject) $ic123$, module0006.f205( var128 ) );
    }
    return module0818.f52401( var127 );
  }

  public static SubLObject f52488(final SubLObject var127)
  {
    final SubLThread var128 = SubLProcess.currentSubLThread();
    module0816.$g6470$.setDynamicValue( Numbers.add( module0816.$g6470$.getDynamicValue( var128 ), (SubLObject) ONE_INTEGER ), var128 );
    return module0816.$g6470$.getDynamicValue( var128 );
  }

  public static SubLObject f52487(final SubLObject var127)
  {
    final SubLThread var128 = SubLProcess.currentSubLThread();
    final SubLObject var129 = module0034.$g879$.getDynamicValue( var128 );
    SubLObject var130 = (SubLObject) NIL;
    if( NIL == var129 )
    {
      return f52488( var127 );
    }
    var130 = module0034.f1857( var129, (SubLObject) $ic124$, (SubLObject) UNPROVIDED );
    if( NIL == var130 )
    {
      var130 = module0034.f1807( module0034.f1842( var129 ), (SubLObject) $ic124$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var129, (SubLObject) $ic124$, var130 );
    }
    SubLObject var131 = module0034.f1814( var130, var127, (SubLObject) $ic86$ );
    if( var131 == $ic86$ )
    {
      var131 = Values.arg2( var128.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52488( var127 ) ) );
      module0034.f1816( var130, var127, var131, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var131 );
  }

  public static SubLObject f52473(final SubLObject var135, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var136 = SubLProcess.currentSubLThread();
    SubLObject var137 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var135, var135, (SubLObject) $ic125$ );
    var137 = var135.first();
    SubLObject var139;
    final SubLObject var138 = var139 = var135.rest();
    var136.resetMultipleValues();
    final SubLObject var140 = f52489( var137 );
    final SubLObject var141 = var136.secondMultipleValue();
    final SubLObject var142 = var136.thirdMultipleValue();
    var136.resetMultipleValues();
    if( $ic126$ == var140 )
    {
      Errors.warn( (SubLObject) $ic127$, var137 );
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic128$, (SubLObject) ConsesLow.list( (SubLObject) $ic129$, var137 ), ConsesLow.append( var139, (SubLObject) NIL ) ),
          var24, var25 );
    }
    final SubLObject var143 = Sequences.length( var139 );
    final SubLObject var144 = Numbers.add( var140, var141 );
    final SubLObject var145 = Numbers.max( (SubLObject) ZERO_INTEGER, Numbers.subtract( var143, var144 ) );
    final SubLObject var146 = Numbers.min( var141, Numbers.max( (SubLObject) ZERO_INTEGER, Numbers.subtract( var144, var143 ) ) );
    final SubLObject var147 = Numbers.max( (SubLObject) ZERO_INTEGER, Numbers.subtract( var140, var143 ) );
    final SubLObject var148 = (SubLObject) ( ( NIL != var142 ) ? ZERO_INTEGER : var145 );
    final SubLObject var149 = Numbers.max( (SubLObject) ZERO_INTEGER, Numbers.subtract( var141, var146 ) );
    final SubLObject var150 = Numbers.min( var143, Numbers.add( var140, var149 ) );
    if( var147.isPositive() )
    {
      Errors.warn( (SubLObject) $ic130$, var137, var147 );
    }
    if( var148.isPositive() )
    {
      Errors.warn( (SubLObject) $ic131$, var137, var148 );
    }
    f52490( var137, var24 );
    streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var151 = (SubLObject) ZERO_INTEGER;
    SubLObject var152;
    SubLObject var153_154;
    SubLObject var151_152;
    SubLObject var153;
    SubLObject var154;
    for( var152 = (SubLObject) NIL, var152 = (SubLObject) ZERO_INTEGER; var152.numL( var150 ); var152 = Numbers.add( var152, (SubLObject) ONE_INTEGER ) )
    {
      var151_152 = ( var153_154 = var139 );
      var153 = (SubLObject) NIL;
      var154 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var153_154, var151_152, (SubLObject) $ic133$ );
      var153 = var153_154.first();
      var153_154 = var153_154.rest();
      var154 = ( var139 = var153_154 );
      if( !var151.isZero() )
      {
        f52491( var24 );
      }
      f52432( var153, var24, module0048.f_1X( var25 ) );
      var151 = Numbers.add( var151, (SubLObject) ONE_INTEGER );
    }
    for( var152 = (SubLObject) NIL, var152 = (SubLObject) ZERO_INTEGER; var152.numL( var146 ); var152 = Numbers.add( var152, (SubLObject) ONE_INTEGER ) )
    {
      if( !var151.isZero() )
      {
        f52491( var24 );
      }
      f52492( var24 );
      var151 = Numbers.add( var151, (SubLObject) ONE_INTEGER );
    }
    if( NIL != var142 )
    {
      if( !var151.isZero() )
      {
        f52491( var24 );
      }
      f52493( var137, Sequences.length( var139 ) );
      f52494( var139, var24, module0048.f_1X( var25 ) );
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52495(final SubLObject var156, final SubLObject var24)
  {
    final SubLObject var157 = module0818.f52404( var156 );
    streams_high.write_string( var157, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52490(final SubLObject var156, final SubLObject var24)
  {
    final SubLObject var157 = module0818.f52403( var156 );
    if( $ic135$ != var157 && !var157.equal( f52455() ) && $ic114$ != var157 )
    {
      streams_high.write_string( var157, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic50$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return f52495( var156, var24 );
  }

  public static SubLObject f52494(final SubLObject var155, final SubLObject var24, final SubLObject var25)
  {
    if( NIL == var155 )
    {
      f52432( (SubLObject) $ic136$, var24, module0048.f_1X( var25 ) );
    }
    else
    {
      f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic137$, (SubLObject) $ic138$, var155 ), var24, module0048.f_1X( var25 ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52489(final SubLObject var156)
  {
    final SubLObject var157 = f52496( var156 );
    if( var157 == $ic126$ )
    {
      return Values.values( (SubLObject) $ic126$, (SubLObject) $ic126$, (SubLObject) $ic126$ );
    }
    if( var157 == $ic114$ )
    {
      return module0812.f52005( var156 );
    }
    return module0812.f52006( var157 );
  }

  public static SubLObject f52496(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    SubLObject var158 = module0818.f52405( var156 );
    if( var158 != $ic114$ )
    {
      return var158;
    }
    var158 = module0812.f51983( var156 );
    if( var158 != $ic114$ )
    {
      return var158;
    }
    var158 = module0809.f51528( var156 );
    if( var158 != $ic114$ )
    {
      return var158;
    }
    if( NIL != f52464( var156 ) )
    {
      return (SubLObject) NIL;
    }
    final SubLObject var159 = Symbols.symbol_name( var156 );
    if( NIL != module0038.f2684( var159, (SubLObject) $ic139$ ) )
    {
      return (SubLObject) $ic140$;
    }
    if( NIL == module0812.f51930() && NIL != Symbols.fboundp( var156 ) )
    {
      var158 = (SubLObject) $ic114$;
      SubLObject var160 = (SubLObject) NIL;
      try
      {
        var157.throwStack.push( $ic141$ );
        final SubLObject var161 = Errors.$error_handler$.currentBinding( var157 );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( (SubLObject) $ic142$ ), var157 );
          try
          {
            var158 = module0004.f86( var156 );
          }
          catch( Throwable var162 )
          {
            Errors.handleThrowable( var162, (SubLObject) NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( var161, var157 );
        }
      }
      catch( Throwable var163 )
      {
        var160 = Errors.handleThrowable( var163, (SubLObject) $ic141$ );
      }
      finally
      {
        var157.throwStack.pop();
      }
      if( var158 != $ic114$ )
      {
        return var158;
      }
      Errors.warn( (SubLObject) $ic143$, var156 );
    }
    Errors.warn( (SubLObject) $ic144$, var156 );
    return (SubLObject) $ic126$;
  }

  public static SubLObject f52491(final SubLObject var24)
  {
    return module0816.f52276( var24 );
  }

  public static SubLObject f52492(final SubLObject var24)
  {
    return streams_high.write_string( (SubLObject) $ic145$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52471(final SubLObject var19)
  {
    return module0035.f2294( $g6503$.getGlobalValue(), var19, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52472(final SubLObject var111, final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var112 = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var112 ) && NIL == module0004.f85( var111 ) )
    {
      Errors.error( (SubLObject) $ic147$, var111 );
    }
    return Functions.funcall( var111, var110, var24, var25 );
  }

  public static SubLObject f52497(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic148$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic148$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic148$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic149$ );
      final SubLObject var115 = (SubLObject) ConsesLow.list( (SubLObject) $ic150$, (SubLObject) ConsesLow.list( (SubLObject) $ic151$, (SubLObject) $ic152$, (SubLObject) ConsesLow.list(
          var113, var112 ) ), var112 );
      return f52432( var115, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic148$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52498(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    return f52499( (SubLObject) $ic153$, var110, var24, var25 );
  }

  public static SubLObject f52499(final SubLObject var165, final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var166 = (SubLObject) NIL;
    SubLObject var167 = (SubLObject) NIL;
    SubLObject var168 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic148$ );
    var166 = var110.first();
    SubLObject var169 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var169, var110, (SubLObject) $ic148$ );
    var167 = var169.first();
    var169 = var169.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var169, var110, (SubLObject) $ic148$ );
    var168 = var169.first();
    var169 = var169.rest();
    if( NIL == var169 )
    {
      module0035.f2502( var166, var165 );
      SubLObject var170 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var168 ) );
      SubLObject var171 = (SubLObject) NIL;
      if( NIL == module0035.f2501( var170, (SubLObject) $ic109$ ) && NIL == module0035.f2501( var170, (SubLObject) $ic129$ ) && NIL == module0035.f2501( var170,
          (SubLObject) $ic155$ ) )
      {
        var170 = (SubLObject) ConsesLow.list( (SubLObject) $ic156$, (SubLObject) $ic157$, var170 );
      }
      if( var165.eql( (SubLObject) $ic154$ ) || var165.eql( (SubLObject) $ic149$ ) )
      {
        var171 = (SubLObject) $ic158$;
      }
      else if( var165.eql( (SubLObject) $ic154$ ) || var165.eql( (SubLObject) $ic153$ ) )
      {
        var171 = (SubLObject) $ic159$;
      }
      else
      {
        Errors.error( (SubLObject) $ic160$, var165 );
      }
      final SubLObject var172 = (SubLObject) ConsesLow.list( (SubLObject) $ic161$, (SubLObject) NIL, var171, var167, var170 );
      f52432( var172, var24, var25 );
      return (SubLObject) T;
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic148$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52500(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic162$ );
    var112 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic162$ );
    final SubLObject var114 = var113.rest();
    var113 = var113.first();
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic162$ );
    var115 = var113.first();
    var113 = var113.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic162$ );
    var116 = var113.first();
    var113 = var113.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic162$ );
    var117 = var113.first();
    var113 = var113.rest();
    if( NIL != var113 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic162$ );
      return (SubLObject) NIL;
    }
    final SubLObject var118;
    var113 = ( var118 = var114 );
    module0035.f2502( var112, (SubLObject) $ic163$ );
    final SubLObject var119 = f52501();
    if( NIL != var119 )
    {
      final SubLObject var120 = (SubLObject) ConsesLow.list( (SubLObject) $ic164$, (SubLObject) ConsesLow.listS( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic161$,
          var119, (SubLObject) $ic165$, var115 ), ConsesLow.append( var118, (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list(
              (SubLObject) $ic166$, var117 ), (SubLObject) ConsesLow.list( (SubLObject) $ic167$, var116, (SubLObject) ConsesLow.list( (SubLObject) $ic168$, var117, var115 ) ) ) ),
          (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var119, (SubLObject) $ic169$ ) );
      return f52502( var120, var24, var25 );
    }
    final SubLObject var176_177 = (SubLObject) $ic170$;
    return f52503( (SubLObject) ConsesLow.list( (SubLObject) $ic171$, var176_177, var110 ), var24, var25 );
  }

  public static SubLObject f52504(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic172$ );
    var111 = var110.first();
    SubLObject var112 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic172$ );
    final SubLObject var113 = var112.rest();
    var112 = var112.first();
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic172$ );
    var114 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic172$ );
    var115 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic172$ );
    var116 = var112.first();
    var112 = var112.rest();
    if( NIL == var112 )
    {
      final SubLObject var117;
      var112 = ( var117 = var113 );
      module0035.f2502( var111, (SubLObject) $ic173$ );
      final SubLObject var118 = (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic174$, var116, (SubLObject) ConsesLow.list(
          (SubLObject) $ic175$, var115 ), (SubLObject) $ic176$ ), (SubLObject) ConsesLow.listS( (SubLObject) $ic177$, (SubLObject) ConsesLow.list( (SubLObject) $ic178$,
              var116 ), (SubLObject) ConsesLow.list( (SubLObject) $ic167$, var114, (SubLObject) ConsesLow.list( (SubLObject) $ic179$, var116 ) ), ConsesLow.append( var117,
                  (SubLObject) NIL ) ) );
      return f52432( var118, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic172$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52505(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic180$ );
    var112 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic180$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var112, (SubLObject) $ic181$ );
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = (SubLObject) NIL;
    SubLObject var118 = (SubLObject) NIL;
    SubLObject var119 = (SubLObject) NIL;
    SubLObject var120 = (SubLObject) NIL;
    SubLObject var121 = (SubLObject) NIL;
    var119 = var113;
    var120 = var119.first();
    for( var121 = (SubLObject) ZERO_INTEGER; NIL != var119; var119 = var119.rest(), var120 = var119.first(), var121 = Numbers.add( (SubLObject) ONE_INTEGER, var121 ) )
    {
      final SubLObject var122 = f52506( var121 );
      SubLObject var195_196;
      final SubLObject var193_194 = var195_196 = var120;
      SubLObject var123 = (SubLObject) NIL;
      SubLObject var124 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var195_196, var193_194, (SubLObject) $ic182$ );
      var123 = var195_196.first();
      var195_196 = var195_196.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var195_196, var193_194, (SubLObject) $ic182$ );
      var124 = var195_196.first();
      var195_196 = var195_196.rest();
      if( NIL == var195_196 )
      {
        var116 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var122, (SubLObject) ConsesLow.list( (SubLObject) $ic183$, var123 ) ), var116 );
        var117 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic184$, var123, var124 ), var117 );
        var118 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic185$, var123, var122 ), var118 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var193_194, (SubLObject) $ic182$ );
      }
    }
    return f52507( (SubLObject) ConsesLow.list( (SubLObject) $ic186$, Sequences.nreverse( var116 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic164$, reader.bq_cons( (SubLObject) $ic3$,
        ConsesLow.append( Sequences.nreverse( var117 ), var115, (SubLObject) NIL ) ), (SubLObject) NIL, ConsesLow.append( var118, (SubLObject) NIL ) ) ), var24, var25 );
  }

  public static SubLObject f52508()
  {
    final SubLObject var198 = $g6504$.getGlobalValue();
    if( NIL != var198 )
    {
      module0034.f1818( var198 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52509(final SubLObject var192)
  {
    return module0034.f1829( $g6504$.getGlobalValue(), (SubLObject) ConsesLow.list( var192 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52510(final SubLObject var192)
  {
    return Symbols.make_symbol( Sequences.cconcatenate( (SubLObject) $ic188$, module0006.f205( var192 ) ) );
  }

  public static SubLObject f52506(final SubLObject var192)
  {
    SubLObject var193 = $g6504$.getGlobalValue();
    if( NIL == var193 )
    {
      var193 = module0034.f1934( (SubLObject) $ic187$, (SubLObject) $ic189$, (SubLObject) NIL, (SubLObject) EQ, (SubLObject) ONE_INTEGER,
          (SubLObject) ZERO_INTEGER );
    }
    SubLObject var194 = module0034.f1814( var193, var192, (SubLObject) $ic86$ );
    if( var194 == $ic86$ )
    {
      var194 = Values.arg2( Values.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52510( var192 ) ) );
      module0034.f1816( var193, var192, var194, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var194 );
  }

  public static SubLObject f52507(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic180$ );
    var112 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic180$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var112, (SubLObject) $ic186$ );
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = var113;
    SubLObject var118 = (SubLObject) NIL;
    var118 = var117.first();
    while ( NIL != var117)
    {
      SubLObject var205_206;
      final SubLObject var203_204 = var205_206 = var118;
      SubLObject var119 = (SubLObject) NIL;
      SubLObject var120 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var205_206, var203_204, (SubLObject) $ic182$ );
      var119 = var205_206.first();
      var205_206 = var205_206.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var205_206, var203_204, (SubLObject) $ic182$ );
      var120 = var205_206.first();
      var205_206 = var205_206.rest();
      if( NIL == var205_206 )
      {
        var116 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic174$, var119, var120 ), var116 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var203_204, (SubLObject) $ic182$ );
      }
      var117 = var117.rest();
      var118 = var117.first();
    }
    final SubLObject var121 = $g6499$.currentBinding( var111 );
    final SubLObject var122 = $g6498$.currentBinding( var111 );
    try
    {
      $g6499$.bind( $g6498$.getDynamicValue( var111 ), var111 );
      $g6498$.bind( $g6498$.getDynamicValue( var111 ), var111 );
      f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( Sequences.nreverse( var116 ), var115, (SubLObject) NIL ) ), var24, var25 );
    }
    finally
    {
      $g6498$.rebind( var122, var111 );
      $g6499$.rebind( var121, var111 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52512(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    return module0816.f52291( var110, var24, var25 );
  }

  public static SubLObject f52513(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic190$ );
    var111 = var110.first();
    SubLObject var112 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic190$ );
    final SubLObject var113 = var112.rest();
    var112 = var112.first();
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic190$ );
    var114 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic190$ );
    var115 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic190$ );
    var116 = var112.first();
    var112 = var112.rest();
    if( NIL == var112 )
    {
      final SubLObject var117;
      var112 = ( var117 = var113 );
      module0035.f2502( var111, (SubLObject) $ic191$ );
      final SubLObject var118 = (SubLObject) $ic192$;
      return f52507( (SubLObject) ConsesLow.list( (SubLObject) $ic186$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var116, var114 ) ), (SubLObject) ConsesLow.listS(
          (SubLObject) $ic174$, var118, (SubLObject) ConsesLow.list( (SubLObject) $ic193$, var116 ), (SubLObject) $ic194$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic164$,
              (SubLObject) ConsesLow.listS( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic195$, var116, var115 ), ConsesLow.append( var117, (SubLObject) NIL ) ),
              (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic196$, var116, var118 ) ) ), var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic190$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52514(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic197$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL != var114 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic197$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var111, (SubLObject) $ic167$ );
    final SubLObject var115 = f52479( var112 );
    if( var115.eql( (SubLObject) $ic115$ ) )
    {
      return f52515( (SubLObject) ConsesLow.list( (SubLObject) $ic198$, var112, var113 ), var24, var25 );
    }
    if( var115.eql( (SubLObject) $ic111$ ) )
    {
      return f52516( (SubLObject) ConsesLow.list( (SubLObject) $ic199$, var112, var113 ), var24, var25 );
    }
    if( var115.eql( (SubLObject) $ic112$ ) )
    {
      return f52517( (SubLObject) ConsesLow.list( (SubLObject) $ic200$, var112, var113 ), var24, var25 );
    }
    if( var115.eql( (SubLObject) $ic113$ ) )
    {
      return Errors.error( (SubLObject) $ic201$, var112 );
    }
    return Errors.error( (SubLObject) $ic202$, var112 );
  }

  public static SubLObject f52516(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic197$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic199$ );
      f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic203$, var112, var113 ), var24, var25 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic197$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52517(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic197$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic200$ );
      f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic204$, var112, var113 ), var24, var25 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic197$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52515(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic197$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic197$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic198$ );
      f52432( var112, var24, module0048.f_1X( var25 ) );
      f52518( var24 );
      f52432( var113, var24, module0048.f_1X( var25 ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic197$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52518(final SubLObject var24)
  {
    return module0816.f52297( var24 );
  }

  public static SubLObject f52519(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic205$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic205$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic205$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic206$ );
    final SubLObject var116 = f52520( var115 );
    return f52502( (SubLObject) ConsesLow.listS( (SubLObject) $ic164$, var113, (SubLObject) NIL, ConsesLow.append( var116, (SubLObject) NIL ) ), var24, var25 );
  }

  public static SubLObject f52520(final SubLObject var8)
  {
    final SubLThread var9 = SubLProcess.currentSubLThread();
    if( NIL != module0062.f4492( var8, (SubLObject) $ic207$ ) )
    {
      return var8;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.listS( (SubLObject) $ic181$, (SubLObject) $ic208$, ConsesLow.append( var8, (SubLObject) NIL ) ) );
  }

  public static SubLObject f52521(final SubLObject var19)
  {
    return module0035.f2169( var19, $g6505$.getGlobalValue() );
  }

  public static SubLObject f52522(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic210$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic210$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic211$ );
      streams_high.write_string( (SubLObject) $ic212$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL == module0813.f52033() )
      {
        f52432( module0038.f2623( var112, (SubLObject) ONE_INTEGER, module0048.f_1_( Sequences.length( var112 ) ) ), var24, module0048.f_1X( var25 ) );
      }
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic210$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52523(final SubLObject var110, final SubLObject var24, SubLObject var25)
  {
    if( var25 == UNPROVIDED )
    {
      var25 = (SubLObject) NIL;
    }
    final SubLObject var111 = var110.first();
    module0035.f2502( var111, (SubLObject) $ic213$ );
    return f52524( var110, var24, var25 );
  }

  public static SubLObject f52524(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic214$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic214$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic214$ );
    var113 = var114.first();
    var114 = var114.rest();
    final SubLObject var115 = (SubLObject) ( var114.isCons() ? var114.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var114, var110, (SubLObject) $ic214$ );
    var114 = var114.rest();
    if( NIL == var114 )
    {
      if( NIL != var115 )
      {
        f52525( var115, var24, var25 );
      }
      f52526( var112, var24, var25 );
      if( NIL != module0812.f51991( var112 ) )
      {
        streams_high.write_string( (SubLObject) $ic215$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else
      {
        streams_high.write_string( (SubLObject) $ic216$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      f52527( var24 );
      f52528( var24 );
      streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52480( var112, var24 );
      f52518( var24 );
      f52432( (SubLObject) $ic218$, var24, module0048.f_1X( var25 ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic214$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52529(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic219$ );
    var112 = var110.first();
    SubLObject var115 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic219$ );
    var113 = var115.first();
    var115 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic219$ );
    var114 = var115.first();
    final SubLObject var116;
    var115 = ( var116 = var115.rest() );
    module0035.f2502( var112, (SubLObject) $ic97$ );
    if( NIL != module0812.f51930() && NIL == Errors.$ignore_mustsP$.getDynamicValue( var111 ) && !var25.numE( (SubLObject) ONE_INTEGER ) )
    {
      Errors.error( (SubLObject) $ic220$, var112 );
    }
    final SubLObject var117 = f52427( var113 );
    final SubLObject var118 = $g6495$.currentBinding( var111 );
    try
    {
      $g6495$.bind( (SubLObject) ( ( NIL != var117 ) ? var113 : NIL ), var111 );
      final SubLObject var119 = (SubLObject) $ic221$;
      SubLObject var120 = (SubLObject) NIL;
      final SubLObject var35_237 = Errors.$restarts$.currentBinding( var111 );
      try
      {
        Errors.$restarts$.bind( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var119, (SubLObject) $ic222$, var113 ), Errors.$restarts$.getDynamicValue( var111 ) ), var111 );
        try
        {
          var111.throwStack.push( var119 );
          final SubLObject var121 = f52530( var116 );
          final SubLObject var122 = f52531( var113, var114, var116 );
          if( NIL != var121 )
          {
            f52525( var121, var24, var25 );
          }
          f52532( var113, var24, var25 );
          if( NIL != f52464( var113 ) )
          {
            streams_high.write_string( (SubLObject) $ic215$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          }
          else
          {
            streams_high.write_string( (SubLObject) $ic216$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          }
          f52527( var24 );
          final SubLObject var35_238 = $g6499$.currentBinding( var111 );
          final SubLObject var123 = $g6498$.currentBinding( var111 );
          try
          {
            $g6499$.bind( $g6498$.getDynamicValue( var111 ), var111 );
            $g6498$.bind( $g6498$.getDynamicValue( var111 ), var111 );
            f52533( var24, var113, var114, var25 );
            streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            f52432( var122, var24, var25 );
          }
          finally
          {
            $g6498$.rebind( var123, var111 );
            $g6499$.rebind( var35_238, var111 );
          }
          if( NIL != $g6506$.getDynamicValue( var111 ) )
          {
            if( NIL != f52534( var113 ) )
            {
              streams_high.terpri( var24 );
              f52535( var113, var24 );
            }
            if( NIL != f52536( var113 ) )
            {
              streams_high.terpri( var24 );
              f52537( var113, var24 );
            }
            if( NIL != f52538( var113 ) )
            {
              streams_high.terpri( var24 );
              f52539( var113, var24 );
            }
          }
        }
        catch( Throwable var124 )
        {
          var120 = Errors.handleThrowable( var124, var119 );
        }
        finally
        {
          var111.throwStack.pop();
        }
      }
      finally
      {
        Errors.$restarts$.rebind( var35_237, var111 );
      }
    }
    finally
    {
      $g6495$.rebind( var118, var111 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52530(final SubLObject var8)
  {
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var8, var8, (SubLObject) $ic223$ );
    var9 = var8.first();
    final SubLObject var11;
    final SubLObject var10 = var11 = var8.rest();
    if( var9.isString() )
    {
      return var9;
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52531(final SubLObject var22, final SubLObject var100, SubLObject var8)
  {
    final SubLThread var101 = SubLProcess.currentSubLThread();
    final SubLObject var102 = (SubLObject) ( ( NIL != f52424() ) ? ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic224$, var22, var100 ) ) : NIL );
    SubLObject var104;
    final SubLObject var103 = var104 = var8;
    SubLObject var105 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var104, var103, (SubLObject) $ic223$ );
    var105 = var104.first();
    final SubLObject var106;
    var104 = ( var106 = var104.rest() );
    if( var105.isString() )
    {
      var8 = var106;
    }
    var101.resetMultipleValues();
    final SubLObject var107 = module0814.f52185( var8 );
    final SubLObject var108 = var101.secondMultipleValue();
    var101.resetMultipleValues();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var101 ) && NIL == var108 )
    {
      Errors.error( (SubLObject) $ic225$, var22 );
    }
    var101.resetMultipleValues();
    final SubLObject var109 = f52540( var100 );
    final SubLObject var110 = var101.secondMultipleValue();
    var101.resetMultipleValues();
    if( NIL != var110 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic186$, var110, ConsesLow.append( var109, var102, var107, (SubLObject) NIL ) );
    }
    return reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var109, var102, var107, (SubLObject) NIL ) );
  }

  public static SubLObject f52525(final SubLObject var231, final SubLObject var24, final SubLObject var25)
  {
    if( NIL == module0813.f52033() )
    {
      streams_high.write_string( (SubLObject) $ic226$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var231, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic43$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var24 );
      f52430( var24, var25 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52532(final SubLObject var13, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var26 = SubLProcess.currentSubLThread();
    if( NIL == module0813.f52033() )
    {
      var26.resetMultipleValues();
      final SubLObject var27 = module0809.f51623( var13 );
      final SubLObject var28 = var26.secondMultipleValue();
      var26.resetMultipleValues();
      if( NIL != var27 && NIL != var28 )
      {
        return f52541( var27, var28, var24, var25 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52526(final SubLObject var251, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var252 = SubLProcess.currentSubLThread();
    if( NIL == module0813.f52033() )
    {
      var252.resetMultipleValues();
      final SubLObject var253 = module0809.f51625( var251 );
      final SubLObject var254 = var252.secondMultipleValue();
      var252.resetMultipleValues();
      if( NIL != var253 && NIL != var254 )
      {
        return f52541( var253, var254, var24, var25 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52541(final SubLObject var250, final SubLObject var63, final SubLObject var24, final SubLObject var25)
  {
    final SubLObject var251 = (SubLObject) ConsesLow.list( (SubLObject) $ic227$, (SubLObject) $ic228$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic229$,
        var250 ), (SubLObject) ConsesLow.list( (SubLObject) $ic230$, var63 ) ) );
    f52432( var251, var24, var25 );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52540(final SubLObject var100)
  {
    return module0816.f52310( var100 );
  }

  public static SubLObject f52542(final SubLObject var13)
  {
    return (SubLObject) makeBoolean( var13.isSymbol() && ( NIL != module0812.f51988( var13 ) || NIL != module0812.f52025( var13 ) ) );
  }

  public static SubLObject f52533(final SubLObject var24, final SubLObject var156, final SubLObject var100, SubLObject var25)
  {
    if( var25 == UNPROVIDED )
    {
      var25 = (SubLObject) ZERO_INTEGER;
    }
    f52543( var24 );
    streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52495( var156, var24 );
    f52544( var100, var24, module0048.f_1X( var25 ) );
    return (SubLObject) NIL;
  }

  public static SubLObject f52527(final SubLObject var24)
  {
    return streams_high.write_string( (SubLObject) $ic231$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52545(final SubLObject var24)
  {
    return streams_high.write_string( (SubLObject) $ic232$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52543(final SubLObject var24)
  {
    return streams_high.write_string( $g6507$.getGlobalValue(), var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52528(final SubLObject var24)
  {
    return streams_high.write_string( (SubLObject) $ic157$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52544(final SubLObject var100, final SubLObject var24, final SubLObject var25)
  {
    if( NIL == var100 )
    {
      streams_high.write_string( (SubLObject) $ic233$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      return (SubLObject) NIL;
    }
    streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var101 = (SubLObject) ZERO_INTEGER;
    SubLObject var102 = (SubLObject) NIL;
    SubLObject var103 = (SubLObject) NIL;
    SubLObject var104 = (SubLObject) NIL;
    var102 = var100;
    var103 = var102.first();
    for( var104 = (SubLObject) ZERO_INTEGER; NIL != var102; var102 = var102.rest(), var103 = var102.first(), var104 = Numbers.add( (SubLObject) ONE_INTEGER, var104 ) )
    {
      if( var103 != $ic27$ )
      {
        if( !var101.isZero() )
        {
          f52546( var24 );
        }
        f52543( var24 );
        streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52547( var103, var24 );
        var101 = Numbers.add( var101, (SubLObject) ONE_INTEGER );
      }
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52546(final SubLObject var24)
  {
    return module0816.f52314( var24 );
  }

  public static SubLObject f52547(final SubLObject var29, final SubLObject var24)
  {
    final SubLObject var30 = module0816.f52316( var29 );
    f52483( var30 );
    return f52432( var30, var24, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52548(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic219$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic219$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic219$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic234$ );
    return f52529( (SubLObject) ConsesLow.listS( (SubLObject) $ic97$, var112, var113, ConsesLow.append( var115, (SubLObject) NIL ) ), var24, var25 );
  }

  public static SubLObject f52549(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLObject var111 = var110.first();
    module0035.f2502( var111, (SubLObject) $ic235$ );
    return f52524( var110, var24, var25 );
  }

  public static SubLObject f52550(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLObject var111 = var110.first();
    module0035.f2502( var111, (SubLObject) $ic236$ );
    return f52524( var110, var24, var25 );
  }

  public static SubLObject f52551(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic237$ );
    var111 = var110.first();
    final SubLObject var113;
    final SubLObject var112 = var113 = var110.rest();
    module0035.f2502( var111, (SubLObject) $ic238$ );
    final SubLObject var261_262;
    final SubLObject var259_260 = var261_262 = var113;
    final SubLObject var114 = cdestructuring_bind.property_list_member( (SubLObject) $ic239$, var261_262 );
    final SubLObject var115 = (SubLObject) ( ( NIL != var114 ) ? conses_high.cadr( var114 ) : NIL );
    final SubLObject var116 = cdestructuring_bind.property_list_member( (SubLObject) $ic240$, var261_262 );
    final SubLObject var117 = (SubLObject) ( ( NIL != var116 ) ? conses_high.cadr( var116 ) : NIL );
    final SubLObject var118 = f52552( var115 );
    PrintLow.format( var24, (SubLObject) $ic241$, var118 );
    f52430( var24, module0048.f_1X( var25 ) );
    PrintLow.format( var24, (SubLObject) $ic242$ );
    SubLObject var119 = (SubLObject) TWO_INTEGER;
    SubLObject var120 = var117;
    SubLObject var121 = (SubLObject) NIL;
    var121 = var120.first();
    while ( NIL != var120)
    {
      final SubLObject var122 = f52553( var121 );
      f52430( var24, module0048.f_1X( var25 ) );
      if( var119.numL( $g6508$.getGlobalValue() ) )
      {
        streams_high.write_string( (SubLObject) $ic243$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      PrintLow.format( var24, (SubLObject) $ic244$, var119, var122 );
      var119 = Numbers.add( var119, (SubLObject) ONE_INTEGER );
      var120 = var120.rest();
      var121 = var120.first();
    }
    var119 = (SubLObject) TWO_INTEGER;
    var120 = var117;
    var121 = (SubLObject) NIL;
    var121 = var120.first();
    while ( NIL != var120)
    {
      final SubLObject var122 = f52553( var121 );
      f52430( var24, module0048.f_1X( var25 ) );
      if( var119.numL( $g6508$.getGlobalValue() ) )
      {
        streams_high.write_string( (SubLObject) $ic243$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      PrintLow.format( var24, (SubLObject) $ic245$, var119, var122 );
      var119 = Numbers.add( var119, (SubLObject) ONE_INTEGER );
      var120 = var120.rest();
      var121 = var120.first();
    }
    SubLObject var123 = var117;
    SubLObject var124 = (SubLObject) NIL;
    var124 = var123.first();
    while ( NIL != var123)
    {
      final SubLObject var125 = f52553( var124 );
      f52430( var24, module0048.f_1X( var25 ) );
      PrintLow.format( var24, (SubLObject) $ic246$, var125 );
      var123 = var123.rest();
      var124 = var123.first();
    }
    f52430( var24, module0048.f_1X( var25 ) );
    PrintLow.format( var24, (SubLObject) $ic247$ );
    f52554( var113, var24, module0048.f_1X( var25 ) );
    PrintLow.format( var24, (SubLObject) $ic248$ );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52555(final SubLObject var269)
  {
    final SubLObject var270 = module0813.f52099( var269 );
    final SubLObject var271 = module0818.f52402( var270 );
    return Sequences.cconcatenate( (SubLObject) $ic250$, new SubLObject[] { module0006.f203( var271 ), $ic251$
    } );
  }

  public static SubLObject f52552(final SubLObject var269)
  {
    final SubLThread var270 = SubLProcess.currentSubLThread();
    final SubLObject var271 = module0034.$g879$.getDynamicValue( var270 );
    SubLObject var272 = (SubLObject) NIL;
    if( NIL == var271 )
    {
      return f52555( var269 );
    }
    var272 = module0034.f1857( var271, (SubLObject) $ic249$, (SubLObject) UNPROVIDED );
    if( NIL == var272 )
    {
      var272 = module0034.f1807( module0034.f1842( var271 ), (SubLObject) $ic249$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var271, (SubLObject) $ic249$, var272 );
    }
    SubLObject var273 = module0034.f1814( var272, var269, (SubLObject) $ic86$ );
    if( var273 == $ic86$ )
    {
      var273 = Values.arg2( var270.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52555( var269 ) ) );
      module0034.f1816( var272, var269, var273, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var273 );
  }

  public static SubLObject f52556(final SubLObject var267)
  {
    final SubLObject var268 = module0818.f52401( var267 );
    return Sequences.cconcatenate( (SubLObject) $ic250$, module0006.f203( var268 ) );
  }

  public static SubLObject f52553(final SubLObject var267)
  {
    final SubLThread var268 = SubLProcess.currentSubLThread();
    final SubLObject var269 = module0034.$g879$.getDynamicValue( var268 );
    SubLObject var270 = (SubLObject) NIL;
    if( NIL == var269 )
    {
      return f52556( var267 );
    }
    var270 = module0034.f1857( var269, (SubLObject) $ic252$, (SubLObject) UNPROVIDED );
    if( NIL == var270 )
    {
      var270 = module0034.f1807( module0034.f1842( var269 ), (SubLObject) $ic252$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var269, (SubLObject) $ic252$, var270 );
    }
    SubLObject var271 = module0034.f1814( var270, var267, (SubLObject) $ic86$ );
    if( var271 == $ic86$ )
    {
      var271 = Values.arg2( var268.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52556( var267 ) ) );
      module0034.f1816( var270, var267, var271, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var271 );
  }

  public static SubLObject f52554(final SubLObject var258, final SubLObject var24, final SubLObject var25)
  {
    final SubLObject var259 = cdestructuring_bind.property_list_member( (SubLObject) $ic239$, var258 );
    final SubLObject var260 = (SubLObject) ( ( NIL != var259 ) ? conses_high.cadr( var259 ) : NIL );
    final SubLObject var261 = cdestructuring_bind.property_list_member( (SubLObject) $ic253$, var258 );
    final SubLObject var262 = (SubLObject) ( ( NIL != var261 ) ? conses_high.cadr( var261 ) : NIL );
    final SubLObject var263 = cdestructuring_bind.property_list_member( (SubLObject) $ic240$, var258 );
    final SubLObject var264 = (SubLObject) ( ( NIL != var263 ) ? conses_high.cadr( var263 ) : NIL );
    final SubLObject var265 = cdestructuring_bind.property_list_member( (SubLObject) $ic254$, var258 );
    final SubLObject var266 = (SubLObject) ( ( NIL != var265 ) ? conses_high.cadr( var265 ) : NIL );
    final SubLObject var267 = cdestructuring_bind.property_list_member( (SubLObject) $ic255$, var258 );
    final SubLObject var268 = (SubLObject) ( ( NIL != var267 ) ? conses_high.cadr( var267 ) : NIL );
    final SubLObject var269 = cdestructuring_bind.property_list_member( (SubLObject) $ic256$, var258 );
    final SubLObject var270 = (SubLObject) ( ( NIL != var269 ) ? conses_high.cadr( var269 ) : NIL );
    final SubLObject var271 = cdestructuring_bind.property_list_member( (SubLObject) $ic257$, var258 );
    final SubLObject var272 = (SubLObject) ( ( NIL != var271 ) ? conses_high.cadr( var271 ) : $ic258$ );
    final SubLObject var273 = f52552( var260 );
    final SubLObject var274 = (SubLObject) ConsesLow.listS( (SubLObject) $ic259$, (SubLObject) ConsesLow.list( (SubLObject) $ic260$, var273 ), (SubLObject) $ic261$ );
    final SubLObject var275 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var260 ) );
    final SubLObject var276 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var262 ) );
    final SubLObject var277 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var264 ) );
    final SubLObject var278 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var266 ) );
    final SubLObject var279 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var268 ) );
    final SubLObject var280 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var270 ) );
    final SubLObject var281 = module0811.f51788( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var272 ) );
    SubLObject var282 = (SubLObject) NIL;
    SubLObject var283 = var264;
    SubLObject var284 = (SubLObject) NIL;
    var284 = var283.first();
    while ( NIL != var283)
    {
      final SubLObject var285 = f52553( var284 );
      var282 = (SubLObject) ConsesLow.cons( var285, var282 );
      var283 = var283.rest();
      var284 = var283.first();
    }
    var282 = Sequences.nreverse( var282 );
    final SubLObject var286 = (SubLObject) ConsesLow.list( (SubLObject) $ic137$, (SubLObject) $ic262$, var282 );
    final SubLObject var287 = (SubLObject) ConsesLow.list( new SubLObject[] { $ic263$, var274, var275, var276, var277, var278, var286, var279, var280, var281
    } );
    f52430( var24, var25 );
    f52432( var287, var24, var25 );
    return (SubLObject) T;
  }

  public static SubLObject f52557(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic264$ );
    var111 = var110.first();
    SubLObject var116 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic264$ );
    var112 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic264$ );
    var113 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic264$ );
    var114 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic264$ );
    var115 = var116.first();
    var116 = var116.rest();
    if( NIL == var116 )
    {
      module0035.f2502( var111, (SubLObject) $ic265$ );
      final SubLObject var117 = f52552( var115 );
      final SubLObject var118 = (SubLObject) ConsesLow.list( (SubLObject) $ic266$, var117 );
      return f52432( var118, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic264$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52558(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic267$ );
    var111 = var110.first();
    SubLObject var116 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic267$ );
    var112 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic267$ );
    var113 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic267$ );
    var114 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic267$ );
    var115 = var116.first();
    var116 = var116.rest();
    if( NIL == var116 )
    {
      module0035.f2502( var111, (SubLObject) $ic268$ );
      final SubLObject var117 = f52552( var114 );
      final SubLObject var118 = f52553( var115 );
      final SubLObject var119 = (SubLObject) ( var113.numL( (SubLObject) $ic269$ ) ? ConsesLow.list( (SubLObject) $ic161$, var112, Sequences.cconcatenate( (SubLObject) $ic270$, module0038
          .f2624( var113 ) ) ) : ConsesLow.list( (SubLObject) $ic259$, (SubLObject) ConsesLow.list( (SubLObject) $ic156$, var117, var112 ), var118 ) );
      return f52432( var119, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic267$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52559(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic271$ );
    var111 = var110.first();
    SubLObject var116 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic271$ );
    var112 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic271$ );
    var113 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic271$ );
    var114 = var116.first();
    var116 = var116.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var116, var110, (SubLObject) $ic271$ );
    var115 = var116.first();
    var116 = var116.rest();
    if( NIL == var116 )
    {
      module0035.f2502( var111, (SubLObject) $ic272$ );
      final SubLObject var117 = f52552( var115 );
      final SubLObject var118 = (SubLObject) ConsesLow.listS( (SubLObject) $ic12$, (SubLObject) ConsesLow.listS( (SubLObject) $ic273$, (SubLObject) ConsesLow.listS( (SubLObject) $ic161$,
          var112, (SubLObject) $ic274$ ), (SubLObject) ConsesLow.listS( (SubLObject) $ic259$, (SubLObject) ConsesLow.list( (SubLObject) $ic260$, var117 ),
              (SubLObject) $ic261$ ), (SubLObject) $ic275$ ), (SubLObject) $ic276$ );
      return f52432( var118, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic271$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52560(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic277$ );
    var111 = var110.first();
    SubLObject var117 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic277$ );
    var112 = var117.first();
    var117 = var117.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic277$ );
    var113 = var117.first();
    var117 = var117.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic277$ );
    var114 = var117.first();
    var117 = var117.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic277$ );
    var115 = var117.first();
    var117 = var117.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic277$ );
    var116 = var117.first();
    var117 = var117.rest();
    if( NIL == var117 )
    {
      module0035.f2502( var111, (SubLObject) $ic278$ );
      final SubLObject var118 = f52552( var115 );
      final SubLObject var119 = f52553( var116 );
      final SubLObject var120 = (SubLObject) ( var113.numL( (SubLObject) $ic269$ ) ? ConsesLow.list( (SubLObject) $ic161$, var112, Sequences.cconcatenate( (SubLObject) $ic279$, module0038
          .f2624( var113 ) ), var114 )
          : ConsesLow.list( (SubLObject) $ic280$, (SubLObject) ConsesLow.list( (SubLObject) $ic259$, (SubLObject) ConsesLow.list( (SubLObject) $ic156$, var118, var112 ), var119 ),
              var114 ) );
      return f52432( var120, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic277$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52561(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLObject var111 = var110.first();
    module0035.f2502( var111, (SubLObject) $ic281$ );
    return f52524( var110, var24, var25 );
  }

  public static SubLObject f52562(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic282$ );
    var111 = var110.first();
    SubLObject var115 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic282$ );
    var112 = var115.first();
    var115 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic282$ );
    var113 = var115.first();
    var115 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic282$ );
    var114 = var115.first();
    var115 = var115.rest();
    if( NIL == var115 )
    {
      module0035.f2502( var111, (SubLObject) $ic12$ );
      var113 = (SubLObject) ConsesLow.list( (SubLObject) $ic156$, $g6507$.getGlobalValue(), var113 );
      streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var112, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic283$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var113, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic284$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var114, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic282$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52563(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic285$ );
    var111 = var110.first();
    final SubLObject var113;
    final SubLObject var112 = var113 = var110.rest();
    module0035.f2502( var111, (SubLObject) $ic286$ );
    if( NIL == var113 )
    {
      return f52511( (SubLObject) $ic287$, var24, var25 );
    }
    SubLObject var318_319;
    final SubLObject var316_317 = var318_319 = var113;
    SubLObject var114 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var318_319, var316_317, (SubLObject) $ic288$ );
    var114 = var318_319.first();
    final SubLObject var115;
    var318_319 = ( var115 = var318_319.rest() );
    SubLObject var324_325;
    final SubLObject var322_323 = var324_325 = var114;
    SubLObject var116 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var324_325, var322_323, (SubLObject) $ic289$ );
    var116 = var324_325.first();
    final SubLObject var117;
    var324_325 = ( var117 = var324_325.rest() );
    streams_high.write_string( (SubLObject) $ic290$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52432( var116, var24, module0048.f_1X( var25 ) );
    streams_high.write_string( (SubLObject) $ic291$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var117, (SubLObject) NIL ) ), var24, var25 );
    SubLObject var118 = var115;
    SubLObject var119 = (SubLObject) NIL;
    var119 = var118.first();
    while ( NIL != var118)
    {
      SubLObject var331_332;
      final SubLObject var329_330 = var331_332 = var119;
      SubLObject var326_333 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var331_332, var329_330, (SubLObject) $ic289$ );
      var326_333 = var331_332.first();
      final SubLObject var327_334;
      var331_332 = ( var327_334 = var331_332.rest() );
      if( var326_333.equal( (SubLObject) $ic292$ ) )
      {
        if( NIL != var327_334 )
        {
          streams_high.write_string( (SubLObject) $ic293$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var327_334, (SubLObject) NIL ) ), var24, var25 );
        }
      }
      else
      {
        streams_high.write_string( (SubLObject) $ic294$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var326_333, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic291$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var327_334, (SubLObject) NIL ) ), var24, var25 );
      }
      var118 = var118.rest();
      var119 = var118.first();
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52564(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic295$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic295$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic296$ );
      streams_high.write_string( (SubLObject) $ic297$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var112, var24, var25 );
      streams_high.write_string( (SubLObject) $ic298$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var24 );
      f52430( var24, var25 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic295$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52511(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic299$ );
    var111 = var110.first();
    final SubLObject var113;
    final SubLObject var112 = var113 = var110.rest();
    module0035.f2502( var111, (SubLObject) $ic3$ );
    streams_high.write_string( (SubLObject) $ic81$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var114 = var113;
    SubLObject var115 = (SubLObject) NIL;
    var115 = var114.first();
    while ( NIL != var114)
    {
      f52467( var115, var24, module0048.f_1X( var25 ) );
      var114 = var114.rest();
      var115 = var114.first();
    }
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52565(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic300$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic300$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic300$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic224$ );
      f52431( var24, var25, var112, var113 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic300$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52566(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic301$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic301$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL != var113 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic301$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var111, (SubLObject) $ic302$ );
    if( NIL != f52424() )
    {
      streams_high.write_string( (SubLObject) $ic81$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      final SubLObject var114 = module0048.f_1X( var25 );
      streams_high.terpri( var24 );
      f52430( var24, var114 );
      streams_high.write_string( (SubLObject) $ic303$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var112, var24, module0048.f_1X( var114 ) );
      streams_high.write_string( (SubLObject) $ic105$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52433( var24, var114, (SubLObject) $ic304$ );
      streams_high.terpri( var24 );
      f52430( var24, var114 );
      streams_high.write_string( (SubLObject) $ic305$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var24 );
      f52430( var24, var25 );
      streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      return (SubLObject) NIL;
    }
    streams_high.write_string( (SubLObject) $ic306$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52432( var112, var24, module0048.f_1X( var25 ) );
    return (SubLObject) T;
  }

  public static SubLObject f52567(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic307$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic307$ );
    var112 = var113.first();
    final SubLObject var114;
    var113 = ( var114 = var113.rest() );
    module0035.f2502( var111, (SubLObject) $ic177$ );
    streams_high.write_string( (SubLObject) $ic308$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52432( var112, var24, module0048.f_1X( var25 ) );
    streams_high.write_string( (SubLObject) $ic291$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var114, (SubLObject) NIL ) ), var24, var25 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52568(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic309$ );
    var111 = var110.first();
    final SubLObject var113;
    final SubLObject var112 = var113 = var110.rest();
    module0035.f2502( var111, (SubLObject) $ic310$ );
    if( NIL == var113 )
    {
      f52569( (SubLObject) $ic292$, var24, module0048.f_1X( var25 ) );
    }
    else if( NIL != module0035.f1997( var113 ) )
    {
      f52432( var113.first(), var24, module0048.f_1X( var25 ) );
    }
    else
    {
      streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var113.first(), var24, module0048.f_1X( var25 ) );
      SubLObject var114 = var113.rest();
      SubLObject var115 = (SubLObject) NIL;
      var115 = var114.first();
      while ( NIL != var114)
      {
        streams_high.terpri( var24 );
        f52430( var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic311$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var115, var24, module0048.f_1X( var25 ) );
        var114 = var114.rest();
        var115 = var114.first();
      }
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52570(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic312$ );
    var111 = var110.first();
    SubLObject var112 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic312$ );
    final SubLObject var113 = var112.rest();
    var112 = var112.first();
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = (SubLObject) NIL;
    SubLObject var118 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic312$ );
    var114 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic312$ );
    var115 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic312$ );
    var116 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic312$ );
    var117 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic312$ );
    var118 = var112.first();
    var112 = var112.rest();
    if( NIL == var112 )
    {
      final SubLObject var119;
      var112 = ( var119 = var113 );
      module0035.f2502( var111, (SubLObject) $ic313$ );
      return f52511( (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic174$, var117, (SubLObject) ConsesLow.list( (SubLObject) $ic314$,
          var116 ), (SubLObject) $ic176$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic164$, (SubLObject) ConsesLow.listS( (SubLObject) $ic177$, (SubLObject) ConsesLow.list(
              (SubLObject) $ic315$, var117 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic174$, var118, (SubLObject) ConsesLow.list( (SubLObject) $ic316$, var117 ),
                  (SubLObject) $ic317$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic167$, var114, (SubLObject) ConsesLow.list( (SubLObject) $ic318$, var118 ) ), (SubLObject) ConsesLow
                      .list( (SubLObject) $ic167$, var115, (SubLObject) ConsesLow.list( (SubLObject) $ic319$, var118 ) ), ConsesLow.append( var119, (SubLObject) NIL ) ),
              (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic320$, var117 ) ) ), var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic312$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52571(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic321$ );
    var111 = var110.first();
    final SubLObject var112 = var110.rest();
    if( NIL == var112 )
    {
      module0035.f2502( var111, (SubLObject) $ic322$ );
      streams_high.write_string( (SubLObject) $ic323$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic321$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52572(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic324$ );
    var111 = var110.first();
    SubLObject var112 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic324$ );
    final SubLObject var113 = var112.rest();
    var112 = var112.first();
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic324$ );
    var114 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic324$ );
    var115 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var110, (SubLObject) $ic324$ );
    var116 = var112.first();
    var112 = var112.rest();
    if( NIL == var112 )
    {
      final SubLObject var117;
      var112 = ( var117 = var113 );
      module0035.f2502( var111, (SubLObject) $ic325$ );
      streams_high.write_string( (SubLObject) $ic326$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL != var114 )
      {
        SubLObject var367_368;
        final SubLObject var365_366 = var367_368 = var114;
        SubLObject var118 = (SubLObject) NIL;
        SubLObject var119 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var367_368, var365_366, (SubLObject) $ic327$ );
        var118 = var367_368.first();
        var367_368 = ( var119 = var367_368.rest() );
        f52432( var118, var24, module0048.f_1X( var25 ) );
        SubLObject var120 = var119;
        SubLObject var121 = (SubLObject) NIL;
        var121 = var120.first();
        while ( NIL != var120)
        {
          f52491( var24 );
          f52432( var121, var24, module0048.f_1X( var25 ) );
          var120 = var120.rest();
          var121 = var120.first();
        }
      }
      streams_high.write_string( (SubLObject) $ic328$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var115, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic328$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL != var116 )
      {
        SubLObject var374_375;
        final SubLObject var372_373 = var374_375 = var116;
        SubLObject var122 = (SubLObject) NIL;
        SubLObject var123 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var374_375, var372_373, (SubLObject) $ic329$ );
        var122 = var374_375.first();
        var374_375 = ( var123 = var374_375.rest() );
        f52432( var122, var24, module0048.f_1X( var25 ) );
        SubLObject var120 = var123;
        SubLObject var124 = (SubLObject) NIL;
        var124 = var120.first();
        while ( NIL != var120)
        {
          f52491( var24 );
          f52432( var124, var24, module0048.f_1X( var25 ) );
          var120 = var120.rest();
          var124 = var120.first();
        }
      }
      streams_high.write_string( (SubLObject) $ic291$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var117, (SubLObject) NIL ) ), var24, var25 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic324$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52573(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic330$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic330$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic330$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic155$ );
      f52574( var112, var113, var24 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic330$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52575(final SubLObject var383, SubLObject var384)
  {
    if( var384 == UNPROVIDED )
    {
      var384 = (SubLObject) $ic331$;
    }
    SubLObject var385 = (SubLObject) ZERO_INTEGER;
    SubLObject var386 = (SubLObject) NIL;
    SubLObject var387 = (SubLObject) NIL;
    SubLObject var388 = (SubLObject) NIL;
    try
    {
      var388 = streams_high.make_private_string_output_stream();
      final SubLObject var389 = Sequences.length( var383 );
      if( NIL == var386 )
      {
        SubLObject var390_391;
        SubLObject var390;
        SubLObject var391;
        for( var390_391 = var389, var390 = (SubLObject) NIL, var390 = (SubLObject) ZERO_INTEGER; NIL == var386 && !var390.numGE( var390_391 ); var386 = Numbers.numG( var385,
            var384 ), var390 = module0048.f_1X( var390 ) )
        {
          var391 = Strings.sublisp_char( var383, var390 );
          if( NIL != module0039.f3009( var391 ) && NIL != Characters.alphanumericp( var391 ) )
          {
            streams_high.write_char( var391, var388 );
          }
          else
          {
            streams_high.write_char( (SubLObject) Characters.CHAR_underbar, var388 );
          }
          var385 = Numbers.add( var385, (SubLObject) ONE_INTEGER );
        }
      }
      var387 = streams_high.get_output_stream_string( var388 );
    }
    finally
    {
      final SubLObject var392 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, (SubLObject) T );
        streams_high.close( var388, (SubLObject) UNPROVIDED );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, var392 );
      }
    }
    return var387;
  }

  public static SubLObject f52574(final SubLObject var381, final SubLObject var382, final SubLObject var24)
  {
    if( NIL != module0813.f52033() )
    {
      PrintLow.format( var24, (SubLObject) $ic332$, var381 );
      return (SubLObject) NIL;
    }
    SubLObject var383 = (SubLObject) $ic333$;
    if( var382.isString() )
    {
      streams_high.write_string( (SubLObject) $ic334$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      var383 = Sequences.cconcatenate( (SubLObject) $ic250$, f52575( var382, (SubLObject) UNPROVIDED ) );
    }
    else if( var382.isKeyword() )
    {
      streams_high.write_string( (SubLObject) $ic335$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      var383 = Sequences.cconcatenate( (SubLObject) $ic250$, f52575( Symbols.symbol_name( var382 ), (SubLObject) $ic336$ ) );
    }
    else if( var382.isSymbol() )
    {
      streams_high.write_string( (SubLObject) $ic337$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      var383 = Sequences.cconcatenate( (SubLObject) $ic250$, f52575( Symbols.symbol_name( var382 ), (SubLObject) $ic336$ ) );
    }
    else if( var382.isInteger() )
    {
      streams_high.write_string( (SubLObject) $ic338$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      var383 = Sequences.cconcatenate( (SubLObject) $ic250$, f52575( module0038.f2624( var382 ), (SubLObject) UNPROVIDED ) );
    }
    else if( var382.isDouble() )
    {
      streams_high.write_string( (SubLObject) $ic339$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      final SubLObject var384 = module0038.f2624( var382 );
      final SubLObject var385 = Strings.string_downcase( Sequences.remove( (SubLObject) Characters.CHAR_plus, var384, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
          (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      var383 = Sequences.cconcatenate( (SubLObject) $ic250$, f52575( var385, (SubLObject) UNPROVIDED ) );
    }
    else if( var382.isList() )
    {
      streams_high.write_string( (SubLObject) $ic340$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else if( var382.isChar() )
    {
      streams_high.write_string( (SubLObject) $ic341$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      var383 = Sequences.cconcatenate( (SubLObject) $ic250$, f52575( module0038.f2624( var382 ), (SubLObject) UNPROVIDED ) );
    }
    else if( NIL != constant_handles_oc.f8449( var382 ) )
    {
      streams_high.write_string( (SubLObject) $ic342$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      var383 = Sequences.cconcatenate( (SubLObject) $ic250$, f52575( constants_high_oc.f10743( var382 ), (SubLObject) UNPROVIDED ) );
    }
    else
    {
      streams_high.write_string( (SubLObject) $ic343$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    f52477( var381, var24 );
    streams_high.write_string( var383, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52576(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic344$ );
    var111 = var110.first();
    SubLObject var115 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic344$ );
    var112 = var115.first();
    var115 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic344$ );
    var113 = var115.first();
    var115 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic344$ );
    var114 = var115.first();
    var115 = var115.rest();
    if( NIL == var115 )
    {
      module0035.f2502( var111, (SubLObject) $ic98$ );
      final SubLObject var116 = f52577( var112, var114 );
      final SubLObject var117 = f52578( var116 );
      streams_high.write_string( (SubLObject) $ic345$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var117, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52574( var112, var113, var24 );
      f52518( var24 );
      f52432( var116, var24, module0048.f_1X( var25 ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic344$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52578(final SubLObject var399)
  {
    SubLObject var400 = (SubLObject) NIL;
    SubLObject var401 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var399, var399, (SubLObject) $ic346$ );
    var400 = var399.first();
    final SubLObject var402 = var401 = var399.rest();
    if( NIL != module0035.f2169( var400, (SubLObject) $ic347$ ) )
    {
      return (SubLObject) $ic348$;
    }
    if( var400 != $ic129$ )
    {
      return (SubLObject) $ic138$;
    }
    SubLObject var405_406;
    final SubLObject var403_404 = var405_406 = var401;
    SubLObject var403 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var405_406, var403_404, (SubLObject) $ic349$ );
    var403 = var405_406.first();
    var405_406 = var405_406.rest();
    if( NIL != var405_406 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var403_404, (SubLObject) $ic349$ );
      return (SubLObject) NIL;
    }
    if( var403.isString() )
    {
      return (SubLObject) $ic350$;
    }
    if( var403.isSymbol() )
    {
      return (SubLObject) $ic157$;
    }
    if( var403.isInteger() )
    {
      return (SubLObject) $ic351$;
    }
    if( var403.isDouble() )
    {
      return (SubLObject) $ic352$;
    }
    if( var403.isChar() )
    {
      return (SubLObject) $ic353$;
    }
    if( var403.isPackage() )
    {
      return (SubLObject) $ic354$;
    }
    return (SubLObject) $ic138$;
  }

  public static SubLObject f52577(final SubLObject var381, final SubLObject var399)
  {
    final SubLObject var400 = module0035.f2422( var399 );
    if( var400.numG( $g6509$.getGlobalValue() ) )
    {
      final SubLObject var401 = Sequences.cconcatenate( (SubLObject) $ic356$, new SubLObject[] { module0006.f205( var381 ), $ic357$
      } );
      final SubLObject var402 = Symbols.make_symbol( var401 );
      final SubLObject var403 = (SubLObject) ConsesLow.list( (SubLObject) $ic97$, var402, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic302$, var399 ) );
      f52463( var403 );
      return (SubLObject) ConsesLow.list( var402 );
    }
    return var399;
  }

  public static SubLObject f52579(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic358$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic358$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic129$ );
      SubLObject var114 = (SubLObject) NIL;
      if( var112.isString() )
      {
        var114 = (SubLObject) ConsesLow.list( (SubLObject) $ic359$, var112 );
      }
      else if( var112.isSymbol() )
      {
        var114 = f52580( var112 );
      }
      else if( NIL != f52581( var112 ) )
      {
        var114 = (SubLObject) ConsesLow.list( (SubLObject) $ic360$, var112 );
      }
      else if( var112.isBignum() )
      {
        var114 = (SubLObject) ConsesLow.list( (SubLObject) $ic361$, print_high.princ_to_string( var112 ) );
      }
      else if( var112.isDouble() )
      {
        var114 = (SubLObject) ConsesLow.list( (SubLObject) $ic362$, var112 );
      }
      else if( var112.isChar() )
      {
        var114 = (SubLObject) ConsesLow.list( (SubLObject) $ic363$, Characters.char_code( var112 ) );
      }
      else if( var112.isPackage() )
      {
        var114 = (SubLObject) ConsesLow.list( (SubLObject) $ic364$, Packages.package_name( var112 ) );
      }
      else if( NIL != Guids.guid_p( var112 ) )
      {
        var114 = (SubLObject) ConsesLow.list( (SubLObject) $ic365$, Guids.guid_to_string( var112 ) );
      }
      else
      {
        Errors.error( (SubLObject) $ic366$, var112 );
      }
      f52432( var114, var24, var25 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic358$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52581(final SubLObject var105)
  {
    return (SubLObject) makeBoolean( var105.isInteger() && var105.numLE( $g6510$.getGlobalValue() ) && $g6511$.getGlobalValue().numLE( var105 ) );
  }

  public static SubLObject f52580(final SubLObject var412)
  {
    return module0816.f52342( var412 );
  }

  public static SubLObject f52582(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic368$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic368$ );
    var112 = var113.first();
    var113 = var113.rest();
    final SubLObject var114 = (SubLObject) ( var113.isCons() ? var113.first() : NIL );
    final SubLObject var115 = Types.consp( var113 );
    cdestructuring_bind.destructuring_bind_must_listp( var113, var110, (SubLObject) $ic368$ );
    var113 = var113.rest();
    final SubLObject var116 = (SubLObject) ( var113.isCons() ? var113.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var113, var110, (SubLObject) $ic368$ );
    var113 = var113.rest();
    final SubLObject var117 = (SubLObject) ( var113.isCons() ? var113.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var113, var110, (SubLObject) $ic368$ );
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic174$ );
      f52483( var112 );
      if( NIL != var117 )
      {
        streams_high.write_string( (SubLObject) $ic232$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      if( NIL != var116 )
      {
        streams_high.write_string( var116, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else
      {
        f52543( var24 );
      }
      streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var112, var24, var25 );
      if( NIL != var115 )
      {
        f52518( var24 );
        f52432( var114, var24, var25 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic368$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52583(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic369$ );
    var112 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic369$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var112, (SubLObject) $ic370$ );
      return f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic371$, (SubLObject) $ic372$, (SubLObject) ConsesLow.list( (SubLObject) $ic373$, var113 ) ), var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic369$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52569(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic108$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic108$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic374$ );
      final SubLObject var114 = var112;
      if( var114.eql( (SubLObject) $ic375$ ) )
      {
        streams_high.write_string( (SubLObject) $ic376$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else if( var114.eql( (SubLObject) $ic377$ ) )
      {
        streams_high.write_string( (SubLObject) $ic378$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else if( var114.eql( (SubLObject) $ic379$ ) )
      {
        streams_high.write_string( (SubLObject) $ic380$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else if( var114.eql( (SubLObject) $ic381$ ) )
      {
        f52492( var24 );
      }
      else if( var114.eql( (SubLObject) $ic382$ ) )
      {
        streams_high.write_string( (SubLObject) $ic383$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else
      {
        Errors.error( (SubLObject) $ic384$, var112 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic108$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52584(SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    module0035.f2503( var110, (SubLObject) $ic385$ );
    var110 = f52585( var110 );
    if( NIL == module0035.f2501( var110, (SubLObject) $ic385$ ) )
    {
      return f52432( var110, var24, var25 );
    }
    SubLObject var112;
    final SubLObject var111 = var112 = var110;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var112, var111, (SubLObject) $ic369$ );
    var113 = var112.first();
    var112 = var112.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var112, var111, (SubLObject) $ic369$ );
    var114 = var112.first();
    var112 = var112.rest();
    if( NIL == var112 )
    {
      module0035.f2502( var113, (SubLObject) $ic385$ );
      streams_high.write_string( (SubLObject) $ic386$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var114, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic387$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      return (SubLObject) NIL;
    }
    cdestructuring_bind.cdestructuring_bind_error( var111, (SubLObject) $ic369$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52585(final SubLObject var110)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic369$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic369$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL != var113 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic369$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var111, (SubLObject) $ic385$ );
    if( NIL != module0035.f2501( var112, (SubLObject) $ic388$ ) )
    {
      var112 = f52469( var112 );
      if( NIL == module0035.f2501( var112, (SubLObject) $ic388$ ) )
      {
        return f52585( (SubLObject) ConsesLow.list( (SubLObject) $ic385$, var112 ) );
      }
      final SubLObject var114 = conses_high.second( var112 );
      if( var114.isCons() && NIL != module0035.f2501( var114, (SubLObject) EQ ) )
      {
        final SubLObject var115 = var114.rest();
        return reader.bq_cons( (SubLObject) $ic151$, ConsesLow.append( var115, (SubLObject) NIL ) );
      }
      return (SubLObject) ConsesLow.list( (SubLObject) $ic273$, (SubLObject) $ic152$, var114 );
    }
    else
    {
      if( NIL != module0035.f2501( var112, (SubLObject) $ic385$ ) )
      {
        final SubLObject var116 = conses_high.second( var112 );
        return var116;
      }
      if( NIL != module0035.f2501( var112, (SubLObject) $ic273$ ) )
      {
        final SubLObject var117 = var112.rest();
        return reader.bq_cons( (SubLObject) $ic151$, ConsesLow.append( var117, (SubLObject) NIL ) );
      }
      if( NIL != module0035.f2501( var112, (SubLObject) $ic151$ ) )
      {
        final SubLObject var117 = var112.rest();
        return reader.bq_cons( (SubLObject) $ic273$, ConsesLow.append( var117, (SubLObject) NIL ) );
      }
      return var110;
    }
  }

  public static SubLObject f52586(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic389$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic389$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic389$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic390$ );
      return f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic391$, (SubLObject) ConsesLow.list( (SubLObject) $ic392$, var112 ), var113 ), var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic389$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52587(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic309$ );
    var111 = var110.first();
    final SubLObject var113;
    final SubLObject var112 = var113 = var110.rest();
    module0035.f2502( var111, (SubLObject) $ic393$ );
    if( NIL == var113 )
    {
      f52569( (SubLObject) $ic394$, var24, module0048.f_1X( var25 ) );
    }
    else if( NIL != module0035.f1997( var113 ) )
    {
      f52432( var113.first(), var24, module0048.f_1X( var25 ) );
    }
    else
    {
      streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var113.first(), var24, module0048.f_1X( var25 ) );
      SubLObject var114 = var113.rest();
      SubLObject var115 = (SubLObject) NIL;
      var115 = var114.first();
      while ( NIL != var114)
      {
        streams_high.terpri( var24 );
        f52430( var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic395$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var115, var24, module0048.f_1X( var25 ) );
        var114 = var114.rest();
        var115 = var114.first();
      }
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52588(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic396$ );
    var112 = var110.first();
    SubLObject var117 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic396$ );
    var113 = var117.first();
    var117 = var117.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic396$ );
    var114 = var117.first();
    var117 = var117.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic396$ );
    var115 = var117.first();
    var117 = var117.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var117, var110, (SubLObject) $ic396$ );
    var116 = var117.first();
    var117 = var117.rest();
    if( NIL == var117 )
    {
      final SubLObject var118 = module0813.f52099( var113 );
      module0035.f2502( var112, (SubLObject) $ic397$ );
      streams_high.write_string( (SubLObject) $ic398$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic399$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52546( var24 );
      f52432( module0818.f52404( var113 ), var24, module0048.f_1X( var25 ) );
      f52546( var24 );
      f52432( var118, var24, module0048.f_1X( var25 ) );
      f52546( var24 );
      f52432( var114, var24, module0048.f_1X( var25 ) );
      f52546( var24 );
      f52432( var115, var24, module0048.f_1X( var25 ) );
      f52546( var24 );
      f52569( (SubLObject) ( ( NIL != var116 ) ? $ic292$ : $ic394$ ), var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL != $g6506$.getDynamicValue( var111 ) )
      {
        if( NIL != f52534( var113 ) )
        {
          f52589( var113, var24 );
        }
        if( NIL != f52536( var113 ) )
        {
          f52590( var113, var24 );
        }
        if( NIL != f52538( var113 ) )
        {
          f52591( var113, var24 );
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic396$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52592(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    SubLObject var114 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic400$ );
    var111 = var110.first();
    SubLObject var115 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic400$ );
    var112 = var115.first();
    var115 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic400$ );
    var113 = var115.first();
    var115 = var115.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var115, var110, (SubLObject) $ic400$ );
    var114 = var115.first();
    var115 = var115.rest();
    if( NIL == var115 )
    {
      final SubLObject var116 = module0813.f52099( var113 );
      module0035.f2502( var111, (SubLObject) $ic401$ );
      f52432( var113, var24, module0048.f_1X( var25 ) );
      f52518( var24 );
      f52593( var112, var24 );
      streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var116, var24, module0048.f_1X( var25 ) );
      f52546( var24 );
      f52432( var114, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic400$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52593(final SubLObject var436, final SubLObject var24)
  {
    if( var436 == $ic281$ )
    {
      streams_high.write_string( (SubLObject) $ic402$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else if( var436 == $ic236$ )
    {
      streams_high.write_string( (SubLObject) $ic403$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else if( var436 == $ic235$ )
    {
      streams_high.write_string( (SubLObject) $ic404$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else if( var436 == $ic213$ )
    {
      streams_high.write_string( (SubLObject) $ic405$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      Errors.error( (SubLObject) $ic406$, var436 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52594(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic407$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic407$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      final SubLObject var114 = module0813.f52099( var112 );
      module0035.f2502( var111, (SubLObject) $ic408$ );
      streams_high.write_string( (SubLObject) $ic409$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic399$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52546( var24 );
      f52432( module0818.f52404( var112 ), var24, module0048.f_1X( var25 ) );
      f52546( var24 );
      f52432( var114, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic407$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52501()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return $g6512$.getDynamicValue( var1 );
  }

  public static SubLObject f52503(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic410$ );
    var112 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic410$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var112, (SubLObject) $ic171$ );
    final SubLObject var116 = (SubLObject) ConsesLow.listS( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic174$, var113, (SubLObject) $ic411$ ), ConsesLow.append(
        var115, (SubLObject) NIL ) );
    SubLObject var117 = (SubLObject) NIL;
    final SubLObject var118 = $g6512$.currentBinding( var111 );
    try
    {
      $g6512$.bind( var113, var111 );
      var117 = f52432( var116, var24, var25 );
    }
    finally
    {
      $g6512$.rebind( var118, var111 );
    }
    return var117;
  }

  public static SubLObject f52595(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic412$ );
    var112 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic412$ );
    final SubLObject var114 = var113.rest();
    var113 = var113.first();
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic412$ );
    var115 = var113.first();
    var113 = var113.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic412$ );
    var116 = var113.first();
    var113 = var113.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic412$ );
    var117 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      final SubLObject var118;
      var113 = ( var118 = var114 );
      module0035.f2502( var112, (SubLObject) $ic413$ );
      final SubLObject var119 = (SubLObject) ConsesLow.list( (SubLObject) $ic181$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic414$, var115 ) ), (SubLObject) ConsesLow
          .list( (SubLObject) $ic164$, reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var118, (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list(
              (SubLObject) ConsesLow.list( (SubLObject) $ic166$, var116 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic168$, var116, (SubLObject) $ic415$ ) ) ) ) );
      return f52432( var119, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic412$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52596(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic416$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic416$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic416$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic417$ );
    return f52507( (SubLObject) ConsesLow.listS( (SubLObject) $ic186$, (SubLObject) ConsesLow.list( reader.bq_cons( var112, (SubLObject) $ic418$ ) ), ConsesLow.append( var115, (SubLObject) ConsesLow
        .list( (SubLObject) ConsesLow.list( (SubLObject) $ic167$, var113, (SubLObject) ConsesLow.list( (SubLObject) $ic419$, var112 ) ) ) ) ), var24, var25 );
  }

  public static SubLObject f52597(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic420$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic420$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic420$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic280$ );
      f52432( var112, var24, module0048.f_1X( var25 ) );
      f52518( var24 );
      f52432( var113, var24, module0048.f_1X( var25 ) );
      return (SubLObject) T;
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic420$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52598(final SubLObject var105)
  {
    return (SubLObject) makeBoolean( NIL != module0035.f2501( var105, (SubLObject) $ic155$ ) && NIL != module0035.f1995( var105, (SubLObject) THREE_INTEGER,
        (SubLObject) UNPROVIDED ) && conses_high.third( var105 ).isSymbol() );
  }

  public static SubLObject f52599(final SubLObject var105)
  {
    return (SubLObject) makeBoolean( NIL != module0035.f2501( var105, (SubLObject) $ic109$ ) && NIL != module0035.f1995( var105, (SubLObject) TWO_INTEGER,
        (SubLObject) UNPROVIDED ) && conses_high.second( var105 ).isSymbol() );
  }

  public static SubLObject f52600(final SubLObject var105)
  {
    return (SubLObject) makeBoolean( NIL != module0035.f2501( var105, (SubLObject) $ic129$ ) && NIL != module0035.f1995( var105, (SubLObject) TWO_INTEGER,
        (SubLObject) UNPROVIDED ) && conses_high.second( var105 ).isSymbol() );
  }

  public static SubLObject f52601(final SubLObject var105)
  {
    return (SubLObject) makeBoolean( NIL != module0035.f2501( var105, (SubLObject) $ic374$ ) && NIL != module0035.f1995( var105, (SubLObject) TWO_INTEGER,
        (SubLObject) UNPROVIDED ) );
  }

  public static SubLObject f52602(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic422$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic422$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic422$ );
    var113 = var114.first();
    var114 = var114.rest();
    final SubLObject var115 = (SubLObject) ( var114.isCons() ? var114.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var114, var110, (SubLObject) $ic422$ );
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic273$ );
      if( var112.equal( (SubLObject) $ic152$ ) && var113.equal( (SubLObject) $ic152$ ) )
      {
        f52432( (SubLObject) $ic292$, var24, var25 );
      }
      else if( var112.equal( (SubLObject) $ic152$ ) && ( NIL != module0035.f2501( var113, (SubLObject) $ic109$ ) || NIL != module0035.f2501( var113,
          (SubLObject) $ic155$ ) ) )
      {
        f52432( (SubLObject) $ic394$, var24, var25 );
      }
      else if( var112.equal( (SubLObject) $ic152$ ) && NIL != module0035.f2501( var113, (SubLObject) $ic423$ ) )
      {
        f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic151$, (SubLObject) $ic152$, conses_high.second( var113 ) ), var24, var25 );
      }
      else if( NIL != var115 || NIL == $g6513$.getGlobalValue() || NIL != f52598( var112 ) || NIL != f52598( var113 ) || NIL != f52600( var112 )
          || NIL != f52600( var113 ) || NIL != f52601( var112 ) || NIL != f52601( var113 ) || NIL != f52599( var112 ) || NIL != f52599( var113 ) )
      {
        streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var112, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic424$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var113, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else
      {
        f52432( var112, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic425$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var113, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic422$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52603(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic422$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic422$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic422$ );
    var113 = var114.first();
    var114 = var114.rest();
    final SubLObject var115 = (SubLObject) ( var114.isCons() ? var114.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var114, var110, (SubLObject) $ic422$ );
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic151$ );
      if( var112.equal( (SubLObject) $ic152$ ) && var113.equal( (SubLObject) $ic152$ ) )
      {
        f52432( (SubLObject) $ic394$, var24, var25 );
      }
      else if( var112.equal( (SubLObject) $ic152$ ) && ( NIL != module0035.f2501( var113, (SubLObject) $ic109$ ) || NIL != module0035.f2501( var113,
          (SubLObject) $ic155$ ) ) )
      {
        f52432( (SubLObject) $ic292$, var24, var25 );
      }
      else if( NIL != var115 || NIL == $g6513$.getGlobalValue() || NIL != f52598( var112 ) || NIL != f52598( var113 ) || NIL != f52600( var112 )
          || NIL != f52600( var113 ) || NIL != f52601( var112 ) || NIL != f52601( var113 ) || NIL != f52599( var112 ) || NIL != f52599( var113 ) )
      {
        streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var112, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic426$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var113, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else
      {
        streams_high.write_string( (SubLObject) $ic427$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var112, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic425$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var113, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic422$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52604(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic428$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic428$ );
    var112 = var113.first();
    var113 = var113.rest();
    final SubLObject var114 = (SubLObject) ( var113.isCons() ? var113.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var113, var110, (SubLObject) $ic428$ );
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic227$ );
      streams_high.write_string( (SubLObject) $ic429$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var112, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL != var114 )
      {
        streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        SubLObject var115 = (SubLObject) NIL;
        SubLObject var116 = (SubLObject) NIL;
        SubLObject var117 = (SubLObject) NIL;
        var115 = var114;
        var116 = var115.first();
        for( var117 = (SubLObject) ZERO_INTEGER; NIL != var115; var115 = var115.rest(), var116 = var115.first(), var117 = Numbers.add( (SubLObject) ONE_INTEGER, var117 ) )
        {
          if( !var117.isZero() )
          {
            f52546( var24 );
          }
          SubLObject var466_467;
          final SubLObject var464_465 = var466_467 = var116;
          SubLObject var118 = (SubLObject) NIL;
          SubLObject var119 = (SubLObject) NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var466_467, var464_465, (SubLObject) $ic430$ );
          var118 = var466_467.first();
          var466_467 = var466_467.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var466_467, var464_465, (SubLObject) $ic430$ );
          var119 = var466_467.first();
          var466_467 = var466_467.rest();
          if( NIL == var466_467 )
          {
            streams_high.write_string( var118, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            f52518( var24 );
            f52432( var119, var24, module0048.f_1X( var25 ) );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var464_465, (SubLObject) $ic430$ );
          }
        }
        streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic428$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52605(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic431$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic431$ );
    var112 = var113.first();
    var113 = var113.rest();
    final SubLObject var114 = (SubLObject) ( var113.isCons() ? var113.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var113, var110, (SubLObject) $ic431$ );
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic150$ );
      streams_high.write_string( (SubLObject) $ic432$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var112, var24, module0048.f_1X( var25 ) );
      if( NIL != var114 )
      {
        streams_high.write_string( (SubLObject) $ic284$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var114, var24, module0048.f_1X( var25 ) );
      }
      return (SubLObject) T;
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic431$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52606(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic433$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic433$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic433$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL != var114 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic433$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var111, (SubLObject) $ic184$ );
    final SubLObject var115 = f52501();
    if( NIL != var115 )
    {
      return f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic161$, var112, (SubLObject) $ic434$, var113, var115 ), var24, var25 );
    }
    return f52473( var110, var24, var25 );
  }

  public static SubLObject f52607(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic435$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic435$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic435$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic156$ );
      streams_high.write_string( (SubLObject) $ic436$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var112, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic291$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var113, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic435$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52608(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic437$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic437$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL != var113 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic437$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var111, (SubLObject) $ic183$ );
    final SubLObject var114 = f52501();
    if( NIL != var114 )
    {
      return f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic161$, var112, (SubLObject) $ic438$, var114 ), var24, var25 );
    }
    return f52473( var110, var24, var25 );
  }

  public static SubLObject f52609(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic439$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic439$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic439$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic259$ );
      f52432( var112, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic50$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var113, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic439$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52610(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic440$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic440$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic260$ );
      streams_high.write_string( var112, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic440$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52611(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic441$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic441$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic441$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic442$ );
      return f52563( (SubLObject) ConsesLow.listS( (SubLObject) $ic286$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.listS( (SubLObject) $ic273$, var112, (SubLObject) $ic443$ ),
          (SubLObject) ConsesLow.list( (SubLObject) $ic167$, var112, var113 ) ), (SubLObject) $ic444$ ), var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic441$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52612(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic445$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic445$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic445$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic446$ );
      streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var112, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic447$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var113, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic445$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52613(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic448$ );
    var112 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic448$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var112, (SubLObject) $ic449$ );
      final SubLObject var176_489 = f52501();
      final SubLObject var115 = (SubLObject) ( ( NIL != var176_489 ) ? ConsesLow.list( (SubLObject) $ic161$, var113, (SubLObject) $ic450$, var176_489 )
          : ConsesLow.listS( (SubLObject) $ic161$, var113, (SubLObject) $ic451$ ) );
      return f52432( var115, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic448$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52614(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic448$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic448$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic452$ );
      final SubLObject var114 = (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var112, (SubLObject) $ic453$ );
      return f52432( var114, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic448$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52615(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic454$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic454$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic454$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic203$ );
      final SubLObject var115 = f52501();
      final SubLObject var116 = (SubLObject) ( ( NIL != var115 ) ? ConsesLow.list( (SubLObject) $ic161$, var112, (SubLObject) $ic455$, var113, var115 )
          : ConsesLow.list( (SubLObject) $ic161$, var112, (SubLObject) $ic455$, var113 ) );
      return f52432( var116, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic454$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52616(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic454$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic454$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic454$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var111, (SubLObject) $ic204$ );
      final SubLObject var115 = (SubLObject) ConsesLow.list( (SubLObject) $ic161$, var112, (SubLObject) $ic456$, var113 );
      return f52432( var115, var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic454$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52617(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic457$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic457$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic457$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic161$ );
    if( NIL != var112 )
    {
      f52432( var112, var24, module0048.f_1X( var25 ) );
      streams_high.write_string( (SubLObject) $ic50$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    streams_high.write_string( var113, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = (SubLObject) NIL;
    SubLObject var118 = (SubLObject) NIL;
    var116 = var115;
    var117 = var116.first();
    for( var118 = (SubLObject) ZERO_INTEGER; NIL != var116; var116 = var116.rest(), var117 = var116.first(), var118 = Numbers.add( (SubLObject) ONE_INTEGER, var118 ) )
    {
      if( !var118.isZero() )
      {
        f52491( var24 );
      }
      f52432( var117, var24, module0048.f_1X( var25 ) );
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52618(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic458$ );
    var112 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic458$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL != var114 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic458$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var112, (SubLObject) $ic459$ );
    final SubLObject var176_500 = f52501();
    if( NIL == var176_500 )
    {
      return f52473( var110, var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic460$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic461$ ), var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic462$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic463$ ), var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic464$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic465$ ), var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic466$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic467$ ), var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic468$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic469$ ), var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic470$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic471$ ), var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic472$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic473$ ), var24, var25 );
    }
    if( var113.equal( (SubLObject) $ic474$ ) )
    {
      return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_500, (SubLObject) $ic475$ ), var24, var25 );
    }
    return f52473( var110, var24, var25 );
  }

  public static SubLObject f52619(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic476$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic476$ );
    var112 = var113.first();
    final SubLObject var114;
    var113 = ( var114 = var113.rest() );
    module0035.f2502( var111, (SubLObject) $ic266$ );
    streams_high.write_string( (SubLObject) $ic477$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( var112, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.write_string( (SubLObject) $ic132$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var115 = (SubLObject) NIL;
    SubLObject var116 = (SubLObject) NIL;
    SubLObject var117 = (SubLObject) NIL;
    var115 = var114;
    var116 = var115.first();
    for( var117 = (SubLObject) ZERO_INTEGER; NIL != var115; var115 = var115.rest(), var116 = var115.first(), var117 = Numbers.add( (SubLObject) ONE_INTEGER, var117 ) )
    {
      if( !var117.isZero() )
      {
        f52491( var24 );
      }
      f52432( var116, var24, module0048.f_1X( var25 ) );
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52620(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic478$ );
    var112 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic478$ );
    var113 = var114.first();
    var114 = var114.rest();
    final SubLObject var115 = (SubLObject) ( var114.isCons() ? var114.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var114, var110, (SubLObject) $ic478$ );
    var114 = var114.rest();
    if( NIL == var114 )
    {
      module0035.f2502( var112, (SubLObject) $ic137$ );
      streams_high.write_string( (SubLObject) $ic477$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var113, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic479$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      SubLObject var116 = (SubLObject) NIL;
      SubLObject var117 = (SubLObject) NIL;
      SubLObject var118 = (SubLObject) NIL;
      var116 = var115;
      var117 = var116.first();
      for( var118 = (SubLObject) ZERO_INTEGER; NIL != var116; var116 = var116.rest(), var117 = var116.first(), var118 = Numbers.add( (SubLObject) ONE_INTEGER, var118 ) )
      {
        if( !var118.isZero() )
        {
          f52491( var24 );
        }
        if( NIL != $g6497$.getDynamicValue( var111 ) )
        {
          streams_high.terpri( var24 );
          f52430( var24, module0048.f_1X( var25 ) );
        }
        f52432( var117, var24, module0048.f_1X( var25 ) );
      }
      streams_high.write_string( (SubLObject) $ic82$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic478$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52621(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic480$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic480$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic481$ );
      return f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic482$, (SubLObject) ConsesLow.listS( (SubLObject) $ic151$, var112, (SubLObject) $ic443$ ) ), var24, var25 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic480$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52622(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic483$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic483$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic483$ );
    var113 = var114.first();
    var114 = var114.rest();
    if( NIL != var114 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic483$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var111, (SubLObject) $ic185$ );
    final SubLObject var115 = f52501();
    if( NIL != var115 )
    {
      return f52432( (SubLObject) ConsesLow.list( (SubLObject) $ic161$, var112, (SubLObject) $ic484$, var113, var115 ), var24, var25 );
    }
    return f52473( var110, var24, var25 );
  }

  public static SubLObject f52623(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var111 = SubLProcess.currentSubLThread();
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic321$ );
    var112 = var110.first();
    final SubLObject var113 = var110.rest();
    if( NIL != var113 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic321$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var112, (SubLObject) $ic485$ );
    final SubLObject var176_514 = f52501();
    if( NIL == var176_514 )
    {
      return f52473( var110, var24, var25 );
    }
    return f52432( (SubLObject) ConsesLow.listS( (SubLObject) $ic161$, var176_514, (SubLObject) $ic486$ ), var24, var25 );
  }

  public static SubLObject f52624(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic369$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic369$ );
    var112 = var113.first();
    var113 = var113.rest();
    if( NIL == var113 )
    {
      module0035.f2502( var111, (SubLObject) $ic487$ );
      streams_high.write_string( (SubLObject) $ic488$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52432( var112, var24, module0048.f_1X( var25 ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var110, (SubLObject) $ic369$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52502(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic489$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic489$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic489$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic164$ );
    if( NIL == module0035.f2501( var112, (SubLObject) $ic3$ ) )
    {
      var112 = (SubLObject) ConsesLow.list( (SubLObject) $ic3$, var112 );
    }
    streams_high.write_string( (SubLObject) $ic490$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52511( var112, var24, var25 );
    SubLObject var116 = var113;
    SubLObject var117 = (SubLObject) NIL;
    var117 = var116.first();
    while ( NIL != var116)
    {
      f52625( var117, var24, var25 );
      var116 = var116.rest();
      var117 = var116.first();
    }
    if( NIL != var115 )
    {
      streams_high.write_string( (SubLObject) $ic491$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var115, (SubLObject) NIL ) ), var24, var25 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52625(final SubLObject var521, final SubLObject var24, final SubLObject var25)
  {
    final SubLThread var522 = SubLProcess.currentSubLThread();
    cdestructuring_bind.destructuring_bind_must_consp( var521, var521, (SubLObject) $ic492$ );
    final SubLObject var523 = var521.rest();
    SubLObject var524 = var521.first();
    SubLObject var525 = (SubLObject) NIL;
    SubLObject var526 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var524, var521, (SubLObject) $ic492$ );
    var525 = var524.first();
    var524 = var524.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var524, var521, (SubLObject) $ic492$ );
    var526 = var524.first();
    var524 = var524.rest();
    if( NIL == var524 )
    {
      final SubLObject var527;
      var524 = ( var527 = var523 );
      assert NIL != Types.stringp( var525 ) : var525;
      final SubLObject var528 = $g6499$.currentBinding( var522 );
      final SubLObject var529 = $g6498$.currentBinding( var522 );
      try
      {
        $g6499$.bind( $g6498$.getDynamicValue( var522 ), var522 );
        $g6498$.bind( $g6498$.getDynamicValue( var522 ), var522 );
        f52483( var526 );
        streams_high.write_string( (SubLObject) $ic493$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        streams_high.write_string( var525, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        streams_high.write_string( (SubLObject) $ic217$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52432( var526, var24, module0048.f_1X( var25 ) );
        streams_high.write_string( (SubLObject) $ic291$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52511( reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var527, (SubLObject) NIL ) ), var24, var25 );
      }
      finally
      {
        $g6498$.rebind( var529, var522 );
        $g6499$.rebind( var528, var522 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var521, (SubLObject) $ic492$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52626(final SubLObject var2, final SubLObject var3)
  {
    final SubLThread var4 = SubLProcess.currentSubLThread();
    SubLObject var6;
    final SubLObject var5 = var6 = var2.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var6, var5, (SubLObject) $ic494$ );
    var7 = var6.first();
    var6 = var6.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var6, var5, (SubLObject) $ic494$ );
    var8 = var6.first();
    final SubLObject var9;
    var6 = ( var9 = var6.rest() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var4 ) && NIL != var8 )
    {
      Errors.error( (SubLObject) $ic495$ );
    }
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic496$, var7, ConsesLow.append( var9, (SubLObject) NIL ) );
  }

  public static SubLObject f52536(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    if( !var156.isMacroOperator() && NIL != module0811.f51813( var156 ) )
    {
      var157.resetMultipleValues();
      final SubLObject var158 = f52489( var156 );
      final SubLObject var159 = var157.secondMultipleValue();
      final SubLObject var160 = var157.thirdMultipleValue();
      var157.resetMultipleValues();
      if( var159.isNumber() && var158.isNumber() )
      {
        final SubLObject var161 = var158;
        final SubLObject var162 = (SubLObject) ( ( NIL != var160 ) ? $ic355$ : Numbers.add( var158, var159 ) );
        return (SubLObject) makeBoolean( ONE_INTEGER.numGE( var161 ) && ONE_INTEGER.numLE( var162 ) );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52537(final SubLObject var156, final SubLObject var24)
  {
    assert NIL != Types.symbolp( var156 ) : var156;
    final SubLObject var157 = f52627( var156 );
    final SubLObject var158 = module0813.f52099( var156 );
    final SubLObject var159 = f52628( (SubLObject) $ic499$ );
    final SubLObject var160 = f52629( var156 );
    PrintLow.format( var24, $g6514$.getGlobalValue(), new SubLObject[] { var157, var157, var158, var159, var160
    } );
    return (SubLObject) NIL;
  }

  public static SubLObject f52590(final SubLObject var156, final SubLObject var24)
  {
    assert NIL != Types.symbolp( var156 ) : var156;
    final SubLObject var157 = f52627( var156 );
    PrintLow.format( var24, $g6515$.getGlobalValue(), var157 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52630(final SubLObject var156)
  {
    final SubLObject var157 = module0818.f52404( var156 );
    return Sequences.cconcatenate( (SubLObject) $ic250$, new SubLObject[] { module0006.f203( var157 ), $ic502$
    } );
  }

  public static SubLObject f52627(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    final SubLObject var158 = module0034.$g879$.getDynamicValue( var157 );
    SubLObject var159 = (SubLObject) NIL;
    if( NIL == var158 )
    {
      return f52630( var156 );
    }
    var159 = module0034.f1857( var158, (SubLObject) $ic501$, (SubLObject) UNPROVIDED );
    if( NIL == var159 )
    {
      var159 = module0034.f1807( module0034.f1842( var158 ), (SubLObject) $ic501$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var158, (SubLObject) $ic501$, var159 );
    }
    SubLObject var160 = module0034.f1814( var159, var156, (SubLObject) $ic86$ );
    if( var160 == $ic86$ )
    {
      var160 = Values.arg2( var157.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52630( var156 ) ) );
      module0034.f1816( var159, var156, var160, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var160 );
  }

  public static SubLObject f52628(final SubLObject var120)
  {
    final SubLThread var121 = SubLProcess.currentSubLThread();
    SubLObject var122 = (SubLObject) NIL;
    final SubLObject var123 = $g6499$.currentBinding( var121 );
    final SubLObject var124 = $g6498$.currentBinding( var121 );
    try
    {
      $g6499$.bind( $g6498$.getDynamicValue( var121 ), var121 );
      $g6498$.bind( $g6498$.getDynamicValue( var121 ), var121 );
      f52483( var120 );
      var122 = f52481( var120 );
    }
    finally
    {
      $g6498$.rebind( var124, var121 );
      $g6499$.rebind( var123, var121 );
    }
    return var122;
  }

  public static SubLObject f52629(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    final SubLObject var158 = reader.bq_cons( var156, (SubLObject) $ic503$ );
    SubLObject var159 = (SubLObject) NIL;
    final SubLObject var160 = $g6499$.currentBinding( var157 );
    final SubLObject var161 = $g6498$.currentBinding( var157 );
    try
    {
      $g6499$.bind( $g6498$.getDynamicValue( var157 ), var157 );
      $g6498$.bind( $g6498$.getDynamicValue( var157 ), var157 );
      f52483( (SubLObject) $ic499$ );
      SubLObject var162 = (SubLObject) NIL;
      try
      {
        var162 = streams_high.make_private_string_output_stream();
        f52432( var158, var162, (SubLObject) ZERO_INTEGER );
        var159 = streams_high.get_output_stream_string( var162 );
      }
      finally
      {
        final SubLObject var35_535 = Threads.$is_thread_performing_cleanupP$.currentBinding( var157 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var157 );
          streams_high.close( var162, (SubLObject) UNPROVIDED );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var35_535, var157 );
        }
      }
    }
    finally
    {
      $g6498$.rebind( var161, var157 );
      $g6499$.rebind( var160, var157 );
    }
    return var159;
  }

  public static SubLObject f52538(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    if( !var156.isMacroOperator() && NIL != module0811.f51813( var156 ) )
    {
      var157.resetMultipleValues();
      final SubLObject var158 = f52489( var156 );
      final SubLObject var159 = var157.secondMultipleValue();
      final SubLObject var160 = var157.thirdMultipleValue();
      var157.resetMultipleValues();
      if( var159.isNumber() && var158.isNumber() )
      {
        final SubLObject var161 = var158;
        final SubLObject var162 = (SubLObject) ( ( NIL != var160 ) ? $ic355$ : Numbers.add( var158, var159 ) );
        return (SubLObject) makeBoolean( TWO_INTEGER.numGE( var161 ) && TWO_INTEGER.numLE( var162 ) );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52539(final SubLObject var156, final SubLObject var24)
  {
    assert NIL != Types.symbolp( var156 ) : var156;
    final SubLObject var157 = f52631( var156 );
    final SubLObject var158 = module0813.f52099( var156 );
    final SubLObject var159 = f52628( (SubLObject) $ic499$ );
    final SubLObject var160 = f52628( (SubLObject) $ic505$ );
    final SubLObject var161 = f52632( var156 );
    PrintLow.format( var24, $g6516$.getGlobalValue(), new SubLObject[] { var157, var157, var158, var159, var160, var161
    } );
    return (SubLObject) NIL;
  }

  public static SubLObject f52591(final SubLObject var156, final SubLObject var24)
  {
    assert NIL != Types.symbolp( var156 ) : var156;
    final SubLObject var157 = f52631( var156 );
    PrintLow.format( var24, $g6517$.getGlobalValue(), var157 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52633(final SubLObject var156)
  {
    final SubLObject var157 = module0818.f52404( var156 );
    return Sequences.cconcatenate( (SubLObject) $ic250$, new SubLObject[] { module0006.f203( var157 ), $ic508$
    } );
  }

  public static SubLObject f52631(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    final SubLObject var158 = module0034.$g879$.getDynamicValue( var157 );
    SubLObject var159 = (SubLObject) NIL;
    if( NIL == var158 )
    {
      return f52633( var156 );
    }
    var159 = module0034.f1857( var158, (SubLObject) $ic507$, (SubLObject) UNPROVIDED );
    if( NIL == var159 )
    {
      var159 = module0034.f1807( module0034.f1842( var158 ), (SubLObject) $ic507$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var158, (SubLObject) $ic507$, var159 );
    }
    SubLObject var160 = module0034.f1814( var159, var156, (SubLObject) $ic86$ );
    if( var160 == $ic86$ )
    {
      var160 = Values.arg2( var157.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52633( var156 ) ) );
      module0034.f1816( var159, var156, var160, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var160 );
  }

  public static SubLObject f52632(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    final SubLObject var158 = reader.bq_cons( var156, (SubLObject) $ic509$ );
    SubLObject var159 = (SubLObject) NIL;
    final SubLObject var160 = $g6499$.currentBinding( var157 );
    final SubLObject var161 = $g6498$.currentBinding( var157 );
    try
    {
      $g6499$.bind( $g6498$.getDynamicValue( var157 ), var157 );
      $g6498$.bind( $g6498$.getDynamicValue( var157 ), var157 );
      f52483( (SubLObject) $ic499$ );
      f52483( (SubLObject) $ic505$ );
      SubLObject var162 = (SubLObject) NIL;
      try
      {
        var162 = streams_high.make_private_string_output_stream();
        f52432( var158, var162, (SubLObject) ZERO_INTEGER );
        var159 = streams_high.get_output_stream_string( var162 );
      }
      finally
      {
        final SubLObject var35_538 = Threads.$is_thread_performing_cleanupP$.currentBinding( var157 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var157 );
          streams_high.close( var162, (SubLObject) UNPROVIDED );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var35_538, var157 );
        }
      }
    }
    finally
    {
      $g6498$.rebind( var161, var157 );
      $g6499$.rebind( var160, var157 );
    }
    return var159;
  }

  public static SubLObject f52534(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    if( !var156.isMacroOperator() && NIL != module0811.f51813( var156 ) )
    {
      var157.resetMultipleValues();
      final SubLObject var158 = f52489( var156 );
      final SubLObject var159 = var157.secondMultipleValue();
      final SubLObject var160 = var157.thirdMultipleValue();
      var157.resetMultipleValues();
      if( var159.isNumber() && var158.isNumber() )
      {
        final SubLObject var161 = var158;
        final SubLObject var162 = (SubLObject) ( ( NIL != var160 ) ? $ic355$ : Numbers.add( var158, var159 ) );
        return (SubLObject) makeBoolean( ZERO_INTEGER.numGE( var161 ) && ZERO_INTEGER.numLE( var162 ) );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52535(final SubLObject var156, final SubLObject var24)
  {
    assert NIL != Types.symbolp( var156 ) : var156;
    final SubLObject var157 = f52634( var156 );
    final SubLObject var158 = module0813.f52099( var156 );
    final SubLObject var159 = f52635( var156 );
    PrintLow.format( var24, $g6518$.getGlobalValue(), new SubLObject[] { var157, var157, var158, var159
    } );
    return (SubLObject) NIL;
  }

  public static SubLObject f52589(final SubLObject var156, final SubLObject var24)
  {
    assert NIL != Types.symbolp( var156 ) : var156;
    final SubLObject var157 = f52634( var156 );
    PrintLow.format( var24, $g6519$.getGlobalValue(), var157 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52636(final SubLObject var156)
  {
    final SubLObject var157 = module0818.f52404( var156 );
    return Sequences.cconcatenate( (SubLObject) $ic250$, new SubLObject[] { module0006.f203( var157 ), $ic513$
    } );
  }

  public static SubLObject f52634(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    final SubLObject var158 = module0034.$g879$.getDynamicValue( var157 );
    SubLObject var159 = (SubLObject) NIL;
    if( NIL == var158 )
    {
      return f52636( var156 );
    }
    var159 = module0034.f1857( var158, (SubLObject) $ic512$, (SubLObject) UNPROVIDED );
    if( NIL == var159 )
    {
      var159 = module0034.f1807( module0034.f1842( var158 ), (SubLObject) $ic512$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var158, (SubLObject) $ic512$, var159 );
    }
    SubLObject var160 = module0034.f1814( var159, var156, (SubLObject) $ic86$ );
    if( var160 == $ic86$ )
    {
      var160 = Values.arg2( var157.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52636( var156 ) ) );
      module0034.f1816( var159, var156, var160, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var160 );
  }

  public static SubLObject f52635(final SubLObject var156)
  {
    final SubLThread var157 = SubLProcess.currentSubLThread();
    final SubLObject var158 = (SubLObject) ConsesLow.list( var156 );
    SubLObject var159 = (SubLObject) NIL;
    final SubLObject var160 = $g6499$.currentBinding( var157 );
    final SubLObject var161 = $g6498$.currentBinding( var157 );
    try
    {
      $g6499$.bind( $g6498$.getDynamicValue( var157 ), var157 );
      $g6498$.bind( $g6498$.getDynamicValue( var157 ), var157 );
      SubLObject var162 = (SubLObject) NIL;
      try
      {
        var162 = streams_high.make_private_string_output_stream();
        f52432( var158, var162, (SubLObject) ZERO_INTEGER );
        var159 = streams_high.get_output_stream_string( var162 );
      }
      finally
      {
        final SubLObject var35_539 = Threads.$is_thread_performing_cleanupP$.currentBinding( var157 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var157 );
          streams_high.close( var162, (SubLObject) UNPROVIDED );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var35_539, var157 );
        }
      }
    }
    finally
    {
      $g6498$.rebind( var161, var157 );
      $g6499$.rebind( var160, var157 );
    }
    return var159;
  }

  public static SubLObject f52469(SubLObject var135)
  {
    var135 = module0818.f52385( var135 );
    var135 = module0818.f52387( var135 );
    var135 = module0818.f52390( var135 );
    return var135;
  }

  public static SubLObject f52637(final SubLObject var65, SubLObject var540)
  {
    if( var540 == UNPROVIDED )
    {
      var540 = module0813.f52079( var65 );
    }
    final SubLThread var541 = SubLProcess.currentSubLThread();
    final SubLObject var542 = module0813.f52071( var65 );
    SubLObject var543 = (SubLObject) $ic514$;
    if( !var542.equal( (SubLObject) $ic45$ ) )
    {
      final SubLObject var544 = module0813.f52075( var65 );
      final SubLObject var545 = module0813.f52093( var65 );
      final SubLObject var546 = f52461( var542 );
      if( NIL != module0813.f52030() )
      {
        var543 = module0813.f52128( var544, var545, var546, (SubLObject) $ic515$ );
      }
      final SubLObject var547 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var541 );
      final SubLObject var548 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var541 );
      try
      {
        StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic36$, var541 );
        StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var541 ), var541 );
        final SubLObject var549 = var543;
        SubLObject var550 = (SubLObject) NIL;
        try
        {
          final SubLObject var35_546 = stream_macros.$stream_requires_locking$.currentBinding( var541 );
          try
          {
            stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var541 );
            var550 = compatibility.open_text( var549, (SubLObject) $ic37$ );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( var35_546, var541 );
          }
          if( !var550.isStream() )
          {
            Errors.error( (SubLObject) $ic38$, var549 );
          }
          final SubLObject var24_547 = var550;
          f52440( var24_547 );
          f52638( var24_547 );
          PrintLow.format( var24_547, (SubLObject) $ic516$, Sequences.length( var540 ) );
          SubLObject var551 = var540;
          SubLObject var552 = (SubLObject) NIL;
          var552 = var551.first();
          while ( NIL != var551)
          {
            final SubLObject var553 = f52453( var552 );
            PrintLow.format( var24_547, (SubLObject) $ic517$, var553 );
            var551 = var551.rest();
            var552 = var551.first();
          }
          PrintLow.format( var24_547, (SubLObject) $ic518$ );
          f52639( var24_547 );
        }
        finally
        {
          final SubLObject var35_547 = Threads.$is_thread_performing_cleanupP$.currentBinding( var541 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var541 );
            if( var550.isStream() )
            {
              streams_high.close( var550, (SubLObject) UNPROVIDED );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var35_547, var541 );
          }
        }
      }
      finally
      {
        StreamsLow.$stream_initial_output_buffer_size$.rebind( var548, var541 );
        StreamsLow.$stream_initial_input_buffer_size$.rebind( var547, var541 );
      }
      final SubLObject var554 = module0813.f52128( var544, (SubLObject) NIL, (SubLObject) $ic519$, (SubLObject) $ic520$ );
      final SubLObject var555 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var541 );
      final SubLObject var556 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var541 );
      try
      {
        StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic36$, var541 );
        StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var541 ), var541 );
        final SubLObject var557 = var554;
        SubLObject var558 = (SubLObject) NIL;
        try
        {
          final SubLObject var35_548 = stream_macros.$stream_requires_locking$.currentBinding( var541 );
          try
          {
            stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var541 );
            var558 = compatibility.open_text( var557, (SubLObject) $ic37$ );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( var35_548, var541 );
          }
          if( !var558.isStream() )
          {
            Errors.error( (SubLObject) $ic38$, var557 );
          }
          final SubLObject var24_548 = var558;
          SubLObject var559 = var540;
          SubLObject var560 = (SubLObject) NIL;
          var560 = var559.first();
          while ( NIL != var559)
          {
            final SubLObject var561 = f52453( var560 );
            f52640( var561, var24_548 );
            var559 = var559.rest();
            var560 = var559.first();
          }
          f52640( (SubLObject) $ic521$, var24_548 );
        }
        finally
        {
          final SubLObject var35_549 = Threads.$is_thread_performing_cleanupP$.currentBinding( var541 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var541 );
            if( var558.isStream() )
            {
              streams_high.close( var558, (SubLObject) UNPROVIDED );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var35_549, var541 );
          }
        }
      }
      finally
      {
        StreamsLow.$stream_initial_output_buffer_size$.rebind( var556, var541 );
        StreamsLow.$stream_initial_input_buffer_size$.rebind( var555, var541 );
      }
      return var543;
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52640(final SubLObject var70, final SubLObject var24)
  {
    final SubLObject var71 = Sequences.substitute( (SubLObject) Characters.CHAR_slash, (SubLObject) Characters.CHAR_period, var70, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    final SubLObject var72 = Sequences.cconcatenate( var71, (SubLObject) $ic522$ );
    streams_high.write_string( var72, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    return var70;
  }

  public static SubLObject f52638(final SubLObject var24)
  {
    streams_high.write_string( $g6520$.getGlobalValue(), var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52639(final SubLObject var24)
  {
    streams_high.write_string( $g6521$.getGlobalValue(), var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52641(final SubLObject var2, final SubLObject var3)
  {
    SubLObject var5;
    final SubLObject var4 = var5 = var2.rest();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic525$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic525$ );
    var7 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic526$, (SubLObject) ConsesLow.list( (SubLObject) $ic527$, var6 ), var7 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic525$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52642(final SubLObject var558, SubLObject var559)
  {
    if( var559 == UNPROVIDED )
    {
      var559 = Time.get_universal_time();
    }
    final SubLThread var560 = SubLProcess.currentSubLThread();
    final SubLObject var561 = Sequences.cconcatenate( (SubLObject) $ic529$, module0006.f203( var559 ) );
    SubLObject var562 = (SubLObject) NIL;
    SubLObject var563 = (SubLObject) NIL;
    try
    {
      var563 = streams_high.make_private_string_output_stream();
      SubLObject var564 = (SubLObject) NIL;
      SubLObject var565 = (SubLObject) NIL;
      SubLObject var566 = (SubLObject) NIL;
      var564 = var558;
      var565 = var564.first();
      for( var566 = (SubLObject) ZERO_INTEGER; NIL != var564; var564 = var564.rest(), var565 = var564.first(), var566 = Numbers.add( (SubLObject) ONE_INTEGER, var566 ) )
      {
        if( !var566.isZero() )
        {
          PrintLow.format( var563, (SubLObject) $ic530$ );
        }
        print_high.prin1( var565, var563 );
      }
      var562 = streams_high.get_output_stream_string( var563 );
    }
    finally
    {
      final SubLObject var567 = Threads.$is_thread_performing_cleanupP$.currentBinding( var560 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var560 );
        streams_high.close( var563, (SubLObject) UNPROVIDED );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var567, var560 );
      }
    }
    final SubLObject var568 = module0813.f52032();
    final SubLObject var569 = module0813.f52075( var568 );
    final SubLObject var570 = module0813.f52128( var569, (SubLObject) $ic531$, var561, (SubLObject) $ic515$ );
    module0075.ensure_directories_exist( var570 );
    SubLObject var571 = (SubLObject) NIL;
    try
    {
      final SubLObject var572 = stream_macros.$stream_requires_locking$.currentBinding( var560 );
      try
      {
        stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var560 );
        var571 = compatibility.open_text( var570, (SubLObject) $ic37$ );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( var572, var560 );
      }
      if( !var571.isStream() )
      {
        Errors.error( (SubLObject) $ic38$, var570 );
      }
      final SubLObject var24_564 = var571;
      PrintLow.format( var24_564, $g6522$.getGlobalValue(), new SubLObject[] { var561, var559, var562
      } );
    }
    finally
    {
      final SubLObject var573 = Threads.$is_thread_performing_cleanupP$.currentBinding( var560 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var560 );
        if( var571.isStream() )
        {
          streams_high.close( var571, (SubLObject) UNPROVIDED );
        }
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var573, var560 );
      }
    }
    return var570;
  }

  public static SubLObject f52643(final SubLObject var540, SubLObject var559)
  {
    if( var559 == UNPROVIDED )
    {
      var559 = Time.get_universal_time();
    }
    final SubLObject var560 = Mapping.mapcar( Symbols.symbol_function( (SubLObject) $ic532$ ), var540 );
    final SubLObject var561 = f52642( var560, var559 );
    final SubLObject var562 = (SubLObject) NIL;
    return (SubLObject) ConsesLow.listS( var561, var562 );
  }

  public static SubLObject f52493(final SubLObject var19, final SubLObject var566)
  {
    final SubLThread var567 = SubLProcess.currentSubLThread();
    if( NIL != $g6523$.getDynamicValue( var567 ) )
    {
      SubLObject var568 = module0067.f4885( $g6523$.getDynamicValue( var567 ), var19, (SubLObject) UNPROVIDED );
      final SubLObject var569 = module0035.f2294( var568, var566, Symbols.symbol_function( (SubLObject) EQL ), (SubLObject) ZERO_INTEGER );
      final SubLObject var570 = module0048.f_1X( var569 );
      var568 = module0035.f2306( var568, var566, var570, Symbols.symbol_function( (SubLObject) EQL ) );
      if( var569.isZero() )
      {
        module0067.f4886( $g6523$.getDynamicValue( var567 ), var19, var568 );
      }
      return var570;
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52644()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    SubLObject var2 = (SubLObject) NIL;
    SubLObject var3;
    for( var3 = module0066.f4838( module0067.f4891( $g6523$.getDynamicValue( var1 ) ) ); NIL == module0066.f4841( var3 ); var3 = module0066.f4840( var3 ) )
    {
      var1.resetMultipleValues();
      final SubLObject var4 = module0066.f4839( var3 );
      final SubLObject var5 = var1.secondMultipleValue();
      var1.resetMultipleValues();
      SubLObject var6 = var5;
      SubLObject var7 = (SubLObject) NIL;
      var7 = var6.first();
      while ( NIL != var6)
      {
        SubLObject var9;
        final SubLObject var8 = var9 = var7;
        SubLObject var10 = (SubLObject) NIL;
        SubLObject var11 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var9, var8, (SubLObject) $ic533$ );
        var10 = var9.first();
        var9 = ( var11 = var9.rest() );
        var2 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var4, var10, var11 ), var2 );
        var6 = var6.rest();
        var7 = var6.first();
      }
    }
    module0066.f4842( var3 );
    var2 = Sort.sort( var2, Symbols.symbol_function( (SubLObject) $ic534$ ), Symbols.symbol_function( (SubLObject) $ic535$ ) );
    return var2;
  }

  public static SubLObject f52645(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic536$ );
    var111 = var110.first();
    SubLObject var113 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var113, var110, (SubLObject) $ic536$ );
    var112 = var113.first();
    final SubLObject var114;
    var113 = ( var114 = var113.rest() );
    module0035.f2502( var111, (SubLObject) $ic537$ );
    streams_high.write_string( (SubLObject) $ic538$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    f52432( var112, var24, module0048.f_1X( var25 ) );
    SubLObject var115 = var114;
    SubLObject var116 = (SubLObject) NIL;
    var116 = var115.first();
    while ( NIL != var115)
    {
      streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var24 );
      f52430( var24, var25 );
      f52432( var116, var24, module0048.f_1X( var25 ) );
      var115 = var115.rest();
      var116 = var115.first();
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52646(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic539$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic539$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic539$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic540$ );
    streams_high.write_string( (SubLObject) $ic541$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    f52432( var112, var24, module0048.f_1X( var25 ) );
    streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    f52432( var113, var24, module0048.f_1X( var25 ) );
    SubLObject var116 = var115;
    SubLObject var117 = (SubLObject) NIL;
    var117 = var116.first();
    while ( NIL != var116)
    {
      streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var24 );
      f52430( var24, var25 );
      f52432( var117, var24, module0048.f_1X( var25 ) );
      var116 = var116.rest();
      var117 = var116.first();
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52647(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic542$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic542$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic542$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic543$ );
    streams_high.write_string( (SubLObject) $ic544$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    f52432( var112, var24, module0048.f_1X( var25 ) );
    streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    f52432( var113, var24, module0048.f_1X( var25 ) );
    SubLObject var116 = var115;
    SubLObject var117 = (SubLObject) NIL;
    var117 = var116.first();
    while ( NIL != var116)
    {
      streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var24 );
      f52430( var24, var25 );
      f52432( var117, var24, module0048.f_1X( var25 ) );
      var116 = var116.rest();
      var117 = var116.first();
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52648(final SubLObject var110, final SubLObject var24, final SubLObject var25)
  {
    SubLObject var111 = (SubLObject) NIL;
    SubLObject var112 = (SubLObject) NIL;
    SubLObject var113 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var110, var110, (SubLObject) $ic545$ );
    var111 = var110.first();
    SubLObject var114 = var110.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic545$ );
    var112 = var114.first();
    var114 = var114.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var114, var110, (SubLObject) $ic545$ );
    var113 = var114.first();
    final SubLObject var115;
    var114 = ( var115 = var114.rest() );
    module0035.f2502( var111, (SubLObject) $ic546$ );
    streams_high.write_string( (SubLObject) $ic547$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    f52432( var112, var24, module0048.f_1X( var25 ) );
    streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    streams_high.terpri( var24 );
    f52430( var24, var25 );
    f52432( var113, var24, module0048.f_1X( var25 ) );
    SubLObject var116 = var115;
    SubLObject var117 = (SubLObject) NIL;
    var117 = var116.first();
    while ( NIL != var116)
    {
      streams_high.write_string( (SubLObject) $ic30$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var24 );
      f52430( var24, var25 );
      f52432( var117, var24, module0048.f_1X( var25 ) );
      var116 = var116.rest();
      var117 = var116.first();
    }
    streams_high.write_string( (SubLObject) $ic134$, var24, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52649()
  {
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52421", "S#57723", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0819", "f52422", "S#57724" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0819", "f52423", "S#57725" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52424", "S#57726", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52425", "S#57727", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52426", "S#57728", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52427", "S#57729", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52428", "S#57730", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52429", "S#57731", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52431", "S#57732", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52433", "S#57733", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52434", "S#57734", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52435", "S#57735", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52436", "S#56861", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52437", "S#57736", 1, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52438", "S#57737", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52440", "S#57738", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52441", "S#57739", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52444", "S#57740", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52445", "S#57741", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52446", "S#57742", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52449", "S#56858", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52450", "S#57743", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52451", "S#57744", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52448", "S#57745", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52452", "S#57746", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52447", "S#57289", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52442", "S#57747", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52453", "S#57748", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52443", "S#57749", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52455", "S#57750", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52439", "S#57751", 3, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52459", "S#57752", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52454", "S#57506", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52461", "S#57753", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52460", "S#57754", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52456", "S#57755", 4, 1, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0819", "f52462", "S#57756" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52463", "S#57757", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52464", "S#57758", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52465", "S#57759", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52457", "S#57760", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52466", "S#57761", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52468", "S#57762", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52458", "S#57763", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52467", "S#57764", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52432", "S#57765", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52474", "S#56865", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52430", "S#57766", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52470", "S#57767", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52476", "S#57768", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52477", "S#57769", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52478", "S#57770", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52475", "S#57771", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52480", "S#57772", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52479", "S#57773", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0819", "f52482", "S#57774" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52483", "S#57775", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52481", "S#57776", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52484", "S#57777", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52486", "S#57778", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52485", "S#57779", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52488", "S#57780", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52487", "S#57781", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52473", "S#57782", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52495", "S#57783", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52490", "S#57784", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52494", "S#57785", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52489", "S#57786", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52496", "S#57787", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52491", "S#57788", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52492", "S#57789", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52471", "S#57790", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52472", "S#57791", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52497", "S#57792", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52498", "S#57793", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52499", "S#57794", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52500", "S#57795", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52504", "S#57796", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52505", "S#57797", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52508", "S#57798", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52509", "S#57799", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52510", "S#57800", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52506", "S#57801", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52507", "S#57802", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52512", "S#57803", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52513", "S#57804", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52514", "S#57805", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52516", "S#57806", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52517", "S#57807", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52515", "S#57808", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52518", "S#57809", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52519", "S#57810", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52520", "S#57811", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52521", "S#57812", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52522", "S#57813", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52523", "S#57814", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52524", "S#57815", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52529", "S#57816", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52530", "S#57290", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52531", "S#57817", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52525", "S#57818", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52532", "S#57819", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52526", "S#57820", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52541", "S#57821", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52540", "S#57822", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52542", "S#57823", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52533", "S#57824", 3, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52527", "S#57825", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52545", "S#57826", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52543", "S#57827", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52528", "S#57828", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52544", "S#57829", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52546", "S#57830", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52547", "S#57831", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52548", "S#57832", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52549", "S#57833", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52550", "S#57834", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52551", "S#57835", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52555", "S#57836", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52552", "S#57837", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52556", "S#57838", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52553", "S#57839", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52554", "S#57840", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52557", "S#57841", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52558", "S#57842", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52559", "S#57843", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52560", "S#57844", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52561", "S#57845", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52562", "S#57846", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52563", "S#57847", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52564", "S#57848", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52511", "S#57849", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52565", "S#57850", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52566", "S#57851", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52567", "S#57852", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52568", "S#57853", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52570", "S#57854", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52571", "S#57855", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52572", "S#57856", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52573", "S#57857", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52575", "S#57858", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52574", "S#57859", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52576", "S#57860", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52578", "S#57861", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52577", "S#57862", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52579", "S#57863", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52581", "S#57864", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52580", "S#57865", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52582", "S#57866", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52583", "S#57867", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52569", "S#57868", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52584", "S#57869", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52585", "S#57870", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52586", "S#57871", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52587", "S#57872", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52588", "S#57873", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52592", "S#57874", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52593", "S#57875", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52594", "S#57876", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52501", "S#57877", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52503", "S#57878", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52595", "S#57879", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52596", "S#57880", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52597", "S#57881", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52598", "S#57882", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52599", "S#57883", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52600", "S#57884", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52601", "S#57885", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52602", "S#57886", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52603", "S#57887", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52604", "S#57888", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52605", "S#57889", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52606", "S#57890", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52607", "S#57891", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52608", "S#57892", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52609", "S#57893", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52610", "S#57894", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52611", "S#57895", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52612", "S#57896", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52613", "S#57897", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52614", "S#57898", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52615", "S#57899", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52616", "S#57900", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52617", "S#57901", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52618", "S#57902", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52619", "S#57903", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52620", "S#57904", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52621", "S#57905", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52622", "S#57906", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52623", "S#57907", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52624", "S#57908", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52502", "S#57909", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52625", "S#57910", 3, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0819", "f52626", "S#57025" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52536", "S#57911", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52537", "S#57912", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52590", "S#57913", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52630", "S#57914", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52627", "S#57915", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52628", "S#57916", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52629", "S#57917", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52538", "S#57918", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52539", "S#57919", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52591", "S#57920", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52633", "S#57921", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52631", "S#57922", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52632", "S#57923", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52534", "S#57924", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52535", "S#57925", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52589", "S#57926", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52636", "S#57927", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52634", "S#57928", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52635", "S#57929", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52469", "S#57930", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52637", "S#56863", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52640", "S#57931", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52638", "S#57932", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52639", "S#57933", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0819", "f52641", "S#57934" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52642", "S#57935", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52643", "S#57936", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52493", "S#57937", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52644", "S#57938", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52645", "S#57939", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52646", "S#57940", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52647", "S#57941", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0819", "f52648", "S#57942", 3, 0, false );
    return (SubLObject) NIL;
  }

  public static SubLObject f52650()
  {
    $g6493$ = SubLFiles.deflexical( "S#57943", (SubLObject) $ic0$ );
    $g6494$ = SubLFiles.defvar( "S#57944", (SubLObject) $ic1$ );
    $g6495$ = SubLFiles.defvar( "S#57945", (SubLObject) NIL );
    $g6496$ = SubLFiles.deflexical( "S#57946", (SubLObject) $ic14$ );
    $g6497$ = SubLFiles.defparameter( "S#57947", (SubLObject) NIL );
    $g6498$ = SubLFiles.defparameter( "S#57948", (SubLObject) NIL );
    $g6499$ = SubLFiles.defparameter( "S#57949", (SubLObject) NIL );
    $g6500$ = SubLFiles.deflexical( "S#57950", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic72$ ) ) ? $g6500$.getGlobalValue() : NIL ) );
    $g6501$ = SubLFiles.defparameter( "S#57951", (SubLObject) NIL );
    $g6502$ = SubLFiles.defparameter( "S#57952", (SubLObject) NIL );
    $g6503$ = SubLFiles.deflexical( "S#57953", (SubLObject) $ic146$ );
    $g6504$ = SubLFiles.deflexical( "S#57954", (SubLObject) NIL );
    $g6505$ = SubLFiles.deflexical( "S#57955", (SubLObject) $ic209$ );
    $g6506$ = SubLFiles.defvar( "S#57956", (SubLObject) T );
    $g6507$ = SubLFiles.deflexical( "S#57957", (SubLObject) $ic138$ );
    $g6508$ = SubLFiles.deflexical( "S#57958", (SubLObject) TWENTY_INTEGER );
    $g6509$ = SubLFiles.deflexical( "S#57959", (SubLObject) $ic355$ );
    $g6510$ = SubLFiles.deflexical( "S#57960", Numbers.subtract( Numbers.expt( (SubLObject) TWO_INTEGER, (SubLObject) $ic367$ ), (SubLObject) ONE_INTEGER ) );
    $g6511$ = SubLFiles.deflexical( "S#57961", Numbers.minus( Numbers.expt( (SubLObject) TWO_INTEGER, (SubLObject) $ic367$ ) ) );
    $g6512$ = SubLFiles.defparameter( "S#57962", (SubLObject) NIL );
    $g6513$ = SubLFiles.deflexical( "S#57963", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic421$ ) ) ? $g6513$.getGlobalValue() : T ) );
    $g6514$ = SubLFiles.deflexical( "S#57964", (SubLObject) $ic497$ );
    $g6515$ = SubLFiles.deflexical( "S#57965", (SubLObject) $ic500$ );
    $g6516$ = SubLFiles.deflexical( "S#57966", (SubLObject) $ic504$ );
    $g6517$ = SubLFiles.deflexical( "S#57967", (SubLObject) $ic506$ );
    $g6518$ = SubLFiles.deflexical( "S#57968", (SubLObject) $ic510$ );
    $g6519$ = SubLFiles.deflexical( "S#57969", (SubLObject) $ic511$ );
    $g6520$ = SubLFiles.deflexical( "S#57970", (SubLObject) $ic523$ );
    $g6521$ = SubLFiles.deflexical( "S#57971", (SubLObject) $ic524$ );
    $g6522$ = SubLFiles.deflexical( "S#57972", (SubLObject) $ic528$ );
    $g6523$ = SubLFiles.defvar( "S#57973", (SubLObject) NIL );
    return (SubLObject) NIL;
  }

  public static SubLObject f52651()
  {
    module0003.f57( (SubLObject) $ic72$ );
    module0034.f1895( (SubLObject) $ic83$ );
    module0012.f419( (SubLObject) $ic100$ );
    module0034.f1895( (SubLObject) $ic124$ );
    module0034.f1909( (SubLObject) $ic187$ );
    module0034.f1895( (SubLObject) $ic249$ );
    module0034.f1895( (SubLObject) $ic252$ );
    module0003.f57( (SubLObject) $ic421$ );
    module0034.f1895( (SubLObject) $ic501$ );
    module0034.f1895( (SubLObject) $ic507$ );
    module0034.f1895( (SubLObject) $ic512$ );
    return (SubLObject) NIL;
  }

  @Override
  public void declareFunctions()
  {
    f52649();
  }

  @Override
  public void initializeVariables()
  {
    f52650();
  }

  @Override
  public void runTopLevelForms()
  {
    f52651();
  }
  static
  {
    me = (SubLFile) new module0819();
    $g6493$ = null;
    $g6494$ = null;
    $g6495$ = null;
    $g6496$ = null;
    $g6497$ = null;
    $g6498$ = null;
    $g6499$ = null;
    $g6500$ = null;
    $g6501$ = null;
    $g6502$ = null;
    $g6503$ = null;
    $g6504$ = null;
    $g6505$ = null;
    $g6506$ = null;
    $g6507$ = null;
    $g6508$ = null;
    $g6509$ = null;
    $g6510$ = null;
    $g6511$ = null;
    $g6512$ = null;
    $g6513$ = null;
    $g6514$ = null;
    $g6515$ = null;
    $g6516$ = null;
    $g6517$ = null;
    $g6518$ = null;
    $g6519$ = null;
    $g6520$ = null;
    $g6521$ = null;
    $g6522$ = null;
    $g6523$ = null;
    $ic0$ = ConsesLow.list( (SubLObject) makeKeyword( "API" ), (SubLObject) makeKeyword( "EXTERNAL" ), (SubLObject) makeKeyword( "PUBLIC" ),
        (SubLObject) makeKeyword( "NONE" ) );
    $ic1$ = makeKeyword( "NONE" );
    $ic2$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#696", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol(
        "S#5", "CYC" ) );
    $ic3$ = makeSymbol( "PROGN" );
    $ic4$ = makeSymbol( "MUST" );
    $ic5$ = makeSymbol( "MEMBER?" );
    $ic6$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57943", "CYC" ) );
    $ic7$ = makeString( "Invalid logging level ~A, not a member of ~A." );
    $ic8$ = makeSymbol( "CLET" );
    $ic9$ = makeSymbol( "S#57944", "CYC" );
    $ic10$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57974", "CYC" ), (SubLObject) makeSymbol( "METHOD" ) ), (SubLObject) makeSymbol(
        "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic11$ = makeSymbol( "S#57945", "CYC" );
    $ic12$ = makeSymbol( "FIF" );
    $ic13$ = ConsesLow.list( (SubLObject) NIL );
    $ic14$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeKeyword( "ENDS-WITH" ), (SubLObject) makeString( "-P" ) ), (SubLObject) ConsesLow.list(
        (SubLObject) makeKeyword( "ENDS-WITH" ), (SubLObject) makeString( "?" ) ) );
    $ic15$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#1625", "CYC" ) );
    $ic16$ = makeKeyword( "ENDS-WITH" );
    $ic17$ = makeString( "Unimplemented black-listing operator ~A." );
    $ic18$ = makeSymbol( "FACCESS" );
    $ic19$ = makeSymbol( "PUBLIC" );
    $ic20$ = makeKeyword( "PUBLIC" );
    $ic21$ = makeKeyword( "EXTERNAL" );
    $ic22$ = makeString( "~&import org.slf4j.Logger;" );
    $ic23$ = makeString( "~&import org.slf4j.LoggerFactory;" );
    $ic24$ = makeString( "final static private Logger myLogger = LoggerFactory.getLogger(myName);" );
    $ic25$ = makeString( "myLogger.trace(\"Enter {}" );
    $ic26$ = makeString( ":" );
    $ic27$ = makeSymbol( "&OPTIONAL" );
    $ic28$ = makeString( " {}" );
    $ic29$ = makeString( "\", new Object[] {" );
    $ic30$ = makeString( ", " );
    $ic31$ = makeString( "}); " );
    $ic32$ = makeString( "myLogger.trace(\"Leave {}: {}\", " );
    $ic33$ = makeString( "); " );
    $ic34$ = makeSymbol( "S#56738", "CYC" );
    $ic35$ = makeSymbol( "STRINGP" );
    $ic36$ = makeInteger( 1048576 );
    $ic37$ = makeKeyword( "OUTPUT" );
    $ic38$ = makeString( "Unable to open ~S" );
    $ic39$ = makeSymbol( "DOUBLE-FLOAT" );
    $ic40$ = makeString( "Invalid attempt to reuse memoization state in multiple threads simultaneously." );
    $ic41$ = makeString( "" );
    $ic44$ = makeString( "~%~%package ~A;" );
    $ic45$ = makeString( "SUBLISP" );
    $ic46$ = makeString( "com.cyc.tool.subl.jrtl.translatedCode" );
    $ic47$ = makeString( "CYCL" );
    $ic48$ = makeString( "com.cyc.cycjava" );
    $ic49$ = makeString( "time to implement multiple system translation" );
    $ic50$ = makeString( "." );
    $ic51$ = makeSymbol( "CCONCATENATE" );
    $ic52$ = makeString( "package_" );
    $ic53$ = ConsesLow.list( (SubLObject) Characters.CHAR_slash );
    $ic54$ = makeString( "~%import java.util.Iterator;" );
    $ic55$ = makeString( "~%import java.util.Map.Entry;" );
    $ic56$ = makeString( "~%import java.util.ArrayList;" );
    $ic57$ = makeString( "~%import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;" );
    $ic58$ = makeString( "~%import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;" );
    $ic59$ = makeString( "~%import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;" );
    $ic60$ = makeString( "~%import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;" );
    $ic61$ = makeString( "~%import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;" );
    $ic62$ = makeString( "~%import com.cyc.tool.subl.util.*;" );
    $ic63$ = makeString( "~%import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.~A;" );
    $ic64$ = ConsesLow.list( new SubLObject[] { makeString( "makeBoolean" ), makeString( "makeInteger" ), makeString( "makeDouble" ), makeString(
        "makeChar" ), makeString( "makeString" ), makeString( "makeSymbol" ), makeString( "makeKeyword" ), makeString( "makeUninternedSymbol" ),
      makeString( "makeGuid" )
    } );
    $ic65$ = makeString( "~%import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.~A;" );
    $ic66$ = ConsesLow.list( (SubLObject) makeString( "cons" ), (SubLObject) makeString( "list" ), (SubLObject) makeString( "listS" ) );
    $ic67$ = makeString( "~%import static com.cyc.tool.subl.util.SubLFiles.~A;" );
    $ic68$ = ConsesLow.list( (SubLObject) makeString( "defconstant" ), (SubLObject) makeString( "deflexical" ), (SubLObject) makeString( "defparameter" ),
        (SubLObject) makeString( "defvar" ), (SubLObject) makeString( "declareFunction" ), (SubLObject) makeString( "declareMacro" ) );
    $ic69$ = makeString( "CONSTANT-HANDLES" );
    $ic70$ = makeString( "~%~%" );
    $ic71$ = makeString( "~%import ~A;" );
    $ic72$ = makeSymbol( "S#57950", "CYC" );
    $ic73$ = makeString(
        "\n  public cycl() {}\n  \n  public static final SubLFile me = new cycl();\n  \n  //// Initializers\n  \n  public void declareFunctions() {\n  }\n  \n  public void initializeVariables() {\n  }\n  \n  public void runTopLevelForms() {\n    try {\n     SubLFiles.initialize(\"eu.cyc.sparql.server.Sparql\");\n     SubLFiles.initialize(\"com.cyc.tool.subl.webserver.ServletContainer\");\n    } catch (Exception e) {\n    }\n" );
    $ic524$ = makeString( "\n  }  \n}" );
    $ic525$ = ConsesLow.list( (SubLObject) makeSymbol( "S#35567", "CYC" ), (SubLObject) makeSymbol( "S#35568", "CYC" ) );
    $ic526$ = makeSymbol( "FWHEN" );
    $ic527$ = makeSymbol( "TRUE" );
    $ic528$ = makeString(
        "import com.cyc.tool.subl.util.*;\n\npublic class ~A extends AbstractSubLPatcher {\n  private static final long SEQUENCE = ~A;\n  private static final String[] patchedClasses = {\n    ~A\n  };\n\n  public final long getPatchOrdering() { return SEQUENCE; }\n  public final String[] getPatchedClasses() { return patchedClasses; }\n}\n" );
    $ic529$ = makeString( "patcher" );
    $ic530$ = makeString( ",~%    " );
    $ic531$ = ConsesLow.list( (SubLObject) makeString( "patches" ) );
    $ic532$ = makeSymbol( "S#57748", "CYC" );
    $ic533$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "ARITY" ), (SubLObject) makeSymbol( "COUNT" ) );
    $ic534$ = makeSymbol( ">" );
    $ic535$ = makeSymbol( "THIRD" );
    $ic536$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CLASS" ), (SubLObject) makeSymbol( "&REST" ),
        (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic537$ = makeSymbol( "JAVA-NEW" );
    $ic538$ = makeString( "JavaLink._new(" );
    $ic539$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CLASS" ), (SubLObject) makeSymbol( "S#29", "CYC" ),
        (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#10387", "CYC" ) );
    $ic540$ = makeSymbol( "JAVA-METHOD" );
    $ic541$ = makeString( "JavaLink._method(" );
    $ic542$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "METHOD" ), (SubLObject) makeSymbol( "CLASS" ),
        (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic543$ = makeSymbol( "JAVA-STATIC" );
    $ic544$ = makeString( "JavaLink._static(" );
    $ic545$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "METHOD" ), (SubLObject) makeSymbol( "S#10388", "CYC" ),
        (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic546$ = makeSymbol( "JAVA-CALL" );
    $ic547$ = makeString( "JavaLink._call(" );
    $ic42$ = makeString( "   ~A~%" );
    $ic43$ = makeString( " 	~%" );
    $ic74$ = ConsesLow.list( (SubLObject) makeKeyword( "NONE" ), (SubLObject) makeKeyword( "MEDIUM" ) );
    $ic75$ = makeString( "   module:      ~A~%" );
    $ic76$ = makeString( "   source file: ~A~%" );
    $ic77$ = makeKeyword( "HIGH" );
    $ic78$ = makeString( "   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%" );
    $ic79$ = makeString( "public final class " );
    $ic80$ = makeString( " extends SubLTranslatedFile " );
    $ic81$ = makeString( "{" );
    $ic82$ = makeString( "}" );
    $ic83$ = makeSymbol( "S#57506", "CYC" );
    $ic84$ = ConsesLow.list( (SubLObject) makeKeyword( "LOW" ), (SubLObject) makeKeyword( "HIGH" ) );
    $ic85$ = makeString( "module~4,'0D" );
    $ic86$ = makeKeyword( "&MEMOIZED-ITEM-NOT-FOUND&" );
    $ic87$ = makeString( "//// Constructor" );
    $ic88$ = makeString( "private ~A() {}" );
    $ic89$ = makeString( "public static final SubLFile me = new ~A();" );
    $ic90$ = makeString( "public static final String myName = ~S;" );
    $ic91$ = makeString( "public static final String myFingerPrint = ~S;" );
    $ic92$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57952", "CYC" ), (SubLObject) NIL ) );
    $ic93$ = makeSymbol( "SECOND" );
    $ic94$ = makeString( "//// Definitions" );
    $ic95$ = makeString( "//// Internal Constants" );
    $ic96$ = makeString( "//// Internal Constant Initializer Methods" );
    $ic97$ = makeSymbol( "DEFINE" );
    $ic98$ = makeSymbol( "S#56851", "CYC" );
    $ic99$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#30", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic100$ = makeSymbol( "S#57762", "CYC" );
    $ic101$ = makeString( "//// Initializers" );
    $ic102$ = makeString( "@Override public void declareFunctions() {" );
    $ic103$ = makeString( "@Override public void initializeVariables() {" );
    $ic104$ = makeString( "@Override public void runTopLevelForms() {" );
    $ic105$ = makeString( ";" );
    $ic106$ = makeString( "  " );
    $ic107$ = makeString( "Unexpected C backend atom : ~S" );
    $ic108$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CONSTANT", "CYC" ) );
    $ic109$ = makeSymbol( "S#56848", "CYC" );
    $ic110$ = makeString( "Time to implement a C backend translation for predefined constant ~S" );
    $ic111$ = makeKeyword( "DYNAMIC" );
    $ic112$ = makeKeyword( "LEXICAL" );
    $ic113$ = makeKeyword( "CONSTANT" );
    $ic114$ = makeKeyword( "UNSPECIFIED" );
    $ic115$ = makeKeyword( "LOCAL" );
    $ic116$ = makeString( "unexpected variable binding type ~S for ~S" );
    $ic117$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57949", "CYC" ), (SubLObject) makeSymbol( "S#57948", "CYC" ) ), (SubLObject) ConsesLow.list(
        (SubLObject) makeSymbol( "S#57948", "CYC" ), (SubLObject) makeSymbol( "S#57948", "CYC" ) ) );
    $ic118$ = makeKeyword( "ERROR" );
    $ic119$ = makeString( "~s is an undeclared variable; cannot translate" );
    $ic120$ = makeString( "v_" );
    $ic121$ = makeString( "_" );
    $ic122$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#57975", "CYC" ), (SubLObject) makeSymbol( "S#57976", "CYC" ) );
    $ic123$ = makeString( "var" );
    $ic124$ = makeSymbol( "S#57781", "CYC" );
    $ic125$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic126$ = makeKeyword( "UNKNOWN" );
    $ic127$ = makeString( "translating ~S call as funcall" );
    $ic128$ = makeSymbol( "FUNCALL" );
    $ic129$ = makeSymbol( "S#56855", "CYC" );
    $ic130$ = makeString( "~S called with ~S missing required arguments" );
    $ic131$ = makeString( "~S called with ~S excess arguments" );
    $ic132$ = makeString( "(" );
    $ic133$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#202", "CYC" ), (SubLObject) makeSymbol( "S#21366", "CYC" ) );
    $ic134$ = makeString( ")" );
    $ic135$ = makeKeyword( "IMPORTED" );
    $ic136$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57977", "CYC" ) );
    $ic137$ = makeSymbol( "S#57978", "CYC" );
    $ic138$ = makeString( "SubLObject" );
    $ic139$ = makeString( "_CSETF-" );
    $ic140$ = ConsesLow.list( (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#132", "CYC" ) );
    $ic141$ = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $ic142$ = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $ic143$ = makeString( "unable to introspect on ~S" );
    $ic144$ = makeString( "Unexpected function ~S" );
    $ic145$ = makeString( "UNPROVIDED" );
    $ic146$ = ConsesLow.list( new SubLObject[] { ConsesLow.cons( (SubLObject) makeSymbol( "S#56692", "CYC" ), (SubLObject) makeSymbol( "S#57853", "CYC" ) ), ConsesLow.cons(
        (SubLObject) makeSymbol( "S#56665", "CYC" ), (SubLObject) makeSymbol( "S#57795", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56668", "CYC" ),
            (SubLObject) makeSymbol( "S#57796", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56664", "CYC" ), (SubLObject) makeSymbol( "S#57854", "CYC" ) ),
      ConsesLow.cons( (SubLObject) makeSymbol( "S#56658", "CYC" ), (SubLObject) makeSymbol( "S#57797", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56659",
          "CYC" ), (SubLObject) makeSymbol( "S#57802", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#51", "CYC" ), (SubLObject) makeSymbol( "S#57803",
              "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56667", "CYC" ), (SubLObject) makeSymbol( "S#57804", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                  .makeSymbol( "CSETQ" ), (SubLObject) makeSymbol( "S#57805", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56660", "CYC" ), (SubLObject) SubLObjectFactory
                      .makeSymbol( "S#57806", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56661", "CYC" ), (SubLObject) makeSymbol( "S#57807", "CYC" ) ), ConsesLow.cons(
                          (SubLObject) makeSymbol( "S#56662", "CYC" ), (SubLObject) makeSymbol( "S#57808", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                              "S#56666", "CYC" ), (SubLObject) makeSymbol( "S#57810", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "CVS-ID" ), (SubLObject) SubLObjectFactory
                                  .makeSymbol( "S#57813", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "DEFCONSTANT" ), (SubLObject) makeSymbol( "S#57814", "CYC" ) ), ConsesLow
                                      .cons( (SubLObject) makeSymbol( "DEFINE" ), (SubLObject) makeSymbol( "S#57816", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                          .makeSymbol( "S#56710", "CYC" ), (SubLObject) makeSymbol( "S#57832", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "DEFLEXICAL" ),
                                              (SubLObject) makeSymbol( "S#57833", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "DEFPARAMETER" ), (SubLObject) SubLObjectFactory
                                                  .makeSymbol( "S#57834", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56711", "CYC" ), (SubLObject) makeSymbol( "S#57835",
                                                      "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" ), (SubLObject) makeSymbol( "S#57841",
                                                          "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "_DEFSTRUCT-GET-SLOT", "SUBLISP" ), (SubLObject) makeSymbol( "S#57842",
                                                              "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" ), (SubLObject) makeSymbol(
                                                                  "S#57843", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" ), (SubLObject) SubLObjectFactory
                                                                      .makeSymbol( "S#57844", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "DEFVAR" ), (SubLObject) makeSymbol(
                                                                          "S#57845", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56696", "CYC" ), (SubLObject) makeSymbol(
                                                                              "S#57792", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56713", "CYC" ), (SubLObject) SubLObjectFactory
                                                                                  .makeSymbol( "S#57793", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57449", "CYC" ),
                                                                                      (SubLObject) makeSymbol( "S#57855", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "FIF" ),
                                                                                          (SubLObject) makeSymbol( "S#57846", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                                                                              "S#56663", "CYC" ), (SubLObject) makeSymbol( "S#57856", "CYC" ) ), ConsesLow.cons(
                                                                                                  (SubLObject) makeSymbol( "S#56849", "CYC" ), (SubLObject) makeSymbol( "S#57857",
                                                                                                      "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56851", "CYC" ),
                                                                                                          (SubLObject) makeSymbol( "S#57860", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                                                                              .makeSymbol( "S#56855", "CYC" ), (SubLObject) makeSymbol( "S#57863", "CYC" ) ), ConsesLow
                                                                                                                  .cons( (SubLObject) makeSymbol( "S#57450", "CYC" ), (SubLObject) SubLObjectFactory
                                                                                                                      .makeSymbol( "S#57866", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                                                                                                          "MULTIPLE-VALUE-LIST" ), (SubLObject) makeSymbol( "S#57867", "CYC" ) ),
      ConsesLow.cons( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57868", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56701",
          "CYC" ), (SubLObject) makeSymbol( "S#57869", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "NTH-VALUE" ), (SubLObject) makeSymbol( "S#57871",
              "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56702", "CYC" ), (SubLObject) makeSymbol( "S#57872", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                  .makeSymbol( "S#56848", "CYC" ), (SubLObject) makeSymbol( "S#57770", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "PCOND" ), (SubLObject) SubLObjectFactory
                      .makeSymbol( "S#57847", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "PROGN" ), (SubLObject) makeSymbol( "S#57849", "CYC" ) ), ConsesLow.cons(
                          (SubLObject) makeSymbol( "S#56722", "CYC" ), (SubLObject) makeSymbol( "S#57848", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                              "S#56853", "CYC" ), (SubLObject) makeSymbol( "S#57873", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56854", "CYC" ),
                                  (SubLObject) makeSymbol( "S#57874", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56852", "CYC" ), (SubLObject) makeSymbol(
                                      "S#57876", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "RET" ), (SubLObject) makeSymbol( "S#57851", "CYC" ) ), ConsesLow.cons(
                                          (SubLObject) makeSymbol( "WHILE" ), (SubLObject) makeSymbol( "S#57852", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                              "S#56671", "CYC" ), (SubLObject) makeSymbol( "S#57878", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56669", "CYC" ),
                                                  (SubLObject) makeSymbol( "S#57879", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56670", "CYC" ),
                                                      (SubLObject) makeSymbol( "S#57880", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57979", "CYC" ),
                                                          (SubLObject) makeSymbol( "S#57881", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57623", "CYC" ),
                                                              (SubLObject) makeSymbol( "S#57886", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57625", "CYC" ),
                                                                  (SubLObject) makeSymbol( "S#57887", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57980", "CYC" ),
                                                                      (SubLObject) makeSymbol( "S#57888", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57981", "CYC" ),
                                                                          (SubLObject) makeSymbol( "S#57889", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57157", "CYC" ),
                                                                              (SubLObject) makeSymbol( "S#57890", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57982",
                                                                                  "CYC" ), (SubLObject) makeSymbol( "S#57891", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                                                                      "S#57685", "CYC" ), (SubLObject) makeSymbol( "S#57892", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                                                          .makeSymbol( "S#57983", "CYC" ), (SubLObject) makeSymbol( "S#57893", "CYC" ) ), ConsesLow.cons(
                                                                                              (SubLObject) makeSymbol( "S#57984", "CYC" ), (SubLObject) makeSymbol( "S#57894",
                                                                                                  "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57232", "CYC" ), (SubLObject) SubLObjectFactory
                                                                                                      .makeSymbol( "S#57895", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57985", "CYC" ),
                                                                                                          (SubLObject) makeSymbol( "S#57896", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                                                                              .makeSymbol( "S#56677", "CYC" ), (SubLObject) makeSymbol( "S#57897", "CYC" ) ), ConsesLow
                                                                                                                  .cons( (SubLObject) makeSymbol( "S#56678", "CYC" ), (SubLObject) SubLObjectFactory
                                                                                                                      .makeSymbol( "S#57898", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                                                                                                          "S#57241", "CYC" ), (SubLObject) makeSymbol( "S#57899", "CYC" ) ), ConsesLow
                                                                                                                              .cons( (SubLObject) makeSymbol( "S#57242", "CYC" ),
                                                                                                                                  (SubLObject) makeSymbol( "S#57900", "CYC" ) ), ConsesLow.cons(
                                                                                                                                      (SubLObject) makeSymbol( "S#57624", "CYC" ),
                                                                                                                                      (SubLObject) makeSymbol( "S#57901", "CYC" ) ), ConsesLow.cons(
                                                                                                                                          (SubLObject) makeSymbol( "S#56688", "CYC" ),
                                                                                                                                          (SubLObject) makeSymbol( "S#57902", "CYC" ) ), ConsesLow.cons(
                                                                                                                                              (SubLObject) makeSymbol( "S#57986", "CYC" ),
                                                                                                                                              (SubLObject) makeSymbol( "S#57903", "CYC" ) ), ConsesLow
                                                                                                                                                  .cons( (SubLObject) makeSymbol( "S#57978", "CYC" ),
                                                                                                                                                      (SubLObject) makeSymbol( "S#57904", "CYC" ) ),
      ConsesLow.cons( (SubLObject) makeSymbol( "S#57235", "CYC" ), (SubLObject) makeSymbol( "S#57905", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57238",
          "CYC" ), (SubLObject) makeSymbol( "S#57906", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56689", "CYC" ), (SubLObject) makeSymbol( "S#57907",
              "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57987", "CYC" ), (SubLObject) makeSymbol( "S#57908", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                  .makeSymbol( "S#57025", "CYC" ), (SubLObject) makeSymbol( "S#57909", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57988", "CYC" ),
                      (SubLObject) makeSymbol( "S#57850", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "JAVA-BOX", "SUBLISP" ), (SubLObject) makeSymbol(
                          "S#57989", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "JAVA-UNBOX", "SUBLISP" ), (SubLObject) makeSymbol( "S#57990", "CYC" ) ), ConsesLow.cons(
                              (SubLObject) makeSymbol( "JAVA-TO-SUBL", "SUBLISP" ), (SubLObject) makeSymbol( "S#57991", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                  .makeSymbol( "JAVA-NEW" ), (SubLObject) makeSymbol( "S#57939", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "JAVA-METHOD" ),
                                      (SubLObject) makeSymbol( "S#57940", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "JAVA-STATIC" ), (SubLObject) SubLObjectFactory
                                          .makeSymbol( "S#57941", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "JAVA-CALL" ), (SubLObject) makeSymbol( "S#57942", "CYC" ) )
    } );
    $ic147$ = makeString( "Time to implement the writer for ~S" );
    $ic148$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#155", "CYC" ) );
    $ic149$ = makeSymbol( "S#56696", "CYC" );
    $ic150$ = makeSymbol( "S#57981", "CYC" );
    $ic151$ = makeSymbol( "S#57625", "CYC" );
    $ic152$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) NIL );
    $ic153$ = makeSymbol( "S#56713", "CYC" );
    $ic154$ = makeSymbol( "QUOTE" );
    $ic155$ = makeSymbol( "S#56849", "CYC" );
    $ic156$ = makeSymbol( "S#57982", "CYC" );
    $ic157$ = makeString( "SubLSymbol" );
    $ic158$ = makeString( "checkType" );
    $ic159$ = makeString( "enforceType" );
    $ic160$ = makeString( "unexpected checker : ~S" );
    $ic161$ = makeSymbol( "S#57624", "CYC" );
    $ic162$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#150", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#768", "CYC" ), (SubLObject) makeSymbol( "S#56730", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic163$ = makeSymbol( "S#56665", "CYC" );
    $ic164$ = makeSymbol( "S#57025", "CYC" );
    $ic165$ = makeString( "throwStack.push" );
    $ic166$ = makeString( "Throwable" );
    $ic167$ = makeSymbol( "CSETQ" );
    $ic168$ = makeSymbol( "S#57693", "CYC" );
    $ic169$ = ConsesLow.list( (SubLObject) makeString( "throwStack.pop" ) );
    $ic170$ = makeUninternedSymbol( "US#5338052" );
    $ic171$ = makeSymbol( "S#56671", "CYC" );
    $ic172$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56695", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#56732", "CYC" ), (SubLObject) makeSymbol( "S#56729", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic173$ = makeSymbol( "S#56668", "CYC" );
    $ic174$ = makeSymbol( "S#57450", "CYC" );
    $ic175$ = makeSymbol( "S#57682", "CYC" );
    $ic176$ = ConsesLow.list( (SubLObject) makeString( "Iterator" ), (SubLObject) makeKeyword( "FINAL" ) );
    $ic177$ = makeSymbol( "WHILE" );
    $ic178$ = makeSymbol( "S#57683", "CYC" );
    $ic179$ = makeSymbol( "S#57684", "CYC" );
    $ic180$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#713", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic181$ = makeSymbol( "S#56658", "CYC" );
    $ic182$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#33", "CYC" ) );
    $ic183$ = makeSymbol( "S#57685", "CYC" );
    $ic184$ = makeSymbol( "S#57157", "CYC" );
    $ic185$ = makeSymbol( "S#57238", "CYC" );
    $ic186$ = makeSymbol( "S#56659", "CYC" );
    $ic187$ = makeSymbol( "S#57801", "CYC" );
    $ic188$ = makeString( "_PREV_BIND_" );
    $ic189$ = makeSymbol( "S#57954", "CYC" );
    $ic190$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57687", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#713", "CYC" ), (SubLObject) makeSymbol( "S#56731", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic191$ = makeSymbol( "S#56667", "CYC" );
    $ic192$ = makeUninternedSymbol( "US#A35DE3" );
    $ic193$ = makeSymbol( "S#57686", "CYC" );
    $ic194$ = ConsesLow.list( (SubLObject) makeString( "ArrayList" ), (SubLObject) makeKeyword( "FINAL" ) );
    $ic195$ = makeSymbol( "S#57688", "CYC" );
    $ic196$ = makeSymbol( "S#57689", "CYC" );
    $ic197$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#132", "CYC" ) );
    $ic198$ = makeSymbol( "S#56662", "CYC" );
    $ic199$ = makeSymbol( "S#56660", "CYC" );
    $ic200$ = makeSymbol( "S#56661", "CYC" );
    $ic201$ = makeString( "The constant variable ~S cannot be set" );
    $ic202$ = makeString( "Unexpected variable ~S" );
    $ic203$ = makeSymbol( "S#57241", "CYC" );
    $ic204$ = makeSymbol( "S#57242", "CYC" );
    $ic205$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#56730", "CYC" ), (SubLObject) makeSymbol( "S#152", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic206$ = makeSymbol( "S#56666", "CYC" );
    $ic207$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "PCOND" ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
        "S#56683", "CYC" ), (SubLObject) makeKeyword( "ANYTHING" ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeKeyword( "TEST" ),
            (SubLObject) makeSymbol( "S#57812", "CYC" ) ), (SubLObject) makeKeyword( "ANYTHING" ) ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list(
                (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57031", "CYC" ) ) ) ) );
    $ic208$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "IS-THREAD-PERFORMING-CLEANUP?", "SUBLISP" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
        "S#56848", "CYC" ), (SubLObject) T ) ) );
    $ic209$ = ConsesLow.list( (SubLObject) makeSymbol( "RELEASE-LOCK", "SUBLISP" ), (SubLObject) makeSymbol( "RW-LOCK-RELEASE-READ-LOCK" ), (SubLObject) makeSymbol(
        "RW-LOCK-RELEASE-WRITE-LOCK" ) );
    $ic210$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#38900", "CYC" ) );
    $ic211$ = makeSymbol( "CVS-ID" );
    $ic212$ = makeString( "// CVS_ID(" );
    $ic213$ = makeSymbol( "DEFCONSTANT" );
    $ic214$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#33", "CYC" ),
        (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) makeSymbol( "DOCUMENTATION" ) );
    $ic215$ = makeString( "private " );
    $ic216$ = makeString( "public " );
    $ic217$ = makeString( " " );
    $ic218$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57992", "CYC" ) );
    $ic219$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#30", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic220$ = makeString( "~S was not a top-level define" );
    $ic221$ = makeSymbol( "S#57453", "CYC" );
    $ic222$ = makeString( "Skip function ~S" );
    $ic223$ = ConsesLow.list( (SubLObject) makeSymbol( "DOCUMENTATION" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#56708", "CYC" ) );
    $ic224$ = makeSymbol( "S#57988", "CYC" );
    $ic225$ = makeString( "Method ~S does not return" );
    $ic226$ = makeString( " " );
    $ic227$ = makeSymbol( "S#57980", "CYC" );
    $ic228$ = makeString( "SubL" );
    $ic229$ = makeString( "source" );
    $ic230$ = makeString( "position" );
    $ic231$ = makeString( "static " );
    $ic232$ = makeString( "final " );
    $ic233$ = makeString( "()" );
    $ic234$ = makeSymbol( "S#56710", "CYC" );
    $ic235$ = makeSymbol( "DEFLEXICAL" );
    $ic236$ = makeSymbol( "DEFPARAMETER" );
    $ic237$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#57455", "CYC" ) );
    $ic238$ = makeSymbol( "S#56711", "CYC" );
    $ic239$ = makeKeyword( "NAME" );
    $ic240$ = makeKeyword( "SLOTS" );
    $ic241$ = makeString( "public static final class ~A extends SubLStructNative {~%" );
    $ic242$ = makeString( "@Override public SubLStructDecl getStructDecl() { return structDecl; }~%" );
    $ic243$ = makeString( "@Override " );
    $ic244$ = makeString( "public SubLObject getField~A() { return ~A; }~%" );
    $ic245$ = makeString( "public SubLObject setField~A(SubLObject value) { return ~A = value; }~%" );
    $ic246$ = makeString( "public SubLObject ~A = NIL;~%" );
    $ic247$ = makeString( "public static final SubLStructDeclNative structDecl =~%" );
    $ic248$ = makeString( ";~%" );
    $ic249$ = makeSymbol( "S#57837", "CYC" );
    $ic250$ = makeString( "$" );
    $ic251$ = makeString( "_native" );
    $ic252$ = makeSymbol( "S#57839", "CYC" );
    $ic253$ = makeKeyword( "PREDICATE" );
    $ic254$ = makeKeyword( "SLOT-KEYWORDS" );
    $ic255$ = makeKeyword( "GETTERS" );
    $ic256$ = makeKeyword( "SETTERS" );
    $ic257$ = makeKeyword( "PRINT-FUNCTION" );
    $ic258$ = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $ic259$ = makeSymbol( "S#57983", "CYC" );
    $ic260$ = makeSymbol( "S#57984", "CYC" );
    $ic261$ = ConsesLow.list( (SubLObject) makeString( "class" ) );
    $ic262$ = makeString( "String" );
    $ic263$ = makeSymbol( "S#57668", "CYC" );
    $ic264$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#56725", "CYC" ), (SubLObject) makeSymbol( "S#1534", "CYC" ),
        (SubLObject) makeSymbol( "S#56726", "CYC" ), (SubLObject) makeSymbol( "TYPE" ) );
    $ic265$ = makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" );
    $ic266$ = makeSymbol( "S#57986", "CYC" );
    $ic267$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#134", "CYC" ),
        (SubLObject) makeSymbol( "TYPE" ), (SubLObject) makeSymbol( "S#52297", "CYC" ) );
    $ic268$ = makeSymbol( "_DEFSTRUCT-GET-SLOT", "SUBLISP" );
    $ic269$ = makeInteger( 21 );
    $ic270$ = makeString( "getField" );
    $ic271$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#56725", "CYC" ),
        (SubLObject) makeSymbol( "S#56726", "CYC" ), (SubLObject) makeSymbol( "TYPE" ) );
    $ic272$ = makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" );
    $ic273$ = makeSymbol( "S#57623", "CYC" );
    $ic274$ = ConsesLow.list( (SubLObject) makeString( "getClass" ) );
    $ic275$ = ConsesLow.list( (SubLObject) T );
    $ic276$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) T ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
        .makeSymbol( "S#56848", "CYC" ), (SubLObject) NIL ) );
    $ic277$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#134", "CYC" ),
        (SubLObject) makeSymbol( "S#132", "CYC" ), (SubLObject) makeSymbol( "TYPE" ), (SubLObject) makeSymbol( "S#52297", "CYC" ) );
    $ic278$ = makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" );
    $ic279$ = makeString( "setField" );
    $ic280$ = makeSymbol( "S#57979", "CYC" );
    $ic281$ = makeSymbol( "DEFVAR" );
    $ic282$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CONDITION" ), (SubLObject) makeSymbol( "S#56714", "CYC" ),
        (SubLObject) makeSymbol( "S#56715", "CYC" ) );
    $ic283$ = makeString( " ? " );
    $ic284$ = makeString( " : " );
    $ic285$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#57456", "CYC" ) );
    $ic286$ = makeSymbol( "PCOND" );
    $ic287$ = ConsesLow.list( (SubLObject) makeSymbol( "PROGN" ) );
    $ic288$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57457", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#57458", "CYC" ) );
    $ic289$ = ConsesLow.list( (SubLObject) makeSymbol( "S#122", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#57459", "CYC" ) );
    $ic290$ = makeString( "if (" );
    $ic291$ = makeString( ") " );
    $ic292$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57031", "CYC" ) );
    $ic293$ = makeString( " else " );
    $ic294$ = makeString( " else if (" );
    $ic295$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#30", "CYC" ) );
    $ic296$ = makeSymbol( "S#56722", "CYC" );
    $ic297$ = makeString( "SubLSpecialOperatorDeclarations.proclaim(" );
    $ic298$ = makeString( ");" );
    $ic299$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic300$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#57993", "CYC" ) );
    $ic301$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#3267", "CYC" ) );
    $ic302$ = makeSymbol( "RET" );
    $ic303$ = makeString( "final SubLObject $currRetval = " );
    $ic304$ = makeString( "$currRetval" );
    $ic305$ = makeString( "return $currRetval;" );
    $ic306$ = makeString( "return " );
    $ic307$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#122", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic308$ = makeString( "while (" );
    $ic309$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#56690", "CYC" ) );
    $ic310$ = makeSymbol( "S#56692", "CYC" );
    $ic311$ = makeString( " && " );
    $ic312$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#131", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#704", "CYC" ), (SubLObject) makeSymbol( "S#28822", "CYC" ), (SubLObject) makeSymbol( "S#56729", "CYC" ), (SubLObject) makeSymbol( "S#50102",
            "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic313$ = makeSymbol( "S#56664", "CYC" );
    $ic314$ = makeSymbol( "S#57676", "CYC" );
    $ic315$ = makeSymbol( "S#57677", "CYC" );
    $ic316$ = makeSymbol( "S#57678", "CYC" );
    $ic317$ = ConsesLow.list( (SubLObject) makeString( "Entry" ), (SubLObject) makeKeyword( "FINAL" ) );
    $ic318$ = makeSymbol( "S#57679", "CYC" );
    $ic319$ = makeSymbol( "S#57680", "CYC" );
    $ic320$ = makeSymbol( "S#57681", "CYC" );
    $ic321$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ) );
    $ic322$ = makeSymbol( "S#57449", "CYC" );
    $ic323$ = makeString( "// ENTER()" );
    $ic324$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56727", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#122", "CYC" ), (SubLObject) makeSymbol( "S#56728", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic325$ = makeSymbol( "S#56663", "CYC" );
    $ic326$ = makeString( "for (" );
    $ic327$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#57460", "CYC" ), (SubLObject) makeSymbol( "S#57461", "CYC" ) );
    $ic328$ = makeString( "; " );
    $ic329$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#57462", "CYC" ), (SubLObject) makeSymbol( "S#57463", "CYC" ) );
    $ic330$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#57464", "CYC" ), (SubLObject) makeSymbol( "S#56850", "CYC" ) );
    $ic331$ = makeInteger( 32 );
    $ic332$ = makeString( "$ic~S$" );
    $ic333$ = makeString( "" );
    $ic334$ = makeString( "$str" );
    $ic335$ = makeString( "$kw" );
    $ic336$ = makeInteger( 64 );
    $ic337$ = makeString( "$sym" );
    $ic338$ = makeString( "$int" );
    $ic339$ = makeString( "$float" );
    $ic340$ = makeString( "$list" );
    $ic341$ = makeString( "$char" );
    $ic342$ = makeString( "$const" );
    $ic343$ = makeString( "$ic" );
    $ic344$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#57464", "CYC" ), (SubLObject) makeSymbol( "S#56850", "CYC" ),
        (SubLObject) makeSymbol( "S#57465", "CYC" ) );
    $ic345$ = makeString( "private static final " );
    $ic346$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic347$ = ConsesLow.list( (SubLObject) makeSymbol( "LIST" ), (SubLObject) makeSymbol( "CONS" ), (SubLObject) makeSymbol( "LIST" ) );
    $ic348$ = makeString( "SubLList" );
    $ic349$ = ConsesLow.list( (SubLObject) makeSymbol( "S#202", "CYC" ) );
    $ic350$ = makeString( "SubLString" );
    $ic351$ = makeString( "SubLInteger" );
    $ic352$ = makeString( "SubLFloat" );
    $ic353$ = makeString( "SubLCharacter" );
    $ic354$ = makeString( "SubLPackage" );
    $ic355$ = makeInteger( 1000 );
    $ic356$ = makeString( "_CONSTANT-" );
    $ic357$ = makeString( "-INITIALIZER" );
    $ic358$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ) );
    $ic359$ = makeSymbol( "S#57169", "CYC" );
    $ic360$ = makeSymbol( "S#57162", "CYC" );
    $ic361$ = makeSymbol( "S#57160", "CYC" );
    $ic362$ = makeSymbol( "S#57163", "CYC" );
    $ic363$ = makeSymbol( "S#57161", "CYC" );
    $ic364$ = makeSymbol( "S#57168", "CYC" );
    $ic365$ = makeSymbol( "S#57164", "CYC" );
    $ic366$ = makeString( "Time to add %LF support for ~S" );
    $ic367$ = makeInteger( 31 );
    $ic368$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "&OPTIONAL" ),
        (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#33", "CYC" ), (SubLObject) NIL, (SubLObject) makeSymbol( "S#57466", "CYC" ) ),
        (SubLObject) makeSymbol( "TYPE" ), (SubLObject) makeSymbol( "S#57994", "CYC" ) );
    $ic369$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic370$ = makeSymbol( "MULTIPLE-VALUE-LIST" );
    $ic371$ = makeSymbol( "S#57656", "CYC" );
    $ic372$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56689", "CYC" ) );
    $ic373$ = makeSymbol( "S#57233", "CYC" );
    $ic374$ = makeSymbol( "S#57029", "CYC" );
    $ic375$ = makeSymbol( "S#57031", "CYC" );
    $ic376$ = makeString( "true" );
    $ic377$ = makeSymbol( "S#57030", "CYC" );
    $ic378$ = makeString( "false" );
    $ic379$ = makeSymbol( "S#57992", "CYC" );
    $ic380$ = makeString( "null" );
    $ic381$ = makeSymbol( "S#57995", "CYC" );
    $ic382$ = makeSymbol( "S#57977", "CYC" );
    $ic383$ = makeString( "EMPTY_SUBL_OBJECT_ARRAY" );
    $ic384$ = makeString( "Unexpected native constant ~S" );
    $ic385$ = makeSymbol( "S#56701", "CYC" );
    $ic386$ = makeString( "(!(" );
    $ic387$ = makeString( "))" );
    $ic388$ = makeSymbol( "S#56683", "CYC" );
    $ic389$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#770", "CYC" ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic390$ = makeSymbol( "NTH-VALUE" );
    $ic391$ = makeSymbol( "S#57658", "CYC" );
    $ic392$ = makeSymbol( "S#57657", "CYC" );
    $ic393$ = makeSymbol( "S#56702", "CYC" );
    $ic394$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57030", "CYC" ) );
    $ic395$ = makeString( "|| " );
    $ic396$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "S#57467", "CYC" ),
        (SubLObject) makeSymbol( "S#57468", "CYC" ), (SubLObject) makeSymbol( "S#57469", "CYC" ) );
    $ic397$ = makeSymbol( "S#56853", "CYC" );
    $ic398$ = makeString( "declareFunction" );
    $ic399$ = makeString( "myName" );
    $ic400$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#752", "CYC" ), (SubLObject) makeSymbol( "S#673", "CYC" ),
        (SubLObject) makeSymbol( "S#33", "CYC" ) );
    $ic401$ = makeSymbol( "S#56854", "CYC" );
    $ic402$ = makeString( "defvar" );
    $ic403$ = makeString( "defparameter" );
    $ic404$ = makeString( "deflexical" );
    $ic405$ = makeString( "defconstant" );
    $ic406$ = makeString( "Unexpected definer ~S" );
    $ic407$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "FUNCTION" ) );
    $ic408$ = makeSymbol( "S#56852", "CYC" );
    $ic409$ = makeString( "declareMacro" );
    $ic410$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#56736", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic411$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57659", "CYC" ) ), (SubLObject) makeString( "SubLThread" ), (SubLObject) SubLObjectFactory
        .makeKeyword( "FINAL" ) );
    $ic412$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#1755", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#56733", "CYC" ), (SubLObject) makeSymbol( "S#56734", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic413$ = makeSymbol( "S#56669", "CYC" );
    $ic414$ = makeSymbol( "ERROR-HANDLER" );
    $ic415$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) NIL ) );
    $ic416$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#56730", "CYC" ), (SubLObject) makeSymbol( "S#761", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic417$ = makeSymbol( "S#56670", "CYC" );
    $ic418$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "GET-INTERNAL-REAL-TIME" ) ) );
    $ic419$ = makeSymbol( "S#57644", "CYC" );
    $ic420$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#169", "CYC" ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic421$ = makeSymbol( "S#57963", "CYC" );
    $ic422$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#35567", "CYC" ), (SubLObject) makeSymbol( "S#35568", "CYC" ),
        (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) makeSymbol( "S#57996", "CYC" ) );
    $ic423$ = makeSymbol( "NULL" );
    $ic424$ = makeString( " == " );
    $ic425$ = makeString( ".eql(" );
    $ic426$ = makeString( " != " );
    $ic427$ = makeString( "!" );
    $ic428$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#57997", "CYC" ), (SubLObject) makeSymbol( "&OPTIONAL" ),
        (SubLObject) makeSymbol( "S#57998", "CYC" ) );
    $ic429$ = makeString( "@" );
    $ic430$ = ConsesLow.list( (SubLObject) makeSymbol( "S#52297", "CYC" ), (SubLObject) makeSymbol( "S#132", "CYC" ) );
    $ic431$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CONDITION" ), (SubLObject) makeSymbol( "&OPTIONAL" ),
        (SubLObject) makeSymbol( "S#57999", "CYC" ) );
    $ic432$ = makeString( "assert " );
    $ic433$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "SYMBOL" ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic434$ = makeString( "bind" );
    $ic435$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "TYPE" ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic436$ = makeString( "((" );
    $ic437$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "SYMBOL" ) );
    $ic438$ = makeString( "currentBinding" );
    $ic439$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#9519", "CYC" ) );
    $ic440$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#29", "CYC" ) );
    $ic441$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#9672", "CYC" ) );
    $ic442$ = makeSymbol( "S#57232", "CYC" );
    $ic443$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57995", "CYC" ) ) );
    $ic444$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57031", "CYC" ) ) ) );
    $ic445$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "CLASS-NAME" ) );
    $ic446$ = makeSymbol( "S#57985", "CYC" );
    $ic447$ = makeString( " instanceof " );
    $ic448$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#673", "CYC" ) );
    $ic449$ = makeSymbol( "S#56677", "CYC" );
    $ic450$ = makeString( "getDynamicValue" );
    $ic451$ = ConsesLow.list( (SubLObject) makeString( "getDynamicValue" ) );
    $ic452$ = makeSymbol( "S#56678", "CYC" );
    $ic453$ = ConsesLow.list( (SubLObject) makeString( "getGlobalValue" ) );
    $ic454$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#673", "CYC" ), (SubLObject) makeSymbol( "S#132", "CYC" ) );
    $ic455$ = makeString( "setDynamicValue" );
    $ic456$ = makeString( "setGlobalValue" );
    $ic457$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "METHOD" ),
        (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic458$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#770", "CYC" ) );
    $ic459$ = makeSymbol( "S#56688", "CYC" );
    $ic460$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) ZERO_INTEGER );
    $ic461$ = ConsesLow.list( (SubLObject) makeString( "firstMultipleValue" ) );
    $ic462$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) ONE_INTEGER );
    $ic463$ = ConsesLow.list( (SubLObject) makeString( "secondMultipleValue" ) );
    $ic464$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) TWO_INTEGER );
    $ic465$ = ConsesLow.list( (SubLObject) makeString( "thirdMultipleValue" ) );
    $ic466$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) THREE_INTEGER );
    $ic467$ = ConsesLow.list( (SubLObject) makeString( "fourthMultipleValue" ) );
    $ic468$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) FOUR_INTEGER );
    $ic469$ = ConsesLow.list( (SubLObject) makeString( "fifthMultipleValue" ) );
    $ic470$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) FIVE_INTEGER );
    $ic471$ = ConsesLow.list( (SubLObject) makeString( "sixthMultipleValue" ) );
    $ic472$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) SIX_INTEGER );
    $ic473$ = ConsesLow.list( (SubLObject) makeString( "seventhMultipleValue" ) );
    $ic474$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) SEVEN_INTEGER );
    $ic475$ = ConsesLow.list( (SubLObject) makeString( "eighthMultipleValue" ) );
    $ic476$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CLASS-NAME" ), (SubLObject) makeSymbol( "&REST" ),
        (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic477$ = makeString( "new " );
    $ic478$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CLASS-NAME" ), (SubLObject) makeSymbol( "&OPTIONAL" ),
        (SubLObject) makeSymbol( "S#5477", "CYC" ) );
    $ic479$ = makeString( "[] {" );
    $ic480$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ) );
    $ic481$ = makeSymbol( "S#57235", "CYC" );
    $ic482$ = makeSymbol( "S#56691", "CYC" );
    $ic483$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "SYMBOL" ), (SubLObject) makeSymbol( "S#7128", "CYC" ) );
    $ic484$ = makeString( "rebind" );
    $ic485$ = makeSymbol( "S#56689", "CYC" );
    $ic486$ = ConsesLow.list( (SubLObject) makeString( "resetMultipleValues" ) );
    $ic487$ = makeSymbol( "S#57987", "CYC" );
    $ic488$ = makeString( "throw " );
    $ic489$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#57032", "CYC" ), (SubLObject) makeSymbol( "S#57033", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic490$ = makeString( "try " );
    $ic491$ = makeString( " finally " );
    $ic492$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "TYPE" ), (SubLObject) makeSymbol( "VARIABLE" ) ), (SubLObject) makeSymbol(
        "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic493$ = makeString( " catch (" );
    $ic494$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57032", "CYC" ), (SubLObject) makeSymbol( "S#57033", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic495$ = makeString( "Time to support non-null catch-clauses" );
    $ic496$ = makeSymbol( "CUNWIND-PROTECT" );
    $ic497$ = makeString(
        "\n  public static final class ~A extends UnaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem(SubLObject ~A) { return ~A; }\n  }" );
    $ic498$ = makeSymbol( "SYMBOLP" );
    $ic499$ = makeSymbol( "S#750", "CYC" );
    $ic500$ = makeString( "; new ~A()" );
    $ic501$ = makeSymbol( "S#57915", "CYC" );
    $ic502$ = makeString( "$UnaryFunction" );
    $ic503$ = ConsesLow.list( (SubLObject) makeSymbol( "S#750", "CYC" ) );
    $ic504$ = makeString(
        "\n  public static final class ~A extends BinaryFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem(SubLObject ~A, SubLObject ~A) { return ~A; }\n  }" );
    $ic505$ = makeSymbol( "S#751", "CYC" );
    $ic506$ = makeString( ";\n    new ~A()" );
    $ic507$ = makeSymbol( "S#57922", "CYC" );
    $ic508$ = makeString( "$BinaryFunction" );
    $ic509$ = ConsesLow.list( (SubLObject) makeSymbol( "S#750", "CYC" ), (SubLObject) makeSymbol( "S#751", "CYC" ) );
    $ic510$ = makeString(
        "\n  public static final class ~A extends ZeroArityFunction {\n    public ~A() { super(extractFunctionNamed(~S)); }\n    @Override public SubLObject processItem() { return ~A; }\n  }" );
    $ic511$ = makeString( "; \n    new ~A()" );
    $ic512$ = makeSymbol( "S#57928", "CYC" );
    $ic513$ = makeString( "$ZeroArityFunction" );
    $ic514$ = makeString( "/dev/null" );
    $ic515$ = makeString( "java" );
    $ic516$ = makeString( "~%    preparePercentProgress(~A);~%" );
    $ic517$ = makeString( "~%    initializeClass(\"~A\");" );
    $ic518$ = makeString( "~%~%    finishPercentProgress();~%" );
    $ic519$ = makeString( "filelist" );
    $ic520$ = makeString( "text" );
    $ic521$ = makeString( "com.cyc.cycjava.cycl.cycl" );
    $ic522$ = makeString( ".java" );
    $ic523$ = makeString(
        "\n\npackage com.cyc.cycjava.cycl;\n\nimport com.cyc.tool.subl.util.InitializingSubLFile;\nimport com.cyc.tool.subl.util.SubLFile;\nimport com.cyc.tool.subl.util.SubLFiles;\n\npublic class cycl extends InitializingSubLFile {\n  \n  //// Constructors\n  \n   Creates a new instance of cycl." );
  }
}