package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0012 extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.module0012";
  public static final String myFingerPrint = "9d85afbd224a160418cb77db4c11a0e59045cc44795fb739ad872496020b3a39";
  private static SubLSymbol $g39$;
  public static SubLSymbol $g40$;
  private static SubLSymbol $g42$;
  public static SubLSymbol $g43$;
  private static SubLSymbol $g44$;
  public static SubLSymbol $g45$;
  public static SubLSymbol $g46$;
  private static SubLSymbol $g47$;
  private static SubLSymbol $g48$;
  public static SubLSymbol $g49$;
  public static SubLSymbol $g50$;
  private static SubLSymbol $g51$;
  public static SubLSymbol $g52$;
  public static SubLSymbol $g53$;
  public static SubLSymbol $g54$;
  public static SubLSymbol $g55$;
  public static SubLSymbol $g56$;
  public static SubLSymbol $g57$;
  public static SubLSymbol $g58$;
  public static SubLSymbol $g59$;
  public static SubLSymbol $g62$;
  public static SubLSymbol $g63$;
  public static SubLSymbol $g64$;
  public static SubLSymbol $g65$;
  public static SubLSymbol $g66$;
  public static SubLSymbol $g67$;
  public static SubLSymbol $g68$;
  public static SubLSymbol $g69$;
  public static SubLSymbol $g70$;
  public static SubLSymbol $g71$;
  public static SubLSymbol $g72$;
  public static SubLSymbol $silent_progressP$;
  public static SubLSymbol $g74$;
  public static SubLSymbol $g75$;
  public static SubLSymbol $g76$;
  public static SubLSymbol $g77$;
  public static SubLSymbol $g78$;
  public static SubLSymbol $g79$;
  public static SubLSymbol $g80$;
  public static SubLSymbol $g82$;
  public static SubLSymbol $g73$;
  public static SubLSymbol $g83$;
  public static SubLSymbol $g84$;
  private static SubLSymbol $g85$;
  private static SubLSymbol $g86$;
  private static SubLSymbol $g87$;
  private static SubLSymbol $g88$;
  private static SubLSymbol $g89$;
  public static SubLSymbol $g90$;
  public static SubLSymbol $g91$;
  public static SubLSymbol $g92$;
  public static SubLSymbol $g93$;
  public static SubLSymbol $g94$;
  public static SubLSymbol $g95$;
  public static SubLSymbol $g96$;
  public static SubLSymbol $g97$;
  public static SubLSymbol $g98$;
  public static SubLSymbol $g99$;
  public static SubLSymbol $g100$;
  public static SubLSymbol $g101$;
  private static SubLSymbol $g102$;
  public static SubLSymbol $g103$;
  public static SubLSymbol $g104$;
  private static final SubLList $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLSymbol $ic6$;
  private static final SubLList $ic7$;
  private static final SubLList $ic8$;
  private static final SubLList $ic9$;
  private static final SubLSymbol $ic10$;
  private static final SubLSymbol $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLList $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLSymbol $ic15$;
  private static final SubLString $ic16$;
  private static final SubLSymbol $ic17$;
  private static final SubLInteger $ic18$;
  private static final SubLSymbol $ic19$;
  private static final SubLInteger $ic20$;
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
  private static final SubLString $ic31$;
  private static final SubLSymbol $ic32$;
  private static final SubLSymbol $ic33$;
  private static final SubLSymbol $ic34$;
  private static final SubLSymbol $ic35$;
  private static final SubLString $ic36$;
  private static final SubLSymbol $ic37$;
  private static final SubLString $ic38$;
  private static final SubLList $ic39$;
  private static final SubLString $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLSymbol $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLSymbol $ic44$;
  private static final SubLSymbol $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLList $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLSymbol $ic50$;
  private static final SubLList $ic51$;
  private static final SubLList $ic52$;
  private static final SubLList $ic53$;
  private static final SubLSymbol $ic54$;
  private static final SubLList $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLSymbol $ic57$;
  private static final SubLSymbol $ic58$;
  private static final SubLInteger $ic59$;
  private static final SubLSymbol $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLSymbol $ic62$;
  private static final SubLSymbol $ic63$;
  private static final SubLSymbol $ic64$;
  private static final SubLSymbol $ic65$;
  private static final SubLSymbol $ic66$;
  private static final SubLSymbol $ic67$;
  private static final SubLSymbol $ic68$;
  private static final SubLString $ic69$;
  private static final SubLList $ic70$;
  private static final SubLSymbol $ic71$;
  private static final SubLSymbol $ic72$;
  private static final SubLSymbol $ic73$;
  private static final SubLSymbol $ic74$;
  private static final SubLSymbol $ic75$;
  private static final SubLSymbol $ic76$;
  private static final SubLSymbol $ic77$;
  private static final SubLList $ic78$;
  private static final SubLSymbol $ic79$;
  private static final SubLList $ic80$;
  private static final SubLList $ic81$;
  private static final SubLList $ic82$;
  private static final SubLSymbol $ic83$;
  private static final SubLSymbol $ic84$;
  private static final SubLSymbol $ic85$;
  private static final SubLSymbol $ic86$;
  private static final SubLSymbol $ic87$;
  private static final SubLList $ic88$;
  private static final SubLList $ic89$;
  private static final SubLList $ic90$;
  private static final SubLSymbol $ic91$;
  private static final SubLSymbol $ic92$;
  private static final SubLSymbol $ic93$;
  private static final SubLSymbol $ic94$;
  private static final SubLSymbol $ic95$;
  private static final SubLSymbol $ic96$;
  private static final SubLSymbol $ic97$;
  private static final SubLSymbol $ic98$;
  private static final SubLList $ic99$;
  private static final SubLSymbol $ic100$;
  private static final SubLSymbol $ic101$;
  private static final SubLSymbol $ic102$;
  private static final SubLSymbol $ic103$;
  private static final SubLSymbol $ic104$;
  private static final SubLSymbol $ic105$;
  private static final SubLSymbol $ic106$;
  private static final SubLList $ic107$;
  private static final SubLSymbol $ic108$;
  private static final SubLSymbol $ic109$;
  private static final SubLList $ic110$;
  private static final SubLSymbol $ic111$;
  private static final SubLList $ic112$;
  private static final SubLSymbol $ic113$;
  private static final SubLSymbol $ic114$;
  private static final SubLSymbol $ic115$;
  private static final SubLSymbol $ic116$;
  private static final SubLSymbol $ic117$;
  private static final SubLSymbol $ic118$;
  private static final SubLList $ic119$;
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
  private static final SubLString $ic135$;
  private static final SubLSymbol $ic136$;
  private static final SubLSymbol $ic137$;
  private static final SubLSymbol $ic138$;
  private static final SubLSymbol $ic139$;
  private static final SubLSymbol $ic140$;
  private static final SubLSymbol $ic141$;
  private static final SubLSymbol $ic142$;
  private static final SubLList $ic143$;
  private static final SubLSymbol $ic144$;
  private static final SubLSymbol $ic145$;
  private static final SubLList $ic146$;
  private static final SubLSymbol $ic147$;
  private static final SubLSymbol $ic148$;
  private static final SubLList $ic149$;
  private static final SubLList $ic150$;
  private static final SubLSymbol $ic151$;
  private static final SubLList $ic152$;
  private static final SubLList $ic153$;
  private static final SubLSymbol $ic154$;
  private static final SubLSymbol $ic155$;
  private static final SubLList $ic156$;
  private static final SubLSymbol $ic157$;
  private static final SubLSymbol $ic158$;
  private static final SubLList $ic159$;
  private static final SubLSymbol $ic160$;
  private static final SubLSymbol $ic161$;
  private static final SubLList $ic162$;
  private static final SubLSymbol $ic163$;
  private static final SubLList $ic164$;
  private static final SubLList $ic165$;
  private static final SubLSymbol $ic166$;
  private static final SubLSymbol $ic167$;
  private static final SubLSymbol $ic168$;
  private static final SubLSymbol $ic169$;
  private static final SubLSymbol $ic170$;
  private static final SubLList $ic171$;
  private static final SubLList $ic172$;
  private static final SubLSymbol $ic173$;
  private static final SubLList $ic174$;
  private static final SubLSymbol $ic175$;
  private static final SubLSymbol $ic176$;
  private static final SubLSymbol $ic177$;
  private static final SubLList $ic178$;
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
  private static final SubLString $ic190$;
  private static final SubLString $ic191$;
  private static final SubLString $ic192$;
  private static final SubLString $ic193$;
  private static final SubLString $ic194$;
  private static final SubLString $ic195$;
  private static final SubLSymbol $ic196$;
  private static final SubLSymbol $ic197$;
  private static final SubLList $ic198$;
  private static final SubLSymbol $ic199$;
  private static final SubLList $ic200$;
  private static final SubLSymbol $ic201$;
  private static final SubLSymbol $ic202$;
  private static final SubLSymbol $ic203$;
  private static final SubLList $ic204$;
  private static final SubLList $ic205$;
  private static final SubLList $ic206$;
  private static final SubLSymbol $ic207$;
  private static final SubLList $ic208$;
  private static final SubLList $ic209$;
  private static final SubLSymbol $ic210$;
  private static final SubLList $ic211$;
  private static final SubLList $ic212$;
  private static final SubLList $ic213$;
  private static final SubLSymbol $ic214$;
  private static final SubLList $ic215$;
  private static final SubLList $ic216$;
  private static final SubLList $ic217$;
  private static final SubLList $ic218$;
  private static final SubLList $ic219$;
  private static final SubLList $ic220$;
  private static final SubLList $ic221$;
  private static final SubLSymbol $ic222$;
  private static final SubLSymbol $ic223$;
  private static final SubLList $ic224$;
  private static final SubLSymbol $ic225$;
  private static final SubLList $ic226$;
  private static final SubLList $ic227$;
  private static final SubLSymbol $ic228$;
  private static final SubLSymbol $ic229$;
  private static final SubLSymbol $ic230$;
  private static final SubLString $ic231$;
  private static final SubLSymbol $ic232$;
  private static final SubLString $ic233$;
  private static final SubLInteger $ic234$;
  private static final SubLString $ic235$;
  private static final SubLString $ic236$;
  private static final SubLSymbol $ic237$;
  private static final SubLInteger $ic238$;
  private static final SubLInteger $ic239$;
  private static final SubLInteger $ic240$;
  private static final SubLInteger $ic241$;
  private static final SubLString $ic242$;
  private static final SubLString $ic243$;
  private static final SubLSymbol $ic244$;
  private static final SubLList $ic245$;
  private static final SubLSymbol $ic246$;
  private static final SubLList $ic247$;
  private static final SubLSymbol $ic248$;
  private static final SubLSymbol $ic249$;
  private static final SubLSymbol $ic250$;
  private static final SubLString $ic251$;
  private static final SubLSymbol $ic252$;
  private static final SubLString $ic253$;
  private static final SubLSymbol $ic254$;
  private static final SubLString $ic255$;
  private static final SubLString $ic256$;
  private static final SubLInteger $ic257$;
  private static final SubLString $ic258$;
  private static final SubLInteger $ic259$;
  private static final SubLInteger $ic260$;
  private static final SubLString $ic261$;
  private static final SubLString $ic262$;
  private static final SubLString $ic263$;
  private static final SubLString $ic264$;
  private static final SubLString $ic265$;
  private static final SubLString $ic266$;
  private static final SubLString $ic267$;
  private static final SubLInteger $ic268$;
  private static final SubLString $ic269$;
  private static final SubLString $ic270$;
  private static final SubLString $ic271$;
  private static final SubLList $ic272$;
  private static final SubLString $ic273$;
  private static final SubLSymbol $ic274$;
  private static final SubLList $ic275$;
  private static final SubLSymbol $ic276$;
  private static final SubLList $ic277$;
  private static final SubLSymbol $ic278$;
  private static final SubLList $ic279$;
  private static final SubLList $ic280$;
  private static final SubLList $ic281$;
  private static final SubLList $ic282$;
  private static final SubLString $ic283$;
  private static final SubLSymbol $ic284$;
  private static final SubLSymbol $ic285$;
  private static final SubLSymbol $ic286$;
  private static final SubLSymbol $ic287$;
  private static final SubLList $ic288$;
  private static final SubLSymbol $ic289$;
  private static final SubLList $ic290$;
  private static final SubLSymbol $ic291$;
  private static final SubLSymbol $ic292$;
  private static final SubLList $ic293$;
  private static final SubLString $ic294$;
  private static final SubLSymbol $ic295$;
  private static final SubLSymbol $ic296$;
  private static final SubLSymbol $ic297$;
  private static final SubLList $ic298$;
  private static final SubLString $ic299$;
  private static final SubLSymbol $ic300$;
  private static final SubLSymbol $ic301$;
  private static final SubLSymbol $ic302$;
  private static final SubLList $ic303$;
  private static final SubLList $ic304$;
  private static final SubLSymbol $ic305$;
  private static final SubLSymbol $ic306$;
  private static final SubLSymbol $ic307$;
  private static final SubLSymbol $ic308$;
  private static final SubLSymbol $ic309$;
  private static final SubLSymbol $ic310$;
  private static final SubLString $ic311$;
  private static final SubLString $ic312$;
  private static final SubLSymbol $ic313$;
  private static final SubLList $ic314$;
  private static final SubLList $ic315$;
  private static final SubLList $ic316$;
  private static final SubLList $ic317$;
  private static final SubLSymbol $ic318$;
  private static final SubLSymbol $ic319$;
  private static final SubLList $ic320$;
  private static final SubLList $ic321$;
  private static final SubLSymbol $ic322$;
  private static final SubLList $ic323$;
  private static final SubLSymbol $ic324$;
  private static final SubLList $ic325$;
  private static final SubLList $ic326$;
  private static final SubLSymbol $ic327$;
  private static final SubLSymbol $ic328$;
  private static final SubLString $ic329$;
  private static final SubLString $ic330$;
  private static final SubLString $ic331$;
  private static final SubLList $ic332$;
  private static final SubLSymbol $ic333$;
  private static final SubLSymbol $ic334$;
  private static final SubLSymbol $ic335$;
  private static final SubLList $ic336$;
  private static final SubLSymbol $ic337$;
  private static final SubLList $ic338$;
  private static final SubLSymbol $ic339$;
  private static final SubLString $ic340$;
  private static final SubLList $ic341$;
  private static final SubLString $ic342$;
  private static final SubLSymbol $ic343$;
  private static final SubLList $ic344$;
  private static final SubLSymbol $ic345$;
  private static final SubLSymbol $ic346$;
  private static final SubLSymbol $ic347$;
  private static final SubLSymbol $ic348$;
  private static final SubLList $ic349$;
  private static final SubLString $ic350$;
  private static final SubLString $ic351$;
  private static final SubLList $ic352$;
  private static final SubLSymbol $ic353$;
  private static final SubLSymbol $ic354$;
  private static final SubLSymbol $ic355$;
  private static final SubLString $ic356$;
  private static final SubLString $ic357$;
  private static final SubLString $ic358$;
  private static final SubLSymbol $ic359$;
  private static final SubLSymbol $ic360$;
  private static final SubLSymbol $ic361$;
  private static final SubLSymbol $ic362$;
  private static final SubLList $ic363$;
  private static final SubLSymbol $ic364$;
  private static final SubLString $ic365$;
  private static final SubLList $ic366$;
  private static final SubLSymbol $ic367$;
  private static final SubLSymbol $ic368$;
  private static final SubLSymbol $ic369$;
  private static final SubLSymbol $ic370$;
  private static final SubLSymbol $ic371$;
  private static final SubLList $ic372$;
  private static final SubLString $ic373$;
  private static final SubLSymbol $ic374$;
  private static final SubLString $ic375$;
  private static final SubLString $ic376$;
  private static final SubLString $ic377$;
  private static final SubLList $ic378$;
  private static final SubLSymbol $ic379$;
  private static final SubLString $ic380$;
  private static final SubLSymbol $ic381$;
  private static final SubLSymbol $ic382$;
  private static final SubLList $ic383$;
  private static final SubLList $ic384$;
  private static final SubLSymbol $ic385$;
  private static final SubLList $ic386$;
  private static final SubLSymbol $ic387$;
  private static final SubLList $ic388$;
  private static final SubLList $ic389$;
  private static final SubLString $ic390$;
  private static final SubLList $ic391$;
  private static final SubLString $ic392$;
  private static final SubLString $ic393$;
  private static final SubLString $ic394$;
  private static final SubLSymbol $ic395$;
  private static final SubLSymbol $ic396$;
  private static final SubLSymbol $ic397$;
  private static final SubLSymbol $ic398$;
  private static final SubLSymbol $ic399$;
  private static final SubLSymbol $ic400$;
  private static final SubLSymbol $ic401$;
  private static final SubLSymbol $ic402$;
  private static final SubLSymbol $ic403$;
  private static final SubLList $ic404$;
  private static final SubLSymbol $ic405$;
  private static final SubLList $ic406$;
  private static final SubLSymbol $ic407$;
  private static final SubLString $ic408$;
  private static final SubLList $ic409$;
  private static final SubLSymbol $ic410$;
  private static final SubLSymbol $ic411$;
  private static final SubLString $ic412$;
  private static final SubLString $ic413$;
  private static final SubLString $ic414$;
  private static final SubLString $ic415$;
  private static final SubLString $ic416$;
  private static final SubLSymbol $ic417$;
  private static final SubLSymbol $ic418$;
  private static final SubLSymbol $ic419$;
  private static final SubLList $ic420$;
  private static final SubLSymbol $ic421$;
  private static final SubLString $ic422$;
  private static final SubLList $ic423$;
  private static final SubLList $ic424$;
  private static final SubLSymbol $ic425$;
  private static final SubLList $ic426$;
  private static final SubLList $ic427$;
  private static final SubLList $ic428$;
  private static final SubLSymbol $ic429$;
  private static final SubLSymbol $ic430$;
  private static final SubLString $ic431$;
  private static final SubLSymbol $ic432$;
  private static final SubLString $ic433$;
  private static final SubLSymbol $ic434$;
  private static final SubLString $ic435$;
  private static final SubLList $ic436$;
  private static final SubLSymbol $ic437$;
  private static final SubLList $ic438$;
  private static final SubLList $ic439$;
  private static final SubLSymbol $ic440$;
  private static final SubLSymbol $ic441$;
  private static final SubLSymbol $ic442$;
  private static final SubLSymbol $ic443$;
  private static final SubLSymbol $ic444$;
  private static final SubLList $ic445$;
  private static final SubLString $ic446$;
  private static final SubLString $ic447$;
  private static final SubLSymbol $ic448$;
  private static final SubLSymbol $ic449$;
  private static final SubLSymbol $ic450$;
  private static final SubLString $ic451$;
  private static final SubLList $ic452$;
  private static final SubLSymbol $ic453$;
  private static final SubLSymbol $ic454$;
  private static final SubLSymbol $ic455$;
  private static final SubLSymbol $ic456$;
  private static final SubLSymbol $ic457$;
  private static final SubLList $ic458$;
  private static final SubLSymbol $ic459$;
  private static final SubLInteger $ic460$;
  private static final SubLSymbol $ic461$;
  private static final SubLSymbol $ic462$;
  private static final SubLSymbol $ic463$;
  private static final SubLSymbol $ic464$;
  private static final SubLString $ic465$;
  private static final SubLSymbol $ic466$;
  private static final SubLSymbol $ic467$;
  private static final SubLSymbol $ic468$;
  private static final SubLSymbol $ic469$;
  private static final SubLSymbol $ic470$;
  private static final SubLSymbol $ic471$;
  private static final SubLList $ic472$;
  private static final SubLSymbol $ic473$;
  private static final SubLList $ic474$;
  private static final SubLSymbol $ic475$;
  private static final SubLSymbol $ic476$;
  private static final SubLList $ic477$;
  private static final SubLSymbol $ic478$;
  private static final SubLSymbol $ic479$;
  private static final SubLSymbol $ic480$;
  private static final SubLList $ic481$;
  private static final SubLSymbol $ic482$;
  private static final SubLSymbol $ic483$;
  private static final SubLSymbol $ic484$;
  private static final SubLList $ic485$;
  private static final SubLSymbol $ic486$;
  private static final SubLSymbol $ic487$;
  private static final SubLSymbol $ic488$;
  private static final SubLSymbol $ic489$;
  private static final SubLSymbol $ic490$;
  private static final SubLSymbol $ic491$;
  private static final SubLSymbol $ic492$;
  private static final SubLString $ic493$;
  private static final SubLList $ic494$;
  private static final SubLSymbol $ic495$;
  private static final SubLList $ic496$;
  private static final SubLSymbol $ic497$;
  private static final SubLList $ic498$;
  private static final SubLList $ic499$;
  private static final SubLSymbol $ic500$;
  private static final SubLSymbol $ic501$;
  private static final SubLString $ic502$;
  private static final SubLSymbol $ic503$;
  private static final SubLSymbol $ic504$;
  private static final SubLSymbol $ic505$;
  private static final SubLSymbol $ic506$;
  private static final SubLSymbol $ic507$;
  private static final SubLString $ic508$;
  private static final SubLList $ic509$;
  private static final SubLList $ic510$;
  private static final SubLList $ic511$;
  private static final SubLSymbol $ic512$;
  private static final SubLSymbol $ic513$;
  private static final SubLSymbol $ic514$;
  private static final SubLString $ic515$;
  private static final SubLString $ic516$;
  private static final SubLSymbol $ic517$;
  private static final SubLSymbol $ic518$;
  private static final SubLList $ic519$;
  private static final SubLString $ic520$;
  private static final SubLString $ic521$;
  private static final SubLSymbol $ic522$;
  private static final SubLString $ic523$;
  private static final SubLSymbol $ic524$;
  private static final SubLString $ic525$;
  private static final SubLSymbol $ic526$;
  private static final SubLList $ic527$;
  private static final SubLSymbol $ic528$;
  private static final SubLSymbol $ic529$;
  private static final SubLInteger $ic530$;
  private static final SubLSymbol $ic531$;
  private static final SubLSymbol $ic532$;
  private static final SubLSymbol $ic533$;
  private static final SubLSymbol $ic534$;
  private static final SubLSymbol $ic535$;
  private static final SubLList $ic536$;
  private static final SubLList $ic537$;
  private static final SubLList $ic538$;
  private static final SubLSymbol $ic539$;
  private static final SubLList $ic540$;
  private static final SubLList $ic541$;
  private static final SubLList $ic542$;
  private static final SubLSymbol $ic543$;
  private static final SubLList $ic544$;
  private static final SubLSymbol $ic545$;
  private static final SubLSymbol $ic546$;
  private static final SubLSymbol $ic547$;
  private static final SubLSymbol $ic548$;
  private static final SubLList $ic549$;
  private static final SubLList $ic550$;
  private static final SubLSymbol $ic551$;
  private static final SubLList $ic552$;
  private static final SubLSymbol $ic553$;
  private static final SubLList $ic554$;
  private static final SubLList $ic555$;
  private static final SubLSymbol $ic556$;
  private static final SubLList $ic557$;
  private static final SubLList $ic558$;
  private static final SubLList $ic559$;
  private static final SubLSymbol $ic560$;
  private static final SubLSymbol $ic561$;
  private static final SubLSymbol $ic562$;
  private static final SubLList $ic563$;
  private static final SubLInteger $ic564$;
  private static final SubLObject $ic565$;
  private static final SubLSymbol $ic566$;
  private static final SubLSymbol $ic567$;
  private static final SubLInteger $ic568$;
  private static final SubLInteger $ic569$;
  private static final SubLList $ic570$;
  private static final SubLList $ic571$;
  private static final SubLSymbol $ic572$;
  private static final SubLList $ic573$;
  private static final SubLSymbol $ic574$;
  private static final SubLSymbol $ic575$;
  private static final SubLSymbol $ic576$;
  private static final SubLList $ic577$;
  private static final SubLSymbol $ic578$;
  private static final SubLList $ic579$;
  private static final SubLSymbol $ic580$;
  private static final SubLSymbol $ic581$;
  private static final SubLSymbol $ic582$;
  private static final SubLList $ic583$;
  private static final SubLList $ic584$;
  private static final SubLSymbol $ic585$;

  public static SubLObject f362(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var9 = var5.first();
    final SubLObject var10;
    var5 = ( var10 = var5.rest() );
    assert NIL != Types.stringp( var8 ) : var8;
    assert NIL != Types.listp( var9 ) : var9;
    var3.resetMultipleValues();
    final SubLObject var11 = f363( var9 );
    final SubLObject var12 = var3.secondMultipleValue();
    final SubLObject var13 = var3.thirdMultipleValue();
    var3.resetMultipleValues();
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic4$, var6, var7, var8, ConsesLow.append( var12, var10, (SubLObject) NIL ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic5$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var6 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var7 ), var8,
            (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var11 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var13 ) ) );
  }

  public static SubLObject f364(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic7$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic7$ );
    var7 = var5.first();
    final SubLObject var8;
    var5 = ( var8 = var5.rest() );
    SubLObject var18_19;
    final SubLObject var16_17 = var18_19 = var8;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var10 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var18_19, var16_17, (SubLObject) $ic8$ );
    var9 = var18_19.first();
    var18_19 = var18_19.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var18_19, var16_17, (SubLObject) $ic8$ );
    var10 = var18_19.first();
    var18_19 = var18_19.rest();
    if( NIL != var18_19 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var16_17, (SubLObject) $ic8$ );
      return (SubLObject) NIL;
    }
    assert NIL != Types.stringp( var9 ) : var9;
    assert NIL != Types.listp( var10 ) : var10;
    var3.resetMultipleValues();
    final SubLObject var11 = f363( var10 );
    final SubLObject var12 = var3.secondMultipleValue();
    final SubLObject var13 = var3.thirdMultipleValue();
    var3.resetMultipleValues();
    return (SubLObject) ConsesLow.list( (SubLObject) $ic5$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var6 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var7 ), var9,
        (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var11 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var13 ) );
  }

  public static SubLObject f365(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic9$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic9$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic9$ );
    var7 = var4.first();
    final SubLObject var8;
    var4 = ( var8 = var4.rest() );
    assert NIL != Types.stringp( var7 ) : var7;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic10$, var5, var6, var7, ConsesLow.append( var8, (SubLObject) NIL ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic11$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var6 ), var7 ) );
  }

  public static SubLObject f366(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic0$ );
    var9 = var5.first();
    final SubLObject var10;
    var5 = ( var10 = var5.rest() );
    assert NIL != Types.stringp( var8 ) : var8;
    assert NIL != Types.listp( var9 ) : var9;
    var3.resetMultipleValues();
    final SubLObject var11 = f363( var9 );
    final SubLObject var12 = var3.secondMultipleValue();
    final SubLObject var13 = var3.thirdMultipleValue();
    var3.resetMultipleValues();
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic12$, var6, var7, var8, ConsesLow.append( var12, var10, (SubLObject) NIL ) ) );
  }

  public static SubLObject f367(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic13$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic13$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic13$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic13$ );
    var8 = var4.first();
    final SubLObject var9;
    var4 = ( var9 = var4.rest() );
    assert NIL != Types.stringp( var7 ) : var7;
    assert NIL != Types.listp( var8 ) : var8;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic14$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ),
        (SubLObject) ConsesLow.listS( (SubLObject) $ic10$, var5, var6, var7, ConsesLow.append( var9, (SubLObject) NIL ) ) );
  }

  public static SubLObject f368(final SubLObject var6, final SubLObject var7, final SubLObject var27, final SubLObject var11, final SubLObject var13)
  {
    f369( var6 );
    f370( var6 );
    f371( var6, var7 );
    f372( var6, var27 );
    f373( var6, var11 );
    f374( var6, var13 );
    return (SubLObject) NIL;
  }

  public static SubLObject f375(final SubLObject var6, final SubLObject var22, final SubLObject var27)
  {
    f376( var6 );
    f370( var6 );
    f371( var6, var22 );
    f372( var6, var27 );
    return (SubLObject) NIL;
  }

  public static SubLObject f377(final SubLObject var28)
  {
    return module0035.sublisp_boolean( Hashtables.gethash( var28, $g39$.getGlobalValue(), (SubLObject) NIL ) );
  }

  public static SubLObject f378(final SubLObject var28)
  {
    return Hashtables.gethash( var28, $g39$.getGlobalValue(), (SubLObject) UNPROVIDED );
  }

  public static SubLObject f379(final SubLObject var28, final SubLObject var29)
  {
    if( NIL != f380( var28 ) || NIL != f381( var28 ) )
    {
      Errors.warn( (SubLObject) $ic16$, var28 );
    }
    else
    {
      Hashtables.sethash( var28, $g39$.getGlobalValue(), var29 );
    }
    return var28;
  }

  public static SubLObject f380(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    if( NIL != f382( var28 ) )
    {
      return module0110.$g41$.getDynamicValue( var29 );
    }
    return Hashtables.gethash( var28, $g40$.getGlobalValue(), (SubLObject) NIL );
  }

  public static SubLObject f369(final SubLObject var28)
  {
    if( NIL == f377( var28 ) )
    {
      Hashtables.sethash( var28, $g40$.getGlobalValue(), (SubLObject) T );
    }
    return var28;
  }

  public static SubLObject f383(final SubLObject var28)
  {
    return Hashtables.remhash( var28, $g40$.getGlobalValue() );
  }

  public static SubLObject f382(final SubLObject var28)
  {
    return Hashtables.gethash( var28, $g42$.getGlobalValue(), (SubLObject) NIL );
  }

  public static SubLObject f384(final SubLObject var28)
  {
    if( NIL == f377( var28 ) )
    {
      Hashtables.sethash( var28, $g42$.getGlobalValue(), (SubLObject) T );
    }
    return var28;
  }

  public static SubLObject f385(final SubLObject var28)
  {
    return Hashtables.remhash( var28, $g42$.getGlobalValue() );
  }

  public static SubLObject f381(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    if( NIL != f386( var28 ) )
    {
      return module0110.$g41$.getDynamicValue( var29 );
    }
    return Hashtables.gethash( var28, $g43$.getGlobalValue(), (SubLObject) NIL );
  }

  public static SubLObject f376(final SubLObject var28)
  {
    if( NIL == f377( var28 ) )
    {
      Hashtables.sethash( var28, $g43$.getGlobalValue(), (SubLObject) T );
    }
    return var28;
  }

  public static SubLObject f387(final SubLObject var28)
  {
    return Hashtables.remhash( var28, $g43$.getGlobalValue() );
  }

  public static SubLObject f386(final SubLObject var28)
  {
    return Hashtables.gethash( var28, $g44$.getGlobalValue(), (SubLObject) NIL );
  }

  public static SubLObject f388(final SubLObject var28)
  {
    if( NIL == f377( var28 ) )
    {
      Hashtables.sethash( var28, $g44$.getGlobalValue(), (SubLObject) T );
    }
    return var28;
  }

  public static SubLObject f389(final SubLObject var28)
  {
    return Hashtables.remhash( var28, $g44$.getGlobalValue() );
  }

  public static SubLObject f390(final SubLObject var30)
  {
    return (SubLObject) makeBoolean( var30.isSymbol() && NIL != Symbols.get( var30, (SubLObject) $ic24$, (SubLObject) NIL ) );
  }

  public static SubLObject f370(final SubLObject var6)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    Symbols.put( var6, (SubLObject) $ic24$, (SubLObject) T );
    if( NIL == conses_high.member( var6, $g45$.getGlobalValue(), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
    {
      $g45$.setGlobalValue( (SubLObject) ConsesLow.cons( var6, $g45$.getGlobalValue() ) );
    }
    return var6;
  }

  public static SubLObject f391(final SubLObject var6)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    Sequences.remove( var6, $g45$.getGlobalValue(), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
        (SubLObject) UNPROVIDED );
    return Symbols.remprop( var6, (SubLObject) $ic24$ );
  }

  public static SubLObject f392(final SubLObject var6)
  {
    return Symbols.get( var6, (SubLObject) $ic26$, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f371(final SubLObject var6, final SubLObject var7)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    assert NIL != Types.listp( var7 ) : var7;
    Symbols.put( var6, (SubLObject) $ic26$, var7 );
    return var6;
  }

  public static SubLObject f393(final SubLObject var6)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    return Symbols.remprop( var6, (SubLObject) $ic26$ );
  }

  public static SubLObject f372(final SubLObject var6, final SubLObject var8)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    assert NIL != Types.stringp( var8 ) : var8;
    return (SubLObject) NIL;
  }

  public static SubLObject f394(final SubLObject var6)
  {
    return Symbols.get( var6, (SubLObject) $ic27$, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f373(final SubLObject var6, final SubLObject var31)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    assert NIL != Types.listp( var31 ) : var31;
    Symbols.put( var6, (SubLObject) $ic27$, var31 );
    return var6;
  }

  public static SubLObject f395(final SubLObject var6)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    return Symbols.remprop( var6, (SubLObject) $ic27$ );
  }

  public static SubLObject f396(final SubLObject var6)
  {
    return Symbols.get( var6, (SubLObject) $ic28$, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f374(final SubLObject var6, final SubLObject var13)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    assert NIL != Types.listp( var13 ) : var13;
    SubLObject var14 = var13;
    SubLObject var15 = (SubLObject) NIL;
    var15 = var14.first();
    while ( NIL != var14)
    {
      f397( var15 );
      var14 = var14.rest();
      var15 = var14.first();
    }
    Symbols.put( var6, (SubLObject) $ic28$, var13 );
    return var6;
  }

  public static SubLObject f398(final SubLObject var6)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    return Symbols.remprop( var6, (SubLObject) $ic28$ );
  }

  public static SubLObject f363(final SubLObject var9)
  {
    final SubLThread var10 = SubLProcess.currentSubLThread();
    var10.resetMultipleValues();
    final SubLObject var11 = f399( var9, (SubLObject) NIL );
    final SubLObject var12 = var10.secondMultipleValue();
    final SubLObject var13 = var10.thirdMultipleValue();
    final SubLObject var14 = var10.fourthMultipleValue();
    var10.resetMultipleValues();
    return Values.values( var11, var12, var13 );
  }

  public static SubLObject f400(final SubLObject var35)
  {
    return f399( var35, (SubLObject) T );
  }

  public static SubLObject f399(final SubLObject var35, final SubLObject var36)
  {
    SubLObject var37 = (SubLObject) NIL;
    SubLObject var38 = (SubLObject) NIL;
    SubLObject var39 = (SubLObject) NIL;
    SubLObject var40 = (SubLObject) NIL;
    SubLObject var41 = var35;
    SubLObject var42 = (SubLObject) NIL;
    var42 = var41.first();
    while ( NIL != var41)
    {
      final SubLObject var43 = var42.first();
      if( var43.eql( (SubLObject) $ic30$ ) )
      {
        if( NIL == var36 )
        {
          Errors.error( (SubLObject) $ic31$ );
        }
        var37 = var42.rest();
      }
      else if( var43.eql( (SubLObject) $ic32$ ) )
      {
        SubLObject var32_39;
        var38 = ( var32_39 = var42.rest() );
        SubLObject var44 = (SubLObject) NIL;
        var44 = var32_39.first();
        while ( NIL != var32_39)
        {
          var39 = ConsesLow.append( var39, (SubLObject) ConsesLow.list( f401( var44 ) ) );
          var32_39 = var32_39.rest();
          var44 = var32_39.first();
        }
      }
      else if( var43.eql( (SubLObject) $ic33$ ) )
      {
        var40 = var42.rest();
      }
      var41 = var41.rest();
      var42 = var41.first();
    }
    return Values.values( var38, var39, var40, var37 );
  }

  public static SubLObject f401(final SubLObject var40)
  {
    final SubLThread var41 = SubLProcess.currentSubLThread();
    final SubLObject var42 = var40.first();
    final SubLObject var43 = conses_high.second( var40 );
    SubLObject var44 = (SubLObject) NIL;
    if( var43.isAtom() )
    {
      if( NIL == conses_high.member( var43, $g46$.getGlobalValue(), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        $g46$.setGlobalValue( (SubLObject) ConsesLow.cons( var43, $g46$.getGlobalValue() ) );
      }
      return (SubLObject) ConsesLow.list( (SubLObject) $ic34$, var42, var43 );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var41 ) && var43.first() != $ic35$ )
    {
      Errors.error( (SubLObject) $ic36$, var40 );
    }
    var44 = conses_high.second( var43 );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var42, (SubLObject) ConsesLow.list( (SubLObject) $ic34$, var42, var44 ) );
  }

  public static SubLObject f397(final SubLObject var33)
  {
    final SubLThread var34 = SubLProcess.currentSubLThread();
    if( var33.isAtom() )
    {
      if( NIL == conses_high.member( var33, $g46$.getGlobalValue(), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        $g46$.setGlobalValue( (SubLObject) ConsesLow.cons( var33, $g46$.getGlobalValue() ) );
      }
      return (SubLObject) T;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var34 ) && !Sequences.length( var33 ).eql( (SubLObject) TWO_INTEGER ) )
    {
      Errors.error( (SubLObject) $ic38$, var33 );
    }
    if( NIL != conses_high.member( var33.first(), (SubLObject) $ic39$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
    {
      return f397( conses_high.second( var33 ) );
    }
    Errors.error( (SubLObject) $ic40$, var33 );
    return (SubLObject) T;
  }

  public static SubLObject f402(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic42$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) );
  }

  public static SubLObject f403(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic42$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) );
  }

  public static SubLObject f404(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic42$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) );
  }

  public static SubLObject f405(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic42$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) );
  }

  public static SubLObject f406(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic42$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) );
  }

  public static SubLObject f407(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic48$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic48$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic42$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) );
  }

  public static SubLObject f408(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic48$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic48$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic42$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) );
  }

  public static SubLObject f409(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic51$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic51$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = (SubLObject) $ic52$;
      final SubLObject var8 = (SubLObject) ConsesLow.list( (SubLObject) $ic37$, (SubLObject) $ic53$, (SubLObject) ConsesLow.list( (SubLObject) $ic54$, reader.bq_cons( var6,
          (SubLObject) $ic55$ ) ) );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic42$, var5, var7, var8 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic51$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f410(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic56$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic57$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ) );
  }

  public static SubLObject f411(final SubLObject var64)
  {
    return Hashtables.gethash_without_values( var64, $g47$.getGlobalValue(), (SubLObject) UNPROVIDED );
  }

  public static SubLObject f412(final SubLObject var64)
  {
    assert NIL != Types.symbolp( var64 ) : var64;
    Hashtables.sethash( var64, $g47$.getGlobalValue(), (SubLObject) T );
    return var64;
  }

  public static SubLObject f413(final SubLObject var64)
  {
    assert NIL != Types.symbolp( var64 ) : var64;
    return Hashtables.remhash( var64, $g47$.getGlobalValue() );
  }

  public static SubLObject f414()
  {
    Hashtables.clrhash( $g47$.getGlobalValue() );
    return (SubLObject) T;
  }

  public static SubLObject f415()
  {
    SubLObject var65 = (SubLObject) NIL;
    SubLObject var66 = (SubLObject) NIL;
    SubLObject var67 = (SubLObject) NIL;
    final Iterator var68 = Hashtables.getEntrySetIterator( $g47$.getGlobalValue() );
    try
    {
      while ( Hashtables.iteratorHasNext( var68 ))
      {
        final Map.Entry var69 = Hashtables.iteratorNextEntry( var68 );
        var66 = Hashtables.getEntryKey( var69 );
        var67 = Hashtables.getEntryValue( var69 );
        var65 = (SubLObject) ConsesLow.cons( var66, var65 );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( var68 );
    }
    var65 = Sort.sort( var65, Symbols.symbol_function( (SubLObject) $ic60$ ), Symbols.symbol_function( (SubLObject) $ic61$ ) );
    return var65;
  }

  public static SubLObject f416(final SubLObject var60)
  {
    return f412( var60 );
  }

  public static SubLObject f417(final SubLObject var60)
  {
    return f413( var60 );
  }

  public static SubLObject f418(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic7$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic63$, var5, var6, ConsesLow.append( var7, (SubLObject) NIL ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic64$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ) );
  }

  public static SubLObject f419(final SubLObject var64)
  {
    Symbols.put( var64, $g48$.getGlobalValue(), (SubLObject) T );
    return (SubLObject) T;
  }

  public static SubLObject f420(final SubLObject var64)
  {
    return Symbols.get( var64, $g48$.getGlobalValue(), (SubLObject) NIL );
  }

  public static SubLObject f421(final SubLObject var71)
  {
    return Equality.eq( var71, $g49$.getGlobalValue() );
  }

  public static SubLObject f422(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic70$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic70$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic70$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic70$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic71$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ), var6, var7, (SubLObject) ConsesLow.list( (SubLObject) $ic6$,
          var8 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic70$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f423(final SubLObject var74, final SubLObject var75, final SubLObject var76, final SubLObject var77)
  {
    assert NIL != Types.symbolp( var74 ) : var74;
    assert NIL != Types.stringp( var75 ) : var75;
    assert NIL != Types.stringp( var76 ) : var76;
    Symbols.put( var74, (SubLObject) $ic72$, var75 );
    Symbols.put( var74, (SubLObject) $ic73$, var76 );
    Symbols.put( var74, (SubLObject) $ic74$, var77 );
    return var74;
  }

  public static SubLObject f424(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic75$, (SubLObject) $ic76$, ConsesLow.append( var5, (SubLObject) NIL ) );
  }

  public static SubLObject f425()
  {
    Dynamic.sublisp_throw( (SubLObject) $ic76$, (SubLObject) NIL );
    return (SubLObject) NIL;
  }

  public static SubLObject f426(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic75$, (SubLObject) $ic77$, ConsesLow.append( var5, (SubLObject) NIL ) );
  }

  public static SubLObject f427()
  {
    Dynamic.sublisp_throw( (SubLObject) $ic77$, (SubLObject) NIL );
    return (SubLObject) NIL;
  }

  public static SubLObject f428(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic78$ );
    var5 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic79$, var5, (SubLObject) $ic80$ );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic78$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f429(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    if( NIL != var3 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) NIL );
    }
    return (SubLObject) $ic81$;
  }

  public static SubLObject f430(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic82$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic82$ );
    var6 = var4.first();
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic82$ );
    var4 = var4.rest();
    if( NIL != var4 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic82$ );
      return (SubLObject) NIL;
    }
    final SubLObject var8 = (SubLObject) $ic83$;
    if( NIL != var7 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var8, var5 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic85$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic86$, var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic87$, (SubLObject) ConsesLow.list( var8 ), var6 ), var7 ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var8, var5 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic37$,
        (SubLObject) ConsesLow.list( (SubLObject) $ic86$, var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic87$, (SubLObject) ConsesLow.list( var8 ), var6 ) ) );
  }

  public static SubLObject f431(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic88$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic85$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic87$, (SubLObject) ConsesLow.list( var5 ), ConsesLow.append( var6,
        (SubLObject) NIL ) ), ConsesLow.append( var6, (SubLObject) NIL ) );
  }

  public static SubLObject f432(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic89$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic89$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var98_99 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic89$ );
      var98_99 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic89$ );
      if( NIL == conses_high.member( var98_99, (SubLObject) $ic90$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var98_99 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic89$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic92$, var4 );
    final SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic93$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL );
    final SubLObject var14 = f433( var6 );
    return reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( (SubLObject) ( ( NIL != var11 ) ? ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow
        .list( (SubLObject) $ic95$, var11, var5 ) ) ) : NIL ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.listS( (SubLObject) $ic96$, var5, var14, ConsesLow.append(
            (SubLObject) ( ( NIL != var13 ) ? ConsesLow.list( var13 ) : NIL ), (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic97$, (SubLObject) ConsesLow
                .list( (SubLObject) $ic6$, var5 ), var6 ) ) ) );
  }

  public static SubLObject f434()
  {
    SubLObject var32 = $g51$.getGlobalValue();
    SubLObject var33 = (SubLObject) NIL;
    var33 = var32.first();
    while ( NIL != var32)
    {
      SubLObject var35;
      final SubLObject var34 = var35 = var33;
      SubLObject var36 = (SubLObject) NIL;
      SubLObject var37 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var35, var34, (SubLObject) $ic99$ );
      var36 = var35.first();
      var35 = ( var37 = var35.rest() );
      f435( var36, var37 );
      var32 = var32.rest();
      var33 = var32.first();
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f436(final SubLObject var108, final SubLObject var6)
  {
    assert NIL != Types.symbolp( var108 ) : var108;
    assert NIL != Types.stringp( var6 ) : var6;
    $g51$.setGlobalValue( Sequences.delete( var108, $g51$.getGlobalValue(), Symbols.symbol_function( (SubLObject) EQL ), Symbols.symbol_function( (SubLObject) $ic100$ ),
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) );
    $g51$.setGlobalValue( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.cons( var108, var6 ), $g51$.getGlobalValue() ) );
    return $g51$.getGlobalValue();
  }

  public static SubLObject f437(final SubLObject var109)
  {
    return module0035.sublisp_boolean( conses_high.assoc( var109, $g51$.getGlobalValue(), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) );
  }

  public static SubLObject f433(final SubLObject var6)
  {
    assert NIL != Types.stringp( var6 ) : var6;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic101$, var6 );
  }

  public static SubLObject f438(final SubLObject var108)
  {
    assert NIL != f437( var108 ) : var108;
    final SubLObject var109 = conses_high.assoc( var108, $g51$.getGlobalValue(), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ).rest();
    if( var109.isString() )
    {
      f435( var108, var109 );
    }
    return Symbols.symbol_value( var108 );
  }

  public static SubLObject f435(final SubLObject var108, final SubLObject var6)
  {
    final SubLObject var109 = f433( var6 );
    Eval.eval( (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var108, var109 ) );
    return Symbols.symbol_value( var108 );
  }

  public static SubLObject f439(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic107$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic108$, var5, var6, var7 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic109$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ), (SubLObject) $ic110$ ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic107$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f440(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic111$, (SubLObject) $ic106$, (SubLObject) $ic112$, ConsesLow.append( var5, (SubLObject) NIL ) );
  }

  public static SubLObject f441(final SubLObject var74)
  {
    if( NIL == conses_high.member( var74, $g53$.getGlobalValue(), Symbols.symbol_function( (SubLObject) EQL ), Symbols.symbol_function( (SubLObject) IDENTITY ) ) )
    {
      $g53$.setGlobalValue( (SubLObject) ConsesLow.cons( var74, $g53$.getGlobalValue() ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f442(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic107$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    if( NIL != var4 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic107$ );
      return (SubLObject) NIL;
    }
    if( NIL != module0011.f329() )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic114$, var5, var6, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic115$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic114$, var5, var6, var7 );
  }

  public static SubLObject f443(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic107$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    if( NIL != var4 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic107$ );
      return (SubLObject) NIL;
    }
    if( NIL != module0011.f329() )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic116$, var5, var6, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic115$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic116$, var5, var6, var7 );
  }

  public static SubLObject f444(final SubLObject var74)
  {
    if( NIL == conses_high.member( var74, $g54$.getGlobalValue(), Symbols.symbol_function( (SubLObject) EQL ), Symbols.symbol_function( (SubLObject) IDENTITY ) ) )
    {
      $g54$.setGlobalValue( (SubLObject) ConsesLow.cons( var74, $g54$.getGlobalValue() ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f445(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic107$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    if( NIL != var4 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic107$ );
      return (SubLObject) NIL;
    }
    if( NIL != module0011.f329() )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic114$, var5, var6, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic115$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic118$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic114$, var5, var6, var7 );
  }

  public static SubLObject f446(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic107$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic107$ );
    var4 = var4.rest();
    if( NIL != var4 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic107$ );
      return (SubLObject) NIL;
    }
    if( NIL != module0011.f329() )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic116$, var5, var6, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic115$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic118$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ) ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic116$, var5, var6, var7 );
  }

  public static SubLObject f447(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic119$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic119$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic119$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic119$ );
    var8 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic119$ );
    var9 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var10 = f448( var9 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( var10, var5, var7, ConsesLow.append( (SubLObject) ( ( NIL != var8 ) ? ConsesLow.list( var8 )
          : NIL ), (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic109$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ), var6 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic119$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f449(final SubLObject var74, final SubLObject var103)
  {
    Symbols.put( var74, (SubLObject) $ic122$, var103 );
    return var74;
  }

  public static SubLObject f448(final SubLObject var129)
  {
    SubLObject var130 = (SubLObject) NIL;
    if( var129.eql( (SubLObject) $ic123$ ) )
    {
      var130 = (SubLObject) $ic116$;
    }
    else if( var129.eql( (SubLObject) $ic124$ ) )
    {
      var130 = (SubLObject) $ic114$;
    }
    else if( var129.eql( (SubLObject) $ic125$ ) )
    {
      var130 = (SubLObject) $ic96$;
    }
    else if( var129.eql( (SubLObject) $ic126$ ) )
    {
      var130 = (SubLObject) $ic127$;
    }
    else if( var129.eql( (SubLObject) $ic128$ ) )
    {
      var130 = (SubLObject) $ic129$;
    }
    else if( var129.eql( (SubLObject) $ic130$ ) )
    {
      var130 = (SubLObject) $ic131$;
    }
    else if( var129.eql( (SubLObject) $ic132$ ) )
    {
      var130 = (SubLObject) $ic133$;
    }
    else if( var129.eql( (SubLObject) $ic134$ ) )
    {
      var130 = (SubLObject) $ic133$;
    }
    else
    {
      Errors.error( (SubLObject) $ic135$, var129 );
    }
    return var130;
  }

  public static SubLObject documentation(final SubLObject var64, SubLObject var127)
  {
    if( var127 == UNPROVIDED )
    {
      var127 = (SubLObject) $ic123$;
    }
    final SubLObject var128 = var127;
    if( var128.eql( (SubLObject) $ic123$ ) )
    {
      return Symbols.get( var64, (SubLObject) $ic122$, (SubLObject) UNPROVIDED );
    }
    if( var128.eql( (SubLObject) $ic136$ ) )
    {
      return Symbols.get( var64, (SubLObject) $ic137$, (SubLObject) UNPROVIDED );
    }
    if( var128.eql( (SubLObject) $ic138$ ) )
    {
      return Symbols.get( var64, (SubLObject) $ic139$, (SubLObject) UNPROVIDED );
    }
    if( var128.eql( (SubLObject) $ic140$ ) )
    {
      return Symbols.get( var64, (SubLObject) $ic141$, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f450(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic143$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic124$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic121$, var5, (SubLObject) $ic142$, var6, var7, var8 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic143$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f451(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic143$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic124$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic121$, var5, (SubLObject) $ic144$, var6, var7, var8 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic143$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f452(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic143$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic124$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic121$, var5, (SubLObject) $ic145$, var6, var7, var8 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic143$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f453(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic146$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic146$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic146$ );
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic134$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic146$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic121$, var5, (SubLObject) $ic147$, var6, var7, var8 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic146$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f454(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic143$ );
    var5 = var4.first();
    var4 = var4.rest();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var7 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic124$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic143$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic121$, var5, (SubLObject) $ic148$, var6, var7, var8 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic143$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f455(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic149$, ConsesLow.append( var5, (SubLObject) NIL ) );
  }

  public static SubLObject f456(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic150$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic150$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic150$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic151$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var8,
          (SubLObject) NIL ) ) ), var6, var7 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic150$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f457(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic152$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var2_150 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic152$ );
    var2_150 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var6;
      var4 = ( var6 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic34$, var2_150, (SubLObject) $ic153$ ), (SubLObject) ConsesLow.listS(
          (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var2_150 ) ), ConsesLow.append( var6, (SubLObject) NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic152$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f458(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    final SubLObject var2_153 = (SubLObject) $ic155$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( reader.bq_cons( var2_153, (SubLObject) $ic156$ ) ), (SubLObject) ConsesLow.listS(
        (SubLObject) $ic157$, (SubLObject) ConsesLow.list( var2_153 ), ConsesLow.append( var5, (SubLObject) NIL ) ) );
  }

  public static SubLObject f459(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    final SubLObject var2_156 = (SubLObject) $ic158$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( reader.bq_cons( var2_156, (SubLObject) $ic159$ ) ), (SubLObject) ConsesLow.listS(
        (SubLObject) $ic157$, (SubLObject) ConsesLow.list( var2_156 ), ConsesLow.append( var5, (SubLObject) NIL ) ) );
  }

  public static SubLObject f460()
  {
    final SubLObject var157 = module0528.f32897();
    return ( NIL != module0107.f7629( var157 ) ) ? var157 : module0528.f32898();
  }

  public static SubLObject f461(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) $ic162$, (SubLObject) ConsesLow.listS( (SubLObject) $ic163$, reader.bq_cons( (SubLObject) $ic3$,
        ConsesLow.append( var5, (SubLObject) NIL ) ), (SubLObject) $ic164$ ) );
  }

  public static SubLObject f462(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic165$, ConsesLow.append( var5, (SubLObject) NIL ) );
  }

  public static SubLObject f463(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic166$, (SubLObject) ConsesLow.list( (SubLObject) $ic167$, reader.bq_cons( (SubLObject) $ic168$, ConsesLow.append( var5,
        (SubLObject) NIL ) ) ) );
  }

  public static SubLObject f464()
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    return (SubLObject) makeBoolean( NIL != module0131.f8587() && NIL == module0131.$g60$.getDynamicValue( var3 ) && NIL == module0018.$g61$.getDynamicValue( var3 ) );
  }

  public static SubLObject f465(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    final SubLObject var6 = (SubLObject) $ic169$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var6 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic170$, (SubLObject) ConsesLow.list( var6 ), ConsesLow
        .append( var5, (SubLObject) NIL ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic37$, var6, (SubLObject) $ic171$ ) );
  }

  public static SubLObject f466(final SubLObject var167, final SubLObject var168)
  {
    final SubLThread var169 = SubLProcess.currentSubLThread();
    final SubLObject var170 = conses_high.assoc( var167, $g62$.getDynamicValue( var169 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ).rest();
    return (SubLObject) makeBoolean( var168.isNumber() && var170.isNumber() && var170.isPositive() && var170.numGE( var168 ) );
  }

  public static SubLObject f467(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic172$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic172$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic172$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic37$, (SubLObject) ConsesLow.list( (SubLObject) $ic173$, var6, var7 ), ConsesLow.append( var8, (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic172$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f468(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic174$ );
    var6 = var5.first();
    final SubLObject var7;
    var5 = ( var7 = var5.rest() );
    if( NIL != Sequences.find( (SubLObject) $ic175$, reader.$features$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
    {
      return reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var7, (SubLObject) NIL ) );
    }
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic176$, var6 ) ), ConsesLow.append( var7,
        (SubLObject) NIL ) );
  }

  public static SubLObject f469(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    final SubLObject var4 = var1.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    if( NIL != Sequences.find( (SubLObject) $ic175$, reader.$features$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
    {
      return reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var6, (SubLObject) NIL ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic85$, (SubLObject) $ic176$, reader.bq_cons( (SubLObject) $ic177$, ConsesLow.append( var6, (SubLObject) NIL ) ), reader
        .bq_cons( (SubLObject) $ic3$, ConsesLow.append( var6, (SubLObject) NIL ) ) );
  }

  public static SubLObject f470(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic178$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic178$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic178$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic178$ );
    final SubLObject var8 = var4.rest();
    var4 = var4.first();
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic178$ );
    var9 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var10;
      var4 = ( var10 = var8 );
      final SubLObject var11 = Symbols.symbol_name( var5 );
      final SubLObject var12 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic179$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var13 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic180$, var11 );
      final SubLObject var14 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic181$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var15 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic182$, var11 );
      final SubLObject var16 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic183$, var11 );
      final SubLObject var17 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic184$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var18 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic185$, var11 );
      final SubLObject var19 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic186$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var20 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic187$, var11 );
      final SubLObject var21 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic188$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var22 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic189$, var11 );
      final SubLObject var23 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic190$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var24 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic191$, var11 );
      final SubLObject var25 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic192$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var26 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic193$, var11 );
      final SubLObject var27 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic194$, var11 ), (SubLObject) UNPROVIDED );
      final SubLObject var28 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic195$, var11 ), (SubLObject) UNPROVIDED );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic196$, var12, (SubLObject) NIL, var13 ), (SubLObject) ConsesLow.list(
          (SubLObject) $ic196$, var14, (SubLObject) ConsesLow.list( (SubLObject) $ic101$, var16 ), var15 ), (SubLObject) ConsesLow.list( (SubLObject) $ic63$, var17,
              (SubLObject) NIL, var18, (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic52$, (SubLObject) ConsesLow.list( (SubLObject) $ic177$,
                  (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic197$, (SubLObject) ConsesLow.list( var27 ) ) ), (SubLObject) $ic198$ ) ), (SubLObject) ConsesLow
                      .listS( (SubLObject) $ic63$, var19, (SubLObject) ConsesLow.list( var9 ), var20, ConsesLow.append( var10, (SubLObject) NIL ) ), (SubLObject) ConsesLow.list(
                          (SubLObject) $ic56$, var23, (SubLObject) $ic52$, var24, (SubLObject) ConsesLow.list( (SubLObject) $ic54$, (SubLObject) ConsesLow.list(
                              (SubLObject) $ic199$, reader.bq_cons( var28, (SubLObject) $ic52$ ), (SubLObject) ConsesLow.listS( (SubLObject) EQ, reader.bq_cons( var7,
                                  (SubLObject) $ic52$ ), (SubLObject) $ic200$ ) ) ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic56$, new SubLObject[]
                                  { var25, $ic52$, var26, ConsesLow.list( (SubLObject) $ic34$, (SubLObject) $ic197$, var28 ), ConsesLow.listS( (SubLObject) $ic201$, reader
                                      .bq_cons( var23, (SubLObject) $ic52$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic197$, reader.bq_cons( var19,
                                          (SubLObject) $ic52$ ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic202$, reader.bq_cons( var7, (SubLObject) $ic52$ ),
                                              (SubLObject) $ic200$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic37$, (SubLObject) $ic203$, (SubLObject) ConsesLow.list(
                                                  (SubLObject) $ic87$, (SubLObject) ConsesLow.list( var14 ), (SubLObject) ConsesLow.list( (SubLObject) $ic202$, reader.bq_cons( var6,
                                                      (SubLObject) $ic52$ ), var12 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var12, (SubLObject) $ic52$ ) ) ),
                                      (SubLObject) $ic204$ ), $ic205$
      } ), (SubLObject) ConsesLow.list( (SubLObject) $ic56$, var21, (SubLObject) NIL, var22, (SubLObject) ConsesLow.list( (SubLObject) $ic201$, (SubLObject) $ic203$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic85$, (SubLObject) $ic176$, (SubLObject) ConsesLow.list( (SubLObject) $ic54$, (SubLObject) ConsesLow.list( var19,
              (SubLObject) ConsesLow.list( var17 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic54$, (SubLObject) ConsesLow.list( var19, (SubLObject) ConsesLow.list( var27 ) ) ) ) ),
          (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) $ic206$, (SubLObject) ConsesLow.list( (SubLObject) $ic87$, (SubLObject) ConsesLow.list( var14 ),
              (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic197$, var12 ), (SubLObject) ConsesLow.list( (SubLObject) $ic207$, (SubLObject) NIL,
                  (SubLObject) $ic208$, (SubLObject) ConsesLow.list( (SubLObject) $ic85$, reader.bq_cons( var23, (SubLObject) $ic52$ ), (SubLObject) ConsesLow.listS(
                      (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var12, reader.bq_cons( var6, (SubLObject) $ic52$ ) ), (SubLObject) $ic209$ ),
                      (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic197$, reader.bq_cons( var6, (SubLObject) $ic52$ ) ) ) ), (SubLObject) ConsesLow.list(
                          (SubLObject) $ic201$, (SubLObject) $ic210$, (SubLObject) ConsesLow.list( (SubLObject) $ic85$, (SubLObject) $ic176$, (SubLObject) ConsesLow.list(
                              (SubLObject) $ic105$, (SubLObject) $ic197$, (SubLObject) ConsesLow.list( var17 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$,
                                  (SubLObject) $ic197$, (SubLObject) ConsesLow.list( var27 ) ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var12, (SubLObject) $ic211$ ) ) ),
              (SubLObject) ConsesLow.list( (SubLObject) $ic54$, reader.bq_cons( var19, (SubLObject) $ic52$ ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic178$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f471(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic212$, ConsesLow.append( var5, (SubLObject) NIL ) );
  }

  public static SubLObject f472(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic213$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    final SubLObject var7 = (SubLObject) $ic214$;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( new SubLObject[] { ConsesLow.list( var7, var5 ), $ic215$, $ic216$, $ic217$,
      $ic218$, $ic219$, $ic220$, $ic221$, ConsesLow.list( (SubLObject) $ic222$, (SubLObject) ConsesLow.listS( (SubLObject) $ic223$, var7,
          (SubLObject) $ic224$ ) )
    } ), (SubLObject) ConsesLow.list( (SubLObject) $ic225$, var7 ), ConsesLow.append( var6, (SubLObject) $ic226$ ) );
  }

  public static SubLObject f473(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic227$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic227$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic228$, var5 ), (SubLObject) ConsesLow.list(
        (SubLObject) $ic229$, var6 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic230$, var6, ConsesLow.append( var7, (SubLObject) NIL ) ) );
  }

  public static SubLObject f474(final SubLObject var205)
  {
    final SubLThread var206 = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( var206 ) && NIL == $g71$.getDynamicValue( var206 ) )
    {
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var206 ), (SubLObject) $ic231$, var205 );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var206 ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f475()
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( var3 ) && NIL == $g71$.getDynamicValue( var3 ) )
    {
      final SubLObject var4 = module0004.f102( $g73$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic233$, StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( module0051.f3664( var4 ), StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( var4.numG( (SubLObject) $ic234$ ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) $ic235$, module0051.f3663( (SubLObject) UNPROVIDED ) );
      }
      streams_high.write_string( (SubLObject) $ic236$, StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( var3 ) );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var3 ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f476()
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    if( NIL != $g70$.getDynamicValue( var3 ) && NIL == $silent_progressP$.getDynamicValue( var3 ) )
    {
      $g69$.setDynamicValue( Numbers.add( $g69$.getDynamicValue( var3 ), (SubLObject) ONE_INTEGER ), var3 );
      final SubLObject var4 = module0004.f102( $g65$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED );
      if( !var4.numLE( $g67$.getDynamicValue( var3 ) ) && ( !$g71$.getDynamicValue( var3 ).isNumber() || !var4.numLE( $g71$.getDynamicValue( var3 ) )
          || NIL != $silent_progressP$.getDynamicValue( var3 ) ) )
      {
        if( NIL != $g71$.getDynamicValue( var3 ) )
        {
          $g71$.setDynamicValue( (SubLObject) NIL, var3 );
          f474( $g72$.getDynamicValue( var3 ) );
        }
        $g68$.setDynamicValue( Numbers.add( $g68$.getDynamicValue( var3 ), (SubLObject) ONE_INTEGER ), var3 );
        if( $ic238$.eql( $g68$.getDynamicValue( var3 ) ) )
        {
          $g67$.setDynamicValue( (SubLObject) FIVE_INTEGER, var3 );
        }
        else if( $ic20$.eql( $g68$.getDynamicValue( var3 ) ) )
        {
          $g67$.setDynamicValue( (SubLObject) FIFTEEN_INTEGER, var3 );
        }
        else if( $ic239$.eql( $g68$.getDynamicValue( var3 ) ) )
        {
          $g67$.setDynamicValue( (SubLObject) $ic240$, var3 );
        }
        $g66$.setDynamicValue( Numbers.add( $g66$.getDynamicValue( var3 ), (SubLObject) ONE_INTEGER ), var3 );
        if( $g66$.getDynamicValue( var3 ).numG( (SubLObject) $ic241$ ) )
        {
          $g66$.setDynamicValue( (SubLObject) ZERO_INTEGER, var3 );
          PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) $ic242$, $g69$.getDynamicValue( var3 ) );
          streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( var3 ) );
        }
        else
        {
          PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) $ic243$ );
        }
        streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var3 ) );
        $g65$.setDynamicValue( Time.get_universal_time(), var3 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject noting_activity(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic213$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic244$, var5 ), ConsesLow.append( var6, (SubLObject) NIL ) );
  }

  public static SubLObject noting_percent_progress(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic213$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic245$, (SubLObject) ConsesLow.list( (SubLObject) $ic246$, var5 ), ConsesLow.append( var6,
        (SubLObject) $ic247$ ) );
  }

  public static SubLObject f477(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic227$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic227$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic248$, var5 ), (SubLObject) ConsesLow.list(
        (SubLObject) $ic249$, var6 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic250$, var6, ConsesLow.append( var7, (SubLObject) NIL ) ) );
  }

  public static SubLObject f478(final SubLObject var205)
  {
    final SubLThread var206 = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( var206 ) && NIL == $g79$.getDynamicValue( var206 ) )
    {
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var206 ), (SubLObject) $ic251$, var205 );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var206 ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f479()
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( var3 ) && NIL == $g79$.getDynamicValue( var3 ) )
    {
      final SubLObject var4 = module0004.f102( $g78$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic233$, StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( module0051.f3664( var4 ), StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( var4.numG( (SubLObject) $ic234$ ) )
      {
        PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) $ic235$, module0051.f3663( (SubLObject) UNPROVIDED ) );
      }
      streams_high.write_string( (SubLObject) $ic236$, StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( !ZERO_INTEGER.eql( $g75$.getDynamicValue( var3 ) ) )
      {
        streams_high.write_string( (SubLObject) $ic253$, StreamsLow.$standard_output$.getDynamicValue( var3 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( var3 ) );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var3 ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject note_percent_progress(final SubLObject var217, final SubLObject var218)
  {
    final SubLThread var219 = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( var219 ) && NIL != $g77$.getDynamicValue( var219 ) && NIL != var217 )
    {
      final SubLObject var220 = module0004.f102( $g78$.getDynamicValue( var219 ), (SubLObject) UNPROVIDED );
      if( !var220.numLE( (SubLObject) ONE_INTEGER ) && ( !$g79$.getDynamicValue( var219 ).isNumber() || !var220.numLE( $g79$.getDynamicValue( var219 ) ) ) )
      {
        if( NIL != $g79$.getDynamicValue( var219 ) )
        {
          $g79$.setDynamicValue( (SubLObject) NIL, var219 );
          f478( $g80$.getDynamicValue( var219 ) );
        }
        final SubLObject var221 = f480( var217, var218 );
        if( var221.numG( $g75$.getDynamicValue( var219 ) ) )
        {
          if( ZERO_INTEGER.eql( $g75$.getDynamicValue( var219 ) ) )
          {
            PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var219 ), (SubLObject) $ic255$ );
          }
          final SubLObject var222 = Numbers.truncate( Numbers.multiply( var220, (SubLObject) $ic20$ ), var221 );
          if( ( var221.numE( (SubLObject) ONE_INTEGER ) || var217.numE( (SubLObject) ONE_INTEGER ) ) && var222.numGE( Numbers.multiply( (SubLObject) FIVE_INTEGER, module0051.$g81$
              .getGlobalValue() ) ) )
          {
            streams_high.write_string( (SubLObject) $ic256$, StreamsLow.$standard_output$.getDynamicValue( var219 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            f481( var220, var222, (SubLObject) $ic257$, (SubLObject) $ic234$ );
          }
          else if( ( var221.numE( (SubLObject) TWO_INTEGER ) || var217.numE( (SubLObject) TWO_INTEGER ) ) && var222.numGE( Numbers.multiply( (SubLObject) TEN_INTEGER, module0051.$g81$
              .getGlobalValue() ) ) )
          {
            streams_high.write_string( (SubLObject) $ic258$, StreamsLow.$standard_output$.getDynamicValue( var219 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            f481( var220, var222, (SubLObject) $ic257$, (SubLObject) $ic234$ );
          }
          else if( !var222.numLE( (SubLObject) TWO_INTEGER ) )
          {
            if( var218.numL( (SubLObject) TEN_INTEGER ) )
            {
              f482( var221 );
            }
            else if( !var222.numLE( (SubLObject) FIVE_INTEGER ) )
            {
              if( Numbers.mod( var221, (SubLObject) TEN_INTEGER ).numE( (SubLObject) ZERO_INTEGER ) )
              {
                f482( var221 );
                f481( var220, var222, (SubLObject) $ic234$, (SubLObject) $ic259$ );
              }
              else if( var218.numL( (SubLObject) $ic240$ ) )
              {
                if( Numbers.mod( var217, Numbers.ash( var218, (SubLObject) $ic260$ ) ).numE( (SubLObject) ZERO_INTEGER ) )
                {
                  f482( var221 );
                }
                else
                {
                  streams_high.write_string( (SubLObject) $ic243$, StreamsLow.$standard_output$.getDynamicValue( var219 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
                }
              }
              else if( !var222.numLE( (SubLObject) TWENTY_INTEGER ) )
              {
                if( Numbers.mod( var221, (SubLObject) TWO_INTEGER ).numE( (SubLObject) ZERO_INTEGER ) )
                {
                  streams_high.write_string( (SubLObject) $ic243$, StreamsLow.$standard_output$.getDynamicValue( var219 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
                }
                if( $g76$.getDynamicValue( var219 ).isNumber() )
                {
                  final SubLObject var223 = Numbers.add( $g76$.getDynamicValue( var219 ), Numbers.integerDivide( $g76$.getDynamicValue( var219 ), (SubLObject) TEN_INTEGER ) );
                  if( var222.numG( var223 ) )
                  {
                    f482( var221 );
                    f481( var220, var222, var223, (SubLObject) $ic259$ );
                  }
                }
              }
            }
          }
          streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var219 ) );
          $g75$.setDynamicValue( var221, var219 );
        }
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f482(final SubLObject var219)
  {
    final SubLThread var220 = SubLProcess.currentSubLThread();
    streams_high.write_string( (SubLObject) $ic261$, StreamsLow.$standard_output$.getDynamicValue( var220 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f483( var219, StreamsLow.$standard_output$.getDynamicValue( var220 ) );
    streams_high.write_string( (SubLObject) $ic262$, StreamsLow.$standard_output$.getDynamicValue( var220 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f483(final SubLObject var222, final SubLObject var223)
  {
    if( var222.numL( (SubLObject) TEN_INTEGER ) )
    {
      streams_high.write_string( (SubLObject) $ic263$, var223, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    streams_high.write_string( print_high.princ_to_string( var222 ), var223, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return var222;
  }

  public static SubLObject f481(final SubLObject var210, final SubLObject var220, final SubLObject var224, SubLObject var225)
  {
    if( var225 == UNPROVIDED )
    {
      var225 = (SubLObject) NIL;
    }
    final SubLThread var226 = SubLProcess.currentSubLThread();
    if( var220.numG( var224 ) && var220.numG( var210 ) )
    {
      final SubLObject var227 = Sequences.cconcatenate( (SubLObject) $ic264$, new SubLObject[] { module0006.f203( module0051.f3664( var210 ) ), $ic265$, module0006.$g12$.getGlobalValue(), module0006
          .f203( module0051.f3664( var220 ) )
      } );
      streams_high.write_string( var227, StreamsLow.$standard_output$.getDynamicValue( var226 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( var225.isInteger() && var220.numG( var225 ) )
      {
        streams_high.write_string( (SubLObject) $ic266$, StreamsLow.$standard_output$.getDynamicValue( var226 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        streams_high.write_string( module0051.f3663( Numbers.add( $g78$.getDynamicValue( var226 ), var220 ) ), StreamsLow.$standard_output$.getDynamicValue( var226 ), (SubLObject) UNPROVIDED,
            (SubLObject) UNPROVIDED );
      }
      streams_high.write_string( (SubLObject) $ic236$, StreamsLow.$standard_output$.getDynamicValue( var226 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( StreamsLow.$standard_output$.getDynamicValue( var226 ) );
      streams_high.write_string( (SubLObject) $ic267$, StreamsLow.$standard_output$.getDynamicValue( var226 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      $g76$.setDynamicValue( var220, var226 );
      return (SubLObject) T;
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f480(SubLObject var217, SubLObject var218)
  {
    if( var218.numLE( (SubLObject) ZERO_INTEGER ) || var217.numLE( (SubLObject) ZERO_INTEGER ) )
    {
      return (SubLObject) ZERO_INTEGER;
    }
    if( var217.numGE( var218 ) )
    {
      return (SubLObject) $ic20$;
    }
    final SubLObject var219 = (SubLObject) TEN_INTEGER;
    final SubLObject var220 = Numbers.integer_length( var218 );
    final SubLObject var221 = Numbers.subtract( var219, var220 );
    if( var221.isNegative() )
    {
      var217 = Numbers.ash( var217, var221 );
      var218 = Numbers.ash( var218, var221 );
    }
    return Numbers.min( (SubLObject) $ic268$, Numbers.integerDivide( Numbers.multiply( (SubLObject) $ic20$, var217 ), var218 ) );
  }

  public static SubLObject f484()
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    final SubLObject var4 = Time.get_universal_time();
    PrintLow.format( (SubLObject) T, (SubLObject) $ic270$, new SubLObject[] { $g82$.getDynamicValue( var3 ), $g84$.getDynamicValue( var3 ), $g83$.getDynamicValue(
        var3 ), Numbers.integerDivide( Numbers.multiply( $g84$.getDynamicValue( var3 ), (SubLObject) $ic20$ ), $g83$.getDynamicValue( var3 ) ), $g84$.getDynamicValue( var3 )
            .numE( (SubLObject) ZERO_INTEGER ) ? $ic271$
                : module0051.f3552( Numbers.add( $g73$.getDynamicValue( var3 ), Numbers.integerDivide( Numbers.multiply( $g83$.getDynamicValue( var3 ), Numbers.subtract( var4, $g73$
                    .getDynamicValue( var3 ) ) ), $g84$.getDynamicValue( var3 ) ) ) )
    } );
    return (SubLObject) NIL;
  }

  public static SubLObject f485(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic272$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic272$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic272$ );
    var7 = var4.first();
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic273$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic272$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var9;
      var4 = ( var9 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic274$, var8 ), (SubLObject) $ic275$,
          (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic276$, var7 ), (SubLObject) $ic277$, (SubLObject) ConsesLow.list( (SubLObject) $ic250$,
              (SubLObject) $ic274$, (SubLObject) ConsesLow.listS( (SubLObject) $ic278$, reader.bq_cons( var6, (SubLObject) $ic279$ ), (SubLObject) $ic280$,
                  (SubLObject) $ic281$, ConsesLow.append( var9, (SubLObject) NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic272$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f486(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic282$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic282$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic282$ );
    var7 = var4.first();
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic283$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic282$ );
    var4 = var4.rest();
    final SubLObject var9 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic282$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var10;
      var4 = ( var10 = var5 );
      final SubLObject var11 = (SubLObject) $ic284$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var11, var7 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$,
          (SubLObject) $ic274$, var8 ), (SubLObject) $ic275$, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic276$, (SubLObject) ConsesLow.list(
              (SubLObject) $ic285$, var11 ) ), (SubLObject) $ic277$, (SubLObject) ConsesLow.list( (SubLObject) $ic250$, (SubLObject) $ic274$, (SubLObject) ConsesLow.listS(
                  (SubLObject) $ic286$, (SubLObject) ConsesLow.list( var6, var11, var9 ), (SubLObject) $ic280$, (SubLObject) $ic281$, ConsesLow.append( var10,
                      (SubLObject) NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic282$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f487(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic288$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic288$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic288$ );
    var7 = var4.first();
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic283$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic288$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var9;
      var4 = ( var9 = var5 );
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic289$, (SubLObject) ConsesLow.list( var6, var7, var8 ), ConsesLow.append( var9, (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic288$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f488(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic290$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic290$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic290$ );
    var7 = var4.first();
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic290$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var9;
      var4 = ( var9 = var5 );
      final SubLObject var10 = (SubLObject) $ic291$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var10, var8 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic85$, var10,
          (SubLObject) ConsesLow.listS( (SubLObject) $ic287$, (SubLObject) ConsesLow.list( var6, var7, var8 ), ConsesLow.append( var9, (SubLObject) NIL ) ), (SubLObject) ConsesLow.listS(
              (SubLObject) $ic292$, (SubLObject) ConsesLow.list( var6, var7 ), ConsesLow.append( var9, (SubLObject) NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic290$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f489(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic293$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic293$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic293$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic293$ );
    var8 = var4.first();
    var4 = var4.rest();
    final SubLObject var9 = (SubLObject) ( var4.isCons() ? var4.first() : $ic294$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic293$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var10;
      var4 = ( var10 = var5 );
      final SubLObject var11 = (SubLObject) $ic295$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var11, var8 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$,
          (SubLObject) $ic274$, var9 ), (SubLObject) $ic275$, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic276$, (SubLObject) ConsesLow.list(
              (SubLObject) $ic296$, var11 ) ), (SubLObject) $ic277$, (SubLObject) ConsesLow.list( (SubLObject) $ic250$, (SubLObject) $ic274$, (SubLObject) ConsesLow.listS(
                  (SubLObject) $ic297$, (SubLObject) ConsesLow.list( var6, var7, var11 ), (SubLObject) $ic280$, (SubLObject) $ic281$, ConsesLow.append( var10,
                      (SubLObject) NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic293$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f490(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic298$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic298$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic298$ );
    var7 = var4.first();
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : $ic299$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) $ic298$ );
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var9;
      var4 = ( var9 = var5 );
      final SubLObject var10 = (SubLObject) $ic300$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var10, var7 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$,
          (SubLObject) $ic274$, var8 ), (SubLObject) $ic275$, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic276$, (SubLObject) ConsesLow.list(
              (SubLObject) $ic301$, var10 ) ), (SubLObject) $ic277$, (SubLObject) ConsesLow.list( (SubLObject) $ic250$, (SubLObject) $ic274$, (SubLObject) ConsesLow.listS(
                  (SubLObject) $ic302$, (SubLObject) ConsesLow.list( var6, var10 ), (SubLObject) $ic280$, (SubLObject) $ic281$, ConsesLow.append( var9,
                      (SubLObject) NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic298$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f491(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic303$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = var4;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var269_270 = (SubLObject) NIL;
    while ( NIL != var7)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var7, var3, (SubLObject) $ic303$ );
      var269_270 = var7.first();
      var7 = var7.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var7, var3, (SubLObject) $ic303$ );
      if( NIL == conses_high.member( var269_270, (SubLObject) $ic304$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var8 = (SubLObject) T;
      }
      if( var269_270 == $ic91$ )
      {
        var6 = var7.first();
      }
      var7 = var7.rest();
    }
    if( NIL != var8 && NIL == var6 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic303$ );
    }
    final SubLObject var9 = cdestructuring_bind.property_list_member( (SubLObject) $ic305$, var4 );
    final SubLObject var10 = (SubLObject) ( ( NIL != var9 ) ? conses_high.cadr( var9 ) : NIL );
    final SubLObject var11;
    var4 = ( var11 = var5 );
    final SubLObject var12 = (SubLObject) $ic306$;
    final SubLObject var13 = (SubLObject) $ic307$;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var12, var10 ), (SubLObject) ConsesLow.list( var13, (SubLObject) ConsesLow.list(
        (SubLObject) $ic308$, var12 ) ) ), ConsesLow.append( var11, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic309$, var12, var13 ) ) ) );
  }

  public static SubLObject f492(final SubLObject var236)
  {
    final SubLThread var237 = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( var237 ) && NIL != var236 )
    {
      final SubLObject var238 = Time.get_universal_time();
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var237 ), (SubLObject) $ic311$, var236, module0051.f3552( var238 ) );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var237 ) );
      return var238;
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f493(final SubLObject var236, final SubLObject var272)
  {
    final SubLThread var273 = SubLProcess.currentSubLThread();
    if( NIL == $silent_progressP$.getDynamicValue( var273 ) && NIL != var236 )
    {
      final SubLObject var274 = Time.get_universal_time();
      PrintLow.format( StreamsLow.$standard_output$.getDynamicValue( var273 ), (SubLObject) $ic312$, new SubLObject[] { var236, module0051.f3552( var274 ), module0051.f3602( Numbers.subtract( var274,
          var272 ) )
      } );
      streams_high.force_output( StreamsLow.$standard_output$.getDynamicValue( var273 ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f494(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic313$, (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) $ic314$, (SubLObject) ConsesLow.listS(
        (SubLObject) $ic163$, (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) $ic315$, reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var5,
            (SubLObject) NIL ) ) ), (SubLObject) $ic316$ ) ) );
  }

  public static SubLObject f495(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return f496( var5 );
  }

  public static SubLObject f496(final SubLObject var10)
  {
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic317$, ConsesLow.append( var10, (SubLObject) NIL ) );
  }

  public static SubLObject f497(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic318$, (SubLObject) ConsesLow.list( (SubLObject) $ic319$, (SubLObject) ConsesLow.listS( (SubLObject) $ic84$,
        (SubLObject) $ic320$, ConsesLow.append( var5, (SubLObject) NIL ) ) ) );
  }

  public static SubLObject f498(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic321$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic321$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7;
      var4 = ( var7 = var5 );
      final SubLObject var8 = (SubLObject) $ic322$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( reader.bq_cons( var8, (SubLObject) $ic323$ ) ), (SubLObject) ConsesLow.list(
          (SubLObject) $ic163$, (SubLObject) ConsesLow.listS( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic324$, var6 ), ConsesLow.append( var7,
              (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic324$, var8 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic321$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f499(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic321$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic321$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7;
      var4 = ( var7 = var5 );
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic325$, (SubLObject) ConsesLow.list( (SubLObject) $ic324$, var6 ), ConsesLow.append( var7,
          (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic321$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f500(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic326$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic326$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    final SubLObject var8 = (SubLObject) $ic327$;
    final SubLObject var9 = f501( var5, var8 );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic292$, (SubLObject) ConsesLow.list( var8, var6 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, ConsesLow.append( var9,
        (SubLObject) NIL ), ConsesLow.append( var7, (SubLObject) NIL ) ) );
  }

  public static SubLObject f501(final SubLObject var290, final SubLObject var294)
  {
    SubLObject var295 = (SubLObject) NIL;
    SubLObject var296 = var290;
    SubLObject var297 = (SubLObject) NIL;
    var297 = var296.first();
    while ( NIL != var296)
    {
      SubLObject var298 = (SubLObject) NIL;
      SubLObject var299 = (SubLObject) NIL;
      if( var297.isCons() )
      {
        var298 = var297.first();
        var299 = conses_high.second( var297 );
      }
      else
      {
        var298 = var297;
        var299 = var297;
      }
      var295 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var298, (SubLObject) ConsesLow.list( (SubLObject) $ic328$, var294, (SubLObject) ConsesLow.list( (SubLObject) $ic6$,
          var299 ) ) ), var295 );
      var296 = var296.rest();
      var297 = var296.first();
    }
    return Sequences.nreverse( var295 );
  }

  public static SubLObject f502(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic332$ );
    var5 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic333$, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var5 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic332$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f503(final SubLObject var240)
  {
    return (SubLObject) makeBoolean( var240.isCons() && var240.rest().isCons() );
  }

  public static SubLObject f504(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic332$ );
    var5 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic335$, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var5 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic332$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f505(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic336$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic336$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic336$ );
    var8 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var9;
      var5 = ( var9 = var6 );
      if( !var7.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic337$, var7 );
      }
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic207$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var7, var8, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var7 ) ) ),
          (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var7 ) ), var9 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic336$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f506(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    var9 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var10;
      var5 = ( var10 = var6 );
      if( !var7.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic339$, var7 );
      }
      if( !var8.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic339$, var8 );
      }
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic207$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var8, var9, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var8 ) ),
          (SubLObject) ConsesLow.list( var7, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var8 ) ) ), (SubLObject) ConsesLow.list(
              (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var8 ) ), var10 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic338$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f507(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic338$ );
    var9 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var10;
      var5 = ( var10 = var6 );
      if( !var7.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic339$, var7 );
      }
      if( !var8.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic339$, var8 );
      }
      final SubLObject var11 = Symbols.make_symbol( (SubLObject) $ic340$ );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var11 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic207$, (SubLObject) ConsesLow.list(
          (SubLObject) ConsesLow.list( var8, var9, var11 ), (SubLObject) ConsesLow.list( var7, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var8 ), (SubLObject) ConsesLow.list(
              (SubLObject) $ic100$, var8 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var8 ) ), (SubLObject) ConsesLow.list(
                  (SubLObject) $ic105$, var11, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var8 ) ), var10 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic338$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f508(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic341$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic341$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic341$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      final SubLObject var9 = Symbols.make_symbol( (SubLObject) $ic342$ );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( reader.bq_cons( var6, (SubLObject) $ic211$ ), (SubLObject) ConsesLow.list( var9, var7 ) ),
          (SubLObject) ConsesLow.listS( (SubLObject) $ic343$, (SubLObject) ConsesLow.list( (SubLObject) $ic335$, var9 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var6,
              (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var9 ) ), ConsesLow.append( var8, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var9,
                  (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var9 ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic341$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f509(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var9 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var10;
      var5 = ( var10 = var6 );
      if( !var7.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic345$, var7 );
      }
      if( !var7.isSymbol() )
      {
        Errors.error( $g86$.getDynamicValue( var3 ), (SubLObject) $ic345$, var8 );
      }
      return (SubLObject) ConsesLow.list( (SubLObject) $ic292$, (SubLObject) ConsesLow.list( var7, var9 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic37$, (SubLObject) ConsesLow.list( var8,
          var7 ), var10 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic344$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f510(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var9 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var10;
      var5 = ( var10 = var6 );
      if( !var7.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic346$, var7 );
      }
      if( !var7.isSymbol() )
      {
        Errors.error( $g86$.getDynamicValue( var3 ), (SubLObject) $ic346$, var8 );
      }
      return (SubLObject) ConsesLow.list( (SubLObject) $ic207$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var7, var9, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var7 ) ) ),
          (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var7 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic37$, (SubLObject) ConsesLow.list( var8, var7 ),
              var10 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic344$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f511(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var9 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var10;
      var5 = ( var10 = var6 );
      if( !var7.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic347$, var7 );
      }
      if( !var7.isSymbol() )
      {
        Errors.error( $g86$.getDynamicValue( var3 ), (SubLObject) $ic347$, var8 );
      }
      return (SubLObject) ConsesLow.list( (SubLObject) $ic292$, (SubLObject) ConsesLow.list( var7, var9 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic201$, (SubLObject) ConsesLow.list( var8,
          var7 ), var10 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic344$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f512(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic344$ );
    var9 = var5.first();
    var5 = var5.rest();
    if( NIL == var5 )
    {
      final SubLObject var10;
      var5 = ( var10 = var6 );
      if( !var7.isSymbol() )
      {
        Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic348$, var7 );
      }
      if( !var7.isSymbol() )
      {
        Errors.error( $g86$.getDynamicValue( var3 ), (SubLObject) $ic348$, var8 );
      }
      return (SubLObject) ConsesLow.list( (SubLObject) $ic207$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var7, var9, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var7 ) ) ),
          (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var7 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic201$, (SubLObject) ConsesLow.list( var8, var7 ),
              var10 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic344$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f513(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic349$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic349$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic349$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic349$ );
    var8 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic349$ );
    var9 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var10;
      var4 = ( var10 = var5 );
      final SubLObject var11 = Symbols.make_symbol( (SubLObject) $ic350$ );
      final SubLObject var12 = Symbols.make_symbol( (SubLObject) $ic351$ );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var11, var7 ), (SubLObject) ConsesLow.list( var12, var9 ), var6, var8 ),
          (SubLObject) ConsesLow.listS( (SubLObject) $ic343$, (SubLObject) ConsesLow.list( (SubLObject) $ic199$, var11, var12 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var6,
              (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var11 ), var8, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var12 ) ), ConsesLow.append( var10, (SubLObject) ConsesLow.list(
                  (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var11 ), var12, (SubLObject) ConsesLow.list(
                      (SubLObject) $ic334$, var12 ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic349$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f514(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic352$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic352$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic352$ );
    var8 = var5.first();
    var5 = var5.rest();
    final SubLObject var9 = (SubLObject) ( var5.isCons() ? var5.first() : $ic353$ );
    cdestructuring_bind.destructuring_bind_must_listp( var5, var4, (SubLObject) $ic352$ );
    var5 = var5.rest();
    final SubLObject var10 = (SubLObject) ( var5.isCons() ? var5.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var5, var4, (SubLObject) $ic352$ );
    var5 = var5.rest();
    if( NIL != var5 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic352$ );
      return (SubLObject) NIL;
    }
    final SubLObject var11;
    var5 = ( var11 = var6 );
    if( !var7.isSymbol() )
    {
      Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic354$, var7 );
    }
    if( var9 != $ic353$ && var9 != $ic355$ )
    {
      Errors.error( $g87$.getDynamicValue( var3 ), (SubLObject) $ic354$, var9 );
    }
    final SubLObject var12 = Symbols.make_symbol( (SubLObject) $ic356$ );
    final SubLObject var13 = Symbols.make_symbol( (SubLObject) $ic357$ );
    if( var9 == $ic355$ )
    {
      final SubLObject var14 = Symbols.make_symbol( (SubLObject) $ic358$ );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var12, var8 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var12,
          (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var13, (SubLObject) ConsesLow.list( (SubLObject) $ic359$, var12 ) ),
              (SubLObject) ConsesLow.list( var14, (SubLObject) ConsesLow.list( (SubLObject) $ic360$, var13 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic207$, (SubLObject) ConsesLow.list(
                  (SubLObject) ConsesLow.list( var7, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var13 ), (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var13 ) ) ),
                  (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var13 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic85$, (SubLObject) ConsesLow.list(
                      (SubLObject) $ic335$, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic361$, var14, (SubLObject) ConsesLow.list(
                          (SubLObject) $ic359$, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var7 ) ) ),
                          (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var14, (SubLObject) ConsesLow.list( (SubLObject) $ic360$, var14 ) ) ), (SubLObject) ( ( NIL != var10 )
                              ? reader.bq_cons( (SubLObject) $ic3$, var11 )
                              : ConsesLow.listS( (SubLObject) $ic37$, var7, var11 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var13, (SubLObject) ConsesLow.list(
                                  (SubLObject) $ic334$, var13 ) ) ) ) ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var12, var8 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var12,
        (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var13, (SubLObject) ConsesLow.list( (SubLObject) $ic359$, var12 ) ) ),
            (SubLObject) ConsesLow.list( (SubLObject) $ic207$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var7, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var13 ),
                (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var13 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var13 ) ), (SubLObject) ConsesLow
                    .list( (SubLObject) $ic105$, var13, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var13 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic85$,
                        (SubLObject) ConsesLow.list( (SubLObject) $ic335$, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic362$,
                            (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var7 ), var13 ), (SubLObject) ConsesLow.list( (SubLObject) $ic362$, (SubLObject) ConsesLow.list(
                                (SubLObject) $ic100$, var7 ), var13 ) ), (SubLObject) ( ( NIL != var10 ) ? reader.bq_cons( (SubLObject) $ic3$, var11 )
                                    : ConsesLow.listS( (SubLObject) $ic37$, var7, var11 ) ) ) ) ) ) );
  }

  public static SubLObject f515(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic363$ );
    final SubLObject var6 = var5.rest();
    var5 = var5.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic363$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic363$ );
    var8 = var5.first();
    var5 = var5.rest();
    final SubLObject var9 = (SubLObject) ( var5.isCons() ? var5.first() : $ic353$ );
    cdestructuring_bind.destructuring_bind_must_listp( var5, var4, (SubLObject) $ic363$ );
    var5 = var5.rest();
    if( NIL != var5 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var4, (SubLObject) $ic363$ );
      return (SubLObject) NIL;
    }
    final SubLObject var10;
    var5 = ( var10 = var6 );
    if( !var7.isSymbol() )
    {
      Errors.error( $g85$.getDynamicValue( var3 ), (SubLObject) $ic364$, var7 );
    }
    if( var9 != $ic353$ && var9 != $ic355$ )
    {
      Errors.error( $g87$.getDynamicValue( var3 ), (SubLObject) $ic364$, var9 );
    }
    final SubLObject var11 = Symbols.make_symbol( (SubLObject) $ic356$ );
    final SubLObject var12 = Symbols.make_symbol( (SubLObject) $ic357$ );
    if( var9 == $ic355$ )
    {
      final SubLObject var13 = Symbols.make_symbol( (SubLObject) $ic365$ );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var11, var8 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var11,
          (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var12, (SubLObject) ConsesLow.list( (SubLObject) $ic359$, var11 ) ),
              (SubLObject) ConsesLow.list( var13, (SubLObject) ConsesLow.list( (SubLObject) $ic360$, var12 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic207$, (SubLObject) ConsesLow.list(
                  (SubLObject) ConsesLow.list( var7, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var12 ), (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var12 ) ) ),
                  (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var12 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic37$, (SubLObject) ConsesLow.list(
                      (SubLObject) $ic335$, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic361$, var13, (SubLObject) ConsesLow.list( (SubLObject) $ic359$, (SubLObject) ConsesLow
                          .list( (SubLObject) $ic100$, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var7 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var13,
                              (SubLObject) ConsesLow.list( (SubLObject) $ic360$, var13 ) ), var10 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var12, (SubLObject) ConsesLow.list(
                                  (SubLObject) $ic334$, var12 ) ) ) ) ) );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var11, var8 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var11,
        (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var12, (SubLObject) ConsesLow.list( (SubLObject) $ic359$, var11 ) ) ),
            (SubLObject) ConsesLow.list( (SubLObject) $ic207$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var7, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var12 ),
                (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var12 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var12 ) ), (SubLObject) ConsesLow
                    .list( (SubLObject) $ic105$, var12, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var12 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic37$,
                        (SubLObject) ConsesLow.list( (SubLObject) $ic335$, var7 ), (SubLObject) ConsesLow.list( (SubLObject) $ic362$, (SubLObject) ConsesLow.list( (SubLObject) $ic334$,
                            var7 ), var12 ), (SubLObject) ConsesLow.list( (SubLObject) $ic362$, (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var7 ), var12 ), var10 ) ) ) ) );
  }

  public static SubLObject f516(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic366$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic366$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic366$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic366$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var9;
      var4 = ( var9 = var5 );
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic367$, (SubLObject) ConsesLow.list( var6, var7, var8 ), ConsesLow.append( var9, (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic366$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f517(final SubLObject var356, final SubLObject var234, SubLObject var357)
  {
    if( var357 == UNPROVIDED )
    {
      var357 = (SubLObject) NIL;
    }
    SubLObject var358 = var234;
    SubLObject var359 = ( NIL != var357 ) ? f518( Sequences.reverse( var356 ) ) : Sequences.reverse( var356 );
    SubLObject var360 = (SubLObject) NIL;
    var360 = var359.first();
    while ( NIL != var359)
    {
      var358 = (SubLObject) ConsesLow.list( var360, var358 );
      var359 = var359.rest();
      var360 = var359.first();
    }
    return var358;
  }

  public static SubLObject f518(final SubLObject var356)
  {
    if( NIL == var356 )
    {
      return (SubLObject) NIL;
    }
    if( NIL == var356.rest() )
    {
      return (SubLObject) ConsesLow.cons( var356.first(), (SubLObject) NIL );
    }
    final SubLObject var357 = var356.first();
    final SubLObject var358 = conses_high.cadr( var356 );
    final SubLObject var359 = var357;
    if( var359.eql( (SubLObject) $ic100$ ) )
    {
      final SubLObject var38_361 = var358;
      if( var38_361.eql( (SubLObject) $ic100$ ) )
      {
        return (SubLObject) ConsesLow.cons( (SubLObject) $ic368$, f518( conses_high.cddr( var356 ) ) );
      }
      if( var38_361.eql( (SubLObject) $ic334$ ) )
      {
        return (SubLObject) ConsesLow.cons( (SubLObject) $ic369$, f518( conses_high.cddr( var356 ) ) );
      }
      return (SubLObject) ConsesLow.listS( var357, var358, f518( conses_high.cddr( var356 ) ) );
    }
    else
    {
      if( !var359.eql( (SubLObject) $ic334$ ) )
      {
        return (SubLObject) ConsesLow.listS( var357, var358, f518( conses_high.cddr( var356 ) ) );
      }
      final SubLObject var38_362 = var358;
      if( var38_362.eql( (SubLObject) $ic100$ ) )
      {
        return (SubLObject) ConsesLow.cons( (SubLObject) $ic370$, f518( conses_high.cddr( var356 ) ) );
      }
      if( var38_362.eql( (SubLObject) $ic334$ ) )
      {
        return (SubLObject) ConsesLow.cons( (SubLObject) $ic371$, f518( conses_high.cddr( var356 ) ) );
      }
      return (SubLObject) ConsesLow.listS( var357, var358, f518( conses_high.cddr( var356 ) ) );
    }
  }

  public static SubLObject f519(final SubLObject var342, final SubLObject var234, final SubLObject var356)
  {
    if( NIL == var342 )
    {
      return (SubLObject) NIL;
    }
    if( var342.isSymbol() )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) ( ( NIL == var356 ) ? ConsesLow.list( var342, var234 ) : ConsesLow.list( var342, f517( var356, var234, (SubLObject) T ) ) ) );
    }
    if( var342.isCons() )
    {
      return ConsesLow.nconc( f519( var342.first(), var234, (SubLObject) ConsesLow.cons( (SubLObject) $ic100$, var356 ) ), f519( var342.rest(), var234, (SubLObject) ConsesLow.cons(
          (SubLObject) $ic334$, var356 ) ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f520(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var365_366 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic372$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic372$ );
    var365_366 = var4.first();
    var4 = var4.rest();
    if( NIL != var4 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic372$ );
      return (SubLObject) NIL;
    }
    if( var5.isCons() || ( var5.isSymbol() && NIL != var5 ) )
    {
      final SubLObject var6 = Symbols.make_symbol( (SubLObject) $ic373$ );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var6, var365_366 ) ), reader.bq_cons( (SubLObject) $ic105$, Functions.apply(
          Symbols.symbol_function( (SubLObject) $ic374$ ), f519( var5, var6, (SubLObject) NIL ) ) ) );
    }
    return var365_366;
  }

  public static SubLObject f521(final SubLObject var368, final SubLObject var369, final SubLObject var370)
  {
    if( var369.isList() )
    {
      SubLObject var371 = (SubLObject) NIL;
      SubLObject var372 = (SubLObject) NIL;
      var371 = var369;
      var372 = var371.first();
      while ( var371.isCons())
      {
        if( !var372.isSymbol() )
        {
          Errors.error( (SubLObject) $ic375$ );
        }
        if( !var371.rest().isCons() && NIL != var371.rest() )
        {
          Errors.error( (SubLObject) $ic376$ );
        }
        var371 = var371.rest();
        var372 = var371.first();
      }
    }
    else
    {
      Errors.error( (SubLObject) $ic377$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f522(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic378$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic378$ );
    var6 = var4.first();
    final SubLObject var7;
    var4 = ( var7 = var4.rest() );
    f521( var5, var6, var7 );
    if( NIL == var6 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var5, var7 );
    }
    final SubLObject var8 = var5.isSymbol() ? var5 : Symbols.make_symbol( (SubLObject) $ic380$ );
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var10 = var6;
    SubLObject var11 = (SubLObject) NIL;
    var11 = var10.first();
    while ( NIL != var10)
    {
      if( var11.isSymbol() )
      {
        var9 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var11, reader.bq_cons( var11, conses_high.copy_tree( var7 ) ) ), var9 );
      }
      var10 = var10.rest();
      var11 = var10.first();
    }
    if( NIL == var9 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var5, var7 );
    }
    final SubLObject var12 = (SubLObject) ConsesLow.listS( (SubLObject) $ic381$, var8, Sequences.nreverse( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic382$,
        (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var8, conses_high.copy_tree( var7 ) ) ), var9 ) ) );
    if( var5.eql( var8 ) )
    {
      return var12;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var8, var5 ) ), var12 );
  }

  public static SubLObject f523(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic383$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic383$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic383$ );
    var7 = var4.first();
    final SubLObject var8;
    var4 = ( var8 = var4.rest() );
    if( NIL == var7 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var6, var8 ) );
    }
    final SubLObject var9 = var6.isSymbol() ? var6 : Symbols.make_symbol( (SubLObject) $ic380$ );
    SubLObject var10 = (SubLObject) NIL;
    SubLObject var11 = var7;
    SubLObject var12 = (SubLObject) NIL;
    var12 = var11.first();
    while ( NIL != var11)
    {
      if( var12.isSymbol() )
      {
        var10 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var12, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, reader.bq_cons( var12, conses_high.copy_tree( var8 ) ) ) ), var10 );
      }
      var11 = var11.rest();
      var12 = var11.first();
    }
    if( NIL == var10 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var6, var8 );
    }
    final SubLObject var13 = (SubLObject) ConsesLow.listS( (SubLObject) $ic381$, var9, Sequences.nreverse( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic382$,
        (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var9, conses_high.copy_tree( var8 ) ) ) ), var10 ) ) );
    if( var6.eql( var9 ) )
    {
      return var13;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var9, var6 ) ), var13 );
  }

  public static SubLObject f524(final SubLObject var381)
  {
    SubLObject var382 = (SubLObject) NIL;
    SubLObject var383 = var381;
    SubLObject var384 = (SubLObject) NIL;
    var384 = var383.first();
    while ( NIL != var383)
    {
      var382 = (SubLObject) ConsesLow.cons( Symbols.make_symbol( Symbols.symbol_name( var384 ) ), var382 );
      var383 = var383.rest();
      var384 = var383.first();
    }
    return Sequences.nreverse( var382 );
  }

  public static SubLObject f525(final SubLObject var382, final SubLObject var383)
  {
    SubLObject var384 = (SubLObject) NIL;
    SubLObject var385 = (SubLObject) NIL;
    SubLObject var386 = (SubLObject) NIL;
    SubLObject var387 = (SubLObject) NIL;
    SubLObject var388 = (SubLObject) NIL;
    var385 = var382;
    var386 = var385.first();
    var387 = var383;
    var388 = var387.first();
    while ( NIL != var385 && NIL != var387)
    {
      var384 = (SubLObject) ConsesLow.cons( var386, var384 );
      var384 = (SubLObject) ConsesLow.cons( var388, var384 );
      var385 = var385.rest();
      var386 = var385.first();
      var387 = var387.rest();
      var388 = var387.first();
    }
    return (SubLObject) ( ( NIL != var384 ) ? ConsesLow.cons( (SubLObject) $ic105$, Sequences.nreverse( var384 ) ) : NIL );
  }

  public static SubLObject f526(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic384$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic384$ );
    final SubLObject var6 = var4.rest();
    var4 = var4.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic384$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic384$ );
    var8 = var4.first();
    var4 = ( var9 = var4.rest() );
    final SubLObject var10;
    var4 = ( var10 = var6 );
    if( NIL == var8 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic385$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var7, var9 ), var10 );
    }
    final SubLObject var11 = var7.isSymbol() ? var7 : Symbols.make_symbol( (SubLObject) $ic380$ );
    SubLObject var12 = (SubLObject) NIL;
    SubLObject var13 = var8;
    SubLObject var14 = (SubLObject) NIL;
    var14 = var13.first();
    while ( NIL != var13)
    {
      if( var14.isSymbol() )
      {
        var12 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var14, (SubLObject) ConsesLow.listS( (SubLObject) $ic385$, var5, reader.bq_cons( var14, conses_high.copy_tree( var9 ) ), var10 ) ),
            var12 );
      }
      var13 = var13.rest();
      var14 = var13.first();
    }
    if( NIL == var12 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var7, var9 );
    }
    final SubLObject var15 = (SubLObject) ConsesLow.listS( (SubLObject) $ic381$, var11, Sequences.nreverse( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic382$,
        (SubLObject) ConsesLow.listS( (SubLObject) $ic385$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var11, conses_high.copy_tree( var9 ) ), var10 ) ), var12 ) ) );
    if( var7.eql( var11 ) )
    {
      return var15;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var11, var7 ) ), var15 );
  }

  public static SubLObject f527(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic386$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic386$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic386$ );
    var7 = var4.first();
    final SubLObject var8;
    var4 = ( var8 = var4.rest() );
    if( NIL == var7 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic387$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var6, var8 ) );
    }
    final SubLObject var9 = var6.isSymbol() ? var6 : Symbols.make_symbol( (SubLObject) $ic380$ );
    SubLObject var10 = (SubLObject) NIL;
    SubLObject var11 = var7;
    SubLObject var12 = (SubLObject) NIL;
    var12 = var11.first();
    while ( NIL != var11)
    {
      if( var12.isSymbol() )
      {
        var10 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var12, (SubLObject) ConsesLow.list( (SubLObject) $ic387$, var5, reader.bq_cons( var12, conses_high.copy_tree( var8 ) ) ) ), var10 );
      }
      var11 = var11.rest();
      var12 = var11.first();
    }
    if( NIL == var10 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var6, var8 );
    }
    final SubLObject var13 = (SubLObject) ConsesLow.listS( (SubLObject) $ic381$, var9, Sequences.nreverse( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic382$,
        (SubLObject) ConsesLow.list( (SubLObject) $ic387$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var9, conses_high.copy_tree( var8 ) ) ) ), var10 ) ) );
    if( var6.eql( var9 ) )
    {
      return var13;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var9, var6 ) ), var13 );
  }

  public static SubLObject f528(final SubLObject var397, final SubLObject var398)
  {
    if( NIL == var397 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var398 );
    }
    if( var397.isSymbol() )
    {
      return (SubLObject) ConsesLow.list( var397, var398 );
    }
    if( var397.isAtom() )
    {
      return (SubLObject) T;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic199$, (SubLObject) ConsesLow.list( (SubLObject) $ic335$, var398 ), f528( var397.first(), (SubLObject) ConsesLow.list(
        (SubLObject) $ic100$, var398 ) ), f528( var397.rest(), (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var398 ) ) );
  }

  public static SubLObject f529(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic388$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    if( var5.isCons() && $ic6$ == var5.first() )
    {
      return reader.bq_cons( conses_high.second( var5 ), ConsesLow.append( var6, (SubLObject) NIL ) );
    }
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic379$, var5, ConsesLow.append( var6, (SubLObject) NIL ) );
  }

  public static SubLObject f530(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic389$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic389$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return f528( var5, var6 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic389$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f531(final SubLObject var234, final SubLObject var404, final SubLObject var405, final SubLObject var406, final SubLObject var10, SubLObject var407)
  {
    if( var407 == UNPROVIDED )
    {
      var407 = (SubLObject) T;
    }
    SubLObject var408 = (SubLObject) NIL;
    SubLObject var409 = (SubLObject) NIL;
    final SubLObject var410 = var405.isSymbol() ? Symbols.symbol_name( var405 ) : var405;
    SubLObject var411 = (SubLObject) NIL;
    SubLObject var412 = (SubLObject) NIL;
    SubLObject var413 = (SubLObject) NIL;
    SubLObject var414 = (SubLObject) NIL;
    SubLObject var415 = var406;
    SubLObject var416 = (SubLObject) NIL;
    var416 = var415.first();
    while ( NIL != var415)
    {
      if( var416.isCons() )
      {
        var411 = var416.first();
        var413 = conses_high.cadr( var416 );
        var414 = conses_high.cddr( var416 ).first();
        var412 = (SubLObject) NIL;
      }
      else
      {
        var411 = var416;
        var413 = (SubLObject) NIL;
        var414 = (SubLObject) NIL;
        var412 = Packages.intern( PrintLow.format( (SubLObject) NIL, (SubLObject) $ic390$, var410, var411 ), (SubLObject) UNPROVIDED );
      }
      if( NIL != conses_high.symbol_in_tree_p( var411, var10 ) )
      {
        var408 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var411, (SubLObject) ConsesLow.list( ( NIL != var413 ) ? var413 : var412, var234 ) ), var408 );
        if( NIL == var407 )
        {
          var409 = (SubLObject) ConsesLow.cons( (SubLObject) ( ( NIL != var414 ) ? ConsesLow.list( var414, var234, var411 )
              : ConsesLow.list( (SubLObject) $ic202$, (SubLObject) ConsesLow.list( var412, var234 ), var411 ) ), var409 );
        }
      }
      var415 = var415.rest();
      var416 = var415.first();
    }
    if( NIL == var408 )
    {
      return reader.bq_cons( (SubLObject) $ic3$, var10 );
    }
    if( NIL != var407 )
    {
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, reader.bq_cons( (SubLObject) ConsesLow.list( var234, var404 ), Sequences.reverse( var408 ) ), var10 );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, reader.bq_cons( (SubLObject) ConsesLow.list( var234, var404 ), Sequences.reverse( var408 ) ), (SubLObject) ConsesLow.listS(
        (SubLObject) $ic163$, reader.bq_cons( (SubLObject) $ic3$, var10 ), Sequences.reverse( var409 ) ) );
  }

  public static SubLObject f532(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var5;
      SubLObject var9 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
      var9 = var4.first();
      var4 = var4.rest();
      if( NIL == var4 )
      {
        final SubLObject var10 = Symbols.make_symbol( (SubLObject) $ic392$ );
        final SubLObject var11 = Symbols.make_symbol( (SubLObject) $ic393$ );
        final SubLObject var12 = Symbols.make_symbol( (SubLObject) $ic394$ );
        return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var10, var7 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic395$,
            (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var10 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var8, (SubLObject) $ic211$ ) ),
            (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic396$, var10 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var8, (SubLObject) ConsesLow.list(
                (SubLObject) $ic359$, var10 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, (SubLObject) ConsesLow.list( (SubLObject) $ic334$,
                    var10 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var6, (SubLObject) ConsesLow.list( (SubLObject) $ic100$,
                        var10 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var8, (SubLObject) ConsesLow.list( (SubLObject) $ic359$, var9 ) ) ) ), (SubLObject) ConsesLow.list(
                            (SubLObject) T, (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( reader.bq_cons( var11, (SubLObject) $ic211$ ), reader.bq_cons(
                                var12, (SubLObject) $ic211$ ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var6,
                                    (SubLObject) ConsesLow.list( (SubLObject) $ic100$, var10 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var8, (SubLObject) ConsesLow.list(
                                        (SubLObject) $ic359$, var9 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, var8 ) ), (SubLObject) ConsesLow.list(
                                            (SubLObject) $ic292$, (SubLObject) ConsesLow.list( var6, (SubLObject) ConsesLow.list( (SubLObject) $ic334$, var10 ) ), (SubLObject) ConsesLow.list(
                                                (SubLObject) $ic105$, var12, (SubLObject) ConsesLow.list( (SubLObject) $ic359$, var9 ) ), (SubLObject) ConsesLow.list(
                                                    (SubLObject) $ic361$, var11, var12 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, var12 ) ) ) ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic391$ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic391$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f533(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var5;
      SubLObject var9 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic391$ );
      var9 = var4.first();
      var4 = var4.rest();
      if( NIL == var4 )
      {
        final SubLObject var10 = Symbols.make_symbol( (SubLObject) $ic392$ );
        final SubLObject var11 = Symbols.make_symbol( (SubLObject) $ic393$ );
        final SubLObject var12 = Symbols.make_symbol( (SubLObject) $ic394$ );
        return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var10, var7 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic395$,
            (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, var10 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var8, (SubLObject) $ic211$ ) ),
            (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic396$, var10 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var8, (SubLObject) ConsesLow.list(
                (SubLObject) $ic359$, var10 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic333$, (SubLObject) ConsesLow.list( (SubLObject) $ic334$,
                    var10 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var6, (SubLObject) ConsesLow.list( (SubLObject) $ic100$,
                        var10 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var8, var9 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) T, (SubLObject) ConsesLow.list(
                            (SubLObject) $ic84$, (SubLObject) ConsesLow.list( reader.bq_cons( var11, (SubLObject) $ic211$ ), reader.bq_cons( var12, (SubLObject) $ic211$ ) ),
                            (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var8, (SubLObject) $ic211$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic292$, (SubLObject) ConsesLow
                                .list( var6, var10 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var12, var9 ), (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var12,
                                    (SubLObject) ConsesLow.list( (SubLObject) $ic85$, var11, (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list(
                                        (SubLObject) $ic361$, var11, var12 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, (SubLObject) ConsesLow.list( (SubLObject) $ic360$,
                                            var12 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var8, var9 ), (SubLObject) ConsesLow
                                                .list( (SubLObject) $ic105$, var11, (SubLObject) ConsesLow.list( (SubLObject) $ic360$, var8 ) ) ) ) ) ) ) ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic391$ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic391$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f534(final SubLObject var377, final SubLObject var426, final SubLObject var309, final SubLObject var127, final SubLObject var10)
  {
    SubLObject var427 = (SubLObject) NIL;
    SubLObject var428 = (SubLObject) NIL;
    if( var426.eql( (SubLObject) $ic397$ ) )
    {
      var427 = (SubLObject) $ic398$;
    }
    else if( var426.eql( (SubLObject) $ic399$ ) )
    {
      var427 = (SubLObject) $ic4$;
    }
    else if( var426.eql( (SubLObject) $ic400$ ) )
    {
      var427 = (SubLObject) $ic401$;
    }
    else if( var426.eql( (SubLObject) $ic402$ ) )
    {
      var427 = (SubLObject) $ic63$;
    }
    else
    {
      var427 = (SubLObject) $ic4$;
    }
    if( var127.eql( (SubLObject) $ic403$ ) )
    {
      var428 = (SubLObject) ConsesLow.listS( var427, var377, (SubLObject) $ic332$, (SubLObject) $ic404$, (SubLObject) ConsesLow.list( (SubLObject) $ic292$, reader.bq_cons( var309,
          (SubLObject) $ic332$ ), (SubLObject) ConsesLow.listS( (SubLObject) $ic201$, var10, (SubLObject) $ic205$ ) ), (SubLObject) $ic204$ );
    }
    else if( var127.eql( (SubLObject) $ic405$ ) )
    {
      var428 = (SubLObject) ConsesLow.listS( var427, var377, (SubLObject) $ic332$, (SubLObject) $ic406$, (SubLObject) ConsesLow.list( (SubLObject) $ic292$, reader.bq_cons( var309,
          (SubLObject) $ic332$ ), (SubLObject) ConsesLow.listS( (SubLObject) $ic201$, var10, (SubLObject) $ic205$ ) ), (SubLObject) $ic204$ );
    }
    else if( var127.eql( (SubLObject) $ic407$ ) )
    {
      var428 = (SubLObject) ConsesLow.listS( var427, var377, (SubLObject) $ic332$, (SubLObject) $ic404$, (SubLObject) ConsesLow.list( (SubLObject) $ic292$, reader.bq_cons( var309,
          (SubLObject) $ic332$ ), (SubLObject) ConsesLow.listS( (SubLObject) $ic37$, var10, (SubLObject) $ic204$ ) ), (SubLObject) $ic205$ );
    }
    else
    {
      Errors.error( (SubLObject) $ic408$, var127 );
    }
    return var428;
  }

  public static SubLObject f535(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    final SubLObject var7 = var4.rest();
    var4 = var4.first();
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var7;
      SubLObject var9 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
      var9 = var4.first();
      var4 = var4.rest();
      if( NIL == var4 )
      {
        return f534( var5, (SubLObject) $ic397$, var8, var6, var9 );
      }
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f536(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    final SubLObject var7 = var4.rest();
    var4 = var4.first();
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var7;
      SubLObject var9 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
      var9 = var4.first();
      var4 = var4.rest();
      if( NIL == var4 )
      {
        return f534( var5, (SubLObject) $ic399$, var8, var6, var9 );
      }
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f537(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    final SubLObject var7 = var4.rest();
    var4 = var4.first();
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var7;
      SubLObject var9 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
      var9 = var4.first();
      var4 = var4.rest();
      if( NIL == var4 )
      {
        return f534( var5, (SubLObject) $ic400$, var8, var6, var9 );
      }
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f538(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    final SubLObject var7 = var4.rest();
    var4 = var4.first();
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var7;
      SubLObject var9 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic409$ );
      var9 = var4.first();
      var4 = var4.rest();
      if( NIL == var4 )
      {
        return f534( var5, (SubLObject) $ic402$, var8, var6, var9 );
      }
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic409$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f539(final SubLObject var442)
  {
    return Sequences.remove( (SubLObject) $ic410$, Mapping.mapcar( (SubLObject) $ic411$, var442 ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f540(final SubLObject var71)
  {
    return var71.isCons() ? var71.first() : var71;
  }

  public static SubLObject f541(final SubLObject var71)
  {
    return (SubLObject) ( var71.isCons() ? var71.first() : NIL );
  }

  public static SubLObject f542(final SubLObject var443)
  {
    final SubLThread var444 = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var444 ) && !var443.isList() )
    {
      Errors.error( (SubLObject) $ic412$, var443 );
    }
    if( var443.first().isAtom() )
    {
      Errors.error( (SubLObject) $ic413$, var443.first() );
      return (SubLObject) NIL;
    }
    if( NIL != var443.rest() )
    {
      final SubLObject var445 = var443.first();
      final SubLObject var446 = var443.rest();
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var444 ) && ( !var445.isCons() || !var445.rest().isCons() || NIL != conses_high.cddr( var445 ) ) )
      {
        Errors.error( (SubLObject) $ic413$, var445 );
      }
      return (SubLObject) ConsesLow.list( (SubLObject) $ic223$, var445.first(), conses_high.cadr( var445 ), f542( var446 ) );
    }
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic223$, conses_high.caar( var443 ), conses_high.cadr( var443.first() ), (SubLObject) $ic211$ );
  }

  public static SubLObject f543(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return f542( var5 );
  }

  public static SubLObject f544(final SubLObject var443)
  {
    final SubLThread var444 = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var444 ) && !var443.isList() )
    {
      Errors.error( (SubLObject) $ic414$, var443 );
    }
    SubLObject var445 = var443;
    SubLObject var446 = (SubLObject) NIL;
    var446 = var445.first();
    while ( NIL != var445)
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var444 ) && !var446.isCons() )
      {
        Errors.error( (SubLObject) $ic415$, var446 );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var444 ) && var446.first() != $ic382$ && !var446.first().isInteger() && ( !var446.first().isCons() || !conses_high.caar( var446 ).isInteger()
          || !conses_high.cdar( var446 ).isCons() || !conses_high.cadr( var446.first() ).isInteger() ) )
      {
        Errors.error( (SubLObject) $ic415$, var446 );
      }
      var445 = var445.rest();
      var446 = var445.first();
    }
    return (SubLObject) T;
  }

  public static SubLObject f545(final SubLObject var449, final SubLObject var450)
  {
    return Equality.eq( var449, var450.first() );
  }

  public static SubLObject f546(final SubLObject var66, SubLObject var443)
  {
    final SubLObject var444 = Symbols.make_symbol( (SubLObject) $ic416$ );
    SubLObject var445 = (SubLObject) NIL;
    SubLObject var446 = conses_high.assoc( (SubLObject) $ic382$, var443, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    if( NIL != var446 )
    {
      var446 = (SubLObject) ConsesLow.list( reader.bq_cons( (SubLObject) T, ConsesLow.append( var446.rest(), (SubLObject) NIL ) ) );
      var443 = Sequences.remove( (SubLObject) $ic382$, var443, Symbols.symbol_function( (SubLObject) EQ ), Symbols.symbol_function( (SubLObject) $ic100$ ),
          (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    final SubLObject var447 = var443;
    if( NIL == var447 )
    {
      var445 = (SubLObject) NIL;
    }
    else if( var447.isAtom() )
    {
      var445 = (SubLObject) ConsesLow.list( var447 );
    }
    else if( NIL == var447.rest() )
    {
      final SubLObject var448 = var447.first();
      var445 = (SubLObject) ConsesLow.list( var448.first().isCons() ? reader.bq_cons( (SubLObject) ConsesLow.list( (SubLObject) $ic199$, (SubLObject) ConsesLow.list( (SubLObject) $ic417$, var444,
          conses_high.caar( var448 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic418$, var444, conses_high.cadr( var448.first() ) ) ), var448.rest() )
          : reader.bq_cons( (SubLObject) ConsesLow.list( (SubLObject) $ic419$, var444, var448.first() ), var448.rest() ) );
    }
    else
    {
      SubLObject var449 = (SubLObject) NIL;
      SubLObject var450 = (SubLObject) NIL;
      final SubLObject var451 = var447.first();
      var445 = ( var449 = (SubLObject) ConsesLow.list( var451.first().isCons() ? reader.bq_cons( (SubLObject) ConsesLow.list( (SubLObject) $ic199$, (SubLObject) ConsesLow.list( (SubLObject) $ic417$,
          var444, conses_high.caar( var451 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic418$, var444, conses_high.cadr( var451.first() ) ) ), var451.rest() )
          : reader.bq_cons( (SubLObject) ConsesLow.list( (SubLObject) $ic419$, var444, var451.first() ), var451.rest() ) ) );
      SubLObject var452 = var447.rest();
      SubLObject var453 = (SubLObject) NIL;
      var453 = var452.first();
      while ( NIL != var452)
      {
        var450 = (SubLObject) ConsesLow.list( var453.first().isCons() ? reader.bq_cons( (SubLObject) ConsesLow.list( (SubLObject) $ic199$, (SubLObject) ConsesLow.list( (SubLObject) $ic417$, var444,
            conses_high.caar( var453 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic418$, var444, conses_high.cadr( var453.first() ) ) ), var453.rest() )
            : reader.bq_cons( (SubLObject) ConsesLow.list( (SubLObject) $ic419$, var444, var453.first() ), var453.rest() ) );
        ConsesLow.rplacd( var449, var450 );
        var449 = var450;
        var452 = var452.rest();
        var453 = var452.first();
      }
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var444, var66 ) ), reader.bq_cons( (SubLObject) $ic395$, ConsesLow.append(
        var445, var446, (SubLObject) NIL ) ) );
  }

  public static SubLObject f547(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic420$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    f544( var6 );
    return f546( var5, var6 );
  }

  public static SubLObject f548(final SubLObject var459)
  {
    return (SubLObject) ConsesLow.list( (SubLObject) $ic421$, (SubLObject) $ic422$, var459 );
  }

  public static SubLObject f549(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic423$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic423$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var5;
      SubLObject var7 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic423$ );
      var7 = var4.first();
      var4 = var4.rest();
      SubLObject var8 = (SubLObject) NIL;
      SubLObject var9 = var4;
      SubLObject var10 = (SubLObject) NIL;
      SubLObject var467_468 = (SubLObject) NIL;
      while ( NIL != var9)
      {
        cdestructuring_bind.destructuring_bind_must_consp( var9, var3, (SubLObject) $ic423$ );
        var467_468 = var9.first();
        var9 = var9.rest();
        cdestructuring_bind.destructuring_bind_must_consp( var9, var3, (SubLObject) $ic423$ );
        if( NIL == conses_high.member( var467_468, (SubLObject) $ic424$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
        {
          var10 = (SubLObject) T;
        }
        if( var467_468 == $ic91$ )
        {
          var8 = var9.first();
        }
        var9 = var9.rest();
      }
      if( NIL != var10 && NIL == var8 )
      {
        cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic423$ );
      }
      final SubLObject var11 = cdestructuring_bind.property_list_member( (SubLObject) $ic425$, var4 );
      final SubLObject var12 = (SubLObject) ( ( NIL != var11 ) ? conses_high.cadr( var11 ) : NIL );
      SubLObject var13 = (SubLObject) NIL;
      var13 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic382$, ( NIL != var12 ) ? var12 : f548( var6 ) ), var13 );
      SubLObject var14 = var7;
      SubLObject var15 = (SubLObject) NIL;
      var15 = var14.first();
      while ( NIL != var14)
      {
        SubLObject var474_475;
        final SubLObject var472_473 = var474_475 = var15;
        SubLObject var459_476 = (SubLObject) NIL;
        SubLObject var16 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var474_475, var472_473, (SubLObject) $ic426$ );
        var459_476 = var474_475.first();
        var474_475 = var474_475.rest();
        cdestructuring_bind.destructuring_bind_must_consp( var474_475, var472_473, (SubLObject) $ic426$ );
        var16 = var474_475.first();
        var474_475 = var474_475.rest();
        if( NIL == var474_475 )
        {
          var13 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var459_476, var16 ), var13 );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( var472_473, (SubLObject) $ic426$ );
        }
        var14 = var14.rest();
        var15 = var14.first();
      }
      return (SubLObject) ConsesLow.listS( (SubLObject) $ic381$, var6, ConsesLow.append( var13, (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic423$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f550(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic427$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic427$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic427$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      var4 = var5;
      SubLObject var8 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic427$ );
      var8 = var4.first();
      var4 = var4.rest();
      SubLObject var9 = (SubLObject) NIL;
      SubLObject var10 = var4;
      SubLObject var11 = (SubLObject) NIL;
      SubLObject var486_487 = (SubLObject) NIL;
      while ( NIL != var10)
      {
        cdestructuring_bind.destructuring_bind_must_consp( var10, var3, (SubLObject) $ic427$ );
        var486_487 = var10.first();
        var10 = var10.rest();
        cdestructuring_bind.destructuring_bind_must_consp( var10, var3, (SubLObject) $ic427$ );
        if( NIL == conses_high.member( var486_487, (SubLObject) $ic424$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
        {
          var11 = (SubLObject) T;
        }
        if( var486_487 == $ic91$ )
        {
          var9 = var10.first();
        }
        var10 = var10.rest();
      }
      if( NIL != var11 && NIL == var9 )
      {
        cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic427$ );
      }
      final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic425$, var4 );
      final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL );
      SubLObject var14 = (SubLObject) NIL;
      var14 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) T, ( NIL != var13 ) ? var13 : f548( var6 ) ), var14 );
      SubLObject var15 = var8;
      SubLObject var16 = (SubLObject) NIL;
      var16 = var15.first();
      while ( NIL != var15)
      {
        SubLObject var491_492;
        final SubLObject var489_490 = var491_492 = var16;
        SubLObject var17 = (SubLObject) NIL;
        SubLObject var18 = (SubLObject) NIL;
        SubLObject var19 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var491_492, var489_490, (SubLObject) $ic428$ );
        var17 = var491_492.first();
        var491_492 = var491_492.rest();
        cdestructuring_bind.destructuring_bind_must_consp( var491_492, var489_490, (SubLObject) $ic428$ );
        var18 = var491_492.first();
        var491_492 = var491_492.rest();
        cdestructuring_bind.destructuring_bind_must_consp( var491_492, var489_490, (SubLObject) $ic428$ );
        var19 = var491_492.first();
        var491_492 = var491_492.rest();
        if( NIL == var491_492 )
        {
          var14 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic199$, (SubLObject) ConsesLow.list( (SubLObject) EQUAL, var17, var6 ),
              (SubLObject) ConsesLow.list( (SubLObject) EQUAL, var18, var7 ) ), var19 ), var14 );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( var489_490, (SubLObject) $ic428$ );
        }
        var15 = var15.rest();
        var16 = var15.first();
      }
      return reader.bq_cons( (SubLObject) $ic395$, ConsesLow.append( var14, (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic427$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f551(final SubLObject var495)
  {
    final SubLObject var496 = Symbols.symbol_name( var495 );
    final SubLObject var497 = Sequences.length( var496 );
    final SubLObject var498 = module0038.f2623( var496, (SubLObject) ONE_INTEGER, Numbers.subtract( var497, (SubLObject) TWO_INTEGER ) );
    return var498;
  }

  public static SubLObject f552(final SubLObject var495)
  {
    final SubLObject var496 = f551( var495 );
    final SubLObject var497 = Sequences.cconcatenate( var496, (SubLObject) $ic431$ );
    return Packages.intern( var497, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f553(final SubLObject var495)
  {
    final SubLObject var496 = f551( var495 );
    final SubLObject var497 = Sequences.cconcatenate( (SubLObject) $ic433$, var496 );
    return Packages.intern( var497, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f554(final SubLObject var495)
  {
    final SubLObject var496 = f551( var495 );
    final SubLObject var497 = Sequences.cconcatenate( (SubLObject) $ic435$, var496 );
    return Packages.intern( var497, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f555(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic436$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic436$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = f552( var5 );
      final SubLObject var8 = f553( var5 );
      final SubLObject var9 = f554( var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic437$, var5, (SubLObject) $ic211$ ), (SubLObject) ConsesLow.listS(
          (SubLObject) $ic109$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var5 ), (SubLObject) $ic438$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic4$, var7,
              (SubLObject) NIL, var6, (SubLObject) ConsesLow.list( (SubLObject) $ic54$, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic401$, var8, (SubLObject) NIL,
                  (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var5, (SubLObject) $ic439$ ), (SubLObject) $ic204$ ), (SubLObject) ConsesLow.listS( (SubLObject) $ic401$,
                      var9, (SubLObject) NIL, (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var5, (SubLObject) $ic211$ ), (SubLObject) $ic205$ ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic436$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f556(final SubLObject var370)
  {
    SubLObject var371 = (SubLObject) NIL;
    SubLObject var372 = (SubLObject) NIL;
    SubLObject var373 = (SubLObject) NIL;
    SubLObject var374 = (SubLObject) NIL;
    var372 = var370;
    var373 = (SubLObject) ( ( NIL != var372 ) ? var372.first() : NIL );
    var374 = (SubLObject) ( ( NIL != var372 ) ? conses_high.cadr( var372 ) : NIL );
    while ( NIL != var372)
    {
      final SubLObject var375 = var373;
      if( var375.eql( (SubLObject) $ic440$ ) )
      {
        var371 = (SubLObject) ConsesLow.cons( var374, var371 );
      }
      else if( var375.eql( (SubLObject) $ic441$ ) )
      {
        var371 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic61$, var374 ), var371 );
      }
      else if( var375.eql( (SubLObject) $ic442$ ) )
      {
        var371 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic443$, var374 ), var371 );
      }
      var372 = conses_high.cddr( var372 );
      var373 = (SubLObject) ( ( NIL != var372 ) ? var372.first() : NIL );
      var374 = (SubLObject) ( ( NIL != var372 ) ? conses_high.cadr( var372 ) : NIL );
    }
    return reader.bq_cons( (SubLObject) $ic444$, ConsesLow.append( Sequences.nreverse( var371 ), (SubLObject) NIL ) );
  }

  public static SubLObject f557(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    final SubLObject var4 = var1.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    SubLObject var7 = (SubLObject) T;
    SubLObject var8 = var6;
    SubLObject var9 = (SubLObject) NIL;
    var9 = var8.first();
    while ( NIL != var8)
    {
      if( NIL != var7 && NIL == Errors.$ignore_mustsP$.getDynamicValue( var3 ) && NIL == conses_high.member( var9, (SubLObject) $ic445$, (SubLObject) UNPROVIDED,
          (SubLObject) UNPROVIDED ) )
      {
        Errors.error( (SubLObject) $ic446$, var9 );
      }
      var7 = (SubLObject) makeBoolean( NIL == var7 );
      var8 = var8.rest();
      var9 = var8.first();
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var3 ) && NIL == var7 )
    {
      Errors.error( (SubLObject) $ic447$, var6 );
    }
    return f556( var6 );
  }

  public static SubLObject time(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    final SubLObject var6 = (SubLObject) $ic448$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var6 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic449$, var6, ConsesLow.append( var5,
        (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic450$, (SubLObject) T, (SubLObject) $ic451$, var6 ), (SubLObject) ConsesLow.list(
            (SubLObject) IDENTITY, var6 ) );
  }

  public static SubLObject f558(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic452$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    final SubLObject var7 = (SubLObject) $ic453$;
    final SubLObject var8 = (SubLObject) $ic454$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var7, var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic449$, var8, (SubLObject) ConsesLow.listS(
        (SubLObject) $ic455$, var7, ConsesLow.append( var6, (SubLObject) NIL ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, (SubLObject) ConsesLow.list(
            (SubLObject) $ic456$, (SubLObject) ConsesLow.list( (SubLObject) $ic457$, var8, var7 ) ) ) );
  }

  public static SubLObject f559(final SubLObject var521)
  {
    SubLObject var522 = (SubLObject) NIL;
    SubLObject var523;
    SubLObject var524;
    SubLObject var525;
    SubLObject var526;
    for( var523 = (SubLObject) NIL, var523 = var521; NIL != var523; var523 = conses_high.cddr( var523 ) )
    {
      var524 = var523.first();
      var525 = conses_high.cadr( var523 );
      var526 = ( ( NIL != module0035.f2169( var524, $g88$.getGlobalValue() ) ) ? Numbers.divide( var525, (SubLObject) $ic460$ ) : var525 );
      var522 = conses_high.putf( var522, var524, var526 );
    }
    return var522;
  }

  public static SubLObject f560(final SubLObject var522, final SubLObject var521)
  {
    return conses_high.putf( var521, (SubLObject) $ic461$, var522 );
  }

  public static SubLObject f561(final SubLObject var521)
  {
    return conses_high.getf( var521, (SubLObject) $ic462$, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f562(final SubLObject var521)
  {
    return conses_high.getf( var521, (SubLObject) $ic463$, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f563(final SubLObject var521)
  {
    return conses_high.getf( var521, (SubLObject) $ic461$, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f564(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    final SubLObject var6 = (SubLObject) $ic464$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var6 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic459$, var6, ConsesLow.append( var5,
        (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic450$, (SubLObject) T, (SubLObject) $ic465$, var6 ), (SubLObject) ConsesLow.list(
            (SubLObject) IDENTITY, var6 ) );
  }

  public static SubLObject f565(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic452$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    final SubLObject var7 = (SubLObject) $ic466$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var7 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic459$, var7, ConsesLow.append( var6,
        (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic467$, var7 ) ) );
  }

  public static SubLObject f566(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic452$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    final SubLObject var7 = (SubLObject) $ic468$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var7 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic459$, var7, ConsesLow.append( var6,
        (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic467$, var7 ) ) );
  }

  public static SubLObject f567(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic452$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    final SubLObject var7 = (SubLObject) $ic469$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var7 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic459$, var7, ConsesLow.append( var6,
        (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic470$, var7 ) ) );
  }

  public static SubLObject f568(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic452$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    final SubLObject var7 = (SubLObject) $ic471$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var7 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic459$, var7, ConsesLow.append( var6,
        (SubLObject) NIL ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic470$, var7 ) ) );
  }

  public static SubLObject f569(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic472$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic472$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic34$, var5, var6 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic472$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f570(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic472$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic472$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic473$, var5, var6 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic472$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f571(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = (SubLObject) $ic475$;
      final SubLObject var8 = (SubLObject) $ic476$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var8, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic34$, var8,
          (SubLObject) $ic477$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic292$, (SubLObject) ConsesLow.list( var7, var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic34$, var7,
              var6 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic474$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f572(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic478$, var5, var6 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic474$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f573(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = (SubLObject) $ic479$;
      final SubLObject var8 = (SubLObject) $ic480$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var8, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic473$, var8,
          (SubLObject) $ic477$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic292$, (SubLObject) ConsesLow.list( var7, var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic473$, var7,
              var6 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic474$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f574(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic474$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var5, (SubLObject) ConsesLow.list( (SubLObject) $ic478$, var5, var6 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic474$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f575(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic481$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic481$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = (SubLObject) $ic482$;
      final SubLObject var8 = (SubLObject) $ic483$;
      final SubLObject var9 = (SubLObject) $ic484$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var9, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic34$, var9,
          (SubLObject) $ic485$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic367$, (SubLObject) ConsesLow.list( var7, var8, var9 ), (SubLObject) ConsesLow.list( (SubLObject) $ic244$,
              var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic34$, var7, var6 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic481$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f576(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic481$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic481$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = (SubLObject) $ic486$;
      final SubLObject var8 = (SubLObject) $ic487$;
      final SubLObject var9 = (SubLObject) $ic488$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var9, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic473$, var9,
          (SubLObject) $ic485$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic367$, (SubLObject) ConsesLow.list( var7, var8, var9 ), (SubLObject) ConsesLow.list( (SubLObject) $ic244$,
              var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic473$, var7, var6 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic481$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f577(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic481$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic481$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = (SubLObject) $ic489$;
      final SubLObject var8 = (SubLObject) $ic490$;
      final SubLObject var9 = (SubLObject) $ic491$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var9, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic34$, var9,
          (SubLObject) $ic485$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic367$, (SubLObject) ConsesLow.list( var7, var8, var9 ), (SubLObject) ConsesLow.list( (SubLObject) $ic244$,
              var8 ), (SubLObject) ConsesLow.list( (SubLObject) $ic492$, (SubLObject) ConsesLow.list( var6, var7 ), (SubLObject) $ic493$, var7, (SubLObject) ConsesLow.list(
                  (SubLObject) $ic6$, var6 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic481$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f578(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic494$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic494$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic494$ );
    var7 = var4.first();
    final SubLObject var8;
    var4 = ( var8 = var4.rest() );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic37$, var5, (SubLObject) ConsesLow.listS( (SubLObject) $ic495$, var6, var7, ConsesLow.append( var8, (SubLObject) NIL ) ) );
  }

  public static SubLObject f579(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic496$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic496$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7 = (SubLObject) $ic497$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var7, var5 ) ),
          (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var5, var6 ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var6, var7 ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic496$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f580(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic498$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic498$ );
    final SubLObject var6 = var4.rest();
    var4 = var4.first();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var572_573 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic498$ );
      var572_573 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic498$ );
      if( NIL == conses_high.member( var572_573, (SubLObject) $ic499$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var572_573 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic498$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic93$, var4 );
    final SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic500$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) $ic501$, var4 );
    final SubLObject var15 = (SubLObject) ( ( NIL != var14 ) ? conses_high.cadr( var14 ) : NIL );
    final SubLObject var16;
    var4 = ( var16 = var6 );
    assert NIL != Types.symbolp( var5 ) : var5;
    if( NIL != var11 && !areAssertionsDisabledFor( me ) && NIL == Types.stringp( var11 ) )
    {
      throw new AssertionError( var11 );
    }
    final SubLObject var17 = Symbols.symbol_package( var5 );
    final SubLObject var18 = PrintLow.format( (SubLObject) NIL, (SubLObject) $ic502$, var5 );
    final SubLObject var19 = Packages.intern( var18, var17 );
    return reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( (SubLObject) ( ( NIL != var15 ) ? ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic503$,
        (SubLObject) ConsesLow.list( (SubLObject) $ic6$, (SubLObject) ConsesLow.list( (SubLObject) $ic95$, var15, var5 ) ) ) ) : NIL ), (SubLObject) ConsesLow.list(
            (SubLObject) ( ( NIL != var13 ) ? ConsesLow.list( var13, var5, (SubLObject) $ic504$, var11 )
                : ConsesLow.list( (SubLObject) $ic116$, var5, (SubLObject) $ic504$, var11 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic505$, (SubLObject) ConsesLow.list(
                    (SubLObject) $ic6$, var5 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var19 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic63$, var19,
                        (SubLObject) NIL, ConsesLow.append( var16, (SubLObject) NIL ) ) ) ) );
  }

  public static SubLObject f581(final SubLObject var582, final SubLObject var583)
  {
    $g89$.setGlobalValue( module0035.f2063( $g89$.getGlobalValue(), var582, var583, (SubLObject) UNPROVIDED ) );
    return (SubLObject) NIL;
  }

  public static SubLObject f582()
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    final SubLObject var4 = (SubLObject) $ic508$;
    final SubLObject var5 = $g73$.currentBinding( var3 );
    final SubLObject var6 = $g65$.currentBinding( var3 );
    final SubLObject var7 = $g67$.currentBinding( var3 );
    final SubLObject var8 = $g68$.currentBinding( var3 );
    final SubLObject var9 = $g66$.currentBinding( var3 );
    final SubLObject var10 = $g69$.currentBinding( var3 );
    final SubLObject var11 = $g70$.currentBinding( var3 );
    final SubLObject var12 = $silent_progressP$.currentBinding( var3 );
    try
    {
      $g73$.bind( Time.get_universal_time(), var3 );
      $g65$.bind( $g73$.getDynamicValue( var3 ), var3 );
      $g67$.bind( (SubLObject) ONE_INTEGER, var3 );
      $g68$.bind( (SubLObject) ZERO_INTEGER, var3 );
      $g66$.bind( (SubLObject) ZERO_INTEGER, var3 );
      $g69$.bind( (SubLObject) ZERO_INTEGER, var3 );
      $g70$.bind( (SubLObject) T, var3 );
      $silent_progressP$.bind( (SubLObject) ( ( NIL != var4 ) ? $silent_progressP$.getDynamicValue( var3 ) : T ), var3 );
      f474( var4 );
      SubLObject var13 = $g89$.getGlobalValue();
      SubLObject var14 = (SubLObject) NIL;
      var14 = var13.first();
      while ( NIL != var13)
      {
        SubLObject var16;
        final SubLObject var15 = var16 = var14;
        SubLObject var17 = (SubLObject) NIL;
        SubLObject var18 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var16, var15, (SubLObject) $ic509$ );
        var17 = var16.first();
        var16 = ( var18 = var16.rest() );
        Symbols.set( var17, Functions.funcall( var18 ) );
        var13 = var13.rest();
        var14 = var13.first();
      }
      f475();
    }
    finally
    {
      $silent_progressP$.rebind( var12, var3 );
      $g70$.rebind( var11, var3 );
      $g69$.rebind( var10, var3 );
      $g66$.rebind( var9, var3 );
      $g68$.rebind( var8, var3 );
      $g67$.rebind( var7, var3 );
      $g65$.rebind( var6, var3 );
      $g73$.rebind( var5, var3 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f583(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var603_604 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      var603_604 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      if( NIL == conses_high.member( var603_604, (SubLObject) $ic511$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var603_604 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic510$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic512$, var4 );
    SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic92$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : $ic513$ );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) $ic514$, var4 );
    final SubLObject var15 = (SubLObject) ( ( NIL != var14 ) ? conses_high.cadr( var14 ) : $ic513$ );
    final SubLObject var16 = cdestructuring_bind.property_list_member( (SubLObject) $ic93$, var4 );
    final SubLObject var17 = (SubLObject) ( ( NIL != var16 ) ? conses_high.cadr( var16 ) : NIL );
    if( NIL != module0038.f2684( Symbols.symbol_name( var5 ), (SubLObject) $ic515$ ) || NIL != module0038.f2673( Symbols.symbol_name( var5 ), (SubLObject) $ic515$,
        (SubLObject) UNPROVIDED ) )
    {
      Errors.error( (SubLObject) $ic516$, var5 );
    }
    if( NIL == var11 )
    {
      final SubLObject var18 = Sequences.cconcatenate( (SubLObject) $ic515$, new SubLObject[] { module0006.f203( var5 ), $ic515$
      } );
      var11 = Packages.intern( var18, (SubLObject) UNPROVIDED );
    }
    final SubLObject var19 = (SubLObject) $ic517$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic95$, var13, var11 ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic518$, var15, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic114$, var11,
            (SubLObject) $ic504$, ConsesLow.append( (SubLObject) ( ( NIL != var17 ) ? ConsesLow.list( var17 ) : NIL ), (SubLObject) NIL ) ), (SubLObject) ConsesLow.list(
                (SubLObject) $ic56$, var5, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var11,
                    (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var19, var6 ) ), (SubLObject) ConsesLow.list(
                        (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var19, (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic421$,
                            (SubLObject) $ic520$, var11 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, var19 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic54$,
                                var11 ) ) );
  }

  public static SubLObject f584(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var617_618 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      var617_618 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      if( NIL == conses_high.member( var617_618, (SubLObject) $ic511$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var617_618 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic510$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic512$, var4 );
    SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic92$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : $ic513$ );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) $ic514$, var4 );
    final SubLObject var15 = (SubLObject) ( ( NIL != var14 ) ? conses_high.cadr( var14 ) : $ic513$ );
    final SubLObject var16 = cdestructuring_bind.property_list_member( (SubLObject) $ic93$, var4 );
    final SubLObject var17 = (SubLObject) ( ( NIL != var16 ) ? conses_high.cadr( var16 ) : NIL );
    if( NIL != module0038.f2684( Symbols.symbol_name( var5 ), (SubLObject) $ic515$ ) || NIL != module0038.f2673( Symbols.symbol_name( var5 ), (SubLObject) $ic515$,
        (SubLObject) UNPROVIDED ) )
    {
      Errors.error( (SubLObject) $ic521$, var5 );
    }
    if( NIL == var11 )
    {
      final SubLObject var18 = Sequences.cconcatenate( (SubLObject) $ic515$, new SubLObject[] { module0006.f203( var5 ), $ic515$
      } );
      var11 = Packages.intern( var18, (SubLObject) UNPROVIDED );
    }
    final SubLObject var19 = (SubLObject) $ic522$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic95$, var13, var11 ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic518$, var15, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic116$, var11,
            (SubLObject) $ic504$, ConsesLow.append( (SubLObject) ( ( NIL != var17 ) ? ConsesLow.list( var17 ) : NIL ), (SubLObject) NIL ) ), (SubLObject) ConsesLow.list(
                (SubLObject) $ic56$, var5, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var11,
                    (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var19, var6 ) ), (SubLObject) ConsesLow.list(
                        (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var19, (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic421$,
                            (SubLObject) $ic520$, var11 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, var19 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic54$,
                                var11 ) ) );
  }

  public static SubLObject f585(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var628_629 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      var628_629 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      if( NIL == conses_high.member( var628_629, (SubLObject) $ic511$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var628_629 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic510$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic512$, var4 );
    SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic92$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : $ic513$ );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) $ic514$, var4 );
    final SubLObject var15 = (SubLObject) ( ( NIL != var14 ) ? conses_high.cadr( var14 ) : $ic513$ );
    final SubLObject var16 = cdestructuring_bind.property_list_member( (SubLObject) $ic93$, var4 );
    final SubLObject var17 = (SubLObject) ( ( NIL != var16 ) ? conses_high.cadr( var16 ) : NIL );
    if( NIL != module0038.f2684( Symbols.symbol_name( var5 ), (SubLObject) $ic515$ ) || NIL != module0038.f2673( Symbols.symbol_name( var5 ), (SubLObject) $ic515$,
        (SubLObject) UNPROVIDED ) )
    {
      Errors.error( (SubLObject) $ic523$, var5 );
    }
    if( NIL == var11 )
    {
      final SubLObject var18 = Sequences.cconcatenate( (SubLObject) $ic515$, new SubLObject[] { module0006.f203( var5 ), $ic515$
      } );
      var11 = Packages.intern( var18, (SubLObject) UNPROVIDED );
    }
    final SubLObject var19 = (SubLObject) $ic524$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic95$, var13, var11 ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic518$, var15, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic96$, var11,
            (SubLObject) $ic504$, ConsesLow.append( (SubLObject) ( ( NIL != var17 ) ? ConsesLow.list( var17 ) : NIL ), (SubLObject) NIL ) ), (SubLObject) ConsesLow.list(
                (SubLObject) $ic56$, var5, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var11,
                    (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var19, var6 ) ), (SubLObject) ConsesLow.list(
                        (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var19, (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic421$,
                            (SubLObject) $ic520$, var11 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, var19 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic54$,
                                var11 ) ) );
  }

  public static SubLObject f586(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var5 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic510$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var639_640 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      var639_640 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic510$ );
      if( NIL == conses_high.member( var639_640, (SubLObject) $ic511$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var639_640 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic510$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic512$, var4 );
    SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic92$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : $ic513$ );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) $ic514$, var4 );
    final SubLObject var15 = (SubLObject) ( ( NIL != var14 ) ? conses_high.cadr( var14 ) : $ic513$ );
    final SubLObject var16 = cdestructuring_bind.property_list_member( (SubLObject) $ic93$, var4 );
    final SubLObject var17 = (SubLObject) ( ( NIL != var16 ) ? conses_high.cadr( var16 ) : NIL );
    if( NIL != module0038.f2684( Symbols.symbol_name( var5 ), (SubLObject) $ic515$ ) || NIL != module0038.f2673( Symbols.symbol_name( var5 ), (SubLObject) $ic515$,
        (SubLObject) UNPROVIDED ) )
    {
      Errors.error( (SubLObject) $ic525$, var5 );
    }
    if( NIL == var11 )
    {
      final SubLObject var18 = Sequences.cconcatenate( (SubLObject) $ic515$, new SubLObject[] { module0006.f203( var5 ), $ic515$
      } );
      var11 = Packages.intern( var18, (SubLObject) UNPROVIDED );
    }
    final SubLObject var19 = (SubLObject) $ic526$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic95$, var13, var11 ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic94$, (SubLObject) ConsesLow.list( (SubLObject) $ic518$, var15, var5 ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic127$, var11,
            (SubLObject) $ic504$, ConsesLow.append( (SubLObject) ( ( NIL != var17 ) ? ConsesLow.list( var17 ) : NIL ), (SubLObject) NIL ) ), (SubLObject) ConsesLow.list(
                (SubLObject) $ic56$, var5, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var11,
                    (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var19, var6 ) ), (SubLObject) ConsesLow.list(
                        (SubLObject) $ic37$, (SubLObject) ConsesLow.listS( (SubLObject) EQ, var19, (SubLObject) $ic519$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic421$,
                            (SubLObject) $ic520$, var11 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic105$, var11, var19 ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic54$,
                                var11 ) ) );
  }

  public static SubLObject f587(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    SubLObject var5;
    final SubLObject var4 = var5 = var1.rest();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic527$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic527$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic527$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, (SubLObject) $ic527$ );
    var9 = var5.first();
    final SubLObject var10;
    var5 = ( var10 = var5.rest() );
    assert NIL != Types.stringp( var8 ) : var8;
    assert NIL != Types.listp( var9 ) : var9;
    var3.resetMultipleValues();
    final SubLObject var11 = f400( var9 );
    final SubLObject var12 = var3.secondMultipleValue();
    final SubLObject var13 = var3.thirdMultipleValue();
    final SubLObject var14 = var3.fourthMultipleValue();
    var3.resetMultipleValues();
    return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) ConsesLow.listS( (SubLObject) $ic4$, var6, var7, var8, ConsesLow.append( var12, var10, (SubLObject) NIL ) ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic528$, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var6 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var14 ),
            (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var7 ), var8, (SubLObject) ConsesLow.list( (SubLObject) $ic6$, var11 ), (SubLObject) ConsesLow.list( (SubLObject) $ic6$,
                var13 ) ) );
  }

  public static SubLObject f588(final SubLObject var6, final SubLObject var34, final SubLObject var7, final SubLObject var27, final SubLObject var11, final SubLObject var13)
  {
    f368( var6, var7, var27, var11, var13 );
    f589( var6, var34 );
    return (SubLObject) NIL;
  }

  public static SubLObject f590(final SubLObject var6)
  {
    return Symbols.get( var6, (SubLObject) $ic529$, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f589(final SubLObject var6, final SubLObject var34)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    assert NIL != Types.listp( var34 ) : var34;
    Symbols.put( var6, (SubLObject) $ic529$, var34 );
    return var6;
  }

  public static SubLObject f591(final SubLObject var6)
  {
    assert NIL != Types.symbolp( var6 ) : var6;
    return Symbols.remprop( var6, (SubLObject) $ic529$ );
  }

  public static SubLObject f592()
  {
    return (SubLObject) NIL;
  }

  public static SubLObject f593(final SubLObject var358)
  {
    final SubLThread var359 = SubLProcess.currentSubLThread();
    $g90$.setDynamicValue( (SubLObject) ConsesLow.cons( var358, $g90$.getDynamicValue( var359 ) ), var359 );
    return var358;
  }

  public static SubLObject f594(final SubLObject var647)
  {
    final SubLThread var648 = SubLProcess.currentSubLThread();
    SubLObject var649 = Sequences.nreverse( var647 );
    SubLObject var650 = (SubLObject) NIL;
    var650 = var649.first();
    while ( NIL != var649)
    {
      $g94$.setDynamicValue( (SubLObject) ConsesLow.cons( var650, $g94$.getDynamicValue( var648 ) ), var648 );
      var649 = var649.rest();
      var650 = var649.first();
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f595(final SubLObject var647, final SubLObject var648, final SubLObject var649)
  {
    return var647;
  }

  public static SubLObject f596(final SubLObject var650)
  {
    return Sequences.nreverse( var650 );
  }

  public static SubLObject f597(final SubLObject var358)
  {
    final SubLThread var359 = SubLProcess.currentSubLThread();
    if( NIL != $g100$.getDynamicValue( var359 ) )
    {
      Functions.funcall( $g96$.getDynamicValue( var359 ), var358 );
      $g91$.setDynamicValue( Numbers.add( $g91$.getDynamicValue( var359 ), (SubLObject) ONE_INTEGER ), var359 );
      if( !$g91$.getDynamicValue( var359 ).numL( $g92$.getDynamicValue( var359 ) ) )
      {
        Functions.funcall( $g98$.getDynamicValue( var359 ), $g90$.getDynamicValue( var359 ), $g91$.getDynamicValue( var359 ), $g93$.getDynamicValue( var359 ) );
        $g93$.setDynamicValue( Numbers.add( $g93$.getDynamicValue( var359 ), $g91$.getDynamicValue( var359 ) ), var359 );
        $g91$.setDynamicValue( (SubLObject) ZERO_INTEGER, var359 );
        Functions.funcall( $g97$.getDynamicValue( var359 ), $g90$.getDynamicValue( var359 ) );
        $g90$.setDynamicValue( Functions.funcall( $g95$.getDynamicValue( var359 ) ), var359 );
      }
    }
    return var358;
  }

  public static SubLObject f598(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic536$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic536$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic536$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.listS( (SubLObject) $ic537$, (SubLObject) $ic538$, (SubLObject) ConsesLow.list(
          (SubLObject) $ic539$, var7 ), (SubLObject) $ic540$ ), (SubLObject) ConsesLow.list( (SubLObject) $ic163$, reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var8,
              (SubLObject) NIL ) ), (SubLObject) $ic541$, (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var6, (SubLObject) $ic542$ ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic536$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f599(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic544$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic544$ );
    var6 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var7;
      var4 = ( var7 = var5 );
      final SubLObject var8 = (SubLObject) $ic545$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic546$, (SubLObject) ConsesLow.list( var8, var6 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic547$, (SubLObject) ConsesLow.list(
          (SubLObject) $ic548$, var8 ), ConsesLow.append( var7, (SubLObject) NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic544$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f600(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic549$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic549$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var665_666 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic549$ );
      var665_666 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic549$ );
      if( NIL == conses_high.member( var665_666, (SubLObject) $ic550$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var665_666 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic549$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic551$, var4 );
    final SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : ZERO_INTEGER );
    final SubLObject var12;
    var4 = ( var12 = var5 );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) $ic552$, (SubLObject) ConsesLow.list( (SubLObject) $ic553$, var11 ) ), reader
        .bq_cons( (SubLObject) $ic3$, ConsesLow.append( var12, (SubLObject) NIL ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var6, (SubLObject) $ic554$ ) );
  }

  public static SubLObject f601(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic549$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic549$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var675_676 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic549$ );
      var675_676 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic549$ );
      if( NIL == conses_high.member( var675_676, (SubLObject) $ic550$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var675_676 == $ic91$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic549$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic551$, var4 );
    final SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : ZERO_INTEGER );
    final SubLObject var12;
    var4 = ( var12 = var5 );
    return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( (SubLObject) $ic555$, (SubLObject) ConsesLow.list( (SubLObject) $ic556$, var11 ) ), reader
        .bq_cons( (SubLObject) $ic3$, ConsesLow.append( var12, (SubLObject) NIL ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic105$, var6, (SubLObject) $ic557$ ) );
  }

  public static SubLObject f602(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic558$ );
    var5 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic3$, (SubLObject) $ic559$, (SubLObject) ConsesLow.list( (SubLObject) $ic105$, (SubLObject) $ic556$,
          (SubLObject) ConsesLow.listS( (SubLObject) $ic560$, (SubLObject) ConsesLow.listS( (SubLObject) $ic561$, (SubLObject) ConsesLow.list( (SubLObject) $ic562$, var5 ),
              (SubLObject) $ic563$ ), (SubLObject) $ic557$ ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic558$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f603(final SubLObject var680)
  {
    return Vectors.aref( $g102$.getGlobalValue(), var680 );
  }

  public static SubLObject f604(final SubLObject var66)
  {
    final SubLThread var67 = SubLProcess.currentSubLThread();
    $g103$.setDynamicValue( f603( $g103$.getDynamicValue( var67 ) ), var67 );
    $g104$.setDynamicValue( Numbers.logxor( Sxhash.sxhash_rot( var66, $g103$.getDynamicValue( var67 ) ), $g104$.getDynamicValue( var67 ) ), var67 );
    return (SubLObject) NIL;
  }

  public static SubLObject f605(SubLObject var681)
  {
    if( var681 == UNPROVIDED )
    {
      var681 = (SubLObject) $ic568$;
    }
    final SubLThread var682 = SubLProcess.currentSubLThread();
    SubLObject var683;
    SubLObject var684;
    SubLObject var685;
    SubLObject var686;
    for( var683 = (SubLObject) NIL, var683 = (SubLObject) ZERO_INTEGER; var683.numL( var681 ); var683 = Numbers.add( var683, (SubLObject) ONE_INTEGER ) )
    {
      var684 = (SubLObject) ZERO_INTEGER;
      var685 = $g103$.currentBinding( var682 );
      var686 = $g104$.currentBinding( var682 );
      try
      {
        $g103$.bind( (SubLObject) FOUR_INTEGER, var682 );
        $g104$.bind( (SubLObject) $ic569$, var682 );
        f604( (SubLObject) FOUR_INTEGER );
        f604( (SubLObject) THREE_INTEGER );
        var684 = $g104$.getDynamicValue( var682 );
      }
      finally
      {
        $g104$.rebind( var686, var682 );
        $g103$.rebind( var685, var682 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f606(SubLObject var681)
  {
    if( var681 == UNPROVIDED )
    {
      var681 = (SubLObject) $ic568$;
    }
    SubLObject var682;
    SubLObject var683;
    SubLObject var684;
    SubLObject var685;
    for( var682 = (SubLObject) NIL, var682 = (SubLObject) ZERO_INTEGER; var682.numL( var681 ); var682 = Numbers.add( var682, (SubLObject) ONE_INTEGER ) )
    {
      var683 = (SubLObject) ZERO_INTEGER;
      var684 = (SubLObject) FOUR_INTEGER;
      var685 = (SubLObject) $ic569$;
      var684 = f603( var684 );
      var685 = Numbers.logxor( Sxhash.sxhash_rot( Sxhash.sxhash( (SubLObject) FOUR_INTEGER ), var684 ), var685 );
      var684 = f603( var684 );
      var685 = ( var683 = Numbers.logxor( Sxhash.sxhash_rot( Sxhash.sxhash( (SubLObject) THREE_INTEGER ), var684 ), var685 ) );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f607(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic570$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic570$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic570$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic85$, var7, (SubLObject) ConsesLow.listS( (SubLObject) $ic170$, (SubLObject) ConsesLow.list( var6 ), ConsesLow.append( var8,
          (SubLObject) NIL ) ), reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var8, (SubLObject) NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic570$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f608(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic571$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic571$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic571$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic571$ );
    var8 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var9;
      var4 = ( var9 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic85$, var8, (SubLObject) ConsesLow.listS( (SubLObject) $ic572$, var6, var7, ConsesLow.append( var9, (SubLObject) NIL ) ), reader
          .bq_cons( (SubLObject) $ic3$, ConsesLow.append( var9, (SubLObject) NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic571$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f609(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic573$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic573$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic573$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      final SubLObject var9 = (SubLObject) $ic574$;
      final SubLObject var10 = (SubLObject) $ic575$;
      final SubLObject var11 = (SubLObject) $ic576$;
      return (SubLObject) ConsesLow.list( (SubLObject) $ic84$, (SubLObject) ConsesLow.list( reader.bq_cons( var9, (SubLObject) $ic211$ ) ), (SubLObject) $ic577$, (SubLObject) ConsesLow
          .list( (SubLObject) $ic278$, (SubLObject) ConsesLow.list( var11, (SubLObject) ConsesLow.list( (SubLObject) $ic578$, var6, var7 ) ), (SubLObject) ConsesLow.list(
              (SubLObject) $ic84$, (SubLObject) ConsesLow.list( var10 ), (SubLObject) ConsesLow.listS( (SubLObject) $ic449$, var10, ConsesLow.append( var8, (SubLObject) $ic579$ ) ),
              (SubLObject) ConsesLow.list( (SubLObject) $ic37$, (SubLObject) ConsesLow.list( (SubLObject) $ic417$, var11, var6 ), (SubLObject) ConsesLow.list( (SubLObject) $ic362$, var10,
                  var9 ) ) ) ), (SubLObject) ConsesLow.listS( (SubLObject) $ic580$, var9, (SubLObject) $ic439$ ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic573$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f610()
  {
    return Storage.gc( (SubLObject) UNPROVIDED );
  }

  public static SubLObject f611(final SubLObject var1, final SubLObject var2)
  {
    final SubLObject var3 = var1.rest();
    final SubLObject var5;
    final SubLObject var4 = var5 = var3;
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic84$, (SubLObject) $ic583$, ConsesLow.append( var5, (SubLObject) NIL ) );
  }

  public static SubLObject f612(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic584$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic584$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic584$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic85$, var6, (SubLObject) ConsesLow.list( (SubLObject) $ic585$, (SubLObject) ConsesLow.list( var6, var7 ), reader.bq_cons(
          (SubLObject) $ic3$, ConsesLow.append( var8, (SubLObject) NIL ) ) ), reader.bq_cons( (SubLObject) $ic3$, ConsesLow.append( var8, (SubLObject) NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic584$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f613()
  {
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f362", "S#369" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f364", "S#370" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f365", "S#371" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f366", "S#372" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f367", "S#373" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f368", "S#374", 5, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f375", "S#375", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f377", "S#376", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f378", "S#377", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f379", "S#378", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f380", "S#379", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f369", "S#380", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f383", "S#381", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f382", "S#382", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f384", "S#383", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f385", "S#384", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f381", "S#385", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f376", "S#386", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f387", "S#387", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f386", "S#388", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f388", "S#389", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f389", "S#390", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f390", "S#391", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f370", "S#392", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f391", "S#393", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f392", "S#394", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f371", "S#395", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f393", "S#396", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f372", "S#397", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f394", "S#398", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f373", "S#399", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f395", "S#400", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f396", "S#401", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f374", "S#402", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f398", "S#403", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f363", "S#404", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f400", "S#405", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f399", "S#406", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f401", "S#407", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f397", "S#408", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f402", "DEFINE-AFTER-ADDING" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f403", "DEFINE-AFTER-REMOVING" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f404", "DEFINE-RULE-AFTER-ADDING" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f405", "DEFINE-RULE-AFTER-REMOVING" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f406", "DEFINE-COLLECTION-DEFN" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f407", "DEFINE-EVALUATION-DEFN" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f408", "DEFINE-EXPANSION-DEFN" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f409", "DEFINE-CYC-SUBL-DEFN" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f410", "DEFINE-KB" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f411", "S#409", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f412", "S#410", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f413", "S#411", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f414", "S#412", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f415", "S#413", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f416", "S#414", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f417", "DEREGISTER-KB-FUNCTION", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f418", "S#415" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f419", "S#416", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f420", "S#417", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f421", "S#418", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f422", "S#419" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f423", "S#420", 4, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f424", "S#421" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f425", "S#422", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f426", "S#423" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f427", "S#424", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f428", "S#425" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f429", "S#426" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f430", "S#427" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f431", "S#428" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f432", "S#429" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f434", "S#430", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f436", "S#431", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f437", "S#432", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f433", "S#433", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f438", "S#434", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f435", "S#435", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f439", "S#436" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f440", "S#437" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f441", "S#438", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f442", "S#439" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f443", "S#440" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f444", "S#441", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f445", "S#442" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f446", "S#443" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f447", "S#444" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f449", "S#445", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f448", "S#446", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "documentation", "DOCUMENTATION", 1, 1, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f450", "S#447" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f451", "S#448" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f452", "S#449" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f453", "S#450" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f454", "S#451" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f455", "S#452" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f456", "S#453" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f457", "S#454" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f458", "S#455" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f459", "S#456" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f460", "S#457", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f461", "S#458" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f462", "S#459" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f463", "S#460" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f464", "S#461", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f465", "S#462" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f466", "S#463", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f467", "S#464" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f468", "S#465" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f469", "S#466" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f470", "S#467" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f471", "S#468" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f472", "NOTING-PROGRESS" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f473", "S#469" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f474", "S#470", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f475", "S#471", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f476", "NOTE-PROGRESS", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "noting_activity", "NOTING-ACTIVITY" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "noting_percent_progress", "NOTING-PERCENT-PROGRESS" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f477", "S#472" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f478", "S#473", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f479", "S#474", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f482", "S#475", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f483", "S#476", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f481", "S#477", 3, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f480", "S#478", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f484", "S#479", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f485", "PROGRESS-CDOTIMES" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f486", "S#480" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f487", "PROGRESS-CDOLIST" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f488", "S#481" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f489", "S#296" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f490", "S#482" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f491", "S#483" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f492", "S#484", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f493", "S#485", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f494", "S#486" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f495", "S#487" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f496", "S#488", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f497", "S#489" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f498", "WITH-THE-CYCLIST" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f499", "S#490" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f500", "S#491" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f501", "S#492", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f502", "S#493" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f503", "S#494", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f504", "S#495" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f505", "S#496" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f506", "S#497" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f507", "S#498" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f508", "S#499" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f509", "S#500" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f510", "S#501" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f511", "S#502" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f512", "S#503" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f513", "S#504" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f514", "S#505" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f515", "S#506" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f516", "S#507" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f517", "S#508", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f518", "S#509", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f519", "S#510", 3, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f520", "S#511" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f521", "S#512", 3, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f522", "S#513" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f523", "S#514" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f524", "S#515", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f525", "S#516", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f526", "S#517" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f527", "S#518" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f528", "S#519", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f529", "S#520" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f530", "S#521" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f531", "S#522", 5, 1, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f532", "S#523" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f533", "S#524" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f534", "S#525", 5, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f535", "S#526" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f536", "S#527" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f537", "S#528" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f538", "S#529" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f539", "S#530", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f540", "S#531", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f541", "S#532", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f542", "S#533", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f543", "S#534" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f544", "S#535", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f545", "S#536", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f546", "S#537", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f547", "S#538" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f548", "S#539", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f549", "S#540" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f550", "S#541" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f551", "S#542", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f552", "S#543", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f553", "S#544", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f554", "S#545", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f555", "S#546" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f556", "S#547", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f557", "S#548" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "time", "TIME" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f558", "S#549" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f559", "S#550", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f560", "S#551", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f561", "S#552", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f562", "S#553", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f563", "S#554", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f564", "S#555" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f565", "S#556" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f566", "S#557" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f567", "S#558" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f568", "S#559" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f569", "S#156" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f570", "S#560" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f571", "S#157" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f572", "S#561" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f573", "S#562" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f574", "S#563" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f575", "S#158" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f576", "S#564" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f577", "S#565" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f578", "S#566" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f579", "S#567" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f580", "S#568" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f581", "S#569", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f582", "S#570", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f583", "S#571" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f584", "S#572" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f585", "S#573" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f586", "S#574" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f587", "S#575" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f588", "S#576", 6, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f590", "S#577", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f589", "S#578", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f591", "S#579", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f592", "S#580", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f593", "S#581", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f594", "S#582", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f595", "S#583", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f596", "S#584", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f597", "S#585", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f598", "S#586" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f599", "WITH-SPACE-PROFILING-TO-STRING" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f600", "S#587" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f601", "S#588" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f602", "S#589" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f603", "S#590", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f604", "S#591", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f605", "S#592", 0, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f606", "S#593", 0, 1, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f607", "S#594" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f608", "S#595" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f609", "S#596" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0012", "f610", "S#597", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f611", "S#598" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0012", "f612", "S#599" );
    return (SubLObject) NIL;
  }

  public static SubLObject f614()
  {
    $g39$ = SubLFiles.deflexical( "S#600", ( NIL != Symbols.boundp( (SubLObject) $ic15$ ) ) ? $g39$.getGlobalValue()
        : Hashtables.make_hash_table( (SubLObject) TEN_INTEGER, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED ) );
    $g40$ = SubLFiles.deflexical( "S#601", ( NIL != Symbols.boundp( (SubLObject) $ic17$ ) ) ? $g40$.getGlobalValue()
        : Hashtables.make_hash_table( (SubLObject) $ic18$, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED ) );
    $g42$ = SubLFiles.deflexical( "S#602", ( NIL != Symbols.boundp( (SubLObject) $ic19$ ) ) ? $g42$.getGlobalValue()
        : Hashtables.make_hash_table( (SubLObject) $ic20$, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED ) );
    $g43$ = SubLFiles.deflexical( "S#603", ( NIL != Symbols.boundp( (SubLObject) $ic21$ ) ) ? $g43$.getGlobalValue()
        : Hashtables.make_hash_table( (SubLObject) $ic20$, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED ) );
    $g44$ = SubLFiles.deflexical( "S#604", ( NIL != Symbols.boundp( (SubLObject) $ic22$ ) ) ? $g44$.getGlobalValue()
        : Hashtables.make_hash_table( (SubLObject) TEN_INTEGER, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED ) );
    $g45$ = SubLFiles.deflexical( "S#605", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic23$ ) ) ? $g45$.getGlobalValue() : NIL ) );
    $g46$ = SubLFiles.deflexical( "S#606", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic29$ ) ) ? $g46$.getGlobalValue() : NIL ) );
    $g47$ = SubLFiles.deflexical( "S#607", ( NIL != Symbols.boundp( (SubLObject) $ic58$ ) ) ? $g47$.getGlobalValue()
        : Hashtables.make_hash_table( (SubLObject) $ic59$, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED ) );
    $g48$ = SubLFiles.deflexical( "S#608", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic65$ ) ) ? $g48$.getGlobalValue() : $ic66$ ) );
    $g49$ = SubLFiles.deflexical( "S#609", ( NIL != Symbols.boundp( (SubLObject) $ic68$ ) ) ? $g49$.getGlobalValue() : Symbols.make_symbol( (SubLObject) $ic69$ ) );
    $g50$ = SubLFiles.defparameter( "S#610", (SubLObject) NIL );
    $g51$ = SubLFiles.deflexical( "S#611", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic98$ ) ) ? $g51$.getGlobalValue() : NIL ) );
    $g52$ = SubLFiles.deflexical( "S#612", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic106$ ) ) ? $g52$.getGlobalValue() : NIL ) );
    $g53$ = SubLFiles.deflexical( "S#613", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic113$ ) ) ? $g53$.getGlobalValue() : NIL ) );
    $g54$ = SubLFiles.deflexical( "S#614", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic117$ ) ) ? $g54$.getGlobalValue() : NIL ) );
    $g55$ = SubLFiles.deflexical( "S#615", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic142$ ) ) ? $g55$.getGlobalValue() : NIL ) );
    $g56$ = SubLFiles.deflexical( "S#616", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic144$ ) ) ? $g56$.getGlobalValue() : NIL ) );
    $g57$ = SubLFiles.deflexical( "S#617", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic145$ ) ) ? $g57$.getGlobalValue() : NIL ) );
    $g58$ = SubLFiles.deflexical( "S#618", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic148$ ) ) ? $g58$.getGlobalValue() : NIL ) );
    $g59$ = SubLFiles.defparameter( "S#619", (SubLObject) NIL );
    $g62$ = SubLFiles.defparameter( "S#620", (SubLObject) NIL );
    $g63$ = SubLFiles.deflexical( "S#621", (SubLObject) NIL );
    $g64$ = SubLFiles.defparameter( "S#622", (SubLObject) NIL );
    $g65$ = SubLFiles.defparameter( "S#623", (SubLObject) NIL );
    $g66$ = SubLFiles.defparameter( "S#624", (SubLObject) NIL );
    $g67$ = SubLFiles.defparameter( "S#625", (SubLObject) NIL );
    $g68$ = SubLFiles.defparameter( "S#626", (SubLObject) NIL );
    $g69$ = SubLFiles.defparameter( "S#627", (SubLObject) NIL );
    $g70$ = SubLFiles.defparameter( "S#628", (SubLObject) NIL );
    $g71$ = SubLFiles.defparameter( "S#629", (SubLObject) NIL );
    $g72$ = SubLFiles.defparameter( "S#630", (SubLObject) NIL );
    $silent_progressP$ = SubLFiles.defvar( "*SILENT-PROGRESS?*", (SubLObject) NIL );
    $g74$ = SubLFiles.defparameter( "S#631", (SubLObject) NIL );
    $g75$ = SubLFiles.defvar( "S#632", (SubLObject) NIL );
    $g76$ = SubLFiles.defparameter( "S#633", (SubLObject) NIL );
    $g77$ = SubLFiles.defvar( "S#634", (SubLObject) NIL );
    $g78$ = SubLFiles.defvar( "S#635", (SubLObject) NIL );
    $g79$ = SubLFiles.defvar( "S#636", (SubLObject) NIL );
    $g80$ = SubLFiles.defvar( "S#637", (SubLObject) NIL );
    $g82$ = SubLFiles.defparameter( "S#638", (SubLObject) $ic269$ );
    $g73$ = SubLFiles.defparameter( "S#639", Time.get_universal_time() );
    $g83$ = SubLFiles.defparameter( "S#640", (SubLObject) ONE_INTEGER );
    $g84$ = SubLFiles.defparameter( "S#641", (SubLObject) ZERO_INTEGER );
    $g85$ = SubLFiles.defparameter( "S#642", (SubLObject) $ic329$ );
    $g86$ = SubLFiles.defparameter( "S#643", (SubLObject) $ic330$ );
    $g87$ = SubLFiles.defparameter( "S#644", (SubLObject) $ic331$ );
    $g88$ = SubLFiles.deflexical( "S#645", (SubLObject) $ic458$ );
    $g89$ = SubLFiles.deflexical( "S#646", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic506$ ) ) ? $g89$.getGlobalValue() : NIL ) );
    $g90$ = SubLFiles.defparameter( "S#647", (SubLObject) NIL );
    $g91$ = SubLFiles.defparameter( "S#648", (SubLObject) NIL );
    $g92$ = SubLFiles.defparameter( "S#649", (SubLObject) $ic530$ );
    $g93$ = SubLFiles.defparameter( "S#650", (SubLObject) NIL );
    $g94$ = SubLFiles.defparameter( "S#651", (SubLObject) NIL );
    $g95$ = SubLFiles.defparameter( "S#652", (SubLObject) $ic531$ );
    $g96$ = SubLFiles.defparameter( "S#653", (SubLObject) $ic532$ );
    $g97$ = SubLFiles.defparameter( "S#654", (SubLObject) $ic533$ );
    $g98$ = SubLFiles.defparameter( "S#655", (SubLObject) $ic534$ );
    $g99$ = SubLFiles.defparameter( "S#656", (SubLObject) $ic535$ );
    $g100$ = SubLFiles.defparameter( "S#657", (SubLObject) NIL );
    $g101$ = SubLFiles.defconstant( "S#658", (SubLObject) $ic564$ );
    $g102$ = SubLFiles.deflexical( "S#659", $ic565$ );
    $g103$ = SubLFiles.defparameter( "S#660", (SubLObject) NIL );
    $g104$ = SubLFiles.defparameter( "S#661", (SubLObject) NIL );
    return (SubLObject) NIL;
  }

  public static SubLObject f615()
  {
    module0003.f57( (SubLObject) $ic15$ );
    module0003.f57( (SubLObject) $ic17$ );
    module0003.f57( (SubLObject) $ic19$ );
    module0003.f57( (SubLObject) $ic21$ );
    module0003.f57( (SubLObject) $ic22$ );
    module0003.f57( (SubLObject) $ic23$ );
    module0003.f57( (SubLObject) $ic29$ );
    module0002.f38( (SubLObject) $ic41$ );
    module0002.f38( (SubLObject) $ic43$ );
    module0002.f38( (SubLObject) $ic44$ );
    module0002.f38( (SubLObject) $ic45$ );
    module0002.f38( (SubLObject) $ic46$ );
    module0002.f38( (SubLObject) $ic47$ );
    module0002.f38( (SubLObject) $ic49$ );
    module0002.f38( (SubLObject) $ic50$ );
    module0002.f38( (SubLObject) $ic42$ );
    module0003.f57( (SubLObject) $ic58$ );
    module0002.f50( (SubLObject) $ic57$, (SubLObject) $ic42$ );
    module0002.f38( (SubLObject) $ic62$ );
    module0003.f57( (SubLObject) $ic65$ );
    module0002.f50( (SubLObject) $ic64$, (SubLObject) $ic67$ );
    module0003.f57( (SubLObject) $ic68$ );
    module0003.f57( (SubLObject) $ic98$ );
    module0002.f50( (SubLObject) $ic97$, (SubLObject) $ic97$ );
    module0002.f50( (SubLObject) $ic103$, (SubLObject) $ic104$ );
    module0003.f57( (SubLObject) $ic106$ );
    module0003.f57( (SubLObject) $ic113$ );
    module0003.f57( (SubLObject) $ic117$ );
    module0002.f50( (SubLObject) $ic120$, (SubLObject) $ic121$ );
    module0003.f57( (SubLObject) $ic142$ );
    module0003.f57( (SubLObject) $ic144$ );
    module0003.f57( (SubLObject) $ic145$ );
    module0003.f57( (SubLObject) $ic148$ );
    module0002.f50( (SubLObject) $ic160$, (SubLObject) $ic161$ );
    module0002.f50( (SubLObject) $ic225$, (SubLObject) $ic230$ );
    module0002.f50( (SubLObject) $ic232$, (SubLObject) $ic230$ );
    module0002.f50( (SubLObject) $ic237$, (SubLObject) $ic230$ );
    module0002.f50( (SubLObject) $ic246$, (SubLObject) $ic250$ );
    module0002.f50( (SubLObject) $ic252$, (SubLObject) $ic250$ );
    module0002.f50( (SubLObject) $ic254$, (SubLObject) $ic250$ );
    module0002.f38( (SubLObject) $ic287$ );
    module0002.f50( (SubLObject) $ic308$, (SubLObject) $ic310$ );
    module0002.f50( (SubLObject) $ic309$, (SubLObject) $ic310$ );
    module0002.f50( (SubLObject) $ic429$, (SubLObject) $ic430$ );
    module0002.f50( (SubLObject) $ic432$, (SubLObject) $ic430$ );
    module0002.f50( (SubLObject) $ic434$, (SubLObject) $ic430$ );
    module0002.f50( (SubLObject) $ic456$, (SubLObject) $ic459$ );
    module0002.f50( (SubLObject) $ic457$, (SubLObject) $ic459$ );
    module0003.f57( (SubLObject) $ic506$ );
    module0002.f50( (SubLObject) $ic505$, (SubLObject) $ic507$ );
    module0002.f38( (SubLObject) $ic543$ );
    module0002.f50( (SubLObject) $ic566$, (SubLObject) $ic567$ );
    module0002.f50( (SubLObject) $ic581$, (SubLObject) $ic582$ );
    return (SubLObject) NIL;
  }

  @Override
  public void declareFunctions()
  {
    f613();
  }

  @Override
  public void initializeVariables()
  {
    f614();
  }

  @Override
  public void runTopLevelForms()
  {
    f615();
  }
  static
  {
    me = (SubLFile) new module0012();
    $g39$ = null;
    $g40$ = null;
    $g42$ = null;
    $g43$ = null;
    $g44$ = null;
    $g45$ = null;
    $g46$ = null;
    $g47$ = null;
    $g48$ = null;
    $g49$ = null;
    $g50$ = null;
    $g51$ = null;
    $g52$ = null;
    $g53$ = null;
    $g54$ = null;
    $g55$ = null;
    $g56$ = null;
    $g57$ = null;
    $g58$ = null;
    $g59$ = null;
    $g62$ = null;
    $g63$ = null;
    $g64$ = null;
    $g65$ = null;
    $g66$ = null;
    $g67$ = null;
    $g68$ = null;
    $g69$ = null;
    $g70$ = null;
    $g71$ = null;
    $g72$ = null;
    $silent_progressP$ = null;
    $g74$ = null;
    $g75$ = null;
    $g76$ = null;
    $g77$ = null;
    $g78$ = null;
    $g79$ = null;
    $g80$ = null;
    $g82$ = null;
    $g73$ = null;
    $g83$ = null;
    $g84$ = null;
    $g85$ = null;
    $g86$ = null;
    $g87$ = null;
    $g88$ = null;
    $g89$ = null;
    $g90$ = null;
    $g91$ = null;
    $g92$ = null;
    $g93$ = null;
    $g94$ = null;
    $g95$ = null;
    $g96$ = null;
    $g97$ = null;
    $g98$ = null;
    $g99$ = null;
    $g100$ = null;
    $g101$ = null;
    $g102$ = null;
    $g103$ = null;
    $g104$ = null;
    $ic0$ = ConsesLow.list( (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#30", "CYC" ), (SubLObject) makeSymbol( "S#662", "CYC" ),
        (SubLObject) makeSymbol( "S#663", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic1$ = makeSymbol( "STRINGP" );
    $ic2$ = makeSymbol( "LISTP" );
    $ic3$ = makeSymbol( "PROGN" );
    $ic4$ = makeSymbol( "DEFINE-PUBLIC" );
    $ic5$ = makeSymbol( "S#374", "CYC" );
    $ic6$ = makeSymbol( "QUOTE" );
    $ic7$ = ConsesLow.list( (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#30", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic8$ = ConsesLow.list( (SubLObject) makeSymbol( "S#662", "CYC" ), (SubLObject) makeSymbol( "S#663", "CYC" ) );
    $ic9$ = ConsesLow.list( (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#32", "CYC" ), (SubLObject) makeSymbol( "S#662", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic10$ = makeSymbol( "DEFMACRO-PUBLIC" );
    $ic11$ = makeSymbol( "S#375", "CYC" );
    $ic12$ = makeSymbol( "S#17", "CYC" );
    $ic13$ = ConsesLow.list( (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#32", "CYC" ), (SubLObject) makeSymbol( "S#662", "CYC" ),
        (SubLObject) makeSymbol( "S#663", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic14$ = makeSymbol( "S#12", "CYC" );
    $ic15$ = makeSymbol( "S#600", "CYC" );
    $ic16$ = makeString( "Registering ~A as special even though it's already predefined!" );
    $ic17$ = makeSymbol( "S#601", "CYC" );
    $ic18$ = makeInteger( 1000 );
    $ic19$ = makeSymbol( "S#602", "CYC" );
    $ic20$ = makeInteger( 100 );
    $ic21$ = makeSymbol( "S#603", "CYC" );
    $ic22$ = makeSymbol( "S#604", "CYC" );
    $ic23$ = makeSymbol( "S#605", "CYC" );
    $ic24$ = makeKeyword( "CYC-API-SYMBOL" );
    $ic25$ = makeSymbol( "SYMBOLP" );
    $ic26$ = makeKeyword( "CYC-API-ARGS" );
    $ic27$ = makeKeyword( "CYC-API-ARG-TYPES" );
    $ic28$ = makeKeyword( "CYC-API-RETURN-TYPES" );
    $ic29$ = makeSymbol( "S#606", "CYC" );
    $ic30$ = makeKeyword( "REPLACEMENTS" );
    $ic31$ = makeString( ":replacements not allowed in the declaration of Cyc API function" );
    $ic32$ = makeKeyword( "ARGUMENT-TYPES" );
    $ic33$ = makeKeyword( "RETURN-TYPES" );
    $ic34$ = makeSymbol( "CHECK-TYPE" );
    $ic35$ = makeSymbol( "S#664", "CYC" );
    $ic36$ = makeString( "Invalid argument-type expression ~S" );
    $ic37$ = makeSymbol( "PWHEN" );
    $ic38$ = makeString( "~S return type expression not list length 2." );
    $ic39$ = ConsesLow.list( (SubLObject) makeSymbol( "LIST" ), (SubLObject) makeSymbol( "S#664", "CYC" ) );
    $ic40$ = makeString( "~S complex return type expression not of form (nil-or X) or (list X)." );
    $ic41$ = makeSymbol( "DEFINE-AFTER-ADDING" );
    $ic42$ = makeSymbol( "DEFINE-KB" );
    $ic43$ = makeSymbol( "DEFINE-AFTER-REMOVING" );
    $ic44$ = makeSymbol( "DEFINE-RULE-AFTER-ADDING" );
    $ic45$ = makeSymbol( "DEFINE-RULE-AFTER-REMOVING" );
    $ic46$ = makeSymbol( "DEFINE-COLLECTION-DEFN" );
    $ic47$ = makeSymbol( "DEFINE-EVALUATION-DEFN" );
    $ic48$ = ConsesLow.list( (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#32", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic49$ = makeSymbol( "DEFINE-EXPANSION-DEFN" );
    $ic50$ = makeSymbol( "DEFINE-CYC-SUBL-DEFN" );
    $ic51$ = ConsesLow.list( (SubLObject) makeSymbol( "S#665", "CYC" ), (SubLObject) makeSymbol( "S#666", "CYC" ) );
    $ic52$ = ConsesLow.list( (SubLObject) makeSymbol( "OBJECT", "CYC" ) );
    $ic53$ = ConsesLow.list( (SubLObject) makeSymbol( "SUBL-ESCAPE-P" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ) );
    $ic54$ = makeSymbol( "RET" );
    $ic55$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#667", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ) ) );
    $ic56$ = makeSymbol( "DEFINE" );
    $ic57$ = makeSymbol( "S#414", "CYC" );
    $ic58$ = makeSymbol( "S#607", "CYC" );
    $ic59$ = makeInteger( 400 );
    $ic60$ = makeSymbol( "STRING-LESSP" );
    $ic61$ = makeSymbol( "SYMBOL-NAME" );
    $ic62$ = makeSymbol( "DEREGISTER-KB-FUNCTION" );
    $ic63$ = makeSymbol( "DEFINE-PRIVATE" );
    $ic64$ = makeSymbol( "S#416", "CYC" );
    $ic65$ = makeSymbol( "S#608", "CYC" );
    $ic66$ = makeKeyword( "FUNCALL-HELPER" );
    $ic67$ = makeSymbol( "S#415", "CYC" );
    $ic68$ = makeSymbol( "S#609", "CYC" );
    $ic69$ = makeString( "UNPROVIDED" );
    $ic70$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#668", "CYC" ), (SubLObject) makeSymbol( "S#669", "CYC" ),
        (SubLObject) makeSymbol( "S#670", "CYC" ) );
    $ic71$ = makeSymbol( "S#420", "CYC" );
    $ic72$ = makeKeyword( "FANCY-NAME" );
    $ic73$ = makeKeyword( "DESCRIPTION" );
    $ic74$ = makeKeyword( "SETTINGS-SPEC" );
    $ic75$ = makeSymbol( "CCATCH-IGNORE" );
    $ic76$ = makeKeyword( "MAPPING-DONE" );
    $ic77$ = makeKeyword( "SBHL-MAPPING-DONE" );
    $ic78$ = ConsesLow.list( (SubLObject) makeSymbol( "S#671", "CYC" ) );
    $ic79$ = makeSymbol( "WRITE-BYTE" );
    $ic80$ = ConsesLow.list( (SubLObject) makeSymbol( "S#610", "CYC" ) );
    $ic81$ = ConsesLow.list( (SubLObject) makeSymbol( "READ-BYTE" ), (SubLObject) makeSymbol( "S#610", "CYC" ), (SubLObject) NIL, (SubLObject) NIL );
    $ic82$ = ConsesLow.list( (SubLObject) makeSymbol( "S#672", "CYC" ), (SubLObject) makeSymbol( "S#163", "CYC" ), (SubLObject) makeSymbol( "&OPTIONAL" ),
        (SubLObject) makeSymbol( "S#164", "CYC" ) );
    $ic83$ = makeUninternedSymbol( "US#70BE60B" );
    $ic84$ = makeSymbol( "CLET" );
    $ic85$ = makeSymbol( "PIF" );
    $ic86$ = makeSymbol( "LOCK-IDLE-P" );
    $ic87$ = makeSymbol( "WITH-LOCK-HELD" );
    $ic88$ = ConsesLow.list( (SubLObject) makeSymbol( "S#672", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic89$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "&KEY" ),
        (SubLObject) makeSymbol( "VACCESS" ), (SubLObject) makeSymbol( "DOCUMENTATION" ) );
    $ic90$ = ConsesLow.list( (SubLObject) makeKeyword( "VACCESS" ), (SubLObject) makeKeyword( "DOCUMENTATION" ) );
    $ic91$ = makeKeyword( "ALLOW-OTHER-KEYS" );
    $ic92$ = makeKeyword( "VACCESS" );
    $ic93$ = makeKeyword( "DOCUMENTATION" );
    $ic94$ = makeSymbol( "DECLAIM" );
    $ic95$ = makeSymbol( "VACCESS" );
    $ic96$ = makeSymbol( "S#34", "CYC" );
    $ic97$ = makeSymbol( "S#431", "CYC" );
    $ic98$ = makeSymbol( "S#611", "CYC" );
    $ic99$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#673", "CYC" ), (SubLObject) makeSymbol( "S#29", "CYC" ) );
    $ic100$ = makeSymbol( "CAR" );
    $ic101$ = makeSymbol( "MAKE-LOCK" );
    $ic102$ = makeSymbol( "S#432", "CYC" );
    $ic103$ = makeSymbol( "S#435", "CYC" );
    $ic104$ = makeSymbol( "S#430", "CYC" );
    $ic105$ = makeSymbol( "CSETQ" );
    $ic106$ = makeSymbol( "S#612", "CYC" );
    $ic107$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) makeSymbol( "S#33", "CYC" ),
        (SubLObject) makeSymbol( "DOCUMENTATION" ) );
    $ic108$ = makeSymbol( "S#439", "CYC" );
    $ic109$ = makeSymbol( "CPUSHNEW" );
    $ic110$ = ConsesLow.list( (SubLObject) makeSymbol( "S#612", "CYC" ) );
    $ic111$ = makeSymbol( "CPROGV" );
    $ic112$ = ConsesLow.list( (SubLObject) makeSymbol( "MAKE-LIST" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "LENGTH" ), (SubLObject) makeSymbol(
        "S#612", "CYC" ) ), (SubLObject) NIL );
    $ic113$ = makeSymbol( "S#613", "CYC" );
    $ic114$ = makeSymbol( "DEFPARAMETER" );
    $ic115$ = makeSymbol( "S#438", "CYC" );
    $ic116$ = makeSymbol( "DEFVAR" );
    $ic117$ = makeSymbol( "S#614", "CYC" );
    $ic118$ = makeSymbol( "S#441", "CYC" );
    $ic119$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#674", "CYC" ), (SubLObject) makeSymbol( "S#33", "CYC" ),
        (SubLObject) makeSymbol( "DOCUMENTATION" ), (SubLObject) makeSymbol( "TYPE" ) );
    $ic120$ = makeSymbol( "S#445", "CYC" );
    $ic121$ = makeSymbol( "S#444", "CYC" );
    $ic122$ = makeKeyword( "VARIABLE-DOC" );
    $ic123$ = makeKeyword( "VARIABLE" );
    $ic124$ = makeKeyword( "PARAMETER" );
    $ic125$ = makeKeyword( "GLOBAL" );
    $ic126$ = makeKeyword( "LEXICAL" );
    $ic127$ = makeSymbol( "DEFLEXICAL" );
    $ic128$ = makeKeyword( "CONSTANT" );
    $ic129$ = makeSymbol( "DEFCONSTANT" );
    $ic130$ = makeKeyword( "PARAMETER-PRIVATE" );
    $ic131$ = makeSymbol( "DEFPARAMETER-PRIVATE" );
    $ic132$ = makeKeyword( "PARAMETER-PUBLIC" );
    $ic133$ = makeSymbol( "DEFPARAMETER-PUBLIC" );
    $ic134$ = makeKeyword( "PARAMETER-PROTECTECD" );
    $ic135$ = makeString( "unknown variable type ~s~%" );
    $ic136$ = makeKeyword( "FUNCTION" );
    $ic137$ = makeKeyword( "FUNCTION-DOC" );
    $ic138$ = makeKeyword( "STRUCTURE" );
    $ic139$ = makeKeyword( "STRUCTURE-DOC" );
    $ic140$ = makeKeyword( "TYPE" );
    $ic141$ = makeKeyword( "TYPE-DOC" );
    $ic142$ = makeSymbol( "S#615", "CYC" );
    $ic143$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) makeSymbol( "S#33", "CYC" ),
        (SubLObject) makeSymbol( "DOCUMENTATION" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "TYPE" ), (SubLObject) makeKeyword( "PARAMETER" ) ) );
    $ic144$ = makeSymbol( "S#616", "CYC" );
    $ic145$ = makeSymbol( "S#617", "CYC" );
    $ic146$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) makeSymbol( "S#33", "CYC" ),
        (SubLObject) makeSymbol( "DOCUMENTATION" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "TYPE" ), (SubLObject) makeKeyword(
            "PARAMETER-PROTECTECD" ) ) );
    $ic147$ = makeSymbol( "S#675", "CYC" );
    $ic148$ = makeSymbol( "S#618", "CYC" );
    $ic149$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#676", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FIF" ),
        (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCTION-SPEC-P" ), (SubLObject) makeSymbol( "S#676", "CYC" ) ), (SubLObject) makeSymbol( "S#676",
            "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "S#677", "CYC" ) ) ) ), (SubLObject) ConsesLow.list(
                (SubLObject) makeSymbol( "S#678", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FIF" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
                    .makeSymbol( "FUNCTION-SPEC-P" ), (SubLObject) makeSymbol( "S#678", "CYC" ) ), (SubLObject) makeSymbol( "S#678", "CYC" ), (SubLObject) ConsesLow.list(
                        (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "S#679", "CYC" ) ) ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
                            "S#680", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FIF" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCTION-SPEC-P" ),
                                (SubLObject) makeSymbol( "S#680", "CYC" ) ), (SubLObject) makeSymbol( "S#680", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
                                    .makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "S#681", "CYC" ) ) ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#682", "CYC" ),
                                        (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FIF" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCTION-SPEC-P" ),
                                            (SubLObject) makeSymbol( "S#682", "CYC" ) ), (SubLObject) makeSymbol( "S#682", "CYC" ), (SubLObject) ConsesLow.list(
                                                (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "S#683", "CYC" ) ) ) ), (SubLObject) ConsesLow.list(
                                                    (SubLObject) makeSymbol( "S#684", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FIF" ), (SubLObject) ConsesLow
                                                        .list( (SubLObject) makeSymbol( "FUNCTION-SPEC-P" ), (SubLObject) makeSymbol( "S#684", "CYC" ) ), (SubLObject) SubLObjectFactory
                                                            .makeSymbol( "S#684", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol(
                                                                "S#685", "CYC" ) ) ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#686", "CYC" ), (SubLObject) ConsesLow.list(
                                                                    (SubLObject) makeSymbol( "FIF" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCTION-SPEC-P" ),
                                                                        (SubLObject) makeSymbol( "S#686", "CYC" ) ), (SubLObject) makeSymbol( "S#686", "CYC" ), (SubLObject) ConsesLow
                                                                            .list( (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "S#687", "CYC" ) ) ) ) );
    $ic150$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#688", "CYC" ), (SubLObject) makeSymbol( "S#58", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic151$ = makeSymbol( "CYC-API-REMOTE-EVAL" );
    $ic152$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#689", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol(
        "S#5", "CYC" ) );
    $ic153$ = ConsesLow.list( (SubLObject) makeSymbol( "S#690", "CYC" ) );
    $ic154$ = makeSymbol( "S#691", "CYC" );
    $ic155$ = makeUninternedSymbol( "US#440FBBB" );
    $ic156$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#362", "CYC" ) ) );
    $ic157$ = makeSymbol( "S#454", "CYC" );
    $ic158$ = makeUninternedSymbol( "US#440FBBB" );
    $ic159$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#457", "CYC" ) ) );
    $ic160$ = makeSymbol( "S#457", "CYC" );
    $ic161$ = makeSymbol( "S#456", "CYC" );
    $ic162$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#619", "CYC" ), (SubLObject) NIL ) );
    $ic163$ = makeSymbol( "CUNWIND-PROTECT" );
    $ic164$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#692", "CYC" ) ) );
    $ic165$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#693", "CYC" ), (SubLObject) NIL ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
        .makeSymbol( "S#694", "CYC" ), (SubLObject) NIL ) );
    $ic166$ = makeSymbol( "S#459", "CYC" );
    $ic167$ = makeSymbol( "S#455", "CYC" );
    $ic168$ = makeSymbol( "S#458", "CYC" );
    $ic169$ = makeUninternedSymbol( "US#54A01D8" );
    $ic170$ = makeSymbol( "CATCH-ERROR-MESSAGE" );
    $ic171$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "THROW-UNEVALUATABLE" ) ) );
    $ic172$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#695", "CYC" ), (SubLObject) makeSymbol( "S#696", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic173$ = makeSymbol( "S#463", "CYC" );
    $ic174$ = ConsesLow.list( (SubLObject) makeSymbol( "S#697", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic175$ = makeKeyword( "SL2JAVA" );
    $ic176$ = makeSymbol( "S#622", "CYC" );
    $ic177$ = makeSymbol( "WITH-STATIC-AREA" );
    $ic178$ = ConsesLow.list( (SubLObject) makeSymbol( "STRUCTURE" ), (SubLObject) makeSymbol( "S#698", "CYC" ), (SubLObject) makeSymbol( "S#699", "CYC" ),
        (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "OBJECT", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic179$ = makeString( "*~A-FREE-LIST*" );
    $ic180$ = makeString( "Free list for ~A objects" );
    $ic181$ = makeString( "*~A-FREE-LOCK*" );
    $ic182$ = makeString( "Lock for ~A object free list" );
    $ic183$ = makeString( "~A resource lock" );
    $ic184$ = makeString( "MAKE-STATIC-~A" );
    $ic185$ = makeString( "Make a new ~A in the static area" );
    $ic186$ = makeString( "INIT-~A" );
    $ic187$ = makeString( "Initialize a ~A for use" );
    $ic188$ = makeString( "GET-~A" );
    $ic189$ = makeString( "Get a ~A from the free list, or make a new one if needed" );
    $ic190$ = makeString( "FREE-~A-P" );
    $ic191$ = makeString( "Check if OBJECT is a ~A that has been explicitly freed" );
    $ic192$ = makeString( "FREE-~A" );
    $ic193$ = makeString( "Place a ~A onto the free list" );
    $ic194$ = makeString( "MAKE-~A" );
    $ic195$ = makeString( "~A-P" );
    $ic196$ = makeSymbol( "DEFLEXICAL-PRIVATE" );
    $ic197$ = makeSymbol( "OBJECT", "CYC" );
    $ic198$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "RET" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ) ) );
    $ic199$ = makeSymbol( "CAND" );
    $ic200$ = ConsesLow.list( (SubLObject) makeKeyword( "FREE" ) );
    $ic201$ = makeSymbol( "PUNLESS" );
    $ic202$ = makeSymbol( "CSETF" );
    $ic203$ = makeSymbol( "S#621", "CYC" );
    $ic204$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "RET" ), (SubLObject) T ) );
    $ic205$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "RET" ), (SubLObject) NIL ) );
    $ic206$ = ConsesLow.list( (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#700", "CYC" ) );
    $ic207$ = makeSymbol( "CDO" );
    $ic208$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "COR" ), (SubLObject) makeSymbol( "S#700", "CYC" ), (SubLObject) ConsesLow.list(
        (SubLObject) makeSymbol( "NULL" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ) ) ) );
    $ic209$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "CSETQ" ), (SubLObject) makeSymbol( "S#700", "CYC" ), (SubLObject) T ) );
    $ic210$ = makeSymbol( "S#700", "CYC" );
    $ic211$ = ConsesLow.list( (SubLObject) NIL );
    $ic212$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*READ-EVAL*" ), (SubLObject) NIL ) );
    $ic213$ = ConsesLow.list( (SubLObject) makeSymbol( "STRING" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic214$ = makeUninternedSymbol( "US#5529897" );
    $ic215$ = ConsesLow.list( (SubLObject) makeSymbol( "S#639", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "GET-UNIVERSAL-TIME" ) ) );
    $ic216$ = ConsesLow.list( (SubLObject) makeSymbol( "S#623", "CYC" ), (SubLObject) makeSymbol( "S#639", "CYC" ) );
    $ic217$ = ConsesLow.list( (SubLObject) makeSymbol( "S#625", "CYC" ), (SubLObject) ONE_INTEGER );
    $ic218$ = ConsesLow.list( (SubLObject) makeSymbol( "S#626", "CYC" ), (SubLObject) ZERO_INTEGER );
    $ic219$ = ConsesLow.list( (SubLObject) makeSymbol( "S#624", "CYC" ), (SubLObject) ZERO_INTEGER );
    $ic220$ = ConsesLow.list( (SubLObject) makeSymbol( "S#627", "CYC" ), (SubLObject) ZERO_INTEGER );
    $ic221$ = ConsesLow.list( (SubLObject) makeSymbol( "S#628", "CYC" ), (SubLObject) T );
    $ic222$ = makeSymbol( "*SILENT-PROGRESS?*" );
    $ic223$ = makeSymbol( "FIF" );
    $ic224$ = ConsesLow.list( (SubLObject) makeSymbol( "*SILENT-PROGRESS?*" ), (SubLObject) T );
    $ic225$ = makeSymbol( "S#470", "CYC" );
    $ic226$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#471", "CYC" ) ) );
    $ic227$ = ConsesLow.list( (SubLObject) makeSymbol( "S#701", "CYC" ), (SubLObject) makeSymbol( "STRING" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic228$ = makeSymbol( "S#629", "CYC" );
    $ic229$ = makeSymbol( "S#630", "CYC" );
    $ic230$ = makeSymbol( "NOTING-PROGRESS" );
    $ic231$ = makeString( "~&~A " );
    $ic232$ = makeSymbol( "S#471", "CYC" );
    $ic233$ = makeString( " DONE (" );
    $ic234$ = makeInteger( 600 );
    $ic235$ = makeString( ", ended ~A" );
    $ic236$ = makeString( ")" );
    $ic237$ = makeSymbol( "NOTE-PROGRESS" );
    $ic238$ = makeInteger( 50 );
    $ic239$ = makeInteger( 200 );
    $ic240$ = makeInteger( 30 );
    $ic241$ = makeInteger( 25 );
    $ic242$ = makeString( "(~A)" );
    $ic243$ = makeString( "." );
    $ic244$ = makeSymbol( "IGNORE" );
    $ic245$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#632", "CYC" ), (SubLObject) ZERO_INTEGER ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
        .makeSymbol( "S#633", "CYC" ), (SubLObject) NIL ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#634", "CYC" ), (SubLObject) T ), (SubLObject) ConsesLow.list(
            (SubLObject) makeSymbol( "S#635", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "GET-UNIVERSAL-TIME" ) ) ) );
    $ic246$ = makeSymbol( "S#473", "CYC" );
    $ic247$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#474", "CYC" ) ) );
    $ic248$ = makeSymbol( "S#636", "CYC" );
    $ic249$ = makeSymbol( "S#637", "CYC" );
    $ic250$ = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $ic251$ = makeString( "~&~A" );
    $ic252$ = makeSymbol( "S#474", "CYC" );
    $ic253$ = makeString( " ]" );
    $ic254$ = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $ic255$ = makeString( "~% [" );
    $ic256$ = makeString( "01%" );
    $ic257$ = makeInteger( 300 );
    $ic258$ = makeString( "02%" );
    $ic259$ = makeInteger( 1200 );
    $ic260$ = makeInteger( -2 );
    $ic261$ = makeString( " " );
    $ic262$ = makeString( "%" );
    $ic263$ = makeString( "0" );
    $ic264$ = makeString( " (" );
    $ic265$ = makeString( " of " );
    $ic266$ = makeString( ", ending ~" );
    $ic267$ = makeString( "  " );
    $ic268$ = makeInteger( 99 );
    $ic269$ = makeString( "" );
    $ic270$ = makeString( "~%~A : ~D of ~D (~02D%) Done at ~A" );
    $ic271$ = makeString( "whenever" );
    $ic272$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "S#702", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#295", "CYC" ), (SubLObject) makeString( "cdotimes" ) ) ), (SubLObject) SubLObjectFactory
            .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic273$ = makeString( "cdotimes" );
    $ic274$ = makeSymbol( "S#638", "CYC" );
    $ic275$ = ConsesLow.list( (SubLObject) makeSymbol( "CSETQ" ), (SubLObject) makeSymbol( "S#639", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
        "GET-UNIVERSAL-TIME" ) ) );
    $ic276$ = makeSymbol( "S#640", "CYC" );
    $ic277$ = ConsesLow.list( (SubLObject) makeSymbol( "CSETQ" ), (SubLObject) makeSymbol( "S#641", "CYC" ), (SubLObject) ZERO_INTEGER );
    $ic278$ = makeSymbol( "CDOTIMES" );
    $ic279$ = ConsesLow.list( (SubLObject) makeSymbol( "S#640", "CYC" ) );
    $ic280$ = ConsesLow.list( (SubLObject) makeSymbol( "NOTE-PERCENT-PROGRESS" ), (SubLObject) makeSymbol( "S#641", "CYC" ), (SubLObject) makeSymbol( "S#640",
        "CYC" ) );
    $ic281$ = ConsesLow.list( (SubLObject) makeSymbol( "CINC" ), (SubLObject) makeSymbol( "S#641", "CYC" ) );
    $ic282$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "LIST" ), (SubLObject) makeSymbol(
        "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#295", "CYC" ), (SubLObject) makeString( "cdolist" ) ), (SubLObject) makeSymbol(
            "S#703", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic283$ = makeString( "cdolist" );
    $ic284$ = makeUninternedSymbol( "US#713E610" );
    $ic285$ = makeSymbol( "LENGTH" );
    $ic286$ = makeSymbol( "CSOME" );
    $ic287$ = makeSymbol( "PROGRESS-CDOLIST" );
    $ic288$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "LIST" ), (SubLObject) makeSymbol(
        "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#295", "CYC" ), (SubLObject) makeString( "cdolist" ) ) ), (SubLObject) makeSymbol(
            "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic289$ = makeSymbol( "S#480", "CYC" );
    $ic290$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "LIST" ), (SubLObject) makeSymbol(
        "&OPTIONAL" ), (SubLObject) makeSymbol( "S#295", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic291$ = makeUninternedSymbol( "US#7028EF8" );
    $ic292$ = makeSymbol( "CDOLIST" );
    $ic293$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#131", "CYC" ), (SubLObject) makeSymbol( "S#704", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#705", "CYC" ), (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#295", "CYC" ), (SubLObject) SubLObjectFactory
            .makeString( "cdohash" ) ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic294$ = makeString( "cdohash" );
    $ic295$ = makeUninternedSymbol( "US#7C5C08F" );
    $ic296$ = makeSymbol( "HASH-TABLE-COUNT" );
    $ic297$ = makeSymbol( "CDOHASH" );
    $ic298$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#706", "CYC" ), (SubLObject) makeSymbol( "SET" ), (SubLObject) makeSymbol(
        "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#295", "CYC" ), (SubLObject) makeString( "do-set" ) ) ), (SubLObject) makeSymbol(
            "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic299$ = makeString( "do-set" );
    $ic300$ = makeUninternedSymbol( "US#346F39A" );
    $ic301$ = makeSymbol( "S#707", "CYC" );
    $ic302$ = makeSymbol( "S#708", "CYC" );
    $ic303$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "&KEY" ), (SubLObject) makeSymbol( "S#295", "CYC" ) ), (SubLObject) makeSymbol(
        "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic304$ = ConsesLow.list( (SubLObject) makeKeyword( "MESSAGE" ) );
    $ic305$ = makeKeyword( "MESSAGE" );
    $ic306$ = makeUninternedSymbol( "US#7028EF8" );
    $ic307$ = makeUninternedSymbol( "US#1D0E4E1" );
    $ic308$ = makeSymbol( "S#484", "CYC" );
    $ic309$ = makeSymbol( "S#485", "CYC" );
    $ic310$ = makeSymbol( "S#483", "CYC" );
    $ic311$ = makeString( "~&~A started  at ~A" );
    $ic312$ = makeString( "~&~A finished at ~A after~A" );
    $ic313$ = makeSymbol( "WITH-SUBLISP-ERROR-HANDLING" );
    $ic314$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*PACKAGE*" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FIND-PACKAGE" ),
        (SubLObject) makeString( "CYC" ) ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*READ-DEFAULT-FLOAT-FORMAT*" ), (SubLObject) ConsesLow.list(
            (SubLObject) makeSymbol( "QUOTE" ), (SubLObject) makeSymbol( "DOUBLE-FLOAT" ) ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
                "*PRINT-READABLY*" ), (SubLObject) NIL ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*READ-EVAL*" ), (SubLObject) NIL ), (SubLObject) ConsesLow.list(
                    (SubLObject) makeSymbol( "S#709", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "PROCESS-PRIORITY" ), (SubLObject) ConsesLow.list(
                        (SubLObject) makeSymbol( "CURRENT-PROCESS" ) ) ) ) );
    $ic315$ = ConsesLow.list( (SubLObject) makeSymbol( "SET-PROCESS-PRIORITY" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "CURRENT-PROCESS" ) ),
        (SubLObject) makeSymbol( "*PROCESS-NORMAL-PRIORITY*" ) );
    $ic316$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "SET-PROCESS-PRIORITY" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
        "CURRENT-PROCESS" ) ), (SubLObject) makeSymbol( "S#709", "CYC" ) ) );
    $ic317$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*PACKAGE*" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FIND-PACKAGE" ),
        (SubLObject) makeString( "CYC" ) ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*PRINT-READABLY*" ), (SubLObject) NIL ), (SubLObject) ConsesLow.list(
            (SubLObject) makeSymbol( "*READ-EVAL*" ), (SubLObject) NIL ) );
    $ic318$ = makeSymbol( "S#486", "CYC" );
    $ic319$ = makeSymbol( "S#487", "CYC" );
    $ic320$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*READ-DEFAULT-FLOAT-FORMAT*" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "QUOTE" ),
        (SubLObject) makeSymbol( "DOUBLE-FLOAT" ) ) ) );
    $ic321$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#710", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol(
        "S#5", "CYC" ) );
    $ic322$ = makeUninternedSymbol( "US#1ED571A" );
    $ic323$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "THE-CYCLIST" ) ) );
    $ic324$ = makeSymbol( "S#711", "CYC" );
    $ic325$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*THE-CYCLIST*" ), (SubLObject) NIL ) );
    $ic326$ = ConsesLow.list( (SubLObject) makeSymbol( "S#712", "CYC" ), (SubLObject) makeSymbol( "S#713", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic327$ = makeUninternedSymbol( "US#5D5B455" );
    $ic328$ = makeSymbol( "SUBLIS" );
    $ic329$ = makeString( "~S - var ~S is not a symbol." );
    $ic330$ = makeString( "~S - function ~S is not a symbol." );
    $ic331$ = makeString( "~S - search type ~S is not one of (:depth-first :breadth-first)." );
    $ic332$ = ConsesLow.list( (SubLObject) makeSymbol( "LIST" ) );
    $ic333$ = makeSymbol( "NULL" );
    $ic334$ = makeSymbol( "CDR" );
    $ic335$ = makeSymbol( "CONSP" );
    $ic336$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "S#714", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic337$ = makeSymbol( "S#496", "CYC" );
    $ic338$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#715", "CYC" ), (SubLObject) makeSymbol( "S#716", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#714", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic339$ = makeSymbol( "S#497", "CYC" );
    $ic340$ = makeString( "next-cons-var" );
    $ic341$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#715", "CYC" ), (SubLObject) makeSymbol( "S#714", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic342$ = makeString( "sublist" );
    $ic343$ = makeSymbol( "WHILE" );
    $ic344$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "S#717", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#714", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic345$ = makeSymbol( "S#500", "CYC" );
    $ic346$ = makeSymbol( "S#501", "CYC" );
    $ic347$ = makeSymbol( "S#502", "CYC" );
    $ic348$ = makeSymbol( "S#503", "CYC" );
    $ic349$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#141", "CYC" ), (SubLObject) makeSymbol( "S#718", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#142", "CYC" ), (SubLObject) makeSymbol( "S#719", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic350$ = makeString( "sublist1" );
    $ic351$ = makeString( "sublist2" );
    $ic352$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "S#720", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#721", "CYC" ), (SubLObject) makeKeyword( "DEPTH-FIRST" ) ), (SubLObject) ConsesLow.list(
            (SubLObject) makeSymbol( "S#722", "CYC" ), (SubLObject) NIL ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic353$ = makeKeyword( "DEPTH-FIRST" );
    $ic354$ = makeSymbol( "S#505", "CYC" );
    $ic355$ = makeKeyword( "BREADTH-FIRST" );
    $ic356$ = makeString( "tree-var" );
    $ic357$ = makeString( "cells-var" );
    $ic358$ = makeString( "tail-of-cells" );
    $ic359$ = makeSymbol( "LIST" );
    $ic360$ = makeSymbol( "LAST" );
    $ic361$ = makeSymbol( "RPLACD" );
    $ic362$ = makeSymbol( "CPUSH" );
    $ic363$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "S#720", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#721", "CYC" ), (SubLObject) makeKeyword( "DEPTH-FIRST" ) ) ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic364$ = makeSymbol( "S#506", "CYC" );
    $ic365$ = makeString( "tail-of-cells-var" );
    $ic366$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#723", "CYC" ), (SubLObject) makeSymbol( "S#132", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#138", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic367$ = makeSymbol( "DO-PLIST" );
    $ic368$ = makeSymbol( "CAAR" );
    $ic369$ = makeSymbol( "CDAR" );
    $ic370$ = makeSymbol( "CADR" );
    $ic371$ = makeSymbol( "CDDR" );
    $ic372$ = ConsesLow.list( (SubLObject) makeSymbol( "S#32", "CYC" ), (SubLObject) makeSymbol( "S#724", "CYC" ) );
    $ic373$ = makeString( "datum-evaluated-var" );
    $ic374$ = makeSymbol( "NCONC" );
    $ic375$ = makeString( "FAST-FUNCALL-NO-VALUE: contains erroneous function name it its function name list." );
    $ic376$ = makeString( "FAST-FUNCALL-NO-VALUE: cannot accept dotted list for its function name list." );
    $ic377$ = makeString( "FAST-FUNCALL-NO-VALUE: function name list must be a list." );
    $ic378$ = ConsesLow.list( (SubLObject) makeSymbol( "S#725", "CYC" ), (SubLObject) makeSymbol( "S#726", "CYC" ), (SubLObject) makeSymbol( "&REST" ),
        (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic379$ = makeSymbol( "FUNCALL" );
    $ic380$ = makeString( "function-form-evaluated-var" );
    $ic381$ = makeSymbol( "PCASE" );
    $ic382$ = makeSymbol( "OTHERWISE" );
    $ic383$ = ConsesLow.list( (SubLObject) makeSymbol( "S#727", "CYC" ), (SubLObject) makeSymbol( "S#725", "CYC" ), (SubLObject) makeSymbol( "S#726", "CYC" ),
        (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic384$ = ConsesLow.list( (SubLObject) makeSymbol( "S#728", "CYC" ), (SubLObject) ConsesLow.listS( (SubLObject) makeSymbol( "S#725", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#726", "CYC" ), (SubLObject) makeSymbol( "S#105", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic385$ = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $ic386$ = ConsesLow.list( (SubLObject) makeSymbol( "S#729", "CYC" ), (SubLObject) makeSymbol( "S#725", "CYC" ), (SubLObject) makeSymbol( "S#726", "CYC" ),
        (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic387$ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $ic388$ = ConsesLow.list( (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic389$ = ConsesLow.list( (SubLObject) makeSymbol( "S#730", "CYC" ), (SubLObject) makeSymbol( "S#731", "CYC" ) );
    $ic390$ = makeString( "~A~S" );
    $ic391$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "S#714", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#732", "CYC" ) ), (SubLObject) makeSymbol( "S#733", "CYC" ) );
    $ic392$ = makeString( "LIST-EXPRESSION" );
    $ic393$ = makeString( "TAIL-CONS" );
    $ic394$ = makeString( "RESULT" );
    $ic395$ = makeSymbol( "PCOND" );
    $ic396$ = makeSymbol( "ATOM" );
    $ic397$ = makeKeyword( "API" );
    $ic398$ = makeSymbol( "S#369", "CYC" );
    $ic399$ = makeKeyword( "PUBLIC" );
    $ic400$ = makeKeyword( "PROTECTED" );
    $ic401$ = makeSymbol( "DEFINE-PROTECTED" );
    $ic402$ = makeKeyword( "PRIVATE" );
    $ic403$ = makeKeyword( "ALL" );
    $ic404$ = ConsesLow.list( (SubLObject) makeSymbol( "PUNLESS" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "LISTP" ), (SubLObject) makeSymbol(
        "LIST" ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "RET" ), (SubLObject) NIL ) );
    $ic405$ = makeKeyword( "NOT-EMPTY-ALL" );
    $ic406$ = ConsesLow.list( (SubLObject) makeSymbol( "PUNLESS" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "CONSP" ), (SubLObject) makeSymbol(
        "LIST" ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "RET" ), (SubLObject) NIL ) );
    $ic407$ = makeKeyword( "ANY" );
    $ic408$ = makeString( "DEFINE-LIST-ELEMENT-PREDICATOR: ~S is not a valid type value." );
    $ic409$ = ConsesLow.list( (SubLObject) makeSymbol( "S#734", "CYC" ), (SubLObject) makeSymbol( "TYPE" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
        "S#715", "CYC" ) ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic410$ = makeSymbol( "&OPTIONAL" );
    $ic411$ = makeSymbol( "S#531", "CYC" );
    $ic412$ = makeString( "FCOND: ~S is not a valid clause list." );
    $ic413$ = makeString( "FCOND: ~S is not a valid clause." );
    $ic414$ = makeString( "P-RANGE-CASE: Ill-formed clauses encountered -> ~S." );
    $ic415$ = makeString( "P-RANGE-CASE: ~S is not a valid clause." );
    $ic416$ = makeString( "value" );
    $ic417$ = makeSymbol( ">=" );
    $ic418$ = makeSymbol( "<=" );
    $ic419$ = makeSymbol( "=" );
    $ic420$ = ConsesLow.list( (SubLObject) makeSymbol( "S#132", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#735", "CYC" ) );
    $ic421$ = makeSymbol( "ERROR" );
    $ic422$ = makeString( "Invalid version code ~A." );
    $ic423$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#736", "CYC" ) ), (SubLObject) makeSymbol( "S#737", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&KEY" ), (SubLObject) makeSymbol( "S#738", "CYC" ) );
    $ic424$ = ConsesLow.list( (SubLObject) makeKeyword( "ERROR-CLAUSE" ) );
    $ic425$ = makeKeyword( "ERROR-CLAUSE" );
    $ic426$ = ConsesLow.list( (SubLObject) makeSymbol( "S#736", "CYC" ), (SubLObject) makeSymbol( "S#151", "CYC" ) );
    $ic427$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#739", "CYC" ), (SubLObject) makeSymbol( "S#740", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#737", "CYC" ), (SubLObject) makeSymbol( "&KEY" ), (SubLObject) makeSymbol( "S#738", "CYC" ) );
    $ic428$ = ConsesLow.list( (SubLObject) makeSymbol( "S#741", "CYC" ), (SubLObject) makeSymbol( "S#742", "CYC" ), (SubLObject) makeSymbol( "S#151", "CYC" ) );
    $ic429$ = makeSymbol( "S#543", "CYC" );
    $ic430$ = makeSymbol( "S#546", "CYC" );
    $ic431$ = makeString( "-P" );
    $ic432$ = makeSymbol( "S#544", "CYC" );
    $ic433$ = makeString( "SET-" );
    $ic434$ = makeSymbol( "S#545", "CYC" );
    $ic435$ = makeString( "UNSET-" );
    $ic436$ = ConsesLow.list( (SubLObject) makeSymbol( "S#743", "CYC" ), (SubLObject) makeSymbol( "S#744", "CYC" ) );
    $ic437$ = makeSymbol( "DEFGLOBAL-PRIVATE" );
    $ic438$ = ConsesLow.list( (SubLObject) makeSymbol( "S#745", "CYC" ) );
    $ic439$ = ConsesLow.list( (SubLObject) T );
    $ic440$ = makeKeyword( "A" );
    $ic441$ = makeKeyword( "S" );
    $ic442$ = makeKeyword( "D" );
    $ic443$ = makeSymbol( "S#746", "CYC" );
    $ic444$ = makeSymbol( "CCONCATENATE" );
    $ic445$ = ConsesLow.list( (SubLObject) makeKeyword( "A" ), (SubLObject) makeKeyword( "S" ), (SubLObject) makeKeyword( "D" ) );
    $ic446$ = makeString( "FORMAT-TO-STRING: ~S is an invalid format arg.  ~\n           Format args must be a member of the set {:A, :S, :D}." );
    $ic447$ = makeString( "FORMAT-TO-STRING: Odd number of args encountered: ~S" );
    $ic448$ = makeUninternedSymbol( "US#326A0D5" );
    $ic449$ = makeSymbol( "CTIME" );
    $ic450$ = makeSymbol( "FORMAT" );
    $ic451$ = makeString( "~&;; real time ~A seconds~%" );
    $ic452$ = ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic453$ = makeUninternedSymbol( "US#2085DE0" );
    $ic454$ = makeUninternedSymbol( "US#5B06B73" );
    $ic455$ = makeSymbol( "WITH-PROCESS-RESOURCE-TRACKING" );
    $ic456$ = makeSymbol( "S#550", "CYC" );
    $ic457$ = makeSymbol( "S#551", "CYC" );
    $ic458$ = ConsesLow.list( (SubLObject) makeKeyword( "USER-TIME" ), (SubLObject) makeKeyword( "SYSTEM-TIME" ) );
    $ic459$ = makeSymbol( "S#549", "CYC" );
    $ic460$ = makeInteger( 10000000 );
    $ic461$ = makeKeyword( "WALL-CLOCK-TIME" );
    $ic462$ = makeKeyword( "USER-TIME" );
    $ic463$ = makeKeyword( "SYSTEM-TIME" );
    $ic464$ = makeUninternedSymbol( "US#2085DE0" );
    $ic465$ = makeString( "~&;; ~s~%" );
    $ic466$ = makeUninternedSymbol( "US#2085DE0" );
    $ic467$ = makeSymbol( "S#552", "CYC" );
    $ic468$ = makeUninternedSymbol( "US#2085DE0" );
    $ic469$ = makeUninternedSymbol( "US#2085DE0" );
    $ic470$ = makeSymbol( "S#553", "CYC" );
    $ic471$ = makeUninternedSymbol( "US#2085DE0" );
    $ic472$ = ConsesLow.list( (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#155", "CYC" ) );
    $ic473$ = makeSymbol( "ENFORCE-TYPE" );
    $ic474$ = ConsesLow.list( (SubLObject) makeSymbol( "LIST" ), (SubLObject) makeSymbol( "S#155", "CYC" ) );
    $ic475$ = makeUninternedSymbol( "US#33228DF" );
    $ic476$ = makeUninternedSymbol( "US#713E610" );
    $ic477$ = ConsesLow.list( (SubLObject) makeSymbol( "S#747", "CYC" ) );
    $ic478$ = makeSymbol( "S#157", "CYC" );
    $ic479$ = makeUninternedSymbol( "US#33228DF" );
    $ic480$ = makeUninternedSymbol( "US#713E610" );
    $ic481$ = ConsesLow.list( (SubLObject) makeSymbol( "S#138", "CYC" ), (SubLObject) makeSymbol( "S#155", "CYC" ) );
    $ic482$ = makeUninternedSymbol( "US#5DE2218" );
    $ic483$ = makeUninternedSymbol( "US#1069245" );
    $ic484$ = makeUninternedSymbol( "US#1F1E812" );
    $ic485$ = ConsesLow.list( (SubLObject) makeSymbol( "S#748", "CYC" ) );
    $ic486$ = makeUninternedSymbol( "US#5DE2218" );
    $ic487$ = makeUninternedSymbol( "US#1069245" );
    $ic488$ = makeUninternedSymbol( "US#1F1E812" );
    $ic489$ = makeUninternedSymbol( "US#5DE2218" );
    $ic490$ = makeUninternedSymbol( "US#1069245" );
    $ic491$ = makeUninternedSymbol( "US#1F1E812" );
    $ic492$ = makeSymbol( "S#749", "CYC" );
    $ic493$ = makeString( "~s is not a known ~a" );
    $ic494$ = ConsesLow.list( (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#151", "CYC" ), (SubLObject) makeSymbol( "S#159", "CYC" ),
        (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#201", "CYC" ) );
    $ic495$ = makeSymbol( "MUST" );
    $ic496$ = ConsesLow.list( (SubLObject) makeSymbol( "S#750", "CYC" ), (SubLObject) makeSymbol( "S#751", "CYC" ) );
    $ic497$ = makeUninternedSymbol( "US#36B1E10" );
    $ic498$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "&KEY" ), (SubLObject) makeSymbol(
        "DOCUMENTATION" ), (SubLObject) makeSymbol( "S#752", "CYC" ), (SubLObject) makeSymbol( "S#753", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic499$ = ConsesLow.list( (SubLObject) makeKeyword( "DOCUMENTATION" ), (SubLObject) makeKeyword( "DEFINER" ), (SubLObject) makeKeyword( "ACCESS" ) );
    $ic500$ = makeKeyword( "DEFINER" );
    $ic501$ = makeKeyword( "ACCESS" );
    $ic502$ = makeString( "~A-INITIALIZER" );
    $ic503$ = makeSymbol( "PROCLAIM" );
    $ic504$ = makeKeyword( "UNINITIALIZED" );
    $ic505$ = makeSymbol( "S#569", "CYC" );
    $ic506$ = makeSymbol( "S#646", "CYC" );
    $ic507$ = makeSymbol( "S#568", "CYC" );
    $ic508$ = makeString( "Initializing KB variables..." );
    $ic509$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#754", "CYC" ), (SubLObject) makeSymbol( "S#168", "CYC" ) );
    $ic510$ = ConsesLow.list( (SubLObject) makeSymbol( "S#755", "CYC" ), (SubLObject) makeSymbol( "S#756", "CYC" ), (SubLObject) makeSymbol( "&KEY" ),
        (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VACCESS" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
            .makeSymbol( "QUOTE" ), (SubLObject) makeSymbol( "PRIVATE" ) ) ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FACCESS" ), (SubLObject) ConsesLow.list(
                (SubLObject) makeSymbol( "QUOTE" ), (SubLObject) makeSymbol( "PRIVATE" ) ) ), (SubLObject) makeSymbol( "DOCUMENTATION" ) );
    $ic511$ = ConsesLow.list( (SubLObject) makeKeyword( "VAR" ), (SubLObject) makeKeyword( "VACCESS" ), (SubLObject) makeKeyword( "FACCESS" ),
        (SubLObject) makeKeyword( "DOCUMENTATION" ) );
    $ic512$ = makeKeyword( "VAR" );
    $ic513$ = makeSymbol( "PRIVATE" );
    $ic514$ = makeKeyword( "FACCESS" );
    $ic515$ = makeString( "*" );
    $ic516$ = makeString( "Invalid function-name ~A.  The first arg of DEFPARAMETER-LAZY is the getter function, not the variable name." );
    $ic517$ = makeUninternedSymbol( "US#30ED8A0" );
    $ic518$ = makeSymbol( "FACCESS" );
    $ic519$ = ConsesLow.list( (SubLObject) makeKeyword( "UNINITIALIZED" ) );
    $ic520$ = makeString( "Unable to initialize ~A~%" );
    $ic521$ = makeString( "Invalid function-name ~A.  The first arg of DEFVAR-LAZY is the getter function, not the variable name." );
    $ic522$ = makeUninternedSymbol( "US#30ED8A0" );
    $ic523$ = makeString( "Invalid function-name ~A.  The first arg of DEFGLOBAL-LAZY is the getter function, not the variable name." );
    $ic524$ = makeUninternedSymbol( "US#30ED8A0" );
    $ic525$ = makeString( "Invalid function-name ~A.  The first arg of DEFLEXICAL-LAZY is the getter function, not the variable name." );
    $ic526$ = makeUninternedSymbol( "US#30ED8A0" );
    $ic527$ = ConsesLow.list( (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#30", "CYC" ), (SubLObject) makeSymbol( "S#662", "CYC" ),
        (SubLObject) makeSymbol( "S#757", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic528$ = makeSymbol( "S#576", "CYC" );
    $ic529$ = makeKeyword( "OBSOLETE-CYC-API-REPLACEMENTS" );
    $ic530$ = makeInteger( 40 );
    $ic531$ = makeSymbol( "S#580", "CYC" );
    $ic532$ = makeSymbol( "S#581", "CYC" );
    $ic533$ = makeSymbol( "S#582", "CYC" );
    $ic534$ = makeSymbol( "S#583", "CYC" );
    $ic535$ = makeSymbol( "S#584", "CYC" );
    $ic536$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#758", "CYC" ), (SubLObject) makeSymbol( "S#759", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic537$ = ConsesLow.list( (SubLObject) makeSymbol( "S#647", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCALL" ), (SubLObject) makeSymbol(
        "S#652", "CYC" ) ) );
    $ic538$ = ConsesLow.list( (SubLObject) makeSymbol( "S#651", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCALL" ), (SubLObject) makeSymbol(
        "S#652", "CYC" ) ) );
    $ic539$ = makeSymbol( "S#649", "CYC" );
    $ic540$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#648", "CYC" ), (SubLObject) ZERO_INTEGER ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
        .makeSymbol( "S#650", "CYC" ), (SubLObject) ZERO_INTEGER ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#657", "CYC" ), (SubLObject) T ) );
    $ic541$ = ConsesLow.list( (SubLObject) makeSymbol( "FUNCALL" ), (SubLObject) makeSymbol( "S#654", "CYC" ), (SubLObject) makeSymbol( "S#647", "CYC" ) );
    $ic542$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "FUNCALL" ), (SubLObject) makeSymbol( "S#656", "CYC" ), (SubLObject) makeSymbol(
        "S#651", "CYC" ) ) );
    $ic543$ = makeSymbol( "WITH-SPACE-PROFILING-TO-STRING" );
    $ic544$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#760", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol(
        "S#5", "CYC" ) );
    $ic545$ = makeUninternedSymbol( "US#541F852" );
    $ic546$ = makeSymbol( "CWITH-OUTPUT-TO-STRING" );
    $ic547$ = makeSymbol( "WITH-SPACE-PROFILING" );
    $ic548$ = makeKeyword( "STREAM" );
    $ic549$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#761", "CYC" ), (SubLObject) makeSymbol( "&KEY" ), (SubLObject) ConsesLow.list(
        (SubLObject) makeSymbol( "S#762", "CYC" ), (SubLObject) ZERO_INTEGER ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5",
            "CYC" ) );
    $ic550$ = ConsesLow.list( (SubLObject) makeKeyword( "INITIAL-VALUE" ) );
    $ic551$ = makeKeyword( "INITIAL-VALUE" );
    $ic552$ = ConsesLow.list( (SubLObject) makeSymbol( "S#660", "CYC" ), (SubLObject) FOUR_INTEGER );
    $ic553$ = makeSymbol( "S#661", "CYC" );
    $ic554$ = ConsesLow.list( (SubLObject) makeSymbol( "S#661", "CYC" ) );
    $ic555$ = ConsesLow.list( (SubLObject) makeSymbol( "S#763", "CYC" ), (SubLObject) FOUR_INTEGER );
    $ic556$ = makeSymbol( "S#764", "CYC" );
    $ic557$ = ConsesLow.list( (SubLObject) makeSymbol( "S#764", "CYC" ) );
    $ic558$ = ConsesLow.list( (SubLObject) makeSymbol( "S#132", "CYC" ) );
    $ic559$ = ConsesLow.list( (SubLObject) makeSymbol( "CSETQ" ), (SubLObject) makeSymbol( "S#763", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol(
        "S#590", "CYC" ), (SubLObject) makeSymbol( "S#763", "CYC" ) ) );
    $ic560$ = makeSymbol( "LOGXOR" );
    $ic561$ = makeSymbol( "S#765", "CYC" );
    $ic562$ = makeSymbol( "SXHASH" );
    $ic563$ = ConsesLow.list( (SubLObject) makeSymbol( "S#763", "CYC" ) );
    $ic564$ = makeInteger( 27 );
    $ic565$ = Vectors.vector( new SubLObject[] { SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER,
      THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER,
      TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ), makeInteger( 25 ),
      makeInteger( 26 ), makeInteger( 27 ), makeInteger( 28 ), makeInteger( 29 ), makeInteger( 30 ), SubLObjectFactory
          .makeInteger( 31 ), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER
    } );
    $ic566$ = makeSymbol( "S#591", "CYC" );
    $ic567$ = makeSymbol( "S#766", "CYC" );
    $ic568$ = makeInteger( 1000000 );
    $ic569$ = makeInteger( 167 );
    $ic570$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "VAR", "CYC" ), (SubLObject) makeSymbol( "S#767", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic571$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#150", "CYC" ), (SubLObject) makeSymbol( "S#768", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#767", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic572$ = makeSymbol( "CCATCH" );
    $ic573$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#769", "CYC" ), (SubLObject) makeSymbol( "S#770", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic574$ = makeUninternedSymbol( "US#15747D8" );
    $ic575$ = makeUninternedSymbol( "US#326A0D5" );
    $ic576$ = makeUninternedSymbol( "US#24883" );
    $ic577$ = ConsesLow.list( (SubLObject) makeSymbol( "S#597", "CYC" ) );
    $ic578$ = makeSymbol( "+" );
    $ic579$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#597", "CYC" ) ) );
    $ic580$ = makeSymbol( "S#771", "CYC" );
    $ic581$ = makeSymbol( "S#597", "CYC" );
    $ic582$ = makeSymbol( "S#596", "CYC" );
    $ic583$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*PRINT-PRETTY*" ), (SubLObject) NIL ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
        .makeSymbol( "*PRINT-LENGTH*" ), (SubLObject) NIL ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "*PRINT-LEVEL*" ), (SubLObject) NIL ) );
    $ic584$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#59", "CYC" ), (SubLObject) makeSymbol( "S#772", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic585$ = makeSymbol( "WITH-TIMEOUT" );
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 2691 ms synthetic Decompiled with
 * Procyon 0.5.32.
 */