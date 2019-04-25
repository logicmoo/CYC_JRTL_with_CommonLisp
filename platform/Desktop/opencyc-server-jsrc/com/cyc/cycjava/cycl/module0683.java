package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0683 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0683";
    public static final String myFingerPrint = "0568d3dbc0c472ec5d2d230cd47e4fa8597a3d0083e9eeb53d034b010ad86c15";
    private static SubLSymbol $g5352$;
    private static SubLSymbol $g5353$;
    private static SubLSymbol $g5354$;
    private static SubLSymbol $g5355$;
    public static SubLSymbol $g5356$;
    private static SubLSymbol $g5357$;
    public static SubLSymbol $g5358$;
    public static SubLSymbol $g5359$;
    private static SubLSymbol $g5360$;
    public static SubLSymbol $g5325$;
    private static SubLSymbol $g5361$;
    private static SubLSymbol $g5362$;
    private static SubLSymbol $g5364$;
    private static SubLSymbol $g5365$;
    private static SubLSymbol $g5366$;
    private static SubLSymbol $g5367$;
    private static SubLSymbol $g5368$;
    private static SubLSymbol $g5369$;
    private static SubLSymbol $g5363$;
    private static SubLSymbol $g5370$;
    private static SubLSymbol $g5371$;
    private static SubLSymbol $g5372$;
    private static SubLSymbol $g5373$;
    private static SubLSymbol $g5374$;
    private static SubLSymbol $g5375$;
    private static SubLSymbol $g5376$;
    private static SubLSymbol $g5377$;
    private static SubLSymbol $g5378$;
    private static SubLSymbol $g5379$;
    private static SubLSymbol $g5380$;
    private static SubLSymbol $g5384$;
    private static final SubLSymbol $ic0$;
    private static final SubLString $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLList $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLList $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLList $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLList $ic80$;
    private static final SubLFloat $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLList $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLList $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLString $ic115$;
    private static final SubLString $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLString $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLList $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLList $ic136$;
    private static final SubLInteger $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLList $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLList $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLList $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLList $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLList $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLList $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLList $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLSymbol $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLString $ic193$;
    private static final SubLString $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLString $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLList $ic199$;
    private static final SubLSymbol $ic200$;
    private static final SubLList $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLList $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLList $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLSymbol $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLInteger $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLString $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLString $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLString $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLString $ic232$;
    private static final SubLString $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLString $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
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
    private static final SubLString $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLString $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLString $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLString $ic275$;
    private static final SubLString $ic276$;
    private static final SubLString $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLString $ic280$;
    private static final SubLString $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLString $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLString $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLString $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLString $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLString $ic291$;
    private static final SubLString $ic292$;
    private static final SubLString $ic293$;
    private static final SubLString $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLString $ic296$;
    private static final SubLString $ic297$;
    private static final SubLString $ic298$;
    private static final SubLString $ic299$;
    private static final SubLString $ic300$;
    private static final SubLString $ic301$;
    private static final SubLString $ic302$;
    private static final SubLString $ic303$;
    private static final SubLString $ic304$;
    private static final SubLString $ic305$;
    private static final SubLString $ic306$;
    private static final SubLObject $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLObject $ic309$;
    private static final SubLList $ic310$;
    private static final SubLSymbol $ic311$;
    private static final SubLObject $ic312$;
    private static final SubLList $ic313$;
    private static final SubLString $ic314$;
    private static final SubLString $ic315$;
    private static final SubLString $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLString $ic318$;
    private static final SubLInteger $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLString $ic321$;
    private static final SubLSymbol $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLSymbol $ic324$;
    private static final SubLString $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLString $ic327$;
    private static final SubLSymbol $ic328$;
    private static final SubLString $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLString $ic331$;
    private static final SubLString $ic332$;
    private static final SubLList $ic333$;
    private static final SubLList $ic334$;
    private static final SubLString $ic335$;
    private static final SubLString $ic336$;
    private static final SubLString $ic337$;
    private static final SubLString $ic338$;
    private static final SubLString $ic339$;
    private static final SubLString $ic340$;
    private static final SubLSymbol $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLString $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLString $ic347$;
    private static final SubLString $ic348$;
    private static final SubLString $ic349$;
    private static final SubLString $ic350$;
    private static final SubLString $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLString $ic354$;
    private static final SubLString $ic355$;
    private static final SubLString $ic356$;
    private static final SubLString $ic357$;
    private static final SubLString $ic358$;
    private static final SubLString $ic359$;
    private static final SubLList $ic360$;
    private static final SubLString $ic361$;
    private static final SubLString $ic362$;
    private static final SubLString $ic363$;
    private static final SubLString $ic364$;
    private static final SubLString $ic365$;
    private static final SubLList $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLString $ic369$;
    private static final SubLString $ic370$;
    private static final SubLList $ic371$;
    private static final SubLString $ic372$;
    private static final SubLList $ic373$;
    private static final SubLString $ic374$;
    private static final SubLString $ic375$;
    private static final SubLList $ic376$;
    private static final SubLList $ic377$;
    private static final SubLString $ic378$;
    private static final SubLString $ic379$;
    private static final SubLList $ic380$;
    private static final SubLList $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLString $ic384$;
    private static final SubLString $ic385$;
    private static final SubLList $ic386$;
    private static final SubLList $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLString $ic389$;
    private static final SubLString $ic390$;
    private static final SubLString $ic391$;
    private static final SubLString $ic392$;
    private static final SubLList $ic393$;
    private static final SubLList $ic394$;
    private static final SubLString $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLString $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLString $ic400$;
    private static final SubLString $ic401$;
    private static final SubLSymbol $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLString $ic406$;
    private static final SubLString $ic407$;
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
    private static final SubLSymbol $ic422$;
    private static final SubLString $ic423$;
    private static final SubLString $ic424$;
    private static final SubLString $ic425$;
    private static final SubLString $ic426$;
    private static final SubLString $ic427$;
    private static final SubLString $ic428$;
    private static final SubLString $ic429$;
    private static final SubLString $ic430$;
    private static final SubLSymbol $ic431$;
    private static final SubLSymbol $ic432$;
    private static final SubLSymbol $ic433$;
    private static final SubLString $ic434$;
    private static final SubLSymbol $ic435$;
    private static final SubLString $ic436$;
    private static final SubLString $ic437$;
    private static final SubLString $ic438$;
    private static final SubLString $ic439$;
    private static final SubLString $ic440$;
    private static final SubLSymbol $ic441$;
    private static final SubLString $ic442$;
    private static final SubLSymbol $ic443$;
    private static final SubLSymbol $ic444$;
    private static final SubLSymbol $ic445$;
    private static final SubLString $ic446$;
    private static final SubLString $ic447$;
    private static final SubLSymbol $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLString $ic450$;
    private static final SubLString $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLSymbol $ic453$;
    private static final SubLString $ic454$;
    private static final SubLString $ic455$;
    private static final SubLSymbol $ic456$;
    private static final SubLSymbol $ic457$;
    private static final SubLSymbol $ic458$;
    private static final SubLSymbol $ic459$;
    private static final SubLSymbol $ic460$;
    private static final SubLSymbol $ic461$;
    private static final SubLSymbol $ic462$;
    private static final SubLSymbol $ic463$;
    private static final SubLString $ic464$;
    private static final SubLString $ic465$;
    private static final SubLString $ic466$;
    private static final SubLList $ic467$;
    private static final SubLList $ic468$;
    private static final SubLList $ic469$;
    private static final SubLList $ic470$;
    private static final SubLList $ic471$;
    private static final SubLSymbol $ic472$;
    private static final SubLSymbol $ic473$;
    private static final SubLSymbol $ic474$;
    private static final SubLObject $ic475$;
    private static final SubLSymbol $ic476$;
    private static final SubLString $ic477$;
    private static final SubLList $ic478$;
    private static final SubLString $ic479$;
    private static final SubLString $ic480$;
    private static final SubLString $ic481$;
    private static final SubLString $ic482$;
    private static final SubLString $ic483$;
    private static final SubLString $ic484$;
    private static final SubLString $ic485$;
    private static final SubLString $ic486$;
    private static final SubLString $ic487$;
    private static final SubLString $ic488$;
    private static final SubLString $ic489$;
    private static final SubLSymbol $ic490$;
    private static final SubLString $ic491$;
    private static final SubLString $ic492$;
    private static final SubLString $ic493$;
    private static final SubLString $ic494$;
    private static final SubLSymbol $ic495$;
    private static final SubLSymbol $ic496$;
    private static final SubLString $ic497$;
    private static final SubLSymbol $ic498$;
    private static final SubLString $ic499$;
    private static final SubLSymbol $ic500$;
    private static final SubLSymbol $ic501$;
    private static final SubLSymbol $ic502$;
    private static final SubLString $ic503$;
    private static final SubLString $ic504$;
    private static final SubLSymbol $ic505$;
    private static final SubLSymbol $ic506$;
    private static final SubLSymbol $ic507$;
    private static final SubLString $ic508$;
    private static final SubLString $ic509$;
    private static final SubLSymbol $ic510$;
    private static final SubLString $ic511$;
    private static final SubLSymbol $ic512$;
    private static final SubLSymbol $ic513$;
    private static final SubLString $ic514$;
    private static final SubLSymbol $ic515$;
    private static final SubLString $ic516$;
    private static final SubLString $ic517$;
    private static final SubLString $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLSymbol $ic520$;
    private static final SubLSymbol $ic521$;
    private static final SubLString $ic522$;
    private static final SubLString $ic523$;
    private static final SubLObject $ic524$;
    private static final SubLList $ic525$;
    private static final SubLString $ic526$;
    private static final SubLString $ic527$;
    private static final SubLSymbol $ic528$;
    private static final SubLSymbol $ic529$;
    private static final SubLList $ic530$;
    private static final SubLSymbol $ic531$;
    private static final SubLString $ic532$;
    private static final SubLString $ic533$;
    private static final SubLSymbol $ic534$;
    private static final SubLString $ic535$;
    private static final SubLString $ic536$;
    private static final SubLString $ic537$;
    private static final SubLString $ic538$;
    private static final SubLSymbol $ic539$;
    private static final SubLString $ic540$;
    private static final SubLString $ic541$;
    private static final SubLSymbol $ic542$;
    private static final SubLSymbol $ic543$;
    private static final SubLString $ic544$;
    private static final SubLString $ic545$;
    private static final SubLString $ic546$;
    private static final SubLString $ic547$;
    private static final SubLString $ic548$;
    private static final SubLString $ic549$;
    private static final SubLString $ic550$;
    private static final SubLSymbol $ic551$;
    private static final SubLSymbol $ic552$;
    private static final SubLSymbol $ic553$;
    private static final SubLSymbol $ic554$;
    private static final SubLFloat $ic555$;
    private static final SubLInteger $ic556$;
    private static final SubLSymbol $ic557$;
    private static final SubLString $ic558$;
    private static final SubLObject $ic559$;
    private static final SubLList $ic560$;
    private static final SubLString $ic561$;
    private static final SubLString $ic562$;
    private static final SubLString $ic563$;
    private static final SubLString $ic564$;
    private static final SubLString $ic565$;
    private static final SubLSymbol $ic566$;
    private static final SubLSymbol $ic567$;
    private static final SubLList $ic568$;
    private static final SubLSymbol $ic569$;
    private static final SubLSymbol $ic570$;
    private static final SubLSymbol $ic571$;
    private static final SubLSymbol $ic572$;
    private static final SubLSymbol $ic573$;
    private static final SubLSymbol $ic574$;
    private static final SubLObject $ic575$;
    private static final SubLString $ic576$;
    private static final SubLString $ic577$;
    private static final SubLString $ic578$;
    private static final SubLInteger $ic579$;
    private static final SubLString $ic580$;
    private static final SubLString $ic581$;
    private static final SubLString $ic582$;
    private static final SubLSymbol $ic583$;
    private static final SubLSymbol $ic584$;
    private static final SubLString $ic585$;
    private static final SubLString $ic586$;
    private static final SubLSymbol $ic587$;
    private static final SubLSymbol $ic588$;
    private static final SubLString $ic589$;
    private static final SubLString $ic590$;
    private static final SubLString $ic591$;
    private static final SubLString $ic592$;
    private static final SubLSymbol $ic593$;
    private static final SubLString $ic594$;
    private static final SubLSymbol $ic595$;
    private static final SubLString $ic596$;
    private static final SubLSymbol $ic597$;
    private static final SubLString $ic598$;
    private static final SubLString $ic599$;
    private static final SubLString $ic600$;
    private static final SubLSymbol $ic601$;
    private static final SubLString $ic602$;
    private static final SubLString $ic603$;
    private static final SubLSymbol $ic604$;
    private static final SubLString $ic605$;
    private static final SubLSymbol $ic606$;
    private static final SubLSymbol $ic607$;
    private static final SubLSymbol $ic608$;
    private static final SubLString $ic609$;
    private static final SubLSymbol $ic610$;
    private static final SubLString $ic611$;
    private static final SubLSymbol $ic612$;
    private static final SubLString $ic613$;
    private static final SubLString $ic614$;
    private static final SubLSymbol $ic615$;
    private static final SubLString $ic616$;
    private static final SubLString $ic617$;
    private static final SubLSymbol $ic618$;
    private static final SubLString $ic619$;
    private static final SubLSymbol $ic620$;
    private static final SubLString $ic621$;
    private static final SubLSymbol $ic622$;
    private static final SubLString $ic623$;
    private static final SubLString $ic624$;
    private static final SubLSymbol $ic625$;
    private static final SubLSymbol $ic626$;
    private static final SubLString $ic627$;
    private static final SubLString $ic628$;
    private static final SubLSymbol $ic629$;
    private static final SubLSymbol $ic630$;
    private static final SubLString $ic631$;
    private static final SubLSymbol $ic632$;
    private static final SubLSymbol $ic633$;
    private static final SubLString $ic634$;
    private static final SubLSymbol $ic635$;
    private static final SubLSymbol $ic636$;
    private static final SubLString $ic637$;
    private static final SubLString $ic638$;
    private static final SubLSymbol $ic639$;
    private static final SubLSymbol $ic640$;
    private static final SubLSymbol $ic641$;
    private static final SubLString $ic642$;
    private static final SubLString $ic643$;
    private static final SubLSymbol $ic644$;
    private static final SubLSymbol $ic645$;
    private static final SubLSymbol $ic646$;
    private static final SubLString $ic647$;
    private static final SubLSymbol $ic648$;
    private static final SubLSymbol $ic649$;
    private static final SubLString $ic650$;
    private static final SubLInteger $ic651$;
    private static final SubLSymbol $ic652$;
    private static final SubLString $ic653$;
    private static final SubLString $ic654$;
    private static final SubLString $ic655$;
    private static final SubLSymbol $ic656$;
    private static final SubLSymbol $ic657$;
    private static final SubLSymbol $ic658$;
    private static final SubLString $ic659$;
    private static final SubLString $ic660$;
    private static final SubLSymbol $ic661$;
    private static final SubLSymbol $ic662$;
    private static final SubLString $ic663$;
    private static final SubLString $ic664$;
    private static final SubLSymbol $ic665$;
    private static final SubLSymbol $ic666$;
    private static final SubLList $ic667$;
    private static final SubLSymbol $ic668$;
    private static final SubLString $ic669$;
    private static final SubLString $ic670$;
    private static final SubLSymbol $ic671$;
    private static final SubLString $ic672$;
    private static final SubLString $ic673$;
    private static final SubLString $ic674$;
    private static final SubLSymbol $ic675$;
    private static final SubLSymbol $ic676$;
    private static final SubLString $ic677$;
    private static final SubLSymbol $ic678$;
    private static final SubLString $ic679$;
    private static final SubLString $ic680$;
    private static final SubLString $ic681$;
    private static final SubLString $ic682$;
    private static final SubLString $ic683$;
    private static final SubLString $ic684$;
    private static final SubLString $ic685$;
    private static final SubLString $ic686$;
    private static final SubLSymbol $ic687$;
    private static final SubLSymbol $ic688$;
    private static final SubLSymbol $ic689$;
    private static final SubLSymbol $ic690$;
    private static final SubLSymbol $ic691$;
    private static final SubLString $ic692$;
    private static final SubLSymbol $ic693$;
    private static final SubLSymbol $ic694$;
    private static final SubLSymbol $ic695$;
    private static final SubLSymbol $ic696$;
    private static final SubLString $ic697$;
    private static final SubLString $ic698$;
    private static final SubLString $ic699$;
    private static final SubLString $ic700$;
    private static final SubLString $ic701$;
    private static final SubLString $ic702$;
    private static final SubLSymbol $ic703$;
    private static final SubLString $ic704$;
    private static final SubLSymbol $ic705$;
    private static final SubLSymbol $ic706$;
    private static final SubLSymbol $ic707$;
    private static final SubLSymbol $ic708$;
    private static final SubLString $ic709$;
    private static final SubLSymbol $ic710$;
    private static final SubLString $ic711$;
    private static final SubLString $ic712$;
    private static final SubLString $ic713$;
    private static final SubLString $ic714$;
    private static final SubLString $ic715$;
    private static final SubLString $ic716$;
    private static final SubLSymbol $ic717$;
    private static final SubLSymbol $ic718$;
    private static final SubLSymbol $ic719$;
    private static final SubLString $ic720$;
    private static final SubLSymbol $ic721$;
    private static final SubLString $ic722$;
    private static final SubLString $ic723$;
    private static final SubLString $ic724$;
    private static final SubLString $ic725$;
    private static final SubLString $ic726$;
    private static final SubLString $ic727$;
    private static final SubLString $ic728$;
    private static final SubLString $ic729$;
    private static final SubLString $ic730$;
    private static final SubLString $ic731$;
    private static final SubLString $ic732$;
    private static final SubLString $ic733$;
    private static final SubLString $ic734$;
    private static final SubLString $ic735$;
    private static final SubLString $ic736$;
    private static final SubLSymbol $ic737$;
    private static final SubLInteger $ic738$;
    private static final SubLString $ic739$;
    private static final SubLString $ic740$;
    private static final SubLString $ic741$;
    private static final SubLString $ic742$;
    private static final SubLString $ic743$;
    private static final SubLString $ic744$;
    private static final SubLSymbol $ic745$;
    private static final SubLString $ic746$;
    private static final SubLString $ic747$;
    private static final SubLSymbol $ic748$;
    private static final SubLSymbol $ic749$;
    private static final SubLSymbol $ic750$;
    private static final SubLString $ic751$;
    private static final SubLSymbol $ic752$;
    private static final SubLSymbol $ic753$;
    private static final SubLString $ic754$;
    private static final SubLSymbol $ic755$;
    private static final SubLString $ic756$;
    private static final SubLSymbol $ic757$;
    private static final SubLString $ic758$;
    private static final SubLString $ic759$;
    private static final SubLString $ic760$;
    private static final SubLString $ic761$;
    private static final SubLString $ic762$;
    private static final SubLString $ic763$;
    private static final SubLSymbol $ic764$;
    private static final SubLString $ic765$;
    private static final SubLString $ic766$;
    private static final SubLString $ic767$;
    private static final SubLString $ic768$;
    private static final SubLSymbol $ic769$;
    private static final SubLString $ic770$;
    private static final SubLString $ic771$;
    private static final SubLString $ic772$;
    private static final SubLList $ic773$;
    private static final SubLSymbol $ic774$;
    private static final SubLString $ic775$;
    private static final SubLString $ic776$;
    private static final SubLSymbol $ic777$;
    private static final SubLSymbol $ic778$;
    private static final SubLString $ic779$;
    private static final SubLString $ic780$;
    private static final SubLString $ic781$;
    private static final SubLString $ic782$;
    private static final SubLString $ic783$;
    private static final SubLString $ic784$;
    private static final SubLString $ic785$;
    private static final SubLString $ic786$;
    private static final SubLString $ic787$;
    private static final SubLString $ic788$;
    private static final SubLString $ic789$;
    private static final SubLString $ic790$;
    private static final SubLString $ic791$;
    private static final SubLInteger $ic792$;
    private static final SubLString $ic793$;
    private static final SubLString $ic794$;
    private static final SubLInteger $ic795$;
    private static final SubLInteger $ic796$;
    private static final SubLInteger $ic797$;
    private static final SubLSymbol $ic798$;
    private static final SubLSymbol $ic799$;
    private static final SubLList $ic800$;
    private static final SubLSymbol $ic801$;
    private static final SubLString $ic802$;
    private static final SubLSymbol $ic803$;
    private static final SubLString $ic804$;
    private static final SubLList $ic805$;
    private static final SubLString $ic806$;
    private static final SubLString $ic807$;
    private static final SubLSymbol $ic808$;
    private static final SubLSymbol $ic809$;
    private static final SubLSymbol $ic810$;
    private static final SubLList $ic811$;
    private static final SubLSymbol $ic812$;
    private static final SubLSymbol $ic813$;
    private static final SubLString $ic814$;
    private static final SubLString $ic815$;
    private static final SubLSymbol $ic816$;
    private static final SubLSymbol $ic817$;
    private static final SubLString $ic818$;
    private static final SubLString $ic819$;
    private static final SubLString $ic820$;
    private static final SubLString $ic821$;
    private static final SubLString $ic822$;
    private static final SubLString $ic823$;
    private static final SubLString $ic824$;
    private static final SubLString $ic825$;
    private static final SubLString $ic826$;
    private static final SubLString $ic827$;
    private static final SubLString $ic828$;
    private static final SubLSymbol $ic829$;
    private static final SubLList $ic830$;
    private static final SubLString $ic831$;
    private static final SubLSymbol $ic832$;
    private static final SubLString $ic833$;
    private static final SubLSymbol $ic834$;
    private static final SubLSymbol $ic835$;
    private static final SubLString $ic836$;
    private static final SubLString $ic837$;
    private static final SubLString $ic838$;
    private static final SubLSymbol $ic839$;
    private static final SubLSymbol $ic840$;
    private static final SubLString $ic841$;
    private static final SubLSymbol $ic842$;
    private static final SubLSymbol $ic843$;
    private static final SubLString $ic844$;
    private static final SubLString $ic845$;
    private static final SubLString $ic846$;
    private static final SubLString $ic847$;
    private static final SubLString $ic848$;
    private static final SubLString $ic849$;
    private static final SubLString $ic850$;
    private static final SubLString $ic851$;
    private static final SubLString $ic852$;
    private static final SubLString $ic853$;
    private static final SubLString $ic854$;
    private static final SubLString $ic855$;
    private static final SubLSymbol $ic856$;
    private static final SubLString $ic857$;
    private static final SubLList $ic858$;
    private static final SubLSymbol $ic859$;
    private static final SubLSymbol $ic860$;
    private static final SubLString $ic861$;
    private static final SubLSymbol $ic862$;
    private static final SubLString $ic863$;
    private static final SubLString $ic864$;
    private static final SubLString $ic865$;
    private static final SubLSymbol $ic866$;
    private static final SubLList $ic867$;
    private static final SubLString $ic868$;
    private static final SubLInteger $ic869$;
    private static final SubLString $ic870$;
    private static final SubLString $ic871$;
    private static final SubLString $ic872$;
    private static final SubLString $ic873$;
    private static final SubLString $ic874$;
    private static final SubLString $ic875$;
    private static final SubLString $ic876$;
    private static final SubLString $ic877$;
    private static final SubLString $ic878$;
    private static final SubLSymbol $ic879$;
    private static final SubLSymbol $ic880$;
    private static final SubLSymbol $ic881$;
    private static final SubLSymbol $ic882$;
    private static final SubLString $ic883$;
    private static final SubLSymbol $ic884$;
    private static final SubLString $ic885$;
    private static final SubLString $ic886$;
    private static final SubLSymbol $ic887$;
    private static final SubLString $ic888$;
    private static final SubLSymbol $ic889$;
    private static final SubLSymbol $ic890$;
    private static final SubLString $ic891$;
    private static final SubLSymbol $ic892$;
    private static final SubLSymbol $ic893$;
    private static final SubLString $ic894$;
    private static final SubLSymbol $ic895$;
    private static final SubLSymbol $ic896$;
    private static final SubLString $ic897$;
    private static final SubLSymbol $ic898$;
    private static final SubLSymbol $ic899$;
    private static final SubLString $ic900$;
    private static final SubLSymbol $ic901$;
    private static final SubLSymbol $ic902$;
    private static final SubLString $ic903$;
    private static final SubLSymbol $ic904$;
    private static final SubLList $ic905$;
    private static final SubLString $ic906$;
    private static final SubLString $ic907$;
    private static final SubLSymbol $ic908$;
    private static final SubLString $ic909$;
    private static final SubLString $ic910$;
    private static final SubLSymbol $ic911$;
    private static final SubLSymbol $ic912$;
    private static final SubLSymbol $ic913$;
    private static final SubLString $ic914$;
    private static final SubLString $ic915$;
    private static final SubLSymbol $ic916$;
    private static final SubLString $ic917$;
    private static final SubLString $ic918$;
    private static final SubLSymbol $ic919$;
    private static final SubLString $ic920$;
    private static final SubLString $ic921$;
    private static final SubLSymbol $ic922$;
    private static final SubLString $ic923$;
    private static final SubLString $ic924$;
    private static final SubLSymbol $ic925$;
    private static final SubLString $ic926$;
    private static final SubLSymbol $ic927$;
    private static final SubLString $ic928$;
    private static final SubLSymbol $ic929$;
    private static final SubLSymbol $ic930$;
    private static final SubLList $ic931$;
    private static final SubLString $ic932$;
    private static final SubLSymbol $ic933$;
    private static final SubLString $ic934$;
    private static final SubLSymbol $ic935$;
    private static final SubLSymbol $ic936$;
    private static final SubLString $ic937$;
    private static final SubLString $ic938$;
    private static final SubLSymbol $ic939$;
    private static final SubLSymbol $ic940$;
    private static final SubLString $ic941$;
    private static final SubLString $ic942$;
    private static final SubLSymbol $ic943$;
    private static final SubLSymbol $ic944$;
    private static final SubLSymbol $ic945$;
    private static final SubLString $ic946$;
    private static final SubLString $ic947$;
    private static final SubLSymbol $ic948$;
    private static final SubLSymbol $ic949$;
    private static final SubLSymbol $ic950$;
    private static final SubLString $ic951$;
    private static final SubLString $ic952$;
    private static final SubLSymbol $ic953$;
    private static final SubLSymbol $ic954$;
    private static final SubLString $ic955$;
    private static final SubLString $ic956$;
    private static final SubLSymbol $ic957$;
    private static final SubLSymbol $ic958$;
    private static final SubLSymbol $ic959$;
    private static final SubLSymbol $ic960$;
    private static final SubLSymbol $ic961$;
    private static final SubLSymbol $ic962$;
    private static final SubLSymbol $ic963$;
    private static final SubLSymbol $ic964$;
    private static final SubLSymbol $ic965$;
    private static final SubLString $ic966$;
    private static final SubLString $ic967$;
    private static final SubLString $ic968$;
    private static final SubLString $ic969$;
    private static final SubLString $ic970$;
    private static final SubLString $ic971$;
    private static final SubLString $ic972$;
    private static final SubLString $ic973$;
    private static final SubLString $ic974$;
    private static final SubLSymbol $ic975$;
    private static final SubLList $ic976$;
    private static final SubLList $ic977$;
    private static final SubLSymbol $ic978$;
    private static final SubLSymbol $ic979$;
    private static final SubLSymbol $ic980$;
    private static final SubLSymbol $ic981$;
    private static final SubLString $ic982$;
    private static final SubLSymbol $ic983$;
    private static final SubLSymbol $ic984$;
    private static final SubLString $ic985$;
    private static final SubLString $ic986$;
    private static final SubLString $ic987$;
    private static final SubLString $ic988$;
    private static final SubLString $ic989$;
    private static final SubLString $ic990$;
    private static final SubLString $ic991$;
    private static final SubLString $ic992$;
    private static final SubLString $ic993$;
    private static final SubLString $ic994$;
    private static final SubLString $ic995$;
    private static final SubLString $ic996$;
    private static final SubLString $ic997$;
    private static final SubLString $ic998$;
    private static final SubLString $ic999$;
    private static final SubLSymbol $ic1000$;
    private static final SubLSymbol $ic1001$;
    private static final SubLString $ic1002$;
    private static final SubLString $ic1003$;
    private static final SubLString $ic1004$;
    private static final SubLSymbol $ic1005$;
    private static final SubLSymbol $ic1006$;
    private static final SubLSymbol $ic1007$;
    private static final SubLString $ic1008$;
    
    public static SubLObject f41670(final SubLObject var1) {
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var2 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var3 = oc_inference_datastructures_inference.f25422(var1);
        return Sequences.cconcatenate(module0006.f203(var2), new SubLObject[] { module0683.$ic1$, module0006.f203(var3) });
    }
    
    public static SubLObject f41671(final SubLObject var5) {
        if (var5.isString()) {
            final SubLObject var6 = module0038.f2752(var5, (SubLObject)module0683.$ic2$);
            if (module0683.NIL != module0035.f1995(var6, (SubLObject)module0683.TWO_INTEGER, (SubLObject)module0683.UNPROVIDED)) {
                SubLObject var8;
                final SubLObject var7 = var8 = var6;
                SubLObject var9 = (SubLObject)module0683.NIL;
                SubLObject var10 = (SubLObject)module0683.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0683.$ic3$);
                var9 = var8.first();
                var8 = var8.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0683.$ic3$);
                var10 = var8.first();
                var8 = var8.rest();
                if (module0683.NIL == var8) {
                    return f41672(var9, var10);
                }
                cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0683.$ic3$);
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41672(final SubLObject var9, final SubLObject var10) {
        if (module0683.NIL != module0038.f2727(var9) && module0683.NIL != module0038.f2727(var10)) {
            final SubLObject var11 = reader.parse_integer(var9, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var12 = reader.parse_integer(var10, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var13 = module0361.f24195(var11, var12);
            if (module0683.NIL != oc_inference_datastructures_inference.f25275(var13)) {
                return var13;
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41673(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        if (var17 == module0683.UNPROVIDED) {
            var17 = (SubLObject)module0683.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0683.NIL != var14) {
            if (var14.isString()) {
                final SubLObject var19 = module0644.f39202(var14, var15, var16, var17);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g389$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var19);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g390$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic4$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var18);
                    module0642.f39019(var13);
                }
                finally {
                    module0015.$g533$.rebind(var20, var18);
                }
                module0642.f39020(module0015.$g382$.getGlobalValue());
            }
        }
        else {
            module0642.f39019(var13);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41674(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        if (var17 == module0683.UNPROVIDED) {
            var17 = (SubLObject)module0683.NIL;
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        f41673(var13, var14, var15, var16, var17);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41675(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        if (var17 == module0683.UNPROVIDED) {
            var17 = (SubLObject)module0683.NIL;
        }
        return f41673(var13, var14, var15, var16, var17);
    }
    
    public static SubLObject f41676(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        if (var17 == module0683.UNPROVIDED) {
            var17 = (SubLObject)module0683.NIL;
        }
        return f41674(var13, var14, var15, var16, var17);
    }
    
    public static SubLObject f41677(final SubLObject var21, final SubLObject var22, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        if (var17 == module0683.UNPROVIDED) {
            var17 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (var14.isString()) {
            final SubLObject var24 = module0644.f39202(var14, var15, var16, var17);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_hash, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var21);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var25 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var25, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41678(SubLObject var23, SubLObject var14, SubLObject var24, SubLObject var25, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var23 == module0683.UNPROVIDED) {
            var23 = (SubLObject)module0683.NIL;
        }
        if (var14 == module0683.UNPROVIDED) {
            var14 = (SubLObject)module0683.NIL;
        }
        if (var24 == module0683.UNPROVIDED) {
            var24 = (SubLObject)module0683.NIL;
        }
        if (var25 == module0683.UNPROVIDED) {
            var25 = (SubLObject)module0683.NIL;
        }
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        if (var17 == module0683.UNPROVIDED) {
            var17 = (SubLObject)module0683.NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (var14.isString()) {
            final SubLObject var27 = module0644.f39202(var14, var15, var16, var17);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var26);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var26);
                module0642.f39074(var23, var24, var25);
            }
            finally {
                module0015.$g533$.rebind(var28, var26);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41679(SubLObject var23, SubLObject var14, SubLObject var26, SubLObject var24, SubLObject var25, SubLObject var15, SubLObject var16) {
        if (var23 == module0683.UNPROVIDED) {
            var23 = (SubLObject)module0683.NIL;
        }
        if (var14 == module0683.UNPROVIDED) {
            var14 = (SubLObject)module0683.NIL;
        }
        if (var26 == module0683.UNPROVIDED) {
            var26 = (SubLObject)module0683.NIL;
        }
        if (var24 == module0683.UNPROVIDED) {
            var24 = (SubLObject)module0683.NIL;
        }
        if (var25 == module0683.UNPROVIDED) {
            var25 = (SubLObject)module0683.NIL;
        }
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        final SubLObject var27 = f41680(var26);
        final SubLObject var28 = Sequences.cconcatenate(var14, new SubLObject[] { module0683.$ic5$, var27 });
        f41678(var23, var28, var24, var25, var15, var16, (SubLObject)module0683.T);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41681(final SubLObject var13, final SubLObject var14, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        final SubLObject var27 = f41680(var26);
        final SubLObject var28 = Sequences.cconcatenate(var14, new SubLObject[] { module0683.$ic5$, var27 });
        f41675(var13, var28, var15, var16, (SubLObject)module0683.T);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41682(final SubLObject var13, final SubLObject var14, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        final SubLObject var27 = f41680(var26);
        final SubLObject var28 = Sequences.cconcatenate(var14, new SubLObject[] { module0683.$ic5$, var27 });
        f41676(var13, var28, var15, var16, (SubLObject)module0683.T);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41683(final SubLObject var13, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        f41681(var13, (SubLObject)module0683.$ic6$, var26, var15, var16);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41684(final SubLObject var13, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == module0683.UNPROVIDED) {
            var15 = (SubLObject)module0683.NIL;
        }
        if (var16 == module0683.UNPROVIDED) {
            var16 = (SubLObject)module0683.NIL;
        }
        f41682(var13, (SubLObject)module0683.$ic6$, var26, var15, var16);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41685(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0683.NIL;
        SubLObject var34 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic7$);
        var33 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic7$);
        var34 = var32.first();
        var32 = var32.rest();
        final SubLObject var35 = (SubLObject)(var32.isCons() ? var32.first() : module0683.$ic8$);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)module0683.$ic7$);
        var32 = var32.rest();
        final SubLObject var36 = (SubLObject)(var32.isCons() ? var32.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)module0683.$ic7$);
        var32 = var32.rest();
        final SubLObject var37 = (SubLObject)(var32.isCons() ? var32.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)module0683.$ic7$);
        var32 = var32.rest();
        final SubLObject var38 = (SubLObject)(var32.isCons() ? var32.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)module0683.$ic7$);
        var32 = var32.rest();
        final SubLObject var39 = (SubLObject)(var32.isCons() ? var32.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)module0683.$ic7$);
        var32 = var32.rest();
        if (module0683.NIL == var32) {
            return (SubLObject)ConsesLow.list((SubLObject)module0683.$ic9$, var33, var34, var35, var36, var37, var38, var39);
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0683.$ic7$);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41686(final SubLObject var22, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0683.NIL != module0655.$g5078$.getDynamicValue(var27)) {
            final SubLObject var28 = (SubLObject)((module0683.NIL != module0655.$g5109$.getDynamicValue(var27)) ? module0683.$ic10$ : module0683.$ic11$);
            final SubLObject var29 = module0656.f39832(var28);
            final SubLObject var30 = f41687(var26);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39019(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var29) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var29);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var31 = module0015.$g533$.currentBinding(var27);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var27);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var31, var27);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        else {
            module0642.f39019(var22);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41688(final SubLObject var37, final SubLObject var38, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (var37.isZero()) {
            module0642.f39019((SubLObject)module0683.$ic14$);
        }
        else {
            if (!var37.numE(var38)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)module0683.$ic15$, var37);
            }
            if (!var38.isZero()) {
                if (!var37.numE(var38)) {
                    module0642.f39019((SubLObject)module0683.$ic16$);
                }
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)module0683.$ic17$, var38);
            }
            if (!var39.numE(var38)) {
                module0642.f39019((SubLObject)module0683.$ic16$);
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)module0683.$ic18$, var39, var39);
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41689(final SubLObject var1, SubLObject var40) {
        if (var40 == module0683.UNPROVIDED) {
            var40 = (SubLObject)module0683.T;
        }
        final SubLObject var41 = oc_inference_datastructures_inference.f25420(var1);
        final SubLObject var42 = oc_inference_datastructures_inference.f25433(var1);
        oc_cb_query_browser.f41965(var41);
        if (module0683.NIL != var40 && (var41 == module0683.$ic19$ || var41 == module0683.$ic20$) && module0683.NIL != var42) {
            module0642.f39032((SubLObject)module0683.UNPROVIDED);
            module0656.f39837((SubLObject)module0683.$ic21$, var1, (SubLObject)module0683.$ic22$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (var41 == module0683.$ic23$) {
            final SubLObject var42_43 = oc_inference_datastructures_inference.f25433(var1);
            module0642.f39019((SubLObject)module0683.$ic16$);
            oc_cb_query_browser.f41966(var42_43);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41680(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)module0683.NIL;
        SubLObject var29 = (SubLObject)module0683.NIL;
        try {
            var29 = streams_high.make_private_string_output_stream();
            final SubLObject var30 = module0015.$g131$.currentBinding(var27);
            try {
                module0015.$g131$.bind(var29, var27);
                module0656.f39837((SubLObject)module0683.$ic12$, (SubLObject)module0683.$ic24$, var26, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g131$.rebind(var30, var27);
            }
            var28 = streams_high.get_output_stream_string(var29);
        }
        finally {
            final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var27);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0683.T, var27);
                streams_high.close(var29, (SubLObject)module0683.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var31, var27);
            }
        }
        return var28;
    }
    
    public static SubLObject f41690() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(module0006.f203(module0110.$g127$.getDynamicValue(var18)), (SubLObject)module0683.$ic25$);
    }
    
    public static SubLObject f41687(final SubLObject var26) {
        return Sequences.cconcatenate(f41690(), new SubLObject[] { module0683.$g5353$.getGlobalValue(), module0683.$ic27$, var26 });
    }
    
    public static SubLObject f41691(final SubLObject var46) {
        return module0035.sublisp_boolean(module0067.f4884(module0683.$g5354$.getGlobalValue(), var46, (SubLObject)module0683.NIL));
    }
    
    public static SubLObject f41692(final SubLObject var46) {
        return conses_high.getf(module0067.f4884(module0683.$g5354$.getGlobalValue(), var46, (SubLObject)module0683.NIL), (SubLObject)module0683.$ic29$, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41693(final SubLObject var46) {
        return conses_high.getf(module0067.f4884(module0683.$g5354$.getGlobalValue(), var46, (SubLObject)module0683.NIL), (SubLObject)module0683.$ic30$, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41694(final SubLObject var46) {
        return conses_high.getf(module0067.f4884(module0683.$g5354$.getGlobalValue(), var46, (SubLObject)module0683.NIL), (SubLObject)module0683.$ic31$, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41695(final SubLObject var46) {
        return conses_high.getf(module0067.f4884(module0683.$g5354$.getGlobalValue(), var46, (SubLObject)module0683.NIL), (SubLObject)module0683.$ic32$, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41696(final SubLObject var46) {
        return conses_high.getf(module0067.f4884(module0683.$g5354$.getGlobalValue(), var46, (SubLObject)module0683.NIL), (SubLObject)module0683.$ic33$, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41697(SubLObject var47, final SubLObject var48) {
        var47 = (var47.isNumber() ? Numbers.multiply(var47, f41695(var48)) : var47);
        if (var47.isNumber() && module0683.NIL != f41696(var48)) {
            var47 = Numbers.round(var47, (SubLObject)module0683.UNPROVIDED);
        }
        return var47;
    }
    
    public static SubLObject f41698(final SubLObject var47, final SubLObject var48) {
        return var47.isNumber() ? Numbers.divide(var47, f41695(var48)) : var47;
    }
    
    public static SubLObject f41699(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic34$);
        var33 = var32.first();
        var32 = var32.rest();
        SubLObject var34 = (SubLObject)module0683.NIL;
        SubLObject var35 = var32;
        SubLObject var36 = (SubLObject)module0683.NIL;
        SubLObject var55_56 = (SubLObject)module0683.NIL;
        while (module0683.NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)module0683.$ic34$);
            var55_56 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)module0683.$ic34$);
            if (module0683.NIL == conses_high.member(var55_56, (SubLObject)module0683.$ic35$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED)) {
                var36 = (SubLObject)module0683.T;
            }
            if (var55_56 == module0683.$ic36$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (module0683.NIL != var36 && module0683.NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0683.$ic34$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic29$, var32);
        final SubLObject var38 = (SubLObject)((module0683.NIL != var37) ? conses_high.cadr(var37) : module0683.NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic30$, var32);
        final SubLObject var40 = (SubLObject)((module0683.NIL != var39) ? conses_high.cadr(var39) : module0683.NIL);
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic31$, var32);
        final SubLObject var42 = (SubLObject)((module0683.NIL != var41) ? conses_high.cadr(var41) : module0683.NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic32$, var32);
        final SubLObject var44 = (SubLObject)((module0683.NIL != var43) ? conses_high.cadr(var43) : module0683.NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic33$, var32);
        final SubLObject var46 = (SubLObject)((module0683.NIL != var45) ? conses_high.cadr(var45) : module0683.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)module0683.$ic37$, var33, var38, var40, (SubLObject)ConsesLow.list((SubLObject)module0683.$ic38$, var42), var44, var46);
    }
    
    public static SubLObject f41700(final SubLObject var51, SubLObject var58, SubLObject var60, SubLObject var62, SubLObject var64, final SubLObject var66) {
        assert module0683.NIL != Types.keywordp(var51) : var51;
        if (!var58.isString()) {
            var58 = print_high.prin1_to_string(var51);
        }
        if (!var60.isString()) {
            var60 = (SubLObject)module0683.$ic6$;
        }
        if (!var62.isCons()) {
            var62 = (SubLObject)module0683.$ic42$;
        }
        if (!var64.isNumber()) {
            var64 = (SubLObject)module0683.ONE_INTEGER;
        }
        final SubLObject var67 = (SubLObject)ConsesLow.list(new SubLObject[] { module0683.$ic29$, var58, module0683.$ic30$, var60, module0683.$ic31$, var62, module0683.$ic32$, var64, module0683.$ic33$, var66 });
        module0067.f4886(module0683.$g5354$.getGlobalValue(), var51, var67);
        return var51;
    }
    
    public static SubLObject f41701(final SubLObject var48, final SubLObject var47, final SubLObject var68) {
        SubLObject var69 = (SubLObject)module0683.NIL;
        SubLObject var70 = (SubLObject)module0683.NIL;
        SubLObject var71 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var68, var68, (SubLObject)module0683.$ic43$);
        var69 = var68.first();
        SubLObject var72 = var68.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var72, var68, (SubLObject)module0683.$ic43$);
        var70 = var72.first();
        var72 = var72.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var72, var68, (SubLObject)module0683.$ic43$);
        var71 = var72.first();
        var72 = var72.rest();
        if (module0683.NIL != var72) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)module0683.$ic43$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var73 = var69;
        if (var73.eql((SubLObject)module0683.$ic44$)) {
            return module0035.f2417(var70, var47);
        }
        if (var73.eql((SubLObject)module0683.$ic45$)) {
            return Functions.funcall(var70, var47);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41702(final SubLObject var73, final SubLObject var74, final SubLObject var75, final SubLObject var76, SubLObject var77) {
        final SubLObject var78 = oc_inference_datastructures_inference.f25421(var73);
        var77 = conses_high.putf(conses_high.copy_list(var77), (SubLObject)module0683.$ic190$, var78);
        return f41703(var74, var75, var76, var77);
    }
    
    public static SubLObject f41703(final SubLObject var74, final SubLObject var75, final SubLObject var76, SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = module0360.f23800(var77);
        if (module0683.NIL != var76) {
            var79 = conses_high.putf(conses_high.copy_list(var79), (SubLObject)module0683.$ic191$, var76);
            var77 = conses_high.putf(conses_high.copy_list(var77), (SubLObject)module0683.$ic191$, var76);
        }
        var78.resetMultipleValues();
        final SubLObject var80 = module0279.f18576(var74, var75);
        final SubLObject var81 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        if (module0683.NIL != module0408.f28423(var80)) {
            var79 = conses_high.putf(conses_high.copy_list(var79), (SubLObject)module0683.$ic192$, (SubLObject)module0683.T);
            var77 = conses_high.putf(conses_high.copy_list(var77), (SubLObject)module0683.$ic192$, (SubLObject)module0683.T);
        }
        module0658.f40058(var80, var81, var77);
        final SubLObject var82 = module0409.f28515(var80, var81, var79);
        if (module0683.NIL != oc_inference_datastructures_inference.f25431(var82)) {
            return f41704(var82, var77);
        }
        return var82;
    }
    
    public static SubLObject f41704(final SubLObject var73, final SubLObject var77) {
        final SubLObject var78 = module0360.f23805(var77);
        final SubLObject var79 = f41705();
        final SubLObject var80 = Semaphores.new_semaphore((SubLObject)module0683.$ic193$, (SubLObject)module0683.ZERO_INTEGER);
        module0004.f78((SubLObject)module0683.$ic194$, (SubLObject)module0683.$ic195$, (SubLObject)ConsesLow.list(var73, var78, var79, var80));
        Semaphores.semaphore_wait(var80);
        return var73;
    }
    
    public static SubLObject f41705() {
        return module0091.f6334(module0012.$g53$.getGlobalValue());
    }
    
    public static SubLObject f41706(final SubLObject var1, final SubLObject var86, final SubLObject var84, final SubLObject var85) {
        final SubLThread var87 = SubLProcess.currentSubLThread();
        final SubLObject var88 = Packages.$package$.currentBinding(var87);
        final SubLObject var89 = print_high.$print_readably$.currentBinding(var87);
        final SubLObject var90 = reader.$read_eval$.currentBinding(var87);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)module0683.$ic196$), var87);
            print_high.$print_readably$.bind((SubLObject)module0683.NIL, var87);
            reader.$read_eval$.bind((SubLObject)module0683.NIL, var87);
            assert module0683.NIL != module0091.f6325(var84) : var84;
            final SubLObject var91 = module0091.f6339(var84);
            final ArrayList var92 = Dynamic.extract_dynamic_values(var91);
            try {
                Dynamic.bind_dynamic_vars(var91, module0091.f6340(var84));
                Semaphores.semaphore_signal(var85);
                if (module0683.NIL != oc_inference_datastructures_inference.f25417(var1)) {
                    module0409.f28521(var1, var86);
                }
            }
            finally {
                Dynamic.rebind_dynamic_vars(var91, var92);
            }
        }
        finally {
            reader.$read_eval$.rebind(var90, var87);
            print_high.$print_readably$.rebind(var89, var87);
            Packages.$package$.rebind(var88, var87);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41707() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        f41708();
        return module0683.$g5356$.getDynamicValue(var18);
    }
    
    public static SubLObject f41709(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic199$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic199$);
        var34 = var32.first();
        var32 = var32.rest();
        if (module0683.NIL == var32) {
            final SubLObject var35;
            var32 = (var35 = var33);
            return (SubLObject)ConsesLow.list((SubLObject)module0683.$ic200$, reader.bq_cons(var34, (SubLObject)module0683.$ic201$), (SubLObject)ConsesLow.listS((SubLObject)module0683.$ic202$, var34, ConsesLow.append(var35, (SubLObject)module0683.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0683.$ic199$);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41710(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic203$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)module0683.NIL;
        SubLObject var35 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic203$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)module0683.$ic203$);
        var35 = var32.first();
        var32 = var32.rest();
        if (module0683.NIL == var32) {
            final SubLObject var36;
            var32 = (var36 = var33);
            return (SubLObject)ConsesLow.listS((SubLObject)module0683.$ic204$, (SubLObject)ConsesLow.list((SubLObject)module0683.$ic205$, var34, (SubLObject)module0683.$ic206$, var35), (SubLObject)module0683.$ic207$, ConsesLow.append(var36, (SubLObject)module0683.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)module0683.$ic203$);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41711() {
        SubLObject var102;
        final SubLObject var101 = var102 = f41707();
        final SubLObject var103 = (SubLObject)(var102.isCons() ? var102.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var102, var101, (SubLObject)module0683.$ic208$);
        final SubLObject var104;
        var102 = (var104 = var102.rest());
        return var103;
    }
    
    public static SubLObject f41712(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f41713((SubLObject)module0683.NIL);
        f41713(var1);
        module0683.$g5356$.setDynamicValue((SubLObject)ConsesLow.cons(var1, module0683.$g5356$.getDynamicValue(var2)), var2);
        f41714();
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41715() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        f41713((SubLObject)module0683.NIL);
        module0683.$g5356$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)module0683.NIL, module0683.$g5356$.getDynamicValue(var18)), var18);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41716(final SubLObject var6) {
        SubLObject var7 = (SubLObject)module0683.ZERO_INTEGER;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)module0683.NIL;
        var9 = var8.first();
        while (module0683.NIL != var8) {
            final SubLObject var10 = module0361.f24195(var9, (SubLObject)module0683.ZERO_INTEGER);
            if (module0683.NIL != oc_inference_datastructures_inference.f25417(var10)) {
                var7 = Numbers.add(var7, (SubLObject)module0683.ONE_INTEGER);
                f41712(var10);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f41713(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0683.$g5356$.setDynamicValue(Sequences.delete(var1, module0683.$g5356$.getDynamicValue(var2), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var2);
        return (SubLObject)module0683.T;
    }
    
    public static SubLObject f41708() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        module0683.$g5356$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0683.$ic209$), module0683.$g5356$.getDynamicValue(var18), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var18);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41717(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0684.f41927(var1);
        module0686.f42034(var1);
        SubLObject var3 = (SubLObject)module0683.NIL;
        try {
            var2.throwStack.push(module0683.$ic210$);
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var2);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0683.$ic211$), var2);
                try {
                    try {
                        if (module0683.NIL != oc_inference_datastructures_inference.f25417(var1)) {
                            final SubLObject var5 = oc_inference_datastructures_inference.f25421(var1);
                            if (module0683.ONE_INTEGER.numE(module0361.f24191(var5))) {
                                module0361.f24005(var5);
                            }
                            else {
                                oc_inference_datastructures_inference.f25471(var1);
                            }
                        }
                    }
                    finally {
                        final SubLObject var20_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0683.T, var2);
                            f41713(var1);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var20_108, var2);
                        }
                    }
                }
                catch (Throwable var6) {
                    Errors.handleThrowable(var6, (SubLObject)module0683.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var4, var2);
            }
        }
        catch (Throwable var7) {
            var3 = Errors.handleThrowable(var7, (SubLObject)module0683.$ic210$);
        }
        finally {
            var2.throwStack.pop();
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41714() {
        SubLObject var112;
        final SubLObject var111 = var112 = f41707();
        final SubLObject var113 = (SubLObject)(var112.isCons() ? var112.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var112, var111, (SubLObject)module0683.$ic208$);
        final SubLObject var114;
        var112 = (var114 = var112.rest());
        f41718(var114);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41718(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (module0683.NIL != module0048.f3328(module0655.$g5093$.getDynamicValue(var101))) {
            return (SubLObject)module0683.NIL;
        }
        if (module0683.NIL != module0035.f1993(var100, module0655.$g5093$.getDynamicValue(var101), (SubLObject)module0683.UNPROVIDED)) {
            return (SubLObject)module0683.NIL;
        }
        SubLObject var102 = (SubLObject)module0683.NIL;
        SubLObject var103 = (SubLObject)module0683.NIL;
        SubLObject var104 = (SubLObject)module0683.NIL;
        var102 = var100;
        var103 = var102.first();
        for (var104 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var102; var102 = var102.rest(), var103 = var102.first(), var104 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var104)) {
            if (var104.numGE(module0655.$g5093$.getDynamicValue(var101))) {
                f41717(var103);
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41719(final SubLObject var1) {
        if (module0683.NIL != oc_inference_datastructures_inference.f25417(var1)) {
            module0414.f28933(var1, (SubLObject)module0683.$ic212$);
            return var1;
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41720(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41722(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic216$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic217$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            if (module0683.NIL != module0014.f695((SubLObject)module0683.$ic214$)) {
                final SubLObject var26 = module0014.f697((SubLObject)module0683.$ic214$);
                final SubLObject var27 = (SubLObject)module0683.$ic218$;
                final SubLObject var28 = module0014.f694((SubLObject)module0683.$ic214$);
                final SubLObject var29 = (SubLObject)module0683.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != var28) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(var28);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                if (module0683.NIL != var27) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var27));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                if (module0683.NIL != var29) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(var29);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_122 = module0015.$g533$.currentBinding(var23);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var23);
                }
                finally {
                    module0015.$g533$.rebind(var20_122, var23);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39067();
            }
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41721(SubLObject var123) {
        if (var123 == module0683.UNPROVIDED) {
            var123 = (SubLObject)module0683.NIL;
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f41708();
        SubLObject var126;
        final SubLObject var125 = var126 = f41707();
        final SubLObject var127 = (SubLObject)(var126.isCons() ? var126.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var126, var125, (SubLObject)module0683.$ic208$);
        final SubLObject var128;
        var126 = (var128 = var126.rest());
        final SubLObject var128_129;
        final SubLObject var126_127 = var128_129 = var123;
        final SubLObject var129 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic221$, var128_129);
        final SubLObject var130 = (SubLObject)((module0683.NIL != var129) ? conses_high.cadr(var129) : module0683.$ic222$);
        final SubLObject var131 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic223$, var128_129);
        final SubLObject var132 = (SubLObject)((module0683.NIL != var131) ? conses_high.cadr(var131) : module0683.NIL);
        final SubLObject var133 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic224$, var128_129);
        final SubLObject var134 = (SubLObject)((module0683.NIL != var133) ? conses_high.cadr(var133) : module0683.$ic225$);
        final SubLObject var135 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic226$, var128_129);
        final SubLObject var136 = (SubLObject)((module0683.NIL != var135) ? conses_high.cadr(var135) : module0683.$ic225$);
        final SubLObject var137 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic191$, var128_129);
        final SubLObject var138 = (SubLObject)((module0683.NIL != var137) ? conses_high.cadr(var137) : module0683.$ic225$);
        final SubLObject var139 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic227$, var128_129);
        final SubLObject var140 = (SubLObject)((module0683.NIL != var139) ? conses_high.cadr(var139) : module0683.$ic225$);
        final SubLObject var141 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic228$, var128_129);
        final SubLObject var142 = (SubLObject)((module0683.NIL != var141) ? conses_high.cadr(var141) : module0683.$ic225$);
        final SubLObject var143 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic229$, var128_129);
        final SubLObject var144 = (SubLObject)((module0683.NIL != var143) ? conses_high.cadr(var143) : module0683.$ic225$);
        final SubLObject var145 = module0015.$g538$.currentBinding(var124);
        try {
            module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var124))) ? module0015.$g538$.getDynamicValue(var124) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var124);
            module0642.f39020((SubLObject)module0683.$ic230$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var124), module0655.$g5142$.getDynamicValue(var124));
            final SubLObject var146 = module0014.f672((SubLObject)module0683.$ic231$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var146) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var146);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var130);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            if (module0683.NIL != var132) {
                module0642.f39055(var132);
            }
            module0666.f40471();
            module0016.f892();
            if (module0683.NIL != module0683.$g5357$.getDynamicValue(var124)) {
                f41723();
                f41724();
            }
            module0644.f39208();
            module0016.f895();
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_144 = module0015.$g535$.currentBinding(var124);
            try {
                module0015.$g535$.bind((SubLObject)module0683.T, var124);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_145 = module0015.$g533$.currentBinding(var124);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var124);
                    final SubLObject var147 = module0644.f39214(module0644.$g5024$.getGlobalValue());
                    final SubLObject var148 = module0656.f39832((SubLObject)module0683.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var124));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic235$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    if (module0683.NIL != var148) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(var148);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)module0683.ONE_INTEGER);
                    module0642.f39020(var147);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_146 = module0015.$g533$.currentBinding(var124);
                    final SubLObject var149 = module0015.$g541$.currentBinding(var124);
                    final SubLObject var150 = module0015.$g539$.currentBinding(var124);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var124);
                        module0015.$g541$.bind((SubLObject)module0683.T, var124);
                        module0015.$g539$.bind(module0015.f797(), var124);
                        module0642.f39069((SubLObject)module0683.$ic236$, (SubLObject)module0683.NIL, (SubLObject)module0683.UNPROVIDED);
                        f41725(var130);
                        module0644.f39197();
                        f41726(var127, var128);
                        if (module0683.NIL != var128) {
                            module0642.f39051((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            f41727(var127, var128);
                        }
                        if (module0683.NIL != var127) {
                            module0642.f39051((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            f41728(var134, var132, var127);
                        }
                        module0642.f39051((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        f41729(var134, var136, var138, var127, var128, var142, var144);
                        module0642.f39051((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        f41730(var127, var140);
                        if (module0683.NIL != f41731(var127, var140)) {
                            module0642.f39051((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            f41732(var127, var140);
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var124));
                    }
                    finally {
                        module0015.$g539$.rebind(var150, var124);
                        module0015.$g541$.rebind(var149, var124);
                        module0015.$g533$.rebind(var20_146, var124);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_145, var124);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_144, var124);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var145, var124);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41723() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = Environment.get_network_name((SubLObject)module0683.UNPROVIDED);
        final SubLObject var20 = module0110.$g1378$.getDynamicValue(var18);
        final SubLObject var21 = Sequences.cconcatenate(module0006.f203(var19), new SubLObject[] { module0683.$ic237$, module0006.f203(var20) });
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g166$.getGlobalValue());
        module0642.f39020(module0015.$g170$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic238$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var21) {
            module0642.f39020(module0015.$g168$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var21);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41724() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)module0683.$ic239$;
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic240$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(var19);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic241$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var18);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic232$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g178$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic242$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic233$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41725(final SubLObject var131) {
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        module0642.f39019(var131);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        module0656.f39870((SubLObject)module0683.$ic243$, (SubLObject)module0683.NIL, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41726(final SubLObject var99, final SubLObject var100) {
        if (module0683.NIL != var99 || module0683.NIL != var100 || module0683.NIL != module0674.f41242()) {
            module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
            f41676((SubLObject)module0683.$ic245$, (SubLObject)module0683.$ic246$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var99 && module0683.NIL != var100) {
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
                f41677((SubLObject)module0683.$ic247$, (SubLObject)module0683.$ic248$, (SubLObject)module0683.$ic249$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            if (module0683.NIL != var99 || module0683.NIL != var100) {
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
                f41677((SubLObject)module0683.$ic250$, (SubLObject)module0683.$ic251$, (SubLObject)module0683.$ic252$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            if (module0683.NIL != var99 || module0683.NIL != var100) {
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
                f41677((SubLObject)module0683.$ic253$, (SubLObject)module0683.$ic254$, (SubLObject)module0683.$ic255$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            if (module0683.NIL != module0674.f41242()) {
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
                f41677((SubLObject)module0683.$ic256$, (SubLObject)module0683.$ic257$, (SubLObject)module0683.$ic258$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41733(final SubLObject var1) {
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41734(final SubLObject var153) {
        SubLObject var154 = var153;
        SubLObject var155 = (SubLObject)module0683.NIL;
        var155 = var154.first();
        while (module0683.NIL != var154) {
            if (module0683.NIL != f41733(var155)) {
                return (SubLObject)module0683.T;
            }
            var154 = var154.rest();
            var155 = var154.first();
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41727(final SubLObject var99, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        module0016.f920((SubLObject)module0683.$ic259$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        final SubLObject var102 = (SubLObject)module0683.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0683.NIL != var102) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var102);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        SubLObject var103 = module0015.$g533$.currentBinding(var101);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var101);
            f41676((SubLObject)module0683.$ic262$, (SubLObject)module0683.$ic263$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var103, var101);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
        module0642.f39020(module0015.$g224$.getGlobalValue());
        module0642.f39020(module0015.$g459$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var101), (SubLObject)module0683.$ic264$, Sequences.length(var100));
        module0642.f39020(module0015.$g460$.getGlobalValue());
        module0642.f39020(module0015.$g225$.getGlobalValue());
        final SubLObject var104 = (SubLObject)((module0683.NIL != var99) ? module0683.$ic265$ : module0683.$ic266$);
        module0016.f908((SubLObject)module0683.$ic259$, var104, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic259$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        var103 = module0015.$g533$.currentBinding(var101);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var101);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.ONE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_156 = module0015.$g533$.currentBinding(var101);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var101);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_157 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_158 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var101);
                        module0642.f39021((SubLObject)module0683.$ic269$);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0656.f39837((SubLObject)module0683.$ic270$, (SubLObject)module0683.$ic271$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_158, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)module0683.NIL;
                    var106 = var105.first();
                    while (module0683.NIL != var105) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_159 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var101);
                            module0656.f39837((SubLObject)module0683.$ic272$, var106, (SubLObject)module0683.$ic273$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0656.f39837((SubLObject)module0683.$ic274$, var106, (SubLObject)module0683.$ic275$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_159, var101);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        var105 = var105.rest();
                        var106 = var105.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_157, var101);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_160 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_161 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var101);
                        module0642.f39021((SubLObject)module0683.$ic216$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_161, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)module0683.NIL;
                    var106 = var105.first();
                    while (module0683.NIL != var105) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_162 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var101);
                            oc_cb_query_browser.f41964(var106, (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_162, var101);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        var105 = var105.rest();
                        var106 = var105.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_160, var101);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_163 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_164 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var101);
                        module0642.f39021((SubLObject)module0683.$ic276$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_164, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)module0683.NIL;
                    var106 = var105.first();
                    while (module0683.NIL != var105) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_165 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var101);
                            f41689(var106, (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_165, var101);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        var105 = var105.rest();
                        var106 = var105.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_163, var101);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_166 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_167 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var101);
                        module0642.f39021((SubLObject)module0683.$ic277$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_167, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)module0683.NIL;
                    var106 = var105.first();
                    while (module0683.NIL != var105) {
                        final SubLObject var107 = oc_inference_datastructures_inference.f25653(var106);
                        final SubLObject var108 = oc_inference_datastructures_inference.f25663(var106);
                        final SubLObject var109 = oc_inference_datastructures_inference.f25665(var106);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_168 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var101);
                            f41688(var107, var108, var109);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_168, var101);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        var105 = var105.rest();
                        var106 = var105.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_166, var101);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var20_156, var101);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var103, var101);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41728(final SubLObject var74, final SubLObject var169, final SubLObject var99) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0683.$ic247$);
        final SubLObject var171 = oc_inference_datastructures_inference.f25583(var99);
        final SubLObject var172 = oc_inference_datastructures_inference.f25422(var99);
        module0642.f39069((SubLObject)module0683.$ic278$, var171, (SubLObject)module0683.UNPROVIDED);
        module0642.f39069((SubLObject)module0683.$ic279$, var172, (SubLObject)module0683.UNPROVIDED);
        module0016.f920((SubLObject)module0683.$ic279$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        final SubLObject var173 = (SubLObject)module0683.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0683.NIL != var173) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var173);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        SubLObject var174 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var170);
            f41676((SubLObject)module0683.$ic280$, (SubLObject)module0683.$ic249$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var174, var170);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
        module0642.f39021((SubLObject)module0683.$ic281$);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0656.f39837((SubLObject)module0683.$ic282$, var99, (SubLObject)module0683.$ic283$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0656.f39837((SubLObject)module0683.$ic274$, var99, (SubLObject)module0683.$ic275$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0656.f39837((SubLObject)module0683.$ic284$, var99, (SubLObject)module0683.$ic285$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0656.f39837((SubLObject)module0683.$ic286$, var99, (SubLObject)module0683.$ic287$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0656.f39837((SubLObject)module0683.$ic288$, var99, (SubLObject)module0683.$ic289$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0656.f39837((SubLObject)module0683.$ic290$, var99, (SubLObject)module0683.$ic291$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var175 = (SubLObject)((module0683.$ic225$ == var74) ? module0683.$ic266$ : module0683.$ic265$);
        module0016.f908((SubLObject)module0683.$ic279$, var175, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic279$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        var174 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var170);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            oc_cb_query_browser.f41964(var99, (SubLObject)module0683.UNPROVIDED);
            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
            f41735(var99, var169);
        }
        finally {
            module0015.$g533$.rebind(var174, var170);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41729(final SubLObject var74, final SubLObject var75, final SubLObject var76, final SubLObject var99, final SubLObject var100, SubLObject var140, SubLObject var142) {
        if (var140 == module0683.UNPROVIDED) {
            var140 = (SubLObject)module0683.NIL;
        }
        if (var142 == module0683.UNPROVIDED) {
            var142 = (SubLObject)module0683.NIL;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0683.$ic250$);
        if (module0683.NIL != var140 && var140 != module0683.$ic225$) {
            module0642.f39021((SubLObject)module0683.$ic292$);
            module0656.f39804(var140, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        }
        module0016.f920((SubLObject)module0683.$ic293$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        final SubLObject var144 = (SubLObject)module0683.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0683.NIL != var144) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var144);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        SubLObject var145 = module0015.$g533$.currentBinding(var143);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var143);
            f41676((SubLObject)module0683.$ic294$, (SubLObject)module0683.$ic252$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var145, var143);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
        f41736(var99, var140, var142);
        SubLObject var146 = (SubLObject)module0683.$ic266$;
        if (module0683.$ic225$ == var74 && ((module0683.NIL != var99 && module0683.$ic295$ == oc_inference_datastructures_inference.f25420(var99) && module0683.NIL == module0683.$g5352$.getGlobalValue()) || (module0683.NIL == var99 && module0683.NIL != var100))) {
            var146 = (SubLObject)module0683.$ic265$;
        }
        module0016.f908((SubLObject)module0683.$ic293$, var146, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic293$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        var145 = module0015.$g533$.currentBinding(var143);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var143);
            f41737(var74, var75, var99);
            f41738(var74, var99);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            f41739(var76, var99);
        }
        finally {
            module0015.$g533$.rebind(var145, var143);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41736(final SubLObject var99, SubLObject var140, SubLObject var142) {
        if (var140 == module0683.UNPROVIDED) {
            var140 = (SubLObject)module0683.NIL;
        }
        if (var142 == module0683.UNPROVIDED) {
            var142 = (SubLObject)module0683.NIL;
        }
        module0642.f39073((SubLObject)module0683.$ic296$);
        if (module0683.NIL != var99) {
            if (module0683.NIL != var99) {
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
                f41679((SubLObject)module0683.$ic297$, (SubLObject)module0683.$ic298$, (SubLObject)module0683.$ic299$, (SubLObject)module0683.$ic300$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39032((SubLObject)module0683.UNPROVIDED);
            f41678((SubLObject)module0683.$ic301$, (SubLObject)module0683.$ic302$, (SubLObject)module0683.$ic303$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        else {
            module0642.f39032((SubLObject)module0683.UNPROVIDED);
            f41678((SubLObject)module0683.$ic304$, (SubLObject)module0683.$ic302$, (SubLObject)module0683.$ic303$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var140 && var140 != module0683.$ic225$) {
            module0642.f39069((SubLObject)module0683.$ic305$, module0656.f39842(var140), (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var142 && var142 != module0683.$ic225$) {
            module0642.f39069((SubLObject)module0683.$ic306$, module0656.f39842(var142), (SubLObject)module0683.UNPROVIDED);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41740() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return module0683.$g5358$.getDynamicValue(var18);
    }
    
    public static SubLObject f41741() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0683.NIL != module0161.$g2154$.getDynamicValue(var18)) {
            return module0683.$g5359$.getDynamicValue(var18);
        }
        return module0683.$ic312$;
    }
    
    public static SubLObject f41742(final SubLObject var75) {
        module0683.$g5359$.setDynamicValue(module0161.f10551(var75));
        return f41741();
    }
    
    public static SubLObject f41737(final SubLObject var74, SubLObject var75, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0683.$ic314$);
        module0016.f920((SubLObject)module0683.$ic315$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g209$.getGlobalValue());
        module0642.f39019((SubLObject)module0683.$ic316$);
        module0642.f39020(module0015.$g210$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        final SubLObject var101 = (SubLObject)module0683.$ic265$;
        module0016.f908((SubLObject)module0683.$ic315$, var101, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic315$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var102 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var100);
            if (module0683.$ic225$ == var74) {
                if (module0683.NIL != var99) {
                    var75 = oc_inference_datastructures_inference.f25424(var99);
                }
                else {
                    var75 = f41741();
                }
            }
            else if (module0683.$ic225$ == var75) {
                var75 = (SubLObject)module0683.NIL;
            }
            else {
                var75 = var75;
            }
            final SubLObject var103 = (SubLObject)ConsesLow.list((SubLObject)module0683.$ic317$, module0683.$g5360$.getGlobalValue());
            module0657.f39992(var75, var103);
        }
        finally {
            module0015.$g533$.rebind(var102, var100);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41738(final SubLObject var74, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0683.$ic318$);
        final SubLObject var101 = f41743(var74, var99);
        final SubLObject var102 = (SubLObject)module0683.$ic319$;
        final SubLObject var103 = (SubLObject)module0683.TEN_INTEGER;
        final SubLObject var104 = (SubLObject)ConsesLow.list(new SubLObject[] { module0683.$ic320$, module0683.$ic321$, module0683.$ic322$, var102, module0683.$ic323$, var103, module0683.$ic324$, module0683.$ic325$, module0683.$ic326$, module0683.$ic327$, module0683.$ic328$, module0683.$ic329$, module0683.$ic330$, module0683.$ic214$ });
        final SubLObject var105 = Sequences.cconcatenate((SubLObject)module0683.$ic331$, module0006.f203(module0015.f793((SubLObject)module0683.UNPROVIDED)));
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (module0683.NIL != var105) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var105);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic332$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        SubLObject var106 = (SubLObject)ConsesLow.list((SubLObject)module0683.$ic334$, reader.bq_cons((SubLObject)module0683.$ic335$, var102), reader.bq_cons((SubLObject)module0683.$ic336$, var103));
        SubLObject var107 = (SubLObject)module0683.NIL;
        var107 = var106.first();
        while (module0683.NIL != var106) {
            SubLObject var109;
            final SubLObject var108 = var109 = var107;
            SubLObject var110 = (SubLObject)module0683.NIL;
            SubLObject var111 = (SubLObject)module0683.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)module0683.$ic333$);
            var110 = var109.first();
            var109 = (var111 = var109.rest());
            module0642.f39020(var110);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var111);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            var106 = var106.rest();
            var107 = var106.first();
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var112 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var100);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0657.f40017((SubLObject)((module0683.$ic225$ == var101) ? module0683.NIL : var101), var104);
        }
        finally {
            module0015.$g533$.rebind(var112, var100);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41739(final SubLObject var76, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = f41744(var76, var99);
        final SubLObject var102 = (SubLObject)((module0683.NIL != var101 && module0683.$ic225$ != var101) ? module0683.$ic266$ : module0683.$ic265$);
        module0016.f920((SubLObject)module0683.$ic337$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        f41676((SubLObject)module0683.$ic338$, (SubLObject)module0683.$ic339$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0016.f908((SubLObject)module0683.$ic337$, var102, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic337$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var103 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var100);
            final SubLObject var104 = (SubLObject)ConsesLow.list(new SubLObject[] { module0683.$ic320$, module0683.$ic340$, module0683.$ic324$, module0683.$ic325$, module0683.$ic326$, module0683.$ic327$, module0683.$ic328$, module0683.$ic329$, module0683.$ic323$, module0683.FIVE_INTEGER, module0683.$ic322$, module0683.$ic319$, module0683.$ic330$, module0683.$ic214$ });
            module0657.f40017((SubLObject)((module0683.$ic225$ == var101) ? module0683.NIL : var101), var104);
        }
        finally {
            module0015.$g533$.rebind(var103, var100);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41743(final SubLObject var179, final SubLObject var99) {
        final SubLObject var180 = (SubLObject)((module0683.NIL != var99) ? oc_inference_datastructures_inference.f25423(var99) : module0683.$ic225$);
        final SubLObject var181 = f41745(var179, var180);
        return var181;
    }
    
    public static SubLObject f41744(final SubLObject var179, final SubLObject var99) {
        final SubLObject var180 = (SubLObject)((module0683.NIL != var99 && module0683.NIL != oc_inference_datastructures_inference.f25482(var99)) ? oc_inference_datastructures_inference.f25482(var99) : module0683.$ic225$);
        final SubLObject var181 = f41745(var179, var180);
        return var181;
    }
    
    public static SubLObject f41745(final SubLObject var179, final SubLObject var180) {
        if (module0683.$ic225$ != var179) {
            return module0538.f33479(var179, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.$ic225$ != var180) {
            return module0538.f33479(var180, (SubLObject)module0683.UNPROVIDED);
        }
        return (SubLObject)module0683.$ic225$;
    }
    
    public static SubLObject f41730(final SubLObject var99, final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)module0683.$ic253$);
        module0016.f920((SubLObject)module0683.$ic342$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        final SubLObject var183 = (SubLObject)module0683.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0683.NIL != var183) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var183);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        SubLObject var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var182);
            f41676((SubLObject)module0683.$ic343$, (SubLObject)module0683.$ic344$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        if (module0683.NIL != var99 && (module0683.NIL != oc_inference_datastructures_inference.f25431(var99) || (module0683.NIL != module0683.$g5352$.getGlobalValue() && module0683.NIL != oc_inference_datastructures_inference.f25429(var99) && module0683.NIL != oc_inference_datastructures_inference.f25432(var99)))) {
            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
            f41678((SubLObject)module0683.$ic345$, (SubLObject)module0683.$ic346$, (SubLObject)module0683.$ic347$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var185 = (SubLObject)module0683.$ic265$;
        module0016.f908((SubLObject)module0683.$ic342$, var185, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic342$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var182);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            f41678((SubLObject)module0683.$ic348$, (SubLObject)module0683.$ic349$, (SubLObject)module0683.$ic350$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
            f41678((SubLObject)module0683.$ic351$, (SubLObject)module0683.$ic352$, (SubLObject)module0683.$ic353$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
            f41678((SubLObject)module0683.$ic354$, (SubLObject)module0683.$ic355$, (SubLObject)module0683.$ic356$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var99 && module0683.NIL != oc_inference_datastructures_inference.f25615(var99)) {
                module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                f41678((SubLObject)module0683.$ic357$, (SubLObject)module0683.$ic358$, (SubLObject)module0683.$ic359$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
            f41746(var99, (SubLObject)module0683.T, (SubLObject)module0683.T, var181);
            module0642.f39051((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            f41747(var99, var181);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41748(final SubLObject var77) {
        module0683.$g5325$.setDynamicValue(var77);
        module0677.f41286();
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41749(final SubLObject var182, SubLObject var183) {
        if (var183 == module0683.UNPROVIDED) {
            var183 = (SubLObject)module0683.NIL;
        }
        final SubLThread var184 = SubLProcess.currentSubLThread();
        final SubLObject var185 = conses_high.getf(module0683.$g5325$.getDynamicValue(var184), var182, (SubLObject)module0683.NIL);
        if (module0683.NIL != var185) {
            return f41698(var185, var182);
        }
        return var183;
    }
    
    public static SubLObject f41750(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181) {
        if (var181 == module0683.UNPROVIDED) {
            var181 = (SubLObject)module0683.$ic225$;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)module0683.$ic361$, (SubLObject)module0683.$ic362$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        return f41746(var99, var185, var186, var181);
    }
    
    public static SubLObject f41746(final SubLObject var99, final SubLObject var185, final SubLObject var186, final SubLObject var181) {
        f41751(module0683.$g5361$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)module0683.FOUR_INTEGER, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41747(final SubLObject var99, final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        module0016.f920((SubLObject)module0683.$ic363$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        final SubLObject var183 = (SubLObject)module0683.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0683.NIL != var183) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var183);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        SubLObject var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var182);
            f41676((SubLObject)module0683.$ic364$, (SubLObject)module0683.$ic365$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        final SubLObject var185 = (SubLObject)module0683.$ic265$;
        module0016.f908((SubLObject)module0683.$ic363$, var185, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic363$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var182);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            f41752(var99, (SubLObject)module0683.T, (SubLObject)module0683.T, var181);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            f41753(var99, (SubLObject)module0683.T, (SubLObject)module0683.T, var181, (SubLObject)module0683.NIL);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            f41754(var99, (SubLObject)module0683.T, (SubLObject)module0683.T, var181, (SubLObject)module0683.NIL);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            f41755(var99, (SubLObject)module0683.T, (SubLObject)module0683.T, var181);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41756(final SubLObject var46) {
        return module0035.f2169(var46, module0683.$g5362$.getGlobalValue());
    }
    
    public static SubLObject f41757(final SubLObject var46) {
        return module0035.f2169(var46.first(), module0683.$g5362$.getGlobalValue());
    }
    
    public static SubLObject f41758(final SubLObject var187, final SubLObject var188) {
        if (module0683.NIL != var188) {
            return var187;
        }
        return Sequences.remove_if((SubLObject)module0683.$ic367$, var187, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41759() {
        SubLObject var67 = (SubLObject)module0683.NIL;
        SubLObject var68 = module0683.$g5363$.getGlobalValue();
        SubLObject var69 = (SubLObject)module0683.NIL;
        var69 = var68.first();
        while (module0683.NIL != var68) {
            if (module0683.NIL != f41757(var69)) {
                var67 = (SubLObject)ConsesLow.cons(var69, var67);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return module0035.f2344(var67, module0683.$g5362$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0683.EQ), Symbols.symbol_function((SubLObject)module0683.$ic368$));
    }
    
    public static SubLObject f41752(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181) {
        if (var181 == module0683.UNPROVIDED) {
            var181 = (SubLObject)module0683.$ic225$;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)module0683.$ic369$, (SubLObject)module0683.$ic370$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        f41751(f41759(), var99, var185, var186, var181, (SubLObject)module0683.THREE_INTEGER, (SubLObject)module0683.T);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41753(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181, SubLObject var188) {
        if (var181 == module0683.UNPROVIDED) {
            var181 = (SubLObject)module0683.$ic225$;
        }
        if (var188 == module0683.UNPROVIDED) {
            var188 = (SubLObject)module0683.T;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)module0683.$ic372$, (SubLObject)module0683.$ic362$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        f41751(module0683.$g5364$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)module0683.THREE_INTEGER, var188);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41754(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181, SubLObject var188) {
        if (var181 == module0683.UNPROVIDED) {
            var181 = (SubLObject)module0683.$ic225$;
        }
        if (var188 == module0683.UNPROVIDED) {
            var188 = (SubLObject)module0683.T;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)module0683.$ic374$, (SubLObject)module0683.$ic375$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        f41751(module0683.$g5365$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)module0683.TWO_INTEGER, var188);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41755(final SubLObject var99, final SubLObject var185, final SubLObject var186, final SubLObject var181) {
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)module0683.$ic378$, (SubLObject)module0683.$ic379$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        f41751(module0683.$g5369$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)module0683.THREE_INTEGER, (SubLObject)module0683.NIL);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41760() {
        return module0683.$g5370$.getGlobalValue();
    }
    
    public static SubLObject f41751(SubLObject var190, final SubLObject var99, final SubLObject var185, final SubLObject var186, final SubLObject var181, SubLObject var191, SubLObject var188) {
        if (var191 == module0683.UNPROVIDED) {
            var191 = (SubLObject)module0683.TWO_INTEGER;
        }
        if (var188 == module0683.UNPROVIDED) {
            var188 = (SubLObject)module0683.T;
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        var190 = f41758(var190, var188);
        if (module0683.NIL != var190) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var193 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var192);
                while (module0683.NIL != conses_high.nthcdr(var191, var190)) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_192 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var192);
                        SubLObject var194;
                        SubLObject var196;
                        SubLObject var195;
                        SubLObject var197;
                        SubLObject var198;
                        SubLObject var199;
                        SubLObject var200;
                        SubLObject var201;
                        SubLObject var202;
                        SubLObject var20_193;
                        SubLObject var20_194;
                        for (var194 = (SubLObject)module0683.NIL, var194 = (SubLObject)module0683.ZERO_INTEGER; var194.numL(var191); var194 = Numbers.add(var194, (SubLObject)module0683.ONE_INTEGER)) {
                            var195 = (var196 = var190);
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)module0683.$ic380$);
                            var197 = var196.rest();
                            var196 = var196.first();
                            var198 = (SubLObject)module0683.NIL;
                            var199 = (SubLObject)module0683.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)module0683.$ic380$);
                            var198 = var196.first();
                            var196 = var196.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)module0683.$ic380$);
                            var199 = var196.first();
                            var196 = var196.rest();
                            var200 = (SubLObject)(var196.isCons() ? var196.first() : module0683.NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var196, var195, (SubLObject)module0683.$ic380$);
                            var196 = var196.rest();
                            if (module0683.NIL == var196) {
                                var196 = var197;
                                var201 = (var190 = var196);
                                if (module0683.NIL != f41756(var198)) {
                                    var199 = f41761(var198, var199, var181);
                                }
                                var202 = f41762(var181, var99, var198, var199, var186);
                                if (!var194.isZero()) {
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                    var20_193 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0683.T, var192);
                                        module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_193, var192);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                var20_194 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var192);
                                    f41763(var198, var202, var199, var185, var200);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_194, var192);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var195, (SubLObject)module0683.$ic380$);
                            }
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var20_192, var192);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                }
                final SubLObject var203 = Numbers.subtract(var191, Sequences.length(var190));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_195 = module0015.$g533$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var192);
                    SubLObject var204 = var190;
                    SubLObject var205 = (SubLObject)module0683.NIL;
                    var205 = var204.first();
                    while (module0683.NIL != var204) {
                        SubLObject var207;
                        final SubLObject var206 = var207 = var205;
                        SubLObject var208 = (SubLObject)module0683.NIL;
                        SubLObject var209 = (SubLObject)module0683.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0683.$ic381$);
                        var208 = var207.first();
                        var207 = var207.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)module0683.$ic381$);
                        var209 = var207.first();
                        var207 = var207.rest();
                        final SubLObject var210 = (SubLObject)(var207.isCons() ? var207.first() : module0683.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var207, var206, (SubLObject)module0683.$ic381$);
                        var207 = var207.rest();
                        if (module0683.NIL == var207) {
                            if (module0683.NIL != f41756(var208)) {
                                var209 = f41761(var208, var209, var181);
                            }
                            final SubLObject var202 = f41762(var181, var99, var208, var209, var186);
                            if (!var205.eql(var190.first())) {
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_196 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var192);
                                    module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_196, var192);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_197 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var192);
                                f41763(var208, var202, var209, var185, var210);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_197, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)module0683.$ic381$);
                        }
                        var204 = var204.rest();
                        var205 = var204.first();
                    }
                    if (!var203.isZero()) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        if (module0683.NIL != var203) {
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(var203);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_198 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var192);
                            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_198, var192);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                }
                finally {
                    module0015.$g533$.rebind(var20_195, var192);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var193, var192);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41764(final SubLObject var48, final SubLObject var210, final SubLObject var197) {
        final SubLObject var211 = module0412.f28716(var210, var48, (SubLObject)module0683.$ic382$);
        if (var211 == module0683.$ic382$) {
            return var197;
        }
        return f41698(var211, var48);
    }
    
    public static SubLObject f41761(final SubLObject var48, final SubLObject var197, final SubLObject var138) {
        final SubLObject var198 = var138.isList() ? conses_high.getf(var138, (SubLObject)module0683.$ic58$, f41765()) : f41765();
        return f41764(var48, var198, var197);
    }
    
    public static SubLObject f41762(final SubLObject var181, final SubLObject var99, final SubLObject var48, final SubLObject var197, final SubLObject var186) {
        SubLObject var198 = f41766(var181, var99, var48, var197, var186);
        if (var48 == module0683.$ic77$ && module0683.NIL == oc_inference_datastructures_inference.f25648()) {
            var198 = (SubLObject)module0683.$ic137$;
        }
        return var198;
    }
    
    public static SubLObject f41766(final SubLObject var181, final SubLObject var99, final SubLObject var48, final SubLObject var197, final SubLObject var186) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if (module0683.$ic225$ != var181) {
            final SubLObject var199 = conses_high.getf(var181, var48, (SubLObject)module0683.$ic225$);
            if (module0683.$ic225$ == var199) {
                return var197;
            }
            return f41698(var199, var48);
        }
        else {
            if (module0683.NIL != var99) {
                final SubLObject var200 = f41697(var197, var48);
                final SubLObject var201 = (module0683.NIL != var186) ? module0411.f28571(var99, var48, var200) : module0411.f28572(var99, var48, var200);
                return f41698(var201, var48);
            }
            if (module0683.NIL != module0683.$g5325$.getDynamicValue(var198)) {
                return f41749(var48, var197);
            }
            return var197;
        }
    }
    
    public static SubLObject f41763(final SubLObject var48, final SubLObject var47, final SubLObject var197, final SubLObject var185, final SubLObject var198) {
        final SubLThread var199 = SubLProcess.currentSubLThread();
        if (module0683.NIL == f41691(var48)) {
            module0642.f39020(module0015.$g240$.getGlobalValue());
            module0642.f39024(var48);
            module0642.f39020(module0015.$g241$.getGlobalValue());
        }
        else {
            final SubLObject var200 = f41692(var48);
            final SubLObject var201 = f41693(var48);
            final SubLObject var202 = f41694(var48);
            if (module0683.NIL == module0035.f2417(var47, var197)) {
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g240$.getGlobalValue());
                module0642.f39020(module0015.$g149$.getGlobalValue());
                module0642.f39020(module0015.$g152$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39048((SubLObject)module0683.$ic383$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var203 = module0015.$g533$.currentBinding(var199);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var199);
                    f41676((SubLObject)module0683.$ic384$, (SubLObject)module0683.$ic385$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var203, var199);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
                module0642.f39020(module0015.$g241$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
            }
            if (module0683.NIL == module0038.f2610(var201)) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                f41673(var200, var201, var200, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            else {
                module0642.f39021(var200);
            }
            f41767(var48, var47, var185, var202, var198);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41767(final SubLObject var48, final SubLObject var47, final SubLObject var185, final SubLObject var62, final SubLObject var198) {
        final SubLObject var199 = module0642.f39102(var48);
        final SubLObject var200 = module0642.f39101(var48);
        final SubLObject var201 = Sequences.find((SubLObject)module0683.$ic45$, var62, Symbols.symbol_function((SubLObject)module0683.EQL), Symbols.symbol_function((SubLObject)module0683.$ic368$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var202 = Sequences.length(var62);
        SubLObject var203 = (SubLObject)module0683.NIL;
        SubLObject var204 = (SubLObject)module0683.NIL;
        SubLObject var205 = (SubLObject)module0683.NIL;
        var203 = var62;
        var204 = var203.first();
        for (var205 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var203; var203 = var203.rest(), var204 = var203.first(), var205 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var205)) {
            if (module0683.$ic58$ != var48 || !module0683.$g5355$.getGlobalValue().eql(var205)) {
                f41768(var48, var47, var185, var204, var205, var202, var199, var201, var200, var198);
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41765() {
        return module0035.f2113(module0035.f2293(module0683.$g5361$.getGlobalValue(), (SubLObject)module0683.$ic58$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED));
    }
    
    public static SubLObject f41768(final SubLObject var48, final SubLObject var47, final SubLObject var185, final SubLObject var68, final SubLObject var216, final SubLObject var215, final SubLObject var212, final SubLObject var214, final SubLObject var213, final SubLObject var198) {
        final SubLThread var217 = SubLProcess.currentSubLThread();
        final SubLObject var218 = f41701(var48, var47, var68);
        if (module0683.NIL != var185 || module0683.NIL != var218) {
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            SubLObject var219 = (SubLObject)module0683.NIL;
            SubLObject var220 = (SubLObject)module0683.NIL;
            SubLObject var221 = (SubLObject)module0683.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var68, var68, (SubLObject)module0683.$ic43$);
            var219 = var68.first();
            SubLObject var222 = var68.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var222, var68, (SubLObject)module0683.$ic43$);
            var220 = var222.first();
            var222 = var222.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var222, var68, (SubLObject)module0683.$ic43$);
            var221 = var222.first();
            var222 = var222.rest();
            if (module0683.NIL == var222) {
                if (module0683.NIL != var185) {
                    final SubLObject var223 = module0642.f39130(var212);
                    if (module0683.ONE_INTEGER.numE(var215)) {
                        module0642.f39069(var223, var216, (SubLObject)module0683.UNPROVIDED);
                    }
                    else if (var48 == module0683.$ic58$) {
                        f41769(var223, var216, var218);
                    }
                    else if (module0683.NIL != f41756(var48)) {
                        if (module0683.NIL != var214) {
                            if (module0683.$ic45$ == var219) {
                                f41770(var223, var213, var216, var218);
                            }
                            else {
                                f41771(var223, var213, var216, var218);
                            }
                        }
                        else {
                            f41772(var223, var216, var218);
                        }
                    }
                    else if (module0683.NIL != var214) {
                        if (module0683.$ic45$ == var219) {
                            module0644.f39188(var223, var213, var216, var218);
                        }
                        else {
                            module0644.f39187(var223, var213, var216, var218);
                        }
                    }
                    else {
                        module0642.f39072(var223, var216, var218, (SubLObject)module0683.UNPROVIDED);
                    }
                }
                if (module0683.$ic45$ == var219) {
                    module0642.f39032((SubLObject)module0683.UNPROVIDED);
                    final SubLObject var224 = (SubLObject)((module0683.NIL != var218) ? print_high.prin1_to_string(var47) : module0683.NIL);
                    if (module0683.NIL != var185) {
                        SubLObject var224_225;
                        final SubLObject var222_223 = var224_225 = (SubLObject)((module0683.NIL != var198) ? var198 : module0683.$ic386$);
                        SubLObject var225 = (SubLObject)module0683.NIL;
                        SubLObject var226 = (SubLObject)module0683.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var224_225, var222_223, (SubLObject)module0683.$ic387$);
                        var225 = var224_225.first();
                        var224_225 = var224_225.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var224_225, var222_223, (SubLObject)module0683.$ic387$);
                        var226 = var224_225.first();
                        var224_225 = var224_225.rest();
                        if (module0683.NIL == var224_225) {
                            final SubLObject var227 = var225;
                            if (var227.eql((SubLObject)module0683.$ic388$)) {
                                module0642.f39075(var213, var224, var226);
                            }
                            else {
                                module0642.f39075(var213, var224, (SubLObject)module0683.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var222_223, (SubLObject)module0683.$ic387$);
                        }
                    }
                    else {
                        module0642.f39019(var224);
                    }
                }
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
                final SubLObject var228 = module0015.$g533$.currentBinding(var217);
                try {
                    module0015.$g533$.bind((SubLObject)SubLObjectFactory.makeBoolean(var48 != module0683.$ic58$), var217);
                    module0642.f39019(var221);
                }
                finally {
                    module0015.$g533$.rebind(var228, var217);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)module0683.$ic43$);
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41773(final SubLObject var228) {
        final SubLThread var229 = SubLProcess.currentSubLThread();
        PrintLow.format(module0015.$g131$.getDynamicValue(var229), module0683.$g5371$.getGlobalValue());
        SubLObject var230 = var228;
        SubLObject var231 = (SubLObject)module0683.NIL;
        var231 = var230.first();
        while (module0683.NIL != var230) {
            SubLObject var233;
            final SubLObject var232 = var233 = var231;
            SubLObject var234 = (SubLObject)module0683.NIL;
            SubLObject var235 = (SubLObject)module0683.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var233, var232, (SubLObject)module0683.$ic393$);
            var234 = var233.first();
            var233 = (var235 = var233.rest());
            if (var235.isCons()) {
                SubLObject var234_235;
                final SubLObject var232_233 = var234_235 = var235;
                SubLObject var236 = (SubLObject)module0683.NIL;
                SubLObject var237 = (SubLObject)module0683.NIL;
                SubLObject var238 = (SubLObject)module0683.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)module0683.$ic394$);
                var236 = var234_235.first();
                var234_235 = var234_235.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)module0683.$ic394$);
                var237 = var234_235.first();
                var234_235 = var234_235.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)module0683.$ic394$);
                var238 = var234_235.first();
                var234_235 = var234_235.rest();
                if (module0683.NIL == var234_235) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var229), module0683.$g5373$.getGlobalValue(), var234, var236);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var229), module0683.$g5374$.getGlobalValue(), var237, var238);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var232_233, (SubLObject)module0683.$ic394$);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var229), module0683.$g5373$.getGlobalValue(), var234, var235);
            }
            var230 = var230.rest();
            var231 = var230.first();
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var229), module0683.$g5372$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41774(final SubLObject var239, final SubLObject var47) {
        return f41773(module0035.f2063((SubLObject)module0683.NIL, var239, var47, (SubLObject)module0683.UNPROVIDED));
    }
    
    public static SubLObject f41775(final SubLObject var51, final SubLObject var47) {
        SubLObject var52 = (SubLObject)module0683.NIL;
        SubLObject var53 = (SubLObject)module0683.NIL;
        SubLObject var54 = (SubLObject)module0683.NIL;
        var52 = f41694(var51);
        var53 = var52.first();
        for (var54 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var52; var52 = var52.rest(), var53 = var52.first(), var54 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var54)) {
            if (module0683.NIL != f41701(var51, var47, var53)) {
                return var54;
            }
        }
        return Errors.error((SubLObject)module0683.$ic395$, var51, var47);
    }
    
    public static SubLObject f41776(final SubLObject var240) {
        SubLObject var241 = (SubLObject)module0683.NIL;
        SubLObject var242 = module0683.$g5362$.getGlobalValue();
        SubLObject var243 = (SubLObject)module0683.NIL;
        var243 = var242.first();
        while (module0683.NIL != var242) {
            final SubLObject var244 = f41777(var243);
            final SubLObject var245 = f41764(var243, var240, (SubLObject)module0683.$ic396$);
            final SubLObject var246 = f41775(var243, var245);
            final SubLObject var247 = f41694(var243);
            final SubLObject var248 = ConsesLow.nth(var246, var247);
            final SubLObject var250;
            final SubLObject var249 = var250 = var248.first();
            if (var250.eql((SubLObject)module0683.$ic44$)) {
                final SubLObject var251 = Sequences.find((SubLObject)module0683.$ic45$, var247, Symbols.symbol_function((SubLObject)module0683.EQL), Symbols.symbol_function((SubLObject)module0683.$ic368$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != var251) {
                    final SubLObject var252 = module0642.f39101(var243);
                    var241 = module0035.f2063(var241, var244, (SubLObject)ConsesLow.list(var246, var252, (SubLObject)module0683.$ic6$), (SubLObject)module0683.UNPROVIDED);
                }
                else {
                    var241 = module0035.f2063(var241, var244, var246, (SubLObject)module0683.UNPROVIDED);
                }
            }
            else if (var250.eql((SubLObject)module0683.$ic45$)) {
                final SubLObject var253 = module0642.f39101(var243);
                var241 = module0035.f2063(var241, var244, (SubLObject)ConsesLow.list(var246, var253, var245), (SubLObject)module0683.UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)module0683.$ic397$, var249);
            }
            var242 = var242.rest();
            var243 = var242.first();
        }
        f41773(var241);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41769(final SubLObject var220, final SubLObject var216, final SubLObject var217) {
        final SubLObject var221 = conses_high.second(ConsesLow.nth(var216, f41694((SubLObject)module0683.$ic58$)));
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)module0683.ONE_INTEGER);
        f41776(var221);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41778() {
        SubLObject var243 = f41777(module0683.$g5362$.getGlobalValue().first());
        SubLObject var244 = module0683.$g5362$.getGlobalValue().rest();
        SubLObject var245 = (SubLObject)module0683.NIL;
        var245 = var244.first();
        while (module0683.NIL != var244) {
            var243 = Sequences.cconcatenate(var243, new SubLObject[] { module0683.$ic398$, f41777(var245) });
            var244 = var244.rest();
            var245 = var244.first();
        }
        return var243;
    }
    
    public static SubLObject f41777(final SubLObject var48) {
        return module0038.f2659((SubLObject)module0683.$ic399$, (SubLObject)module0683.$ic400$, module0642.f39130(module0642.f39102(var48)), (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41779(final SubLObject var48) {
        return module0038.f2659((SubLObject)module0683.$ic399$, (SubLObject)module0683.$ic400$, module0642.f39130(module0642.f39101(var48)), (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41772(final SubLObject var220, final SubLObject var216, final SubLObject var217) {
        final SubLObject var221 = f41777((SubLObject)module0683.$ic58$);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)module0683.ONE_INTEGER);
        f41774(var221, module0683.$g5355$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41771(final SubLObject var220, final SubLObject var213, final SubLObject var216, final SubLObject var217) {
        final SubLObject var221 = f41777((SubLObject)module0683.$ic58$);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)module0683.ONE_INTEGER);
        f41774(var221, (SubLObject)ConsesLow.list(module0683.$g5355$.getGlobalValue(), var213, (SubLObject)module0683.$ic6$));
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41770(final SubLObject var220, final SubLObject var213, final SubLObject var216, final SubLObject var217) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        final SubLObject var222 = f41777((SubLObject)module0683.$ic58$);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)module0683.ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var221), module0683.$g5375$.getGlobalValue(), new SubLObject[] { var213, var222, module0683.$g5355$.getGlobalValue() });
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41731(final SubLObject var99, final SubLObject var138) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0683.NIL != module0674.f41242() || (module0683.NIL != var99 && (module0683.NIL != oc_inference_datastructures_inference.f25610(var99) || module0683.NIL != oc_inference_datastructures_inference.f25611(var99)) && module0683.$ic225$ != var138 && (module0360.f23984(var138, (SubLObject)module0683.$ic402$).isList() || module0360.f23984(var138, (SubLObject)module0683.$ic403$).isList())));
    }
    
    public static SubLObject f41780(final SubLObject var99, final SubLObject var138) {
        SubLObject var139 = (SubLObject)module0683.$ic225$;
        SubLObject var140 = (SubLObject)module0683.$ic225$;
        SubLObject var141 = (SubLObject)module0683.$ic225$;
        SubLObject var142 = (SubLObject)module0683.$ic225$;
        if (module0683.NIL != var99) {
            var139 = oc_inference_datastructures_inference.f25610(var99);
            var140 = oc_inference_datastructures_inference.f25611(var99);
        }
        if (module0683.$ic225$ != var138) {
            var141 = module0360.f23984(var138, (SubLObject)module0683.$ic402$);
            var142 = module0360.f23984(var138, (SubLObject)module0683.$ic403$);
        }
        f41781(var139);
        f41781(var140);
        f41781(var141);
        f41781(var142);
        final SubLObject var143 = module0674.f41242();
        SubLObject var144 = (SubLObject)module0683.$ic404$;
        SubLObject var145 = (SubLObject)module0683.$ic405$;
        if (module0683.$ic225$ != var138) {
            var144 = var141;
            var145 = var142;
        }
        else if (module0683.NIL != var99) {
            var144 = var139;
            var145 = var140;
        }
        return Values.values(var143, var144, var145);
    }
    
    public static SubLObject f41781(final SubLObject var252) {
        if (var252.isList()) {
            SubLObject var253 = var252;
            SubLObject var254 = (SubLObject)module0683.NIL;
            var254 = var253.first();
            while (module0683.NIL != var253) {
                module0674.f41243(var254);
                var253 = var253.rest();
                var254 = var253.first();
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41732(final SubLObject var99, final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        var139.resetMultipleValues();
        final SubLObject var140 = f41780(var99, var138);
        final SubLObject var141 = var139.secondMultipleValue();
        final SubLObject var142 = var139.thirdMultipleValue();
        var139.resetMultipleValues();
        module0642.f39085((SubLObject)module0683.$ic256$);
        module0016.f920((SubLObject)module0683.$ic406$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
        final SubLObject var143 = (SubLObject)module0683.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0683.NIL != var143) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var143);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        SubLObject var144 = module0015.$g533$.currentBinding(var139);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var139);
            f41676((SubLObject)module0683.$ic407$, (SubLObject)module0683.$ic408$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var144, var139);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        final SubLObject var145 = (SubLObject)((module0683.NIL != var140) ? module0683.$ic266$ : module0683.$ic265$);
        module0016.f908((SubLObject)module0683.$ic406$, var145, (SubLObject)module0683.$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic406$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        var144 = module0015.$g533$.currentBinding(var139);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var139);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.ONE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_254 = module0015.$g533$.currentBinding(var139);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var139);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_255 = module0015.$g533$.currentBinding(var139);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var139);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic410$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_256 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var139);
                        f41676((SubLObject)module0683.$ic411$, (SubLObject)module0683.$ic412$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0644.f39209((SubLObject)module0683.$ic413$, (SubLObject)module0683.$ic414$, (SubLObject)module0683.$ic415$, (SubLObject)module0683.$ic416$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_256, var139);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic417$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_257 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var139);
                        f41676((SubLObject)module0683.$ic418$, (SubLObject)module0683.$ic419$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0644.f39209((SubLObject)module0683.$ic420$, (SubLObject)module0683.$ic414$, (SubLObject)module0683.$ic415$, (SubLObject)module0683.$ic421$);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0656.f39837((SubLObject)module0683.$ic422$, (SubLObject)module0683.$ic423$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_257, var139);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic424$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_258 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var139);
                        f41676((SubLObject)module0683.$ic425$, (SubLObject)module0683.$ic426$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0644.f39209((SubLObject)module0683.$ic427$, (SubLObject)module0683.$ic414$, (SubLObject)module0683.$ic415$, (SubLObject)module0683.$ic428$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_258, var139);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic429$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_259 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var139);
                        module0642.f39021((SubLObject)module0683.$ic430$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_259, var139);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_255, var139);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                SubLObject var146 = (SubLObject)module0683.NIL;
                SubLObject var147 = (SubLObject)module0683.NIL;
                SubLObject var148 = (SubLObject)module0683.NIL;
                var146 = var140;
                var147 = var146.first();
                for (var148 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var146; var146 = var146.rest(), var147 = var146.first(), var148 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var148)) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_260 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var139);
                        final SubLObject var149 = f41782(var147, var141, var142);
                        final SubLObject var150 = f41783(var148);
                        final SubLObject var151 = module0642.f39130(var150);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic410$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_261 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var139);
                            module0642.f39072(var151, (SubLObject)module0683.$ic416$, Equality.eq(var149, (SubLObject)module0683.$ic431$), (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_261, var139);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic417$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_262 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var139);
                            module0642.f39072(var151, (SubLObject)module0683.$ic421$, Equality.eq(var149, (SubLObject)module0683.$ic432$), (SubLObject)module0683.UNPROVIDED);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0656.f39837((SubLObject)module0683.$ic433$, var147, (SubLObject)module0683.$ic434$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_262, var139);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic424$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_263 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var139);
                            module0642.f39072(var151, (SubLObject)module0683.$ic428$, Equality.eq(var149, (SubLObject)module0683.$ic435$), (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_263, var139);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic429$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_264 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var139);
                            module0656.f39916(var147, (SubLObject)module0683.T, (SubLObject)module0683.T);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_264, var139);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_260, var139);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                }
            }
            finally {
                module0015.$g533$.rebind(var20_254, var139);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var144, var139);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41783(final SubLObject var261) {
        return Sequences.cconcatenate((SubLObject)module0683.$ic436$, module0006.f203(var261));
    }
    
    public static SubLObject f41782(final SubLObject var260, final SubLObject var250, final SubLObject var251) {
        if (module0683.$ic404$ == var250) {
            if (module0683.$ic405$ == var251) {
                return (SubLObject)module0683.$ic432$;
            }
            if (module0683.NIL != module0004.f104(var260, var251, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED)) {
                return (SubLObject)module0683.$ic431$;
            }
            return (SubLObject)module0683.$ic432$;
        }
        else {
            if (module0683.NIL != module0004.f104(var260, var250, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED)) {
                return (SubLObject)module0683.$ic435$;
            }
            return (SubLObject)module0683.$ic432$;
        }
    }
    
    public static SubLObject f41784(final SubLObject var116) {
        final SubLObject var117 = module0674.f41242();
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        SubLObject var120 = (SubLObject)module0683.NIL;
        SubLObject var121 = (SubLObject)module0683.NIL;
        SubLObject var122 = (SubLObject)module0683.NIL;
        SubLObject var123 = (SubLObject)module0683.NIL;
        var121 = var117;
        var122 = var121.first();
        for (var123 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var121; var121 = var121.rest(), var122 = var121.first(), var123 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var123)) {
            final SubLObject var124 = f41783(var123);
            final SubLObject var125 = module0642.f39132(var124, var116);
            if (var125.equal((SubLObject)module0683.$ic416$)) {
                var118 = (SubLObject)ConsesLow.cons(var122, var118);
            }
            else if (var125.equal((SubLObject)module0683.$ic428$)) {
                var120 = (SubLObject)ConsesLow.cons(var122, var120);
            }
            else {
                var119 = (SubLObject)ConsesLow.cons(var122, var119);
            }
        }
        var118 = Sequences.nreverse(var118);
        var120 = Sequences.nreverse(var120);
        if (module0683.NIL != var120) {
            return Values.values(var120, (SubLObject)module0683.$ic405$);
        }
        if (module0683.NIL != var118) {
            return Values.values((SubLObject)module0683.$ic404$, var118);
        }
        return Values.values((SubLObject)module0683.$ic404$, (SubLObject)module0683.$ic405$);
    }
    
    public static SubLObject f41785(final SubLObject var107) {
        module0642.f39085((SubLObject)module0683.$ic253$);
        f41676((SubLObject)module0683.$ic378$, (SubLObject)module0683.$ic437$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        final SubLObject var108 = module0361.f24178(var107);
        f41751(module0683.$g5369$.getGlobalValue(), (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, var108, (SubLObject)module0683.TWO_INTEGER, (SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39021((SubLObject)module0683.$ic438$);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39021((SubLObject)module0683.$ic439$);
        module0656.f39813(module0361.f24176(var107));
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39021((SubLObject)module0683.$ic440$);
        module0656.f39837((SubLObject)module0683.$ic441$, var107, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39021((SubLObject)module0683.$ic442$);
        module0656.f39837((SubLObject)module0683.$ic443$, var107, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != module0361.f24333(var107)) {
            module0656.f39837((SubLObject)module0683.$ic444$, var107, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != module0361.f24335(var107)) {
            module0656.f39837((SubLObject)module0683.$ic445$, var107, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41786(final SubLObject var116) {
        final SubLObject var117 = module0656.f39970(var116);
        if (module0683.NIL == assertion_handles_oc.f11035(var117)) {
            return module0656.f39789((SubLObject)module0683.$ic446$, var116, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL == module0178.f11290(var117)) {
            return module0656.f39789((SubLObject)module0683.$ic447$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0674.f41244(var117);
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41787(final SubLObject var271, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic434$;
        }
        assert module0683.NIL != assertion_handles_oc.f11035(var271) : var271;
        final SubLObject var273 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic450$.isString()) {
            final SubLObject var274 = module0644.f39202((SubLObject)module0683.$ic450$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var272), (SubLObject)module0683.$ic451$, assertion_handles_oc.f11025(var271));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var273) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var273);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var274);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var275 = module0015.$g533$.currentBinding(var272);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var272);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var275, var272);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var271;
    }
    
    public static SubLObject f41788(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0674.f41245();
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41789(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic423$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic454$.isString()) {
            final SubLObject var25 = module0644.f39202((SubLObject)module0683.$ic454$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)module0683.$ic455$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var24) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var24);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var26 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var26, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41790(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = f41791(var116);
        SubLObject var119 = (SubLObject)module0683.NIL;
        SubLObject var120 = (SubLObject)module0683.NIL;
        final SubLObject var121 = var118;
        if (var121.eql((SubLObject)module0683.$ic457$) || var121.eql((SubLObject)module0683.$ic458$)) {
            var117.resetMultipleValues();
            final SubLObject var275_276 = f41792(var116, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var277_278 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var275_276;
            var120 = var277_278;
        }
        else if (var121.eql((SubLObject)module0683.$ic459$) || var121.eql((SubLObject)module0683.$ic460$)) {
            var117.resetMultipleValues();
            final SubLObject var279_280 = f41792(var116, (SubLObject)module0683.NIL, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var281_282 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var279_280;
            var120 = var281_282;
        }
        else if (var121.eql((SubLObject)module0683.$ic461$)) {
            if (module0683.NIL != module0683.$g5325$.getDynamicValue(var117)) {
                var119 = module0683.$g5325$.getDynamicValue(var117);
            }
            else {
                var119 = (SubLObject)module0683.$ic225$;
            }
        }
        else if (var121.eql((SubLObject)module0683.$ic462$)) {
            var117.resetMultipleValues();
            final SubLObject var283_284 = f41792(var116, (SubLObject)module0683.NIL, (SubLObject)module0683.T);
            final SubLObject var285_286 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var283_284;
            var120 = var285_286;
        }
        else {
            if (!var121.eql((SubLObject)module0683.$ic463$)) {
                return module0656.f39789((SubLObject)module0683.$ic464$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            var117.resetMultipleValues();
            final SubLObject var287_288 = f41792(var116, (SubLObject)module0683.NIL, (SubLObject)module0683.T);
            final SubLObject var289_290 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var287_288;
            var120 = var289_290;
        }
        if (module0683.NIL != var120) {
            return module0656.f39789((SubLObject)module0683.$ic465$, var120, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.$ic457$ == var118) {
            final SubLObject var122 = f41793(var116);
            if (module0683.NIL == oc_inference_datastructures_inference.f25431(var122)) {
                return module0656.f39789((SubLObject)module0683.$ic466$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            f41704(var122, var119);
            return f41721((SubLObject)module0683.UNPROVIDED);
        }
        else {
            if (module0683.$ic460$ == var118) {
                f41748(var119);
                return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic227$, var119));
            }
            if (module0683.$ic461$ == var118) {
                return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic227$, var119));
            }
            if (module0683.$ic462$ == var118) {
                return f41721((SubLObject)module0683.$ic467$);
            }
            var117.resetMultipleValues();
            SubLObject var123 = module0657.f40003(var116, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var124 = var117.secondMultipleValue();
            final SubLObject var125 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (module0683.NIL != var124) {
                return module0657.f40013(var124, var125);
            }
            var117.resetMultipleValues();
            SubLObject var126 = f41794(var116, (SubLObject)module0683.$ic468$);
            final SubLObject var127 = var117.secondMultipleValue();
            final SubLObject var128 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (module0683.NIL != var127) {
                return module0657.f40031(var127, var128, (SubLObject)module0683.$ic469$);
            }
            var117.resetMultipleValues();
            SubLObject var129 = f41794(var116, (SubLObject)module0683.$ic470$);
            final SubLObject var130 = var117.secondMultipleValue();
            final SubLObject var131 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (module0683.NIL != var130) {
                return module0657.f40031(var130, var131, (SubLObject)module0683.$ic471$);
            }
            var117.resetMultipleValues();
            final SubLObject var132 = f41795(var116);
            final SubLObject var133 = var117.secondMultipleValue();
            final SubLObject var134 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (module0683.NIL != var134) {
                return module0656.f39789((SubLObject)module0683.$ic465$, var134, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            var117.resetMultipleValues();
            final SubLObject var298_299 = f41796(var126, var123, var129, var119);
            final SubLObject var300_301 = var117.secondMultipleValue();
            final SubLObject var302_303 = var117.thirdMultipleValue();
            final SubLObject var304_305 = var117.fourthMultipleValue();
            var117.resetMultipleValues();
            var126 = var298_299;
            var123 = var300_301;
            var129 = var302_303;
            var119 = var304_305;
            final SubLObject var135 = var118;
            if (var135.eql((SubLObject)module0683.$ic459$)) {
                final SubLObject var136 = f41703(var126, var123, var129, var119);
                if (module0683.NIL != var132) {
                    module0684.f41926(var136, var132);
                }
                if (module0683.NIL != var133) {
                    module0686.f42033(var136, var133);
                }
                f41712(var136);
                return f41721((SubLObject)module0683.UNPROVIDED);
            }
            if (var135.eql((SubLObject)module0683.$ic458$)) {
                final SubLObject var137 = f41793(var116);
                final SubLObject var138 = f41702(var137, var126, var123, var129, var119);
                f41712(var138);
                return f41721((SubLObject)module0683.UNPROVIDED);
            }
            if (var135.eql((SubLObject)module0683.$ic463$)) {
                final SubLObject var137 = f41793(var116);
                final SubLObject var139 = module0412.f28692(var137);
                return f41797(var126, var123, var139, var129);
            }
            return module0656.f39789((SubLObject)module0683.$ic464$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
    }
    
    public static SubLObject f41794(final SubLObject var116, SubLObject var308) {
        if (var308 == module0683.UNPROVIDED) {
            var308 = (SubLObject)module0683.NIL;
        }
        final SubLThread var309 = SubLProcess.currentSubLThread();
        var309.resetMultipleValues();
        final SubLObject var310 = module0657.f40022(var116, var308);
        final SubLObject var311 = var309.secondMultipleValue();
        final SubLObject var312 = var309.thirdMultipleValue();
        var309.resetMultipleValues();
        if (module0683.NIL == var311) {}
        return Values.values(var310, var311, var312);
    }
    
    public static SubLObject f41796(SubLObject var74, final SubLObject var75, final SubLObject var76, SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        if (module0683.NIL != module0655.$g5094$.getDynamicValue(var78) && module0683.NIL != module0202.f12691(var74, (SubLObject)module0683.UNPROVIDED)) {
            var77 = conses_high.putf(var77, (SubLObject)module0683.$ic158$, (SubLObject)module0683.T);
            SubLObject var79 = module0360.f23840(var77);
            var79 = Numbers.add(var79, (SubLObject)module0683.ONE_INTEGER);
            var77 = conses_high.putf(var77, (SubLObject)module0683.$ic65$, var79);
            final SubLObject var80 = module0279.f18513(var74, (SubLObject)module0683.$ic474$);
            var74 = (SubLObject)ConsesLow.list(module0683.$ic475$, var74, var80);
        }
        return Values.values(var74, var75, var76, var77);
    }
    
    public static SubLObject f41791(final SubLObject var116) {
        if (module0683.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic347$, var116))) {
            return (SubLObject)module0683.$ic457$;
        }
        if (module0683.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic303$, var116))) {
            return (SubLObject)module0683.$ic459$;
        }
        if (module0683.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic300$, var116))) {
            return (SubLObject)module0683.$ic458$;
        }
        if (module0683.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic350$, var116))) {
            return (SubLObject)module0683.$ic460$;
        }
        if (module0683.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic353$, var116))) {
            return (SubLObject)module0683.$ic461$;
        }
        if (module0683.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic356$, var116))) {
            return (SubLObject)module0683.$ic462$;
        }
        if (module0683.NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic359$, var116))) {
            return (SubLObject)module0683.$ic463$;
        }
        return (SubLObject)module0683.$ic476$;
    }
    
    public static SubLObject f41793(final SubLObject var116) {
        final SubLObject var117 = module0642.f39104((SubLObject)module0683.$ic278$, var116);
        final SubLObject var118 = module0642.f39104((SubLObject)module0683.$ic279$, var116);
        return f41672(var117, var118);
    }
    
    public static SubLObject f41792(final SubLObject var116, final SubLObject var312, SubLObject var313) {
        if (var313 == module0683.UNPROVIDED) {
            var313 = (SubLObject)module0683.NIL;
        }
        final SubLThread var314 = SubLProcess.currentSubLThread();
        var314.resetMultipleValues();
        SubLObject var315 = f41798(var116, var312, var313);
        final SubLObject var316 = var314.secondMultipleValue();
        var314.resetMultipleValues();
        if (module0683.NIL != var316) {
            return Values.values((SubLObject)module0683.NIL, var316);
        }
        var314.resetMultipleValues();
        final SubLObject var317 = f41784(var116);
        final SubLObject var318 = var314.secondMultipleValue();
        var314.resetMultipleValues();
        var315 = conses_high.putf(var315, (SubLObject)module0683.$ic402$, var317);
        var315 = conses_high.putf(var315, (SubLObject)module0683.$ic403$, var318);
        return Values.values(var315, var316);
    }
    
    public static SubLObject f41798(final SubLObject var116, final SubLObject var312, final SubLObject var313) {
        final SubLThread var314 = SubLProcess.currentSubLThread();
        SubLObject var316;
        final SubLObject var315 = var316 = f41707();
        final SubLObject var317 = (SubLObject)(var316.isCons() ? var316.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var316, var315, (SubLObject)module0683.$ic208$);
        final SubLObject var318;
        var316 = (var318 = var316.rest());
        SubLObject var319 = (SubLObject)module0683.NIL;
        SubLObject var320 = f41760();
        SubLObject var321 = (SubLObject)module0683.NIL;
        var321 = var320.first();
        while (module0683.NIL != var320) {
            var314.resetMultipleValues();
            final SubLObject var322 = f41799(var321, var116, var317, var312, var313);
            final SubLObject var323 = var314.secondMultipleValue();
            var314.resetMultipleValues();
            if (module0683.NIL != var323) {
                return Values.values((SubLObject)module0683.NIL, var323);
            }
            var319 = (SubLObject)ConsesLow.cons(var321, var319);
            var319 = (SubLObject)ConsesLow.cons(var322, var319);
            var320 = var320.rest();
            var321 = var320.first();
        }
        return Values.values(Sequences.nreverse(var319), (SubLObject)module0683.NIL);
    }
    
    public static SubLObject f41799(final SubLObject var51, final SubLObject var116, final SubLObject var99, final SubLObject var312, final SubLObject var313) {
        final SubLThread var314 = SubLProcess.currentSubLThread();
        if (module0683.NIL == f41691(var51)) {
            return Values.values((SubLObject)module0683.NIL, Sequences.cconcatenate(module0006.f205(var51), (SubLObject)module0683.$ic477$));
        }
        if (module0683.NIL != var313) {
            if (module0683.NIL != var99) {
                return Values.values(module0411.f28572(var99, var51, (SubLObject)module0683.NIL), (SubLObject)module0683.NIL);
            }
            final SubLObject var315 = Sequences.find(var51, module0683.$g5363$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0683.EQ), Symbols.symbol_function((SubLObject)module0683.$ic368$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var315) {
                return f41697(conses_high.second(var315), var51);
            }
        }
        final SubLObject var316 = f41692(var51);
        final SubLObject var317 = f41694(var51);
        final SubLObject var318 = module0642.f39102(var51);
        SubLObject var319 = (SubLObject)module0683.NIL;
        final SubLObject var320 = module0015.$g539$.currentBinding(var314);
        try {
            module0015.$g539$.bind(module0015.f800(var116), var314);
            var319 = module0642.f39132(var318, var116);
        }
        finally {
            module0015.$g539$.rebind(var320, var314);
        }
        if (module0683.NIL != var319) {
            final SubLObject var321 = ConsesLow.nth(reader.read_from_string_ignoring_errors(var319, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var317);
            SubLObject var323;
            final SubLObject var322 = var323 = var321;
            SubLObject var324 = (SubLObject)module0683.NIL;
            SubLObject var189_322 = (SubLObject)module0683.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var323, var322, (SubLObject)module0683.$ic478$);
            var324 = var323.first();
            var323 = var323.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var323, var322, (SubLObject)module0683.$ic478$);
            var189_322 = var323.first();
            var323 = var323.rest();
            final SubLObject var325 = (SubLObject)(var323.isCons() ? var323.first() : module0683.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var323, var322, (SubLObject)module0683.$ic478$);
            var323 = var323.rest();
            if (module0683.NIL == var323) {
                final SubLObject var326 = var324;
                if (var326.eql((SubLObject)module0683.$ic44$)) {
                    return Values.values(f41697(var189_322, var51), (SubLObject)module0683.NIL);
                }
                if (var326.eql((SubLObject)module0683.$ic45$)) {
                    final SubLObject var327 = module0642.f39101(var51);
                    final SubLObject var328 = module0642.f39104(var327, var116);
                    if (module0683.NIL == var328) {
                        return Values.values((SubLObject)module0683.NIL, Sequences.cconcatenate((SubLObject)module0683.$ic479$, new SubLObject[] { module0006.f203(var316), module0683.$ic480$ }));
                    }
                    if (module0683.NIL != Functions.funcall(var189_322, var328)) {
                        return Values.values(var328, (SubLObject)module0683.NIL);
                    }
                    final SubLObject var329 = reader.read_from_string_ignoring_errors(var328, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                    if (module0683.NIL == Functions.funcall(var189_322, var329)) {
                        return Values.values((SubLObject)module0683.NIL, Sequences.cconcatenate((SubLObject)module0683.$ic481$, new SubLObject[] { module0006.f203(var316), module0683.$ic482$ }));
                    }
                    return Values.values(f41697(var329, var51), (SubLObject)module0683.NIL);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var322, (SubLObject)module0683.$ic478$);
            }
            return (SubLObject)module0683.NIL;
        }
        if (module0683.NIL != var312) {
            return Values.values(module0411.f28572(var99, var51, (SubLObject)module0683.NIL), (SubLObject)module0683.NIL);
        }
        if (module0683.$ic58$ == var51) {
            return Values.values(module0360.$g3035$.getGlobalValue(), (SubLObject)module0683.NIL);
        }
        return Values.values((SubLObject)module0683.NIL, Sequences.cconcatenate((SubLObject)module0683.$ic483$, new SubLObject[] { module0006.f203(var316), module0683.$ic480$ }));
    }
    
    public static SubLObject f41795(final SubLObject var116) {
        final SubLObject var117 = module0642.f39104((SubLObject)module0683.$ic305$, var116);
        final SubLObject var118 = module0642.f39104((SubLObject)module0683.$ic306$, var116);
        SubLObject var119 = (SubLObject)module0683.NIL;
        SubLObject var120 = (SubLObject)module0683.NIL;
        SubLObject var121 = (SubLObject)module0683.NIL;
        if (module0683.NIL != var117) {
            var119 = module0656.f39943(var117, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var119) {
                if (module0683.NIL == module0423.f29532(var119)) {
                    var121 = Sequences.cconcatenate((SubLObject)module0683.$ic484$, new SubLObject[] { module0006.f203(var117), module0683.$ic485$ });
                }
            }
            else {
                var121 = Sequences.cconcatenate((SubLObject)module0683.$ic486$, new SubLObject[] { module0006.f203(var117), module0683.$ic487$ });
            }
        }
        if (module0683.NIL != var118) {
            var120 = module0656.f39943(var118, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var120) {
                if (module0683.NIL == module0633.f38716(var120, (SubLObject)module0683.UNPROVIDED)) {
                    var121 = Sequences.cconcatenate((SubLObject)module0683.$ic484$, new SubLObject[] { module0006.f203(var118), module0683.$ic488$ });
                }
            }
            else {
                var121 = Sequences.cconcatenate((SubLObject)module0683.$ic489$, new SubLObject[] { module0006.f203(var118), module0683.$ic487$ });
            }
        }
        return Values.values(var119, var120, var121);
    }
    
    public static SubLObject f41800(final SubLObject var74, SubLObject var75, SubLObject var181) {
        if (var75 == module0683.UNPROVIDED) {
            var75 = (SubLObject)module0683.NIL;
        }
        if (var181 == module0683.UNPROVIDED) {
            var181 = (SubLObject)module0683.NIL;
        }
        final SubLThread var182 = SubLProcess.currentSubLThread();
        var181 = conses_high.copy_list(var181);
        var181 = conses_high.putf(var181, (SubLObject)module0683.$ic490$, (SubLObject)module0683.T);
        var182.resetMultipleValues();
        final SubLObject var183 = module0409.f28506(var74, var75, var181);
        final SubLObject var184 = var182.secondMultipleValue();
        final SubLObject var185 = var182.thirdMultipleValue();
        var182.resetMultipleValues();
        f41712(var185);
        f41801(var185);
        return Values.values(var183, var184, var185);
    }
    
    public static SubLObject f41802(final SubLObject var74, SubLObject var75, SubLObject var138) {
        if (var75 == module0683.UNPROVIDED) {
            var75 = (SubLObject)module0683.NIL;
        }
        if (var138 == module0683.UNPROVIDED) {
            var138 = (SubLObject)module0683.NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic221$, (SubLObject)module0683.$ic491$, (SubLObject)module0683.$ic224$, var74, (SubLObject)module0683.$ic226$, var75, (SubLObject)module0683.$ic227$, var138));
    }
    
    public static SubLObject f41803(final SubLObject var74, SubLObject var75, SubLObject var138) {
        if (var75 == module0683.UNPROVIDED) {
            var75 = (SubLObject)module0683.NIL;
        }
        if (var138 == module0683.UNPROVIDED) {
            var138 = (SubLObject)module0683.NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic221$, (SubLObject)module0683.$ic492$, (SubLObject)module0683.$ic224$, var74, (SubLObject)module0683.$ic226$, var75, (SubLObject)module0683.$ic227$, var138));
    }
    
    public static SubLObject f41804(final SubLObject var271, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic493$;
        }
        assert module0683.NIL != assertion_handles_oc.f11035(var271) : var271;
        final SubLObject var273 = assertion_handles_oc.f11025(var271);
        final SubLObject var274 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var272), (SubLObject)module0683.$ic494$, var273);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var274) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var274);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var275 = module0015.$g533$.currentBinding(var272);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var272);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var275, var272);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var271;
    }
    
    public static SubLObject f41805(final SubLObject var116) {
        final SubLObject var117 = module0656.f39970(var116);
        if (module0683.NIL == var117) {
            return module0656.f39789((SubLObject)module0683.$ic497$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var118 = module0289.f19396(var117);
        final SubLObject var119 = module0178.f11287(var117);
        return f41803(var118, var119, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41806(final SubLObject var74, SubLObject var75) {
        if (var75 == module0683.UNPROVIDED) {
            var75 = (SubLObject)module0683.NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic221$, (SubLObject)module0683.$ic499$, (SubLObject)module0683.$ic224$, var74, (SubLObject)module0683.$ic226$, var75, (SubLObject)module0683.$ic227$, (SubLObject)ConsesLow.list(new SubLObject[] { module0683.$ic50$, module0683.NIL, module0683.$ic54$, module0683.NIL, module0683.$ic58$, module0683.$ic500$, module0683.$ic171$, module0683.$ic501$, module0683.$ic158$, module0683.NIL, module0683.$ic111$, module0683.T, module0683.$ic133$, module0434.f30571(module0018.$g651$.getDynamicValue(var76)), module0683.$ic121$, module0683.$ic502$ })));
    }
    
    public static SubLObject f41807(final SubLObject var271, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic503$;
        }
        assert module0683.NIL != assertion_handles_oc.f11035(var271) : var271;
        final SubLObject var273 = assertion_handles_oc.f11025(var271);
        final SubLObject var274 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var272), (SubLObject)module0683.$ic504$, var273);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var274) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var274);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var275 = module0015.$g533$.currentBinding(var272);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var272);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var275, var272);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var271;
    }
    
    public static SubLObject f41808(final SubLObject var116) {
        final SubLObject var117 = module0656.f39970(var116);
        if (module0683.NIL == var117) {
            return module0656.f39789((SubLObject)module0683.$ic497$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var118 = module0211.f13686(var117);
        final SubLObject var119 = module0683.$ic312$;
        return f41806(var118, var119);
    }
    
    public static SubLObject f41809(final SubLObject var74, SubLObject var75) {
        if (var75 == module0683.UNPROVIDED) {
            var75 = (SubLObject)module0683.NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic221$, (SubLObject)module0683.$ic508$, (SubLObject)module0683.$ic224$, var74, (SubLObject)module0683.$ic226$, var75));
    }
    
    public static SubLObject f41810(final SubLObject var253, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic509$;
        }
        assert module0683.NIL != module0178.f11290(var253) : var253;
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)module0683.$ic511$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var254);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var257, var254);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var253;
    }
    
    public static SubLObject f41811(final SubLObject var116) {
        final SubLObject var117 = module0656.f39970(var116);
        if (module0683.NIL == var117) {
            return module0656.f39789((SubLObject)module0683.$ic514$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var118 = module0211.f13687(var117);
        final SubLObject var119 = module0683.$g5376$.getGlobalValue();
        return f41809(var118, var119);
    }
    
    public static SubLObject f41812(final SubLObject var74, SubLObject var75) {
        if (var75 == module0683.UNPROVIDED) {
            var75 = (SubLObject)module0683.NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic221$, (SubLObject)module0683.$ic516$, (SubLObject)module0683.$ic224$, var74, (SubLObject)module0683.$ic226$, var75));
    }
    
    public static SubLObject f41813(final SubLObject var253, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic517$;
        }
        assert module0683.NIL != module0178.f11290(var253) : var253;
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)module0683.$ic518$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var254);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var257, var254);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var253;
    }
    
    public static SubLObject f41814(final SubLObject var116) {
        final SubLObject var117 = module0656.f39970(var116);
        if (module0683.NIL == var117) {
            return module0656.f39789((SubLObject)module0683.$ic514$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var118 = module0211.f13689(var117);
        final SubLObject var119 = module0683.$g5376$.getGlobalValue();
        return f41812(var118, var119);
    }
    
    public static SubLObject f41815(final SubLObject var74, final SubLObject var75, final SubLObject var138, final SubLObject var140, SubLObject var76) {
        if (var76 == module0683.UNPROVIDED) {
            var76 = (SubLObject)module0683.$ic225$;
        }
        return f41721((SubLObject)ConsesLow.list(new SubLObject[] { module0683.$ic221$, module0683.$ic522$, module0683.$ic224$, var74, module0683.$ic226$, var75, module0683.$ic227$, var138, module0683.$ic228$, var140, module0683.$ic191$, var76 }));
    }
    
    public static SubLObject f41797(final SubLObject var74, final SubLObject var75, final SubLObject var328, SubLObject var76) {
        if (var76 == module0683.UNPROVIDED) {
            var76 = (SubLObject)module0683.$ic225$;
        }
        return f41721((SubLObject)ConsesLow.list(new SubLObject[] { module0683.$ic221$, module0683.$ic523$, module0683.$ic224$, var74, module0683.$ic226$, var75, module0683.$ic227$, var328, module0683.$ic191$, var76 }));
    }
    
    public static SubLObject f41816(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic525$);
        var117 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic525$);
        var118 = var120.first();
        var120 = var120.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic525$);
        var119 = var120.first();
        var120 = var120.rest();
        final SubLObject var121 = (SubLObject)(var120.isCons() ? var120.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var120, var116, (SubLObject)module0683.$ic525$);
        var120 = var120.rest();
        if (module0683.NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic525$);
            return (SubLObject)module0683.NIL;
        }
        SubLObject var122 = (SubLObject)module0683.NIL;
        SubLObject var123 = (SubLObject)module0683.NIL;
        SubLObject var124 = (SubLObject)module0683.NIL;
        SubLObject var125 = (SubLObject)module0683.NIL;
        var122 = module0656.f39943(var117, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL == module0173.f10955(var122)) {
            return module0656.f39789((SubLObject)module0683.$ic526$, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        var123 = reader.read_from_string_ignoring_errors(var118, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        if (!var123.isInteger()) {
            return module0656.f39789((SubLObject)module0683.$ic527$, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        var124 = module0656.f39943(var119, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL == module0173.f10955(var124)) {
            return module0656.f39789((SubLObject)module0683.$ic526$, var119, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL == var121) {
            var125 = module0683.$g5376$.getGlobalValue();
        }
        else {
            var125 = module0656.f39943(var121, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL == module0173.f10955(var125)) {
            return module0656.f39789((SubLObject)module0683.$ic526$, var121, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        return f41817(var122, var123, var124, var125);
    }
    
    public static SubLObject f41818(final SubLObject var116) {
        return f41816(var116);
    }
    
    public static SubLObject f41819(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var341, final SubLObject var75) {
        final SubLThread var342 = SubLProcess.currentSubLThread();
        final SubLObject var343 = module0202.f12782(var75, var338);
        final SubLObject var344 = (SubLObject)module0683.$ic533$;
        final SubLObject var345 = module0015.$g538$.currentBinding(var342);
        try {
            module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var342))) ? module0015.$g538$.getDynamicValue(var342) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var342);
            module0642.f39020((SubLObject)module0683.$ic230$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var342), module0655.$g5142$.getDynamicValue(var342));
            final SubLObject var346 = module0014.f672((SubLObject)module0683.$ic231$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var346) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var346);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            module0016.f941();
            if (module0683.NIL != var344) {
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var344);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_344 = module0015.$g535$.currentBinding(var342);
            try {
                module0015.$g535$.bind((SubLObject)module0683.T, var342);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0683.NIL != module0015.$g132$.getDynamicValue(var342)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var342)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_345 = module0015.$g533$.currentBinding(var342);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var342);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_346 = module0015.$g533$.currentBinding(var342);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var342);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_346, var342);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0683.NIL != var344) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019(var344);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var342));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_347 = module0015.$g533$.currentBinding(var342);
                    final SubLObject var347 = module0015.$g541$.currentBinding(var342);
                    final SubLObject var348 = module0015.$g539$.currentBinding(var342);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var342);
                        module0015.$g541$.bind((SubLObject)module0683.T, var342);
                        module0015.$g539$.bind(module0015.f797(), var342);
                        module0656.f39870((SubLObject)module0683.$ic531$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                        module0656.f39837((SubLObject)module0683.$ic539$, var343, (SubLObject)module0683.$ic540$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        f41820(var338, var75, (SubLObject)module0683.$ic541$);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        if (var340 != module0683.$ic542$ && var340 != module0683.$ic543$) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0683.$ic544$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            oc_cb_query_browser.f41966(var340);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        }
                        if (module0683.NIL == var339) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0683.$ic545$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else if (var341.numE((SubLObject)module0683.TWO_INTEGER)) {
                            final SubLObject var349 = Sequences.length(var339);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            if (var349.numE((SubLObject)module0683.ONE_INTEGER)) {
                                module0642.f39019((SubLObject)module0683.$ic546$);
                            }
                            else if (var349.numG((SubLObject)module0683.ONE_INTEGER)) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var342), (SubLObject)module0683.$ic547$, var349);
                            }
                            PrintLow.format(module0015.$g131$.getDynamicValue(var342), (SubLObject)module0683.$ic548$, module0233.f15355(var339.first().first()));
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            SubLObject var350 = (SubLObject)module0683.NIL;
                            SubLObject var351 = var339;
                            SubLObject var352 = (SubLObject)module0683.NIL;
                            var352 = var351.first();
                            while (module0683.NIL != var351) {
                                final SubLObject var353 = module0233.f15370(var352.first());
                                var350 = (SubLObject)ConsesLow.cons(var353, var350);
                                var351 = var351.rest();
                                var352 = var351.first();
                            }
                            var350 = (var351 = module0213.f13926(var350, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED));
                            SubLObject var354 = (SubLObject)module0683.NIL;
                            var354 = var351.first();
                            while (module0683.NIL != var351) {
                                if (module0683.NIL != module0018.$g714$.getDynamicValue(var342)) {
                                    module0656.f39915(var354, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                }
                                else {
                                    module0642.f39020(module0015.$g459$.getGlobalValue());
                                    module0656.f39915(var354, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39020(module0015.$g460$.getGlobalValue());
                                    module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                                    module0642.f39028((SubLObject)module0683.UNPROVIDED);
                                }
                                var351 = var351.rest();
                                var354 = var351.first();
                            }
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0683.$ic549$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            SubLObject var355 = var339;
                            SubLObject var356 = (SubLObject)module0683.NIL;
                            var356 = var355.first();
                            while (module0683.NIL != var355) {
                                final SubLObject var357 = conses_high.sublis(var356, var338, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                module0656.f39915(var357, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                                var355 = var355.rest();
                                var356 = var355.first();
                            }
                        }
                        module0015.f799(module0015.$g539$.getDynamicValue(var342));
                    }
                    finally {
                        module0015.$g539$.rebind(var348, var342);
                        module0015.$g541$.rebind(var347, var342);
                        module0015.$g533$.rebind(var20_347, var342);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_345, var342);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_344, var342);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var345, var342);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41817(final SubLObject var351, final SubLObject var336, final SubLObject var337, final SubLObject var75) {
        final SubLThread var352 = SubLProcess.currentSubLThread();
        final SubLObject var353 = module0225.f14739(var337);
        if (!var353.isInteger()) {
            return module0656.f39789((SubLObject)module0683.$ic550$, var337, var75, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        SubLObject var354 = (SubLObject)ConsesLow.list(var337);
        SubLObject var355;
        SubLObject var356;
        for (var355 = (SubLObject)module0683.NIL, var355 = (SubLObject)module0683.ZERO_INTEGER; var355.numL(var353); var355 = Numbers.add(var355, (SubLObject)module0683.ONE_INTEGER)) {
            var356 = Numbers.add(var355, (SubLObject)module0683.ONE_INTEGER);
            if (var356.numE(var336)) {
                var354 = (SubLObject)ConsesLow.cons(var351, var354);
            }
            else {
                var354 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var356, module0683.$g5377$.getGlobalValue()), var354);
            }
        }
        var354 = Sequences.nreverse(var354);
        var352.resetMultipleValues();
        final SubLObject var357 = f41821(var354, var75);
        final SubLObject var358 = var352.secondMultipleValue();
        var352.resetMultipleValues();
        f41819(var354, var357, var358, var353, var75);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41821(final SubLObject var74, final SubLObject var75) {
        final SubLObject var76 = (SubLObject)ConsesLow.list(new SubLObject[] { module0683.$ic158$, module0683.NIL, module0683.$ic93$, module0683.NIL, module0683.$ic162$, module0683.NIL, module0683.$ic121$, module0683.$ic551$, module0683.$ic50$, module0683.$g5378$.getGlobalValue(), module0683.$ic54$, module0683.NIL, module0683.$ic86$, module0683.NIL, module0683.$ic89$, module0683.$ic552$, module0683.$ic111$, module0683.T, module0683.$ic184$, module0683.NIL, module0683.$ic553$, module0683.$ic551$, module0683.$ic133$, module0683.$ic554$, module0683.$ic77$, module0683.$ic555$ });
        return module0409.f28506(var74, var75, var76);
    }
    
    public static SubLObject f41822(final SubLObject var335) {
        final SubLThread var336 = SubLProcess.currentSubLThread();
        final SubLObject var337 = Hashtables.make_hash_table((SubLObject)module0683.$ic556$, Symbols.symbol_function((SubLObject)module0683.EQUAL), (SubLObject)module0683.UNPROVIDED);
        SubLObject var338 = (SubLObject)module0683.NIL;
        SubLObject var339 = module0259.f16842(var335);
        SubLObject var340 = (SubLObject)module0683.NIL;
        var340 = var339.first();
        while (module0683.NIL != var339) {
            SubLObject var104_360;
            final SubLObject var341 = var104_360 = module0259.f16932(var335, var340, (SubLObject)module0683.UNPROVIDED);
            SubLObject var342 = (SubLObject)module0683.NIL;
            var342 = var104_360.first();
            while (module0683.NIL != var104_360) {
                module0030.f1600(var342, var340, var337, (SubLObject)module0683.UNPROVIDED);
                var104_360 = var104_360.rest();
                var342 = var104_360.first();
            }
            var339 = var339.rest();
            var340 = var339.first();
        }
        var338 = Sort.sort(module0030.f1625(var337), Symbols.symbol_function((SubLObject)module0683.$ic557$), (SubLObject)module0683.UNPROVIDED);
        final SubLObject var343 = (SubLObject)module0683.$ic533$;
        final SubLObject var344 = module0015.$g538$.currentBinding(var336);
        try {
            module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var336))) ? module0015.$g538$.getDynamicValue(var336) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var336);
            module0642.f39020((SubLObject)module0683.$ic230$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var336), module0655.$g5142$.getDynamicValue(var336));
            final SubLObject var345 = module0014.f672((SubLObject)module0683.$ic231$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var345) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var345);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            module0016.f941();
            if (module0683.NIL != var343) {
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var343);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_362 = module0015.$g535$.currentBinding(var336);
            try {
                module0015.$g535$.bind((SubLObject)module0683.T, var336);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0683.NIL != module0015.$g132$.getDynamicValue(var336)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var336)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_363 = module0015.$g533$.currentBinding(var336);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var336);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_364 = module0015.$g533$.currentBinding(var336);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var336);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_364, var336);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0683.NIL != var343) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019(var343);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0656.f39870((SubLObject)module0683.$ic531$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)module0683.$ic558$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                    module0656.f39804((SubLObject)ConsesLow.listS(module0683.$ic559$, var335, (SubLObject)module0683.$ic560$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                    SubLObject var346 = var338;
                    SubLObject var347 = (SubLObject)module0683.NIL;
                    var347 = var346.first();
                    while (module0683.NIL != var346) {
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)module0683.$ic561$);
                        module0656.f39915(var347, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic237$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        final SubLObject var348 = conses_high.set_difference(module0262.f17327(var347, var338, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), (SubLObject)ConsesLow.list(var347), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        if (module0683.NIL != var348) {
                            module0642.f39019((SubLObject)module0683.$ic562$);
                            SubLObject var104_361 = var348;
                            SubLObject var349 = (SubLObject)module0683.NIL;
                            var349 = var104_361.first();
                            while (module0683.NIL != var104_361) {
                                module0642.f39019((SubLObject)module0683.$ic563$);
                                module0656.f39915(var349, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                                var104_361 = var104_361.rest();
                                var349 = var104_361.first();
                            }
                            module0642.f39019((SubLObject)module0683.$ic564$);
                        }
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic565$);
                        SubLObject var104_362;
                        final SubLObject var350 = var104_362 = Sort.sort(Hashtables.gethash(var347, var337, (SubLObject)module0683.UNPROVIDED), Symbols.symbol_function((SubLObject)module0683.$ic566$), (SubLObject)module0683.UNPROVIDED);
                        SubLObject var351 = (SubLObject)module0683.NIL;
                        var351 = var104_362.first();
                        while (module0683.NIL != var104_362) {
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            final SubLObject var352 = module0217.f14421((SubLObject)ConsesLow.list(module0683.$ic559$, var335, var351), var347);
                            if (module0683.NIL != var352) {
                                module0656.f39850(var352);
                            }
                            module0656.f39915(var351, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                            module0642.f39019((SubLObject)module0683.$ic563$);
                            var104_362 = var104_362.rest();
                            var351 = var104_362.first();
                        }
                        module0642.f39019((SubLObject)module0683.$ic564$);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        var346 = var346.rest();
                        var347 = var346.first();
                    }
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_363, var336);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_362, var336);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var344, var336);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41823(final SubLObject var351, final SubLObject var336, final SubLObject var337, final SubLObject var372) {
        if (var372.eql((SubLObject)module0683.$ic567$)) {
            if (module0683.NIL != module0004.f104(var336, (SubLObject)module0683.$ic568$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED)) {
                if (module0683.NIL != module0333.f22416(var337)) {
                    return (SubLObject)module0683.$ic569$;
                }
                if (module0683.NIL != f41824(var337)) {
                    return (SubLObject)module0683.$ic570$;
                }
            }
        }
        else if (var372.eql((SubLObject)module0683.$ic571$)) {
            if (module0683.NIL != module0333.f22416(var337)) {
                return (SubLObject)module0683.$ic569$;
            }
            if (module0683.NIL != f41824(var337)) {
                return (SubLObject)module0683.$ic570$;
            }
        }
        else if (var372.eql((SubLObject)module0683.$ic572$)) {
            if (module0217.f14221(var351, var336, var337, (SubLObject)module0683.UNPROVIDED).numG((SubLObject)module0683.ZERO_INTEGER)) {
                return (SubLObject)module0683.$ic573$;
            }
            if (module0683.NIL != module0333.f22416(var337)) {
                return (SubLObject)module0683.$ic569$;
            }
            if (module0683.NIL != f41824(var337)) {
                return (SubLObject)module0683.$ic570$;
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41824(final SubLObject var337) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0217.f14264(var337, (SubLObject)module0683.$ic574$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED).numG((SubLObject)module0683.ZERO_INTEGER) || module0217.f14221(var337, (SubLObject)module0683.TWO_INTEGER, module0683.$ic575$, (SubLObject)module0683.UNPROVIDED).numG((SubLObject)module0683.ZERO_INTEGER));
    }
    
    public static SubLObject f41820(final SubLObject var373, final SubLObject var75, SubLObject var374) {
        if (var374 == module0683.UNPROVIDED) {
            var374 = (SubLObject)module0683.$ic576$;
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(var374);
        module0642.f39019((SubLObject)module0683.$ic577$);
        module0656.f39915(var75, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39019((SubLObject)module0683.$ic578$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0656.f39915(var373, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41735(final SubLObject var99, final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        if (module0683.NIL != oc_inference_datastructures_inference.f25429(var99) && module0683.NIL != module0683.$g5352$.getGlobalValue()) {
            final SubLObject var171 = oc_inference_datastructures_inference.f25583(var99);
            final SubLObject var172 = oc_inference_datastructures_inference.f25422(var99);
            final SubLObject var173 = (SubLObject)((module0683.NIL != oc_inference_datastructures_inference.f25674(var99)) ? module0683.$ic319$ : module0683.$ic579$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g420$.getGlobalValue());
            module0642.f39020(module0015.$g429$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var170), (SubLObject)module0683.$ic580$, var171, var172);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g427$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic581$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g430$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic582$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g424$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var173);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g423$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g426$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g425$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var174 = module0015.$g533$.currentBinding(var170);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var170);
            }
            finally {
                module0015.$g533$.rebind(var174, var170);
            }
            module0642.f39020(module0015.$g421$.getGlobalValue());
        }
        else {
            final SubLObject var175 = (SubLObject)((module0683.NIL != var169) ? module0683.$ic583$ : module0683.$ic584$);
            f41825(var99, var175, (SubLObject)module0683.NIL);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41826(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (module0683.NIL == var120) {
            final SubLObject var121 = f41672(var118, var119);
            if (module0683.NIL == var121) {
                return module0656.f39789((SubLObject)module0683.$ic585$, var119, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            final SubLObject var122 = (SubLObject)((module0683.NIL != oc_inference_datastructures_inference.f25429(var121)) ? module0683.$g5379$.getGlobalValue() : module0683.NIL);
            final SubLObject var123 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var117);
                module0642.f39020((SubLObject)module0683.$ic230$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var124 = module0014.f672((SubLObject)module0683.$ic231$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != var124) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(var124);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var117), (SubLObject)module0683.$ic586$, var118, var119);
                module0642.f39020(module0015.$g174$.getGlobalValue());
                if (module0683.NIL != var122) {
                    module0642.f39055(var122);
                }
                module0016.f892();
                module0016.f895();
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_378 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)module0683.T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_379 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var117);
                        f41825(var121, (SubLObject)module0683.$ic587$, (SubLObject)module0683.T);
                        module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_379, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_378, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var123, var117);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41825(final SubLObject var1, final SubLObject var375, final SubLObject var380) {
        f41827(var1, var375);
        if (module0683.NIL == var380 && module0683.NIL != oc_inference_datastructures_inference.f25431(var1)) {
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            f41678((SubLObject)module0683.$ic345$, (SubLObject)module0683.$ic346$, (SubLObject)module0683.$ic347$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var380 && module0683.NIL == oc_inference_datastructures_inference.f25429(var1)) {
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            module0656.f39837((SubLObject)module0683.$ic214$, (SubLObject)module0683.$ic589$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        f41828(var1, module0683.$g5380$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41827(final SubLObject var1, final SubLObject var375) {
        final SubLThread var376 = SubLProcess.currentSubLThread();
        module0642.f39021((SubLObject)module0683.$ic590$);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        f41689(var1, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var377 = oc_inference_datastructures_inference.f25420(var1);
        if (var377.eql((SubLObject)module0683.$ic295$)) {
            module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
            if (var375.eql((SubLObject)module0683.$ic583$)) {
                module0656.f39837((SubLObject)module0683.$ic214$, (SubLObject)module0683.$ic591$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            else if (var375.eql((SubLObject)module0683.$ic584$)) {
                module0656.f39837((SubLObject)module0683.$ic214$, (SubLObject)module0683.$ic592$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                module0642.f39032((SubLObject)module0683.UNPROVIDED);
                module0656.f39837((SubLObject)module0683.$ic593$, var1, (SubLObject)module0683.$ic594$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            else if (var375.eql((SubLObject)module0683.$ic587$)) {}
            module0642.f39032((SubLObject)module0683.UNPROVIDED);
            module0656.f39837((SubLObject)module0683.$ic595$, var1, (SubLObject)module0683.$ic596$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            module0642.f39032((SubLObject)module0683.UNPROVIDED);
            module0656.f39837((SubLObject)module0683.$ic597$, var1, (SubLObject)module0683.$ic598$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            module0642.f39032((SubLObject)module0683.UNPROVIDED);
            final SubLObject var378 = oc_inference_datastructures_inference.f25705(var1, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var378) {
                module0642.f39026((SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != module0004.f106(var378)) {
                    module0642.f39021((SubLObject)module0683.$ic599$);
                    module0642.f39019(module0051.f3602(var378));
                }
                else {
                    module0642.f39021((SubLObject)module0683.$ic600$);
                    final SubLObject var379 = (SubLObject)module0683.$ic601$;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0683.NIL != var379) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39042(var379));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var380 = module0015.$g533$.currentBinding(var376);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var376);
                        module0642.f39019(module0051.f3602(Numbers.minus(var378)));
                    }
                    finally {
                        module0015.$g533$.rebind(var380, var376);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41828(final SubLObject var1, SubLObject var384) {
        if (var384 == module0683.UNPROVIDED) {
            var384 = (SubLObject)module0683.NIL;
        }
        final SubLThread var385 = SubLProcess.currentSubLThread();
        final SubLObject var386 = oc_inference_datastructures_inference.f25653(var1);
        final SubLObject var387 = oc_inference_datastructures_inference.f25663(var1);
        final SubLObject var388 = oc_inference_datastructures_inference.f25665(var1);
        final SubLObject var389 = (SubLObject)module0683.$ic266$;
        if (var386.isZero() || module0683.NIL == oc_inference_datastructures_inference.f25590(var1)) {
            oc_cb_query_browser.f41987(var1, (SubLObject)module0683.NIL);
        }
        else {
            module0016.f920((SubLObject)module0683.$ic602$, (SubLObject)module0683.$ic260$, (SubLObject)module0683.$ic261$);
            final SubLObject var390 = (SubLObject)module0683.FOUR_INTEGER;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0683.NIL != var390) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var390);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var391 = module0015.$g533$.currentBinding(var385);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var385);
                module0642.f39021((SubLObject)module0683.$ic277$);
            }
            finally {
                module0015.$g533$.rebind(var391, var385);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)module0683.$ic603$);
            f41688(var386, var387, var388);
            module0642.f39019((SubLObject)module0683.$ic564$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            if (module0683.NIL != oc_inference_datastructures_inference.f25615(var1)) {
                module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
                module0642.f39021((SubLObject)module0683.$ic281$);
                if (var384.isInteger()) {
                    module0642.f39032((SubLObject)module0683.ONE_INTEGER);
                    module0656.f39837((SubLObject)module0683.$ic604$, var1, (SubLObject)module0683.$ic605$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39032((SubLObject)module0683.ONE_INTEGER);
                module0656.f39837((SubLObject)module0683.$ic606$, var1, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != module0691.f42308(var1)) {
                    module0642.f39032((SubLObject)module0683.ONE_INTEGER);
                    module0656.f39837((SubLObject)module0683.$ic607$, var1, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                if (oc_inference_datastructures_inference.f25653(var1).numGE((SubLObject)module0683.ONE_INTEGER)) {
                    module0642.f39032((SubLObject)module0683.ONE_INTEGER);
                    module0656.f39837((SubLObject)module0683.$ic608$, var1, (SubLObject)module0683.$ic609$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                if (oc_inference_datastructures_inference.f25653(var1).numG((SubLObject)module0683.ONE_INTEGER)) {
                    module0642.f39032((SubLObject)module0683.ONE_INTEGER);
                    module0656.f39837((SubLObject)module0683.$ic610$, var1, (SubLObject)module0683.$ic611$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
            }
            module0016.f908((SubLObject)module0683.$ic602$, var389, (SubLObject)module0683.$ic267$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic602$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var392 = module0015.$g533$.currentBinding(var385);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var385);
                oc_cb_query_browser.f41987(var1, var384);
            }
            finally {
                module0015.$g533$.rebind(var392, var385);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41829(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        return f41830();
    }
    
    public static SubLObject f41831(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic594$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic613$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)module0683.$ic613$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic614$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41830() {
        SubLObject var386;
        final SubLObject var385 = var386 = f41707();
        final SubLObject var387 = (SubLObject)(var386.isCons() ? var386.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var386, var385, (SubLObject)module0683.$ic208$);
        final SubLObject var388;
        var386 = (var388 = var386.rest());
        if (module0683.NIL != var387 && module0683.$ic295$ == oc_inference_datastructures_inference.f25420(var387)) {
            return f41721((SubLObject)ConsesLow.list((SubLObject)module0683.$ic223$, module0683.$g5379$.getGlobalValue()));
        }
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41832(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic616$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic617$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41833(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (module0683.NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var121 = f41672(var118, var119);
        if (module0683.NIL == var121) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var119, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var122 = module0015.$g538$.currentBinding(var117);
        try {
            module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var117);
            module0642.f39020((SubLObject)module0683.$ic230$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
            final SubLObject var123 = module0014.f672((SubLObject)module0683.$ic231$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var123) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var123);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var117), (SubLObject)module0683.$ic619$, var118, var119);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0016.f892();
            module0016.f895();
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_389 = module0015.$g535$.currentBinding(var117);
            try {
                module0015.$g535$.bind((SubLObject)module0683.T, var117);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_390 = module0015.$g533$.currentBinding(var117);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var117);
                    f41801(var121);
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_390, var117);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_389, var117);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var122, var117);
        }
        return var121;
    }
    
    public static SubLObject f41801(final SubLObject var1) {
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39021((SubLObject)module0683.$ic621$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
        module0656.f39837((SubLObject)module0683.$ic604$, var1, (SubLObject)module0683.$ic592$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0656.f39837((SubLObject)module0683.$ic214$, (SubLObject)module0683.$ic540$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        oc_cb_query_browser.f41964(var1, (SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        module0642.f39021((SubLObject)module0683.$ic590$);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        f41689(var1, (SubLObject)module0683.UNPROVIDED);
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        f41828(var1, (SubLObject)module0683.NIL);
        return var1;
    }
    
    public static SubLObject f41834(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)module0683.$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (module0683.NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (module0683.NIL == var120) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var118, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        f41712(var120);
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41835(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic273$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic623$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)module0683.$ic623$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic624$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41836(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)module0683.$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (module0683.NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (module0683.NIL == var120) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var118, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        f41715();
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41837(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic283$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic627$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)module0683.$ic627$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic628$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41838(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (module0683.NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var121 = f41672(var118, var119);
        if (module0683.NIL == var121) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var119, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        SubLObject var122 = (SubLObject)module0683.NIL;
        try {
            var117.throwStack.push(module0683.$ic210$);
            final SubLObject var123 = Errors.$error_handler$.currentBinding(var117);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0683.$ic211$), var117);
                try {
                    if (module0683.NIL != oc_inference_datastructures_inference.f25429(var121)) {
                        module0408.f28400(var121, (SubLObject)module0683.NIL);
                    }
                }
                catch (Throwable var124) {
                    Errors.handleThrowable(var124, (SubLObject)module0683.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var123, var117);
            }
        }
        catch (Throwable var125) {
            var122 = Errors.handleThrowable(var125, (SubLObject)module0683.$ic210$);
        }
        finally {
            var117.throwStack.pop();
        }
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41839(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic596$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic631$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41840(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (module0683.NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var121 = f41672(var118, var119);
        if (module0683.NIL == var121) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var119, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        SubLObject var122 = (SubLObject)module0683.NIL;
        try {
            var117.throwStack.push(module0683.$ic210$);
            final SubLObject var123 = Errors.$error_handler$.currentBinding(var117);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0683.$ic211$), var117);
                try {
                    if (module0683.NIL != oc_inference_datastructures_inference.f25429(var121)) {
                        module0408.f28440(var121);
                    }
                }
                catch (Throwable var124) {
                    Errors.handleThrowable(var124, (SubLObject)module0683.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var123, var117);
            }
        }
        catch (Throwable var125) {
            var122 = Errors.handleThrowable(var125, (SubLObject)module0683.$ic210$);
        }
        finally {
            var117.throwStack.pop();
        }
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41841(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic598$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic634$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41842(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)module0683.$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (module0683.NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (module0683.NIL == var120) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var118, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        f41713(var120);
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41843(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic637$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic638$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41844(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        SubLObject var117 = f41707();
        SubLObject var118 = (SubLObject)module0683.NIL;
        var118 = var117.first();
        while (module0683.NIL != var117) {
            if (module0683.NIL != var118) {
                f41713(var118);
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        f41715();
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41845(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic642$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic643$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41846(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = f41707();
        final SubLObject var119 = (SubLObject)(var118.isCons() ? var118.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var118, var117, (SubLObject)module0683.$ic208$);
        var118 = var118.rest();
        SubLObject var121;
        final SubLObject var120 = var121 = var118;
        SubLObject var122 = (SubLObject)module0683.NIL;
        var122 = var121.first();
        while (module0683.NIL != var121) {
            f41713(var122);
            var121 = var121.rest();
            var122 = var121.first();
        }
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41847(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic642$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic647$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41848(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)module0683.$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (module0683.NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (module0683.NIL == var120) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var118, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        f41719(var120);
        return module0656.f39792((SubLObject)module0683.$ic650$, (SubLObject)module0683.ONE_INTEGER, (SubLObject)module0683.$ic651$);
    }
    
    public static SubLObject f41849(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic653$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic654$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)module0683.$ic654$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic655$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41850(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0683.NIL != module0048.f3287(oc_inference_datastructures_inference.f25523(var1)) && module0683.NIL != module0004.f105(oc_inference_datastructures_inference.f25653(var1)));
    }
    
    public static SubLObject f41851(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)module0683.$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (module0683.NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (module0683.NIL == var120) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var118, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        f41717(var120);
        SubLObject var121 = f41707();
        SubLObject var1_409 = (SubLObject)module0683.NIL;
        var1_409 = var121.first();
        while (module0683.NIL != var121) {
            if (module0683.NIL != var1_409 && module0683.NIL == oc_inference_datastructures_inference.f25417(var1_409)) {
                f41713(var1_409);
            }
            var121 = var121.rest();
            var1_409 = var121.first();
        }
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41852(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic275$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic659$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)module0683.$ic659$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic660$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41853(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        SubLObject var117 = f41707();
        SubLObject var118 = (SubLObject)module0683.NIL;
        var118 = var117.first();
        while (module0683.NIL != var117) {
            if (module0683.NIL != var118) {
                f41717(var118);
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        f41715();
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41854(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic271$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic663$.isString()) {
            final SubLObject var25 = module0644.f39202((SubLObject)module0683.$ic663$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)module0683.$ic664$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var24) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var24);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var26 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var26, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41855(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = f41707();
        final SubLObject var119 = (SubLObject)(var118.isCons() ? var118.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var118, var117, (SubLObject)module0683.$ic667$);
        var118 = var118.rest();
        SubLObject var121;
        final SubLObject var120 = var121 = var118;
        SubLObject var122 = (SubLObject)module0683.NIL;
        var122 = var121.first();
        while (module0683.NIL != var121) {
            f41717(var122);
            var121 = var121.rest();
            var122 = var121.first();
        }
        return f41721((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41856(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic271$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic669$.isString()) {
            final SubLObject var25 = module0644.f39202((SubLObject)module0683.$ic669$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)module0683.$ic670$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var24) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var24);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var26 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var26, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41857(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic672$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic11$);
        if (module0683.$ic673$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)module0683.$ic673$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic674$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41858(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = var116;
        SubLObject var119 = (SubLObject)module0683.NIL;
        SubLObject var120 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0683.$ic3$);
        var119 = var118.first();
        var118 = var118.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)module0683.$ic3$);
        var120 = var118.first();
        var118 = var118.rest();
        if (module0683.NIL == var118) {
            final SubLObject var121 = f41672(var119, var120);
            final SubLObject var122 = oc_inference_datastructures_inference.f25594(var121);
            module0677.f41372((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0683.$ic677$, var122)));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var117, (SubLObject)module0683.$ic3$);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41859(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic679$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = (SubLObject)((module0683.NIL != Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { module0683.$ic1$, module0006.f203(var25) })) ? module0656.f39832(Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { module0683.$ic1$, module0006.f203(var25) })) : module0683.NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic680$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic681$);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic680$, var24, var25);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic682$);
        if (module0683.NIL != Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { module0683.$ic1$, module0006.f203(var25) })) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic683$, Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { module0683.$ic1$, module0006.f203(var25) }));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic684$);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic685$, module0692.f42406(module0692.$g5381$.getGlobalValue(), module0692.$g5382$.getGlobalValue()));
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic686$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41860(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)module0683.$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (module0683.NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (module0683.NIL == var120) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var118, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        return f41861(var120);
    }
    
    public static SubLObject f41861(final SubLObject var1) {
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var2 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var3 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var4 = module0665.f40428((SubLObject)module0683.UNPROVIDED);
        module0665.f40421((SubLObject)module0683.$ic689$, var4, Sequences.cconcatenate(module0006.f203(var2), new SubLObject[] { module0683.$ic1$, module0006.f203(var3) }));
        module0665.f40421((SubLObject)module0683.$ic690$, var4, var2);
        module0665.f40421((SubLObject)module0683.$ic691$, var4, var3);
        module0691.f42309(var1);
        module0692.f42401(var4);
        module0004.f78((SubLObject)module0683.$ic692$, Symbols.symbol_function((SubLObject)module0683.$ic693$), (SubLObject)ConsesLow.list(var4));
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41862(final SubLObject var418) {
        final SubLObject var419 = (SubLObject)module0683.$ic694$;
        final SubLObject var420 = Packages.intern(module0038.f2968(var419), (SubLObject)module0683.$ic196$);
        final SubLObject var421 = module0665.f40419((SubLObject)module0683.$ic689$, var418);
        module0691.f42322(var421, (SubLObject)ConsesLow.list(module0692.$g5383$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0683.$ic695$, var420, (SubLObject)module0683.$ic696$, (SubLObject)ConsesLow.list((SubLObject)module0683.$ic690$, module0665.f40419((SubLObject)module0683.$ic690$, var418), (SubLObject)module0683.$ic691$, module0665.f40419((SubLObject)module0683.$ic691$, var418)))));
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41863(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = module0642.f39104((SubLObject)module0683.$ic697$, var116);
        final SubLObject var119 = module0642.f39104((SubLObject)module0683.$ic698$, var116);
        final SubLObject var120 = f41672(var118, var119);
        SubLObject var121 = module0642.f39104((SubLObject)module0683.$ic699$, var116);
        final SubLObject var122 = reader.read_from_string(module0642.f39104((SubLObject)module0683.$ic700$, var116), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var123 = module0642.f39104((SubLObject)module0683.$ic701$, var116);
        final SubLObject var124 = module0642.f39112((SubLObject)module0683.$ic702$, var116, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var121) {
            var121 = reader.read_from_string(var121, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL == var120) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var119, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (var122 == module0683.$ic703$ && module0683.NIL == module0038.f2611(var123)) {
            return module0656.f39789((SubLObject)module0683.$ic704$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var125 = var121;
        if (var125.eql((SubLObject)module0683.$ic705$) || var125.eql((SubLObject)module0683.$ic706$) || var125.eql((SubLObject)module0683.$ic707$)) {
            SubLObject var126 = (SubLObject)module0683.NIL;
            try {
                var117.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var127 = Errors.$error_handler$.currentBinding(var117);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0683.$ic708$, var117);
                    try {
                        f41864(var120, var122, var123, var121, (SubLObject)module0683.NIL, var124);
                    }
                    catch (Throwable var128) {
                        Errors.handleThrowable(var128, (SubLObject)module0683.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var127, var117);
                }
            }
            catch (Throwable var129) {
                var126 = Errors.handleThrowable(var129, module0003.$g3$.getGlobalValue());
            }
            finally {
                var117.throwStack.pop();
            }
            if (module0683.NIL != var126) {
                module0656.f39789((SubLObject)module0683.$ic709$, var126, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
        }
        else if (var125.eql((SubLObject)module0683.$ic710$)) {
            SubLObject var130 = module0642.f39111((SubLObject)module0683.$ic711$, var116, (SubLObject)module0683.UNPROVIDED);
            SubLObject var131 = (SubLObject)module0683.NIL;
            try {
                var130 = reader.read_from_string(var130, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                var131 = f41864(var120, var122, var123, (SubLObject)module0683.$ic706$, var130, var124);
            }
            finally {
                final SubLObject var132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var117);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0683.T, var117);
                    if (module0683.NIL == var131) {
                        module0642.f39021((SubLObject)module0683.$ic712$);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39019((SubLObject)module0683.$ic713$);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        module0656.f39790((SubLObject)module0683.$ic11$, (SubLObject)module0683.$ic714$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var132, var117);
                }
            }
        }
        else {
            final SubLObject var133 = (SubLObject)module0683.$ic715$;
            final SubLObject var127 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var117);
                module0642.f39020((SubLObject)module0683.$ic230$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var134 = module0014.f672((SubLObject)module0683.$ic231$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != var134) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(var134);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                module0016.f941();
                if (module0683.NIL != var133) {
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var133);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_428 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)module0683.T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0683.NIL != module0015.$g132$.getDynamicValue(var117)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic234$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_429 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var117);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic535$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_430 = module0015.$g533$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var117);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic536$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic537$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic538$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_430, var117);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0683.NIL != var133) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39019(var133);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)module0683.$ic716$);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        module0656.f39790((SubLObject)module0683.$ic11$, (SubLObject)module0683.$ic714$);
                        module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var20_429, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_428, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var127, var117);
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41864(final SubLObject var1, final SubLObject var423, final SubLObject var424, final SubLObject var422, final SubLObject var426, final SubLObject var425) {
        final SubLThread var427 = SubLProcess.currentSubLThread();
        if (var423.eql((SubLObject)module0683.$ic718$)) {
            return module0411.f28601(var1, module0015.$g131$.getDynamicValue(var427), var422, var426, var425);
        }
        if (var423.eql((SubLObject)module0683.$ic703$)) {
            final SubLObject var428 = module0411.f28600(var1, var424, var422, (SubLObject)module0683.$ic719$, var426, var425);
            module0656.f39793(Sequences.cconcatenate((SubLObject)module0683.$ic720$, new SubLObject[] { module0006.f203(var424), module0683.$ic399$ }), (SubLObject)module0683.T);
            return var428;
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41865(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (module0683.NIL == var120) {
            final SubLObject var121 = (SubLObject)module0683.$ic723$;
            final SubLObject var122 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var117);
                module0642.f39020((SubLObject)module0683.$ic230$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var123 = module0014.f672((SubLObject)module0683.$ic231$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != var123) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(var123);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                module0016.f941();
                if (module0683.NIL != var121) {
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var121);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_433 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)module0683.T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0683.NIL != module0015.$g132$.getDynamicValue(var117)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic234$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_434 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var117);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic535$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_435 = module0015.$g533$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var117);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic536$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic537$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic538$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_435, var117);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0683.NIL != var121) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39019(var121);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        }
                        final SubLObject var124 = module0656.f39832((SubLObject)module0683.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var117));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic235$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        if (module0683.NIL != var124) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(var124);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_436 = module0015.$g533$.currentBinding(var117);
                        final SubLObject var125 = module0015.$g541$.currentBinding(var117);
                        final SubLObject var126 = module0015.$g539$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var117);
                            module0015.$g541$.bind((SubLObject)module0683.T, var117);
                            module0015.$g539$.bind(module0015.f797(), var117);
                            module0642.f39069((SubLObject)module0683.$ic724$, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39069((SubLObject)module0683.$ic697$, var118, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39069((SubLObject)module0683.$ic698$, var119, (SubLObject)module0683.UNPROVIDED);
                            module0656.f39870((SubLObject)module0683.$ic721$, (SubLObject)module0683.NIL, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39021((SubLObject)module0683.$ic725$);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39072((SubLObject)module0683.$ic699$, (SubLObject)module0683.$ic726$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic727$);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39072((SubLObject)module0683.$ic699$, (SubLObject)module0683.$ic728$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic729$);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39072((SubLObject)module0683.$ic699$, (SubLObject)module0683.$ic730$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic731$);
                            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39021((SubLObject)module0683.$ic732$);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39072((SubLObject)module0683.$ic700$, (SubLObject)module0683.$ic733$, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic734$);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39072((SubLObject)module0683.$ic700$, (SubLObject)module0683.$ic735$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic736$);
                            module0642.f39027((SubLObject)module0683.$ic737$, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39075((SubLObject)module0683.$ic701$, (SubLObject)module0683.NIL, (SubLObject)module0683.$ic738$);
                            module0644.f39184((SubLObject)module0683.$ic701$, (SubLObject)module0683.$ic739$);
                            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39021((SubLObject)module0683.$ic740$);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39068((SubLObject)module0683.$ic702$, (SubLObject)module0683.$ic741$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic742$);
                            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39021((SubLObject)module0683.$ic743$);
                            module0642.f39019((SubLObject)module0683.$ic731$);
                            module0642.f39021((SubLObject)module0683.$ic237$);
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g336$.getGlobalValue());
                            module0642.f39020(module0015.$g338$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic711$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic738$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g339$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.TEN_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_437 = module0015.$g533$.currentBinding(var117);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var117);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_437, var117);
                            }
                            module0642.f39020(module0015.$g337$.getGlobalValue());
                            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39073((SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39074((SubLObject)module0683.$ic744$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                            module0015.f799(module0015.$g539$.getDynamicValue(var117));
                        }
                        finally {
                            module0015.$g539$.rebind(var126, var117);
                            module0015.$g541$.rebind(var125, var117);
                            module0015.$g533$.rebind(var20_436, var117);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var20_434, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_433, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var122, var117);
            }
            return (SubLObject)module0683.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41866(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic746$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = (SubLObject)module0683.NIL;
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic747$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic681$);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic747$, var24, var25);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic682$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic684$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic685$, (SubLObject)module0683.$ic6$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic686$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41867(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        if (module0683.NIL != module0035.f1998(var116)) {
            SubLObject var118 = (SubLObject)module0683.NIL;
            SubLObject var119 = (SubLObject)module0683.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
            var118 = var116.first();
            SubLObject var120 = var116.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic3$);
            var119 = var120.first();
            var120 = var120.rest();
            if (module0683.NIL == var120) {
                var117 = module0665.f40428((SubLObject)module0683.UNPROVIDED);
                module0665.f40421((SubLObject)module0683.$ic749$, var117, reader.read_from_string_ignoring_errors(var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED));
                module0665.f40421((SubLObject)module0683.$ic691$, var117, reader.read_from_string_ignoring_errors(var119, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
            }
        }
        else {
            var117 = module0665.f40432(var116);
        }
        return f41868(var117);
    }
    
    public static SubLObject f41868(final SubLObject var418) {
        final SubLThread var419 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)module0683.$ic230$);
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var419), module0655.$g5142$.getDynamicValue(var419));
        final SubLObject var420 = module0014.f672((SubLObject)module0683.$ic231$);
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic232$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var420) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var420);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic233$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var419), (SubLObject)module0683.$ic751$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0016.f892();
        module0016.f895();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        final SubLObject var421 = module0015.$g535$.currentBinding(var419);
        try {
            module0015.$g535$.bind((SubLObject)module0683.T, var419);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_440 = module0015.$g533$.currentBinding(var419);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var419);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39021((SubLObject)module0683.$ic751$);
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                SubLObject var422 = (SubLObject)module0683.NIL;
                if (module0683.NIL != module0665.f40419((SubLObject)module0683.$ic752$, var418)) {
                    var422 = (SubLObject)module0683.T;
                    if (module0683.NIL == module0665.f40419((SubLObject)module0683.$ic753$, var418)) {
                        var422 = (SubLObject)module0683.NIL;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0683.NIL != module0015.$g495$.getGlobalValue()) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_441 = module0015.$g533$.currentBinding(var419);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var419);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)module0683.$ic754$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_441, var419);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                    }
                    if (module0683.NIL == module0665.f40419((SubLObject)module0683.$ic755$, var418)) {
                        var422 = (SubLObject)module0683.NIL;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (module0683.NIL != module0015.$g495$.getGlobalValue()) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_442 = module0015.$g533$.currentBinding(var419);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var419);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)module0683.$ic756$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_442, var419);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                    }
                }
                final SubLObject var423 = module0665.f40419((SubLObject)module0683.$ic749$, var418);
                final SubLObject var424 = module0665.f40419((SubLObject)module0683.$ic691$, var418);
                final SubLObject var425 = module0361.f24195(var423, var424);
                if (module0683.NIL == oc_inference_datastructures_inference.f25275(var425)) {
                    return module0656.f39789((SubLObject)module0683.$ic585$, var424, var423, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                if (module0683.NIL == var422) {
                    final SubLObject var426 = module0656.f39832((SubLObject)module0683.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var419));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic235$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    if (module0683.NIL != var426) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(var426);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_443 = module0015.$g533$.currentBinding(var419);
                    final SubLObject var427 = module0015.$g541$.currentBinding(var419);
                    final SubLObject var428 = module0015.$g539$.currentBinding(var419);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var419);
                        module0015.$g541$.bind((SubLObject)module0683.T, var419);
                        module0015.$g539$.bind(module0015.f797(), var419);
                        module0642.f39069((SubLObject)module0683.$ic758$, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED);
                        module0665.f40440(var418, (SubLObject)module0683.$ic749$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0665.f40440(var418, (SubLObject)module0683.$ic691$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0656.f39804(var425, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        module0656.f39804(oc_inference_datastructures_inference.f25485(var425), (SubLObject)module0683.NIL, (SubLObject)module0683.T);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic577$);
                        module0656.f39804(oc_inference_datastructures_inference.f25484(var425), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        module0665.f40445(var418, (SubLObject)module0683.$ic744$, (SubLObject)module0683.$ic752$, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        var419.resetMultipleValues();
                        final SubLObject var429 = oc_cb_query_browser.f41988(var425);
                        final SubLObject var430 = var419.secondMultipleValue();
                        final SubLObject var431 = var419.thirdMultipleValue();
                        var419.resetMultipleValues();
                        if (module0683.NIL == var429) {
                            module0656.f39789((SubLObject)module0683.$ic759$, var424, var423, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        }
                        else if (module0683.NIL == oc_inference_datastructures_inference.f25590(var425)) {
                            return module0656.f39789((SubLObject)module0683.$ic760$, var424, var423, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)module0683.$ic761$);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        SubLObject var432 = var430;
                        SubLObject var433 = (SubLObject)module0683.NIL;
                        var433 = var432.first();
                        while (module0683.NIL != var432) {
                            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                            module0665.f40436(var418, (SubLObject)module0683.$ic753$, module0201.f12576(var433), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0656.f39804(var433, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                            module0642.f39026((SubLObject)module0683.UNPROVIDED);
                            var432 = var432.rest();
                            var433 = var432.first();
                        }
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic762$);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_444 = module0015.$g533$.currentBinding(var419);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var419);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_445 = module0015.$g533$.currentBinding(var419);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var419);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_446 = module0015.$g533$.currentBinding(var419);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var419);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_446, var419);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_447 = module0015.$g533$.currentBinding(var419);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var419);
                                    module0642.f39021((SubLObject)module0683.$ic763$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_447, var419);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                oc_cb_query_browser.f41990(var430, (SubLObject)module0683.NIL, (SubLObject)module0683.T);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_445, var419);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            SubLObject var434 = var429;
                            SubLObject var435 = (SubLObject)module0683.NIL;
                            var435 = var434.first();
                            while (module0683.NIL != var434) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_448 = module0015.$g533$.currentBinding(var419);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var419);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                    final SubLObject var20_449 = module0015.$g533$.currentBinding(var419);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0683.T, var419);
                                        module0665.f40436(var418, (SubLObject)module0683.$ic755$, oc_inference_datastructures_inference.f25629(var435), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_449, var419);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                    final SubLObject var20_450 = module0015.$g533$.currentBinding(var419);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0683.T, var419);
                                        oc_cb_query_browser.f41989(var435, var431, Sequences.length(var429));
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_450, var419);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    oc_cb_query_browser.f41991(var435, var430);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_448, var419);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                                var434 = var434.rest();
                                var435 = var434.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var20_444, var419);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0665.f40445(var418, (SubLObject)module0683.$ic744$, (SubLObject)module0683.$ic752$, (SubLObject)module0683.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var419));
                    }
                    finally {
                        module0015.$g539$.rebind(var428, var419);
                        module0015.$g541$.rebind(var427, var419);
                        module0015.$g533$.rebind(var20_443, var419);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                }
                else {
                    SubLObject var436 = module0665.f40420((SubLObject)module0683.$ic753$, var418);
                    final SubLObject var437 = module0665.f40420((SubLObject)module0683.$ic755$, var418);
                    var436 = Mapping.mapcar((SubLObject)module0683.$ic764$, var436);
                    f41869(var425, var437, var436);
                }
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_440, var419);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var421, var419);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0683.UNPROVIDED);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41869(final SubLObject var1, final SubLObject var458, final SubLObject var457) {
        SubLObject var459 = var458;
        SubLObject var460 = (SubLObject)module0683.NIL;
        var460 = var459.first();
        while (module0683.NIL != var459) {
            final SubLObject var461 = module0682.f41659(var1, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var462 = oc_inference_datastructures_inference.f25616(var1, var460);
            final SubLObject var463 = oc_inference_datastructures_inference.f25687(var462);
            SubLObject var464 = oc_inference_datastructures_inference.f25485(var1);
            final SubLObject var465 = module0360.f23987(var1);
            SubLObject var466 = (SubLObject)module0683.NIL;
            SubLObject var104_463 = var463;
            SubLObject var467 = (SubLObject)module0683.NIL;
            var467 = var104_463.first();
            while (module0683.NIL != var104_463) {
                if (module0683.NIL != module0004.f104(var467.first(), var457, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED)) {
                    var466 = (SubLObject)ConsesLow.cons(var467, var466);
                }
                var104_463 = var104_463.rest();
                var467 = var104_463.first();
            }
            var464 = module0233.f15362(var466, var464);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            module0642.f39021((SubLObject)module0683.$ic765$);
            module0656.f39804(var464, (SubLObject)module0683.NIL, (SubLObject)module0683.T);
            module0682.f41648(var461, (SubLObject)ConsesLow.list(oc_inference_datastructures_inference.f25484(var1)));
            module0682.f41647(var461, (SubLObject)ConsesLow.list(var464));
            module0682.f41652(var461, var465);
            module0682.f41642(var461, module0038.f2867(Sequences.cconcatenate(module0006.f203((SubLObject)module0683.$ic766$), new SubLObject[] { module0683.$ic563$, module0006.f203(var464.first().isCons() ? var464.first().first() : var464.first()), module0683.$ic563$, module0006.f203(var466) }), (SubLObject)module0683.UNPROVIDED));
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)module0683.$ic767$);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0684.f41958(var461, (SubLObject)module0683.T);
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            var459 = var459.rest();
            var460 = var459.first();
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41870(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic609$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic768$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41871(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (module0683.NIL == var120) {
            final SubLObject var121 = f41672(var118, var119);
            if (module0683.NIL == var121) {
                return module0656.f39789((SubLObject)module0683.$ic585$, var119, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020((SubLObject)module0683.$ic230$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
            final SubLObject var122 = module0014.f672((SubLObject)module0683.$ic231$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var122) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var122);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var117), (SubLObject)module0683.$ic770$, var118, var119);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0016.f892();
            module0016.f895();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var123 = module0015.$g535$.currentBinding(var117);
            try {
                module0015.$g535$.bind((SubLObject)module0683.T, var117);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_467 = module0015.$g533$.currentBinding(var117);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var117);
                    module0642.f39020(module0015.$g207$.getGlobalValue());
                    module0642.f39021((SubLObject)module0683.$ic771$);
                    module0642.f39020(module0015.$g208$.getGlobalValue());
                    module0642.f39019((SubLObject)module0683.$ic772$);
                    module0642.f39019(print_high.princ_to_string(var121));
                    module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                    f41872(var121, (SubLObject)module0683.$ic773$);
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_467, var117);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var123, var117);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic3$);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41873(final SubLObject var1, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic775$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        final SubLObject var24 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var25 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)module0683.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)module0683.$ic776$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41872(final SubLObject var1, SubLObject var468) {
        if (var468 == module0683.UNPROVIDED) {
            var468 = (SubLObject)module0683.NIL;
        }
        final SubLThread var469 = SubLProcess.currentSubLThread();
        final SubLObject var470 = f41874(var1);
        SubLObject var471 = (SubLObject)module0683.NIL;
        SubLObject var472 = (SubLObject)module0683.NIL;
        try {
            var472 = streams_high.make_private_string_output_stream();
            final SubLObject var473 = reader.$read_default_float_format$.currentBinding(var469);
            try {
                reader.$read_default_float_format$.bind((SubLObject)module0683.$ic778$, var469);
                streams_high.write_string((SubLObject)module0683.$ic779$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                streams_high.write_string((SubLObject)module0683.$ic780$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                streams_high.write_string((SubLObject)module0683.$ic781$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var474 = oc_inference_datastructures_inference.f25583(var1);
                final SubLObject var475 = oc_inference_datastructures_inference.f25422(var1);
                final SubLObject var476 = Sequences.cconcatenate((SubLObject)module0683.$ic782$, new SubLObject[] { module0006.f203(var474), module0683.$ic399$, module0006.f203(var475), module0683.$ic783$ });
                PrintLow.format(var472, (SubLObject)module0683.$ic784$, module0589.f35898(var476, (SubLObject)module0683.UNPROVIDED));
                final SubLObject var477 = module0035.f2114(var470);
                final SubLObject var478 = module0048.f3302(var477.first(), (SubLObject)module0683.THREE_INTEGER);
                final SubLObject var479 = conses_high.second(var477);
                PrintLow.format(var472, (SubLObject)module0683.$ic785$, new SubLObject[] { module0683.ZERO_INTEGER, var478, module0683.ZERO_INTEGER, var479 });
                streams_high.write_string((SubLObject)module0683.$ic786$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                PrintLow.format(var472, (SubLObject)module0683.$ic787$, new SubLObject[] { module0683.ZERO_INTEGER, var478, module0683.ZERO_INTEGER, var479 });
                final SubLObject var480 = (SubLObject)module0683.$ic788$;
                final SubLObject var481 = (SubLObject)module0683.$ic789$;
                PrintLow.format(var472, (SubLObject)module0683.$ic790$, module0589.f35898(var480, (SubLObject)module0683.UNPROVIDED), module0589.f35898(var481, (SubLObject)module0683.UNPROVIDED));
                PrintLow.format(var472, (SubLObject)module0683.$ic791$, (SubLObject)module0683.$ic792$, (SubLObject)module0683.$ic792$);
                streams_high.write_string((SubLObject)module0683.$ic793$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                SubLObject var482 = (SubLObject)module0683.NIL;
                SubLObject var483 = (SubLObject)module0683.NIL;
                SubLObject var484 = (SubLObject)module0683.NIL;
                var482 = var470;
                var483 = var482.first();
                for (var484 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var482; var482 = var482.rest(), var483 = var482.first(), var484 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var484)) {
                    final SubLObject var485 = module0048.f3302(var483.first(), (SubLObject)module0683.THREE_INTEGER);
                    if (!var484.isZero()) {
                        streams_high.write_string((SubLObject)module0683.$ic794$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                    }
                    print_high.princ(var485, var472);
                }
                streams_high.write_string((SubLObject)module0683.$ic398$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                var482 = (SubLObject)module0683.NIL;
                var483 = (SubLObject)module0683.NIL;
                var484 = (SubLObject)module0683.NIL;
                var482 = var470;
                var483 = var482.first();
                for (var484 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var482; var482 = var482.rest(), var483 = var482.first(), var484 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var484)) {
                    final SubLObject var486 = conses_high.second(var483);
                    if (!var484.isZero()) {
                        streams_high.write_string((SubLObject)module0683.$ic794$, var472, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                    }
                    print_high.princ(var486, var472);
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(var473, var469);
            }
            var471 = streams_high.get_output_stream_string(var472);
        }
        finally {
            final SubLObject var487 = Threads.$is_thread_performing_cleanupP$.currentBinding(var469);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0683.T, var469);
                streams_high.close(var472, (SubLObject)module0683.UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var487, var469);
            }
        }
        module0642.f39020(module0015.$g431$.getGlobalValue());
        module0642.f39020(module0015.$g440$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(var471);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g435$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic795$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g436$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.$ic796$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var473 = module0015.$g533$.currentBinding(var469);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var469);
        }
        finally {
            module0015.$g533$.rebind(var473, var469);
        }
        module0642.f39020(module0015.$g432$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41874(final SubLObject var1) {
        final SubLObject var2 = module0548.f33868(var1);
        if (module0683.NIL != module0035.f1994(var2, (SubLObject)module0683.$ic797$, (SubLObject)module0683.UNPROVIDED)) {
            return var2;
        }
        final SubLObject var3 = Sequences.length(var2);
        final SubLObject var4 = module0035.f2124((SubLObject)module0683.TEN_INTEGER, var2);
        SubLObject var5 = Sequences.subseq(var2, (SubLObject)module0683.TEN_INTEGER, Numbers.subtract(var3, (SubLObject)module0683.TWENTY_INTEGER));
        final SubLObject var6 = module0035.f2129((SubLObject)module0683.TEN_INTEGER, var2);
        var5 = module0035.f2097(var5);
        var5 = module0035.f2124((SubLObject)module0683.$ic137$, var5);
        var5 = Sort.sort(var5, Symbols.symbol_function((SubLObject)module0683.$ic798$), Symbols.symbol_function((SubLObject)module0683.$ic799$));
        final SubLObject var7 = ConsesLow.nconc(var4, var5, var6);
        return var7;
    }
    
    public static SubLObject f41875(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        SubLObject var118 = (SubLObject)module0683.NIL;
        SubLObject var119 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic800$);
        var117 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic800$);
        var118 = var120.first();
        var120 = var120.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)module0683.$ic800$);
        var119 = var120.first();
        var120 = var120.rest();
        if (module0683.NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic800$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var121 = f41672(var117, var118);
        if (module0683.NIL == var121) {
            return module0656.f39789((SubLObject)module0683.$ic585$, var118, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var122 = reader.read_from_string_ignoring_errors(var119, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        SubLObject var123 = (SubLObject)module0683.NIL;
        final SubLObject var124 = var122;
        if (var124.eql((SubLObject)module0683.$ic404$)) {
            var123 = module0412.f28692(var121);
        }
        else {
            if (!var124.eql((SubLObject)module0683.$ic801$)) {
                return module0656.f39789((SubLObject)module0683.$ic802$, var119, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            var123 = module0412.f28694(var121);
        }
        final SubLObject var125 = oc_inference_datastructures_inference.f25423(var121);
        final SubLObject var126 = oc_inference_datastructures_inference.f25424(var121);
        return f41797(var125, var126, var123, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41876(final SubLObject var1, final SubLObject var210, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var211 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic804$;
        }
        assert module0683.NIL != oc_inference_datastructures_inference.f25275(var1) : var1;
        if (module0683.NIL == Errors.$ignore_mustsP$.getDynamicValue(var211) && module0683.NIL == module0035.f2169(var210, (SubLObject)module0683.$ic805$)) {
            Errors.error((SubLObject)module0683.$ic806$, var210);
        }
        final SubLObject var212 = oc_inference_datastructures_inference.f25583(var1);
        final SubLObject var213 = oc_inference_datastructures_inference.f25422(var1);
        final SubLObject var214 = module0656.f39832((SubLObject)module0683.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var211), (SubLObject)module0683.$ic807$, new SubLObject[] { var212, var213, var210 });
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var214) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var214);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var215 = module0015.$g533$.currentBinding(var211);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var211);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var215, var211);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41877(final SubLObject var487) {
        final SubLThread var488 = SubLProcess.currentSubLThread();
        assert module0683.NIL != module0360.f23781(var487) : var487;
        SubLObject var489 = (SubLObject)module0683.NIL;
        SubLObject var490 = (SubLObject)module0683.NIL;
        if (module0683.NIL != module0360.f23801(var487)) {
            var488.resetMultipleValues();
            final SubLObject var489_490 = f41878(var487, module0683.$g5361$.getGlobalValue());
            final SubLObject var491_492 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var489_490;
            var490 = var491_492;
            if (module0683.NIL == var490) {
                var488.resetMultipleValues();
                final SubLObject var493_494 = f41878(var487, module0683.$g5364$.getGlobalValue());
                final SubLObject var495_496 = var488.secondMultipleValue();
                var488.resetMultipleValues();
                var489 = var493_494;
                var490 = var495_496;
            }
        }
        else if (module0683.NIL != module0360.f23789(var487)) {
            var488.resetMultipleValues();
            final SubLObject var497_498 = f41878(var487, module0683.$g5365$.getGlobalValue());
            final SubLObject var499_500 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var497_498;
            var490 = var499_500;
        }
        else if (module0683.NIL != module0360.f23803(var487)) {
            var488.resetMultipleValues();
            final SubLObject var501_502 = f41878(var487, module0683.$g5366$.getGlobalValue());
            final SubLObject var503_504 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var501_502;
            var490 = var503_504;
        }
        else if (module0683.NIL != module0360.f23791(var487)) {
            var488.resetMultipleValues();
            final SubLObject var505_506 = f41878(var487, module0683.$g5367$.getGlobalValue());
            final SubLObject var507_508 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var505_506;
            var490 = var507_508;
        }
        else if (module0683.NIL != module0360.f23802(var487)) {
            var488.resetMultipleValues();
            final SubLObject var509_510 = f41878(var487, module0683.$g5368$.getGlobalValue());
            final SubLObject var511_512 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var509_510;
            var490 = var511_512;
        }
        else if (module0683.NIL != module0360.f23790(var487)) {
            var488.resetMultipleValues();
            final SubLObject var513_514 = f41878(var487, module0683.$g5369$.getGlobalValue());
            final SubLObject var515_516 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var513_514;
            var490 = var515_516;
        }
        return Values.values(var489, var490);
    }
    
    public static SubLObject f41878(final SubLObject var487, final SubLObject var228) {
        SubLObject var488 = (SubLObject)module0683.NIL;
        SubLObject var489 = (SubLObject)module0683.NIL;
        final SubLObject var490 = conses_high.assoc(var487, var228, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var490) {
            var488 = f41697(conses_high.second(var490), var487);
            var489 = (SubLObject)module0683.T;
        }
        else {
            var488 = (SubLObject)module0683.NIL;
            var489 = (SubLObject)module0683.NIL;
        }
        return Values.values(var488, var489);
    }
    
    public static SubLObject f41879(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = var116;
        final SubLObject var119 = (SubLObject)(var118.isCons() ? var118.first() : module0683.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var118, var117, (SubLObject)module0683.$ic811$);
        var118 = var118.rest();
        if (module0683.NIL == var118) {
            SubLObject var120 = (SubLObject)module0683.NIL;
            if (module0683.NIL != var119) {
                var120 = reader.read_from_string_ignoring_errors(var119, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            }
            else {
                var120 = (SubLObject)module0683.$ic812$;
            }
            if (!var120.isKeyword()) {
                var120 = (SubLObject)module0683.$ic812$;
            }
            return f41880(var120);
        }
        cdestructuring_bind.cdestructuring_bind_error(var117, (SubLObject)module0683.$ic811$);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41880(final SubLObject var521) {
        final SubLThread var522 = SubLProcess.currentSubLThread();
        final SubLObject var524;
        final SubLObject var523 = var524 = (SubLObject)module0683.$ic814$;
        final SubLObject var525 = module0015.$g538$.currentBinding(var522);
        try {
            module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var522))) ? module0015.$g538$.getDynamicValue(var522) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var522);
            module0642.f39020((SubLObject)module0683.$ic230$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var522), module0655.$g5142$.getDynamicValue(var522));
            final SubLObject var526 = module0014.f672((SubLObject)module0683.$ic231$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var526) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var526);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            module0016.f941();
            if (module0683.NIL != var524) {
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var524);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_522 = module0015.$g535$.currentBinding(var522);
            try {
                module0015.$g535$.bind((SubLObject)module0683.T, var522);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0683.NIL != module0015.$g132$.getDynamicValue(var522)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var522)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_523 = module0015.$g533$.currentBinding(var522);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_524 = module0015.$g533$.currentBinding(var522);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var522);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_524, var522);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0683.NIL != var524) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019(var524);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    final SubLObject var527 = module0656.f39832((SubLObject)module0683.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var522));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic235$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    if (module0683.NIL != var527) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(var527);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_525 = module0015.$g533$.currentBinding(var522);
                    final SubLObject var528 = module0015.$g541$.currentBinding(var522);
                    final SubLObject var529 = module0015.$g539$.currentBinding(var522);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var522);
                        module0015.$g541$.bind((SubLObject)module0683.T, var522);
                        module0015.$g539$.bind(module0015.f797(), var522);
                        module0642.f39069((SubLObject)module0683.$ic815$, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED);
                        module0656.f39837((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic592$, var521, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39032((SubLObject)module0683.UNPROVIDED);
                        module0656.f39837((SubLObject)module0683.$ic817$, (SubLObject)module0683.$ic818$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_526 = module0015.$g533$.currentBinding(var522);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var522);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_527 = module0015.$g533$.currentBinding(var522);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_528 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39019((SubLObject)module0683.$ic819$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_528, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_529 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_529, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_530 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39139((SubLObject)module0683.$ic820$, (SubLObject)module0683.$ic6$, (SubLObject)module0683.$ic319$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_530, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_531 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_531, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_532 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39074((SubLObject)module0683.$ic821$, (SubLObject)module0683.$ic822$, (SubLObject)module0683.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_532, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_527, var522);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_533 = module0015.$g533$.currentBinding(var522);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_534 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39019((SubLObject)module0683.$ic823$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_534, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_535 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_535, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_536 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39139((SubLObject)module0683.$ic824$, (SubLObject)module0683.$ic6$, (SubLObject)module0683.$ic319$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_536, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_537 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_537, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_538 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var522);
                                    module0642.f39074((SubLObject)module0683.$ic825$, (SubLObject)module0683.$ic826$, (SubLObject)module0683.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_538, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_533, var522);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_526, var522);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        f41881(var521, (SubLObject)module0683.UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var522));
                    }
                    finally {
                        module0015.$g539$.rebind(var529, var522);
                        module0015.$g541$.rebind(var528, var522);
                        module0015.$g533$.rebind(var20_525, var522);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_523, var522);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_522, var522);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var525, var522);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41882(SubLObject var22, SubLObject var521) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        if (var521 == module0683.UNPROVIDED) {
            var521 = (SubLObject)module0683.NIL;
        }
        final SubLThread var522 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic827$;
        }
        final SubLObject var523 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var522), (SubLObject)module0683.$ic828$, var521);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var523) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var523);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var524 = module0015.$g533$.currentBinding(var522);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var522);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var524, var522);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41881(SubLObject var521, SubLObject var539) {
        if (var521 == module0683.UNPROVIDED) {
            var521 = (SubLObject)module0683.$ic812$;
        }
        if (var539 == module0683.UNPROVIDED) {
            var539 = (SubLObject)module0683.$ic832$;
        }
        final SubLThread var540 = SubLProcess.currentSubLThread();
        final SubLObject var541 = module0414.f28887(var539, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var542 = Sequences.length(var541);
        final SubLObject var543 = module0414.f28890();
        final SubLObject var544 = module0414.f28891();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var545 = module0015.$g533$.currentBinding(var540);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var540);
            SubLObject var546 = module0414.f28872();
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_544 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_545 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39019((SubLObject)module0683.$ic833$);
                }
                finally {
                    module0015.$g533$.rebind(var20_545, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_546 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39027((SubLObject)module0683.$ic737$, (SubLObject)module0683.UNPROVIDED);
                    module0656.f39813(var546);
                    module0642.f39027((SubLObject)module0683.$ic737$, (SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_546, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_547 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0656.f39837((SubLObject)((module0683.NIL != var546) ? module0683.$ic834$ : module0683.$ic835$), (SubLObject)((module0683.NIL != var546) ? module0683.$ic836$ : module0683.$ic837$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_547, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_544, var540);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            var546 = module0389.f27660();
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_548 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_549 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39019((SubLObject)module0683.$ic838$);
                }
                finally {
                    module0015.$g533$.rebind(var20_549, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_550 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39027((SubLObject)module0683.$ic737$, (SubLObject)module0683.UNPROVIDED);
                    module0656.f39813(var546);
                    module0642.f39027((SubLObject)module0683.$ic737$, (SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_550, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_551 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0656.f39837((SubLObject)((module0683.NIL != var546) ? module0683.$ic839$ : module0683.$ic840$), (SubLObject)((module0683.NIL != var546) ? module0683.$ic836$ : module0683.$ic837$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_551, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_548, var540);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            var546 = Equality.eql((SubLObject)module0683.ONE_INTEGER, module0414.$g3381$.getDynamicValue(var540));
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_552 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_553 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39019((SubLObject)module0683.$ic841$);
                }
                finally {
                    module0015.$g533$.rebind(var20_553, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_554 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39027((SubLObject)module0683.$ic737$, (SubLObject)module0683.UNPROVIDED);
                    module0656.f39813(var546);
                    module0642.f39027((SubLObject)module0683.$ic737$, (SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_554, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_555 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0656.f39837((SubLObject)((module0683.NIL != var546) ? module0683.$ic842$ : module0683.$ic843$), (SubLObject)((module0683.NIL != var546) ? module0683.$ic836$ : module0683.$ic837$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_555, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_552, var540);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var545, var540);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        if (!var542.isPositive()) {
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            module0642.f39019((SubLObject)module0683.$ic844$);
            return (SubLObject)module0683.ZERO_INTEGER;
        }
        final SubLObject var547 = module0414.f28870();
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var547) {
            module0642.f39019((SubLObject)module0683.$ic845$);
            SubLObject var548 = var547;
            SubLObject var549 = (SubLObject)module0683.NIL;
            var549 = var548.first();
            while (module0683.NIL != var548) {
                module0642.f39026((SubLObject)module0683.UNPROVIDED);
                module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                module0642.f39019(var549);
                var548 = var548.rest();
                var549 = var548.first();
            }
        }
        else {
            module0642.f39019((SubLObject)module0683.$ic846$);
        }
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        final SubLObject var550 = module0414.f28871();
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var550) {
            module0642.f39019((SubLObject)module0683.$ic847$);
            SubLObject var548 = var550;
            SubLObject var549 = (SubLObject)module0683.NIL;
            var549 = var548.first();
            while (module0683.NIL != var548) {
                module0642.f39026((SubLObject)module0683.UNPROVIDED);
                module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                module0642.f39019(var549);
                var548 = var548.rest();
                var549 = var548.first();
            }
        }
        else {
            module0642.f39019((SubLObject)module0683.$ic848$);
        }
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        final SubLObject var551 = module0414.f28894();
        final SubLObject var552 = module0414.f28901();
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39019((SubLObject)module0683.$ic849$);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic850$, var551);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic851$, var552);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic852$, var542);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)module0683.TWO_INTEGER);
        if (module0683.$ic404$ == var521) {
            module0642.f39019((SubLObject)module0683.$ic853$);
        }
        else {
            module0656.f39837((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic854$, (SubLObject)module0683.$ic404$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        final SubLObject var553 = module0414.f28896();
        final SubLObject var554 = module0414.f28903();
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39019((SubLObject)module0683.$ic855$);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic850$, var553);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic851$, var554);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic852$, var543);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)module0683.TWO_INTEGER);
        if (module0683.$ic856$ == var521) {
            module0642.f39019((SubLObject)module0683.$ic853$);
        }
        else {
            module0656.f39837((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic854$, (SubLObject)module0683.$ic856$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        final SubLObject var555 = module0414.f28897();
        final SubLObject var556 = module0414.f28904();
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39019((SubLObject)module0683.$ic857$);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic850$, var555);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic851$, var556);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic852$, var544);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)module0683.TWO_INTEGER);
        if (module0683.$ic856$ == var521) {
            module0642.f39019((SubLObject)module0683.$ic853$);
        }
        else {
            module0656.f39837((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic854$, (SubLObject)module0683.$ic856$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0678.f41410();
        final SubLObject var557 = conses_high.copy_tree((SubLObject)module0683.$ic858$);
        SubLObject var548 = var541;
        SubLObject var558 = (SubLObject)module0683.NIL;
        var558 = var548.first();
        while (module0683.NIL != var548) {
            final SubLObject var559 = module0414.f28917(var558);
            final SubLObject var560 = Sequences.find(var559, var557, Symbols.symbol_function((SubLObject)module0683.$ic859$), Symbols.symbol_function((SubLObject)module0683.$ic860$), (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            ConsesLow.rplacd(var560, Numbers.add(var560.rest(), (SubLObject)module0683.ONE_INTEGER));
            var548 = var548.rest();
            var558 = var548.first();
        }
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var561 = module0015.$g533$.currentBinding(var540);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var540);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_556 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.FOUR_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_557 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39021((SubLObject)module0683.$ic861$);
                }
                finally {
                    module0015.$g533$.rebind(var20_557, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_556, var540);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_558 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_559 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39021((SubLObject)module0683.$ic863$);
                }
                finally {
                    module0015.$g533$.rebind(var20_559, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_560 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39021((SubLObject)module0683.$ic864$);
                }
                finally {
                    module0015.$g533$.rebind(var20_560, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_561 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39021((SubLObject)module0683.$ic865$);
                }
                finally {
                    module0015.$g533$.rebind(var20_561, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_558, var540);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var562 = module0048.f3381(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0683.$ic866$), var557), (SubLObject)module0683.UNPROVIDED);
            SubLObject var563 = var557;
            SubLObject var564 = (SubLObject)module0683.NIL;
            var564 = var563.first();
            while (module0683.NIL != var563) {
                SubLObject var566;
                final SubLObject var565 = var566 = var564;
                SubLObject var567 = (SubLObject)module0683.NIL;
                SubLObject var568 = (SubLObject)module0683.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var566, var565, (SubLObject)module0683.$ic867$);
                var567 = var566.first();
                var566 = (var568 = var566.rest());
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_562 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var540);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_563 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var540);
                        module0642.f39019(var567);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_563, var540);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_564 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var540);
                        module0642.f39019(var568);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_564, var540);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_565 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var540);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic868$, module0048.f3302(Numbers.divide(Numbers.truncate(Numbers.multiply((SubLObject)module0683.$ic212$, Numbers.divide(var568, var542)), (SubLObject)module0683.UNPROVIDED), (SubLObject)module0683.TEN_INTEGER), (SubLObject)module0683.THREE_INTEGER));
                    }
                    finally {
                        module0015.$g533$.rebind(var20_565, var540);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_566 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var540);
                        module0642.f39093(var568, var562, (SubLObject)module0683.$ic869$, module0015.$g501$.getGlobalValue(), (SubLObject)module0683.NIL);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_566, var540);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_562, var540);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                var563 = var563.rest();
                var564 = var563.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var561, var540);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        final SubLObject var569 = var521;
        if (var569.eql((SubLObject)module0683.$ic856$)) {
            final SubLObject var570 = module0414.f28887(var539, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic870$, var543, var539);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
            module0656.f39837((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic871$, (SubLObject)module0683.$ic812$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            SubLObject var571 = var570;
            SubLObject var572 = (SubLObject)module0683.NIL;
            var572 = var571.first();
            while (module0683.NIL != var571) {
                f41883(var572);
                var571 = var571.rest();
                var572 = var571.first();
            }
        }
        else if (var569.eql((SubLObject)module0683.$ic404$)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)module0683.$ic872$, var542, var539);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
            module0656.f39837((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic871$, (SubLObject)module0683.$ic812$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            var548 = var541;
            var558 = (SubLObject)module0683.NIL;
            var558 = var548.first();
            while (module0683.NIL != var548) {
                f41883(var558);
                var548 = var548.rest();
                var558 = var548.first();
            }
        }
        return Sequences.length(var541);
    }
    
    public static SubLObject f41883(final SubLObject var253) {
        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
        f41884(var253, (SubLObject)module0683.$ic812$);
        module0642.f39026((SubLObject)module0683.UNPROVIDED);
        module0656.f39916(var253, (SubLObject)module0683.T, (SubLObject)module0683.T);
        return var253;
    }
    
    public static SubLObject f41884(final SubLObject var253, final SubLObject var585) {
        final SubLThread var586 = SubLProcess.currentSubLThread();
        final SubLObject var587 = module0414.f28895(var253);
        final SubLObject var588 = module0414.f28902(var253);
        final SubLObject var589 = module0414.f28907(var253, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var590 = module0414.f28917(var253);
        if (var585.eql((SubLObject)module0683.$ic812$)) {
            f41885(var590);
            PrintLow.format(module0015.$g131$.getDynamicValue(var586), (SubLObject)module0683.$ic873$, new SubLObject[] { var588, var587, module0048.f3302(Numbers.multiply((SubLObject)module0683.$ic137$, var589), (SubLObject)module0683.FOUR_INTEGER), var590 });
        }
        else {
            f41885(var590);
            PrintLow.format(module0015.$g131$.getDynamicValue(var586), (SubLObject)module0683.$ic874$, var590);
            if (var587.isZero()) {
                module0642.f39019((SubLObject)module0683.$ic875$);
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var586), (SubLObject)module0683.$ic876$, new SubLObject[] { module0048.f3302(Numbers.multiply((SubLObject)module0683.$ic137$, var589), (SubLObject)module0683.FOUR_INTEGER), var588, var587 });
            }
        }
        return var253;
    }
    
    public static SubLObject f41885(final SubLObject var565) {
        final SubLThread var566 = SubLProcess.currentSubLThread();
        var566.resetMultipleValues();
        final SubLObject var567 = f41886(var565);
        final SubLObject var568 = var566.secondMultipleValue();
        var566.resetMultipleValues();
        final SubLObject var569 = Sequences.cconcatenate(var568, (SubLObject)module0683.$ic877$);
        final SubLObject var570 = Sequences.cconcatenate(module0006.f203(var568), (SubLObject)module0683.$ic878$);
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0683.NIL != var567) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0642.f39042(var567));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var571 = module0015.$g533$.currentBinding(var566);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var566);
            f41676(var569, var570, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var571, var566);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41886(final SubLObject var565) {
        final SubLObject var566 = module0412.f28717((SubLObject)module0683.$ic879$);
        final SubLObject var567 = module0412.f28717((SubLObject)module0683.$ic880$);
        final SubLObject var568 = module0412.f28717((SubLObject)module0683.$ic881$);
        if (var565.numGE(var566)) {
            return Values.values((SubLObject)module0683.$ic882$, (SubLObject)module0683.$ic883$);
        }
        if (var565.numGE(var567)) {
            return Values.values((SubLObject)module0683.$ic884$, (SubLObject)module0683.$ic885$);
        }
        if (var565.numGE(var568)) {
            return Values.values((SubLObject)module0683.$ic601$, (SubLObject)module0683.$ic886$);
        }
        return Values.values((SubLObject)module0683.$ic601$, (SubLObject)module0683.$ic411$);
    }
    
    public static SubLObject f41887(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0389.f27662();
        return f41879((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41888(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic836$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic888$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41889(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0389.f27661();
        return f41879((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41890(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic837$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic891$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41891(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0414.f28874();
        return f41879((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41892(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic836$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic894$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41893(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0414.f28873();
        return f41879((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41894(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic837$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic897$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41895(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0414.$g3381$.setDynamicValue((SubLObject)module0683.ZERO_INTEGER);
        return f41879((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41896(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic836$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic900$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41897(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0414.$g3381$.setDynamicValue((SubLObject)module0683.ONE_INTEGER);
        return f41879((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41898(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic837$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic903$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41899(final SubLObject var116) {
        SubLObject var117 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)module0683.$ic905$);
        var117 = var116.first();
        final SubLObject var118 = var116.rest();
        if (module0683.NIL != var118) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)module0683.$ic905$);
            return (SubLObject)module0683.NIL;
        }
        final SubLObject var119 = module0656.f39970(var117);
        if (module0683.NIL == var119) {
            return module0656.f39789((SubLObject)module0683.$ic906$, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0414.f28883(var119);
        return module0656.f39792((SubLObject)module0683.$ic907$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41900(final SubLObject var253, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic909$;
        }
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)module0683.$ic910$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var254);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var257, var254);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var253;
    }
    
    public static SubLObject f41901(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0414.f28882();
        return f41879((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41902(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic914$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic915$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41903(final SubLObject var116) {
        final SubLObject var117 = module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic822$, var116));
        final SubLObject var118 = module0035.sublisp_boolean(module0642.f39104((SubLObject)module0683.$ic826$, var116));
        if (var117.eql(var118)) {
            return module0656.f39789((SubLObject)module0683.$ic917$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != var117) {
            return f41904(var116);
        }
        if (module0683.NIL != var118) {
            return f41905(var116);
        }
        return module0656.f39789((SubLObject)module0683.$ic918$, var116, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41904(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = module0642.f39104((SubLObject)module0683.$ic820$, var116);
        SubLObject var119 = (SubLObject)module0683.NIL;
        if (module0683.NIL != var118) {
            var118 = module0038.f2735(var118);
            if (module0683.NIL != module0038.f2610(var118)) {
                var118 = (SubLObject)module0683.NIL;
            }
        }
        if (module0683.NIL != var118) {
            var119 = (SubLObject)SubLObjectFactory.makeBoolean(module0683.NIL == Filesys.probe_file(var118));
        }
        if (module0683.NIL != var119) {
            return module0656.f39789((SubLObject)module0683.$ic920$, var118, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL == var118) {
            return module0656.f39789((SubLObject)module0683.$ic921$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        final SubLObject var120 = module0414.$g3380$.currentBinding(var117);
        try {
            module0414.$g3380$.bind((SubLObject)module0683.T, var117);
            module0414.f28936(var118, (SubLObject)module0683.T, (SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0414.$g3380$.rebind(var120, var117);
        }
        return f41880((SubLObject)module0683.NIL);
    }
    
    public static SubLObject f41905(final SubLObject var116) {
        SubLObject var117 = module0642.f39104((SubLObject)module0683.$ic824$, var116);
        SubLObject var118 = (SubLObject)module0683.NIL;
        if (module0683.NIL != var117) {
            var117 = module0038.f2735(var117);
            if (module0683.NIL != module0038.f2610(var117)) {
                var117 = (SubLObject)module0683.NIL;
            }
        }
        if (module0683.NIL != var117) {
            var118 = (SubLObject)SubLObjectFactory.makeBoolean(module0683.NIL == module0075.f5193(var117));
        }
        if (module0683.NIL != var118) {
            return module0656.f39789((SubLObject)module0683.$ic923$, var117, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL == var117) {
            return module0656.f39789((SubLObject)module0683.$ic921$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        module0414.f28934(var117, (SubLObject)module0683.NIL);
        return module0656.f39793((SubLObject)module0683.$ic924$, (SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41906(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = (SubLObject)module0683.$ic926$;
        final SubLObject var119 = module0015.$g538$.currentBinding(var117);
        try {
            module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var117);
            module0642.f39020((SubLObject)module0683.$ic230$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
            final SubLObject var120 = module0014.f672((SubLObject)module0683.$ic231$);
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var120) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(var120);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            module0016.f941();
            if (module0683.NIL != var118) {
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var118);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_603 = module0015.$g535$.currentBinding(var117);
            try {
                module0015.$g535$.bind((SubLObject)module0683.T, var117);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0683.NIL != module0015.$g132$.getDynamicValue(var117)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_604 = module0015.$g533$.currentBinding(var117);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var117);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_605 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var117);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019((SubLObject)module0683.$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_605, var117);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0683.NIL != var118) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39019(var118);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    }
                    f41907((SubLObject)module0683.UNPROVIDED);
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_604, var117);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_603, var117);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var119, var117);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41908(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic926$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic928$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41909(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var119;
        final SubLObject var118 = var119 = var116;
        SubLObject var120 = (SubLObject)module0683.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)module0683.$ic931$);
        var120 = var119.first();
        var119 = var119.rest();
        if (module0683.NIL == var119) {
            final SubLObject var121 = module0656.f39970(var120);
            final SubLObject var122 = module0413.f28851((SubLObject)module0683.UNPROVIDED);
            final SubLObject var123 = module0413.f28855(var121);
            final SubLObject var124 = module0413.f28856(var122);
            final SubLObject var125 = (SubLObject)module0683.$ic932$;
            final SubLObject var126 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((module0683.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED), var117);
                module0642.f39020((SubLObject)module0683.$ic230$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var127 = module0014.f672((SubLObject)module0683.$ic231$);
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                if (module0683.NIL != var127) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(var127);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                module0016.f941();
                if (module0683.NIL != var125) {
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var125);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_611 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)module0683.T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0683.NIL != module0015.$g132$.getDynamicValue(var117)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.$ic234$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_612 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var117);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.$ic535$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_613 = module0015.$g533$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var117);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic536$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020((SubLObject)module0683.$ic537$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39019((SubLObject)module0683.$ic538$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_613, var117);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0683.NIL != var125) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39019(var125);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        }
                        module0656.f39837((SubLObject)module0683.$ic933$, var121, (SubLObject)module0683.$ic592$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39032((SubLObject)module0683.UNPROVIDED);
                        module0656.f39837((SubLObject)module0683.$ic929$, (SubLObject)module0683.$ic934$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                        f41910(var123, (SubLObject)module0683.$ic935$, var124, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var20_612, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0683.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_611, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var126, var117);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var118, (SubLObject)module0683.$ic931$);
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41911(final SubLObject var253, SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic937$;
        }
        assert module0683.NIL != module0178.f11290(var253) : var253;
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)module0683.$ic938$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var254);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var257, var254);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var253;
    }
    
    public static SubLObject f41912(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0413.f28849();
        return f41906((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41913(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic941$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic942$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41914(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0413.$g3371$.setDynamicValue((SubLObject)module0683.T);
        return f41906((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41915(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic946$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic947$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41916(SubLObject var116) {
        if (var116 == module0683.UNPROVIDED) {
            var116 = (SubLObject)module0683.NIL;
        }
        module0413.$g3371$.setDynamicValue((SubLObject)module0683.NIL);
        return f41906((SubLObject)module0683.UNPROVIDED);
    }
    
    public static SubLObject f41917(SubLObject var22) {
        if (var22 == module0683.UNPROVIDED) {
            var22 = (SubLObject)module0683.NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0683.NIL == var22) {
            var22 = (SubLObject)module0683.$ic951$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)module0683.$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0683.$ic952$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41907(SubLObject var614) {
        if (var614 == module0683.UNPROVIDED) {
            var614 = (SubLObject)module0683.NIL;
        }
        final SubLThread var615 = SubLProcess.currentSubLThread();
        final SubLObject var616 = module0413.f28851(var614);
        final SubLObject var617 = module0413.f28856(var616);
        module0656.f39837((SubLObject)module0683.$ic929$, (SubLObject)module0683.$ic592$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        if (module0683.NIL != var616) {
            module0656.f39837((SubLObject)module0683.$ic943$, (SubLObject)module0683.$ic941$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
            module0642.f39032((SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL != module0413.$g3371$.getDynamicValue(var615)) {
            module0656.f39837((SubLObject)module0683.$ic953$, (SubLObject)module0683.$ic951$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        else {
            module0656.f39837((SubLObject)module0683.$ic948$, (SubLObject)module0683.$ic946$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        }
        if (module0683.NIL == var616) {
            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
            if (module0683.NIL != module0413.$g3371$.getDynamicValue(var615)) {
                module0642.f39019((SubLObject)module0683.$ic955$);
            }
            else {
                module0642.f39019((SubLObject)module0683.$ic956$);
            }
        }
        else {
            final SubLObject var619;
            final SubLObject var618 = var619 = var617;
            final SubLObject var620 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic957$, var619);
            final SubLObject var621 = (SubLObject)((module0683.NIL != var620) ? conses_high.cadr(var620) : module0683.NIL);
            final SubLObject var622 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic958$, var619);
            final SubLObject var623 = (SubLObject)((module0683.NIL != var622) ? conses_high.cadr(var622) : module0683.NIL);
            final SubLObject var624 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic959$, var619);
            final SubLObject var625 = (SubLObject)((module0683.NIL != var624) ? conses_high.cadr(var624) : module0683.NIL);
            final SubLObject var626 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic960$, var619);
            final SubLObject var627 = (SubLObject)((module0683.NIL != var626) ? conses_high.cadr(var626) : module0683.NIL);
            final SubLObject var628 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic961$, var619);
            final SubLObject var629 = (SubLObject)((module0683.NIL != var628) ? conses_high.cadr(var628) : module0683.NIL);
            final SubLObject var630 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic962$, var619);
            final SubLObject var631 = (SubLObject)((module0683.NIL != var630) ? conses_high.cadr(var630) : module0683.NIL);
            final SubLObject var632 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic963$, var619);
            final SubLObject var633 = (SubLObject)((module0683.NIL != var632) ? conses_high.cadr(var632) : module0683.NIL);
            final SubLObject var634 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic964$, var619);
            final SubLObject var635 = (SubLObject)((module0683.NIL != var634) ? conses_high.cadr(var634) : module0683.NIL);
            final SubLObject var636 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic965$, var619);
            final SubLObject var637 = (SubLObject)((module0683.NIL != var636) ? conses_high.cadr(var636) : module0683.NIL);
            module0642.f39026((SubLObject)module0683.TWO_INTEGER);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var638 = module0015.$g533$.currentBinding(var615);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_636 = module0015.$g533$.currentBinding(var615);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_637 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var615);
                        module0642.f39021((SubLObject)module0683.$ic966$);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_638 = module0015.$g533$.currentBinding(var615);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var615);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_639 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_640 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(module0048.f3302(var623, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_640, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_641 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic967$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_641, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_639, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_642 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_643 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(var625);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_643, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_644 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic968$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_644, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_642, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_645 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_646 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(var621);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_646, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_647 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic969$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_647, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_645, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_638, var615);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_637, var615);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_648 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var615);
                        module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_648, var615);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_649 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var615);
                        module0642.f39021((SubLObject)module0683.$ic970$);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_650 = module0015.$g533$.currentBinding(var615);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var615);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_651 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_652 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(module0048.f3302(var631, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_652, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_653 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic971$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_653, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_651, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_654 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_655 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(module0048.f3302(var627, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_655, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_656 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic972$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_656, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_654, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_657 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_658 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(module0048.f3302(var635, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_658, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_659 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic973$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_659, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_657, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_650, var615);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_649, var615);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_660 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var615);
                        module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_660, var615);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_661 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var615);
                        module0642.f39021((SubLObject)module0683.$ic974$);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_662 = module0015.$g533$.currentBinding(var615);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var615);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_663 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_664 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(module0048.f3302(var633, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_664, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_665 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic971$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_665, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_663, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_666 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_667 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(module0048.f3302(var629, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_667, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_668 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic972$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_668, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_666, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_669 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_670 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019(module0048.f3302(var637, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_670, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_671 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var615);
                                    module0642.f39019((SubLObject)module0683.$ic973$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_671, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_669, var615);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_662, var615);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_661, var615);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_636, var615);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var638, var615);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            module0642.f39026((SubLObject)module0683.UNPROVIDED);
            SubLObject var639 = (SubLObject)module0683.ZERO_INTEGER;
            SubLObject var640 = (SubLObject)module0683.NIL;
            SubLObject var641 = (SubLObject)module0683.NIL;
            SubLObject var642 = (SubLObject)module0683.NIL;
            var640 = var616;
            var641 = var640.first();
            for (var642 = (SubLObject)module0683.ZERO_INTEGER; module0683.NIL != var640; var640 = var640.rest(), var641 = var640.first(), var642 = Numbers.add((SubLObject)module0683.ONE_INTEGER, var642)) {
                if (module0683.NIL == var614 || var642.numL(var614)) {
                    final SubLObject var643 = conses_high.getf(var641, (SubLObject)module0683.$ic975$, (SubLObject)module0683.UNPROVIDED);
                    var639 = Numbers.add(var639, var643);
                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                    f41910(var641, module0683.$g5384$.getDynamicValue(var615), var617, var639);
                }
            }
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41910(final SubLObject var609, final SubLObject var585, SubLObject var610, SubLObject var672) {
        if (var610 == module0683.UNPROVIDED) {
            var610 = (SubLObject)module0683.NIL;
        }
        if (var672 == module0683.UNPROVIDED) {
            var672 = (SubLObject)module0683.NIL;
        }
        final SubLThread var673 = SubLProcess.currentSubLThread();
        final SubLObject var675;
        final SubLObject var674 = var675 = var610;
        final SubLObject var676 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic958$, var675);
        final SubLObject var677 = (SubLObject)((module0683.NIL != var676) ? conses_high.cadr(var676) : module0683.NIL);
        final SubLObject var678 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic962$, var675);
        final SubLObject var679 = (SubLObject)((module0683.NIL != var678) ? conses_high.cadr(var678) : module0683.NIL);
        final SubLObject var680 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic963$, var675);
        final SubLObject var681 = (SubLObject)((module0683.NIL != var680) ? conses_high.cadr(var680) : module0683.NIL);
        final SubLObject var682 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic960$, var675);
        final SubLObject var683 = (SubLObject)((module0683.NIL != var682) ? conses_high.cadr(var682) : module0683.NIL);
        final SubLObject var684 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic961$, var675);
        final SubLObject var685 = (SubLObject)((module0683.NIL != var684) ? conses_high.cadr(var684) : module0683.NIL);
        final SubLObject var686 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic964$, var675);
        final SubLObject var687 = (SubLObject)((module0683.NIL != var686) ? conses_high.cadr(var686) : module0683.NIL);
        final SubLObject var688 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic965$, var675);
        final SubLObject var689 = (SubLObject)((module0683.NIL != var688) ? conses_high.cadr(var688) : module0683.NIL);
        SubLObject var690 = (SubLObject)module0683.NIL;
        SubLObject var691 = var609;
        SubLObject var692 = (SubLObject)module0683.NIL;
        SubLObject var689_690 = (SubLObject)module0683.NIL;
        while (module0683.NIL != var691) {
            cdestructuring_bind.destructuring_bind_must_consp(var691, var609, (SubLObject)module0683.$ic976$);
            var689_690 = var691.first();
            var691 = var691.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var691, var609, (SubLObject)module0683.$ic976$);
            if (module0683.NIL == conses_high.member(var689_690, (SubLObject)module0683.$ic977$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED)) {
                var692 = (SubLObject)module0683.T;
            }
            if (var689_690 == module0683.$ic36$) {
                var690 = var691.first();
            }
            var691 = var691.rest();
        }
        if (module0683.NIL != var692 && module0683.NIL == var690) {
            cdestructuring_bind.cdestructuring_bind_error(var609, (SubLObject)module0683.$ic976$);
        }
        final SubLObject var693 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic978$, var609);
        final SubLObject var694 = (SubLObject)((module0683.NIL != var693) ? conses_high.cadr(var693) : module0683.NIL);
        final SubLObject var695 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic975$, var609);
        final SubLObject var696 = (SubLObject)((module0683.NIL != var695) ? conses_high.cadr(var695) : module0683.NIL);
        final SubLObject var697 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic979$, var609);
        final SubLObject var698 = (SubLObject)((module0683.NIL != var697) ? conses_high.cadr(var697) : module0683.NIL);
        final SubLObject var699 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic980$, var609);
        final SubLObject var700 = (SubLObject)((module0683.NIL != var699) ? conses_high.cadr(var699) : module0683.NIL);
        final SubLObject var701 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic981$, var609);
        final SubLObject var702 = (SubLObject)((module0683.NIL != var701) ? conses_high.cadr(var701) : module0683.NIL);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39020((SubLObject)module0683.ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var703 = module0015.$g533$.currentBinding(var673);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var673);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_698 = module0015.$g533$.currentBinding(var673);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic384$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_699 = module0015.$g533$.currentBinding(var673);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var673);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_700 = module0015.$g533$.currentBinding(var673);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var673);
                        if (module0683.NIL != var610 && module0683.NIL != var672) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_701 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_702 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic982$, module0048.f3302(Numbers.multiply((SubLObject)module0683.$ic137$, Numbers.divide(var672, var677)), (SubLObject)module0683.THREE_INTEGER));
                                    module0642.f39026((SubLObject)module0683.TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_702, var673);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_701, var673);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_703 = module0015.$g533$.currentBinding(var673);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var673);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_704 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                module0642.f39019(module0048.f3302(var696, (SubLObject)module0683.THREE_INTEGER));
                            }
                            finally {
                                module0015.$g533$.rebind(var20_704, var673);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_705 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                module0642.f39019((SubLObject)module0683.$ic967$);
                                if (var677.isPositive()) {
                                    final SubLObject var704 = module0048.f3402(var696, var679, var681);
                                    if (var704.numG((SubLObject)module0683.ONE_INTEGER)) {
                                        final SubLObject var705 = (SubLObject)(var704.numG((SubLObject)module0683.TWO_INTEGER) ? module0683.$ic601$ : module0683.$ic383$);
                                        final SubLObject var706 = (SubLObject)(var704.numG((SubLObject)module0683.TWO_INTEGER) ? module0683.$ic983$ : module0683.$ic984$);
                                        module0642.f39032((SubLObject)module0683.UNPROVIDED);
                                        f41918(var705, var706, Numbers.truncate(var704, (SubLObject)module0683.UNPROVIDED));
                                    }
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var20_705, var673);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_703, var673);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                        final SubLObject var20_706 = module0015.$g533$.currentBinding(var673);
                        try {
                            module0015.$g533$.bind((SubLObject)module0683.T, var673);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_707 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                module0642.f39019(var700);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_707, var673);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_708 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                module0642.f39019((SubLObject)module0683.$ic968$);
                                if (var677.isPositive()) {
                                    final SubLObject var704 = module0048.f3402(var700, var683, var685);
                                    if (var704.numG((SubLObject)module0683.ONE_INTEGER)) {
                                        module0642.f39032((SubLObject)module0683.UNPROVIDED);
                                        f41918((SubLObject)module0683.$ic383$, (SubLObject)module0683.$ic984$, Numbers.truncate(var704, (SubLObject)module0683.UNPROVIDED));
                                    }
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var20_708, var673);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_706, var673);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        if (var700.isPositive()) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_709 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_710 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                    module0642.f39051((SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_710, var673);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_709, var673);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                            final SubLObject var707 = Numbers.divide(var696, var700);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                            final SubLObject var20_711 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_712 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                    module0642.f39019(module0048.f3302(var707, (SubLObject)module0683.THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_712, var673);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                                final SubLObject var20_713 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0683.T, var673);
                                    module0642.f39019((SubLObject)module0683.$ic985$);
                                    if (var677.isPositive()) {
                                        final SubLObject var708 = module0048.f3402(var707, var687, var689);
                                        if (var708.numG((SubLObject)module0683.ONE_INTEGER)) {
                                            module0642.f39032((SubLObject)module0683.UNPROVIDED);
                                            f41918((SubLObject)module0683.$ic601$, (SubLObject)module0683.$ic983$, Numbers.truncate(var708, (SubLObject)module0683.UNPROVIDED));
                                        }
                                    }
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_713, var673);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var20_711, var673);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)module0683.UNPROVIDED);
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var20_700, var673);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_699, var673);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020((SubLObject)module0683.$ic986$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_714 = module0015.$g533$.currentBinding(var673);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var673);
                    module0656.f39916(var694, (SubLObject)module0683.T, (SubLObject)module0683.T);
                }
                finally {
                    module0015.$g533$.rebind(var20_714, var673);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var20_698, var673);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)module0683.UNPROVIDED);
            if (module0683.NIL != var702 || module0683.NIL != var698) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                final SubLObject var20_715 = module0015.$g533$.currentBinding(var673);
                try {
                    module0015.$g533$.bind((SubLObject)module0683.T, var673);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020((SubLObject)module0683.TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)module0683.$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
                    final SubLObject var20_716 = module0015.$g533$.currentBinding(var673);
                    try {
                        module0015.$g533$.bind((SubLObject)module0683.T, var673);
                        if (module0683.$ic935$ != var585) {
                            module0656.f39837((SubLObject)module0683.$ic933$, var694, (SubLObject)module0683.$ic987$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
                            module0642.f39032((SubLObject)module0683.TWO_INTEGER);
                        }
                        if (module0683.NIL != var702) {
                            var673.resetMultipleValues();
                            final SubLObject var709 = f41919(var702);
                            final SubLObject var710 = var673.secondMultipleValue();
                            final SubLObject var711 = var673.thirdMultipleValue();
                            var673.resetMultipleValues();
                            module0642.f39019((SubLObject)module0683.$ic988$);
                            if (module0683.NIL != var709) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic989$, Sequences.length(var709));
                            }
                            if (module0683.NIL != var710) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic990$, Sequences.length(var710));
                            }
                            if (module0683.NIL != var711) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic991$, Sequences.length(var711));
                            }
                            if (module0683.$ic935$ == var585) {
                                if (module0683.NIL != var709) {
                                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                    if (module0683.NIL != var710 || module0683.NIL != var711) {
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic992$);
                                    }
                                    SubLObject var712 = var709;
                                    SubLObject var713 = (SubLObject)module0683.NIL;
                                    var713 = var712.first();
                                    while (module0683.NIL != var712) {
                                        f41920(var713);
                                        var712 = var712.rest();
                                        var713 = var712.first();
                                    }
                                }
                                if (module0683.NIL != var710) {
                                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                    if (module0683.NIL != var709 || module0683.NIL != var711) {
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic993$);
                                    }
                                    SubLObject var712 = var710;
                                    SubLObject var713 = (SubLObject)module0683.NIL;
                                    var713 = var712.first();
                                    while (module0683.NIL != var712) {
                                        f41920(var713);
                                        var712 = var712.rest();
                                        var713 = var712.first();
                                    }
                                }
                                if (module0683.NIL != var711) {
                                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                    if (module0683.NIL != var709 || module0683.NIL != var710) {
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic994$);
                                    }
                                    SubLObject var712 = var711;
                                    SubLObject var713 = (SubLObject)module0683.NIL;
                                    var713 = var712.first();
                                    while (module0683.NIL != var712) {
                                        f41920(var713);
                                        var712 = var712.rest();
                                        var713 = var712.first();
                                    }
                                }
                            }
                        }
                        if (module0683.NIL != var698) {
                            var673.resetMultipleValues();
                            final SubLObject var714 = f41921(var698, var694);
                            final SubLObject var715 = var673.secondMultipleValue();
                            var673.resetMultipleValues();
                            if (module0683.NIL != var702) {
                                if (module0683.$ic935$ == var585) {
                                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                }
                                else {
                                    module0642.f39032((SubLObject)module0683.FOUR_INTEGER);
                                }
                            }
                            module0642.f39019((SubLObject)module0683.$ic995$);
                            if (module0683.NIL != var714) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic996$, Sequences.length(var714));
                            }
                            if (module0683.NIL != var715) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic997$, Sequences.length(var715));
                            }
                            if (module0683.$ic935$ == var585) {
                                if (module0683.NIL != var714) {
                                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic998$);
                                    SubLObject var716 = var714;
                                    SubLObject var717 = (SubLObject)module0683.NIL;
                                    var717 = var716.first();
                                    while (module0683.NIL != var716) {
                                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                        module0656.f39916(var717, (SubLObject)module0683.T, (SubLObject)module0683.T);
                                        var716 = var716.rest();
                                        var717 = var716.first();
                                    }
                                }
                                if (module0683.NIL != var715) {
                                    module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)module0683.$ic999$);
                                    SubLObject var716 = var715;
                                    SubLObject var717 = (SubLObject)module0683.NIL;
                                    var717 = var716.first();
                                    while (module0683.NIL != var716) {
                                        module0642.f39026((SubLObject)module0683.UNPROVIDED);
                                        module0656.f39916(var717, (SubLObject)module0683.T, (SubLObject)module0683.T);
                                        var716 = var716.rest();
                                        var717 = var716.first();
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var20_716, var673);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var20_715, var673);
                }
                module0642.f39020(module0015.$g365$.getGlobalValue());
                module0642.f39029((SubLObject)module0683.UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var703, var673);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41920(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0656.f39837((SubLObject)module0683.$ic1000$, var1, (SubLObject)module0683.$ic1001$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0683.$ic1002$, oc_inference_datastructures_inference.f25531(var1));
        module0642.f39032((SubLObject)module0683.UNPROVIDED);
        return var1;
    }
    
    public static SubLObject f41922(final SubLObject var253) {
        final SubLThread var254 = SubLProcess.currentSubLThread();
        final SubLObject var255 = module0413.f28855(var253);
        final SubLObject var257;
        final SubLObject var256 = var257 = var255;
        final SubLObject var258 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic975$, var257);
        final SubLObject var259 = (SubLObject)((module0683.NIL != var258) ? conses_high.cadr(var258) : module0683.NIL);
        final SubLObject var260 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic980$, var257);
        final SubLObject var261 = (SubLObject)((module0683.NIL != var260) ? conses_high.cadr(var260) : module0683.NIL);
        final SubLObject var262 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic979$, var257);
        final SubLObject var263 = (SubLObject)((module0683.NIL != var262) ? conses_high.cadr(var262) : module0683.NIL);
        final SubLObject var264 = cdestructuring_bind.property_list_member((SubLObject)module0683.$ic981$, var257);
        final SubLObject var265 = (SubLObject)((module0683.NIL != var264) ? conses_high.cadr(var264) : module0683.NIL);
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)module0683.$ic1003$, module0048.f3302(var259, (SubLObject)module0683.FOUR_INTEGER));
        if (var261.isZero()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)module0683.$ic875$);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)module0683.$ic1004$, var261, module0048.f3302(Numbers.divide(var259, var261), (SubLObject)module0683.FOUR_INTEGER));
        }
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41919(final SubLObject var153) {
        SubLObject var154 = (SubLObject)module0683.NIL;
        SubLObject var155 = (SubLObject)module0683.NIL;
        SubLObject var156 = (SubLObject)module0683.NIL;
        SubLObject var157 = var153;
        SubLObject var158 = (SubLObject)module0683.NIL;
        var158 = var157.first();
        while (module0683.NIL != var157) {
            final SubLObject var159 = oc_inference_datastructures_inference.f25670(var158);
            if (var159.eql((SubLObject)module0683.$ic1005$)) {
                var154 = (SubLObject)ConsesLow.cons(var158, var154);
            }
            else if (var159.eql((SubLObject)module0683.$ic1006$)) {
                var155 = (SubLObject)ConsesLow.cons(var158, var155);
            }
            else if (var159.eql((SubLObject)module0683.$ic1007$)) {
                var156 = (SubLObject)ConsesLow.cons(var158, var156);
            }
            var157 = var157.rest();
            var158 = var157.first();
        }
        return Values.values(var154, var155, var156);
    }
    
    public static SubLObject f41921(final SubLObject var733, final SubLObject var734) {
        SubLObject var735 = (SubLObject)module0683.NIL;
        SubLObject var736 = (SubLObject)module0683.NIL;
        SubLObject var737 = var733;
        SubLObject var738 = (SubLObject)module0683.NIL;
        var738 = var737.first();
        while (module0683.NIL != var737) {
            if (module0683.NIL != module0211.f13667(var738, var734)) {
                var735 = (SubLObject)ConsesLow.cons(var738, var735);
            }
            else {
                var736 = (SubLObject)ConsesLow.cons(var738, var736);
            }
            var737 = var737.rest();
            var738 = var737.first();
        }
        return Values.values(var735, var736);
    }
    
    public static SubLObject f41918(SubLObject var737, SubLObject var708, SubLObject var738) {
        if (var737 == module0683.UNPROVIDED) {
            var737 = (SubLObject)module0683.$ic601$;
        }
        if (var708 == module0683.UNPROVIDED) {
            var708 = (SubLObject)module0683.$ic984$;
        }
        if (var738 == module0683.UNPROVIDED) {
            var738 = (SubLObject)module0683.ONE_INTEGER;
        }
        final SubLThread var739 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0642.f39020(module0015.$g149$.getGlobalValue());
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39048(var737);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
        final SubLObject var740 = module0015.$g533$.currentBinding(var739);
        try {
            module0015.$g533$.bind((SubLObject)module0683.T, var739);
            final SubLObject var741 = var708;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0683.NIL != var741) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
                module0642.f39020(module0642.f39042(var741));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0683.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0683.UNPROVIDED);
            final SubLObject var20_739 = module0015.$g533$.currentBinding(var739);
            try {
                module0015.$g533$.bind((SubLObject)module0683.T, var739);
                SubLObject var742;
                for (var742 = (SubLObject)module0683.NIL, var742 = (SubLObject)module0683.ZERO_INTEGER; var742.numL(var738); var742 = Numbers.add(var742, (SubLObject)module0683.ONE_INTEGER)) {
                    module0642.f39019((SubLObject)module0683.$ic1008$);
                }
            }
            finally {
                module0015.$g533$.rebind(var20_739, var739);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var740, var739);
        }
        module0642.f39020(module0015.$g150$.getGlobalValue());
        module0642.f39020(module0015.$g241$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41923() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41670", "S#45686", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41671", "S#45687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41672", "S#45688", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41673", "S#45689", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41674", "S#45292", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41675", "S#45690", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41676", "S#45691", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41677", "S#45692", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41678", "S#45693", 0, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41679", "S#45694", 0, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41681", "S#45695", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41682", "S#45696", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41683", "S#45697", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41684", "S#45698", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0683", "f41685", "S#45699");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41686", "S#45700", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41688", "S#45701", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41689", "S#45702", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41680", "S#45703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41690", "S#45704", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41687", "S#45705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41691", "S#45706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41692", "S#45707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41693", "S#45708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41694", "S#45709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41695", "S#45710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41696", "S#45711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41697", "S#45712", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41698", "S#45713", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0683", "f41699", "S#45714");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41700", "S#45715", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41701", "S#45716", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41702", "S#45717", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41703", "S#45718", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41704", "S#45719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41705", "S#45720", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41706", "S#45721", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41707", "S#45722", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0683", "f41709", "S#45723");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0683", "f41710", "S#45724");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41711", "S#45725", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41712", "S#45726", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41715", "S#45727", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41716", "S#45728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41713", "S#45729", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41708", "S#45730", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41717", "S#45731", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41714", "S#45294", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41718", "S#45732", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41719", "S#45733", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41720", "CB-QUERY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41722", "S#45734", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41721", "S#45735", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41723", "S#45736", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41724", "S#45737", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41725", "S#45738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41726", "S#45739", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41733", "S#45740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41734", "S#45741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41727", "S#45742", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41728", "S#45743", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41729", "S#45744", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41736", "S#45745", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41740", "S#45746", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41741", "S#45293", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41742", "S#45295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41737", "S#45747", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41738", "S#45748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41739", "S#45749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41743", "S#45750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41744", "S#45751", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41745", "S#45752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41730", "S#45753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41748", "S#45754", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41749", "S#45755", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41750", "S#45756", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41746", "S#45757", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41747", "S#45758", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41756", "S#45759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41757", "S#45760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41758", "S#45761", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41759", "S#45762", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41752", "S#45763", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41753", "S#45764", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41754", "S#45765", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41755", "S#45766", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41760", "S#45767", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41751", "S#45768", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41764", "S#45769", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41761", "S#45770", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41762", "S#45771", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41766", "S#45772", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41763", "S#45773", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41767", "S#45774", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41765", "S#45775", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41768", "S#45776", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41773", "S#45777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41774", "S#45778", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41775", "S#45779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41776", "S#45780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41769", "S#45781", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41778", "S#45782", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41777", "S#45783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41779", "S#45784", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41772", "S#45785", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41771", "S#45786", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41770", "S#45787", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41731", "S#45788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41780", "S#45789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41781", "S#45790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41732", "S#45791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41783", "S#45792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41782", "S#45793", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41784", "S#45794", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41785", "S#45795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41786", "CB-QUERY-PROOF-CHECKER-DROP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41787", "S#45796", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41788", "CB-QUERY-PROOF-CHECKER-DROP-ALL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41789", "S#45797", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41790", "CB-HANDLE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41794", "S#45798", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41796", "S#45799", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41791", "S#45800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41793", "S#45801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41792", "S#45802", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41798", "S#45803", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41799", "S#45804", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41795", "S#45805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41800", "S#45806", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41802", "S#45807", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41803", "S#45067", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41804", "S#45808", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41805", "CB-ASSERTION-SIMILAR-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41806", "S#45809", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41807", "S#45810", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41808", "CB-ASSERTION-ANTECEDENT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41809", "S#45811", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41810", "S#45812", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41811", "CB-RULE-KNOWN-EXTENT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41812", "S#45813", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41813", "S#45814", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41814", "CB-RULE-UNKNOWN-EXTENT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41815", "S#44726", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41797", "S#45815", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41816", "CB-LITERAL-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41818", "CB-LQ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41819", "S#45816", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41817", "S#45817", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41821", "S#45818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41822", "S#45819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41823", "S#44079", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41824", "S#45820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41820", "S#45821", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41735", "S#45822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41826", "CB-INFERENCE-PROGRESS-PAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41825", "S#45823", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41827", "S#45824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41828", "S#45825", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41829", "CB-AUTO-REFRESH-QUERY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41831", "S#45826", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41830", "S#45827", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41832", "S#45828", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41833", "CB-ALL-INFERENCE-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41801", "S#45829", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41834", "CB-FOCUS-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41835", "S#45830", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41836", "CB-DEFOCUS-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41837", "S#45831", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41838", "CB-INTERRUPT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41839", "S#45832", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41840", "CB-ABORT-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41841", "S#45833", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41842", "CB-FORGET-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41843", "S#45834", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41844", "CB-FORGET-ALL-INFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41845", "S#45835", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41846", "CB-FORGET-ALL-OTHER-INFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41847", "S#45836", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41848", "CB-REINFORCE-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41849", "S#45837", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41850", "S#45838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41851", "CB-DESTROY-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41852", "S#45839", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41853", "CB-DESTROY-ALL-INFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41854", "S#45840", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41855", "CB-DESTROY-ALL-OTHER-INFERENCES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41856", "S#45841", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41857", "S#45842", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41858", "CB-INFERENCE-TO-SUBL-QUERY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41859", "S#45843", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41860", "CB-GRAPH-INFERENCE-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41861", "S#45844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41862", "S#45845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41863", "CB-SAVE-INFERENCE-ANSWERS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41864", "S#45846", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41865", "CB-SAVE-INFERENCE-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41866", "S#45847", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41867", "CB-SAVE-INFERENCE-ANSWERS-AS-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41868", "S#45848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41869", "S#45849", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41870", "S#45850", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41871", "CB-INFERENCE-ANSWER-TIMELINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41873", "S#45851", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41872", "S#45852", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41874", "S#45853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41875", "CB-INFERENCE-STRENGTHEN-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41876", "S#45854", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41877", "S#31806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41878", "S#45855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41879", "CB-TRANSFORMATION-RULE-STATISTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41880", "S#45856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41882", "S#45857", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41881", "S#45858", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41883", "S#45859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41884", "S#45065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41885", "S#45860", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41886", "S#45861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41887", "CB-DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41888", "S#45862", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41889", "CB-ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41890", "S#45863", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41891", "CB-DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41892", "S#45864", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41893", "CB-ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41894", "S#45865", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41895", "CB-DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41896", "S#45866", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41897", "CB-ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41898", "S#45867", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41899", "CB-CLEAR-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41900", "S#45868", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41901", "CB-CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41902", "S#45869", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41903", "CB-HANDLE-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41904", "CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41905", "CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-SAVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41906", "CB-FORWARD-INFERENCE-METRICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41908", "S#45870", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41909", "CB-RULE-FORWARD-INFERENCE-METRICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41911", "S#45871", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41912", "CB-CLEAR-FORWARD-INFERENCE-METRICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41913", "S#45872", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41914", "CB-START-GATHERING-FORWARD-INFERENCE-METRICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41915", "S#45873", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41916", "CB-STOP-GATHERING-FORWARD-INFERENCE-METRICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41917", "S#45874", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41907", "S#41780", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41910", "S#45875", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41920", "S#45876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41922", "S#45066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41919", "S#45877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41921", "S#45878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0683", "f41918", "S#45879", 0, 3, false);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41924() {
        module0683.$g5352$ = SubLFiles.deflexical("S#45880", (SubLObject)module0683.T);
        module0683.$g5353$ = SubLFiles.deflexical("S#45881", (SubLObject)module0683.$ic26$);
        module0683.$g5354$ = SubLFiles.deflexical("S#45882", (module0683.NIL != Symbols.boundp((SubLObject)module0683.$ic28$)) ? module0683.$g5354$.getGlobalValue() : module0067.f4880((SubLObject)module0683.EQ, (SubLObject)module0683.UNPROVIDED));
        module0683.$g5355$ = SubLFiles.deflexical("S#45883", (SubLObject)module0683.FOUR_INTEGER);
        module0683.$g5356$ = SubLFiles.defvar("S#45884", (SubLObject)module0683.NIL);
        module0683.$g5357$ = SubLFiles.defvar("S#45885", (SubLObject)module0683.NIL);
        module0683.$g5358$ = SubLFiles.defparameter("S#45886", module0683.$ic307$);
        module0683.$g5359$ = SubLFiles.defparameter("S#45887", (SubLObject)ConsesLow.listS(module0683.$ic309$, module0683.$g5358$.getDynamicValue(), (SubLObject)module0683.$ic310$));
        module0683.$g5360$ = SubLFiles.deflexical("S#45888", (SubLObject)module0683.$ic313$);
        module0683.$g5325$ = SubLFiles.defparameter("S#45889", (SubLObject)module0683.NIL);
        module0683.$g5361$ = SubLFiles.deflexical("S#45890", (SubLObject)module0683.$ic360$);
        module0683.$g5362$ = SubLFiles.deflexical("S#45891", (SubLObject)module0683.$ic366$);
        module0683.$g5364$ = SubLFiles.deflexical("S#45892", (SubLObject)module0683.$ic371$);
        module0683.$g5365$ = SubLFiles.deflexical("S#45893", (SubLObject)module0683.$ic373$);
        module0683.$g5366$ = SubLFiles.deflexical("S#45894", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0683.$ic133$, Numbers.integerDivide(module0360.$g3047$.getGlobalValue(), (SubLObject)module0683.$ic137$), (SubLObject)module0683.$ic376$)));
        module0683.$g5367$ = SubLFiles.deflexical("S#45895", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)module0683.$ic138$, Numbers.integerDivide(module0360.$g3044$.getGlobalValue(), (SubLObject)module0683.$ic137$), (SubLObject)module0683.$ic376$)));
        module0683.$g5368$ = SubLFiles.deflexical("S#45896", (SubLObject)module0683.NIL);
        module0683.$g5369$ = SubLFiles.deflexical("S#45897", (SubLObject)module0683.$ic377$);
        module0683.$g5363$ = SubLFiles.deflexical("S#45898", ConsesLow.append(new SubLObject[] { module0683.$g5361$.getGlobalValue(), module0683.$g5364$.getGlobalValue(), module0683.$g5365$.getGlobalValue(), module0683.$g5366$.getGlobalValue(), module0683.$g5367$.getGlobalValue(), module0683.$g5369$.getGlobalValue() }));
        module0683.$g5370$ = SubLFiles.deflexical("S#45899", Mapping.mapcar(Symbols.symbol_function((SubLObject)module0683.$ic368$), module0683.$g5363$.getGlobalValue()));
        module0683.$g5371$ = SubLFiles.deflexical("S#45900", (SubLObject)module0683.$ic389$);
        module0683.$g5372$ = SubLFiles.deflexical("S#45901", (SubLObject)module0683.$ic390$);
        module0683.$g5373$ = SubLFiles.deflexical("S#45902", (SubLObject)module0683.$ic391$);
        module0683.$g5374$ = SubLFiles.deflexical("S#45903", (SubLObject)module0683.$ic392$);
        module0683.$g5375$ = SubLFiles.deflexical("S#45904", (SubLObject)module0683.$ic401$);
        module0683.$g5376$ = SubLFiles.deflexical("S#45905", module0683.$ic524$);
        module0683.$g5377$ = SubLFiles.deflexical("S#45906", (SubLObject)module0683.$ic530$);
        module0683.$g5378$ = SubLFiles.deflexical("S#45907", (SubLObject)module0683.NIL);
        module0683.$g5379$ = SubLFiles.deflexical("S#45908", (SubLObject)module0683.THREE_INTEGER);
        module0683.$g5380$ = SubLFiles.deflexical("S#45909", (SubLObject)module0683.TEN_INTEGER);
        module0683.$g5384$ = SubLFiles.defparameter("S#45910", (SubLObject)module0683.$ic812$);
        return (SubLObject)module0683.NIL;
    }
    
    public static SubLObject f41925() {
        module0656.f39840((SubLObject)module0683.$ic12$, (SubLObject)module0683.$ic13$, (SubLObject)module0683.TWO_INTEGER);
        module0003.f57((SubLObject)module0683.$ic28$);
        module0001.f5((SubLObject)module0683.$ic39$, (SubLObject)module0683.$ic40$);
        module0002.f50((SubLObject)module0683.$ic37$, (SubLObject)module0683.$ic39$);
        f41700((SubLObject)module0683.$ic46$, (SubLObject)module0683.$ic47$, (SubLObject)module0683.$ic48$, (SubLObject)module0683.$ic49$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic50$, (SubLObject)module0683.$ic51$, (SubLObject)module0683.$ic52$, (SubLObject)module0683.$ic53$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic54$, (SubLObject)module0683.$ic55$, (SubLObject)module0683.$ic56$, (SubLObject)module0683.$ic57$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic58$, (SubLObject)module0683.$ic59$, (SubLObject)module0683.$ic60$, (SubLObject)module0683.$ic61$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic62$, (SubLObject)module0683.$ic63$, (SubLObject)module0683.$ic64$, (SubLObject)module0683.$ic53$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic65$, (SubLObject)module0683.$ic66$, (SubLObject)module0683.$ic67$, (SubLObject)module0683.$ic68$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic69$, (SubLObject)module0683.$ic70$, (SubLObject)module0683.$ic71$, (SubLObject)module0683.$ic72$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic73$, (SubLObject)module0683.$ic74$, (SubLObject)module0683.$ic75$, (SubLObject)module0683.$ic76$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic77$, (SubLObject)module0683.$ic78$, (SubLObject)module0683.$ic79$, (SubLObject)module0683.$ic80$, (SubLObject)module0683.$ic81$, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic82$, (SubLObject)module0683.$ic83$, (SubLObject)module0683.$ic84$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic86$, (SubLObject)module0683.$ic87$, (SubLObject)module0683.$ic88$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic89$, (SubLObject)module0683.$ic90$, (SubLObject)module0683.$ic91$, (SubLObject)module0683.$ic92$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic93$, (SubLObject)module0683.$ic94$, (SubLObject)module0683.$ic95$, (SubLObject)module0683.$ic96$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic97$, (SubLObject)module0683.$ic98$, (SubLObject)module0683.$ic99$, (SubLObject)module0683.$ic100$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic101$, (SubLObject)module0683.$ic102$, (SubLObject)module0683.$ic103$, (SubLObject)module0683.$ic104$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic105$, (SubLObject)module0683.$ic106$, (SubLObject)module0683.$ic107$, (SubLObject)module0683.$ic104$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic108$, (SubLObject)module0683.$ic109$, (SubLObject)module0683.$ic110$, (SubLObject)module0683.$ic104$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic111$, (SubLObject)module0683.$ic112$, (SubLObject)module0683.$ic113$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic114$, (SubLObject)module0683.$ic115$, (SubLObject)module0683.$ic116$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic117$, (SubLObject)module0683.$ic118$, (SubLObject)module0683.$ic119$, (SubLObject)module0683.$ic120$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic121$, (SubLObject)module0683.$ic122$, (SubLObject)module0683.$ic123$, (SubLObject)module0683.$ic124$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic125$, (SubLObject)module0683.$ic126$, (SubLObject)module0683.$ic127$, (SubLObject)module0683.$ic128$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic129$, (SubLObject)module0683.$ic130$, (SubLObject)module0683.$ic131$, (SubLObject)module0683.$ic132$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic133$, (SubLObject)module0683.$ic134$, (SubLObject)module0683.$ic135$, (SubLObject)module0683.$ic136$, (SubLObject)module0683.$ic137$, (SubLObject)module0683.T);
        f41700((SubLObject)module0683.$ic138$, (SubLObject)module0683.$ic139$, (SubLObject)module0683.$ic140$, (SubLObject)module0683.$ic141$, (SubLObject)module0683.$ic137$, (SubLObject)module0683.T);
        f41700((SubLObject)module0683.$ic142$, (SubLObject)module0683.$ic143$, (SubLObject)module0683.$ic144$, (SubLObject)module0683.$ic145$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic146$, (SubLObject)module0683.$ic147$, (SubLObject)module0683.$ic148$, (SubLObject)module0683.$ic149$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic150$, (SubLObject)module0683.$ic151$, (SubLObject)module0683.$ic152$, (SubLObject)module0683.$ic153$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic154$, (SubLObject)module0683.$ic155$, (SubLObject)module0683.$ic156$, (SubLObject)module0683.$ic157$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic158$, (SubLObject)module0683.$ic159$, (SubLObject)module0683.$ic160$, (SubLObject)module0683.$ic161$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic162$, (SubLObject)module0683.$ic163$, (SubLObject)module0683.$ic164$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic165$, (SubLObject)module0683.$ic166$, (SubLObject)module0683.$ic167$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic168$, (SubLObject)module0683.$ic169$, (SubLObject)module0683.$ic170$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic171$, (SubLObject)module0683.$ic172$, (SubLObject)module0683.$ic173$, (SubLObject)module0683.$ic174$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic175$, (SubLObject)module0683.$ic176$, (SubLObject)module0683.$ic177$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic178$, (SubLObject)module0683.$ic179$, (SubLObject)module0683.$ic180$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic181$, (SubLObject)module0683.$ic182$, (SubLObject)module0683.$ic183$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic184$, (SubLObject)module0683.$ic185$, (SubLObject)module0683.$ic186$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        f41700((SubLObject)module0683.$ic187$, (SubLObject)module0683.$ic188$, (SubLObject)module0683.$ic189$, (SubLObject)module0683.$ic85$, (SubLObject)module0683.NIL, (SubLObject)module0683.NIL);
        module0012.f441((SubLObject)module0683.$ic198$);
        module0015.f873((SubLObject)module0683.$ic213$);
        Hashtables.sethash((SubLObject)module0683.$ic214$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0683.$ic215$, (SubLObject)module0683.NIL));
        module0656.f39840((SubLObject)module0683.$ic214$, (SubLObject)module0683.$ic219$, (SubLObject)module0683.ONE_INTEGER);
        module0656.f39819((SubLObject)module0683.$ic214$, (SubLObject)module0683.$ic216$, (SubLObject)module0683.$ic216$, (SubLObject)module0683.$ic220$);
        Hashtables.sethash((SubLObject)module0683.$ic243$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0683.$ic244$, (SubLObject)module0683.NIL));
        module0012.f441((SubLObject)module0683.$ic308$);
        module0012.f444((SubLObject)module0683.$ic308$);
        module0012.f441((SubLObject)module0683.$ic311$);
        module0012.f444((SubLObject)module0683.$ic311$);
        module0012.f441((SubLObject)module0683.$ic341$);
        module0012.f444((SubLObject)module0683.$ic341$);
        module0015.f873((SubLObject)module0683.$ic448$);
        module0656.f39840((SubLObject)module0683.$ic433$, (SubLObject)module0683.$ic452$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic453$);
        module0656.f39840((SubLObject)module0683.$ic422$, (SubLObject)module0683.$ic456$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic472$);
        module0656.f39840((SubLObject)module0683.$ic495$, (SubLObject)module0683.$ic496$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic498$);
        module0656.f39840((SubLObject)module0683.$ic505$, (SubLObject)module0683.$ic506$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic507$);
        module0656.f39840((SubLObject)module0683.$ic512$, (SubLObject)module0683.$ic513$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic515$);
        module0656.f39840((SubLObject)module0683.$ic519$, (SubLObject)module0683.$ic520$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic521$);
        module0015.f873((SubLObject)module0683.$ic528$);
        module0015.f873((SubLObject)module0683.$ic529$);
        Hashtables.sethash((SubLObject)module0683.$ic531$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0683.$ic532$, (SubLObject)module0683.NIL));
        Hashtables.sethash((SubLObject)module0683.$ic531$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0683.$ic532$, (SubLObject)module0683.NIL));
        module0015.f873((SubLObject)module0683.$ic588$);
        module0015.f873((SubLObject)module0683.$ic612$);
        module0656.f39840((SubLObject)module0683.$ic593$, (SubLObject)module0683.$ic615$, (SubLObject)module0683.TWO_INTEGER);
        module0656.f39840((SubLObject)module0683.$ic604$, (SubLObject)module0683.$ic618$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic620$);
        module0015.f873((SubLObject)module0683.$ic622$);
        module0656.f39840((SubLObject)module0683.$ic272$, (SubLObject)module0683.$ic625$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic626$);
        module0656.f39840((SubLObject)module0683.$ic282$, (SubLObject)module0683.$ic629$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic630$);
        module0656.f39840((SubLObject)module0683.$ic595$, (SubLObject)module0683.$ic632$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic633$);
        module0656.f39840((SubLObject)module0683.$ic597$, (SubLObject)module0683.$ic635$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic636$);
        module0656.f39840((SubLObject)module0683.$ic639$, (SubLObject)module0683.$ic640$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic641$);
        module0656.f39840((SubLObject)module0683.$ic644$, (SubLObject)module0683.$ic645$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic646$);
        module0656.f39840((SubLObject)module0683.$ic648$, (SubLObject)module0683.$ic649$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic652$);
        module0656.f39840((SubLObject)module0683.$ic656$, (SubLObject)module0683.$ic657$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic658$);
        module0656.f39840((SubLObject)module0683.$ic274$, (SubLObject)module0683.$ic661$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic662$);
        module0656.f39840((SubLObject)module0683.$ic665$, (SubLObject)module0683.$ic666$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic668$);
        module0656.f39840((SubLObject)module0683.$ic270$, (SubLObject)module0683.$ic671$, (SubLObject)module0683.ONE_INTEGER);
        module0656.f39840((SubLObject)module0683.$ic675$, (SubLObject)module0683.$ic676$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic678$);
        module0656.f39840((SubLObject)module0683.$ic607$, (SubLObject)module0683.$ic687$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic688$);
        module0015.f873((SubLObject)module0683.$ic717$);
        Hashtables.sethash((SubLObject)module0683.$ic721$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0683.$ic722$, (SubLObject)module0683.NIL));
        module0015.f873((SubLObject)module0683.$ic745$);
        module0656.f39840((SubLObject)module0683.$ic606$, (SubLObject)module0683.$ic748$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic750$);
        module0656.f39840((SubLObject)module0683.$ic608$, (SubLObject)module0683.$ic769$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic774$);
        module0656.f39840((SubLObject)module0683.$ic610$, (SubLObject)module0683.$ic777$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic803$);
        module0656.f39840((SubLObject)module0683.$ic808$, (SubLObject)module0683.$ic809$, (SubLObject)module0683.THREE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic813$);
        module0656.f39840((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic829$, (SubLObject)module0683.TWO_INTEGER);
        module0667.f40552((SubLObject)module0683.$ic816$, (SubLObject)module0683.$ic388$, (SubLObject)module0683.$ic830$, (SubLObject)module0683.$ic831$, (SubLObject)module0683.ZERO_INTEGER, (SubLObject)module0683.$ic8$, (SubLObject)module0683.$ic814$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0015.f873((SubLObject)module0683.$ic887$);
        module0656.f39840((SubLObject)module0683.$ic839$, (SubLObject)module0683.$ic889$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic890$);
        module0656.f39840((SubLObject)module0683.$ic840$, (SubLObject)module0683.$ic892$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic893$);
        module0656.f39840((SubLObject)module0683.$ic834$, (SubLObject)module0683.$ic895$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic896$);
        module0656.f39840((SubLObject)module0683.$ic835$, (SubLObject)module0683.$ic898$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic899$);
        module0656.f39840((SubLObject)module0683.$ic842$, (SubLObject)module0683.$ic901$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic902$);
        module0656.f39840((SubLObject)module0683.$ic843$, (SubLObject)module0683.$ic904$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic908$);
        module0656.f39840((SubLObject)module0683.$ic911$, (SubLObject)module0683.$ic912$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic913$);
        module0656.f39840((SubLObject)module0683.$ic817$, (SubLObject)module0683.$ic916$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic919$);
        module0015.f873((SubLObject)module0683.$ic922$);
        module0015.f873((SubLObject)module0683.$ic925$);
        module0015.f873((SubLObject)module0683.$ic927$);
        module0656.f39840((SubLObject)module0683.$ic929$, (SubLObject)module0683.$ic930$, (SubLObject)module0683.ONE_INTEGER);
        module0667.f40552((SubLObject)module0683.$ic929$, (SubLObject)module0683.$ic388$, (SubLObject)module0683.$ic830$, (SubLObject)module0683.$ic928$, (SubLObject)module0683.ZERO_INTEGER, (SubLObject)module0683.$ic8$, (SubLObject)module0683.$ic926$, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED, (SubLObject)module0683.UNPROVIDED);
        module0015.f873((SubLObject)module0683.$ic936$);
        module0656.f39840((SubLObject)module0683.$ic933$, (SubLObject)module0683.$ic939$, (SubLObject)module0683.TWO_INTEGER);
        module0015.f873((SubLObject)module0683.$ic940$);
        module0656.f39840((SubLObject)module0683.$ic943$, (SubLObject)module0683.$ic944$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic945$);
        module0656.f39840((SubLObject)module0683.$ic948$, (SubLObject)module0683.$ic949$, (SubLObject)module0683.ONE_INTEGER);
        module0015.f873((SubLObject)module0683.$ic950$);
        module0656.f39840((SubLObject)module0683.$ic953$, (SubLObject)module0683.$ic954$, (SubLObject)module0683.ONE_INTEGER);
        return (SubLObject)module0683.NIL;
    }
    
    public void declareFunctions() {
        f41923();
    }
    
    public void initializeVariables() {
        f41924();
    }
    
    public void runTopLevelForms() {
        f41925();
    }
    
    static {
        me = (SubLFile)new module0683();
        module0683.$g5352$ = null;
        module0683.$g5353$ = null;
        module0683.$g5354$ = null;
        module0683.$g5355$ = null;
        module0683.$g5356$ = null;
        module0683.$g5357$ = null;
        module0683.$g5358$ = null;
        module0683.$g5359$ = null;
        module0683.$g5360$ = null;
        module0683.$g5325$ = null;
        module0683.$g5361$ = null;
        module0683.$g5362$ = null;
        module0683.$g5364$ = null;
        module0683.$g5365$ = null;
        module0683.$g5366$ = null;
        module0683.$g5367$ = null;
        module0683.$g5368$ = null;
        module0683.$g5369$ = null;
        module0683.$g5363$ = null;
        module0683.$g5370$ = null;
        module0683.$g5371$ = null;
        module0683.$g5372$ = null;
        module0683.$g5373$ = null;
        module0683.$g5374$ = null;
        module0683.$g5375$ = null;
        module0683.$g5376$ = null;
        module0683.$g5377$ = null;
        module0683.$g5378$ = null;
        module0683.$g5379$ = null;
        module0683.$g5380$ = null;
        module0683.$g5384$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic1$ = SubLObjectFactory.makeString("-");
        $ic2$ = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45911", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45912", "CYC"));
        $ic4$ = SubLObjectFactory.makeString("nd();");
        $ic5$ = SubLObjectFactory.makeString("  ");
        $ic6$ = SubLObjectFactory.makeString("");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1628", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1629", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1553", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("MAIN")), (SubLObject)SubLObjectFactory.makeSymbol("S#43330", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1633", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#896", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#42997", "CYC"));
        $ic8$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic9$ = SubLObjectFactory.makeSymbol("S#43673", "CYC");
        $ic10$ = SubLObjectFactory.makeKeyword("DOC");
        $ic11$ = SubLObjectFactory.makeKeyword("SELF");
        $ic12$ = SubLObjectFactory.makeKeyword("INFERENCE-DOC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#45700", "CYC");
        $ic14$ = SubLObjectFactory.makeString("None");
        $ic15$ = SubLObjectFactory.makeString("~D total");
        $ic16$ = SubLObjectFactory.makeString(", ");
        $ic17$ = SubLObjectFactory.makeString("~D new");
        $ic18$ = SubLObjectFactory.makeString("~D new justification~P");
        $ic19$ = SubLObjectFactory.makeKeyword("TAUTOLOGY");
        $ic20$ = SubLObjectFactory.makeKeyword("CONTRADICTION");
        $ic21$ = SubLObjectFactory.makeKeyword("SUSPENDED-INITIAL-JUSTIFICATION");
        $ic22$ = SubLObjectFactory.makeString("[Explain]");
        $ic23$ = SubLObjectFactory.makeKeyword("SUSPENDED");
        $ic24$ = SubLObjectFactory.makeString("More...");
        $ic25$ = SubLObjectFactory.makeString("help/inference/");
        $ic26$ = SubLObjectFactory.makeString("inference-overview");
        $ic27$ = SubLObjectFactory.makeString(".html#");
        $ic28$ = SubLObjectFactory.makeSymbol("S#45882", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("FANCY-NAME");
        $ic30$ = SubLObjectFactory.makeKeyword("DESCRIPTION");
        $ic31$ = SubLObjectFactory.makeKeyword("SETTINGS");
        $ic32$ = SubLObjectFactory.makeKeyword("SCALING-FACTOR");
        $ic33$ = SubLObjectFactory.makeKeyword("ROUND-ON-INPUT?");
        $ic34$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#669", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#30807", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45913", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FANCY-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeKeyword("SETTINGS"), (SubLObject)SubLObjectFactory.makeKeyword("SCALING-FACTOR"), (SubLObject)SubLObjectFactory.makeKeyword("ROUND-ON-INPUT?"));
        $ic36$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = SubLObjectFactory.makeSymbol("S#45715", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic39$ = SubLObjectFactory.makeSymbol("S#45714", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#723", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic41$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeString("")));
        $ic43$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#43330", "CYC"));
        $ic44$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic45$ = SubLObjectFactory.makeKeyword("ENTRY");
        $ic46$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic47$ = SubLObjectFactory.makeString("Number cutoff");
        $ic48$ = SubLObjectFactory.makeString("This controls how many answers we want to find before suspending.");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeString("answers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("Get everything")));
        $ic50$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic51$ = SubLObjectFactory.makeString("Time cutoff");
        $ic52$ = SubLObjectFactory.makeString("This controls how long we allow an inference to run before suspending.");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeString("seconds")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("Run forever")));
        $ic54$ = SubLObjectFactory.makeKeyword("MAX-STEP");
        $ic55$ = SubLObjectFactory.makeString("Step cutoff");
        $ic56$ = SubLObjectFactory.makeString("This controls how many inference steps we allow before suspending.");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeString("steps")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("No limit")));
        $ic58$ = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $ic59$ = SubLObjectFactory.makeString("Inference engine mode");
        $ic60$ = SubLObjectFactory.makeString("This controls what mode the inference engine will operate under; roughly, how deep it will search for an answer before giving up.  This is a meta-property that controls many other low-level inference settings.");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeString("Minimal")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW"), (SubLObject)SubLObjectFactory.makeString("Shallow")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EXTENDED"), (SubLObject)SubLObjectFactory.makeString("Extended")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("MAXIMAL"), (SubLObject)SubLObjectFactory.makeString("Maximal")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("CUSTOM"), (SubLObject)SubLObjectFactory.makeString("Debug")));
        $ic62$ = SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME");
        $ic63$ = SubLObjectFactory.makeString("Forward time cutoff");
        $ic64$ = SubLObjectFactory.makeString("This controls how long we allow forward inference in the mt of an inference to run before starting the backward inference.  This is usually only used for hypothetical queries.");
        $ic65$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic66$ = SubLObjectFactory.makeString("Transformation cutoff");
        $ic67$ = SubLObjectFactory.makeString("This specifies the maximum allowable number of transformation steps in answers.");
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeString("transformation steps (at most)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("Unlimited transformation")));
        $ic69$ = SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY");
        $ic70$ = SubLObjectFactory.makeString("Rule utility threshold");
        $ic71$ = SubLObjectFactory.makeString("This specifies the minimum allowable utility of a rule used in transformation, from -100 to +100.");
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("S#28200", "CYC"), (SubLObject)SubLObjectFactory.makeString("minimum rule utility")));
        $ic73$ = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $ic74$ = SubLObjectFactory.makeString("Proof complexity cutoff");
        $ic75$ = SubLObjectFactory.makeString("This specifies the maximum allowable number of steps in proofs for answers.");
        $ic76$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeString("proof steps (at most)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("No limit")));
        $ic77$ = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic78$ = SubLObjectFactory.makeString("Probably Done cutoff");
        $ic79$ = SubLObjectFactory.makeString("Probably Approximately Done: This controls how sure the Strategist must be that an inference will yield no more results before terminating it.  The Strategist uses past experience to make this determination.");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("S#4707", "CYC"), (SubLObject)SubLObjectFactory.makeString("%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeString("100 %")));
        $ic81$ = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $ic82$ = SubLObjectFactory.makeKeyword("BLOCK?");
        $ic83$ = SubLObjectFactory.makeString("Step by step");
        $ic84$ = SubLObjectFactory.makeString("This controls whether the inference will be run one step at a time, waiting for the user to click between each step.\nYou'll probably want to turn the time cutoff to 'run forever' if you want to go step by step.");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.T, (SubLObject)SubLObjectFactory.makeString("Yes")));
        $ic86$ = SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic87$ = SubLObjectFactory.makeString("Cache backward query results");
        $ic88$ = SubLObjectFactory.makeString("This controls whether or not the proofs for successful inference answers are cached\nas deductions for assertions in the KB.");
        $ic89$ = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $ic90$ = SubLObjectFactory.makeString("Answer language");
        $ic91$ = SubLObjectFactory.makeString("This controls the CycL language used to express answers.");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeString("HL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EL"), (SubLObject)SubLObjectFactory.makeString("EL")));
        $ic93$ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $ic94$ = SubLObjectFactory.makeString("Continuable");
        $ic95$ = SubLObjectFactory.makeString("This controls whether the inference is continuable or not.");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("No (allows strengthening)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.T, (SubLObject)SubLObjectFactory.makeString("Yes")));
        $ic97$ = SubLObjectFactory.makeKeyword("METRICS");
        $ic98$ = SubLObjectFactory.makeString("Metrics");
        $ic99$ = SubLObjectFactory.makeString("This controls which metrics are gathered while the inference is running.");
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("None")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("S#3341", "CYC"), (SubLObject)SubLObjectFactory.makeString("")));
        $ic101$ = SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic102$ = SubLObjectFactory.makeString("Allow HL predicate transformation");
        $ic103$ = SubLObjectFactory.makeString("Whether transformation is allowed on literals with HL predicates (e.g. #$isa, #$genls, #$equals, etc.)");
        $ic104$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("No")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.T, (SubLObject)SubLObjectFactory.makeString("Yes (expensive)")));
        $ic105$ = SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic106$ = SubLObjectFactory.makeString("Allow unbound predicate rule backchaining");
        $ic107$ = SubLObjectFactory.makeString("Whether it is permissible to use rules that conclude to literals with variable predicates.");
        $ic108$ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic109$ = SubLObjectFactory.makeString("Allow evaluatable predicate transformation");
        $ic110$ = SubLObjectFactory.makeString("Whether transformation is allowed on literals with evaluatable predicates (e.g. #$different, #$greaterThan, #$substring, etc.)");
        $ic111$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic112$ = SubLObjectFactory.makeString("Allow result bindings to indeterminates");
        $ic113$ = SubLObjectFactory.makeString("Whether it is permissible to use quoted instances of #$IndeterminateTerm for result bindings.\n   Note that quoted instances of #$IndeterminateTerm will always be used for explicitly scoped variables \n   (e.g. scoped by #$thereExists, etc.).");
        $ic114$ = SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic115$ = SubLObjectFactory.makeString("Allow abnormality checking?");
        $ic116$ = SubLObjectFactory.makeString("Whether to check for exceptions to top-level proofs, e.g. exceptions to rules in transformation proofs.");
        $ic117$ = SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $ic118$ = SubLObjectFactory.makeString("Transitive closure mode");
        $ic119$ = SubLObjectFactory.makeString("The degree to which modules (such as transitiveViaArg) should generate transitive closures. ");
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeString("No closures")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("FOCUSED"), (SubLObject)SubLObjectFactory.makeString("Focused closures (expensive)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeString("Full closures (very expensive)")));
        $ic121$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS");
        $ic122$ = SubLObjectFactory.makeString("Result uniqueness is based on");
        $ic123$ = SubLObjectFactory.makeString("If result uniqueness is based on different bindings, it won't bother to prove the same thing using different methods.");
        $ic124$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS"), (SubLObject)SubLObjectFactory.makeString("different bindings")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("PROOF"), (SubLObject)SubLObjectFactory.makeString("different proofs")));
        $ic125$ = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic126$ = SubLObjectFactory.makeString("If disjuncts have different free EL variables, ");
        $ic127$ = SubLObjectFactory.makeString("What to do if different top-level disjuncts in the query have different sets of free EL variables,\ne.g. (or (isa ?X Dog) (isa ?Y Cat)).");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRE-EQUAL"), (SubLObject)SubLObjectFactory.makeString("deem the query ill-formed")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION"), (SubLObject)SubLObjectFactory.makeString("use their intersection")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTE-UNION"), (SubLObject)SubLObjectFactory.makeString("use their union")));
        $ic129$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic130$ = SubLObjectFactory.makeString("Allowed HL Modules");
        $ic131$ = SubLObjectFactory.makeString("An HL module specification which limits the Strategist's ability to use certain HL modules.");
        $ic132$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("S#25450", "CYC"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeString("All HL Modules")));
        $ic133$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $ic134$ = SubLObjectFactory.makeString("Productivity limit");
        $ic135$ = SubLObjectFactory.makeString("If a tactic is estimated to have more than this productivity, it will be ignored instead of executed.\nProductivity is (roughly) the expected number of answers generated.");
        $ic136$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("S#65", "CYC"), (SubLObject)SubLObjectFactory.makeString("(at most)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeString("No limit")));
        $ic137$ = SubLObjectFactory.makeInteger(100);
        $ic138$ = SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $ic139$ = SubLObjectFactory.makeString("Removal backtracking productivity limit");
        $ic140$ = SubLObjectFactory.makeString("If a tactic is estimated to have more than this productivity, it will not be considered for Removal Backtracking\nProductivity is (roughly) 100 * the expected number of answers generated.  Note that in the Inference Browser,\ndisplayed productivities are divided by 100.");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeString("(at most)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeString("No limit")));
        $ic142$ = SubLObjectFactory.makeKeyword("EQUALITY-REASONING-METHOD");
        $ic143$ = SubLObjectFactory.makeString("Canonicalize problems");
        $ic144$ = SubLObjectFactory.makeString("Whether to canonicalize problem queries wrt literal order and HL variable order.\nWARNING: results may be unpredictable if canonicalization is disabled.");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("CZER-EQUAL"), (SubLObject)SubLObjectFactory.makeString("Yes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL"), (SubLObject)SubLObjectFactory.makeString("No")));
        $ic146$ = SubLObjectFactory.makeKeyword("EQUALITY-REASONING-DOMAIN");
        $ic147$ = SubLObjectFactory.makeString("Allow problem reuse for");
        $ic148$ = SubLObjectFactory.makeString("Which problems are permitted to be reused by the Worker.\nWARNING: results may be unpredictable if this is set to anything other than 'all problems'.");
        $ic149$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeString("all problems")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("SINGLE-LITERAL"), (SubLObject)SubLObjectFactory.makeString("only single-literal problems")));
        $ic150$ = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic151$ = SubLObjectFactory.makeString("Intermediate proof validation");
        $ic152$ = SubLObjectFactory.makeString("How carefully to check the intermediate proofs that are used in inference\nfor semantic well-formedness.");
        $ic153$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeString("full (most expensive)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ARG-TYPE"), (SubLObject)SubLObjectFactory.makeString("only arg-type")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeString("only HL validations")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeString("none (least expensive)")));
        $ic154$ = SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT");
        $ic155$ = SubLObjectFactory.makeString("Space cutoff");
        $ic156$ = SubLObjectFactory.makeString("The maximum number of subproblems the Worker can create before being forced to suspend.\nIf this limit is exceeded, it will try to prune dead-end and unnecessary problems before suspending.\nSetting this to a higher number (or unlimited) is dangerous; it allows a single inference to use more memory,\nwhich may result in a crash if the machine's memory capacity is exceeded.");
        $ic157$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeString("problems (at most)")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("POSITIVE-INFINITY"), (SubLObject)SubLObjectFactory.makeString("Unlimited number of problems")));
        $ic158$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic159$ = SubLObjectFactory.makeString("Allow transformation at all");
        $ic160$ = SubLObjectFactory.makeString("Even stronger than setting the inference resource constraints to allow transformation,\nthis precludes any followup inference from ever allowing transformation.");
        $ic161$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.T, (SubLObject)SubLObjectFactory.makeString("Yes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)module0683.NIL, (SubLObject)SubLObjectFactory.makeString("No (faster)")));
        $ic162$ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic163$ = SubLObjectFactory.makeString("Add restriction layer of indirection");
        $ic164$ = SubLObjectFactory.makeString("When solving an open problem, the Worker can either add a removal link straight from the open problem\nto goal, or it can add the restricted form of that problem (which will be closed), and then add the\nremoval link from the restricted problem to goal.  This maximizes problem reuse but increases the\noverhead of the Worker.");
        $ic165$ = SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?");
        $ic166$ = SubLObjectFactory.makeString("Enable negation by failure");
        $ic167$ = SubLObjectFactory.makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");
        $ic168$ = SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic169$ = SubLObjectFactory.makeString("Enable use of completeness meta-knowledge");
        $ic170$ = SubLObjectFactory.makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");
        $ic171$ = SubLObjectFactory.makeKeyword("DIRECTION");
        $ic172$ = SubLObjectFactory.makeString("Inference Direction");
        $ic173$ = SubLObjectFactory.makeString("This controls whether inferences in this problem store are treated as backward inferences (the default) or forward inferences.");
        $ic174$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD"), (SubLObject)SubLObjectFactory.makeString("Backward")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeString("Forward")));
        $ic175$ = SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $ic176$ = SubLObjectFactory.makeString("Enable evaluation of SubL performatives");
        $ic177$ = SubLObjectFactory.makeString("This controls whether or not we allow the SubL performatives (which may cause side effects) to be evaluated during inference.  #$performSubL and #$EvaluateSubLFn are the entry points into SubL from CycL");
        $ic178$ = SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?");
        $ic179$ = SubLObjectFactory.makeString("Enable sidechaining");
        $ic180$ = SubLObjectFactory.makeString("This controls whether or not we allow the use of sidechaining to rewrite problems into other problems.  Sidechaining is designed to be more focused than backchaining, will not increase the complexity of the current problem, and does not require a transformation step (i.e. a backchain).");
        $ic181$ = SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?");
        $ic182$ = SubLObjectFactory.makeString("Enable abduction");
        $ic183$ = SubLObjectFactory.makeString("This controls whether or not we allow abductive solutions for problems in this problem store.");
        $ic184$ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $ic185$ = SubLObjectFactory.makeString("Introduce new terms");
        $ic186$ = SubLObjectFactory.makeString("This controls whether or not we allow the introduction of new terms during inference.  If this is set to no, we assume that the set of reified and unrepresented terms comprises the entire universe of discourse.");
        $ic187$ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic188$ = SubLObjectFactory.makeString("Compute Answer Justifications");
        $ic189$ = SubLObjectFactory.makeString("This controls whether or not we compute and remember the justifications for answers during inference.  If this is set to no, we only compute and remember bindings for free variables.");
        $ic190$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic191$ = SubLObjectFactory.makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic192$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic193$ = SubLObjectFactory.makeString("CB QUERY");
        $ic194$ = SubLObjectFactory.makeString("CB Query");
        $ic195$ = SubLObjectFactory.makeSymbol("S#45721", "CYC");
        $ic196$ = SubLObjectFactory.makeString("CYC");
        $ic197$ = SubLObjectFactory.makeSymbol("S#8003", "CYC");
        $ic198$ = SubLObjectFactory.makeSymbol("S#45884", "CYC");
        $ic199$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25426", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic200$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic201$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45722", "CYC")));
        $ic202$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic203$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45914", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45915", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic204$ = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $ic205$ = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $ic206$ = SubLObjectFactory.makeSymbol("&REST");
        $ic207$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45722", "CYC"));
        $ic208$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45914", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#45915", "CYC"));
        $ic209$ = SubLObjectFactory.makeSymbol("S#27365", "CYC");
        $ic210$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic211$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic212$ = SubLObjectFactory.makeInteger(1000);
        $ic213$ = SubLObjectFactory.makeSymbol("CB-QUERY");
        $ic214$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic215$ = SubLObjectFactory.makeString("query-tool.gif");
        $ic216$ = SubLObjectFactory.makeString("Query");
        $ic217$ = SubLObjectFactory.makeString("cb-query");
        $ic218$ = SubLObjectFactory.makeKeyword("TOP");
        $ic219$ = SubLObjectFactory.makeSymbol("S#45734", "CYC");
        $ic220$ = SubLObjectFactory.makeString("Ask a Query");
        $ic221$ = SubLObjectFactory.makeKeyword("TITLE");
        $ic222$ = SubLObjectFactory.makeString("Query Tool");
        $ic223$ = SubLObjectFactory.makeKeyword("REFRESH");
        $ic224$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic225$ = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $ic226$ = SubLObjectFactory.makeKeyword("MT");
        $ic227$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic228$ = SubLObjectFactory.makeKeyword("QUERY-SPEC");
        $ic229$ = SubLObjectFactory.makeKeyword("TEST-SPEC");
        $ic230$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic231$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic232$ = SubLObjectFactory.makeString("stylesheet");
        $ic233$ = SubLObjectFactory.makeString("text/css");
        $ic234$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic235$ = SubLObjectFactory.makeString("post");
        $ic236$ = SubLObjectFactory.makeString("cb-handle-query");
        $ic237$ = SubLObjectFactory.makeString(":");
        $ic238$ = SubLObjectFactory.makeString("CycServer");
        $ic239$ = SubLObjectFactory.makeString("/cyc-ws/cycedit/cyceditor/cyceditor.nocache.js");
        $ic240$ = SubLObjectFactory.makeString("javascript");
        $ic241$ = SubLObjectFactory.makeString("text/javascript");
        $ic242$ = SubLObjectFactory.makeString("/cyc-ws/cycedit/CycEditor.css");
        $ic243$ = SubLObjectFactory.makeKeyword("CB-QUERY");
        $ic244$ = SubLObjectFactory.makeString("cb-query.html");
        $ic245$ = SubLObjectFactory.makeString("Go to section :");
        $ic246$ = SubLObjectFactory.makeString("Shortcut links to sections that appear further down on this page.");
        $ic247$ = SubLObjectFactory.makeString("focal-inference-section");
        $ic248$ = SubLObjectFactory.makeString("[Focal Inference]");
        $ic249$ = SubLObjectFactory.makeString("The inference you are currently examining.  Usually the most recent query asked.");
        $ic250$ = SubLObjectFactory.makeString("new-inference-section");
        $ic251$ = SubLObjectFactory.makeString("[New Inference]");
        $ic252$ = SubLObjectFactory.makeString("Start a new inference.");
        $ic253$ = SubLObjectFactory.makeString("parameters-section");
        $ic254$ = SubLObjectFactory.makeString("[Inference Parameters]");
        $ic255$ = SubLObjectFactory.makeString("Adjust the inference parameters and resource constraints that will be used for starting a new inference or continuing the focal inference.");
        $ic256$ = SubLObjectFactory.makeString("proof-checker-section");
        $ic257$ = SubLObjectFactory.makeString("[Proof Checker Setup]");
        $ic258$ = SubLObjectFactory.makeString("Specify an exact set of rules, and constrain the inference engine to only use those rules.");
        $ic259$ = SubLObjectFactory.makeString("other-inferences");
        $ic260$ = SubLObjectFactory.makeString("Show");
        $ic261$ = SubLObjectFactory.makeString("Hide");
        $ic262$ = SubLObjectFactory.makeString("Other Inferences");
        $ic263$ = SubLObjectFactory.makeString("Examine, continue, or destroy past inferences you have asked.");
        $ic264$ = SubLObjectFactory.makeString("(~A total)");
        $ic265$ = SubLObjectFactory.makeKeyword("INVISIBLE");
        $ic266$ = SubLObjectFactory.makeKeyword("VISIBLE");
        $ic267$ = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $ic268$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic269$ = SubLObjectFactory.makeString("Actions");
        $ic270$ = SubLObjectFactory.makeKeyword("DESTROY-ALL-OTHER-INFERENCES");
        $ic271$ = SubLObjectFactory.makeString("[Destroy All]");
        $ic272$ = SubLObjectFactory.makeKeyword("FOCUS-INFERENCE");
        $ic273$ = SubLObjectFactory.makeString("[Focus]");
        $ic274$ = SubLObjectFactory.makeKeyword("DESTROY-INFERENCE");
        $ic275$ = SubLObjectFactory.makeString("[Destroy]");
        $ic276$ = SubLObjectFactory.makeString("Status");
        $ic277$ = SubLObjectFactory.makeString("Answers");
        $ic278$ = SubLObjectFactory.makeString("focal-problem-store");
        $ic279$ = SubLObjectFactory.makeString("focal-inference");
        $ic280$ = SubLObjectFactory.makeString("Focal Inference");
        $ic281$ = SubLObjectFactory.makeString("Actions :");
        $ic282$ = SubLObjectFactory.makeKeyword("DEFOCUS-INFERENCE");
        $ic283$ = SubLObjectFactory.makeString("[Defocus]");
        $ic284$ = SubLObjectFactory.makeKeyword("TEMPLATE-OE-INFERENCE");
        $ic285$ = SubLObjectFactory.makeString("[Template OE]");
        $ic286$ = SubLObjectFactory.makeKeyword("CB-OWL-EXPORT-INFERENCE-ANSWERS");
        $ic287$ = SubLObjectFactory.makeString("[OWL Export]");
        $ic288$ = SubLObjectFactory.makeKeyword("KBQ-SAVE");
        $ic289$ = SubLObjectFactory.makeString("[Save As Query]");
        $ic290$ = SubLObjectFactory.makeKeyword("KCT-SAVE");
        $ic291$ = SubLObjectFactory.makeString("[Save As Test]");
        $ic292$ = SubLObjectFactory.makeString("Asking query: ");
        $ic293$ = SubLObjectFactory.makeString("new-inference");
        $ic294$ = SubLObjectFactory.makeString("New Inference");
        $ic295$ = SubLObjectFactory.makeKeyword("RUNNING");
        $ic296$ = SubLObjectFactory.makeString("Reset All Fields");
        $ic297$ = SubLObjectFactory.makeString("Start as a Followup to Focal");
        $ic298$ = SubLObjectFactory.makeString("Starts a new inference as a followup query to the focal inference.\nThis means that this inference will reuse the problem store used by the focal inference,\nso it will not have to reprove problems already proven by the focal inference.");
        $ic299$ = SubLObjectFactory.makeString("sharing_a_problem_store");
        $ic300$ = SubLObjectFactory.makeString("followup");
        $ic301$ = SubLObjectFactory.makeString("Start as New");
        $ic302$ = SubLObjectFactory.makeString("Starts a new inference with a fresh problem store (the default).");
        $ic303$ = SubLObjectFactory.makeString("new");
        $ic304$ = SubLObjectFactory.makeString("Start Inference");
        $ic305$ = SubLObjectFactory.makeString("query-spec");
        $ic306$ = SubLObjectFactory.makeString("test-spec");
        $ic307$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $ic308$ = SubLObjectFactory.makeSymbol("S#45886", "CYC");
        $ic309$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $ic310$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now"))));
        $ic311$ = SubLObjectFactory.makeSymbol("S#45887", "CYC");
        $ic312$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic313$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC")));
        $ic314$ = SubLObjectFactory.makeString("mt-section");
        $ic315$ = SubLObjectFactory.makeString("cb-query-inference-mt");
        $ic316$ = SubLObjectFactory.makeString("Query Context");
        $ic317$ = SubLObjectFactory.makeKeyword("MONAD-CHOICES");
        $ic318$ = SubLObjectFactory.makeString("sentence-section");
        $ic319$ = SubLObjectFactory.makeInteger(80);
        $ic320$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic321$ = SubLObjectFactory.makeString("sentence");
        $ic322$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic323$ = SubLObjectFactory.makeKeyword("HEIGHT");
        $ic324$ = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $ic325$ = SubLObjectFactory.makeString("Complete");
        $ic326$ = SubLObjectFactory.makeKeyword("CYCLIFY-LABEL");
        $ic327$ = SubLObjectFactory.makeString("Cyclify");
        $ic328$ = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $ic329$ = SubLObjectFactory.makeString("Clear Sentence");
        $ic330$ = SubLObjectFactory.makeKeyword("MODE");
        $ic331$ = SubLObjectFactory.makeString("editor_");
        $ic332$ = SubLObjectFactory.makeString("CycEditor");
        $ic333$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#3E2AE39"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1069245"));
        $ic334$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString(" name="), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $ic335$ = SubLObjectFactory.makeString(" cols=");
        $ic336$ = SubLObjectFactory.makeString(" rows=");
        $ic337$ = SubLObjectFactory.makeString("non-explanatory");
        $ic338$ = SubLObjectFactory.makeString("Pragmatics");
        $ic339$ = SubLObjectFactory.makeString("An optional sentence that will further constrain the query for pragmatic reasons.  Justifications for answers will not include this sentence.");
        $ic340$ = SubLObjectFactory.makeString("non_exp_sentence");
        $ic341$ = SubLObjectFactory.makeSymbol("S#45889", "CYC");
        $ic342$ = SubLObjectFactory.makeString("inference-parameters");
        $ic343$ = SubLObjectFactory.makeString("Inference Parameters");
        $ic344$ = SubLObjectFactory.makeString("The inference parameters and resource constraints that will be used when starting a new inference or continuing the focal inference.");
        $ic345$ = SubLObjectFactory.makeString("Continue the Focal Inference");
        $ic346$ = SubLObjectFactory.makeString("Continues running the focal inference for a while longer, with more resources if the inference parameters have changed since the last time it was run.");
        $ic347$ = SubLObjectFactory.makeString("continue");
        $ic348$ = SubLObjectFactory.makeString("Save Parameters");
        $ic349$ = SubLObjectFactory.makeString("Saves the current inference parameters as default for the user");
        $ic350$ = SubLObjectFactory.makeString("save-parameters");
        $ic351$ = SubLObjectFactory.makeString("Load Parameters");
        $ic352$ = SubLObjectFactory.makeString("Loads user saved default inference parameters");
        $ic353$ = SubLObjectFactory.makeString("load-parameters");
        $ic354$ = SubLObjectFactory.makeString("Reset Parameters");
        $ic355$ = SubLObjectFactory.makeString("Resets all the inference parameters to tool default.  If focal inference is available then inference parameters are set to that of focal inference.");
        $ic356$ = SubLObjectFactory.makeString("reset-parameters");
        $ic357$ = SubLObjectFactory.makeString("Strengthen Parameters");
        $ic358$ = SubLObjectFactory.makeString("Sets the inference parameters to the strongest values that should still admit all the current answers of the focal inference.");
        $ic359$ = SubLObjectFactory.makeString("strengthen-parameters");
        $ic360$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0683.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.FOUR_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-STEP"), (SubLObject)module0683.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.FOUR_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOW")));
        $ic361$ = SubLObjectFactory.makeString("Inference Resource Constraints");
        $ic362$ = SubLObjectFactory.makeString("Properties that can change while an inference is suspended, and be respected when that same inference is continued.");
        $ic363$ = SubLObjectFactory.makeString("advanced-parameters");
        $ic364$ = SubLObjectFactory.makeString("Inference Debugging Parameters");
        $ic365$ = SubLObjectFactory.makeString("The advanced inference parameters that can be manipulated for debugging inference.  These are used when starting a new inference or continuing the focal inference.");
        $ic366$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY") });
        $ic367$ = SubLObjectFactory.makeSymbol("S#45760", "CYC");
        $ic368$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic369$ = SubLObjectFactory.makeString("Inference Engine Mode Properties");
        $ic370$ = SubLObjectFactory.makeString("Properties determined by the choice of inference engine mode, unless Debug is chosen.");
        $ic371$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)module0683.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.TWO_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-RULE-UTILITY"), (SubLObject)SubLObjectFactory.makeInteger(-20), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.THREE_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.THREE_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD-MAX-TIME"), (SubLObject)module0683.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.FOUR_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLOCK?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH"), (SubLObject)module0683.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.TWO_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CACHE-INFERENCE-RESULTS?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)module0683.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("METRICS"), (SubLObject)module0683.NIL) });
        $ic372$ = SubLObjectFactory.makeString("Inference Dynamic Properties");
        $ic373$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), (SubLObject)module0683.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), (SubLObject)SubLObjectFactory.makeKeyword("BINDINGS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), (SubLObject)SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.TWENTY_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSITIVE-CLOSURE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")) });
        $ic374$ = SubLObjectFactory.makeString("Inference Static Properties");
        $ic375$ = SubLObjectFactory.makeString("Properties that can vary between different inferences (which may be sharing the same problem store),\nbut which must remain consistent throughout the life of a given inference.");
        $ic376$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.SEVEN_INTEGER));
        $ic377$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEGATION-BY-FAILURE?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), (SubLObject)module0683.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EQUALITY-REASONING-METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("CZER-EQUAL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EQUALITY-REASONING-DOMAIN"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-PROBLEM-COUNT"), (SubLObject)SubLObjectFactory.makeInteger(100000), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.SIX_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)module0683.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), (SubLObject)module0683.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EVALUATE-SUBL-ALLOWED?"), (SubLObject)module0683.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABDUCTION-ALLOWED?"), (SubLObject)module0683.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)module0683.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), (SubLObject)module0683.T) });
        $ic378$ = SubLObjectFactory.makeString("Problem Store Static Properties");
        $ic379$ = SubLObjectFactory.makeString("Properties of a problem store that cannot change.  These properties affect all inferences using that problem store.");
        $ic380$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45917", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#45918", "CYC"));
        $ic381$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45916", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45917", "CYC"));
        $ic382$ = SubLObjectFactory.makeKeyword("NO-MODE-VALUE-SPECIFIED");
        $ic383$ = SubLObjectFactory.makeKeyword("YELLOW");
        $ic384$ = SubLObjectFactory.makeString("*");
        $ic385$ = SubLObjectFactory.makeString("This parameter has been modified.");
        $ic386$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)module0683.NIL);
        $ic387$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"));
        $ic388$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic389$ = SubLObjectFactory.makeString("onClick=\"");
        $ic390$ = SubLObjectFactory.makeString("\"");
        $ic391$ = SubLObjectFactory.makeString("set_all_radio_buttons(document.forms[0], '~a', ~a);");
        $ic392$ = SubLObjectFactory.makeString("with (this.form.elements['~A']){value = '~A';};");
        $ic393$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#45919", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic394$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45920", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45921", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45922", "CYC"));
        $ic395$ = SubLObjectFactory.makeString("No setting for ~s matched the value ~s");
        $ic396$ = SubLObjectFactory.makeKeyword("DEFAULT-UNSPECIFIED");
        $ic397$ = SubLObjectFactory.makeString("Unexpected inference parameter setting type ~s");
        $ic398$ = SubLObjectFactory.makeString("|");
        $ic399$ = SubLObjectFactory.makeString(".");
        $ic400$ = SubLObjectFactory.makeString("?");
        $ic401$ = SubLObjectFactory.makeString("onClick=\"with (this.form.elements['~A']){focus();}; set_all_radio_buttons(document.forms[0], '~a', ~a); \"");
        $ic402$ = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $ic403$ = SubLObjectFactory.makeKeyword("FORBIDDEN-RULES");
        $ic404$ = SubLObjectFactory.makeKeyword("ALL");
        $ic405$ = SubLObjectFactory.makeKeyword("NONE");
        $ic406$ = SubLObjectFactory.makeString("proof-checker");
        $ic407$ = SubLObjectFactory.makeString("Proof Checker Setup");
        $ic408$ = SubLObjectFactory.makeString("Specify an exact set of rules allowed to be used in inference.");
        $ic409$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic410$ = SubLObjectFactory.makeString("#FFDFDF");
        $ic411$ = SubLObjectFactory.makeString("Forbidden");
        $ic412$ = SubLObjectFactory.makeString("Forbid the use of this rule in inference");
        $ic413$ = SubLObjectFactory.makeString("[Forbid All]");
        $ic414$ = SubLObjectFactory.makeString("this.document.forms[0]");
        $ic415$ = SubLObjectFactory.makeString("^rule_.*");
        $ic416$ = SubLObjectFactory.makeString("forbidden");
        $ic417$ = SubLObjectFactory.makeString("#FFFFDF");
        $ic418$ = SubLObjectFactory.makeString("Unused");
        $ic419$ = SubLObjectFactory.makeString("Neither forbid nor allow; treat like any other rule in the KB.");
        $ic420$ = SubLObjectFactory.makeString("[Unuse All]");
        $ic421$ = SubLObjectFactory.makeString("unused");
        $ic422$ = SubLObjectFactory.makeKeyword("QUERY-PROOF-CHECKER-DROP-ALL");
        $ic423$ = SubLObjectFactory.makeString("[Drop All]");
        $ic424$ = SubLObjectFactory.makeString("#DFFFDF");
        $ic425$ = SubLObjectFactory.makeString("Allowed");
        $ic426$ = SubLObjectFactory.makeString("Allow the use of this rule in inference, but forbid the use of all \n                  other rules except those which are explicitly allowed.");
        $ic427$ = SubLObjectFactory.makeString("[Allow All]");
        $ic428$ = SubLObjectFactory.makeString("allowed");
        $ic429$ = SubLObjectFactory.makeString("#FFFFFF");
        $ic430$ = SubLObjectFactory.makeString("Proof Checker Rules");
        $ic431$ = SubLObjectFactory.makeKeyword("FORBIDDEN");
        $ic432$ = SubLObjectFactory.makeKeyword("UNUSED");
        $ic433$ = SubLObjectFactory.makeKeyword("QUERY-PROOF-CHECKER-DROP");
        $ic434$ = SubLObjectFactory.makeString("[Drop]");
        $ic435$ = SubLObjectFactory.makeKeyword("ALLOWED");
        $ic436$ = SubLObjectFactory.makeString("rule_");
        $ic437$ = SubLObjectFactory.makeString("Properties which must remain consistent throughout the life of a given problem store.");
        $ic438$ = SubLObjectFactory.makeString("Other Problem Store Properties");
        $ic439$ = SubLObjectFactory.makeString("Destruction Imminent? ");
        $ic440$ = SubLObjectFactory.makeString("Memoization state : ");
        $ic441$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-MEMOIZATION-STATE");
        $ic442$ = SubLObjectFactory.makeString("Janitor : ");
        $ic443$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE-JANITOR");
        $ic444$ = SubLObjectFactory.makeKeyword("RECOMPUTE-DESTRUCTIBLES");
        $ic445$ = SubLObjectFactory.makeKeyword("REMOVE-DESTRUCTIBLES");
        $ic446$ = SubLObjectFactory.makeString("~a does not specify an assertion");
        $ic447$ = SubLObjectFactory.makeString("Assertion specified was not a rule");
        $ic448$ = SubLObjectFactory.makeSymbol("CB-QUERY-PROOF-CHECKER-DROP");
        $ic449$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic450$ = SubLObjectFactory.makeString("No longer consider this rule as being either forbidden or allowed.");
        $ic451$ = SubLObjectFactory.makeString("cb-query-proof-checker-drop&~A");
        $ic452$ = SubLObjectFactory.makeSymbol("S#45796", "CYC");
        $ic453$ = SubLObjectFactory.makeSymbol("CB-QUERY-PROOF-CHECKER-DROP-ALL");
        $ic454$ = SubLObjectFactory.makeString("No longer consider any of these rules as being either forbidden or allowed.");
        $ic455$ = SubLObjectFactory.makeString("cb-query-proof-checker-drop-all");
        $ic456$ = SubLObjectFactory.makeSymbol("S#45797", "CYC");
        $ic457$ = SubLObjectFactory.makeKeyword("CONTINUE");
        $ic458$ = SubLObjectFactory.makeKeyword("FOLLOWUP");
        $ic459$ = SubLObjectFactory.makeKeyword("NEW");
        $ic460$ = SubLObjectFactory.makeKeyword("SAVE-PARAMETERS");
        $ic461$ = SubLObjectFactory.makeKeyword("LOAD-PARAMETERS");
        $ic462$ = SubLObjectFactory.makeKeyword("RESET-PARAMETERS");
        $ic463$ = SubLObjectFactory.makeKeyword("STRENGTHEN-PARAMETERS");
        $ic464$ = SubLObjectFactory.makeString("Unknown inference method (how did this happen?)");
        $ic465$ = SubLObjectFactory.makeString("~A");
        $ic466$ = SubLObjectFactory.makeString("That inference is no longer continuable.");
        $ic467$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPERTIES"), (SubLObject)module0683.NIL);
        $ic468$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $ic469$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCATION"), (SubLObject)SubLObjectFactory.makeString("New Inference"));
        $ic470$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("non_exp_sentence"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED?"), (SubLObject)module0683.NIL);
        $ic471$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCATION"), (SubLObject)SubLObjectFactory.makeString("Pragmatics"));
        $ic472$ = SubLObjectFactory.makeSymbol("CB-HANDLE-QUERY");
        $ic473$ = SubLObjectFactory.makeKeyword("SILK");
        $ic474$ = SubLObjectFactory.makeSymbol("?TRUTH");
        $ic475$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("sentenceTruth"));
        $ic476$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic477$ = SubLObjectFactory.makeString(" is not an inference parameter.");
        $ic478$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("S#724", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#43330", "CYC"));
        $ic479$ = SubLObjectFactory.makeString("No value was entered for '");
        $ic480$ = SubLObjectFactory.makeString("'.");
        $ic481$ = SubLObjectFactory.makeString("The value entered for '");
        $ic482$ = SubLObjectFactory.makeString("' was not valid.");
        $ic483$ = SubLObjectFactory.makeString("No choice was made for '");
        $ic484$ = SubLObjectFactory.makeString("The ID, ");
        $ic485$ = SubLObjectFactory.makeString(", does not denote a CycLQuerySpecification.");
        $ic486$ = SubLObjectFactory.makeString("The query spec ID, ");
        $ic487$ = SubLObjectFactory.makeString(", does not denote a FORT.");
        $ic488$ = SubLObjectFactory.makeString(", does not denote a KBContentTest-FullySpecified.");
        $ic489$ = SubLObjectFactory.makeString("The test spec ID, ");
        $ic490$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic491$ = SubLObjectFactory.makeString("Socratic Query");
        $ic492$ = SubLObjectFactory.makeString("Similar Query");
        $ic493$ = SubLObjectFactory.makeString("[Query Similar]");
        $ic494$ = SubLObjectFactory.makeString("cb-assertion-similar-query&~A");
        $ic495$ = SubLObjectFactory.makeKeyword("ASSERTION-SIMILAR-QUERY");
        $ic496$ = SubLObjectFactory.makeSymbol("S#45808", "CYC");
        $ic497$ = SubLObjectFactory.makeString("The assertion is not available.");
        $ic498$ = SubLObjectFactory.makeSymbol("CB-ASSERTION-SIMILAR-QUERY");
        $ic499$ = SubLObjectFactory.makeString("Antecedent Query");
        $ic500$ = SubLObjectFactory.makeKeyword("CUSTOM");
        $ic501$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic502$ = SubLObjectFactory.makeKeyword("PROOF");
        $ic503$ = SubLObjectFactory.makeString("[Antecedent Query]");
        $ic504$ = SubLObjectFactory.makeString("cb-assertion-antecedent-query&~A");
        $ic505$ = SubLObjectFactory.makeKeyword("ANTECEDENT-QUERY");
        $ic506$ = SubLObjectFactory.makeSymbol("S#45810", "CYC");
        $ic507$ = SubLObjectFactory.makeSymbol("CB-ASSERTION-ANTECEDENT-QUERY");
        $ic508$ = SubLObjectFactory.makeString("Known Extent Query");
        $ic509$ = SubLObjectFactory.makeString("[Known Extent Query]");
        $ic510$ = SubLObjectFactory.makeSymbol("S#12732", "CYC");
        $ic511$ = SubLObjectFactory.makeString("cb-rule-known-extent-query&~A");
        $ic512$ = SubLObjectFactory.makeKeyword("RULE-KNOWN-EXTENT-QUERY");
        $ic513$ = SubLObjectFactory.makeSymbol("S#45812", "CYC");
        $ic514$ = SubLObjectFactory.makeString("The rule is not available.");
        $ic515$ = SubLObjectFactory.makeSymbol("CB-RULE-KNOWN-EXTENT-QUERY");
        $ic516$ = SubLObjectFactory.makeString("Unknown Extent Query");
        $ic517$ = SubLObjectFactory.makeString("[Unknown Extent Query]");
        $ic518$ = SubLObjectFactory.makeString("cb-rule-unknown-extent-query&~A");
        $ic519$ = SubLObjectFactory.makeKeyword("RULE-UNKNOWN-EXTENT-QUERY");
        $ic520$ = SubLObjectFactory.makeSymbol("S#45814", "CYC");
        $ic521$ = SubLObjectFactory.makeSymbol("CB-RULE-UNKNOWN-EXTENT-QUERY");
        $ic522$ = SubLObjectFactory.makeString("KB Query");
        $ic523$ = SubLObjectFactory.makeString("Parameter Strengthened Query");
        $ic524$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic525$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44996", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#44449", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13108", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#13109", "CYC"));
        $ic526$ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $ic527$ = SubLObjectFactory.makeString("Could not determine an arg from ~a");
        $ic528$ = SubLObjectFactory.makeSymbol("CB-LITERAL-QUERY");
        $ic529$ = SubLObjectFactory.makeSymbol("CB-LQ");
        $ic530$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARG0"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG3"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG4"), (SubLObject)SubLObjectFactory.makeSymbol("?ARG5"));
        $ic531$ = SubLObjectFactory.makeKeyword("CB-LITERAL-QUERY");
        $ic532$ = SubLObjectFactory.makeString("cb-literal-query.html");
        $ic533$ = SubLObjectFactory.makeString("Literal Query");
        $ic534$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic535$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic536$ = SubLObjectFactory.makeString("button");
        $ic537$ = SubLObjectFactory.makeString("reload");
        $ic538$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic539$ = SubLObjectFactory.makeKeyword("SENTENCE-QUERY-SIMILAR");
        $ic540$ = SubLObjectFactory.makeString("[Query Tool]");
        $ic541$ = SubLObjectFactory.makeString("Last query");
        $ic542$ = SubLObjectFactory.makeKeyword("EXHAUST");
        $ic543$ = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $ic544$ = SubLObjectFactory.makeString("Query halted because : ");
        $ic545$ = SubLObjectFactory.makeString("No answers were proven");
        $ic546$ = SubLObjectFactory.makeString("One answer");
        $ic547$ = SubLObjectFactory.makeString("~S answers");
        $ic548$ = SubLObjectFactory.makeString(" for ~S :");
        $ic549$ = SubLObjectFactory.makeString("Substituted Results :");
        $ic550$ = SubLObjectFactory.makeString("Could not determine the arity of ~A in ~A");
        $ic551$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic552$ = SubLObjectFactory.makeKeyword("HL");
        $ic553$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic554$ = SubLObjectFactory.makeKeyword("POSITIVE-INFINITY");
        $ic555$ = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $ic556$ = SubLObjectFactory.makeInteger(64);
        $ic557$ = SubLObjectFactory.makeSymbol("S#18496", "CYC");
        $ic558$ = SubLObjectFactory.makeString("Simulated query over all mts :");
        $ic559$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic560$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARG2"));
        $ic561$ = SubLObjectFactory.makeString("Answers in ");
        $ic562$ = SubLObjectFactory.makeString(" (inherits from");
        $ic563$ = SubLObjectFactory.makeString(" ");
        $ic564$ = SubLObjectFactory.makeString(")");
        $ic565$ = SubLObjectFactory.makeString("( ");
        $ic566$ = SubLObjectFactory.makeSymbol("S#17515", "CYC");
        $ic567$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic568$ = ConsesLow.list((SubLObject)module0683.ONE_INTEGER, (SubLObject)module0683.TWO_INTEGER);
        $ic569$ = SubLObjectFactory.makeKeyword("LIKELY");
        $ic570$ = SubLObjectFactory.makeKeyword("POSSIBLE");
        $ic571$ = SubLObjectFactory.makeKeyword("INDEX-DISPLAY");
        $ic572$ = SubLObjectFactory.makeKeyword("NORMAL");
        $ic573$ = SubLObjectFactory.makeKeyword("KNOWN");
        $ic574$ = SubLObjectFactory.makeKeyword("POS");
        $ic575$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic576$ = SubLObjectFactory.makeString("Current query");
        $ic577$ = SubLObjectFactory.makeString(" in ");
        $ic578$ = SubLObjectFactory.makeString(" :");
        $ic579$ = SubLObjectFactory.makeInteger(330);
        $ic580$ = SubLObjectFactory.makeString("cb-inference-progress-page&~A&~A");
        $ic581$ = SubLObjectFactory.makeString("inference_progress");
        $ic582$ = SubLObjectFactory.makeString("100%");
        $ic583$ = SubLObjectFactory.makeKeyword("ON");
        $ic584$ = SubLObjectFactory.makeKeyword("OFF");
        $ic585$ = SubLObjectFactory.makeString("Inference ~A in problem store ~A is no longer available.");
        $ic586$ = SubLObjectFactory.makeString("Inference ~A.~A Progress");
        $ic587$ = SubLObjectFactory.makeKeyword("DISABLED");
        $ic588$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-PROGRESS-PAGE");
        $ic589$ = SubLObjectFactory.makeString("[Refresh Page]");
        $ic590$ = SubLObjectFactory.makeString("Status :");
        $ic591$ = SubLObjectFactory.makeString("[Halt Auto Refresh]");
        $ic592$ = SubLObjectFactory.makeString("[Refresh]");
        $ic593$ = SubLObjectFactory.makeKeyword("AUTO-REFRESH-QUERY");
        $ic594$ = SubLObjectFactory.makeString("[Auto Refresh]");
        $ic595$ = SubLObjectFactory.makeKeyword("INTERRUPT-INFERENCE");
        $ic596$ = SubLObjectFactory.makeString("[Interrupt]");
        $ic597$ = SubLObjectFactory.makeKeyword("ABORT-INFERENCE");
        $ic598$ = SubLObjectFactory.makeString("[Abort]");
        $ic599$ = SubLObjectFactory.makeString("Max time remaining: ");
        $ic600$ = SubLObjectFactory.makeString("Time over budget: ");
        $ic601$ = SubLObjectFactory.makeKeyword("RED");
        $ic602$ = SubLObjectFactory.makeString("inference-answers");
        $ic603$ = SubLObjectFactory.makeString("(");
        $ic604$ = SubLObjectFactory.makeKeyword("ALL-INFERENCE-ANSWERS");
        $ic605$ = SubLObjectFactory.makeString("[All Answers]");
        $ic606$ = SubLObjectFactory.makeKeyword("SAVE-INFERENCE-ANSWERS");
        $ic607$ = SubLObjectFactory.makeKeyword("GRAPH-INFERENCE-ANSWERS");
        $ic608$ = SubLObjectFactory.makeKeyword("SAVE-INFERENCE-ANSWERS-AS-QUERIES");
        $ic609$ = SubLObjectFactory.makeString("[Save Answers as Queries]");
        $ic610$ = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-TIMELINE");
        $ic611$ = SubLObjectFactory.makeString("[Timeline]");
        $ic612$ = SubLObjectFactory.makeSymbol("CB-AUTO-REFRESH-QUERY");
        $ic613$ = SubLObjectFactory.makeString("Starts up an auto-refresh loop that will automatically refresh\nthis page every few seconds, showing new inference answers (if any).");
        $ic614$ = SubLObjectFactory.makeString("cb-auto-refresh-query&~A&~A");
        $ic615$ = SubLObjectFactory.makeSymbol("S#45826", "CYC");
        $ic616$ = SubLObjectFactory.makeString("[More ...]");
        $ic617$ = SubLObjectFactory.makeString("cb-all-inference-answers&~A&~A");
        $ic618$ = SubLObjectFactory.makeSymbol("S#45828", "CYC");
        $ic619$ = SubLObjectFactory.makeString("Inference ~A.~A");
        $ic620$ = SubLObjectFactory.makeSymbol("CB-ALL-INFERENCE-ANSWERS");
        $ic621$ = SubLObjectFactory.makeString("Inference Answers");
        $ic622$ = SubLObjectFactory.makeSymbol("CB-FOCUS-INFERENCE");
        $ic623$ = SubLObjectFactory.makeString("Make this inference the focal inference,\nso that it can be examined in more detail.");
        $ic624$ = SubLObjectFactory.makeString("cb-focus-inference&~A&~A");
        $ic625$ = SubLObjectFactory.makeSymbol("S#45830", "CYC");
        $ic626$ = SubLObjectFactory.makeSymbol("CB-DEFOCUS-INFERENCE");
        $ic627$ = SubLObjectFactory.makeString("Make this inference no longer the focal inference,\nand demote it into the 'Other Inferences' section.");
        $ic628$ = SubLObjectFactory.makeString("cb-defocus-inference&~A&~A");
        $ic629$ = SubLObjectFactory.makeSymbol("S#45831", "CYC");
        $ic630$ = SubLObjectFactory.makeSymbol("CB-INTERRUPT-INFERENCE");
        $ic631$ = SubLObjectFactory.makeString("cb-interrupt-inference&~A&~A");
        $ic632$ = SubLObjectFactory.makeSymbol("S#45832", "CYC");
        $ic633$ = SubLObjectFactory.makeSymbol("CB-ABORT-INFERENCE");
        $ic634$ = SubLObjectFactory.makeString("cb-abort-inference&~A&~A");
        $ic635$ = SubLObjectFactory.makeSymbol("S#45833", "CYC");
        $ic636$ = SubLObjectFactory.makeSymbol("CB-FORGET-INFERENCE");
        $ic637$ = SubLObjectFactory.makeString("[Forget]");
        $ic638$ = SubLObjectFactory.makeString("cb-forget-inference&~A&~A");
        $ic639$ = SubLObjectFactory.makeKeyword("FORGET-INFERENCE");
        $ic640$ = SubLObjectFactory.makeSymbol("S#45834", "CYC");
        $ic641$ = SubLObjectFactory.makeSymbol("CB-FORGET-ALL-INFERENCES");
        $ic642$ = SubLObjectFactory.makeString("[Forget All]");
        $ic643$ = SubLObjectFactory.makeString("cb-forget-all-inferences");
        $ic644$ = SubLObjectFactory.makeKeyword("FORGET-ALL-INFERENCES");
        $ic645$ = SubLObjectFactory.makeSymbol("S#45835", "CYC");
        $ic646$ = SubLObjectFactory.makeSymbol("CB-FORGET-ALL-OTHER-INFERENCES");
        $ic647$ = SubLObjectFactory.makeString("cb-forget-all-other-inferences");
        $ic648$ = SubLObjectFactory.makeKeyword("FORGET-ALL-OTHER-INFERENCES");
        $ic649$ = SubLObjectFactory.makeSymbol("S#45836", "CYC");
        $ic650$ = SubLObjectFactory.makeString("Inference heuristics are being reinforced.");
        $ic651$ = SubLObjectFactory.makeInteger(2000);
        $ic652$ = SubLObjectFactory.makeSymbol("CB-REINFORCE-INFERENCE");
        $ic653$ = SubLObjectFactory.makeString("[Reinforce]");
        $ic654$ = SubLObjectFactory.makeString("Reinforce the inference heuristics based on this inference,\nso as to help answer similar inferences in the future.");
        $ic655$ = SubLObjectFactory.makeString("cb-reinforce-inference&~A&~A");
        $ic656$ = SubLObjectFactory.makeKeyword("REINFORCE-INFERENCE");
        $ic657$ = SubLObjectFactory.makeSymbol("S#45837", "CYC");
        $ic658$ = SubLObjectFactory.makeSymbol("CB-DESTROY-INFERENCE");
        $ic659$ = SubLObjectFactory.makeString("Destroy this inference, reclaiming the memory used to store it.\nOnce an inference is destroyed, it can no longer be examined or continued.");
        $ic660$ = SubLObjectFactory.makeString("cb-destroy-inference&~A&~A");
        $ic661$ = SubLObjectFactory.makeSymbol("S#45839", "CYC");
        $ic662$ = SubLObjectFactory.makeSymbol("CB-DESTROY-ALL-INFERENCES");
        $ic663$ = SubLObjectFactory.makeString("Destroy all inferences (including the focal inference),\nreclaiming the memory used to store them.");
        $ic664$ = SubLObjectFactory.makeString("cb-destroy-all-inferences");
        $ic665$ = SubLObjectFactory.makeKeyword("DESTROY-ALL-INFERENCES");
        $ic666$ = SubLObjectFactory.makeSymbol("S#45840", "CYC");
        $ic667$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45923", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#45915", "CYC"));
        $ic668$ = SubLObjectFactory.makeSymbol("CB-DESTROY-ALL-OTHER-INFERENCES");
        $ic669$ = SubLObjectFactory.makeString("Destroy all inferences other than the focal inference,\nreclaiming the memory used to store them.");
        $ic670$ = SubLObjectFactory.makeString("cb-destroy-all-other-inferences");
        $ic671$ = SubLObjectFactory.makeSymbol("S#45841", "CYC");
        $ic672$ = SubLObjectFactory.makeString("[SubL Query]");
        $ic673$ = SubLObjectFactory.makeString("Convert this inference to an equivalent SubL query (using new-cyc-query). Leads to SubL Interactor.");
        $ic674$ = SubLObjectFactory.makeString("cb-inference-to-subl-query&~A&~A");
        $ic675$ = SubLObjectFactory.makeKeyword("INFERENCE-TO-SUBL-QUERY");
        $ic676$ = SubLObjectFactory.makeSymbol("S#45842", "CYC");
        $ic677$ = SubLObjectFactory.makeString("input-string");
        $ic678$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-TO-SUBL-QUERY");
        $ic679$ = SubLObjectFactory.makeString("[Graph Answers]");
        $ic680$ = SubLObjectFactory.makeString("cb-graph-inference-answers&~A&~A");
        $ic681$ = SubLObjectFactory.makeString("window.open('");
        $ic682$ = SubLObjectFactory.makeString("',");
        $ic683$ = SubLObjectFactory.makeString("'~A'");
        $ic684$ = SubLObjectFactory.makeString("null");
        $ic685$ = SubLObjectFactory.makeString(",'~A'); ");
        $ic686$ = SubLObjectFactory.makeString("return false;");
        $ic687$ = SubLObjectFactory.makeSymbol("S#45843", "CYC");
        $ic688$ = SubLObjectFactory.makeSymbol("CB-GRAPH-INFERENCE-ANSWERS");
        $ic689$ = SubLObjectFactory.makeKeyword("SIGNATURE");
        $ic690$ = SubLObjectFactory.makeKeyword("INFERENCE-STORE-ID");
        $ic691$ = SubLObjectFactory.makeKeyword("INFERENCE-ID");
        $ic692$ = SubLObjectFactory.makeString("cb-graph-inference-answers-window");
        $ic693$ = SubLObjectFactory.makeSymbol("S#45845", "CYC");
        $ic694$ = SubLObjectFactory.makeKeyword("BBF-INFERENCE-ANSWERS");
        $ic695$ = SubLObjectFactory.makeKeyword("BUILDER-FN");
        $ic696$ = SubLObjectFactory.makeKeyword("PARAMS");
        $ic697$ = SubLObjectFactory.makeString("store-id");
        $ic698$ = SubLObjectFactory.makeString("inference-id");
        $ic699$ = SubLObjectFactory.makeString(":ans-format");
        $ic700$ = SubLObjectFactory.makeString(":destination");
        $ic701$ = SubLObjectFactory.makeString(":filename");
        $ic702$ = SubLObjectFactory.makeString("cycl-prefix");
        $ic703$ = SubLObjectFactory.makeKeyword("FILE");
        $ic704$ = SubLObjectFactory.makeString("Please enter a filename to save the results to.");
        $ic705$ = SubLObjectFactory.makeKeyword("TAB-DELIMITED");
        $ic706$ = SubLObjectFactory.makeKeyword("XML");
        $ic707$ = SubLObjectFactory.makeKeyword("ALCHEMY");
        $ic708$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic709$ = SubLObjectFactory.makeString("Attempt to save answers failed:~%~%~A");
        $ic710$ = SubLObjectFactory.makeKeyword("CUSTOM-XML");
        $ic711$ = SubLObjectFactory.makeString(":spec");
        $ic712$ = SubLObjectFactory.makeString("Error: Operation failed");
        $ic713$ = SubLObjectFactory.makeString("The query results were not transformed into XML. \n                          Please check the input XML specifications.");
        $ic714$ = SubLObjectFactory.makeString("Back");
        $ic715$ = SubLObjectFactory.makeString("Error: Invalid input");
        $ic716$ = SubLObjectFactory.makeString("Please select one of the output formats for saving the \n                      query results.");
        $ic717$ = SubLObjectFactory.makeSymbol("CB-SAVE-INFERENCE-ANSWERS-INT");
        $ic718$ = SubLObjectFactory.makeKeyword("HTML-STREAM");
        $ic719$ = SubLObjectFactory.makeKeyword("OUTPUT");
        $ic720$ = SubLObjectFactory.makeString("Answers were saved to ");
        $ic721$ = SubLObjectFactory.makeKeyword("CB-SAVE-INFERENCE-ANSWERS");
        $ic722$ = SubLObjectFactory.makeString("cb-save-inference-answers.html");
        $ic723$ = SubLObjectFactory.makeString("Save Query Results as Text/XML");
        $ic724$ = SubLObjectFactory.makeString("cb-save-inference-answers-int");
        $ic725$ = SubLObjectFactory.makeString("Save query results as:");
        $ic726$ = SubLObjectFactory.makeString(":tab-delimited");
        $ic727$ = SubLObjectFactory.makeString("Text");
        $ic728$ = SubLObjectFactory.makeString(":xml");
        $ic729$ = SubLObjectFactory.makeString("Default XML");
        $ic730$ = SubLObjectFactory.makeString(":custom-xml");
        $ic731$ = SubLObjectFactory.makeString("User-defined XML");
        $ic732$ = SubLObjectFactory.makeString("Destination:");
        $ic733$ = SubLObjectFactory.makeString(":html-stream");
        $ic734$ = SubLObjectFactory.makeString("Show results in this browser");
        $ic735$ = SubLObjectFactory.makeString(":file");
        $ic736$ = SubLObjectFactory.makeString("Save results in file:");
        $ic737$ = SubLObjectFactory.makeKeyword("NBSP");
        $ic738$ = SubLObjectFactory.makeInteger(60);
        $ic739$ = SubLObjectFactory.makeString("Clear");
        $ic740$ = SubLObjectFactory.makeString("Optional Parameters:");
        $ic741$ = SubLObjectFactory.makeString("cycl-prefix-enabled");
        $ic742$ = SubLObjectFactory.makeString("Include '#$' prefix on CycL terms");
        $ic743$ = SubLObjectFactory.makeString("Please enter XML specifications if you selected ");
        $ic744$ = SubLObjectFactory.makeString("Submit");
        $ic745$ = SubLObjectFactory.makeSymbol("CB-SAVE-INFERENCE-ANSWERS");
        $ic746$ = SubLObjectFactory.makeString("[Save Answers]");
        $ic747$ = SubLObjectFactory.makeString("cb-save-inference-answers&~A&~A");
        $ic748$ = SubLObjectFactory.makeSymbol("S#45847", "CYC");
        $ic749$ = SubLObjectFactory.makeKeyword("STORE-ID");
        $ic750$ = SubLObjectFactory.makeSymbol("CB-SAVE-INFERENCE-ANSWERS-AS-QUERIES");
        $ic751$ = SubLObjectFactory.makeString("Save Inference Answers as Queries");
        $ic752$ = SubLObjectFactory.makeKeyword("SUBMIT");
        $ic753$ = SubLObjectFactory.makeKeyword("EL-VARIABLES");
        $ic754$ = SubLObjectFactory.makeString("Please select one or more EL variables");
        $ic755$ = SubLObjectFactory.makeKeyword("ANSWER-IDS");
        $ic756$ = SubLObjectFactory.makeString("Please select one or more answers");
        $ic757$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic758$ = SubLObjectFactory.makeString("cb-save-inference-answers-as-queries");
        $ic759$ = SubLObjectFactory.makeString("Inference ~A in problem store ~A has no answers.");
        $ic760$ = SubLObjectFactory.makeString("Inference ~A in problem store ~A hos no free variables.");
        $ic761$ = SubLObjectFactory.makeString("Which variables should be filled in with bindings in the saved queries?");
        $ic762$ = SubLObjectFactory.makeString("Which answers should be used to generate queries?");
        $ic763$ = SubLObjectFactory.makeString("Answer");
        $ic764$ = SubLObjectFactory.makeSymbol("MAKE-EL-VAR");
        $ic765$ = SubLObjectFactory.makeString("Reifying query for: ");
        $ic766$ = SubLObjectFactory.makeString("query about");
        $ic767$ = SubLObjectFactory.makeString("New Constant: ");
        $ic768$ = SubLObjectFactory.makeString("cb-save-inference-answers-as-queries&~A&~A");
        $ic769$ = SubLObjectFactory.makeSymbol("S#45850", "CYC");
        $ic770$ = SubLObjectFactory.makeString("Inference ~A.~A Answer Timeline");
        $ic771$ = SubLObjectFactory.makeString("Inference Answer Timeline");
        $ic772$ = SubLObjectFactory.makeString(" for ");
        $ic773$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IMAGE-WIDTH"), (SubLObject)SubLObjectFactory.makeInteger(600), (SubLObject)SubLObjectFactory.makeKeyword("IMAGE-HEIGHT"), (SubLObject)SubLObjectFactory.makeInteger(450), (SubLObject)SubLObjectFactory.makeKeyword("PLOT-COLOR"), (SubLObject)SubLObjectFactory.makeString("#0000ff"));
        $ic774$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-ANSWER-TIMELINE");
        $ic775$ = SubLObjectFactory.makeString("[Answer Timeline]");
        $ic776$ = SubLObjectFactory.makeString("cb-inference-answer-timeline&~A&~A");
        $ic777$ = SubLObjectFactory.makeSymbol("S#45851", "CYC");
        $ic778$ = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $ic779$ = SubLObjectFactory.makeString("http://chart.apis.google.com/chart?");
        $ic780$ = SubLObjectFactory.makeString("cht=s");
        $ic781$ = SubLObjectFactory.makeString("&chs=600x450");
        $ic782$ = SubLObjectFactory.makeString("Inference ");
        $ic783$ = SubLObjectFactory.makeString(" Answer Timeline");
        $ic784$ = SubLObjectFactory.makeString("&chtt=~A");
        $ic785$ = SubLObjectFactory.makeString("&chds=~S,~S,~S,~S");
        $ic786$ = SubLObjectFactory.makeString("&chxt=x,y,x,y");
        $ic787$ = SubLObjectFactory.makeString("&chxr=0,~S,~S|1,~S,~S");
        $ic788$ = SubLObjectFactory.makeString("Time (seconds)");
        $ic789$ = SubLObjectFactory.makeString("Answer #");
        $ic790$ = SubLObjectFactory.makeString("&chxl=2:|~A|3:|~A");
        $ic791$ = SubLObjectFactory.makeString("&chxp=2,~S|3,~S");
        $ic792$ = SubLObjectFactory.makeInteger(50);
        $ic793$ = SubLObjectFactory.makeString("&chd=t:");
        $ic794$ = SubLObjectFactory.makeString(",");
        $ic795$ = SubLObjectFactory.makeInteger(450);
        $ic796$ = SubLObjectFactory.makeInteger(600);
        $ic797$ = SubLObjectFactory.makeInteger(120);
        $ic798$ = SubLObjectFactory.makeSymbol("<");
        $ic799$ = SubLObjectFactory.makeSymbol("SECOND");
        $ic800$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45911", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45912", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45924", "CYC"));
        $ic801$ = SubLObjectFactory.makeKeyword("SOME");
        $ic802$ = SubLObjectFactory.makeString("Unexpected mode ~A");
        $ic803$ = SubLObjectFactory.makeSymbol("CB-INFERENCE-STRENGTHEN-PROPERTIES");
        $ic804$ = SubLObjectFactory.makeString("[Strengthen Parameters]");
        $ic805$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SOME"));
        $ic806$ = SubLObjectFactory.makeString("~S was an invalid mode");
        $ic807$ = SubLObjectFactory.makeString("cb-inference-strengthen-properties&~A&~A&~S");
        $ic808$ = SubLObjectFactory.makeKeyword("INFERENCE-STRENGTHEN-PROPERTIES");
        $ic809$ = SubLObjectFactory.makeSymbol("S#45854", "CYC");
        $ic810$ = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $ic811$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45925", "CYC"));
        $ic812$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic813$ = SubLObjectFactory.makeSymbol("CB-TRANSFORMATION-RULE-STATISTICS");
        $ic814$ = SubLObjectFactory.makeString("Experience Control Panel");
        $ic815$ = SubLObjectFactory.makeString("cb-handle-transformation-rule-statistics");
        $ic816$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-STATISTICS");
        $ic817$ = SubLObjectFactory.makeKeyword("CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS");
        $ic818$ = SubLObjectFactory.makeString("[Clear All Experience]");
        $ic819$ = SubLObjectFactory.makeString("Load experience from file : ");
        $ic820$ = SubLObjectFactory.makeString("load_filename");
        $ic821$ = SubLObjectFactory.makeString("Load Experience");
        $ic822$ = SubLObjectFactory.makeString("load");
        $ic823$ = SubLObjectFactory.makeString("Save experience to file : ");
        $ic824$ = SubLObjectFactory.makeString("save_filename");
        $ic825$ = SubLObjectFactory.makeString("Save Experience");
        $ic826$ = SubLObjectFactory.makeString("save");
        $ic827$ = SubLObjectFactory.makeString("Transformation Rule Statistics");
        $ic828$ = SubLObjectFactory.makeString("cb-transformation-rule-statistics&~S");
        $ic829$ = SubLObjectFactory.makeSymbol("S#45857", "CYC");
        $ic830$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE"));
        $ic831$ = SubLObjectFactory.makeString("cb-transformation-rule-statistics");
        $ic832$ = SubLObjectFactory.makeKeyword("HISTORICAL-UTILITY");
        $ic833$ = SubLObjectFactory.makeString("Gather during inference : ");
        $ic834$ = SubLObjectFactory.makeKeyword("DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic835$ = SubLObjectFactory.makeKeyword("ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic836$ = SubLObjectFactory.makeString("[Disable]");
        $ic837$ = SubLObjectFactory.makeString("[Enable]");
        $ic838$ = SubLObjectFactory.makeString("Use for sorting during inference : ");
        $ic839$ = SubLObjectFactory.makeKeyword("DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic840$ = SubLObjectFactory.makeKeyword("ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic841$ = SubLObjectFactory.makeString("Prune never-before-successful rules during inference : ");
        $ic842$ = SubLObjectFactory.makeKeyword("DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic843$ = SubLObjectFactory.makeKeyword("ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic844$ = SubLObjectFactory.makeString("No rules");
        $ic845$ = SubLObjectFactory.makeString("Experience files that have been loaded into this image:");
        $ic846$ = SubLObjectFactory.makeString("No experience files have been loaded into this image.");
        $ic847$ = SubLObjectFactory.makeString("Experience files that have been received by this image:");
        $ic848$ = SubLObjectFactory.makeString("No experience files have been received by this image.");
        $ic849$ = SubLObjectFactory.makeString("Total experience:");
        $ic850$ = SubLObjectFactory.makeString("~S rule considerations");
        $ic851$ = SubLObjectFactory.makeString("~S rule successes");
        $ic852$ = SubLObjectFactory.makeString("~S rules");
        $ic853$ = SubLObjectFactory.makeString("(see below)");
        $ic854$ = SubLObjectFactory.makeString("[Show Rule Details]");
        $ic855$ = SubLObjectFactory.makeString("Experience acquired by this image's inferences:");
        $ic856$ = SubLObjectFactory.makeKeyword("IMAGE-SPECIFIC");
        $ic857$ = SubLObjectFactory.makeString("Experience received from other images:");
        $ic858$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(80), (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(60), (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)module0683.TWENTY_INTEGER, (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)module0683.ZERO_INTEGER, (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(-20), (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(-40), (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(-60), (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(-80), (SubLObject)module0683.ZERO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(-100), (SubLObject)module0683.ZERO_INTEGER) });
        $ic859$ = SubLObjectFactory.makeSymbol(">=");
        $ic860$ = SubLObjectFactory.makeSymbol("CAR");
        $ic861$ = SubLObjectFactory.makeString("Rule Utility Histogram");
        $ic862$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic863$ = SubLObjectFactory.makeString("Utility");
        $ic864$ = SubLObjectFactory.makeString("Count");
        $ic865$ = SubLObjectFactory.makeString("Percent");
        $ic866$ = SubLObjectFactory.makeSymbol("CDR");
        $ic867$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#45926", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45927", "CYC"));
        $ic868$ = SubLObjectFactory.makeString("~A %");
        $ic869$ = SubLObjectFactory.makeInteger(40);
        $ic870$ = SubLObjectFactory.makeString("~S rules with image-specific experience, sorted by ~A");
        $ic871$ = SubLObjectFactory.makeString("[Hide Rule Details]");
        $ic872$ = SubLObjectFactory.makeString("~S rules, sorted by ~A");
        $ic873$ = SubLObjectFactory.makeString(" ~S/~S (~S %)  utility : ~S");
        $ic874$ = SubLObjectFactory.makeString(" ~S utility");
        $ic875$ = SubLObjectFactory.makeString(", never considered");
        $ic876$ = SubLObjectFactory.makeString(", due to ~S % success (~S/~S)");
        $ic877$ = SubLObjectFactory.makeString(": ");
        $ic878$ = SubLObjectFactory.makeString(" mode is the least powerful inference mode in which this rule will be used.");
        $ic879$ = SubLObjectFactory.makeKeyword("SHALLOW");
        $ic880$ = SubLObjectFactory.makeKeyword("EXTENDED");
        $ic881$ = SubLObjectFactory.makeKeyword("MAXIMAL");
        $ic882$ = SubLObjectFactory.makeKeyword("BLUE");
        $ic883$ = SubLObjectFactory.makeString("Shallow");
        $ic884$ = SubLObjectFactory.makeKeyword("MAGENTA");
        $ic885$ = SubLObjectFactory.makeString("Extended");
        $ic886$ = SubLObjectFactory.makeString("Maximal");
        $ic887$ = SubLObjectFactory.makeSymbol("CB-DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic888$ = SubLObjectFactory.makeString("cb-disable-strategic-heuristic-rule-historical-utility");
        $ic889$ = SubLObjectFactory.makeSymbol("S#45862", "CYC");
        $ic890$ = SubLObjectFactory.makeSymbol("CB-ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic891$ = SubLObjectFactory.makeString("cb-enable-strategic-heuristic-rule-historical-utility");
        $ic892$ = SubLObjectFactory.makeSymbol("S#45863", "CYC");
        $ic893$ = SubLObjectFactory.makeSymbol("CB-DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic894$ = SubLObjectFactory.makeString("cb-disable-transformation-rule-statistics-update");
        $ic895$ = SubLObjectFactory.makeSymbol("S#45864", "CYC");
        $ic896$ = SubLObjectFactory.makeSymbol("CB-ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic897$ = SubLObjectFactory.makeString("cb-enable-transformation-rule-statistics-update");
        $ic898$ = SubLObjectFactory.makeSymbol("S#45865", "CYC");
        $ic899$ = SubLObjectFactory.makeSymbol("CB-DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic900$ = SubLObjectFactory.makeString("cb-disable-transformation-rule-historical-success-pruning");
        $ic901$ = SubLObjectFactory.makeSymbol("S#45866", "CYC");
        $ic902$ = SubLObjectFactory.makeSymbol("CB-ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic903$ = SubLObjectFactory.makeString("cb-enable-transformation-rule-historical-success-pruning");
        $ic904$ = SubLObjectFactory.makeSymbol("S#45867", "CYC");
        $ic905$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"));
        $ic906$ = SubLObjectFactory.makeString("Could not determine an assertion from ~a");
        $ic907$ = SubLObjectFactory.makeString("The transformation statistics have been cleared.");
        $ic908$ = SubLObjectFactory.makeSymbol("CB-CLEAR-TRANSFORMATION-RULE-STATISTICS");
        $ic909$ = SubLObjectFactory.makeString("[Clear]");
        $ic910$ = SubLObjectFactory.makeString("cb-clear-transformation-rule-statistics&~A");
        $ic911$ = SubLObjectFactory.makeKeyword("CLEAR-TRANSFORMATION-RULE-STATISTICS");
        $ic912$ = SubLObjectFactory.makeSymbol("S#45868", "CYC");
        $ic913$ = SubLObjectFactory.makeSymbol("CB-CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS");
        $ic914$ = SubLObjectFactory.makeString("[Clear All]");
        $ic915$ = SubLObjectFactory.makeString("cb-clear-all-transformation-rule-statistics");
        $ic916$ = SubLObjectFactory.makeSymbol("S#45869", "CYC");
        $ic917$ = SubLObjectFactory.makeString("Must specify either load or save.");
        $ic918$ = SubLObjectFactory.makeString("Unexpected args ~s");
        $ic919$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS");
        $ic920$ = SubLObjectFactory.makeString("The specified filename ~S could not be found.");
        $ic921$ = SubLObjectFactory.makeString("No filename was specified.");
        $ic922$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-LOAD");
        $ic923$ = SubLObjectFactory.makeString("The specified filename ~S could not be opened for writing.");
        $ic924$ = SubLObjectFactory.makeString("Experience saved.");
        $ic925$ = SubLObjectFactory.makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-SAVE");
        $ic926$ = SubLObjectFactory.makeString("Forward Inference Metrics");
        $ic927$ = SubLObjectFactory.makeSymbol("CB-FORWARD-INFERENCE-METRICS");
        $ic928$ = SubLObjectFactory.makeString("cb-forward-inference-metrics");
        $ic929$ = SubLObjectFactory.makeKeyword("FORWARD-INFERENCE-METRICS");
        $ic930$ = SubLObjectFactory.makeSymbol("S#45870", "CYC");
        $ic931$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic932$ = SubLObjectFactory.makeString("Rule Forward Inference Metrics");
        $ic933$ = SubLObjectFactory.makeKeyword("RULE-FORWARD-INFERENCE-METRICS");
        $ic934$ = SubLObjectFactory.makeString("[All Forward Inference Metrics]");
        $ic935$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic936$ = SubLObjectFactory.makeSymbol("CB-RULE-FORWARD-INFERENCE-METRICS");
        $ic937$ = SubLObjectFactory.makeString("[Forward Inference Metrics]");
        $ic938$ = SubLObjectFactory.makeString("cb-rule-forward-inference-metrics&~A");
        $ic939$ = SubLObjectFactory.makeSymbol("S#45871", "CYC");
        $ic940$ = SubLObjectFactory.makeSymbol("CB-CLEAR-FORWARD-INFERENCE-METRICS");
        $ic941$ = SubLObjectFactory.makeString("[Clear Forward Metrics]");
        $ic942$ = SubLObjectFactory.makeString("cb-clear-forward-inference-metrics");
        $ic943$ = SubLObjectFactory.makeKeyword("CLEAR-FORWARD-INFERENCE-METRICS");
        $ic944$ = SubLObjectFactory.makeSymbol("S#45872", "CYC");
        $ic945$ = SubLObjectFactory.makeSymbol("CB-START-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic946$ = SubLObjectFactory.makeString("[Start Gathering Metrics]");
        $ic947$ = SubLObjectFactory.makeString("cb-start-gathering-forward-inference-metrics");
        $ic948$ = SubLObjectFactory.makeKeyword("START-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic949$ = SubLObjectFactory.makeSymbol("S#45873", "CYC");
        $ic950$ = SubLObjectFactory.makeSymbol("CB-STOP-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic951$ = SubLObjectFactory.makeString("[Stop Gathering Metrics]");
        $ic952$ = SubLObjectFactory.makeString("cb-stop-gathering-forward-inference-metrics");
        $ic953$ = SubLObjectFactory.makeKeyword("STOP-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic954$ = SubLObjectFactory.makeSymbol("S#45874", "CYC");
        $ic955$ = SubLObjectFactory.makeString(" No forward inference metrics have been gathered yet.");
        $ic956$ = SubLObjectFactory.makeString("No forward inference metrics have been gathered.");
        $ic957$ = SubLObjectFactory.makeKeyword("TOTAL-RULES");
        $ic958$ = SubLObjectFactory.makeKeyword("TOTAL-TIME");
        $ic959$ = SubLObjectFactory.makeKeyword("TOTAL-INFERENCES");
        $ic960$ = SubLObjectFactory.makeKeyword("AVERAGE-INFERENCES-PER-RULE");
        $ic961$ = SubLObjectFactory.makeKeyword("STDEV-INFERENCES-PER-RULE");
        $ic962$ = SubLObjectFactory.makeKeyword("AVERAGE-TIME-PER-RULE");
        $ic963$ = SubLObjectFactory.makeKeyword("STDEV-TIME-PER-RULE");
        $ic964$ = SubLObjectFactory.makeKeyword("AVERAGE-TIME-PER-INFERENCE");
        $ic965$ = SubLObjectFactory.makeKeyword("STDEV-TIME-PER-INFERENCE");
        $ic966$ = SubLObjectFactory.makeString("Totals");
        $ic967$ = SubLObjectFactory.makeString(" seconds");
        $ic968$ = SubLObjectFactory.makeString(" inferences");
        $ic969$ = SubLObjectFactory.makeString(" rules");
        $ic970$ = SubLObjectFactory.makeString("Averages");
        $ic971$ = SubLObjectFactory.makeString(" seconds / rule");
        $ic972$ = SubLObjectFactory.makeString(" inferences / rule");
        $ic973$ = SubLObjectFactory.makeString(" seconds / inference");
        $ic974$ = SubLObjectFactory.makeString("Standard Deviations");
        $ic975$ = SubLObjectFactory.makeKeyword("TIME");
        $ic976$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#13097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("S#32032", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32033", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32034", "CYC"));
        $ic977$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE"), (SubLObject)SubLObjectFactory.makeKeyword("TIME"), (SubLObject)SubLObjectFactory.makeKeyword("TRIGGER-GAFS"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("INFERENCES"));
        $ic978$ = SubLObjectFactory.makeKeyword("RULE");
        $ic979$ = SubLObjectFactory.makeKeyword("TRIGGER-GAFS");
        $ic980$ = SubLObjectFactory.makeKeyword("INFERENCE-COUNT");
        $ic981$ = SubLObjectFactory.makeKeyword("INFERENCES");
        $ic982$ = SubLObjectFactory.makeString("cumulative time ~S%");
        $ic983$ = SubLObjectFactory.makeKeyword("WHITE");
        $ic984$ = SubLObjectFactory.makeKeyword("BLACK");
        $ic985$ = SubLObjectFactory.makeString(" seconds avg.");
        $ic986$ = SubLObjectFactory.makeString("80%");
        $ic987$ = SubLObjectFactory.makeString("[Show Detail]");
        $ic988$ = SubLObjectFactory.makeString("Inferences:");
        $ic989$ = SubLObjectFactory.makeString(" ~S good");
        $ic990$ = SubLObjectFactory.makeString(" ~S neutral");
        $ic991$ = SubLObjectFactory.makeString(" ~S no-good");
        $ic992$ = SubLObjectFactory.makeString("Good: ");
        $ic993$ = SubLObjectFactory.makeString("Neutral: ");
        $ic994$ = SubLObjectFactory.makeString("No-Good: ");
        $ic995$ = SubLObjectFactory.makeString("Trigger GAFs:");
        $ic996$ = SubLObjectFactory.makeString(" ~S successful");
        $ic997$ = SubLObjectFactory.makeString(" ~S failed");
        $ic998$ = SubLObjectFactory.makeString("Successful: ");
        $ic999$ = SubLObjectFactory.makeString("Failed: ");
        $ic1000$ = SubLObjectFactory.makeKeyword("INFERENCE");
        $ic1001$ = SubLObjectFactory.makeKeyword("VERY-VERBOSE");
        $ic1002$ = SubLObjectFactory.makeString(" (~as)");
        $ic1003$ = SubLObjectFactory.makeString("~S seconds");
        $ic1004$ = SubLObjectFactory.makeString(", ~S inferences, ~S seconds/inference");
        $ic1005$ = SubLObjectFactory.makeKeyword("GOOD");
        $ic1006$ = SubLObjectFactory.makeKeyword("NEUTRAL");
        $ic1007$ = SubLObjectFactory.makeKeyword("NO-GOOD");
        $ic1008$ = SubLObjectFactory.makeString("!");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0683.class
	Total time: 9504 ms
	
	Decompiled with Procyon 0.5.32.
*/