package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var2 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var3 = inference_datastructures_inference_oc.f25422(var1);
        return Sequences.cconcatenate(module0006.f203(var2), new SubLObject[] { $ic1$, module0006.f203(var3) });
    }
    
    public static SubLObject f41671(final SubLObject var5) {
        if (var5.isString()) {
            final SubLObject var6 = module0038.f2752(var5, (SubLObject)$ic2$);
            if (NIL != module0035.f1995(var6, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                SubLObject var8;
                final SubLObject var7 = var8 = var6;
                SubLObject var9 = (SubLObject)NIL;
                SubLObject var10 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic3$);
                var9 = var8.first();
                var8 = var8.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)$ic3$);
                var10 = var8.first();
                var8 = var8.rest();
                if (NIL == var8) {
                    return f41672(var9, var10);
                }
                cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)$ic3$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41672(final SubLObject var9, final SubLObject var10) {
        if (NIL != module0038.f2727(var9) && NIL != module0038.f2727(var10)) {
            final SubLObject var11 = reader.parse_integer(var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var12 = reader.parse_integer(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var13 = module0361.f24195(var11, var12);
            if (NIL != inference_datastructures_inference_oc.f25275(var13)) {
                return var13;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41673(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != var14) {
            if (var14.isString()) {
                final SubLObject var19 = module0644.f39202(var14, var15, var16, var17);
                module0642.f39020(module0015.$g381$.getGlobalValue());
                module0642.f39020(module0015.$g389$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var19);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g390$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic4$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41674(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        f41673(var13, var14, var15, var16, var17);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41675(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        return f41673(var13, var14, var15, var16, var17);
    }
    
    public static SubLObject f41676(final SubLObject var13, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        return f41674(var13, var14, var15, var16, var17);
    }
    
    public static SubLObject f41677(final SubLObject var21, final SubLObject var22, final SubLObject var14, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (var14.isString()) {
            final SubLObject var24 = module0644.f39202(var14, var15, var16, var17);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_hash, (SubLObject)UNPROVIDED);
            module0642.f39020(var21);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var25 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var25, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41678(SubLObject var23, SubLObject var14, SubLObject var24, SubLObject var25, SubLObject var15, SubLObject var16, SubLObject var17) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (var14.isString()) {
            final SubLObject var27 = module0644.f39202(var14, var15, var16, var17);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var26);
            try {
                module0015.$g533$.bind((SubLObject)T, var26);
                module0642.f39074(var23, var24, var25);
            }
            finally {
                module0015.$g533$.rebind(var28, var26);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41679(SubLObject var23, SubLObject var14, SubLObject var26, SubLObject var24, SubLObject var25, SubLObject var15, SubLObject var16) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)NIL;
        }
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var24 == UNPROVIDED) {
            var24 = (SubLObject)NIL;
        }
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var27 = f41680(var26);
        final SubLObject var28 = Sequences.cconcatenate(var14, new SubLObject[] { $ic5$, var27 });
        f41678(var23, var28, var24, var25, var15, var16, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41681(final SubLObject var13, final SubLObject var14, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var27 = f41680(var26);
        final SubLObject var28 = Sequences.cconcatenate(var14, new SubLObject[] { $ic5$, var27 });
        f41675(var13, var28, var15, var16, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41682(final SubLObject var13, final SubLObject var14, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        final SubLObject var27 = f41680(var26);
        final SubLObject var28 = Sequences.cconcatenate(var14, new SubLObject[] { $ic5$, var27 });
        f41676(var13, var28, var15, var16, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41683(final SubLObject var13, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        f41681(var13, (SubLObject)$ic6$, var26, var15, var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41684(final SubLObject var13, final SubLObject var26, SubLObject var15, SubLObject var16) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        f41682(var13, (SubLObject)$ic6$, var26, var15, var16);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41685(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic7$);
        var33 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic7$);
        var34 = var32.first();
        var32 = var32.rest();
        final SubLObject var35 = (SubLObject)(var32.isCons() ? var32.first() : $ic8$);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)$ic7$);
        var32 = var32.rest();
        final SubLObject var36 = (SubLObject)(var32.isCons() ? var32.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)$ic7$);
        var32 = var32.rest();
        final SubLObject var37 = (SubLObject)(var32.isCons() ? var32.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)$ic7$);
        var32 = var32.rest();
        final SubLObject var38 = (SubLObject)(var32.isCons() ? var32.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)$ic7$);
        var32 = var32.rest();
        final SubLObject var39 = (SubLObject)(var32.isCons() ? var32.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var32, var31, (SubLObject)$ic7$);
        var32 = var32.rest();
        if (NIL == var32) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic9$, var33, var34, var35, var36, var37, var38, var39);
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41686(final SubLObject var22, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5078$.getDynamicValue(var27)) {
            final SubLObject var28 = (SubLObject)((NIL != module0655.$g5109$.getDynamicValue(var27)) ? $ic10$ : $ic11$);
            final SubLObject var29 = module0656.f39832(var28);
            final SubLObject var30 = f41687(var26);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var29) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var29);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var31 = module0015.$g533$.currentBinding(var27);
            try {
                module0015.$g533$.bind((SubLObject)T, var27);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41688(final SubLObject var37, final SubLObject var38, final SubLObject var39) {
        final SubLThread var40 = SubLProcess.currentSubLThread();
        if (var37.isZero()) {
            module0642.f39019((SubLObject)$ic14$);
        }
        else {
            if (!var37.numE(var38)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)$ic15$, var37);
            }
            if (!var38.isZero()) {
                if (!var37.numE(var38)) {
                    module0642.f39019((SubLObject)$ic16$);
                }
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)$ic17$, var38);
            }
            if (!var39.numE(var38)) {
                module0642.f39019((SubLObject)$ic16$);
                PrintLow.format(module0015.$g131$.getDynamicValue(var40), (SubLObject)$ic18$, var39, var39);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41689(final SubLObject var1, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)T;
        }
        final SubLObject var41 = inference_datastructures_inference_oc.f25420(var1);
        final SubLObject var42 = inference_datastructures_inference_oc.f25433(var1);
        cb_query_browser_oc.f41965(var41);
        if (NIL != var40 && (var41 == $ic19$ || var41 == $ic20$) && NIL != var42) {
            module0642.f39032((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic21$, var1, (SubLObject)$ic22$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var41 == $ic23$) {
            final SubLObject var42_43 = inference_datastructures_inference_oc.f25433(var1);
            module0642.f39019((SubLObject)$ic16$);
            cb_query_browser_oc.f41966(var42_43);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41680(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        try {
            var29 = streams_high.make_private_string_output_stream();
            final SubLObject var30 = module0015.$g131$.currentBinding(var27);
            try {
                module0015.$g131$.bind(var29, var27);
                module0656.f39837((SubLObject)$ic12$, (SubLObject)$ic24$, var26, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g131$.rebind(var30, var27);
            }
            var28 = streams_high.get_output_stream_string(var29);
        }
        finally {
            final SubLObject var31 = Threads.$is_thread_performing_cleanupP$.currentBinding(var27);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var27);
                streams_high.close(var29, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var31, var27);
            }
        }
        return var28;
    }
    
    public static SubLObject f41690() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return Sequences.cconcatenate(module0006.f203(module0110.$g127$.getDynamicValue(var18)), (SubLObject)$ic25$);
    }
    
    public static SubLObject f41687(final SubLObject var26) {
        return Sequences.cconcatenate(f41690(), new SubLObject[] { $g5353$.getGlobalValue(), $ic27$, var26 });
    }
    
    public static SubLObject f41691(final SubLObject var46) {
        return module0035.sublisp_boolean(module0067.f4884($g5354$.getGlobalValue(), var46, (SubLObject)NIL));
    }
    
    public static SubLObject f41692(final SubLObject var46) {
        return conses_high.getf(module0067.f4884($g5354$.getGlobalValue(), var46, (SubLObject)NIL), (SubLObject)$ic29$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41693(final SubLObject var46) {
        return conses_high.getf(module0067.f4884($g5354$.getGlobalValue(), var46, (SubLObject)NIL), (SubLObject)$ic30$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41694(final SubLObject var46) {
        return conses_high.getf(module0067.f4884($g5354$.getGlobalValue(), var46, (SubLObject)NIL), (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41695(final SubLObject var46) {
        return conses_high.getf(module0067.f4884($g5354$.getGlobalValue(), var46, (SubLObject)NIL), (SubLObject)$ic32$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41696(final SubLObject var46) {
        return conses_high.getf(module0067.f4884($g5354$.getGlobalValue(), var46, (SubLObject)NIL), (SubLObject)$ic33$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41697(SubLObject var47, final SubLObject var48) {
        var47 = (var47.isNumber() ? Numbers.multiply(var47, f41695(var48)) : var47);
        if (var47.isNumber() && NIL != f41696(var48)) {
            var47 = Numbers.round(var47, (SubLObject)UNPROVIDED);
        }
        return var47;
    }
    
    public static SubLObject f41698(final SubLObject var47, final SubLObject var48) {
        return var47.isNumber() ? Numbers.divide(var47, f41695(var48)) : var47;
    }
    
    public static SubLObject f41699(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        SubLObject var33 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic34$);
        var33 = var32.first();
        var32 = var32.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = var32;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var55_56 = (SubLObject)NIL;
        while (NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)$ic34$);
            var55_56 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var31, (SubLObject)$ic34$);
            if (NIL == conses_high.member(var55_56, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var36 = (SubLObject)T;
            }
            if (var55_56 == $ic36$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (NIL != var36 && NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic34$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic29$, var32);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39 = cdestructuring_bind.property_list_member((SubLObject)$ic30$, var32);
        final SubLObject var40 = (SubLObject)((NIL != var39) ? conses_high.cadr(var39) : NIL);
        final SubLObject var41 = cdestructuring_bind.property_list_member((SubLObject)$ic31$, var32);
        final SubLObject var42 = (SubLObject)((NIL != var41) ? conses_high.cadr(var41) : NIL);
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic32$, var32);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic33$, var32);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic37$, var33, var38, var40, (SubLObject)ConsesLow.list((SubLObject)$ic38$, var42), var44, var46);
    }
    
    public static SubLObject f41700(final SubLObject var51, SubLObject var58, SubLObject var60, SubLObject var62, SubLObject var64, final SubLObject var66) {
        assert NIL != Types.keywordp(var51) : var51;
        if (!var58.isString()) {
            var58 = print_high.prin1_to_string(var51);
        }
        if (!var60.isString()) {
            var60 = (SubLObject)$ic6$;
        }
        if (!var62.isCons()) {
            var62 = (SubLObject)$ic42$;
        }
        if (!var64.isNumber()) {
            var64 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var67 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic29$, var58, $ic30$, var60, $ic31$, var62, $ic32$, var64, $ic33$, var66 });
        module0067.f4886($g5354$.getGlobalValue(), var51, var67);
        return var51;
    }
    
    public static SubLObject f41701(final SubLObject var48, final SubLObject var47, final SubLObject var68) {
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var68, var68, (SubLObject)$ic43$);
        var69 = var68.first();
        SubLObject var72 = var68.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var72, var68, (SubLObject)$ic43$);
        var70 = var72.first();
        var72 = var72.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var72, var68, (SubLObject)$ic43$);
        var71 = var72.first();
        var72 = var72.rest();
        if (NIL != var72) {
            cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic43$);
            return (SubLObject)NIL;
        }
        final SubLObject var73 = var69;
        if (var73.eql((SubLObject)$ic44$)) {
            return module0035.f2417(var70, var47);
        }
        if (var73.eql((SubLObject)$ic45$)) {
            return Functions.funcall(var70, var47);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41702(final SubLObject var73, final SubLObject var74, final SubLObject var75, final SubLObject var76, SubLObject var77) {
        final SubLObject var78 = inference_datastructures_inference_oc.f25421(var73);
        var77 = conses_high.putf(conses_high.copy_list(var77), (SubLObject)$ic190$, var78);
        return f41703(var74, var75, var76, var77);
    }
    
    public static SubLObject f41703(final SubLObject var74, final SubLObject var75, final SubLObject var76, SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        SubLObject var79 = module0360.f23800(var77);
        if (NIL != var76) {
            var79 = conses_high.putf(conses_high.copy_list(var79), (SubLObject)$ic191$, var76);
            var77 = conses_high.putf(conses_high.copy_list(var77), (SubLObject)$ic191$, var76);
        }
        var78.resetMultipleValues();
        final SubLObject var80 = module0279.f18576(var74, var75);
        final SubLObject var81 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        if (NIL != module0408.f28423(var80)) {
            var79 = conses_high.putf(conses_high.copy_list(var79), (SubLObject)$ic192$, (SubLObject)T);
            var77 = conses_high.putf(conses_high.copy_list(var77), (SubLObject)$ic192$, (SubLObject)T);
        }
        module0658.f40058(var80, var81, var77);
        final SubLObject var82 = module0409.f28515(var80, var81, var79);
        if (NIL != inference_datastructures_inference_oc.f25431(var82)) {
            return f41704(var82, var77);
        }
        return var82;
    }
    
    public static SubLObject f41704(final SubLObject var73, final SubLObject var77) {
        final SubLObject var78 = module0360.f23805(var77);
        final SubLObject var79 = f41705();
        final SubLObject var80 = Semaphores.new_semaphore((SubLObject)$ic193$, (SubLObject)ZERO_INTEGER);
        module0004.f78((SubLObject)$ic194$, (SubLObject)$ic195$, (SubLObject)ConsesLow.list(var73, var78, var79, var80));
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
            Packages.$package$.bind(Packages.find_package((SubLObject)$ic196$), var87);
            print_high.$print_readably$.bind((SubLObject)NIL, var87);
            reader.$read_eval$.bind((SubLObject)NIL, var87);
            assert NIL != module0091.f6325(var84) : var84;
            final SubLObject var91 = module0091.f6339(var84);
            final ArrayList var92 = Dynamic.extract_dynamic_values(var91);
            try {
                Dynamic.bind_dynamic_vars(var91, module0091.f6340(var84));
                Semaphores.semaphore_signal(var85);
                if (NIL != inference_datastructures_inference_oc.f25417(var1)) {
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41707() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        f41708();
        return $g5356$.getDynamicValue(var18);
    }
    
    public static SubLObject f41709(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic199$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic199$);
        var34 = var32.first();
        var32 = var32.rest();
        if (NIL == var32) {
            final SubLObject var35;
            var32 = (var35 = var33);
            return (SubLObject)ConsesLow.list((SubLObject)$ic200$, reader.bq_cons(var34, (SubLObject)$ic201$), (SubLObject)ConsesLow.listS((SubLObject)$ic202$, var34, ConsesLow.append(var35, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic199$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41710(final SubLObject var29, final SubLObject var30) {
        SubLObject var32;
        final SubLObject var31 = var32 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic203$);
        final SubLObject var33 = var32.rest();
        var32 = var32.first();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic203$);
        var34 = var32.first();
        var32 = var32.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic203$);
        var35 = var32.first();
        var32 = var32.rest();
        if (NIL == var32) {
            final SubLObject var36;
            var32 = (var36 = var33);
            return (SubLObject)ConsesLow.listS((SubLObject)$ic204$, (SubLObject)ConsesLow.list((SubLObject)$ic205$, var34, (SubLObject)$ic206$, var35), (SubLObject)$ic207$, ConsesLow.append(var36, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic203$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41711() {
        SubLObject var102;
        final SubLObject var101 = var102 = f41707();
        final SubLObject var103 = (SubLObject)(var102.isCons() ? var102.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var102, var101, (SubLObject)$ic208$);
        final SubLObject var104;
        var102 = (var104 = var102.rest());
        return var103;
    }
    
    public static SubLObject f41712(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        f41713((SubLObject)NIL);
        f41713(var1);
        $g5356$.setDynamicValue((SubLObject)ConsesLow.cons(var1, $g5356$.getDynamicValue(var2)), var2);
        f41714();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41715() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        f41713((SubLObject)NIL);
        $g5356$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)NIL, $g5356$.getDynamicValue(var18)), var18);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41716(final SubLObject var6) {
        SubLObject var7 = (SubLObject)ZERO_INTEGER;
        SubLObject var8 = var6;
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            final SubLObject var10 = module0361.f24195(var9, (SubLObject)ZERO_INTEGER);
            if (NIL != inference_datastructures_inference_oc.f25417(var10)) {
                var7 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                f41712(var10);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        return var7;
    }
    
    public static SubLObject f41713(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        $g5356$.setDynamicValue(Sequences.delete(var1, $g5356$.getDynamicValue(var2), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var2);
        return (SubLObject)T;
    }
    
    public static SubLObject f41708() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        $g5356$.setDynamicValue(module0035.delete_if_not(Symbols.symbol_function((SubLObject)$ic209$), $g5356$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41717(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0684.f41927(var1);
        module0686.f42034(var1);
        SubLObject var3 = (SubLObject)NIL;
        try {
            var2.throwStack.push($ic210$);
            final SubLObject var4 = Errors.$error_handler$.currentBinding(var2);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic211$), var2);
                try {
                    try {
                        if (NIL != inference_datastructures_inference_oc.f25417(var1)) {
                            final SubLObject var5 = inference_datastructures_inference_oc.f25421(var1);
                            if (ONE_INTEGER.numE(module0361.f24191(var5))) {
                                module0361.f24005(var5);
                            }
                            else {
                                inference_datastructures_inference_oc.f25471(var1);
                            }
                        }
                    }
                    finally {
                        final SubLObject var20_108 = Threads.$is_thread_performing_cleanupP$.currentBinding(var2);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var2);
                            f41713(var1);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var20_108, var2);
                        }
                    }
                }
                catch (Throwable var6) {
                    Errors.handleThrowable(var6, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var4, var2);
            }
        }
        catch (Throwable var7) {
            var3 = Errors.handleThrowable(var7, (SubLObject)$ic210$);
        }
        finally {
            var2.throwStack.pop();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41714() {
        SubLObject var112;
        final SubLObject var111 = var112 = f41707();
        final SubLObject var113 = (SubLObject)(var112.isCons() ? var112.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var112, var111, (SubLObject)$ic208$);
        final SubLObject var114;
        var112 = (var114 = var112.rest());
        f41718(var114);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41718(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (NIL != module0048.f3328(module0655.$g5093$.getDynamicValue(var101))) {
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1993(var100, module0655.$g5093$.getDynamicValue(var101), (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = (SubLObject)NIL;
        SubLObject var104 = (SubLObject)NIL;
        var102 = var100;
        var103 = var102.first();
        for (var104 = (SubLObject)ZERO_INTEGER; NIL != var102; var102 = var102.rest(), var103 = var102.first(), var104 = Numbers.add((SubLObject)ONE_INTEGER, var104)) {
            if (var104.numGE(module0655.$g5093$.getDynamicValue(var101))) {
                f41717(var103);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41719(final SubLObject var1) {
        if (NIL != inference_datastructures_inference_oc.f25417(var1)) {
            module0414.f28933(var1, (SubLObject)$ic212$);
            return var1;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41720(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41722(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic216$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic217$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            if (NIL != module0014.f695((SubLObject)$ic214$)) {
                final SubLObject var26 = module0014.f697((SubLObject)$ic214$);
                final SubLObject var27 = (SubLObject)$ic218$;
                final SubLObject var28 = module0014.f694((SubLObject)$ic214$);
                final SubLObject var29 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var28) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var28);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var27) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var27));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var29) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var29);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_122 = module0015.$g533$.currentBinding(var23);
                try {
                    module0015.$g533$.bind((SubLObject)T, var23);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41721(SubLObject var123) {
        if (var123 == UNPROVIDED) {
            var123 = (SubLObject)NIL;
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        f41708();
        SubLObject var126;
        final SubLObject var125 = var126 = f41707();
        final SubLObject var127 = (SubLObject)(var126.isCons() ? var126.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var126, var125, (SubLObject)$ic208$);
        final SubLObject var128;
        var126 = (var128 = var126.rest());
        final SubLObject var128_129;
        final SubLObject var126_127 = var128_129 = var123;
        final SubLObject var129 = cdestructuring_bind.property_list_member((SubLObject)$ic221$, var128_129);
        final SubLObject var130 = (SubLObject)((NIL != var129) ? conses_high.cadr(var129) : $ic222$);
        final SubLObject var131 = cdestructuring_bind.property_list_member((SubLObject)$ic223$, var128_129);
        final SubLObject var132 = (SubLObject)((NIL != var131) ? conses_high.cadr(var131) : NIL);
        final SubLObject var133 = cdestructuring_bind.property_list_member((SubLObject)$ic224$, var128_129);
        final SubLObject var134 = (SubLObject)((NIL != var133) ? conses_high.cadr(var133) : $ic225$);
        final SubLObject var135 = cdestructuring_bind.property_list_member((SubLObject)$ic226$, var128_129);
        final SubLObject var136 = (SubLObject)((NIL != var135) ? conses_high.cadr(var135) : $ic225$);
        final SubLObject var137 = cdestructuring_bind.property_list_member((SubLObject)$ic191$, var128_129);
        final SubLObject var138 = (SubLObject)((NIL != var137) ? conses_high.cadr(var137) : $ic225$);
        final SubLObject var139 = cdestructuring_bind.property_list_member((SubLObject)$ic227$, var128_129);
        final SubLObject var140 = (SubLObject)((NIL != var139) ? conses_high.cadr(var139) : $ic225$);
        final SubLObject var141 = cdestructuring_bind.property_list_member((SubLObject)$ic228$, var128_129);
        final SubLObject var142 = (SubLObject)((NIL != var141) ? conses_high.cadr(var141) : $ic225$);
        final SubLObject var143 = cdestructuring_bind.property_list_member((SubLObject)$ic229$, var128_129);
        final SubLObject var144 = (SubLObject)((NIL != var143) ? conses_high.cadr(var143) : $ic225$);
        final SubLObject var145 = module0015.$g538$.currentBinding(var124);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var124))) ? module0015.$g538$.getDynamicValue(var124) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var124);
            module0642.f39020((SubLObject)$ic230$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var124), module0655.$g5142$.getDynamicValue(var124));
            final SubLObject var146 = module0014.f672((SubLObject)$ic231$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var146) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var146);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            module0642.f39019(var130);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            if (NIL != var132) {
                module0642.f39055(var132);
            }
            module0666.f40471();
            module0016.f892();
            if (NIL != $g5357$.getDynamicValue(var124)) {
                f41723();
                f41724();
            }
            module0644.f39208();
            module0016.f895();
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var20_144 = module0015.$g535$.currentBinding(var124);
            try {
                module0015.$g535$.bind((SubLObject)T, var124);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_145 = module0015.$g533$.currentBinding(var124);
                try {
                    module0015.$g533$.bind((SubLObject)T, var124);
                    final SubLObject var147 = module0644.f39214(module0644.$g5024$.getGlobalValue());
                    final SubLObject var148 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var124));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic235$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var148) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var148);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    module0642.f39020(var147);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_146 = module0015.$g533$.currentBinding(var124);
                    final SubLObject var149 = module0015.$g541$.currentBinding(var124);
                    final SubLObject var150 = module0015.$g539$.currentBinding(var124);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var124);
                        module0015.$g541$.bind((SubLObject)T, var124);
                        module0015.$g539$.bind(module0015.f797(), var124);
                        module0642.f39069((SubLObject)$ic236$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                        f41725(var130);
                        module0644.f39197();
                        f41726(var127, var128);
                        if (NIL != var128) {
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            f41727(var127, var128);
                        }
                        if (NIL != var127) {
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            f41728(var134, var132, var127);
                        }
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f41729(var134, var136, var138, var127, var128, var142, var144);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        f41730(var127, var140);
                        if (NIL != f41731(var127, var140)) {
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_145, var124);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_144, var124);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var145, var124);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41723() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = Environment.get_network_name((SubLObject)UNPROVIDED);
        final SubLObject var20 = module0110.$g1378$.getDynamicValue(var18);
        final SubLObject var21 = Sequences.cconcatenate(module0006.f203(var19), new SubLObject[] { $ic237$, module0006.f203(var20) });
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g166$.getGlobalValue());
        module0642.f39020(module0015.$g170$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic238$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var21) {
            module0642.f39020(module0015.$g168$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var21);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41724() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)$ic239$;
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g479$.getGlobalValue());
        module0642.f39020(module0015.$g481$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic240$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g482$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var19);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g483$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic241$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0015.$g533$.currentBinding(var18);
        try {
            module0015.$g533$.bind((SubLObject)T, var18);
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var20, var18);
        }
        module0642.f39020(module0015.$g480$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic232$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g178$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic242$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic233$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41725(final SubLObject var131) {
        module0642.f39020(module0015.$g189$.getGlobalValue());
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39019(var131);
        module0642.f39020(module0015.$g190$.getGlobalValue());
        module0642.f39020((SubLObject)TWO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0656.f39870((SubLObject)$ic243$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41726(final SubLObject var99, final SubLObject var100) {
        if (NIL != var99 || NIL != var100 || NIL != module0674.f41242()) {
            module0642.f39032((SubLObject)FOUR_INTEGER);
            f41676((SubLObject)$ic245$, (SubLObject)$ic246$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var99 && NIL != var100) {
                module0642.f39032((SubLObject)UNPROVIDED);
                f41677((SubLObject)$ic247$, (SubLObject)$ic248$, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var99 || NIL != var100) {
                module0642.f39032((SubLObject)UNPROVIDED);
                f41677((SubLObject)$ic250$, (SubLObject)$ic251$, (SubLObject)$ic252$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != var99 || NIL != var100) {
                module0642.f39032((SubLObject)UNPROVIDED);
                f41677((SubLObject)$ic253$, (SubLObject)$ic254$, (SubLObject)$ic255$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0674.f41242()) {
                module0642.f39032((SubLObject)UNPROVIDED);
                f41677((SubLObject)$ic256$, (SubLObject)$ic257$, (SubLObject)$ic258$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41733(final SubLObject var1) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41734(final SubLObject var153) {
        SubLObject var154 = var153;
        SubLObject var155 = (SubLObject)NIL;
        var155 = var154.first();
        while (NIL != var154) {
            if (NIL != f41733(var155)) {
                return (SubLObject)T;
            }
            var154 = var154.rest();
            var155 = var154.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41727(final SubLObject var99, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        module0016.f920((SubLObject)$ic259$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        final SubLObject var102 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var102) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var102);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var103 = module0015.$g533$.currentBinding(var101);
        try {
            module0015.$g533$.bind((SubLObject)T, var101);
            f41676((SubLObject)$ic262$, (SubLObject)$ic263$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var103, var101);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0642.f39020(module0015.$g224$.getGlobalValue());
        module0642.f39020(module0015.$g459$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var101), (SubLObject)$ic264$, Sequences.length(var100));
        module0642.f39020(module0015.$g460$.getGlobalValue());
        module0642.f39020(module0015.$g225$.getGlobalValue());
        final SubLObject var104 = (SubLObject)((NIL != var99) ? $ic265$ : $ic266$);
        module0016.f908((SubLObject)$ic259$, var104, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic259$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var103 = module0015.$g533$.currentBinding(var101);
        try {
            module0015.$g533$.bind((SubLObject)T, var101);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ONE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)TWO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_156 = module0015.$g533$.currentBinding(var101);
            try {
                module0015.$g533$.bind((SubLObject)T, var101);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_157 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_158 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var101);
                        module0642.f39021((SubLObject)$ic269$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0656.f39837((SubLObject)$ic270$, (SubLObject)$ic271$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                    finally {
                        module0015.$g533$.rebind(var20_158, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)NIL;
                    var106 = var105.first();
                    while (NIL != var105) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_159 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var101);
                            module0656.f39837((SubLObject)$ic272$, var106, (SubLObject)$ic273$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0656.f39837((SubLObject)$ic274$, var106, (SubLObject)$ic275$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_160 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_161 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var101);
                        module0642.f39021((SubLObject)$ic216$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_161, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)NIL;
                    var106 = var105.first();
                    while (NIL != var105) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_162 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var101);
                            cb_query_browser_oc.f41964(var106, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_163 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_164 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var101);
                        module0642.f39021((SubLObject)$ic276$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_164, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)NIL;
                    var106 = var105.first();
                    while (NIL != var105) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_165 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var101);
                            f41689(var106, (SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_166 = module0015.$g533$.currentBinding(var101);
                try {
                    module0015.$g533$.bind((SubLObject)T, var101);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_167 = module0015.$g533$.currentBinding(var101);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var101);
                        module0642.f39021((SubLObject)$ic277$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_167, var101);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    SubLObject var105 = var100;
                    SubLObject var106 = (SubLObject)NIL;
                    var106 = var105.first();
                    while (NIL != var105) {
                        final SubLObject var107 = inference_datastructures_inference_oc.f25653(var106);
                        final SubLObject var108 = inference_datastructures_inference_oc.f25663(var106);
                        final SubLObject var109 = inference_datastructures_inference_oc.f25665(var106);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_168 = module0015.$g533$.currentBinding(var101);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var101);
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
                module0642.f39029((SubLObject)UNPROVIDED);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41728(final SubLObject var74, final SubLObject var169, final SubLObject var99) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic247$);
        final SubLObject var171 = inference_datastructures_inference_oc.f25583(var99);
        final SubLObject var172 = inference_datastructures_inference_oc.f25422(var99);
        module0642.f39069((SubLObject)$ic278$, var171, (SubLObject)UNPROVIDED);
        module0642.f39069((SubLObject)$ic279$, var172, (SubLObject)UNPROVIDED);
        module0016.f920((SubLObject)$ic279$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        final SubLObject var173 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var173) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var173);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var174 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)T, var170);
            f41676((SubLObject)$ic280$, (SubLObject)$ic249$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var174, var170);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0642.f39021((SubLObject)$ic281$);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic282$, var99, (SubLObject)$ic283$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic274$, var99, (SubLObject)$ic275$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic284$, var99, (SubLObject)$ic285$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic286$, var99, (SubLObject)$ic287$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic288$, var99, (SubLObject)$ic289$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic290$, var99, (SubLObject)$ic291$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var175 = (SubLObject)(($ic225$ == var74) ? $ic266$ : $ic265$);
        module0016.f908((SubLObject)$ic279$, var175, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic279$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var174 = module0015.$g533$.currentBinding(var170);
        try {
            module0015.$g533$.bind((SubLObject)T, var170);
            module0642.f39026((SubLObject)UNPROVIDED);
            cb_query_browser_oc.f41964(var99, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)TWO_INTEGER);
            f41735(var99, var169);
        }
        finally {
            module0015.$g533$.rebind(var174, var170);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41729(final SubLObject var74, final SubLObject var75, final SubLObject var76, final SubLObject var99, final SubLObject var100, SubLObject var140, SubLObject var142) {
        if (var140 == UNPROVIDED) {
            var140 = (SubLObject)NIL;
        }
        if (var142 == UNPROVIDED) {
            var142 = (SubLObject)NIL;
        }
        final SubLThread var143 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic250$);
        if (NIL != var140 && var140 != $ic225$) {
            module0642.f39021((SubLObject)$ic292$);
            module0656.f39804(var140, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)TWO_INTEGER);
        }
        module0016.f920((SubLObject)$ic293$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        final SubLObject var144 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var144) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var144);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var145 = module0015.$g533$.currentBinding(var143);
        try {
            module0015.$g533$.bind((SubLObject)T, var143);
            f41676((SubLObject)$ic294$, (SubLObject)$ic252$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var145, var143);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39032((SubLObject)FOUR_INTEGER);
        f41736(var99, var140, var142);
        SubLObject var146 = (SubLObject)$ic266$;
        if ($ic225$ == var74 && ((NIL != var99 && $ic295$ == inference_datastructures_inference_oc.f25420(var99) && NIL == $g5352$.getGlobalValue()) || (NIL == var99 && NIL != var100))) {
            var146 = (SubLObject)$ic265$;
        }
        module0016.f908((SubLObject)$ic293$, var146, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic293$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var145 = module0015.$g533$.currentBinding(var143);
        try {
            module0015.$g533$.bind((SubLObject)T, var143);
            f41737(var74, var75, var99);
            f41738(var74, var99);
            module0642.f39026((SubLObject)UNPROVIDED);
            f41739(var76, var99);
        }
        finally {
            module0015.$g533$.rebind(var145, var143);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41736(final SubLObject var99, SubLObject var140, SubLObject var142) {
        if (var140 == UNPROVIDED) {
            var140 = (SubLObject)NIL;
        }
        if (var142 == UNPROVIDED) {
            var142 = (SubLObject)NIL;
        }
        module0642.f39073((SubLObject)$ic296$);
        if (NIL != var99) {
            if (NIL != var99) {
                module0642.f39032((SubLObject)UNPROVIDED);
                f41679((SubLObject)$ic297$, (SubLObject)$ic298$, (SubLObject)$ic299$, (SubLObject)$ic300$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39032((SubLObject)UNPROVIDED);
            f41678((SubLObject)$ic301$, (SubLObject)$ic302$, (SubLObject)$ic303$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0642.f39032((SubLObject)UNPROVIDED);
            f41678((SubLObject)$ic304$, (SubLObject)$ic302$, (SubLObject)$ic303$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != var140 && var140 != $ic225$) {
            module0642.f39069((SubLObject)$ic305$, module0656.f39842(var140), (SubLObject)UNPROVIDED);
        }
        if (NIL != var142 && var142 != $ic225$) {
            module0642.f39069((SubLObject)$ic306$, module0656.f39842(var142), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41740() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        return $g5358$.getDynamicValue(var18);
    }
    
    public static SubLObject f41741() {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != module0161.$g2154$.getDynamicValue(var18)) {
            return $g5359$.getDynamicValue(var18);
        }
        return $ic312$;
    }
    
    public static SubLObject f41742(final SubLObject var75) {
        $g5359$.setDynamicValue(module0161.f10551(var75));
        return f41741();
    }
    
    public static SubLObject f41737(final SubLObject var74, SubLObject var75, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic314$);
        module0016.f920((SubLObject)$ic315$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g209$.getGlobalValue());
        module0642.f39019((SubLObject)$ic316$);
        module0642.f39020(module0015.$g210$.getGlobalValue());
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var101 = (SubLObject)$ic265$;
        module0016.f908((SubLObject)$ic315$, var101, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic315$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var102 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)T, var100);
            if ($ic225$ == var74) {
                if (NIL != var99) {
                    var75 = inference_datastructures_inference_oc.f25424(var99);
                }
                else {
                    var75 = f41741();
                }
            }
            else if ($ic225$ == var75) {
                var75 = (SubLObject)NIL;
            }
            else {
                var75 = var75;
            }
            final SubLObject var103 = (SubLObject)ConsesLow.list((SubLObject)$ic317$, $g5360$.getGlobalValue());
            module0657.f39992(var75, var103);
        }
        finally {
            module0015.$g533$.rebind(var102, var100);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41738(final SubLObject var74, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic318$);
        final SubLObject var101 = f41743(var74, var99);
        final SubLObject var102 = (SubLObject)$ic319$;
        final SubLObject var103 = (SubLObject)TEN_INTEGER;
        final SubLObject var104 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic320$, $ic321$, $ic322$, var102, $ic323$, var103, $ic324$, $ic325$, $ic326$, $ic327$, $ic328$, $ic329$, $ic330$, $ic214$ });
        final SubLObject var105 = Sequences.cconcatenate((SubLObject)$ic331$, module0006.f203(module0015.f793((SubLObject)UNPROVIDED)));
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (NIL != var105) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var105);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g158$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic332$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        SubLObject var106 = (SubLObject)ConsesLow.list((SubLObject)$ic334$, reader.bq_cons((SubLObject)$ic335$, var102), reader.bq_cons((SubLObject)$ic336$, var103));
        SubLObject var107 = (SubLObject)NIL;
        var107 = var106.first();
        while (NIL != var106) {
            SubLObject var109;
            final SubLObject var108 = var109 = var107;
            SubLObject var110 = (SubLObject)NIL;
            SubLObject var111 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var109, var108, (SubLObject)$ic333$);
            var110 = var109.first();
            var109 = (var111 = var109.rest());
            module0642.f39020(var110);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var111);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            var106 = var106.rest();
            var107 = var106.first();
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var112 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)T, var100);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0657.f40017((SubLObject)(($ic225$ == var101) ? NIL : var101), var104);
        }
        finally {
            module0015.$g533$.rebind(var112, var100);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41739(final SubLObject var76, final SubLObject var99) {
        final SubLThread var100 = SubLProcess.currentSubLThread();
        final SubLObject var101 = f41744(var76, var99);
        final SubLObject var102 = (SubLObject)((NIL != var101 && $ic225$ != var101) ? $ic266$ : $ic265$);
        module0016.f920((SubLObject)$ic337$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        module0642.f39032((SubLObject)UNPROVIDED);
        f41676((SubLObject)$ic338$, (SubLObject)$ic339$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0016.f908((SubLObject)$ic337$, var102, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic337$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var103 = module0015.$g533$.currentBinding(var100);
        try {
            module0015.$g533$.bind((SubLObject)T, var100);
            final SubLObject var104 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic320$, $ic340$, $ic324$, $ic325$, $ic326$, $ic327$, $ic328$, $ic329$, $ic323$, FIVE_INTEGER, $ic322$, $ic319$, $ic330$, $ic214$ });
            module0657.f40017((SubLObject)(($ic225$ == var101) ? NIL : var101), var104);
        }
        finally {
            module0015.$g533$.rebind(var103, var100);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41743(final SubLObject var179, final SubLObject var99) {
        final SubLObject var180 = (SubLObject)((NIL != var99) ? inference_datastructures_inference_oc.f25423(var99) : $ic225$);
        final SubLObject var181 = f41745(var179, var180);
        return var181;
    }
    
    public static SubLObject f41744(final SubLObject var179, final SubLObject var99) {
        final SubLObject var180 = (SubLObject)((NIL != var99 && NIL != inference_datastructures_inference_oc.f25482(var99)) ? inference_datastructures_inference_oc.f25482(var99) : $ic225$);
        final SubLObject var181 = f41745(var179, var180);
        return var181;
    }
    
    public static SubLObject f41745(final SubLObject var179, final SubLObject var180) {
        if ($ic225$ != var179) {
            return module0538.f33479(var179, (SubLObject)UNPROVIDED);
        }
        if ($ic225$ != var180) {
            return module0538.f33479(var180, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)$ic225$;
    }
    
    public static SubLObject f41730(final SubLObject var99, final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        module0642.f39085((SubLObject)$ic253$);
        module0016.f920((SubLObject)$ic342$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        final SubLObject var183 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var183) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var183);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)T, var182);
            f41676((SubLObject)$ic343$, (SubLObject)$ic344$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        if (NIL != var99 && (NIL != inference_datastructures_inference_oc.f25431(var99) || (NIL != $g5352$.getGlobalValue() && NIL != inference_datastructures_inference_oc.f25429(var99) && NIL != inference_datastructures_inference_oc.f25432(var99)))) {
            module0642.f39032((SubLObject)TWO_INTEGER);
            f41678((SubLObject)$ic345$, (SubLObject)$ic346$, (SubLObject)$ic347$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var185 = (SubLObject)$ic265$;
        module0016.f908((SubLObject)$ic342$, var185, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic342$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)T, var182);
            module0642.f39026((SubLObject)UNPROVIDED);
            f41678((SubLObject)$ic348$, (SubLObject)$ic349$, (SubLObject)$ic350$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            f41678((SubLObject)$ic351$, (SubLObject)$ic352$, (SubLObject)$ic353$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)TWO_INTEGER);
            f41678((SubLObject)$ic354$, (SubLObject)$ic355$, (SubLObject)$ic356$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var99 && NIL != inference_datastructures_inference_oc.f25615(var99)) {
                module0642.f39032((SubLObject)TWO_INTEGER);
                f41678((SubLObject)$ic357$, (SubLObject)$ic358$, (SubLObject)$ic359$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39026((SubLObject)TWO_INTEGER);
            f41746(var99, (SubLObject)T, (SubLObject)T, var181);
            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            f41747(var99, var181);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41748(final SubLObject var77) {
        $g5325$.setDynamicValue(var77);
        module0677.f41286();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41749(final SubLObject var182, SubLObject var183) {
        if (var183 == UNPROVIDED) {
            var183 = (SubLObject)NIL;
        }
        final SubLThread var184 = SubLProcess.currentSubLThread();
        final SubLObject var185 = conses_high.getf($g5325$.getDynamicValue(var184), var182, (SubLObject)NIL);
        if (NIL != var185) {
            return f41698(var185, var182);
        }
        return var183;
    }
    
    public static SubLObject f41750(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)$ic225$;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)$ic361$, (SubLObject)$ic362$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        return f41746(var99, var185, var186, var181);
    }
    
    public static SubLObject f41746(final SubLObject var99, final SubLObject var185, final SubLObject var186, final SubLObject var181) {
        f41751($g5361$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41747(final SubLObject var99, final SubLObject var181) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        module0016.f920((SubLObject)$ic363$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        final SubLObject var183 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var183) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var183);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)T, var182);
            f41676((SubLObject)$ic364$, (SubLObject)$ic365$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        final SubLObject var185 = (SubLObject)$ic265$;
        module0016.f908((SubLObject)$ic363$, var185, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic363$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var184 = module0015.$g533$.currentBinding(var182);
        try {
            module0015.$g533$.bind((SubLObject)T, var182);
            module0642.f39026((SubLObject)UNPROVIDED);
            f41752(var99, (SubLObject)T, (SubLObject)T, var181);
            module0642.f39026((SubLObject)UNPROVIDED);
            f41753(var99, (SubLObject)T, (SubLObject)T, var181, (SubLObject)NIL);
            module0642.f39026((SubLObject)UNPROVIDED);
            f41754(var99, (SubLObject)T, (SubLObject)T, var181, (SubLObject)NIL);
            module0642.f39026((SubLObject)UNPROVIDED);
            f41755(var99, (SubLObject)T, (SubLObject)T, var181);
        }
        finally {
            module0015.$g533$.rebind(var184, var182);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41756(final SubLObject var46) {
        return module0035.f2169(var46, $g5362$.getGlobalValue());
    }
    
    public static SubLObject f41757(final SubLObject var46) {
        return module0035.f2169(var46.first(), $g5362$.getGlobalValue());
    }
    
    public static SubLObject f41758(final SubLObject var187, final SubLObject var188) {
        if (NIL != var188) {
            return var187;
        }
        return Sequences.remove_if((SubLObject)$ic367$, var187, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41759() {
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = $g5363$.getGlobalValue();
        SubLObject var69 = (SubLObject)NIL;
        var69 = var68.first();
        while (NIL != var68) {
            if (NIL != f41757(var69)) {
                var67 = (SubLObject)ConsesLow.cons(var69, var67);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return module0035.f2344(var67, $g5362$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic368$));
    }
    
    public static SubLObject f41752(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)$ic225$;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)$ic369$, (SubLObject)$ic370$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41751(f41759(), var99, var185, var186, var181, (SubLObject)THREE_INTEGER, (SubLObject)T);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41753(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181, SubLObject var188) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)$ic225$;
        }
        if (var188 == UNPROVIDED) {
            var188 = (SubLObject)T;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)$ic372$, (SubLObject)$ic362$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41751($g5364$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)THREE_INTEGER, var188);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41754(final SubLObject var99, final SubLObject var185, final SubLObject var186, SubLObject var181, SubLObject var188) {
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)$ic225$;
        }
        if (var188 == UNPROVIDED) {
            var188 = (SubLObject)T;
        }
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)$ic374$, (SubLObject)$ic375$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41751($g5365$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)TWO_INTEGER, var188);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41755(final SubLObject var99, final SubLObject var185, final SubLObject var186, final SubLObject var181) {
        module0642.f39020(module0015.$g242$.getGlobalValue());
        f41676((SubLObject)$ic378$, (SubLObject)$ic379$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g243$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41751($g5369$.getGlobalValue(), var99, var185, var186, var181, (SubLObject)THREE_INTEGER, (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41760() {
        return $g5370$.getGlobalValue();
    }
    
    public static SubLObject f41751(SubLObject var190, final SubLObject var99, final SubLObject var185, final SubLObject var186, final SubLObject var181, SubLObject var191, SubLObject var188) {
        if (var191 == UNPROVIDED) {
            var191 = (SubLObject)TWO_INTEGER;
        }
        if (var188 == UNPROVIDED) {
            var188 = (SubLObject)T;
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        var190 = f41758(var190, var188);
        if (NIL != var190) {
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g353$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g354$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)THREE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var193 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)T, var192);
                while (NIL != conses_high.nthcdr(var191, var190)) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_192 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var192);
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
                        for (var194 = (SubLObject)NIL, var194 = (SubLObject)ZERO_INTEGER; var194.numL(var191); var194 = Numbers.add(var194, (SubLObject)ONE_INTEGER)) {
                            var195 = (var196 = var190);
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)$ic380$);
                            var197 = var196.rest();
                            var196 = var196.first();
                            var198 = (SubLObject)NIL;
                            var199 = (SubLObject)NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)$ic380$);
                            var198 = var196.first();
                            var196 = var196.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(var196, var195, (SubLObject)$ic380$);
                            var199 = var196.first();
                            var196 = var196.rest();
                            var200 = (SubLObject)(var196.isCons() ? var196.first() : NIL);
                            cdestructuring_bind.destructuring_bind_must_listp(var196, var195, (SubLObject)$ic380$);
                            var196 = var196.rest();
                            if (NIL == var196) {
                                var196 = var197;
                                var201 = (var190 = var196);
                                if (NIL != f41756(var198)) {
                                    var199 = f41761(var198, var199, var181);
                                }
                                var202 = f41762(var181, var99, var198, var199, var186);
                                if (!var194.isZero()) {
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    var20_193 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39032((SubLObject)FOUR_INTEGER);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_193, var192);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                }
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                var20_194 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    f41763(var198, var202, var199, var185, var200);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_194, var192);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(var195, (SubLObject)$ic380$);
                            }
                        }
                    }
                    finally {
                        module0015.$g533$.rebind(var20_192, var192);
                    }
                    module0642.f39020(module0015.$g365$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                final SubLObject var203 = Numbers.subtract(var191, Sequences.length(var190));
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_195 = module0015.$g533$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)T, var192);
                    SubLObject var204 = var190;
                    SubLObject var205 = (SubLObject)NIL;
                    var205 = var204.first();
                    while (NIL != var204) {
                        SubLObject var207;
                        final SubLObject var206 = var207 = var205;
                        SubLObject var208 = (SubLObject)NIL;
                        SubLObject var209 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)$ic381$);
                        var208 = var207.first();
                        var207 = var207.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var207, var206, (SubLObject)$ic381$);
                        var209 = var207.first();
                        var207 = var207.rest();
                        final SubLObject var210 = (SubLObject)(var207.isCons() ? var207.first() : NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(var207, var206, (SubLObject)$ic381$);
                        var207 = var207.rest();
                        if (NIL == var207) {
                            if (NIL != f41756(var208)) {
                                var209 = f41761(var208, var209, var181);
                            }
                            final SubLObject var202 = f41762(var181, var99, var208, var209, var186);
                            if (!var205.eql(var190.first())) {
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_196 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39032((SubLObject)FOUR_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_196, var192);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_197 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                f41763(var208, var202, var209, var185, var210);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_197, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var206, (SubLObject)$ic381$);
                        }
                        var204 = var204.rest();
                        var205 = var204.first();
                    }
                    if (!var203.isZero()) {
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        if (NIL != var203) {
                            module0642.f39020(module0015.$g371$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var203);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_198 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39032((SubLObject)TWO_INTEGER);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var193, var192);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41764(final SubLObject var48, final SubLObject var210, final SubLObject var197) {
        final SubLObject var211 = module0412.f28716(var210, var48, (SubLObject)$ic382$);
        if (var211 == $ic382$) {
            return var197;
        }
        return f41698(var211, var48);
    }
    
    public static SubLObject f41761(final SubLObject var48, final SubLObject var197, final SubLObject var138) {
        final SubLObject var198 = var138.isList() ? conses_high.getf(var138, (SubLObject)$ic58$, f41765()) : f41765();
        return f41764(var48, var198, var197);
    }
    
    public static SubLObject f41762(final SubLObject var181, final SubLObject var99, final SubLObject var48, final SubLObject var197, final SubLObject var186) {
        SubLObject var198 = f41766(var181, var99, var48, var197, var186);
        if (var48 == $ic77$ && NIL == inference_datastructures_inference_oc.f25648()) {
            var198 = (SubLObject)$ic137$;
        }
        return var198;
    }
    
    public static SubLObject f41766(final SubLObject var181, final SubLObject var99, final SubLObject var48, final SubLObject var197, final SubLObject var186) {
        final SubLThread var198 = SubLProcess.currentSubLThread();
        if ($ic225$ != var181) {
            final SubLObject var199 = conses_high.getf(var181, var48, (SubLObject)$ic225$);
            if ($ic225$ == var199) {
                return var197;
            }
            return f41698(var199, var48);
        }
        else {
            if (NIL != var99) {
                final SubLObject var200 = f41697(var197, var48);
                final SubLObject var201 = (NIL != var186) ? module0411.f28571(var99, var48, var200) : module0411.f28572(var99, var48, var200);
                return f41698(var201, var48);
            }
            if (NIL != $g5325$.getDynamicValue(var198)) {
                return f41749(var48, var197);
            }
            return var197;
        }
    }
    
    public static SubLObject f41763(final SubLObject var48, final SubLObject var47, final SubLObject var197, final SubLObject var185, final SubLObject var198) {
        final SubLThread var199 = SubLProcess.currentSubLThread();
        if (NIL == f41691(var48)) {
            module0642.f39020(module0015.$g240$.getGlobalValue());
            module0642.f39024(var48);
            module0642.f39020(module0015.$g241$.getGlobalValue());
        }
        else {
            final SubLObject var200 = f41692(var48);
            final SubLObject var201 = f41693(var48);
            final SubLObject var202 = f41694(var48);
            if (NIL == module0035.f2417(var47, var197)) {
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39020(module0015.$g240$.getGlobalValue());
                module0642.f39020(module0015.$g149$.getGlobalValue());
                module0642.f39020(module0015.$g152$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39048((SubLObject)$ic383$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var203 = module0015.$g533$.currentBinding(var199);
                try {
                    module0015.$g533$.bind((SubLObject)T, var199);
                    f41676((SubLObject)$ic384$, (SubLObject)$ic385$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var203, var199);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
                module0642.f39020(module0015.$g241$.getGlobalValue());
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL == module0038.f2610(var201)) {
                module0642.f39020(module0015.$g234$.getGlobalValue());
                f41673(var200, var201, var200, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g235$.getGlobalValue());
            }
            else {
                module0642.f39021(var200);
            }
            f41767(var48, var47, var185, var202, var198);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41767(final SubLObject var48, final SubLObject var47, final SubLObject var185, final SubLObject var62, final SubLObject var198) {
        final SubLObject var199 = module0642.f39102(var48);
        final SubLObject var200 = module0642.f39101(var48);
        final SubLObject var201 = Sequences.find((SubLObject)$ic45$, var62, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic368$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var202 = Sequences.length(var62);
        SubLObject var203 = (SubLObject)NIL;
        SubLObject var204 = (SubLObject)NIL;
        SubLObject var205 = (SubLObject)NIL;
        var203 = var62;
        var204 = var203.first();
        for (var205 = (SubLObject)ZERO_INTEGER; NIL != var203; var203 = var203.rest(), var204 = var203.first(), var205 = Numbers.add((SubLObject)ONE_INTEGER, var205)) {
            if ($ic58$ != var48 || !$g5355$.getGlobalValue().eql(var205)) {
                f41768(var48, var47, var185, var204, var205, var202, var199, var201, var200, var198);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41765() {
        return module0035.f2113(module0035.f2293($g5361$.getGlobalValue(), (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f41768(final SubLObject var48, final SubLObject var47, final SubLObject var185, final SubLObject var68, final SubLObject var216, final SubLObject var215, final SubLObject var212, final SubLObject var214, final SubLObject var213, final SubLObject var198) {
        final SubLThread var217 = SubLProcess.currentSubLThread();
        final SubLObject var218 = f41701(var48, var47, var68);
        if (NIL != var185 || NIL != var218) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            SubLObject var219 = (SubLObject)NIL;
            SubLObject var220 = (SubLObject)NIL;
            SubLObject var221 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var68, var68, (SubLObject)$ic43$);
            var219 = var68.first();
            SubLObject var222 = var68.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var222, var68, (SubLObject)$ic43$);
            var220 = var222.first();
            var222 = var222.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var222, var68, (SubLObject)$ic43$);
            var221 = var222.first();
            var222 = var222.rest();
            if (NIL == var222) {
                if (NIL != var185) {
                    final SubLObject var223 = module0642.f39130(var212);
                    if (ONE_INTEGER.numE(var215)) {
                        module0642.f39069(var223, var216, (SubLObject)UNPROVIDED);
                    }
                    else if (var48 == $ic58$) {
                        f41769(var223, var216, var218);
                    }
                    else if (NIL != f41756(var48)) {
                        if (NIL != var214) {
                            if ($ic45$ == var219) {
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
                    else if (NIL != var214) {
                        if ($ic45$ == var219) {
                            module0644.f39188(var223, var213, var216, var218);
                        }
                        else {
                            module0644.f39187(var223, var213, var216, var218);
                        }
                    }
                    else {
                        module0642.f39072(var223, var216, var218, (SubLObject)UNPROVIDED);
                    }
                }
                if ($ic45$ == var219) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    final SubLObject var224 = (SubLObject)((NIL != var218) ? print_high.prin1_to_string(var47) : NIL);
                    if (NIL != var185) {
                        SubLObject var224_225;
                        final SubLObject var222_223 = var224_225 = (SubLObject)((NIL != var198) ? var198 : $ic386$);
                        SubLObject var225 = (SubLObject)NIL;
                        SubLObject var226 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var224_225, var222_223, (SubLObject)$ic387$);
                        var225 = var224_225.first();
                        var224_225 = var224_225.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var224_225, var222_223, (SubLObject)$ic387$);
                        var226 = var224_225.first();
                        var224_225 = var224_225.rest();
                        if (NIL == var224_225) {
                            final SubLObject var227 = var225;
                            if (var227.eql((SubLObject)$ic388$)) {
                                module0642.f39075(var213, var224, var226);
                            }
                            else {
                                module0642.f39075(var213, var224, (SubLObject)UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var222_223, (SubLObject)$ic387$);
                        }
                    }
                    else {
                        module0642.f39019(var224);
                    }
                }
                module0642.f39032((SubLObject)UNPROVIDED);
                final SubLObject var228 = module0015.$g533$.currentBinding(var217);
                try {
                    module0015.$g533$.bind((SubLObject)makeBoolean(var48 != $ic58$), var217);
                    module0642.f39019(var221);
                }
                finally {
                    module0015.$g533$.rebind(var228, var217);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var68, (SubLObject)$ic43$);
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41773(final SubLObject var228) {
        final SubLThread var229 = SubLProcess.currentSubLThread();
        PrintLow.format(module0015.$g131$.getDynamicValue(var229), $g5371$.getGlobalValue());
        SubLObject var230 = var228;
        SubLObject var231 = (SubLObject)NIL;
        var231 = var230.first();
        while (NIL != var230) {
            SubLObject var233;
            final SubLObject var232 = var233 = var231;
            SubLObject var234 = (SubLObject)NIL;
            SubLObject var235 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var233, var232, (SubLObject)$ic393$);
            var234 = var233.first();
            var233 = (var235 = var233.rest());
            if (var235.isCons()) {
                SubLObject var234_235;
                final SubLObject var232_233 = var234_235 = var235;
                SubLObject var236 = (SubLObject)NIL;
                SubLObject var237 = (SubLObject)NIL;
                SubLObject var238 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)$ic394$);
                var236 = var234_235.first();
                var234_235 = var234_235.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)$ic394$);
                var237 = var234_235.first();
                var234_235 = var234_235.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var234_235, var232_233, (SubLObject)$ic394$);
                var238 = var234_235.first();
                var234_235 = var234_235.rest();
                if (NIL == var234_235) {
                    PrintLow.format(module0015.$g131$.getDynamicValue(var229), $g5373$.getGlobalValue(), var234, var236);
                    PrintLow.format(module0015.$g131$.getDynamicValue(var229), $g5374$.getGlobalValue(), var237, var238);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var232_233, (SubLObject)$ic394$);
                }
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var229), $g5373$.getGlobalValue(), var234, var235);
            }
            var230 = var230.rest();
            var231 = var230.first();
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var229), $g5372$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41774(final SubLObject var239, final SubLObject var47) {
        return f41773(module0035.f2063((SubLObject)NIL, var239, var47, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f41775(final SubLObject var51, final SubLObject var47) {
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        var52 = f41694(var51);
        var53 = var52.first();
        for (var54 = (SubLObject)ZERO_INTEGER; NIL != var52; var52 = var52.rest(), var53 = var52.first(), var54 = Numbers.add((SubLObject)ONE_INTEGER, var54)) {
            if (NIL != f41701(var51, var47, var53)) {
                return var54;
            }
        }
        return Errors.error((SubLObject)$ic395$, var51, var47);
    }
    
    public static SubLObject f41776(final SubLObject var240) {
        SubLObject var241 = (SubLObject)NIL;
        SubLObject var242 = $g5362$.getGlobalValue();
        SubLObject var243 = (SubLObject)NIL;
        var243 = var242.first();
        while (NIL != var242) {
            final SubLObject var244 = f41777(var243);
            final SubLObject var245 = f41764(var243, var240, (SubLObject)$ic396$);
            final SubLObject var246 = f41775(var243, var245);
            final SubLObject var247 = f41694(var243);
            final SubLObject var248 = ConsesLow.nth(var246, var247);
            final SubLObject var250;
            final SubLObject var249 = var250 = var248.first();
            if (var250.eql((SubLObject)$ic44$)) {
                final SubLObject var251 = Sequences.find((SubLObject)$ic45$, var247, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic368$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var251) {
                    final SubLObject var252 = module0642.f39101(var243);
                    var241 = module0035.f2063(var241, var244, (SubLObject)ConsesLow.list(var246, var252, (SubLObject)$ic6$), (SubLObject)UNPROVIDED);
                }
                else {
                    var241 = module0035.f2063(var241, var244, var246, (SubLObject)UNPROVIDED);
                }
            }
            else if (var250.eql((SubLObject)$ic45$)) {
                final SubLObject var253 = module0642.f39101(var243);
                var241 = module0035.f2063(var241, var244, (SubLObject)ConsesLow.list(var246, var253, var245), (SubLObject)UNPROVIDED);
            }
            else {
                Errors.error((SubLObject)$ic397$, var249);
            }
            var242 = var242.rest();
            var243 = var242.first();
        }
        f41773(var241);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41769(final SubLObject var220, final SubLObject var216, final SubLObject var217) {
        final SubLObject var221 = conses_high.second(ConsesLow.nth(var216, f41694((SubLObject)$ic58$)));
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        f41776(var221);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41778() {
        SubLObject var243 = f41777($g5362$.getGlobalValue().first());
        SubLObject var244 = $g5362$.getGlobalValue().rest();
        SubLObject var245 = (SubLObject)NIL;
        var245 = var244.first();
        while (NIL != var244) {
            var243 = Sequences.cconcatenate(var243, new SubLObject[] { $ic398$, f41777(var245) });
            var244 = var244.rest();
            var245 = var244.first();
        }
        return var243;
    }
    
    public static SubLObject f41777(final SubLObject var48) {
        return module0038.f2659((SubLObject)$ic399$, (SubLObject)$ic400$, module0642.f39130(module0642.f39102(var48)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41779(final SubLObject var48) {
        return module0038.f2659((SubLObject)$ic399$, (SubLObject)$ic400$, module0642.f39130(module0642.f39101(var48)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41772(final SubLObject var220, final SubLObject var216, final SubLObject var217) {
        final SubLObject var221 = f41777((SubLObject)$ic58$);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        f41774(var221, $g5355$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41771(final SubLObject var220, final SubLObject var213, final SubLObject var216, final SubLObject var217) {
        final SubLObject var221 = f41777((SubLObject)$ic58$);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        f41774(var221, (SubLObject)ConsesLow.list($g5355$.getGlobalValue(), var213, (SubLObject)$ic6$));
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41770(final SubLObject var220, final SubLObject var213, final SubLObject var216, final SubLObject var217) {
        final SubLThread var221 = SubLProcess.currentSubLThread();
        final SubLObject var222 = f41777((SubLObject)$ic58$);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g314$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var220) {
            module0642.f39020(module0015.$g302$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var220);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var216) {
            module0642.f39020(module0015.$g307$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39019(var216);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var217) {
            module0642.f39046(module0015.$g296$.getGlobalValue());
        }
        module0642.f39032((SubLObject)ONE_INTEGER);
        PrintLow.format(module0015.$g131$.getDynamicValue(var221), $g5375$.getGlobalValue(), new SubLObject[] { var213, var222, $g5355$.getGlobalValue() });
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41731(final SubLObject var99, final SubLObject var138) {
        return (SubLObject)makeBoolean(NIL != module0674.f41242() || (NIL != var99 && (NIL != inference_datastructures_inference_oc.f25610(var99) || NIL != inference_datastructures_inference_oc.f25611(var99)) && $ic225$ != var138 && (module0360.f23984(var138, (SubLObject)$ic402$).isList() || module0360.f23984(var138, (SubLObject)$ic403$).isList())));
    }
    
    public static SubLObject f41780(final SubLObject var99, final SubLObject var138) {
        SubLObject var139 = (SubLObject)$ic225$;
        SubLObject var140 = (SubLObject)$ic225$;
        SubLObject var141 = (SubLObject)$ic225$;
        SubLObject var142 = (SubLObject)$ic225$;
        if (NIL != var99) {
            var139 = inference_datastructures_inference_oc.f25610(var99);
            var140 = inference_datastructures_inference_oc.f25611(var99);
        }
        if ($ic225$ != var138) {
            var141 = module0360.f23984(var138, (SubLObject)$ic402$);
            var142 = module0360.f23984(var138, (SubLObject)$ic403$);
        }
        f41781(var139);
        f41781(var140);
        f41781(var141);
        f41781(var142);
        final SubLObject var143 = module0674.f41242();
        SubLObject var144 = (SubLObject)$ic404$;
        SubLObject var145 = (SubLObject)$ic405$;
        if ($ic225$ != var138) {
            var144 = var141;
            var145 = var142;
        }
        else if (NIL != var99) {
            var144 = var139;
            var145 = var140;
        }
        return Values.values(var143, var144, var145);
    }
    
    public static SubLObject f41781(final SubLObject var252) {
        if (var252.isList()) {
            SubLObject var253 = var252;
            SubLObject var254 = (SubLObject)NIL;
            var254 = var253.first();
            while (NIL != var253) {
                module0674.f41243(var254);
                var253 = var253.rest();
                var254 = var253.first();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41732(final SubLObject var99, final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        var139.resetMultipleValues();
        final SubLObject var140 = f41780(var99, var138);
        final SubLObject var141 = var139.secondMultipleValue();
        final SubLObject var142 = var139.thirdMultipleValue();
        var139.resetMultipleValues();
        module0642.f39085((SubLObject)$ic256$);
        module0016.f920((SubLObject)$ic406$, (SubLObject)$ic260$, (SubLObject)$ic261$);
        final SubLObject var143 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var143) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var143);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var144 = module0015.$g533$.currentBinding(var139);
        try {
            module0015.$g533$.bind((SubLObject)T, var139);
            f41676((SubLObject)$ic407$, (SubLObject)$ic408$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var144, var139);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        final SubLObject var145 = (SubLObject)((NIL != var140) ? $ic266$ : $ic265$);
        module0016.f908((SubLObject)$ic406$, var145, (SubLObject)$ic267$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic406$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var144 = module0015.$g533$.currentBinding(var139);
        try {
            module0015.$g533$.bind((SubLObject)T, var139);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ONE_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_254 = module0015.$g533$.currentBinding(var139);
            try {
                module0015.$g533$.bind((SubLObject)T, var139);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_255 = module0015.$g533$.currentBinding(var139);
                try {
                    module0015.$g533$.bind((SubLObject)T, var139);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic410$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_256 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var139);
                        f41676((SubLObject)$ic411$, (SubLObject)$ic412$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0644.f39209((SubLObject)$ic413$, (SubLObject)$ic414$, (SubLObject)$ic415$, (SubLObject)$ic416$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_256, var139);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic417$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_257 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var139);
                        f41676((SubLObject)$ic418$, (SubLObject)$ic419$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0644.f39209((SubLObject)$ic420$, (SubLObject)$ic414$, (SubLObject)$ic415$, (SubLObject)$ic421$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39837((SubLObject)$ic422$, (SubLObject)$ic423$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_257, var139);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic424$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_258 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var139);
                        f41676((SubLObject)$ic425$, (SubLObject)$ic426$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0644.f39209((SubLObject)$ic427$, (SubLObject)$ic414$, (SubLObject)$ic415$, (SubLObject)$ic428$);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_258, var139);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g374$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic429$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_259 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var139);
                        module0642.f39021((SubLObject)$ic430$);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                SubLObject var146 = (SubLObject)NIL;
                SubLObject var147 = (SubLObject)NIL;
                SubLObject var148 = (SubLObject)NIL;
                var146 = var140;
                var147 = var146.first();
                for (var148 = (SubLObject)ZERO_INTEGER; NIL != var146; var146 = var146.rest(), var147 = var146.first(), var148 = Numbers.add((SubLObject)ONE_INTEGER, var148)) {
                    module0642.f39020(module0015.$g364$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_260 = module0015.$g533$.currentBinding(var139);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var139);
                        final SubLObject var149 = f41782(var147, var141, var142);
                        final SubLObject var150 = f41783(var148);
                        final SubLObject var151 = module0642.f39130(var150);
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic410$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_261 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var139);
                            module0642.f39072(var151, (SubLObject)$ic416$, Equality.eq(var149, (SubLObject)$ic431$), (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_261, var139);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic417$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_262 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var139);
                            module0642.f39072(var151, (SubLObject)$ic421$, Equality.eq(var149, (SubLObject)$ic432$), (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0656.f39837((SubLObject)$ic433$, var147, (SubLObject)$ic434$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_262, var139);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g370$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic424$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_263 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var139);
                            module0642.f39072(var151, (SubLObject)$ic428$, Equality.eq(var149, (SubLObject)$ic435$), (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_263, var139);
                        }
                        module0642.f39020(module0015.$g361$.getGlobalValue());
                        module0642.f39020(module0015.$g360$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g374$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic429$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_264 = module0015.$g533$.currentBinding(var139);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var139);
                            module0656.f39916(var147, (SubLObject)T, (SubLObject)T);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
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
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41783(final SubLObject var261) {
        return Sequences.cconcatenate((SubLObject)$ic436$, module0006.f203(var261));
    }
    
    public static SubLObject f41782(final SubLObject var260, final SubLObject var250, final SubLObject var251) {
        if ($ic404$ == var250) {
            if ($ic405$ == var251) {
                return (SubLObject)$ic432$;
            }
            if (NIL != module0004.f104(var260, var251, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)$ic431$;
            }
            return (SubLObject)$ic432$;
        }
        else {
            if (NIL != module0004.f104(var260, var250, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)$ic435$;
            }
            return (SubLObject)$ic432$;
        }
    }
    
    public static SubLObject f41784(final SubLObject var116) {
        final SubLObject var117 = module0674.f41242();
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121 = (SubLObject)NIL;
        SubLObject var122 = (SubLObject)NIL;
        SubLObject var123 = (SubLObject)NIL;
        var121 = var117;
        var122 = var121.first();
        for (var123 = (SubLObject)ZERO_INTEGER; NIL != var121; var121 = var121.rest(), var122 = var121.first(), var123 = Numbers.add((SubLObject)ONE_INTEGER, var123)) {
            final SubLObject var124 = f41783(var123);
            final SubLObject var125 = module0642.f39132(var124, var116);
            if (var125.equal((SubLObject)$ic416$)) {
                var118 = (SubLObject)ConsesLow.cons(var122, var118);
            }
            else if (var125.equal((SubLObject)$ic428$)) {
                var120 = (SubLObject)ConsesLow.cons(var122, var120);
            }
            else {
                var119 = (SubLObject)ConsesLow.cons(var122, var119);
            }
        }
        var118 = Sequences.nreverse(var118);
        var120 = Sequences.nreverse(var120);
        if (NIL != var120) {
            return Values.values(var120, (SubLObject)$ic405$);
        }
        if (NIL != var118) {
            return Values.values((SubLObject)$ic404$, var118);
        }
        return Values.values((SubLObject)$ic404$, (SubLObject)$ic405$);
    }
    
    public static SubLObject f41785(final SubLObject var107) {
        module0642.f39085((SubLObject)$ic253$);
        f41676((SubLObject)$ic378$, (SubLObject)$ic437$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)TWO_INTEGER);
        final SubLObject var108 = module0361.f24178(var107);
        f41751($g5369$.getGlobalValue(), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var108, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic438$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic439$);
        module0656.f39813(module0361.f24176(var107));
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic440$);
        module0656.f39837((SubLObject)$ic441$, var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39021((SubLObject)$ic442$);
        module0656.f39837((SubLObject)$ic443$, var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != module0361.f24333(var107)) {
            module0656.f39837((SubLObject)$ic444$, var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0361.f24335(var107)) {
            module0656.f39837((SubLObject)$ic445$, var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41786(final SubLObject var116) {
        final SubLObject var117 = module0656.f39970(var116);
        if (NIL == assertion_handles_oc.f11035(var117)) {
            return module0656.f39789((SubLObject)$ic446$, var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0178.f11290(var117)) {
            return module0656.f39789((SubLObject)$ic447$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0674.f41244(var117);
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41787(final SubLObject var271, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic434$;
        }
        assert NIL != assertion_handles_oc.f11035(var271) : var271;
        final SubLObject var273 = module0656.f39832((SubLObject)$ic11$);
        if ($ic450$.isString()) {
            final SubLObject var274 = module0644.f39202((SubLObject)$ic450$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var272), (SubLObject)$ic451$, assertion_handles_oc.f11025(var271));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var273) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var273);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var274);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var275 = module0015.$g533$.currentBinding(var272);
            try {
                module0015.$g533$.bind((SubLObject)T, var272);
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
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0674.f41245();
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41789(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic423$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        if ($ic454$.isString()) {
            final SubLObject var25 = module0644.f39202((SubLObject)$ic454$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)$ic455$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var24) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var24);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var26 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var26, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41790(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = f41791(var116);
        SubLObject var119 = (SubLObject)NIL;
        SubLObject var120 = (SubLObject)NIL;
        final SubLObject var121 = var118;
        if (var121.eql((SubLObject)$ic457$) || var121.eql((SubLObject)$ic458$)) {
            var117.resetMultipleValues();
            final SubLObject var275_276 = f41792(var116, (SubLObject)T, (SubLObject)UNPROVIDED);
            final SubLObject var277_278 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var275_276;
            var120 = var277_278;
        }
        else if (var121.eql((SubLObject)$ic459$) || var121.eql((SubLObject)$ic460$)) {
            var117.resetMultipleValues();
            final SubLObject var279_280 = f41792(var116, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            final SubLObject var281_282 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var279_280;
            var120 = var281_282;
        }
        else if (var121.eql((SubLObject)$ic461$)) {
            if (NIL != $g5325$.getDynamicValue(var117)) {
                var119 = $g5325$.getDynamicValue(var117);
            }
            else {
                var119 = (SubLObject)$ic225$;
            }
        }
        else if (var121.eql((SubLObject)$ic462$)) {
            var117.resetMultipleValues();
            final SubLObject var283_284 = f41792(var116, (SubLObject)NIL, (SubLObject)T);
            final SubLObject var285_286 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var283_284;
            var120 = var285_286;
        }
        else {
            if (!var121.eql((SubLObject)$ic463$)) {
                return module0656.f39789((SubLObject)$ic464$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var117.resetMultipleValues();
            final SubLObject var287_288 = f41792(var116, (SubLObject)NIL, (SubLObject)T);
            final SubLObject var289_290 = var117.secondMultipleValue();
            var117.resetMultipleValues();
            var119 = var287_288;
            var120 = var289_290;
        }
        if (NIL != var120) {
            return module0656.f39789((SubLObject)$ic465$, var120, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if ($ic457$ == var118) {
            final SubLObject var122 = f41793(var116);
            if (NIL == inference_datastructures_inference_oc.f25431(var122)) {
                return module0656.f39789((SubLObject)$ic466$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f41704(var122, var119);
            return f41721((SubLObject)UNPROVIDED);
        }
        else {
            if ($ic460$ == var118) {
                f41748(var119);
                return f41721((SubLObject)ConsesLow.list((SubLObject)$ic227$, var119));
            }
            if ($ic461$ == var118) {
                return f41721((SubLObject)ConsesLow.list((SubLObject)$ic227$, var119));
            }
            if ($ic462$ == var118) {
                return f41721((SubLObject)$ic467$);
            }
            var117.resetMultipleValues();
            SubLObject var123 = module0657.f40003(var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var124 = var117.secondMultipleValue();
            final SubLObject var125 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (NIL != var124) {
                return module0657.f40013(var124, var125);
            }
            var117.resetMultipleValues();
            SubLObject var126 = f41794(var116, (SubLObject)$ic468$);
            final SubLObject var127 = var117.secondMultipleValue();
            final SubLObject var128 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (NIL != var127) {
                return module0657.f40031(var127, var128, (SubLObject)$ic469$);
            }
            var117.resetMultipleValues();
            SubLObject var129 = f41794(var116, (SubLObject)$ic470$);
            final SubLObject var130 = var117.secondMultipleValue();
            final SubLObject var131 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (NIL != var130) {
                return module0657.f40031(var130, var131, (SubLObject)$ic471$);
            }
            var117.resetMultipleValues();
            final SubLObject var132 = f41795(var116);
            final SubLObject var133 = var117.secondMultipleValue();
            final SubLObject var134 = var117.thirdMultipleValue();
            var117.resetMultipleValues();
            if (NIL != var134) {
                return module0656.f39789((SubLObject)$ic465$, var134, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            if (var135.eql((SubLObject)$ic459$)) {
                final SubLObject var136 = f41703(var126, var123, var129, var119);
                if (NIL != var132) {
                    module0684.f41926(var136, var132);
                }
                if (NIL != var133) {
                    module0686.f42033(var136, var133);
                }
                f41712(var136);
                return f41721((SubLObject)UNPROVIDED);
            }
            if (var135.eql((SubLObject)$ic458$)) {
                final SubLObject var137 = f41793(var116);
                final SubLObject var138 = f41702(var137, var126, var123, var129, var119);
                f41712(var138);
                return f41721((SubLObject)UNPROVIDED);
            }
            if (var135.eql((SubLObject)$ic463$)) {
                final SubLObject var137 = f41793(var116);
                final SubLObject var139 = module0412.f28692(var137);
                return f41797(var126, var123, var139, var129);
            }
            return module0656.f39789((SubLObject)$ic464$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
    }
    
    public static SubLObject f41794(final SubLObject var116, SubLObject var308) {
        if (var308 == UNPROVIDED) {
            var308 = (SubLObject)NIL;
        }
        final SubLThread var309 = SubLProcess.currentSubLThread();
        var309.resetMultipleValues();
        final SubLObject var310 = module0657.f40022(var116, var308);
        final SubLObject var311 = var309.secondMultipleValue();
        final SubLObject var312 = var309.thirdMultipleValue();
        var309.resetMultipleValues();
        if (NIL == var311) {}
        return Values.values(var310, var311, var312);
    }
    
    public static SubLObject f41796(SubLObject var74, final SubLObject var75, final SubLObject var76, SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5094$.getDynamicValue(var78) && NIL != module0202.f12691(var74, (SubLObject)UNPROVIDED)) {
            var77 = conses_high.putf(var77, (SubLObject)$ic158$, (SubLObject)T);
            SubLObject var79 = module0360.f23840(var77);
            var79 = Numbers.add(var79, (SubLObject)ONE_INTEGER);
            var77 = conses_high.putf(var77, (SubLObject)$ic65$, var79);
            final SubLObject var80 = module0279.f18513(var74, (SubLObject)$ic474$);
            var74 = (SubLObject)ConsesLow.list($ic475$, var74, var80);
        }
        return Values.values(var74, var75, var76, var77);
    }
    
    public static SubLObject f41791(final SubLObject var116) {
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic347$, var116))) {
            return (SubLObject)$ic457$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic303$, var116))) {
            return (SubLObject)$ic459$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic300$, var116))) {
            return (SubLObject)$ic458$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic350$, var116))) {
            return (SubLObject)$ic460$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic353$, var116))) {
            return (SubLObject)$ic461$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic356$, var116))) {
            return (SubLObject)$ic462$;
        }
        if (NIL != module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic359$, var116))) {
            return (SubLObject)$ic463$;
        }
        return (SubLObject)$ic476$;
    }
    
    public static SubLObject f41793(final SubLObject var116) {
        final SubLObject var117 = module0642.f39104((SubLObject)$ic278$, var116);
        final SubLObject var118 = module0642.f39104((SubLObject)$ic279$, var116);
        return f41672(var117, var118);
    }
    
    public static SubLObject f41792(final SubLObject var116, final SubLObject var312, SubLObject var313) {
        if (var313 == UNPROVIDED) {
            var313 = (SubLObject)NIL;
        }
        final SubLThread var314 = SubLProcess.currentSubLThread();
        var314.resetMultipleValues();
        SubLObject var315 = f41798(var116, var312, var313);
        final SubLObject var316 = var314.secondMultipleValue();
        var314.resetMultipleValues();
        if (NIL != var316) {
            return Values.values((SubLObject)NIL, var316);
        }
        var314.resetMultipleValues();
        final SubLObject var317 = f41784(var116);
        final SubLObject var318 = var314.secondMultipleValue();
        var314.resetMultipleValues();
        var315 = conses_high.putf(var315, (SubLObject)$ic402$, var317);
        var315 = conses_high.putf(var315, (SubLObject)$ic403$, var318);
        return Values.values(var315, var316);
    }
    
    public static SubLObject f41798(final SubLObject var116, final SubLObject var312, final SubLObject var313) {
        final SubLThread var314 = SubLProcess.currentSubLThread();
        SubLObject var316;
        final SubLObject var315 = var316 = f41707();
        final SubLObject var317 = (SubLObject)(var316.isCons() ? var316.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var316, var315, (SubLObject)$ic208$);
        final SubLObject var318;
        var316 = (var318 = var316.rest());
        SubLObject var319 = (SubLObject)NIL;
        SubLObject var320 = f41760();
        SubLObject var321 = (SubLObject)NIL;
        var321 = var320.first();
        while (NIL != var320) {
            var314.resetMultipleValues();
            final SubLObject var322 = f41799(var321, var116, var317, var312, var313);
            final SubLObject var323 = var314.secondMultipleValue();
            var314.resetMultipleValues();
            if (NIL != var323) {
                return Values.values((SubLObject)NIL, var323);
            }
            var319 = (SubLObject)ConsesLow.cons(var321, var319);
            var319 = (SubLObject)ConsesLow.cons(var322, var319);
            var320 = var320.rest();
            var321 = var320.first();
        }
        return Values.values(Sequences.nreverse(var319), (SubLObject)NIL);
    }
    
    public static SubLObject f41799(final SubLObject var51, final SubLObject var116, final SubLObject var99, final SubLObject var312, final SubLObject var313) {
        final SubLThread var314 = SubLProcess.currentSubLThread();
        if (NIL == f41691(var51)) {
            return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f205(var51), (SubLObject)$ic477$));
        }
        if (NIL != var313) {
            if (NIL != var99) {
                return Values.values(module0411.f28572(var99, var51, (SubLObject)NIL), (SubLObject)NIL);
            }
            final SubLObject var315 = Sequences.find(var51, $g5363$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic368$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var315) {
                return f41697(conses_high.second(var315), var51);
            }
        }
        final SubLObject var316 = f41692(var51);
        final SubLObject var317 = f41694(var51);
        final SubLObject var318 = module0642.f39102(var51);
        SubLObject var319 = (SubLObject)NIL;
        final SubLObject var320 = module0015.$g539$.currentBinding(var314);
        try {
            module0015.$g539$.bind(module0015.f800(var116), var314);
            var319 = module0642.f39132(var318, var116);
        }
        finally {
            module0015.$g539$.rebind(var320, var314);
        }
        if (NIL != var319) {
            final SubLObject var321 = ConsesLow.nth(reader.read_from_string_ignoring_errors(var319, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var317);
            SubLObject var323;
            final SubLObject var322 = var323 = var321;
            SubLObject var324 = (SubLObject)NIL;
            SubLObject var189_322 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var323, var322, (SubLObject)$ic478$);
            var324 = var323.first();
            var323 = var323.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var323, var322, (SubLObject)$ic478$);
            var189_322 = var323.first();
            var323 = var323.rest();
            final SubLObject var325 = (SubLObject)(var323.isCons() ? var323.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var323, var322, (SubLObject)$ic478$);
            var323 = var323.rest();
            if (NIL == var323) {
                final SubLObject var326 = var324;
                if (var326.eql((SubLObject)$ic44$)) {
                    return Values.values(f41697(var189_322, var51), (SubLObject)NIL);
                }
                if (var326.eql((SubLObject)$ic45$)) {
                    final SubLObject var327 = module0642.f39101(var51);
                    final SubLObject var328 = module0642.f39104(var327, var116);
                    if (NIL == var328) {
                        return Values.values((SubLObject)NIL, Sequences.cconcatenate((SubLObject)$ic479$, new SubLObject[] { module0006.f203(var316), $ic480$ }));
                    }
                    if (NIL != Functions.funcall(var189_322, var328)) {
                        return Values.values(var328, (SubLObject)NIL);
                    }
                    final SubLObject var329 = reader.read_from_string_ignoring_errors(var328, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == Functions.funcall(var189_322, var329)) {
                        return Values.values((SubLObject)NIL, Sequences.cconcatenate((SubLObject)$ic481$, new SubLObject[] { module0006.f203(var316), $ic482$ }));
                    }
                    return Values.values(f41697(var329, var51), (SubLObject)NIL);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var322, (SubLObject)$ic478$);
            }
            return (SubLObject)NIL;
        }
        if (NIL != var312) {
            return Values.values(module0411.f28572(var99, var51, (SubLObject)NIL), (SubLObject)NIL);
        }
        if ($ic58$ == var51) {
            return Values.values(module0360.$g3035$.getGlobalValue(), (SubLObject)NIL);
        }
        return Values.values((SubLObject)NIL, Sequences.cconcatenate((SubLObject)$ic483$, new SubLObject[] { module0006.f203(var316), $ic480$ }));
    }
    
    public static SubLObject f41795(final SubLObject var116) {
        final SubLObject var117 = module0642.f39104((SubLObject)$ic305$, var116);
        final SubLObject var118 = module0642.f39104((SubLObject)$ic306$, var116);
        SubLObject var119 = (SubLObject)NIL;
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121 = (SubLObject)NIL;
        if (NIL != var117) {
            var119 = module0656.f39943(var117, (SubLObject)UNPROVIDED);
            if (NIL != var119) {
                if (NIL == module0423.f29532(var119)) {
                    var121 = Sequences.cconcatenate((SubLObject)$ic484$, new SubLObject[] { module0006.f203(var117), $ic485$ });
                }
            }
            else {
                var121 = Sequences.cconcatenate((SubLObject)$ic486$, new SubLObject[] { module0006.f203(var117), $ic487$ });
            }
        }
        if (NIL != var118) {
            var120 = module0656.f39943(var118, (SubLObject)UNPROVIDED);
            if (NIL != var120) {
                if (NIL == module0633.f38716(var120, (SubLObject)UNPROVIDED)) {
                    var121 = Sequences.cconcatenate((SubLObject)$ic484$, new SubLObject[] { module0006.f203(var118), $ic488$ });
                }
            }
            else {
                var121 = Sequences.cconcatenate((SubLObject)$ic489$, new SubLObject[] { module0006.f203(var118), $ic487$ });
            }
        }
        return Values.values(var119, var120, var121);
    }
    
    public static SubLObject f41800(final SubLObject var74, SubLObject var75, SubLObject var181) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)NIL;
        }
        final SubLThread var182 = SubLProcess.currentSubLThread();
        var181 = conses_high.copy_list(var181);
        var181 = conses_high.putf(var181, (SubLObject)$ic490$, (SubLObject)T);
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
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        if (var138 == UNPROVIDED) {
            var138 = (SubLObject)NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)$ic221$, (SubLObject)$ic491$, (SubLObject)$ic224$, var74, (SubLObject)$ic226$, var75, (SubLObject)$ic227$, var138));
    }
    
    public static SubLObject f41803(final SubLObject var74, SubLObject var75, SubLObject var138) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        if (var138 == UNPROVIDED) {
            var138 = (SubLObject)NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)$ic221$, (SubLObject)$ic492$, (SubLObject)$ic224$, var74, (SubLObject)$ic226$, var75, (SubLObject)$ic227$, var138));
    }
    
    public static SubLObject f41804(final SubLObject var271, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic493$;
        }
        assert NIL != assertion_handles_oc.f11035(var271) : var271;
        final SubLObject var273 = assertion_handles_oc.f11025(var271);
        final SubLObject var274 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var272), (SubLObject)$ic494$, var273);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var274) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var274);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var275 = module0015.$g533$.currentBinding(var272);
        try {
            module0015.$g533$.bind((SubLObject)T, var272);
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
        if (NIL == var117) {
            return module0656.f39789((SubLObject)$ic497$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var118 = module0289.f19396(var117);
        final SubLObject var119 = module0178.f11287(var117);
        return f41803(var118, var119, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41806(final SubLObject var74, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        return f41721((SubLObject)ConsesLow.list((SubLObject)$ic221$, (SubLObject)$ic499$, (SubLObject)$ic224$, var74, (SubLObject)$ic226$, var75, (SubLObject)$ic227$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic50$, NIL, $ic54$, NIL, $ic58$, $ic500$, $ic171$, $ic501$, $ic158$, NIL, $ic111$, T, $ic133$, module0434.f30571(module0018.$g651$.getDynamicValue(var76)), $ic121$, $ic502$ })));
    }
    
    public static SubLObject f41807(final SubLObject var271, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var272 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic503$;
        }
        assert NIL != assertion_handles_oc.f11035(var271) : var271;
        final SubLObject var273 = assertion_handles_oc.f11025(var271);
        final SubLObject var274 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var272), (SubLObject)$ic504$, var273);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var274) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var274);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var275 = module0015.$g533$.currentBinding(var272);
        try {
            module0015.$g533$.bind((SubLObject)T, var272);
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
        if (NIL == var117) {
            return module0656.f39789((SubLObject)$ic497$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var118 = module0211.f13686(var117);
        final SubLObject var119 = $ic312$;
        return f41806(var118, var119);
    }
    
    public static SubLObject f41809(final SubLObject var74, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)$ic221$, (SubLObject)$ic508$, (SubLObject)$ic224$, var74, (SubLObject)$ic226$, var75));
    }
    
    public static SubLObject f41810(final SubLObject var253, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic509$;
        }
        assert NIL != module0178.f11290(var253) : var253;
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)$ic511$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)T, var254);
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
        if (NIL == var117) {
            return module0656.f39789((SubLObject)$ic514$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var118 = module0211.f13687(var117);
        final SubLObject var119 = $g5376$.getGlobalValue();
        return f41809(var118, var119);
    }
    
    public static SubLObject f41812(final SubLObject var74, SubLObject var75) {
        if (var75 == UNPROVIDED) {
            var75 = (SubLObject)NIL;
        }
        return f41721((SubLObject)ConsesLow.list((SubLObject)$ic221$, (SubLObject)$ic516$, (SubLObject)$ic224$, var74, (SubLObject)$ic226$, var75));
    }
    
    public static SubLObject f41813(final SubLObject var253, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic517$;
        }
        assert NIL != module0178.f11290(var253) : var253;
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)$ic518$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)T, var254);
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
        if (NIL == var117) {
            return module0656.f39789((SubLObject)$ic514$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var118 = module0211.f13689(var117);
        final SubLObject var119 = $g5376$.getGlobalValue();
        return f41812(var118, var119);
    }
    
    public static SubLObject f41815(final SubLObject var74, final SubLObject var75, final SubLObject var138, final SubLObject var140, SubLObject var76) {
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)$ic225$;
        }
        return f41721((SubLObject)ConsesLow.list(new SubLObject[] { $ic221$, $ic522$, $ic224$, var74, $ic226$, var75, $ic227$, var138, $ic228$, var140, $ic191$, var76 }));
    }
    
    public static SubLObject f41797(final SubLObject var74, final SubLObject var75, final SubLObject var328, SubLObject var76) {
        if (var76 == UNPROVIDED) {
            var76 = (SubLObject)$ic225$;
        }
        return f41721((SubLObject)ConsesLow.list(new SubLObject[] { $ic221$, $ic523$, $ic224$, var74, $ic226$, var75, $ic227$, var328, $ic191$, var76 }));
    }
    
    public static SubLObject f41816(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic525$);
        var117 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic525$);
        var118 = var120.first();
        var120 = var120.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic525$);
        var119 = var120.first();
        var120 = var120.rest();
        final SubLObject var121 = (SubLObject)(var120.isCons() ? var120.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var120, var116, (SubLObject)$ic525$);
        var120 = var120.rest();
        if (NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic525$);
            return (SubLObject)NIL;
        }
        SubLObject var122 = (SubLObject)NIL;
        SubLObject var123 = (SubLObject)NIL;
        SubLObject var124 = (SubLObject)NIL;
        SubLObject var125 = (SubLObject)NIL;
        var122 = module0656.f39943(var117, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var122)) {
            return module0656.f39789((SubLObject)$ic526$, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var123 = reader.read_from_string_ignoring_errors(var118, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var123.isInteger()) {
            return module0656.f39789((SubLObject)$ic527$, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        var124 = module0656.f39943(var119, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var124)) {
            return module0656.f39789((SubLObject)$ic526$, var119, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var121) {
            var125 = $g5376$.getGlobalValue();
        }
        else {
            var125 = module0656.f39943(var121, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0173.f10955(var125)) {
            return module0656.f39789((SubLObject)$ic526$, var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f41817(var122, var123, var124, var125);
    }
    
    public static SubLObject f41818(final SubLObject var116) {
        return f41816(var116);
    }
    
    public static SubLObject f41819(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var341, final SubLObject var75) {
        final SubLThread var342 = SubLProcess.currentSubLThread();
        final SubLObject var343 = module0202.f12782(var75, var338);
        final SubLObject var344 = (SubLObject)$ic533$;
        final SubLObject var345 = module0015.$g538$.currentBinding(var342);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var342))) ? module0015.$g538$.getDynamicValue(var342) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var342);
            module0642.f39020((SubLObject)$ic230$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var342), module0655.$g5142$.getDynamicValue(var342));
            final SubLObject var346 = module0014.f672((SubLObject)$ic231$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var346) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var346);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var344) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var344);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var20_344 = module0015.$g535$.currentBinding(var342);
            try {
                module0015.$g535$.bind((SubLObject)T, var342);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var342)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var342)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_345 = module0015.$g533$.currentBinding(var342);
                try {
                    module0015.$g533$.bind((SubLObject)T, var342);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_346 = module0015.$g533$.currentBinding(var342);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var342);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_346, var342);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var344) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var344);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var342));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_347 = module0015.$g533$.currentBinding(var342);
                    final SubLObject var347 = module0015.$g541$.currentBinding(var342);
                    final SubLObject var348 = module0015.$g539$.currentBinding(var342);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var342);
                        module0015.$g541$.bind((SubLObject)T, var342);
                        module0015.$g539$.bind(module0015.f797(), var342);
                        module0656.f39870((SubLObject)$ic531$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        module0656.f39837((SubLObject)$ic539$, var343, (SubLObject)$ic540$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f41820(var338, var75, (SubLObject)$ic541$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        if (var340 != $ic542$ && var340 != $ic543$) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic544$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            cb_query_browser_oc.f41966(var340);
                            module0642.f39026((SubLObject)UNPROVIDED);
                        }
                        if (NIL == var339) {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic545$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                        }
                        else if (var341.numE((SubLObject)TWO_INTEGER)) {
                            final SubLObject var349 = Sequences.length(var339);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            if (var349.numE((SubLObject)ONE_INTEGER)) {
                                module0642.f39019((SubLObject)$ic546$);
                            }
                            else if (var349.numG((SubLObject)ONE_INTEGER)) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var342), (SubLObject)$ic547$, var349);
                            }
                            PrintLow.format(module0015.$g131$.getDynamicValue(var342), (SubLObject)$ic548$, module0233.f15355(var339.first().first()));
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            SubLObject var350 = (SubLObject)NIL;
                            SubLObject var351 = var339;
                            SubLObject var352 = (SubLObject)NIL;
                            var352 = var351.first();
                            while (NIL != var351) {
                                final SubLObject var353 = module0233.f15370(var352.first());
                                var350 = (SubLObject)ConsesLow.cons(var353, var350);
                                var351 = var351.rest();
                                var352 = var351.first();
                            }
                            var350 = (var351 = module0213.f13926(var350, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                            SubLObject var354 = (SubLObject)NIL;
                            var354 = var351.first();
                            while (NIL != var351) {
                                if (NIL != module0018.$g714$.getDynamicValue(var342)) {
                                    module0656.f39915(var354, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                }
                                else {
                                    module0642.f39020(module0015.$g459$.getGlobalValue());
                                    module0656.f39915(var354, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g460$.getGlobalValue());
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                    module0642.f39028((SubLObject)UNPROVIDED);
                                }
                                var351 = var351.rest();
                                var354 = var351.first();
                            }
                        }
                        else {
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic549$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            SubLObject var355 = var339;
                            SubLObject var356 = (SubLObject)NIL;
                            var356 = var355.first();
                            while (NIL != var355) {
                                final SubLObject var357 = conses_high.sublis(var356, var338, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0656.f39915(var357, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_345, var342);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_344, var342);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var345, var342);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41817(final SubLObject var351, final SubLObject var336, final SubLObject var337, final SubLObject var75) {
        final SubLThread var352 = SubLProcess.currentSubLThread();
        final SubLObject var353 = module0225.f14739(var337);
        if (!var353.isInteger()) {
            return module0656.f39789((SubLObject)$ic550$, var337, var75, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var354 = (SubLObject)ConsesLow.list(var337);
        SubLObject var355;
        SubLObject var356;
        for (var355 = (SubLObject)NIL, var355 = (SubLObject)ZERO_INTEGER; var355.numL(var353); var355 = Numbers.add(var355, (SubLObject)ONE_INTEGER)) {
            var356 = Numbers.add(var355, (SubLObject)ONE_INTEGER);
            if (var356.numE(var336)) {
                var354 = (SubLObject)ConsesLow.cons(var351, var354);
            }
            else {
                var354 = (SubLObject)ConsesLow.cons(ConsesLow.nth(var356, $g5377$.getGlobalValue()), var354);
            }
        }
        var354 = Sequences.nreverse(var354);
        var352.resetMultipleValues();
        final SubLObject var357 = f41821(var354, var75);
        final SubLObject var358 = var352.secondMultipleValue();
        var352.resetMultipleValues();
        f41819(var354, var357, var358, var353, var75);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41821(final SubLObject var74, final SubLObject var75) {
        final SubLObject var76 = (SubLObject)ConsesLow.list(new SubLObject[] { $ic158$, NIL, $ic93$, NIL, $ic162$, NIL, $ic121$, $ic551$, $ic50$, $g5378$.getGlobalValue(), $ic54$, NIL, $ic86$, NIL, $ic89$, $ic552$, $ic111$, T, $ic184$, NIL, $ic553$, $ic551$, $ic133$, $ic554$, $ic77$, $ic555$ });
        return module0409.f28506(var74, var75, var76);
    }
    
    public static SubLObject f41822(final SubLObject var335) {
        final SubLThread var336 = SubLProcess.currentSubLThread();
        final SubLObject var337 = Hashtables.make_hash_table((SubLObject)$ic556$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        SubLObject var338 = (SubLObject)NIL;
        SubLObject var339 = module0259.f16842(var335);
        SubLObject var340 = (SubLObject)NIL;
        var340 = var339.first();
        while (NIL != var339) {
            SubLObject var104_360;
            final SubLObject var341 = var104_360 = module0259.f16932(var335, var340, (SubLObject)UNPROVIDED);
            SubLObject var342 = (SubLObject)NIL;
            var342 = var104_360.first();
            while (NIL != var104_360) {
                module0030.f1600(var342, var340, var337, (SubLObject)UNPROVIDED);
                var104_360 = var104_360.rest();
                var342 = var104_360.first();
            }
            var339 = var339.rest();
            var340 = var339.first();
        }
        var338 = Sort.sort(module0030.f1625(var337), Symbols.symbol_function((SubLObject)$ic557$), (SubLObject)UNPROVIDED);
        final SubLObject var343 = (SubLObject)$ic533$;
        final SubLObject var344 = module0015.$g538$.currentBinding(var336);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var336))) ? module0015.$g538$.getDynamicValue(var336) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var336);
            module0642.f39020((SubLObject)$ic230$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var336), module0655.$g5142$.getDynamicValue(var336));
            final SubLObject var345 = module0014.f672((SubLObject)$ic231$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var345) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var345);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var343) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var343);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var20_362 = module0015.$g535$.currentBinding(var336);
            try {
                module0015.$g535$.bind((SubLObject)T, var336);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var336)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var336)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_363 = module0015.$g533$.currentBinding(var336);
                try {
                    module0015.$g533$.bind((SubLObject)T, var336);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_364 = module0015.$g533$.currentBinding(var336);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var336);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_364, var336);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var343) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var343);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0656.f39870((SubLObject)$ic531$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic558$);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0656.f39804((SubLObject)ConsesLow.listS($ic559$, var335, (SubLObject)$ic560$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    SubLObject var346 = var338;
                    SubLObject var347 = (SubLObject)NIL;
                    var347 = var346.first();
                    while (NIL != var346) {
                        module0642.f39020(module0015.$g209$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic561$);
                        module0656.f39915(var347, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic237$);
                        module0642.f39020(module0015.$g210$.getGlobalValue());
                        final SubLObject var348 = conses_high.set_difference(module0262.f17327(var347, var338, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)ConsesLow.list(var347), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        if (NIL != var348) {
                            module0642.f39019((SubLObject)$ic562$);
                            SubLObject var104_361 = var348;
                            SubLObject var349 = (SubLObject)NIL;
                            var349 = var104_361.first();
                            while (NIL != var104_361) {
                                module0642.f39019((SubLObject)$ic563$);
                                module0656.f39915(var349, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                var104_361 = var104_361.rest();
                                var349 = var104_361.first();
                            }
                            module0642.f39019((SubLObject)$ic564$);
                        }
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic565$);
                        SubLObject var104_362;
                        final SubLObject var350 = var104_362 = Sort.sort(Hashtables.gethash(var347, var337, (SubLObject)UNPROVIDED), Symbols.symbol_function((SubLObject)$ic566$), (SubLObject)UNPROVIDED);
                        SubLObject var351 = (SubLObject)NIL;
                        var351 = var104_362.first();
                        while (NIL != var104_362) {
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            final SubLObject var352 = module0217.f14421((SubLObject)ConsesLow.list($ic559$, var335, var351), var347);
                            if (NIL != var352) {
                                module0656.f39850(var352);
                            }
                            module0656.f39915(var351, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic563$);
                            var104_362 = var104_362.rest();
                            var351 = var104_362.first();
                        }
                        module0642.f39019((SubLObject)$ic564$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        var346 = var346.rest();
                        var347 = var346.first();
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_363, var336);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_362, var336);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var344, var336);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41823(final SubLObject var351, final SubLObject var336, final SubLObject var337, final SubLObject var372) {
        if (var372.eql((SubLObject)$ic567$)) {
            if (NIL != module0004.f104(var336, (SubLObject)$ic568$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != module0333.f22416(var337)) {
                    return (SubLObject)$ic569$;
                }
                if (NIL != f41824(var337)) {
                    return (SubLObject)$ic570$;
                }
            }
        }
        else if (var372.eql((SubLObject)$ic571$)) {
            if (NIL != module0333.f22416(var337)) {
                return (SubLObject)$ic569$;
            }
            if (NIL != f41824(var337)) {
                return (SubLObject)$ic570$;
            }
        }
        else if (var372.eql((SubLObject)$ic572$)) {
            if (module0217.f14221(var351, var336, var337, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER)) {
                return (SubLObject)$ic573$;
            }
            if (NIL != module0333.f22416(var337)) {
                return (SubLObject)$ic569$;
            }
            if (NIL != f41824(var337)) {
                return (SubLObject)$ic570$;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41824(final SubLObject var337) {
        return (SubLObject)makeBoolean(module0217.f14264(var337, (SubLObject)$ic574$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER) || module0217.f14221(var337, (SubLObject)TWO_INTEGER, $ic575$, (SubLObject)UNPROVIDED).numG((SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f41820(final SubLObject var373, final SubLObject var75, SubLObject var374) {
        if (var374 == UNPROVIDED) {
            var374 = (SubLObject)$ic576$;
        }
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(var374);
        module0642.f39019((SubLObject)$ic577$);
        module0656.f39915(var75, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic578$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39026((SubLObject)UNPROVIDED);
        module0656.f39915(var373, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41735(final SubLObject var99, final SubLObject var169) {
        final SubLThread var170 = SubLProcess.currentSubLThread();
        if (NIL != inference_datastructures_inference_oc.f25429(var99) && NIL != $g5352$.getGlobalValue()) {
            final SubLObject var171 = inference_datastructures_inference_oc.f25583(var99);
            final SubLObject var172 = inference_datastructures_inference_oc.f25422(var99);
            final SubLObject var173 = (SubLObject)((NIL != inference_datastructures_inference_oc.f25674(var99)) ? $ic319$ : $ic579$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g420$.getGlobalValue());
            module0642.f39020(module0015.$g429$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var170), (SubLObject)$ic580$, var171, var172);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g427$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic581$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g430$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic582$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g424$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var173);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g423$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g426$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g425$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var174 = module0015.$g533$.currentBinding(var170);
            try {
                module0015.$g533$.bind((SubLObject)T, var170);
            }
            finally {
                module0015.$g533$.rebind(var174, var170);
            }
            module0642.f39020(module0015.$g421$.getGlobalValue());
        }
        else {
            final SubLObject var175 = (SubLObject)((NIL != var169) ? $ic583$ : $ic584$);
            f41825(var99, var175, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41826(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (NIL == var120) {
            final SubLObject var121 = f41672(var118, var119);
            if (NIL == var121) {
                return module0656.f39789((SubLObject)$ic585$, var119, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var122 = (SubLObject)((NIL != inference_datastructures_inference_oc.f25429(var121)) ? $g5379$.getGlobalValue() : NIL);
            final SubLObject var123 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
                module0642.f39020((SubLObject)$ic230$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var124 = module0014.f672((SubLObject)$ic231$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var124) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var124);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                PrintLow.format(module0015.$g131$.getDynamicValue(var117), (SubLObject)$ic586$, var118, var119);
                module0642.f39020(module0015.$g174$.getGlobalValue());
                if (NIL != var122) {
                    module0642.f39055(var122);
                }
                module0016.f892();
                module0016.f895();
                module0016.f941();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var20_378 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_379 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var117);
                        f41825(var121, (SubLObject)$ic587$, (SubLObject)T);
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_379, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_378, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var123, var117);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41825(final SubLObject var1, final SubLObject var375, final SubLObject var380) {
        f41827(var1, var375);
        if (NIL == var380 && NIL != inference_datastructures_inference_oc.f25431(var1)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            f41678((SubLObject)$ic345$, (SubLObject)$ic346$, (SubLObject)$ic347$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var380 && NIL == inference_datastructures_inference_oc.f25429(var1)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic214$, (SubLObject)$ic589$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41828(var1, $g5380$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41827(final SubLObject var1, final SubLObject var375) {
        final SubLThread var376 = SubLProcess.currentSubLThread();
        module0642.f39021((SubLObject)$ic590$);
        module0642.f39032((SubLObject)UNPROVIDED);
        f41689(var1, (SubLObject)UNPROVIDED);
        final SubLObject var377 = inference_datastructures_inference_oc.f25420(var1);
        if (var377.eql((SubLObject)$ic295$)) {
            module0642.f39032((SubLObject)FOUR_INTEGER);
            if (var375.eql((SubLObject)$ic583$)) {
                module0656.f39837((SubLObject)$ic214$, (SubLObject)$ic591$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var375.eql((SubLObject)$ic584$)) {
                module0656.f39837((SubLObject)$ic214$, (SubLObject)$ic592$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic593$, var1, (SubLObject)$ic594$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else if (var375.eql((SubLObject)$ic587$)) {}
            module0642.f39032((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic595$, var1, (SubLObject)$ic596$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic597$, var1, (SubLObject)$ic598$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            final SubLObject var378 = inference_datastructures_inference_oc.f25705(var1, (SubLObject)UNPROVIDED);
            if (NIL != var378) {
                module0642.f39026((SubLObject)UNPROVIDED);
                if (NIL != module0004.f106(var378)) {
                    module0642.f39021((SubLObject)$ic599$);
                    module0642.f39019(module0051.f3602(var378));
                }
                else {
                    module0642.f39021((SubLObject)$ic600$);
                    final SubLObject var379 = (SubLObject)$ic601$;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var379) {
                        module0642.f39020(module0015.$g222$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(var379));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var380 = module0015.$g533$.currentBinding(var376);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var376);
                        module0642.f39019(module0051.f3602(Numbers.minus(var378)));
                    }
                    finally {
                        module0015.$g533$.rebind(var380, var376);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41828(final SubLObject var1, SubLObject var384) {
        if (var384 == UNPROVIDED) {
            var384 = (SubLObject)NIL;
        }
        final SubLThread var385 = SubLProcess.currentSubLThread();
        final SubLObject var386 = inference_datastructures_inference_oc.f25653(var1);
        final SubLObject var387 = inference_datastructures_inference_oc.f25663(var1);
        final SubLObject var388 = inference_datastructures_inference_oc.f25665(var1);
        final SubLObject var389 = (SubLObject)$ic266$;
        if (var386.isZero() || NIL == inference_datastructures_inference_oc.f25590(var1)) {
            cb_query_browser_oc.f41987(var1, (SubLObject)NIL);
        }
        else {
            module0016.f920((SubLObject)$ic602$, (SubLObject)$ic260$, (SubLObject)$ic261$);
            final SubLObject var390 = (SubLObject)FOUR_INTEGER;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var390) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var390);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var391 = module0015.$g533$.currentBinding(var385);
            try {
                module0015.$g533$.bind((SubLObject)T, var385);
                module0642.f39021((SubLObject)$ic277$);
            }
            finally {
                module0015.$g533$.rebind(var391, var385);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            module0642.f39032((SubLObject)FOUR_INTEGER);
            module0642.f39020(module0015.$g224$.getGlobalValue());
            module0642.f39019((SubLObject)$ic603$);
            f41688(var386, var387, var388);
            module0642.f39019((SubLObject)$ic564$);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            if (NIL != inference_datastructures_inference_oc.f25615(var1)) {
                module0642.f39032((SubLObject)FOUR_INTEGER);
                module0642.f39021((SubLObject)$ic281$);
                if (var384.isInteger()) {
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    module0656.f39837((SubLObject)$ic604$, var1, (SubLObject)$ic605$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                module0642.f39032((SubLObject)ONE_INTEGER);
                module0656.f39837((SubLObject)$ic606$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0691.f42308(var1)) {
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    module0656.f39837((SubLObject)$ic607$, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (inference_datastructures_inference_oc.f25653(var1).numGE((SubLObject)ONE_INTEGER)) {
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    module0656.f39837((SubLObject)$ic608$, var1, (SubLObject)$ic609$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (inference_datastructures_inference_oc.f25653(var1).numG((SubLObject)ONE_INTEGER)) {
                    module0642.f39032((SubLObject)ONE_INTEGER);
                    module0656.f39837((SubLObject)$ic610$, var1, (SubLObject)$ic611$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            module0016.f908((SubLObject)$ic602$, var389, (SubLObject)$ic267$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic602$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var392 = module0015.$g533$.currentBinding(var385);
            try {
                module0015.$g533$.bind((SubLObject)T, var385);
                cb_query_browser_oc.f41987(var1, var384);
            }
            finally {
                module0015.$g533$.rebind(var392, var385);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41829(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        return f41830();
    }
    
    public static SubLObject f41831(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic594$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic11$);
        if ($ic613$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)$ic613$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic614$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41830() {
        SubLObject var386;
        final SubLObject var385 = var386 = f41707();
        final SubLObject var387 = (SubLObject)(var386.isCons() ? var386.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var386, var385, (SubLObject)$ic208$);
        final SubLObject var388;
        var386 = (var388 = var386.rest());
        if (NIL != var387 && $ic295$ == inference_datastructures_inference_oc.f25420(var387)) {
            return f41721((SubLObject)ConsesLow.list((SubLObject)$ic223$, $g5379$.getGlobalValue()));
        }
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41832(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic616$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic617$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
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
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var121 = f41672(var118, var119);
        if (NIL == var121) {
            return module0656.f39789((SubLObject)$ic585$, var119, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var122 = module0015.$g538$.currentBinding(var117);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
            module0642.f39020((SubLObject)$ic230$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
            final SubLObject var123 = module0014.f672((SubLObject)$ic231$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var123) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var123);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var117), (SubLObject)$ic619$, var118, var119);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0016.f892();
            module0016.f895();
            module0016.f941();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var20_389 = module0015.$g535$.currentBinding(var117);
            try {
                module0015.$g535$.bind((SubLObject)T, var117);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_390 = module0015.$g533$.currentBinding(var117);
                try {
                    module0015.$g533$.bind((SubLObject)T, var117);
                    f41801(var121);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_390, var117);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_389, var117);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var122, var117);
        }
        return var121;
    }
    
    public static SubLObject f41801(final SubLObject var1) {
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39021((SubLObject)$ic621$);
        module0642.f39020(module0015.$g208$.getGlobalValue());
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0656.f39837((SubLObject)$ic604$, var1, (SubLObject)$ic592$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0656.f39837((SubLObject)$ic214$, (SubLObject)$ic540$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)TWO_INTEGER);
        cb_query_browser_oc.f41964(var1, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)TWO_INTEGER);
        module0642.f39021((SubLObject)$ic590$);
        module0642.f39032((SubLObject)UNPROVIDED);
        f41689(var1, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41828(var1, (SubLObject)NIL);
        return var1;
    }
    
    public static SubLObject f41834(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (NIL == var120) {
            return module0656.f39789((SubLObject)$ic585$, var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41712(var120);
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41835(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic273$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic11$);
        if ($ic623$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)$ic623$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic624$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41836(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (NIL == var120) {
            return module0656.f39789((SubLObject)$ic585$, var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41715();
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41837(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic283$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic11$);
        if ($ic627$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)$ic627$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic628$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41838(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var121 = f41672(var118, var119);
        if (NIL == var121) {
            return module0656.f39789((SubLObject)$ic585$, var119, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var122 = (SubLObject)NIL;
        try {
            var117.throwStack.push($ic210$);
            final SubLObject var123 = Errors.$error_handler$.currentBinding(var117);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic211$), var117);
                try {
                    if (NIL != inference_datastructures_inference_oc.f25429(var121)) {
                        module0408.f28400(var121, (SubLObject)NIL);
                    }
                }
                catch (Throwable var124) {
                    Errors.handleThrowable(var124, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var123, var117);
            }
        }
        catch (Throwable var125) {
            var122 = Errors.handleThrowable(var125, (SubLObject)$ic210$);
        }
        finally {
            var117.throwStack.pop();
        }
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41839(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic596$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic631$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41840(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var121 = f41672(var118, var119);
        if (NIL == var121) {
            return module0656.f39789((SubLObject)$ic585$, var119, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var122 = (SubLObject)NIL;
        try {
            var117.throwStack.push($ic210$);
            final SubLObject var123 = Errors.$error_handler$.currentBinding(var117);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic211$), var117);
                try {
                    if (NIL != inference_datastructures_inference_oc.f25429(var121)) {
                        module0408.f28440(var121);
                    }
                }
                catch (Throwable var124) {
                    Errors.handleThrowable(var124, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var123, var117);
            }
        }
        catch (Throwable var125) {
            var122 = Errors.handleThrowable(var125, (SubLObject)$ic210$);
        }
        finally {
            var117.throwStack.pop();
        }
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41841(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic598$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic634$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41842(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (NIL == var120) {
            return module0656.f39789((SubLObject)$ic585$, var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41713(var120);
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41843(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic637$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic638$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41844(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        SubLObject var117 = f41707();
        SubLObject var118 = (SubLObject)NIL;
        var118 = var117.first();
        while (NIL != var117) {
            if (NIL != var118) {
                f41713(var118);
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        f41715();
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41845(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic642$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic643$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41846(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = f41707();
        final SubLObject var119 = (SubLObject)(var118.isCons() ? var118.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var118, var117, (SubLObject)$ic208$);
        var118 = var118.rest();
        SubLObject var121;
        final SubLObject var120 = var121 = var118;
        SubLObject var122 = (SubLObject)NIL;
        var122 = var121.first();
        while (NIL != var121) {
            f41713(var122);
            var121 = var121.rest();
            var122 = var121.first();
        }
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41847(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic642$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic647$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41848(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (NIL == var120) {
            return module0656.f39789((SubLObject)$ic585$, var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41719(var120);
        return module0656.f39792((SubLObject)$ic650$, (SubLObject)ONE_INTEGER, (SubLObject)$ic651$);
    }
    
    public static SubLObject f41849(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic653$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic11$);
        if ($ic654$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)$ic654$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic655$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41850(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0048.f3287(inference_datastructures_inference_oc.f25523(var1)) && NIL != module0004.f105(inference_datastructures_inference_oc.f25653(var1)));
    }
    
    public static SubLObject f41851(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (NIL == var120) {
            return module0656.f39789((SubLObject)$ic585$, var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41717(var120);
        SubLObject var121 = f41707();
        SubLObject var1_409 = (SubLObject)NIL;
        var1_409 = var121.first();
        while (NIL != var121) {
            if (NIL != var1_409 && NIL == inference_datastructures_inference_oc.f25417(var1_409)) {
                f41713(var1_409);
            }
            var121 = var121.rest();
            var1_409 = var121.first();
        }
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41852(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic275$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic11$);
        if ($ic659$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)$ic659$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic660$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41853(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        SubLObject var117 = f41707();
        SubLObject var118 = (SubLObject)NIL;
        var118 = var117.first();
        while (NIL != var117) {
            if (NIL != var118) {
                f41717(var118);
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        f41715();
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41854(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic271$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        if ($ic663$.isString()) {
            final SubLObject var25 = module0644.f39202((SubLObject)$ic663$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)$ic664$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var24) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var24);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var26 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var26, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41855(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = f41707();
        final SubLObject var119 = (SubLObject)(var118.isCons() ? var118.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var118, var117, (SubLObject)$ic667$);
        var118 = var118.rest();
        SubLObject var121;
        final SubLObject var120 = var121 = var118;
        SubLObject var122 = (SubLObject)NIL;
        var122 = var121.first();
        while (NIL != var121) {
            f41717(var122);
            var121 = var121.rest();
            var122 = var121.first();
        }
        return f41721((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41856(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic271$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        if ($ic669$.isString()) {
            final SubLObject var25 = module0644.f39202((SubLObject)$ic669$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            module0642.f39019((SubLObject)$ic670$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var24) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var24);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var26 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var26, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41857(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic672$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic11$);
        if ($ic673$.isString()) {
            final SubLObject var27 = module0644.f39202((SubLObject)$ic673$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic674$, var24, var25);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var26) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var26);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g389$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var27);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g390$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var28 = module0015.$g533$.currentBinding(var23);
            try {
                module0015.$g533$.bind((SubLObject)T, var23);
                module0642.f39019(var22);
            }
            finally {
                module0015.$g533$.rebind(var28, var23);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41858(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = var116;
        SubLObject var119 = (SubLObject)NIL;
        SubLObject var120 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)$ic3$);
        var119 = var118.first();
        var118 = var118.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var118, var117, (SubLObject)$ic3$);
        var120 = var118.first();
        var118 = var118.rest();
        if (NIL == var118) {
            final SubLObject var121 = f41672(var119, var120);
            final SubLObject var122 = inference_datastructures_inference_oc.f25594(var121);
            module0677.f41372((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic677$, var122)));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var117, (SubLObject)$ic3$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41859(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic679$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = (SubLObject)((NIL != Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { $ic1$, module0006.f203(var25) })) ? module0656.f39832(Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { $ic1$, module0006.f203(var25) })) : NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic680$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic681$);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic680$, var24, var25);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic682$);
        if (NIL != Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { $ic1$, module0006.f203(var25) })) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic683$, Sequences.cconcatenate(module0006.f203(var24), new SubLObject[] { $ic1$, module0006.f203(var25) }));
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic684$);
        }
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic685$, module0692.f42406(module0692.$g5381$.getGlobalValue(), module0692.$g5382$.getGlobalValue()));
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic686$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41860(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var117 = var116.first();
        SubLObject var119 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var119, var116, (SubLObject)$ic3$);
        var118 = var119.first();
        var119 = var119.rest();
        if (NIL != var119) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            return (SubLObject)NIL;
        }
        final SubLObject var120 = f41672(var117, var118);
        if (NIL == var120) {
            return module0656.f39789((SubLObject)$ic585$, var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f41861(var120);
    }
    
    public static SubLObject f41861(final SubLObject var1) {
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var2 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var3 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var4 = module0665.f40428((SubLObject)UNPROVIDED);
        module0665.f40421((SubLObject)$ic689$, var4, Sequences.cconcatenate(module0006.f203(var2), new SubLObject[] { $ic1$, module0006.f203(var3) }));
        module0665.f40421((SubLObject)$ic690$, var4, var2);
        module0665.f40421((SubLObject)$ic691$, var4, var3);
        module0691.f42309(var1);
        module0692.f42401(var4);
        module0004.f78((SubLObject)$ic692$, Symbols.symbol_function((SubLObject)$ic693$), (SubLObject)ConsesLow.list(var4));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41862(final SubLObject var418) {
        final SubLObject var419 = (SubLObject)$ic694$;
        final SubLObject var420 = Packages.intern(module0038.f2968(var419), (SubLObject)$ic196$);
        final SubLObject var421 = module0665.f40419((SubLObject)$ic689$, var418);
        module0691.f42322(var421, (SubLObject)ConsesLow.list(module0692.$g5383$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic695$, var420, (SubLObject)$ic696$, (SubLObject)ConsesLow.list((SubLObject)$ic690$, module0665.f40419((SubLObject)$ic690$, var418), (SubLObject)$ic691$, module0665.f40419((SubLObject)$ic691$, var418)))));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41863(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = module0642.f39104((SubLObject)$ic697$, var116);
        final SubLObject var119 = module0642.f39104((SubLObject)$ic698$, var116);
        final SubLObject var120 = f41672(var118, var119);
        SubLObject var121 = module0642.f39104((SubLObject)$ic699$, var116);
        final SubLObject var122 = reader.read_from_string(module0642.f39104((SubLObject)$ic700$, var116), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var123 = module0642.f39104((SubLObject)$ic701$, var116);
        final SubLObject var124 = module0642.f39112((SubLObject)$ic702$, var116, (SubLObject)UNPROVIDED);
        if (NIL != var121) {
            var121 = reader.read_from_string(var121, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var120) {
            return module0656.f39789((SubLObject)$ic585$, var119, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var122 == $ic703$ && NIL == module0038.f2611(var123)) {
            return module0656.f39789((SubLObject)$ic704$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var125 = var121;
        if (var125.eql((SubLObject)$ic705$) || var125.eql((SubLObject)$ic706$) || var125.eql((SubLObject)$ic707$)) {
            SubLObject var126 = (SubLObject)NIL;
            try {
                var117.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var127 = Errors.$error_handler$.currentBinding(var117);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic708$, var117);
                    try {
                        f41864(var120, var122, var123, var121, (SubLObject)NIL, var124);
                    }
                    catch (Throwable var128) {
                        Errors.handleThrowable(var128, (SubLObject)NIL);
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
            if (NIL != var126) {
                module0656.f39789((SubLObject)$ic709$, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else if (var125.eql((SubLObject)$ic710$)) {
            SubLObject var130 = module0642.f39111((SubLObject)$ic711$, var116, (SubLObject)UNPROVIDED);
            SubLObject var131 = (SubLObject)NIL;
            try {
                var130 = reader.read_from_string(var130, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var131 = f41864(var120, var122, var123, (SubLObject)$ic706$, var130, var124);
            }
            finally {
                final SubLObject var132 = Threads.$is_thread_performing_cleanupP$.currentBinding(var117);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var117);
                    if (NIL == var131) {
                        module0642.f39021((SubLObject)$ic712$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39019((SubLObject)$ic713$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0656.f39790((SubLObject)$ic11$, (SubLObject)$ic714$);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var132, var117);
                }
            }
        }
        else {
            final SubLObject var133 = (SubLObject)$ic715$;
            final SubLObject var127 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
                module0642.f39020((SubLObject)$ic230$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var134 = module0014.f672((SubLObject)$ic231$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var134) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var134);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var133) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var133);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var20_428 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var117)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic234$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_429 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var117);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic535$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_430 = module0015.$g533$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var117);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic536$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic537$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic538$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_430, var117);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var133) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var133);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)$ic716$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0656.f39790((SubLObject)$ic11$, (SubLObject)$ic714$);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var20_429, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_428, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var127, var117);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41864(final SubLObject var1, final SubLObject var423, final SubLObject var424, final SubLObject var422, final SubLObject var426, final SubLObject var425) {
        final SubLThread var427 = SubLProcess.currentSubLThread();
        if (var423.eql((SubLObject)$ic718$)) {
            return module0411.f28601(var1, module0015.$g131$.getDynamicValue(var427), var422, var426, var425);
        }
        if (var423.eql((SubLObject)$ic703$)) {
            final SubLObject var428 = module0411.f28600(var1, var424, var422, (SubLObject)$ic719$, var426, var425);
            module0656.f39793(Sequences.cconcatenate((SubLObject)$ic720$, new SubLObject[] { module0006.f203(var424), $ic399$ }), (SubLObject)T);
            return var428;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41865(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (NIL == var120) {
            final SubLObject var121 = (SubLObject)$ic723$;
            final SubLObject var122 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
                module0642.f39020((SubLObject)$ic230$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var123 = module0014.f672((SubLObject)$ic231$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var123) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var123);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var121) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var121);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var20_433 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var117)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic234$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_434 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var117);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic535$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_435 = module0015.$g533$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var117);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic536$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic537$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic538$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_435, var117);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var121) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var121);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var124 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var117));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic235$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var124) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var124);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_436 = module0015.$g533$.currentBinding(var117);
                        final SubLObject var125 = module0015.$g541$.currentBinding(var117);
                        final SubLObject var126 = module0015.$g539$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var117);
                            module0015.$g541$.bind((SubLObject)T, var117);
                            module0015.$g539$.bind(module0015.f797(), var117);
                            module0642.f39069((SubLObject)$ic724$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0642.f39069((SubLObject)$ic697$, var118, (SubLObject)UNPROVIDED);
                            module0642.f39069((SubLObject)$ic698$, var119, (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic721$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39021((SubLObject)$ic725$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39072((SubLObject)$ic699$, (SubLObject)$ic726$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic727$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39072((SubLObject)$ic699$, (SubLObject)$ic728$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic729$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39072((SubLObject)$ic699$, (SubLObject)$ic730$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic731$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39021((SubLObject)$ic732$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39072((SubLObject)$ic700$, (SubLObject)$ic733$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic734$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39072((SubLObject)$ic700$, (SubLObject)$ic735$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic736$);
                            module0642.f39027((SubLObject)$ic737$, (SubLObject)UNPROVIDED);
                            module0642.f39075((SubLObject)$ic701$, (SubLObject)NIL, (SubLObject)$ic738$);
                            module0644.f39184((SubLObject)$ic701$, (SubLObject)$ic739$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39021((SubLObject)$ic740$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39068((SubLObject)$ic702$, (SubLObject)$ic741$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic742$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39021((SubLObject)$ic743$);
                            module0642.f39019((SubLObject)$ic731$);
                            module0642.f39021((SubLObject)$ic237$);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g336$.getGlobalValue());
                            module0642.f39020(module0015.$g338$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic711$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g340$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic738$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g339$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TEN_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_437 = module0015.$g533$.currentBinding(var117);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var117);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_437, var117);
                            }
                            module0642.f39020(module0015.$g337$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39073((SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39074((SubLObject)$ic744$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0015.f799(module0015.$g539$.getDynamicValue(var117));
                        }
                        finally {
                            module0015.$g539$.rebind(var126, var117);
                            module0015.$g541$.rebind(var125, var117);
                            module0015.$g533$.rebind(var20_436, var117);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var20_434, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_433, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var122, var117);
            }
            return (SubLObject)NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41866(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic746$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = (SubLObject)NIL;
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic747$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic681$);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic747$, var24, var25);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic682$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic684$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic685$, (SubLObject)$ic6$);
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic686$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41867(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        if (NIL != module0035.f1998(var116)) {
            SubLObject var118 = (SubLObject)NIL;
            SubLObject var119 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
            var118 = var116.first();
            SubLObject var120 = var116.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic3$);
            var119 = var120.first();
            var120 = var120.rest();
            if (NIL == var120) {
                var117 = module0665.f40428((SubLObject)UNPROVIDED);
                module0665.f40421((SubLObject)$ic749$, var117, reader.read_from_string_ignoring_errors(var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                module0665.f40421((SubLObject)$ic691$, var117, reader.read_from_string_ignoring_errors(var119, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
            }
        }
        else {
            var117 = module0665.f40432(var116);
        }
        return f41868(var117);
    }
    
    public static SubLObject f41868(final SubLObject var418) {
        final SubLThread var419 = SubLProcess.currentSubLThread();
        module0642.f39020((SubLObject)$ic230$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var419), module0655.$g5142$.getDynamicValue(var419));
        final SubLObject var420 = module0014.f672((SubLObject)$ic231$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic232$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var420) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var420);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic233$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var419), (SubLObject)$ic751$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0016.f892();
        module0016.f895();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var421 = module0015.$g535$.currentBinding(var419);
        try {
            module0015.$g535$.bind((SubLObject)T, var419);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_440 = module0015.$g533$.currentBinding(var419);
            try {
                module0015.$g533$.bind((SubLObject)T, var419);
                module0642.f39020(module0015.$g207$.getGlobalValue());
                module0642.f39021((SubLObject)$ic751$);
                module0642.f39020(module0015.$g208$.getGlobalValue());
                module0642.f39026((SubLObject)TWO_INTEGER);
                SubLObject var422 = (SubLObject)NIL;
                if (NIL != module0665.f40419((SubLObject)$ic752$, var418)) {
                    var422 = (SubLObject)T;
                    if (NIL == module0665.f40419((SubLObject)$ic753$, var418)) {
                        var422 = (SubLObject)NIL;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != module0015.$g495$.getGlobalValue()) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_441 = module0015.$g533$.currentBinding(var419);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var419);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic754$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_441, var419);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                    }
                    if (NIL == module0665.f40419((SubLObject)$ic755$, var418)) {
                        var422 = (SubLObject)NIL;
                        module0642.f39020(module0015.$g219$.getGlobalValue());
                        if (NIL != module0015.$g495$.getGlobalValue()) {
                            module0642.f39020(module0015.$g222$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g495$.getGlobalValue()));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_442 = module0015.$g533$.currentBinding(var419);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var419);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic756$);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var20_442, var419);
                        }
                        module0642.f39020(module0015.$g220$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                    }
                }
                final SubLObject var423 = module0665.f40419((SubLObject)$ic749$, var418);
                final SubLObject var424 = module0665.f40419((SubLObject)$ic691$, var418);
                final SubLObject var425 = module0361.f24195(var423, var424);
                if (NIL == inference_datastructures_inference_oc.f25275(var425)) {
                    return module0656.f39789((SubLObject)$ic585$, var424, var423, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL == var422) {
                    final SubLObject var426 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var419));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic235$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var426) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var426);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_443 = module0015.$g533$.currentBinding(var419);
                    final SubLObject var427 = module0015.$g541$.currentBinding(var419);
                    final SubLObject var428 = module0015.$g539$.currentBinding(var419);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var419);
                        module0015.$g541$.bind((SubLObject)T, var419);
                        module0015.$g539$.bind(module0015.f797(), var419);
                        module0642.f39069((SubLObject)$ic758$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0665.f40440(var418, (SubLObject)$ic749$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0665.f40440(var418, (SubLObject)$ic691$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0656.f39804(var425, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0656.f39804(inference_datastructures_inference_oc.f25485(var425), (SubLObject)NIL, (SubLObject)T);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic577$);
                        module0656.f39804(inference_datastructures_inference_oc.f25484(var425), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0665.f40445(var418, (SubLObject)$ic744$, (SubLObject)$ic752$, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        var419.resetMultipleValues();
                        final SubLObject var429 = cb_query_browser_oc.f41988(var425);
                        final SubLObject var430 = var419.secondMultipleValue();
                        final SubLObject var431 = var419.thirdMultipleValue();
                        var419.resetMultipleValues();
                        if (NIL == var429) {
                            module0656.f39789((SubLObject)$ic759$, var424, var423, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        else if (NIL == inference_datastructures_inference_oc.f25590(var425)) {
                            return module0656.f39789((SubLObject)$ic760$, var424, var423, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39019((SubLObject)$ic761$);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        SubLObject var432 = var430;
                        SubLObject var433 = (SubLObject)NIL;
                        var433 = var432.first();
                        while (NIL != var432) {
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0665.f40436(var418, (SubLObject)$ic753$, module0201.f12576(var433), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0642.f39020(module0015.$g209$.getGlobalValue());
                            module0656.f39804(var433, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g210$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            var432 = var432.rest();
                            var433 = var432.first();
                        }
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic762$);
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
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_444 = module0015.$g533$.currentBinding(var419);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var419);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_445 = module0015.$g533$.currentBinding(var419);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var419);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_446 = module0015.$g533$.currentBinding(var419);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var419);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_446, var419);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_447 = module0015.$g533$.currentBinding(var419);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var419);
                                    module0642.f39021((SubLObject)$ic763$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_447, var419);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                cb_query_browser_oc.f41990(var430, (SubLObject)NIL, (SubLObject)T);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_445, var419);
                            }
                            module0642.f39020(module0015.$g365$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            SubLObject var434 = var429;
                            SubLObject var435 = (SubLObject)NIL;
                            var435 = var434.first();
                            while (NIL != var434) {
                                module0642.f39020(module0015.$g364$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_448 = module0015.$g533$.currentBinding(var419);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var419);
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var20_449 = module0015.$g533$.currentBinding(var419);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var419);
                                        module0665.f40436(var418, (SubLObject)$ic755$, inference_datastructures_inference_oc.f25629(var435), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_449, var419);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    module0642.f39020(module0015.$g360$.getGlobalValue());
                                    module0642.f39020(module0015.$g370$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var20_450 = module0015.$g533$.currentBinding(var419);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var419);
                                        cb_query_browser_oc.f41989(var435, var431, Sequences.length(var429));
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var20_450, var419);
                                    }
                                    module0642.f39020(module0015.$g361$.getGlobalValue());
                                    cb_query_browser_oc.f41991(var435, var430);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_448, var419);
                                }
                                module0642.f39020(module0015.$g365$.getGlobalValue());
                                module0642.f39029((SubLObject)UNPROVIDED);
                                var434 = var434.rest();
                                var435 = var434.first();
                            }
                        }
                        finally {
                            module0015.$g533$.rebind(var20_444, var419);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        module0665.f40445(var418, (SubLObject)$ic744$, (SubLObject)$ic752$, (SubLObject)UNPROVIDED);
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
                    SubLObject var436 = module0665.f40420((SubLObject)$ic753$, var418);
                    final SubLObject var437 = module0665.f40420((SubLObject)$ic755$, var418);
                    var436 = Mapping.mapcar((SubLObject)$ic764$, var436);
                    f41869(var425, var437, var436);
                }
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var20_440, var419);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var421, var419);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41869(final SubLObject var1, final SubLObject var458, final SubLObject var457) {
        SubLObject var459 = var458;
        SubLObject var460 = (SubLObject)NIL;
        var460 = var459.first();
        while (NIL != var459) {
            final SubLObject var461 = module0682.f41659(var1, (SubLObject)UNPROVIDED);
            final SubLObject var462 = inference_datastructures_inference_oc.f25616(var1, var460);
            final SubLObject var463 = inference_datastructures_inference_oc.f25687(var462);
            SubLObject var464 = inference_datastructures_inference_oc.f25485(var1);
            final SubLObject var465 = module0360.f23987(var1);
            SubLObject var466 = (SubLObject)NIL;
            SubLObject var104_463 = var463;
            SubLObject var467 = (SubLObject)NIL;
            var467 = var104_463.first();
            while (NIL != var104_463) {
                if (NIL != module0004.f104(var467.first(), var457, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    var466 = (SubLObject)ConsesLow.cons(var467, var466);
                }
                var104_463 = var104_463.rest();
                var467 = var104_463.first();
            }
            var464 = module0233.f15362(var466, var464);
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39021((SubLObject)$ic765$);
            module0656.f39804(var464, (SubLObject)NIL, (SubLObject)T);
            module0682.f41648(var461, (SubLObject)ConsesLow.list(inference_datastructures_inference_oc.f25484(var1)));
            module0682.f41647(var461, (SubLObject)ConsesLow.list(var464));
            module0682.f41652(var461, var465);
            module0682.f41642(var461, module0038.f2867(Sequences.cconcatenate(module0006.f203((SubLObject)$ic766$), new SubLObject[] { $ic563$, module0006.f203(var464.first().isCons() ? var464.first().first() : var464.first()), $ic563$, module0006.f203(var466) }), (SubLObject)UNPROVIDED));
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)$ic767$);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0684.f41958(var461, (SubLObject)T);
            module0642.f39026((SubLObject)UNPROVIDED);
            var459 = var459.rest();
            var460 = var459.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41870(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic609$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic768$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41871(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic3$);
        var118 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic3$);
        var119 = var120.first();
        var120 = var120.rest();
        if (NIL == var120) {
            final SubLObject var121 = f41672(var118, var119);
            if (NIL == var121) {
                return module0656.f39789((SubLObject)$ic585$, var119, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39020((SubLObject)$ic230$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
            final SubLObject var122 = module0014.f672((SubLObject)$ic231$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var122) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var122);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g173$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var117), (SubLObject)$ic770$, var118, var119);
            module0642.f39020(module0015.$g174$.getGlobalValue());
            module0016.f892();
            module0016.f895();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var123 = module0015.$g535$.currentBinding(var117);
            try {
                module0015.$g535$.bind((SubLObject)T, var117);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_467 = module0015.$g533$.currentBinding(var117);
                try {
                    module0015.$g533$.bind((SubLObject)T, var117);
                    module0642.f39020(module0015.$g207$.getGlobalValue());
                    module0642.f39021((SubLObject)$ic771$);
                    module0642.f39020(module0015.$g208$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic772$);
                    module0642.f39019(print_high.princ_to_string(var121));
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    f41872(var121, (SubLObject)$ic773$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_467, var117);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var123, var117);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic3$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41873(final SubLObject var1, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic775$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        final SubLObject var24 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var25 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var26 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var23), (SubLObject)$ic776$, var24, var25);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var26) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var26);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var27 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var27, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var1;
    }
    
    public static SubLObject f41872(final SubLObject var1, SubLObject var468) {
        if (var468 == UNPROVIDED) {
            var468 = (SubLObject)NIL;
        }
        final SubLThread var469 = SubLProcess.currentSubLThread();
        final SubLObject var470 = f41874(var1);
        SubLObject var471 = (SubLObject)NIL;
        SubLObject var472 = (SubLObject)NIL;
        try {
            var472 = streams_high.make_private_string_output_stream();
            final SubLObject var473 = reader.$read_default_float_format$.currentBinding(var469);
            try {
                reader.$read_default_float_format$.bind((SubLObject)$ic778$, var469);
                streams_high.write_string((SubLObject)$ic779$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.write_string((SubLObject)$ic780$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.write_string((SubLObject)$ic781$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var474 = inference_datastructures_inference_oc.f25583(var1);
                final SubLObject var475 = inference_datastructures_inference_oc.f25422(var1);
                final SubLObject var476 = Sequences.cconcatenate((SubLObject)$ic782$, new SubLObject[] { module0006.f203(var474), $ic399$, module0006.f203(var475), $ic783$ });
                PrintLow.format(var472, (SubLObject)$ic784$, module0589.f35898(var476, (SubLObject)UNPROVIDED));
                final SubLObject var477 = module0035.f2114(var470);
                final SubLObject var478 = module0048.f3302(var477.first(), (SubLObject)THREE_INTEGER);
                final SubLObject var479 = conses_high.second(var477);
                PrintLow.format(var472, (SubLObject)$ic785$, new SubLObject[] { ZERO_INTEGER, var478, ZERO_INTEGER, var479 });
                streams_high.write_string((SubLObject)$ic786$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                PrintLow.format(var472, (SubLObject)$ic787$, new SubLObject[] { ZERO_INTEGER, var478, ZERO_INTEGER, var479 });
                final SubLObject var480 = (SubLObject)$ic788$;
                final SubLObject var481 = (SubLObject)$ic789$;
                PrintLow.format(var472, (SubLObject)$ic790$, module0589.f35898(var480, (SubLObject)UNPROVIDED), module0589.f35898(var481, (SubLObject)UNPROVIDED));
                PrintLow.format(var472, (SubLObject)$ic791$, (SubLObject)$ic792$, (SubLObject)$ic792$);
                streams_high.write_string((SubLObject)$ic793$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                SubLObject var482 = (SubLObject)NIL;
                SubLObject var483 = (SubLObject)NIL;
                SubLObject var484 = (SubLObject)NIL;
                var482 = var470;
                var483 = var482.first();
                for (var484 = (SubLObject)ZERO_INTEGER; NIL != var482; var482 = var482.rest(), var483 = var482.first(), var484 = Numbers.add((SubLObject)ONE_INTEGER, var484)) {
                    final SubLObject var485 = module0048.f3302(var483.first(), (SubLObject)THREE_INTEGER);
                    if (!var484.isZero()) {
                        streams_high.write_string((SubLObject)$ic794$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    print_high.princ(var485, var472);
                }
                streams_high.write_string((SubLObject)$ic398$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var482 = (SubLObject)NIL;
                var483 = (SubLObject)NIL;
                var484 = (SubLObject)NIL;
                var482 = var470;
                var483 = var482.first();
                for (var484 = (SubLObject)ZERO_INTEGER; NIL != var482; var482 = var482.rest(), var483 = var482.first(), var484 = Numbers.add((SubLObject)ONE_INTEGER, var484)) {
                    final SubLObject var486 = conses_high.second(var483);
                    if (!var484.isZero()) {
                        streams_high.write_string((SubLObject)$ic794$, var472, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var469);
                streams_high.close(var472, (SubLObject)UNPROVIDED);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var487, var469);
            }
        }
        module0642.f39020(module0015.$g431$.getGlobalValue());
        module0642.f39020(module0015.$g440$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(var471);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g435$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic795$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g436$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic796$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var473 = module0015.$g533$.currentBinding(var469);
        try {
            module0015.$g533$.bind((SubLObject)T, var469);
        }
        finally {
            module0015.$g533$.rebind(var473, var469);
        }
        module0642.f39020(module0015.$g432$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41874(final SubLObject var1) {
        final SubLObject var2 = module0548.f33868(var1);
        if (NIL != module0035.f1994(var2, (SubLObject)$ic797$, (SubLObject)UNPROVIDED)) {
            return var2;
        }
        final SubLObject var3 = Sequences.length(var2);
        final SubLObject var4 = module0035.f2124((SubLObject)TEN_INTEGER, var2);
        SubLObject var5 = Sequences.subseq(var2, (SubLObject)TEN_INTEGER, Numbers.subtract(var3, (SubLObject)TWENTY_INTEGER));
        final SubLObject var6 = module0035.f2129((SubLObject)TEN_INTEGER, var2);
        var5 = module0035.f2097(var5);
        var5 = module0035.f2124((SubLObject)$ic137$, var5);
        var5 = Sort.sort(var5, Symbols.symbol_function((SubLObject)$ic798$), Symbols.symbol_function((SubLObject)$ic799$));
        final SubLObject var7 = ConsesLow.nconc(var4, var5, var6);
        return var7;
    }
    
    public static SubLObject f41875(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        SubLObject var118 = (SubLObject)NIL;
        SubLObject var119 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic800$);
        var117 = var116.first();
        SubLObject var120 = var116.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic800$);
        var118 = var120.first();
        var120 = var120.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var120, var116, (SubLObject)$ic800$);
        var119 = var120.first();
        var120 = var120.rest();
        if (NIL != var120) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic800$);
            return (SubLObject)NIL;
        }
        final SubLObject var121 = f41672(var117, var118);
        if (NIL == var121) {
            return module0656.f39789((SubLObject)$ic585$, var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var122 = reader.read_from_string_ignoring_errors(var119, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var123 = (SubLObject)NIL;
        final SubLObject var124 = var122;
        if (var124.eql((SubLObject)$ic404$)) {
            var123 = module0412.f28692(var121);
        }
        else {
            if (!var124.eql((SubLObject)$ic801$)) {
                return module0656.f39789((SubLObject)$ic802$, var119, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var123 = module0412.f28694(var121);
        }
        final SubLObject var125 = inference_datastructures_inference_oc.f25423(var121);
        final SubLObject var126 = inference_datastructures_inference_oc.f25424(var121);
        return f41797(var125, var126, var123, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41876(final SubLObject var1, final SubLObject var210, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var211 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic804$;
        }
        assert NIL != inference_datastructures_inference_oc.f25275(var1) : var1;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var211) && NIL == module0035.f2169(var210, (SubLObject)$ic805$)) {
            Errors.error((SubLObject)$ic806$, var210);
        }
        final SubLObject var212 = inference_datastructures_inference_oc.f25583(var1);
        final SubLObject var213 = inference_datastructures_inference_oc.f25422(var1);
        final SubLObject var214 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var211), (SubLObject)$ic807$, new SubLObject[] { var212, var213, var210 });
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var214) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var214);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var215 = module0015.$g533$.currentBinding(var211);
        try {
            module0015.$g533$.bind((SubLObject)T, var211);
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
        assert NIL != module0360.f23781(var487) : var487;
        SubLObject var489 = (SubLObject)NIL;
        SubLObject var490 = (SubLObject)NIL;
        if (NIL != module0360.f23801(var487)) {
            var488.resetMultipleValues();
            final SubLObject var489_490 = f41878(var487, $g5361$.getGlobalValue());
            final SubLObject var491_492 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var489_490;
            var490 = var491_492;
            if (NIL == var490) {
                var488.resetMultipleValues();
                final SubLObject var493_494 = f41878(var487, $g5364$.getGlobalValue());
                final SubLObject var495_496 = var488.secondMultipleValue();
                var488.resetMultipleValues();
                var489 = var493_494;
                var490 = var495_496;
            }
        }
        else if (NIL != module0360.f23789(var487)) {
            var488.resetMultipleValues();
            final SubLObject var497_498 = f41878(var487, $g5365$.getGlobalValue());
            final SubLObject var499_500 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var497_498;
            var490 = var499_500;
        }
        else if (NIL != module0360.f23803(var487)) {
            var488.resetMultipleValues();
            final SubLObject var501_502 = f41878(var487, $g5366$.getGlobalValue());
            final SubLObject var503_504 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var501_502;
            var490 = var503_504;
        }
        else if (NIL != module0360.f23791(var487)) {
            var488.resetMultipleValues();
            final SubLObject var505_506 = f41878(var487, $g5367$.getGlobalValue());
            final SubLObject var507_508 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var505_506;
            var490 = var507_508;
        }
        else if (NIL != module0360.f23802(var487)) {
            var488.resetMultipleValues();
            final SubLObject var509_510 = f41878(var487, $g5368$.getGlobalValue());
            final SubLObject var511_512 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var509_510;
            var490 = var511_512;
        }
        else if (NIL != module0360.f23790(var487)) {
            var488.resetMultipleValues();
            final SubLObject var513_514 = f41878(var487, $g5369$.getGlobalValue());
            final SubLObject var515_516 = var488.secondMultipleValue();
            var488.resetMultipleValues();
            var489 = var513_514;
            var490 = var515_516;
        }
        return Values.values(var489, var490);
    }
    
    public static SubLObject f41878(final SubLObject var487, final SubLObject var228) {
        SubLObject var488 = (SubLObject)NIL;
        SubLObject var489 = (SubLObject)NIL;
        final SubLObject var490 = conses_high.assoc(var487, var228, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var490) {
            var488 = f41697(conses_high.second(var490), var487);
            var489 = (SubLObject)T;
        }
        else {
            var488 = (SubLObject)NIL;
            var489 = (SubLObject)NIL;
        }
        return Values.values(var488, var489);
    }
    
    public static SubLObject f41879(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        SubLObject var118;
        final SubLObject var117 = var118 = var116;
        final SubLObject var119 = (SubLObject)(var118.isCons() ? var118.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var118, var117, (SubLObject)$ic811$);
        var118 = var118.rest();
        if (NIL == var118) {
            SubLObject var120 = (SubLObject)NIL;
            if (NIL != var119) {
                var120 = reader.read_from_string_ignoring_errors(var119, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                var120 = (SubLObject)$ic812$;
            }
            if (!var120.isKeyword()) {
                var120 = (SubLObject)$ic812$;
            }
            return f41880(var120);
        }
        cdestructuring_bind.cdestructuring_bind_error(var117, (SubLObject)$ic811$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41880(final SubLObject var521) {
        final SubLThread var522 = SubLProcess.currentSubLThread();
        final SubLObject var524;
        final SubLObject var523 = var524 = (SubLObject)$ic814$;
        final SubLObject var525 = module0015.$g538$.currentBinding(var522);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var522))) ? module0015.$g538$.getDynamicValue(var522) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var522);
            module0642.f39020((SubLObject)$ic230$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var522), module0655.$g5142$.getDynamicValue(var522));
            final SubLObject var526 = module0014.f672((SubLObject)$ic231$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var526) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var526);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var524) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var524);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var20_522 = module0015.$g535$.currentBinding(var522);
            try {
                module0015.$g535$.bind((SubLObject)T, var522);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var522)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var522)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_523 = module0015.$g533$.currentBinding(var522);
                try {
                    module0015.$g533$.bind((SubLObject)T, var522);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_524 = module0015.$g533$.currentBinding(var522);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var522);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_524, var522);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var524) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var524);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var527 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var522));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic235$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var527) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var527);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_525 = module0015.$g533$.currentBinding(var522);
                    final SubLObject var528 = module0015.$g541$.currentBinding(var522);
                    final SubLObject var529 = module0015.$g539$.currentBinding(var522);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var522);
                        module0015.$g541$.bind((SubLObject)T, var522);
                        module0015.$g539$.bind(module0015.f797(), var522);
                        module0642.f39069((SubLObject)$ic815$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        module0656.f39837((SubLObject)$ic816$, (SubLObject)$ic592$, var521, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0656.f39837((SubLObject)$ic817$, (SubLObject)$ic818$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g353$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g354$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_526 = module0015.$g533$.currentBinding(var522);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var522);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_527 = module0015.$g533$.currentBinding(var522);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var522);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_528 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39019((SubLObject)$ic819$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_528, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_529 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_529, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_530 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39139((SubLObject)$ic820$, (SubLObject)$ic6$, (SubLObject)$ic319$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_530, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_531 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_531, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_532 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39074((SubLObject)$ic821$, (SubLObject)$ic822$, (SubLObject)UNPROVIDED);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_533 = module0015.$g533$.currentBinding(var522);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var522);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_534 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39019((SubLObject)$ic823$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_534, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_535 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_535, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_536 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39139((SubLObject)$ic824$, (SubLObject)$ic6$, (SubLObject)$ic319$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_536, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_537 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39032((SubLObject)TWO_INTEGER);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_537, var522);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_538 = module0015.$g533$.currentBinding(var522);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var522);
                                    module0642.f39074((SubLObject)$ic825$, (SubLObject)$ic826$, (SubLObject)UNPROVIDED);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_526, var522);
                        }
                        module0642.f39020(module0015.$g347$.getGlobalValue());
                        f41881(var521, (SubLObject)UNPROVIDED);
                        module0015.f799(module0015.$g539$.getDynamicValue(var522));
                    }
                    finally {
                        module0015.$g539$.rebind(var529, var522);
                        module0015.$g541$.rebind(var528, var522);
                        module0015.$g533$.rebind(var20_525, var522);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_523, var522);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_522, var522);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var525, var522);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41882(SubLObject var22, SubLObject var521) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        if (var521 == UNPROVIDED) {
            var521 = (SubLObject)NIL;
        }
        final SubLThread var522 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic827$;
        }
        final SubLObject var523 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var522), (SubLObject)$ic828$, var521);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var523) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var523);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var524 = module0015.$g533$.currentBinding(var522);
        try {
            module0015.$g533$.bind((SubLObject)T, var522);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var524, var522);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41881(SubLObject var521, SubLObject var539) {
        if (var521 == UNPROVIDED) {
            var521 = (SubLObject)$ic812$;
        }
        if (var539 == UNPROVIDED) {
            var539 = (SubLObject)$ic832$;
        }
        final SubLThread var540 = SubLProcess.currentSubLThread();
        final SubLObject var541 = module0414.f28887(var539, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var542 = Sequences.length(var541);
        final SubLObject var543 = module0414.f28890();
        final SubLObject var544 = module0414.f28891();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var545 = module0015.$g533$.currentBinding(var540);
        try {
            module0015.$g533$.bind((SubLObject)T, var540);
            SubLObject var546 = module0414.f28872();
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_544 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_545 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39019((SubLObject)$ic833$);
                }
                finally {
                    module0015.$g533$.rebind(var20_545, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_546 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39027((SubLObject)$ic737$, (SubLObject)UNPROVIDED);
                    module0656.f39813(var546);
                    module0642.f39027((SubLObject)$ic737$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_546, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_547 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0656.f39837((SubLObject)((NIL != var546) ? $ic834$ : $ic835$), (SubLObject)((NIL != var546) ? $ic836$ : $ic837$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            var546 = module0389.f27660();
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_548 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_549 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39019((SubLObject)$ic838$);
                }
                finally {
                    module0015.$g533$.rebind(var20_549, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_550 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39027((SubLObject)$ic737$, (SubLObject)UNPROVIDED);
                    module0656.f39813(var546);
                    module0642.f39027((SubLObject)$ic737$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_550, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_551 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0656.f39837((SubLObject)((NIL != var546) ? $ic839$ : $ic840$), (SubLObject)((NIL != var546) ? $ic836$ : $ic837$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            var546 = Equality.eql((SubLObject)ONE_INTEGER, module0414.$g3381$.getDynamicValue(var540));
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_552 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_553 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39019((SubLObject)$ic841$);
                }
                finally {
                    module0015.$g533$.rebind(var20_553, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_554 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39027((SubLObject)$ic737$, (SubLObject)UNPROVIDED);
                    module0656.f39813(var546);
                    module0642.f39027((SubLObject)$ic737$, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g533$.rebind(var20_554, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_555 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0656.f39837((SubLObject)((NIL != var546) ? $ic842$ : $ic843$), (SubLObject)((NIL != var546) ? $ic836$ : $ic837$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var545, var540);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        if (!var542.isPositive()) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic844$);
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var547 = module0414.f28870();
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != var547) {
            module0642.f39019((SubLObject)$ic845$);
            SubLObject var548 = var547;
            SubLObject var549 = (SubLObject)NIL;
            var549 = var548.first();
            while (NIL != var548) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0642.f39019(var549);
                var548 = var548.rest();
                var549 = var548.first();
            }
        }
        else {
            module0642.f39019((SubLObject)$ic846$);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var550 = module0414.f28871();
        module0642.f39026((SubLObject)UNPROVIDED);
        if (NIL != var550) {
            module0642.f39019((SubLObject)$ic847$);
            SubLObject var548 = var550;
            SubLObject var549 = (SubLObject)NIL;
            var549 = var548.first();
            while (NIL != var548) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)TWO_INTEGER);
                module0642.f39019(var549);
                var548 = var548.rest();
                var549 = var548.first();
            }
        }
        else {
            module0642.f39019((SubLObject)$ic848$);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var551 = module0414.f28894();
        final SubLObject var552 = module0414.f28901();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic849$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic850$, var551);
        module0642.f39026((SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic851$, var552);
        module0642.f39026((SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic852$, var542);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)TWO_INTEGER);
        if ($ic404$ == var521) {
            module0642.f39019((SubLObject)$ic853$);
        }
        else {
            module0656.f39837((SubLObject)$ic816$, (SubLObject)$ic854$, (SubLObject)$ic404$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var553 = module0414.f28896();
        final SubLObject var554 = module0414.f28903();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic855$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic850$, var553);
        module0642.f39026((SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic851$, var554);
        module0642.f39026((SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic852$, var543);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)TWO_INTEGER);
        if ($ic856$ == var521) {
            module0642.f39019((SubLObject)$ic853$);
        }
        else {
            module0656.f39837((SubLObject)$ic816$, (SubLObject)$ic854$, (SubLObject)$ic856$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        final SubLObject var555 = module0414.f28897();
        final SubLObject var556 = module0414.f28904();
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic857$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic850$, var555);
        module0642.f39026((SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic851$, var556);
        module0642.f39026((SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic852$, var544);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0642.f39032((SubLObject)TWO_INTEGER);
        if ($ic856$ == var521) {
            module0642.f39019((SubLObject)$ic853$);
        }
        else {
            module0656.f39837((SubLObject)$ic816$, (SubLObject)$ic854$, (SubLObject)$ic856$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0678.f41410();
        final SubLObject var557 = conses_high.copy_tree((SubLObject)$ic858$);
        SubLObject var548 = var541;
        SubLObject var558 = (SubLObject)NIL;
        var558 = var548.first();
        while (NIL != var548) {
            final SubLObject var559 = module0414.f28917(var558);
            final SubLObject var560 = Sequences.find(var559, var557, Symbols.symbol_function((SubLObject)$ic859$), Symbols.symbol_function((SubLObject)$ic860$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            ConsesLow.rplacd(var560, Numbers.add(var560.rest(), (SubLObject)ONE_INTEGER));
            var548 = var548.rest();
            var558 = var548.first();
        }
        module0642.f39026((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var561 = module0015.$g533$.currentBinding(var540);
        try {
            module0015.$g533$.bind((SubLObject)T, var540);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_556 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)FOUR_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_557 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39021((SubLObject)$ic861$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_558 = module0015.$g533$.currentBinding(var540);
            try {
                module0015.$g533$.bind((SubLObject)T, var540);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_559 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39021((SubLObject)$ic863$);
                }
                finally {
                    module0015.$g533$.rebind(var20_559, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_560 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39021((SubLObject)$ic864$);
                }
                finally {
                    module0015.$g533$.rebind(var20_560, var540);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g371$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)TWO_INTEGER);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_561 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39021((SubLObject)$ic865$);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var562 = module0048.f3381(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic866$), var557), (SubLObject)UNPROVIDED);
            SubLObject var563 = var557;
            SubLObject var564 = (SubLObject)NIL;
            var564 = var563.first();
            while (NIL != var563) {
                SubLObject var566;
                final SubLObject var565 = var566 = var564;
                SubLObject var567 = (SubLObject)NIL;
                SubLObject var568 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var566, var565, (SubLObject)$ic867$);
                var567 = var566.first();
                var566 = (var568 = var566.rest());
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_562 = module0015.$g533$.currentBinding(var540);
                try {
                    module0015.$g533$.bind((SubLObject)T, var540);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_563 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var540);
                        module0642.f39019(var567);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_563, var540);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_564 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var540);
                        module0642.f39019(var568);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_564, var540);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_565 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var540);
                        PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic868$, module0048.f3302(Numbers.divide(Numbers.truncate(Numbers.multiply((SubLObject)$ic212$, Numbers.divide(var568, var542)), (SubLObject)UNPROVIDED), (SubLObject)TEN_INTEGER), (SubLObject)THREE_INTEGER));
                    }
                    finally {
                        module0015.$g533$.rebind(var20_565, var540);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_566 = module0015.$g533$.currentBinding(var540);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var540);
                        module0642.f39093(var568, var562, (SubLObject)$ic869$, module0015.$g501$.getGlobalValue(), (SubLObject)NIL);
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
                module0642.f39029((SubLObject)UNPROVIDED);
                var563 = var563.rest();
                var564 = var563.first();
            }
        }
        finally {
            module0015.$g533$.rebind(var561, var540);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        module0642.f39026((SubLObject)TWO_INTEGER);
        final SubLObject var569 = var521;
        if (var569.eql((SubLObject)$ic856$)) {
            final SubLObject var570 = module0414.f28887(var539, (SubLObject)T, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic870$, var543, var539);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic816$, (SubLObject)$ic871$, (SubLObject)$ic812$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            SubLObject var571 = var570;
            SubLObject var572 = (SubLObject)NIL;
            var572 = var571.first();
            while (NIL != var571) {
                f41883(var572);
                var571 = var571.rest();
                var572 = var571.first();
            }
        }
        else if (var569.eql((SubLObject)$ic404$)) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var540), (SubLObject)$ic872$, var542, var539);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39032((SubLObject)TWO_INTEGER);
            module0656.f39837((SubLObject)$ic816$, (SubLObject)$ic871$, (SubLObject)$ic812$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var548 = var541;
            var558 = (SubLObject)NIL;
            var558 = var548.first();
            while (NIL != var548) {
                f41883(var558);
                var548 = var548.rest();
                var558 = var548.first();
            }
        }
        return Sequences.length(var541);
    }
    
    public static SubLObject f41883(final SubLObject var253) {
        module0642.f39026((SubLObject)TWO_INTEGER);
        f41884(var253, (SubLObject)$ic812$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0656.f39916(var253, (SubLObject)T, (SubLObject)T);
        return var253;
    }
    
    public static SubLObject f41884(final SubLObject var253, final SubLObject var585) {
        final SubLThread var586 = SubLProcess.currentSubLThread();
        final SubLObject var587 = module0414.f28895(var253);
        final SubLObject var588 = module0414.f28902(var253);
        final SubLObject var589 = module0414.f28907(var253, (SubLObject)UNPROVIDED);
        final SubLObject var590 = module0414.f28917(var253);
        if (var585.eql((SubLObject)$ic812$)) {
            f41885(var590);
            PrintLow.format(module0015.$g131$.getDynamicValue(var586), (SubLObject)$ic873$, new SubLObject[] { var588, var587, module0048.f3302(Numbers.multiply((SubLObject)$ic137$, var589), (SubLObject)FOUR_INTEGER), var590 });
        }
        else {
            f41885(var590);
            PrintLow.format(module0015.$g131$.getDynamicValue(var586), (SubLObject)$ic874$, var590);
            if (var587.isZero()) {
                module0642.f39019((SubLObject)$ic875$);
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var586), (SubLObject)$ic876$, new SubLObject[] { module0048.f3302(Numbers.multiply((SubLObject)$ic137$, var589), (SubLObject)FOUR_INTEGER), var588, var587 });
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
        final SubLObject var569 = Sequences.cconcatenate(var568, (SubLObject)$ic877$);
        final SubLObject var570 = Sequences.cconcatenate(module0006.f203(var568), (SubLObject)$ic878$);
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var567) {
            module0642.f39020(module0015.$g222$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0642.f39042(var567));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var571 = module0015.$g533$.currentBinding(var566);
        try {
            module0015.$g533$.bind((SubLObject)T, var566);
            f41676(var569, var570, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var571, var566);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41886(final SubLObject var565) {
        final SubLObject var566 = module0412.f28717((SubLObject)$ic879$);
        final SubLObject var567 = module0412.f28717((SubLObject)$ic880$);
        final SubLObject var568 = module0412.f28717((SubLObject)$ic881$);
        if (var565.numGE(var566)) {
            return Values.values((SubLObject)$ic882$, (SubLObject)$ic883$);
        }
        if (var565.numGE(var567)) {
            return Values.values((SubLObject)$ic884$, (SubLObject)$ic885$);
        }
        if (var565.numGE(var568)) {
            return Values.values((SubLObject)$ic601$, (SubLObject)$ic886$);
        }
        return Values.values((SubLObject)$ic601$, (SubLObject)$ic411$);
    }
    
    public static SubLObject f41887(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0389.f27662();
        return f41879((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41888(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic836$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic888$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41889(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0389.f27661();
        return f41879((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41890(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic837$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic891$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41891(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0414.f28874();
        return f41879((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41892(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic836$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic894$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41893(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0414.f28873();
        return f41879((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41894(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic837$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic897$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41895(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0414.$g3381$.setDynamicValue((SubLObject)ZERO_INTEGER);
        return f41879((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41896(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic836$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic900$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41897(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0414.$g3381$.setDynamicValue((SubLObject)ONE_INTEGER);
        return f41879((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41898(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic837$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic903$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41899(final SubLObject var116) {
        SubLObject var117 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var116, var116, (SubLObject)$ic905$);
        var117 = var116.first();
        final SubLObject var118 = var116.rest();
        if (NIL != var118) {
            cdestructuring_bind.cdestructuring_bind_error(var116, (SubLObject)$ic905$);
            return (SubLObject)NIL;
        }
        final SubLObject var119 = module0656.f39970(var117);
        if (NIL == var119) {
            return module0656.f39789((SubLObject)$ic906$, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0414.f28883(var119);
        return module0656.f39792((SubLObject)$ic907$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41900(final SubLObject var253, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic909$;
        }
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)$ic910$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)T, var254);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var257, var254);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var253;
    }
    
    public static SubLObject f41901(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0414.f28882();
        return f41879((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41902(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic914$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic915$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41903(final SubLObject var116) {
        final SubLObject var117 = module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic822$, var116));
        final SubLObject var118 = module0035.sublisp_boolean(module0642.f39104((SubLObject)$ic826$, var116));
        if (var117.eql(var118)) {
            return module0656.f39789((SubLObject)$ic917$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var117) {
            return f41904(var116);
        }
        if (NIL != var118) {
            return f41905(var116);
        }
        return module0656.f39789((SubLObject)$ic918$, var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41904(final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = module0642.f39104((SubLObject)$ic820$, var116);
        SubLObject var119 = (SubLObject)NIL;
        if (NIL != var118) {
            var118 = module0038.f2735(var118);
            if (NIL != module0038.f2610(var118)) {
                var118 = (SubLObject)NIL;
            }
        }
        if (NIL != var118) {
            var119 = (SubLObject)makeBoolean(NIL == Filesys.probe_file(var118));
        }
        if (NIL != var119) {
            return module0656.f39789((SubLObject)$ic920$, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var118) {
            return module0656.f39789((SubLObject)$ic921$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var120 = module0414.$g3380$.currentBinding(var117);
        try {
            module0414.$g3380$.bind((SubLObject)T, var117);
            module0414.f28936(var118, (SubLObject)T, (SubLObject)UNPROVIDED);
        }
        finally {
            module0414.$g3380$.rebind(var120, var117);
        }
        return f41880((SubLObject)NIL);
    }
    
    public static SubLObject f41905(final SubLObject var116) {
        SubLObject var117 = module0642.f39104((SubLObject)$ic824$, var116);
        SubLObject var118 = (SubLObject)NIL;
        if (NIL != var117) {
            var117 = module0038.f2735(var117);
            if (NIL != module0038.f2610(var117)) {
                var117 = (SubLObject)NIL;
            }
        }
        if (NIL != var117) {
            var118 = (SubLObject)makeBoolean(NIL == module0075.f5193(var117));
        }
        if (NIL != var118) {
            return module0656.f39789((SubLObject)$ic923$, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var117) {
            return module0656.f39789((SubLObject)$ic921$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0414.f28934(var117, (SubLObject)NIL);
        return module0656.f39793((SubLObject)$ic924$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41906(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        final SubLObject var118 = (SubLObject)$ic926$;
        final SubLObject var119 = module0015.$g538$.currentBinding(var117);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
            module0642.f39020((SubLObject)$ic230$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
            final SubLObject var120 = module0014.f672((SubLObject)$ic231$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic232$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var120) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var120);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic233$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var118) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var118);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var20_603 = module0015.$g535$.currentBinding(var117);
            try {
                module0015.$g535$.bind((SubLObject)T, var117);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var117)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic234$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_604 = module0015.$g533$.currentBinding(var117);
                try {
                    module0015.$g533$.bind((SubLObject)T, var117);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic535$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_605 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var117);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic536$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic537$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic538$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_605, var117);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var118) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var118);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    f41907((SubLObject)UNPROVIDED);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var20_604, var117);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var20_603, var117);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var119, var117);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41908(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic926$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic928$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41909(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var119;
        final SubLObject var118 = var119 = var116;
        SubLObject var120 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var119, var118, (SubLObject)$ic931$);
        var120 = var119.first();
        var119 = var119.rest();
        if (NIL == var119) {
            final SubLObject var121 = module0656.f39970(var120);
            final SubLObject var122 = module0413.f28851((SubLObject)UNPROVIDED);
            final SubLObject var123 = module0413.f28855(var121);
            final SubLObject var124 = module0413.f28856(var122);
            final SubLObject var125 = (SubLObject)$ic932$;
            final SubLObject var126 = module0015.$g538$.currentBinding(var117);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var117))) ? module0015.$g538$.getDynamicValue(var117) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var117);
                module0642.f39020((SubLObject)$ic230$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var117), module0655.$g5142$.getDynamicValue(var117));
                final SubLObject var127 = module0014.f672((SubLObject)$ic231$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic232$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var127) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var127);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic233$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var125) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var125);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var20_611 = module0015.$g535$.currentBinding(var117);
                try {
                    module0015.$g535$.bind((SubLObject)T, var117);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var117)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var117)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic234$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_612 = module0015.$g533$.currentBinding(var117);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var117);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic535$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_613 = module0015.$g533$.currentBinding(var117);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var117);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic536$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic537$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic538$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var20_613, var117);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var125) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var125);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        module0656.f39837((SubLObject)$ic933$, var121, (SubLObject)$ic592$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0656.f39837((SubLObject)$ic929$, (SubLObject)$ic934$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        f41910(var123, (SubLObject)$ic935$, var124, (SubLObject)UNPROVIDED);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var20_612, var117);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var20_611, var117);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var126, var117);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var118, (SubLObject)$ic931$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41911(final SubLObject var253, SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var254 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic937$;
        }
        assert NIL != module0178.f11290(var253) : var253;
        final SubLObject var255 = assertion_handles_oc.f11025(var253);
        final SubLObject var256 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)$ic938$, var255);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var256) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var256);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var257 = module0015.$g533$.currentBinding(var254);
        try {
            module0015.$g533$.bind((SubLObject)T, var254);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var257, var254);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var253;
    }
    
    public static SubLObject f41912(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0413.f28849();
        return f41906((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41913(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic941$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic942$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41914(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0413.$g3371$.setDynamicValue((SubLObject)T);
        return f41906((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41915(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic946$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic947$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41916(SubLObject var116) {
        if (var116 == UNPROVIDED) {
            var116 = (SubLObject)NIL;
        }
        module0413.$g3371$.setDynamicValue((SubLObject)NIL);
        return f41906((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41917(SubLObject var22) {
        if (var22 == UNPROVIDED) {
            var22 = (SubLObject)NIL;
        }
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (NIL == var22) {
            var22 = (SubLObject)$ic951$;
        }
        final SubLObject var24 = module0656.f39832((SubLObject)$ic11$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic952$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var24) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var24);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var25 = module0015.$g533$.currentBinding(var23);
        try {
            module0015.$g533$.bind((SubLObject)T, var23);
            module0642.f39019(var22);
        }
        finally {
            module0015.$g533$.rebind(var25, var23);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41907(SubLObject var614) {
        if (var614 == UNPROVIDED) {
            var614 = (SubLObject)NIL;
        }
        final SubLThread var615 = SubLProcess.currentSubLThread();
        final SubLObject var616 = module0413.f28851(var614);
        final SubLObject var617 = module0413.f28856(var616);
        module0656.f39837((SubLObject)$ic929$, (SubLObject)$ic592$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39032((SubLObject)UNPROVIDED);
        if (NIL != var616) {
            module0656.f39837((SubLObject)$ic943$, (SubLObject)$ic941$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
        }
        if (NIL != module0413.$g3371$.getDynamicValue(var615)) {
            module0656.f39837((SubLObject)$ic953$, (SubLObject)$ic951$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0656.f39837((SubLObject)$ic948$, (SubLObject)$ic946$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var616) {
            module0642.f39026((SubLObject)TWO_INTEGER);
            if (NIL != module0413.$g3371$.getDynamicValue(var615)) {
                module0642.f39019((SubLObject)$ic955$);
            }
            else {
                module0642.f39019((SubLObject)$ic956$);
            }
        }
        else {
            final SubLObject var619;
            final SubLObject var618 = var619 = var617;
            final SubLObject var620 = cdestructuring_bind.property_list_member((SubLObject)$ic957$, var619);
            final SubLObject var621 = (SubLObject)((NIL != var620) ? conses_high.cadr(var620) : NIL);
            final SubLObject var622 = cdestructuring_bind.property_list_member((SubLObject)$ic958$, var619);
            final SubLObject var623 = (SubLObject)((NIL != var622) ? conses_high.cadr(var622) : NIL);
            final SubLObject var624 = cdestructuring_bind.property_list_member((SubLObject)$ic959$, var619);
            final SubLObject var625 = (SubLObject)((NIL != var624) ? conses_high.cadr(var624) : NIL);
            final SubLObject var626 = cdestructuring_bind.property_list_member((SubLObject)$ic960$, var619);
            final SubLObject var627 = (SubLObject)((NIL != var626) ? conses_high.cadr(var626) : NIL);
            final SubLObject var628 = cdestructuring_bind.property_list_member((SubLObject)$ic961$, var619);
            final SubLObject var629 = (SubLObject)((NIL != var628) ? conses_high.cadr(var628) : NIL);
            final SubLObject var630 = cdestructuring_bind.property_list_member((SubLObject)$ic962$, var619);
            final SubLObject var631 = (SubLObject)((NIL != var630) ? conses_high.cadr(var630) : NIL);
            final SubLObject var632 = cdestructuring_bind.property_list_member((SubLObject)$ic963$, var619);
            final SubLObject var633 = (SubLObject)((NIL != var632) ? conses_high.cadr(var632) : NIL);
            final SubLObject var634 = cdestructuring_bind.property_list_member((SubLObject)$ic964$, var619);
            final SubLObject var635 = (SubLObject)((NIL != var634) ? conses_high.cadr(var634) : NIL);
            final SubLObject var636 = cdestructuring_bind.property_list_member((SubLObject)$ic965$, var619);
            final SubLObject var637 = (SubLObject)((NIL != var636) ? conses_high.cadr(var636) : NIL);
            module0642.f39026((SubLObject)TWO_INTEGER);
            module0642.f39020(module0015.$g346$.getGlobalValue());
            module0642.f39020(module0015.$g352$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var638 = module0015.$g533$.currentBinding(var615);
            try {
                module0015.$g533$.bind((SubLObject)T, var615);
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_636 = module0015.$g533$.currentBinding(var615);
                try {
                    module0015.$g533$.bind((SubLObject)T, var615);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_637 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var615);
                        module0642.f39021((SubLObject)$ic966$);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_638 = module0015.$g533$.currentBinding(var615);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var615);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_639 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_640 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(module0048.f3302(var623, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_640, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_641 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic967$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_642 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_643 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(var625);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_643, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_644 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic968$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_645 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_646 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(var621);
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_646, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_647 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic969$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
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
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_648 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var615);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_648, var615);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_649 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var615);
                        module0642.f39021((SubLObject)$ic970$);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_650 = module0015.$g533$.currentBinding(var615);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var615);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_651 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_652 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(module0048.f3302(var631, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_652, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_653 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic971$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_654 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_655 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(module0048.f3302(var627, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_655, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_656 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic972$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_657 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_658 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(module0048.f3302(var635, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_658, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_659 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic973$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
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
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_660 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var615);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                    }
                    finally {
                        module0015.$g533$.rebind(var20_660, var615);
                    }
                    module0642.f39020(module0015.$g361$.getGlobalValue());
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_661 = module0015.$g533$.currentBinding(var615);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var615);
                        module0642.f39021((SubLObject)$ic974$);
                        module0642.f39020(module0015.$g346$.getGlobalValue());
                        module0642.f39020(module0015.$g352$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)ZERO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_662 = module0015.$g533$.currentBinding(var615);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var615);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_663 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_664 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(module0048.f3302(var633, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_664, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_665 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic971$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_666 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_667 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(module0048.f3302(var629, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_667, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_668 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic972$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_669 = module0015.$g533$.currentBinding(var615);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var615);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_670 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019(module0048.f3302(var637, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_670, var615);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic409$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_671 = module0015.$g533$.currentBinding(var615);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var615);
                                    module0642.f39019((SubLObject)$ic973$);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var638, var615);
            }
            module0642.f39020(module0015.$g347$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            SubLObject var639 = (SubLObject)ZERO_INTEGER;
            SubLObject var640 = (SubLObject)NIL;
            SubLObject var641 = (SubLObject)NIL;
            SubLObject var642 = (SubLObject)NIL;
            var640 = var616;
            var641 = var640.first();
            for (var642 = (SubLObject)ZERO_INTEGER; NIL != var640; var640 = var640.rest(), var641 = var640.first(), var642 = Numbers.add((SubLObject)ONE_INTEGER, var642)) {
                if (NIL == var614 || var642.numL(var614)) {
                    final SubLObject var643 = conses_high.getf(var641, (SubLObject)$ic975$, (SubLObject)UNPROVIDED);
                    var639 = Numbers.add(var639, var643);
                    module0642.f39026((SubLObject)UNPROVIDED);
                    f41910(var641, $g5384$.getDynamicValue(var615), var617, var639);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41910(final SubLObject var609, final SubLObject var585, SubLObject var610, SubLObject var672) {
        if (var610 == UNPROVIDED) {
            var610 = (SubLObject)NIL;
        }
        if (var672 == UNPROVIDED) {
            var672 = (SubLObject)NIL;
        }
        final SubLThread var673 = SubLProcess.currentSubLThread();
        final SubLObject var675;
        final SubLObject var674 = var675 = var610;
        final SubLObject var676 = cdestructuring_bind.property_list_member((SubLObject)$ic958$, var675);
        final SubLObject var677 = (SubLObject)((NIL != var676) ? conses_high.cadr(var676) : NIL);
        final SubLObject var678 = cdestructuring_bind.property_list_member((SubLObject)$ic962$, var675);
        final SubLObject var679 = (SubLObject)((NIL != var678) ? conses_high.cadr(var678) : NIL);
        final SubLObject var680 = cdestructuring_bind.property_list_member((SubLObject)$ic963$, var675);
        final SubLObject var681 = (SubLObject)((NIL != var680) ? conses_high.cadr(var680) : NIL);
        final SubLObject var682 = cdestructuring_bind.property_list_member((SubLObject)$ic960$, var675);
        final SubLObject var683 = (SubLObject)((NIL != var682) ? conses_high.cadr(var682) : NIL);
        final SubLObject var684 = cdestructuring_bind.property_list_member((SubLObject)$ic961$, var675);
        final SubLObject var685 = (SubLObject)((NIL != var684) ? conses_high.cadr(var684) : NIL);
        final SubLObject var686 = cdestructuring_bind.property_list_member((SubLObject)$ic964$, var675);
        final SubLObject var687 = (SubLObject)((NIL != var686) ? conses_high.cadr(var686) : NIL);
        final SubLObject var688 = cdestructuring_bind.property_list_member((SubLObject)$ic965$, var675);
        final SubLObject var689 = (SubLObject)((NIL != var688) ? conses_high.cadr(var688) : NIL);
        SubLObject var690 = (SubLObject)NIL;
        SubLObject var691 = var609;
        SubLObject var692 = (SubLObject)NIL;
        SubLObject var689_690 = (SubLObject)NIL;
        while (NIL != var691) {
            cdestructuring_bind.destructuring_bind_must_consp(var691, var609, (SubLObject)$ic976$);
            var689_690 = var691.first();
            var691 = var691.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var691, var609, (SubLObject)$ic976$);
            if (NIL == conses_high.member(var689_690, (SubLObject)$ic977$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var692 = (SubLObject)T;
            }
            if (var689_690 == $ic36$) {
                var690 = var691.first();
            }
            var691 = var691.rest();
        }
        if (NIL != var692 && NIL == var690) {
            cdestructuring_bind.cdestructuring_bind_error(var609, (SubLObject)$ic976$);
        }
        final SubLObject var693 = cdestructuring_bind.property_list_member((SubLObject)$ic978$, var609);
        final SubLObject var694 = (SubLObject)((NIL != var693) ? conses_high.cadr(var693) : NIL);
        final SubLObject var695 = cdestructuring_bind.property_list_member((SubLObject)$ic975$, var609);
        final SubLObject var696 = (SubLObject)((NIL != var695) ? conses_high.cadr(var695) : NIL);
        final SubLObject var697 = cdestructuring_bind.property_list_member((SubLObject)$ic979$, var609);
        final SubLObject var698 = (SubLObject)((NIL != var697) ? conses_high.cadr(var697) : NIL);
        final SubLObject var699 = cdestructuring_bind.property_list_member((SubLObject)$ic980$, var609);
        final SubLObject var700 = (SubLObject)((NIL != var699) ? conses_high.cadr(var699) : NIL);
        final SubLObject var701 = cdestructuring_bind.property_list_member((SubLObject)$ic981$, var609);
        final SubLObject var702 = (SubLObject)((NIL != var701) ? conses_high.cadr(var701) : NIL);
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ONE_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var703 = module0015.$g533$.currentBinding(var673);
        try {
            module0015.$g533$.bind((SubLObject)T, var673);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_698 = module0015.$g533$.currentBinding(var673);
            try {
                module0015.$g533$.bind((SubLObject)T, var673);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic384$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_699 = module0015.$g533$.currentBinding(var673);
                try {
                    module0015.$g533$.bind((SubLObject)T, var673);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39020(module0015.$g352$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)ZERO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_700 = module0015.$g533$.currentBinding(var673);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var673);
                        if (NIL != var610 && NIL != var672) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_701 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var673);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_702 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var673);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic982$, module0048.f3302(Numbers.multiply((SubLObject)$ic137$, Numbers.divide(var672, var677)), (SubLObject)THREE_INTEGER));
                                    module0642.f39026((SubLObject)TWO_INTEGER);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_703 = module0015.$g533$.currentBinding(var673);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var673);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_704 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var673);
                                module0642.f39019(module0048.f3302(var696, (SubLObject)THREE_INTEGER));
                            }
                            finally {
                                module0015.$g533$.rebind(var20_704, var673);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_705 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var673);
                                module0642.f39019((SubLObject)$ic967$);
                                if (var677.isPositive()) {
                                    final SubLObject var704 = module0048.f3402(var696, var679, var681);
                                    if (var704.numG((SubLObject)ONE_INTEGER)) {
                                        final SubLObject var705 = (SubLObject)(var704.numG((SubLObject)TWO_INTEGER) ? $ic601$ : $ic383$);
                                        final SubLObject var706 = (SubLObject)(var704.numG((SubLObject)TWO_INTEGER) ? $ic983$ : $ic984$);
                                        module0642.f39032((SubLObject)UNPROVIDED);
                                        f41918(var705, var706, Numbers.truncate(var704, (SubLObject)UNPROVIDED));
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var20_706 = module0015.$g533$.currentBinding(var673);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var673);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_707 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var673);
                                module0642.f39019(var700);
                            }
                            finally {
                                module0015.$g533$.rebind(var20_707, var673);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_708 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var673);
                                module0642.f39019((SubLObject)$ic968$);
                                if (var677.isPositive()) {
                                    final SubLObject var704 = module0048.f3402(var700, var683, var685);
                                    if (var704.numG((SubLObject)ONE_INTEGER)) {
                                        module0642.f39032((SubLObject)UNPROVIDED);
                                        f41918((SubLObject)$ic383$, (SubLObject)$ic984$, Numbers.truncate(var704, (SubLObject)UNPROVIDED));
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
                        module0642.f39029((SubLObject)UNPROVIDED);
                        if (var700.isPositive()) {
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_709 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var673);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g371$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_710 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var673);
                                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                            final SubLObject var707 = Numbers.divide(var696, var700);
                            module0642.f39020(module0015.$g364$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var20_711 = module0015.$g533$.currentBinding(var673);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var673);
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic862$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_712 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var673);
                                    module0642.f39019(module0048.f3302(var707, (SubLObject)THREE_INTEGER));
                                }
                                finally {
                                    module0015.$g533$.rebind(var20_712, var673);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var20_713 = module0015.$g533$.currentBinding(var673);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var673);
                                    module0642.f39019((SubLObject)$ic985$);
                                    if (var677.isPositive()) {
                                        final SubLObject var708 = module0048.f3402(var707, var687, var689);
                                        if (var708.numG((SubLObject)ONE_INTEGER)) {
                                            module0642.f39032((SubLObject)UNPROVIDED);
                                            f41918((SubLObject)$ic601$, (SubLObject)$ic983$, Numbers.truncate(var708, (SubLObject)UNPROVIDED));
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
                            module0642.f39029((SubLObject)UNPROVIDED);
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
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic986$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_714 = module0015.$g533$.currentBinding(var673);
                try {
                    module0015.$g533$.bind((SubLObject)T, var673);
                    module0656.f39916(var694, (SubLObject)T, (SubLObject)T);
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
            module0642.f39029((SubLObject)UNPROVIDED);
            if (NIL != var702 || NIL != var698) {
                module0642.f39020(module0015.$g364$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var20_715 = module0015.$g533$.currentBinding(var673);
                try {
                    module0015.$g533$.bind((SubLObject)T, var673);
                    module0642.f39020(module0015.$g360$.getGlobalValue());
                    module0642.f39020(module0015.$g371$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)TWO_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g370$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic268$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g373$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049((SubLObject)$ic218$));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var20_716 = module0015.$g533$.currentBinding(var673);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var673);
                        if ($ic935$ != var585) {
                            module0656.f39837((SubLObject)$ic933$, var694, (SubLObject)$ic987$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                        }
                        if (NIL != var702) {
                            var673.resetMultipleValues();
                            final SubLObject var709 = f41919(var702);
                            final SubLObject var710 = var673.secondMultipleValue();
                            final SubLObject var711 = var673.thirdMultipleValue();
                            var673.resetMultipleValues();
                            module0642.f39019((SubLObject)$ic988$);
                            if (NIL != var709) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic989$, Sequences.length(var709));
                            }
                            if (NIL != var710) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic990$, Sequences.length(var710));
                            }
                            if (NIL != var711) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic991$, Sequences.length(var711));
                            }
                            if ($ic935$ == var585) {
                                if (NIL != var709) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    if (NIL != var710 || NIL != var711) {
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic992$);
                                    }
                                    SubLObject var712 = var709;
                                    SubLObject var713 = (SubLObject)NIL;
                                    var713 = var712.first();
                                    while (NIL != var712) {
                                        f41920(var713);
                                        var712 = var712.rest();
                                        var713 = var712.first();
                                    }
                                }
                                if (NIL != var710) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    if (NIL != var709 || NIL != var711) {
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic993$);
                                    }
                                    SubLObject var712 = var710;
                                    SubLObject var713 = (SubLObject)NIL;
                                    var713 = var712.first();
                                    while (NIL != var712) {
                                        f41920(var713);
                                        var712 = var712.rest();
                                        var713 = var712.first();
                                    }
                                }
                                if (NIL != var711) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    if (NIL != var709 || NIL != var710) {
                                        PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic994$);
                                    }
                                    SubLObject var712 = var711;
                                    SubLObject var713 = (SubLObject)NIL;
                                    var713 = var712.first();
                                    while (NIL != var712) {
                                        f41920(var713);
                                        var712 = var712.rest();
                                        var713 = var712.first();
                                    }
                                }
                            }
                        }
                        if (NIL != var698) {
                            var673.resetMultipleValues();
                            final SubLObject var714 = f41921(var698, var694);
                            final SubLObject var715 = var673.secondMultipleValue();
                            var673.resetMultipleValues();
                            if (NIL != var702) {
                                if ($ic935$ == var585) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                }
                                else {
                                    module0642.f39032((SubLObject)FOUR_INTEGER);
                                }
                            }
                            module0642.f39019((SubLObject)$ic995$);
                            if (NIL != var714) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic996$, Sequences.length(var714));
                            }
                            if (NIL != var715) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic997$, Sequences.length(var715));
                            }
                            if ($ic935$ == var585) {
                                if (NIL != var714) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic998$);
                                    SubLObject var716 = var714;
                                    SubLObject var717 = (SubLObject)NIL;
                                    var717 = var716.first();
                                    while (NIL != var716) {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        module0656.f39916(var717, (SubLObject)T, (SubLObject)T);
                                        var716 = var716.rest();
                                        var717 = var716.first();
                                    }
                                }
                                if (NIL != var715) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var673), (SubLObject)$ic999$);
                                    SubLObject var716 = var715;
                                    SubLObject var717 = (SubLObject)NIL;
                                    var717 = var716.first();
                                    while (NIL != var716) {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        module0656.f39916(var717, (SubLObject)T, (SubLObject)T);
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
                module0642.f39029((SubLObject)UNPROVIDED);
            }
        }
        finally {
            module0015.$g533$.rebind(var703, var673);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41920(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0656.f39837((SubLObject)$ic1000$, var1, (SubLObject)$ic1001$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic1002$, inference_datastructures_inference_oc.f25531(var1));
        module0642.f39032((SubLObject)UNPROVIDED);
        return var1;
    }
    
    public static SubLObject f41922(final SubLObject var253) {
        final SubLThread var254 = SubLProcess.currentSubLThread();
        final SubLObject var255 = module0413.f28855(var253);
        final SubLObject var257;
        final SubLObject var256 = var257 = var255;
        final SubLObject var258 = cdestructuring_bind.property_list_member((SubLObject)$ic975$, var257);
        final SubLObject var259 = (SubLObject)((NIL != var258) ? conses_high.cadr(var258) : NIL);
        final SubLObject var260 = cdestructuring_bind.property_list_member((SubLObject)$ic980$, var257);
        final SubLObject var261 = (SubLObject)((NIL != var260) ? conses_high.cadr(var260) : NIL);
        final SubLObject var262 = cdestructuring_bind.property_list_member((SubLObject)$ic979$, var257);
        final SubLObject var263 = (SubLObject)((NIL != var262) ? conses_high.cadr(var262) : NIL);
        final SubLObject var264 = cdestructuring_bind.property_list_member((SubLObject)$ic981$, var257);
        final SubLObject var265 = (SubLObject)((NIL != var264) ? conses_high.cadr(var264) : NIL);
        PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)$ic1003$, module0048.f3302(var259, (SubLObject)FOUR_INTEGER));
        if (var261.isZero()) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)$ic875$);
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var254), (SubLObject)$ic1004$, var261, module0048.f3302(Numbers.divide(var259, var261), (SubLObject)FOUR_INTEGER));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41919(final SubLObject var153) {
        SubLObject var154 = (SubLObject)NIL;
        SubLObject var155 = (SubLObject)NIL;
        SubLObject var156 = (SubLObject)NIL;
        SubLObject var157 = var153;
        SubLObject var158 = (SubLObject)NIL;
        var158 = var157.first();
        while (NIL != var157) {
            final SubLObject var159 = inference_datastructures_inference_oc.f25670(var158);
            if (var159.eql((SubLObject)$ic1005$)) {
                var154 = (SubLObject)ConsesLow.cons(var158, var154);
            }
            else if (var159.eql((SubLObject)$ic1006$)) {
                var155 = (SubLObject)ConsesLow.cons(var158, var155);
            }
            else if (var159.eql((SubLObject)$ic1007$)) {
                var156 = (SubLObject)ConsesLow.cons(var158, var156);
            }
            var157 = var157.rest();
            var158 = var157.first();
        }
        return Values.values(var154, var155, var156);
    }
    
    public static SubLObject f41921(final SubLObject var733, final SubLObject var734) {
        SubLObject var735 = (SubLObject)NIL;
        SubLObject var736 = (SubLObject)NIL;
        SubLObject var737 = var733;
        SubLObject var738 = (SubLObject)NIL;
        var738 = var737.first();
        while (NIL != var737) {
            if (NIL != module0211.f13667(var738, var734)) {
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
        if (var737 == UNPROVIDED) {
            var737 = (SubLObject)$ic601$;
        }
        if (var708 == UNPROVIDED) {
            var708 = (SubLObject)$ic984$;
        }
        if (var738 == UNPROVIDED) {
            var738 = (SubLObject)ONE_INTEGER;
        }
        final SubLThread var739 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g207$.getGlobalValue());
        module0642.f39020(module0015.$g240$.getGlobalValue());
        module0642.f39020(module0015.$g149$.getGlobalValue());
        module0642.f39020(module0015.$g152$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39048(var737);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var740 = module0015.$g533$.currentBinding(var739);
        try {
            module0015.$g533$.bind((SubLObject)T, var739);
            final SubLObject var741 = var708;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var741) {
                module0642.f39020(module0015.$g222$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39042(var741));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var20_739 = module0015.$g533$.currentBinding(var739);
            try {
                module0015.$g533$.bind((SubLObject)T, var739);
                SubLObject var742;
                for (var742 = (SubLObject)NIL, var742 = (SubLObject)ZERO_INTEGER; var742.numL(var738); var742 = Numbers.add(var742, (SubLObject)ONE_INTEGER)) {
                    module0642.f39019((SubLObject)$ic1008$);
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
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41924() {
        $g5352$ = SubLFiles.deflexical("S#45880", (SubLObject)T);
        $g5353$ = SubLFiles.deflexical("S#45881", (SubLObject)$ic26$);
        $g5354$ = SubLFiles.deflexical("S#45882", (NIL != Symbols.boundp((SubLObject)$ic28$)) ? $g5354$.getGlobalValue() : module0067.f4880((SubLObject)EQ, (SubLObject)UNPROVIDED));
        $g5355$ = SubLFiles.deflexical("S#45883", (SubLObject)FOUR_INTEGER);
        $g5356$ = SubLFiles.defvar("S#45884", (SubLObject)NIL);
        $g5357$ = SubLFiles.defvar("S#45885", (SubLObject)NIL);
        $g5358$ = SubLFiles.defparameter("S#45886", $ic307$);
        $g5359$ = SubLFiles.defparameter("S#45887", (SubLObject)ConsesLow.listS($ic309$, $g5358$.getDynamicValue(), (SubLObject)$ic310$));
        $g5360$ = SubLFiles.deflexical("S#45888", (SubLObject)$ic313$);
        $g5325$ = SubLFiles.defparameter("S#45889", (SubLObject)NIL);
        $g5361$ = SubLFiles.deflexical("S#45890", (SubLObject)$ic360$);
        $g5362$ = SubLFiles.deflexical("S#45891", (SubLObject)$ic366$);
        $g5364$ = SubLFiles.deflexical("S#45892", (SubLObject)$ic371$);
        $g5365$ = SubLFiles.deflexical("S#45893", (SubLObject)$ic373$);
        $g5366$ = SubLFiles.deflexical("S#45894", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic133$, Numbers.integerDivide(module0360.$g3047$.getGlobalValue(), (SubLObject)$ic137$), (SubLObject)$ic376$)));
        $g5367$ = SubLFiles.deflexical("S#45895", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)$ic138$, Numbers.integerDivide(module0360.$g3044$.getGlobalValue(), (SubLObject)$ic137$), (SubLObject)$ic376$)));
        $g5368$ = SubLFiles.deflexical("S#45896", (SubLObject)NIL);
        $g5369$ = SubLFiles.deflexical("S#45897", (SubLObject)$ic377$);
        $g5363$ = SubLFiles.deflexical("S#45898", ConsesLow.append(new SubLObject[] { $g5361$.getGlobalValue(), $g5364$.getGlobalValue(), $g5365$.getGlobalValue(), $g5366$.getGlobalValue(), $g5367$.getGlobalValue(), $g5369$.getGlobalValue() }));
        $g5370$ = SubLFiles.deflexical("S#45899", Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic368$), $g5363$.getGlobalValue()));
        $g5371$ = SubLFiles.deflexical("S#45900", (SubLObject)$ic389$);
        $g5372$ = SubLFiles.deflexical("S#45901", (SubLObject)$ic390$);
        $g5373$ = SubLFiles.deflexical("S#45902", (SubLObject)$ic391$);
        $g5374$ = SubLFiles.deflexical("S#45903", (SubLObject)$ic392$);
        $g5375$ = SubLFiles.deflexical("S#45904", (SubLObject)$ic401$);
        $g5376$ = SubLFiles.deflexical("S#45905", $ic524$);
        $g5377$ = SubLFiles.deflexical("S#45906", (SubLObject)$ic530$);
        $g5378$ = SubLFiles.deflexical("S#45907", (SubLObject)NIL);
        $g5379$ = SubLFiles.deflexical("S#45908", (SubLObject)THREE_INTEGER);
        $g5380$ = SubLFiles.deflexical("S#45909", (SubLObject)TEN_INTEGER);
        $g5384$ = SubLFiles.defparameter("S#45910", (SubLObject)$ic812$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41925() {
        module0656.f39840((SubLObject)$ic12$, (SubLObject)$ic13$, (SubLObject)TWO_INTEGER);
        module0003.f57((SubLObject)$ic28$);
        module0001.f5((SubLObject)$ic39$, (SubLObject)$ic40$);
        module0002.f50((SubLObject)$ic37$, (SubLObject)$ic39$);
        f41700((SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)$ic48$, (SubLObject)$ic49$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic50$, (SubLObject)$ic51$, (SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic54$, (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic58$, (SubLObject)$ic59$, (SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic62$, (SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic53$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic69$, (SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic73$, (SubLObject)$ic74$, (SubLObject)$ic75$, (SubLObject)$ic76$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)$ic79$, (SubLObject)$ic80$, (SubLObject)$ic81$, (SubLObject)NIL);
        f41700((SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)$ic84$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic86$, (SubLObject)$ic87$, (SubLObject)$ic88$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic89$, (SubLObject)$ic90$, (SubLObject)$ic91$, (SubLObject)$ic92$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)$ic95$, (SubLObject)$ic96$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic97$, (SubLObject)$ic98$, (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic101$, (SubLObject)$ic102$, (SubLObject)$ic103$, (SubLObject)$ic104$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)$ic107$, (SubLObject)$ic104$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic108$, (SubLObject)$ic109$, (SubLObject)$ic110$, (SubLObject)$ic104$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic111$, (SubLObject)$ic112$, (SubLObject)$ic113$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic114$, (SubLObject)$ic115$, (SubLObject)$ic116$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic117$, (SubLObject)$ic118$, (SubLObject)$ic119$, (SubLObject)$ic120$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic121$, (SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)$ic124$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic125$, (SubLObject)$ic126$, (SubLObject)$ic127$, (SubLObject)$ic128$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic129$, (SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic132$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic133$, (SubLObject)$ic134$, (SubLObject)$ic135$, (SubLObject)$ic136$, (SubLObject)$ic137$, (SubLObject)T);
        f41700((SubLObject)$ic138$, (SubLObject)$ic139$, (SubLObject)$ic140$, (SubLObject)$ic141$, (SubLObject)$ic137$, (SubLObject)T);
        f41700((SubLObject)$ic142$, (SubLObject)$ic143$, (SubLObject)$ic144$, (SubLObject)$ic145$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic146$, (SubLObject)$ic147$, (SubLObject)$ic148$, (SubLObject)$ic149$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic150$, (SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)$ic153$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic154$, (SubLObject)$ic155$, (SubLObject)$ic156$, (SubLObject)$ic157$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic158$, (SubLObject)$ic159$, (SubLObject)$ic160$, (SubLObject)$ic161$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic162$, (SubLObject)$ic163$, (SubLObject)$ic164$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic165$, (SubLObject)$ic166$, (SubLObject)$ic167$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic168$, (SubLObject)$ic169$, (SubLObject)$ic170$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic171$, (SubLObject)$ic172$, (SubLObject)$ic173$, (SubLObject)$ic174$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic175$, (SubLObject)$ic176$, (SubLObject)$ic177$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic178$, (SubLObject)$ic179$, (SubLObject)$ic180$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic181$, (SubLObject)$ic182$, (SubLObject)$ic183$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic184$, (SubLObject)$ic185$, (SubLObject)$ic186$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        f41700((SubLObject)$ic187$, (SubLObject)$ic188$, (SubLObject)$ic189$, (SubLObject)$ic85$, (SubLObject)NIL, (SubLObject)NIL);
        module0012.f441((SubLObject)$ic198$);
        module0015.f873((SubLObject)$ic213$);
        Hashtables.sethash((SubLObject)$ic214$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic215$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic214$, (SubLObject)$ic219$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic214$, (SubLObject)$ic216$, (SubLObject)$ic216$, (SubLObject)$ic220$);
        Hashtables.sethash((SubLObject)$ic243$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)NIL));
        module0012.f441((SubLObject)$ic308$);
        module0012.f444((SubLObject)$ic308$);
        module0012.f441((SubLObject)$ic311$);
        module0012.f444((SubLObject)$ic311$);
        module0012.f441((SubLObject)$ic341$);
        module0012.f444((SubLObject)$ic341$);
        module0015.f873((SubLObject)$ic448$);
        module0656.f39840((SubLObject)$ic433$, (SubLObject)$ic452$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic453$);
        module0656.f39840((SubLObject)$ic422$, (SubLObject)$ic456$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic472$);
        module0656.f39840((SubLObject)$ic495$, (SubLObject)$ic496$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic498$);
        module0656.f39840((SubLObject)$ic505$, (SubLObject)$ic506$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic507$);
        module0656.f39840((SubLObject)$ic512$, (SubLObject)$ic513$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic515$);
        module0656.f39840((SubLObject)$ic519$, (SubLObject)$ic520$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic521$);
        module0015.f873((SubLObject)$ic528$);
        module0015.f873((SubLObject)$ic529$);
        Hashtables.sethash((SubLObject)$ic531$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic532$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic531$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic532$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic588$);
        module0015.f873((SubLObject)$ic612$);
        module0656.f39840((SubLObject)$ic593$, (SubLObject)$ic615$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic604$, (SubLObject)$ic618$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic620$);
        module0015.f873((SubLObject)$ic622$);
        module0656.f39840((SubLObject)$ic272$, (SubLObject)$ic625$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic626$);
        module0656.f39840((SubLObject)$ic282$, (SubLObject)$ic629$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic630$);
        module0656.f39840((SubLObject)$ic595$, (SubLObject)$ic632$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic633$);
        module0656.f39840((SubLObject)$ic597$, (SubLObject)$ic635$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic636$);
        module0656.f39840((SubLObject)$ic639$, (SubLObject)$ic640$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic641$);
        module0656.f39840((SubLObject)$ic644$, (SubLObject)$ic645$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic646$);
        module0656.f39840((SubLObject)$ic648$, (SubLObject)$ic649$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic652$);
        module0656.f39840((SubLObject)$ic656$, (SubLObject)$ic657$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic658$);
        module0656.f39840((SubLObject)$ic274$, (SubLObject)$ic661$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic662$);
        module0656.f39840((SubLObject)$ic665$, (SubLObject)$ic666$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic668$);
        module0656.f39840((SubLObject)$ic270$, (SubLObject)$ic671$, (SubLObject)ONE_INTEGER);
        module0656.f39840((SubLObject)$ic675$, (SubLObject)$ic676$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic678$);
        module0656.f39840((SubLObject)$ic607$, (SubLObject)$ic687$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic688$);
        module0015.f873((SubLObject)$ic717$);
        Hashtables.sethash((SubLObject)$ic721$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic722$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic745$);
        module0656.f39840((SubLObject)$ic606$, (SubLObject)$ic748$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic750$);
        module0656.f39840((SubLObject)$ic608$, (SubLObject)$ic769$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic774$);
        module0656.f39840((SubLObject)$ic610$, (SubLObject)$ic777$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic803$);
        module0656.f39840((SubLObject)$ic808$, (SubLObject)$ic809$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic813$);
        module0656.f39840((SubLObject)$ic816$, (SubLObject)$ic829$, (SubLObject)TWO_INTEGER);
        module0667.f40552((SubLObject)$ic816$, (SubLObject)$ic388$, (SubLObject)$ic830$, (SubLObject)$ic831$, (SubLObject)ZERO_INTEGER, (SubLObject)$ic8$, (SubLObject)$ic814$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0015.f873((SubLObject)$ic887$);
        module0656.f39840((SubLObject)$ic839$, (SubLObject)$ic889$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic890$);
        module0656.f39840((SubLObject)$ic840$, (SubLObject)$ic892$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic893$);
        module0656.f39840((SubLObject)$ic834$, (SubLObject)$ic895$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic896$);
        module0656.f39840((SubLObject)$ic835$, (SubLObject)$ic898$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic899$);
        module0656.f39840((SubLObject)$ic842$, (SubLObject)$ic901$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic902$);
        module0656.f39840((SubLObject)$ic843$, (SubLObject)$ic904$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic908$);
        module0656.f39840((SubLObject)$ic911$, (SubLObject)$ic912$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic913$);
        module0656.f39840((SubLObject)$ic817$, (SubLObject)$ic916$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic919$);
        module0015.f873((SubLObject)$ic922$);
        module0015.f873((SubLObject)$ic925$);
        module0015.f873((SubLObject)$ic927$);
        module0656.f39840((SubLObject)$ic929$, (SubLObject)$ic930$, (SubLObject)ONE_INTEGER);
        module0667.f40552((SubLObject)$ic929$, (SubLObject)$ic388$, (SubLObject)$ic830$, (SubLObject)$ic928$, (SubLObject)ZERO_INTEGER, (SubLObject)$ic8$, (SubLObject)$ic926$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0015.f873((SubLObject)$ic936$);
        module0656.f39840((SubLObject)$ic933$, (SubLObject)$ic939$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic940$);
        module0656.f39840((SubLObject)$ic943$, (SubLObject)$ic944$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic945$);
        module0656.f39840((SubLObject)$ic948$, (SubLObject)$ic949$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic950$);
        module0656.f39840((SubLObject)$ic953$, (SubLObject)$ic954$, (SubLObject)ONE_INTEGER);
        return (SubLObject)NIL;
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
        $g5352$ = null;
        $g5353$ = null;
        $g5354$ = null;
        $g5355$ = null;
        $g5356$ = null;
        $g5357$ = null;
        $g5358$ = null;
        $g5359$ = null;
        $g5360$ = null;
        $g5325$ = null;
        $g5361$ = null;
        $g5362$ = null;
        $g5364$ = null;
        $g5365$ = null;
        $g5366$ = null;
        $g5367$ = null;
        $g5368$ = null;
        $g5369$ = null;
        $g5363$ = null;
        $g5370$ = null;
        $g5371$ = null;
        $g5372$ = null;
        $g5373$ = null;
        $g5374$ = null;
        $g5375$ = null;
        $g5376$ = null;
        $g5377$ = null;
        $g5378$ = null;
        $g5379$ = null;
        $g5380$ = null;
        $g5384$ = null;
        $ic0$ = makeSymbol("INFERENCE-P");
        $ic1$ = makeString("-");
        $ic2$ = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#45911", "CYC"), (SubLObject)makeSymbol("S#45912", "CYC"));
        $ic4$ = makeString("nd();");
        $ic5$ = makeString("  ");
        $ic6$ = makeString("");
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#1628", "CYC"), (SubLObject)makeSymbol("S#1629", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#1553", "CYC"), (SubLObject)makeKeyword("MAIN")), (SubLObject)makeSymbol("S#43330", "CYC"), (SubLObject)makeSymbol("S#1633", "CYC"), (SubLObject)makeSymbol("S#896", "CYC"), (SubLObject)makeSymbol("S#42997", "CYC"));
        $ic8$ = makeKeyword("MAIN");
        $ic9$ = makeSymbol("S#43673", "CYC");
        $ic10$ = makeKeyword("DOC");
        $ic11$ = makeKeyword("SELF");
        $ic12$ = makeKeyword("INFERENCE-DOC");
        $ic13$ = makeSymbol("S#45700", "CYC");
        $ic14$ = makeString("None");
        $ic15$ = makeString("~D total");
        $ic16$ = makeString(", ");
        $ic17$ = makeString("~D new");
        $ic18$ = makeString("~D new justification~P");
        $ic19$ = makeKeyword("TAUTOLOGY");
        $ic20$ = makeKeyword("CONTRADICTION");
        $ic21$ = makeKeyword("SUSPENDED-INITIAL-JUSTIFICATION");
        $ic22$ = makeString("[Explain]");
        $ic23$ = makeKeyword("SUSPENDED");
        $ic24$ = makeString("More...");
        $ic25$ = makeString("help/inference/");
        $ic26$ = makeString("inference-overview");
        $ic27$ = makeString(".html#");
        $ic28$ = makeSymbol("S#45882", "CYC");
        $ic29$ = makeKeyword("FANCY-NAME");
        $ic30$ = makeKeyword("DESCRIPTION");
        $ic31$ = makeKeyword("SETTINGS");
        $ic32$ = makeKeyword("SCALING-FACTOR");
        $ic33$ = makeKeyword("ROUND-ON-INPUT?");
        $ic34$ = ConsesLow.list((SubLObject)makeSymbol("S#723", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#668", "CYC"), (SubLObject)makeSymbol("S#669", "CYC"), (SubLObject)makeSymbol("S#9138", "CYC"), (SubLObject)makeSymbol("S#30807", "CYC"), (SubLObject)makeSymbol("S#45913", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("FANCY-NAME"), (SubLObject)makeKeyword("DESCRIPTION"), (SubLObject)makeKeyword("SETTINGS"), (SubLObject)makeKeyword("SCALING-FACTOR"), (SubLObject)makeKeyword("ROUND-ON-INPUT?"));
        $ic36$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = makeSymbol("S#45715", "CYC");
        $ic38$ = makeSymbol("QUOTE");
        $ic39$ = makeSymbol("S#45714", "CYC");
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#723", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic41$ = makeSymbol("KEYWORDP");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("TRUE"), (SubLObject)makeString("")));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("S#1625", "CYC"), (SubLObject)makeSymbol("S#43330", "CYC"));
        $ic44$ = makeKeyword("VALUE");
        $ic45$ = makeKeyword("ENTRY");
        $ic46$ = makeKeyword("MAX-NUMBER");
        $ic47$ = makeString("Number cutoff");
        $ic48$ = makeString("This controls how many answers we want to find before suspending.");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeString("answers")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("Get everything")));
        $ic50$ = makeKeyword("MAX-TIME");
        $ic51$ = makeString("Time cutoff");
        $ic52$ = makeString("This controls how long we allow an inference to run before suspending.");
        $ic53$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeString("seconds")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("Run forever")));
        $ic54$ = makeKeyword("MAX-STEP");
        $ic55$ = makeString("Step cutoff");
        $ic56$ = makeString("This controls how many inference steps we allow before suspending.");
        $ic57$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeString("steps")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No limit")));
        $ic58$ = makeKeyword("INFERENCE-MODE");
        $ic59$ = makeString("Inference engine mode");
        $ic60$ = makeString("This controls what mode the inference engine will operate under; roughly, how deep it will search for an answer before giving up.  This is a meta-property that controls many other low-level inference settings.");
        $ic61$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeString("Minimal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("SHALLOW"), (SubLObject)makeString("Shallow")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("EXTENDED"), (SubLObject)makeString("Extended")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("MAXIMAL"), (SubLObject)makeString("Maximal")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("CUSTOM"), (SubLObject)makeString("Debug")));
        $ic62$ = makeKeyword("FORWARD-MAX-TIME");
        $ic63$ = makeString("Forward time cutoff");
        $ic64$ = makeString("This controls how long we allow forward inference in the mt of an inference to run before starting the backward inference.  This is usually only used for hypothetical queries.");
        $ic65$ = makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic66$ = makeString("Transformation cutoff");
        $ic67$ = makeString("This specifies the maximum allowable number of transformation steps in answers.");
        $ic68$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeString("transformation steps (at most)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("Unlimited transformation")));
        $ic69$ = makeKeyword("MIN-RULE-UTILITY");
        $ic70$ = makeString("Rule utility threshold");
        $ic71$ = makeString("This specifies the minimum allowable utility of a rule used in transformation, from -100 to +100.");
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("S#28200", "CYC"), (SubLObject)makeString("minimum rule utility")));
        $ic73$ = makeKeyword("MAX-PROOF-DEPTH");
        $ic74$ = makeString("Proof complexity cutoff");
        $ic75$ = makeString("This specifies the maximum allowable number of steps in proofs for answers.");
        $ic76$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeString("proof steps (at most)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No limit")));
        $ic77$ = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $ic78$ = makeString("Probably Done cutoff");
        $ic79$ = makeString("Probably Approximately Done: This controls how sure the Strategist must be that an inference will yield no more results before terminating it.  The Strategist uses past experience to make this determination.");
        $ic80$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("S#4707", "CYC"), (SubLObject)makeString("%")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeInteger(100), (SubLObject)makeString("100 %")));
        $ic81$ = (SubLFloat)makeDouble(0.01);
        $ic82$ = makeKeyword("BLOCK?");
        $ic83$ = makeString("Step by step");
        $ic84$ = makeString("This controls whether the inference will be run one step at a time, waiting for the user to click between each step.\nYou'll probably want to turn the time cutoff to 'run forever' if you want to go step by step.");
        $ic85$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)T, (SubLObject)makeString("Yes")));
        $ic86$ = makeKeyword("CACHE-INFERENCE-RESULTS?");
        $ic87$ = makeString("Cache backward query results");
        $ic88$ = makeString("This controls whether or not the proofs for successful inference answers are cached\nas deductions for assertions in the KB.");
        $ic89$ = makeKeyword("ANSWER-LANGUAGE");
        $ic90$ = makeString("Answer language");
        $ic91$ = makeString("This controls the CycL language used to express answers.");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("HL"), (SubLObject)makeString("HL")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("EL"), (SubLObject)makeString("EL")));
        $ic93$ = makeKeyword("CONTINUABLE?");
        $ic94$ = makeString("Continuable");
        $ic95$ = makeString("This controls whether the inference is continuable or not.");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No (allows strengthening)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)T, (SubLObject)makeString("Yes")));
        $ic97$ = makeKeyword("METRICS");
        $ic98$ = makeString("Metrics");
        $ic99$ = makeString("This controls which metrics are gathered while the inference is running.");
        $ic100$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("None")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("S#3341", "CYC"), (SubLObject)makeString("")));
        $ic101$ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
        $ic102$ = makeString("Allow HL predicate transformation");
        $ic103$ = makeString("Whether transformation is allowed on literals with HL predicates (e.g. #$isa, #$genls, #$equals, etc.)");
        $ic104$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)T, (SubLObject)makeString("Yes (expensive)")));
        $ic105$ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
        $ic106$ = makeString("Allow unbound predicate rule backchaining");
        $ic107$ = makeString("Whether it is permissible to use rules that conclude to literals with variable predicates.");
        $ic108$ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $ic109$ = makeString("Allow evaluatable predicate transformation");
        $ic110$ = makeString("Whether transformation is allowed on literals with evaluatable predicates (e.g. #$different, #$greaterThan, #$substring, etc.)");
        $ic111$ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic112$ = makeString("Allow result bindings to indeterminates");
        $ic113$ = makeString("Whether it is permissible to use quoted instances of #$IndeterminateTerm for result bindings.\n   Note that quoted instances of #$IndeterminateTerm will always be used for explicitly scoped variables \n   (e.g. scoped by #$thereExists, etc.).");
        $ic114$ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
        $ic115$ = makeString("Allow abnormality checking?");
        $ic116$ = makeString("Whether to check for exceptions to top-level proofs, e.g. exceptions to rules in transformation proofs.");
        $ic117$ = makeKeyword("TRANSITIVE-CLOSURE-MODE");
        $ic118$ = makeString("Transitive closure mode");
        $ic119$ = makeString("The degree to which modules (such as transitiveViaArg) should generate transitive closures. ");
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("NONE"), (SubLObject)makeString("No closures")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("FOCUSED"), (SubLObject)makeString("Focused closures (expensive)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("ALL"), (SubLObject)makeString("Full closures (very expensive)")));
        $ic121$ = makeKeyword("RESULT-UNIQUENESS");
        $ic122$ = makeString("Result uniqueness is based on");
        $ic123$ = makeString("If result uniqueness is based on different bindings, it won't bother to prove the same thing using different methods.");
        $ic124$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("BINDINGS"), (SubLObject)makeString("different bindings")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("PROOF"), (SubLObject)makeString("different proofs")));
        $ic125$ = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $ic126$ = makeString("If disjuncts have different free EL variables, ");
        $ic127$ = makeString("What to do if different top-level disjuncts in the query have different sets of free EL variables,\ne.g. (or (isa ?X Dog) (isa ?Y Cat)).");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("REQUIRE-EQUAL"), (SubLObject)makeString("deem the query ill-formed")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("COMPUTE-INTERSECTION"), (SubLObject)makeString("use their intersection")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("COMPUTE-UNION"), (SubLObject)makeString("use their union")));
        $ic129$ = makeKeyword("ALLOWED-MODULES");
        $ic130$ = makeString("Allowed HL Modules");
        $ic131$ = makeString("An HL module specification which limits the Strategist's ability to use certain HL modules.");
        $ic132$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("S#25450", "CYC"), (SubLObject)makeString("")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("ALL"), (SubLObject)makeString("All HL Modules")));
        $ic133$ = makeKeyword("PRODUCTIVITY-LIMIT");
        $ic134$ = makeString("Productivity limit");
        $ic135$ = makeString("If a tactic is estimated to have more than this productivity, it will be ignored instead of executed.\nProductivity is (roughly) the expected number of answers generated.");
        $ic136$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("S#65", "CYC"), (SubLObject)makeString("(at most)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeString("No limit")));
        $ic137$ = makeInteger(100);
        $ic138$ = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $ic139$ = makeString("Removal backtracking productivity limit");
        $ic140$ = makeString("If a tactic is estimated to have more than this productivity, it will not be considered for Removal Backtracking\nProductivity is (roughly) 100 * the expected number of answers generated.  Note that in the Inference Browser,\ndisplayed productivities are divided by 100.");
        $ic141$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeString("(at most)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeString("No limit")));
        $ic142$ = makeKeyword("EQUALITY-REASONING-METHOD");
        $ic143$ = makeString("Canonicalize problems");
        $ic144$ = makeString("Whether to canonicalize problem queries wrt literal order and HL variable order.\nWARNING: results may be unpredictable if canonicalization is disabled.");
        $ic145$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("CZER-EQUAL"), (SubLObject)makeString("Yes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("EQUAL"), (SubLObject)makeString("No")));
        $ic146$ = makeKeyword("EQUALITY-REASONING-DOMAIN");
        $ic147$ = makeString("Allow problem reuse for");
        $ic148$ = makeString("Which problems are permitted to be reused by the Worker.\nWARNING: results may be unpredictable if this is set to anything other than 'all problems'.");
        $ic149$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("ALL"), (SubLObject)makeString("all problems")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("SINGLE-LITERAL"), (SubLObject)makeString("only single-literal problems")));
        $ic150$ = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $ic151$ = makeString("Intermediate proof validation");
        $ic152$ = makeString("How carefully to check the intermediate proofs that are used in inference\nfor semantic well-formedness.");
        $ic153$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("ALL"), (SubLObject)makeString("full (most expensive)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("ARG-TYPE"), (SubLObject)makeString("only arg-type")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("MINIMAL"), (SubLObject)makeString("only HL validations")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("NONE"), (SubLObject)makeString("none (least expensive)")));
        $ic154$ = makeKeyword("MAX-PROBLEM-COUNT");
        $ic155$ = makeString("Space cutoff");
        $ic156$ = makeString("The maximum number of subproblems the Worker can create before being forced to suspend.\nIf this limit is exceeded, it will try to prune dead-end and unnecessary problems before suspending.\nSetting this to a higher number (or unlimited) is dangerous; it allows a single inference to use more memory,\nwhich may result in a crash if the machine's memory capacity is exceeded.");
        $ic157$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("ENTRY"), (SubLObject)makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)makeString("problems (at most)")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("POSITIVE-INFINITY"), (SubLObject)makeString("Unlimited number of problems")));
        $ic158$ = makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic159$ = makeString("Allow transformation at all");
        $ic160$ = makeString("Even stronger than setting the inference resource constraints to allow transformation,\nthis precludes any followup inference from ever allowing transformation.");
        $ic161$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)T, (SubLObject)makeString("Yes")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)NIL, (SubLObject)makeString("No (faster)")));
        $ic162$ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $ic163$ = makeString("Add restriction layer of indirection");
        $ic164$ = makeString("When solving an open problem, the Worker can either add a removal link straight from the open problem\nto goal, or it can add the restricted form of that problem (which will be closed), and then add the\nremoval link from the restricted problem to goal.  This maximizes problem reuse but increases the\noverhead of the Worker.");
        $ic165$ = makeKeyword("NEGATION-BY-FAILURE?");
        $ic166$ = makeString("Enable negation by failure");
        $ic167$ = makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");
        $ic168$ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
        $ic169$ = makeString("Enable use of completeness meta-knowledge");
        $ic170$ = makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");
        $ic171$ = makeKeyword("DIRECTION");
        $ic172$ = makeString("Inference Direction");
        $ic173$ = makeString("This controls whether inferences in this problem store are treated as backward inferences (the default) or forward inferences.");
        $ic174$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("BACKWARD"), (SubLObject)makeString("Backward")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("VALUE"), (SubLObject)makeKeyword("FORWARD"), (SubLObject)makeString("Forward")));
        $ic175$ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
        $ic176$ = makeString("Enable evaluation of SubL performatives");
        $ic177$ = makeString("This controls whether or not we allow the SubL performatives (which may cause side effects) to be evaluated during inference.  #$performSubL and #$EvaluateSubLFn are the entry points into SubL from CycL");
        $ic178$ = makeKeyword("REWRITE-ALLOWED?");
        $ic179$ = makeString("Enable sidechaining");
        $ic180$ = makeString("This controls whether or not we allow the use of sidechaining to rewrite problems into other problems.  Sidechaining is designed to be more focused than backchaining, will not increase the complexity of the current problem, and does not require a transformation step (i.e. a backchain).");
        $ic181$ = makeKeyword("ABDUCTION-ALLOWED?");
        $ic182$ = makeString("Enable abduction");
        $ic183$ = makeString("This controls whether or not we allow abductive solutions for problems in this problem store.");
        $ic184$ = makeKeyword("NEW-TERMS-ALLOWED?");
        $ic185$ = makeString("Introduce new terms");
        $ic186$ = makeString("This controls whether or not we allow the introduction of new terms during inference.  If this is set to no, we assume that the set of reified and unrepresented terms comprises the entire universe of discourse.");
        $ic187$ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic188$ = makeString("Compute Answer Justifications");
        $ic189$ = makeString("This controls whether or not we compute and remember the justifications for answers during inference.  If this is set to no, we only compute and remember bindings for free variables.");
        $ic190$ = makeKeyword("PROBLEM-STORE");
        $ic191$ = makeKeyword("NON-EXPLANATORY-SENTENCE");
        $ic192$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic193$ = makeString("CB QUERY");
        $ic194$ = makeString("CB Query");
        $ic195$ = makeSymbol("S#45721", "CYC");
        $ic196$ = makeString("CYC");
        $ic197$ = makeSymbol("S#8003", "CYC");
        $ic198$ = makeSymbol("S#45884", "CYC");
        $ic199$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25426", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic200$ = makeSymbol("DO-LIST");
        $ic201$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#45722", "CYC")));
        $ic202$ = makeSymbol("PWHEN");
        $ic203$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#45914", "CYC"), (SubLObject)makeSymbol("S#45915", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic204$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic205$ = makeSymbol("&OPTIONAL");
        $ic206$ = makeSymbol("&REST");
        $ic207$ = ConsesLow.list((SubLObject)makeSymbol("S#45722", "CYC"));
        $ic208$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45914", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#45915", "CYC"));
        $ic209$ = makeSymbol("S#27365", "CYC");
        $ic210$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic211$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic212$ = makeInteger(1000);
        $ic213$ = makeSymbol("CB-QUERY");
        $ic214$ = makeKeyword("QUERY");
        $ic215$ = makeString("query-tool.gif");
        $ic216$ = makeString("Query");
        $ic217$ = makeString("cb-query");
        $ic218$ = makeKeyword("TOP");
        $ic219$ = makeSymbol("S#45734", "CYC");
        $ic220$ = makeString("Ask a Query");
        $ic221$ = makeKeyword("TITLE");
        $ic222$ = makeString("Query Tool");
        $ic223$ = makeKeyword("REFRESH");
        $ic224$ = makeKeyword("SENTENCE");
        $ic225$ = makeKeyword("UNSPECIFIED");
        $ic226$ = makeKeyword("MT");
        $ic227$ = makeKeyword("PROPERTIES");
        $ic228$ = makeKeyword("QUERY-SPEC");
        $ic229$ = makeKeyword("TEST-SPEC");
        $ic230$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic231$ = makeKeyword("CB-CYC");
        $ic232$ = makeString("stylesheet");
        $ic233$ = makeString("text/css");
        $ic234$ = makeString("yui-skin-sam");
        $ic235$ = makeString("post");
        $ic236$ = makeString("cb-handle-query");
        $ic237$ = makeString(":");
        $ic238$ = makeString("CycServer");
        $ic239$ = makeString("/cyc-ws/cycedit/cyceditor/cyceditor.nocache.js");
        $ic240$ = makeString("javascript");
        $ic241$ = makeString("text/javascript");
        $ic242$ = makeString("/cyc-ws/cycedit/CycEditor.css");
        $ic243$ = makeKeyword("CB-QUERY");
        $ic244$ = makeString("cb-query.html");
        $ic245$ = makeString("Go to section :");
        $ic246$ = makeString("Shortcut links to sections that appear further down on this page.");
        $ic247$ = makeString("focal-inference-section");
        $ic248$ = makeString("[Focal Inference]");
        $ic249$ = makeString("The inference you are currently examining.  Usually the most recent query asked.");
        $ic250$ = makeString("new-inference-section");
        $ic251$ = makeString("[New Inference]");
        $ic252$ = makeString("Start a new inference.");
        $ic253$ = makeString("parameters-section");
        $ic254$ = makeString("[Inference Parameters]");
        $ic255$ = makeString("Adjust the inference parameters and resource constraints that will be used for starting a new inference or continuing the focal inference.");
        $ic256$ = makeString("proof-checker-section");
        $ic257$ = makeString("[Proof Checker Setup]");
        $ic258$ = makeString("Specify an exact set of rules, and constrain the inference engine to only use those rules.");
        $ic259$ = makeString("other-inferences");
        $ic260$ = makeString("Show");
        $ic261$ = makeString("Hide");
        $ic262$ = makeString("Other Inferences");
        $ic263$ = makeString("Examine, continue, or destroy past inferences you have asked.");
        $ic264$ = makeString("(~A total)");
        $ic265$ = makeKeyword("INVISIBLE");
        $ic266$ = makeKeyword("VISIBLE");
        $ic267$ = makeKeyword("PARAGRAPH");
        $ic268$ = makeKeyword("LEFT");
        $ic269$ = makeString("Actions");
        $ic270$ = makeKeyword("DESTROY-ALL-OTHER-INFERENCES");
        $ic271$ = makeString("[Destroy All]");
        $ic272$ = makeKeyword("FOCUS-INFERENCE");
        $ic273$ = makeString("[Focus]");
        $ic274$ = makeKeyword("DESTROY-INFERENCE");
        $ic275$ = makeString("[Destroy]");
        $ic276$ = makeString("Status");
        $ic277$ = makeString("Answers");
        $ic278$ = makeString("focal-problem-store");
        $ic279$ = makeString("focal-inference");
        $ic280$ = makeString("Focal Inference");
        $ic281$ = makeString("Actions :");
        $ic282$ = makeKeyword("DEFOCUS-INFERENCE");
        $ic283$ = makeString("[Defocus]");
        $ic284$ = makeKeyword("TEMPLATE-OE-INFERENCE");
        $ic285$ = makeString("[Template OE]");
        $ic286$ = makeKeyword("CB-OWL-EXPORT-INFERENCE-ANSWERS");
        $ic287$ = makeString("[OWL Export]");
        $ic288$ = makeKeyword("KBQ-SAVE");
        $ic289$ = makeString("[Save As Query]");
        $ic290$ = makeKeyword("KCT-SAVE");
        $ic291$ = makeString("[Save As Test]");
        $ic292$ = makeString("Asking query: ");
        $ic293$ = makeString("new-inference");
        $ic294$ = makeString("New Inference");
        $ic295$ = makeKeyword("RUNNING");
        $ic296$ = makeString("Reset All Fields");
        $ic297$ = makeString("Start as a Followup to Focal");
        $ic298$ = makeString("Starts a new inference as a followup query to the focal inference.\nThis means that this inference will reuse the problem store used by the focal inference,\nso it will not have to reprove problems already proven by the focal inference.");
        $ic299$ = makeString("sharing_a_problem_store");
        $ic300$ = makeString("followup");
        $ic301$ = makeString("Start as New");
        $ic302$ = makeString("Starts a new inference with a fresh problem store (the default).");
        $ic303$ = makeString("new");
        $ic304$ = makeString("Start Inference");
        $ic305$ = makeString("query-spec");
        $ic306$ = makeString("test-spec");
        $ic307$ = constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $ic308$ = makeSymbol("S#45886", "CYC");
        $ic309$ = constant_handles_oc.f8479((SubLObject)makeString("MtSpace"));
        $ic310$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("MtTimeDimFn")), constant_handles_oc.f8479((SubLObject)makeString("Now"))));
        $ic311$ = makeSymbol("S#45887", "CYC");
        $ic312$ = constant_handles_oc.f8479((SubLObject)makeString("InferencePSC"));
        $ic313$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt")), constant_handles_oc.f8479((SubLObject)makeString("BaseKB")), constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric")), constant_handles_oc.f8479((SubLObject)makeString("InferencePSC")), constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC")));
        $ic314$ = makeString("mt-section");
        $ic315$ = makeString("cb-query-inference-mt");
        $ic316$ = makeString("Query Context");
        $ic317$ = makeKeyword("MONAD-CHOICES");
        $ic318$ = makeString("sentence-section");
        $ic319$ = makeInteger(80);
        $ic320$ = makeKeyword("INPUT-NAME");
        $ic321$ = makeString("sentence");
        $ic322$ = makeKeyword("WIDTH");
        $ic323$ = makeKeyword("HEIGHT");
        $ic324$ = makeKeyword("COMPLETE-LABEL");
        $ic325$ = makeString("Complete");
        $ic326$ = makeKeyword("CYCLIFY-LABEL");
        $ic327$ = makeString("Cyclify");
        $ic328$ = makeKeyword("CLEAR-LABEL");
        $ic329$ = makeString("Clear Sentence");
        $ic330$ = makeKeyword("MODE");
        $ic331$ = makeString("editor_");
        $ic332$ = makeString("CycEditor");
        $ic333$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3E2AE39"), (SubLObject)makeUninternedSymbol("US#1069245"));
        $ic334$ = (SubLList)ConsesLow.cons((SubLObject)makeString(" name="), (SubLObject)makeString("sentence"));
        $ic335$ = makeString(" cols=");
        $ic336$ = makeString(" rows=");
        $ic337$ = makeString("non-explanatory");
        $ic338$ = makeString("Pragmatics");
        $ic339$ = makeString("An optional sentence that will further constrain the query for pragmatic reasons.  Justifications for answers will not include this sentence.");
        $ic340$ = makeString("non_exp_sentence");
        $ic341$ = makeSymbol("S#45889", "CYC");
        $ic342$ = makeString("inference-parameters");
        $ic343$ = makeString("Inference Parameters");
        $ic344$ = makeString("The inference parameters and resource constraints that will be used when starting a new inference or continuing the focal inference.");
        $ic345$ = makeString("Continue the Focal Inference");
        $ic346$ = makeString("Continues running the focal inference for a while longer, with more resources if the inference parameters have changed since the last time it was run.");
        $ic347$ = makeString("continue");
        $ic348$ = makeString("Save Parameters");
        $ic349$ = makeString("Saves the current inference parameters as default for the user");
        $ic350$ = makeString("save-parameters");
        $ic351$ = makeString("Load Parameters");
        $ic352$ = makeString("Loads user saved default inference parameters");
        $ic353$ = makeString("load-parameters");
        $ic354$ = makeString("Reset Parameters");
        $ic355$ = makeString("Resets all the inference parameters to tool default.  If focal inference is available then inference parameters are set to that of focal inference.");
        $ic356$ = makeString("reset-parameters");
        $ic357$ = makeString("Strengthen Parameters");
        $ic358$ = makeString("Sets the inference parameters to the strongest values that should still admit all the current answers of the focal inference.");
        $ic359$ = makeString("strengthen-parameters");
        $ic360$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("MAX-NUMBER"), (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)THREE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MAX-TIME"), (SubLObject)makeInteger(30), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)FOUR_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("MAX-STEP"), (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)FOUR_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("INFERENCE-MODE"), (SubLObject)makeKeyword("SHALLOW")));
        $ic361$ = makeString("Inference Resource Constraints");
        $ic362$ = makeString("Properties that can change while an inference is suspended, and be respected when that same inference is continued.");
        $ic363$ = makeString("advanced-parameters");
        $ic364$ = makeString("Inference Debugging Parameters");
        $ic365$ = makeString("The advanced inference parameters that can be manipulated for debugging inference.  These are used when starting a new inference or continuing the focal inference.");
        $ic366$ = ConsesLow.list(new SubLObject[] { makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("MIN-RULE-UTILITY") });
        $ic367$ = makeSymbol("S#45760", "CYC");
        $ic368$ = makeSymbol("FIRST");
        $ic369$ = makeString("Inference Engine Mode Properties");
        $ic370$ = makeString("Properties determined by the choice of inference engine mode, unless Debug is chosen.");
        $ic371$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)TWO_INTEGER)), ConsesLow.list((SubLObject)makeKeyword("MIN-RULE-UTILITY"), (SubLObject)makeInteger(-20), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)THREE_INTEGER)), ConsesLow.list((SubLObject)makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)makeInteger(100), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)THREE_INTEGER)), ConsesLow.list((SubLObject)makeKeyword("FORWARD-MAX-TIME"), (SubLObject)ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)FOUR_INTEGER)), ConsesLow.list((SubLObject)makeKeyword("BLOCK?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("MAX-PROOF-DEPTH"), (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)TWO_INTEGER)), ConsesLow.list((SubLObject)makeKeyword("CACHE-INFERENCE-RESULTS?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("ANSWER-LANGUAGE"), (SubLObject)makeKeyword("HL")), ConsesLow.list((SubLObject)makeKeyword("CONTINUABLE?"), (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("METRICS"), (SubLObject)NIL) });
        $ic372$ = makeString("Inference Dynamic Properties");
        $ic373$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("RESULT-UNIQUENESS"), (SubLObject)makeKeyword("BINDINGS")), ConsesLow.list((SubLObject)makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), (SubLObject)makeKeyword("COMPUTE-INTERSECTION")), ConsesLow.list((SubLObject)makeKeyword("ALLOWED-MODULES"), (SubLObject)makeKeyword("ALL"), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)TWENTY_INTEGER)), ConsesLow.list((SubLObject)makeKeyword("TRANSITIVE-CLOSURE-MODE"), (SubLObject)makeKeyword("NONE")) });
        $ic374$ = makeString("Inference Static Properties");
        $ic375$ = makeString("Properties that can vary between different inferences (which may be sharing the same problem store),\nbut which must remain consistent throughout the life of a given inference.");
        $ic376$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)SEVEN_INTEGER));
        $ic377$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("NEGATION-BY-FAILURE?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("BACKWARD")), ConsesLow.list((SubLObject)makeKeyword("EQUALITY-REASONING-METHOD"), (SubLObject)makeKeyword("CZER-EQUAL")), ConsesLow.list((SubLObject)makeKeyword("EQUALITY-REASONING-DOMAIN"), (SubLObject)makeKeyword("ALL")), ConsesLow.list((SubLObject)makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)makeKeyword("NONE")), ConsesLow.list((SubLObject)makeKeyword("MAX-PROBLEM-COUNT"), (SubLObject)makeInteger(100000), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)SIX_INTEGER)), ConsesLow.list((SubLObject)makeKeyword("TRANSFORMATION-ALLOWED?"), (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("EVALUATE-SUBL-ALLOWED?"), (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("REWRITE-ALLOWED?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("ABDUCTION-ALLOWED?"), (SubLObject)NIL), ConsesLow.list((SubLObject)makeKeyword("NEW-TERMS-ALLOWED?"), (SubLObject)T), ConsesLow.list((SubLObject)makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), (SubLObject)T) });
        $ic378$ = makeString("Problem Store Static Properties");
        $ic379$ = makeString("Properties of a problem store that cannot change.  These properties affect all inferences using that problem store.");
        $ic380$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#137", "CYC"), (SubLObject)makeSymbol("S#45916", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45917", "CYC")), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#45918", "CYC"));
        $ic381$ = ConsesLow.list((SubLObject)makeSymbol("S#137", "CYC"), (SubLObject)makeSymbol("S#45916", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45917", "CYC"));
        $ic382$ = makeKeyword("NO-MODE-VALUE-SPECIFIED");
        $ic383$ = makeKeyword("YELLOW");
        $ic384$ = makeString("*");
        $ic385$ = makeString("This parameter has been modified.");
        $ic386$ = ConsesLow.list((SubLObject)makeKeyword("TEXT"), (SubLObject)NIL);
        $ic387$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"), (SubLObject)makeSymbol("S#1534", "CYC"));
        $ic388$ = makeKeyword("TEXT");
        $ic389$ = makeString("onClick=\"");
        $ic390$ = makeString("\"");
        $ic391$ = makeString("set_all_radio_buttons(document.forms[0], '~a', ~a);");
        $ic392$ = makeString("with (this.form.elements['~A']){value = '~A';};");
        $ic393$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#45919", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic394$ = ConsesLow.list((SubLObject)makeSymbol("S#45920", "CYC"), (SubLObject)makeSymbol("S#45921", "CYC"), (SubLObject)makeSymbol("S#45922", "CYC"));
        $ic395$ = makeString("No setting for ~s matched the value ~s");
        $ic396$ = makeKeyword("DEFAULT-UNSPECIFIED");
        $ic397$ = makeString("Unexpected inference parameter setting type ~s");
        $ic398$ = makeString("|");
        $ic399$ = makeString(".");
        $ic400$ = makeString("?");
        $ic401$ = makeString("onClick=\"with (this.form.elements['~A']){focus();}; set_all_radio_buttons(document.forms[0], '~a', ~a); \"");
        $ic402$ = makeKeyword("ALLOWED-RULES");
        $ic403$ = makeKeyword("FORBIDDEN-RULES");
        $ic404$ = makeKeyword("ALL");
        $ic405$ = makeKeyword("NONE");
        $ic406$ = makeString("proof-checker");
        $ic407$ = makeString("Proof Checker Setup");
        $ic408$ = makeString("Specify an exact set of rules allowed to be used in inference.");
        $ic409$ = makeKeyword("CENTER");
        $ic410$ = makeString("#FFDFDF");
        $ic411$ = makeString("Forbidden");
        $ic412$ = makeString("Forbid the use of this rule in inference");
        $ic413$ = makeString("[Forbid All]");
        $ic414$ = makeString("this.document.forms[0]");
        $ic415$ = makeString("^rule_.*");
        $ic416$ = makeString("forbidden");
        $ic417$ = makeString("#FFFFDF");
        $ic418$ = makeString("Unused");
        $ic419$ = makeString("Neither forbid nor allow; treat like any other rule in the KB.");
        $ic420$ = makeString("[Unuse All]");
        $ic421$ = makeString("unused");
        $ic422$ = makeKeyword("QUERY-PROOF-CHECKER-DROP-ALL");
        $ic423$ = makeString("[Drop All]");
        $ic424$ = makeString("#DFFFDF");
        $ic425$ = makeString("Allowed");
        $ic426$ = makeString("Allow the use of this rule in inference, but forbid the use of all \n                  other rules except those which are explicitly allowed.");
        $ic427$ = makeString("[Allow All]");
        $ic428$ = makeString("allowed");
        $ic429$ = makeString("#FFFFFF");
        $ic430$ = makeString("Proof Checker Rules");
        $ic431$ = makeKeyword("FORBIDDEN");
        $ic432$ = makeKeyword("UNUSED");
        $ic433$ = makeKeyword("QUERY-PROOF-CHECKER-DROP");
        $ic434$ = makeString("[Drop]");
        $ic435$ = makeKeyword("ALLOWED");
        $ic436$ = makeString("rule_");
        $ic437$ = makeString("Properties which must remain consistent throughout the life of a given problem store.");
        $ic438$ = makeString("Other Problem Store Properties");
        $ic439$ = makeString("Destruction Imminent? ");
        $ic440$ = makeString("Memoization state : ");
        $ic441$ = makeKeyword("PROBLEM-STORE-MEMOIZATION-STATE");
        $ic442$ = makeString("Janitor : ");
        $ic443$ = makeKeyword("PROBLEM-STORE-JANITOR");
        $ic444$ = makeKeyword("RECOMPUTE-DESTRUCTIBLES");
        $ic445$ = makeKeyword("REMOVE-DESTRUCTIBLES");
        $ic446$ = makeString("~a does not specify an assertion");
        $ic447$ = makeString("Assertion specified was not a rule");
        $ic448$ = makeSymbol("CB-QUERY-PROOF-CHECKER-DROP");
        $ic449$ = makeSymbol("ASSERTION-P");
        $ic450$ = makeString("No longer consider this rule as being either forbidden or allowed.");
        $ic451$ = makeString("cb-query-proof-checker-drop&~A");
        $ic452$ = makeSymbol("S#45796", "CYC");
        $ic453$ = makeSymbol("CB-QUERY-PROOF-CHECKER-DROP-ALL");
        $ic454$ = makeString("No longer consider any of these rules as being either forbidden or allowed.");
        $ic455$ = makeString("cb-query-proof-checker-drop-all");
        $ic456$ = makeSymbol("S#45797", "CYC");
        $ic457$ = makeKeyword("CONTINUE");
        $ic458$ = makeKeyword("FOLLOWUP");
        $ic459$ = makeKeyword("NEW");
        $ic460$ = makeKeyword("SAVE-PARAMETERS");
        $ic461$ = makeKeyword("LOAD-PARAMETERS");
        $ic462$ = makeKeyword("RESET-PARAMETERS");
        $ic463$ = makeKeyword("STRENGTHEN-PARAMETERS");
        $ic464$ = makeString("Unknown inference method (how did this happen?)");
        $ic465$ = makeString("~A");
        $ic466$ = makeString("That inference is no longer continuable.");
        $ic467$ = ConsesLow.list((SubLObject)makeKeyword("PROPERTIES"), (SubLObject)NIL);
        $ic468$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("sentence"));
        $ic469$ = ConsesLow.list((SubLObject)makeKeyword("LOCATION"), (SubLObject)makeString("New Inference"));
        $ic470$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("non_exp_sentence"), (SubLObject)makeKeyword("REQUIRED?"), (SubLObject)NIL);
        $ic471$ = ConsesLow.list((SubLObject)makeKeyword("LOCATION"), (SubLObject)makeString("Pragmatics"));
        $ic472$ = makeSymbol("CB-HANDLE-QUERY");
        $ic473$ = makeKeyword("SILK");
        $ic474$ = makeSymbol("?TRUTH");
        $ic475$ = constant_handles_oc.f8479((SubLObject)makeString("sentenceTruth"));
        $ic476$ = makeKeyword("UNKNOWN");
        $ic477$ = makeString(" is not an inference parameter.");
        $ic478$ = ConsesLow.list((SubLObject)makeSymbol("METHOD"), (SubLObject)makeSymbol("S#724", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#43330", "CYC"));
        $ic479$ = makeString("No value was entered for '");
        $ic480$ = makeString("'.");
        $ic481$ = makeString("The value entered for '");
        $ic482$ = makeString("' was not valid.");
        $ic483$ = makeString("No choice was made for '");
        $ic484$ = makeString("The ID, ");
        $ic485$ = makeString(", does not denote a CycLQuerySpecification.");
        $ic486$ = makeString("The query spec ID, ");
        $ic487$ = makeString(", does not denote a FORT.");
        $ic488$ = makeString(", does not denote a KBContentTest-FullySpecified.");
        $ic489$ = makeString("The test spec ID, ");
        $ic490$ = makeKeyword("BROWSABLE?");
        $ic491$ = makeString("Socratic Query");
        $ic492$ = makeString("Similar Query");
        $ic493$ = makeString("[Query Similar]");
        $ic494$ = makeString("cb-assertion-similar-query&~A");
        $ic495$ = makeKeyword("ASSERTION-SIMILAR-QUERY");
        $ic496$ = makeSymbol("S#45808", "CYC");
        $ic497$ = makeString("The assertion is not available.");
        $ic498$ = makeSymbol("CB-ASSERTION-SIMILAR-QUERY");
        $ic499$ = makeString("Antecedent Query");
        $ic500$ = makeKeyword("CUSTOM");
        $ic501$ = makeKeyword("FORWARD");
        $ic502$ = makeKeyword("PROOF");
        $ic503$ = makeString("[Antecedent Query]");
        $ic504$ = makeString("cb-assertion-antecedent-query&~A");
        $ic505$ = makeKeyword("ANTECEDENT-QUERY");
        $ic506$ = makeSymbol("S#45810", "CYC");
        $ic507$ = makeSymbol("CB-ASSERTION-ANTECEDENT-QUERY");
        $ic508$ = makeString("Known Extent Query");
        $ic509$ = makeString("[Known Extent Query]");
        $ic510$ = makeSymbol("S#12732", "CYC");
        $ic511$ = makeString("cb-rule-known-extent-query&~A");
        $ic512$ = makeKeyword("RULE-KNOWN-EXTENT-QUERY");
        $ic513$ = makeSymbol("S#45812", "CYC");
        $ic514$ = makeString("The rule is not available.");
        $ic515$ = makeSymbol("CB-RULE-KNOWN-EXTENT-QUERY");
        $ic516$ = makeString("Unknown Extent Query");
        $ic517$ = makeString("[Unknown Extent Query]");
        $ic518$ = makeString("cb-rule-unknown-extent-query&~A");
        $ic519$ = makeKeyword("RULE-UNKNOWN-EXTENT-QUERY");
        $ic520$ = makeSymbol("S#45814", "CYC");
        $ic521$ = makeSymbol("CB-RULE-UNKNOWN-EXTENT-QUERY");
        $ic522$ = makeString("KB Query");
        $ic523$ = makeString("Parameter Strengthened Query");
        $ic524$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic525$ = ConsesLow.list((SubLObject)makeSymbol("S#44996", "CYC"), (SubLObject)makeSymbol("S#44449", "CYC"), (SubLObject)makeSymbol("S#13108", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#13109", "CYC"));
        $ic526$ = makeString("Could not determine a term from ~a");
        $ic527$ = makeString("Could not determine an arg from ~a");
        $ic528$ = makeSymbol("CB-LITERAL-QUERY");
        $ic529$ = makeSymbol("CB-LQ");
        $ic530$ = ConsesLow.list((SubLObject)makeSymbol("?ARG0"), (SubLObject)makeSymbol("?ARG1"), (SubLObject)makeSymbol("?ARG2"), (SubLObject)makeSymbol("?ARG3"), (SubLObject)makeSymbol("?ARG4"), (SubLObject)makeSymbol("?ARG5"));
        $ic531$ = makeKeyword("CB-LITERAL-QUERY");
        $ic532$ = makeString("cb-literal-query.html");
        $ic533$ = makeString("Literal Query");
        $ic534$ = makeKeyword("SHA1");
        $ic535$ = makeString("reloadFrameButton");
        $ic536$ = makeString("button");
        $ic537$ = makeString("reload");
        $ic538$ = makeString("Refresh Frames");
        $ic539$ = makeKeyword("SENTENCE-QUERY-SIMILAR");
        $ic540$ = makeString("[Query Tool]");
        $ic541$ = makeString("Last query");
        $ic542$ = makeKeyword("EXHAUST");
        $ic543$ = makeKeyword("EXHAUST-TOTAL");
        $ic544$ = makeString("Query halted because : ");
        $ic545$ = makeString("No answers were proven");
        $ic546$ = makeString("One answer");
        $ic547$ = makeString("~S answers");
        $ic548$ = makeString(" for ~S :");
        $ic549$ = makeString("Substituted Results :");
        $ic550$ = makeString("Could not determine the arity of ~A in ~A");
        $ic551$ = makeKeyword("BINDINGS");
        $ic552$ = makeKeyword("HL");
        $ic553$ = makeKeyword("RETURN");
        $ic554$ = makeKeyword("POSITIVE-INFINITY");
        $ic555$ = (SubLFloat)makeDouble(1.0);
        $ic556$ = makeInteger(64);
        $ic557$ = makeSymbol("S#18496", "CYC");
        $ic558$ = makeString("Simulated query over all mts :");
        $ic559$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic560$ = ConsesLow.list((SubLObject)makeSymbol("?ARG2"));
        $ic561$ = makeString("Answers in ");
        $ic562$ = makeString(" (inherits from");
        $ic563$ = makeString(" ");
        $ic564$ = makeString(")");
        $ic565$ = makeString("( ");
        $ic566$ = makeSymbol("S#17515", "CYC");
        $ic567$ = makeKeyword("INDEX");
        $ic568$ = ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)TWO_INTEGER);
        $ic569$ = makeKeyword("LIKELY");
        $ic570$ = makeKeyword("POSSIBLE");
        $ic571$ = makeKeyword("INDEX-DISPLAY");
        $ic572$ = makeKeyword("NORMAL");
        $ic573$ = makeKeyword("KNOWN");
        $ic574$ = makeKeyword("POS");
        $ic575$ = constant_handles_oc.f8479((SubLObject)makeString("genlPreds"));
        $ic576$ = makeString("Current query");
        $ic577$ = makeString(" in ");
        $ic578$ = makeString(" :");
        $ic579$ = makeInteger(330);
        $ic580$ = makeString("cb-inference-progress-page&~A&~A");
        $ic581$ = makeString("inference_progress");
        $ic582$ = makeString("100%");
        $ic583$ = makeKeyword("ON");
        $ic584$ = makeKeyword("OFF");
        $ic585$ = makeString("Inference ~A in problem store ~A is no longer available.");
        $ic586$ = makeString("Inference ~A.~A Progress");
        $ic587$ = makeKeyword("DISABLED");
        $ic588$ = makeSymbol("CB-INFERENCE-PROGRESS-PAGE");
        $ic589$ = makeString("[Refresh Page]");
        $ic590$ = makeString("Status :");
        $ic591$ = makeString("[Halt Auto Refresh]");
        $ic592$ = makeString("[Refresh]");
        $ic593$ = makeKeyword("AUTO-REFRESH-QUERY");
        $ic594$ = makeString("[Auto Refresh]");
        $ic595$ = makeKeyword("INTERRUPT-INFERENCE");
        $ic596$ = makeString("[Interrupt]");
        $ic597$ = makeKeyword("ABORT-INFERENCE");
        $ic598$ = makeString("[Abort]");
        $ic599$ = makeString("Max time remaining: ");
        $ic600$ = makeString("Time over budget: ");
        $ic601$ = makeKeyword("RED");
        $ic602$ = makeString("inference-answers");
        $ic603$ = makeString("(");
        $ic604$ = makeKeyword("ALL-INFERENCE-ANSWERS");
        $ic605$ = makeString("[All Answers]");
        $ic606$ = makeKeyword("SAVE-INFERENCE-ANSWERS");
        $ic607$ = makeKeyword("GRAPH-INFERENCE-ANSWERS");
        $ic608$ = makeKeyword("SAVE-INFERENCE-ANSWERS-AS-QUERIES");
        $ic609$ = makeString("[Save Answers as Queries]");
        $ic610$ = makeKeyword("INFERENCE-ANSWER-TIMELINE");
        $ic611$ = makeString("[Timeline]");
        $ic612$ = makeSymbol("CB-AUTO-REFRESH-QUERY");
        $ic613$ = makeString("Starts up an auto-refresh loop that will automatically refresh\nthis page every few seconds, showing new inference answers (if any).");
        $ic614$ = makeString("cb-auto-refresh-query&~A&~A");
        $ic615$ = makeSymbol("S#45826", "CYC");
        $ic616$ = makeString("[More ...]");
        $ic617$ = makeString("cb-all-inference-answers&~A&~A");
        $ic618$ = makeSymbol("S#45828", "CYC");
        $ic619$ = makeString("Inference ~A.~A");
        $ic620$ = makeSymbol("CB-ALL-INFERENCE-ANSWERS");
        $ic621$ = makeString("Inference Answers");
        $ic622$ = makeSymbol("CB-FOCUS-INFERENCE");
        $ic623$ = makeString("Make this inference the focal inference,\nso that it can be examined in more detail.");
        $ic624$ = makeString("cb-focus-inference&~A&~A");
        $ic625$ = makeSymbol("S#45830", "CYC");
        $ic626$ = makeSymbol("CB-DEFOCUS-INFERENCE");
        $ic627$ = makeString("Make this inference no longer the focal inference,\nand demote it into the 'Other Inferences' section.");
        $ic628$ = makeString("cb-defocus-inference&~A&~A");
        $ic629$ = makeSymbol("S#45831", "CYC");
        $ic630$ = makeSymbol("CB-INTERRUPT-INFERENCE");
        $ic631$ = makeString("cb-interrupt-inference&~A&~A");
        $ic632$ = makeSymbol("S#45832", "CYC");
        $ic633$ = makeSymbol("CB-ABORT-INFERENCE");
        $ic634$ = makeString("cb-abort-inference&~A&~A");
        $ic635$ = makeSymbol("S#45833", "CYC");
        $ic636$ = makeSymbol("CB-FORGET-INFERENCE");
        $ic637$ = makeString("[Forget]");
        $ic638$ = makeString("cb-forget-inference&~A&~A");
        $ic639$ = makeKeyword("FORGET-INFERENCE");
        $ic640$ = makeSymbol("S#45834", "CYC");
        $ic641$ = makeSymbol("CB-FORGET-ALL-INFERENCES");
        $ic642$ = makeString("[Forget All]");
        $ic643$ = makeString("cb-forget-all-inferences");
        $ic644$ = makeKeyword("FORGET-ALL-INFERENCES");
        $ic645$ = makeSymbol("S#45835", "CYC");
        $ic646$ = makeSymbol("CB-FORGET-ALL-OTHER-INFERENCES");
        $ic647$ = makeString("cb-forget-all-other-inferences");
        $ic648$ = makeKeyword("FORGET-ALL-OTHER-INFERENCES");
        $ic649$ = makeSymbol("S#45836", "CYC");
        $ic650$ = makeString("Inference heuristics are being reinforced.");
        $ic651$ = makeInteger(2000);
        $ic652$ = makeSymbol("CB-REINFORCE-INFERENCE");
        $ic653$ = makeString("[Reinforce]");
        $ic654$ = makeString("Reinforce the inference heuristics based on this inference,\nso as to help answer similar inferences in the future.");
        $ic655$ = makeString("cb-reinforce-inference&~A&~A");
        $ic656$ = makeKeyword("REINFORCE-INFERENCE");
        $ic657$ = makeSymbol("S#45837", "CYC");
        $ic658$ = makeSymbol("CB-DESTROY-INFERENCE");
        $ic659$ = makeString("Destroy this inference, reclaiming the memory used to store it.\nOnce an inference is destroyed, it can no longer be examined or continued.");
        $ic660$ = makeString("cb-destroy-inference&~A&~A");
        $ic661$ = makeSymbol("S#45839", "CYC");
        $ic662$ = makeSymbol("CB-DESTROY-ALL-INFERENCES");
        $ic663$ = makeString("Destroy all inferences (including the focal inference),\nreclaiming the memory used to store them.");
        $ic664$ = makeString("cb-destroy-all-inferences");
        $ic665$ = makeKeyword("DESTROY-ALL-INFERENCES");
        $ic666$ = makeSymbol("S#45840", "CYC");
        $ic667$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45923", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#45915", "CYC"));
        $ic668$ = makeSymbol("CB-DESTROY-ALL-OTHER-INFERENCES");
        $ic669$ = makeString("Destroy all inferences other than the focal inference,\nreclaiming the memory used to store them.");
        $ic670$ = makeString("cb-destroy-all-other-inferences");
        $ic671$ = makeSymbol("S#45841", "CYC");
        $ic672$ = makeString("[SubL Query]");
        $ic673$ = makeString("Convert this inference to an equivalent SubL query (using new-cyc-query). Leads to SubL Interactor.");
        $ic674$ = makeString("cb-inference-to-subl-query&~A&~A");
        $ic675$ = makeKeyword("INFERENCE-TO-SUBL-QUERY");
        $ic676$ = makeSymbol("S#45842", "CYC");
        $ic677$ = makeString("input-string");
        $ic678$ = makeSymbol("CB-INFERENCE-TO-SUBL-QUERY");
        $ic679$ = makeString("[Graph Answers]");
        $ic680$ = makeString("cb-graph-inference-answers&~A&~A");
        $ic681$ = makeString("window.open('");
        $ic682$ = makeString("',");
        $ic683$ = makeString("'~A'");
        $ic684$ = makeString("null");
        $ic685$ = makeString(",'~A'); ");
        $ic686$ = makeString("return false;");
        $ic687$ = makeSymbol("S#45843", "CYC");
        $ic688$ = makeSymbol("CB-GRAPH-INFERENCE-ANSWERS");
        $ic689$ = makeKeyword("SIGNATURE");
        $ic690$ = makeKeyword("INFERENCE-STORE-ID");
        $ic691$ = makeKeyword("INFERENCE-ID");
        $ic692$ = makeString("cb-graph-inference-answers-window");
        $ic693$ = makeSymbol("S#45845", "CYC");
        $ic694$ = makeKeyword("BBF-INFERENCE-ANSWERS");
        $ic695$ = makeKeyword("BUILDER-FN");
        $ic696$ = makeKeyword("PARAMS");
        $ic697$ = makeString("store-id");
        $ic698$ = makeString("inference-id");
        $ic699$ = makeString(":ans-format");
        $ic700$ = makeString(":destination");
        $ic701$ = makeString(":filename");
        $ic702$ = makeString("cycl-prefix");
        $ic703$ = makeKeyword("FILE");
        $ic704$ = makeString("Please enter a filename to save the results to.");
        $ic705$ = makeKeyword("TAB-DELIMITED");
        $ic706$ = makeKeyword("XML");
        $ic707$ = makeKeyword("ALCHEMY");
        $ic708$ = makeSymbol("S#38", "CYC");
        $ic709$ = makeString("Attempt to save answers failed:~%~%~A");
        $ic710$ = makeKeyword("CUSTOM-XML");
        $ic711$ = makeString(":spec");
        $ic712$ = makeString("Error: Operation failed");
        $ic713$ = makeString("The query results were not transformed into XML. \n                          Please check the input XML specifications.");
        $ic714$ = makeString("Back");
        $ic715$ = makeString("Error: Invalid input");
        $ic716$ = makeString("Please select one of the output formats for saving the \n                      query results.");
        $ic717$ = makeSymbol("CB-SAVE-INFERENCE-ANSWERS-INT");
        $ic718$ = makeKeyword("HTML-STREAM");
        $ic719$ = makeKeyword("OUTPUT");
        $ic720$ = makeString("Answers were saved to ");
        $ic721$ = makeKeyword("CB-SAVE-INFERENCE-ANSWERS");
        $ic722$ = makeString("cb-save-inference-answers.html");
        $ic723$ = makeString("Save Query Results as Text/XML");
        $ic724$ = makeString("cb-save-inference-answers-int");
        $ic725$ = makeString("Save query results as:");
        $ic726$ = makeString(":tab-delimited");
        $ic727$ = makeString("Text");
        $ic728$ = makeString(":xml");
        $ic729$ = makeString("Default XML");
        $ic730$ = makeString(":custom-xml");
        $ic731$ = makeString("User-defined XML");
        $ic732$ = makeString("Destination:");
        $ic733$ = makeString(":html-stream");
        $ic734$ = makeString("Show results in this browser");
        $ic735$ = makeString(":file");
        $ic736$ = makeString("Save results in file:");
        $ic737$ = makeKeyword("NBSP");
        $ic738$ = makeInteger(60);
        $ic739$ = makeString("Clear");
        $ic740$ = makeString("Optional Parameters:");
        $ic741$ = makeString("cycl-prefix-enabled");
        $ic742$ = makeString("Include '#$' prefix on CycL terms");
        $ic743$ = makeString("Please enter XML specifications if you selected ");
        $ic744$ = makeString("Submit");
        $ic745$ = makeSymbol("CB-SAVE-INFERENCE-ANSWERS");
        $ic746$ = makeString("[Save Answers]");
        $ic747$ = makeString("cb-save-inference-answers&~A&~A");
        $ic748$ = makeSymbol("S#45847", "CYC");
        $ic749$ = makeKeyword("STORE-ID");
        $ic750$ = makeSymbol("CB-SAVE-INFERENCE-ANSWERS-AS-QUERIES");
        $ic751$ = makeString("Save Inference Answers as Queries");
        $ic752$ = makeKeyword("SUBMIT");
        $ic753$ = makeKeyword("EL-VARIABLES");
        $ic754$ = makeString("Please select one or more EL variables");
        $ic755$ = makeKeyword("ANSWER-IDS");
        $ic756$ = makeString("Please select one or more answers");
        $ic757$ = makeSymbol("S#5859", "CYC");
        $ic758$ = makeString("cb-save-inference-answers-as-queries");
        $ic759$ = makeString("Inference ~A in problem store ~A has no answers.");
        $ic760$ = makeString("Inference ~A in problem store ~A hos no free variables.");
        $ic761$ = makeString("Which variables should be filled in with bindings in the saved queries?");
        $ic762$ = makeString("Which answers should be used to generate queries?");
        $ic763$ = makeString("Answer");
        $ic764$ = makeSymbol("MAKE-EL-VAR");
        $ic765$ = makeString("Reifying query for: ");
        $ic766$ = makeString("query about");
        $ic767$ = makeString("New Constant: ");
        $ic768$ = makeString("cb-save-inference-answers-as-queries&~A&~A");
        $ic769$ = makeSymbol("S#45850", "CYC");
        $ic770$ = makeString("Inference ~A.~A Answer Timeline");
        $ic771$ = makeString("Inference Answer Timeline");
        $ic772$ = makeString(" for ");
        $ic773$ = ConsesLow.list((SubLObject)makeKeyword("IMAGE-WIDTH"), (SubLObject)makeInteger(600), (SubLObject)makeKeyword("IMAGE-HEIGHT"), (SubLObject)makeInteger(450), (SubLObject)makeKeyword("PLOT-COLOR"), (SubLObject)makeString("#0000ff"));
        $ic774$ = makeSymbol("CB-INFERENCE-ANSWER-TIMELINE");
        $ic775$ = makeString("[Answer Timeline]");
        $ic776$ = makeString("cb-inference-answer-timeline&~A&~A");
        $ic777$ = makeSymbol("S#45851", "CYC");
        $ic778$ = makeSymbol("DOUBLE-FLOAT");
        $ic779$ = makeString("http://chart.apis.google.com/chart?");
        $ic780$ = makeString("cht=s");
        $ic781$ = makeString("&chs=600x450");
        $ic782$ = makeString("Inference ");
        $ic783$ = makeString(" Answer Timeline");
        $ic784$ = makeString("&chtt=~A");
        $ic785$ = makeString("&chds=~S,~S,~S,~S");
        $ic786$ = makeString("&chxt=x,y,x,y");
        $ic787$ = makeString("&chxr=0,~S,~S|1,~S,~S");
        $ic788$ = makeString("Time (seconds)");
        $ic789$ = makeString("Answer #");
        $ic790$ = makeString("&chxl=2:|~A|3:|~A");
        $ic791$ = makeString("&chxp=2,~S|3,~S");
        $ic792$ = makeInteger(50);
        $ic793$ = makeString("&chd=t:");
        $ic794$ = makeString(",");
        $ic795$ = makeInteger(450);
        $ic796$ = makeInteger(600);
        $ic797$ = makeInteger(120);
        $ic798$ = makeSymbol("<");
        $ic799$ = makeSymbol("SECOND");
        $ic800$ = ConsesLow.list((SubLObject)makeSymbol("S#45911", "CYC"), (SubLObject)makeSymbol("S#45912", "CYC"), (SubLObject)makeSymbol("S#45924", "CYC"));
        $ic801$ = makeKeyword("SOME");
        $ic802$ = makeString("Unexpected mode ~A");
        $ic803$ = makeSymbol("CB-INFERENCE-STRENGTHEN-PROPERTIES");
        $ic804$ = makeString("[Strengthen Parameters]");
        $ic805$ = ConsesLow.list((SubLObject)makeKeyword("ALL"), (SubLObject)makeKeyword("SOME"));
        $ic806$ = makeString("~S was an invalid mode");
        $ic807$ = makeString("cb-inference-strengthen-properties&~A&~A&~S");
        $ic808$ = makeKeyword("INFERENCE-STRENGTHEN-PROPERTIES");
        $ic809$ = makeSymbol("S#45854", "CYC");
        $ic810$ = makeSymbol("QUERY-PROPERTY-P");
        $ic811$ = ConsesLow.list((SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45925", "CYC"));
        $ic812$ = makeKeyword("TERSE");
        $ic813$ = makeSymbol("CB-TRANSFORMATION-RULE-STATISTICS");
        $ic814$ = makeString("Experience Control Panel");
        $ic815$ = makeString("cb-handle-transformation-rule-statistics");
        $ic816$ = makeKeyword("TRANSFORMATION-RULE-STATISTICS");
        $ic817$ = makeKeyword("CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS");
        $ic818$ = makeString("[Clear All Experience]");
        $ic819$ = makeString("Load experience from file : ");
        $ic820$ = makeString("load_filename");
        $ic821$ = makeString("Load Experience");
        $ic822$ = makeString("load");
        $ic823$ = makeString("Save experience to file : ");
        $ic824$ = makeString("save_filename");
        $ic825$ = makeString("Save Experience");
        $ic826$ = makeString("save");
        $ic827$ = makeString("Transformation Rule Statistics");
        $ic828$ = makeString("cb-transformation-rule-statistics&~S");
        $ic829$ = makeSymbol("S#45857", "CYC");
        $ic830$ = ConsesLow.list((SubLObject)makeKeyword("INFERENCE"));
        $ic831$ = makeString("cb-transformation-rule-statistics");
        $ic832$ = makeKeyword("HISTORICAL-UTILITY");
        $ic833$ = makeString("Gather during inference : ");
        $ic834$ = makeKeyword("DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic835$ = makeKeyword("ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic836$ = makeString("[Disable]");
        $ic837$ = makeString("[Enable]");
        $ic838$ = makeString("Use for sorting during inference : ");
        $ic839$ = makeKeyword("DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic840$ = makeKeyword("ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic841$ = makeString("Prune never-before-successful rules during inference : ");
        $ic842$ = makeKeyword("DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic843$ = makeKeyword("ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic844$ = makeString("No rules");
        $ic845$ = makeString("Experience files that have been loaded into this image:");
        $ic846$ = makeString("No experience files have been loaded into this image.");
        $ic847$ = makeString("Experience files that have been received by this image:");
        $ic848$ = makeString("No experience files have been received by this image.");
        $ic849$ = makeString("Total experience:");
        $ic850$ = makeString("~S rule considerations");
        $ic851$ = makeString("~S rule successes");
        $ic852$ = makeString("~S rules");
        $ic853$ = makeString("(see below)");
        $ic854$ = makeString("[Show Rule Details]");
        $ic855$ = makeString("Experience acquired by this image's inferences:");
        $ic856$ = makeKeyword("IMAGE-SPECIFIC");
        $ic857$ = makeString("Experience received from other images:");
        $ic858$ = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)makeInteger(80), (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)makeInteger(60), (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)makeInteger(40), (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)TWENTY_INTEGER, (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)makeInteger(-20), (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)makeInteger(-40), (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)makeInteger(-60), (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)makeInteger(-80), (SubLObject)ZERO_INTEGER), ConsesLow.cons((SubLObject)makeInteger(-100), (SubLObject)ZERO_INTEGER) });
        $ic859$ = makeSymbol(">=");
        $ic860$ = makeSymbol("CAR");
        $ic861$ = makeString("Rule Utility Histogram");
        $ic862$ = makeKeyword("RIGHT");
        $ic863$ = makeString("Utility");
        $ic864$ = makeString("Count");
        $ic865$ = makeString("Percent");
        $ic866$ = makeSymbol("CDR");
        $ic867$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#45926", "CYC"), (SubLObject)makeSymbol("S#45927", "CYC"));
        $ic868$ = makeString("~A %");
        $ic869$ = makeInteger(40);
        $ic870$ = makeString("~S rules with image-specific experience, sorted by ~A");
        $ic871$ = makeString("[Hide Rule Details]");
        $ic872$ = makeString("~S rules, sorted by ~A");
        $ic873$ = makeString(" ~S/~S (~S %)  utility : ~S");
        $ic874$ = makeString(" ~S utility");
        $ic875$ = makeString(", never considered");
        $ic876$ = makeString(", due to ~S % success (~S/~S)");
        $ic877$ = makeString(": ");
        $ic878$ = makeString(" mode is the least powerful inference mode in which this rule will be used.");
        $ic879$ = makeKeyword("SHALLOW");
        $ic880$ = makeKeyword("EXTENDED");
        $ic881$ = makeKeyword("MAXIMAL");
        $ic882$ = makeKeyword("BLUE");
        $ic883$ = makeString("Shallow");
        $ic884$ = makeKeyword("MAGENTA");
        $ic885$ = makeString("Extended");
        $ic886$ = makeString("Maximal");
        $ic887$ = makeSymbol("CB-DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic888$ = makeString("cb-disable-strategic-heuristic-rule-historical-utility");
        $ic889$ = makeSymbol("S#45862", "CYC");
        $ic890$ = makeSymbol("CB-ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");
        $ic891$ = makeString("cb-enable-strategic-heuristic-rule-historical-utility");
        $ic892$ = makeSymbol("S#45863", "CYC");
        $ic893$ = makeSymbol("CB-DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic894$ = makeString("cb-disable-transformation-rule-statistics-update");
        $ic895$ = makeSymbol("S#45864", "CYC");
        $ic896$ = makeSymbol("CB-ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");
        $ic897$ = makeString("cb-enable-transformation-rule-statistics-update");
        $ic898$ = makeSymbol("S#45865", "CYC");
        $ic899$ = makeSymbol("CB-DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic900$ = makeString("cb-disable-transformation-rule-historical-success-pruning");
        $ic901$ = makeSymbol("S#45866", "CYC");
        $ic902$ = makeSymbol("CB-ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");
        $ic903$ = makeString("cb-enable-transformation-rule-historical-success-pruning");
        $ic904$ = makeSymbol("S#45867", "CYC");
        $ic905$ = ConsesLow.list((SubLObject)makeSymbol("ASSERTION-ID"));
        $ic906$ = makeString("Could not determine an assertion from ~a");
        $ic907$ = makeString("The transformation statistics have been cleared.");
        $ic908$ = makeSymbol("CB-CLEAR-TRANSFORMATION-RULE-STATISTICS");
        $ic909$ = makeString("[Clear]");
        $ic910$ = makeString("cb-clear-transformation-rule-statistics&~A");
        $ic911$ = makeKeyword("CLEAR-TRANSFORMATION-RULE-STATISTICS");
        $ic912$ = makeSymbol("S#45868", "CYC");
        $ic913$ = makeSymbol("CB-CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS");
        $ic914$ = makeString("[Clear All]");
        $ic915$ = makeString("cb-clear-all-transformation-rule-statistics");
        $ic916$ = makeSymbol("S#45869", "CYC");
        $ic917$ = makeString("Must specify either load or save.");
        $ic918$ = makeString("Unexpected args ~s");
        $ic919$ = makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS");
        $ic920$ = makeString("The specified filename ~S could not be found.");
        $ic921$ = makeString("No filename was specified.");
        $ic922$ = makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-LOAD");
        $ic923$ = makeString("The specified filename ~S could not be opened for writing.");
        $ic924$ = makeString("Experience saved.");
        $ic925$ = makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-SAVE");
        $ic926$ = makeString("Forward Inference Metrics");
        $ic927$ = makeSymbol("CB-FORWARD-INFERENCE-METRICS");
        $ic928$ = makeString("cb-forward-inference-metrics");
        $ic929$ = makeKeyword("FORWARD-INFERENCE-METRICS");
        $ic930$ = makeSymbol("S#45870", "CYC");
        $ic931$ = ConsesLow.list((SubLObject)makeSymbol("S#1519", "CYC"));
        $ic932$ = makeString("Rule Forward Inference Metrics");
        $ic933$ = makeKeyword("RULE-FORWARD-INFERENCE-METRICS");
        $ic934$ = makeString("[All Forward Inference Metrics]");
        $ic935$ = makeKeyword("VERBOSE");
        $ic936$ = makeSymbol("CB-RULE-FORWARD-INFERENCE-METRICS");
        $ic937$ = makeString("[Forward Inference Metrics]");
        $ic938$ = makeString("cb-rule-forward-inference-metrics&~A");
        $ic939$ = makeSymbol("S#45871", "CYC");
        $ic940$ = makeSymbol("CB-CLEAR-FORWARD-INFERENCE-METRICS");
        $ic941$ = makeString("[Clear Forward Metrics]");
        $ic942$ = makeString("cb-clear-forward-inference-metrics");
        $ic943$ = makeKeyword("CLEAR-FORWARD-INFERENCE-METRICS");
        $ic944$ = makeSymbol("S#45872", "CYC");
        $ic945$ = makeSymbol("CB-START-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic946$ = makeString("[Start Gathering Metrics]");
        $ic947$ = makeString("cb-start-gathering-forward-inference-metrics");
        $ic948$ = makeKeyword("START-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic949$ = makeSymbol("S#45873", "CYC");
        $ic950$ = makeSymbol("CB-STOP-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic951$ = makeString("[Stop Gathering Metrics]");
        $ic952$ = makeString("cb-stop-gathering-forward-inference-metrics");
        $ic953$ = makeKeyword("STOP-GATHERING-FORWARD-INFERENCE-METRICS");
        $ic954$ = makeSymbol("S#45874", "CYC");
        $ic955$ = makeString(" No forward inference metrics have been gathered yet.");
        $ic956$ = makeString("No forward inference metrics have been gathered.");
        $ic957$ = makeKeyword("TOTAL-RULES");
        $ic958$ = makeKeyword("TOTAL-TIME");
        $ic959$ = makeKeyword("TOTAL-INFERENCES");
        $ic960$ = makeKeyword("AVERAGE-INFERENCES-PER-RULE");
        $ic961$ = makeKeyword("STDEV-INFERENCES-PER-RULE");
        $ic962$ = makeKeyword("AVERAGE-TIME-PER-RULE");
        $ic963$ = makeKeyword("STDEV-TIME-PER-RULE");
        $ic964$ = makeKeyword("AVERAGE-TIME-PER-INFERENCE");
        $ic965$ = makeKeyword("STDEV-TIME-PER-INFERENCE");
        $ic966$ = makeString("Totals");
        $ic967$ = makeString(" seconds");
        $ic968$ = makeString(" inferences");
        $ic969$ = makeString(" rules");
        $ic970$ = makeString("Averages");
        $ic971$ = makeString(" seconds / rule");
        $ic972$ = makeString(" inferences / rule");
        $ic973$ = makeString(" seconds / inference");
        $ic974$ = makeString("Standard Deviations");
        $ic975$ = makeKeyword("TIME");
        $ic976$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#13097", "CYC"), (SubLObject)makeSymbol("TIME"), (SubLObject)makeSymbol("S#32032", "CYC"), (SubLObject)makeSymbol("S#32033", "CYC"), (SubLObject)makeSymbol("S#32034", "CYC"));
        $ic977$ = ConsesLow.list((SubLObject)makeKeyword("RULE"), (SubLObject)makeKeyword("TIME"), (SubLObject)makeKeyword("TRIGGER-GAFS"), (SubLObject)makeKeyword("INFERENCE-COUNT"), (SubLObject)makeKeyword("INFERENCES"));
        $ic978$ = makeKeyword("RULE");
        $ic979$ = makeKeyword("TRIGGER-GAFS");
        $ic980$ = makeKeyword("INFERENCE-COUNT");
        $ic981$ = makeKeyword("INFERENCES");
        $ic982$ = makeString("cumulative time ~S%");
        $ic983$ = makeKeyword("WHITE");
        $ic984$ = makeKeyword("BLACK");
        $ic985$ = makeString(" seconds avg.");
        $ic986$ = makeString("80%");
        $ic987$ = makeString("[Show Detail]");
        $ic988$ = makeString("Inferences:");
        $ic989$ = makeString(" ~S good");
        $ic990$ = makeString(" ~S neutral");
        $ic991$ = makeString(" ~S no-good");
        $ic992$ = makeString("Good: ");
        $ic993$ = makeString("Neutral: ");
        $ic994$ = makeString("No-Good: ");
        $ic995$ = makeString("Trigger GAFs:");
        $ic996$ = makeString(" ~S successful");
        $ic997$ = makeString(" ~S failed");
        $ic998$ = makeString("Successful: ");
        $ic999$ = makeString("Failed: ");
        $ic1000$ = makeKeyword("INFERENCE");
        $ic1001$ = makeKeyword("VERY-VERBOSE");
        $ic1002$ = makeString(" (~as)");
        $ic1003$ = makeString("~S seconds");
        $ic1004$ = makeString(", ~S inferences, ~S seconds/inference");
        $ic1005$ = makeKeyword("GOOD");
        $ic1006$ = makeKeyword("NEUTRAL");
        $ic1007$ = makeKeyword("NO-GOOD");
        $ic1008$ = makeString("!");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 9504 ms
	
	Decompiled with Procyon 0.5.32.
*/