package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0099 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0099";
    public static final String myFingerPrint = "a00845f965acc681237b80f00733a2acb6617e7b933b10ca954e390378ba6d6a";
    public static SubLSymbol $g1266$;
    public static SubLSymbol $g1267$;
    public static SubLSymbol $g1268$;
    public static SubLSymbol $g1269$;
    public static SubLSymbol $g1270$;
    public static SubLSymbol $g1271$;
    public static SubLSymbol $g1272$;
    private static SubLSymbol $g1273$;
    private static SubLSymbol $g1274$;
    private static SubLSymbol $g1275$;
    private static SubLSymbol $g1276$;
    private static SubLSymbol $g1277$;
    private static SubLSymbol $g1278$;
    private static SubLSymbol $g1279$;
    private static SubLSymbol $g1280$;
    private static SubLSymbol $g1281$;
    private static SubLSymbol $g1282$;
    private static SubLSymbol $g1283$;
    private static SubLSymbol $g1284$;
    private static SubLSymbol $g1285$;
    private static SubLSymbol $g1286$;
    private static SubLSymbol $g1287$;
    private static SubLSymbol $g1288$;
    private static SubLSymbol $g1289$;
    private static SubLSymbol $g1290$;
    private static SubLSymbol $g1291$;
    private static SubLSymbol $g1292$;
    private static SubLSymbol $g1293$;
    private static SubLSymbol $g1294$;
    private static SubLSymbol $g1295$;
    private static SubLSymbol $g1296$;
    private static SubLSymbol $g1297$;
    private static SubLSymbol $g1298$;
    private static SubLSymbol $g1299$;
    private static SubLSymbol $g1300$;
    private static SubLSymbol $g1301$;
    private static SubLSymbol $g1302$;
    private static SubLSymbol $g1303$;
    private static SubLSymbol $g1304$;
    private static SubLSymbol $g1305$;
    private static SubLSymbol $g1306$;
    private static SubLSymbol $g1307$;
    private static SubLSymbol $g1308$;
    private static SubLSymbol $g1309$;
    private static SubLSymbol $g1310$;
    private static SubLSymbol $g1311$;
    private static SubLSymbol $g1312$;
    private static SubLSymbol $g1313$;
    private static SubLSymbol $g1314$;
    private static SubLSymbol $g1315$;
    private static SubLSymbol $g1316$;
    private static SubLSymbol $g1317$;
    private static SubLSymbol $g1318$;
    private static SubLSymbol $g1319$;
    private static SubLSymbol $g1320$;
    private static SubLSymbol $g1321$;
    private static SubLSymbol $g1322$;
    private static SubLSymbol $g1323$;
    public static SubLSymbol $g1324$;
    public static SubLSymbol $g1325$;
    public static SubLSymbol $g1326$;
    public static SubLSymbol $g1327$;
    private static SubLSymbol $g1328$;
    public static SubLSymbol $g1329$;
    public static SubLSymbol $g1330$;
    public static SubLSymbol $g1331$;
    public static SubLSymbol $g1332$;
    public static SubLSymbol $g1333$;
    private static SubLSymbol $g1334$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLInteger $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
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
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
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
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLList $ic112$;
    private static final SubLList $ic113$;
    private static final SubLList $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLInteger $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLList $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLList $ic144$;
    private static final SubLList $ic145$;
    private static final SubLList $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLList $ic150$;
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
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLList $ic176$;
    private static final SubLList $ic177$;
    private static final SubLList $ic178$;
    private static final SubLList $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLList $ic182$;
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
    private static final SubLString $ic206$;
    private static final SubLSymbol $ic207$;
    private static final SubLString $ic208$;
    private static final SubLString $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLString $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLString $ic220$;
    private static final SubLSymbol $ic221$;
    private static final SubLSymbol $ic222$;
    private static final SubLList $ic223$;
    private static final SubLList $ic224$;
    private static final SubLList $ic225$;
    private static final SubLList $ic226$;
    private static final SubLSymbol $ic227$;
    private static final SubLList $ic228$;
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
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLString $ic259$;
    private static final SubLList $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLList $ic262$;
    private static final SubLSymbol $ic263$;
    private static final SubLList $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLList $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLList $ic269$;
    private static final SubLList $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLSymbol $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLSymbol $ic278$;
    private static final SubLSymbol $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLList $ic284$;
    private static final SubLSymbol $ic285$;
    private static final SubLSymbol $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLSymbol $ic288$;
    private static final SubLSymbol $ic289$;
    private static final SubLSymbol $ic290$;
    private static final SubLSymbol $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLSymbol $ic293$;
    private static final SubLSymbol $ic294$;
    private static final SubLSymbol $ic295$;
    private static final SubLString $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLString $ic298$;
    private static final SubLList $ic299$;
    private static final SubLList $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLList $ic302$;
    private static final SubLList $ic303$;
    private static final SubLList $ic304$;
    private static final SubLList $ic305$;
    private static final SubLString $ic306$;
    private static final SubLList $ic307$;
    private static final SubLList $ic308$;
    private static final SubLString $ic309$;
    private static final SubLList $ic310$;
    private static final SubLList $ic311$;
    private static final SubLString $ic312$;
    private static final SubLList $ic313$;
    private static final SubLList $ic314$;
    private static final SubLList $ic315$;
    private static final SubLList $ic316$;
    private static final SubLString $ic317$;
    private static final SubLList $ic318$;
    private static final SubLString $ic319$;
    private static final SubLList $ic320$;
    private static final SubLList $ic321$;
    private static final SubLString $ic322$;
    private static final SubLList $ic323$;
    private static final SubLList $ic324$;
    private static final SubLList $ic325$;
    private static final SubLString $ic326$;
    private static final SubLList $ic327$;
    private static final SubLString $ic328$;
    private static final SubLList $ic329$;
    private static final SubLList $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLInteger $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLString $ic334$;
    private static final SubLList $ic335$;
    private static final SubLList $ic336$;
    private static final SubLList $ic337$;
    private static final SubLSymbol $ic338$;
    private static final SubLInteger $ic339$;
    private static final SubLSymbol $ic340$;
    private static final SubLString $ic341$;
    private static final SubLList $ic342$;
    private static final SubLList $ic343$;
    private static final SubLList $ic344$;
    private static final SubLString $ic345$;
    private static final SubLSymbol $ic346$;
    private static final SubLSymbol $ic347$;
    private static final SubLList $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLString $ic350$;
    private static final SubLString $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLInteger $ic354$;
    private static final SubLInteger $ic355$;
    private static final SubLInteger $ic356$;
    private static final SubLInteger $ic357$;
    private static final SubLList $ic358$;
    private static final SubLList $ic359$;
    private static final SubLSymbol $ic360$;
    private static final SubLSymbol $ic361$;
    private static final SubLSymbol $ic362$;
    private static final SubLSymbol $ic363$;
    private static final SubLSymbol $ic364$;
    private static final SubLSymbol $ic365$;
    private static final SubLSymbol $ic366$;
    private static final SubLSymbol $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLList $ic370$;
    private static final SubLSymbol $ic371$;
    private static final SubLSymbol $ic372$;
    private static final SubLSymbol $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLList $ic375$;
    private static final SubLSymbol $ic376$;
    private static final SubLSymbol $ic377$;
    private static final SubLList $ic378$;
    private static final SubLSymbol $ic379$;
    private static final SubLSymbol $ic380$;
    private static final SubLSymbol $ic381$;
    private static final SubLSymbol $ic382$;
    private static final SubLSymbol $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLSymbol $ic385$;
    private static final SubLSymbol $ic386$;
    private static final SubLList $ic387$;
    private static final SubLSymbol $ic388$;
    private static final SubLSymbol $ic389$;
    private static final SubLList $ic390$;
    private static final SubLSymbol $ic391$;
    private static final SubLList $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLList $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLString $ic397$;
    private static final SubLList $ic398$;
    private static final SubLSymbol $ic399$;
    private static final SubLList $ic400$;
    private static final SubLSymbol $ic401$;
    private static final SubLSymbol $ic402$;
    private static final SubLSymbol $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLSymbol $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLString $ic408$;
    private static final SubLList $ic409$;
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
    
    
    public static SubLObject f7026(SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var1 == module0099.UNPROVIDED) {
            var1 = module0099.$g1267$.getGlobalValue();
        }
        if (var2 == module0099.UNPROVIDED) {
            var2 = module0099.$g1268$.getGlobalValue();
        }
        if (var3 == module0099.UNPROVIDED) {
            var3 = (SubLObject)module0099.FIVE_INTEGER;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert module0099.NIL != Types.stringp(var1) : var1;
        assert module0099.NIL != module0004.f105(var2) : var2;
        SubLObject var5 = (SubLObject)module0099.NIL;
        try {
            var4.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var6 = Errors.$error_handler$.currentBinding(var4);
            try {
                Errors.$error_handler$.bind((SubLObject)module0099.$ic35$, var4);
                try {
                    SubLObject var7 = (SubLObject)module0099.NIL;
                    try {
                        var7 = module0004.f82(var1, var2, (SubLObject)module0099.NIL, (SubLObject)module0099.$ic36$);
                        if (module0099.NIL != module0003.f70(var7, var1, var2)) {
                            module0021.f1038((SubLObject)ConsesLow.cons(module0099.$g1274$.getGlobalValue(), (SubLObject)module0099.NIL), var7);
                            streams_high.finish_output(var7);
                            final SubLObject var8 = module0003.f61();
                            try {
                                var4.throwStack.push(var8);
                                final SubLObject var6_9 = module0003.$g4$.currentBinding(var4);
                                try {
                                    module0003.$g4$.bind((SubLObject)module0099.T, var4);
                                    SubLObject var9 = (SubLObject)module0099.NIL;
                                    try {
                                        final SubLObject var6_10 = module0003.$g5$.currentBinding(var4);
                                        try {
                                            module0003.$g5$.bind(Numbers.add((SubLObject)module0099.ONE_INTEGER, module0003.$g5$.getDynamicValue(var4)), var4);
                                            var9 = module0003.f62(var3, var8);
                                            module0021.f1060(var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
                                        }
                                        finally {
                                            module0003.$g5$.rebind(var6_10, var4);
                                        }
                                    }
                                    finally {
                                        final SubLObject var6_11 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0099.T, var4);
                                            module0003.f64(var9);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var6_11, var4);
                                        }
                                    }
                                }
                                finally {
                                    module0003.$g4$.rebind(var6_9, var4);
                                }
                            }
                            catch (Throwable var10) {
                                var5 = Errors.handleThrowable(var10, var8);
                            }
                            finally {
                                var4.throwStack.pop();
                            }
                        }
                    }
                    finally {
                        final SubLObject var6_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(var4);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0099.T, var4);
                            if (module0099.NIL != var7) {
                                streams_high.close(var7, (SubLObject)module0099.UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var6_12, var4);
                        }
                    }
                }
                catch (Throwable var11) {
                    Errors.handleThrowable(var11, (SubLObject)module0099.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var6, var4);
            }
        }
        catch (Throwable var12) {
            var5 = Errors.handleThrowable(var12, module0003.$g3$.getGlobalValue());
        }
        finally {
            var4.throwStack.pop();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL == var5);
    }
    
    public static SubLObject f7027(final SubLObject var16, final SubLObject var7) {
        f7028(var16, var7, (SubLObject)module0099.ZERO_INTEGER);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7029(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX8837_native.class) ? module0099.T : module0099.NIL);
    }
    
    public static SubLObject f7030(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f7031(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f7032(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f7033(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField5();
    }
    
    public static SubLObject f7034(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField6();
    }
    
    public static SubLObject f7035(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField7();
    }
    
    public static SubLObject f7036(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField8();
    }
    
    public static SubLObject f7037(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField9();
    }
    
    public static SubLObject f7038(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField10();
    }
    
    public static SubLObject f7039(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField11();
    }
    
    public static SubLObject f7040(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField12();
    }
    
    public static SubLObject f7041(final SubLObject var16) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.getField13();
    }
    
    public static SubLObject f7042(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField2(var18);
    }
    
    public static SubLObject f7043(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField3(var18);
    }
    
    public static SubLObject f7044(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField4(var18);
    }
    
    public static SubLObject f7045(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField5(var18);
    }
    
    public static SubLObject f7046(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField6(var18);
    }
    
    public static SubLObject f7047(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField7(var18);
    }
    
    public static SubLObject f7048(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField8(var18);
    }
    
    public static SubLObject f7049(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField9(var18);
    }
    
    public static SubLObject f7050(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField10(var18);
    }
    
    public static SubLObject f7051(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField11(var18);
    }
    
    public static SubLObject f7052(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField12(var18);
    }
    
    public static SubLObject f7053(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7029(var16) : var16;
        return var16.setField13(var18);
    }
    
    public static SubLObject f7054(SubLObject var19) {
        if (var19 == module0099.UNPROVIDED) {
            var19 = (SubLObject)module0099.NIL;
        }
        final SubLObject var20 = (SubLObject)new $sX8837_native();
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var21 = (SubLObject)module0099.NIL, var21 = var19; module0099.NIL != var21; var21 = conses_high.cddr(var21)) {
            var22 = var21.first();
            var23 = conses_high.cadr(var21);
            var24 = var22;
            if (var24.eql((SubLObject)module0099.$ic70$)) {
                f7042(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic71$)) {
                f7043(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic72$)) {
                f7044(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic73$)) {
                f7045(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic74$)) {
                f7046(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic75$)) {
                f7047(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic76$)) {
                f7048(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic77$)) {
                f7049(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic78$)) {
                f7050(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic79$)) {
                f7051(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic80$)) {
                f7052(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic81$)) {
                f7053(var20, var23);
            }
            else {
                Errors.error((SubLObject)module0099.$ic82$, var22);
            }
        }
        return var20;
    }
    
    public static SubLObject f7055(final SubLObject var25, final SubLObject var26) {
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic83$, (SubLObject)module0099.$ic84$, (SubLObject)module0099.TWELVE_INTEGER);
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic70$, f7030(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic71$, f7031(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic72$, f7032(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic73$, f7033(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic74$, f7034(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic75$, f7035(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic76$, f7036(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic77$, f7037(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic78$, f7038(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic79$, f7039(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic80$, f7040(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic81$, f7041(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic86$, (SubLObject)module0099.$ic84$, (SubLObject)module0099.TWELVE_INTEGER);
        return var25;
    }
    
    public static SubLObject f7056(final SubLObject var25, final SubLObject var26) {
        return f7055(var25, var26);
    }
    
    public static SubLObject f7028(final SubLObject var27, final SubLObject var7, final SubLObject var28) {
        streams_high.write_string(f7057(var27), var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        return var27;
    }
    
    public static SubLObject f7057(final SubLObject var27) {
        SubLObject var28 = (SubLObject)module0099.NIL;
        SubLObject var29 = (SubLObject)module0099.NIL;
        try {
            var29 = streams_high.make_private_string_output_stream();
            streams_high.write_string((SubLObject)module0099.$ic88$, var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            if (module0099.NIL == f7058(var27)) {
                streams_high.write_string((SubLObject)module0099.$ic89$, var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            }
            streams_high.write_string((SubLObject)module0099.$ic90$, var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            streams_high.write_string(f7030(var27), var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            streams_high.write_string((SubLObject)module0099.$ic91$, var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            streams_high.write_string(f7032(var27), var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            streams_high.write_string((SubLObject)module0099.$ic92$, var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            print_high.prin1(f7033(var27), var29);
            streams_high.write_string((SubLObject)module0099.$ic93$, var29, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            var28 = streams_high.get_output_stream_string(var29);
        }
        finally {
            final SubLObject var30 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0099.T);
                streams_high.close(var29, (SubLObject)module0099.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var30);
            }
        }
        return var28;
    }
    
    public static SubLObject f7059(final SubLObject var30, final SubLObject var31, final SubLObject var32, SubLObject var33) {
        if (var33 == module0099.UNPROVIDED) {
            var33 = (SubLObject)module0099.NIL;
        }
        final SubLThread var34 = SubLProcess.currentSubLThread();
        final SubLObject var36;
        final SubLObject var35 = var36 = var33;
        SubLObject var37 = (SubLObject)module0099.NIL;
        SubLObject var38 = var36;
        SubLObject var39 = (SubLObject)module0099.NIL;
        SubLObject var39_40 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var35, (SubLObject)module0099.$ic94$);
            var39_40 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var35, (SubLObject)module0099.$ic94$);
            if (module0099.NIL == conses_high.member(var39_40, (SubLObject)module0099.$ic95$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var39 = (SubLObject)module0099.T;
            }
            if (var39_40 == module0099.$ic96$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (module0099.NIL != var39 && module0099.NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)module0099.$ic94$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic72$, var36);
        final SubLObject var41 = (module0099.NIL != var40) ? conses_high.cadr(var40) : module0099.$g1266$.getGlobalValue();
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic97$, var36);
        final SubLObject var43 = (SubLObject)((module0099.NIL != var42) ? conses_high.cadr(var42) : module0099.NIL);
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic77$, var36);
        final SubLObject var45 = (module0099.NIL != var44) ? conses_high.cadr(var44) : module0099.$g1270$.getGlobalValue();
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic78$, var36);
        final SubLObject var47 = (module0099.NIL != var46) ? conses_high.cadr(var46) : var41;
        final SubLObject var48 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic73$, var36);
        final SubLObject var49 = (module0099.NIL != var48) ? conses_high.cadr(var48) : module0099.$g1268$.getGlobalValue();
        final SubLObject var50 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic98$, var36);
        final SubLObject var51 = (module0099.NIL != var50) ? conses_high.cadr(var50) : module0099.$g1271$.getGlobalValue();
        assert module0099.NIL != Types.stringp(var30) : var30;
        if (module0099.NIL != var31 && !module0099.areAssertionsDisabledFor(me) && module0099.NIL == Types.stringp(var31)) {
            throw new AssertionError(var31);
        }
        if (module0099.NIL != var32 && !module0099.areAssertionsDisabledFor(me) && module0099.NIL == Types.stringp(var32)) {
            throw new AssertionError(var32);
        }
        assert module0099.NIL != Types.stringp(var41) : var41;
        if (module0099.NIL != var43 && !module0099.areAssertionsDisabledFor(me) && module0099.NIL == Types.integerp(var43)) {
            throw new AssertionError(var43);
        }
        assert module0099.NIL != Types.integerp(var49) : var49;
        assert module0099.NIL != Types.stringp(var45) : var45;
        assert module0099.NIL != Types.stringp(var47) : var47;
        assert module0099.NIL != module0048.f3294(var51) : var51;
        SubLObject var52 = f7054((SubLObject)module0099.UNPROVIDED);
        SubLObject var53 = (SubLObject)module0099.NIL;
        SubLObject var54 = (SubLObject)module0099.NIL;
        f7042(var52, var30);
        f7043(var52, var31);
        f7044(var52, var41);
        f7045(var52, var49);
        f7049(var52, var45);
        f7050(var52, var47);
        f7048(var52, Locks.make_lock((SubLObject)module0099.$ic101$));
        f7051(var52, (SubLObject)module0099.$ic102$);
        f7052(var52, module0055.f4017());
        final SubLObject var55 = module0003.f61();
        try {
            var34.throwStack.push(var55);
            final SubLObject var56 = module0003.$g4$.currentBinding(var34);
            try {
                module0003.$g4$.bind((SubLObject)module0099.T, var34);
                SubLObject var57 = (SubLObject)module0099.NIL;
                try {
                    final SubLObject var6_53 = module0003.$g5$.currentBinding(var34);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)module0099.ONE_INTEGER, module0003.$g5$.getDynamicValue(var34)), var34);
                        var57 = module0003.f62(var51, var55);
                        try {
                            var34.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var6_54 = Errors.$error_handler$.currentBinding(var34);
                            try {
                                Errors.$error_handler$.bind((SubLObject)module0099.$ic35$, var34);
                                try {
                                    if (module0099.NIL == var47 || module0099.NIL == var49) {
                                        Errors.error((SubLObject)module0099.$ic103$);
                                    }
                                    f7046(var52, module0004.f83(var47, var49, (SubLObject)module0099.$ic36$));
                                }
                                catch (Throwable var58) {
                                    Errors.handleThrowable(var58, (SubLObject)module0099.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var6_54, var34);
                            }
                        }
                        catch (Throwable var59) {
                            var53 = Errors.handleThrowable(var59, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var34.throwStack.pop();
                        }
                        if (module0099.NIL != var53) {
                            var52 = f7060(var52, f7061(module0099.$g1319$.getGlobalValue(), var53, (SubLObject)module0099.UNPROVIDED));
                        }
                        else {
                            f7053(var52, f7062(var52));
                            final SubLObject var60 = f7063(var52, module0099.$g1284$.getGlobalValue(), (SubLObject)ConsesLow.list(f7064(var41, var30, var31, var32, var45, var43)));
                            if (module0099.NIL != f7065(var60)) {
                                f7066(var52);
                                var52 = var60;
                            }
                        }
                    }
                    finally {
                        module0003.$g5$.rebind(var6_53, var34);
                    }
                }
                finally {
                    final SubLObject var6_55 = Threads.$is_thread_performing_cleanupP$.currentBinding(var34);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0099.T, var34);
                        module0003.f64(var57);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var6_55, var34);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var56, var34);
            }
        }
        catch (Throwable var61) {
            var54 = Errors.handleThrowable(var61, var55);
        }
        finally {
            var34.throwStack.pop();
        }
        if (module0099.NIL != var54) {
            f7066(var52);
            var52 = f7060(var52, f7061(module0099.$g1319$.getGlobalValue(), (SubLObject)module0099.$ic104$, (SubLObject)module0099.UNPROVIDED));
        }
        return var52;
    }
    
    public static SubLObject f7067(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7029(var57) && module0099.NIL != f7058(var57));
    }
    
    public static SubLObject f7058(final SubLObject var27) {
        assert module0099.NIL != f7029(var27) : var27;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7034(var27) && module0099.NIL != streams_high.open_stream_p(f7034(var27)));
    }
    
    public static SubLObject f7066(final SubLObject var27) {
        assert module0099.NIL != f7029(var27) : var27;
        final SubLObject var28 = f7036(var27);
        SubLObject var29 = (SubLObject)module0099.NIL;
        try {
            var29 = Locks.seize_lock(var28);
            if (module0099.NIL != f7041(var27)) {
                Threads.kill_process(f7041(var27));
            }
            f7053(var27, (SubLObject)module0099.NIL);
            if (module0099.NIL != f7034(var27)) {
                streams_high.close(f7034(var27), (SubLObject)module0099.UNPROVIDED);
            }
            f7046(var27, (SubLObject)module0099.NIL);
            SubLObject var30 = f7035(var27);
            SubLObject var31 = (SubLObject)module0099.NIL;
            var31 = var30.first();
            while (module0099.NIL != var30) {
                f7068(var31);
                var30 = var30.rest();
                var31 = var30.first();
            }
            f7047(var27, (SubLObject)module0099.NIL);
            return var27;
        }
        finally {
            if (module0099.NIL != var29) {
                Locks.release_lock(var28);
            }
        }
    }
    
    public static SubLObject f7069(final SubLObject var27) {
        assert module0099.NIL != f7067(var27) : var27;
        final SubLObject var28 = f7070(var27);
        if (module0099.NIL != f7071(var28)) {
            f7047(var27, (SubLObject)ConsesLow.cons(var28, f7035(var27)));
        }
        return var28;
    }
    
    public static SubLObject f7072(final SubLObject var27, final SubLObject var62) {
        assert module0099.NIL != f7067(var27) : var27;
        assert module0099.NIL != Types.stringp(var62) : var62;
        final SubLObject var63 = f7073(var27, var62);
        if (module0099.NIL != f7071(var63)) {
            f7047(var27, (SubLObject)ConsesLow.cons(var63, f7035(var27)));
        }
        return var63;
    }
    
    public static SubLObject f7074(final SubLObject var27, final SubLObject var63) {
        assert module0099.NIL != f7067(var27) : var27;
        assert module0099.NIL != Types.booleanp(var63) : var63;
        return f7063(var27, module0099.$g1294$.getGlobalValue(), (SubLObject)ConsesLow.list(var63));
    }
    
    public static SubLObject f7075(final SubLObject var27) {
        assert module0099.NIL != f7067(var27) : var27;
        return f7063(var27, module0099.$g1299$.getGlobalValue(), (SubLObject)module0099.NIL);
    }
    
    public static SubLObject f7076(final SubLObject var27) {
        assert module0099.NIL != f7067(var27) : var27;
        return f7063(var27, module0099.$g1295$.getGlobalValue(), (SubLObject)module0099.NIL);
    }
    
    public static SubLObject f7077(final SubLObject var27) {
        assert module0099.NIL != f7067(var27) : var27;
        return f7063(var27, module0099.$g1296$.getGlobalValue(), (SubLObject)module0099.NIL);
    }
    
    public static SubLObject f7078(final SubLObject var27) {
        assert module0099.NIL != f7067(var27) : var27;
        return f7063(var27, module0099.$g1297$.getGlobalValue(), (SubLObject)module0099.NIL);
    }
    
    public static SubLObject f7079(final SubLObject var27, final SubLObject var64) {
        assert module0099.NIL != f7067(var27) : var27;
        assert module0099.NIL != f7080(var64) : var64;
        return f7063(var27, module0099.$g1298$.getGlobalValue(), (SubLObject)ConsesLow.list(var64));
    }
    
    public static SubLObject f7081(final SubLObject var16, final SubLObject var7) {
        compatibility.default_struct_print_function(var16, var7, (SubLObject)module0099.ZERO_INTEGER);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7082(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX8839_native.class) ? module0099.T : module0099.NIL);
    }
    
    public static SubLObject f7083(final SubLObject var16) {
        assert module0099.NIL != f7082(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f7084(final SubLObject var16) {
        assert module0099.NIL != f7082(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f7085(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7082(var16) : var16;
        return var16.setField2(var18);
    }
    
    public static SubLObject f7086(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7082(var16) : var16;
        return var16.setField3(var18);
    }
    
    public static SubLObject f7087(SubLObject var19) {
        if (var19 == module0099.UNPROVIDED) {
            var19 = (SubLObject)module0099.NIL;
        }
        final SubLObject var20 = (SubLObject)new $sX8839_native();
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var21 = (SubLObject)module0099.NIL, var21 = var19; module0099.NIL != var21; var21 = conses_high.cddr(var21)) {
            var22 = var21.first();
            var23 = conses_high.cadr(var21);
            var24 = var22;
            if (var24.eql((SubLObject)module0099.$ic122$)) {
                f7085(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic123$)) {
                f7086(var20, var23);
            }
            else {
                Errors.error((SubLObject)module0099.$ic82$, var22);
            }
        }
        return var20;
    }
    
    public static SubLObject f7088(final SubLObject var25, final SubLObject var26) {
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic83$, (SubLObject)module0099.$ic124$, (SubLObject)module0099.TWO_INTEGER);
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic122$, f7083(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic123$, f7084(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic86$, (SubLObject)module0099.$ic124$, (SubLObject)module0099.TWO_INTEGER);
        return var25;
    }
    
    public static SubLObject f7089(final SubLObject var25, final SubLObject var26) {
        return f7088(var25, var26);
    }
    
    public static SubLObject f7090() {
        final SubLObject var68 = f7087((SubLObject)module0099.UNPROVIDED);
        f7085(var68, Semaphores.new_semaphore((SubLObject)module0099.$ic126$, (SubLObject)module0099.ZERO_INTEGER));
        return var68;
    }
    
    public static SubLObject f7091(final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)module0099.NIL;
        while (module0099.NIL == var70) {
            if (module0099.NIL != Semaphores.semaphore_wait_with_timeout(f7083(var68), module0099.$g1326$.getDynamicValue(var69))) {
                var70 = f7084(var68);
            }
            else {
                var70 = f7061(module0099.$g1316$.getGlobalValue(), Sequences.cconcatenate((SubLObject)module0099.$ic128$, new SubLObject[] { module0006.f207(module0099.$g1326$.getDynamicValue(var69)), module0099.$ic129$ }), (SubLObject)module0099.UNPROVIDED);
            }
        }
        return var70;
    }
    
    public static SubLObject f7062(final SubLObject var27) {
        return module0004.f78(Sequences.cconcatenate((SubLObject)module0099.$ic130$, module0006.f203(f7057(var27))), (SubLObject)module0099.$ic131$, (SubLObject)ConsesLow.list(var27));
    }
    
    public static SubLObject f7092(final SubLObject var27) {
        enforceType(var27, module0099.$ic38$);
        SubLObject var28 = (SubLObject)module0099.NIL;
        SubLObject var29 = (SubLObject)module0099.NIL;
        while (true) {
            var28 = f7093(var27);
            final SubLObject var30 = f7036(var27);
            SubLObject var31 = (SubLObject)module0099.NIL;
            try {
                var31 = Locks.seize_lock(var30);
                var29 = module0055.f4023(f7040(var27));
            }
            finally {
                if (module0099.NIL != var31) {
                    Locks.release_lock(var30);
                }
            }
            if (module0099.NIL != var29) {
                f7086(var29, var28);
                Semaphores.semaphore_signal(f7083(var29));
            }
            else if (module0099.NIL != f7094(var28)) {
                streams_high.close(f7034(var27), (SubLObject)module0099.UNPROVIDED);
                f7066(var27);
            }
            else {
                Errors.error((SubLObject)module0099.$ic132$, var28);
            }
        }
    }
    
    public static SubLObject f7063(final SubLObject var27, final SubLObject var71, final SubLObject var72) {
        final SubLObject var73 = f7090();
        SubLObject var74 = (SubLObject)module0099.NIL;
        SubLObject var75 = (SubLObject)module0099.NIL;
        var74 = f7095(var27, var73, var71, var72);
        if (module0099.NIL != f7094(var74)) {
            streams_high.close(f7034(var27), (SubLObject)module0099.UNPROVIDED);
            f7066(var27);
            return f7060(var27, var74);
        }
        var75 = f7091(var73);
        if (module0099.NIL != f7065(var75)) {
            if (module0099.NIL != f7094(var75)) {
                streams_high.close(f7034(var27), (SubLObject)module0099.UNPROVIDED);
                f7066(var27);
            }
            return f7060(var27, var75);
        }
        return var75;
    }
    
    public static SubLObject f7095(final SubLObject var27, final SubLObject var68, final SubLObject var71, final SubLObject var72) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        enforceType(var27, module0099.$ic38$);
        SubLObject var74 = (SubLObject)module0099.NIL;
        SubLObject var75 = (SubLObject)module0099.NIL;
        try {
            var73.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var76 = Errors.$error_handler$.currentBinding(var73);
            try {
                Errors.$error_handler$.bind((SubLObject)module0099.$ic35$, var73);
                try {
                    if (module0099.NIL == f7034(var27)) {
                        Errors.error((SubLObject)module0099.$ic133$);
                    }
                    final SubLObject var77 = f7036(var27);
                    SubLObject var78 = (SubLObject)module0099.NIL;
                    try {
                        var78 = Locks.seize_lock(var77);
                        module0055.f4021(var68, f7040(var27));
                        module0021.f1038((SubLObject)ConsesLow.cons(var71, var72), f7034(var27));
                        streams_high.force_output(f7034(var27));
                    }
                    finally {
                        if (module0099.NIL != var78) {
                            Locks.release_lock(var77);
                        }
                    }
                }
                catch (Throwable var79) {
                    Errors.handleThrowable(var79, (SubLObject)module0099.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var76, var73);
            }
        }
        catch (Throwable var80) {
            var74 = Errors.handleThrowable(var80, module0003.$g3$.getGlobalValue());
        }
        finally {
            var73.throwStack.pop();
        }
        if (module0099.NIL != var74) {
            var75 = f7061(module0099.$g1319$.getGlobalValue(), var74, (SubLObject)module0099.UNPROVIDED);
        }
        return var75;
    }
    
    public static SubLObject f7093(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        enforceType(var27, module0099.$ic38$);
        SubLObject var29 = (SubLObject)module0099.NIL;
        SubLObject var30 = (SubLObject)module0099.NIL;
        try {
            var28.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var31 = Errors.$error_handler$.currentBinding(var28);
            try {
                Errors.$error_handler$.bind((SubLObject)module0099.$ic35$, var28);
                try {
                    if (module0099.NIL == f7034(var27)) {
                        Errors.error((SubLObject)module0099.$ic133$);
                    }
                    var30 = module0021.f1060(f7034(var27), (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
                }
                catch (Throwable var32) {
                    Errors.handleThrowable(var32, (SubLObject)module0099.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var31, var28);
            }
        }
        catch (Throwable var33) {
            var29 = Errors.handleThrowable(var33, module0003.$g3$.getGlobalValue());
        }
        finally {
            var28.throwStack.pop();
        }
        if (module0099.NIL != var29) {
            var30 = (SubLObject)ConsesLow.cons(module0099.$g1319$.getGlobalValue(), (SubLObject)ConsesLow.list(var29));
        }
        return f7096(var30);
    }
    
    public static SubLObject f7060(final SubLObject var27, final SubLObject var78) {
        final SubLObject var79 = f7039(var27);
        if (var79.eql((SubLObject)module0099.$ic102$)) {
            return var78;
        }
        if (var79.eql((SubLObject)module0099.$ic134$)) {
            f7097(var78);
            return var78;
        }
        if (var79.eql((SubLObject)module0099.$ic135$)) {
            f7098(var78);
            return var78;
        }
        assert module0099.NIL != f7099(f7039(var27)) : f7039(var27);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7080(final SubLObject var57) {
        return conses_high.member(var57, (SubLObject)module0099.$ic137$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
    }
    
    public static SubLObject f7100(final SubLObject var27, final SubLObject var79) {
        f7051(var27, var79);
        return var27;
    }
    
    public static SubLObject f7101(final SubLObject var80, final SubLObject var81) {
        return (SubLObject)ConsesLow.cons(var80, var81);
    }
    
    public static SubLObject f7102(final SubLObject var75) {
        return var75.first();
    }
    
    public static SubLObject f7096(final SubLObject var75) {
        final SubLObject var76 = f7102(var75);
        if (var76.isNegative()) {
            final SubLObject var77 = var75.rest();
            final SubLObject var78 = var77.first();
            final SubLObject var79 = conses_high.second(var77);
            return f7061(var76, var78, var79);
        }
        if (var76.eql(module0099.$g1308$.getGlobalValue())) {
            return (SubLObject)module0099.$ic140$;
        }
        return var75.rest();
    }
    
    public static SubLObject f7103(final SubLObject var57) {
        return Equality.eq(var57, (SubLObject)module0099.$ic141$);
    }
    
    public static SubLObject f7104(final SubLObject var57) {
        return var57;
    }
    
    public static SubLObject f7105(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL == var57);
    }
    
    public static SubLObject f7106(final SubLObject var16, final SubLObject var7) {
        f7107(var16, var7, (SubLObject)module0099.ZERO_INTEGER);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7065(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX8841_native.class) ? module0099.T : module0099.NIL);
    }
    
    public static SubLObject f7108(final SubLObject var16) {
        assert module0099.NIL != f7065(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f7109(final SubLObject var16) {
        assert module0099.NIL != f7065(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f7110(final SubLObject var16) {
        assert module0099.NIL != f7065(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f7111(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7065(var16) : var16;
        return var16.setField2(var18);
    }
    
    public static SubLObject f7112(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7065(var16) : var16;
        return var16.setField3(var18);
    }
    
    public static SubLObject f7113(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7065(var16) : var16;
        return var16.setField4(var18);
    }
    
    public static SubLObject f7114(SubLObject var19) {
        if (var19 == module0099.UNPROVIDED) {
            var19 = (SubLObject)module0099.NIL;
        }
        final SubLObject var20 = (SubLObject)new $sX8841_native();
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var21 = (SubLObject)module0099.NIL, var21 = var19; module0099.NIL != var21; var21 = conses_high.cddr(var21)) {
            var22 = var21.first();
            var23 = conses_high.cadr(var21);
            var24 = var22;
            if (var24.eql((SubLObject)module0099.$ic157$)) {
                f7111(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic158$)) {
                f7112(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic159$)) {
                f7113(var20, var23);
            }
            else {
                Errors.error((SubLObject)module0099.$ic82$, var22);
            }
        }
        return var20;
    }
    
    public static SubLObject f7115(final SubLObject var25, final SubLObject var26) {
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic83$, (SubLObject)module0099.$ic160$, (SubLObject)module0099.THREE_INTEGER);
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic157$, f7108(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic158$, f7109(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic159$, f7110(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic86$, (SubLObject)module0099.$ic160$, (SubLObject)module0099.THREE_INTEGER);
        return var25;
    }
    
    public static SubLObject f7116(final SubLObject var25, final SubLObject var26) {
        return f7115(var25, var26);
    }
    
    public static SubLObject f7097(final SubLObject var78) {
        assert module0099.NIL != f7065(var78) : var78;
        Errors.error((SubLObject)module0099.$ic162$, f7109(var78));
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7098(final SubLObject var78) {
        assert module0099.NIL != f7065(var78) : var78;
        Errors.warn((SubLObject)module0099.$ic163$, f7117(f7108(var78)), f7109(var78));
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7118(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7065(var57) && module0099.NIL == f7094(var57));
    }
    
    public static SubLObject f7094(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7065(var57) && f7108(var57).eql(module0099.$g1319$.getGlobalValue()));
    }
    
    public static SubLObject f7119(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7065(var57) && f7108(var57).eql(module0099.$g1317$.getGlobalValue()));
    }
    
    public static SubLObject f7120(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7065(var57) && f7108(var57).eql(module0099.$g1316$.getGlobalValue()));
    }
    
    public static SubLObject f7121(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7065(var57) && f7108(var57).eql(module0099.$g1322$.getGlobalValue()));
    }
    
    public static SubLObject f7122(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7065(var57) && f7108(var57).eql(module0099.$g1323$.getGlobalValue()));
    }
    
    public static SubLObject f7123(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7065(var57) && f7108(var57).eql(module0099.$g1318$.getGlobalValue()));
    }
    
    public static SubLObject f7061(final SubLObject var87, final SubLObject var82, SubLObject var80) {
        if (var80 == module0099.UNPROVIDED) {
            var80 = (SubLObject)module0099.NIL;
        }
        final SubLObject var88 = f7114((SubLObject)module0099.UNPROVIDED);
        f7111(var88, var87);
        f7112(var88, var82);
        f7113(var88, var80);
        return var88;
    }
    
    public static SubLObject f7107(final SubLObject var78, final SubLObject var7, final SubLObject var28) {
        streams_high.write_string((SubLObject)module0099.$ic164$, var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        streams_high.write_string(f7117(f7108(var78)), var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        streams_high.write_string((SubLObject)module0099.$ic165$, var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        streams_high.write_string(f7109(var78), var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        streams_high.write_string((SubLObject)module0099.$ic166$, var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        return var78;
    }
    
    public static SubLObject f7117(final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        return conses_high.assoc(var80, module0099.$g1328$.getDynamicValue(var81), (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED).rest();
    }
    
    public static SubLObject f7124(final SubLObject var16, final SubLObject var7) {
        f7125(var16, var7, (SubLObject)module0099.ZERO_INTEGER);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7126(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX8843_native.class) ? module0099.T : module0099.NIL);
    }
    
    public static SubLObject f7127(final SubLObject var16) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f7128(final SubLObject var16) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f7129(final SubLObject var16) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f7130(final SubLObject var16) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.getField5();
    }
    
    public static SubLObject f7131(final SubLObject var16) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.getField6();
    }
    
    public static SubLObject f7132(final SubLObject var16) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.getField7();
    }
    
    public static SubLObject f7133(final SubLObject var16) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.getField8();
    }
    
    public static SubLObject f7134(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.setField2(var18);
    }
    
    public static SubLObject f7135(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.setField3(var18);
    }
    
    public static SubLObject f7136(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.setField4(var18);
    }
    
    public static SubLObject f7137(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.setField5(var18);
    }
    
    public static SubLObject f7138(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.setField6(var18);
    }
    
    public static SubLObject f7139(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.setField7(var18);
    }
    
    public static SubLObject f7140(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7126(var16) : var16;
        return var16.setField8(var18);
    }
    
    public static SubLObject f7141(SubLObject var19) {
        if (var19 == module0099.UNPROVIDED) {
            var19 = (SubLObject)module0099.NIL;
        }
        final SubLObject var20 = (SubLObject)new $sX8843_native();
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var21 = (SubLObject)module0099.NIL, var21 = var19; module0099.NIL != var21; var21 = conses_high.cddr(var21)) {
            var22 = var21.first();
            var23 = conses_high.cadr(var21);
            var24 = var22;
            if (var24.eql((SubLObject)module0099.$ic197$)) {
                f7134(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic198$)) {
                f7135(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic199$)) {
                f7136(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic200$)) {
                f7137(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic201$)) {
                f7138(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic202$)) {
                f7139(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic203$)) {
                f7140(var20, var23);
            }
            else {
                Errors.error((SubLObject)module0099.$ic82$, var22);
            }
        }
        return var20;
    }
    
    public static SubLObject f7142(final SubLObject var25, final SubLObject var26) {
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic83$, (SubLObject)module0099.$ic204$, (SubLObject)module0099.SEVEN_INTEGER);
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic197$, f7127(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic198$, f7128(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic199$, f7129(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic200$, f7130(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic201$, f7131(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic202$, f7132(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic203$, f7133(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic86$, (SubLObject)module0099.$ic204$, (SubLObject)module0099.SEVEN_INTEGER);
        return var25;
    }
    
    public static SubLObject f7143(final SubLObject var25, final SubLObject var26) {
        return f7142(var25, var26);
    }
    
    public static SubLObject f7125(final SubLObject var91, final SubLObject var7, final SubLObject var28) {
        final SubLThread var92 = SubLProcess.currentSubLThread();
        if (module0099.NIL != print_high.$print_readably$.getDynamicValue(var92)) {
            print_high.print_not_readable(var91, var7);
        }
        else {
            streams_high.write_string((SubLObject)module0099.$ic206$, var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var91), new SubLObject[] { module0099.$ic207$, var7 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var7);
            if (module0099.NIL != f7144(var91)) {
                final SubLObject var93 = f7145(var91);
                final SubLObject var94 = f7146(var91);
                streams_high.write_string((SubLObject)module0099.$ic208$, var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
                print_high.princ(var93, var7);
                streams_high.write_string((SubLObject)(var93.numE((SubLObject)module0099.ONE_INTEGER) ? module0099.$ic209$ : module0099.$ic210$), var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
                print_high.princ(var94, var7);
                streams_high.write_string((SubLObject)(var94.numE((SubLObject)module0099.ONE_INTEGER) ? module0099.$ic211$ : module0099.$ic212$), var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            }
            else {
                streams_high.write_string((SubLObject)module0099.$ic213$, var7, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var7);
            PrintLow.write(Equality.pointer(var91), new SubLObject[] { module0099.$ic207$, var7, module0099.$ic214$, module0099.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var7);
        }
        return var91;
    }
    
    public static SubLObject f7147(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7126(var57) && module0099.NIL != f7144(var57));
    }
    
    public static SubLObject f7148(final SubLObject var91) {
        assert module0099.NIL != f7126(var91) : var91;
        if (module0099.NIL != f7144(var91)) {
            final SubLObject var92 = f7063(f7131(var91), module0099.$g1291$.getGlobalValue(), (SubLObject)ConsesLow.list(f7133(var91)));
            f7149(var91);
            return (module0099.NIL != f7065(var92)) ? var92 : var91;
        }
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7150(final SubLObject var91) {
        return Equality.eql((SubLObject)module0099.ZERO_INTEGER, f7145(var91));
    }
    
    public static SubLObject f7151(final SubLObject var91, final SubLObject var98) {
        assert module0099.NIL != f7147(var91) : var91;
        assert module0099.NIL != Types.integerp(var98) : var98;
        if (module0099.NIL != module0004.f108(var98)) {
            f7135(var91, Numbers.max(Numbers.add(f7129(var91), (SubLObject)module0099.ONE_INTEGER, var98), (SubLObject)module0099.ZERO_INTEGER));
        }
        else {
            f7135(var91, Numbers.min(var98, module0048.f_1X(f7129(var91))));
        }
        return f7152(var91);
    }
    
    public static SubLObject f7153(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        if (f7128(var91).numLE(f7129(var91))) {
            f7135(var91, Numbers.add(f7128(var91), (SubLObject)module0099.ONE_INTEGER));
        }
        return Numbers.numLE(f7128(var91), f7129(var91));
    }
    
    public static SubLObject f7154(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        if (f7128(var91).numG((SubLObject)module0099.ZERO_INTEGER)) {
            f7135(var91, Numbers.subtract(f7128(var91), (SubLObject)module0099.ONE_INTEGER));
        }
        return Numbers.numG(f7128(var91), (SubLObject)module0099.ZERO_INTEGER);
    }
    
    public static SubLObject f7155(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        return Equality.eql(f7128(var91), f7129(var91));
    }
    
    public static SubLObject f7156(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        return Equality.eql(f7128(var91), (SubLObject)module0099.ONE_INTEGER);
    }
    
    public static SubLObject f7146(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        return (SubLObject)(f7145(var91).numG((SubLObject)module0099.ZERO_INTEGER) ? Sequences.length(Vectors.aref(f7127(var91), (SubLObject)module0099.ZERO_INTEGER)) : module0099.ZERO_INTEGER);
    }
    
    public static SubLObject f7145(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        return f7129(var91);
    }
    
    public static SubLObject f7157(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        return f7128(var91);
    }
    
    public static SubLObject f7158(final SubLObject var91, final SubLObject var98) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        assert module0099.NIL != f7147(var91) : var91;
        assert module0099.NIL != module0004.f105(var98) : var98;
        if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var99) && module0099.NIL == f7152(var91)) {
            Errors.error((SubLObject)module0099.$ic216$);
        }
        if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var99) && module0099.NIL == f7159(var91, var98)) {
            Errors.error((SubLObject)module0099.$ic217$, var98);
        }
        if (module0099.NIL == f7160(var91)) {
            final SubLObject var100 = f7161(var91, f7128(var91));
            final SubLObject var101 = var100.first();
            final SubLObject var102 = var100.rest();
            final SubLObject var103 = f7063(f7131(var91), module0099.$g1290$.getGlobalValue(), (SubLObject)ConsesLow.list(f7133(var91), var101, var102));
            if (module0099.NIL != f7065(var103)) {
                return var103;
            }
            f7134(var91, f7127(var103));
            f7137(var91, var101);
        }
        return Vectors.aref(Vectors.aref(f7127(var91), Numbers.subtract(f7128(var91), f7130(var91))), module0048.f_1_(var98));
    }
    
    public static SubLObject f7162(final SubLObject var91) {
        assert module0099.NIL != f7147(var91) : var91;
        final SubLObject var92 = f7146(var91);
        final SubLObject var93 = (SubLObject)ConsesLow.make_list(var92, (SubLObject)module0099.UNPROVIDED);
        SubLObject var94;
        for (var94 = (SubLObject)module0099.NIL, var94 = (SubLObject)module0099.ZERO_INTEGER; var94.numL(var92); var94 = Numbers.add(var94, (SubLObject)module0099.ONE_INTEGER)) {
            ConsesLow.set_nth(var94, var93, f7158(var91, module0048.f_1X(var94)));
        }
        return var93;
    }
    
    public static SubLObject f7163(final SubLObject var105, final SubLObject var106, final SubLObject var95) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        assert module0099.NIL != module0004.f106(var105) : var105;
        assert module0099.NIL != Types.vectorp(var106) : var106;
        assert module0099.NIL != module0004.f106(var95) : var95;
        final SubLObject var108 = f7141((SubLObject)module0099.UNPROVIDED);
        f7137(var108, var105);
        f7134(var108, var106);
        f7135(var108, (SubLObject)module0099.ZERO_INTEGER);
        f7136(var108, var95);
        f7138(var108, (SubLObject)module0099.T);
        f7139(var108, module0099.$g1273$.getDynamicValue(var107));
        return var108;
    }
    
    public static SubLObject f7164(final SubLObject var91) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL == f7144(var91));
    }
    
    public static SubLObject f7144(final SubLObject var91) {
        return module0035.sublisp_boolean(f7131(var91));
    }
    
    public static SubLObject f7152(final SubLObject var91) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f7128(var91).numG((SubLObject)module0099.ZERO_INTEGER) && f7128(var91).numLE(f7129(var91)));
    }
    
    public static SubLObject f7159(final SubLObject var91, final SubLObject var98) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var98.numG((SubLObject)module0099.ZERO_INTEGER) && var98.numLE(f7146(var91)));
    }
    
    public static SubLObject f7161(final SubLObject var91, final SubLObject var107) {
        final SubLThread var108 = SubLProcess.currentSubLThread();
        if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var108) && (!var107.numG((SubLObject)module0099.ZERO_INTEGER) || !var107.numLE(f7129(var91)))) {
            Errors.error((SubLObject)module0099.$ic220$, var107);
        }
        final SubLObject var109 = module0048.f_1X(Numbers.multiply(Numbers.floor(module0048.f_1_(var107), f7132(var91)), module0099.$g1273$.getDynamicValue(var108)));
        final SubLObject var110 = Numbers.min(f7129(var91), Numbers.add(var109, f7132(var91), (SubLObject)module0099.MINUS_ONE_INTEGER));
        return (SubLObject)ConsesLow.cons(var109, var110);
    }
    
    public static SubLObject f7160(final SubLObject var91) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f7128(var91).numGE(f7130(var91)) && f7128(var91).numL(Numbers.add(f7130(var91), f7132(var91))));
    }
    
    public static SubLObject f7165(final SubLObject var91) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL == f7160(var91));
    }
    
    public static SubLObject f7149(final SubLObject var91) {
        f7134(var91, (SubLObject)module0099.NIL);
        f7138(var91, (SubLObject)module0099.NIL);
        return var91;
    }
    
    public static SubLObject f7166(final SubLObject var16, final SubLObject var7) {
        compatibility.default_struct_print_function(var16, var7, (SubLObject)module0099.ZERO_INTEGER);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7071(final SubLObject var16) {
        return (SubLObject)((var16.getClass() == $sX8844_native.class) ? module0099.T : module0099.NIL);
    }
    
    public static SubLObject f7167(final SubLObject var16) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.getField2();
    }
    
    public static SubLObject f7168(final SubLObject var16) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.getField3();
    }
    
    public static SubLObject f7169(final SubLObject var16) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.getField4();
    }
    
    public static SubLObject f7170(final SubLObject var16) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.getField5();
    }
    
    public static SubLObject f7171(final SubLObject var16) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.getField6();
    }
    
    public static SubLObject f7172(final SubLObject var16) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.getField7();
    }
    
    public static SubLObject f7173(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.setField2(var18);
    }
    
    public static SubLObject f7174(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.setField3(var18);
    }
    
    public static SubLObject f7175(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.setField4(var18);
    }
    
    public static SubLObject f7176(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.setField5(var18);
    }
    
    public static SubLObject f7177(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.setField6(var18);
    }
    
    public static SubLObject f7178(final SubLObject var16, final SubLObject var18) {
        assert module0099.NIL != f7071(var16) : var16;
        return var16.setField7(var18);
    }
    
    public static SubLObject f7179(SubLObject var19) {
        if (var19 == module0099.UNPROVIDED) {
            var19 = (SubLObject)module0099.NIL;
        }
        final SubLObject var20 = (SubLObject)new $sX8844_native();
        SubLObject var21;
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var21 = (SubLObject)module0099.NIL, var21 = var19; module0099.NIL != var21; var21 = conses_high.cddr(var21)) {
            var22 = var21.first();
            var23 = conses_high.cadr(var21);
            var24 = var22;
            if (var24.eql((SubLObject)module0099.$ic201$)) {
                f7173(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic203$)) {
                f7174(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic241$)) {
                f7175(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic242$)) {
                f7176(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic243$)) {
                f7177(var20, var23);
            }
            else if (var24.eql((SubLObject)module0099.$ic244$)) {
                f7178(var20, var23);
            }
            else {
                Errors.error((SubLObject)module0099.$ic82$, var22);
            }
        }
        return var20;
    }
    
    public static SubLObject f7180(final SubLObject var25, final SubLObject var26) {
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic83$, (SubLObject)module0099.$ic245$, (SubLObject)module0099.SIX_INTEGER);
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic201$, f7167(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic203$, f7168(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic241$, f7169(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic242$, f7170(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic243$, f7171(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic85$, (SubLObject)module0099.$ic244$, f7172(var25));
        Functions.funcall(var26, var25, (SubLObject)module0099.$ic86$, (SubLObject)module0099.$ic245$, (SubLObject)module0099.SIX_INTEGER);
        return var25;
    }
    
    public static SubLObject f7181(final SubLObject var25, final SubLObject var26) {
        return f7180(var25, var26);
    }
    
    public static SubLObject f7182(final SubLObject var61) {
        assert module0099.NIL != f7071(var61) : var61;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7167(var61) && module0099.NIL != f7058(f7167(var61)));
    }
    
    public static SubLObject f7183(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7071(var57) && module0099.NIL != f7029(f7167(var57)) && module0099.NIL != f7058(f7167(var57)));
    }
    
    public static SubLObject f7184(final SubLObject var61, final SubLObject var62, SubLObject var111) {
        if (var111 == module0099.UNPROVIDED) {
            var111 = module0099.$g1273$.getDynamicValue();
        }
        assert module0099.NIL != f7183(var61) : var61;
        assert module0099.NIL != Types.stringp(var62) : var62;
        assert module0099.NIL != module0004.f105(var111) : var111;
        final SubLObject var112 = f7063(f7167(var61), module0099.$g1276$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61), var62, var111));
        if (module0099.NIL != f7126(var112)) {
            f7138(var112, f7167(var61));
            f7140(var112, f7168(var61));
            f7139(var112, var111);
            if (module0099.NIL != f7172(var61)) {
                f7149(f7172(var61));
            }
            f7178(var61, var112);
        }
        return var112;
    }
    
    public static SubLObject f7185(final SubLObject var61, final SubLObject var62) {
        assert module0099.NIL != f7183(var61) : var61;
        assert module0099.NIL != Types.stringp(var62) : var62;
        return f7063(f7167(var61), module0099.$g1275$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61), var62));
    }
    
    public static SubLObject f7186(final SubLObject var61) {
        assert module0099.NIL != f7183(var61) : var61;
        return f7063(f7167(var61), module0099.$g1306$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61)));
    }
    
    public static SubLObject f7187(final SubLObject var61, SubLObject var111) {
        if (var111 == module0099.UNPROVIDED) {
            var111 = module0099.$g1273$.getDynamicValue();
        }
        assert module0099.NIL != f7183(var61) : var61;
        assert module0099.NIL != module0004.f105(var111) : var111;
        final SubLObject var112 = f7063(f7167(var61), module0099.$g1293$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61), var111));
        if (module0099.NIL != f7126(var112)) {
            f7138(var112, f7167(var61));
            f7140(var112, f7168(var61));
            f7139(var112, var111);
            if (module0099.NIL != f7172(var61)) {
                f7149(f7172(var61));
            }
            f7178(var61, var112);
        }
        return var112;
    }
    
    public static SubLObject f7188(final SubLObject var61) {
        assert module0099.NIL != f7071(var61) : var61;
        SubLObject var62 = (SubLObject)module0099.NIL;
        if (module0099.NIL != f7182(var61)) {
            var62 = f7063(f7167(var61), module0099.$g1283$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61)));
        }
        f7068(var61);
        return (module0099.NIL != f7065(var62)) ? var62 : var61;
    }
    
    public static SubLObject f7189(final SubLObject var61, final SubLObject var62) {
        assert module0099.NIL != f7183(var61) : var61;
        assert module0099.NIL != Types.stringp(var62) : var62;
        f7177(var61, (SubLObject)ConsesLow.cons(var62, f7171(var61)));
        return var62;
    }
    
    public static SubLObject f7190(final SubLObject var61) {
        assert module0099.NIL != f7183(var61) : var61;
        final SubLObject var62 = Sequences.length(f7171(var61));
        f7177(var61, (SubLObject)module0099.NIL);
        return var62;
    }
    
    public static SubLObject f7191(final SubLObject var61) {
        assert module0099.NIL != f7183(var61) : var61;
        final SubLObject var62 = f7171(var61);
        f7190(var61);
        return (SubLObject)((module0099.NIL != var62) ? f7063(f7167(var61), module0099.$g1289$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61), Sequences.nreverse(var62))) : module0099.NIL);
    }
    
    public static SubLObject f7192(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7071(var57) && module0099.NIL != f7169(var57));
    }
    
    public static SubLObject f7193(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7183(var57) && module0099.NIL != f7169(var57));
    }
    
    public static SubLObject f7194(final SubLObject var61, SubLObject var111) {
        if (var111 == module0099.UNPROVIDED) {
            var111 = module0099.$g1273$.getDynamicValue();
        }
        assert module0099.NIL != f7193(var61) : var61;
        assert module0099.NIL != module0004.f105(var111) : var111;
        if (module0099.NIL != f7172(var61)) {
            f7148(f7172(var61));
        }
        final SubLObject var112 = f7170(var61);
        final SubLObject var113 = f7063(f7167(var61), module0099.$g1281$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61), Sequences.nreverse(var112), var111));
        f7176(var61, (SubLObject)module0099.NIL);
        f7138(var113, f7167(var61));
        f7140(var113, f7168(var61));
        f7139(var113, var111);
        if (module0099.NIL != f7172(var61)) {
            f7149(f7172(var61));
        }
        f7178(var61, var113);
        return var113;
    }
    
    public static SubLObject f7195(final SubLObject var61) {
        assert module0099.NIL != f7193(var61) : var61;
        final SubLObject var62 = f7170(var61);
        f7176(var61, (SubLObject)module0099.NIL);
        return f7063(f7167(var61), module0099.$g1280$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var61), Sequences.nreverse(var62)));
    }
    
    public static SubLObject f7196(final SubLObject var61, final SubLObject var115, final SubLObject var116) {
        assert module0099.NIL != f7193(var61) : var61;
        assert module0099.NIL != module0004.f106(var115) : var115;
        assert module0099.NIL != module0037.f2581(var116) : var116;
        return f7197(var61, module0099.$g1279$.getGlobalValue(), var115, var116);
    }
    
    public static SubLObject f7198(final SubLObject var61, final SubLObject var115, final SubLObject var117) {
        assert module0099.NIL != f7193(var61) : var61;
        assert module0099.NIL != module0004.f106(var115) : var115;
        assert module0099.NIL != f7199(var117) : var117;
        return f7197(var61, module0099.$g1282$.getGlobalValue(), var115, var117);
    }
    
    public static SubLObject f7200(final SubLObject var61, final SubLObject var115, final SubLObject var118) {
        assert module0099.NIL != f7193(var61) : var61;
        assert module0099.NIL != module0004.f106(var115) : var115;
        assert module0099.NIL != f7201(var118) : var118;
        return f7197(var61, module0099.$g1286$.getGlobalValue(), var115, var118);
    }
    
    public static SubLObject f7202(final SubLObject var61, final SubLObject var115, final SubLObject var119) {
        assert module0099.NIL != f7193(var61) : var61;
        assert module0099.NIL != module0004.f106(var115) : var115;
        assert module0099.NIL != f7203(var119) : var119;
        return f7197(var61, module0099.$g1288$.getGlobalValue(), var115, var119);
    }
    
    public static SubLObject f7204(final SubLObject var61, final SubLObject var115, final SubLObject var120) {
        assert module0099.NIL != f7193(var61) : var61;
        assert module0099.NIL != module0004.f106(var115) : var115;
        assert module0099.NIL != f7205(var120) : var120;
        return f7197(var61, module0099.$g1287$.getGlobalValue(), var115, var120);
    }
    
    public static SubLObject f7206(final SubLObject var61, final SubLObject var115, final SubLObject var29) {
        assert module0099.NIL != f7193(var61) : var61;
        assert module0099.NIL != module0004.f106(var115) : var115;
        assert module0099.NIL != Types.stringp(var29) : var29;
        return f7197(var61, module0099.$g1285$.getGlobalValue(), var115, var29);
    }
    
    public static SubLObject f7070(final SubLObject var27) {
        SubLObject var28 = f7179((SubLObject)module0099.UNPROVIDED);
        SubLObject var29 = (SubLObject)module0099.NIL;
        f7173(var28, var27);
        f7174(var28, f7207());
        var29 = f7063(var27, module0099.$g1278$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var28)));
        if (module0099.NIL != f7065(var29)) {
            var28 = var29;
        }
        return var28;
    }
    
    public static SubLObject f7208(final SubLObject var61) {
        assert module0099.NIL != f7071(var61) : var61;
        return f7167(var61);
    }
    
    public static SubLObject f7068(final SubLObject var61) {
        if (module0099.NIL != f7172(var61)) {
            f7149(f7172(var61));
            f7178(var61, (SubLObject)module0099.NIL);
        }
        if (module0099.NIL != f7167(var61)) {
            f7047(f7167(var61), Sequences.remove(var61, f7035(f7167(var61)), (SubLObject)module0099.EQ, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED));
            f7173(var61, (SubLObject)module0099.NIL);
        }
        return var61;
    }
    
    public static SubLObject f7197(final SubLObject var61, final SubLObject var121, final SubLObject var115, final SubLObject var122) {
        final SubLObject var123 = (SubLObject)ConsesLow.list(var121, var115, var122);
        f7176(var61, (SubLObject)ConsesLow.cons(var123, f7170(var61)));
        return var123;
    }
    
    public static SubLObject f7073(final SubLObject var27, final SubLObject var62) {
        SubLObject var63 = f7179((SubLObject)module0099.UNPROVIDED);
        SubLObject var64 = (SubLObject)module0099.NIL;
        f7173(var63, var27);
        f7174(var63, f7207());
        f7175(var63, var62);
        var64 = f7063(f7167(var63), module0099.$g1277$.getGlobalValue(), (SubLObject)ConsesLow.list(f7168(var63), var62));
        if (module0099.NIL != f7065(var64)) {
            var63 = var64;
        }
        return var63;
    }
    
    public static SubLObject f7207() {
        return print_high.princ_to_string(Symbols.gensym((SubLObject)module0099.$ic255$));
    }
    
    public static SubLObject f7209() {
        return print_high.princ_to_string(Symbols.gensym((SubLObject)module0099.$ic256$));
    }
    
    public static SubLObject f7210(final SubLObject var27, final SubLObject var124, final SubLObject var125, final SubLObject var126, final SubLObject var127) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        assert module0099.NIL != f7067(var27) : var27;
        assert module0099.NIL != Types.stringp(var124) : var124;
        assert module0099.NIL != Types.stringp(var125) : var125;
        assert module0099.NIL != Types.stringp(var126) : var126;
        assert module0099.NIL != Types.listp(var127) : var127;
        final SubLObject var129 = f7063(var27, module0099.$g1300$.getGlobalValue(), (SubLObject)ConsesLow.list(var124, var125, var126, var127, module0099.$g1273$.getDynamicValue(var128)));
        if (module0099.NIL != f7126(var129)) {
            f7138(var129, var27);
            f7140(var129, module0099.$g1272$.getGlobalValue());
        }
        return var129;
    }
    
    public static SubLObject f7211(final SubLObject var27, final SubLObject var124, final SubLObject var125, final SubLObject var126, final SubLObject var127) {
        final SubLObject var128 = Functions.apply((SubLObject)module0099.$ic258$, (SubLObject)ConsesLow.list(var27, var124, var125, var126, var127));
        if (module0099.NIL == f7126(var128)) {
            Errors.warn((SubLObject)module0099.$ic259$, var128);
            return (SubLObject)module0099.NIL;
        }
        final SubLObject var129 = f7146(var128);
        SubLObject var130 = (SubLObject)module0099.NIL;
        while (module0099.NIL == f7155(var128)) {
            f7153(var128);
            SubLObject var131 = (SubLObject)module0099.ZERO_INTEGER;
            SubLObject var132 = (SubLObject)module0099.NIL;
            SubLObject var133 = (SubLObject)module0099.$ic260$;
            SubLObject var134 = (SubLObject)module0099.NIL;
            var134 = var133.first();
            while (module0099.NIL != var133) {
                var131 = Numbers.add(var131, (SubLObject)module0099.ONE_INTEGER);
                if (var131.numLE(var129)) {
                    var132 = (SubLObject)ConsesLow.cons(var134, var132);
                    var132 = (SubLObject)ConsesLow.cons(f7158(var128, var131), var132);
                }
                var133 = var133.rest();
                var134 = var133.first();
            }
            var130 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var132), var130);
        }
        return Sequences.nreverse(var130);
    }
    
    public static SubLObject f7212(final SubLObject var27, final SubLObject var124, final SubLObject var125, final SubLObject var126, final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        assert module0099.NIL != f7067(var27) : var27;
        assert module0099.NIL != Types.stringp(var124) : var124;
        assert module0099.NIL != Types.stringp(var125) : var125;
        assert module0099.NIL != Types.stringp(var126) : var126;
        assert module0099.NIL != Types.stringp(var134) : var134;
        final SubLObject var136 = f7063(var27, module0099.$g1301$.getGlobalValue(), (SubLObject)ConsesLow.list(var124, var125, var126, var134, module0099.$g1273$.getDynamicValue(var135)));
        if (module0099.NIL != f7126(var136)) {
            f7138(var136, var27);
            f7140(var136, module0099.$g1272$.getGlobalValue());
        }
        return var136;
    }
    
    public static SubLObject f7213(final SubLObject var27, final SubLObject var124, final SubLObject var125, final SubLObject var126, final SubLObject var134) {
        final SubLObject var135 = Functions.apply((SubLObject)module0099.$ic261$, (SubLObject)ConsesLow.list(var27, var124, var125, var126, var134));
        if (module0099.NIL == f7126(var135)) {
            Errors.warn((SubLObject)module0099.$ic259$, var135);
            return (SubLObject)module0099.NIL;
        }
        final SubLObject var136 = f7146(var135);
        SubLObject var137 = (SubLObject)module0099.NIL;
        while (module0099.NIL == f7155(var135)) {
            f7153(var135);
            SubLObject var138 = (SubLObject)module0099.ZERO_INTEGER;
            SubLObject var139 = (SubLObject)module0099.NIL;
            SubLObject var140 = (SubLObject)module0099.$ic262$;
            SubLObject var141 = (SubLObject)module0099.NIL;
            var141 = var140.first();
            while (module0099.NIL != var140) {
                var138 = Numbers.add(var138, (SubLObject)module0099.ONE_INTEGER);
                if (var138.numLE(var136)) {
                    var139 = (SubLObject)ConsesLow.cons(var141, var139);
                    var139 = (SubLObject)ConsesLow.cons(f7158(var135, var138), var139);
                }
                var140 = var140.rest();
                var141 = var140.first();
            }
            var137 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var139), var137);
        }
        return Sequences.nreverse(var137);
    }
    
    public static SubLObject f7214(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        assert module0099.NIL != Types.stringp(var124) : var124;
        assert module0099.NIL != Types.stringp(var135) : var135;
        assert module0099.NIL != Types.stringp(var136) : var136;
        final SubLObject var138 = f7063(var27, module0099.$g1302$.getGlobalValue(), (SubLObject)ConsesLow.list(var124, var135, var136, module0099.$g1273$.getDynamicValue(var137)));
        if (module0099.NIL != f7126(var138)) {
            f7138(var138, var27);
            f7140(var138, module0099.$g1272$.getGlobalValue());
        }
        return var138;
    }
    
    public static SubLObject f7215(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136) {
        final SubLObject var137 = Functions.apply((SubLObject)module0099.$ic263$, (SubLObject)ConsesLow.list(var27, var124, var135, var136));
        if (module0099.NIL == f7126(var137)) {
            Errors.warn((SubLObject)module0099.$ic259$, var137);
            return (SubLObject)module0099.NIL;
        }
        final SubLObject var138 = f7146(var137);
        SubLObject var139 = (SubLObject)module0099.NIL;
        while (module0099.NIL == f7155(var137)) {
            f7153(var137);
            SubLObject var140 = (SubLObject)module0099.ZERO_INTEGER;
            SubLObject var141 = (SubLObject)module0099.NIL;
            SubLObject var142 = (SubLObject)module0099.$ic264$;
            SubLObject var143 = (SubLObject)module0099.NIL;
            var143 = var142.first();
            while (module0099.NIL != var142) {
                var140 = Numbers.add(var140, (SubLObject)module0099.ONE_INTEGER);
                if (var140.numLE(var138)) {
                    var141 = (SubLObject)ConsesLow.cons(var143, var141);
                    var141 = (SubLObject)ConsesLow.cons(f7158(var137, var140), var141);
                }
                var142 = var142.rest();
                var143 = var142.first();
            }
            var139 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var141), var139);
        }
        return Sequences.nreverse(var139);
    }
    
    public static SubLObject f7216(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        assert module0099.NIL != Types.stringp(var124) : var124;
        assert module0099.NIL != Types.stringp(var135) : var135;
        assert module0099.NIL != Types.stringp(var136) : var136;
        final SubLObject var138 = f7063(var27, module0099.$g1303$.getGlobalValue(), (SubLObject)ConsesLow.list(var124, var135, var136, module0099.$g1273$.getDynamicValue(var137)));
        if (module0099.NIL != f7126(var138)) {
            f7138(var138, var27);
            f7140(var138, module0099.$g1272$.getGlobalValue());
        }
        return var138;
    }
    
    public static SubLObject f7217(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136) {
        final SubLObject var137 = Functions.apply((SubLObject)module0099.$ic265$, (SubLObject)ConsesLow.list(var27, var124, var135, var136));
        if (module0099.NIL == f7126(var137)) {
            Errors.warn((SubLObject)module0099.$ic259$, var137);
            return (SubLObject)module0099.NIL;
        }
        final SubLObject var138 = f7146(var137);
        SubLObject var139 = (SubLObject)module0099.NIL;
        while (module0099.NIL == f7155(var137)) {
            f7153(var137);
            SubLObject var140 = (SubLObject)module0099.ZERO_INTEGER;
            SubLObject var141 = (SubLObject)module0099.NIL;
            SubLObject var142 = (SubLObject)module0099.$ic266$;
            SubLObject var143 = (SubLObject)module0099.NIL;
            var143 = var142.first();
            while (module0099.NIL != var142) {
                var140 = Numbers.add(var140, (SubLObject)module0099.ONE_INTEGER);
                if (var140.numLE(var138)) {
                    var141 = (SubLObject)ConsesLow.cons(var143, var141);
                    var141 = (SubLObject)ConsesLow.cons(f7158(var137, var140), var141);
                }
                var142 = var142.rest();
                var143 = var142.first();
            }
            var139 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var141), var139);
        }
        return Sequences.nreverse(var139);
    }
    
    public static SubLObject f7218(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136) {
        final SubLThread var137 = SubLProcess.currentSubLThread();
        assert module0099.NIL != f7067(var27) : var27;
        assert module0099.NIL != Types.stringp(var124) : var124;
        assert module0099.NIL != Types.stringp(var135) : var135;
        assert module0099.NIL != Types.stringp(var136) : var136;
        final SubLObject var138 = f7063(var27, module0099.$g1304$.getGlobalValue(), (SubLObject)ConsesLow.list(var124, var135, var136, module0099.$g1273$.getDynamicValue(var137)));
        if (module0099.NIL != f7126(var138)) {
            f7138(var138, var27);
            f7140(var138, module0099.$g1272$.getGlobalValue());
        }
        return var138;
    }
    
    public static SubLObject f7219(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136) {
        final SubLObject var137 = Functions.apply((SubLObject)module0099.$ic267$, (SubLObject)ConsesLow.list(var27, var124, var135, var136));
        if (module0099.NIL == f7126(var137)) {
            Errors.warn((SubLObject)module0099.$ic259$, var137);
            return (SubLObject)module0099.NIL;
        }
        final SubLObject var138 = f7146(var137);
        SubLObject var139 = (SubLObject)module0099.NIL;
        while (module0099.NIL == f7155(var137)) {
            f7153(var137);
            SubLObject var140 = (SubLObject)module0099.ZERO_INTEGER;
            SubLObject var141 = (SubLObject)module0099.NIL;
            SubLObject var142 = (SubLObject)module0099.$ic266$;
            SubLObject var143 = (SubLObject)module0099.NIL;
            var143 = var142.first();
            while (module0099.NIL != var142) {
                var140 = Numbers.add(var140, (SubLObject)module0099.ONE_INTEGER);
                if (var140.numLE(var138)) {
                    var141 = (SubLObject)ConsesLow.cons(var143, var141);
                    var141 = (SubLObject)ConsesLow.cons(f7158(var137, var140), var141);
                }
                var142 = var142.rest();
                var143 = var142.first();
            }
            var139 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var141), var139);
        }
        return Sequences.nreverse(var139);
    }
    
    public static SubLObject f7220(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136, final SubLObject var137, final SubLObject var138) {
        final SubLThread var139 = SubLProcess.currentSubLThread();
        assert module0099.NIL != f7067(var27) : var27;
        assert module0099.NIL != Types.stringp(var124) : var124;
        assert module0099.NIL != Types.stringp(var135) : var135;
        assert module0099.NIL != Types.stringp(var136) : var136;
        assert module0099.NIL != Types.booleanp(var137) : var137;
        assert module0099.NIL != Types.booleanp(var138) : var138;
        final SubLObject var140 = f7063(var27, module0099.$g1305$.getGlobalValue(), (SubLObject)ConsesLow.list(var124, var135, var136, var137, var138, module0099.$g1273$.getDynamicValue(var139)));
        if (module0099.NIL != f7126(var140)) {
            f7138(var140, var27);
            f7140(var140, module0099.$g1272$.getGlobalValue());
        }
        return var140;
    }
    
    public static SubLObject f7221(final SubLObject var27, final SubLObject var124, final SubLObject var135, final SubLObject var136, final SubLObject var137, final SubLObject var138) {
        final SubLObject var139 = Functions.apply((SubLObject)module0099.$ic268$, (SubLObject)ConsesLow.list(var27, var124, var135, var136, var137, var138));
        if (module0099.NIL == f7126(var139)) {
            Errors.warn((SubLObject)module0099.$ic259$, var139);
            return (SubLObject)module0099.NIL;
        }
        final SubLObject var140 = f7146(var139);
        SubLObject var141 = (SubLObject)module0099.NIL;
        while (module0099.NIL == f7155(var139)) {
            f7153(var139);
            SubLObject var142 = (SubLObject)module0099.ZERO_INTEGER;
            SubLObject var143 = (SubLObject)module0099.NIL;
            SubLObject var144 = (SubLObject)module0099.$ic269$;
            SubLObject var145 = (SubLObject)module0099.NIL;
            var145 = var144.first();
            while (module0099.NIL != var144) {
                var142 = Numbers.add(var142, (SubLObject)module0099.ONE_INTEGER);
                if (var142.numLE(var140)) {
                    var143 = (SubLObject)ConsesLow.cons(var145, var143);
                    var143 = (SubLObject)ConsesLow.cons(f7158(var139, var142), var143);
                }
                var144 = var144.rest();
                var145 = var144.first();
            }
            var141 = (SubLObject)ConsesLow.cons(Sequences.nreverse(var143), var141);
        }
        return Sequences.nreverse(var141);
    }
    
    public static SubLObject f7222(final SubLObject var27) {
        assert module0099.NIL != f7067(var27) : var27;
        return f7063(var27, module0099.$g1307$.getGlobalValue(), (SubLObject)module0099.NIL);
    }
    
    public static SubLObject f7099(final SubLObject var57) {
        return conses_high.member(var57, (SubLObject)module0099.$ic270$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
    }
    
    public static SubLObject f7064(final SubLObject var42, final SubLObject var30, final SubLObject var31, final SubLObject var32, final SubLObject var46, SubLObject var2) {
        if (var2 == module0099.UNPROVIDED) {
            var2 = (SubLObject)module0099.NIL;
        }
        if (module0099.NIL != Strings.string_equal(module0038.f2629((SubLObject)module0099.EIGHT_INTEGER, var46), (SubLObject)module0099.$ic271$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
            return PrintLow.format((SubLObject)module0099.NIL, (SubLObject)module0099.$ic272$, new SubLObject[] { module0099.$g1269$.getGlobalValue(), var46, var30 });
        }
        SubLObject var47 = (SubLObject)ConsesLow.list(new SubLObject[] { module0099.$ic273$, var46, module0099.$ic72$, var42, module0099.$ic274$, var30, module0099.$ic71$, var31, module0099.$ic275$, var32 });
        if (module0099.NIL != module0004.f106(var2)) {
            var47 = conses_high.putf(var47, (SubLObject)module0099.$ic73$, var2);
        }
        return f7223(var46, var47);
    }
    
    public static SubLObject f7224(final SubLObject var139, final SubLObject var140, final SubLObject var141, final SubLObject var142, final SubLObject var143) {
        assert module0099.NIL != Types.stringp(var139) : var139;
        assert module0099.NIL != Types.consp(var140) : var140;
        assert module0099.NIL != module0035.f2327(var141) : var141;
        assert module0099.NIL != module0035.f2327(var142) : var142;
        assert module0099.NIL != module0035.f2327(var143) : var143;
        final SubLObject var144 = module0067.f4880((SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        module0079.f5412(var144, (SubLObject)module0099.$ic288$, var143);
        module0079.f5412(var144, (SubLObject)module0099.$ic289$, var140);
        module0079.f5412(var144, (SubLObject)module0099.$ic290$, f7225(var142));
        module0079.f5412(var144, (SubLObject)module0099.$ic291$, var141);
        module0079.f5412(module0099.$g1331$.getGlobalValue(), var139, var144);
        return var139;
    }
    
    public static SubLObject f7226() {
        return module0079.f5433(module0099.$g1331$.getGlobalValue());
    }
    
    public static SubLObject f7225(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        if (module0099.NIL == var142) {
            return (SubLObject)module0099.NIL;
        }
        SubLObject var144 = conses_high.copy_list(var142);
        if (module0099.$ic293$ == conses_high.getf(var144, (SubLObject)module0099.$ic294$, (SubLObject)module0099.$ic293$)) {
            var144 = conses_high.putf(var144, (SubLObject)module0099.$ic294$, (SubLObject)module0099.$ic169$);
        }
        if (module0099.$ic295$ == conses_high.getf(var144, (SubLObject)module0099.$ic200$, (SubLObject)module0099.$ic295$)) {
            final SubLObject var145 = conses_high.getf(var144, (SubLObject)module0099.$ic295$, (SubLObject)module0099.$ic293$);
            if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var143) && !var145.isString()) {
                Errors.error((SubLObject)module0099.$ic296$, var145);
            }
            var144 = conses_high.putf(var144, (SubLObject)module0099.$ic200$, var145);
        }
        final SubLObject var146 = conses_high.getf(var144, (SubLObject)module0099.$ic297$, (SubLObject)module0099.$ic293$);
        if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var143) && !var146.isString()) {
            Errors.error((SubLObject)module0099.$ic298$, var146);
        }
        return var144;
    }
    
    public static SubLObject f7227(final SubLObject var147, final SubLObject var148) {
        final SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        SubLObject var151 = (SubLObject)module0099.NIL;
        SubLObject var152 = var150;
        SubLObject var153 = (SubLObject)module0099.NIL;
        SubLObject var154_155 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var152) {
            cdestructuring_bind.destructuring_bind_must_consp(var152, var149, (SubLObject)module0099.$ic299$);
            var154_155 = var152.first();
            var152 = var152.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var152, var149, (SubLObject)module0099.$ic299$);
            if (module0099.NIL == conses_high.member(var154_155, (SubLObject)module0099.$ic300$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var153 = (SubLObject)module0099.T;
            }
            if (var154_155 == module0099.$ic96$) {
                var151 = var152.first();
            }
            var152 = var152.rest();
        }
        if (module0099.NIL != var153 && module0099.NIL == var151) {
            cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic299$);
        }
        final SubLObject var154 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic273$, var150);
        final SubLObject var155 = (SubLObject)((module0099.NIL != var154) ? conses_high.cadr(var154) : module0099.NIL);
        final SubLObject var156 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic289$, var150);
        final SubLObject var157 = (SubLObject)((module0099.NIL != var156) ? conses_high.cadr(var156) : module0099.NIL);
        final SubLObject var158 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic291$, var150);
        final SubLObject var159 = (SubLObject)((module0099.NIL != var158) ? conses_high.cadr(var158) : module0099.NIL);
        final SubLObject var160 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic290$, var150);
        final SubLObject var161 = (SubLObject)((module0099.NIL != var160) ? conses_high.cadr(var160) : module0099.NIL);
        final SubLObject var162 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic288$, var150);
        final SubLObject var163 = (SubLObject)((module0099.NIL != var162) ? conses_high.cadr(var162) : module0099.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic301$, var155, var157, var159, var161, var163);
    }
    
    public static SubLObject f7228(final SubLObject var2) {
        enforceType(var2, module0099.$ic218$);
        module0099.$g1332$.setGlobalValue(var2);
        return module0099.$g1332$.getGlobalValue();
    }
    
    public static SubLObject f7229() {
        return module0099.$g1332$.getGlobalValue();
    }
    
    public static SubLObject f7230(final SubLObject var2) {
        enforceType(var2, module0099.$ic218$);
        module0099.$g1333$.setGlobalValue(var2);
        return module0099.$g1333$.getGlobalValue();
    }
    
    public static SubLObject f7231() {
        return module0099.$g1333$.getGlobalValue();
    }
    
    public static SubLObject f7223(final SubLObject var139, SubLObject var33) {
        final SubLThread var140 = SubLProcess.currentSubLThread();
        assert module0099.NIL != module0035.f2327(var33) : var33;
        final SubLObject var141 = module0079.f5414(module0099.$g1331$.getGlobalValue(), var139, (SubLObject)module0099.$ic293$);
        SubLObject var142 = (SubLObject)module0099.NIL;
        if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var140) && module0099.NIL == module0079.f5404(var141)) {
            Errors.error((SubLObject)module0099.$ic345$, var139);
        }
        if (!var139.equal(conses_high.getf(var33, (SubLObject)module0099.$ic273$, (SubLObject)module0099.UNPROVIDED))) {
            var33 = (SubLObject)ConsesLow.cons((SubLObject)module0099.$ic273$, (SubLObject)ConsesLow.cons(var139, var33));
        }
        if (!conses_high.getf(var33, (SubLObject)module0099.$ic346$, (SubLObject)module0099.$ic347$).isString()) {
            var33 = (SubLObject)ConsesLow.cons((SubLObject)module0099.$ic346$, (SubLObject)ConsesLow.cons(module0099.$g1269$.getGlobalValue(), var33));
        }
        final SubLObject var143 = module0079.f5414(var141, (SubLObject)module0099.$ic289$, (SubLObject)module0099.UNPROVIDED);
        final SubLObject var144 = module0079.f5414(var141, (SubLObject)module0099.$ic288$, (SubLObject)module0099.UNPROVIDED);
        final SubLObject var145 = module0079.f5414(var141, (SubLObject)module0099.$ic291$, (SubLObject)module0099.UNPROVIDED);
        final SubLObject var146 = module0079.f5414(var141, (SubLObject)module0099.$ic290$, (SubLObject)module0099.UNPROVIDED);
        final SubLObject var147 = streams_high.make_string_output_stream();
        f7232(var147, var143, var33, var144);
        f7233(var147, var145, var146, var33, var144);
        var142 = streams_high.get_output_stream_string(var147);
        return var142;
    }
    
    public static SubLObject f7232(final SubLObject var161, final SubLObject var140, final SubLObject var33, final SubLObject var143) {
        SubLObject var162 = var140;
        SubLObject var163 = (SubLObject)module0099.NIL;
        var163 = var162.first();
        while (module0099.NIL != var162) {
            if (var163.isString()) {
                streams_high.write_string(var163, var161, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
            }
            else if (var163.isKeyword()) {
                print_high.princ(f7234(var163, var33, var143), var161);
            }
            else if (var163.isCons()) {
                SubLObject var165;
                final SubLObject var164 = var165 = var163;
                SubLObject var166 = (SubLObject)module0099.NIL;
                SubLObject var167 = (SubLObject)module0099.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var165, var164, (SubLObject)module0099.$ic348$);
                var166 = var165.first();
                var165 = var165.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var165, var164, (SubLObject)module0099.$ic348$);
                var167 = var165.first();
                var165 = var165.rest();
                if (module0099.NIL == var165) {
                    final SubLObject var168 = f7234(var167, var33, var143);
                    SubLObject var169 = (SubLObject)module0099.NIL;
                    final SubLObject var170 = var166;
                    if (var170.eql((SubLObject)module0099.$ic349$)) {
                        var169 = Strings.string_upcase(module0038.f2624(var168), (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
                    }
                    else {
                        Errors.error((SubLObject)module0099.$ic350$, var166);
                    }
                    streams_high.write_string(var169, var161, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var164, (SubLObject)module0099.$ic348$);
                }
            }
            else {
                Errors.error((SubLObject)module0099.$ic351$, var140, var163);
            }
            var162 = var162.rest();
            var163 = var162.first();
        }
        return var161;
    }
    
    public static SubLObject f7234(final SubLObject var162, final SubLObject var33, final SubLObject var143) {
        final SubLThread var163 = SubLProcess.currentSubLThread();
        if (var162.isString()) {
            return var162;
        }
        if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var163) && !var162.isKeyword()) {
            Errors.error((SubLObject)module0099.$ic352$, var162);
        }
        final SubLObject var164 = conses_high.getf(var143, var162, (SubLObject)module0099.$ic347$);
        SubLObject var165 = conses_high.getf(var33, var162, var164);
        if (module0099.NIL == Errors.$ignore_mustsP$.getDynamicValue(var163) && module0099.$ic347$ == var165) {
            Errors.error((SubLObject)module0099.$ic353$, var162, var33, var143);
        }
        if (var165.isSymbol() && !var165.isKeyword() && module0099.NIL != Symbols.boundp(var165)) {
            var165 = Symbols.symbol_value(var165);
        }
        return var165;
    }
    
    public static SubLObject f7233(final SubLObject var161, final SubLObject var141, final SubLObject var142, final SubLObject var33, final SubLObject var143) {
        SubLObject var162 = (SubLObject)module0099.ZERO_INTEGER;
        SubLObject var163;
        SubLObject var164;
        SubLObject var165;
        SubLObject var166;
        SubLObject var167;
        for (var163 = (SubLObject)module0099.NIL, var163 = var141; module0099.NIL != var163; var163 = conses_high.cddr(var163)) {
            var164 = var163.first();
            var165 = conses_high.cadr(var163);
            var166 = conses_high.getf(var143, var164, (SubLObject)module0099.$ic347$);
            var167 = conses_high.getf(var33, var164, var166);
            if (module0099.NIL != var167 && module0099.NIL == module0038.f2608(var167) && module0099.$ic347$ != var167) {
                f7235(var161, var142, (SubLObject)(var162.isZero() ? module0099.$ic200$ : module0099.$ic295$));
                streams_high.write_string(var165, var161, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
                f7235(var161, var142, (SubLObject)module0099.$ic297$);
                print_high.princ(var167, var161);
                var162 = Numbers.add(var162, (SubLObject)module0099.ONE_INTEGER);
            }
        }
        if (!var162.isZero()) {
            f7235(var161, var142, (SubLObject)module0099.$ic294$);
        }
        return var161;
    }
    
    public static SubLObject f7235(final SubLObject var161, final SubLObject var172, final SubLObject var173) {
        streams_high.write_string(conses_high.getf(var172, var173, (SubLObject)module0099.$ic169$), var161, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED);
        return var161;
    }
    
    public static SubLObject f7199(final SubLObject var174) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var174.isInteger() && var174.numG((SubLObject)module0099.$ic354$) && var174.numL((SubLObject)module0099.$ic355$));
    }
    
    public static SubLObject f7201(final SubLObject var174) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var174.isInteger() && var174.numG((SubLObject)module0099.$ic356$) && var174.numL((SubLObject)module0099.$ic357$));
    }
    
    public static SubLObject f7203(final SubLObject var174) {
        return Types.floatp(var174);
    }
    
    public static SubLObject f7205(final SubLObject var174) {
        return Types.floatp(var174);
    }
    
    public static SubLObject f7236(final SubLObject var147, final SubLObject var148) {
        SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic358$);
        final SubLObject var151 = var150.rest();
        var150 = var150.first();
        SubLObject var152 = (SubLObject)module0099.NIL;
        SubLObject var153 = (SubLObject)module0099.NIL;
        SubLObject var154 = (SubLObject)module0099.NIL;
        SubLObject var155 = (SubLObject)module0099.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic358$);
        var152 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic358$);
        var153 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic358$);
        var154 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic358$);
        var155 = var150.first();
        var150 = var150.rest();
        SubLObject var156 = (SubLObject)module0099.NIL;
        SubLObject var157 = var150;
        SubLObject var158 = (SubLObject)module0099.NIL;
        SubLObject var181_182 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var157) {
            cdestructuring_bind.destructuring_bind_must_consp(var157, var149, (SubLObject)module0099.$ic358$);
            var181_182 = var157.first();
            var157 = var157.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var157, var149, (SubLObject)module0099.$ic358$);
            if (module0099.NIL == conses_high.member(var181_182, (SubLObject)module0099.$ic359$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var158 = (SubLObject)module0099.T;
            }
            if (var181_182 == module0099.$ic96$) {
                var156 = var157.first();
            }
            var157 = var157.rest();
        }
        if (module0099.NIL != var158 && module0099.NIL == var156) {
            cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic358$);
        }
        final SubLObject var159 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic72$, var150);
        final SubLObject var160 = (SubLObject)((module0099.NIL != var159) ? conses_high.cadr(var159) : module0099.$ic1$);
        final SubLObject var161 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic73$, var150);
        final SubLObject var162 = (SubLObject)((module0099.NIL != var161) ? conses_high.cadr(var161) : module0099.$ic7$);
        final SubLObject var163 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic77$, var150);
        final SubLObject var164 = (SubLObject)((module0099.NIL != var163) ? conses_high.cadr(var163) : module0099.$ic360$);
        final SubLObject var165 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic78$, var150);
        final SubLObject var166 = (module0099.NIL != var165) ? conses_high.cadr(var165) : var160;
        final SubLObject var167 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic98$, var150);
        final SubLObject var168 = (SubLObject)((module0099.NIL != var167) ? conses_high.cadr(var167) : module0099.$ic361$);
        final SubLObject var169;
        var150 = (var169 = var151);
        return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic362$, (SubLObject)ConsesLow.list(var152), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic363$, (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic364$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var152, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic366$, var153, var154, var155, (SubLObject)ConsesLow.list(new SubLObject[] { module0099.$ic367$, module0099.$ic72$, var160, module0099.$ic73$, var162, module0099.$ic77$, var164, module0099.$ic78$, var166, module0099.$ic98$, var168 }))), ConsesLow.append(var169, (SubLObject)module0099.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic38$, var152), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic369$, var152))));
    }
    
    public static SubLObject f7237(final SubLObject var147, final SubLObject var148) {
        SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic370$);
        final SubLObject var151 = var150.rest();
        var150 = var150.first();
        SubLObject var152 = (SubLObject)module0099.NIL;
        SubLObject var153 = (SubLObject)module0099.NIL;
        SubLObject var154 = (SubLObject)module0099.NIL;
        SubLObject var155 = (SubLObject)module0099.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic370$);
        var152 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic370$);
        var153 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic370$);
        var154 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic370$);
        var155 = var150.first();
        var150 = var150.rest();
        SubLObject var156 = (SubLObject)module0099.NIL;
        SubLObject var157 = var150;
        SubLObject var158 = (SubLObject)module0099.NIL;
        SubLObject var195_196 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var157) {
            cdestructuring_bind.destructuring_bind_must_consp(var157, var149, (SubLObject)module0099.$ic370$);
            var195_196 = var157.first();
            var157 = var157.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var157, var149, (SubLObject)module0099.$ic370$);
            if (module0099.NIL == conses_high.member(var195_196, (SubLObject)module0099.$ic359$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var158 = (SubLObject)module0099.T;
            }
            if (var195_196 == module0099.$ic96$) {
                var156 = var157.first();
            }
            var157 = var157.rest();
        }
        if (module0099.NIL != var158 && module0099.NIL == var156) {
            cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic370$);
        }
        final SubLObject var159 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic72$, var150);
        final SubLObject var160 = (SubLObject)((module0099.NIL != var159) ? conses_high.cadr(var159) : module0099.$ic1$);
        final SubLObject var161 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic73$, var150);
        final SubLObject var162 = (SubLObject)((module0099.NIL != var161) ? conses_high.cadr(var161) : module0099.$ic7$);
        final SubLObject var163 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic77$, var150);
        final SubLObject var164 = (SubLObject)((module0099.NIL != var163) ? conses_high.cadr(var163) : module0099.$ic360$);
        final SubLObject var165 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic78$, var150);
        final SubLObject var166 = (module0099.NIL != var165) ? conses_high.cadr(var165) : var160;
        final SubLObject var167 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic98$, var150);
        final SubLObject var168 = (SubLObject)((module0099.NIL != var167) ? conses_high.cadr(var167) : module0099.$ic361$);
        final SubLObject var169;
        var150 = (var169 = var151);
        final SubLObject var170 = (SubLObject)module0099.$ic371$;
        return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic362$, (SubLObject)ConsesLow.list(var152), (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic372$, (SubLObject)ConsesLow.list(new SubLObject[] { var170, var153, var154, var155, module0099.$ic72$, var160, module0099.$ic73$, var162, module0099.$ic77$, var164, module0099.$ic78$, var166, module0099.$ic98$, var168 }), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic373$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic106$, var170), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var152, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic374$, var170)), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var152, var170)), ConsesLow.append(var169, (SubLObject)module0099.NIL)));
    }
    
    public static SubLObject f7238(final SubLObject var147, final SubLObject var148) {
        SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic375$);
        final SubLObject var151 = var150.rest();
        var150 = var150.first();
        SubLObject var152 = (SubLObject)module0099.NIL;
        SubLObject var153 = (SubLObject)module0099.NIL;
        SubLObject var154 = (SubLObject)module0099.NIL;
        SubLObject var155 = (SubLObject)module0099.NIL;
        SubLObject var156 = (SubLObject)module0099.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic375$);
        var152 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic375$);
        var153 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic375$);
        var154 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic375$);
        var155 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic375$);
        var156 = var150.first();
        var150 = var150.rest();
        SubLObject var157 = (SubLObject)module0099.NIL;
        SubLObject var158 = var150;
        SubLObject var159 = (SubLObject)module0099.NIL;
        SubLObject var208_209 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var158) {
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic375$);
            var208_209 = var158.first();
            var158 = var158.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic375$);
            if (module0099.NIL == conses_high.member(var208_209, (SubLObject)module0099.$ic359$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var159 = (SubLObject)module0099.T;
            }
            if (var208_209 == module0099.$ic96$) {
                var157 = var158.first();
            }
            var158 = var158.rest();
        }
        if (module0099.NIL != var159 && module0099.NIL == var157) {
            cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic375$);
        }
        final SubLObject var160 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic72$, var150);
        final SubLObject var161 = (SubLObject)((module0099.NIL != var160) ? conses_high.cadr(var160) : module0099.$ic1$);
        final SubLObject var162 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic73$, var150);
        final SubLObject var163 = (SubLObject)((module0099.NIL != var162) ? conses_high.cadr(var162) : module0099.$ic7$);
        final SubLObject var164 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic77$, var150);
        final SubLObject var165 = (SubLObject)((module0099.NIL != var164) ? conses_high.cadr(var164) : module0099.$ic360$);
        final SubLObject var166 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic78$, var150);
        final SubLObject var167 = (module0099.NIL != var166) ? conses_high.cadr(var166) : var161;
        final SubLObject var168 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic98$, var150);
        final SubLObject var169 = (SubLObject)((module0099.NIL != var168) ? conses_high.cadr(var168) : module0099.$ic361$);
        final SubLObject var170;
        var150 = (var170 = var151);
        final SubLObject var171 = (SubLObject)module0099.$ic376$;
        return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic362$, (SubLObject)ConsesLow.list(var152), (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic372$, (SubLObject)ConsesLow.list(new SubLObject[] { var171, var154, var155, var156, module0099.$ic72$, var161, module0099.$ic73$, var163, module0099.$ic77$, var165, module0099.$ic78$, var167, module0099.$ic98$, var169 }), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic373$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic106$, var171), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var152, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic377$, var171, var153)), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var152, var171)), ConsesLow.append(var170, (SubLObject)module0099.NIL)));
    }
    
    public static SubLObject f7239(final SubLObject var147, final SubLObject var148) {
        SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic378$);
        final SubLObject var151 = var150.rest();
        var150 = var150.first();
        SubLObject var152 = (SubLObject)module0099.NIL;
        SubLObject var153 = (SubLObject)module0099.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic378$);
        var152 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic378$);
        var153 = var150.first();
        var150 = var150.rest();
        if (module0099.NIL == var150) {
            final SubLObject var154;
            var150 = (var154 = var151);
            final SubLObject var155 = (SubLObject)module0099.$ic379$;
            final SubLObject var156 = (SubLObject)module0099.$ic380$;
            final SubLObject var157 = (SubLObject)module0099.$ic381$;
            final SubLObject var158 = (SubLObject)module0099.$ic382$;
            final SubLObject var159 = (SubLObject)module0099.$ic383$;
            final SubLObject var160 = (SubLObject)module0099.$ic384$;
            return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic364$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic362$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var155, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic254$, var152)), (SubLObject)ConsesLow.list(var156, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic385$, var155)), var157, var158, var159, var160), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic373$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic143$, var156), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic386$, var156, var160), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic364$, (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic138$, var155, (SubLObject)module0099.$ic387$), (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic388$, (SubLObject)ConsesLow.list(var157), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, var156, (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic389$, var155, (SubLObject)module0099.$ic390$)), ConsesLow.append(var154, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0099.$ic391$, var155)))), (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic138$, var155, (SubLObject)module0099.$ic392$), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, var157, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic386$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic393$, var157), var160), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var158, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic394$, var155)), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic143$, var158), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic386$, var158, var160))), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, var156, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var159, (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic389$, var155, (SubLObject)module0099.$ic395$))), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic143$, var159), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic386$, var159, var160)))), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, var160, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var153, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic396$, var160)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic378$);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7240(final SubLObject var78) {
        if (module0099.NIL != f7065(var78)) {
            return f7061(module0099.$g1320$.getGlobalValue(), f7109(var78), (SubLObject)module0099.UNPROVIDED);
        }
        if (var78.isString()) {
            return f7061(module0099.$g1322$.getGlobalValue(), var78, (SubLObject)module0099.UNPROVIDED);
        }
        return f7061(module0099.$g1318$.getGlobalValue(), (SubLObject)module0099.$ic397$, (SubLObject)module0099.UNPROVIDED);
    }
    
    public static SubLObject f7241(final SubLObject var27) {
        SubLObject var28 = (SubLObject)module0099.NIL;
        var28 = f7077(var27);
        if (module0099.NIL != f7065(var28)) {
            var28 = f7061(module0099.$g1321$.getGlobalValue(), f7109(var28), (SubLObject)module0099.UNPROVIDED);
        }
        return var28;
    }
    
    public static SubLObject f7242(final SubLObject var222) {
        final SubLObject var223 = module0038.f2761(Mapping.mapcar((SubLObject)module0099.$ic153$, var222), (SubLObject)Characters.CHAR_newline);
        return f7061(module0099.$g1322$.getGlobalValue(), var223, (SubLObject)module0099.UNPROVIDED);
    }
    
    public static SubLObject f7243(final SubLObject var147, final SubLObject var148) {
        SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic398$);
        final SubLObject var151 = var150.rest();
        var150 = var150.first();
        SubLObject var152 = (SubLObject)module0099.NIL;
        SubLObject var153 = (SubLObject)module0099.NIL;
        SubLObject var154 = (SubLObject)module0099.NIL;
        SubLObject var155 = (SubLObject)module0099.NIL;
        SubLObject var156 = (SubLObject)module0099.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic398$);
        var152 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic398$);
        var153 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic398$);
        var154 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic398$);
        var155 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic398$);
        var156 = var150.first();
        var150 = var150.rest();
        SubLObject var157 = (SubLObject)module0099.NIL;
        SubLObject var158 = var150;
        SubLObject var159 = (SubLObject)module0099.NIL;
        SubLObject var229_230 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var158) {
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic398$);
            var229_230 = var158.first();
            var158 = var158.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic398$);
            if (module0099.NIL == conses_high.member(var229_230, (SubLObject)module0099.$ic359$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var159 = (SubLObject)module0099.T;
            }
            if (var229_230 == module0099.$ic96$) {
                var157 = var158.first();
            }
            var158 = var158.rest();
        }
        if (module0099.NIL != var159 && module0099.NIL == var157) {
            cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic398$);
        }
        final SubLObject var160 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic72$, var150);
        final SubLObject var161 = (SubLObject)((module0099.NIL != var160) ? conses_high.cadr(var160) : module0099.$ic1$);
        final SubLObject var162 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic73$, var150);
        final SubLObject var163 = (SubLObject)((module0099.NIL != var162) ? conses_high.cadr(var162) : module0099.$ic7$);
        final SubLObject var164 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic77$, var150);
        final SubLObject var165 = (SubLObject)((module0099.NIL != var164) ? conses_high.cadr(var164) : module0099.$ic360$);
        final SubLObject var166 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic78$, var150);
        final SubLObject var167 = (module0099.NIL != var166) ? conses_high.cadr(var166) : var161;
        final SubLObject var168 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic98$, var150);
        final SubLObject var169 = (SubLObject)((module0099.NIL != var168) ? conses_high.cadr(var168) : module0099.$ic361$);
        final SubLObject var170;
        var150 = (var170 = var151);
        return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic399$, (SubLObject)ConsesLow.list(new SubLObject[] { var152, var154, var155, var156, module0099.$ic72$, var161, module0099.$ic73$, var163, module0099.$ic77$, var165, module0099.$ic78$, var167, module0099.$ic98$, var169 }), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic247$, var152), (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic139$, (SubLObject)ConsesLow.list(var152, var153), ConsesLow.append(var170, (SubLObject)module0099.NIL))));
    }
    
    public static SubLObject f7244(final SubLObject var147, final SubLObject var148) {
        SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        final SubLObject var151 = var150.rest();
        var150 = var150.first();
        SubLObject var152 = (SubLObject)module0099.NIL;
        SubLObject var153 = (SubLObject)module0099.NIL;
        SubLObject var154 = (SubLObject)module0099.NIL;
        SubLObject var155 = (SubLObject)module0099.NIL;
        SubLObject var156 = (SubLObject)module0099.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var152 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var153 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var154 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var155 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var156 = var150.first();
        var150 = var150.rest();
        SubLObject var157 = (SubLObject)module0099.NIL;
        SubLObject var158 = var150;
        SubLObject var159 = (SubLObject)module0099.NIL;
        SubLObject var243_244 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var158) {
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic400$);
            var243_244 = var158.first();
            var158 = var158.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic400$);
            if (module0099.NIL == conses_high.member(var243_244, (SubLObject)module0099.$ic359$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var159 = (SubLObject)module0099.T;
            }
            if (var243_244 == module0099.$ic96$) {
                var157 = var158.first();
            }
            var158 = var158.rest();
        }
        if (module0099.NIL != var159 && module0099.NIL == var157) {
            cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic400$);
        }
        final SubLObject var160 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic72$, var150);
        final SubLObject var161 = (SubLObject)((module0099.NIL != var160) ? conses_high.cadr(var160) : module0099.$ic1$);
        final SubLObject var162 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic73$, var150);
        final SubLObject var163 = (SubLObject)((module0099.NIL != var162) ? conses_high.cadr(var162) : module0099.$ic7$);
        final SubLObject var164 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic77$, var150);
        final SubLObject var165 = (SubLObject)((module0099.NIL != var164) ? conses_high.cadr(var164) : module0099.$ic360$);
        final SubLObject var166 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic78$, var150);
        final SubLObject var167 = (module0099.NIL != var166) ? conses_high.cadr(var166) : var161;
        final SubLObject var168 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic98$, var150);
        final SubLObject var169 = (SubLObject)((module0099.NIL != var168) ? conses_high.cadr(var168) : module0099.$ic361$);
        final SubLObject var170;
        var150 = (var170 = var151);
        final SubLObject var171 = (SubLObject)module0099.$ic401$;
        return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic362$, (SubLObject)ConsesLow.list(var152), (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic399$, (SubLObject)ConsesLow.list(new SubLObject[] { var171, var154, var155, var156, module0099.$ic72$, var161, module0099.$ic73$, var163, module0099.$ic77$, var165, module0099.$ic78$, var167, module0099.$ic98$, var169 }), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic373$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic247$, var171), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, (SubLObject)module0099.$ic402$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic403$, var171, var153)), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic365$, var152, var171)), ConsesLow.append(var170, (SubLObject)module0099.NIL)));
    }
    
    public static SubLObject f7245(final SubLObject var147, final SubLObject var148) {
        SubLObject var150;
        final SubLObject var149 = var150 = var147.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        final SubLObject var151 = var150.rest();
        var150 = var150.first();
        SubLObject var152 = (SubLObject)module0099.NIL;
        SubLObject var153 = (SubLObject)module0099.NIL;
        SubLObject var154 = (SubLObject)module0099.NIL;
        SubLObject var155 = (SubLObject)module0099.NIL;
        SubLObject var156 = (SubLObject)module0099.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var152 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var153 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var154 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var155 = var150.first();
        var150 = var150.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var150, var149, (SubLObject)module0099.$ic400$);
        var156 = var150.first();
        var150 = var150.rest();
        SubLObject var157 = (SubLObject)module0099.NIL;
        SubLObject var158 = var150;
        SubLObject var159 = (SubLObject)module0099.NIL;
        SubLObject var256_257 = (SubLObject)module0099.NIL;
        while (module0099.NIL != var158) {
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic400$);
            var256_257 = var158.first();
            var158 = var158.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var158, var149, (SubLObject)module0099.$ic400$);
            if (module0099.NIL == conses_high.member(var256_257, (SubLObject)module0099.$ic359$, (SubLObject)module0099.UNPROVIDED, (SubLObject)module0099.UNPROVIDED)) {
                var159 = (SubLObject)module0099.T;
            }
            if (var256_257 == module0099.$ic96$) {
                var157 = var158.first();
            }
            var158 = var158.rest();
        }
        if (module0099.NIL != var159 && module0099.NIL == var157) {
            cdestructuring_bind.cdestructuring_bind_error(var149, (SubLObject)module0099.$ic400$);
        }
        final SubLObject var160 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic72$, var150);
        final SubLObject var161 = (SubLObject)((module0099.NIL != var160) ? conses_high.cadr(var160) : module0099.$ic1$);
        final SubLObject var162 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic73$, var150);
        final SubLObject var163 = (SubLObject)((module0099.NIL != var162) ? conses_high.cadr(var162) : module0099.$ic7$);
        final SubLObject var164 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic77$, var150);
        final SubLObject var165 = (SubLObject)((module0099.NIL != var164) ? conses_high.cadr(var164) : module0099.$ic360$);
        final SubLObject var166 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic78$, var150);
        final SubLObject var167 = (module0099.NIL != var166) ? conses_high.cadr(var166) : var161;
        final SubLObject var168 = cdestructuring_bind.property_list_member((SubLObject)module0099.$ic98$, var150);
        final SubLObject var169 = (SubLObject)((module0099.NIL != var168) ? conses_high.cadr(var168) : module0099.$ic361$);
        final SubLObject var170;
        var150 = (var170 = var151);
        return (SubLObject)ConsesLow.list((SubLObject)module0099.$ic404$, (SubLObject)ConsesLow.list(new SubLObject[] { var152, var153, var154, var155, var156, module0099.$ic72$, var161, module0099.$ic73$, var163, module0099.$ic77$, var165, module0099.$ic78$, var167, module0099.$ic98$, var169 }), (SubLObject)ConsesLow.list((SubLObject)module0099.$ic368$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic175$, var152), (SubLObject)ConsesLow.listS((SubLObject)module0099.$ic405$, (SubLObject)ConsesLow.list((SubLObject)module0099.$ic406$, var152), ConsesLow.append(var170, (SubLObject)module0099.NIL))));
    }
    
    public static SubLObject f7246(final SubLObject var136, final SubLObject var30, final SubLObject var31, final SubLObject var32, SubLObject var7, SubLObject var42, SubLObject var2, SubLObject var46, SubLObject var48) {
        if (var7 == module0099.UNPROVIDED) {
            var7 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var42 == module0099.UNPROVIDED) {
            var42 = module0099.$g1266$.getGlobalValue();
        }
        if (var2 == module0099.UNPROVIDED) {
            var2 = module0099.$g1268$.getGlobalValue();
        }
        if (var46 == module0099.UNPROVIDED) {
            var46 = module0099.$g1270$.getGlobalValue();
        }
        if (var48 == module0099.UNPROVIDED) {
            var48 = var42;
        }
        assert module0099.NIL != Types.stringp(var136) : var136;
        assert module0099.NIL != Types.stringp(var30) : var30;
        assert module0099.NIL != Types.stringp(var31) : var31;
        assert module0099.NIL != Types.stringp(var32) : var32;
        assert module0099.NIL != streams_high.output_stream_p(var7) : var7;
        assert module0099.NIL != Types.stringp(var42) : var42;
        assert module0099.NIL != module0004.f105(var2) : var2;
        assert module0099.NIL != Types.stringp(var46) : var46;
        assert module0099.NIL != Types.stringp(var48) : var48;
        final SubLObject var137 = (SubLObject)module0099.NIL;
        SubLObject var138 = (SubLObject)module0099.NIL;
        SubLObject var91_264 = (SubLObject)module0099.NIL;
        SubLObject var139 = (SubLObject)module0099.NIL;
        SubLObject var140 = (SubLObject)module0099.NIL;
        try {
            var140 = f7059(var30, var31, var32, (SubLObject)ConsesLow.list(new SubLObject[] { module0099.$ic72$, var42, module0099.$ic73$, var2, module0099.$ic77$, var46, module0099.$ic78$, var48, module0099.$ic98$, module0099.$g1271$.getGlobalValue() }));
            if (module0099.NIL != f7067(var140)) {
                var139 = f7069(var140);
            }
            else {
                var139 = var140;
            }
            if (module0099.NIL != f7183(var139)) {
                var91_264 = f7184(var139, Sequences.cconcatenate((SubLObject)module0099.$ic408$, var136), (SubLObject)module0099.UNPROVIDED);
            }
            else {
                var91_264 = var139;
            }
            if (module0099.NIL != f7126(var91_264)) {
                while (module0099.NIL != f7153(var91_264)) {
                    var138 = (SubLObject)module0099.ZERO_INTEGER;
                    while (!var138.numE(module0048.f_1_(f7146(var91_264)))) {
                        var138 = Numbers.add(var138, (SubLObject)module0099.ONE_INTEGER);
                        print_high.princ(f7158(var91_264, var138), var7);
                        print_high.princ((SubLObject)Characters.CHAR_tab, var7);
                    }
                    var138 = Numbers.add(var138, (SubLObject)module0099.ONE_INTEGER);
                    print_high.princ(f7158(var91_264, var138), var7);
                    streams_high.terpri(var7);
                }
            }
        }
        finally {
            final SubLObject var141 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0099.T);
                if (module0099.NIL != f7029(var140)) {
                    f7066(var140);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var141);
            }
        }
        return var137;
    }
    
    public static SubLObject f7247(final SubLObject var30, final SubLObject var31, final SubLObject var32, SubLObject var42, SubLObject var2, SubLObject var46, SubLObject var48, SubLObject var136) {
        if (var42 == module0099.UNPROVIDED) {
            var42 = module0099.$g1266$.getGlobalValue();
        }
        if (var2 == module0099.UNPROVIDED) {
            var2 = module0099.$g1268$.getGlobalValue();
        }
        if (var46 == module0099.UNPROVIDED) {
            var46 = module0099.$g1270$.getGlobalValue();
        }
        if (var48 == module0099.UNPROVIDED) {
            var48 = var42;
        }
        if (var136 == module0099.UNPROVIDED) {
            var136 = module0038.f2752(Environment.machine_instance(), (SubLObject)module0099.$ic409$).first();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != f7248(var30, var31, var32, var42, var2, var46, var48, var136) && module0099.NIL != f7249(var30, var31, var32, var42, var2, var46, var48, var136) && module0099.NIL != f7250(var30, var31, var32, var42, var2, var46, var48, var136));
    }
    
    public static SubLObject f7249(final SubLObject var30, final SubLObject var31, final SubLObject var32, SubLObject var42, SubLObject var2, SubLObject var46, SubLObject var48, SubLObject var136) {
        if (var42 == module0099.UNPROVIDED) {
            var42 = module0099.$g1266$.getGlobalValue();
        }
        if (var2 == module0099.UNPROVIDED) {
            var2 = module0099.$g1268$.getGlobalValue();
        }
        if (var46 == module0099.UNPROVIDED) {
            var46 = module0099.$g1270$.getGlobalValue();
        }
        if (var48 == module0099.UNPROVIDED) {
            var48 = var42;
        }
        if (var136 == module0099.UNPROVIDED) {
            var136 = module0038.f2752(Environment.machine_instance(), (SubLObject)module0099.$ic409$).first();
        }
        SubLObject var137 = (SubLObject)module0099.NIL;
        SubLObject var138 = (SubLObject)module0099.NIL;
        SubLObject var139 = (SubLObject)module0099.NIL;
        SubLObject var140 = (SubLObject)module0099.NIL;
        SubLObject var141 = (SubLObject)module0099.NIL;
        SubLObject var142 = (SubLObject)module0099.NIL;
        SubLObject var143 = (SubLObject)module0099.NIL;
        try {
            var137 = f7059(var30, var31, var32, (SubLObject)ConsesLow.list(new SubLObject[] { module0099.$ic72$, var42, module0099.$ic73$, var2, module0099.$ic77$, var46, module0099.$ic78$, var48, module0099.$ic98$, module0099.$g1271$.getGlobalValue() }));
            var138 = f7069(var137);
            var139 = f7072(var137, PrintLow.format((SubLObject)module0099.NIL, (SubLObject)module0099.$ic410$, var136));
            var140 = f7072(var137, PrintLow.format((SubLObject)module0099.NIL, (SubLObject)module0099.$ic411$, var136));
            var141 = (SubLObject)module0099.T;
            f7185(var138, Sequences.cconcatenate((SubLObject)module0099.$ic412$, new SubLObject[] { var136, module0099.$ic413$ }));
            SubLObject var144;
            for (var144 = (SubLObject)module0099.NIL, var144 = (SubLObject)module0099.ZERO_INTEGER; var144.numL(module0099.$g1334$.getGlobalValue()); var144 = Numbers.add(var144, (SubLObject)module0099.ONE_INTEGER)) {
                f7198(var139, (SubLObject)module0099.ONE_INTEGER, var144);
                f7198(var139, (SubLObject)module0099.TWO_INTEGER, var144);
                f7195(var139);
            }
            for (var144 = (SubLObject)module0099.NIL, var144 = (SubLObject)module0099.ZERO_INTEGER; var144.numL(module0099.$g1334$.getGlobalValue()); var144 = Numbers.add(var144, (SubLObject)module0099.ONE_INTEGER)) {
                f7198(var140, (SubLObject)module0099.ONE_INTEGER, var144);
                var142 = f7194(var140, (SubLObject)module0099.UNPROVIDED);
                f7153(var142);
                var143 = f7158(var142, (SubLObject)module0099.ONE_INTEGER);
                var141 = (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != var141 && var143.eql(var144));
                if (!var143.eql(var144)) {
                    Errors.warn((SubLObject)module0099.$ic414$, var144, var143);
                }
            }
            f7185(var138, Sequences.cconcatenate((SubLObject)module0099.$ic415$, var136));
        }
        finally {
            final SubLObject var145 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0099.T);
                if (module0099.NIL != f7029(var137)) {
                    f7066(var137);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var145);
            }
        }
        return var141;
    }
    
    public static SubLObject f7248(final SubLObject var30, final SubLObject var31, final SubLObject var32, SubLObject var42, SubLObject var2, SubLObject var46, SubLObject var48, SubLObject var136) {
        if (var42 == module0099.UNPROVIDED) {
            var42 = module0099.$g1266$.getGlobalValue();
        }
        if (var2 == module0099.UNPROVIDED) {
            var2 = module0099.$g1268$.getGlobalValue();
        }
        if (var46 == module0099.UNPROVIDED) {
            var46 = module0099.$g1270$.getGlobalValue();
        }
        if (var48 == module0099.UNPROVIDED) {
            var48 = var42;
        }
        if (var136 == module0099.UNPROVIDED) {
            var136 = module0038.f2752(Environment.machine_instance(), (SubLObject)module0099.$ic409$).first();
        }
        SubLObject var137 = (SubLObject)module0099.T;
        SubLObject var138 = (SubLObject)module0099.NIL;
        SubLObject var139 = (SubLObject)module0099.NIL;
        SubLObject var140 = (SubLObject)module0099.NIL;
        SubLObject var141 = (SubLObject)module0099.NIL;
        SubLObject var142 = (SubLObject)module0099.NIL;
        try {
            var142 = f7059(var30, var31, var32, (SubLObject)ConsesLow.list(new SubLObject[] { module0099.$ic72$, var42, module0099.$ic73$, var2, module0099.$ic77$, var46, module0099.$ic78$, var48, module0099.$ic98$, module0099.$g1271$.getGlobalValue() }));
            if (module0099.NIL != f7067(var142)) {
                var141 = f7069(var142);
            }
            else {
                var141 = var142;
            }
            f7185(var141, Sequences.cconcatenate((SubLObject)module0099.$ic412$, new SubLObject[] { var136, module0099.$ic413$ }));
            SubLObject var143;
            for (var143 = (SubLObject)module0099.NIL, var143 = (SubLObject)module0099.ZERO_INTEGER; var143.numL(module0099.$g1334$.getGlobalValue()); var143 = Numbers.add(var143, (SubLObject)module0099.ONE_INTEGER)) {
                var138 = print_high.prin1_to_string(var143);
                f7185(var141, Sequences.cconcatenate((SubLObject)module0099.$ic416$, new SubLObject[] { var136, module0099.$ic417$, var138, module0099.$ic418$, var138, module0099.$ic419$ }));
            }
            for (var143 = (SubLObject)module0099.NIL, var143 = (SubLObject)module0099.ZERO_INTEGER; var143.numL(module0099.$g1334$.getGlobalValue()); var143 = Numbers.add(var143, (SubLObject)module0099.ONE_INTEGER)) {
                var139 = f7184(var141, Sequences.cconcatenate((SubLObject)module0099.$ic420$, new SubLObject[] { var136, module0099.$ic421$, print_high.prin1_to_string(var143) }), (SubLObject)module0099.UNPROVIDED);
                f7153(var139);
                var140 = f7158(var139, (SubLObject)module0099.ONE_INTEGER);
                var137 = (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != var137 && var140.eql(var143));
                if (!var140.eql(var143)) {
                    Errors.warn((SubLObject)module0099.$ic414$, var143, var140);
                }
            }
            f7185(var141, Sequences.cconcatenate((SubLObject)module0099.$ic415$, var136));
        }
        finally {
            final SubLObject var144 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0099.T);
                if (module0099.NIL != f7029(var142)) {
                    f7066(var142);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var144);
            }
        }
        return var137;
    }
    
    public static SubLObject f7250(final SubLObject var30, final SubLObject var31, final SubLObject var32, SubLObject var42, SubLObject var2, SubLObject var46, SubLObject var48, SubLObject var136) {
        if (var42 == module0099.UNPROVIDED) {
            var42 = module0099.$g1266$.getGlobalValue();
        }
        if (var2 == module0099.UNPROVIDED) {
            var2 = module0099.$g1268$.getGlobalValue();
        }
        if (var46 == module0099.UNPROVIDED) {
            var46 = module0099.$g1270$.getGlobalValue();
        }
        if (var48 == module0099.UNPROVIDED) {
            var48 = var42;
        }
        if (var136 == module0099.UNPROVIDED) {
            var136 = module0038.f2752(Environment.machine_instance(), (SubLObject)module0099.$ic409$).first();
        }
        SubLObject var137 = (SubLObject)module0099.T;
        SubLObject var138 = (SubLObject)module0099.NIL;
        SubLObject var139 = (SubLObject)module0099.NIL;
        SubLObject var140 = (SubLObject)module0099.NIL;
        SubLObject var141 = (SubLObject)module0099.NIL;
        SubLObject var142 = (SubLObject)module0099.NIL;
        try {
            var142 = f7059(var30, var31, var32, (SubLObject)ConsesLow.list(new SubLObject[] { module0099.$ic72$, var42, module0099.$ic73$, var2, module0099.$ic77$, var46, module0099.$ic78$, var48, module0099.$ic98$, module0099.$g1271$.getGlobalValue() }));
            if (module0099.NIL != f7067(var142)) {
                var141 = f7069(var142);
            }
            else {
                var141 = var142;
            }
            f7185(var141, Sequences.cconcatenate((SubLObject)module0099.$ic412$, new SubLObject[] { var136, module0099.$ic413$ }));
            SubLObject var143;
            for (var143 = (SubLObject)module0099.NIL, var143 = (SubLObject)module0099.ZERO_INTEGER; var143.numL(module0099.$g1334$.getGlobalValue()); var143 = Numbers.add(var143, (SubLObject)module0099.ONE_INTEGER)) {
                var138 = print_high.prin1_to_string(var143);
                f7189(var141, Sequences.cconcatenate((SubLObject)module0099.$ic416$, new SubLObject[] { var136, module0099.$ic417$, var138, module0099.$ic418$, var138, module0099.$ic419$ }));
            }
            f7191(var141);
            for (var143 = (SubLObject)module0099.NIL, var143 = (SubLObject)module0099.ZERO_INTEGER; var143.numL(module0099.$g1334$.getGlobalValue()); var143 = Numbers.add(var143, (SubLObject)module0099.ONE_INTEGER)) {
                var139 = f7184(var141, Sequences.cconcatenate((SubLObject)module0099.$ic420$, new SubLObject[] { var136, module0099.$ic421$, print_high.prin1_to_string(var143) }), (SubLObject)module0099.UNPROVIDED);
                f7153(var139);
                var140 = f7158(var139, (SubLObject)module0099.ONE_INTEGER);
                var137 = (SubLObject)SubLObjectFactory.makeBoolean(module0099.NIL != var137 && var140.eql(var143));
                if (!var140.eql(var143)) {
                    Errors.warn((SubLObject)module0099.$ic414$, var143, var140);
                }
            }
            f7185(var141, Sequences.cconcatenate((SubLObject)module0099.$ic415$, var136));
        }
        finally {
            final SubLObject var144 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0099.T);
                if (module0099.NIL != f7029(var142)) {
                    f7066(var142);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var144);
            }
        }
        return var137;
    }
    
    public static SubLObject f7251() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7026", "S#8846", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7027", "S#8847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7029", "S#8838", 1, 0, false);
        new $f7029$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7030", "S#8848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7031", "S#8849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7032", "S#8850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7033", "S#8851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7034", "S#8852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7035", "S#8853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7036", "S#8854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7037", "S#8855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7038", "S#8856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7039", "S#8857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7040", "S#8858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7041", "S#8859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7042", "S#8860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7043", "S#8861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7044", "S#8862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7045", "S#8863", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7046", "S#8864", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7047", "S#8865", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7048", "S#8866", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7049", "S#8867", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7050", "S#8868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7051", "S#8869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7052", "S#8870", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7053", "S#8871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7054", "S#8872", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7055", "S#8873", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7056", "S#8874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7028", "S#8875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7057", "S#8876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7059", "S#8877", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7067", "S#8878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7058", "S#8879", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7066", "S#8880", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7069", "S#8881", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7072", "S#8882", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7074", "S#8883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7075", "S#8884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7076", "S#8885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7077", "S#8886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7078", "S#8887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7079", "S#8888", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7081", "S#8889", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7082", "S#8840", 1, 0, false);
        new $f7082$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7083", "S#8890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7084", "S#8891", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7085", "S#8892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7086", "S#8893", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7087", "S#8894", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7088", "S#8895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7089", "S#8896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7090", "S#8897", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7091", "S#8898", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7062", "S#8899", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7092", "S#8900", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7063", "S#8901", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7095", "S#8902", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7093", "S#8903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7060", "S#8904", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7080", "S#8905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7100", "S#8906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7101", "S#8907", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7102", "S#8908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7096", "S#8909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7103", "S#8910", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7104", "S#8911", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7105", "S#8912", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7106", "S#8913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7065", "S#8842", 1, 0, false);
        new $f7065$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7108", "S#8914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7109", "S#8915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7110", "S#8916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7111", "S#8917", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7112", "S#8918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7113", "S#8919", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7114", "S#8920", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7115", "S#8921", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7116", "S#8922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7097", "S#8923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7098", "S#8924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7118", "S#8925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7094", "S#8926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7119", "S#8927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7120", "S#8928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7121", "S#8929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7122", "S#8930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7123", "S#8931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7061", "S#8932", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7107", "S#8933", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7117", "S#8934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7124", "S#8935", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7126", "S#8832", 1, 0, false);
        new $f7126$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7127", "S#8936", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7128", "S#8937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7129", "S#8938", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7130", "S#8939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7131", "S#8940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7132", "S#8941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7133", "S#8942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7134", "S#8943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7135", "S#8944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7136", "S#8945", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7137", "S#8946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7138", "S#8947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7139", "S#8948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7140", "S#8949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7141", "S#8950", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7142", "S#8951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7143", "S#8952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7125", "S#8953", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7147", "S#8954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7148", "S#8955", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7150", "S#8956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7151", "S#8957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7153", "S#8835", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7154", "S#8958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7155", "S#8834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7156", "S#8959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7146", "S#8833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7145", "S#8960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7157", "S#8961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7158", "S#8836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7162", "S#8962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7163", "S#2037", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7164", "S#8963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7144", "S#8964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7152", "S#8965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7159", "S#8966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7161", "S#8967", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7160", "S#8968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7165", "S#8969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7149", "S#8970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7166", "S#8971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7071", "S#8845", 1, 0, false);
        new $f7071$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7167", "S#8972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7168", "S#8973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7169", "S#8974", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7170", "S#8975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7171", "S#8976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7172", "S#8977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7173", "S#8978", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7174", "S#8979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7175", "S#8980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7176", "S#8981", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7177", "S#8982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7178", "S#8983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7179", "S#8984", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7180", "S#8985", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7181", "S#8986", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7182", "S#8987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7183", "S#8988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7184", "S#8989", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7185", "S#8990", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7186", "S#8991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7187", "S#8992", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7188", "S#8993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7189", "S#8994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7190", "S#8995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7191", "S#8996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7192", "S#8997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7193", "S#8998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7194", "S#8999", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7195", "S#9000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7196", "S#9001", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7198", "S#9002", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7200", "S#9003", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7202", "S#9004", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7204", "S#9005", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7206", "S#9006", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7070", "S#9007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7208", "S#9008", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7068", "S#9009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7197", "S#9010", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7073", "S#9011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7207", "S#9012", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7209", "S#9013", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7210", "S#9014", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7211", "S#9015", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7212", "S#9016", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7213", "S#9017", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7214", "S#9018", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7215", "S#9019", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7216", "S#9020", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7217", "S#9021", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7218", "S#9022", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7219", "S#9023", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7220", "S#9024", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7221", "S#9025", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7222", "S#9026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7099", "S#9027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7064", "S#9028", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7224", "S#9029", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7226", "GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7225", "S#9030", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7227", "S#9031");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7228", "SET-SDBC-DB2-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7229", "S#9032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7230", "SET-SDBC-SYBASE-IQ-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7231", "S#9033", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7223", "S#9034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7232", "S#9035", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7234", "S#9036", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7233", "S#9037", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7235", "S#9038", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7199", "S#9039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7201", "S#9040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7203", "S#9041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7205", "S#9042", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7236", "S#9043");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7237", "S#9044");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7238", "S#9045");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7239", "S#9046");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7240", "S#9047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7241", "S#9048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7242", "S#9049", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7243", "S#9050");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7244", "S#9051");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0099", "f7245", "S#9052");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7246", "S#9053", 4, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7247", "S#9054", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7249", "S#9055", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7248", "S#9056", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0099", "f7250", "S#9057", 3, 5, false);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7252() {
        module0099.$g1266$ = SubLFiles.deflexical("S#9058", module0073.f5143((SubLObject)(module0099.$ic0$.isSymbol() ? Symbols.symbol_value((SubLObject)module0099.$ic0$) : module0099.$ic0$), (SubLObject)module0099.$ic1$, (SubLObject)(module0099.$ic2$.isSymbol() ? Symbols.symbol_value((SubLObject)module0099.$ic2$) : module0099.$ic2$), (SubLObject)module0099.$ic3$, (SubLObject)module0099.UNPROVIDED));
        module0099.$g1267$ = SubLFiles.deflexical("S#9059", module0073.f5143((SubLObject)(module0099.$ic4$.isSymbol() ? Symbols.symbol_value((SubLObject)module0099.$ic4$) : module0099.$ic4$), (SubLObject)module0099.$ic5$, (SubLObject)(module0099.$ic2$.isSymbol() ? Symbols.symbol_value((SubLObject)module0099.$ic2$) : module0099.$ic2$), (SubLObject)module0099.$ic3$, (SubLObject)module0099.UNPROVIDED));
        module0099.$g1268$ = SubLFiles.deflexical("S#9060", module0073.f5143((SubLObject)(module0099.$ic6$.isSymbol() ? Symbols.symbol_value((SubLObject)module0099.$ic6$) : module0099.$ic6$), (SubLObject)module0099.$ic7$, (SubLObject)(module0099.$ic8$.isSymbol() ? Symbols.symbol_value((SubLObject)module0099.$ic8$) : module0099.$ic8$), (SubLObject)module0099.$ic3$, (SubLObject)module0099.UNPROVIDED));
        module0099.$g1269$ = SubLFiles.deflexical("S#9061", (SubLObject)module0099.$ic9$);
        module0099.$g1270$ = SubLFiles.deflexical("S#9062", (SubLObject)module0099.$ic10$);
        module0099.$g1271$ = SubLFiles.deflexical("S#9063", (SubLObject)module0099.FIVE_INTEGER);
        module0099.$g1272$ = SubLFiles.deflexical("S#9064", (SubLObject)module0099.$ic11$);
        module0099.$g1273$ = SubLFiles.defparameter("S#9065", (SubLObject)module0099.$ic12$);
        module0099.$g1274$ = SubLFiles.deflexical("S#9066", (SubLObject)module0099.ZERO_INTEGER);
        module0099.$g1275$ = SubLFiles.deflexical("S#9067", (SubLObject)module0099.ONE_INTEGER);
        module0099.$g1276$ = SubLFiles.deflexical("S#9068", (SubLObject)module0099.TWO_INTEGER);
        module0099.$g1277$ = SubLFiles.deflexical("S#9069", (SubLObject)module0099.THREE_INTEGER);
        module0099.$g1278$ = SubLFiles.deflexical("S#9070", (SubLObject)module0099.FOUR_INTEGER);
        module0099.$g1279$ = SubLFiles.deflexical("S#9071", (SubLObject)module0099.FIVE_INTEGER);
        module0099.$g1280$ = SubLFiles.deflexical("S#9072", (SubLObject)module0099.SIX_INTEGER);
        module0099.$g1281$ = SubLFiles.deflexical("S#9073", (SubLObject)module0099.SEVEN_INTEGER);
        module0099.$g1282$ = SubLFiles.deflexical("S#9074", (SubLObject)module0099.EIGHT_INTEGER);
        module0099.$g1283$ = SubLFiles.deflexical("S#9075", (SubLObject)module0099.NINE_INTEGER);
        module0099.$g1284$ = SubLFiles.deflexical("S#9076", (SubLObject)module0099.TEN_INTEGER);
        module0099.$g1285$ = SubLFiles.deflexical("S#9077", (SubLObject)module0099.ELEVEN_INTEGER);
        module0099.$g1286$ = SubLFiles.deflexical("S#9078", (SubLObject)module0099.TWELVE_INTEGER);
        module0099.$g1287$ = SubLFiles.deflexical("S#9079", (SubLObject)module0099.THIRTEEN_INTEGER);
        module0099.$g1288$ = SubLFiles.deflexical("S#9080", (SubLObject)module0099.FOURTEEN_INTEGER);
        module0099.$g1289$ = SubLFiles.deflexical("S#9081", (SubLObject)module0099.FIFTEEN_INTEGER);
        module0099.$g1290$ = SubLFiles.deflexical("S#9082", (SubLObject)module0099.SIXTEEN_INTEGER);
        module0099.$g1291$ = SubLFiles.deflexical("S#9083", (SubLObject)module0099.SEVENTEEN_INTEGER);
        module0099.$g1292$ = SubLFiles.deflexical("S#9084", (SubLObject)module0099.EIGHTEEN_INTEGER);
        module0099.$g1293$ = SubLFiles.deflexical("S#9085", (SubLObject)module0099.NINETEEN_INTEGER);
        module0099.$g1294$ = SubLFiles.deflexical("S#9086", (SubLObject)module0099.TWENTY_INTEGER);
        module0099.$g1295$ = SubLFiles.deflexical("S#9087", (SubLObject)module0099.$ic13$);
        module0099.$g1296$ = SubLFiles.deflexical("S#9088", (SubLObject)module0099.$ic14$);
        module0099.$g1297$ = SubLFiles.deflexical("S#9089", (SubLObject)module0099.$ic15$);
        module0099.$g1298$ = SubLFiles.deflexical("S#9090", (SubLObject)module0099.$ic16$);
        module0099.$g1299$ = SubLFiles.deflexical("S#9091", (SubLObject)module0099.$ic17$);
        module0099.$g1300$ = SubLFiles.deflexical("S#9092", (SubLObject)module0099.$ic18$);
        module0099.$g1301$ = SubLFiles.deflexical("S#9093", (SubLObject)module0099.$ic19$);
        module0099.$g1302$ = SubLFiles.deflexical("S#9094", (SubLObject)module0099.$ic20$);
        module0099.$g1303$ = SubLFiles.deflexical("S#9095", (SubLObject)module0099.$ic21$);
        module0099.$g1304$ = SubLFiles.deflexical("S#9096", (SubLObject)module0099.$ic22$);
        module0099.$g1305$ = SubLFiles.deflexical("S#9097", (SubLObject)module0099.$ic23$);
        module0099.$g1306$ = SubLFiles.deflexical("S#9098", (SubLObject)module0099.$ic24$);
        module0099.$g1307$ = SubLFiles.deflexical("S#9099", (SubLObject)module0099.$ic25$);
        module0099.$g1308$ = SubLFiles.deflexical("S#9100", (SubLObject)module0099.ZERO_INTEGER);
        module0099.$g1309$ = SubLFiles.deflexical("S#9101", (SubLObject)module0099.ONE_INTEGER);
        module0099.$g1310$ = SubLFiles.deflexical("S#9102", (SubLObject)module0099.TWO_INTEGER);
        module0099.$g1311$ = SubLFiles.deflexical("S#9103", (SubLObject)module0099.THREE_INTEGER);
        module0099.$g1312$ = SubLFiles.deflexical("S#9104", (SubLObject)module0099.FOUR_INTEGER);
        module0099.$g1313$ = SubLFiles.deflexical("S#9105", (SubLObject)module0099.FIVE_INTEGER);
        module0099.$g1314$ = SubLFiles.deflexical("S#9106", (SubLObject)module0099.SIX_INTEGER);
        module0099.$g1315$ = SubLFiles.deflexical("S#9107", (SubLObject)module0099.SEVEN_INTEGER);
        module0099.$g1316$ = SubLFiles.deflexical("S#9108", (SubLObject)module0099.MINUS_ONE_INTEGER);
        module0099.$g1317$ = SubLFiles.deflexical("S#9109", (SubLObject)module0099.$ic26$);
        module0099.$g1318$ = SubLFiles.deflexical("S#9110", (SubLObject)module0099.$ic27$);
        module0099.$g1319$ = SubLFiles.deflexical("S#9111", (SubLObject)module0099.$ic28$);
        module0099.$g1320$ = SubLFiles.deflexical("S#9112", (SubLObject)module0099.$ic29$);
        module0099.$g1321$ = SubLFiles.deflexical("S#9113", (SubLObject)module0099.$ic30$);
        module0099.$g1322$ = SubLFiles.deflexical("S#9114", (SubLObject)module0099.$ic31$);
        module0099.$g1323$ = SubLFiles.deflexical("S#9115", (SubLObject)module0099.$ic32$);
        module0099.$g1324$ = SubLFiles.defconstant("S#9116", (SubLObject)module0099.$ic37$);
        module0099.$g1325$ = SubLFiles.defconstant("S#9117", (SubLObject)module0099.$ic109$);
        module0099.$g1326$ = SubLFiles.defparameter("S#9118", (SubLObject)module0099.$ic127$);
        module0099.$g1327$ = SubLFiles.defconstant("S#9119", (SubLObject)module0099.$ic142$);
        module0099.$g1328$ = SubLFiles.defparameter("S#9120", (SubLObject)ConsesLow.list(reader.bq_cons(module0099.$g1316$.getGlobalValue(), (SubLObject)module0099.$ic167$), reader.bq_cons(module0099.$g1317$.getGlobalValue(), (SubLObject)module0099.$ic168$), reader.bq_cons(module0099.$g1318$.getGlobalValue(), (SubLObject)module0099.$ic169$), reader.bq_cons(module0099.$g1319$.getGlobalValue(), (SubLObject)module0099.$ic170$), reader.bq_cons(module0099.$g1322$.getGlobalValue(), (SubLObject)module0099.$ic171$), reader.bq_cons(module0099.$g1321$.getGlobalValue(), (SubLObject)module0099.$ic172$), reader.bq_cons(module0099.$g1323$.getGlobalValue(), (SubLObject)module0099.$ic173$)));
        module0099.$g1329$ = SubLFiles.defconstant("S#9121", (SubLObject)module0099.$ic174$);
        module0099.$g1330$ = SubLFiles.defconstant("S#9122", (SubLObject)module0099.$ic221$);
        module0099.$g1331$ = SubLFiles.deflexical("S#9123", (module0099.NIL != Symbols.boundp((SubLObject)module0099.$ic285$)) ? module0099.$g1331$.getGlobalValue() : module0067.f4880((SubLObject)module0099.EQUAL, (SubLObject)module0099.UNPROVIDED));
        module0099.$g1332$ = SubLFiles.deflexical("*SDBC-DB2-PORT*", (SubLObject)((module0099.NIL != Symbols.boundp((SubLObject)module0099.$ic331$)) ? module0099.$g1332$.getGlobalValue() : module0099.$ic332$));
        module0099.$g1333$ = SubLFiles.deflexical("*SDBC-SYBASE-IQ-PORT*", (SubLObject)((module0099.NIL != Symbols.boundp((SubLObject)module0099.$ic338$)) ? module0099.$g1333$.getGlobalValue() : module0099.$ic339$));
        module0099.$g1334$ = SubLFiles.deflexical("S#9124", (SubLObject)module0099.$ic17$);
        return (SubLObject)module0099.NIL;
    }
    
    public static SubLObject f7253() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0099.$g1324$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic44$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0099.$ic45$);
        Structures.def_csetf((SubLObject)module0099.$ic46$, (SubLObject)module0099.$ic47$);
        Structures.def_csetf((SubLObject)module0099.$ic48$, (SubLObject)module0099.$ic49$);
        Structures.def_csetf((SubLObject)module0099.$ic50$, (SubLObject)module0099.$ic51$);
        Structures.def_csetf((SubLObject)module0099.$ic52$, (SubLObject)module0099.$ic53$);
        Structures.def_csetf((SubLObject)module0099.$ic54$, (SubLObject)module0099.$ic55$);
        Structures.def_csetf((SubLObject)module0099.$ic56$, (SubLObject)module0099.$ic57$);
        Structures.def_csetf((SubLObject)module0099.$ic58$, (SubLObject)module0099.$ic59$);
        Structures.def_csetf((SubLObject)module0099.$ic60$, (SubLObject)module0099.$ic61$);
        Structures.def_csetf((SubLObject)module0099.$ic62$, (SubLObject)module0099.$ic63$);
        Structures.def_csetf((SubLObject)module0099.$ic64$, (SubLObject)module0099.$ic65$);
        Structures.def_csetf((SubLObject)module0099.$ic66$, (SubLObject)module0099.$ic67$);
        Structures.def_csetf((SubLObject)module0099.$ic68$, (SubLObject)module0099.$ic69$);
        Equality.identity((SubLObject)module0099.$ic37$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0099.$g1324$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic87$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0099.$g1325$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic116$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0099.$ic117$);
        Structures.def_csetf((SubLObject)module0099.$ic118$, (SubLObject)module0099.$ic119$);
        Structures.def_csetf((SubLObject)module0099.$ic120$, (SubLObject)module0099.$ic121$);
        Equality.identity((SubLObject)module0099.$ic109$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0099.$g1325$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic125$));
        module0002.f50((SubLObject)module0099.$ic138$, (SubLObject)module0099.$ic139$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0099.$g1327$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic149$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0099.$ic150$);
        Structures.def_csetf((SubLObject)module0099.$ic151$, (SubLObject)module0099.$ic152$);
        Structures.def_csetf((SubLObject)module0099.$ic153$, (SubLObject)module0099.$ic154$);
        Structures.def_csetf((SubLObject)module0099.$ic155$, (SubLObject)module0099.$ic156$);
        Equality.identity((SubLObject)module0099.$ic142$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0099.$g1327$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic161$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0099.$g1329$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic181$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0099.$ic182$);
        Structures.def_csetf((SubLObject)module0099.$ic183$, (SubLObject)module0099.$ic184$);
        Structures.def_csetf((SubLObject)module0099.$ic185$, (SubLObject)module0099.$ic186$);
        Structures.def_csetf((SubLObject)module0099.$ic187$, (SubLObject)module0099.$ic188$);
        Structures.def_csetf((SubLObject)module0099.$ic189$, (SubLObject)module0099.$ic190$);
        Structures.def_csetf((SubLObject)module0099.$ic191$, (SubLObject)module0099.$ic192$);
        Structures.def_csetf((SubLObject)module0099.$ic193$, (SubLObject)module0099.$ic194$);
        Structures.def_csetf((SubLObject)module0099.$ic195$, (SubLObject)module0099.$ic196$);
        Equality.identity((SubLObject)module0099.$ic174$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0099.$g1329$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic205$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0099.$g1330$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic227$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0099.$ic228$);
        Structures.def_csetf((SubLObject)module0099.$ic229$, (SubLObject)module0099.$ic230$);
        Structures.def_csetf((SubLObject)module0099.$ic231$, (SubLObject)module0099.$ic232$);
        Structures.def_csetf((SubLObject)module0099.$ic233$, (SubLObject)module0099.$ic234$);
        Structures.def_csetf((SubLObject)module0099.$ic235$, (SubLObject)module0099.$ic236$);
        Structures.def_csetf((SubLObject)module0099.$ic237$, (SubLObject)module0099.$ic238$);
        Structures.def_csetf((SubLObject)module0099.$ic239$, (SubLObject)module0099.$ic240$);
        Equality.identity((SubLObject)module0099.$ic221$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0099.$g1330$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0099.$ic246$));
        module0002.f50((SubLObject)module0099.$ic254$, (SubLObject)module0099.$ic139$);
        module0027.f1449((SubLObject)module0099.$ic276$, (SubLObject)ConsesLow.list(new SubLObject[] { module0099.$ic277$, Symbols.symbol_function((SubLObject)module0099.$ic278$), module0099.$ic279$, module0099.NIL, module0099.$ic280$, module0099.NIL, module0099.$ic281$, module0099.$ic282$, module0099.$ic283$, module0099.T }), (SubLObject)module0099.$ic284$);
        module0003.f57((SubLObject)module0099.$ic285$);
        module0002.f38((SubLObject)module0099.$ic292$);
        f7224((SubLObject)module0099.$ic10$, (SubLObject)module0099.$ic302$, (SubLObject)module0099.$ic303$, (SubLObject)module0099.$ic304$, (SubLObject)module0099.$ic305$);
        f7224((SubLObject)module0099.$ic306$, (SubLObject)module0099.$ic302$, (SubLObject)module0099.$ic307$, (SubLObject)module0099.$ic304$, (SubLObject)module0099.$ic308$);
        f7224((SubLObject)module0099.$ic309$, (SubLObject)module0099.$ic310$, (SubLObject)module0099.NIL, (SubLObject)module0099.NIL, (SubLObject)module0099.$ic311$);
        f7224((SubLObject)module0099.$ic312$, (SubLObject)module0099.$ic313$, (SubLObject)module0099.$ic314$, (SubLObject)module0099.$ic315$, (SubLObject)module0099.$ic316$);
        f7224((SubLObject)module0099.$ic317$, (SubLObject)module0099.$ic318$, (SubLObject)module0099.$ic314$, (SubLObject)module0099.$ic315$, (SubLObject)module0099.$ic316$);
        f7224((SubLObject)module0099.$ic319$, (SubLObject)module0099.$ic320$, (SubLObject)module0099.$ic321$, (SubLObject)module0099.$ic315$, (SubLObject)module0099.NIL);
        f7224((SubLObject)module0099.$ic322$, (SubLObject)module0099.$ic323$, (SubLObject)module0099.$ic324$, (SubLObject)module0099.$ic315$, (SubLObject)module0099.$ic325$);
        f7224((SubLObject)module0099.$ic326$, (SubLObject)module0099.$ic302$, (SubLObject)module0099.$ic307$, (SubLObject)module0099.$ic315$, (SubLObject)module0099.$ic327$);
        f7224((SubLObject)module0099.$ic328$, (SubLObject)module0099.$ic302$, (SubLObject)module0099.$ic329$, (SubLObject)module0099.$ic304$, (SubLObject)module0099.$ic330$);
        module0002.f38((SubLObject)module0099.$ic331$);
        module0003.f57((SubLObject)module0099.$ic331$);
        module0002.f38((SubLObject)module0099.$ic333$);
        f7224((SubLObject)module0099.$ic334$, (SubLObject)module0099.$ic335$, (SubLObject)module0099.$ic307$, (SubLObject)module0099.$ic336$, (SubLObject)module0099.$ic337$);
        module0002.f38((SubLObject)module0099.$ic338$);
        module0003.f57((SubLObject)module0099.$ic338$);
        module0002.f38((SubLObject)module0099.$ic340$);
        f7224((SubLObject)module0099.$ic341$, (SubLObject)module0099.$ic342$, (SubLObject)module0099.$ic324$, (SubLObject)module0099.$ic343$, (SubLObject)module0099.$ic344$);
        module0002.f50((SubLObject)module0099.$ic393$, (SubLObject)module0099.$ic139$);
        module0002.f50((SubLObject)module0099.$ic394$, (SubLObject)module0099.$ic139$);
        module0002.f50((SubLObject)module0099.$ic396$, (SubLObject)module0099.$ic139$);
        return (SubLObject)module0099.NIL;
    }
    
    public void declareFunctions() {
        f7251();
    }
    
    public void initializeVariables() {
        f7252();
    }
    
    public void runTopLevelForms() {
        f7253();
    }
    
    static {
        me = (SubLFile)new module0099();
        module0099.$g1266$ = null;
        module0099.$g1267$ = null;
        module0099.$g1268$ = null;
        module0099.$g1269$ = null;
        module0099.$g1270$ = null;
        module0099.$g1271$ = null;
        module0099.$g1272$ = null;
        module0099.$g1273$ = null;
        module0099.$g1274$ = null;
        module0099.$g1275$ = null;
        module0099.$g1276$ = null;
        module0099.$g1277$ = null;
        module0099.$g1278$ = null;
        module0099.$g1279$ = null;
        module0099.$g1280$ = null;
        module0099.$g1281$ = null;
        module0099.$g1282$ = null;
        module0099.$g1283$ = null;
        module0099.$g1284$ = null;
        module0099.$g1285$ = null;
        module0099.$g1286$ = null;
        module0099.$g1287$ = null;
        module0099.$g1288$ = null;
        module0099.$g1289$ = null;
        module0099.$g1290$ = null;
        module0099.$g1291$ = null;
        module0099.$g1292$ = null;
        module0099.$g1293$ = null;
        module0099.$g1294$ = null;
        module0099.$g1295$ = null;
        module0099.$g1296$ = null;
        module0099.$g1297$ = null;
        module0099.$g1298$ = null;
        module0099.$g1299$ = null;
        module0099.$g1300$ = null;
        module0099.$g1301$ = null;
        module0099.$g1302$ = null;
        module0099.$g1303$ = null;
        module0099.$g1304$ = null;
        module0099.$g1305$ = null;
        module0099.$g1306$ = null;
        module0099.$g1307$ = null;
        module0099.$g1308$ = null;
        module0099.$g1309$ = null;
        module0099.$g1310$ = null;
        module0099.$g1311$ = null;
        module0099.$g1312$ = null;
        module0099.$g1313$ = null;
        module0099.$g1314$ = null;
        module0099.$g1315$ = null;
        module0099.$g1316$ = null;
        module0099.$g1317$ = null;
        module0099.$g1318$ = null;
        module0099.$g1319$ = null;
        module0099.$g1320$ = null;
        module0099.$g1321$ = null;
        module0099.$g1322$ = null;
        module0099.$g1323$ = null;
        module0099.$g1324$ = null;
        module0099.$g1325$ = null;
        module0099.$g1326$ = null;
        module0099.$g1327$ = null;
        module0099.$g1328$ = null;
        module0099.$g1329$ = null;
        module0099.$g1330$ = null;
        module0099.$g1331$ = null;
        module0099.$g1332$ = null;
        module0099.$g1333$ = null;
        module0099.$g1334$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.sdbc.dbms-server"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#9058", "CYC");
        $ic2$ = SubLObjectFactory.makeString("db-server.cyc.com");
        $ic3$ = SubLObjectFactory.makeKeyword("LEXICAL");
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.sdbc.proxy-server"));
        $ic5$ = SubLObjectFactory.makeSymbol("S#9059", "CYC");
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.sdbc.sql-port"));
        $ic7$ = SubLObjectFactory.makeSymbol("S#9060", "CYC");
        $ic8$ = SubLObjectFactory.makeInteger(9999);
        $ic9$ = SubLObjectFactory.makeString("jdbc");
        $ic10$ = SubLObjectFactory.makeString("postgresql");
        $ic11$ = SubLObjectFactory.makeString("CONNECTION");
        $ic12$ = SubLObjectFactory.makeInteger(1000);
        $ic13$ = SubLObjectFactory.makeInteger(21);
        $ic14$ = SubLObjectFactory.makeInteger(22);
        $ic15$ = SubLObjectFactory.makeInteger(23);
        $ic16$ = SubLObjectFactory.makeInteger(24);
        $ic17$ = SubLObjectFactory.makeInteger(25);
        $ic18$ = SubLObjectFactory.makeInteger(26);
        $ic19$ = SubLObjectFactory.makeInteger(27);
        $ic20$ = SubLObjectFactory.makeInteger(28);
        $ic21$ = SubLObjectFactory.makeInteger(29);
        $ic22$ = SubLObjectFactory.makeInteger(30);
        $ic23$ = SubLObjectFactory.makeInteger(31);
        $ic24$ = SubLObjectFactory.makeInteger(32);
        $ic25$ = SubLObjectFactory.makeInteger(33);
        $ic26$ = SubLObjectFactory.makeInteger(-2);
        $ic27$ = SubLObjectFactory.makeInteger(-3);
        $ic28$ = SubLObjectFactory.makeInteger(-4);
        $ic29$ = SubLObjectFactory.makeInteger(-5);
        $ic30$ = SubLObjectFactory.makeInteger(-6);
        $ic31$ = SubLObjectFactory.makeInteger(-7);
        $ic32$ = SubLObjectFactory.makeInteger(-8);
        $ic33$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic34$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic35$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic37$ = SubLObjectFactory.makeSymbol("S#8837", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#8838", "CYC");
        $ic39$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#9125", "CYC"), SubLObjectFactory.makeSymbol("S#9126", "CYC"), SubLObjectFactory.makeSymbol("S#9127", "CYC"), SubLObjectFactory.makeSymbol("S#58", "CYC"), SubLObjectFactory.makeSymbol("S#9128", "CYC"), SubLObjectFactory.makeSymbol("S#9129", "CYC"), SubLObjectFactory.makeSymbol("S#672", "CYC"), SubLObjectFactory.makeSymbol("S#9130", "CYC"), SubLObjectFactory.makeSymbol("S#9131", "CYC"), SubLObjectFactory.makeSymbol("S#9132", "CYC"), SubLObjectFactory.makeSymbol("S#9133", "CYC"), SubLObjectFactory.makeSymbol("S#9134", "CYC") });
        $ic40$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("DB"), SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeKeyword("CHANNEL"), SubLObjectFactory.makeKeyword("STATEMENTS"), SubLObjectFactory.makeKeyword("LOCK"), SubLObjectFactory.makeKeyword("SUBPROTOCOL"), SubLObjectFactory.makeKeyword("PROXY-SERVER"), SubLObjectFactory.makeKeyword("ERROR-HANDLING"), SubLObjectFactory.makeKeyword("TICKETS"), SubLObjectFactory.makeKeyword("MAILMAN") });
        $ic41$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#8848", "CYC"), SubLObjectFactory.makeSymbol("S#8849", "CYC"), SubLObjectFactory.makeSymbol("S#8850", "CYC"), SubLObjectFactory.makeSymbol("S#8851", "CYC"), SubLObjectFactory.makeSymbol("S#8852", "CYC"), SubLObjectFactory.makeSymbol("S#8853", "CYC"), SubLObjectFactory.makeSymbol("S#8854", "CYC"), SubLObjectFactory.makeSymbol("S#8855", "CYC"), SubLObjectFactory.makeSymbol("S#8856", "CYC"), SubLObjectFactory.makeSymbol("S#8857", "CYC"), SubLObjectFactory.makeSymbol("S#8858", "CYC"), SubLObjectFactory.makeSymbol("S#8859", "CYC") });
        $ic42$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#8860", "CYC"), SubLObjectFactory.makeSymbol("S#8861", "CYC"), SubLObjectFactory.makeSymbol("S#8862", "CYC"), SubLObjectFactory.makeSymbol("S#8863", "CYC"), SubLObjectFactory.makeSymbol("S#8864", "CYC"), SubLObjectFactory.makeSymbol("S#8865", "CYC"), SubLObjectFactory.makeSymbol("S#8866", "CYC"), SubLObjectFactory.makeSymbol("S#8867", "CYC"), SubLObjectFactory.makeSymbol("S#8868", "CYC"), SubLObjectFactory.makeSymbol("S#8869", "CYC"), SubLObjectFactory.makeSymbol("S#8870", "CYC"), SubLObjectFactory.makeSymbol("S#8871", "CYC") });
        $ic43$ = SubLObjectFactory.makeSymbol("S#8875", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("S#8847", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8838", "CYC"));
        $ic46$ = SubLObjectFactory.makeSymbol("S#8848", "CYC");
        $ic47$ = SubLObjectFactory.makeSymbol("S#8860", "CYC");
        $ic48$ = SubLObjectFactory.makeSymbol("S#8849", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#8861", "CYC");
        $ic50$ = SubLObjectFactory.makeSymbol("S#8850", "CYC");
        $ic51$ = SubLObjectFactory.makeSymbol("S#8862", "CYC");
        $ic52$ = SubLObjectFactory.makeSymbol("S#8851", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#8863", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#8852", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#8864", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("S#8853", "CYC");
        $ic57$ = SubLObjectFactory.makeSymbol("S#8865", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#8854", "CYC");
        $ic59$ = SubLObjectFactory.makeSymbol("S#8866", "CYC");
        $ic60$ = SubLObjectFactory.makeSymbol("S#8855", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#8867", "CYC");
        $ic62$ = SubLObjectFactory.makeSymbol("S#8856", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#8868", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#8857", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("S#8869", "CYC");
        $ic66$ = SubLObjectFactory.makeSymbol("S#8858", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#8870", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#8859", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#8871", "CYC");
        $ic70$ = SubLObjectFactory.makeKeyword("DB");
        $ic71$ = SubLObjectFactory.makeKeyword("USER");
        $ic72$ = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $ic73$ = SubLObjectFactory.makeKeyword("PORT");
        $ic74$ = SubLObjectFactory.makeKeyword("CHANNEL");
        $ic75$ = SubLObjectFactory.makeKeyword("STATEMENTS");
        $ic76$ = SubLObjectFactory.makeKeyword("LOCK");
        $ic77$ = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $ic78$ = SubLObjectFactory.makeKeyword("PROXY-SERVER");
        $ic79$ = SubLObjectFactory.makeKeyword("ERROR-HANDLING");
        $ic80$ = SubLObjectFactory.makeKeyword("TICKETS");
        $ic81$ = SubLObjectFactory.makeKeyword("MAILMAN");
        $ic82$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic83$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic84$ = SubLObjectFactory.makeSymbol("S#8872", "CYC");
        $ic85$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic86$ = SubLObjectFactory.makeKeyword("END");
        $ic87$ = SubLObjectFactory.makeSymbol("S#8874", "CYC");
        $ic88$ = SubLObjectFactory.makeString("#<SQL-CONNECTION ");
        $ic89$ = SubLObjectFactory.makeString("closed ");
        $ic90$ = SubLObjectFactory.makeString("to ");
        $ic91$ = SubLObjectFactory.makeString(" [");
        $ic92$ = SubLObjectFactory.makeString("/");
        $ic93$ = SubLObjectFactory.makeString("]>");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9058", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#9135", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9130", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9062", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9060", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#59", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9063", "CYC")));
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DBMS-SERVER"), (SubLObject)SubLObjectFactory.makeKeyword("DBMS-PORT"), (SubLObject)SubLObjectFactory.makeKeyword("SUBPROTOCOL"), (SubLObject)SubLObjectFactory.makeKeyword("PROXY-SERVER"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"));
        $ic96$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic97$ = SubLObjectFactory.makeKeyword("DBMS-PORT");
        $ic98$ = SubLObjectFactory.makeKeyword("TIMEOUT");
        $ic99$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic100$ = SubLObjectFactory.makeSymbol("S#65", "CYC");
        $ic101$ = SubLObjectFactory.makeString("SQL connection lock");
        $ic102$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic103$ = SubLObjectFactory.makeString("Trying to open from a null sqlc channel.");
        $ic104$ = SubLObjectFactory.makeString("timeout");
        $ic105$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#8878", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic108$ = SubLObjectFactory.makeSymbol("S#8905", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#8839", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#8840", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5854", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3267", "CYC"));
        $ic112$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEMAPHORE"), (SubLObject)SubLObjectFactory.makeKeyword("RESULT"));
        $ic113$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8890", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8891", "CYC"));
        $ic114$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8892", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8893", "CYC"));
        $ic115$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic116$ = SubLObjectFactory.makeSymbol("S#8889", "CYC");
        $ic117$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8840", "CYC"));
        $ic118$ = SubLObjectFactory.makeSymbol("S#8890", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#8892", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#8891", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#8893", "CYC");
        $ic122$ = SubLObjectFactory.makeKeyword("SEMAPHORE");
        $ic123$ = SubLObjectFactory.makeKeyword("RESULT");
        $ic124$ = SubLObjectFactory.makeSymbol("S#8894", "CYC");
        $ic125$ = SubLObjectFactory.makeSymbol("S#8896", "CYC");
        $ic126$ = SubLObjectFactory.makeString("SQL Request");
        $ic127$ = SubLObjectFactory.makeInteger(212);
        $ic128$ = SubLObjectFactory.makeString("Timed out after ");
        $ic129$ = SubLObjectFactory.makeString(" seconds retrieving SQL ticket");
        $ic130$ = SubLObjectFactory.makeString("SQL Mailman for ");
        $ic131$ = SubLObjectFactory.makeSymbol("S#8900", "CYC");
        $ic132$ = SubLObjectFactory.makeString("Implementation error: no ticket for result ~a");
        $ic133$ = SubLObjectFactory.makeString("Trying to read from a null sqlc channel.");
        $ic134$ = SubLObjectFactory.makeKeyword("THROW");
        $ic135$ = SubLObjectFactory.makeKeyword("WARN");
        $ic136$ = SubLObjectFactory.makeSymbol("S#9027", "CYC");
        $ic137$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRANSACTION-NONE"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSACTION-READ-COMMITTED"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSACTION-READ-UNCOMMITTED"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSACTION-REPEATABLE-READ"), (SubLObject)SubLObjectFactory.makeKeyword("TRANSACTION-SERIALIZABLE"));
        $ic138$ = SubLObjectFactory.makeSymbol("S#8906", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("S#9046", "CYC");
        $ic140$ = SubLObjectFactory.makeKeyword("STOP");
        $ic141$ = SubLObjectFactory.makeKeyword("NULL");
        $ic142$ = SubLObjectFactory.makeSymbol("S#8841", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol("S#8842", "CYC");
        $ic144$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1546", "CYC"));
        $ic145$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("CODE"));
        $ic146$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8914", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8915", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8916", "CYC"));
        $ic147$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8917", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8918", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8919", "CYC"));
        $ic148$ = SubLObjectFactory.makeSymbol("S#8933", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#8913", "CYC");
        $ic150$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8842", "CYC"));
        $ic151$ = SubLObjectFactory.makeSymbol("S#8914", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("S#8917", "CYC");
        $ic153$ = SubLObjectFactory.makeSymbol("S#8915", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("S#8918", "CYC");
        $ic155$ = SubLObjectFactory.makeSymbol("S#8916", "CYC");
        $ic156$ = SubLObjectFactory.makeSymbol("S#8919", "CYC");
        $ic157$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic158$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic159$ = SubLObjectFactory.makeKeyword("CODE");
        $ic160$ = SubLObjectFactory.makeSymbol("S#8920", "CYC");
        $ic161$ = SubLObjectFactory.makeSymbol("S#8922", "CYC");
        $ic162$ = SubLObjectFactory.makeString("~a");
        $ic163$ = SubLObjectFactory.makeString("SDBC ~a: ~a");
        $ic164$ = SubLObjectFactory.makeString("#<SDBC");
        $ic165$ = SubLObjectFactory.makeString("-ERROR: ");
        $ic166$ = SubLObjectFactory.makeString(">");
        $ic167$ = SubLObjectFactory.makeString("-IO");
        $ic168$ = SubLObjectFactory.makeString("-SQL");
        $ic169$ = SubLObjectFactory.makeString("");
        $ic170$ = SubLObjectFactory.makeString("-CLIENT");
        $ic171$ = SubLObjectFactory.makeString("-TRANSACTION");
        $ic172$ = SubLObjectFactory.makeString("-ROLLBACK");
        $ic173$ = SubLObjectFactory.makeString("-BATCH-UPDATE");
        $ic174$ = SubLObjectFactory.makeSymbol("S#8843", "CYC");
        $ic175$ = SubLObjectFactory.makeSymbol("S#8832", "CYC");
        $ic176$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1574", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5232", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9136", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#7544", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic177$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROWS"), (SubLObject)SubLObjectFactory.makeKeyword("CURRENT"), (SubLObject)SubLObjectFactory.makeKeyword("LAST"), (SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("CONNECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $ic178$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8936", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8937", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8938", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8939", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8940", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8941", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8942", "CYC"));
        $ic179$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8943", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8944", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8945", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8946", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8947", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8948", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8949", "CYC"));
        $ic180$ = SubLObjectFactory.makeSymbol("S#8953", "CYC");
        $ic181$ = SubLObjectFactory.makeSymbol("S#8935", "CYC");
        $ic182$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8832", "CYC"));
        $ic183$ = SubLObjectFactory.makeSymbol("S#8936", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("S#8943", "CYC");
        $ic185$ = SubLObjectFactory.makeSymbol("S#8937", "CYC");
        $ic186$ = SubLObjectFactory.makeSymbol("S#8944", "CYC");
        $ic187$ = SubLObjectFactory.makeSymbol("S#8938", "CYC");
        $ic188$ = SubLObjectFactory.makeSymbol("S#8945", "CYC");
        $ic189$ = SubLObjectFactory.makeSymbol("S#8939", "CYC");
        $ic190$ = SubLObjectFactory.makeSymbol("S#8946", "CYC");
        $ic191$ = SubLObjectFactory.makeSymbol("S#8940", "CYC");
        $ic192$ = SubLObjectFactory.makeSymbol("S#8947", "CYC");
        $ic193$ = SubLObjectFactory.makeSymbol("S#8941", "CYC");
        $ic194$ = SubLObjectFactory.makeSymbol("S#8948", "CYC");
        $ic195$ = SubLObjectFactory.makeSymbol("S#8942", "CYC");
        $ic196$ = SubLObjectFactory.makeSymbol("S#8949", "CYC");
        $ic197$ = SubLObjectFactory.makeKeyword("ROWS");
        $ic198$ = SubLObjectFactory.makeKeyword("CURRENT");
        $ic199$ = SubLObjectFactory.makeKeyword("LAST");
        $ic200$ = SubLObjectFactory.makeKeyword("START");
        $ic201$ = SubLObjectFactory.makeKeyword("CONNECTION");
        $ic202$ = SubLObjectFactory.makeKeyword("BLOCK-SIZE");
        $ic203$ = SubLObjectFactory.makeKeyword("ID");
        $ic204$ = SubLObjectFactory.makeSymbol("S#8950", "CYC");
        $ic205$ = SubLObjectFactory.makeSymbol("S#8952", "CYC");
        $ic206$ = SubLObjectFactory.makeString("#<");
        $ic207$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic208$ = SubLObjectFactory.makeString("(");
        $ic209$ = SubLObjectFactory.makeString(" row, ");
        $ic210$ = SubLObjectFactory.makeString(" rows, ");
        $ic211$ = SubLObjectFactory.makeString(" column)");
        $ic212$ = SubLObjectFactory.makeString(" columns)");
        $ic213$ = SubLObjectFactory.makeString("closed");
        $ic214$ = SubLObjectFactory.makeKeyword("BASE");
        $ic215$ = SubLObjectFactory.makeSymbol("S#8954", "CYC");
        $ic216$ = SubLObjectFactory.makeString("cursor not on valid row");
        $ic217$ = SubLObjectFactory.makeString("invalid column ~a");
        $ic218$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic219$ = SubLObjectFactory.makeSymbol("VECTORP");
        $ic220$ = SubLObjectFactory.makeString("invalid row ~a");
        $ic221$ = SubLObjectFactory.makeSymbol("S#8844", "CYC");
        $ic222$ = SubLObjectFactory.makeSymbol("S#8845", "CYC");
        $ic223$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9136", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9137", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9138", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9139", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9140", "CYC"));
        $ic224$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONNECTION"), (SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("SQL"), (SubLObject)SubLObjectFactory.makeKeyword("SETTINGS"), (SubLObject)SubLObjectFactory.makeKeyword("BATCH"), (SubLObject)SubLObjectFactory.makeKeyword("RS"));
        $ic225$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8972", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8973", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8974", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8975", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8976", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8977", "CYC"));
        $ic226$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8978", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8979", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8980", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8981", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8982", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8983", "CYC"));
        $ic227$ = SubLObjectFactory.makeSymbol("S#8971", "CYC");
        $ic228$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#8845", "CYC"));
        $ic229$ = SubLObjectFactory.makeSymbol("S#8972", "CYC");
        $ic230$ = SubLObjectFactory.makeSymbol("S#8978", "CYC");
        $ic231$ = SubLObjectFactory.makeSymbol("S#8973", "CYC");
        $ic232$ = SubLObjectFactory.makeSymbol("S#8979", "CYC");
        $ic233$ = SubLObjectFactory.makeSymbol("S#8974", "CYC");
        $ic234$ = SubLObjectFactory.makeSymbol("S#8980", "CYC");
        $ic235$ = SubLObjectFactory.makeSymbol("S#8975", "CYC");
        $ic236$ = SubLObjectFactory.makeSymbol("S#8981", "CYC");
        $ic237$ = SubLObjectFactory.makeSymbol("S#8976", "CYC");
        $ic238$ = SubLObjectFactory.makeSymbol("S#8982", "CYC");
        $ic239$ = SubLObjectFactory.makeSymbol("S#8977", "CYC");
        $ic240$ = SubLObjectFactory.makeSymbol("S#8983", "CYC");
        $ic241$ = SubLObjectFactory.makeKeyword("SQL");
        $ic242$ = SubLObjectFactory.makeKeyword("SETTINGS");
        $ic243$ = SubLObjectFactory.makeKeyword("BATCH");
        $ic244$ = SubLObjectFactory.makeKeyword("RS");
        $ic245$ = SubLObjectFactory.makeSymbol("S#8984", "CYC");
        $ic246$ = SubLObjectFactory.makeSymbol("S#8986", "CYC");
        $ic247$ = SubLObjectFactory.makeSymbol("S#8988", "CYC");
        $ic248$ = SubLObjectFactory.makeSymbol("S#8998", "CYC");
        $ic249$ = SubLObjectFactory.makeSymbol("S#2001", "CYC");
        $ic250$ = SubLObjectFactory.makeSymbol("S#9039", "CYC");
        $ic251$ = SubLObjectFactory.makeSymbol("S#9040", "CYC");
        $ic252$ = SubLObjectFactory.makeSymbol("S#9041", "CYC");
        $ic253$ = SubLObjectFactory.makeSymbol("S#9042", "CYC");
        $ic254$ = SubLObjectFactory.makeSymbol("S#9008", "CYC");
        $ic255$ = SubLObjectFactory.makeString("STMT");
        $ic256$ = SubLObjectFactory.makeString("RS");
        $ic257$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic258$ = SubLObjectFactory.makeSymbol("S#9014", "CYC");
        $ic259$ = SubLObjectFactory.makeString("SQLC error: ~A");
        $ic260$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TABLE-CAT"), SubLObjectFactory.makeKeyword("TABLE-SCHEM"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("TABLE-TYPE"), SubLObjectFactory.makeKeyword("REMARKS"), SubLObjectFactory.makeKeyword("TYPE-CAT"), SubLObjectFactory.makeKeyword("TYPE-SCHEM"), SubLObjectFactory.makeKeyword("TYPE-NAME"), SubLObjectFactory.makeKeyword("SELF-REFERENCING-COL-NAME"), SubLObjectFactory.makeKeyword("REF-GENERATION") });
        $ic261$ = SubLObjectFactory.makeSymbol("S#9016", "CYC");
        $ic262$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TABLE-CAT"), SubLObjectFactory.makeKeyword("TABLE-SCHEM"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("COLUMN-NAME"), SubLObjectFactory.makeKeyword("DATA-TYPE"), SubLObjectFactory.makeKeyword("TYPE-NAME"), SubLObjectFactory.makeKeyword("COLUMN-SIZE"), SubLObjectFactory.makeKeyword("BUFFER-LENGTH"), SubLObjectFactory.makeKeyword("DECIMAL-DIGITS"), SubLObjectFactory.makeKeyword("NUM-PREC-RADIX"), SubLObjectFactory.makeKeyword("NULLABLE"), SubLObjectFactory.makeKeyword("REMARKS"), SubLObjectFactory.makeKeyword("COLUMN-DEF"), SubLObjectFactory.makeKeyword("SQL-DATA-TYPE"), SubLObjectFactory.makeKeyword("SQL-DATETIME-SUB"), SubLObjectFactory.makeKeyword("CHAR-OCTET-LENGTH"), SubLObjectFactory.makeKeyword("ORDINAL-POSITION"), SubLObjectFactory.makeKeyword("IS-NULLABLE"), SubLObjectFactory.makeKeyword("SCOPE-CATLOG"), SubLObjectFactory.makeKeyword("SCOPE-SCHEMA"), SubLObjectFactory.makeKeyword("SCOPE-TABLE"), SubLObjectFactory.makeKeyword("SOURCE-DATA-TYPE") });
        $ic263$ = SubLObjectFactory.makeSymbol("S#9018", "CYC");
        $ic264$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TABLE-CAT"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE-SCHEM"), (SubLObject)SubLObjectFactory.makeKeyword("TABLE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COLUMN-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEY-SEQ"), (SubLObject)SubLObjectFactory.makeKeyword("PK-NAME"));
        $ic265$ = SubLObjectFactory.makeSymbol("S#9020", "CYC");
        $ic266$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PKTABLE-CAT"), SubLObjectFactory.makeKeyword("PKTABLE-SCHEM"), SubLObjectFactory.makeKeyword("PKTABLE-NAME"), SubLObjectFactory.makeKeyword("PKCOLUMN-NAME"), SubLObjectFactory.makeKeyword("FKTABLE-CAT"), SubLObjectFactory.makeKeyword("FKTABLE-SCHEM"), SubLObjectFactory.makeKeyword("FKTABLE-NAME"), SubLObjectFactory.makeKeyword("FKCOLUMN-NAME"), SubLObjectFactory.makeKeyword("KEY-SEQ"), SubLObjectFactory.makeKeyword("UPDATE-RULE"), SubLObjectFactory.makeKeyword("DELETE-RULE"), SubLObjectFactory.makeKeyword("FK-NAME"), SubLObjectFactory.makeKeyword("PK-NAME"), SubLObjectFactory.makeKeyword("DEFERRABILITY") });
        $ic267$ = SubLObjectFactory.makeSymbol("S#9022", "CYC");
        $ic268$ = SubLObjectFactory.makeSymbol("S#9024", "CYC");
        $ic269$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TABLE-CAT"), SubLObjectFactory.makeKeyword("TABLE-SCHEM"), SubLObjectFactory.makeKeyword("TABLE-NAME"), SubLObjectFactory.makeKeyword("NON-UNIQUE"), SubLObjectFactory.makeKeyword("INDEX-QUALIFIER"), SubLObjectFactory.makeKeyword("INDEX-NAME"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ORDINAL-POSITION"), SubLObjectFactory.makeKeyword("COLUMN-NAME"), SubLObjectFactory.makeKeyword("ASC-OR-DESC"), SubLObjectFactory.makeKeyword("CARDINALITY"), SubLObjectFactory.makeKeyword("PAGES"), SubLObjectFactory.makeKeyword("FILTER-CONDITION") });
        $ic270$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("THROW"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"));
        $ic271$ = SubLObjectFactory.makeString("com.cyc.");
        $ic272$ = SubLObjectFactory.makeString("~a:~a:~a");
        $ic273$ = SubLObjectFactory.makeKeyword("SUB-PROTOCOL");
        $ic274$ = SubLObjectFactory.makeKeyword("DATABASE");
        $ic275$ = SubLObjectFactory.makeKeyword("PASSWORD");
        $ic276$ = SubLObjectFactory.makeSymbol("S#9028", "CYC");
        $ic277$ = SubLObjectFactory.makeKeyword("TEST");
        $ic278$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic279$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic280$ = SubLObjectFactory.makeKeyword("CLASSES");
        $ic281$ = SubLObjectFactory.makeKeyword("KB");
        $ic282$ = SubLObjectFactory.makeKeyword("TINY");
        $ic283$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic284$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("postgresql")), (SubLObject)SubLObjectFactory.makeString("jdbc:postgresql://dbms-server.cyc.com:5432/testdatabase?user=theuser&password=thepassword&charSet=ASCII")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("mysql")), (SubLObject)SubLObjectFactory.makeString("jdbc:mysql://dbms-server.cyc.com:3306/testdatabase?user=theuser&password=thepassword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("oracle")), (SubLObject)SubLObjectFactory.makeString("jdbc:oracle:thin:theuser/thepassword@//dbms-server.cyc.com:1521/testdatabase")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("microsoft-sqlserver")), (SubLObject)SubLObjectFactory.makeString("jdbc:microsoft:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("sqlserver")), (SubLObject)SubLObjectFactory.makeString("jdbc:sqlserver://dbms-server.cyc.com:1433;DatabaseName=testdatabase;SelectMethod=cursor;USER=theuser;PASSWORD=thepassword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("odbc")), (SubLObject)SubLObjectFactory.makeString("jdbc:odbc:testdatabase;UID=theuser;PWD=thepassword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("sybase")), (SubLObject)SubLObjectFactory.makeString("jdbc:jtds:sybase://dbms-server.cyc.com:2048/testdatabase;USER=theuser;PASSWORD=thepassword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("db2")), (SubLObject)SubLObjectFactory.makeString("jdbc:db2://dbms-server.cyc.com:50001/TESTDATABASE:user=theuser;password=thepassword;")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)module0099.NIL, (SubLObject)module0099.NIL, (SubLObject)SubLObjectFactory.makeString("derby")), (SubLObject)SubLObjectFactory.makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)module0099.NIL, (SubLObject)module0099.NIL, (SubLObject)SubLObjectFactory.makeString("com.cyc.project.mysentient.query.webScraper.Ents24SKSI")), (SubLObject)SubLObjectFactory.makeString("jdbc:com.cyc.project.mysentient.query.webScraper.Ents24SKSI:testdatabase")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("derby")), (SubLObject)SubLObjectFactory.makeString("jdbc:derby://dbms-server.cyc.com:1527/testdatabase;user=theuser;password=thepassword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("derby"), (SubLObject)SubLObjectFactory.makeInteger(15270)), (SubLObject)SubLObjectFactory.makeString("jdbc:derby://dbms-server.cyc.com:15270/testdatabase;user=theuser;password=thepassword")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("testdatabase"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("db2"), (SubLObject)SubLObjectFactory.makeInteger(6501)), (SubLObject)SubLObjectFactory.makeString("jdbc:db2://dbms-server.cyc.com:6501/TESTDATABASE:user=theuser;password=thepassword;")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("dbms-server.cyc.com"), (SubLObject)SubLObjectFactory.makeString("iq-demo"), (SubLObject)SubLObjectFactory.makeString("theuser"), (SubLObject)SubLObjectFactory.makeString("thepassword"), (SubLObject)SubLObjectFactory.makeString("sybase-iq")), (SubLObject)SubLObjectFactory.makeString("jdbc:sybase:Tds:dbms-server.cyc.com:2638?ServiceName=iq-demo&USER=theuser&PASSWORD=thepassword")) });
        $ic285$ = SubLObjectFactory.makeSymbol("S#9123", "CYC");
        $ic286$ = SubLObjectFactory.makeSymbol("CONSP");
        $ic287$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic288$ = SubLObjectFactory.makeKeyword("DEFAULTS");
        $ic289$ = SubLObjectFactory.makeKeyword("PATTERN");
        $ic290$ = SubLObjectFactory.makeKeyword("OPTION-PUNCTUATION");
        $ic291$ = SubLObjectFactory.makeKeyword("OPTION-NAMES");
        $ic292$ = SubLObjectFactory.makeSymbol("GET-ALL-SDBC-DATABASE-SUB-PROTOCOLS");
        $ic293$ = SubLObjectFactory.makeKeyword("UNDEFINED");
        $ic294$ = SubLObjectFactory.makeKeyword("TERMINATOR");
        $ic295$ = SubLObjectFactory.makeKeyword("SEPARATOR");
        $ic296$ = SubLObjectFactory.makeString("Separator must be defined as string, not ~A.");
        $ic297$ = SubLObjectFactory.makeKeyword("VALUE");
        $ic298$ = SubLObjectFactory.makeString("Value demarcator must be specified as string, not ~A.");
        $ic299$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#9141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9142", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9143", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("S#9144", "CYC"));
        $ic300$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), (SubLObject)SubLObjectFactory.makeKeyword("PATTERN"), (SubLObject)SubLObjectFactory.makeKeyword("OPTION-NAMES"), (SubLObject)SubLObjectFactory.makeKeyword("OPTION-PUNCTUATION"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULTS"));
        $ic301$ = SubLObjectFactory.makeSymbol("S#9029", "CYC");
        $ic302$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("DATABASE") });
        $ic303$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeString("user"), (SubLObject)SubLObjectFactory.makeKeyword("PASSWORD"), (SubLObject)SubLObjectFactory.makeString("password"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR-SET"), (SubLObject)SubLObjectFactory.makeString("charSet"));
        $ic304$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeString("?"), (SubLObject)SubLObjectFactory.makeKeyword("SEPARATOR"), (SubLObject)SubLObjectFactory.makeString("&"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("="));
        $ic305$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeInteger(5432), (SubLObject)SubLObjectFactory.makeKeyword("CHAR-SET"), (SubLObject)SubLObjectFactory.makeString("ASCII"));
        $ic306$ = SubLObjectFactory.makeString("mysql");
        $ic307$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeString("user"), (SubLObject)SubLObjectFactory.makeKeyword("PASSWORD"), (SubLObject)SubLObjectFactory.makeString("password"));
        $ic308$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeInteger(3306));
        $ic309$ = SubLObjectFactory.makeString("oracle");
        $ic310$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString(":thin:"), SubLObjectFactory.makeKeyword("USER"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("PASSWORD"), SubLObjectFactory.makeString("@//"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("DATABASE") });
        $ic311$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeInteger(1521));
        $ic312$ = SubLObjectFactory.makeString("sqlserver");
        $ic313$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), (SubLObject)SubLObjectFactory.makeString("://"), (SubLObject)SubLObjectFactory.makeKeyword("DBMS-SERVER"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"));
        $ic314$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATABASE"), (SubLObject)SubLObjectFactory.makeString("DatabaseName"), (SubLObject)SubLObjectFactory.makeKeyword("SELECT-METHOD"), (SubLObject)SubLObjectFactory.makeString("SelectMethod"), (SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeString("USER"), (SubLObject)SubLObjectFactory.makeKeyword("PASSWORD"), (SubLObject)SubLObjectFactory.makeString("PASSWORD"));
        $ic315$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("SEPARATOR"), (SubLObject)SubLObjectFactory.makeKeyword("SEPARATOR"), (SubLObject)SubLObjectFactory.makeString(";"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("="));
        $ic316$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeInteger(1433), (SubLObject)SubLObjectFactory.makeKeyword("SELECT-METHOD"), (SubLObject)SubLObjectFactory.makeString("cursor"));
        $ic317$ = SubLObjectFactory.makeString("microsoft-sqlserver");
        $ic318$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"), (SubLObject)SubLObjectFactory.makeString(":microsoft:"), (SubLObject)SubLObjectFactory.makeString("sqlserver"), (SubLObject)SubLObjectFactory.makeString("://"), (SubLObject)SubLObjectFactory.makeKeyword("DBMS-SERVER"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"));
        $ic319$ = SubLObjectFactory.makeString("odbc");
        $ic320$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeKeyword("DATABASE"));
        $ic321$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeString("UID"), (SubLObject)SubLObjectFactory.makeKeyword("PASSWORD"), (SubLObject)SubLObjectFactory.makeString("PWD"));
        $ic322$ = SubLObjectFactory.makeString("sybase");
        $ic323$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":jtds:"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), SubLObjectFactory.makeKeyword("DATABASE") });
        $ic324$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeString("USER"), (SubLObject)SubLObjectFactory.makeKeyword("PASSWORD"), (SubLObject)SubLObjectFactory.makeString("PASSWORD"));
        $ic325$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeInteger(2048));
        $ic326$ = SubLObjectFactory.makeString("derby");
        $ic327$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeInteger(1527));
        $ic328$ = SubLObjectFactory.makeString("st");
        $ic329$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER"), (SubLObject)SubLObjectFactory.makeString("userName"), (SubLObject)SubLObjectFactory.makeKeyword("PASSWORD"), (SubLObject)SubLObjectFactory.makeString("passWord"), (SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeString("format"));
        $ic330$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeInteger(8084), (SubLObject)SubLObjectFactory.makeKeyword("FORMAT"), (SubLObject)SubLObjectFactory.makeString("xhtml"));
        $ic331$ = SubLObjectFactory.makeSymbol("*SDBC-DB2-PORT*");
        $ic332$ = SubLObjectFactory.makeInteger(50001);
        $ic333$ = SubLObjectFactory.makeSymbol("SET-SDBC-DB2-PORT");
        $ic334$ = SubLObjectFactory.makeString("db2");
        $ic335$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROTOCOL"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("SUB-PROTOCOL"), SubLObjectFactory.makeString("://"), SubLObjectFactory.makeKeyword("DBMS-SERVER"), SubLObjectFactory.makeString(":"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeString("/"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UPCASE"), (SubLObject)SubLObjectFactory.makeKeyword("DATABASE")) });
        $ic336$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeKeyword("SEPARATOR"), (SubLObject)SubLObjectFactory.makeString(";"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("="), (SubLObject)SubLObjectFactory.makeKeyword("TERMINATOR"), (SubLObject)SubLObjectFactory.makeString(";"));
        $ic337$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("*SDBC-DB2-PORT*"));
        $ic338$ = SubLObjectFactory.makeSymbol("*SDBC-SYBASE-IQ-PORT*");
        $ic339$ = SubLObjectFactory.makeInteger(2638);
        $ic340$ = SubLObjectFactory.makeSymbol("SET-SDBC-SYBASE-IQ-PORT");
        $ic341$ = SubLObjectFactory.makeString("sybase-iq");
        $ic342$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"), (SubLObject)SubLObjectFactory.makeString(":sybase:Tds:"), (SubLObject)SubLObjectFactory.makeKeyword("DBMS-SERVER"), (SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeString("?ServiceName="), (SubLObject)SubLObjectFactory.makeKeyword("DATABASE"));
        $ic343$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("SEPARATOR"), (SubLObject)SubLObjectFactory.makeKeyword("SEPARATOR"), (SubLObject)SubLObjectFactory.makeString("&"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("="));
        $ic344$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("*SDBC-SYBASE-IQ-PORT*"));
        $ic345$ = SubLObjectFactory.makeString("unknown jdbc subprotocol: ~a");
        $ic346$ = SubLObjectFactory.makeKeyword("PROTOCOL");
        $ic347$ = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $ic348$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9145", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#143", "CYC"));
        $ic349$ = SubLObjectFactory.makeKeyword("UPCASE");
        $ic350$ = SubLObjectFactory.makeString("Functor ~A not implemented yet.");
        $ic351$ = SubLObjectFactory.makeString("Pattern ~S contains ~S, which is neither STRINGP nor KEYWORDP");
        $ic352$ = SubLObjectFactory.makeString("Element ~A is neither a STRINGP nor a KEYWORD.");
        $ic353$ = SubLObjectFactory.makeString("No value provided for ~S in either properties ~S or defaults ~S.");
        $ic354$ = SubLObjectFactory.makeInteger("-2147483649");
        $ic355$ = SubLObjectFactory.makeInteger("2147483648");
        $ic356$ = SubLObjectFactory.makeInteger("-9223372036854775809");
        $ic357$ = SubLObjectFactory.makeInteger("9223372036854775808");
        $ic358$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#9136", "CYC"), SubLObjectFactory.makeSymbol("S#9125", "CYC"), SubLObjectFactory.makeSymbol("S#9126", "CYC"), SubLObjectFactory.makeSymbol("S#9146", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9058", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9060", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9130", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9062", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#59", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9063", "CYC"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic359$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DBMS-SERVER"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("SUBPROTOCOL"), (SubLObject)SubLObjectFactory.makeKeyword("PROXY-SERVER"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"));
        $ic360$ = SubLObjectFactory.makeSymbol("S#9062", "CYC");
        $ic361$ = SubLObjectFactory.makeSymbol("S#9063", "CYC");
        $ic362$ = SubLObjectFactory.makeSymbol("CLET");
        $ic363$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic364$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic365$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic366$ = SubLObjectFactory.makeSymbol("S#8877", "CYC");
        $ic367$ = SubLObjectFactory.makeSymbol("LIST");
        $ic368$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic369$ = SubLObjectFactory.makeSymbol("S#8880", "CYC");
        $ic370$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#9147", "CYC"), SubLObjectFactory.makeSymbol("S#9125", "CYC"), SubLObjectFactory.makeSymbol("S#9126", "CYC"), SubLObjectFactory.makeSymbol("S#9146", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9058", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9060", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9130", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9062", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#59", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9063", "CYC"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic371$ = SubLObjectFactory.makeUninternedSymbol("US#7AFC06E");
        $ic372$ = SubLObjectFactory.makeSymbol("S#9043", "CYC");
        $ic373$ = SubLObjectFactory.makeSymbol("PIF");
        $ic374$ = SubLObjectFactory.makeSymbol("S#8881", "CYC");
        $ic375$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#9147", "CYC"), SubLObjectFactory.makeSymbol("S#9137", "CYC"), SubLObjectFactory.makeSymbol("S#9125", "CYC"), SubLObjectFactory.makeSymbol("S#9126", "CYC"), SubLObjectFactory.makeSymbol("S#9146", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9058", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9060", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9130", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9062", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#59", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9063", "CYC"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic376$ = SubLObjectFactory.makeUninternedSymbol("US#7AFC06E");
        $ic377$ = SubLObjectFactory.makeSymbol("S#8882", "CYC");
        $ic378$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9147", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic379$ = SubLObjectFactory.makeUninternedSymbol("US#7AFC06E");
        $ic380$ = SubLObjectFactory.makeUninternedSymbol("US#FE87D");
        $ic381$ = SubLObjectFactory.makeUninternedSymbol("US#147682");
        $ic382$ = SubLObjectFactory.makeUninternedSymbol("US#2CF2AA1");
        $ic383$ = SubLObjectFactory.makeUninternedSymbol("US#559872");
        $ic384$ = SubLObjectFactory.makeUninternedSymbol("US#55EC1D8");
        $ic385$ = SubLObjectFactory.makeSymbol("S#8884", "CYC");
        $ic386$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic387$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("THROW"));
        $ic388$ = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $ic389$ = SubLObjectFactory.makeSymbol("S#8883", "CYC");
        $ic390$ = ConsesLow.list((SubLObject)module0099.NIL);
        $ic391$ = SubLObjectFactory.makeSymbol("S#8885", "CYC");
        $ic392$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"));
        $ic393$ = SubLObjectFactory.makeSymbol("S#9047", "CYC");
        $ic394$ = SubLObjectFactory.makeSymbol("S#9048", "CYC");
        $ic395$ = ConsesLow.list((SubLObject)module0099.T);
        $ic396$ = SubLObjectFactory.makeSymbol("S#9049", "CYC");
        $ic397$ = SubLObjectFactory.makeString("An unknown error occurred during execution");
        $ic398$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#9147", "CYC"), SubLObjectFactory.makeSymbol("ERROR"), SubLObjectFactory.makeSymbol("S#9125", "CYC"), SubLObjectFactory.makeSymbol("S#9126", "CYC"), SubLObjectFactory.makeSymbol("S#9146", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9058", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9060", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9130", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9062", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#59", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9063", "CYC"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic399$ = SubLObjectFactory.makeSymbol("S#9044", "CYC");
        $ic400$ = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#9140", "CYC"), SubLObjectFactory.makeSymbol("S#9148", "CYC"), SubLObjectFactory.makeSymbol("S#9125", "CYC"), SubLObjectFactory.makeSymbol("S#9126", "CYC"), SubLObjectFactory.makeSymbol("S#9146", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9058", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#58", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9060", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9130", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9062", "CYC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9127", "CYC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#59", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#9063", "CYC"))) }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic401$ = SubLObjectFactory.makeUninternedSymbol("US#3E1F8A8");
        $ic402$ = SubLObjectFactory.makeSymbol("S#9140", "CYC");
        $ic403$ = SubLObjectFactory.makeSymbol("S#8989", "CYC");
        $ic404$ = SubLObjectFactory.makeSymbol("S#9051", "CYC");
        $ic405$ = SubLObjectFactory.makeSymbol("WHILE");
        $ic406$ = SubLObjectFactory.makeSymbol("S#8835", "CYC");
        $ic407$ = SubLObjectFactory.makeSymbol("OUTPUT-STREAM-P");
        $ic408$ = SubLObjectFactory.makeString("SELECT * FROM ");
        $ic409$ = ConsesLow.list((SubLObject)Characters.CHAR_period);
        $ic410$ = SubLObjectFactory.makeString("INSERT INTO ~a VALUES(?, ?)");
        $ic411$ = SubLObjectFactory.makeString("SELECT number2 FROM ~a WHERE number1 = ?");
        $ic412$ = SubLObjectFactory.makeString("CREATE TABLE ");
        $ic413$ = SubLObjectFactory.makeString(" (number1 INT PRIMARY KEY, number2 INT)");
        $ic414$ = SubLObjectFactory.makeString("validation failed for ~a: result ~a");
        $ic415$ = SubLObjectFactory.makeString("DROP TABLE ");
        $ic416$ = SubLObjectFactory.makeString("INSERT INTO ");
        $ic417$ = SubLObjectFactory.makeString(" VALUES(");
        $ic418$ = SubLObjectFactory.makeString(", ");
        $ic419$ = SubLObjectFactory.makeString(")");
        $ic420$ = SubLObjectFactory.makeString("SELECT number2 FROM ");
        $ic421$ = SubLObjectFactory.makeString(" WHERE number1 = ");
    }
    
    public static final class $sX8837_native extends SubLStructNative
    {
        public SubLObject $db;
        public SubLObject $user;
        public SubLObject $dbms_server;
        public SubLObject $port;
        public SubLObject $channel;
        public SubLObject $statements;
        public SubLObject $lock;
        public SubLObject $subprotocol;
        public SubLObject $proxy_server;
        public SubLObject $error_handling;
        public SubLObject $tickets;
        public SubLObject $mailman;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8837_native() {
            this.$db = (SubLObject)CommonSymbols.NIL;
            this.$user = (SubLObject)CommonSymbols.NIL;
            this.$dbms_server = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$channel = (SubLObject)CommonSymbols.NIL;
            this.$statements = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$subprotocol = (SubLObject)CommonSymbols.NIL;
            this.$proxy_server = (SubLObject)CommonSymbols.NIL;
            this.$error_handling = (SubLObject)CommonSymbols.NIL;
            this.$tickets = (SubLObject)CommonSymbols.NIL;
            this.$mailman = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8837_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$db;
        }
        
        public SubLObject getField3() {
            return this.$user;
        }
        
        public SubLObject getField4() {
            return this.$dbms_server;
        }
        
        public SubLObject getField5() {
            return this.$port;
        }
        
        public SubLObject getField6() {
            return this.$channel;
        }
        
        public SubLObject getField7() {
            return this.$statements;
        }
        
        public SubLObject getField8() {
            return this.$lock;
        }
        
        public SubLObject getField9() {
            return this.$subprotocol;
        }
        
        public SubLObject getField10() {
            return this.$proxy_server;
        }
        
        public SubLObject getField11() {
            return this.$error_handling;
        }
        
        public SubLObject getField12() {
            return this.$tickets;
        }
        
        public SubLObject getField13() {
            return this.$mailman;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$db = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$user = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$dbms_server = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$port = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$channel = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$statements = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$subprotocol = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$proxy_server = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$error_handling = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$tickets = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$mailman = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8837_native.class, module0099.$ic37$, module0099.$ic38$, module0099.$ic39$, module0099.$ic40$, new String[] { "$db", "$user", "$dbms_server", "$port", "$channel", "$statements", "$lock", "$subprotocol", "$proxy_server", "$error_handling", "$tickets", "$mailman" }, module0099.$ic41$, module0099.$ic42$, module0099.$ic43$);
        }
    }
    
    public static final class $f7029$UnaryFunction extends UnaryFunction
    {
        public $f7029$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8838"));
        }
        
        public SubLObject processItem(final SubLObject var17) {
            return module0099.f7029(var17);
        }
    }
    
    public static final class $sX8839_native extends SubLStructNative
    {
        public SubLObject $semaphore;
        public SubLObject $result;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8839_native() {
            this.$semaphore = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8839_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$semaphore;
        }
        
        public SubLObject getField3() {
            return this.$result;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$semaphore = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$result = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8839_native.class, module0099.$ic109$, module0099.$ic110$, module0099.$ic111$, module0099.$ic112$, new String[] { "$semaphore", "$result" }, module0099.$ic113$, module0099.$ic114$, module0099.$ic115$);
        }
    }
    
    public static final class $f7082$UnaryFunction extends UnaryFunction
    {
        public $f7082$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8840"));
        }
        
        public SubLObject processItem(final SubLObject var17) {
            return module0099.f7082(var17);
        }
    }
    
    public static final class $sX8841_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $message;
        public SubLObject $code;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8841_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$message = (SubLObject)CommonSymbols.NIL;
            this.$code = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8841_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type;
        }
        
        public SubLObject getField3() {
            return this.$message;
        }
        
        public SubLObject getField4() {
            return this.$code;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$message = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$code = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8841_native.class, module0099.$ic142$, module0099.$ic143$, module0099.$ic144$, module0099.$ic145$, new String[] { "$type", "$message", "$code" }, module0099.$ic146$, module0099.$ic147$, module0099.$ic148$);
        }
    }
    
    public static final class $f7065$UnaryFunction extends UnaryFunction
    {
        public $f7065$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8842"));
        }
        
        public SubLObject processItem(final SubLObject var17) {
            return module0099.f7065(var17);
        }
    }
    
    public static final class $sX8843_native extends SubLStructNative
    {
        public SubLObject $rows;
        public SubLObject $current;
        public SubLObject $last;
        public SubLObject $start;
        public SubLObject $connection;
        public SubLObject $block_size;
        public SubLObject $id;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8843_native() {
            this.$rows = (SubLObject)CommonSymbols.NIL;
            this.$current = (SubLObject)CommonSymbols.NIL;
            this.$last = (SubLObject)CommonSymbols.NIL;
            this.$start = (SubLObject)CommonSymbols.NIL;
            this.$connection = (SubLObject)CommonSymbols.NIL;
            this.$block_size = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8843_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$rows;
        }
        
        public SubLObject getField3() {
            return this.$current;
        }
        
        public SubLObject getField4() {
            return this.$last;
        }
        
        public SubLObject getField5() {
            return this.$start;
        }
        
        public SubLObject getField6() {
            return this.$connection;
        }
        
        public SubLObject getField7() {
            return this.$block_size;
        }
        
        public SubLObject getField8() {
            return this.$id;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$rows = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$current = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$last = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$start = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$connection = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$block_size = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$id = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8843_native.class, module0099.$ic174$, module0099.$ic175$, module0099.$ic176$, module0099.$ic177$, new String[] { "$rows", "$current", "$last", "$start", "$connection", "$block_size", "$id" }, module0099.$ic178$, module0099.$ic179$, module0099.$ic180$);
        }
    }
    
    public static final class $f7126$UnaryFunction extends UnaryFunction
    {
        public $f7126$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8832"));
        }
        
        public SubLObject processItem(final SubLObject var17) {
            return module0099.f7126(var17);
        }
    }
    
    public static final class $sX8844_native extends SubLStructNative
    {
        public SubLObject $connection;
        public SubLObject $id;
        public SubLObject $sql;
        public SubLObject $settings;
        public SubLObject $batch;
        public SubLObject $rs;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8844_native() {
            this.$connection = (SubLObject)CommonSymbols.NIL;
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$sql = (SubLObject)CommonSymbols.NIL;
            this.$settings = (SubLObject)CommonSymbols.NIL;
            this.$batch = (SubLObject)CommonSymbols.NIL;
            this.$rs = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8844_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$connection;
        }
        
        public SubLObject getField3() {
            return this.$id;
        }
        
        public SubLObject getField4() {
            return this.$sql;
        }
        
        public SubLObject getField5() {
            return this.$settings;
        }
        
        public SubLObject getField6() {
            return this.$batch;
        }
        
        public SubLObject getField7() {
            return this.$rs;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$connection = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sql = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$settings = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$batch = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$rs = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8844_native.class, module0099.$ic221$, module0099.$ic222$, module0099.$ic223$, module0099.$ic224$, new String[] { "$connection", "$id", "$sql", "$settings", "$batch", "$rs" }, module0099.$ic225$, module0099.$ic226$, module0099.$ic115$);
        }
    }
    
    public static final class $f7071$UnaryFunction extends UnaryFunction
    {
        public $f7071$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#8845"));
        }
        
        public SubLObject processItem(final SubLObject var17) {
            return module0099.f7071(var17);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0099.class
	Total time: 1847 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/